package com.babel17.syntaxtree;

import java.util.Comparator;

public final class Location {

  public static class CascadingComparator implements Comparator<Location> {
    public int compare(Location a, Location b) {
      Location l = a.add(b);
      if (a.equals(l) || b.equals(l)) return 0;
      int c = a.locate(b.line1, b.column1);
      if (c < 0) return 1; else return -1;
    }
  }

  private int line1, line2;
  private int column1, column2;

  public Location(int line, int column) {
    line1 = line2 = line;
    column1 = column2 = column;
  }

  private Location(int l1, int c1, int l2, int c2) {
    line1 = l1; column1 = c1; line2 = l2; column2 = c2;
  }

  public static boolean invalid(Location location) {
    if (location == null) return true;
    if (location.line1 <= 0 || location.line2 <= 0 ||
        location.column1 <= 0 || location.column2 <= 0)
      return true;
    return false;
  }

  public Location normalize() {
    int l1 = line1; int c1 = column1;
    if (l1 <= 0) l1 = 1;
    if (c1 <= 0) c1 = 1;
    Location l = new Location(l1, c1);
    int w = l.locate(line2, column2);
    if (w < 0)
      return l;
    else
      return new Location(l1, c1, line2, column2 <= 0 ? 1 : column2);
  }

  public boolean isPoint() {
    return line1 == line2 && column1 == column2;
  }

  public int startLine() {
    return line1;
  }

  public int startColumn() {
    return column1;
  }

  public int endLine() {
    return line2;
  }

  public int endColumn() {
    return column2;
  }

  // -1 => before this location, 0 => in this location, 1 => after this location
  public int locate(int line, int column) {
    if (line < line1) return -1;
    if (line > line2) return 1;
    if (line == line1 && column < column1) return -1;
    if (line == line2 && column > column2) return 1;
    return 0;
  }

  public static Location merge(Location l1, Location l2) {
    if (l1 == null) return l2;
    else if (l2 == null) return l1;
    else return l1.add(l2);
  }

  public boolean equals(Object o) {
    if (!(o instanceof Location)) return false;
    Location l = (Location) o;
    if (l.line1 == line1 && l.line2 == line2 && l.column1 == column1 && l.column2 == column2)
      return true;
    else
      return false;
  }

  public Location add(Location loc) {
    int test1 = locate(loc.line1, loc.column1);
    int test2 = locate(loc.line2, loc.column2);
    if (test1 >= 0 && test2 <= 0) return this;
    if (test1 <= 0 && test2 >= 0) return loc;
    int l1, l2, c1, c2;
    if (test1 < 0) {
      l1 = loc.line1; c1 = loc.column1;
    } else {
      l1 = line1; c1 = column1;
    }
    if (test2 > 0) {
      l2 = loc.line2; c2 = loc.column2;
    } else {
      l2 = line2; c2 = column2;
    }
    return new Location(l1, c1, l2, c2);
  }

  public Location shift(int deltal, int deltac) {
    if (deltac + column1 < 1) deltac = 1-column1;
    if (deltal + line1 < 1) deltal = 1-line1;
    return new Location(line1+deltal, column1+deltac,
            line2+deltal, column2+deltac);
  }

  public String toString() {
    return ""+line1+":"+column1+"-"+line2+":"+column2;
  }

}
