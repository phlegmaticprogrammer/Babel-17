package com.babel17.naive

import Program._
import com.babel17.syntaxtree.patterns._
import com.babel17.syntaxtree._
import com.babel17.interpreter.parser._
import scala.collection.immutable.SortedSet
import scala.collection.immutable.SortedMap

class Tree2Program extends ErrorProducer {

  /*  var errors : List[ErrorMessage] = List.empty
  var source : Source = null

  def error (loc : com.babel17.syntaxtree.Location, msg : String) = {
    var l = loc;
    if (loc == null) l = new Location(source, 0,0)
    errors = (new ErrorMessage(l, msg)) :: errors
    //println("at "+loc+": "+msg)
  }

  def throwInternalError (loc : com.babel17.syntaxtree.Location, msg : String) = {
    throw new RuntimeException("at "+loc+": "+msg)
  }*/

  def toList(_nl : NodeList) : List[Node] = {
    var l = List[Node]()
    var nl = _nl
    while (!nl.empty) {
      val m = nl.head
      l = m::l
      nl = nl.tail
    }
    return l.reverse
  }

  def buildStatement (node : Node) : Statement = {
    val s = build(node) match {
      case b : Block => SBlock(b)
      case s : Statement => s
      case e : Expression => SYield (e)
      case se : SimpleExpression => SYield (ESimple (se))
      case id : Id => SYield (ESimple(SEId(id)))
      case x => throwInternalError(node.location(), "buildStatement: "+x)
    }
    s.setLocation(node.location())
    return s
  }

  def buildExpression (node : Node) : Expression =  {
    val e = build(node) match {
      case b : Block => EBlock(b)
      case SBlock(b) => EBlock(b)
      case s : Statement => EBlock(Block(List(s)))
      case e : Expression => e
      case se : SimpleExpression => ESimple(se)
      case id : Id => ESimple(SEId(id))
      case x => throwInternalError(node.location(), "buildExpression: "+x)
    }
    e.setLocation(node.location())
    return e
  }

  def buildBlock (node : Node) : Block = {
    val e = build(node) match {
      case b: Block => b
      case SBlock(b) => b
      case s : Statement => Block(List(s))
      case EBlock(b) => b
      case x => throwInternalError(node.location(), "buildBlock: "+x)
    }
    e.setLocation(node.location())
    return e
  }

  def buildSimpleExpression (node : Node) : SimpleExpression =  {
    val se = build(node) match {
      case b : Block => SEExpr(EBlock(b))
      case SBlock(b) => SEExpr(EBlock(b))
      case s : Statement => SEExpr(EBlock(Block(List(s))))
      case ESimple(se) => se
      case e : Expression => SEExpr(e)
      case se : SimpleExpression => se
      case id : Id => SEId(id)
      case x => throwInternalError(node.location(), "buildSimpleExpression: "+x)
    }
    se.setLocation(node.location())
    return se
  }

  def buildBinaryOperation(leftNode:Node, rightNode:Node,
                           op : OperatorNode) : SimpleExpression =
  {
    def left() : SimpleExpression = buildSimpleExpression(leftNode)
    def right() : SimpleExpression = buildSimpleExpression(rightNode)
    def mk(m : String) : SimpleExpression = {
      val msg = Id(m.toLowerCase)
      msg.setLocation(op.location)
      SEApply(SEMessageSend(left(), msg), right())
    }
    import OperatorNode._
    op.operator match {
      case PLUS => mk(Values.MESSAGE_PLUS)
      case MINUS => mk(Values.MESSAGE_MINUS)
      case TIMES => mk(Values.MESSAGE_TIMES)
      case QUOTIENT => mk(Values.MESSAGE_SLASH)
      case DIV => mk(Values.MESSAGE_DIV)
      case MOD => mk(Values.MESSAGE_MOD)
      case POW => mk(Values.MESSAGE_POW)
      case PLUSPLUS => mk(Values.MESSAGE_PLUSPLUS)
      case MINUSMINUS => mk(Values.MESSAGE_MINUSMINUS)
      case TIMESTIMES => mk(Values.MESSAGE_TIMESTIMES)
      case QUOTIENTQUOTIENT => mk(Values.MESSAGE_SLASHSLASH)
      case TO => mk(Values.MESSAGE_TO)
      case DOWNTO => mk(Values.MESSAGE_DOWNTO)
      case APPLY => SEApply(left(), right())
      case MESSAGE_SEND =>
        build(rightNode) match {
          case msg : Id => SEMessageSend(left(), msg)
          case x => throwInternalError(op.location, "buildBinaryOperation, no message: "+x)
        }
      case OR => SEOr(left(), right())
      case AND => SEAnd(left(), right())
      case CONS => SECons(left(), right())
      case INTERVAL => SEInterval(left(), right())
      case RELATE => SERelate(left(), right())
      case CONVERT =>
        rightNode match {
          case t: TypeIdNode =>
            SEConvert(left(), Left(buildTypePath(t)))
          case t =>
            SEConvert(left(), Right(right()))
        }
      case x => throwInternalError(op.location, "buildBinaryOperation: "+x)
    }
  }

  def buildTypePath(n : Node) : Path = {
    val tn : TypeIdNode = n.asInstanceOf[TypeIdNode]
    val ids = toList(tn.ids).map(x => build(x).asInstanceOf[Id])
    val p = Path(ids)
    p.setLocation(n.location)
    p
  }


  def buildType(n : Node) : Type = {
    val p = buildTypePath(n)
    val t = TypeSome(p)
    t.setLocation(n.location)
    t
  }

  def buildConstr(n : ConstrNode) : SimpleExpression = {
    val c = Constr(n.name.toUpperCase)
    c.setLocation(n.nameLoc)
    val param = if (n.arg == null) SERecord(List()) else buildSimpleExpression(n.arg)
    SEConstr(c, param)
  }

  def buildCompare(n : CompareNode) : SimpleExpression = {
    def opconv(op : OperatorNode) : CompareOp = {
      val p = op.operator match {
        case OperatorNode.EQUAL => EQUAL()
        case OperatorNode.UNEQUAL => UNEQUAL()
        case OperatorNode.GREATER => GREATER()
        case OperatorNode.GREATER_EQ => GREATER_EQ()
        case OperatorNode.LESS => LESS()
        case OperatorNode.LESS_EQ => LESS_EQ()
        case x => throwInternalError(op.location, "buildCompare.opconv: "+x)
      }
      p.setLocation(op.location)
      p
    }
    var operands : List[SimpleExpression] = List()
    var operators : List[CompareOp] = List()
    var isOperator = false;
    for (i <- toList(n.comparisons)) {
      if (isOperator)
        operators = opconv(i.asInstanceOf[OperatorNode])::operators
      else
        operands = buildSimpleExpression(i)::operands
      isOperator = !isOperator
    }
    SECompare(operands.reverse, operators.reverse)
  }

  def buildNullary(n : NullaryNode) : Locatable = {
    import OperatorNode._
    val result : Locatable = n.operator().operator match {
      case TRUE => SEBool(true)
      case FALSE => SEBool(false)
      case THIS => SEThis()
      case ROOT => SERoot()
      case k => throwInternalError(n.location, "unknown nullary operator code: "+k)
    }
    result.setLocation(n.location)
    result
  }

  def buildUnary(n : UnaryNode) : Locatable = {
    val arg = buildSimpleExpression(n.operand)
    def mk(m : String) : SimpleExpression = {
      val msg = Id(m.toLowerCase)
      msg.setLocation(n.operator().location)
      SEMessageSend(arg, msg)
    }
    def attachSTE(se : SimpleExpression, name : String) : SimpleExpression = {
      se.stackTraceElement = Values.StackTraceElement(n.location, name+" expression")
      se
    }
    import OperatorNode._
    val result : Locatable = n.operator().operator match {
      case NOT => SENot(arg)
      case UMINUS => mk(Values.MESSAGE_UMINUS)
      case LAZY => SELazy(attachSTE(arg, "lazy"))
      case RANDOM => SERandom(arg)
      case NATIVE => SENative(arg)
      case CONCURRENT => SEConcurrent(attachSTE(arg, "random"))
      case CHOOSE => SEChoose(arg)
      case FORCE => SEForce(attachSTE(arg, "force"))
      case EXCEPTION => attachSTE(SEException(arg), "exception")
      case TYPEOF => SETypeOf(arg)
      case k => throwInternalError(n.location, "unknown unary operator code: "+k)
    }
    result.setLocation(n.location)
    result
  }

  def mergeLoc(l1 : Location, l2 : Location) : Location = {
    if (l1 == null) l2
    else if (l2 == null) l1
    else l1.add(l2)
  }

  def buildIf(n : IfNode) : Locatable = {
    val conds = toList(n.conditions)
    val blocks = toList(n.blocks)
    def mkif (cs : List[Node], bs : List[Node]) : Statement = {
      (cs, bs) match {
        case (c::crest, b::brest) =>
          val cond = buildSimpleExpression(c)
          val yes = buildBlock(b)
          val no = mkif(crest, brest) match {
            case SBlock(b) => b
            case x =>
              val q = Block(List(x))
              q.setLocation(x.location)
              q
          }
          val r = SIf(cond, yes, no)
          r.setLocation(mergeLoc(cond.location, mergeLoc(yes.location, no.location)))
          r
        case (_, List(b)) => buildStatement(b)
        case (List(), List()) => SBlock(Block(List()))
        case _ => throwInternalError(n.location, "invalid if")
      }
    }
    mkif(conds, blocks)
  }

  def mkExpressionBranches(ps : List[Node], bs : List[Node]) : List[(Pattern, Expression, Type)] = {
    (ps, bs) match {
      case (p::prest, b::brest) =>
        (buildProperPattern(p), buildExpression(b), TypeNone()) :: (mkExpressionBranches(prest, brest))
      case (List(), List()) => List()
      case _ => throwInternalError(null, "invalid expression branches")
    }
  }

  def mkBlockBranches(ps : List[Node], bs : List[Node]) : List[(Pattern, Block)] = {
    (ps, bs) match {
      case (p::prest, b::brest) =>
        (buildProperPattern(p), buildBlock(b)) :: (mkBlockBranches(prest, brest))
      case (List(), List()) => List()
      case _ => throwInternalError(null, "invalid block branches")
    }
  }

  /*  def removeTemporaries(statements : List[Statement]) : List[Statement] = {
    var memos : SortedMap[Id, MemoType] = SortedMap()
    var privates : SortedMap[Id, Visibility] = SortedMap()
    val defIds = CollectVars.collectDefIds(statements)
    val typeIds = CollectVars.collectTypeIds(statements)
    var defs : SortedMap[Id, (Def, SortedSet[Id], Int)] = SortedMap()
    var defsFirstVal : SortedMap[Id, (Id, Int)] = SortedMap()
    var vals : SortedMap[Id, Int] = SortedMap()
    var line : Int = 0
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
        case SImport(path, importAll) =>
          if (!importAll) {
            val id = path.last
            if (defs.contains(id)) error(path.location, "clash with definition of same name")
            val deps : SortedSet[Id] = SortedSet()
            val sdef = s.asInstanceOf[Def]
            defs = defs + (id -> (sdef, deps, -1))
          //sdef.stackTraceElement = Values.StackTraceElement(id.location, "import of '"+id.name+"'")
            if (!defsFirstVal.contains(id))
              defsFirstVal = defsFirstVal + (id -> (id, line))
          }
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
          val invalidVs = vs ** defIds
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
            case SImport(_, _) =>
              if (memo != MemoTypeNone())
                error(memo.location, "memoization is not applicable to imports")
              if (vis != VisibilityAll())
                error(vis.location, "imports cannot be public anyways")
              sdef
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
        for (d <- ds) loc = mergeLoc(loc, d.location)
        val sds = SDefs(ds)
        sds.setLocation(loc)
        newStatements = sds :: newStatements
      }
      s match {
        case _ : TemporaryStatement =>
        case _ : SImport =>
        case _ =>
          newStatements = s :: newStatements
      }
      line = line + 1
    }
    newStatements.reverse   
  }*/

  def build(node : Node) : Locatable = {
    val result : Locatable = node match {
      case n : BeginNode =>
        SBlock(build(n.block()).asInstanceOf[Block])
      case n : BlockNode =>
        val l = toList(n.statements())
        Block(l.map(buildStatement).toList)
      case n : IntegerNode =>
        SEInt(new BigInt(n.value()))
      case n : FloatNode =>
        SEFloat(new BigInt(n.mantissa()), new BigInt(n.exponent()))
      case n : StringNode =>
        SEString(n.value)
      case n : MessageNode =>
        Id(n.name().toLowerCase)
      case n : NullaryNode =>
        buildNullary(n)
      case n : BinaryNode =>
        buildBinaryOperation(n.leftOperand, n.rightOperand, n.operator);
      case n : UnaryNode =>
        buildUnary(n)
      case n : IdentifierNode =>
        Id(n.name.toLowerCase)
      case n : ConstrNode =>
        buildConstr(n)
      case n : CompareNode =>
        buildCompare(n)
      case n : ValNode =>
        val e = buildExpression(n.rightSide)
        val p = buildProperPattern(n.pattern)
        if (n.assign) SAssign(p, e) else SVal(p, e)
      case n : ObjectUpdateNode =>
        val e = buildExpression(n.rightSide)
        val id = Id(n.id.name.toLowerCase)
        id.setLocation(n.id.location)
        val m = Id(n.message.name)
        m.setLocation(n.message.location)
        if (n.assign)
          SAssignRecordUpdate(id, m, e)
        else
          SValRecordUpdate(id, m, e)
      case n : ImportNode => {
        val nodes = n.ids
        val path = Path(toList(nodes).map(x => build(x).asInstanceOf[Id]))
        path.location = nodes.location
        /*if (n.importAll)
    error(path.location, "no wildcard imports allowed")*/
        if (nodes.length < 1)
          error(n.location, "import path must contain at least one dot")
        def mkid(n : Node) = build(n).asInstanceOf[Id]
        val entries = toList(n.entries).map(x => x.asInstanceOf[ImportNode.Entry])
        var plus : List[(Id, Id)] = List()
        for (e <- entries) {
          e.entryType match {
            case ImportNode.ENTRY_MAP =>
              plus = (mkid(e.id1), mkid(e.id2)) :: plus
            case ImportNode.ENTRY_PLUS =>
              val i = mkid(e.id1)
              plus = (i, i) :: plus
            case ImportNode.ENTRY_MINUS =>
              error(e.location, "negative imports are not allowed")
            case ImportNode.ENTRY_ALL =>
              error(e.location, "wildcard imports are not allowed")
          }
        }
        TempImport(path, plus.reverse)
      }
      case n : ModuleNode => {
        val nodes = n.moduleId.ids
        val path = Path(toList(nodes).map(x => build(x).asInstanceOf[Id]))
        var ids : SortedSet[Id] = SortedSet()
        val u = Id("unittest")
        var ucount = 0
        var loc : Location = null
        for (i <- path.ids) {
          if (i == u) {
            ucount = ucount + 1
            loc = i.location
          }
        }
        if (ucount > 1)
            error(loc, "'unittest' keyword appears more than once in module path");
        path.location = nodes.location
        SModule(path, buildBlock(n.block))
      }
      case n : ForNode =>
        SFor(buildProperPattern(n.pattern), buildSimpleExpression(n.collection),
          buildBlock(n.block))
      case n : IfNode =>
        buildIf(n)
      case n : LambdaNode =>
        val f = SEFun(MemoTypeNone(), mkExpressionBranches(toList(n.patterns), toList(n.blocks)))
        f.stackTraceElement = Values.StackTraceElement(n.location, "application of anonymous function")
        f
      case n : WhileNode =>
        SWhile(buildSimpleExpression(n.condition), buildBlock(n.block))
      case  n : WithNode =>
        EWith(buildSimpleExpression(n.collector), buildBlock(n.control))
      case n : YieldNode =>
        SYield(buildExpression(n.expr))
      case p : PragmaNode =>
        import PragmaNode._
        val e = buildExpression(p.expr)
        val u = p.pragma match {
          case PRAGMA_PRINT => PragmaPrint(e)
          case PRAGMA_LOG => PragmaLog(e)
          case PRAGMA_ASSERT => PragmaAssert(e)
          case PRAGMA_PROFILE => PragmaProfile(e)
          case PRAGMA_CATCH =>
            val pat = buildProperPattern(p.pattern())
            PragmaCatch(e, pat)
        }
        SPragma(u)
      case n : MatchNode =>
        SMatch(buildSimpleExpression(n.value),
          mkBlockBranches(toList(n.patterns), toList(n.blocks)))
      case n : TryNode =>
        STry(buildBlock(n.block),
          mkBlockBranches(toList(n.patterns), toList(n.blocks)))
      case n : MemoizeNode =>
        def buildMemo(memoNode : Node) : (MemoType, Id) = {
          memoNode match {
            case mid : MemoizeNode.MemoId =>
              val id = Id(mid.id.name.toLowerCase)
              id.setLocation(mid.id.location)
              val m =
                if (mid.strong)
                  MemoTypeStrong()
                else
                  MemoTypeWeak()
              m.setLocation(mid.location)
              (m, id)
          }
        }
        TempMemoize(toList(n.memoIds).map(buildMemo _))
      case n : DefNode =>
        val id = Id(n.id.name.toLowerCase)
        id.setLocation(n.id.location)
        val rightSide = buildExpression(n.rightSide)
        var returnType : Program.Type = TypeNone()
        if (n.returnType != null) returnType = buildType(n.returnType);
        if (n.pattern != null) {
          val pat = buildProperPattern(n.pattern)
          TempDef1(id, pat, rightSide, returnType)
        } else {
          TempDef0(id, rightSide, returnType)
        }
      case n : TypedefNode =>
        def buildClause(_tc : Node) : (Pattern, Option[Expression]) = {
          val tc = _tc.asInstanceOf[TypedefClauseNode]
          val p = buildPattern(tc.pattern)
          var e : Option[Expression] = None
          if (tc.expr != null) e = Some(buildExpression(tc.expr))
          (p, e)
        }
        val id = Id(n.id.name.toLowerCase)
        id.setLocation(n.id.location)
        val clauses = toList(n.clauses).map(buildClause _)
        TempTypeDef(id, clauses)
      case n : ConversionNode =>
        val e = buildExpression(n.expr)
        TempConversionDef(buildTypePath(n.returnType), e)
      case n : TypeExprNode =>
        SETypeExpr(buildTypePath(n.typeId))
      case n : ListNode =>
        val ses = toList(n.elements).map(buildSimpleExpression _)
        if (n.isVector)
          SEVector(ses)
        else
          SEList(ses)
      case n : MapNode =>
        def buildKeyValue(node : Node) : (SimpleExpression, SimpleExpression) = {
          node match {
            case kv : MapNode.KeyValue =>
              val k = buildSimpleExpression(kv.key)
              val v = buildSimpleExpression(kv.value)
              (k, v)
            case _ => throwInternalError(n.location, "invalid MapNode")
          }
        }
        SEMap(toList(n.elements).map(buildKeyValue _))
      case n : SetNode =>
        SESet(toList(n.elements).map(buildSimpleExpression _))
      case n : RecordNode =>
        def buildRecordValue(node : Node) : (Id, SimpleExpression) = {
          node match {
            case kv : RecordNode.MessageValue =>
              val m = Id(kv.message.name.toLowerCase)
              m.setLocation(kv.message.location)
              val v = buildSimpleExpression(kv.value)
              (m, v)
            case _ => throwInternalError(n.location, "invalid RecordNode")
          }
        }
        SERecord(toList(n.elements).map(buildRecordValue _))
      case n : ObjectNode =>
        val block = buildBlock(n.block)
        for (st <- block.statements) {
          if (!isAllowedInObject(st))
            error(st.location, "this statement is not allowed in an object definition")
        }
        val messages = CollectVars.collectDefIds(block.statements).toList
        if (n.parents != null) {
          val parents = buildSimpleExpression(n.parents)
          if (n.combineMethod == ObjectNode.COMBINE_GLUE)
            SEGlueObj(parents, block, messages)
          else {
            error(n.location, "cannot use * operator for inheritance, must use +");
            SEGlueObj(parents, block, messages)
          }
        } else SEObj(block, messages)
      case n : PrivateNode => {
        def buildVisibility(vNode : Node) : (Visibility, Id) = {
          vNode match {
            case vid : PrivateNode.PrivateId =>
              val id = Id(vid.id.name.toLowerCase)
              id.setLocation(vid.id.location)
              val v = VisibilityNo()
              v.setLocation(vid.location)
              (v, id)
          }
        }
        TempPrivate(toList(n.privateIds).map(buildVisibility _))
      }
      case n : ParseErrorNode =>
        error(node.location(), "syntax error")
        SEVector(List())
      case _ =>
        error(node.location(), "invalid Babel-17 term encountered: "+node)
        Block(List())
    }
    result.setLocation(node.location())
    return result
  }

  def isDeltaPattern(pattern : Pattern) : Boolean = {
    pattern match {
      case PEllipsis() => true
      case PIf (pat, _) => if (pat == null) false else isDeltaPattern(pat)
      case PAs (_, pat) => isDeltaPattern(pat)
      case _ => false
    }
  }

  def splitDelta(list : List[Pattern]) : (List[Pattern], Pattern) = {
    val (u, v) =
      if (list.isEmpty) (list, null)
      else {
        val last = list.last
        if (isDeltaPattern(last)) {
          val len = list.length
          if (len == 1) {
            error(last.getLocation(), "element before delta pattern expected")
            (List(), null)
          } else {
            (list.take(len-1), last)
          }
        } else (list, null)
      }
    u.find(isDeltaPattern) match {
      case Some(delta) =>
        error(delta.getLocation, "misplaced delta-pattern");
        (List(), null)
      case None =>
        (u, v)
    }
  }

  def buildProperPattern(patternNode : Node) : Pattern = {
    val p = buildPattern(patternNode)
    if (isDeltaPattern(p)) {
      error(patternNode.location, "misplaced delta-pattern")
      PAny()
    } else p
  }

  def buildPattern(patternNode : Node) : Pattern = {
    val result : Pattern = patternNode match {
      case p : IdentifierPattern =>
        val id = Id(p.name.toLowerCase)
        id.setLocation(patternNode.location)
        PId(id)
      case p : ConstrPattern =>
        val arg = if (p.pattern == null) PRecord(List(), null) else buildProperPattern(p.pattern)
        val constr = Constr(p.name.toUpperCase)
        constr.setLocation(p.nameLocation)
        PConstr(constr, arg)
      case p : ListPattern =>
        val elems =
          for (i <- toList(p.elements))
          yield buildPattern(i)
        val (e, d) = splitDelta(elems.toList)
        if (p.isVector) PVector(e,d) else PList(e,d)
      case p : SetPattern =>
        val elems =
          for (i <- toList(p.elements))
          yield buildPattern(i)
        val (e, d) = splitDelta(elems.toList)
        PSet(e, d)
      case p : ForPattern =>
        val elems =
          for (i <- toList(p.elements))
          yield buildPattern(i)
        val (e, d) = splitDelta(elems.toList)
        PFor(e, d)
      case p : MapPattern =>
        var elems : List[(Pattern, Pattern)] = List();
        var delta : Pattern = null;
        for (e <- toList(p.elements))
          e match {
            case kv : MapPattern.KeyValue =>
              elems = (buildProperPattern(kv.key), buildProperPattern(kv.value))::elems
            case d : PatternNode =>
              delta = buildPattern(d)
              if (!isDeltaPattern(delta)) {
                error(d.location, "key/value or delta pattern expected");
                delta = null;
              }
            case _ => throwInternalError(e.location, "invalid key/value pattern")
          }
        PMap(elems.reverse, delta)
      case p : RecordPattern =>
        var elems : List[(Id, Pattern)] = List();
        var delta : Pattern = null;
        for (e <- toList(p.elements))
          e match {
            case mv : RecordPattern.MessageValue =>
              val idpat = mv.message
              val m = Id(idpat.name.toLowerCase)
              m.setLocation(idpat.location);
              elems = (m, buildProperPattern(mv.value))::elems
            case d : PatternNode =>
              delta = buildPattern(d)
              if (!isDeltaPattern(delta)) {
                error(d.location, "message/value or delta pattern expected");
                delta = null;
              }
            case _ => throwInternalError(e.location, "invalid key/value pattern")
          }
        PRecord(elems.reverse, delta)
      case p : NullaryPattern =>
        import NullaryPattern._
        p.kind match {
          case ANY => PAny()
          case ELLIPSIS => PEllipsis()
          case TRUE => PBool(true)
          case FALSE => PBool(false)
          case k => throwInternalError(patternNode.location, "invalid kind of NullaryPattern: "+k)
        }
      case p : StringPattern =>
        PString(p.str())
      case p : IntegerPattern =>
        PInt(new BigInt(p.value))
      case p : ValPattern =>
        PVal(buildSimpleExpression(p.value))
      case p : PredicatePattern =>
        if (!p.deconstruct) {
          val pat = if (p.pattern == null) PBool(true) else buildProperPattern(p.pattern)
          val pred = buildSimpleExpression(p.predicate)
          PPredicate(pred, pat)
        } else {
          val pat = if (p.pattern == null) PAny() else buildProperPattern(p.pattern)
          val c = buildSimpleExpression(p.predicate)
          PDestruct(c, pat)
        }
      case p : IfPattern =>
        PIf(buildPattern(p.pattern), buildSimpleExpression(p.condition))
      case p : AsPattern =>
        val id = Id(p.identifier.name.toLowerCase)
        id.setLocation(p.identifier.location)
        PAs(id, buildPattern(p.pattern))
      case p : ConsPattern =>
        PCons(buildProperPattern(p.head), buildProperPattern(p.tail))
      case p : ExceptionPattern =>
        PException(buildProperPattern(p.param))
      case p : TypePattern =>
        val typeIdNode : TypeIdNode = p.typeId
        if (typeIdNode != null) {
          PType(buildProperPattern(p.pattern), buildType(typeIdNode))
        } else {
          PTypeVal(buildProperPattern(p.pattern), buildSimpleExpression(p.typeValue))
        }
      case p : InnerValuePattern =>
        val id = build(p.typeId).asInstanceOf[Id]
        PInnerValue(Path(List()).append(id), buildProperPattern(p.pattern))
      case p : ParseErrorNode =>
        error(patternNode.location(), "pattern syntax error")
        PAny()
      case _ =>
        error(patternNode.location(), "invalid Babel-17 pattern encountered: "+patternNode)
        PAny()
    }
    result.setLocation(patternNode.location)
    result
  }

  /*def countYields(term : Object) : Int = {
    term match {
      case Block(b) => countYields(b)
      case l : List[Statement] =>
        var i = 0
        for (e <- l) i += countYields(e)
        i
      case s : SYield =>
        error(s.location, "yield does not contribute to object definition")
        1
      case SBlock(b) => countYields(b)
      case SIf(_, yes : Block, no : Block) => countYields(yes) + countYields(no)
      case SWhile(_, b : Block) => countYields(b)
      case SFor(_, _, b : Block) => countYields(b)
      case SMatch(_, l) =>
        var i = 0
        for ((_, b : Block) <- l) {
          i += countYields(b)
        }
        i
      case _ => 0
    }
  }*/

  /*  case class ScopeEnv(nonlinear : SortedSet[Id], linear : SortedSet[Id]) {
def freeze() : ScopeEnv = {
ScopeEnv(nonlinear ++ linear, SortedSet())
}
def bind(id : Id) : ScopeEnv = {
ScopeEnv(nonlinear - id, linear + id)
}
def rebind(id : Id) {
if (!linear.contains(id))
  error(id.location, "identifier '"+id.name+"' is not in linear scope")
}
def lookup(id : Id) {
if (!nonlinear.contains(id) && !linear.contains(id))
  error(id.location, "identifier '"+id.name+"' is not in scope")
}
}      */


  //private var moduleSystem : ModuleSystem = null

  def makeProgram(result : Parser.ParseResult) : Term = {
    val node = result.node
    if (node != null)
      build(node).asInstanceOf[Term]
    else
      Block(List())
  }

  def buildProgram(moduleSystem : ModuleSystem, errors : List[ErrorMessage],
                   result : Parser.ParseResult) : (Term, List[ErrorMessage]) = {
    val term = makeProgram(result)
    val mds = ModuleSystem.scanForModules(term)
    moduleSystem.source = source
    for (md <- mds) {
      moduleSystem.add(md)
    }
    val rt = new RemoveTemporaries(moduleSystem)
    rt.source = source
    val rterm = rt.transform(rt.emptyModuleEnv, term)
    val linearScope = new LinearScope(moduleSystem)
    linearScope.source = source
    linearScope.check(linearScope.emptyEnv, rterm)
    val es = errors ++ Errors.fromParseResult(result) ++
      moduleSystem.errors ++ rt.errors ++ linearScope.errors
    (rterm, es)
  }

  /*def makeProgram(_moduleSystem : ModuleSystem, result : Parser.ParseResult) : Term =  {
    val node = result.node
    if (result.hasErrors()) {
      val e = result.exception()
      var i : Int = 0
      while (i < e.countMessages()) {
        var m = e.getMessage(i)
        error(m.location(), m.message())
        i = i+1
      }
    }
    var t : Term = null
    if (node != null) {
      moduleSystem = _moduleSystem
      t = build(node).asInstanceOf[Term]
      val linear = new LinearScope(moduleSystem)
      linear.source = source
      linear.errors = errors
      linear.check(linear.emptyEnv, t)
      errors = linear.errors
    }
    t
  }*/

}
