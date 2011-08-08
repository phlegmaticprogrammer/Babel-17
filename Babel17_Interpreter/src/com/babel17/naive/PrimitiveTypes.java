package com.babel17.naive;

import java.lang.reflect.*;

public class PrimitiveTypes {
    
    public static Class byte_class = byte.class;
    public static Class short_class = short.class;
    public static Class int_class = int.class;
    public static Class long_class = long.class;
    public static Class char_class = char.class;
    public static Class float_class = float.class;
    public static Class double_class = double.class;
    public static Class boolean_class = boolean.class;
    public static Class string_class = String.class;
    public static Class object_class = Object.class;
    
    public static Class Byte_class = Byte.class;
    public static Class Short_class = Short.class;
    public static Class Int_class = Integer.class;
    public static Class Long_class = Long.class;
    public static Class Char_class = Character.class;
    public static Class Float_class = Float.class;
    public static Class Double_class = Double.class;
    public static Class Boolean_class = Boolean.class;

    
    public static void main(String args[]) {
      Object arr = Array.newInstance(byte_class, 10);
      for (int i=0; i<10; i++) {
        Byte b = (byte) (i*i);
        Array.set(arr, i, b);
      }
      testBytes((byte[]) arr);
    }
    
    static void testBytes(byte[] b) {
      System.out.print("cool: ");
      for (int i=0; i<b.length; i++) System.out.print(b[i]+" ");
      System.out.println("");
    }
    
}
