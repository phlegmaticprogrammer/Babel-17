package com.babel17.interpreter.program;

public final class CaseStatement {

  public CaseStatement(Pattern pattern, Statement body) {
    this.pattern = pattern;
    this.body = body;
  }

  public Pattern pattern() { return pattern; }
  public Statement body() { return body; }

  private Pattern pattern;
  private Statement body;

}
