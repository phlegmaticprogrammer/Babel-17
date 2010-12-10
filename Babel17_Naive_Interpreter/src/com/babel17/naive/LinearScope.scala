package com.babel17.naive

import Program._
import scala.collection.immutable.SortedSet
import com.babel17.syntaxtree.Location
import com.babel17.syntaxtree.Source
import com.babel17.interpreter.parser.ErrorMessage



class LinearScope {

  var errors : List[ErrorMessage] = List.empty
  var source : Source = null

  def error (loc : com.babel17.syntaxtree.Location, msg : String) = {
    var l = loc;
    if (loc == null) l = new Location(source, 0,0)
    errors = (new ErrorMessage(l, msg)) :: errors
    //println("at "+loc+": "+msg)
  }

  def lookup (ids : SortedSet[Id], id : Id, linear : Boolean) {
    if (!ids.contains(id)) {
      if (linear) error(id.location, "identifier is not in linear scope")
      else error(id.location, "unknown identifier")
    }
  }
  
  case class SimpleEnvironment(nonlinear : SortedSet[Id]) {
    def thaw () : Environment = {
      Environment(nonlinear, SortedSet())
    }
  }
  
  case class Environment(nonlinear : SortedSet[Id], linear : SortedSet[Id]) {
    def freeze () : SimpleEnvironment = {
      SimpleEnvironment(nonlinear ++ linear)
    }
    def bind (id : Id) : Environment = {
      Environment(nonlinear - id, linear + id)
    }
    def bind (ids : SortedSet[Id]) : Environment = {
      Environment(nonlinear -- ids, linear ++ ids)
    }
    def rebind (id : Id) : Environment = {
      lookup(linear, id, true)
      this
    }
    def rebind (ids : SortedSet[Id]) : Environment = {
      for (id <- ids)
        lookup(linear, id, true)
      this
    }
    def define (id : Id) : Environment = {
      Environment(nonlinear + id, linear - id)
    }
  }
  
  def emptyEnv () : Environment = Environment(SortedSet(), SortedSet())
  
  def check (env : Environment, t : Term) {
    t match {
      case b : Block => check_b(env, b)
      case st : Statement => check_st(env, st)
      case e : Expression => check_e(env, e)
      case se : SimpleExpression => check_simple(env.freeze(), se)
    }
  }
  
     
  def check_b (env : Environment, b : Block) {
    var e = env
    for (s <- b.statements) {
      e = check_st (e, s)
    }
    e
  }
  
  def check_st (env : Environment, st : Statement) : Environment = {
    st match {
      case SPragma(PragmaPrint(e)) =>
        check_e(env, e)
        env
      case SPragma(PragmaLog(e)) =>
        check_e(env, e)
        env
      case SPragma(PragmaProfile(e)) =>
        check_e(env, e)
        env
      case SPragma(PragmaAssert(e)) =>
        check_e(env, e)
        env
      case SVal(p, e) =>
        check_e(env, e)
        check_p(env, p, false)
      case SAssign(p, e) =>
        check_e(env, e)
        check_p(env, p, true)
      case SValRecordUpdate(id, m, e) =>
        check_e(env, e)
        env.bind(id)
      case SAssignRecordUpdate(id, m, e) =>
        check_e(env, e)
        env.rebind(id)
      case SDef0(_, id, e) =>
        val env2 = env.define(id)
        check_e(env2, e)
        env2
      case SDef1(_, id, branches) =>
        val env2 = env.define(id)
        for ((pat, e) <- branches) {
          check_e(check_p(env2.freeze().thaw(), pat, false), e)
        }
        env2
      case SDefs(defs) =>
        var env2 = env
        for (d <- defs) {
          d match {
            case SDef0(_, id, _) =>
              env2 = env2.define(id)
            case SDef1(_, id, _) =>
              env2 = env2.define(id)
          }
        }
        defs.foreach(check_st (env2, _))
        env2
      case SYield(e) =>
        check_e(env, e)
        env
      case SBlock(b) => 
        check_b(env, b)
        env
      case SIf(cond, yes, no) =>
        check_simple(env.freeze(), cond)
        check_b(env, yes)
        check_b(env, no)
        env
      case SWhile(cond, body) =>
        check_simple(env.freeze(), cond)
        check_b(env, body)
        env
      case SFor(pat, col, body) =>
        check_simple(env.freeze(), col)
        val env2 = check_p(env, pat, false)
        check_b(env2, body)
        env
      case SMatch(se, branches) =>
        check_simple(env.freeze(), se)
        for ((pat, b) <- branches) {
          check_b(check_p(env, pat, false), b)
        }
        env
    }
  }
  
  def check_e (env : Environment, e : Expression) {
    e match {
      case ESimple(se) =>
        check_simple(env.freeze(), se)
      case EBlock(b) =>
        check_b(env, b)
      case EWith(se, body) =>
        check_simple(env.freeze(), se)
        check_b(env, body)
    }
    
  }

  def check_simple (env : SimpleEnvironment, simple : SimpleExpression) {
    simple match {
      case SEId(id) =>
        lookup(env.nonlinear, id, false)
      case SEExpr(e) => 
        check_e(env.thaw, e)
      case SEFun(_, branches) =>
        val tEnv = env.thaw()
        for ((pat, e) <- branches) {
          check_e(check_p(tEnv, pat, false), e)
        }
      case SEObj(b, _) =>
        check_b(env.thaw(), b)
      case SEGlueObj(parents, b, _) =>
        check_simple(env, parents)
        check_b(env.thaw(), b)
      case se : SimpleExpression =>
        for (s <- CollectVars.subSimpleExpressions(se)) {
          check_simple(env, s)
        }
    } 
  }
  
  def check_p (env : Environment, pat : Pattern, rebind : Boolean) : Environment = {
    CollectVars.collectVars(pat)
    def check_pat(env : Environment, pat : Pattern) {
      pat match {
        case PVal(value) =>
          check_simple(env.freeze(), value)
        case PPredicate(predicate, pattern) =>
          check_simple(env.freeze(), predicate) 
          if (pattern != null) check_pat(env, pattern)
        case PIf(pattern, condition) =>
          val new_env = check_p(env, pattern, rebind)
          check_simple(new_env.freeze(), condition)
        case PAs(id, pattern) =>
          check_pat(env, pattern)
          if (pattern.introducedVars.contains(id))
            error(id.location, "pattern variable may be bound only once")
          else if (pattern.freeVars.contains(id))
            error(id.location, "pattern variable clashes with free variable")
        case _ =>
          val subps = CollectVars.subPatterns(pat)
          var intros : SortedSet[Id] = SortedSet()
          var frees : SortedSet[Id] = SortedSet()
          for (p <- subps) {
            check_pat(env, p)
            var inter = p.introducedVars ** intros
            if (inter.size != 0) {
              error(inter.head.location, "pattern variable may be bound only once")
            }
            inter = p.freeVars ** intros
            if (inter.size != 0) {
              error(inter.head.location, "pattern variable clashes with free variable")
            }
            inter = p.introducedVars ** frees
            if (inter.size != 0) {
              error(inter.head.location, "pattern variable clashes with free variable")
            }
            intros = intros ++ p.introducedVars
            frees = frees ++ p.freeVars
          }
      }
    }
    check_pat(env, pat)
    if (rebind)
      env.rebind(pat.introducedVars)
    else
      env.bind(pat.introducedVars)
  }

}
