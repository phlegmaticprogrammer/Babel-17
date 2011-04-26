package com.babel17.syntaxtree.patterns;

import com.babel17.syntaxtree.*;

public class InnerValuePattern extends PatternNode {

    private IdentifierNode typeId;
    private PatternNode pattern;
    
    public InnerValuePattern(IdentifierNode typeId, PatternNode pattern) {
        this.typeId = typeId;
        this.pattern = pattern;
    }
    
    public IdentifierNode typeId() {
        return typeId;
    }
    
    public PatternNode pattern() {
        return pattern;
    }
    
    public NodeList children() {
        return new NodeList().cons(pattern).cons(typeId);
    }

}
