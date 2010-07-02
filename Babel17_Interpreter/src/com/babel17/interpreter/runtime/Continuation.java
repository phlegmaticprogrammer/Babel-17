package com.babel17.interpreter.runtime;

import com.babel17.interpreter.values.Value;

public interface Continuation {

  public EvalResult apply(Value v);

}
