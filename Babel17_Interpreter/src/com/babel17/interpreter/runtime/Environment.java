package com.babel17.interpreter.runtime;

import com.babel17.interpreter.values.Value;

public final class Environment {
  public Value getValue(int index) {
    throw new RuntimeException("not implemented");
  }
  public int size() {
    throw new RuntimeException("not implemented");
  }
  public void pushValue(Value v) {
    throw new RuntimeException("not implemented");
  }
  public void pop(int numValues) {
    throw new RuntimeException("not implemented");
  }
  public void updateValue(int index, Value v) {
    throw new RuntimeException("not implemented");    
  }
  public Environment freeze() {
    throw new RuntimeException("not implemented");
  }
}
