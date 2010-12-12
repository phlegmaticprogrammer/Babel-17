package com.babel17.syntaxtree;

public final class TryNode extends ControlNode {

  private NodeList patterns;
  private NodeList blocks;
  private Node block;

  public TryNode(Node block, NodeList patterns, NodeList blocks) {
    this.patterns = patterns;
    this.blocks = blocks;
    this.block = block;
  }

  public Node block() {
    return block;
  }

  public NodeList patterns() {
    return patterns;
  }

  public NodeList blocks() {
    return blocks;
  }

  public NodeList children() {
    return patterns.append(blocks).cons(block);
  }

}
