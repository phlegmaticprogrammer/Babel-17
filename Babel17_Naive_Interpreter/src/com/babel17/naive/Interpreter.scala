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
import java.io.File

object Interpreter {

  @throws(classOf[java.io.IOException])
  def parseAndAnalyze(fc : FileCentral, source : Source, reader : java.io.Reader) : java.util.Collection[ErrorMessage] = {
    var charstream: CharStream = new ANTLRReaderStream(reader)
    val result = Parser.parse(source, charstream)
    fc.updateB17File(source, result)
    val errors = Errors.cleanupErrors(fc.getErrorsOf(source.getFilename))
    val a : java.util.ArrayList[ErrorMessage] = new java.util.ArrayList(errors.length)
    for (e <- errors) {
      a.add(e)
    }
    a
  }
  
  def writeCopyrightInfo(w : WriteOutput) {
    w.writeLineCommentary("Babel-17 v0.3alpha, Copyright \u00a9 2009 Steven Obua")
    w.writeLine("")
    w.writeLineCommentary("This program comes with ABSOLUTELY NO WARRANTY.")
    w.writeLineCommentary("It is published under the GNU Public License (http://www.gnu.org/licenses/gpl.html).")
    w.writeLine("")    
  }
  
  def writeStaticErrors(errors : List[ErrorMessage], w : WriteOutput) : Boolean = {
    if (errors.size == 0) return false
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
    return true    
  }

  def runUnittests(testfilenames: Array[String], filenames : Array[String], w : WriteOutput) {
    writeCopyrightInfo(w)
    if (testfilenames.length == 0) {
      w.writeLine("There are no unit tests to run.")
      return
    }
    val fc = new FileCentral()
    for (filename <- filenames) {
      fc.updateB17File(filename)
    }
    for (filename <- testfilenames) {
      fc.updateB17File(filename)
    }
    val errors = Errors.cleanupErrors(fc.getErrors)
    if (writeStaticErrors(errors, w)) return
    var evaluator : Evaluator = null
    try {
      val cpus = Runtime.getRuntime().availableProcessors
      if (cpus > 1) {
        w.writeLineCommentary("Found "+cpus+" available processors.")
        w.writeLine("")
      }
      evaluator = new Evaluator(cpus, fc, EvaluationOptions(true))
      evaluator.writeOutput = w
      Evaluator.systemLibrary = evaluator.loadSystemLibrary
    } catch {
      case ex =>
        //ex.printStackTrace
        w.writeLineError("There was an internal error during initialization.")
        w.writeLine("")
        if (ex.getMessage != null)
          w.writeLine(ex.getClass.getName+": "+ex.getMessage)
        else
          w.writeLine(ex.getClass.getName.toString)
        return
    }
    var testSuccesses = 0
    var testFailures = 0
    for (testfilename <- testfilenames) {
      w.writeLineCommentary("looking in file '"+testfilename+"' for unit tests")
      val b17file = fc.findFile(testfilename).get
      val r = evaluator.assertionRecorder
      
      def handle(name : String, test : () => Values.Value) {
          r.clear
          try{ 
            test() match {
            case ex : ExceptionValue =>
              testFailures = testFailures + 1
              w.writeLineError("unit test '"+name+"' failed: "+ex)
            case _ =>
              if (r.failures > 0) {
                testFailures = testFailures + 1
                w.writeLineError("unit test '"+name+"' failed "+r.stats)
              } else if (r.successes > 0) {
                testSuccesses = testSuccesses + 1
                w.writeLineSuccess("unit test '"+name+"' succeeded "+r.stats)
              } 
          }
          } catch {
            case x => 
              testFailures = testFailures + 1
              w.writeLineError("unit test '"+name+"' failed: "+x)
          }        
      }
      
      for (md <- b17file.mds) {
        if (md.path.unittest)
          handle (md.path.toString, () => evaluator.evalModule(md.path))
        else if (md.messages.contains(Id("unittest")))
          handle (md.path.toString()+".unittest", 
            () => {
              val m = evaluator.evalModule(md.path)
              r.clear()
              m.sendMessage(Id("unittest"))
            })        
      }    
    }
    
    w.writeLine("")
    if (testFailures == 0) {
      w.writeLineSuccess("All "+testSuccesses+" unit tests were successful.")
    } else {
      w.writeLineError(testFailures+" out of "+(testSuccesses+testFailures)+" unit test(s) failed.")
    }
  }
  
  def run(progIndex:Int, filenames : Array[String], w : WriteOutput) {
    writeCopyrightInfo(w)
    if (filenames == null || filenames.length == 0) {
      w.writeLineError("Please specify which file to execute!")
    } else {
      val fc = new FileCentral()
      /*val t1 = System.currentTimeMillis */
      for (filename <- filenames) {
        fc.updateB17File(filename)
      }
      val (term, termErrors) = fc.getScript(filenames(progIndex)).get
      val errors = Errors.cleanupErrors(fc.getErrors ++ termErrors)
      if (!writeStaticErrors(errors, w)) {
        try {
          val cpus = Runtime.getRuntime().availableProcessors
          if (cpus > 1) {
            w.writeLineCommentary("Found "+cpus+" available processors.")
            w.writeLine("")
          }
          val evaluator = new Evaluator(cpus, fc, EvaluationOptions(true))
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
            //ex.printStackTrace
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

  def mainProc(args: Array[String]): Unit = {
    var arguments = args
    var progIndex = 0
    if (args.length > 0) {
      val filename = args(0)
      var names : SortedSet[String] = SortedSet()
      for (n <- args) names = names + n
      arguments = names.toArray
      var i = 0
      for (n <- arguments) {
        if (n == filename) progIndex = i
        i = i + 1
      }
    }
    run(progIndex, arguments, new WriteOutput())
  }

  def main(args : Array[String]): Unit = {
    def f(name : String) : String = ("/Users/stevenobua/Programming/babel-17/Babel17_Interpreter/src/com/babel17/examples/basic/"+name)
    mainProc(Array(f("v3tests.babel17"), f("cool.babel-17"), f("test.b17")))
  }

  def test {
    mainProc(Array("/Users/stevenobua/Programming/babel-17/Babel17_Interpreter/src/com/babel17/examples/basic/v3tests.babel17"));
  }



}

