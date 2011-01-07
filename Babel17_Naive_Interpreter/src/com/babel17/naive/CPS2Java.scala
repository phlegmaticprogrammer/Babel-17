package com.babel17.naive

class CPS2Java {

  case class Unsupported(reason : String) extends Exception

  def genC(printer : Printer, s : String) {
    printer.space()
    printer.print(s)
    printer.space()
  }

  def genVar(printer : Printer, v : CPS.Var) {
    genC(printer, v.name)
  }

  def genExpr(printer : Printer, pexp : CPS.PrimExp) {
    pexp match {
      case CPS.PrimVar(v) => genVar(printer,v)
      case CPS.PrimBool(b) => genC(printer, if (b) "true" else "false")
      case CPS.PrimInt(i) => genC(printer, if (i >= 0) ""+i else "("+i+")")
      case _ =>
        throw new Unsupported("cannot generate expr for: "+pexp)
    }

  }

  def genBody(printer : Printer, cexp : CPS.ContExp) {
    cexp match {
      case CPS.Val(v, exp, cont) =>
        printer.print("final B17Value ")
        genVar(printer, v)
        printer.print(" = ")
        genExpr(printer,exp)
        printer.print(";")
        printer.break
        genBody(printer, cont)
      case CPS.Defs(defs, cont) =>
        for (d <- defs) {

        }
        printer.break
        genBody(printer, cont)
      case _ =>
        throw new Unsupported("cannot generate body for: "+cexp)

    }
  }

}