package com.babel17.syntaxtree.patterns;

import com.babel17.syntaxtree.*;

public final class ConstrPattern extends PatternNode {

  public ConstrPattern(String name, Location nameLocation, PatternNode pattern) {
    this.name = name;
    this.pattern = pattern;
    this.nameLoc = nameLocation;
  }

  private PatternNode pattern;
  private Location nameLoc;
  private String name;

  public String name() {
    return name;
  }

  public Location nameLocation() {
    return nameLoc;
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
