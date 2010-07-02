package com.babel17.syntaxtree;

public final class UnaryNode extends Node {

  public UnaryNode(OperatorNode operator, Node operand) {
    this.operator = operator;
    this.operand = operand;
  }

  public OperatorNode operator() {
    return operator;
  }

  public Node operand() {
    return operand;
  }

  public NodeList children() {
    return new NodeList().cons(operand).cons(operator);
  }

  private OperatorNode operator;
  private Node operand;

}
