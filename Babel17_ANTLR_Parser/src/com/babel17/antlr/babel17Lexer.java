// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g 2010-12-09 06:34:56

package com.babel17.antlr;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class babel17Lexer extends Lexer {
    public static final int L_end=49;
    public static final int U_AND=102;
    public static final int U_NOT_EQUAL=85;
    public static final int TIMESTIMES=106;
    public static final int BigLetter=44;
    public static final int ROUND_BRACKET_CLOSE=129;
    public static final int L_mod=81;
    public static final int A_OR=98;
    public static final int MINUSMINUS=109;
    public static final int Newline=40;
    public static final int SQUARE_BRACKET_CLOSE=131;
    public static final int MAP_OR_SET_OR_OBJ=14;
    public static final int EOF=-1;
    public static final int U_DOUBLE_ARROW=111;
    public static final int L_exception=66;
    public static final int GREATER=89;
    public static final int Num=125;
    public static final int EMPTY_MAP=15;
    public static final int POW=24;
    public static final int L_concurrent=71;
    public static final int L_false=76;
    public static final int QUOTIENTQUOTIENT=107;
    public static final int L_nil=79;
    public static final int L_with=51;
    public static final int LIST_CONS=10;
    public static final int BEGIN=28;
    public static final int LESS=86;
    public static final int QUESTION_MARK=118;
    public static final int SQUARE_LIST=8;
    public static final int ROUND_BRACKET_OPEN=128;
    public static final int VAL=30;
    public static final int L_as=62;
    public static final int MESSAGE_SEND=22;
    public static final int NL=122;
    public static final int A_ARROW=112;
    public static final int COMMENT=42;
    public static final int A_DOUBLE_COLON=104;
    public static final int L_def=64;
    public static final int A_AND=99;
    public static final int EXCEPTION=16;
    public static final int L_this=77;
    public static final int L_force=119;
    public static final int L_choose=72;
    public static final int PERIOD=116;
    public static final int SmallLetter=43;
    public static final int NIL_TOKEN=5;
    public static final int PRAGMA_PRINT=136;
    public static final int CURLY_BRACKET_OPEN=132;
    public static final int UNDERSCORE=134;
    public static final int MATCH=17;
    public static final int U_LESS_EQ=88;
    public static final int MEM_STRONG=37;
    public static final int L_to=67;
    public static final int WS=121;
    public static final int Charcode=126;
    public static final int L_do=58;
    public static final int L_val=63;
    public static final int L_match=60;
    public static final int L_obj=50;
    public static final int WsChar=120;
    public static final int Hex=47;
    public static final int L_for=57;
    public static final int Letter=45;
    public static final int PRAGMA_ASSERT=137;
    public static final int APPLY=12;
    public static final int U_ARROW=113;
    public static final int PRAGMA_LOG=135;
    public static final int L_else=54;
    public static final int A_EQUAL=82;
    public static final int DEF=34;
    public static final int L_begin=48;
    public static final int U_NOT=103;
    public static final int L_yield=59;
    public static final int L_div=80;
    public static final int PLUSPLUS=108;
    public static final int L_while=56;
    public static final int CASES=18;
    public static final int POW_tok=97;
    public static final int IF_PATTERN=39;
    public static final int A_ELLIPSIS=114;
    public static final int PARENTS_PLUS=25;
    public static final int A_DOUBLE_ARROW=110;
    public static final int SQUARE_BRACKET_OPEN=130;
    public static final int IF=13;
    public static final int PROG=4;
    public static final int U_OR=101;
    public static final int COMMA=117;
    public static final int OBJ=19;
    public static final int MEMOIZE=36;
    public static final int U_ELLIPSIS=115;
    public static final int YIELD=35;
    public static final int COMPARE=11;
    public static final int U_GREATER_EQ=91;
    public static final int U_EQUAL=83;
    public static final int PLUS=93;
    public static final int LAMBDA=7;
    public static final int String=127;
    public static final int L_true=75;
    public static final int A_infinity=69;
    public static final int Id=124;
    public static final int WITH=29;
    public static final int L_in=65;
    public static final int A_NOT=100;
    public static final int L_lazy=73;
    public static final int L_then=53;
    public static final int NotNewline=41;
    public static final int QUOTIENT=96;
    public static final int L_if=52;
    public static final int FOR_EXPR=20;
    public static final int UMINUS=23;
    public static final int CURLY_BRACKET_CLOSE=133;
    public static final int Constr=123;
    public static final int WHILE_DO=21;
    public static final int L_elseif=55;
    public static final int MINUS=94;
    public static final int Digit=46;
    public static final int L_memoize=74;
    public static final int MEM_WEAK=38;
    public static final int A_GREATER_EQ=90;
    public static final int ROUND_LIST=9;
    public static final int SC=92;
    public static final int PRAGMA_PROFILE=138;
    public static final int L_downto=68;
    public static final int ANY=6;
    public static final int L_random=78;
    public static final int A_NOT_EQUAL=84;
    public static final int BLOCK=27;
    public static final int ASSIGN=32;
    public static final int OBJELEM_ASSIGN=31;
    public static final int U_DOUBLE_COLON=105;
    public static final int ARROW=33;
    public static final int L_case=61;
    public static final int TIMES=95;
    public static final int U_infinity=70;
    public static final int A_LESS_EQ=87;
    public static final int PARENTS_MUL=26;


    public boolean errorDuringLexing = false;
    public ArrayList<RecognitionException> lexingErrors = new ArrayList<RecognitionException>();

    @Override
    public void reportError(RecognitionException e) {
      errorDuringLexing = true;
      lexingErrors.add(e);
    }


    // delegates
    // delegators

    public babel17Lexer() {;} 
    public babel17Lexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public babel17Lexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g"; }

    // $ANTLR start "Newline"
    public final void mNewline() throws RecognitionException {
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:109:9: ( ( '\\u000A' | '\\u000D' | '\\u0085' | '\\u000C' | '\\u2028' | '\\u2029' ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:109:11: ( '\\u000A' | '\\u000D' | '\\u0085' | '\\u000C' | '\\u2028' | '\\u2029' )
            {
            if ( input.LA(1)=='\n'||(input.LA(1)>='\f' && input.LA(1)<='\r')||input.LA(1)=='\u0085'||(input.LA(1)>='\u2028' && input.LA(1)<='\u2029') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "Newline"

    // $ANTLR start "NotNewline"
    public final void mNotNewline() throws RecognitionException {
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:113:2: (~ ( '\\u000A' | '\\u000D' | '\\u0085' | '\\u000C' | '\\u2028' | '\\u2029' ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:113:4: ~ ( '\\u000A' | '\\u000D' | '\\u0085' | '\\u000C' | '\\u2028' | '\\u2029' )
            {
            if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||input.LA(1)=='\u000B'||(input.LA(1)>='\u000E' && input.LA(1)<='\u0084')||(input.LA(1)>='\u0086' && input.LA(1)<='\u2027')||(input.LA(1)>='\u202A' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "NotNewline"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:115:8: ( '/*' ( ( options {greedy=false; } : . )* '*/' ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:115:10: '/*' ( ( options {greedy=false; } : . )* '*/' )
            {
            match("/*"); 

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:115:15: ( ( options {greedy=false; } : . )* '*/' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:115:16: ( options {greedy=false; } : . )* '*/'
            {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:115:16: ( options {greedy=false; } : . )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='*') ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1=='/') ) {
                        alt1=2;
                    }
                    else if ( ((LA1_1>='\u0000' && LA1_1<='.')||(LA1_1>='0' && LA1_1<='\uFFFF')) ) {
                        alt1=1;
                    }


                }
                else if ( ((LA1_0>='\u0000' && LA1_0<=')')||(LA1_0>='+' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:115:43: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match("*/"); 


            }

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "SmallLetter"
    public final void mSmallLetter() throws RecognitionException {
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:120:2: ( 'a' .. 'z' | '\\u00E4' | '\\u00FC' | '\\u00F6' | '\\u00DF' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:
            {
            if ( (input.LA(1)>='a' && input.LA(1)<='z')||input.LA(1)=='\u00DF'||input.LA(1)=='\u00E4'||input.LA(1)=='\u00F6'||input.LA(1)=='\u00FC' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "SmallLetter"

    // $ANTLR start "BigLetter"
    public final void mBigLetter() throws RecognitionException {
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:124:2: ( 'A' .. 'Z' | '\\u00C4' | '\\u00DC' | '\\u00D6' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='\u00C4'||input.LA(1)=='\u00D6'||input.LA(1)=='\u00DC' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "BigLetter"

    // $ANTLR start "Letter"
    public final void mLetter() throws RecognitionException {
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:127:8: ( SmallLetter | BigLetter )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z')||input.LA(1)=='\u00C4'||input.LA(1)=='\u00D6'||input.LA(1)=='\u00DC'||input.LA(1)=='\u00DF'||input.LA(1)=='\u00E4'||input.LA(1)=='\u00F6'||input.LA(1)=='\u00FC' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "Letter"

    // $ANTLR start "Digit"
    public final void mDigit() throws RecognitionException {
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:131:8: ( '0' .. '9' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:131:10: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "Digit"

    // $ANTLR start "Hex"
    public final void mHex() throws RecognitionException {
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:134:6: ( Digit | 'A' .. 'F' | 'a' .. 'f' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "Hex"

    // $ANTLR start "L_begin"
    public final void mL_begin() throws RecognitionException {
        try {
            int _type = L_begin;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:137:9: ( 'begin' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:137:11: 'begin'
            {
            match("begin"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "L_begin"

    // $ANTLR start "L_end"
    public final void mL_end() throws RecognitionException {
        try {
            int _type = L_end;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:138:8: ( 'end' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:138:10: 'end'
            {
            match("end"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "L_end"

    // $ANTLR start "L_obj"
    public final void mL_obj() throws RecognitionException {
        try {
            int _type = L_obj;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:140:8: ( 'object' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:140:10: 'object'
            {
            match("object"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "L_obj"

    // $ANTLR start "L_with"
    public final void mL_with() throws RecognitionException {
        try {
            int _type = L_with;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:141:8: ( 'with' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:141:10: 'with'
            {
            match("with"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "L_with"

    // $ANTLR start "L_if"
    public final void mL_if() throws RecognitionException {
        try {
            int _type = L_if;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:143:7: ( 'if' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:143:10: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "L_if"

    // $ANTLR start "L_then"
    public final void mL_then() throws RecognitionException {
        try {
            int _type = L_then;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:144:9: ( 'then' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:144:11: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "L_then"

    // $ANTLR start "L_else"
    public final void mL_else() throws RecognitionException {
        try {
            int _type = L_else;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:145:8: ( 'else' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:145:10: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "L_else"

    // $ANTLR start "L_elseif"
    public final void mL_elseif() throws RecognitionException {
        try {
            int _type = L_elseif;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:147:2: ( 'elseif' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:147:4: 'elseif'
            {
            match("elseif"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "L_elseif"

    // $ANTLR start "L_while"
    public final void mL_while() throws RecognitionException {
        try {
            int _type = L_while;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:149:9: ( 'while' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:149:11: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "L_while"

    // $ANTLR start "L_for"
    public final void mL_for() throws RecognitionException {
        try {
            int _type = L_for;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:150:7: ( 'for' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:150:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "L_for"

    // $ANTLR start "L_do"
    public final void mL_do() throws RecognitionException {
        try {
            int _type = L_do;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:151:6: ( 'do' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:151:8: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "L_do"

    // $ANTLR start "L_yield"
    public final void mL_yield() throws RecognitionException {
        try {
            int _type = L_yield;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:152:9: ( 'yield' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:152:11: 'yield'
            {
            match("yield"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "L_yield"

    // $ANTLR start "L_match"
    public final void mL_match() throws RecognitionException {
        try {
            int _type = L_match;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:153:9: ( 'match' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:153:11: 'match'
            {
            match("match"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "L_match"

    // $ANTLR start "L_case"
    public final void mL_case() throws RecognitionException {
        try {
            int _type = L_case;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:154:8: ( 'case' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:154:10: 'case'
            {
            match("case"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "L_case"

    // $ANTLR start "L_as"
    public final void mL_as() throws RecognitionException {
        try {
            int _type = L_as;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:155:6: ( 'as' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:155:8: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "L_as"

    // $ANTLR start "L_val"
    public final void mL_val() throws RecognitionException {
        try {
            int _type = L_val;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:156:7: ( 'val' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:156:9: 'val'
            {
            match("val"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "L_val"

    // $ANTLR start "L_def"
    public final void mL_def() throws RecognitionException {
        try {
            int _type = L_def;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:157:7: ( 'def' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:157:9: 'def'
            {
            match("def"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "L_def"

    // $ANTLR start "L_in"
    public final void mL_in() throws RecognitionException {
        try {
            int _type = L_in;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:158:6: ( 'in' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:158:8: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "L_in"

    // $ANTLR start "L_exception"
    public final void mL_exception() throws RecognitionException {
        try {
            int _type = L_exception;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:160:2: ( 'exception' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:160:4: 'exception'
            {
            match("exception"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "L_exception"

    // $ANTLR start "L_to"
    public final void mL_to() throws RecognitionException {
        try {
            int _type = L_to;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:161:7: ( 'to' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:161:10: 'to'
            {
            match("to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "L_to"

    // $ANTLR start "L_downto"
    public final void mL_downto() throws RecognitionException {
        try {
            int _type = L_downto;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:163:2: ( 'downto' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:163:4: 'downto'
            {
            match("downto"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "L_downto"

    // $ANTLR start "A_infinity"
    public final void mA_infinity() throws RecognitionException {
        try {
            int _type = A_infinity;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:166:2: ( 'infinity' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:166:4: 'infinity'
            {
            match("infinity"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "A_infinity"

    // $ANTLR start "U_infinity"
    public final void mU_infinity() throws RecognitionException {
        try {
            int _type = U_infinity;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:168:2: ( '\\u221E' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:168:4: '\\u221E'
            {
            match('\u221E'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "U_infinity"

    // $ANTLR start "L_concurrent"
    public final void mL_concurrent() throws RecognitionException {
        try {
            int _type = L_concurrent;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:173:2: ( 'concurrent' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:173:4: 'concurrent'
            {
            match("concurrent"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "L_concurrent"

    // $ANTLR start "L_choose"
    public final void mL_choose() throws RecognitionException {
        try {
            int _type = L_choose;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:176:2: ( 'choose' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:176:4: 'choose'
            {
            match("choose"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "L_choose"

    // $ANTLR start "L_lazy"
    public final void mL_lazy() throws RecognitionException {
        try {
            int _type = L_lazy;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:178:8: ( 'lazy' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:178:10: 'lazy'
            {
            match("lazy"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "L_lazy"

    // $ANTLR start "L_memoize"
    public final void mL_memoize() throws RecognitionException {
        try {
            int _type = L_memoize;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:181:2: ( 'memoize' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:181:4: 'memoize'
            {
            match("memoize"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "L_memoize"

    // $ANTLR start "L_true"
    public final void mL_true() throws RecognitionException {
        try {
            int _type = L_true;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:183:8: ( 'true' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:183:10: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "L_true"

    // $ANTLR start "L_false"
    public final void mL_false() throws RecognitionException {
        try {
            int _type = L_false;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:184:9: ( 'false' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:184:11: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "L_false"

    // $ANTLR start "L_this"
    public final void mL_this() throws RecognitionException {
        try {
            int _type = L_this;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:186:8: ( 'this' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:186:10: 'this'
            {
            match("this"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "L_this"

    // $ANTLR start "L_random"
    public final void mL_random() throws RecognitionException {
        try {
            int _type = L_random;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:188:9: ( 'random' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:188:11: 'random'
            {
            match("random"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "L_random"

    // $ANTLR start "L_nil"
    public final void mL_nil() throws RecognitionException {
        try {
            int _type = L_nil;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:190:7: ( 'nil' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:190:9: 'nil'
            {
            match("nil"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "L_nil"

    // $ANTLR start "L_div"
    public final void mL_div() throws RecognitionException {
        try {
            int _type = L_div;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:192:8: ( 'div' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:192:11: 'div'
            {
            match("div"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "L_div"

    // $ANTLR start "L_mod"
    public final void mL_mod() throws RecognitionException {
        try {
            int _type = L_mod;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:194:8: ( 'mod' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:194:10: 'mod'
            {
            match("mod"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "L_mod"

    // $ANTLR start "A_EQUAL"
    public final void mA_EQUAL() throws RecognitionException {
        try {
            int _type = A_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:198:9: ( '==' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:198:11: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "A_EQUAL"

    // $ANTLR start "U_EQUAL"
    public final void mU_EQUAL() throws RecognitionException {
        try {
            int _type = U_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:200:9: ( '\\u2261' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:200:11: '\\u2261'
            {
            match('\u2261'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "U_EQUAL"

    // $ANTLR start "A_NOT_EQUAL"
    public final void mA_NOT_EQUAL() throws RecognitionException {
        try {
            int _type = A_NOT_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:206:2: ( '!=' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:206:4: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "A_NOT_EQUAL"

    // $ANTLR start "U_NOT_EQUAL"
    public final void mU_NOT_EQUAL() throws RecognitionException {
        try {
            int _type = U_NOT_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:208:2: ( '\\u2262' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:208:4: '\\u2262'
            {
            match('\u2262'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "U_NOT_EQUAL"

    // $ANTLR start "LESS"
    public final void mLESS() throws RecognitionException {
        try {
            int _type = LESS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:213:6: ( '<' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:213:8: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LESS"

    // $ANTLR start "A_LESS_EQ"
    public final void mA_LESS_EQ() throws RecognitionException {
        try {
            int _type = A_LESS_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:216:2: ( '<=' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:216:4: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "A_LESS_EQ"

    // $ANTLR start "U_LESS_EQ"
    public final void mU_LESS_EQ() throws RecognitionException {
        try {
            int _type = U_LESS_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:218:2: ( '\\u2264' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:218:4: '\\u2264'
            {
            match('\u2264'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "U_LESS_EQ"

    // $ANTLR start "GREATER"
    public final void mGREATER() throws RecognitionException {
        try {
            int _type = GREATER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:223:9: ( '>' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:223:11: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GREATER"

    // $ANTLR start "A_GREATER_EQ"
    public final void mA_GREATER_EQ() throws RecognitionException {
        try {
            int _type = A_GREATER_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:226:2: ( '>=' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:226:4: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "A_GREATER_EQ"

    // $ANTLR start "U_GREATER_EQ"
    public final void mU_GREATER_EQ() throws RecognitionException {
        try {
            int _type = U_GREATER_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:228:2: ( '\\u2265' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:228:4: '\\u2265'
            {
            match('\u2265'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "U_GREATER_EQ"

    // $ANTLR start "SC"
    public final void mSC() throws RecognitionException {
        try {
            int _type = SC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:232:4: ( ';' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:232:6: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SC"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:234:6: ( '+' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:234:8: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:235:7: ( '-' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:235:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "TIMES"
    public final void mTIMES() throws RecognitionException {
        try {
            int _type = TIMES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:236:7: ( '*' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:236:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TIMES"

    // $ANTLR start "QUOTIENT"
    public final void mQUOTIENT() throws RecognitionException {
        try {
            int _type = QUOTIENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:237:9: ( '/' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:237:11: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QUOTIENT"

    // $ANTLR start "POW_tok"
    public final void mPOW_tok() throws RecognitionException {
        try {
            int _type = POW_tok;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:238:9: ( '^' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:238:11: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "POW_tok"

    // $ANTLR start "A_OR"
    public final void mA_OR() throws RecognitionException {
        try {
            int _type = A_OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:240:6: ( '|' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:240:8: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "A_OR"

    // $ANTLR start "A_AND"
    public final void mA_AND() throws RecognitionException {
        try {
            int _type = A_AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:241:7: ( '&' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:241:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "A_AND"

    // $ANTLR start "A_NOT"
    public final void mA_NOT() throws RecognitionException {
        try {
            int _type = A_NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:242:7: ( '!' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:242:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "A_NOT"

    // $ANTLR start "U_OR"
    public final void mU_OR() throws RecognitionException {
        try {
            int _type = U_OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:243:6: ( '\\u2228' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:243:8: '\\u2228'
            {
            match('\u2228'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "U_OR"

    // $ANTLR start "U_AND"
    public final void mU_AND() throws RecognitionException {
        try {
            int _type = U_AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:244:7: ( '\\u2227' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:244:9: '\\u2227'
            {
            match('\u2227'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "U_AND"

    // $ANTLR start "U_NOT"
    public final void mU_NOT() throws RecognitionException {
        try {
            int _type = U_NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:245:7: ( '\\u00AC' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:245:9: '\\u00AC'
            {
            match('\u00AC'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "U_NOT"

    // $ANTLR start "A_DOUBLE_COLON"
    public final void mA_DOUBLE_COLON() throws RecognitionException {
        try {
            int _type = A_DOUBLE_COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:254:2: ( '::' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:254:4: '::'
            {
            match("::"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "A_DOUBLE_COLON"

    // $ANTLR start "U_DOUBLE_COLON"
    public final void mU_DOUBLE_COLON() throws RecognitionException {
        try {
            int _type = U_DOUBLE_COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:256:2: ( '\\u2237' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:256:4: '\\u2237'
            {
            match('\u2237'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "U_DOUBLE_COLON"

    // $ANTLR start "TIMESTIMES"
    public final void mTIMESTIMES() throws RecognitionException {
        try {
            int _type = TIMESTIMES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:261:2: ( '**' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:261:4: '**'
            {
            match("**"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TIMESTIMES"

    // $ANTLR start "QUOTIENTQUOTIENT"
    public final void mQUOTIENTQUOTIENT() throws RecognitionException {
        try {
            int _type = QUOTIENTQUOTIENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:263:2: ( '//' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:263:4: '//'
            {
            match("//"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QUOTIENTQUOTIENT"

    // $ANTLR start "PLUSPLUS"
    public final void mPLUSPLUS() throws RecognitionException {
        try {
            int _type = PLUSPLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:265:2: ( '++' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:265:4: '++'
            {
            match("++"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUSPLUS"

    // $ANTLR start "MINUSMINUS"
    public final void mMINUSMINUS() throws RecognitionException {
        try {
            int _type = MINUSMINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:268:2: ( '--' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:268:4: '--'
            {
            match("--"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MINUSMINUS"

    // $ANTLR start "A_DOUBLE_ARROW"
    public final void mA_DOUBLE_ARROW() throws RecognitionException {
        try {
            int _type = A_DOUBLE_ARROW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:271:2: ( '=>' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:271:4: '=>'
            {
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "A_DOUBLE_ARROW"

    // $ANTLR start "U_DOUBLE_ARROW"
    public final void mU_DOUBLE_ARROW() throws RecognitionException {
        try {
            int _type = U_DOUBLE_ARROW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:273:2: ( '\\u21D2' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:273:4: '\\u21D2'
            {
            match('\u21D2'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "U_DOUBLE_ARROW"

    // $ANTLR start "A_ARROW"
    public final void mA_ARROW() throws RecognitionException {
        try {
            int _type = A_ARROW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:277:9: ( '->' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:277:11: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "A_ARROW"

    // $ANTLR start "U_ARROW"
    public final void mU_ARROW() throws RecognitionException {
        try {
            int _type = U_ARROW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:278:9: ( '\\u2192' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:278:11: '\\u2192'
            {
            match('\u2192'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "U_ARROW"

    // $ANTLR start "A_ELLIPSIS"
    public final void mA_ELLIPSIS() throws RecognitionException {
        try {
            int _type = A_ELLIPSIS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:282:11: ( '...' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:282:13: '...'
            {
            match("..."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "A_ELLIPSIS"

    // $ANTLR start "U_ELLIPSIS"
    public final void mU_ELLIPSIS() throws RecognitionException {
        try {
            int _type = U_ELLIPSIS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:284:2: ( '\\u2026' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:284:4: '\\u2026'
            {
            match('\u2026'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "U_ELLIPSIS"

    // $ANTLR start "PERIOD"
    public final void mPERIOD() throws RecognitionException {
        try {
            int _type = PERIOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:288:8: ( '.' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:288:10: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PERIOD"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:290:7: ( ',' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:290:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "QUESTION_MARK"
    public final void mQUESTION_MARK() throws RecognitionException {
        try {
            int _type = QUESTION_MARK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:292:15: ( '?' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:292:17: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QUESTION_MARK"

    // $ANTLR start "L_force"
    public final void mL_force() throws RecognitionException {
        try {
            int _type = L_force;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:294:9: ( 'force' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:294:11: 'force'
            {
            match("force"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "L_force"

    // $ANTLR start "WsChar"
    public final void mWsChar() throws RecognitionException {
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:297:9: ( '\\u0020' | '\\t' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:
            {
            if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "WsChar"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:299:9: ( ( WsChar )+ )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:299:11: ( WsChar )+
            {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:299:11: ( WsChar )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\t'||LA2_0==' ') ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:299:11: WsChar
            	    {
            	    mWsChar(); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "NL"
    public final void mNL() throws RecognitionException {
        try {
            int _type = NL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:301:4: ( Newline ( WsChar | Newline )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:301:6: Newline ( WsChar | Newline )*
            {
            mNewline(); 
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:301:14: ( WsChar | Newline )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='\t' && LA3_0<='\n')||(LA3_0>='\f' && LA3_0<='\r')||LA3_0==' '||LA3_0=='\u0085'||(LA3_0>='\u2028' && LA3_0<='\u2029')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||(input.LA(1)>='\f' && input.LA(1)<='\r')||input.LA(1)==' '||input.LA(1)=='\u0085'||(input.LA(1)>='\u2028' && input.LA(1)<='\u2029') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NL"

    // $ANTLR start "Constr"
    public final void mConstr() throws RecognitionException {
        try {
            int _type = Constr;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:303:9: ( BigLetter ( Letter | Digit | '_' )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:303:11: BigLetter ( Letter | Digit | '_' )*
            {
            mBigLetter(); 
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:303:21: ( Letter | Digit | '_' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')||LA4_0=='\u00C4'||LA4_0=='\u00D6'||LA4_0=='\u00DC'||LA4_0=='\u00DF'||LA4_0=='\u00E4'||LA4_0=='\u00F6'||LA4_0=='\u00FC') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||input.LA(1)=='\u00C4'||input.LA(1)=='\u00D6'||input.LA(1)=='\u00DC'||input.LA(1)=='\u00DF'||input.LA(1)=='\u00E4'||input.LA(1)=='\u00F6'||input.LA(1)=='\u00FC' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Constr"

    // $ANTLR start "Id"
    public final void mId() throws RecognitionException {
        try {
            int _type = Id;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:305:4: ( SmallLetter ( Letter | Digit | '_' )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:305:7: SmallLetter ( Letter | Digit | '_' )*
            {
            mSmallLetter(); 
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:305:19: ( Letter | Digit | '_' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')||LA5_0=='\u00C4'||LA5_0=='\u00D6'||LA5_0=='\u00DC'||LA5_0=='\u00DF'||LA5_0=='\u00E4'||LA5_0=='\u00F6'||LA5_0=='\u00FC') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||input.LA(1)=='\u00C4'||input.LA(1)=='\u00D6'||input.LA(1)=='\u00DC'||input.LA(1)=='\u00DF'||input.LA(1)=='\u00E4'||input.LA(1)=='\u00F6'||input.LA(1)=='\u00FC' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Id"

    // $ANTLR start "Num"
    public final void mNum() throws RecognitionException {
        try {
            int _type = Num;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:307:5: ( ( Digit )+ | '0x' ( Hex )+ | '0b' ( '0' | '1' )+ | '0o' ( '0' .. '7' )+ )
            int alt10=4;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='0') ) {
                switch ( input.LA(2) ) {
                case 'x':
                    {
                    alt10=2;
                    }
                    break;
                case 'b':
                    {
                    alt10=3;
                    }
                    break;
                case 'o':
                    {
                    alt10=4;
                    }
                    break;
                default:
                    alt10=1;}

            }
            else if ( ((LA10_0>='1' && LA10_0<='9')) ) {
                alt10=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:307:7: ( Digit )+
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:307:7: ( Digit )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:307:7: Digit
                    	    {
                    	    mDigit(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt6 >= 1 ) break loop6;
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:308:4: '0x' ( Hex )+
                    {
                    match("0x"); 

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:308:9: ( Hex )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='0' && LA7_0<='9')||(LA7_0>='A' && LA7_0<='F')||(LA7_0>='a' && LA7_0<='f')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:308:9: Hex
                    	    {
                    	    mHex(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);


                    }
                    break;
                case 3 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:309:10: '0b' ( '0' | '1' )+
                    {
                    match("0b"); 

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:309:15: ( '0' | '1' )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>='0' && LA8_0<='1')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:
                    	    {
                    	    if ( (input.LA(1)>='0' && input.LA(1)<='1') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);


                    }
                    break;
                case 4 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:310:10: '0o' ( '0' .. '7' )+
                    {
                    match("0o"); 

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:310:15: ( '0' .. '7' )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>='0' && LA9_0<='7')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:310:16: '0' .. '7'
                    	    {
                    	    matchRange('0','7'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt9 >= 1 ) break loop9;
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Num"

    // $ANTLR start "Charcode"
    public final void mCharcode() throws RecognitionException {
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:313:9: ( '\\\\u' Hex Hex Hex Hex | '\\\\U' Hex Hex Hex Hex Hex Hex Hex Hex )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\\') ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1=='u') ) {
                    alt11=1;
                }
                else if ( (LA11_1=='U') ) {
                    alt11=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:313:11: '\\\\u' Hex Hex Hex Hex
                    {
                    match("\\u"); 

                    mHex(); 
                    mHex(); 
                    mHex(); 
                    mHex(); 

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:314:4: '\\\\U' Hex Hex Hex Hex Hex Hex Hex Hex
                    {
                    match("\\U"); 

                    mHex(); 
                    mHex(); 
                    mHex(); 
                    mHex(); 
                    mHex(); 
                    mHex(); 
                    mHex(); 
                    mHex(); 

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "Charcode"

    // $ANTLR start "String"
    public final void mString() throws RecognitionException {
        try {
            int _type = String;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:317:8: ( '\"' (~ ( '\"' | '\\\\' | Newline ) | '\\\\\\\\' | '\\\\\"' | '\\\\n' | '\\\\r' | Charcode )* '\"' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:317:10: '\"' (~ ( '\"' | '\\\\' | Newline ) | '\\\\\\\\' | '\\\\\"' | '\\\\n' | '\\\\r' | Charcode )* '\"'
            {
            match('\"'); 
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:317:13: (~ ( '\"' | '\\\\' | Newline ) | '\\\\\\\\' | '\\\\\"' | '\\\\n' | '\\\\r' | Charcode )*
            loop12:
            do {
                int alt12=7;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\u0000' && LA12_0<='\t')||LA12_0=='\u000B'||(LA12_0>='\u000E' && LA12_0<='!')||(LA12_0>='#' && LA12_0<='[')||(LA12_0>=']' && LA12_0<='\u0084')||(LA12_0>='\u0086' && LA12_0<='\u2027')||(LA12_0>='\u202A' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }
                else if ( (LA12_0=='\\') ) {
                    switch ( input.LA(2) ) {
                    case '\\':
                        {
                        alt12=2;
                        }
                        break;
                    case '\"':
                        {
                        alt12=3;
                        }
                        break;
                    case 'n':
                        {
                        alt12=4;
                        }
                        break;
                    case 'r':
                        {
                        alt12=5;
                        }
                        break;
                    case 'U':
                    case 'u':
                        {
                        alt12=6;
                        }
                        break;

                    }

                }


                switch (alt12) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:317:14: ~ ( '\"' | '\\\\' | Newline )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||input.LA(1)=='\u000B'||(input.LA(1)>='\u000E' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\u0084')||(input.LA(1)>='\u0086' && input.LA(1)<='\u2027')||(input.LA(1)>='\u202A' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:317:40: '\\\\\\\\'
            	    {
            	    match("\\\\"); 


            	    }
            	    break;
            	case 3 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:317:49: '\\\\\"'
            	    {
            	    match("\\\""); 


            	    }
            	    break;
            	case 4 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:317:57: '\\\\n'
            	    {
            	    match("\\n"); 


            	    }
            	    break;
            	case 5 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:317:65: '\\\\r'
            	    {
            	    match("\\r"); 


            	    }
            	    break;
            	case 6 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:317:73: Charcode
            	    {
            	    mCharcode(); 

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "String"

    // $ANTLR start "ROUND_BRACKET_OPEN"
    public final void mROUND_BRACKET_OPEN() throws RecognitionException {
        try {
            int _type = ROUND_BRACKET_OPEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:320:2: ( '(' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:320:4: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ROUND_BRACKET_OPEN"

    // $ANTLR start "ROUND_BRACKET_CLOSE"
    public final void mROUND_BRACKET_CLOSE() throws RecognitionException {
        try {
            int _type = ROUND_BRACKET_CLOSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:323:2: ( ')' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:323:4: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ROUND_BRACKET_CLOSE"

    // $ANTLR start "SQUARE_BRACKET_OPEN"
    public final void mSQUARE_BRACKET_OPEN() throws RecognitionException {
        try {
            int _type = SQUARE_BRACKET_OPEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:326:2: ( '[' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:326:4: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SQUARE_BRACKET_OPEN"

    // $ANTLR start "SQUARE_BRACKET_CLOSE"
    public final void mSQUARE_BRACKET_CLOSE() throws RecognitionException {
        try {
            int _type = SQUARE_BRACKET_CLOSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:329:2: ( ']' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:329:4: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SQUARE_BRACKET_CLOSE"

    // $ANTLR start "CURLY_BRACKET_OPEN"
    public final void mCURLY_BRACKET_OPEN() throws RecognitionException {
        try {
            int _type = CURLY_BRACKET_OPEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:332:2: ( '{' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:332:4: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CURLY_BRACKET_OPEN"

    // $ANTLR start "CURLY_BRACKET_CLOSE"
    public final void mCURLY_BRACKET_CLOSE() throws RecognitionException {
        try {
            int _type = CURLY_BRACKET_CLOSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:335:2: ( '}' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:335:4: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CURLY_BRACKET_CLOSE"

    // $ANTLR start "ASSIGN"
    public final void mASSIGN() throws RecognitionException {
        try {
            int _type = ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:337:8: ( '=' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:337:10: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASSIGN"

    // $ANTLR start "UNDERSCORE"
    public final void mUNDERSCORE() throws RecognitionException {
        try {
            int _type = UNDERSCORE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:340:2: ( '_' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:340:4: '_'
            {
            match('_'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UNDERSCORE"

    // $ANTLR start "PRAGMA_LOG"
    public final void mPRAGMA_LOG() throws RecognitionException {
        try {
            int _type = PRAGMA_LOG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:343:2: ( '#log' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:343:4: '#log'
            {
            match("#log"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PRAGMA_LOG"

    // $ANTLR start "PRAGMA_PRINT"
    public final void mPRAGMA_PRINT() throws RecognitionException {
        try {
            int _type = PRAGMA_PRINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:346:2: ( '#print' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:346:4: '#print'
            {
            match("#print"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PRAGMA_PRINT"

    // $ANTLR start "PRAGMA_ASSERT"
    public final void mPRAGMA_ASSERT() throws RecognitionException {
        try {
            int _type = PRAGMA_ASSERT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:349:2: ( '#assert' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:349:4: '#assert'
            {
            match("#assert"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PRAGMA_ASSERT"

    // $ANTLR start "PRAGMA_PROFILE"
    public final void mPRAGMA_PROFILE() throws RecognitionException {
        try {
            int _type = PRAGMA_PROFILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:352:2: ( '#profile' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:352:4: '#profile'
            {
            match("#profile"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PRAGMA_PROFILE"

    public void mTokens() throws RecognitionException {
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:8: ( COMMENT | L_begin | L_end | L_obj | L_with | L_if | L_then | L_else | L_elseif | L_while | L_for | L_do | L_yield | L_match | L_case | L_as | L_val | L_def | L_in | L_exception | L_to | L_downto | A_infinity | U_infinity | L_concurrent | L_choose | L_lazy | L_memoize | L_true | L_false | L_this | L_random | L_nil | L_div | L_mod | A_EQUAL | U_EQUAL | A_NOT_EQUAL | U_NOT_EQUAL | LESS | A_LESS_EQ | U_LESS_EQ | GREATER | A_GREATER_EQ | U_GREATER_EQ | SC | PLUS | MINUS | TIMES | QUOTIENT | POW_tok | A_OR | A_AND | A_NOT | U_OR | U_AND | U_NOT | A_DOUBLE_COLON | U_DOUBLE_COLON | TIMESTIMES | QUOTIENTQUOTIENT | PLUSPLUS | MINUSMINUS | A_DOUBLE_ARROW | U_DOUBLE_ARROW | A_ARROW | U_ARROW | A_ELLIPSIS | U_ELLIPSIS | PERIOD | COMMA | QUESTION_MARK | L_force | WS | NL | Constr | Id | Num | String | ROUND_BRACKET_OPEN | ROUND_BRACKET_CLOSE | SQUARE_BRACKET_OPEN | SQUARE_BRACKET_CLOSE | CURLY_BRACKET_OPEN | CURLY_BRACKET_CLOSE | ASSIGN | UNDERSCORE | PRAGMA_LOG | PRAGMA_PRINT | PRAGMA_ASSERT | PRAGMA_PROFILE )
        int alt13=91;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:10: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 2 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:18: L_begin
                {
                mL_begin(); 

                }
                break;
            case 3 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:26: L_end
                {
                mL_end(); 

                }
                break;
            case 4 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:32: L_obj
                {
                mL_obj(); 

                }
                break;
            case 5 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:38: L_with
                {
                mL_with(); 

                }
                break;
            case 6 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:45: L_if
                {
                mL_if(); 

                }
                break;
            case 7 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:50: L_then
                {
                mL_then(); 

                }
                break;
            case 8 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:57: L_else
                {
                mL_else(); 

                }
                break;
            case 9 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:64: L_elseif
                {
                mL_elseif(); 

                }
                break;
            case 10 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:73: L_while
                {
                mL_while(); 

                }
                break;
            case 11 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:81: L_for
                {
                mL_for(); 

                }
                break;
            case 12 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:87: L_do
                {
                mL_do(); 

                }
                break;
            case 13 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:92: L_yield
                {
                mL_yield(); 

                }
                break;
            case 14 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:100: L_match
                {
                mL_match(); 

                }
                break;
            case 15 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:108: L_case
                {
                mL_case(); 

                }
                break;
            case 16 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:115: L_as
                {
                mL_as(); 

                }
                break;
            case 17 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:120: L_val
                {
                mL_val(); 

                }
                break;
            case 18 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:126: L_def
                {
                mL_def(); 

                }
                break;
            case 19 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:132: L_in
                {
                mL_in(); 

                }
                break;
            case 20 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:137: L_exception
                {
                mL_exception(); 

                }
                break;
            case 21 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:149: L_to
                {
                mL_to(); 

                }
                break;
            case 22 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:154: L_downto
                {
                mL_downto(); 

                }
                break;
            case 23 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:163: A_infinity
                {
                mA_infinity(); 

                }
                break;
            case 24 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:174: U_infinity
                {
                mU_infinity(); 

                }
                break;
            case 25 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:185: L_concurrent
                {
                mL_concurrent(); 

                }
                break;
            case 26 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:198: L_choose
                {
                mL_choose(); 

                }
                break;
            case 27 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:207: L_lazy
                {
                mL_lazy(); 

                }
                break;
            case 28 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:214: L_memoize
                {
                mL_memoize(); 

                }
                break;
            case 29 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:224: L_true
                {
                mL_true(); 

                }
                break;
            case 30 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:231: L_false
                {
                mL_false(); 

                }
                break;
            case 31 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:239: L_this
                {
                mL_this(); 

                }
                break;
            case 32 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:246: L_random
                {
                mL_random(); 

                }
                break;
            case 33 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:255: L_nil
                {
                mL_nil(); 

                }
                break;
            case 34 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:261: L_div
                {
                mL_div(); 

                }
                break;
            case 35 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:267: L_mod
                {
                mL_mod(); 

                }
                break;
            case 36 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:273: A_EQUAL
                {
                mA_EQUAL(); 

                }
                break;
            case 37 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:281: U_EQUAL
                {
                mU_EQUAL(); 

                }
                break;
            case 38 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:289: A_NOT_EQUAL
                {
                mA_NOT_EQUAL(); 

                }
                break;
            case 39 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:301: U_NOT_EQUAL
                {
                mU_NOT_EQUAL(); 

                }
                break;
            case 40 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:313: LESS
                {
                mLESS(); 

                }
                break;
            case 41 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:318: A_LESS_EQ
                {
                mA_LESS_EQ(); 

                }
                break;
            case 42 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:328: U_LESS_EQ
                {
                mU_LESS_EQ(); 

                }
                break;
            case 43 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:338: GREATER
                {
                mGREATER(); 

                }
                break;
            case 44 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:346: A_GREATER_EQ
                {
                mA_GREATER_EQ(); 

                }
                break;
            case 45 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:359: U_GREATER_EQ
                {
                mU_GREATER_EQ(); 

                }
                break;
            case 46 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:372: SC
                {
                mSC(); 

                }
                break;
            case 47 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:375: PLUS
                {
                mPLUS(); 

                }
                break;
            case 48 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:380: MINUS
                {
                mMINUS(); 

                }
                break;
            case 49 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:386: TIMES
                {
                mTIMES(); 

                }
                break;
            case 50 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:392: QUOTIENT
                {
                mQUOTIENT(); 

                }
                break;
            case 51 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:401: POW_tok
                {
                mPOW_tok(); 

                }
                break;
            case 52 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:409: A_OR
                {
                mA_OR(); 

                }
                break;
            case 53 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:414: A_AND
                {
                mA_AND(); 

                }
                break;
            case 54 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:420: A_NOT
                {
                mA_NOT(); 

                }
                break;
            case 55 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:426: U_OR
                {
                mU_OR(); 

                }
                break;
            case 56 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:431: U_AND
                {
                mU_AND(); 

                }
                break;
            case 57 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:437: U_NOT
                {
                mU_NOT(); 

                }
                break;
            case 58 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:443: A_DOUBLE_COLON
                {
                mA_DOUBLE_COLON(); 

                }
                break;
            case 59 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:458: U_DOUBLE_COLON
                {
                mU_DOUBLE_COLON(); 

                }
                break;
            case 60 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:473: TIMESTIMES
                {
                mTIMESTIMES(); 

                }
                break;
            case 61 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:484: QUOTIENTQUOTIENT
                {
                mQUOTIENTQUOTIENT(); 

                }
                break;
            case 62 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:501: PLUSPLUS
                {
                mPLUSPLUS(); 

                }
                break;
            case 63 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:510: MINUSMINUS
                {
                mMINUSMINUS(); 

                }
                break;
            case 64 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:521: A_DOUBLE_ARROW
                {
                mA_DOUBLE_ARROW(); 

                }
                break;
            case 65 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:536: U_DOUBLE_ARROW
                {
                mU_DOUBLE_ARROW(); 

                }
                break;
            case 66 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:551: A_ARROW
                {
                mA_ARROW(); 

                }
                break;
            case 67 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:559: U_ARROW
                {
                mU_ARROW(); 

                }
                break;
            case 68 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:567: A_ELLIPSIS
                {
                mA_ELLIPSIS(); 

                }
                break;
            case 69 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:578: U_ELLIPSIS
                {
                mU_ELLIPSIS(); 

                }
                break;
            case 70 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:589: PERIOD
                {
                mPERIOD(); 

                }
                break;
            case 71 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:596: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 72 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:602: QUESTION_MARK
                {
                mQUESTION_MARK(); 

                }
                break;
            case 73 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:616: L_force
                {
                mL_force(); 

                }
                break;
            case 74 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:624: WS
                {
                mWS(); 

                }
                break;
            case 75 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:627: NL
                {
                mNL(); 

                }
                break;
            case 76 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:630: Constr
                {
                mConstr(); 

                }
                break;
            case 77 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:637: Id
                {
                mId(); 

                }
                break;
            case 78 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:640: Num
                {
                mNum(); 

                }
                break;
            case 79 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:644: String
                {
                mString(); 

                }
                break;
            case 80 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:651: ROUND_BRACKET_OPEN
                {
                mROUND_BRACKET_OPEN(); 

                }
                break;
            case 81 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:670: ROUND_BRACKET_CLOSE
                {
                mROUND_BRACKET_CLOSE(); 

                }
                break;
            case 82 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:690: SQUARE_BRACKET_OPEN
                {
                mSQUARE_BRACKET_OPEN(); 

                }
                break;
            case 83 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:710: SQUARE_BRACKET_CLOSE
                {
                mSQUARE_BRACKET_CLOSE(); 

                }
                break;
            case 84 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:731: CURLY_BRACKET_OPEN
                {
                mCURLY_BRACKET_OPEN(); 

                }
                break;
            case 85 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:750: CURLY_BRACKET_CLOSE
                {
                mCURLY_BRACKET_CLOSE(); 

                }
                break;
            case 86 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:770: ASSIGN
                {
                mASSIGN(); 

                }
                break;
            case 87 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:777: UNDERSCORE
                {
                mUNDERSCORE(); 

                }
                break;
            case 88 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:788: PRAGMA_LOG
                {
                mPRAGMA_LOG(); 

                }
                break;
            case 89 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:799: PRAGMA_PRINT
                {
                mPRAGMA_PRINT(); 

                }
                break;
            case 90 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:812: PRAGMA_ASSERT
                {
                mPRAGMA_ASSERT(); 

                }
                break;
            case 91 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:826: PRAGMA_PROFILE
                {
                mPRAGMA_PROFILE(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\1\75\15\60\1\uffff\3\60\1\135\1\uffff\1\137\1\uffff\1\141"+
        "\1\uffff\1\143\2\uffff\1\145\1\150\1\152\12\uffff\1\154\24\uffff"+
        "\7\60\1\167\1\171\1\60\1\174\3\60\1\u0081\11\60\1\u008b\4\60\25"+
        "\uffff\1\60\1\u0092\5\60\1\uffff\1\60\1\uffff\2\60\1\uffff\1\60"+
        "\1\u009d\2\60\1\uffff\1\u00a0\1\u00a1\3\60\1\u00a5\3\60\1\uffff"+
        "\1\u00a9\2\60\1\u00ac\1\uffff\1\60\1\uffff\1\u00b1\2\60\1\u00b4"+
        "\2\60\1\u00b7\1\u00b8\1\u00b9\1\60\1\uffff\2\60\2\uffff\3\60\1\uffff"+
        "\1\u00c0\2\60\1\uffff\1\u00c3\1\60\3\uffff\1\u00c5\1\60\1\uffff"+
        "\2\60\1\uffff\1\u00c9\1\60\3\uffff\1\u00cb\1\u00cc\1\60\1\u00ce"+
        "\1\u00cf\1\60\1\uffff\2\60\1\uffff\1\60\1\uffff\1\u00d4\1\60\1\u00d6"+
        "\1\uffff\1\60\2\uffff\1\u00d8\2\uffff\2\60\1\u00db\1\u00dc\1\uffff"+
        "\1\60\1\uffff\1\60\1\uffff\1\u00df\1\60\2\uffff\1\60\1\u00e2\1\uffff"+
        "\1\60\1\u00e4\1\uffff\1\60\1\uffff\1\u00e6\1\uffff";
    static final String DFA13_eofS =
        "\u00e7\uffff";
    static final String DFA13_minS =
        "\1\11\1\52\1\145\1\154\1\142\1\150\1\146\1\150\1\141\1\145\1\151"+
        "\2\141\1\163\1\141\1\uffff\2\141\1\151\1\75\1\uffff\1\75\1\uffff"+
        "\1\75\1\uffff\1\75\2\uffff\1\53\1\55\1\52\12\uffff\1\56\20\uffff"+
        "\1\141\3\uffff\1\147\1\144\1\163\1\143\1\152\1\164\1\151\2\60\1"+
        "\145\1\60\1\165\1\162\1\154\1\60\1\146\1\166\1\145\1\164\1\155\1"+
        "\144\1\163\1\156\1\157\1\60\1\154\1\172\1\156\1\154\23\uffff\1\162"+
        "\1\uffff\1\151\1\60\3\145\1\150\1\154\1\uffff\1\151\1\uffff\1\156"+
        "\1\163\1\uffff\1\145\1\60\1\163\1\156\1\uffff\2\60\1\154\1\143\1"+
        "\157\1\60\1\145\1\143\1\157\1\uffff\1\60\1\171\1\144\1\60\1\151"+
        "\1\156\1\uffff\1\60\1\160\1\143\1\60\1\145\1\156\3\60\1\145\1\uffff"+
        "\1\145\1\164\2\uffff\1\144\1\150\1\151\1\uffff\1\60\1\165\1\163"+
        "\1\uffff\1\60\1\157\3\uffff\1\60\1\146\1\uffff\2\164\1\uffff\1\60"+
        "\1\151\3\uffff\2\60\1\157\2\60\1\172\1\uffff\1\162\1\145\1\uffff"+
        "\1\155\1\uffff\1\60\1\151\1\60\1\uffff\1\164\2\uffff\1\60\2\uffff"+
        "\1\145\1\162\2\60\1\uffff\1\157\1\uffff\1\171\1\uffff\1\60\1\145"+
        "\2\uffff\1\156\1\60\1\uffff\1\156\1\60\1\uffff\1\164\1\uffff\1\60"+
        "\1\uffff";
    static final String DFA13_maxS =
        "\1\u2265\1\57\1\145\1\170\1\142\1\151\1\156\1\162\2\157\1\151\2"+
        "\157\1\163\1\141\1\uffff\2\141\1\151\1\76\1\uffff\1\75\1\uffff\1"+
        "\75\1\uffff\1\75\2\uffff\1\53\1\76\1\52\12\uffff\1\56\20\uffff\1"+
        "\160\3\uffff\1\147\1\144\1\163\1\143\1\152\1\164\1\151\2\u00fc\1"+
        "\151\1\u00fc\1\165\1\162\1\154\1\u00fc\1\146\1\166\1\145\1\164\1"+
        "\155\1\144\1\163\1\156\1\157\1\u00fc\1\154\1\172\1\156\1\154\23"+
        "\uffff\1\162\1\uffff\1\151\1\u00fc\3\145\1\150\1\154\1\uffff\1\151"+
        "\1\uffff\1\156\1\163\1\uffff\1\145\1\u00fc\1\163\1\156\1\uffff\2"+
        "\u00fc\1\154\1\143\1\157\1\u00fc\1\145\1\143\1\157\1\uffff\1\u00fc"+
        "\1\171\1\144\1\u00fc\1\157\1\156\1\uffff\1\u00fc\1\160\1\143\1\u00fc"+
        "\1\145\1\156\3\u00fc\1\145\1\uffff\1\145\1\164\2\uffff\1\144\1\150"+
        "\1\151\1\uffff\1\u00fc\1\165\1\163\1\uffff\1\u00fc\1\157\3\uffff"+
        "\1\u00fc\1\146\1\uffff\2\164\1\uffff\1\u00fc\1\151\3\uffff\2\u00fc"+
        "\1\157\2\u00fc\1\172\1\uffff\1\162\1\145\1\uffff\1\155\1\uffff\1"+
        "\u00fc\1\151\1\u00fc\1\uffff\1\164\2\uffff\1\u00fc\2\uffff\1\145"+
        "\1\162\2\u00fc\1\uffff\1\157\1\uffff\1\171\1\uffff\1\u00fc\1\145"+
        "\2\uffff\1\156\1\u00fc\1\uffff\1\156\1\u00fc\1\uffff\1\164\1\uffff"+
        "\1\u00fc\1\uffff";
    static final String DFA13_acceptS =
        "\17\uffff\1\30\4\uffff\1\45\1\uffff\1\47\1\uffff\1\52\1\uffff\1"+
        "\55\1\56\3\uffff\1\63\1\64\1\65\1\67\1\70\1\71\1\72\1\73\1\101\1"+
        "\103\1\uffff\1\105\1\107\1\110\1\112\1\113\1\114\1\115\1\116\1\117"+
        "\1\120\1\121\1\122\1\123\1\124\1\125\1\127\1\uffff\1\1\1\75\1\62"+
        "\35\uffff\1\44\1\100\1\126\1\46\1\66\1\51\1\50\1\54\1\53\1\76\1"+
        "\57\1\77\1\102\1\60\1\74\1\61\1\104\1\106\1\130\1\uffff\1\132\7"+
        "\uffff\1\6\1\uffff\1\23\2\uffff\1\25\4\uffff\1\14\11\uffff\1\20"+
        "\6\uffff\1\3\12\uffff\1\13\2\uffff\1\22\1\42\3\uffff\1\43\3\uffff"+
        "\1\21\2\uffff\1\41\1\131\1\133\2\uffff\1\10\2\uffff\1\5\2\uffff"+
        "\1\7\1\37\1\35\6\uffff\1\17\2\uffff\1\33\1\uffff\1\2\3\uffff\1\12"+
        "\1\uffff\1\111\1\36\1\uffff\1\15\1\16\4\uffff\1\11\1\uffff\1\4\1"+
        "\uffff\1\26\2\uffff\1\32\1\40\2\uffff\1\34\2\uffff\1\27\1\uffff"+
        "\1\24\1\uffff\1\31";
    static final String DFA13_specialS =
        "\u00e7\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\55\1\56\1\uffff\2\56\22\uffff\1\55\1\25\1\62\1\72\2\uffff"+
            "\1\41\1\uffff\1\63\1\64\1\36\1\34\1\53\1\35\1\51\1\1\12\61\1"+
            "\45\1\33\1\27\1\23\1\31\1\54\1\uffff\32\57\1\65\1\uffff\1\66"+
            "\1\37\1\71\1\uffff\1\15\1\2\1\14\1\11\1\3\1\10\2\60\1\6\2\60"+
            "\1\20\1\13\1\22\1\4\2\60\1\21\1\60\1\7\1\60\1\16\1\5\1\60\1"+
            "\12\1\60\1\67\1\40\1\70\7\uffff\1\56\46\uffff\1\44\27\uffff"+
            "\1\57\21\uffff\1\57\5\uffff\1\57\2\uffff\1\60\4\uffff\1\60\21"+
            "\uffff\1\60\5\uffff\1\60\u1f29\uffff\1\52\1\uffff\2\56\u0168"+
            "\uffff\1\50\77\uffff\1\47\113\uffff\1\17\10\uffff\1\43\1\42"+
            "\16\uffff\1\46\51\uffff\1\24\1\26\1\uffff\1\30\1\32",
            "\1\73\4\uffff\1\74",
            "\1\76",
            "\1\100\1\uffff\1\77\11\uffff\1\101",
            "\1\102",
            "\1\104\1\103",
            "\1\105\7\uffff\1\106",
            "\1\107\6\uffff\1\110\2\uffff\1\111",
            "\1\113\15\uffff\1\112",
            "\1\115\3\uffff\1\116\5\uffff\1\114",
            "\1\117",
            "\1\120\3\uffff\1\121\11\uffff\1\122",
            "\1\123\6\uffff\1\125\6\uffff\1\124",
            "\1\126",
            "\1\127",
            "",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133\1\134",
            "",
            "\1\136",
            "",
            "\1\140",
            "",
            "\1\142",
            "",
            "",
            "\1\144",
            "\1\146\20\uffff\1\147",
            "\1\151",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\153",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\157\12\uffff\1\155\3\uffff\1\156",
            "",
            "",
            "",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60\111\uffff\1"+
            "\60\21\uffff\1\60\5\uffff\1\60\2\uffff\1\60\4\uffff\1\60\21"+
            "\uffff\1\60\5\uffff\1\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\5\60\1\170\24\60"+
            "\111\uffff\1\60\21\uffff\1\60\5\uffff\1\60\2\uffff\1\60\4\uffff"+
            "\1\60\21\uffff\1\60\5\uffff\1\60",
            "\1\172\3\uffff\1\173",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60\111\uffff\1"+
            "\60\21\uffff\1\60\5\uffff\1\60\2\uffff\1\60\4\uffff\1\60\21"+
            "\uffff\1\60\5\uffff\1\60",
            "\1\175",
            "\1\176",
            "\1\177",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\26\60\1\u0080\3\60"+
            "\111\uffff\1\60\21\uffff\1\60\5\uffff\1\60\2\uffff\1\60\4\uffff"+
            "\1\60\21\uffff\1\60\5\uffff\1\60",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60\111\uffff\1"+
            "\60\21\uffff\1\60\5\uffff\1\60\2\uffff\1\60\4\uffff\1\60\21"+
            "\uffff\1\60\5\uffff\1\60",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0090",
            "",
            "\1\u0091",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60\111\uffff\1"+
            "\60\21\uffff\1\60\5\uffff\1\60\2\uffff\1\60\4\uffff\1\60\21"+
            "\uffff\1\60\5\uffff\1\60",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "",
            "\1\u0098",
            "",
            "\1\u0099",
            "\1\u009a",
            "",
            "\1\u009b",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\2\60\1\u009c\27\60"+
            "\111\uffff\1\60\21\uffff\1\60\5\uffff\1\60\2\uffff\1\60\4\uffff"+
            "\1\60\21\uffff\1\60\5\uffff\1\60",
            "\1\u009e",
            "\1\u009f",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60\111\uffff\1"+
            "\60\21\uffff\1\60\5\uffff\1\60\2\uffff\1\60\4\uffff\1\60\21"+
            "\uffff\1\60\5\uffff\1\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60\111\uffff\1"+
            "\60\21\uffff\1\60\5\uffff\1\60\2\uffff\1\60\4\uffff\1\60\21"+
            "\uffff\1\60\5\uffff\1\60",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60\111\uffff\1"+
            "\60\21\uffff\1\60\5\uffff\1\60\2\uffff\1\60\4\uffff\1\60\21"+
            "\uffff\1\60\5\uffff\1\60",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60\111\uffff\1"+
            "\60\21\uffff\1\60\5\uffff\1\60\2\uffff\1\60\4\uffff\1\60\21"+
            "\uffff\1\60\5\uffff\1\60",
            "\1\u00aa",
            "\1\u00ab",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60\111\uffff\1"+
            "\60\21\uffff\1\60\5\uffff\1\60\2\uffff\1\60\4\uffff\1\60\21"+
            "\uffff\1\60\5\uffff\1\60",
            "\1\u00ad\5\uffff\1\u00ae",
            "\1\u00af",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\10\60\1\u00b0\21"+
            "\60\111\uffff\1\60\21\uffff\1\60\5\uffff\1\60\2\uffff\1\60\4"+
            "\uffff\1\60\21\uffff\1\60\5\uffff\1\60",
            "\1\u00b2",
            "\1\u00b3",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60\111\uffff\1"+
            "\60\21\uffff\1\60\5\uffff\1\60\2\uffff\1\60\4\uffff\1\60\21"+
            "\uffff\1\60\5\uffff\1\60",
            "\1\u00b5",
            "\1\u00b6",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60\111\uffff\1"+
            "\60\21\uffff\1\60\5\uffff\1\60\2\uffff\1\60\4\uffff\1\60\21"+
            "\uffff\1\60\5\uffff\1\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60\111\uffff\1"+
            "\60\21\uffff\1\60\5\uffff\1\60\2\uffff\1\60\4\uffff\1\60\21"+
            "\uffff\1\60\5\uffff\1\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60\111\uffff\1"+
            "\60\21\uffff\1\60\5\uffff\1\60\2\uffff\1\60\4\uffff\1\60\21"+
            "\uffff\1\60\5\uffff\1\60",
            "\1\u00ba",
            "",
            "\1\u00bb",
            "\1\u00bc",
            "",
            "",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60\111\uffff\1"+
            "\60\21\uffff\1\60\5\uffff\1\60\2\uffff\1\60\4\uffff\1\60\21"+
            "\uffff\1\60\5\uffff\1\60",
            "\1\u00c1",
            "\1\u00c2",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60\111\uffff\1"+
            "\60\21\uffff\1\60\5\uffff\1\60\2\uffff\1\60\4\uffff\1\60\21"+
            "\uffff\1\60\5\uffff\1\60",
            "\1\u00c4",
            "",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60\111\uffff\1"+
            "\60\21\uffff\1\60\5\uffff\1\60\2\uffff\1\60\4\uffff\1\60\21"+
            "\uffff\1\60\5\uffff\1\60",
            "\1\u00c6",
            "",
            "\1\u00c7",
            "\1\u00c8",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60\111\uffff\1"+
            "\60\21\uffff\1\60\5\uffff\1\60\2\uffff\1\60\4\uffff\1\60\21"+
            "\uffff\1\60\5\uffff\1\60",
            "\1\u00ca",
            "",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60\111\uffff\1"+
            "\60\21\uffff\1\60\5\uffff\1\60\2\uffff\1\60\4\uffff\1\60\21"+
            "\uffff\1\60\5\uffff\1\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60\111\uffff\1"+
            "\60\21\uffff\1\60\5\uffff\1\60\2\uffff\1\60\4\uffff\1\60\21"+
            "\uffff\1\60\5\uffff\1\60",
            "\1\u00cd",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60\111\uffff\1"+
            "\60\21\uffff\1\60\5\uffff\1\60\2\uffff\1\60\4\uffff\1\60\21"+
            "\uffff\1\60\5\uffff\1\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60\111\uffff\1"+
            "\60\21\uffff\1\60\5\uffff\1\60\2\uffff\1\60\4\uffff\1\60\21"+
            "\uffff\1\60\5\uffff\1\60",
            "\1\u00d0",
            "",
            "\1\u00d1",
            "\1\u00d2",
            "",
            "\1\u00d3",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60\111\uffff\1"+
            "\60\21\uffff\1\60\5\uffff\1\60\2\uffff\1\60\4\uffff\1\60\21"+
            "\uffff\1\60\5\uffff\1\60",
            "\1\u00d5",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60\111\uffff\1"+
            "\60\21\uffff\1\60\5\uffff\1\60\2\uffff\1\60\4\uffff\1\60\21"+
            "\uffff\1\60\5\uffff\1\60",
            "",
            "\1\u00d7",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60\111\uffff\1"+
            "\60\21\uffff\1\60\5\uffff\1\60\2\uffff\1\60\4\uffff\1\60\21"+
            "\uffff\1\60\5\uffff\1\60",
            "",
            "",
            "\1\u00d9",
            "\1\u00da",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60\111\uffff\1"+
            "\60\21\uffff\1\60\5\uffff\1\60\2\uffff\1\60\4\uffff\1\60\21"+
            "\uffff\1\60\5\uffff\1\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60\111\uffff\1"+
            "\60\21\uffff\1\60\5\uffff\1\60\2\uffff\1\60\4\uffff\1\60\21"+
            "\uffff\1\60\5\uffff\1\60",
            "",
            "\1\u00dd",
            "",
            "\1\u00de",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60\111\uffff\1"+
            "\60\21\uffff\1\60\5\uffff\1\60\2\uffff\1\60\4\uffff\1\60\21"+
            "\uffff\1\60\5\uffff\1\60",
            "\1\u00e0",
            "",
            "",
            "\1\u00e1",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60\111\uffff\1"+
            "\60\21\uffff\1\60\5\uffff\1\60\2\uffff\1\60\4\uffff\1\60\21"+
            "\uffff\1\60\5\uffff\1\60",
            "",
            "\1\u00e3",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60\111\uffff\1"+
            "\60\21\uffff\1\60\5\uffff\1\60\2\uffff\1\60\4\uffff\1\60\21"+
            "\uffff\1\60\5\uffff\1\60",
            "",
            "\1\u00e5",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60\111\uffff\1"+
            "\60\21\uffff\1\60\5\uffff\1\60\2\uffff\1\60\4\uffff\1\60\21"+
            "\uffff\1\60\5\uffff\1\60",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( COMMENT | L_begin | L_end | L_obj | L_with | L_if | L_then | L_else | L_elseif | L_while | L_for | L_do | L_yield | L_match | L_case | L_as | L_val | L_def | L_in | L_exception | L_to | L_downto | A_infinity | U_infinity | L_concurrent | L_choose | L_lazy | L_memoize | L_true | L_false | L_this | L_random | L_nil | L_div | L_mod | A_EQUAL | U_EQUAL | A_NOT_EQUAL | U_NOT_EQUAL | LESS | A_LESS_EQ | U_LESS_EQ | GREATER | A_GREATER_EQ | U_GREATER_EQ | SC | PLUS | MINUS | TIMES | QUOTIENT | POW_tok | A_OR | A_AND | A_NOT | U_OR | U_AND | U_NOT | A_DOUBLE_COLON | U_DOUBLE_COLON | TIMESTIMES | QUOTIENTQUOTIENT | PLUSPLUS | MINUSMINUS | A_DOUBLE_ARROW | U_DOUBLE_ARROW | A_ARROW | U_ARROW | A_ELLIPSIS | U_ELLIPSIS | PERIOD | COMMA | QUESTION_MARK | L_force | WS | NL | Constr | Id | Num | String | ROUND_BRACKET_OPEN | ROUND_BRACKET_CLOSE | SQUARE_BRACKET_OPEN | SQUARE_BRACKET_CLOSE | CURLY_BRACKET_OPEN | CURLY_BRACKET_CLOSE | ASSIGN | UNDERSCORE | PRAGMA_LOG | PRAGMA_PRINT | PRAGMA_ASSERT | PRAGMA_PROFILE );";
        }
    }
 

}