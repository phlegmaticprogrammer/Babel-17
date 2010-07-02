package com.babel17.syntaxtree;

public final class StringNode extends Node {
  
  public StringNode(String s) {
    this.s = s;
  }

  public NodeList children() {
    return null;
  }

  public String description() {
    return s.toString();
  }
  
  private String s;



}
