package com.babel17.interpreter.program;

public final class PatternPredicate extends Pattern {

  public PatternPredicate(Expr predicate, Pattern pattern) {
    this.predicate = predicate;
    this.pattern = pattern;
  }

  public Expr predicate() {
    return predicate;
  }

  public Pattern pattern() {
    return pattern;
  }

 public int kind() { return KIND_PREDICATE; }
  
  private Expr predicate;
  private Pattern pattern;

}
