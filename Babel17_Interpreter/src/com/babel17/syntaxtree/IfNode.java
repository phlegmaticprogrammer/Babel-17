package com.babel17.syntaxtree;

public final class IfNode extends ControlNode {

  private NodeList conditions;
  private NodeList blocks;

  public IfNode(NodeList conditions, NodeList blocks) {
    this.conditions = conditions;
    this.blocks = blocks;
  }

  public NodeList conditions() {
    return conditions;
  }

  public NodeList blocks() {
    return blocks;
  }

  public NodeList children() {
    return conditions.append(blocks);
  }

  public boolean hasElse() {
    return blocks.length() != conditions.length();
  }

}
