package com.babel17.interpreter.values;

public final class DynamicException extends ExceptionValue {

  public static DynamicException illegalArgument() {
    return new DynamicException(new ConstructorValue("ILLEGALARGUMENT"));
  }

  public static DynamicException invalidWhileTest() {
    return new DynamicException(new ConstructorValue("INVALIDWHILETEST"));
  }

  public static DynamicException invalidIfTest() {
    return new DynamicException(new ConstructorValue("INVALIDIFTEST"));
  }

  public static DynamicException invalidIterate() {
    return new DynamicException(new ConstructorValue("INVALIDITERATE"));
  }

  public static DynamicException invalidSplit(String message) {
    return new DynamicException(new ConstructorValue("INVALIDSPLIT",
            StringValue.fromString(message)));
  }

  public static DynamicException invalidDeconstruct() {
    return new DynamicException(new ConstructorValue("INVALIDDECONSTRUCT"));
  }


  public static DynamicException withValue(Value v) {
    return new DynamicException(v);
  }

  public static DynamicException unknownMessage(String s) {
    return new DynamicException(new ConstructorValue("UNKNOWNMESSAGE",
            StringValue.fromString(s)));
  }

  public static DynamicException invalidOperator(Value v) {
    return new DynamicException(new ConstructorValue("INVALIDOPERATOR", v));
  }

  public static DynamicException outOfDomain() {
    return new DynamicException(new ConstructorValue("OUTOFDOMAIN"));
  }

  public static DynamicException noMatch() {
    return new DynamicException(new ConstructorValue("NOMATCH"));
  }


  public DynamicException(Value v) {
    value = v;
  }

  public Value value() {
    return value;
  }

  public Value sendMessage(String message) {
    return this;
  }

  public DynamicException toDynamic() {
    return this;
  }

  private Value value;

}
