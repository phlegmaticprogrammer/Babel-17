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
    return new RuntimeException(message+": "+node)
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
        return pattern.asInstanceOf[IdentifierPattern].name()
      else
        throw nonmini(pattern, "pattern that is not an identifier")
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
      return EId(n.name())
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
      def arithtest(f:(BigInt, BigInt)=>Boolean)(a:Value, b:Value) : Value = {
        (a, b) match {
          case (VInt(x), VInt(y)) => return VBool (f(x,y))
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
        case OperatorNode.EQUAL => arithtest((a:BigInt,b:BigInt) => a == b) _
        case OperatorNode.UNEQUAL => arithtest((a:BigInt,b:BigInt) => a != b) _
        case OperatorNode.GREATER => arithtest((a:BigInt,b:BigInt) => a > b) _
        case OperatorNode.LESS => arithtest((a:BigInt,b:BigInt) => a < b) _
        case OperatorNode.GREATER_EQ => arithtest((a:BigInt,b:BigInt) => a >= b) _
        case OperatorNode.LESS_EQ => arithtest((a:BigInt,b:BigInt) => a <= b) _
        case OperatorNode.APPLY => app _
        case _ => throw nonmini(node, "unknown binary operator")
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

  def main(args: Array[String]): Unit = {
    println("Mini Babel-17, (c) 2010 Steven Obua")
    println("");
    if (args.length == 0) {
      println("Please specify which file to execute!")
    } else {
      val node = com.babel17.interpreter.Examples.mini_frontend(args(0));
      if (node != null) {
        val t = build(node)
        println("term = "+t)
      }
    }
  }

}
