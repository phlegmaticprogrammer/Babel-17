package com.babel17.syntaxtree.patterns;

import com.babel17.syntaxtree.*;

public class TypePattern extends PatternNode {
    
    private PatternNode pattern;
    private Node typeAnnotation;

    public TypePattern(PatternNode pattern, Node typeAnnotation) {
        this.pattern = pattern;
        this.typeAnnotation = typeAnnotation;
    }

    public PatternNode pattern() {
        return pattern;
    }

    public Node typeAnnotation() {
        return typeAnnotation;
    }

    public TypeIdNode typeId() {
        if (typeAnnotation instanceof TypeIdNode) {
            return (TypeIdNode) typeAnnotation;
        } else return null;
    }

    public Node typeValue() {
        if (typeAnnotation instanceof TypeIdNode) {
            return null;
        } else return typeAnnotation;
    }

    public NodeList children() {
        return new NodeList().cons(typeAnnotation).cons(pattern);
    }

}
