package com.babel17.naive

object CPS {

  // can be evaluated within a fixed growth of the current control context
  // does not create new bindings
  // may evaluate to a dynamic exception
  class PrimExp extends ContExp

  // can lead to arbitrary growth of the current control context
  // can create new bindings
  class ContExp

  class Def

  case class Var(name : String) {
    override def toString : String = name
  }
  case class Message(name : String) {
    override def toString : String = name
  }

  case class PrimVar(name : Var) extends PrimExp
  case class PrimInt(value : BigInt) extends PrimExp
  case class PrimInfinity(positive : Boolean) extends PrimExp
  case class PrimBool(value : Boolean) extends PrimExp
  case class PrimString(value : String) extends PrimExp
  case class PrimMap(elements : List[(PrimExp, PrimExp)]) extends PrimExp
  case class PrimSet(elements : List[PrimExp]) extends PrimExp
  case class PrimVector(elements : List[PrimExp]) extends PrimExp
  case class PrimList(elements : List[PrimExp]) extends PrimExp
  case class PrimConcurrent(cexp : ContExp) extends PrimExp
  case class PrimLazy(cexp : ContExp) extends PrimExp
  case class PrimConstr(constr : String, param : PrimExp) extends PrimExp
  case class PrimCons(head : PrimExp, tail : PrimExp) extends PrimExp
  case class PrimForce(pexp : PrimExp, deep : Boolean) extends PrimExp
  case class PrimRandom(n : PrimExp) extends PrimExp
  case class PrimRecordUpdate(record : PrimExp, m : Message, value : PrimExp) extends PrimExp
  case class PrimObject(fields : List[(Message, PrimExp)], parents : Option[PrimExp]) extends PrimExp
  case class PrimChoose(coll : PrimExp) extends PrimExp
  case class PrimException(param : PrimExp) extends PrimExp
  case class PrimNot(pexp : PrimExp) extends PrimExp
  case class PrimCompare(a : PrimExp, b : PrimExp, op : Program.CompareOp) extends PrimExp

  case class Defs(Def : List[Def], cexp : ContExp) extends ContExp
  case class Suspension(id : Var, memotype : Program.MemoType,
                        k : Var, body : ContExp) extends Def
  case class Function(id : Var, memotype : Program.MemoType,
                      arg : Var, k : Var, body : ContExp) extends Def
  case class Continuation(id : Var, args : List[Var], body : ContExp) extends Def

  case class Val(id : Var, p : PrimExp, cexp : ContExp) extends ContExp

  case class Apply(f : PrimExp, m : Option[Message], args : List[PrimExp]) extends ContExp

  //case class Compare(a : PrimExp, b : PrimExp, op : Program.CompareOp, cexp : ContExp) extends ContExp
  case class WithBegin
  (collector : Option[PrimExp], coll : Var, cexp : ContExp) extends ContExp
  case class WithEnd(coll : Var, closedColl : Var, cexp : ContExp) extends ContExp
  case class Yield(coll : Var, p : PrimExp, cexp : ContExp) extends ContExp
  case class If(cond : PrimExp, a : ContExp, b : ContExp) extends ContExp
  case class Switch(index : PrimExp, cont : List[ContExp]) extends ContExp

  def print(printer : Printer, d : Def) {
    d match {
      case Function(id, mt, arg, k, body) =>
        printer.println("function "+id+"("+arg+","+k+") :")
        printer.addIndent
        print(printer, body)
        printer.subIndent
        printer.break
      case Suspension(id, mt, k, body) =>
        printer.println("suspension "+id+"("+k+") :")
        printer.addIndent
        print(printer, body)
        printer.subIndent
        printer.break
      case Continuation(id, args, body) =>
        printer.print("jump "+id+"(")
        var first = true
        for (a <- args) {
          if (first) first = false
          else printer.print(",")
          printer.print(""+a)
        }
        printer.println(") : ")
        printer.addIndent
        print(printer, body)
        printer.subIndent
        printer.break
    }
  }

  def print(printer : Printer, cexp : ContExp) {
    cexp match {
      case Val(id, pexp, cexp) =>
        printer.print(id+" <- ")
        print(printer, pexp)
        printer.println("")
        print(printer, cexp)
        printer.break
      case Defs(defs, cexp) =>
        printer.println("definitions:")
        printer.addIndent
        for (d <- defs)
          print(printer, d)
        printer.subIndent
        print(printer, cexp)
        printer.break
      case PrimInt(v) =>
        printer.print(""+v)
      case PrimBool(v) =>
        printer.print(""+v)
      case PrimVar(v) =>
        printer.print(""+v)
      case p:PrimExp =>
        printer.print("pexp")
      case WithBegin(None, cVar, cexp) =>
        printer.println("open "+cVar)
        print(printer, cexp)
        printer.break
      case WithBegin(Some(c), cVar, cexp) =>
        printer.print("with ");
        print(printer, c)
        printer.println(" open "+cVar)
        //printer.addIndent
        print(printer, cexp)
        printer.break
      case WithEnd(collV, closedCollV, cexp) =>
        //printer.subIndent
        printer.println(closedCollV+" <- close "+collV)
        print(printer, cexp)
        printer.break
      case If(pexp, yes, no) =>
        printer.print("if ")
        print(printer, pexp)
        printer.println(" then")
        printer.addIndent
        print(printer, yes)
        printer.break
        printer.subIndent
        printer.println("else")
        printer.addIndent
        print(printer, no)
        printer.break
        printer.subIndent
      case Yield(collV, pexp, cexp) =>
        printer.print("yield ")
        print(printer, pexp)
        printer.println(" -> "+collV)
        print(printer, cexp)
        printer.break
      case Apply(f, m, args) =>
        print(printer, f)
        m match {
          case None =>
          case Some(m) =>
            printer.print("."+m)
        }
        printer.print("(")
        var first : Boolean = true
        for (a <- args) {
          if (first) first = false
          else printer.print(",")
          print(printer, a)
        }
        printer.print(")")
        printer.break
      case s => printer.println("ContExp: "+s)
    }
  }
}