package com.babel17.netbeans;

import org.antlr.runtime.Token;
import org.netbeans.spi.lexer.Lexer;
import org.netbeans.spi.lexer.LexerRestartInfo;
import org.netbeans.api.lexer.PartType;
import com.babel17.antlr.babel17Lexer;

public class Babel17Lexer implements Lexer<Babel17TokenId> {

    private LexerRestartInfo<Babel17TokenId> info;

    private babel17Lexer lexer;

    public Babel17Lexer(LexerRestartInfo<Babel17TokenId> info) {
        this.info = info;
        AntlrCharStream charStream = new AntlrCharStream(info.input(), "Babel17Editor");
        lexer = new babel17Lexer(charStream);
    }

    public org.netbeans.api.lexer.Token<Babel17TokenId> nextToken() {
        Token token = lexer.nextToken();
        if (token.getType() != babel17Lexer.EOF) {
            Babel17TokenId tokenId = Babel17LanguageHierarchy.getToken(token.getType());
            return info.tokenFactory().createToken(tokenId);
        }
        else if (info.input().readLength() > 0)
        {   // we have an incomplete token
            Babel17TokenId tokenId = Babel17LanguageHierarchy.getToken(babel17Lexer.COMMENT1);
            return info.tokenFactory().createToken(tokenId, info.input().readLength(),
                           PartType.MIDDLE);
        }
        return null;
    }

    public Object state() {
        return null;
    }

    public void release() {}
}
