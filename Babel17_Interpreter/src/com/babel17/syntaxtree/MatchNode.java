package com.babel17.syntaxtree;

public final class MatchNode extends ControlNode {

  private NodeList patterns;
  private NodeList blocks;
  private Node value;

  public MatchNode(Node value, NodeList patterns, NodeList blocks) {
    this.patterns = patterns;
    this.blocks = blocks;
    this.value = value;
  }

  public Node value() {
    return value;
  }

  public NodeList patterns() {
    return patterns;
  }

  public NodeList blocks() {
    return blocks;
  }

  public NodeList children() {
    return patterns.append(blocks).cons(value);
  }

}
