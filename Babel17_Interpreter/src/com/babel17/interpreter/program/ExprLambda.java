package com.babel17.interpreter.program;

public final class ExprLambda extends Expr {
  
  private Definition def;

  public ExprLambda(Definition def) {
    this.def = def;
  }

  public Definition definition() {
    return def;
  }

  public int kind() {
    return KIND_LAMBDA;
  }

}
