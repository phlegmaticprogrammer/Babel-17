package com.babel17.interpreter.values;

import com.babel17.interpreter.runtime.*;

public abstract class NativeFunction extends Value {

  public abstract Value apply(Value v);

  public EvalResult apply(Evaluator e, Continuation c, Value v) {
    if (v instanceof DynamicException) {
      return c.apply(v);
    } else {
      return c.apply(apply(v));
    }
  }
  
}
