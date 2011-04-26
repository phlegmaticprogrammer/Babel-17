package com.babel17.syntaxtree;

public class TypeExprNode extends Node {

    private TypeIdNode typeId;

    public TypeExprNode(TypeIdNode typeId) {
        this.typeId = typeId;
    }

    public TypeIdNode typeId() {
        return typeId;
    }

    public NodeList children() {
        return new NodeList().cons(typeId);
    }

}
