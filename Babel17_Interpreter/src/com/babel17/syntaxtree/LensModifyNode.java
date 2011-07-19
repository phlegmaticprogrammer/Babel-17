package com.babel17.syntaxtree;

public class LensModifyNode extends Node {

    public LensModifyNode(boolean left, OperatorNode op, Node leftSide, Node rightSide)
    {
        this.leftSide = leftSide;
        this.rightSide = rightSide;
        this.left = left;
        this.op = op;
    }
    
    public Node leftSide() {
      return leftSide;
    }

    public Node rightSide() {
        return rightSide;
    }
    
    public OperatorNode op() { return op; }
    
    public boolean left() { return left; }

    public NodeList children() {
        return new NodeList().cons(op).cons(leftSide).cons(rightSide);
    }

    private Node leftSide, rightSide;
    private boolean left;
    private OperatorNode op;

}
