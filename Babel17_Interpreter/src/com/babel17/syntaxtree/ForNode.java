package com.babel17.syntaxtree;

public final class ForNode extends ControlNode {

  public ForNode(PatternNode pattern, Node collection, BlockNode block) {
    this.pattern = pattern;
    this.collection = collection;
    this.block = block;
  }

  public PatternNode pattern() {
    return pattern;
  }

  public Node collection() {
    return collection;
  }

  public BlockNode block() {
    return block;
  }

  public NodeList children() {
    return new NodeList().cons(block).cons(collection).cons(pattern);
  }

  private PatternNode pattern;
  private Node collection;
  private BlockNode block;

}
