package com.babel17.naive

import scala.collection.immutable.SortedSet
import scala.collection.immutable.SortedMap

object Values {

  val MESSAGE_APPLY = "apply"
  val MESSAGE_REPRESENTATIVE = "representative"
  val MESSAGE_PLUS = "plus"
  val MESSAGE_MINUS = "minus"
  val MESSAGE_UMINUS = "uminus"
  val MESSAGE_TIMES = "times"
  val MESSAGE_DIV = "div"
  val MESSAGE_MOD = "mod"
  val MESSAGE_POW = "pow"
  val MESSAGE_PLUSPLUS = "plusplus"
  val MESSAGE_MINUSMINUS = "minusminus"
  val MESSAGE_TIMESTIMES = "timestimes"
  val MESSAGE_TO = "to"
  val MESSAGE_DOWNTO = "downto"
  val MESSAGE_TOSTRING = "tostring"
  
  val CONSTRUCTOR_DOMAINERROR = "DOMAINERROR"
  val CONSTRUCTOR_INVALIDMESSAGE = "INVALIDMESSAGE"
  val CONSTRUCTOR_TYPEERROR = "TYPEERROR"
  val CONSTRUCTOR_NOMATCH = "NOMATCH"
  val CONSTRUCTOR_APPLYERROR = "APPLYERROR"
  
  abstract class Value {
    def sendMessage(message : Program.Message) : Value = {
      message.m match {
        case MESSAGE_TOSTRING =>
          StringValue(toString())
        case _ => null
      }
    }
    def hasMessage(message : Program.Message) : Boolean = {
      sendMessage(message) != null     
    }
    
    // this returns either a dynamic exception or a function value
    def extractFunctionValue() : Value = {
      val f = sendMessage(Program.Message(MESSAGE_APPLY))
      if (f == null) dynamicException(CONSTRUCTOR_APPLYERROR)
      else if (f.isInstanceOf[FunctionValue] || f.isDynamicException()) f
      else dynamicException(CONSTRUCTOR_APPLYERROR)
    }
    def force() : Value = {
      this
    }
    override def toString() : String = {
      "<Value>"
    }
    def isDynamicException() : Boolean = {
      this match {
        case ExceptionValue(true, _) => true
        case _ => false
      }
    }
    def asDynamicException() : ExceptionValue = {
      if (isDynamicException()) this.asInstanceOf[ExceptionValue]
      else null
    }
  }
  
  case class IntegerValue(v : BigInt) extends Value {
    override def toString() : String = {
      v.toString()
    }
    override def sendMessage(message : Program.Message) : Value = {
      message.m match {
        case MESSAGE_PLUS => NativeFunctionValue(plus _)
        case MESSAGE_MINUS => NativeFunctionValue(minus _)
        case MESSAGE_UMINUS => IntegerValue(-v)
        case MESSAGE_TIMES => NativeFunctionValue(times _)
        case MESSAGE_POW => NativeFunctionValue(pow _)
        case MESSAGE_DIV => NativeFunctionValue(div _)
        case MESSAGE_MOD => NativeFunctionValue(mod _)
        case _ => super.sendMessage(message)
      }
      
    }
    def plus(w : Value) : Value = {
      w match {
        case IntegerValue(w) =>
          IntegerValue(v + w)
        case InfinityValue(positive) => InfinityValue(positive)
        case _ => null
      }
    }
    def minus(w : Value) : Value = {
      w match {
        case IntegerValue(w) => IntegerValue(v - w)
        case InfinityValue(positive) => InfinityValue(!positive)
        case _ => null
      }
    }
    def times(w : Value) : Value = {
      w match {
        case IntegerValue(w) => IntegerValue(v * w)
        case InfinityValue(positive) =>
          if (v == 0) null
          else if (v > 0) InfinityValue(positive)
          else InfinityValue(!positive)
        case _ => null
      }
    }
    def pow(w : Value) : Value = {
      w match {
        case IntegerValue(w) => 
          if (w < 0) null 
          else if (v == 0) {
            if (w == 0) null
            else IntegerValue(1)
          } else IntegerValue(intpow(w))
        case InfinityValue(positive) =>
          if (positive && v > 1) InfinityValue(positive)
          else if (positive && v == 1) IntegerValue(1)
          else null          
        case _ => null
      }
    }
    def intpow(w : BigInt) : BigInt = {
      if (w == 0) 1
      else if (w == 1) v
      else {
        val x = intpow(w / 2)
        if (w % 2 == 0) x * x
        else x * x * v
      }
    } 
    def div(w : Value) : Value = {
      w match {
        case IntegerValue(w) => 
          if (w == 0) null
          else IntegerValue(euclid(v, w)._1)
        case _ => null
      }      
    }
    def mod(w : Value) : Value = {
      w match {
        case IntegerValue(w) =>
          if (w == 0) null
          else IntegerValue(euclid(v, w)._2)
        case _ => null
      }
    }

    def euclid(D : BigInt, d : BigInt) : (BigInt, BigInt) = {
      var q : BigInt = D / d
      var r : BigInt = D % d
      if (r < 0) {
        if (d > 0) {
          q = q - 1
          r = r + d
        } else {
          q = q + 1
          r = r - d
        }
      }
      (q, r)
    }        
  }
  
  abstract class FunctionValue extends Value {
    def apply(v : Value) : Value
  }
    
  case class NativeFunctionValue(native : Function[Value, Value]) extends FunctionValue {    
    override def sendMessage(message : Program.Message) : Value = {
      message.m match {
        case MESSAGE_APPLY => this
        case _ => super.sendMessage(message)
      }      
    }
    override def apply(v : Value) : Value = {
      val x = native(v.force())
      if (x == null) dynamicException(CONSTRUCTOR_DOMAINERROR)
      else x
    }
    override def toString() : String = {
      "<NativeFunction>"
    }
  }
  
  case class InfinityValue(positive : Boolean) extends Value {
    override def toString() : String = {
      if (positive) "\u221E" else "-\u221E"
    }
    override def sendMessage(message : Program.Message) : Value = {
      message.m match {
        case MESSAGE_PLUS => NativeFunctionValue(plus _)
        case MESSAGE_MINUS => NativeFunctionValue(minus _)
        case MESSAGE_UMINUS => InfinityValue(!positive)
        case MESSAGE_TIMES => NativeFunctionValue(times _)
        case MESSAGE_POW => NativeFunctionValue(pow _)
        case _ => super.sendMessage(message)
      }
      
    }
    def plus(w : Value) : Value = {
      w match {
        case InfinityValue(positive2) =>
          if (positive == positive2) InfinityValue(positive)
          else null
        case _ : IntegerValue => InfinityValue(positive)
        case _ => null
      }
    }
    def minus(w : Value) : Value = {
      w match {
        case InfinityValue(positive2) => 
          if (positive != positive2) InfinityValue(positive)
          else null
        case _ : IntegerValue => InfinityValue(positive)
        case _ => null
      }
    }
    def times(w : Value) : Value = {
      w match {
        case IntegerValue(w) => 
          if (w == 0) null
          else InfinityValue(positive == (w > 0))
        case InfinityValue(positive2) => InfinityValue(positive == positive2)
        case _ => null
      }
    }
    def pow(w : Value) : Value = {
      w match {
        case IntegerValue(w) => 
          if (w <= 0) null 
          else if (positive) InfinityValue(positive)
          else InfinityValue(w % 2 == 0)
        case InfinityValue(positive2) =>
          if (positive && positive2) InfinityValue(positive)
          else null
        case _ => null
      }
    }
  }
  
  case class StringValue(v : String) extends Value {
    override def toString() : String = {
      v
    }
    override def sendMessage(message : Program.Message) : Value = {
      message.m match {
        case MESSAGE_PLUS => NativeFunctionValue(plus _)
        case _ => super.sendMessage(message)
      }      
    }
    def plus(w : Value) : Value = {
      StringValue(v + w.toString())
    }    
  }
  
  case class BooleanValue(v : Boolean) extends Value {
    override def toString() : String = {
      if (v) "true" else "false"
    }        
  }  
  
  case class ConstructorValue(constr : Program.Constr, v : Value) extends Value {
    override def toString() : String = {
      constr.name + " ("+ v.toString()+")"
    }    
  }
  
  case class ObjectValue(messages : SortedMap[Program.Message, Value]) extends Value {   
    override def toString() : String = {
      if (messages.size == 0) "nil" else "<Object>"
    }    
  }
  
  case class ExceptionValue(dynamic : Boolean, v : Value) extends Value {
    override def toString() : String = {
      "exception ("+v+")"
    }        
  }

  abstract class CollectorValue extends Value {
    def collect_close () : Value = {
      throw Evaluator.EvalX("collect_close not implemented in "+this.getClass)
    }
    // returns either dynamic exception or CollectorValue
    def collect_add (v : Value) : Value = {
      throw Evaluator.EvalX("collect_add not implemented in "+this.getClass)
    }
    
  }
  
  def collectorValue(v : Value) : CollectorValue = {
    v.force() match {
      case c : CollectorValue => c
      case c => CustomCollectorValue(c)
    }
  }
  
  class DefaultCollectorValue extends CollectorValue {    
    import scala.collection.mutable.ArrayBuffer
    val buffer : ArrayBuffer[Value] = new ArrayBuffer(15)
    override def collect_close () : Value = {
      if (buffer.size == 1) buffer(0)
      else VectorValue(buffer.toArray)
    }
    override def collect_add(v : Value) : Value = {
      buffer + v
      this
    }
  }
  
  case class CustomCollectorValue(v : Value) extends CollectorValue {    
  }
  
  abstract class ListValue extends CollectorValue {
  }
  
  case class EmptyListValue() extends ListValue {    
  }
  
  case class ConsListValue(head : Value, tail : Value) extends ListValue {
  }
  
  case class VectorValue(tuple : Array[Value]) extends CollectorValue {   
    override def toString() : String = {
      val size = tuple.size
      if (size == 0) "()"
      else if (size == 1) "("+tuple(0)+",)"
      else {
        var s = "("+tuple(0)
        var i = 1
        while (i < size) {
          s = s + ", " + tuple(i)
          i = i + 1
        }
        s + ")"       
      }
    }
  }
  
  case class SetValue(set : SortedSet[Value]) extends CollectorValue {  
  }
  
  case class MapValue(map : SortedMap[Value, Value]) extends CollectorValue {    
  }
  
  val nil : Value = ObjectValue(SortedMap.empty)
  
  def dynamicException(constructorName : String) : ExceptionValue = {
    ExceptionValue(true, ConstructorValue(Program.Constr(constructorName), nil))
  }

}
