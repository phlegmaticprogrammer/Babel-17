package com.babel17.syntaxtree;

public final class MessageNode extends Node {

  private String name;
  private Node lens;

  public MessageNode(String name) {
    this.name = name;
    this.lens = null;
  }
  
  public MessageNode(Node lens) {
    this.lens = lens;
    this.name = null;
  }

  public String description() {
    return "message '"+name()+"'";
  }

  public String name() { return name; }
  public Node lens() { return lens; }
  public NodeList children() {
    NodeList l = new NodeList();
    if (lens != null) l = l.cons(lens);
    return l;
  }

}
