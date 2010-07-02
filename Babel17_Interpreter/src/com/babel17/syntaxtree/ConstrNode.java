package com.babel17.syntaxtree;

public final class ConstrNode extends Node {

  private String name;
  private Node arg;

  public ConstrNode(String name, Node arg) {
    this.name = name;
    this.arg = arg;
  }

  public String name() { return name; }
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
