package com.babel17.syntaxtree.patterns;

import com.babel17.syntaxtree.*;

public final class ConstrPattern extends PatternNode {

  public ConstrPattern(String name, PatternNode pattern) {
    this.name = name;
    this.pattern = pattern;
  }

  private PatternNode pattern;
  private String name;

  public String name() {
    return name;
  }

  public PatternNode pattern() {
    return pattern;
  }

  public String description() { return "constructor pattern '"+name()+"'";}

  public NodeList children() {
    if (pattern == null) return null;
    else return new NodeList().cons(pattern);
  }

}
