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

 /* val MESSAGE_STRING = "string"
  val MESSAGE_BOOLEAN = "boolean"
  val MESSAGE_INTEGER = "integer"
  val MESSAGE_LIST = "list"
  val MESSAGE_VECTOR = "vector"
  val MESSAGE_SET = "set"
  val MESSAGE_MAP = "map"*/

  val CONSTRUCTOR_DOMAINERROR = "DOMAINERROR"
  val CONSTRUCTOR_EMPTYCHOICE = "EMPTYCHOICE"  
  val CONSTRUCTOR_INVALIDMESSAGE = "INVALIDMESSAGE"
  val CONSTRUCTOR_TYPECONVERSIONERROR = "TYPECONVERSIONERROR"
  val CONSTRUCTOR_TYPEERROR = "TYPEERROR"
  val CONSTRUCTOR_NOMATCH = "NOMATCH"
  val CONSTRUCTOR_APPLYERROR = "APPLYERROR"
  val CONSTRUCTOR_INVALIDLIST = "INVALIDLIST"
  val CONSTRUCTOR_UNRELATED = "UNRELATED"
  val CONSTRUCTOR_INVALIDPARENT = "INVALIDPARENT"
  val CONSTRUCTOR_INVALIDPARENTS = "INVALIDPARENTS"
  val CONSTRUCTOR_UPDATEERROR = "UPDATEERROR"
  val CONSTRUCTOR_INVALIDWHILECONDITION = "INVALIDWHILECONDITION"
  val CONSTRUCTOR_INVALIDITERATOR = "INVALIDITERATOR"
  val CONSTRUCTOR_MODULENOTFOUND = "MODULENOTFOUND"
  val CONSTRUCTOR_DEADLOCK = "DEADLOCK"

  private def makeTypeValue(s : String) : TypeValue =
    TypeValue(Program.Path(List(Program.Id(s))));
  
  val TYPE_INT = makeTypeValue("int")
  val TYPE_REAL = makeTypeValue("real")
  val TYPE_BOOL = makeTypeValue("bool")
  val TYPE_STRING = makeTypeValue("string")
  val TYPE_LIST = makeTypeValue("list")
  val TYPE_VECT = makeTypeValue("vect")
  val TYPE_SET = makeTypeValue("set")
  val TYPE_MAP = makeTypeValue("map")
  val TYPE_CEXP = makeTypeValue("cexp")
  val TYPE_OBJ = makeTypeValue("obj")
  val TYPE_FUN = makeTypeValue("fun")
  val TYPE_EXC = makeTypeValue("exc")
  val TYPE_TYPE = makeTypeValue("type")
  val TYPE_MODULE = makeTypeValue("module")


  abstract class Value {
    // sending an object a message always forces it
    def sendMessage(message : Program.Id) : Value;
    
    // this returns either a dynamic exception or a FunctionValue
    def extractFunctionValue() : Value = {
      if (isDynamicException()) return this
      val f = sendMessage(Program.Id(MESSAGE_APPLY))
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
    
    def choose() : Value = {
      dynamicException(CONSTRUCTOR_DOMAINERROR)
    }
    
    def force() : Value = {
      this
    }
    
    override def toString() : String = {
      stringDescr(false)
    }
        
    def stringDescr(brackets : Boolean) : String;

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

    def typeof : Value;
    
    def typeConversionError = dynamicException(CONSTRUCTOR_TYPECONVERSIONERROR)

    def typeConvert(t : TypeValue) : Value = {
      val v = force()
      if (v.isException) v.asDynamicException
      else {
        v.typeof match {
          case s : TypeValue =>
            if (s.path == t.path) this
            else typeConversionError
          case _ => typeConversionError
        }
      }
    }

    def compareToValue(that : Value) : Int;
  }

  def comparePaths(p : Program.Path, q : Program.Path) : Int = {
    import CompareResult._
    val c = p.compare(q)
    if (c < 0) LESS else if (c > 0) GREATER else EQUAL

  }

  case class TypeValue(path : Program.Path) extends Value {
    override def typeof : TypeValue = TYPE_TYPE
    def stringDescr(brackets : Boolean) : String = "(:"+path+")"
    def sendMessage(message : Program.Id) : Value = {
      null
    }
    def compareToValue(that : Value) : Int = {
      import CompareResult._
      that match {
        case TypeValue(that_path) =>
          comparePaths(path, that_path)
        case _ => UNRELATED
      }
    }
  }

  case class IntegerValue(v : BigInt) extends Value {
    def stringDescr(brackets : Boolean) : String = v.toString()

    def typeof : TypeValue = TYPE_INT


    override def sendMessage(message : Program.Id) : Value = {
      message.name match {
        case MESSAGE_PLUS => NativeFunctionValue(plus _)
        case MESSAGE_MINUS => NativeFunctionValue(minus _)
        case MESSAGE_UMINUS => IntegerValue(-v)
        case MESSAGE_TIMES => NativeFunctionValue(times _)
        case MESSAGE_POW => NativeFunctionValue(pow _)
        case MESSAGE_DIV => NativeFunctionValue(div _)
        case MESSAGE_MOD => NativeFunctionValue(mod _)
        case MESSAGE_TO => Evaluator.systemSendMessage(this, message.name)
        case MESSAGE_DOWNTO => Evaluator.systemSendMessage(this, message.name)
        case _ => null
      }      
    }
    def plus(w : Value) : Value = {
      w match {
        case IntegerValue(w) =>
          IntegerValue(v + w)
        case _ => null
      }
    }
    def minus(w : Value) : Value = {
      w match {
        case IntegerValue(w) => IntegerValue(v - w)
        case _ => null
      }
    }
    def times(w : Value) : Value = {
      w match {
        case IntegerValue(w) => IntegerValue(v * w)
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

    def compareToValue(that : Value) : Int = {
      import CompareResult._
      that match {
        case IntegerValue(w) =>
          if (v < w) LESS else if (v > w) GREATER else EQUAL
        case _ => UNRELATED
      }
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
    def stringDescr(brackets : Boolean) : String = "_function"
    override def sendMessage(message : Program.Id) : Value = {
      message.name match {
        case MESSAGE_APPLY => this
        case _ => null
      }
    }
    override def extractFunctionValue() : Value = this

    def typeof : TypeValue = TYPE_FUN

    def compareToValue(that : Value) : Int = CompareResult.UNRELATED
  }
    
  case class NativeFunctionValue(native : Function[Value, Value]) extends FunctionValue {    
    override def apply_(v : Value) : Value = {
      val x = native(v.force())
      if (x == null) dynamicException(CONSTRUCTOR_DOMAINERROR)
      else x
    }
  }

  case class TypeIntroValue(evaluator : Evaluator, env : Evaluator.SimpleEnvironment, ty : TypeValue,
                           branches : List[(Program.Pattern, Option[Program.Expression])]) extends FunctionValue
  {
    private def typed(inner : Value, outer : Value) : Value = {
      outer.force() match {
        case v: ExceptionValue => v
        case v: ObjectValue =>
          val u = v.copy()
          val r = TypedValue(inner, u, ty)
          u.setThis(r)
          r
        case v =>
          TypedValue(inner, v, ty)
      }
    }
    override def apply_(v : Value) : Value = {
      val e = env.thaw
      for ((p, body) <- branches) {
        evaluator.matchPattern(e, p, v, false)  match {
          case Evaluator.NoMatch() =>
          case Evaluator.DoesMatch(newEnv) =>
            body match {
              case None => return typed(v, v)
              case Some(b) =>
                return typed(v, evaluator.evalExpression(newEnv, b))
            }
        }
      }
      return dynamicException(CONSTRUCTOR_TYPEERROR)
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
 /*     case MESSAGE_LIST =>
      case MESSAGE_VECTOR =>
      case MESSAGE_SET =>
      case MESSAGE_MAP =>*/
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
    def compareToValue(that : Value) : Int = {
      import CompareResult._
      that match {
        case StringValue(w) =>
          val c = v.compare(w)
          if (c < 0) LESS else if (c > 0) GREATER else EQUAL
        case _ => UNRELATED
      }
    }
    def escape(s : String) : String = {
      if (s == "\\") "\\\\"
      else if (s == "\"") "\\\""
      else if (s == "\n") "\\n"
      else if (s == "\r") "\\r"
      else s
    }
    def stringDescr(brackets : Boolean) : String = {
      val l = v.grouped(1).toList
      val l2 =
        for (i <- l) yield escape(i)
      val w = l2.mkString
      "\"" + w + "\""
    }
    override def sendMessage(message : Program.Id) : Value = {
      message.name match {
        //case MESSAGE_MAP => null
        //case MESSAGE_SET => null
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
    def typeof : TypeValue = TYPE_STRING

  }
  
  case class BooleanValue(v : Boolean) extends Value {
    def compareToValue(that : Value) : Int = {
      import CompareResult._
      that match {
        case BooleanValue(w) =>
          val c = v.compare(w)
          if (c < 0) LESS else if (c > 0) GREATER else EQUAL
        case _ => UNRELATED
      }
    }
    def stringDescr(brackets : Boolean) : String = {
      if (v) "true" else "false"
    }
    override def sendMessage(message : Program.Id) : Value = {
      message.name match {
        case _ => null
      }      
    }
    def typeof : TypeValue = TYPE_BOOL
  }

  def mkBrackets(brackets : Boolean, s : String) : String = {
    if (brackets) "("+s+")" else s
  }
  
  case class ConstructorValue(constr : Program.Constr, v : Value) extends Value {
    def compareToValue(that : Value) : Int = {
      import CompareResult._
      that match {
        case that : ConstructorValue =>
          compareCExprs(this, that)
        case _ => UNRELATED
      }
    }
    override def stringDescr(brackets : Boolean) : String = {
      if (v.isNil(false)) constr.name
      else mkBrackets(brackets, constr.name + " " +v.stringDescr(true))
    }
    override def sendMessage(message : Program.Id) : Value = {
      message.name match {
        //case MESSAGE_TOSTRING => StringValue(stringValue(false, false))
        case _ => null
      }      
    }
    def typeof : TypeValue = TYPE_CEXP

  }
  
  case class ObjectValue(messages : SortedMap[Program.Id, Value]) extends Value {
    import Program.Id
    val collection = messages.contains(Id(MESSAGE_EMPTY)) &&
       messages.contains(Id(MESSAGE_COLLECT_ADD)) &&
       messages.contains(Id(MESSAGE_COLLECT_CLOSE)) &&
       messages.contains(Id(MESSAGE_ITERATE))

    def compareToValue(that : Value) : Int = {
      import CompareResult._
      that match {
        case that : ObjectValue =>
          compareObjects(this, that)
        case _ => UNRELATED
      }
    }

    override def stringDescr(brackets : Boolean) : String = {
      if (isNil(false)) return "nil"
      var s = "{"
      var first : Boolean = true
      for ((m, v) <- messages) {
        if (!first) s=s+","
        first = false
        s = s + m.name + "=" + v.stringDescr(false)
      }
      s = s + "}"
      s
    }

    override def sendMessage(message : Program.Id) : Value = {
      messages.get(message) match {
        case Some(v : EnvironmentValue) => v.onLookup()
        case Some(v) => v
        case None =>
          if (!collection) return null
          message.name match {
            //case MESSAGE_STRING => null
            //case MESSAGE_MAP => null
            case m => sendCollectionMessage(this, m)
          }
      }
    }
    def typeof : TypeValue = TYPE_OBJ

    def copy() : ObjectValue = {
      def mutate(p : (Program.Id, Value)) : (Program.Id, Value) = {
        p._2 match {
          case e : EnvironmentValue =>
            val newE = e.copy()
            newE.env
            (p._1, e.copy())
          case _ => p
        }
      }
      val newMessages = messages.map(mutate)
      val keys = newMessages.keySet
      for ((_, e) <- newMessages) {
        e match {
          case e: EnvironmentValue =>
            val sliced = newMessages -- (keys -- e._messages)
            e.env = e.env.replace(sliced)
          case _ =>
        }
      }      
      ObjectValue(newMessages)
    }

    def setThis(_this : Value) {
      for ((m, e) <- messages) {
        e match {
          case e: EnvironmentValue =>
            e.setThis(_this)
          case _ =>
        }
      }
    }

    def setEnvMessages(_messages : SortedSet[Id]) {
      for ((m, e) <- messages) {
        e match {
          case e: EnvironmentValue =>
            e._messages = _messages
          case _ =>
        }
      }
    }
  }


 /* class ModuleValue(path : Program.Path, evaluator : Evaluator) extends Value {

  }*/

  case class StackTraceElement(location : Location, description : String);

  case class ExceptionValue(dynamic : Boolean, v : Value) extends Value {
    def compareToValue(that : Value) : Int = {
      import CompareResult._
      that match {
        case that : ExceptionValue =>
          compareValues(v, that.v)
        case _ => UNRELATED
      }
    }
    override def stringDescr(brackets : Boolean) : String = {
      mkBrackets(brackets, if (dynamic)
        "_dynamicException "+v.toString
      else
        "_persistentException "+v.toString)
    }
    override def sendMessage(message : Program.Id) : Value = {
      if (dynamic) return this
      else {
        val e = ExceptionValue(true, v)
        e.stackTrace = stackTrace
        e
      }
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
    def typeof : Value = if (dynamic) this else TYPE_EXC
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
      iterator = iterator.sendMessage(Program.Id(MESSAGE_ITERATE)).force()
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
      v.typeConvert(TYPE_STRING) match {
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
      val closed = collector.sendMessage(Program.Id(MESSAGE_COLLECT_CLOSE))
      if (closed == null)
        dynamicException(CONSTRUCTOR_INVALIDMESSAGE, StringValue(MESSAGE_COLLECT_CLOSE))
      else
        closed
    }
    override def collect_add(v : Value) : ExceptionValue =  {
      collector = collector.sendMessage(Program.Id(MESSAGE_COLLECT_ADD))
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
    override def sendMessage(message : Program.Id) : Value = {
      message.name match {
        //case MESSAGE_LIST => this
        case MESSAGE_UMINUS =>
          Evaluator.systemSendMessage(this, "seq", message.name)
        case MESSAGE_APPLY =>
          Evaluator.systemSendMessage(this, "coll", MESSAGE_ATINDEX)
        case MESSAGE_EMPTY =>
          Evaluator.systemSendMessage(this, "list", MESSAGE_EMPTY)
        case m => sendCollectionMessage(this, m)
      }
    }
    def typeof : TypeValue = TYPE_LIST
    def compareToValue(that : Value) : Int = {
      import CompareResult._
      that match {
        case that : ListValue =>
          compareLists(this, that)
        case _ => UNRELATED
      }
    }
  }
  
  case class EmptyListValue() extends ListValue {    
    def stringDescr(brackets : Boolean) : String = {
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
    override def stringDescr(brackets : Boolean) : String = {
      mkBrackets(brackets,
        head.stringDescr(true)+"::" +
          tail.stringDescr(true))
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
    def typeof : TypeValue = TYPE_VECT

    def compareToValue(that : Value) : Int = {
      import CompareResult._
      that match {
        case that : VectorValue =>
          compareVectors(this, that)
        case _ => UNRELATED
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
    override def sendMessage(message : Program.Id) : Value = {
      message.name match {
        //case MESSAGE_VECTOR => this
        case MESSAGE_UMINUS =>
          Evaluator.systemSendMessage(this, "seq", message.name)
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
    def typeof : TypeValue = TYPE_SET
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
    override def sendMessage(message : Program.Id) : Value = {
      message.name match {
        //case MESSAGE_STRING => null
        //case MESSAGE_SET => this
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
    def compareToValue(that : Value) : Int = {
      import CompareResult._
      that match {
        case that : SetValue =>
          compareSets(this, that)
        case _ => UNRELATED
      }
    }
  }
  
  case class MapValue(map : SortedMap[Value, Value]) extends Value {
    def typeof : TypeValue = TYPE_MAP
    def prD (kv : (Value, Value)) : String = {
      kv._1.stringDescr(false)+"->"+kv._2.stringDescr(false)
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
    override def sendMessage(message : Program.Id) : Value = {
      message.name match {
        //case MESSAGE_STRING => null
        //case MESSAGE_MAP => this
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
    def compareToValue(that : Value) : Int = {
      import CompareResult._
      that match {
        case that : MapValue =>
          compareMaps(this, that)
        case _ => UNRELATED
      }
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

  def compareValues(v1 : Value, v2 : Value) : Int = {
    val f1 = v1.force()
    val f2 = v2.force()
    f1.compareToValue(f2)
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
   
  case class LazyValue(var evaluator : Evaluator, var env : Evaluator.SimpleEnvironment, var se : Program.SimpleExpression, var result : Value) extends Value {
    var deep : Boolean = false
    override def stringDescr(brackets : Boolean) : String = {
      "_lazy"
    }
    def typeof : Value = {
      force().typeof
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
    override def sendMessage(message : Program.Id) : Value = {
      return force().sendMessage(message)
    }
    def compareToValue(that : Value) : Int = {
      throw Evaluator.EvalX("internal error, LazyValue should never be compared")
    }
  }

  // this is a special value that lives only inside environments
  abstract class EnvironmentValue(var env : Evaluator.SimpleEnvironment) extends Value {
    var evaluator : Evaluator = null
    var _this : Value = null
    var _messages : SortedSet[Program.Id] = SortedSet()
    def sendMessage(m : Program.Id) : Value = {
      throw Evaluator.EvalX("EnvironmentValue has been sent a message. How?")
    }
    def stringDescr(brackets : Boolean) : String = {
      "_recursive"
    }
    def onLookup() : Value;
    def typeof = throw Evaluator.EvalX("environment value has no type")
    def copy() : EnvironmentValue;
    def setThis(newThis : Value) {
      _this = newThis
    }
    def compareToValue(that : Value) : Int =
      throw Evaluator.EvalX("EnvironentValues cannot be compared")

  }

  case class EnvironmentValueMN(var se : Program.SimpleExpression)
  extends EnvironmentValue(null) {

    def onLookup() : Value = {
      evaluator.evalSE(env.setThis(_this), se)
    }

    def copy() : EnvironmentValue = {
      val e = EnvironmentValueMN(se)
      e.env = env
      e._this = _this
      e.evaluator = evaluator
      e._messages = _messages
      e
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
          localEnv = env.setThis(_this)
          localSE = se
        }
        var r = evaluator.evalSE(localEnv, localSE)
        this.synchronized {
          result = r
          env = null;
          se = null;
        }
        result
      }
    }

    def copy() : EnvironmentValue = {
      this.synchronized {
        val e = EnvironmentValueMS(se, result)
        e.env = env
        e._this = _this
        e._messages = _messages
        e.evaluator = evaluator
        e
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
          localEnv = env.setThis(_this)
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

    def copy() : EnvironmentValue = {
      this.synchronized {
        val e = EnvironmentValueMW(se, cache)
        e.env = env
        e._this = _this
        e._messages = _messages
        e.evaluator = evaluator
        e
      }
    }

  }

  case class ConcurrentValue(evaluator : Evaluator, env : Evaluator.SimpleEnvironment, se : Program.SimpleExpression)
    extends Value with Callable[Value]
  {
    val futureTask = new FutureTask[Value](this)

    def typeof : Value = {
      force().typeof
    }


    def getTask() : FutureTask[Value] = {
      futureTask
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

    override def sendMessage(message : Program.Id) : Value = {
      return force().sendMessage(message)
    }

    def compareToValue(that : Value) : Int = {
      throw Evaluator.EvalX("internal error, ConcurrentValue should never be compared")
    }

  }

  case class TypedValue(innerValue : Value, outerValue : Value, typeValue : TypeValue)
    extends Value
  {

    def typeof : Value = {
      typeValue
    }

    override def stringDescr(brackets : Boolean) : String = {
      mkBrackets(brackets, outerValue.stringDescr(true)+":"+typeValue.path)
    }

    override def sendMessage(message : Program.Id) : Value = {
      return outerValue.sendMessage(message)
    }

    def compareToValue(that : Value) : Int = {
      import CompareResult._
      that match {
        case that : TypedValue =>
          if (typeValue == that.typeValue)
            compareValues(outerValue, that.outerValue)
          else UNRELATED
        case _ => UNRELATED
      }
    }

  
  }


}
