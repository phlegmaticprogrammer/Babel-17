package com.babel17.naive

import scala.collection.immutable.SortedSet
import scala.collection.immutable.SortedMap

object Values {

  val MESSAGE_APPLY = "apply_"
  val MESSAGE_REPRESENTATIVE = "rank_"
  val MESSAGE_PLUS = "plus_"
  val MESSAGE_MINUS = "minus_"
  val MESSAGE_UMINUS = "uminus_"
  val MESSAGE_TIMES = "times_"
  val MESSAGE_QUOTIENT = "quotient_"
  val MESSAGE_DIV = "div_"
  val MESSAGE_MOD = "mod_"
  val MESSAGE_POW = "pow_"
  val MESSAGE_PLUSPLUS = "plus__"
  val MESSAGE_MINUSMINUS = "minus__"
  val MESSAGE_TIMESTIMES = "times__"
  val MESSAGE_QUOTIENTQUOTIENT = "quotient__"
  val MESSAGE_TO = "to_"
  val MESSAGE_DOWNTO = "downto_"
  val MESSAGE_TOSTRING = "tostring_"
  
  val CONSTRUCTOR_DOMAINERROR = "DOMAINERROR"
  val CONSTRUCTOR_EMPTYCHOICE = "EMPTYCHOICE"  
  val CONSTRUCTOR_INVALIDMESSAGE = "INVALIDMESSAGE"
  val CONSTRUCTOR_TYPEERROR = "TYPEERROR"
  val CONSTRUCTOR_NOMATCH = "NOMATCH"
  val CONSTRUCTOR_APPLYERROR = "APPLYERROR"
  val CONSTRUCTOR_INVALIDLIST = "INVALIDLIST"
  val CONSTRUCTOR_UNRELATED = "UNRELATED"
  
  abstract class Value {
    // sending an object a message always forces it
    def sendMessage(message : Program.Message) : Value;

    def hasMessage(message : Program.Message) : Boolean = {
      sendMessage(message) != null     
    }
    
    // this returns either a dynamic exception or a FunctionValue
    def extractFunctionValue() : Value = {
      if (isDynamicException()) return this
      val f = sendMessage(Program.Message(MESSAGE_APPLY))
      if (f == null) dynamicException(CONSTRUCTOR_APPLYERROR)
      else if (f.isInstanceOf[FunctionValue] || f.isDynamicException()) f
      else dynamicException(CONSTRUCTOR_APPLYERROR)
    }
    
    // this returns either an ObjectValue without a "representative" message or something that is
    // a) not an ObjectValue b) forced c) not a persistent exception
    def extractRepresentative() : Value = {
      var f = this
      var oldf = f
      while (f != null) {
        if  (f.isDynamicException()) return f
        oldf = f
        f = f.sendMessage(Program.Message(MESSAGE_REPRESENTATIVE))
      }
      oldf = oldf.force()
      oldf match {
        case ExceptionValue(false, p) => ExceptionValue(true, p)
        case _ => oldf
      }
    }
    
    def choose() : Value = {
      dynamicException(CONSTRUCTOR_DOMAINERROR)
    }
    
    def force() : Value = {
      this
    }
    
    def forceDeep() : Value = {
      this
    }
        
    def toStringValue() : StringValue = {
      return StringValue(toString())
    }
    
    def toCodeString() : String = {
      return toString()
    }   
    
    def isDynamicException() : Boolean = {
      this match {
        case ExceptionValue(true, _) => true
        case _ => false
      }
    }
    
    def isException() : Boolean = {
      this match {
        case _ : ExceptionValue => true
        case _ => false
      }
    }
    
    def asDynamicException() : ExceptionValue = {
      this match {
        case ExceptionValue(b, p) => ExceptionValue(true, p)
        case _ => throw Evaluator.EvalX("this is not an exception, cannot make dynamic")
      }
    }

    
 /*   def asDynamicException() : ExceptionValue = {
      if (isDynamicException()) this.asInstanceOf[ExceptionValue]
      else null
    }    */
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
        case MESSAGE_TOSTRING => toStringValue()
        case _ => null
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
        case MESSAGE_TOSTRING => toStringValue()
        case _ => null
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

  case class ClosureValue(evaluator : Evaluator, env : Evaluator.SimpleEnvironment,
                           branches : List[(Program.Pattern, Program.Expression)]) extends FunctionValue
  {
    override def sendMessage(message : Program.Message) : Value = {
      message.m match {
        case MESSAGE_APPLY => this
        case MESSAGE_TOSTRING => toStringValue()
        case _ => null
      }
    }
    override def apply(v : Value) : Value = {
      val e = env.thaw
      for ((p, body) <- branches) {
        evaluator.matchPattern(e, p, v, false )  match {
          case Evaluator.NoMatch() =>
          case Evaluator.DoesMatch(newEnv) =>
            return evaluator.evalExpression(newEnv, body)
          case Evaluator.MatchException(x) => return x.asDynamicException
        }
      }
      return domainError()
    }
    override def toString() : String = {
      "<Closure>"
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
        case MESSAGE_TOSTRING => toStringValue()
        case _ => null
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
      return "\""+v+"\"";
    }
    override def toStringValue() : StringValue = {
      return this;
    }
    override def sendMessage(message : Program.Message) : Value = {
      message.m match {
        case MESSAGE_PLUS => NativeFunctionValue(plus _)
        case MESSAGE_TOSTRING => toStringValue()
        case _ => null
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
    override def sendMessage(message : Program.Message) : Value = {
      message.m match {
        case MESSAGE_TOSTRING => toStringValue()
        case _ => null
      }      
    }
  }  
  
  case class ConstructorValue(constr : Program.Constr, v : Value) extends Value {
    override def toString() : String = {
      constr.name + " ("+ v.toString()+")"
    }    
    override def sendMessage(message : Program.Message) : Value = {
      message.m match {
        case MESSAGE_TOSTRING => toStringValue()
        case _ => null
      }      
    }
    override def forceDeep() : Value = {
      ConstructorValue(constr, v.forceDeep())
    }

  }
  
  case class ObjectValue(messages : SortedMap[Program.Message, Value]) extends Value {   
    override def toString() : String = {
      if (messages.size == 0) "nil" else "<object>"
    }    
    override def sendMessage(message : Program.Message) : Value = {
      messages.get(message) match {
        case Some(v) => v          
        case None => 
          message.m match {
            case MESSAGE_TOSTRING => toStringValue()
            case _ => null
          }
      }
    }
    override def forceDeep() : Value = {
      var s : SortedMap[Program.Message, Value] = SortedMap.empty
      for ((k,v) <- messages) {
        s = s + (k -> v.forceDeep())
      }
      ObjectValue(s)
    }
  }
  
  case class ExceptionValue(dynamic : Boolean, v : Value) extends Value {
    override def toString() : String = {
      if (dynamic)
        "DynamicException ("+v+")"
      else
        "PersistentException ("+v+")"
    }        
    override def sendMessage(message : Program.Message) : Value = {
      message.m match {
        case MESSAGE_TOSTRING => toStringValue()
        case _ => null
      }      
    }
    override def forceDeep() : Value = {
      ExceptionValue(dynamic, v.forceDeep())
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
    override def sendMessage(message : Program.Message) : Value = {
      message.m match {
        case MESSAGE_TOSTRING => toStringValue()
        case _ => null
      }      
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
    override def toString() : String = {
      return "[]";
    }
    override def sendMessage(message : Program.Message) : Value = {
      message.m match {
        case MESSAGE_TOSTRING => toStringValue()
        case _ => null
      }      
    }
    override def choose() : Value = {
      dynamicException(CONSTRUCTOR_EMPTYCHOICE)
    }
  }
  
  case class ConsListValue(head : Value, tail : Value) extends ListValue {
    override def toString() : String = {
      return "("+ head + "::" +tail+")";
    }
    override def sendMessage(message : Program.Message) : Value = {
      message.m match {
        case MESSAGE_TOSTRING => toStringValue()
        case _ => null
      }      
    }
    override def forceDeep() : Value = {
      ConsListValue(head.forceDeep(), tail.forceDeep())
    }
    override def choose() : Value = {
      head
    }
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
    override def sendMessage(message : Program.Message) : Value = {
      message.m match {
        case MESSAGE_TOSTRING => toStringValue()
        case _ => null
      }      
    }
    override def forceDeep() : Value = {
      val size = tuple.size
      val tuple2 : Array[Value] = new Array(size)
      var i = 0
      while (i < size) {
        tuple2(i) = tuple(i).forceDeep()
        i = i + 1
      }
      VectorValue(tuple2)      
    }
    override def choose() : Value = {
      if (tuple.size == 0) dynamicException(CONSTRUCTOR_EMPTYCHOICE)
      else tuple(0)
    }    
  }
  
  case class SetValue(set : SortedSet[Value]) extends CollectorValue {  
    override def sendMessage(message : Program.Message) : Value = {
      message.m match {
        case MESSAGE_TOSTRING => toStringValue()
        case _ => null
      }      
    }
    override def choose() : Value = {
      if (set.size == 0) dynamicException(CONSTRUCTOR_EMPTYCHOICE)
      else set.firstKey
    }    
    override def forceDeep() : Value = {
      var s : SortedSet[Value] = SortedSet.empty(set.ordering)
      for (v <- set) {
        s = s + v.forceDeep()
      }
      SetValue(s)
    }
  }
  
  case class MapValue(map : SortedMap[Value, Value]) extends CollectorValue {    
    override def sendMessage(message : Program.Message) : Value = {
      message.m match {
        case MESSAGE_TOSTRING => toStringValue()
        case _ => null
      }      
    }
    override def choose() : Value = {
      val it = map.iterator
      if (it.hasNext) {
        val x = it.next
        VectorValue(Array(x._1, x._2))
      } else dynamicException(CONSTRUCTOR_EMPTYCHOICE)
    }
    override def forceDeep() : Value = {
      var s : SortedMap[Value, Value] = SortedMap.empty(map.ordering)
      for ((k,v) <- map) {
        s = s + (k.forceDeep() -> v.forceDeep())
      }
      MapValue(s)
    }
  }
  
  val nil : Value = ObjectValue(SortedMap.empty)
  
  def dynamicException(constructorName : String) : ExceptionValue = {
    ExceptionValue(true, ConstructorValue(Program.Constr(constructorName), nil))
  }
  
  def domainError() : ExceptionValue = {
    dynamicException(CONSTRUCTOR_DOMAINERROR)
  }
    
  object CompareResult {
    val UNRELATED = 0
    val LESS = 1
    val EQUAL = 2
    val GREATER = 3
    def negate(c : Int) : Int = {
      c match {
        case UNRELATED => UNRELATED
        case LESS => GREATER
        case GREATER => LESS
        case _ => c
      }
    }
  }
    
  def orderRank(f : Value) : Int = {
    f match {
      case _ : ExceptionValue => -1
      case _ : FunctionValue => -1
      case _ : ObjectValue => 1
      case InfinityValue(false) => 2
      case _ : IntegerValue => 3
      case InfinityValue(true) => 4
      case _ : StringValue => 5
      case _ : ListValue => 6
      case _ : VectorValue => 6
      case _ : ConstructorValue => 7
      case _ : SetValue => 8
      case _ : MapValue => 9
      case BooleanValue(false) => 10
      case BooleanValue(true) => 11
    }
  }
  
  def compareValues(v1 : Value, v2 : Value) : Int = {
    import CompareResult._
    val f1 = v1.extractRepresentative()
    val f2 = v2.extractRepresentative()
    val r1 = orderRank(f1)
    val r2 = orderRank(f2)
    if (r1 < 0 || r2 < 0) return UNRELATED
    if (r1 < r2) return LESS
    if (r1 > r2) return GREATER
    (f1, f2) match {
      case (x : ObjectValue, y : ObjectValue) => compareObjects(x, y)
      case (x : MapValue, y : MapValue) => compareMaps(x, y)
      case (x : SetValue, y : SetValue) => compareSets(x, y)
      case (x : VectorValue, y : VectorValue) => compareVectors(x, y)
      case (x : ListValue, y : ListValue) => compareLists(x, y)
      case (x : ListValue, y : VectorValue) => compareListWithVector(x, y)
      case (x : VectorValue, y : ListValue) => negate(compareListWithVector(y, x))
      case (x : ConstructorValue, y : ConstructorValue) => compareCExprs(x, y)
      case (InfinityValue(x), InfinityValue(y)) => 
        if (x == y) EQUAL else if (x) GREATER else LESS
      case (InfinityValue(x), _ : IntegerValue) => 
        if (x) GREATER else LESS
      case (_ : IntegerValue, InfinityValue(x)) => 
        if (x) LESS else GREATER
      case (IntegerValue(x), IntegerValue(y)) => 
        if (x < y) LESS else if (x > y) GREATER else EQUAL
      case (StringValue(x), StringValue(y)) => 
        val c = x.compare(y)
        if (c < 0) LESS else if (c > 0) GREATER else EQUAL
      case (_ : ListValue, _) => throw Evaluator.EvalX("ListValue comparison")
      case (_ : VectorValue, _) => throw Evaluator.EvalX("VectorValue comparison")
      case _ => throw Evaluator.EvalX("cannot compare "+f1+" and "+f2)       
    }
  }
  
  def compareObjects(v1 : ObjectValue, v2 : ObjectValue) : Int = {
    import CompareResult._
    val s1 = v1.messages.size
    val s2 = v2.messages.size
    if (s1 < s2) return LESS
    if (s1 > s2) return GREATER    
    var i1 = v1.messages.iterator
    var i2 = v2.messages.iterator
    while (!i1.isEmpty) {
      val (m1, _) = i1.next
      val (m2, _) = i2.next
      val c = m1.compare(m2)
      if (c < 0) return LESS
      else if (c > 0) return GREATER
    }
    i1 = v1.messages.iterator
    i2 = v2.messages.iterator
    while (!i1.isEmpty) {
      var (_, v1) = i1.next
      var (_, v2) = i2.next
      val c = compareValues(v1, v2)
      if (c != EQUAL) return c
    }
    return EQUAL
  }

  def compareMaps(v1 : MapValue, v2 : MapValue) : Int = {
    import CompareResult._
    val s1 = v1.map.size
    val s2 = v2.map.size
    if (s1 < s2) return LESS
    if (s1 > s2) return GREATER    
    var i1 = v1.map.iterator
    var i2 = v2.map.iterator
    while (!i1.isEmpty) {
      val (m1, _) = i1.next
      val (m2, _) = i2.next
      val c = compareValues(m1, m2)
      if (c != EQUAL) return c
    }
    i1 = v1.map.iterator
    i2 = v2.map.iterator
    while (!i1.isEmpty) {
      var (_, v1) = i1.next
      var (_, v2) = i2.next
      val c = compareValues(v1, v2)
      if (c != EQUAL) return c
    }
    return EQUAL
  }

  def compareSets(v1 : SetValue, v2 : SetValue) : Int = {
    import CompareResult._
    val s1 = v1.set.size
    val s2 = v2.set.size
    if (s1 < s2) return LESS
    if (s1 > s2) return GREATER    
    var i1 = v1.set.iterator
    var i2 = v2.set.iterator
    while (!i1.isEmpty) {
      val e1 = i1.next
      val e2 = i2.next
      val c = compareValues(e1, e2)
      if (c != EQUAL) return c
    }
    return EQUAL
  }
  
  def compareCExprs(v1 : ConstructorValue, v2 : ConstructorValue) : Int = {
    val c = v1.constr.name.compare(v2.constr.name)
    if (c < 0) CompareResult.LESS
    else if (c > 0) CompareResult.GREATER
    else compareValues(v1.v, v2.v)
  } 
  
  def compareVectors(v1 : VectorValue, v2 : VectorValue) : Int = {
    import CompareResult._
    val i1 = v1.tuple.iterator
    val i2 = v2.tuple.iterator
    while (!i1.isEmpty) {
      if (i2.isEmpty) return GREATER
      val e1 = i1.next
      val e2 = i2.next
      val c = compareValues(e1, e2)
      if (c != EQUAL) return c
    }
    if (i2.isEmpty) 
      EQUAL
    else
      LESS
  }
  
  def normalizeListTail(tail : Value) : ListValue = {
    val t = tail.force()
    if (t.isInstanceOf[ListValue]) t.asInstanceOf[ListValue]
    else ConsListValue(t, EmptyListValue())
  }
  
  def compareLists(v1 : ListValue, v2 : ListValue) : Int = {
    import CompareResult._
    (v1, v2) match {
      case (EmptyListValue(), EmptyListValue()) => EQUAL
      case (EmptyListValue(), _ : ConsListValue) => LESS
      case (_  : ConsListValue, EmptyListValue()) => GREATER
      case (ConsListValue(h1, t1), ConsListValue(h2, t2)) =>
        val c = compareValues(h1, h2)
        if (c != EQUAL) return c
        return compareLists(normalizeListTail(t1), normalizeListTail(t2))
    }
  }
  
  def compareListWithVector(v1 : ListValue, v2 : VectorValue) : Int = {
    import CompareResult._
    val tuple = v2.tuple
    val count = tuple.size
    var i = 0;
    var l = v1;
    while (i < count) {
      l match {
        case (EmptyListValue()) => return LESS
        case (ConsListValue(h, t)) =>
          val c = compareValues(h, tuple(i))
          if (c != EQUAL) return c
          l = normalizeListTail(t)
      }
      i = i + 1
    }
    l match {
      case (EmptyListValue()) => EQUAL
      case _ => GREATER
    }    
  }
  
  case class LazyValue(var evaluator : Evaluator, var env : Evaluator.SimpleEnvironment, var se : Program.SimpleExpression, var result : Value) extends Value {
    var deep : Boolean = false
    override def toStringValue() : StringValue = {
      return force().toStringValue();
    }
    override def toCodeString() : String = {
      return force().toCodeString;
    }
    override def force() : Value = this.synchronized {
      if (result != null) result
      else {
        result = 
          evaluator.evalSE(env, se).force() match {
            case ExceptionValue(true, p) => ExceptionValue(false, p)
            case x => x
          }   
        evaluator = null;
        env = null;
        se = null;
        result
      }
    }
    override def forceDeep() : Value = this.synchronized {
      if (result != null) {
        if (deep) result 
        else {
          result = result.forceDeep()
          deep = true
          result
        }
      } else {
        result = 
          evaluator.evalSE(env, se).forceDeep() match {
            case ExceptionValue(true, p) => ExceptionValue(false, p)
            case x => x
          }
        evaluator = null;
        env = null;
        se = null;
        deep = true;
        result        
      }
    }
    override def sendMessage(message : Program.Message) : Value = {
      val o = force()
      return force().sendMessage(message)
    }   
  }

  object unrelatedX extends Exception {}

  object defaultValueOrdering extends Ordering[Value] {
    def compare(a : Value, b : Value) : Int = {
      import CompareResult._
      compareValues(a, b) match {
        case LESS => -1
        case EQUAL => 0
        case GREATER => 1
        case UNRELATED => throw unrelatedX
      }
    }
  }
  
  
}
