package com.babel17.naive

object IntervalArithmetic {
  
  import Values._
  
  def nextd(r : Double) : Double = IA.nextdouble(r)
  def prevd(r : Double) : Double = IA.prevdouble(r)

  def realOverflow = dynamicException(CONSTRUCTOR_REALOVERFLOW)
  def emptyReal = dynamicException(CONSTRUCTOR_EMPTYREAL)

  val loStrContext = new java.math.MathContext(16, java.math.RoundingMode.FLOOR)
  val hiStrContext = new java.math.MathContext(16, java.math.RoundingMode.CEILING)

  val MESSAGE_RECIPROCAL = "reciprocal"
  val MESSAGE_DEGENERATE = "degenerate"
  val MESSAGE_LN = "ln"
  val MESSAGE_EXP = "exp"
  val MESSAGE_LOG = "log"
  val MESSAGE_LEFT = "left"
  val MESSAGE_RIGHT = "right"
  val MESSAGE_MIDDLE = "middle"
  val MESSAGE_ABS = "abs"
  val MESSAGE_WIDTH = "width"
  val MESSAGE_FLOOR = "floor"
  val MESSAGE_CEIL = "ceil"
  val MESSAGE_ROUND = "round"
  val MESSAGE_SIN = "sin"
  val MESSAGE_COS = "cos"
  val MESSAGE_TAN = "tan"
  val MESSAGE_ARCSIN = "arcsin"
  val MESSAGE_ARCCOS = "arccos"
  val MESSAGE_ARCTAN = "arctan"
  val MESSAGE_PI = "pi"
  
  //val MESSAGE_MANTISSA = "mantissa"
  //val MESSAGE_SCALE = "scale"
  
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
    
    def containsZero : Boolean = lo <= 0.0 && 0.0 <= hi
    def containsPoint(p : Double) = lo <= p && p <= hi
    
    def str(b : java.math.BigDecimal) : String = {
      val u = b.toEngineeringString
      if (u.contains("E") || u.contains(".")) u
      else u+".0"
    }
    
    def stringDescr(brackets : Boolean) : String = {
      val l = str(new java.math.BigDecimal(lo).round(loStrContext))
      val h = str(new java.math.BigDecimal(hi).round(hiStrContext))
      if (l == h) return l
      else return "[" + l+ ";" + h + "]"
    }
    
    override def sendMessage(message : Program.Id) : Value = {
      message.name match {
        case MESSAGE_PLUS => NativeFunctionValue(plus _)
        case MESSAGE_MINUS => NativeFunctionValue(minus _)
        case MESSAGE_UMINUS => RealValue(-hi, -lo)
        case MESSAGE_TIMES => NativeFunctionValue(times _)
        case MESSAGE_POW => NativeFunctionValue(pow _)
        case MESSAGE_SLASH => NativeFunctionValue(quot _)
        case MESSAGE_RECIPROCAL => real_reciprocal(this)
        case MESSAGE_DEGENERATE => BooleanValue(lo == hi)
        case MESSAGE_EXP => real_exp(this)
        case MESSAGE_LN => real_ln(this)
        case MESSAGE_LOG => NativeFunctionValue(log _)
        case MESSAGE_ABS => real_abs(this)
        case MESSAGE_WIDTH => real_width(this)
        case MESSAGE_LEFT => RealValue(lo, lo)
        case MESSAGE_RIGHT => RealValue(hi, hi)
        case MESSAGE_MIDDLE => real_middle(this)
        case MESSAGE_CONTAINS => NativeFunctionValue(contains _)
        case MESSAGE_TIMESTIMES => NativeFunctionValue(intersect _)
        case MESSAGE_PLUSPLUS => NativeFunctionValue(hull _)
        case MESSAGE_FLOOR => real_floor(this)
        case MESSAGE_CEIL => real_ceil(this)
        case MESSAGE_ROUND => real_round(this)
        case MESSAGE_SIN => real_sin(this)
        case MESSAGE_COS => real_cos(this)
        case MESSAGE_TAN => real_tan(this)
        case MESSAGE_ARCSIN => real_arcsin(this)
        case MESSAGE_ARCCOS => real_arccos(this)
        case MESSAGE_ARCTAN => real_arctan(this)     
        case MESSAGE_PI => real_timesPi(this)
        case CONVERSION_INT => real_toInt(this)
        case CONVERSION_STRING => real_toString(this)
        //case MESSAGE_MANTISSA => real_mantissa(this)
        //case MESSAGE_SCALE => real_scale(this)
        case _ => null
      }
    }

    def plus(w : Value) : Value = {
      w match {
        case w: RealValue =>
          real_add(this, w)
        case _ => null
      }
    }
    
    def minus(w : Value) : Value = {
      w match {
        case w: RealValue => real_sub(this, w)
        case _ => null
      }
    }
    
    def times(w : Value) : Value = {
      w match {
        case w: RealValue => real_mult(this, w)
        case _ => null
      }
    }
    
    def quot(w : Value) : Value = {
      w match {
        case w: RealValue => real_quot(this, w)
        case _ => null
      }
    }
    
    
    def pow(w : Value) : Value = {
      w match {
        case w: RealValue => real_pow(this, w)
        case _ => null
      }
    }    
    
    def log(w : Value) : Value =  {
      w match {
        case w: RealValue => real_log(this, w)
        case _ => null
      }      
    }
    
    def contains(w : Value) : Value = {
      w match {
        case w: RealValue => real_contains(this, w)
        case _ => null
      }            
    }
    
    def intersect(w : Value) : Value = {
      w match {
        case w: RealValue => real_intersect(this, w)
        case _ => null
      }                  
    }
  
    def hull(w : Value) : Value = {
      w match {
        case w: RealValue => interval(this, w)
        case _ => null
      }                  
    }


  }

  def makeRV(lo : Double, hi : Double) : Value = {
    if (lo.isInfinite || lo.isNaN || hi.isInfinite || hi.isNaN) 
      realOverflow
    else if (lo <= hi) 
      RealValue(lo, hi)
    else
      dynamicException(CONSTRUCTOR_EMPTYREAL)
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

  def min(a : Double, b : Double) : Double = {
    scala.math.min (a, b)
  }

  def max(a : Double, b : Double) : Double = {
    scala.math.max (a, b)
  }
   
  def interval(u : RealValue, v : RealValue) : RealValue = {
    RealValue(min(u.lo, v.lo), max(u.hi, v.hi))
  }

  def real_add(u : RealValue, v: RealValue) : Value = {
    makeRV(prevd(u.lo + v.lo), nextd(u.hi+v.hi))
  }  

  def real_sub(u : RealValue, v: RealValue) : Value = {
    makeRV(prevd(u.lo - v.hi), nextd(u.hi - v.lo))
  }  

  def real_mult(u : RealValue, v: RealValue) : Value = {
    val s1 = u.lo * v.lo
    val s2 = u.lo * v.hi
    val s3 = u.hi * v.lo
    val s4 = u.hi * v.hi
    makeRV(prevd(min(s1, min (s2, min (s3, s4)))), 
           nextd(max(s1, max (s2, max (s3, s4)))))
  }  

  def real_reciprocal(u : RealValue) : Value = {
    if (u.containsZero) domainError 
    else makeRV(prevd(1.0/u.hi), nextd(1.0/u.lo))
  }  
  
  def real_quot(u : RealValue, v : RealValue) : Value = {
    real_reciprocal(v) match {
      case v: RealValue => real_mult(u, v)
      case x: ExceptionValue => x.asDynamicException    
    }  
  }

  def real_ln(u : RealValue) : Value = {
    if (u.lo <= 0.0) domainError()
    else makeRV(prevd(scala.math.log(u.lo)), nextd(scala.math.log(u.hi)))
  }

  def real_exp(u : RealValue) : Value = {
    makeRV(max(0.0, prevd(scala.math.exp(u.lo))),
           nextd(scala.math.exp(u.hi)))
  }

  def real_pow(u : RealValue, v: RealValue) : Value = {
    // u^v = e^(v * ln u)
    real_ln(u) match {
      case ln:RealValue =>
        real_mult(v, ln) match {
          case e:RealValue =>
            real_exp(e)
          case x:ExceptionValue => x
        } 
      case x:ExceptionValue => x
    }
  }  
  
  def real_log(u : RealValue, base : RealValue) : Value = {
    // log_base u = ln u / ln base
    real_ln(u) match {
      case ln_u: RealValue =>
        real_ln(base) match {
          case ln_base:RealValue =>
            real_quot(ln_u, ln_base)
          case x:ExceptionValue => x
        }
      case x:ExceptionValue => x
    }    
  }
  
  def real_abs(u : RealValue) : Value = {
    import scala.math.abs
    val x = max(abs(u.lo), abs(u.hi))
    makeRV(x, x)
  }
  
  def real_width(u : RealValue) : Value = {
    val x = u.hi-u.lo
    makeRV(x, x)
  }
  
  def real_middle(u : RealValue) : Value = {
    val x = u.lo + (u.hi-u.lo) / 2.0
    makeRV(x, x)
  }
  
  def real_contains(u : RealValue, v : RealValue) : Value = {
    if (u.containsPoint(v.lo) && u.containsPoint(v.hi))
      BooleanValue(true)
    else
      BooleanValue(false)
  }
  
  def real_intersect(u : RealValue, v : RealValue) : Value = {
    makeRV(max(u.lo, v.lo), min(u.hi, v.hi))
  }
  
  def real_floor(u : RealValue) : Value = {
    val x = scala.math.floor(u.lo)
    makeRV(x, x)
  }
 
  def real_ceil(u : RealValue) : Value = {
    val x = scala.math.ceil(u.hi)
    makeRV(x, x)
  }
  
  def real_round(u : RealValue) : Value = {
    val x = scala.math.round(u.lo+(u.hi-u.lo)/2.0)
    makeRV(x, x)
  }
  
  def real_toInt(u : RealValue) : Value = {
    val x = scala.math.round(u.lo+(u.hi-u.lo)/2.0)
    IntegerValue(x)
  }
  
  def real_fromInt(u : IntegerValue) : Value = {
    makeRealValue(u.v, 0)
  }

  def double2str(d : Double) : String = {
    val u = new java.math.BigDecimal(d).toEngineeringString
    if (u.contains("E") || u.contains(".")) u
    else u+".0"
  }
  
  def real_toString(u : RealValue) : Value = {
    StringValue(u.stringDescr(false))
  }
  
  import scala.math.{sin,cos,tan,asin,acos,atan,floor,ceil,round}
  
  val prevpi = prevd(scala.math.Pi)
  val nextpi = nextd(scala.math.Pi)
  val halfpi = real_timesPi(RealValue(0.5, 0.5)).asInstanceOf[RealValue]
  
  def real_timesPi(u : RealValue) : Value = {
    makeRV(prevd(u.lo*prevpi), nextd(u.hi*nextpi))
  }
  
  def real_sin(u : RealValue) : Value = {
    real_sub(u, halfpi) match {
      case u: RealValue => real_cos(u)
      case x: ExceptionValue => x
    }
  }
  
  def real_cos(u : RealValue) : Value = {
    real_quot(u, RealValue(prevpi, nextpi)) match {
      case u: RealValue => cospi(u)
      case x: ExceptionValue => x
    }
  }
  
  def cospi(u : RealValue) : Value = {
    if (u.hi-u.lo >= 2.0) RealValue(-1.0, 1.0)
    else {
      val lo_int = round(floor(u.lo))
      val hi_int = round(ceil(u.hi))
      if (lo_int == hi_int) {
        if (lo_int % 2 == 0) RealValue(1.0, 1.0) else RealValue(-1.0, -1.0)
      } else {
        var x = lo_int
        var range : RealValue = null
        while (x < hi_int) {
          val t1 = max(x, u.lo)
          val t2 = min(x+1, u.hi)
          if (t1 <= t2) {
            val r = if (x % 2 == 0) cospi_dec(t1, t2) else cospi_inc(t1, t2)
            if (range == null) range = r else range = interval(range, r)
          }
          x = x + 1
        }
        if (range == null) throw Evaluator.EvalX("internal error in cospi")
        else range
      }
    }
  }
  
  def cospi_dec(t1: Double, t2: Double) : RealValue = {
    var left = floor(t1)*nextpi
    var right = ceil(t2)*prevpi
    val x1 = t1*prevpi
    var maximum = if (x1 < left) 1.0 else min(1.0, nextd(cos(x1)))    
    val x2 = t2*nextpi
    var minimum = if (x2 > right) -1.0 else max(-1.0, prevd(cos(x2)))
    RealValue(minimum, maximum)
  }

  def cospi_inc(t1: Double, t2: Double) : RealValue = {
    var left = floor(t1)*nextpi
    var right = ceil(t2)*prevpi
    val x1 = t1*prevpi
    var minimum = if (x1 < left) -1.0 else max(-1.0, prevd(cos(x1)))    
    val x2 = t2*nextpi
    var maximum = if (x2 > right) 1.0 else min(1.0, nextd(cos(x2)))
    RealValue(minimum, maximum)
  }
  
  def real_tan(u : RealValue) : Value = {
    real_sin(u) match {
      case s:RealValue =>
        real_cos(u) match {
          case c:RealValue =>
            real_quot(s, c)
          case x:ExceptionValue => x
        }
      case x:ExceptionValue => x
    }  
  }
  
  def real_arcsin(u : RealValue) : Value = {
    val x1 = max(-1.0, u.lo)
    val x2 = min(1.0, u.hi)
    if (x1 > x2) emptyReal
    else makeRV(prevd(asin(x1)), nextd(asin(x2)))
  }
  
  def real_arccos(u : RealValue) : Value = {
    val x1 = max(-1.0, u.lo)
    val x2 = min(1.0, u.hi)
    if (x1 > x2) emptyReal
    else makeRV(prevd(acos(x2)), nextd(asin(x1)))
  }
  
  def real_arctan(u : RealValue) : Value = {
    makeRV(prevd(atan(u.lo)), nextd(atan(u.hi)))
  }

}


