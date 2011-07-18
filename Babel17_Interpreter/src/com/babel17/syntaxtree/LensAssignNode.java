package com.babel17.syntaxtree;

public class LensAssignNode extends Node {

    public LensAssignNode(Node leftSide, Node rightSide)
    {
        this.leftSide = leftSide;
        this.rightSide = rightSide;
    }
    
    public Node leftSide() {
      return leftSide;
    }

    public Node rightSide() {
        return rightSide;
    }

    public NodeList children() {
        return new NodeList().cons(leftSide).cons(rightSide);
    }

    private Node leftSide, rightSide;

}
