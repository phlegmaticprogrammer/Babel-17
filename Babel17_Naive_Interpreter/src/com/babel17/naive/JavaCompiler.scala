package com.babel17.naive

import com.babel17.syntaxtree._
import com.babel17.interpreter.parser._
import com.babel17.naive.Values._
import org.antlr.runtime.CharStream
import org.antlr.runtime.ANTLRReaderStream

object JavaCompiler {

  @throws(classOf[java.io.IOException])
  def parseAndAnalyze(source : Source, reader : java.io.Reader) : java.util.Collection[ErrorMessage] = {
    var charstream: CharStream = new ANTLRReaderStream(reader)
    val result = Parser.parse(source, charstream)
    val checker = new Tree2Program()
    val term = checker.makeProgram(result)
    val errors = checker.errors
    val a : java.util.ArrayList[ErrorMessage] = new java.util.ArrayList(errors.length)
    for (e <- errors) {
      a.add(e)
    }
    a
  }

  def run(filename : String, w : WriteOutput) {
    w.writeLineCommentary("Babel-17 v0.21, Copyright \u00a9 2009 Steven Obua")
    w.writeLine("")
    w.writeLineCommentary("This program comes with ABSOLUTELY NO WARRANTY.")
    w.writeLineCommentary("It is published under the GNU Public License (http://www.gnu.org/licenses/gpl.html).")
    w.writeLine("")
    if (filename == null) {
      w.writeLineError("Please specify which file to execute!")
    } else {
      val result = Parser.parse(filename)
      val checker = new Tree2Program()
      checker.source = new Source(filename)
      val term = checker.makeProgram(result)
      if (checker.errors.length > 0) {
        val errors = checker.errors
        if (errors.length == 1)
          w.writeLineError("Found "+errors.length+" static error:")
        else
          w.writeLineError("Found "+errors.length+" static errors:")
        w.writeLine("")
        var i = 1;
        for (m <- errors) {
          w.writeLocMsg(i+")", m.location, m.message)
          i = i + 1
        }
      } else {
        term match {
          case b : Program.Block =>
            val cexp = Program2CPS.translateExpr(Program2CPS.emptyEnv,
              Program.EBlock(b), (env, pexp) => pexp)
            val printer = new Printer()
            CPS.print(printer, cexp)
            println("CPS representation:")
            println(printer)

        }
      }
    }

  }

  def main(args: Array[String]): Unit = {
    var f : String = null
    if (args.length > 0) f = args(0)
    run(f, new WriteOutput())
  }



}