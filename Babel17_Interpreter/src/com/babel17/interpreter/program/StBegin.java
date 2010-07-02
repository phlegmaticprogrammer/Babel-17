package com.babel17.interpreter.program;

public final class StBegin extends ControlStatement {

  public StBegin(Statement nestedStatement, Statement next) {
    super(next);
    this.nestedStatement = nestedStatement;
  }

  public Statement nestedStatement() {
    return nestedStatement;
  }

  public int kind() {
    return Program.KIND_BEGIN;
  }

  private Statement nestedStatement;

}
