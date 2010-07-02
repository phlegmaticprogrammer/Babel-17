package com.babel17.interpreter.program;

import com.babel17.interpreter.values.Value;

public final class ExprValue extends Expr {

  private Value value;

  public ExprValue(Value v) {
    value = v;
  }

  public int kind() {
    return KIND_VALUE;
  }

  public Value value() {
    return value;
  }

}
