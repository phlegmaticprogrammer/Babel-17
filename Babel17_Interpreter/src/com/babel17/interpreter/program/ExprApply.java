package com.babel17.interpreter.program;

public final class ExprApply extends Expr {

  public ExprApply(Expr f, Expr x) {
    this.f = f;
    this.x = x;
  }

  public Expr operator() {
    return f;
  }

  public Expr operand() {
    return x;
  }

  public int kind() {
    return KIND_APPLY;
  }

  private Expr f, x;

}
