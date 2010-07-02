package com.babel17.syntaxtree.patterns;

import com.babel17.syntaxtree.*;
import java.util.*;

public final class IdentifierPattern extends PatternNode 
        implements Comparable<IdentifierPattern>
{

  private String name;

  public IdentifierPattern(String name) {
    this.name = name;
  }

  public String name() { return name; }
  public NodeList children() { return null; }

  public String description() {
    return "identifier pattern '"+name+"'";
  }

  public IdentifierNode toNode() {
    return (IdentifierNode) new IdentifierNode(name).mergeLocation(location());
  }

  public int compareTo(IdentifierPattern that) {
    return name.compareToIgnoreCase(that.name);
  }

}
