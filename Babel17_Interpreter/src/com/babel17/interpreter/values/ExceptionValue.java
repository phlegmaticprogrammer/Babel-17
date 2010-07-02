package com.babel17.interpreter.values;

public abstract class ExceptionValue extends Value {

  public abstract DynamicException toDynamic();
  public abstract Value value();

}
