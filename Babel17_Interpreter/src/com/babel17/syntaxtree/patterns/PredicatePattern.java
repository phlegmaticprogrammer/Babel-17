package com.babel17.syntaxtree.patterns;

import com.babel17.syntaxtree.*;

public final class PredicatePattern extends PatternNode {

  public PredicatePattern(Node predicate, PatternNode pattern, boolean deconstruct) {
    this.predicate = predicate;
    this.pattern = pattern;
    this.deconstruct = deconstruct;
  }

  private boolean deconstruct;

  public boolean deconstruct() {
      return deconstruct;
  }

  private Node predicate;
  private PatternNode pattern;

  public Node predicate() {
    return predicate;
  }

  public PatternNode pattern() {
    return pattern;
  }

  public NodeList children() {
    NodeList l = new NodeList();
    if (pattern != null) l = l.cons(pattern);
    return l.cons(predicate);
  }

}
