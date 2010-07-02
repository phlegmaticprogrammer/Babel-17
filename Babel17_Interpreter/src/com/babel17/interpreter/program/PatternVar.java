package com.babel17.interpreter.program;

public final class PatternVar extends Pattern {
  
  private final static PatternVar THIS = new PatternVar();

  public final static PatternVar create() {
    return THIS;
  }

  public int kind() { return KIND_VAR; }

  private PatternVar() {    
  }

}
