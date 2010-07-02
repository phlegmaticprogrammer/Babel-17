package com.babel17.netbeans;

import org.netbeans.spi.lexer.LanguageHierarchy;
import org.netbeans.spi.lexer.Lexer;
import org.netbeans.spi.lexer.LexerRestartInfo;

import java.util.*;

public class Babel17LanguageHierarchy extends LanguageHierarchy<Babel17TokenId> {

    private static List<Babel17TokenId> tokens = new ArrayList<Babel17TokenId>();
    private static Map<Integer, Babel17TokenId> idToToken = new HashMap<Integer, Babel17TokenId>();

    static {
        TokenType[] tokenTypes = TokenType.values();
        for (TokenType tokenType : tokenTypes) {
            tokens.add(new Babel17TokenId(tokenType.name(), tokenType.category, tokenType.id));
        }
        for (Babel17TokenId token : tokens) {
            idToToken.put(token.ordinal(), token);
        }
    }

    static synchronized Babel17TokenId getToken(int id) {
        return idToToken.get(id);
    }

    protected synchronized Collection<Babel17TokenId> createTokenIds() {
        return tokens;
    }

    protected synchronized Lexer<Babel17TokenId> createLexer(LexerRestartInfo<Babel17TokenId> info) {
        return new Babel17Lexer(info);
    }

    protected String mimeType() {
        return "text/x-babel17";
    }
}
