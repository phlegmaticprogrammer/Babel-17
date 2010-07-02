package com.babel17.interpreter.program;

public final class PatternException extends Pattern {

  public PatternException(Pattern pattern) {
    this.pattern = pattern;
  }

  public Pattern pattern() {
    return pattern;
  }

  public int kind() {
    return KIND_EXCEPTION;
  }

  private Pattern pattern;

}
