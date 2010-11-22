package com.babel17.naive

import Program._
import scala.collection.immutable.SortedSet


object CollectVars {

  def collectDefIds(statements : List[Statement]) : SortedSet[Id] = {
    var defVars = SortedSet[Id]()
    for (s <- statements) {
      s match {
        case d : SDef0 => defVars = defVars + d.id
        case d : SDef1 => defVars = defVars + d.id
        case d : TempDef0 => defVars = defVars + d.id
        case d : TempDef1 => defVars = defVars + d.id
        case SDefs(ds) =>
            defVars = defVars ++ collectDefIds(ds)
        case _ => 
      } 
    }
    defVars
  }
  
  /*
   * How do I deal with this kind of stuff ?
   * 1. Find out what the defIds of the block are (easy)
   * 2. Find out on what other defIds of this block the defs depend on (intersect free vars of defs with defIds)
   * 3. For each statement and a given variable, find out the highest index of the statement where that variable has been assigned or introduced
   *    (for introduced this is easy and can be read off statements flatly; for assigned this is more difficult as we might need to look
   *     deeply into statements)
   */ 
  
  def collectVars(term : Term) {
    if (term.freeVars != null && term.introducedVars != null && term.assignedVars != null) return;
    term.freeVars = SortedSet()
    term.introducedVars = SortedSet()
    term.assignedVars = SortedSet()
    term match {
      case Block(statements) => 
        val defVars = collectDefIds(statements)
        var freeVars = SortedSet[Id]()
        var introducedVars = SortedSet[Id]()
        var assignedVars = SortedSet[Id]()
        for (s <- statements) {
          collectVars(s)
          freeVars = freeVars ++ ((s.freeVars -- introducedVars) -- assignedVars)
          introducedVars = introducedVars ++ s.introducedVars
          assignedVars = assignedVars ++ (s.assignedVars -- introducedVars)
        } 
        term.freeVars = freeVars -- defVars
        term.assignedVars = assignedVars -- defVars
      case SVal(p, e) =>
        collectVars(p)
        collectVars(e)
        term.freeVars = p.freeVars ++ e.freeVars
        term.introducedVars = p.introducedVars        
        term.assignedVars = e.assignedVars
      case SAssign(p, e) =>
        collectVars(p)
        collectVars(e)
        term.freeVars = p.freeVars ++ e.freeVars
        term.assignedVars = p.introducedVars ++ e.assignedVars   
      case SValRecordUpdate(id, m, e) =>
        collectVars(e)
        term.freeVars = e.freeVars
        term.introducedVars = SortedSet(id)
        term.assignedVars = e.assignedVars
      case SAssignRecordUpdate(id, m, e) =>
        collectVars(e)
        term.freeVars = e.freeVars
        term.assignedVars = e.assignedVars + id
      case SDef0(id , e) =>
        collectVars(e)
        term.freeVars = e.freeVars - id
      case SDef1(_, id, branches) =>
        var freeVars = SortedSet[Id]()
        for (b <- branches) {
          collectVars(b._1)
          collectVars(b._2)
          freeVars = freeVars  ++ b._1.freeVars ++ (b._2.freeVars -- b._1.introducedVars)
        }
        term.freeVars = freeVars - id
      case SDefs(defs) =>
        val defIds = collectDefIds(defs)
        var freeVars = SortedSet[Id]()
        for (d <- defs) {
          collectVars(d)
          freeVars = freeVars ++ d.freeVars
        }
        term.freeVars = freeVars -- defIds
      case TempDef0(id, e) =>
        collectVars(e)
        term.freeVars = e.freeVars - id
      case TempDef1(id, pat, e) =>
        collectVars(pat)
        collectVars(e)
        term.freeVars = (pat.freeVars ++ (e.freeVars -- pat.introducedVars)) - id
      case SYield(e) =>
        collectVars(e)
        term.freeVars = e.freeVars
      case SPragma(PragmaLog(e)) =>
        collectVars(e)
        term.freeVars = e.freeVars
      case SPragma(PragmaAssert(e)) =>
        collectVars(e)
        term.freeVars = e.freeVars
      case SPragma(PragmaProfile(e)) =>
        collectVars(e)
        term.freeVars = e.freeVars
      case SBlock(b) =>
        collectVars(b)
        term.freeVars = b.freeVars
        term.assignedVars = b.assignedVars
      case SIf(cond, yes, no) =>
        collectVars(cond)
        collectVars(yes)
        collectVars(no)
        term.freeVars = cond.freeVars ++ yes.freeVars ++ no.freeVars
        term.assignedVars = yes.assignedVars ++ no.assignedVars
      case SFor(pat, col, body) =>
        collectVars(pat)
        collectVars(col)
        collectVars(body)
        term.freeVars = pat.freeVars ++ col.freeVars ++ (body.freeVars -- pat.introducedVars)
        term.assignedVars = body.assignedVars -- pat.introducedVars
      case SWhile(cond, body) =>
        collectVars(cond)
        collectVars(body)
        term.freeVars = cond.freeVars ++ body.freeVars
        term.assignedVars = body.assignedVars
      case SMatch(v, branches) =>
        collectVars(v)
        var freeVars = v.freeVars
        var assignedVars = SortedSet[Id]()
        for (b <- branches) {
          collectVars(b._1)
          collectVars(b._2)
          freeVars = freeVars ++ b._1.freeVars ++ (b._2.freeVars -- b._1.introducedVars)
          assignedVars = b._2.assignedVars -- b._1.introducedVars
        }
        term.freeVars = freeVars
        term.assignedVars = assignedVars
      case ESimple(se) =>
        collectVars(se)
        term.freeVars = se.freeVars
      case EBlock(b) =>
        collectVars(b)
        term.freeVars = b.freeVars
        term.assignedVars = b.assignedVars
      case EWith(se, b) =>
        collectVars(se)
        collectVars(b)
        term.freeVars = se.freeVars ++ b.freeVars
        term.assignedVars = b.assignedVars
      case SEId(id) =>
        term.freeVars = SortedSet(id)
      case SEExpr(e) =>
        collectVars(e)
        term.freeVars = e.freeVars
      case SEFun(branches) =>
      case SEGlueObj(parents, b) =>
        collectVars(parents)
        collectVars(b)
        term.freeVars = parents.freeVars ++ b.freeVars
      /*case SEMergeObj(parents, b) =>
        collectVars(parents)
        collectVars(b)
        term.freeVars = parents.freeVars ++ (b.freeVars - Id("this"))*/
      case SEObj(b) =>      
        collectVars(b)
        term.freeVars = b.freeVars
      case se : SimpleExpression =>
        val ses = subSimpleExpressions(se)
        for (s <- ses) {
          collectVars(s)
          term.freeVars = term.freeVars ++ s.freeVars
        }
      case _ =>
        // nothing to do
    }
  }
  
  def subSimpleExpressions(se : SimpleExpression) : List[SimpleExpression] = {
    se match {
      case SEConstr(_, se) => List(se)
      case SEOr(u,v) => List(u,v)
      case SEAnd(u,v) => List(u,v)
      case SENot(u) => List(u)
      case SECons(h, t) => List(h, t)
      case SESet(elems) => elems
      case SEMap(elems) => elems.map(_._1) ++ elems.map(_._2)
      case SERecord(elems) => elems.map(_._2)
      case SEList(elems) => elems
      case SEVector(elems) => elems
      case SEMessageSend(se,_) => List(se)
      case SEApply(f, x) => List(f, x)
      case SECompare(operands, _) => operands
      case SELazy(se) => List(se)
      case SERandom(se) => List(se)
      case SEChoose(se) => List(se)
      case SEForce(se, _) => List(se)
      case SEConcurrent(se) => List(se)
      case SEException(se) => List(se)
      case _ => List()
    }
  }
  
  def collectVars(pattern : Pattern) {
    if (pattern.freeVars != null && pattern.introducedVars != null) return;
    pattern.freeVars = SortedSet[Id]()
    pattern.introducedVars = SortedSet[Id]()
    pattern match {
      case PId(id) =>
        pattern.introducedVars = SortedSet(id)
      case PVal(v) =>
        collectVars(v)
        pattern.freeVars = v.freeVars
      case PPredicate(pred, pat) =>
        collectVars(pred)
        if (pat != null) {
          collectVars(pat)
          pattern.freeVars = pred.freeVars ++ pat.freeVars
          pattern.introducedVars = pat.introducedVars
        } else 
          pattern.freeVars = pred.freeVars
      case PIf(pat, cond) =>
        collectVars(pat)
        collectVars(cond)
        pattern.freeVars = pat.freeVars ++ (cond.freeVars -- pat.introducedVars)
        pattern.introducedVars = pat.introducedVars
      case PAs(id, pat) =>
        pattern.freeVars = pat.freeVars
        pattern.introducedVars = pat.introducedVars + id
      case p =>
        val sps = subPatterns(p)
        for (pat <- sps) {
          collectVars(pat)
          pattern.freeVars = pattern.freeVars ++ pat.freeVars
          pattern.introducedVars = pattern.introducedVars ++ pat.introducedVars
        }
    }
  }
  
  def subPatterns(pattern : Pattern) : List[Pattern] = {
    pattern match {
      case PConstr(_, p) => List(p)
      case PVector(ps, delta) => if (delta != null) delta::ps else ps
      case PSet(ps, delta) => if (delta != null) delta::ps else ps
      case PList(ps, delta) => if (delta != null) delta::ps else ps
      case PMap(kvs, delta) => 
        val ps = kvs.map(_._1) ++ kvs.map(_._2)
        if (delta != null) delta::ps else ps
      case PRecord(kvs, delta) =>
        val ps = kvs.map(_._2)
        if (delta != null) delta::ps else ps
      case PCons(h, t) => List(h,t)
      case PException(e) => List(e)
      case _ => List()
    }
  }
  
  
}
