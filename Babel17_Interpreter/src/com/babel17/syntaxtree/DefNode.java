package com.babel17.syntaxtree;

public final class DefNode extends Node {

  // pattern may be null
  public DefNode(IdentifierNode id, AttributeNode attribute, PatternNode pattern,
          Node rightSide) {
    this.id = id;
    this.attribute = attribute;
    this.pattern = pattern;
    this.rightSide = rightSide;
  }

  public IdentifierNode id() {
    return id;
  }

  public AttributeNode attribute() {
    return attribute;
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
    return list.cons(id).cons(attribute);
  }

  private IdentifierNode id;
  private AttributeNode attribute;
  private PatternNode pattern;
  private Node rightSide;

}
