package com.babel17.interpreter.program;

public class StYield extends Statement {

  public StYield(Expr value, Statement next) {
    super(next);
    this.value = value;
  }

  public Expr value() {
    return value;
  }

  public int kind() {
    return KIND_YIELD;
  }
  
  private Expr value;

}
