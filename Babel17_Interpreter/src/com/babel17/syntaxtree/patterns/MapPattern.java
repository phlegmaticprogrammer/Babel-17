package com.babel17.syntaxtree.patterns;

import com.babel17.syntaxtree.*;

public final class MapPattern extends PatternNode {

  public final static class KeyValue extends PatternNode {
    private PatternNode key;
    private PatternNode value;
    public KeyValue(PatternNode key, PatternNode value) {
      this.key = key;
      this.value = value;
    }
    public PatternNode key() {
      return key;
    }
    public PatternNode value() {
      return value;
    }
    public NodeList children() {
      return new NodeList().cons(value).cons(key);
    }
  }

  private NodeList elements; 

  public MapPattern(NodeList elems) {
    elements = elems;
  }

  public NodeList elements() {
    return elements;
  }

  public NodeList children() {
    return elements;
  }

}
