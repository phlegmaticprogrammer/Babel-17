package com.babel17.interpreter.program;

public final class PatternIf extends Pattern {
  
  public PatternIf(Pattern pattern, Expr condition) {
    this.pattern = pattern;
    this.condition = condition;
  }

  public Pattern pattern() {
    return pattern;
  }

  public Expr condition() {
    return condition;
  }

 public int kind() { return KIND_IF; }


  private Pattern pattern;
  private Expr condition;

}
