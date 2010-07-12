package com.babel17.syntaxtree;

public class ObjectUpdateNode extends Node {

    public ObjectUpdateNode(boolean assign, IdentifierNode id, MessageNode m, Node rightSide)
    {
        this.assign = assign;
        this.id = id;
        this.m = m;
        this.rightSide = rightSide;
    }

    public boolean assign() {
        return assign;
    }

    public IdentifierNode id() {
        return id;
    }

    public MessageNode message() {
        return m;
    }

    public Node rightSide() {
        return rightSide;
    }

    public NodeList children() {
        return new NodeList().cons(id).cons(m).cons(rightSide);
    }

    private boolean assign;
    private IdentifierNode id;
    private MessageNode m;
    private Node rightSide;

}
