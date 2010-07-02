package com.babel17.syntaxtree;

public final class MapNode extends Node {

  public final static class KeyValue extends Node {
    private Node key;
    private Node value;
    public KeyValue(Node key, Node value) {
      this.key = key;
      this.value = value;
    }
    public Node key() {
      return key;
    }
    public Node value() {
      return value;
    }
    public NodeList children() {
      return new NodeList().cons(value).cons(key);
    }
  }

  private NodeList elements; 

  public MapNode(NodeList elems) {
    elements = elems;
  }

  public NodeList elements() {
    return elements;
  }

  public NodeList children() {
    return elements;
  }

}
