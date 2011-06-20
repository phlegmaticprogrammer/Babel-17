package com.babel17.naive

import Program._
import Values._
import Evaluator._
import scala.collection.immutable.SortedSet
import scala.collection.immutable.SortedMap
import java.util.concurrent._
import com.babel17.syntaxtree.Source

class ModuleValues(evaluator : Evaluator, fileCentral : FileCentral) {

  class ModuleState
  case class ModuleStateUp(value : Value)  extends ModuleState
  case class ModuleStateLoading(threadId : Long, var result : Option[Value]) extends ModuleState

  case class BusyModuleValue(path : Path, messages : SortedSet[Id], loading : ModuleStateLoading) extends Value {

    override def stringDescr(brackets : Boolean) : String = {
      if (path.ids.isEmpty) return "_root"
      var s = "_module(loading) "+path
      if (brackets) s = "("+s+")"
      return s
    }

    override def sendMessage(message : Program.Id) : Value = {
      if (messages.contains(message)) {
         if (loading.threadId == Thread.currentThread.getId)
           Values.dynamicException(CONSTRUCTOR_DEADLOCK)
         else
           loading.synchronized {
             loading.result match {
               case None =>
                 Values.dynamicException(CONSTRUCTOR_MODULENOTFOUND, StringValue(path.toString))
               case Some(v) => v
             }
           }
      } else {
        getModuleValue(path.append(message)) match {
          case None => null
          case Some(v) => v
        }
      }
    }

    def typeof : TypeValue = TYPE_MODULE

  }

  case class ModuleValue(path : Path, messages : SortedMap[Id, Value]) extends Value {

    override def stringDescr(brackets : Boolean) : String = {
      if (path.ids.isEmpty) return "_root"
      var s = "_module "+path
      if (brackets) s = "("+s+")"
      return s
    }

    override def sendMessage(message : Program.Id) : Value = {
      messages.get(message) match {
        case Some(v : EnvironmentValue) => v.onLookup()
        case Some(v) => v
        case None =>
          getModuleValue(path.append(message)) match {
            case None => null
            case Some(v) => v
          }
      }
    }

    def typeof : TypeValue = TYPE_MODULE
  }

  
  //private var modules : SortedMap[Path, Value] = SortedMap()
  @volatile private var moduleState : SortedMap[Path, ModuleState] = SortedMap()
  private val sync = "sync"

  private def blockIsExecutable(block : Block) : Boolean = {
    for (st <- block.statements)
      if (Program.statementIsExecutable(st)) return true
    return false
  }

  private def evalModuleBlock(md : ModuleSystem.ModuleDescr, block : Block) : Value = {
    evaluator.evalBlock(emptyEnv, new DefaultCollector(), block) match {
      case BlockException(de) => de
      case BlockCollector(env, _) =>
        var s : SortedMap[Id, Value] = SortedMap.empty
        for (m <- md.messages) {
          s = s + (Id(m.name) -> env.lookup(m))
        }
        ModuleValue(md.path, s)
    }

  }

  def checkModuleValue(path : Path) : Option[Value] = {
    moduleState.get(path) match {
      case Some(ModuleStateUp(value)) => Some(value)
      case Some(loading : ModuleStateLoading) =>
          var messages : SortedSet[Id] = SortedSet()
          fileCentral.getModuleSystem.find(path) match {
            case Some(ModuleSystem.Found(pd, _)) =>
              if (pd.module != None) {
                messages = pd.module.get.messages
              }
            case _ =>
          }
          Some(BusyModuleValue(path, messages, loading))
      case None =>
        None
    }
  }
  
  def getModuleValue(path : Path) : Option[Value] = {
    val cv = checkModuleValue(path)
    if (cv.isDefined) return cv
    val loading = ModuleStateLoading(Thread.currentThread.getId, None)
    var lostRace = false
    loading.synchronized {
      sync.synchronized {
        if (moduleState.get(path) != None)
          lostRace = true
        else {
          moduleState += (path -> loading)
        }
      }
      if (!lostRace) {
        val r =
          fileCentral.getModule(path) match {
            case None =>
              val ms = fileCentral.getModuleSystem
              ms.find(path) match {
                case None => None
                case Some(ModuleSystem.Found(_, flags)) =>
                  if ((flags & ModuleSystem.FoundPackage) != 0)
                    Some(ModuleValue(path, SortedMap()))
                  else
                    None
              }
            case Some((md, block)) =>
              val v = evalModuleBlock(md, block)
              Some(v)
          }
        r match {
          case None => 
          case Some(v) =>
            sync.synchronized {
              moduleState += (path -> ModuleStateUp(v))
            }
        }
        loading.result = r
        return r
      }
    }
    // lostRace == true
    return checkModuleValue(path)
  }

  def findModuleValue(path : Path) : Value = {
    getModuleValue(path) match {
      case None =>
        Values.dynamicException(CONSTRUCTOR_MODULENOTFOUND, StringValue(path.toString))
      case Some(v) => v
    }
  }

}

