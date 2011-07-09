package com.babel17.java;

import java.util.*;

public class TestClass implements Comparable {
    
    private String message;
    
    public String hello = "hello";
    
    public String hello() {
        return hello;
    }
    
    public static void hello(String msg) {
        System.out.println("hello: "+msg);
    }
    
    public TestClass(int i) {
        message = "int "+i;
    }
    
    public TestClass(String m, int ... u) {
        message = m;
    }
    
    public void print() {
        System.out.println("hey: "+message);
    }
    
    public void print(String s) {
        System.out.println("param: "+message+": "+s);
    }
    
    public void heyThere(ArrayList<String>l) {        
    }
    
    public void varargs(String s, int ... cool) {
        System.out.println("varargs, length = "+cool.length);
    }
        
    
    public String getIt() {
        return message;
    }
    
    public static int zztop(short u) {
        return 10;
    }
    
    public int zztop(int u) {
        return 11;
    }
    
    public String getIt(int u, short v, boolean ... d) {
        return null;
    }
        
    private void dummy(String s) {
        
    }
    
    public static ArrayList<Integer> lengthes(ArrayList<String> f) {
        return null;
    }
    
    public static int WII = 9;
    
    public int compareTo(Object that) {
        return 0;
    }
    
}
