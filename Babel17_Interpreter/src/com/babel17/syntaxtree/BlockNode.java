package com.babel17.syntaxtree;

public final class BlockNode extends Node {

  public BlockNode(NodeList statements) {
    if (statements == null) throw new IllegalArgumentException();
    this.statements = statements;
  }

  public NodeList statements() {
    return statements;
  }

  public NodeList children() {
    return statements;
  }

  public static BlockNode empty() {
    return new BlockNode(new NodeList());
  }

  private NodeList statements;

}
