package com.babel17.syntaxtree;

public class ImportNode extends Node {

    public final static int ENTRY_PLUS = 1, ENTRY_MINUS = 2, ENTRY_MAP = 3, ENTRY_ALL = 4;

    public static class Entry extends Node {
        private int entryType;
        private IdentifierNode id1, id2;
        public Entry(int et, IdentifierNode i1, IdentifierNode i2) {
            entryType = et;
            id1 = i1;
            id2 = i2;
            Location l1 = null;
            Location l2 = null;
            if (i1 != null) mergeLocation(i1.location());
            if (i2 != null) mergeLocation(i2.location());
        }
        public NodeList children() {
            NodeList l = new NodeList();
            if (id2 != null) l = l.cons(id2);
            if (id1 != null) l = l.cons(id1);
            return l;
        }
        public int entryType() { return entryType; }
        public IdentifierNode id1() { return id1; }
        public IdentifierNode id2() { return id2; }
    }

    private NodeList ids;
    private NodeList entries;

    public static ImportNode simple(NodeList ids) {
        return rename(ids, null);
    }

    public static ImportNode wildcard(NodeList ids) {
        Entry e = new Entry(ENTRY_ALL, null, null);
        e.mergeLocation(ids.location());
        NodeList entries = new NodeList().cons(e);
        return new ImportNode(ids, entries);
    }

    public static ImportNode set(NodeList ids, NodeList entries) {
        return new ImportNode(ids, entries);
    }

    public static ImportNode rename(NodeList ids, IdentifierNode newname) {
        ids = ids.reverse();
        IdentifierNode oldname = (IdentifierNode) ids.head();
        if (newname == null) newname = oldname;
        ids = ids.tail().reverse();
        Entry e = new Entry(ENTRY_MAP, oldname, newname);
        NodeList entries = new NodeList().cons(e);
        return new ImportNode(ids, entries);
    }

    private ImportNode(NodeList ids, NodeList entries) {
        this.ids = ids;
        this.entries = entries;
    }

    public boolean importAll() {
        return entries == null;
    }

    public NodeList entries() {
        return entries;
    }

    public NodeList ids() {
        return ids;
    }

    public NodeList children() {
        if (entries == null) return ids;
        else return ids.append(entries);
    }

}
