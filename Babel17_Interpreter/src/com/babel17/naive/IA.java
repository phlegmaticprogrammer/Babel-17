package com.babel17.naive;

public class IA {
    
    public static double nextdouble(double r) {
        if (r < Double.POSITIVE_INFINITY) {
            long bits = Double.doubleToLongBits(r);
            if (r >= 0)
                return Double.longBitsToDouble(bits+1);
            else
                return Double.longBitsToDouble(bits-1);            
        } else return r;
    }
    
    public static double prevdouble(double r) {
        return -nextdouble(-r);
    }
    
}
