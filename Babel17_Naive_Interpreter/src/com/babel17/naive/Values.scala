package com.babel17.naive

import scala.collection.immutable.SortedSet
import scala.collection.immutable.SortedMap
import java.util.concurrent._
import com.babel17.syntaxtree.Location

object Values {

  val MESSAGE_APPLY = "apply_"
  val MESSAGE_REPRESENTATIVE = "rank_"
  val MESSAGE_PLUS = "plus_"
  val MESSAGE_MINUS = "minus_"
  val MESSAGE_UMINUS = "uminus_"
  val MESSAGE_TIMES = "times_"
  val MESSAGE_SLASH = "slash_"
  val MESSAGE_DIV = "div_"
  val MESSAGE_MOD = "mod_"
  val MESSAGE_POW = "pow_"
  val MESSAGE_PLUSPLUS = "plus__"
  val MESSAGE_MINUSMINUS = "minus__"
  val MESSAGE_TIMESTIMES = "times__"
  val MESSAGE_SLASHSLASH = "slash__"
  val MESSAGE_TO = "to_"
  val MESSAGE_DOWNTO = "downto_"
  val MESSAGE_DESTRUCT = "destruct_"

  val MESSAGE_ITERATE = "iterate_"
  val MESSAGE_COLLECT_ADD = "collector_add_"
  val MESSAGE_COLLECT_CLOSE = "collector_close_"
  val MESSAGE_EMPTY = "empty"
  val MESSAGE_ISEMPTY = "isempty"
  val MESSAGE_SIZE = "size"
  val MESSAGE_TAKE = "take"
  val MESSAGE_DROP = "drop"
  val MESSAGE_CONTAINS = "contains"
  val MESSAGE_CONTAINSKEY = "containskey"
  val MESSAGE_INDEXOF = "indexof"
  val MESSAGE_ATINDEX = "atindex"
  val MESSAGE_HEAD = "head"
  val MESSAGE_TAIL = "tail"

  val MESSAGE_STRING = "string"
  val MESSAGE_BOOLEAN = "boolean"
  val MESSAGE_INFINITY = "infinity"
  val MESSAGE_INTEGER = "integer"
  val MESSAGE_LIST = "list"
  val MESSAGE_VECTOR = "vector"
  val MESSAGE_SET = "set"
  val MESSAGE_MAP = "map"

  val CONSTRUCTOR_DOMAINERROR = "DOMAINERROR"
  val CONSTRUCTOR_EMPTYCHOICE = "EMPTYCHOICE"  
  val CONSTRUCTOR_INVALIDMESSAGE = "INVALIDMESSAGE"
  /*val CONSTRUCTOR_TYPEERROR = "TYPEERROR" */
  val CONSTRUCTOR_NOMATCH = "NOMATCH"
  val CONSTRUCTOR_APPLYERROR = "APPLYERROR"
  val CONSTRUCTOR_INVALIDLIST = "INVALIDLIST"
  val CONSTRUCTOR_UNRELATED = "UNRELATED"
  val CONSTRUCTOR_INVALIDPARENT = "INVALIDPARENT"
  val CONSTRUCTOR_INVALIDPARENTS = "INVALIDPARENTS"
  val CONSTRUCTOR_UPDATEERROR = "UPDATEERROR"
  val CONSTRUCTOR_INVALIDWHILECONDITION = "INVALIDWHILECONDITION"
  val CONSTRUCTOR_INVALIDITERATOR = "INVALIDITERATOR"


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

    override def equals(v : Any) : Boolean = {
      v match {
        case v: Value => defaultValueOrdering.compare(this, v) == 0
        case _ => false
      }
    }

    // this returns either an ObjectValue without a "representative" message or something that is
    // a) not an ObjectValue b) forced
    def extractRepresentative() : Value = {
      var f = this
      var oldf = f
      while (f != null) {
        f = f.force()
        if  (f.isException()) return f
        oldf = f
        f = f.sendMessage(Program.Message(MESSAGE_REPRESENTATIVE))
      }
      oldf
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

    override def toString() : String = {
      stringDescr(false)
    }
        
    def stringValue(nested : Boolean, brackets : Boolean) : String;

    def stringDescr(brackets : Boolean) : String = {
      stringValue(true, brackets)
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
      throw Evaluator.EvalX("this is not an exception, cannot make dynamic")
    }

    def isNil(force : Boolean) : Boolean = {
      val v = if (force) this.force() else this
      v match {
        case ObjectValue(m) => m.size == 0
        case _ => false
      }
    }

 /*   def asDynamicException() : ExceptionValue = {
      if (isDynamicException()) this.asInstanceOf[ExceptionValue]
      else null
    }    */
  }

  case class IntegerValue(v : BigInt) extends Value {
    def stringValue(nested : Boolean, brackets : Boolean) : String = v.toString()

    override def sendMessage(message : Program.Message) : Value = {
      message.m match {
        case MESSAGE_INTEGER => this
        case MESSAGE_PLUS => NativeFunctionValue(plus _)
        case MESSAGE_MINUS => NativeFunctionValue(minus _)
        case MESSAGE_UMINUS => IntegerValue(-v)
        case MESSAGE_TIMES => NativeFunctionValue(times _)
        case MESSAGE_POW => NativeFunctionValue(pow _)
        case MESSAGE_DIV => NativeFunctionValue(div _)
        case MESSAGE_MOD => NativeFunctionValue(mod _)
        case MESSAGE_STRING => StringValue(stringValue(false, false))
        case MESSAGE_TO => Evaluator.systemSendMessage(this, message.m)
        case MESSAGE_DOWNTO => Evaluator.systemSendMessage(this, message.m)
        case MESSAGE_BOOLEAN => Evaluator.systemSendMessage(this, "integer", message.m)
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
    var stackTraceElement : StackTraceElement = null
    def apply(v : Value) : Value = {
      val w = apply_(v)
      if (w.isDynamicException && stackTraceElement != null) {
        w.asDynamicException.addToStackTrace(stackTraceElement)
      }
      w
    }
    protected def apply_(v : Value) : Value
    def stringValue(nested : Boolean, brackets : Boolean) : String = "_function"
    override def sendMessage(message : Program.Message) : Value = {
      message.m match {
        case MESSAGE_APPLY => this
        //case MESSAGE_TOSTRING => StringValue(stringValue(false, false))
        case _ => null
      }
    }
    override def extractFunctionValue() : Value = this

  }
    
  case class NativeFunctionValue(native : Function[Value, Value]) extends FunctionValue {    
    override def apply_(v : Value) : Value = {
      val x = native(v.force())
      if (x == null) dynamicException(CONSTRUCTOR_DOMAINERROR)
      else x
    }
  }

  case class ClosureValue(evaluator : Evaluator, env : Evaluator.SimpleEnvironment,
                           branches : List[(Program.Pattern, Program.Expression, Program.Type)]) extends FunctionValue
  {
    override def apply_(v : Value) : Value = {
      val e = env.thaw
      for ((p, body, _) <- branches) {
        evaluator.matchPattern(e, p, v, false)  match {
          case Evaluator.NoMatch() =>
          case Evaluator.DoesMatch(newEnv) =>
            return evaluator.evalExpression(newEnv, body)
        }
      }
      return domainError()
    }
  }

  case class ClosureValueMS(evaluator : Evaluator, env : Evaluator.SimpleEnvironment,
                           branches : List[(Program.Pattern, Program.Expression, Program.Type)]) extends FunctionValue
  {
    var cache : SortedMap[Value, Value] = new scala.collection.immutable.TreeMap()(defaultValueOrdering)
    def save(key : Value, v : Value) : Value = {
      this.synchronized {
        try {
          cache = cache + (key -> v)
        } catch {
          case UnrelatedX =>
        }
      }
      v
    }
    override def apply_(key : Value) : Value = {
      var doCache = true
      this.synchronized {
        try {
          cache.get(key) match {
            case None =>
            case Some(u) =>
              return u
          }
        } catch {
          case UnrelatedX =>
          doCache = false
        }
      }
      val e = env.thaw
      for ((p, body, _) <- branches) {
        evaluator.matchPattern(e, p, key, false)  match {
          case Evaluator.NoMatch() =>
          case Evaluator.DoesMatch(newEnv) =>
            val computed = evaluator.evalExpression(newEnv, body)
            if (doCache)
              return save(key, computed)
            else
              return computed
        }
      }
      if (doCache)
        return save(key, domainError())
      else
        return domainError()
    }
  }
  
  case class InfinityValue(positive : Boolean) extends Value {
    def stringValue(nested : Boolean, brackets : Boolean) : String = {
      if (positive) "\u221E" else "-\u221E"
    }
    override def sendMessage(message : Program.Message) : Value = {
      message.m match {
        case MESSAGE_PLUS => NativeFunctionValue(plus _)
        case MESSAGE_MINUS => NativeFunctionValue(minus _)
        case MESSAGE_UMINUS => InfinityValue(!positive)
        case MESSAGE_TIMES => NativeFunctionValue(times _)
        case MESSAGE_POW => NativeFunctionValue(pow _)
        case MESSAGE_STRING => StringValue(stringValue(false, false))
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

  def sendCollectionMessage(target : Value, message : String) : Value = {
    var m = "coll_"+message;
    message match {
      case MESSAGE_COLLECT_CLOSE =>
        m = message
      case MESSAGE_COLLECT_ADD =>
        m = message
      case MESSAGE_ITERATE =>
      case MESSAGE_PLUS =>
      case MESSAGE_PLUSPLUS =>
      case MESSAGE_SIZE =>
      case MESSAGE_ISEMPTY =>
      case MESSAGE_TAKE =>
      case MESSAGE_DROP =>
      case MESSAGE_CONTAINS =>
      case MESSAGE_INDEXOF =>
      case MESSAGE_ATINDEX =>
      case MESSAGE_HEAD =>
      case MESSAGE_TAIL =>
      case MESSAGE_LIST =>
      case MESSAGE_VECTOR =>
      case MESSAGE_SET =>
      case MESSAGE_STRING =>
      case MESSAGE_MAP =>
      case MESSAGE_SLASH =>
      case MESSAGE_SLASHSLASH =>
      case MESSAGE_TIMES =>
      case MESSAGE_POW =>
      case MESSAGE_MINUS =>
      case MESSAGE_MINUSMINUS =>
      case MESSAGE_TIMESTIMES =>
      case _ => return null
    }
    Evaluator.systemSendMessage(target, m)
  }

  case class StringValue(v : String) extends Value {
    def escape(s : String) : String = {
      if (s == "\\") "\\\\"
      else if (s == "\"") "\\\""
      else if (s == "\n") "\\n"
      else if (s == "\r") "\\r"
      else s
    }
    def stringValue(nested : Boolean, brackets : Boolean) : String = {
      if (nested) {
        val l = v.grouped(1).toList
        val l2 =
          for (i <- l) yield escape(i)
        val w = l2.mkString
        "\"" + w + "\""
      }
      else v
    }
    override def sendMessage(message : Program.Message) : Value = {
      message.m match {
        case MESSAGE_STRING => this
        case MESSAGE_MAP => null
        case MESSAGE_SET => null
        case MESSAGE_INDEXOF => NativeFunctionValue(indexOf _)
        case MESSAGE_CONTAINS => NativeFunctionValue(contains _)
        case MESSAGE_EMPTY => Evaluator.systemSendMessage(this, "string", MESSAGE_EMPTY)
        case m => sendCollectionMessage(this, m)
      }      
    }

    def indexOf(w : Value) : Value = {
      w match {
        case StringValue(w) =>
          var i = v.indexOf(w)
          if (i >= 0) {
            i = v.codePointCount(0, i)
          }
          IntegerValue(i)
        case _ => null
      }
    }

    def contains(w : Value) : Value = {
      w match {
        case StringValue(w) =>
          BooleanValue(v.indexOf(w) >= 0)
        case _ => null
      }
    }
  }
  
  case class BooleanValue(v : Boolean) extends Value {
    def stringValue(nested : Boolean, brackets : Boolean) : String = {
      if (v) "true" else "false"
    }
    override def sendMessage(message : Program.Message) : Value = {
      message.m match {
        case MESSAGE_STRING => StringValue(stringValue(false, false))
        case MESSAGE_BOOLEAN => this
        case _ => null
      }      
    }
  }

  def mkBrackets(brackets : Boolean, s : String) : String = {
    if (brackets) "("+s+")" else s
  }
  
  case class ConstructorValue(constr : Program.Constr, v : Value) extends Value {
    def stringValue(nested : Boolean, brackets : Boolean) : String = {
      if (v.isNil(true)) constr.name
      else mkBrackets(brackets, constr.name + " " +v.stringValue(true, true))
    }
    override def stringDescr(brackets : Boolean) : String = {
      if (v.isNil(false)) constr.name
      else mkBrackets(brackets, constr.name + " " +v.stringValue(true, true))
    }
    override def sendMessage(message : Program.Message) : Value = {
      message.m match {
        //case MESSAGE_TOSTRING => StringValue(stringValue(false, false))
        case _ => null
      }      
    }
    override def forceDeep() : Value = {
      ConstructorValue(constr, v.forceDeep())
    }

  }
  
  case class ObjectValue(messages : SortedMap[Program.Message, Value]) extends Value {   
    import Program.Message
    val collection = messages.contains(Message(MESSAGE_EMPTY)) &&
       messages.contains(Message(MESSAGE_COLLECT_ADD)) &&
       messages.contains(Message(MESSAGE_COLLECT_CLOSE)) &&
       messages.contains(Message(MESSAGE_ITERATE))

    def stringValue(nested : Boolean, brackets : Boolean) : String = {
      if (isNil(false)) return "nil"
      var s = "{"
      var first : Boolean = true
      for ((m, v) <- messages) {
        if (!first) s=s+","
        first = false
        s = s + m.m + "=" + v.stringValue(true, false)
      }
      s = s + "}"
      s
    }
    override def stringDescr(brackets : Boolean) : String = {
      if (isNil(false)) return "nil"
      var s = "{"
      var first : Boolean = true
      for ((m, v) <- messages) {
        if (!first) s=s+","
        first = false
        s = s + m.m + "=" + v.stringDescr(false)
      }
      s = s + "}"
      s
    }
    override def sendMessage(message : Program.Message) : Value = {
      messages.get(message) match {
        case Some(v : EnvironmentValue) => v.onLookup()
        case Some(v) => v
        case None =>
          if (!collection) return null
          message.m match {
            case MESSAGE_STRING => null
            case MESSAGE_MAP => null
            case m => sendCollectionMessage(this, m)
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

  case class StackTraceElement(location : Location, description : String);

  case class ExceptionValue(dynamic : Boolean, v : Value) extends Value {
    def stringValue(nested : Boolean, brackets : Boolean) : String = {
      mkBrackets(brackets, if (dynamic)
        "_dynamicException "+v.stringValue(true, true)
      else
        "_persistentException "+v.stringValue(true, true))
    }
    override def stringDescr(brackets : Boolean) : String = {
      mkBrackets(brackets, if (dynamic)
        "_dynamicException "+v.stringDescr(true)
      else
        "_persistentException "+v.stringDescr(true))
    }
    override def sendMessage(message : Program.Message) : Value = {
      if (dynamic) return this
      else {
        val e = ExceptionValue(true, v)
        e.stackTrace = stackTrace
        e
      }
    }
    override def forceDeep() : Value = {
      val e = ExceptionValue(dynamic, v.forceDeep())
      e.stackTrace = stackTrace
      e
    }
    var stackTrace : List[StackTraceElement] = List.empty
    def getStackTrace : List[StackTraceElement] = stackTrace;
    def addToStackTrace(ste : StackTraceElement) {
      if (dynamic)
        stackTrace = ste :: stackTrace
    }
    override def asDynamicException() : ExceptionValue = {
      if (dynamic) this
      else {
        val e = ExceptionValue(true, v)
        e.stackTrace = stackTrace;
        e
      }
    }

  }

  abstract class ForIterator {
    def nextValue() : Value;
    def rest() : Value;
    def length() : Option[Int] = {
      None
    }
  }

  class VectorForIterator(v : VectorValue) extends ForIterator {
    val it = v.tuple.iterator
    var i = 0
    def nextValue() : Value = {
      if (it.hasNext) {
        i = i + 1
        it.next
      } else
        null
    }
    def rest() : Value = {
      VectorValue(v.tuple.drop(i))
    }
    override def length() : Option[Int] = {
      Some(v.tuple.length - i)
    }
  }

  class SetForIterator(v : SetValue) extends ForIterator {
    val it = v.set.iterator
    var i = 0
    def nextValue() : Value = {
      if (it.hasNext) {
        i = i + 1
        it.next
      } else
        null
    }
    def rest() : Value = {
      SetValue(v.set.drop(i))
    }
    override def length() : Option[Int] = {
      Some(v.set.size - i)
    }
  }

  class MapForIterator(v : MapValue) extends ForIterator {
    val it = v.map.iterator
    var i = 0
    def nextValue() : Value = {
      if (it.hasNext) {
        val (key, value) = it.next
        i = i + 1
        VectorValue(Array(key, value))
      } else
        null
    }
    def rest() : Value = {
      MapValue(v.map.drop(i))
    }
    override def length() : Option[Int] = {
      Some(v.map.size - i)
    }
  }

  class StringForIterator(v : StringValue) extends ForIterator {
    val s = v.v
    val len = s.length
    var i = 0
    val it = v.v.iterator
    def nextValue() : Value = {
      if (i < len) {
        val c = s.codePointAt(i)
        val count = Character.charCount(c)
        val result = StringValue(s.substring(i, i+count))
        i = i+count
        result
      } else null
    }
    def rest() : Value = {
      StringValue(s.drop(i))
    }
  }

  class ListForIterator(v : ListValue) extends ForIterator {
    var list = v
    def nextValue() : Value = {
      list match {
        case EmptyListValue() => null
        case ConsListValue(head, tail) =>
          list = normalizeListTail(tail)
          head
      }
    }
    def rest() : Value = {
      list
    }
  }

  class CustomForIterator(v : Value) extends ForIterator {
    var iterator = v
    def nextValue() : Value = {
      iterator = iterator.sendMessage(Program.Message(MESSAGE_ITERATE)).force()
      if (iterator.isDynamicException) return iterator
      iterator match {
        case VectorValue(Array()) => null
        case VectorValue(Array(e, n)) =>
          iterator = n
          e
        case _ => dynamicException(CONSTRUCTOR_INVALIDITERATOR)
      }
    }
    def rest() : Value = {
      return iterator
    }
  }

  def iteratorOfValue(v : Value) : ForIterator = {
    v.force() match {
      case v : ListValue => new ListForIterator(v)
      case v : VectorValue => new VectorForIterator(v)
      case v : SetValue => new SetForIterator(v)
      case v : MapValue => new MapForIterator(v)
      case v : StringValue => new StringForIterator(v)
      case c => new CustomForIterator(c)
    }
  }

  abstract class Collector {
    def collect_close () : Value = {
      throw Evaluator.EvalX("collect_close not implemented in "+this.getClass)
    }
    def collect_add (v : Value) : ExceptionValue = {
      throw Evaluator.EvalX("collect_add not implemented in "+this.getClass)
    }
  }
  
  def collectorOfValue(v : Value) : Collector = {
    v.force() match {
      case v : ListValue => new ListCollector(v)
      case v : VectorValue => new VectorCollector(v)
      case v : SetValue => new SetCollector(v)
      case v : MapValue => new MapCollector(v)
      case v : StringValue => new StringCollector(v)
      case c => new CustomCollector(c)
    }
  }

  class DefaultCollector extends Collector {
    import scala.collection.mutable.ArrayBuffer
    val buffer : ArrayBuffer[Value] = new ArrayBuffer(15)
    override def collect_close () : Value = {
      if (buffer.size == 1) buffer(0)
      else VectorValue(buffer.toArray)
    }
    override def collect_add(v : Value) : ExceptionValue =  {
      buffer + v
      return null
    }
  }

  class ListCollector(v : ListValue) extends Collector {
    var list = v.reverse
    override def collect_add(v : Value) : ExceptionValue =  {
      list = ConsListValue(v, list)
      return null
    }
    override def collect_close() : Value = {
      list.reverse
    }
  }

  class SetCollector(v : SetValue) extends Collector {
    // There is no mutable set in scala ... too bad!
    var set = v.set
    override def collect_close () : Value = {
      SetValue(set)
    }
    override def collect_add(v : Value) : ExceptionValue =  {
      try {
        set = set + v.force()
        return null
      } catch {
        case UnrelatedX => dynamicException(CONSTRUCTOR_UNRELATED)
      }
    }
  }

  class MapCollector(v : MapValue) extends Collector {
    var map = v.map
    override def collect_close () : Value = {
      MapValue(map)
    }
    override def collect_add(v : Value) : ExceptionValue =  {
      v.force match {
        case VectorValue(Array(key, value)) =>
          try {
            map = map + (key -> value)
            null
          } catch {
            case UnrelatedX => dynamicException(CONSTRUCTOR_UNRELATED)
          }
        case _ => domainError()
      }
    }
  }

  class VectorCollector(v : VectorValue) extends Collector {
    import scala.collection.mutable.ArrayBuffer
    val buffer : ArrayBuffer[Value] = new ArrayBuffer(v.tuple.length*2+15)
    for (x <- v.tuple) buffer + x
    override def collect_close () : Value = {
      VectorValue(buffer.toArray)
    }
    override def collect_add(v : Value) : ExceptionValue =  {
      buffer + v
      return null
    }
  }

  class StringCollector(v : StringValue) extends Collector {
    val builder : StringBuilder = new StringBuilder(v.v)
    override def collect_close () : Value = {
      StringValue(builder.toString)
    }
    override def collect_add(v : Value) : ExceptionValue =  {
      v.sendMessage(Program.Message(MESSAGE_STRING)) match {
        case StringValue(s) =>
          builder.append(s)
          null
        case x : ExceptionValue => x.asDynamicException
        case _ => domainError()
      }
    }
  }


  class CustomCollector(v : Value) extends Collector {
    var collector = v
    override def collect_close () : Value = {
      val closed = collector.sendMessage(Program.Message(MESSAGE_COLLECT_CLOSE))
      if (closed == null)
        dynamicException(CONSTRUCTOR_INVALIDMESSAGE, StringValue(MESSAGE_COLLECT_CLOSE))
      else
        closed
    }
    override def collect_add(v : Value) : ExceptionValue =  {
      collector = collector.sendMessage(Program.Message(MESSAGE_COLLECT_ADD))
      if (collector == null)
        dynamicException(CONSTRUCTOR_INVALIDMESSAGE, StringValue(MESSAGE_COLLECT_ADD))
      else {
        collector.force() match {
          case f : FunctionValue =>
            collector = f.apply(v)
            if (collector.isException) collector.asDynamicException
            else null
          case e : ExceptionValue =>
            e.asDynamicException
          case _ => dynamicException(CONSTRUCTOR_APPLYERROR)
        }
      }
    }

  }

  abstract class ListValue extends Value {
    def toList : List[Value];
    def reverse(r : ListValue) : ListValue
    def reverse : ListValue = {
      reverse(EmptyListValue())
    }
    def length : Int;
    def toVectorValue() : VectorValue;
    override def sendMessage(message : Program.Message) : Value = {
      message.m match {
        case MESSAGE_LIST => this
        case MESSAGE_UMINUS =>
          Evaluator.systemSendMessage(this, "seq", message.m)
        case MESSAGE_APPLY =>
          Evaluator.systemSendMessage(this, "coll", MESSAGE_ATINDEX)
        case MESSAGE_EMPTY =>
          Evaluator.systemSendMessage(this, "list", MESSAGE_EMPTY)
        case m => sendCollectionMessage(this, m)
      }
    }
  }
  
  case class EmptyListValue() extends ListValue {    
    def stringValue(nested : Boolean, brackets : Boolean) : String = {
      return "[]";
    }
    override def choose() : Value = {
      dynamicException(CONSTRUCTOR_EMPTYCHOICE)
    }
    override def toList = {
       List.empty
    }
    override def reverse(r : ListValue) : ListValue = {
      r
    }
    override def length : Int = {
      0
    }
    override def toVectorValue() : VectorValue = {
      VectorValue(Array())
    }
   }
  
  case class ConsListValue(head : Value, tail : Value) extends ListValue {
    def stringValue(nested : Boolean, brackets : Boolean) : String = {
      mkBrackets(brackets,
        head.stringValue(true, true)+"::" +
          normalizeListTail(tail).stringValue(true,true))
    }
    override def stringDescr(brackets : Boolean) : String = {
      mkBrackets(brackets,
        head.stringDescr(true)+"::" +
          tail.stringDescr(true))
    }
    override def forceDeep() : Value = {
      ConsListValue(head.forceDeep(), tail.forceDeep())
    }
    override def choose() : Value = {
      head
    }
    override def toList = {
      head :: (normalizeListTail(tail)).toList
    }
    override def length = {
      1 + (normalizeListTail(tail)).length
    }

    override def reverse(r : ListValue) : ListValue = {
      normalizeListTail(tail).reverse(ConsListValue(head, r))
    }
    override def toVectorValue() : VectorValue = {
      VectorValue(toList.toArray)
    }
  }
  
  case class VectorValue(tuple : Array[Value]) extends Value {
    def stringValue(nested : Boolean, brackets : Boolean) : String = {
      val size = tuple.size
      if (size == 0) "()"
      else if (size == 1) "("+tuple(0).stringValue(true, false)+",)"
      else {
        var s = "("+tuple(0).stringValue(true, false)
        var i = 1
        while (i < size) {
          s = s + "," + tuple(i).stringValue(true, false)
          i = i + 1
        }
        s + ")"       
      }
    }
    override def stringDescr(brackets : Boolean) : String = {
      val size = tuple.size
      if (size == 0) "()"
      else if (size == 1) "("+tuple(0).stringDescr(false)+",)"
      else {
        var s = "("+tuple(0).stringDescr(false)
        var i = 1
        while (i < size) {
          s = s + "," + tuple(i).stringDescr(false)
          i = i + 1
        }
        s + ")"
      }
    }
    override def sendMessage(message : Program.Message) : Value = {
      message.m match {
        case MESSAGE_VECTOR => this
        case MESSAGE_UMINUS =>
          Evaluator.systemSendMessage(this, "seq", message.m)
        case MESSAGE_EMPTY =>
          Evaluator.systemSendMessage(this, "vector", MESSAGE_EMPTY)
        case MESSAGE_APPLY =>
          NativeFunctionValue(atIndex _)
        case MESSAGE_ATINDEX =>
          NativeFunctionValue(atIndex _)
        case m => sendCollectionMessage(this, m)
      }
    }

    def atIndex(i : Value) : Value = {
      i match {
        case IntegerValue(i) =>
          if (i < 0 || i >= tuple.length)
            domainError()
          else
            tuple(i.toInt)
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
    def toListValue : ListValue = {
      var size = tuple.size
      var list : ListValue = EmptyListValue()
      while (size > 0) {
        size = size - 1
        list = ConsListValue(tuple(size), list)
      }
      list
    }
  }
  
  case class SetValue(set : SortedSet[Value]) extends Value {
    def stringValue(nested : Boolean, brackets : Boolean) : String = {
      val tuple = set.toList
      val size = tuple.size
      if (size == 0) "{}"
      else {
        var s = "{"+tuple(0).stringValue(true, false)
        var i = 1
        while (i < size) {
          s = s + "," + tuple(i).stringValue(true, false)
          i = i + 1
        }
        s + "}"
      }
    }
    override def stringDescr(brackets : Boolean) : String = {
      val tuple = set.toList
      val size = tuple.size
      if (size == 0) "{}"
      else {
        var s = "{"+tuple(0).stringDescr(false)
        var i = 1
        while (i < size) {
          s = s + "," + tuple(i).stringDescr(false)
          i = i + 1
        }
        s + "}"
      }
    }
    override def sendMessage(message : Program.Message) : Value = {
      message.m match {
        case MESSAGE_STRING => null
        case MESSAGE_SET => this
        case MESSAGE_EMPTY =>
          Evaluator.systemSendMessage(this, "set", MESSAGE_EMPTY)
        case MESSAGE_CONTAINS =>
          NativeFunctionValue(contains _)
        case MESSAGE_APPLY =>
          NativeFunctionValue(contains _)
        case MESSAGE_MINUS =>
          NativeFunctionValue(remove _)
        case m => sendCollectionMessage(this, m)
      }
    }
    def contains(w : Value) : Value = {
      try {
        BooleanValue(set.contains(w))
      } catch {
        case UnrelatedX => BooleanValue(false)
      }
    }
    def remove(w : Value) : Value = {
      try {
        SetValue(set - w)
      } catch {
        case UnrelatedX => this
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
  
  case class MapValue(map : SortedMap[Value, Value]) extends Value {
    def prV (kv : (Value, Value)) : String = {
      kv._1.stringValue(true,false)+"->"+kv._2.stringValue(true,false)
    }
    def prD (kv : (Value, Value)) : String = {
      kv._1.stringDescr(false)+"->"+kv._2.stringDescr(false)
    }
    def stringValue(nested : Boolean, brackets : Boolean) : String = {
      val tuple = map.toList
      val size = tuple.size
      if (size == 0) "{}"
      else {
        var s = "{"+(prV(tuple(0)))
        var i = 1
        while (i < size) {
          s = s + "," + (prV(tuple(i)))
          i = i + 1
        }
        s + "}"
      }
    }
    override def stringDescr(brackets : Boolean) : String = {
      val tuple = map.toList
      val size = tuple.size
      if (size == 0) "{}"
      else {
        var s = "{"+prD(tuple(0))
        var i = 1
        while (i < size) {
          s = s + "," + prD(tuple(i))
          i = i + 1
        }
        s + "}"
      }
    }
    override def sendMessage(message : Program.Message) : Value = {
      message.m match {
        case MESSAGE_STRING => null
        case MESSAGE_MAP => this
        case MESSAGE_SLASHSLASH =>
          Evaluator.systemSendMessage(this, "map", MESSAGE_SLASHSLASH)
        case MESSAGE_CONTAINS =>
          Evaluator.systemSendMessage(this, "map", MESSAGE_CONTAINS)
        case MESSAGE_TIMESTIMES =>
          Evaluator.systemSendMessage(this, "map", MESSAGE_TIMESTIMES)
        case MESSAGE_CONTAINSKEY =>
          NativeFunctionValue(containsKey _)
        case MESSAGE_APPLY =>
          NativeFunctionValue(lookup _)
        case MESSAGE_MINUS =>
          NativeFunctionValue(remove _)
        case MESSAGE_EMPTY =>
          Evaluator.systemSendMessage(this, "map", MESSAGE_EMPTY)
        case m => sendCollectionMessage(this, m)
      }
    }
    def containsKey(w : Value) : Value = {
      try {
        BooleanValue(map.contains(w))
      } catch {
        case UnrelatedX => BooleanValue(false)
      }
    }
    def lookup(w : Value) : Value = {
      try {
        map.get(w) match {
          case Some(v) => v
          case _ => null
        }
      } catch {
        case UnrelatedX => null
      }
    }
    def remove(w : Value) : Value = {
      try {
        MapValue(map - w)
      } catch {
        case UnrelatedX => this
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
  
  def dynamicException(constructorName : String, arg : Value) : ExceptionValue = {
    ExceptionValue(true, ConstructorValue(Program.Constr(constructorName), arg))
  }

  def dynamicException(constructorName : String) : ExceptionValue = {
    dynamicException(constructorName, nil)
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
      case ExceptionValue(true, _) => -1
      case _ : FunctionValue => -1
      case ExceptionValue(false, _) => 0
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
      case BooleanValue(false) => 11
      case BooleanValue(true) => 12
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
      case (ExceptionValue(_, x), ExceptionValue(_, y)) =>
        compareValues(x, y)
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
    else if (t.isInstanceOf[VectorValue]) t.asInstanceOf[VectorValue].toListValue
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
    def stringValue(nested : Boolean, brackets : Boolean) : String = {
      force().stringValue(nested, brackets)
    }
    override def stringDescr(brackets : Boolean) : String = {
      "_lazy"
    }
    override def force() : Value = {
      if (result != null) result
      else {
        this.synchronized {
          if (result != null) return result
        }
        var r =
          evaluator.evalSE(env, se).force() match {
            case x@(ExceptionValue(true, p)) =>
              val e = ExceptionValue(false, p)
              e.stackTrace = x.stackTrace
              e
            case x => x
          }
        this.synchronized {
          if (result == null)
            result = r
        }
        result
      }
    }
    override def forceDeep() : Value = {
      if (result != null) {
        if (deep) result 
        else {
          this.synchronized {
            if (deep) return result
          }
          var r  = result.forceDeep()
          this.synchronized {
            if (!deep) {
              result = r
              deep = true
            }
          }
          result
        }
      } else {
        this.synchronized {
          if (deep) return result
        }
        var r = evaluator.evalSE(env, se).forceDeep() match {
            case x @ ExceptionValue(true, p) =>
              val e = ExceptionValue(false, p)
              e.stackTrace = x.stackTrace
              e
            case x => x
          }
        this.synchronized {
          if (!deep)
            result = r
          evaluator = null
          env = null
          se = null
          deep = true
        }
        result        
      }
    }
    override def sendMessage(message : Program.Message) : Value = {
      return force().sendMessage(message)
    }   
  }

  // this is a special value that lives only inside environments
  abstract class EnvironmentValue(var env : Evaluator.SimpleEnvironment) extends Value {
    var evaluator : Evaluator = null
    def sendMessage(m : Program.Message) : Value = {
      throw Evaluator.EvalX("EnvironmentValue has been sent a message. How?")
    }
    def stringValue(nested : Boolean, brackets : Boolean) : String = {
      "_recursive"
    }
    def onLookup() : Value;
  }

  case class EnvironmentValueMN(var se : Program.SimpleExpression)
  extends EnvironmentValue(null) {

    def onLookup() : Value = {
      evaluator.evalSE(env, se)
    }
  }

  case class EnvironmentValueMS(var se : Program.SimpleExpression,
                                var result : Value)
  extends EnvironmentValue(null) {

    def onLookup() : Value = {
      if (result != null) result
      else {
        var localEnv : Evaluator.SimpleEnvironment = null
        var localSE : Program.SimpleExpression = null
        this.synchronized {
          if (result != null) return result
          localEnv = env
          localSE = se
        }
        var r = evaluator.evalSE(localEnv, localSE)
        this.synchronized {
          //if (result == null) {
            result = r
            env = null;
            se = null;
          //}
        }
        result
      }
    }
  }

  case class EnvironmentValueMW(
                                    var se : Program.SimpleExpression,
                                    var cache : java.lang.ref.Reference[Value])
  extends EnvironmentValue(null) {
    def getResult () : Value = {
      var result : Value = null
      if (cache != null)
        result = cache.get()
      return result
    }
    def onLookup() : Value = {
      var result = getResult()
      if (result != null) result
      else {
        var localEnv : Evaluator.SimpleEnvironment = null
        var localSE : Program.SimpleExpression = null
        this.synchronized {
          result = getResult()
          if (result != null) return result
          localEnv = env
          localSE = se
        }
        var r = evaluator.evalSE(localEnv, localSE)
        this.synchronized {
          result = getResult()
          //if (result == null) {
            cache = new java.lang.ref.SoftReference(r)
            result = r
            env = null;
            se = null;
          //}
        }
        result
      }
    }
  }

  case class ConcurrentValue(evaluator : Evaluator, env : Evaluator.SimpleEnvironment, se : Program.SimpleExpression)
    extends Value with Callable[Value]
  {
    val futureTask = new FutureTask[Value](this)

    def getTask() : FutureTask[Value] = {
      futureTask
    }

    def stringValue(nested : Boolean, brackets : Boolean) : String = {
      return force().stringValue(nested, brackets);
    }
    override def stringDescr(brackets : Boolean) : String = {
      "_concurrent"
    }
    def call() : Value = {
      evaluator.evalSE(env, se)
    }
    override def force() : Value = {
      futureTask.get().force()
    }

    override def forceDeep() : Value = {
      futureTask.get().forceDeep()
    }
    override def sendMessage(message : Program.Message) : Value = {
      return force().sendMessage(message)
    }
  }

  object UnrelatedX extends Exception {}

  object defaultValueOrdering extends Ordering[Value] {
    def compare(a : Value, b : Value) : Int = {
      import CompareResult._
      val r = compareValues(a, b) match {
        case LESS => -1
        case EQUAL => 0
        case GREATER => 1
        case UNRELATED =>
          throw UnrelatedX
      }
      r
    }
  }

}
