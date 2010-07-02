package com.babel17.syntaxtree;

import java.util.*;

public final class IdentifierNode extends Node 
        implements Comparable<IdentifierNode>
{

  private String name;

  public IdentifierNode(String name) {
    this.name = name;
  }

  public String name() { return name; }
  public NodeList children() { return null; }

  public String description() {
    return "identifier '"+name+"'";
  }

  public int compareTo(IdentifierNode that) {
    return name.compareToIgnoreCase(that.name);
  }


}
