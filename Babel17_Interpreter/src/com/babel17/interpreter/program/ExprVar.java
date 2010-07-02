package com.babel17.interpreter.program;

public final class ExprVar extends Expr {
  
  public int kind() {
    return KIND_VAR;
  }
  
  public ExprVar(int index) {
    this.index = index;
  }

  public int index() {
    return index;
  }
  
  private int index;

}
