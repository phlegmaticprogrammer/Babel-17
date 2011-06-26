package com.babel17.naive

import scala.collection.immutable.SortedSet
import com.babel17.syntaxtree.Location

object Program {

  abstract class Locatable {
    var location : Location = null
    def setLocation(loc : Location) = {
      location = loc;
    }
    def getLocation() : Location = {
      location;
    }
  }

  abstract class MemoType extends Locatable
  case class MemoTypeWeak extends MemoType
  case class MemoTypeStrong extends MemoType  
  case class MemoTypeNone extends MemoType

  abstract class Visibility extends Locatable
  case class VisibilityYes extends Visibility
  case class VisibilityNo extends Visibility
    
  abstract class Term extends Locatable {
    var freeVars : SortedSet[Id] = null
    var introducedVars : SortedSet[Id] = null  
    var assignedVars : SortedSet[Id] = null
    var stackTraceElement : Values.StackTraceElement = null
  }
  
  case class Id(name : String) extends Locatable with Ordered[Id] {
    def compare(that : Id) : Int = {
      name.compare(that.name)
    }
    override def toString : String = name
  }
  
  case class Constr(name : String) extends Locatable

  case class Path(ids : List[Id]) extends Locatable with Ordered[Path]{
    for (id <- ids)
      location = Location.merge(location, id.location)
    
    def last : Id = {
      ids.last
    }
    def unittest:Boolean = countUnittest > 0
    def countUnittest:Int = {
      var c = 0
      for (id <- ids)
        if (id.name == "unittest") c = c+1
      return c     
    }
    def prefix(l : Int) : Path = {
      Path(ids.take(l))
    }
    def append(p : Path) : Path = {
      val path : Path = Path(ids ++ p.ids)
      path.location = if (p.location == null) this.location else p.location
      path
    }
    def append(id : Id) : Path = {
      val path : Path = Path(ids ++ List(id))
      path.location = if (id.location == null) this.location else id.location
      path
    }
    def length : Int = ids.length
    def normalizeTypePath : Path = {
      val l = ids.length
      if (l >= 2 && ids(l-1) == ids(l-2))
        prefix(l-1)
      else
        this
    }
    override def toString : String = {
      var s : String = ""
      for (i <- ids) {
        if (s == "")
          s = s + i;
        else
          s = s + "." + i
      }
      s
    }
    def compare(that : Path) : Int = {
      this.toString.compare(that.toString)
    }
  }

  case class Type extends Locatable
  case class TypeSome(path : Path) extends Type{
    override def toString : String = path.toString
  }
  case class TypeNone() extends Type {
    override def toString : String = "no type"
  }

  case class Block(statements : List[Statement]) extends Term
    
  abstract class Statement extends Term

  def statementIsExecutable(st : Statement) : Boolean = {
    st match {
      case _ : Def => false
      case _ : SDefs => false
      case _ : SImport => false
      case _ : TemporaryStatement => false
      case _ => true
    }
  }

  def isAllowedInObject(st : Statement) : Boolean = {
    st match {
      case _ : Def => true
      case _ : SDefs => true
      case _ : SImport => true
      case _ : TemporaryStatement => true
      case _ : SPragma => true
      case _ : SVal => true
      case _ : SAssign => true
      case _ : SAssignRecordUpdate => true
      case _ : SValRecordUpdate => true
      case _ => false
    }
  }
  
  abstract class Def extends Statement

  abstract class Pragma extends Locatable

  case class PragmaPrint(e : Expression) extends Pragma
  case class PragmaLog(e : Expression) extends Pragma
  case class PragmaProfile(e : Expression) extends Pragma
  case class PragmaAssert(e : Expression) extends Pragma
  case class PragmaCatch(e : Expression, pat : Pattern) extends Pragma

  case class SVal(pat : Pattern, e : Expression) extends Statement
  case class SAssign(pat : Pattern, e : Expression) extends Statement
  case class SValRecordUpdate(id : Id, m : Id, e : Expression) extends Statement
  case class SAssignRecordUpdate(id : Id, m : Id, e : Expression) extends Statement
  case class SModule(path : Path, b : Block) extends Statement
  case class SDef0(memoize : MemoType, visibility : Visibility,
                   id : Id, e : Expression, returnType : Type) extends Def
  case class SDef1(memoize : MemoType, visibility : Visibility,
                   id : Id, branches : List[(Pattern, Expression, Type)]) extends Def
  case class STypeDef(memoize : MemoType, visibility : Visibility,
                      id : Id, ty : Path, branches : List[(Pattern, Option[Expression])]) extends Def
  case class SImport(path : Path, id : Id) extends Statement
  case class SDefs(defs : List[Def]) extends Statement
  case class SYield(e : Expression) extends Statement
  case class SBlock(b : Block) extends Statement
  case class SIf(cond:SimpleExpression,yes:Block,no:Block) extends Statement
  case class SWhile(cond:SimpleExpression,body:Block) extends Statement
  case class SFor(pat:Pattern,list:SimpleExpression,body:Block) extends Statement
  case class SMatch(se : SimpleExpression, branches : List[(Pattern, Block)]) extends Statement
  case class STry(block : Block, branches : List[(Pattern, Block)]) extends Statement
  case class SPragma(pragma : Pragma) extends Statement

  case class TemporaryStatement extends Statement
  case class TempDef0(id : Id, e : Expression, returnType: Type) extends TemporaryStatement
  case class TempDef1(id : Id, pat : Pattern, e : Expression, returnType: Type) extends TemporaryStatement
  case class TempTypeDef(id : Id, branches: List[(Pattern, Option[Expression])]) extends TemporaryStatement
  case class TempMemoize(memos : List[(MemoType, Id)]) extends TemporaryStatement
  case class TempPrivate(visibilities : List[(Visibility, Id)]) extends TemporaryStatement
  case class TempImport(prefix : Path, plus:List[(Id, Id)]) extends TemporaryStatement
  case class TempConversionDef(returnType : Path, e : Expression) extends TemporaryStatement
   
  abstract class Expression extends Term
  case class ESimple (se:SimpleExpression) extends Expression
  case class EBlock (b:Block) extends Expression
  case class EWith (se:SimpleExpression, b:Block) extends Expression

  abstract class SimpleExpression extends Term
  case class SEInt(value: BigInt) extends SimpleExpression
  case class SEFloat(mantissa: BigInt, exponent: BigInt) extends SimpleExpression {
    val realValue = IntervalArithmetic.makeRealValue(mantissa, exponent)
  }
  case class SEBool(value: Boolean) extends SimpleExpression
  case class SEString(value: String) extends SimpleExpression
  case class SEId(id: Id) extends SimpleExpression
  case class SEConstr(c: Constr, param: SimpleExpression) extends SimpleExpression
  case class SEThis() extends SimpleExpression 
  case class SERoot() extends SimpleExpression
  case class SENative(u : SimpleExpression) extends SimpleExpression
  case class SEExpr(se: Expression) extends SimpleExpression
  case class SEOr(u : SimpleExpression, v : SimpleExpression) extends SimpleExpression
  case class SEAnd(u : SimpleExpression, v : SimpleExpression) extends SimpleExpression
  case class SENot(u : SimpleExpression) extends SimpleExpression
  case class SEInterval(u : SimpleExpression, v : SimpleExpression) extends SimpleExpression
  case class SECons(head : SimpleExpression, tail : SimpleExpression) extends SimpleExpression
  case class SEFun(m : MemoType, branches: List[(Pattern, Expression, Type)]) extends SimpleExpression
  case class SETypeIntro(m : MemoType, ty: Path, branches: List[(Pattern, Option[Expression])]) extends SimpleExpression
  case class SESet(elems: List[SimpleExpression]) extends SimpleExpression
  case class SEMap(elems: List[(SimpleExpression, SimpleExpression)]) extends SimpleExpression
  case class SERecord(elems: List[(Id, SimpleExpression)]) extends SimpleExpression
  case class SEList(elems: List[SimpleExpression]) extends SimpleExpression
  case class SEVector(elems: List[SimpleExpression]) extends SimpleExpression
  case class SEGlueObj(parents: SimpleExpression, b : Block, messages : SortedSet[Id]) extends SimpleExpression
  //case class SEMergeObj(parents: SimpleExpression, b : Block) extends SimpleExpression
  case class SEObj(b : Block, messages : SortedSet[Id]) extends SimpleExpression
  case class SEMessageSend(target: SimpleExpression, m : Id) extends SimpleExpression
  case class SEApply(f : SimpleExpression, x : SimpleExpression) extends SimpleExpression
  case class SECompare(operands : List[SimpleExpression], operators : List[CompareOp]) extends SimpleExpression
  case class SERelate(u : SimpleExpression, v : SimpleExpression) extends SimpleExpression
  case class SEConvert(u : SimpleExpression, ty: Either[Path, SimpleExpression]) extends SimpleExpression
  case class SELazy(u : SimpleExpression) extends SimpleExpression
  case class SERandom(u : SimpleExpression) extends SimpleExpression
  case class SEConcurrent(u : SimpleExpression) extends SimpleExpression
  case class SEChoose(u : SimpleExpression) extends SimpleExpression
  case class SEForce(u : SimpleExpression) extends SimpleExpression
  case class SEException(u : SimpleExpression) extends SimpleExpression
  case class SETypeOf(u : SimpleExpression) extends SimpleExpression
  case class SETypeExpr(path : Path) extends SimpleExpression

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
  case class PId(id:Id) extends Pattern
  case class PAny() extends Pattern
  case class PEllipsis() extends Pattern
  case class PConstr(c:Constr, arg:Pattern) extends Pattern
  case class PVector(elems: List[Pattern], delta : Pattern) extends Pattern
  case class PList(elems: List[Pattern], delta : Pattern) extends Pattern
  case class PSet(elems: List[Pattern], delta : Pattern) extends Pattern
  case class PMap(keyValues : List[(Pattern, Pattern)], delta : Pattern) extends Pattern
  case class PFor(elems : List[Pattern], delta : Pattern) extends Pattern
  case class PRecord(keyValues : List[(Id, Pattern)], delta : Pattern) extends Pattern
  case class PPredicate(predicate:SimpleExpression, pattern : Pattern) extends Pattern
  case class PDestruct(constructor:SimpleExpression, pattern : Pattern) extends Pattern
  case class PVal(value:SimpleExpression) extends Pattern
  case class PIf(pattern : Pattern, condition : SimpleExpression) extends Pattern
  case class PAs(id:Id, pattern : Pattern) extends Pattern
  case class PCons(head : Pattern, tail : Pattern) extends Pattern
  case class PException(arg : Pattern) extends Pattern
  case class PType(pattern : Pattern, ty : Type) extends Pattern
  case class PTypeVal(pattern : Pattern, ty : SimpleExpression) extends Pattern
  case class PInnerValue(ty : Path, pattern : Pattern) extends Pattern

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
