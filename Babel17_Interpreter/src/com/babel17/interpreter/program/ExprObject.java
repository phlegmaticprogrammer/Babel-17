package com.babel17.interpreter.program;

import java.util.*;

public final class ExprObject extends Expr {

  public static class MessageIndex {
    public MessageIndex(String s, int index) {
      this.s = s.toLowerCase();
      this.index = index;
    }
    public String message() {
      return s;
    }
    public int index() {
      return index;
    }
    private String s;
    private int index;
  }

  public ExprObject(Statement body, List<MessageIndex> messages) {
    this.body = body;
    this.messages = new ArrayList(messages.size());
    Collections.copy(this.messages, messages);
  }

  public int kind() {
    return KIND_OBJECT;
  }

  public Statement body() { return body; }

  public int countMessages() { return messages.size(); }

  public MessageIndex messageIndex(int i) {
    return messages.get(i);
  }

  private Statement body;
  private List<MessageIndex> messages;

}
