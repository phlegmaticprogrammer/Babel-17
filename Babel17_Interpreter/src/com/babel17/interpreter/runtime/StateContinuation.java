package com.babel17.interpreter.runtime;

public interface StateContinuation {

  public Continuation needsOnlyClosedCollector();
  public EvalResult apply(State state);


}
