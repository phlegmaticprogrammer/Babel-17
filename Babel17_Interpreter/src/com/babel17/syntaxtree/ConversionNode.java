package com.babel17.syntaxtree;

public class ConversionNode extends Node {

    public ConversionNode(TypeIdNode returnType, Node expr, boolean automatic) {
        this.returnType = returnType;
        this.expr = expr;
        this.automatic = automatic;
    }

    public TypeIdNode returnType() {
        return returnType;
    }

    public Node expr() {
        return expr;
    }
    
    public boolean automatic() {
        return automatic;
    }

    public NodeList children() {
        return new NodeList().cons(expr).cons(returnType);
    }

    private TypeIdNode returnType;
    private Node expr;
    private boolean automatic;

}
