package com.babel17.naive

import Program._
import Values._
import Evaluator._

object Lens {

  /* definition of what a lens expression is */ 
  def isLensPath(se : SimpleExpression) : Option[Id] = {
    def findLensPath(se : SimpleExpression) : Option[Id] = {
      se match {
        case SEMessageSend(SEId(id),_) => Some(id)       
        case SEMessageSend(target, _) => findLensPath(target)
        case SEApply(u, v) => findLensPath(u)
        case _ => None
      }
    }
    def verifyLensPath(id : Id, se : SimpleExpression) : Boolean = {
      se match {
        case SEMessageSend(SEId(id2),_) => true     
        case SEMessageSend(target, _) => verifyLensPath(id, target)
        case SEApply(u, v) => 
          CollectVars.collectVars(v)
          if (v.freeVars.contains(id))
            false
          else
            verifyLensPath(id, u)
        case _ => false
      }      
    }
    se match {
      case SEId(id) => return Some(id)
      case _ =>
    }
    findLensPath(se) match {
      case None => None
      case Some(id) =>
        if (verifyLensPath(id, se))
          Some(id)
        else
          None
    }
  }   
  
  case class LensPathElem(message : Id, args : List[Value])
    
  abstract class LensValue extends Value {
    def typeof = Values.TYPE_LENS
    
    def compareToValue(that : Value) : Int = {
      CompareResult.UNRELATED
    }
        
    def stringDescr(brackets : Boolean) : String = {
      return "_lens";
    }
    
    def lensGet(state : Value) : Value;
    def lensPut(state : Value, p : Value) : Value;  
    def combine(right : Value) : Value;
    
    def nativePutback(state : Value) : Value = {
      NativeFunctionValue(lensPut(state, _))
    }    
    override def sendMessage(message : Id) : Value = {
      message.name match {
        case MESSAGE_APPLY => return NativeFunctionValue(lensGet _)
        case MESSAGE_PUTBACK => return NativeFunctionValue(nativePutback _)
        case MESSAGE_TIMES => return NativeFunctionValue(combine _)
      }
      return null;
    }
  }
  
  
  def lensError(msg : String) : ExceptionValue = {
    dynamicException(CONSTRUCTOR_DOMAINERROR, StringValue(msg))
  }
  
  case class PrimitiveLensValue(forwards : List[LensPathElem]) extends LensValue
  {
    
    override def stringDescr(brackets : Boolean) : String = {
      var s = "_lens"
      for (lpe <- forwards) {
        s = s + " ." + lpe.message.name 
        for (a <- lpe.args) {
          s = s + " " + a.stringDescr(true)
        }
      }
      return s
    }
    
    def lensGet(state : Value) = lensGet(forwards, state)
    
    def goForward(lpe : LensPathElem, state : Value) : Value = {
      var r : Value = state.sendMessage(lpe.message)
      if (r == null) return lensError("unknown message '"+lpe.message.name+"'")
      if (r.isDynamicException) return r
      for (a <- lpe.args) {
        r = r.extractFunctionValue()
        if (r.isDynamicException) return r
        else {
          r = r.asInstanceOf[FunctionValue].apply(a)
          if (r.isDynamicException) return r
        }        
      }
      r
    }
    
    def lensGet(forwards : List[LensPathElem], state : Value) : Value = {
      var s = state
      for (lpe <- forwards) {
        s = goForward(lpe, s)
        if (s.isDynamicException) return s 
      }
      s
    }
    
    def goBackward(lpe : LensPathElem, state : Value, p : Value) : Value = {
      val msg = Id(lpe.message +"_putback_")
      msg.location = lpe.message.location
      var r : Value = state.sendMessage(msg)
      if (r == null) {
        state match {
          case o : ObjectValue =>
            if (lpe.args.length == 0) {
              val u = ObjectValue(o.messages + (lpe.message -> p))
              val v = u.copy()
              v.setThis(v)
              return v
            }
          case _ => 
        }
        return lensError("unknown message '"+msg.name+"'")
      }
      if (r.isDynamicException) return r
      for (a <- lpe.args) {
        r = r.extractFunctionValue()
        if (r.isDynamicException) return r
        else {
          r = r.asInstanceOf[FunctionValue].apply(a)
          if (r.isDynamicException) return r
        }        
      }
      r = r.extractFunctionValue()
      if (r.isException) r.asDynamicException
      else r.asInstanceOf[FunctionValue].apply(p)        
    }    
    
    def lensPut(forwards : List[LensPathElem], state : Value, p : Value) : Value = {
      forwards match {
        case List() => p
        case lpe :: lpes =>
          val s = goForward(lpe, state)
          if (s.isDynamicException) return s
          val q = lensPut(lpes, s, p)
          if (q.isDynamicException) return q
          goBackward(lpe, state, q)          
      }
    }
    
    def lensPut(state : Value, p : Value) : Value = lensPut(forwards, state, p)
    
    def combine(right : Value) : Value = {
      right match {
        case PrimitiveLensValue(forwards2) => PrimitiveLensValue(forwards ++ forwards2)  
        case _ => null
      }
    }
    
  }
  
  def evalLens(evaluator : Evaluator, env : SimpleEnvironment, 
               lens : SELens) : Value = 
  {
    def makePath(se : SimpleExpression) : Either[List[LensPathElem], Value] = {
      se match {
        case SEId(id) => Left(List())
        case SEMessageSend(target, m) => 
          makePath(target) match {
            case Left(ls) => Left(LensPathElem(m, List()) :: ls)
            case x => x
          }
        case SEApply(u, v) =>
          makePath(u) match {
            case Left(LensPathElem(m, args) :: ls) =>
              val e = evaluator.evalSE(env, v)
              if (e.isDynamicException) Right(e)
              else Left(LensPathElem(m, e::args) :: ls)
            case x => x
          }
      }
    }    
    def revArgs(lpe : LensPathElem) : LensPathElem = {
      LensPathElem(lpe.message, lpe.args.reverse)
    }
    makePath(lens.se) match {
      case Right(x) => x
      case Left(ls) => PrimitiveLensValue(ls.reverseMap(revArgs _).toList)
    }
  } 
    
}
