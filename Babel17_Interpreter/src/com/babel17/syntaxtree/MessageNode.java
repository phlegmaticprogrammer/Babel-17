package com.babel17.syntaxtree;

public final class MessageNode extends Node {

  private String name;

  public MessageNode(String name) {
    this.name = name;
  }

  public String description() {
    return "message '"+name()+"'";
  }

  public String name() { return name; }
  public NodeList children() { return null; }

}
