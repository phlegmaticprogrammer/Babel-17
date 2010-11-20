// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g 2010-11-20 16:59:36

package com.babel17.antlr;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class babel17Lexer extends Lexer {
    public static final int L_end=50;
    public static final int U_AND=103;
    public static final int COMMENT1=40;
    public static final int COMMENT2=43;
    public static final int U_NOT_EQUAL=86;
    public static final int TIMESTIMES=107;
    public static final int BigLetter=45;
    public static final int ROUND_BRACKET_CLOSE=131;
    public static final int L_mod=82;
    public static final int A_OR=99;
    public static final int MINUSMINUS=110;
    public static final int Newline=41;
    public static final int SQUARE_BRACKET_CLOSE=133;
    public static final int MAP_OR_SET_OR_OBJ=14;
    public static final int EOF=-1;
    public static final int U_DOUBLE_ARROW=112;
    public static final int L_exception=67;
    public static final int GREATER=90;
    public static final int EMPTY_MAP=15;
    public static final int Num=127;
    public static final int POW=24;
    public static final int L_concurrent=72;
    public static final int L_false=77;
    public static final int QUOTIENTQUOTIENT=108;
    public static final int L_nil=80;
    public static final int L_with=52;
    public static final int LIST_CONS=10;
    public static final int BEGIN=28;
    public static final int LESS=87;
    public static final int QUESTION_MARK=120;
    public static final int SQUARE_LIST=8;
    public static final int ROUND_BRACKET_OPEN=130;
    public static final int VAL=30;
    public static final int L_as=63;
    public static final int MESSAGE_SEND=22;
    public static final int NL=124;
    public static final int A_ARROW=113;
    public static final int A_DOUBLE_COLON=105;
    public static final int L_def=65;
    public static final int A_AND=100;
    public static final int EXCEPTION=16;
    public static final int L_this=78;
    public static final int L_force=121;
    public static final int L_choose=73;
    public static final int PERIOD=117;
    public static final int SmallLetter=44;
    public static final int NIL_TOKEN=5;
    public static final int CURLY_BRACKET_OPEN=134;
    public static final int UNDERSCORE=136;
    public static final int MATCH=17;
    public static final int U_LESS_EQ=89;
    public static final int MEM_STRONG=37;
    public static final int L_to=68;
    public static final int WS=123;
    public static final int Charcode=128;
    public static final int L_do=59;
    public static final int L_val=64;
    public static final int L_match=61;
    public static final int L_obj=51;
    public static final int WsChar=122;
    public static final int Hex=48;
    public static final int L_for=58;
    public static final int Letter=46;
    public static final int APPLY=12;
    public static final int U_ARROW=114;
    public static final int L_else=55;
    public static final int A_EQUAL=83;
    public static final int DEF=34;
    public static final int L_begin=49;
    public static final int U_NOT=104;
    public static final int L_yield=60;
    public static final int L_div=81;
    public static final int PLUSPLUS=109;
    public static final int L_while=57;
    public static final int CASES=18;
    public static final int POW_tok=98;
    public static final int IF_PATTERN=39;
    public static final int A_ELLIPSIS=115;
    public static final int PARENTS_PLUS=25;
    public static final int A_DOUBLE_ARROW=111;
    public static final int SQUARE_BRACKET_OPEN=132;
    public static final int IF=13;
    public static final int PROG=4;
    public static final int U_OR=102;
    public static final int COMMA=118;
    public static final int OBJ=19;
    public static final int MEMOIZE=36;
    public static final int U_ELLIPSIS=116;
    public static final int YIELD=35;
    public static final int COMPARE=11;
    public static final int U_EQUAL=84;
    public static final int U_GREATER_EQ=92;
    public static final int PLUS=94;
    public static final int LAMBDA=7;
    public static final int String=129;
    public static final int L_true=76;
    public static final int A_infinity=70;
    public static final int Id=126;
    public static final int WITH=29;
    public static final int L_in=66;
    public static final int A_NOT=101;
    public static final int L_lazy=74;
    public static final int L_then=54;
    public static final int NotNewline=42;
    public static final int QUOTIENT=97;
    public static final int L_if=53;
    public static final int FOR_EXPR=20;
    public static final int UMINUS=23;
    public static final int CURLY_BRACKET_CLOSE=135;
    public static final int Constr=125;
    public static final int WHILE_DO=21;
    public static final int L_elseif=56;
    public static final int MINUS=95;
    public static final int Digit=47;
    public static final int L_memoize=75;
    public static final int MEM_WEAK=38;
    public static final int A_GREATER_EQ=91;
    public static final int ROUND_LIST=9;
    public static final int COLON=119;
    public static final int SC=93;
    public static final int L_downto=69;
    public static final int ANY=6;
    public static final int L_random=79;
    public static final int A_NOT_EQUAL=85;
    public static final int BLOCK=27;
    public static final int ASSIGN=32;
    public static final int OBJELEM_ASSIGN=31;
    public static final int U_DOUBLE_COLON=106;
    public static final int ARROW=33;
    public static final int L_case=62;
    public static final int TIMES=96;
    public static final int U_infinity=71;
    public static final int A_LESS_EQ=88;
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

    // $ANTLR start "COMMENT1"
    public final void mCOMMENT1() throws RecognitionException {
        try {
            int _type = COMMENT1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:108:9: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:108:11: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:108:16: ( options {greedy=false; } : . )*
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
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:108:43: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match("*/"); 

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT1"

    // $ANTLR start "Newline"
    public final void mNewline() throws RecognitionException {
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:112:9: ( ( '\\u000A' | '\\u000D' | '\\u0085' | '\\u000C' | '\\u2028' | '\\u2029' ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:112:11: ( '\\u000A' | '\\u000D' | '\\u0085' | '\\u000C' | '\\u2028' | '\\u2029' )
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:116:2: (~ ( '\\u000A' | '\\u000D' | '\\u0085' | '\\u000C' | '\\u2028' | '\\u2029' ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:116:4: ~ ( '\\u000A' | '\\u000D' | '\\u0085' | '\\u000C' | '\\u2028' | '\\u2029' )
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

    // $ANTLR start "COMMENT2"
    public final void mCOMMENT2() throws RecognitionException {
        try {
            int _type = COMMENT2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:118:9: ( '/*/' ( NotNewline )* ( Newline )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:118:11: '/*/' ( NotNewline )* ( Newline )*
            {
            match("/*/"); 

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:118:17: ( NotNewline )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\u0000' && LA2_0<='\t')||LA2_0=='\u000B'||(LA2_0>='\u000E' && LA2_0<='\u0084')||(LA2_0>='\u0086' && LA2_0<='\u2027')||(LA2_0>='\u202A' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:118:17: NotNewline
            	    {
            	    mNotNewline(); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:118:29: ( Newline )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\n'||(LA3_0>='\f' && LA3_0<='\r')||LA3_0=='\u0085'||(LA3_0>='\u2028' && LA3_0<='\u2029')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:118:29: Newline
            	    {
            	    mNewline(); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT2"

    // $ANTLR start "SmallLetter"
    public final void mSmallLetter() throws RecognitionException {
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:123:2: ( 'a' .. 'z' | '\\u00E4' | '\\u00FC' | '\\u00F6' | '\\u00DF' )
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:127:2: ( 'A' .. 'Z' | '\\u00C4' | '\\u00DC' | '\\u00D6' )
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:130:8: ( SmallLetter | BigLetter )
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:134:8: ( '0' .. '9' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:134:10: '0' .. '9'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:137:6: ( Digit | 'A' .. 'F' | 'a' .. 'f' )
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:140:9: ( 'begin' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:140:11: 'begin'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:141:8: ( 'end' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:141:10: 'end'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:143:8: ( 'object' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:143:10: 'object'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:144:8: ( 'with' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:144:10: 'with'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:146:7: ( 'if' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:146:10: 'if'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:147:9: ( 'then' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:147:11: 'then'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:148:8: ( 'else' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:148:10: 'else'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:150:2: ( 'elseif' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:150:4: 'elseif'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:152:9: ( 'while' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:152:11: 'while'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:153:7: ( 'for' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:153:9: 'for'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:154:6: ( 'do' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:154:8: 'do'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:155:9: ( 'yield' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:155:11: 'yield'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:156:9: ( 'match' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:156:11: 'match'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:157:8: ( 'case' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:157:10: 'case'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:158:6: ( 'as' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:158:8: 'as'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:159:7: ( 'val' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:159:9: 'val'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:160:7: ( 'def' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:160:9: 'def'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:161:6: ( 'in' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:161:8: 'in'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:163:2: ( 'exception' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:163:4: 'exception'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:164:7: ( 'to' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:164:10: 'to'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:166:2: ( 'downto' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:166:4: 'downto'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:169:2: ( 'infinity' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:169:4: 'infinity'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:171:2: ( '\\u221E' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:171:4: '\\u221E'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:176:2: ( 'concurrent' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:176:4: 'concurrent'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:179:2: ( 'choose' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:179:4: 'choose'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:181:8: ( 'lazy' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:181:10: 'lazy'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:184:2: ( 'memoize' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:184:4: 'memoize'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:186:8: ( 'true' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:186:10: 'true'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:187:9: ( 'false' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:187:11: 'false'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:189:8: ( 'this' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:189:10: 'this'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:191:9: ( 'random' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:191:11: 'random'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:193:7: ( 'nil' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:193:9: 'nil'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:195:8: ( 'div' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:195:11: 'div'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:197:8: ( 'mod' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:197:10: 'mod'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:201:9: ( '==' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:201:11: '=='
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:203:9: ( '\\u2261' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:203:11: '\\u2261'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:209:2: ( '!=' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:209:4: '!='
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:211:2: ( '\\u2262' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:211:4: '\\u2262'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:216:6: ( '<' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:216:8: '<'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:219:2: ( '<=' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:219:4: '<='
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:221:2: ( '\\u2264' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:221:4: '\\u2264'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:226:9: ( '>' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:226:11: '>'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:229:2: ( '>=' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:229:4: '>='
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:231:2: ( '\\u2265' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:231:4: '\\u2265'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:235:4: ( ';' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:235:6: ';'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:237:6: ( '+' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:237:8: '+'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:238:7: ( '-' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:238:9: '-'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:239:7: ( '*' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:239:9: '*'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:240:9: ( '/' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:240:11: '/'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:241:9: ( '^' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:241:11: '^'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:243:6: ( '|' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:243:8: '|'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:244:7: ( '&' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:244:9: '&'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:245:7: ( '!' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:245:9: '!'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:246:6: ( '\\u2228' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:246:8: '\\u2228'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:247:7: ( '\\u2227' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:247:9: '\\u2227'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:248:7: ( '\\u00AC' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:248:9: '\\u00AC'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:257:2: ( '::' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:257:4: '::'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:259:2: ( '\\u2237' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:259:4: '\\u2237'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:264:2: ( '**' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:264:4: '**'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:266:2: ( '//' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:266:4: '//'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:268:2: ( '++' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:268:4: '++'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:271:2: ( '--' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:271:4: '--'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:274:2: ( '=>' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:274:4: '=>'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:276:2: ( '\\u21D2' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:276:4: '\\u21D2'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:280:9: ( '->' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:280:11: '->'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:281:9: ( '\\u2192' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:281:11: '\\u2192'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:285:11: ( '...' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:285:13: '...'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:287:2: ( '\\u2026' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:287:4: '\\u2026'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:291:8: ( '.' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:291:10: '.'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:293:7: ( ',' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:293:9: ','
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

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:295:7: ( ':' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:295:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "QUESTION_MARK"
    public final void mQUESTION_MARK() throws RecognitionException {
        try {
            int _type = QUESTION_MARK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:297:15: ( '?' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:297:17: '?'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:299:9: ( 'force' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:299:11: 'force'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:302:9: ( '\\u0020' | '\\t' )
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:304:9: ( ( WsChar )+ )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:304:11: ( WsChar )+
            {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:304:11: ( WsChar )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='\t'||LA4_0==' ') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:304:11: WsChar
            	    {
            	    mWsChar(); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:306:4: ( Newline ( WsChar | Newline )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:306:6: Newline ( WsChar | Newline )*
            {
            mNewline(); 
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:306:14: ( WsChar | Newline )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='\t' && LA5_0<='\n')||(LA5_0>='\f' && LA5_0<='\r')||LA5_0==' '||LA5_0=='\u0085'||(LA5_0>='\u2028' && LA5_0<='\u2029')) ) {
                    alt5=1;
                }


                switch (alt5) {
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
    // $ANTLR end "NL"

    // $ANTLR start "Constr"
    public final void mConstr() throws RecognitionException {
        try {
            int _type = Constr;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:308:9: ( BigLetter ( Letter | Digit | '_' )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:308:11: BigLetter ( Letter | Digit | '_' )*
            {
            mBigLetter(); 
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:308:21: ( Letter | Digit | '_' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')||LA6_0=='\u00C4'||LA6_0=='\u00D6'||LA6_0=='\u00DC'||LA6_0=='\u00DF'||LA6_0=='\u00E4'||LA6_0=='\u00F6'||LA6_0=='\u00FC') ) {
                    alt6=1;
                }


                switch (alt6) {
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
            	    break loop6;
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:310:4: ( SmallLetter ( Letter | Digit | '_' )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:310:7: SmallLetter ( Letter | Digit | '_' )*
            {
            mSmallLetter(); 
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:310:19: ( Letter | Digit | '_' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')||(LA7_0>='A' && LA7_0<='Z')||LA7_0=='_'||(LA7_0>='a' && LA7_0<='z')||LA7_0=='\u00C4'||LA7_0=='\u00D6'||LA7_0=='\u00DC'||LA7_0=='\u00DF'||LA7_0=='\u00E4'||LA7_0=='\u00F6'||LA7_0=='\u00FC') ) {
                    alt7=1;
                }


                switch (alt7) {
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
            	    break loop7;
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:312:5: ( ( Digit )+ | '0x' ( Hex )+ | '0b' ( '0' | '1' )+ | '0o' ( '0' .. '7' )+ )
            int alt12=4;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='0') ) {
                switch ( input.LA(2) ) {
                case 'x':
                    {
                    alt12=2;
                    }
                    break;
                case 'b':
                    {
                    alt12=3;
                    }
                    break;
                case 'o':
                    {
                    alt12=4;
                    }
                    break;
                default:
                    alt12=1;}

            }
            else if ( ((LA12_0>='1' && LA12_0<='9')) ) {
                alt12=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:312:7: ( Digit )+
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:312:7: ( Digit )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:312:7: Digit
                    	    {
                    	    mDigit(); 

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
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:313:4: '0x' ( Hex )+
                    {
                    match("0x"); 

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:313:9: ( Hex )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>='0' && LA9_0<='9')||(LA9_0>='A' && LA9_0<='F')||(LA9_0>='a' && LA9_0<='f')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:313:9: Hex
                    	    {
                    	    mHex(); 

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
                case 3 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:314:10: '0b' ( '0' | '1' )+
                    {
                    match("0b"); 

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:314:15: ( '0' | '1' )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>='0' && LA10_0<='1')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
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
                    	    if ( cnt10 >= 1 ) break loop10;
                                EarlyExitException eee =
                                    new EarlyExitException(10, input);
                                throw eee;
                        }
                        cnt10++;
                    } while (true);


                    }
                    break;
                case 4 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:315:10: '0o' ( '0' .. '7' )+
                    {
                    match("0o"); 

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:315:15: ( '0' .. '7' )+
                    int cnt11=0;
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0>='0' && LA11_0<='7')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:315:16: '0' .. '7'
                    	    {
                    	    matchRange('0','7'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt11 >= 1 ) break loop11;
                                EarlyExitException eee =
                                    new EarlyExitException(11, input);
                                throw eee;
                        }
                        cnt11++;
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:318:9: ( '\\\\u' Hex Hex Hex Hex | '\\\\U' Hex Hex Hex Hex Hex Hex Hex Hex )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\\') ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1=='u') ) {
                    alt13=1;
                }
                else if ( (LA13_1=='U') ) {
                    alt13=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:318:11: '\\\\u' Hex Hex Hex Hex
                    {
                    match("\\u"); 

                    mHex(); 
                    mHex(); 
                    mHex(); 
                    mHex(); 

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:319:4: '\\\\U' Hex Hex Hex Hex Hex Hex Hex Hex
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:322:8: ( '\"' (~ ( '\"' | '\\\\' | Newline ) | '\\\\\\\\' | '\\\\\"' | '\\\\n' | '\\\\r' | Charcode )* '\"' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:322:10: '\"' (~ ( '\"' | '\\\\' | Newline ) | '\\\\\\\\' | '\\\\\"' | '\\\\n' | '\\\\r' | Charcode )* '\"'
            {
            match('\"'); 
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:322:13: (~ ( '\"' | '\\\\' | Newline ) | '\\\\\\\\' | '\\\\\"' | '\\\\n' | '\\\\r' | Charcode )*
            loop14:
            do {
                int alt14=7;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\u0000' && LA14_0<='\t')||LA14_0=='\u000B'||(LA14_0>='\u000E' && LA14_0<='!')||(LA14_0>='#' && LA14_0<='[')||(LA14_0>=']' && LA14_0<='\u0084')||(LA14_0>='\u0086' && LA14_0<='\u2027')||(LA14_0>='\u202A' && LA14_0<='\uFFFF')) ) {
                    alt14=1;
                }
                else if ( (LA14_0=='\\') ) {
                    switch ( input.LA(2) ) {
                    case '\\':
                        {
                        alt14=2;
                        }
                        break;
                    case '\"':
                        {
                        alt14=3;
                        }
                        break;
                    case 'n':
                        {
                        alt14=4;
                        }
                        break;
                    case 'r':
                        {
                        alt14=5;
                        }
                        break;
                    case 'U':
                    case 'u':
                        {
                        alt14=6;
                        }
                        break;

                    }

                }


                switch (alt14) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:322:14: ~ ( '\"' | '\\\\' | Newline )
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
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:322:40: '\\\\\\\\'
            	    {
            	    match("\\\\"); 


            	    }
            	    break;
            	case 3 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:322:49: '\\\\\"'
            	    {
            	    match("\\\""); 


            	    }
            	    break;
            	case 4 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:322:57: '\\\\n'
            	    {
            	    match("\\n"); 


            	    }
            	    break;
            	case 5 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:322:65: '\\\\r'
            	    {
            	    match("\\r"); 


            	    }
            	    break;
            	case 6 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:322:73: Charcode
            	    {
            	    mCharcode(); 

            	    }
            	    break;

            	default :
            	    break loop14;
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:325:2: ( '(' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:325:4: '('
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:328:2: ( ')' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:328:4: ')'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:331:2: ( '[' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:331:4: '['
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:334:2: ( ']' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:334:4: ']'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:337:2: ( '{' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:337:4: '{'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:340:2: ( '}' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:340:4: '}'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:342:8: ( '=' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:342:10: '='
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:345:2: ( '_' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:345:4: '_'
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

    public void mTokens() throws RecognitionException {
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:8: ( COMMENT1 | COMMENT2 | L_begin | L_end | L_obj | L_with | L_if | L_then | L_else | L_elseif | L_while | L_for | L_do | L_yield | L_match | L_case | L_as | L_val | L_def | L_in | L_exception | L_to | L_downto | A_infinity | U_infinity | L_concurrent | L_choose | L_lazy | L_memoize | L_true | L_false | L_this | L_random | L_nil | L_div | L_mod | A_EQUAL | U_EQUAL | A_NOT_EQUAL | U_NOT_EQUAL | LESS | A_LESS_EQ | U_LESS_EQ | GREATER | A_GREATER_EQ | U_GREATER_EQ | SC | PLUS | MINUS | TIMES | QUOTIENT | POW_tok | A_OR | A_AND | A_NOT | U_OR | U_AND | U_NOT | A_DOUBLE_COLON | U_DOUBLE_COLON | TIMESTIMES | QUOTIENTQUOTIENT | PLUSPLUS | MINUSMINUS | A_DOUBLE_ARROW | U_DOUBLE_ARROW | A_ARROW | U_ARROW | A_ELLIPSIS | U_ELLIPSIS | PERIOD | COMMA | COLON | QUESTION_MARK | L_force | WS | NL | Constr | Id | Num | String | ROUND_BRACKET_OPEN | ROUND_BRACKET_CLOSE | SQUARE_BRACKET_OPEN | SQUARE_BRACKET_CLOSE | CURLY_BRACKET_OPEN | CURLY_BRACKET_CLOSE | ASSIGN | UNDERSCORE )
        int alt15=89;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:10: COMMENT1
                {
                mCOMMENT1(); 

                }
                break;
            case 2 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:19: COMMENT2
                {
                mCOMMENT2(); 

                }
                break;
            case 3 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:28: L_begin
                {
                mL_begin(); 

                }
                break;
            case 4 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:36: L_end
                {
                mL_end(); 

                }
                break;
            case 5 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:42: L_obj
                {
                mL_obj(); 

                }
                break;
            case 6 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:48: L_with
                {
                mL_with(); 

                }
                break;
            case 7 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:55: L_if
                {
                mL_if(); 

                }
                break;
            case 8 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:60: L_then
                {
                mL_then(); 

                }
                break;
            case 9 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:67: L_else
                {
                mL_else(); 

                }
                break;
            case 10 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:74: L_elseif
                {
                mL_elseif(); 

                }
                break;
            case 11 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:83: L_while
                {
                mL_while(); 

                }
                break;
            case 12 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:91: L_for
                {
                mL_for(); 

                }
                break;
            case 13 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:97: L_do
                {
                mL_do(); 

                }
                break;
            case 14 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:102: L_yield
                {
                mL_yield(); 

                }
                break;
            case 15 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:110: L_match
                {
                mL_match(); 

                }
                break;
            case 16 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:118: L_case
                {
                mL_case(); 

                }
                break;
            case 17 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:125: L_as
                {
                mL_as(); 

                }
                break;
            case 18 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:130: L_val
                {
                mL_val(); 

                }
                break;
            case 19 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:136: L_def
                {
                mL_def(); 

                }
                break;
            case 20 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:142: L_in
                {
                mL_in(); 

                }
                break;
            case 21 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:147: L_exception
                {
                mL_exception(); 

                }
                break;
            case 22 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:159: L_to
                {
                mL_to(); 

                }
                break;
            case 23 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:164: L_downto
                {
                mL_downto(); 

                }
                break;
            case 24 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:173: A_infinity
                {
                mA_infinity(); 

                }
                break;
            case 25 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:184: U_infinity
                {
                mU_infinity(); 

                }
                break;
            case 26 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:195: L_concurrent
                {
                mL_concurrent(); 

                }
                break;
            case 27 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:208: L_choose
                {
                mL_choose(); 

                }
                break;
            case 28 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:217: L_lazy
                {
                mL_lazy(); 

                }
                break;
            case 29 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:224: L_memoize
                {
                mL_memoize(); 

                }
                break;
            case 30 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:234: L_true
                {
                mL_true(); 

                }
                break;
            case 31 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:241: L_false
                {
                mL_false(); 

                }
                break;
            case 32 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:249: L_this
                {
                mL_this(); 

                }
                break;
            case 33 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:256: L_random
                {
                mL_random(); 

                }
                break;
            case 34 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:265: L_nil
                {
                mL_nil(); 

                }
                break;
            case 35 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:271: L_div
                {
                mL_div(); 

                }
                break;
            case 36 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:277: L_mod
                {
                mL_mod(); 

                }
                break;
            case 37 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:283: A_EQUAL
                {
                mA_EQUAL(); 

                }
                break;
            case 38 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:291: U_EQUAL
                {
                mU_EQUAL(); 

                }
                break;
            case 39 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:299: A_NOT_EQUAL
                {
                mA_NOT_EQUAL(); 

                }
                break;
            case 40 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:311: U_NOT_EQUAL
                {
                mU_NOT_EQUAL(); 

                }
                break;
            case 41 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:323: LESS
                {
                mLESS(); 

                }
                break;
            case 42 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:328: A_LESS_EQ
                {
                mA_LESS_EQ(); 

                }
                break;
            case 43 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:338: U_LESS_EQ
                {
                mU_LESS_EQ(); 

                }
                break;
            case 44 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:348: GREATER
                {
                mGREATER(); 

                }
                break;
            case 45 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:356: A_GREATER_EQ
                {
                mA_GREATER_EQ(); 

                }
                break;
            case 46 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:369: U_GREATER_EQ
                {
                mU_GREATER_EQ(); 

                }
                break;
            case 47 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:382: SC
                {
                mSC(); 

                }
                break;
            case 48 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:385: PLUS
                {
                mPLUS(); 

                }
                break;
            case 49 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:390: MINUS
                {
                mMINUS(); 

                }
                break;
            case 50 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:396: TIMES
                {
                mTIMES(); 

                }
                break;
            case 51 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:402: QUOTIENT
                {
                mQUOTIENT(); 

                }
                break;
            case 52 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:411: POW_tok
                {
                mPOW_tok(); 

                }
                break;
            case 53 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:419: A_OR
                {
                mA_OR(); 

                }
                break;
            case 54 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:424: A_AND
                {
                mA_AND(); 

                }
                break;
            case 55 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:430: A_NOT
                {
                mA_NOT(); 

                }
                break;
            case 56 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:436: U_OR
                {
                mU_OR(); 

                }
                break;
            case 57 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:441: U_AND
                {
                mU_AND(); 

                }
                break;
            case 58 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:447: U_NOT
                {
                mU_NOT(); 

                }
                break;
            case 59 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:453: A_DOUBLE_COLON
                {
                mA_DOUBLE_COLON(); 

                }
                break;
            case 60 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:468: U_DOUBLE_COLON
                {
                mU_DOUBLE_COLON(); 

                }
                break;
            case 61 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:483: TIMESTIMES
                {
                mTIMESTIMES(); 

                }
                break;
            case 62 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:494: QUOTIENTQUOTIENT
                {
                mQUOTIENTQUOTIENT(); 

                }
                break;
            case 63 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:511: PLUSPLUS
                {
                mPLUSPLUS(); 

                }
                break;
            case 64 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:520: MINUSMINUS
                {
                mMINUSMINUS(); 

                }
                break;
            case 65 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:531: A_DOUBLE_ARROW
                {
                mA_DOUBLE_ARROW(); 

                }
                break;
            case 66 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:546: U_DOUBLE_ARROW
                {
                mU_DOUBLE_ARROW(); 

                }
                break;
            case 67 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:561: A_ARROW
                {
                mA_ARROW(); 

                }
                break;
            case 68 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:569: U_ARROW
                {
                mU_ARROW(); 

                }
                break;
            case 69 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:577: A_ELLIPSIS
                {
                mA_ELLIPSIS(); 

                }
                break;
            case 70 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:588: U_ELLIPSIS
                {
                mU_ELLIPSIS(); 

                }
                break;
            case 71 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:599: PERIOD
                {
                mPERIOD(); 

                }
                break;
            case 72 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:606: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 73 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:612: COLON
                {
                mCOLON(); 

                }
                break;
            case 74 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:618: QUESTION_MARK
                {
                mQUESTION_MARK(); 

                }
                break;
            case 75 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:632: L_force
                {
                mL_force(); 

                }
                break;
            case 76 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:640: WS
                {
                mWS(); 

                }
                break;
            case 77 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:643: NL
                {
                mNL(); 

                }
                break;
            case 78 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:646: Constr
                {
                mConstr(); 

                }
                break;
            case 79 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:653: Id
                {
                mId(); 

                }
                break;
            case 80 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:656: Num
                {
                mNum(); 

                }
                break;
            case 81 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:660: String
                {
                mString(); 

                }
                break;
            case 82 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:667: ROUND_BRACKET_OPEN
                {
                mROUND_BRACKET_OPEN(); 

                }
                break;
            case 83 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:686: ROUND_BRACKET_CLOSE
                {
                mROUND_BRACKET_CLOSE(); 

                }
                break;
            case 84 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:706: SQUARE_BRACKET_OPEN
                {
                mSQUARE_BRACKET_OPEN(); 

                }
                break;
            case 85 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:726: SQUARE_BRACKET_CLOSE
                {
                mSQUARE_BRACKET_CLOSE(); 

                }
                break;
            case 86 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:747: CURLY_BRACKET_OPEN
                {
                mCURLY_BRACKET_OPEN(); 

                }
                break;
            case 87 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:766: CURLY_BRACKET_CLOSE
                {
                mCURLY_BRACKET_CLOSE(); 

                }
                break;
            case 88 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:786: ASSIGN
                {
                mASSIGN(); 

                }
                break;
            case 89 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:793: UNDERSCORE
                {
                mUNDERSCORE(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\1\uffff\1\74\15\60\1\uffff\3\60\1\134\1\uffff\1\136\1\uffff\1\140"+
        "\1\uffff\1\142\2\uffff\1\144\1\147\1\151\6\uffff\1\153\3\uffff\1"+
        "\155\23\uffff\7\60\1\167\1\171\1\60\1\174\3\60\1\u0081\11\60\1\u008b"+
        "\4\60\24\uffff\1\u0092\1\uffff\1\60\1\u0095\5\60\1\uffff\1\60\1"+
        "\uffff\2\60\1\uffff\1\60\1\u00a0\2\60\1\uffff\1\u00a3\1\u00a4\3"+
        "\60\1\u00a8\3\60\1\uffff\1\u00ac\2\60\1\u00af\2\u0092\1\uffff\1"+
        "\u0092\1\60\1\uffff\1\u00b3\2\60\1\u00b6\2\60\1\u00b9\1\u00ba\1"+
        "\u00bb\1\60\1\uffff\2\60\2\uffff\3\60\1\uffff\1\u00c2\2\60\1\uffff"+
        "\1\u00c5\1\60\1\uffff\1\157\1\u00c7\1\60\1\uffff\2\60\1\uffff\1"+
        "\u00cb\1\60\3\uffff\1\u00cd\1\u00ce\1\60\1\u00d0\1\u00d1\1\60\1"+
        "\uffff\2\60\1\uffff\1\60\1\uffff\1\u00d6\1\60\1\u00d8\1\uffff\1"+
        "\60\2\uffff\1\u00da\2\uffff\2\60\1\u00dd\1\u00de\1\uffff\1\60\1"+
        "\uffff\1\60\1\uffff\1\u00e1\1\60\2\uffff\1\60\1\u00e4\1\uffff\1"+
        "\60\1\u00e6\1\uffff\1\60\1\uffff\1\u00e8\1\uffff";
    static final String DFA15_eofS =
        "\u00e9\uffff";
    static final String DFA15_minS =
        "\1\11\1\52\1\145\1\154\1\142\1\150\1\146\1\150\1\141\1\145\1\151"+
        "\2\141\1\163\1\141\1\uffff\2\141\1\151\1\75\1\uffff\1\75\1\uffff"+
        "\1\75\1\uffff\1\75\2\uffff\1\53\1\55\1\52\6\uffff\1\72\3\uffff\1"+
        "\56\20\uffff\1\0\2\uffff\1\147\1\144\1\163\1\143\1\152\1\164\1\151"+
        "\2\60\1\145\1\60\1\165\1\162\1\154\1\60\1\146\1\166\1\145\1\164"+
        "\1\155\1\144\1\163\1\156\1\157\1\60\1\154\1\172\1\156\1\154\24\uffff"+
        "\1\0\1\uffff\1\151\1\60\3\145\1\150\1\154\1\uffff\1\151\1\uffff"+
        "\1\156\1\163\1\uffff\1\145\1\60\1\163\1\156\1\uffff\2\60\1\154\1"+
        "\143\1\157\1\60\1\145\1\143\1\157\1\uffff\1\60\1\171\1\144\1\60"+
        "\2\0\1\uffff\1\0\1\156\1\uffff\1\60\1\160\1\143\1\60\1\145\1\156"+
        "\3\60\1\145\1\uffff\1\145\1\164\2\uffff\1\144\1\150\1\151\1\uffff"+
        "\1\60\1\165\1\163\1\uffff\1\60\1\157\1\uffff\1\0\1\60\1\146\1\uffff"+
        "\2\164\1\uffff\1\60\1\151\3\uffff\2\60\1\157\2\60\1\172\1\uffff"+
        "\1\162\1\145\1\uffff\1\155\1\uffff\1\60\1\151\1\60\1\uffff\1\164"+
        "\2\uffff\1\60\2\uffff\1\145\1\162\2\60\1\uffff\1\157\1\uffff\1\171"+
        "\1\uffff\1\60\1\145\2\uffff\1\156\1\60\1\uffff\1\156\1\60\1\uffff"+
        "\1\164\1\uffff\1\60\1\uffff";
    static final String DFA15_maxS =
        "\1\u2265\1\57\1\145\1\170\1\142\1\151\1\156\1\162\2\157\1\151\2"+
        "\157\1\163\1\141\1\uffff\2\141\1\151\1\76\1\uffff\1\75\1\uffff\1"+
        "\75\1\uffff\1\75\2\uffff\1\53\1\76\1\52\6\uffff\1\72\3\uffff\1\56"+
        "\20\uffff\1\uffff\2\uffff\1\147\1\144\1\163\1\143\1\152\1\164\1"+
        "\151\2\u00fc\1\151\1\u00fc\1\165\1\162\1\154\1\u00fc\1\146\1\166"+
        "\1\145\1\164\1\155\1\144\1\163\1\156\1\157\1\u00fc\1\154\1\172\1"+
        "\156\1\154\24\uffff\1\uffff\1\uffff\1\151\1\u00fc\3\145\1\150\1"+
        "\154\1\uffff\1\151\1\uffff\1\156\1\163\1\uffff\1\145\1\u00fc\1\163"+
        "\1\156\1\uffff\2\u00fc\1\154\1\143\1\157\1\u00fc\1\145\1\143\1\157"+
        "\1\uffff\1\u00fc\1\171\1\144\1\u00fc\2\uffff\1\uffff\1\uffff\1\156"+
        "\1\uffff\1\u00fc\1\160\1\143\1\u00fc\1\145\1\156\3\u00fc\1\145\1"+
        "\uffff\1\145\1\164\2\uffff\1\144\1\150\1\151\1\uffff\1\u00fc\1\165"+
        "\1\163\1\uffff\1\u00fc\1\157\1\uffff\1\uffff\1\u00fc\1\146\1\uffff"+
        "\2\164\1\uffff\1\u00fc\1\151\3\uffff\2\u00fc\1\157\2\u00fc\1\172"+
        "\1\uffff\1\162\1\145\1\uffff\1\155\1\uffff\1\u00fc\1\151\1\u00fc"+
        "\1\uffff\1\164\2\uffff\1\u00fc\2\uffff\1\145\1\162\2\u00fc\1\uffff"+
        "\1\157\1\uffff\1\171\1\uffff\1\u00fc\1\145\2\uffff\1\156\1\u00fc"+
        "\1\uffff\1\156\1\u00fc\1\uffff\1\164\1\uffff\1\u00fc\1\uffff";
    static final String DFA15_acceptS =
        "\17\uffff\1\31\4\uffff\1\46\1\uffff\1\50\1\uffff\1\53\1\uffff\1"+
        "\56\1\57\3\uffff\1\64\1\65\1\66\1\70\1\71\1\72\1\uffff\1\74\1\102"+
        "\1\104\1\uffff\1\106\1\110\1\112\1\114\1\115\1\116\1\117\1\120\1"+
        "\121\1\122\1\123\1\124\1\125\1\126\1\127\1\131\1\uffff\1\76\1\63"+
        "\35\uffff\1\45\1\101\1\130\1\47\1\67\1\52\1\51\1\55\1\54\1\77\1"+
        "\60\1\100\1\103\1\61\1\75\1\62\1\73\1\111\1\105\1\107\1\uffff\1"+
        "\1\7\uffff\1\7\1\uffff\1\24\2\uffff\1\26\4\uffff\1\15\11\uffff\1"+
        "\21\6\uffff\1\2\2\uffff\1\4\12\uffff\1\14\2\uffff\1\23\1\43\3\uffff"+
        "\1\44\3\uffff\1\22\2\uffff\1\42\3\uffff\1\11\2\uffff\1\6\2\uffff"+
        "\1\10\1\40\1\36\6\uffff\1\20\2\uffff\1\34\1\uffff\1\3\3\uffff\1"+
        "\13\1\uffff\1\113\1\37\1\uffff\1\16\1\17\4\uffff\1\12\1\uffff\1"+
        "\5\1\uffff\1\27\2\uffff\1\33\1\41\2\uffff\1\35\2\uffff\1\30\1\uffff"+
        "\1\25\1\uffff\1\32";
    static final String DFA15_specialS =
        "\72\uffff\1\5\63\uffff\1\1\41\uffff\1\0\1\2\1\uffff\1\4\34\uffff"+
        "\1\3\70\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\55\1\56\1\uffff\2\56\22\uffff\1\55\1\25\1\62\3\uffff\1\41"+
            "\1\uffff\1\63\1\64\1\36\1\34\1\53\1\35\1\51\1\1\12\61\1\45\1"+
            "\33\1\27\1\23\1\31\1\54\1\uffff\32\57\1\65\1\uffff\1\66\1\37"+
            "\1\71\1\uffff\1\15\1\2\1\14\1\11\1\3\1\10\2\60\1\6\2\60\1\20"+
            "\1\13\1\22\1\4\2\60\1\21\1\60\1\7\1\60\1\16\1\5\1\60\1\12\1"+
            "\60\1\67\1\40\1\70\7\uffff\1\56\46\uffff\1\44\27\uffff\1\57"+
            "\21\uffff\1\57\5\uffff\1\57\2\uffff\1\60\4\uffff\1\60\21\uffff"+
            "\1\60\5\uffff\1\60\u1f29\uffff\1\52\1\uffff\2\56\u0168\uffff"+
            "\1\50\77\uffff\1\47\113\uffff\1\17\10\uffff\1\43\1\42\16\uffff"+
            "\1\46\51\uffff\1\24\1\26\1\uffff\1\30\1\32",
            "\1\72\4\uffff\1\73",
            "\1\75",
            "\1\77\1\uffff\1\76\11\uffff\1\100",
            "\1\101",
            "\1\103\1\102",
            "\1\104\7\uffff\1\105",
            "\1\106\6\uffff\1\107\2\uffff\1\110",
            "\1\112\15\uffff\1\111",
            "\1\114\3\uffff\1\115\5\uffff\1\113",
            "\1\116",
            "\1\117\3\uffff\1\120\11\uffff\1\121",
            "\1\122\6\uffff\1\124\6\uffff\1\123",
            "\1\125",
            "\1\126",
            "",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132\1\133",
            "",
            "\1\135",
            "",
            "\1\137",
            "",
            "\1\141",
            "",
            "",
            "\1\143",
            "\1\145\20\uffff\1\146",
            "\1\150",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\152",
            "",
            "",
            "",
            "\1\154",
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
            "\57\157\1\156\uffd0\157",
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
            "",
            "\12\u0093\1\u0091\1\u0093\2\u0091\34\u0093\1\u0090\132\u0093"+
            "\1\u0091\u1fa2\u0093\2\u0091\udfd6\u0093",
            "",
            "\1\u0094",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60\111\uffff\1"+
            "\60\21\uffff\1\60\5\uffff\1\60\2\uffff\1\60\4\uffff\1\60\21"+
            "\uffff\1\60\5\uffff\1\60",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "",
            "\1\u009b",
            "",
            "\1\u009c",
            "\1\u009d",
            "",
            "\1\u009e",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\2\60\1\u009f\27\60"+
            "\111\uffff\1\60\21\uffff\1\60\5\uffff\1\60\2\uffff\1\60\4\uffff"+
            "\1\60\21\uffff\1\60\5\uffff\1\60",
            "\1\u00a1",
            "\1\u00a2",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60\111\uffff\1"+
            "\60\21\uffff\1\60\5\uffff\1\60\2\uffff\1\60\4\uffff\1\60\21"+
            "\uffff\1\60\5\uffff\1\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60\111\uffff\1"+
            "\60\21\uffff\1\60\5\uffff\1\60\2\uffff\1\60\4\uffff\1\60\21"+
            "\uffff\1\60\5\uffff\1\60",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60\111\uffff\1"+
            "\60\21\uffff\1\60\5\uffff\1\60\2\uffff\1\60\4\uffff\1\60\21"+
            "\uffff\1\60\5\uffff\1\60",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60\111\uffff\1"+
            "\60\21\uffff\1\60\5\uffff\1\60\2\uffff\1\60\4\uffff\1\60\21"+
            "\uffff\1\60\5\uffff\1\60",
            "\1\u00ad",
            "\1\u00ae",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60\111\uffff\1"+
            "\60\21\uffff\1\60\5\uffff\1\60\2\uffff\1\60\4\uffff\1\60\21"+
            "\uffff\1\60\5\uffff\1\60",
            "\12\u0093\1\u0091\1\u0093\2\u0091\34\u0093\1\u0090\4\u0093"+
            "\1\u00b0\125\u0093\1\u0091\u1fa2\u0093\2\u0091\udfd6\u0093",
            "\12\157\1\u0091\1\157\2\u0091\167\157\1\u0091\u1fa2\157\2\u0091"+
            "\udfd6\157",
            "",
            "\12\u0093\1\u0091\1\u0093\2\u0091\34\u0093\1\u0090\132\u0093"+
            "\1\u0091\u1fa2\u0093\2\u0091\udfd6\u0093",
            "\1\u00b1",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\10\60\1\u00b2\21"+
            "\60\111\uffff\1\60\21\uffff\1\60\5\uffff\1\60\2\uffff\1\60\4"+
            "\uffff\1\60\21\uffff\1\60\5\uffff\1\60",
            "\1\u00b4",
            "\1\u00b5",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60\111\uffff\1"+
            "\60\21\uffff\1\60\5\uffff\1\60\2\uffff\1\60\4\uffff\1\60\21"+
            "\uffff\1\60\5\uffff\1\60",
            "\1\u00b7",
            "\1\u00b8",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60\111\uffff\1"+
            "\60\21\uffff\1\60\5\uffff\1\60\2\uffff\1\60\4\uffff\1\60\21"+
            "\uffff\1\60\5\uffff\1\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60\111\uffff\1"+
            "\60\21\uffff\1\60\5\uffff\1\60\2\uffff\1\60\4\uffff\1\60\21"+
            "\uffff\1\60\5\uffff\1\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60\111\uffff\1"+
            "\60\21\uffff\1\60\5\uffff\1\60\2\uffff\1\60\4\uffff\1\60\21"+
            "\uffff\1\60\5\uffff\1\60",
            "\1\u00bc",
            "",
            "\1\u00bd",
            "\1\u00be",
            "",
            "",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60\111\uffff\1"+
            "\60\21\uffff\1\60\5\uffff\1\60\2\uffff\1\60\4\uffff\1\60\21"+
            "\uffff\1\60\5\uffff\1\60",
            "\1\u00c3",
            "\1\u00c4",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60\111\uffff\1"+
            "\60\21\uffff\1\60\5\uffff\1\60\2\uffff\1\60\4\uffff\1\60\21"+
            "\uffff\1\60\5\uffff\1\60",
            "\1\u00c6",
            "",
            "\12\u0093\1\u0091\1\u0093\2\u0091\34\u0093\1\u0090\132\u0093"+
            "\1\u0091\u1fa2\u0093\2\u0091\udfd6\u0093",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60\111\uffff\1"+
            "\60\21\uffff\1\60\5\uffff\1\60\2\uffff\1\60\4\uffff\1\60\21"+
            "\uffff\1\60\5\uffff\1\60",
            "\1\u00c8",
            "",
            "\1\u00c9",
            "\1\u00ca",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60\111\uffff\1"+
            "\60\21\uffff\1\60\5\uffff\1\60\2\uffff\1\60\4\uffff\1\60\21"+
            "\uffff\1\60\5\uffff\1\60",
            "\1\u00cc",
            "",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60\111\uffff\1"+
            "\60\21\uffff\1\60\5\uffff\1\60\2\uffff\1\60\4\uffff\1\60\21"+
            "\uffff\1\60\5\uffff\1\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60\111\uffff\1"+
            "\60\21\uffff\1\60\5\uffff\1\60\2\uffff\1\60\4\uffff\1\60\21"+
            "\uffff\1\60\5\uffff\1\60",
            "\1\u00cf",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60\111\uffff\1"+
            "\60\21\uffff\1\60\5\uffff\1\60\2\uffff\1\60\4\uffff\1\60\21"+
            "\uffff\1\60\5\uffff\1\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60\111\uffff\1"+
            "\60\21\uffff\1\60\5\uffff\1\60\2\uffff\1\60\4\uffff\1\60\21"+
            "\uffff\1\60\5\uffff\1\60",
            "\1\u00d2",
            "",
            "\1\u00d3",
            "\1\u00d4",
            "",
            "\1\u00d5",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60\111\uffff\1"+
            "\60\21\uffff\1\60\5\uffff\1\60\2\uffff\1\60\4\uffff\1\60\21"+
            "\uffff\1\60\5\uffff\1\60",
            "\1\u00d7",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60\111\uffff\1"+
            "\60\21\uffff\1\60\5\uffff\1\60\2\uffff\1\60\4\uffff\1\60\21"+
            "\uffff\1\60\5\uffff\1\60",
            "",
            "\1\u00d9",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60\111\uffff\1"+
            "\60\21\uffff\1\60\5\uffff\1\60\2\uffff\1\60\4\uffff\1\60\21"+
            "\uffff\1\60\5\uffff\1\60",
            "",
            "",
            "\1\u00db",
            "\1\u00dc",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60\111\uffff\1"+
            "\60\21\uffff\1\60\5\uffff\1\60\2\uffff\1\60\4\uffff\1\60\21"+
            "\uffff\1\60\5\uffff\1\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60\111\uffff\1"+
            "\60\21\uffff\1\60\5\uffff\1\60\2\uffff\1\60\4\uffff\1\60\21"+
            "\uffff\1\60\5\uffff\1\60",
            "",
            "\1\u00df",
            "",
            "\1\u00e0",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60\111\uffff\1"+
            "\60\21\uffff\1\60\5\uffff\1\60\2\uffff\1\60\4\uffff\1\60\21"+
            "\uffff\1\60\5\uffff\1\60",
            "\1\u00e2",
            "",
            "",
            "\1\u00e3",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60\111\uffff\1"+
            "\60\21\uffff\1\60\5\uffff\1\60\2\uffff\1\60\4\uffff\1\60\21"+
            "\uffff\1\60\5\uffff\1\60",
            "",
            "\1\u00e5",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60\111\uffff\1"+
            "\60\21\uffff\1\60\5\uffff\1\60\2\uffff\1\60\4\uffff\1\60\21"+
            "\uffff\1\60\5\uffff\1\60",
            "",
            "\1\u00e7",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60\111\uffff\1"+
            "\60\21\uffff\1\60\5\uffff\1\60\2\uffff\1\60\4\uffff\1\60\21"+
            "\uffff\1\60\5\uffff\1\60",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( COMMENT1 | COMMENT2 | L_begin | L_end | L_obj | L_with | L_if | L_then | L_else | L_elseif | L_while | L_for | L_do | L_yield | L_match | L_case | L_as | L_val | L_def | L_in | L_exception | L_to | L_downto | A_infinity | U_infinity | L_concurrent | L_choose | L_lazy | L_memoize | L_true | L_false | L_this | L_random | L_nil | L_div | L_mod | A_EQUAL | U_EQUAL | A_NOT_EQUAL | U_NOT_EQUAL | LESS | A_LESS_EQ | U_LESS_EQ | GREATER | A_GREATER_EQ | U_GREATER_EQ | SC | PLUS | MINUS | TIMES | QUOTIENT | POW_tok | A_OR | A_AND | A_NOT | U_OR | U_AND | U_NOT | A_DOUBLE_COLON | U_DOUBLE_COLON | TIMESTIMES | QUOTIENTQUOTIENT | PLUSPLUS | MINUSMINUS | A_DOUBLE_ARROW | U_DOUBLE_ARROW | A_ARROW | U_ARROW | A_ELLIPSIS | U_ELLIPSIS | PERIOD | COMMA | COLON | QUESTION_MARK | L_force | WS | NL | Constr | Id | Num | String | ROUND_BRACKET_OPEN | ROUND_BRACKET_CLOSE | SQUARE_BRACKET_OPEN | SQUARE_BRACKET_CLOSE | CURLY_BRACKET_OPEN | CURLY_BRACKET_CLOSE | ASSIGN | UNDERSCORE );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_144 = input.LA(1);

                        s = -1;
                        if ( (LA15_144=='/') ) {s = 176;}

                        else if ( (LA15_144=='\n'||(LA15_144>='\f' && LA15_144<='\r')||LA15_144=='\u0085'||(LA15_144>='\u2028' && LA15_144<='\u2029')) ) {s = 145;}

                        else if ( (LA15_144=='*') ) {s = 144;}

                        else if ( ((LA15_144>='\u0000' && LA15_144<='\t')||LA15_144=='\u000B'||(LA15_144>='\u000E' && LA15_144<=')')||(LA15_144>='+' && LA15_144<='.')||(LA15_144>='0' && LA15_144<='\u0084')||(LA15_144>='\u0086' && LA15_144<='\u2027')||(LA15_144>='\u202A' && LA15_144<='\uFFFF')) ) {s = 147;}

                        else s = 146;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_110 = input.LA(1);

                        s = -1;
                        if ( (LA15_110=='*') ) {s = 144;}

                        else if ( (LA15_110=='\n'||(LA15_110>='\f' && LA15_110<='\r')||LA15_110=='\u0085'||(LA15_110>='\u2028' && LA15_110<='\u2029')) ) {s = 145;}

                        else if ( ((LA15_110>='\u0000' && LA15_110<='\t')||LA15_110=='\u000B'||(LA15_110>='\u000E' && LA15_110<=')')||(LA15_110>='+' && LA15_110<='\u0084')||(LA15_110>='\u0086' && LA15_110<='\u2027')||(LA15_110>='\u202A' && LA15_110<='\uFFFF')) ) {s = 147;}

                        else s = 146;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_145 = input.LA(1);

                        s = -1;
                        if ( (LA15_145=='\n'||(LA15_145>='\f' && LA15_145<='\r')||LA15_145=='\u0085'||(LA15_145>='\u2028' && LA15_145<='\u2029')) ) {s = 145;}

                        else if ( ((LA15_145>='\u0000' && LA15_145<='\t')||LA15_145=='\u000B'||(LA15_145>='\u000E' && LA15_145<='\u0084')||(LA15_145>='\u0086' && LA15_145<='\u2027')||(LA15_145>='\u202A' && LA15_145<='\uFFFF')) ) {s = 111;}

                        else s = 146;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA15_176 = input.LA(1);

                        s = -1;
                        if ( (LA15_176=='\n'||(LA15_176>='\f' && LA15_176<='\r')||LA15_176=='\u0085'||(LA15_176>='\u2028' && LA15_176<='\u2029')) ) {s = 145;}

                        else if ( (LA15_176=='*') ) {s = 144;}

                        else if ( ((LA15_176>='\u0000' && LA15_176<='\t')||LA15_176=='\u000B'||(LA15_176>='\u000E' && LA15_176<=')')||(LA15_176>='+' && LA15_176<='\u0084')||(LA15_176>='\u0086' && LA15_176<='\u2027')||(LA15_176>='\u202A' && LA15_176<='\uFFFF')) ) {s = 147;}

                        else s = 111;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA15_147 = input.LA(1);

                        s = -1;
                        if ( (LA15_147=='\n'||(LA15_147>='\f' && LA15_147<='\r')||LA15_147=='\u0085'||(LA15_147>='\u2028' && LA15_147<='\u2029')) ) {s = 145;}

                        else if ( (LA15_147=='*') ) {s = 144;}

                        else if ( ((LA15_147>='\u0000' && LA15_147<='\t')||LA15_147=='\u000B'||(LA15_147>='\u000E' && LA15_147<=')')||(LA15_147>='+' && LA15_147<='\u0084')||(LA15_147>='\u0086' && LA15_147<='\u2027')||(LA15_147>='\u202A' && LA15_147<='\uFFFF')) ) {s = 147;}

                        else s = 146;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA15_58 = input.LA(1);

                        s = -1;
                        if ( (LA15_58=='/') ) {s = 110;}

                        else if ( ((LA15_58>='\u0000' && LA15_58<='.')||(LA15_58>='0' && LA15_58<='\uFFFF')) ) {s = 111;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}