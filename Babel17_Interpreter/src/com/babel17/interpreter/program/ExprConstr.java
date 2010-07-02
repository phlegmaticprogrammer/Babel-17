package com.babel17.interpreter.program;

public final class ExprConstr extends Expr {
  
  public ExprConstr(String name, Expr param) {
    this.name = name.toUpperCase();
    this.param = param;
  }

  public int kind() {
    return Program.KIND_CONSTR;
  }

  public String name() {
    return name;
  }

  public Expr param() {
    return param;
  }

  private String name;
  private Expr param;

}
