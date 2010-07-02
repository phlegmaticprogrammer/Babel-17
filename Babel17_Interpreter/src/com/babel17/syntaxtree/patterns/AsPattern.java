package com.babel17.syntaxtree.patterns;

import com.babel17.syntaxtree.*;

public final class AsPattern extends PatternNode {

  public AsPattern(IdentifierPattern id, PatternNode pattern) {
    this.id = id;
    this.pattern = pattern;
  }

  private IdentifierPattern id;
  private PatternNode pattern;

  public IdentifierPattern identifier() {
    return id;
  }

  public PatternNode pattern() {
    return pattern;
  }

  public NodeList children() {
    return new NodeList().cons(pattern).cons(id);
  }

}
