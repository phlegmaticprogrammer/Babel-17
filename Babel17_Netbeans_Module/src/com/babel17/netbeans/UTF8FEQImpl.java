package com.babel17.netbeans;

import org.netbeans.spi.queries.FileEncodingQueryImplementation;
import java.nio.charset.Charset;
import org.openide.filesystems.FileObject;

public class UTF8FEQImpl extends FileEncodingQueryImplementation {
    
    public Charset getEncoding(FileObject file) {
        return Charset.forName("UTF-8");
    }
    
}
