package com.babel17.java;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Member;
import static java.lang.System.out;
import com.google.appengine.api.datastore.*;

public class TestReflection {

    public static void main(String args[]) throws Exception {
        //Class c = Class.forName("java.util.ArrayList");
        //Class c = Class.forName("com.babel17.java.TestClass");
        Class c = Class.forName("com.babel17.java.JavaInteropUnittestHelper$Inner");
        //Class c = Class.forName("com.google.appengine.api.datastore.Query");
        /*Constructor constr = c.getConstructor(new Class[]{int.class});
        Method m = c.getMethod("varargs", new Class[]{String.class, int[].class});
        Object o = constr.newInstance(new Object[]{new Integer(12)});
        m.invoke(o, "hello", new int[] {7, 4, 9, 12, 34, new Integer(33)});   */
        printMembers(c.getConstructors(), "Constructors");
        printMembers(c.getFields(), "Fields");
        printMembers(c.getMethods(), "Methods");
        printClasses(c);
    }

    private static void printMembers(Member[] mbrs, String s) {
        out.format("%s:%n", s);
        for (Member mbr : mbrs) {
            if (mbr instanceof Field) {
                out.format("  %s%n", ((Field) mbr).toGenericString());
            } else if (mbr instanceof Constructor) {
                out.format("  %s%n", ((Constructor) mbr).toGenericString());
            } else if (mbr instanceof Method) {
                out.format("  %s%n", ((Method) mbr).toGenericString());
            }
            out.format("  %s%n", mbr.getName());
        }
        if (mbrs.length == 0) {
            out.format("  -- No %s --%n", s);
        }
        out.format("%n");
    }

    private static void printClasses(Class<?> c) {
        out.format("Classes:%n");
        Class<?>[] clss = c.getClasses();
        for (Class<?> cls : clss) {
            out.format("  %s%n", cls.getName());
            
        }
        if (clss.length == 0) {
            out.format("  -- No member interfaces, classes, or enums --%n");
        }
        out.format("%n");
    }
}
