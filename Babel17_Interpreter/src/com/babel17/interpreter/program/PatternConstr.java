package com.babel17.interpreter.program;

public final class PatternConstr extends Pattern {
  
  public PatternConstr(String name, Pattern pattern) {
    this.name = name.toUpperCase();
    this.pattern = pattern;
  }

  public String name() { return name; }

  public Pattern pattern() { return pattern; }

  private String name;
  private Pattern pattern;

 public int kind() { return KIND_CONSTR; }


}
