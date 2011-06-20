package com.babel17.naive

import scala.collection.immutable.SortedSet
import scala.collection.immutable.SortedMap


object Program2CPS {

  case class Unsupported(reason : String) extends Exception
  case class InternalError(reason : String) extends Exception

  case class VarRef(var v : CPS.Var)

  case class Env(
    vars : SortedMap[Program.Id, VarRef],
    suspensions : SortedSet[Program.Id],
    collector : Option[CPS.Var])
  {
    def lookup(id : Program.Id) : CPS.Var = vars(id).v
    def bind(id : Program.Id, v : CPS.Var) : Env = {
      Env(vars + (id -> VarRef(v)), suspensions - id, collector)
    }
    def bindSuspension(id : Program.Id, v : CPS.Var) : Env = {
      Env(vars + (id -> VarRef(v)), suspensions + id, collector)
    }
    def isSuspension(id : Program.Id) : Boolean = {
      suspensions.contains(id)
    }
    def rebind(id : Program.Id, v : CPS.Var) : Env = {
      vars(id).v = v
      this
    }
    def setCollector(v : Option[CPS.Var]) : Env = {
      Env(vars, suspensions, v)
    }
    def lookupCollector() : CPS.Var = {
      collector.get
    }
    def copy(ids : SortedSet[Program.Id]) : Env = {
      var vs = vars
      for (id <- ids) {
        vs = vs + (id -> VarRef(lookup(id)))
      }
      Env(vs, suspensions, collector)
    }
  }

  def emptyEnv : Env = Env(SortedMap.empty, SortedSet.empty, None)

  private var freshIdCounter : BigInt = 0

  def freshVar : CPS.Var = {
    val id = "v"+freshIdCounter
    freshIdCounter = freshIdCounter + 1
    CPS.Var(id)
  }

  def translateSE(env : Env, se : Program.SimpleExpression, k : CPS.PrimExp => CPS.ContExp) : CPS.ContExp = {
    se match {
      case Program.SEInt(v) => k(CPS.PrimInt(v))
      case Program.SEBool(b) => k(CPS.PrimBool(b))
      case Program.SEId(id) =>
        if (!env.isSuspension(id))
          k(CPS.PrimVar(env.lookup(id)))
        else {
          val r = freshVar
          val x = freshVar
          CPS.Defs(List(CPS.Continuation(r, List(x), k(CPS.PrimVar(x)))),
            CPS.Apply(CPS.PrimVar(env.lookup(id)), None, List(CPS.PrimVar(r))))
        }
      case Program.SEApply(Program.SEMessageSend(u, m), g) =>
        val r = freshVar
        val x = freshVar
        CPS.Defs(List(CPS.Continuation(r, List(x), k(CPS.PrimVar(x)))),
        translateSE(env, u,
          u => translateSE(env, g,
          g => CPS.Apply(u, Some(CPS.Message(m.name)), List(g, CPS.PrimVar(r))))))
      case Program.SEApply(f, g) =>
        val r = freshVar
        val x = freshVar
        CPS.Defs(List(CPS.Continuation(r, List(x), k(CPS.PrimVar(x)))),
        translateSE(env, f,
          f => translateSE(env, g,
          g => CPS.Apply(f, None, List(g, CPS.PrimVar(r))))))
      case Program.SEMessageSend(u, m) =>
        val r = freshVar
        val x = freshVar
        CPS.Defs(List(CPS.Continuation(r, List(x), k(CPS.PrimVar(x)))),
        translateSE(env, u,
          u => CPS.Apply(u, Some(CPS.Message(m.name)), List(CPS.PrimVar(r)))))
      case Program.SECompare(List(a, b), List(c)) =>
        translateSE(env, a,
          a => translateSE(env, b,
          b => k(CPS.PrimCompare(a, b, c))
          )
        )
      case se => throw Unsupported("translateSE: "+se)
    }
  }

  def translateDef(env : Env, d: Program.Def) : CPS.Def = {
    d match {
      case Program.SDef0(mt, _, id, expr, _) =>
        val k = freshVar
        val cexp = translateExpr(env, expr, (env, pexp) =>
          CPS.Apply(CPS.PrimVar(k), None, List(pexp)))
        CPS.Suspension(env.lookup(id), mt, k, cexp)
      case Program.SDef1(mt, _, id, List((Program.PId(arg), body, _))) =>
        val k = freshVar
        val x = freshVar
        val cexp = translateExpr(env.bind(arg, x),
          body, (env, pexp) => CPS.Apply(CPS.PrimVar(k), None, List(pexp)))
        CPS.Function(env.lookup(id), mt, x, k, cexp)
      case d =>
        throw Unsupported("translateDef: "+d)
    }
  }

  def createVarList(env : Env, vars : SortedSet[Program.Id]) : List[CPS.Var] = {
    val vs = for (v <- vars) yield env.lookup(v)
    vs.toList
  }

  def createJump(env : Env, params : SortedSet[Program.Id],
                 b : Env => CPS.ContExp, k : CPS.Var => CPS.ContExp) : CPS.ContExp =
  {

    var newEnv = env
    for (p <- params)
      newEnv = newEnv.bind(p, freshVar)
    val r = freshVar
    CPS.Defs(List(CPS.Continuation(r, createVarList(newEnv, params), b(newEnv))), k(r))
  }

  def translateBlockAndJump(env : Env, block : Program.Block, r : CPS.Var,
                            params : SortedSet[Program.Id]) : CPS.ContExp =
  {
    translateBlock(env, block,
      env => CPS.Apply(CPS.PrimVar(r), None,
        createVarList(env, params).map(v => CPS.PrimVar(v))))
  }

  def translateSt(env : Env, st : Program.Statement, k : Env => CPS.ContExp) : CPS.ContExp = {
    st match {
      case Program.SVal(Program.PId(id), expr) =>
        val x = freshVar
        translateExpr(env, expr, (env, expr) => CPS.Val(x, expr, k(env.bind(id, x))))
      case Program.SAssign(Program.PId(id), expr) =>
        val x = freshVar
        translateExpr(env, expr, (env, expr) => CPS.Val(x, expr, k(env.rebind(id, x))))
      case Program.SBlock(b) =>
        translateSts(env, b.statements, newEnv => k(env))
      case Program.SYield(expr) =>
        translateExpr(env, expr, (env, expr) =>
          CPS.Yield(env.lookupCollector, expr, k(env)))
      case Program.SDefs(defs) =>
        var newEnv = env
        for (d <- defs) {
          d match {
            case s : Program.SDef0 =>
              newEnv = newEnv.bindSuspension(s.id, freshVar)
            case s : Program.SDef1 =>
              newEnv = newEnv.bind(s.id, freshVar)
          }
        }
        val ds = for (d <- defs) yield translateDef(newEnv, d)
        CPS.Defs(ds.toList, k(newEnv))
      case Program.SIf(cond, yes, no) =>
        val params = yes.assignedVars ++ no.assignedVars
        createJump(env, params, k,
          r =>
            translateSE(env, cond,
              cond =>
                CPS.If(cond,
                  translateBlockAndJump(env.copy(yes.assignedVars), yes, r, params),
                  translateBlockAndJump(env.copy(no.assignedVars), no, r, params)))

        )
      case st => throw Unsupported("translateSt: "+st)
    }
  }


  def translateSts(env : Env, sts : List[Program.Statement],
                   k : Env => CPS.ContExp) : CPS.ContExp =
  {
    sts match {
      case List() => k (env)
      case h::t => translateSt(env, h, newEnv => translateSts(newEnv, t, k))
    }
  }

  def translateBlock(env : Env, b : Program.Block,
                      k : Env => CPS.ContExp) : CPS.ContExp =
  {
    translateSts(env, b.statements, newEnv => k(env))
  }

  def translateExpr(env : Env, expr : Program.Expression, k : (Env, CPS.PrimExp) => CPS.ContExp) : CPS.ContExp = {
    expr match {
      case Program.ESimple(se : Program.SimpleExpression) =>
        translateSE(env, se, pexp => k(env, pexp))
      case Program.EWith(se : Program.SimpleExpression, b : Program.Block) =>
        translateSE(env, se,
          collExpr =>
            {
              val collVar = freshVar
              val closedCallVar = freshVar
              val newEnv = env.setCollector(Some(collVar))
              CPS.WithBegin(Some(collExpr), collVar,
                translateSts(newEnv, b.statements,
                ne => CPS.WithEnd(collVar, closedCallVar,
                    k(env, CPS.PrimVar(closedCallVar)))))
            })
      case Program.EBlock(b) =>
        val collVar = freshVar
        val closedCallVar = freshVar
        val newEnv = env.setCollector(Some(collVar))
        CPS.WithBegin(None, collVar,
          translateSts(newEnv, b.statements,
          ne => CPS.WithEnd(collVar, closedCallVar,
              k(env, CPS.PrimVar(closedCallVar)))))
    }
  }

}