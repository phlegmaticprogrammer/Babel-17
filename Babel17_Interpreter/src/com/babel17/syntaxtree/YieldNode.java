package com.babel17.syntaxtree;

public final class YieldNode extends Node {

  public YieldNode(Node expr) {
    this.expr = expr;
  }

  public Node expr() {
    return expr;
  }

  public NodeList children() {
    return new NodeList().cons(expr);
  }

  private Node expr;

}
