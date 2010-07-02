package com.babel17.interpreter.program;

import java.util.*;

public final class ModulePath {

  public ModulePath(List<String> path) {
    this.path = new ArrayList(path.size());
    Collections.copy(this.path, path);
  }

  public int depth() {
    return path.size();
  }

  public String at(int index) {
    return path.get(index);
  }

  private List<String> path;

}
