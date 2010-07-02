package com.babel17.interpreter;

import com.babel17.interpreter.parser.Parser;
import com.babel17.interpreter.parser.SemanticAnalysis;
import com.babel17.interpreter.parser.ErrorMessage;
import java.io.*;
import com.babel17.syntaxtree.*;

public class Examples {

  public static void main(String args[]) throws Exception {
    File exampledir = new File("/Users/stevenobua/NetbeansProjects/Babel17 Interpreter/src/net/babel17/examples");
    File f = new File(exampledir, "basic/fib.b17");
    //Parser.lexit(f.toString());

    Parser.ParseResult r = Parser.parse(f.toString());
    if (r.node() != null) {
      r.node().print(0);
    }
    System.out.println("-------------------");

    Reader reader = new InputStreamReader(new FileInputStream(f), "UTF-8");
    java.util.Collection<ErrorMessage> errors =
            SemanticAnalysis.parseAndAnalyze(reader);
    for (ErrorMessage e : errors)
        System.out.println("  " + e);
    if (errors.size() == 0)
      System.out.println("This is a valid Babel-17 program.");
  }
}
