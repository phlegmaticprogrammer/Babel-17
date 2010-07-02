package com.babel17.syntaxtree;

public final class SetNode extends Node {

  private NodeList elements;

  public SetNode(NodeList elems) {
    elements = elems;
  }

  public NodeList elements() {
    return elements;
  }

  public NodeList children() {
    return elements;
  }

}
