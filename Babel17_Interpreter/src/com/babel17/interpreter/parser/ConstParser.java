package com.babel17.interpreter.parser;

import java.math.*;

import com.babel17.syntaxtree.Location;
import com.babel17.syntaxtree.Source;

final class ConstParser {

    static BigInteger str2int(String s) {
        return new java.math.BigInteger(s);
    }

    static BigInteger signedStr2int(String s) {
        int sign = 1;
        int first = 0;
        if (s.charAt(0) == '+')  {
            first = 1;
        } else if (s.charAt(0) == '-') {
            first = 1;
            sign = -1;
        }
        BigInteger x = str2int(s.substring(first));
        if (sign < 0) x = x.negate();
        return x;
    }

    static BigInteger fstr2int(String s, int base) {
        BigInteger num = BigInteger.ZERO;
        for (char c : s.toCharArray()) {
            int digit;
            if (c >= '0' && c <= '9') {
                digit = c - '0';
            } else if (c >= 'A' && c <= 'F') {
                digit = (c - 'A') + 10;
            } else if (c >= 'a' && c <= 'f') {
                digit = (c - 'a') + 10;
            } else {
                throw new RuntimeException("unknown digit '" + c + "'");
            }
            if (digit >= base) {
                throw new RuntimeException("parsing " + s + ": digit " + digit + " is invalid for base " + base);
            }
            num = num.multiply(BigInteger.valueOf(base)).add(BigInteger.valueOf(digit));
        }
        return num;
    }

    static BigInteger num(String s) {
        if (s.startsWith("0x")) {
            return fstr2int(s.substring(2), 16);
        } else if (s.startsWith("0o")) {
            return fstr2int(s.substring(2), 8);
        } else if (s.startsWith("0b")) {
            return fstr2int(s.substring(2), 2);
        } else {
            return fstr2int(s, 10);
        }
    }

    static BigInteger[] decimalFloat(String s) {
        int dot = s.indexOf(".");
        int exp = s.indexOf("e");
        if (exp < 0) exp = s.indexOf("E");
        String mantissa = null;
        String exponent = "0";
        if (dot < 0 && exp < 0) {
            mantissa = s;
        } else if (dot >= 0 && exp < 0) {
            mantissa = s.substring(0, dot) + s.substring(dot + 1);
        } else if (dot < 0 && exp >= 0) {
            mantissa = s.substring(0, exp);
            exponent = s.substring(exp+1);
        } else { // dot >= 0 && exp >= 0
            mantissa = s.substring(0, dot) + s.substring(dot + 1, exp);
            exponent = s.substring(exp+1);
        }
        BigInteger e = signedStr2int(exponent);
        if (dot >= 0)
            e = e.subtract(BigInteger.valueOf(mantissa.length() - dot));
        return new BigInteger[]{str2int(mantissa), e};
    }

    private static class StringParser {

        String v;
        boolean empty;
        int index;
        int pos;
        Source source;

        public StringParser(Source source, String s) {
            v = new String(s);  // do this to protect against the Java 1.5 offsetByCodePoints bug
            empty = v.length() <= 2;
            index = 1;
            pos = 1;
            this.source = source;
        }

        int nextCodePoint() {
            int code = v.codePointAt(index);
            index = v.offsetByCodePoints(index, 1);
            empty = index + 1 >= v.length();
            pos++;
            return code;
        }

        String readString(int len) {
            StringBuffer buf = new StringBuffer();
            for (int i = 0; i < len; i++) {
                buf.appendCodePoint(nextCodePoint());
            }
            return buf.toString();
        }

        StringBuffer buffer = new StringBuffer();

        void addCodePoint(BigInteger _codePoint, int cpos) {
            long codePoint = _codePoint.longValue();
            if (codePoint < 0 || codePoint > 0x10FFFF) {
                throw new ParseException(new Location(source, 1, cpos + 1).
                        add(new Location(source, 1, pos)),
                        "invalid code point " + codePoint);
            } else if (codePoint >= 0xD800 && codePoint < 0xE000) {
                throw new ParseException(new Location(source, 1, cpos + 1).
                        add(new Location(source, 1, pos)),
                        "invalid code point (surrogate char) " + codePoint);
            } else {
                buffer.appendCodePoint((int) codePoint);
            }
        }

        void addCodePoint(int codePoint, int cpos) {
            addCodePoint(BigInteger.valueOf(codePoint), cpos);
        }

        String parse() {
            while (!empty) {
                int cpos = pos;
                int codePoint = nextCodePoint();
                if (codePoint == '\\') {
                    switch (codePoint = nextCodePoint()) {
                        case 'u':
                            addCodePoint(fstr2int(readString(4), 16), cpos);
                            break;
                        case 'U':
                            addCodePoint(fstr2int(readString(8), 16), cpos);
                            break;
                        case '\\':
                            addCodePoint(0x5C, cpos);
                            break;
                        case '"':
                            addCodePoint(0x22, cpos);
                            break;
                        case 'n':
                            addCodePoint(10, cpos);
                            break;
                        case 'r':
                            addCodePoint(13, cpos);
                            break;
                        default:
                            throw new ParseException(new Location(source, 1, pos - 1).
                                    add(new Location(source, 1, pos + 1)),
                                    "unknown escape character (codepoint = " + codePoint + ")");
                    }
                } else {
                    addCodePoint(codePoint, cpos);
                }
            }
            return buffer.toString();

        }
    }

    public static String string(Source source, String s) {
        StringParser p = new StringParser(source, s);
        return p.parse();
    }
}
