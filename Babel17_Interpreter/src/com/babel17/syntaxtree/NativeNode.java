package com.babel17.syntaxtree;

public class NativeNode extends Node {

    private StringNode target;
    private NodeList params;

    public NativeNode() {
        target = null;
        params = null;
    }

    public boolean queryEnvironment() {
        return target == null || params == null;
    }

    public NativeNode(StringNode target, NodeList params) {
        this.target = target;
        this.params = params;
    }

    public StringNode target() {
        return target;
    }

    public NodeList params() {
        return params;
    }

    public NodeList children() {
        NodeList empty = new NodeList();
        if (target != null) empty = empty.cons(target);
        if (params != null) empty = empty.append(params);
        return empty;
    }

}
