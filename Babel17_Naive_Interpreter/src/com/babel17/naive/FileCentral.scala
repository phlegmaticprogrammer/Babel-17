package com.babel17.naive

import Program._
import scala.collection.immutable.SortedSet
import scala.collection.immutable.SortedMap
import com.babel17.syntaxtree.Location
import com.babel17.syntaxtree.Source
import com.babel17.interpreter.parser.ErrorMessage
import com.babel17.interpreter.parser._

class FileCentral {

  private case class B17File(source:Source, mds : List[ModuleSystem.ModuleDescr], script : Block, errors : List[ErrorMessage])

  private var b17files : SortedMap[String, B17File] = SortedMap()
  private var modules : Option[(SortedMap[Path, (ModuleSystem.ModuleDescr, Block)], List[ErrorMessage])] = None
  private var moduleSystem : Option[ModuleSystem] = None
  private val sync = "sync"

  def updateB17File(filename : String, result : Parser.ParseResult) {
    val source = new Source(filename)
    val checker = new Tree2Program()
    checker.source = source
    val term = checker.makeProgram(result)
    val mds = ModuleSystem.scanForModules(term)
    val script =
      ModuleSystem.scanScript(term) match {
        case Some((e, b)) => b
        case None => Block(List())
      }
    val f = B17File(source, mds, script, Errors.fromParseResult(result) ++ checker.errors)
    //moduleSystem = makeModuleSystem()
    sync.synchronized {
      b17files = b17files + (filename -> f)
      moduleSystem = None
      modules = None
    }        
  }

  def updateB17File(filename : String) {
    val result = Parser.parse(filename)
    updateB17File(filename, result)
  }

  private def transformBlock(source : Source, block : Block) : (Block, List[ErrorMessage]) = {
    val ms = moduleSystem.get
    val rt = new RemoveTemporaries(ms)
    rt.source = source
    val rterm = rt.transform(rt.emptyModuleEnv, block)
    val linearScope = new LinearScope(moduleSystem.get)
    linearScope.source = source
    linearScope.check(linearScope.emptyEnv, rterm)
    (rterm.asInstanceOf[Block], rt.errors ++ linearScope.errors)
  }

  private def updateModules {
    updateModuleSystem
    modules match {
      case Some(_) =>
      case None =>
        var newModules : SortedMap[Path, (ModuleSystem.ModuleDescr, Block)] = SortedMap()
        val ms = moduleSystem.get
        var errors : List[ErrorMessage] = List()
        for ((filename, B17File(source, mds, _, fileErrs)) <- b17files) {
          errors = errors ++ fileErrs
          for (md <- mds) {
            val (block, errs) = transformBlock(source, md.code)
            errors = errors ++ errs
            newModules += (md.path -> (md, block))
          }
        }
        errors = ms.errors ++ errors
        modules = Some((newModules, errors))
    }
  }

  private def updateModuleSystem {
    moduleSystem match {
      case Some(_) =>
      case None =>
        val ms = ModuleSystem.root
        for ((filename, B17File(source, mds, script, errors)) <- b17files) {
          ms.source = source
          for (md <- mds) {
            ms.add(md)
          }
        }
        moduleSystem = Some(ms)
    }
  }

  def getModule(path : Path) : Option[(ModuleSystem.ModuleDescr, Block)] = {
    sync.synchronized {
      updateModules
      modules.get._1.get(path)
    }
  }
  
  def getErrors : List[ErrorMessage] = {
    sync.synchronized {
      updateModules
      modules.get._2
    }    
  }

  def getModuleSystem : ModuleSystem = {
    sync.synchronized {
      updateModuleSystem
      moduleSystem.get
    }
  }

  def getScript(filename : String) : Option[(Block, List[ErrorMessage])] = {
    sync.synchronized {
      updateModuleSystem
      b17files.get(filename) match {
        case None => None
        case Some(b17file) =>
          Some(transformBlock(b17file.source, b17file.script))
      }
    }
  }

}
