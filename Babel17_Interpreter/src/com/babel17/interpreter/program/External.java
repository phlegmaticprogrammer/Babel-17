package com.babel17.interpreter.program;

public final class External {

  public External(ModulePath absolutePath) {
    this.absolutePath = absolutePath;
  }

  public ModulePath absolutePath() {
    return absolutePath;
  }

  private ModulePath absolutePath;

}
