package com.babel17.netbeans;

import org.netbeans.api.lexer.Language;
import org.netbeans.api.lexer.TokenId;

public class Babel17TokenId implements TokenId {

    private static final Language<Babel17TokenId> language =
            new Babel17LanguageHierarchy().language();
    private final String name;
    private final String primaryCategory;
    private final int id;

    public Babel17TokenId(String name, String primaryCategory, int id) {
        this.name = name;
        this.primaryCategory = primaryCategory;
        this.id = id;
    }

    public String primaryCategory() {
        return primaryCategory;
    }

    public int ordinal() {
        return id;
    }

    public String name() {
        return name;
    }

    public static final Language<Babel17TokenId> getLanguage() {
        return language;
    }
}
