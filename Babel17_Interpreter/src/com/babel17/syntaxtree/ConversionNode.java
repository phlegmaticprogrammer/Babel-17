package com.babel17.syntaxtree;

public class ConversionNode extends Node {

    public ConversionNode(TypeIdNode returnType, Node expr) {
        this.returnType = returnType;
        this.expr = expr;
    }

    public TypeIdNode returnType() {
        return returnType;
    }

    public Node expr() {
        return expr;
    }

    public NodeList children() {
        return new NodeList().cons(expr).cons(returnType);
    }

    private TypeIdNode returnType;
    private Node expr;

}
