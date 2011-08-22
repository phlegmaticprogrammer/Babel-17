package com.babel17.naive

import Program._
import ModuleSystem._
import scala.collection.immutable.SortedSet
import scala.collection.immutable.SortedMap
import com.babel17.syntaxtree.Location
import com.babel17.syntaxtree.Source
import com.babel17.interpreter.parser.ErrorMessage

/* Removes temporary statements from a program. Also:
 * - replaces relative paths by absolute ones
 * - validates type annotations and import references
 * - calculates the messages and public_messages in SEObj and SEGlueObj
 * - removes submodules
 */

class RemoveTemporaries(moduleSystem : ModuleSystem) extends ErrorProducer {

  case class Imports(pi:SortedMap[Id, Path], di:SortedMap[Id, Path], ti:SortedMap[Id, Path]) {
    def defClash(id : Id) = pi.contains(id) || di.contains(id)
    def add(imports : Imports) = {
      Imports(pi ++ imports.pi, di ++ imports.di, ti ++ imports.ti)
    }
  }

  def emptyModuleEnv : ModuleEnv = {
    ModuleEnv(Path(List()), Imports(SortedMap(), SortedMap(), SortedMap()), false)
  }

  case class ModuleEnv(local : Path, imports : Imports, inUnitTestDef : Boolean) {


    def unittest : Boolean = {
      local.unittest || inUnitTestDef;
    }

    def inModule : Boolean = local.length != 0

    def addImports(newImports : Imports) : ModuleEnv = {
      ModuleEnv(local, imports.add(newImports), inUnitTestDef)
    }

    def setPath(path : Path) : ModuleEnv = {
      ModuleEnv(path, imports, inUnitTestDef)
    }

    def enterUnitTestDef : ModuleEnv = {
      if (inUnitTestDef) this else ModuleEnv(local, imports, true)
    }

    def resolvePath(path : Path) : Option[(Path, PackageDescr, Int)] = {
      var p : Path = path
      if (!path.ids.isEmpty) {
      val first = path.ids.head
      val root = new Id("root")
      if (root == first)
        p = Path(path.ids.tail)
      else if (imports.pi.contains(first))
        p = imports.pi(first).append(Path(path.ids.tail))
      else if (imports.di.contains(first))
        p = imports.di(first).append(Path(path.ids.tail))
      }
      moduleSystem.find(p) match {
        case None =>
          None
        case Some(Found(pd, flags)) =>
          val f = flags & (FoundPackage + FoundDef)
          if (f != 0)
            Some(p, pd, f)
          else
            None
      }
    }

    def resolveTypePath(path : Path) : Option[Path] = {
      if (path.ids.isEmpty) return None
      val first = path.ids.head
      var p : Path = path
      val root = new Id("root")
      if (root == first)
        p = Path(path.ids.tail)
      else if (imports.pi.contains(first))
        p = imports.pi(first).append(Path(path.ids.tail))
      else if (imports.ti.contains(first))
        p = imports.ti(first).append(Path(path.ids.tail))
      moduleSystem.find(p) match {
        case None =>
          None
        case Some(Found(_, flags)) =>
          val f = flags & FoundType
          if (f != 0)
            Some(p)
          else
            None
      }
    }

    def resolveTypeAnnotation(path : Path) : Option[Path] = {
      if (path.length == 1) {
        val p = local.append(path)
        val q = resolveTypePath(p)
        if (q != None) return q
      }
      resolveTypePath(path)
    }

  }

  def collectImportedIds(env: ModuleEnv, statements : List[Statement]) : Imports = {
    var defIds : SortedMap[Id, Path] = SortedMap()
    var typeIds : SortedMap[Id, Path] = SortedMap()
    var packageIds : SortedMap[Id, Path] = SortedMap()
    var currentEnv = env
    val isTest = env.unittest
    def checkUnittest(loc:Location, path:Path) : Boolean = {
      if (!isTest && path.unittest) {
        error(loc, "cannot import unit tests from '"+path+"' into production code")
        false
      } else true
    }
    def addTypeId(id : Id, path : Path) {
      if (typeIds.contains(id)) {
        val p = path.normalizeTypePath
        if (typeIds(id).compare(p) != 0)
          error(id.location, "there is already a different import for type '"+id.name+"'")
      }
      else
        typeIds = typeIds + (id -> path.normalizeTypePath)
    }
    def addDefId(id : Id, path : Path) {
      if (defIds.contains(id) || packageIds.contains(id))
        if (defIds.contains(id) && defIds(id).compare(path) == 0)
          () // no error
        else
          error(id.location, "there is already a different import for '"+id.name+"'")
      else {
        defIds = defIds + (id -> path)
      }
    }
    def addPackageId(id : Id, path : Path) {
      if (defIds.contains(id) || packageIds.contains(id))
        if (packageIds.contains(id) && packageIds(id).compare(path) == 0)
          () // no error
        else error(id.location, "there is already a different import for '"+id.name+"'")
      else {
        packageIds = packageIds + (id -> path)
      }
    }
    def addModuleId(pd : PackageDescr, id : Id, path : Path) {
      if (pd.module.isDefined && pd.module.get.isType)
        addTypeId(id, path)
      if (id.name != "unittest") addPackageId(id, path)
    }
    def checkImport(pd : PackageDescr, x : Id) {
      pd.find(Path(List(x))) match {
        case None =>
          error(x.location, "invalid import, '"+x+"' not found")
        case _ =>
      }
    }
    var stCounter = 0;
    for (s <- statements) {
      s match {
        case TempImport(path, plus) =>
          if (stCounter > 0) {
            error(path.location, "import statements must appear only at the beginning of a block")
          }
          var plusmap : SortedMap[Id, Id] = SortedMap()
          plusmap = plusmap ++ plus
          currentEnv.resolvePath(path) match {
            case None =>
              error(path.location, "invalid import, module not found: '"+path+"'")
            case Some((resolvedPath, pd, flags)) =>
              if ((flags & FoundPackage) == 0)
                  error(path.location, "invalid import, module not found: '"+path+"'")
              else if (checkUnittest(s.location, resolvedPath)) {
                  for ((x,_) <- plus) checkImport(pd, x)
 
                  if (plus.isEmpty) error(path.location, "nothing to import")
                
                  // first, import all submodules  
                  for ((b, bpd) <- pd.branches) {
                    val p = resolvedPath.append(b)
                    if (plusmap.contains(b)) {
                      if (checkUnittest(s.location, p)) {
                        if (plusmap(b).name == "unittest")
                          error(s.location, "cannot introduce identifier 'unittest' because it is a keyword")
                        else addModuleId(bpd, plusmap(b), p)
                      }
                    }
                  }

                  // then, messages and types
                  if (pd.module.isDefined) {
                    val mod = pd.module.get
                    for (m <- mod.messages) {
                      val p = resolvedPath.append(m)
                      if (plusmap.contains(m)) {
                        if (checkUnittest(s.location, p)) {
                          if (plusmap(m).name == "unittest")
                            error(s.location, "cannot introduce identifier 'unittest' because it is a keyword")
                          else
                            addDefId(plusmap(m), resolvedPath.append(m))
                        }
                      }
                    }
                    for (t <- mod.typeIds) {
                      if (plusmap.contains(t))
                        addTypeId(plusmap(t), resolvedPath.append(t))
                    }
                  }
              }
          }
          currentEnv = currentEnv.addImports(Imports(packageIds, defIds, typeIds))
        case _ =>
          stCounter = stCounter + 1;
      }
    }
    Imports(packageIds, defIds, typeIds)
  }

  def transform_sts(env: ModuleEnv, _statements : List[Statement]) : List[Statement] = {
    val imports = collectImportedIds(env, _statements)
    val newEnv = env.addImports(imports)
    def isSModule(st : Statement) : Boolean = {
      st match {
        case _ : SModule => true
        case _ => false
      }
    }
    val statements : List[Statement] = (_statements.filter(s => !isSModule(s)).map(s => transform_st(newEnv, s))).toList
    var memos : SortedMap[Id, MemoType] = SortedMap()
    var privates : SortedMap[Id, Visibility] = SortedMap()
    val defIds = CollectVars.collectDefIds(statements) //++ collectConversionIds(statements) ++ collectModuleIds(statements)
    val typeIds = CollectVars.collectTypeIds(statements)
    val conflictDefs = defIds ** (imports.pi.keySet ++ imports.di.keySet)
    if (!conflictDefs.isEmpty) {
      val id = conflictDefs.firstKey
      error(id.location, "conflict between import and definition for identifier '"+id.name+"'")    
    }
    val conflictTypes = typeIds ** imports.ti.keySet
    if (!conflictTypes.isEmpty) {
      val id = conflictTypes.firstKey
      error(id.location, "conflict between import and type definition for identifier '"+id.name+"'")
    }
    var defs : SortedMap[Id, (Def, SortedSet[Id], Int)] = SortedMap()
    var defsFirstVal : SortedMap[Id, (Id, Int)] = SortedMap()
    var vals : SortedMap[Id, Int] = SortedMap()
    var line : Int = 0
    val allDefIds = defIds ++ imports.pi.keySet ++ imports.di.keySet
    for (s <- statements) {
      s match {
        case TempMemoize(ms) =>
          for ((m, id) <- ms) {
            if (typeIds.contains(id))
              error(id.location, "cannot memoize type definitions")
            else if (!defIds.contains(id)) {
              error(id.location, "no such definition found")
            } else if (memos.contains(id))
              error(id.location, "duplicate memoization specification")
            else
              memos = memos + (id -> m)
          }
        case TempPrivate(ps) =>
          for ((vis, id) <- ps) {
            if (!defIds.contains(id))
              error(id.location, "no such definition found: "+id.name)
            else if (privates.contains(id))
              error(id.location, "duplicate privacy specification")
            else
              privates = privates + (id -> vis)
          }
        case TempDef0(id, e, rt) =>
          if (id.name == "unittest" && env.unittest)
            error(id.location, "already part of a unittest module")
          if (defs.contains(id))
            error(id.location, "duplicate definition")
          else {
            CollectVars.collectVars(s)
            val deps = defIds ** s.freeVars
            var l : Int = -1
            for (v <- s.freeVars) {
              if (vals.contains(v)) {
                val x = vals(v)
                if (x > l) l = x;
              }
            }
            val sdef0 = SDef0(MemoTypeNone(), VisibilityYes(), id, e, rt)
            sdef0.setLocation(s.location)
            sdef0.stackTraceElement = Values.StackTraceElement(id.location, "evaluation of def '"+id.name+"'")
            defs = defs + (id -> (sdef0, deps, l))
          }
          if (!defsFirstVal.contains(id))
            defsFirstVal = defsFirstVal + (id -> (id, line))
        case TempDef1(id, pat, e, rt) =>
          CollectVars.collectVars(s)
          var branches : List[(Pattern, Expression, Type)] = List()
          var deps : SortedSet[Id] = SortedSet()
          var maxval : Int = -1
          if (defs.contains(id)) {
            defs(id) match {
              case (_ : SDef0, _, _) =>
                error(id.location, "duplicate definition (there is already one without a parameter)")
              case (_ : STypeDef, _, _) =>
                error(id.location, "duplicate definition (there is already a type definition with this name)")
              case (SDef1(_, _, _, _branches), _deps, _maxval) =>
                branches = _branches
                deps = _deps
                maxval = _maxval
            }
          }
          deps = deps ++ (defIds ** s.freeVars)
          for (v <- s.freeVars) {
            if (vals.contains(v)) {
              val x = vals(v)
              if (x > maxval) maxval = x
            }
          }
          branches = branches ++ List((pat, e, rt))
          val sdef1 = SDef1(MemoTypeNone(), VisibilityYes(), id, branches)
          sdef1.stackTraceElement = Values.StackTraceElement(id.location, "application of def '"+id.name+"'")
          defs = defs + (id -> (sdef1, deps, maxval))
          if (!defsFirstVal.contains(id))
            defsFirstVal = defsFirstVal + (id -> (id, line))
        case TempTypeDef(id, branches) =>
          def handleTempTypeDef(_pat : Pattern, _e : Option[Expression]) {
            var pat : Pattern = null
            var e : Expression = null
            _e match {
              case None => 
                val (pat1, e1, _) = pattern2se(_pat, 0)
                pat = pat1
                e = ESimple(e1)
                e.location = e1.location
              case Some(e1) =>
                pat = _pat
                e = e1
            }
            var branches : List[(Pattern, Expression)] = List()
            var deps : SortedSet[Id] = SortedSet()
            var maxval : Int = -1
            if (defs.contains(id)) {
              defs(id) match {
                case (_ : SDef0, _, _) =>
                  error(id.location, "duplicate definition (there is already a definition with this name)")
                case (_ : SDef1, _, _) =>
                  error(id.location, "duplicate definition (there is already a definition with this name)")
                case (STypeDef(_, _, _, _, _branches), _deps, _maxval) =>
                  branches = _branches
                  deps = _deps
                  maxval = _maxval
              }
            }
            deps = deps ++ (defIds ** s.freeVars)
            for (v <- s.freeVars) {
              if (vals.contains(v)) {
                val x = vals(v)
                if (x > maxval) maxval = x
              }
            }
            branches = branches ++ List((pat, e))
            val ty = env.local.append(id)
            val stypedef = STypeDef(MemoTypeNone(), VisibilityYes(), id, ty, branches)
            stypedef.stackTraceElement = Values.StackTraceElement(id.location, "application of typedef '"+id.name+"'")
            defs = defs + (id -> (stypedef, deps, maxval))
            if (!defsFirstVal.contains(id))
              defsFirstVal = defsFirstVal + (id -> (id, line))
          }
          CollectVars.collectVars(s)
          for ((pat, e) <- branches)
            handleTempTypeDef(pat, e)
        case statement =>
          CollectVars.collectVars(statement)
          val vs = statement.introducedVars ++ statement.assignedVars
          val invalidVs = vs ** allDefIds
          if (invalidVs.size > 0) {
            val id = invalidVs.head
            error(id.location, "variable name already used by definition")
          }
          for (v <- vs) {
            vals = vals + (v -> line)
          }
          val ds = statement.freeVars ** defIds
          for (d <- ds) {
            var first : Int = -1
            if (defsFirstVal.contains(d))
              first = defsFirstVal(d)._2
            if (first == -1 || first > line)
              defsFirstVal = defsFirstVal + (d -> (d, line))
          }
      }
      line = line + 1
    }
    var changed = true
    while (changed) {
      changed = false
      var transdefs = defs
      for ((id, (sdef, deps, maxval)) <- defs) {
        var transdeps = deps
        var transmaxval = maxval
        for (dep <- deps) {
          val (s, d, mx) = defs(dep)
          transdeps = (transdeps ++ d) - id
          if (mx > transmaxval) transmaxval = mx
        }
        if (transdeps.size != deps.size)
          changed = true
        if (transmaxval != maxval)
          changed = true
        if (changed)
          transdefs = transdefs + (id -> (sdef, transdeps, transmaxval))
      }
      defs = transdefs
    }
    var line2def : SortedMap[Int, List[Def]] = SortedMap()
    for ((id, (sdef, deps, maxval)) <- defs) {
      //println("id = "+id.name+", maxval = "+maxval+", firstval = "+defsFirstVal.get(id))
      if (!defsFirstVal.contains(id))
        throwInternalError(id.location, "definition is in nowhere land")
      if (defsFirstVal(id)._2 <= maxval) {
        error(defsFirstVal(id)._1.location, "definition of '"+id.name+"' depends on later val")
      } else {
        var d = sdef
        if (memos.contains(id) || privates.contains(id)) {
          var memo : MemoType = MemoTypeNone()
          var vis : Visibility = VisibilityYes()
          if (memos.contains(id))
            memo = memos(id)
          if (privates.contains(id))
            vis = privates(id)
          d = sdef match {
            case SDef0(_, _, id, e, rt) =>
              val h = SDef0(memo, vis, id, e, rt)
              h.location = sdef.location
              h.stackTraceElement = sdef.stackTraceElement
              h
            case SDef1(_, _, id, branches) =>
              val h = SDef1(memo, vis, id, branches)
              h.location = sdef.location
              h.stackTraceElement = sdef.stackTraceElement
              h
            case STypeDef(_, _, id, ty, branches) =>
              val h = STypeDef(memo, vis, id, ty, branches)
              h.location = sdef.location
              h.stackTraceElement = sdef.stackTraceElement
              h
          }
        }
        val line = maxval+1
        if (line2def.contains(line))
          line2def = line2def + (line -> (line2def(line) ++ List(d)))
        else
          line2def = line2def + (line -> List(d))
      }
    }
    line = 0
    var newStatements : List[Statement] = List()
    for (s <- statements) {
      if (line2def.contains(line)) {
        val ds = line2def(line)
        var loc : Location = null
        for (d <- ds) loc = Location.merge(loc, d.location)
        val sds = SDefs(ds)
        sds.setLocation(loc)
        newStatements = sds :: newStatements
      }
      s match {
        case _ : TemporaryStatement =>
        case _ =>
          newStatements = s :: newStatements
      }
      line = line + 1
    }
    newStatements = newStatements.reverse
    val isTest = env.local.unittest
    for ((id, path) <- imports.pi) {
      val s = SImport(path, id)
      s.location = Location.merge(path.location, id.location)
      newStatements = s :: newStatements
    }
    for ((id, path) <- imports.di) {
      val s = SImport(path, id)
      s.location = Location.merge(path.location, id.location)
      newStatements = s :: newStatements
    }
    newStatements
  }

  def transform_st(env : ModuleEnv, term : Statement) : Statement = {
    val result = term match {
      case SVal(p, e) =>
        SVal(transform_pat(env, p), transform_expr(env, e))
      case SAssign(p, e) =>
        SAssign(transform_pat(env, p), transform_expr(env, e))
      case SLensAssign(id, lens, e) =>
        SLensAssign(id, transform_se(env, lens).asInstanceOf[SELens], transform_expr(env, e))
      case SLensModify(id, lens, e, f) =>
        SLensModify(id, transform_se(env, lens).asInstanceOf[SELens], transform_expr(env, e),
          transform_se(env, f))
        
      /*case SValRecordUpdate(id, m, e) =>
        SValRecordUpdate(id, m, transform_expr(env, e))
      case SAssignRecordUpdate(id, m, e) =>
        SAssignRecordUpdate(id, m, transform_expr(env, e))*/
      case TempConversionDef(rt, e, automatic) =>
        transform_type(env, TypeSome(rt)) match {
          case TypeNone() =>
            SBlock(Block(List()))
          case TypeSome(p) =>
            val e2 = transform_expr(env, e)
            val id = if (automatic) Id("this:"+p) else Id("this:>"+p) 
            id.location = rt.location
            TempDef0(id, e2, TypeSome(p))
        }
      case _ : SImport => term
      case SYield(e) =>
        SYield(transform_expr(env, e))
      case SBlock(b) =>
        SBlock(transform_block(env, b))
      case SIf(cond, yes, no) =>
        SIf(transform_se(env, cond), transform_block(env, yes),
          transform_block(env, no))
      case SWhile(cond, body) =>
        SWhile(transform_se(env, cond), transform_block(env, body))
      case SFor(pat,list, body) =>
        SFor(transform_pat(env, pat), transform_se(env, list),
        transform_block(env, body))
      case SMatch(se, branches) =>
        SMatch(transform_se(env, se),
          branches.map(x => (transform_pat(env, x._1), transform_block(env, x._2))))
      case STry(block, branches) =>
        STry(transform_block(env, block),
          branches.map(x => (transform_pat(env, x._1), transform_block(env, x._2))))
      case SPragma(pragma : Pragma) =>
        SPragma(transform_pragma(env, pragma))
      case TempDef0(id, e, rt) =>
        val newEnv = if (id.name == "unittest") env.enterUnitTestDef else env
        TempDef0(id, transform_expr(newEnv, e), transform_type(newEnv, rt))
      case TempDef1(id, pat, e, rt) =>
        TempDef1(id, transform_pat(env, pat), transform_expr(env, e),
          transform_type(env, rt))
      case TempTypeDef(id, branches) =>
        def f(x : (Pattern, Option[Expression])) = {
          x match {
            case (p, None) =>
              (transform_pat(env, p), None)
            case (p, Some(e)) =>
              (transform_pat(env, p), Some(transform_expr(env, e)))
          }
        }
        TempTypeDef(id, branches.map(f))
      case _ : TempMemoize => term
      case _ : TempPrivate => term
      case _ : TempImport => term
    }
    result.location = term.location
    result.stackTraceElement = term.stackTraceElement
    result
  }

  def transform_se(env : ModuleEnv, se : SimpleExpression) : SimpleExpression = {
    def tr(se : SimpleExpression) = transform_se(env, se)
    val result = se match {
      case SEExpr(e) =>
        SEExpr(transform_expr(env, e))
      case SEMin(u) => SEMin(tr(u))
      case SEMax(u) => SEMax(tr(u))
      case SEOr(u, v) => SEOr(tr(u), tr(v))
      case SEXor(u, v) => SEXor(tr(u), tr(v))
      case SEAnd(u, v) => SEAnd(tr(u), tr(v))
      case SENot(u) => SENot(tr(u))
      case SEInterval(u, v) => SEInterval(tr(u), tr(v))
      case SERelate(u, v) => SERelate(tr(u), tr(v))
      case SEConvert(u, Right(v)) => SEConvert(tr(u), Right(tr(v)))
      case SEConvert(u, Left(p)) =>
        transform_type(env, TypeSome(p)) match {
          case TypeSome(q) => SEConvert(tr(u), Left(q))
          case TypeNone() => tr(u)
        }
      case SECons(h, t) => SECons(tr(h), tr(t))
      case SEConstr(n, t) => SEConstr(n, tr(t))
      case SEFun(m, branches) =>
        def f(x : (Pattern, Expression, Type)) =
          (transform_pat(env, x._1), transform_expr(env, x._2),
          transform_type(env, x._3))
        SEFun(m, branches.map(f))
      case SETypeIntro(m, ty, branches) =>
        def f(x : (Pattern, Expression)) =
          (transform_pat(env, x._1), transform_expr(env, x._2))
        val (TypeSome(transformedTy)) = transform_type(env, TypeSome(ty))
        SETypeIntro(m, ty, branches.map(f))
      case SESet(l) => SESet(l.map(tr _))
      case SEMap(l) => SEMap(l.map(x => (tr(x._1), tr(x._2))))
      case SERecord(l) => SERecord(l.map(x => (x._1, tr(x._2))))
      case SEList(l) => SEList(l.map(tr _))
      case SEVector(l) => SEVector(l.map(tr _))
      case SELens(id, l) => SELens(id, tr(l))
      case SEDirectLens(u, v) => SEDirectLens(tr(u), tr(v))
      case SEGlueObj(p, _b, _) =>
        val b = transform_block(env, _b)
        val m = CollectVars.collectDefIds(b.statements)
        SEGlueObj(tr(p), b, m)
      case SEObj(_b, _) =>
        val b = transform_block(env, _b)
        val m = CollectVars.collectDefIds(b.statements)
        SEObj(b, m)
      case SEMessageSend(t, m) => SEMessageSend(tr(t), m)
      case SELensSend(target, lens) => SELensSend(tr(target), tr(lens))
      case SEApply(f, x) => SEApply(tr(f), tr(x))
      case SECompare(operands, operators) =>
        SECompare(operands.map(tr _), operators)
      case SELazy(se) => SELazy(tr(se))
      case SERandom(se) => SERandom(tr(se))
      case SEConcurrent(se) => SEConcurrent(tr(se))
      case SEChoose(u) => SEChoose(tr(u))
      case SEForce(u) => SEForce(tr(u))
      case SEException(u) => SEException(tr(u))
      case SETypeOf(u) => SETypeOf(tr(u))
      case SENative(u) => SENative(tr(u))
      case SETypeExpr(path) =>
        env.resolveTypeAnnotation(path) match {
          case None =>
            error(path.location, "cannot resolve type '"+path+"'")
            SETypeExpr(path)
          case Some(rp) =>
            SETypeExpr(rp)
        }
      case s: SEId => s
      case s: SEInt => s
      case s: SEBool => s
      case s: SEString => s
      case s: SEFloat => s
      case s: SERoot => s
      case s: SEThis => s
    }
    result.location = se.location
    result.stackTraceElement = se.stackTraceElement
    result
  }

  def transform_pat(env : ModuleEnv, pattern : Pattern) : Pattern = {
    if (pattern == null) return null
    def tr(pat : Pattern) = transform_pat(env, pat)
    val result = pattern match {
      case PConstr(c, p) => PConstr(c, tr(p))
      case PVector(l, delta) => PVector(l.map(tr _), tr(delta))
      case PList(l, delta) => PList(l.map(tr _), tr(delta))
      case PSet(l, delta) => PSet(l.map(tr _), tr(delta))
      case PMap(l, delta) => PMap(l.map(x => (tr(x._1), tr(x._2))), tr(delta))
      case PFor(l, delta) => PFor(l.map(tr _), tr(delta))
      case PRecord(l, delta) => PRecord(l.map(x => (x._1, tr(x._2))), delta)
      case PPredicate(se, pat) => PPredicate(transform_se(env, se), tr(pat))
      case PDestruct(se, pat) => PDestruct(transform_se(env, se), tr(pat))
      case PVal(se) => PVal(transform_se(env, se))
      case PIf(pat, cond) => PIf(tr(pat), transform_se(env, cond))
      case PAs(id, pat) => PAs(id, tr(pat))
      case PCons(h, t) => PCons(tr(h), tr(t))
      case PException(arg) => PException(tr(arg))
      case PType(pat, ty) => PType(tr(pat), transform_type(env, ty))
      case PTypeVal(pat, ty) => PTypeVal(tr(pat), transform_se(env, ty))
      case PInnerValue(ty, pattern) =>
        val localType = env.local.append(ty)
        var err = false
        moduleSystem.find(localType) match {
          case None =>
            err = true
          case Some(Found(_, flags)) =>
            err = ((flags & ModuleSystem.FoundType) == 0)
        }
        if (err)
          error(ty.location, "no local type definition for: '"+ty+"'")
        PInnerValue(localType, tr(pattern))
      case p: PInt => p
      case p: PBool => p
      case p: PString => p
      case p: PId => p
      case p: PAny => p
      case p: PEllipsis => p
    }
    result.location = pattern.location
    result
  }

  def transform_expr(env : ModuleEnv, expr : Expression) : Expression = {
    val result = expr match {
      case ESimple(se) =>
        ESimple(transform_se(env, se))
      case EBlock(b) =>
        EBlock(transform_block(env, b))
      case EWith(se, b) =>
        EWith(transform_se(env, se), transform_block(env, b))
    }
    result.location = expr.location
    result.stackTraceElement = expr.stackTraceElement
    result
  }

  def transform_type(env : ModuleEnv, ty : Type) : Type = {
    val result = ty match {
      case TypeNone() =>
        TypeNone()
      case TypeSome(path) =>
        env.resolveTypeAnnotation(path) match {
          case None =>
            error(path.location, "cannot resolve type '"+ty+"'")
            TypeNone()
          case Some(path) =>
            TypeSome(path)
        }
    }
    result.location = ty.location
    result
  }

  def transform_block(env : ModuleEnv, b : Block) : Block = {
    val result = Block(transform_sts(env, b.statements))
    result.location = b.location
    result.stackTraceElement = b.stackTraceElement
    result
  }

  def transform_pragma(env : ModuleEnv, pragma : Pragma) : Pragma = {
    val result = pragma match {
      case PragmaPrint(e) =>
        PragmaPrint(transform_expr(env, e))
      case PragmaLog(e) =>
        PragmaLog(transform_expr(env, e))
      case PragmaProfile(e) =>
        PragmaProfile(transform_expr(env, e))
      case PragmaAssert(e) =>
        PragmaAssert(transform_expr(env, e))
      case PragmaCatch(e, p) =>
        PragmaCatch(transform_expr(env, e), transform_pat(env, p))
    }
    result.location = pragma.location
    result
  }

  def transform(term : Term) : Term = {
    val env = emptyModuleEnv
    term match {
      case b : Block => transform_block(env, b)
      case SModule(p : Path, b : Block) =>
        if (p.countUnittest > 1)
            error(p.location, "'unittest' keyword appears more than once in module path");
        val newEnv = env.setPath(p)
        SModule(p, transform_block(newEnv, b))
        
    }
  }
  
  def identityPattern2SE(pat : Pattern) : Boolean = {
    def ok(pat : Pattern) : Boolean = {
      pat match {
        case PId(id) => true
        case PAny() => true
        case PIf(pat, condition) => ok(pat)
        case PAs(id, pat) => ok(pat)
        case PException(pat : Pattern) => ok(pat)
        case PType(pat, TypeNone()) => ok(pat)
        case _ => false
      }
    }
    ok(pat)
  }
    
  def pattern2se(pat : Pattern, vindex : Int) : (Pattern, SimpleExpression, Int) = {
    var vi = vindex
    def newId : Id = {
      val id = Id("_pat_"+vi)
      vi = vi+1
      id.location = pat.location
      id
    }
    def patterns2ses(pats : List[Pattern]) :(List[Pattern], List[SimpleExpression]) = {
      var ps : List[Pattern] = List()
      var ses : List[SimpleExpression] = List()
      for (pat <- pats) {
        val (pat2, se, index) = pattern2se(pat, vi)
        vi = index
        ps = pat2 :: ps
        ses = se :: ses
      }
      (ps.reverse, ses.reverse)
    }
    def addCols(col1 : SimpleExpression, col2 : SimpleExpression) : SimpleExpression = {
      SEApply(SEMessageSend(col1, Id(Values.MESSAGE_PLUSPLUS)), col2)
    }
    def fallback () : (Pattern, SimpleExpression) = {
      val id = newId
      if (!identityPattern2SE(pat)) {
        error(pat.location, "cannot derive expression from pattern")
      }
      (PAs(id, pat), SEId(id))
    }
    val (newpat, se) =
    pat match {
      // first those patterns that are unproblematic
      case PInt(v) => (pat, SEInt(v))
      case PBool(v) => (pat, SEBool(v))
      case PString(v) => (pat, SEString(v))
      case PId(id) => (pat, SEId(id))
      case PAny() => 
        val id = newId
        (PId(id),SEId(id))
      case PConstr(c, pat) =>
        val (pat2, se, index) = pattern2se(pat, vi)
        vi = index        
        (PConstr(c, pat2), SEConstr(c, se))
      case PVector(elems, delta) =>
        val (pats, ses) = patterns2ses(elems)
        if (delta == null)
          (PVector(pats, null), SEVector(ses))
        else {
          val id = newId          
          (PVector(pats, PAs(id, delta)), addCols(SEVector(ses), SEId(id)))
        }   
      case PList(elems, delta) =>
        val (pats, ses) = patterns2ses(elems)
        if (delta == null)
          (PList(pats, null), SEList(ses))
        else {
          val id = newId          
          (PList(pats, PAs(id, delta)), addCols(SEList(ses), SEId(id)))
        }   
      case PSet(elems, delta) =>
        val (pats, ses) = patterns2ses(elems)
        if (delta == null)
          (PSet(pats, null), SESet(ses))
        else {
          val id = newId          
          (PSet(pats, PAs(id, delta)), addCols(SESet(ses), SEId(id)))
        }   
      case PMap(keyValues, delta) =>
        val keys = keyValues.map(_._1).toList
        val values = keyValues.map(_._2).toList
        val (newkeys, seskeys) = patterns2ses(keys)
        val (newvalues, sesvalues) = patterns2ses(values)
        if (delta == null)
          (PMap(newkeys.zip(newvalues), null), SEMap(seskeys.zip(sesvalues)))
        else {
          val id = newId
          (PMap(newkeys.zip(newvalues), PAs(id, delta)), 
           addCols(SEMap(seskeys.zip(sesvalues)), SEId(id)))
        }
      case PVal(value) =>
        val id = newId
        (PAs(id, PVal(value)), SEId(id))
      case PIf(pat, condition) =>
        val (pat2, se, index) = pattern2se(pat, vi)
        vi = index
        (PIf(pat2, condition), se)
      case PAs(id, pat) =>
        val (pat2, se, index) = pattern2se(pat, vi)
        vi = index
        (PAs(id, pat2), se)
      case PCons(h, t) =>
        val (h2, hse, index1) = pattern2se(h, vi)
        val (t2, tse, index2) = pattern2se(t, index1)
        vi = index2
        (PCons(h2, t2), SECons(hse, tse))
      case PException(pat : Pattern) =>
        val (pat2, se, index) = pattern2se(pat, vi)
        vi = index
        (PException(pat2), SELazy(SEException(se)))
      // now those patterns that cannot (always) be reconstructed
      case PRecord(keyValues, delta) =>
        if (!delta) {
          val ids : List[Id] = keyValues.map(_._1).toList
          val pats : List[Pattern] = keyValues.map(_._2).toList
          val (newpats, ses) = patterns2ses(pats)
          val newKeyValues : List[(Id, Pattern)] = ids.zip(newpats).toList
          val keySES : List[(Id, SimpleExpression)] = ids.zip(ses).toList 
          (PRecord(newKeyValues, false), SERecord(keySES))
        } else {
          fallback ()
        }
      case _ : PFor => fallback()
      case _ : PPredicate => fallback()
      case _ : PDestruct => fallback()
      case _ : PEllipsis => fallback()
      case PType(pat, TypeNone()) =>
        val (p, se, index) = pattern2se(pat, vi)
        vi = index
        (p, se)
      case _ : PType => fallback()
      case _ : PTypeVal => fallback()
      case _ : PInnerValue => fallback()        
    }
    newpat.location = pat.location
    se.location = pat.location
    (newpat, se, vi)
  }

}

