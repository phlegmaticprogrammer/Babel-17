package com.babel17.syntaxtree.patterns;

import com.babel17.syntaxtree.*;

public final class ForPattern extends PatternNode {

  private NodeList elements;

  public ForPattern(NodeList elems) {
    elements = elems;
  }

  public NodeList elements() {
    return elements;
  }

  public NodeList children() {
    return elements;
  }

}
