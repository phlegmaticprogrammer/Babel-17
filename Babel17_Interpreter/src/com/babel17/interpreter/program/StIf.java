package com.babel17.interpreter.program;

public final class StIf extends ControlStatement {

  public StIf(Expr condition, Statement true_branch, Statement false_branch, Statement next) {
    super(next);
    this.condition = condition;
    this.true_branch = true_branch;
    this.false_branch = false_branch;
  }

  public Expr condition() { return condition; }
  public Statement true_branch() { return true_branch; }
  public Statement false_branch() { return false_branch; }

  public int kind() {
    return Program.KIND_IF;
  }

  private Statement true_branch, false_branch;
  private Expr condition;

}
