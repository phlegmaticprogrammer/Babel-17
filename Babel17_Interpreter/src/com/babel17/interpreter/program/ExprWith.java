package com.babel17.interpreter.program;

public final class ExprWith extends Expr {

  public ExprWith(Expr collector, ControlStatement control) {
    this.collector = collector;
    this.control = control;
  }

  public Expr collector() {
    return collector;
  }

  public ControlStatement control() {
    return control;
  }

  public int kind() {
    return KIND_WITH;
  }
  
  private Expr collector;
  private ControlStatement control;

}
