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
        case d : TempTypeDef => defVars = defVars + d.id
        case d : STypeDef => defVars = defVars + d.id
        case d : SImport => defVars = defVars + d.id
        case SDefs(ds) =>
            defVars = defVars ++ collectDefIds(ds)
        case _ => 
      } 
    }
    defVars
  }

  def collectTypeIds(statements : List[Statement]) : SortedSet[Id] = {
    var ids = SortedSet[Id]()
    for (s <- statements) {
      s match {
        case d : STypeDef => ids = ids + d.id
        case d : TempTypeDef => ids = ids + d.id
        case SDefs(ds) =>
            ids = ids ++ collectTypeIds(ds)
        case _ =>
      }
    }
    ids
  }

  def filterPublicIds(statements : List[Statement], defIds : SortedSet[Id]) : SortedSet[Id] = {
    var ds = defIds
    def handle(v: Visibility, id: Id) {
          v match {
            case VisibilityNo() =>
              ds = ds - id
            case VisibilityYes() =>
          }
    }
    for (s <- statements) {
      s match {
        case SDefs(defs) => ds = filterPublicIds(defs, ds)
        case d: SDef0 => handle(d.visibility, d.id)
        case d: SDef1 => handle(d.visibility, d.id)
        case d: STypeDef => handle(d.visibility, d.id)
        case d: TempPrivate =>
          for ((v, id) <- d.visibilities)
            handle (v, id)
        case _ =>
      }
    }
    ds
  }

  def isExecutable(statements : List[Statement]) : Boolean = {
    for (s <- statements) {
      s match {
        case _ : Def =>
        case _ : SDefs =>
        case _ : SImport =>
        case _ =>
          return true
      }
    }
    false
  }
  
  // must also work for temporaries !!!
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
      case SDef0(_, _, id , e, _) =>
        collectVars(e)
        term.freeVars = e.freeVars - id
      case SDef1(_, _, id, branches) =>
        var freeVars = SortedSet[Id]()
        for (b <- branches) {
          collectVars(b._1)
          collectVars(b._2)
          freeVars = freeVars  ++ b._1.freeVars ++ (b._2.freeVars -- b._1.introducedVars)
        }
        term.freeVars = freeVars - id
      case STypeDef(_, _, id, _, branches) =>
        var freeVars = SortedSet[Id]()
        for (b <- branches) {
          b match {
            case (p, Some(e)) =>
              collectVars(p)
              collectVars(e)
              freeVars = freeVars ++ p.freeVars ++ (e.freeVars -- p.introducedVars)
            case (p, None) =>
              collectVars(p)
              freeVars = freeVars ++ p.freeVars
          }
        }
        term.freeVars = freeVars - id
      case TempTypeDef(id, branches) =>
        var freeVars = SortedSet[Id]()
        for (b <- branches) {
          b match {
            case (p, Some(e)) =>
              collectVars(p)
              collectVars(e)
              freeVars = freeVars ++ p.freeVars ++ (e.freeVars -- p.introducedVars)
            case (p, None) =>
              collectVars(p)
              freeVars = freeVars ++ p.freeVars
          }
        }
        term.freeVars = freeVars - id
      case SConversionDef(_, e) =>
        collectVars(e)
        term.freeVars = e.freeVars
      case TempConversionDef(_, e) =>
        collectVars(e)
        term.freeVars = e.freeVars
      case SDefs(defs) =>
        val defIds = collectDefIds(defs)
        var freeVars = SortedSet[Id]()
        for (d <- defs) {
          collectVars(d)
          freeVars = freeVars ++ d.freeVars
        }
        term.freeVars = freeVars -- defIds
     case TempDef0(id, e, _) =>
        collectVars(e)
        term.freeVars = e.freeVars - id
      case TempDef1(id, pat, e, _) =>
        collectVars(pat)
        collectVars(e)
        term.freeVars = (pat.freeVars ++ (e.freeVars -- pat.introducedVars)) - id
      case SYield(e) =>
        collectVars(e)
        term.freeVars = e.freeVars
      case SPragma(PragmaPrint(e)) =>
        collectVars(e)
        term.freeVars = e.freeVars
      case SPragma(PragmaLog(e)) =>
        collectVars(e)
        term.freeVars = e.freeVars
      case SPragma(PragmaAssert(e)) =>
        collectVars(e)
        term.freeVars = e.freeVars
      case SPragma(PragmaCatch(e, pat)) =>
        collectVars(e)
        collectVars(pat)
        term.freeVars = e.freeVars ++ pat.freeVars
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
      case STry(block, branches) =>
        collectVars(block)
        var freeVars = block.freeVars
        var assignedVars = block.assignedVars
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
      case SEThis() =>
        val id = Id("this")
        id.location = term.location
        term.freeVars = SortedSet(id)
      case SERoot() =>
      case SEId(id) =>
        term.freeVars = SortedSet(id)
      case SEExpr(e) =>
        collectVars(e)
        term.freeVars = e.freeVars
      case SEFun(_, branches) =>
        var freeVars = SortedSet[Id]()
        for ((pat, body, _) <- branches) {
          collectVars(pat)
          collectVars(body)
          freeVars = freeVars ++ pat.freeVars ++ (body.freeVars -- pat.introducedVars)
        }
        term.freeVars = freeVars
      case SETypeIntro(_, _, branches) =>
        var freeVars = SortedSet[Id]()
        for ((pat, body) <- branches) {
          collectVars(pat)
          if (body != None) {
            collectVars(body.get)
            freeVars = freeVars ++ pat.freeVars ++ (body.get.freeVars -- pat.introducedVars)
          } else {
            freeVars = freeVars ++ pat.freeVars
          }
        }
        term.freeVars = freeVars
      case SEGlueObj(parents, b, _) =>
        collectVars(parents)
        collectVars(b)
        term.freeVars = (parents.freeVars ++ b.freeVars) - Id("this")
      /*case SEMergeObj(parents, b) =>
        collectVars(parents)
        collectVars(b)
        term.freeVars = parents.freeVars ++ (b.freeVars - Id("this"))*/
      case SEObj(b, _) =>
        collectVars(b)
        term.freeVars = b.freeVars - Id("this")
      case SModule(path, b) =>
        collectVars(b)
        term.freeVars = b.freeVars
      case SImport(path, id) =>
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
      case SEInterval(u, v) => List(u, v)
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
      case SENative(se) => List(se)
      case SETypeOf(se) => List(se)
      case SEChoose(se) => List(se)
      case SEForce(se) => List(se)
      case SEConcurrent(se) => List(se)
      case SEException(se) => List(se)
      case SERelate(u, v) => List(u, v)
      case SEConvert(u, Right(v)) => List(u, v)
      case SEConvert(u, _) => List(u)
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
        collectVars(pat)
        pattern.freeVars = pred.freeVars ++ pat.freeVars
        pattern.introducedVars = pat.introducedVars
      case PDestruct(pred, pat) =>
        collectVars(pred)
        collectVars(pat)
        pattern.freeVars = pred.freeVars ++ pat.freeVars
        pattern.introducedVars = pat.introducedVars
      case PIf(pat, cond) =>
        collectVars(pat)
        collectVars(cond)
        pattern.freeVars = pat.freeVars ++ (cond.freeVars -- pat.introducedVars)
        pattern.introducedVars = pat.introducedVars
      case PAs(id, pat) =>
        collectVars(pat)
        pattern.freeVars = pat.freeVars
        pattern.introducedVars = pat.introducedVars + id
      case PTypeVal(pat, e) =>
        collectVars(pat)
        collectVars(e)
        pattern.freeVars = pat.freeVars ++ e.freeVars
        pattern.introducedVars = pat.introducedVars
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
      case PFor(ps, delta) => if (delta != null) delta::ps else ps
      case PMap(kvs, delta) =>
        val ps = kvs.map(_._1) ++ kvs.map(_._2)
        if (delta != null) delta::ps else ps
      case PRecord(kvs, delta) =>
        val ps = kvs.map(_._2)
        if (delta != null) delta::ps else ps
      case PCons(h, t) => List(h,t)
      case PException(e) => List(e)
      case PInnerValue(_, p) => List(p)
      case PType(p, _) => List(p)
      case _ => List()
    }
  }
  
  
}
