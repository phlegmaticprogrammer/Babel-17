package com.babel17.mini;

import com.babel17.syntaxtree._
import com.babel17.syntaxtree.patterns._


object Main {

  case class Illformed extends java.lang.Exception
  case class TypeError extends java.lang.Exception

  abstract class Value
  case class VBool(value:Boolean) extends Value
  case class VInt(value:BigInt) extends Value
  case class VFun(value:(Value)=>Value) extends Value
  case class VList(values:List[Value]) extends Value

  abstract class Term
  case class Block(statements : List[Statement]) extends Term

  abstract class Statement extends Term
  case class SVal(id:String, e : Expression) extends Statement
  case class SAssign(id:String, e : Expression) extends Statement
  case class SYield(e : Expression) extends Statement
  case class SBlock(b:Block) extends Statement
  case class SIf(cond:SimpleExpression,yes:Block,no:Block) extends Statement
  case class SWhile(cond:SimpleExpression,body:Block) extends Statement
  case class SFor(x:String,list:SimpleExpression,body:Block) extends Statement

  abstract class Expression extends Term
  case class ESimple (se:SimpleExpression) extends Expression
  case class EBlock (st:Statement) extends Expression

  abstract class SimpleExpression extends Term
  case class EInt(value:BigInt) extends SimpleExpression
  case class EBool(value:Boolean) extends SimpleExpression
  case class EId(id:String) extends SimpleExpression
  case class EFun(id:String, body:Expression) extends SimpleExpression
  case class EBinOp(f:(Value, Value)=>Value, u:Expression, v:Expression)
    extends SimpleExpression


  def error(node : Node, message : String) : RuntimeException = {
    val l = node.location().toString();
    val w = "at "+l+": "+message
    println(w)
    return new RuntimeException(w)
  }

  def nonmini(node : Node, feature : String) : RuntimeException =
    error (node, "non-Mini-Babel-17 feature encountered: "+feature)

  def buildStatement(node : Node) : Statement = {
    val t = build(node)
    if (t.isInstanceOf[Block]) {
      t.asInstanceOf[Block] match {
        case Block (List(s)) => return s
        case b => return SBlock(b)
      }
    } else if (t.isInstanceOf[Statement])
      return t.asInstanceOf[Statement]
    else if (t.isInstanceOf[Expression])
      return SYield(t.asInstanceOf[Expression])
    else if (t.isInstanceOf[SimpleExpression])
      return SYield(ESimple(t.asInstanceOf[SimpleExpression]))
    throw error(node, "invalid statement")
  }

  def buildBlock(node : Node) : Block = {
    buildStatement(node) match {
      case SBlock(b) => return b
      case s => return Block(List(s))
    }
  }

  def buildExpression(node : Node) : Expression = {
    val t = build(node)
    if (t.isInstanceOf[Block]) {
      t.asInstanceOf[Block] match {
        case Block (List(s)) => return EBlock(s)
        case b => return EBlock(SBlock(b))
      }
    } else if (t.isInstanceOf[Statement])
      return EBlock(t.asInstanceOf[Statement])
    else if (t.isInstanceOf[Expression])
      return t.asInstanceOf[Expression]
    else if (t.isInstanceOf[SimpleExpression])
      return ESimple(t.asInstanceOf[SimpleExpression])
    throw error(node, "invalid expression")
  }

  def buildSimpleExpression(node : Node) : SimpleExpression = {
    buildExpression(node) match {
      case ESimple(s) => return s
      case _ => throw nonmini(node, "cannot go back from block to simple expression")
    }
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

  def patternId(pattern : Node) : String = {
      if (pattern.isInstanceOf[IdentifierPattern])
        return pattern.asInstanceOf[IdentifierPattern].name().toLowerCase()
      else
        throw nonmini(pattern, "pattern that is not an identifier")
  }

  def compareValueLists(xs : List[Value], ys : List[Value]) : Int = {
    (xs, ys) match {
      case (List(), List()) => 0
      case (List(), _) => -1
      case (_, List()) => 1
      case (x::xs, y::ys) =>
        val c = compareValues(x, y)
        if (c == 0) compareValueLists(xs, ys)
        else c       
    }
  }

  def compareValues(a : Value, b : Value) : Int = {
    (a, b) match {
      case (VInt(x), VInt(y)) => if (x == y) 0 else if (x < y) -1 else 1;
      case (VBool(x), VBool(y)) => if (x == y) 0 else if (x) 1 else -1
      case (VList(xs), VList(ys)) =>
        compareValueLists(VInt(xs.length)::xs, VInt(ys.length)::ys);
      case (VBool(_), _) => -1
      case (_, VBool(_)) => 1
      case (VInt(_), _) => -1
      case (_, VInt(_)) => 1
      case (VList(_), _) => -1
      case (_, VList(_)) => 1
      case _ => throw TypeError ()
    }
  }

  def build(node : Node) : Term = {
    if (node.isInstanceOf[BeginNode]) {
      val n = node.asInstanceOf[BeginNode]
      return build(n.block());
    } else if (node.isInstanceOf[BlockNode]) {
      val n = node.asInstanceOf[BlockNode]
      val l = toList(n.statements())
      return Block(l.map(buildStatement))
    } else if (node.isInstanceOf[IntegerNode]) {
      val n = node.asInstanceOf[IntegerNode]
      return EInt(new BigInt(n.value()))
    } else if (node.isInstanceOf[OperatorNode]) {
      val n = node.asInstanceOf[OperatorNode]
      val op = n.operator()
      if (op == OperatorNode.TRUE)
        return EBool(true)
      else if (op == OperatorNode.FALSE)
        return EBool(false)
      throw nonmini(node, "operator")
    } else if (node.isInstanceOf[IdentifierNode]) {
      val n = node.asInstanceOf[IdentifierNode]
      return EId(n.name().toLowerCase())
    } else if (node.isInstanceOf[LambdaNode]) {
      val n = node.asInstanceOf[LambdaNode]
      val patterns = toList(n.patterns())
      val blocks = toList(n.blocks())
      if (patterns.length != 1 ||  blocks.length != 1)
        throw nonmini(node, "multi-case lambda")
      val name = patternId(patterns(0))
      return EFun(name, buildExpression(blocks(0)))
    } else if (node.isInstanceOf[BinaryNode]) {
      val n = node.asInstanceOf[BinaryNode]
      val opcode = n.operator().operator()
      def arithop(f:(BigInt, BigInt)=>BigInt)(a:Value, b:Value) : Value = {
        (a, b) match {
          case (VInt(x), VInt(y)) => return VInt (f(x,y))
          case _ => throw TypeError()
        }
      }
      def app(a:Value, b:Value) : Value = {
        a match {
          case VFun(f) => return f (b)
          case _ => throw TypeError()
        }
      }
      val left = buildExpression(n.leftOperand())
      val right = buildExpression(n.rightOperand())
      val f = opcode match {
        case OperatorNode.PLUS => arithop((a:BigInt,b:BigInt) => a+b) _
        case OperatorNode.MINUS => arithop((a:BigInt,b:BigInt) => a-b) _
        case OperatorNode.TIMES => arithop((a:BigInt,b:BigInt) => a*b) _
        case OperatorNode.DIV => arithop((a:BigInt,b:BigInt) => a/b) _
        case OperatorNode.MOD => arithop((a:BigInt,b:BigInt) => a%b) _
        case OperatorNode.APPLY => app _
        case _ => throw nonmini(node, "unknown binary operator")
      }
      return EBinOp(f, left, right)
    } else if (node.isInstanceOf[CompareNode]) {
      val n = node.asInstanceOf[CompareNode]
      val comparisons = toList(n.comparisons())
      if (comparisons.length != 3)
          throw nonmini(node, "comparison chain");
      val left = buildExpression(comparisons(0));
      val right = buildExpression(comparisons(2));
      def comp (f:Int=>Boolean)(a:Value, b:Value) : Value = {
        return VBool(f(compareValues(a, b)))
      }
      val f = (comparisons(1).asInstanceOf[OperatorNode]).operator() match {
        case OperatorNode.EQUAL => comp (_ == 0) _
        case OperatorNode.UNEQUAL => comp (_ != 0) _
        case OperatorNode.GREATER => comp (_ > 0) _
        case OperatorNode.LESS => comp (_ < 0) _
        case OperatorNode.GREATER_EQ => comp (_ >= 0) _
        case OperatorNode.LESS_EQ => comp(_ <= 0) _
        case t => throw nonmini(comparisons(1), "comparison with operator code "+t)
      }
      return EBinOp(f, left, right)
    } else if (node.isInstanceOf[YieldNode]) {
      val n = node.asInstanceOf[YieldNode]
      return SYield (buildExpression(n.expr()))
    } else if (node.isInstanceOf[ValNode]) {
      val n = node.asInstanceOf[ValNode]
      val name = patternId(n.pattern())
      val right = buildExpression(n.rightSide())
      if (n.assign())
        return SAssign(name, right)
      else
        return SVal(name, right)
    } else if (node.isInstanceOf[IfNode]) {
      val n = node.asInstanceOf[IfNode]
      val conditions = toList(n.conditions())
      val blocks = toList(n.blocks())
      if (conditions.length != 1)
        throw nonmini(node, "complex if")
      if (blocks.length != 2)
        throw nonmini(node, "else branch expected")
      return SIf(buildSimpleExpression(conditions(0)),
                 buildBlock(blocks(0)), buildBlock(blocks(1)))
    } else if (node.isInstanceOf[WhileNode]) {
      val n = node.asInstanceOf[WhileNode]
      return SWhile(buildSimpleExpression(n.condition()),
                    buildBlock(n.block()))
    } else if (node.isInstanceOf[ForNode]) {
      val n = node.asInstanceOf[ForNode]
      return SFor(patternId(n.pattern()),
                  buildSimpleExpression(n.collection()),
                  buildBlock(n.block()))
    }
    throw error(node, "non-Mini Babel-17 term encountered")
  }
  
  class ValueRef(var value : Value){
  }

  class Environment(
    val nonlinear: Map[String, Value],
    val linear: Map[String, ValueRef])
  {
    def lookupNonlinear(id : String) : Value = {
      if (nonlinear.contains(id)) nonlinear(id)
      else throw new Illformed()
    }

    def lookupLinear(id : String) : ValueRef = {
      if (linear.contains(id)) linear(id)
      else throw new Illformed()
    }

    def bind(id : String, value : Value) : Environment = {
      return new Environment(nonlinear - id,
                             linear + (id -> new ValueRef(value)))
    }

    def rebind(id : String, value : Value) : Environment = {
      lookupLinear(id).value = value
      this
    }

    def freeze() : Environment = {
      return new Environment(nonlinear ++ linear.mapValues (_.value), Map())
    }
  }

  def eval_b(env:Environment, term:Block) : (Environment, List[Value]) = {
    term match {
      case Block(List()) => (env, List())
      case Block(s::r) =>
        val (env1, values_s) = eval_st(env, s)
        val (env2, values_r) = eval_b (env1, Block(r))
        (env2, values_s ++ values_r)
    }
  }

  def eval_nestedb (env:Environment, term:Block) : (Environment, List[Value]) = {
    (env, eval_b(env, term)._2)
  }

  def eval_st (env : Environment, term : Statement) : (Environment, List[Value]) = {
    term match {
      case SVal(id, e) => (env.bind(id, eval_e (env, e)), List())
      case SAssign(id, e) => (env.rebind(id, eval_e (env, e)), List())
      case SYield(e) => (env, List(eval_e (env, e)))
      case SBlock(b) => eval_nestedb (env, b)
      case SIf(cond, yes, no) =>
        eval_se(env, cond) match {
          case VBool(true) => eval_nestedb (env, yes)
          case VBool(false) => eval_nestedb (env, no)
          case _ => throw TypeError()
        }
      case SWhile (cond, body) =>
        eval_se(env, cond) match {
          case VBool(true) =>
            val (_, v1) = eval_b (env, body)
            val (_, v2) = eval_st (env, SWhile (cond, body))
            (env, v1 ++ v2)
          case VBool(false) => (env, List())
          case _ => throw new TypeError()
        }
      case SFor (id, list, body) =>
        eval_se (env, list) match {
          case VList(l) => (env, eval_for (env, id, body, l))
          case _ => throw new TypeError()
        }
    }
  }
  
  def eval_for (env : Environment, id : String, body : Block, l : List[Value]) 
    : List[Value] =
  {
    l match {
      case x::xs =>
        val (_, v1) = eval_b (env.bind (id, x), body)
        val v2 = eval_for (env, id, body, xs)
        v1 ++ v2
      case _ => List()
    }
  }

  def eval_e (env : Environment, term : Expression) : Value = {
    term match {
      case ESimple(se) => eval_se (env, se)
      case EBlock(s) =>
        eval_b(env, Block(List(s))) match {
          case (_, List(a)) => a
          case (_, l) => VList(l)
        }
    }
  }

  def eval_se (env : Environment, term : SimpleExpression) : Value = {
    eval_simple (env.freeze(), term)
  }

  def eval_simple (env : Environment, term : SimpleExpression) : Value = {
    term match {
      case EInt(i) => VInt(i)
      case EBool(b) => VBool(b)
      case EBinOp (f, a, b) =>
        f (eval_e (env, a), eval_e (env, b))
      case EId(id) => env.lookupNonlinear(id)
      case EFun (id, body) =>
        VFun ((value:Value) => eval_e (env.bind(id, value), body))
    }
  }

  def eval (prog:Expression) : Value = {
    val empty = new Environment(Map(), Map())
    eval_e (empty, prog)
  }

  def value2str (v : Value) : String = {
    v match {
      case VInt(i) => ""+i
      case VBool(b) => ""+b
      case VList(l) => ""+(l.map (value2str(_)))
      case VFun(_) => "<lambda>"
    }
  }

  def main(args: Array[String]): Unit = {
    println("Mini Babel-17, (c) 2010 Steven Obua")
    println("");
    if (args.length == 0) {
      println("Please specify which file to execute!")
    } else {
      val node = com.babel17.interpreter.Examples.mini_frontend(args(0));
      if (node != null) {
        try {
          val t = buildExpression(node)
          println(value2str(eval (t)))
        } catch {
          case ex => ()
        }
      }
    }
  }

}
