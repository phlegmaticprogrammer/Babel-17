package com.babel17.syntaxtree;

public final class ValNode extends Node {

  public ValNode(boolean assign, PatternNode pattern, Node rightSide) {
    this.pattern = pattern;
    this.rightSide = rightSide;
    this.assign = assign;
  }

  public PatternNode pattern() { return pattern; }
  public Node rightSide() { return rightSide; }
  public boolean assign() { return assign; }

  public NodeList children() {
    return new NodeList().cons(rightSide).cons(pattern);
  }

  private PatternNode pattern;
  private Node rightSide;
  private boolean assign;

}
