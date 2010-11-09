package com.babel17.naive


import Program._
import Values._
import scala.collection.immutable.SortedSet
import scala.collection.immutable.SortedMap




object Evaluator {

  /*def lookup (ids : SortedSet[Id], id : Id, linear : Boolean) {
    if (!ids.contains(id)) {
      if (linear) error(id.location, "identifier is not in linear scope")
      else error(id.location, "unknown identifier")
    }
  }*/
 
  case class ValueRef(var value : Value);
  
  
  case class Environment(nonlinear : SortedMap[Id, Value], linear : SortedMap[Id, ValueRef]) {
    def freeze () : Environment = {
      Environment(nonlinear ++ linear.mapValues(_.value), SortedMap())
    }
    def bind (id : Id, v : Value) : Environment = {
      Environment(nonlinear - id, linear + (id -> ValueRef(v)))
    }
    def bind (ids : SortedMap[Id, Value]) : Environment = {
      val nl : SortedMap[Id, Value] = nonlinear -- ids.keys
      val l : SortedMap[Id, ValueRef] = linear ++ (ids.mapValues(ValueRef(_)))
      Environment(nl, l)
    
    }
    def rebind (id : Id, v : Value) : Environment = {
      linear(id).value = v
      this
    }
    def rebind (ids : SortedMap[Id, Value]) : Environment = {
      for ((id, v) <- ids)
        linear(id).value = v
      this
    }
    def define (id : Id, e : Value) : Environment = {
      linear(id).value = e
      this
    }
  }
  
  def emptyEnv : Environment = {
    Environment(SortedMap.empty, SortedMap.empty)
  }
  
  def evaluate(env : Environment, term : Term) = {
    IntegerValue(0)
  }


}
