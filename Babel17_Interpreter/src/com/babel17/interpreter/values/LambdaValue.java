package com.babel17.interpreter.values;

import com.babel17.interpreter.runtime.*;
import com.babel17.interpreter.program.Definition;

public final class LambdaValue extends Lambda implements Continuation {

  public LambdaValue(Environment env, Definition definition) {
    super(env, definition);
  }

  public Value eval(Evaluator e) {
    return (Value) e.eval(environment(), this, definition().body()).trampoline();
  }

  public EvalResult apply(Value v) {
    return EvalResult.createFinalResult(v);
  }

}
