package com.babel17.netbeans;

import org.netbeans.modules.parsing.spi.*;
import org.netbeans.modules.parsing.api.*;
import java.util.Collection;

public class Babel17ParserFactory extends ParserFactory {

    @Override
    public Parser createParser (Collection<Snapshot> snapshots) {
        return new Babel17Parser ();
    }
}
