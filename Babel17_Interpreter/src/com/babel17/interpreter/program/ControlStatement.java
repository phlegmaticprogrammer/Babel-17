package com.babel17.interpreter.program;

public abstract class ControlStatement extends Statement {

  protected ControlStatement(Statement next) {
    super(next);
  }

}
