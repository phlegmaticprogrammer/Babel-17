package com.babel17.syntaxtree;

public final class ListNode extends Node {

  private NodeList elements;
  private boolean vector;

  public ListNode(NodeList elems, boolean vector) {
    elements = elems;
    this.vector = vector;
  }

  public NodeList elements() {
    return elements;
  }

  public NodeList children() {
    return elements;
  }

  public boolean isVector() { return vector; }

}
