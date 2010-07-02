package com.babel17.interpreter.values;

public abstract class CollectionValue extends Value {

  public boolean isEmpty()
  { throw new RuntimeException("not implemented"); }
  
  public int size()
  { throw new RuntimeException("not implemented"); }

}
