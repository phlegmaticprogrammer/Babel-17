package com.babel17.naive

import Program._
import ModuleSystem._
import scala.collection.immutable.SortedSet
import scala.collection.immutable.SortedMap
import com.babel17.syntaxtree.Location
import com.babel17.syntaxtree.Source
import com.babel17.interpreter.parser.ErrorMessage

/* Removes temporary statements from a program. In the process, also replaces relative
   paths by absolute ones and validates type annotations and import references. */

class RemoveTemporaries(moduleSystem : ModuleSystem) extends ErrorProducer {

  case class Imports(pi:SortedMap[Id, Path], di:SortedMap[Id, Path], ti:SortedMap[Id, Path]) {
    def defClash(id : Id) = pi.contains(id) || di.contains(id)
    def add(imports : Imports) = {
      Imports(pi ++ imports.pi, di ++ imports.di, ti ++ imports.ti)
    }
  }

  case class ModuleEnv(local : Path, imports : Imports) {

    def addImports(newImports : Imports) : ModuleEnv = {
      ModuleEnv(local, imports.add(newImports))
    }

    def addPath(path : Path) : ModuleEnv = {
      ModuleEnv(local.append(path), imports)
    }

    def resolvePath(path : Path) : Option[(Path, PackageDescr, Int)] = {
      val first = path.ids.head
      var p : Path = path
      if (imports.pi.contains(first))
        p = imports.pi(first).append(Path(path.ids.tail))
      else if (imports.di.contains(first))
        p = imports.di(first).append(Path(path.ids.tail))
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
      val first = path.ids.head
      var p : Path = path
      if (imports.pi.contains(first))
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
    def addTypeId(id : Id, path : Path) {
      if (typeIds.contains(id))
        error(id.location, "there is already an import for type '"+id.name+"'")
      else
        typeIds = typeIds + (id -> path.normalizeTypePath)
    }
    def addDefId(id : Id, path : Path) {
      if (defIds.contains(id) || packageIds.contains(id))
        error(id.location, "there is already an import for '"+id.name+"'")
      else {
        defIds = defIds + (id -> path)
      }
    }
    def addPackageId(id : Id, path : Path) {
      if (defIds.contains(id) || packageIds.contains(id))
        error(id.location, "there is already an import for '"+id.name+"'")
      else {
        packageIds = packageIds + (id -> path)
      }
    }
    def addModuleId(pd : PackageDescr, id : Id, path : Path) {
      if (pd.module.isDefined && pd.module.get.isType)
        addTypeId(id, path)
      addPackageId(id, path)
    }
    for (s <- statements) {
      s match {
        case TempImport(path, plus, minus) =>
          var plusmap : SortedMap[Id, Id] = SortedMap()
          plusmap = plusmap ++ plus
          var minusset : SortedSet[Id] = SortedSet()
          minusset = minusset ++ minus
          val conflicts = plusmap.keySet ** minusset
          if (!conflicts.isEmpty) {
            val id = conflicts.firstKey
            error(id.location, "conflicting import")
          }
          currentEnv.resolvePath(path) match {
            case None =>
              error(path.location, "invalid import, module not found: '"+path+"'")
            case Some((resolvedPath, pd, flags)) =>
              if ((flags & FoundPackage) == 0)
                  error(path.location, "invalid import, module not found: '"+path+"'")
              else {
                  val importAll = plus.isEmpty || !minus.isEmpty
                
                  // first, import all submodules  
                  for ((b, bpd) <- pd.branches) {
                    if (plusmap.contains(b))
                      addModuleId(bpd, plusmap(b), resolvedPath.append(b))
                    else if (importAll && !minusset.contains(b))
                      addModuleId(bpd, b, resolvedPath.append(b))
                  }

                  // then, messages and types
                  if (pd.module.isDefined) {
                    val mod = pd.module.get
                    for (m <- mod.messages) {
                      if (plusmap.contains(m))
                        addDefId(plusmap(m), resolvedPath.append(m))
                      else if (importAll && !minusset.contains(m))
                        addDefId(m, resolvedPath.append(m))
                    }
                    for (t <- mod.typeIds) {
                      if (plusmap.contains(t))
                        addTypeId(t, resolvedPath.append(t))
                      else if (importAll && !minusset.contains(t))
                        addTypeId(t, resolvedPath.append(t))
                    }
                  }
              }
          }
          currentEnv = currentEnv.addImports(Imports(packageIds, defIds, typeIds))
        case _ =>
      }
    }
    Imports(packageIds, defIds, typeIds)
  }

  def transform_sts(env: ModuleEnv, _statements : List[Statement]) : List[Statement] = {
    val imports = collectImportedIds(env, _statements)
    val newEnv = env.addImports(imports)
    val statements = _statements.map(s => transform_st(newEnv, s))
    var memos : SortedMap[Id, MemoType] = SortedMap()
    var privates : SortedMap[Id, Visibility] = SortedMap()
    val defIds = CollectVars.collectDefIds(statements)
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
            if (!defIds.contains(id)) {
              error(id.location, "no such definition found")
            } else if (memos.contains(id))
              error(id.location, "duplicate memoization specification")
            else
              memos = memos + (id -> m)
          }
        case TempPrivate(ps) =>
          for ((vis, id) <- ps) {
            if (!defIds.contains(id)) {
              error(id.location, "no such definition found: "+id.name)
            } else if (vis == VisibilityTypeOnly() && !typeIds.contains(id)) {
              error(id.location, "no such type definition found")
            } else if (privates.contains(id))
              error(id.location, "duplicate privacy specification")
            else
              privates = privates + (id -> vis)
          }
        case TempDef0(id, e, rt) =>
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
            val sdef0 = SDef0(MemoTypeNone(), VisibilityAll(), id, e, rt)
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
          var first : Int = -1
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
          if (first == -1) first = line
          deps = deps ++ (defIds ** s.freeVars)
          for (v <- s.freeVars) {
            if (vals.contains(v)) {
              val x = vals(v)
              if (x > maxval) maxval = x
            }
          }
          branches = branches ++ List((pat, e, rt))
          val sdef1 = SDef1(MemoTypeNone(), VisibilityAll(), id, branches)
          sdef1.stackTraceElement = Values.StackTraceElement(id.location, "application of def '"+id.name+"'")
          defs = defs + (id -> (sdef1, deps, maxval))
          if (!defsFirstVal.contains(id))
            defsFirstVal = defsFirstVal + (id -> (id, line))
        case TempTypeDef(id, branches) =>
          def handleTempTypeDef(pat : Pattern, e : Option[Expression]) {
            var branches : List[(Pattern, Option[Expression])] = List()
            var deps : SortedSet[Id] = SortedSet()
            var first : Int = -1
            var maxval : Int = -1
            if (defs.contains(id)) {
              defs(id) match {
                case (_ : SDef0, _, _) =>
                  error(id.location, "duplicate definition (there is already a definition with this name)")
                case (_ : SDef1, _, _) =>
                  error(id.location, "duplicate definition (there is already a definition with this name)")
                case (STypeDef(_, _, _, _branches), _deps, _maxval) =>
                  branches = _branches
                  deps = _deps
                  maxval = _maxval
              }
            }
            if (first == -1) first = line
            deps = deps ++ (defIds ** s.freeVars)
            for (v <- s.freeVars) {
              if (vals.contains(v)) {
                val x = vals(v)
                if (x > maxval) maxval = x
              }
            }
            branches = branches ++ List((pat, e))
            val stypedef = STypeDef(MemoTypeNone(), VisibilityAll(), id, branches)
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
          var vis : Visibility = VisibilityAll()
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
            case STypeDef(_, _, id, branches) =>
              val h = STypeDef(memo, vis, id, branches)
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
      case SValRecordUpdate(id, m, e) =>
        SValRecordUpdate(id, m, transform_expr(env, e))
      case SAssignRecordUpdate(id, m, e) =>
        SAssignRecordUpdate(id, m, transform_expr(env, e))
      case SConversion(rt, e) =>
        SConversion(transform_type(env, rt), transform_expr(env, e))
      case SDef0(memo, vis, id, e, rt) =>
        SDef0(memo, vis, id, transform_expr(env, e), transform_type(env, rt))
      case SDef1(memo, vis, id, branches) =>
        def f(x : (Pattern, Expression, Type)) = {
          x match {
            case (p, e, rt) =>
              (transform_pat(env, p), transform_expr(env, e),
               transform_type(env, rt))
          }
        }
        SDef1(memo, vis, id, branches.map(f))
      case STypeDef(memo, vis, id, branches) =>
        def f(x : (Pattern, Option[Expression])) = {
          x match {
            case (p, None) =>
              (transform_pat(env, p), None)
            case (p, Some(e)) =>
              (transform_pat(env, p), Some(transform_expr(env, e)))
          }
        }
        STypeDef(memo, vis, id, branches.map(f))
      case _ : SImport => term
      case SDefs(defs) =>
        SDefs(defs.map(x => transform_st(env, x).asInstanceOf[Def]))
      case SModule(p : Path, b : Block) =>
        val newEnv = env.addPath(p)
        SModule(p, transform_block(newEnv, b))
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
        TempDef0(id, transform_expr(env, e), transform_type(env, rt))
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
      case SEOr(u, v) => SEOr(tr(u), tr(v))
      case SEAnd(u, v) => SEAnd(tr(u), tr(v))
      case SENot(u) => SENot(tr(u))
      case SECons(h, t) => SECons(tr(h), tr(t))
      case SEFun(m, branches) =>
        def f(x : (Pattern, Expression, Type)) =
          (transform_pat(env, x._1), transform_expr(env, x._2),
          transform_type(env, x._3))
        SEFun(m, branches.map(f))
      case SESet(l) => SESet(l.map(tr _))
      case SEMap(l) => SEMap(l.map(x => (tr(x._1), tr(x._2))))
      case SERecord(l) => SERecord(l.map(x => (x._1, tr(x._2))))
      case SEList(l) => SEList(l.map(tr _))
      case SEVector(l) => SEVector(l.map(tr _))
      case SEGlueObj(p, b, m) =>
        SEGlueObj(tr(p), transform_block(env, b), m)
      case SEObj(b, m) => SEObj(transform_block(env, b), m)
      case SEMessageSend(t, m) => SEMessageSend(tr(t), m)
      case SEApply(f, x) => SEApply(tr(f), tr(x))
      case SECompare(operands, operators) =>
        SECompare(operands.map(tr _), operators)
      case SELazy(se) => SELazy(tr(se))
      case SERandom(se) => SERandom(tr(se))
      case SEConcurrent(se) => SEConcurrent(tr(se))
      case SEChoose(u) => SEChoose(tr(u))
      case SEForce(u, d) => SEForce(tr(u), d)
      case SEException(u) => SEException(tr(u))
      case SETypeOf(u) => SETypeOf(tr(u))
      case SETypeExpr(path) =>
        env.resolveTypeAnnotation(path) match {
          case None =>
            error(path.location, "cannot resolve type '"+path+"'")
            SETypeExpr(path)
          case Some(rp) =>
            SETypeExpr(rp)
        }
      case _ => se
    }
    result.location = se.location
    result.stackTraceElement = se.stackTraceElement
    result
  }

  def transform_pat(env : ModuleEnv, pattern : Pattern) : Pattern = {
    def tr(pat : Pattern) = transform_pat(env, pat)
    val result = pattern match {
      case PConstr(c, p) => PConstr(c, tr(p))
      case PVector(l, delta) => PVector(l.map(tr _), tr(delta))
      case PList(l, delta) => PList(l.map(tr _), tr(delta))
      case PSet(l, delta) => PSet(l.map(tr _), tr(delta))
      case PMap(l, delta) => PMap(l.map(x => (tr(x._1), tr(x._2))), tr(delta))
      case PFor(l, delta) => PFor(l.map(tr _), tr(delta))
      case PRecord(l, delta) => PRecord(l.map(x => (x._1, tr(x._2))), tr(delta))
      case PPredicate(se, pat) => PPredicate(transform_se(env, se), tr(pat))
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
          error(ty.location, "no such typedefinition in local scope: '"+ty+"'")
        PInnerValue(localType, tr(pattern))
      case _ => pattern
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
            error(ty.location, "cannot resolve type '"+ty+"'")
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
    }
    result.location = pragma.location
    result
  }

}

