package com.babel17.syntaxtree;

public final class ObjectNode extends ControlNode {

  public ObjectNode(BlockNode block) {
    this.block = block;
  }

  public BlockNode block() {
    return block;
  }

  public NodeList children() {
    return new NodeList().cons(block);
  }

  private BlockNode block;

}
