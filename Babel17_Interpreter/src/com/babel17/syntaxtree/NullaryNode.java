package com.babel17.syntaxtree;

public final class NullaryNode extends Node {

  public NullaryNode(OperatorNode op) {
    this.op = op;
  }

  public OperatorNode operator() { return op; }

  public NodeList children() {
    return new NodeList().cons(op);
  }

  private OperatorNode op;

}
