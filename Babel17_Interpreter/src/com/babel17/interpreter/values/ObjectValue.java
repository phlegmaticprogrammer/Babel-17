package com.babel17.interpreter.values;

import java.util.*;

public final class ObjectValue extends Value {
  
  private HashMap<String, Value> methods;
  private boolean sealed;

  public ObjectValue() {
    methods = new HashMap();
    sealed = false;
  }

  public void put(String s, Value v) {
    if (sealed) throw new RuntimeException("cannot write to sealed value");
    methods.put(s, v);
  }

  public void seal() {
    sealed = true;
  }

  public Value get(String s) {
    return methods.get(s);
  }

}
