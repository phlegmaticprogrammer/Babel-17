package com.babel17.interpreter.program;

public final class PatternAny extends Pattern {
  
  private final static PatternAny THIS = new PatternAny();

  public final static PatternAny create() { return THIS; }

  private PatternAny() {    
  }

  public int kind() { return KIND_ANY; }

}
