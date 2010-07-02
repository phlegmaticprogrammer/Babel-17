package com.babel17.syntaxtree.patterns;

import com.babel17.syntaxtree.*;

public final class NullaryPattern extends PatternNode{

  public final static int ANY = 0;
  public final static int ELLIPSIS = 1;

  public final static int TRUE = 2;
  public final static int FALSE = 3;

  public final static int INFINITY = 4;
  public final static int NEGATIVE_INFINITY = 5;

  public NullaryPattern(int kind) {
    this.kind = kind;
  }
  
  public int kind() { return kind; }
  
  public NodeList children() { return null; }

  public static boolean is(Node n, int kind) {
    return (n instanceof NullaryPattern) &&
            (((NullaryPattern) n).kind() == kind);
  }

  private int kind;

}
