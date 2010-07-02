package com.babel17.interpreter.parser;

import com.babel17.syntaxtree.Location;
import java.util.*;

public final class ParseException extends RuntimeException {

  public static class Message extends ErrorMessage {

    public Message(Location loc, String message) {
      super(loc, message);
    }

  }
  public ArrayList<Message> messages;

  public ParseException() {
    super("");
    messages = new ArrayList<Message>();
  }

  public ParseException(Location loc, String message) {
    super(message);
    messages = new ArrayList<Message>();
    addMessage(loc, message);
  }

  public Location location() {
    if (countMessages() == 0) return null;
    else return getMessage(0).location();
  }

  public int countMessages() {
    return messages.size();
  }

  public Message getMessage(int i) {
    return messages.get(i);
  }

  public void addMessage(Location loc, String message) {
    messages.add(new Message(loc, message));
  }

}
