package com.babel17.interpreter.program;

public final class ExprCompare extends Expr {

  public ExprCompare(int result, Expr expr1, Expr expr2) {
    this.result = result;
    this.expr1 = expr1;
    this.expr2 = expr2;
  }

  public int kind() {
    return KIND_COMPARE;
  }

  public int result() {
    return result;
  }

  public Expr expr1() {
    return expr1;
  }

  public Expr expr2() {
    return expr2;
  }

  private int result;
  private Expr expr1, expr2;

}
