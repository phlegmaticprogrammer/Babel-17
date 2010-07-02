package com.babel17.interpreter.values;

public final class PersistentException extends ExceptionValue {

  public static PersistentException withValue(Value v) {
    return new PersistentException(v);
  }

  private PersistentException(Value v) {
    value = v;
  }

  public Value value() {
    return value;
  }

  public DynamicException toDynamic() {
    return DynamicException.withValue(value);
  }

  public Value sendMessage(String message) {
    return toDynamic();
  }


  private Value value;

}
