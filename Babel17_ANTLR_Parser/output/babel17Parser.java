// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g 2010-07-07 11:55:52

package com.babel17.antlr;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class babel17Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PROG", "NIL", "ANY", "LAMBDA", "SQUARE_LIST", "ROUND_LIST", "LIST_CONS", "COMPARE", "APPLY", "IF", "MAP_OR_SET", "EMPTY_MAP", "EXCEPTION", "MATCH", "CASES", "OBJ", "FOR_EXPR", "WHILE_DO", "MESSAGE_SEND", "UMINUS", "POW", "BLOCK", "BEGIN", "WITH", "VAL", "ASSIGN", "DEF", "ATTRIBUTE", "YIELD", "MODULE_DEF", "MODULE_DECL", "MODULE_PATH", "PACKAGE", "LAZY", "CONCURRENT", "MEMOIZE", "MEM_STRONG", "MEM_WEAK", "IF_PATTERN", "COMMENT1", "Newline", "NotNewline", "COMMENT2", "SmallLetter", "BigLetter", "Letter", "Digit", "Hex", "L_begin", "L_end", "L_obj", "L_with", "L_if", "L_then", "L_else", "L_elseif", "L_while", "L_for", "L_do", "L_yield", "L_match", "L_case", "L_as", "L_val", "L_def", "L_in", "L_exception", "L_to", "L_downto", "A_infinity", "U_infinity", "L_module", "L_private", "L_protected", "L_public", "L_root", "L_external", "L_concurrent", "L_await", "L_lazy", "L_memoize", "L_true", "L_false", "L_this", "L_here", "L_random", "L_package", "A_EQUAL", "U_EQUAL", "A_NOT_EQUAL", "U_NOT_EQUAL", "LESS", "A_LESS_EQ", "U_LESS_EQ", "GREATER", "A_GREATER_EQ", "U_GREATER_EQ", "UNRELATED", "SC", "PLUS", "MINUS", "TIMES", "DIV", "MOD", "POW_tok", "MODULE_KEY", "A_OR", "A_AND", "A_NOT", "U_OR", "U_AND", "U_NOT", "A_DOUBLE_COLON", "U_DOUBLE_COLON", "TIMESTIMES", "PLUSPLUS", "MINUSMINUS", "A_DOUBLE_ARROW", "U_DOUBLE_ARROW", "A_ARROW", "U_ARROW", "A_ELLIPSIS", "U_ELLIPSIS", "PERIOD", "COMMA", "QUESTION_MARK", "TILDE", "WsChar", "WS", "NL", "Constr", "Id", "Num", "Charcode", "String", "ROUND_BRACKET_OPEN", "ROUND_BRACKET_CLOSE", "SQUARE_BRACKET_OPEN", "SQUARE_BRACKET_CLOSE", "CURLY_BRACKET_OPEN", "CURLY_BRACKET_CLOSE", "UNDERSCORE", "COLON"
    };
    public static final int U_AND=114;
    public static final int PACKAGE=36;
    public static final int L_end=53;
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
    public static final int Num=136;
    public static final int GREATER=98;
    public static final int EMPTY_MAP=15;
    public static final int POW=24;
    public static final int L_concurrent=81;
    public static final int UNRELATED=101;
    public static final int L_await=82;
    public static final int L_false=86;
    public static final int BEGIN=26;
    public static final int LIST_CONS=10;
    public static final int L_with=55;
    public static final int QUESTION_MARK=129;
    public static final int LESS=95;
    public static final int ROUND_BRACKET_OPEN=139;
    public static final int SQUARE_LIST=8;
    public static final int VAL=28;
    public static final int L_as=66;
    public static final int NL=133;
    public static final int MESSAGE_SEND=22;
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
    public static final int COMMA=128;
    public static final int OBJ=19;
    public static final int MEMOIZE=39;
    public static final int U_ELLIPSIS=126;
    public static final int TILDE=130;
    public static final int YIELD=32;
    public static final int COMPARE=11;
    public static final int U_GREATER_EQ=100;
    public static final int U_EQUAL=92;
    public static final int PLUS=103;
    public static final int String=138;
    public static final int LAMBDA=7;
    public static final int L_true=85;
    public static final int Id=135;
    public static final int A_infinity=73;
    public static final int MODULE_KEY=109;
    public static final int WITH=27;
    public static final int L_in=69;
    public static final int A_NOT=112;
    public static final int LAZY=37;
    public static final int L_lazy=83;
    public static final int NotNewline=45;
    public static final int L_then=57;
    public static final int L_public=78;
    public static final int L_if=56;
    public static final int CURLY_BRACKET_CLOSE=144;
    public static final int UMINUS=23;
    public static final int FOR_EXPR=20;
    public static final int Constr=134;
    public static final int WHILE_DO=21;
    public static final int L_elseif=59;
    public static final int MINUS=104;
    public static final int Digit=50;
    public static final int L_memoize=84;
    public static final int L_package=90;
    public static final int MEM_WEAK=41;
    public static final int A_GREATER_EQ=99;
    public static final int ROUND_LIST=9;
    public static final int COLON=146;
    public static final int SC=102;
    public static final int L_downto=72;
    public static final int L_external=80;
    public static final int ANY=6;
    public static final int L_random=89;
    public static final int A_NOT_EQUAL=93;
    public static final int BLOCK=25;
    public static final int ASSIGN=29;
    public static final int U_DOUBLE_COLON=117;
    public static final int L_case=65;
    public static final int DIV=106;
    public static final int MAP_OR_SET=14;
    public static final int TIMES=105;
    public static final int U_infinity=74;
    public static final int A_LESS_EQ=96;
    public static final int MODULE_DEF=33;
    public static final int MODULE_DECL=34;

    // delegates
    // delegators


        public babel17Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public babel17Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return babel17Parser.tokenNames; }
    public String getGrammarFileName() { return "/Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g"; }

     

    public boolean errorDuringParsing = false;
    public ArrayList<RecognitionException> parsingErrors = new ArrayList<RecognitionException>();


    @Override
    public void reportError(RecognitionException e) {
      errorDuringParsing = true;
      parsingErrors.add(e);
    }



    public static class token_infinity_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "token_infinity"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:177:1: token_infinity : ( A_infinity | U_infinity );
    public final babel17Parser.token_infinity_return token_infinity() throws RecognitionException {
        babel17Parser.token_infinity_return retval = new babel17Parser.token_infinity_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set1=null;

        CommonTree set1_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:178:2: ( A_infinity | U_infinity )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set1=(Token)input.LT(1);
            if ( (input.LA(1)>=A_infinity && input.LA(1)<=U_infinity) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set1));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "token_infinity"

    public static class token_EQUAL_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "token_EQUAL"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:217:1: token_EQUAL : ( A_EQUAL | U_EQUAL );
    public final babel17Parser.token_EQUAL_return token_EQUAL() throws RecognitionException {
        babel17Parser.token_EQUAL_return retval = new babel17Parser.token_EQUAL_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set2=null;

        CommonTree set2_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:218:2: ( A_EQUAL | U_EQUAL )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set2=(Token)input.LT(1);
            if ( (input.LA(1)>=A_EQUAL && input.LA(1)<=U_EQUAL) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set2));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "token_EQUAL"

    public static class token_NOT_EQUAL_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "token_NOT_EQUAL"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:225:1: token_NOT_EQUAL : ( A_NOT_EQUAL | U_NOT_EQUAL );
    public final babel17Parser.token_NOT_EQUAL_return token_NOT_EQUAL() throws RecognitionException {
        babel17Parser.token_NOT_EQUAL_return retval = new babel17Parser.token_NOT_EQUAL_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set3=null;

        CommonTree set3_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:226:2: ( A_NOT_EQUAL | U_NOT_EQUAL )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set3=(Token)input.LT(1);
            if ( (input.LA(1)>=A_NOT_EQUAL && input.LA(1)<=U_NOT_EQUAL) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set3));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "token_NOT_EQUAL"

    public static class token_LESS_EQ_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "token_LESS_EQ"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:234:1: token_LESS_EQ : ( A_LESS_EQ | U_LESS_EQ );
    public final babel17Parser.token_LESS_EQ_return token_LESS_EQ() throws RecognitionException {
        babel17Parser.token_LESS_EQ_return retval = new babel17Parser.token_LESS_EQ_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set4=null;

        CommonTree set4_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:235:2: ( A_LESS_EQ | U_LESS_EQ )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set4=(Token)input.LT(1);
            if ( (input.LA(1)>=A_LESS_EQ && input.LA(1)<=U_LESS_EQ) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set4));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "token_LESS_EQ"

    public static class token_GREATER_EQ_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "token_GREATER_EQ"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:244:1: token_GREATER_EQ : ( A_GREATER_EQ | U_GREATER_EQ );
    public final babel17Parser.token_GREATER_EQ_return token_GREATER_EQ() throws RecognitionException {
        babel17Parser.token_GREATER_EQ_return retval = new babel17Parser.token_GREATER_EQ_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set5=null;

        CommonTree set5_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:245:2: ( A_GREATER_EQ | U_GREATER_EQ )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set5=(Token)input.LT(1);
            if ( (input.LA(1)>=A_GREATER_EQ && input.LA(1)<=U_GREATER_EQ) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set5));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "token_GREATER_EQ"

    public static class token_OR_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "token_OR"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:268:1: token_OR : ( A_OR | U_OR );
    public final babel17Parser.token_OR_return token_OR() throws RecognitionException {
        babel17Parser.token_OR_return retval = new babel17Parser.token_OR_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set6=null;

        CommonTree set6_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:268:9: ( A_OR | U_OR )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set6=(Token)input.LT(1);
            if ( input.LA(1)==A_OR||input.LA(1)==U_OR ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set6));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "token_OR"

    public static class token_AND_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "token_AND"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:269:1: token_AND : ( A_AND | U_AND );
    public final babel17Parser.token_AND_return token_AND() throws RecognitionException {
        babel17Parser.token_AND_return retval = new babel17Parser.token_AND_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set7=null;

        CommonTree set7_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:270:2: ( A_AND | U_AND )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set7=(Token)input.LT(1);
            if ( input.LA(1)==A_AND||input.LA(1)==U_AND ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set7));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "token_AND"

    public static class token_NOT_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "token_NOT"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:271:1: token_NOT : ( A_NOT | U_NOT );
    public final babel17Parser.token_NOT_return token_NOT() throws RecognitionException {
        babel17Parser.token_NOT_return retval = new babel17Parser.token_NOT_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set8=null;

        CommonTree set8_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:272:2: ( A_NOT | U_NOT )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set8=(Token)input.LT(1);
            if ( input.LA(1)==A_NOT||input.LA(1)==U_NOT ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set8));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "token_NOT"

    public static class token_DOUBLE_COLON_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "token_DOUBLE_COLON"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:278:1: token_DOUBLE_COLON : ( A_DOUBLE_COLON | U_DOUBLE_COLON );
    public final babel17Parser.token_DOUBLE_COLON_return token_DOUBLE_COLON() throws RecognitionException {
        babel17Parser.token_DOUBLE_COLON_return retval = new babel17Parser.token_DOUBLE_COLON_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set9=null;

        CommonTree set9_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:279:2: ( A_DOUBLE_COLON | U_DOUBLE_COLON )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set9=(Token)input.LT(1);
            if ( (input.LA(1)>=A_DOUBLE_COLON && input.LA(1)<=U_DOUBLE_COLON) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set9));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "token_DOUBLE_COLON"

    public static class token_DOUBLE_ARROW_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "token_DOUBLE_ARROW"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:294:1: token_DOUBLE_ARROW : ( A_DOUBLE_ARROW | U_DOUBLE_ARROW );
    public final babel17Parser.token_DOUBLE_ARROW_return token_DOUBLE_ARROW() throws RecognitionException {
        babel17Parser.token_DOUBLE_ARROW_return retval = new babel17Parser.token_DOUBLE_ARROW_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set10=null;

        CommonTree set10_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:295:2: ( A_DOUBLE_ARROW | U_DOUBLE_ARROW )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set10=(Token)input.LT(1);
            if ( (input.LA(1)>=A_DOUBLE_ARROW && input.LA(1)<=U_DOUBLE_ARROW) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set10));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "token_DOUBLE_ARROW"

    public static class token_ARROW_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "token_ARROW"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:299:1: token_ARROW : ( A_ARROW | U_ARROW );
    public final babel17Parser.token_ARROW_return token_ARROW() throws RecognitionException {
        babel17Parser.token_ARROW_return retval = new babel17Parser.token_ARROW_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set11=null;

        CommonTree set11_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:300:2: ( A_ARROW | U_ARROW )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set11=(Token)input.LT(1);
            if ( (input.LA(1)>=A_ARROW && input.LA(1)<=U_ARROW) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set11));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "token_ARROW"

    public static class token_ELLIPSIS_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "token_ELLIPSIS"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:305:1: token_ELLIPSIS : ( A_ELLIPSIS | U_ELLIPSIS );
    public final babel17Parser.token_ELLIPSIS_return token_ELLIPSIS() throws RecognitionException {
        babel17Parser.token_ELLIPSIS_return retval = new babel17Parser.token_ELLIPSIS_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set12=null;

        CommonTree set12_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:306:2: ( A_ELLIPSIS | U_ELLIPSIS )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set12=(Token)input.LT(1);
            if ( (input.LA(1)>=A_ELLIPSIS && input.LA(1)<=U_ELLIPSIS) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set12));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "token_ELLIPSIS"

    public static class pattern_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pattern"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:365:1: pattern : ( Constr ( ( NL )? primitive_pattern )? -> ^( Constr ( primitive_pattern )? ) | primitive_pattern ( ( NL )? token_DOUBLE_COLON ( NL )? primitive_pattern )* -> ^( LIST_CONS ( primitive_pattern )* ) );
    public final babel17Parser.pattern_return pattern() throws RecognitionException {
        babel17Parser.pattern_return retval = new babel17Parser.pattern_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Constr13=null;
        Token NL14=null;
        Token NL17=null;
        Token NL19=null;
        babel17Parser.primitive_pattern_return primitive_pattern15 = null;

        babel17Parser.primitive_pattern_return primitive_pattern16 = null;

        babel17Parser.token_DOUBLE_COLON_return token_DOUBLE_COLON18 = null;

        babel17Parser.primitive_pattern_return primitive_pattern20 = null;


        CommonTree Constr13_tree=null;
        CommonTree NL14_tree=null;
        CommonTree NL17_tree=null;
        CommonTree NL19_tree=null;
        RewriteRuleTokenStream stream_Constr=new RewriteRuleTokenStream(adaptor,"token Constr");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_primitive_pattern=new RewriteRuleSubtreeStream(adaptor,"rule primitive_pattern");
        RewriteRuleSubtreeStream stream_token_DOUBLE_COLON=new RewriteRuleSubtreeStream(adaptor,"rule token_DOUBLE_COLON");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:365:9: ( Constr ( ( NL )? primitive_pattern )? -> ^( Constr ( primitive_pattern )? ) | primitive_pattern ( ( NL )? token_DOUBLE_COLON ( NL )? primitive_pattern )* -> ^( LIST_CONS ( primitive_pattern )* ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==Constr) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=A_infinity && LA6_0<=U_infinity)||(LA6_0>=L_true && LA6_0<=L_false)||LA6_0==MINUS||(LA6_0>=Id && LA6_0<=Num)||(LA6_0>=String && LA6_0<=ROUND_BRACKET_OPEN)||LA6_0==SQUARE_BRACKET_OPEN||LA6_0==CURLY_BRACKET_OPEN||LA6_0==UNDERSCORE) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:365:11: Constr ( ( NL )? primitive_pattern )?
                    {
                    Constr13=(Token)match(input,Constr,FOLLOW_Constr_in_pattern1572); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Constr.add(Constr13);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:365:18: ( ( NL )? primitive_pattern )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==NL) ) {
                        int LA2_1 = input.LA(2);

                        if ( ((LA2_1>=A_infinity && LA2_1<=U_infinity)||(LA2_1>=L_true && LA2_1<=L_false)||LA2_1==MINUS||(LA2_1>=Id && LA2_1<=Num)||(LA2_1>=String && LA2_1<=ROUND_BRACKET_OPEN)||LA2_1==SQUARE_BRACKET_OPEN||LA2_1==CURLY_BRACKET_OPEN||LA2_1==UNDERSCORE) ) {
                            alt2=1;
                        }
                    }
                    else if ( ((LA2_0>=A_infinity && LA2_0<=U_infinity)||(LA2_0>=L_true && LA2_0<=L_false)||LA2_0==MINUS||(LA2_0>=Id && LA2_0<=Num)||(LA2_0>=String && LA2_0<=ROUND_BRACKET_OPEN)||LA2_0==SQUARE_BRACKET_OPEN||LA2_0==CURLY_BRACKET_OPEN||LA2_0==UNDERSCORE) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:365:19: ( NL )? primitive_pattern
                            {
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:365:19: ( NL )?
                            int alt1=2;
                            int LA1_0 = input.LA(1);

                            if ( (LA1_0==NL) ) {
                                alt1=1;
                            }
                            switch (alt1) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:365:19: NL
                                    {
                                    NL14=(Token)match(input,NL,FOLLOW_NL_in_pattern1575); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL14);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_primitive_pattern_in_pattern1578);
                            primitive_pattern15=primitive_pattern();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_primitive_pattern.add(primitive_pattern15.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: primitive_pattern, Constr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 365:43: -> ^( Constr ( primitive_pattern )? )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:365:46: ^( Constr ( primitive_pattern )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_Constr.nextNode(), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:365:55: ( primitive_pattern )?
                        if ( stream_primitive_pattern.hasNext() ) {
                            adaptor.addChild(root_1, stream_primitive_pattern.nextTree());

                        }
                        stream_primitive_pattern.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:366:4: primitive_pattern ( ( NL )? token_DOUBLE_COLON ( NL )? primitive_pattern )*
                    {
                    pushFollow(FOLLOW_primitive_pattern_in_pattern1594);
                    primitive_pattern16=primitive_pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primitive_pattern.add(primitive_pattern16.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:366:22: ( ( NL )? token_DOUBLE_COLON ( NL )? primitive_pattern )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==NL) ) {
                            int LA5_1 = input.LA(2);

                            if ( ((LA5_1>=A_DOUBLE_COLON && LA5_1<=U_DOUBLE_COLON)) ) {
                                alt5=1;
                            }


                        }
                        else if ( ((LA5_0>=A_DOUBLE_COLON && LA5_0<=U_DOUBLE_COLON)) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:366:23: ( NL )? token_DOUBLE_COLON ( NL )? primitive_pattern
                    	    {
                    	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:366:23: ( NL )?
                    	    int alt3=2;
                    	    int LA3_0 = input.LA(1);

                    	    if ( (LA3_0==NL) ) {
                    	        alt3=1;
                    	    }
                    	    switch (alt3) {
                    	        case 1 :
                    	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:366:23: NL
                    	            {
                    	            NL17=(Token)match(input,NL,FOLLOW_NL_in_pattern1597); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_NL.add(NL17);


                    	            }
                    	            break;

                    	    }

                    	    pushFollow(FOLLOW_token_DOUBLE_COLON_in_pattern1600);
                    	    token_DOUBLE_COLON18=token_DOUBLE_COLON();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_token_DOUBLE_COLON.add(token_DOUBLE_COLON18.getTree());
                    	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:366:46: ( NL )?
                    	    int alt4=2;
                    	    int LA4_0 = input.LA(1);

                    	    if ( (LA4_0==NL) ) {
                    	        alt4=1;
                    	    }
                    	    switch (alt4) {
                    	        case 1 :
                    	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:366:46: NL
                    	            {
                    	            NL19=(Token)match(input,NL,FOLLOW_NL_in_pattern1602); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_NL.add(NL19);


                    	            }
                    	            break;

                    	    }

                    	    pushFollow(FOLLOW_primitive_pattern_in_pattern1605);
                    	    primitive_pattern20=primitive_pattern();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_primitive_pattern.add(primitive_pattern20.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);



                    // AST REWRITE
                    // elements: primitive_pattern
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 367:3: -> ^( LIST_CONS ( primitive_pattern )* )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:367:6: ^( LIST_CONS ( primitive_pattern )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LIST_CONS, "LIST_CONS"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:367:18: ( primitive_pattern )*
                        while ( stream_primitive_pattern.hasNext() ) {
                            adaptor.addChild(root_1, stream_primitive_pattern.nextTree());

                        }
                        stream_primitive_pattern.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "pattern"

    public static class bracket_pattern_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bracket_pattern"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:369:1: bracket_pattern : ( ( Id ( NL )? L_as )=> Id ( NL )? L_as ( NL )? pattern -> ^( L_as Id pattern ) | ( protected_expr ( NL )? QUESTION_MARK )=> protected_expr ( NL )? QUESTION_MARK ( ( NL )? pattern )? -> ^( QUESTION_MARK protected_expr ( pattern )? ) | pattern ( ( NL )? L_if ( NL )? protected_expr )? -> ^( IF_PATTERN pattern ( protected_expr )? ) | L_val ( NL )? protected_expr -> ^( L_val protected_expr ) | token_ELLIPSIS );
    public final babel17Parser.bracket_pattern_return bracket_pattern() throws RecognitionException {
        babel17Parser.bracket_pattern_return retval = new babel17Parser.bracket_pattern_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Id21=null;
        Token NL22=null;
        Token L_as23=null;
        Token NL24=null;
        Token NL27=null;
        Token QUESTION_MARK28=null;
        Token NL29=null;
        Token NL32=null;
        Token L_if33=null;
        Token NL34=null;
        Token L_val36=null;
        Token NL37=null;
        babel17Parser.pattern_return pattern25 = null;

        babel17Parser.protected_expr_return protected_expr26 = null;

        babel17Parser.pattern_return pattern30 = null;

        babel17Parser.pattern_return pattern31 = null;

        babel17Parser.protected_expr_return protected_expr35 = null;

        babel17Parser.protected_expr_return protected_expr38 = null;

        babel17Parser.token_ELLIPSIS_return token_ELLIPSIS39 = null;


        CommonTree Id21_tree=null;
        CommonTree NL22_tree=null;
        CommonTree L_as23_tree=null;
        CommonTree NL24_tree=null;
        CommonTree NL27_tree=null;
        CommonTree QUESTION_MARK28_tree=null;
        CommonTree NL29_tree=null;
        CommonTree NL32_tree=null;
        CommonTree L_if33_tree=null;
        CommonTree NL34_tree=null;
        CommonTree L_val36_tree=null;
        CommonTree NL37_tree=null;
        RewriteRuleTokenStream stream_L_as=new RewriteRuleTokenStream(adaptor,"token L_as");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_Id=new RewriteRuleTokenStream(adaptor,"token Id");
        RewriteRuleTokenStream stream_L_val=new RewriteRuleTokenStream(adaptor,"token L_val");
        RewriteRuleTokenStream stream_L_if=new RewriteRuleTokenStream(adaptor,"token L_if");
        RewriteRuleTokenStream stream_QUESTION_MARK=new RewriteRuleTokenStream(adaptor,"token QUESTION_MARK");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_protected_expr=new RewriteRuleSubtreeStream(adaptor,"rule protected_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:370:2: ( ( Id ( NL )? L_as )=> Id ( NL )? L_as ( NL )? pattern -> ^( L_as Id pattern ) | ( protected_expr ( NL )? QUESTION_MARK )=> protected_expr ( NL )? QUESTION_MARK ( ( NL )? pattern )? -> ^( QUESTION_MARK protected_expr ( pattern )? ) | pattern ( ( NL )? L_if ( NL )? protected_expr )? -> ^( IF_PATTERN pattern ( protected_expr )? ) | L_val ( NL )? protected_expr -> ^( L_val protected_expr ) | token_ELLIPSIS )
            int alt16=5;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:370:10: ( Id ( NL )? L_as )=> Id ( NL )? L_as ( NL )? pattern
                    {
                    Id21=(Token)match(input,Id,FOLLOW_Id_in_bracket_pattern1646); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Id.add(Id21);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:370:30: ( NL )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==NL) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:370:30: NL
                            {
                            NL22=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1648); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL22);


                            }
                            break;

                    }

                    L_as23=(Token)match(input,L_as,FOLLOW_L_as_in_bracket_pattern1651); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_as.add(L_as23);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:370:39: ( NL )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==NL) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:370:39: NL
                            {
                            NL24=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1653); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL24);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_pattern_in_bracket_pattern1656);
                    pattern25=pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pattern.add(pattern25.getTree());


                    // AST REWRITE
                    // elements: L_as, Id, pattern
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 370:51: -> ^( L_as Id pattern )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:370:54: ^( L_as Id pattern )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_L_as.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_Id.nextNode());
                        adaptor.addChild(root_1, stream_pattern.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:371:4: ( protected_expr ( NL )? QUESTION_MARK )=> protected_expr ( NL )? QUESTION_MARK ( ( NL )? pattern )?
                    {
                    pushFollow(FOLLOW_protected_expr_in_bracket_pattern1685);
                    protected_expr26=protected_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr26.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:372:18: ( NL )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==NL) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:372:18: NL
                            {
                            NL27=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1687); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL27);


                            }
                            break;

                    }

                    QUESTION_MARK28=(Token)match(input,QUESTION_MARK,FOLLOW_QUESTION_MARK_in_bracket_pattern1690); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QUESTION_MARK.add(QUESTION_MARK28);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:372:36: ( ( NL )? pattern )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==NL) ) {
                        int LA11_1 = input.LA(2);

                        if ( ((LA11_1>=A_infinity && LA11_1<=U_infinity)||(LA11_1>=L_true && LA11_1<=L_false)||LA11_1==MINUS||(LA11_1>=Constr && LA11_1<=Num)||(LA11_1>=String && LA11_1<=ROUND_BRACKET_OPEN)||LA11_1==SQUARE_BRACKET_OPEN||LA11_1==CURLY_BRACKET_OPEN||LA11_1==UNDERSCORE) ) {
                            alt11=1;
                        }
                    }
                    else if ( ((LA11_0>=A_infinity && LA11_0<=U_infinity)||(LA11_0>=L_true && LA11_0<=L_false)||LA11_0==MINUS||(LA11_0>=Constr && LA11_0<=Num)||(LA11_0>=String && LA11_0<=ROUND_BRACKET_OPEN)||LA11_0==SQUARE_BRACKET_OPEN||LA11_0==CURLY_BRACKET_OPEN||LA11_0==UNDERSCORE) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:372:37: ( NL )? pattern
                            {
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:372:37: ( NL )?
                            int alt10=2;
                            int LA10_0 = input.LA(1);

                            if ( (LA10_0==NL) ) {
                                alt10=1;
                            }
                            switch (alt10) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:372:37: NL
                                    {
                                    NL29=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1693); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL29);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_pattern_in_bracket_pattern1696);
                            pattern30=pattern();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_pattern.add(pattern30.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: pattern, protected_expr, QUESTION_MARK
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 372:51: -> ^( QUESTION_MARK protected_expr ( pattern )? )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:372:54: ^( QUESTION_MARK protected_expr ( pattern )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_QUESTION_MARK.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_protected_expr.nextTree());
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:372:85: ( pattern )?
                        if ( stream_pattern.hasNext() ) {
                            adaptor.addChild(root_1, stream_pattern.nextTree());

                        }
                        stream_pattern.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:373:4: pattern ( ( NL )? L_if ( NL )? protected_expr )?
                    {
                    pushFollow(FOLLOW_pattern_in_bracket_pattern1714);
                    pattern31=pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pattern.add(pattern31.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:373:12: ( ( NL )? L_if ( NL )? protected_expr )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==NL) ) {
                        int LA14_1 = input.LA(2);

                        if ( (LA14_1==L_if) ) {
                            alt14=1;
                        }
                    }
                    else if ( (LA14_0==L_if) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:373:13: ( NL )? L_if ( NL )? protected_expr
                            {
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:373:13: ( NL )?
                            int alt12=2;
                            int LA12_0 = input.LA(1);

                            if ( (LA12_0==NL) ) {
                                alt12=1;
                            }
                            switch (alt12) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:373:13: NL
                                    {
                                    NL32=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1717); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL32);


                                    }
                                    break;

                            }

                            L_if33=(Token)match(input,L_if,FOLLOW_L_if_in_bracket_pattern1720); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_L_if.add(L_if33);

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:373:22: ( NL )?
                            int alt13=2;
                            int LA13_0 = input.LA(1);

                            if ( (LA13_0==NL) ) {
                                alt13=1;
                            }
                            switch (alt13) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:373:22: NL
                                    {
                                    NL34=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1722); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL34);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_protected_expr_in_bracket_pattern1725);
                            protected_expr35=protected_expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr35.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: pattern, protected_expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 373:43: -> ^( IF_PATTERN pattern ( protected_expr )? )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:373:46: ^( IF_PATTERN pattern ( protected_expr )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IF_PATTERN, "IF_PATTERN"), root_1);

                        adaptor.addChild(root_1, stream_pattern.nextTree());
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:373:67: ( protected_expr )?
                        if ( stream_protected_expr.hasNext() ) {
                            adaptor.addChild(root_1, stream_protected_expr.nextTree());

                        }
                        stream_protected_expr.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:374:4: L_val ( NL )? protected_expr
                    {
                    L_val36=(Token)match(input,L_val,FOLLOW_L_val_in_bracket_pattern1743); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_val.add(L_val36);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:374:10: ( NL )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==NL) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:374:10: NL
                            {
                            NL37=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1745); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL37);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_protected_expr_in_bracket_pattern1748);
                    protected_expr38=protected_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr38.getTree());


                    // AST REWRITE
                    // elements: L_val, protected_expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 374:29: -> ^( L_val protected_expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:374:32: ^( L_val protected_expr )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_L_val.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_protected_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:375:4: token_ELLIPSIS
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_ELLIPSIS_in_bracket_pattern1761);
                    token_ELLIPSIS39=token_ELLIPSIS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, token_ELLIPSIS39.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "bracket_pattern"

    public static class mselem_pattern_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mselem_pattern"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:377:1: mselem_pattern : bracket_pattern ( ( NL )? token_ARROW ( NL )? bracket_pattern )? -> ^( NIL ( bracket_pattern )* ) ;
    public final babel17Parser.mselem_pattern_return mselem_pattern() throws RecognitionException {
        babel17Parser.mselem_pattern_return retval = new babel17Parser.mselem_pattern_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL41=null;
        Token NL43=null;
        babel17Parser.bracket_pattern_return bracket_pattern40 = null;

        babel17Parser.token_ARROW_return token_ARROW42 = null;

        babel17Parser.bracket_pattern_return bracket_pattern44 = null;


        CommonTree NL41_tree=null;
        CommonTree NL43_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_token_ARROW=new RewriteRuleSubtreeStream(adaptor,"rule token_ARROW");
        RewriteRuleSubtreeStream stream_bracket_pattern=new RewriteRuleSubtreeStream(adaptor,"rule bracket_pattern");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:378:2: ( bracket_pattern ( ( NL )? token_ARROW ( NL )? bracket_pattern )? -> ^( NIL ( bracket_pattern )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:378:4: bracket_pattern ( ( NL )? token_ARROW ( NL )? bracket_pattern )?
            {
            pushFollow(FOLLOW_bracket_pattern_in_mselem_pattern1771);
            bracket_pattern40=bracket_pattern();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bracket_pattern.add(bracket_pattern40.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:378:20: ( ( NL )? token_ARROW ( NL )? bracket_pattern )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==NL) ) {
                int LA19_1 = input.LA(2);

                if ( ((LA19_1>=A_ARROW && LA19_1<=U_ARROW)) ) {
                    alt19=1;
                }
            }
            else if ( ((LA19_0>=A_ARROW && LA19_0<=U_ARROW)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:378:21: ( NL )? token_ARROW ( NL )? bracket_pattern
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:378:21: ( NL )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==NL) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:378:21: NL
                            {
                            NL41=(Token)match(input,NL,FOLLOW_NL_in_mselem_pattern1774); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL41);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_token_ARROW_in_mselem_pattern1777);
                    token_ARROW42=token_ARROW();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_token_ARROW.add(token_ARROW42.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:378:37: ( NL )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==NL) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:378:37: NL
                            {
                            NL43=(Token)match(input,NL,FOLLOW_NL_in_mselem_pattern1779); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL43);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_bracket_pattern_in_mselem_pattern1782);
                    bracket_pattern44=bracket_pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_bracket_pattern.add(bracket_pattern44.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: bracket_pattern
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 379:3: -> ^( NIL ( bracket_pattern )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:379:6: ^( NIL ( bracket_pattern )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL, "NIL"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:379:12: ( bracket_pattern )*
                while ( stream_bracket_pattern.hasNext() ) {
                    adaptor.addChild(root_1, stream_bracket_pattern.nextTree());

                }
                stream_bracket_pattern.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "mselem_pattern"

    public static class primitive_pattern_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "primitive_pattern"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:381:1: primitive_pattern : ( Id | '_' -> ANY | String | Num | L_true | L_false | token_infinity | '-' ( NL )? token_infinity -> ^( UMINUS token_infinity ) | '-' ( NL )? Num -> ^( UMINUS Num ) | '[' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* )? ']' -> ^( SQUARE_LIST ( bracket_pattern )* ) | '(' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* ( COMMA ( NL )? )? )? ')' -> ^( ROUND_LIST ^( NIL ( COMMA )* ) ^( NIL ( bracket_pattern )* ) ) | '{' ( NL )? ( mselem_pattern ( NL )? ( COMMA ( NL )? mselem_pattern ( NL )? )* )? '}' -> ^( MAP_OR_SET ( mselem_pattern )* ) | '{' ( NL )? token_ARROW ( NL )? '}' -> ^( EMPTY_MAP ) );
    public final babel17Parser.primitive_pattern_return primitive_pattern() throws RecognitionException {
        babel17Parser.primitive_pattern_return retval = new babel17Parser.primitive_pattern_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Id45=null;
        Token char_literal46=null;
        Token String47=null;
        Token Num48=null;
        Token L_true49=null;
        Token L_false50=null;
        Token char_literal52=null;
        Token NL53=null;
        Token char_literal55=null;
        Token NL56=null;
        Token Num57=null;
        Token char_literal58=null;
        Token NL59=null;
        Token NL61=null;
        Token COMMA62=null;
        Token NL63=null;
        Token NL65=null;
        Token char_literal66=null;
        Token char_literal67=null;
        Token NL68=null;
        Token NL70=null;
        Token COMMA71=null;
        Token NL72=null;
        Token NL74=null;
        Token COMMA75=null;
        Token NL76=null;
        Token char_literal77=null;
        Token char_literal78=null;
        Token NL79=null;
        Token NL81=null;
        Token COMMA82=null;
        Token NL83=null;
        Token NL85=null;
        Token char_literal86=null;
        Token char_literal87=null;
        Token NL88=null;
        Token NL90=null;
        Token char_literal91=null;
        babel17Parser.token_infinity_return token_infinity51 = null;

        babel17Parser.token_infinity_return token_infinity54 = null;

        babel17Parser.bracket_pattern_return bracket_pattern60 = null;

        babel17Parser.bracket_pattern_return bracket_pattern64 = null;

        babel17Parser.bracket_pattern_return bracket_pattern69 = null;

        babel17Parser.bracket_pattern_return bracket_pattern73 = null;

        babel17Parser.mselem_pattern_return mselem_pattern80 = null;

        babel17Parser.mselem_pattern_return mselem_pattern84 = null;

        babel17Parser.token_ARROW_return token_ARROW89 = null;


        CommonTree Id45_tree=null;
        CommonTree char_literal46_tree=null;
        CommonTree String47_tree=null;
        CommonTree Num48_tree=null;
        CommonTree L_true49_tree=null;
        CommonTree L_false50_tree=null;
        CommonTree char_literal52_tree=null;
        CommonTree NL53_tree=null;
        CommonTree char_literal55_tree=null;
        CommonTree NL56_tree=null;
        CommonTree Num57_tree=null;
        CommonTree char_literal58_tree=null;
        CommonTree NL59_tree=null;
        CommonTree NL61_tree=null;
        CommonTree COMMA62_tree=null;
        CommonTree NL63_tree=null;
        CommonTree NL65_tree=null;
        CommonTree char_literal66_tree=null;
        CommonTree char_literal67_tree=null;
        CommonTree NL68_tree=null;
        CommonTree NL70_tree=null;
        CommonTree COMMA71_tree=null;
        CommonTree NL72_tree=null;
        CommonTree NL74_tree=null;
        CommonTree COMMA75_tree=null;
        CommonTree NL76_tree=null;
        CommonTree char_literal77_tree=null;
        CommonTree char_literal78_tree=null;
        CommonTree NL79_tree=null;
        CommonTree NL81_tree=null;
        CommonTree COMMA82_tree=null;
        CommonTree NL83_tree=null;
        CommonTree NL85_tree=null;
        CommonTree char_literal86_tree=null;
        CommonTree char_literal87_tree=null;
        CommonTree NL88_tree=null;
        CommonTree NL90_tree=null;
        CommonTree char_literal91_tree=null;
        RewriteRuleTokenStream stream_CURLY_BRACKET_OPEN=new RewriteRuleTokenStream(adaptor,"token CURLY_BRACKET_OPEN");
        RewriteRuleTokenStream stream_ROUND_BRACKET_OPEN=new RewriteRuleTokenStream(adaptor,"token ROUND_BRACKET_OPEN");
        RewriteRuleTokenStream stream_CURLY_BRACKET_CLOSE=new RewriteRuleTokenStream(adaptor,"token CURLY_BRACKET_CLOSE");
        RewriteRuleTokenStream stream_UNDERSCORE=new RewriteRuleTokenStream(adaptor,"token UNDERSCORE");
        RewriteRuleTokenStream stream_Num=new RewriteRuleTokenStream(adaptor,"token Num");
        RewriteRuleTokenStream stream_SQUARE_BRACKET_CLOSE=new RewriteRuleTokenStream(adaptor,"token SQUARE_BRACKET_CLOSE");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_ROUND_BRACKET_CLOSE=new RewriteRuleTokenStream(adaptor,"token ROUND_BRACKET_CLOSE");
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_SQUARE_BRACKET_OPEN=new RewriteRuleTokenStream(adaptor,"token SQUARE_BRACKET_OPEN");
        RewriteRuleSubtreeStream stream_mselem_pattern=new RewriteRuleSubtreeStream(adaptor,"rule mselem_pattern");
        RewriteRuleSubtreeStream stream_token_ARROW=new RewriteRuleSubtreeStream(adaptor,"rule token_ARROW");
        RewriteRuleSubtreeStream stream_token_infinity=new RewriteRuleSubtreeStream(adaptor,"rule token_infinity");
        RewriteRuleSubtreeStream stream_bracket_pattern=new RewriteRuleSubtreeStream(adaptor,"rule bracket_pattern");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:382:2: ( Id | '_' -> ANY | String | Num | L_true | L_false | token_infinity | '-' ( NL )? token_infinity -> ^( UMINUS token_infinity ) | '-' ( NL )? Num -> ^( UMINUS Num ) | '[' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* )? ']' -> ^( SQUARE_LIST ( bracket_pattern )* ) | '(' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* ( COMMA ( NL )? )? )? ')' -> ^( ROUND_LIST ^( NIL ( COMMA )* ) ^( NIL ( bracket_pattern )* ) ) | '{' ( NL )? ( mselem_pattern ( NL )? ( COMMA ( NL )? mselem_pattern ( NL )? )* )? '}' -> ^( MAP_OR_SET ( mselem_pattern )* ) | '{' ( NL )? token_ARROW ( NL )? '}' -> ^( EMPTY_MAP ) )
            int alt44=13;
            alt44 = dfa44.predict(input);
            switch (alt44) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:382:4: Id
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Id45=(Token)match(input,Id,FOLLOW_Id_in_primitive_pattern1804); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Id45_tree = (CommonTree)adaptor.create(Id45);
                    adaptor.addChild(root_0, Id45_tree);
                    }

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:383:4: '_'
                    {
                    char_literal46=(Token)match(input,UNDERSCORE,FOLLOW_UNDERSCORE_in_primitive_pattern1809); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_UNDERSCORE.add(char_literal46);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 383:8: -> ANY
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(ANY, "ANY"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:384:4: String
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    String47=(Token)match(input,String,FOLLOW_String_in_primitive_pattern1818); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    String47_tree = (CommonTree)adaptor.create(String47);
                    adaptor.addChild(root_0, String47_tree);
                    }

                    }
                    break;
                case 4 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:385:4: Num
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Num48=(Token)match(input,Num,FOLLOW_Num_in_primitive_pattern1823); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Num48_tree = (CommonTree)adaptor.create(Num48);
                    adaptor.addChild(root_0, Num48_tree);
                    }

                    }
                    break;
                case 5 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:386:4: L_true
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    L_true49=(Token)match(input,L_true,FOLLOW_L_true_in_primitive_pattern1828); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    L_true49_tree = (CommonTree)adaptor.create(L_true49);
                    adaptor.addChild(root_0, L_true49_tree);
                    }

                    }
                    break;
                case 6 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:387:4: L_false
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    L_false50=(Token)match(input,L_false,FOLLOW_L_false_in_primitive_pattern1833); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    L_false50_tree = (CommonTree)adaptor.create(L_false50);
                    adaptor.addChild(root_0, L_false50_tree);
                    }

                    }
                    break;
                case 7 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:388:4: token_infinity
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_infinity_in_primitive_pattern1838);
                    token_infinity51=token_infinity();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, token_infinity51.getTree());

                    }
                    break;
                case 8 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:389:4: '-' ( NL )? token_infinity
                    {
                    char_literal52=(Token)match(input,MINUS,FOLLOW_MINUS_in_primitive_pattern1843); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(char_literal52);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:389:8: ( NL )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==NL) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:389:8: NL
                            {
                            NL53=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern1845); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL53);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_token_infinity_in_primitive_pattern1848);
                    token_infinity54=token_infinity();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_token_infinity.add(token_infinity54.getTree());


                    // AST REWRITE
                    // elements: token_infinity
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 389:27: -> ^( UMINUS token_infinity )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:389:30: ^( UMINUS token_infinity )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(UMINUS, "UMINUS"), root_1);

                        adaptor.addChild(root_1, stream_token_infinity.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 9 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:390:4: '-' ( NL )? Num
                    {
                    char_literal55=(Token)match(input,MINUS,FOLLOW_MINUS_in_primitive_pattern1861); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(char_literal55);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:390:8: ( NL )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==NL) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:390:8: NL
                            {
                            NL56=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern1863); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL56);


                            }
                            break;

                    }

                    Num57=(Token)match(input,Num,FOLLOW_Num_in_primitive_pattern1866); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Num.add(Num57);



                    // AST REWRITE
                    // elements: Num
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 390:16: -> ^( UMINUS Num )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:390:19: ^( UMINUS Num )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(UMINUS, "UMINUS"), root_1);

                        adaptor.addChild(root_1, stream_Num.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 10 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:391:4: '[' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* )? ']'
                    {
                    char_literal58=(Token)match(input,SQUARE_BRACKET_OPEN,FOLLOW_SQUARE_BRACKET_OPEN_in_primitive_pattern1879); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SQUARE_BRACKET_OPEN.add(char_literal58);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:391:9: ( NL )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==NL) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:391:9: NL
                            {
                            NL59=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern1882); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL59);


                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:391:13: ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==L_begin||(LA27_0>=L_obj && LA27_0<=L_if)||(LA27_0>=L_while && LA27_0<=L_for)||(LA27_0>=L_match && LA27_0<=L_case)||LA27_0==L_val||LA27_0==L_exception||(LA27_0>=A_infinity && LA27_0<=U_infinity)||LA27_0==L_root||(LA27_0>=L_concurrent && LA27_0<=L_lazy)||(LA27_0>=L_true && LA27_0<=L_random)||LA27_0==MINUS||LA27_0==MODULE_KEY||LA27_0==A_NOT||LA27_0==U_NOT||(LA27_0>=A_ELLIPSIS && LA27_0<=U_ELLIPSIS)||LA27_0==TILDE||(LA27_0>=Constr && LA27_0<=Num)||(LA27_0>=String && LA27_0<=ROUND_BRACKET_OPEN)||LA27_0==SQUARE_BRACKET_OPEN||LA27_0==CURLY_BRACKET_OPEN||LA27_0==UNDERSCORE) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:391:14: bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )*
                            {
                            pushFollow(FOLLOW_bracket_pattern_in_primitive_pattern1886);
                            bracket_pattern60=bracket_pattern();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_bracket_pattern.add(bracket_pattern60.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:391:30: ( NL )?
                            int alt23=2;
                            int LA23_0 = input.LA(1);

                            if ( (LA23_0==NL) ) {
                                alt23=1;
                            }
                            switch (alt23) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:391:30: NL
                                    {
                                    NL61=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern1888); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL61);


                                    }
                                    break;

                            }

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:391:34: ( COMMA ( NL )? bracket_pattern ( NL )? )*
                            loop26:
                            do {
                                int alt26=2;
                                int LA26_0 = input.LA(1);

                                if ( (LA26_0==COMMA) ) {
                                    alt26=1;
                                }


                                switch (alt26) {
                            	case 1 :
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:391:36: COMMA ( NL )? bracket_pattern ( NL )?
                            	    {
                            	    COMMA62=(Token)match(input,COMMA,FOLLOW_COMMA_in_primitive_pattern1893); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA62);

                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:391:42: ( NL )?
                            	    int alt24=2;
                            	    int LA24_0 = input.LA(1);

                            	    if ( (LA24_0==NL) ) {
                            	        alt24=1;
                            	    }
                            	    switch (alt24) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:391:42: NL
                            	            {
                            	            NL63=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern1895); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL63);


                            	            }
                            	            break;

                            	    }

                            	    pushFollow(FOLLOW_bracket_pattern_in_primitive_pattern1898);
                            	    bracket_pattern64=bracket_pattern();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_bracket_pattern.add(bracket_pattern64.getTree());
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:391:62: ( NL )?
                            	    int alt25=2;
                            	    int LA25_0 = input.LA(1);

                            	    if ( (LA25_0==NL) ) {
                            	        alt25=1;
                            	    }
                            	    switch (alt25) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:391:62: NL
                            	            {
                            	            NL65=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern1900); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL65);


                            	            }
                            	            break;

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop26;
                                }
                            } while (true);


                            }
                            break;

                    }

                    char_literal66=(Token)match(input,SQUARE_BRACKET_CLOSE,FOLLOW_SQUARE_BRACKET_CLOSE_in_primitive_pattern1908); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SQUARE_BRACKET_CLOSE.add(char_literal66);



                    // AST REWRITE
                    // elements: bracket_pattern
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 392:6: -> ^( SQUARE_LIST ( bracket_pattern )* )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:392:9: ^( SQUARE_LIST ( bracket_pattern )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SQUARE_LIST, "SQUARE_LIST"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:392:23: ( bracket_pattern )*
                        while ( stream_bracket_pattern.hasNext() ) {
                            adaptor.addChild(root_1, stream_bracket_pattern.nextTree());

                        }
                        stream_bracket_pattern.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 11 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:393:4: '(' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* ( COMMA ( NL )? )? )? ')'
                    {
                    char_literal67=(Token)match(input,ROUND_BRACKET_OPEN,FOLLOW_ROUND_BRACKET_OPEN_in_primitive_pattern1928); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ROUND_BRACKET_OPEN.add(char_literal67);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:393:9: ( NL )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==NL) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:393:9: NL
                            {
                            NL68=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern1931); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL68);


                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:393:13: ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* ( COMMA ( NL )? )? )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==L_begin||(LA35_0>=L_obj && LA35_0<=L_if)||(LA35_0>=L_while && LA35_0<=L_for)||(LA35_0>=L_match && LA35_0<=L_case)||LA35_0==L_val||LA35_0==L_exception||(LA35_0>=A_infinity && LA35_0<=U_infinity)||LA35_0==L_root||(LA35_0>=L_concurrent && LA35_0<=L_lazy)||(LA35_0>=L_true && LA35_0<=L_random)||LA35_0==MINUS||LA35_0==MODULE_KEY||LA35_0==A_NOT||LA35_0==U_NOT||(LA35_0>=A_ELLIPSIS && LA35_0<=U_ELLIPSIS)||LA35_0==TILDE||(LA35_0>=Constr && LA35_0<=Num)||(LA35_0>=String && LA35_0<=ROUND_BRACKET_OPEN)||LA35_0==SQUARE_BRACKET_OPEN||LA35_0==CURLY_BRACKET_OPEN||LA35_0==UNDERSCORE) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:393:14: bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* ( COMMA ( NL )? )?
                            {
                            pushFollow(FOLLOW_bracket_pattern_in_primitive_pattern1935);
                            bracket_pattern69=bracket_pattern();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_bracket_pattern.add(bracket_pattern69.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:393:30: ( NL )?
                            int alt29=2;
                            int LA29_0 = input.LA(1);

                            if ( (LA29_0==NL) ) {
                                alt29=1;
                            }
                            switch (alt29) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:393:30: NL
                                    {
                                    NL70=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern1937); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL70);


                                    }
                                    break;

                            }

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:393:34: ( COMMA ( NL )? bracket_pattern ( NL )? )*
                            loop32:
                            do {
                                int alt32=2;
                                int LA32_0 = input.LA(1);

                                if ( (LA32_0==COMMA) ) {
                                    int LA32_1 = input.LA(2);

                                    if ( (LA32_1==NL) ) {
                                        int LA32_3 = input.LA(3);

                                        if ( (LA32_3==L_begin||(LA32_3>=L_obj && LA32_3<=L_if)||(LA32_3>=L_while && LA32_3<=L_for)||(LA32_3>=L_match && LA32_3<=L_case)||LA32_3==L_val||LA32_3==L_exception||(LA32_3>=A_infinity && LA32_3<=U_infinity)||LA32_3==L_root||(LA32_3>=L_concurrent && LA32_3<=L_lazy)||(LA32_3>=L_true && LA32_3<=L_random)||LA32_3==MINUS||LA32_3==MODULE_KEY||LA32_3==A_NOT||LA32_3==U_NOT||(LA32_3>=A_ELLIPSIS && LA32_3<=U_ELLIPSIS)||LA32_3==TILDE||(LA32_3>=Constr && LA32_3<=Num)||(LA32_3>=String && LA32_3<=ROUND_BRACKET_OPEN)||LA32_3==SQUARE_BRACKET_OPEN||LA32_3==CURLY_BRACKET_OPEN||LA32_3==UNDERSCORE) ) {
                                            alt32=1;
                                        }


                                    }
                                    else if ( (LA32_1==L_begin||(LA32_1>=L_obj && LA32_1<=L_if)||(LA32_1>=L_while && LA32_1<=L_for)||(LA32_1>=L_match && LA32_1<=L_case)||LA32_1==L_val||LA32_1==L_exception||(LA32_1>=A_infinity && LA32_1<=U_infinity)||LA32_1==L_root||(LA32_1>=L_concurrent && LA32_1<=L_lazy)||(LA32_1>=L_true && LA32_1<=L_random)||LA32_1==MINUS||LA32_1==MODULE_KEY||LA32_1==A_NOT||LA32_1==U_NOT||(LA32_1>=A_ELLIPSIS && LA32_1<=U_ELLIPSIS)||LA32_1==TILDE||(LA32_1>=Constr && LA32_1<=Num)||(LA32_1>=String && LA32_1<=ROUND_BRACKET_OPEN)||LA32_1==SQUARE_BRACKET_OPEN||LA32_1==CURLY_BRACKET_OPEN||LA32_1==UNDERSCORE) ) {
                                        alt32=1;
                                    }


                                }


                                switch (alt32) {
                            	case 1 :
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:393:36: COMMA ( NL )? bracket_pattern ( NL )?
                            	    {
                            	    COMMA71=(Token)match(input,COMMA,FOLLOW_COMMA_in_primitive_pattern1942); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA71);

                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:393:43: ( NL )?
                            	    int alt30=2;
                            	    int LA30_0 = input.LA(1);

                            	    if ( (LA30_0==NL) ) {
                            	        alt30=1;
                            	    }
                            	    switch (alt30) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:393:43: NL
                            	            {
                            	            NL72=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern1945); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL72);


                            	            }
                            	            break;

                            	    }

                            	    pushFollow(FOLLOW_bracket_pattern_in_primitive_pattern1948);
                            	    bracket_pattern73=bracket_pattern();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_bracket_pattern.add(bracket_pattern73.getTree());
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:393:63: ( NL )?
                            	    int alt31=2;
                            	    int LA31_0 = input.LA(1);

                            	    if ( (LA31_0==NL) ) {
                            	        alt31=1;
                            	    }
                            	    switch (alt31) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:393:63: NL
                            	            {
                            	            NL74=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern1950); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL74);


                            	            }
                            	            break;

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop32;
                                }
                            } while (true);

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:393:69: ( COMMA ( NL )? )?
                            int alt34=2;
                            int LA34_0 = input.LA(1);

                            if ( (LA34_0==COMMA) ) {
                                alt34=1;
                            }
                            switch (alt34) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:393:70: COMMA ( NL )?
                                    {
                                    COMMA75=(Token)match(input,COMMA,FOLLOW_COMMA_in_primitive_pattern1956); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_COMMA.add(COMMA75);

                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:393:76: ( NL )?
                                    int alt33=2;
                                    int LA33_0 = input.LA(1);

                                    if ( (LA33_0==NL) ) {
                                        alt33=1;
                                    }
                                    switch (alt33) {
                                        case 1 :
                                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:393:76: NL
                                            {
                                            NL76=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern1958); if (state.failed) return retval; 
                                            if ( state.backtracking==0 ) stream_NL.add(NL76);


                                            }
                                            break;

                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    char_literal77=(Token)match(input,ROUND_BRACKET_CLOSE,FOLLOW_ROUND_BRACKET_CLOSE_in_primitive_pattern1965); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ROUND_BRACKET_CLOSE.add(char_literal77);



                    // AST REWRITE
                    // elements: bracket_pattern, COMMA
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 394:5: -> ^( ROUND_LIST ^( NIL ( COMMA )* ) ^( NIL ( bracket_pattern )* ) )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:394:8: ^( ROUND_LIST ^( NIL ( COMMA )* ) ^( NIL ( bracket_pattern )* ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ROUND_LIST, "ROUND_LIST"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:394:21: ^( NIL ( COMMA )* )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL, "NIL"), root_2);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:394:27: ( COMMA )*
                        while ( stream_COMMA.hasNext() ) {
                            adaptor.addChild(root_2, stream_COMMA.nextNode());

                        }
                        stream_COMMA.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:394:35: ^( NIL ( bracket_pattern )* )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL, "NIL"), root_2);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:394:41: ( bracket_pattern )*
                        while ( stream_bracket_pattern.hasNext() ) {
                            adaptor.addChild(root_2, stream_bracket_pattern.nextTree());

                        }
                        stream_bracket_pattern.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 12 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:395:4: '{' ( NL )? ( mselem_pattern ( NL )? ( COMMA ( NL )? mselem_pattern ( NL )? )* )? '}'
                    {
                    char_literal78=(Token)match(input,CURLY_BRACKET_OPEN,FOLLOW_CURLY_BRACKET_OPEN_in_primitive_pattern1997); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_OPEN.add(char_literal78);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:395:9: ( NL )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==NL) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:395:9: NL
                            {
                            NL79=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2000); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL79);


                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:395:13: ( mselem_pattern ( NL )? ( COMMA ( NL )? mselem_pattern ( NL )? )* )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==L_begin||(LA41_0>=L_obj && LA41_0<=L_if)||(LA41_0>=L_while && LA41_0<=L_for)||(LA41_0>=L_match && LA41_0<=L_case)||LA41_0==L_val||LA41_0==L_exception||(LA41_0>=A_infinity && LA41_0<=U_infinity)||LA41_0==L_root||(LA41_0>=L_concurrent && LA41_0<=L_lazy)||(LA41_0>=L_true && LA41_0<=L_random)||LA41_0==MINUS||LA41_0==MODULE_KEY||LA41_0==A_NOT||LA41_0==U_NOT||(LA41_0>=A_ELLIPSIS && LA41_0<=U_ELLIPSIS)||LA41_0==TILDE||(LA41_0>=Constr && LA41_0<=Num)||(LA41_0>=String && LA41_0<=ROUND_BRACKET_OPEN)||LA41_0==SQUARE_BRACKET_OPEN||LA41_0==CURLY_BRACKET_OPEN||LA41_0==UNDERSCORE) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:395:14: mselem_pattern ( NL )? ( COMMA ( NL )? mselem_pattern ( NL )? )*
                            {
                            pushFollow(FOLLOW_mselem_pattern_in_primitive_pattern2004);
                            mselem_pattern80=mselem_pattern();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_mselem_pattern.add(mselem_pattern80.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:395:29: ( NL )?
                            int alt37=2;
                            int LA37_0 = input.LA(1);

                            if ( (LA37_0==NL) ) {
                                alt37=1;
                            }
                            switch (alt37) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:395:29: NL
                                    {
                                    NL81=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2006); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL81);


                                    }
                                    break;

                            }

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:395:33: ( COMMA ( NL )? mselem_pattern ( NL )? )*
                            loop40:
                            do {
                                int alt40=2;
                                int LA40_0 = input.LA(1);

                                if ( (LA40_0==COMMA) ) {
                                    alt40=1;
                                }


                                switch (alt40) {
                            	case 1 :
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:395:35: COMMA ( NL )? mselem_pattern ( NL )?
                            	    {
                            	    COMMA82=(Token)match(input,COMMA,FOLLOW_COMMA_in_primitive_pattern2011); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA82);

                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:395:42: ( NL )?
                            	    int alt38=2;
                            	    int LA38_0 = input.LA(1);

                            	    if ( (LA38_0==NL) ) {
                            	        alt38=1;
                            	    }
                            	    switch (alt38) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:395:42: NL
                            	            {
                            	            NL83=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2014); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL83);


                            	            }
                            	            break;

                            	    }

                            	    pushFollow(FOLLOW_mselem_pattern_in_primitive_pattern2017);
                            	    mselem_pattern84=mselem_pattern();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_mselem_pattern.add(mselem_pattern84.getTree());
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:395:61: ( NL )?
                            	    int alt39=2;
                            	    int LA39_0 = input.LA(1);

                            	    if ( (LA39_0==NL) ) {
                            	        alt39=1;
                            	    }
                            	    switch (alt39) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:395:61: NL
                            	            {
                            	            NL85=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2019); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL85);


                            	            }
                            	            break;

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop40;
                                }
                            } while (true);


                            }
                            break;

                    }

                    char_literal86=(Token)match(input,CURLY_BRACKET_CLOSE,FOLLOW_CURLY_BRACKET_CLOSE_in_primitive_pattern2027); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_CLOSE.add(char_literal86);



                    // AST REWRITE
                    // elements: mselem_pattern
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 396:5: -> ^( MAP_OR_SET ( mselem_pattern )* )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:396:8: ^( MAP_OR_SET ( mselem_pattern )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MAP_OR_SET, "MAP_OR_SET"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:396:21: ( mselem_pattern )*
                        while ( stream_mselem_pattern.hasNext() ) {
                            adaptor.addChild(root_1, stream_mselem_pattern.nextTree());

                        }
                        stream_mselem_pattern.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 13 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:397:4: '{' ( NL )? token_ARROW ( NL )? '}'
                    {
                    char_literal87=(Token)match(input,CURLY_BRACKET_OPEN,FOLLOW_CURLY_BRACKET_OPEN_in_primitive_pattern2045); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_OPEN.add(char_literal87);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:397:8: ( NL )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==NL) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:397:8: NL
                            {
                            NL88=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2047); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL88);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_token_ARROW_in_primitive_pattern2050);
                    token_ARROW89=token_ARROW();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_token_ARROW.add(token_ARROW89.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:397:24: ( NL )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==NL) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:397:24: NL
                            {
                            NL90=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2052); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL90);


                            }
                            break;

                    }

                    char_literal91=(Token)match(input,CURLY_BRACKET_CLOSE,FOLLOW_CURLY_BRACKET_CLOSE_in_primitive_pattern2055); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_CLOSE.add(char_literal91);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 397:32: -> ^( EMPTY_MAP )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:397:35: ^( EMPTY_MAP )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EMPTY_MAP, "EMPTY_MAP"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "primitive_pattern"

    public static class sep_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sep"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:401:1: sep : ( NL | SC )+ ;
    public final babel17Parser.sep_return sep() throws RecognitionException {
        babel17Parser.sep_return retval = new babel17Parser.sep_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set92=null;

        CommonTree set92_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:401:5: ( ( NL | SC )+ )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:401:7: ( NL | SC )+
            {
            root_0 = (CommonTree)adaptor.nil();

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:401:7: ( NL | SC )+
            int cnt45=0;
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==SC||LA45_0==NL) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:
            	    {
            	    set92=(Token)input.LT(1);
            	    if ( input.LA(1)==SC||input.LA(1)==NL ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set92));
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt45 >= 1 ) break loop45;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(45, input);
                        throw eee;
                }
                cnt45++;
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "sep"

    public static class block_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "block"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:403:1: block : ( ( sep )? statement ( sep statement )* ( sep )? -> ^( BLOCK ( statement )* ) | ( sep )? -> ^( BLOCK ) );
    public final babel17Parser.block_return block() throws RecognitionException {
        babel17Parser.block_return retval = new babel17Parser.block_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.sep_return sep93 = null;

        babel17Parser.statement_return statement94 = null;

        babel17Parser.sep_return sep95 = null;

        babel17Parser.statement_return statement96 = null;

        babel17Parser.sep_return sep97 = null;

        babel17Parser.sep_return sep98 = null;


        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_sep=new RewriteRuleSubtreeStream(adaptor,"rule sep");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:403:8: ( ( sep )? statement ( sep statement )* ( sep )? -> ^( BLOCK ( statement )* ) | ( sep )? -> ^( BLOCK ) )
            int alt50=2;
            alt50 = dfa50.predict(input);
            switch (alt50) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:403:10: ( sep )? statement ( sep statement )* ( sep )?
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:403:10: ( sep )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==SC||LA46_0==NL) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:403:10: sep
                            {
                            pushFollow(FOLLOW_sep_in_block2091);
                            sep93=sep();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_sep.add(sep93.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_statement_in_block2094);
                    statement94=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement94.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:403:25: ( sep statement )*
                    loop47:
                    do {
                        int alt47=2;
                        alt47 = dfa47.predict(input);
                        switch (alt47) {
                    	case 1 :
                    	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:403:26: sep statement
                    	    {
                    	    pushFollow(FOLLOW_sep_in_block2097);
                    	    sep95=sep();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_sep.add(sep95.getTree());
                    	    pushFollow(FOLLOW_statement_in_block2099);
                    	    statement96=statement();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_statement.add(statement96.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop47;
                        }
                    } while (true);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:403:42: ( sep )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==SC||LA48_0==NL) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:403:42: sep
                            {
                            pushFollow(FOLLOW_sep_in_block2103);
                            sep97=sep();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_sep.add(sep97.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: statement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 403:47: -> ^( BLOCK ( statement )* )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:403:50: ^( BLOCK ( statement )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:403:58: ( statement )*
                        while ( stream_statement.hasNext() ) {
                            adaptor.addChild(root_1, stream_statement.nextTree());

                        }
                        stream_statement.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:404:4: ( sep )?
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:404:4: ( sep )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==SC||LA49_0==NL) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:404:4: sep
                            {
                            pushFollow(FOLLOW_sep_in_block2119);
                            sep98=sep();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_sep.add(sep98.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 404:9: -> ^( BLOCK )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:404:12: ^( BLOCK )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "block"

    public static class pure_block_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pure_block"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:406:1: pure_block : statement ( sep statement )* -> ^( BLOCK ( statement )* ) ;
    public final babel17Parser.pure_block_return pure_block() throws RecognitionException {
        babel17Parser.pure_block_return retval = new babel17Parser.pure_block_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.statement_return statement99 = null;

        babel17Parser.sep_return sep100 = null;

        babel17Parser.statement_return statement101 = null;


        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_sep=new RewriteRuleSubtreeStream(adaptor,"rule sep");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:407:2: ( statement ( sep statement )* -> ^( BLOCK ( statement )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:407:4: statement ( sep statement )*
            {
            pushFollow(FOLLOW_statement_in_pure_block2136);
            statement99=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statement.add(statement99.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:407:14: ( sep statement )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==NL) ) {
                    int LA51_1 = input.LA(2);

                    if ( (LA51_1==L_begin||(LA51_1>=L_obj && LA51_1<=L_if)||(LA51_1>=L_while && LA51_1<=L_for)||(LA51_1>=L_yield && LA51_1<=L_match)||(LA51_1>=L_val && LA51_1<=L_def)||LA51_1==L_exception||(LA51_1>=A_infinity && LA51_1<=L_package)||LA51_1==SC||LA51_1==MINUS||LA51_1==MODULE_KEY||LA51_1==A_NOT||LA51_1==U_NOT||LA51_1==TILDE||(LA51_1>=NL && LA51_1<=Num)||(LA51_1>=String && LA51_1<=ROUND_BRACKET_OPEN)||LA51_1==SQUARE_BRACKET_OPEN||LA51_1==CURLY_BRACKET_OPEN||LA51_1==UNDERSCORE) ) {
                        alt51=1;
                    }


                }
                else if ( (LA51_0==SC) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:407:15: sep statement
            	    {
            	    pushFollow(FOLLOW_sep_in_pure_block2139);
            	    sep100=sep();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_sep.add(sep100.getTree());
            	    pushFollow(FOLLOW_statement_in_pure_block2141);
            	    statement101=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement101.getTree());

            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);



            // AST REWRITE
            // elements: statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 407:31: -> ^( BLOCK ( statement )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:407:34: ^( BLOCK ( statement )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:407:42: ( statement )*
                while ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_statement.nextTree());

                }
                stream_statement.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "pure_block"

    public static class statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:409:1: statement : ( st_val | st_def | st_memoize | st_module | st_package | st_yield | expr_or_assign );
    public final babel17Parser.statement_return statement() throws RecognitionException {
        babel17Parser.statement_return retval = new babel17Parser.statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.st_val_return st_val102 = null;

        babel17Parser.st_def_return st_def103 = null;

        babel17Parser.st_memoize_return st_memoize104 = null;

        babel17Parser.st_module_return st_module105 = null;

        babel17Parser.st_package_return st_package106 = null;

        babel17Parser.st_yield_return st_yield107 = null;

        babel17Parser.expr_or_assign_return expr_or_assign108 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:410:2: ( st_val | st_def | st_memoize | st_module | st_package | st_yield | expr_or_assign )
            int alt52=7;
            alt52 = dfa52.predict(input);
            switch (alt52) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:410:4: st_val
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_st_val_in_statement2162);
                    st_val102=st_val();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, st_val102.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:411:4: st_def
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_st_def_in_statement2167);
                    st_def103=st_def();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, st_def103.getTree());

                    }
                    break;
                case 3 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:412:4: st_memoize
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_st_memoize_in_statement2172);
                    st_memoize104=st_memoize();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, st_memoize104.getTree());

                    }
                    break;
                case 4 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:413:4: st_module
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_st_module_in_statement2177);
                    st_module105=st_module();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, st_module105.getTree());

                    }
                    break;
                case 5 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:414:4: st_package
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_st_package_in_statement2182);
                    st_package106=st_package();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, st_package106.getTree());

                    }
                    break;
                case 6 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:415:4: st_yield
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_st_yield_in_statement2187);
                    st_yield107=st_yield();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, st_yield107.getTree());

                    }
                    break;
                case 7 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:416:4: expr_or_assign
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_expr_or_assign_in_statement2192);
                    expr_or_assign108=expr_or_assign();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_or_assign108.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "statement"

    public static class objelem_assign_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "objelem_assign"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:418:1: objelem_assign : Id PERIOD Id ;
    public final babel17Parser.objelem_assign_return objelem_assign() throws RecognitionException {
        babel17Parser.objelem_assign_return retval = new babel17Parser.objelem_assign_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Id109=null;
        Token PERIOD110=null;
        Token Id111=null;

        CommonTree Id109_tree=null;
        CommonTree PERIOD110_tree=null;
        CommonTree Id111_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:419:2: ( Id PERIOD Id )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:419:4: Id PERIOD Id
            {
            root_0 = (CommonTree)adaptor.nil();

            Id109=(Token)match(input,Id,FOLLOW_Id_in_objelem_assign2201); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Id109_tree = (CommonTree)adaptor.create(Id109);
            adaptor.addChild(root_0, Id109_tree);
            }
            PERIOD110=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_objelem_assign2203); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            PERIOD110_tree = (CommonTree)adaptor.create(PERIOD110);
            adaptor.addChild(root_0, PERIOD110_tree);
            }
            Id111=(Token)match(input,Id,FOLLOW_Id_in_objelem_assign2205); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Id111_tree = (CommonTree)adaptor.create(Id111);
            adaptor.addChild(root_0, Id111_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "objelem_assign"

    public static class st_val_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "st_val"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:421:1: st_val : L_val ( NL )? ( pattern | objelem_assign ) ( NL )? '=' ( NL )? expr -> ^( VAL ( pattern )* ( objelem_assign )* expr ) ;
    public final babel17Parser.st_val_return st_val() throws RecognitionException {
        babel17Parser.st_val_return retval = new babel17Parser.st_val_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_val112=null;
        Token NL113=null;
        Token NL116=null;
        Token char_literal117=null;
        Token NL118=null;
        babel17Parser.pattern_return pattern114 = null;

        babel17Parser.objelem_assign_return objelem_assign115 = null;

        babel17Parser.expr_return expr119 = null;


        CommonTree L_val112_tree=null;
        CommonTree NL113_tree=null;
        CommonTree NL116_tree=null;
        CommonTree char_literal117_tree=null;
        CommonTree NL118_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_val=new RewriteRuleTokenStream(adaptor,"token L_val");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_objelem_assign=new RewriteRuleSubtreeStream(adaptor,"rule objelem_assign");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:421:8: ( L_val ( NL )? ( pattern | objelem_assign ) ( NL )? '=' ( NL )? expr -> ^( VAL ( pattern )* ( objelem_assign )* expr ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:421:10: L_val ( NL )? ( pattern | objelem_assign ) ( NL )? '=' ( NL )? expr
            {
            L_val112=(Token)match(input,L_val,FOLLOW_L_val_in_st_val2214); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_val.add(L_val112);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:421:16: ( NL )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==NL) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:421:16: NL
                    {
                    NL113=(Token)match(input,NL,FOLLOW_NL_in_st_val2216); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL113);


                    }
                    break;

            }

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:421:20: ( pattern | objelem_assign )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( ((LA54_0>=A_infinity && LA54_0<=U_infinity)||(LA54_0>=L_true && LA54_0<=L_false)||LA54_0==MINUS||LA54_0==Constr||LA54_0==Num||(LA54_0>=String && LA54_0<=ROUND_BRACKET_OPEN)||LA54_0==SQUARE_BRACKET_OPEN||LA54_0==CURLY_BRACKET_OPEN||LA54_0==UNDERSCORE) ) {
                alt54=1;
            }
            else if ( (LA54_0==Id) ) {
                int LA54_2 = input.LA(2);

                if ( (LA54_2==PERIOD) ) {
                    alt54=2;
                }
                else if ( (LA54_2==ASSIGN||(LA54_2>=A_DOUBLE_COLON && LA54_2<=U_DOUBLE_COLON)||LA54_2==NL) ) {
                    alt54=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 54, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:421:21: pattern
                    {
                    pushFollow(FOLLOW_pattern_in_st_val2220);
                    pattern114=pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pattern.add(pattern114.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:421:31: objelem_assign
                    {
                    pushFollow(FOLLOW_objelem_assign_in_st_val2224);
                    objelem_assign115=objelem_assign();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_objelem_assign.add(objelem_assign115.getTree());

                    }
                    break;

            }

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:421:47: ( NL )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==NL) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:421:47: NL
                    {
                    NL116=(Token)match(input,NL,FOLLOW_NL_in_st_val2227); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL116);


                    }
                    break;

            }

            char_literal117=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_st_val2230); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal117);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:421:55: ( NL )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==NL) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:421:55: NL
                    {
                    NL118=(Token)match(input,NL,FOLLOW_NL_in_st_val2232); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL118);


                    }
                    break;

            }

            pushFollow(FOLLOW_expr_in_st_val2235);
            expr119=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr119.getTree());


            // AST REWRITE
            // elements: pattern, objelem_assign, expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 421:64: -> ^( VAL ( pattern )* ( objelem_assign )* expr )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:421:67: ^( VAL ( pattern )* ( objelem_assign )* expr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VAL, "VAL"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:421:73: ( pattern )*
                while ( stream_pattern.hasNext() ) {
                    adaptor.addChild(root_1, stream_pattern.nextTree());

                }
                stream_pattern.reset();
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:421:82: ( objelem_assign )*
                while ( stream_objelem_assign.hasNext() ) {
                    adaptor.addChild(root_1, stream_objelem_assign.nextTree());

                }
                stream_objelem_assign.reset();
                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "st_val"

    public static class st_def_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "st_def"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:423:1: st_def : ( attribute ( NL )? )? L_def ( NL )? Id ( NL )? ( primitive_pattern ( NL )? )? '=' ( NL )? expr -> ^( DEF ( attribute )? Id ( primitive_pattern )? expr ) ;
    public final babel17Parser.st_def_return st_def() throws RecognitionException {
        babel17Parser.st_def_return retval = new babel17Parser.st_def_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL121=null;
        Token L_def122=null;
        Token NL123=null;
        Token Id124=null;
        Token NL125=null;
        Token NL127=null;
        Token char_literal128=null;
        Token NL129=null;
        babel17Parser.attribute_return attribute120 = null;

        babel17Parser.primitive_pattern_return primitive_pattern126 = null;

        babel17Parser.expr_return expr130 = null;


        CommonTree NL121_tree=null;
        CommonTree L_def122_tree=null;
        CommonTree NL123_tree=null;
        CommonTree Id124_tree=null;
        CommonTree NL125_tree=null;
        CommonTree NL127_tree=null;
        CommonTree char_literal128_tree=null;
        CommonTree NL129_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_Id=new RewriteRuleTokenStream(adaptor,"token Id");
        RewriteRuleTokenStream stream_L_def=new RewriteRuleTokenStream(adaptor,"token L_def");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_primitive_pattern=new RewriteRuleSubtreeStream(adaptor,"rule primitive_pattern");
        RewriteRuleSubtreeStream stream_attribute=new RewriteRuleSubtreeStream(adaptor,"rule attribute");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:423:8: ( ( attribute ( NL )? )? L_def ( NL )? Id ( NL )? ( primitive_pattern ( NL )? )? '=' ( NL )? expr -> ^( DEF ( attribute )? Id ( primitive_pattern )? expr ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:423:10: ( attribute ( NL )? )? L_def ( NL )? Id ( NL )? ( primitive_pattern ( NL )? )? '=' ( NL )? expr
            {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:423:10: ( attribute ( NL )? )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( ((LA58_0>=L_private && LA58_0<=L_public)) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:423:11: attribute ( NL )?
                    {
                    pushFollow(FOLLOW_attribute_in_st_def2260);
                    attribute120=attribute();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_attribute.add(attribute120.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:423:21: ( NL )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==NL) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:423:21: NL
                            {
                            NL121=(Token)match(input,NL,FOLLOW_NL_in_st_def2262); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL121);


                            }
                            break;

                    }


                    }
                    break;

            }

            L_def122=(Token)match(input,L_def,FOLLOW_L_def_in_st_def2267); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_def.add(L_def122);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:423:33: ( NL )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==NL) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:423:33: NL
                    {
                    NL123=(Token)match(input,NL,FOLLOW_NL_in_st_def2269); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL123);


                    }
                    break;

            }

            Id124=(Token)match(input,Id,FOLLOW_Id_in_st_def2272); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Id.add(Id124);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:423:40: ( NL )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==NL) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:423:40: NL
                    {
                    NL125=(Token)match(input,NL,FOLLOW_NL_in_st_def2274); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL125);


                    }
                    break;

            }

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:423:44: ( primitive_pattern ( NL )? )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( ((LA62_0>=A_infinity && LA62_0<=U_infinity)||(LA62_0>=L_true && LA62_0<=L_false)||LA62_0==MINUS||(LA62_0>=Id && LA62_0<=Num)||(LA62_0>=String && LA62_0<=ROUND_BRACKET_OPEN)||LA62_0==SQUARE_BRACKET_OPEN||LA62_0==CURLY_BRACKET_OPEN||LA62_0==UNDERSCORE) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:423:45: primitive_pattern ( NL )?
                    {
                    pushFollow(FOLLOW_primitive_pattern_in_st_def2278);
                    primitive_pattern126=primitive_pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primitive_pattern.add(primitive_pattern126.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:423:63: ( NL )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==NL) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:423:63: NL
                            {
                            NL127=(Token)match(input,NL,FOLLOW_NL_in_st_def2280); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL127);


                            }
                            break;

                    }


                    }
                    break;

            }

            char_literal128=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_st_def2285); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal128);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:423:73: ( NL )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==NL) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:423:73: NL
                    {
                    NL129=(Token)match(input,NL,FOLLOW_NL_in_st_def2287); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL129);


                    }
                    break;

            }

            pushFollow(FOLLOW_expr_in_st_def2290);
            expr130=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr130.getTree());


            // AST REWRITE
            // elements: attribute, Id, expr, primitive_pattern
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 424:5: -> ^( DEF ( attribute )? Id ( primitive_pattern )? expr )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:424:8: ^( DEF ( attribute )? Id ( primitive_pattern )? expr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DEF, "DEF"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:424:14: ( attribute )?
                if ( stream_attribute.hasNext() ) {
                    adaptor.addChild(root_1, stream_attribute.nextTree());

                }
                stream_attribute.reset();
                adaptor.addChild(root_1, stream_Id.nextNode());
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:424:28: ( primitive_pattern )?
                if ( stream_primitive_pattern.hasNext() ) {
                    adaptor.addChild(root_1, stream_primitive_pattern.nextTree());

                }
                stream_primitive_pattern.reset();
                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "st_def"

    public static class st_yield_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "st_yield"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:426:1: st_yield : L_yield expr -> ^( YIELD expr ) ;
    public final babel17Parser.st_yield_return st_yield() throws RecognitionException {
        babel17Parser.st_yield_return retval = new babel17Parser.st_yield_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_yield131=null;
        babel17Parser.expr_return expr132 = null;


        CommonTree L_yield131_tree=null;
        RewriteRuleTokenStream stream_L_yield=new RewriteRuleTokenStream(adaptor,"token L_yield");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:426:9: ( L_yield expr -> ^( YIELD expr ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:426:11: L_yield expr
            {
            L_yield131=(Token)match(input,L_yield,FOLLOW_L_yield_in_st_yield2322); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_yield.add(L_yield131);

            pushFollow(FOLLOW_expr_in_st_yield2324);
            expr132=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr132.getTree());


            // AST REWRITE
            // elements: expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 426:24: -> ^( YIELD expr )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:426:27: ^( YIELD expr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(YIELD, "YIELD"), root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "st_yield"

    public static class attribute_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attribute"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:428:1: attribute : ( L_private -> ^( ATTRIBUTE L_private ) | L_public -> ^( ATTRIBUTE L_public ) | L_protected -> ^( ATTRIBUTE L_protected ) );
    public final babel17Parser.attribute_return attribute() throws RecognitionException {
        babel17Parser.attribute_return retval = new babel17Parser.attribute_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_private133=null;
        Token L_public134=null;
        Token L_protected135=null;

        CommonTree L_private133_tree=null;
        CommonTree L_public134_tree=null;
        CommonTree L_protected135_tree=null;
        RewriteRuleTokenStream stream_L_private=new RewriteRuleTokenStream(adaptor,"token L_private");
        RewriteRuleTokenStream stream_L_protected=new RewriteRuleTokenStream(adaptor,"token L_protected");
        RewriteRuleTokenStream stream_L_public=new RewriteRuleTokenStream(adaptor,"token L_public");

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:429:2: ( L_private -> ^( ATTRIBUTE L_private ) | L_public -> ^( ATTRIBUTE L_public ) | L_protected -> ^( ATTRIBUTE L_protected ) )
            int alt64=3;
            switch ( input.LA(1) ) {
            case L_private:
                {
                alt64=1;
                }
                break;
            case L_public:
                {
                alt64=2;
                }
                break;
            case L_protected:
                {
                alt64=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }

            switch (alt64) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:429:4: L_private
                    {
                    L_private133=(Token)match(input,L_private,FOLLOW_L_private_in_attribute2345); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_private.add(L_private133);



                    // AST REWRITE
                    // elements: L_private
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 429:14: -> ^( ATTRIBUTE L_private )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:429:17: ^( ATTRIBUTE L_private )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ATTRIBUTE, "ATTRIBUTE"), root_1);

                        adaptor.addChild(root_1, stream_L_private.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:430:4: L_public
                    {
                    L_public134=(Token)match(input,L_public,FOLLOW_L_public_in_attribute2358); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_public.add(L_public134);



                    // AST REWRITE
                    // elements: L_public
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 430:13: -> ^( ATTRIBUTE L_public )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:430:16: ^( ATTRIBUTE L_public )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ATTRIBUTE, "ATTRIBUTE"), root_1);

                        adaptor.addChild(root_1, stream_L_public.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:431:4: L_protected
                    {
                    L_protected135=(Token)match(input,L_protected,FOLLOW_L_protected_in_attribute2371); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_protected.add(L_protected135);



                    // AST REWRITE
                    // elements: L_protected
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 431:16: -> ^( ATTRIBUTE L_protected )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:431:19: ^( ATTRIBUTE L_protected )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ATTRIBUTE, "ATTRIBUTE"), root_1);

                        adaptor.addChild(root_1, stream_L_protected.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "attribute"

    public static class st_module_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "st_module"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:433:1: st_module : ( st_module_decl | st_module_def );
    public final babel17Parser.st_module_return st_module() throws RecognitionException {
        babel17Parser.st_module_return retval = new babel17Parser.st_module_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.st_module_decl_return st_module_decl136 = null;

        babel17Parser.st_module_def_return st_module_def137 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:434:2: ( st_module_decl | st_module_def )
            int alt65=2;
            switch ( input.LA(1) ) {
            case L_private:
                {
                switch ( input.LA(2) ) {
                case NL:
                    {
                    int LA65_6 = input.LA(3);

                    if ( (LA65_6==L_external) ) {
                        alt65=1;
                    }
                    else if ( (LA65_6==L_module) ) {
                        alt65=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 65, 6, input);

                        throw nvae;
                    }
                    }
                    break;
                case L_external:
                    {
                    alt65=1;
                    }
                    break;
                case L_module:
                    {
                    alt65=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 65, 1, input);

                    throw nvae;
                }

                }
                break;
            case L_public:
                {
                switch ( input.LA(2) ) {
                case NL:
                    {
                    int LA65_6 = input.LA(3);

                    if ( (LA65_6==L_external) ) {
                        alt65=1;
                    }
                    else if ( (LA65_6==L_module) ) {
                        alt65=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 65, 6, input);

                        throw nvae;
                    }
                    }
                    break;
                case L_module:
                    {
                    alt65=2;
                    }
                    break;
                case L_external:
                    {
                    alt65=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 65, 2, input);

                    throw nvae;
                }

                }
                break;
            case L_protected:
                {
                switch ( input.LA(2) ) {
                case NL:
                    {
                    int LA65_6 = input.LA(3);

                    if ( (LA65_6==L_external) ) {
                        alt65=1;
                    }
                    else if ( (LA65_6==L_module) ) {
                        alt65=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 65, 6, input);

                        throw nvae;
                    }
                    }
                    break;
                case L_external:
                    {
                    alt65=1;
                    }
                    break;
                case L_module:
                    {
                    alt65=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 65, 3, input);

                    throw nvae;
                }

                }
                break;
            case L_external:
                {
                alt65=1;
                }
                break;
            case L_module:
                {
                alt65=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }

            switch (alt65) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:434:4: st_module_decl
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_st_module_decl_in_st_module2389);
                    st_module_decl136=st_module_decl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, st_module_decl136.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:435:4: st_module_def
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_st_module_def_in_st_module2394);
                    st_module_def137=st_module_def();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, st_module_def137.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "st_module"

    public static class st_module_decl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "st_module_decl"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:437:1: st_module_decl : ( attribute ( NL )? )? L_external ( NL )? L_module ( NL )? module_path -> ^( MODULE_DECL ( attribute )? module_path ) ;
    public final babel17Parser.st_module_decl_return st_module_decl() throws RecognitionException {
        babel17Parser.st_module_decl_return retval = new babel17Parser.st_module_decl_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL139=null;
        Token L_external140=null;
        Token NL141=null;
        Token L_module142=null;
        Token NL143=null;
        babel17Parser.attribute_return attribute138 = null;

        babel17Parser.module_path_return module_path144 = null;


        CommonTree NL139_tree=null;
        CommonTree L_external140_tree=null;
        CommonTree NL141_tree=null;
        CommonTree L_module142_tree=null;
        CommonTree NL143_tree=null;
        RewriteRuleTokenStream stream_L_module=new RewriteRuleTokenStream(adaptor,"token L_module");
        RewriteRuleTokenStream stream_L_external=new RewriteRuleTokenStream(adaptor,"token L_external");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_attribute=new RewriteRuleSubtreeStream(adaptor,"rule attribute");
        RewriteRuleSubtreeStream stream_module_path=new RewriteRuleSubtreeStream(adaptor,"rule module_path");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:438:2: ( ( attribute ( NL )? )? L_external ( NL )? L_module ( NL )? module_path -> ^( MODULE_DECL ( attribute )? module_path ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:438:4: ( attribute ( NL )? )? L_external ( NL )? L_module ( NL )? module_path
            {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:438:4: ( attribute ( NL )? )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( ((LA67_0>=L_private && LA67_0<=L_public)) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:438:5: attribute ( NL )?
                    {
                    pushFollow(FOLLOW_attribute_in_st_module_decl2405);
                    attribute138=attribute();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_attribute.add(attribute138.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:438:15: ( NL )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==NL) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:438:15: NL
                            {
                            NL139=(Token)match(input,NL,FOLLOW_NL_in_st_module_decl2407); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL139);


                            }
                            break;

                    }


                    }
                    break;

            }

            L_external140=(Token)match(input,L_external,FOLLOW_L_external_in_st_module_decl2412); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_external.add(L_external140);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:438:32: ( NL )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==NL) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:438:32: NL
                    {
                    NL141=(Token)match(input,NL,FOLLOW_NL_in_st_module_decl2414); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL141);


                    }
                    break;

            }

            L_module142=(Token)match(input,L_module,FOLLOW_L_module_in_st_module_decl2417); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_module.add(L_module142);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:438:45: ( NL )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==NL) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:438:45: NL
                    {
                    NL143=(Token)match(input,NL,FOLLOW_NL_in_st_module_decl2419); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL143);


                    }
                    break;

            }

            pushFollow(FOLLOW_module_path_in_st_module_decl2422);
            module_path144=module_path();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_module_path.add(module_path144.getTree());


            // AST REWRITE
            // elements: module_path, attribute
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 439:5: -> ^( MODULE_DECL ( attribute )? module_path )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:439:8: ^( MODULE_DECL ( attribute )? module_path )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MODULE_DECL, "MODULE_DECL"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:439:22: ( attribute )?
                if ( stream_attribute.hasNext() ) {
                    adaptor.addChild(root_1, stream_attribute.nextTree());

                }
                stream_attribute.reset();
                adaptor.addChild(root_1, stream_module_path.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "st_module_decl"

    public static class st_module_def_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "st_module_def"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:441:1: st_module_def : ( attribute ( NL )? )? L_module ( NL )? module_path block L_end -> ^( MODULE_DEF ( attribute )? module_path block ) ;
    public final babel17Parser.st_module_def_return st_module_def() throws RecognitionException {
        babel17Parser.st_module_def_return retval = new babel17Parser.st_module_def_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL146=null;
        Token L_module147=null;
        Token NL148=null;
        Token L_end151=null;
        babel17Parser.attribute_return attribute145 = null;

        babel17Parser.module_path_return module_path149 = null;

        babel17Parser.block_return block150 = null;


        CommonTree NL146_tree=null;
        CommonTree L_module147_tree=null;
        CommonTree NL148_tree=null;
        CommonTree L_end151_tree=null;
        RewriteRuleTokenStream stream_L_module=new RewriteRuleTokenStream(adaptor,"token L_module");
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_attribute=new RewriteRuleSubtreeStream(adaptor,"rule attribute");
        RewriteRuleSubtreeStream stream_module_path=new RewriteRuleSubtreeStream(adaptor,"rule module_path");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:442:2: ( ( attribute ( NL )? )? L_module ( NL )? module_path block L_end -> ^( MODULE_DEF ( attribute )? module_path block ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:442:4: ( attribute ( NL )? )? L_module ( NL )? module_path block L_end
            {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:442:4: ( attribute ( NL )? )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( ((LA71_0>=L_private && LA71_0<=L_public)) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:442:5: attribute ( NL )?
                    {
                    pushFollow(FOLLOW_attribute_in_st_module_def2452);
                    attribute145=attribute();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_attribute.add(attribute145.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:442:15: ( NL )?
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==NL) ) {
                        alt70=1;
                    }
                    switch (alt70) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:442:15: NL
                            {
                            NL146=(Token)match(input,NL,FOLLOW_NL_in_st_module_def2454); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL146);


                            }
                            break;

                    }


                    }
                    break;

            }

            L_module147=(Token)match(input,L_module,FOLLOW_L_module_in_st_module_def2459); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_module.add(L_module147);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:442:30: ( NL )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==NL) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:442:30: NL
                    {
                    NL148=(Token)match(input,NL,FOLLOW_NL_in_st_module_def2461); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL148);


                    }
                    break;

            }

            pushFollow(FOLLOW_module_path_in_st_module_def2464);
            module_path149=module_path();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_module_path.add(module_path149.getTree());
            pushFollow(FOLLOW_block_in_st_module_def2466);
            block150=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block150.getTree());
            L_end151=(Token)match(input,L_end,FOLLOW_L_end_in_st_module_def2468); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_end.add(L_end151);



            // AST REWRITE
            // elements: module_path, block, attribute
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 443:5: -> ^( MODULE_DEF ( attribute )? module_path block )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:443:8: ^( MODULE_DEF ( attribute )? module_path block )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MODULE_DEF, "MODULE_DEF"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:443:21: ( attribute )?
                if ( stream_attribute.hasNext() ) {
                    adaptor.addChild(root_1, stream_attribute.nextTree());

                }
                stream_attribute.reset();
                adaptor.addChild(root_1, stream_module_path.nextTree());
                adaptor.addChild(root_1, stream_block.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "st_module_def"

    public static class st_package_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "st_package"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:445:1: st_package : L_package ( NL )? module_path block L_end -> ^( PACKAGE module_path block ) ;
    public final babel17Parser.st_package_return st_package() throws RecognitionException {
        babel17Parser.st_package_return retval = new babel17Parser.st_package_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_package152=null;
        Token NL153=null;
        Token L_end156=null;
        babel17Parser.module_path_return module_path154 = null;

        babel17Parser.block_return block155 = null;


        CommonTree L_package152_tree=null;
        CommonTree NL153_tree=null;
        CommonTree L_end156_tree=null;
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_package=new RewriteRuleTokenStream(adaptor,"token L_package");
        RewriteRuleSubtreeStream stream_module_path=new RewriteRuleSubtreeStream(adaptor,"rule module_path");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:446:2: ( L_package ( NL )? module_path block L_end -> ^( PACKAGE module_path block ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:446:10: L_package ( NL )? module_path block L_end
            {
            L_package152=(Token)match(input,L_package,FOLLOW_L_package_in_st_package2504); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_package.add(L_package152);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:446:20: ( NL )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==NL) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:446:20: NL
                    {
                    NL153=(Token)match(input,NL,FOLLOW_NL_in_st_package2506); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL153);


                    }
                    break;

            }

            pushFollow(FOLLOW_module_path_in_st_package2509);
            module_path154=module_path();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_module_path.add(module_path154.getTree());
            pushFollow(FOLLOW_block_in_st_package2511);
            block155=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block155.getTree());
            L_end156=(Token)match(input,L_end,FOLLOW_L_end_in_st_package2513); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_end.add(L_end156);



            // AST REWRITE
            // elements: block, module_path
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 447:5: -> ^( PACKAGE module_path block )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:447:8: ^( PACKAGE module_path block )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PACKAGE, "PACKAGE"), root_1);

                adaptor.addChild(root_1, stream_module_path.nextTree());
                adaptor.addChild(root_1, stream_block.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "st_package"

    public static class module_path_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "module_path"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:449:1: module_path : Id ( ( NL )? PERIOD ( NL )? Id )* -> ^( MODULE_PATH ( Id )* ) ;
    public final babel17Parser.module_path_return module_path() throws RecognitionException {
        babel17Parser.module_path_return retval = new babel17Parser.module_path_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Id157=null;
        Token NL158=null;
        Token PERIOD159=null;
        Token NL160=null;
        Token Id161=null;

        CommonTree Id157_tree=null;
        CommonTree NL158_tree=null;
        CommonTree PERIOD159_tree=null;
        CommonTree NL160_tree=null;
        CommonTree Id161_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_Id=new RewriteRuleTokenStream(adaptor,"token Id");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:450:2: ( Id ( ( NL )? PERIOD ( NL )? Id )* -> ^( MODULE_PATH ( Id )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:450:4: Id ( ( NL )? PERIOD ( NL )? Id )*
            {
            Id157=(Token)match(input,Id,FOLLOW_Id_in_module_path2543); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Id.add(Id157);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:450:7: ( ( NL )? PERIOD ( NL )? Id )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==NL) ) {
                    int LA76_1 = input.LA(2);

                    if ( (LA76_1==PERIOD) ) {
                        alt76=1;
                    }


                }
                else if ( (LA76_0==PERIOD) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:450:8: ( NL )? PERIOD ( NL )? Id
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:450:8: ( NL )?
            	    int alt74=2;
            	    int LA74_0 = input.LA(1);

            	    if ( (LA74_0==NL) ) {
            	        alt74=1;
            	    }
            	    switch (alt74) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:450:8: NL
            	            {
            	            NL158=(Token)match(input,NL,FOLLOW_NL_in_module_path2546); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL158);


            	            }
            	            break;

            	    }

            	    PERIOD159=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_module_path2549); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD159);

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:450:19: ( NL )?
            	    int alt75=2;
            	    int LA75_0 = input.LA(1);

            	    if ( (LA75_0==NL) ) {
            	        alt75=1;
            	    }
            	    switch (alt75) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:450:19: NL
            	            {
            	            NL160=(Token)match(input,NL,FOLLOW_NL_in_module_path2551); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL160);


            	            }
            	            break;

            	    }

            	    Id161=(Token)match(input,Id,FOLLOW_Id_in_module_path2554); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_Id.add(Id161);


            	    }
            	    break;

            	default :
            	    break loop76;
                }
            } while (true);



            // AST REWRITE
            // elements: Id
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 450:28: -> ^( MODULE_PATH ( Id )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:450:31: ^( MODULE_PATH ( Id )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MODULE_PATH, "MODULE_PATH"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:450:45: ( Id )*
                while ( stream_Id.hasNext() ) {
                    adaptor.addChild(root_1, stream_Id.nextNode());

                }
                stream_Id.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "module_path"

    public static class st_memoize_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "st_memoize"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:452:1: st_memoize : L_memoize ( memid )+ -> ^( MEMOIZE ( memid )* ) ;
    public final babel17Parser.st_memoize_return st_memoize() throws RecognitionException {
        babel17Parser.st_memoize_return retval = new babel17Parser.st_memoize_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_memoize162=null;
        babel17Parser.memid_return memid163 = null;


        CommonTree L_memoize162_tree=null;
        RewriteRuleTokenStream stream_L_memoize=new RewriteRuleTokenStream(adaptor,"token L_memoize");
        RewriteRuleSubtreeStream stream_memid=new RewriteRuleSubtreeStream(adaptor,"rule memid");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:453:2: ( L_memoize ( memid )+ -> ^( MEMOIZE ( memid )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:453:4: L_memoize ( memid )+
            {
            L_memoize162=(Token)match(input,L_memoize,FOLLOW_L_memoize_in_st_memoize2575); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_memoize.add(L_memoize162);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:453:14: ( memid )+
            int cnt77=0;
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==Id||LA77_0==ROUND_BRACKET_OPEN) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:453:14: memid
            	    {
            	    pushFollow(FOLLOW_memid_in_st_memoize2577);
            	    memid163=memid();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_memid.add(memid163.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt77 >= 1 ) break loop77;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(77, input);
                        throw eee;
                }
                cnt77++;
            } while (true);



            // AST REWRITE
            // elements: memid
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 454:5: -> ^( MEMOIZE ( memid )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:454:8: ^( MEMOIZE ( memid )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MEMOIZE, "MEMOIZE"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:454:18: ( memid )*
                while ( stream_memid.hasNext() ) {
                    adaptor.addChild(root_1, stream_memid.nextTree());

                }
                stream_memid.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "st_memoize"

    public static class memid_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "memid"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:456:1: memid : ( Id -> ^( MEM_STRONG Id ) | '(' Id ')' -> ^( MEM_WEAK Id ) );
    public final babel17Parser.memid_return memid() throws RecognitionException {
        babel17Parser.memid_return retval = new babel17Parser.memid_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Id164=null;
        Token char_literal165=null;
        Token Id166=null;
        Token char_literal167=null;

        CommonTree Id164_tree=null;
        CommonTree char_literal165_tree=null;
        CommonTree Id166_tree=null;
        CommonTree char_literal167_tree=null;
        RewriteRuleTokenStream stream_ROUND_BRACKET_OPEN=new RewriteRuleTokenStream(adaptor,"token ROUND_BRACKET_OPEN");
        RewriteRuleTokenStream stream_ROUND_BRACKET_CLOSE=new RewriteRuleTokenStream(adaptor,"token ROUND_BRACKET_CLOSE");
        RewriteRuleTokenStream stream_Id=new RewriteRuleTokenStream(adaptor,"token Id");

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:456:7: ( Id -> ^( MEM_STRONG Id ) | '(' Id ')' -> ^( MEM_WEAK Id ) )
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==Id) ) {
                alt78=1;
            }
            else if ( (LA78_0==ROUND_BRACKET_OPEN) ) {
                alt78=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }
            switch (alt78) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:456:9: Id
                    {
                    Id164=(Token)match(input,Id,FOLLOW_Id_in_memid2601); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Id.add(Id164);



                    // AST REWRITE
                    // elements: Id
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 456:12: -> ^( MEM_STRONG Id )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:456:15: ^( MEM_STRONG Id )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MEM_STRONG, "MEM_STRONG"), root_1);

                        adaptor.addChild(root_1, stream_Id.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:457:4: '(' Id ')'
                    {
                    char_literal165=(Token)match(input,ROUND_BRACKET_OPEN,FOLLOW_ROUND_BRACKET_OPEN_in_memid2614); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ROUND_BRACKET_OPEN.add(char_literal165);

                    Id166=(Token)match(input,Id,FOLLOW_Id_in_memid2616); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Id.add(Id166);

                    char_literal167=(Token)match(input,ROUND_BRACKET_CLOSE,FOLLOW_ROUND_BRACKET_CLOSE_in_memid2618); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ROUND_BRACKET_CLOSE.add(char_literal167);



                    // AST REWRITE
                    // elements: Id
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 457:15: -> ^( MEM_WEAK Id )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:457:18: ^( MEM_WEAK Id )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MEM_WEAK, "MEM_WEAK"), root_1);

                        adaptor.addChild(root_1, stream_Id.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "memid"

    public static class expr_or_assign_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr_or_assign"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:460:1: expr_or_assign : ( ( ( pattern | objelem_assign ) ( NL )? '=' )=> ( pattern | objelem_assign ) ( NL )? '=' ( NL )? expr -> ^( ASSIGN pattern expr ) | expr );
    public final babel17Parser.expr_or_assign_return expr_or_assign() throws RecognitionException {
        babel17Parser.expr_or_assign_return retval = new babel17Parser.expr_or_assign_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL170=null;
        Token char_literal171=null;
        Token NL172=null;
        babel17Parser.pattern_return pattern168 = null;

        babel17Parser.objelem_assign_return objelem_assign169 = null;

        babel17Parser.expr_return expr173 = null;

        babel17Parser.expr_return expr174 = null;


        CommonTree NL170_tree=null;
        CommonTree char_literal171_tree=null;
        CommonTree NL172_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_objelem_assign=new RewriteRuleSubtreeStream(adaptor,"rule objelem_assign");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:461:2: ( ( ( pattern | objelem_assign ) ( NL )? '=' )=> ( pattern | objelem_assign ) ( NL )? '=' ( NL )? expr -> ^( ASSIGN pattern expr ) | expr )
            int alt82=2;
            alt82 = dfa82.predict(input);
            switch (alt82) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:461:4: ( ( pattern | objelem_assign ) ( NL )? '=' )=> ( pattern | objelem_assign ) ( NL )? '=' ( NL )? expr
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:461:44: ( pattern | objelem_assign )
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( ((LA79_0>=A_infinity && LA79_0<=U_infinity)||(LA79_0>=L_true && LA79_0<=L_false)||LA79_0==MINUS||LA79_0==Constr||LA79_0==Num||(LA79_0>=String && LA79_0<=ROUND_BRACKET_OPEN)||LA79_0==SQUARE_BRACKET_OPEN||LA79_0==CURLY_BRACKET_OPEN||LA79_0==UNDERSCORE) ) {
                        alt79=1;
                    }
                    else if ( (LA79_0==Id) ) {
                        int LA79_2 = input.LA(2);

                        if ( (LA79_2==PERIOD) ) {
                            alt79=2;
                        }
                        else if ( (LA79_2==ASSIGN||(LA79_2>=A_DOUBLE_COLON && LA79_2<=U_DOUBLE_COLON)||LA79_2==NL) ) {
                            alt79=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 79, 2, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 79, 0, input);

                        throw nvae;
                    }
                    switch (alt79) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:461:45: pattern
                            {
                            pushFollow(FOLLOW_pattern_in_expr_or_assign2658);
                            pattern168=pattern();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_pattern.add(pattern168.getTree());

                            }
                            break;
                        case 2 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:461:55: objelem_assign
                            {
                            pushFollow(FOLLOW_objelem_assign_in_expr_or_assign2662);
                            objelem_assign169=objelem_assign();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_objelem_assign.add(objelem_assign169.getTree());

                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:461:71: ( NL )?
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==NL) ) {
                        alt80=1;
                    }
                    switch (alt80) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:461:71: NL
                            {
                            NL170=(Token)match(input,NL,FOLLOW_NL_in_expr_or_assign2665); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL170);


                            }
                            break;

                    }

                    char_literal171=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_expr_or_assign2668); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal171);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:461:79: ( NL )?
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==NL) ) {
                        alt81=1;
                    }
                    switch (alt81) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:461:79: NL
                            {
                            NL172=(Token)match(input,NL,FOLLOW_NL_in_expr_or_assign2670); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL172);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_expr_in_expr_or_assign2673);
                    expr173=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr173.getTree());


                    // AST REWRITE
                    // elements: expr, pattern
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 461:88: -> ^( ASSIGN pattern expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:461:91: ^( ASSIGN pattern expr )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASSIGN, "ASSIGN"), root_1);

                        adaptor.addChild(root_1, stream_pattern.nextTree());
                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:462:4: expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_expr_in_expr_or_assign2688);
                    expr174=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr174.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expr_or_assign"

    public static class expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:464:1: expr : ( lop_expr | obj_expr );
    public final babel17Parser.expr_return expr() throws RecognitionException {
        babel17Parser.expr_return retval = new babel17Parser.expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.lop_expr_return lop_expr175 = null;

        babel17Parser.obj_expr_return obj_expr176 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:465:2: ( lop_expr | obj_expr )
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==L_begin||(LA83_0>=L_with && LA83_0<=L_if)||(LA83_0>=L_while && LA83_0<=L_for)||LA83_0==L_match||LA83_0==L_exception||(LA83_0>=A_infinity && LA83_0<=U_infinity)||LA83_0==L_root||(LA83_0>=L_concurrent && LA83_0<=L_lazy)||(LA83_0>=L_true && LA83_0<=L_random)||LA83_0==MINUS||LA83_0==MODULE_KEY||LA83_0==A_NOT||LA83_0==U_NOT||LA83_0==TILDE||(LA83_0>=Constr && LA83_0<=Num)||(LA83_0>=String && LA83_0<=ROUND_BRACKET_OPEN)||LA83_0==SQUARE_BRACKET_OPEN||LA83_0==CURLY_BRACKET_OPEN||LA83_0==UNDERSCORE) ) {
                alt83=1;
            }
            else if ( (LA83_0==L_obj) ) {
                alt83=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }
            switch (alt83) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:465:4: lop_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_lop_expr_in_expr2699);
                    lop_expr175=lop_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lop_expr175.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:466:4: obj_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_obj_expr_in_expr2704);
                    obj_expr176=obj_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, obj_expr176.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expr"

    public static class control_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "control_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:468:1: control_expr : ( if_expr | while_do_expr | match_expr | for_expr | begin_end );
    public final babel17Parser.control_expr_return control_expr() throws RecognitionException {
        babel17Parser.control_expr_return retval = new babel17Parser.control_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.if_expr_return if_expr177 = null;

        babel17Parser.while_do_expr_return while_do_expr178 = null;

        babel17Parser.match_expr_return match_expr179 = null;

        babel17Parser.for_expr_return for_expr180 = null;

        babel17Parser.begin_end_return begin_end181 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:469:2: ( if_expr | while_do_expr | match_expr | for_expr | begin_end )
            int alt84=5;
            switch ( input.LA(1) ) {
            case L_if:
                {
                alt84=1;
                }
                break;
            case L_while:
                {
                alt84=2;
                }
                break;
            case L_match:
                {
                alt84=3;
                }
                break;
            case L_for:
                {
                alt84=4;
                }
                break;
            case L_begin:
                {
                alt84=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }

            switch (alt84) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:469:4: if_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_if_expr_in_control_expr2714);
                    if_expr177=if_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, if_expr177.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:470:4: while_do_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_while_do_expr_in_control_expr2719);
                    while_do_expr178=while_do_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, while_do_expr178.getTree());

                    }
                    break;
                case 3 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:471:4: match_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_match_expr_in_control_expr2724);
                    match_expr179=match_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, match_expr179.getTree());

                    }
                    break;
                case 4 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:472:4: for_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_for_expr_in_control_expr2729);
                    for_expr180=for_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, for_expr180.getTree());

                    }
                    break;
                case 5 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:473:4: begin_end
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_begin_end_in_control_expr2734);
                    begin_end181=begin_end();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, begin_end181.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "control_expr"

    public static class with_control_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "with_control_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:475:1: with_control_expr : ( control_expr | L_with ( NL )? protected_expr ( NL )? COLON ( NL )? control_expr -> ^( WITH protected_expr control_expr ) );
    public final babel17Parser.with_control_expr_return with_control_expr() throws RecognitionException {
        babel17Parser.with_control_expr_return retval = new babel17Parser.with_control_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_with183=null;
        Token NL184=null;
        Token NL186=null;
        Token COLON187=null;
        Token NL188=null;
        babel17Parser.control_expr_return control_expr182 = null;

        babel17Parser.protected_expr_return protected_expr185 = null;

        babel17Parser.control_expr_return control_expr189 = null;


        CommonTree L_with183_tree=null;
        CommonTree NL184_tree=null;
        CommonTree NL186_tree=null;
        CommonTree COLON187_tree=null;
        CommonTree NL188_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_with=new RewriteRuleTokenStream(adaptor,"token L_with");
        RewriteRuleSubtreeStream stream_control_expr=new RewriteRuleSubtreeStream(adaptor,"rule control_expr");
        RewriteRuleSubtreeStream stream_protected_expr=new RewriteRuleSubtreeStream(adaptor,"rule protected_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:476:2: ( control_expr | L_with ( NL )? protected_expr ( NL )? COLON ( NL )? control_expr -> ^( WITH protected_expr control_expr ) )
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==L_begin||LA88_0==L_if||(LA88_0>=L_while && LA88_0<=L_for)||LA88_0==L_match) ) {
                alt88=1;
            }
            else if ( (LA88_0==L_with) ) {
                alt88=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }
            switch (alt88) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:476:4: control_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_control_expr_in_with_control_expr2744);
                    control_expr182=control_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, control_expr182.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:477:4: L_with ( NL )? protected_expr ( NL )? COLON ( NL )? control_expr
                    {
                    L_with183=(Token)match(input,L_with,FOLLOW_L_with_in_with_control_expr2749); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_with.add(L_with183);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:477:11: ( NL )?
                    int alt85=2;
                    int LA85_0 = input.LA(1);

                    if ( (LA85_0==NL) ) {
                        alt85=1;
                    }
                    switch (alt85) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:477:11: NL
                            {
                            NL184=(Token)match(input,NL,FOLLOW_NL_in_with_control_expr2751); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL184);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_protected_expr_in_with_control_expr2754);
                    protected_expr185=protected_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr185.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:477:30: ( NL )?
                    int alt86=2;
                    int LA86_0 = input.LA(1);

                    if ( (LA86_0==NL) ) {
                        alt86=1;
                    }
                    switch (alt86) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:477:30: NL
                            {
                            NL186=(Token)match(input,NL,FOLLOW_NL_in_with_control_expr2756); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL186);


                            }
                            break;

                    }

                    COLON187=(Token)match(input,COLON,FOLLOW_COLON_in_with_control_expr2759); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON187);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:477:40: ( NL )?
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==NL) ) {
                        alt87=1;
                    }
                    switch (alt87) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:477:40: NL
                            {
                            NL188=(Token)match(input,NL,FOLLOW_NL_in_with_control_expr2761); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL188);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_control_expr_in_with_control_expr2764);
                    control_expr189=control_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_control_expr.add(control_expr189.getTree());


                    // AST REWRITE
                    // elements: protected_expr, control_expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 477:57: -> ^( WITH protected_expr control_expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:477:60: ^( WITH protected_expr control_expr )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(WITH, "WITH"), root_1);

                        adaptor.addChild(root_1, stream_protected_expr.nextTree());
                        adaptor.addChild(root_1, stream_control_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "with_control_expr"

    public static class protected_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "protected_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:480:1: protected_expr : ( p_lop_expr | obj_expr );
    public final babel17Parser.protected_expr_return protected_expr() throws RecognitionException {
        babel17Parser.protected_expr_return retval = new babel17Parser.protected_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.p_lop_expr_return p_lop_expr190 = null;

        babel17Parser.obj_expr_return obj_expr191 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:481:2: ( p_lop_expr | obj_expr )
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==L_begin||(LA89_0>=L_with && LA89_0<=L_if)||(LA89_0>=L_while && LA89_0<=L_for)||(LA89_0>=L_match && LA89_0<=L_case)||LA89_0==L_exception||(LA89_0>=A_infinity && LA89_0<=U_infinity)||LA89_0==L_root||(LA89_0>=L_concurrent && LA89_0<=L_lazy)||(LA89_0>=L_true && LA89_0<=L_random)||LA89_0==MINUS||LA89_0==MODULE_KEY||LA89_0==A_NOT||LA89_0==U_NOT||LA89_0==TILDE||(LA89_0>=Constr && LA89_0<=Num)||(LA89_0>=String && LA89_0<=ROUND_BRACKET_OPEN)||LA89_0==SQUARE_BRACKET_OPEN||LA89_0==CURLY_BRACKET_OPEN||LA89_0==UNDERSCORE) ) {
                alt89=1;
            }
            else if ( (LA89_0==L_obj) ) {
                alt89=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }
            switch (alt89) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:481:4: p_lop_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_p_lop_expr_in_protected_expr2785);
                    p_lop_expr190=p_lop_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_lop_expr190.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:482:4: obj_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_obj_expr_in_protected_expr2790);
                    obj_expr191=obj_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, obj_expr191.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "protected_expr"

    public static class begin_end_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "begin_end"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:485:1: begin_end : L_begin block L_end -> ^( BEGIN block ) ;
    public final babel17Parser.begin_end_return begin_end() throws RecognitionException {
        babel17Parser.begin_end_return retval = new babel17Parser.begin_end_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_begin192=null;
        Token L_end194=null;
        babel17Parser.block_return block193 = null;


        CommonTree L_begin192_tree=null;
        CommonTree L_end194_tree=null;
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleTokenStream stream_L_begin=new RewriteRuleTokenStream(adaptor,"token L_begin");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:486:2: ( L_begin block L_end -> ^( BEGIN block ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:486:4: L_begin block L_end
            {
            L_begin192=(Token)match(input,L_begin,FOLLOW_L_begin_in_begin_end2802); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_begin.add(L_begin192);

            pushFollow(FOLLOW_block_in_begin_end2804);
            block193=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block193.getTree());
            L_end194=(Token)match(input,L_end,FOLLOW_L_end_in_begin_end2806); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_end.add(L_end194);



            // AST REWRITE
            // elements: block
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 486:24: -> ^( BEGIN block )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:486:27: ^( BEGIN block )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BEGIN, "BEGIN"), root_1);

                adaptor.addChild(root_1, stream_block.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "begin_end"

    public static class obj_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "obj_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:488:1: obj_expr : L_obj block L_end -> ^( OBJ block ) ;
    public final babel17Parser.obj_expr_return obj_expr() throws RecognitionException {
        babel17Parser.obj_expr_return retval = new babel17Parser.obj_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_obj195=null;
        Token L_end197=null;
        babel17Parser.block_return block196 = null;


        CommonTree L_obj195_tree=null;
        CommonTree L_end197_tree=null;
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleTokenStream stream_L_obj=new RewriteRuleTokenStream(adaptor,"token L_obj");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:488:9: ( L_obj block L_end -> ^( OBJ block ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:488:11: L_obj block L_end
            {
            L_obj195=(Token)match(input,L_obj,FOLLOW_L_obj_in_obj_expr2822); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_obj.add(L_obj195);

            pushFollow(FOLLOW_block_in_obj_expr2824);
            block196=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block196.getTree());
            L_end197=(Token)match(input,L_end,FOLLOW_L_end_in_obj_expr2826); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_end.add(L_end197);



            // AST REWRITE
            // elements: block
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 489:3: -> ^( OBJ block )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:489:6: ^( OBJ block )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OBJ, "OBJ"), root_1);

                adaptor.addChild(root_1, stream_block.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "obj_expr"

    public static class lop_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "lop_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:491:1: lop_expr : ( ( lambda_expr )=> lambda_expr | op_expr );
    public final babel17Parser.lop_expr_return lop_expr() throws RecognitionException {
        babel17Parser.lop_expr_return retval = new babel17Parser.lop_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.lambda_expr_return lambda_expr198 = null;

        babel17Parser.op_expr_return op_expr199 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:492:2: ( ( lambda_expr )=> lambda_expr | op_expr )
            int alt90=2;
            alt90 = dfa90.predict(input);
            switch (alt90) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:492:4: ( lambda_expr )=> lambda_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_lambda_expr_in_lop_expr2857);
                    lambda_expr198=lambda_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lambda_expr198.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:493:4: op_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_op_expr_in_lop_expr2862);
                    op_expr199=op_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, op_expr199.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "lop_expr"

    public static class p_lop_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "p_lop_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:495:1: p_lop_expr : ( ( protected_lambda_expr )=> protected_lambda_expr | p_op_expr );
    public final babel17Parser.p_lop_expr_return p_lop_expr() throws RecognitionException {
        babel17Parser.p_lop_expr_return retval = new babel17Parser.p_lop_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.protected_lambda_expr_return protected_lambda_expr200 = null;

        babel17Parser.p_op_expr_return p_op_expr201 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:496:2: ( ( protected_lambda_expr )=> protected_lambda_expr | p_op_expr )
            int alt91=2;
            alt91 = dfa91.predict(input);
            switch (alt91) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:496:4: ( protected_lambda_expr )=> protected_lambda_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_protected_lambda_expr_in_p_lop_expr2878);
                    protected_lambda_expr200=protected_lambda_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, protected_lambda_expr200.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:497:4: p_op_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_p_op_expr_in_p_lop_expr2883);
                    p_op_expr201=p_op_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_op_expr201.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "p_lop_expr"

    public static class if_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "if_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:499:1: if_expr : L_if ( NL )? protected_expr ( NL )? L_then block ( L_elseif ( NL )? protected_expr ( NL )? L_then block )* ( L_else block )? L_end -> ^( IF ( protected_expr )* ( block )* ) ;
    public final babel17Parser.if_expr_return if_expr() throws RecognitionException {
        babel17Parser.if_expr_return retval = new babel17Parser.if_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_if202=null;
        Token NL203=null;
        Token NL205=null;
        Token L_then206=null;
        Token L_elseif208=null;
        Token NL209=null;
        Token NL211=null;
        Token L_then212=null;
        Token L_else214=null;
        Token L_end216=null;
        babel17Parser.protected_expr_return protected_expr204 = null;

        babel17Parser.block_return block207 = null;

        babel17Parser.protected_expr_return protected_expr210 = null;

        babel17Parser.block_return block213 = null;

        babel17Parser.block_return block215 = null;


        CommonTree L_if202_tree=null;
        CommonTree NL203_tree=null;
        CommonTree NL205_tree=null;
        CommonTree L_then206_tree=null;
        CommonTree L_elseif208_tree=null;
        CommonTree NL209_tree=null;
        CommonTree NL211_tree=null;
        CommonTree L_then212_tree=null;
        CommonTree L_else214_tree=null;
        CommonTree L_end216_tree=null;
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleTokenStream stream_L_else=new RewriteRuleTokenStream(adaptor,"token L_else");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_elseif=new RewriteRuleTokenStream(adaptor,"token L_elseif");
        RewriteRuleTokenStream stream_L_then=new RewriteRuleTokenStream(adaptor,"token L_then");
        RewriteRuleTokenStream stream_L_if=new RewriteRuleTokenStream(adaptor,"token L_if");
        RewriteRuleSubtreeStream stream_protected_expr=new RewriteRuleSubtreeStream(adaptor,"rule protected_expr");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:499:9: ( L_if ( NL )? protected_expr ( NL )? L_then block ( L_elseif ( NL )? protected_expr ( NL )? L_then block )* ( L_else block )? L_end -> ^( IF ( protected_expr )* ( block )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:499:11: L_if ( NL )? protected_expr ( NL )? L_then block ( L_elseif ( NL )? protected_expr ( NL )? L_then block )* ( L_else block )? L_end
            {
            L_if202=(Token)match(input,L_if,FOLLOW_L_if_in_if_expr2894); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_if.add(L_if202);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:499:16: ( NL )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==NL) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:499:16: NL
                    {
                    NL203=(Token)match(input,NL,FOLLOW_NL_in_if_expr2896); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL203);


                    }
                    break;

            }

            pushFollow(FOLLOW_protected_expr_in_if_expr2899);
            protected_expr204=protected_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr204.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:499:35: ( NL )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==NL) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:499:35: NL
                    {
                    NL205=(Token)match(input,NL,FOLLOW_NL_in_if_expr2901); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL205);


                    }
                    break;

            }

            L_then206=(Token)match(input,L_then,FOLLOW_L_then_in_if_expr2904); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_then.add(L_then206);

            pushFollow(FOLLOW_block_in_if_expr2906);
            block207=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block207.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:500:3: ( L_elseif ( NL )? protected_expr ( NL )? L_then block )*
            loop96:
            do {
                int alt96=2;
                int LA96_0 = input.LA(1);

                if ( (LA96_0==L_elseif) ) {
                    alt96=1;
                }


                switch (alt96) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:500:4: L_elseif ( NL )? protected_expr ( NL )? L_then block
            	    {
            	    L_elseif208=(Token)match(input,L_elseif,FOLLOW_L_elseif_in_if_expr2912); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_L_elseif.add(L_elseif208);

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:500:13: ( NL )?
            	    int alt94=2;
            	    int LA94_0 = input.LA(1);

            	    if ( (LA94_0==NL) ) {
            	        alt94=1;
            	    }
            	    switch (alt94) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:500:13: NL
            	            {
            	            NL209=(Token)match(input,NL,FOLLOW_NL_in_if_expr2914); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL209);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_protected_expr_in_if_expr2917);
            	    protected_expr210=protected_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr210.getTree());
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:500:32: ( NL )?
            	    int alt95=2;
            	    int LA95_0 = input.LA(1);

            	    if ( (LA95_0==NL) ) {
            	        alt95=1;
            	    }
            	    switch (alt95) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:500:32: NL
            	            {
            	            NL211=(Token)match(input,NL,FOLLOW_NL_in_if_expr2919); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL211);


            	            }
            	            break;

            	    }

            	    L_then212=(Token)match(input,L_then,FOLLOW_L_then_in_if_expr2922); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_L_then.add(L_then212);

            	    pushFollow(FOLLOW_block_in_if_expr2924);
            	    block213=block();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_block.add(block213.getTree());

            	    }
            	    break;

            	default :
            	    break loop96;
                }
            } while (true);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:501:3: ( L_else block )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==L_else) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:501:4: L_else block
                    {
                    L_else214=(Token)match(input,L_else,FOLLOW_L_else_in_if_expr2932); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_else.add(L_else214);

                    pushFollow(FOLLOW_block_in_if_expr2934);
                    block215=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block215.getTree());

                    }
                    break;

            }

            L_end216=(Token)match(input,L_end,FOLLOW_L_end_in_if_expr2938); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_end.add(L_end216);



            // AST REWRITE
            // elements: protected_expr, block
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 501:26: -> ^( IF ( protected_expr )* ( block )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:501:29: ^( IF ( protected_expr )* ( block )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IF, "IF"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:501:34: ( protected_expr )*
                while ( stream_protected_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_protected_expr.nextTree());

                }
                stream_protected_expr.reset();
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:501:50: ( block )*
                while ( stream_block.hasNext() ) {
                    adaptor.addChild(root_1, stream_block.nextTree());

                }
                stream_block.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "if_expr"

    public static class while_do_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "while_do_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:503:1: while_do_expr : L_while ( NL )? protected_expr ( NL )? L_do block L_end -> ^( WHILE_DO protected_expr block ) ;
    public final babel17Parser.while_do_expr_return while_do_expr() throws RecognitionException {
        babel17Parser.while_do_expr_return retval = new babel17Parser.while_do_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_while217=null;
        Token NL218=null;
        Token NL220=null;
        Token L_do221=null;
        Token L_end223=null;
        babel17Parser.protected_expr_return protected_expr219 = null;

        babel17Parser.block_return block222 = null;


        CommonTree L_while217_tree=null;
        CommonTree NL218_tree=null;
        CommonTree NL220_tree=null;
        CommonTree L_do221_tree=null;
        CommonTree L_end223_tree=null;
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_do=new RewriteRuleTokenStream(adaptor,"token L_do");
        RewriteRuleTokenStream stream_L_while=new RewriteRuleTokenStream(adaptor,"token L_while");
        RewriteRuleSubtreeStream stream_protected_expr=new RewriteRuleSubtreeStream(adaptor,"rule protected_expr");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:504:2: ( L_while ( NL )? protected_expr ( NL )? L_do block L_end -> ^( WHILE_DO protected_expr block ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:504:4: L_while ( NL )? protected_expr ( NL )? L_do block L_end
            {
            L_while217=(Token)match(input,L_while,FOLLOW_L_while_in_while_do_expr2962); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_while.add(L_while217);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:504:12: ( NL )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==NL) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:504:12: NL
                    {
                    NL218=(Token)match(input,NL,FOLLOW_NL_in_while_do_expr2964); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL218);


                    }
                    break;

            }

            pushFollow(FOLLOW_protected_expr_in_while_do_expr2967);
            protected_expr219=protected_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr219.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:504:31: ( NL )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==NL) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:504:31: NL
                    {
                    NL220=(Token)match(input,NL,FOLLOW_NL_in_while_do_expr2969); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL220);


                    }
                    break;

            }

            L_do221=(Token)match(input,L_do,FOLLOW_L_do_in_while_do_expr2972); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_do.add(L_do221);

            pushFollow(FOLLOW_block_in_while_do_expr2974);
            block222=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block222.getTree());
            L_end223=(Token)match(input,L_end,FOLLOW_L_end_in_while_do_expr2976); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_end.add(L_end223);



            // AST REWRITE
            // elements: block, protected_expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 505:5: -> ^( WHILE_DO protected_expr block )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:505:8: ^( WHILE_DO protected_expr block )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(WHILE_DO, "WHILE_DO"), root_1);

                adaptor.addChild(root_1, stream_protected_expr.nextTree());
                adaptor.addChild(root_1, stream_block.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "while_do_expr"

    public static class cases_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "cases"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:507:1: cases : ( full_cases | pattern ( NL )? token_DOUBLE_ARROW block -> ^( CASES ^( NIL pattern block ) ) );
    public final babel17Parser.cases_return cases() throws RecognitionException {
        babel17Parser.cases_return retval = new babel17Parser.cases_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL226=null;
        babel17Parser.full_cases_return full_cases224 = null;

        babel17Parser.pattern_return pattern225 = null;

        babel17Parser.token_DOUBLE_ARROW_return token_DOUBLE_ARROW227 = null;

        babel17Parser.block_return block228 = null;


        CommonTree NL226_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_token_DOUBLE_ARROW=new RewriteRuleSubtreeStream(adaptor,"rule token_DOUBLE_ARROW");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:508:2: ( full_cases | pattern ( NL )? token_DOUBLE_ARROW block -> ^( CASES ^( NIL pattern block ) ) )
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==L_case) ) {
                alt101=1;
            }
            else if ( ((LA101_0>=A_infinity && LA101_0<=U_infinity)||(LA101_0>=L_true && LA101_0<=L_false)||LA101_0==MINUS||(LA101_0>=Constr && LA101_0<=Num)||(LA101_0>=String && LA101_0<=ROUND_BRACKET_OPEN)||LA101_0==SQUARE_BRACKET_OPEN||LA101_0==CURLY_BRACKET_OPEN||LA101_0==UNDERSCORE) ) {
                alt101=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 101, 0, input);

                throw nvae;
            }
            switch (alt101) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:508:4: full_cases
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_full_cases_in_cases3006);
                    full_cases224=full_cases();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, full_cases224.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:509:4: pattern ( NL )? token_DOUBLE_ARROW block
                    {
                    pushFollow(FOLLOW_pattern_in_cases3011);
                    pattern225=pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pattern.add(pattern225.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:509:12: ( NL )?
                    int alt100=2;
                    int LA100_0 = input.LA(1);

                    if ( (LA100_0==NL) ) {
                        alt100=1;
                    }
                    switch (alt100) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:509:12: NL
                            {
                            NL226=(Token)match(input,NL,FOLLOW_NL_in_cases3013); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL226);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_token_DOUBLE_ARROW_in_cases3016);
                    token_DOUBLE_ARROW227=token_DOUBLE_ARROW();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_token_DOUBLE_ARROW.add(token_DOUBLE_ARROW227.getTree());
                    pushFollow(FOLLOW_block_in_cases3018);
                    block228=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block228.getTree());


                    // AST REWRITE
                    // elements: block, pattern
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 509:41: -> ^( CASES ^( NIL pattern block ) )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:509:44: ^( CASES ^( NIL pattern block ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CASES, "CASES"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:509:52: ^( NIL pattern block )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL, "NIL"), root_2);

                        adaptor.addChild(root_2, stream_pattern.nextTree());
                        adaptor.addChild(root_2, stream_block.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "cases"

    public static class full_cases_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "full_cases"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:511:1: full_cases : ( case_expr )+ -> ^( CASES ( case_expr )+ ) ;
    public final babel17Parser.full_cases_return full_cases() throws RecognitionException {
        babel17Parser.full_cases_return retval = new babel17Parser.full_cases_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.case_expr_return case_expr229 = null;


        RewriteRuleSubtreeStream stream_case_expr=new RewriteRuleSubtreeStream(adaptor,"rule case_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:512:2: ( ( case_expr )+ -> ^( CASES ( case_expr )+ ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:512:4: ( case_expr )+
            {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:512:4: ( case_expr )+
            int cnt102=0;
            loop102:
            do {
                int alt102=2;
                int LA102_0 = input.LA(1);

                if ( (LA102_0==L_case) ) {
                    alt102=1;
                }


                switch (alt102) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:512:4: case_expr
            	    {
            	    pushFollow(FOLLOW_case_expr_in_full_cases3041);
            	    case_expr229=case_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_case_expr.add(case_expr229.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt102 >= 1 ) break loop102;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(102, input);
                        throw eee;
                }
                cnt102++;
            } while (true);



            // AST REWRITE
            // elements: case_expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 512:15: -> ^( CASES ( case_expr )+ )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:512:18: ^( CASES ( case_expr )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CASES, "CASES"), root_1);

                if ( !(stream_case_expr.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_case_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_case_expr.nextTree());

                }
                stream_case_expr.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "full_cases"

    public static class case_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "case_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:514:1: case_expr : ( L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW block ) -> ^( NIL pattern block ) ;
    public final babel17Parser.case_expr_return case_expr() throws RecognitionException {
        babel17Parser.case_expr_return retval = new babel17Parser.case_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_case230=null;
        Token NL231=null;
        Token NL233=null;
        babel17Parser.pattern_return pattern232 = null;

        babel17Parser.token_DOUBLE_ARROW_return token_DOUBLE_ARROW234 = null;

        babel17Parser.block_return block235 = null;


        CommonTree L_case230_tree=null;
        CommonTree NL231_tree=null;
        CommonTree NL233_tree=null;
        RewriteRuleTokenStream stream_L_case=new RewriteRuleTokenStream(adaptor,"token L_case");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_token_DOUBLE_ARROW=new RewriteRuleSubtreeStream(adaptor,"rule token_DOUBLE_ARROW");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:515:2: ( ( L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW block ) -> ^( NIL pattern block ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:515:4: ( L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW block )
            {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:515:4: ( L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW block )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:515:5: L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW block
            {
            L_case230=(Token)match(input,L_case,FOLLOW_L_case_in_case_expr3062); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_case.add(L_case230);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:515:12: ( NL )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==NL) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:515:12: NL
                    {
                    NL231=(Token)match(input,NL,FOLLOW_NL_in_case_expr3064); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL231);


                    }
                    break;

            }

            pushFollow(FOLLOW_pattern_in_case_expr3067);
            pattern232=pattern();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pattern.add(pattern232.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:515:24: ( NL )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==NL) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:515:24: NL
                    {
                    NL233=(Token)match(input,NL,FOLLOW_NL_in_case_expr3069); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL233);


                    }
                    break;

            }

            pushFollow(FOLLOW_token_DOUBLE_ARROW_in_case_expr3072);
            token_DOUBLE_ARROW234=token_DOUBLE_ARROW();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_token_DOUBLE_ARROW.add(token_DOUBLE_ARROW234.getTree());
            pushFollow(FOLLOW_block_in_case_expr3074);
            block235=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block235.getTree());

            }



            // AST REWRITE
            // elements: pattern, block
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 515:54: -> ^( NIL pattern block )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:515:57: ^( NIL pattern block )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL, "NIL"), root_1);

                adaptor.addChild(root_1, stream_pattern.nextTree());
                adaptor.addChild(root_1, stream_block.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "case_expr"

    public static class match_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "match_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:517:1: match_expr : L_match ( NL )? p_op_expr ( NL )? full_cases L_end -> ^( MATCH p_op_expr full_cases ) ;
    public final babel17Parser.match_expr_return match_expr() throws RecognitionException {
        babel17Parser.match_expr_return retval = new babel17Parser.match_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_match236=null;
        Token NL237=null;
        Token NL239=null;
        Token L_end241=null;
        babel17Parser.p_op_expr_return p_op_expr238 = null;

        babel17Parser.full_cases_return full_cases240 = null;


        CommonTree L_match236_tree=null;
        CommonTree NL237_tree=null;
        CommonTree NL239_tree=null;
        CommonTree L_end241_tree=null;
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_match=new RewriteRuleTokenStream(adaptor,"token L_match");
        RewriteRuleSubtreeStream stream_full_cases=new RewriteRuleSubtreeStream(adaptor,"rule full_cases");
        RewriteRuleSubtreeStream stream_p_op_expr=new RewriteRuleSubtreeStream(adaptor,"rule p_op_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:518:2: ( L_match ( NL )? p_op_expr ( NL )? full_cases L_end -> ^( MATCH p_op_expr full_cases ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:518:4: L_match ( NL )? p_op_expr ( NL )? full_cases L_end
            {
            L_match236=(Token)match(input,L_match,FOLLOW_L_match_in_match_expr3095); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_match.add(L_match236);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:518:12: ( NL )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==NL) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:518:12: NL
                    {
                    NL237=(Token)match(input,NL,FOLLOW_NL_in_match_expr3097); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL237);


                    }
                    break;

            }

            pushFollow(FOLLOW_p_op_expr_in_match_expr3100);
            p_op_expr238=p_op_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_p_op_expr.add(p_op_expr238.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:518:26: ( NL )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==NL) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:518:26: NL
                    {
                    NL239=(Token)match(input,NL,FOLLOW_NL_in_match_expr3102); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL239);


                    }
                    break;

            }

            pushFollow(FOLLOW_full_cases_in_match_expr3105);
            full_cases240=full_cases();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_full_cases.add(full_cases240.getTree());
            L_end241=(Token)match(input,L_end,FOLLOW_L_end_in_match_expr3107); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_end.add(L_end241);



            // AST REWRITE
            // elements: full_cases, p_op_expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 519:5: -> ^( MATCH p_op_expr full_cases )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:519:8: ^( MATCH p_op_expr full_cases )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MATCH, "MATCH"), root_1);

                adaptor.addChild(root_1, stream_p_op_expr.nextTree());
                adaptor.addChild(root_1, stream_full_cases.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "match_expr"

    public static class lambda_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "lambda_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:521:1: lambda_expr : lambda_cases -> ^( LAMBDA lambda_cases ) ;
    public final babel17Parser.lambda_expr_return lambda_expr() throws RecognitionException {
        babel17Parser.lambda_expr_return retval = new babel17Parser.lambda_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.lambda_cases_return lambda_cases242 = null;


        RewriteRuleSubtreeStream stream_lambda_cases=new RewriteRuleSubtreeStream(adaptor,"rule lambda_cases");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:522:2: ( lambda_cases -> ^( LAMBDA lambda_cases ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:522:4: lambda_cases
            {
            pushFollow(FOLLOW_lambda_cases_in_lambda_expr3133);
            lambda_cases242=lambda_cases();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_lambda_cases.add(lambda_cases242.getTree());


            // AST REWRITE
            // elements: lambda_cases
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 522:17: -> ^( LAMBDA lambda_cases )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:522:20: ^( LAMBDA lambda_cases )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LAMBDA, "LAMBDA"), root_1);

                adaptor.addChild(root_1, stream_lambda_cases.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "lambda_expr"

    public static class lambda_cases_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "lambda_cases"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:524:1: lambda_cases : pattern ( NL )? token_DOUBLE_ARROW ( NL )? lop_expr -> ^( CASES ^( NIL pattern ^( BLOCK lop_expr ) ) ) ;
    public final babel17Parser.lambda_cases_return lambda_cases() throws RecognitionException {
        babel17Parser.lambda_cases_return retval = new babel17Parser.lambda_cases_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL244=null;
        Token NL246=null;
        babel17Parser.pattern_return pattern243 = null;

        babel17Parser.token_DOUBLE_ARROW_return token_DOUBLE_ARROW245 = null;

        babel17Parser.lop_expr_return lop_expr247 = null;


        CommonTree NL244_tree=null;
        CommonTree NL246_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_token_DOUBLE_ARROW=new RewriteRuleSubtreeStream(adaptor,"rule token_DOUBLE_ARROW");
        RewriteRuleSubtreeStream stream_lop_expr=new RewriteRuleSubtreeStream(adaptor,"rule lop_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:525:2: ( pattern ( NL )? token_DOUBLE_ARROW ( NL )? lop_expr -> ^( CASES ^( NIL pattern ^( BLOCK lop_expr ) ) ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:525:4: pattern ( NL )? token_DOUBLE_ARROW ( NL )? lop_expr
            {
            pushFollow(FOLLOW_pattern_in_lambda_cases3151);
            pattern243=pattern();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pattern.add(pattern243.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:525:12: ( NL )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==NL) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:525:12: NL
                    {
                    NL244=(Token)match(input,NL,FOLLOW_NL_in_lambda_cases3153); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL244);


                    }
                    break;

            }

            pushFollow(FOLLOW_token_DOUBLE_ARROW_in_lambda_cases3156);
            token_DOUBLE_ARROW245=token_DOUBLE_ARROW();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_token_DOUBLE_ARROW.add(token_DOUBLE_ARROW245.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:525:35: ( NL )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==NL) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:525:35: NL
                    {
                    NL246=(Token)match(input,NL,FOLLOW_NL_in_lambda_cases3158); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL246);


                    }
                    break;

            }

            pushFollow(FOLLOW_lop_expr_in_lambda_cases3161);
            lop_expr247=lop_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_lop_expr.add(lop_expr247.getTree());


            // AST REWRITE
            // elements: pattern, lop_expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 525:48: -> ^( CASES ^( NIL pattern ^( BLOCK lop_expr ) ) )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:525:51: ^( CASES ^( NIL pattern ^( BLOCK lop_expr ) ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CASES, "CASES"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:525:59: ^( NIL pattern ^( BLOCK lop_expr ) )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL, "NIL"), root_2);

                adaptor.addChild(root_2, stream_pattern.nextTree());
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:525:73: ^( BLOCK lop_expr )
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_3);

                adaptor.addChild(root_3, stream_lop_expr.nextTree());

                adaptor.addChild(root_2, root_3);
                }

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "lambda_cases"

    public static class protected_lambda_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "protected_lambda_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:527:1: protected_lambda_expr : protected_lambda_cases -> ^( LAMBDA protected_lambda_cases ) ;
    public final babel17Parser.protected_lambda_expr_return protected_lambda_expr() throws RecognitionException {
        babel17Parser.protected_lambda_expr_return retval = new babel17Parser.protected_lambda_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.protected_lambda_cases_return protected_lambda_cases248 = null;


        RewriteRuleSubtreeStream stream_protected_lambda_cases=new RewriteRuleSubtreeStream(adaptor,"rule protected_lambda_cases");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:528:2: ( protected_lambda_cases -> ^( LAMBDA protected_lambda_cases ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:528:4: protected_lambda_cases
            {
            pushFollow(FOLLOW_protected_lambda_cases_in_protected_lambda_expr3189);
            protected_lambda_cases248=protected_lambda_cases();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_protected_lambda_cases.add(protected_lambda_cases248.getTree());


            // AST REWRITE
            // elements: protected_lambda_cases
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 528:27: -> ^( LAMBDA protected_lambda_cases )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:528:30: ^( LAMBDA protected_lambda_cases )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LAMBDA, "LAMBDA"), root_1);

                adaptor.addChild(root_1, stream_protected_lambda_cases.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "protected_lambda_expr"

    public static class p_lambda_case_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "p_lambda_case_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:530:1: p_lambda_case_expr : ( L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block ) -> ^( NIL pattern pure_block ) ;
    public final babel17Parser.p_lambda_case_expr_return p_lambda_case_expr() throws RecognitionException {
        babel17Parser.p_lambda_case_expr_return retval = new babel17Parser.p_lambda_case_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_case249=null;
        Token NL250=null;
        Token NL252=null;
        Token NL254=null;
        babel17Parser.pattern_return pattern251 = null;

        babel17Parser.token_DOUBLE_ARROW_return token_DOUBLE_ARROW253 = null;

        babel17Parser.pure_block_return pure_block255 = null;


        CommonTree L_case249_tree=null;
        CommonTree NL250_tree=null;
        CommonTree NL252_tree=null;
        CommonTree NL254_tree=null;
        RewriteRuleTokenStream stream_L_case=new RewriteRuleTokenStream(adaptor,"token L_case");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_token_DOUBLE_ARROW=new RewriteRuleSubtreeStream(adaptor,"rule token_DOUBLE_ARROW");
        RewriteRuleSubtreeStream stream_pure_block=new RewriteRuleSubtreeStream(adaptor,"rule pure_block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:531:2: ( ( L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block ) -> ^( NIL pattern pure_block ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:531:4: ( L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block )
            {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:531:4: ( L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:531:5: L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block
            {
            L_case249=(Token)match(input,L_case,FOLLOW_L_case_in_p_lambda_case_expr3207); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_case.add(L_case249);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:531:12: ( NL )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==NL) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:531:12: NL
                    {
                    NL250=(Token)match(input,NL,FOLLOW_NL_in_p_lambda_case_expr3209); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL250);


                    }
                    break;

            }

            pushFollow(FOLLOW_pattern_in_p_lambda_case_expr3212);
            pattern251=pattern();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pattern.add(pattern251.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:531:24: ( NL )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==NL) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:531:24: NL
                    {
                    NL252=(Token)match(input,NL,FOLLOW_NL_in_p_lambda_case_expr3214); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL252);


                    }
                    break;

            }

            pushFollow(FOLLOW_token_DOUBLE_ARROW_in_p_lambda_case_expr3217);
            token_DOUBLE_ARROW253=token_DOUBLE_ARROW();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_token_DOUBLE_ARROW.add(token_DOUBLE_ARROW253.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:531:47: ( NL )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==NL) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:531:47: NL
                    {
                    NL254=(Token)match(input,NL,FOLLOW_NL_in_p_lambda_case_expr3219); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL254);


                    }
                    break;

            }

            pushFollow(FOLLOW_pure_block_in_p_lambda_case_expr3222);
            pure_block255=pure_block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pure_block.add(pure_block255.getTree());

            }



            // AST REWRITE
            // elements: pattern, pure_block
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 531:63: -> ^( NIL pattern pure_block )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:531:66: ^( NIL pattern pure_block )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL, "NIL"), root_1);

                adaptor.addChild(root_1, stream_pattern.nextTree());
                adaptor.addChild(root_1, stream_pure_block.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "p_lambda_case_expr"

    public static class protected_lambda_cases_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "protected_lambda_cases"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:533:1: protected_lambda_cases : ( pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block -> ^( CASES ^( NIL pattern pure_block ) ) | ( p_lambda_case_expr )+ -> ^( CASES ( p_lambda_case_expr )+ ) );
    public final babel17Parser.protected_lambda_cases_return protected_lambda_cases() throws RecognitionException {
        babel17Parser.protected_lambda_cases_return retval = new babel17Parser.protected_lambda_cases_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL257=null;
        Token NL259=null;
        babel17Parser.pattern_return pattern256 = null;

        babel17Parser.token_DOUBLE_ARROW_return token_DOUBLE_ARROW258 = null;

        babel17Parser.pure_block_return pure_block260 = null;

        babel17Parser.p_lambda_case_expr_return p_lambda_case_expr261 = null;


        CommonTree NL257_tree=null;
        CommonTree NL259_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_token_DOUBLE_ARROW=new RewriteRuleSubtreeStream(adaptor,"rule token_DOUBLE_ARROW");
        RewriteRuleSubtreeStream stream_p_lambda_case_expr=new RewriteRuleSubtreeStream(adaptor,"rule p_lambda_case_expr");
        RewriteRuleSubtreeStream stream_pure_block=new RewriteRuleSubtreeStream(adaptor,"rule pure_block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:534:2: ( pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block -> ^( CASES ^( NIL pattern pure_block ) ) | ( p_lambda_case_expr )+ -> ^( CASES ( p_lambda_case_expr )+ ) )
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( ((LA115_0>=A_infinity && LA115_0<=U_infinity)||(LA115_0>=L_true && LA115_0<=L_false)||LA115_0==MINUS||(LA115_0>=Constr && LA115_0<=Num)||(LA115_0>=String && LA115_0<=ROUND_BRACKET_OPEN)||LA115_0==SQUARE_BRACKET_OPEN||LA115_0==CURLY_BRACKET_OPEN||LA115_0==UNDERSCORE) ) {
                alt115=1;
            }
            else if ( (LA115_0==L_case) ) {
                alt115=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 115, 0, input);

                throw nvae;
            }
            switch (alt115) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:534:4: pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block
                    {
                    pushFollow(FOLLOW_pattern_in_protected_lambda_cases3243);
                    pattern256=pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pattern.add(pattern256.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:534:12: ( NL )?
                    int alt112=2;
                    int LA112_0 = input.LA(1);

                    if ( (LA112_0==NL) ) {
                        alt112=1;
                    }
                    switch (alt112) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:534:12: NL
                            {
                            NL257=(Token)match(input,NL,FOLLOW_NL_in_protected_lambda_cases3245); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL257);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_token_DOUBLE_ARROW_in_protected_lambda_cases3248);
                    token_DOUBLE_ARROW258=token_DOUBLE_ARROW();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_token_DOUBLE_ARROW.add(token_DOUBLE_ARROW258.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:534:35: ( NL )?
                    int alt113=2;
                    int LA113_0 = input.LA(1);

                    if ( (LA113_0==NL) ) {
                        alt113=1;
                    }
                    switch (alt113) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:534:35: NL
                            {
                            NL259=(Token)match(input,NL,FOLLOW_NL_in_protected_lambda_cases3250); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL259);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_pure_block_in_protected_lambda_cases3253);
                    pure_block260=pure_block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pure_block.add(pure_block260.getTree());


                    // AST REWRITE
                    // elements: pattern, pure_block
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 534:50: -> ^( CASES ^( NIL pattern pure_block ) )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:534:53: ^( CASES ^( NIL pattern pure_block ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CASES, "CASES"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:534:61: ^( NIL pattern pure_block )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL, "NIL"), root_2);

                        adaptor.addChild(root_2, stream_pattern.nextTree());
                        adaptor.addChild(root_2, stream_pure_block.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:535:4: ( p_lambda_case_expr )+
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:535:4: ( p_lambda_case_expr )+
                    int cnt114=0;
                    loop114:
                    do {
                        int alt114=2;
                        int LA114_0 = input.LA(1);

                        if ( (LA114_0==L_case) ) {
                            alt114=1;
                        }


                        switch (alt114) {
                    	case 1 :
                    	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:535:4: p_lambda_case_expr
                    	    {
                    	    pushFollow(FOLLOW_p_lambda_case_expr_in_protected_lambda_cases3272);
                    	    p_lambda_case_expr261=p_lambda_case_expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_p_lambda_case_expr.add(p_lambda_case_expr261.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt114 >= 1 ) break loop114;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(114, input);
                                throw eee;
                        }
                        cnt114++;
                    } while (true);



                    // AST REWRITE
                    // elements: p_lambda_case_expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 535:24: -> ^( CASES ( p_lambda_case_expr )+ )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:535:27: ^( CASES ( p_lambda_case_expr )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CASES, "CASES"), root_1);

                        if ( !(stream_p_lambda_case_expr.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_p_lambda_case_expr.hasNext() ) {
                            adaptor.addChild(root_1, stream_p_lambda_case_expr.nextTree());

                        }
                        stream_p_lambda_case_expr.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "protected_lambda_cases"

    public static class for_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "for_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:537:1: for_expr : L_for ( NL )? pattern ( NL )? L_in ( NL )? protected_expr ( NL )? L_do block L_end -> ^( FOR_EXPR pattern protected_expr block ) ;
    public final babel17Parser.for_expr_return for_expr() throws RecognitionException {
        babel17Parser.for_expr_return retval = new babel17Parser.for_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_for262=null;
        Token NL263=null;
        Token NL265=null;
        Token L_in266=null;
        Token NL267=null;
        Token NL269=null;
        Token L_do270=null;
        Token L_end272=null;
        babel17Parser.pattern_return pattern264 = null;

        babel17Parser.protected_expr_return protected_expr268 = null;

        babel17Parser.block_return block271 = null;


        CommonTree L_for262_tree=null;
        CommonTree NL263_tree=null;
        CommonTree NL265_tree=null;
        CommonTree L_in266_tree=null;
        CommonTree NL267_tree=null;
        CommonTree NL269_tree=null;
        CommonTree L_do270_tree=null;
        CommonTree L_end272_tree=null;
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleTokenStream stream_L_for=new RewriteRuleTokenStream(adaptor,"token L_for");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_in=new RewriteRuleTokenStream(adaptor,"token L_in");
        RewriteRuleTokenStream stream_L_do=new RewriteRuleTokenStream(adaptor,"token L_do");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_protected_expr=new RewriteRuleSubtreeStream(adaptor,"rule protected_expr");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:537:9: ( L_for ( NL )? pattern ( NL )? L_in ( NL )? protected_expr ( NL )? L_do block L_end -> ^( FOR_EXPR pattern protected_expr block ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:537:11: L_for ( NL )? pattern ( NL )? L_in ( NL )? protected_expr ( NL )? L_do block L_end
            {
            L_for262=(Token)match(input,L_for,FOLLOW_L_for_in_for_expr3289); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_for.add(L_for262);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:537:17: ( NL )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==NL) ) {
                alt116=1;
            }
            switch (alt116) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:537:17: NL
                    {
                    NL263=(Token)match(input,NL,FOLLOW_NL_in_for_expr3291); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL263);


                    }
                    break;

            }

            pushFollow(FOLLOW_pattern_in_for_expr3294);
            pattern264=pattern();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pattern.add(pattern264.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:537:29: ( NL )?
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==NL) ) {
                alt117=1;
            }
            switch (alt117) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:537:29: NL
                    {
                    NL265=(Token)match(input,NL,FOLLOW_NL_in_for_expr3296); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL265);


                    }
                    break;

            }

            L_in266=(Token)match(input,L_in,FOLLOW_L_in_in_for_expr3299); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_in.add(L_in266);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:537:38: ( NL )?
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==NL) ) {
                alt118=1;
            }
            switch (alt118) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:537:38: NL
                    {
                    NL267=(Token)match(input,NL,FOLLOW_NL_in_for_expr3301); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL267);


                    }
                    break;

            }

            pushFollow(FOLLOW_protected_expr_in_for_expr3304);
            protected_expr268=protected_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr268.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:537:57: ( NL )?
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==NL) ) {
                alt119=1;
            }
            switch (alt119) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:537:57: NL
                    {
                    NL269=(Token)match(input,NL,FOLLOW_NL_in_for_expr3306); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL269);


                    }
                    break;

            }

            L_do270=(Token)match(input,L_do,FOLLOW_L_do_in_for_expr3309); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_do.add(L_do270);

            pushFollow(FOLLOW_block_in_for_expr3311);
            block271=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block271.getTree());
            L_end272=(Token)match(input,L_end,FOLLOW_L_end_in_for_expr3313); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_end.add(L_end272);



            // AST REWRITE
            // elements: block, protected_expr, pattern
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 538:5: -> ^( FOR_EXPR pattern protected_expr block )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:538:8: ^( FOR_EXPR pattern protected_expr block )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FOR_EXPR, "FOR_EXPR"), root_1);

                adaptor.addChild(root_1, stream_pattern.nextTree());
                adaptor.addChild(root_1, stream_protected_expr.nextTree());
                adaptor.addChild(root_1, stream_block.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "for_expr"

    public static class op_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "op_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:540:1: op_expr : ( builtin_primitive op_expr | bool_expr );
    public final babel17Parser.op_expr_return op_expr() throws RecognitionException {
        babel17Parser.op_expr_return retval = new babel17Parser.op_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.builtin_primitive_return builtin_primitive273 = null;

        babel17Parser.op_expr_return op_expr274 = null;

        babel17Parser.bool_expr_return bool_expr275 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:540:9: ( builtin_primitive op_expr | bool_expr )
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==L_exception||(LA120_0>=L_concurrent && LA120_0<=L_lazy)||LA120_0==L_random||LA120_0==TILDE) ) {
                alt120=1;
            }
            else if ( (LA120_0==L_begin||(LA120_0>=L_with && LA120_0<=L_if)||(LA120_0>=L_while && LA120_0<=L_for)||LA120_0==L_match||(LA120_0>=A_infinity && LA120_0<=U_infinity)||LA120_0==L_root||(LA120_0>=L_true && LA120_0<=L_here)||LA120_0==MINUS||LA120_0==MODULE_KEY||LA120_0==A_NOT||LA120_0==U_NOT||(LA120_0>=Constr && LA120_0<=Num)||(LA120_0>=String && LA120_0<=ROUND_BRACKET_OPEN)||LA120_0==SQUARE_BRACKET_OPEN||LA120_0==CURLY_BRACKET_OPEN) ) {
                alt120=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 120, 0, input);

                throw nvae;
            }
            switch (alt120) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:540:11: builtin_primitive op_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_builtin_primitive_in_op_expr3338);
                    builtin_primitive273=builtin_primitive();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(builtin_primitive273.getTree(), root_0);
                    pushFollow(FOLLOW_op_expr_in_op_expr3341);
                    op_expr274=op_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, op_expr274.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:541:4: bool_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_bool_expr_in_op_expr3346);
                    bool_expr275=bool_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_expr275.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "op_expr"

    public static class p_op_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "p_op_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:543:1: p_op_expr : ( builtin_primitive ( NL )? p_op_expr | p_bool_expr );
    public final babel17Parser.p_op_expr_return p_op_expr() throws RecognitionException {
        babel17Parser.p_op_expr_return retval = new babel17Parser.p_op_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL277=null;
        babel17Parser.builtin_primitive_return builtin_primitive276 = null;

        babel17Parser.p_op_expr_return p_op_expr278 = null;

        babel17Parser.p_bool_expr_return p_bool_expr279 = null;


        CommonTree NL277_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:544:2: ( builtin_primitive ( NL )? p_op_expr | p_bool_expr )
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==L_exception||(LA122_0>=L_concurrent && LA122_0<=L_lazy)||LA122_0==L_random||LA122_0==TILDE) ) {
                alt122=1;
            }
            else if ( (LA122_0==L_begin||(LA122_0>=L_with && LA122_0<=L_if)||(LA122_0>=L_while && LA122_0<=L_for)||LA122_0==L_match||(LA122_0>=A_infinity && LA122_0<=U_infinity)||LA122_0==L_root||(LA122_0>=L_true && LA122_0<=L_here)||LA122_0==MINUS||LA122_0==MODULE_KEY||LA122_0==A_NOT||LA122_0==U_NOT||(LA122_0>=Constr && LA122_0<=Num)||(LA122_0>=String && LA122_0<=ROUND_BRACKET_OPEN)||LA122_0==SQUARE_BRACKET_OPEN||LA122_0==CURLY_BRACKET_OPEN) ) {
                alt122=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 122, 0, input);

                throw nvae;
            }
            switch (alt122) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:544:4: builtin_primitive ( NL )? p_op_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_builtin_primitive_in_p_op_expr3356);
                    builtin_primitive276=builtin_primitive();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(builtin_primitive276.getTree(), root_0);
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:544:25: ( NL )?
                    int alt121=2;
                    int LA121_0 = input.LA(1);

                    if ( (LA121_0==NL) ) {
                        alt121=1;
                    }
                    switch (alt121) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:544:25: NL
                            {
                            NL277=(Token)match(input,NL,FOLLOW_NL_in_p_op_expr3359); if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_p_op_expr_in_p_op_expr3363);
                    p_op_expr278=p_op_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_op_expr278.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:545:4: p_bool_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_p_bool_expr_in_p_op_expr3368);
                    p_bool_expr279=p_bool_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_bool_expr279.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "p_op_expr"

    public static class builtin_primitive_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "builtin_primitive"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:548:1: builtin_primitive : ( L_random | L_await | L_exception | L_lazy | TILDE | L_concurrent );
    public final babel17Parser.builtin_primitive_return builtin_primitive() throws RecognitionException {
        babel17Parser.builtin_primitive_return retval = new babel17Parser.builtin_primitive_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set280=null;

        CommonTree set280_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:549:2: ( L_random | L_await | L_exception | L_lazy | TILDE | L_concurrent )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set280=(Token)input.LT(1);
            if ( input.LA(1)==L_exception||(input.LA(1)>=L_concurrent && input.LA(1)<=L_lazy)||input.LA(1)==L_random||input.LA(1)==TILDE ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set280));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "builtin_primitive"

    public static class bool_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bool_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:551:1: bool_expr : bool_or_expr ;
    public final babel17Parser.bool_expr_return bool_expr() throws RecognitionException {
        babel17Parser.bool_expr_return retval = new babel17Parser.bool_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.bool_or_expr_return bool_or_expr281 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:552:2: ( bool_or_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:552:4: bool_or_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bool_or_expr_in_bool_expr3408);
            bool_or_expr281=bool_or_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_or_expr281.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "bool_expr"

    public static class p_bool_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "p_bool_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:554:1: p_bool_expr : p_bool_or_expr ;
    public final babel17Parser.p_bool_expr_return p_bool_expr() throws RecognitionException {
        babel17Parser.p_bool_expr_return retval = new babel17Parser.p_bool_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.p_bool_or_expr_return p_bool_or_expr282 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:555:2: ( p_bool_or_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:555:4: p_bool_or_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_bool_or_expr_in_p_bool_expr3418);
            p_bool_or_expr282=p_bool_or_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_bool_or_expr282.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "p_bool_expr"

    public static class bool_or_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bool_or_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:557:1: bool_or_expr : bool_and_expr ( ( NL )? token_OR ( NL )? bool_and_expr )* ;
    public final babel17Parser.bool_or_expr_return bool_or_expr() throws RecognitionException {
        babel17Parser.bool_or_expr_return retval = new babel17Parser.bool_or_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL284=null;
        Token NL286=null;
        babel17Parser.bool_and_expr_return bool_and_expr283 = null;

        babel17Parser.token_OR_return token_OR285 = null;

        babel17Parser.bool_and_expr_return bool_and_expr287 = null;


        CommonTree NL284_tree=null;
        CommonTree NL286_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:558:2: ( bool_and_expr ( ( NL )? token_OR ( NL )? bool_and_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:558:4: bool_and_expr ( ( NL )? token_OR ( NL )? bool_and_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bool_and_expr_in_bool_or_expr3427);
            bool_and_expr283=bool_and_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_and_expr283.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:558:18: ( ( NL )? token_OR ( NL )? bool_and_expr )*
            loop125:
            do {
                int alt125=2;
                int LA125_0 = input.LA(1);

                if ( (LA125_0==NL) ) {
                    int LA125_1 = input.LA(2);

                    if ( (LA125_1==A_OR||LA125_1==U_OR) ) {
                        alt125=1;
                    }


                }
                else if ( (LA125_0==A_OR||LA125_0==U_OR) ) {
                    alt125=1;
                }


                switch (alt125) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:558:19: ( NL )? token_OR ( NL )? bool_and_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:558:21: ( NL )?
            	    int alt123=2;
            	    int LA123_0 = input.LA(1);

            	    if ( (LA123_0==NL) ) {
            	        alt123=1;
            	    }
            	    switch (alt123) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:558:21: NL
            	            {
            	            NL284=(Token)match(input,NL,FOLLOW_NL_in_bool_or_expr3430); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_token_OR_in_bool_or_expr3434);
            	    token_OR285=token_OR();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(token_OR285.getTree(), root_0);
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:558:36: ( NL )?
            	    int alt124=2;
            	    int LA124_0 = input.LA(1);

            	    if ( (LA124_0==NL) ) {
            	        alt124=1;
            	    }
            	    switch (alt124) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:558:36: NL
            	            {
            	            NL286=(Token)match(input,NL,FOLLOW_NL_in_bool_or_expr3437); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_bool_and_expr_in_bool_or_expr3441);
            	    bool_and_expr287=bool_and_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_and_expr287.getTree());

            	    }
            	    break;

            	default :
            	    break loop125;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "bool_or_expr"

    public static class p_bool_or_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "p_bool_or_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:560:1: p_bool_or_expr : p_bool_and_expr ( ( NL )? token_OR ( NL )? p_bool_and_expr )* ;
    public final babel17Parser.p_bool_or_expr_return p_bool_or_expr() throws RecognitionException {
        babel17Parser.p_bool_or_expr_return retval = new babel17Parser.p_bool_or_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL289=null;
        Token NL291=null;
        babel17Parser.p_bool_and_expr_return p_bool_and_expr288 = null;

        babel17Parser.token_OR_return token_OR290 = null;

        babel17Parser.p_bool_and_expr_return p_bool_and_expr292 = null;


        CommonTree NL289_tree=null;
        CommonTree NL291_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:561:2: ( p_bool_and_expr ( ( NL )? token_OR ( NL )? p_bool_and_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:561:4: p_bool_and_expr ( ( NL )? token_OR ( NL )? p_bool_and_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_bool_and_expr_in_p_bool_or_expr3453);
            p_bool_and_expr288=p_bool_and_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_bool_and_expr288.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:561:20: ( ( NL )? token_OR ( NL )? p_bool_and_expr )*
            loop128:
            do {
                int alt128=2;
                int LA128_0 = input.LA(1);

                if ( (LA128_0==NL) ) {
                    int LA128_1 = input.LA(2);

                    if ( (LA128_1==A_OR||LA128_1==U_OR) ) {
                        alt128=1;
                    }


                }
                else if ( (LA128_0==A_OR||LA128_0==U_OR) ) {
                    alt128=1;
                }


                switch (alt128) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:561:21: ( NL )? token_OR ( NL )? p_bool_and_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:561:23: ( NL )?
            	    int alt126=2;
            	    int LA126_0 = input.LA(1);

            	    if ( (LA126_0==NL) ) {
            	        alt126=1;
            	    }
            	    switch (alt126) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:561:23: NL
            	            {
            	            NL289=(Token)match(input,NL,FOLLOW_NL_in_p_bool_or_expr3456); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_token_OR_in_p_bool_or_expr3460);
            	    token_OR290=token_OR();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(token_OR290.getTree(), root_0);
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:561:38: ( NL )?
            	    int alt127=2;
            	    int LA127_0 = input.LA(1);

            	    if ( (LA127_0==NL) ) {
            	        alt127=1;
            	    }
            	    switch (alt127) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:561:38: NL
            	            {
            	            NL291=(Token)match(input,NL,FOLLOW_NL_in_p_bool_or_expr3463); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_bool_and_expr_in_p_bool_or_expr3467);
            	    p_bool_and_expr292=p_bool_and_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_bool_and_expr292.getTree());

            	    }
            	    break;

            	default :
            	    break loop128;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "p_bool_or_expr"

    public static class bool_and_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bool_and_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:563:1: bool_and_expr : bool_not_expr ( ( NL )? token_AND ( NL )? bool_not_expr )* ;
    public final babel17Parser.bool_and_expr_return bool_and_expr() throws RecognitionException {
        babel17Parser.bool_and_expr_return retval = new babel17Parser.bool_and_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL294=null;
        Token NL296=null;
        babel17Parser.bool_not_expr_return bool_not_expr293 = null;

        babel17Parser.token_AND_return token_AND295 = null;

        babel17Parser.bool_not_expr_return bool_not_expr297 = null;


        CommonTree NL294_tree=null;
        CommonTree NL296_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:564:2: ( bool_not_expr ( ( NL )? token_AND ( NL )? bool_not_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:564:4: bool_not_expr ( ( NL )? token_AND ( NL )? bool_not_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bool_not_expr_in_bool_and_expr3479);
            bool_not_expr293=bool_not_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_not_expr293.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:564:18: ( ( NL )? token_AND ( NL )? bool_not_expr )*
            loop131:
            do {
                int alt131=2;
                int LA131_0 = input.LA(1);

                if ( (LA131_0==NL) ) {
                    int LA131_1 = input.LA(2);

                    if ( (LA131_1==A_AND||LA131_1==U_AND) ) {
                        alt131=1;
                    }


                }
                else if ( (LA131_0==A_AND||LA131_0==U_AND) ) {
                    alt131=1;
                }


                switch (alt131) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:564:19: ( NL )? token_AND ( NL )? bool_not_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:564:21: ( NL )?
            	    int alt129=2;
            	    int LA129_0 = input.LA(1);

            	    if ( (LA129_0==NL) ) {
            	        alt129=1;
            	    }
            	    switch (alt129) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:564:21: NL
            	            {
            	            NL294=(Token)match(input,NL,FOLLOW_NL_in_bool_and_expr3482); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_token_AND_in_bool_and_expr3486);
            	    token_AND295=token_AND();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(token_AND295.getTree(), root_0);
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:564:37: ( NL )?
            	    int alt130=2;
            	    int LA130_0 = input.LA(1);

            	    if ( (LA130_0==NL) ) {
            	        alt130=1;
            	    }
            	    switch (alt130) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:564:37: NL
            	            {
            	            NL296=(Token)match(input,NL,FOLLOW_NL_in_bool_and_expr3489); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_bool_not_expr_in_bool_and_expr3493);
            	    bool_not_expr297=bool_not_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_not_expr297.getTree());

            	    }
            	    break;

            	default :
            	    break loop131;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "bool_and_expr"

    public static class p_bool_and_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "p_bool_and_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:566:1: p_bool_and_expr : p_bool_not_expr ( ( NL )? token_AND ( NL )? p_bool_not_expr )* ;
    public final babel17Parser.p_bool_and_expr_return p_bool_and_expr() throws RecognitionException {
        babel17Parser.p_bool_and_expr_return retval = new babel17Parser.p_bool_and_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL299=null;
        Token NL301=null;
        babel17Parser.p_bool_not_expr_return p_bool_not_expr298 = null;

        babel17Parser.token_AND_return token_AND300 = null;

        babel17Parser.p_bool_not_expr_return p_bool_not_expr302 = null;


        CommonTree NL299_tree=null;
        CommonTree NL301_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:567:2: ( p_bool_not_expr ( ( NL )? token_AND ( NL )? p_bool_not_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:567:4: p_bool_not_expr ( ( NL )? token_AND ( NL )? p_bool_not_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_bool_not_expr_in_p_bool_and_expr3505);
            p_bool_not_expr298=p_bool_not_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_bool_not_expr298.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:567:20: ( ( NL )? token_AND ( NL )? p_bool_not_expr )*
            loop134:
            do {
                int alt134=2;
                int LA134_0 = input.LA(1);

                if ( (LA134_0==NL) ) {
                    int LA134_1 = input.LA(2);

                    if ( (LA134_1==A_AND||LA134_1==U_AND) ) {
                        alt134=1;
                    }


                }
                else if ( (LA134_0==A_AND||LA134_0==U_AND) ) {
                    alt134=1;
                }


                switch (alt134) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:567:21: ( NL )? token_AND ( NL )? p_bool_not_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:567:23: ( NL )?
            	    int alt132=2;
            	    int LA132_0 = input.LA(1);

            	    if ( (LA132_0==NL) ) {
            	        alt132=1;
            	    }
            	    switch (alt132) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:567:23: NL
            	            {
            	            NL299=(Token)match(input,NL,FOLLOW_NL_in_p_bool_and_expr3508); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_token_AND_in_p_bool_and_expr3512);
            	    token_AND300=token_AND();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(token_AND300.getTree(), root_0);
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:567:39: ( NL )?
            	    int alt133=2;
            	    int LA133_0 = input.LA(1);

            	    if ( (LA133_0==NL) ) {
            	        alt133=1;
            	    }
            	    switch (alt133) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:567:39: NL
            	            {
            	            NL301=(Token)match(input,NL,FOLLOW_NL_in_p_bool_and_expr3515); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_bool_not_expr_in_p_bool_and_expr3519);
            	    p_bool_not_expr302=p_bool_not_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_bool_not_expr302.getTree());

            	    }
            	    break;

            	default :
            	    break loop134;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "p_bool_and_expr"

    public static class bool_not_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bool_not_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:570:1: bool_not_expr : ( token_NOT ( NL )? bool_not_expr | rel_expr );
    public final babel17Parser.bool_not_expr_return bool_not_expr() throws RecognitionException {
        babel17Parser.bool_not_expr_return retval = new babel17Parser.bool_not_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL304=null;
        babel17Parser.token_NOT_return token_NOT303 = null;

        babel17Parser.bool_not_expr_return bool_not_expr305 = null;

        babel17Parser.rel_expr_return rel_expr306 = null;


        CommonTree NL304_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:571:2: ( token_NOT ( NL )? bool_not_expr | rel_expr )
            int alt136=2;
            int LA136_0 = input.LA(1);

            if ( (LA136_0==A_NOT||LA136_0==U_NOT) ) {
                alt136=1;
            }
            else if ( (LA136_0==L_begin||(LA136_0>=L_with && LA136_0<=L_if)||(LA136_0>=L_while && LA136_0<=L_for)||LA136_0==L_match||(LA136_0>=A_infinity && LA136_0<=U_infinity)||LA136_0==L_root||(LA136_0>=L_true && LA136_0<=L_here)||LA136_0==MINUS||LA136_0==MODULE_KEY||(LA136_0>=Constr && LA136_0<=Num)||(LA136_0>=String && LA136_0<=ROUND_BRACKET_OPEN)||LA136_0==SQUARE_BRACKET_OPEN||LA136_0==CURLY_BRACKET_OPEN) ) {
                alt136=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 136, 0, input);

                throw nvae;
            }
            switch (alt136) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:571:4: token_NOT ( NL )? bool_not_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_NOT_in_bool_not_expr3531);
                    token_NOT303=token_NOT();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(token_NOT303.getTree(), root_0);
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:571:17: ( NL )?
                    int alt135=2;
                    int LA135_0 = input.LA(1);

                    if ( (LA135_0==NL) ) {
                        alt135=1;
                    }
                    switch (alt135) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:571:17: NL
                            {
                            NL304=(Token)match(input,NL,FOLLOW_NL_in_bool_not_expr3534); if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_bool_not_expr_in_bool_not_expr3538);
                    bool_not_expr305=bool_not_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_not_expr305.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:572:4: rel_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_rel_expr_in_bool_not_expr3543);
                    rel_expr306=rel_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rel_expr306.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "bool_not_expr"

    public static class p_bool_not_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "p_bool_not_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:574:1: p_bool_not_expr : ( token_NOT ( NL )? p_bool_not_expr | p_rel_expr );
    public final babel17Parser.p_bool_not_expr_return p_bool_not_expr() throws RecognitionException {
        babel17Parser.p_bool_not_expr_return retval = new babel17Parser.p_bool_not_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL308=null;
        babel17Parser.token_NOT_return token_NOT307 = null;

        babel17Parser.p_bool_not_expr_return p_bool_not_expr309 = null;

        babel17Parser.p_rel_expr_return p_rel_expr310 = null;


        CommonTree NL308_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:575:2: ( token_NOT ( NL )? p_bool_not_expr | p_rel_expr )
            int alt138=2;
            int LA138_0 = input.LA(1);

            if ( (LA138_0==A_NOT||LA138_0==U_NOT) ) {
                alt138=1;
            }
            else if ( (LA138_0==L_begin||(LA138_0>=L_with && LA138_0<=L_if)||(LA138_0>=L_while && LA138_0<=L_for)||LA138_0==L_match||(LA138_0>=A_infinity && LA138_0<=U_infinity)||LA138_0==L_root||(LA138_0>=L_true && LA138_0<=L_here)||LA138_0==MINUS||LA138_0==MODULE_KEY||(LA138_0>=Constr && LA138_0<=Num)||(LA138_0>=String && LA138_0<=ROUND_BRACKET_OPEN)||LA138_0==SQUARE_BRACKET_OPEN||LA138_0==CURLY_BRACKET_OPEN) ) {
                alt138=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 138, 0, input);

                throw nvae;
            }
            switch (alt138) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:575:4: token_NOT ( NL )? p_bool_not_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_NOT_in_p_bool_not_expr3554);
                    token_NOT307=token_NOT();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(token_NOT307.getTree(), root_0);
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:575:17: ( NL )?
                    int alt137=2;
                    int LA137_0 = input.LA(1);

                    if ( (LA137_0==NL) ) {
                        alt137=1;
                    }
                    switch (alt137) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:575:17: NL
                            {
                            NL308=(Token)match(input,NL,FOLLOW_NL_in_p_bool_not_expr3557); if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_p_bool_not_expr_in_p_bool_not_expr3561);
                    p_bool_not_expr309=p_bool_not_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_bool_not_expr309.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:576:4: p_rel_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_p_rel_expr_in_p_bool_not_expr3566);
                    p_rel_expr310=p_rel_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_rel_expr310.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "p_bool_not_expr"

    public static class rel_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rel_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:578:1: rel_expr : arith_expr ( ( NL )? rel_op ( NL )? arith_expr )* -> ^( COMPARE arith_expr ( rel_op arith_expr )* ) ;
    public final babel17Parser.rel_expr_return rel_expr() throws RecognitionException {
        babel17Parser.rel_expr_return retval = new babel17Parser.rel_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL312=null;
        Token NL314=null;
        babel17Parser.arith_expr_return arith_expr311 = null;

        babel17Parser.rel_op_return rel_op313 = null;

        babel17Parser.arith_expr_return arith_expr315 = null;


        CommonTree NL312_tree=null;
        CommonTree NL314_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_arith_expr=new RewriteRuleSubtreeStream(adaptor,"rule arith_expr");
        RewriteRuleSubtreeStream stream_rel_op=new RewriteRuleSubtreeStream(adaptor,"rule rel_op");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:579:2: ( arith_expr ( ( NL )? rel_op ( NL )? arith_expr )* -> ^( COMPARE arith_expr ( rel_op arith_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:579:4: arith_expr ( ( NL )? rel_op ( NL )? arith_expr )*
            {
            pushFollow(FOLLOW_arith_expr_in_rel_expr3575);
            arith_expr311=arith_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_arith_expr.add(arith_expr311.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:579:15: ( ( NL )? rel_op ( NL )? arith_expr )*
            loop141:
            do {
                int alt141=2;
                int LA141_0 = input.LA(1);

                if ( (LA141_0==NL) ) {
                    int LA141_1 = input.LA(2);

                    if ( ((LA141_1>=A_EQUAL && LA141_1<=UNRELATED)) ) {
                        alt141=1;
                    }


                }
                else if ( ((LA141_0>=A_EQUAL && LA141_0<=UNRELATED)) ) {
                    alt141=1;
                }


                switch (alt141) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:579:16: ( NL )? rel_op ( NL )? arith_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:579:16: ( NL )?
            	    int alt139=2;
            	    int LA139_0 = input.LA(1);

            	    if ( (LA139_0==NL) ) {
            	        alt139=1;
            	    }
            	    switch (alt139) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:579:16: NL
            	            {
            	            NL312=(Token)match(input,NL,FOLLOW_NL_in_rel_expr3578); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL312);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_rel_op_in_rel_expr3581);
            	    rel_op313=rel_op();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_rel_op.add(rel_op313.getTree());
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:579:27: ( NL )?
            	    int alt140=2;
            	    int LA140_0 = input.LA(1);

            	    if ( (LA140_0==NL) ) {
            	        alt140=1;
            	    }
            	    switch (alt140) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:579:27: NL
            	            {
            	            NL314=(Token)match(input,NL,FOLLOW_NL_in_rel_expr3583); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL314);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_arith_expr_in_rel_expr3586);
            	    arith_expr315=arith_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_arith_expr.add(arith_expr315.getTree());

            	    }
            	    break;

            	default :
            	    break loop141;
                }
            } while (true);



            // AST REWRITE
            // elements: arith_expr, arith_expr, rel_op
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 579:44: -> ^( COMPARE arith_expr ( rel_op arith_expr )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:579:47: ^( COMPARE arith_expr ( rel_op arith_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COMPARE, "COMPARE"), root_1);

                adaptor.addChild(root_1, stream_arith_expr.nextTree());
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:579:68: ( rel_op arith_expr )*
                while ( stream_arith_expr.hasNext()||stream_rel_op.hasNext() ) {
                    adaptor.addChild(root_1, stream_rel_op.nextTree());
                    adaptor.addChild(root_1, stream_arith_expr.nextTree());

                }
                stream_arith_expr.reset();
                stream_rel_op.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "rel_expr"

    public static class p_rel_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "p_rel_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:581:1: p_rel_expr : p_arith_expr ( ( NL )? rel_op ( NL )? p_arith_expr )* -> ^( COMPARE p_arith_expr ( rel_op p_arith_expr )* ) ;
    public final babel17Parser.p_rel_expr_return p_rel_expr() throws RecognitionException {
        babel17Parser.p_rel_expr_return retval = new babel17Parser.p_rel_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL317=null;
        Token NL319=null;
        babel17Parser.p_arith_expr_return p_arith_expr316 = null;

        babel17Parser.rel_op_return rel_op318 = null;

        babel17Parser.p_arith_expr_return p_arith_expr320 = null;


        CommonTree NL317_tree=null;
        CommonTree NL319_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_p_arith_expr=new RewriteRuleSubtreeStream(adaptor,"rule p_arith_expr");
        RewriteRuleSubtreeStream stream_rel_op=new RewriteRuleSubtreeStream(adaptor,"rule rel_op");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:582:2: ( p_arith_expr ( ( NL )? rel_op ( NL )? p_arith_expr )* -> ^( COMPARE p_arith_expr ( rel_op p_arith_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:582:4: p_arith_expr ( ( NL )? rel_op ( NL )? p_arith_expr )*
            {
            pushFollow(FOLLOW_p_arith_expr_in_p_rel_expr3613);
            p_arith_expr316=p_arith_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_p_arith_expr.add(p_arith_expr316.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:582:17: ( ( NL )? rel_op ( NL )? p_arith_expr )*
            loop144:
            do {
                int alt144=2;
                int LA144_0 = input.LA(1);

                if ( (LA144_0==NL) ) {
                    int LA144_1 = input.LA(2);

                    if ( ((LA144_1>=A_EQUAL && LA144_1<=UNRELATED)) ) {
                        alt144=1;
                    }


                }
                else if ( ((LA144_0>=A_EQUAL && LA144_0<=UNRELATED)) ) {
                    alt144=1;
                }


                switch (alt144) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:582:18: ( NL )? rel_op ( NL )? p_arith_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:582:18: ( NL )?
            	    int alt142=2;
            	    int LA142_0 = input.LA(1);

            	    if ( (LA142_0==NL) ) {
            	        alt142=1;
            	    }
            	    switch (alt142) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:582:18: NL
            	            {
            	            NL317=(Token)match(input,NL,FOLLOW_NL_in_p_rel_expr3616); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL317);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_rel_op_in_p_rel_expr3619);
            	    rel_op318=rel_op();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_rel_op.add(rel_op318.getTree());
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:582:29: ( NL )?
            	    int alt143=2;
            	    int LA143_0 = input.LA(1);

            	    if ( (LA143_0==NL) ) {
            	        alt143=1;
            	    }
            	    switch (alt143) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:582:29: NL
            	            {
            	            NL319=(Token)match(input,NL,FOLLOW_NL_in_p_rel_expr3621); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL319);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_arith_expr_in_p_rel_expr3624);
            	    p_arith_expr320=p_arith_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_p_arith_expr.add(p_arith_expr320.getTree());

            	    }
            	    break;

            	default :
            	    break loop144;
                }
            } while (true);



            // AST REWRITE
            // elements: rel_op, p_arith_expr, p_arith_expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 582:48: -> ^( COMPARE p_arith_expr ( rel_op p_arith_expr )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:582:51: ^( COMPARE p_arith_expr ( rel_op p_arith_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COMPARE, "COMPARE"), root_1);

                adaptor.addChild(root_1, stream_p_arith_expr.nextTree());
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:582:74: ( rel_op p_arith_expr )*
                while ( stream_rel_op.hasNext()||stream_p_arith_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_rel_op.nextTree());
                    adaptor.addChild(root_1, stream_p_arith_expr.nextTree());

                }
                stream_rel_op.reset();
                stream_p_arith_expr.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "p_rel_expr"

    public static class rel_op_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rel_op"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:585:1: rel_op : ( token_EQUAL | token_NOT_EQUAL | UNRELATED | GREATER | token_GREATER_EQ | LESS | token_LESS_EQ );
    public final babel17Parser.rel_op_return rel_op() throws RecognitionException {
        babel17Parser.rel_op_return retval = new babel17Parser.rel_op_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token UNRELATED323=null;
        Token GREATER324=null;
        Token LESS326=null;
        babel17Parser.token_EQUAL_return token_EQUAL321 = null;

        babel17Parser.token_NOT_EQUAL_return token_NOT_EQUAL322 = null;

        babel17Parser.token_GREATER_EQ_return token_GREATER_EQ325 = null;

        babel17Parser.token_LESS_EQ_return token_LESS_EQ327 = null;


        CommonTree UNRELATED323_tree=null;
        CommonTree GREATER324_tree=null;
        CommonTree LESS326_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:585:8: ( token_EQUAL | token_NOT_EQUAL | UNRELATED | GREATER | token_GREATER_EQ | LESS | token_LESS_EQ )
            int alt145=7;
            switch ( input.LA(1) ) {
            case A_EQUAL:
            case U_EQUAL:
                {
                alt145=1;
                }
                break;
            case A_NOT_EQUAL:
            case U_NOT_EQUAL:
                {
                alt145=2;
                }
                break;
            case UNRELATED:
                {
                alt145=3;
                }
                break;
            case GREATER:
                {
                alt145=4;
                }
                break;
            case A_GREATER_EQ:
            case U_GREATER_EQ:
                {
                alt145=5;
                }
                break;
            case LESS:
                {
                alt145=6;
                }
                break;
            case A_LESS_EQ:
            case U_LESS_EQ:
                {
                alt145=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 145, 0, input);

                throw nvae;
            }

            switch (alt145) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:585:10: token_EQUAL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_EQUAL_in_rel_op3650);
                    token_EQUAL321=token_EQUAL();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, token_EQUAL321.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:585:24: token_NOT_EQUAL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_NOT_EQUAL_in_rel_op3654);
                    token_NOT_EQUAL322=token_NOT_EQUAL();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, token_NOT_EQUAL322.getTree());

                    }
                    break;
                case 3 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:585:42: UNRELATED
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    UNRELATED323=(Token)match(input,UNRELATED,FOLLOW_UNRELATED_in_rel_op3658); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UNRELATED323_tree = (CommonTree)adaptor.create(UNRELATED323);
                    adaptor.addChild(root_0, UNRELATED323_tree);
                    }

                    }
                    break;
                case 4 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:585:54: GREATER
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    GREATER324=(Token)match(input,GREATER,FOLLOW_GREATER_in_rel_op3662); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    GREATER324_tree = (CommonTree)adaptor.create(GREATER324);
                    adaptor.addChild(root_0, GREATER324_tree);
                    }

                    }
                    break;
                case 5 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:585:64: token_GREATER_EQ
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_GREATER_EQ_in_rel_op3666);
                    token_GREATER_EQ325=token_GREATER_EQ();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, token_GREATER_EQ325.getTree());

                    }
                    break;
                case 6 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:585:83: LESS
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    LESS326=(Token)match(input,LESS,FOLLOW_LESS_in_rel_op3670); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LESS326_tree = (CommonTree)adaptor.create(LESS326);
                    adaptor.addChild(root_0, LESS326_tree);
                    }

                    }
                    break;
                case 7 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:585:90: token_LESS_EQ
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_LESS_EQ_in_rel_op3674);
                    token_LESS_EQ327=token_LESS_EQ();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, token_LESS_EQ327.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "rel_op"

    public static class arith_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arith_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:588:1: arith_expr : plusplus_expr ;
    public final babel17Parser.arith_expr_return arith_expr() throws RecognitionException {
        babel17Parser.arith_expr_return retval = new babel17Parser.arith_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.plusplus_expr_return plusplus_expr328 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:589:2: ( plusplus_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:589:4: plusplus_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_plusplus_expr_in_arith_expr3686);
            plusplus_expr328=plusplus_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, plusplus_expr328.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "arith_expr"

    public static class p_arith_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "p_arith_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:592:1: p_arith_expr : p_plusplus_expr ;
    public final babel17Parser.p_arith_expr_return p_arith_expr() throws RecognitionException {
        babel17Parser.p_arith_expr_return retval = new babel17Parser.p_arith_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.p_plusplus_expr_return p_plusplus_expr329 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:593:2: ( p_plusplus_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:593:4: p_plusplus_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_plusplus_expr_in_p_arith_expr3696);
            p_plusplus_expr329=p_plusplus_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_plusplus_expr329.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "p_arith_expr"

    public static class plusplus_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "plusplus_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:595:1: plusplus_expr : timestimes_expr ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? timestimes_expr )* ;
    public final babel17Parser.plusplus_expr_return plusplus_expr() throws RecognitionException {
        babel17Parser.plusplus_expr_return retval = new babel17Parser.plusplus_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL331=null;
        Token PLUSPLUS332=null;
        Token MINUSMINUS333=null;
        Token NL334=null;
        babel17Parser.timestimes_expr_return timestimes_expr330 = null;

        babel17Parser.timestimes_expr_return timestimes_expr335 = null;


        CommonTree NL331_tree=null;
        CommonTree PLUSPLUS332_tree=null;
        CommonTree MINUSMINUS333_tree=null;
        CommonTree NL334_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:596:2: ( timestimes_expr ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? timestimes_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:596:4: timestimes_expr ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? timestimes_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_timestimes_expr_in_plusplus_expr3706);
            timestimes_expr330=timestimes_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, timestimes_expr330.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:596:20: ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? timestimes_expr )*
            loop149:
            do {
                int alt149=2;
                int LA149_0 = input.LA(1);

                if ( (LA149_0==NL) ) {
                    int LA149_1 = input.LA(2);

                    if ( ((LA149_1>=PLUSPLUS && LA149_1<=MINUSMINUS)) ) {
                        alt149=1;
                    }


                }
                else if ( ((LA149_0>=PLUSPLUS && LA149_0<=MINUSMINUS)) ) {
                    alt149=1;
                }


                switch (alt149) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:596:21: ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? timestimes_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:596:23: ( NL )?
            	    int alt146=2;
            	    int LA146_0 = input.LA(1);

            	    if ( (LA146_0==NL) ) {
            	        alt146=1;
            	    }
            	    switch (alt146) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:596:23: NL
            	            {
            	            NL331=(Token)match(input,NL,FOLLOW_NL_in_plusplus_expr3709); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:596:26: ( PLUSPLUS | MINUSMINUS )
            	    int alt147=2;
            	    int LA147_0 = input.LA(1);

            	    if ( (LA147_0==PLUSPLUS) ) {
            	        alt147=1;
            	    }
            	    else if ( (LA147_0==MINUSMINUS) ) {
            	        alt147=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 147, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt147) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:596:27: PLUSPLUS
            	            {
            	            PLUSPLUS332=(Token)match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_plusplus_expr3714); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PLUSPLUS332_tree = (CommonTree)adaptor.create(PLUSPLUS332);
            	            root_0 = (CommonTree)adaptor.becomeRoot(PLUSPLUS332_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:596:37: MINUSMINUS
            	            {
            	            MINUSMINUS333=(Token)match(input,MINUSMINUS,FOLLOW_MINUSMINUS_in_plusplus_expr3717); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            MINUSMINUS333_tree = (CommonTree)adaptor.create(MINUSMINUS333);
            	            root_0 = (CommonTree)adaptor.becomeRoot(MINUSMINUS333_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:596:52: ( NL )?
            	    int alt148=2;
            	    int LA148_0 = input.LA(1);

            	    if ( (LA148_0==NL) ) {
            	        alt148=1;
            	    }
            	    switch (alt148) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:596:52: NL
            	            {
            	            NL334=(Token)match(input,NL,FOLLOW_NL_in_plusplus_expr3721); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_timestimes_expr_in_plusplus_expr3725);
            	    timestimes_expr335=timestimes_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, timestimes_expr335.getTree());

            	    }
            	    break;

            	default :
            	    break loop149;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "plusplus_expr"

    public static class p_plusplus_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "p_plusplus_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:598:1: p_plusplus_expr : p_timestimes_expr ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? p_timestimes_expr )* ;
    public final babel17Parser.p_plusplus_expr_return p_plusplus_expr() throws RecognitionException {
        babel17Parser.p_plusplus_expr_return retval = new babel17Parser.p_plusplus_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL337=null;
        Token PLUSPLUS338=null;
        Token MINUSMINUS339=null;
        Token NL340=null;
        babel17Parser.p_timestimes_expr_return p_timestimes_expr336 = null;

        babel17Parser.p_timestimes_expr_return p_timestimes_expr341 = null;


        CommonTree NL337_tree=null;
        CommonTree PLUSPLUS338_tree=null;
        CommonTree MINUSMINUS339_tree=null;
        CommonTree NL340_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:599:2: ( p_timestimes_expr ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? p_timestimes_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:599:4: p_timestimes_expr ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? p_timestimes_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_timestimes_expr_in_p_plusplus_expr3737);
            p_timestimes_expr336=p_timestimes_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_timestimes_expr336.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:599:22: ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? p_timestimes_expr )*
            loop153:
            do {
                int alt153=2;
                int LA153_0 = input.LA(1);

                if ( (LA153_0==NL) ) {
                    int LA153_1 = input.LA(2);

                    if ( ((LA153_1>=PLUSPLUS && LA153_1<=MINUSMINUS)) ) {
                        alt153=1;
                    }


                }
                else if ( ((LA153_0>=PLUSPLUS && LA153_0<=MINUSMINUS)) ) {
                    alt153=1;
                }


                switch (alt153) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:599:23: ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? p_timestimes_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:599:25: ( NL )?
            	    int alt150=2;
            	    int LA150_0 = input.LA(1);

            	    if ( (LA150_0==NL) ) {
            	        alt150=1;
            	    }
            	    switch (alt150) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:599:25: NL
            	            {
            	            NL337=(Token)match(input,NL,FOLLOW_NL_in_p_plusplus_expr3740); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:599:28: ( PLUSPLUS | MINUSMINUS )
            	    int alt151=2;
            	    int LA151_0 = input.LA(1);

            	    if ( (LA151_0==PLUSPLUS) ) {
            	        alt151=1;
            	    }
            	    else if ( (LA151_0==MINUSMINUS) ) {
            	        alt151=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 151, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt151) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:599:29: PLUSPLUS
            	            {
            	            PLUSPLUS338=(Token)match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_p_plusplus_expr3745); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PLUSPLUS338_tree = (CommonTree)adaptor.create(PLUSPLUS338);
            	            root_0 = (CommonTree)adaptor.becomeRoot(PLUSPLUS338_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:599:39: MINUSMINUS
            	            {
            	            MINUSMINUS339=(Token)match(input,MINUSMINUS,FOLLOW_MINUSMINUS_in_p_plusplus_expr3748); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            MINUSMINUS339_tree = (CommonTree)adaptor.create(MINUSMINUS339);
            	            root_0 = (CommonTree)adaptor.becomeRoot(MINUSMINUS339_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:599:54: ( NL )?
            	    int alt152=2;
            	    int LA152_0 = input.LA(1);

            	    if ( (LA152_0==NL) ) {
            	        alt152=1;
            	    }
            	    switch (alt152) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:599:54: NL
            	            {
            	            NL340=(Token)match(input,NL,FOLLOW_NL_in_p_plusplus_expr3752); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_timestimes_expr_in_p_plusplus_expr3756);
            	    p_timestimes_expr341=p_timestimes_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_timestimes_expr341.getTree());

            	    }
            	    break;

            	default :
            	    break loop153;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "p_plusplus_expr"

    public static class timestimes_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "timestimes_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:602:1: timestimes_expr : simple_expr ( ( NL )? ( TIMESTIMES ) ( NL )? simple_expr )* ;
    public final babel17Parser.timestimes_expr_return timestimes_expr() throws RecognitionException {
        babel17Parser.timestimes_expr_return retval = new babel17Parser.timestimes_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL343=null;
        Token TIMESTIMES344=null;
        Token NL345=null;
        babel17Parser.simple_expr_return simple_expr342 = null;

        babel17Parser.simple_expr_return simple_expr346 = null;


        CommonTree NL343_tree=null;
        CommonTree TIMESTIMES344_tree=null;
        CommonTree NL345_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:603:2: ( simple_expr ( ( NL )? ( TIMESTIMES ) ( NL )? simple_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:603:4: simple_expr ( ( NL )? ( TIMESTIMES ) ( NL )? simple_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_simple_expr_in_timestimes_expr3768);
            simple_expr342=simple_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, simple_expr342.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:603:16: ( ( NL )? ( TIMESTIMES ) ( NL )? simple_expr )*
            loop156:
            do {
                int alt156=2;
                int LA156_0 = input.LA(1);

                if ( (LA156_0==NL) ) {
                    int LA156_1 = input.LA(2);

                    if ( (LA156_1==TIMESTIMES) ) {
                        alt156=1;
                    }


                }
                else if ( (LA156_0==TIMESTIMES) ) {
                    alt156=1;
                }


                switch (alt156) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:603:17: ( NL )? ( TIMESTIMES ) ( NL )? simple_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:603:19: ( NL )?
            	    int alt154=2;
            	    int LA154_0 = input.LA(1);

            	    if ( (LA154_0==NL) ) {
            	        alt154=1;
            	    }
            	    switch (alt154) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:603:19: NL
            	            {
            	            NL343=(Token)match(input,NL,FOLLOW_NL_in_timestimes_expr3771); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:603:22: ( TIMESTIMES )
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:603:23: TIMESTIMES
            	    {
            	    TIMESTIMES344=(Token)match(input,TIMESTIMES,FOLLOW_TIMESTIMES_in_timestimes_expr3776); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    TIMESTIMES344_tree = (CommonTree)adaptor.create(TIMESTIMES344);
            	    root_0 = (CommonTree)adaptor.becomeRoot(TIMESTIMES344_tree, root_0);
            	    }

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:603:38: ( NL )?
            	    int alt155=2;
            	    int LA155_0 = input.LA(1);

            	    if ( (LA155_0==NL) ) {
            	        alt155=1;
            	    }
            	    switch (alt155) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:603:38: NL
            	            {
            	            NL345=(Token)match(input,NL,FOLLOW_NL_in_timestimes_expr3780); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_simple_expr_in_timestimes_expr3784);
            	    simple_expr346=simple_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, simple_expr346.getTree());

            	    }
            	    break;

            	default :
            	    break loop156;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "timestimes_expr"

    public static class p_timestimes_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "p_timestimes_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:605:1: p_timestimes_expr : p_simple_expr ( ( NL )? ( TIMESTIMES ) ( NL )? p_simple_expr )* ;
    public final babel17Parser.p_timestimes_expr_return p_timestimes_expr() throws RecognitionException {
        babel17Parser.p_timestimes_expr_return retval = new babel17Parser.p_timestimes_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL348=null;
        Token TIMESTIMES349=null;
        Token NL350=null;
        babel17Parser.p_simple_expr_return p_simple_expr347 = null;

        babel17Parser.p_simple_expr_return p_simple_expr351 = null;


        CommonTree NL348_tree=null;
        CommonTree TIMESTIMES349_tree=null;
        CommonTree NL350_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:606:2: ( p_simple_expr ( ( NL )? ( TIMESTIMES ) ( NL )? p_simple_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:606:4: p_simple_expr ( ( NL )? ( TIMESTIMES ) ( NL )? p_simple_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_simple_expr_in_p_timestimes_expr3797);
            p_simple_expr347=p_simple_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_simple_expr347.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:606:18: ( ( NL )? ( TIMESTIMES ) ( NL )? p_simple_expr )*
            loop159:
            do {
                int alt159=2;
                int LA159_0 = input.LA(1);

                if ( (LA159_0==NL) ) {
                    int LA159_1 = input.LA(2);

                    if ( (LA159_1==TIMESTIMES) ) {
                        alt159=1;
                    }


                }
                else if ( (LA159_0==TIMESTIMES) ) {
                    alt159=1;
                }


                switch (alt159) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:606:19: ( NL )? ( TIMESTIMES ) ( NL )? p_simple_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:606:21: ( NL )?
            	    int alt157=2;
            	    int LA157_0 = input.LA(1);

            	    if ( (LA157_0==NL) ) {
            	        alt157=1;
            	    }
            	    switch (alt157) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:606:21: NL
            	            {
            	            NL348=(Token)match(input,NL,FOLLOW_NL_in_p_timestimes_expr3800); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:606:24: ( TIMESTIMES )
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:606:25: TIMESTIMES
            	    {
            	    TIMESTIMES349=(Token)match(input,TIMESTIMES,FOLLOW_TIMESTIMES_in_p_timestimes_expr3805); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    TIMESTIMES349_tree = (CommonTree)adaptor.create(TIMESTIMES349);
            	    root_0 = (CommonTree)adaptor.becomeRoot(TIMESTIMES349_tree, root_0);
            	    }

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:606:40: ( NL )?
            	    int alt158=2;
            	    int LA158_0 = input.LA(1);

            	    if ( (LA158_0==NL) ) {
            	        alt158=1;
            	    }
            	    switch (alt158) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:606:40: NL
            	            {
            	            NL350=(Token)match(input,NL,FOLLOW_NL_in_p_timestimes_expr3809); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_simple_expr_in_p_timestimes_expr3813);
            	    p_simple_expr351=p_simple_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_simple_expr351.getTree());

            	    }
            	    break;

            	default :
            	    break loop159;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "p_timestimes_expr"

    public static class simple_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "simple_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:608:1: simple_expr : cons_expr ;
    public final babel17Parser.simple_expr_return simple_expr() throws RecognitionException {
        babel17Parser.simple_expr_return retval = new babel17Parser.simple_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.cons_expr_return cons_expr352 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:609:2: ( cons_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:609:4: cons_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_cons_expr_in_simple_expr3824);
            cons_expr352=cons_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, cons_expr352.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "simple_expr"

    public static class p_simple_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "p_simple_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:611:1: p_simple_expr : p_cons_expr ;
    public final babel17Parser.p_simple_expr_return p_simple_expr() throws RecognitionException {
        babel17Parser.p_simple_expr_return retval = new babel17Parser.p_simple_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.p_cons_expr_return p_cons_expr353 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:612:2: ( p_cons_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:612:4: p_cons_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_cons_expr_in_p_simple_expr3833);
            p_cons_expr353=p_cons_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_cons_expr353.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "p_simple_expr"

    public static class cons_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "cons_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:614:1: cons_expr : to_expr ( ( NL )? token_DOUBLE_COLON ( NL )? to_expr )* -> ^( LIST_CONS ( to_expr )* ) ;
    public final babel17Parser.cons_expr_return cons_expr() throws RecognitionException {
        babel17Parser.cons_expr_return retval = new babel17Parser.cons_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL355=null;
        Token NL357=null;
        babel17Parser.to_expr_return to_expr354 = null;

        babel17Parser.token_DOUBLE_COLON_return token_DOUBLE_COLON356 = null;

        babel17Parser.to_expr_return to_expr358 = null;


        CommonTree NL355_tree=null;
        CommonTree NL357_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_token_DOUBLE_COLON=new RewriteRuleSubtreeStream(adaptor,"rule token_DOUBLE_COLON");
        RewriteRuleSubtreeStream stream_to_expr=new RewriteRuleSubtreeStream(adaptor,"rule to_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:615:2: ( to_expr ( ( NL )? token_DOUBLE_COLON ( NL )? to_expr )* -> ^( LIST_CONS ( to_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:615:4: to_expr ( ( NL )? token_DOUBLE_COLON ( NL )? to_expr )*
            {
            pushFollow(FOLLOW_to_expr_in_cons_expr3842);
            to_expr354=to_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_to_expr.add(to_expr354.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:615:12: ( ( NL )? token_DOUBLE_COLON ( NL )? to_expr )*
            loop162:
            do {
                int alt162=2;
                int LA162_0 = input.LA(1);

                if ( (LA162_0==NL) ) {
                    int LA162_1 = input.LA(2);

                    if ( ((LA162_1>=A_DOUBLE_COLON && LA162_1<=U_DOUBLE_COLON)) ) {
                        alt162=1;
                    }


                }
                else if ( ((LA162_0>=A_DOUBLE_COLON && LA162_0<=U_DOUBLE_COLON)) ) {
                    alt162=1;
                }


                switch (alt162) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:615:13: ( NL )? token_DOUBLE_COLON ( NL )? to_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:615:13: ( NL )?
            	    int alt160=2;
            	    int LA160_0 = input.LA(1);

            	    if ( (LA160_0==NL) ) {
            	        alt160=1;
            	    }
            	    switch (alt160) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:615:13: NL
            	            {
            	            NL355=(Token)match(input,NL,FOLLOW_NL_in_cons_expr3845); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL355);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_token_DOUBLE_COLON_in_cons_expr3848);
            	    token_DOUBLE_COLON356=token_DOUBLE_COLON();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_token_DOUBLE_COLON.add(token_DOUBLE_COLON356.getTree());
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:615:36: ( NL )?
            	    int alt161=2;
            	    int LA161_0 = input.LA(1);

            	    if ( (LA161_0==NL) ) {
            	        alt161=1;
            	    }
            	    switch (alt161) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:615:36: NL
            	            {
            	            NL357=(Token)match(input,NL,FOLLOW_NL_in_cons_expr3850); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL357);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_to_expr_in_cons_expr3853);
            	    to_expr358=to_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_to_expr.add(to_expr358.getTree());

            	    }
            	    break;

            	default :
            	    break loop162;
                }
            } while (true);



            // AST REWRITE
            // elements: to_expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 615:50: -> ^( LIST_CONS ( to_expr )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:615:53: ^( LIST_CONS ( to_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LIST_CONS, "LIST_CONS"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:615:65: ( to_expr )*
                while ( stream_to_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_to_expr.nextTree());

                }
                stream_to_expr.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "cons_expr"

    public static class p_cons_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "p_cons_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:617:1: p_cons_expr : p_to_expr ( ( NL )? token_DOUBLE_COLON ( NL )? p_to_expr )* -> ^( LIST_CONS ( p_to_expr )* ) ;
    public final babel17Parser.p_cons_expr_return p_cons_expr() throws RecognitionException {
        babel17Parser.p_cons_expr_return retval = new babel17Parser.p_cons_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL360=null;
        Token NL362=null;
        babel17Parser.p_to_expr_return p_to_expr359 = null;

        babel17Parser.token_DOUBLE_COLON_return token_DOUBLE_COLON361 = null;

        babel17Parser.p_to_expr_return p_to_expr363 = null;


        CommonTree NL360_tree=null;
        CommonTree NL362_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_p_to_expr=new RewriteRuleSubtreeStream(adaptor,"rule p_to_expr");
        RewriteRuleSubtreeStream stream_token_DOUBLE_COLON=new RewriteRuleSubtreeStream(adaptor,"rule token_DOUBLE_COLON");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:618:2: ( p_to_expr ( ( NL )? token_DOUBLE_COLON ( NL )? p_to_expr )* -> ^( LIST_CONS ( p_to_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:618:4: p_to_expr ( ( NL )? token_DOUBLE_COLON ( NL )? p_to_expr )*
            {
            pushFollow(FOLLOW_p_to_expr_in_p_cons_expr3873);
            p_to_expr359=p_to_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_p_to_expr.add(p_to_expr359.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:618:14: ( ( NL )? token_DOUBLE_COLON ( NL )? p_to_expr )*
            loop165:
            do {
                int alt165=2;
                int LA165_0 = input.LA(1);

                if ( (LA165_0==NL) ) {
                    int LA165_1 = input.LA(2);

                    if ( ((LA165_1>=A_DOUBLE_COLON && LA165_1<=U_DOUBLE_COLON)) ) {
                        alt165=1;
                    }


                }
                else if ( ((LA165_0>=A_DOUBLE_COLON && LA165_0<=U_DOUBLE_COLON)) ) {
                    alt165=1;
                }


                switch (alt165) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:618:15: ( NL )? token_DOUBLE_COLON ( NL )? p_to_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:618:15: ( NL )?
            	    int alt163=2;
            	    int LA163_0 = input.LA(1);

            	    if ( (LA163_0==NL) ) {
            	        alt163=1;
            	    }
            	    switch (alt163) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:618:15: NL
            	            {
            	            NL360=(Token)match(input,NL,FOLLOW_NL_in_p_cons_expr3876); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL360);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_token_DOUBLE_COLON_in_p_cons_expr3879);
            	    token_DOUBLE_COLON361=token_DOUBLE_COLON();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_token_DOUBLE_COLON.add(token_DOUBLE_COLON361.getTree());
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:618:38: ( NL )?
            	    int alt164=2;
            	    int LA164_0 = input.LA(1);

            	    if ( (LA164_0==NL) ) {
            	        alt164=1;
            	    }
            	    switch (alt164) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:618:38: NL
            	            {
            	            NL362=(Token)match(input,NL,FOLLOW_NL_in_p_cons_expr3881); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL362);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_to_expr_in_p_cons_expr3884);
            	    p_to_expr363=p_to_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_p_to_expr.add(p_to_expr363.getTree());

            	    }
            	    break;

            	default :
            	    break loop165;
                }
            } while (true);



            // AST REWRITE
            // elements: p_to_expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 618:54: -> ^( LIST_CONS ( p_to_expr )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:618:57: ^( LIST_CONS ( p_to_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LIST_CONS, "LIST_CONS"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:618:69: ( p_to_expr )*
                while ( stream_p_to_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_p_to_expr.nextTree());

                }
                stream_p_to_expr.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "p_cons_expr"

    public static class to_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "to_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:621:1: to_expr : arith_plus_expr ( ( NL )? ( L_to | L_downto ) ( NL )? arith_plus_expr )? ;
    public final babel17Parser.to_expr_return to_expr() throws RecognitionException {
        babel17Parser.to_expr_return retval = new babel17Parser.to_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL365=null;
        Token L_to366=null;
        Token L_downto367=null;
        Token NL368=null;
        babel17Parser.arith_plus_expr_return arith_plus_expr364 = null;

        babel17Parser.arith_plus_expr_return arith_plus_expr369 = null;


        CommonTree NL365_tree=null;
        CommonTree L_to366_tree=null;
        CommonTree L_downto367_tree=null;
        CommonTree NL368_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:621:9: ( arith_plus_expr ( ( NL )? ( L_to | L_downto ) ( NL )? arith_plus_expr )? )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:621:11: arith_plus_expr ( ( NL )? ( L_to | L_downto ) ( NL )? arith_plus_expr )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_arith_plus_expr_in_to_expr3904);
            arith_plus_expr364=arith_plus_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, arith_plus_expr364.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:621:27: ( ( NL )? ( L_to | L_downto ) ( NL )? arith_plus_expr )?
            int alt169=2;
            int LA169_0 = input.LA(1);

            if ( (LA169_0==NL) ) {
                int LA169_1 = input.LA(2);

                if ( ((LA169_1>=L_to && LA169_1<=L_downto)) ) {
                    alt169=1;
                }
            }
            else if ( ((LA169_0>=L_to && LA169_0<=L_downto)) ) {
                alt169=1;
            }
            switch (alt169) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:621:28: ( NL )? ( L_to | L_downto ) ( NL )? arith_plus_expr
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:621:30: ( NL )?
                    int alt166=2;
                    int LA166_0 = input.LA(1);

                    if ( (LA166_0==NL) ) {
                        alt166=1;
                    }
                    switch (alt166) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:621:30: NL
                            {
                            NL365=(Token)match(input,NL,FOLLOW_NL_in_to_expr3907); if (state.failed) return retval;

                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:621:33: ( L_to | L_downto )
                    int alt167=2;
                    int LA167_0 = input.LA(1);

                    if ( (LA167_0==L_to) ) {
                        alt167=1;
                    }
                    else if ( (LA167_0==L_downto) ) {
                        alt167=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 167, 0, input);

                        throw nvae;
                    }
                    switch (alt167) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:621:34: L_to
                            {
                            L_to366=(Token)match(input,L_to,FOLLOW_L_to_in_to_expr3912); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            L_to366_tree = (CommonTree)adaptor.create(L_to366);
                            root_0 = (CommonTree)adaptor.becomeRoot(L_to366_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:621:41: L_downto
                            {
                            L_downto367=(Token)match(input,L_downto,FOLLOW_L_downto_in_to_expr3916); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            L_downto367_tree = (CommonTree)adaptor.create(L_downto367);
                            root_0 = (CommonTree)adaptor.becomeRoot(L_downto367_tree, root_0);
                            }

                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:621:54: ( NL )?
                    int alt168=2;
                    int LA168_0 = input.LA(1);

                    if ( (LA168_0==NL) ) {
                        alt168=1;
                    }
                    switch (alt168) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:621:54: NL
                            {
                            NL368=(Token)match(input,NL,FOLLOW_NL_in_to_expr3920); if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_arith_plus_expr_in_to_expr3924);
                    arith_plus_expr369=arith_plus_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arith_plus_expr369.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "to_expr"

    public static class p_to_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "p_to_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:623:1: p_to_expr : p_arith_plus_expr ( ( NL )? ( L_to | L_downto ) ( NL )? p_arith_plus_expr )? ;
    public final babel17Parser.p_to_expr_return p_to_expr() throws RecognitionException {
        babel17Parser.p_to_expr_return retval = new babel17Parser.p_to_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL371=null;
        Token L_to372=null;
        Token L_downto373=null;
        Token NL374=null;
        babel17Parser.p_arith_plus_expr_return p_arith_plus_expr370 = null;

        babel17Parser.p_arith_plus_expr_return p_arith_plus_expr375 = null;


        CommonTree NL371_tree=null;
        CommonTree L_to372_tree=null;
        CommonTree L_downto373_tree=null;
        CommonTree NL374_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:624:2: ( p_arith_plus_expr ( ( NL )? ( L_to | L_downto ) ( NL )? p_arith_plus_expr )? )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:624:4: p_arith_plus_expr ( ( NL )? ( L_to | L_downto ) ( NL )? p_arith_plus_expr )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_arith_plus_expr_in_p_to_expr3937);
            p_arith_plus_expr370=p_arith_plus_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_arith_plus_expr370.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:624:22: ( ( NL )? ( L_to | L_downto ) ( NL )? p_arith_plus_expr )?
            int alt173=2;
            int LA173_0 = input.LA(1);

            if ( (LA173_0==NL) ) {
                int LA173_1 = input.LA(2);

                if ( ((LA173_1>=L_to && LA173_1<=L_downto)) ) {
                    alt173=1;
                }
            }
            else if ( ((LA173_0>=L_to && LA173_0<=L_downto)) ) {
                alt173=1;
            }
            switch (alt173) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:624:23: ( NL )? ( L_to | L_downto ) ( NL )? p_arith_plus_expr
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:624:25: ( NL )?
                    int alt170=2;
                    int LA170_0 = input.LA(1);

                    if ( (LA170_0==NL) ) {
                        alt170=1;
                    }
                    switch (alt170) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:624:25: NL
                            {
                            NL371=(Token)match(input,NL,FOLLOW_NL_in_p_to_expr3940); if (state.failed) return retval;

                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:624:28: ( L_to | L_downto )
                    int alt171=2;
                    int LA171_0 = input.LA(1);

                    if ( (LA171_0==L_to) ) {
                        alt171=1;
                    }
                    else if ( (LA171_0==L_downto) ) {
                        alt171=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 171, 0, input);

                        throw nvae;
                    }
                    switch (alt171) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:624:29: L_to
                            {
                            L_to372=(Token)match(input,L_to,FOLLOW_L_to_in_p_to_expr3945); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            L_to372_tree = (CommonTree)adaptor.create(L_to372);
                            root_0 = (CommonTree)adaptor.becomeRoot(L_to372_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:624:36: L_downto
                            {
                            L_downto373=(Token)match(input,L_downto,FOLLOW_L_downto_in_p_to_expr3949); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            L_downto373_tree = (CommonTree)adaptor.create(L_downto373);
                            root_0 = (CommonTree)adaptor.becomeRoot(L_downto373_tree, root_0);
                            }

                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:624:49: ( NL )?
                    int alt172=2;
                    int LA172_0 = input.LA(1);

                    if ( (LA172_0==NL) ) {
                        alt172=1;
                    }
                    switch (alt172) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:624:49: NL
                            {
                            NL374=(Token)match(input,NL,FOLLOW_NL_in_p_to_expr3953); if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_p_arith_plus_expr_in_p_to_expr3957);
                    p_arith_plus_expr375=p_arith_plus_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_arith_plus_expr375.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "p_to_expr"

    public static class arith_plus_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arith_plus_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:626:1: arith_plus_expr : arith_uminus_expr ( ( ( NL )? PLUS | MINUS ) ( NL )? arith_uminus_expr )* ;
    public final babel17Parser.arith_plus_expr_return arith_plus_expr() throws RecognitionException {
        babel17Parser.arith_plus_expr_return retval = new babel17Parser.arith_plus_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL377=null;
        Token PLUS378=null;
        Token MINUS379=null;
        Token NL380=null;
        babel17Parser.arith_uminus_expr_return arith_uminus_expr376 = null;

        babel17Parser.arith_uminus_expr_return arith_uminus_expr381 = null;


        CommonTree NL377_tree=null;
        CommonTree PLUS378_tree=null;
        CommonTree MINUS379_tree=null;
        CommonTree NL380_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:627:2: ( arith_uminus_expr ( ( ( NL )? PLUS | MINUS ) ( NL )? arith_uminus_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:627:4: arith_uminus_expr ( ( ( NL )? PLUS | MINUS ) ( NL )? arith_uminus_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_arith_uminus_expr_in_arith_plus_expr3969);
            arith_uminus_expr376=arith_uminus_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, arith_uminus_expr376.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:627:22: ( ( ( NL )? PLUS | MINUS ) ( NL )? arith_uminus_expr )*
            loop177:
            do {
                int alt177=2;
                int LA177_0 = input.LA(1);

                if ( (LA177_0==NL) ) {
                    int LA177_1 = input.LA(2);

                    if ( (LA177_1==PLUS) ) {
                        alt177=1;
                    }


                }
                else if ( ((LA177_0>=PLUS && LA177_0<=MINUS)) ) {
                    alt177=1;
                }


                switch (alt177) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:627:23: ( ( NL )? PLUS | MINUS ) ( NL )? arith_uminus_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:627:23: ( ( NL )? PLUS | MINUS )
            	    int alt175=2;
            	    int LA175_0 = input.LA(1);

            	    if ( (LA175_0==PLUS||LA175_0==NL) ) {
            	        alt175=1;
            	    }
            	    else if ( (LA175_0==MINUS) ) {
            	        alt175=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 175, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt175) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:627:24: ( NL )? PLUS
            	            {
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:627:26: ( NL )?
            	            int alt174=2;
            	            int LA174_0 = input.LA(1);

            	            if ( (LA174_0==NL) ) {
            	                alt174=1;
            	            }
            	            switch (alt174) {
            	                case 1 :
            	                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:627:26: NL
            	                    {
            	                    NL377=(Token)match(input,NL,FOLLOW_NL_in_arith_plus_expr3973); if (state.failed) return retval;

            	                    }
            	                    break;

            	            }

            	            PLUS378=(Token)match(input,PLUS,FOLLOW_PLUS_in_arith_plus_expr3977); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PLUS378_tree = (CommonTree)adaptor.create(PLUS378);
            	            root_0 = (CommonTree)adaptor.becomeRoot(PLUS378_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:627:37: MINUS
            	            {
            	            MINUS379=(Token)match(input,MINUS,FOLLOW_MINUS_in_arith_plus_expr3982); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            MINUS379_tree = (CommonTree)adaptor.create(MINUS379);
            	            root_0 = (CommonTree)adaptor.becomeRoot(MINUS379_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:627:47: ( NL )?
            	    int alt176=2;
            	    int LA176_0 = input.LA(1);

            	    if ( (LA176_0==NL) ) {
            	        alt176=1;
            	    }
            	    switch (alt176) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:627:47: NL
            	            {
            	            NL380=(Token)match(input,NL,FOLLOW_NL_in_arith_plus_expr3986); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_arith_uminus_expr_in_arith_plus_expr3990);
            	    arith_uminus_expr381=arith_uminus_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, arith_uminus_expr381.getTree());

            	    }
            	    break;

            	default :
            	    break loop177;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "arith_plus_expr"

    public static class p_arith_plus_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "p_arith_plus_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:629:1: p_arith_plus_expr : p_arith_uminus_expr ( ( NL )? ( PLUS | MINUS ) ( NL )? p_arith_uminus_expr )* ;
    public final babel17Parser.p_arith_plus_expr_return p_arith_plus_expr() throws RecognitionException {
        babel17Parser.p_arith_plus_expr_return retval = new babel17Parser.p_arith_plus_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL383=null;
        Token set384=null;
        Token NL385=null;
        babel17Parser.p_arith_uminus_expr_return p_arith_uminus_expr382 = null;

        babel17Parser.p_arith_uminus_expr_return p_arith_uminus_expr386 = null;


        CommonTree NL383_tree=null;
        CommonTree set384_tree=null;
        CommonTree NL385_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:630:2: ( p_arith_uminus_expr ( ( NL )? ( PLUS | MINUS ) ( NL )? p_arith_uminus_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:630:4: p_arith_uminus_expr ( ( NL )? ( PLUS | MINUS ) ( NL )? p_arith_uminus_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_arith_uminus_expr_in_p_arith_plus_expr4001);
            p_arith_uminus_expr382=p_arith_uminus_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_arith_uminus_expr382.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:630:24: ( ( NL )? ( PLUS | MINUS ) ( NL )? p_arith_uminus_expr )*
            loop180:
            do {
                int alt180=2;
                int LA180_0 = input.LA(1);

                if ( (LA180_0==NL) ) {
                    int LA180_1 = input.LA(2);

                    if ( ((LA180_1>=PLUS && LA180_1<=MINUS)) ) {
                        alt180=1;
                    }


                }
                else if ( ((LA180_0>=PLUS && LA180_0<=MINUS)) ) {
                    alt180=1;
                }


                switch (alt180) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:630:25: ( NL )? ( PLUS | MINUS ) ( NL )? p_arith_uminus_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:630:27: ( NL )?
            	    int alt178=2;
            	    int LA178_0 = input.LA(1);

            	    if ( (LA178_0==NL) ) {
            	        alt178=1;
            	    }
            	    switch (alt178) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:630:27: NL
            	            {
            	            NL383=(Token)match(input,NL,FOLLOW_NL_in_p_arith_plus_expr4004); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    set384=(Token)input.LT(1);
            	    set384=(Token)input.LT(1);
            	    if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set384), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:630:48: ( NL )?
            	    int alt179=2;
            	    int LA179_0 = input.LA(1);

            	    if ( (LA179_0==NL) ) {
            	        alt179=1;
            	    }
            	    switch (alt179) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:630:48: NL
            	            {
            	            NL385=(Token)match(input,NL,FOLLOW_NL_in_p_arith_plus_expr4017); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_arith_uminus_expr_in_p_arith_plus_expr4021);
            	    p_arith_uminus_expr386=p_arith_uminus_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_arith_uminus_expr386.getTree());

            	    }
            	    break;

            	default :
            	    break loop180;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "p_arith_plus_expr"

    public static class arith_uminus_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arith_uminus_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:632:1: arith_uminus_expr : ( MINUS ( NL )? arith_mult_expr -> ^( UMINUS arith_mult_expr ) | arith_mult_expr );
    public final babel17Parser.arith_uminus_expr_return arith_uminus_expr() throws RecognitionException {
        babel17Parser.arith_uminus_expr_return retval = new babel17Parser.arith_uminus_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token MINUS387=null;
        Token NL388=null;
        babel17Parser.arith_mult_expr_return arith_mult_expr389 = null;

        babel17Parser.arith_mult_expr_return arith_mult_expr390 = null;


        CommonTree MINUS387_tree=null;
        CommonTree NL388_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleSubtreeStream stream_arith_mult_expr=new RewriteRuleSubtreeStream(adaptor,"rule arith_mult_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:633:2: ( MINUS ( NL )? arith_mult_expr -> ^( UMINUS arith_mult_expr ) | arith_mult_expr )
            int alt182=2;
            int LA182_0 = input.LA(1);

            if ( (LA182_0==MINUS) ) {
                alt182=1;
            }
            else if ( (LA182_0==L_begin||(LA182_0>=L_with && LA182_0<=L_if)||(LA182_0>=L_while && LA182_0<=L_for)||LA182_0==L_match||(LA182_0>=A_infinity && LA182_0<=U_infinity)||LA182_0==L_root||(LA182_0>=L_true && LA182_0<=L_here)||LA182_0==MODULE_KEY||(LA182_0>=Constr && LA182_0<=Num)||(LA182_0>=String && LA182_0<=ROUND_BRACKET_OPEN)||LA182_0==SQUARE_BRACKET_OPEN||LA182_0==CURLY_BRACKET_OPEN) ) {
                alt182=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 182, 0, input);

                throw nvae;
            }
            switch (alt182) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:633:4: MINUS ( NL )? arith_mult_expr
                    {
                    MINUS387=(Token)match(input,MINUS,FOLLOW_MINUS_in_arith_uminus_expr4034); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(MINUS387);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:633:10: ( NL )?
                    int alt181=2;
                    int LA181_0 = input.LA(1);

                    if ( (LA181_0==NL) ) {
                        alt181=1;
                    }
                    switch (alt181) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:633:10: NL
                            {
                            NL388=(Token)match(input,NL,FOLLOW_NL_in_arith_uminus_expr4036); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL388);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_arith_mult_expr_in_arith_uminus_expr4039);
                    arith_mult_expr389=arith_mult_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_arith_mult_expr.add(arith_mult_expr389.getTree());


                    // AST REWRITE
                    // elements: arith_mult_expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 633:30: -> ^( UMINUS arith_mult_expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:633:33: ^( UMINUS arith_mult_expr )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(UMINUS, "UMINUS"), root_1);

                        adaptor.addChild(root_1, stream_arith_mult_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:634:4: arith_mult_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_arith_mult_expr_in_arith_uminus_expr4052);
                    arith_mult_expr390=arith_mult_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arith_mult_expr390.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "arith_uminus_expr"

    public static class p_arith_uminus_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "p_arith_uminus_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:636:1: p_arith_uminus_expr : ( MINUS ( NL )? p_arith_mult_expr -> ^( UMINUS p_arith_mult_expr ) | p_arith_mult_expr );
    public final babel17Parser.p_arith_uminus_expr_return p_arith_uminus_expr() throws RecognitionException {
        babel17Parser.p_arith_uminus_expr_return retval = new babel17Parser.p_arith_uminus_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token MINUS391=null;
        Token NL392=null;
        babel17Parser.p_arith_mult_expr_return p_arith_mult_expr393 = null;

        babel17Parser.p_arith_mult_expr_return p_arith_mult_expr394 = null;


        CommonTree MINUS391_tree=null;
        CommonTree NL392_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleSubtreeStream stream_p_arith_mult_expr=new RewriteRuleSubtreeStream(adaptor,"rule p_arith_mult_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:637:2: ( MINUS ( NL )? p_arith_mult_expr -> ^( UMINUS p_arith_mult_expr ) | p_arith_mult_expr )
            int alt184=2;
            int LA184_0 = input.LA(1);

            if ( (LA184_0==MINUS) ) {
                alt184=1;
            }
            else if ( (LA184_0==L_begin||(LA184_0>=L_with && LA184_0<=L_if)||(LA184_0>=L_while && LA184_0<=L_for)||LA184_0==L_match||(LA184_0>=A_infinity && LA184_0<=U_infinity)||LA184_0==L_root||(LA184_0>=L_true && LA184_0<=L_here)||LA184_0==MODULE_KEY||(LA184_0>=Constr && LA184_0<=Num)||(LA184_0>=String && LA184_0<=ROUND_BRACKET_OPEN)||LA184_0==SQUARE_BRACKET_OPEN||LA184_0==CURLY_BRACKET_OPEN) ) {
                alt184=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 184, 0, input);

                throw nvae;
            }
            switch (alt184) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:637:4: MINUS ( NL )? p_arith_mult_expr
                    {
                    MINUS391=(Token)match(input,MINUS,FOLLOW_MINUS_in_p_arith_uminus_expr4063); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(MINUS391);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:637:10: ( NL )?
                    int alt183=2;
                    int LA183_0 = input.LA(1);

                    if ( (LA183_0==NL) ) {
                        alt183=1;
                    }
                    switch (alt183) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:637:10: NL
                            {
                            NL392=(Token)match(input,NL,FOLLOW_NL_in_p_arith_uminus_expr4065); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL392);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_p_arith_mult_expr_in_p_arith_uminus_expr4068);
                    p_arith_mult_expr393=p_arith_mult_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_p_arith_mult_expr.add(p_arith_mult_expr393.getTree());


                    // AST REWRITE
                    // elements: p_arith_mult_expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 637:32: -> ^( UMINUS p_arith_mult_expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:637:35: ^( UMINUS p_arith_mult_expr )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(UMINUS, "UMINUS"), root_1);

                        adaptor.addChild(root_1, stream_p_arith_mult_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:638:4: p_arith_mult_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_p_arith_mult_expr_in_p_arith_uminus_expr4081);
                    p_arith_mult_expr394=p_arith_mult_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_arith_mult_expr394.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "p_arith_uminus_expr"

    public static class arith_mult_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arith_mult_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:640:1: arith_mult_expr : arith_pow_expr ( ( NL )? ( TIMES | DIV | MOD ) ( NL )? arith_pow_expr )* ;
    public final babel17Parser.arith_mult_expr_return arith_mult_expr() throws RecognitionException {
        babel17Parser.arith_mult_expr_return retval = new babel17Parser.arith_mult_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL396=null;
        Token set397=null;
        Token NL398=null;
        babel17Parser.arith_pow_expr_return arith_pow_expr395 = null;

        babel17Parser.arith_pow_expr_return arith_pow_expr399 = null;


        CommonTree NL396_tree=null;
        CommonTree set397_tree=null;
        CommonTree NL398_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:641:2: ( arith_pow_expr ( ( NL )? ( TIMES | DIV | MOD ) ( NL )? arith_pow_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:641:4: arith_pow_expr ( ( NL )? ( TIMES | DIV | MOD ) ( NL )? arith_pow_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_arith_pow_expr_in_arith_mult_expr4090);
            arith_pow_expr395=arith_pow_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, arith_pow_expr395.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:641:19: ( ( NL )? ( TIMES | DIV | MOD ) ( NL )? arith_pow_expr )*
            loop187:
            do {
                int alt187=2;
                int LA187_0 = input.LA(1);

                if ( (LA187_0==NL) ) {
                    int LA187_1 = input.LA(2);

                    if ( ((LA187_1>=TIMES && LA187_1<=MOD)) ) {
                        alt187=1;
                    }


                }
                else if ( ((LA187_0>=TIMES && LA187_0<=MOD)) ) {
                    alt187=1;
                }


                switch (alt187) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:641:20: ( NL )? ( TIMES | DIV | MOD ) ( NL )? arith_pow_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:641:22: ( NL )?
            	    int alt185=2;
            	    int LA185_0 = input.LA(1);

            	    if ( (LA185_0==NL) ) {
            	        alt185=1;
            	    }
            	    switch (alt185) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:641:22: NL
            	            {
            	            NL396=(Token)match(input,NL,FOLLOW_NL_in_arith_mult_expr4093); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    set397=(Token)input.LT(1);
            	    set397=(Token)input.LT(1);
            	    if ( (input.LA(1)>=TIMES && input.LA(1)<=MOD) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set397), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:641:48: ( NL )?
            	    int alt186=2;
            	    int LA186_0 = input.LA(1);

            	    if ( (LA186_0==NL) ) {
            	        alt186=1;
            	    }
            	    switch (alt186) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:641:48: NL
            	            {
            	            NL398=(Token)match(input,NL,FOLLOW_NL_in_arith_mult_expr4110); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_arith_pow_expr_in_arith_mult_expr4114);
            	    arith_pow_expr399=arith_pow_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, arith_pow_expr399.getTree());

            	    }
            	    break;

            	default :
            	    break loop187;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "arith_mult_expr"

    public static class p_arith_mult_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "p_arith_mult_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:643:1: p_arith_mult_expr : p_arith_pow_expr ( ( NL )? ( TIMES | DIV | MOD ) ( NL )? p_arith_pow_expr )* ;
    public final babel17Parser.p_arith_mult_expr_return p_arith_mult_expr() throws RecognitionException {
        babel17Parser.p_arith_mult_expr_return retval = new babel17Parser.p_arith_mult_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL401=null;
        Token set402=null;
        Token NL403=null;
        babel17Parser.p_arith_pow_expr_return p_arith_pow_expr400 = null;

        babel17Parser.p_arith_pow_expr_return p_arith_pow_expr404 = null;


        CommonTree NL401_tree=null;
        CommonTree set402_tree=null;
        CommonTree NL403_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:644:2: ( p_arith_pow_expr ( ( NL )? ( TIMES | DIV | MOD ) ( NL )? p_arith_pow_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:644:4: p_arith_pow_expr ( ( NL )? ( TIMES | DIV | MOD ) ( NL )? p_arith_pow_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_arith_pow_expr_in_p_arith_mult_expr4126);
            p_arith_pow_expr400=p_arith_pow_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_arith_pow_expr400.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:644:21: ( ( NL )? ( TIMES | DIV | MOD ) ( NL )? p_arith_pow_expr )*
            loop190:
            do {
                int alt190=2;
                int LA190_0 = input.LA(1);

                if ( (LA190_0==NL) ) {
                    int LA190_1 = input.LA(2);

                    if ( ((LA190_1>=TIMES && LA190_1<=MOD)) ) {
                        alt190=1;
                    }


                }
                else if ( ((LA190_0>=TIMES && LA190_0<=MOD)) ) {
                    alt190=1;
                }


                switch (alt190) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:644:22: ( NL )? ( TIMES | DIV | MOD ) ( NL )? p_arith_pow_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:644:24: ( NL )?
            	    int alt188=2;
            	    int LA188_0 = input.LA(1);

            	    if ( (LA188_0==NL) ) {
            	        alt188=1;
            	    }
            	    switch (alt188) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:644:24: NL
            	            {
            	            NL401=(Token)match(input,NL,FOLLOW_NL_in_p_arith_mult_expr4129); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    set402=(Token)input.LT(1);
            	    set402=(Token)input.LT(1);
            	    if ( (input.LA(1)>=TIMES && input.LA(1)<=MOD) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set402), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:644:50: ( NL )?
            	    int alt189=2;
            	    int LA189_0 = input.LA(1);

            	    if ( (LA189_0==NL) ) {
            	        alt189=1;
            	    }
            	    switch (alt189) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:644:50: NL
            	            {
            	            NL403=(Token)match(input,NL,FOLLOW_NL_in_p_arith_mult_expr4146); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_arith_pow_expr_in_p_arith_mult_expr4150);
            	    p_arith_pow_expr404=p_arith_pow_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_arith_pow_expr404.getTree());

            	    }
            	    break;

            	default :
            	    break loop190;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "p_arith_mult_expr"

    public static class arith_pow_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arith_pow_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:646:1: arith_pow_expr : apply_expr ( ( NL )? POW_tok ( NL )? apply_expr )* -> ^( POW ( apply_expr )* ) ;
    public final babel17Parser.arith_pow_expr_return arith_pow_expr() throws RecognitionException {
        babel17Parser.arith_pow_expr_return retval = new babel17Parser.arith_pow_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL406=null;
        Token POW_tok407=null;
        Token NL408=null;
        babel17Parser.apply_expr_return apply_expr405 = null;

        babel17Parser.apply_expr_return apply_expr409 = null;


        CommonTree NL406_tree=null;
        CommonTree POW_tok407_tree=null;
        CommonTree NL408_tree=null;
        RewriteRuleTokenStream stream_POW_tok=new RewriteRuleTokenStream(adaptor,"token POW_tok");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_apply_expr=new RewriteRuleSubtreeStream(adaptor,"rule apply_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:647:2: ( apply_expr ( ( NL )? POW_tok ( NL )? apply_expr )* -> ^( POW ( apply_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:647:4: apply_expr ( ( NL )? POW_tok ( NL )? apply_expr )*
            {
            pushFollow(FOLLOW_apply_expr_in_arith_pow_expr4161);
            apply_expr405=apply_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_apply_expr.add(apply_expr405.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:647:15: ( ( NL )? POW_tok ( NL )? apply_expr )*
            loop193:
            do {
                int alt193=2;
                int LA193_0 = input.LA(1);

                if ( (LA193_0==NL) ) {
                    int LA193_1 = input.LA(2);

                    if ( (LA193_1==POW_tok) ) {
                        alt193=1;
                    }


                }
                else if ( (LA193_0==POW_tok) ) {
                    alt193=1;
                }


                switch (alt193) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:647:16: ( NL )? POW_tok ( NL )? apply_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:647:16: ( NL )?
            	    int alt191=2;
            	    int LA191_0 = input.LA(1);

            	    if ( (LA191_0==NL) ) {
            	        alt191=1;
            	    }
            	    switch (alt191) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:647:16: NL
            	            {
            	            NL406=(Token)match(input,NL,FOLLOW_NL_in_arith_pow_expr4164); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL406);


            	            }
            	            break;

            	    }

            	    POW_tok407=(Token)match(input,POW_tok,FOLLOW_POW_tok_in_arith_pow_expr4167); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_POW_tok.add(POW_tok407);

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:647:28: ( NL )?
            	    int alt192=2;
            	    int LA192_0 = input.LA(1);

            	    if ( (LA192_0==NL) ) {
            	        alt192=1;
            	    }
            	    switch (alt192) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:647:28: NL
            	            {
            	            NL408=(Token)match(input,NL,FOLLOW_NL_in_arith_pow_expr4169); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL408);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_apply_expr_in_arith_pow_expr4172);
            	    apply_expr409=apply_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_apply_expr.add(apply_expr409.getTree());

            	    }
            	    break;

            	default :
            	    break loop193;
                }
            } while (true);



            // AST REWRITE
            // elements: apply_expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 647:45: -> ^( POW ( apply_expr )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:647:48: ^( POW ( apply_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(POW, "POW"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:647:54: ( apply_expr )*
                while ( stream_apply_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_apply_expr.nextTree());

                }
                stream_apply_expr.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "arith_pow_expr"

    public static class p_arith_pow_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "p_arith_pow_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:649:1: p_arith_pow_expr : p_apply_expr ( ( NL )? POW_tok ( NL )? p_apply_expr )* -> ^( POW ( p_apply_expr )* ) ;
    public final babel17Parser.p_arith_pow_expr_return p_arith_pow_expr() throws RecognitionException {
        babel17Parser.p_arith_pow_expr_return retval = new babel17Parser.p_arith_pow_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL411=null;
        Token POW_tok412=null;
        Token NL413=null;
        babel17Parser.p_apply_expr_return p_apply_expr410 = null;

        babel17Parser.p_apply_expr_return p_apply_expr414 = null;


        CommonTree NL411_tree=null;
        CommonTree POW_tok412_tree=null;
        CommonTree NL413_tree=null;
        RewriteRuleTokenStream stream_POW_tok=new RewriteRuleTokenStream(adaptor,"token POW_tok");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_p_apply_expr=new RewriteRuleSubtreeStream(adaptor,"rule p_apply_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:650:2: ( p_apply_expr ( ( NL )? POW_tok ( NL )? p_apply_expr )* -> ^( POW ( p_apply_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:650:4: p_apply_expr ( ( NL )? POW_tok ( NL )? p_apply_expr )*
            {
            pushFollow(FOLLOW_p_apply_expr_in_p_arith_pow_expr4193);
            p_apply_expr410=p_apply_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_p_apply_expr.add(p_apply_expr410.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:650:17: ( ( NL )? POW_tok ( NL )? p_apply_expr )*
            loop196:
            do {
                int alt196=2;
                int LA196_0 = input.LA(1);

                if ( (LA196_0==NL) ) {
                    int LA196_1 = input.LA(2);

                    if ( (LA196_1==POW_tok) ) {
                        alt196=1;
                    }


                }
                else if ( (LA196_0==POW_tok) ) {
                    alt196=1;
                }


                switch (alt196) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:650:18: ( NL )? POW_tok ( NL )? p_apply_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:650:18: ( NL )?
            	    int alt194=2;
            	    int LA194_0 = input.LA(1);

            	    if ( (LA194_0==NL) ) {
            	        alt194=1;
            	    }
            	    switch (alt194) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:650:18: NL
            	            {
            	            NL411=(Token)match(input,NL,FOLLOW_NL_in_p_arith_pow_expr4196); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL411);


            	            }
            	            break;

            	    }

            	    POW_tok412=(Token)match(input,POW_tok,FOLLOW_POW_tok_in_p_arith_pow_expr4199); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_POW_tok.add(POW_tok412);

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:650:30: ( NL )?
            	    int alt195=2;
            	    int LA195_0 = input.LA(1);

            	    if ( (LA195_0==NL) ) {
            	        alt195=1;
            	    }
            	    switch (alt195) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:650:30: NL
            	            {
            	            NL413=(Token)match(input,NL,FOLLOW_NL_in_p_arith_pow_expr4201); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL413);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_apply_expr_in_p_arith_pow_expr4204);
            	    p_apply_expr414=p_apply_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_p_apply_expr.add(p_apply_expr414.getTree());

            	    }
            	    break;

            	default :
            	    break loop196;
                }
            } while (true);



            // AST REWRITE
            // elements: p_apply_expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 650:49: -> ^( POW ( p_apply_expr )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:650:52: ^( POW ( p_apply_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(POW, "POW"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:650:58: ( p_apply_expr )*
                while ( stream_p_apply_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_p_apply_expr.nextTree());

                }
                stream_p_apply_expr.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "p_arith_pow_expr"

    public static class apply_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "apply_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:652:1: apply_expr : ( basic_expr )+ -> ^( APPLY ( basic_expr )* ) ;
    public final babel17Parser.apply_expr_return apply_expr() throws RecognitionException {
        babel17Parser.apply_expr_return retval = new babel17Parser.apply_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.basic_expr_return basic_expr415 = null;


        RewriteRuleSubtreeStream stream_basic_expr=new RewriteRuleSubtreeStream(adaptor,"rule basic_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:653:2: ( ( basic_expr )+ -> ^( APPLY ( basic_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:653:4: ( basic_expr )+
            {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:653:4: ( basic_expr )+
            int cnt197=0;
            loop197:
            do {
                int alt197=2;
                int LA197_0 = input.LA(1);

                if ( (LA197_0==L_begin||(LA197_0>=L_with && LA197_0<=L_if)||(LA197_0>=L_while && LA197_0<=L_for)||LA197_0==L_match||(LA197_0>=A_infinity && LA197_0<=U_infinity)||LA197_0==L_root||(LA197_0>=L_true && LA197_0<=L_here)||LA197_0==MODULE_KEY||(LA197_0>=Constr && LA197_0<=Num)||(LA197_0>=String && LA197_0<=ROUND_BRACKET_OPEN)||LA197_0==SQUARE_BRACKET_OPEN||LA197_0==CURLY_BRACKET_OPEN) ) {
                    alt197=1;
                }


                switch (alt197) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:653:4: basic_expr
            	    {
            	    pushFollow(FOLLOW_basic_expr_in_apply_expr4225);
            	    basic_expr415=basic_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_basic_expr.add(basic_expr415.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt197 >= 1 ) break loop197;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(197, input);
                        throw eee;
                }
                cnt197++;
            } while (true);



            // AST REWRITE
            // elements: basic_expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 653:16: -> ^( APPLY ( basic_expr )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:653:19: ^( APPLY ( basic_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(APPLY, "APPLY"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:653:27: ( basic_expr )*
                while ( stream_basic_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_basic_expr.nextTree());

                }
                stream_basic_expr.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "apply_expr"

    public static class p_apply_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "p_apply_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:654:1: p_apply_expr : p_basic_expr ( ( NL )? p_basic_expr )* -> ^( APPLY ( p_basic_expr )* ) ;
    public final babel17Parser.p_apply_expr_return p_apply_expr() throws RecognitionException {
        babel17Parser.p_apply_expr_return retval = new babel17Parser.p_apply_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL417=null;
        babel17Parser.p_basic_expr_return p_basic_expr416 = null;

        babel17Parser.p_basic_expr_return p_basic_expr418 = null;


        CommonTree NL417_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_p_basic_expr=new RewriteRuleSubtreeStream(adaptor,"rule p_basic_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:655:2: ( p_basic_expr ( ( NL )? p_basic_expr )* -> ^( APPLY ( p_basic_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:655:4: p_basic_expr ( ( NL )? p_basic_expr )*
            {
            pushFollow(FOLLOW_p_basic_expr_in_p_apply_expr4243);
            p_basic_expr416=p_basic_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_p_basic_expr.add(p_basic_expr416.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:655:17: ( ( NL )? p_basic_expr )*
            loop199:
            do {
                int alt199=2;
                int LA199_0 = input.LA(1);

                if ( (LA199_0==NL) ) {
                    int LA199_1 = input.LA(2);

                    if ( (LA199_1==L_begin||(LA199_1>=L_with && LA199_1<=L_if)||(LA199_1>=L_while && LA199_1<=L_for)||LA199_1==L_match||(LA199_1>=A_infinity && LA199_1<=U_infinity)||LA199_1==L_root||(LA199_1>=L_true && LA199_1<=L_here)||LA199_1==MODULE_KEY||(LA199_1>=Constr && LA199_1<=Num)||(LA199_1>=String && LA199_1<=ROUND_BRACKET_OPEN)||LA199_1==SQUARE_BRACKET_OPEN||LA199_1==CURLY_BRACKET_OPEN) ) {
                        alt199=1;
                    }


                }
                else if ( (LA199_0==L_begin||(LA199_0>=L_with && LA199_0<=L_if)||(LA199_0>=L_while && LA199_0<=L_for)||LA199_0==L_match||(LA199_0>=A_infinity && LA199_0<=U_infinity)||LA199_0==L_root||(LA199_0>=L_true && LA199_0<=L_here)||LA199_0==MODULE_KEY||(LA199_0>=Constr && LA199_0<=Num)||(LA199_0>=String && LA199_0<=ROUND_BRACKET_OPEN)||LA199_0==SQUARE_BRACKET_OPEN||LA199_0==CURLY_BRACKET_OPEN) ) {
                    alt199=1;
                }


                switch (alt199) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:655:18: ( NL )? p_basic_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:655:18: ( NL )?
            	    int alt198=2;
            	    int LA198_0 = input.LA(1);

            	    if ( (LA198_0==NL) ) {
            	        alt198=1;
            	    }
            	    switch (alt198) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:655:18: NL
            	            {
            	            NL417=(Token)match(input,NL,FOLLOW_NL_in_p_apply_expr4246); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL417);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_basic_expr_in_p_apply_expr4249);
            	    p_basic_expr418=p_basic_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_p_basic_expr.add(p_basic_expr418.getTree());

            	    }
            	    break;

            	default :
            	    break loop199;
                }
            } while (true);



            // AST REWRITE
            // elements: p_basic_expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 655:37: -> ^( APPLY ( p_basic_expr )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:655:40: ^( APPLY ( p_basic_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(APPLY, "APPLY"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:655:48: ( p_basic_expr )*
                while ( stream_p_basic_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_p_basic_expr.nextTree());

                }
                stream_p_basic_expr.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "p_apply_expr"

    public static class basic_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "basic_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:657:1: basic_expr : message_send_expr ;
    public final babel17Parser.basic_expr_return basic_expr() throws RecognitionException {
        babel17Parser.basic_expr_return retval = new babel17Parser.basic_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.message_send_expr_return message_send_expr419 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:658:2: ( message_send_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:658:4: message_send_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_message_send_expr_in_basic_expr4269);
            message_send_expr419=message_send_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, message_send_expr419.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "basic_expr"

    public static class p_basic_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "p_basic_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:660:1: p_basic_expr : message_send_expr ;
    public final babel17Parser.p_basic_expr_return p_basic_expr() throws RecognitionException {
        babel17Parser.p_basic_expr_return retval = new babel17Parser.p_basic_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.message_send_expr_return message_send_expr420 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:661:2: ( message_send_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:661:4: message_send_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_message_send_expr_in_p_basic_expr4278);
            message_send_expr420=message_send_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, message_send_expr420.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "p_basic_expr"

    public static class message_send_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "message_send_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:663:1: message_send_expr : primitive_expr ( ( NL )? PERIOD ( NL )? Id )* -> ^( MESSAGE_SEND primitive_expr ( Id )* ) ;
    public final babel17Parser.message_send_expr_return message_send_expr() throws RecognitionException {
        babel17Parser.message_send_expr_return retval = new babel17Parser.message_send_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL422=null;
        Token PERIOD423=null;
        Token NL424=null;
        Token Id425=null;
        babel17Parser.primitive_expr_return primitive_expr421 = null;


        CommonTree NL422_tree=null;
        CommonTree PERIOD423_tree=null;
        CommonTree NL424_tree=null;
        CommonTree Id425_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
        RewriteRuleTokenStream stream_Id=new RewriteRuleTokenStream(adaptor,"token Id");
        RewriteRuleSubtreeStream stream_primitive_expr=new RewriteRuleSubtreeStream(adaptor,"rule primitive_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:664:2: ( primitive_expr ( ( NL )? PERIOD ( NL )? Id )* -> ^( MESSAGE_SEND primitive_expr ( Id )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:664:4: primitive_expr ( ( NL )? PERIOD ( NL )? Id )*
            {
            pushFollow(FOLLOW_primitive_expr_in_message_send_expr4287);
            primitive_expr421=primitive_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_primitive_expr.add(primitive_expr421.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:664:19: ( ( NL )? PERIOD ( NL )? Id )*
            loop202:
            do {
                int alt202=2;
                int LA202_0 = input.LA(1);

                if ( (LA202_0==NL) ) {
                    int LA202_1 = input.LA(2);

                    if ( (LA202_1==PERIOD) ) {
                        alt202=1;
                    }


                }
                else if ( (LA202_0==PERIOD) ) {
                    alt202=1;
                }


                switch (alt202) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:664:20: ( NL )? PERIOD ( NL )? Id
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:664:20: ( NL )?
            	    int alt200=2;
            	    int LA200_0 = input.LA(1);

            	    if ( (LA200_0==NL) ) {
            	        alt200=1;
            	    }
            	    switch (alt200) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:664:20: NL
            	            {
            	            NL422=(Token)match(input,NL,FOLLOW_NL_in_message_send_expr4290); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL422);


            	            }
            	            break;

            	    }

            	    PERIOD423=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_message_send_expr4293); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD423);

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:664:31: ( NL )?
            	    int alt201=2;
            	    int LA201_0 = input.LA(1);

            	    if ( (LA201_0==NL) ) {
            	        alt201=1;
            	    }
            	    switch (alt201) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:664:31: NL
            	            {
            	            NL424=(Token)match(input,NL,FOLLOW_NL_in_message_send_expr4295); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL424);


            	            }
            	            break;

            	    }

            	    Id425=(Token)match(input,Id,FOLLOW_Id_in_message_send_expr4298); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_Id.add(Id425);


            	    }
            	    break;

            	default :
            	    break loop202;
                }
            } while (true);



            // AST REWRITE
            // elements: Id, primitive_expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 664:40: -> ^( MESSAGE_SEND primitive_expr ( Id )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:664:43: ^( MESSAGE_SEND primitive_expr ( Id )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MESSAGE_SEND, "MESSAGE_SEND"), root_1);

                adaptor.addChild(root_1, stream_primitive_expr.nextTree());
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:664:73: ( Id )*
                while ( stream_Id.hasNext() ) {
                    adaptor.addChild(root_1, stream_Id.nextNode());

                }
                stream_Id.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "message_send_expr"

    public static class list_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "list_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:666:1: list_expr : ( '[' ( NL )? ( protected_expr ( ( NL )? COMMA ( NL )? protected_expr )* ( NL )? )? ']' -> ^( SQUARE_LIST ( protected_expr )* ) | '(' ( NL )? ( protected_expr ( ( NL )? COMMA ( NL )? protected_expr )* ( NL )? ( COMMA ( NL )? )? )? ')' -> ^( ROUND_LIST ^( NIL ( COMMA )* ) ^( NIL ( protected_expr )* ) ) );
    public final babel17Parser.list_expr_return list_expr() throws RecognitionException {
        babel17Parser.list_expr_return retval = new babel17Parser.list_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal426=null;
        Token NL427=null;
        Token NL429=null;
        Token COMMA430=null;
        Token NL431=null;
        Token NL433=null;
        Token char_literal434=null;
        Token char_literal435=null;
        Token NL436=null;
        Token NL438=null;
        Token COMMA439=null;
        Token NL440=null;
        Token NL442=null;
        Token COMMA443=null;
        Token NL444=null;
        Token char_literal445=null;
        babel17Parser.protected_expr_return protected_expr428 = null;

        babel17Parser.protected_expr_return protected_expr432 = null;

        babel17Parser.protected_expr_return protected_expr437 = null;

        babel17Parser.protected_expr_return protected_expr441 = null;


        CommonTree char_literal426_tree=null;
        CommonTree NL427_tree=null;
        CommonTree NL429_tree=null;
        CommonTree COMMA430_tree=null;
        CommonTree NL431_tree=null;
        CommonTree NL433_tree=null;
        CommonTree char_literal434_tree=null;
        CommonTree char_literal435_tree=null;
        CommonTree NL436_tree=null;
        CommonTree NL438_tree=null;
        CommonTree COMMA439_tree=null;
        CommonTree NL440_tree=null;
        CommonTree NL442_tree=null;
        CommonTree COMMA443_tree=null;
        CommonTree NL444_tree=null;
        CommonTree char_literal445_tree=null;
        RewriteRuleTokenStream stream_ROUND_BRACKET_OPEN=new RewriteRuleTokenStream(adaptor,"token ROUND_BRACKET_OPEN");
        RewriteRuleTokenStream stream_SQUARE_BRACKET_CLOSE=new RewriteRuleTokenStream(adaptor,"token SQUARE_BRACKET_CLOSE");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_ROUND_BRACKET_CLOSE=new RewriteRuleTokenStream(adaptor,"token ROUND_BRACKET_CLOSE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_SQUARE_BRACKET_OPEN=new RewriteRuleTokenStream(adaptor,"token SQUARE_BRACKET_OPEN");
        RewriteRuleSubtreeStream stream_protected_expr=new RewriteRuleSubtreeStream(adaptor,"rule protected_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:667:2: ( '[' ( NL )? ( protected_expr ( ( NL )? COMMA ( NL )? protected_expr )* ( NL )? )? ']' -> ^( SQUARE_LIST ( protected_expr )* ) | '(' ( NL )? ( protected_expr ( ( NL )? COMMA ( NL )? protected_expr )* ( NL )? ( COMMA ( NL )? )? )? ')' -> ^( ROUND_LIST ^( NIL ( COMMA )* ) ^( NIL ( protected_expr )* ) ) )
            int alt217=2;
            int LA217_0 = input.LA(1);

            if ( (LA217_0==SQUARE_BRACKET_OPEN) ) {
                alt217=1;
            }
            else if ( (LA217_0==ROUND_BRACKET_OPEN) ) {
                alt217=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 217, 0, input);

                throw nvae;
            }
            switch (alt217) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:667:4: '[' ( NL )? ( protected_expr ( ( NL )? COMMA ( NL )? protected_expr )* ( NL )? )? ']'
                    {
                    char_literal426=(Token)match(input,SQUARE_BRACKET_OPEN,FOLLOW_SQUARE_BRACKET_OPEN_in_list_expr4322); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SQUARE_BRACKET_OPEN.add(char_literal426);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:667:8: ( NL )?
                    int alt203=2;
                    int LA203_0 = input.LA(1);

                    if ( (LA203_0==NL) ) {
                        alt203=1;
                    }
                    switch (alt203) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:667:8: NL
                            {
                            NL427=(Token)match(input,NL,FOLLOW_NL_in_list_expr4324); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL427);


                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:667:12: ( protected_expr ( ( NL )? COMMA ( NL )? protected_expr )* ( NL )? )?
                    int alt208=2;
                    int LA208_0 = input.LA(1);

                    if ( (LA208_0==L_begin||(LA208_0>=L_obj && LA208_0<=L_if)||(LA208_0>=L_while && LA208_0<=L_for)||(LA208_0>=L_match && LA208_0<=L_case)||LA208_0==L_exception||(LA208_0>=A_infinity && LA208_0<=U_infinity)||LA208_0==L_root||(LA208_0>=L_concurrent && LA208_0<=L_lazy)||(LA208_0>=L_true && LA208_0<=L_random)||LA208_0==MINUS||LA208_0==MODULE_KEY||LA208_0==A_NOT||LA208_0==U_NOT||LA208_0==TILDE||(LA208_0>=Constr && LA208_0<=Num)||(LA208_0>=String && LA208_0<=ROUND_BRACKET_OPEN)||LA208_0==SQUARE_BRACKET_OPEN||LA208_0==CURLY_BRACKET_OPEN||LA208_0==UNDERSCORE) ) {
                        alt208=1;
                    }
                    switch (alt208) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:667:13: protected_expr ( ( NL )? COMMA ( NL )? protected_expr )* ( NL )?
                            {
                            pushFollow(FOLLOW_protected_expr_in_list_expr4328);
                            protected_expr428=protected_expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr428.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:667:28: ( ( NL )? COMMA ( NL )? protected_expr )*
                            loop206:
                            do {
                                int alt206=2;
                                int LA206_0 = input.LA(1);

                                if ( (LA206_0==NL) ) {
                                    int LA206_1 = input.LA(2);

                                    if ( (LA206_1==COMMA) ) {
                                        alt206=1;
                                    }


                                }
                                else if ( (LA206_0==COMMA) ) {
                                    alt206=1;
                                }


                                switch (alt206) {
                            	case 1 :
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:667:29: ( NL )? COMMA ( NL )? protected_expr
                            	    {
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:667:29: ( NL )?
                            	    int alt204=2;
                            	    int LA204_0 = input.LA(1);

                            	    if ( (LA204_0==NL) ) {
                            	        alt204=1;
                            	    }
                            	    switch (alt204) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:667:29: NL
                            	            {
                            	            NL429=(Token)match(input,NL,FOLLOW_NL_in_list_expr4331); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL429);


                            	            }
                            	            break;

                            	    }

                            	    COMMA430=(Token)match(input,COMMA,FOLLOW_COMMA_in_list_expr4334); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA430);

                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:667:39: ( NL )?
                            	    int alt205=2;
                            	    int LA205_0 = input.LA(1);

                            	    if ( (LA205_0==NL) ) {
                            	        alt205=1;
                            	    }
                            	    switch (alt205) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:667:39: NL
                            	            {
                            	            NL431=(Token)match(input,NL,FOLLOW_NL_in_list_expr4336); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL431);


                            	            }
                            	            break;

                            	    }

                            	    pushFollow(FOLLOW_protected_expr_in_list_expr4339);
                            	    protected_expr432=protected_expr();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr432.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop206;
                                }
                            } while (true);

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:667:60: ( NL )?
                            int alt207=2;
                            int LA207_0 = input.LA(1);

                            if ( (LA207_0==NL) ) {
                                alt207=1;
                            }
                            switch (alt207) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:667:60: NL
                                    {
                                    NL433=(Token)match(input,NL,FOLLOW_NL_in_list_expr4343); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL433);


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    char_literal434=(Token)match(input,SQUARE_BRACKET_CLOSE,FOLLOW_SQUARE_BRACKET_CLOSE_in_list_expr4348); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SQUARE_BRACKET_CLOSE.add(char_literal434);



                    // AST REWRITE
                    // elements: protected_expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 667:70: -> ^( SQUARE_LIST ( protected_expr )* )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:667:73: ^( SQUARE_LIST ( protected_expr )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SQUARE_LIST, "SQUARE_LIST"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:667:87: ( protected_expr )*
                        while ( stream_protected_expr.hasNext() ) {
                            adaptor.addChild(root_1, stream_protected_expr.nextTree());

                        }
                        stream_protected_expr.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:668:4: '(' ( NL )? ( protected_expr ( ( NL )? COMMA ( NL )? protected_expr )* ( NL )? ( COMMA ( NL )? )? )? ')'
                    {
                    char_literal435=(Token)match(input,ROUND_BRACKET_OPEN,FOLLOW_ROUND_BRACKET_OPEN_in_list_expr4362); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ROUND_BRACKET_OPEN.add(char_literal435);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:668:8: ( NL )?
                    int alt209=2;
                    int LA209_0 = input.LA(1);

                    if ( (LA209_0==NL) ) {
                        alt209=1;
                    }
                    switch (alt209) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:668:8: NL
                            {
                            NL436=(Token)match(input,NL,FOLLOW_NL_in_list_expr4364); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL436);


                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:668:12: ( protected_expr ( ( NL )? COMMA ( NL )? protected_expr )* ( NL )? ( COMMA ( NL )? )? )?
                    int alt216=2;
                    int LA216_0 = input.LA(1);

                    if ( (LA216_0==L_begin||(LA216_0>=L_obj && LA216_0<=L_if)||(LA216_0>=L_while && LA216_0<=L_for)||(LA216_0>=L_match && LA216_0<=L_case)||LA216_0==L_exception||(LA216_0>=A_infinity && LA216_0<=U_infinity)||LA216_0==L_root||(LA216_0>=L_concurrent && LA216_0<=L_lazy)||(LA216_0>=L_true && LA216_0<=L_random)||LA216_0==MINUS||LA216_0==MODULE_KEY||LA216_0==A_NOT||LA216_0==U_NOT||LA216_0==TILDE||(LA216_0>=Constr && LA216_0<=Num)||(LA216_0>=String && LA216_0<=ROUND_BRACKET_OPEN)||LA216_0==SQUARE_BRACKET_OPEN||LA216_0==CURLY_BRACKET_OPEN||LA216_0==UNDERSCORE) ) {
                        alt216=1;
                    }
                    switch (alt216) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:668:13: protected_expr ( ( NL )? COMMA ( NL )? protected_expr )* ( NL )? ( COMMA ( NL )? )?
                            {
                            pushFollow(FOLLOW_protected_expr_in_list_expr4368);
                            protected_expr437=protected_expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr437.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:668:28: ( ( NL )? COMMA ( NL )? protected_expr )*
                            loop212:
                            do {
                                int alt212=2;
                                int LA212_0 = input.LA(1);

                                if ( (LA212_0==NL) ) {
                                    int LA212_1 = input.LA(2);

                                    if ( (LA212_1==COMMA) ) {
                                        int LA212_2 = input.LA(3);

                                        if ( (LA212_2==NL) ) {
                                            int LA212_4 = input.LA(4);

                                            if ( (LA212_4==L_begin||(LA212_4>=L_obj && LA212_4<=L_if)||(LA212_4>=L_while && LA212_4<=L_for)||(LA212_4>=L_match && LA212_4<=L_case)||LA212_4==L_exception||(LA212_4>=A_infinity && LA212_4<=U_infinity)||LA212_4==L_root||(LA212_4>=L_concurrent && LA212_4<=L_lazy)||(LA212_4>=L_true && LA212_4<=L_random)||LA212_4==MINUS||LA212_4==MODULE_KEY||LA212_4==A_NOT||LA212_4==U_NOT||LA212_4==TILDE||(LA212_4>=Constr && LA212_4<=Num)||(LA212_4>=String && LA212_4<=ROUND_BRACKET_OPEN)||LA212_4==SQUARE_BRACKET_OPEN||LA212_4==CURLY_BRACKET_OPEN||LA212_4==UNDERSCORE) ) {
                                                alt212=1;
                                            }


                                        }
                                        else if ( (LA212_2==L_begin||(LA212_2>=L_obj && LA212_2<=L_if)||(LA212_2>=L_while && LA212_2<=L_for)||(LA212_2>=L_match && LA212_2<=L_case)||LA212_2==L_exception||(LA212_2>=A_infinity && LA212_2<=U_infinity)||LA212_2==L_root||(LA212_2>=L_concurrent && LA212_2<=L_lazy)||(LA212_2>=L_true && LA212_2<=L_random)||LA212_2==MINUS||LA212_2==MODULE_KEY||LA212_2==A_NOT||LA212_2==U_NOT||LA212_2==TILDE||(LA212_2>=Constr && LA212_2<=Num)||(LA212_2>=String && LA212_2<=ROUND_BRACKET_OPEN)||LA212_2==SQUARE_BRACKET_OPEN||LA212_2==CURLY_BRACKET_OPEN||LA212_2==UNDERSCORE) ) {
                                            alt212=1;
                                        }


                                    }


                                }
                                else if ( (LA212_0==COMMA) ) {
                                    int LA212_2 = input.LA(2);

                                    if ( (LA212_2==NL) ) {
                                        int LA212_4 = input.LA(3);

                                        if ( (LA212_4==L_begin||(LA212_4>=L_obj && LA212_4<=L_if)||(LA212_4>=L_while && LA212_4<=L_for)||(LA212_4>=L_match && LA212_4<=L_case)||LA212_4==L_exception||(LA212_4>=A_infinity && LA212_4<=U_infinity)||LA212_4==L_root||(LA212_4>=L_concurrent && LA212_4<=L_lazy)||(LA212_4>=L_true && LA212_4<=L_random)||LA212_4==MINUS||LA212_4==MODULE_KEY||LA212_4==A_NOT||LA212_4==U_NOT||LA212_4==TILDE||(LA212_4>=Constr && LA212_4<=Num)||(LA212_4>=String && LA212_4<=ROUND_BRACKET_OPEN)||LA212_4==SQUARE_BRACKET_OPEN||LA212_4==CURLY_BRACKET_OPEN||LA212_4==UNDERSCORE) ) {
                                            alt212=1;
                                        }


                                    }
                                    else if ( (LA212_2==L_begin||(LA212_2>=L_obj && LA212_2<=L_if)||(LA212_2>=L_while && LA212_2<=L_for)||(LA212_2>=L_match && LA212_2<=L_case)||LA212_2==L_exception||(LA212_2>=A_infinity && LA212_2<=U_infinity)||LA212_2==L_root||(LA212_2>=L_concurrent && LA212_2<=L_lazy)||(LA212_2>=L_true && LA212_2<=L_random)||LA212_2==MINUS||LA212_2==MODULE_KEY||LA212_2==A_NOT||LA212_2==U_NOT||LA212_2==TILDE||(LA212_2>=Constr && LA212_2<=Num)||(LA212_2>=String && LA212_2<=ROUND_BRACKET_OPEN)||LA212_2==SQUARE_BRACKET_OPEN||LA212_2==CURLY_BRACKET_OPEN||LA212_2==UNDERSCORE) ) {
                                        alt212=1;
                                    }


                                }


                                switch (alt212) {
                            	case 1 :
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:668:29: ( NL )? COMMA ( NL )? protected_expr
                            	    {
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:668:29: ( NL )?
                            	    int alt210=2;
                            	    int LA210_0 = input.LA(1);

                            	    if ( (LA210_0==NL) ) {
                            	        alt210=1;
                            	    }
                            	    switch (alt210) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:668:29: NL
                            	            {
                            	            NL438=(Token)match(input,NL,FOLLOW_NL_in_list_expr4371); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL438);


                            	            }
                            	            break;

                            	    }

                            	    COMMA439=(Token)match(input,COMMA,FOLLOW_COMMA_in_list_expr4374); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA439);

                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:668:39: ( NL )?
                            	    int alt211=2;
                            	    int LA211_0 = input.LA(1);

                            	    if ( (LA211_0==NL) ) {
                            	        alt211=1;
                            	    }
                            	    switch (alt211) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:668:39: NL
                            	            {
                            	            NL440=(Token)match(input,NL,FOLLOW_NL_in_list_expr4376); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL440);


                            	            }
                            	            break;

                            	    }

                            	    pushFollow(FOLLOW_protected_expr_in_list_expr4379);
                            	    protected_expr441=protected_expr();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr441.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop212;
                                }
                            } while (true);

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:668:60: ( NL )?
                            int alt213=2;
                            int LA213_0 = input.LA(1);

                            if ( (LA213_0==NL) ) {
                                alt213=1;
                            }
                            switch (alt213) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:668:60: NL
                                    {
                                    NL442=(Token)match(input,NL,FOLLOW_NL_in_list_expr4383); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL442);


                                    }
                                    break;

                            }

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:668:64: ( COMMA ( NL )? )?
                            int alt215=2;
                            int LA215_0 = input.LA(1);

                            if ( (LA215_0==COMMA) ) {
                                alt215=1;
                            }
                            switch (alt215) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:668:65: COMMA ( NL )?
                                    {
                                    COMMA443=(Token)match(input,COMMA,FOLLOW_COMMA_in_list_expr4387); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_COMMA.add(COMMA443);

                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:668:71: ( NL )?
                                    int alt214=2;
                                    int LA214_0 = input.LA(1);

                                    if ( (LA214_0==NL) ) {
                                        alt214=1;
                                    }
                                    switch (alt214) {
                                        case 1 :
                                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:668:71: NL
                                            {
                                            NL444=(Token)match(input,NL,FOLLOW_NL_in_list_expr4389); if (state.failed) return retval; 
                                            if ( state.backtracking==0 ) stream_NL.add(NL444);


                                            }
                                            break;

                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    char_literal445=(Token)match(input,ROUND_BRACKET_CLOSE,FOLLOW_ROUND_BRACKET_CLOSE_in_list_expr4396); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ROUND_BRACKET_CLOSE.add(char_literal445);



                    // AST REWRITE
                    // elements: protected_expr, COMMA
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 668:83: -> ^( ROUND_LIST ^( NIL ( COMMA )* ) ^( NIL ( protected_expr )* ) )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:668:86: ^( ROUND_LIST ^( NIL ( COMMA )* ) ^( NIL ( protected_expr )* ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ROUND_LIST, "ROUND_LIST"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:668:99: ^( NIL ( COMMA )* )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL, "NIL"), root_2);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:668:105: ( COMMA )*
                        while ( stream_COMMA.hasNext() ) {
                            adaptor.addChild(root_2, stream_COMMA.nextNode());

                        }
                        stream_COMMA.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:668:113: ^( NIL ( protected_expr )* )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL, "NIL"), root_2);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:668:119: ( protected_expr )*
                        while ( stream_protected_expr.hasNext() ) {
                            adaptor.addChild(root_2, stream_protected_expr.nextTree());

                        }
                        stream_protected_expr.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "list_expr"

    public static class map_or_set_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "map_or_set_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:670:1: map_or_set_expr : ( '{' ( NL )? ( map_or_set_elem_expr ( NL )? ( COMMA ( NL )? map_or_set_elem_expr ( NL )? )* )? '}' -> ^( MAP_OR_SET ( map_or_set_elem_expr )* ) | '{' ( NL )? token_ARROW ( NL )? '}' -> ^( EMPTY_MAP ) );
    public final babel17Parser.map_or_set_expr_return map_or_set_expr() throws RecognitionException {
        babel17Parser.map_or_set_expr_return retval = new babel17Parser.map_or_set_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal446=null;
        Token NL447=null;
        Token NL449=null;
        Token COMMA450=null;
        Token NL451=null;
        Token NL453=null;
        Token char_literal454=null;
        Token char_literal455=null;
        Token NL456=null;
        Token NL458=null;
        Token char_literal459=null;
        babel17Parser.map_or_set_elem_expr_return map_or_set_elem_expr448 = null;

        babel17Parser.map_or_set_elem_expr_return map_or_set_elem_expr452 = null;

        babel17Parser.token_ARROW_return token_ARROW457 = null;


        CommonTree char_literal446_tree=null;
        CommonTree NL447_tree=null;
        CommonTree NL449_tree=null;
        CommonTree COMMA450_tree=null;
        CommonTree NL451_tree=null;
        CommonTree NL453_tree=null;
        CommonTree char_literal454_tree=null;
        CommonTree char_literal455_tree=null;
        CommonTree NL456_tree=null;
        CommonTree NL458_tree=null;
        CommonTree char_literal459_tree=null;
        RewriteRuleTokenStream stream_CURLY_BRACKET_OPEN=new RewriteRuleTokenStream(adaptor,"token CURLY_BRACKET_OPEN");
        RewriteRuleTokenStream stream_CURLY_BRACKET_CLOSE=new RewriteRuleTokenStream(adaptor,"token CURLY_BRACKET_CLOSE");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_map_or_set_elem_expr=new RewriteRuleSubtreeStream(adaptor,"rule map_or_set_elem_expr");
        RewriteRuleSubtreeStream stream_token_ARROW=new RewriteRuleSubtreeStream(adaptor,"rule token_ARROW");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:671:2: ( '{' ( NL )? ( map_or_set_elem_expr ( NL )? ( COMMA ( NL )? map_or_set_elem_expr ( NL )? )* )? '}' -> ^( MAP_OR_SET ( map_or_set_elem_expr )* ) | '{' ( NL )? token_ARROW ( NL )? '}' -> ^( EMPTY_MAP ) )
            int alt226=2;
            int LA226_0 = input.LA(1);

            if ( (LA226_0==CURLY_BRACKET_OPEN) ) {
                switch ( input.LA(2) ) {
                case NL:
                    {
                    int LA226_2 = input.LA(3);

                    if ( ((LA226_2>=A_ARROW && LA226_2<=U_ARROW)) ) {
                        alt226=2;
                    }
                    else if ( (LA226_2==L_begin||(LA226_2>=L_obj && LA226_2<=L_if)||(LA226_2>=L_while && LA226_2<=L_for)||(LA226_2>=L_match && LA226_2<=L_case)||LA226_2==L_exception||(LA226_2>=A_infinity && LA226_2<=U_infinity)||LA226_2==L_root||(LA226_2>=L_concurrent && LA226_2<=L_lazy)||(LA226_2>=L_true && LA226_2<=L_random)||LA226_2==MINUS||LA226_2==MODULE_KEY||LA226_2==A_NOT||LA226_2==U_NOT||LA226_2==TILDE||(LA226_2>=Constr && LA226_2<=Num)||(LA226_2>=String && LA226_2<=ROUND_BRACKET_OPEN)||LA226_2==SQUARE_BRACKET_OPEN||(LA226_2>=CURLY_BRACKET_OPEN && LA226_2<=UNDERSCORE)) ) {
                        alt226=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 226, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case A_ARROW:
                case U_ARROW:
                    {
                    alt226=2;
                    }
                    break;
                case L_begin:
                case L_obj:
                case L_with:
                case L_if:
                case L_while:
                case L_for:
                case L_match:
                case L_case:
                case L_exception:
                case A_infinity:
                case U_infinity:
                case L_root:
                case L_concurrent:
                case L_await:
                case L_lazy:
                case L_true:
                case L_false:
                case L_this:
                case L_here:
                case L_random:
                case MINUS:
                case MODULE_KEY:
                case A_NOT:
                case U_NOT:
                case TILDE:
                case Constr:
                case Id:
                case Num:
                case String:
                case ROUND_BRACKET_OPEN:
                case SQUARE_BRACKET_OPEN:
                case CURLY_BRACKET_OPEN:
                case CURLY_BRACKET_CLOSE:
                case UNDERSCORE:
                    {
                    alt226=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 226, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 226, 0, input);

                throw nvae;
            }
            switch (alt226) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:671:4: '{' ( NL )? ( map_or_set_elem_expr ( NL )? ( COMMA ( NL )? map_or_set_elem_expr ( NL )? )* )? '}'
                    {
                    char_literal446=(Token)match(input,CURLY_BRACKET_OPEN,FOLLOW_CURLY_BRACKET_OPEN_in_map_or_set_expr4425); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_OPEN.add(char_literal446);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:671:8: ( NL )?
                    int alt218=2;
                    int LA218_0 = input.LA(1);

                    if ( (LA218_0==NL) ) {
                        alt218=1;
                    }
                    switch (alt218) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:671:8: NL
                            {
                            NL447=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_expr4427); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL447);


                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:671:12: ( map_or_set_elem_expr ( NL )? ( COMMA ( NL )? map_or_set_elem_expr ( NL )? )* )?
                    int alt223=2;
                    int LA223_0 = input.LA(1);

                    if ( (LA223_0==L_begin||(LA223_0>=L_obj && LA223_0<=L_if)||(LA223_0>=L_while && LA223_0<=L_for)||(LA223_0>=L_match && LA223_0<=L_case)||LA223_0==L_exception||(LA223_0>=A_infinity && LA223_0<=U_infinity)||LA223_0==L_root||(LA223_0>=L_concurrent && LA223_0<=L_lazy)||(LA223_0>=L_true && LA223_0<=L_random)||LA223_0==MINUS||LA223_0==MODULE_KEY||LA223_0==A_NOT||LA223_0==U_NOT||LA223_0==TILDE||(LA223_0>=Constr && LA223_0<=Num)||(LA223_0>=String && LA223_0<=ROUND_BRACKET_OPEN)||LA223_0==SQUARE_BRACKET_OPEN||LA223_0==CURLY_BRACKET_OPEN||LA223_0==UNDERSCORE) ) {
                        alt223=1;
                    }
                    switch (alt223) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:671:13: map_or_set_elem_expr ( NL )? ( COMMA ( NL )? map_or_set_elem_expr ( NL )? )*
                            {
                            pushFollow(FOLLOW_map_or_set_elem_expr_in_map_or_set_expr4431);
                            map_or_set_elem_expr448=map_or_set_elem_expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_map_or_set_elem_expr.add(map_or_set_elem_expr448.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:671:34: ( NL )?
                            int alt219=2;
                            int LA219_0 = input.LA(1);

                            if ( (LA219_0==NL) ) {
                                alt219=1;
                            }
                            switch (alt219) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:671:34: NL
                                    {
                                    NL449=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_expr4433); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL449);


                                    }
                                    break;

                            }

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:671:38: ( COMMA ( NL )? map_or_set_elem_expr ( NL )? )*
                            loop222:
                            do {
                                int alt222=2;
                                int LA222_0 = input.LA(1);

                                if ( (LA222_0==COMMA) ) {
                                    alt222=1;
                                }


                                switch (alt222) {
                            	case 1 :
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:671:39: COMMA ( NL )? map_or_set_elem_expr ( NL )?
                            	    {
                            	    COMMA450=(Token)match(input,COMMA,FOLLOW_COMMA_in_map_or_set_expr4437); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA450);

                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:671:45: ( NL )?
                            	    int alt220=2;
                            	    int LA220_0 = input.LA(1);

                            	    if ( (LA220_0==NL) ) {
                            	        alt220=1;
                            	    }
                            	    switch (alt220) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:671:45: NL
                            	            {
                            	            NL451=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_expr4439); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL451);


                            	            }
                            	            break;

                            	    }

                            	    pushFollow(FOLLOW_map_or_set_elem_expr_in_map_or_set_expr4442);
                            	    map_or_set_elem_expr452=map_or_set_elem_expr();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_map_or_set_elem_expr.add(map_or_set_elem_expr452.getTree());
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:671:70: ( NL )?
                            	    int alt221=2;
                            	    int LA221_0 = input.LA(1);

                            	    if ( (LA221_0==NL) ) {
                            	        alt221=1;
                            	    }
                            	    switch (alt221) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:671:70: NL
                            	            {
                            	            NL453=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_expr4444); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL453);


                            	            }
                            	            break;

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop222;
                                }
                            } while (true);


                            }
                            break;

                    }

                    char_literal454=(Token)match(input,CURLY_BRACKET_CLOSE,FOLLOW_CURLY_BRACKET_CLOSE_in_map_or_set_expr4451); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_CLOSE.add(char_literal454);



                    // AST REWRITE
                    // elements: map_or_set_elem_expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 671:82: -> ^( MAP_OR_SET ( map_or_set_elem_expr )* )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:671:85: ^( MAP_OR_SET ( map_or_set_elem_expr )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MAP_OR_SET, "MAP_OR_SET"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:671:98: ( map_or_set_elem_expr )*
                        while ( stream_map_or_set_elem_expr.hasNext() ) {
                            adaptor.addChild(root_1, stream_map_or_set_elem_expr.nextTree());

                        }
                        stream_map_or_set_elem_expr.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:672:10: '{' ( NL )? token_ARROW ( NL )? '}'
                    {
                    char_literal455=(Token)match(input,CURLY_BRACKET_OPEN,FOLLOW_CURLY_BRACKET_OPEN_in_map_or_set_expr4471); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_OPEN.add(char_literal455);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:672:14: ( NL )?
                    int alt224=2;
                    int LA224_0 = input.LA(1);

                    if ( (LA224_0==NL) ) {
                        alt224=1;
                    }
                    switch (alt224) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:672:14: NL
                            {
                            NL456=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_expr4473); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL456);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_token_ARROW_in_map_or_set_expr4476);
                    token_ARROW457=token_ARROW();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_token_ARROW.add(token_ARROW457.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:672:30: ( NL )?
                    int alt225=2;
                    int LA225_0 = input.LA(1);

                    if ( (LA225_0==NL) ) {
                        alt225=1;
                    }
                    switch (alt225) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:672:30: NL
                            {
                            NL458=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_expr4478); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL458);


                            }
                            break;

                    }

                    char_literal459=(Token)match(input,CURLY_BRACKET_CLOSE,FOLLOW_CURLY_BRACKET_CLOSE_in_map_or_set_expr4481); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_CLOSE.add(char_literal459);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 672:38: -> ^( EMPTY_MAP )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:672:41: ^( EMPTY_MAP )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EMPTY_MAP, "EMPTY_MAP"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "map_or_set_expr"

    public static class map_or_set_elem_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "map_or_set_elem_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:674:1: map_or_set_elem_expr : protected_expr ( ( NL )? token_ARROW ( NL )? protected_expr )? -> ^( NIL ( protected_expr )* ) ;
    public final babel17Parser.map_or_set_elem_expr_return map_or_set_elem_expr() throws RecognitionException {
        babel17Parser.map_or_set_elem_expr_return retval = new babel17Parser.map_or_set_elem_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL461=null;
        Token NL463=null;
        babel17Parser.protected_expr_return protected_expr460 = null;

        babel17Parser.token_ARROW_return token_ARROW462 = null;

        babel17Parser.protected_expr_return protected_expr464 = null;


        CommonTree NL461_tree=null;
        CommonTree NL463_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_protected_expr=new RewriteRuleSubtreeStream(adaptor,"rule protected_expr");
        RewriteRuleSubtreeStream stream_token_ARROW=new RewriteRuleSubtreeStream(adaptor,"rule token_ARROW");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:675:2: ( protected_expr ( ( NL )? token_ARROW ( NL )? protected_expr )? -> ^( NIL ( protected_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:675:4: protected_expr ( ( NL )? token_ARROW ( NL )? protected_expr )?
            {
            pushFollow(FOLLOW_protected_expr_in_map_or_set_elem_expr4498);
            protected_expr460=protected_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr460.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:675:20: ( ( NL )? token_ARROW ( NL )? protected_expr )?
            int alt229=2;
            int LA229_0 = input.LA(1);

            if ( (LA229_0==NL) ) {
                int LA229_1 = input.LA(2);

                if ( ((LA229_1>=A_ARROW && LA229_1<=U_ARROW)) ) {
                    alt229=1;
                }
            }
            else if ( ((LA229_0>=A_ARROW && LA229_0<=U_ARROW)) ) {
                alt229=1;
            }
            switch (alt229) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:675:21: ( NL )? token_ARROW ( NL )? protected_expr
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:675:21: ( NL )?
                    int alt227=2;
                    int LA227_0 = input.LA(1);

                    if ( (LA227_0==NL) ) {
                        alt227=1;
                    }
                    switch (alt227) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:675:21: NL
                            {
                            NL461=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_elem_expr4502); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL461);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_token_ARROW_in_map_or_set_elem_expr4505);
                    token_ARROW462=token_ARROW();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_token_ARROW.add(token_ARROW462.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:675:37: ( NL )?
                    int alt228=2;
                    int LA228_0 = input.LA(1);

                    if ( (LA228_0==NL) ) {
                        alt228=1;
                    }
                    switch (alt228) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:675:37: NL
                            {
                            NL463=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_elem_expr4507); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL463);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_protected_expr_in_map_or_set_elem_expr4510);
                    protected_expr464=protected_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr464.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: protected_expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 675:58: -> ^( NIL ( protected_expr )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:675:61: ^( NIL ( protected_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL, "NIL"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:675:67: ( protected_expr )*
                while ( stream_protected_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_protected_expr.nextTree());

                }
                stream_protected_expr.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "map_or_set_elem_expr"

    public static class primitive_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "primitive_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:677:1: primitive_expr : ( Num | String | Id | Constr | L_true | L_false | L_this | L_root | L_here | MODULE_KEY | token_infinity | list_expr | with_control_expr | map_or_set_expr );
    public final babel17Parser.primitive_expr_return primitive_expr() throws RecognitionException {
        babel17Parser.primitive_expr_return retval = new babel17Parser.primitive_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Num465=null;
        Token String466=null;
        Token Id467=null;
        Token Constr468=null;
        Token L_true469=null;
        Token L_false470=null;
        Token L_this471=null;
        Token L_root472=null;
        Token L_here473=null;
        Token MODULE_KEY474=null;
        babel17Parser.token_infinity_return token_infinity475 = null;

        babel17Parser.list_expr_return list_expr476 = null;

        babel17Parser.with_control_expr_return with_control_expr477 = null;

        babel17Parser.map_or_set_expr_return map_or_set_expr478 = null;


        CommonTree Num465_tree=null;
        CommonTree String466_tree=null;
        CommonTree Id467_tree=null;
        CommonTree Constr468_tree=null;
        CommonTree L_true469_tree=null;
        CommonTree L_false470_tree=null;
        CommonTree L_this471_tree=null;
        CommonTree L_root472_tree=null;
        CommonTree L_here473_tree=null;
        CommonTree MODULE_KEY474_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:678:2: ( Num | String | Id | Constr | L_true | L_false | L_this | L_root | L_here | MODULE_KEY | token_infinity | list_expr | with_control_expr | map_or_set_expr )
            int alt230=14;
            switch ( input.LA(1) ) {
            case Num:
                {
                alt230=1;
                }
                break;
            case String:
                {
                alt230=2;
                }
                break;
            case Id:
                {
                alt230=3;
                }
                break;
            case Constr:
                {
                alt230=4;
                }
                break;
            case L_true:
                {
                alt230=5;
                }
                break;
            case L_false:
                {
                alt230=6;
                }
                break;
            case L_this:
                {
                alt230=7;
                }
                break;
            case L_root:
                {
                alt230=8;
                }
                break;
            case L_here:
                {
                alt230=9;
                }
                break;
            case MODULE_KEY:
                {
                alt230=10;
                }
                break;
            case A_infinity:
            case U_infinity:
                {
                alt230=11;
                }
                break;
            case ROUND_BRACKET_OPEN:
            case SQUARE_BRACKET_OPEN:
                {
                alt230=12;
                }
                break;
            case L_begin:
            case L_with:
            case L_if:
            case L_while:
            case L_for:
            case L_match:
                {
                alt230=13;
                }
                break;
            case CURLY_BRACKET_OPEN:
                {
                alt230=14;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 230, 0, input);

                throw nvae;
            }

            switch (alt230) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:678:4: Num
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Num465=(Token)match(input,Num,FOLLOW_Num_in_primitive_expr4530); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Num465_tree = (CommonTree)adaptor.create(Num465);
                    adaptor.addChild(root_0, Num465_tree);
                    }

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:679:4: String
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    String466=(Token)match(input,String,FOLLOW_String_in_primitive_expr4535); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    String466_tree = (CommonTree)adaptor.create(String466);
                    adaptor.addChild(root_0, String466_tree);
                    }

                    }
                    break;
                case 3 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:680:4: Id
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Id467=(Token)match(input,Id,FOLLOW_Id_in_primitive_expr4540); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Id467_tree = (CommonTree)adaptor.create(Id467);
                    adaptor.addChild(root_0, Id467_tree);
                    }

                    }
                    break;
                case 4 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:681:4: Constr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Constr468=(Token)match(input,Constr,FOLLOW_Constr_in_primitive_expr4545); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Constr468_tree = (CommonTree)adaptor.create(Constr468);
                    adaptor.addChild(root_0, Constr468_tree);
                    }

                    }
                    break;
                case 5 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:682:4: L_true
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    L_true469=(Token)match(input,L_true,FOLLOW_L_true_in_primitive_expr4550); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    L_true469_tree = (CommonTree)adaptor.create(L_true469);
                    adaptor.addChild(root_0, L_true469_tree);
                    }

                    }
                    break;
                case 6 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:683:4: L_false
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    L_false470=(Token)match(input,L_false,FOLLOW_L_false_in_primitive_expr4555); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    L_false470_tree = (CommonTree)adaptor.create(L_false470);
                    adaptor.addChild(root_0, L_false470_tree);
                    }

                    }
                    break;
                case 7 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:684:4: L_this
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    L_this471=(Token)match(input,L_this,FOLLOW_L_this_in_primitive_expr4560); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    L_this471_tree = (CommonTree)adaptor.create(L_this471);
                    adaptor.addChild(root_0, L_this471_tree);
                    }

                    }
                    break;
                case 8 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:685:4: L_root
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    L_root472=(Token)match(input,L_root,FOLLOW_L_root_in_primitive_expr4566); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    L_root472_tree = (CommonTree)adaptor.create(L_root472);
                    adaptor.addChild(root_0, L_root472_tree);
                    }

                    }
                    break;
                case 9 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:686:4: L_here
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    L_here473=(Token)match(input,L_here,FOLLOW_L_here_in_primitive_expr4571); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    L_here473_tree = (CommonTree)adaptor.create(L_here473);
                    adaptor.addChild(root_0, L_here473_tree);
                    }

                    }
                    break;
                case 10 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:687:5: MODULE_KEY
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    MODULE_KEY474=(Token)match(input,MODULE_KEY,FOLLOW_MODULE_KEY_in_primitive_expr4577); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    MODULE_KEY474_tree = (CommonTree)adaptor.create(MODULE_KEY474);
                    adaptor.addChild(root_0, MODULE_KEY474_tree);
                    }

                    }
                    break;
                case 11 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:688:4: token_infinity
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_infinity_in_primitive_expr4582);
                    token_infinity475=token_infinity();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, token_infinity475.getTree());

                    }
                    break;
                case 12 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:689:5: list_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_list_expr_in_primitive_expr4588);
                    list_expr476=list_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, list_expr476.getTree());

                    }
                    break;
                case 13 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:690:4: with_control_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_with_control_expr_in_primitive_expr4593);
                    with_control_expr477=with_control_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, with_control_expr477.getTree());

                    }
                    break;
                case 14 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:691:4: map_or_set_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_map_or_set_expr_in_primitive_expr4598);
                    map_or_set_expr478=map_or_set_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, map_or_set_expr478.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "primitive_expr"

    public static class prog_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prog"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:693:1: prog : block EOF -> ^( PROG block ) ;
    public final babel17Parser.prog_return prog() throws RecognitionException {
        babel17Parser.prog_return retval = new babel17Parser.prog_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EOF480=null;
        babel17Parser.block_return block479 = null;


        CommonTree EOF480_tree=null;
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:693:7: ( block EOF -> ^( PROG block ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:693:9: block EOF
            {
            pushFollow(FOLLOW_block_in_prog4608);
            block479=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block479.getTree());
            EOF480=(Token)match(input,EOF,FOLLOW_EOF_in_prog4610); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EOF.add(EOF480);



            // AST REWRITE
            // elements: block
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 693:19: -> ^( PROG block )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:693:22: ^( PROG block )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PROG, "PROG"), root_1);

                adaptor.addChild(root_1, stream_block.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "prog"

    // $ANTLR start synpred1_babel17
    public final void synpred1_babel17_fragment() throws RecognitionException {   
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:370:10: ( Id ( NL )? L_as )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:370:11: Id ( NL )? L_as
        {
        match(input,Id,FOLLOW_Id_in_synpred1_babel171636); if (state.failed) return ;
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:370:14: ( NL )?
        int alt231=2;
        int LA231_0 = input.LA(1);

        if ( (LA231_0==NL) ) {
            alt231=1;
        }
        switch (alt231) {
            case 1 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:370:14: NL
                {
                match(input,NL,FOLLOW_NL_in_synpred1_babel171638); if (state.failed) return ;

                }
                break;

        }

        match(input,L_as,FOLLOW_L_as_in_synpred1_babel171641); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_babel17

    // $ANTLR start synpred2_babel17
    public final void synpred2_babel17_fragment() throws RecognitionException {   
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:371:4: ( protected_expr ( NL )? QUESTION_MARK )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:371:5: protected_expr ( NL )? QUESTION_MARK
        {
        pushFollow(FOLLOW_protected_expr_in_synpred2_babel171672);
        protected_expr();

        state._fsp--;
        if (state.failed) return ;
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:371:20: ( NL )?
        int alt232=2;
        int LA232_0 = input.LA(1);

        if ( (LA232_0==NL) ) {
            alt232=1;
        }
        switch (alt232) {
            case 1 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:371:20: NL
                {
                match(input,NL,FOLLOW_NL_in_synpred2_babel171674); if (state.failed) return ;

                }
                break;

        }

        match(input,QUESTION_MARK,FOLLOW_QUESTION_MARK_in_synpred2_babel171677); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_babel17

    // $ANTLR start synpred3_babel17
    public final void synpred3_babel17_fragment() throws RecognitionException {   
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:461:4: ( ( pattern | objelem_assign ) ( NL )? '=' )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:461:5: ( pattern | objelem_assign ) ( NL )? '='
        {
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:461:5: ( pattern | objelem_assign )
        int alt233=2;
        int LA233_0 = input.LA(1);

        if ( ((LA233_0>=A_infinity && LA233_0<=U_infinity)||(LA233_0>=L_true && LA233_0<=L_false)||LA233_0==MINUS||LA233_0==Constr||LA233_0==Num||(LA233_0>=String && LA233_0<=ROUND_BRACKET_OPEN)||LA233_0==SQUARE_BRACKET_OPEN||LA233_0==CURLY_BRACKET_OPEN||LA233_0==UNDERSCORE) ) {
            alt233=1;
        }
        else if ( (LA233_0==Id) ) {
            int LA233_2 = input.LA(2);

            if ( (LA233_2==PERIOD) ) {
                alt233=2;
            }
            else if ( (LA233_2==ASSIGN||(LA233_2>=A_DOUBLE_COLON && LA233_2<=U_DOUBLE_COLON)||LA233_2==NL) ) {
                alt233=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 233, 2, input);

                throw nvae;
            }
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 233, 0, input);

            throw nvae;
        }
        switch (alt233) {
            case 1 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:461:6: pattern
                {
                pushFollow(FOLLOW_pattern_in_synpred3_babel172642);
                pattern();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:461:16: objelem_assign
                {
                pushFollow(FOLLOW_objelem_assign_in_synpred3_babel172646);
                objelem_assign();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:461:32: ( NL )?
        int alt234=2;
        int LA234_0 = input.LA(1);

        if ( (LA234_0==NL) ) {
            alt234=1;
        }
        switch (alt234) {
            case 1 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:461:32: NL
                {
                match(input,NL,FOLLOW_NL_in_synpred3_babel172649); if (state.failed) return ;

                }
                break;

        }

        match(input,ASSIGN,FOLLOW_ASSIGN_in_synpred3_babel172652); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_babel17

    // $ANTLR start synpred4_babel17
    public final void synpred4_babel17_fragment() throws RecognitionException {   
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:492:4: ( lambda_expr )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:492:5: lambda_expr
        {
        pushFollow(FOLLOW_lambda_expr_in_synpred4_babel172852);
        lambda_expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_babel17

    // $ANTLR start synpred5_babel17
    public final void synpred5_babel17_fragment() throws RecognitionException {   
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:496:4: ( protected_lambda_expr )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:496:5: protected_lambda_expr
        {
        pushFollow(FOLLOW_protected_lambda_expr_in_synpred5_babel172873);
        protected_lambda_expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_babel17

    // Delegated rules

    public final boolean synpred4_babel17() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_babel17_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_babel17() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_babel17_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_babel17() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_babel17_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_babel17() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_babel17_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_babel17() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_babel17_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA16 dfa16 = new DFA16(this);
    protected DFA44 dfa44 = new DFA44(this);
    protected DFA50 dfa50 = new DFA50(this);
    protected DFA47 dfa47 = new DFA47(this);
    protected DFA52 dfa52 = new DFA52(this);
    protected DFA82 dfa82 = new DFA82(this);
    protected DFA90 dfa90 = new DFA90(this);
    protected DFA91 dfa91 = new DFA91(this);
    static final String DFA16_eotS =
        "\37\uffff";
    static final String DFA16_eofS =
        "\37\uffff";
    static final String DFA16_minS =
        "\1\64\14\0\22\uffff";
    static final String DFA16_maxS =
        "\1\u0091\14\0\22\uffff";
    static final String DFA16_acceptS =
        "\15\uffff\16\2\1\4\1\5\1\1\1\3";
    static final String DFA16_specialS =
        "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\22\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\30\1\uffff\1\32\1\31\1\24\3\uffff\1\25\1\27\2\uffff\1\26"+
            "\1\15\1\uffff\1\33\2\uffff\1\16\2\uffff\2\10\4\uffff\1\21\1"+
            "\uffff\3\16\1\uffff\1\6\1\7\1\20\1\22\1\16\16\uffff\1\11\4\uffff"+
            "\1\23\2\uffff\1\17\2\uffff\1\17\11\uffff\2\34\3\uffff\1\16\3"+
            "\uffff\1\2\1\1\1\5\1\uffff\1\4\1\13\1\uffff\1\12\1\uffff\1\14"+
            "\1\uffff\1\3",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "369:1: bracket_pattern : ( ( Id ( NL )? L_as )=> Id ( NL )? L_as ( NL )? pattern -> ^( L_as Id pattern ) | ( protected_expr ( NL )? QUESTION_MARK )=> protected_expr ( NL )? QUESTION_MARK ( ( NL )? pattern )? -> ^( QUESTION_MARK protected_expr ( pattern )? ) | pattern ( ( NL )? L_if ( NL )? protected_expr )? -> ^( IF_PATTERN pattern ( protected_expr )? ) | L_val ( NL )? protected_expr -> ^( L_val protected_expr ) | token_ELLIPSIS );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_0 = input.LA(1);

                         
                        int index16_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA16_0==Id) ) {s = 1;}

                        else if ( (LA16_0==Constr) ) {s = 2;}

                        else if ( (LA16_0==UNDERSCORE) ) {s = 3;}

                        else if ( (LA16_0==String) ) {s = 4;}

                        else if ( (LA16_0==Num) ) {s = 5;}

                        else if ( (LA16_0==L_true) ) {s = 6;}

                        else if ( (LA16_0==L_false) ) {s = 7;}

                        else if ( ((LA16_0>=A_infinity && LA16_0<=U_infinity)) ) {s = 8;}

                        else if ( (LA16_0==MINUS) ) {s = 9;}

                        else if ( (LA16_0==SQUARE_BRACKET_OPEN) ) {s = 10;}

                        else if ( (LA16_0==ROUND_BRACKET_OPEN) ) {s = 11;}

                        else if ( (LA16_0==CURLY_BRACKET_OPEN) ) {s = 12;}

                        else if ( (LA16_0==L_case) && (synpred2_babel17())) {s = 13;}

                        else if ( (LA16_0==L_exception||(LA16_0>=L_concurrent && LA16_0<=L_lazy)||LA16_0==L_random||LA16_0==TILDE) && (synpred2_babel17())) {s = 14;}

                        else if ( (LA16_0==A_NOT||LA16_0==U_NOT) && (synpred2_babel17())) {s = 15;}

                        else if ( (LA16_0==L_this) && (synpred2_babel17())) {s = 16;}

                        else if ( (LA16_0==L_root) && (synpred2_babel17())) {s = 17;}

                        else if ( (LA16_0==L_here) && (synpred2_babel17())) {s = 18;}

                        else if ( (LA16_0==MODULE_KEY) && (synpred2_babel17())) {s = 19;}

                        else if ( (LA16_0==L_if) && (synpred2_babel17())) {s = 20;}

                        else if ( (LA16_0==L_while) && (synpred2_babel17())) {s = 21;}

                        else if ( (LA16_0==L_match) && (synpred2_babel17())) {s = 22;}

                        else if ( (LA16_0==L_for) && (synpred2_babel17())) {s = 23;}

                        else if ( (LA16_0==L_begin) && (synpred2_babel17())) {s = 24;}

                        else if ( (LA16_0==L_with) && (synpred2_babel17())) {s = 25;}

                        else if ( (LA16_0==L_obj) && (synpred2_babel17())) {s = 26;}

                        else if ( (LA16_0==L_val) ) {s = 27;}

                        else if ( ((LA16_0>=A_ELLIPSIS && LA16_0<=U_ELLIPSIS)) ) {s = 28;}

                         
                        input.seek(index16_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA16_1 = input.LA(1);

                         
                        int index16_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_babel17()) ) {s = 29;}

                        else if ( (synpred2_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index16_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA16_2 = input.LA(1);

                         
                        int index16_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index16_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA16_3 = input.LA(1);

                         
                        int index16_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index16_3);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA16_4 = input.LA(1);

                         
                        int index16_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index16_4);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA16_5 = input.LA(1);

                         
                        int index16_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index16_5);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA16_6 = input.LA(1);

                         
                        int index16_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index16_6);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA16_7 = input.LA(1);

                         
                        int index16_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index16_7);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA16_8 = input.LA(1);

                         
                        int index16_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index16_8);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA16_9 = input.LA(1);

                         
                        int index16_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index16_9);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA16_10 = input.LA(1);

                         
                        int index16_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index16_10);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA16_11 = input.LA(1);

                         
                        int index16_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index16_11);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA16_12 = input.LA(1);

                         
                        int index16_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index16_12);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA44_eotS =
        "\22\uffff";
    static final String DFA44_eofS =
        "\22\uffff";
    static final String DFA44_minS =
        "\1\111\7\uffff\1\111\2\uffff\1\64\1\111\2\uffff\1\64\2\uffff";
    static final String DFA44_maxS =
        "\1\u0091\7\uffff\1\u0088\2\uffff\1\u0091\1\u0088\2\uffff\1\u0091"+
        "\2\uffff";
    static final String DFA44_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff\1\12\1\13\2\uffff\1"+
        "\11\1\10\1\uffff\1\14\1\15";
    static final String DFA44_specialS =
        "\22\uffff}>";
    static final String[] DFA44_transitionS = {
            "\2\7\12\uffff\1\5\1\6\21\uffff\1\10\36\uffff\1\1\1\4\1\uffff"+
            "\1\3\1\12\1\uffff\1\11\1\uffff\1\13\1\uffff\1\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\16\72\uffff\1\14\2\uffff\1\15",
            "",
            "",
            "\1\20\1\uffff\3\20\3\uffff\2\20\2\uffff\2\20\1\uffff\1\20\2"+
            "\uffff\1\20\2\uffff\2\20\4\uffff\1\20\1\uffff\3\20\1\uffff\5"+
            "\20\16\uffff\1\20\4\uffff\1\20\2\uffff\1\20\2\uffff\1\20\7\uffff"+
            "\2\21\2\20\3\uffff\1\20\2\uffff\1\17\3\20\1\uffff\2\20\1\uffff"+
            "\1\20\1\uffff\3\20",
            "\2\16\75\uffff\1\15",
            "",
            "",
            "\1\20\1\uffff\3\20\3\uffff\2\20\2\uffff\2\20\1\uffff\1\20\2"+
            "\uffff\1\20\2\uffff\2\20\4\uffff\1\20\1\uffff\3\20\1\uffff\5"+
            "\20\16\uffff\1\20\4\uffff\1\20\2\uffff\1\20\2\uffff\1\20\7\uffff"+
            "\2\21\2\20\3\uffff\1\20\3\uffff\3\20\1\uffff\2\20\1\uffff\1"+
            "\20\1\uffff\3\20",
            "",
            ""
    };

    static final short[] DFA44_eot = DFA.unpackEncodedString(DFA44_eotS);
    static final short[] DFA44_eof = DFA.unpackEncodedString(DFA44_eofS);
    static final char[] DFA44_min = DFA.unpackEncodedStringToUnsignedChars(DFA44_minS);
    static final char[] DFA44_max = DFA.unpackEncodedStringToUnsignedChars(DFA44_maxS);
    static final short[] DFA44_accept = DFA.unpackEncodedString(DFA44_acceptS);
    static final short[] DFA44_special = DFA.unpackEncodedString(DFA44_specialS);
    static final short[][] DFA44_transition;

    static {
        int numStates = DFA44_transitionS.length;
        DFA44_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA44_transition[i] = DFA.unpackEncodedString(DFA44_transitionS[i]);
        }
    }

    class DFA44 extends DFA {

        public DFA44(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 44;
            this.eot = DFA44_eot;
            this.eof = DFA44_eof;
            this.min = DFA44_min;
            this.max = DFA44_max;
            this.accept = DFA44_accept;
            this.special = DFA44_special;
            this.transition = DFA44_transition;
        }
        public String getDescription() {
            return "381:1: primitive_pattern : ( Id | '_' -> ANY | String | Num | L_true | L_false | token_infinity | '-' ( NL )? token_infinity -> ^( UMINUS token_infinity ) | '-' ( NL )? Num -> ^( UMINUS Num ) | '[' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* )? ']' -> ^( SQUARE_LIST ( bracket_pattern )* ) | '(' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* ( COMMA ( NL )? )? )? ')' -> ^( ROUND_LIST ^( NIL ( COMMA )* ) ^( NIL ( bracket_pattern )* ) ) | '{' ( NL )? ( mselem_pattern ( NL )? ( COMMA ( NL )? mselem_pattern ( NL )? )* )? '}' -> ^( MAP_OR_SET ( mselem_pattern )* ) | '{' ( NL )? token_ARROW ( NL )? '}' -> ^( EMPTY_MAP ) );";
        }
    }
    static final String DFA50_eotS =
        "\4\uffff";
    static final String DFA50_eofS =
        "\2\3\2\uffff";
    static final String DFA50_minS =
        "\2\64\2\uffff";
    static final String DFA50_maxS =
        "\2\u0091\2\uffff";
    static final String DFA50_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA50_specialS =
        "\4\uffff}>";
    static final String[] DFA50_transitionS = {
            "\1\2\1\3\3\2\1\uffff\2\3\2\2\1\uffff\2\2\1\3\1\uffff\2\2\1\uffff"+
            "\1\2\2\uffff\22\2\13\uffff\1\1\1\uffff\1\2\4\uffff\1\2\2\uffff"+
            "\1\2\2\uffff\1\2\16\uffff\1\2\2\uffff\1\1\3\2\1\uffff\2\2\1"+
            "\uffff\1\2\1\uffff\1\2\1\uffff\1\2",
            "\1\2\1\3\3\2\1\uffff\2\3\2\2\1\uffff\2\2\1\3\1\uffff\2\2\1"+
            "\uffff\1\2\2\uffff\22\2\13\uffff\1\1\1\uffff\1\2\4\uffff\1\2"+
            "\2\uffff\1\2\2\uffff\1\2\16\uffff\1\2\2\uffff\1\1\3\2\1\uffff"+
            "\2\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\2",
            "",
            ""
    };

    static final short[] DFA50_eot = DFA.unpackEncodedString(DFA50_eotS);
    static final short[] DFA50_eof = DFA.unpackEncodedString(DFA50_eofS);
    static final char[] DFA50_min = DFA.unpackEncodedStringToUnsignedChars(DFA50_minS);
    static final char[] DFA50_max = DFA.unpackEncodedStringToUnsignedChars(DFA50_maxS);
    static final short[] DFA50_accept = DFA.unpackEncodedString(DFA50_acceptS);
    static final short[] DFA50_special = DFA.unpackEncodedString(DFA50_specialS);
    static final short[][] DFA50_transition;

    static {
        int numStates = DFA50_transitionS.length;
        DFA50_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA50_transition[i] = DFA.unpackEncodedString(DFA50_transitionS[i]);
        }
    }

    class DFA50 extends DFA {

        public DFA50(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 50;
            this.eot = DFA50_eot;
            this.eof = DFA50_eof;
            this.min = DFA50_min;
            this.max = DFA50_max;
            this.accept = DFA50_accept;
            this.special = DFA50_special;
            this.transition = DFA50_transition;
        }
        public String getDescription() {
            return "403:1: block : ( ( sep )? statement ( sep statement )* ( sep )? -> ^( BLOCK ( statement )* ) | ( sep )? -> ^( BLOCK ) );";
        }
    }
    static final String DFA47_eotS =
        "\4\uffff";
    static final String DFA47_eofS =
        "\2\2\2\uffff";
    static final String DFA47_minS =
        "\1\65\1\64\2\uffff";
    static final String DFA47_maxS =
        "\1\u0085\1\u0091\2\uffff";
    static final String DFA47_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA47_specialS =
        "\4\uffff}>";
    static final String[] DFA47_transitionS = {
            "\1\2\4\uffff\2\2\5\uffff\1\2\44\uffff\1\1\36\uffff\1\1",
            "\1\3\1\2\3\3\1\uffff\2\2\2\3\1\uffff\2\3\1\2\1\uffff\2\3\1"+
            "\uffff\1\3\2\uffff\22\3\13\uffff\1\1\1\uffff\1\3\4\uffff\1\3"+
            "\2\uffff\1\3\2\uffff\1\3\16\uffff\1\3\2\uffff\1\1\3\3\1\uffff"+
            "\2\3\1\uffff\1\3\1\uffff\1\3\1\uffff\1\3",
            "",
            ""
    };

    static final short[] DFA47_eot = DFA.unpackEncodedString(DFA47_eotS);
    static final short[] DFA47_eof = DFA.unpackEncodedString(DFA47_eofS);
    static final char[] DFA47_min = DFA.unpackEncodedStringToUnsignedChars(DFA47_minS);
    static final char[] DFA47_max = DFA.unpackEncodedStringToUnsignedChars(DFA47_maxS);
    static final short[] DFA47_accept = DFA.unpackEncodedString(DFA47_acceptS);
    static final short[] DFA47_special = DFA.unpackEncodedString(DFA47_specialS);
    static final short[][] DFA47_transition;

    static {
        int numStates = DFA47_transitionS.length;
        DFA47_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA47_transition[i] = DFA.unpackEncodedString(DFA47_transitionS[i]);
        }
    }

    class DFA47 extends DFA {

        public DFA47(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 47;
            this.eot = DFA47_eot;
            this.eof = DFA47_eof;
            this.min = DFA47_min;
            this.max = DFA47_max;
            this.accept = DFA47_accept;
            this.special = DFA47_special;
            this.transition = DFA47_transition;
        }
        public String getDescription() {
            return "()* loopback of 403:25: ( sep statement )*";
        }
    }
    static final String DFA52_eotS =
        "\14\uffff";
    static final String DFA52_eofS =
        "\14\uffff";
    static final String DFA52_minS =
        "\1\64\1\uffff\3\104\6\uffff\1\104";
    static final String DFA52_maxS =
        "\1\u0091\1\uffff\3\u0085\6\uffff\1\120";
    static final String DFA52_acceptS =
        "\1\uffff\1\1\3\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff";
    static final String DFA52_specialS =
        "\14\uffff}>";
    static final String[] DFA52_transitionS = {
            "\1\12\1\uffff\3\12\3\uffff\2\12\1\uffff\1\11\1\12\2\uffff\1"+
            "\1\1\5\1\uffff\1\12\2\uffff\2\12\1\7\1\2\1\4\1\3\1\12\1\7\3"+
            "\12\1\6\5\12\1\10\15\uffff\1\12\4\uffff\1\12\2\uffff\1\12\2"+
            "\uffff\1\12\16\uffff\1\12\3\uffff\3\12\1\uffff\2\12\1\uffff"+
            "\1\12\1\uffff\1\12\1\uffff\1\12",
            "",
            "\1\5\6\uffff\1\7\4\uffff\1\7\64\uffff\1\13",
            "\1\5\6\uffff\1\7\4\uffff\1\7\64\uffff\1\13",
            "\1\5\6\uffff\1\7\4\uffff\1\7\64\uffff\1\13",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\5\6\uffff\1\7\4\uffff\1\7"
    };

    static final short[] DFA52_eot = DFA.unpackEncodedString(DFA52_eotS);
    static final short[] DFA52_eof = DFA.unpackEncodedString(DFA52_eofS);
    static final char[] DFA52_min = DFA.unpackEncodedStringToUnsignedChars(DFA52_minS);
    static final char[] DFA52_max = DFA.unpackEncodedStringToUnsignedChars(DFA52_maxS);
    static final short[] DFA52_accept = DFA.unpackEncodedString(DFA52_acceptS);
    static final short[] DFA52_special = DFA.unpackEncodedString(DFA52_specialS);
    static final short[][] DFA52_transition;

    static {
        int numStates = DFA52_transitionS.length;
        DFA52_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA52_transition[i] = DFA.unpackEncodedString(DFA52_transitionS[i]);
        }
    }

    class DFA52 extends DFA {

        public DFA52(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 52;
            this.eot = DFA52_eot;
            this.eof = DFA52_eof;
            this.min = DFA52_min;
            this.max = DFA52_max;
            this.accept = DFA52_accept;
            this.special = DFA52_special;
            this.transition = DFA52_transition;
        }
        public String getDescription() {
            return "409:1: statement : ( st_val | st_def | st_memoize | st_module | st_package | st_yield | expr_or_assign );";
        }
    }
    static final String DFA82_eotS =
        "\33\uffff";
    static final String DFA82_eofS =
        "\33\uffff";
    static final String DFA82_minS =
        "\1\64\14\0\16\uffff";
    static final String DFA82_maxS =
        "\1\u0091\14\0\16\uffff";
    static final String DFA82_acceptS =
        "\15\uffff\1\2\14\uffff\1\1";
    static final String DFA82_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\16"+
        "\uffff}>";
    static final String[] DFA82_transitionS = {
            "\1\15\1\uffff\3\15\3\uffff\2\15\2\uffff\1\15\5\uffff\1\15\2"+
            "\uffff\2\10\4\uffff\1\15\1\uffff\3\15\1\uffff\1\6\1\7\3\15\16"+
            "\uffff\1\11\4\uffff\1\15\2\uffff\1\15\2\uffff\1\15\16\uffff"+
            "\1\15\3\uffff\1\1\1\2\1\5\1\uffff\1\4\1\13\1\uffff\1\12\1\uffff"+
            "\1\14\1\uffff\1\3",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            ""
    };

    static final short[] DFA82_eot = DFA.unpackEncodedString(DFA82_eotS);
    static final short[] DFA82_eof = DFA.unpackEncodedString(DFA82_eofS);
    static final char[] DFA82_min = DFA.unpackEncodedStringToUnsignedChars(DFA82_minS);
    static final char[] DFA82_max = DFA.unpackEncodedStringToUnsignedChars(DFA82_maxS);
    static final short[] DFA82_accept = DFA.unpackEncodedString(DFA82_acceptS);
    static final short[] DFA82_special = DFA.unpackEncodedString(DFA82_specialS);
    static final short[][] DFA82_transition;

    static {
        int numStates = DFA82_transitionS.length;
        DFA82_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA82_transition[i] = DFA.unpackEncodedString(DFA82_transitionS[i]);
        }
    }

    class DFA82 extends DFA {

        public DFA82(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 82;
            this.eot = DFA82_eot;
            this.eof = DFA82_eof;
            this.min = DFA82_min;
            this.max = DFA82_max;
            this.accept = DFA82_accept;
            this.special = DFA82_special;
            this.transition = DFA82_transition;
        }
        public String getDescription() {
            return "460:1: expr_or_assign : ( ( ( pattern | objelem_assign ) ( NL )? '=' )=> ( pattern | objelem_assign ) ( NL )? '=' ( NL )? expr -> ^( ASSIGN pattern expr ) | expr );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA82_1 = input.LA(1);

                         
                        int index82_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index82_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA82_2 = input.LA(1);

                         
                        int index82_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index82_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA82_3 = input.LA(1);

                         
                        int index82_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index82_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA82_4 = input.LA(1);

                         
                        int index82_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index82_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA82_5 = input.LA(1);

                         
                        int index82_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index82_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA82_6 = input.LA(1);

                         
                        int index82_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index82_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA82_7 = input.LA(1);

                         
                        int index82_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index82_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA82_8 = input.LA(1);

                         
                        int index82_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index82_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA82_9 = input.LA(1);

                         
                        int index82_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index82_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA82_10 = input.LA(1);

                         
                        int index82_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index82_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA82_11 = input.LA(1);

                         
                        int index82_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index82_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA82_12 = input.LA(1);

                         
                        int index82_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index82_12);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 82, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA90_eotS =
        "\31\uffff";
    static final String DFA90_eofS =
        "\31\uffff";
    static final String DFA90_minS =
        "\1\64\2\0\1\uffff\11\0\14\uffff";
    static final String DFA90_maxS =
        "\1\u0091\2\0\1\uffff\11\0\14\uffff";
    static final String DFA90_acceptS =
        "\3\uffff\1\1\11\uffff\1\2\13\uffff";
    static final String DFA90_specialS =
        "\1\0\1\1\1\2\1\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\14"+
        "\uffff}>";
    static final String[] DFA90_transitionS = {
            "\1\15\2\uffff\2\15\3\uffff\2\15\2\uffff\1\15\5\uffff\1\15\2"+
            "\uffff\2\10\4\uffff\1\15\1\uffff\3\15\1\uffff\1\6\1\7\3\15\16"+
            "\uffff\1\11\4\uffff\1\15\2\uffff\1\15\2\uffff\1\15\16\uffff"+
            "\1\15\3\uffff\1\1\1\2\1\5\1\uffff\1\4\1\13\1\uffff\1\12\1\uffff"+
            "\1\14\1\uffff\1\3",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            ""
    };

    static final short[] DFA90_eot = DFA.unpackEncodedString(DFA90_eotS);
    static final short[] DFA90_eof = DFA.unpackEncodedString(DFA90_eofS);
    static final char[] DFA90_min = DFA.unpackEncodedStringToUnsignedChars(DFA90_minS);
    static final char[] DFA90_max = DFA.unpackEncodedStringToUnsignedChars(DFA90_maxS);
    static final short[] DFA90_accept = DFA.unpackEncodedString(DFA90_acceptS);
    static final short[] DFA90_special = DFA.unpackEncodedString(DFA90_specialS);
    static final short[][] DFA90_transition;

    static {
        int numStates = DFA90_transitionS.length;
        DFA90_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA90_transition[i] = DFA.unpackEncodedString(DFA90_transitionS[i]);
        }
    }

    class DFA90 extends DFA {

        public DFA90(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 90;
            this.eot = DFA90_eot;
            this.eof = DFA90_eof;
            this.min = DFA90_min;
            this.max = DFA90_max;
            this.accept = DFA90_accept;
            this.special = DFA90_special;
            this.transition = DFA90_transition;
        }
        public String getDescription() {
            return "491:1: lop_expr : ( ( lambda_expr )=> lambda_expr | op_expr );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA90_0 = input.LA(1);

                         
                        int index90_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA90_0==Constr) ) {s = 1;}

                        else if ( (LA90_0==Id) ) {s = 2;}

                        else if ( (LA90_0==UNDERSCORE) && (synpred4_babel17())) {s = 3;}

                        else if ( (LA90_0==String) ) {s = 4;}

                        else if ( (LA90_0==Num) ) {s = 5;}

                        else if ( (LA90_0==L_true) ) {s = 6;}

                        else if ( (LA90_0==L_false) ) {s = 7;}

                        else if ( ((LA90_0>=A_infinity && LA90_0<=U_infinity)) ) {s = 8;}

                        else if ( (LA90_0==MINUS) ) {s = 9;}

                        else if ( (LA90_0==SQUARE_BRACKET_OPEN) ) {s = 10;}

                        else if ( (LA90_0==ROUND_BRACKET_OPEN) ) {s = 11;}

                        else if ( (LA90_0==CURLY_BRACKET_OPEN) ) {s = 12;}

                        else if ( (LA90_0==L_begin||(LA90_0>=L_with && LA90_0<=L_if)||(LA90_0>=L_while && LA90_0<=L_for)||LA90_0==L_match||LA90_0==L_exception||LA90_0==L_root||(LA90_0>=L_concurrent && LA90_0<=L_lazy)||(LA90_0>=L_this && LA90_0<=L_random)||LA90_0==MODULE_KEY||LA90_0==A_NOT||LA90_0==U_NOT||LA90_0==TILDE) ) {s = 13;}

                         
                        input.seek(index90_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA90_1 = input.LA(1);

                         
                        int index90_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_babel17()) ) {s = 3;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index90_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA90_2 = input.LA(1);

                         
                        int index90_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_babel17()) ) {s = 3;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index90_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA90_4 = input.LA(1);

                         
                        int index90_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_babel17()) ) {s = 3;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index90_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA90_5 = input.LA(1);

                         
                        int index90_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_babel17()) ) {s = 3;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index90_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA90_6 = input.LA(1);

                         
                        int index90_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_babel17()) ) {s = 3;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index90_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA90_7 = input.LA(1);

                         
                        int index90_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_babel17()) ) {s = 3;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index90_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA90_8 = input.LA(1);

                         
                        int index90_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_babel17()) ) {s = 3;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index90_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA90_9 = input.LA(1);

                         
                        int index90_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_babel17()) ) {s = 3;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index90_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA90_10 = input.LA(1);

                         
                        int index90_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_babel17()) ) {s = 3;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index90_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA90_11 = input.LA(1);

                         
                        int index90_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_babel17()) ) {s = 3;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index90_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA90_12 = input.LA(1);

                         
                        int index90_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_babel17()) ) {s = 3;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index90_12);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 90, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA91_eotS =
        "\32\uffff";
    static final String DFA91_eofS =
        "\32\uffff";
    static final String DFA91_minS =
        "\1\64\2\0\1\uffff\11\0\15\uffff";
    static final String DFA91_maxS =
        "\1\u0091\2\0\1\uffff\11\0\15\uffff";
    static final String DFA91_acceptS =
        "\3\uffff\1\1\11\uffff\1\1\1\2\13\uffff";
    static final String DFA91_specialS =
        "\1\0\1\1\1\2\1\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\15"+
        "\uffff}>";
    static final String[] DFA91_transitionS = {
            "\1\16\2\uffff\2\16\3\uffff\2\16\2\uffff\1\16\1\15\4\uffff\1"+
            "\16\2\uffff\2\10\4\uffff\1\16\1\uffff\3\16\1\uffff\1\6\1\7\3"+
            "\16\16\uffff\1\11\4\uffff\1\16\2\uffff\1\16\2\uffff\1\16\16"+
            "\uffff\1\16\3\uffff\1\1\1\2\1\5\1\uffff\1\4\1\13\1\uffff\1\12"+
            "\1\uffff\1\14\1\uffff\1\3",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            ""
    };

    static final short[] DFA91_eot = DFA.unpackEncodedString(DFA91_eotS);
    static final short[] DFA91_eof = DFA.unpackEncodedString(DFA91_eofS);
    static final char[] DFA91_min = DFA.unpackEncodedStringToUnsignedChars(DFA91_minS);
    static final char[] DFA91_max = DFA.unpackEncodedStringToUnsignedChars(DFA91_maxS);
    static final short[] DFA91_accept = DFA.unpackEncodedString(DFA91_acceptS);
    static final short[] DFA91_special = DFA.unpackEncodedString(DFA91_specialS);
    static final short[][] DFA91_transition;

    static {
        int numStates = DFA91_transitionS.length;
        DFA91_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA91_transition[i] = DFA.unpackEncodedString(DFA91_transitionS[i]);
        }
    }

    class DFA91 extends DFA {

        public DFA91(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 91;
            this.eot = DFA91_eot;
            this.eof = DFA91_eof;
            this.min = DFA91_min;
            this.max = DFA91_max;
            this.accept = DFA91_accept;
            this.special = DFA91_special;
            this.transition = DFA91_transition;
        }
        public String getDescription() {
            return "495:1: p_lop_expr : ( ( protected_lambda_expr )=> protected_lambda_expr | p_op_expr );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA91_0 = input.LA(1);

                         
                        int index91_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA91_0==Constr) ) {s = 1;}

                        else if ( (LA91_0==Id) ) {s = 2;}

                        else if ( (LA91_0==UNDERSCORE) && (synpred5_babel17())) {s = 3;}

                        else if ( (LA91_0==String) ) {s = 4;}

                        else if ( (LA91_0==Num) ) {s = 5;}

                        else if ( (LA91_0==L_true) ) {s = 6;}

                        else if ( (LA91_0==L_false) ) {s = 7;}

                        else if ( ((LA91_0>=A_infinity && LA91_0<=U_infinity)) ) {s = 8;}

                        else if ( (LA91_0==MINUS) ) {s = 9;}

                        else if ( (LA91_0==SQUARE_BRACKET_OPEN) ) {s = 10;}

                        else if ( (LA91_0==ROUND_BRACKET_OPEN) ) {s = 11;}

                        else if ( (LA91_0==CURLY_BRACKET_OPEN) ) {s = 12;}

                        else if ( (LA91_0==L_case) && (synpred5_babel17())) {s = 13;}

                        else if ( (LA91_0==L_begin||(LA91_0>=L_with && LA91_0<=L_if)||(LA91_0>=L_while && LA91_0<=L_for)||LA91_0==L_match||LA91_0==L_exception||LA91_0==L_root||(LA91_0>=L_concurrent && LA91_0<=L_lazy)||(LA91_0>=L_this && LA91_0<=L_random)||LA91_0==MODULE_KEY||LA91_0==A_NOT||LA91_0==U_NOT||LA91_0==TILDE) ) {s = 14;}

                         
                        input.seek(index91_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA91_1 = input.LA(1);

                         
                        int index91_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_babel17()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index91_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA91_2 = input.LA(1);

                         
                        int index91_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_babel17()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index91_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA91_4 = input.LA(1);

                         
                        int index91_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_babel17()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index91_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA91_5 = input.LA(1);

                         
                        int index91_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_babel17()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index91_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA91_6 = input.LA(1);

                         
                        int index91_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_babel17()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index91_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA91_7 = input.LA(1);

                         
                        int index91_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_babel17()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index91_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA91_8 = input.LA(1);

                         
                        int index91_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_babel17()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index91_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA91_9 = input.LA(1);

                         
                        int index91_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_babel17()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index91_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA91_10 = input.LA(1);

                         
                        int index91_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_babel17()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index91_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA91_11 = input.LA(1);

                         
                        int index91_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_babel17()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index91_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA91_12 = input.LA(1);

                         
                        int index91_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_babel17()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index91_12);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 91, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_set_in_token_infinity0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_token_EQUAL0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_token_NOT_EQUAL0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_token_LESS_EQ0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_token_GREATER_EQ0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_token_OR0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_token_AND0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_token_NOT0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_token_DOUBLE_COLON0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_token_DOUBLE_ARROW0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_token_ARROW0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_token_ELLIPSIS0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Constr_in_pattern1572 = new BitSet(new long[]{0x0000000000000002L,0x0000010000600600L,0x000000000002ADA0L});
    public static final BitSet FOLLOW_NL_in_pattern1575 = new BitSet(new long[]{0x0000000000000000L,0x0000010000600600L,0x000000000002ADA0L});
    public static final BitSet FOLLOW_primitive_pattern_in_pattern1578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitive_pattern_in_pattern1594 = new BitSet(new long[]{0x0000000000000002L,0x0030000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_pattern1597 = new BitSet(new long[]{0x0000000000000000L,0x0030000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_token_DOUBLE_COLON_in_pattern1600 = new BitSet(new long[]{0x0000000000000000L,0x0000010000600600L,0x000000000002ADA0L});
    public static final BitSet FOLLOW_NL_in_pattern1602 = new BitSet(new long[]{0x0000000000000000L,0x0000010000600600L,0x000000000002ADA0L});
    public static final BitSet FOLLOW_primitive_pattern_in_pattern1605 = new BitSet(new long[]{0x0000000000000002L,0x0030000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_Id_in_bracket_pattern1646 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1648 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_L_as_in_bracket_pattern1651 = new BitSet(new long[]{0x0000000000000000L,0x0000010000600600L,0x000000000002ADE0L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1653 = new BitSet(new long[]{0x0000000000000000L,0x0000010000600600L,0x000000000002ADE0L});
    public static final BitSet FOLLOW_pattern_in_bracket_pattern1656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protected_expr_in_bracket_pattern1685 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000022L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1687 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_QUESTION_MARK_in_bracket_pattern1690 = new BitSet(new long[]{0x0000000000000002L,0x0000010000600600L,0x000000000002ADE0L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1693 = new BitSet(new long[]{0x0000000000000000L,0x0000010000600600L,0x000000000002ADE0L});
    public static final BitSet FOLLOW_pattern_in_bracket_pattern1696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_bracket_pattern1714 = new BitSet(new long[]{0x0100000000000002L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1717 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_L_if_in_bracket_pattern1720 = new BitSet(new long[]{0x31D0000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1722 = new BitSet(new long[]{0x31D0000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_protected_expr_in_bracket_pattern1725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_val_in_bracket_pattern1743 = new BitSet(new long[]{0x31D0000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1745 = new BitSet(new long[]{0x31D0000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_protected_expr_in_bracket_pattern1748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_ELLIPSIS_in_bracket_pattern1761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracket_pattern_in_mselem_pattern1771 = new BitSet(new long[]{0x0000000000000002L,0x1800000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_mselem_pattern1774 = new BitSet(new long[]{0x0000000000000000L,0x1800000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_token_ARROW_in_mselem_pattern1777 = new BitSet(new long[]{0x31D0000000000000L,0x6009210003EE864BL,0x000000000002ADE4L});
    public static final BitSet FOLLOW_NL_in_mselem_pattern1779 = new BitSet(new long[]{0x31D0000000000000L,0x6009210003EE864BL,0x000000000002ADE4L});
    public static final BitSet FOLLOW_bracket_pattern_in_mselem_pattern1782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Id_in_primitive_pattern1804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNDERSCORE_in_primitive_pattern1809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_String_in_primitive_pattern1818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Num_in_primitive_pattern1823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_true_in_primitive_pattern1828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_false_in_primitive_pattern1833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_infinity_in_primitive_pattern1838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_primitive_pattern1843 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000600L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern1845 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000600L});
    public static final BitSet FOLLOW_token_infinity_in_primitive_pattern1848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_primitive_pattern1861 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000120L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern1863 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_Num_in_primitive_pattern1866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SQUARE_BRACKET_OPEN_in_primitive_pattern1879 = new BitSet(new long[]{0x31D0000000000000L,0x6009210003EE864BL,0x000000000002EDE4L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern1882 = new BitSet(new long[]{0x31D0000000000000L,0x6009210003EE864BL,0x000000000002EDE4L});
    public static final BitSet FOLLOW_bracket_pattern_in_primitive_pattern1886 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004021L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern1888 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004001L});
    public static final BitSet FOLLOW_COMMA_in_primitive_pattern1893 = new BitSet(new long[]{0x31D0000000000000L,0x6009210003EE864BL,0x000000000002ADE4L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern1895 = new BitSet(new long[]{0x31D0000000000000L,0x6009210003EE864BL,0x000000000002ADE4L});
    public static final BitSet FOLLOW_bracket_pattern_in_primitive_pattern1898 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004021L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern1900 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004001L});
    public static final BitSet FOLLOW_SQUARE_BRACKET_CLOSE_in_primitive_pattern1908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROUND_BRACKET_OPEN_in_primitive_pattern1928 = new BitSet(new long[]{0x31D0000000000000L,0x6009210003EE864BL,0x000000000002BDE4L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern1931 = new BitSet(new long[]{0x31D0000000000000L,0x6009210003EE864BL,0x000000000002BDE4L});
    public static final BitSet FOLLOW_bracket_pattern_in_primitive_pattern1935 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001021L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern1937 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001001L});
    public static final BitSet FOLLOW_COMMA_in_primitive_pattern1942 = new BitSet(new long[]{0x31D0000000000000L,0x6009210003EE864BL,0x000000000002ADE4L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern1945 = new BitSet(new long[]{0x31D0000000000000L,0x6009210003EE864BL,0x000000000002ADE4L});
    public static final BitSet FOLLOW_bracket_pattern_in_primitive_pattern1948 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001021L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern1950 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001001L});
    public static final BitSet FOLLOW_COMMA_in_primitive_pattern1956 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001020L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern1958 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ROUND_BRACKET_CLOSE_in_primitive_pattern1965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURLY_BRACKET_OPEN_in_primitive_pattern1997 = new BitSet(new long[]{0x31D0000000000000L,0x6009210003EE864BL,0x000000000003ADE4L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2000 = new BitSet(new long[]{0x31D0000000000000L,0x6009210003EE864BL,0x000000000003ADE4L});
    public static final BitSet FOLLOW_mselem_pattern_in_primitive_pattern2004 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010021L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2006 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010001L});
    public static final BitSet FOLLOW_COMMA_in_primitive_pattern2011 = new BitSet(new long[]{0x31D0000000000000L,0x6009210003EE864BL,0x000000000002ADE4L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2014 = new BitSet(new long[]{0x31D0000000000000L,0x6009210003EE864BL,0x000000000002ADE4L});
    public static final BitSet FOLLOW_mselem_pattern_in_primitive_pattern2017 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010021L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2019 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010001L});
    public static final BitSet FOLLOW_CURLY_BRACKET_CLOSE_in_primitive_pattern2027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURLY_BRACKET_OPEN_in_primitive_pattern2045 = new BitSet(new long[]{0x0000000000000000L,0x1800000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2047 = new BitSet(new long[]{0x0000000000000000L,0x1800000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_token_ARROW_in_primitive_pattern2050 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010020L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2052 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_CURLY_BRACKET_CLOSE_in_primitive_pattern2055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_sep2075 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_sep_in_block2091 = new BitSet(new long[]{0xB1D0000000000000L,0x0009210007FFFE5BL,0x000000000002ADE4L});
    public static final BitSet FOLLOW_statement_in_block2094 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_sep_in_block2097 = new BitSet(new long[]{0xB1D0000000000000L,0x0009210007FFFE5BL,0x000000000002ADE4L});
    public static final BitSet FOLLOW_statement_in_block2099 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_sep_in_block2103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sep_in_block2119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_pure_block2136 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_sep_in_pure_block2139 = new BitSet(new long[]{0xB1D0000000000000L,0x0009210007FFFE5BL,0x000000000002ADE4L});
    public static final BitSet FOLLOW_statement_in_pure_block2141 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_st_val_in_statement2162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_def_in_statement2167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_memoize_in_statement2172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_module_in_statement2177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_package_in_statement2182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_yield_in_statement2187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_or_assign_in_statement2192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Id_in_objelem_assign2201 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_PERIOD_in_objelem_assign2203 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_Id_in_objelem_assign2205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_val_in_st_val2214 = new BitSet(new long[]{0x0000000000000000L,0x0000010000600600L,0x000000000002ADE0L});
    public static final BitSet FOLLOW_NL_in_st_val2216 = new BitSet(new long[]{0x0000000000000000L,0x0000010000600600L,0x000000000002ADE0L});
    public static final BitSet FOLLOW_pattern_in_st_val2220 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_objelem_assign_in_st_val2224 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_st_val2227 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ASSIGN_in_st_val2230 = new BitSet(new long[]{0xB1D0000000000000L,0x0009210007FFFE5BL,0x000000000002ADE4L});
    public static final BitSet FOLLOW_NL_in_st_val2232 = new BitSet(new long[]{0xB1D0000000000000L,0x0009210007FFFE5BL,0x000000000002ADE4L});
    public static final BitSet FOLLOW_expr_in_st_val2235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attribute_in_st_def2260 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_st_def2262 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_L_def_in_st_def2267 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000A0L});
    public static final BitSet FOLLOW_NL_in_st_def2269 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_Id_in_st_def2272 = new BitSet(new long[]{0x0000000020000000L,0x0000010000600600L,0x000000000002ADA0L});
    public static final BitSet FOLLOW_NL_in_st_def2274 = new BitSet(new long[]{0x0000000020000000L,0x0000010000600600L,0x000000000002ADA0L});
    public static final BitSet FOLLOW_primitive_pattern_in_st_def2278 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_st_def2280 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ASSIGN_in_st_def2285 = new BitSet(new long[]{0xB1D0000000000000L,0x0009210007FFFE5BL,0x000000000002ADE4L});
    public static final BitSet FOLLOW_NL_in_st_def2287 = new BitSet(new long[]{0xB1D0000000000000L,0x0009210007FFFE5BL,0x000000000002ADE4L});
    public static final BitSet FOLLOW_expr_in_st_def2290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_yield_in_st_yield2322 = new BitSet(new long[]{0xB1D0000000000000L,0x0009210007FFFE5BL,0x000000000002ADE4L});
    public static final BitSet FOLLOW_expr_in_st_yield2324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_private_in_attribute2345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_public_in_attribute2358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_protected_in_attribute2371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_module_decl_in_st_module2389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_module_def_in_st_module2394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attribute_in_st_module_decl2405 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_st_module_decl2407 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_L_external_in_st_module_decl2412 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_st_module_decl2414 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_L_module_in_st_module_decl2417 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000A0L});
    public static final BitSet FOLLOW_NL_in_st_module_decl2419 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000A0L});
    public static final BitSet FOLLOW_module_path_in_st_module_decl2422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attribute_in_st_module_def2452 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_st_module_def2454 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_L_module_in_st_module_def2459 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000A0L});
    public static final BitSet FOLLOW_NL_in_st_module_def2461 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000A0L});
    public static final BitSet FOLLOW_module_path_in_st_module_def2464 = new BitSet(new long[]{0xB1F0000000000000L,0x0009214007FFFE5BL,0x000000000002ADE4L});
    public static final BitSet FOLLOW_block_in_st_module_def2466 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_L_end_in_st_module_def2468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_package_in_st_package2504 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000A0L});
    public static final BitSet FOLLOW_NL_in_st_package2506 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000A0L});
    public static final BitSet FOLLOW_module_path_in_st_package2509 = new BitSet(new long[]{0xB1F0000000000000L,0x0009214007FFFE5BL,0x000000000002ADE4L});
    public static final BitSet FOLLOW_block_in_st_package2511 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_L_end_in_st_package2513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Id_in_module_path2543 = new BitSet(new long[]{0x0000000000000002L,0x8000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_module_path2546 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_PERIOD_in_module_path2549 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000A0L});
    public static final BitSet FOLLOW_NL_in_module_path2551 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_Id_in_module_path2554 = new BitSet(new long[]{0x0000000000000002L,0x8000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_L_memoize_in_st_memoize2575 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000880L});
    public static final BitSet FOLLOW_memid_in_st_memoize2577 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000880L});
    public static final BitSet FOLLOW_Id_in_memid2601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROUND_BRACKET_OPEN_in_memid2614 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_Id_in_memid2616 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ROUND_BRACKET_CLOSE_in_memid2618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_expr_or_assign2658 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_objelem_assign_in_expr_or_assign2662 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_expr_or_assign2665 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ASSIGN_in_expr_or_assign2668 = new BitSet(new long[]{0xB1D0000000000000L,0x0009210007FFFE5BL,0x000000000002ADE4L});
    public static final BitSet FOLLOW_NL_in_expr_or_assign2670 = new BitSet(new long[]{0xB1D0000000000000L,0x0009210007FFFE5BL,0x000000000002ADE4L});
    public static final BitSet FOLLOW_expr_in_expr_or_assign2673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_or_assign2688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lop_expr_in_expr2699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_obj_expr_in_expr2704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_expr_in_control_expr2714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_do_expr_in_control_expr2719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_match_expr_in_control_expr2724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_expr_in_control_expr2729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_begin_end_in_control_expr2734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_control_expr_in_with_control_expr2744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_with_in_with_control_expr2749 = new BitSet(new long[]{0x31D0000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_NL_in_with_control_expr2751 = new BitSet(new long[]{0x31D0000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_protected_expr_in_with_control_expr2754 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040020L});
    public static final BitSet FOLLOW_NL_in_with_control_expr2756 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_COLON_in_with_control_expr2759 = new BitSet(new long[]{0x3110000000000000L,0x0000000000000001L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_with_control_expr2761 = new BitSet(new long[]{0x3110000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_control_expr_in_with_control_expr2764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_lop_expr_in_protected_expr2785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_obj_expr_in_protected_expr2790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_begin_in_begin_end2802 = new BitSet(new long[]{0xB1F0000000000000L,0x0009214007FFFE5BL,0x000000000002ADE4L});
    public static final BitSet FOLLOW_block_in_begin_end2804 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_L_end_in_begin_end2806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_obj_in_obj_expr2822 = new BitSet(new long[]{0xB1F0000000000000L,0x0009214007FFFE5BL,0x000000000002ADE4L});
    public static final BitSet FOLLOW_block_in_obj_expr2824 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_L_end_in_obj_expr2826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_expr_in_lop_expr2857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_op_expr_in_lop_expr2862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protected_lambda_expr_in_p_lop_expr2878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_op_expr_in_p_lop_expr2883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_if_in_if_expr2894 = new BitSet(new long[]{0x31D0000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_NL_in_if_expr2896 = new BitSet(new long[]{0x31D0000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_protected_expr_in_if_expr2899 = new BitSet(new long[]{0x0200000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_if_expr2901 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_L_then_in_if_expr2904 = new BitSet(new long[]{0xBDF0000000000000L,0x0009214007FFFE5BL,0x000000000002ADE4L});
    public static final BitSet FOLLOW_block_in_if_expr2906 = new BitSet(new long[]{0x0C20000000000000L});
    public static final BitSet FOLLOW_L_elseif_in_if_expr2912 = new BitSet(new long[]{0x31D0000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_NL_in_if_expr2914 = new BitSet(new long[]{0x31D0000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_protected_expr_in_if_expr2917 = new BitSet(new long[]{0x0200000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_if_expr2919 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_L_then_in_if_expr2922 = new BitSet(new long[]{0xBDF0000000000000L,0x0009214007FFFE5BL,0x000000000002ADE4L});
    public static final BitSet FOLLOW_block_in_if_expr2924 = new BitSet(new long[]{0x0C20000000000000L});
    public static final BitSet FOLLOW_L_else_in_if_expr2932 = new BitSet(new long[]{0xB1F0000000000000L,0x0009214007FFFE5BL,0x000000000002ADE4L});
    public static final BitSet FOLLOW_block_in_if_expr2934 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_L_end_in_if_expr2938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_while_in_while_do_expr2962 = new BitSet(new long[]{0x31D0000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_NL_in_while_do_expr2964 = new BitSet(new long[]{0x31D0000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_protected_expr_in_while_do_expr2967 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_while_do_expr2969 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_L_do_in_while_do_expr2972 = new BitSet(new long[]{0xB1F0000000000000L,0x0009214007FFFE5BL,0x000000000002ADE4L});
    public static final BitSet FOLLOW_block_in_while_do_expr2974 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_L_end_in_while_do_expr2976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_full_cases_in_cases3006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_cases3011 = new BitSet(new long[]{0x0000000000000000L,0x0600000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_cases3013 = new BitSet(new long[]{0x0000000000000000L,0x0600000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_token_DOUBLE_ARROW_in_cases3016 = new BitSet(new long[]{0xB1D0000000000000L,0x0009214007FFFE5BL,0x000000000002ADE4L});
    public static final BitSet FOLLOW_block_in_cases3018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_case_expr_in_full_cases3041 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_L_case_in_case_expr3062 = new BitSet(new long[]{0x0000000000000000L,0x0000010000600600L,0x000000000002ADE0L});
    public static final BitSet FOLLOW_NL_in_case_expr3064 = new BitSet(new long[]{0x0000000000000000L,0x0000010000600600L,0x000000000002ADE0L});
    public static final BitSet FOLLOW_pattern_in_case_expr3067 = new BitSet(new long[]{0x0000000000000000L,0x0600000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_case_expr3069 = new BitSet(new long[]{0x0000000000000000L,0x0600000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_token_DOUBLE_ARROW_in_case_expr3072 = new BitSet(new long[]{0xB1D0000000000000L,0x0009214007FFFE5BL,0x000000000002ADE4L});
    public static final BitSet FOLLOW_block_in_case_expr3074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_match_in_match_expr3095 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_NL_in_match_expr3097 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_p_op_expr_in_match_expr3100 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_match_expr3102 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_full_cases_in_match_expr3105 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_L_end_in_match_expr3107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_cases_in_lambda_expr3133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_lambda_cases3151 = new BitSet(new long[]{0x0000000000000000L,0x0600000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_lambda_cases3153 = new BitSet(new long[]{0x0000000000000000L,0x0600000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_token_DOUBLE_ARROW_in_lambda_cases3156 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_NL_in_lambda_cases3158 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_lop_expr_in_lambda_cases3161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protected_lambda_cases_in_protected_lambda_expr3189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_case_in_p_lambda_case_expr3207 = new BitSet(new long[]{0x0000000000000000L,0x0000010000600600L,0x000000000002ADE0L});
    public static final BitSet FOLLOW_NL_in_p_lambda_case_expr3209 = new BitSet(new long[]{0x0000000000000000L,0x0000010000600600L,0x000000000002ADE0L});
    public static final BitSet FOLLOW_pattern_in_p_lambda_case_expr3212 = new BitSet(new long[]{0x0000000000000000L,0x0600000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_p_lambda_case_expr3214 = new BitSet(new long[]{0x0000000000000000L,0x0600000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_token_DOUBLE_ARROW_in_p_lambda_case_expr3217 = new BitSet(new long[]{0xB1D0000000000000L,0x0009210007FFFE5BL,0x000000000002ADE4L});
    public static final BitSet FOLLOW_NL_in_p_lambda_case_expr3219 = new BitSet(new long[]{0xB1D0000000000000L,0x0009210007FFFE5BL,0x000000000002ADE4L});
    public static final BitSet FOLLOW_pure_block_in_p_lambda_case_expr3222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_protected_lambda_cases3243 = new BitSet(new long[]{0x0000000000000000L,0x0600000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_protected_lambda_cases3245 = new BitSet(new long[]{0x0000000000000000L,0x0600000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_token_DOUBLE_ARROW_in_protected_lambda_cases3248 = new BitSet(new long[]{0xB1D0000000000000L,0x0009210007FFFE5BL,0x000000000002ADE4L});
    public static final BitSet FOLLOW_NL_in_protected_lambda_cases3250 = new BitSet(new long[]{0xB1D0000000000000L,0x0009210007FFFE5BL,0x000000000002ADE4L});
    public static final BitSet FOLLOW_pure_block_in_protected_lambda_cases3253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_lambda_case_expr_in_protected_lambda_cases3272 = new BitSet(new long[]{0x0000000000000002L,0x0000010000600602L,0x000000000002ADE0L});
    public static final BitSet FOLLOW_L_for_in_for_expr3289 = new BitSet(new long[]{0x0000000000000000L,0x0000010000600600L,0x000000000002ADE0L});
    public static final BitSet FOLLOW_NL_in_for_expr3291 = new BitSet(new long[]{0x0000000000000000L,0x0000010000600600L,0x000000000002ADE0L});
    public static final BitSet FOLLOW_pattern_in_for_expr3294 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_for_expr3296 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_L_in_in_for_expr3299 = new BitSet(new long[]{0x31D0000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_NL_in_for_expr3301 = new BitSet(new long[]{0x31D0000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_protected_expr_in_for_expr3304 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_for_expr3306 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_L_do_in_for_expr3309 = new BitSet(new long[]{0xB1F0000000000000L,0x0009214007FFFE5BL,0x000000000002ADE4L});
    public static final BitSet FOLLOW_block_in_for_expr3311 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_L_end_in_for_expr3313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_builtin_primitive_in_op_expr3338 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_op_expr_in_op_expr3341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bool_expr_in_op_expr3346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_builtin_primitive_in_p_op_expr3356 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_NL_in_p_op_expr3359 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_p_op_expr_in_p_op_expr3363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_bool_expr_in_p_op_expr3368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_builtin_primitive0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bool_or_expr_in_bool_expr3408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_bool_or_expr_in_p_bool_expr3418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bool_and_expr_in_bool_or_expr3427 = new BitSet(new long[]{0x0000000000000002L,0x0002400000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_bool_or_expr3430 = new BitSet(new long[]{0x0000000000000000L,0x0002400000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_token_OR_in_bool_or_expr3434 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_NL_in_bool_or_expr3437 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_bool_and_expr_in_bool_or_expr3441 = new BitSet(new long[]{0x0000000000000002L,0x0002400000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_p_bool_and_expr_in_p_bool_or_expr3453 = new BitSet(new long[]{0x0000000000000002L,0x0002400000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_p_bool_or_expr3456 = new BitSet(new long[]{0x0000000000000000L,0x0002400000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_token_OR_in_p_bool_or_expr3460 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_NL_in_p_bool_or_expr3463 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_p_bool_and_expr_in_p_bool_or_expr3467 = new BitSet(new long[]{0x0000000000000002L,0x0002400000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_bool_not_expr_in_bool_and_expr3479 = new BitSet(new long[]{0x0000000000000002L,0x0004800000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_bool_and_expr3482 = new BitSet(new long[]{0x0000000000000000L,0x0004800000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_token_AND_in_bool_and_expr3486 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_NL_in_bool_and_expr3489 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_bool_not_expr_in_bool_and_expr3493 = new BitSet(new long[]{0x0000000000000002L,0x0004800000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_p_bool_not_expr_in_p_bool_and_expr3505 = new BitSet(new long[]{0x0000000000000002L,0x0004800000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_p_bool_and_expr3508 = new BitSet(new long[]{0x0000000000000000L,0x0004800000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_token_AND_in_p_bool_and_expr3512 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_NL_in_p_bool_and_expr3515 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_p_bool_not_expr_in_p_bool_and_expr3519 = new BitSet(new long[]{0x0000000000000002L,0x0004800000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_token_NOT_in_bool_not_expr3531 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_NL_in_bool_not_expr3534 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_bool_not_expr_in_bool_not_expr3538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rel_expr_in_bool_not_expr3543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_NOT_in_p_bool_not_expr3554 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_NL_in_p_bool_not_expr3557 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_p_bool_not_expr_in_p_bool_not_expr3561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_rel_expr_in_p_bool_not_expr3566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arith_expr_in_rel_expr3575 = new BitSet(new long[]{0x0000000000000002L,0x0000003FF8000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_rel_expr3578 = new BitSet(new long[]{0x0000000000000000L,0x0000003FF8000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_rel_op_in_rel_expr3581 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_NL_in_rel_expr3583 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_arith_expr_in_rel_expr3586 = new BitSet(new long[]{0x0000000000000002L,0x0000003FF8000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_p_arith_expr_in_p_rel_expr3613 = new BitSet(new long[]{0x0000000000000002L,0x0000003FF8000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_p_rel_expr3616 = new BitSet(new long[]{0x0000000000000000L,0x0000003FF8000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_rel_op_in_p_rel_expr3619 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_NL_in_p_rel_expr3621 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_p_arith_expr_in_p_rel_expr3624 = new BitSet(new long[]{0x0000000000000002L,0x0000003FF8000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_token_EQUAL_in_rel_op3650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_NOT_EQUAL_in_rel_op3654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNRELATED_in_rel_op3658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATER_in_rel_op3662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_GREATER_EQ_in_rel_op3666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_in_rel_op3670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_LESS_EQ_in_rel_op3674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_plusplus_expr_in_arith_expr3686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_plusplus_expr_in_p_arith_expr3696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timestimes_expr_in_plusplus_expr3706 = new BitSet(new long[]{0x0000000000000002L,0x0180000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_plusplus_expr3709 = new BitSet(new long[]{0x0000000000000000L,0x0180000000000000L});
    public static final BitSet FOLLOW_PLUSPLUS_in_plusplus_expr3714 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_MINUSMINUS_in_plusplus_expr3717 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_NL_in_plusplus_expr3721 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_timestimes_expr_in_plusplus_expr3725 = new BitSet(new long[]{0x0000000000000002L,0x0180000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_p_timestimes_expr_in_p_plusplus_expr3737 = new BitSet(new long[]{0x0000000000000002L,0x0180000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_p_plusplus_expr3740 = new BitSet(new long[]{0x0000000000000000L,0x0180000000000000L});
    public static final BitSet FOLLOW_PLUSPLUS_in_p_plusplus_expr3745 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_MINUSMINUS_in_p_plusplus_expr3748 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_NL_in_p_plusplus_expr3752 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_p_timestimes_expr_in_p_plusplus_expr3756 = new BitSet(new long[]{0x0000000000000002L,0x0180000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_simple_expr_in_timestimes_expr3768 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_timestimes_expr3771 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_TIMESTIMES_in_timestimes_expr3776 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_NL_in_timestimes_expr3780 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_simple_expr_in_timestimes_expr3784 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_p_simple_expr_in_p_timestimes_expr3797 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_p_timestimes_expr3800 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_TIMESTIMES_in_p_timestimes_expr3805 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_NL_in_p_timestimes_expr3809 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_p_simple_expr_in_p_timestimes_expr3813 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_cons_expr_in_simple_expr3824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_cons_expr_in_p_simple_expr3833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_to_expr_in_cons_expr3842 = new BitSet(new long[]{0x0000000000000002L,0x0030000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_cons_expr3845 = new BitSet(new long[]{0x0000000000000000L,0x0030000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_token_DOUBLE_COLON_in_cons_expr3848 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_NL_in_cons_expr3850 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_to_expr_in_cons_expr3853 = new BitSet(new long[]{0x0000000000000002L,0x0030000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_p_to_expr_in_p_cons_expr3873 = new BitSet(new long[]{0x0000000000000002L,0x0030000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_p_cons_expr3876 = new BitSet(new long[]{0x0000000000000000L,0x0030000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_token_DOUBLE_COLON_in_p_cons_expr3879 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_NL_in_p_cons_expr3881 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_p_to_expr_in_p_cons_expr3884 = new BitSet(new long[]{0x0000000000000002L,0x0030000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_arith_plus_expr_in_to_expr3904 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000180L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_to_expr3907 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000180L});
    public static final BitSet FOLLOW_L_to_in_to_expr3912 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_L_downto_in_to_expr3916 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_NL_in_to_expr3920 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_arith_plus_expr_in_to_expr3924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_arith_plus_expr_in_p_to_expr3937 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000180L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_p_to_expr3940 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000180L});
    public static final BitSet FOLLOW_L_to_in_p_to_expr3945 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_L_downto_in_p_to_expr3949 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_NL_in_p_to_expr3953 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_p_arith_plus_expr_in_p_to_expr3957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arith_uminus_expr_in_arith_plus_expr3969 = new BitSet(new long[]{0x0000000000000002L,0x0000018000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_arith_plus_expr3973 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_PLUS_in_arith_plus_expr3977 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_MINUS_in_arith_plus_expr3982 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_NL_in_arith_plus_expr3986 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_arith_uminus_expr_in_arith_plus_expr3990 = new BitSet(new long[]{0x0000000000000002L,0x0000018000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_p_arith_uminus_expr_in_p_arith_plus_expr4001 = new BitSet(new long[]{0x0000000000000002L,0x0000018000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_p_arith_plus_expr4004 = new BitSet(new long[]{0x0000000000000000L,0x0000018000000000L});
    public static final BitSet FOLLOW_set_in_p_arith_plus_expr4008 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_NL_in_p_arith_plus_expr4017 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_p_arith_uminus_expr_in_p_arith_plus_expr4021 = new BitSet(new long[]{0x0000000000000002L,0x0000018000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_MINUS_in_arith_uminus_expr4034 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_NL_in_arith_uminus_expr4036 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_arith_mult_expr_in_arith_uminus_expr4039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arith_mult_expr_in_arith_uminus_expr4052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_p_arith_uminus_expr4063 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_NL_in_p_arith_uminus_expr4065 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_p_arith_mult_expr_in_p_arith_uminus_expr4068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_arith_mult_expr_in_p_arith_uminus_expr4081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arith_pow_expr_in_arith_mult_expr4090 = new BitSet(new long[]{0x0000000000000002L,0x00000E0000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_arith_mult_expr4093 = new BitSet(new long[]{0x0000000000000000L,0x00000E0000000000L});
    public static final BitSet FOLLOW_set_in_arith_mult_expr4097 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_NL_in_arith_mult_expr4110 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_arith_pow_expr_in_arith_mult_expr4114 = new BitSet(new long[]{0x0000000000000002L,0x00000E0000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_p_arith_pow_expr_in_p_arith_mult_expr4126 = new BitSet(new long[]{0x0000000000000002L,0x00000E0000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_p_arith_mult_expr4129 = new BitSet(new long[]{0x0000000000000000L,0x00000E0000000000L});
    public static final BitSet FOLLOW_set_in_p_arith_mult_expr4133 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_NL_in_p_arith_mult_expr4146 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_p_arith_pow_expr_in_p_arith_mult_expr4150 = new BitSet(new long[]{0x0000000000000002L,0x00000E0000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_apply_expr_in_arith_pow_expr4161 = new BitSet(new long[]{0x0000000000000002L,0x0000100000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_arith_pow_expr4164 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_POW_tok_in_arith_pow_expr4167 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_NL_in_arith_pow_expr4169 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_apply_expr_in_arith_pow_expr4172 = new BitSet(new long[]{0x0000000000000002L,0x0000100000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_p_apply_expr_in_p_arith_pow_expr4193 = new BitSet(new long[]{0x0000000000000002L,0x0000100000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_p_arith_pow_expr4196 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_POW_tok_in_p_arith_pow_expr4199 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_NL_in_p_arith_pow_expr4201 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_p_apply_expr_in_p_arith_pow_expr4204 = new BitSet(new long[]{0x0000000000000002L,0x0000100000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_basic_expr_in_apply_expr4225 = new BitSet(new long[]{0x3190000000000002L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_p_basic_expr_in_p_apply_expr4243 = new BitSet(new long[]{0x3190000000000002L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_NL_in_p_apply_expr4246 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_p_basic_expr_in_p_apply_expr4249 = new BitSet(new long[]{0x3190000000000002L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_message_send_expr_in_basic_expr4269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_message_send_expr_in_p_basic_expr4278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitive_expr_in_message_send_expr4287 = new BitSet(new long[]{0x0000000000000002L,0x8000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_message_send_expr4290 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_PERIOD_in_message_send_expr4293 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000A0L});
    public static final BitSet FOLLOW_NL_in_message_send_expr4295 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_Id_in_message_send_expr4298 = new BitSet(new long[]{0x0000000000000002L,0x8000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_SQUARE_BRACKET_OPEN_in_list_expr4322 = new BitSet(new long[]{0x31D0000000000000L,0x0009210003EE8643L,0x000000000002EDE4L});
    public static final BitSet FOLLOW_NL_in_list_expr4324 = new BitSet(new long[]{0x31D0000000000000L,0x0009210003EE8643L,0x000000000002EDE4L});
    public static final BitSet FOLLOW_protected_expr_in_list_expr4328 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004021L});
    public static final BitSet FOLLOW_NL_in_list_expr4331 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_COMMA_in_list_expr4334 = new BitSet(new long[]{0x31D0000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_NL_in_list_expr4336 = new BitSet(new long[]{0x31D0000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_protected_expr_in_list_expr4339 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004021L});
    public static final BitSet FOLLOW_NL_in_list_expr4343 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_SQUARE_BRACKET_CLOSE_in_list_expr4348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROUND_BRACKET_OPEN_in_list_expr4362 = new BitSet(new long[]{0x31D0000000000000L,0x0009210003EE8643L,0x000000000002BDE4L});
    public static final BitSet FOLLOW_NL_in_list_expr4364 = new BitSet(new long[]{0x31D0000000000000L,0x0009210003EE8643L,0x000000000002BDE4L});
    public static final BitSet FOLLOW_protected_expr_in_list_expr4368 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001021L});
    public static final BitSet FOLLOW_NL_in_list_expr4371 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_COMMA_in_list_expr4374 = new BitSet(new long[]{0x31D0000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_NL_in_list_expr4376 = new BitSet(new long[]{0x31D0000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_protected_expr_in_list_expr4379 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001021L});
    public static final BitSet FOLLOW_NL_in_list_expr4383 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001001L});
    public static final BitSet FOLLOW_COMMA_in_list_expr4387 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001020L});
    public static final BitSet FOLLOW_NL_in_list_expr4389 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ROUND_BRACKET_CLOSE_in_list_expr4396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURLY_BRACKET_OPEN_in_map_or_set_expr4425 = new BitSet(new long[]{0x31D0000000000000L,0x0009210003EE8643L,0x000000000003ADE4L});
    public static final BitSet FOLLOW_NL_in_map_or_set_expr4427 = new BitSet(new long[]{0x31D0000000000000L,0x0009210003EE8643L,0x000000000003ADE4L});
    public static final BitSet FOLLOW_map_or_set_elem_expr_in_map_or_set_expr4431 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010021L});
    public static final BitSet FOLLOW_NL_in_map_or_set_expr4433 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010001L});
    public static final BitSet FOLLOW_COMMA_in_map_or_set_expr4437 = new BitSet(new long[]{0x31D0000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_NL_in_map_or_set_expr4439 = new BitSet(new long[]{0x31D0000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_map_or_set_elem_expr_in_map_or_set_expr4442 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010021L});
    public static final BitSet FOLLOW_NL_in_map_or_set_expr4444 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010001L});
    public static final BitSet FOLLOW_CURLY_BRACKET_CLOSE_in_map_or_set_expr4451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURLY_BRACKET_OPEN_in_map_or_set_expr4471 = new BitSet(new long[]{0x0000000000000000L,0x1800000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_map_or_set_expr4473 = new BitSet(new long[]{0x0000000000000000L,0x1800000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_token_ARROW_in_map_or_set_expr4476 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010020L});
    public static final BitSet FOLLOW_NL_in_map_or_set_expr4478 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_CURLY_BRACKET_CLOSE_in_map_or_set_expr4481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protected_expr_in_map_or_set_elem_expr4498 = new BitSet(new long[]{0x0000000000000002L,0x1800000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_map_or_set_elem_expr4502 = new BitSet(new long[]{0x0000000000000000L,0x1800000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_token_ARROW_in_map_or_set_elem_expr4505 = new BitSet(new long[]{0x31D0000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_NL_in_map_or_set_elem_expr4507 = new BitSet(new long[]{0x31D0000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_protected_expr_in_map_or_set_elem_expr4510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Num_in_primitive_expr4530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_String_in_primitive_expr4535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Id_in_primitive_expr4540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Constr_in_primitive_expr4545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_true_in_primitive_expr4550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_false_in_primitive_expr4555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_this_in_primitive_expr4560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_root_in_primitive_expr4566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_here_in_primitive_expr4571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MODULE_KEY_in_primitive_expr4577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_infinity_in_primitive_expr4582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_list_expr_in_primitive_expr4588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_with_control_expr_in_primitive_expr4593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_map_or_set_expr_in_primitive_expr4598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_prog4608 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_prog4610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Id_in_synpred1_babel171636 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_synpred1_babel171638 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_L_as_in_synpred1_babel171641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protected_expr_in_synpred2_babel171672 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000022L});
    public static final BitSet FOLLOW_NL_in_synpred2_babel171674 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_QUESTION_MARK_in_synpred2_babel171677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_synpred3_babel172642 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_objelem_assign_in_synpred3_babel172646 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_synpred3_babel172649 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ASSIGN_in_synpred3_babel172652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_expr_in_synpred4_babel172852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protected_lambda_expr_in_synpred5_babel172873 = new BitSet(new long[]{0x0000000000000002L});

}