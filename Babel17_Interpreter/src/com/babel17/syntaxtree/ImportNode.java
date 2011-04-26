package com.babel17.syntaxtree;

public class ImportNode extends Node {

    private NodeList ids;
    private boolean importAll;

    public ImportNode(boolean importAll, NodeList ids) {
        this.ids = ids;
        this.importAll = importAll;
    }

    public boolean importAll() {
        return importAll;
    }

    public NodeList ids() {
        return ids;
    }

    public NodeList children() {
        return ids;
    }

}
