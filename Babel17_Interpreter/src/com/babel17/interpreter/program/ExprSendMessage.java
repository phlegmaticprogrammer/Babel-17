package com.babel17.interpreter.program;

public final class ExprSendMessage extends Expr {

  public ExprSendMessage(Expr receiver, String message) {
    this.receiver = receiver;
    this.message = message.toLowerCase();
  }

  public int kind() {
    return KIND_SEND_MESSAGE;
  }

  public Expr receiver() {
    return receiver;
  }

  public String message() {
    return message;
  }

  private Expr receiver;
  private String message;

}
