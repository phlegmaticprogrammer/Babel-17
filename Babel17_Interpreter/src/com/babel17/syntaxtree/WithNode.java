package com.babel17.syntaxtree;

public final class WithNode extends ControlNode {

  public WithNode(Node condition, ControlNode control) {
    this.collector = condition;
    this.control = control;
  }

  public Node collector() {
    return collector;
  }

  public ControlNode control() {
    return control;
  }

  public NodeList children() {
    return new NodeList().cons(control).cons(collector);
  }

  private Node collector;
  private ControlNode control;

}
