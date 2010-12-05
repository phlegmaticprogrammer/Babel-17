package com.babel17.syntaxtree;

public final class PragmaNode extends Node {
    public final static int PRAGMA_LOG = 1;
    public final static int PRAGMA_ASSERT = 2;
    public final static int PRAGMA_PROFILE = 3;
    public final static int PRAGMA_PRINT = 4;

    public PragmaNode(int pragma, Node expr) {
        this.expr = expr;
        this.pragma = pragma;
    }

    public Node expr() {
      return expr;
    }

    public int pragma() {
        return pragma;
    }

    public NodeList children() {
      return new NodeList().cons(expr);
    }

    private Node expr;
    private int pragma;
}
