package com.babel17.interpreter.values;

public final class ConstructorValue extends Value{

  public final static String NAME_SOME = "SOME";
  public final static String NAME_NONE = "NONE";

  public ConstructorValue(String name) {
    this(name, VectorValue.EMPTY);
  }

  public boolean isNone() {
    if (!name.equals(NAME_NONE)) return false;
    Value v = value.force();
    if (v instanceof SequenceValue)
      return ((SequenceValue) v).isEmpty();
    return false;
  }

  public Value isSome() {
    if (name.equals(NAME_SOME))
      return value;
    else
      return null;
  }
  
  // name must be UPPERCASE !
  public ConstructorValue(String name, Value v) {
    this.name = name;
    this.value = v;
  }

  public String name() {
    return name;
  }

  public Value parameter() {
    return value;
  }

  private String name;
  private Value value;

}
