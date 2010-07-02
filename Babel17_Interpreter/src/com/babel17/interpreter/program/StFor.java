package com.babel17.interpreter.program;

public final class StFor extends ControlStatement {

  public StFor(Pattern pattern, Expr collection, Statement body, Statement next) {
    super(next);
    this.pattern = pattern;
    this.collection = collection;
    this.body = body;
  }

  public int kind() {
    return Program.KIND_FOR;
  }

  public Statement body() {
    return body;
  }

  public Expr collection() {
    return collection;
  }

  public Pattern pattern() {
    return pattern;
  }

  private Pattern pattern;
  private Expr collection;
  private Statement body;

}
