package com.babel17.naive

import Program._
import Values._
import scala.collection.immutable.SortedSet
import scala.collection.immutable.SortedMap
import java.util.concurrent._
import com.babel17.syntaxtree.Source


object Evaluator {
  case class EvalX(reason : String) extends Exception {
    override def toString() : String = {
      "EvalX: "+reason
    }
  }
  
  case class ValueRef(var value : Value);
  

  val ID_THIS = Id("this")

  case class SimpleEnvironment(nonlinear : SortedMap[Id, Value]) {
    def thaw () : Environment = {
      Environment(nonlinear, SortedMap())
    }
    def lookup(id : Id) : Value = {
      nonlinear(id)
    }
    def setThis(_this : Value) : SimpleEnvironment = {
      if (_this != null)
        SimpleEnvironment(nonlinear + (ID_THIS -> _this))
      else
        this
    }
    def replace(r : SortedMap[Id, Value]) : SimpleEnvironment = {
      SimpleEnvironment(nonlinear ++ r)
    }
  }
  
  case class Environment(nonlinear : SortedMap[Id, Value], linear : SortedMap[Id, ValueRef]) {
    def freeze () : SimpleEnvironment = {
      SimpleEnvironment(nonlinear ++ linear.mapValues(_.value))
    }
    def bind (id : Id, v : Value) : Environment = {
      Environment(nonlinear - id, linear + (id -> ValueRef(v)))
    }
    def bind (ids : SortedMap[Id, Value]) : Environment = {
      val nl : SortedMap[Id, Value] = nonlinear -- ids.keys
      val l : SortedMap[Id, ValueRef] = linear ++ (ids.mapValues(ValueRef(_)))
      Environment(nl, l)
    
    }
    def rebind (id : Id, v : Value) : Environment = {
      linear(id).value = v
      this
    }
    def rebind (ids : SortedMap[Id, Value]) : Environment = {
      for ((id, v) <- ids)
        linear(id).value = v
      this
    }
    def beginRebinding(ids : SortedSet[Id]) : Environment = {
      var l = linear
      for (i <- ids) {
        l = l + (i -> ValueRef(linear(i).value))
      }
      Environment(nonlinear, l)
    }
    def endRebinding(env : Environment, ids : SortedSet[Id]) : Environment = {
      var l = env.linear
      for (i <- ids) {
        linear(i).value = l(i).value
      }
      this
    }
    def define (id : Id, e : Value) : Environment = {
      Environment(nonlinear + (id -> e), linear - id)
    }
    def lookup(id : Id) : Value = {
      try {
        linear(id).value
      } catch {
        case _ => nonlinear(id)
      }
    }
  }
  
  def emptyEnv : Environment = {
    Environment(SortedMap.empty, SortedMap.empty)
  }
  
  abstract class MatchResult  
  case class NoMatch() extends MatchResult 
  case class DoesMatch(env : Environment) extends MatchResult
  case class MatchX(x:ExceptionValue) extends MatchResult

  abstract class StatementResult
  case class StatementException(de : ExceptionValue) extends StatementResult
  case class StatementCollector(env : Environment, c : Collector) extends StatementResult
  
  abstract class BlockResult {
    def collect_close() : Value
  }
  case class BlockException(de : ExceptionValue) extends BlockResult  {
    override def collect_close() : Value = {
      de
    }
  }
  case class BlockCollector(env : Environment, c : Collector) extends BlockResult {
    override def collect_close() : Value = {
      c.collect_close()
    }    
  }

  var systemLibrary : Map[String, FunctionValue] = Map.empty

  def systemSendMessage(target : Value, message : String) : Value = {
    systemLibrary.get(message) match {
      case Some(v) => v.apply(target)
      case _ => throw EvalX("system message '"+message+"' not found for value '"+target+"'")
    }
  }

  def systemSendMessage(target : Value, typ : String , message : String) : Value = {
    systemSendMessage(target, typ+"_"+message)
  }


}

class AssertionRecorder() {
  @volatile
  var successes : Int = 0
  @volatile
  var failures : Int = 0
  def succeeded() { successes = successes + 1 }
  def failed() { failures = failures + 1}
  def clear() {
    failures = 0
    successes = 0
  }
  def stats : String = {
    if (failures == 0) 
      "(all "+successes+" assertions held up)"
    else  
      "("+failures+" out of "+(successes + failures)+" assertion(s) failed)"
  }
}

case class EvaluationOptions(val assertions : Boolean, val javalibs : String) 


class Evaluator(val maxNumThreads : Int, val fileCentral : FileCentral,
  val evaluationOptions : EvaluationOptions) 
{
 
  import Evaluator._

  var executor : ThreadPoolExecutor = null
  val assertionRecorder = new AssertionRecorder()

  val moduleValues = new ModuleValues(this, fileCentral)  

  if (maxNumThreads > 1) {
    executor = new ThreadPoolExecutor(0, maxNumThreads-1, 500L, TimeUnit.MILLISECONDS,
      new SynchronousQueue())
    executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy())
  }

  val random : java.util.Random = new java.util.Random()
  var writeOutput : WriteOutput = null
  
  var javainterop = new JavaInterop(this, evaluationOptions.javalibs)

  def writeline(s : String) {
    if (writeOutput != null) {
      writeOutput.writeLine(s)
    }
  }

  def checkCancel() {
    if (writeOutput != null && writeOutput.pleaseCancel) {
      throw EvalX("program terminated by user")
    }
  } 

  def evaluate(env : Environment, term : Term) : Value = {
    term match {
      case block : Block =>
        evalBlock(env, new DefaultCollector(), block).collect_close()
      case _ => throw EvalX("incomplete evaluate") // dummy expression
        
    }
  }
  
  def evalList(env : SimpleEnvironment, l : List[SimpleExpression]) : Value = {
    if (l.isEmpty)
      EmptyListValue()
    else {
      val h = evalSE(env, l.head)
      if (h.isDynamicException) return h
      val t = evalList(env, l.tail)
      if (t.isDynamicException) return t
      ConsListValue(h, t)
    }
  }

  def evalVector(env : SimpleEnvironment, l : List[SimpleExpression]) : Value = {
    val count = l.length
    val v : Array[Value] = new Array(count)
    var i = 0
    for (e <- l) {
      val x = evalSE(env, e)
      if (x.isDynamicException) return x
      v(i) = x
      i = i + 1
    }
    VectorValue(v)
  }
  
  def evalSet(env : SimpleEnvironment, l : List[SimpleExpression]) : Value = {
    var s = SortedSet.empty(defaultValueOrdering)
    for (e <- l) {
      val x = evalSE(env, e)
      if (x.isDynamicException) return x
      try {
        s = s + x
      } catch {
        case Values.UnrelatedX => return dynamicException(CONSTRUCTOR_UNRELATED)
      }
    }
    SetValue(s)
  }

  def evalMap(env : SimpleEnvironment, l : List[(SimpleExpression, SimpleExpression)]) : Value = {
    var s : SortedMap[Value, Value] = SortedMap.empty(defaultValueOrdering)
    for ((_k, _v) <- l) {
      val k = evalSE(env, _k)
      if (k.isException) return k.asDynamicException
      val v = evalSE(env, _v)
      if (v.isDynamicException) return v
      try {
        s = s + (k -> v)
      } catch {
        case Values.UnrelatedX => return dynamicException(CONSTRUCTOR_UNRELATED)
      }
    }
    MapValue(s)
  }
  
  def randomBigInt(n : BigInt) : BigInt = {
    var r : BigInt = 0
    do {
      val x : java.math.BigInteger = new java.math.BigInteger(n.bitLength, random)
      r = new BigInt(x)
    } while (r >= n)
    r
  }

  def getParentsFromList(l : ListValue) : Object = {
    l match {
      case EmptyListValue() => List.empty
      case ConsListValue(head, tail) =>
        head.force() match {
          case h : ObjectValue =>
            getParentsFromList(Values.normalizeListTail(tail)) match {
              case t : List[ObjectValue] => h :: t
              case x : ExceptionValue => x.asDynamicException
              case _ => dynamicException(CONSTRUCTOR_INVALIDPARENT)
            }

        }
    }
  }

  def getParentsFromSet(l : SetValue) : Object = {
    var parents : List[ObjectValue] = List.empty
    for (e <- l.set) {
      e.force() match {
        case o : ObjectValue => parents = o :: parents
        case x : ExceptionValue => return x.asDynamicException
        case _ => return dynamicException(CONSTRUCTOR_INVALIDPARENT)
      }
    }
    return parents.reverse
  }

  def getParentsFromVector(l : VectorValue) : Object = {
    var parents : List[ObjectValue] = List.empty
    for (e <- l.tuple) {
      e.force() match {
        case o : ObjectValue => parents = o :: parents
        case x : ExceptionValue => return x.asDynamicException
        case _ => return dynamicException(CONSTRUCTOR_INVALIDPARENT)
      }
    }
    return parents.reverse
  }

  def mergeTwoObjects(o1 : ObjectValue, o2 : ObjectValue) : ObjectValue = {
    ObjectValue(o1.messages ++ o2.messages)
  }

  def mergeObjects(objs : List[ObjectValue], _this : Value) : ObjectValue = {
    objs match {
      case h :: t => 
        val g = h.copy()
        g.setThis(_this)
        mergeTwoObjects(mergeObjects(t, _this), g)
      case _ => ObjectValue(SortedMap.empty)
    }
    /*
    var merged = ObjectValue(SortedMap.empty)
    for (o <- objs) {
      merged = mergeTwoObjects(merged, o)
    }
    merged                                             */
  }

  def evalObj(env : SimpleEnvironment, block : Block, messages : SortedSet[Id]) : Value = {
    evalBlock(env.thaw, new DefaultCollector(), block) match {
      case BlockException(de) => de
      case BlockCollector(env, _) =>
        var s : SortedMap[Id, Value] = SortedMap.empty
        for (m <- messages) 
          s = s + (m -> env.lookup(m))
        val x = ObjectValue(s)
        x.setEnvMessages(messages)
        x.setThis(x)
        x
    }
  }

  def evalObj(parents : Value, env : SimpleEnvironment, block : Block, messages : SortedSet[Id]) : Value = {
    var result : Object = null
    parents.force() match {
      case ex : ExceptionValue => return ex.asDynamicException
      case lv : ListValue => result = getParentsFromList(lv)
      case sv : SetValue => result = getParentsFromSet(sv)
      case vv : VectorValue => result = getParentsFromVector(vv)
      case _ => return dynamicException(CONSTRUCTOR_INVALIDPARENTS)
    }
    result match {
      case ex : ExceptionValue => return ex.asDynamicException
      case plist : List[ObjectValue] =>
        evalObj(env, block, messages) match {
          case ex : ExceptionValue => ex.asDynamicException
          case o : ObjectValue =>
            mergeTwoObjects(mergeObjects(plist, o), o)
        }
    }
  }

  def evalSE(env : SimpleEnvironment, se : SimpleExpression) : Value = {
    checkCancel()
    val u = evalSE_(env, se)
    if (u.isDynamicException && se.stackTraceElement != null) {
      u.asDynamicException.addToStackTrace(se.stackTraceElement)
    }
    u
  }

  def evalModule(path : Path) : Value = {
    moduleValues.findModuleValue(path)
  }
  
  
  def evalExtremum(msg : String, env: SimpleEnvironment, se : SimpleExpression) : Value = {
    val v = evalSE(env, se)
    if (v.isException) v.asDynamicException
    else systemSendMessage(v, msg)
  }
  
  def evalId(env : SimpleEnvironment, id: Id) : Value = {
    var v : Value = null
    try {
      v = env.lookup(id)
    } catch {
      case x : java.util.NoSuchElementException =>
        val path = Path(List(id))
        return evalModule(path)
    }
    v match {
      case ev : EnvironmentValue => ev.onLookup()
      case x => x
    }   
  }

  def evalSE_(env : SimpleEnvironment, se : SimpleExpression) : Value =
  {
    se match {
      case SEId(id) => evalId(env, id)
      case SEThis() =>
          env.lookup(ID_THIS) match {
            case ev : EnvironmentValue => ev.onLookup()
            case x => x
          }
      case SERoot() => evalModule(Path(List()))
      case SEMax(se) => evalExtremum("maximum", env, se)
      case SEMin(se) => evalExtremum("minimum", env, se)
      case SENative(se) =>
        val v = evalSE(env, se)
        v match {
          case e: Exception => v.asDynamicException
          case constrValue: ConstructorValue =>
            if (constrValue.constr.name == "PLATFORM") {
              if (constrValue.v.isNil(true))
                ConstructorValue(Constr("JAVA"), Values.nil)
              else
                domainError
            } else if (constrValue.constr.name == "NEW") {
              javainterop.evalNew (constrValue.v)
            } else if (constrValue.constr.name == "CLASS") {
              javainterop.evalNewClassObj(constrValue.v)
            } else domainError
          case _ => domainError
        }
      case SEInt(u) => IntegerValue(u)
      case SEBool(b) => BooleanValue(b)
      case f : SEFloat => f.realValue
      case SEInterval(a, b) =>
        import IntervalArithmetic.{RealValue, interval}
        toDomain(TYPE_REAL, evalSE(env, a)) match {
          case u : RealValue =>
            toDomain(TYPE_REAL, evalSE(env, b)) match {
              case v : RealValue => interval(u, v)
              case x : Exception => x
              case _ => Values.domainError                
            }
          case x : Exception => x
          case _ => Values.domainError
        }
      case SEString(u) => StringValue(u)
      case SEConstr(constr, se) => 
        val v = evalSE(env, se)
        if (v.isDynamicException) v
        else ConstructorValue(constr, v)
      case SEException(se) => 
        val v = evalSE(env, se)
        if (v.isDynamicException) v
        else ExceptionValue(true, v)
      case SEMessageSend(target, message) =>
        val v = evalSE(env, target).sendMessage(message)
        if (v == null) dynamicException(CONSTRUCTOR_INVALIDMESSAGE, StringValue(message.name))
        else v
      case SELensSend(target, lensExpr) =>
        val x = evalSE(env, target)
        if (x.isDynamicException) x
        else {
          val lens = evalSE(env, lensExpr).force()
          if (lens.isException) lens.asDynamicException
          else {
            lens.typeConvert(true, Values.TYPE_LENS) match {
              case l: Lens.LensValue => l.lensGet (x)
              case _ => 
                val f = lens.extractFunctionValue
                if (f.isException) f.asDynamicException
                else f.asInstanceOf[FunctionValue].apply(x)
            }
          }
        }
      case SERecord(messageValuePairs) =>
        var map : SortedMap[Id, Value] = SortedMap()
        for ((m, se) <- messageValuePairs) {
          val v = evalSE(env, se)
          if (v.isDynamicException) return v
          map = map + (m -> v)
        }
        ObjectValue(map)
      case SEApply(fexpr, gexpr) =>
        var f = evalSE(env, fexpr)
        if (f.isDynamicException) f
        else {
          val g = evalSE(env, gexpr)
          if (g.isDynamicException) g
          else {
            f = f.extractFunctionValue()
            if (f.isDynamicException) f
            else {
              f.asInstanceOf[FunctionValue].apply(g)
            }
          }
        }
      case SECompare(operands, operators) =>
        var firstOperand = evalSE(env, operands(0))
        if (firstOperand.isDynamicException) return firstOperand
        var operandsList = operands.tail
        var operatorsList = operators
        while (!operatorsList.isEmpty) {
          var secondOperand = evalSE(env, operandsList(0))
          if (secondOperand.isDynamicException) return secondOperand
          var operator = operatorsList(0)
          compareValuesByOp(operator, firstOperand, secondOperand) match {
            case Some(true) =>
            case Some(false) => return BooleanValue(false)
            case None => return Values.dynamicException(Values.CONSTRUCTOR_UNRELATED)
          }
          firstOperand = secondOperand
          operandsList = operandsList.tail
          operatorsList = operatorsList.tail
        }
        BooleanValue(true)
      case SERelate(u, v) =>
        import Values.CompareResult._
        val xu = evalSE(env, u).force()
        if (xu.isDynamicException) return xu
        val xv = evalSE(env, v)
        if (xv.isDynamicException) return xv
        val c = Values.compareValues(xu, xv)
        c match {
          case LESS => IntegerValue(-1)
          case EQUAL => IntegerValue(0)
          case GREATER => IntegerValue(1)
          case UNRELATED => Values.dynamicException(Values.CONSTRUCTOR_UNRELATED)
        }        
      case SECons(u, v) =>
        val xu = evalSE(env, u)
        if (xu.isDynamicException) return xu
        val xv = evalSE(env, v)
        if (xv.isDynamicException) return xv
        ConsListValue(xu, xv)
      case SESet(l) => evalSet(env, l)
      case SEMap(l) => evalMap(env, l)
      case SEList(l) => evalList(env, l)
      case SEVector(l) => evalVector(env, l)
      case SERandom(e) =>
        evalSE(env, e).force() match {
          case x@ExceptionValue(_, p) => x.asDynamicException
          case IntegerValue(n) => 
            if (n <= 0) dynamicException(CONSTRUCTOR_DOMAINERROR)
            else IntegerValue(randomBigInt(n))
          case _ => dynamicException(CONSTRUCTOR_DOMAINERROR)            
        }
      case SELazy(e) => LazyValue(this, env, e, null)
      case SEChoose(e) => 
        val v = evalSE(env, e)
        if (v.isDynamicException) v
        else v.choose()
      case SEForce(e) =>
        evalSE(env, e).force()
      case lens : SELens => Lens.evalLens(this, env, lens)
      case SEDirectLens(f, g) =>
        val u = evalSE(env, f).extractFunctionValue
        val v = evalSE(env, g).extractFunctionValue
        (u, v) match {
          case (x:FunctionValue, y:FunctionValue) =>
            Lens.FunctionsLensValue(x, y)
          case (x:ExceptionValue, _) => x.asDynamicException
          case (_, y:ExceptionValue) => y.asDynamicException
          case _ => Lens.lensError("pair of functions as lens arguments expected")
        }
      case SENot(e) =>
        evalSE(env, e) match {
          case BooleanValue(b) => BooleanValue (!b)
          case x => if (x.isException) x.asDynamicException else domainError()
        }
      case SEOr(u,v) => 
        evalSE(env, u) match {
          case BooleanValue(a) =>
            if (a) BooleanValue(a)
            else evalSE(env, v) match {
              case BooleanValue(b) => BooleanValue(b)
              case x => if (x.isException) x.asDynamicException else domainError()
            }
          case x =>
            if (x.isException) x.asDynamicException else domainError()
        }
      case SEXor(u,v) => 
        evalSE(env, u) match {
          case BooleanValue(a) =>
            evalSE(env, v) match {
              case BooleanValue(b) => BooleanValue(a != b)
              case x => if (x.isException) x.asDynamicException else domainError()
            }
          case x =>
            if (x.isException) x.asDynamicException else domainError()
        }        
      case SEAnd(u,v) => 
        evalSE(env, u) match {
          case BooleanValue(a) =>
            if (!a) BooleanValue(false)
            else evalSE(env, v) match {
              case BooleanValue(b) => BooleanValue(b)
              case x => if (x.isException) x.asDynamicException else domainError()
            }
          case x =>
            if (x.isException) x.asDynamicException else domainError()
        }
      case SEExpr(e) => evalExpression(env.thaw, e)
      case SEFun(m, branches) =>
        val f = m match {
          case MemoTypeNone() => ClosureValue(this, env, branches)
          case _ => ClosureValueMS(this, env, branches)
        }
        f.stackTraceElement = se.stackTraceElement
        f
      case SETypeIntro(m, ty, branches) =>
        val f = TypeIntroValue(this, env, TypeValue(ty), branches)
        f.stackTraceElement = se.stackTraceElement
        f
      case SEGlueObj(parents, block, messages) =>
        evalObj(evalSE(env, parents), env, block, messages)
      case SEObj(block, messages) =>
        evalObj(env, block, messages)
      case SEConcurrent(se) =>
        if (executor == null || executor.getActiveCount() >= maxNumThreads-1) {
          evalSE(env, se)
        } else {
          val c = ConcurrentValue(this, env, se)
          executor.execute(c.getTask)
          c
        }
      case SETypeOf(se) =>
        evalSE(env, se).typeof
      case SETypeExpr(path : Path) =>
        TypeValue(path)
      case SEConvert(se, Left(ty)) =>
        evalSE(env, se).typeConvert(false, TypeValue(ty))
      case SEConvert(se, Right(tyExpr)) =>
        evalSE(env, tyExpr).force() match {
          case ty:TypeValue =>
            evalSE(env, se).typeConvert(false, ty)
          case x:ExceptionValue =>
            x.asDynamicException
          case _ =>
            Values.dynamicException(CONSTRUCTOR_DOMAINERROR, StringValue("type expected"))
        }
      case _ => throw EvalX("incomplete evalSE: "+se)
    }
  }
  
  def compareValuesByOp(op : Program.CompareOp, u : Value, v : Value) : Option[Boolean] = {
    import CompareResult._
    val r = compareValues(u, v)
    if (r == UNRELATED) return None
    Some (op match {
      case Program.LESS_EQ() => r == LESS || r == EQUAL
      case Program.GREATER_EQ() => r == GREATER || r == EQUAL
      case Program.EQUAL() => r == EQUAL
      case Program.LESS() => r == LESS
      case Program.GREATER() => r == GREATER
      case Program.UNEQUAL() => !(r == EQUAL)
    })
  }

  def evalDefs(env : Environment, coll : Collector, defs : List[Def]) : StatementResult = {
    var values : List[EnvironmentValue] = List.empty
    var e = env
    for (d <- defs) {
      d match {
        case SDef0(m, _, id, expr, ty) =>
          var se : SimpleExpression = SEExpr(expr)
          ty match {
            case TypeNone() =>
            case TypeSome(p) =>
              se = SEConvert(se, Left(p))
          }
          se.stackTraceElement = d.stackTraceElement
          val v = m match {
            case MemoTypeNone() => EnvironmentValueMN(se)
            case MemoTypeWeak() => EnvironmentValueMW(se, null)
            case MemoTypeStrong() => EnvironmentValueMS(se, null)
          }
          e = e.define(id, v)
          values = v :: values
        case SDef1(m, _, id, branches) =>
          val se = SEFun(m, branches)
          se.stackTraceElement = d.stackTraceElement
          val v = EnvironmentValueMS(se, null)
          e = e.define(id, v)
          values = v :: values
        case STypeDef(m, _, id, ty, branches) =>
          val se = SETypeIntro(m, ty, branches)
          se.stackTraceElement = d.stackTraceElement
          val v = EnvironmentValueMS(se, null)
          e = e.define(id, v)
          values = v :: values
      }
    }
    val senv = e.freeze()
    for (v <- values) {
      v.env = senv
      v.evaluator = this
    }
    /*for (v <- values) {
      val f = v.onLookup(this)
      if (f.isDynamicException) return StatementException(f.asDynamicException)
    }*/
    StatementCollector(e, coll)
  }

  def evalStatement(env : Environment, coll : Collector, st : Statement) : StatementResult = {
    checkCancel()
    val u = evalStatement_(env, coll, st)
    u match {
      case StatementException(ex) =>
        if (st.stackTraceElement != null)
          ex.addToStackTrace(st.stackTraceElement)
        else
          ex.addToStackTrace(StackTraceElement(st.location, "statement"))
        u
      case _ => u
    }
  }
  
  def toDomain(dom : TypeValue, v : Value) : Value = {
    v.typeConvert(true, dom)
  }

  def evalStatement_(env : Environment, coll : Collector, st : Statement) : StatementResult =
  {
    st match {
      case SVal(pat, expr) =>
        val e = evalExpression(env, expr)
        if (e.isDynamicException) return StatementException(e.asDynamicException)
        matchPattern(env, pat, e, false) match {          
          case NoMatch() => StatementException(dynamicException(CONSTRUCTOR_NOMATCH))
          case MatchX(x) => StatementException(x)
          case DoesMatch(newEnv) => StatementCollector(newEnv, coll)
        }
      case SAssign(pat, expr) =>
        val e = evalExpression(env, expr)
        if (e.isDynamicException) return StatementException(e.asDynamicException)
        matchPattern(env, pat, e, true) match {
          case NoMatch() => StatementException(dynamicException(CONSTRUCTOR_NOMATCH))
          case MatchX(x) => StatementException(x)
          case DoesMatch(newEnv) => StatementCollector(newEnv, coll)
        }
      case SLensAssign(id, lensExpr:SELens, expr) =>
        val e = evalExpression(env, expr)
        if (e.isDynamicException) return StatementException(e.asDynamicException)
        val senv = env.freeze
        val lens = evalSE(senv, lensExpr)
        lens match {
          case l: Lens.LensValue =>
            val x = evalId(senv, id)
            if (x.isDynamicException) return StatementException(x.asDynamicException)
            val y = l.lensPut(x, e)
            if (y.isDynamicException) return StatementException(y.asDynamicException)
            StatementCollector(env.rebind(id, y), coll)
          case x:ExceptionValue => StatementException(x.asDynamicException)
          case _ => StatementException(Lens.lensError("lens expected, found: '"+lens.stringDescr(false)+"'"))
        }
      case SLensModify(id, lensExpr:SELens, expr, f) =>
        val e = evalExpression(env, expr)
        if (e.isDynamicException) return StatementException(e.asDynamicException)
        val senv = env.freeze
        val g = evalSE(senv, f).extractFunctionValue
        if (g.isException) return StatementException(g.asDynamicException)
        def F(v : Value) : Value = {
          g.asInstanceOf[FunctionValue].apply(VectorValue(Array(v, e)))
        }
        val lens = evalSE(senv, lensExpr)
        lens match {
          case l: Lens.LensValue =>
            val x = evalId(senv, id)
            if (x.isDynamicException) return StatementException(x.asDynamicException)
            val y = l.lensModify(x, F)
            if (y.isDynamicException) return StatementException(y.asDynamicException)
            StatementCollector(env.rebind(id, y), coll)
          case x:ExceptionValue => StatementException(x.asDynamicException)
          case _ => StatementException(Lens.lensError("lens expected, found: '"+lens.stringDescr(false)+"'"))
        }        
      case SImport(path, id) =>
        var se : SimpleExpression = SEId(path.ids.head)
        for (message <- path.ids.tail) se = SEMessageSend(se, message)
        val v = EnvironmentValueMN(se)
        v.env = env.freeze
        v.evaluator = this
        StatementCollector(env.define(id, v), coll)
      case SYield(expr) =>
        val e = evalExpression(env, expr)
        if (e.isDynamicException) StatementException(e.asInstanceOf[ExceptionValue])
        else {
          val c = coll.collect_add(e)
          if (c != null && c.isDynamicException) StatementException(c.asInstanceOf[ExceptionValue])
          else StatementCollector(env, coll)
        }
      case SBlock(block) =>
        evalBlock(env, coll, block) match {
          case BlockCollector(_, c) => StatementCollector(env, c)
          case BlockException(de) => StatementException(de)
        }
      case SIf(cond, yesBlock, noBlock) =>
        evalSE(env.freeze, cond) match {
          case x : ExceptionValue => StatementException(x.asDynamicException())
          case BooleanValue(b) =>
            (if (b)
              evalBlock(env, coll, yesBlock)
            else
              evalBlock(env, coll, noBlock))
            match {
              case BlockException(de) => StatementException(de)
              case BlockCollector(_, c) => StatementCollector(env, c)
            }
          case _ => StatementException(domainError())
        }
      case SDefs(defs) => evalDefs(env, coll, defs)
      case d : SDef0 => evalDefs(env, coll, List(d))
      case d : SDef1 => evalDefs(env, coll, List(d))
      case d : STypeDef => evalDefs(env, coll, List(d))
      case SPragma(pragma) =>
        pragma match {
          case PragmaPrint(expr) =>
            if (writeOutput != null) {
              val s = evalExpression(env,expr).toString
              writeOutput.writeLocMsg("print", st.location, s)
            }
          case PragmaLog(expr) =>
            if (writeOutput != null) {
              val s = evalExpression(env,expr).force().toString
              writeOutput.writeLocMsg("log", st.location, s)
            }
          case PragmaAssert(expr) =>
            if (evaluationOptions.assertions) {
              evalExpression(env, expr) match {
                case BooleanValue(true) =>
                  assertionRecorder.succeeded()
                case x =>
                  assertionRecorder.failed()
                  if (writeOutput != null) {
                    writeOutput.writeFailedAssertion(st.location, x.toString)
                  }
              }
            }
          case PragmaCatch(expr, pat) =>
            if (evaluationOptions.assertions) {
              def failed(x : Value) {
                assertionRecorder.failed()
                if (writeOutput != null) {
                  writeOutput.writeFailedAssertion(st.location, x.toString)
                }
              }
              evalExpression(env, expr) match {
                case ex: ExceptionValue =>
                  matchPattern(env, pat, ex.v, false) match {
                    case NoMatch () => failed(ex)
                    case MatchX (x) => failed(x)
                    case DoesMatch(_) =>
                      assertionRecorder.succeeded()
                  }
                case x => failed(x)
              }
            }
          case PragmaProfile(expr) =>
            val t1 = System.currentTimeMillis
            val v = evalExpression(env, expr)
            val t2 = System.currentTimeMillis
            if (writeOutput != null) {
              writeOutput.writeProfile(st.location, t2-t1, v.toString)
            }
        }
        StatementCollector(env, coll)
 /*     case SAssignRecordUpdate(id, m, expr) =>
        val e = evalExpression(env, expr)
        if (e.isDynamicException) StatementException(e.asDynamicException)
        else {
          env.lookup(id).force() match {
            case o: ObjectValue =>
              val p = ObjectValue(o.messages + (m -> e))
              val q = p.copy()
              q.setThis(q)
              StatementCollector(env.rebind(id, q), coll)
            case _ => StatementException(dynamicException(CONSTRUCTOR_UPDATEERROR))
          }
        }
      case SValRecordUpdate(id, m, expr) =>
        val e = evalExpression(env, expr)
        if (e.isDynamicException) StatementException(e.asDynamicException)
        else {
          val x = ObjectValue(SortedMap(m -> e))
          StatementCollector(env.bind(id, x), coll)
        }*/
      case SWhile(cond, block) =>
        do {
          evalSE(env.freeze, cond).force() match {
            case x : ExceptionValue => return StatementException(x.asDynamicException)
            case BooleanValue(false) => return StatementCollector(env, coll)
            case BooleanValue(true) =>
              evalBlock(env, coll, block) match {
                case BlockCollector(_, _) =>
                  // nothing needs to be done, all the changes are in env
                case BlockException(de) => return StatementException(de)
              }
            case _ => dynamicException(CONSTRUCTOR_INVALIDWHILECONDITION)
          }
        } while (true)
        throw EvalX("Infinite while loop terminated ?!")
      case SFor(pat, collection, block) =>
        val c = evalSE(env.freeze, collection).force()
        if (c.isException) return StatementException(c.asDynamicException)
        var iterator = iteratorOfValue(c)
        do {
          val v = iterator.nextValue()
          if (v == null) return StatementCollector(env, coll)
          if (v.isDynamicException) return StatementException(v.asDynamicException)
          matchPattern(env, pat, v, false) match {
            case NoMatch() =>
              // do nothing
            case MatchX(x) => return StatementException(x)
            case DoesMatch(blockEnv) =>
              evalBlock(blockEnv, coll, block) match {
                case BlockException(ex) => return StatementException(ex)
                case BlockCollector(_,_) =>
                  // do nothing, block has been successfully processed
              }
          }
        } while (true)
        throw EvalX("Infinite while loop terminated ?!")
      case SMatch(expr, branches) => {
        val e = evalSE(env.freeze, expr)
        for ((pat, block) <- branches) {
          matchPattern(env, pat, e, false) match {
            case NoMatch() =>
              // do nothing, go to next branch
            case MatchX(x) => 
              return StatementException(x)
            case DoesMatch(blockEnv) =>
              evalBlock(blockEnv, coll, block) match {
                case BlockException(ex) => return StatementException(ex)
                case BlockCollector(_,_) => return StatementCollector(env, coll)
              }
          }
        }
        val x = 
          if (e.isDynamicException) 
            e.asDynamicException 
        else
            dynamicException(CONSTRUCTOR_NOMATCH)
        StatementException(x)
      }
      case STry(mainblock, branches) => {
        var ex : ExceptionValue = null
        evalBlock(env, coll, mainblock) match {
          case BlockCollector(_,_) =>
            return StatementCollector(env, coll)
          case BlockException(x) =>
            ex = x
        }
        for ((pat, block) <- branches) {
          matchPattern(env, pat, ex.v, false) match {
            case NoMatch() =>
              // do nothing, go to next branch
            case MatchX(x) =>
              return StatementException(x)
            case DoesMatch(blockEnv) =>
              evalBlock(blockEnv, coll, block) match {
                case BlockException(ex) => return StatementException(ex)
                case BlockCollector(_,_) => return StatementCollector(env, coll)
              }
          }
        }
        StatementException(ex)
      }
      case _ => throw EvalX("incomplete evalStatement: "+st) // dummy expression
    }
  }
  
  def evalExpression(env : Environment, expr : Expression) : Value = {
    expr match {
      case ESimple(se) => evalSE(env.freeze(), se)
      case EBlock(block) => evalBlock(env, new DefaultCollector(), block).collect_close()
      case EWith(se, block) =>
        val c = evalSE(env.freeze(), se).force()
        if (c.isException) return c.asDynamicException
        val v = collectorOfValue(c)
        evalBlock(env, v, block).collect_close()
    }
  }
  
  def evalBlock(env : Environment, coll : Collector, block : Block) : BlockResult = {
    var e = env
    var c = coll
    for (st <- block.statements) {
      evalStatement(e, c, st) match {
        case StatementCollector(newEnv, newColl) =>
          e = newEnv
          c = newColl
        case StatementException(x) =>
          return BlockException(x)
      }
    }
    BlockCollector(e, c)
  }    

  def matchPattern(env : Environment, pat : Pattern, v : Value, rebind : Boolean) : MatchResult = {
    if (rebind) {
      val rebindEnv = env.beginRebinding(pat.introducedVars)
      matchPat(rebindEnv, pat, v, true) match {
        case NoMatch() => NoMatch()
        case MatchX(x) => MatchX(x)
        case DoesMatch(_) =>
          DoesMatch(env.endRebinding(rebindEnv, pat.introducedVars))
      }
    } else {
      matchPat(env, pat, v, false)
    }
  }

  def matchForIterator(env : Environment, pats : List[Pattern], delta : Pattern, iterator : ForIterator,
                       rebind : Boolean, convertRest : (Value) => Value)
    : MatchResult =
  {
    var currentEnv = env
    var it = iterator
    var next : Value = null
    iterator.length match {
      case None =>
      case Some(l) =>
        if (delta == null && l != pats.length) return NoMatch()
        if (delta != null && l < pats.length) return NoMatch()
    }
    for (p <- pats) {
      next = it.nextValue
      if (next == null || next.isDynamicException) return NoMatch()
      matchPat(currentEnv, p, next, rebind) match {
        case NoMatch() => return NoMatch()
        case MatchX(x) => return MatchX(x)
        case DoesMatch(env) =>
          currentEnv = env
      }
    }
    if (delta == null) {
      if (it.nextValue == null) DoesMatch(currentEnv)
      else NoMatch()
    } else {
      matchPat(currentEnv, delta, convertRest(it.rest), rebind)
    }
  }

  def matchPat(env : Environment, pat : Pattern, v : Value, rebind : Boolean) : MatchResult = {
    checkCancel()
    if (v.isDynamicException) {
      pat match {
        case PException(parg) =>
          return matchPat(env, parg, v.asDynamicException.v, rebind)
        case _ => return NoMatch()
      }
    }
    pat match {
      case PId(id) =>
        DoesMatch(if (rebind) env.rebind(id, v) else env.bind(id, v))
      case PAny() =>
        DoesMatch(env)
      case PEllipsis() =>
        DoesMatch(env)
      case PString(s) =>
        v.typeConvert(true, TYPE_STRING) match {
          case StringValue(t) =>
            if (s == t) DoesMatch(env)
            else NoMatch()
          case _ => NoMatch()
        }
      case PInt(i) =>
        v.typeConvert(true, TYPE_INT) match {
          case IntegerValue(j) =>
            if (i == j) DoesMatch(env)
            else NoMatch()
          case _ => NoMatch()
        }
      case PBool(p) =>
        v.typeConvert(true, TYPE_BOOL) match {
          case BooleanValue(q) =>
            if (p == q) DoesMatch(env)
            else NoMatch()
          case _ => NoMatch()
        }
      case PVal(expr) =>
        val u = evalSE(env.freeze, expr)
        if (u.isException) {
          MatchX(u.asDynamicException)
        }
        else {
          if (compareValues(u, v) == CompareResult.EQUAL) DoesMatch(env)
          else NoMatch()
        }
      case PException(p) =>
        v.force() match {
          case ex:ExceptionValue => matchPat(env, p, ex.v, rebind)
          case _ => NoMatch()
        }
      case PVector(plist, delta) =>
        v.typeConvert(true, TYPE_VECT) match {
          case vector : VectorValue =>
            matchForIterator(env, plist, delta, iteratorOfValue(vector), rebind, identity)
          case _ => NoMatch()
        }
      case PList(plist, delta) =>
        v.typeConvert(true, TYPE_LIST) match {
          case list : ListValue =>
            matchForIterator(env, plist, delta, iteratorOfValue(list), rebind, identity)
          case _ => NoMatch()
        }
      case PSet(plist, delta) =>
        v.typeConvert(true, TYPE_SET) match {
          case set : SetValue =>
            matchForIterator(env, plist, delta, iteratorOfValue(set), rebind, identity)
          case _ => NoMatch()
        }
      case PFor(plist, delta) =>
        matchForIterator(env, plist, delta, iteratorOfValue(v), rebind, identity)
      case PMap(kvlist, delta) =>
        v.typeConvert(true, TYPE_MAP) match {
          case map : MapValue =>
            val plist = kvlist.map(kv => PVector(List(kv._1, kv._2), null))
            matchForIterator(env, plist, delta, iteratorOfValue(map), rebind, identity)
          case _ => NoMatch()
        }
      case PAs(id, pat) =>
        matchPat(env, pat, v, rebind) match {
          case NoMatch() => NoMatch()
          case MatchX(x) => MatchX(x)
          case DoesMatch(env) =>
            val newEnv = if (rebind) env.rebind(id, v) else env.bind(id, v)
            DoesMatch(newEnv)
        }
      case PConstr(constr, pat) =>
        v.typeConvert(true, TYPE_CEXP) match {
          case ConstructorValue(c, arg) =>
            if (c == constr)
              matchPat(env, pat, arg, rebind)
            else
              NoMatch()
          case _ => NoMatch()
        }
      case PCons(head, tail) =>
        v.typeConvert(true, TYPE_LIST) match {
          case list : ListValue =>
            matchForIterator(env, List(head), tail, iteratorOfValue(list), rebind, identity)
          case _ => NoMatch()
        }
      case PIf(pat, cond) =>
        matchPat(env, pat, v, rebind) match {
          case NoMatch() => NoMatch()
          case MatchX(x) => MatchX(x)
          case DoesMatch(env) =>
            evalSE(env.freeze, cond).force() match {
              case BooleanValue(true) =>
                DoesMatch(env)
              case x:ExceptionValue =>
                MatchX(x.asDynamicException)
              case x =>
                NoMatch()
            }
        }
      case PRecord(fields, delta) =>
        v.typeConvert(true, TYPE_OBJ) match {
          case ObjectValue(messages) =>
            var map = messages
            var currentEnv = env
            for ((m, p) <- fields) {
              var x : Value = null
              messages.get(m) match {
                case None => return NoMatch()
                case Some(e:EnvironmentValue) => x = e.onLookup
                case Some(y) => x = y
              }
              map = map - m
              if (x.isDynamicException) return NoMatch()
              matchPat(currentEnv, p, x, rebind) match {
                case NoMatch() => return NoMatch()
                case MatchX(x) => return MatchX(x)
                case DoesMatch(env) =>
                  currentEnv = env
              }
            }
            if (!delta) {
              if (map.isEmpty) DoesMatch(currentEnv)
              else NoMatch()
            } else {
              return DoesMatch(currentEnv)
            }
          case x =>
            NoMatch()
        }
      case PPredicate(pred, pat) =>
        val f = evalSE(env.freeze, pred).extractFunctionValue
        if (f.isDynamicException) {
          return MatchX(f.asDynamicException)
        }
        f match {
          case f : FunctionValue =>
            val y = f.apply(v)
            if (y.isDynamicException) {
              return MatchX(y.asDynamicException)
            }
            matchPat(env, pat, y, rebind)
        }
      case PDestruct(weapon, pat) =>
        val c = evalSE(env.freeze, weapon).force()
        if (c.isDynamicException) {
          return MatchX(c.asDynamicException)
        }
        val y = v.sendMessage(Id(MESSAGE_DESTRUCT))
        if (y == null) return NoMatch()
        y.extractFunctionValue match {
          case f: FunctionValue =>
            val y = f.apply(c)
            if (y.isDynamicException) {
              y.asDynamicException.v.force() match {
                case ConstructorValue(Constr(CONSTRUCTOR_DOMAINERROR), _) =>
                  return NoMatch()
                case _ =>
              }
              return MatchX(y.asDynamicException)
            }
            matchPat(env, pat, y, rebind)
          case ex:ExceptionValue =>
            MatchX(ex.asDynamicException)
          case _  => NoMatch()
        }
      case PInnerValue(ty, pat) =>
        v.force() match {
          case TypedValue(inner, _, vty) =>
            if (vty.path == ty)
              matchPat(env, pat, inner, rebind)
            else
              NoMatch()
          case _ => NoMatch()
        }
      case PType(pat, TypeNone()) =>
        matchPat(env, pat, v, rebind)
      case PType(pat, TypeSome(ty)) =>
        val u = v.typeConvert(true, TypeValue(ty))
        u.typeof match {
          case TypeValue(vty) =>
            if (vty == ty)
              matchPat(env, pat, u, rebind)
            else
              NoMatch()
          case _ => NoMatch()
        }
      case PTypeVal(pat, tyExpr) =>
        evalSE(env.freeze(), tyExpr).force() match {
          case TypeValue(ty) =>
            matchPat(env, PType(pat, TypeSome(ty)), v, rebind)
          case x:ExceptionValue => MatchX(x.asDynamicException)
          case _ => NoMatch()
        }
      case _ => throw EvalX("incomplete matchPattern: "+pat)
   }
  }


  def loadSystemLibrary() : Map[String, FunctionValue] = {
    import java.io.InputStreamReader

    import org.antlr.runtime.ANTLRReaderStream
    import com.babel17.interpreter.parser.Parser

    // get a reader for
    val systemFilename = Interpreter.getClass.getResource("system.b17").toString
    val inputStream = Interpreter.getClass.getResourceAsStream("system.b17")
    val inputReader = new InputStreamReader(inputStream, "UTF-8")
    val charstream = new ANTLRReaderStream(inputReader)
    val source = new Source(systemFilename)
    val result = Parser.parse(source, charstream)
    val fc = new FileCentral()
    fc.updateB17File(source, result)
    val (term, termErrors) = fc.getScript(systemFilename).get
    val errors = fc.getErrors ++ termErrors
    if (errors.length > 0) throw EvalX("static errors in system library")
    var sys : Map[String, FunctionValue] = Map.empty
    evalBlock(Evaluator.emptyEnv, new DefaultCollector(), term.asInstanceOf[Program.Block]) match {
      case BlockException(de) => throw EvalX("dynamic error in system library")
      case BlockCollector(env, _) =>
        for ((id, v) <- env.freeze.nonlinear) {
          v match {
            case ev: EnvironmentValue =>
              ev.onLookup.force() match {
                case f: FunctionValue =>
                  sys = sys + (id.name -> f)
                  /*if (writeOutput != null) {
                    writeOutput.writeLineCommentary("loaded function '"+id.name+"' into system library")
                  }  */
                case _ =>
              }
            case _ =>
          }
        }
    }
    inputReader.close()
    return sys
  }


}