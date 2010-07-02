package com.babel17.syntaxtree.patterns;

import com.babel17.syntaxtree.*;

public final class ListPattern extends PatternNode {

  private NodeList elements;
  private boolean vector;

  public ListPattern(NodeList elems, boolean vector) {
    elements = elems;
    this.vector = vector;
  }

  public NodeList elements() {
    return elements;
  }

  public NodeList children() {
    return elements;
  }

  public boolean isVector() {
    return vector;
  }

}
