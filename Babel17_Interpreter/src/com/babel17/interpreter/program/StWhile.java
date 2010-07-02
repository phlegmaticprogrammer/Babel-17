package com.babel17.interpreter.program;

public final class StWhile extends ControlStatement {

  public StWhile(Expr condition, Statement body, Statement next) {
    super(next);
    this.condition = condition;
    this.body = body;
  }

  public int kind() {
    return KIND_WHILE;
  }

  public Statement body() {
    return body;
  }

  public Expr condition() {
    return condition;
  }

  private Expr condition;
  private Statement body;

}
