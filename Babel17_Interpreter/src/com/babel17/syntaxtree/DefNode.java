package com.babel17.syntaxtree;

public final class DefNode extends Node {

  // pattern may be null
  public DefNode(IdentifierNode id, PatternNode pattern,
          Node rightSide) {
    this.id = id;
    this.pattern = pattern;
    this.rightSide = rightSide;
  }

  public IdentifierNode id() {
    return id;
  }

  public PatternNode pattern() {
    return pattern;
  }

  public Node rightSide() {
    return rightSide;
  }

  public NodeList children() {
    NodeList list = new NodeList().cons(rightSide);
    if (pattern != null) list = list.cons(pattern);
    return list.cons(id);
  }

  private IdentifierNode id;
  private PatternNode pattern;
  private Node rightSide;

}
