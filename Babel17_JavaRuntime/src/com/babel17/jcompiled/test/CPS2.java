package com.babel17.jcompiled.test;

public class CPS2 {

    public abstract static class Unwind extends RuntimeException {
        public abstract Object compute();
        public Object force() {
            Unwind w = this;
            do {
                try {
                    return w.compute();
                } catch (Unwind unwind) {
                    w = unwind;
                }
            } while (true);
        }
    }

    public static class Continuation {
        public Object apply(Object result) {
            return result;
        }
    }

    public static Object even(final int n, final Continuation c) {
        try {
            if (n == 0) return c.apply(true);
            else return odd(n-1, c);
        } catch (StackOverflowError x) {
            throw new Unwind()  {
                public Object compute() {
                    return even(n, c);
                }
            };
        }
    }

    public static Object odd(final int n, final Continuation c) {
        try {
            if (n == 0) return c.apply(false);
            else return even(n-1, c);
        } catch (StackOverflowError x) {
            return new Unwind() {
                public Object compute() {
                    return odd(n, c);
                }
            };
        }
    }


    public static void main(String args[]) {
        long time1 = System.currentTimeMillis();
        Unwind w = new Unwind() {
            public Object compute() {
                return even(100000000, new Continuation());
            }
        };
        Object b = w.force();
        long time2 = System.currentTimeMillis();
        System.out.println("time = "+(time2-time1)+", result = "+b);
    }

}
