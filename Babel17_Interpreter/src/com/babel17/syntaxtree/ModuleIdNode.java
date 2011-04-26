package com.babel17.syntaxtree;

public class ModuleIdNode extends Node {

    private NodeList ids;

    public ModuleIdNode(NodeList ids) {
        this.ids = ids;
    }

    public NodeList ids() {
        return ids;
    }

    public NodeList children() {
        return ids;
    }

}
