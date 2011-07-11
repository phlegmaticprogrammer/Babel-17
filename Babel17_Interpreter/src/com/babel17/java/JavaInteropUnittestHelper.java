package com.babel17.java;

import java.math.BigInteger;

public class JavaInteropUnittestHelper {
    
    public static int A = 2;
    public static int B = 2;
    
    private String msg;
    private int[] args;
    
    public JavaInteropUnittestHelper(String msg, int ... args) {
        this.msg = msg;
        this.args = args;
    }
    
    public int B() {
        return 3;
    }
    
    public int[] pick(int ... indices) {
        int[] j = new int[indices.length];
        for (int i=0; i<j.length; i++)
            j[i] = args[indices[i]];
        return j;
    }
    
    public String msg() {
        return msg;
    }
    
    public static BigInteger A_mul(int x) {
        BigInteger y = new BigInteger(""+x);
        return y.multiply(new BigInteger(""+A));
    }
    
    public short id_short(short x) {
        return x;
    }
    
    public byte id_byte(byte x) {
        return x;
    }
    
    public int id_int(int x) {
        return x;
    }
    
    public Integer id_integer(Integer x) {
        return x;
    }
    
    public void nothing() {        
    }
    
    public int crash() {
        throw new RuntimeException("crash, please catch it");
    }
    
    public long id_long(long x) {
        return x;
    }
    
    public int add_them(int u, int v) {
        return u+v;
    }
    
    public boolean id_boolean(boolean x) {
        return x;
    }
    
    public char id_char(char c) {
        return c;
    }
    
    public BigInteger id_bigint(BigInteger x) {
        return x;
    }
    
    
    public String id_string(String s) {
        return s;
    }
    
    public String nil_string(String s) {
        return null;
    }
    
    public String[] modify_array(String x[]) {
        for (int i=0; i<x.length; i++) {
            if (i % 2 == 0) x[i] = null;
            else x[i] = (""+i);
        }
        return x;
    }
    
    public static class Inner {
        
        public final static int Q = 12;
        
        public enum direction {NORTH, SOUTH, EAST, WEST};
        
        public final static direction main_direction = direction.SOUTH;
        
    }
    
}
