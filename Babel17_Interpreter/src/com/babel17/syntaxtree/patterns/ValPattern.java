package com.babel17.syntaxtree.patterns;

import com.babel17.syntaxtree.*;

public final class ValPattern extends PatternNode {

  public ValPattern(Node value) {
    this.value = value;
  }

  private Node value;

  public Node value() {
    return value;
  }

  public NodeList children() {
    return new NodeList().cons(value);
  }

}
