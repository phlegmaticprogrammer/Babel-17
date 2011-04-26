package com.babel17.syntaxtree;

public class TypeIdNode extends Node {

    private NodeList ids;

    public TypeIdNode(NodeList ids) {
        this.ids = ids;
    }

    public NodeList ids() {
        return ids;
    }

    public NodeList children() {
        return ids;
    }

}
