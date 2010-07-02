package com.babel17.syntaxtree;


/**
 * children is of the form:
 * Node OperatorNode Node OperatorNode Node ....
 */
public final class CompareNode extends Node {

  public CompareNode(NodeList comparisons) {
    this.comparisons = comparisons;
  }

  public NodeList comparisons() {
    return comparisons;
  }

  public NodeList children() {
    return comparisons;
  }

  private NodeList comparisons;

}
