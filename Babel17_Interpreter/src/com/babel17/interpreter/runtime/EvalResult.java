package com.babel17.interpreter.runtime;

import com.babel17.interpreter.values.Value;

public abstract class EvalResult {

  public abstract Object finalResult();
  public abstract EvalResult evaluate();

  public Object trampoline() {
    Object v = null;
    EvalResult e = this;
    do {
      v = e.finalResult();
      e = e.evaluate();
    } while (v == null);
    return v;
  }

  private static final class FinalResult extends EvalResult {
    FinalResult(Object value) {
      this.value = value;
    }
    public Object finalResult() {
      return value;
    }
    public EvalResult evaluate() {
      return this;
    }
    private Object value;
  }

  public abstract static class Lambda extends EvalResult {
    protected Lambda() {
    }
    public Object finalResult() {
      return null;
    }
  }

  public static EvalResult createFinalResult(Object v) {
    return new FinalResult(v);
  }
  
}
