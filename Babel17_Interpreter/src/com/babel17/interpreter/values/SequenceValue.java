package com.babel17.interpreter.values;

public abstract class SequenceValue extends CollectionValue {

  public Value getValueAt(int index)
    { throw new RuntimeException("not implemented"); }


}
