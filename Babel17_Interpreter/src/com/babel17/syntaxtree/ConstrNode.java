package com.babel17.syntaxtree;

public final class ConstrNode extends Node {

  private String name;
  private Location nameLoc;
  private Node arg;

  public ConstrNode(String name, Location nameLoc, Node arg) {
    this.name = name;
    this.arg = arg;
  }

  public String name() { return name; }
  public Location nameLoc() { return nameLoc; }
  public Node arg() { return arg; }
  public NodeList children() {
    if (arg == null)
      return null;
    else
      return new NodeList().cons(arg);
  }

  public String description() {
    return "constructor '"+name+"'";
  }

}
