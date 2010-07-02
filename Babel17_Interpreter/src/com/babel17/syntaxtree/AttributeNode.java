package com.babel17.syntaxtree;

public final class AttributeNode extends Node {

  public final static int PRIVATE = 1;
  public final static int PROTECTED = 2;
  public final static int PUBLIC = 3;

  public final static int DEFAULT = 0;

  public AttributeNode(int accessLevel) {
    this.accessLevel = accessLevel;
  }

  public int accessLevel() {
    return accessLevel;
  }

  public NodeList children() {
    return null;
  }

  private int accessLevel;


}
