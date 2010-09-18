package com.babel17.naive

import Program._
import com.babel17.syntaxtree.patterns._
import com.babel17.syntaxtree._
import com.babel17.interpreter.parser._


object Tree2Program {

  def error (loc : com.babel17.syntaxtree.Location, msg : String) = {
    println("at "+loc+": "+msg)
  }

  def throwInternalError (loc : com.babel17.syntaxtree.Location, msg : String) = {
    throw new RuntimeException("at "+loc+": "+msg)
  }

  def toList(nl : NodeList) : List[Node] = {
      val len = nl.length()
      var i = 0
      var l = List[Node]()
      while (i < len) {
        val m = nl.get(i)
        i = i + 1
        l = m::l
      }
      return l.reverse
  }

  def buildStatement (node : Node) : Statement = {
    val s = build(node) match {
      case b : Block => SBlock(b)
      case s : Statement => s
      case e : Expression => SYield (e)
      case se : SimpleExpression => SYield (ESimple (se))
      case d : Def => SDefs (List(d))
      case id : Id => SYield (ESimple(SEId(id)))
      case x => throwInternalError(node.location(), "buildStatement: "+x)
    }
    s.setLocation(node.location())
    return s
  }

  def buildExpression (node : Node) : Expression =  {
    val e = build(node) match {
      case b : Block => EBlock(b)
      case s : Statement => EBlock(Block(List(s)))
      case e : Expression => e
      case se : SimpleExpression => ESimple(se)
      case d : Def => EBlock(Block(List(SDefs(List(d)))))
      case id : Id => ESimple(SEId(id))
      case x => throwInternalError(node.location(), "buildExpression: "+x)
    }
    e.setLocation(node.location())
    return e
  }

  def buildSimpleExpression (node : Node) : SimpleExpression =  {
    val se = build(node) match {
      case b : Block => SEExpr(EBlock(b))
      case s : Statement => SEExpr(EBlock(Block(List(s))))
      case ESimple(se) => se
      case e : Expression => SEExpr(e)
      case se : SimpleExpression => se
      case d : Def => SEExpr(EBlock(Block(List(SDefs(List(d))))))
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
      val msg = Message(m.toLowerCase)
      msg.setLocation(op.location)
      SEApply(SEMessageSend(left(), msg), right())
    }
    import OperatorNode._
    op.operator match {
      case PLUS => mk("syntactic_plus")
      case MINUS => mk("syntactic_minus")
      case TIMES => mk("syntactic_times")
      case DIV => mk("syntactic_div")
      case MOD => mk("syntactic_mod")
      case POW => mk("syntactic_pow")
      case PLUSPLUS => mk("syntactic_plusplus")
      case MINUSMINUS => mk("syntactic_minusminus")
      case TIMESTIMES => mk("syntactic_timestimes")
      case TO => mk("syntactic_to")
      case DOWNTO => mk("syntactic_downto")
      case APPLY => SEApply(left(), right())
      case MESSAGE_SEND =>
        build(rightNode) match {
          case msg : Message => SEMessageSend(left(), msg)
          case x => throwInternalError(op.location, "buildBinaryOperation, no message: "+x)
        }
      case OR => SEOr(left(), right())
      case AND => SEAnd(left(), right())
      case CONS => SECons(left(), right())
      case x => throwInternalError(op.location, "buildBinaryOperation: "+x)
    }
  }

  def buildConstr(n : ConstrNode) : SimpleExpression = {
    val c = Constr(n.name.toUpperCase)
    c.setLocation(n.nameLoc)
    val param = if (n.arg == null) SEVector(List()) else buildSimpleExpression(n.arg)
    SEConstr(c, param)
  }

  def buildCompare(n : CompareNode) : SimpleExpression = {
    def opconv(op : OperatorNode) : CompareOp = {
      val p = op.operator match {
        case OperatorNode.EQUAL => EQUAL()
        case OperatorNode.UNEQUAL => UNEQUAL()
        case OperatorNode.UNRELATED => UNRELATED()
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
      case INFINITY => SEInfinity(true)
      case TRUE => SEBool(true)
      case FALSE => SEBool(false)
      case THIS => SEThis()
      case k => throwInternalError(n.location, "unknown nullary operator code: "+k)
    }
    result.setLocation(n.location)
    result
  }
  
  def buildUnary(n : UnaryNode) : Locatable = {
    val arg = buildSimpleExpression(n.operand)
    def mk(m : String) : SimpleExpression = {
      val msg = Message(m.toLowerCase)
      msg.setLocation(n.operator().location)
      SEMessageSend(arg, msg)
    }
    import OperatorNode._
    val result : Locatable = n.operator().operator match {
      case NOT => SENot(arg)
      case UMINUS => mk("syntactic_uminus")
      case LAZY => SELazy(arg)
      case RANDOM => SERandom(arg)
      case CONCURRENT => SEConcurrent(arg)       
      case k => throwInternalError(n.location, "unknown unary operator code: "+k)       
    }
    result.setLocation(n.location)
    result
  }

  def build(node : Node) : Locatable = {
    val result : Locatable = node match {
      case n : BeginNode =>
        SBlock(build(n.block()).asInstanceOf[Block])
      case n : BlockNode =>
        val l = toList(n.statements())
        Block(l.map(buildStatement).toList)
      case n : IntegerNode =>
        SEInt(new BigInt(n.value()))
      case n : MessageNode =>
        Message(n.name().toLowerCase)
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
      case n : ParseErrorNode =>
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
        val arg = if (p.pattern == null) PVector(List(), null) else buildProperPattern(p.pattern)
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
        var elems : List[(Message, Pattern)] = List();
        var delta : Pattern = null;       
        for (e <- toList(p.elements)) 
          e match {
              case mv : RecordPattern.MessageValue =>
                val idpat = mv.message
                val m = Message(idpat.name.toLowerCase)
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
          case INFINITY => PInfinity(true)
          case NEGATIVE_INFINITY => PInfinity(false)
          case k => throwInternalError(patternNode.location, "invalid kind of NullaryPattern: "+k)
        }
      case p : StringPattern =>
        PString(p.str())
      case p : IntegerPattern =>
        PInt(new BigInt(p.value))
      case p : ValPattern =>
        PVal(buildSimpleExpression(p.value))
      case p : PredicatePattern => 
        val pat = if (p.pattern == null) null else buildProperPattern(p.pattern)
        val pred = buildSimpleExpression(p.predicate)
        PPredicate(pred, pat)
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
      case p : ParseErrorNode =>
        PAny()
      case _ =>
        error(patternNode.location(), "invalid Babel-17 pattern encountered: "+patternNode)
        PAny()
    }
    result.setLocation(patternNode.location)
    result
  }

  def main(args: Array[String]): Unit = {
    println("Babel-17, (c) 2010 Steven Obua")
    println("");
    if (args.length == 0) {
      println("Please specify which file to execute!")
    } else {
      val result = Parser.parse(args(0))
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
      if (node != null) {
        val t = build(node)
        println("term: "+t)
      }
    }
  }

}
