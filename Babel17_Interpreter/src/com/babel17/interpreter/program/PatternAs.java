package com.babel17.interpreter.program;

public final class PatternAs extends Pattern {
  
  public PatternAs(Pattern pattern) {
    this.pattern = pattern;
  }

  public Pattern pattern() { return pattern; }

  private Pattern pattern;

 public int kind() { return KIND_AS; }


}
