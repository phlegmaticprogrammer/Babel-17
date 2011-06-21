package com.babel17.naive

import Program._
import scala.collection.immutable.SortedSet
import scala.collection.immutable.SortedMap
import com.babel17.syntaxtree.Location
import com.babel17.syntaxtree.Source
import com.babel17.interpreter.parser.ErrorMessage

class LinearScope(moduleSystem : ModuleSystem) extends ErrorProducer {

 /* var errors : List[ErrorMessage] = List.empty
  var source : Source = null

  def error (loc : com.babel17.syntaxtree.Location, msg : String) = {
    var l = loc;
    if (loc == null) l = new Location(source, 0,0)
    errors = (new ErrorMessage(l, msg)) :: errors
    //println("at "+loc+": "+msg)
  }*/

  def lookup (ids : SortedSet[Id], id : Id, linear : Boolean) {
    if (!ids.contains(id)) {
      if (linear) error(id.location, "identifier is not in linear scope")
      else {
        moduleSystem.find(Path(List(id))) match {
          case Some(ModuleSystem.Found(pd, flags)) =>
            if ((flags & (ModuleSystem.FoundDef + ModuleSystem.FoundPackage)) != 0) {
              // ok
            } else error(id.location, "unknown identifier")
          case _ => error(id.location, "unknowsn identifier")
        }
      }
    }
  }
  
  case class SimpleEnvironment(nonlinear : SortedSet[Id]) {
    def thaw () : Environment = {
      Environment(nonlinear, SortedSet())
    }
/*    def removeThis() : SimpleEnvironment = {
      val t = Id("this")
      SimpleEnvironment(nonlinear - t)
    }
    def hasThis : Boolean = {
      val t = Id("this")
      nonlinear.contains(t)
    }*/
  }

  val OBJECT_STATEMENT = 1
  val MODULE_STATEMENT = 2
  val TOPLEVEL_STATEMENT = 4
  
  case class Environment(nonlinear : SortedSet[Id], linear : SortedSet[Id]) {
    def freeze () : SimpleEnvironment = {
      SimpleEnvironment(nonlinear ++ linear)
    }
    def freezeThaw () : Environment = {
      Environment(nonlinear ++ linear, SortedSet())
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
    /*def defineThis () : Environment = {
      this.define(Id("this"))
    }*/
    /*def defineModule() : Environment = {
      this.define(Id("$module"))
    }
    def inModule : Boolean = {
      nonlinear.contains(Id("$module"))
    }*/
  }
  
  def emptyEnv () : Environment = Environment(SortedSet(), SortedSet())
  
  def check (env : Environment, t : Term) {
    val st_flags = TOPLEVEL_STATEMENT
    CollectVars.collectVars(t)
    checkNoThis(t.freeVars)
    t match {
      case b : Block => check_b(env, b, st_flags)
      case st : Statement => check_st(env, st, st_flags)
      case e : Expression => check_e(env, e)
      case se : SimpleExpression => check_simple(env.freeze(), se)
    }
  }  
     
  def check_b (env : Environment, b : Block, st_flags : Int) {
    var e = env
    for (s <- b.statements) {
      e = check_st (e, s, st_flags)
    }
    e
  }
  
  def check_st (env : Environment, st : Statement, st_flags : Int) : Environment = {
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
      case SPragma(PragmaCatch(e, p)) =>
        check_e(env, e)
        check_p(env, p, false)
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
      case d: SImport => env.define(d.id)
      case SDef0(_, _, id, e, _) =>
        val env2 = env.define(id)
        check_e(env2.freezeThaw(), e)
        env2
      case SDef1(_, _, id, branches) =>
        val env2 = env.define(id)
        for ((pat, e, _) <- branches) {
          check_e(check_p(env2.freezeThaw(), pat, false), e)
        }
        env2
      case STypeDef(_, _, id, _,branches) =>
        if ((st_flags & MODULE_STATEMENT) == 0) error(id.location, "typedefs live in modules only")
        val env2 = env.define(id)
        for ((pat, e) <- branches) {
          var env3 = check_p(env2.freezeThaw(), pat, false)
          //if ((st_flags & OBJECT_STATEMENT) != 0) env3 = env3.defineThis()
          e match {
            case Some(e) => check_e(env3, e)
            case None =>
          }
        }
        env2
      case SConversionDef(_, e) =>
        val env2 = env //env.defineThis()
        if ((st_flags & OBJECT_STATEMENT) == 0)
          error(st.location, "conversions live in objects only")
        check_e(env2.freezeThaw(), e)
        env
      case SDefs(defs) =>
        var env2 = env
        for (d <- defs) {
          var vis : Visibility = VisibilityYes()
          d match {
            case d: SDef0 =>
              env2 = env2.define(d.id)
              vis = d.visibility
            case d: SDef1 =>
              env2 = env2.define(d.id)
              vis = d.visibility
            case d: STypeDef =>
              env2 = env2.define(d.id)
              vis = d.visibility
            case _ =>
          }
          if ((vis != VisibilityYes()) && ((st_flags & (OBJECT_STATEMENT + MODULE_STATEMENT)) == 0))
            error(vis.location, "no private statement allowed here")
        }
        defs.foreach(check_st (env2, _, st_flags))
        env2
      case SYield(e) =>
        check_e(env, e)
        env
      case SBlock(b) => 
        check_b(env, b, 0)
        env
      case SModule(path, b) =>
        val toplevel = st_flags & TOPLEVEL_STATEMENT
        if (toplevel == 0)
          error(path.location, "module statement must appear only at toplevel")
        check_b(emptyEnv(), b, MODULE_STATEMENT)
        env
      case SIf(cond, yes, no) =>
        check_simple(env.freeze(), cond)
        check_b(env, yes, 0)
        check_b(env, no, 0)
        env
      case SWhile(cond, body) =>
        check_simple(env.freeze(), cond)
        check_b(env, body, 0)
        env
      case SFor(pat, col, body) =>
        check_simple(env.freeze(), col)
        val env2 = check_p(env, pat, false)
        check_b(env2, body, 0)
        env
      case SMatch(se, branches) =>
        check_simple(env.freeze(), se)
        for ((pat, b) <- branches) {
          check_b(check_p(env, pat, false), b, 0)
        }
        env
      case STry(block, branches) =>
        check_b(env, block, 0)
        for ((pat, b) <- branches) {
          check_b(check_p(env, pat, false), b, 0)
        }
        env
    }
  }
  
  def check_e (env : Environment, e : Expression) {
    e match {
      case ESimple(se) =>
        check_simple(env.freeze(), se)
      case EBlock(b) =>
        check_b(env, b, 0)
      case EWith(se, body) =>
        check_simple(env.freeze(), se)
        check_b(env, body, 0)
    }
    
  }

  def calcDefDeps(b : Block) : (SortedSet[Id], SortedMap[Id, (Def, SortedSet[Id])]) = {
    CollectVars.collectVars(b)
    val defIds = CollectVars.collectDefIds(b.statements)
    var deps : SortedMap[Id, (Def, SortedSet[Id])] = SortedMap()
    def idOfDef(d : Def) : Id = {
      d match {
        case d : SDef0 => d.id
        case d : SDef1 => d.id
        case d : STypeDef => d.id
        case _ => null
      }
    }
    def addDef(d : Def) {
      val frees = d.freeVars
      val id = idOfDef(d)
      if (id != null) {
        deps = deps + (id -> (d, frees ** defIds))
      }
    }
    for (st <- b.statements) {
      st match {
        case d : Def => addDef(d)
        case SDefs(defs) =>
          for (d <- defs) addDef(d)
        case _ =>
      }
    }
    (defIds, deps)
  }

  def checkNoThis(f : SortedSet[Id]) : Boolean = {
    val g = f ** SortedSet(Id("this"))
    if (!g.isEmpty) {
      val id = g.head
      error(id.location, "'this' is not in scope")
      false
    } else true
  }

  def checkObjForThis(b : Block) {
    val (defIds, deps) = calcDefDeps(b)
    val _this = Id("this");
    var thisDefs : SortedSet[Id] = SortedSet()
    for ((id, (d, ds)) <- deps) {
      if (d.freeVars.contains(_this)) thisDefs = thisDefs + id
    }
    if (thisDefs.isEmpty) return
    var rest = defIds -- thisDefs
    var changed = true
    while (changed) {
      changed = false
      for (r <- rest) {
        deps.get(r) match {
          case Some((_, ds)) => {
            if (!(ds ** thisDefs).isEmpty) {
              changed = true
              rest = rest - r
              thisDefs = thisDefs + r
            }
          }
          case _ =>
        }
      }
    }
    for (st <- b.statements) {
      if (statementIsExecutable(st)) {      
        if (checkNoThis(st.freeVars)) {
          val t = st.freeVars ** thisDefs
          if (!t.isEmpty) {
            val id = t.head
            error(id.location, "statement depends indirectly (via '"+id+"') on 'this'")
          }
        }
      }
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
        for ((pat, e, _) <- branches) {
          check_e(check_p(tEnv, pat, false), e)
        }
      case SETypeIntro(_, _, branches) =>
        val tEnv = env.thaw()
        for ((pat, e) <- branches) {
          if (e != None)
            check_e(check_p(tEnv, pat, false), e.get)
          else
            check_p(tEnv, pat, false)
        }
      case SEObj(b, _) =>
        checkObjForThis(b)
        check_b(env/*.removeThis()*/.thaw(), b, OBJECT_STATEMENT)
      case SEGlueObj(parents, b, _) =>
        CollectVars.collectVars(parents)
        if (parents.freeVars.contains(Id("this"))) {
          error(parents.location, "'this' is not in scope")
        }
        checkObjForThis(b)
        val env2 = env //env.removeThis()
        check_simple(env2, parents)
        check_b(env2.thaw(), b, OBJECT_STATEMENT)
      case SEThis() =>
        /*if (!env.hasThis)
          error (simple.location, "no 'this' allowed here")*/
      case SERoot() =>
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
          check_pat(env, pattern)
        case PDestruct(constructor, pattern) =>
          check_simple(env.freeze(), constructor)
          check_pat(env, pattern)
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
