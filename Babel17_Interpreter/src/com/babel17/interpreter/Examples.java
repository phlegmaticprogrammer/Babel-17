package com.babel17.interpreter;

import com.babel17.interpreter.parser.Parser;
import com.babel17.interpreter.parser.ErrorMessage;
import java.io.*;
import com.babel17.syntaxtree.*;

public class Examples {

  public static void main(String args[]) throws Exception {
 /*   File exampledir = new File("/Users/stevenobua/Programming/babel-17/Babel17_Interpreter/src/com/babel17/examples");
    File f = new File(exampledir, "basic/test.b17");
    //Parser.lexit(f.toString());

    Parser.ParseResult r = Parser.parse(f.toString());
    if (r.node() != null) {
      r.node().print(0);
    }
    System.out.println("-------------------");

    Reader reader = new InputStreamReader(new FileInputStream(f), "UTF-8");
    java.util.Collection<ErrorMessage> errors =
            SemanticAnalysis.parseAndAnalyze(reader, true);
    for (ErrorMessage e : errors)
        System.out.println("  " + e);
    if (errors.size() == 0)
      System.out.println("This is a valid Babel-17 program.");   */
  }

  public static Node mini_frontend(String path) throws Exception {
   /* File f = new File(path);
    Reader reader = new InputStreamReader(new FileInputStream(f), "UTF-8");
    SemanticAnalysis.Result result =
            SemanticAnalysis.doAnalysis(reader, true);
    for (ErrorMessage e : result.errors)
        System.out.println("  " + e);
    if (result.errors.isEmpty()) return result.node;
    else return null;  */
      return null;
  }
  
}
