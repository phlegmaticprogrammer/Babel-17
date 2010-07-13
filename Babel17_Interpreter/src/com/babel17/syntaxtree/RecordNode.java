package com.babel17.syntaxtree;

public final class RecordNode extends Node {

  public final static class MessageValue extends Node {
    private IdentifierNode message;
    private Node value;
    public MessageValue(IdentifierNode message, Node value) {
      this.message = message;
      this.value = value;
    }
    public IdentifierNode message() {
      return message;
    }
    public Node value() {
      return value;
    }
    public NodeList children() {
      return new NodeList().cons(value).cons(message);
    }
  }

  private NodeList elements; 

  public RecordNode(NodeList elems) {
    elements = elems;
  }

  public NodeList elements() {
    return elements;
  }

  public NodeList children() {
    return elements;
  }

}
