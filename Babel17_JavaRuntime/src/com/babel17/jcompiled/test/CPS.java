package com.babel17.jcompiled.test;

public class CPS {

    public static class Thunk {
        final Object r;
        final boolean isDelayed;
        public Object force() {
            Thunk t = this;
            while (t.isDelayed)
                t = t.compute();
            return t.r;
        }
        public Thunk compute() {
            return this;
        }
        public Thunk(Object answer) {
            isDelayed = false;
            r = answer;
        }
        public Thunk() {
            isDelayed = true;
            r = null;
        }
    }

    public static class Continuation {
        public Thunk apply(Object result) {
            return new Thunk(result);
        }
    }

    public static Thunk even(final int n, final Continuation c) {
        try {
            if (n == 0) return c.apply(true);
            else return odd(n-1, c);
        } catch (StackOverflowError x) {
            return new Thunk() {
                public Thunk compute() {
                    return even(n, c);
                }
            };
        }
    }

    public static Thunk odd(final int n, final Continuation c) {
        try {
            if (n == 0) return c.apply(false);
            else return even(n-1, c);
        } catch (StackOverflowError x) {
            return new Thunk() {
                public Thunk compute() {
                    return odd(n, c);
                }
            };
        }
    }


    public static void main(String args[]) {
        long time1 = System.currentTimeMillis();
        Object b =  even(100000000, new Continuation()).force();
        long time2 = System.currentTimeMillis();
        System.out.println("time = "+(time2-time1)+", result = "+b);
    }

}
