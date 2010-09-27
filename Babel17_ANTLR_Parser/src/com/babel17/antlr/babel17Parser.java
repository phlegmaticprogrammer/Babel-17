// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g 2010-09-27 10:18:32

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PROG", "NIL_TOKEN", "ANY", "LAMBDA", "SQUARE_LIST", "ROUND_LIST", "LIST_CONS", "COMPARE", "APPLY", "IF", "MAP_OR_SET_OR_OBJ", "EMPTY_MAP", "EXCEPTION", "MATCH", "CASES", "OBJ", "FOR_EXPR", "WHILE_DO", "MESSAGE_SEND", "UMINUS", "POW", "PARENTS_PLUS", "PARENTS_MUL", "BLOCK", "BEGIN", "WITH", "VAL", "OBJELEM_ASSIGN", "ASSIGN", "ARROW", "DEF", "YIELD", "LAZY", "CONCURRENT", "MEMOIZE", "MEM_STRONG", "MEM_WEAK", "IF_PATTERN", "COMMENT1", "Newline", "NotNewline", "COMMENT2", "SmallLetter", "BigLetter", "Letter", "Digit", "Hex", "L_begin", "L_end", "L_obj", "L_with", "L_if", "L_then", "L_else", "L_elseif", "L_while", "L_for", "L_do", "L_yield", "L_match", "L_case", "L_as", "L_val", "L_def", "L_in", "L_exception", "L_to", "L_downto", "A_infinity", "U_infinity", "L_concurrent", "L_await", "L_lazy", "L_memoize", "L_true", "L_false", "L_this", "L_random", "L_nil", "A_EQUAL", "U_EQUAL", "A_NOT_EQUAL", "U_NOT_EQUAL", "LESS", "A_LESS_EQ", "U_LESS_EQ", "GREATER", "A_GREATER_EQ", "U_GREATER_EQ", "UNRELATED", "SC", "PLUS", "MINUS", "TIMES", "DIV", "MOD", "POW_tok", "A_OR", "A_AND", "A_NOT", "U_OR", "U_AND", "U_NOT", "A_DOUBLE_COLON", "U_DOUBLE_COLON", "TIMESTIMES", "PLUSPLUS", "MINUSMINUS", "A_DOUBLE_ARROW", "U_DOUBLE_ARROW", "A_ARROW", "U_ARROW", "A_ELLIPSIS", "U_ELLIPSIS", "PERIOD", "COMMA", "QUESTION_MARK", "TILDE", "WsChar", "WS", "NL", "Constr", "Id", "Num", "Charcode", "String", "ROUND_BRACKET_OPEN", "ROUND_BRACKET_CLOSE", "SQUARE_BRACKET_OPEN", "SQUARE_BRACKET_CLOSE", "CURLY_BRACKET_OPEN", "CURLY_BRACKET_CLOSE", "UNDERSCORE", "COLON"
    };
    public static final int U_AND=105;
    public static final int L_end=52;
    public static final int COMMENT1=42;
    public static final int COMMENT2=45;
    public static final int U_NOT_EQUAL=86;
    public static final int TIMESTIMES=109;
    public static final int BigLetter=47;
    public static final int ROUND_BRACKET_CLOSE=131;
    public static final int MOD=99;
    public static final int A_OR=101;
    public static final int MINUSMINUS=111;
    public static final int Newline=43;
    public static final int SQUARE_BRACKET_CLOSE=133;
    public static final int MAP_OR_SET_OR_OBJ=14;
    public static final int EOF=-1;
    public static final int U_DOUBLE_ARROW=113;
    public static final int L_exception=69;
    public static final int Num=127;
    public static final int EMPTY_MAP=15;
    public static final int GREATER=90;
    public static final int POW=24;
    public static final int L_concurrent=74;
    public static final int UNRELATED=93;
    public static final int L_await=75;
    public static final int L_false=79;
    public static final int L_nil=82;
    public static final int BEGIN=28;
    public static final int LIST_CONS=10;
    public static final int L_with=54;
    public static final int QUESTION_MARK=120;
    public static final int LESS=87;
    public static final int ROUND_BRACKET_OPEN=130;
    public static final int SQUARE_LIST=8;
    public static final int VAL=30;
    public static final int L_as=65;
    public static final int NL=124;
    public static final int MESSAGE_SEND=22;
    public static final int A_ARROW=114;
    public static final int A_DOUBLE_COLON=107;
    public static final int L_def=67;
    public static final int A_AND=102;
    public static final int EXCEPTION=16;
    public static final int L_this=80;
    public static final int PERIOD=118;
    public static final int SmallLetter=46;
    public static final int NIL_TOKEN=5;
    public static final int CURLY_BRACKET_OPEN=134;
    public static final int UNDERSCORE=136;
    public static final int MATCH=17;
    public static final int U_LESS_EQ=89;
    public static final int MEM_STRONG=39;
    public static final int L_to=70;
    public static final int WS=123;
    public static final int Charcode=128;
    public static final int L_do=61;
    public static final int L_val=66;
    public static final int L_match=63;
    public static final int L_obj=53;
    public static final int WsChar=122;
    public static final int Hex=50;
    public static final int CONCURRENT=37;
    public static final int L_for=60;
    public static final int Letter=48;
    public static final int APPLY=12;
    public static final int U_ARROW=115;
    public static final int L_else=57;
    public static final int A_EQUAL=83;
    public static final int DEF=34;
    public static final int L_begin=51;
    public static final int U_NOT=106;
    public static final int L_yield=62;
    public static final int PLUSPLUS=110;
    public static final int L_while=59;
    public static final int CASES=18;
    public static final int POW_tok=100;
    public static final int IF_PATTERN=41;
    public static final int A_ELLIPSIS=116;
    public static final int PARENTS_PLUS=25;
    public static final int A_DOUBLE_ARROW=112;
    public static final int SQUARE_BRACKET_OPEN=132;
    public static final int IF=13;
    public static final int PROG=4;
    public static final int U_OR=104;
    public static final int COMMA=119;
    public static final int OBJ=19;
    public static final int MEMOIZE=38;
    public static final int U_ELLIPSIS=117;
    public static final int TILDE=121;
    public static final int YIELD=35;
    public static final int COMPARE=11;
    public static final int U_GREATER_EQ=92;
    public static final int U_EQUAL=84;
    public static final int PLUS=95;
    public static final int String=129;
    public static final int LAMBDA=7;
    public static final int L_true=78;
    public static final int Id=126;
    public static final int A_infinity=72;
    public static final int WITH=29;
    public static final int L_in=68;
    public static final int A_NOT=103;
    public static final int LAZY=36;
    public static final int L_lazy=76;
    public static final int NotNewline=44;
    public static final int L_then=56;
    public static final int L_if=55;
    public static final int CURLY_BRACKET_CLOSE=135;
    public static final int UMINUS=23;
    public static final int FOR_EXPR=20;
    public static final int Constr=125;
    public static final int WHILE_DO=21;
    public static final int L_elseif=58;
    public static final int MINUS=96;
    public static final int Digit=49;
    public static final int L_memoize=77;
    public static final int MEM_WEAK=40;
    public static final int A_GREATER_EQ=91;
    public static final int ROUND_LIST=9;
    public static final int COLON=137;
    public static final int SC=94;
    public static final int L_downto=71;
    public static final int ANY=6;
    public static final int L_random=81;
    public static final int BLOCK=27;
    public static final int A_NOT_EQUAL=85;
    public static final int ASSIGN=32;
    public static final int U_DOUBLE_COLON=108;
    public static final int OBJELEM_ASSIGN=31;
    public static final int ARROW=33;
    public static final int L_case=64;
    public static final int DIV=98;
    public static final int TIMES=97;
    public static final int U_infinity=73;
    public static final int A_LESS_EQ=88;
    public static final int PARENTS_MUL=26;

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:175:1: token_infinity : ( A_infinity | U_infinity );
    public final babel17Parser.token_infinity_return token_infinity() throws RecognitionException {
        babel17Parser.token_infinity_return retval = new babel17Parser.token_infinity_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set1=null;

        CommonTree set1_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:176:2: ( A_infinity | U_infinity )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:203:1: token_EQUAL : ( A_EQUAL | U_EQUAL );
    public final babel17Parser.token_EQUAL_return token_EQUAL() throws RecognitionException {
        babel17Parser.token_EQUAL_return retval = new babel17Parser.token_EQUAL_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set2=null;

        CommonTree set2_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:204:2: ( A_EQUAL | U_EQUAL )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:211:1: token_NOT_EQUAL : ( A_NOT_EQUAL | U_NOT_EQUAL );
    public final babel17Parser.token_NOT_EQUAL_return token_NOT_EQUAL() throws RecognitionException {
        babel17Parser.token_NOT_EQUAL_return retval = new babel17Parser.token_NOT_EQUAL_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set3=null;

        CommonTree set3_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:212:2: ( A_NOT_EQUAL | U_NOT_EQUAL )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:220:1: token_LESS_EQ : ( A_LESS_EQ | U_LESS_EQ );
    public final babel17Parser.token_LESS_EQ_return token_LESS_EQ() throws RecognitionException {
        babel17Parser.token_LESS_EQ_return retval = new babel17Parser.token_LESS_EQ_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set4=null;

        CommonTree set4_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:221:2: ( A_LESS_EQ | U_LESS_EQ )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:230:1: token_GREATER_EQ : ( A_GREATER_EQ | U_GREATER_EQ );
    public final babel17Parser.token_GREATER_EQ_return token_GREATER_EQ() throws RecognitionException {
        babel17Parser.token_GREATER_EQ_return retval = new babel17Parser.token_GREATER_EQ_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set5=null;

        CommonTree set5_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:231:2: ( A_GREATER_EQ | U_GREATER_EQ )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:252:1: token_OR : ( A_OR | U_OR );
    public final babel17Parser.token_OR_return token_OR() throws RecognitionException {
        babel17Parser.token_OR_return retval = new babel17Parser.token_OR_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set6=null;

        CommonTree set6_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:252:9: ( A_OR | U_OR )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:253:1: token_AND : ( A_AND | U_AND );
    public final babel17Parser.token_AND_return token_AND() throws RecognitionException {
        babel17Parser.token_AND_return retval = new babel17Parser.token_AND_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set7=null;

        CommonTree set7_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:254:2: ( A_AND | U_AND )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:255:1: token_NOT : ( A_NOT | U_NOT );
    public final babel17Parser.token_NOT_return token_NOT() throws RecognitionException {
        babel17Parser.token_NOT_return retval = new babel17Parser.token_NOT_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set8=null;

        CommonTree set8_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:256:2: ( A_NOT | U_NOT )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:262:1: token_DOUBLE_COLON : ( A_DOUBLE_COLON | U_DOUBLE_COLON );
    public final babel17Parser.token_DOUBLE_COLON_return token_DOUBLE_COLON() throws RecognitionException {
        babel17Parser.token_DOUBLE_COLON_return retval = new babel17Parser.token_DOUBLE_COLON_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set9=null;

        CommonTree set9_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:263:2: ( A_DOUBLE_COLON | U_DOUBLE_COLON )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:278:1: token_DOUBLE_ARROW : ( A_DOUBLE_ARROW | U_DOUBLE_ARROW );
    public final babel17Parser.token_DOUBLE_ARROW_return token_DOUBLE_ARROW() throws RecognitionException {
        babel17Parser.token_DOUBLE_ARROW_return retval = new babel17Parser.token_DOUBLE_ARROW_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set10=null;

        CommonTree set10_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:279:2: ( A_DOUBLE_ARROW | U_DOUBLE_ARROW )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:283:1: token_ARROW : ( A_ARROW | U_ARROW );
    public final babel17Parser.token_ARROW_return token_ARROW() throws RecognitionException {
        babel17Parser.token_ARROW_return retval = new babel17Parser.token_ARROW_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set11=null;

        CommonTree set11_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:284:2: ( A_ARROW | U_ARROW )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:289:1: token_ELLIPSIS : ( A_ELLIPSIS | U_ELLIPSIS );
    public final babel17Parser.token_ELLIPSIS_return token_ELLIPSIS() throws RecognitionException {
        babel17Parser.token_ELLIPSIS_return retval = new babel17Parser.token_ELLIPSIS_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set12=null;

        CommonTree set12_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:290:2: ( A_ELLIPSIS | U_ELLIPSIS )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:349:1: pattern : ( Constr ( ( NL )? primitive_pattern )? -> ^( Constr ( primitive_pattern )? ) | primitive_pattern ( ( NL )? token_DOUBLE_COLON ( NL )? primitive_pattern )* -> ^( LIST_CONS ( primitive_pattern )* ) | L_exception primitive_pattern -> ^( L_exception primitive_pattern ) | token_ELLIPSIS );
    public final babel17Parser.pattern_return pattern() throws RecognitionException {
        babel17Parser.pattern_return retval = new babel17Parser.pattern_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Constr13=null;
        Token NL14=null;
        Token NL17=null;
        Token NL19=null;
        Token L_exception21=null;
        babel17Parser.primitive_pattern_return primitive_pattern15 = null;

        babel17Parser.primitive_pattern_return primitive_pattern16 = null;

        babel17Parser.token_DOUBLE_COLON_return token_DOUBLE_COLON18 = null;

        babel17Parser.primitive_pattern_return primitive_pattern20 = null;

        babel17Parser.primitive_pattern_return primitive_pattern22 = null;

        babel17Parser.token_ELLIPSIS_return token_ELLIPSIS23 = null;


        CommonTree Constr13_tree=null;
        CommonTree NL14_tree=null;
        CommonTree NL17_tree=null;
        CommonTree NL19_tree=null;
        CommonTree L_exception21_tree=null;
        RewriteRuleTokenStream stream_L_exception=new RewriteRuleTokenStream(adaptor,"token L_exception");
        RewriteRuleTokenStream stream_Constr=new RewriteRuleTokenStream(adaptor,"token Constr");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_primitive_pattern=new RewriteRuleSubtreeStream(adaptor,"rule primitive_pattern");
        RewriteRuleSubtreeStream stream_token_DOUBLE_COLON=new RewriteRuleSubtreeStream(adaptor,"rule token_DOUBLE_COLON");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:349:9: ( Constr ( ( NL )? primitive_pattern )? -> ^( Constr ( primitive_pattern )? ) | primitive_pattern ( ( NL )? token_DOUBLE_COLON ( NL )? primitive_pattern )* -> ^( LIST_CONS ( primitive_pattern )* ) | L_exception primitive_pattern -> ^( L_exception primitive_pattern ) | token_ELLIPSIS )
            int alt6=4;
            switch ( input.LA(1) ) {
            case Constr:
                {
                alt6=1;
                }
                break;
            case A_infinity:
            case U_infinity:
            case L_true:
            case L_false:
            case L_nil:
            case MINUS:
            case Id:
            case Num:
            case String:
            case ROUND_BRACKET_OPEN:
            case SQUARE_BRACKET_OPEN:
            case CURLY_BRACKET_OPEN:
            case UNDERSCORE:
                {
                alt6=2;
                }
                break;
            case L_exception:
                {
                alt6=3;
                }
                break;
            case A_ELLIPSIS:
            case U_ELLIPSIS:
                {
                alt6=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:349:11: Constr ( ( NL )? primitive_pattern )?
                    {
                    Constr13=(Token)match(input,Constr,FOLLOW_Constr_in_pattern1506); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Constr.add(Constr13);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:349:18: ( ( NL )? primitive_pattern )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==NL) ) {
                        int LA2_1 = input.LA(2);

                        if ( ((LA2_1>=A_infinity && LA2_1<=U_infinity)||(LA2_1>=L_true && LA2_1<=L_false)||LA2_1==L_nil||LA2_1==MINUS||(LA2_1>=Id && LA2_1<=Num)||(LA2_1>=String && LA2_1<=ROUND_BRACKET_OPEN)||LA2_1==SQUARE_BRACKET_OPEN||LA2_1==CURLY_BRACKET_OPEN||LA2_1==UNDERSCORE) ) {
                            alt2=1;
                        }
                    }
                    else if ( ((LA2_0>=A_infinity && LA2_0<=U_infinity)||(LA2_0>=L_true && LA2_0<=L_false)||LA2_0==L_nil||LA2_0==MINUS||(LA2_0>=Id && LA2_0<=Num)||(LA2_0>=String && LA2_0<=ROUND_BRACKET_OPEN)||LA2_0==SQUARE_BRACKET_OPEN||LA2_0==CURLY_BRACKET_OPEN||LA2_0==UNDERSCORE) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:349:19: ( NL )? primitive_pattern
                            {
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:349:19: ( NL )?
                            int alt1=2;
                            int LA1_0 = input.LA(1);

                            if ( (LA1_0==NL) ) {
                                alt1=1;
                            }
                            switch (alt1) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:349:19: NL
                                    {
                                    NL14=(Token)match(input,NL,FOLLOW_NL_in_pattern1509); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL14);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_primitive_pattern_in_pattern1512);
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
                    // 349:43: -> ^( Constr ( primitive_pattern )? )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:349:46: ^( Constr ( primitive_pattern )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_Constr.nextNode(), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:349:55: ( primitive_pattern )?
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:350:4: primitive_pattern ( ( NL )? token_DOUBLE_COLON ( NL )? primitive_pattern )*
                    {
                    pushFollow(FOLLOW_primitive_pattern_in_pattern1528);
                    primitive_pattern16=primitive_pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primitive_pattern.add(primitive_pattern16.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:350:22: ( ( NL )? token_DOUBLE_COLON ( NL )? primitive_pattern )*
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
                    	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:350:23: ( NL )? token_DOUBLE_COLON ( NL )? primitive_pattern
                    	    {
                    	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:350:23: ( NL )?
                    	    int alt3=2;
                    	    int LA3_0 = input.LA(1);

                    	    if ( (LA3_0==NL) ) {
                    	        alt3=1;
                    	    }
                    	    switch (alt3) {
                    	        case 1 :
                    	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:350:23: NL
                    	            {
                    	            NL17=(Token)match(input,NL,FOLLOW_NL_in_pattern1531); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_NL.add(NL17);


                    	            }
                    	            break;

                    	    }

                    	    pushFollow(FOLLOW_token_DOUBLE_COLON_in_pattern1534);
                    	    token_DOUBLE_COLON18=token_DOUBLE_COLON();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_token_DOUBLE_COLON.add(token_DOUBLE_COLON18.getTree());
                    	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:350:46: ( NL )?
                    	    int alt4=2;
                    	    int LA4_0 = input.LA(1);

                    	    if ( (LA4_0==NL) ) {
                    	        alt4=1;
                    	    }
                    	    switch (alt4) {
                    	        case 1 :
                    	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:350:46: NL
                    	            {
                    	            NL19=(Token)match(input,NL,FOLLOW_NL_in_pattern1536); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_NL.add(NL19);


                    	            }
                    	            break;

                    	    }

                    	    pushFollow(FOLLOW_primitive_pattern_in_pattern1539);
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
                    // 351:3: -> ^( LIST_CONS ( primitive_pattern )* )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:351:6: ^( LIST_CONS ( primitive_pattern )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LIST_CONS, "LIST_CONS"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:351:18: ( primitive_pattern )*
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
                case 3 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:352:4: L_exception primitive_pattern
                    {
                    L_exception21=(Token)match(input,L_exception,FOLLOW_L_exception_in_pattern1558); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_exception.add(L_exception21);

                    pushFollow(FOLLOW_primitive_pattern_in_pattern1560);
                    primitive_pattern22=primitive_pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primitive_pattern.add(primitive_pattern22.getTree());


                    // AST REWRITE
                    // elements: L_exception, primitive_pattern
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 352:34: -> ^( L_exception primitive_pattern )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:352:37: ^( L_exception primitive_pattern )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_L_exception.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_primitive_pattern.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:353:4: token_ELLIPSIS
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_ELLIPSIS_in_pattern1573);
                    token_ELLIPSIS23=token_ELLIPSIS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, token_ELLIPSIS23.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:355:1: bracket_pattern : ( ( Id ( NL )? L_as )=> Id ( NL )? L_as ( NL )? pattern -> ^( L_as Id pattern ) | ( protected_expr ( NL )? QUESTION_MARK )=> protected_expr ( NL )? QUESTION_MARK ( ( NL )? pattern )? -> ^( QUESTION_MARK protected_expr ( pattern )? ) | pattern ( ( NL )? L_if ( NL )? protected_expr )? -> ^( IF_PATTERN pattern ( protected_expr )? ) | L_val ( NL )? protected_expr -> ^( L_val protected_expr ) );
    public final babel17Parser.bracket_pattern_return bracket_pattern() throws RecognitionException {
        babel17Parser.bracket_pattern_return retval = new babel17Parser.bracket_pattern_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Id24=null;
        Token NL25=null;
        Token L_as26=null;
        Token NL27=null;
        Token NL30=null;
        Token QUESTION_MARK31=null;
        Token NL32=null;
        Token NL35=null;
        Token L_if36=null;
        Token NL37=null;
        Token L_val39=null;
        Token NL40=null;
        babel17Parser.pattern_return pattern28 = null;

        babel17Parser.protected_expr_return protected_expr29 = null;

        babel17Parser.pattern_return pattern33 = null;

        babel17Parser.pattern_return pattern34 = null;

        babel17Parser.protected_expr_return protected_expr38 = null;

        babel17Parser.protected_expr_return protected_expr41 = null;


        CommonTree Id24_tree=null;
        CommonTree NL25_tree=null;
        CommonTree L_as26_tree=null;
        CommonTree NL27_tree=null;
        CommonTree NL30_tree=null;
        CommonTree QUESTION_MARK31_tree=null;
        CommonTree NL32_tree=null;
        CommonTree NL35_tree=null;
        CommonTree L_if36_tree=null;
        CommonTree NL37_tree=null;
        CommonTree L_val39_tree=null;
        CommonTree NL40_tree=null;
        RewriteRuleTokenStream stream_L_as=new RewriteRuleTokenStream(adaptor,"token L_as");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_Id=new RewriteRuleTokenStream(adaptor,"token Id");
        RewriteRuleTokenStream stream_L_val=new RewriteRuleTokenStream(adaptor,"token L_val");
        RewriteRuleTokenStream stream_L_if=new RewriteRuleTokenStream(adaptor,"token L_if");
        RewriteRuleTokenStream stream_QUESTION_MARK=new RewriteRuleTokenStream(adaptor,"token QUESTION_MARK");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_protected_expr=new RewriteRuleSubtreeStream(adaptor,"rule protected_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:356:2: ( ( Id ( NL )? L_as )=> Id ( NL )? L_as ( NL )? pattern -> ^( L_as Id pattern ) | ( protected_expr ( NL )? QUESTION_MARK )=> protected_expr ( NL )? QUESTION_MARK ( ( NL )? pattern )? -> ^( QUESTION_MARK protected_expr ( pattern )? ) | pattern ( ( NL )? L_if ( NL )? protected_expr )? -> ^( IF_PATTERN pattern ( protected_expr )? ) | L_val ( NL )? protected_expr -> ^( L_val protected_expr ) )
            int alt16=4;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:356:10: ( Id ( NL )? L_as )=> Id ( NL )? L_as ( NL )? pattern
                    {
                    Id24=(Token)match(input,Id,FOLLOW_Id_in_bracket_pattern1600); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Id.add(Id24);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:356:30: ( NL )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==NL) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:356:30: NL
                            {
                            NL25=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1602); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL25);


                            }
                            break;

                    }

                    L_as26=(Token)match(input,L_as,FOLLOW_L_as_in_bracket_pattern1605); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_as.add(L_as26);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:356:39: ( NL )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==NL) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:356:39: NL
                            {
                            NL27=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1607); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL27);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_pattern_in_bracket_pattern1610);
                    pattern28=pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pattern.add(pattern28.getTree());


                    // AST REWRITE
                    // elements: L_as, pattern, Id
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 356:51: -> ^( L_as Id pattern )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:356:54: ^( L_as Id pattern )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:357:4: ( protected_expr ( NL )? QUESTION_MARK )=> protected_expr ( NL )? QUESTION_MARK ( ( NL )? pattern )?
                    {
                    pushFollow(FOLLOW_protected_expr_in_bracket_pattern1639);
                    protected_expr29=protected_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr29.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:358:18: ( NL )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==NL) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:358:18: NL
                            {
                            NL30=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1641); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL30);


                            }
                            break;

                    }

                    QUESTION_MARK31=(Token)match(input,QUESTION_MARK,FOLLOW_QUESTION_MARK_in_bracket_pattern1644); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QUESTION_MARK.add(QUESTION_MARK31);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:358:36: ( ( NL )? pattern )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==NL) ) {
                        int LA11_1 = input.LA(2);

                        if ( (LA11_1==L_exception||(LA11_1>=A_infinity && LA11_1<=U_infinity)||(LA11_1>=L_true && LA11_1<=L_false)||LA11_1==L_nil||LA11_1==MINUS||(LA11_1>=A_ELLIPSIS && LA11_1<=U_ELLIPSIS)||(LA11_1>=Constr && LA11_1<=Num)||(LA11_1>=String && LA11_1<=ROUND_BRACKET_OPEN)||LA11_1==SQUARE_BRACKET_OPEN||LA11_1==CURLY_BRACKET_OPEN||LA11_1==UNDERSCORE) ) {
                            alt11=1;
                        }
                    }
                    else if ( (LA11_0==L_exception||(LA11_0>=A_infinity && LA11_0<=U_infinity)||(LA11_0>=L_true && LA11_0<=L_false)||LA11_0==L_nil||LA11_0==MINUS||(LA11_0>=A_ELLIPSIS && LA11_0<=U_ELLIPSIS)||(LA11_0>=Constr && LA11_0<=Num)||(LA11_0>=String && LA11_0<=ROUND_BRACKET_OPEN)||LA11_0==SQUARE_BRACKET_OPEN||LA11_0==CURLY_BRACKET_OPEN||LA11_0==UNDERSCORE) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:358:37: ( NL )? pattern
                            {
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:358:37: ( NL )?
                            int alt10=2;
                            int LA10_0 = input.LA(1);

                            if ( (LA10_0==NL) ) {
                                alt10=1;
                            }
                            switch (alt10) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:358:37: NL
                                    {
                                    NL32=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1647); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL32);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_pattern_in_bracket_pattern1650);
                            pattern33=pattern();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_pattern.add(pattern33.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: QUESTION_MARK, protected_expr, pattern
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 358:51: -> ^( QUESTION_MARK protected_expr ( pattern )? )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:358:54: ^( QUESTION_MARK protected_expr ( pattern )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_QUESTION_MARK.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_protected_expr.nextTree());
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:358:85: ( pattern )?
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:359:4: pattern ( ( NL )? L_if ( NL )? protected_expr )?
                    {
                    pushFollow(FOLLOW_pattern_in_bracket_pattern1668);
                    pattern34=pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pattern.add(pattern34.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:359:12: ( ( NL )? L_if ( NL )? protected_expr )?
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
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:359:13: ( NL )? L_if ( NL )? protected_expr
                            {
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:359:13: ( NL )?
                            int alt12=2;
                            int LA12_0 = input.LA(1);

                            if ( (LA12_0==NL) ) {
                                alt12=1;
                            }
                            switch (alt12) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:359:13: NL
                                    {
                                    NL35=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1671); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL35);


                                    }
                                    break;

                            }

                            L_if36=(Token)match(input,L_if,FOLLOW_L_if_in_bracket_pattern1674); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_L_if.add(L_if36);

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:359:22: ( NL )?
                            int alt13=2;
                            int LA13_0 = input.LA(1);

                            if ( (LA13_0==NL) ) {
                                alt13=1;
                            }
                            switch (alt13) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:359:22: NL
                                    {
                                    NL37=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1676); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL37);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_protected_expr_in_bracket_pattern1679);
                            protected_expr38=protected_expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr38.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: protected_expr, pattern
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 359:43: -> ^( IF_PATTERN pattern ( protected_expr )? )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:359:46: ^( IF_PATTERN pattern ( protected_expr )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IF_PATTERN, "IF_PATTERN"), root_1);

                        adaptor.addChild(root_1, stream_pattern.nextTree());
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:359:67: ( protected_expr )?
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:360:4: L_val ( NL )? protected_expr
                    {
                    L_val39=(Token)match(input,L_val,FOLLOW_L_val_in_bracket_pattern1697); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_val.add(L_val39);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:360:10: ( NL )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==NL) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:360:10: NL
                            {
                            NL40=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1699); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL40);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_protected_expr_in_bracket_pattern1702);
                    protected_expr41=protected_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr41.getTree());


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
                    // 360:29: -> ^( L_val protected_expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:360:32: ^( L_val protected_expr )
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

    public static class arrow_or_assign_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arrow_or_assign"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:362:1: arrow_or_assign : ( token_ARROW -> ^( ARROW ) | ASSIGN -> ^( ASSIGN ) );
    public final babel17Parser.arrow_or_assign_return arrow_or_assign() throws RecognitionException {
        babel17Parser.arrow_or_assign_return retval = new babel17Parser.arrow_or_assign_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ASSIGN43=null;
        babel17Parser.token_ARROW_return token_ARROW42 = null;


        CommonTree ASSIGN43_tree=null;
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_token_ARROW=new RewriteRuleSubtreeStream(adaptor,"rule token_ARROW");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:363:2: ( token_ARROW -> ^( ARROW ) | ASSIGN -> ^( ASSIGN ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=A_ARROW && LA17_0<=U_ARROW)) ) {
                alt17=1;
            }
            else if ( (LA17_0==ASSIGN) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:363:4: token_ARROW
                    {
                    pushFollow(FOLLOW_token_ARROW_in_arrow_or_assign1720);
                    token_ARROW42=token_ARROW();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_token_ARROW.add(token_ARROW42.getTree());


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
                    // 363:16: -> ^( ARROW )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:363:19: ^( ARROW )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARROW, "ARROW"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:364:4: ASSIGN
                    {
                    ASSIGN43=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_arrow_or_assign1731); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN43);



                    // AST REWRITE
                    // elements: ASSIGN
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 364:11: -> ^( ASSIGN )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:364:14: ^( ASSIGN )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_ASSIGN.nextNode(), root_1);

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
    // $ANTLR end "arrow_or_assign"

    public static class mselem_pattern_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mselem_pattern"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:366:1: mselem_pattern : bracket_pattern ( ( NL )? arrow_or_assign ( NL )? bracket_pattern )? -> ^( NIL_TOKEN ^( NIL_TOKEN ( bracket_pattern )* ) ( arrow_or_assign )* ) ;
    public final babel17Parser.mselem_pattern_return mselem_pattern() throws RecognitionException {
        babel17Parser.mselem_pattern_return retval = new babel17Parser.mselem_pattern_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL45=null;
        Token NL47=null;
        babel17Parser.bracket_pattern_return bracket_pattern44 = null;

        babel17Parser.arrow_or_assign_return arrow_or_assign46 = null;

        babel17Parser.bracket_pattern_return bracket_pattern48 = null;


        CommonTree NL45_tree=null;
        CommonTree NL47_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_arrow_or_assign=new RewriteRuleSubtreeStream(adaptor,"rule arrow_or_assign");
        RewriteRuleSubtreeStream stream_bracket_pattern=new RewriteRuleSubtreeStream(adaptor,"rule bracket_pattern");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:367:2: ( bracket_pattern ( ( NL )? arrow_or_assign ( NL )? bracket_pattern )? -> ^( NIL_TOKEN ^( NIL_TOKEN ( bracket_pattern )* ) ( arrow_or_assign )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:367:4: bracket_pattern ( ( NL )? arrow_or_assign ( NL )? bracket_pattern )?
            {
            pushFollow(FOLLOW_bracket_pattern_in_mselem_pattern1746);
            bracket_pattern44=bracket_pattern();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bracket_pattern.add(bracket_pattern44.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:367:20: ( ( NL )? arrow_or_assign ( NL )? bracket_pattern )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==NL) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==ASSIGN||(LA20_1>=A_ARROW && LA20_1<=U_ARROW)) ) {
                    alt20=1;
                }
            }
            else if ( (LA20_0==ASSIGN||(LA20_0>=A_ARROW && LA20_0<=U_ARROW)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:367:21: ( NL )? arrow_or_assign ( NL )? bracket_pattern
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:367:21: ( NL )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==NL) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:367:21: NL
                            {
                            NL45=(Token)match(input,NL,FOLLOW_NL_in_mselem_pattern1749); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL45);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_arrow_or_assign_in_mselem_pattern1752);
                    arrow_or_assign46=arrow_or_assign();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_arrow_or_assign.add(arrow_or_assign46.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:367:41: ( NL )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==NL) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:367:41: NL
                            {
                            NL47=(Token)match(input,NL,FOLLOW_NL_in_mselem_pattern1754); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL47);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_bracket_pattern_in_mselem_pattern1757);
                    bracket_pattern48=bracket_pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_bracket_pattern.add(bracket_pattern48.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: arrow_or_assign, bracket_pattern
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 368:3: -> ^( NIL_TOKEN ^( NIL_TOKEN ( bracket_pattern )* ) ( arrow_or_assign )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:368:6: ^( NIL_TOKEN ^( NIL_TOKEN ( bracket_pattern )* ) ( arrow_or_assign )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:368:18: ^( NIL_TOKEN ( bracket_pattern )* )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_2);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:368:30: ( bracket_pattern )*
                while ( stream_bracket_pattern.hasNext() ) {
                    adaptor.addChild(root_2, stream_bracket_pattern.nextTree());

                }
                stream_bracket_pattern.reset();

                adaptor.addChild(root_1, root_2);
                }
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:368:48: ( arrow_or_assign )*
                while ( stream_arrow_or_assign.hasNext() ) {
                    adaptor.addChild(root_1, stream_arrow_or_assign.nextTree());

                }
                stream_arrow_or_assign.reset();

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:370:1: primitive_pattern : ( Id | '_' -> ANY | String | Num | L_true | L_false | L_nil | token_infinity | '-' ( NL )? token_infinity -> ^( UMINUS token_infinity ) | '-' ( NL )? Num -> ^( UMINUS Num ) | '[' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* )? ']' -> ^( SQUARE_LIST ( bracket_pattern )* ) | '(' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* ( COMMA ( NL )? )? )? ')' -> ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( bracket_pattern )* ) ) | '{' ( NL )? ( mselem_pattern ( NL )? ( COMMA ( NL )? mselem_pattern ( NL )? )* )? '}' -> ^( MAP_OR_SET_OR_OBJ ( mselem_pattern )* ) | '{' ( NL )? token_ARROW ( NL )? '}' -> ^( EMPTY_MAP ) );
    public final babel17Parser.primitive_pattern_return primitive_pattern() throws RecognitionException {
        babel17Parser.primitive_pattern_return retval = new babel17Parser.primitive_pattern_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Id49=null;
        Token char_literal50=null;
        Token String51=null;
        Token Num52=null;
        Token L_true53=null;
        Token L_false54=null;
        Token L_nil55=null;
        Token char_literal57=null;
        Token NL58=null;
        Token char_literal60=null;
        Token NL61=null;
        Token Num62=null;
        Token char_literal63=null;
        Token NL64=null;
        Token NL66=null;
        Token COMMA67=null;
        Token NL68=null;
        Token NL70=null;
        Token char_literal71=null;
        Token char_literal72=null;
        Token NL73=null;
        Token NL75=null;
        Token COMMA76=null;
        Token NL77=null;
        Token NL79=null;
        Token COMMA80=null;
        Token NL81=null;
        Token char_literal82=null;
        Token char_literal83=null;
        Token NL84=null;
        Token NL86=null;
        Token COMMA87=null;
        Token NL88=null;
        Token NL90=null;
        Token char_literal91=null;
        Token char_literal92=null;
        Token NL93=null;
        Token NL95=null;
        Token char_literal96=null;
        babel17Parser.token_infinity_return token_infinity56 = null;

        babel17Parser.token_infinity_return token_infinity59 = null;

        babel17Parser.bracket_pattern_return bracket_pattern65 = null;

        babel17Parser.bracket_pattern_return bracket_pattern69 = null;

        babel17Parser.bracket_pattern_return bracket_pattern74 = null;

        babel17Parser.bracket_pattern_return bracket_pattern78 = null;

        babel17Parser.mselem_pattern_return mselem_pattern85 = null;

        babel17Parser.mselem_pattern_return mselem_pattern89 = null;

        babel17Parser.token_ARROW_return token_ARROW94 = null;


        CommonTree Id49_tree=null;
        CommonTree char_literal50_tree=null;
        CommonTree String51_tree=null;
        CommonTree Num52_tree=null;
        CommonTree L_true53_tree=null;
        CommonTree L_false54_tree=null;
        CommonTree L_nil55_tree=null;
        CommonTree char_literal57_tree=null;
        CommonTree NL58_tree=null;
        CommonTree char_literal60_tree=null;
        CommonTree NL61_tree=null;
        CommonTree Num62_tree=null;
        CommonTree char_literal63_tree=null;
        CommonTree NL64_tree=null;
        CommonTree NL66_tree=null;
        CommonTree COMMA67_tree=null;
        CommonTree NL68_tree=null;
        CommonTree NL70_tree=null;
        CommonTree char_literal71_tree=null;
        CommonTree char_literal72_tree=null;
        CommonTree NL73_tree=null;
        CommonTree NL75_tree=null;
        CommonTree COMMA76_tree=null;
        CommonTree NL77_tree=null;
        CommonTree NL79_tree=null;
        CommonTree COMMA80_tree=null;
        CommonTree NL81_tree=null;
        CommonTree char_literal82_tree=null;
        CommonTree char_literal83_tree=null;
        CommonTree NL84_tree=null;
        CommonTree NL86_tree=null;
        CommonTree COMMA87_tree=null;
        CommonTree NL88_tree=null;
        CommonTree NL90_tree=null;
        CommonTree char_literal91_tree=null;
        CommonTree char_literal92_tree=null;
        CommonTree NL93_tree=null;
        CommonTree NL95_tree=null;
        CommonTree char_literal96_tree=null;
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:371:2: ( Id | '_' -> ANY | String | Num | L_true | L_false | L_nil | token_infinity | '-' ( NL )? token_infinity -> ^( UMINUS token_infinity ) | '-' ( NL )? Num -> ^( UMINUS Num ) | '[' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* )? ']' -> ^( SQUARE_LIST ( bracket_pattern )* ) | '(' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* ( COMMA ( NL )? )? )? ')' -> ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( bracket_pattern )* ) ) | '{' ( NL )? ( mselem_pattern ( NL )? ( COMMA ( NL )? mselem_pattern ( NL )? )* )? '}' -> ^( MAP_OR_SET_OR_OBJ ( mselem_pattern )* ) | '{' ( NL )? token_ARROW ( NL )? '}' -> ^( EMPTY_MAP ) )
            int alt45=14;
            alt45 = dfa45.predict(input);
            switch (alt45) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:371:4: Id
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Id49=(Token)match(input,Id,FOLLOW_Id_in_primitive_pattern1786); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Id49_tree = (CommonTree)adaptor.create(Id49);
                    adaptor.addChild(root_0, Id49_tree);
                    }

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:372:4: '_'
                    {
                    char_literal50=(Token)match(input,UNDERSCORE,FOLLOW_UNDERSCORE_in_primitive_pattern1791); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_UNDERSCORE.add(char_literal50);



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
                    // 372:8: -> ANY
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(ANY, "ANY"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:373:4: String
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    String51=(Token)match(input,String,FOLLOW_String_in_primitive_pattern1800); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    String51_tree = (CommonTree)adaptor.create(String51);
                    adaptor.addChild(root_0, String51_tree);
                    }

                    }
                    break;
                case 4 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:374:4: Num
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Num52=(Token)match(input,Num,FOLLOW_Num_in_primitive_pattern1805); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Num52_tree = (CommonTree)adaptor.create(Num52);
                    adaptor.addChild(root_0, Num52_tree);
                    }

                    }
                    break;
                case 5 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:375:4: L_true
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    L_true53=(Token)match(input,L_true,FOLLOW_L_true_in_primitive_pattern1810); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    L_true53_tree = (CommonTree)adaptor.create(L_true53);
                    adaptor.addChild(root_0, L_true53_tree);
                    }

                    }
                    break;
                case 6 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:376:4: L_false
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    L_false54=(Token)match(input,L_false,FOLLOW_L_false_in_primitive_pattern1815); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    L_false54_tree = (CommonTree)adaptor.create(L_false54);
                    adaptor.addChild(root_0, L_false54_tree);
                    }

                    }
                    break;
                case 7 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:377:4: L_nil
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    L_nil55=(Token)match(input,L_nil,FOLLOW_L_nil_in_primitive_pattern1820); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    L_nil55_tree = (CommonTree)adaptor.create(L_nil55);
                    adaptor.addChild(root_0, L_nil55_tree);
                    }

                    }
                    break;
                case 8 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:378:4: token_infinity
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_infinity_in_primitive_pattern1825);
                    token_infinity56=token_infinity();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, token_infinity56.getTree());

                    }
                    break;
                case 9 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:379:4: '-' ( NL )? token_infinity
                    {
                    char_literal57=(Token)match(input,MINUS,FOLLOW_MINUS_in_primitive_pattern1830); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(char_literal57);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:379:8: ( NL )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==NL) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:379:8: NL
                            {
                            NL58=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern1832); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL58);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_token_infinity_in_primitive_pattern1835);
                    token_infinity59=token_infinity();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_token_infinity.add(token_infinity59.getTree());


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
                    // 379:27: -> ^( UMINUS token_infinity )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:379:30: ^( UMINUS token_infinity )
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
                case 10 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:380:4: '-' ( NL )? Num
                    {
                    char_literal60=(Token)match(input,MINUS,FOLLOW_MINUS_in_primitive_pattern1848); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(char_literal60);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:380:8: ( NL )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==NL) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:380:8: NL
                            {
                            NL61=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern1850); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL61);


                            }
                            break;

                    }

                    Num62=(Token)match(input,Num,FOLLOW_Num_in_primitive_pattern1853); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Num.add(Num62);



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
                    // 380:16: -> ^( UMINUS Num )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:380:19: ^( UMINUS Num )
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
                case 11 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:381:4: '[' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* )? ']'
                    {
                    char_literal63=(Token)match(input,SQUARE_BRACKET_OPEN,FOLLOW_SQUARE_BRACKET_OPEN_in_primitive_pattern1866); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SQUARE_BRACKET_OPEN.add(char_literal63);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:381:9: ( NL )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==NL) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:381:9: NL
                            {
                            NL64=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern1869); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL64);


                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:381:13: ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==L_begin||(LA28_0>=L_obj && LA28_0<=L_if)||(LA28_0>=L_while && LA28_0<=L_for)||(LA28_0>=L_match && LA28_0<=L_case)||LA28_0==L_val||LA28_0==L_exception||(LA28_0>=A_infinity && LA28_0<=L_lazy)||(LA28_0>=L_true && LA28_0<=L_nil)||LA28_0==MINUS||LA28_0==A_NOT||LA28_0==U_NOT||(LA28_0>=A_ELLIPSIS && LA28_0<=U_ELLIPSIS)||LA28_0==TILDE||(LA28_0>=Constr && LA28_0<=Num)||(LA28_0>=String && LA28_0<=ROUND_BRACKET_OPEN)||LA28_0==SQUARE_BRACKET_OPEN||LA28_0==CURLY_BRACKET_OPEN||LA28_0==UNDERSCORE) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:381:14: bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )*
                            {
                            pushFollow(FOLLOW_bracket_pattern_in_primitive_pattern1873);
                            bracket_pattern65=bracket_pattern();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_bracket_pattern.add(bracket_pattern65.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:381:30: ( NL )?
                            int alt24=2;
                            int LA24_0 = input.LA(1);

                            if ( (LA24_0==NL) ) {
                                alt24=1;
                            }
                            switch (alt24) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:381:30: NL
                                    {
                                    NL66=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern1875); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL66);


                                    }
                                    break;

                            }

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:381:34: ( COMMA ( NL )? bracket_pattern ( NL )? )*
                            loop27:
                            do {
                                int alt27=2;
                                int LA27_0 = input.LA(1);

                                if ( (LA27_0==COMMA) ) {
                                    alt27=1;
                                }


                                switch (alt27) {
                            	case 1 :
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:381:36: COMMA ( NL )? bracket_pattern ( NL )?
                            	    {
                            	    COMMA67=(Token)match(input,COMMA,FOLLOW_COMMA_in_primitive_pattern1880); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA67);

                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:381:42: ( NL )?
                            	    int alt25=2;
                            	    int LA25_0 = input.LA(1);

                            	    if ( (LA25_0==NL) ) {
                            	        alt25=1;
                            	    }
                            	    switch (alt25) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:381:42: NL
                            	            {
                            	            NL68=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern1882); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL68);


                            	            }
                            	            break;

                            	    }

                            	    pushFollow(FOLLOW_bracket_pattern_in_primitive_pattern1885);
                            	    bracket_pattern69=bracket_pattern();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_bracket_pattern.add(bracket_pattern69.getTree());
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:381:62: ( NL )?
                            	    int alt26=2;
                            	    int LA26_0 = input.LA(1);

                            	    if ( (LA26_0==NL) ) {
                            	        alt26=1;
                            	    }
                            	    switch (alt26) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:381:62: NL
                            	            {
                            	            NL70=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern1887); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL70);


                            	            }
                            	            break;

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop27;
                                }
                            } while (true);


                            }
                            break;

                    }

                    char_literal71=(Token)match(input,SQUARE_BRACKET_CLOSE,FOLLOW_SQUARE_BRACKET_CLOSE_in_primitive_pattern1895); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SQUARE_BRACKET_CLOSE.add(char_literal71);



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
                    // 382:6: -> ^( SQUARE_LIST ( bracket_pattern )* )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:382:9: ^( SQUARE_LIST ( bracket_pattern )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SQUARE_LIST, "SQUARE_LIST"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:382:23: ( bracket_pattern )*
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
                case 12 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:383:4: '(' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* ( COMMA ( NL )? )? )? ')'
                    {
                    char_literal72=(Token)match(input,ROUND_BRACKET_OPEN,FOLLOW_ROUND_BRACKET_OPEN_in_primitive_pattern1915); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ROUND_BRACKET_OPEN.add(char_literal72);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:383:9: ( NL )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==NL) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:383:9: NL
                            {
                            NL73=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern1918); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL73);


                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:383:13: ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* ( COMMA ( NL )? )? )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==L_begin||(LA36_0>=L_obj && LA36_0<=L_if)||(LA36_0>=L_while && LA36_0<=L_for)||(LA36_0>=L_match && LA36_0<=L_case)||LA36_0==L_val||LA36_0==L_exception||(LA36_0>=A_infinity && LA36_0<=L_lazy)||(LA36_0>=L_true && LA36_0<=L_nil)||LA36_0==MINUS||LA36_0==A_NOT||LA36_0==U_NOT||(LA36_0>=A_ELLIPSIS && LA36_0<=U_ELLIPSIS)||LA36_0==TILDE||(LA36_0>=Constr && LA36_0<=Num)||(LA36_0>=String && LA36_0<=ROUND_BRACKET_OPEN)||LA36_0==SQUARE_BRACKET_OPEN||LA36_0==CURLY_BRACKET_OPEN||LA36_0==UNDERSCORE) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:383:14: bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* ( COMMA ( NL )? )?
                            {
                            pushFollow(FOLLOW_bracket_pattern_in_primitive_pattern1922);
                            bracket_pattern74=bracket_pattern();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_bracket_pattern.add(bracket_pattern74.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:383:30: ( NL )?
                            int alt30=2;
                            int LA30_0 = input.LA(1);

                            if ( (LA30_0==NL) ) {
                                alt30=1;
                            }
                            switch (alt30) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:383:30: NL
                                    {
                                    NL75=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern1924); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL75);


                                    }
                                    break;

                            }

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:383:34: ( COMMA ( NL )? bracket_pattern ( NL )? )*
                            loop33:
                            do {
                                int alt33=2;
                                int LA33_0 = input.LA(1);

                                if ( (LA33_0==COMMA) ) {
                                    int LA33_1 = input.LA(2);

                                    if ( (LA33_1==NL) ) {
                                        int LA33_3 = input.LA(3);

                                        if ( (LA33_3==L_begin||(LA33_3>=L_obj && LA33_3<=L_if)||(LA33_3>=L_while && LA33_3<=L_for)||(LA33_3>=L_match && LA33_3<=L_case)||LA33_3==L_val||LA33_3==L_exception||(LA33_3>=A_infinity && LA33_3<=L_lazy)||(LA33_3>=L_true && LA33_3<=L_nil)||LA33_3==MINUS||LA33_3==A_NOT||LA33_3==U_NOT||(LA33_3>=A_ELLIPSIS && LA33_3<=U_ELLIPSIS)||LA33_3==TILDE||(LA33_3>=Constr && LA33_3<=Num)||(LA33_3>=String && LA33_3<=ROUND_BRACKET_OPEN)||LA33_3==SQUARE_BRACKET_OPEN||LA33_3==CURLY_BRACKET_OPEN||LA33_3==UNDERSCORE) ) {
                                            alt33=1;
                                        }


                                    }
                                    else if ( (LA33_1==L_begin||(LA33_1>=L_obj && LA33_1<=L_if)||(LA33_1>=L_while && LA33_1<=L_for)||(LA33_1>=L_match && LA33_1<=L_case)||LA33_1==L_val||LA33_1==L_exception||(LA33_1>=A_infinity && LA33_1<=L_lazy)||(LA33_1>=L_true && LA33_1<=L_nil)||LA33_1==MINUS||LA33_1==A_NOT||LA33_1==U_NOT||(LA33_1>=A_ELLIPSIS && LA33_1<=U_ELLIPSIS)||LA33_1==TILDE||(LA33_1>=Constr && LA33_1<=Num)||(LA33_1>=String && LA33_1<=ROUND_BRACKET_OPEN)||LA33_1==SQUARE_BRACKET_OPEN||LA33_1==CURLY_BRACKET_OPEN||LA33_1==UNDERSCORE) ) {
                                        alt33=1;
                                    }


                                }


                                switch (alt33) {
                            	case 1 :
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:383:36: COMMA ( NL )? bracket_pattern ( NL )?
                            	    {
                            	    COMMA76=(Token)match(input,COMMA,FOLLOW_COMMA_in_primitive_pattern1929); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA76);

                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:383:43: ( NL )?
                            	    int alt31=2;
                            	    int LA31_0 = input.LA(1);

                            	    if ( (LA31_0==NL) ) {
                            	        alt31=1;
                            	    }
                            	    switch (alt31) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:383:43: NL
                            	            {
                            	            NL77=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern1932); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL77);


                            	            }
                            	            break;

                            	    }

                            	    pushFollow(FOLLOW_bracket_pattern_in_primitive_pattern1935);
                            	    bracket_pattern78=bracket_pattern();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_bracket_pattern.add(bracket_pattern78.getTree());
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:383:63: ( NL )?
                            	    int alt32=2;
                            	    int LA32_0 = input.LA(1);

                            	    if ( (LA32_0==NL) ) {
                            	        alt32=1;
                            	    }
                            	    switch (alt32) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:383:63: NL
                            	            {
                            	            NL79=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern1937); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL79);


                            	            }
                            	            break;

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop33;
                                }
                            } while (true);

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:383:69: ( COMMA ( NL )? )?
                            int alt35=2;
                            int LA35_0 = input.LA(1);

                            if ( (LA35_0==COMMA) ) {
                                alt35=1;
                            }
                            switch (alt35) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:383:70: COMMA ( NL )?
                                    {
                                    COMMA80=(Token)match(input,COMMA,FOLLOW_COMMA_in_primitive_pattern1943); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_COMMA.add(COMMA80);

                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:383:76: ( NL )?
                                    int alt34=2;
                                    int LA34_0 = input.LA(1);

                                    if ( (LA34_0==NL) ) {
                                        alt34=1;
                                    }
                                    switch (alt34) {
                                        case 1 :
                                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:383:76: NL
                                            {
                                            NL81=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern1945); if (state.failed) return retval; 
                                            if ( state.backtracking==0 ) stream_NL.add(NL81);


                                            }
                                            break;

                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    char_literal82=(Token)match(input,ROUND_BRACKET_CLOSE,FOLLOW_ROUND_BRACKET_CLOSE_in_primitive_pattern1952); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ROUND_BRACKET_CLOSE.add(char_literal82);



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
                    // 384:5: -> ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( bracket_pattern )* ) )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:384:8: ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( bracket_pattern )* ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ROUND_LIST, "ROUND_LIST"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:384:21: ^( NIL_TOKEN ( COMMA )* )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_2);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:384:33: ( COMMA )*
                        while ( stream_COMMA.hasNext() ) {
                            adaptor.addChild(root_2, stream_COMMA.nextNode());

                        }
                        stream_COMMA.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:384:41: ^( NIL_TOKEN ( bracket_pattern )* )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_2);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:384:53: ( bracket_pattern )*
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
                case 13 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:385:4: '{' ( NL )? ( mselem_pattern ( NL )? ( COMMA ( NL )? mselem_pattern ( NL )? )* )? '}'
                    {
                    char_literal83=(Token)match(input,CURLY_BRACKET_OPEN,FOLLOW_CURLY_BRACKET_OPEN_in_primitive_pattern1984); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_OPEN.add(char_literal83);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:385:9: ( NL )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==NL) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:385:9: NL
                            {
                            NL84=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern1987); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL84);


                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:385:13: ( mselem_pattern ( NL )? ( COMMA ( NL )? mselem_pattern ( NL )? )* )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==L_begin||(LA42_0>=L_obj && LA42_0<=L_if)||(LA42_0>=L_while && LA42_0<=L_for)||(LA42_0>=L_match && LA42_0<=L_case)||LA42_0==L_val||LA42_0==L_exception||(LA42_0>=A_infinity && LA42_0<=L_lazy)||(LA42_0>=L_true && LA42_0<=L_nil)||LA42_0==MINUS||LA42_0==A_NOT||LA42_0==U_NOT||(LA42_0>=A_ELLIPSIS && LA42_0<=U_ELLIPSIS)||LA42_0==TILDE||(LA42_0>=Constr && LA42_0<=Num)||(LA42_0>=String && LA42_0<=ROUND_BRACKET_OPEN)||LA42_0==SQUARE_BRACKET_OPEN||LA42_0==CURLY_BRACKET_OPEN||LA42_0==UNDERSCORE) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:385:14: mselem_pattern ( NL )? ( COMMA ( NL )? mselem_pattern ( NL )? )*
                            {
                            pushFollow(FOLLOW_mselem_pattern_in_primitive_pattern1991);
                            mselem_pattern85=mselem_pattern();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_mselem_pattern.add(mselem_pattern85.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:385:29: ( NL )?
                            int alt38=2;
                            int LA38_0 = input.LA(1);

                            if ( (LA38_0==NL) ) {
                                alt38=1;
                            }
                            switch (alt38) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:385:29: NL
                                    {
                                    NL86=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern1993); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL86);


                                    }
                                    break;

                            }

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:385:33: ( COMMA ( NL )? mselem_pattern ( NL )? )*
                            loop41:
                            do {
                                int alt41=2;
                                int LA41_0 = input.LA(1);

                                if ( (LA41_0==COMMA) ) {
                                    alt41=1;
                                }


                                switch (alt41) {
                            	case 1 :
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:385:35: COMMA ( NL )? mselem_pattern ( NL )?
                            	    {
                            	    COMMA87=(Token)match(input,COMMA,FOLLOW_COMMA_in_primitive_pattern1998); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA87);

                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:385:42: ( NL )?
                            	    int alt39=2;
                            	    int LA39_0 = input.LA(1);

                            	    if ( (LA39_0==NL) ) {
                            	        alt39=1;
                            	    }
                            	    switch (alt39) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:385:42: NL
                            	            {
                            	            NL88=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2001); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL88);


                            	            }
                            	            break;

                            	    }

                            	    pushFollow(FOLLOW_mselem_pattern_in_primitive_pattern2004);
                            	    mselem_pattern89=mselem_pattern();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_mselem_pattern.add(mselem_pattern89.getTree());
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:385:61: ( NL )?
                            	    int alt40=2;
                            	    int LA40_0 = input.LA(1);

                            	    if ( (LA40_0==NL) ) {
                            	        alt40=1;
                            	    }
                            	    switch (alt40) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:385:61: NL
                            	            {
                            	            NL90=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2006); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL90);


                            	            }
                            	            break;

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop41;
                                }
                            } while (true);


                            }
                            break;

                    }

                    char_literal91=(Token)match(input,CURLY_BRACKET_CLOSE,FOLLOW_CURLY_BRACKET_CLOSE_in_primitive_pattern2014); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_CLOSE.add(char_literal91);



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
                    // 386:5: -> ^( MAP_OR_SET_OR_OBJ ( mselem_pattern )* )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:386:8: ^( MAP_OR_SET_OR_OBJ ( mselem_pattern )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MAP_OR_SET_OR_OBJ, "MAP_OR_SET_OR_OBJ"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:386:28: ( mselem_pattern )*
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
                case 14 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:387:4: '{' ( NL )? token_ARROW ( NL )? '}'
                    {
                    char_literal92=(Token)match(input,CURLY_BRACKET_OPEN,FOLLOW_CURLY_BRACKET_OPEN_in_primitive_pattern2032); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_OPEN.add(char_literal92);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:387:8: ( NL )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==NL) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:387:8: NL
                            {
                            NL93=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2034); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL93);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_token_ARROW_in_primitive_pattern2037);
                    token_ARROW94=token_ARROW();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_token_ARROW.add(token_ARROW94.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:387:24: ( NL )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==NL) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:387:24: NL
                            {
                            NL95=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2039); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL95);


                            }
                            break;

                    }

                    char_literal96=(Token)match(input,CURLY_BRACKET_CLOSE,FOLLOW_CURLY_BRACKET_CLOSE_in_primitive_pattern2042); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_CLOSE.add(char_literal96);



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
                    // 387:32: -> ^( EMPTY_MAP )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:387:35: ^( EMPTY_MAP )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:392:1: sep : ( NL | SC )+ ;
    public final babel17Parser.sep_return sep() throws RecognitionException {
        babel17Parser.sep_return retval = new babel17Parser.sep_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set97=null;

        CommonTree set97_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:392:5: ( ( NL | SC )+ )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:392:7: ( NL | SC )+
            {
            root_0 = (CommonTree)adaptor.nil();

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:392:7: ( NL | SC )+
            int cnt46=0;
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==SC||LA46_0==NL) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:
            	    {
            	    set97=(Token)input.LT(1);
            	    if ( input.LA(1)==SC||input.LA(1)==NL ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set97));
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
            	    if ( cnt46 >= 1 ) break loop46;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(46, input);
                        throw eee;
                }
                cnt46++;
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:394:1: block : ( ( sep )? statement ( sep statement )* ( sep )? -> ^( BLOCK ( statement )* ) | ( sep )? -> ^( BLOCK ) );
    public final babel17Parser.block_return block() throws RecognitionException {
        babel17Parser.block_return retval = new babel17Parser.block_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.sep_return sep98 = null;

        babel17Parser.statement_return statement99 = null;

        babel17Parser.sep_return sep100 = null;

        babel17Parser.statement_return statement101 = null;

        babel17Parser.sep_return sep102 = null;

        babel17Parser.sep_return sep103 = null;


        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_sep=new RewriteRuleSubtreeStream(adaptor,"rule sep");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:394:8: ( ( sep )? statement ( sep statement )* ( sep )? -> ^( BLOCK ( statement )* ) | ( sep )? -> ^( BLOCK ) )
            int alt51=2;
            alt51 = dfa51.predict(input);
            switch (alt51) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:394:10: ( sep )? statement ( sep statement )* ( sep )?
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:394:10: ( sep )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==SC||LA47_0==NL) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:394:10: sep
                            {
                            pushFollow(FOLLOW_sep_in_block2080);
                            sep98=sep();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_sep.add(sep98.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_statement_in_block2083);
                    statement99=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement99.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:394:25: ( sep statement )*
                    loop48:
                    do {
                        int alt48=2;
                        alt48 = dfa48.predict(input);
                        switch (alt48) {
                    	case 1 :
                    	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:394:26: sep statement
                    	    {
                    	    pushFollow(FOLLOW_sep_in_block2086);
                    	    sep100=sep();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_sep.add(sep100.getTree());
                    	    pushFollow(FOLLOW_statement_in_block2088);
                    	    statement101=statement();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_statement.add(statement101.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop48;
                        }
                    } while (true);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:394:42: ( sep )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==SC||LA49_0==NL) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:394:42: sep
                            {
                            pushFollow(FOLLOW_sep_in_block2092);
                            sep102=sep();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_sep.add(sep102.getTree());

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
                    // 394:47: -> ^( BLOCK ( statement )* )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:394:50: ^( BLOCK ( statement )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:394:58: ( statement )*
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:395:4: ( sep )?
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:395:4: ( sep )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==SC||LA50_0==NL) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:395:4: sep
                            {
                            pushFollow(FOLLOW_sep_in_block2108);
                            sep103=sep();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_sep.add(sep103.getTree());

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
                    // 395:9: -> ^( BLOCK )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:395:12: ^( BLOCK )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:397:1: pure_block : statement ( sep statement )* -> ^( BLOCK ( statement )* ) ;
    public final babel17Parser.pure_block_return pure_block() throws RecognitionException {
        babel17Parser.pure_block_return retval = new babel17Parser.pure_block_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.statement_return statement104 = null;

        babel17Parser.sep_return sep105 = null;

        babel17Parser.statement_return statement106 = null;


        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_sep=new RewriteRuleSubtreeStream(adaptor,"rule sep");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:398:2: ( statement ( sep statement )* -> ^( BLOCK ( statement )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:398:4: statement ( sep statement )*
            {
            pushFollow(FOLLOW_statement_in_pure_block2125);
            statement104=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statement.add(statement104.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:398:14: ( sep statement )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==NL) ) {
                    int LA52_1 = input.LA(2);

                    if ( (LA52_1==L_begin||(LA52_1>=L_obj && LA52_1<=L_if)||(LA52_1>=L_while && LA52_1<=L_for)||(LA52_1>=L_yield && LA52_1<=L_match)||(LA52_1>=L_val && LA52_1<=L_def)||LA52_1==L_exception||(LA52_1>=A_infinity && LA52_1<=L_nil)||LA52_1==SC||LA52_1==MINUS||LA52_1==A_NOT||LA52_1==U_NOT||(LA52_1>=A_ELLIPSIS && LA52_1<=U_ELLIPSIS)||LA52_1==TILDE||(LA52_1>=NL && LA52_1<=Num)||(LA52_1>=String && LA52_1<=ROUND_BRACKET_OPEN)||LA52_1==SQUARE_BRACKET_OPEN||LA52_1==CURLY_BRACKET_OPEN||LA52_1==UNDERSCORE) ) {
                        alt52=1;
                    }


                }
                else if ( (LA52_0==SC) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:398:15: sep statement
            	    {
            	    pushFollow(FOLLOW_sep_in_pure_block2128);
            	    sep105=sep();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_sep.add(sep105.getTree());
            	    pushFollow(FOLLOW_statement_in_pure_block2130);
            	    statement106=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement106.getTree());

            	    }
            	    break;

            	default :
            	    break loop52;
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
            // 398:31: -> ^( BLOCK ( statement )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:398:34: ^( BLOCK ( statement )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:398:42: ( statement )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:400:1: statement : ( st_val | st_def | st_memoize | st_yield | expr_or_assign );
    public final babel17Parser.statement_return statement() throws RecognitionException {
        babel17Parser.statement_return retval = new babel17Parser.statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.st_val_return st_val107 = null;

        babel17Parser.st_def_return st_def108 = null;

        babel17Parser.st_memoize_return st_memoize109 = null;

        babel17Parser.st_yield_return st_yield110 = null;

        babel17Parser.expr_or_assign_return expr_or_assign111 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:401:2: ( st_val | st_def | st_memoize | st_yield | expr_or_assign )
            int alt53=5;
            switch ( input.LA(1) ) {
            case L_val:
                {
                alt53=1;
                }
                break;
            case L_def:
                {
                alt53=2;
                }
                break;
            case L_memoize:
                {
                alt53=3;
                }
                break;
            case L_yield:
                {
                alt53=4;
                }
                break;
            case L_begin:
            case L_obj:
            case L_with:
            case L_if:
            case L_while:
            case L_for:
            case L_match:
            case L_exception:
            case A_infinity:
            case U_infinity:
            case L_concurrent:
            case L_await:
            case L_lazy:
            case L_true:
            case L_false:
            case L_this:
            case L_random:
            case L_nil:
            case MINUS:
            case A_NOT:
            case U_NOT:
            case A_ELLIPSIS:
            case U_ELLIPSIS:
            case TILDE:
            case Constr:
            case Id:
            case Num:
            case String:
            case ROUND_BRACKET_OPEN:
            case SQUARE_BRACKET_OPEN:
            case CURLY_BRACKET_OPEN:
            case UNDERSCORE:
                {
                alt53=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:401:4: st_val
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_st_val_in_statement2151);
                    st_val107=st_val();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, st_val107.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:402:4: st_def
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_st_def_in_statement2156);
                    st_def108=st_def();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, st_def108.getTree());

                    }
                    break;
                case 3 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:403:4: st_memoize
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_st_memoize_in_statement2161);
                    st_memoize109=st_memoize();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, st_memoize109.getTree());

                    }
                    break;
                case 4 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:404:4: st_yield
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_st_yield_in_statement2166);
                    st_yield110=st_yield();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, st_yield110.getTree());

                    }
                    break;
                case 5 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:405:4: expr_or_assign
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_expr_or_assign_in_statement2171);
                    expr_or_assign111=expr_or_assign();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_or_assign111.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:407:1: objelem_assign : Id PERIOD Id -> ^( OBJELEM_ASSIGN Id Id ) ;
    public final babel17Parser.objelem_assign_return objelem_assign() throws RecognitionException {
        babel17Parser.objelem_assign_return retval = new babel17Parser.objelem_assign_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Id112=null;
        Token PERIOD113=null;
        Token Id114=null;

        CommonTree Id112_tree=null;
        CommonTree PERIOD113_tree=null;
        CommonTree Id114_tree=null;
        RewriteRuleTokenStream stream_Id=new RewriteRuleTokenStream(adaptor,"token Id");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:408:2: ( Id PERIOD Id -> ^( OBJELEM_ASSIGN Id Id ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:408:4: Id PERIOD Id
            {
            Id112=(Token)match(input,Id,FOLLOW_Id_in_objelem_assign2180); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Id.add(Id112);

            PERIOD113=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_objelem_assign2182); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD113);

            Id114=(Token)match(input,Id,FOLLOW_Id_in_objelem_assign2184); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Id.add(Id114);



            // AST REWRITE
            // elements: Id, Id
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 408:17: -> ^( OBJELEM_ASSIGN Id Id )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:408:20: ^( OBJELEM_ASSIGN Id Id )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OBJELEM_ASSIGN, "OBJELEM_ASSIGN"), root_1);

                adaptor.addChild(root_1, stream_Id.nextNode());
                adaptor.addChild(root_1, stream_Id.nextNode());

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
    // $ANTLR end "objelem_assign"

    public static class st_val_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "st_val"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:410:1: st_val : L_val ( NL )? ( pattern | objelem_assign ) ( NL )? '=' ( NL )? expr -> ^( VAL ( pattern )* ( objelem_assign )* expr ) ;
    public final babel17Parser.st_val_return st_val() throws RecognitionException {
        babel17Parser.st_val_return retval = new babel17Parser.st_val_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_val115=null;
        Token NL116=null;
        Token NL119=null;
        Token char_literal120=null;
        Token NL121=null;
        babel17Parser.pattern_return pattern117 = null;

        babel17Parser.objelem_assign_return objelem_assign118 = null;

        babel17Parser.expr_return expr122 = null;


        CommonTree L_val115_tree=null;
        CommonTree NL116_tree=null;
        CommonTree NL119_tree=null;
        CommonTree char_literal120_tree=null;
        CommonTree NL121_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_val=new RewriteRuleTokenStream(adaptor,"token L_val");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_objelem_assign=new RewriteRuleSubtreeStream(adaptor,"rule objelem_assign");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:410:8: ( L_val ( NL )? ( pattern | objelem_assign ) ( NL )? '=' ( NL )? expr -> ^( VAL ( pattern )* ( objelem_assign )* expr ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:410:10: L_val ( NL )? ( pattern | objelem_assign ) ( NL )? '=' ( NL )? expr
            {
            L_val115=(Token)match(input,L_val,FOLLOW_L_val_in_st_val2203); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_val.add(L_val115);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:410:16: ( NL )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==NL) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:410:16: NL
                    {
                    NL116=(Token)match(input,NL,FOLLOW_NL_in_st_val2205); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL116);


                    }
                    break;

            }

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:410:20: ( pattern | objelem_assign )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==L_exception||(LA55_0>=A_infinity && LA55_0<=U_infinity)||(LA55_0>=L_true && LA55_0<=L_false)||LA55_0==L_nil||LA55_0==MINUS||(LA55_0>=A_ELLIPSIS && LA55_0<=U_ELLIPSIS)||LA55_0==Constr||LA55_0==Num||(LA55_0>=String && LA55_0<=ROUND_BRACKET_OPEN)||LA55_0==SQUARE_BRACKET_OPEN||LA55_0==CURLY_BRACKET_OPEN||LA55_0==UNDERSCORE) ) {
                alt55=1;
            }
            else if ( (LA55_0==Id) ) {
                int LA55_2 = input.LA(2);

                if ( (LA55_2==PERIOD) ) {
                    alt55=2;
                }
                else if ( (LA55_2==ASSIGN||(LA55_2>=A_DOUBLE_COLON && LA55_2<=U_DOUBLE_COLON)||LA55_2==NL) ) {
                    alt55=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 55, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:410:21: pattern
                    {
                    pushFollow(FOLLOW_pattern_in_st_val2209);
                    pattern117=pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pattern.add(pattern117.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:410:31: objelem_assign
                    {
                    pushFollow(FOLLOW_objelem_assign_in_st_val2213);
                    objelem_assign118=objelem_assign();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_objelem_assign.add(objelem_assign118.getTree());

                    }
                    break;

            }

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:410:47: ( NL )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==NL) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:410:47: NL
                    {
                    NL119=(Token)match(input,NL,FOLLOW_NL_in_st_val2216); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL119);


                    }
                    break;

            }

            char_literal120=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_st_val2219); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal120);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:410:55: ( NL )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==NL) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:410:55: NL
                    {
                    NL121=(Token)match(input,NL,FOLLOW_NL_in_st_val2221); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL121);


                    }
                    break;

            }

            pushFollow(FOLLOW_expr_in_st_val2224);
            expr122=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr122.getTree());


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
            // 410:64: -> ^( VAL ( pattern )* ( objelem_assign )* expr )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:410:67: ^( VAL ( pattern )* ( objelem_assign )* expr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VAL, "VAL"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:410:73: ( pattern )*
                while ( stream_pattern.hasNext() ) {
                    adaptor.addChild(root_1, stream_pattern.nextTree());

                }
                stream_pattern.reset();
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:410:82: ( objelem_assign )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:412:1: st_def : L_def ( NL )? Id ( NL )? ( primitive_pattern ( NL )? )? '=' ( NL )? expr -> ^( DEF Id ( primitive_pattern )? expr ) ;
    public final babel17Parser.st_def_return st_def() throws RecognitionException {
        babel17Parser.st_def_return retval = new babel17Parser.st_def_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_def123=null;
        Token NL124=null;
        Token Id125=null;
        Token NL126=null;
        Token NL128=null;
        Token char_literal129=null;
        Token NL130=null;
        babel17Parser.primitive_pattern_return primitive_pattern127 = null;

        babel17Parser.expr_return expr131 = null;


        CommonTree L_def123_tree=null;
        CommonTree NL124_tree=null;
        CommonTree Id125_tree=null;
        CommonTree NL126_tree=null;
        CommonTree NL128_tree=null;
        CommonTree char_literal129_tree=null;
        CommonTree NL130_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_Id=new RewriteRuleTokenStream(adaptor,"token Id");
        RewriteRuleTokenStream stream_L_def=new RewriteRuleTokenStream(adaptor,"token L_def");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_primitive_pattern=new RewriteRuleSubtreeStream(adaptor,"rule primitive_pattern");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:412:8: ( L_def ( NL )? Id ( NL )? ( primitive_pattern ( NL )? )? '=' ( NL )? expr -> ^( DEF Id ( primitive_pattern )? expr ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:412:10: L_def ( NL )? Id ( NL )? ( primitive_pattern ( NL )? )? '=' ( NL )? expr
            {
            L_def123=(Token)match(input,L_def,FOLLOW_L_def_in_st_def2248); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_def.add(L_def123);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:412:16: ( NL )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==NL) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:412:16: NL
                    {
                    NL124=(Token)match(input,NL,FOLLOW_NL_in_st_def2250); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL124);


                    }
                    break;

            }

            Id125=(Token)match(input,Id,FOLLOW_Id_in_st_def2253); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Id.add(Id125);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:412:23: ( NL )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==NL) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:412:23: NL
                    {
                    NL126=(Token)match(input,NL,FOLLOW_NL_in_st_def2255); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL126);


                    }
                    break;

            }

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:412:27: ( primitive_pattern ( NL )? )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( ((LA61_0>=A_infinity && LA61_0<=U_infinity)||(LA61_0>=L_true && LA61_0<=L_false)||LA61_0==L_nil||LA61_0==MINUS||(LA61_0>=Id && LA61_0<=Num)||(LA61_0>=String && LA61_0<=ROUND_BRACKET_OPEN)||LA61_0==SQUARE_BRACKET_OPEN||LA61_0==CURLY_BRACKET_OPEN||LA61_0==UNDERSCORE) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:412:28: primitive_pattern ( NL )?
                    {
                    pushFollow(FOLLOW_primitive_pattern_in_st_def2259);
                    primitive_pattern127=primitive_pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primitive_pattern.add(primitive_pattern127.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:412:46: ( NL )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==NL) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:412:46: NL
                            {
                            NL128=(Token)match(input,NL,FOLLOW_NL_in_st_def2261); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL128);


                            }
                            break;

                    }


                    }
                    break;

            }

            char_literal129=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_st_def2266); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal129);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:412:56: ( NL )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==NL) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:412:56: NL
                    {
                    NL130=(Token)match(input,NL,FOLLOW_NL_in_st_def2268); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL130);


                    }
                    break;

            }

            pushFollow(FOLLOW_expr_in_st_def2271);
            expr131=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr131.getTree());


            // AST REWRITE
            // elements: expr, Id, primitive_pattern
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 413:5: -> ^( DEF Id ( primitive_pattern )? expr )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:413:8: ^( DEF Id ( primitive_pattern )? expr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DEF, "DEF"), root_1);

                adaptor.addChild(root_1, stream_Id.nextNode());
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:413:17: ( primitive_pattern )?
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:415:1: st_yield : L_yield expr -> ^( YIELD expr ) ;
    public final babel17Parser.st_yield_return st_yield() throws RecognitionException {
        babel17Parser.st_yield_return retval = new babel17Parser.st_yield_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_yield132=null;
        babel17Parser.expr_return expr133 = null;


        CommonTree L_yield132_tree=null;
        RewriteRuleTokenStream stream_L_yield=new RewriteRuleTokenStream(adaptor,"token L_yield");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:415:9: ( L_yield expr -> ^( YIELD expr ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:415:11: L_yield expr
            {
            L_yield132=(Token)match(input,L_yield,FOLLOW_L_yield_in_st_yield2300); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_yield.add(L_yield132);

            pushFollow(FOLLOW_expr_in_st_yield2302);
            expr133=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr133.getTree());


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
            // 415:24: -> ^( YIELD expr )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:415:27: ^( YIELD expr )
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

    public static class st_memoize_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "st_memoize"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:417:1: st_memoize : L_memoize ( memid )+ -> ^( MEMOIZE ( memid )* ) ;
    public final babel17Parser.st_memoize_return st_memoize() throws RecognitionException {
        babel17Parser.st_memoize_return retval = new babel17Parser.st_memoize_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_memoize134=null;
        babel17Parser.memid_return memid135 = null;


        CommonTree L_memoize134_tree=null;
        RewriteRuleTokenStream stream_L_memoize=new RewriteRuleTokenStream(adaptor,"token L_memoize");
        RewriteRuleSubtreeStream stream_memid=new RewriteRuleSubtreeStream(adaptor,"rule memid");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:418:2: ( L_memoize ( memid )+ -> ^( MEMOIZE ( memid )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:418:4: L_memoize ( memid )+
            {
            L_memoize134=(Token)match(input,L_memoize,FOLLOW_L_memoize_in_st_memoize2320); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_memoize.add(L_memoize134);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:418:14: ( memid )+
            int cnt63=0;
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==Id||LA63_0==ROUND_BRACKET_OPEN) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:418:14: memid
            	    {
            	    pushFollow(FOLLOW_memid_in_st_memoize2322);
            	    memid135=memid();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_memid.add(memid135.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt63 >= 1 ) break loop63;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(63, input);
                        throw eee;
                }
                cnt63++;
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
            // 419:5: -> ^( MEMOIZE ( memid )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:419:8: ^( MEMOIZE ( memid )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MEMOIZE, "MEMOIZE"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:419:18: ( memid )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:421:1: memid : ( Id -> ^( MEM_STRONG Id ) | '(' Id ')' -> ^( MEM_WEAK Id ) );
    public final babel17Parser.memid_return memid() throws RecognitionException {
        babel17Parser.memid_return retval = new babel17Parser.memid_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Id136=null;
        Token char_literal137=null;
        Token Id138=null;
        Token char_literal139=null;

        CommonTree Id136_tree=null;
        CommonTree char_literal137_tree=null;
        CommonTree Id138_tree=null;
        CommonTree char_literal139_tree=null;
        RewriteRuleTokenStream stream_ROUND_BRACKET_OPEN=new RewriteRuleTokenStream(adaptor,"token ROUND_BRACKET_OPEN");
        RewriteRuleTokenStream stream_ROUND_BRACKET_CLOSE=new RewriteRuleTokenStream(adaptor,"token ROUND_BRACKET_CLOSE");
        RewriteRuleTokenStream stream_Id=new RewriteRuleTokenStream(adaptor,"token Id");

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:421:7: ( Id -> ^( MEM_STRONG Id ) | '(' Id ')' -> ^( MEM_WEAK Id ) )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==Id) ) {
                alt64=1;
            }
            else if ( (LA64_0==ROUND_BRACKET_OPEN) ) {
                alt64=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:421:9: Id
                    {
                    Id136=(Token)match(input,Id,FOLLOW_Id_in_memid2346); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Id.add(Id136);



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
                    // 421:12: -> ^( MEM_STRONG Id )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:421:15: ^( MEM_STRONG Id )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:422:4: '(' Id ')'
                    {
                    char_literal137=(Token)match(input,ROUND_BRACKET_OPEN,FOLLOW_ROUND_BRACKET_OPEN_in_memid2359); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ROUND_BRACKET_OPEN.add(char_literal137);

                    Id138=(Token)match(input,Id,FOLLOW_Id_in_memid2361); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Id.add(Id138);

                    char_literal139=(Token)match(input,ROUND_BRACKET_CLOSE,FOLLOW_ROUND_BRACKET_CLOSE_in_memid2363); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ROUND_BRACKET_CLOSE.add(char_literal139);



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
                    // 422:15: -> ^( MEM_WEAK Id )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:422:18: ^( MEM_WEAK Id )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:425:1: expr_or_assign : ( ( ( pattern | objelem_assign ) ( NL )? '=' )=> ( pattern | objelem_assign ) ( NL )? '=' ( NL )? expr -> ^( ASSIGN ( pattern )* ( objelem_assign )* expr ) | expr );
    public final babel17Parser.expr_or_assign_return expr_or_assign() throws RecognitionException {
        babel17Parser.expr_or_assign_return retval = new babel17Parser.expr_or_assign_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL142=null;
        Token char_literal143=null;
        Token NL144=null;
        babel17Parser.pattern_return pattern140 = null;

        babel17Parser.objelem_assign_return objelem_assign141 = null;

        babel17Parser.expr_return expr145 = null;

        babel17Parser.expr_return expr146 = null;


        CommonTree NL142_tree=null;
        CommonTree char_literal143_tree=null;
        CommonTree NL144_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_objelem_assign=new RewriteRuleSubtreeStream(adaptor,"rule objelem_assign");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:426:2: ( ( ( pattern | objelem_assign ) ( NL )? '=' )=> ( pattern | objelem_assign ) ( NL )? '=' ( NL )? expr -> ^( ASSIGN ( pattern )* ( objelem_assign )* expr ) | expr )
            int alt68=2;
            alt68 = dfa68.predict(input);
            switch (alt68) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:426:4: ( ( pattern | objelem_assign ) ( NL )? '=' )=> ( pattern | objelem_assign ) ( NL )? '=' ( NL )? expr
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:426:44: ( pattern | objelem_assign )
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==L_exception||(LA65_0>=A_infinity && LA65_0<=U_infinity)||(LA65_0>=L_true && LA65_0<=L_false)||LA65_0==L_nil||LA65_0==MINUS||(LA65_0>=A_ELLIPSIS && LA65_0<=U_ELLIPSIS)||LA65_0==Constr||LA65_0==Num||(LA65_0>=String && LA65_0<=ROUND_BRACKET_OPEN)||LA65_0==SQUARE_BRACKET_OPEN||LA65_0==CURLY_BRACKET_OPEN||LA65_0==UNDERSCORE) ) {
                        alt65=1;
                    }
                    else if ( (LA65_0==Id) ) {
                        int LA65_2 = input.LA(2);

                        if ( (LA65_2==PERIOD) ) {
                            alt65=2;
                        }
                        else if ( (LA65_2==ASSIGN||(LA65_2>=A_DOUBLE_COLON && LA65_2<=U_DOUBLE_COLON)||LA65_2==NL) ) {
                            alt65=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 65, 2, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 65, 0, input);

                        throw nvae;
                    }
                    switch (alt65) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:426:45: pattern
                            {
                            pushFollow(FOLLOW_pattern_in_expr_or_assign2403);
                            pattern140=pattern();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_pattern.add(pattern140.getTree());

                            }
                            break;
                        case 2 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:426:55: objelem_assign
                            {
                            pushFollow(FOLLOW_objelem_assign_in_expr_or_assign2407);
                            objelem_assign141=objelem_assign();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_objelem_assign.add(objelem_assign141.getTree());

                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:426:71: ( NL )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==NL) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:426:71: NL
                            {
                            NL142=(Token)match(input,NL,FOLLOW_NL_in_expr_or_assign2410); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL142);


                            }
                            break;

                    }

                    char_literal143=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_expr_or_assign2413); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal143);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:426:79: ( NL )?
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==NL) ) {
                        alt67=1;
                    }
                    switch (alt67) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:426:79: NL
                            {
                            NL144=(Token)match(input,NL,FOLLOW_NL_in_expr_or_assign2415); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL144);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_expr_in_expr_or_assign2418);
                    expr145=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr145.getTree());


                    // AST REWRITE
                    // elements: expr, pattern, objelem_assign
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 426:88: -> ^( ASSIGN ( pattern )* ( objelem_assign )* expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:426:91: ^( ASSIGN ( pattern )* ( objelem_assign )* expr )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASSIGN, "ASSIGN"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:426:100: ( pattern )*
                        while ( stream_pattern.hasNext() ) {
                            adaptor.addChild(root_1, stream_pattern.nextTree());

                        }
                        stream_pattern.reset();
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:426:109: ( objelem_assign )*
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
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:427:4: expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_expr_in_expr_or_assign2437);
                    expr146=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr146.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:429:1: expr : ( lop_expr | obj_expr );
    public final babel17Parser.expr_return expr() throws RecognitionException {
        babel17Parser.expr_return retval = new babel17Parser.expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.lop_expr_return lop_expr147 = null;

        babel17Parser.obj_expr_return obj_expr148 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:430:2: ( lop_expr | obj_expr )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==L_begin||(LA69_0>=L_with && LA69_0<=L_if)||(LA69_0>=L_while && LA69_0<=L_for)||LA69_0==L_match||LA69_0==L_exception||(LA69_0>=A_infinity && LA69_0<=L_lazy)||(LA69_0>=L_true && LA69_0<=L_nil)||LA69_0==MINUS||LA69_0==A_NOT||LA69_0==U_NOT||(LA69_0>=A_ELLIPSIS && LA69_0<=U_ELLIPSIS)||LA69_0==TILDE||(LA69_0>=Constr && LA69_0<=Num)||(LA69_0>=String && LA69_0<=ROUND_BRACKET_OPEN)||LA69_0==SQUARE_BRACKET_OPEN||LA69_0==CURLY_BRACKET_OPEN||LA69_0==UNDERSCORE) ) {
                alt69=1;
            }
            else if ( (LA69_0==L_obj) ) {
                alt69=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:430:4: lop_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_lop_expr_in_expr2448);
                    lop_expr147=lop_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lop_expr147.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:431:4: obj_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_obj_expr_in_expr2453);
                    obj_expr148=obj_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, obj_expr148.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:433:1: control_expr : ( if_expr | while_do_expr | match_expr | for_expr | begin_end );
    public final babel17Parser.control_expr_return control_expr() throws RecognitionException {
        babel17Parser.control_expr_return retval = new babel17Parser.control_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.if_expr_return if_expr149 = null;

        babel17Parser.while_do_expr_return while_do_expr150 = null;

        babel17Parser.match_expr_return match_expr151 = null;

        babel17Parser.for_expr_return for_expr152 = null;

        babel17Parser.begin_end_return begin_end153 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:434:2: ( if_expr | while_do_expr | match_expr | for_expr | begin_end )
            int alt70=5;
            switch ( input.LA(1) ) {
            case L_if:
                {
                alt70=1;
                }
                break;
            case L_while:
                {
                alt70=2;
                }
                break;
            case L_match:
                {
                alt70=3;
                }
                break;
            case L_for:
                {
                alt70=4;
                }
                break;
            case L_begin:
                {
                alt70=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }

            switch (alt70) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:434:4: if_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_if_expr_in_control_expr2463);
                    if_expr149=if_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, if_expr149.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:435:4: while_do_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_while_do_expr_in_control_expr2468);
                    while_do_expr150=while_do_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, while_do_expr150.getTree());

                    }
                    break;
                case 3 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:436:4: match_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_match_expr_in_control_expr2473);
                    match_expr151=match_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, match_expr151.getTree());

                    }
                    break;
                case 4 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:437:4: for_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_for_expr_in_control_expr2478);
                    for_expr152=for_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, for_expr152.getTree());

                    }
                    break;
                case 5 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:438:4: begin_end
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_begin_end_in_control_expr2483);
                    begin_end153=begin_end();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, begin_end153.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:440:1: with_control_expr : ( control_expr | L_with ( NL )? protected_expr ( NL )? COLON ( NL )? control_expr -> ^( WITH protected_expr control_expr ) );
    public final babel17Parser.with_control_expr_return with_control_expr() throws RecognitionException {
        babel17Parser.with_control_expr_return retval = new babel17Parser.with_control_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_with155=null;
        Token NL156=null;
        Token NL158=null;
        Token COLON159=null;
        Token NL160=null;
        babel17Parser.control_expr_return control_expr154 = null;

        babel17Parser.protected_expr_return protected_expr157 = null;

        babel17Parser.control_expr_return control_expr161 = null;


        CommonTree L_with155_tree=null;
        CommonTree NL156_tree=null;
        CommonTree NL158_tree=null;
        CommonTree COLON159_tree=null;
        CommonTree NL160_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_with=new RewriteRuleTokenStream(adaptor,"token L_with");
        RewriteRuleSubtreeStream stream_control_expr=new RewriteRuleSubtreeStream(adaptor,"rule control_expr");
        RewriteRuleSubtreeStream stream_protected_expr=new RewriteRuleSubtreeStream(adaptor,"rule protected_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:441:2: ( control_expr | L_with ( NL )? protected_expr ( NL )? COLON ( NL )? control_expr -> ^( WITH protected_expr control_expr ) )
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==L_begin||LA74_0==L_if||(LA74_0>=L_while && LA74_0<=L_for)||LA74_0==L_match) ) {
                alt74=1;
            }
            else if ( (LA74_0==L_with) ) {
                alt74=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }
            switch (alt74) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:441:4: control_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_control_expr_in_with_control_expr2493);
                    control_expr154=control_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, control_expr154.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:442:4: L_with ( NL )? protected_expr ( NL )? COLON ( NL )? control_expr
                    {
                    L_with155=(Token)match(input,L_with,FOLLOW_L_with_in_with_control_expr2498); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_with.add(L_with155);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:442:11: ( NL )?
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==NL) ) {
                        alt71=1;
                    }
                    switch (alt71) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:442:11: NL
                            {
                            NL156=(Token)match(input,NL,FOLLOW_NL_in_with_control_expr2500); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL156);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_protected_expr_in_with_control_expr2503);
                    protected_expr157=protected_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr157.getTree());
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
                            NL158=(Token)match(input,NL,FOLLOW_NL_in_with_control_expr2505); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL158);


                            }
                            break;

                    }

                    COLON159=(Token)match(input,COLON,FOLLOW_COLON_in_with_control_expr2508); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON159);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:442:40: ( NL )?
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==NL) ) {
                        alt73=1;
                    }
                    switch (alt73) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:442:40: NL
                            {
                            NL160=(Token)match(input,NL,FOLLOW_NL_in_with_control_expr2510); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL160);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_control_expr_in_with_control_expr2513);
                    control_expr161=control_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_control_expr.add(control_expr161.getTree());


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
                    // 442:57: -> ^( WITH protected_expr control_expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:442:60: ^( WITH protected_expr control_expr )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:445:1: protected_expr : ( p_lop_expr | obj_expr );
    public final babel17Parser.protected_expr_return protected_expr() throws RecognitionException {
        babel17Parser.protected_expr_return retval = new babel17Parser.protected_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.p_lop_expr_return p_lop_expr162 = null;

        babel17Parser.obj_expr_return obj_expr163 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:446:2: ( p_lop_expr | obj_expr )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==L_begin||(LA75_0>=L_with && LA75_0<=L_if)||(LA75_0>=L_while && LA75_0<=L_for)||(LA75_0>=L_match && LA75_0<=L_case)||LA75_0==L_exception||(LA75_0>=A_infinity && LA75_0<=L_lazy)||(LA75_0>=L_true && LA75_0<=L_nil)||LA75_0==MINUS||LA75_0==A_NOT||LA75_0==U_NOT||(LA75_0>=A_ELLIPSIS && LA75_0<=U_ELLIPSIS)||LA75_0==TILDE||(LA75_0>=Constr && LA75_0<=Num)||(LA75_0>=String && LA75_0<=ROUND_BRACKET_OPEN)||LA75_0==SQUARE_BRACKET_OPEN||LA75_0==CURLY_BRACKET_OPEN||LA75_0==UNDERSCORE) ) {
                alt75=1;
            }
            else if ( (LA75_0==L_obj) ) {
                alt75=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:446:4: p_lop_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_p_lop_expr_in_protected_expr2534);
                    p_lop_expr162=p_lop_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_lop_expr162.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:447:4: obj_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_obj_expr_in_protected_expr2539);
                    obj_expr163=obj_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, obj_expr163.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:450:1: begin_end : L_begin block L_end -> ^( BEGIN block ) ;
    public final babel17Parser.begin_end_return begin_end() throws RecognitionException {
        babel17Parser.begin_end_return retval = new babel17Parser.begin_end_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_begin164=null;
        Token L_end166=null;
        babel17Parser.block_return block165 = null;


        CommonTree L_begin164_tree=null;
        CommonTree L_end166_tree=null;
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleTokenStream stream_L_begin=new RewriteRuleTokenStream(adaptor,"token L_begin");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:451:2: ( L_begin block L_end -> ^( BEGIN block ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:451:4: L_begin block L_end
            {
            L_begin164=(Token)match(input,L_begin,FOLLOW_L_begin_in_begin_end2551); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_begin.add(L_begin164);

            pushFollow(FOLLOW_block_in_begin_end2553);
            block165=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block165.getTree());
            L_end166=(Token)match(input,L_end,FOLLOW_L_end_in_begin_end2555); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_end.add(L_end166);



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
            // 451:24: -> ^( BEGIN block )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:451:27: ^( BEGIN block )
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

    public static class parents_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parents"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:454:1: parents : ( '+' primitive_expr -> ^( PARENTS_PLUS primitive_expr ) | '*' primitive_expr -> ^( PARENTS_MUL primitive_expr ) );
    public final babel17Parser.parents_return parents() throws RecognitionException {
        babel17Parser.parents_return retval = new babel17Parser.parents_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal167=null;
        Token char_literal169=null;
        babel17Parser.primitive_expr_return primitive_expr168 = null;

        babel17Parser.primitive_expr_return primitive_expr170 = null;


        CommonTree char_literal167_tree=null;
        CommonTree char_literal169_tree=null;
        RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
        RewriteRuleTokenStream stream_TIMES=new RewriteRuleTokenStream(adaptor,"token TIMES");
        RewriteRuleSubtreeStream stream_primitive_expr=new RewriteRuleSubtreeStream(adaptor,"rule primitive_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:454:9: ( '+' primitive_expr -> ^( PARENTS_PLUS primitive_expr ) | '*' primitive_expr -> ^( PARENTS_MUL primitive_expr ) )
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==PLUS) ) {
                alt76=1;
            }
            else if ( (LA76_0==TIMES) ) {
                alt76=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }
            switch (alt76) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:454:11: '+' primitive_expr
                    {
                    char_literal167=(Token)match(input,PLUS,FOLLOW_PLUS_in_parents2573); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PLUS.add(char_literal167);

                    pushFollow(FOLLOW_primitive_expr_in_parents2575);
                    primitive_expr168=primitive_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primitive_expr.add(primitive_expr168.getTree());


                    // AST REWRITE
                    // elements: primitive_expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 454:30: -> ^( PARENTS_PLUS primitive_expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:454:33: ^( PARENTS_PLUS primitive_expr )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PARENTS_PLUS, "PARENTS_PLUS"), root_1);

                        adaptor.addChild(root_1, stream_primitive_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:455:4: '*' primitive_expr
                    {
                    char_literal169=(Token)match(input,TIMES,FOLLOW_TIMES_in_parents2588); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TIMES.add(char_literal169);

                    pushFollow(FOLLOW_primitive_expr_in_parents2590);
                    primitive_expr170=primitive_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primitive_expr.add(primitive_expr170.getTree());


                    // AST REWRITE
                    // elements: primitive_expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 455:23: -> ^( PARENTS_MUL primitive_expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:455:26: ^( PARENTS_MUL primitive_expr )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PARENTS_MUL, "PARENTS_MUL"), root_1);

                        adaptor.addChild(root_1, stream_primitive_expr.nextTree());

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
    // $ANTLR end "parents"

    public static class obj_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "obj_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:458:1: obj_expr : ( ( L_obj ( NL )? parents )=> L_obj ( NL )? parents block L_end -> ^( OBJ block parents ) | L_obj block L_end -> ^( OBJ block ) );
    public final babel17Parser.obj_expr_return obj_expr() throws RecognitionException {
        babel17Parser.obj_expr_return retval = new babel17Parser.obj_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_obj171=null;
        Token NL172=null;
        Token L_end175=null;
        Token L_obj176=null;
        Token L_end178=null;
        babel17Parser.parents_return parents173 = null;

        babel17Parser.block_return block174 = null;

        babel17Parser.block_return block177 = null;


        CommonTree L_obj171_tree=null;
        CommonTree NL172_tree=null;
        CommonTree L_end175_tree=null;
        CommonTree L_obj176_tree=null;
        CommonTree L_end178_tree=null;
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_obj=new RewriteRuleTokenStream(adaptor,"token L_obj");
        RewriteRuleSubtreeStream stream_parents=new RewriteRuleSubtreeStream(adaptor,"rule parents");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:458:9: ( ( L_obj ( NL )? parents )=> L_obj ( NL )? parents block L_end -> ^( OBJ block parents ) | L_obj block L_end -> ^( OBJ block ) )
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==L_obj) ) {
                int LA78_1 = input.LA(2);

                if ( (LA78_1==NL) ) {
                    int LA78_2 = input.LA(3);

                    if ( (LA78_2==PLUS) && (synpred4_babel17())) {
                        alt78=1;
                    }
                    else if ( (LA78_2==TIMES) && (synpred4_babel17())) {
                        alt78=1;
                    }
                    else if ( ((LA78_2>=L_begin && LA78_2<=L_if)||(LA78_2>=L_while && LA78_2<=L_for)||(LA78_2>=L_yield && LA78_2<=L_match)||(LA78_2>=L_val && LA78_2<=L_def)||LA78_2==L_exception||(LA78_2>=A_infinity && LA78_2<=L_nil)||LA78_2==SC||LA78_2==MINUS||LA78_2==A_NOT||LA78_2==U_NOT||(LA78_2>=A_ELLIPSIS && LA78_2<=U_ELLIPSIS)||LA78_2==TILDE||(LA78_2>=NL && LA78_2<=Num)||(LA78_2>=String && LA78_2<=ROUND_BRACKET_OPEN)||LA78_2==SQUARE_BRACKET_OPEN||LA78_2==CURLY_BRACKET_OPEN||LA78_2==UNDERSCORE) ) {
                        alt78=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 78, 2, input);

                        throw nvae;
                    }
                }
                else if ( ((LA78_1>=L_begin && LA78_1<=L_if)||(LA78_1>=L_while && LA78_1<=L_for)||(LA78_1>=L_yield && LA78_1<=L_match)||(LA78_1>=L_val && LA78_1<=L_def)||LA78_1==L_exception||(LA78_1>=A_infinity && LA78_1<=L_nil)||LA78_1==SC||LA78_1==MINUS||LA78_1==A_NOT||LA78_1==U_NOT||(LA78_1>=A_ELLIPSIS && LA78_1<=U_ELLIPSIS)||LA78_1==TILDE||(LA78_1>=Constr && LA78_1<=Num)||(LA78_1>=String && LA78_1<=ROUND_BRACKET_OPEN)||LA78_1==SQUARE_BRACKET_OPEN||LA78_1==CURLY_BRACKET_OPEN||LA78_1==UNDERSCORE) ) {
                    alt78=2;
                }
                else if ( (LA78_1==PLUS) && (synpred4_babel17())) {
                    alt78=1;
                }
                else if ( (LA78_1==TIMES) && (synpred4_babel17())) {
                    alt78=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 78, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }
            switch (alt78) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:458:11: ( L_obj ( NL )? parents )=> L_obj ( NL )? parents block L_end
                    {
                    L_obj171=(Token)match(input,L_obj,FOLLOW_L_obj_in_obj_expr2618); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_obj.add(L_obj171);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:458:40: ( NL )?
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==NL) ) {
                        alt77=1;
                    }
                    switch (alt77) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:458:40: NL
                            {
                            NL172=(Token)match(input,NL,FOLLOW_NL_in_obj_expr2620); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL172);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_parents_in_obj_expr2623);
                    parents173=parents();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parents.add(parents173.getTree());
                    pushFollow(FOLLOW_block_in_obj_expr2625);
                    block174=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block174.getTree());
                    L_end175=(Token)match(input,L_end,FOLLOW_L_end_in_obj_expr2627); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_end.add(L_end175);



                    // AST REWRITE
                    // elements: parents, block
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 458:64: -> ^( OBJ block parents )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:458:67: ^( OBJ block parents )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OBJ, "OBJ"), root_1);

                        adaptor.addChild(root_1, stream_block.nextTree());
                        adaptor.addChild(root_1, stream_parents.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:459:17: L_obj block L_end
                    {
                    L_obj176=(Token)match(input,L_obj,FOLLOW_L_obj_in_obj_expr2655); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_obj.add(L_obj176);

                    pushFollow(FOLLOW_block_in_obj_expr2657);
                    block177=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block177.getTree());
                    L_end178=(Token)match(input,L_end,FOLLOW_L_end_in_obj_expr2659); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_end.add(L_end178);



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
                    // 459:35: -> ^( OBJ block )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:459:38: ^( OBJ block )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OBJ, "OBJ"), root_1);

                        adaptor.addChild(root_1, stream_block.nextTree());

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
    // $ANTLR end "obj_expr"

    public static class lop_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "lop_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:461:1: lop_expr : ( ( lambda_expr )=> lambda_expr | op_expr );
    public final babel17Parser.lop_expr_return lop_expr() throws RecognitionException {
        babel17Parser.lop_expr_return retval = new babel17Parser.lop_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.lambda_expr_return lambda_expr179 = null;

        babel17Parser.op_expr_return op_expr180 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:462:2: ( ( lambda_expr )=> lambda_expr | op_expr )
            int alt79=2;
            alt79 = dfa79.predict(input);
            switch (alt79) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:462:4: ( lambda_expr )=> lambda_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_lambda_expr_in_lop_expr2687);
                    lambda_expr179=lambda_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lambda_expr179.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:463:4: op_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_op_expr_in_lop_expr2692);
                    op_expr180=op_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, op_expr180.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:465:1: p_lop_expr : ( ( protected_lambda_expr )=> protected_lambda_expr | p_op_expr );
    public final babel17Parser.p_lop_expr_return p_lop_expr() throws RecognitionException {
        babel17Parser.p_lop_expr_return retval = new babel17Parser.p_lop_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.protected_lambda_expr_return protected_lambda_expr181 = null;

        babel17Parser.p_op_expr_return p_op_expr182 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:466:2: ( ( protected_lambda_expr )=> protected_lambda_expr | p_op_expr )
            int alt80=2;
            alt80 = dfa80.predict(input);
            switch (alt80) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:466:4: ( protected_lambda_expr )=> protected_lambda_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_protected_lambda_expr_in_p_lop_expr2708);
                    protected_lambda_expr181=protected_lambda_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, protected_lambda_expr181.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:467:4: p_op_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_p_op_expr_in_p_lop_expr2713);
                    p_op_expr182=p_op_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_op_expr182.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:469:1: if_expr : L_if ( NL )? protected_expr ( NL )? L_then block ( L_elseif ( NL )? protected_expr ( NL )? L_then block )* ( L_else block )? L_end -> ^( IF ( protected_expr )* ( block )* ) ;
    public final babel17Parser.if_expr_return if_expr() throws RecognitionException {
        babel17Parser.if_expr_return retval = new babel17Parser.if_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_if183=null;
        Token NL184=null;
        Token NL186=null;
        Token L_then187=null;
        Token L_elseif189=null;
        Token NL190=null;
        Token NL192=null;
        Token L_then193=null;
        Token L_else195=null;
        Token L_end197=null;
        babel17Parser.protected_expr_return protected_expr185 = null;

        babel17Parser.block_return block188 = null;

        babel17Parser.protected_expr_return protected_expr191 = null;

        babel17Parser.block_return block194 = null;

        babel17Parser.block_return block196 = null;


        CommonTree L_if183_tree=null;
        CommonTree NL184_tree=null;
        CommonTree NL186_tree=null;
        CommonTree L_then187_tree=null;
        CommonTree L_elseif189_tree=null;
        CommonTree NL190_tree=null;
        CommonTree NL192_tree=null;
        CommonTree L_then193_tree=null;
        CommonTree L_else195_tree=null;
        CommonTree L_end197_tree=null;
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleTokenStream stream_L_else=new RewriteRuleTokenStream(adaptor,"token L_else");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_elseif=new RewriteRuleTokenStream(adaptor,"token L_elseif");
        RewriteRuleTokenStream stream_L_then=new RewriteRuleTokenStream(adaptor,"token L_then");
        RewriteRuleTokenStream stream_L_if=new RewriteRuleTokenStream(adaptor,"token L_if");
        RewriteRuleSubtreeStream stream_protected_expr=new RewriteRuleSubtreeStream(adaptor,"rule protected_expr");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:469:9: ( L_if ( NL )? protected_expr ( NL )? L_then block ( L_elseif ( NL )? protected_expr ( NL )? L_then block )* ( L_else block )? L_end -> ^( IF ( protected_expr )* ( block )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:469:11: L_if ( NL )? protected_expr ( NL )? L_then block ( L_elseif ( NL )? protected_expr ( NL )? L_then block )* ( L_else block )? L_end
            {
            L_if183=(Token)match(input,L_if,FOLLOW_L_if_in_if_expr2724); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_if.add(L_if183);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:469:16: ( NL )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==NL) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:469:16: NL
                    {
                    NL184=(Token)match(input,NL,FOLLOW_NL_in_if_expr2726); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL184);


                    }
                    break;

            }

            pushFollow(FOLLOW_protected_expr_in_if_expr2729);
            protected_expr185=protected_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr185.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:469:35: ( NL )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==NL) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:469:35: NL
                    {
                    NL186=(Token)match(input,NL,FOLLOW_NL_in_if_expr2731); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL186);


                    }
                    break;

            }

            L_then187=(Token)match(input,L_then,FOLLOW_L_then_in_if_expr2734); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_then.add(L_then187);

            pushFollow(FOLLOW_block_in_if_expr2736);
            block188=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block188.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:470:3: ( L_elseif ( NL )? protected_expr ( NL )? L_then block )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==L_elseif) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:470:4: L_elseif ( NL )? protected_expr ( NL )? L_then block
            	    {
            	    L_elseif189=(Token)match(input,L_elseif,FOLLOW_L_elseif_in_if_expr2742); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_L_elseif.add(L_elseif189);

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:470:13: ( NL )?
            	    int alt83=2;
            	    int LA83_0 = input.LA(1);

            	    if ( (LA83_0==NL) ) {
            	        alt83=1;
            	    }
            	    switch (alt83) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:470:13: NL
            	            {
            	            NL190=(Token)match(input,NL,FOLLOW_NL_in_if_expr2744); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL190);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_protected_expr_in_if_expr2747);
            	    protected_expr191=protected_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr191.getTree());
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:470:32: ( NL )?
            	    int alt84=2;
            	    int LA84_0 = input.LA(1);

            	    if ( (LA84_0==NL) ) {
            	        alt84=1;
            	    }
            	    switch (alt84) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:470:32: NL
            	            {
            	            NL192=(Token)match(input,NL,FOLLOW_NL_in_if_expr2749); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL192);


            	            }
            	            break;

            	    }

            	    L_then193=(Token)match(input,L_then,FOLLOW_L_then_in_if_expr2752); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_L_then.add(L_then193);

            	    pushFollow(FOLLOW_block_in_if_expr2754);
            	    block194=block();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_block.add(block194.getTree());

            	    }
            	    break;

            	default :
            	    break loop85;
                }
            } while (true);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:471:3: ( L_else block )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==L_else) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:471:4: L_else block
                    {
                    L_else195=(Token)match(input,L_else,FOLLOW_L_else_in_if_expr2762); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_else.add(L_else195);

                    pushFollow(FOLLOW_block_in_if_expr2764);
                    block196=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block196.getTree());

                    }
                    break;

            }

            L_end197=(Token)match(input,L_end,FOLLOW_L_end_in_if_expr2768); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_end.add(L_end197);



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
            // 471:26: -> ^( IF ( protected_expr )* ( block )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:471:29: ^( IF ( protected_expr )* ( block )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IF, "IF"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:471:34: ( protected_expr )*
                while ( stream_protected_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_protected_expr.nextTree());

                }
                stream_protected_expr.reset();
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:471:50: ( block )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:473:1: while_do_expr : L_while ( NL )? protected_expr ( NL )? L_do block L_end -> ^( WHILE_DO protected_expr block ) ;
    public final babel17Parser.while_do_expr_return while_do_expr() throws RecognitionException {
        babel17Parser.while_do_expr_return retval = new babel17Parser.while_do_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_while198=null;
        Token NL199=null;
        Token NL201=null;
        Token L_do202=null;
        Token L_end204=null;
        babel17Parser.protected_expr_return protected_expr200 = null;

        babel17Parser.block_return block203 = null;


        CommonTree L_while198_tree=null;
        CommonTree NL199_tree=null;
        CommonTree NL201_tree=null;
        CommonTree L_do202_tree=null;
        CommonTree L_end204_tree=null;
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_do=new RewriteRuleTokenStream(adaptor,"token L_do");
        RewriteRuleTokenStream stream_L_while=new RewriteRuleTokenStream(adaptor,"token L_while");
        RewriteRuleSubtreeStream stream_protected_expr=new RewriteRuleSubtreeStream(adaptor,"rule protected_expr");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:474:2: ( L_while ( NL )? protected_expr ( NL )? L_do block L_end -> ^( WHILE_DO protected_expr block ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:474:4: L_while ( NL )? protected_expr ( NL )? L_do block L_end
            {
            L_while198=(Token)match(input,L_while,FOLLOW_L_while_in_while_do_expr2792); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_while.add(L_while198);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:474:12: ( NL )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==NL) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:474:12: NL
                    {
                    NL199=(Token)match(input,NL,FOLLOW_NL_in_while_do_expr2794); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL199);


                    }
                    break;

            }

            pushFollow(FOLLOW_protected_expr_in_while_do_expr2797);
            protected_expr200=protected_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr200.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:474:31: ( NL )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==NL) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:474:31: NL
                    {
                    NL201=(Token)match(input,NL,FOLLOW_NL_in_while_do_expr2799); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL201);


                    }
                    break;

            }

            L_do202=(Token)match(input,L_do,FOLLOW_L_do_in_while_do_expr2802); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_do.add(L_do202);

            pushFollow(FOLLOW_block_in_while_do_expr2804);
            block203=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block203.getTree());
            L_end204=(Token)match(input,L_end,FOLLOW_L_end_in_while_do_expr2806); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_end.add(L_end204);



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
            // 475:5: -> ^( WHILE_DO protected_expr block )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:475:8: ^( WHILE_DO protected_expr block )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:477:1: cases : ( full_cases | pattern ( NL )? token_DOUBLE_ARROW block -> ^( CASES ^( NIL_TOKEN pattern block ) ) );
    public final babel17Parser.cases_return cases() throws RecognitionException {
        babel17Parser.cases_return retval = new babel17Parser.cases_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL207=null;
        babel17Parser.full_cases_return full_cases205 = null;

        babel17Parser.pattern_return pattern206 = null;

        babel17Parser.token_DOUBLE_ARROW_return token_DOUBLE_ARROW208 = null;

        babel17Parser.block_return block209 = null;


        CommonTree NL207_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_token_DOUBLE_ARROW=new RewriteRuleSubtreeStream(adaptor,"rule token_DOUBLE_ARROW");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:478:2: ( full_cases | pattern ( NL )? token_DOUBLE_ARROW block -> ^( CASES ^( NIL_TOKEN pattern block ) ) )
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==L_case) ) {
                alt90=1;
            }
            else if ( (LA90_0==L_exception||(LA90_0>=A_infinity && LA90_0<=U_infinity)||(LA90_0>=L_true && LA90_0<=L_false)||LA90_0==L_nil||LA90_0==MINUS||(LA90_0>=A_ELLIPSIS && LA90_0<=U_ELLIPSIS)||(LA90_0>=Constr && LA90_0<=Num)||(LA90_0>=String && LA90_0<=ROUND_BRACKET_OPEN)||LA90_0==SQUARE_BRACKET_OPEN||LA90_0==CURLY_BRACKET_OPEN||LA90_0==UNDERSCORE) ) {
                alt90=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }
            switch (alt90) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:478:4: full_cases
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_full_cases_in_cases2836);
                    full_cases205=full_cases();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, full_cases205.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:479:4: pattern ( NL )? token_DOUBLE_ARROW block
                    {
                    pushFollow(FOLLOW_pattern_in_cases2841);
                    pattern206=pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pattern.add(pattern206.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:479:12: ( NL )?
                    int alt89=2;
                    int LA89_0 = input.LA(1);

                    if ( (LA89_0==NL) ) {
                        alt89=1;
                    }
                    switch (alt89) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:479:12: NL
                            {
                            NL207=(Token)match(input,NL,FOLLOW_NL_in_cases2843); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL207);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_token_DOUBLE_ARROW_in_cases2846);
                    token_DOUBLE_ARROW208=token_DOUBLE_ARROW();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_token_DOUBLE_ARROW.add(token_DOUBLE_ARROW208.getTree());
                    pushFollow(FOLLOW_block_in_cases2848);
                    block209=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block209.getTree());


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
                    // 479:41: -> ^( CASES ^( NIL_TOKEN pattern block ) )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:479:44: ^( CASES ^( NIL_TOKEN pattern block ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CASES, "CASES"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:479:52: ^( NIL_TOKEN pattern block )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_2);

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:481:1: full_cases : ( case_expr )+ -> ^( CASES ( case_expr )+ ) ;
    public final babel17Parser.full_cases_return full_cases() throws RecognitionException {
        babel17Parser.full_cases_return retval = new babel17Parser.full_cases_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.case_expr_return case_expr210 = null;


        RewriteRuleSubtreeStream stream_case_expr=new RewriteRuleSubtreeStream(adaptor,"rule case_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:482:2: ( ( case_expr )+ -> ^( CASES ( case_expr )+ ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:482:4: ( case_expr )+
            {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:482:4: ( case_expr )+
            int cnt91=0;
            loop91:
            do {
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( (LA91_0==L_case) ) {
                    alt91=1;
                }


                switch (alt91) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:482:4: case_expr
            	    {
            	    pushFollow(FOLLOW_case_expr_in_full_cases2871);
            	    case_expr210=case_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_case_expr.add(case_expr210.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt91 >= 1 ) break loop91;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(91, input);
                        throw eee;
                }
                cnt91++;
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
            // 482:15: -> ^( CASES ( case_expr )+ )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:482:18: ^( CASES ( case_expr )+ )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:484:1: case_expr : ( L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW block ) -> ^( NIL_TOKEN pattern block ) ;
    public final babel17Parser.case_expr_return case_expr() throws RecognitionException {
        babel17Parser.case_expr_return retval = new babel17Parser.case_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_case211=null;
        Token NL212=null;
        Token NL214=null;
        babel17Parser.pattern_return pattern213 = null;

        babel17Parser.token_DOUBLE_ARROW_return token_DOUBLE_ARROW215 = null;

        babel17Parser.block_return block216 = null;


        CommonTree L_case211_tree=null;
        CommonTree NL212_tree=null;
        CommonTree NL214_tree=null;
        RewriteRuleTokenStream stream_L_case=new RewriteRuleTokenStream(adaptor,"token L_case");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_token_DOUBLE_ARROW=new RewriteRuleSubtreeStream(adaptor,"rule token_DOUBLE_ARROW");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:485:2: ( ( L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW block ) -> ^( NIL_TOKEN pattern block ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:485:4: ( L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW block )
            {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:485:4: ( L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW block )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:485:5: L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW block
            {
            L_case211=(Token)match(input,L_case,FOLLOW_L_case_in_case_expr2892); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_case.add(L_case211);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:485:12: ( NL )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==NL) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:485:12: NL
                    {
                    NL212=(Token)match(input,NL,FOLLOW_NL_in_case_expr2894); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL212);


                    }
                    break;

            }

            pushFollow(FOLLOW_pattern_in_case_expr2897);
            pattern213=pattern();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pattern.add(pattern213.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:485:24: ( NL )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==NL) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:485:24: NL
                    {
                    NL214=(Token)match(input,NL,FOLLOW_NL_in_case_expr2899); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL214);


                    }
                    break;

            }

            pushFollow(FOLLOW_token_DOUBLE_ARROW_in_case_expr2902);
            token_DOUBLE_ARROW215=token_DOUBLE_ARROW();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_token_DOUBLE_ARROW.add(token_DOUBLE_ARROW215.getTree());
            pushFollow(FOLLOW_block_in_case_expr2904);
            block216=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block216.getTree());

            }



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
            // 485:54: -> ^( NIL_TOKEN pattern block )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:485:57: ^( NIL_TOKEN pattern block )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_1);

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:487:1: match_expr : L_match ( NL )? p_op_expr ( NL )? full_cases L_end -> ^( MATCH p_op_expr full_cases ) ;
    public final babel17Parser.match_expr_return match_expr() throws RecognitionException {
        babel17Parser.match_expr_return retval = new babel17Parser.match_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_match217=null;
        Token NL218=null;
        Token NL220=null;
        Token L_end222=null;
        babel17Parser.p_op_expr_return p_op_expr219 = null;

        babel17Parser.full_cases_return full_cases221 = null;


        CommonTree L_match217_tree=null;
        CommonTree NL218_tree=null;
        CommonTree NL220_tree=null;
        CommonTree L_end222_tree=null;
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_match=new RewriteRuleTokenStream(adaptor,"token L_match");
        RewriteRuleSubtreeStream stream_full_cases=new RewriteRuleSubtreeStream(adaptor,"rule full_cases");
        RewriteRuleSubtreeStream stream_p_op_expr=new RewriteRuleSubtreeStream(adaptor,"rule p_op_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:488:2: ( L_match ( NL )? p_op_expr ( NL )? full_cases L_end -> ^( MATCH p_op_expr full_cases ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:488:4: L_match ( NL )? p_op_expr ( NL )? full_cases L_end
            {
            L_match217=(Token)match(input,L_match,FOLLOW_L_match_in_match_expr2925); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_match.add(L_match217);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:488:12: ( NL )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==NL) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:488:12: NL
                    {
                    NL218=(Token)match(input,NL,FOLLOW_NL_in_match_expr2927); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL218);


                    }
                    break;

            }

            pushFollow(FOLLOW_p_op_expr_in_match_expr2930);
            p_op_expr219=p_op_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_p_op_expr.add(p_op_expr219.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:488:26: ( NL )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==NL) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:488:26: NL
                    {
                    NL220=(Token)match(input,NL,FOLLOW_NL_in_match_expr2932); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL220);


                    }
                    break;

            }

            pushFollow(FOLLOW_full_cases_in_match_expr2935);
            full_cases221=full_cases();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_full_cases.add(full_cases221.getTree());
            L_end222=(Token)match(input,L_end,FOLLOW_L_end_in_match_expr2937); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_end.add(L_end222);



            // AST REWRITE
            // elements: p_op_expr, full_cases
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 489:5: -> ^( MATCH p_op_expr full_cases )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:489:8: ^( MATCH p_op_expr full_cases )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:491:1: lambda_expr : lambda_cases -> ^( LAMBDA lambda_cases ) ;
    public final babel17Parser.lambda_expr_return lambda_expr() throws RecognitionException {
        babel17Parser.lambda_expr_return retval = new babel17Parser.lambda_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.lambda_cases_return lambda_cases223 = null;


        RewriteRuleSubtreeStream stream_lambda_cases=new RewriteRuleSubtreeStream(adaptor,"rule lambda_cases");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:492:2: ( lambda_cases -> ^( LAMBDA lambda_cases ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:492:4: lambda_cases
            {
            pushFollow(FOLLOW_lambda_cases_in_lambda_expr2963);
            lambda_cases223=lambda_cases();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_lambda_cases.add(lambda_cases223.getTree());


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
            // 492:17: -> ^( LAMBDA lambda_cases )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:492:20: ^( LAMBDA lambda_cases )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:494:1: lambda_cases : pattern ( NL )? token_DOUBLE_ARROW ( NL )? lop_expr -> ^( CASES ^( NIL_TOKEN pattern ^( BLOCK lop_expr ) ) ) ;
    public final babel17Parser.lambda_cases_return lambda_cases() throws RecognitionException {
        babel17Parser.lambda_cases_return retval = new babel17Parser.lambda_cases_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL225=null;
        Token NL227=null;
        babel17Parser.pattern_return pattern224 = null;

        babel17Parser.token_DOUBLE_ARROW_return token_DOUBLE_ARROW226 = null;

        babel17Parser.lop_expr_return lop_expr228 = null;


        CommonTree NL225_tree=null;
        CommonTree NL227_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_token_DOUBLE_ARROW=new RewriteRuleSubtreeStream(adaptor,"rule token_DOUBLE_ARROW");
        RewriteRuleSubtreeStream stream_lop_expr=new RewriteRuleSubtreeStream(adaptor,"rule lop_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:495:2: ( pattern ( NL )? token_DOUBLE_ARROW ( NL )? lop_expr -> ^( CASES ^( NIL_TOKEN pattern ^( BLOCK lop_expr ) ) ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:495:4: pattern ( NL )? token_DOUBLE_ARROW ( NL )? lop_expr
            {
            pushFollow(FOLLOW_pattern_in_lambda_cases2981);
            pattern224=pattern();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pattern.add(pattern224.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:495:12: ( NL )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==NL) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:495:12: NL
                    {
                    NL225=(Token)match(input,NL,FOLLOW_NL_in_lambda_cases2983); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL225);


                    }
                    break;

            }

            pushFollow(FOLLOW_token_DOUBLE_ARROW_in_lambda_cases2986);
            token_DOUBLE_ARROW226=token_DOUBLE_ARROW();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_token_DOUBLE_ARROW.add(token_DOUBLE_ARROW226.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:495:35: ( NL )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==NL) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:495:35: NL
                    {
                    NL227=(Token)match(input,NL,FOLLOW_NL_in_lambda_cases2988); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL227);


                    }
                    break;

            }

            pushFollow(FOLLOW_lop_expr_in_lambda_cases2991);
            lop_expr228=lop_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_lop_expr.add(lop_expr228.getTree());


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
            // 495:48: -> ^( CASES ^( NIL_TOKEN pattern ^( BLOCK lop_expr ) ) )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:495:51: ^( CASES ^( NIL_TOKEN pattern ^( BLOCK lop_expr ) ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CASES, "CASES"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:495:59: ^( NIL_TOKEN pattern ^( BLOCK lop_expr ) )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_2);

                adaptor.addChild(root_2, stream_pattern.nextTree());
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:495:79: ^( BLOCK lop_expr )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:497:1: protected_lambda_expr : protected_lambda_cases -> ^( LAMBDA protected_lambda_cases ) ;
    public final babel17Parser.protected_lambda_expr_return protected_lambda_expr() throws RecognitionException {
        babel17Parser.protected_lambda_expr_return retval = new babel17Parser.protected_lambda_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.protected_lambda_cases_return protected_lambda_cases229 = null;


        RewriteRuleSubtreeStream stream_protected_lambda_cases=new RewriteRuleSubtreeStream(adaptor,"rule protected_lambda_cases");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:498:2: ( protected_lambda_cases -> ^( LAMBDA protected_lambda_cases ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:498:4: protected_lambda_cases
            {
            pushFollow(FOLLOW_protected_lambda_cases_in_protected_lambda_expr3019);
            protected_lambda_cases229=protected_lambda_cases();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_protected_lambda_cases.add(protected_lambda_cases229.getTree());


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
            // 498:27: -> ^( LAMBDA protected_lambda_cases )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:498:30: ^( LAMBDA protected_lambda_cases )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:500:1: p_lambda_case_expr : ( L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block ) -> ^( NIL_TOKEN pattern pure_block ) ;
    public final babel17Parser.p_lambda_case_expr_return p_lambda_case_expr() throws RecognitionException {
        babel17Parser.p_lambda_case_expr_return retval = new babel17Parser.p_lambda_case_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_case230=null;
        Token NL231=null;
        Token NL233=null;
        Token NL235=null;
        babel17Parser.pattern_return pattern232 = null;

        babel17Parser.token_DOUBLE_ARROW_return token_DOUBLE_ARROW234 = null;

        babel17Parser.pure_block_return pure_block236 = null;


        CommonTree L_case230_tree=null;
        CommonTree NL231_tree=null;
        CommonTree NL233_tree=null;
        CommonTree NL235_tree=null;
        RewriteRuleTokenStream stream_L_case=new RewriteRuleTokenStream(adaptor,"token L_case");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_token_DOUBLE_ARROW=new RewriteRuleSubtreeStream(adaptor,"rule token_DOUBLE_ARROW");
        RewriteRuleSubtreeStream stream_pure_block=new RewriteRuleSubtreeStream(adaptor,"rule pure_block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:501:2: ( ( L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block ) -> ^( NIL_TOKEN pattern pure_block ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:501:4: ( L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block )
            {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:501:4: ( L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:501:5: L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block
            {
            L_case230=(Token)match(input,L_case,FOLLOW_L_case_in_p_lambda_case_expr3037); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_case.add(L_case230);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:501:12: ( NL )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==NL) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:501:12: NL
                    {
                    NL231=(Token)match(input,NL,FOLLOW_NL_in_p_lambda_case_expr3039); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL231);


                    }
                    break;

            }

            pushFollow(FOLLOW_pattern_in_p_lambda_case_expr3042);
            pattern232=pattern();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pattern.add(pattern232.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:501:24: ( NL )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==NL) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:501:24: NL
                    {
                    NL233=(Token)match(input,NL,FOLLOW_NL_in_p_lambda_case_expr3044); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL233);


                    }
                    break;

            }

            pushFollow(FOLLOW_token_DOUBLE_ARROW_in_p_lambda_case_expr3047);
            token_DOUBLE_ARROW234=token_DOUBLE_ARROW();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_token_DOUBLE_ARROW.add(token_DOUBLE_ARROW234.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:501:47: ( NL )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==NL) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:501:47: NL
                    {
                    NL235=(Token)match(input,NL,FOLLOW_NL_in_p_lambda_case_expr3049); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL235);


                    }
                    break;

            }

            pushFollow(FOLLOW_pure_block_in_p_lambda_case_expr3052);
            pure_block236=pure_block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pure_block.add(pure_block236.getTree());

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
            // 501:63: -> ^( NIL_TOKEN pattern pure_block )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:501:66: ^( NIL_TOKEN pattern pure_block )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_1);

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:503:1: protected_lambda_cases : ( pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block -> ^( CASES ^( NIL_TOKEN pattern pure_block ) ) | ( p_lambda_case_expr )+ -> ^( CASES ( p_lambda_case_expr )+ ) );
    public final babel17Parser.protected_lambda_cases_return protected_lambda_cases() throws RecognitionException {
        babel17Parser.protected_lambda_cases_return retval = new babel17Parser.protected_lambda_cases_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL238=null;
        Token NL240=null;
        babel17Parser.pattern_return pattern237 = null;

        babel17Parser.token_DOUBLE_ARROW_return token_DOUBLE_ARROW239 = null;

        babel17Parser.pure_block_return pure_block241 = null;

        babel17Parser.p_lambda_case_expr_return p_lambda_case_expr242 = null;


        CommonTree NL238_tree=null;
        CommonTree NL240_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_token_DOUBLE_ARROW=new RewriteRuleSubtreeStream(adaptor,"rule token_DOUBLE_ARROW");
        RewriteRuleSubtreeStream stream_p_lambda_case_expr=new RewriteRuleSubtreeStream(adaptor,"rule p_lambda_case_expr");
        RewriteRuleSubtreeStream stream_pure_block=new RewriteRuleSubtreeStream(adaptor,"rule pure_block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:504:2: ( pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block -> ^( CASES ^( NIL_TOKEN pattern pure_block ) ) | ( p_lambda_case_expr )+ -> ^( CASES ( p_lambda_case_expr )+ ) )
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==L_exception||(LA104_0>=A_infinity && LA104_0<=U_infinity)||(LA104_0>=L_true && LA104_0<=L_false)||LA104_0==L_nil||LA104_0==MINUS||(LA104_0>=A_ELLIPSIS && LA104_0<=U_ELLIPSIS)||(LA104_0>=Constr && LA104_0<=Num)||(LA104_0>=String && LA104_0<=ROUND_BRACKET_OPEN)||LA104_0==SQUARE_BRACKET_OPEN||LA104_0==CURLY_BRACKET_OPEN||LA104_0==UNDERSCORE) ) {
                alt104=1;
            }
            else if ( (LA104_0==L_case) ) {
                alt104=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 104, 0, input);

                throw nvae;
            }
            switch (alt104) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:504:4: pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block
                    {
                    pushFollow(FOLLOW_pattern_in_protected_lambda_cases3073);
                    pattern237=pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pattern.add(pattern237.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:504:12: ( NL )?
                    int alt101=2;
                    int LA101_0 = input.LA(1);

                    if ( (LA101_0==NL) ) {
                        alt101=1;
                    }
                    switch (alt101) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:504:12: NL
                            {
                            NL238=(Token)match(input,NL,FOLLOW_NL_in_protected_lambda_cases3075); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL238);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_token_DOUBLE_ARROW_in_protected_lambda_cases3078);
                    token_DOUBLE_ARROW239=token_DOUBLE_ARROW();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_token_DOUBLE_ARROW.add(token_DOUBLE_ARROW239.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:504:35: ( NL )?
                    int alt102=2;
                    int LA102_0 = input.LA(1);

                    if ( (LA102_0==NL) ) {
                        alt102=1;
                    }
                    switch (alt102) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:504:35: NL
                            {
                            NL240=(Token)match(input,NL,FOLLOW_NL_in_protected_lambda_cases3080); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL240);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_pure_block_in_protected_lambda_cases3083);
                    pure_block241=pure_block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pure_block.add(pure_block241.getTree());


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
                    // 504:50: -> ^( CASES ^( NIL_TOKEN pattern pure_block ) )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:504:53: ^( CASES ^( NIL_TOKEN pattern pure_block ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CASES, "CASES"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:504:61: ^( NIL_TOKEN pattern pure_block )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_2);

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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:505:4: ( p_lambda_case_expr )+
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:505:4: ( p_lambda_case_expr )+
                    int cnt103=0;
                    loop103:
                    do {
                        int alt103=2;
                        int LA103_0 = input.LA(1);

                        if ( (LA103_0==L_case) ) {
                            alt103=1;
                        }


                        switch (alt103) {
                    	case 1 :
                    	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:505:4: p_lambda_case_expr
                    	    {
                    	    pushFollow(FOLLOW_p_lambda_case_expr_in_protected_lambda_cases3102);
                    	    p_lambda_case_expr242=p_lambda_case_expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_p_lambda_case_expr.add(p_lambda_case_expr242.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt103 >= 1 ) break loop103;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(103, input);
                                throw eee;
                        }
                        cnt103++;
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
                    // 505:24: -> ^( CASES ( p_lambda_case_expr )+ )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:505:27: ^( CASES ( p_lambda_case_expr )+ )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:507:1: for_expr : L_for ( NL )? pattern ( NL )? L_in ( NL )? protected_expr ( NL )? L_do block L_end -> ^( FOR_EXPR pattern protected_expr block ) ;
    public final babel17Parser.for_expr_return for_expr() throws RecognitionException {
        babel17Parser.for_expr_return retval = new babel17Parser.for_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_for243=null;
        Token NL244=null;
        Token NL246=null;
        Token L_in247=null;
        Token NL248=null;
        Token NL250=null;
        Token L_do251=null;
        Token L_end253=null;
        babel17Parser.pattern_return pattern245 = null;

        babel17Parser.protected_expr_return protected_expr249 = null;

        babel17Parser.block_return block252 = null;


        CommonTree L_for243_tree=null;
        CommonTree NL244_tree=null;
        CommonTree NL246_tree=null;
        CommonTree L_in247_tree=null;
        CommonTree NL248_tree=null;
        CommonTree NL250_tree=null;
        CommonTree L_do251_tree=null;
        CommonTree L_end253_tree=null;
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleTokenStream stream_L_for=new RewriteRuleTokenStream(adaptor,"token L_for");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_in=new RewriteRuleTokenStream(adaptor,"token L_in");
        RewriteRuleTokenStream stream_L_do=new RewriteRuleTokenStream(adaptor,"token L_do");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_protected_expr=new RewriteRuleSubtreeStream(adaptor,"rule protected_expr");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:507:9: ( L_for ( NL )? pattern ( NL )? L_in ( NL )? protected_expr ( NL )? L_do block L_end -> ^( FOR_EXPR pattern protected_expr block ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:507:11: L_for ( NL )? pattern ( NL )? L_in ( NL )? protected_expr ( NL )? L_do block L_end
            {
            L_for243=(Token)match(input,L_for,FOLLOW_L_for_in_for_expr3119); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_for.add(L_for243);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:507:17: ( NL )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==NL) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:507:17: NL
                    {
                    NL244=(Token)match(input,NL,FOLLOW_NL_in_for_expr3121); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL244);


                    }
                    break;

            }

            pushFollow(FOLLOW_pattern_in_for_expr3124);
            pattern245=pattern();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pattern.add(pattern245.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:507:29: ( NL )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==NL) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:507:29: NL
                    {
                    NL246=(Token)match(input,NL,FOLLOW_NL_in_for_expr3126); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL246);


                    }
                    break;

            }

            L_in247=(Token)match(input,L_in,FOLLOW_L_in_in_for_expr3129); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_in.add(L_in247);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:507:38: ( NL )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==NL) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:507:38: NL
                    {
                    NL248=(Token)match(input,NL,FOLLOW_NL_in_for_expr3131); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL248);


                    }
                    break;

            }

            pushFollow(FOLLOW_protected_expr_in_for_expr3134);
            protected_expr249=protected_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr249.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:507:57: ( NL )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==NL) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:507:57: NL
                    {
                    NL250=(Token)match(input,NL,FOLLOW_NL_in_for_expr3136); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL250);


                    }
                    break;

            }

            L_do251=(Token)match(input,L_do,FOLLOW_L_do_in_for_expr3139); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_do.add(L_do251);

            pushFollow(FOLLOW_block_in_for_expr3141);
            block252=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block252.getTree());
            L_end253=(Token)match(input,L_end,FOLLOW_L_end_in_for_expr3143); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_end.add(L_end253);



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
            // 508:5: -> ^( FOR_EXPR pattern protected_expr block )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:508:8: ^( FOR_EXPR pattern protected_expr block )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:510:1: op_expr : ( builtin_primitive op_expr | bool_expr );
    public final babel17Parser.op_expr_return op_expr() throws RecognitionException {
        babel17Parser.op_expr_return retval = new babel17Parser.op_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.builtin_primitive_return builtin_primitive254 = null;

        babel17Parser.op_expr_return op_expr255 = null;

        babel17Parser.bool_expr_return bool_expr256 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:510:9: ( builtin_primitive op_expr | bool_expr )
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==L_exception||(LA109_0>=L_concurrent && LA109_0<=L_lazy)||LA109_0==L_random||LA109_0==TILDE) ) {
                alt109=1;
            }
            else if ( (LA109_0==L_begin||(LA109_0>=L_with && LA109_0<=L_if)||(LA109_0>=L_while && LA109_0<=L_for)||LA109_0==L_match||(LA109_0>=A_infinity && LA109_0<=U_infinity)||(LA109_0>=L_true && LA109_0<=L_this)||LA109_0==L_nil||LA109_0==MINUS||LA109_0==A_NOT||LA109_0==U_NOT||(LA109_0>=Constr && LA109_0<=Num)||(LA109_0>=String && LA109_0<=ROUND_BRACKET_OPEN)||LA109_0==SQUARE_BRACKET_OPEN||LA109_0==CURLY_BRACKET_OPEN) ) {
                alt109=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 109, 0, input);

                throw nvae;
            }
            switch (alt109) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:510:11: builtin_primitive op_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_builtin_primitive_in_op_expr3168);
                    builtin_primitive254=builtin_primitive();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(builtin_primitive254.getTree(), root_0);
                    pushFollow(FOLLOW_op_expr_in_op_expr3171);
                    op_expr255=op_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, op_expr255.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:511:4: bool_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_bool_expr_in_op_expr3176);
                    bool_expr256=bool_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_expr256.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:513:1: p_op_expr : ( builtin_primitive ( NL )? p_op_expr | p_bool_expr );
    public final babel17Parser.p_op_expr_return p_op_expr() throws RecognitionException {
        babel17Parser.p_op_expr_return retval = new babel17Parser.p_op_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL258=null;
        babel17Parser.builtin_primitive_return builtin_primitive257 = null;

        babel17Parser.p_op_expr_return p_op_expr259 = null;

        babel17Parser.p_bool_expr_return p_bool_expr260 = null;


        CommonTree NL258_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:514:2: ( builtin_primitive ( NL )? p_op_expr | p_bool_expr )
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==L_exception||(LA111_0>=L_concurrent && LA111_0<=L_lazy)||LA111_0==L_random||LA111_0==TILDE) ) {
                alt111=1;
            }
            else if ( (LA111_0==L_begin||(LA111_0>=L_with && LA111_0<=L_if)||(LA111_0>=L_while && LA111_0<=L_for)||LA111_0==L_match||(LA111_0>=A_infinity && LA111_0<=U_infinity)||(LA111_0>=L_true && LA111_0<=L_this)||LA111_0==L_nil||LA111_0==MINUS||LA111_0==A_NOT||LA111_0==U_NOT||(LA111_0>=Constr && LA111_0<=Num)||(LA111_0>=String && LA111_0<=ROUND_BRACKET_OPEN)||LA111_0==SQUARE_BRACKET_OPEN||LA111_0==CURLY_BRACKET_OPEN) ) {
                alt111=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 111, 0, input);

                throw nvae;
            }
            switch (alt111) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:514:4: builtin_primitive ( NL )? p_op_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_builtin_primitive_in_p_op_expr3186);
                    builtin_primitive257=builtin_primitive();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(builtin_primitive257.getTree(), root_0);
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:514:25: ( NL )?
                    int alt110=2;
                    int LA110_0 = input.LA(1);

                    if ( (LA110_0==NL) ) {
                        alt110=1;
                    }
                    switch (alt110) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:514:25: NL
                            {
                            NL258=(Token)match(input,NL,FOLLOW_NL_in_p_op_expr3189); if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_p_op_expr_in_p_op_expr3193);
                    p_op_expr259=p_op_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_op_expr259.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:515:4: p_bool_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_p_bool_expr_in_p_op_expr3198);
                    p_bool_expr260=p_bool_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_bool_expr260.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:518:1: builtin_primitive : ( L_random | L_await | L_exception | L_lazy | TILDE | L_concurrent );
    public final babel17Parser.builtin_primitive_return builtin_primitive() throws RecognitionException {
        babel17Parser.builtin_primitive_return retval = new babel17Parser.builtin_primitive_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set261=null;

        CommonTree set261_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:519:2: ( L_random | L_await | L_exception | L_lazy | TILDE | L_concurrent )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set261=(Token)input.LT(1);
            if ( input.LA(1)==L_exception||(input.LA(1)>=L_concurrent && input.LA(1)<=L_lazy)||input.LA(1)==L_random||input.LA(1)==TILDE ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set261));
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:521:1: bool_expr : bool_or_expr ;
    public final babel17Parser.bool_expr_return bool_expr() throws RecognitionException {
        babel17Parser.bool_expr_return retval = new babel17Parser.bool_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.bool_or_expr_return bool_or_expr262 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:522:2: ( bool_or_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:522:4: bool_or_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bool_or_expr_in_bool_expr3238);
            bool_or_expr262=bool_or_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_or_expr262.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:524:1: p_bool_expr : p_bool_or_expr ;
    public final babel17Parser.p_bool_expr_return p_bool_expr() throws RecognitionException {
        babel17Parser.p_bool_expr_return retval = new babel17Parser.p_bool_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.p_bool_or_expr_return p_bool_or_expr263 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:525:2: ( p_bool_or_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:525:4: p_bool_or_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_bool_or_expr_in_p_bool_expr3248);
            p_bool_or_expr263=p_bool_or_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_bool_or_expr263.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:527:1: bool_or_expr : bool_and_expr ( ( NL )? token_OR ( NL )? bool_and_expr )* ;
    public final babel17Parser.bool_or_expr_return bool_or_expr() throws RecognitionException {
        babel17Parser.bool_or_expr_return retval = new babel17Parser.bool_or_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL265=null;
        Token NL267=null;
        babel17Parser.bool_and_expr_return bool_and_expr264 = null;

        babel17Parser.token_OR_return token_OR266 = null;

        babel17Parser.bool_and_expr_return bool_and_expr268 = null;


        CommonTree NL265_tree=null;
        CommonTree NL267_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:528:2: ( bool_and_expr ( ( NL )? token_OR ( NL )? bool_and_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:528:4: bool_and_expr ( ( NL )? token_OR ( NL )? bool_and_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bool_and_expr_in_bool_or_expr3257);
            bool_and_expr264=bool_and_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_and_expr264.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:528:18: ( ( NL )? token_OR ( NL )? bool_and_expr )*
            loop114:
            do {
                int alt114=2;
                int LA114_0 = input.LA(1);

                if ( (LA114_0==NL) ) {
                    int LA114_1 = input.LA(2);

                    if ( (LA114_1==A_OR||LA114_1==U_OR) ) {
                        alt114=1;
                    }


                }
                else if ( (LA114_0==A_OR||LA114_0==U_OR) ) {
                    alt114=1;
                }


                switch (alt114) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:528:19: ( NL )? token_OR ( NL )? bool_and_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:528:21: ( NL )?
            	    int alt112=2;
            	    int LA112_0 = input.LA(1);

            	    if ( (LA112_0==NL) ) {
            	        alt112=1;
            	    }
            	    switch (alt112) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:528:21: NL
            	            {
            	            NL265=(Token)match(input,NL,FOLLOW_NL_in_bool_or_expr3260); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_token_OR_in_bool_or_expr3264);
            	    token_OR266=token_OR();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(token_OR266.getTree(), root_0);
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:528:36: ( NL )?
            	    int alt113=2;
            	    int LA113_0 = input.LA(1);

            	    if ( (LA113_0==NL) ) {
            	        alt113=1;
            	    }
            	    switch (alt113) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:528:36: NL
            	            {
            	            NL267=(Token)match(input,NL,FOLLOW_NL_in_bool_or_expr3267); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_bool_and_expr_in_bool_or_expr3271);
            	    bool_and_expr268=bool_and_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_and_expr268.getTree());

            	    }
            	    break;

            	default :
            	    break loop114;
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:530:1: p_bool_or_expr : p_bool_and_expr ( ( NL )? token_OR ( NL )? p_bool_and_expr )* ;
    public final babel17Parser.p_bool_or_expr_return p_bool_or_expr() throws RecognitionException {
        babel17Parser.p_bool_or_expr_return retval = new babel17Parser.p_bool_or_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL270=null;
        Token NL272=null;
        babel17Parser.p_bool_and_expr_return p_bool_and_expr269 = null;

        babel17Parser.token_OR_return token_OR271 = null;

        babel17Parser.p_bool_and_expr_return p_bool_and_expr273 = null;


        CommonTree NL270_tree=null;
        CommonTree NL272_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:531:2: ( p_bool_and_expr ( ( NL )? token_OR ( NL )? p_bool_and_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:531:4: p_bool_and_expr ( ( NL )? token_OR ( NL )? p_bool_and_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_bool_and_expr_in_p_bool_or_expr3283);
            p_bool_and_expr269=p_bool_and_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_bool_and_expr269.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:531:20: ( ( NL )? token_OR ( NL )? p_bool_and_expr )*
            loop117:
            do {
                int alt117=2;
                int LA117_0 = input.LA(1);

                if ( (LA117_0==NL) ) {
                    int LA117_1 = input.LA(2);

                    if ( (LA117_1==A_OR||LA117_1==U_OR) ) {
                        alt117=1;
                    }


                }
                else if ( (LA117_0==A_OR||LA117_0==U_OR) ) {
                    alt117=1;
                }


                switch (alt117) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:531:21: ( NL )? token_OR ( NL )? p_bool_and_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:531:23: ( NL )?
            	    int alt115=2;
            	    int LA115_0 = input.LA(1);

            	    if ( (LA115_0==NL) ) {
            	        alt115=1;
            	    }
            	    switch (alt115) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:531:23: NL
            	            {
            	            NL270=(Token)match(input,NL,FOLLOW_NL_in_p_bool_or_expr3286); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_token_OR_in_p_bool_or_expr3290);
            	    token_OR271=token_OR();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(token_OR271.getTree(), root_0);
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:531:38: ( NL )?
            	    int alt116=2;
            	    int LA116_0 = input.LA(1);

            	    if ( (LA116_0==NL) ) {
            	        alt116=1;
            	    }
            	    switch (alt116) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:531:38: NL
            	            {
            	            NL272=(Token)match(input,NL,FOLLOW_NL_in_p_bool_or_expr3293); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_bool_and_expr_in_p_bool_or_expr3297);
            	    p_bool_and_expr273=p_bool_and_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_bool_and_expr273.getTree());

            	    }
            	    break;

            	default :
            	    break loop117;
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:533:1: bool_and_expr : bool_not_expr ( ( NL )? token_AND ( NL )? bool_not_expr )* ;
    public final babel17Parser.bool_and_expr_return bool_and_expr() throws RecognitionException {
        babel17Parser.bool_and_expr_return retval = new babel17Parser.bool_and_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL275=null;
        Token NL277=null;
        babel17Parser.bool_not_expr_return bool_not_expr274 = null;

        babel17Parser.token_AND_return token_AND276 = null;

        babel17Parser.bool_not_expr_return bool_not_expr278 = null;


        CommonTree NL275_tree=null;
        CommonTree NL277_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:534:2: ( bool_not_expr ( ( NL )? token_AND ( NL )? bool_not_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:534:4: bool_not_expr ( ( NL )? token_AND ( NL )? bool_not_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bool_not_expr_in_bool_and_expr3309);
            bool_not_expr274=bool_not_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_not_expr274.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:534:18: ( ( NL )? token_AND ( NL )? bool_not_expr )*
            loop120:
            do {
                int alt120=2;
                int LA120_0 = input.LA(1);

                if ( (LA120_0==NL) ) {
                    int LA120_1 = input.LA(2);

                    if ( (LA120_1==A_AND||LA120_1==U_AND) ) {
                        alt120=1;
                    }


                }
                else if ( (LA120_0==A_AND||LA120_0==U_AND) ) {
                    alt120=1;
                }


                switch (alt120) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:534:19: ( NL )? token_AND ( NL )? bool_not_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:534:21: ( NL )?
            	    int alt118=2;
            	    int LA118_0 = input.LA(1);

            	    if ( (LA118_0==NL) ) {
            	        alt118=1;
            	    }
            	    switch (alt118) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:534:21: NL
            	            {
            	            NL275=(Token)match(input,NL,FOLLOW_NL_in_bool_and_expr3312); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_token_AND_in_bool_and_expr3316);
            	    token_AND276=token_AND();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(token_AND276.getTree(), root_0);
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:534:37: ( NL )?
            	    int alt119=2;
            	    int LA119_0 = input.LA(1);

            	    if ( (LA119_0==NL) ) {
            	        alt119=1;
            	    }
            	    switch (alt119) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:534:37: NL
            	            {
            	            NL277=(Token)match(input,NL,FOLLOW_NL_in_bool_and_expr3319); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_bool_not_expr_in_bool_and_expr3323);
            	    bool_not_expr278=bool_not_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_not_expr278.getTree());

            	    }
            	    break;

            	default :
            	    break loop120;
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:536:1: p_bool_and_expr : p_bool_not_expr ( ( NL )? token_AND ( NL )? p_bool_not_expr )* ;
    public final babel17Parser.p_bool_and_expr_return p_bool_and_expr() throws RecognitionException {
        babel17Parser.p_bool_and_expr_return retval = new babel17Parser.p_bool_and_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL280=null;
        Token NL282=null;
        babel17Parser.p_bool_not_expr_return p_bool_not_expr279 = null;

        babel17Parser.token_AND_return token_AND281 = null;

        babel17Parser.p_bool_not_expr_return p_bool_not_expr283 = null;


        CommonTree NL280_tree=null;
        CommonTree NL282_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:537:2: ( p_bool_not_expr ( ( NL )? token_AND ( NL )? p_bool_not_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:537:4: p_bool_not_expr ( ( NL )? token_AND ( NL )? p_bool_not_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_bool_not_expr_in_p_bool_and_expr3335);
            p_bool_not_expr279=p_bool_not_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_bool_not_expr279.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:537:20: ( ( NL )? token_AND ( NL )? p_bool_not_expr )*
            loop123:
            do {
                int alt123=2;
                int LA123_0 = input.LA(1);

                if ( (LA123_0==NL) ) {
                    int LA123_1 = input.LA(2);

                    if ( (LA123_1==A_AND||LA123_1==U_AND) ) {
                        alt123=1;
                    }


                }
                else if ( (LA123_0==A_AND||LA123_0==U_AND) ) {
                    alt123=1;
                }


                switch (alt123) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:537:21: ( NL )? token_AND ( NL )? p_bool_not_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:537:23: ( NL )?
            	    int alt121=2;
            	    int LA121_0 = input.LA(1);

            	    if ( (LA121_0==NL) ) {
            	        alt121=1;
            	    }
            	    switch (alt121) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:537:23: NL
            	            {
            	            NL280=(Token)match(input,NL,FOLLOW_NL_in_p_bool_and_expr3338); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_token_AND_in_p_bool_and_expr3342);
            	    token_AND281=token_AND();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(token_AND281.getTree(), root_0);
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:537:39: ( NL )?
            	    int alt122=2;
            	    int LA122_0 = input.LA(1);

            	    if ( (LA122_0==NL) ) {
            	        alt122=1;
            	    }
            	    switch (alt122) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:537:39: NL
            	            {
            	            NL282=(Token)match(input,NL,FOLLOW_NL_in_p_bool_and_expr3345); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_bool_not_expr_in_p_bool_and_expr3349);
            	    p_bool_not_expr283=p_bool_not_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_bool_not_expr283.getTree());

            	    }
            	    break;

            	default :
            	    break loop123;
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:540:1: bool_not_expr : ( token_NOT ( NL )? bool_not_expr | rel_expr );
    public final babel17Parser.bool_not_expr_return bool_not_expr() throws RecognitionException {
        babel17Parser.bool_not_expr_return retval = new babel17Parser.bool_not_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL285=null;
        babel17Parser.token_NOT_return token_NOT284 = null;

        babel17Parser.bool_not_expr_return bool_not_expr286 = null;

        babel17Parser.rel_expr_return rel_expr287 = null;


        CommonTree NL285_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:541:2: ( token_NOT ( NL )? bool_not_expr | rel_expr )
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==A_NOT||LA125_0==U_NOT) ) {
                alt125=1;
            }
            else if ( (LA125_0==L_begin||(LA125_0>=L_with && LA125_0<=L_if)||(LA125_0>=L_while && LA125_0<=L_for)||LA125_0==L_match||(LA125_0>=A_infinity && LA125_0<=U_infinity)||(LA125_0>=L_true && LA125_0<=L_this)||LA125_0==L_nil||LA125_0==MINUS||(LA125_0>=Constr && LA125_0<=Num)||(LA125_0>=String && LA125_0<=ROUND_BRACKET_OPEN)||LA125_0==SQUARE_BRACKET_OPEN||LA125_0==CURLY_BRACKET_OPEN) ) {
                alt125=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 125, 0, input);

                throw nvae;
            }
            switch (alt125) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:541:4: token_NOT ( NL )? bool_not_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_NOT_in_bool_not_expr3361);
                    token_NOT284=token_NOT();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(token_NOT284.getTree(), root_0);
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:541:17: ( NL )?
                    int alt124=2;
                    int LA124_0 = input.LA(1);

                    if ( (LA124_0==NL) ) {
                        alt124=1;
                    }
                    switch (alt124) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:541:17: NL
                            {
                            NL285=(Token)match(input,NL,FOLLOW_NL_in_bool_not_expr3364); if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_bool_not_expr_in_bool_not_expr3368);
                    bool_not_expr286=bool_not_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_not_expr286.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:542:4: rel_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_rel_expr_in_bool_not_expr3373);
                    rel_expr287=rel_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rel_expr287.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:544:1: p_bool_not_expr : ( token_NOT ( NL )? p_bool_not_expr | p_rel_expr );
    public final babel17Parser.p_bool_not_expr_return p_bool_not_expr() throws RecognitionException {
        babel17Parser.p_bool_not_expr_return retval = new babel17Parser.p_bool_not_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL289=null;
        babel17Parser.token_NOT_return token_NOT288 = null;

        babel17Parser.p_bool_not_expr_return p_bool_not_expr290 = null;

        babel17Parser.p_rel_expr_return p_rel_expr291 = null;


        CommonTree NL289_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:545:2: ( token_NOT ( NL )? p_bool_not_expr | p_rel_expr )
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==A_NOT||LA127_0==U_NOT) ) {
                alt127=1;
            }
            else if ( (LA127_0==L_begin||(LA127_0>=L_with && LA127_0<=L_if)||(LA127_0>=L_while && LA127_0<=L_for)||LA127_0==L_match||(LA127_0>=A_infinity && LA127_0<=U_infinity)||(LA127_0>=L_true && LA127_0<=L_this)||LA127_0==L_nil||LA127_0==MINUS||(LA127_0>=Constr && LA127_0<=Num)||(LA127_0>=String && LA127_0<=ROUND_BRACKET_OPEN)||LA127_0==SQUARE_BRACKET_OPEN||LA127_0==CURLY_BRACKET_OPEN) ) {
                alt127=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 127, 0, input);

                throw nvae;
            }
            switch (alt127) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:545:4: token_NOT ( NL )? p_bool_not_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_NOT_in_p_bool_not_expr3384);
                    token_NOT288=token_NOT();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(token_NOT288.getTree(), root_0);
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:545:17: ( NL )?
                    int alt126=2;
                    int LA126_0 = input.LA(1);

                    if ( (LA126_0==NL) ) {
                        alt126=1;
                    }
                    switch (alt126) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:545:17: NL
                            {
                            NL289=(Token)match(input,NL,FOLLOW_NL_in_p_bool_not_expr3387); if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_p_bool_not_expr_in_p_bool_not_expr3391);
                    p_bool_not_expr290=p_bool_not_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_bool_not_expr290.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:546:4: p_rel_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_p_rel_expr_in_p_bool_not_expr3396);
                    p_rel_expr291=p_rel_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_rel_expr291.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:548:1: rel_expr : arith_expr ( ( NL )? rel_op ( NL )? arith_expr )* -> ^( COMPARE arith_expr ( rel_op arith_expr )* ) ;
    public final babel17Parser.rel_expr_return rel_expr() throws RecognitionException {
        babel17Parser.rel_expr_return retval = new babel17Parser.rel_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL293=null;
        Token NL295=null;
        babel17Parser.arith_expr_return arith_expr292 = null;

        babel17Parser.rel_op_return rel_op294 = null;

        babel17Parser.arith_expr_return arith_expr296 = null;


        CommonTree NL293_tree=null;
        CommonTree NL295_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_arith_expr=new RewriteRuleSubtreeStream(adaptor,"rule arith_expr");
        RewriteRuleSubtreeStream stream_rel_op=new RewriteRuleSubtreeStream(adaptor,"rule rel_op");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:549:2: ( arith_expr ( ( NL )? rel_op ( NL )? arith_expr )* -> ^( COMPARE arith_expr ( rel_op arith_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:549:4: arith_expr ( ( NL )? rel_op ( NL )? arith_expr )*
            {
            pushFollow(FOLLOW_arith_expr_in_rel_expr3405);
            arith_expr292=arith_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_arith_expr.add(arith_expr292.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:549:15: ( ( NL )? rel_op ( NL )? arith_expr )*
            loop130:
            do {
                int alt130=2;
                int LA130_0 = input.LA(1);

                if ( (LA130_0==NL) ) {
                    int LA130_1 = input.LA(2);

                    if ( ((LA130_1>=A_EQUAL && LA130_1<=UNRELATED)) ) {
                        alt130=1;
                    }


                }
                else if ( ((LA130_0>=A_EQUAL && LA130_0<=UNRELATED)) ) {
                    alt130=1;
                }


                switch (alt130) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:549:16: ( NL )? rel_op ( NL )? arith_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:549:16: ( NL )?
            	    int alt128=2;
            	    int LA128_0 = input.LA(1);

            	    if ( (LA128_0==NL) ) {
            	        alt128=1;
            	    }
            	    switch (alt128) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:549:16: NL
            	            {
            	            NL293=(Token)match(input,NL,FOLLOW_NL_in_rel_expr3408); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL293);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_rel_op_in_rel_expr3411);
            	    rel_op294=rel_op();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_rel_op.add(rel_op294.getTree());
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:549:27: ( NL )?
            	    int alt129=2;
            	    int LA129_0 = input.LA(1);

            	    if ( (LA129_0==NL) ) {
            	        alt129=1;
            	    }
            	    switch (alt129) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:549:27: NL
            	            {
            	            NL295=(Token)match(input,NL,FOLLOW_NL_in_rel_expr3413); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL295);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_arith_expr_in_rel_expr3416);
            	    arith_expr296=arith_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_arith_expr.add(arith_expr296.getTree());

            	    }
            	    break;

            	default :
            	    break loop130;
                }
            } while (true);



            // AST REWRITE
            // elements: arith_expr, rel_op, arith_expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 549:44: -> ^( COMPARE arith_expr ( rel_op arith_expr )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:549:47: ^( COMPARE arith_expr ( rel_op arith_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COMPARE, "COMPARE"), root_1);

                adaptor.addChild(root_1, stream_arith_expr.nextTree());
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:549:68: ( rel_op arith_expr )*
                while ( stream_rel_op.hasNext()||stream_arith_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_rel_op.nextTree());
                    adaptor.addChild(root_1, stream_arith_expr.nextTree());

                }
                stream_rel_op.reset();
                stream_arith_expr.reset();

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:551:1: p_rel_expr : p_arith_expr ( ( NL )? rel_op ( NL )? p_arith_expr )* -> ^( COMPARE p_arith_expr ( rel_op p_arith_expr )* ) ;
    public final babel17Parser.p_rel_expr_return p_rel_expr() throws RecognitionException {
        babel17Parser.p_rel_expr_return retval = new babel17Parser.p_rel_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL298=null;
        Token NL300=null;
        babel17Parser.p_arith_expr_return p_arith_expr297 = null;

        babel17Parser.rel_op_return rel_op299 = null;

        babel17Parser.p_arith_expr_return p_arith_expr301 = null;


        CommonTree NL298_tree=null;
        CommonTree NL300_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_p_arith_expr=new RewriteRuleSubtreeStream(adaptor,"rule p_arith_expr");
        RewriteRuleSubtreeStream stream_rel_op=new RewriteRuleSubtreeStream(adaptor,"rule rel_op");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:552:2: ( p_arith_expr ( ( NL )? rel_op ( NL )? p_arith_expr )* -> ^( COMPARE p_arith_expr ( rel_op p_arith_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:552:4: p_arith_expr ( ( NL )? rel_op ( NL )? p_arith_expr )*
            {
            pushFollow(FOLLOW_p_arith_expr_in_p_rel_expr3443);
            p_arith_expr297=p_arith_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_p_arith_expr.add(p_arith_expr297.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:552:17: ( ( NL )? rel_op ( NL )? p_arith_expr )*
            loop133:
            do {
                int alt133=2;
                int LA133_0 = input.LA(1);

                if ( (LA133_0==NL) ) {
                    int LA133_1 = input.LA(2);

                    if ( ((LA133_1>=A_EQUAL && LA133_1<=UNRELATED)) ) {
                        alt133=1;
                    }


                }
                else if ( ((LA133_0>=A_EQUAL && LA133_0<=UNRELATED)) ) {
                    alt133=1;
                }


                switch (alt133) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:552:18: ( NL )? rel_op ( NL )? p_arith_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:552:18: ( NL )?
            	    int alt131=2;
            	    int LA131_0 = input.LA(1);

            	    if ( (LA131_0==NL) ) {
            	        alt131=1;
            	    }
            	    switch (alt131) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:552:18: NL
            	            {
            	            NL298=(Token)match(input,NL,FOLLOW_NL_in_p_rel_expr3446); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL298);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_rel_op_in_p_rel_expr3449);
            	    rel_op299=rel_op();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_rel_op.add(rel_op299.getTree());
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:552:29: ( NL )?
            	    int alt132=2;
            	    int LA132_0 = input.LA(1);

            	    if ( (LA132_0==NL) ) {
            	        alt132=1;
            	    }
            	    switch (alt132) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:552:29: NL
            	            {
            	            NL300=(Token)match(input,NL,FOLLOW_NL_in_p_rel_expr3451); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL300);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_arith_expr_in_p_rel_expr3454);
            	    p_arith_expr301=p_arith_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_p_arith_expr.add(p_arith_expr301.getTree());

            	    }
            	    break;

            	default :
            	    break loop133;
                }
            } while (true);



            // AST REWRITE
            // elements: p_arith_expr, rel_op, p_arith_expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 552:48: -> ^( COMPARE p_arith_expr ( rel_op p_arith_expr )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:552:51: ^( COMPARE p_arith_expr ( rel_op p_arith_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COMPARE, "COMPARE"), root_1);

                adaptor.addChild(root_1, stream_p_arith_expr.nextTree());
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:552:74: ( rel_op p_arith_expr )*
                while ( stream_p_arith_expr.hasNext()||stream_rel_op.hasNext() ) {
                    adaptor.addChild(root_1, stream_rel_op.nextTree());
                    adaptor.addChild(root_1, stream_p_arith_expr.nextTree());

                }
                stream_p_arith_expr.reset();
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
    // $ANTLR end "p_rel_expr"

    public static class rel_op_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rel_op"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:555:1: rel_op : ( token_EQUAL | token_NOT_EQUAL | UNRELATED | GREATER | token_GREATER_EQ | LESS | token_LESS_EQ );
    public final babel17Parser.rel_op_return rel_op() throws RecognitionException {
        babel17Parser.rel_op_return retval = new babel17Parser.rel_op_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token UNRELATED304=null;
        Token GREATER305=null;
        Token LESS307=null;
        babel17Parser.token_EQUAL_return token_EQUAL302 = null;

        babel17Parser.token_NOT_EQUAL_return token_NOT_EQUAL303 = null;

        babel17Parser.token_GREATER_EQ_return token_GREATER_EQ306 = null;

        babel17Parser.token_LESS_EQ_return token_LESS_EQ308 = null;


        CommonTree UNRELATED304_tree=null;
        CommonTree GREATER305_tree=null;
        CommonTree LESS307_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:555:8: ( token_EQUAL | token_NOT_EQUAL | UNRELATED | GREATER | token_GREATER_EQ | LESS | token_LESS_EQ )
            int alt134=7;
            switch ( input.LA(1) ) {
            case A_EQUAL:
            case U_EQUAL:
                {
                alt134=1;
                }
                break;
            case A_NOT_EQUAL:
            case U_NOT_EQUAL:
                {
                alt134=2;
                }
                break;
            case UNRELATED:
                {
                alt134=3;
                }
                break;
            case GREATER:
                {
                alt134=4;
                }
                break;
            case A_GREATER_EQ:
            case U_GREATER_EQ:
                {
                alt134=5;
                }
                break;
            case LESS:
                {
                alt134=6;
                }
                break;
            case A_LESS_EQ:
            case U_LESS_EQ:
                {
                alt134=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 134, 0, input);

                throw nvae;
            }

            switch (alt134) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:555:10: token_EQUAL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_EQUAL_in_rel_op3480);
                    token_EQUAL302=token_EQUAL();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, token_EQUAL302.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:555:24: token_NOT_EQUAL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_NOT_EQUAL_in_rel_op3484);
                    token_NOT_EQUAL303=token_NOT_EQUAL();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, token_NOT_EQUAL303.getTree());

                    }
                    break;
                case 3 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:555:42: UNRELATED
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    UNRELATED304=(Token)match(input,UNRELATED,FOLLOW_UNRELATED_in_rel_op3488); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UNRELATED304_tree = (CommonTree)adaptor.create(UNRELATED304);
                    adaptor.addChild(root_0, UNRELATED304_tree);
                    }

                    }
                    break;
                case 4 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:555:54: GREATER
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    GREATER305=(Token)match(input,GREATER,FOLLOW_GREATER_in_rel_op3492); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    GREATER305_tree = (CommonTree)adaptor.create(GREATER305);
                    adaptor.addChild(root_0, GREATER305_tree);
                    }

                    }
                    break;
                case 5 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:555:64: token_GREATER_EQ
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_GREATER_EQ_in_rel_op3496);
                    token_GREATER_EQ306=token_GREATER_EQ();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, token_GREATER_EQ306.getTree());

                    }
                    break;
                case 6 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:555:83: LESS
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    LESS307=(Token)match(input,LESS,FOLLOW_LESS_in_rel_op3500); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LESS307_tree = (CommonTree)adaptor.create(LESS307);
                    adaptor.addChild(root_0, LESS307_tree);
                    }

                    }
                    break;
                case 7 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:555:90: token_LESS_EQ
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_LESS_EQ_in_rel_op3504);
                    token_LESS_EQ308=token_LESS_EQ();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, token_LESS_EQ308.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:558:1: arith_expr : plusplus_expr ;
    public final babel17Parser.arith_expr_return arith_expr() throws RecognitionException {
        babel17Parser.arith_expr_return retval = new babel17Parser.arith_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.plusplus_expr_return plusplus_expr309 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:559:2: ( plusplus_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:559:4: plusplus_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_plusplus_expr_in_arith_expr3516);
            plusplus_expr309=plusplus_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, plusplus_expr309.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:562:1: p_arith_expr : p_plusplus_expr ;
    public final babel17Parser.p_arith_expr_return p_arith_expr() throws RecognitionException {
        babel17Parser.p_arith_expr_return retval = new babel17Parser.p_arith_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.p_plusplus_expr_return p_plusplus_expr310 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:563:2: ( p_plusplus_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:563:4: p_plusplus_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_plusplus_expr_in_p_arith_expr3526);
            p_plusplus_expr310=p_plusplus_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_plusplus_expr310.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:565:1: plusplus_expr : timestimes_expr ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? timestimes_expr )* ;
    public final babel17Parser.plusplus_expr_return plusplus_expr() throws RecognitionException {
        babel17Parser.plusplus_expr_return retval = new babel17Parser.plusplus_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL312=null;
        Token PLUSPLUS313=null;
        Token MINUSMINUS314=null;
        Token NL315=null;
        babel17Parser.timestimes_expr_return timestimes_expr311 = null;

        babel17Parser.timestimes_expr_return timestimes_expr316 = null;


        CommonTree NL312_tree=null;
        CommonTree PLUSPLUS313_tree=null;
        CommonTree MINUSMINUS314_tree=null;
        CommonTree NL315_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:566:2: ( timestimes_expr ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? timestimes_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:566:4: timestimes_expr ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? timestimes_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_timestimes_expr_in_plusplus_expr3536);
            timestimes_expr311=timestimes_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, timestimes_expr311.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:566:20: ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? timestimes_expr )*
            loop138:
            do {
                int alt138=2;
                int LA138_0 = input.LA(1);

                if ( (LA138_0==NL) ) {
                    int LA138_1 = input.LA(2);

                    if ( ((LA138_1>=PLUSPLUS && LA138_1<=MINUSMINUS)) ) {
                        alt138=1;
                    }


                }
                else if ( ((LA138_0>=PLUSPLUS && LA138_0<=MINUSMINUS)) ) {
                    alt138=1;
                }


                switch (alt138) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:566:21: ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? timestimes_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:566:23: ( NL )?
            	    int alt135=2;
            	    int LA135_0 = input.LA(1);

            	    if ( (LA135_0==NL) ) {
            	        alt135=1;
            	    }
            	    switch (alt135) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:566:23: NL
            	            {
            	            NL312=(Token)match(input,NL,FOLLOW_NL_in_plusplus_expr3539); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:566:26: ( PLUSPLUS | MINUSMINUS )
            	    int alt136=2;
            	    int LA136_0 = input.LA(1);

            	    if ( (LA136_0==PLUSPLUS) ) {
            	        alt136=1;
            	    }
            	    else if ( (LA136_0==MINUSMINUS) ) {
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
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:566:27: PLUSPLUS
            	            {
            	            PLUSPLUS313=(Token)match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_plusplus_expr3544); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PLUSPLUS313_tree = (CommonTree)adaptor.create(PLUSPLUS313);
            	            root_0 = (CommonTree)adaptor.becomeRoot(PLUSPLUS313_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:566:37: MINUSMINUS
            	            {
            	            MINUSMINUS314=(Token)match(input,MINUSMINUS,FOLLOW_MINUSMINUS_in_plusplus_expr3547); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            MINUSMINUS314_tree = (CommonTree)adaptor.create(MINUSMINUS314);
            	            root_0 = (CommonTree)adaptor.becomeRoot(MINUSMINUS314_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:566:52: ( NL )?
            	    int alt137=2;
            	    int LA137_0 = input.LA(1);

            	    if ( (LA137_0==NL) ) {
            	        alt137=1;
            	    }
            	    switch (alt137) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:566:52: NL
            	            {
            	            NL315=(Token)match(input,NL,FOLLOW_NL_in_plusplus_expr3551); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_timestimes_expr_in_plusplus_expr3555);
            	    timestimes_expr316=timestimes_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, timestimes_expr316.getTree());

            	    }
            	    break;

            	default :
            	    break loop138;
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:568:1: p_plusplus_expr : p_timestimes_expr ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? p_timestimes_expr )* ;
    public final babel17Parser.p_plusplus_expr_return p_plusplus_expr() throws RecognitionException {
        babel17Parser.p_plusplus_expr_return retval = new babel17Parser.p_plusplus_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL318=null;
        Token PLUSPLUS319=null;
        Token MINUSMINUS320=null;
        Token NL321=null;
        babel17Parser.p_timestimes_expr_return p_timestimes_expr317 = null;

        babel17Parser.p_timestimes_expr_return p_timestimes_expr322 = null;


        CommonTree NL318_tree=null;
        CommonTree PLUSPLUS319_tree=null;
        CommonTree MINUSMINUS320_tree=null;
        CommonTree NL321_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:569:2: ( p_timestimes_expr ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? p_timestimes_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:569:4: p_timestimes_expr ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? p_timestimes_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_timestimes_expr_in_p_plusplus_expr3567);
            p_timestimes_expr317=p_timestimes_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_timestimes_expr317.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:569:22: ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? p_timestimes_expr )*
            loop142:
            do {
                int alt142=2;
                int LA142_0 = input.LA(1);

                if ( (LA142_0==NL) ) {
                    int LA142_1 = input.LA(2);

                    if ( ((LA142_1>=PLUSPLUS && LA142_1<=MINUSMINUS)) ) {
                        alt142=1;
                    }


                }
                else if ( ((LA142_0>=PLUSPLUS && LA142_0<=MINUSMINUS)) ) {
                    alt142=1;
                }


                switch (alt142) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:569:23: ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? p_timestimes_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:569:25: ( NL )?
            	    int alt139=2;
            	    int LA139_0 = input.LA(1);

            	    if ( (LA139_0==NL) ) {
            	        alt139=1;
            	    }
            	    switch (alt139) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:569:25: NL
            	            {
            	            NL318=(Token)match(input,NL,FOLLOW_NL_in_p_plusplus_expr3570); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:569:28: ( PLUSPLUS | MINUSMINUS )
            	    int alt140=2;
            	    int LA140_0 = input.LA(1);

            	    if ( (LA140_0==PLUSPLUS) ) {
            	        alt140=1;
            	    }
            	    else if ( (LA140_0==MINUSMINUS) ) {
            	        alt140=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 140, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt140) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:569:29: PLUSPLUS
            	            {
            	            PLUSPLUS319=(Token)match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_p_plusplus_expr3575); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PLUSPLUS319_tree = (CommonTree)adaptor.create(PLUSPLUS319);
            	            root_0 = (CommonTree)adaptor.becomeRoot(PLUSPLUS319_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:569:39: MINUSMINUS
            	            {
            	            MINUSMINUS320=(Token)match(input,MINUSMINUS,FOLLOW_MINUSMINUS_in_p_plusplus_expr3578); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            MINUSMINUS320_tree = (CommonTree)adaptor.create(MINUSMINUS320);
            	            root_0 = (CommonTree)adaptor.becomeRoot(MINUSMINUS320_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:569:54: ( NL )?
            	    int alt141=2;
            	    int LA141_0 = input.LA(1);

            	    if ( (LA141_0==NL) ) {
            	        alt141=1;
            	    }
            	    switch (alt141) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:569:54: NL
            	            {
            	            NL321=(Token)match(input,NL,FOLLOW_NL_in_p_plusplus_expr3582); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_timestimes_expr_in_p_plusplus_expr3586);
            	    p_timestimes_expr322=p_timestimes_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_timestimes_expr322.getTree());

            	    }
            	    break;

            	default :
            	    break loop142;
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:572:1: timestimes_expr : simple_expr ( ( NL )? ( TIMESTIMES ) ( NL )? simple_expr )* ;
    public final babel17Parser.timestimes_expr_return timestimes_expr() throws RecognitionException {
        babel17Parser.timestimes_expr_return retval = new babel17Parser.timestimes_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL324=null;
        Token TIMESTIMES325=null;
        Token NL326=null;
        babel17Parser.simple_expr_return simple_expr323 = null;

        babel17Parser.simple_expr_return simple_expr327 = null;


        CommonTree NL324_tree=null;
        CommonTree TIMESTIMES325_tree=null;
        CommonTree NL326_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:573:2: ( simple_expr ( ( NL )? ( TIMESTIMES ) ( NL )? simple_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:573:4: simple_expr ( ( NL )? ( TIMESTIMES ) ( NL )? simple_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_simple_expr_in_timestimes_expr3598);
            simple_expr323=simple_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, simple_expr323.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:573:16: ( ( NL )? ( TIMESTIMES ) ( NL )? simple_expr )*
            loop145:
            do {
                int alt145=2;
                int LA145_0 = input.LA(1);

                if ( (LA145_0==NL) ) {
                    int LA145_1 = input.LA(2);

                    if ( (LA145_1==TIMESTIMES) ) {
                        alt145=1;
                    }


                }
                else if ( (LA145_0==TIMESTIMES) ) {
                    alt145=1;
                }


                switch (alt145) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:573:17: ( NL )? ( TIMESTIMES ) ( NL )? simple_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:573:19: ( NL )?
            	    int alt143=2;
            	    int LA143_0 = input.LA(1);

            	    if ( (LA143_0==NL) ) {
            	        alt143=1;
            	    }
            	    switch (alt143) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:573:19: NL
            	            {
            	            NL324=(Token)match(input,NL,FOLLOW_NL_in_timestimes_expr3601); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:573:22: ( TIMESTIMES )
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:573:23: TIMESTIMES
            	    {
            	    TIMESTIMES325=(Token)match(input,TIMESTIMES,FOLLOW_TIMESTIMES_in_timestimes_expr3606); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    TIMESTIMES325_tree = (CommonTree)adaptor.create(TIMESTIMES325);
            	    root_0 = (CommonTree)adaptor.becomeRoot(TIMESTIMES325_tree, root_0);
            	    }

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:573:38: ( NL )?
            	    int alt144=2;
            	    int LA144_0 = input.LA(1);

            	    if ( (LA144_0==NL) ) {
            	        alt144=1;
            	    }
            	    switch (alt144) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:573:38: NL
            	            {
            	            NL326=(Token)match(input,NL,FOLLOW_NL_in_timestimes_expr3610); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_simple_expr_in_timestimes_expr3614);
            	    simple_expr327=simple_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, simple_expr327.getTree());

            	    }
            	    break;

            	default :
            	    break loop145;
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:575:1: p_timestimes_expr : p_simple_expr ( ( NL )? ( TIMESTIMES ) ( NL )? p_simple_expr )* ;
    public final babel17Parser.p_timestimes_expr_return p_timestimes_expr() throws RecognitionException {
        babel17Parser.p_timestimes_expr_return retval = new babel17Parser.p_timestimes_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL329=null;
        Token TIMESTIMES330=null;
        Token NL331=null;
        babel17Parser.p_simple_expr_return p_simple_expr328 = null;

        babel17Parser.p_simple_expr_return p_simple_expr332 = null;


        CommonTree NL329_tree=null;
        CommonTree TIMESTIMES330_tree=null;
        CommonTree NL331_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:576:2: ( p_simple_expr ( ( NL )? ( TIMESTIMES ) ( NL )? p_simple_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:576:4: p_simple_expr ( ( NL )? ( TIMESTIMES ) ( NL )? p_simple_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_simple_expr_in_p_timestimes_expr3627);
            p_simple_expr328=p_simple_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_simple_expr328.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:576:18: ( ( NL )? ( TIMESTIMES ) ( NL )? p_simple_expr )*
            loop148:
            do {
                int alt148=2;
                int LA148_0 = input.LA(1);

                if ( (LA148_0==NL) ) {
                    int LA148_1 = input.LA(2);

                    if ( (LA148_1==TIMESTIMES) ) {
                        alt148=1;
                    }


                }
                else if ( (LA148_0==TIMESTIMES) ) {
                    alt148=1;
                }


                switch (alt148) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:576:19: ( NL )? ( TIMESTIMES ) ( NL )? p_simple_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:576:21: ( NL )?
            	    int alt146=2;
            	    int LA146_0 = input.LA(1);

            	    if ( (LA146_0==NL) ) {
            	        alt146=1;
            	    }
            	    switch (alt146) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:576:21: NL
            	            {
            	            NL329=(Token)match(input,NL,FOLLOW_NL_in_p_timestimes_expr3630); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:576:24: ( TIMESTIMES )
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:576:25: TIMESTIMES
            	    {
            	    TIMESTIMES330=(Token)match(input,TIMESTIMES,FOLLOW_TIMESTIMES_in_p_timestimes_expr3635); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    TIMESTIMES330_tree = (CommonTree)adaptor.create(TIMESTIMES330);
            	    root_0 = (CommonTree)adaptor.becomeRoot(TIMESTIMES330_tree, root_0);
            	    }

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:576:40: ( NL )?
            	    int alt147=2;
            	    int LA147_0 = input.LA(1);

            	    if ( (LA147_0==NL) ) {
            	        alt147=1;
            	    }
            	    switch (alt147) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:576:40: NL
            	            {
            	            NL331=(Token)match(input,NL,FOLLOW_NL_in_p_timestimes_expr3639); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_simple_expr_in_p_timestimes_expr3643);
            	    p_simple_expr332=p_simple_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_simple_expr332.getTree());

            	    }
            	    break;

            	default :
            	    break loop148;
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:578:1: simple_expr : cons_expr ;
    public final babel17Parser.simple_expr_return simple_expr() throws RecognitionException {
        babel17Parser.simple_expr_return retval = new babel17Parser.simple_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.cons_expr_return cons_expr333 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:579:2: ( cons_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:579:4: cons_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_cons_expr_in_simple_expr3654);
            cons_expr333=cons_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, cons_expr333.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:581:1: p_simple_expr : p_cons_expr ;
    public final babel17Parser.p_simple_expr_return p_simple_expr() throws RecognitionException {
        babel17Parser.p_simple_expr_return retval = new babel17Parser.p_simple_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.p_cons_expr_return p_cons_expr334 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:582:2: ( p_cons_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:582:4: p_cons_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_cons_expr_in_p_simple_expr3663);
            p_cons_expr334=p_cons_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_cons_expr334.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:584:1: cons_expr : to_expr ( ( NL )? token_DOUBLE_COLON ( NL )? to_expr )* -> ^( LIST_CONS ( to_expr )* ) ;
    public final babel17Parser.cons_expr_return cons_expr() throws RecognitionException {
        babel17Parser.cons_expr_return retval = new babel17Parser.cons_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL336=null;
        Token NL338=null;
        babel17Parser.to_expr_return to_expr335 = null;

        babel17Parser.token_DOUBLE_COLON_return token_DOUBLE_COLON337 = null;

        babel17Parser.to_expr_return to_expr339 = null;


        CommonTree NL336_tree=null;
        CommonTree NL338_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_token_DOUBLE_COLON=new RewriteRuleSubtreeStream(adaptor,"rule token_DOUBLE_COLON");
        RewriteRuleSubtreeStream stream_to_expr=new RewriteRuleSubtreeStream(adaptor,"rule to_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:585:2: ( to_expr ( ( NL )? token_DOUBLE_COLON ( NL )? to_expr )* -> ^( LIST_CONS ( to_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:585:4: to_expr ( ( NL )? token_DOUBLE_COLON ( NL )? to_expr )*
            {
            pushFollow(FOLLOW_to_expr_in_cons_expr3672);
            to_expr335=to_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_to_expr.add(to_expr335.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:585:12: ( ( NL )? token_DOUBLE_COLON ( NL )? to_expr )*
            loop151:
            do {
                int alt151=2;
                int LA151_0 = input.LA(1);

                if ( (LA151_0==NL) ) {
                    int LA151_1 = input.LA(2);

                    if ( ((LA151_1>=A_DOUBLE_COLON && LA151_1<=U_DOUBLE_COLON)) ) {
                        alt151=1;
                    }


                }
                else if ( ((LA151_0>=A_DOUBLE_COLON && LA151_0<=U_DOUBLE_COLON)) ) {
                    alt151=1;
                }


                switch (alt151) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:585:13: ( NL )? token_DOUBLE_COLON ( NL )? to_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:585:13: ( NL )?
            	    int alt149=2;
            	    int LA149_0 = input.LA(1);

            	    if ( (LA149_0==NL) ) {
            	        alt149=1;
            	    }
            	    switch (alt149) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:585:13: NL
            	            {
            	            NL336=(Token)match(input,NL,FOLLOW_NL_in_cons_expr3675); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL336);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_token_DOUBLE_COLON_in_cons_expr3678);
            	    token_DOUBLE_COLON337=token_DOUBLE_COLON();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_token_DOUBLE_COLON.add(token_DOUBLE_COLON337.getTree());
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:585:36: ( NL )?
            	    int alt150=2;
            	    int LA150_0 = input.LA(1);

            	    if ( (LA150_0==NL) ) {
            	        alt150=1;
            	    }
            	    switch (alt150) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:585:36: NL
            	            {
            	            NL338=(Token)match(input,NL,FOLLOW_NL_in_cons_expr3680); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL338);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_to_expr_in_cons_expr3683);
            	    to_expr339=to_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_to_expr.add(to_expr339.getTree());

            	    }
            	    break;

            	default :
            	    break loop151;
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
            // 585:50: -> ^( LIST_CONS ( to_expr )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:585:53: ^( LIST_CONS ( to_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LIST_CONS, "LIST_CONS"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:585:65: ( to_expr )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:587:1: p_cons_expr : p_to_expr ( ( NL )? token_DOUBLE_COLON ( NL )? p_to_expr )* -> ^( LIST_CONS ( p_to_expr )* ) ;
    public final babel17Parser.p_cons_expr_return p_cons_expr() throws RecognitionException {
        babel17Parser.p_cons_expr_return retval = new babel17Parser.p_cons_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL341=null;
        Token NL343=null;
        babel17Parser.p_to_expr_return p_to_expr340 = null;

        babel17Parser.token_DOUBLE_COLON_return token_DOUBLE_COLON342 = null;

        babel17Parser.p_to_expr_return p_to_expr344 = null;


        CommonTree NL341_tree=null;
        CommonTree NL343_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_p_to_expr=new RewriteRuleSubtreeStream(adaptor,"rule p_to_expr");
        RewriteRuleSubtreeStream stream_token_DOUBLE_COLON=new RewriteRuleSubtreeStream(adaptor,"rule token_DOUBLE_COLON");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:588:2: ( p_to_expr ( ( NL )? token_DOUBLE_COLON ( NL )? p_to_expr )* -> ^( LIST_CONS ( p_to_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:588:4: p_to_expr ( ( NL )? token_DOUBLE_COLON ( NL )? p_to_expr )*
            {
            pushFollow(FOLLOW_p_to_expr_in_p_cons_expr3703);
            p_to_expr340=p_to_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_p_to_expr.add(p_to_expr340.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:588:14: ( ( NL )? token_DOUBLE_COLON ( NL )? p_to_expr )*
            loop154:
            do {
                int alt154=2;
                int LA154_0 = input.LA(1);

                if ( (LA154_0==NL) ) {
                    int LA154_1 = input.LA(2);

                    if ( ((LA154_1>=A_DOUBLE_COLON && LA154_1<=U_DOUBLE_COLON)) ) {
                        alt154=1;
                    }


                }
                else if ( ((LA154_0>=A_DOUBLE_COLON && LA154_0<=U_DOUBLE_COLON)) ) {
                    alt154=1;
                }


                switch (alt154) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:588:15: ( NL )? token_DOUBLE_COLON ( NL )? p_to_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:588:15: ( NL )?
            	    int alt152=2;
            	    int LA152_0 = input.LA(1);

            	    if ( (LA152_0==NL) ) {
            	        alt152=1;
            	    }
            	    switch (alt152) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:588:15: NL
            	            {
            	            NL341=(Token)match(input,NL,FOLLOW_NL_in_p_cons_expr3706); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL341);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_token_DOUBLE_COLON_in_p_cons_expr3709);
            	    token_DOUBLE_COLON342=token_DOUBLE_COLON();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_token_DOUBLE_COLON.add(token_DOUBLE_COLON342.getTree());
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:588:38: ( NL )?
            	    int alt153=2;
            	    int LA153_0 = input.LA(1);

            	    if ( (LA153_0==NL) ) {
            	        alt153=1;
            	    }
            	    switch (alt153) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:588:38: NL
            	            {
            	            NL343=(Token)match(input,NL,FOLLOW_NL_in_p_cons_expr3711); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL343);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_to_expr_in_p_cons_expr3714);
            	    p_to_expr344=p_to_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_p_to_expr.add(p_to_expr344.getTree());

            	    }
            	    break;

            	default :
            	    break loop154;
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
            // 588:54: -> ^( LIST_CONS ( p_to_expr )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:588:57: ^( LIST_CONS ( p_to_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LIST_CONS, "LIST_CONS"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:588:69: ( p_to_expr )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:591:1: to_expr : arith_plus_expr ( ( NL )? ( L_to | L_downto ) ( NL )? arith_plus_expr )? ;
    public final babel17Parser.to_expr_return to_expr() throws RecognitionException {
        babel17Parser.to_expr_return retval = new babel17Parser.to_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL346=null;
        Token L_to347=null;
        Token L_downto348=null;
        Token NL349=null;
        babel17Parser.arith_plus_expr_return arith_plus_expr345 = null;

        babel17Parser.arith_plus_expr_return arith_plus_expr350 = null;


        CommonTree NL346_tree=null;
        CommonTree L_to347_tree=null;
        CommonTree L_downto348_tree=null;
        CommonTree NL349_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:591:9: ( arith_plus_expr ( ( NL )? ( L_to | L_downto ) ( NL )? arith_plus_expr )? )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:591:11: arith_plus_expr ( ( NL )? ( L_to | L_downto ) ( NL )? arith_plus_expr )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_arith_plus_expr_in_to_expr3734);
            arith_plus_expr345=arith_plus_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, arith_plus_expr345.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:591:27: ( ( NL )? ( L_to | L_downto ) ( NL )? arith_plus_expr )?
            int alt158=2;
            int LA158_0 = input.LA(1);

            if ( (LA158_0==NL) ) {
                int LA158_1 = input.LA(2);

                if ( ((LA158_1>=L_to && LA158_1<=L_downto)) ) {
                    alt158=1;
                }
            }
            else if ( ((LA158_0>=L_to && LA158_0<=L_downto)) ) {
                alt158=1;
            }
            switch (alt158) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:591:28: ( NL )? ( L_to | L_downto ) ( NL )? arith_plus_expr
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:591:30: ( NL )?
                    int alt155=2;
                    int LA155_0 = input.LA(1);

                    if ( (LA155_0==NL) ) {
                        alt155=1;
                    }
                    switch (alt155) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:591:30: NL
                            {
                            NL346=(Token)match(input,NL,FOLLOW_NL_in_to_expr3737); if (state.failed) return retval;

                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:591:33: ( L_to | L_downto )
                    int alt156=2;
                    int LA156_0 = input.LA(1);

                    if ( (LA156_0==L_to) ) {
                        alt156=1;
                    }
                    else if ( (LA156_0==L_downto) ) {
                        alt156=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 156, 0, input);

                        throw nvae;
                    }
                    switch (alt156) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:591:34: L_to
                            {
                            L_to347=(Token)match(input,L_to,FOLLOW_L_to_in_to_expr3742); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            L_to347_tree = (CommonTree)adaptor.create(L_to347);
                            root_0 = (CommonTree)adaptor.becomeRoot(L_to347_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:591:41: L_downto
                            {
                            L_downto348=(Token)match(input,L_downto,FOLLOW_L_downto_in_to_expr3746); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            L_downto348_tree = (CommonTree)adaptor.create(L_downto348);
                            root_0 = (CommonTree)adaptor.becomeRoot(L_downto348_tree, root_0);
                            }

                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:591:54: ( NL )?
                    int alt157=2;
                    int LA157_0 = input.LA(1);

                    if ( (LA157_0==NL) ) {
                        alt157=1;
                    }
                    switch (alt157) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:591:54: NL
                            {
                            NL349=(Token)match(input,NL,FOLLOW_NL_in_to_expr3750); if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_arith_plus_expr_in_to_expr3754);
                    arith_plus_expr350=arith_plus_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arith_plus_expr350.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:593:1: p_to_expr : p_arith_plus_expr ( ( NL )? ( L_to | L_downto ) ( NL )? p_arith_plus_expr )? ;
    public final babel17Parser.p_to_expr_return p_to_expr() throws RecognitionException {
        babel17Parser.p_to_expr_return retval = new babel17Parser.p_to_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL352=null;
        Token L_to353=null;
        Token L_downto354=null;
        Token NL355=null;
        babel17Parser.p_arith_plus_expr_return p_arith_plus_expr351 = null;

        babel17Parser.p_arith_plus_expr_return p_arith_plus_expr356 = null;


        CommonTree NL352_tree=null;
        CommonTree L_to353_tree=null;
        CommonTree L_downto354_tree=null;
        CommonTree NL355_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:594:2: ( p_arith_plus_expr ( ( NL )? ( L_to | L_downto ) ( NL )? p_arith_plus_expr )? )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:594:4: p_arith_plus_expr ( ( NL )? ( L_to | L_downto ) ( NL )? p_arith_plus_expr )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_arith_plus_expr_in_p_to_expr3767);
            p_arith_plus_expr351=p_arith_plus_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_arith_plus_expr351.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:594:22: ( ( NL )? ( L_to | L_downto ) ( NL )? p_arith_plus_expr )?
            int alt162=2;
            int LA162_0 = input.LA(1);

            if ( (LA162_0==NL) ) {
                int LA162_1 = input.LA(2);

                if ( ((LA162_1>=L_to && LA162_1<=L_downto)) ) {
                    alt162=1;
                }
            }
            else if ( ((LA162_0>=L_to && LA162_0<=L_downto)) ) {
                alt162=1;
            }
            switch (alt162) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:594:23: ( NL )? ( L_to | L_downto ) ( NL )? p_arith_plus_expr
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:594:25: ( NL )?
                    int alt159=2;
                    int LA159_0 = input.LA(1);

                    if ( (LA159_0==NL) ) {
                        alt159=1;
                    }
                    switch (alt159) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:594:25: NL
                            {
                            NL352=(Token)match(input,NL,FOLLOW_NL_in_p_to_expr3770); if (state.failed) return retval;

                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:594:28: ( L_to | L_downto )
                    int alt160=2;
                    int LA160_0 = input.LA(1);

                    if ( (LA160_0==L_to) ) {
                        alt160=1;
                    }
                    else if ( (LA160_0==L_downto) ) {
                        alt160=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 160, 0, input);

                        throw nvae;
                    }
                    switch (alt160) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:594:29: L_to
                            {
                            L_to353=(Token)match(input,L_to,FOLLOW_L_to_in_p_to_expr3775); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            L_to353_tree = (CommonTree)adaptor.create(L_to353);
                            root_0 = (CommonTree)adaptor.becomeRoot(L_to353_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:594:36: L_downto
                            {
                            L_downto354=(Token)match(input,L_downto,FOLLOW_L_downto_in_p_to_expr3779); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            L_downto354_tree = (CommonTree)adaptor.create(L_downto354);
                            root_0 = (CommonTree)adaptor.becomeRoot(L_downto354_tree, root_0);
                            }

                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:594:49: ( NL )?
                    int alt161=2;
                    int LA161_0 = input.LA(1);

                    if ( (LA161_0==NL) ) {
                        alt161=1;
                    }
                    switch (alt161) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:594:49: NL
                            {
                            NL355=(Token)match(input,NL,FOLLOW_NL_in_p_to_expr3783); if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_p_arith_plus_expr_in_p_to_expr3787);
                    p_arith_plus_expr356=p_arith_plus_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_arith_plus_expr356.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:596:1: arith_plus_expr : arith_uminus_expr ( ( ( NL )? PLUS | MINUS ) ( NL )? arith_uminus_expr )* ;
    public final babel17Parser.arith_plus_expr_return arith_plus_expr() throws RecognitionException {
        babel17Parser.arith_plus_expr_return retval = new babel17Parser.arith_plus_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL358=null;
        Token PLUS359=null;
        Token MINUS360=null;
        Token NL361=null;
        babel17Parser.arith_uminus_expr_return arith_uminus_expr357 = null;

        babel17Parser.arith_uminus_expr_return arith_uminus_expr362 = null;


        CommonTree NL358_tree=null;
        CommonTree PLUS359_tree=null;
        CommonTree MINUS360_tree=null;
        CommonTree NL361_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:597:2: ( arith_uminus_expr ( ( ( NL )? PLUS | MINUS ) ( NL )? arith_uminus_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:597:4: arith_uminus_expr ( ( ( NL )? PLUS | MINUS ) ( NL )? arith_uminus_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_arith_uminus_expr_in_arith_plus_expr3799);
            arith_uminus_expr357=arith_uminus_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, arith_uminus_expr357.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:597:22: ( ( ( NL )? PLUS | MINUS ) ( NL )? arith_uminus_expr )*
            loop166:
            do {
                int alt166=2;
                int LA166_0 = input.LA(1);

                if ( (LA166_0==NL) ) {
                    int LA166_1 = input.LA(2);

                    if ( (LA166_1==PLUS) ) {
                        alt166=1;
                    }


                }
                else if ( ((LA166_0>=PLUS && LA166_0<=MINUS)) ) {
                    alt166=1;
                }


                switch (alt166) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:597:23: ( ( NL )? PLUS | MINUS ) ( NL )? arith_uminus_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:597:23: ( ( NL )? PLUS | MINUS )
            	    int alt164=2;
            	    int LA164_0 = input.LA(1);

            	    if ( (LA164_0==PLUS||LA164_0==NL) ) {
            	        alt164=1;
            	    }
            	    else if ( (LA164_0==MINUS) ) {
            	        alt164=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 164, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt164) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:597:24: ( NL )? PLUS
            	            {
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:597:26: ( NL )?
            	            int alt163=2;
            	            int LA163_0 = input.LA(1);

            	            if ( (LA163_0==NL) ) {
            	                alt163=1;
            	            }
            	            switch (alt163) {
            	                case 1 :
            	                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:597:26: NL
            	                    {
            	                    NL358=(Token)match(input,NL,FOLLOW_NL_in_arith_plus_expr3803); if (state.failed) return retval;

            	                    }
            	                    break;

            	            }

            	            PLUS359=(Token)match(input,PLUS,FOLLOW_PLUS_in_arith_plus_expr3807); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PLUS359_tree = (CommonTree)adaptor.create(PLUS359);
            	            root_0 = (CommonTree)adaptor.becomeRoot(PLUS359_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:597:37: MINUS
            	            {
            	            MINUS360=(Token)match(input,MINUS,FOLLOW_MINUS_in_arith_plus_expr3812); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            MINUS360_tree = (CommonTree)adaptor.create(MINUS360);
            	            root_0 = (CommonTree)adaptor.becomeRoot(MINUS360_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:597:47: ( NL )?
            	    int alt165=2;
            	    int LA165_0 = input.LA(1);

            	    if ( (LA165_0==NL) ) {
            	        alt165=1;
            	    }
            	    switch (alt165) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:597:47: NL
            	            {
            	            NL361=(Token)match(input,NL,FOLLOW_NL_in_arith_plus_expr3816); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_arith_uminus_expr_in_arith_plus_expr3820);
            	    arith_uminus_expr362=arith_uminus_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, arith_uminus_expr362.getTree());

            	    }
            	    break;

            	default :
            	    break loop166;
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:599:1: p_arith_plus_expr : p_arith_uminus_expr ( ( NL )? ( PLUS | MINUS ) ( NL )? p_arith_uminus_expr )* ;
    public final babel17Parser.p_arith_plus_expr_return p_arith_plus_expr() throws RecognitionException {
        babel17Parser.p_arith_plus_expr_return retval = new babel17Parser.p_arith_plus_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL364=null;
        Token set365=null;
        Token NL366=null;
        babel17Parser.p_arith_uminus_expr_return p_arith_uminus_expr363 = null;

        babel17Parser.p_arith_uminus_expr_return p_arith_uminus_expr367 = null;


        CommonTree NL364_tree=null;
        CommonTree set365_tree=null;
        CommonTree NL366_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:600:2: ( p_arith_uminus_expr ( ( NL )? ( PLUS | MINUS ) ( NL )? p_arith_uminus_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:600:4: p_arith_uminus_expr ( ( NL )? ( PLUS | MINUS ) ( NL )? p_arith_uminus_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_arith_uminus_expr_in_p_arith_plus_expr3831);
            p_arith_uminus_expr363=p_arith_uminus_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_arith_uminus_expr363.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:600:24: ( ( NL )? ( PLUS | MINUS ) ( NL )? p_arith_uminus_expr )*
            loop169:
            do {
                int alt169=2;
                int LA169_0 = input.LA(1);

                if ( (LA169_0==NL) ) {
                    int LA169_1 = input.LA(2);

                    if ( ((LA169_1>=PLUS && LA169_1<=MINUS)) ) {
                        alt169=1;
                    }


                }
                else if ( ((LA169_0>=PLUS && LA169_0<=MINUS)) ) {
                    alt169=1;
                }


                switch (alt169) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:600:25: ( NL )? ( PLUS | MINUS ) ( NL )? p_arith_uminus_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:600:27: ( NL )?
            	    int alt167=2;
            	    int LA167_0 = input.LA(1);

            	    if ( (LA167_0==NL) ) {
            	        alt167=1;
            	    }
            	    switch (alt167) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:600:27: NL
            	            {
            	            NL364=(Token)match(input,NL,FOLLOW_NL_in_p_arith_plus_expr3834); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    set365=(Token)input.LT(1);
            	    set365=(Token)input.LT(1);
            	    if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set365), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:600:48: ( NL )?
            	    int alt168=2;
            	    int LA168_0 = input.LA(1);

            	    if ( (LA168_0==NL) ) {
            	        alt168=1;
            	    }
            	    switch (alt168) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:600:48: NL
            	            {
            	            NL366=(Token)match(input,NL,FOLLOW_NL_in_p_arith_plus_expr3847); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_arith_uminus_expr_in_p_arith_plus_expr3851);
            	    p_arith_uminus_expr367=p_arith_uminus_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_arith_uminus_expr367.getTree());

            	    }
            	    break;

            	default :
            	    break loop169;
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:602:1: arith_uminus_expr : ( MINUS ( NL )? arith_mult_expr -> ^( UMINUS arith_mult_expr ) | arith_mult_expr );
    public final babel17Parser.arith_uminus_expr_return arith_uminus_expr() throws RecognitionException {
        babel17Parser.arith_uminus_expr_return retval = new babel17Parser.arith_uminus_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token MINUS368=null;
        Token NL369=null;
        babel17Parser.arith_mult_expr_return arith_mult_expr370 = null;

        babel17Parser.arith_mult_expr_return arith_mult_expr371 = null;


        CommonTree MINUS368_tree=null;
        CommonTree NL369_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleSubtreeStream stream_arith_mult_expr=new RewriteRuleSubtreeStream(adaptor,"rule arith_mult_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:603:2: ( MINUS ( NL )? arith_mult_expr -> ^( UMINUS arith_mult_expr ) | arith_mult_expr )
            int alt171=2;
            int LA171_0 = input.LA(1);

            if ( (LA171_0==MINUS) ) {
                alt171=1;
            }
            else if ( (LA171_0==L_begin||(LA171_0>=L_with && LA171_0<=L_if)||(LA171_0>=L_while && LA171_0<=L_for)||LA171_0==L_match||(LA171_0>=A_infinity && LA171_0<=U_infinity)||(LA171_0>=L_true && LA171_0<=L_this)||LA171_0==L_nil||(LA171_0>=Constr && LA171_0<=Num)||(LA171_0>=String && LA171_0<=ROUND_BRACKET_OPEN)||LA171_0==SQUARE_BRACKET_OPEN||LA171_0==CURLY_BRACKET_OPEN) ) {
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:603:4: MINUS ( NL )? arith_mult_expr
                    {
                    MINUS368=(Token)match(input,MINUS,FOLLOW_MINUS_in_arith_uminus_expr3864); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(MINUS368);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:603:10: ( NL )?
                    int alt170=2;
                    int LA170_0 = input.LA(1);

                    if ( (LA170_0==NL) ) {
                        alt170=1;
                    }
                    switch (alt170) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:603:10: NL
                            {
                            NL369=(Token)match(input,NL,FOLLOW_NL_in_arith_uminus_expr3866); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL369);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_arith_mult_expr_in_arith_uminus_expr3869);
                    arith_mult_expr370=arith_mult_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_arith_mult_expr.add(arith_mult_expr370.getTree());


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
                    // 603:30: -> ^( UMINUS arith_mult_expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:603:33: ^( UMINUS arith_mult_expr )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:604:4: arith_mult_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_arith_mult_expr_in_arith_uminus_expr3882);
                    arith_mult_expr371=arith_mult_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arith_mult_expr371.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:606:1: p_arith_uminus_expr : ( MINUS ( NL )? p_arith_mult_expr -> ^( UMINUS p_arith_mult_expr ) | p_arith_mult_expr );
    public final babel17Parser.p_arith_uminus_expr_return p_arith_uminus_expr() throws RecognitionException {
        babel17Parser.p_arith_uminus_expr_return retval = new babel17Parser.p_arith_uminus_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token MINUS372=null;
        Token NL373=null;
        babel17Parser.p_arith_mult_expr_return p_arith_mult_expr374 = null;

        babel17Parser.p_arith_mult_expr_return p_arith_mult_expr375 = null;


        CommonTree MINUS372_tree=null;
        CommonTree NL373_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleSubtreeStream stream_p_arith_mult_expr=new RewriteRuleSubtreeStream(adaptor,"rule p_arith_mult_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:607:2: ( MINUS ( NL )? p_arith_mult_expr -> ^( UMINUS p_arith_mult_expr ) | p_arith_mult_expr )
            int alt173=2;
            int LA173_0 = input.LA(1);

            if ( (LA173_0==MINUS) ) {
                alt173=1;
            }
            else if ( (LA173_0==L_begin||(LA173_0>=L_with && LA173_0<=L_if)||(LA173_0>=L_while && LA173_0<=L_for)||LA173_0==L_match||(LA173_0>=A_infinity && LA173_0<=U_infinity)||(LA173_0>=L_true && LA173_0<=L_this)||LA173_0==L_nil||(LA173_0>=Constr && LA173_0<=Num)||(LA173_0>=String && LA173_0<=ROUND_BRACKET_OPEN)||LA173_0==SQUARE_BRACKET_OPEN||LA173_0==CURLY_BRACKET_OPEN) ) {
                alt173=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 173, 0, input);

                throw nvae;
            }
            switch (alt173) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:607:4: MINUS ( NL )? p_arith_mult_expr
                    {
                    MINUS372=(Token)match(input,MINUS,FOLLOW_MINUS_in_p_arith_uminus_expr3893); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(MINUS372);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:607:10: ( NL )?
                    int alt172=2;
                    int LA172_0 = input.LA(1);

                    if ( (LA172_0==NL) ) {
                        alt172=1;
                    }
                    switch (alt172) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:607:10: NL
                            {
                            NL373=(Token)match(input,NL,FOLLOW_NL_in_p_arith_uminus_expr3895); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL373);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_p_arith_mult_expr_in_p_arith_uminus_expr3898);
                    p_arith_mult_expr374=p_arith_mult_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_p_arith_mult_expr.add(p_arith_mult_expr374.getTree());


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
                    // 607:32: -> ^( UMINUS p_arith_mult_expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:607:35: ^( UMINUS p_arith_mult_expr )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:608:4: p_arith_mult_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_p_arith_mult_expr_in_p_arith_uminus_expr3911);
                    p_arith_mult_expr375=p_arith_mult_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_arith_mult_expr375.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:610:1: arith_mult_expr : arith_pow_expr ( ( NL )? ( TIMES | DIV | MOD ) ( NL )? arith_pow_expr )* ;
    public final babel17Parser.arith_mult_expr_return arith_mult_expr() throws RecognitionException {
        babel17Parser.arith_mult_expr_return retval = new babel17Parser.arith_mult_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL377=null;
        Token set378=null;
        Token NL379=null;
        babel17Parser.arith_pow_expr_return arith_pow_expr376 = null;

        babel17Parser.arith_pow_expr_return arith_pow_expr380 = null;


        CommonTree NL377_tree=null;
        CommonTree set378_tree=null;
        CommonTree NL379_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:611:2: ( arith_pow_expr ( ( NL )? ( TIMES | DIV | MOD ) ( NL )? arith_pow_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:611:4: arith_pow_expr ( ( NL )? ( TIMES | DIV | MOD ) ( NL )? arith_pow_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_arith_pow_expr_in_arith_mult_expr3920);
            arith_pow_expr376=arith_pow_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, arith_pow_expr376.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:611:19: ( ( NL )? ( TIMES | DIV | MOD ) ( NL )? arith_pow_expr )*
            loop176:
            do {
                int alt176=2;
                int LA176_0 = input.LA(1);

                if ( (LA176_0==NL) ) {
                    int LA176_1 = input.LA(2);

                    if ( ((LA176_1>=TIMES && LA176_1<=MOD)) ) {
                        alt176=1;
                    }


                }
                else if ( ((LA176_0>=TIMES && LA176_0<=MOD)) ) {
                    alt176=1;
                }


                switch (alt176) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:611:20: ( NL )? ( TIMES | DIV | MOD ) ( NL )? arith_pow_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:611:22: ( NL )?
            	    int alt174=2;
            	    int LA174_0 = input.LA(1);

            	    if ( (LA174_0==NL) ) {
            	        alt174=1;
            	    }
            	    switch (alt174) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:611:22: NL
            	            {
            	            NL377=(Token)match(input,NL,FOLLOW_NL_in_arith_mult_expr3923); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    set378=(Token)input.LT(1);
            	    set378=(Token)input.LT(1);
            	    if ( (input.LA(1)>=TIMES && input.LA(1)<=MOD) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set378), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:611:48: ( NL )?
            	    int alt175=2;
            	    int LA175_0 = input.LA(1);

            	    if ( (LA175_0==NL) ) {
            	        alt175=1;
            	    }
            	    switch (alt175) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:611:48: NL
            	            {
            	            NL379=(Token)match(input,NL,FOLLOW_NL_in_arith_mult_expr3940); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_arith_pow_expr_in_arith_mult_expr3944);
            	    arith_pow_expr380=arith_pow_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, arith_pow_expr380.getTree());

            	    }
            	    break;

            	default :
            	    break loop176;
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:613:1: p_arith_mult_expr : p_arith_pow_expr ( ( NL )? ( TIMES | DIV | MOD ) ( NL )? p_arith_pow_expr )* ;
    public final babel17Parser.p_arith_mult_expr_return p_arith_mult_expr() throws RecognitionException {
        babel17Parser.p_arith_mult_expr_return retval = new babel17Parser.p_arith_mult_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL382=null;
        Token set383=null;
        Token NL384=null;
        babel17Parser.p_arith_pow_expr_return p_arith_pow_expr381 = null;

        babel17Parser.p_arith_pow_expr_return p_arith_pow_expr385 = null;


        CommonTree NL382_tree=null;
        CommonTree set383_tree=null;
        CommonTree NL384_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:614:2: ( p_arith_pow_expr ( ( NL )? ( TIMES | DIV | MOD ) ( NL )? p_arith_pow_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:614:4: p_arith_pow_expr ( ( NL )? ( TIMES | DIV | MOD ) ( NL )? p_arith_pow_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_arith_pow_expr_in_p_arith_mult_expr3956);
            p_arith_pow_expr381=p_arith_pow_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_arith_pow_expr381.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:614:21: ( ( NL )? ( TIMES | DIV | MOD ) ( NL )? p_arith_pow_expr )*
            loop179:
            do {
                int alt179=2;
                int LA179_0 = input.LA(1);

                if ( (LA179_0==NL) ) {
                    int LA179_1 = input.LA(2);

                    if ( ((LA179_1>=TIMES && LA179_1<=MOD)) ) {
                        alt179=1;
                    }


                }
                else if ( ((LA179_0>=TIMES && LA179_0<=MOD)) ) {
                    alt179=1;
                }


                switch (alt179) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:614:22: ( NL )? ( TIMES | DIV | MOD ) ( NL )? p_arith_pow_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:614:24: ( NL )?
            	    int alt177=2;
            	    int LA177_0 = input.LA(1);

            	    if ( (LA177_0==NL) ) {
            	        alt177=1;
            	    }
            	    switch (alt177) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:614:24: NL
            	            {
            	            NL382=(Token)match(input,NL,FOLLOW_NL_in_p_arith_mult_expr3959); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    set383=(Token)input.LT(1);
            	    set383=(Token)input.LT(1);
            	    if ( (input.LA(1)>=TIMES && input.LA(1)<=MOD) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set383), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:614:50: ( NL )?
            	    int alt178=2;
            	    int LA178_0 = input.LA(1);

            	    if ( (LA178_0==NL) ) {
            	        alt178=1;
            	    }
            	    switch (alt178) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:614:50: NL
            	            {
            	            NL384=(Token)match(input,NL,FOLLOW_NL_in_p_arith_mult_expr3976); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_arith_pow_expr_in_p_arith_mult_expr3980);
            	    p_arith_pow_expr385=p_arith_pow_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_arith_pow_expr385.getTree());

            	    }
            	    break;

            	default :
            	    break loop179;
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:616:1: arith_pow_expr : apply_expr ( ( NL )? POW_tok ( NL )? apply_expr )* -> ^( POW ( apply_expr )* ) ;
    public final babel17Parser.arith_pow_expr_return arith_pow_expr() throws RecognitionException {
        babel17Parser.arith_pow_expr_return retval = new babel17Parser.arith_pow_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL387=null;
        Token POW_tok388=null;
        Token NL389=null;
        babel17Parser.apply_expr_return apply_expr386 = null;

        babel17Parser.apply_expr_return apply_expr390 = null;


        CommonTree NL387_tree=null;
        CommonTree POW_tok388_tree=null;
        CommonTree NL389_tree=null;
        RewriteRuleTokenStream stream_POW_tok=new RewriteRuleTokenStream(adaptor,"token POW_tok");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_apply_expr=new RewriteRuleSubtreeStream(adaptor,"rule apply_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:617:2: ( apply_expr ( ( NL )? POW_tok ( NL )? apply_expr )* -> ^( POW ( apply_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:617:4: apply_expr ( ( NL )? POW_tok ( NL )? apply_expr )*
            {
            pushFollow(FOLLOW_apply_expr_in_arith_pow_expr3991);
            apply_expr386=apply_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_apply_expr.add(apply_expr386.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:617:15: ( ( NL )? POW_tok ( NL )? apply_expr )*
            loop182:
            do {
                int alt182=2;
                int LA182_0 = input.LA(1);

                if ( (LA182_0==NL) ) {
                    int LA182_1 = input.LA(2);

                    if ( (LA182_1==POW_tok) ) {
                        alt182=1;
                    }


                }
                else if ( (LA182_0==POW_tok) ) {
                    alt182=1;
                }


                switch (alt182) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:617:16: ( NL )? POW_tok ( NL )? apply_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:617:16: ( NL )?
            	    int alt180=2;
            	    int LA180_0 = input.LA(1);

            	    if ( (LA180_0==NL) ) {
            	        alt180=1;
            	    }
            	    switch (alt180) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:617:16: NL
            	            {
            	            NL387=(Token)match(input,NL,FOLLOW_NL_in_arith_pow_expr3994); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL387);


            	            }
            	            break;

            	    }

            	    POW_tok388=(Token)match(input,POW_tok,FOLLOW_POW_tok_in_arith_pow_expr3997); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_POW_tok.add(POW_tok388);

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:617:28: ( NL )?
            	    int alt181=2;
            	    int LA181_0 = input.LA(1);

            	    if ( (LA181_0==NL) ) {
            	        alt181=1;
            	    }
            	    switch (alt181) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:617:28: NL
            	            {
            	            NL389=(Token)match(input,NL,FOLLOW_NL_in_arith_pow_expr3999); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL389);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_apply_expr_in_arith_pow_expr4002);
            	    apply_expr390=apply_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_apply_expr.add(apply_expr390.getTree());

            	    }
            	    break;

            	default :
            	    break loop182;
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
            // 617:45: -> ^( POW ( apply_expr )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:617:48: ^( POW ( apply_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(POW, "POW"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:617:54: ( apply_expr )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:619:1: p_arith_pow_expr : p_apply_expr ( ( NL )? POW_tok ( NL )? p_apply_expr )* -> ^( POW ( p_apply_expr )* ) ;
    public final babel17Parser.p_arith_pow_expr_return p_arith_pow_expr() throws RecognitionException {
        babel17Parser.p_arith_pow_expr_return retval = new babel17Parser.p_arith_pow_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL392=null;
        Token POW_tok393=null;
        Token NL394=null;
        babel17Parser.p_apply_expr_return p_apply_expr391 = null;

        babel17Parser.p_apply_expr_return p_apply_expr395 = null;


        CommonTree NL392_tree=null;
        CommonTree POW_tok393_tree=null;
        CommonTree NL394_tree=null;
        RewriteRuleTokenStream stream_POW_tok=new RewriteRuleTokenStream(adaptor,"token POW_tok");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_p_apply_expr=new RewriteRuleSubtreeStream(adaptor,"rule p_apply_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:620:2: ( p_apply_expr ( ( NL )? POW_tok ( NL )? p_apply_expr )* -> ^( POW ( p_apply_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:620:4: p_apply_expr ( ( NL )? POW_tok ( NL )? p_apply_expr )*
            {
            pushFollow(FOLLOW_p_apply_expr_in_p_arith_pow_expr4023);
            p_apply_expr391=p_apply_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_p_apply_expr.add(p_apply_expr391.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:620:17: ( ( NL )? POW_tok ( NL )? p_apply_expr )*
            loop185:
            do {
                int alt185=2;
                int LA185_0 = input.LA(1);

                if ( (LA185_0==NL) ) {
                    int LA185_1 = input.LA(2);

                    if ( (LA185_1==POW_tok) ) {
                        alt185=1;
                    }


                }
                else if ( (LA185_0==POW_tok) ) {
                    alt185=1;
                }


                switch (alt185) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:620:18: ( NL )? POW_tok ( NL )? p_apply_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:620:18: ( NL )?
            	    int alt183=2;
            	    int LA183_0 = input.LA(1);

            	    if ( (LA183_0==NL) ) {
            	        alt183=1;
            	    }
            	    switch (alt183) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:620:18: NL
            	            {
            	            NL392=(Token)match(input,NL,FOLLOW_NL_in_p_arith_pow_expr4026); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL392);


            	            }
            	            break;

            	    }

            	    POW_tok393=(Token)match(input,POW_tok,FOLLOW_POW_tok_in_p_arith_pow_expr4029); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_POW_tok.add(POW_tok393);

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:620:30: ( NL )?
            	    int alt184=2;
            	    int LA184_0 = input.LA(1);

            	    if ( (LA184_0==NL) ) {
            	        alt184=1;
            	    }
            	    switch (alt184) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:620:30: NL
            	            {
            	            NL394=(Token)match(input,NL,FOLLOW_NL_in_p_arith_pow_expr4031); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL394);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_apply_expr_in_p_arith_pow_expr4034);
            	    p_apply_expr395=p_apply_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_p_apply_expr.add(p_apply_expr395.getTree());

            	    }
            	    break;

            	default :
            	    break loop185;
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
            // 620:49: -> ^( POW ( p_apply_expr )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:620:52: ^( POW ( p_apply_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(POW, "POW"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:620:58: ( p_apply_expr )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:622:1: apply_expr : ( basic_expr )+ -> ^( APPLY ( basic_expr )* ) ;
    public final babel17Parser.apply_expr_return apply_expr() throws RecognitionException {
        babel17Parser.apply_expr_return retval = new babel17Parser.apply_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.basic_expr_return basic_expr396 = null;


        RewriteRuleSubtreeStream stream_basic_expr=new RewriteRuleSubtreeStream(adaptor,"rule basic_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:623:2: ( ( basic_expr )+ -> ^( APPLY ( basic_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:623:4: ( basic_expr )+
            {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:623:4: ( basic_expr )+
            int cnt186=0;
            loop186:
            do {
                int alt186=2;
                int LA186_0 = input.LA(1);

                if ( (LA186_0==L_begin||(LA186_0>=L_with && LA186_0<=L_if)||(LA186_0>=L_while && LA186_0<=L_for)||LA186_0==L_match||(LA186_0>=A_infinity && LA186_0<=U_infinity)||(LA186_0>=L_true && LA186_0<=L_this)||LA186_0==L_nil||(LA186_0>=Constr && LA186_0<=Num)||(LA186_0>=String && LA186_0<=ROUND_BRACKET_OPEN)||LA186_0==SQUARE_BRACKET_OPEN||LA186_0==CURLY_BRACKET_OPEN) ) {
                    alt186=1;
                }


                switch (alt186) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:623:4: basic_expr
            	    {
            	    pushFollow(FOLLOW_basic_expr_in_apply_expr4055);
            	    basic_expr396=basic_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_basic_expr.add(basic_expr396.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt186 >= 1 ) break loop186;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(186, input);
                        throw eee;
                }
                cnt186++;
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
            // 623:16: -> ^( APPLY ( basic_expr )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:623:19: ^( APPLY ( basic_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(APPLY, "APPLY"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:623:27: ( basic_expr )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:624:1: p_apply_expr : p_basic_expr ( ( NL )? p_basic_expr )* -> ^( APPLY ( p_basic_expr )* ) ;
    public final babel17Parser.p_apply_expr_return p_apply_expr() throws RecognitionException {
        babel17Parser.p_apply_expr_return retval = new babel17Parser.p_apply_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL398=null;
        babel17Parser.p_basic_expr_return p_basic_expr397 = null;

        babel17Parser.p_basic_expr_return p_basic_expr399 = null;


        CommonTree NL398_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_p_basic_expr=new RewriteRuleSubtreeStream(adaptor,"rule p_basic_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:625:2: ( p_basic_expr ( ( NL )? p_basic_expr )* -> ^( APPLY ( p_basic_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:625:4: p_basic_expr ( ( NL )? p_basic_expr )*
            {
            pushFollow(FOLLOW_p_basic_expr_in_p_apply_expr4073);
            p_basic_expr397=p_basic_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_p_basic_expr.add(p_basic_expr397.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:625:17: ( ( NL )? p_basic_expr )*
            loop188:
            do {
                int alt188=2;
                int LA188_0 = input.LA(1);

                if ( (LA188_0==NL) ) {
                    int LA188_1 = input.LA(2);

                    if ( (LA188_1==L_begin||(LA188_1>=L_with && LA188_1<=L_if)||(LA188_1>=L_while && LA188_1<=L_for)||LA188_1==L_match||(LA188_1>=A_infinity && LA188_1<=U_infinity)||(LA188_1>=L_true && LA188_1<=L_this)||LA188_1==L_nil||(LA188_1>=Constr && LA188_1<=Num)||(LA188_1>=String && LA188_1<=ROUND_BRACKET_OPEN)||LA188_1==SQUARE_BRACKET_OPEN||LA188_1==CURLY_BRACKET_OPEN) ) {
                        alt188=1;
                    }


                }
                else if ( (LA188_0==L_begin||(LA188_0>=L_with && LA188_0<=L_if)||(LA188_0>=L_while && LA188_0<=L_for)||LA188_0==L_match||(LA188_0>=A_infinity && LA188_0<=U_infinity)||(LA188_0>=L_true && LA188_0<=L_this)||LA188_0==L_nil||(LA188_0>=Constr && LA188_0<=Num)||(LA188_0>=String && LA188_0<=ROUND_BRACKET_OPEN)||LA188_0==SQUARE_BRACKET_OPEN||LA188_0==CURLY_BRACKET_OPEN) ) {
                    alt188=1;
                }


                switch (alt188) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:625:18: ( NL )? p_basic_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:625:18: ( NL )?
            	    int alt187=2;
            	    int LA187_0 = input.LA(1);

            	    if ( (LA187_0==NL) ) {
            	        alt187=1;
            	    }
            	    switch (alt187) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:625:18: NL
            	            {
            	            NL398=(Token)match(input,NL,FOLLOW_NL_in_p_apply_expr4076); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL398);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_basic_expr_in_p_apply_expr4079);
            	    p_basic_expr399=p_basic_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_p_basic_expr.add(p_basic_expr399.getTree());

            	    }
            	    break;

            	default :
            	    break loop188;
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
            // 625:37: -> ^( APPLY ( p_basic_expr )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:625:40: ^( APPLY ( p_basic_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(APPLY, "APPLY"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:625:48: ( p_basic_expr )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:627:1: basic_expr : message_send_expr ;
    public final babel17Parser.basic_expr_return basic_expr() throws RecognitionException {
        babel17Parser.basic_expr_return retval = new babel17Parser.basic_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.message_send_expr_return message_send_expr400 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:628:2: ( message_send_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:628:4: message_send_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_message_send_expr_in_basic_expr4099);
            message_send_expr400=message_send_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, message_send_expr400.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:630:1: p_basic_expr : message_send_expr ;
    public final babel17Parser.p_basic_expr_return p_basic_expr() throws RecognitionException {
        babel17Parser.p_basic_expr_return retval = new babel17Parser.p_basic_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.message_send_expr_return message_send_expr401 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:631:2: ( message_send_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:631:4: message_send_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_message_send_expr_in_p_basic_expr4108);
            message_send_expr401=message_send_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, message_send_expr401.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:633:1: message_send_expr : primitive_expr ( ( NL )? PERIOD ( NL )? Id )* -> ^( MESSAGE_SEND primitive_expr ( Id )* ) ;
    public final babel17Parser.message_send_expr_return message_send_expr() throws RecognitionException {
        babel17Parser.message_send_expr_return retval = new babel17Parser.message_send_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL403=null;
        Token PERIOD404=null;
        Token NL405=null;
        Token Id406=null;
        babel17Parser.primitive_expr_return primitive_expr402 = null;


        CommonTree NL403_tree=null;
        CommonTree PERIOD404_tree=null;
        CommonTree NL405_tree=null;
        CommonTree Id406_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
        RewriteRuleTokenStream stream_Id=new RewriteRuleTokenStream(adaptor,"token Id");
        RewriteRuleSubtreeStream stream_primitive_expr=new RewriteRuleSubtreeStream(adaptor,"rule primitive_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:634:2: ( primitive_expr ( ( NL )? PERIOD ( NL )? Id )* -> ^( MESSAGE_SEND primitive_expr ( Id )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:634:4: primitive_expr ( ( NL )? PERIOD ( NL )? Id )*
            {
            pushFollow(FOLLOW_primitive_expr_in_message_send_expr4117);
            primitive_expr402=primitive_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_primitive_expr.add(primitive_expr402.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:634:19: ( ( NL )? PERIOD ( NL )? Id )*
            loop191:
            do {
                int alt191=2;
                int LA191_0 = input.LA(1);

                if ( (LA191_0==NL) ) {
                    int LA191_1 = input.LA(2);

                    if ( (LA191_1==PERIOD) ) {
                        alt191=1;
                    }


                }
                else if ( (LA191_0==PERIOD) ) {
                    alt191=1;
                }


                switch (alt191) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:634:20: ( NL )? PERIOD ( NL )? Id
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:634:20: ( NL )?
            	    int alt189=2;
            	    int LA189_0 = input.LA(1);

            	    if ( (LA189_0==NL) ) {
            	        alt189=1;
            	    }
            	    switch (alt189) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:634:20: NL
            	            {
            	            NL403=(Token)match(input,NL,FOLLOW_NL_in_message_send_expr4120); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL403);


            	            }
            	            break;

            	    }

            	    PERIOD404=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_message_send_expr4123); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD404);

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:634:31: ( NL )?
            	    int alt190=2;
            	    int LA190_0 = input.LA(1);

            	    if ( (LA190_0==NL) ) {
            	        alt190=1;
            	    }
            	    switch (alt190) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:634:31: NL
            	            {
            	            NL405=(Token)match(input,NL,FOLLOW_NL_in_message_send_expr4125); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL405);


            	            }
            	            break;

            	    }

            	    Id406=(Token)match(input,Id,FOLLOW_Id_in_message_send_expr4128); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_Id.add(Id406);


            	    }
            	    break;

            	default :
            	    break loop191;
                }
            } while (true);



            // AST REWRITE
            // elements: primitive_expr, Id
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 634:40: -> ^( MESSAGE_SEND primitive_expr ( Id )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:634:43: ^( MESSAGE_SEND primitive_expr ( Id )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MESSAGE_SEND, "MESSAGE_SEND"), root_1);

                adaptor.addChild(root_1, stream_primitive_expr.nextTree());
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:634:73: ( Id )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:636:1: list_expr : ( '[' ( NL )? ( protected_expr ( ( NL )? COMMA ( NL )? protected_expr )* ( NL )? )? ']' -> ^( SQUARE_LIST ( protected_expr )* ) | '(' ( NL )? ( protected_expr ( ( NL )? COMMA ( NL )? protected_expr )* ( NL )? ( COMMA ( NL )? )? )? ')' -> ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( protected_expr )* ) ) );
    public final babel17Parser.list_expr_return list_expr() throws RecognitionException {
        babel17Parser.list_expr_return retval = new babel17Parser.list_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal407=null;
        Token NL408=null;
        Token NL410=null;
        Token COMMA411=null;
        Token NL412=null;
        Token NL414=null;
        Token char_literal415=null;
        Token char_literal416=null;
        Token NL417=null;
        Token NL419=null;
        Token COMMA420=null;
        Token NL421=null;
        Token NL423=null;
        Token COMMA424=null;
        Token NL425=null;
        Token char_literal426=null;
        babel17Parser.protected_expr_return protected_expr409 = null;

        babel17Parser.protected_expr_return protected_expr413 = null;

        babel17Parser.protected_expr_return protected_expr418 = null;

        babel17Parser.protected_expr_return protected_expr422 = null;


        CommonTree char_literal407_tree=null;
        CommonTree NL408_tree=null;
        CommonTree NL410_tree=null;
        CommonTree COMMA411_tree=null;
        CommonTree NL412_tree=null;
        CommonTree NL414_tree=null;
        CommonTree char_literal415_tree=null;
        CommonTree char_literal416_tree=null;
        CommonTree NL417_tree=null;
        CommonTree NL419_tree=null;
        CommonTree COMMA420_tree=null;
        CommonTree NL421_tree=null;
        CommonTree NL423_tree=null;
        CommonTree COMMA424_tree=null;
        CommonTree NL425_tree=null;
        CommonTree char_literal426_tree=null;
        RewriteRuleTokenStream stream_ROUND_BRACKET_OPEN=new RewriteRuleTokenStream(adaptor,"token ROUND_BRACKET_OPEN");
        RewriteRuleTokenStream stream_SQUARE_BRACKET_CLOSE=new RewriteRuleTokenStream(adaptor,"token SQUARE_BRACKET_CLOSE");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_ROUND_BRACKET_CLOSE=new RewriteRuleTokenStream(adaptor,"token ROUND_BRACKET_CLOSE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_SQUARE_BRACKET_OPEN=new RewriteRuleTokenStream(adaptor,"token SQUARE_BRACKET_OPEN");
        RewriteRuleSubtreeStream stream_protected_expr=new RewriteRuleSubtreeStream(adaptor,"rule protected_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:637:2: ( '[' ( NL )? ( protected_expr ( ( NL )? COMMA ( NL )? protected_expr )* ( NL )? )? ']' -> ^( SQUARE_LIST ( protected_expr )* ) | '(' ( NL )? ( protected_expr ( ( NL )? COMMA ( NL )? protected_expr )* ( NL )? ( COMMA ( NL )? )? )? ')' -> ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( protected_expr )* ) ) )
            int alt206=2;
            int LA206_0 = input.LA(1);

            if ( (LA206_0==SQUARE_BRACKET_OPEN) ) {
                alt206=1;
            }
            else if ( (LA206_0==ROUND_BRACKET_OPEN) ) {
                alt206=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 206, 0, input);

                throw nvae;
            }
            switch (alt206) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:637:4: '[' ( NL )? ( protected_expr ( ( NL )? COMMA ( NL )? protected_expr )* ( NL )? )? ']'
                    {
                    char_literal407=(Token)match(input,SQUARE_BRACKET_OPEN,FOLLOW_SQUARE_BRACKET_OPEN_in_list_expr4152); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SQUARE_BRACKET_OPEN.add(char_literal407);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:637:8: ( NL )?
                    int alt192=2;
                    int LA192_0 = input.LA(1);

                    if ( (LA192_0==NL) ) {
                        alt192=1;
                    }
                    switch (alt192) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:637:8: NL
                            {
                            NL408=(Token)match(input,NL,FOLLOW_NL_in_list_expr4154); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL408);


                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:637:12: ( protected_expr ( ( NL )? COMMA ( NL )? protected_expr )* ( NL )? )?
                    int alt197=2;
                    int LA197_0 = input.LA(1);

                    if ( (LA197_0==L_begin||(LA197_0>=L_obj && LA197_0<=L_if)||(LA197_0>=L_while && LA197_0<=L_for)||(LA197_0>=L_match && LA197_0<=L_case)||LA197_0==L_exception||(LA197_0>=A_infinity && LA197_0<=L_lazy)||(LA197_0>=L_true && LA197_0<=L_nil)||LA197_0==MINUS||LA197_0==A_NOT||LA197_0==U_NOT||(LA197_0>=A_ELLIPSIS && LA197_0<=U_ELLIPSIS)||LA197_0==TILDE||(LA197_0>=Constr && LA197_0<=Num)||(LA197_0>=String && LA197_0<=ROUND_BRACKET_OPEN)||LA197_0==SQUARE_BRACKET_OPEN||LA197_0==CURLY_BRACKET_OPEN||LA197_0==UNDERSCORE) ) {
                        alt197=1;
                    }
                    switch (alt197) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:637:13: protected_expr ( ( NL )? COMMA ( NL )? protected_expr )* ( NL )?
                            {
                            pushFollow(FOLLOW_protected_expr_in_list_expr4158);
                            protected_expr409=protected_expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr409.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:637:28: ( ( NL )? COMMA ( NL )? protected_expr )*
                            loop195:
                            do {
                                int alt195=2;
                                int LA195_0 = input.LA(1);

                                if ( (LA195_0==NL) ) {
                                    int LA195_1 = input.LA(2);

                                    if ( (LA195_1==COMMA) ) {
                                        alt195=1;
                                    }


                                }
                                else if ( (LA195_0==COMMA) ) {
                                    alt195=1;
                                }


                                switch (alt195) {
                            	case 1 :
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:637:29: ( NL )? COMMA ( NL )? protected_expr
                            	    {
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:637:29: ( NL )?
                            	    int alt193=2;
                            	    int LA193_0 = input.LA(1);

                            	    if ( (LA193_0==NL) ) {
                            	        alt193=1;
                            	    }
                            	    switch (alt193) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:637:29: NL
                            	            {
                            	            NL410=(Token)match(input,NL,FOLLOW_NL_in_list_expr4161); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL410);


                            	            }
                            	            break;

                            	    }

                            	    COMMA411=(Token)match(input,COMMA,FOLLOW_COMMA_in_list_expr4164); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA411);

                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:637:39: ( NL )?
                            	    int alt194=2;
                            	    int LA194_0 = input.LA(1);

                            	    if ( (LA194_0==NL) ) {
                            	        alt194=1;
                            	    }
                            	    switch (alt194) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:637:39: NL
                            	            {
                            	            NL412=(Token)match(input,NL,FOLLOW_NL_in_list_expr4166); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL412);


                            	            }
                            	            break;

                            	    }

                            	    pushFollow(FOLLOW_protected_expr_in_list_expr4169);
                            	    protected_expr413=protected_expr();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr413.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop195;
                                }
                            } while (true);

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:637:60: ( NL )?
                            int alt196=2;
                            int LA196_0 = input.LA(1);

                            if ( (LA196_0==NL) ) {
                                alt196=1;
                            }
                            switch (alt196) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:637:60: NL
                                    {
                                    NL414=(Token)match(input,NL,FOLLOW_NL_in_list_expr4173); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL414);


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    char_literal415=(Token)match(input,SQUARE_BRACKET_CLOSE,FOLLOW_SQUARE_BRACKET_CLOSE_in_list_expr4178); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SQUARE_BRACKET_CLOSE.add(char_literal415);



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
                    // 637:70: -> ^( SQUARE_LIST ( protected_expr )* )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:637:73: ^( SQUARE_LIST ( protected_expr )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SQUARE_LIST, "SQUARE_LIST"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:637:87: ( protected_expr )*
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:638:4: '(' ( NL )? ( protected_expr ( ( NL )? COMMA ( NL )? protected_expr )* ( NL )? ( COMMA ( NL )? )? )? ')'
                    {
                    char_literal416=(Token)match(input,ROUND_BRACKET_OPEN,FOLLOW_ROUND_BRACKET_OPEN_in_list_expr4192); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ROUND_BRACKET_OPEN.add(char_literal416);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:638:8: ( NL )?
                    int alt198=2;
                    int LA198_0 = input.LA(1);

                    if ( (LA198_0==NL) ) {
                        alt198=1;
                    }
                    switch (alt198) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:638:8: NL
                            {
                            NL417=(Token)match(input,NL,FOLLOW_NL_in_list_expr4194); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL417);


                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:638:12: ( protected_expr ( ( NL )? COMMA ( NL )? protected_expr )* ( NL )? ( COMMA ( NL )? )? )?
                    int alt205=2;
                    int LA205_0 = input.LA(1);

                    if ( (LA205_0==L_begin||(LA205_0>=L_obj && LA205_0<=L_if)||(LA205_0>=L_while && LA205_0<=L_for)||(LA205_0>=L_match && LA205_0<=L_case)||LA205_0==L_exception||(LA205_0>=A_infinity && LA205_0<=L_lazy)||(LA205_0>=L_true && LA205_0<=L_nil)||LA205_0==MINUS||LA205_0==A_NOT||LA205_0==U_NOT||(LA205_0>=A_ELLIPSIS && LA205_0<=U_ELLIPSIS)||LA205_0==TILDE||(LA205_0>=Constr && LA205_0<=Num)||(LA205_0>=String && LA205_0<=ROUND_BRACKET_OPEN)||LA205_0==SQUARE_BRACKET_OPEN||LA205_0==CURLY_BRACKET_OPEN||LA205_0==UNDERSCORE) ) {
                        alt205=1;
                    }
                    switch (alt205) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:638:13: protected_expr ( ( NL )? COMMA ( NL )? protected_expr )* ( NL )? ( COMMA ( NL )? )?
                            {
                            pushFollow(FOLLOW_protected_expr_in_list_expr4198);
                            protected_expr418=protected_expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr418.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:638:28: ( ( NL )? COMMA ( NL )? protected_expr )*
                            loop201:
                            do {
                                int alt201=2;
                                int LA201_0 = input.LA(1);

                                if ( (LA201_0==NL) ) {
                                    int LA201_1 = input.LA(2);

                                    if ( (LA201_1==COMMA) ) {
                                        int LA201_2 = input.LA(3);

                                        if ( (LA201_2==NL) ) {
                                            int LA201_4 = input.LA(4);

                                            if ( (LA201_4==L_begin||(LA201_4>=L_obj && LA201_4<=L_if)||(LA201_4>=L_while && LA201_4<=L_for)||(LA201_4>=L_match && LA201_4<=L_case)||LA201_4==L_exception||(LA201_4>=A_infinity && LA201_4<=L_lazy)||(LA201_4>=L_true && LA201_4<=L_nil)||LA201_4==MINUS||LA201_4==A_NOT||LA201_4==U_NOT||(LA201_4>=A_ELLIPSIS && LA201_4<=U_ELLIPSIS)||LA201_4==TILDE||(LA201_4>=Constr && LA201_4<=Num)||(LA201_4>=String && LA201_4<=ROUND_BRACKET_OPEN)||LA201_4==SQUARE_BRACKET_OPEN||LA201_4==CURLY_BRACKET_OPEN||LA201_4==UNDERSCORE) ) {
                                                alt201=1;
                                            }


                                        }
                                        else if ( (LA201_2==L_begin||(LA201_2>=L_obj && LA201_2<=L_if)||(LA201_2>=L_while && LA201_2<=L_for)||(LA201_2>=L_match && LA201_2<=L_case)||LA201_2==L_exception||(LA201_2>=A_infinity && LA201_2<=L_lazy)||(LA201_2>=L_true && LA201_2<=L_nil)||LA201_2==MINUS||LA201_2==A_NOT||LA201_2==U_NOT||(LA201_2>=A_ELLIPSIS && LA201_2<=U_ELLIPSIS)||LA201_2==TILDE||(LA201_2>=Constr && LA201_2<=Num)||(LA201_2>=String && LA201_2<=ROUND_BRACKET_OPEN)||LA201_2==SQUARE_BRACKET_OPEN||LA201_2==CURLY_BRACKET_OPEN||LA201_2==UNDERSCORE) ) {
                                            alt201=1;
                                        }


                                    }


                                }
                                else if ( (LA201_0==COMMA) ) {
                                    int LA201_2 = input.LA(2);

                                    if ( (LA201_2==NL) ) {
                                        int LA201_4 = input.LA(3);

                                        if ( (LA201_4==L_begin||(LA201_4>=L_obj && LA201_4<=L_if)||(LA201_4>=L_while && LA201_4<=L_for)||(LA201_4>=L_match && LA201_4<=L_case)||LA201_4==L_exception||(LA201_4>=A_infinity && LA201_4<=L_lazy)||(LA201_4>=L_true && LA201_4<=L_nil)||LA201_4==MINUS||LA201_4==A_NOT||LA201_4==U_NOT||(LA201_4>=A_ELLIPSIS && LA201_4<=U_ELLIPSIS)||LA201_4==TILDE||(LA201_4>=Constr && LA201_4<=Num)||(LA201_4>=String && LA201_4<=ROUND_BRACKET_OPEN)||LA201_4==SQUARE_BRACKET_OPEN||LA201_4==CURLY_BRACKET_OPEN||LA201_4==UNDERSCORE) ) {
                                            alt201=1;
                                        }


                                    }
                                    else if ( (LA201_2==L_begin||(LA201_2>=L_obj && LA201_2<=L_if)||(LA201_2>=L_while && LA201_2<=L_for)||(LA201_2>=L_match && LA201_2<=L_case)||LA201_2==L_exception||(LA201_2>=A_infinity && LA201_2<=L_lazy)||(LA201_2>=L_true && LA201_2<=L_nil)||LA201_2==MINUS||LA201_2==A_NOT||LA201_2==U_NOT||(LA201_2>=A_ELLIPSIS && LA201_2<=U_ELLIPSIS)||LA201_2==TILDE||(LA201_2>=Constr && LA201_2<=Num)||(LA201_2>=String && LA201_2<=ROUND_BRACKET_OPEN)||LA201_2==SQUARE_BRACKET_OPEN||LA201_2==CURLY_BRACKET_OPEN||LA201_2==UNDERSCORE) ) {
                                        alt201=1;
                                    }


                                }


                                switch (alt201) {
                            	case 1 :
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:638:29: ( NL )? COMMA ( NL )? protected_expr
                            	    {
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:638:29: ( NL )?
                            	    int alt199=2;
                            	    int LA199_0 = input.LA(1);

                            	    if ( (LA199_0==NL) ) {
                            	        alt199=1;
                            	    }
                            	    switch (alt199) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:638:29: NL
                            	            {
                            	            NL419=(Token)match(input,NL,FOLLOW_NL_in_list_expr4201); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL419);


                            	            }
                            	            break;

                            	    }

                            	    COMMA420=(Token)match(input,COMMA,FOLLOW_COMMA_in_list_expr4204); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA420);

                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:638:39: ( NL )?
                            	    int alt200=2;
                            	    int LA200_0 = input.LA(1);

                            	    if ( (LA200_0==NL) ) {
                            	        alt200=1;
                            	    }
                            	    switch (alt200) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:638:39: NL
                            	            {
                            	            NL421=(Token)match(input,NL,FOLLOW_NL_in_list_expr4206); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL421);


                            	            }
                            	            break;

                            	    }

                            	    pushFollow(FOLLOW_protected_expr_in_list_expr4209);
                            	    protected_expr422=protected_expr();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr422.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop201;
                                }
                            } while (true);

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:638:60: ( NL )?
                            int alt202=2;
                            int LA202_0 = input.LA(1);

                            if ( (LA202_0==NL) ) {
                                alt202=1;
                            }
                            switch (alt202) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:638:60: NL
                                    {
                                    NL423=(Token)match(input,NL,FOLLOW_NL_in_list_expr4213); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL423);


                                    }
                                    break;

                            }

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:638:64: ( COMMA ( NL )? )?
                            int alt204=2;
                            int LA204_0 = input.LA(1);

                            if ( (LA204_0==COMMA) ) {
                                alt204=1;
                            }
                            switch (alt204) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:638:65: COMMA ( NL )?
                                    {
                                    COMMA424=(Token)match(input,COMMA,FOLLOW_COMMA_in_list_expr4217); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_COMMA.add(COMMA424);

                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:638:71: ( NL )?
                                    int alt203=2;
                                    int LA203_0 = input.LA(1);

                                    if ( (LA203_0==NL) ) {
                                        alt203=1;
                                    }
                                    switch (alt203) {
                                        case 1 :
                                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:638:71: NL
                                            {
                                            NL425=(Token)match(input,NL,FOLLOW_NL_in_list_expr4219); if (state.failed) return retval; 
                                            if ( state.backtracking==0 ) stream_NL.add(NL425);


                                            }
                                            break;

                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    char_literal426=(Token)match(input,ROUND_BRACKET_CLOSE,FOLLOW_ROUND_BRACKET_CLOSE_in_list_expr4226); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ROUND_BRACKET_CLOSE.add(char_literal426);



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
                    // 638:83: -> ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( protected_expr )* ) )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:638:86: ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( protected_expr )* ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ROUND_LIST, "ROUND_LIST"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:638:99: ^( NIL_TOKEN ( COMMA )* )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_2);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:638:111: ( COMMA )*
                        while ( stream_COMMA.hasNext() ) {
                            adaptor.addChild(root_2, stream_COMMA.nextNode());

                        }
                        stream_COMMA.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:638:119: ^( NIL_TOKEN ( protected_expr )* )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_2);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:638:131: ( protected_expr )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:640:1: map_or_set_expr : ( '{' ( NL )? ( map_or_set_elem_expr ( NL )? ( COMMA ( NL )? map_or_set_elem_expr ( NL )? )* )? '}' -> ^( MAP_OR_SET_OR_OBJ ( map_or_set_elem_expr )* ) | '{' ( NL )? token_ARROW ( NL )? '}' -> ^( EMPTY_MAP ) );
    public final babel17Parser.map_or_set_expr_return map_or_set_expr() throws RecognitionException {
        babel17Parser.map_or_set_expr_return retval = new babel17Parser.map_or_set_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal427=null;
        Token NL428=null;
        Token NL430=null;
        Token COMMA431=null;
        Token NL432=null;
        Token NL434=null;
        Token char_literal435=null;
        Token char_literal436=null;
        Token NL437=null;
        Token NL439=null;
        Token char_literal440=null;
        babel17Parser.map_or_set_elem_expr_return map_or_set_elem_expr429 = null;

        babel17Parser.map_or_set_elem_expr_return map_or_set_elem_expr433 = null;

        babel17Parser.token_ARROW_return token_ARROW438 = null;


        CommonTree char_literal427_tree=null;
        CommonTree NL428_tree=null;
        CommonTree NL430_tree=null;
        CommonTree COMMA431_tree=null;
        CommonTree NL432_tree=null;
        CommonTree NL434_tree=null;
        CommonTree char_literal435_tree=null;
        CommonTree char_literal436_tree=null;
        CommonTree NL437_tree=null;
        CommonTree NL439_tree=null;
        CommonTree char_literal440_tree=null;
        RewriteRuleTokenStream stream_CURLY_BRACKET_OPEN=new RewriteRuleTokenStream(adaptor,"token CURLY_BRACKET_OPEN");
        RewriteRuleTokenStream stream_CURLY_BRACKET_CLOSE=new RewriteRuleTokenStream(adaptor,"token CURLY_BRACKET_CLOSE");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_map_or_set_elem_expr=new RewriteRuleSubtreeStream(adaptor,"rule map_or_set_elem_expr");
        RewriteRuleSubtreeStream stream_token_ARROW=new RewriteRuleSubtreeStream(adaptor,"rule token_ARROW");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:641:2: ( '{' ( NL )? ( map_or_set_elem_expr ( NL )? ( COMMA ( NL )? map_or_set_elem_expr ( NL )? )* )? '}' -> ^( MAP_OR_SET_OR_OBJ ( map_or_set_elem_expr )* ) | '{' ( NL )? token_ARROW ( NL )? '}' -> ^( EMPTY_MAP ) )
            int alt215=2;
            int LA215_0 = input.LA(1);

            if ( (LA215_0==CURLY_BRACKET_OPEN) ) {
                switch ( input.LA(2) ) {
                case NL:
                    {
                    int LA215_2 = input.LA(3);

                    if ( ((LA215_2>=A_ARROW && LA215_2<=U_ARROW)) ) {
                        alt215=2;
                    }
                    else if ( (LA215_2==L_begin||(LA215_2>=L_obj && LA215_2<=L_if)||(LA215_2>=L_while && LA215_2<=L_for)||(LA215_2>=L_match && LA215_2<=L_case)||LA215_2==L_exception||(LA215_2>=A_infinity && LA215_2<=L_lazy)||(LA215_2>=L_true && LA215_2<=L_nil)||LA215_2==MINUS||LA215_2==A_NOT||LA215_2==U_NOT||(LA215_2>=A_ELLIPSIS && LA215_2<=U_ELLIPSIS)||LA215_2==TILDE||(LA215_2>=Constr && LA215_2<=Num)||(LA215_2>=String && LA215_2<=ROUND_BRACKET_OPEN)||LA215_2==SQUARE_BRACKET_OPEN||(LA215_2>=CURLY_BRACKET_OPEN && LA215_2<=UNDERSCORE)) ) {
                        alt215=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 215, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case A_ARROW:
                case U_ARROW:
                    {
                    alt215=2;
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
                case L_concurrent:
                case L_await:
                case L_lazy:
                case L_true:
                case L_false:
                case L_this:
                case L_random:
                case L_nil:
                case MINUS:
                case A_NOT:
                case U_NOT:
                case A_ELLIPSIS:
                case U_ELLIPSIS:
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
                    alt215=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 215, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 215, 0, input);

                throw nvae;
            }
            switch (alt215) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:641:4: '{' ( NL )? ( map_or_set_elem_expr ( NL )? ( COMMA ( NL )? map_or_set_elem_expr ( NL )? )* )? '}'
                    {
                    char_literal427=(Token)match(input,CURLY_BRACKET_OPEN,FOLLOW_CURLY_BRACKET_OPEN_in_map_or_set_expr4255); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_OPEN.add(char_literal427);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:641:8: ( NL )?
                    int alt207=2;
                    int LA207_0 = input.LA(1);

                    if ( (LA207_0==NL) ) {
                        alt207=1;
                    }
                    switch (alt207) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:641:8: NL
                            {
                            NL428=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_expr4257); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL428);


                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:641:12: ( map_or_set_elem_expr ( NL )? ( COMMA ( NL )? map_or_set_elem_expr ( NL )? )* )?
                    int alt212=2;
                    int LA212_0 = input.LA(1);

                    if ( (LA212_0==L_begin||(LA212_0>=L_obj && LA212_0<=L_if)||(LA212_0>=L_while && LA212_0<=L_for)||(LA212_0>=L_match && LA212_0<=L_case)||LA212_0==L_exception||(LA212_0>=A_infinity && LA212_0<=L_lazy)||(LA212_0>=L_true && LA212_0<=L_nil)||LA212_0==MINUS||LA212_0==A_NOT||LA212_0==U_NOT||(LA212_0>=A_ELLIPSIS && LA212_0<=U_ELLIPSIS)||LA212_0==TILDE||(LA212_0>=Constr && LA212_0<=Num)||(LA212_0>=String && LA212_0<=ROUND_BRACKET_OPEN)||LA212_0==SQUARE_BRACKET_OPEN||LA212_0==CURLY_BRACKET_OPEN||LA212_0==UNDERSCORE) ) {
                        alt212=1;
                    }
                    switch (alt212) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:641:13: map_or_set_elem_expr ( NL )? ( COMMA ( NL )? map_or_set_elem_expr ( NL )? )*
                            {
                            pushFollow(FOLLOW_map_or_set_elem_expr_in_map_or_set_expr4261);
                            map_or_set_elem_expr429=map_or_set_elem_expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_map_or_set_elem_expr.add(map_or_set_elem_expr429.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:641:34: ( NL )?
                            int alt208=2;
                            int LA208_0 = input.LA(1);

                            if ( (LA208_0==NL) ) {
                                alt208=1;
                            }
                            switch (alt208) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:641:34: NL
                                    {
                                    NL430=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_expr4263); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL430);


                                    }
                                    break;

                            }

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:641:38: ( COMMA ( NL )? map_or_set_elem_expr ( NL )? )*
                            loop211:
                            do {
                                int alt211=2;
                                int LA211_0 = input.LA(1);

                                if ( (LA211_0==COMMA) ) {
                                    alt211=1;
                                }


                                switch (alt211) {
                            	case 1 :
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:641:39: COMMA ( NL )? map_or_set_elem_expr ( NL )?
                            	    {
                            	    COMMA431=(Token)match(input,COMMA,FOLLOW_COMMA_in_map_or_set_expr4267); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA431);

                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:641:45: ( NL )?
                            	    int alt209=2;
                            	    int LA209_0 = input.LA(1);

                            	    if ( (LA209_0==NL) ) {
                            	        alt209=1;
                            	    }
                            	    switch (alt209) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:641:45: NL
                            	            {
                            	            NL432=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_expr4269); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL432);


                            	            }
                            	            break;

                            	    }

                            	    pushFollow(FOLLOW_map_or_set_elem_expr_in_map_or_set_expr4272);
                            	    map_or_set_elem_expr433=map_or_set_elem_expr();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_map_or_set_elem_expr.add(map_or_set_elem_expr433.getTree());
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:641:70: ( NL )?
                            	    int alt210=2;
                            	    int LA210_0 = input.LA(1);

                            	    if ( (LA210_0==NL) ) {
                            	        alt210=1;
                            	    }
                            	    switch (alt210) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:641:70: NL
                            	            {
                            	            NL434=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_expr4274); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL434);


                            	            }
                            	            break;

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop211;
                                }
                            } while (true);


                            }
                            break;

                    }

                    char_literal435=(Token)match(input,CURLY_BRACKET_CLOSE,FOLLOW_CURLY_BRACKET_CLOSE_in_map_or_set_expr4281); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_CLOSE.add(char_literal435);



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
                    // 641:82: -> ^( MAP_OR_SET_OR_OBJ ( map_or_set_elem_expr )* )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:641:85: ^( MAP_OR_SET_OR_OBJ ( map_or_set_elem_expr )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MAP_OR_SET_OR_OBJ, "MAP_OR_SET_OR_OBJ"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:641:105: ( map_or_set_elem_expr )*
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:642:10: '{' ( NL )? token_ARROW ( NL )? '}'
                    {
                    char_literal436=(Token)match(input,CURLY_BRACKET_OPEN,FOLLOW_CURLY_BRACKET_OPEN_in_map_or_set_expr4301); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_OPEN.add(char_literal436);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:642:14: ( NL )?
                    int alt213=2;
                    int LA213_0 = input.LA(1);

                    if ( (LA213_0==NL) ) {
                        alt213=1;
                    }
                    switch (alt213) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:642:14: NL
                            {
                            NL437=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_expr4303); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL437);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_token_ARROW_in_map_or_set_expr4306);
                    token_ARROW438=token_ARROW();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_token_ARROW.add(token_ARROW438.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:642:30: ( NL )?
                    int alt214=2;
                    int LA214_0 = input.LA(1);

                    if ( (LA214_0==NL) ) {
                        alt214=1;
                    }
                    switch (alt214) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:642:30: NL
                            {
                            NL439=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_expr4308); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL439);


                            }
                            break;

                    }

                    char_literal440=(Token)match(input,CURLY_BRACKET_CLOSE,FOLLOW_CURLY_BRACKET_CLOSE_in_map_or_set_expr4311); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_CLOSE.add(char_literal440);



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
                    // 642:38: -> ^( EMPTY_MAP )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:642:41: ^( EMPTY_MAP )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:644:1: map_or_set_elem_expr : protected_expr ( ( NL )? arrow_or_assign ( NL )? protected_expr )? -> ^( NIL_TOKEN ^( NIL_TOKEN ( protected_expr )* ) ( arrow_or_assign )* ) ;
    public final babel17Parser.map_or_set_elem_expr_return map_or_set_elem_expr() throws RecognitionException {
        babel17Parser.map_or_set_elem_expr_return retval = new babel17Parser.map_or_set_elem_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL442=null;
        Token NL444=null;
        babel17Parser.protected_expr_return protected_expr441 = null;

        babel17Parser.arrow_or_assign_return arrow_or_assign443 = null;

        babel17Parser.protected_expr_return protected_expr445 = null;


        CommonTree NL442_tree=null;
        CommonTree NL444_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_protected_expr=new RewriteRuleSubtreeStream(adaptor,"rule protected_expr");
        RewriteRuleSubtreeStream stream_arrow_or_assign=new RewriteRuleSubtreeStream(adaptor,"rule arrow_or_assign");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:645:2: ( protected_expr ( ( NL )? arrow_or_assign ( NL )? protected_expr )? -> ^( NIL_TOKEN ^( NIL_TOKEN ( protected_expr )* ) ( arrow_or_assign )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:645:4: protected_expr ( ( NL )? arrow_or_assign ( NL )? protected_expr )?
            {
            pushFollow(FOLLOW_protected_expr_in_map_or_set_elem_expr4328);
            protected_expr441=protected_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr441.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:645:19: ( ( NL )? arrow_or_assign ( NL )? protected_expr )?
            int alt218=2;
            int LA218_0 = input.LA(1);

            if ( (LA218_0==NL) ) {
                int LA218_1 = input.LA(2);

                if ( (LA218_1==ASSIGN||(LA218_1>=A_ARROW && LA218_1<=U_ARROW)) ) {
                    alt218=1;
                }
            }
            else if ( (LA218_0==ASSIGN||(LA218_0>=A_ARROW && LA218_0<=U_ARROW)) ) {
                alt218=1;
            }
            switch (alt218) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:645:20: ( NL )? arrow_or_assign ( NL )? protected_expr
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:645:20: ( NL )?
                    int alt216=2;
                    int LA216_0 = input.LA(1);

                    if ( (LA216_0==NL) ) {
                        alt216=1;
                    }
                    switch (alt216) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:645:20: NL
                            {
                            NL442=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_elem_expr4331); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL442);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_arrow_or_assign_in_map_or_set_elem_expr4334);
                    arrow_or_assign443=arrow_or_assign();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_arrow_or_assign.add(arrow_or_assign443.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:645:40: ( NL )?
                    int alt217=2;
                    int LA217_0 = input.LA(1);

                    if ( (LA217_0==NL) ) {
                        alt217=1;
                    }
                    switch (alt217) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:645:40: NL
                            {
                            NL444=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_elem_expr4336); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL444);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_protected_expr_in_map_or_set_elem_expr4339);
                    protected_expr445=protected_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr445.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: arrow_or_assign, protected_expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 645:61: -> ^( NIL_TOKEN ^( NIL_TOKEN ( protected_expr )* ) ( arrow_or_assign )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:645:64: ^( NIL_TOKEN ^( NIL_TOKEN ( protected_expr )* ) ( arrow_or_assign )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:645:76: ^( NIL_TOKEN ( protected_expr )* )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_2);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:645:88: ( protected_expr )*
                while ( stream_protected_expr.hasNext() ) {
                    adaptor.addChild(root_2, stream_protected_expr.nextTree());

                }
                stream_protected_expr.reset();

                adaptor.addChild(root_1, root_2);
                }
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:645:105: ( arrow_or_assign )*
                while ( stream_arrow_or_assign.hasNext() ) {
                    adaptor.addChild(root_1, stream_arrow_or_assign.nextTree());

                }
                stream_arrow_or_assign.reset();

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:647:1: primitive_expr : ( Num | String | Id | Constr | L_true | L_false | L_this | L_nil | token_infinity | list_expr | with_control_expr | map_or_set_expr );
    public final babel17Parser.primitive_expr_return primitive_expr() throws RecognitionException {
        babel17Parser.primitive_expr_return retval = new babel17Parser.primitive_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Num446=null;
        Token String447=null;
        Token Id448=null;
        Token Constr449=null;
        Token L_true450=null;
        Token L_false451=null;
        Token L_this452=null;
        Token L_nil453=null;
        babel17Parser.token_infinity_return token_infinity454 = null;

        babel17Parser.list_expr_return list_expr455 = null;

        babel17Parser.with_control_expr_return with_control_expr456 = null;

        babel17Parser.map_or_set_expr_return map_or_set_expr457 = null;


        CommonTree Num446_tree=null;
        CommonTree String447_tree=null;
        CommonTree Id448_tree=null;
        CommonTree Constr449_tree=null;
        CommonTree L_true450_tree=null;
        CommonTree L_false451_tree=null;
        CommonTree L_this452_tree=null;
        CommonTree L_nil453_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:648:2: ( Num | String | Id | Constr | L_true | L_false | L_this | L_nil | token_infinity | list_expr | with_control_expr | map_or_set_expr )
            int alt219=12;
            switch ( input.LA(1) ) {
            case Num:
                {
                alt219=1;
                }
                break;
            case String:
                {
                alt219=2;
                }
                break;
            case Id:
                {
                alt219=3;
                }
                break;
            case Constr:
                {
                alt219=4;
                }
                break;
            case L_true:
                {
                alt219=5;
                }
                break;
            case L_false:
                {
                alt219=6;
                }
                break;
            case L_this:
                {
                alt219=7;
                }
                break;
            case L_nil:
                {
                alt219=8;
                }
                break;
            case A_infinity:
            case U_infinity:
                {
                alt219=9;
                }
                break;
            case ROUND_BRACKET_OPEN:
            case SQUARE_BRACKET_OPEN:
                {
                alt219=10;
                }
                break;
            case L_begin:
            case L_with:
            case L_if:
            case L_while:
            case L_for:
            case L_match:
                {
                alt219=11;
                }
                break;
            case CURLY_BRACKET_OPEN:
                {
                alt219=12;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 219, 0, input);

                throw nvae;
            }

            switch (alt219) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:648:4: Num
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Num446=(Token)match(input,Num,FOLLOW_Num_in_primitive_expr4366); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Num446_tree = (CommonTree)adaptor.create(Num446);
                    adaptor.addChild(root_0, Num446_tree);
                    }

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:649:4: String
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    String447=(Token)match(input,String,FOLLOW_String_in_primitive_expr4371); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    String447_tree = (CommonTree)adaptor.create(String447);
                    adaptor.addChild(root_0, String447_tree);
                    }

                    }
                    break;
                case 3 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:650:4: Id
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Id448=(Token)match(input,Id,FOLLOW_Id_in_primitive_expr4376); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Id448_tree = (CommonTree)adaptor.create(Id448);
                    adaptor.addChild(root_0, Id448_tree);
                    }

                    }
                    break;
                case 4 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:651:4: Constr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Constr449=(Token)match(input,Constr,FOLLOW_Constr_in_primitive_expr4381); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Constr449_tree = (CommonTree)adaptor.create(Constr449);
                    adaptor.addChild(root_0, Constr449_tree);
                    }

                    }
                    break;
                case 5 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:652:4: L_true
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    L_true450=(Token)match(input,L_true,FOLLOW_L_true_in_primitive_expr4386); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    L_true450_tree = (CommonTree)adaptor.create(L_true450);
                    adaptor.addChild(root_0, L_true450_tree);
                    }

                    }
                    break;
                case 6 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:653:4: L_false
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    L_false451=(Token)match(input,L_false,FOLLOW_L_false_in_primitive_expr4391); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    L_false451_tree = (CommonTree)adaptor.create(L_false451);
                    adaptor.addChild(root_0, L_false451_tree);
                    }

                    }
                    break;
                case 7 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:654:4: L_this
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    L_this452=(Token)match(input,L_this,FOLLOW_L_this_in_primitive_expr4396); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    L_this452_tree = (CommonTree)adaptor.create(L_this452);
                    adaptor.addChild(root_0, L_this452_tree);
                    }

                    }
                    break;
                case 8 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:655:4: L_nil
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    L_nil453=(Token)match(input,L_nil,FOLLOW_L_nil_in_primitive_expr4402); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    L_nil453_tree = (CommonTree)adaptor.create(L_nil453);
                    adaptor.addChild(root_0, L_nil453_tree);
                    }

                    }
                    break;
                case 9 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:656:4: token_infinity
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_infinity_in_primitive_expr4407);
                    token_infinity454=token_infinity();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, token_infinity454.getTree());

                    }
                    break;
                case 10 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:657:5: list_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_list_expr_in_primitive_expr4413);
                    list_expr455=list_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, list_expr455.getTree());

                    }
                    break;
                case 11 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:658:4: with_control_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_with_control_expr_in_primitive_expr4418);
                    with_control_expr456=with_control_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, with_control_expr456.getTree());

                    }
                    break;
                case 12 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:659:4: map_or_set_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_map_or_set_expr_in_primitive_expr4423);
                    map_or_set_expr457=map_or_set_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, map_or_set_expr457.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:661:1: prog : block EOF -> ^( PROG block ) ;
    public final babel17Parser.prog_return prog() throws RecognitionException {
        babel17Parser.prog_return retval = new babel17Parser.prog_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EOF459=null;
        babel17Parser.block_return block458 = null;


        CommonTree EOF459_tree=null;
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:661:7: ( block EOF -> ^( PROG block ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:661:9: block EOF
            {
            pushFollow(FOLLOW_block_in_prog4433);
            block458=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block458.getTree());
            EOF459=(Token)match(input,EOF,FOLLOW_EOF_in_prog4435); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EOF.add(EOF459);



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
            // 661:19: -> ^( PROG block )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:661:22: ^( PROG block )
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
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:356:10: ( Id ( NL )? L_as )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:356:11: Id ( NL )? L_as
        {
        match(input,Id,FOLLOW_Id_in_synpred1_babel171590); if (state.failed) return ;
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:356:14: ( NL )?
        int alt220=2;
        int LA220_0 = input.LA(1);

        if ( (LA220_0==NL) ) {
            alt220=1;
        }
        switch (alt220) {
            case 1 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:356:14: NL
                {
                match(input,NL,FOLLOW_NL_in_synpred1_babel171592); if (state.failed) return ;

                }
                break;

        }

        match(input,L_as,FOLLOW_L_as_in_synpred1_babel171595); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_babel17

    // $ANTLR start synpred2_babel17
    public final void synpred2_babel17_fragment() throws RecognitionException {   
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:357:4: ( protected_expr ( NL )? QUESTION_MARK )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:357:5: protected_expr ( NL )? QUESTION_MARK
        {
        pushFollow(FOLLOW_protected_expr_in_synpred2_babel171626);
        protected_expr();

        state._fsp--;
        if (state.failed) return ;
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:357:20: ( NL )?
        int alt221=2;
        int LA221_0 = input.LA(1);

        if ( (LA221_0==NL) ) {
            alt221=1;
        }
        switch (alt221) {
            case 1 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:357:20: NL
                {
                match(input,NL,FOLLOW_NL_in_synpred2_babel171628); if (state.failed) return ;

                }
                break;

        }

        match(input,QUESTION_MARK,FOLLOW_QUESTION_MARK_in_synpred2_babel171631); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_babel17

    // $ANTLR start synpred3_babel17
    public final void synpred3_babel17_fragment() throws RecognitionException {   
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:426:4: ( ( pattern | objelem_assign ) ( NL )? '=' )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:426:5: ( pattern | objelem_assign ) ( NL )? '='
        {
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:426:5: ( pattern | objelem_assign )
        int alt222=2;
        int LA222_0 = input.LA(1);

        if ( (LA222_0==L_exception||(LA222_0>=A_infinity && LA222_0<=U_infinity)||(LA222_0>=L_true && LA222_0<=L_false)||LA222_0==L_nil||LA222_0==MINUS||(LA222_0>=A_ELLIPSIS && LA222_0<=U_ELLIPSIS)||LA222_0==Constr||LA222_0==Num||(LA222_0>=String && LA222_0<=ROUND_BRACKET_OPEN)||LA222_0==SQUARE_BRACKET_OPEN||LA222_0==CURLY_BRACKET_OPEN||LA222_0==UNDERSCORE) ) {
            alt222=1;
        }
        else if ( (LA222_0==Id) ) {
            int LA222_2 = input.LA(2);

            if ( (LA222_2==PERIOD) ) {
                alt222=2;
            }
            else if ( (LA222_2==ASSIGN||(LA222_2>=A_DOUBLE_COLON && LA222_2<=U_DOUBLE_COLON)||LA222_2==NL) ) {
                alt222=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 222, 2, input);

                throw nvae;
            }
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 222, 0, input);

            throw nvae;
        }
        switch (alt222) {
            case 1 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:426:6: pattern
                {
                pushFollow(FOLLOW_pattern_in_synpred3_babel172387);
                pattern();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:426:16: objelem_assign
                {
                pushFollow(FOLLOW_objelem_assign_in_synpred3_babel172391);
                objelem_assign();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:426:32: ( NL )?
        int alt223=2;
        int LA223_0 = input.LA(1);

        if ( (LA223_0==NL) ) {
            alt223=1;
        }
        switch (alt223) {
            case 1 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:426:32: NL
                {
                match(input,NL,FOLLOW_NL_in_synpred3_babel172394); if (state.failed) return ;

                }
                break;

        }

        match(input,ASSIGN,FOLLOW_ASSIGN_in_synpred3_babel172397); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_babel17

    // $ANTLR start synpred4_babel17
    public final void synpred4_babel17_fragment() throws RecognitionException {   
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:458:11: ( L_obj ( NL )? parents )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:458:12: L_obj ( NL )? parents
        {
        match(input,L_obj,FOLLOW_L_obj_in_synpred4_babel172608); if (state.failed) return ;
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:458:18: ( NL )?
        int alt224=2;
        int LA224_0 = input.LA(1);

        if ( (LA224_0==NL) ) {
            alt224=1;
        }
        switch (alt224) {
            case 1 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:458:18: NL
                {
                match(input,NL,FOLLOW_NL_in_synpred4_babel172610); if (state.failed) return ;

                }
                break;

        }

        pushFollow(FOLLOW_parents_in_synpred4_babel172613);
        parents();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_babel17

    // $ANTLR start synpred5_babel17
    public final void synpred5_babel17_fragment() throws RecognitionException {   
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:462:4: ( lambda_expr )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:462:5: lambda_expr
        {
        pushFollow(FOLLOW_lambda_expr_in_synpred5_babel172682);
        lambda_expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_babel17

    // $ANTLR start synpred6_babel17
    public final void synpred6_babel17_fragment() throws RecognitionException {   
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:466:4: ( protected_lambda_expr )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:466:5: protected_lambda_expr
        {
        pushFollow(FOLLOW_protected_lambda_expr_in_synpred6_babel172703);
        protected_lambda_expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred6_babel17

    // Delegated rules

    public final boolean synpred6_babel17() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_babel17_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
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
    protected DFA45 dfa45 = new DFA45(this);
    protected DFA51 dfa51 = new DFA51(this);
    protected DFA48 dfa48 = new DFA48(this);
    protected DFA68 dfa68 = new DFA68(this);
    protected DFA79 dfa79 = new DFA79(this);
    protected DFA80 dfa80 = new DFA80(this);
    static final String DFA16_eotS =
        "\36\uffff";
    static final String DFA16_eofS =
        "\36\uffff";
    static final String DFA16_minS =
        "\1\63\17\0\16\uffff";
    static final String DFA16_maxS =
        "\1\u0088\17\0\16\uffff";
    static final String DFA16_acceptS =
        "\20\uffff\13\2\1\4\1\1\1\3";
    static final String DFA16_specialS =
        "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1"+
        "\16\1\17\16\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\30\1\uffff\1\32\1\31\1\24\3\uffff\1\25\1\27\2\uffff\1\26"+
            "\1\20\1\uffff\1\33\2\uffff\1\16\2\uffff\2\11\3\21\1\uffff\1"+
            "\6\1\7\1\23\1\21\1\10\15\uffff\1\12\6\uffff\1\22\2\uffff\1\22"+
            "\11\uffff\2\17\3\uffff\1\21\3\uffff\1\2\1\1\1\5\1\uffff\1\4"+
            "\1\14\1\uffff\1\13\1\uffff\1\15\1\uffff\1\3",
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
            return "355:1: bracket_pattern : ( ( Id ( NL )? L_as )=> Id ( NL )? L_as ( NL )? pattern -> ^( L_as Id pattern ) | ( protected_expr ( NL )? QUESTION_MARK )=> protected_expr ( NL )? QUESTION_MARK ( ( NL )? pattern )? -> ^( QUESTION_MARK protected_expr ( pattern )? ) | pattern ( ( NL )? L_if ( NL )? protected_expr )? -> ^( IF_PATTERN pattern ( protected_expr )? ) | L_val ( NL )? protected_expr -> ^( L_val protected_expr ) );";
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

                        else if ( (LA16_0==L_nil) ) {s = 8;}

                        else if ( ((LA16_0>=A_infinity && LA16_0<=U_infinity)) ) {s = 9;}

                        else if ( (LA16_0==MINUS) ) {s = 10;}

                        else if ( (LA16_0==SQUARE_BRACKET_OPEN) ) {s = 11;}

                        else if ( (LA16_0==ROUND_BRACKET_OPEN) ) {s = 12;}

                        else if ( (LA16_0==CURLY_BRACKET_OPEN) ) {s = 13;}

                        else if ( (LA16_0==L_exception) ) {s = 14;}

                        else if ( ((LA16_0>=A_ELLIPSIS && LA16_0<=U_ELLIPSIS)) ) {s = 15;}

                        else if ( (LA16_0==L_case) && (synpred2_babel17())) {s = 16;}

                        else if ( ((LA16_0>=L_concurrent && LA16_0<=L_lazy)||LA16_0==L_random||LA16_0==TILDE) && (synpred2_babel17())) {s = 17;}

                        else if ( (LA16_0==A_NOT||LA16_0==U_NOT) && (synpred2_babel17())) {s = 18;}

                        else if ( (LA16_0==L_this) && (synpred2_babel17())) {s = 19;}

                        else if ( (LA16_0==L_if) && (synpred2_babel17())) {s = 20;}

                        else if ( (LA16_0==L_while) && (synpred2_babel17())) {s = 21;}

                        else if ( (LA16_0==L_match) && (synpred2_babel17())) {s = 22;}

                        else if ( (LA16_0==L_for) && (synpred2_babel17())) {s = 23;}

                        else if ( (LA16_0==L_begin) && (synpred2_babel17())) {s = 24;}

                        else if ( (LA16_0==L_with) && (synpred2_babel17())) {s = 25;}

                        else if ( (LA16_0==L_obj) && (synpred2_babel17())) {s = 26;}

                        else if ( (LA16_0==L_val) ) {s = 27;}

                         
                        input.seek(index16_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA16_1 = input.LA(1);

                         
                        int index16_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_babel17()) ) {s = 28;}

                        else if ( (synpred2_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index16_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA16_2 = input.LA(1);

                         
                        int index16_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index16_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA16_3 = input.LA(1);

                         
                        int index16_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index16_3);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA16_4 = input.LA(1);

                         
                        int index16_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index16_4);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA16_5 = input.LA(1);

                         
                        int index16_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index16_5);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA16_6 = input.LA(1);

                         
                        int index16_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index16_6);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA16_7 = input.LA(1);

                         
                        int index16_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index16_7);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA16_8 = input.LA(1);

                         
                        int index16_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index16_8);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA16_9 = input.LA(1);

                         
                        int index16_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index16_9);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA16_10 = input.LA(1);

                         
                        int index16_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index16_10);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA16_11 = input.LA(1);

                         
                        int index16_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index16_11);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA16_12 = input.LA(1);

                         
                        int index16_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index16_12);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA16_13 = input.LA(1);

                         
                        int index16_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index16_13);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA16_14 = input.LA(1);

                         
                        int index16_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index16_14);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA16_15 = input.LA(1);

                         
                        int index16_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index16_15);
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
    static final String DFA45_eotS =
        "\23\uffff";
    static final String DFA45_eofS =
        "\23\uffff";
    static final String DFA45_minS =
        "\1\110\10\uffff\1\110\2\uffff\1\63\1\110\2\uffff\1\63\2\uffff";
    static final String DFA45_maxS =
        "\1\u0088\10\uffff\1\177\2\uffff\1\u0088\1\177\2\uffff\1\u0088\2"+
        "\uffff";
    static final String DFA45_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\uffff\1\13\1\14\2\uffff"+
        "\1\11\1\12\1\uffff\1\16\1\15";
    static final String DFA45_specialS =
        "\23\uffff}>";
    static final String[] DFA45_transitionS = {
            "\2\10\4\uffff\1\5\1\6\2\uffff\1\7\15\uffff\1\11\35\uffff\1\1"+
            "\1\4\1\uffff\1\3\1\13\1\uffff\1\12\1\uffff\1\14\1\uffff\1\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\16\62\uffff\1\15\2\uffff\1\17",
            "",
            "",
            "\1\22\1\uffff\3\22\3\uffff\2\22\2\uffff\2\22\1\uffff\1\22\2"+
            "\uffff\1\22\2\uffff\5\22\1\uffff\5\22\15\uffff\1\22\6\uffff"+
            "\1\22\2\uffff\1\22\7\uffff\2\21\2\22\3\uffff\1\22\2\uffff\1"+
            "\20\3\22\1\uffff\2\22\1\uffff\1\22\1\uffff\3\22",
            "\2\16\65\uffff\1\17",
            "",
            "",
            "\1\22\1\uffff\3\22\3\uffff\2\22\2\uffff\2\22\1\uffff\1\22\2"+
            "\uffff\1\22\2\uffff\5\22\1\uffff\5\22\15\uffff\1\22\6\uffff"+
            "\1\22\2\uffff\1\22\7\uffff\2\21\2\22\3\uffff\1\22\3\uffff\3"+
            "\22\1\uffff\2\22\1\uffff\1\22\1\uffff\3\22",
            "",
            ""
    };

    static final short[] DFA45_eot = DFA.unpackEncodedString(DFA45_eotS);
    static final short[] DFA45_eof = DFA.unpackEncodedString(DFA45_eofS);
    static final char[] DFA45_min = DFA.unpackEncodedStringToUnsignedChars(DFA45_minS);
    static final char[] DFA45_max = DFA.unpackEncodedStringToUnsignedChars(DFA45_maxS);
    static final short[] DFA45_accept = DFA.unpackEncodedString(DFA45_acceptS);
    static final short[] DFA45_special = DFA.unpackEncodedString(DFA45_specialS);
    static final short[][] DFA45_transition;

    static {
        int numStates = DFA45_transitionS.length;
        DFA45_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA45_transition[i] = DFA.unpackEncodedString(DFA45_transitionS[i]);
        }
    }

    class DFA45 extends DFA {

        public DFA45(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 45;
            this.eot = DFA45_eot;
            this.eof = DFA45_eof;
            this.min = DFA45_min;
            this.max = DFA45_max;
            this.accept = DFA45_accept;
            this.special = DFA45_special;
            this.transition = DFA45_transition;
        }
        public String getDescription() {
            return "370:1: primitive_pattern : ( Id | '_' -> ANY | String | Num | L_true | L_false | L_nil | token_infinity | '-' ( NL )? token_infinity -> ^( UMINUS token_infinity ) | '-' ( NL )? Num -> ^( UMINUS Num ) | '[' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* )? ']' -> ^( SQUARE_LIST ( bracket_pattern )* ) | '(' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* ( COMMA ( NL )? )? )? ')' -> ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( bracket_pattern )* ) ) | '{' ( NL )? ( mselem_pattern ( NL )? ( COMMA ( NL )? mselem_pattern ( NL )? )* )? '}' -> ^( MAP_OR_SET_OR_OBJ ( mselem_pattern )* ) | '{' ( NL )? token_ARROW ( NL )? '}' -> ^( EMPTY_MAP ) );";
        }
    }
    static final String DFA51_eotS =
        "\4\uffff";
    static final String DFA51_eofS =
        "\2\3\2\uffff";
    static final String DFA51_minS =
        "\2\63\2\uffff";
    static final String DFA51_maxS =
        "\2\u0088\2\uffff";
    static final String DFA51_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA51_specialS =
        "\4\uffff}>";
    static final String[] DFA51_transitionS = {
            "\1\2\1\3\3\2\1\uffff\2\3\2\2\1\uffff\2\2\1\3\1\uffff\2\2\1\uffff"+
            "\1\2\2\uffff\13\2\13\uffff\1\1\1\uffff\1\2\6\uffff\1\2\2\uffff"+
            "\1\2\11\uffff\2\2\3\uffff\1\2\2\uffff\1\1\3\2\1\uffff\2\2\1"+
            "\uffff\1\2\1\uffff\1\2\1\uffff\1\2",
            "\1\2\1\3\3\2\1\uffff\2\3\2\2\1\uffff\2\2\1\3\1\uffff\2\2\1"+
            "\uffff\1\2\2\uffff\13\2\13\uffff\1\1\1\uffff\1\2\6\uffff\1\2"+
            "\2\uffff\1\2\11\uffff\2\2\3\uffff\1\2\2\uffff\1\1\3\2\1\uffff"+
            "\2\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\2",
            "",
            ""
    };

    static final short[] DFA51_eot = DFA.unpackEncodedString(DFA51_eotS);
    static final short[] DFA51_eof = DFA.unpackEncodedString(DFA51_eofS);
    static final char[] DFA51_min = DFA.unpackEncodedStringToUnsignedChars(DFA51_minS);
    static final char[] DFA51_max = DFA.unpackEncodedStringToUnsignedChars(DFA51_maxS);
    static final short[] DFA51_accept = DFA.unpackEncodedString(DFA51_acceptS);
    static final short[] DFA51_special = DFA.unpackEncodedString(DFA51_specialS);
    static final short[][] DFA51_transition;

    static {
        int numStates = DFA51_transitionS.length;
        DFA51_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA51_transition[i] = DFA.unpackEncodedString(DFA51_transitionS[i]);
        }
    }

    class DFA51 extends DFA {

        public DFA51(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 51;
            this.eot = DFA51_eot;
            this.eof = DFA51_eof;
            this.min = DFA51_min;
            this.max = DFA51_max;
            this.accept = DFA51_accept;
            this.special = DFA51_special;
            this.transition = DFA51_transition;
        }
        public String getDescription() {
            return "394:1: block : ( ( sep )? statement ( sep statement )* ( sep )? -> ^( BLOCK ( statement )* ) | ( sep )? -> ^( BLOCK ) );";
        }
    }
    static final String DFA48_eotS =
        "\4\uffff";
    static final String DFA48_eofS =
        "\2\2\2\uffff";
    static final String DFA48_minS =
        "\1\64\1\63\2\uffff";
    static final String DFA48_maxS =
        "\1\174\1\u0088\2\uffff";
    static final String DFA48_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA48_specialS =
        "\4\uffff}>";
    static final String[] DFA48_transitionS = {
            "\1\2\4\uffff\2\2\5\uffff\1\2\35\uffff\1\1\35\uffff\1\1",
            "\1\3\1\2\3\3\1\uffff\2\2\2\3\1\uffff\2\3\1\2\1\uffff\2\3\1"+
            "\uffff\1\3\2\uffff\13\3\13\uffff\1\1\1\uffff\1\3\6\uffff\1\3"+
            "\2\uffff\1\3\11\uffff\2\3\3\uffff\1\3\2\uffff\1\1\3\3\1\uffff"+
            "\2\3\1\uffff\1\3\1\uffff\1\3\1\uffff\1\3",
            "",
            ""
    };

    static final short[] DFA48_eot = DFA.unpackEncodedString(DFA48_eotS);
    static final short[] DFA48_eof = DFA.unpackEncodedString(DFA48_eofS);
    static final char[] DFA48_min = DFA.unpackEncodedStringToUnsignedChars(DFA48_minS);
    static final char[] DFA48_max = DFA.unpackEncodedStringToUnsignedChars(DFA48_maxS);
    static final short[] DFA48_accept = DFA.unpackEncodedString(DFA48_acceptS);
    static final short[] DFA48_special = DFA.unpackEncodedString(DFA48_specialS);
    static final short[][] DFA48_transition;

    static {
        int numStates = DFA48_transitionS.length;
        DFA48_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA48_transition[i] = DFA.unpackEncodedString(DFA48_transitionS[i]);
        }
    }

    class DFA48 extends DFA {

        public DFA48(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 48;
            this.eot = DFA48_eot;
            this.eof = DFA48_eof;
            this.min = DFA48_min;
            this.max = DFA48_max;
            this.accept = DFA48_accept;
            this.special = DFA48_special;
            this.transition = DFA48_transition;
        }
        public String getDescription() {
            return "()* loopback of 394:25: ( sep statement )*";
        }
    }
    static final String DFA68_eotS =
        "\33\uffff";
    static final String DFA68_eofS =
        "\33\uffff";
    static final String DFA68_minS =
        "\1\63\17\0\13\uffff";
    static final String DFA68_maxS =
        "\1\u0088\17\0\13\uffff";
    static final String DFA68_acceptS =
        "\20\uffff\1\2\11\uffff\1\1";
    static final String DFA68_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\13\uffff}>";
    static final String[] DFA68_transitionS = {
            "\1\20\1\uffff\3\20\3\uffff\2\20\2\uffff\1\20\5\uffff\1\16\2"+
            "\uffff\2\11\3\20\1\uffff\1\6\1\7\2\20\1\10\15\uffff\1\12\6\uffff"+
            "\1\20\2\uffff\1\20\11\uffff\2\17\3\uffff\1\20\3\uffff\1\1\1"+
            "\2\1\5\1\uffff\1\4\1\14\1\uffff\1\13\1\uffff\1\15\1\uffff\1"+
            "\3",
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
            ""
    };

    static final short[] DFA68_eot = DFA.unpackEncodedString(DFA68_eotS);
    static final short[] DFA68_eof = DFA.unpackEncodedString(DFA68_eofS);
    static final char[] DFA68_min = DFA.unpackEncodedStringToUnsignedChars(DFA68_minS);
    static final char[] DFA68_max = DFA.unpackEncodedStringToUnsignedChars(DFA68_maxS);
    static final short[] DFA68_accept = DFA.unpackEncodedString(DFA68_acceptS);
    static final short[] DFA68_special = DFA.unpackEncodedString(DFA68_specialS);
    static final short[][] DFA68_transition;

    static {
        int numStates = DFA68_transitionS.length;
        DFA68_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA68_transition[i] = DFA.unpackEncodedString(DFA68_transitionS[i]);
        }
    }

    class DFA68 extends DFA {

        public DFA68(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 68;
            this.eot = DFA68_eot;
            this.eof = DFA68_eof;
            this.min = DFA68_min;
            this.max = DFA68_max;
            this.accept = DFA68_accept;
            this.special = DFA68_special;
            this.transition = DFA68_transition;
        }
        public String getDescription() {
            return "425:1: expr_or_assign : ( ( ( pattern | objelem_assign ) ( NL )? '=' )=> ( pattern | objelem_assign ) ( NL )? '=' ( NL )? expr -> ^( ASSIGN ( pattern )* ( objelem_assign )* expr ) | expr );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA68_1 = input.LA(1);

                         
                        int index68_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index68_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA68_2 = input.LA(1);

                         
                        int index68_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index68_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA68_3 = input.LA(1);

                         
                        int index68_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index68_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA68_4 = input.LA(1);

                         
                        int index68_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index68_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA68_5 = input.LA(1);

                         
                        int index68_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index68_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA68_6 = input.LA(1);

                         
                        int index68_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index68_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA68_7 = input.LA(1);

                         
                        int index68_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index68_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA68_8 = input.LA(1);

                         
                        int index68_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index68_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA68_9 = input.LA(1);

                         
                        int index68_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index68_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA68_10 = input.LA(1);

                         
                        int index68_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index68_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA68_11 = input.LA(1);

                         
                        int index68_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index68_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA68_12 = input.LA(1);

                         
                        int index68_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index68_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA68_13 = input.LA(1);

                         
                        int index68_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index68_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA68_14 = input.LA(1);

                         
                        int index68_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index68_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA68_15 = input.LA(1);

                         
                        int index68_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index68_15);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 68, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA79_eotS =
        "\31\uffff";
    static final String DFA79_eofS =
        "\31\uffff";
    static final String DFA79_minS =
        "\1\63\2\0\1\uffff\13\0\12\uffff";
    static final String DFA79_maxS =
        "\1\u0088\2\0\1\uffff\13\0\12\uffff";
    static final String DFA79_acceptS =
        "\3\uffff\1\1\13\uffff\1\1\1\2\10\uffff";
    static final String DFA79_specialS =
        "\1\0\1\1\1\2\1\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\12\uffff}>";
    static final String[] DFA79_transitionS = {
            "\1\20\2\uffff\2\20\3\uffff\2\20\2\uffff\1\20\5\uffff\1\16\2"+
            "\uffff\2\11\3\20\1\uffff\1\6\1\7\2\20\1\10\15\uffff\1\12\6\uffff"+
            "\1\20\2\uffff\1\20\11\uffff\2\17\3\uffff\1\20\3\uffff\1\1\1"+
            "\2\1\5\1\uffff\1\4\1\14\1\uffff\1\13\1\uffff\1\15\1\uffff\1"+
            "\3",
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
            ""
    };

    static final short[] DFA79_eot = DFA.unpackEncodedString(DFA79_eotS);
    static final short[] DFA79_eof = DFA.unpackEncodedString(DFA79_eofS);
    static final char[] DFA79_min = DFA.unpackEncodedStringToUnsignedChars(DFA79_minS);
    static final char[] DFA79_max = DFA.unpackEncodedStringToUnsignedChars(DFA79_maxS);
    static final short[] DFA79_accept = DFA.unpackEncodedString(DFA79_acceptS);
    static final short[] DFA79_special = DFA.unpackEncodedString(DFA79_specialS);
    static final short[][] DFA79_transition;

    static {
        int numStates = DFA79_transitionS.length;
        DFA79_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA79_transition[i] = DFA.unpackEncodedString(DFA79_transitionS[i]);
        }
    }

    class DFA79 extends DFA {

        public DFA79(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 79;
            this.eot = DFA79_eot;
            this.eof = DFA79_eof;
            this.min = DFA79_min;
            this.max = DFA79_max;
            this.accept = DFA79_accept;
            this.special = DFA79_special;
            this.transition = DFA79_transition;
        }
        public String getDescription() {
            return "461:1: lop_expr : ( ( lambda_expr )=> lambda_expr | op_expr );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA79_0 = input.LA(1);

                         
                        int index79_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA79_0==Constr) ) {s = 1;}

                        else if ( (LA79_0==Id) ) {s = 2;}

                        else if ( (LA79_0==UNDERSCORE) && (synpred5_babel17())) {s = 3;}

                        else if ( (LA79_0==String) ) {s = 4;}

                        else if ( (LA79_0==Num) ) {s = 5;}

                        else if ( (LA79_0==L_true) ) {s = 6;}

                        else if ( (LA79_0==L_false) ) {s = 7;}

                        else if ( (LA79_0==L_nil) ) {s = 8;}

                        else if ( ((LA79_0>=A_infinity && LA79_0<=U_infinity)) ) {s = 9;}

                        else if ( (LA79_0==MINUS) ) {s = 10;}

                        else if ( (LA79_0==SQUARE_BRACKET_OPEN) ) {s = 11;}

                        else if ( (LA79_0==ROUND_BRACKET_OPEN) ) {s = 12;}

                        else if ( (LA79_0==CURLY_BRACKET_OPEN) ) {s = 13;}

                        else if ( (LA79_0==L_exception) ) {s = 14;}

                        else if ( ((LA79_0>=A_ELLIPSIS && LA79_0<=U_ELLIPSIS)) && (synpred5_babel17())) {s = 15;}

                        else if ( (LA79_0==L_begin||(LA79_0>=L_with && LA79_0<=L_if)||(LA79_0>=L_while && LA79_0<=L_for)||LA79_0==L_match||(LA79_0>=L_concurrent && LA79_0<=L_lazy)||(LA79_0>=L_this && LA79_0<=L_random)||LA79_0==A_NOT||LA79_0==U_NOT||LA79_0==TILDE) ) {s = 16;}

                         
                        input.seek(index79_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA79_1 = input.LA(1);

                         
                        int index79_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index79_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA79_2 = input.LA(1);

                         
                        int index79_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index79_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA79_4 = input.LA(1);

                         
                        int index79_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index79_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA79_5 = input.LA(1);

                         
                        int index79_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index79_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA79_6 = input.LA(1);

                         
                        int index79_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index79_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA79_7 = input.LA(1);

                         
                        int index79_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index79_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA79_8 = input.LA(1);

                         
                        int index79_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index79_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA79_9 = input.LA(1);

                         
                        int index79_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index79_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA79_10 = input.LA(1);

                         
                        int index79_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index79_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA79_11 = input.LA(1);

                         
                        int index79_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index79_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA79_12 = input.LA(1);

                         
                        int index79_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index79_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA79_13 = input.LA(1);

                         
                        int index79_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index79_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA79_14 = input.LA(1);

                         
                        int index79_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index79_14);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 79, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA80_eotS =
        "\32\uffff";
    static final String DFA80_eofS =
        "\32\uffff";
    static final String DFA80_minS =
        "\1\63\2\0\1\uffff\13\0\13\uffff";
    static final String DFA80_maxS =
        "\1\u0088\2\0\1\uffff\13\0\13\uffff";
    static final String DFA80_acceptS =
        "\3\uffff\1\1\13\uffff\2\1\1\2\10\uffff";
    static final String DFA80_specialS =
        "\1\0\1\1\1\2\1\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\13\uffff}>";
    static final String[] DFA80_transitionS = {
            "\1\21\2\uffff\2\21\3\uffff\2\21\2\uffff\1\21\1\20\4\uffff\1"+
            "\16\2\uffff\2\11\3\21\1\uffff\1\6\1\7\2\21\1\10\15\uffff\1\12"+
            "\6\uffff\1\21\2\uffff\1\21\11\uffff\2\17\3\uffff\1\21\3\uffff"+
            "\1\1\1\2\1\5\1\uffff\1\4\1\14\1\uffff\1\13\1\uffff\1\15\1\uffff"+
            "\1\3",
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
            ""
    };

    static final short[] DFA80_eot = DFA.unpackEncodedString(DFA80_eotS);
    static final short[] DFA80_eof = DFA.unpackEncodedString(DFA80_eofS);
    static final char[] DFA80_min = DFA.unpackEncodedStringToUnsignedChars(DFA80_minS);
    static final char[] DFA80_max = DFA.unpackEncodedStringToUnsignedChars(DFA80_maxS);
    static final short[] DFA80_accept = DFA.unpackEncodedString(DFA80_acceptS);
    static final short[] DFA80_special = DFA.unpackEncodedString(DFA80_specialS);
    static final short[][] DFA80_transition;

    static {
        int numStates = DFA80_transitionS.length;
        DFA80_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA80_transition[i] = DFA.unpackEncodedString(DFA80_transitionS[i]);
        }
    }

    class DFA80 extends DFA {

        public DFA80(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 80;
            this.eot = DFA80_eot;
            this.eof = DFA80_eof;
            this.min = DFA80_min;
            this.max = DFA80_max;
            this.accept = DFA80_accept;
            this.special = DFA80_special;
            this.transition = DFA80_transition;
        }
        public String getDescription() {
            return "465:1: p_lop_expr : ( ( protected_lambda_expr )=> protected_lambda_expr | p_op_expr );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA80_0 = input.LA(1);

                         
                        int index80_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA80_0==Constr) ) {s = 1;}

                        else if ( (LA80_0==Id) ) {s = 2;}

                        else if ( (LA80_0==UNDERSCORE) && (synpred6_babel17())) {s = 3;}

                        else if ( (LA80_0==String) ) {s = 4;}

                        else if ( (LA80_0==Num) ) {s = 5;}

                        else if ( (LA80_0==L_true) ) {s = 6;}

                        else if ( (LA80_0==L_false) ) {s = 7;}

                        else if ( (LA80_0==L_nil) ) {s = 8;}

                        else if ( ((LA80_0>=A_infinity && LA80_0<=U_infinity)) ) {s = 9;}

                        else if ( (LA80_0==MINUS) ) {s = 10;}

                        else if ( (LA80_0==SQUARE_BRACKET_OPEN) ) {s = 11;}

                        else if ( (LA80_0==ROUND_BRACKET_OPEN) ) {s = 12;}

                        else if ( (LA80_0==CURLY_BRACKET_OPEN) ) {s = 13;}

                        else if ( (LA80_0==L_exception) ) {s = 14;}

                        else if ( ((LA80_0>=A_ELLIPSIS && LA80_0<=U_ELLIPSIS)) && (synpred6_babel17())) {s = 15;}

                        else if ( (LA80_0==L_case) && (synpred6_babel17())) {s = 16;}

                        else if ( (LA80_0==L_begin||(LA80_0>=L_with && LA80_0<=L_if)||(LA80_0>=L_while && LA80_0<=L_for)||LA80_0==L_match||(LA80_0>=L_concurrent && LA80_0<=L_lazy)||(LA80_0>=L_this && LA80_0<=L_random)||LA80_0==A_NOT||LA80_0==U_NOT||LA80_0==TILDE) ) {s = 17;}

                         
                        input.seek(index80_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA80_1 = input.LA(1);

                         
                        int index80_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_babel17()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index80_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA80_2 = input.LA(1);

                         
                        int index80_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_babel17()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index80_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA80_4 = input.LA(1);

                         
                        int index80_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_babel17()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index80_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA80_5 = input.LA(1);

                         
                        int index80_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_babel17()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index80_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA80_6 = input.LA(1);

                         
                        int index80_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_babel17()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index80_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA80_7 = input.LA(1);

                         
                        int index80_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_babel17()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index80_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA80_8 = input.LA(1);

                         
                        int index80_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_babel17()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index80_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA80_9 = input.LA(1);

                         
                        int index80_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_babel17()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index80_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA80_10 = input.LA(1);

                         
                        int index80_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_babel17()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index80_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA80_11 = input.LA(1);

                         
                        int index80_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_babel17()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index80_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA80_12 = input.LA(1);

                         
                        int index80_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_babel17()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index80_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA80_13 = input.LA(1);

                         
                        int index80_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_babel17()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index80_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA80_14 = input.LA(1);

                         
                        int index80_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_babel17()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index80_14);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 80, _s, input);
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
    public static final BitSet FOLLOW_Constr_in_pattern1506 = new BitSet(new long[]{0x0000000000000002L,0xD00000010004C300L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_pattern1509 = new BitSet(new long[]{0x0000000000000000L,0xD00000010004C300L,0x0000000000000156L});
    public static final BitSet FOLLOW_primitive_pattern_in_pattern1512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitive_pattern_in_pattern1528 = new BitSet(new long[]{0x0000000000000002L,0x1000180000000000L});
    public static final BitSet FOLLOW_NL_in_pattern1531 = new BitSet(new long[]{0x0000000000000000L,0x1000180000000000L});
    public static final BitSet FOLLOW_token_DOUBLE_COLON_in_pattern1534 = new BitSet(new long[]{0x0000000000000000L,0xD00000010004C300L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_pattern1536 = new BitSet(new long[]{0x0000000000000000L,0xD00000010004C300L,0x0000000000000156L});
    public static final BitSet FOLLOW_primitive_pattern_in_pattern1539 = new BitSet(new long[]{0x0000000000000002L,0x1000180000000000L});
    public static final BitSet FOLLOW_L_exception_in_pattern1558 = new BitSet(new long[]{0x0000000000000000L,0xD00000010004C300L,0x0000000000000156L});
    public static final BitSet FOLLOW_primitive_pattern_in_pattern1560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_ELLIPSIS_in_pattern1573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Id_in_bracket_pattern1600 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000002L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1602 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_L_as_in_bracket_pattern1605 = new BitSet(new long[]{0x0000000000000000L,0xF03000010004C320L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1607 = new BitSet(new long[]{0x0000000000000000L,0xF03000010004C320L,0x0000000000000156L});
    public static final BitSet FOLLOW_pattern_in_bracket_pattern1610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protected_expr_in_bracket_pattern1639 = new BitSet(new long[]{0x0000000000000000L,0x1100000000000000L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1641 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_QUESTION_MARK_in_bracket_pattern1644 = new BitSet(new long[]{0x0000000000000002L,0xF03000010004C320L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1647 = new BitSet(new long[]{0x0000000000000000L,0xF03000010004C320L,0x0000000000000156L});
    public static final BitSet FOLLOW_pattern_in_bracket_pattern1650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_bracket_pattern1668 = new BitSet(new long[]{0x0080000000000002L,0x1000000000000000L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1671 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_L_if_in_bracket_pattern1674 = new BitSet(new long[]{0x98E8000000000000L,0xF23004810007DF21L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1676 = new BitSet(new long[]{0x98E8000000000000L,0xF23004810007DF21L,0x0000000000000156L});
    public static final BitSet FOLLOW_protected_expr_in_bracket_pattern1679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_val_in_bracket_pattern1697 = new BitSet(new long[]{0x98E8000000000000L,0xF23004810007DF21L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1699 = new BitSet(new long[]{0x98E8000000000000L,0xF23004810007DF21L,0x0000000000000156L});
    public static final BitSet FOLLOW_protected_expr_in_bracket_pattern1702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_ARROW_in_arrow_or_assign1720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGN_in_arrow_or_assign1731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracket_pattern_in_mselem_pattern1746 = new BitSet(new long[]{0x0000000100000002L,0x100C000000000000L});
    public static final BitSet FOLLOW_NL_in_mselem_pattern1749 = new BitSet(new long[]{0x0000000100000000L,0x100C000000000000L});
    public static final BitSet FOLLOW_arrow_or_assign_in_mselem_pattern1752 = new BitSet(new long[]{0x98E8000000000000L,0xF23004810007DF25L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_mselem_pattern1754 = new BitSet(new long[]{0x98E8000000000000L,0xF23004810007DF25L,0x0000000000000156L});
    public static final BitSet FOLLOW_bracket_pattern_in_mselem_pattern1757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Id_in_primitive_pattern1786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNDERSCORE_in_primitive_pattern1791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_String_in_primitive_pattern1800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Num_in_primitive_pattern1805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_true_in_primitive_pattern1810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_false_in_primitive_pattern1815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_nil_in_primitive_pattern1820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_infinity_in_primitive_pattern1825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_primitive_pattern1830 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000300L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern1832 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000300L});
    public static final BitSet FOLLOW_token_infinity_in_primitive_pattern1835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_primitive_pattern1848 = new BitSet(new long[]{0x0000000000000000L,0x9000000000000000L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern1850 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_Num_in_primitive_pattern1853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SQUARE_BRACKET_OPEN_in_primitive_pattern1866 = new BitSet(new long[]{0x98E8000000000000L,0xF23004810007DF25L,0x0000000000000176L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern1869 = new BitSet(new long[]{0x98E8000000000000L,0xF23004810007DF25L,0x0000000000000176L});
    public static final BitSet FOLLOW_bracket_pattern_in_primitive_pattern1873 = new BitSet(new long[]{0x0000000000000000L,0x1080000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern1875 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_COMMA_in_primitive_pattern1880 = new BitSet(new long[]{0x98E8000000000000L,0xF23004810007DF25L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern1882 = new BitSet(new long[]{0x98E8000000000000L,0xF23004810007DF25L,0x0000000000000156L});
    public static final BitSet FOLLOW_bracket_pattern_in_primitive_pattern1885 = new BitSet(new long[]{0x0000000000000000L,0x1080000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern1887 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_SQUARE_BRACKET_CLOSE_in_primitive_pattern1895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROUND_BRACKET_OPEN_in_primitive_pattern1915 = new BitSet(new long[]{0x98E8000000000000L,0xF23004810007DF25L,0x000000000000015EL});
    public static final BitSet FOLLOW_NL_in_primitive_pattern1918 = new BitSet(new long[]{0x98E8000000000000L,0xF23004810007DF25L,0x000000000000015EL});
    public static final BitSet FOLLOW_bracket_pattern_in_primitive_pattern1922 = new BitSet(new long[]{0x0000000000000000L,0x1080000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern1924 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_COMMA_in_primitive_pattern1929 = new BitSet(new long[]{0x98E8000000000000L,0xF23004810007DF25L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern1932 = new BitSet(new long[]{0x98E8000000000000L,0xF23004810007DF25L,0x0000000000000156L});
    public static final BitSet FOLLOW_bracket_pattern_in_primitive_pattern1935 = new BitSet(new long[]{0x0000000000000000L,0x1080000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern1937 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_COMMA_in_primitive_pattern1943 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern1945 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_ROUND_BRACKET_CLOSE_in_primitive_pattern1952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURLY_BRACKET_OPEN_in_primitive_pattern1984 = new BitSet(new long[]{0x98E8000000000000L,0xF23004810007DF25L,0x00000000000001D6L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern1987 = new BitSet(new long[]{0x98E8000000000000L,0xF23004810007DF25L,0x00000000000001D6L});
    public static final BitSet FOLLOW_mselem_pattern_in_primitive_pattern1991 = new BitSet(new long[]{0x0000000000000000L,0x1080000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern1993 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_COMMA_in_primitive_pattern1998 = new BitSet(new long[]{0x98E8000000000000L,0xF23004810007DF25L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2001 = new BitSet(new long[]{0x98E8000000000000L,0xF23004810007DF25L,0x0000000000000156L});
    public static final BitSet FOLLOW_mselem_pattern_in_primitive_pattern2004 = new BitSet(new long[]{0x0000000000000000L,0x1080000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2006 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_CURLY_BRACKET_CLOSE_in_primitive_pattern2014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURLY_BRACKET_OPEN_in_primitive_pattern2032 = new BitSet(new long[]{0x0000000000000000L,0x100C000000000000L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2034 = new BitSet(new long[]{0x0000000000000000L,0x000C000000000000L});
    public static final BitSet FOLLOW_token_ARROW_in_primitive_pattern2037 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2039 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_CURLY_BRACKET_CLOSE_in_primitive_pattern2042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_sep2064 = new BitSet(new long[]{0x0000000000000002L,0x1000000040000000L});
    public static final BitSet FOLLOW_sep_in_block2080 = new BitSet(new long[]{0xD8E8000000000000L,0xF23004810007FF2DL,0x0000000000000156L});
    public static final BitSet FOLLOW_statement_in_block2083 = new BitSet(new long[]{0x0000000000000002L,0x1000000040000000L});
    public static final BitSet FOLLOW_sep_in_block2086 = new BitSet(new long[]{0xD8E8000000000000L,0xF23004810007FF2DL,0x0000000000000156L});
    public static final BitSet FOLLOW_statement_in_block2088 = new BitSet(new long[]{0x0000000000000002L,0x1000000040000000L});
    public static final BitSet FOLLOW_sep_in_block2092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sep_in_block2108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_pure_block2125 = new BitSet(new long[]{0x0000000000000002L,0x1000000040000000L});
    public static final BitSet FOLLOW_sep_in_pure_block2128 = new BitSet(new long[]{0xD8E8000000000000L,0xF23004810007FF2DL,0x0000000000000156L});
    public static final BitSet FOLLOW_statement_in_pure_block2130 = new BitSet(new long[]{0x0000000000000002L,0x1000000040000000L});
    public static final BitSet FOLLOW_st_val_in_statement2151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_def_in_statement2156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_memoize_in_statement2161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_yield_in_statement2166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_or_assign_in_statement2171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Id_in_objelem_assign2180 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_PERIOD_in_objelem_assign2182 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_Id_in_objelem_assign2184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_val_in_st_val2203 = new BitSet(new long[]{0x0000000000000000L,0xF03000010004C320L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_st_val2205 = new BitSet(new long[]{0x0000000000000000L,0xF03000010004C320L,0x0000000000000156L});
    public static final BitSet FOLLOW_pattern_in_st_val2209 = new BitSet(new long[]{0x0000000100000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_objelem_assign_in_st_val2213 = new BitSet(new long[]{0x0000000100000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_NL_in_st_val2216 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ASSIGN_in_st_val2219 = new BitSet(new long[]{0xD8E8000000000000L,0xF23004810007FF2DL,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_st_val2221 = new BitSet(new long[]{0xD8E8000000000000L,0xF23004810007FF2DL,0x0000000000000156L});
    public static final BitSet FOLLOW_expr_in_st_val2224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_def_in_st_def2248 = new BitSet(new long[]{0x0000000000000000L,0x5000000000000000L});
    public static final BitSet FOLLOW_NL_in_st_def2250 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_Id_in_st_def2253 = new BitSet(new long[]{0x0000000100000000L,0xD00000010004C300L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_st_def2255 = new BitSet(new long[]{0x0000000100000000L,0xD00000010004C300L,0x0000000000000156L});
    public static final BitSet FOLLOW_primitive_pattern_in_st_def2259 = new BitSet(new long[]{0x0000000100000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_NL_in_st_def2261 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ASSIGN_in_st_def2266 = new BitSet(new long[]{0xD8E8000000000000L,0xF23004810007FF2DL,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_st_def2268 = new BitSet(new long[]{0xD8E8000000000000L,0xF23004810007FF2DL,0x0000000000000156L});
    public static final BitSet FOLLOW_expr_in_st_def2271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_yield_in_st_yield2300 = new BitSet(new long[]{0xD8E8000000000000L,0xF23004810007FF2DL,0x0000000000000156L});
    public static final BitSet FOLLOW_expr_in_st_yield2302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_memoize_in_st_memoize2320 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_memid_in_st_memoize2322 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_Id_in_memid2346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROUND_BRACKET_OPEN_in_memid2359 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_Id_in_memid2361 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_ROUND_BRACKET_CLOSE_in_memid2363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_expr_or_assign2403 = new BitSet(new long[]{0x0000000100000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_objelem_assign_in_expr_or_assign2407 = new BitSet(new long[]{0x0000000100000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_NL_in_expr_or_assign2410 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ASSIGN_in_expr_or_assign2413 = new BitSet(new long[]{0xD8E8000000000000L,0xF23004810007FF2DL,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_expr_or_assign2415 = new BitSet(new long[]{0xD8E8000000000000L,0xF23004810007FF2DL,0x0000000000000156L});
    public static final BitSet FOLLOW_expr_in_expr_or_assign2418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_or_assign2437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lop_expr_in_expr2448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_obj_expr_in_expr2453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_expr_in_control_expr2463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_do_expr_in_control_expr2468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_match_expr_in_control_expr2473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_expr_in_control_expr2478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_begin_end_in_control_expr2483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_control_expr_in_with_control_expr2493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_with_in_with_control_expr2498 = new BitSet(new long[]{0x98E8000000000000L,0xF23004810007DF21L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_with_control_expr2500 = new BitSet(new long[]{0x98E8000000000000L,0xF23004810007DF21L,0x0000000000000156L});
    public static final BitSet FOLLOW_protected_expr_in_with_control_expr2503 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_NL_in_with_control_expr2505 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COLON_in_with_control_expr2508 = new BitSet(new long[]{0x9888000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_NL_in_with_control_expr2510 = new BitSet(new long[]{0x9888000000000000L});
    public static final BitSet FOLLOW_control_expr_in_with_control_expr2513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_lop_expr_in_protected_expr2534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_obj_expr_in_protected_expr2539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_begin_in_begin_end2551 = new BitSet(new long[]{0xD8F8000000000000L,0xF23004814007FF2DL,0x0000000000000156L});
    public static final BitSet FOLLOW_block_in_begin_end2553 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_L_end_in_begin_end2555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_parents2573 = new BitSet(new long[]{0x98C8000000000000L,0xF23004810007DF21L,0x0000000000000156L});
    public static final BitSet FOLLOW_primitive_expr_in_parents2575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIMES_in_parents2588 = new BitSet(new long[]{0x98C8000000000000L,0xF23004810007DF21L,0x0000000000000156L});
    public static final BitSet FOLLOW_primitive_expr_in_parents2590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_obj_in_obj_expr2618 = new BitSet(new long[]{0x0000000000000000L,0x1000000280000000L});
    public static final BitSet FOLLOW_NL_in_obj_expr2620 = new BitSet(new long[]{0x0000000000000000L,0x1000000280000000L});
    public static final BitSet FOLLOW_parents_in_obj_expr2623 = new BitSet(new long[]{0xD8F8000000000000L,0xF23004814007FF2DL,0x0000000000000156L});
    public static final BitSet FOLLOW_block_in_obj_expr2625 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_L_end_in_obj_expr2627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_obj_in_obj_expr2655 = new BitSet(new long[]{0xD8F8000000000000L,0xF23004814007FF2DL,0x0000000000000156L});
    public static final BitSet FOLLOW_block_in_obj_expr2657 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_L_end_in_obj_expr2659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_expr_in_lop_expr2687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_op_expr_in_lop_expr2692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protected_lambda_expr_in_p_lop_expr2708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_op_expr_in_p_lop_expr2713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_if_in_if_expr2724 = new BitSet(new long[]{0x98E8000000000000L,0xF23004810007DF21L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_if_expr2726 = new BitSet(new long[]{0x98E8000000000000L,0xF23004810007DF21L,0x0000000000000156L});
    public static final BitSet FOLLOW_protected_expr_in_if_expr2729 = new BitSet(new long[]{0x0100000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_NL_in_if_expr2731 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_L_then_in_if_expr2734 = new BitSet(new long[]{0xDEF8000000000000L,0xF23004814007FF2DL,0x0000000000000156L});
    public static final BitSet FOLLOW_block_in_if_expr2736 = new BitSet(new long[]{0x0610000000000000L});
    public static final BitSet FOLLOW_L_elseif_in_if_expr2742 = new BitSet(new long[]{0x98E8000000000000L,0xF23004810007DF21L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_if_expr2744 = new BitSet(new long[]{0x98E8000000000000L,0xF23004810007DF21L,0x0000000000000156L});
    public static final BitSet FOLLOW_protected_expr_in_if_expr2747 = new BitSet(new long[]{0x0100000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_NL_in_if_expr2749 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_L_then_in_if_expr2752 = new BitSet(new long[]{0xDEF8000000000000L,0xF23004814007FF2DL,0x0000000000000156L});
    public static final BitSet FOLLOW_block_in_if_expr2754 = new BitSet(new long[]{0x0610000000000000L});
    public static final BitSet FOLLOW_L_else_in_if_expr2762 = new BitSet(new long[]{0xD8F8000000000000L,0xF23004814007FF2DL,0x0000000000000156L});
    public static final BitSet FOLLOW_block_in_if_expr2764 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_L_end_in_if_expr2768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_while_in_while_do_expr2792 = new BitSet(new long[]{0x98E8000000000000L,0xF23004810007DF21L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_while_do_expr2794 = new BitSet(new long[]{0x98E8000000000000L,0xF23004810007DF21L,0x0000000000000156L});
    public static final BitSet FOLLOW_protected_expr_in_while_do_expr2797 = new BitSet(new long[]{0x2000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_NL_in_while_do_expr2799 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_L_do_in_while_do_expr2802 = new BitSet(new long[]{0xD8F8000000000000L,0xF23004814007FF2DL,0x0000000000000156L});
    public static final BitSet FOLLOW_block_in_while_do_expr2804 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_L_end_in_while_do_expr2806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_full_cases_in_cases2836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_cases2841 = new BitSet(new long[]{0x0000000000000000L,0x1003000000000000L});
    public static final BitSet FOLLOW_NL_in_cases2843 = new BitSet(new long[]{0x0000000000000000L,0x1003000000000000L});
    public static final BitSet FOLLOW_token_DOUBLE_ARROW_in_cases2846 = new BitSet(new long[]{0xD8E8000000000000L,0xF23004814007FF2DL,0x0000000000000156L});
    public static final BitSet FOLLOW_block_in_cases2848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_case_expr_in_full_cases2871 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_L_case_in_case_expr2892 = new BitSet(new long[]{0x0000000000000000L,0xF03000010004C320L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_case_expr2894 = new BitSet(new long[]{0x0000000000000000L,0xF03000010004C320L,0x0000000000000156L});
    public static final BitSet FOLLOW_pattern_in_case_expr2897 = new BitSet(new long[]{0x0000000000000000L,0x1003000000000000L});
    public static final BitSet FOLLOW_NL_in_case_expr2899 = new BitSet(new long[]{0x0000000000000000L,0x1003000000000000L});
    public static final BitSet FOLLOW_token_DOUBLE_ARROW_in_case_expr2902 = new BitSet(new long[]{0xD8E8000000000000L,0xF23004814007FF2DL,0x0000000000000156L});
    public static final BitSet FOLLOW_block_in_case_expr2904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_match_in_match_expr2925 = new BitSet(new long[]{0x98C8000000000000L,0xF23004810007DF21L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_match_expr2927 = new BitSet(new long[]{0x98C8000000000000L,0xF23004810007DF21L,0x0000000000000156L});
    public static final BitSet FOLLOW_p_op_expr_in_match_expr2930 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000001L});
    public static final BitSet FOLLOW_NL_in_match_expr2932 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000001L});
    public static final BitSet FOLLOW_full_cases_in_match_expr2935 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_L_end_in_match_expr2937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_cases_in_lambda_expr2963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_lambda_cases2981 = new BitSet(new long[]{0x0000000000000000L,0x1003000000000000L});
    public static final BitSet FOLLOW_NL_in_lambda_cases2983 = new BitSet(new long[]{0x0000000000000000L,0x1003000000000000L});
    public static final BitSet FOLLOW_token_DOUBLE_ARROW_in_lambda_cases2986 = new BitSet(new long[]{0x98C8000000000000L,0xF23004810007DF21L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_lambda_cases2988 = new BitSet(new long[]{0x98C8000000000000L,0xF23004810007DF21L,0x0000000000000156L});
    public static final BitSet FOLLOW_lop_expr_in_lambda_cases2991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protected_lambda_cases_in_protected_lambda_expr3019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_case_in_p_lambda_case_expr3037 = new BitSet(new long[]{0x0000000000000000L,0xF03000010004C320L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_p_lambda_case_expr3039 = new BitSet(new long[]{0x0000000000000000L,0xF03000010004C320L,0x0000000000000156L});
    public static final BitSet FOLLOW_pattern_in_p_lambda_case_expr3042 = new BitSet(new long[]{0x0000000000000000L,0x1003000000000000L});
    public static final BitSet FOLLOW_NL_in_p_lambda_case_expr3044 = new BitSet(new long[]{0x0000000000000000L,0x1003000000000000L});
    public static final BitSet FOLLOW_token_DOUBLE_ARROW_in_p_lambda_case_expr3047 = new BitSet(new long[]{0xD8E8000000000000L,0xF23004810007FF2DL,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_p_lambda_case_expr3049 = new BitSet(new long[]{0xD8E8000000000000L,0xF23004810007FF2DL,0x0000000000000156L});
    public static final BitSet FOLLOW_pure_block_in_p_lambda_case_expr3052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_protected_lambda_cases3073 = new BitSet(new long[]{0x0000000000000000L,0x1003000000000000L});
    public static final BitSet FOLLOW_NL_in_protected_lambda_cases3075 = new BitSet(new long[]{0x0000000000000000L,0x1003000000000000L});
    public static final BitSet FOLLOW_token_DOUBLE_ARROW_in_protected_lambda_cases3078 = new BitSet(new long[]{0xD8E8000000000000L,0xF23004810007FF2DL,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_protected_lambda_cases3080 = new BitSet(new long[]{0xD8E8000000000000L,0xF23004810007FF2DL,0x0000000000000156L});
    public static final BitSet FOLLOW_pure_block_in_protected_lambda_cases3083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_lambda_case_expr_in_protected_lambda_cases3102 = new BitSet(new long[]{0x0000000000000002L,0xF03000010004C321L,0x0000000000000156L});
    public static final BitSet FOLLOW_L_for_in_for_expr3119 = new BitSet(new long[]{0x0000000000000000L,0xF03000010004C320L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_for_expr3121 = new BitSet(new long[]{0x0000000000000000L,0xF03000010004C320L,0x0000000000000156L});
    public static final BitSet FOLLOW_pattern_in_for_expr3124 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000010L});
    public static final BitSet FOLLOW_NL_in_for_expr3126 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_L_in_in_for_expr3129 = new BitSet(new long[]{0x98E8000000000000L,0xF23004810007DF21L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_for_expr3131 = new BitSet(new long[]{0x98E8000000000000L,0xF23004810007DF21L,0x0000000000000156L});
    public static final BitSet FOLLOW_protected_expr_in_for_expr3134 = new BitSet(new long[]{0x2000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_NL_in_for_expr3136 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_L_do_in_for_expr3139 = new BitSet(new long[]{0xD8F8000000000000L,0xF23004814007FF2DL,0x0000000000000156L});
    public static final BitSet FOLLOW_block_in_for_expr3141 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_L_end_in_for_expr3143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_builtin_primitive_in_op_expr3168 = new BitSet(new long[]{0x98C8000000000000L,0xF23004810007DF21L,0x0000000000000156L});
    public static final BitSet FOLLOW_op_expr_in_op_expr3171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bool_expr_in_op_expr3176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_builtin_primitive_in_p_op_expr3186 = new BitSet(new long[]{0x98C8000000000000L,0xF23004810007DF21L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_p_op_expr3189 = new BitSet(new long[]{0x98C8000000000000L,0xF23004810007DF21L,0x0000000000000156L});
    public static final BitSet FOLLOW_p_op_expr_in_p_op_expr3193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_bool_expr_in_p_op_expr3198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_builtin_primitive0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bool_or_expr_in_bool_expr3238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_bool_or_expr_in_p_bool_expr3248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bool_and_expr_in_bool_or_expr3257 = new BitSet(new long[]{0x0000000000000002L,0x1000012000000000L});
    public static final BitSet FOLLOW_NL_in_bool_or_expr3260 = new BitSet(new long[]{0x0000000000000000L,0x1000012000000000L});
    public static final BitSet FOLLOW_token_OR_in_bool_or_expr3264 = new BitSet(new long[]{0x98C8000000000000L,0xF23004810007DF21L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_bool_or_expr3267 = new BitSet(new long[]{0x98C8000000000000L,0xF23004810007DF21L,0x0000000000000156L});
    public static final BitSet FOLLOW_bool_and_expr_in_bool_or_expr3271 = new BitSet(new long[]{0x0000000000000002L,0x1000012000000000L});
    public static final BitSet FOLLOW_p_bool_and_expr_in_p_bool_or_expr3283 = new BitSet(new long[]{0x0000000000000002L,0x1000012000000000L});
    public static final BitSet FOLLOW_NL_in_p_bool_or_expr3286 = new BitSet(new long[]{0x0000000000000000L,0x1000012000000000L});
    public static final BitSet FOLLOW_token_OR_in_p_bool_or_expr3290 = new BitSet(new long[]{0x98C8000000000000L,0xF23004810007DF21L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_p_bool_or_expr3293 = new BitSet(new long[]{0x98C8000000000000L,0xF23004810007DF21L,0x0000000000000156L});
    public static final BitSet FOLLOW_p_bool_and_expr_in_p_bool_or_expr3297 = new BitSet(new long[]{0x0000000000000002L,0x1000012000000000L});
    public static final BitSet FOLLOW_bool_not_expr_in_bool_and_expr3309 = new BitSet(new long[]{0x0000000000000002L,0x1000024000000000L});
    public static final BitSet FOLLOW_NL_in_bool_and_expr3312 = new BitSet(new long[]{0x0000000000000000L,0x1000024000000000L});
    public static final BitSet FOLLOW_token_AND_in_bool_and_expr3316 = new BitSet(new long[]{0x98C8000000000000L,0xF23004810007DF21L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_bool_and_expr3319 = new BitSet(new long[]{0x98C8000000000000L,0xF23004810007DF21L,0x0000000000000156L});
    public static final BitSet FOLLOW_bool_not_expr_in_bool_and_expr3323 = new BitSet(new long[]{0x0000000000000002L,0x1000024000000000L});
    public static final BitSet FOLLOW_p_bool_not_expr_in_p_bool_and_expr3335 = new BitSet(new long[]{0x0000000000000002L,0x1000024000000000L});
    public static final BitSet FOLLOW_NL_in_p_bool_and_expr3338 = new BitSet(new long[]{0x0000000000000000L,0x1000024000000000L});
    public static final BitSet FOLLOW_token_AND_in_p_bool_and_expr3342 = new BitSet(new long[]{0x98C8000000000000L,0xF23004810007DF21L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_p_bool_and_expr3345 = new BitSet(new long[]{0x98C8000000000000L,0xF23004810007DF21L,0x0000000000000156L});
    public static final BitSet FOLLOW_p_bool_not_expr_in_p_bool_and_expr3349 = new BitSet(new long[]{0x0000000000000002L,0x1000024000000000L});
    public static final BitSet FOLLOW_token_NOT_in_bool_not_expr3361 = new BitSet(new long[]{0x98C8000000000000L,0xF23004810007DF21L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_bool_not_expr3364 = new BitSet(new long[]{0x98C8000000000000L,0xF23004810007DF21L,0x0000000000000156L});
    public static final BitSet FOLLOW_bool_not_expr_in_bool_not_expr3368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rel_expr_in_bool_not_expr3373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_NOT_in_p_bool_not_expr3384 = new BitSet(new long[]{0x98C8000000000000L,0xF23004810007DF21L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_p_bool_not_expr3387 = new BitSet(new long[]{0x98C8000000000000L,0xF23004810007DF21L,0x0000000000000156L});
    public static final BitSet FOLLOW_p_bool_not_expr_in_p_bool_not_expr3391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_rel_expr_in_p_bool_not_expr3396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arith_expr_in_rel_expr3405 = new BitSet(new long[]{0x0000000000000002L,0x100000003FF80000L});
    public static final BitSet FOLLOW_NL_in_rel_expr3408 = new BitSet(new long[]{0x0000000000000000L,0x100000003FF80000L});
    public static final BitSet FOLLOW_rel_op_in_rel_expr3411 = new BitSet(new long[]{0x98C8000000000000L,0xF23004810007DF21L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_rel_expr3413 = new BitSet(new long[]{0x98C8000000000000L,0xF23004810007DF21L,0x0000000000000156L});
    public static final BitSet FOLLOW_arith_expr_in_rel_expr3416 = new BitSet(new long[]{0x0000000000000002L,0x100000003FF80000L});
    public static final BitSet FOLLOW_p_arith_expr_in_p_rel_expr3443 = new BitSet(new long[]{0x0000000000000002L,0x100000003FF80000L});
    public static final BitSet FOLLOW_NL_in_p_rel_expr3446 = new BitSet(new long[]{0x0000000000000000L,0x100000003FF80000L});
    public static final BitSet FOLLOW_rel_op_in_p_rel_expr3449 = new BitSet(new long[]{0x98C8000000000000L,0xF23004810007DF21L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_p_rel_expr3451 = new BitSet(new long[]{0x98C8000000000000L,0xF23004810007DF21L,0x0000000000000156L});
    public static final BitSet FOLLOW_p_arith_expr_in_p_rel_expr3454 = new BitSet(new long[]{0x0000000000000002L,0x100000003FF80000L});
    public static final BitSet FOLLOW_token_EQUAL_in_rel_op3480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_NOT_EQUAL_in_rel_op3484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNRELATED_in_rel_op3488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATER_in_rel_op3492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_GREATER_EQ_in_rel_op3496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_in_rel_op3500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_LESS_EQ_in_rel_op3504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_plusplus_expr_in_arith_expr3516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_plusplus_expr_in_p_arith_expr3526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timestimes_expr_in_plusplus_expr3536 = new BitSet(new long[]{0x0000000000000002L,0x1000C00000000000L});
    public static final BitSet FOLLOW_NL_in_plusplus_expr3539 = new BitSet(new long[]{0x0000000000000000L,0x0000C00000000000L});
    public static final BitSet FOLLOW_PLUSPLUS_in_plusplus_expr3544 = new BitSet(new long[]{0x98C8000000000000L,0xF23004810007DF21L,0x0000000000000156L});
    public static final BitSet FOLLOW_MINUSMINUS_in_plusplus_expr3547 = new BitSet(new long[]{0x98C8000000000000L,0xF23004810007DF21L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_plusplus_expr3551 = new BitSet(new long[]{0x98C8000000000000L,0xF23004810007DF21L,0x0000000000000156L});
    public static final BitSet FOLLOW_timestimes_expr_in_plusplus_expr3555 = new BitSet(new long[]{0x0000000000000002L,0x1000C00000000000L});
    public static final BitSet FOLLOW_p_timestimes_expr_in_p_plusplus_expr3567 = new BitSet(new long[]{0x0000000000000002L,0x1000C00000000000L});
    public static final BitSet FOLLOW_NL_in_p_plusplus_expr3570 = new BitSet(new long[]{0x0000000000000000L,0x0000C00000000000L});
    public static final BitSet FOLLOW_PLUSPLUS_in_p_plusplus_expr3575 = new BitSet(new long[]{0x98C8000000000000L,0xF23004810007DF21L,0x0000000000000156L});
    public static final BitSet FOLLOW_MINUSMINUS_in_p_plusplus_expr3578 = new BitSet(new long[]{0x98C8000000000000L,0xF23004810007DF21L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_p_plusplus_expr3582 = new BitSet(new long[]{0x98C8000000000000L,0xF23004810007DF21L,0x0000000000000156L});
    public static final BitSet FOLLOW_p_timestimes_expr_in_p_plusplus_expr3586 = new BitSet(new long[]{0x0000000000000002L,0x1000C00000000000L});
    public static final BitSet FOLLOW_simple_expr_in_timestimes_expr3598 = new BitSet(new long[]{0x0000000000000002L,0x1000200000000000L});
    public static final BitSet FOLLOW_NL_in_timestimes_expr3601 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_TIMESTIMES_in_timestimes_expr3606 = new BitSet(new long[]{0x98C8000000000000L,0xF23004810007DF21L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_timestimes_expr3610 = new BitSet(new long[]{0x98C8000000000000L,0xF23004810007DF21L,0x0000000000000156L});
    public static final BitSet FOLLOW_simple_expr_in_timestimes_expr3614 = new BitSet(new long[]{0x0000000000000002L,0x1000200000000000L});
    public static final BitSet FOLLOW_p_simple_expr_in_p_timestimes_expr3627 = new BitSet(new long[]{0x0000000000000002L,0x1000200000000000L});
    public static final BitSet FOLLOW_NL_in_p_timestimes_expr3630 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_TIMESTIMES_in_p_timestimes_expr3635 = new BitSet(new long[]{0x98C8000000000000L,0xF23004810007DF21L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_p_timestimes_expr3639 = new BitSet(new long[]{0x98C8000000000000L,0xF23004810007DF21L,0x0000000000000156L});
    public static final BitSet FOLLOW_p_simple_expr_in_p_timestimes_expr3643 = new BitSet(new long[]{0x0000000000000002L,0x1000200000000000L});
    public static final BitSet FOLLOW_cons_expr_in_simple_expr3654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_cons_expr_in_p_simple_expr3663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_to_expr_in_cons_expr3672 = new BitSet(new long[]{0x0000000000000002L,0x1000180000000000L});
    public static final BitSet FOLLOW_NL_in_cons_expr3675 = new BitSet(new long[]{0x0000000000000000L,0x1000180000000000L});
    public static final BitSet FOLLOW_token_DOUBLE_COLON_in_cons_expr3678 = new BitSet(new long[]{0x98C8000000000000L,0xF23004810007DF21L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_cons_expr3680 = new BitSet(new long[]{0x98C8000000000000L,0xF23004810007DF21L,0x0000000000000156L});
    public static final BitSet FOLLOW_to_expr_in_cons_expr3683 = new BitSet(new long[]{0x0000000000000002L,0x1000180000000000L});
    public static final BitSet FOLLOW_p_to_expr_in_p_cons_expr3703 = new BitSet(new long[]{0x0000000000000002L,0x1000180000000000L});
    public static final BitSet FOLLOW_NL_in_p_cons_expr3706 = new BitSet(new long[]{0x0000000000000000L,0x1000180000000000L});
    public static final BitSet FOLLOW_token_DOUBLE_COLON_in_p_cons_expr3709 = new BitSet(new long[]{0x98C8000000000000L,0xF23004810007DF21L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_p_cons_expr3711 = new BitSet(new long[]{0x98C8000000000000L,0xF23004810007DF21L,0x0000000000000156L});
    public static final BitSet FOLLOW_p_to_expr_in_p_cons_expr3714 = new BitSet(new long[]{0x0000000000000002L,0x1000180000000000L});
    public static final BitSet FOLLOW_arith_plus_expr_in_to_expr3734 = new BitSet(new long[]{0x0000000000000002L,0x10000000000000C0L});
    public static final BitSet FOLLOW_NL_in_to_expr3737 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_L_to_in_to_expr3742 = new BitSet(new long[]{0x98C8000000000000L,0xF23004810007DF21L,0x0000000000000156L});
    public static final BitSet FOLLOW_L_downto_in_to_expr3746 = new BitSet(new long[]{0x98C8000000000000L,0xF23004810007DF21L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_to_expr3750 = new BitSet(new long[]{0x98C8000000000000L,0xF23004810007DF21L,0x0000000000000156L});
    public static final BitSet FOLLOW_arith_plus_expr_in_to_expr3754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_arith_plus_expr_in_p_to_expr3767 = new BitSet(new long[]{0x0000000000000002L,0x10000000000000C0L});
    public static final BitSet FOLLOW_NL_in_p_to_expr3770 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_L_to_in_p_to_expr3775 = new BitSet(new long[]{0x98C8000000000000L,0xF23004810007DF21L,0x0000000000000156L});
    public static final BitSet FOLLOW_L_downto_in_p_to_expr3779 = new BitSet(new long[]{0x98C8000000000000L,0xF23004810007DF21L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_p_to_expr3783 = new BitSet(new long[]{0x98C8000000000000L,0xF23004810007DF21L,0x0000000000000156L});
    public static final BitSet FOLLOW_p_arith_plus_expr_in_p_to_expr3787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arith_uminus_expr_in_arith_plus_expr3799 = new BitSet(new long[]{0x0000000000000002L,0x1000000180000000L});
    public static final BitSet FOLLOW_NL_in_arith_plus_expr3803 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_PLUS_in_arith_plus_expr3807 = new BitSet(new long[]{0x98C8000000000000L,0xF23004810007DF21L,0x0000000000000156L});
    public static final BitSet FOLLOW_MINUS_in_arith_plus_expr3812 = new BitSet(new long[]{0x98C8000000000000L,0xF23004810007DF21L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_arith_plus_expr3816 = new BitSet(new long[]{0x98C8000000000000L,0xF23004810007DF21L,0x0000000000000156L});
    public static final BitSet FOLLOW_arith_uminus_expr_in_arith_plus_expr3820 = new BitSet(new long[]{0x0000000000000002L,0x1000000180000000L});
    public static final BitSet FOLLOW_p_arith_uminus_expr_in_p_arith_plus_expr3831 = new BitSet(new long[]{0x0000000000000002L,0x1000000180000000L});
    public static final BitSet FOLLOW_NL_in_p_arith_plus_expr3834 = new BitSet(new long[]{0x0000000000000000L,0x0000000180000000L});
    public static final BitSet FOLLOW_set_in_p_arith_plus_expr3838 = new BitSet(new long[]{0x98C8000000000000L,0xF23004810007DF21L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_p_arith_plus_expr3847 = new BitSet(new long[]{0x98C8000000000000L,0xF23004810007DF21L,0x0000000000000156L});
    public static final BitSet FOLLOW_p_arith_uminus_expr_in_p_arith_plus_expr3851 = new BitSet(new long[]{0x0000000000000002L,0x1000000180000000L});
    public static final BitSet FOLLOW_MINUS_in_arith_uminus_expr3864 = new BitSet(new long[]{0x98C8000000000000L,0xF23004810007DF21L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_arith_uminus_expr3866 = new BitSet(new long[]{0x98C8000000000000L,0xF23004810007DF21L,0x0000000000000156L});
    public static final BitSet FOLLOW_arith_mult_expr_in_arith_uminus_expr3869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arith_mult_expr_in_arith_uminus_expr3882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_p_arith_uminus_expr3893 = new BitSet(new long[]{0x98C8000000000000L,0xF23004810007DF21L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_p_arith_uminus_expr3895 = new BitSet(new long[]{0x98C8000000000000L,0xF23004810007DF21L,0x0000000000000156L});
    public static final BitSet FOLLOW_p_arith_mult_expr_in_p_arith_uminus_expr3898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_arith_mult_expr_in_p_arith_uminus_expr3911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arith_pow_expr_in_arith_mult_expr3920 = new BitSet(new long[]{0x0000000000000002L,0x1000000E00000000L});
    public static final BitSet FOLLOW_NL_in_arith_mult_expr3923 = new BitSet(new long[]{0x0000000000000000L,0x0000000E00000000L});
    public static final BitSet FOLLOW_set_in_arith_mult_expr3927 = new BitSet(new long[]{0x98C8000000000000L,0xF23004810007DF21L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_arith_mult_expr3940 = new BitSet(new long[]{0x98C8000000000000L,0xF23004810007DF21L,0x0000000000000156L});
    public static final BitSet FOLLOW_arith_pow_expr_in_arith_mult_expr3944 = new BitSet(new long[]{0x0000000000000002L,0x1000000E00000000L});
    public static final BitSet FOLLOW_p_arith_pow_expr_in_p_arith_mult_expr3956 = new BitSet(new long[]{0x0000000000000002L,0x1000000E00000000L});
    public static final BitSet FOLLOW_NL_in_p_arith_mult_expr3959 = new BitSet(new long[]{0x0000000000000000L,0x0000000E00000000L});
    public static final BitSet FOLLOW_set_in_p_arith_mult_expr3963 = new BitSet(new long[]{0x98C8000000000000L,0xF23004810007DF21L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_p_arith_mult_expr3976 = new BitSet(new long[]{0x98C8000000000000L,0xF23004810007DF21L,0x0000000000000156L});
    public static final BitSet FOLLOW_p_arith_pow_expr_in_p_arith_mult_expr3980 = new BitSet(new long[]{0x0000000000000002L,0x1000000E00000000L});
    public static final BitSet FOLLOW_apply_expr_in_arith_pow_expr3991 = new BitSet(new long[]{0x0000000000000002L,0x1000001000000000L});
    public static final BitSet FOLLOW_NL_in_arith_pow_expr3994 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_POW_tok_in_arith_pow_expr3997 = new BitSet(new long[]{0x98C8000000000000L,0xF23004810007DF21L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_arith_pow_expr3999 = new BitSet(new long[]{0x98C8000000000000L,0xF23004810007DF21L,0x0000000000000156L});
    public static final BitSet FOLLOW_apply_expr_in_arith_pow_expr4002 = new BitSet(new long[]{0x0000000000000002L,0x1000001000000000L});
    public static final BitSet FOLLOW_p_apply_expr_in_p_arith_pow_expr4023 = new BitSet(new long[]{0x0000000000000002L,0x1000001000000000L});
    public static final BitSet FOLLOW_NL_in_p_arith_pow_expr4026 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_POW_tok_in_p_arith_pow_expr4029 = new BitSet(new long[]{0x98C8000000000000L,0xF23004810007DF21L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_p_arith_pow_expr4031 = new BitSet(new long[]{0x98C8000000000000L,0xF23004810007DF21L,0x0000000000000156L});
    public static final BitSet FOLLOW_p_apply_expr_in_p_arith_pow_expr4034 = new BitSet(new long[]{0x0000000000000002L,0x1000001000000000L});
    public static final BitSet FOLLOW_basic_expr_in_apply_expr4055 = new BitSet(new long[]{0x98C8000000000002L,0xF23004810007DF21L,0x0000000000000156L});
    public static final BitSet FOLLOW_p_basic_expr_in_p_apply_expr4073 = new BitSet(new long[]{0x98C8000000000002L,0xF23004810007DF21L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_p_apply_expr4076 = new BitSet(new long[]{0x98C8000000000000L,0xF23004810007DF21L,0x0000000000000156L});
    public static final BitSet FOLLOW_p_basic_expr_in_p_apply_expr4079 = new BitSet(new long[]{0x98C8000000000002L,0xF23004810007DF21L,0x0000000000000156L});
    public static final BitSet FOLLOW_message_send_expr_in_basic_expr4099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_message_send_expr_in_p_basic_expr4108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitive_expr_in_message_send_expr4117 = new BitSet(new long[]{0x0000000000000002L,0x1040000000000000L});
    public static final BitSet FOLLOW_NL_in_message_send_expr4120 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_PERIOD_in_message_send_expr4123 = new BitSet(new long[]{0x0000000000000000L,0x5000000000000000L});
    public static final BitSet FOLLOW_NL_in_message_send_expr4125 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_Id_in_message_send_expr4128 = new BitSet(new long[]{0x0000000000000002L,0x1040000000000000L});
    public static final BitSet FOLLOW_SQUARE_BRACKET_OPEN_in_list_expr4152 = new BitSet(new long[]{0x98E8000000000000L,0xF23004810007DF21L,0x0000000000000176L});
    public static final BitSet FOLLOW_NL_in_list_expr4154 = new BitSet(new long[]{0x98E8000000000000L,0xF23004810007DF21L,0x0000000000000176L});
    public static final BitSet FOLLOW_protected_expr_in_list_expr4158 = new BitSet(new long[]{0x0000000000000000L,0x1080000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_list_expr4161 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_COMMA_in_list_expr4164 = new BitSet(new long[]{0x98E8000000000000L,0xF23004810007DF21L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_list_expr4166 = new BitSet(new long[]{0x98E8000000000000L,0xF23004810007DF21L,0x0000000000000156L});
    public static final BitSet FOLLOW_protected_expr_in_list_expr4169 = new BitSet(new long[]{0x0000000000000000L,0x1080000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_list_expr4173 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_SQUARE_BRACKET_CLOSE_in_list_expr4178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROUND_BRACKET_OPEN_in_list_expr4192 = new BitSet(new long[]{0x98E8000000000000L,0xF23004810007DF21L,0x000000000000015EL});
    public static final BitSet FOLLOW_NL_in_list_expr4194 = new BitSet(new long[]{0x98E8000000000000L,0xF23004810007DF21L,0x000000000000015EL});
    public static final BitSet FOLLOW_protected_expr_in_list_expr4198 = new BitSet(new long[]{0x0000000000000000L,0x1080000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_NL_in_list_expr4201 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_COMMA_in_list_expr4204 = new BitSet(new long[]{0x98E8000000000000L,0xF23004810007DF21L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_list_expr4206 = new BitSet(new long[]{0x98E8000000000000L,0xF23004810007DF21L,0x0000000000000156L});
    public static final BitSet FOLLOW_protected_expr_in_list_expr4209 = new BitSet(new long[]{0x0000000000000000L,0x1080000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_NL_in_list_expr4213 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_COMMA_in_list_expr4217 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_NL_in_list_expr4219 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_ROUND_BRACKET_CLOSE_in_list_expr4226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURLY_BRACKET_OPEN_in_map_or_set_expr4255 = new BitSet(new long[]{0x98E8000000000000L,0xF23004810007DF21L,0x00000000000001D6L});
    public static final BitSet FOLLOW_NL_in_map_or_set_expr4257 = new BitSet(new long[]{0x98E8000000000000L,0xF23004810007DF21L,0x00000000000001D6L});
    public static final BitSet FOLLOW_map_or_set_elem_expr_in_map_or_set_expr4261 = new BitSet(new long[]{0x0000000000000000L,0x1080000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_NL_in_map_or_set_expr4263 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_COMMA_in_map_or_set_expr4267 = new BitSet(new long[]{0x98E8000000000000L,0xF23004810007DF21L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_map_or_set_expr4269 = new BitSet(new long[]{0x98E8000000000000L,0xF23004810007DF21L,0x0000000000000156L});
    public static final BitSet FOLLOW_map_or_set_elem_expr_in_map_or_set_expr4272 = new BitSet(new long[]{0x0000000000000000L,0x1080000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_NL_in_map_or_set_expr4274 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_CURLY_BRACKET_CLOSE_in_map_or_set_expr4281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURLY_BRACKET_OPEN_in_map_or_set_expr4301 = new BitSet(new long[]{0x0000000000000000L,0x100C000000000000L});
    public static final BitSet FOLLOW_NL_in_map_or_set_expr4303 = new BitSet(new long[]{0x0000000000000000L,0x000C000000000000L});
    public static final BitSet FOLLOW_token_ARROW_in_map_or_set_expr4306 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_NL_in_map_or_set_expr4308 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_CURLY_BRACKET_CLOSE_in_map_or_set_expr4311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protected_expr_in_map_or_set_elem_expr4328 = new BitSet(new long[]{0x0000000100000002L,0x100C000000000000L});
    public static final BitSet FOLLOW_NL_in_map_or_set_elem_expr4331 = new BitSet(new long[]{0x0000000100000000L,0x100C000000000000L});
    public static final BitSet FOLLOW_arrow_or_assign_in_map_or_set_elem_expr4334 = new BitSet(new long[]{0x98E8000000000000L,0xF23004810007DF21L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_map_or_set_elem_expr4336 = new BitSet(new long[]{0x98E8000000000000L,0xF23004810007DF21L,0x0000000000000156L});
    public static final BitSet FOLLOW_protected_expr_in_map_or_set_elem_expr4339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Num_in_primitive_expr4366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_String_in_primitive_expr4371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Id_in_primitive_expr4376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Constr_in_primitive_expr4381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_true_in_primitive_expr4386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_false_in_primitive_expr4391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_this_in_primitive_expr4396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_nil_in_primitive_expr4402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_infinity_in_primitive_expr4407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_list_expr_in_primitive_expr4413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_with_control_expr_in_primitive_expr4418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_map_or_set_expr_in_primitive_expr4423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_prog4433 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_prog4435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Id_in_synpred1_babel171590 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000002L});
    public static final BitSet FOLLOW_NL_in_synpred1_babel171592 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_L_as_in_synpred1_babel171595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protected_expr_in_synpred2_babel171626 = new BitSet(new long[]{0x0000000000000000L,0x1100000000000000L});
    public static final BitSet FOLLOW_NL_in_synpred2_babel171628 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_QUESTION_MARK_in_synpred2_babel171631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_synpred3_babel172387 = new BitSet(new long[]{0x0000000100000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_objelem_assign_in_synpred3_babel172391 = new BitSet(new long[]{0x0000000100000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_NL_in_synpred3_babel172394 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ASSIGN_in_synpred3_babel172397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_obj_in_synpred4_babel172608 = new BitSet(new long[]{0x0000000000000000L,0x1000000280000000L});
    public static final BitSet FOLLOW_NL_in_synpred4_babel172610 = new BitSet(new long[]{0x0000000000000000L,0x1000000280000000L});
    public static final BitSet FOLLOW_parents_in_synpred4_babel172613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_expr_in_synpred5_babel172682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protected_lambda_expr_in_synpred6_babel172703 = new BitSet(new long[]{0x0000000000000002L});

}