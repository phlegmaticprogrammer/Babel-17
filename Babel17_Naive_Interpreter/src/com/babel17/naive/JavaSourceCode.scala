package com.babel17.naive

object JavaSourceCode {

  /**
   * Class names start with _class_
   * Names that denote values defined via "def" start with _def_
   * Otherwise values start with _val_
   */


  abstract class JSourceCode() {
    def printSourceCode(printer : Printer)
  }

  case class ReturnBlock() extends JSourceCode {
    def printSourceCode(printer : Printer) {
      printer.println("{ return null; }")
    }
  }

  case class DefsClosureClass(name : String,
                          boundVars : List[String],
                          defs : List[(String, Option[String], String, ReturnBlock)])
    extends JSourceCode
  {
    def isStatic : Boolean = boundVars.length == 0
    def printSourceCode(printer : Printer) {
      printer.println("final class "+name+" {")
      printer.addIndent
      if (!isStatic) {
        for (v <- boundVars) {
          printer.println("final B17Value "+v+";")
        }
        printer.println("")
        printer.print(name + "(")
        var first = true
        for (v <- boundVars) {
          if (first) first = false else printer.print(", ")
          printer.print("B17Value "+v)
        }
        printer.println(") {")
        printer.addIndent
        for (v <- boundVars) {
          printer.println("this."+v+" = "+v+";")
        }
        printer.subIndent
        printer.println("}")
        printer.println("")
      }
      for ((defname, param, cname, rblock) <- defs) {
        param match {
          case Some(param) =>
            printer.print("private ")
            if (isStatic)
              printer.print("static ")
            printer.println("B17Value _internal_"+defname+"(B17Value "+param+", Continuation "+cname+")")
            rblock.printSourceCode(printer)
            printer.print("final ")
            if (isStatic) printer.print("static ")
            printer.println("B17Function "+defname+" = new B17Function() {")
            printer.addIndent
            printer.println("public B17Value apply(B17Value x, Continuation c) {")
            printer.addIndent
            printer.println("return _internal_"+defname+"(x, c);")
            printer.subIndent
            printer.println("}")
            printer.subIndent
            printer.println("};")
          case None =>
            printer.print("private ")
            if (isStatic)
              printer.print("static ")
            printer.println("B17Value _internal_"+defname+"(Continuation "+cname+")")
            rblock.printSourceCode(printer)
            printer.print("final ")
            if (isStatic) printer.print("static ")
            printer.println("B17Suspension "+defname+" = new B17Suspension() {")
            printer.addIndent
            printer.println("public B17Value apply(Continuation c) {")
            printer.addIndent
            printer.println("return _internal_"+defname+"(c);")
            printer.subIndent
            printer.println("}")
            printer.subIndent
            printer.println("};")
        }
        printer.println("")
      }
      printer.subIndent
      printer.println("}")
    }
  }

  def main(args: Array[String]): Unit = {
    val p = new Printer()
    val even = ("_even", Some("_n"), "_c", ReturnBlock())
    val odd = ("_odd", Some("_n"), "_c", ReturnBlock())
    val f = ("_f", None, "_c", ReturnBlock())
    //val frees = List("_a", "_b", "_c")
    val frees = List()
    val source = DefsClosureClass("Test", frees,
      List(even, odd, f))
    source.printSourceCode(p)
    println(p.toString)
  }


}