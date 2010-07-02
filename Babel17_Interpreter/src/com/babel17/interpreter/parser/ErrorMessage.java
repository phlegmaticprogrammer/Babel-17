package com.babel17.interpreter.parser;

import java.util.*;
import com.babel17.syntaxtree.Location;

public class ErrorMessage {

    private Location loc;
    private String message;

    public ErrorMessage(Location loc, String message) {
      this.loc = loc;
      this.message = message;
    }

    public Location location() {
      return loc;
    }

    public String message() {
      return message;
    }

    public String toString() {
      if (location() == null) {
        return "parse error: " + message();
      } else {
        return "parse error at " + location() + ": " + message();
      }
    }
}
