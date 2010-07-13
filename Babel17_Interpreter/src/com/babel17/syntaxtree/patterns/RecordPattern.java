package com.babel17.syntaxtree.patterns;

import com.babel17.syntaxtree.*;

public final class RecordPattern extends PatternNode {

  public final static class MessageValue extends PatternNode {
    private IdentifierPattern message;
    private PatternNode value;
    public MessageValue(IdentifierPattern message, PatternNode value) {
      this.message = message;
      this.value = value;
    }
    public IdentifierPattern message() {
      return message;
    }
    public PatternNode value() {
      return value;
    }
    public NodeList children() {
      return new NodeList().cons(value).cons(message);
    }
  }

  private NodeList elements; 

  public RecordPattern(NodeList elems) {
    elements = elems;
  }

  public NodeList elements() {
    return elements;
  }

  public NodeList children() {
    return elements;
  }

}
