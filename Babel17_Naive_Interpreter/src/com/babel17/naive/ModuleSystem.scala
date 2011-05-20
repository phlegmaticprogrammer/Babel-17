package com.babel17.naive

import Program._
import scala.collection.immutable.SortedSet
import scala.collection.immutable.SortedMap
import com.babel17.syntaxtree.Location
import com.babel17.syntaxtree.Source
import com.babel17.interpreter.parser.ErrorMessage

object ModuleSystem extends ErrorProducer {

  case class ModuleDescr(path : Path, typeIds : SortedSet[Id], messages : SortedSet[Id], executable : Boolean) {
    def isType : Boolean = {
      typeIds.contains(path.last)
    }
  }
  
  class Result
  case class ResultSuccess(pd : PackageDescr) extends Result
  case class ResultError(errors : List[ErrorMessage]) extends Result

  val FoundPackage = 1
  val FoundType = 2
  val FoundDef = 4
  case class Found (pd : PackageDescr, flags : Int)

  case class PackageDescr(branches : SortedMap[Id, PackageDescr], module : Option[ModuleDescr]) {

    def find(path : Path) : Option[Found] = {
      path.ids match {
        case (id::ids) =>
          if (branches.contains(id))
            branches(id).find(Path(ids))
          else {
            if (ids.length > 0 || module == None)
              None
            else {
              val md = module.get
              var f = 0
              if (md.messages.contains(id))
                f = f | FoundDef
              if (md.typeIds.contains(id))
                f = f | FoundType
              if (f == 0)
                None
              else
                Some(Found(this, f))
            }
          }
        case List() => {
            module match {
              case None => Some(Found(this, FoundPackage))
              case Some(md) => 
                var f = FoundPackage
                if (md.isType) f = f | FoundType
                Some(Found(this, f))
            }
        }
      }
    }


    def add(md : ModuleDescr) : Result = {
      add(0, md.path, md)
    }

    def add(depth : Int, path : Path, md : ModuleDescr) : Result = {
      var errors : List[ErrorMessage] = List()
      def error(loc : Location, msg : String) {
            errors = (new ErrorMessage(loc, msg)) :: errors
      }
      def none = ResultError(errors)
      path.ids match {
        case (id :: ids) =>
          var pd : PackageDescr = null
          if (branches.contains(id))
            pd = branches(id)
          else
            pd = PackageDescr(SortedMap(), None)
          module match {
            case None =>
            case Some (m) =>
              if (m.messages.contains(id)) {
                error(id.location, "path element clashes with definition '"+id.name+"' in module '"+md.path.prefix(depth)+"'")
                return none
              }
          }
          pd.add(depth + 1, Path(ids), md) match {
            case e: ResultError => 
              e
            case ResultSuccess(newPd) =>
              ResultSuccess (PackageDescr(branches + (id -> newPd), module))
          }
        case _ => 
          val conflicts = md.messages ** branches.keySet
          if (!conflicts.isEmpty) {
            val id = conflicts.firstKey
            error(id.location, "definition '"+id.name+"' clashes with module '"+md.path.prefix(depth)+"."+id.name+"'")
            return none
          }
          module match {
            case None =>
              ResultSuccess(PackageDescr(branches, Some(md)))
            case Some(oldMd) =>
              error(md.path.location, "there are two module definitions for '"+md.path+"'")
              none
          }
      }
    }
  }

  def scanForModules(term : Term) : List[ModuleDescr] = {
    scanForModules(Path(List()), term)
  }

  def scanForModules(currentPath:Path, term : Term) : List[ModuleDescr] = {
    term match {
      case prog: Block =>
        var l : List[ModuleDescr] = List()
        for (st <- prog.statements) {
          l = l ++ scanForModules(currentPath, st)
        }
        l
      case SModule(modPath, block) =>
        val defIds = CollectVars.collectDefIds(block.statements)
        val publicTypeIds = CollectVars.collectTypeIds(block.statements)
        val publicDefIds = CollectVars.filterPublicIds(block.statements, defIds)
        val executable = CollectVars.isExecutable(block.statements)
        val path = currentPath.append(modPath)
        path.location = modPath.location
        List(ModuleDescr(path, publicTypeIds, publicDefIds, executable))
      case _ =>
        List()       
    }
  }

  def empty : ModuleSystem = {
    new ModuleSystem(PackageDescr(SortedMap(), None))
  }
  
}

class ModuleSystem(var _root : ModuleSystem.PackageDescr) extends ErrorProducer {

  import ModuleSystem._

  def root = _root
  def find (p : Path) = root.find(p)

  def add(md : ModuleDescr) : Boolean = {
    _root.add(md) match {
      case ResultSuccess(pd) =>
        _root = pd
        true
      case ResultError(errors) =>
        for (e <- errors) {
          error(e.location, e.message)
        }
        false
    }
  }

}

