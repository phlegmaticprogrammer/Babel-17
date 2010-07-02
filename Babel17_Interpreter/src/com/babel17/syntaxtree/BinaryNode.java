package com.babel17.syntaxtree;

public final class BinaryNode extends Node {

  public BinaryNode(OperatorNode op, Node left, Node right) {
    this.op = op;
    this.left = left;
    this.right = right;
  }

  public OperatorNode operator() {
    return op;
  }

  public Node leftOperand() {
    return left;
  }

  public Node rightOperand() {
    return right;
  }

  public NodeList children() {
    return new NodeList().cons(right).cons(op).cons(left);
  }

  private OperatorNode op;
  private Node left, right;

}
