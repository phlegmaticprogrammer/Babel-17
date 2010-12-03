package com.babel17.naive

import Program._
import com.babel17.syntaxtree.patterns._
import com.babel17.syntaxtree._
import com.babel17.interpreter.parser._
import scala.collection.immutable.SortedSet
import scala.collection.immutable.SortedMap
import java.util.concurrent._

object Interpreter {

  object factory extends ThreadFactory {

    def newThread(r : Runnable) : Thread = {
      val t = new Thread(r)
      val prio = Thread.currentThread.getPriority
      println("creating new thread with prio = "+prio)
      t.setPriority(prio)
      t
    }
  }

  def main(args: Array[String]): Unit = {
    println("Babel-17 v0.21, Copyright \u00a9 2009 Steven Obua")
    println("")
    println("This program comes with ABSOLUTELY NO WARRANTY.")
    println("It is published under the GNU Public License (http://www.gnu.org/licenses/gpl.html).")
    println("")
    if (args.length == 0) {
      println("Please specify which file to execute!")
    } else {
      val result = Parser.parse(args(0))
      val checker = new Tree2Program()
      val term = checker.makeProgram(result)
      if (checker.errors.length > 0) {
        val errors = checker.errors
        println("Found "+errors.length+" static errors:")
        println("")
        var i = 1;
        for (m <- errors) {
          println(i+") at "+m.location+":");
          println("    "+m.message)
          i = i + 1
        }
      } else {
        try {
          val cpus = Runtime.getRuntime().availableProcessors
          Thread.currentThread.setPriority(Thread.MAX_PRIORITY)
          val evaluator = new Evaluator(java.util.concurrent.Executors.newFixedThreadPool(cpus, factory))
          val v = evaluator.evaluate(Evaluator.emptyEnv, term)
          println("The program has been evaluated successfully, its value is: ")
          println("")
          println(v.stringDescr(false))
        } catch {
          case (Evaluator.EvalX(s)) =>
            println("The evaluation of the program has failed: ")
            println("")
            println(s)
          case ex =>
            println("There was an internal error during the evaluation of the program:")
            println("")
            ex.printStackTrace
        }
      }
    }
  }



}