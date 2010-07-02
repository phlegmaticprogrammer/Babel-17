package com.babel17.interpreter.program;

import java.util.*;

public final class Module {

  public Module(ModulePath absolutePath, List<External> externals, Statement body) {
    this.absolutePath = absolutePath;
    this.body = body;
    this.externals = new ArrayList(externals.size());
    Collections.copy(this.externals, externals);
  }

  public Statement body() {
    return body;
  }

  public ModulePath absolutePath() {
    return absolutePath;
  }

  public int countExternals() {
    return externals.size();
  }

  public External external(int index) {
    return externals.get(index);
  }

  private Statement body;
  private ModulePath absolutePath;
  private List<External> externals;

}
