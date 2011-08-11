package com.babel17.java.io;

import java.io.IOException;
import java.io.Reader;

public class Utils {
  
  public static String fromChar(char c) {
    return String.valueOf(c);
  }
  
  public static String readLine(Reader r) throws IOException {
    StringBuffer buf = new StringBuffer();
    int prevc = -1;
    do {
      int c = r.read();
      if (c < 0) {
        if (prevc == -1) return null;
        else return buf.toString();
      } else if (c == '\n') {
        if (prevc == '\r') buf.deleteCharAt(buf.length()-1);
        return buf.toString();
      } else {
        buf.append((char) c);
        prevc = c;
      }
    } while (true);
  }
  
}
