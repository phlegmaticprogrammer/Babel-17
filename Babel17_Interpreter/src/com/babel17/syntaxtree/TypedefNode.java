package com.babel17.syntaxtree;

public class TypedefNode extends Node {

    private NodeList clauses;
    private IdentifierNode id;
    
    public TypedefNode(IdentifierNode id, NodeList clauses) {
        this.clauses = clauses;
        this.id = id;
    }
    
    public NodeList clauses() {
        return clauses;
    }
    
    public IdentifierNode id() {
        return id;
    }

    public NodeList children() {
        return clauses.cons(id);
    }

}
