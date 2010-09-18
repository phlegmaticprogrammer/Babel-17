package com.babel17.syntaxtree.patterns;

import com.babel17.syntaxtree.*;

public final class ExceptionPattern extends PatternNode {

  public ExceptionPattern(PatternNode value) {
    this.value = value;
  }

private PatternNode value;

  public PatternNode param() {
    return value;
  }

  public NodeList children() {
    return new NodeList().cons(value);
  }

}
