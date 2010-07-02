package com.babel17.interpreter.program;

public final class CaseExpr {

  public CaseExpr(Pattern pattern, Expr body) {
    this.pattern = pattern;
    this.body = body;
  }

  public Pattern pattern() { return pattern; }
  public Expr body() { return body; }

  private Pattern pattern;
  private Expr body;

}
