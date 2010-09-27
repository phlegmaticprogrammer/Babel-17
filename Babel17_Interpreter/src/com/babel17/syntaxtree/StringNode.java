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
  
  public String value() {
    return s;
  }
  
  private String s;



}
