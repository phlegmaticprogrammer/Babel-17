package com.babel17.interpreter.values;

import com.babel17.interpreter.runtime.Evaluator;
import com.babel17.interpreter.runtime.Continuation;
import com.babel17.interpreter.runtime.EvalResult;

public abstract class Value {

  public final static String SYNTACTIC_PLUS = "syntactic_plus";
  public final static String SYNTACTIC_MINUS = "syntactic_minus";
  public final static String SYNTACTIC_UMINUS = "syntactic_uminus";
  public final static String SYNTACTIC_TIMES = "syntactic_times";
  public final static String SYNTACTIC_DIV = "syntactic_div";
  public final static String SYNTACTIC_MOD = "syntactic_mod";
  public final static String SYNTACTIC_POW = "syntactic_pow";
  public final static String SYNTACTIC_PLUSPLUS = "syntactic_plusplus";
  public final static String SYNTACTIC_MINUSMINUS = "syntactic_minusminus";
  public final static String SYNTACTIC_TIMESTIMES = "syntactic_timestimes";
  public final static String SYNTACTIC_TO = "syntactic_to";
  public final static String SYNTACTIC_DOWNTO = "syntactic_downto";

  public final static String APPLY = "apply";
  public final static String DECONSTRUCT = "deconstruct";
  public final static String REPRESENTATIVE = "representative";

  public final static String COLLECTOR_ADD = "collector_add";
  public final static String COLLECTOR_CLOSE = "collector_close";

  public final static String ITERATE = "iterate";

  // split implies a forcing
  // a return of null means that this value cannot be split
  public Value split(Evaluator e, String message, int num_pieces) {
    return null;
  }

  // sendMessage implies a forcing
  public Value sendMessage(String message) {
    return DynamicException.unknownMessage(message);
  }

  // implies forcing
  public EvalResult apply(Evaluator e, Continuation c, Value v)  {
    return EvalResult.createFinalResult(DynamicException.invalidOperator(this));
  }

  // implies forcing
  // a return of null means that this value cannot be destructed by c
  public Value deconstruct(Evaluator e, ConstructorValue c) {
    return null;
  }

  public Value force() { return this; }

  // first bit of result: 1 => this <= x, 0 => not (this <= x)
  // second bit of result: 1 => x <= this, 0 => not (x <= this)
  // if there was some kind of dynamic exception, throw CompareException
  public int compareWithOtherValue(Evaluator e, Value x) throws CompareException {
    int result = lessThanOrEqualOtherValue(e, x) ? 1 : 0;
    if (x.lessThanOrEqualOtherValue(e, this)) result |= 2;
    return result;
  }

  public boolean lessThanOrEqualOtherValue(Evaluator e, Value x) throws CompareException {
    throw new RuntimeException("no <= comparison implemented");
  }

}
