package com.babel17.naive

import Program._
import Values._
import scala.collection.immutable.SortedSet
import scala.collection.immutable.SortedMap
import java.util.concurrent._


object Evaluator {
  case class EvalX(reason : String) extends Exception
  
  case class ValueRef(var value : Value);
  

  case class SimpleEnvironment(nonlinear : SortedMap[Id, Value]) {
    def thaw () : Environment = {
      Environment(nonlinear, SortedMap())
    }
    def lookup(id : Id) : Value = {
      nonlinear(id)
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
}


class Evaluator(val executor : Executor) {
  
  import Evaluator._

  val random : java.util.Random = new java.util.Random()

  /*def lookup (ids : SortedSet[Id], id : Id, linear : Boolean) {
    if (!ids.contains(id)) {
      if (linear) error(id.location, "identifier is not in linear scope")
      else error(id.location, "unknown identifier")
    }
  }*/
 

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
        case UnrelatedX() => return dynamicException(CONSTRUCTOR_UNRELATED)
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
        case UnrelatedX() => return dynamicException(CONSTRUCTOR_UNRELATED)
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

  def mergeObjects(objs : List[ObjectValue]) : ObjectValue = {
    var merged = ObjectValue(SortedMap.empty)
    for (o <- objs) {
      merged = mergeTwoObjects(merged, o)
    }
    merged
  }

  def evalObj(env : SimpleEnvironment, block : Block, messages : List[Message]) : Value = {
    evalBlock(env.thaw, new DefaultCollector(), block) match {
      case BlockException(de) => de
      case BlockCollector(env, _) =>
        var s : SortedMap[Message, Value] = SortedMap.empty
        for (m <- messages) {
          s = s + (m -> env.lookup(Id(m.m)))
        }
        ObjectValue(s)
    }
  }

  def evalObj(parents : Value, env : SimpleEnvironment, block : Block, messages : List[Message]) : Value = {
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
          case o : ObjectValue => mergeTwoObjects(mergeObjects(plist), o)
        }
    }
  }

  def evalSE(env : SimpleEnvironment, se : SimpleExpression) : Value = {
    val u = evalSE_(env, se)
    if (u.isDynamicException && se.stackTraceElement != null) {
      u.asDynamicException.addToStackTrace(se.stackTraceElement)
    }
    u
  }

  def evalSE_(env : SimpleEnvironment, se : SimpleExpression) : Value =
  {
    se match {
      case SEId(id) =>
        env.lookup(id) match {
          case ev : EnvironmentValue => ev.onLookup(this)
          case x => x
        }
      case SEInt(u) => IntegerValue(u)
      case SEBool(b) => BooleanValue(b)
      case SEString(u) => StringValue(u)
      case SEInfinity(p) => InfinityValue(p)
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
        if (v == null) dynamicException(CONSTRUCTOR_INVALIDMESSAGE)
        else v
      case SERecord(messageValuePairs) =>
        var map : SortedMap[Message, Value] = SortedMap()
        for ((m, se) <- messageValuePairs) {
          val v = evalSE(env, se)
          if (v.isDynamicException) return v
          map = map + (m -> v)
        }
        ObjectValue(map)
      case SEApply(fexpr, gexpr) =>
        var f = evalSE(env, fexpr).extractFunctionValue()
        if (f.isDynamicException()) f
        else {
          val fop = f.asInstanceOf[FunctionValue]
          val g = evalSE(env, gexpr)
          if (g.isDynamicException()) g
          else fop.apply(g)
        }
      case SECompare(operands, operators) =>
        var firstOperand = evalSE(env, operands(0)).extractRepresentative()
        if (firstOperand.isDynamicException) return firstOperand
        var operandsList = operands.tail
        var operatorsList = operators
        while (!operatorsList.isEmpty) {
          var secondOperand = evalSE(env, operandsList(0)).extractRepresentative()
          if (secondOperand.isDynamicException) return secondOperand
          var operator = operatorsList(0)
          if (!compareValuesByOp(operator, firstOperand, secondOperand)) 
            return BooleanValue(false)
          firstOperand = secondOperand
          operandsList = operandsList.tail
          operatorsList = operatorsList.tail
        }
        BooleanValue(true)
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
      case SEForce(e, deep) =>
        val v = evalSE(env, e)
        if (deep)
          v.forceDeep()
        else
          v.force()
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
      case SEGlueObj(parents, block, messages) =>
        evalObj(evalSE(env, parents), env, block, messages)
      case SEObj(block, messages) =>
        evalObj(env, block, messages)
      case SEConcurrent(se) =>
        val c = ConcurrentValue(this, env, se)
        executor.execute(c.getTask)
        c
      case _ => throw EvalX("incomplete evalSE: "+se)
    }
  }
  
  def compareValuesByOp(op : Program.CompareOp, u : Value, v : Value) : Boolean = {
    import CompareResult._
    val r = compareValues(u, v)
    op match {
      case Program.LESS_EQ() => r == LESS || r == EQUAL
      case Program.GREATER_EQ() => r == GREATER || r == EQUAL
      case Program.EQUAL() => r == EQUAL
      case Program.LESS() => r == LESS
      case Program.GREATER() => r == GREATER
      case Program.UNEQUAL() => !(r == EQUAL)
    }    
  }

  def evalDefs(env : Environment, coll : Collector, defs : List[Def]) : StatementResult = {
    var values : List[EnvironmentValue] = List.empty
    var e = env
    for (d <- defs) {
      d match {
        case SDef0(m, id, expr) =>
          val se = SEExpr(expr)
          se.stackTraceElement = d.stackTraceElement
          val v = m match {
            case MemoTypeNone() => EnvironmentValueMN(se)
            case MemoTypeWeak() => EnvironmentValueMW(se, null)
            case MemoTypeStrong() => EnvironmentValueMS(se, null)
          }
          e = e.define(id, v)
          values = v :: values
        case SDef1(m, id, branches) =>
          val se = SEFun(m, branches)
          se.stackTraceElement = d.stackTraceElement
          val v = EnvironmentValueMS(se, null)
          e = e.define(id, v)
          values = v :: values
      }
    }
    val senv = e.freeze()
    for (v <- values) v.env = senv
    for (v <- values) {
      val f = v.onLookup(this)
      if (f.isDynamicException) return StatementException(f.asDynamicException)
    }
    StatementCollector(e, coll)
  }

  def evalStatement(env : Environment, coll : Collector, st : Statement) : StatementResult = {
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

  def evalStatement_(env : Environment, coll : Collector, st : Statement) : StatementResult =
  {
    st match {
      case SVal(pat, expr) =>
        val e = evalExpression(env, expr)
        if (e.isDynamicException) return StatementException(e.asDynamicException)
        matchPattern(env, pat, e, false) match {          
          case NoMatch() => StatementException(dynamicException(CONSTRUCTOR_NOMATCH))
          case DoesMatch(newEnv) => StatementCollector(newEnv, coll)
        }
      case SAssign(pat, expr) =>
        val e = evalExpression(env, expr)
        if (e.isDynamicException) return StatementException(e.asDynamicException)
        matchPattern(env, pat, e, true) match {
          case NoMatch() => StatementException(dynamicException(CONSTRUCTOR_NOMATCH))
          case DoesMatch(newEnv) => StatementCollector(newEnv, coll)
        }
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
      case SPragma(pragma) =>
        pragma match {
          case PragmaLog(expr) =>
            println("log (at "+st.location+"): '"+evalExpression(env,expr).force()+"'")
          case PragmaAssert(expr) =>
            evalExpression(env, expr) match {
              case BooleanValue(true) =>
              case x => println("assertion failed (at "+st.location+"): '"+x+"'")
            }
          case PragmaProfile(expr) =>
            val t1 = System.currentTimeMillis
            val v = evalExpression(env, expr)
            val t2 = System.currentTimeMillis
            println("profile (at "+st.location+"): "+(t2-t1)+"ms, result = '"+v+"'")
        }
        StatementCollector(env, coll)
      case SAssignRecordUpdate(id, m, expr) =>
        val e = evalExpression(env, expr)
        if (e.isDynamicException) StatementException(e.asDynamicException)
        else {
          env.lookup(id).force() match {
            case ObjectValue(map) =>
              StatementCollector(env.rebind(id, ObjectValue(map + (m -> e))), coll)
            case _ => StatementException(dynamicException(CONSTRUCTOR_UPDATEERROR))
          }
        }
      case SValRecordUpdate(id, m, expr) =>
        val e = evalExpression(env, expr)
        if (e.isDynamicException) StatementException(e.asDynamicException)
        else {
          val x = ObjectValue(SortedMap(m -> e))
          StatementCollector(env.bind(id, x), coll)
        }
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
            case DoesMatch(blockEnv) =>
              evalBlock(blockEnv, coll, block) match {
                case BlockException(ex) => return StatementException(ex)
                case BlockCollector(_,_) => return StatementCollector(env, coll)
              }
          }
        }
        StatementException(dynamicException(CONSTRUCTOR_NOMATCH))
      }
      case _ => throw EvalX("incomplete evalStatement: "+st) // dummy expression
    }
  }
  
  def evalExpression(env : Environment, expr : Expression) : Value = {
    expr match {
      case ESimple(se) => evalSE(env.freeze(), se)
      case EBlock(block) => evalBlock(env, new DefaultCollector(), block).collect_close()
      case EWith(se, block) =>
        val v = collectorOfValue(evalSE(env.freeze(), se))
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

  def logInvisibleException(ex : ExceptionValue) {
  }
    

  def matchPattern(env : Environment, pat : Pattern, v : Value, rebind : Boolean) : MatchResult = {
    if (rebind) {
      val rebindEnv = env.beginRebinding(pat.introducedVars)
      matchPat(rebindEnv, pat, v, true) match {
        case NoMatch() => NoMatch()
        case DoesMatch(_) =>
          DoesMatch(env.endRebinding(rebindEnv, pat.introducedVars))
      }
    } else
      matchPat(env, pat, v, false)
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
      if (next == null) return NoMatch()
      if (next.isDynamicException) {
        logInvisibleException(next.asDynamicException)
        return NoMatch()
      }
      matchPat(currentEnv, p, next, rebind) match {
        case NoMatch() => return NoMatch()
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
        v.force() match {
          case StringValue(t) =>
            if (s == t) DoesMatch(env)
            else NoMatch()
          case _ => NoMatch()
        }
      case PInt(i) =>
        v.force() match {
          case IntegerValue(j) =>
            if (i == j) DoesMatch(env)
            else NoMatch()
          case _ => NoMatch()
        }
      case PBool(p) =>
        v.force() match {
          case BooleanValue(q) =>
            if (p == q) DoesMatch(env)
            else NoMatch()
          case _ => NoMatch()
        }
      case PInfinity(p) =>
        v.force() match {
          case InfinityValue(q) =>
            if (p == q) DoesMatch(env)
            else NoMatch()
          case _ => NoMatch()
        }
      case PVal(expr) =>
        val u = evalSE(env.freeze, expr)
        if (u.isDynamicException) {
          logInvisibleException(u.asDynamicException)
          NoMatch()
        }
        else {
          if (compareValues(u, v) == CompareResult.EQUAL) DoesMatch(env)
          else NoMatch()
        }
      case PException(p) =>
        v.force() match {
          case ex:ExceptionValue => matchPat(env, p, ex, rebind)
          case _ => NoMatch()
        }
      case PVector(plist, delta) =>
        v.force() match {
          case vector : VectorValue =>
            matchForIterator(env, plist, delta, iteratorOfValue(vector), rebind, identity)
          case list : ListValue =>
            matchForIterator(env, plist, delta, iteratorOfValue(list), rebind, _.asInstanceOf[ListValue].toVectorValue)
          case _ => NoMatch()
        }
      case PList(plist, delta) =>
        v.force() match {
          case vector : VectorValue =>
            matchForIterator(env, plist, delta, iteratorOfValue(vector), rebind, _.asInstanceOf[VectorValue].toListValue)
          case list : ListValue =>
            matchForIterator(env, plist, delta, iteratorOfValue(list), rebind, identity)
          case _ => NoMatch()
        }
      case PSet(plist, delta) =>
        v.force() match {
          case set : SetValue =>
            matchForIterator(env, plist, delta, iteratorOfValue(set), rebind, identity)
          case _ => NoMatch()
        }
      case PFor(plist, delta) =>
        matchForIterator(env, plist, delta, iteratorOfValue(v), rebind, identity)
      case PMap(kvlist, delta) =>
        v.force() match {
          case map : MapValue =>
            val plist = kvlist.map(kv => PVector(List(kv._1, kv._2), null))
            matchForIterator(env, plist, delta, iteratorOfValue(map), rebind, identity)
          case _ => NoMatch()
        }
      case PAs(id, pat) =>
        matchPat(env, pat, v, rebind) match {
          case NoMatch() => NoMatch()
          case DoesMatch(currentEnv) =>
            val newEnv = if (rebind) env.rebind(id, v) else env.bind(id, v)
            DoesMatch(newEnv)
        }
      case PConstr(constr, pat) =>
        v.force() match {
          case ConstructorValue(c, arg) =>
            if (c == constr)
              matchPat(env, pat, arg, rebind)
            else
              NoMatch()
          case _ => NoMatch()
        }
      case PCons(head, tail) =>
        v.force() match {
          case vector : VectorValue =>
            matchForIterator(env, List(head), tail, iteratorOfValue(vector), rebind, _.asInstanceOf[VectorValue].toListValue)
          case list : ListValue =>
            matchForIterator(env, List(head), tail, iteratorOfValue(list), rebind, identity)
          case _ => NoMatch()
        }
      case PIf(pat, cond) =>
        matchPat(env, pat, v, rebind) match {
          case NoMatch() => NoMatch()
          case DoesMatch(env) =>
            evalSE(env.freeze, cond).force() match {
              case BooleanValue(true) =>
                DoesMatch(env)
              case x =>
                if (x.isException) logInvisibleException(x.asInstanceOf[ExceptionValue])
                NoMatch()
            }
        }
      case PRecord(fields, delta) =>
        v.force() match {
          case ObjectValue(messages) =>
            var map = messages
            var currentEnv = env
            for ((m, p) <- fields) {
              if (!messages.contains(m)) return NoMatch()
              map = map - m
              matchPat(currentEnv, p, messages(m), rebind) match {
                case NoMatch() => return NoMatch()
                case DoesMatch(env) =>
                  currentEnv = env
              }
            }
            if (delta == null) {
              if (map.isEmpty) DoesMatch(currentEnv)
              else NoMatch()
            } else {
              matchPat(currentEnv, delta, ObjectValue(map), rebind)
            }
          case x =>
            if (x.isException) logInvisibleException(x.asInstanceOf[ExceptionValue])
            NoMatch()
        }
      case PPredicate(pred, pat) =>
        val f = evalSE(env.freeze, pred).force()
        if (f.isException) {
          logInvisibleException(f.asInstanceOf[ExceptionValue])
          return NoMatch()
        }
        f match {
          case f : FunctionValue =>
            val y = f.apply(v)
            if (y.isDynamicException) {
              logInvisibleException(y.asDynamicException())
              return NoMatch()
            }
            matchPat(env, pat, y, rebind)
          case c =>
            val y = v.sendMessage(Message(MESSAGE_DECONSTRUCT))
            if (y == null) return NoMatch()
            y.force() match {
              case f: FunctionValue =>
                val y = f.apply(c)
                if (y.isDynamicException) {
                  logInvisibleException(y.asDynamicException())
                  return NoMatch()
                }
                matchPat(env, pat, y, rebind)
              case ex:ExceptionValue =>
                logInvisibleException(ex)
                NoMatch()
              case _  => NoMatch()
            }
        }
      case _ => throw EvalX("incomplete matchPattern: "+pat)
   }
  }


}