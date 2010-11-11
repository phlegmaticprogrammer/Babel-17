package com.babel17.naive

import scala.collection.immutable.SortedSet

object Program {

  abstract class Locatable {
    var location : com.babel17.syntaxtree.Location = null
    def setLocation(loc : com.babel17.syntaxtree.Location) = {
      location = loc;
    }
    def getLocation() : com.babel17.syntaxtree.Location = {
      location;
    }
  }

  abstract class MemoType extends Locatable
  case class MemoTypeWeak extends MemoType
  case class MemoTypeStrong extends MemoType  
  case class MemoTypeNone extends MemoType
    
  abstract class Term extends Locatable {
    var freeVars : SortedSet[Id] = null
    var introducedVars : SortedSet[Id] = null  
    var assignedVars : SortedSet[Id] = null
  }

  case class Message(m : String) extends Locatable with Ordered[Message] {
    def compare(that : Message) : Int = {
      m.compare(that.m)
    }    
  }
  
  case class Id(name : String) extends Locatable with Ordered[Id] {
    def compare(that : Id) : Int = {
      name.compare(that.name)
    }
  }
  
  case class Constr(name : String) extends Locatable

  case class Block(statements : List[Statement]) extends Term
    
  abstract class Statement extends Term
  
  abstract class Def extends Statement  
    
  case class SVal(pat : Pattern, e : Expression) extends Statement
  case class SAssign(pat : Pattern, e : Expression) extends Statement
  case class SValRecordUpdate(id : Id, m : Message, e : Expression) extends Statement
  case class SAssignRecordUpdate(id : Id, m : Message, e : Expression) extends Statement
  case class SDef0(memoize : MemoType, id : Id, e : Expression) extends Def
  case class SDef1(memoize : MemoType, id : Id, branches : List[(Pattern, Expression)]) extends Def
  case class SDefs(defs : List[Def]) extends Statement
  case class SYield(e : Expression) extends Statement
  case class SBlock(b : Block) extends Statement
  case class SIf(cond:SimpleExpression,yes:Block,no:Block) extends Statement
  case class SWhile(cond:SimpleExpression,body:Block) extends Statement
  case class SFor(pat:Pattern,list:SimpleExpression,body:Block) extends Statement
  case class SMatch(se : SimpleExpression, branches : List[(Pattern, Block)]) extends Statement

  case class TemporaryStatement extends Statement
  case class TempDef0(id : Id, e : Expression) extends TemporaryStatement
  case class TempDef1(id : Id, pat : Pattern, e : Expression) extends TemporaryStatement
  case class TempMemoize(memos : List[(MemoType, Id)]) extends TemporaryStatement
    
  abstract class Expression extends Term
  case class ESimple (se:SimpleExpression) extends Expression
  case class EBlock (b:Block) extends Expression
  case class EWith (se:SimpleExpression, b:Block) extends Expression

  abstract class SimpleExpression extends Term
  case class SEInt(value: BigInt) extends SimpleExpression
  case class SEBool(value: Boolean) extends SimpleExpression
  case class SEString(value: String) extends SimpleExpression
  case class SEId(id: Id) extends SimpleExpression
  case class SEConstr(c: Constr, param: SimpleExpression) extends SimpleExpression
  case class SEInfinity(positive: Boolean) extends SimpleExpression
  //case class SEThis() extends SimpleExpression
  case class SEExpr(se: Expression) extends SimpleExpression
  case class SEOr(u : SimpleExpression, v : SimpleExpression) extends SimpleExpression
  case class SEAnd(u : SimpleExpression, v : SimpleExpression) extends SimpleExpression
  case class SENot(u : SimpleExpression) extends SimpleExpression
  case class SECons(head : SimpleExpression, tail : SimpleExpression) extends SimpleExpression
  case class SEFun(branches: List[(Pattern, Expression)]) extends SimpleExpression
  case class SESet(elems: List[SimpleExpression]) extends SimpleExpression
  case class SEMap(elems: List[(SimpleExpression, SimpleExpression)]) extends SimpleExpression
  case class SERecord(elems: List[(Message, SimpleExpression)]) extends SimpleExpression
  case class SEList(elems: List[SimpleExpression]) extends SimpleExpression
  case class SEVector(elems: List[SimpleExpression]) extends SimpleExpression
  case class SEGlueObj(parents: SimpleExpression, b : Block) extends SimpleExpression
  //case class SEMergeObj(parents: SimpleExpression, b : Block) extends SimpleExpression
  case class SEObj(b : Block) extends SimpleExpression
  case class SEMessageSend(target: SimpleExpression, m : Message) extends SimpleExpression
  case class SEApply(f : SimpleExpression, x : SimpleExpression) extends SimpleExpression
  case class SECompare(operands : List[SimpleExpression], operators : List[CompareOp]) extends SimpleExpression
  case class SELazy(u : SimpleExpression) extends SimpleExpression
  case class SERandom(u : SimpleExpression) extends SimpleExpression
  case class SEConcurrent(u : SimpleExpression) extends SimpleExpression
  case class SEAwait(u : SimpleExpression) extends SimpleExpression
  case class SEException(u : SimpleExpression) extends SimpleExpression

  abstract class CompareOp extends Locatable
  case class EQUAL() extends CompareOp
  case class UNEQUAL() extends CompareOp
  case class GREATER() extends CompareOp
  case class GREATER_EQ() extends CompareOp
  case class LESS() extends CompareOp
  case class LESS_EQ() extends CompareOp

  abstract class Pattern extends Locatable {
    var freeVars : SortedSet[Id] = null
    var introducedVars : SortedSet[Id] = null
  }
    
  case class PInt(value:BigInt) extends Pattern
  case class PBool(value:Boolean) extends Pattern
  case class PString(value:String) extends Pattern
  case class PInfinity(positive:Boolean) extends Pattern
  case class PId(id:Id) extends Pattern
  case class PAny() extends Pattern
  case class PEllipsis() extends Pattern
  case class PConstr(c:Constr, arg:Pattern) extends Pattern
  case class PVector(elems: List[Pattern], delta : Pattern) extends Pattern
  case class PList(elems: List[Pattern], delta : Pattern) extends Pattern
  case class PSet(elems: List[Pattern], delta : Pattern) extends Pattern
  case class PMap(keyValues : List[(Pattern, Pattern)], delta : Pattern) extends Pattern
  case class PRecord(keyValues : List[(Message, Pattern)], delta : Pattern) extends Pattern
  case class PVal(value:SimpleExpression) extends Pattern
  case class PPredicate(predicate:SimpleExpression, pattern : Pattern) extends Pattern
  case class PIf(pattern : Pattern, condition : SimpleExpression) extends Pattern
  case class PAs(id:Id, pattern : Pattern) extends Pattern
  case class PCons(head : Pattern, tail : Pattern) extends Pattern
  case class PException(arg : Pattern) extends Pattern

  /* val y = 1
   * def f x = if x == 0 then y else g(x-1) end
   * val y = 0
   * def g x = if x == 0 then y else f(x-1) end
   * Each def has a val index, which is the highest index of a val/assign statement
   * of the block of the def that the def depends on (transitively).
   * - A val/assign can reference only those defs that have a lower val index.
   * - A def can reference only those val/assigns that have a lower val index than the def itself.
   *
   *
   */

}
