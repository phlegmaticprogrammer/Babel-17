package com.babel17.interpreter.parser;

import java.util.*;

public final class ModulePath implements Comparable<ModulePath> {

  public final static ModulePath ROOT = new ModulePath();
  
  private String[] path;
  private ModulePath parent;

  public ModulePath() {
    path = new String[]{};
    this.parent = null;
  }

  private ModulePath(String[] path, ModulePath parent) {
    this.path = path;
    this.parent = parent;
  }

  public ModulePath add(String submodule) {
    String[] newpath = new String[path.length+1];
    for (int i=0; i<path.length; i++)
      newpath[i] = path[i];
    newpath[path.length] = submodule;
    return new ModulePath(newpath, this);
  }

  public ModulePath parent() {
    return parent;
  }


  public String toString() {
    StringBuffer buf = new StringBuffer();
    buf.append("root");
    for (int i=0; i<path.length; i++) {
      buf.append(".");
      buf.append(path[i]);
    }
    return buf.toString();
  }

  public int compareTo(ModulePath that) {
    for (int i=0; i<path.length; i++) {
      if (i >= that.path.length) {
        return 1;
      }
      int c = path[i].compareToIgnoreCase(that.path[i]);
      if (c != 0) return c;
    }
    if (path.length < that.path.length)
      return -1;
    else
      return 0;
  }

  // 0 => equal, -1 => this is a true prefix of that, 1 => that is a true prefix of this, 2 => unequal
  public int prefixCompare(ModulePath that) {
    int i;
    for (i = 0; i<path.length && i <that.path.length; i++) {
      int c = path[i].compareTo(that.path[i]);
      if (c != 0) return 2;
    }
    if (i < path.length) return 1;
    if (i < that.path.length) return -1;
    return 0;
  }

  public int length() {
      return path.length;
  }

  public String get(int i) {
    return path[i];
  }

}
