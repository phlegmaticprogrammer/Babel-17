package com.babel17.syntaxtree;

public class TypedefClauseNode extends Node {

    private Node expr;
    private PatternNode pattern;

    public TypedefClauseNode(PatternNode pattern) {
        this.pattern = pattern;
        this.expr = null;
    }

    public TypedefClauseNode(PatternNode pattern, Node expr) {
        this.pattern = pattern;
        this.expr = expr;
    }

    public boolean hasExpr() {
        return expr != null;
    }

    public Node expr() {
        return expr;
    }

    public PatternNode pattern() {
        return pattern;
    }

    public NodeList children() {
        if (expr != null)
            return new NodeList().cons(expr).cons(pattern);
        else
            return new NodeList().cons(pattern);
    }

}
