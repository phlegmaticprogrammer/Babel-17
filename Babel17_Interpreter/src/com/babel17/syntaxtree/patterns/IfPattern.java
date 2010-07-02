package com.babel17.syntaxtree.patterns;

import com.babel17.syntaxtree.*;

public final class IfPattern extends PatternNode {

  public IfPattern(PatternNode pattern, Node condition) {
    this.condition = condition;
    this.pattern = pattern;
  }

  private Node condition;
  private PatternNode pattern;

  public Node condition() {
    return condition;
  }

  public PatternNode pattern() {
    return pattern;
  }

  public NodeList children() {
    return new NodeList().cons(condition).cons(pattern);
  }

}
