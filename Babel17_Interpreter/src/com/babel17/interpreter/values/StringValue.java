package com.babel17.interpreter.values;

public final class StringValue extends Value {

  public static StringValue fromString(String s) {
    return new StringValue(s);
  }

  private StringValue(String s) {
    this.value = s;
  }

  private String value;

}
