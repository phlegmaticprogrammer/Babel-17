package com.babel17.syntaxtree;

public final class LambdaNode extends Node {

  private NodeList patterns;
  private NodeList blocks;

  public LambdaNode(NodeList patterns, NodeList blocks) {
    this.patterns = patterns;
    this.blocks = blocks;
  }

  public NodeList patterns() {
    return patterns;
  }

  public NodeList blocks() {
    return blocks;
  }

  public NodeList children() {
    return patterns.append(blocks);
  }

}
