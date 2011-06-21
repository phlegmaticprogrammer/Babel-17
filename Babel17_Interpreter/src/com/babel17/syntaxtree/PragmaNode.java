package com.babel17.syntaxtree;

public final class PragmaNode extends Node {
    public final static int PRAGMA_LOG = 1;
    public final static int PRAGMA_ASSERT = 2;
    public final static int PRAGMA_PROFILE = 3;
    public final static int PRAGMA_PRINT = 4;
    public final static int PRAGMA_CATCH = 5;

    public PragmaNode(int pragma, Node expr) {
        this(pragma, expr, null);
    }


    public PragmaNode(int pragma, Node expr, PatternNode pat) {
        this.expr = expr;
        this.pragma = pragma;
        this.pat = pat;
    }

    public Node expr() {
      return expr;
    }

    public PatternNode pattern() {
        return pat;
    }

    public int pragma() {
        return pragma;
    }

    public NodeList children() {
      NodeList l = new NodeList().cons(expr);
      if (pat != null) l = l.cons(pat);
      return l;
    }

    private Node expr;
    private PatternNode pat;
    private int pragma;
}
