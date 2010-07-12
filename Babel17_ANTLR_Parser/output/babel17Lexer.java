// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g 2010-07-07 11:55:52

package com.babel17.antlr;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class babel17Lexer extends Lexer {
    public static final int L_end=53;
    public static final int PACKAGE=36;
    public static final int U_AND=114;
    public static final int COMMENT1=43;
    public static final int MODULE_PATH=35;
    public static final int COMMENT2=46;
    public static final int U_NOT_EQUAL=94;
    public static final int TIMESTIMES=118;
    public static final int BigLetter=48;
    public static final int ROUND_BRACKET_CLOSE=140;
    public static final int MOD=107;
    public static final int A_OR=110;
    public static final int MINUSMINUS=120;
    public static final int Newline=44;
    public static final int SQUARE_BRACKET_CLOSE=142;
    public static final int L_protected=77;
    public static final int EOF=-1;
    public static final int U_DOUBLE_ARROW=122;
    public static final int L_exception=70;
    public static final int EMPTY_MAP=15;
    public static final int GREATER=98;
    public static final int Num=136;
    public static final int POW=24;
    public static final int L_concurrent=81;
    public static final int L_false=86;
    public static final int L_await=82;
    public static final int UNRELATED=101;
    public static final int L_with=55;
    public static final int LIST_CONS=10;
    public static final int BEGIN=26;
    public static final int LESS=95;
    public static final int QUESTION_MARK=129;
    public static final int SQUARE_LIST=8;
    public static final int ROUND_BRACKET_OPEN=139;
    public static final int VAL=28;
    public static final int L_as=66;
    public static final int MESSAGE_SEND=22;
    public static final int NL=133;
    public static final int A_ARROW=123;
    public static final int A_DOUBLE_COLON=116;
    public static final int L_def=68;
    public static final int A_AND=111;
    public static final int EXCEPTION=16;
    public static final int L_root=79;
    public static final int L_this=87;
    public static final int PERIOD=127;
    public static final int SmallLetter=47;
    public static final int CURLY_BRACKET_OPEN=143;
    public static final int UNDERSCORE=145;
    public static final int MATCH=17;
    public static final int U_LESS_EQ=97;
    public static final int MEM_STRONG=40;
    public static final int L_to=71;
    public static final int WS=132;
    public static final int NIL=5;
    public static final int Charcode=137;
    public static final int L_do=62;
    public static final int L_val=67;
    public static final int L_match=64;
    public static final int L_obj=54;
    public static final int WsChar=131;
    public static final int L_module=75;
    public static final int Hex=51;
    public static final int L_private=76;
    public static final int CONCURRENT=38;
    public static final int L_for=61;
    public static final int Letter=49;
    public static final int APPLY=12;
    public static final int U_ARROW=124;
    public static final int L_else=58;
    public static final int A_EQUAL=91;
    public static final int DEF=30;
    public static final int L_begin=52;
    public static final int U_NOT=115;
    public static final int L_yield=63;
    public static final int PLUSPLUS=119;
    public static final int ATTRIBUTE=31;
    public static final int L_while=60;
    public static final int CASES=18;
    public static final int L_here=88;
    public static final int POW_tok=108;
    public static final int IF_PATTERN=42;
    public static final int A_ELLIPSIS=125;
    public static final int A_DOUBLE_ARROW=121;
    public static final int SQUARE_BRACKET_OPEN=141;
    public static final int IF=13;
    public static final int PROG=4;
    public static final int U_OR=113;
    public static final int OBJ=19;
    public static final int COMMA=128;
    public static final int MEMOIZE=39;
    public static final int U_ELLIPSIS=126;
    public static final int YIELD=32;
    public static final int TILDE=130;
    public static final int COMPARE=11;
    public static final int U_EQUAL=92;
    public static final int U_GREATER_EQ=100;
    public static final int PLUS=103;
    public static final int LAMBDA=7;
    public static final int String=138;
    public static final int L_true=85;
    public static final int A_infinity=73;
    public static final int Id=135;
    public static final int MODULE_KEY=109;
    public static final int WITH=27;
    public static final int L_in=69;
    public static final int A_NOT=112;
    public static final int LAZY=37;
    public static final int L_lazy=83;
    public static final int L_public=78;
    public static final int L_then=57;
    public static final int NotNewline=45;
    public static final int L_if=56;
    public static final int FOR_EXPR=20;
    public static final int UMINUS=23;
    public static final int CURLY_BRACKET_CLOSE=144;
    public static final int Constr=134;
    public static final int WHILE_DO=21;
    public static final int L_elseif=59;
    public static final int MINUS=104;
    public static final int Digit=50;
    public static final int L_package=90;
    public static final int L_memoize=84;
    public static final int MEM_WEAK=41;
    public static final int A_GREATER_EQ=99;
    public static final int ROUND_LIST=9;
    public static final int COLON=146;
    public static final int SC=102;
    public static final int L_external=80;
    public static final int L_downto=72;
    public static final int ANY=6;
    public static final int L_random=89;
    public static final int BLOCK=25;
    public static final int A_NOT_EQUAL=93;
    public static final int ASSIGN=29;
    public static final int U_DOUBLE_COLON=117;
    public static final int L_case=65;
    public static final int MAP_OR_SET=14;
    public static final int DIV=106;
    public static final int TIMES=105;
    public static final int U_infinity=74;
    public static final int A_LESS_EQ=96;
    public static final int MODULE_DEF=33;
    public static final int MODULE_DECL=34;


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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:113:9: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:113:11: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:113:16: ( options {greedy=false; } : . )*
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
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:113:43: .
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:117:9: ( ( '\\u000A' | '\\u000D' | '\\u0085' | '\\u000C' | '\\u2028' | '\\u2029' ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:117:11: ( '\\u000A' | '\\u000D' | '\\u0085' | '\\u000C' | '\\u2028' | '\\u2029' )
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:121:2: (~ ( '\\u000A' | '\\u000D' | '\\u0085' | '\\u000C' | '\\u2028' | '\\u2029' ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:121:4: ~ ( '\\u000A' | '\\u000D' | '\\u0085' | '\\u000C' | '\\u2028' | '\\u2029' )
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:123:9: ( '//' ( NotNewline )* ( Newline )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:123:11: '//' ( NotNewline )* ( Newline )*
            {
            match("//"); 

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:123:16: ( NotNewline )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\u0000' && LA2_0<='\t')||LA2_0=='\u000B'||(LA2_0>='\u000E' && LA2_0<='\u0084')||(LA2_0>='\u0086' && LA2_0<='\u2027')||(LA2_0>='\u202A' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:123:16: NotNewline
            	    {
            	    mNotNewline(); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:123:28: ( Newline )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\n'||(LA3_0>='\f' && LA3_0<='\r')||LA3_0=='\u0085'||(LA3_0>='\u2028' && LA3_0<='\u2029')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:123:28: Newline
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:128:2: ( 'a' .. 'z' | '\\u00E4' | '\\u00FC' | '\\u00F6' | '\\u00DF' )
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:132:2: ( 'A' .. 'Z' | '\\u00C4' | '\\u00DC' | '\\u00D6' )
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:135:8: ( SmallLetter | BigLetter )
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:139:8: ( '0' .. '9' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:139:10: '0' .. '9'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:142:6: ( Digit | 'A' .. 'F' | 'a' .. 'f' )
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:145:9: ( 'begin' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:145:11: 'begin'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:146:8: ( 'end' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:146:10: 'end'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:148:8: ( 'object' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:148:10: 'object'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:149:8: ( 'with' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:149:10: 'with'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:151:7: ( 'if' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:151:10: 'if'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:152:9: ( 'then' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:152:11: 'then'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:153:8: ( 'else' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:153:10: 'else'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:155:2: ( 'elseif' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:155:4: 'elseif'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:157:9: ( 'while' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:157:11: 'while'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:158:7: ( 'for' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:158:9: 'for'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:159:6: ( 'do' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:159:8: 'do'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:160:9: ( 'yield' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:160:11: 'yield'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:161:9: ( 'match' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:161:11: 'match'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:162:8: ( 'case' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:162:10: 'case'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:163:6: ( 'as' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:163:8: 'as'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:164:7: ( 'val' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:164:9: 'val'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:165:7: ( 'def' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:165:9: 'def'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:166:6: ( 'in' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:166:8: 'in'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:168:2: ( 'exception' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:168:4: 'exception'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:169:7: ( 'to' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:169:10: 'to'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:171:2: ( 'downto' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:171:4: 'downto'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:174:2: ( 'infinity' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:174:4: 'infinity'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:176:2: ( '\\u221E' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:176:4: '\\u221E'
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

    // $ANTLR start "L_module"
    public final void mL_module() throws RecognitionException {
        try {
            int _type = L_module;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:181:9: ( 'module' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:181:11: 'module'
            {
            match("module"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "L_module"

    // $ANTLR start "L_private"
    public final void mL_private() throws RecognitionException {
        try {
            int _type = L_private;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:183:2: ( 'private' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:183:4: 'private'
            {
            match("private"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "L_private"

    // $ANTLR start "L_protected"
    public final void mL_protected() throws RecognitionException {
        try {
            int _type = L_protected;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:185:2: ( 'protected' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:185:4: 'protected'
            {
            match("protected"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "L_protected"

    // $ANTLR start "L_public"
    public final void mL_public() throws RecognitionException {
        try {
            int _type = L_public;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:186:9: ( 'public' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:186:11: 'public'
            {
            match("public"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "L_public"

    // $ANTLR start "L_root"
    public final void mL_root() throws RecognitionException {
        try {
            int _type = L_root;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:187:8: ( 'root' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:187:10: 'root'
            {
            match("root"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "L_root"

    // $ANTLR start "L_external"
    public final void mL_external() throws RecognitionException {
        try {
            int _type = L_external;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:189:2: ( 'external' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:189:4: 'external'
            {
            match("external"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "L_external"

    // $ANTLR start "L_concurrent"
    public final void mL_concurrent() throws RecognitionException {
        try {
            int _type = L_concurrent;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:192:2: ( 'concurrent' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:192:4: 'concurrent'
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

    // $ANTLR start "L_await"
    public final void mL_await() throws RecognitionException {
        try {
            int _type = L_await;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:194:9: ( 'await' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:194:11: 'await'
            {
            match("await"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "L_await"

    // $ANTLR start "L_lazy"
    public final void mL_lazy() throws RecognitionException {
        try {
            int _type = L_lazy;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:196:8: ( 'lazy' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:196:10: 'lazy'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:199:2: ( 'memoize' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:199:4: 'memoize'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:201:8: ( 'true' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:201:10: 'true'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:202:9: ( 'false' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:202:11: 'false'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:204:8: ( 'this' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:204:10: 'this'
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

    // $ANTLR start "L_here"
    public final void mL_here() throws RecognitionException {
        try {
            int _type = L_here;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:205:8: ( 'here' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:205:10: 'here'
            {
            match("here"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "L_here"

    // $ANTLR start "L_random"
    public final void mL_random() throws RecognitionException {
        try {
            int _type = L_random;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:207:9: ( 'random' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:207:11: 'random'
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

    // $ANTLR start "L_package"
    public final void mL_package() throws RecognitionException {
        try {
            int _type = L_package;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:210:2: ( 'package' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:210:4: 'package'
            {
            match("package"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "L_package"

    // $ANTLR start "A_EQUAL"
    public final void mA_EQUAL() throws RecognitionException {
        try {
            int _type = A_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:213:9: ( '==' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:213:11: '=='
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:215:9: ( '\\u2261' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:215:11: '\\u2261'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:221:2: ( '!=' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:221:4: '!='
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:223:2: ( '\\u2262' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:223:4: '\\u2262'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:228:6: ( '<' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:228:8: '<'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:231:2: ( '<=' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:231:4: '<='
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:233:2: ( '\\u2264' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:233:4: '\\u2264'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:238:9: ( '>' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:238:11: '>'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:241:2: ( '>=' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:241:4: '>='
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:243:2: ( '\\u2265' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:243:4: '\\u2265'
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

    // $ANTLR start "UNRELATED"
    public final void mUNRELATED() throws RecognitionException {
        try {
            int _type = UNRELATED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:248:2: ( '<>' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:248:4: '<>'
            {
            match("<>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UNRELATED"

    // $ANTLR start "SC"
    public final void mSC() throws RecognitionException {
        try {
            int _type = SC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:250:4: ( ';' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:250:6: ';'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:252:6: ( '+' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:252:8: '+'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:253:7: ( '-' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:253:9: '-'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:254:7: ( '*' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:254:9: '*'
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

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:255:5: ( '/' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:255:7: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DIV"

    // $ANTLR start "MOD"
    public final void mMOD() throws RecognitionException {
        try {
            int _type = MOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:256:5: ( '%' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:256:7: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MOD"

    // $ANTLR start "POW_tok"
    public final void mPOW_tok() throws RecognitionException {
        try {
            int _type = POW_tok;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:257:9: ( '^' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:257:11: '^'
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

    // $ANTLR start "MODULE_KEY"
    public final void mMODULE_KEY() throws RecognitionException {
        try {
            int _type = MODULE_KEY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:259:2: ( '@' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:259:4: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MODULE_KEY"

    // $ANTLR start "A_OR"
    public final void mA_OR() throws RecognitionException {
        try {
            int _type = A_OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:261:6: ( '|' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:261:8: '|'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:262:7: ( '&' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:262:9: '&'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:263:7: ( '!' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:263:9: '!'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:264:6: ( '\\u2228' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:264:8: '\\u2228'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:265:7: ( '\\u2227' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:265:9: '\\u2227'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:266:7: ( '\\u00AC' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:266:9: '\\u00AC'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:275:2: ( '::' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:275:4: '::'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:277:2: ( '\\u2237' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:277:4: '\\u2237'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:283:2: ( '**' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:283:4: '**'
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

    // $ANTLR start "PLUSPLUS"
    public final void mPLUSPLUS() throws RecognitionException {
        try {
            int _type = PLUSPLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:285:2: ( '++' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:285:4: '++'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:288:2: ( '--' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:288:4: '--'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:291:2: ( '=>' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:291:4: '=>'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:293:2: ( '\\u21D2' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:293:4: '\\u21D2'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:297:9: ( '->' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:297:11: '->'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:298:9: ( '\\u2192' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:298:11: '\\u2192'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:302:11: ( '...' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:302:13: '...'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:304:2: ( '\\u2026' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:304:4: '\\u2026'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:308:8: ( '.' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:308:10: '.'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:310:7: ( ',' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:310:9: ','
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:312:15: ( '?' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:312:17: '?'
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

    // $ANTLR start "TILDE"
    public final void mTILDE() throws RecognitionException {
        try {
            int _type = TILDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:314:7: ( '\\~' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:314:9: '\\~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TILDE"

    // $ANTLR start "WsChar"
    public final void mWsChar() throws RecognitionException {
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:317:9: ( '\\u0020' | '\\t' )
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:319:9: ( ( WsChar )+ )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:319:11: ( WsChar )+
            {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:319:11: ( WsChar )+
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
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:319:11: WsChar
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:321:4: ( Newline ( WsChar | Newline )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:321:6: Newline ( WsChar | Newline )*
            {
            mNewline(); 
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:321:14: ( WsChar | Newline )*
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:323:9: ( BigLetter ( Letter | Digit | '_' )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:323:11: BigLetter ( Letter | Digit | '_' )*
            {
            mBigLetter(); 
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:323:21: ( Letter | Digit | '_' )*
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:325:4: ( SmallLetter ( Letter | Digit | '_' )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:325:7: SmallLetter ( Letter | Digit | '_' )*
            {
            mSmallLetter(); 
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:325:19: ( Letter | Digit | '_' )*
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:327:5: ( ( Digit )+ | '0x' ( Hex )+ | '0b' ( '0' | '1' )+ | '0o' ( '0' .. '7' )+ )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:327:7: ( Digit )+
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:327:7: ( Digit )+
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
                    	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:327:7: Digit
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:328:4: '0x' ( Hex )+
                    {
                    match("0x"); 

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:328:9: ( Hex )+
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
                    	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:328:9: Hex
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:329:10: '0b' ( '0' | '1' )+
                    {
                    match("0b"); 

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:329:15: ( '0' | '1' )+
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:330:10: '0o' ( '0' .. '7' )+
                    {
                    match("0o"); 

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:330:15: ( '0' .. '7' )+
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
                    	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:330:16: '0' .. '7'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:333:9: ( '\\\\u' Hex Hex Hex Hex | '\\\\U' Hex Hex Hex Hex Hex Hex Hex Hex )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:333:11: '\\\\u' Hex Hex Hex Hex
                    {
                    match("\\u"); 

                    mHex(); 
                    mHex(); 
                    mHex(); 
                    mHex(); 

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:334:4: '\\\\U' Hex Hex Hex Hex Hex Hex Hex Hex
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:337:8: ( '\"' (~ ( '\"' | '\\\\' | Newline ) | '\\\\\\\\' | '\\\\\"' | '\\\\n' | '\\\\r' | Charcode )* '\"' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:337:10: '\"' (~ ( '\"' | '\\\\' | Newline ) | '\\\\\\\\' | '\\\\\"' | '\\\\n' | '\\\\r' | Charcode )* '\"'
            {
            match('\"'); 
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:337:13: (~ ( '\"' | '\\\\' | Newline ) | '\\\\\\\\' | '\\\\\"' | '\\\\n' | '\\\\r' | Charcode )*
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
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:337:14: ~ ( '\"' | '\\\\' | Newline )
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
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:337:40: '\\\\\\\\'
            	    {
            	    match("\\\\"); 


            	    }
            	    break;
            	case 3 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:337:49: '\\\\\"'
            	    {
            	    match("\\\""); 


            	    }
            	    break;
            	case 4 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:337:57: '\\\\n'
            	    {
            	    match("\\n"); 


            	    }
            	    break;
            	case 5 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:337:65: '\\\\r'
            	    {
            	    match("\\r"); 


            	    }
            	    break;
            	case 6 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:337:73: Charcode
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:340:2: ( '(' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:340:4: '('
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:343:2: ( ')' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:343:4: ')'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:346:2: ( '[' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:346:4: '['
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:349:2: ( ']' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:349:4: ']'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:352:2: ( '{' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:352:4: '{'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:355:2: ( '}' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:355:4: '}'
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:357:8: ( '=' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:357:10: '='
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:360:2: ( '_' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:360:4: '_'
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

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:362:7: ( ':' )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:362:9: ':'
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

    public void mTokens() throws RecognitionException {
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:8: ( COMMENT1 | COMMENT2 | L_begin | L_end | L_obj | L_with | L_if | L_then | L_else | L_elseif | L_while | L_for | L_do | L_yield | L_match | L_case | L_as | L_val | L_def | L_in | L_exception | L_to | L_downto | A_infinity | U_infinity | L_module | L_private | L_protected | L_public | L_root | L_external | L_concurrent | L_await | L_lazy | L_memoize | L_true | L_false | L_this | L_here | L_random | L_package | A_EQUAL | U_EQUAL | A_NOT_EQUAL | U_NOT_EQUAL | LESS | A_LESS_EQ | U_LESS_EQ | GREATER | A_GREATER_EQ | U_GREATER_EQ | UNRELATED | SC | PLUS | MINUS | TIMES | DIV | MOD | POW_tok | MODULE_KEY | A_OR | A_AND | A_NOT | U_OR | U_AND | U_NOT | A_DOUBLE_COLON | U_DOUBLE_COLON | TIMESTIMES | PLUSPLUS | MINUSMINUS | A_DOUBLE_ARROW | U_DOUBLE_ARROW | A_ARROW | U_ARROW | A_ELLIPSIS | U_ELLIPSIS | PERIOD | COMMA | QUESTION_MARK | TILDE | WS | NL | Constr | Id | Num | String | ROUND_BRACKET_OPEN | ROUND_BRACKET_CLOSE | SQUARE_BRACKET_OPEN | SQUARE_BRACKET_CLOSE | CURLY_BRACKET_OPEN | CURLY_BRACKET_CLOSE | ASSIGN | UNDERSCORE | COLON )
        int alt15=96;
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
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:195: L_module
                {
                mL_module(); 

                }
                break;
            case 27 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:204: L_private
                {
                mL_private(); 

                }
                break;
            case 28 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:214: L_protected
                {
                mL_protected(); 

                }
                break;
            case 29 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:226: L_public
                {
                mL_public(); 

                }
                break;
            case 30 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:235: L_root
                {
                mL_root(); 

                }
                break;
            case 31 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:242: L_external
                {
                mL_external(); 

                }
                break;
            case 32 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:253: L_concurrent
                {
                mL_concurrent(); 

                }
                break;
            case 33 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:266: L_await
                {
                mL_await(); 

                }
                break;
            case 34 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:274: L_lazy
                {
                mL_lazy(); 

                }
                break;
            case 35 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:281: L_memoize
                {
                mL_memoize(); 

                }
                break;
            case 36 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:291: L_true
                {
                mL_true(); 

                }
                break;
            case 37 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:298: L_false
                {
                mL_false(); 

                }
                break;
            case 38 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:306: L_this
                {
                mL_this(); 

                }
                break;
            case 39 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:313: L_here
                {
                mL_here(); 

                }
                break;
            case 40 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:320: L_random
                {
                mL_random(); 

                }
                break;
            case 41 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:329: L_package
                {
                mL_package(); 

                }
                break;
            case 42 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:339: A_EQUAL
                {
                mA_EQUAL(); 

                }
                break;
            case 43 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:347: U_EQUAL
                {
                mU_EQUAL(); 

                }
                break;
            case 44 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:355: A_NOT_EQUAL
                {
                mA_NOT_EQUAL(); 

                }
                break;
            case 45 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:367: U_NOT_EQUAL
                {
                mU_NOT_EQUAL(); 

                }
                break;
            case 46 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:379: LESS
                {
                mLESS(); 

                }
                break;
            case 47 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:384: A_LESS_EQ
                {
                mA_LESS_EQ(); 

                }
                break;
            case 48 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:394: U_LESS_EQ
                {
                mU_LESS_EQ(); 

                }
                break;
            case 49 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:404: GREATER
                {
                mGREATER(); 

                }
                break;
            case 50 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:412: A_GREATER_EQ
                {
                mA_GREATER_EQ(); 

                }
                break;
            case 51 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:425: U_GREATER_EQ
                {
                mU_GREATER_EQ(); 

                }
                break;
            case 52 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:438: UNRELATED
                {
                mUNRELATED(); 

                }
                break;
            case 53 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:448: SC
                {
                mSC(); 

                }
                break;
            case 54 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:451: PLUS
                {
                mPLUS(); 

                }
                break;
            case 55 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:456: MINUS
                {
                mMINUS(); 

                }
                break;
            case 56 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:462: TIMES
                {
                mTIMES(); 

                }
                break;
            case 57 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:468: DIV
                {
                mDIV(); 

                }
                break;
            case 58 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:472: MOD
                {
                mMOD(); 

                }
                break;
            case 59 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:476: POW_tok
                {
                mPOW_tok(); 

                }
                break;
            case 60 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:484: MODULE_KEY
                {
                mMODULE_KEY(); 

                }
                break;
            case 61 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:495: A_OR
                {
                mA_OR(); 

                }
                break;
            case 62 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:500: A_AND
                {
                mA_AND(); 

                }
                break;
            case 63 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:506: A_NOT
                {
                mA_NOT(); 

                }
                break;
            case 64 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:512: U_OR
                {
                mU_OR(); 

                }
                break;
            case 65 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:517: U_AND
                {
                mU_AND(); 

                }
                break;
            case 66 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:523: U_NOT
                {
                mU_NOT(); 

                }
                break;
            case 67 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:529: A_DOUBLE_COLON
                {
                mA_DOUBLE_COLON(); 

                }
                break;
            case 68 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:544: U_DOUBLE_COLON
                {
                mU_DOUBLE_COLON(); 

                }
                break;
            case 69 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:559: TIMESTIMES
                {
                mTIMESTIMES(); 

                }
                break;
            case 70 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:570: PLUSPLUS
                {
                mPLUSPLUS(); 

                }
                break;
            case 71 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:579: MINUSMINUS
                {
                mMINUSMINUS(); 

                }
                break;
            case 72 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:590: A_DOUBLE_ARROW
                {
                mA_DOUBLE_ARROW(); 

                }
                break;
            case 73 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:605: U_DOUBLE_ARROW
                {
                mU_DOUBLE_ARROW(); 

                }
                break;
            case 74 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:620: A_ARROW
                {
                mA_ARROW(); 

                }
                break;
            case 75 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:628: U_ARROW
                {
                mU_ARROW(); 

                }
                break;
            case 76 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:636: A_ELLIPSIS
                {
                mA_ELLIPSIS(); 

                }
                break;
            case 77 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:647: U_ELLIPSIS
                {
                mU_ELLIPSIS(); 

                }
                break;
            case 78 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:658: PERIOD
                {
                mPERIOD(); 

                }
                break;
            case 79 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:665: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 80 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:671: QUESTION_MARK
                {
                mQUESTION_MARK(); 

                }
                break;
            case 81 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:685: TILDE
                {
                mTILDE(); 

                }
                break;
            case 82 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:691: WS
                {
                mWS(); 

                }
                break;
            case 83 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:694: NL
                {
                mNL(); 

                }
                break;
            case 84 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:697: Constr
                {
                mConstr(); 

                }
                break;
            case 85 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:704: Id
                {
                mId(); 

                }
                break;
            case 86 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:707: Num
                {
                mNum(); 

                }
                break;
            case 87 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:711: String
                {
                mString(); 

                }
                break;
            case 88 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:718: ROUND_BRACKET_OPEN
                {
                mROUND_BRACKET_OPEN(); 

                }
                break;
            case 89 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:737: ROUND_BRACKET_CLOSE
                {
                mROUND_BRACKET_CLOSE(); 

                }
                break;
            case 90 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:757: SQUARE_BRACKET_OPEN
                {
                mSQUARE_BRACKET_OPEN(); 

                }
                break;
            case 91 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:777: SQUARE_BRACKET_CLOSE
                {
                mSQUARE_BRACKET_CLOSE(); 

                }
                break;
            case 92 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:798: CURLY_BRACKET_OPEN
                {
                mCURLY_BRACKET_OPEN(); 

                }
                break;
            case 93 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:817: CURLY_BRACKET_CLOSE
                {
                mCURLY_BRACKET_CLOSE(); 

                }
                break;
            case 94 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:837: ASSIGN
                {
                mASSIGN(); 

                }
                break;
            case 95 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:844: UNDERSCORE
                {
                mUNDERSCORE(); 

                }
                break;
            case 96 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:1:855: COLON
                {
                mCOLON(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\1\uffff\1\100\15\64\1\uffff\4\64\1\143\1\uffff\1\145\1\uffff\1"+
        "\150\1\uffff\1\152\2\uffff\1\154\1\157\1\161\10\uffff\1\163\3\uffff"+
        "\1\165\24\uffff\7\64\1\176\1\u0080\1\64\1\u0083\3\64\1\u0088\7\64"+
        "\1\u0090\11\64\25\uffff\1\64\1\u009c\6\64\1\uffff\1\64\1\uffff\2"+
        "\64\1\uffff\1\64\1\u00a7\2\64\1\uffff\1\u00aa\6\64\1\uffff\1\64"+
        "\1\u00b2\11\64\1\uffff\1\u00bd\3\64\1\u00c1\2\64\1\u00c4\1\u00c5"+
        "\1\u00c6\1\uffff\2\64\1\uffff\4\64\1\u00cd\2\64\1\uffff\4\64\1\u00d4"+
        "\1\64\1\u00d6\1\u00d7\1\u00d8\1\64\1\uffff\3\64\1\uffff\1\u00dd"+
        "\1\64\3\uffff\1\u00df\1\64\1\u00e1\1\u00e2\2\64\1\uffff\1\64\1\u00e6"+
        "\4\64\1\uffff\1\64\3\uffff\1\u00ec\2\64\1\u00ef\1\uffff\1\64\1\uffff"+
        "\1\u00f1\2\uffff\1\u00f2\2\64\1\uffff\2\64\1\u00f7\1\64\1\u00f9"+
        "\1\uffff\2\64\1\uffff\1\64\2\uffff\1\u00fd\1\64\1\u00ff\1\64\1\uffff"+
        "\1\u0101\1\uffff\1\64\1\u0103\1\u0104\1\uffff\1\64\1\uffff\1\64"+
        "\1\uffff\1\u0107\2\uffff\1\64\1\u0109\1\uffff\1\u010a\2\uffff";
    static final String DFA15_eofS =
        "\u010b\uffff";
    static final String DFA15_minS =
        "\1\11\1\52\1\145\1\154\1\142\1\150\1\146\1\150\1\141\1\145\1\151"+
        "\2\141\1\163\1\141\1\uffff\3\141\1\145\1\75\1\uffff\1\75\1\uffff"+
        "\1\75\1\uffff\1\75\2\uffff\1\53\1\55\1\52\10\uffff\1\72\3\uffff"+
        "\1\56\24\uffff\1\147\1\144\1\163\1\143\1\152\1\164\1\151\2\60\1"+
        "\145\1\60\1\165\1\162\1\154\1\60\1\146\1\145\1\164\1\144\1\155\1"+
        "\163\1\156\1\60\1\141\1\154\1\151\1\142\1\143\1\157\1\156\1\172"+
        "\1\162\25\uffff\1\151\1\60\4\145\1\150\1\154\1\uffff\1\151\1\uffff"+
        "\1\156\1\163\1\uffff\1\145\1\60\1\163\1\156\1\uffff\1\60\1\154\1"+
        "\143\1\165\1\157\1\145\1\143\1\uffff\1\151\1\60\1\166\1\164\1\154"+
        "\1\153\1\164\1\144\1\171\1\145\1\156\1\uffff\1\60\1\160\1\162\1"+
        "\143\1\60\1\145\1\156\3\60\1\uffff\1\145\1\164\1\uffff\1\144\1\150"+
        "\1\154\1\151\1\60\1\165\1\164\1\uffff\1\141\1\145\1\151\1\141\1"+
        "\60\1\157\3\60\1\146\1\uffff\1\164\1\156\1\164\1\uffff\1\60\1\151"+
        "\3\uffff\1\60\1\157\2\60\1\145\1\172\1\uffff\1\162\1\60\1\164\2"+
        "\143\1\147\1\uffff\1\155\3\uffff\1\60\1\151\1\141\1\60\1\uffff\1"+
        "\164\1\uffff\1\60\2\uffff\1\60\1\145\1\162\1\uffff\1\145\1\164\1"+
        "\60\1\145\1\60\1\uffff\1\157\1\154\1\uffff\1\171\2\uffff\1\60\1"+
        "\145\1\60\1\145\1\uffff\1\60\1\uffff\1\156\2\60\1\uffff\1\156\1"+
        "\uffff\1\144\1\uffff\1\60\2\uffff\1\164\1\60\1\uffff\1\60\2\uffff";
    static final String DFA15_maxS =
        "\1\u2265\1\57\1\145\1\170\1\142\1\151\1\156\1\162\2\157\1\151\2"+
        "\157\1\167\1\141\1\uffff\1\165\1\157\1\141\1\145\1\76\1\uffff\1"+
        "\75\1\uffff\1\76\1\uffff\1\75\2\uffff\1\53\1\76\1\52\10\uffff\1"+
        "\72\3\uffff\1\56\24\uffff\1\147\1\144\1\163\1\164\1\152\1\164\1"+
        "\151\2\u00fc\1\151\1\u00fc\1\165\1\162\1\154\1\u00fc\1\146\1\145"+
        "\1\164\1\144\1\155\1\163\1\156\1\u00fc\1\141\1\154\1\157\1\142\1"+
        "\143\1\157\1\156\1\172\1\162\25\uffff\1\151\1\u00fc\4\145\1\150"+
        "\1\154\1\uffff\1\151\1\uffff\1\156\1\163\1\uffff\1\145\1\u00fc\1"+
        "\163\1\156\1\uffff\1\u00fc\1\154\1\143\1\165\1\157\1\145\1\143\1"+
        "\uffff\1\151\1\u00fc\1\166\1\164\1\154\1\153\1\164\1\144\1\171\1"+
        "\145\1\156\1\uffff\1\u00fc\1\160\1\162\1\143\1\u00fc\1\145\1\156"+
        "\3\u00fc\1\uffff\1\145\1\164\1\uffff\1\144\1\150\1\154\1\151\1\u00fc"+
        "\1\165\1\164\1\uffff\1\141\1\145\1\151\1\141\1\u00fc\1\157\3\u00fc"+
        "\1\146\1\uffff\1\164\1\156\1\164\1\uffff\1\u00fc\1\151\3\uffff\1"+
        "\u00fc\1\157\2\u00fc\1\145\1\172\1\uffff\1\162\1\u00fc\1\164\2\143"+
        "\1\147\1\uffff\1\155\3\uffff\1\u00fc\1\151\1\141\1\u00fc\1\uffff"+
        "\1\164\1\uffff\1\u00fc\2\uffff\1\u00fc\1\145\1\162\1\uffff\1\145"+
        "\1\164\1\u00fc\1\145\1\u00fc\1\uffff\1\157\1\154\1\uffff\1\171\2"+
        "\uffff\1\u00fc\1\145\1\u00fc\1\145\1\uffff\1\u00fc\1\uffff\1\156"+
        "\2\u00fc\1\uffff\1\156\1\uffff\1\144\1\uffff\1\u00fc\2\uffff\1\164"+
        "\1\u00fc\1\uffff\1\u00fc\2\uffff";
    static final String DFA15_acceptS =
        "\17\uffff\1\31\5\uffff\1\53\1\uffff\1\55\1\uffff\1\60\1\uffff\1"+
        "\63\1\65\3\uffff\1\72\1\73\1\74\1\75\1\76\1\100\1\101\1\102\1\uffff"+
        "\1\104\1\111\1\113\1\uffff\1\115\1\117\1\120\1\121\1\122\1\123\1"+
        "\124\1\125\1\126\1\127\1\130\1\131\1\132\1\133\1\134\1\135\1\137"+
        "\1\1\1\2\1\71\40\uffff\1\52\1\110\1\136\1\54\1\77\1\57\1\64\1\56"+
        "\1\62\1\61\1\106\1\66\1\107\1\112\1\67\1\105\1\70\1\103\1\140\1"+
        "\114\1\116\10\uffff\1\7\1\uffff\1\24\2\uffff\1\26\4\uffff\1\15\7"+
        "\uffff\1\21\13\uffff\1\4\12\uffff\1\14\2\uffff\1\23\7\uffff\1\22"+
        "\12\uffff\1\11\3\uffff\1\6\2\uffff\1\10\1\46\1\44\6\uffff\1\20\6"+
        "\uffff\1\36\1\uffff\1\42\1\47\1\3\4\uffff\1\13\1\uffff\1\45\1\uffff"+
        "\1\16\1\17\3\uffff\1\41\5\uffff\1\12\2\uffff\1\5\1\uffff\1\27\1"+
        "\32\4\uffff\1\35\1\uffff\1\50\3\uffff\1\43\1\uffff\1\33\1\uffff"+
        "\1\51\1\uffff\1\37\1\30\2\uffff\1\25\1\uffff\1\34\1\40";
    static final String DFA15_specialS =
        "\u010b\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\61\1\62\1\uffff\2\62\22\uffff\1\61\1\26\1\66\2\uffff\1\40"+
            "\1\44\1\uffff\1\67\1\70\1\37\1\35\1\56\1\36\1\54\1\1\12\65\1"+
            "\50\1\34\1\30\1\24\1\32\1\57\1\42\32\63\1\71\1\uffff\1\72\1"+
            "\41\1\75\1\uffff\1\15\1\2\1\14\1\11\1\3\1\10\1\64\1\23\1\6\2"+
            "\64\1\22\1\13\1\64\1\4\1\20\1\64\1\21\1\64\1\7\1\64\1\16\1\5"+
            "\1\64\1\12\1\64\1\73\1\43\1\74\1\60\6\uffff\1\62\46\uffff\1"+
            "\47\27\uffff\1\63\21\uffff\1\63\5\uffff\1\63\2\uffff\1\64\4"+
            "\uffff\1\64\21\uffff\1\64\5\uffff\1\64\u1f29\uffff\1\55\1\uffff"+
            "\2\62\u0168\uffff\1\53\77\uffff\1\52\113\uffff\1\17\10\uffff"+
            "\1\46\1\45\16\uffff\1\51\51\uffff\1\25\1\27\1\uffff\1\31\1\33",
            "\1\76\4\uffff\1\77",
            "\1\101",
            "\1\103\1\uffff\1\102\11\uffff\1\104",
            "\1\105",
            "\1\107\1\106",
            "\1\110\7\uffff\1\111",
            "\1\112\6\uffff\1\113\2\uffff\1\114",
            "\1\116\15\uffff\1\115",
            "\1\120\11\uffff\1\117",
            "\1\121",
            "\1\122\3\uffff\1\124\11\uffff\1\123",
            "\1\125\15\uffff\1\126",
            "\1\127\3\uffff\1\130",
            "\1\131",
            "",
            "\1\134\20\uffff\1\132\2\uffff\1\133",
            "\1\136\15\uffff\1\135",
            "\1\137",
            "\1\140",
            "\1\141\1\142",
            "",
            "\1\144",
            "",
            "\1\146\1\147",
            "",
            "\1\151",
            "",
            "",
            "\1\153",
            "\1\155\20\uffff\1\156",
            "\1\160",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\162",
            "",
            "",
            "",
            "\1\164",
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
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171\20\uffff\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64\111\uffff\1"+
            "\64\21\uffff\1\64\5\uffff\1\64\2\uffff\1\64\4\uffff\1\64\21"+
            "\uffff\1\64\5\uffff\1\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\5\64\1\177\24\64"+
            "\111\uffff\1\64\21\uffff\1\64\5\uffff\1\64\2\uffff\1\64\4\uffff"+
            "\1\64\21\uffff\1\64\5\uffff\1\64",
            "\1\u0081\3\uffff\1\u0082",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64\111\uffff\1"+
            "\64\21\uffff\1\64\5\uffff\1\64\2\uffff\1\64\4\uffff\1\64\21"+
            "\uffff\1\64\5\uffff\1\64",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\26\64\1\u0087\3\64"+
            "\111\uffff\1\64\21\uffff\1\64\5\uffff\1\64\2\uffff\1\64\4\uffff"+
            "\1\64\21\uffff\1\64\5\uffff\1\64",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64\111\uffff\1"+
            "\64\21\uffff\1\64\5\uffff\1\64\2\uffff\1\64\4\uffff\1\64\21"+
            "\uffff\1\64\5\uffff\1\64",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093\5\uffff\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
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
            "",
            "\1\u009b",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64\111\uffff\1"+
            "\64\21\uffff\1\64\5\uffff\1\64\2\uffff\1\64\4\uffff\1\64\21"+
            "\uffff\1\64\5\uffff\1\64",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "",
            "\1\u00a3",
            "",
            "\1\u00a4",
            "\1\u00a5",
            "",
            "\1\u00a6",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64\111\uffff\1"+
            "\64\21\uffff\1\64\5\uffff\1\64\2\uffff\1\64\4\uffff\1\64\21"+
            "\uffff\1\64\5\uffff\1\64",
            "\1\u00a8",
            "\1\u00a9",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64\111\uffff\1"+
            "\64\21\uffff\1\64\5\uffff\1\64\2\uffff\1\64\4\uffff\1\64\21"+
            "\uffff\1\64\5\uffff\1\64",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "",
            "\1\u00b1",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64\111\uffff\1"+
            "\64\21\uffff\1\64\5\uffff\1\64\2\uffff\1\64\4\uffff\1\64\21"+
            "\uffff\1\64\5\uffff\1\64",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\10\64\1\u00bc\21"+
            "\64\111\uffff\1\64\21\uffff\1\64\5\uffff\1\64\2\uffff\1\64\4"+
            "\uffff\1\64\21\uffff\1\64\5\uffff\1\64",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64\111\uffff\1"+
            "\64\21\uffff\1\64\5\uffff\1\64\2\uffff\1\64\4\uffff\1\64\21"+
            "\uffff\1\64\5\uffff\1\64",
            "\1\u00c2",
            "\1\u00c3",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64\111\uffff\1"+
            "\64\21\uffff\1\64\5\uffff\1\64\2\uffff\1\64\4\uffff\1\64\21"+
            "\uffff\1\64\5\uffff\1\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64\111\uffff\1"+
            "\64\21\uffff\1\64\5\uffff\1\64\2\uffff\1\64\4\uffff\1\64\21"+
            "\uffff\1\64\5\uffff\1\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64\111\uffff\1"+
            "\64\21\uffff\1\64\5\uffff\1\64\2\uffff\1\64\4\uffff\1\64\21"+
            "\uffff\1\64\5\uffff\1\64",
            "",
            "\1\u00c7",
            "\1\u00c8",
            "",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64\111\uffff\1"+
            "\64\21\uffff\1\64\5\uffff\1\64\2\uffff\1\64\4\uffff\1\64\21"+
            "\uffff\1\64\5\uffff\1\64",
            "\1\u00ce",
            "\1\u00cf",
            "",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64\111\uffff\1"+
            "\64\21\uffff\1\64\5\uffff\1\64\2\uffff\1\64\4\uffff\1\64\21"+
            "\uffff\1\64\5\uffff\1\64",
            "\1\u00d5",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64\111\uffff\1"+
            "\64\21\uffff\1\64\5\uffff\1\64\2\uffff\1\64\4\uffff\1\64\21"+
            "\uffff\1\64\5\uffff\1\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64\111\uffff\1"+
            "\64\21\uffff\1\64\5\uffff\1\64\2\uffff\1\64\4\uffff\1\64\21"+
            "\uffff\1\64\5\uffff\1\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64\111\uffff\1"+
            "\64\21\uffff\1\64\5\uffff\1\64\2\uffff\1\64\4\uffff\1\64\21"+
            "\uffff\1\64\5\uffff\1\64",
            "\1\u00d9",
            "",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64\111\uffff\1"+
            "\64\21\uffff\1\64\5\uffff\1\64\2\uffff\1\64\4\uffff\1\64\21"+
            "\uffff\1\64\5\uffff\1\64",
            "\1\u00de",
            "",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64\111\uffff\1"+
            "\64\21\uffff\1\64\5\uffff\1\64\2\uffff\1\64\4\uffff\1\64\21"+
            "\uffff\1\64\5\uffff\1\64",
            "\1\u00e0",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64\111\uffff\1"+
            "\64\21\uffff\1\64\5\uffff\1\64\2\uffff\1\64\4\uffff\1\64\21"+
            "\uffff\1\64\5\uffff\1\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64\111\uffff\1"+
            "\64\21\uffff\1\64\5\uffff\1\64\2\uffff\1\64\4\uffff\1\64\21"+
            "\uffff\1\64\5\uffff\1\64",
            "\1\u00e3",
            "\1\u00e4",
            "",
            "\1\u00e5",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64\111\uffff\1"+
            "\64\21\uffff\1\64\5\uffff\1\64\2\uffff\1\64\4\uffff\1\64\21"+
            "\uffff\1\64\5\uffff\1\64",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "",
            "\1\u00eb",
            "",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64\111\uffff\1"+
            "\64\21\uffff\1\64\5\uffff\1\64\2\uffff\1\64\4\uffff\1\64\21"+
            "\uffff\1\64\5\uffff\1\64",
            "\1\u00ed",
            "\1\u00ee",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64\111\uffff\1"+
            "\64\21\uffff\1\64\5\uffff\1\64\2\uffff\1\64\4\uffff\1\64\21"+
            "\uffff\1\64\5\uffff\1\64",
            "",
            "\1\u00f0",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64\111\uffff\1"+
            "\64\21\uffff\1\64\5\uffff\1\64\2\uffff\1\64\4\uffff\1\64\21"+
            "\uffff\1\64\5\uffff\1\64",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64\111\uffff\1"+
            "\64\21\uffff\1\64\5\uffff\1\64\2\uffff\1\64\4\uffff\1\64\21"+
            "\uffff\1\64\5\uffff\1\64",
            "\1\u00f3",
            "\1\u00f4",
            "",
            "\1\u00f5",
            "\1\u00f6",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64\111\uffff\1"+
            "\64\21\uffff\1\64\5\uffff\1\64\2\uffff\1\64\4\uffff\1\64\21"+
            "\uffff\1\64\5\uffff\1\64",
            "\1\u00f8",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64\111\uffff\1"+
            "\64\21\uffff\1\64\5\uffff\1\64\2\uffff\1\64\4\uffff\1\64\21"+
            "\uffff\1\64\5\uffff\1\64",
            "",
            "\1\u00fa",
            "\1\u00fb",
            "",
            "\1\u00fc",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64\111\uffff\1"+
            "\64\21\uffff\1\64\5\uffff\1\64\2\uffff\1\64\4\uffff\1\64\21"+
            "\uffff\1\64\5\uffff\1\64",
            "\1\u00fe",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64\111\uffff\1"+
            "\64\21\uffff\1\64\5\uffff\1\64\2\uffff\1\64\4\uffff\1\64\21"+
            "\uffff\1\64\5\uffff\1\64",
            "\1\u0100",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64\111\uffff\1"+
            "\64\21\uffff\1\64\5\uffff\1\64\2\uffff\1\64\4\uffff\1\64\21"+
            "\uffff\1\64\5\uffff\1\64",
            "",
            "\1\u0102",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64\111\uffff\1"+
            "\64\21\uffff\1\64\5\uffff\1\64\2\uffff\1\64\4\uffff\1\64\21"+
            "\uffff\1\64\5\uffff\1\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64\111\uffff\1"+
            "\64\21\uffff\1\64\5\uffff\1\64\2\uffff\1\64\4\uffff\1\64\21"+
            "\uffff\1\64\5\uffff\1\64",
            "",
            "\1\u0105",
            "",
            "\1\u0106",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64\111\uffff\1"+
            "\64\21\uffff\1\64\5\uffff\1\64\2\uffff\1\64\4\uffff\1\64\21"+
            "\uffff\1\64\5\uffff\1\64",
            "",
            "",
            "\1\u0108",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64\111\uffff\1"+
            "\64\21\uffff\1\64\5\uffff\1\64\2\uffff\1\64\4\uffff\1\64\21"+
            "\uffff\1\64\5\uffff\1\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64\111\uffff\1"+
            "\64\21\uffff\1\64\5\uffff\1\64\2\uffff\1\64\4\uffff\1\64\21"+
            "\uffff\1\64\5\uffff\1\64",
            "",
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
            return "1:1: Tokens : ( COMMENT1 | COMMENT2 | L_begin | L_end | L_obj | L_with | L_if | L_then | L_else | L_elseif | L_while | L_for | L_do | L_yield | L_match | L_case | L_as | L_val | L_def | L_in | L_exception | L_to | L_downto | A_infinity | U_infinity | L_module | L_private | L_protected | L_public | L_root | L_external | L_concurrent | L_await | L_lazy | L_memoize | L_true | L_false | L_this | L_here | L_random | L_package | A_EQUAL | U_EQUAL | A_NOT_EQUAL | U_NOT_EQUAL | LESS | A_LESS_EQ | U_LESS_EQ | GREATER | A_GREATER_EQ | U_GREATER_EQ | UNRELATED | SC | PLUS | MINUS | TIMES | DIV | MOD | POW_tok | MODULE_KEY | A_OR | A_AND | A_NOT | U_OR | U_AND | U_NOT | A_DOUBLE_COLON | U_DOUBLE_COLON | TIMESTIMES | PLUSPLUS | MINUSMINUS | A_DOUBLE_ARROW | U_DOUBLE_ARROW | A_ARROW | U_ARROW | A_ELLIPSIS | U_ELLIPSIS | PERIOD | COMMA | QUESTION_MARK | TILDE | WS | NL | Constr | Id | Num | String | ROUND_BRACKET_OPEN | ROUND_BRACKET_CLOSE | SQUARE_BRACKET_OPEN | SQUARE_BRACKET_CLOSE | CURLY_BRACKET_OPEN | CURLY_BRACKET_CLOSE | ASSIGN | UNDERSCORE | COLON );";
        }
    }
 

}