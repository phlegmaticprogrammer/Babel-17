package com.babel17.naive

import Program._
import com.babel17.syntaxtree.patterns._
import com.babel17.syntaxtree._
import com.babel17.interpreter.parser._
import scala.collection.immutable.SortedSet
import scala.collection.immutable.SortedMap
import java.util.concurrent._
import com.babel17.naive.Values._
import org.antlr.runtime.CharStream
import org.antlr.runtime.ANTLRReaderStream
import java.io.Reader

object Interpreter {

  @throws(classOf[java.io.IOException])
  def parseAndAnalyze(source : Source, reader : java.io.Reader) : java.util.Collection[ErrorMessage] = {
    var charstream: CharStream = new ANTLRReaderStream(reader)
    val result = Parser.parse(source, charstream)
    val checker = new Tree2Program()
    val term = checker.buildProgram(result)
    val errors = checker.errors
    val a : java.util.ArrayList[ErrorMessage] = new java.util.ArrayList(errors.length)
    for (e <- errors) {
      a.add(e)
    }
    a
  }


  def run(filename : String, w : WriteOutput) {
    w.writeLineCommentary("Babel-17 v0.21.1, Copyright \u00a9 2009 Steven Obua")
    w.writeLine("")
    w.writeLineCommentary("This program comes with ABSOLUTELY NO WARRANTY.")
    w.writeLineCommentary("It is published under the GNU Public License (http://www.gnu.org/licenses/gpl.html).")
    w.writeLine("")
    if (filename == null) {
      w.writeLineError("Please specify which file to execute!")
    } else {
      /*val t1 = System.currentTimeMillis */
      val result = Parser.parse(filename)
      //w.writeLine("java: "+result.node)
      /*val t2 = System.currentTimeMillis
      w.writeLineCommentary("Parsed in "+(t2-t1)+" milliseconds.")
      w.writeLine("") */
      val source = new Source(filename)
      val checker = new Tree2Program()
      checker.source = source
      val term = checker.buildProgram(result)

      w.writeLine("program:\n"+term+"\n")

      val errors = checker.errors

      if (errors.length > 0) {
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
        try {
          val cpus = Runtime.getRuntime().availableProcessors
          if (cpus > 1) {
            w.writeLineCommentary("Found "+cpus+" available processors.")
            w.writeLine("")
          }
          val evaluator = new Evaluator(cpus)
          evaluator.writeOutput = w
          Evaluator.systemLibrary = evaluator.loadSystemLibrary
          val v = evaluator.evaluate(Evaluator.emptyEnv, term)
          val fv = v.force()
          w.writeLine("")
          fv match {
            case x : ExceptionValue =>
              w.writeLineError("The program evaluated to a "+(if (x.dynamic) "dynamic" else "persistent")+" exception:")
              w.writeLine("")
              w.writeLine(x.v.stringDescr(false))
              w.writeLine("")
              if (x.getStackTrace.length == 0)
                w.writeLine("There is no stacktrace.")
              else {
                if (x.getStackTrace.length == 1)
                  w.writeLine("The stacktrace has "+x.getStackTrace.length+" entry:")
                else
                  w.writeLine("The stacktrace has "+x.getStackTrace.length+" entries:")
                var i = 1;
                for (m <- x.getStackTrace.reverse) {
                  w.writeLocMsg(i+")", m.location, m.description);
                  i = i + 1
                }
              }
            case x =>
              w.writeLineSuccess("The program has been evaluated successfully, its value is: ")
              w.writeLine("")
              w.writeLine(x.stringDescr(false))
          }
        } catch {
          case (Evaluator.EvalX(s)) =>
            w.writeLineError("The evaluation of the program has failed: ")
            w.writeLine("")
            w.writeLine(s)
          case ex =>
            ex.printStackTrace
            w.writeLineError("There was an internal error during the evaluation of the program:")
            w.writeLine("")
            if (ex.getMessage != null)
              w.writeLine(ex.getClass.getName+": "+ex.getMessage)
            else
              w.writeLine(ex.getClass.getName.toString)
        }
      }
    }

  }

  def main(args: Array[String]): Unit = {
    var f : String = null
    if (args.length > 0) f = args(0)
    //f = "/Users/stevenobua/Programming/babel-17/Babel17_Interpreter/build/classes/com/babel17/naive/system.b17"
    run(f, new WriteOutput())
  }

  def test {
    main(Array("/Users/stevenobua/Programming/babel-17/Babel17_Interpreter/src/com/babel17/examples/basic/v3tests.babel17"));
  }



}

