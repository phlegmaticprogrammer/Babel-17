package com.babel17.naive

object IntervalArithmetic {
  
import Values._
  
def nextd(r : Double) : Double = IA.nextdouble(r)
def prevd(r : Double) : Double = IA.prevdouble(r)

def realOverflow = dynamicException(CONSTRUCTOR_REALOVERFLOW)

val loStrContext = new java.math.MathContext(8, java.math.RoundingMode.FLOOR)
val hiStrContext = new java.math.MathContext(8, java.math.RoundingMode.CEILING)


case class RealValue(lo : Double, hi : Double) extends Value {
  
    def typeof = Values.TYPE_REAL
    
    def compareToValue(that : Value) : Int = {
      import CompareResult._
      that match {
        case RealValue(lo2, hi2) =>
          if (hi < lo2) LESS
          else if (hi2 < lo) GREATER
          else if (lo == lo2 && hi == hi2) EQUAL
          else UNRELATED
        case _ => UNRELATED
      }
    }
    
    def stringDescr(brackets : Boolean) : String = {
      val l = new java.math.BigDecimal(lo).round(loStrContext).toEngineeringString
      val h = new java.math.BigDecimal(hi).round(hiStrContext).toEngineeringString
      if (l == h) return l
      else return "[" + l+ ";" + h + "]"
    }
    
    override def sendMessage(message : Program.Id) : Value = {
      null
    }

  
}

def makeRV(lo : Double, hi : Double) : Value = {
  if (lo.isInfinite || lo.isNaN || hi.isInfinite || hi.isNaN) 
    realOverflow
  else if (lo <= hi) 
    RealValue(lo, hi)
  else
    RealValue(hi, lo)
}

def makeRealValue(mantissa : BigInt, exponent : BigInt) : Value = {
  try {
    import java.math.BigDecimal
    val e = (-exponent).intValue
    if (e != -exponent) return realOverflow
    val decimal = new BigDecimal(mantissa.bigInteger, e)
    val double = decimal.doubleValue
    val decimal2 = new BigDecimal(double)
    val c = decimal2.compareTo(decimal)
    if (c == 0) 
      makeRV(double, double)
    else if (c < 0) {
      var right = nextd(double)
      do {
        val c = new BigDecimal(right).compareTo(decimal)
        if (c == 0) return makeRV(right, right)
        else if (c > 0) return makeRV(prevd(right), right)
        else right = nextd(right)
      } while (true)
      throw Evaluator.EvalX("internal error")
    } else {
      var left = prevd(double)
      do {
        val c = new BigDecimal(left).compareTo(decimal)
        if (c == 0) return makeRV(left, left)
        else if (c < 0) return makeRV(left, nextd(left))
        else left = prevd(left)
      } while (true)
      throw Evaluator.EvalX("internal error")
    }
  } catch {
    case _ => realOverflow
  }
}

def interval(u : RealValue, v : RealValue) : Value = {
  RealValue(scala.math.min(u.lo, v.lo), scala.math.max(u.hi, v.hi))
}


}


