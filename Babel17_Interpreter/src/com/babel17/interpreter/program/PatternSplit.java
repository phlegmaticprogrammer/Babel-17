package com.babel17.interpreter.program;

import java.util.*;

public final class PatternSplit extends Pattern {
  
  public PatternSplit(String message, List<Pattern> patterns) {
    this.message = message.toLowerCase();
    this.patterns = new ArrayList(patterns.size());
    Collections.copy(this.patterns, patterns);
  }

  public int countPatterns() {
    return patterns.size();
  }

  public Pattern pattern(int i) {
    return patterns.get(i);
  }

  public String message() {
    return message;
  }

  public int kind() { return KIND_SPLIT; }

  private List<Pattern> patterns;
  private String message;

}
