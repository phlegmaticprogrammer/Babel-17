package com.babel17.syntaxtree;

import java.io.File;

public class Source implements Comparable<Source> {

    public final static Source system = new Source("");

    private final String filename;

    public Source(String s) {
        if (s == null)
            filename = "";
        else
            filename = s;
    }

    public int compareTo(Source s) {
        return filename.compareTo(s.filename);
    }

    public String getFilename() {
        return filename;
    }

    public String toString() {
        int maxlength = 50;
        String f = getFilename();
        if (f.length() <= maxlength) return f;
        int i1 = f.lastIndexOf("/");
        int i2 = f.lastIndexOf("\\");
        int i = i1;
        if (i2 > i) i = i2;
        if (i <= 0) return f;
        return "..."+f.substring(i);
    }

}
