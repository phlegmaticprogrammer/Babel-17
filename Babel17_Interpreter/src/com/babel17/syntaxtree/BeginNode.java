package com.babel17.syntaxtree;

public final class BeginNode extends ControlNode {

  public BeginNode(BlockNode block) {
    this.block = block;
  }

  public BlockNode block() {
    return block;
  }

  public NodeList children() {
    return new NodeList().cons(block);
  }

  public static BeginNode empty() {
    return new BeginNode(new BlockNode(new NodeList()));
  }

  private BlockNode block;

}
