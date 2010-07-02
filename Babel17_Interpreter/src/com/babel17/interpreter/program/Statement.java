package com.babel17.interpreter.program;

public abstract class Statement extends Program {
  
  protected Statement(Statement next) {
    this.next = next;
  }

  public Statement nextStatement() {
    return next;
  }

  private Statement next;

}
