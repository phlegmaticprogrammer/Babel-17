package com.babel17.syntaxtree;

public final class WhileNode extends ControlNode {

  public WhileNode(Node condition, BlockNode block) {
    this.condition = condition;
    this.block = block;
  }

  public Node condition() {
    return condition;
  }

  public BlockNode block() {
    return block;
  }

  public NodeList children() {
    return new NodeList().cons(block).cons(condition);
  }

  private Node condition;
  private BlockNode block;

}
