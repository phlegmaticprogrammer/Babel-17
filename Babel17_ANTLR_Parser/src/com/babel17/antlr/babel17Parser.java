// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g 2010-07-13 09:16:49

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PROG", "NIL_TOKEN", "ANY", "LAMBDA", "SQUARE_LIST", "ROUND_LIST", "LIST_CONS", "COMPARE", "APPLY", "IF", "MAP_OR_SET_OR_OBJ", "EMPTY_MAP", "EMPTY_OBJ", "EXCEPTION", "MATCH", "CASES", "OBJ", "FOR_EXPR", "WHILE_DO", "MESSAGE_SEND", "UMINUS", "POW", "PARENTS_PLUS", "PARENTS_MUL", "BLOCK", "BEGIN", "WITH", "VAL", "OBJELEM_ASSIGN", "ASSIGN", "ARROW", "DEF", "YIELD", "LAZY", "CONCURRENT", "MEMOIZE", "MEM_STRONG", "MEM_WEAK", "IF_PATTERN", "COMMENT1", "Newline", "NotNewline", "COMMENT2", "SmallLetter", "BigLetter", "Letter", "Digit", "Hex", "L_begin", "L_end", "L_obj", "L_with", "L_if", "L_then", "L_else", "L_elseif", "L_while", "L_for", "L_do", "L_yield", "L_match", "L_case", "L_as", "L_val", "L_def", "L_in", "L_exception", "L_to", "L_downto", "A_infinity", "U_infinity", "L_concurrent", "L_await", "L_lazy", "L_memoize", "L_true", "L_false", "L_this", "L_random", "A_EQUAL", "U_EQUAL", "A_NOT_EQUAL", "U_NOT_EQUAL", "LESS", "A_LESS_EQ", "U_LESS_EQ", "GREATER", "A_GREATER_EQ", "U_GREATER_EQ", "UNRELATED", "SC", "PLUS", "MINUS", "TIMES", "DIV", "MOD", "POW_tok", "A_OR", "A_AND", "A_NOT", "U_OR", "U_AND", "U_NOT", "A_DOUBLE_COLON", "U_DOUBLE_COLON", "TIMESTIMES", "PLUSPLUS", "MINUSMINUS", "A_DOUBLE_ARROW", "U_DOUBLE_ARROW", "A_ARROW", "U_ARROW", "A_ELLIPSIS", "U_ELLIPSIS", "PERIOD", "COMMA", "QUESTION_MARK", "TILDE", "WsChar", "WS", "NL", "Constr", "Id", "Num", "Charcode", "String", "ROUND_BRACKET_OPEN", "ROUND_BRACKET_CLOSE", "SQUARE_BRACKET_OPEN", "SQUARE_BRACKET_CLOSE", "CURLY_BRACKET_OPEN", "CURLY_BRACKET_CLOSE", "UNDERSCORE", "COLON"
    };
    public static final int U_AND=105;
    public static final int L_end=53;
    public static final int COMMENT1=43;
    public static final int COMMENT2=46;
    public static final int U_NOT_EQUAL=86;
    public static final int TIMESTIMES=109;
    public static final int BigLetter=48;
    public static final int ROUND_BRACKET_CLOSE=131;
    public static final int MOD=99;
    public static final int A_OR=101;
    public static final int MINUSMINUS=111;
    public static final int Newline=44;
    public static final int SQUARE_BRACKET_CLOSE=133;
    public static final int MAP_OR_SET_OR_OBJ=14;
    public static final int EOF=-1;
    public static final int U_DOUBLE_ARROW=113;
    public static final int L_exception=70;
    public static final int Num=127;
    public static final int EMPTY_MAP=15;
    public static final int GREATER=90;
    public static final int POW=25;
    public static final int L_concurrent=75;
    public static final int UNRELATED=93;
    public static final int L_await=76;
    public static final int L_false=80;
    public static final int BEGIN=29;
    public static final int LIST_CONS=10;
    public static final int L_with=55;
    public static final int QUESTION_MARK=120;
    public static final int LESS=87;
    public static final int ROUND_BRACKET_OPEN=130;
    public static final int SQUARE_LIST=8;
    public static final int VAL=31;
    public static final int L_as=66;
    public static final int NL=124;
    public static final int MESSAGE_SEND=23;
    public static final int A_ARROW=114;
    public static final int A_DOUBLE_COLON=107;
    public static final int L_def=68;
    public static final int A_AND=102;
    public static final int EXCEPTION=17;
    public static final int L_this=81;
    public static final int EMPTY_OBJ=16;
    public static final int PERIOD=118;
    public static final int SmallLetter=47;
    public static final int NIL_TOKEN=5;
    public static final int CURLY_BRACKET_OPEN=134;
    public static final int UNDERSCORE=136;
    public static final int MATCH=18;
    public static final int U_LESS_EQ=89;
    public static final int MEM_STRONG=40;
    public static final int L_to=71;
    public static final int WS=123;
    public static final int Charcode=128;
    public static final int L_do=62;
    public static final int L_val=67;
    public static final int L_match=64;
    public static final int L_obj=54;
    public static final int WsChar=122;
    public static final int Hex=51;
    public static final int CONCURRENT=38;
    public static final int L_for=61;
    public static final int Letter=49;
    public static final int APPLY=12;
    public static final int U_ARROW=115;
    public static final int L_else=58;
    public static final int A_EQUAL=83;
    public static final int DEF=35;
    public static final int L_begin=52;
    public static final int U_NOT=106;
    public static final int L_yield=63;
    public static final int PLUSPLUS=110;
    public static final int L_while=60;
    public static final int CASES=19;
    public static final int POW_tok=100;
    public static final int IF_PATTERN=42;
    public static final int A_ELLIPSIS=116;
    public static final int PARENTS_PLUS=26;
    public static final int A_DOUBLE_ARROW=112;
    public static final int SQUARE_BRACKET_OPEN=132;
    public static final int IF=13;
    public static final int PROG=4;
    public static final int U_OR=104;
    public static final int COMMA=119;
    public static final int OBJ=20;
    public static final int MEMOIZE=39;
    public static final int U_ELLIPSIS=117;
    public static final int TILDE=121;
    public static final int YIELD=36;
    public static final int COMPARE=11;
    public static final int U_GREATER_EQ=92;
    public static final int U_EQUAL=84;
    public static final int PLUS=95;
    public static final int String=129;
    public static final int LAMBDA=7;
    public static final int L_true=79;
    public static final int Id=126;
    public static final int A_infinity=73;
    public static final int WITH=30;
    public static final int L_in=69;
    public static final int A_NOT=103;
    public static final int LAZY=37;
    public static final int L_lazy=77;
    public static final int NotNewline=45;
    public static final int L_then=57;
    public static final int L_if=56;
    public static final int CURLY_BRACKET_CLOSE=135;
    public static final int UMINUS=24;
    public static final int FOR_EXPR=21;
    public static final int Constr=125;
    public static final int WHILE_DO=22;
    public static final int L_elseif=59;
    public static final int MINUS=96;
    public static final int Digit=50;
    public static final int L_memoize=78;
    public static final int MEM_WEAK=41;
    public static final int A_GREATER_EQ=91;
    public static final int ROUND_LIST=9;
    public static final int COLON=137;
    public static final int SC=94;
    public static final int L_downto=72;
    public static final int ANY=6;
    public static final int L_random=82;
    public static final int BLOCK=28;
    public static final int A_NOT_EQUAL=85;
    public static final int ASSIGN=33;
    public static final int U_DOUBLE_COLON=108;
    public static final int OBJELEM_ASSIGN=32;
    public static final int ARROW=34;
    public static final int L_case=65;
    public static final int DIV=98;
    public static final int TIMES=97;
    public static final int U_infinity=74;
    public static final int A_LESS_EQ=88;
    public static final int PARENTS_MUL=27;

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:176:1: token_infinity : ( A_infinity | U_infinity );
    public final babel17Parser.token_infinity_return token_infinity() throws RecognitionException {
        babel17Parser.token_infinity_return retval = new babel17Parser.token_infinity_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set1=null;

        CommonTree set1_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:177:2: ( A_infinity | U_infinity )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:202:1: token_EQUAL : ( A_EQUAL | U_EQUAL );
    public final babel17Parser.token_EQUAL_return token_EQUAL() throws RecognitionException {
        babel17Parser.token_EQUAL_return retval = new babel17Parser.token_EQUAL_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set2=null;

        CommonTree set2_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:203:2: ( A_EQUAL | U_EQUAL )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:210:1: token_NOT_EQUAL : ( A_NOT_EQUAL | U_NOT_EQUAL );
    public final babel17Parser.token_NOT_EQUAL_return token_NOT_EQUAL() throws RecognitionException {
        babel17Parser.token_NOT_EQUAL_return retval = new babel17Parser.token_NOT_EQUAL_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set3=null;

        CommonTree set3_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:211:2: ( A_NOT_EQUAL | U_NOT_EQUAL )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:219:1: token_LESS_EQ : ( A_LESS_EQ | U_LESS_EQ );
    public final babel17Parser.token_LESS_EQ_return token_LESS_EQ() throws RecognitionException {
        babel17Parser.token_LESS_EQ_return retval = new babel17Parser.token_LESS_EQ_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set4=null;

        CommonTree set4_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:220:2: ( A_LESS_EQ | U_LESS_EQ )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:229:1: token_GREATER_EQ : ( A_GREATER_EQ | U_GREATER_EQ );
    public final babel17Parser.token_GREATER_EQ_return token_GREATER_EQ() throws RecognitionException {
        babel17Parser.token_GREATER_EQ_return retval = new babel17Parser.token_GREATER_EQ_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set5=null;

        CommonTree set5_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:230:2: ( A_GREATER_EQ | U_GREATER_EQ )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:251:1: token_OR : ( A_OR | U_OR );
    public final babel17Parser.token_OR_return token_OR() throws RecognitionException {
        babel17Parser.token_OR_return retval = new babel17Parser.token_OR_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set6=null;

        CommonTree set6_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:251:9: ( A_OR | U_OR )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:252:1: token_AND : ( A_AND | U_AND );
    public final babel17Parser.token_AND_return token_AND() throws RecognitionException {
        babel17Parser.token_AND_return retval = new babel17Parser.token_AND_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set7=null;

        CommonTree set7_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:253:2: ( A_AND | U_AND )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:254:1: token_NOT : ( A_NOT | U_NOT );
    public final babel17Parser.token_NOT_return token_NOT() throws RecognitionException {
        babel17Parser.token_NOT_return retval = new babel17Parser.token_NOT_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set8=null;

        CommonTree set8_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:255:2: ( A_NOT | U_NOT )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:261:1: token_DOUBLE_COLON : ( A_DOUBLE_COLON | U_DOUBLE_COLON );
    public final babel17Parser.token_DOUBLE_COLON_return token_DOUBLE_COLON() throws RecognitionException {
        babel17Parser.token_DOUBLE_COLON_return retval = new babel17Parser.token_DOUBLE_COLON_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set9=null;

        CommonTree set9_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:262:2: ( A_DOUBLE_COLON | U_DOUBLE_COLON )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:277:1: token_DOUBLE_ARROW : ( A_DOUBLE_ARROW | U_DOUBLE_ARROW );
    public final babel17Parser.token_DOUBLE_ARROW_return token_DOUBLE_ARROW() throws RecognitionException {
        babel17Parser.token_DOUBLE_ARROW_return retval = new babel17Parser.token_DOUBLE_ARROW_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set10=null;

        CommonTree set10_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:278:2: ( A_DOUBLE_ARROW | U_DOUBLE_ARROW )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:282:1: token_ARROW : ( A_ARROW | U_ARROW );
    public final babel17Parser.token_ARROW_return token_ARROW() throws RecognitionException {
        babel17Parser.token_ARROW_return retval = new babel17Parser.token_ARROW_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set11=null;

        CommonTree set11_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:283:2: ( A_ARROW | U_ARROW )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:288:1: token_ELLIPSIS : ( A_ELLIPSIS | U_ELLIPSIS );
    public final babel17Parser.token_ELLIPSIS_return token_ELLIPSIS() throws RecognitionException {
        babel17Parser.token_ELLIPSIS_return retval = new babel17Parser.token_ELLIPSIS_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set12=null;

        CommonTree set12_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:289:2: ( A_ELLIPSIS | U_ELLIPSIS )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:348:1: pattern : ( Constr ( ( NL )? primitive_pattern )? -> ^( Constr ( primitive_pattern )? ) | primitive_pattern ( ( NL )? token_DOUBLE_COLON ( NL )? primitive_pattern )* -> ^( LIST_CONS ( primitive_pattern )* ) );
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:348:9: ( Constr ( ( NL )? primitive_pattern )? -> ^( Constr ( primitive_pattern )? ) | primitive_pattern ( ( NL )? token_DOUBLE_COLON ( NL )? primitive_pattern )* -> ^( LIST_CONS ( primitive_pattern )* ) )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:348:11: Constr ( ( NL )? primitive_pattern )?
                    {
                    Constr13=(Token)match(input,Constr,FOLLOW_Constr_in_pattern1501); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Constr.add(Constr13);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:348:18: ( ( NL )? primitive_pattern )?
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
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:348:19: ( NL )? primitive_pattern
                            {
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:348:19: ( NL )?
                            int alt1=2;
                            int LA1_0 = input.LA(1);

                            if ( (LA1_0==NL) ) {
                                alt1=1;
                            }
                            switch (alt1) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:348:19: NL
                                    {
                                    NL14=(Token)match(input,NL,FOLLOW_NL_in_pattern1504); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL14);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_primitive_pattern_in_pattern1507);
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
                    // 348:43: -> ^( Constr ( primitive_pattern )? )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:348:46: ^( Constr ( primitive_pattern )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_Constr.nextNode(), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:348:55: ( primitive_pattern )?
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:349:4: primitive_pattern ( ( NL )? token_DOUBLE_COLON ( NL )? primitive_pattern )*
                    {
                    pushFollow(FOLLOW_primitive_pattern_in_pattern1523);
                    primitive_pattern16=primitive_pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primitive_pattern.add(primitive_pattern16.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:349:22: ( ( NL )? token_DOUBLE_COLON ( NL )? primitive_pattern )*
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
                    	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:349:23: ( NL )? token_DOUBLE_COLON ( NL )? primitive_pattern
                    	    {
                    	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:349:23: ( NL )?
                    	    int alt3=2;
                    	    int LA3_0 = input.LA(1);

                    	    if ( (LA3_0==NL) ) {
                    	        alt3=1;
                    	    }
                    	    switch (alt3) {
                    	        case 1 :
                    	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:349:23: NL
                    	            {
                    	            NL17=(Token)match(input,NL,FOLLOW_NL_in_pattern1526); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_NL.add(NL17);


                    	            }
                    	            break;

                    	    }

                    	    pushFollow(FOLLOW_token_DOUBLE_COLON_in_pattern1529);
                    	    token_DOUBLE_COLON18=token_DOUBLE_COLON();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_token_DOUBLE_COLON.add(token_DOUBLE_COLON18.getTree());
                    	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:349:46: ( NL )?
                    	    int alt4=2;
                    	    int LA4_0 = input.LA(1);

                    	    if ( (LA4_0==NL) ) {
                    	        alt4=1;
                    	    }
                    	    switch (alt4) {
                    	        case 1 :
                    	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:349:46: NL
                    	            {
                    	            NL19=(Token)match(input,NL,FOLLOW_NL_in_pattern1531); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_NL.add(NL19);


                    	            }
                    	            break;

                    	    }

                    	    pushFollow(FOLLOW_primitive_pattern_in_pattern1534);
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
                    // 350:3: -> ^( LIST_CONS ( primitive_pattern )* )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:350:6: ^( LIST_CONS ( primitive_pattern )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LIST_CONS, "LIST_CONS"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:350:18: ( primitive_pattern )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:352:1: bracket_pattern : ( ( Id ( NL )? L_as )=> Id ( NL )? L_as ( NL )? pattern -> ^( L_as Id pattern ) | ( protected_expr ( NL )? QUESTION_MARK )=> protected_expr ( NL )? QUESTION_MARK ( ( NL )? pattern )? -> ^( QUESTION_MARK protected_expr ( pattern )? ) | pattern ( ( NL )? L_if ( NL )? protected_expr )? -> ^( IF_PATTERN pattern ( protected_expr )? ) | L_val ( NL )? protected_expr -> ^( L_val protected_expr ) | token_ELLIPSIS );
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:353:2: ( ( Id ( NL )? L_as )=> Id ( NL )? L_as ( NL )? pattern -> ^( L_as Id pattern ) | ( protected_expr ( NL )? QUESTION_MARK )=> protected_expr ( NL )? QUESTION_MARK ( ( NL )? pattern )? -> ^( QUESTION_MARK protected_expr ( pattern )? ) | pattern ( ( NL )? L_if ( NL )? protected_expr )? -> ^( IF_PATTERN pattern ( protected_expr )? ) | L_val ( NL )? protected_expr -> ^( L_val protected_expr ) | token_ELLIPSIS )
            int alt16=5;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:353:10: ( Id ( NL )? L_as )=> Id ( NL )? L_as ( NL )? pattern
                    {
                    Id21=(Token)match(input,Id,FOLLOW_Id_in_bracket_pattern1575); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Id.add(Id21);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:353:30: ( NL )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==NL) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:353:30: NL
                            {
                            NL22=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1577); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL22);


                            }
                            break;

                    }

                    L_as23=(Token)match(input,L_as,FOLLOW_L_as_in_bracket_pattern1580); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_as.add(L_as23);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:353:39: ( NL )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==NL) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:353:39: NL
                            {
                            NL24=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1582); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL24);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_pattern_in_bracket_pattern1585);
                    pattern25=pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pattern.add(pattern25.getTree());


                    // AST REWRITE
                    // elements: pattern, L_as, Id
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 353:51: -> ^( L_as Id pattern )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:353:54: ^( L_as Id pattern )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:354:4: ( protected_expr ( NL )? QUESTION_MARK )=> protected_expr ( NL )? QUESTION_MARK ( ( NL )? pattern )?
                    {
                    pushFollow(FOLLOW_protected_expr_in_bracket_pattern1614);
                    protected_expr26=protected_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr26.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:355:18: ( NL )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==NL) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:355:18: NL
                            {
                            NL27=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1616); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL27);


                            }
                            break;

                    }

                    QUESTION_MARK28=(Token)match(input,QUESTION_MARK,FOLLOW_QUESTION_MARK_in_bracket_pattern1619); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QUESTION_MARK.add(QUESTION_MARK28);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:355:36: ( ( NL )? pattern )?
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
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:355:37: ( NL )? pattern
                            {
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:355:37: ( NL )?
                            int alt10=2;
                            int LA10_0 = input.LA(1);

                            if ( (LA10_0==NL) ) {
                                alt10=1;
                            }
                            switch (alt10) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:355:37: NL
                                    {
                                    NL29=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1622); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL29);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_pattern_in_bracket_pattern1625);
                            pattern30=pattern();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_pattern.add(pattern30.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: QUESTION_MARK, pattern, protected_expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 355:51: -> ^( QUESTION_MARK protected_expr ( pattern )? )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:355:54: ^( QUESTION_MARK protected_expr ( pattern )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_QUESTION_MARK.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_protected_expr.nextTree());
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:355:85: ( pattern )?
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:356:4: pattern ( ( NL )? L_if ( NL )? protected_expr )?
                    {
                    pushFollow(FOLLOW_pattern_in_bracket_pattern1643);
                    pattern31=pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pattern.add(pattern31.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:356:12: ( ( NL )? L_if ( NL )? protected_expr )?
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
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:356:13: ( NL )? L_if ( NL )? protected_expr
                            {
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:356:13: ( NL )?
                            int alt12=2;
                            int LA12_0 = input.LA(1);

                            if ( (LA12_0==NL) ) {
                                alt12=1;
                            }
                            switch (alt12) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:356:13: NL
                                    {
                                    NL32=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1646); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL32);


                                    }
                                    break;

                            }

                            L_if33=(Token)match(input,L_if,FOLLOW_L_if_in_bracket_pattern1649); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_L_if.add(L_if33);

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:356:22: ( NL )?
                            int alt13=2;
                            int LA13_0 = input.LA(1);

                            if ( (LA13_0==NL) ) {
                                alt13=1;
                            }
                            switch (alt13) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:356:22: NL
                                    {
                                    NL34=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1651); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL34);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_protected_expr_in_bracket_pattern1654);
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
                    // 356:43: -> ^( IF_PATTERN pattern ( protected_expr )? )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:356:46: ^( IF_PATTERN pattern ( protected_expr )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IF_PATTERN, "IF_PATTERN"), root_1);

                        adaptor.addChild(root_1, stream_pattern.nextTree());
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:356:67: ( protected_expr )?
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:357:4: L_val ( NL )? protected_expr
                    {
                    L_val36=(Token)match(input,L_val,FOLLOW_L_val_in_bracket_pattern1672); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_val.add(L_val36);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:357:10: ( NL )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==NL) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:357:10: NL
                            {
                            NL37=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1674); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL37);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_protected_expr_in_bracket_pattern1677);
                    protected_expr38=protected_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr38.getTree());


                    // AST REWRITE
                    // elements: protected_expr, L_val
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 357:29: -> ^( L_val protected_expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:357:32: ^( L_val protected_expr )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:358:4: token_ELLIPSIS
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_ELLIPSIS_in_bracket_pattern1690);
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

    public static class arrow_or_assign_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arrow_or_assign"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:360:1: arrow_or_assign : ( token_ARROW -> ^( ARROW ) | ASSIGN -> ^( ASSIGN ) );
    public final babel17Parser.arrow_or_assign_return arrow_or_assign() throws RecognitionException {
        babel17Parser.arrow_or_assign_return retval = new babel17Parser.arrow_or_assign_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ASSIGN41=null;
        babel17Parser.token_ARROW_return token_ARROW40 = null;


        CommonTree ASSIGN41_tree=null;
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_token_ARROW=new RewriteRuleSubtreeStream(adaptor,"rule token_ARROW");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:361:2: ( token_ARROW -> ^( ARROW ) | ASSIGN -> ^( ASSIGN ) )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:361:4: token_ARROW
                    {
                    pushFollow(FOLLOW_token_ARROW_in_arrow_or_assign1700);
                    token_ARROW40=token_ARROW();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_token_ARROW.add(token_ARROW40.getTree());


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
                    // 361:16: -> ^( ARROW )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:361:19: ^( ARROW )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:362:4: ASSIGN
                    {
                    ASSIGN41=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_arrow_or_assign1711); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN41);



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
                    // 362:11: -> ^( ASSIGN )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:362:14: ^( ASSIGN )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:364:1: mselem_pattern : bracket_pattern ( ( NL )? arrow_or_assign ( NL )? bracket_pattern )? -> ^( NIL_TOKEN ^( NIL_TOKEN ( bracket_pattern )* ) ( arrow_or_assign )* ) ;
    public final babel17Parser.mselem_pattern_return mselem_pattern() throws RecognitionException {
        babel17Parser.mselem_pattern_return retval = new babel17Parser.mselem_pattern_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL43=null;
        Token NL45=null;
        babel17Parser.bracket_pattern_return bracket_pattern42 = null;

        babel17Parser.arrow_or_assign_return arrow_or_assign44 = null;

        babel17Parser.bracket_pattern_return bracket_pattern46 = null;


        CommonTree NL43_tree=null;
        CommonTree NL45_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_arrow_or_assign=new RewriteRuleSubtreeStream(adaptor,"rule arrow_or_assign");
        RewriteRuleSubtreeStream stream_bracket_pattern=new RewriteRuleSubtreeStream(adaptor,"rule bracket_pattern");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:365:2: ( bracket_pattern ( ( NL )? arrow_or_assign ( NL )? bracket_pattern )? -> ^( NIL_TOKEN ^( NIL_TOKEN ( bracket_pattern )* ) ( arrow_or_assign )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:365:4: bracket_pattern ( ( NL )? arrow_or_assign ( NL )? bracket_pattern )?
            {
            pushFollow(FOLLOW_bracket_pattern_in_mselem_pattern1726);
            bracket_pattern42=bracket_pattern();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bracket_pattern.add(bracket_pattern42.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:365:20: ( ( NL )? arrow_or_assign ( NL )? bracket_pattern )?
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:365:21: ( NL )? arrow_or_assign ( NL )? bracket_pattern
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:365:21: ( NL )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==NL) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:365:21: NL
                            {
                            NL43=(Token)match(input,NL,FOLLOW_NL_in_mselem_pattern1729); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL43);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_arrow_or_assign_in_mselem_pattern1732);
                    arrow_or_assign44=arrow_or_assign();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_arrow_or_assign.add(arrow_or_assign44.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:365:41: ( NL )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==NL) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:365:41: NL
                            {
                            NL45=(Token)match(input,NL,FOLLOW_NL_in_mselem_pattern1734); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL45);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_bracket_pattern_in_mselem_pattern1737);
                    bracket_pattern46=bracket_pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_bracket_pattern.add(bracket_pattern46.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: bracket_pattern, arrow_or_assign
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 366:3: -> ^( NIL_TOKEN ^( NIL_TOKEN ( bracket_pattern )* ) ( arrow_or_assign )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:366:6: ^( NIL_TOKEN ^( NIL_TOKEN ( bracket_pattern )* ) ( arrow_or_assign )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:366:18: ^( NIL_TOKEN ( bracket_pattern )* )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_2);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:366:30: ( bracket_pattern )*
                while ( stream_bracket_pattern.hasNext() ) {
                    adaptor.addChild(root_2, stream_bracket_pattern.nextTree());

                }
                stream_bracket_pattern.reset();

                adaptor.addChild(root_1, root_2);
                }
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:366:48: ( arrow_or_assign )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:368:1: primitive_pattern : ( Id | '_' -> ANY | String | Num | L_true | L_false | token_infinity | '-' ( NL )? token_infinity -> ^( UMINUS token_infinity ) | '-' ( NL )? Num -> ^( UMINUS Num ) | '[' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* )? ']' -> ^( SQUARE_LIST ( bracket_pattern )* ) | '(' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* ( COMMA ( NL )? )? )? ')' -> ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( bracket_pattern )* ) ) | '{' ( NL )? ( mselem_pattern ( NL )? ( COMMA ( NL )? mselem_pattern ( NL )? )* )? '}' -> ^( MAP_OR_SET_OR_OBJ ( mselem_pattern )* ) | '{' ( NL )? token_ARROW ( NL )? '}' -> ^( EMPTY_MAP ) | '{' ( NL )? ASSIGN ( NL )? '}' -> ^( EMPTY_OBJ ) );
    public final babel17Parser.primitive_pattern_return primitive_pattern() throws RecognitionException {
        babel17Parser.primitive_pattern_return retval = new babel17Parser.primitive_pattern_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Id47=null;
        Token char_literal48=null;
        Token String49=null;
        Token Num50=null;
        Token L_true51=null;
        Token L_false52=null;
        Token char_literal54=null;
        Token NL55=null;
        Token char_literal57=null;
        Token NL58=null;
        Token Num59=null;
        Token char_literal60=null;
        Token NL61=null;
        Token NL63=null;
        Token COMMA64=null;
        Token NL65=null;
        Token NL67=null;
        Token char_literal68=null;
        Token char_literal69=null;
        Token NL70=null;
        Token NL72=null;
        Token COMMA73=null;
        Token NL74=null;
        Token NL76=null;
        Token COMMA77=null;
        Token NL78=null;
        Token char_literal79=null;
        Token char_literal80=null;
        Token NL81=null;
        Token NL83=null;
        Token COMMA84=null;
        Token NL85=null;
        Token NL87=null;
        Token char_literal88=null;
        Token char_literal89=null;
        Token NL90=null;
        Token NL92=null;
        Token char_literal93=null;
        Token char_literal94=null;
        Token NL95=null;
        Token ASSIGN96=null;
        Token NL97=null;
        Token char_literal98=null;
        babel17Parser.token_infinity_return token_infinity53 = null;

        babel17Parser.token_infinity_return token_infinity56 = null;

        babel17Parser.bracket_pattern_return bracket_pattern62 = null;

        babel17Parser.bracket_pattern_return bracket_pattern66 = null;

        babel17Parser.bracket_pattern_return bracket_pattern71 = null;

        babel17Parser.bracket_pattern_return bracket_pattern75 = null;

        babel17Parser.mselem_pattern_return mselem_pattern82 = null;

        babel17Parser.mselem_pattern_return mselem_pattern86 = null;

        babel17Parser.token_ARROW_return token_ARROW91 = null;


        CommonTree Id47_tree=null;
        CommonTree char_literal48_tree=null;
        CommonTree String49_tree=null;
        CommonTree Num50_tree=null;
        CommonTree L_true51_tree=null;
        CommonTree L_false52_tree=null;
        CommonTree char_literal54_tree=null;
        CommonTree NL55_tree=null;
        CommonTree char_literal57_tree=null;
        CommonTree NL58_tree=null;
        CommonTree Num59_tree=null;
        CommonTree char_literal60_tree=null;
        CommonTree NL61_tree=null;
        CommonTree NL63_tree=null;
        CommonTree COMMA64_tree=null;
        CommonTree NL65_tree=null;
        CommonTree NL67_tree=null;
        CommonTree char_literal68_tree=null;
        CommonTree char_literal69_tree=null;
        CommonTree NL70_tree=null;
        CommonTree NL72_tree=null;
        CommonTree COMMA73_tree=null;
        CommonTree NL74_tree=null;
        CommonTree NL76_tree=null;
        CommonTree COMMA77_tree=null;
        CommonTree NL78_tree=null;
        CommonTree char_literal79_tree=null;
        CommonTree char_literal80_tree=null;
        CommonTree NL81_tree=null;
        CommonTree NL83_tree=null;
        CommonTree COMMA84_tree=null;
        CommonTree NL85_tree=null;
        CommonTree NL87_tree=null;
        CommonTree char_literal88_tree=null;
        CommonTree char_literal89_tree=null;
        CommonTree NL90_tree=null;
        CommonTree NL92_tree=null;
        CommonTree char_literal93_tree=null;
        CommonTree char_literal94_tree=null;
        CommonTree NL95_tree=null;
        CommonTree ASSIGN96_tree=null;
        CommonTree NL97_tree=null;
        CommonTree char_literal98_tree=null;
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
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_mselem_pattern=new RewriteRuleSubtreeStream(adaptor,"rule mselem_pattern");
        RewriteRuleSubtreeStream stream_token_ARROW=new RewriteRuleSubtreeStream(adaptor,"rule token_ARROW");
        RewriteRuleSubtreeStream stream_token_infinity=new RewriteRuleSubtreeStream(adaptor,"rule token_infinity");
        RewriteRuleSubtreeStream stream_bracket_pattern=new RewriteRuleSubtreeStream(adaptor,"rule bracket_pattern");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:369:2: ( Id | '_' -> ANY | String | Num | L_true | L_false | token_infinity | '-' ( NL )? token_infinity -> ^( UMINUS token_infinity ) | '-' ( NL )? Num -> ^( UMINUS Num ) | '[' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* )? ']' -> ^( SQUARE_LIST ( bracket_pattern )* ) | '(' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* ( COMMA ( NL )? )? )? ')' -> ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( bracket_pattern )* ) ) | '{' ( NL )? ( mselem_pattern ( NL )? ( COMMA ( NL )? mselem_pattern ( NL )? )* )? '}' -> ^( MAP_OR_SET_OR_OBJ ( mselem_pattern )* ) | '{' ( NL )? token_ARROW ( NL )? '}' -> ^( EMPTY_MAP ) | '{' ( NL )? ASSIGN ( NL )? '}' -> ^( EMPTY_OBJ ) )
            int alt47=14;
            alt47 = dfa47.predict(input);
            switch (alt47) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:369:4: Id
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Id47=(Token)match(input,Id,FOLLOW_Id_in_primitive_pattern1766); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Id47_tree = (CommonTree)adaptor.create(Id47);
                    adaptor.addChild(root_0, Id47_tree);
                    }

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:370:4: '_'
                    {
                    char_literal48=(Token)match(input,UNDERSCORE,FOLLOW_UNDERSCORE_in_primitive_pattern1771); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_UNDERSCORE.add(char_literal48);



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
                    // 370:8: -> ANY
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(ANY, "ANY"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:371:4: String
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    String49=(Token)match(input,String,FOLLOW_String_in_primitive_pattern1780); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    String49_tree = (CommonTree)adaptor.create(String49);
                    adaptor.addChild(root_0, String49_tree);
                    }

                    }
                    break;
                case 4 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:372:4: Num
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Num50=(Token)match(input,Num,FOLLOW_Num_in_primitive_pattern1785); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Num50_tree = (CommonTree)adaptor.create(Num50);
                    adaptor.addChild(root_0, Num50_tree);
                    }

                    }
                    break;
                case 5 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:373:4: L_true
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    L_true51=(Token)match(input,L_true,FOLLOW_L_true_in_primitive_pattern1790); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    L_true51_tree = (CommonTree)adaptor.create(L_true51);
                    adaptor.addChild(root_0, L_true51_tree);
                    }

                    }
                    break;
                case 6 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:374:4: L_false
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    L_false52=(Token)match(input,L_false,FOLLOW_L_false_in_primitive_pattern1795); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    L_false52_tree = (CommonTree)adaptor.create(L_false52);
                    adaptor.addChild(root_0, L_false52_tree);
                    }

                    }
                    break;
                case 7 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:375:4: token_infinity
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_infinity_in_primitive_pattern1800);
                    token_infinity53=token_infinity();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, token_infinity53.getTree());

                    }
                    break;
                case 8 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:376:4: '-' ( NL )? token_infinity
                    {
                    char_literal54=(Token)match(input,MINUS,FOLLOW_MINUS_in_primitive_pattern1805); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(char_literal54);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:376:8: ( NL )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==NL) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:376:8: NL
                            {
                            NL55=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern1807); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL55);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_token_infinity_in_primitive_pattern1810);
                    token_infinity56=token_infinity();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_token_infinity.add(token_infinity56.getTree());


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
                    // 376:27: -> ^( UMINUS token_infinity )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:376:30: ^( UMINUS token_infinity )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:377:4: '-' ( NL )? Num
                    {
                    char_literal57=(Token)match(input,MINUS,FOLLOW_MINUS_in_primitive_pattern1823); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(char_literal57);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:377:8: ( NL )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==NL) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:377:8: NL
                            {
                            NL58=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern1825); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL58);


                            }
                            break;

                    }

                    Num59=(Token)match(input,Num,FOLLOW_Num_in_primitive_pattern1828); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Num.add(Num59);



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
                    // 377:16: -> ^( UMINUS Num )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:377:19: ^( UMINUS Num )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:378:4: '[' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* )? ']'
                    {
                    char_literal60=(Token)match(input,SQUARE_BRACKET_OPEN,FOLLOW_SQUARE_BRACKET_OPEN_in_primitive_pattern1841); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SQUARE_BRACKET_OPEN.add(char_literal60);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:378:9: ( NL )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==NL) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:378:9: NL
                            {
                            NL61=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern1844); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL61);


                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:378:13: ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==L_begin||(LA28_0>=L_obj && LA28_0<=L_if)||(LA28_0>=L_while && LA28_0<=L_for)||(LA28_0>=L_match && LA28_0<=L_case)||LA28_0==L_val||LA28_0==L_exception||(LA28_0>=A_infinity && LA28_0<=L_lazy)||(LA28_0>=L_true && LA28_0<=L_random)||LA28_0==MINUS||LA28_0==A_NOT||LA28_0==U_NOT||(LA28_0>=A_ELLIPSIS && LA28_0<=U_ELLIPSIS)||LA28_0==TILDE||(LA28_0>=Constr && LA28_0<=Num)||(LA28_0>=String && LA28_0<=ROUND_BRACKET_OPEN)||LA28_0==SQUARE_BRACKET_OPEN||LA28_0==CURLY_BRACKET_OPEN||LA28_0==UNDERSCORE) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:378:14: bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )*
                            {
                            pushFollow(FOLLOW_bracket_pattern_in_primitive_pattern1848);
                            bracket_pattern62=bracket_pattern();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_bracket_pattern.add(bracket_pattern62.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:378:30: ( NL )?
                            int alt24=2;
                            int LA24_0 = input.LA(1);

                            if ( (LA24_0==NL) ) {
                                alt24=1;
                            }
                            switch (alt24) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:378:30: NL
                                    {
                                    NL63=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern1850); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL63);


                                    }
                                    break;

                            }

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:378:34: ( COMMA ( NL )? bracket_pattern ( NL )? )*
                            loop27:
                            do {
                                int alt27=2;
                                int LA27_0 = input.LA(1);

                                if ( (LA27_0==COMMA) ) {
                                    alt27=1;
                                }


                                switch (alt27) {
                            	case 1 :
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:378:36: COMMA ( NL )? bracket_pattern ( NL )?
                            	    {
                            	    COMMA64=(Token)match(input,COMMA,FOLLOW_COMMA_in_primitive_pattern1855); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA64);

                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:378:42: ( NL )?
                            	    int alt25=2;
                            	    int LA25_0 = input.LA(1);

                            	    if ( (LA25_0==NL) ) {
                            	        alt25=1;
                            	    }
                            	    switch (alt25) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:378:42: NL
                            	            {
                            	            NL65=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern1857); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL65);


                            	            }
                            	            break;

                            	    }

                            	    pushFollow(FOLLOW_bracket_pattern_in_primitive_pattern1860);
                            	    bracket_pattern66=bracket_pattern();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_bracket_pattern.add(bracket_pattern66.getTree());
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:378:62: ( NL )?
                            	    int alt26=2;
                            	    int LA26_0 = input.LA(1);

                            	    if ( (LA26_0==NL) ) {
                            	        alt26=1;
                            	    }
                            	    switch (alt26) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:378:62: NL
                            	            {
                            	            NL67=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern1862); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL67);


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

                    char_literal68=(Token)match(input,SQUARE_BRACKET_CLOSE,FOLLOW_SQUARE_BRACKET_CLOSE_in_primitive_pattern1870); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SQUARE_BRACKET_CLOSE.add(char_literal68);



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
                    // 379:6: -> ^( SQUARE_LIST ( bracket_pattern )* )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:379:9: ^( SQUARE_LIST ( bracket_pattern )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SQUARE_LIST, "SQUARE_LIST"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:379:23: ( bracket_pattern )*
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:380:4: '(' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* ( COMMA ( NL )? )? )? ')'
                    {
                    char_literal69=(Token)match(input,ROUND_BRACKET_OPEN,FOLLOW_ROUND_BRACKET_OPEN_in_primitive_pattern1890); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ROUND_BRACKET_OPEN.add(char_literal69);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:380:9: ( NL )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==NL) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:380:9: NL
                            {
                            NL70=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern1893); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL70);


                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:380:13: ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* ( COMMA ( NL )? )? )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==L_begin||(LA36_0>=L_obj && LA36_0<=L_if)||(LA36_0>=L_while && LA36_0<=L_for)||(LA36_0>=L_match && LA36_0<=L_case)||LA36_0==L_val||LA36_0==L_exception||(LA36_0>=A_infinity && LA36_0<=L_lazy)||(LA36_0>=L_true && LA36_0<=L_random)||LA36_0==MINUS||LA36_0==A_NOT||LA36_0==U_NOT||(LA36_0>=A_ELLIPSIS && LA36_0<=U_ELLIPSIS)||LA36_0==TILDE||(LA36_0>=Constr && LA36_0<=Num)||(LA36_0>=String && LA36_0<=ROUND_BRACKET_OPEN)||LA36_0==SQUARE_BRACKET_OPEN||LA36_0==CURLY_BRACKET_OPEN||LA36_0==UNDERSCORE) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:380:14: bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* ( COMMA ( NL )? )?
                            {
                            pushFollow(FOLLOW_bracket_pattern_in_primitive_pattern1897);
                            bracket_pattern71=bracket_pattern();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_bracket_pattern.add(bracket_pattern71.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:380:30: ( NL )?
                            int alt30=2;
                            int LA30_0 = input.LA(1);

                            if ( (LA30_0==NL) ) {
                                alt30=1;
                            }
                            switch (alt30) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:380:30: NL
                                    {
                                    NL72=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern1899); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL72);


                                    }
                                    break;

                            }

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:380:34: ( COMMA ( NL )? bracket_pattern ( NL )? )*
                            loop33:
                            do {
                                int alt33=2;
                                int LA33_0 = input.LA(1);

                                if ( (LA33_0==COMMA) ) {
                                    int LA33_1 = input.LA(2);

                                    if ( (LA33_1==NL) ) {
                                        int LA33_3 = input.LA(3);

                                        if ( (LA33_3==L_begin||(LA33_3>=L_obj && LA33_3<=L_if)||(LA33_3>=L_while && LA33_3<=L_for)||(LA33_3>=L_match && LA33_3<=L_case)||LA33_3==L_val||LA33_3==L_exception||(LA33_3>=A_infinity && LA33_3<=L_lazy)||(LA33_3>=L_true && LA33_3<=L_random)||LA33_3==MINUS||LA33_3==A_NOT||LA33_3==U_NOT||(LA33_3>=A_ELLIPSIS && LA33_3<=U_ELLIPSIS)||LA33_3==TILDE||(LA33_3>=Constr && LA33_3<=Num)||(LA33_3>=String && LA33_3<=ROUND_BRACKET_OPEN)||LA33_3==SQUARE_BRACKET_OPEN||LA33_3==CURLY_BRACKET_OPEN||LA33_3==UNDERSCORE) ) {
                                            alt33=1;
                                        }


                                    }
                                    else if ( (LA33_1==L_begin||(LA33_1>=L_obj && LA33_1<=L_if)||(LA33_1>=L_while && LA33_1<=L_for)||(LA33_1>=L_match && LA33_1<=L_case)||LA33_1==L_val||LA33_1==L_exception||(LA33_1>=A_infinity && LA33_1<=L_lazy)||(LA33_1>=L_true && LA33_1<=L_random)||LA33_1==MINUS||LA33_1==A_NOT||LA33_1==U_NOT||(LA33_1>=A_ELLIPSIS && LA33_1<=U_ELLIPSIS)||LA33_1==TILDE||(LA33_1>=Constr && LA33_1<=Num)||(LA33_1>=String && LA33_1<=ROUND_BRACKET_OPEN)||LA33_1==SQUARE_BRACKET_OPEN||LA33_1==CURLY_BRACKET_OPEN||LA33_1==UNDERSCORE) ) {
                                        alt33=1;
                                    }


                                }


                                switch (alt33) {
                            	case 1 :
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:380:36: COMMA ( NL )? bracket_pattern ( NL )?
                            	    {
                            	    COMMA73=(Token)match(input,COMMA,FOLLOW_COMMA_in_primitive_pattern1904); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA73);

                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:380:43: ( NL )?
                            	    int alt31=2;
                            	    int LA31_0 = input.LA(1);

                            	    if ( (LA31_0==NL) ) {
                            	        alt31=1;
                            	    }
                            	    switch (alt31) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:380:43: NL
                            	            {
                            	            NL74=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern1907); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL74);


                            	            }
                            	            break;

                            	    }

                            	    pushFollow(FOLLOW_bracket_pattern_in_primitive_pattern1910);
                            	    bracket_pattern75=bracket_pattern();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_bracket_pattern.add(bracket_pattern75.getTree());
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:380:63: ( NL )?
                            	    int alt32=2;
                            	    int LA32_0 = input.LA(1);

                            	    if ( (LA32_0==NL) ) {
                            	        alt32=1;
                            	    }
                            	    switch (alt32) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:380:63: NL
                            	            {
                            	            NL76=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern1912); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL76);


                            	            }
                            	            break;

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop33;
                                }
                            } while (true);

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:380:69: ( COMMA ( NL )? )?
                            int alt35=2;
                            int LA35_0 = input.LA(1);

                            if ( (LA35_0==COMMA) ) {
                                alt35=1;
                            }
                            switch (alt35) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:380:70: COMMA ( NL )?
                                    {
                                    COMMA77=(Token)match(input,COMMA,FOLLOW_COMMA_in_primitive_pattern1918); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_COMMA.add(COMMA77);

                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:380:76: ( NL )?
                                    int alt34=2;
                                    int LA34_0 = input.LA(1);

                                    if ( (LA34_0==NL) ) {
                                        alt34=1;
                                    }
                                    switch (alt34) {
                                        case 1 :
                                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:380:76: NL
                                            {
                                            NL78=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern1920); if (state.failed) return retval; 
                                            if ( state.backtracking==0 ) stream_NL.add(NL78);


                                            }
                                            break;

                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    char_literal79=(Token)match(input,ROUND_BRACKET_CLOSE,FOLLOW_ROUND_BRACKET_CLOSE_in_primitive_pattern1927); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ROUND_BRACKET_CLOSE.add(char_literal79);



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
                    // 381:5: -> ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( bracket_pattern )* ) )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:381:8: ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( bracket_pattern )* ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ROUND_LIST, "ROUND_LIST"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:381:21: ^( NIL_TOKEN ( COMMA )* )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_2);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:381:33: ( COMMA )*
                        while ( stream_COMMA.hasNext() ) {
                            adaptor.addChild(root_2, stream_COMMA.nextNode());

                        }
                        stream_COMMA.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:381:41: ^( NIL_TOKEN ( bracket_pattern )* )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_2);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:381:53: ( bracket_pattern )*
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:382:4: '{' ( NL )? ( mselem_pattern ( NL )? ( COMMA ( NL )? mselem_pattern ( NL )? )* )? '}'
                    {
                    char_literal80=(Token)match(input,CURLY_BRACKET_OPEN,FOLLOW_CURLY_BRACKET_OPEN_in_primitive_pattern1959); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_OPEN.add(char_literal80);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:382:9: ( NL )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==NL) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:382:9: NL
                            {
                            NL81=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern1962); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL81);


                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:382:13: ( mselem_pattern ( NL )? ( COMMA ( NL )? mselem_pattern ( NL )? )* )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==L_begin||(LA42_0>=L_obj && LA42_0<=L_if)||(LA42_0>=L_while && LA42_0<=L_for)||(LA42_0>=L_match && LA42_0<=L_case)||LA42_0==L_val||LA42_0==L_exception||(LA42_0>=A_infinity && LA42_0<=L_lazy)||(LA42_0>=L_true && LA42_0<=L_random)||LA42_0==MINUS||LA42_0==A_NOT||LA42_0==U_NOT||(LA42_0>=A_ELLIPSIS && LA42_0<=U_ELLIPSIS)||LA42_0==TILDE||(LA42_0>=Constr && LA42_0<=Num)||(LA42_0>=String && LA42_0<=ROUND_BRACKET_OPEN)||LA42_0==SQUARE_BRACKET_OPEN||LA42_0==CURLY_BRACKET_OPEN||LA42_0==UNDERSCORE) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:382:14: mselem_pattern ( NL )? ( COMMA ( NL )? mselem_pattern ( NL )? )*
                            {
                            pushFollow(FOLLOW_mselem_pattern_in_primitive_pattern1966);
                            mselem_pattern82=mselem_pattern();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_mselem_pattern.add(mselem_pattern82.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:382:29: ( NL )?
                            int alt38=2;
                            int LA38_0 = input.LA(1);

                            if ( (LA38_0==NL) ) {
                                alt38=1;
                            }
                            switch (alt38) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:382:29: NL
                                    {
                                    NL83=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern1968); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL83);


                                    }
                                    break;

                            }

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:382:33: ( COMMA ( NL )? mselem_pattern ( NL )? )*
                            loop41:
                            do {
                                int alt41=2;
                                int LA41_0 = input.LA(1);

                                if ( (LA41_0==COMMA) ) {
                                    alt41=1;
                                }


                                switch (alt41) {
                            	case 1 :
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:382:35: COMMA ( NL )? mselem_pattern ( NL )?
                            	    {
                            	    COMMA84=(Token)match(input,COMMA,FOLLOW_COMMA_in_primitive_pattern1973); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA84);

                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:382:42: ( NL )?
                            	    int alt39=2;
                            	    int LA39_0 = input.LA(1);

                            	    if ( (LA39_0==NL) ) {
                            	        alt39=1;
                            	    }
                            	    switch (alt39) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:382:42: NL
                            	            {
                            	            NL85=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern1976); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL85);


                            	            }
                            	            break;

                            	    }

                            	    pushFollow(FOLLOW_mselem_pattern_in_primitive_pattern1979);
                            	    mselem_pattern86=mselem_pattern();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_mselem_pattern.add(mselem_pattern86.getTree());
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:382:61: ( NL )?
                            	    int alt40=2;
                            	    int LA40_0 = input.LA(1);

                            	    if ( (LA40_0==NL) ) {
                            	        alt40=1;
                            	    }
                            	    switch (alt40) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:382:61: NL
                            	            {
                            	            NL87=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern1981); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL87);


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

                    char_literal88=(Token)match(input,CURLY_BRACKET_CLOSE,FOLLOW_CURLY_BRACKET_CLOSE_in_primitive_pattern1989); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_CLOSE.add(char_literal88);



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
                    // 383:5: -> ^( MAP_OR_SET_OR_OBJ ( mselem_pattern )* )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:383:8: ^( MAP_OR_SET_OR_OBJ ( mselem_pattern )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MAP_OR_SET_OR_OBJ, "MAP_OR_SET_OR_OBJ"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:383:28: ( mselem_pattern )*
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:384:4: '{' ( NL )? token_ARROW ( NL )? '}'
                    {
                    char_literal89=(Token)match(input,CURLY_BRACKET_OPEN,FOLLOW_CURLY_BRACKET_OPEN_in_primitive_pattern2007); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_OPEN.add(char_literal89);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:384:8: ( NL )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==NL) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:384:8: NL
                            {
                            NL90=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2009); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL90);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_token_ARROW_in_primitive_pattern2012);
                    token_ARROW91=token_ARROW();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_token_ARROW.add(token_ARROW91.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:384:24: ( NL )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==NL) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:384:24: NL
                            {
                            NL92=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2014); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL92);


                            }
                            break;

                    }

                    char_literal93=(Token)match(input,CURLY_BRACKET_CLOSE,FOLLOW_CURLY_BRACKET_CLOSE_in_primitive_pattern2017); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_CLOSE.add(char_literal93);



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
                    // 384:32: -> ^( EMPTY_MAP )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:384:35: ^( EMPTY_MAP )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EMPTY_MAP, "EMPTY_MAP"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 14 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:385:4: '{' ( NL )? ASSIGN ( NL )? '}'
                    {
                    char_literal94=(Token)match(input,CURLY_BRACKET_OPEN,FOLLOW_CURLY_BRACKET_OPEN_in_primitive_pattern2028); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_OPEN.add(char_literal94);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:385:8: ( NL )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==NL) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:385:8: NL
                            {
                            NL95=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2030); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL95);


                            }
                            break;

                    }

                    ASSIGN96=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_primitive_pattern2033); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN96);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:385:19: ( NL )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==NL) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:385:19: NL
                            {
                            NL97=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2035); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL97);


                            }
                            break;

                    }

                    char_literal98=(Token)match(input,CURLY_BRACKET_CLOSE,FOLLOW_CURLY_BRACKET_CLOSE_in_primitive_pattern2038); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_CLOSE.add(char_literal98);



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
                    // 385:27: -> ^( EMPTY_OBJ )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:385:30: ^( EMPTY_OBJ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EMPTY_OBJ, "EMPTY_OBJ"), root_1);

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:390:1: sep : ( NL | SC )+ ;
    public final babel17Parser.sep_return sep() throws RecognitionException {
        babel17Parser.sep_return retval = new babel17Parser.sep_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set99=null;

        CommonTree set99_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:390:5: ( ( NL | SC )+ )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:390:7: ( NL | SC )+
            {
            root_0 = (CommonTree)adaptor.nil();

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:390:7: ( NL | SC )+
            int cnt48=0;
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==SC||LA48_0==NL) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:
            	    {
            	    set99=(Token)input.LT(1);
            	    if ( input.LA(1)==SC||input.LA(1)==NL ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set99));
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
            	    if ( cnt48 >= 1 ) break loop48;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(48, input);
                        throw eee;
                }
                cnt48++;
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:392:1: block : ( ( sep )? statement ( sep statement )* ( sep )? -> ^( BLOCK ( statement )* ) | ( sep )? -> ^( BLOCK ) );
    public final babel17Parser.block_return block() throws RecognitionException {
        babel17Parser.block_return retval = new babel17Parser.block_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.sep_return sep100 = null;

        babel17Parser.statement_return statement101 = null;

        babel17Parser.sep_return sep102 = null;

        babel17Parser.statement_return statement103 = null;

        babel17Parser.sep_return sep104 = null;

        babel17Parser.sep_return sep105 = null;


        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_sep=new RewriteRuleSubtreeStream(adaptor,"rule sep");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:392:8: ( ( sep )? statement ( sep statement )* ( sep )? -> ^( BLOCK ( statement )* ) | ( sep )? -> ^( BLOCK ) )
            int alt53=2;
            alt53 = dfa53.predict(input);
            switch (alt53) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:392:10: ( sep )? statement ( sep statement )* ( sep )?
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:392:10: ( sep )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==SC||LA49_0==NL) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:392:10: sep
                            {
                            pushFollow(FOLLOW_sep_in_block2076);
                            sep100=sep();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_sep.add(sep100.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_statement_in_block2079);
                    statement101=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement101.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:392:25: ( sep statement )*
                    loop50:
                    do {
                        int alt50=2;
                        alt50 = dfa50.predict(input);
                        switch (alt50) {
                    	case 1 :
                    	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:392:26: sep statement
                    	    {
                    	    pushFollow(FOLLOW_sep_in_block2082);
                    	    sep102=sep();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_sep.add(sep102.getTree());
                    	    pushFollow(FOLLOW_statement_in_block2084);
                    	    statement103=statement();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_statement.add(statement103.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop50;
                        }
                    } while (true);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:392:42: ( sep )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==SC||LA51_0==NL) ) {
                        alt51=1;
                    }
                    switch (alt51) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:392:42: sep
                            {
                            pushFollow(FOLLOW_sep_in_block2088);
                            sep104=sep();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_sep.add(sep104.getTree());

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
                    // 392:47: -> ^( BLOCK ( statement )* )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:392:50: ^( BLOCK ( statement )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:392:58: ( statement )*
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:393:4: ( sep )?
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:393:4: ( sep )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==SC||LA52_0==NL) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:393:4: sep
                            {
                            pushFollow(FOLLOW_sep_in_block2104);
                            sep105=sep();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_sep.add(sep105.getTree());

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
                    // 393:9: -> ^( BLOCK )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:393:12: ^( BLOCK )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:395:1: pure_block : statement ( sep statement )* -> ^( BLOCK ( statement )* ) ;
    public final babel17Parser.pure_block_return pure_block() throws RecognitionException {
        babel17Parser.pure_block_return retval = new babel17Parser.pure_block_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.statement_return statement106 = null;

        babel17Parser.sep_return sep107 = null;

        babel17Parser.statement_return statement108 = null;


        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_sep=new RewriteRuleSubtreeStream(adaptor,"rule sep");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:396:2: ( statement ( sep statement )* -> ^( BLOCK ( statement )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:396:4: statement ( sep statement )*
            {
            pushFollow(FOLLOW_statement_in_pure_block2121);
            statement106=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statement.add(statement106.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:396:14: ( sep statement )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==NL) ) {
                    int LA54_1 = input.LA(2);

                    if ( (LA54_1==L_begin||(LA54_1>=L_obj && LA54_1<=L_if)||(LA54_1>=L_while && LA54_1<=L_for)||(LA54_1>=L_yield && LA54_1<=L_match)||(LA54_1>=L_val && LA54_1<=L_def)||LA54_1==L_exception||(LA54_1>=A_infinity && LA54_1<=L_random)||LA54_1==SC||LA54_1==MINUS||LA54_1==A_NOT||LA54_1==U_NOT||LA54_1==TILDE||(LA54_1>=NL && LA54_1<=Num)||(LA54_1>=String && LA54_1<=ROUND_BRACKET_OPEN)||LA54_1==SQUARE_BRACKET_OPEN||LA54_1==CURLY_BRACKET_OPEN||LA54_1==UNDERSCORE) ) {
                        alt54=1;
                    }


                }
                else if ( (LA54_0==SC) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:396:15: sep statement
            	    {
            	    pushFollow(FOLLOW_sep_in_pure_block2124);
            	    sep107=sep();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_sep.add(sep107.getTree());
            	    pushFollow(FOLLOW_statement_in_pure_block2126);
            	    statement108=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement108.getTree());

            	    }
            	    break;

            	default :
            	    break loop54;
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
            // 396:31: -> ^( BLOCK ( statement )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:396:34: ^( BLOCK ( statement )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:396:42: ( statement )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:398:1: statement : ( st_val | st_def | st_memoize | st_yield | expr_or_assign );
    public final babel17Parser.statement_return statement() throws RecognitionException {
        babel17Parser.statement_return retval = new babel17Parser.statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.st_val_return st_val109 = null;

        babel17Parser.st_def_return st_def110 = null;

        babel17Parser.st_memoize_return st_memoize111 = null;

        babel17Parser.st_yield_return st_yield112 = null;

        babel17Parser.expr_or_assign_return expr_or_assign113 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:399:2: ( st_val | st_def | st_memoize | st_yield | expr_or_assign )
            int alt55=5;
            switch ( input.LA(1) ) {
            case L_val:
                {
                alt55=1;
                }
                break;
            case L_def:
                {
                alt55=2;
                }
                break;
            case L_memoize:
                {
                alt55=3;
                }
                break;
            case L_yield:
                {
                alt55=4;
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
            case MINUS:
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
            case UNDERSCORE:
                {
                alt55=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:399:4: st_val
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_st_val_in_statement2147);
                    st_val109=st_val();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, st_val109.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:400:4: st_def
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_st_def_in_statement2152);
                    st_def110=st_def();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, st_def110.getTree());

                    }
                    break;
                case 3 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:401:4: st_memoize
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_st_memoize_in_statement2157);
                    st_memoize111=st_memoize();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, st_memoize111.getTree());

                    }
                    break;
                case 4 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:402:4: st_yield
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_st_yield_in_statement2162);
                    st_yield112=st_yield();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, st_yield112.getTree());

                    }
                    break;
                case 5 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:403:4: expr_or_assign
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_expr_or_assign_in_statement2167);
                    expr_or_assign113=expr_or_assign();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_or_assign113.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:405:1: objelem_assign : Id PERIOD Id -> ^( OBJELEM_ASSIGN Id Id ) ;
    public final babel17Parser.objelem_assign_return objelem_assign() throws RecognitionException {
        babel17Parser.objelem_assign_return retval = new babel17Parser.objelem_assign_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Id114=null;
        Token PERIOD115=null;
        Token Id116=null;

        CommonTree Id114_tree=null;
        CommonTree PERIOD115_tree=null;
        CommonTree Id116_tree=null;
        RewriteRuleTokenStream stream_Id=new RewriteRuleTokenStream(adaptor,"token Id");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:406:2: ( Id PERIOD Id -> ^( OBJELEM_ASSIGN Id Id ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:406:4: Id PERIOD Id
            {
            Id114=(Token)match(input,Id,FOLLOW_Id_in_objelem_assign2176); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Id.add(Id114);

            PERIOD115=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_objelem_assign2178); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD115);

            Id116=(Token)match(input,Id,FOLLOW_Id_in_objelem_assign2180); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Id.add(Id116);



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
            // 406:17: -> ^( OBJELEM_ASSIGN Id Id )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:406:20: ^( OBJELEM_ASSIGN Id Id )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:408:1: st_val : L_val ( NL )? ( pattern | objelem_assign ) ( NL )? '=' ( NL )? expr -> ^( VAL ( pattern )* ( objelem_assign )* expr ) ;
    public final babel17Parser.st_val_return st_val() throws RecognitionException {
        babel17Parser.st_val_return retval = new babel17Parser.st_val_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_val117=null;
        Token NL118=null;
        Token NL121=null;
        Token char_literal122=null;
        Token NL123=null;
        babel17Parser.pattern_return pattern119 = null;

        babel17Parser.objelem_assign_return objelem_assign120 = null;

        babel17Parser.expr_return expr124 = null;


        CommonTree L_val117_tree=null;
        CommonTree NL118_tree=null;
        CommonTree NL121_tree=null;
        CommonTree char_literal122_tree=null;
        CommonTree NL123_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_val=new RewriteRuleTokenStream(adaptor,"token L_val");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_objelem_assign=new RewriteRuleSubtreeStream(adaptor,"rule objelem_assign");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:408:8: ( L_val ( NL )? ( pattern | objelem_assign ) ( NL )? '=' ( NL )? expr -> ^( VAL ( pattern )* ( objelem_assign )* expr ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:408:10: L_val ( NL )? ( pattern | objelem_assign ) ( NL )? '=' ( NL )? expr
            {
            L_val117=(Token)match(input,L_val,FOLLOW_L_val_in_st_val2199); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_val.add(L_val117);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:408:16: ( NL )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==NL) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:408:16: NL
                    {
                    NL118=(Token)match(input,NL,FOLLOW_NL_in_st_val2201); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL118);


                    }
                    break;

            }

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:408:20: ( pattern | objelem_assign )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( ((LA57_0>=A_infinity && LA57_0<=U_infinity)||(LA57_0>=L_true && LA57_0<=L_false)||LA57_0==MINUS||LA57_0==Constr||LA57_0==Num||(LA57_0>=String && LA57_0<=ROUND_BRACKET_OPEN)||LA57_0==SQUARE_BRACKET_OPEN||LA57_0==CURLY_BRACKET_OPEN||LA57_0==UNDERSCORE) ) {
                alt57=1;
            }
            else if ( (LA57_0==Id) ) {
                int LA57_2 = input.LA(2);

                if ( (LA57_2==PERIOD) ) {
                    alt57=2;
                }
                else if ( (LA57_2==ASSIGN||(LA57_2>=A_DOUBLE_COLON && LA57_2<=U_DOUBLE_COLON)||LA57_2==NL) ) {
                    alt57=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 57, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:408:21: pattern
                    {
                    pushFollow(FOLLOW_pattern_in_st_val2205);
                    pattern119=pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pattern.add(pattern119.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:408:31: objelem_assign
                    {
                    pushFollow(FOLLOW_objelem_assign_in_st_val2209);
                    objelem_assign120=objelem_assign();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_objelem_assign.add(objelem_assign120.getTree());

                    }
                    break;

            }

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:408:47: ( NL )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==NL) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:408:47: NL
                    {
                    NL121=(Token)match(input,NL,FOLLOW_NL_in_st_val2212); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL121);


                    }
                    break;

            }

            char_literal122=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_st_val2215); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal122);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:408:55: ( NL )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==NL) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:408:55: NL
                    {
                    NL123=(Token)match(input,NL,FOLLOW_NL_in_st_val2217); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL123);


                    }
                    break;

            }

            pushFollow(FOLLOW_expr_in_st_val2220);
            expr124=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr124.getTree());


            // AST REWRITE
            // elements: expr, objelem_assign, pattern
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 408:64: -> ^( VAL ( pattern )* ( objelem_assign )* expr )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:408:67: ^( VAL ( pattern )* ( objelem_assign )* expr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VAL, "VAL"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:408:73: ( pattern )*
                while ( stream_pattern.hasNext() ) {
                    adaptor.addChild(root_1, stream_pattern.nextTree());

                }
                stream_pattern.reset();
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:408:82: ( objelem_assign )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:410:1: st_def : L_def ( NL )? Id ( NL )? ( primitive_pattern ( NL )? )? '=' ( NL )? expr -> ^( DEF Id ( primitive_pattern )? expr ) ;
    public final babel17Parser.st_def_return st_def() throws RecognitionException {
        babel17Parser.st_def_return retval = new babel17Parser.st_def_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_def125=null;
        Token NL126=null;
        Token Id127=null;
        Token NL128=null;
        Token NL130=null;
        Token char_literal131=null;
        Token NL132=null;
        babel17Parser.primitive_pattern_return primitive_pattern129 = null;

        babel17Parser.expr_return expr133 = null;


        CommonTree L_def125_tree=null;
        CommonTree NL126_tree=null;
        CommonTree Id127_tree=null;
        CommonTree NL128_tree=null;
        CommonTree NL130_tree=null;
        CommonTree char_literal131_tree=null;
        CommonTree NL132_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_Id=new RewriteRuleTokenStream(adaptor,"token Id");
        RewriteRuleTokenStream stream_L_def=new RewriteRuleTokenStream(adaptor,"token L_def");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_primitive_pattern=new RewriteRuleSubtreeStream(adaptor,"rule primitive_pattern");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:410:8: ( L_def ( NL )? Id ( NL )? ( primitive_pattern ( NL )? )? '=' ( NL )? expr -> ^( DEF Id ( primitive_pattern )? expr ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:410:10: L_def ( NL )? Id ( NL )? ( primitive_pattern ( NL )? )? '=' ( NL )? expr
            {
            L_def125=(Token)match(input,L_def,FOLLOW_L_def_in_st_def2244); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_def.add(L_def125);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:410:16: ( NL )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==NL) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:410:16: NL
                    {
                    NL126=(Token)match(input,NL,FOLLOW_NL_in_st_def2246); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL126);


                    }
                    break;

            }

            Id127=(Token)match(input,Id,FOLLOW_Id_in_st_def2249); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Id.add(Id127);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:410:23: ( NL )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==NL) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:410:23: NL
                    {
                    NL128=(Token)match(input,NL,FOLLOW_NL_in_st_def2251); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL128);


                    }
                    break;

            }

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:410:27: ( primitive_pattern ( NL )? )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( ((LA63_0>=A_infinity && LA63_0<=U_infinity)||(LA63_0>=L_true && LA63_0<=L_false)||LA63_0==MINUS||(LA63_0>=Id && LA63_0<=Num)||(LA63_0>=String && LA63_0<=ROUND_BRACKET_OPEN)||LA63_0==SQUARE_BRACKET_OPEN||LA63_0==CURLY_BRACKET_OPEN||LA63_0==UNDERSCORE) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:410:28: primitive_pattern ( NL )?
                    {
                    pushFollow(FOLLOW_primitive_pattern_in_st_def2255);
                    primitive_pattern129=primitive_pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primitive_pattern.add(primitive_pattern129.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:410:46: ( NL )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==NL) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:410:46: NL
                            {
                            NL130=(Token)match(input,NL,FOLLOW_NL_in_st_def2257); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL130);


                            }
                            break;

                    }


                    }
                    break;

            }

            char_literal131=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_st_def2262); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal131);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:410:56: ( NL )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==NL) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:410:56: NL
                    {
                    NL132=(Token)match(input,NL,FOLLOW_NL_in_st_def2264); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL132);


                    }
                    break;

            }

            pushFollow(FOLLOW_expr_in_st_def2267);
            expr133=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr133.getTree());


            // AST REWRITE
            // elements: Id, primitive_pattern, expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 411:5: -> ^( DEF Id ( primitive_pattern )? expr )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:411:8: ^( DEF Id ( primitive_pattern )? expr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DEF, "DEF"), root_1);

                adaptor.addChild(root_1, stream_Id.nextNode());
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:411:17: ( primitive_pattern )?
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:413:1: st_yield : L_yield expr -> ^( YIELD expr ) ;
    public final babel17Parser.st_yield_return st_yield() throws RecognitionException {
        babel17Parser.st_yield_return retval = new babel17Parser.st_yield_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_yield134=null;
        babel17Parser.expr_return expr135 = null;


        CommonTree L_yield134_tree=null;
        RewriteRuleTokenStream stream_L_yield=new RewriteRuleTokenStream(adaptor,"token L_yield");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:413:9: ( L_yield expr -> ^( YIELD expr ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:413:11: L_yield expr
            {
            L_yield134=(Token)match(input,L_yield,FOLLOW_L_yield_in_st_yield2296); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_yield.add(L_yield134);

            pushFollow(FOLLOW_expr_in_st_yield2298);
            expr135=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr135.getTree());


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
            // 413:24: -> ^( YIELD expr )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:413:27: ^( YIELD expr )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:415:1: st_memoize : L_memoize ( memid )+ -> ^( MEMOIZE ( memid )* ) ;
    public final babel17Parser.st_memoize_return st_memoize() throws RecognitionException {
        babel17Parser.st_memoize_return retval = new babel17Parser.st_memoize_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_memoize136=null;
        babel17Parser.memid_return memid137 = null;


        CommonTree L_memoize136_tree=null;
        RewriteRuleTokenStream stream_L_memoize=new RewriteRuleTokenStream(adaptor,"token L_memoize");
        RewriteRuleSubtreeStream stream_memid=new RewriteRuleSubtreeStream(adaptor,"rule memid");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:416:2: ( L_memoize ( memid )+ -> ^( MEMOIZE ( memid )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:416:4: L_memoize ( memid )+
            {
            L_memoize136=(Token)match(input,L_memoize,FOLLOW_L_memoize_in_st_memoize2316); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_memoize.add(L_memoize136);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:416:14: ( memid )+
            int cnt65=0;
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==Id||LA65_0==ROUND_BRACKET_OPEN) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:416:14: memid
            	    {
            	    pushFollow(FOLLOW_memid_in_st_memoize2318);
            	    memid137=memid();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_memid.add(memid137.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt65 >= 1 ) break loop65;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(65, input);
                        throw eee;
                }
                cnt65++;
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
            // 417:5: -> ^( MEMOIZE ( memid )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:417:8: ^( MEMOIZE ( memid )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MEMOIZE, "MEMOIZE"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:417:18: ( memid )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:419:1: memid : ( Id -> ^( MEM_STRONG Id ) | '(' Id ')' -> ^( MEM_WEAK Id ) );
    public final babel17Parser.memid_return memid() throws RecognitionException {
        babel17Parser.memid_return retval = new babel17Parser.memid_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Id138=null;
        Token char_literal139=null;
        Token Id140=null;
        Token char_literal141=null;

        CommonTree Id138_tree=null;
        CommonTree char_literal139_tree=null;
        CommonTree Id140_tree=null;
        CommonTree char_literal141_tree=null;
        RewriteRuleTokenStream stream_ROUND_BRACKET_OPEN=new RewriteRuleTokenStream(adaptor,"token ROUND_BRACKET_OPEN");
        RewriteRuleTokenStream stream_ROUND_BRACKET_CLOSE=new RewriteRuleTokenStream(adaptor,"token ROUND_BRACKET_CLOSE");
        RewriteRuleTokenStream stream_Id=new RewriteRuleTokenStream(adaptor,"token Id");

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:419:7: ( Id -> ^( MEM_STRONG Id ) | '(' Id ')' -> ^( MEM_WEAK Id ) )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==Id) ) {
                alt66=1;
            }
            else if ( (LA66_0==ROUND_BRACKET_OPEN) ) {
                alt66=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:419:9: Id
                    {
                    Id138=(Token)match(input,Id,FOLLOW_Id_in_memid2342); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Id.add(Id138);



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
                    // 419:12: -> ^( MEM_STRONG Id )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:419:15: ^( MEM_STRONG Id )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:420:4: '(' Id ')'
                    {
                    char_literal139=(Token)match(input,ROUND_BRACKET_OPEN,FOLLOW_ROUND_BRACKET_OPEN_in_memid2355); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ROUND_BRACKET_OPEN.add(char_literal139);

                    Id140=(Token)match(input,Id,FOLLOW_Id_in_memid2357); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Id.add(Id140);

                    char_literal141=(Token)match(input,ROUND_BRACKET_CLOSE,FOLLOW_ROUND_BRACKET_CLOSE_in_memid2359); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ROUND_BRACKET_CLOSE.add(char_literal141);



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
                    // 420:15: -> ^( MEM_WEAK Id )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:420:18: ^( MEM_WEAK Id )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:423:1: expr_or_assign : ( ( ( pattern | objelem_assign ) ( NL )? '=' )=> ( pattern | objelem_assign ) ( NL )? '=' ( NL )? expr -> ^( ASSIGN pattern expr ) | expr );
    public final babel17Parser.expr_or_assign_return expr_or_assign() throws RecognitionException {
        babel17Parser.expr_or_assign_return retval = new babel17Parser.expr_or_assign_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL144=null;
        Token char_literal145=null;
        Token NL146=null;
        babel17Parser.pattern_return pattern142 = null;

        babel17Parser.objelem_assign_return objelem_assign143 = null;

        babel17Parser.expr_return expr147 = null;

        babel17Parser.expr_return expr148 = null;


        CommonTree NL144_tree=null;
        CommonTree char_literal145_tree=null;
        CommonTree NL146_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_objelem_assign=new RewriteRuleSubtreeStream(adaptor,"rule objelem_assign");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:424:2: ( ( ( pattern | objelem_assign ) ( NL )? '=' )=> ( pattern | objelem_assign ) ( NL )? '=' ( NL )? expr -> ^( ASSIGN pattern expr ) | expr )
            int alt70=2;
            alt70 = dfa70.predict(input);
            switch (alt70) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:424:4: ( ( pattern | objelem_assign ) ( NL )? '=' )=> ( pattern | objelem_assign ) ( NL )? '=' ( NL )? expr
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:424:44: ( pattern | objelem_assign )
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( ((LA67_0>=A_infinity && LA67_0<=U_infinity)||(LA67_0>=L_true && LA67_0<=L_false)||LA67_0==MINUS||LA67_0==Constr||LA67_0==Num||(LA67_0>=String && LA67_0<=ROUND_BRACKET_OPEN)||LA67_0==SQUARE_BRACKET_OPEN||LA67_0==CURLY_BRACKET_OPEN||LA67_0==UNDERSCORE) ) {
                        alt67=1;
                    }
                    else if ( (LA67_0==Id) ) {
                        int LA67_2 = input.LA(2);

                        if ( (LA67_2==PERIOD) ) {
                            alt67=2;
                        }
                        else if ( (LA67_2==ASSIGN||(LA67_2>=A_DOUBLE_COLON && LA67_2<=U_DOUBLE_COLON)||LA67_2==NL) ) {
                            alt67=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 67, 2, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 67, 0, input);

                        throw nvae;
                    }
                    switch (alt67) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:424:45: pattern
                            {
                            pushFollow(FOLLOW_pattern_in_expr_or_assign2399);
                            pattern142=pattern();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_pattern.add(pattern142.getTree());

                            }
                            break;
                        case 2 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:424:55: objelem_assign
                            {
                            pushFollow(FOLLOW_objelem_assign_in_expr_or_assign2403);
                            objelem_assign143=objelem_assign();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_objelem_assign.add(objelem_assign143.getTree());

                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:424:71: ( NL )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==NL) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:424:71: NL
                            {
                            NL144=(Token)match(input,NL,FOLLOW_NL_in_expr_or_assign2406); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL144);


                            }
                            break;

                    }

                    char_literal145=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_expr_or_assign2409); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal145);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:424:79: ( NL )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==NL) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:424:79: NL
                            {
                            NL146=(Token)match(input,NL,FOLLOW_NL_in_expr_or_assign2411); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL146);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_expr_in_expr_or_assign2414);
                    expr147=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr147.getTree());


                    // AST REWRITE
                    // elements: pattern, expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 424:88: -> ^( ASSIGN pattern expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:424:91: ^( ASSIGN pattern expr )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:425:4: expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_expr_in_expr_or_assign2429);
                    expr148=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr148.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:427:1: expr : ( lop_expr | obj_expr );
    public final babel17Parser.expr_return expr() throws RecognitionException {
        babel17Parser.expr_return retval = new babel17Parser.expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.lop_expr_return lop_expr149 = null;

        babel17Parser.obj_expr_return obj_expr150 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:428:2: ( lop_expr | obj_expr )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==L_begin||(LA71_0>=L_with && LA71_0<=L_if)||(LA71_0>=L_while && LA71_0<=L_for)||LA71_0==L_match||LA71_0==L_exception||(LA71_0>=A_infinity && LA71_0<=L_lazy)||(LA71_0>=L_true && LA71_0<=L_random)||LA71_0==MINUS||LA71_0==A_NOT||LA71_0==U_NOT||LA71_0==TILDE||(LA71_0>=Constr && LA71_0<=Num)||(LA71_0>=String && LA71_0<=ROUND_BRACKET_OPEN)||LA71_0==SQUARE_BRACKET_OPEN||LA71_0==CURLY_BRACKET_OPEN||LA71_0==UNDERSCORE) ) {
                alt71=1;
            }
            else if ( (LA71_0==L_obj) ) {
                alt71=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }
            switch (alt71) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:428:4: lop_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_lop_expr_in_expr2440);
                    lop_expr149=lop_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lop_expr149.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:429:4: obj_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_obj_expr_in_expr2445);
                    obj_expr150=obj_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, obj_expr150.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:431:1: control_expr : ( if_expr | while_do_expr | match_expr | for_expr | begin_end );
    public final babel17Parser.control_expr_return control_expr() throws RecognitionException {
        babel17Parser.control_expr_return retval = new babel17Parser.control_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.if_expr_return if_expr151 = null;

        babel17Parser.while_do_expr_return while_do_expr152 = null;

        babel17Parser.match_expr_return match_expr153 = null;

        babel17Parser.for_expr_return for_expr154 = null;

        babel17Parser.begin_end_return begin_end155 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:432:2: ( if_expr | while_do_expr | match_expr | for_expr | begin_end )
            int alt72=5;
            switch ( input.LA(1) ) {
            case L_if:
                {
                alt72=1;
                }
                break;
            case L_while:
                {
                alt72=2;
                }
                break;
            case L_match:
                {
                alt72=3;
                }
                break;
            case L_for:
                {
                alt72=4;
                }
                break;
            case L_begin:
                {
                alt72=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }

            switch (alt72) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:432:4: if_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_if_expr_in_control_expr2455);
                    if_expr151=if_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, if_expr151.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:433:4: while_do_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_while_do_expr_in_control_expr2460);
                    while_do_expr152=while_do_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, while_do_expr152.getTree());

                    }
                    break;
                case 3 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:434:4: match_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_match_expr_in_control_expr2465);
                    match_expr153=match_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, match_expr153.getTree());

                    }
                    break;
                case 4 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:435:4: for_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_for_expr_in_control_expr2470);
                    for_expr154=for_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, for_expr154.getTree());

                    }
                    break;
                case 5 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:436:4: begin_end
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_begin_end_in_control_expr2475);
                    begin_end155=begin_end();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, begin_end155.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:438:1: with_control_expr : ( control_expr | L_with ( NL )? protected_expr ( NL )? COLON ( NL )? control_expr -> ^( WITH protected_expr control_expr ) );
    public final babel17Parser.with_control_expr_return with_control_expr() throws RecognitionException {
        babel17Parser.with_control_expr_return retval = new babel17Parser.with_control_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_with157=null;
        Token NL158=null;
        Token NL160=null;
        Token COLON161=null;
        Token NL162=null;
        babel17Parser.control_expr_return control_expr156 = null;

        babel17Parser.protected_expr_return protected_expr159 = null;

        babel17Parser.control_expr_return control_expr163 = null;


        CommonTree L_with157_tree=null;
        CommonTree NL158_tree=null;
        CommonTree NL160_tree=null;
        CommonTree COLON161_tree=null;
        CommonTree NL162_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_with=new RewriteRuleTokenStream(adaptor,"token L_with");
        RewriteRuleSubtreeStream stream_control_expr=new RewriteRuleSubtreeStream(adaptor,"rule control_expr");
        RewriteRuleSubtreeStream stream_protected_expr=new RewriteRuleSubtreeStream(adaptor,"rule protected_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:439:2: ( control_expr | L_with ( NL )? protected_expr ( NL )? COLON ( NL )? control_expr -> ^( WITH protected_expr control_expr ) )
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==L_begin||LA76_0==L_if||(LA76_0>=L_while && LA76_0<=L_for)||LA76_0==L_match) ) {
                alt76=1;
            }
            else if ( (LA76_0==L_with) ) {
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:439:4: control_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_control_expr_in_with_control_expr2485);
                    control_expr156=control_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, control_expr156.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:440:4: L_with ( NL )? protected_expr ( NL )? COLON ( NL )? control_expr
                    {
                    L_with157=(Token)match(input,L_with,FOLLOW_L_with_in_with_control_expr2490); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_with.add(L_with157);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:440:11: ( NL )?
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==NL) ) {
                        alt73=1;
                    }
                    switch (alt73) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:440:11: NL
                            {
                            NL158=(Token)match(input,NL,FOLLOW_NL_in_with_control_expr2492); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL158);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_protected_expr_in_with_control_expr2495);
                    protected_expr159=protected_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr159.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:440:30: ( NL )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==NL) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:440:30: NL
                            {
                            NL160=(Token)match(input,NL,FOLLOW_NL_in_with_control_expr2497); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL160);


                            }
                            break;

                    }

                    COLON161=(Token)match(input,COLON,FOLLOW_COLON_in_with_control_expr2500); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON161);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:440:40: ( NL )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==NL) ) {
                        alt75=1;
                    }
                    switch (alt75) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:440:40: NL
                            {
                            NL162=(Token)match(input,NL,FOLLOW_NL_in_with_control_expr2502); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL162);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_control_expr_in_with_control_expr2505);
                    control_expr163=control_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_control_expr.add(control_expr163.getTree());


                    // AST REWRITE
                    // elements: control_expr, protected_expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 440:57: -> ^( WITH protected_expr control_expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:440:60: ^( WITH protected_expr control_expr )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:443:1: protected_expr : ( p_lop_expr | obj_expr );
    public final babel17Parser.protected_expr_return protected_expr() throws RecognitionException {
        babel17Parser.protected_expr_return retval = new babel17Parser.protected_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.p_lop_expr_return p_lop_expr164 = null;

        babel17Parser.obj_expr_return obj_expr165 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:444:2: ( p_lop_expr | obj_expr )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==L_begin||(LA77_0>=L_with && LA77_0<=L_if)||(LA77_0>=L_while && LA77_0<=L_for)||(LA77_0>=L_match && LA77_0<=L_case)||LA77_0==L_exception||(LA77_0>=A_infinity && LA77_0<=L_lazy)||(LA77_0>=L_true && LA77_0<=L_random)||LA77_0==MINUS||LA77_0==A_NOT||LA77_0==U_NOT||LA77_0==TILDE||(LA77_0>=Constr && LA77_0<=Num)||(LA77_0>=String && LA77_0<=ROUND_BRACKET_OPEN)||LA77_0==SQUARE_BRACKET_OPEN||LA77_0==CURLY_BRACKET_OPEN||LA77_0==UNDERSCORE) ) {
                alt77=1;
            }
            else if ( (LA77_0==L_obj) ) {
                alt77=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }
            switch (alt77) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:444:4: p_lop_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_p_lop_expr_in_protected_expr2526);
                    p_lop_expr164=p_lop_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_lop_expr164.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:445:4: obj_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_obj_expr_in_protected_expr2531);
                    obj_expr165=obj_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, obj_expr165.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:448:1: begin_end : L_begin block L_end -> ^( BEGIN block ) ;
    public final babel17Parser.begin_end_return begin_end() throws RecognitionException {
        babel17Parser.begin_end_return retval = new babel17Parser.begin_end_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_begin166=null;
        Token L_end168=null;
        babel17Parser.block_return block167 = null;


        CommonTree L_begin166_tree=null;
        CommonTree L_end168_tree=null;
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleTokenStream stream_L_begin=new RewriteRuleTokenStream(adaptor,"token L_begin");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:449:2: ( L_begin block L_end -> ^( BEGIN block ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:449:4: L_begin block L_end
            {
            L_begin166=(Token)match(input,L_begin,FOLLOW_L_begin_in_begin_end2543); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_begin.add(L_begin166);

            pushFollow(FOLLOW_block_in_begin_end2545);
            block167=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block167.getTree());
            L_end168=(Token)match(input,L_end,FOLLOW_L_end_in_begin_end2547); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_end.add(L_end168);



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
            // 449:24: -> ^( BEGIN block )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:449:27: ^( BEGIN block )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:452:1: parents : ( '+' primitive_expr -> ^( PARENTS_PLUS primitive_expr ) | '*' primitive_expr -> ^( PARENTS_MUL primitive_expr ) );
    public final babel17Parser.parents_return parents() throws RecognitionException {
        babel17Parser.parents_return retval = new babel17Parser.parents_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal169=null;
        Token char_literal171=null;
        babel17Parser.primitive_expr_return primitive_expr170 = null;

        babel17Parser.primitive_expr_return primitive_expr172 = null;


        CommonTree char_literal169_tree=null;
        CommonTree char_literal171_tree=null;
        RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
        RewriteRuleTokenStream stream_TIMES=new RewriteRuleTokenStream(adaptor,"token TIMES");
        RewriteRuleSubtreeStream stream_primitive_expr=new RewriteRuleSubtreeStream(adaptor,"rule primitive_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:452:9: ( '+' primitive_expr -> ^( PARENTS_PLUS primitive_expr ) | '*' primitive_expr -> ^( PARENTS_MUL primitive_expr ) )
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==PLUS) ) {
                alt78=1;
            }
            else if ( (LA78_0==TIMES) ) {
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:452:11: '+' primitive_expr
                    {
                    char_literal169=(Token)match(input,PLUS,FOLLOW_PLUS_in_parents2565); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PLUS.add(char_literal169);

                    pushFollow(FOLLOW_primitive_expr_in_parents2567);
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
                    // 452:30: -> ^( PARENTS_PLUS primitive_expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:452:33: ^( PARENTS_PLUS primitive_expr )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:453:4: '*' primitive_expr
                    {
                    char_literal171=(Token)match(input,TIMES,FOLLOW_TIMES_in_parents2580); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TIMES.add(char_literal171);

                    pushFollow(FOLLOW_primitive_expr_in_parents2582);
                    primitive_expr172=primitive_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primitive_expr.add(primitive_expr172.getTree());


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
                    // 453:23: -> ^( PARENTS_MUL primitive_expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:453:26: ^( PARENTS_MUL primitive_expr )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:456:1: obj_expr : ( ( L_obj ( NL )? parents )=> L_obj ( NL )? parents block L_end -> ^( OBJ block parents ) | L_obj block L_end -> ^( OBJ block ) );
    public final babel17Parser.obj_expr_return obj_expr() throws RecognitionException {
        babel17Parser.obj_expr_return retval = new babel17Parser.obj_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_obj173=null;
        Token NL174=null;
        Token L_end177=null;
        Token L_obj178=null;
        Token L_end180=null;
        babel17Parser.parents_return parents175 = null;

        babel17Parser.block_return block176 = null;

        babel17Parser.block_return block179 = null;


        CommonTree L_obj173_tree=null;
        CommonTree NL174_tree=null;
        CommonTree L_end177_tree=null;
        CommonTree L_obj178_tree=null;
        CommonTree L_end180_tree=null;
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_obj=new RewriteRuleTokenStream(adaptor,"token L_obj");
        RewriteRuleSubtreeStream stream_parents=new RewriteRuleSubtreeStream(adaptor,"rule parents");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:456:9: ( ( L_obj ( NL )? parents )=> L_obj ( NL )? parents block L_end -> ^( OBJ block parents ) | L_obj block L_end -> ^( OBJ block ) )
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==L_obj) ) {
                int LA80_1 = input.LA(2);

                if ( (LA80_1==NL) ) {
                    int LA80_2 = input.LA(3);

                    if ( ((LA80_2>=L_begin && LA80_2<=L_if)||(LA80_2>=L_while && LA80_2<=L_for)||(LA80_2>=L_yield && LA80_2<=L_match)||(LA80_2>=L_val && LA80_2<=L_def)||LA80_2==L_exception||(LA80_2>=A_infinity && LA80_2<=L_random)||LA80_2==SC||LA80_2==MINUS||LA80_2==A_NOT||LA80_2==U_NOT||LA80_2==TILDE||(LA80_2>=NL && LA80_2<=Num)||(LA80_2>=String && LA80_2<=ROUND_BRACKET_OPEN)||LA80_2==SQUARE_BRACKET_OPEN||LA80_2==CURLY_BRACKET_OPEN||LA80_2==UNDERSCORE) ) {
                        alt80=2;
                    }
                    else if ( (LA80_2==PLUS) && (synpred4_babel17())) {
                        alt80=1;
                    }
                    else if ( (LA80_2==TIMES) && (synpred4_babel17())) {
                        alt80=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 80, 2, input);

                        throw nvae;
                    }
                }
                else if ( ((LA80_1>=L_begin && LA80_1<=L_if)||(LA80_1>=L_while && LA80_1<=L_for)||(LA80_1>=L_yield && LA80_1<=L_match)||(LA80_1>=L_val && LA80_1<=L_def)||LA80_1==L_exception||(LA80_1>=A_infinity && LA80_1<=L_random)||LA80_1==SC||LA80_1==MINUS||LA80_1==A_NOT||LA80_1==U_NOT||LA80_1==TILDE||(LA80_1>=Constr && LA80_1<=Num)||(LA80_1>=String && LA80_1<=ROUND_BRACKET_OPEN)||LA80_1==SQUARE_BRACKET_OPEN||LA80_1==CURLY_BRACKET_OPEN||LA80_1==UNDERSCORE) ) {
                    alt80=2;
                }
                else if ( (LA80_1==PLUS) && (synpred4_babel17())) {
                    alt80=1;
                }
                else if ( (LA80_1==TIMES) && (synpred4_babel17())) {
                    alt80=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 80, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }
            switch (alt80) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:456:11: ( L_obj ( NL )? parents )=> L_obj ( NL )? parents block L_end
                    {
                    L_obj173=(Token)match(input,L_obj,FOLLOW_L_obj_in_obj_expr2610); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_obj.add(L_obj173);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:456:40: ( NL )?
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==NL) ) {
                        alt79=1;
                    }
                    switch (alt79) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:456:40: NL
                            {
                            NL174=(Token)match(input,NL,FOLLOW_NL_in_obj_expr2612); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL174);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_parents_in_obj_expr2615);
                    parents175=parents();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parents.add(parents175.getTree());
                    pushFollow(FOLLOW_block_in_obj_expr2617);
                    block176=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block176.getTree());
                    L_end177=(Token)match(input,L_end,FOLLOW_L_end_in_obj_expr2619); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_end.add(L_end177);



                    // AST REWRITE
                    // elements: block, parents
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 456:64: -> ^( OBJ block parents )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:456:67: ^( OBJ block parents )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:457:17: L_obj block L_end
                    {
                    L_obj178=(Token)match(input,L_obj,FOLLOW_L_obj_in_obj_expr2647); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_obj.add(L_obj178);

                    pushFollow(FOLLOW_block_in_obj_expr2649);
                    block179=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block179.getTree());
                    L_end180=(Token)match(input,L_end,FOLLOW_L_end_in_obj_expr2651); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_end.add(L_end180);



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
                    // 457:35: -> ^( OBJ block )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:457:38: ^( OBJ block )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:459:1: lop_expr : ( ( lambda_expr )=> lambda_expr | op_expr );
    public final babel17Parser.lop_expr_return lop_expr() throws RecognitionException {
        babel17Parser.lop_expr_return retval = new babel17Parser.lop_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.lambda_expr_return lambda_expr181 = null;

        babel17Parser.op_expr_return op_expr182 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:460:2: ( ( lambda_expr )=> lambda_expr | op_expr )
            int alt81=2;
            alt81 = dfa81.predict(input);
            switch (alt81) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:460:4: ( lambda_expr )=> lambda_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_lambda_expr_in_lop_expr2679);
                    lambda_expr181=lambda_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lambda_expr181.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:461:4: op_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_op_expr_in_lop_expr2684);
                    op_expr182=op_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, op_expr182.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:463:1: p_lop_expr : ( ( protected_lambda_expr )=> protected_lambda_expr | p_op_expr );
    public final babel17Parser.p_lop_expr_return p_lop_expr() throws RecognitionException {
        babel17Parser.p_lop_expr_return retval = new babel17Parser.p_lop_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.protected_lambda_expr_return protected_lambda_expr183 = null;

        babel17Parser.p_op_expr_return p_op_expr184 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:464:2: ( ( protected_lambda_expr )=> protected_lambda_expr | p_op_expr )
            int alt82=2;
            alt82 = dfa82.predict(input);
            switch (alt82) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:464:4: ( protected_lambda_expr )=> protected_lambda_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_protected_lambda_expr_in_p_lop_expr2700);
                    protected_lambda_expr183=protected_lambda_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, protected_lambda_expr183.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:465:4: p_op_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_p_op_expr_in_p_lop_expr2705);
                    p_op_expr184=p_op_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_op_expr184.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:467:1: if_expr : L_if ( NL )? protected_expr ( NL )? L_then block ( L_elseif ( NL )? protected_expr ( NL )? L_then block )* ( L_else block )? L_end -> ^( IF ( protected_expr )* ( block )* ) ;
    public final babel17Parser.if_expr_return if_expr() throws RecognitionException {
        babel17Parser.if_expr_return retval = new babel17Parser.if_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_if185=null;
        Token NL186=null;
        Token NL188=null;
        Token L_then189=null;
        Token L_elseif191=null;
        Token NL192=null;
        Token NL194=null;
        Token L_then195=null;
        Token L_else197=null;
        Token L_end199=null;
        babel17Parser.protected_expr_return protected_expr187 = null;

        babel17Parser.block_return block190 = null;

        babel17Parser.protected_expr_return protected_expr193 = null;

        babel17Parser.block_return block196 = null;

        babel17Parser.block_return block198 = null;


        CommonTree L_if185_tree=null;
        CommonTree NL186_tree=null;
        CommonTree NL188_tree=null;
        CommonTree L_then189_tree=null;
        CommonTree L_elseif191_tree=null;
        CommonTree NL192_tree=null;
        CommonTree NL194_tree=null;
        CommonTree L_then195_tree=null;
        CommonTree L_else197_tree=null;
        CommonTree L_end199_tree=null;
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleTokenStream stream_L_else=new RewriteRuleTokenStream(adaptor,"token L_else");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_elseif=new RewriteRuleTokenStream(adaptor,"token L_elseif");
        RewriteRuleTokenStream stream_L_then=new RewriteRuleTokenStream(adaptor,"token L_then");
        RewriteRuleTokenStream stream_L_if=new RewriteRuleTokenStream(adaptor,"token L_if");
        RewriteRuleSubtreeStream stream_protected_expr=new RewriteRuleSubtreeStream(adaptor,"rule protected_expr");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:467:9: ( L_if ( NL )? protected_expr ( NL )? L_then block ( L_elseif ( NL )? protected_expr ( NL )? L_then block )* ( L_else block )? L_end -> ^( IF ( protected_expr )* ( block )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:467:11: L_if ( NL )? protected_expr ( NL )? L_then block ( L_elseif ( NL )? protected_expr ( NL )? L_then block )* ( L_else block )? L_end
            {
            L_if185=(Token)match(input,L_if,FOLLOW_L_if_in_if_expr2716); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_if.add(L_if185);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:467:16: ( NL )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==NL) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:467:16: NL
                    {
                    NL186=(Token)match(input,NL,FOLLOW_NL_in_if_expr2718); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL186);


                    }
                    break;

            }

            pushFollow(FOLLOW_protected_expr_in_if_expr2721);
            protected_expr187=protected_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr187.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:467:35: ( NL )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==NL) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:467:35: NL
                    {
                    NL188=(Token)match(input,NL,FOLLOW_NL_in_if_expr2723); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL188);


                    }
                    break;

            }

            L_then189=(Token)match(input,L_then,FOLLOW_L_then_in_if_expr2726); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_then.add(L_then189);

            pushFollow(FOLLOW_block_in_if_expr2728);
            block190=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block190.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:468:3: ( L_elseif ( NL )? protected_expr ( NL )? L_then block )*
            loop87:
            do {
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( (LA87_0==L_elseif) ) {
                    alt87=1;
                }


                switch (alt87) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:468:4: L_elseif ( NL )? protected_expr ( NL )? L_then block
            	    {
            	    L_elseif191=(Token)match(input,L_elseif,FOLLOW_L_elseif_in_if_expr2734); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_L_elseif.add(L_elseif191);

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:468:13: ( NL )?
            	    int alt85=2;
            	    int LA85_0 = input.LA(1);

            	    if ( (LA85_0==NL) ) {
            	        alt85=1;
            	    }
            	    switch (alt85) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:468:13: NL
            	            {
            	            NL192=(Token)match(input,NL,FOLLOW_NL_in_if_expr2736); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL192);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_protected_expr_in_if_expr2739);
            	    protected_expr193=protected_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr193.getTree());
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:468:32: ( NL )?
            	    int alt86=2;
            	    int LA86_0 = input.LA(1);

            	    if ( (LA86_0==NL) ) {
            	        alt86=1;
            	    }
            	    switch (alt86) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:468:32: NL
            	            {
            	            NL194=(Token)match(input,NL,FOLLOW_NL_in_if_expr2741); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL194);


            	            }
            	            break;

            	    }

            	    L_then195=(Token)match(input,L_then,FOLLOW_L_then_in_if_expr2744); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_L_then.add(L_then195);

            	    pushFollow(FOLLOW_block_in_if_expr2746);
            	    block196=block();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_block.add(block196.getTree());

            	    }
            	    break;

            	default :
            	    break loop87;
                }
            } while (true);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:469:3: ( L_else block )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==L_else) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:469:4: L_else block
                    {
                    L_else197=(Token)match(input,L_else,FOLLOW_L_else_in_if_expr2754); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_else.add(L_else197);

                    pushFollow(FOLLOW_block_in_if_expr2756);
                    block198=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block198.getTree());

                    }
                    break;

            }

            L_end199=(Token)match(input,L_end,FOLLOW_L_end_in_if_expr2760); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_end.add(L_end199);



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
            // 469:26: -> ^( IF ( protected_expr )* ( block )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:469:29: ^( IF ( protected_expr )* ( block )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IF, "IF"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:469:34: ( protected_expr )*
                while ( stream_protected_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_protected_expr.nextTree());

                }
                stream_protected_expr.reset();
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:469:50: ( block )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:471:1: while_do_expr : L_while ( NL )? protected_expr ( NL )? L_do block L_end -> ^( WHILE_DO protected_expr block ) ;
    public final babel17Parser.while_do_expr_return while_do_expr() throws RecognitionException {
        babel17Parser.while_do_expr_return retval = new babel17Parser.while_do_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_while200=null;
        Token NL201=null;
        Token NL203=null;
        Token L_do204=null;
        Token L_end206=null;
        babel17Parser.protected_expr_return protected_expr202 = null;

        babel17Parser.block_return block205 = null;


        CommonTree L_while200_tree=null;
        CommonTree NL201_tree=null;
        CommonTree NL203_tree=null;
        CommonTree L_do204_tree=null;
        CommonTree L_end206_tree=null;
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_do=new RewriteRuleTokenStream(adaptor,"token L_do");
        RewriteRuleTokenStream stream_L_while=new RewriteRuleTokenStream(adaptor,"token L_while");
        RewriteRuleSubtreeStream stream_protected_expr=new RewriteRuleSubtreeStream(adaptor,"rule protected_expr");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:472:2: ( L_while ( NL )? protected_expr ( NL )? L_do block L_end -> ^( WHILE_DO protected_expr block ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:472:4: L_while ( NL )? protected_expr ( NL )? L_do block L_end
            {
            L_while200=(Token)match(input,L_while,FOLLOW_L_while_in_while_do_expr2784); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_while.add(L_while200);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:472:12: ( NL )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==NL) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:472:12: NL
                    {
                    NL201=(Token)match(input,NL,FOLLOW_NL_in_while_do_expr2786); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL201);


                    }
                    break;

            }

            pushFollow(FOLLOW_protected_expr_in_while_do_expr2789);
            protected_expr202=protected_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr202.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:472:31: ( NL )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==NL) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:472:31: NL
                    {
                    NL203=(Token)match(input,NL,FOLLOW_NL_in_while_do_expr2791); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL203);


                    }
                    break;

            }

            L_do204=(Token)match(input,L_do,FOLLOW_L_do_in_while_do_expr2794); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_do.add(L_do204);

            pushFollow(FOLLOW_block_in_while_do_expr2796);
            block205=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block205.getTree());
            L_end206=(Token)match(input,L_end,FOLLOW_L_end_in_while_do_expr2798); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_end.add(L_end206);



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
            // 473:5: -> ^( WHILE_DO protected_expr block )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:473:8: ^( WHILE_DO protected_expr block )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:475:1: cases : ( full_cases | pattern ( NL )? token_DOUBLE_ARROW block -> ^( CASES ^( NIL_TOKEN pattern block ) ) );
    public final babel17Parser.cases_return cases() throws RecognitionException {
        babel17Parser.cases_return retval = new babel17Parser.cases_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL209=null;
        babel17Parser.full_cases_return full_cases207 = null;

        babel17Parser.pattern_return pattern208 = null;

        babel17Parser.token_DOUBLE_ARROW_return token_DOUBLE_ARROW210 = null;

        babel17Parser.block_return block211 = null;


        CommonTree NL209_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_token_DOUBLE_ARROW=new RewriteRuleSubtreeStream(adaptor,"rule token_DOUBLE_ARROW");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:476:2: ( full_cases | pattern ( NL )? token_DOUBLE_ARROW block -> ^( CASES ^( NIL_TOKEN pattern block ) ) )
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==L_case) ) {
                alt92=1;
            }
            else if ( ((LA92_0>=A_infinity && LA92_0<=U_infinity)||(LA92_0>=L_true && LA92_0<=L_false)||LA92_0==MINUS||(LA92_0>=Constr && LA92_0<=Num)||(LA92_0>=String && LA92_0<=ROUND_BRACKET_OPEN)||LA92_0==SQUARE_BRACKET_OPEN||LA92_0==CURLY_BRACKET_OPEN||LA92_0==UNDERSCORE) ) {
                alt92=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;
            }
            switch (alt92) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:476:4: full_cases
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_full_cases_in_cases2828);
                    full_cases207=full_cases();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, full_cases207.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:477:4: pattern ( NL )? token_DOUBLE_ARROW block
                    {
                    pushFollow(FOLLOW_pattern_in_cases2833);
                    pattern208=pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pattern.add(pattern208.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:477:12: ( NL )?
                    int alt91=2;
                    int LA91_0 = input.LA(1);

                    if ( (LA91_0==NL) ) {
                        alt91=1;
                    }
                    switch (alt91) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:477:12: NL
                            {
                            NL209=(Token)match(input,NL,FOLLOW_NL_in_cases2835); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL209);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_token_DOUBLE_ARROW_in_cases2838);
                    token_DOUBLE_ARROW210=token_DOUBLE_ARROW();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_token_DOUBLE_ARROW.add(token_DOUBLE_ARROW210.getTree());
                    pushFollow(FOLLOW_block_in_cases2840);
                    block211=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block211.getTree());


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
                    // 477:41: -> ^( CASES ^( NIL_TOKEN pattern block ) )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:477:44: ^( CASES ^( NIL_TOKEN pattern block ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CASES, "CASES"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:477:52: ^( NIL_TOKEN pattern block )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:479:1: full_cases : ( case_expr )+ -> ^( CASES ( case_expr )+ ) ;
    public final babel17Parser.full_cases_return full_cases() throws RecognitionException {
        babel17Parser.full_cases_return retval = new babel17Parser.full_cases_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.case_expr_return case_expr212 = null;


        RewriteRuleSubtreeStream stream_case_expr=new RewriteRuleSubtreeStream(adaptor,"rule case_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:480:2: ( ( case_expr )+ -> ^( CASES ( case_expr )+ ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:480:4: ( case_expr )+
            {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:480:4: ( case_expr )+
            int cnt93=0;
            loop93:
            do {
                int alt93=2;
                int LA93_0 = input.LA(1);

                if ( (LA93_0==L_case) ) {
                    alt93=1;
                }


                switch (alt93) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:480:4: case_expr
            	    {
            	    pushFollow(FOLLOW_case_expr_in_full_cases2863);
            	    case_expr212=case_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_case_expr.add(case_expr212.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt93 >= 1 ) break loop93;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(93, input);
                        throw eee;
                }
                cnt93++;
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
            // 480:15: -> ^( CASES ( case_expr )+ )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:480:18: ^( CASES ( case_expr )+ )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:482:1: case_expr : ( L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW block ) -> ^( NIL_TOKEN pattern block ) ;
    public final babel17Parser.case_expr_return case_expr() throws RecognitionException {
        babel17Parser.case_expr_return retval = new babel17Parser.case_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_case213=null;
        Token NL214=null;
        Token NL216=null;
        babel17Parser.pattern_return pattern215 = null;

        babel17Parser.token_DOUBLE_ARROW_return token_DOUBLE_ARROW217 = null;

        babel17Parser.block_return block218 = null;


        CommonTree L_case213_tree=null;
        CommonTree NL214_tree=null;
        CommonTree NL216_tree=null;
        RewriteRuleTokenStream stream_L_case=new RewriteRuleTokenStream(adaptor,"token L_case");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_token_DOUBLE_ARROW=new RewriteRuleSubtreeStream(adaptor,"rule token_DOUBLE_ARROW");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:483:2: ( ( L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW block ) -> ^( NIL_TOKEN pattern block ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:483:4: ( L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW block )
            {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:483:4: ( L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW block )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:483:5: L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW block
            {
            L_case213=(Token)match(input,L_case,FOLLOW_L_case_in_case_expr2884); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_case.add(L_case213);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:483:12: ( NL )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==NL) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:483:12: NL
                    {
                    NL214=(Token)match(input,NL,FOLLOW_NL_in_case_expr2886); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL214);


                    }
                    break;

            }

            pushFollow(FOLLOW_pattern_in_case_expr2889);
            pattern215=pattern();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pattern.add(pattern215.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:483:24: ( NL )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==NL) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:483:24: NL
                    {
                    NL216=(Token)match(input,NL,FOLLOW_NL_in_case_expr2891); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL216);


                    }
                    break;

            }

            pushFollow(FOLLOW_token_DOUBLE_ARROW_in_case_expr2894);
            token_DOUBLE_ARROW217=token_DOUBLE_ARROW();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_token_DOUBLE_ARROW.add(token_DOUBLE_ARROW217.getTree());
            pushFollow(FOLLOW_block_in_case_expr2896);
            block218=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block218.getTree());

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
            // 483:54: -> ^( NIL_TOKEN pattern block )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:483:57: ^( NIL_TOKEN pattern block )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:485:1: match_expr : L_match ( NL )? p_op_expr ( NL )? full_cases L_end -> ^( MATCH p_op_expr full_cases ) ;
    public final babel17Parser.match_expr_return match_expr() throws RecognitionException {
        babel17Parser.match_expr_return retval = new babel17Parser.match_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_match219=null;
        Token NL220=null;
        Token NL222=null;
        Token L_end224=null;
        babel17Parser.p_op_expr_return p_op_expr221 = null;

        babel17Parser.full_cases_return full_cases223 = null;


        CommonTree L_match219_tree=null;
        CommonTree NL220_tree=null;
        CommonTree NL222_tree=null;
        CommonTree L_end224_tree=null;
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_match=new RewriteRuleTokenStream(adaptor,"token L_match");
        RewriteRuleSubtreeStream stream_full_cases=new RewriteRuleSubtreeStream(adaptor,"rule full_cases");
        RewriteRuleSubtreeStream stream_p_op_expr=new RewriteRuleSubtreeStream(adaptor,"rule p_op_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:486:2: ( L_match ( NL )? p_op_expr ( NL )? full_cases L_end -> ^( MATCH p_op_expr full_cases ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:486:4: L_match ( NL )? p_op_expr ( NL )? full_cases L_end
            {
            L_match219=(Token)match(input,L_match,FOLLOW_L_match_in_match_expr2917); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_match.add(L_match219);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:486:12: ( NL )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==NL) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:486:12: NL
                    {
                    NL220=(Token)match(input,NL,FOLLOW_NL_in_match_expr2919); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL220);


                    }
                    break;

            }

            pushFollow(FOLLOW_p_op_expr_in_match_expr2922);
            p_op_expr221=p_op_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_p_op_expr.add(p_op_expr221.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:486:26: ( NL )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==NL) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:486:26: NL
                    {
                    NL222=(Token)match(input,NL,FOLLOW_NL_in_match_expr2924); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL222);


                    }
                    break;

            }

            pushFollow(FOLLOW_full_cases_in_match_expr2927);
            full_cases223=full_cases();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_full_cases.add(full_cases223.getTree());
            L_end224=(Token)match(input,L_end,FOLLOW_L_end_in_match_expr2929); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_end.add(L_end224);



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
            // 487:5: -> ^( MATCH p_op_expr full_cases )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:487:8: ^( MATCH p_op_expr full_cases )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:489:1: lambda_expr : lambda_cases -> ^( LAMBDA lambda_cases ) ;
    public final babel17Parser.lambda_expr_return lambda_expr() throws RecognitionException {
        babel17Parser.lambda_expr_return retval = new babel17Parser.lambda_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.lambda_cases_return lambda_cases225 = null;


        RewriteRuleSubtreeStream stream_lambda_cases=new RewriteRuleSubtreeStream(adaptor,"rule lambda_cases");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:490:2: ( lambda_cases -> ^( LAMBDA lambda_cases ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:490:4: lambda_cases
            {
            pushFollow(FOLLOW_lambda_cases_in_lambda_expr2955);
            lambda_cases225=lambda_cases();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_lambda_cases.add(lambda_cases225.getTree());


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
            // 490:17: -> ^( LAMBDA lambda_cases )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:490:20: ^( LAMBDA lambda_cases )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:492:1: lambda_cases : pattern ( NL )? token_DOUBLE_ARROW ( NL )? lop_expr -> ^( CASES ^( NIL_TOKEN pattern ^( BLOCK lop_expr ) ) ) ;
    public final babel17Parser.lambda_cases_return lambda_cases() throws RecognitionException {
        babel17Parser.lambda_cases_return retval = new babel17Parser.lambda_cases_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL227=null;
        Token NL229=null;
        babel17Parser.pattern_return pattern226 = null;

        babel17Parser.token_DOUBLE_ARROW_return token_DOUBLE_ARROW228 = null;

        babel17Parser.lop_expr_return lop_expr230 = null;


        CommonTree NL227_tree=null;
        CommonTree NL229_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_token_DOUBLE_ARROW=new RewriteRuleSubtreeStream(adaptor,"rule token_DOUBLE_ARROW");
        RewriteRuleSubtreeStream stream_lop_expr=new RewriteRuleSubtreeStream(adaptor,"rule lop_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:493:2: ( pattern ( NL )? token_DOUBLE_ARROW ( NL )? lop_expr -> ^( CASES ^( NIL_TOKEN pattern ^( BLOCK lop_expr ) ) ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:493:4: pattern ( NL )? token_DOUBLE_ARROW ( NL )? lop_expr
            {
            pushFollow(FOLLOW_pattern_in_lambda_cases2973);
            pattern226=pattern();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pattern.add(pattern226.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:493:12: ( NL )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==NL) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:493:12: NL
                    {
                    NL227=(Token)match(input,NL,FOLLOW_NL_in_lambda_cases2975); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL227);


                    }
                    break;

            }

            pushFollow(FOLLOW_token_DOUBLE_ARROW_in_lambda_cases2978);
            token_DOUBLE_ARROW228=token_DOUBLE_ARROW();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_token_DOUBLE_ARROW.add(token_DOUBLE_ARROW228.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:493:35: ( NL )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==NL) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:493:35: NL
                    {
                    NL229=(Token)match(input,NL,FOLLOW_NL_in_lambda_cases2980); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL229);


                    }
                    break;

            }

            pushFollow(FOLLOW_lop_expr_in_lambda_cases2983);
            lop_expr230=lop_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_lop_expr.add(lop_expr230.getTree());


            // AST REWRITE
            // elements: lop_expr, pattern
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 493:48: -> ^( CASES ^( NIL_TOKEN pattern ^( BLOCK lop_expr ) ) )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:493:51: ^( CASES ^( NIL_TOKEN pattern ^( BLOCK lop_expr ) ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CASES, "CASES"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:493:59: ^( NIL_TOKEN pattern ^( BLOCK lop_expr ) )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_2);

                adaptor.addChild(root_2, stream_pattern.nextTree());
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:493:79: ^( BLOCK lop_expr )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:495:1: protected_lambda_expr : protected_lambda_cases -> ^( LAMBDA protected_lambda_cases ) ;
    public final babel17Parser.protected_lambda_expr_return protected_lambda_expr() throws RecognitionException {
        babel17Parser.protected_lambda_expr_return retval = new babel17Parser.protected_lambda_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.protected_lambda_cases_return protected_lambda_cases231 = null;


        RewriteRuleSubtreeStream stream_protected_lambda_cases=new RewriteRuleSubtreeStream(adaptor,"rule protected_lambda_cases");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:496:2: ( protected_lambda_cases -> ^( LAMBDA protected_lambda_cases ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:496:4: protected_lambda_cases
            {
            pushFollow(FOLLOW_protected_lambda_cases_in_protected_lambda_expr3011);
            protected_lambda_cases231=protected_lambda_cases();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_protected_lambda_cases.add(protected_lambda_cases231.getTree());


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
            // 496:27: -> ^( LAMBDA protected_lambda_cases )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:496:30: ^( LAMBDA protected_lambda_cases )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:498:1: p_lambda_case_expr : ( L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block ) -> ^( NIL_TOKEN pattern pure_block ) ;
    public final babel17Parser.p_lambda_case_expr_return p_lambda_case_expr() throws RecognitionException {
        babel17Parser.p_lambda_case_expr_return retval = new babel17Parser.p_lambda_case_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_case232=null;
        Token NL233=null;
        Token NL235=null;
        Token NL237=null;
        babel17Parser.pattern_return pattern234 = null;

        babel17Parser.token_DOUBLE_ARROW_return token_DOUBLE_ARROW236 = null;

        babel17Parser.pure_block_return pure_block238 = null;


        CommonTree L_case232_tree=null;
        CommonTree NL233_tree=null;
        CommonTree NL235_tree=null;
        CommonTree NL237_tree=null;
        RewriteRuleTokenStream stream_L_case=new RewriteRuleTokenStream(adaptor,"token L_case");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_token_DOUBLE_ARROW=new RewriteRuleSubtreeStream(adaptor,"rule token_DOUBLE_ARROW");
        RewriteRuleSubtreeStream stream_pure_block=new RewriteRuleSubtreeStream(adaptor,"rule pure_block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:499:2: ( ( L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block ) -> ^( NIL_TOKEN pattern pure_block ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:499:4: ( L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block )
            {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:499:4: ( L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:499:5: L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block
            {
            L_case232=(Token)match(input,L_case,FOLLOW_L_case_in_p_lambda_case_expr3029); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_case.add(L_case232);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:499:12: ( NL )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==NL) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:499:12: NL
                    {
                    NL233=(Token)match(input,NL,FOLLOW_NL_in_p_lambda_case_expr3031); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL233);


                    }
                    break;

            }

            pushFollow(FOLLOW_pattern_in_p_lambda_case_expr3034);
            pattern234=pattern();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pattern.add(pattern234.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:499:24: ( NL )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==NL) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:499:24: NL
                    {
                    NL235=(Token)match(input,NL,FOLLOW_NL_in_p_lambda_case_expr3036); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL235);


                    }
                    break;

            }

            pushFollow(FOLLOW_token_DOUBLE_ARROW_in_p_lambda_case_expr3039);
            token_DOUBLE_ARROW236=token_DOUBLE_ARROW();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_token_DOUBLE_ARROW.add(token_DOUBLE_ARROW236.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:499:47: ( NL )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==NL) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:499:47: NL
                    {
                    NL237=(Token)match(input,NL,FOLLOW_NL_in_p_lambda_case_expr3041); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL237);


                    }
                    break;

            }

            pushFollow(FOLLOW_pure_block_in_p_lambda_case_expr3044);
            pure_block238=pure_block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pure_block.add(pure_block238.getTree());

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
            // 499:63: -> ^( NIL_TOKEN pattern pure_block )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:499:66: ^( NIL_TOKEN pattern pure_block )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:501:1: protected_lambda_cases : ( pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block -> ^( CASES ^( NIL_TOKEN pattern pure_block ) ) | ( p_lambda_case_expr )+ -> ^( CASES ( p_lambda_case_expr )+ ) );
    public final babel17Parser.protected_lambda_cases_return protected_lambda_cases() throws RecognitionException {
        babel17Parser.protected_lambda_cases_return retval = new babel17Parser.protected_lambda_cases_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL240=null;
        Token NL242=null;
        babel17Parser.pattern_return pattern239 = null;

        babel17Parser.token_DOUBLE_ARROW_return token_DOUBLE_ARROW241 = null;

        babel17Parser.pure_block_return pure_block243 = null;

        babel17Parser.p_lambda_case_expr_return p_lambda_case_expr244 = null;


        CommonTree NL240_tree=null;
        CommonTree NL242_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_token_DOUBLE_ARROW=new RewriteRuleSubtreeStream(adaptor,"rule token_DOUBLE_ARROW");
        RewriteRuleSubtreeStream stream_p_lambda_case_expr=new RewriteRuleSubtreeStream(adaptor,"rule p_lambda_case_expr");
        RewriteRuleSubtreeStream stream_pure_block=new RewriteRuleSubtreeStream(adaptor,"rule pure_block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:502:2: ( pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block -> ^( CASES ^( NIL_TOKEN pattern pure_block ) ) | ( p_lambda_case_expr )+ -> ^( CASES ( p_lambda_case_expr )+ ) )
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( ((LA106_0>=A_infinity && LA106_0<=U_infinity)||(LA106_0>=L_true && LA106_0<=L_false)||LA106_0==MINUS||(LA106_0>=Constr && LA106_0<=Num)||(LA106_0>=String && LA106_0<=ROUND_BRACKET_OPEN)||LA106_0==SQUARE_BRACKET_OPEN||LA106_0==CURLY_BRACKET_OPEN||LA106_0==UNDERSCORE) ) {
                alt106=1;
            }
            else if ( (LA106_0==L_case) ) {
                alt106=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 106, 0, input);

                throw nvae;
            }
            switch (alt106) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:502:4: pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block
                    {
                    pushFollow(FOLLOW_pattern_in_protected_lambda_cases3065);
                    pattern239=pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pattern.add(pattern239.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:502:12: ( NL )?
                    int alt103=2;
                    int LA103_0 = input.LA(1);

                    if ( (LA103_0==NL) ) {
                        alt103=1;
                    }
                    switch (alt103) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:502:12: NL
                            {
                            NL240=(Token)match(input,NL,FOLLOW_NL_in_protected_lambda_cases3067); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL240);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_token_DOUBLE_ARROW_in_protected_lambda_cases3070);
                    token_DOUBLE_ARROW241=token_DOUBLE_ARROW();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_token_DOUBLE_ARROW.add(token_DOUBLE_ARROW241.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:502:35: ( NL )?
                    int alt104=2;
                    int LA104_0 = input.LA(1);

                    if ( (LA104_0==NL) ) {
                        alt104=1;
                    }
                    switch (alt104) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:502:35: NL
                            {
                            NL242=(Token)match(input,NL,FOLLOW_NL_in_protected_lambda_cases3072); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL242);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_pure_block_in_protected_lambda_cases3075);
                    pure_block243=pure_block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pure_block.add(pure_block243.getTree());


                    // AST REWRITE
                    // elements: pure_block, pattern
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 502:50: -> ^( CASES ^( NIL_TOKEN pattern pure_block ) )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:502:53: ^( CASES ^( NIL_TOKEN pattern pure_block ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CASES, "CASES"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:502:61: ^( NIL_TOKEN pattern pure_block )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:503:4: ( p_lambda_case_expr )+
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:503:4: ( p_lambda_case_expr )+
                    int cnt105=0;
                    loop105:
                    do {
                        int alt105=2;
                        int LA105_0 = input.LA(1);

                        if ( (LA105_0==L_case) ) {
                            alt105=1;
                        }


                        switch (alt105) {
                    	case 1 :
                    	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:503:4: p_lambda_case_expr
                    	    {
                    	    pushFollow(FOLLOW_p_lambda_case_expr_in_protected_lambda_cases3094);
                    	    p_lambda_case_expr244=p_lambda_case_expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_p_lambda_case_expr.add(p_lambda_case_expr244.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt105 >= 1 ) break loop105;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(105, input);
                                throw eee;
                        }
                        cnt105++;
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
                    // 503:24: -> ^( CASES ( p_lambda_case_expr )+ )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:503:27: ^( CASES ( p_lambda_case_expr )+ )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:505:1: for_expr : L_for ( NL )? pattern ( NL )? L_in ( NL )? protected_expr ( NL )? L_do block L_end -> ^( FOR_EXPR pattern protected_expr block ) ;
    public final babel17Parser.for_expr_return for_expr() throws RecognitionException {
        babel17Parser.for_expr_return retval = new babel17Parser.for_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_for245=null;
        Token NL246=null;
        Token NL248=null;
        Token L_in249=null;
        Token NL250=null;
        Token NL252=null;
        Token L_do253=null;
        Token L_end255=null;
        babel17Parser.pattern_return pattern247 = null;

        babel17Parser.protected_expr_return protected_expr251 = null;

        babel17Parser.block_return block254 = null;


        CommonTree L_for245_tree=null;
        CommonTree NL246_tree=null;
        CommonTree NL248_tree=null;
        CommonTree L_in249_tree=null;
        CommonTree NL250_tree=null;
        CommonTree NL252_tree=null;
        CommonTree L_do253_tree=null;
        CommonTree L_end255_tree=null;
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleTokenStream stream_L_for=new RewriteRuleTokenStream(adaptor,"token L_for");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_in=new RewriteRuleTokenStream(adaptor,"token L_in");
        RewriteRuleTokenStream stream_L_do=new RewriteRuleTokenStream(adaptor,"token L_do");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_protected_expr=new RewriteRuleSubtreeStream(adaptor,"rule protected_expr");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:505:9: ( L_for ( NL )? pattern ( NL )? L_in ( NL )? protected_expr ( NL )? L_do block L_end -> ^( FOR_EXPR pattern protected_expr block ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:505:11: L_for ( NL )? pattern ( NL )? L_in ( NL )? protected_expr ( NL )? L_do block L_end
            {
            L_for245=(Token)match(input,L_for,FOLLOW_L_for_in_for_expr3111); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_for.add(L_for245);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:505:17: ( NL )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==NL) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:505:17: NL
                    {
                    NL246=(Token)match(input,NL,FOLLOW_NL_in_for_expr3113); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL246);


                    }
                    break;

            }

            pushFollow(FOLLOW_pattern_in_for_expr3116);
            pattern247=pattern();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pattern.add(pattern247.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:505:29: ( NL )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==NL) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:505:29: NL
                    {
                    NL248=(Token)match(input,NL,FOLLOW_NL_in_for_expr3118); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL248);


                    }
                    break;

            }

            L_in249=(Token)match(input,L_in,FOLLOW_L_in_in_for_expr3121); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_in.add(L_in249);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:505:38: ( NL )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==NL) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:505:38: NL
                    {
                    NL250=(Token)match(input,NL,FOLLOW_NL_in_for_expr3123); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL250);


                    }
                    break;

            }

            pushFollow(FOLLOW_protected_expr_in_for_expr3126);
            protected_expr251=protected_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr251.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:505:57: ( NL )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==NL) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:505:57: NL
                    {
                    NL252=(Token)match(input,NL,FOLLOW_NL_in_for_expr3128); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL252);


                    }
                    break;

            }

            L_do253=(Token)match(input,L_do,FOLLOW_L_do_in_for_expr3131); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_do.add(L_do253);

            pushFollow(FOLLOW_block_in_for_expr3133);
            block254=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block254.getTree());
            L_end255=(Token)match(input,L_end,FOLLOW_L_end_in_for_expr3135); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_end.add(L_end255);



            // AST REWRITE
            // elements: pattern, block, protected_expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 506:5: -> ^( FOR_EXPR pattern protected_expr block )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:506:8: ^( FOR_EXPR pattern protected_expr block )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:508:1: op_expr : ( builtin_primitive op_expr | bool_expr );
    public final babel17Parser.op_expr_return op_expr() throws RecognitionException {
        babel17Parser.op_expr_return retval = new babel17Parser.op_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.builtin_primitive_return builtin_primitive256 = null;

        babel17Parser.op_expr_return op_expr257 = null;

        babel17Parser.bool_expr_return bool_expr258 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:508:9: ( builtin_primitive op_expr | bool_expr )
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==L_exception||(LA111_0>=L_concurrent && LA111_0<=L_lazy)||LA111_0==L_random||LA111_0==TILDE) ) {
                alt111=1;
            }
            else if ( (LA111_0==L_begin||(LA111_0>=L_with && LA111_0<=L_if)||(LA111_0>=L_while && LA111_0<=L_for)||LA111_0==L_match||(LA111_0>=A_infinity && LA111_0<=U_infinity)||(LA111_0>=L_true && LA111_0<=L_this)||LA111_0==MINUS||LA111_0==A_NOT||LA111_0==U_NOT||(LA111_0>=Constr && LA111_0<=Num)||(LA111_0>=String && LA111_0<=ROUND_BRACKET_OPEN)||LA111_0==SQUARE_BRACKET_OPEN||LA111_0==CURLY_BRACKET_OPEN) ) {
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:508:11: builtin_primitive op_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_builtin_primitive_in_op_expr3160);
                    builtin_primitive256=builtin_primitive();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(builtin_primitive256.getTree(), root_0);
                    pushFollow(FOLLOW_op_expr_in_op_expr3163);
                    op_expr257=op_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, op_expr257.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:509:4: bool_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_bool_expr_in_op_expr3168);
                    bool_expr258=bool_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_expr258.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:511:1: p_op_expr : ( builtin_primitive ( NL )? p_op_expr | p_bool_expr );
    public final babel17Parser.p_op_expr_return p_op_expr() throws RecognitionException {
        babel17Parser.p_op_expr_return retval = new babel17Parser.p_op_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL260=null;
        babel17Parser.builtin_primitive_return builtin_primitive259 = null;

        babel17Parser.p_op_expr_return p_op_expr261 = null;

        babel17Parser.p_bool_expr_return p_bool_expr262 = null;


        CommonTree NL260_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:512:2: ( builtin_primitive ( NL )? p_op_expr | p_bool_expr )
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==L_exception||(LA113_0>=L_concurrent && LA113_0<=L_lazy)||LA113_0==L_random||LA113_0==TILDE) ) {
                alt113=1;
            }
            else if ( (LA113_0==L_begin||(LA113_0>=L_with && LA113_0<=L_if)||(LA113_0>=L_while && LA113_0<=L_for)||LA113_0==L_match||(LA113_0>=A_infinity && LA113_0<=U_infinity)||(LA113_0>=L_true && LA113_0<=L_this)||LA113_0==MINUS||LA113_0==A_NOT||LA113_0==U_NOT||(LA113_0>=Constr && LA113_0<=Num)||(LA113_0>=String && LA113_0<=ROUND_BRACKET_OPEN)||LA113_0==SQUARE_BRACKET_OPEN||LA113_0==CURLY_BRACKET_OPEN) ) {
                alt113=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 113, 0, input);

                throw nvae;
            }
            switch (alt113) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:512:4: builtin_primitive ( NL )? p_op_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_builtin_primitive_in_p_op_expr3178);
                    builtin_primitive259=builtin_primitive();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(builtin_primitive259.getTree(), root_0);
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:512:25: ( NL )?
                    int alt112=2;
                    int LA112_0 = input.LA(1);

                    if ( (LA112_0==NL) ) {
                        alt112=1;
                    }
                    switch (alt112) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:512:25: NL
                            {
                            NL260=(Token)match(input,NL,FOLLOW_NL_in_p_op_expr3181); if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_p_op_expr_in_p_op_expr3185);
                    p_op_expr261=p_op_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_op_expr261.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:513:4: p_bool_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_p_bool_expr_in_p_op_expr3190);
                    p_bool_expr262=p_bool_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_bool_expr262.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:516:1: builtin_primitive : ( L_random | L_await | L_exception | L_lazy | TILDE | L_concurrent );
    public final babel17Parser.builtin_primitive_return builtin_primitive() throws RecognitionException {
        babel17Parser.builtin_primitive_return retval = new babel17Parser.builtin_primitive_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set263=null;

        CommonTree set263_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:517:2: ( L_random | L_await | L_exception | L_lazy | TILDE | L_concurrent )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set263=(Token)input.LT(1);
            if ( input.LA(1)==L_exception||(input.LA(1)>=L_concurrent && input.LA(1)<=L_lazy)||input.LA(1)==L_random||input.LA(1)==TILDE ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set263));
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:519:1: bool_expr : bool_or_expr ;
    public final babel17Parser.bool_expr_return bool_expr() throws RecognitionException {
        babel17Parser.bool_expr_return retval = new babel17Parser.bool_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.bool_or_expr_return bool_or_expr264 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:520:2: ( bool_or_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:520:4: bool_or_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bool_or_expr_in_bool_expr3230);
            bool_or_expr264=bool_or_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_or_expr264.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:522:1: p_bool_expr : p_bool_or_expr ;
    public final babel17Parser.p_bool_expr_return p_bool_expr() throws RecognitionException {
        babel17Parser.p_bool_expr_return retval = new babel17Parser.p_bool_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.p_bool_or_expr_return p_bool_or_expr265 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:523:2: ( p_bool_or_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:523:4: p_bool_or_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_bool_or_expr_in_p_bool_expr3240);
            p_bool_or_expr265=p_bool_or_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_bool_or_expr265.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:525:1: bool_or_expr : bool_and_expr ( ( NL )? token_OR ( NL )? bool_and_expr )* ;
    public final babel17Parser.bool_or_expr_return bool_or_expr() throws RecognitionException {
        babel17Parser.bool_or_expr_return retval = new babel17Parser.bool_or_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL267=null;
        Token NL269=null;
        babel17Parser.bool_and_expr_return bool_and_expr266 = null;

        babel17Parser.token_OR_return token_OR268 = null;

        babel17Parser.bool_and_expr_return bool_and_expr270 = null;


        CommonTree NL267_tree=null;
        CommonTree NL269_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:526:2: ( bool_and_expr ( ( NL )? token_OR ( NL )? bool_and_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:526:4: bool_and_expr ( ( NL )? token_OR ( NL )? bool_and_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bool_and_expr_in_bool_or_expr3249);
            bool_and_expr266=bool_and_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_and_expr266.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:526:18: ( ( NL )? token_OR ( NL )? bool_and_expr )*
            loop116:
            do {
                int alt116=2;
                int LA116_0 = input.LA(1);

                if ( (LA116_0==NL) ) {
                    int LA116_1 = input.LA(2);

                    if ( (LA116_1==A_OR||LA116_1==U_OR) ) {
                        alt116=1;
                    }


                }
                else if ( (LA116_0==A_OR||LA116_0==U_OR) ) {
                    alt116=1;
                }


                switch (alt116) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:526:19: ( NL )? token_OR ( NL )? bool_and_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:526:21: ( NL )?
            	    int alt114=2;
            	    int LA114_0 = input.LA(1);

            	    if ( (LA114_0==NL) ) {
            	        alt114=1;
            	    }
            	    switch (alt114) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:526:21: NL
            	            {
            	            NL267=(Token)match(input,NL,FOLLOW_NL_in_bool_or_expr3252); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_token_OR_in_bool_or_expr3256);
            	    token_OR268=token_OR();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(token_OR268.getTree(), root_0);
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:526:36: ( NL )?
            	    int alt115=2;
            	    int LA115_0 = input.LA(1);

            	    if ( (LA115_0==NL) ) {
            	        alt115=1;
            	    }
            	    switch (alt115) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:526:36: NL
            	            {
            	            NL269=(Token)match(input,NL,FOLLOW_NL_in_bool_or_expr3259); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_bool_and_expr_in_bool_or_expr3263);
            	    bool_and_expr270=bool_and_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_and_expr270.getTree());

            	    }
            	    break;

            	default :
            	    break loop116;
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:528:1: p_bool_or_expr : p_bool_and_expr ( ( NL )? token_OR ( NL )? p_bool_and_expr )* ;
    public final babel17Parser.p_bool_or_expr_return p_bool_or_expr() throws RecognitionException {
        babel17Parser.p_bool_or_expr_return retval = new babel17Parser.p_bool_or_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL272=null;
        Token NL274=null;
        babel17Parser.p_bool_and_expr_return p_bool_and_expr271 = null;

        babel17Parser.token_OR_return token_OR273 = null;

        babel17Parser.p_bool_and_expr_return p_bool_and_expr275 = null;


        CommonTree NL272_tree=null;
        CommonTree NL274_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:529:2: ( p_bool_and_expr ( ( NL )? token_OR ( NL )? p_bool_and_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:529:4: p_bool_and_expr ( ( NL )? token_OR ( NL )? p_bool_and_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_bool_and_expr_in_p_bool_or_expr3275);
            p_bool_and_expr271=p_bool_and_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_bool_and_expr271.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:529:20: ( ( NL )? token_OR ( NL )? p_bool_and_expr )*
            loop119:
            do {
                int alt119=2;
                int LA119_0 = input.LA(1);

                if ( (LA119_0==NL) ) {
                    int LA119_1 = input.LA(2);

                    if ( (LA119_1==A_OR||LA119_1==U_OR) ) {
                        alt119=1;
                    }


                }
                else if ( (LA119_0==A_OR||LA119_0==U_OR) ) {
                    alt119=1;
                }


                switch (alt119) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:529:21: ( NL )? token_OR ( NL )? p_bool_and_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:529:23: ( NL )?
            	    int alt117=2;
            	    int LA117_0 = input.LA(1);

            	    if ( (LA117_0==NL) ) {
            	        alt117=1;
            	    }
            	    switch (alt117) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:529:23: NL
            	            {
            	            NL272=(Token)match(input,NL,FOLLOW_NL_in_p_bool_or_expr3278); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_token_OR_in_p_bool_or_expr3282);
            	    token_OR273=token_OR();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(token_OR273.getTree(), root_0);
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:529:38: ( NL )?
            	    int alt118=2;
            	    int LA118_0 = input.LA(1);

            	    if ( (LA118_0==NL) ) {
            	        alt118=1;
            	    }
            	    switch (alt118) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:529:38: NL
            	            {
            	            NL274=(Token)match(input,NL,FOLLOW_NL_in_p_bool_or_expr3285); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_bool_and_expr_in_p_bool_or_expr3289);
            	    p_bool_and_expr275=p_bool_and_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_bool_and_expr275.getTree());

            	    }
            	    break;

            	default :
            	    break loop119;
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:531:1: bool_and_expr : bool_not_expr ( ( NL )? token_AND ( NL )? bool_not_expr )* ;
    public final babel17Parser.bool_and_expr_return bool_and_expr() throws RecognitionException {
        babel17Parser.bool_and_expr_return retval = new babel17Parser.bool_and_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL277=null;
        Token NL279=null;
        babel17Parser.bool_not_expr_return bool_not_expr276 = null;

        babel17Parser.token_AND_return token_AND278 = null;

        babel17Parser.bool_not_expr_return bool_not_expr280 = null;


        CommonTree NL277_tree=null;
        CommonTree NL279_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:532:2: ( bool_not_expr ( ( NL )? token_AND ( NL )? bool_not_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:532:4: bool_not_expr ( ( NL )? token_AND ( NL )? bool_not_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bool_not_expr_in_bool_and_expr3301);
            bool_not_expr276=bool_not_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_not_expr276.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:532:18: ( ( NL )? token_AND ( NL )? bool_not_expr )*
            loop122:
            do {
                int alt122=2;
                int LA122_0 = input.LA(1);

                if ( (LA122_0==NL) ) {
                    int LA122_1 = input.LA(2);

                    if ( (LA122_1==A_AND||LA122_1==U_AND) ) {
                        alt122=1;
                    }


                }
                else if ( (LA122_0==A_AND||LA122_0==U_AND) ) {
                    alt122=1;
                }


                switch (alt122) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:532:19: ( NL )? token_AND ( NL )? bool_not_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:532:21: ( NL )?
            	    int alt120=2;
            	    int LA120_0 = input.LA(1);

            	    if ( (LA120_0==NL) ) {
            	        alt120=1;
            	    }
            	    switch (alt120) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:532:21: NL
            	            {
            	            NL277=(Token)match(input,NL,FOLLOW_NL_in_bool_and_expr3304); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_token_AND_in_bool_and_expr3308);
            	    token_AND278=token_AND();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(token_AND278.getTree(), root_0);
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:532:37: ( NL )?
            	    int alt121=2;
            	    int LA121_0 = input.LA(1);

            	    if ( (LA121_0==NL) ) {
            	        alt121=1;
            	    }
            	    switch (alt121) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:532:37: NL
            	            {
            	            NL279=(Token)match(input,NL,FOLLOW_NL_in_bool_and_expr3311); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_bool_not_expr_in_bool_and_expr3315);
            	    bool_not_expr280=bool_not_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_not_expr280.getTree());

            	    }
            	    break;

            	default :
            	    break loop122;
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:534:1: p_bool_and_expr : p_bool_not_expr ( ( NL )? token_AND ( NL )? p_bool_not_expr )* ;
    public final babel17Parser.p_bool_and_expr_return p_bool_and_expr() throws RecognitionException {
        babel17Parser.p_bool_and_expr_return retval = new babel17Parser.p_bool_and_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL282=null;
        Token NL284=null;
        babel17Parser.p_bool_not_expr_return p_bool_not_expr281 = null;

        babel17Parser.token_AND_return token_AND283 = null;

        babel17Parser.p_bool_not_expr_return p_bool_not_expr285 = null;


        CommonTree NL282_tree=null;
        CommonTree NL284_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:535:2: ( p_bool_not_expr ( ( NL )? token_AND ( NL )? p_bool_not_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:535:4: p_bool_not_expr ( ( NL )? token_AND ( NL )? p_bool_not_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_bool_not_expr_in_p_bool_and_expr3327);
            p_bool_not_expr281=p_bool_not_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_bool_not_expr281.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:535:20: ( ( NL )? token_AND ( NL )? p_bool_not_expr )*
            loop125:
            do {
                int alt125=2;
                int LA125_0 = input.LA(1);

                if ( (LA125_0==NL) ) {
                    int LA125_1 = input.LA(2);

                    if ( (LA125_1==A_AND||LA125_1==U_AND) ) {
                        alt125=1;
                    }


                }
                else if ( (LA125_0==A_AND||LA125_0==U_AND) ) {
                    alt125=1;
                }


                switch (alt125) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:535:21: ( NL )? token_AND ( NL )? p_bool_not_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:535:23: ( NL )?
            	    int alt123=2;
            	    int LA123_0 = input.LA(1);

            	    if ( (LA123_0==NL) ) {
            	        alt123=1;
            	    }
            	    switch (alt123) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:535:23: NL
            	            {
            	            NL282=(Token)match(input,NL,FOLLOW_NL_in_p_bool_and_expr3330); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_token_AND_in_p_bool_and_expr3334);
            	    token_AND283=token_AND();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(token_AND283.getTree(), root_0);
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:535:39: ( NL )?
            	    int alt124=2;
            	    int LA124_0 = input.LA(1);

            	    if ( (LA124_0==NL) ) {
            	        alt124=1;
            	    }
            	    switch (alt124) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:535:39: NL
            	            {
            	            NL284=(Token)match(input,NL,FOLLOW_NL_in_p_bool_and_expr3337); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_bool_not_expr_in_p_bool_and_expr3341);
            	    p_bool_not_expr285=p_bool_not_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_bool_not_expr285.getTree());

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
    // $ANTLR end "p_bool_and_expr"

    public static class bool_not_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bool_not_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:538:1: bool_not_expr : ( token_NOT ( NL )? bool_not_expr | rel_expr );
    public final babel17Parser.bool_not_expr_return bool_not_expr() throws RecognitionException {
        babel17Parser.bool_not_expr_return retval = new babel17Parser.bool_not_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL287=null;
        babel17Parser.token_NOT_return token_NOT286 = null;

        babel17Parser.bool_not_expr_return bool_not_expr288 = null;

        babel17Parser.rel_expr_return rel_expr289 = null;


        CommonTree NL287_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:539:2: ( token_NOT ( NL )? bool_not_expr | rel_expr )
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==A_NOT||LA127_0==U_NOT) ) {
                alt127=1;
            }
            else if ( (LA127_0==L_begin||(LA127_0>=L_with && LA127_0<=L_if)||(LA127_0>=L_while && LA127_0<=L_for)||LA127_0==L_match||(LA127_0>=A_infinity && LA127_0<=U_infinity)||(LA127_0>=L_true && LA127_0<=L_this)||LA127_0==MINUS||(LA127_0>=Constr && LA127_0<=Num)||(LA127_0>=String && LA127_0<=ROUND_BRACKET_OPEN)||LA127_0==SQUARE_BRACKET_OPEN||LA127_0==CURLY_BRACKET_OPEN) ) {
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:539:4: token_NOT ( NL )? bool_not_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_NOT_in_bool_not_expr3353);
                    token_NOT286=token_NOT();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(token_NOT286.getTree(), root_0);
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:539:17: ( NL )?
                    int alt126=2;
                    int LA126_0 = input.LA(1);

                    if ( (LA126_0==NL) ) {
                        alt126=1;
                    }
                    switch (alt126) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:539:17: NL
                            {
                            NL287=(Token)match(input,NL,FOLLOW_NL_in_bool_not_expr3356); if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_bool_not_expr_in_bool_not_expr3360);
                    bool_not_expr288=bool_not_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_not_expr288.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:540:4: rel_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_rel_expr_in_bool_not_expr3365);
                    rel_expr289=rel_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rel_expr289.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:542:1: p_bool_not_expr : ( token_NOT ( NL )? p_bool_not_expr | p_rel_expr );
    public final babel17Parser.p_bool_not_expr_return p_bool_not_expr() throws RecognitionException {
        babel17Parser.p_bool_not_expr_return retval = new babel17Parser.p_bool_not_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL291=null;
        babel17Parser.token_NOT_return token_NOT290 = null;

        babel17Parser.p_bool_not_expr_return p_bool_not_expr292 = null;

        babel17Parser.p_rel_expr_return p_rel_expr293 = null;


        CommonTree NL291_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:543:2: ( token_NOT ( NL )? p_bool_not_expr | p_rel_expr )
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==A_NOT||LA129_0==U_NOT) ) {
                alt129=1;
            }
            else if ( (LA129_0==L_begin||(LA129_0>=L_with && LA129_0<=L_if)||(LA129_0>=L_while && LA129_0<=L_for)||LA129_0==L_match||(LA129_0>=A_infinity && LA129_0<=U_infinity)||(LA129_0>=L_true && LA129_0<=L_this)||LA129_0==MINUS||(LA129_0>=Constr && LA129_0<=Num)||(LA129_0>=String && LA129_0<=ROUND_BRACKET_OPEN)||LA129_0==SQUARE_BRACKET_OPEN||LA129_0==CURLY_BRACKET_OPEN) ) {
                alt129=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 129, 0, input);

                throw nvae;
            }
            switch (alt129) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:543:4: token_NOT ( NL )? p_bool_not_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_NOT_in_p_bool_not_expr3376);
                    token_NOT290=token_NOT();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(token_NOT290.getTree(), root_0);
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:543:17: ( NL )?
                    int alt128=2;
                    int LA128_0 = input.LA(1);

                    if ( (LA128_0==NL) ) {
                        alt128=1;
                    }
                    switch (alt128) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:543:17: NL
                            {
                            NL291=(Token)match(input,NL,FOLLOW_NL_in_p_bool_not_expr3379); if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_p_bool_not_expr_in_p_bool_not_expr3383);
                    p_bool_not_expr292=p_bool_not_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_bool_not_expr292.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:544:4: p_rel_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_p_rel_expr_in_p_bool_not_expr3388);
                    p_rel_expr293=p_rel_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_rel_expr293.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:546:1: rel_expr : arith_expr ( ( NL )? rel_op ( NL )? arith_expr )* -> ^( COMPARE arith_expr ( rel_op arith_expr )* ) ;
    public final babel17Parser.rel_expr_return rel_expr() throws RecognitionException {
        babel17Parser.rel_expr_return retval = new babel17Parser.rel_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL295=null;
        Token NL297=null;
        babel17Parser.arith_expr_return arith_expr294 = null;

        babel17Parser.rel_op_return rel_op296 = null;

        babel17Parser.arith_expr_return arith_expr298 = null;


        CommonTree NL295_tree=null;
        CommonTree NL297_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_arith_expr=new RewriteRuleSubtreeStream(adaptor,"rule arith_expr");
        RewriteRuleSubtreeStream stream_rel_op=new RewriteRuleSubtreeStream(adaptor,"rule rel_op");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:547:2: ( arith_expr ( ( NL )? rel_op ( NL )? arith_expr )* -> ^( COMPARE arith_expr ( rel_op arith_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:547:4: arith_expr ( ( NL )? rel_op ( NL )? arith_expr )*
            {
            pushFollow(FOLLOW_arith_expr_in_rel_expr3397);
            arith_expr294=arith_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_arith_expr.add(arith_expr294.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:547:15: ( ( NL )? rel_op ( NL )? arith_expr )*
            loop132:
            do {
                int alt132=2;
                int LA132_0 = input.LA(1);

                if ( (LA132_0==NL) ) {
                    int LA132_1 = input.LA(2);

                    if ( ((LA132_1>=A_EQUAL && LA132_1<=UNRELATED)) ) {
                        alt132=1;
                    }


                }
                else if ( ((LA132_0>=A_EQUAL && LA132_0<=UNRELATED)) ) {
                    alt132=1;
                }


                switch (alt132) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:547:16: ( NL )? rel_op ( NL )? arith_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:547:16: ( NL )?
            	    int alt130=2;
            	    int LA130_0 = input.LA(1);

            	    if ( (LA130_0==NL) ) {
            	        alt130=1;
            	    }
            	    switch (alt130) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:547:16: NL
            	            {
            	            NL295=(Token)match(input,NL,FOLLOW_NL_in_rel_expr3400); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL295);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_rel_op_in_rel_expr3403);
            	    rel_op296=rel_op();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_rel_op.add(rel_op296.getTree());
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:547:27: ( NL )?
            	    int alt131=2;
            	    int LA131_0 = input.LA(1);

            	    if ( (LA131_0==NL) ) {
            	        alt131=1;
            	    }
            	    switch (alt131) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:547:27: NL
            	            {
            	            NL297=(Token)match(input,NL,FOLLOW_NL_in_rel_expr3405); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL297);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_arith_expr_in_rel_expr3408);
            	    arith_expr298=arith_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_arith_expr.add(arith_expr298.getTree());

            	    }
            	    break;

            	default :
            	    break loop132;
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
            // 547:44: -> ^( COMPARE arith_expr ( rel_op arith_expr )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:547:47: ^( COMPARE arith_expr ( rel_op arith_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COMPARE, "COMPARE"), root_1);

                adaptor.addChild(root_1, stream_arith_expr.nextTree());
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:547:68: ( rel_op arith_expr )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:549:1: p_rel_expr : p_arith_expr ( ( NL )? rel_op ( NL )? p_arith_expr )* -> ^( COMPARE p_arith_expr ( rel_op p_arith_expr )* ) ;
    public final babel17Parser.p_rel_expr_return p_rel_expr() throws RecognitionException {
        babel17Parser.p_rel_expr_return retval = new babel17Parser.p_rel_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL300=null;
        Token NL302=null;
        babel17Parser.p_arith_expr_return p_arith_expr299 = null;

        babel17Parser.rel_op_return rel_op301 = null;

        babel17Parser.p_arith_expr_return p_arith_expr303 = null;


        CommonTree NL300_tree=null;
        CommonTree NL302_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_p_arith_expr=new RewriteRuleSubtreeStream(adaptor,"rule p_arith_expr");
        RewriteRuleSubtreeStream stream_rel_op=new RewriteRuleSubtreeStream(adaptor,"rule rel_op");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:550:2: ( p_arith_expr ( ( NL )? rel_op ( NL )? p_arith_expr )* -> ^( COMPARE p_arith_expr ( rel_op p_arith_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:550:4: p_arith_expr ( ( NL )? rel_op ( NL )? p_arith_expr )*
            {
            pushFollow(FOLLOW_p_arith_expr_in_p_rel_expr3435);
            p_arith_expr299=p_arith_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_p_arith_expr.add(p_arith_expr299.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:550:17: ( ( NL )? rel_op ( NL )? p_arith_expr )*
            loop135:
            do {
                int alt135=2;
                int LA135_0 = input.LA(1);

                if ( (LA135_0==NL) ) {
                    int LA135_1 = input.LA(2);

                    if ( ((LA135_1>=A_EQUAL && LA135_1<=UNRELATED)) ) {
                        alt135=1;
                    }


                }
                else if ( ((LA135_0>=A_EQUAL && LA135_0<=UNRELATED)) ) {
                    alt135=1;
                }


                switch (alt135) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:550:18: ( NL )? rel_op ( NL )? p_arith_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:550:18: ( NL )?
            	    int alt133=2;
            	    int LA133_0 = input.LA(1);

            	    if ( (LA133_0==NL) ) {
            	        alt133=1;
            	    }
            	    switch (alt133) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:550:18: NL
            	            {
            	            NL300=(Token)match(input,NL,FOLLOW_NL_in_p_rel_expr3438); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL300);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_rel_op_in_p_rel_expr3441);
            	    rel_op301=rel_op();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_rel_op.add(rel_op301.getTree());
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:550:29: ( NL )?
            	    int alt134=2;
            	    int LA134_0 = input.LA(1);

            	    if ( (LA134_0==NL) ) {
            	        alt134=1;
            	    }
            	    switch (alt134) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:550:29: NL
            	            {
            	            NL302=(Token)match(input,NL,FOLLOW_NL_in_p_rel_expr3443); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL302);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_arith_expr_in_p_rel_expr3446);
            	    p_arith_expr303=p_arith_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_p_arith_expr.add(p_arith_expr303.getTree());

            	    }
            	    break;

            	default :
            	    break loop135;
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
            // 550:48: -> ^( COMPARE p_arith_expr ( rel_op p_arith_expr )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:550:51: ^( COMPARE p_arith_expr ( rel_op p_arith_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COMPARE, "COMPARE"), root_1);

                adaptor.addChild(root_1, stream_p_arith_expr.nextTree());
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:550:74: ( rel_op p_arith_expr )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:553:1: rel_op : ( token_EQUAL | token_NOT_EQUAL | UNRELATED | GREATER | token_GREATER_EQ | LESS | token_LESS_EQ );
    public final babel17Parser.rel_op_return rel_op() throws RecognitionException {
        babel17Parser.rel_op_return retval = new babel17Parser.rel_op_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token UNRELATED306=null;
        Token GREATER307=null;
        Token LESS309=null;
        babel17Parser.token_EQUAL_return token_EQUAL304 = null;

        babel17Parser.token_NOT_EQUAL_return token_NOT_EQUAL305 = null;

        babel17Parser.token_GREATER_EQ_return token_GREATER_EQ308 = null;

        babel17Parser.token_LESS_EQ_return token_LESS_EQ310 = null;


        CommonTree UNRELATED306_tree=null;
        CommonTree GREATER307_tree=null;
        CommonTree LESS309_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:553:8: ( token_EQUAL | token_NOT_EQUAL | UNRELATED | GREATER | token_GREATER_EQ | LESS | token_LESS_EQ )
            int alt136=7;
            switch ( input.LA(1) ) {
            case A_EQUAL:
            case U_EQUAL:
                {
                alt136=1;
                }
                break;
            case A_NOT_EQUAL:
            case U_NOT_EQUAL:
                {
                alt136=2;
                }
                break;
            case UNRELATED:
                {
                alt136=3;
                }
                break;
            case GREATER:
                {
                alt136=4;
                }
                break;
            case A_GREATER_EQ:
            case U_GREATER_EQ:
                {
                alt136=5;
                }
                break;
            case LESS:
                {
                alt136=6;
                }
                break;
            case A_LESS_EQ:
            case U_LESS_EQ:
                {
                alt136=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 136, 0, input);

                throw nvae;
            }

            switch (alt136) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:553:10: token_EQUAL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_EQUAL_in_rel_op3472);
                    token_EQUAL304=token_EQUAL();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, token_EQUAL304.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:553:24: token_NOT_EQUAL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_NOT_EQUAL_in_rel_op3476);
                    token_NOT_EQUAL305=token_NOT_EQUAL();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, token_NOT_EQUAL305.getTree());

                    }
                    break;
                case 3 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:553:42: UNRELATED
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    UNRELATED306=(Token)match(input,UNRELATED,FOLLOW_UNRELATED_in_rel_op3480); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UNRELATED306_tree = (CommonTree)adaptor.create(UNRELATED306);
                    adaptor.addChild(root_0, UNRELATED306_tree);
                    }

                    }
                    break;
                case 4 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:553:54: GREATER
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    GREATER307=(Token)match(input,GREATER,FOLLOW_GREATER_in_rel_op3484); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    GREATER307_tree = (CommonTree)adaptor.create(GREATER307);
                    adaptor.addChild(root_0, GREATER307_tree);
                    }

                    }
                    break;
                case 5 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:553:64: token_GREATER_EQ
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_GREATER_EQ_in_rel_op3488);
                    token_GREATER_EQ308=token_GREATER_EQ();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, token_GREATER_EQ308.getTree());

                    }
                    break;
                case 6 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:553:83: LESS
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    LESS309=(Token)match(input,LESS,FOLLOW_LESS_in_rel_op3492); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LESS309_tree = (CommonTree)adaptor.create(LESS309);
                    adaptor.addChild(root_0, LESS309_tree);
                    }

                    }
                    break;
                case 7 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:553:90: token_LESS_EQ
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_LESS_EQ_in_rel_op3496);
                    token_LESS_EQ310=token_LESS_EQ();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, token_LESS_EQ310.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:556:1: arith_expr : plusplus_expr ;
    public final babel17Parser.arith_expr_return arith_expr() throws RecognitionException {
        babel17Parser.arith_expr_return retval = new babel17Parser.arith_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.plusplus_expr_return plusplus_expr311 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:557:2: ( plusplus_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:557:4: plusplus_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_plusplus_expr_in_arith_expr3508);
            plusplus_expr311=plusplus_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, plusplus_expr311.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:560:1: p_arith_expr : p_plusplus_expr ;
    public final babel17Parser.p_arith_expr_return p_arith_expr() throws RecognitionException {
        babel17Parser.p_arith_expr_return retval = new babel17Parser.p_arith_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.p_plusplus_expr_return p_plusplus_expr312 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:561:2: ( p_plusplus_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:561:4: p_plusplus_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_plusplus_expr_in_p_arith_expr3518);
            p_plusplus_expr312=p_plusplus_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_plusplus_expr312.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:563:1: plusplus_expr : timestimes_expr ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? timestimes_expr )* ;
    public final babel17Parser.plusplus_expr_return plusplus_expr() throws RecognitionException {
        babel17Parser.plusplus_expr_return retval = new babel17Parser.plusplus_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL314=null;
        Token PLUSPLUS315=null;
        Token MINUSMINUS316=null;
        Token NL317=null;
        babel17Parser.timestimes_expr_return timestimes_expr313 = null;

        babel17Parser.timestimes_expr_return timestimes_expr318 = null;


        CommonTree NL314_tree=null;
        CommonTree PLUSPLUS315_tree=null;
        CommonTree MINUSMINUS316_tree=null;
        CommonTree NL317_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:564:2: ( timestimes_expr ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? timestimes_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:564:4: timestimes_expr ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? timestimes_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_timestimes_expr_in_plusplus_expr3528);
            timestimes_expr313=timestimes_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, timestimes_expr313.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:564:20: ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? timestimes_expr )*
            loop140:
            do {
                int alt140=2;
                int LA140_0 = input.LA(1);

                if ( (LA140_0==NL) ) {
                    int LA140_1 = input.LA(2);

                    if ( ((LA140_1>=PLUSPLUS && LA140_1<=MINUSMINUS)) ) {
                        alt140=1;
                    }


                }
                else if ( ((LA140_0>=PLUSPLUS && LA140_0<=MINUSMINUS)) ) {
                    alt140=1;
                }


                switch (alt140) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:564:21: ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? timestimes_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:564:23: ( NL )?
            	    int alt137=2;
            	    int LA137_0 = input.LA(1);

            	    if ( (LA137_0==NL) ) {
            	        alt137=1;
            	    }
            	    switch (alt137) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:564:23: NL
            	            {
            	            NL314=(Token)match(input,NL,FOLLOW_NL_in_plusplus_expr3531); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:564:26: ( PLUSPLUS | MINUSMINUS )
            	    int alt138=2;
            	    int LA138_0 = input.LA(1);

            	    if ( (LA138_0==PLUSPLUS) ) {
            	        alt138=1;
            	    }
            	    else if ( (LA138_0==MINUSMINUS) ) {
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
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:564:27: PLUSPLUS
            	            {
            	            PLUSPLUS315=(Token)match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_plusplus_expr3536); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PLUSPLUS315_tree = (CommonTree)adaptor.create(PLUSPLUS315);
            	            root_0 = (CommonTree)adaptor.becomeRoot(PLUSPLUS315_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:564:37: MINUSMINUS
            	            {
            	            MINUSMINUS316=(Token)match(input,MINUSMINUS,FOLLOW_MINUSMINUS_in_plusplus_expr3539); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            MINUSMINUS316_tree = (CommonTree)adaptor.create(MINUSMINUS316);
            	            root_0 = (CommonTree)adaptor.becomeRoot(MINUSMINUS316_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:564:52: ( NL )?
            	    int alt139=2;
            	    int LA139_0 = input.LA(1);

            	    if ( (LA139_0==NL) ) {
            	        alt139=1;
            	    }
            	    switch (alt139) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:564:52: NL
            	            {
            	            NL317=(Token)match(input,NL,FOLLOW_NL_in_plusplus_expr3543); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_timestimes_expr_in_plusplus_expr3547);
            	    timestimes_expr318=timestimes_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, timestimes_expr318.getTree());

            	    }
            	    break;

            	default :
            	    break loop140;
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:566:1: p_plusplus_expr : p_timestimes_expr ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? p_timestimes_expr )* ;
    public final babel17Parser.p_plusplus_expr_return p_plusplus_expr() throws RecognitionException {
        babel17Parser.p_plusplus_expr_return retval = new babel17Parser.p_plusplus_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL320=null;
        Token PLUSPLUS321=null;
        Token MINUSMINUS322=null;
        Token NL323=null;
        babel17Parser.p_timestimes_expr_return p_timestimes_expr319 = null;

        babel17Parser.p_timestimes_expr_return p_timestimes_expr324 = null;


        CommonTree NL320_tree=null;
        CommonTree PLUSPLUS321_tree=null;
        CommonTree MINUSMINUS322_tree=null;
        CommonTree NL323_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:567:2: ( p_timestimes_expr ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? p_timestimes_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:567:4: p_timestimes_expr ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? p_timestimes_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_timestimes_expr_in_p_plusplus_expr3559);
            p_timestimes_expr319=p_timestimes_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_timestimes_expr319.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:567:22: ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? p_timestimes_expr )*
            loop144:
            do {
                int alt144=2;
                int LA144_0 = input.LA(1);

                if ( (LA144_0==NL) ) {
                    int LA144_1 = input.LA(2);

                    if ( ((LA144_1>=PLUSPLUS && LA144_1<=MINUSMINUS)) ) {
                        alt144=1;
                    }


                }
                else if ( ((LA144_0>=PLUSPLUS && LA144_0<=MINUSMINUS)) ) {
                    alt144=1;
                }


                switch (alt144) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:567:23: ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? p_timestimes_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:567:25: ( NL )?
            	    int alt141=2;
            	    int LA141_0 = input.LA(1);

            	    if ( (LA141_0==NL) ) {
            	        alt141=1;
            	    }
            	    switch (alt141) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:567:25: NL
            	            {
            	            NL320=(Token)match(input,NL,FOLLOW_NL_in_p_plusplus_expr3562); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:567:28: ( PLUSPLUS | MINUSMINUS )
            	    int alt142=2;
            	    int LA142_0 = input.LA(1);

            	    if ( (LA142_0==PLUSPLUS) ) {
            	        alt142=1;
            	    }
            	    else if ( (LA142_0==MINUSMINUS) ) {
            	        alt142=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 142, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt142) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:567:29: PLUSPLUS
            	            {
            	            PLUSPLUS321=(Token)match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_p_plusplus_expr3567); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PLUSPLUS321_tree = (CommonTree)adaptor.create(PLUSPLUS321);
            	            root_0 = (CommonTree)adaptor.becomeRoot(PLUSPLUS321_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:567:39: MINUSMINUS
            	            {
            	            MINUSMINUS322=(Token)match(input,MINUSMINUS,FOLLOW_MINUSMINUS_in_p_plusplus_expr3570); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            MINUSMINUS322_tree = (CommonTree)adaptor.create(MINUSMINUS322);
            	            root_0 = (CommonTree)adaptor.becomeRoot(MINUSMINUS322_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:567:54: ( NL )?
            	    int alt143=2;
            	    int LA143_0 = input.LA(1);

            	    if ( (LA143_0==NL) ) {
            	        alt143=1;
            	    }
            	    switch (alt143) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:567:54: NL
            	            {
            	            NL323=(Token)match(input,NL,FOLLOW_NL_in_p_plusplus_expr3574); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_timestimes_expr_in_p_plusplus_expr3578);
            	    p_timestimes_expr324=p_timestimes_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_timestimes_expr324.getTree());

            	    }
            	    break;

            	default :
            	    break loop144;
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:570:1: timestimes_expr : simple_expr ( ( NL )? ( TIMESTIMES ) ( NL )? simple_expr )* ;
    public final babel17Parser.timestimes_expr_return timestimes_expr() throws RecognitionException {
        babel17Parser.timestimes_expr_return retval = new babel17Parser.timestimes_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL326=null;
        Token TIMESTIMES327=null;
        Token NL328=null;
        babel17Parser.simple_expr_return simple_expr325 = null;

        babel17Parser.simple_expr_return simple_expr329 = null;


        CommonTree NL326_tree=null;
        CommonTree TIMESTIMES327_tree=null;
        CommonTree NL328_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:571:2: ( simple_expr ( ( NL )? ( TIMESTIMES ) ( NL )? simple_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:571:4: simple_expr ( ( NL )? ( TIMESTIMES ) ( NL )? simple_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_simple_expr_in_timestimes_expr3590);
            simple_expr325=simple_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, simple_expr325.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:571:16: ( ( NL )? ( TIMESTIMES ) ( NL )? simple_expr )*
            loop147:
            do {
                int alt147=2;
                int LA147_0 = input.LA(1);

                if ( (LA147_0==NL) ) {
                    int LA147_1 = input.LA(2);

                    if ( (LA147_1==TIMESTIMES) ) {
                        alt147=1;
                    }


                }
                else if ( (LA147_0==TIMESTIMES) ) {
                    alt147=1;
                }


                switch (alt147) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:571:17: ( NL )? ( TIMESTIMES ) ( NL )? simple_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:571:19: ( NL )?
            	    int alt145=2;
            	    int LA145_0 = input.LA(1);

            	    if ( (LA145_0==NL) ) {
            	        alt145=1;
            	    }
            	    switch (alt145) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:571:19: NL
            	            {
            	            NL326=(Token)match(input,NL,FOLLOW_NL_in_timestimes_expr3593); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:571:22: ( TIMESTIMES )
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:571:23: TIMESTIMES
            	    {
            	    TIMESTIMES327=(Token)match(input,TIMESTIMES,FOLLOW_TIMESTIMES_in_timestimes_expr3598); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    TIMESTIMES327_tree = (CommonTree)adaptor.create(TIMESTIMES327);
            	    root_0 = (CommonTree)adaptor.becomeRoot(TIMESTIMES327_tree, root_0);
            	    }

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:571:38: ( NL )?
            	    int alt146=2;
            	    int LA146_0 = input.LA(1);

            	    if ( (LA146_0==NL) ) {
            	        alt146=1;
            	    }
            	    switch (alt146) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:571:38: NL
            	            {
            	            NL328=(Token)match(input,NL,FOLLOW_NL_in_timestimes_expr3602); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_simple_expr_in_timestimes_expr3606);
            	    simple_expr329=simple_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, simple_expr329.getTree());

            	    }
            	    break;

            	default :
            	    break loop147;
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:573:1: p_timestimes_expr : p_simple_expr ( ( NL )? ( TIMESTIMES ) ( NL )? p_simple_expr )* ;
    public final babel17Parser.p_timestimes_expr_return p_timestimes_expr() throws RecognitionException {
        babel17Parser.p_timestimes_expr_return retval = new babel17Parser.p_timestimes_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL331=null;
        Token TIMESTIMES332=null;
        Token NL333=null;
        babel17Parser.p_simple_expr_return p_simple_expr330 = null;

        babel17Parser.p_simple_expr_return p_simple_expr334 = null;


        CommonTree NL331_tree=null;
        CommonTree TIMESTIMES332_tree=null;
        CommonTree NL333_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:574:2: ( p_simple_expr ( ( NL )? ( TIMESTIMES ) ( NL )? p_simple_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:574:4: p_simple_expr ( ( NL )? ( TIMESTIMES ) ( NL )? p_simple_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_simple_expr_in_p_timestimes_expr3619);
            p_simple_expr330=p_simple_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_simple_expr330.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:574:18: ( ( NL )? ( TIMESTIMES ) ( NL )? p_simple_expr )*
            loop150:
            do {
                int alt150=2;
                int LA150_0 = input.LA(1);

                if ( (LA150_0==NL) ) {
                    int LA150_1 = input.LA(2);

                    if ( (LA150_1==TIMESTIMES) ) {
                        alt150=1;
                    }


                }
                else if ( (LA150_0==TIMESTIMES) ) {
                    alt150=1;
                }


                switch (alt150) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:574:19: ( NL )? ( TIMESTIMES ) ( NL )? p_simple_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:574:21: ( NL )?
            	    int alt148=2;
            	    int LA148_0 = input.LA(1);

            	    if ( (LA148_0==NL) ) {
            	        alt148=1;
            	    }
            	    switch (alt148) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:574:21: NL
            	            {
            	            NL331=(Token)match(input,NL,FOLLOW_NL_in_p_timestimes_expr3622); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:574:24: ( TIMESTIMES )
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:574:25: TIMESTIMES
            	    {
            	    TIMESTIMES332=(Token)match(input,TIMESTIMES,FOLLOW_TIMESTIMES_in_p_timestimes_expr3627); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    TIMESTIMES332_tree = (CommonTree)adaptor.create(TIMESTIMES332);
            	    root_0 = (CommonTree)adaptor.becomeRoot(TIMESTIMES332_tree, root_0);
            	    }

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:574:40: ( NL )?
            	    int alt149=2;
            	    int LA149_0 = input.LA(1);

            	    if ( (LA149_0==NL) ) {
            	        alt149=1;
            	    }
            	    switch (alt149) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:574:40: NL
            	            {
            	            NL333=(Token)match(input,NL,FOLLOW_NL_in_p_timestimes_expr3631); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_simple_expr_in_p_timestimes_expr3635);
            	    p_simple_expr334=p_simple_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_simple_expr334.getTree());

            	    }
            	    break;

            	default :
            	    break loop150;
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:576:1: simple_expr : cons_expr ;
    public final babel17Parser.simple_expr_return simple_expr() throws RecognitionException {
        babel17Parser.simple_expr_return retval = new babel17Parser.simple_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.cons_expr_return cons_expr335 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:577:2: ( cons_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:577:4: cons_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_cons_expr_in_simple_expr3646);
            cons_expr335=cons_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, cons_expr335.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:579:1: p_simple_expr : p_cons_expr ;
    public final babel17Parser.p_simple_expr_return p_simple_expr() throws RecognitionException {
        babel17Parser.p_simple_expr_return retval = new babel17Parser.p_simple_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.p_cons_expr_return p_cons_expr336 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:580:2: ( p_cons_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:580:4: p_cons_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_cons_expr_in_p_simple_expr3655);
            p_cons_expr336=p_cons_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_cons_expr336.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:582:1: cons_expr : to_expr ( ( NL )? token_DOUBLE_COLON ( NL )? to_expr )* -> ^( LIST_CONS ( to_expr )* ) ;
    public final babel17Parser.cons_expr_return cons_expr() throws RecognitionException {
        babel17Parser.cons_expr_return retval = new babel17Parser.cons_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL338=null;
        Token NL340=null;
        babel17Parser.to_expr_return to_expr337 = null;

        babel17Parser.token_DOUBLE_COLON_return token_DOUBLE_COLON339 = null;

        babel17Parser.to_expr_return to_expr341 = null;


        CommonTree NL338_tree=null;
        CommonTree NL340_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_token_DOUBLE_COLON=new RewriteRuleSubtreeStream(adaptor,"rule token_DOUBLE_COLON");
        RewriteRuleSubtreeStream stream_to_expr=new RewriteRuleSubtreeStream(adaptor,"rule to_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:583:2: ( to_expr ( ( NL )? token_DOUBLE_COLON ( NL )? to_expr )* -> ^( LIST_CONS ( to_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:583:4: to_expr ( ( NL )? token_DOUBLE_COLON ( NL )? to_expr )*
            {
            pushFollow(FOLLOW_to_expr_in_cons_expr3664);
            to_expr337=to_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_to_expr.add(to_expr337.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:583:12: ( ( NL )? token_DOUBLE_COLON ( NL )? to_expr )*
            loop153:
            do {
                int alt153=2;
                int LA153_0 = input.LA(1);

                if ( (LA153_0==NL) ) {
                    int LA153_1 = input.LA(2);

                    if ( ((LA153_1>=A_DOUBLE_COLON && LA153_1<=U_DOUBLE_COLON)) ) {
                        alt153=1;
                    }


                }
                else if ( ((LA153_0>=A_DOUBLE_COLON && LA153_0<=U_DOUBLE_COLON)) ) {
                    alt153=1;
                }


                switch (alt153) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:583:13: ( NL )? token_DOUBLE_COLON ( NL )? to_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:583:13: ( NL )?
            	    int alt151=2;
            	    int LA151_0 = input.LA(1);

            	    if ( (LA151_0==NL) ) {
            	        alt151=1;
            	    }
            	    switch (alt151) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:583:13: NL
            	            {
            	            NL338=(Token)match(input,NL,FOLLOW_NL_in_cons_expr3667); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL338);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_token_DOUBLE_COLON_in_cons_expr3670);
            	    token_DOUBLE_COLON339=token_DOUBLE_COLON();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_token_DOUBLE_COLON.add(token_DOUBLE_COLON339.getTree());
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:583:36: ( NL )?
            	    int alt152=2;
            	    int LA152_0 = input.LA(1);

            	    if ( (LA152_0==NL) ) {
            	        alt152=1;
            	    }
            	    switch (alt152) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:583:36: NL
            	            {
            	            NL340=(Token)match(input,NL,FOLLOW_NL_in_cons_expr3672); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL340);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_to_expr_in_cons_expr3675);
            	    to_expr341=to_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_to_expr.add(to_expr341.getTree());

            	    }
            	    break;

            	default :
            	    break loop153;
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
            // 583:50: -> ^( LIST_CONS ( to_expr )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:583:53: ^( LIST_CONS ( to_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LIST_CONS, "LIST_CONS"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:583:65: ( to_expr )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:585:1: p_cons_expr : p_to_expr ( ( NL )? token_DOUBLE_COLON ( NL )? p_to_expr )* -> ^( LIST_CONS ( p_to_expr )* ) ;
    public final babel17Parser.p_cons_expr_return p_cons_expr() throws RecognitionException {
        babel17Parser.p_cons_expr_return retval = new babel17Parser.p_cons_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL343=null;
        Token NL345=null;
        babel17Parser.p_to_expr_return p_to_expr342 = null;

        babel17Parser.token_DOUBLE_COLON_return token_DOUBLE_COLON344 = null;

        babel17Parser.p_to_expr_return p_to_expr346 = null;


        CommonTree NL343_tree=null;
        CommonTree NL345_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_p_to_expr=new RewriteRuleSubtreeStream(adaptor,"rule p_to_expr");
        RewriteRuleSubtreeStream stream_token_DOUBLE_COLON=new RewriteRuleSubtreeStream(adaptor,"rule token_DOUBLE_COLON");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:586:2: ( p_to_expr ( ( NL )? token_DOUBLE_COLON ( NL )? p_to_expr )* -> ^( LIST_CONS ( p_to_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:586:4: p_to_expr ( ( NL )? token_DOUBLE_COLON ( NL )? p_to_expr )*
            {
            pushFollow(FOLLOW_p_to_expr_in_p_cons_expr3695);
            p_to_expr342=p_to_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_p_to_expr.add(p_to_expr342.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:586:14: ( ( NL )? token_DOUBLE_COLON ( NL )? p_to_expr )*
            loop156:
            do {
                int alt156=2;
                int LA156_0 = input.LA(1);

                if ( (LA156_0==NL) ) {
                    int LA156_1 = input.LA(2);

                    if ( ((LA156_1>=A_DOUBLE_COLON && LA156_1<=U_DOUBLE_COLON)) ) {
                        alt156=1;
                    }


                }
                else if ( ((LA156_0>=A_DOUBLE_COLON && LA156_0<=U_DOUBLE_COLON)) ) {
                    alt156=1;
                }


                switch (alt156) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:586:15: ( NL )? token_DOUBLE_COLON ( NL )? p_to_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:586:15: ( NL )?
            	    int alt154=2;
            	    int LA154_0 = input.LA(1);

            	    if ( (LA154_0==NL) ) {
            	        alt154=1;
            	    }
            	    switch (alt154) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:586:15: NL
            	            {
            	            NL343=(Token)match(input,NL,FOLLOW_NL_in_p_cons_expr3698); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL343);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_token_DOUBLE_COLON_in_p_cons_expr3701);
            	    token_DOUBLE_COLON344=token_DOUBLE_COLON();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_token_DOUBLE_COLON.add(token_DOUBLE_COLON344.getTree());
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:586:38: ( NL )?
            	    int alt155=2;
            	    int LA155_0 = input.LA(1);

            	    if ( (LA155_0==NL) ) {
            	        alt155=1;
            	    }
            	    switch (alt155) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:586:38: NL
            	            {
            	            NL345=(Token)match(input,NL,FOLLOW_NL_in_p_cons_expr3703); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL345);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_to_expr_in_p_cons_expr3706);
            	    p_to_expr346=p_to_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_p_to_expr.add(p_to_expr346.getTree());

            	    }
            	    break;

            	default :
            	    break loop156;
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
            // 586:54: -> ^( LIST_CONS ( p_to_expr )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:586:57: ^( LIST_CONS ( p_to_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LIST_CONS, "LIST_CONS"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:586:69: ( p_to_expr )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:589:1: to_expr : arith_plus_expr ( ( NL )? ( L_to | L_downto ) ( NL )? arith_plus_expr )? ;
    public final babel17Parser.to_expr_return to_expr() throws RecognitionException {
        babel17Parser.to_expr_return retval = new babel17Parser.to_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL348=null;
        Token L_to349=null;
        Token L_downto350=null;
        Token NL351=null;
        babel17Parser.arith_plus_expr_return arith_plus_expr347 = null;

        babel17Parser.arith_plus_expr_return arith_plus_expr352 = null;


        CommonTree NL348_tree=null;
        CommonTree L_to349_tree=null;
        CommonTree L_downto350_tree=null;
        CommonTree NL351_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:589:9: ( arith_plus_expr ( ( NL )? ( L_to | L_downto ) ( NL )? arith_plus_expr )? )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:589:11: arith_plus_expr ( ( NL )? ( L_to | L_downto ) ( NL )? arith_plus_expr )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_arith_plus_expr_in_to_expr3726);
            arith_plus_expr347=arith_plus_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, arith_plus_expr347.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:589:27: ( ( NL )? ( L_to | L_downto ) ( NL )? arith_plus_expr )?
            int alt160=2;
            int LA160_0 = input.LA(1);

            if ( (LA160_0==NL) ) {
                int LA160_1 = input.LA(2);

                if ( ((LA160_1>=L_to && LA160_1<=L_downto)) ) {
                    alt160=1;
                }
            }
            else if ( ((LA160_0>=L_to && LA160_0<=L_downto)) ) {
                alt160=1;
            }
            switch (alt160) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:589:28: ( NL )? ( L_to | L_downto ) ( NL )? arith_plus_expr
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:589:30: ( NL )?
                    int alt157=2;
                    int LA157_0 = input.LA(1);

                    if ( (LA157_0==NL) ) {
                        alt157=1;
                    }
                    switch (alt157) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:589:30: NL
                            {
                            NL348=(Token)match(input,NL,FOLLOW_NL_in_to_expr3729); if (state.failed) return retval;

                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:589:33: ( L_to | L_downto )
                    int alt158=2;
                    int LA158_0 = input.LA(1);

                    if ( (LA158_0==L_to) ) {
                        alt158=1;
                    }
                    else if ( (LA158_0==L_downto) ) {
                        alt158=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 158, 0, input);

                        throw nvae;
                    }
                    switch (alt158) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:589:34: L_to
                            {
                            L_to349=(Token)match(input,L_to,FOLLOW_L_to_in_to_expr3734); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            L_to349_tree = (CommonTree)adaptor.create(L_to349);
                            root_0 = (CommonTree)adaptor.becomeRoot(L_to349_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:589:41: L_downto
                            {
                            L_downto350=(Token)match(input,L_downto,FOLLOW_L_downto_in_to_expr3738); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            L_downto350_tree = (CommonTree)adaptor.create(L_downto350);
                            root_0 = (CommonTree)adaptor.becomeRoot(L_downto350_tree, root_0);
                            }

                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:589:54: ( NL )?
                    int alt159=2;
                    int LA159_0 = input.LA(1);

                    if ( (LA159_0==NL) ) {
                        alt159=1;
                    }
                    switch (alt159) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:589:54: NL
                            {
                            NL351=(Token)match(input,NL,FOLLOW_NL_in_to_expr3742); if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_arith_plus_expr_in_to_expr3746);
                    arith_plus_expr352=arith_plus_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arith_plus_expr352.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:591:1: p_to_expr : p_arith_plus_expr ( ( NL )? ( L_to | L_downto ) ( NL )? p_arith_plus_expr )? ;
    public final babel17Parser.p_to_expr_return p_to_expr() throws RecognitionException {
        babel17Parser.p_to_expr_return retval = new babel17Parser.p_to_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL354=null;
        Token L_to355=null;
        Token L_downto356=null;
        Token NL357=null;
        babel17Parser.p_arith_plus_expr_return p_arith_plus_expr353 = null;

        babel17Parser.p_arith_plus_expr_return p_arith_plus_expr358 = null;


        CommonTree NL354_tree=null;
        CommonTree L_to355_tree=null;
        CommonTree L_downto356_tree=null;
        CommonTree NL357_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:592:2: ( p_arith_plus_expr ( ( NL )? ( L_to | L_downto ) ( NL )? p_arith_plus_expr )? )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:592:4: p_arith_plus_expr ( ( NL )? ( L_to | L_downto ) ( NL )? p_arith_plus_expr )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_arith_plus_expr_in_p_to_expr3759);
            p_arith_plus_expr353=p_arith_plus_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_arith_plus_expr353.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:592:22: ( ( NL )? ( L_to | L_downto ) ( NL )? p_arith_plus_expr )?
            int alt164=2;
            int LA164_0 = input.LA(1);

            if ( (LA164_0==NL) ) {
                int LA164_1 = input.LA(2);

                if ( ((LA164_1>=L_to && LA164_1<=L_downto)) ) {
                    alt164=1;
                }
            }
            else if ( ((LA164_0>=L_to && LA164_0<=L_downto)) ) {
                alt164=1;
            }
            switch (alt164) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:592:23: ( NL )? ( L_to | L_downto ) ( NL )? p_arith_plus_expr
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:592:25: ( NL )?
                    int alt161=2;
                    int LA161_0 = input.LA(1);

                    if ( (LA161_0==NL) ) {
                        alt161=1;
                    }
                    switch (alt161) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:592:25: NL
                            {
                            NL354=(Token)match(input,NL,FOLLOW_NL_in_p_to_expr3762); if (state.failed) return retval;

                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:592:28: ( L_to | L_downto )
                    int alt162=2;
                    int LA162_0 = input.LA(1);

                    if ( (LA162_0==L_to) ) {
                        alt162=1;
                    }
                    else if ( (LA162_0==L_downto) ) {
                        alt162=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 162, 0, input);

                        throw nvae;
                    }
                    switch (alt162) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:592:29: L_to
                            {
                            L_to355=(Token)match(input,L_to,FOLLOW_L_to_in_p_to_expr3767); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            L_to355_tree = (CommonTree)adaptor.create(L_to355);
                            root_0 = (CommonTree)adaptor.becomeRoot(L_to355_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:592:36: L_downto
                            {
                            L_downto356=(Token)match(input,L_downto,FOLLOW_L_downto_in_p_to_expr3771); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            L_downto356_tree = (CommonTree)adaptor.create(L_downto356);
                            root_0 = (CommonTree)adaptor.becomeRoot(L_downto356_tree, root_0);
                            }

                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:592:49: ( NL )?
                    int alt163=2;
                    int LA163_0 = input.LA(1);

                    if ( (LA163_0==NL) ) {
                        alt163=1;
                    }
                    switch (alt163) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:592:49: NL
                            {
                            NL357=(Token)match(input,NL,FOLLOW_NL_in_p_to_expr3775); if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_p_arith_plus_expr_in_p_to_expr3779);
                    p_arith_plus_expr358=p_arith_plus_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_arith_plus_expr358.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:594:1: arith_plus_expr : arith_uminus_expr ( ( ( NL )? PLUS | MINUS ) ( NL )? arith_uminus_expr )* ;
    public final babel17Parser.arith_plus_expr_return arith_plus_expr() throws RecognitionException {
        babel17Parser.arith_plus_expr_return retval = new babel17Parser.arith_plus_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL360=null;
        Token PLUS361=null;
        Token MINUS362=null;
        Token NL363=null;
        babel17Parser.arith_uminus_expr_return arith_uminus_expr359 = null;

        babel17Parser.arith_uminus_expr_return arith_uminus_expr364 = null;


        CommonTree NL360_tree=null;
        CommonTree PLUS361_tree=null;
        CommonTree MINUS362_tree=null;
        CommonTree NL363_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:595:2: ( arith_uminus_expr ( ( ( NL )? PLUS | MINUS ) ( NL )? arith_uminus_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:595:4: arith_uminus_expr ( ( ( NL )? PLUS | MINUS ) ( NL )? arith_uminus_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_arith_uminus_expr_in_arith_plus_expr3791);
            arith_uminus_expr359=arith_uminus_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, arith_uminus_expr359.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:595:22: ( ( ( NL )? PLUS | MINUS ) ( NL )? arith_uminus_expr )*
            loop168:
            do {
                int alt168=2;
                int LA168_0 = input.LA(1);

                if ( (LA168_0==NL) ) {
                    int LA168_1 = input.LA(2);

                    if ( (LA168_1==PLUS) ) {
                        alt168=1;
                    }


                }
                else if ( ((LA168_0>=PLUS && LA168_0<=MINUS)) ) {
                    alt168=1;
                }


                switch (alt168) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:595:23: ( ( NL )? PLUS | MINUS ) ( NL )? arith_uminus_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:595:23: ( ( NL )? PLUS | MINUS )
            	    int alt166=2;
            	    int LA166_0 = input.LA(1);

            	    if ( (LA166_0==PLUS||LA166_0==NL) ) {
            	        alt166=1;
            	    }
            	    else if ( (LA166_0==MINUS) ) {
            	        alt166=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 166, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt166) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:595:24: ( NL )? PLUS
            	            {
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:595:26: ( NL )?
            	            int alt165=2;
            	            int LA165_0 = input.LA(1);

            	            if ( (LA165_0==NL) ) {
            	                alt165=1;
            	            }
            	            switch (alt165) {
            	                case 1 :
            	                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:595:26: NL
            	                    {
            	                    NL360=(Token)match(input,NL,FOLLOW_NL_in_arith_plus_expr3795); if (state.failed) return retval;

            	                    }
            	                    break;

            	            }

            	            PLUS361=(Token)match(input,PLUS,FOLLOW_PLUS_in_arith_plus_expr3799); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PLUS361_tree = (CommonTree)adaptor.create(PLUS361);
            	            root_0 = (CommonTree)adaptor.becomeRoot(PLUS361_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:595:37: MINUS
            	            {
            	            MINUS362=(Token)match(input,MINUS,FOLLOW_MINUS_in_arith_plus_expr3804); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            MINUS362_tree = (CommonTree)adaptor.create(MINUS362);
            	            root_0 = (CommonTree)adaptor.becomeRoot(MINUS362_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:595:47: ( NL )?
            	    int alt167=2;
            	    int LA167_0 = input.LA(1);

            	    if ( (LA167_0==NL) ) {
            	        alt167=1;
            	    }
            	    switch (alt167) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:595:47: NL
            	            {
            	            NL363=(Token)match(input,NL,FOLLOW_NL_in_arith_plus_expr3808); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_arith_uminus_expr_in_arith_plus_expr3812);
            	    arith_uminus_expr364=arith_uminus_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, arith_uminus_expr364.getTree());

            	    }
            	    break;

            	default :
            	    break loop168;
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:597:1: p_arith_plus_expr : p_arith_uminus_expr ( ( NL )? ( PLUS | MINUS ) ( NL )? p_arith_uminus_expr )* ;
    public final babel17Parser.p_arith_plus_expr_return p_arith_plus_expr() throws RecognitionException {
        babel17Parser.p_arith_plus_expr_return retval = new babel17Parser.p_arith_plus_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL366=null;
        Token set367=null;
        Token NL368=null;
        babel17Parser.p_arith_uminus_expr_return p_arith_uminus_expr365 = null;

        babel17Parser.p_arith_uminus_expr_return p_arith_uminus_expr369 = null;


        CommonTree NL366_tree=null;
        CommonTree set367_tree=null;
        CommonTree NL368_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:598:2: ( p_arith_uminus_expr ( ( NL )? ( PLUS | MINUS ) ( NL )? p_arith_uminus_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:598:4: p_arith_uminus_expr ( ( NL )? ( PLUS | MINUS ) ( NL )? p_arith_uminus_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_arith_uminus_expr_in_p_arith_plus_expr3823);
            p_arith_uminus_expr365=p_arith_uminus_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_arith_uminus_expr365.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:598:24: ( ( NL )? ( PLUS | MINUS ) ( NL )? p_arith_uminus_expr )*
            loop171:
            do {
                int alt171=2;
                int LA171_0 = input.LA(1);

                if ( (LA171_0==NL) ) {
                    int LA171_1 = input.LA(2);

                    if ( ((LA171_1>=PLUS && LA171_1<=MINUS)) ) {
                        alt171=1;
                    }


                }
                else if ( ((LA171_0>=PLUS && LA171_0<=MINUS)) ) {
                    alt171=1;
                }


                switch (alt171) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:598:25: ( NL )? ( PLUS | MINUS ) ( NL )? p_arith_uminus_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:598:27: ( NL )?
            	    int alt169=2;
            	    int LA169_0 = input.LA(1);

            	    if ( (LA169_0==NL) ) {
            	        alt169=1;
            	    }
            	    switch (alt169) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:598:27: NL
            	            {
            	            NL366=(Token)match(input,NL,FOLLOW_NL_in_p_arith_plus_expr3826); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    set367=(Token)input.LT(1);
            	    set367=(Token)input.LT(1);
            	    if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set367), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:598:48: ( NL )?
            	    int alt170=2;
            	    int LA170_0 = input.LA(1);

            	    if ( (LA170_0==NL) ) {
            	        alt170=1;
            	    }
            	    switch (alt170) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:598:48: NL
            	            {
            	            NL368=(Token)match(input,NL,FOLLOW_NL_in_p_arith_plus_expr3839); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_arith_uminus_expr_in_p_arith_plus_expr3843);
            	    p_arith_uminus_expr369=p_arith_uminus_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_arith_uminus_expr369.getTree());

            	    }
            	    break;

            	default :
            	    break loop171;
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:600:1: arith_uminus_expr : ( MINUS ( NL )? arith_mult_expr -> ^( UMINUS arith_mult_expr ) | arith_mult_expr );
    public final babel17Parser.arith_uminus_expr_return arith_uminus_expr() throws RecognitionException {
        babel17Parser.arith_uminus_expr_return retval = new babel17Parser.arith_uminus_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token MINUS370=null;
        Token NL371=null;
        babel17Parser.arith_mult_expr_return arith_mult_expr372 = null;

        babel17Parser.arith_mult_expr_return arith_mult_expr373 = null;


        CommonTree MINUS370_tree=null;
        CommonTree NL371_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleSubtreeStream stream_arith_mult_expr=new RewriteRuleSubtreeStream(adaptor,"rule arith_mult_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:601:2: ( MINUS ( NL )? arith_mult_expr -> ^( UMINUS arith_mult_expr ) | arith_mult_expr )
            int alt173=2;
            int LA173_0 = input.LA(1);

            if ( (LA173_0==MINUS) ) {
                alt173=1;
            }
            else if ( (LA173_0==L_begin||(LA173_0>=L_with && LA173_0<=L_if)||(LA173_0>=L_while && LA173_0<=L_for)||LA173_0==L_match||(LA173_0>=A_infinity && LA173_0<=U_infinity)||(LA173_0>=L_true && LA173_0<=L_this)||(LA173_0>=Constr && LA173_0<=Num)||(LA173_0>=String && LA173_0<=ROUND_BRACKET_OPEN)||LA173_0==SQUARE_BRACKET_OPEN||LA173_0==CURLY_BRACKET_OPEN) ) {
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:601:4: MINUS ( NL )? arith_mult_expr
                    {
                    MINUS370=(Token)match(input,MINUS,FOLLOW_MINUS_in_arith_uminus_expr3856); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(MINUS370);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:601:10: ( NL )?
                    int alt172=2;
                    int LA172_0 = input.LA(1);

                    if ( (LA172_0==NL) ) {
                        alt172=1;
                    }
                    switch (alt172) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:601:10: NL
                            {
                            NL371=(Token)match(input,NL,FOLLOW_NL_in_arith_uminus_expr3858); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL371);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_arith_mult_expr_in_arith_uminus_expr3861);
                    arith_mult_expr372=arith_mult_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_arith_mult_expr.add(arith_mult_expr372.getTree());


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
                    // 601:30: -> ^( UMINUS arith_mult_expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:601:33: ^( UMINUS arith_mult_expr )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:602:4: arith_mult_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_arith_mult_expr_in_arith_uminus_expr3874);
                    arith_mult_expr373=arith_mult_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arith_mult_expr373.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:604:1: p_arith_uminus_expr : ( MINUS ( NL )? p_arith_mult_expr -> ^( UMINUS p_arith_mult_expr ) | p_arith_mult_expr );
    public final babel17Parser.p_arith_uminus_expr_return p_arith_uminus_expr() throws RecognitionException {
        babel17Parser.p_arith_uminus_expr_return retval = new babel17Parser.p_arith_uminus_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token MINUS374=null;
        Token NL375=null;
        babel17Parser.p_arith_mult_expr_return p_arith_mult_expr376 = null;

        babel17Parser.p_arith_mult_expr_return p_arith_mult_expr377 = null;


        CommonTree MINUS374_tree=null;
        CommonTree NL375_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleSubtreeStream stream_p_arith_mult_expr=new RewriteRuleSubtreeStream(adaptor,"rule p_arith_mult_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:605:2: ( MINUS ( NL )? p_arith_mult_expr -> ^( UMINUS p_arith_mult_expr ) | p_arith_mult_expr )
            int alt175=2;
            int LA175_0 = input.LA(1);

            if ( (LA175_0==MINUS) ) {
                alt175=1;
            }
            else if ( (LA175_0==L_begin||(LA175_0>=L_with && LA175_0<=L_if)||(LA175_0>=L_while && LA175_0<=L_for)||LA175_0==L_match||(LA175_0>=A_infinity && LA175_0<=U_infinity)||(LA175_0>=L_true && LA175_0<=L_this)||(LA175_0>=Constr && LA175_0<=Num)||(LA175_0>=String && LA175_0<=ROUND_BRACKET_OPEN)||LA175_0==SQUARE_BRACKET_OPEN||LA175_0==CURLY_BRACKET_OPEN) ) {
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:605:4: MINUS ( NL )? p_arith_mult_expr
                    {
                    MINUS374=(Token)match(input,MINUS,FOLLOW_MINUS_in_p_arith_uminus_expr3885); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(MINUS374);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:605:10: ( NL )?
                    int alt174=2;
                    int LA174_0 = input.LA(1);

                    if ( (LA174_0==NL) ) {
                        alt174=1;
                    }
                    switch (alt174) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:605:10: NL
                            {
                            NL375=(Token)match(input,NL,FOLLOW_NL_in_p_arith_uminus_expr3887); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL375);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_p_arith_mult_expr_in_p_arith_uminus_expr3890);
                    p_arith_mult_expr376=p_arith_mult_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_p_arith_mult_expr.add(p_arith_mult_expr376.getTree());


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
                    // 605:32: -> ^( UMINUS p_arith_mult_expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:605:35: ^( UMINUS p_arith_mult_expr )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:606:4: p_arith_mult_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_p_arith_mult_expr_in_p_arith_uminus_expr3903);
                    p_arith_mult_expr377=p_arith_mult_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_arith_mult_expr377.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:608:1: arith_mult_expr : arith_pow_expr ( ( NL )? ( TIMES | DIV | MOD ) ( NL )? arith_pow_expr )* ;
    public final babel17Parser.arith_mult_expr_return arith_mult_expr() throws RecognitionException {
        babel17Parser.arith_mult_expr_return retval = new babel17Parser.arith_mult_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL379=null;
        Token set380=null;
        Token NL381=null;
        babel17Parser.arith_pow_expr_return arith_pow_expr378 = null;

        babel17Parser.arith_pow_expr_return arith_pow_expr382 = null;


        CommonTree NL379_tree=null;
        CommonTree set380_tree=null;
        CommonTree NL381_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:609:2: ( arith_pow_expr ( ( NL )? ( TIMES | DIV | MOD ) ( NL )? arith_pow_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:609:4: arith_pow_expr ( ( NL )? ( TIMES | DIV | MOD ) ( NL )? arith_pow_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_arith_pow_expr_in_arith_mult_expr3912);
            arith_pow_expr378=arith_pow_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, arith_pow_expr378.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:609:19: ( ( NL )? ( TIMES | DIV | MOD ) ( NL )? arith_pow_expr )*
            loop178:
            do {
                int alt178=2;
                int LA178_0 = input.LA(1);

                if ( (LA178_0==NL) ) {
                    int LA178_1 = input.LA(2);

                    if ( ((LA178_1>=TIMES && LA178_1<=MOD)) ) {
                        alt178=1;
                    }


                }
                else if ( ((LA178_0>=TIMES && LA178_0<=MOD)) ) {
                    alt178=1;
                }


                switch (alt178) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:609:20: ( NL )? ( TIMES | DIV | MOD ) ( NL )? arith_pow_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:609:22: ( NL )?
            	    int alt176=2;
            	    int LA176_0 = input.LA(1);

            	    if ( (LA176_0==NL) ) {
            	        alt176=1;
            	    }
            	    switch (alt176) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:609:22: NL
            	            {
            	            NL379=(Token)match(input,NL,FOLLOW_NL_in_arith_mult_expr3915); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    set380=(Token)input.LT(1);
            	    set380=(Token)input.LT(1);
            	    if ( (input.LA(1)>=TIMES && input.LA(1)<=MOD) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set380), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:609:48: ( NL )?
            	    int alt177=2;
            	    int LA177_0 = input.LA(1);

            	    if ( (LA177_0==NL) ) {
            	        alt177=1;
            	    }
            	    switch (alt177) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:609:48: NL
            	            {
            	            NL381=(Token)match(input,NL,FOLLOW_NL_in_arith_mult_expr3932); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_arith_pow_expr_in_arith_mult_expr3936);
            	    arith_pow_expr382=arith_pow_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, arith_pow_expr382.getTree());

            	    }
            	    break;

            	default :
            	    break loop178;
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:611:1: p_arith_mult_expr : p_arith_pow_expr ( ( NL )? ( TIMES | DIV | MOD ) ( NL )? p_arith_pow_expr )* ;
    public final babel17Parser.p_arith_mult_expr_return p_arith_mult_expr() throws RecognitionException {
        babel17Parser.p_arith_mult_expr_return retval = new babel17Parser.p_arith_mult_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL384=null;
        Token set385=null;
        Token NL386=null;
        babel17Parser.p_arith_pow_expr_return p_arith_pow_expr383 = null;

        babel17Parser.p_arith_pow_expr_return p_arith_pow_expr387 = null;


        CommonTree NL384_tree=null;
        CommonTree set385_tree=null;
        CommonTree NL386_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:612:2: ( p_arith_pow_expr ( ( NL )? ( TIMES | DIV | MOD ) ( NL )? p_arith_pow_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:612:4: p_arith_pow_expr ( ( NL )? ( TIMES | DIV | MOD ) ( NL )? p_arith_pow_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_arith_pow_expr_in_p_arith_mult_expr3948);
            p_arith_pow_expr383=p_arith_pow_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_arith_pow_expr383.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:612:21: ( ( NL )? ( TIMES | DIV | MOD ) ( NL )? p_arith_pow_expr )*
            loop181:
            do {
                int alt181=2;
                int LA181_0 = input.LA(1);

                if ( (LA181_0==NL) ) {
                    int LA181_1 = input.LA(2);

                    if ( ((LA181_1>=TIMES && LA181_1<=MOD)) ) {
                        alt181=1;
                    }


                }
                else if ( ((LA181_0>=TIMES && LA181_0<=MOD)) ) {
                    alt181=1;
                }


                switch (alt181) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:612:22: ( NL )? ( TIMES | DIV | MOD ) ( NL )? p_arith_pow_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:612:24: ( NL )?
            	    int alt179=2;
            	    int LA179_0 = input.LA(1);

            	    if ( (LA179_0==NL) ) {
            	        alt179=1;
            	    }
            	    switch (alt179) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:612:24: NL
            	            {
            	            NL384=(Token)match(input,NL,FOLLOW_NL_in_p_arith_mult_expr3951); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    set385=(Token)input.LT(1);
            	    set385=(Token)input.LT(1);
            	    if ( (input.LA(1)>=TIMES && input.LA(1)<=MOD) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set385), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:612:50: ( NL )?
            	    int alt180=2;
            	    int LA180_0 = input.LA(1);

            	    if ( (LA180_0==NL) ) {
            	        alt180=1;
            	    }
            	    switch (alt180) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:612:50: NL
            	            {
            	            NL386=(Token)match(input,NL,FOLLOW_NL_in_p_arith_mult_expr3968); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_arith_pow_expr_in_p_arith_mult_expr3972);
            	    p_arith_pow_expr387=p_arith_pow_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_arith_pow_expr387.getTree());

            	    }
            	    break;

            	default :
            	    break loop181;
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:614:1: arith_pow_expr : apply_expr ( ( NL )? POW_tok ( NL )? apply_expr )* -> ^( POW ( apply_expr )* ) ;
    public final babel17Parser.arith_pow_expr_return arith_pow_expr() throws RecognitionException {
        babel17Parser.arith_pow_expr_return retval = new babel17Parser.arith_pow_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL389=null;
        Token POW_tok390=null;
        Token NL391=null;
        babel17Parser.apply_expr_return apply_expr388 = null;

        babel17Parser.apply_expr_return apply_expr392 = null;


        CommonTree NL389_tree=null;
        CommonTree POW_tok390_tree=null;
        CommonTree NL391_tree=null;
        RewriteRuleTokenStream stream_POW_tok=new RewriteRuleTokenStream(adaptor,"token POW_tok");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_apply_expr=new RewriteRuleSubtreeStream(adaptor,"rule apply_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:615:2: ( apply_expr ( ( NL )? POW_tok ( NL )? apply_expr )* -> ^( POW ( apply_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:615:4: apply_expr ( ( NL )? POW_tok ( NL )? apply_expr )*
            {
            pushFollow(FOLLOW_apply_expr_in_arith_pow_expr3983);
            apply_expr388=apply_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_apply_expr.add(apply_expr388.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:615:15: ( ( NL )? POW_tok ( NL )? apply_expr )*
            loop184:
            do {
                int alt184=2;
                int LA184_0 = input.LA(1);

                if ( (LA184_0==NL) ) {
                    int LA184_1 = input.LA(2);

                    if ( (LA184_1==POW_tok) ) {
                        alt184=1;
                    }


                }
                else if ( (LA184_0==POW_tok) ) {
                    alt184=1;
                }


                switch (alt184) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:615:16: ( NL )? POW_tok ( NL )? apply_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:615:16: ( NL )?
            	    int alt182=2;
            	    int LA182_0 = input.LA(1);

            	    if ( (LA182_0==NL) ) {
            	        alt182=1;
            	    }
            	    switch (alt182) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:615:16: NL
            	            {
            	            NL389=(Token)match(input,NL,FOLLOW_NL_in_arith_pow_expr3986); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL389);


            	            }
            	            break;

            	    }

            	    POW_tok390=(Token)match(input,POW_tok,FOLLOW_POW_tok_in_arith_pow_expr3989); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_POW_tok.add(POW_tok390);

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:615:28: ( NL )?
            	    int alt183=2;
            	    int LA183_0 = input.LA(1);

            	    if ( (LA183_0==NL) ) {
            	        alt183=1;
            	    }
            	    switch (alt183) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:615:28: NL
            	            {
            	            NL391=(Token)match(input,NL,FOLLOW_NL_in_arith_pow_expr3991); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL391);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_apply_expr_in_arith_pow_expr3994);
            	    apply_expr392=apply_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_apply_expr.add(apply_expr392.getTree());

            	    }
            	    break;

            	default :
            	    break loop184;
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
            // 615:45: -> ^( POW ( apply_expr )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:615:48: ^( POW ( apply_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(POW, "POW"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:615:54: ( apply_expr )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:617:1: p_arith_pow_expr : p_apply_expr ( ( NL )? POW_tok ( NL )? p_apply_expr )* -> ^( POW ( p_apply_expr )* ) ;
    public final babel17Parser.p_arith_pow_expr_return p_arith_pow_expr() throws RecognitionException {
        babel17Parser.p_arith_pow_expr_return retval = new babel17Parser.p_arith_pow_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL394=null;
        Token POW_tok395=null;
        Token NL396=null;
        babel17Parser.p_apply_expr_return p_apply_expr393 = null;

        babel17Parser.p_apply_expr_return p_apply_expr397 = null;


        CommonTree NL394_tree=null;
        CommonTree POW_tok395_tree=null;
        CommonTree NL396_tree=null;
        RewriteRuleTokenStream stream_POW_tok=new RewriteRuleTokenStream(adaptor,"token POW_tok");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_p_apply_expr=new RewriteRuleSubtreeStream(adaptor,"rule p_apply_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:618:2: ( p_apply_expr ( ( NL )? POW_tok ( NL )? p_apply_expr )* -> ^( POW ( p_apply_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:618:4: p_apply_expr ( ( NL )? POW_tok ( NL )? p_apply_expr )*
            {
            pushFollow(FOLLOW_p_apply_expr_in_p_arith_pow_expr4015);
            p_apply_expr393=p_apply_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_p_apply_expr.add(p_apply_expr393.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:618:17: ( ( NL )? POW_tok ( NL )? p_apply_expr )*
            loop187:
            do {
                int alt187=2;
                int LA187_0 = input.LA(1);

                if ( (LA187_0==NL) ) {
                    int LA187_1 = input.LA(2);

                    if ( (LA187_1==POW_tok) ) {
                        alt187=1;
                    }


                }
                else if ( (LA187_0==POW_tok) ) {
                    alt187=1;
                }


                switch (alt187) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:618:18: ( NL )? POW_tok ( NL )? p_apply_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:618:18: ( NL )?
            	    int alt185=2;
            	    int LA185_0 = input.LA(1);

            	    if ( (LA185_0==NL) ) {
            	        alt185=1;
            	    }
            	    switch (alt185) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:618:18: NL
            	            {
            	            NL394=(Token)match(input,NL,FOLLOW_NL_in_p_arith_pow_expr4018); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL394);


            	            }
            	            break;

            	    }

            	    POW_tok395=(Token)match(input,POW_tok,FOLLOW_POW_tok_in_p_arith_pow_expr4021); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_POW_tok.add(POW_tok395);

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:618:30: ( NL )?
            	    int alt186=2;
            	    int LA186_0 = input.LA(1);

            	    if ( (LA186_0==NL) ) {
            	        alt186=1;
            	    }
            	    switch (alt186) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:618:30: NL
            	            {
            	            NL396=(Token)match(input,NL,FOLLOW_NL_in_p_arith_pow_expr4023); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL396);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_apply_expr_in_p_arith_pow_expr4026);
            	    p_apply_expr397=p_apply_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_p_apply_expr.add(p_apply_expr397.getTree());

            	    }
            	    break;

            	default :
            	    break loop187;
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
            // 618:49: -> ^( POW ( p_apply_expr )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:618:52: ^( POW ( p_apply_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(POW, "POW"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:618:58: ( p_apply_expr )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:620:1: apply_expr : ( basic_expr )+ -> ^( APPLY ( basic_expr )* ) ;
    public final babel17Parser.apply_expr_return apply_expr() throws RecognitionException {
        babel17Parser.apply_expr_return retval = new babel17Parser.apply_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.basic_expr_return basic_expr398 = null;


        RewriteRuleSubtreeStream stream_basic_expr=new RewriteRuleSubtreeStream(adaptor,"rule basic_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:621:2: ( ( basic_expr )+ -> ^( APPLY ( basic_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:621:4: ( basic_expr )+
            {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:621:4: ( basic_expr )+
            int cnt188=0;
            loop188:
            do {
                int alt188=2;
                int LA188_0 = input.LA(1);

                if ( (LA188_0==L_begin||(LA188_0>=L_with && LA188_0<=L_if)||(LA188_0>=L_while && LA188_0<=L_for)||LA188_0==L_match||(LA188_0>=A_infinity && LA188_0<=U_infinity)||(LA188_0>=L_true && LA188_0<=L_this)||(LA188_0>=Constr && LA188_0<=Num)||(LA188_0>=String && LA188_0<=ROUND_BRACKET_OPEN)||LA188_0==SQUARE_BRACKET_OPEN||LA188_0==CURLY_BRACKET_OPEN) ) {
                    alt188=1;
                }


                switch (alt188) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:621:4: basic_expr
            	    {
            	    pushFollow(FOLLOW_basic_expr_in_apply_expr4047);
            	    basic_expr398=basic_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_basic_expr.add(basic_expr398.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt188 >= 1 ) break loop188;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(188, input);
                        throw eee;
                }
                cnt188++;
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
            // 621:16: -> ^( APPLY ( basic_expr )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:621:19: ^( APPLY ( basic_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(APPLY, "APPLY"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:621:27: ( basic_expr )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:622:1: p_apply_expr : p_basic_expr ( ( NL )? p_basic_expr )* -> ^( APPLY ( p_basic_expr )* ) ;
    public final babel17Parser.p_apply_expr_return p_apply_expr() throws RecognitionException {
        babel17Parser.p_apply_expr_return retval = new babel17Parser.p_apply_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL400=null;
        babel17Parser.p_basic_expr_return p_basic_expr399 = null;

        babel17Parser.p_basic_expr_return p_basic_expr401 = null;


        CommonTree NL400_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_p_basic_expr=new RewriteRuleSubtreeStream(adaptor,"rule p_basic_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:623:2: ( p_basic_expr ( ( NL )? p_basic_expr )* -> ^( APPLY ( p_basic_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:623:4: p_basic_expr ( ( NL )? p_basic_expr )*
            {
            pushFollow(FOLLOW_p_basic_expr_in_p_apply_expr4065);
            p_basic_expr399=p_basic_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_p_basic_expr.add(p_basic_expr399.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:623:17: ( ( NL )? p_basic_expr )*
            loop190:
            do {
                int alt190=2;
                int LA190_0 = input.LA(1);

                if ( (LA190_0==NL) ) {
                    int LA190_1 = input.LA(2);

                    if ( (LA190_1==L_begin||(LA190_1>=L_with && LA190_1<=L_if)||(LA190_1>=L_while && LA190_1<=L_for)||LA190_1==L_match||(LA190_1>=A_infinity && LA190_1<=U_infinity)||(LA190_1>=L_true && LA190_1<=L_this)||(LA190_1>=Constr && LA190_1<=Num)||(LA190_1>=String && LA190_1<=ROUND_BRACKET_OPEN)||LA190_1==SQUARE_BRACKET_OPEN||LA190_1==CURLY_BRACKET_OPEN) ) {
                        alt190=1;
                    }


                }
                else if ( (LA190_0==L_begin||(LA190_0>=L_with && LA190_0<=L_if)||(LA190_0>=L_while && LA190_0<=L_for)||LA190_0==L_match||(LA190_0>=A_infinity && LA190_0<=U_infinity)||(LA190_0>=L_true && LA190_0<=L_this)||(LA190_0>=Constr && LA190_0<=Num)||(LA190_0>=String && LA190_0<=ROUND_BRACKET_OPEN)||LA190_0==SQUARE_BRACKET_OPEN||LA190_0==CURLY_BRACKET_OPEN) ) {
                    alt190=1;
                }


                switch (alt190) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:623:18: ( NL )? p_basic_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:623:18: ( NL )?
            	    int alt189=2;
            	    int LA189_0 = input.LA(1);

            	    if ( (LA189_0==NL) ) {
            	        alt189=1;
            	    }
            	    switch (alt189) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:623:18: NL
            	            {
            	            NL400=(Token)match(input,NL,FOLLOW_NL_in_p_apply_expr4068); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL400);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_basic_expr_in_p_apply_expr4071);
            	    p_basic_expr401=p_basic_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_p_basic_expr.add(p_basic_expr401.getTree());

            	    }
            	    break;

            	default :
            	    break loop190;
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
            // 623:37: -> ^( APPLY ( p_basic_expr )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:623:40: ^( APPLY ( p_basic_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(APPLY, "APPLY"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:623:48: ( p_basic_expr )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:625:1: basic_expr : message_send_expr ;
    public final babel17Parser.basic_expr_return basic_expr() throws RecognitionException {
        babel17Parser.basic_expr_return retval = new babel17Parser.basic_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.message_send_expr_return message_send_expr402 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:626:2: ( message_send_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:626:4: message_send_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_message_send_expr_in_basic_expr4091);
            message_send_expr402=message_send_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, message_send_expr402.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:628:1: p_basic_expr : message_send_expr ;
    public final babel17Parser.p_basic_expr_return p_basic_expr() throws RecognitionException {
        babel17Parser.p_basic_expr_return retval = new babel17Parser.p_basic_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.message_send_expr_return message_send_expr403 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:629:2: ( message_send_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:629:4: message_send_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_message_send_expr_in_p_basic_expr4100);
            message_send_expr403=message_send_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, message_send_expr403.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:631:1: message_send_expr : primitive_expr ( ( NL )? PERIOD ( NL )? Id )* -> ^( MESSAGE_SEND primitive_expr ( Id )* ) ;
    public final babel17Parser.message_send_expr_return message_send_expr() throws RecognitionException {
        babel17Parser.message_send_expr_return retval = new babel17Parser.message_send_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL405=null;
        Token PERIOD406=null;
        Token NL407=null;
        Token Id408=null;
        babel17Parser.primitive_expr_return primitive_expr404 = null;


        CommonTree NL405_tree=null;
        CommonTree PERIOD406_tree=null;
        CommonTree NL407_tree=null;
        CommonTree Id408_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
        RewriteRuleTokenStream stream_Id=new RewriteRuleTokenStream(adaptor,"token Id");
        RewriteRuleSubtreeStream stream_primitive_expr=new RewriteRuleSubtreeStream(adaptor,"rule primitive_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:632:2: ( primitive_expr ( ( NL )? PERIOD ( NL )? Id )* -> ^( MESSAGE_SEND primitive_expr ( Id )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:632:4: primitive_expr ( ( NL )? PERIOD ( NL )? Id )*
            {
            pushFollow(FOLLOW_primitive_expr_in_message_send_expr4109);
            primitive_expr404=primitive_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_primitive_expr.add(primitive_expr404.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:632:19: ( ( NL )? PERIOD ( NL )? Id )*
            loop193:
            do {
                int alt193=2;
                int LA193_0 = input.LA(1);

                if ( (LA193_0==NL) ) {
                    int LA193_1 = input.LA(2);

                    if ( (LA193_1==PERIOD) ) {
                        alt193=1;
                    }


                }
                else if ( (LA193_0==PERIOD) ) {
                    alt193=1;
                }


                switch (alt193) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:632:20: ( NL )? PERIOD ( NL )? Id
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:632:20: ( NL )?
            	    int alt191=2;
            	    int LA191_0 = input.LA(1);

            	    if ( (LA191_0==NL) ) {
            	        alt191=1;
            	    }
            	    switch (alt191) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:632:20: NL
            	            {
            	            NL405=(Token)match(input,NL,FOLLOW_NL_in_message_send_expr4112); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL405);


            	            }
            	            break;

            	    }

            	    PERIOD406=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_message_send_expr4115); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD406);

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:632:31: ( NL )?
            	    int alt192=2;
            	    int LA192_0 = input.LA(1);

            	    if ( (LA192_0==NL) ) {
            	        alt192=1;
            	    }
            	    switch (alt192) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:632:31: NL
            	            {
            	            NL407=(Token)match(input,NL,FOLLOW_NL_in_message_send_expr4117); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL407);


            	            }
            	            break;

            	    }

            	    Id408=(Token)match(input,Id,FOLLOW_Id_in_message_send_expr4120); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_Id.add(Id408);


            	    }
            	    break;

            	default :
            	    break loop193;
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
            // 632:40: -> ^( MESSAGE_SEND primitive_expr ( Id )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:632:43: ^( MESSAGE_SEND primitive_expr ( Id )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MESSAGE_SEND, "MESSAGE_SEND"), root_1);

                adaptor.addChild(root_1, stream_primitive_expr.nextTree());
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:632:73: ( Id )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:634:1: list_expr : ( '[' ( NL )? ( protected_expr ( ( NL )? COMMA ( NL )? protected_expr )* ( NL )? )? ']' -> ^( SQUARE_LIST ( protected_expr )* ) | '(' ( NL )? ( protected_expr ( ( NL )? COMMA ( NL )? protected_expr )* ( NL )? ( COMMA ( NL )? )? )? ')' -> ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( protected_expr )* ) ) );
    public final babel17Parser.list_expr_return list_expr() throws RecognitionException {
        babel17Parser.list_expr_return retval = new babel17Parser.list_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal409=null;
        Token NL410=null;
        Token NL412=null;
        Token COMMA413=null;
        Token NL414=null;
        Token NL416=null;
        Token char_literal417=null;
        Token char_literal418=null;
        Token NL419=null;
        Token NL421=null;
        Token COMMA422=null;
        Token NL423=null;
        Token NL425=null;
        Token COMMA426=null;
        Token NL427=null;
        Token char_literal428=null;
        babel17Parser.protected_expr_return protected_expr411 = null;

        babel17Parser.protected_expr_return protected_expr415 = null;

        babel17Parser.protected_expr_return protected_expr420 = null;

        babel17Parser.protected_expr_return protected_expr424 = null;


        CommonTree char_literal409_tree=null;
        CommonTree NL410_tree=null;
        CommonTree NL412_tree=null;
        CommonTree COMMA413_tree=null;
        CommonTree NL414_tree=null;
        CommonTree NL416_tree=null;
        CommonTree char_literal417_tree=null;
        CommonTree char_literal418_tree=null;
        CommonTree NL419_tree=null;
        CommonTree NL421_tree=null;
        CommonTree COMMA422_tree=null;
        CommonTree NL423_tree=null;
        CommonTree NL425_tree=null;
        CommonTree COMMA426_tree=null;
        CommonTree NL427_tree=null;
        CommonTree char_literal428_tree=null;
        RewriteRuleTokenStream stream_ROUND_BRACKET_OPEN=new RewriteRuleTokenStream(adaptor,"token ROUND_BRACKET_OPEN");
        RewriteRuleTokenStream stream_SQUARE_BRACKET_CLOSE=new RewriteRuleTokenStream(adaptor,"token SQUARE_BRACKET_CLOSE");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_ROUND_BRACKET_CLOSE=new RewriteRuleTokenStream(adaptor,"token ROUND_BRACKET_CLOSE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_SQUARE_BRACKET_OPEN=new RewriteRuleTokenStream(adaptor,"token SQUARE_BRACKET_OPEN");
        RewriteRuleSubtreeStream stream_protected_expr=new RewriteRuleSubtreeStream(adaptor,"rule protected_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:635:2: ( '[' ( NL )? ( protected_expr ( ( NL )? COMMA ( NL )? protected_expr )* ( NL )? )? ']' -> ^( SQUARE_LIST ( protected_expr )* ) | '(' ( NL )? ( protected_expr ( ( NL )? COMMA ( NL )? protected_expr )* ( NL )? ( COMMA ( NL )? )? )? ')' -> ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( protected_expr )* ) ) )
            int alt208=2;
            int LA208_0 = input.LA(1);

            if ( (LA208_0==SQUARE_BRACKET_OPEN) ) {
                alt208=1;
            }
            else if ( (LA208_0==ROUND_BRACKET_OPEN) ) {
                alt208=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 208, 0, input);

                throw nvae;
            }
            switch (alt208) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:635:4: '[' ( NL )? ( protected_expr ( ( NL )? COMMA ( NL )? protected_expr )* ( NL )? )? ']'
                    {
                    char_literal409=(Token)match(input,SQUARE_BRACKET_OPEN,FOLLOW_SQUARE_BRACKET_OPEN_in_list_expr4144); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SQUARE_BRACKET_OPEN.add(char_literal409);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:635:8: ( NL )?
                    int alt194=2;
                    int LA194_0 = input.LA(1);

                    if ( (LA194_0==NL) ) {
                        alt194=1;
                    }
                    switch (alt194) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:635:8: NL
                            {
                            NL410=(Token)match(input,NL,FOLLOW_NL_in_list_expr4146); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL410);


                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:635:12: ( protected_expr ( ( NL )? COMMA ( NL )? protected_expr )* ( NL )? )?
                    int alt199=2;
                    int LA199_0 = input.LA(1);

                    if ( (LA199_0==L_begin||(LA199_0>=L_obj && LA199_0<=L_if)||(LA199_0>=L_while && LA199_0<=L_for)||(LA199_0>=L_match && LA199_0<=L_case)||LA199_0==L_exception||(LA199_0>=A_infinity && LA199_0<=L_lazy)||(LA199_0>=L_true && LA199_0<=L_random)||LA199_0==MINUS||LA199_0==A_NOT||LA199_0==U_NOT||LA199_0==TILDE||(LA199_0>=Constr && LA199_0<=Num)||(LA199_0>=String && LA199_0<=ROUND_BRACKET_OPEN)||LA199_0==SQUARE_BRACKET_OPEN||LA199_0==CURLY_BRACKET_OPEN||LA199_0==UNDERSCORE) ) {
                        alt199=1;
                    }
                    switch (alt199) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:635:13: protected_expr ( ( NL )? COMMA ( NL )? protected_expr )* ( NL )?
                            {
                            pushFollow(FOLLOW_protected_expr_in_list_expr4150);
                            protected_expr411=protected_expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr411.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:635:28: ( ( NL )? COMMA ( NL )? protected_expr )*
                            loop197:
                            do {
                                int alt197=2;
                                int LA197_0 = input.LA(1);

                                if ( (LA197_0==NL) ) {
                                    int LA197_1 = input.LA(2);

                                    if ( (LA197_1==COMMA) ) {
                                        alt197=1;
                                    }


                                }
                                else if ( (LA197_0==COMMA) ) {
                                    alt197=1;
                                }


                                switch (alt197) {
                            	case 1 :
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:635:29: ( NL )? COMMA ( NL )? protected_expr
                            	    {
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:635:29: ( NL )?
                            	    int alt195=2;
                            	    int LA195_0 = input.LA(1);

                            	    if ( (LA195_0==NL) ) {
                            	        alt195=1;
                            	    }
                            	    switch (alt195) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:635:29: NL
                            	            {
                            	            NL412=(Token)match(input,NL,FOLLOW_NL_in_list_expr4153); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL412);


                            	            }
                            	            break;

                            	    }

                            	    COMMA413=(Token)match(input,COMMA,FOLLOW_COMMA_in_list_expr4156); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA413);

                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:635:39: ( NL )?
                            	    int alt196=2;
                            	    int LA196_0 = input.LA(1);

                            	    if ( (LA196_0==NL) ) {
                            	        alt196=1;
                            	    }
                            	    switch (alt196) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:635:39: NL
                            	            {
                            	            NL414=(Token)match(input,NL,FOLLOW_NL_in_list_expr4158); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL414);


                            	            }
                            	            break;

                            	    }

                            	    pushFollow(FOLLOW_protected_expr_in_list_expr4161);
                            	    protected_expr415=protected_expr();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr415.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop197;
                                }
                            } while (true);

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:635:60: ( NL )?
                            int alt198=2;
                            int LA198_0 = input.LA(1);

                            if ( (LA198_0==NL) ) {
                                alt198=1;
                            }
                            switch (alt198) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:635:60: NL
                                    {
                                    NL416=(Token)match(input,NL,FOLLOW_NL_in_list_expr4165); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL416);


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    char_literal417=(Token)match(input,SQUARE_BRACKET_CLOSE,FOLLOW_SQUARE_BRACKET_CLOSE_in_list_expr4170); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SQUARE_BRACKET_CLOSE.add(char_literal417);



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
                    // 635:70: -> ^( SQUARE_LIST ( protected_expr )* )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:635:73: ^( SQUARE_LIST ( protected_expr )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SQUARE_LIST, "SQUARE_LIST"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:635:87: ( protected_expr )*
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:636:4: '(' ( NL )? ( protected_expr ( ( NL )? COMMA ( NL )? protected_expr )* ( NL )? ( COMMA ( NL )? )? )? ')'
                    {
                    char_literal418=(Token)match(input,ROUND_BRACKET_OPEN,FOLLOW_ROUND_BRACKET_OPEN_in_list_expr4184); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ROUND_BRACKET_OPEN.add(char_literal418);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:636:8: ( NL )?
                    int alt200=2;
                    int LA200_0 = input.LA(1);

                    if ( (LA200_0==NL) ) {
                        alt200=1;
                    }
                    switch (alt200) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:636:8: NL
                            {
                            NL419=(Token)match(input,NL,FOLLOW_NL_in_list_expr4186); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL419);


                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:636:12: ( protected_expr ( ( NL )? COMMA ( NL )? protected_expr )* ( NL )? ( COMMA ( NL )? )? )?
                    int alt207=2;
                    int LA207_0 = input.LA(1);

                    if ( (LA207_0==L_begin||(LA207_0>=L_obj && LA207_0<=L_if)||(LA207_0>=L_while && LA207_0<=L_for)||(LA207_0>=L_match && LA207_0<=L_case)||LA207_0==L_exception||(LA207_0>=A_infinity && LA207_0<=L_lazy)||(LA207_0>=L_true && LA207_0<=L_random)||LA207_0==MINUS||LA207_0==A_NOT||LA207_0==U_NOT||LA207_0==TILDE||(LA207_0>=Constr && LA207_0<=Num)||(LA207_0>=String && LA207_0<=ROUND_BRACKET_OPEN)||LA207_0==SQUARE_BRACKET_OPEN||LA207_0==CURLY_BRACKET_OPEN||LA207_0==UNDERSCORE) ) {
                        alt207=1;
                    }
                    switch (alt207) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:636:13: protected_expr ( ( NL )? COMMA ( NL )? protected_expr )* ( NL )? ( COMMA ( NL )? )?
                            {
                            pushFollow(FOLLOW_protected_expr_in_list_expr4190);
                            protected_expr420=protected_expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr420.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:636:28: ( ( NL )? COMMA ( NL )? protected_expr )*
                            loop203:
                            do {
                                int alt203=2;
                                int LA203_0 = input.LA(1);

                                if ( (LA203_0==NL) ) {
                                    int LA203_1 = input.LA(2);

                                    if ( (LA203_1==COMMA) ) {
                                        int LA203_2 = input.LA(3);

                                        if ( (LA203_2==NL) ) {
                                            int LA203_4 = input.LA(4);

                                            if ( (LA203_4==L_begin||(LA203_4>=L_obj && LA203_4<=L_if)||(LA203_4>=L_while && LA203_4<=L_for)||(LA203_4>=L_match && LA203_4<=L_case)||LA203_4==L_exception||(LA203_4>=A_infinity && LA203_4<=L_lazy)||(LA203_4>=L_true && LA203_4<=L_random)||LA203_4==MINUS||LA203_4==A_NOT||LA203_4==U_NOT||LA203_4==TILDE||(LA203_4>=Constr && LA203_4<=Num)||(LA203_4>=String && LA203_4<=ROUND_BRACKET_OPEN)||LA203_4==SQUARE_BRACKET_OPEN||LA203_4==CURLY_BRACKET_OPEN||LA203_4==UNDERSCORE) ) {
                                                alt203=1;
                                            }


                                        }
                                        else if ( (LA203_2==L_begin||(LA203_2>=L_obj && LA203_2<=L_if)||(LA203_2>=L_while && LA203_2<=L_for)||(LA203_2>=L_match && LA203_2<=L_case)||LA203_2==L_exception||(LA203_2>=A_infinity && LA203_2<=L_lazy)||(LA203_2>=L_true && LA203_2<=L_random)||LA203_2==MINUS||LA203_2==A_NOT||LA203_2==U_NOT||LA203_2==TILDE||(LA203_2>=Constr && LA203_2<=Num)||(LA203_2>=String && LA203_2<=ROUND_BRACKET_OPEN)||LA203_2==SQUARE_BRACKET_OPEN||LA203_2==CURLY_BRACKET_OPEN||LA203_2==UNDERSCORE) ) {
                                            alt203=1;
                                        }


                                    }


                                }
                                else if ( (LA203_0==COMMA) ) {
                                    int LA203_2 = input.LA(2);

                                    if ( (LA203_2==NL) ) {
                                        int LA203_4 = input.LA(3);

                                        if ( (LA203_4==L_begin||(LA203_4>=L_obj && LA203_4<=L_if)||(LA203_4>=L_while && LA203_4<=L_for)||(LA203_4>=L_match && LA203_4<=L_case)||LA203_4==L_exception||(LA203_4>=A_infinity && LA203_4<=L_lazy)||(LA203_4>=L_true && LA203_4<=L_random)||LA203_4==MINUS||LA203_4==A_NOT||LA203_4==U_NOT||LA203_4==TILDE||(LA203_4>=Constr && LA203_4<=Num)||(LA203_4>=String && LA203_4<=ROUND_BRACKET_OPEN)||LA203_4==SQUARE_BRACKET_OPEN||LA203_4==CURLY_BRACKET_OPEN||LA203_4==UNDERSCORE) ) {
                                            alt203=1;
                                        }


                                    }
                                    else if ( (LA203_2==L_begin||(LA203_2>=L_obj && LA203_2<=L_if)||(LA203_2>=L_while && LA203_2<=L_for)||(LA203_2>=L_match && LA203_2<=L_case)||LA203_2==L_exception||(LA203_2>=A_infinity && LA203_2<=L_lazy)||(LA203_2>=L_true && LA203_2<=L_random)||LA203_2==MINUS||LA203_2==A_NOT||LA203_2==U_NOT||LA203_2==TILDE||(LA203_2>=Constr && LA203_2<=Num)||(LA203_2>=String && LA203_2<=ROUND_BRACKET_OPEN)||LA203_2==SQUARE_BRACKET_OPEN||LA203_2==CURLY_BRACKET_OPEN||LA203_2==UNDERSCORE) ) {
                                        alt203=1;
                                    }


                                }


                                switch (alt203) {
                            	case 1 :
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:636:29: ( NL )? COMMA ( NL )? protected_expr
                            	    {
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:636:29: ( NL )?
                            	    int alt201=2;
                            	    int LA201_0 = input.LA(1);

                            	    if ( (LA201_0==NL) ) {
                            	        alt201=1;
                            	    }
                            	    switch (alt201) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:636:29: NL
                            	            {
                            	            NL421=(Token)match(input,NL,FOLLOW_NL_in_list_expr4193); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL421);


                            	            }
                            	            break;

                            	    }

                            	    COMMA422=(Token)match(input,COMMA,FOLLOW_COMMA_in_list_expr4196); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA422);

                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:636:39: ( NL )?
                            	    int alt202=2;
                            	    int LA202_0 = input.LA(1);

                            	    if ( (LA202_0==NL) ) {
                            	        alt202=1;
                            	    }
                            	    switch (alt202) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:636:39: NL
                            	            {
                            	            NL423=(Token)match(input,NL,FOLLOW_NL_in_list_expr4198); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL423);


                            	            }
                            	            break;

                            	    }

                            	    pushFollow(FOLLOW_protected_expr_in_list_expr4201);
                            	    protected_expr424=protected_expr();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr424.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop203;
                                }
                            } while (true);

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:636:60: ( NL )?
                            int alt204=2;
                            int LA204_0 = input.LA(1);

                            if ( (LA204_0==NL) ) {
                                alt204=1;
                            }
                            switch (alt204) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:636:60: NL
                                    {
                                    NL425=(Token)match(input,NL,FOLLOW_NL_in_list_expr4205); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL425);


                                    }
                                    break;

                            }

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:636:64: ( COMMA ( NL )? )?
                            int alt206=2;
                            int LA206_0 = input.LA(1);

                            if ( (LA206_0==COMMA) ) {
                                alt206=1;
                            }
                            switch (alt206) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:636:65: COMMA ( NL )?
                                    {
                                    COMMA426=(Token)match(input,COMMA,FOLLOW_COMMA_in_list_expr4209); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_COMMA.add(COMMA426);

                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:636:71: ( NL )?
                                    int alt205=2;
                                    int LA205_0 = input.LA(1);

                                    if ( (LA205_0==NL) ) {
                                        alt205=1;
                                    }
                                    switch (alt205) {
                                        case 1 :
                                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:636:71: NL
                                            {
                                            NL427=(Token)match(input,NL,FOLLOW_NL_in_list_expr4211); if (state.failed) return retval; 
                                            if ( state.backtracking==0 ) stream_NL.add(NL427);


                                            }
                                            break;

                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    char_literal428=(Token)match(input,ROUND_BRACKET_CLOSE,FOLLOW_ROUND_BRACKET_CLOSE_in_list_expr4218); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ROUND_BRACKET_CLOSE.add(char_literal428);



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
                    // 636:83: -> ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( protected_expr )* ) )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:636:86: ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( protected_expr )* ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ROUND_LIST, "ROUND_LIST"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:636:99: ^( NIL_TOKEN ( COMMA )* )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_2);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:636:111: ( COMMA )*
                        while ( stream_COMMA.hasNext() ) {
                            adaptor.addChild(root_2, stream_COMMA.nextNode());

                        }
                        stream_COMMA.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:636:119: ^( NIL_TOKEN ( protected_expr )* )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_2);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:636:131: ( protected_expr )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:638:1: map_or_set_expr : ( '{' ( NL )? ( map_or_set_elem_expr ( NL )? ( COMMA ( NL )? map_or_set_elem_expr ( NL )? )* )? '}' -> ^( MAP_OR_SET_OR_OBJ ( map_or_set_elem_expr )* ) | '{' ( NL )? token_ARROW ( NL )? '}' -> ^( EMPTY_MAP ) | '{' ( NL )? ASSIGN ( NL )? '}' -> ^( EMPTY_OBJ ) );
    public final babel17Parser.map_or_set_expr_return map_or_set_expr() throws RecognitionException {
        babel17Parser.map_or_set_expr_return retval = new babel17Parser.map_or_set_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal429=null;
        Token NL430=null;
        Token NL432=null;
        Token COMMA433=null;
        Token NL434=null;
        Token NL436=null;
        Token char_literal437=null;
        Token char_literal438=null;
        Token NL439=null;
        Token NL441=null;
        Token char_literal442=null;
        Token char_literal443=null;
        Token NL444=null;
        Token ASSIGN445=null;
        Token NL446=null;
        Token char_literal447=null;
        babel17Parser.map_or_set_elem_expr_return map_or_set_elem_expr431 = null;

        babel17Parser.map_or_set_elem_expr_return map_or_set_elem_expr435 = null;

        babel17Parser.token_ARROW_return token_ARROW440 = null;


        CommonTree char_literal429_tree=null;
        CommonTree NL430_tree=null;
        CommonTree NL432_tree=null;
        CommonTree COMMA433_tree=null;
        CommonTree NL434_tree=null;
        CommonTree NL436_tree=null;
        CommonTree char_literal437_tree=null;
        CommonTree char_literal438_tree=null;
        CommonTree NL439_tree=null;
        CommonTree NL441_tree=null;
        CommonTree char_literal442_tree=null;
        CommonTree char_literal443_tree=null;
        CommonTree NL444_tree=null;
        CommonTree ASSIGN445_tree=null;
        CommonTree NL446_tree=null;
        CommonTree char_literal447_tree=null;
        RewriteRuleTokenStream stream_CURLY_BRACKET_OPEN=new RewriteRuleTokenStream(adaptor,"token CURLY_BRACKET_OPEN");
        RewriteRuleTokenStream stream_CURLY_BRACKET_CLOSE=new RewriteRuleTokenStream(adaptor,"token CURLY_BRACKET_CLOSE");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_map_or_set_elem_expr=new RewriteRuleSubtreeStream(adaptor,"rule map_or_set_elem_expr");
        RewriteRuleSubtreeStream stream_token_ARROW=new RewriteRuleSubtreeStream(adaptor,"rule token_ARROW");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:639:2: ( '{' ( NL )? ( map_or_set_elem_expr ( NL )? ( COMMA ( NL )? map_or_set_elem_expr ( NL )? )* )? '}' -> ^( MAP_OR_SET_OR_OBJ ( map_or_set_elem_expr )* ) | '{' ( NL )? token_ARROW ( NL )? '}' -> ^( EMPTY_MAP ) | '{' ( NL )? ASSIGN ( NL )? '}' -> ^( EMPTY_OBJ ) )
            int alt219=3;
            int LA219_0 = input.LA(1);

            if ( (LA219_0==CURLY_BRACKET_OPEN) ) {
                switch ( input.LA(2) ) {
                case NL:
                    {
                    switch ( input.LA(3) ) {
                    case A_ARROW:
                    case U_ARROW:
                        {
                        alt219=2;
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
                    case MINUS:
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
                        alt219=1;
                        }
                        break;
                    case ASSIGN:
                        {
                        alt219=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 219, 2, input);

                        throw nvae;
                    }

                    }
                    break;
                case A_ARROW:
                case U_ARROW:
                    {
                    alt219=2;
                    }
                    break;
                case ASSIGN:
                    {
                    alt219=3;
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
                case MINUS:
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
                    alt219=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 219, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 219, 0, input);

                throw nvae;
            }
            switch (alt219) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:639:4: '{' ( NL )? ( map_or_set_elem_expr ( NL )? ( COMMA ( NL )? map_or_set_elem_expr ( NL )? )* )? '}'
                    {
                    char_literal429=(Token)match(input,CURLY_BRACKET_OPEN,FOLLOW_CURLY_BRACKET_OPEN_in_map_or_set_expr4247); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_OPEN.add(char_literal429);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:639:8: ( NL )?
                    int alt209=2;
                    int LA209_0 = input.LA(1);

                    if ( (LA209_0==NL) ) {
                        alt209=1;
                    }
                    switch (alt209) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:639:8: NL
                            {
                            NL430=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_expr4249); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL430);


                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:639:12: ( map_or_set_elem_expr ( NL )? ( COMMA ( NL )? map_or_set_elem_expr ( NL )? )* )?
                    int alt214=2;
                    int LA214_0 = input.LA(1);

                    if ( (LA214_0==L_begin||(LA214_0>=L_obj && LA214_0<=L_if)||(LA214_0>=L_while && LA214_0<=L_for)||(LA214_0>=L_match && LA214_0<=L_case)||LA214_0==L_exception||(LA214_0>=A_infinity && LA214_0<=L_lazy)||(LA214_0>=L_true && LA214_0<=L_random)||LA214_0==MINUS||LA214_0==A_NOT||LA214_0==U_NOT||LA214_0==TILDE||(LA214_0>=Constr && LA214_0<=Num)||(LA214_0>=String && LA214_0<=ROUND_BRACKET_OPEN)||LA214_0==SQUARE_BRACKET_OPEN||LA214_0==CURLY_BRACKET_OPEN||LA214_0==UNDERSCORE) ) {
                        alt214=1;
                    }
                    switch (alt214) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:639:13: map_or_set_elem_expr ( NL )? ( COMMA ( NL )? map_or_set_elem_expr ( NL )? )*
                            {
                            pushFollow(FOLLOW_map_or_set_elem_expr_in_map_or_set_expr4253);
                            map_or_set_elem_expr431=map_or_set_elem_expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_map_or_set_elem_expr.add(map_or_set_elem_expr431.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:639:34: ( NL )?
                            int alt210=2;
                            int LA210_0 = input.LA(1);

                            if ( (LA210_0==NL) ) {
                                alt210=1;
                            }
                            switch (alt210) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:639:34: NL
                                    {
                                    NL432=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_expr4255); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL432);


                                    }
                                    break;

                            }

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:639:38: ( COMMA ( NL )? map_or_set_elem_expr ( NL )? )*
                            loop213:
                            do {
                                int alt213=2;
                                int LA213_0 = input.LA(1);

                                if ( (LA213_0==COMMA) ) {
                                    alt213=1;
                                }


                                switch (alt213) {
                            	case 1 :
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:639:39: COMMA ( NL )? map_or_set_elem_expr ( NL )?
                            	    {
                            	    COMMA433=(Token)match(input,COMMA,FOLLOW_COMMA_in_map_or_set_expr4259); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA433);

                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:639:45: ( NL )?
                            	    int alt211=2;
                            	    int LA211_0 = input.LA(1);

                            	    if ( (LA211_0==NL) ) {
                            	        alt211=1;
                            	    }
                            	    switch (alt211) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:639:45: NL
                            	            {
                            	            NL434=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_expr4261); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL434);


                            	            }
                            	            break;

                            	    }

                            	    pushFollow(FOLLOW_map_or_set_elem_expr_in_map_or_set_expr4264);
                            	    map_or_set_elem_expr435=map_or_set_elem_expr();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_map_or_set_elem_expr.add(map_or_set_elem_expr435.getTree());
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:639:70: ( NL )?
                            	    int alt212=2;
                            	    int LA212_0 = input.LA(1);

                            	    if ( (LA212_0==NL) ) {
                            	        alt212=1;
                            	    }
                            	    switch (alt212) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:639:70: NL
                            	            {
                            	            NL436=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_expr4266); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL436);


                            	            }
                            	            break;

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop213;
                                }
                            } while (true);


                            }
                            break;

                    }

                    char_literal437=(Token)match(input,CURLY_BRACKET_CLOSE,FOLLOW_CURLY_BRACKET_CLOSE_in_map_or_set_expr4273); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_CLOSE.add(char_literal437);



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
                    // 639:82: -> ^( MAP_OR_SET_OR_OBJ ( map_or_set_elem_expr )* )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:639:85: ^( MAP_OR_SET_OR_OBJ ( map_or_set_elem_expr )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MAP_OR_SET_OR_OBJ, "MAP_OR_SET_OR_OBJ"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:639:105: ( map_or_set_elem_expr )*
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:640:10: '{' ( NL )? token_ARROW ( NL )? '}'
                    {
                    char_literal438=(Token)match(input,CURLY_BRACKET_OPEN,FOLLOW_CURLY_BRACKET_OPEN_in_map_or_set_expr4293); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_OPEN.add(char_literal438);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:640:14: ( NL )?
                    int alt215=2;
                    int LA215_0 = input.LA(1);

                    if ( (LA215_0==NL) ) {
                        alt215=1;
                    }
                    switch (alt215) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:640:14: NL
                            {
                            NL439=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_expr4295); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL439);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_token_ARROW_in_map_or_set_expr4298);
                    token_ARROW440=token_ARROW();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_token_ARROW.add(token_ARROW440.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:640:30: ( NL )?
                    int alt216=2;
                    int LA216_0 = input.LA(1);

                    if ( (LA216_0==NL) ) {
                        alt216=1;
                    }
                    switch (alt216) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:640:30: NL
                            {
                            NL441=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_expr4300); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL441);


                            }
                            break;

                    }

                    char_literal442=(Token)match(input,CURLY_BRACKET_CLOSE,FOLLOW_CURLY_BRACKET_CLOSE_in_map_or_set_expr4303); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_CLOSE.add(char_literal442);



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
                    // 640:38: -> ^( EMPTY_MAP )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:640:41: ^( EMPTY_MAP )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EMPTY_MAP, "EMPTY_MAP"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:641:4: '{' ( NL )? ASSIGN ( NL )? '}'
                    {
                    char_literal443=(Token)match(input,CURLY_BRACKET_OPEN,FOLLOW_CURLY_BRACKET_OPEN_in_map_or_set_expr4314); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_OPEN.add(char_literal443);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:641:8: ( NL )?
                    int alt217=2;
                    int LA217_0 = input.LA(1);

                    if ( (LA217_0==NL) ) {
                        alt217=1;
                    }
                    switch (alt217) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:641:8: NL
                            {
                            NL444=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_expr4316); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL444);


                            }
                            break;

                    }

                    ASSIGN445=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_map_or_set_expr4319); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN445);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:641:19: ( NL )?
                    int alt218=2;
                    int LA218_0 = input.LA(1);

                    if ( (LA218_0==NL) ) {
                        alt218=1;
                    }
                    switch (alt218) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:641:19: NL
                            {
                            NL446=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_expr4321); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL446);


                            }
                            break;

                    }

                    char_literal447=(Token)match(input,CURLY_BRACKET_CLOSE,FOLLOW_CURLY_BRACKET_CLOSE_in_map_or_set_expr4324); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_CLOSE.add(char_literal447);



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
                    // 641:27: -> ^( EMPTY_OBJ )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:641:30: ^( EMPTY_OBJ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EMPTY_OBJ, "EMPTY_OBJ"), root_1);

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:643:1: map_or_set_elem_expr : protected_expr ( ( NL )? arrow_or_assign ( NL )? protected_expr )? -> ^( NIL_TOKEN ^( NIL_TOKEN ( protected_expr )* ) ( arrow_or_assign )* ) ;
    public final babel17Parser.map_or_set_elem_expr_return map_or_set_elem_expr() throws RecognitionException {
        babel17Parser.map_or_set_elem_expr_return retval = new babel17Parser.map_or_set_elem_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL449=null;
        Token NL451=null;
        babel17Parser.protected_expr_return protected_expr448 = null;

        babel17Parser.arrow_or_assign_return arrow_or_assign450 = null;

        babel17Parser.protected_expr_return protected_expr452 = null;


        CommonTree NL449_tree=null;
        CommonTree NL451_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_protected_expr=new RewriteRuleSubtreeStream(adaptor,"rule protected_expr");
        RewriteRuleSubtreeStream stream_arrow_or_assign=new RewriteRuleSubtreeStream(adaptor,"rule arrow_or_assign");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:644:2: ( protected_expr ( ( NL )? arrow_or_assign ( NL )? protected_expr )? -> ^( NIL_TOKEN ^( NIL_TOKEN ( protected_expr )* ) ( arrow_or_assign )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:644:4: protected_expr ( ( NL )? arrow_or_assign ( NL )? protected_expr )?
            {
            pushFollow(FOLLOW_protected_expr_in_map_or_set_elem_expr4341);
            protected_expr448=protected_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr448.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:644:19: ( ( NL )? arrow_or_assign ( NL )? protected_expr )?
            int alt222=2;
            int LA222_0 = input.LA(1);

            if ( (LA222_0==NL) ) {
                int LA222_1 = input.LA(2);

                if ( (LA222_1==ASSIGN||(LA222_1>=A_ARROW && LA222_1<=U_ARROW)) ) {
                    alt222=1;
                }
            }
            else if ( (LA222_0==ASSIGN||(LA222_0>=A_ARROW && LA222_0<=U_ARROW)) ) {
                alt222=1;
            }
            switch (alt222) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:644:20: ( NL )? arrow_or_assign ( NL )? protected_expr
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:644:20: ( NL )?
                    int alt220=2;
                    int LA220_0 = input.LA(1);

                    if ( (LA220_0==NL) ) {
                        alt220=1;
                    }
                    switch (alt220) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:644:20: NL
                            {
                            NL449=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_elem_expr4344); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL449);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_arrow_or_assign_in_map_or_set_elem_expr4347);
                    arrow_or_assign450=arrow_or_assign();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_arrow_or_assign.add(arrow_or_assign450.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:644:40: ( NL )?
                    int alt221=2;
                    int LA221_0 = input.LA(1);

                    if ( (LA221_0==NL) ) {
                        alt221=1;
                    }
                    switch (alt221) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:644:40: NL
                            {
                            NL451=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_elem_expr4349); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL451);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_protected_expr_in_map_or_set_elem_expr4352);
                    protected_expr452=protected_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr452.getTree());

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
            // 644:61: -> ^( NIL_TOKEN ^( NIL_TOKEN ( protected_expr )* ) ( arrow_or_assign )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:644:64: ^( NIL_TOKEN ^( NIL_TOKEN ( protected_expr )* ) ( arrow_or_assign )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:644:76: ^( NIL_TOKEN ( protected_expr )* )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_2);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:644:88: ( protected_expr )*
                while ( stream_protected_expr.hasNext() ) {
                    adaptor.addChild(root_2, stream_protected_expr.nextTree());

                }
                stream_protected_expr.reset();

                adaptor.addChild(root_1, root_2);
                }
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:644:105: ( arrow_or_assign )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:646:1: primitive_expr : ( Num | String | Id | Constr | L_true | L_false | L_this | token_infinity | list_expr | with_control_expr | map_or_set_expr );
    public final babel17Parser.primitive_expr_return primitive_expr() throws RecognitionException {
        babel17Parser.primitive_expr_return retval = new babel17Parser.primitive_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Num453=null;
        Token String454=null;
        Token Id455=null;
        Token Constr456=null;
        Token L_true457=null;
        Token L_false458=null;
        Token L_this459=null;
        babel17Parser.token_infinity_return token_infinity460 = null;

        babel17Parser.list_expr_return list_expr461 = null;

        babel17Parser.with_control_expr_return with_control_expr462 = null;

        babel17Parser.map_or_set_expr_return map_or_set_expr463 = null;


        CommonTree Num453_tree=null;
        CommonTree String454_tree=null;
        CommonTree Id455_tree=null;
        CommonTree Constr456_tree=null;
        CommonTree L_true457_tree=null;
        CommonTree L_false458_tree=null;
        CommonTree L_this459_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:647:2: ( Num | String | Id | Constr | L_true | L_false | L_this | token_infinity | list_expr | with_control_expr | map_or_set_expr )
            int alt223=11;
            switch ( input.LA(1) ) {
            case Num:
                {
                alt223=1;
                }
                break;
            case String:
                {
                alt223=2;
                }
                break;
            case Id:
                {
                alt223=3;
                }
                break;
            case Constr:
                {
                alt223=4;
                }
                break;
            case L_true:
                {
                alt223=5;
                }
                break;
            case L_false:
                {
                alt223=6;
                }
                break;
            case L_this:
                {
                alt223=7;
                }
                break;
            case A_infinity:
            case U_infinity:
                {
                alt223=8;
                }
                break;
            case ROUND_BRACKET_OPEN:
            case SQUARE_BRACKET_OPEN:
                {
                alt223=9;
                }
                break;
            case L_begin:
            case L_with:
            case L_if:
            case L_while:
            case L_for:
            case L_match:
                {
                alt223=10;
                }
                break;
            case CURLY_BRACKET_OPEN:
                {
                alt223=11;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 223, 0, input);

                throw nvae;
            }

            switch (alt223) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:647:4: Num
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Num453=(Token)match(input,Num,FOLLOW_Num_in_primitive_expr4379); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Num453_tree = (CommonTree)adaptor.create(Num453);
                    adaptor.addChild(root_0, Num453_tree);
                    }

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:648:4: String
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    String454=(Token)match(input,String,FOLLOW_String_in_primitive_expr4384); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    String454_tree = (CommonTree)adaptor.create(String454);
                    adaptor.addChild(root_0, String454_tree);
                    }

                    }
                    break;
                case 3 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:649:4: Id
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Id455=(Token)match(input,Id,FOLLOW_Id_in_primitive_expr4389); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Id455_tree = (CommonTree)adaptor.create(Id455);
                    adaptor.addChild(root_0, Id455_tree);
                    }

                    }
                    break;
                case 4 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:650:4: Constr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Constr456=(Token)match(input,Constr,FOLLOW_Constr_in_primitive_expr4394); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Constr456_tree = (CommonTree)adaptor.create(Constr456);
                    adaptor.addChild(root_0, Constr456_tree);
                    }

                    }
                    break;
                case 5 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:651:4: L_true
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    L_true457=(Token)match(input,L_true,FOLLOW_L_true_in_primitive_expr4399); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    L_true457_tree = (CommonTree)adaptor.create(L_true457);
                    adaptor.addChild(root_0, L_true457_tree);
                    }

                    }
                    break;
                case 6 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:652:4: L_false
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    L_false458=(Token)match(input,L_false,FOLLOW_L_false_in_primitive_expr4404); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    L_false458_tree = (CommonTree)adaptor.create(L_false458);
                    adaptor.addChild(root_0, L_false458_tree);
                    }

                    }
                    break;
                case 7 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:653:4: L_this
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    L_this459=(Token)match(input,L_this,FOLLOW_L_this_in_primitive_expr4409); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    L_this459_tree = (CommonTree)adaptor.create(L_this459);
                    adaptor.addChild(root_0, L_this459_tree);
                    }

                    }
                    break;
                case 8 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:654:4: token_infinity
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_infinity_in_primitive_expr4415);
                    token_infinity460=token_infinity();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, token_infinity460.getTree());

                    }
                    break;
                case 9 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:655:5: list_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_list_expr_in_primitive_expr4421);
                    list_expr461=list_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, list_expr461.getTree());

                    }
                    break;
                case 10 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:656:4: with_control_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_with_control_expr_in_primitive_expr4426);
                    with_control_expr462=with_control_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, with_control_expr462.getTree());

                    }
                    break;
                case 11 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:657:4: map_or_set_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_map_or_set_expr_in_primitive_expr4431);
                    map_or_set_expr463=map_or_set_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, map_or_set_expr463.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:659:1: prog : block EOF -> ^( PROG block ) ;
    public final babel17Parser.prog_return prog() throws RecognitionException {
        babel17Parser.prog_return retval = new babel17Parser.prog_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EOF465=null;
        babel17Parser.block_return block464 = null;


        CommonTree EOF465_tree=null;
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:659:7: ( block EOF -> ^( PROG block ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:659:9: block EOF
            {
            pushFollow(FOLLOW_block_in_prog4441);
            block464=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block464.getTree());
            EOF465=(Token)match(input,EOF,FOLLOW_EOF_in_prog4443); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EOF.add(EOF465);



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
            // 659:19: -> ^( PROG block )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:659:22: ^( PROG block )
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
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:353:10: ( Id ( NL )? L_as )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:353:11: Id ( NL )? L_as
        {
        match(input,Id,FOLLOW_Id_in_synpred1_babel171565); if (state.failed) return ;
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:353:14: ( NL )?
        int alt224=2;
        int LA224_0 = input.LA(1);

        if ( (LA224_0==NL) ) {
            alt224=1;
        }
        switch (alt224) {
            case 1 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:353:14: NL
                {
                match(input,NL,FOLLOW_NL_in_synpred1_babel171567); if (state.failed) return ;

                }
                break;

        }

        match(input,L_as,FOLLOW_L_as_in_synpred1_babel171570); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_babel17

    // $ANTLR start synpred2_babel17
    public final void synpred2_babel17_fragment() throws RecognitionException {   
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:354:4: ( protected_expr ( NL )? QUESTION_MARK )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:354:5: protected_expr ( NL )? QUESTION_MARK
        {
        pushFollow(FOLLOW_protected_expr_in_synpred2_babel171601);
        protected_expr();

        state._fsp--;
        if (state.failed) return ;
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:354:20: ( NL )?
        int alt225=2;
        int LA225_0 = input.LA(1);

        if ( (LA225_0==NL) ) {
            alt225=1;
        }
        switch (alt225) {
            case 1 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:354:20: NL
                {
                match(input,NL,FOLLOW_NL_in_synpred2_babel171603); if (state.failed) return ;

                }
                break;

        }

        match(input,QUESTION_MARK,FOLLOW_QUESTION_MARK_in_synpred2_babel171606); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_babel17

    // $ANTLR start synpred3_babel17
    public final void synpred3_babel17_fragment() throws RecognitionException {   
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:424:4: ( ( pattern | objelem_assign ) ( NL )? '=' )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:424:5: ( pattern | objelem_assign ) ( NL )? '='
        {
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:424:5: ( pattern | objelem_assign )
        int alt226=2;
        int LA226_0 = input.LA(1);

        if ( ((LA226_0>=A_infinity && LA226_0<=U_infinity)||(LA226_0>=L_true && LA226_0<=L_false)||LA226_0==MINUS||LA226_0==Constr||LA226_0==Num||(LA226_0>=String && LA226_0<=ROUND_BRACKET_OPEN)||LA226_0==SQUARE_BRACKET_OPEN||LA226_0==CURLY_BRACKET_OPEN||LA226_0==UNDERSCORE) ) {
            alt226=1;
        }
        else if ( (LA226_0==Id) ) {
            int LA226_2 = input.LA(2);

            if ( (LA226_2==PERIOD) ) {
                alt226=2;
            }
            else if ( (LA226_2==ASSIGN||(LA226_2>=A_DOUBLE_COLON && LA226_2<=U_DOUBLE_COLON)||LA226_2==NL) ) {
                alt226=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 226, 2, input);

                throw nvae;
            }
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 226, 0, input);

            throw nvae;
        }
        switch (alt226) {
            case 1 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:424:6: pattern
                {
                pushFollow(FOLLOW_pattern_in_synpred3_babel172383);
                pattern();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:424:16: objelem_assign
                {
                pushFollow(FOLLOW_objelem_assign_in_synpred3_babel172387);
                objelem_assign();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:424:32: ( NL )?
        int alt227=2;
        int LA227_0 = input.LA(1);

        if ( (LA227_0==NL) ) {
            alt227=1;
        }
        switch (alt227) {
            case 1 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:424:32: NL
                {
                match(input,NL,FOLLOW_NL_in_synpred3_babel172390); if (state.failed) return ;

                }
                break;

        }

        match(input,ASSIGN,FOLLOW_ASSIGN_in_synpred3_babel172393); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_babel17

    // $ANTLR start synpred4_babel17
    public final void synpred4_babel17_fragment() throws RecognitionException {   
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:456:11: ( L_obj ( NL )? parents )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:456:12: L_obj ( NL )? parents
        {
        match(input,L_obj,FOLLOW_L_obj_in_synpred4_babel172600); if (state.failed) return ;
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:456:18: ( NL )?
        int alt228=2;
        int LA228_0 = input.LA(1);

        if ( (LA228_0==NL) ) {
            alt228=1;
        }
        switch (alt228) {
            case 1 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:456:18: NL
                {
                match(input,NL,FOLLOW_NL_in_synpred4_babel172602); if (state.failed) return ;

                }
                break;

        }

        pushFollow(FOLLOW_parents_in_synpred4_babel172605);
        parents();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_babel17

    // $ANTLR start synpred5_babel17
    public final void synpred5_babel17_fragment() throws RecognitionException {   
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:460:4: ( lambda_expr )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:460:5: lambda_expr
        {
        pushFollow(FOLLOW_lambda_expr_in_synpred5_babel172674);
        lambda_expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_babel17

    // $ANTLR start synpred6_babel17
    public final void synpred6_babel17_fragment() throws RecognitionException {   
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:464:4: ( protected_lambda_expr )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:464:5: protected_lambda_expr
        {
        pushFollow(FOLLOW_protected_lambda_expr_in_synpred6_babel172695);
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
    protected DFA47 dfa47 = new DFA47(this);
    protected DFA53 dfa53 = new DFA53(this);
    protected DFA50 dfa50 = new DFA50(this);
    protected DFA70 dfa70 = new DFA70(this);
    protected DFA81 dfa81 = new DFA81(this);
    protected DFA82 dfa82 = new DFA82(this);
    static final String DFA16_eotS =
        "\34\uffff";
    static final String DFA16_eofS =
        "\34\uffff";
    static final String DFA16_minS =
        "\1\64\14\0\17\uffff";
    static final String DFA16_maxS =
        "\1\u0088\14\0\17\uffff";
    static final String DFA16_acceptS =
        "\15\uffff\13\2\1\4\1\5\1\1\1\3";
    static final String DFA16_specialS =
        "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\17\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\25\1\uffff\1\27\1\26\1\21\3\uffff\1\22\1\24\2\uffff\1\23"+
            "\1\15\1\uffff\1\30\2\uffff\1\16\2\uffff\2\10\3\16\1\uffff\1"+
            "\6\1\7\1\20\1\16\15\uffff\1\11\6\uffff\1\17\2\uffff\1\17\11"+
            "\uffff\2\31\3\uffff\1\16\3\uffff\1\2\1\1\1\5\1\uffff\1\4\1\13"+
            "\1\uffff\1\12\1\uffff\1\14\1\uffff\1\3",
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
            return "352:1: bracket_pattern : ( ( Id ( NL )? L_as )=> Id ( NL )? L_as ( NL )? pattern -> ^( L_as Id pattern ) | ( protected_expr ( NL )? QUESTION_MARK )=> protected_expr ( NL )? QUESTION_MARK ( ( NL )? pattern )? -> ^( QUESTION_MARK protected_expr ( pattern )? ) | pattern ( ( NL )? L_if ( NL )? protected_expr )? -> ^( IF_PATTERN pattern ( protected_expr )? ) | L_val ( NL )? protected_expr -> ^( L_val protected_expr ) | token_ELLIPSIS );";
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

                        else if ( (LA16_0==L_if) && (synpred2_babel17())) {s = 17;}

                        else if ( (LA16_0==L_while) && (synpred2_babel17())) {s = 18;}

                        else if ( (LA16_0==L_match) && (synpred2_babel17())) {s = 19;}

                        else if ( (LA16_0==L_for) && (synpred2_babel17())) {s = 20;}

                        else if ( (LA16_0==L_begin) && (synpred2_babel17())) {s = 21;}

                        else if ( (LA16_0==L_with) && (synpred2_babel17())) {s = 22;}

                        else if ( (LA16_0==L_obj) && (synpred2_babel17())) {s = 23;}

                        else if ( (LA16_0==L_val) ) {s = 24;}

                        else if ( ((LA16_0>=A_ELLIPSIS && LA16_0<=U_ELLIPSIS)) ) {s = 25;}

                         
                        input.seek(index16_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA16_1 = input.LA(1);

                         
                        int index16_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_babel17()) ) {s = 26;}

                        else if ( (synpred2_babel17()) ) {s = 23;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index16_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA16_2 = input.LA(1);

                         
                        int index16_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 23;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index16_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA16_3 = input.LA(1);

                         
                        int index16_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 23;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index16_3);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA16_4 = input.LA(1);

                         
                        int index16_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 23;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index16_4);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA16_5 = input.LA(1);

                         
                        int index16_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 23;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index16_5);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA16_6 = input.LA(1);

                         
                        int index16_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 23;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index16_6);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA16_7 = input.LA(1);

                         
                        int index16_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 23;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index16_7);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA16_8 = input.LA(1);

                         
                        int index16_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 23;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index16_8);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA16_9 = input.LA(1);

                         
                        int index16_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 23;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index16_9);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA16_10 = input.LA(1);

                         
                        int index16_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 23;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index16_10);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA16_11 = input.LA(1);

                         
                        int index16_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 23;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index16_11);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA16_12 = input.LA(1);

                         
                        int index16_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 23;}

                        else if ( (true) ) {s = 27;}

                         
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
    static final String DFA47_eotS =
        "\23\uffff";
    static final String DFA47_eofS =
        "\23\uffff";
    static final String DFA47_minS =
        "\1\111\7\uffff\1\111\2\uffff\1\41\1\111\2\uffff\1\41\3\uffff";
    static final String DFA47_maxS =
        "\1\u0088\7\uffff\1\177\2\uffff\1\u0088\1\177\2\uffff\1\u0088\3\uffff";
    static final String DFA47_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff\1\12\1\13\2\uffff\1"+
        "\11\1\10\1\uffff\1\14\1\16\1\15";
    static final String DFA47_specialS =
        "\23\uffff}>";
    static final String[] DFA47_transitionS = {
            "\2\7\4\uffff\1\5\1\6\17\uffff\1\10\35\uffff\1\1\1\4\1\uffff"+
            "\1\3\1\12\1\uffff\1\11\1\uffff\1\13\1\uffff\1\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\16\61\uffff\1\14\2\uffff\1\15",
            "",
            "",
            "\1\21\22\uffff\1\20\1\uffff\3\20\3\uffff\2\20\2\uffff\2\20"+
            "\1\uffff\1\20\2\uffff\1\20\2\uffff\5\20\1\uffff\4\20\15\uffff"+
            "\1\20\6\uffff\1\20\2\uffff\1\20\7\uffff\2\22\2\20\3\uffff\1"+
            "\20\2\uffff\1\17\3\20\1\uffff\2\20\1\uffff\1\20\1\uffff\3\20",
            "\2\16\64\uffff\1\15",
            "",
            "",
            "\1\21\22\uffff\1\20\1\uffff\3\20\3\uffff\2\20\2\uffff\2\20"+
            "\1\uffff\1\20\2\uffff\1\20\2\uffff\5\20\1\uffff\4\20\15\uffff"+
            "\1\20\6\uffff\1\20\2\uffff\1\20\7\uffff\2\22\2\20\3\uffff\1"+
            "\20\3\uffff\3\20\1\uffff\2\20\1\uffff\1\20\1\uffff\3\20",
            "",
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
            return "368:1: primitive_pattern : ( Id | '_' -> ANY | String | Num | L_true | L_false | token_infinity | '-' ( NL )? token_infinity -> ^( UMINUS token_infinity ) | '-' ( NL )? Num -> ^( UMINUS Num ) | '[' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* )? ']' -> ^( SQUARE_LIST ( bracket_pattern )* ) | '(' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* ( COMMA ( NL )? )? )? ')' -> ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( bracket_pattern )* ) ) | '{' ( NL )? ( mselem_pattern ( NL )? ( COMMA ( NL )? mselem_pattern ( NL )? )* )? '}' -> ^( MAP_OR_SET_OR_OBJ ( mselem_pattern )* ) | '{' ( NL )? token_ARROW ( NL )? '}' -> ^( EMPTY_MAP ) | '{' ( NL )? ASSIGN ( NL )? '}' -> ^( EMPTY_OBJ ) );";
        }
    }
    static final String DFA53_eotS =
        "\4\uffff";
    static final String DFA53_eofS =
        "\2\3\2\uffff";
    static final String DFA53_minS =
        "\2\64\2\uffff";
    static final String DFA53_maxS =
        "\2\u0088\2\uffff";
    static final String DFA53_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA53_specialS =
        "\4\uffff}>";
    static final String[] DFA53_transitionS = {
            "\1\2\1\3\3\2\1\uffff\2\3\2\2\1\uffff\2\2\1\3\1\uffff\2\2\1\uffff"+
            "\1\2\2\uffff\12\2\13\uffff\1\1\1\uffff\1\2\6\uffff\1\2\2\uffff"+
            "\1\2\16\uffff\1\2\2\uffff\1\1\3\2\1\uffff\2\2\1\uffff\1\2\1"+
            "\uffff\1\2\1\uffff\1\2",
            "\1\2\1\3\3\2\1\uffff\2\3\2\2\1\uffff\2\2\1\3\1\uffff\2\2\1"+
            "\uffff\1\2\2\uffff\12\2\13\uffff\1\1\1\uffff\1\2\6\uffff\1\2"+
            "\2\uffff\1\2\16\uffff\1\2\2\uffff\1\1\3\2\1\uffff\2\2\1\uffff"+
            "\1\2\1\uffff\1\2\1\uffff\1\2",
            "",
            ""
    };

    static final short[] DFA53_eot = DFA.unpackEncodedString(DFA53_eotS);
    static final short[] DFA53_eof = DFA.unpackEncodedString(DFA53_eofS);
    static final char[] DFA53_min = DFA.unpackEncodedStringToUnsignedChars(DFA53_minS);
    static final char[] DFA53_max = DFA.unpackEncodedStringToUnsignedChars(DFA53_maxS);
    static final short[] DFA53_accept = DFA.unpackEncodedString(DFA53_acceptS);
    static final short[] DFA53_special = DFA.unpackEncodedString(DFA53_specialS);
    static final short[][] DFA53_transition;

    static {
        int numStates = DFA53_transitionS.length;
        DFA53_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA53_transition[i] = DFA.unpackEncodedString(DFA53_transitionS[i]);
        }
    }

    class DFA53 extends DFA {

        public DFA53(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 53;
            this.eot = DFA53_eot;
            this.eof = DFA53_eof;
            this.min = DFA53_min;
            this.max = DFA53_max;
            this.accept = DFA53_accept;
            this.special = DFA53_special;
            this.transition = DFA53_transition;
        }
        public String getDescription() {
            return "392:1: block : ( ( sep )? statement ( sep statement )* ( sep )? -> ^( BLOCK ( statement )* ) | ( sep )? -> ^( BLOCK ) );";
        }
    }
    static final String DFA50_eotS =
        "\4\uffff";
    static final String DFA50_eofS =
        "\2\2\2\uffff";
    static final String DFA50_minS =
        "\1\65\1\64\2\uffff";
    static final String DFA50_maxS =
        "\1\174\1\u0088\2\uffff";
    static final String DFA50_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA50_specialS =
        "\4\uffff}>";
    static final String[] DFA50_transitionS = {
            "\1\2\4\uffff\2\2\5\uffff\1\2\34\uffff\1\1\35\uffff\1\1",
            "\1\3\1\2\3\3\1\uffff\2\2\2\3\1\uffff\2\3\1\2\1\uffff\2\3\1"+
            "\uffff\1\3\2\uffff\12\3\13\uffff\1\1\1\uffff\1\3\6\uffff\1\3"+
            "\2\uffff\1\3\16\uffff\1\3\2\uffff\1\1\3\3\1\uffff\2\3\1\uffff"+
            "\1\3\1\uffff\1\3\1\uffff\1\3",
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
            return "()* loopback of 392:25: ( sep statement )*";
        }
    }
    static final String DFA70_eotS =
        "\30\uffff";
    static final String DFA70_eofS =
        "\30\uffff";
    static final String DFA70_minS =
        "\1\64\14\0\13\uffff";
    static final String DFA70_maxS =
        "\1\u0088\14\0\13\uffff";
    static final String DFA70_acceptS =
        "\15\uffff\1\2\11\uffff\1\1";
    static final String DFA70_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\13"+
        "\uffff}>";
    static final String[] DFA70_transitionS = {
            "\1\15\1\uffff\3\15\3\uffff\2\15\2\uffff\1\15\5\uffff\1\15\2"+
            "\uffff\2\10\3\15\1\uffff\1\6\1\7\2\15\15\uffff\1\11\6\uffff"+
            "\1\15\2\uffff\1\15\16\uffff\1\15\3\uffff\1\1\1\2\1\5\1\uffff"+
            "\1\4\1\13\1\uffff\1\12\1\uffff\1\14\1\uffff\1\3",
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

    static final short[] DFA70_eot = DFA.unpackEncodedString(DFA70_eotS);
    static final short[] DFA70_eof = DFA.unpackEncodedString(DFA70_eofS);
    static final char[] DFA70_min = DFA.unpackEncodedStringToUnsignedChars(DFA70_minS);
    static final char[] DFA70_max = DFA.unpackEncodedStringToUnsignedChars(DFA70_maxS);
    static final short[] DFA70_accept = DFA.unpackEncodedString(DFA70_acceptS);
    static final short[] DFA70_special = DFA.unpackEncodedString(DFA70_specialS);
    static final short[][] DFA70_transition;

    static {
        int numStates = DFA70_transitionS.length;
        DFA70_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA70_transition[i] = DFA.unpackEncodedString(DFA70_transitionS[i]);
        }
    }

    class DFA70 extends DFA {

        public DFA70(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 70;
            this.eot = DFA70_eot;
            this.eof = DFA70_eof;
            this.min = DFA70_min;
            this.max = DFA70_max;
            this.accept = DFA70_accept;
            this.special = DFA70_special;
            this.transition = DFA70_transition;
        }
        public String getDescription() {
            return "423:1: expr_or_assign : ( ( ( pattern | objelem_assign ) ( NL )? '=' )=> ( pattern | objelem_assign ) ( NL )? '=' ( NL )? expr -> ^( ASSIGN pattern expr ) | expr );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA70_1 = input.LA(1);

                         
                        int index70_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 23;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index70_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA70_2 = input.LA(1);

                         
                        int index70_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 23;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index70_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA70_3 = input.LA(1);

                         
                        int index70_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 23;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index70_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA70_4 = input.LA(1);

                         
                        int index70_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 23;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index70_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA70_5 = input.LA(1);

                         
                        int index70_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 23;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index70_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA70_6 = input.LA(1);

                         
                        int index70_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 23;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index70_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA70_7 = input.LA(1);

                         
                        int index70_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 23;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index70_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA70_8 = input.LA(1);

                         
                        int index70_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 23;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index70_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA70_9 = input.LA(1);

                         
                        int index70_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 23;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index70_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA70_10 = input.LA(1);

                         
                        int index70_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 23;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index70_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA70_11 = input.LA(1);

                         
                        int index70_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 23;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index70_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA70_12 = input.LA(1);

                         
                        int index70_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 23;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index70_12);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 70, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA81_eotS =
        "\26\uffff";
    static final String DFA81_eofS =
        "\26\uffff";
    static final String DFA81_minS =
        "\1\64\2\0\1\uffff\11\0\11\uffff";
    static final String DFA81_maxS =
        "\1\u0088\2\0\1\uffff\11\0\11\uffff";
    static final String DFA81_acceptS =
        "\3\uffff\1\1\11\uffff\1\2\10\uffff";
    static final String DFA81_specialS =
        "\1\0\1\1\1\2\1\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\11"+
        "\uffff}>";
    static final String[] DFA81_transitionS = {
            "\1\15\2\uffff\2\15\3\uffff\2\15\2\uffff\1\15\5\uffff\1\15\2"+
            "\uffff\2\10\3\15\1\uffff\1\6\1\7\2\15\15\uffff\1\11\6\uffff"+
            "\1\15\2\uffff\1\15\16\uffff\1\15\3\uffff\1\1\1\2\1\5\1\uffff"+
            "\1\4\1\13\1\uffff\1\12\1\uffff\1\14\1\uffff\1\3",
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
            ""
    };

    static final short[] DFA81_eot = DFA.unpackEncodedString(DFA81_eotS);
    static final short[] DFA81_eof = DFA.unpackEncodedString(DFA81_eofS);
    static final char[] DFA81_min = DFA.unpackEncodedStringToUnsignedChars(DFA81_minS);
    static final char[] DFA81_max = DFA.unpackEncodedStringToUnsignedChars(DFA81_maxS);
    static final short[] DFA81_accept = DFA.unpackEncodedString(DFA81_acceptS);
    static final short[] DFA81_special = DFA.unpackEncodedString(DFA81_specialS);
    static final short[][] DFA81_transition;

    static {
        int numStates = DFA81_transitionS.length;
        DFA81_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA81_transition[i] = DFA.unpackEncodedString(DFA81_transitionS[i]);
        }
    }

    class DFA81 extends DFA {

        public DFA81(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 81;
            this.eot = DFA81_eot;
            this.eof = DFA81_eof;
            this.min = DFA81_min;
            this.max = DFA81_max;
            this.accept = DFA81_accept;
            this.special = DFA81_special;
            this.transition = DFA81_transition;
        }
        public String getDescription() {
            return "459:1: lop_expr : ( ( lambda_expr )=> lambda_expr | op_expr );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA81_0 = input.LA(1);

                         
                        int index81_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA81_0==Constr) ) {s = 1;}

                        else if ( (LA81_0==Id) ) {s = 2;}

                        else if ( (LA81_0==UNDERSCORE) && (synpred5_babel17())) {s = 3;}

                        else if ( (LA81_0==String) ) {s = 4;}

                        else if ( (LA81_0==Num) ) {s = 5;}

                        else if ( (LA81_0==L_true) ) {s = 6;}

                        else if ( (LA81_0==L_false) ) {s = 7;}

                        else if ( ((LA81_0>=A_infinity && LA81_0<=U_infinity)) ) {s = 8;}

                        else if ( (LA81_0==MINUS) ) {s = 9;}

                        else if ( (LA81_0==SQUARE_BRACKET_OPEN) ) {s = 10;}

                        else if ( (LA81_0==ROUND_BRACKET_OPEN) ) {s = 11;}

                        else if ( (LA81_0==CURLY_BRACKET_OPEN) ) {s = 12;}

                        else if ( (LA81_0==L_begin||(LA81_0>=L_with && LA81_0<=L_if)||(LA81_0>=L_while && LA81_0<=L_for)||LA81_0==L_match||LA81_0==L_exception||(LA81_0>=L_concurrent && LA81_0<=L_lazy)||(LA81_0>=L_this && LA81_0<=L_random)||LA81_0==A_NOT||LA81_0==U_NOT||LA81_0==TILDE) ) {s = 13;}

                         
                        input.seek(index81_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA81_1 = input.LA(1);

                         
                        int index81_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_babel17()) ) {s = 3;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index81_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA81_2 = input.LA(1);

                         
                        int index81_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_babel17()) ) {s = 3;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index81_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA81_4 = input.LA(1);

                         
                        int index81_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_babel17()) ) {s = 3;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index81_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA81_5 = input.LA(1);

                         
                        int index81_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_babel17()) ) {s = 3;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index81_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA81_6 = input.LA(1);

                         
                        int index81_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_babel17()) ) {s = 3;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index81_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA81_7 = input.LA(1);

                         
                        int index81_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_babel17()) ) {s = 3;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index81_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA81_8 = input.LA(1);

                         
                        int index81_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_babel17()) ) {s = 3;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index81_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA81_9 = input.LA(1);

                         
                        int index81_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_babel17()) ) {s = 3;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index81_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA81_10 = input.LA(1);

                         
                        int index81_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_babel17()) ) {s = 3;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index81_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA81_11 = input.LA(1);

                         
                        int index81_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_babel17()) ) {s = 3;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index81_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA81_12 = input.LA(1);

                         
                        int index81_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_babel17()) ) {s = 3;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index81_12);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 81, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA82_eotS =
        "\27\uffff";
    static final String DFA82_eofS =
        "\27\uffff";
    static final String DFA82_minS =
        "\1\64\2\0\1\uffff\11\0\12\uffff";
    static final String DFA82_maxS =
        "\1\u0088\2\0\1\uffff\11\0\12\uffff";
    static final String DFA82_acceptS =
        "\3\uffff\1\1\11\uffff\1\1\1\2\10\uffff";
    static final String DFA82_specialS =
        "\1\0\1\1\1\2\1\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\12"+
        "\uffff}>";
    static final String[] DFA82_transitionS = {
            "\1\16\2\uffff\2\16\3\uffff\2\16\2\uffff\1\16\1\15\4\uffff\1"+
            "\16\2\uffff\2\10\3\16\1\uffff\1\6\1\7\2\16\15\uffff\1\11\6\uffff"+
            "\1\16\2\uffff\1\16\16\uffff\1\16\3\uffff\1\1\1\2\1\5\1\uffff"+
            "\1\4\1\13\1\uffff\1\12\1\uffff\1\14\1\uffff\1\3",
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
            return "463:1: p_lop_expr : ( ( protected_lambda_expr )=> protected_lambda_expr | p_op_expr );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA82_0 = input.LA(1);

                         
                        int index82_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA82_0==Constr) ) {s = 1;}

                        else if ( (LA82_0==Id) ) {s = 2;}

                        else if ( (LA82_0==UNDERSCORE) && (synpred6_babel17())) {s = 3;}

                        else if ( (LA82_0==String) ) {s = 4;}

                        else if ( (LA82_0==Num) ) {s = 5;}

                        else if ( (LA82_0==L_true) ) {s = 6;}

                        else if ( (LA82_0==L_false) ) {s = 7;}

                        else if ( ((LA82_0>=A_infinity && LA82_0<=U_infinity)) ) {s = 8;}

                        else if ( (LA82_0==MINUS) ) {s = 9;}

                        else if ( (LA82_0==SQUARE_BRACKET_OPEN) ) {s = 10;}

                        else if ( (LA82_0==ROUND_BRACKET_OPEN) ) {s = 11;}

                        else if ( (LA82_0==CURLY_BRACKET_OPEN) ) {s = 12;}

                        else if ( (LA82_0==L_case) && (synpred6_babel17())) {s = 13;}

                        else if ( (LA82_0==L_begin||(LA82_0>=L_with && LA82_0<=L_if)||(LA82_0>=L_while && LA82_0<=L_for)||LA82_0==L_match||LA82_0==L_exception||(LA82_0>=L_concurrent && LA82_0<=L_lazy)||(LA82_0>=L_this && LA82_0<=L_random)||LA82_0==A_NOT||LA82_0==U_NOT||LA82_0==TILDE) ) {s = 14;}

                         
                        input.seek(index82_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA82_1 = input.LA(1);

                         
                        int index82_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_babel17()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index82_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA82_2 = input.LA(1);

                         
                        int index82_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_babel17()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index82_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA82_4 = input.LA(1);

                         
                        int index82_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_babel17()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index82_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA82_5 = input.LA(1);

                         
                        int index82_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_babel17()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index82_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA82_6 = input.LA(1);

                         
                        int index82_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_babel17()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index82_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA82_7 = input.LA(1);

                         
                        int index82_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_babel17()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index82_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA82_8 = input.LA(1);

                         
                        int index82_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_babel17()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index82_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA82_9 = input.LA(1);

                         
                        int index82_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_babel17()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index82_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA82_10 = input.LA(1);

                         
                        int index82_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_babel17()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index82_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA82_11 = input.LA(1);

                         
                        int index82_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_babel17()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index82_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA82_12 = input.LA(1);

                         
                        int index82_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_babel17()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
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
    public static final BitSet FOLLOW_Constr_in_pattern1501 = new BitSet(new long[]{0x0000000000000002L,0xD000000100018600L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_pattern1504 = new BitSet(new long[]{0x0000000000000000L,0xD000000100018600L,0x0000000000000156L});
    public static final BitSet FOLLOW_primitive_pattern_in_pattern1507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitive_pattern_in_pattern1523 = new BitSet(new long[]{0x0000000000000002L,0x1000180000000000L});
    public static final BitSet FOLLOW_NL_in_pattern1526 = new BitSet(new long[]{0x0000000000000000L,0x1000180000000000L});
    public static final BitSet FOLLOW_token_DOUBLE_COLON_in_pattern1529 = new BitSet(new long[]{0x0000000000000000L,0xD000000100018600L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_pattern1531 = new BitSet(new long[]{0x0000000000000000L,0xD000000100018600L,0x0000000000000156L});
    public static final BitSet FOLLOW_primitive_pattern_in_pattern1534 = new BitSet(new long[]{0x0000000000000002L,0x1000180000000000L});
    public static final BitSet FOLLOW_Id_in_bracket_pattern1575 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000004L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1577 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_L_as_in_bracket_pattern1580 = new BitSet(new long[]{0x0000000000000000L,0xF000000100018600L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1582 = new BitSet(new long[]{0x0000000000000000L,0xF000000100018600L,0x0000000000000156L});
    public static final BitSet FOLLOW_pattern_in_bracket_pattern1585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protected_expr_in_bracket_pattern1614 = new BitSet(new long[]{0x0000000000000000L,0x1100000000000000L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1616 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_QUESTION_MARK_in_bracket_pattern1619 = new BitSet(new long[]{0x0000000000000002L,0xF000000100018600L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1622 = new BitSet(new long[]{0x0000000000000000L,0xF000000100018600L,0x0000000000000156L});
    public static final BitSet FOLLOW_pattern_in_bracket_pattern1625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_bracket_pattern1643 = new BitSet(new long[]{0x0100000000000002L,0x1000000000000000L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1646 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_L_if_in_bracket_pattern1649 = new BitSet(new long[]{0x31D0000000000000L,0xF20004810007BE43L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1651 = new BitSet(new long[]{0x31D0000000000000L,0xF20004810007BE43L,0x0000000000000156L});
    public static final BitSet FOLLOW_protected_expr_in_bracket_pattern1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_val_in_bracket_pattern1672 = new BitSet(new long[]{0x31D0000000000000L,0xF20004810007BE43L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1674 = new BitSet(new long[]{0x31D0000000000000L,0xF20004810007BE43L,0x0000000000000156L});
    public static final BitSet FOLLOW_protected_expr_in_bracket_pattern1677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_ELLIPSIS_in_bracket_pattern1690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_ARROW_in_arrow_or_assign1700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGN_in_arrow_or_assign1711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracket_pattern_in_mselem_pattern1726 = new BitSet(new long[]{0x0000000200000002L,0x100C000000000000L});
    public static final BitSet FOLLOW_NL_in_mselem_pattern1729 = new BitSet(new long[]{0x0000000200000000L,0x100C000000000000L});
    public static final BitSet FOLLOW_arrow_or_assign_in_mselem_pattern1732 = new BitSet(new long[]{0x31D0000000000000L,0xF23004810007BE4BL,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_mselem_pattern1734 = new BitSet(new long[]{0x31D0000000000000L,0xF23004810007BE4BL,0x0000000000000156L});
    public static final BitSet FOLLOW_bracket_pattern_in_mselem_pattern1737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Id_in_primitive_pattern1766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNDERSCORE_in_primitive_pattern1771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_String_in_primitive_pattern1780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Num_in_primitive_pattern1785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_true_in_primitive_pattern1790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_false_in_primitive_pattern1795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_infinity_in_primitive_pattern1800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_primitive_pattern1805 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000600L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern1807 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000600L});
    public static final BitSet FOLLOW_token_infinity_in_primitive_pattern1810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_primitive_pattern1823 = new BitSet(new long[]{0x0000000000000000L,0x9000000000000000L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern1825 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_Num_in_primitive_pattern1828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SQUARE_BRACKET_OPEN_in_primitive_pattern1841 = new BitSet(new long[]{0x31D0000000000000L,0xF23004810007BE4BL,0x0000000000000176L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern1844 = new BitSet(new long[]{0x31D0000000000000L,0xF23004810007BE4BL,0x0000000000000176L});
    public static final BitSet FOLLOW_bracket_pattern_in_primitive_pattern1848 = new BitSet(new long[]{0x0000000000000000L,0x1080000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern1850 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_COMMA_in_primitive_pattern1855 = new BitSet(new long[]{0x31D0000000000000L,0xF23004810007BE4BL,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern1857 = new BitSet(new long[]{0x31D0000000000000L,0xF23004810007BE4BL,0x0000000000000156L});
    public static final BitSet FOLLOW_bracket_pattern_in_primitive_pattern1860 = new BitSet(new long[]{0x0000000000000000L,0x1080000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern1862 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_SQUARE_BRACKET_CLOSE_in_primitive_pattern1870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROUND_BRACKET_OPEN_in_primitive_pattern1890 = new BitSet(new long[]{0x31D0000000000000L,0xF23004810007BE4BL,0x000000000000015EL});
    public static final BitSet FOLLOW_NL_in_primitive_pattern1893 = new BitSet(new long[]{0x31D0000000000000L,0xF23004810007BE4BL,0x000000000000015EL});
    public static final BitSet FOLLOW_bracket_pattern_in_primitive_pattern1897 = new BitSet(new long[]{0x0000000000000000L,0x1080000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern1899 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_COMMA_in_primitive_pattern1904 = new BitSet(new long[]{0x31D0000000000000L,0xF23004810007BE4BL,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern1907 = new BitSet(new long[]{0x31D0000000000000L,0xF23004810007BE4BL,0x0000000000000156L});
    public static final BitSet FOLLOW_bracket_pattern_in_primitive_pattern1910 = new BitSet(new long[]{0x0000000000000000L,0x1080000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern1912 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_COMMA_in_primitive_pattern1918 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern1920 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_ROUND_BRACKET_CLOSE_in_primitive_pattern1927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURLY_BRACKET_OPEN_in_primitive_pattern1959 = new BitSet(new long[]{0x31D0000000000000L,0xF23004810007BE4BL,0x00000000000001D6L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern1962 = new BitSet(new long[]{0x31D0000000000000L,0xF23004810007BE4BL,0x00000000000001D6L});
    public static final BitSet FOLLOW_mselem_pattern_in_primitive_pattern1966 = new BitSet(new long[]{0x0000000000000000L,0x1080000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern1968 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_COMMA_in_primitive_pattern1973 = new BitSet(new long[]{0x31D0000000000000L,0xF23004810007BE4BL,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern1976 = new BitSet(new long[]{0x31D0000000000000L,0xF23004810007BE4BL,0x0000000000000156L});
    public static final BitSet FOLLOW_mselem_pattern_in_primitive_pattern1979 = new BitSet(new long[]{0x0000000000000000L,0x1080000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern1981 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_CURLY_BRACKET_CLOSE_in_primitive_pattern1989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURLY_BRACKET_OPEN_in_primitive_pattern2007 = new BitSet(new long[]{0x0000000000000000L,0x100C000000000000L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2009 = new BitSet(new long[]{0x0000000000000000L,0x000C000000000000L});
    public static final BitSet FOLLOW_token_ARROW_in_primitive_pattern2012 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2014 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_CURLY_BRACKET_CLOSE_in_primitive_pattern2017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURLY_BRACKET_OPEN_in_primitive_pattern2028 = new BitSet(new long[]{0x0000000200000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2030 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ASSIGN_in_primitive_pattern2033 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2035 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_CURLY_BRACKET_CLOSE_in_primitive_pattern2038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_sep2060 = new BitSet(new long[]{0x0000000000000002L,0x1000000040000000L});
    public static final BitSet FOLLOW_sep_in_block2076 = new BitSet(new long[]{0xB1D0000000000000L,0xF20004810007FE5BL,0x0000000000000156L});
    public static final BitSet FOLLOW_statement_in_block2079 = new BitSet(new long[]{0x0000000000000002L,0x1000000040000000L});
    public static final BitSet FOLLOW_sep_in_block2082 = new BitSet(new long[]{0xB1D0000000000000L,0xF20004810007FE5BL,0x0000000000000156L});
    public static final BitSet FOLLOW_statement_in_block2084 = new BitSet(new long[]{0x0000000000000002L,0x1000000040000000L});
    public static final BitSet FOLLOW_sep_in_block2088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sep_in_block2104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_pure_block2121 = new BitSet(new long[]{0x0000000000000002L,0x1000000040000000L});
    public static final BitSet FOLLOW_sep_in_pure_block2124 = new BitSet(new long[]{0xB1D0000000000000L,0xF20004810007FE5BL,0x0000000000000156L});
    public static final BitSet FOLLOW_statement_in_pure_block2126 = new BitSet(new long[]{0x0000000000000002L,0x1000000040000000L});
    public static final BitSet FOLLOW_st_val_in_statement2147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_def_in_statement2152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_memoize_in_statement2157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_yield_in_statement2162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_or_assign_in_statement2167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Id_in_objelem_assign2176 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_PERIOD_in_objelem_assign2178 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_Id_in_objelem_assign2180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_val_in_st_val2199 = new BitSet(new long[]{0x0000000000000000L,0xF000000100018600L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_st_val2201 = new BitSet(new long[]{0x0000000000000000L,0xF000000100018600L,0x0000000000000156L});
    public static final BitSet FOLLOW_pattern_in_st_val2205 = new BitSet(new long[]{0x0000000200000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_objelem_assign_in_st_val2209 = new BitSet(new long[]{0x0000000200000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_NL_in_st_val2212 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ASSIGN_in_st_val2215 = new BitSet(new long[]{0xB1D0000000000000L,0xF20004810007FE5BL,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_st_val2217 = new BitSet(new long[]{0xB1D0000000000000L,0xF20004810007FE5BL,0x0000000000000156L});
    public static final BitSet FOLLOW_expr_in_st_val2220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_def_in_st_def2244 = new BitSet(new long[]{0x0000000000000000L,0x5000000000000000L});
    public static final BitSet FOLLOW_NL_in_st_def2246 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_Id_in_st_def2249 = new BitSet(new long[]{0x0000000200000000L,0xD000000100018600L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_st_def2251 = new BitSet(new long[]{0x0000000200000000L,0xD000000100018600L,0x0000000000000156L});
    public static final BitSet FOLLOW_primitive_pattern_in_st_def2255 = new BitSet(new long[]{0x0000000200000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_NL_in_st_def2257 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ASSIGN_in_st_def2262 = new BitSet(new long[]{0xB1D0000000000000L,0xF20004810007FE5BL,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_st_def2264 = new BitSet(new long[]{0xB1D0000000000000L,0xF20004810007FE5BL,0x0000000000000156L});
    public static final BitSet FOLLOW_expr_in_st_def2267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_yield_in_st_yield2296 = new BitSet(new long[]{0xB1D0000000000000L,0xF20004810007FE5BL,0x0000000000000156L});
    public static final BitSet FOLLOW_expr_in_st_yield2298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_memoize_in_st_memoize2316 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_memid_in_st_memoize2318 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_Id_in_memid2342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROUND_BRACKET_OPEN_in_memid2355 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_Id_in_memid2357 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_ROUND_BRACKET_CLOSE_in_memid2359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_expr_or_assign2399 = new BitSet(new long[]{0x0000000200000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_objelem_assign_in_expr_or_assign2403 = new BitSet(new long[]{0x0000000200000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_NL_in_expr_or_assign2406 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ASSIGN_in_expr_or_assign2409 = new BitSet(new long[]{0xB1D0000000000000L,0xF20004810007FE5BL,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_expr_or_assign2411 = new BitSet(new long[]{0xB1D0000000000000L,0xF20004810007FE5BL,0x0000000000000156L});
    public static final BitSet FOLLOW_expr_in_expr_or_assign2414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_or_assign2429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lop_expr_in_expr2440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_obj_expr_in_expr2445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_expr_in_control_expr2455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_do_expr_in_control_expr2460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_match_expr_in_control_expr2465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_expr_in_control_expr2470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_begin_end_in_control_expr2475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_control_expr_in_with_control_expr2485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_with_in_with_control_expr2490 = new BitSet(new long[]{0x31D0000000000000L,0xF20004810007BE43L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_with_control_expr2492 = new BitSet(new long[]{0x31D0000000000000L,0xF20004810007BE43L,0x0000000000000156L});
    public static final BitSet FOLLOW_protected_expr_in_with_control_expr2495 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_NL_in_with_control_expr2497 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COLON_in_with_control_expr2500 = new BitSet(new long[]{0x3110000000000000L,0x1000000000000001L});
    public static final BitSet FOLLOW_NL_in_with_control_expr2502 = new BitSet(new long[]{0x3110000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_control_expr_in_with_control_expr2505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_lop_expr_in_protected_expr2526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_obj_expr_in_protected_expr2531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_begin_in_begin_end2543 = new BitSet(new long[]{0xB1F0000000000000L,0xF20004814007FE5BL,0x0000000000000156L});
    public static final BitSet FOLLOW_block_in_begin_end2545 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_L_end_in_begin_end2547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_parents2565 = new BitSet(new long[]{0x3190000000000000L,0xF20004810007BE43L,0x0000000000000156L});
    public static final BitSet FOLLOW_primitive_expr_in_parents2567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIMES_in_parents2580 = new BitSet(new long[]{0x3190000000000000L,0xF20004810007BE43L,0x0000000000000156L});
    public static final BitSet FOLLOW_primitive_expr_in_parents2582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_obj_in_obj_expr2610 = new BitSet(new long[]{0x0000000000000000L,0x1000000280000000L});
    public static final BitSet FOLLOW_NL_in_obj_expr2612 = new BitSet(new long[]{0x0000000000000000L,0x1000000280000000L});
    public static final BitSet FOLLOW_parents_in_obj_expr2615 = new BitSet(new long[]{0xB1F0000000000000L,0xF20004814007FE5BL,0x0000000000000156L});
    public static final BitSet FOLLOW_block_in_obj_expr2617 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_L_end_in_obj_expr2619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_obj_in_obj_expr2647 = new BitSet(new long[]{0xB1F0000000000000L,0xF20004814007FE5BL,0x0000000000000156L});
    public static final BitSet FOLLOW_block_in_obj_expr2649 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_L_end_in_obj_expr2651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_expr_in_lop_expr2679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_op_expr_in_lop_expr2684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protected_lambda_expr_in_p_lop_expr2700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_op_expr_in_p_lop_expr2705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_if_in_if_expr2716 = new BitSet(new long[]{0x31D0000000000000L,0xF20004810007BE43L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_if_expr2718 = new BitSet(new long[]{0x31D0000000000000L,0xF20004810007BE43L,0x0000000000000156L});
    public static final BitSet FOLLOW_protected_expr_in_if_expr2721 = new BitSet(new long[]{0x0200000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_NL_in_if_expr2723 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_L_then_in_if_expr2726 = new BitSet(new long[]{0xBDF0000000000000L,0xF20004814007FE5BL,0x0000000000000156L});
    public static final BitSet FOLLOW_block_in_if_expr2728 = new BitSet(new long[]{0x0C20000000000000L});
    public static final BitSet FOLLOW_L_elseif_in_if_expr2734 = new BitSet(new long[]{0x31D0000000000000L,0xF20004810007BE43L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_if_expr2736 = new BitSet(new long[]{0x31D0000000000000L,0xF20004810007BE43L,0x0000000000000156L});
    public static final BitSet FOLLOW_protected_expr_in_if_expr2739 = new BitSet(new long[]{0x0200000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_NL_in_if_expr2741 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_L_then_in_if_expr2744 = new BitSet(new long[]{0xBDF0000000000000L,0xF20004814007FE5BL,0x0000000000000156L});
    public static final BitSet FOLLOW_block_in_if_expr2746 = new BitSet(new long[]{0x0C20000000000000L});
    public static final BitSet FOLLOW_L_else_in_if_expr2754 = new BitSet(new long[]{0xB1F0000000000000L,0xF20004814007FE5BL,0x0000000000000156L});
    public static final BitSet FOLLOW_block_in_if_expr2756 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_L_end_in_if_expr2760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_while_in_while_do_expr2784 = new BitSet(new long[]{0x31D0000000000000L,0xF20004810007BE43L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_while_do_expr2786 = new BitSet(new long[]{0x31D0000000000000L,0xF20004810007BE43L,0x0000000000000156L});
    public static final BitSet FOLLOW_protected_expr_in_while_do_expr2789 = new BitSet(new long[]{0x4000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_NL_in_while_do_expr2791 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_L_do_in_while_do_expr2794 = new BitSet(new long[]{0xB1F0000000000000L,0xF20004814007FE5BL,0x0000000000000156L});
    public static final BitSet FOLLOW_block_in_while_do_expr2796 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_L_end_in_while_do_expr2798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_full_cases_in_cases2828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_cases2833 = new BitSet(new long[]{0x0000000000000000L,0x1003000000000000L});
    public static final BitSet FOLLOW_NL_in_cases2835 = new BitSet(new long[]{0x0000000000000000L,0x1003000000000000L});
    public static final BitSet FOLLOW_token_DOUBLE_ARROW_in_cases2838 = new BitSet(new long[]{0xB1D0000000000000L,0xF20004814007FE5BL,0x0000000000000156L});
    public static final BitSet FOLLOW_block_in_cases2840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_case_expr_in_full_cases2863 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_L_case_in_case_expr2884 = new BitSet(new long[]{0x0000000000000000L,0xF000000100018600L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_case_expr2886 = new BitSet(new long[]{0x0000000000000000L,0xF000000100018600L,0x0000000000000156L});
    public static final BitSet FOLLOW_pattern_in_case_expr2889 = new BitSet(new long[]{0x0000000000000000L,0x1003000000000000L});
    public static final BitSet FOLLOW_NL_in_case_expr2891 = new BitSet(new long[]{0x0000000000000000L,0x1003000000000000L});
    public static final BitSet FOLLOW_token_DOUBLE_ARROW_in_case_expr2894 = new BitSet(new long[]{0xB1D0000000000000L,0xF20004814007FE5BL,0x0000000000000156L});
    public static final BitSet FOLLOW_block_in_case_expr2896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_match_in_match_expr2917 = new BitSet(new long[]{0x3190000000000000L,0xF20004810007BE43L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_match_expr2919 = new BitSet(new long[]{0x3190000000000000L,0xF20004810007BE43L,0x0000000000000156L});
    public static final BitSet FOLLOW_p_op_expr_in_match_expr2922 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000002L});
    public static final BitSet FOLLOW_NL_in_match_expr2924 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000002L});
    public static final BitSet FOLLOW_full_cases_in_match_expr2927 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_L_end_in_match_expr2929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_cases_in_lambda_expr2955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_lambda_cases2973 = new BitSet(new long[]{0x0000000000000000L,0x1003000000000000L});
    public static final BitSet FOLLOW_NL_in_lambda_cases2975 = new BitSet(new long[]{0x0000000000000000L,0x1003000000000000L});
    public static final BitSet FOLLOW_token_DOUBLE_ARROW_in_lambda_cases2978 = new BitSet(new long[]{0x3190000000000000L,0xF20004810007BE43L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_lambda_cases2980 = new BitSet(new long[]{0x3190000000000000L,0xF20004810007BE43L,0x0000000000000156L});
    public static final BitSet FOLLOW_lop_expr_in_lambda_cases2983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protected_lambda_cases_in_protected_lambda_expr3011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_case_in_p_lambda_case_expr3029 = new BitSet(new long[]{0x0000000000000000L,0xF000000100018600L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_p_lambda_case_expr3031 = new BitSet(new long[]{0x0000000000000000L,0xF000000100018600L,0x0000000000000156L});
    public static final BitSet FOLLOW_pattern_in_p_lambda_case_expr3034 = new BitSet(new long[]{0x0000000000000000L,0x1003000000000000L});
    public static final BitSet FOLLOW_NL_in_p_lambda_case_expr3036 = new BitSet(new long[]{0x0000000000000000L,0x1003000000000000L});
    public static final BitSet FOLLOW_token_DOUBLE_ARROW_in_p_lambda_case_expr3039 = new BitSet(new long[]{0xB1D0000000000000L,0xF20004810007FE5BL,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_p_lambda_case_expr3041 = new BitSet(new long[]{0xB1D0000000000000L,0xF20004810007FE5BL,0x0000000000000156L});
    public static final BitSet FOLLOW_pure_block_in_p_lambda_case_expr3044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_protected_lambda_cases3065 = new BitSet(new long[]{0x0000000000000000L,0x1003000000000000L});
    public static final BitSet FOLLOW_NL_in_protected_lambda_cases3067 = new BitSet(new long[]{0x0000000000000000L,0x1003000000000000L});
    public static final BitSet FOLLOW_token_DOUBLE_ARROW_in_protected_lambda_cases3070 = new BitSet(new long[]{0xB1D0000000000000L,0xF20004810007FE5BL,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_protected_lambda_cases3072 = new BitSet(new long[]{0xB1D0000000000000L,0xF20004810007FE5BL,0x0000000000000156L});
    public static final BitSet FOLLOW_pure_block_in_protected_lambda_cases3075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_lambda_case_expr_in_protected_lambda_cases3094 = new BitSet(new long[]{0x0000000000000002L,0xF000000100018602L,0x0000000000000156L});
    public static final BitSet FOLLOW_L_for_in_for_expr3111 = new BitSet(new long[]{0x0000000000000000L,0xF000000100018600L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_for_expr3113 = new BitSet(new long[]{0x0000000000000000L,0xF000000100018600L,0x0000000000000156L});
    public static final BitSet FOLLOW_pattern_in_for_expr3116 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000020L});
    public static final BitSet FOLLOW_NL_in_for_expr3118 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_L_in_in_for_expr3121 = new BitSet(new long[]{0x31D0000000000000L,0xF20004810007BE43L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_for_expr3123 = new BitSet(new long[]{0x31D0000000000000L,0xF20004810007BE43L,0x0000000000000156L});
    public static final BitSet FOLLOW_protected_expr_in_for_expr3126 = new BitSet(new long[]{0x4000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_NL_in_for_expr3128 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_L_do_in_for_expr3131 = new BitSet(new long[]{0xB1F0000000000000L,0xF20004814007FE5BL,0x0000000000000156L});
    public static final BitSet FOLLOW_block_in_for_expr3133 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_L_end_in_for_expr3135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_builtin_primitive_in_op_expr3160 = new BitSet(new long[]{0x3190000000000000L,0xF20004810007BE43L,0x0000000000000156L});
    public static final BitSet FOLLOW_op_expr_in_op_expr3163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bool_expr_in_op_expr3168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_builtin_primitive_in_p_op_expr3178 = new BitSet(new long[]{0x3190000000000000L,0xF20004810007BE43L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_p_op_expr3181 = new BitSet(new long[]{0x3190000000000000L,0xF20004810007BE43L,0x0000000000000156L});
    public static final BitSet FOLLOW_p_op_expr_in_p_op_expr3185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_bool_expr_in_p_op_expr3190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_builtin_primitive0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bool_or_expr_in_bool_expr3230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_bool_or_expr_in_p_bool_expr3240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bool_and_expr_in_bool_or_expr3249 = new BitSet(new long[]{0x0000000000000002L,0x1000012000000000L});
    public static final BitSet FOLLOW_NL_in_bool_or_expr3252 = new BitSet(new long[]{0x0000000000000000L,0x1000012000000000L});
    public static final BitSet FOLLOW_token_OR_in_bool_or_expr3256 = new BitSet(new long[]{0x3190000000000000L,0xF20004810007BE43L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_bool_or_expr3259 = new BitSet(new long[]{0x3190000000000000L,0xF20004810007BE43L,0x0000000000000156L});
    public static final BitSet FOLLOW_bool_and_expr_in_bool_or_expr3263 = new BitSet(new long[]{0x0000000000000002L,0x1000012000000000L});
    public static final BitSet FOLLOW_p_bool_and_expr_in_p_bool_or_expr3275 = new BitSet(new long[]{0x0000000000000002L,0x1000012000000000L});
    public static final BitSet FOLLOW_NL_in_p_bool_or_expr3278 = new BitSet(new long[]{0x0000000000000000L,0x1000012000000000L});
    public static final BitSet FOLLOW_token_OR_in_p_bool_or_expr3282 = new BitSet(new long[]{0x3190000000000000L,0xF20004810007BE43L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_p_bool_or_expr3285 = new BitSet(new long[]{0x3190000000000000L,0xF20004810007BE43L,0x0000000000000156L});
    public static final BitSet FOLLOW_p_bool_and_expr_in_p_bool_or_expr3289 = new BitSet(new long[]{0x0000000000000002L,0x1000012000000000L});
    public static final BitSet FOLLOW_bool_not_expr_in_bool_and_expr3301 = new BitSet(new long[]{0x0000000000000002L,0x1000024000000000L});
    public static final BitSet FOLLOW_NL_in_bool_and_expr3304 = new BitSet(new long[]{0x0000000000000000L,0x1000024000000000L});
    public static final BitSet FOLLOW_token_AND_in_bool_and_expr3308 = new BitSet(new long[]{0x3190000000000000L,0xF20004810007BE43L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_bool_and_expr3311 = new BitSet(new long[]{0x3190000000000000L,0xF20004810007BE43L,0x0000000000000156L});
    public static final BitSet FOLLOW_bool_not_expr_in_bool_and_expr3315 = new BitSet(new long[]{0x0000000000000002L,0x1000024000000000L});
    public static final BitSet FOLLOW_p_bool_not_expr_in_p_bool_and_expr3327 = new BitSet(new long[]{0x0000000000000002L,0x1000024000000000L});
    public static final BitSet FOLLOW_NL_in_p_bool_and_expr3330 = new BitSet(new long[]{0x0000000000000000L,0x1000024000000000L});
    public static final BitSet FOLLOW_token_AND_in_p_bool_and_expr3334 = new BitSet(new long[]{0x3190000000000000L,0xF20004810007BE43L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_p_bool_and_expr3337 = new BitSet(new long[]{0x3190000000000000L,0xF20004810007BE43L,0x0000000000000156L});
    public static final BitSet FOLLOW_p_bool_not_expr_in_p_bool_and_expr3341 = new BitSet(new long[]{0x0000000000000002L,0x1000024000000000L});
    public static final BitSet FOLLOW_token_NOT_in_bool_not_expr3353 = new BitSet(new long[]{0x3190000000000000L,0xF20004810007BE43L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_bool_not_expr3356 = new BitSet(new long[]{0x3190000000000000L,0xF20004810007BE43L,0x0000000000000156L});
    public static final BitSet FOLLOW_bool_not_expr_in_bool_not_expr3360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rel_expr_in_bool_not_expr3365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_NOT_in_p_bool_not_expr3376 = new BitSet(new long[]{0x3190000000000000L,0xF20004810007BE43L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_p_bool_not_expr3379 = new BitSet(new long[]{0x3190000000000000L,0xF20004810007BE43L,0x0000000000000156L});
    public static final BitSet FOLLOW_p_bool_not_expr_in_p_bool_not_expr3383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_rel_expr_in_p_bool_not_expr3388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arith_expr_in_rel_expr3397 = new BitSet(new long[]{0x0000000000000002L,0x100000003FF80000L});
    public static final BitSet FOLLOW_NL_in_rel_expr3400 = new BitSet(new long[]{0x0000000000000000L,0x100000003FF80000L});
    public static final BitSet FOLLOW_rel_op_in_rel_expr3403 = new BitSet(new long[]{0x3190000000000000L,0xF20004810007BE43L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_rel_expr3405 = new BitSet(new long[]{0x3190000000000000L,0xF20004810007BE43L,0x0000000000000156L});
    public static final BitSet FOLLOW_arith_expr_in_rel_expr3408 = new BitSet(new long[]{0x0000000000000002L,0x100000003FF80000L});
    public static final BitSet FOLLOW_p_arith_expr_in_p_rel_expr3435 = new BitSet(new long[]{0x0000000000000002L,0x100000003FF80000L});
    public static final BitSet FOLLOW_NL_in_p_rel_expr3438 = new BitSet(new long[]{0x0000000000000000L,0x100000003FF80000L});
    public static final BitSet FOLLOW_rel_op_in_p_rel_expr3441 = new BitSet(new long[]{0x3190000000000000L,0xF20004810007BE43L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_p_rel_expr3443 = new BitSet(new long[]{0x3190000000000000L,0xF20004810007BE43L,0x0000000000000156L});
    public static final BitSet FOLLOW_p_arith_expr_in_p_rel_expr3446 = new BitSet(new long[]{0x0000000000000002L,0x100000003FF80000L});
    public static final BitSet FOLLOW_token_EQUAL_in_rel_op3472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_NOT_EQUAL_in_rel_op3476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNRELATED_in_rel_op3480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATER_in_rel_op3484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_GREATER_EQ_in_rel_op3488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_in_rel_op3492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_LESS_EQ_in_rel_op3496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_plusplus_expr_in_arith_expr3508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_plusplus_expr_in_p_arith_expr3518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timestimes_expr_in_plusplus_expr3528 = new BitSet(new long[]{0x0000000000000002L,0x1000C00000000000L});
    public static final BitSet FOLLOW_NL_in_plusplus_expr3531 = new BitSet(new long[]{0x0000000000000000L,0x0000C00000000000L});
    public static final BitSet FOLLOW_PLUSPLUS_in_plusplus_expr3536 = new BitSet(new long[]{0x3190000000000000L,0xF20004810007BE43L,0x0000000000000156L});
    public static final BitSet FOLLOW_MINUSMINUS_in_plusplus_expr3539 = new BitSet(new long[]{0x3190000000000000L,0xF20004810007BE43L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_plusplus_expr3543 = new BitSet(new long[]{0x3190000000000000L,0xF20004810007BE43L,0x0000000000000156L});
    public static final BitSet FOLLOW_timestimes_expr_in_plusplus_expr3547 = new BitSet(new long[]{0x0000000000000002L,0x1000C00000000000L});
    public static final BitSet FOLLOW_p_timestimes_expr_in_p_plusplus_expr3559 = new BitSet(new long[]{0x0000000000000002L,0x1000C00000000000L});
    public static final BitSet FOLLOW_NL_in_p_plusplus_expr3562 = new BitSet(new long[]{0x0000000000000000L,0x0000C00000000000L});
    public static final BitSet FOLLOW_PLUSPLUS_in_p_plusplus_expr3567 = new BitSet(new long[]{0x3190000000000000L,0xF20004810007BE43L,0x0000000000000156L});
    public static final BitSet FOLLOW_MINUSMINUS_in_p_plusplus_expr3570 = new BitSet(new long[]{0x3190000000000000L,0xF20004810007BE43L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_p_plusplus_expr3574 = new BitSet(new long[]{0x3190000000000000L,0xF20004810007BE43L,0x0000000000000156L});
    public static final BitSet FOLLOW_p_timestimes_expr_in_p_plusplus_expr3578 = new BitSet(new long[]{0x0000000000000002L,0x1000C00000000000L});
    public static final BitSet FOLLOW_simple_expr_in_timestimes_expr3590 = new BitSet(new long[]{0x0000000000000002L,0x1000200000000000L});
    public static final BitSet FOLLOW_NL_in_timestimes_expr3593 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_TIMESTIMES_in_timestimes_expr3598 = new BitSet(new long[]{0x3190000000000000L,0xF20004810007BE43L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_timestimes_expr3602 = new BitSet(new long[]{0x3190000000000000L,0xF20004810007BE43L,0x0000000000000156L});
    public static final BitSet FOLLOW_simple_expr_in_timestimes_expr3606 = new BitSet(new long[]{0x0000000000000002L,0x1000200000000000L});
    public static final BitSet FOLLOW_p_simple_expr_in_p_timestimes_expr3619 = new BitSet(new long[]{0x0000000000000002L,0x1000200000000000L});
    public static final BitSet FOLLOW_NL_in_p_timestimes_expr3622 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_TIMESTIMES_in_p_timestimes_expr3627 = new BitSet(new long[]{0x3190000000000000L,0xF20004810007BE43L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_p_timestimes_expr3631 = new BitSet(new long[]{0x3190000000000000L,0xF20004810007BE43L,0x0000000000000156L});
    public static final BitSet FOLLOW_p_simple_expr_in_p_timestimes_expr3635 = new BitSet(new long[]{0x0000000000000002L,0x1000200000000000L});
    public static final BitSet FOLLOW_cons_expr_in_simple_expr3646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_cons_expr_in_p_simple_expr3655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_to_expr_in_cons_expr3664 = new BitSet(new long[]{0x0000000000000002L,0x1000180000000000L});
    public static final BitSet FOLLOW_NL_in_cons_expr3667 = new BitSet(new long[]{0x0000000000000000L,0x1000180000000000L});
    public static final BitSet FOLLOW_token_DOUBLE_COLON_in_cons_expr3670 = new BitSet(new long[]{0x3190000000000000L,0xF20004810007BE43L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_cons_expr3672 = new BitSet(new long[]{0x3190000000000000L,0xF20004810007BE43L,0x0000000000000156L});
    public static final BitSet FOLLOW_to_expr_in_cons_expr3675 = new BitSet(new long[]{0x0000000000000002L,0x1000180000000000L});
    public static final BitSet FOLLOW_p_to_expr_in_p_cons_expr3695 = new BitSet(new long[]{0x0000000000000002L,0x1000180000000000L});
    public static final BitSet FOLLOW_NL_in_p_cons_expr3698 = new BitSet(new long[]{0x0000000000000000L,0x1000180000000000L});
    public static final BitSet FOLLOW_token_DOUBLE_COLON_in_p_cons_expr3701 = new BitSet(new long[]{0x3190000000000000L,0xF20004810007BE43L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_p_cons_expr3703 = new BitSet(new long[]{0x3190000000000000L,0xF20004810007BE43L,0x0000000000000156L});
    public static final BitSet FOLLOW_p_to_expr_in_p_cons_expr3706 = new BitSet(new long[]{0x0000000000000002L,0x1000180000000000L});
    public static final BitSet FOLLOW_arith_plus_expr_in_to_expr3726 = new BitSet(new long[]{0x0000000000000002L,0x1000000000000180L});
    public static final BitSet FOLLOW_NL_in_to_expr3729 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000180L});
    public static final BitSet FOLLOW_L_to_in_to_expr3734 = new BitSet(new long[]{0x3190000000000000L,0xF20004810007BE43L,0x0000000000000156L});
    public static final BitSet FOLLOW_L_downto_in_to_expr3738 = new BitSet(new long[]{0x3190000000000000L,0xF20004810007BE43L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_to_expr3742 = new BitSet(new long[]{0x3190000000000000L,0xF20004810007BE43L,0x0000000000000156L});
    public static final BitSet FOLLOW_arith_plus_expr_in_to_expr3746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_arith_plus_expr_in_p_to_expr3759 = new BitSet(new long[]{0x0000000000000002L,0x1000000000000180L});
    public static final BitSet FOLLOW_NL_in_p_to_expr3762 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000180L});
    public static final BitSet FOLLOW_L_to_in_p_to_expr3767 = new BitSet(new long[]{0x3190000000000000L,0xF20004810007BE43L,0x0000000000000156L});
    public static final BitSet FOLLOW_L_downto_in_p_to_expr3771 = new BitSet(new long[]{0x3190000000000000L,0xF20004810007BE43L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_p_to_expr3775 = new BitSet(new long[]{0x3190000000000000L,0xF20004810007BE43L,0x0000000000000156L});
    public static final BitSet FOLLOW_p_arith_plus_expr_in_p_to_expr3779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arith_uminus_expr_in_arith_plus_expr3791 = new BitSet(new long[]{0x0000000000000002L,0x1000000180000000L});
    public static final BitSet FOLLOW_NL_in_arith_plus_expr3795 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_PLUS_in_arith_plus_expr3799 = new BitSet(new long[]{0x3190000000000000L,0xF20004810007BE43L,0x0000000000000156L});
    public static final BitSet FOLLOW_MINUS_in_arith_plus_expr3804 = new BitSet(new long[]{0x3190000000000000L,0xF20004810007BE43L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_arith_plus_expr3808 = new BitSet(new long[]{0x3190000000000000L,0xF20004810007BE43L,0x0000000000000156L});
    public static final BitSet FOLLOW_arith_uminus_expr_in_arith_plus_expr3812 = new BitSet(new long[]{0x0000000000000002L,0x1000000180000000L});
    public static final BitSet FOLLOW_p_arith_uminus_expr_in_p_arith_plus_expr3823 = new BitSet(new long[]{0x0000000000000002L,0x1000000180000000L});
    public static final BitSet FOLLOW_NL_in_p_arith_plus_expr3826 = new BitSet(new long[]{0x0000000000000000L,0x0000000180000000L});
    public static final BitSet FOLLOW_set_in_p_arith_plus_expr3830 = new BitSet(new long[]{0x3190000000000000L,0xF20004810007BE43L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_p_arith_plus_expr3839 = new BitSet(new long[]{0x3190000000000000L,0xF20004810007BE43L,0x0000000000000156L});
    public static final BitSet FOLLOW_p_arith_uminus_expr_in_p_arith_plus_expr3843 = new BitSet(new long[]{0x0000000000000002L,0x1000000180000000L});
    public static final BitSet FOLLOW_MINUS_in_arith_uminus_expr3856 = new BitSet(new long[]{0x3190000000000000L,0xF20004810007BE43L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_arith_uminus_expr3858 = new BitSet(new long[]{0x3190000000000000L,0xF20004810007BE43L,0x0000000000000156L});
    public static final BitSet FOLLOW_arith_mult_expr_in_arith_uminus_expr3861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arith_mult_expr_in_arith_uminus_expr3874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_p_arith_uminus_expr3885 = new BitSet(new long[]{0x3190000000000000L,0xF20004810007BE43L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_p_arith_uminus_expr3887 = new BitSet(new long[]{0x3190000000000000L,0xF20004810007BE43L,0x0000000000000156L});
    public static final BitSet FOLLOW_p_arith_mult_expr_in_p_arith_uminus_expr3890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_arith_mult_expr_in_p_arith_uminus_expr3903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arith_pow_expr_in_arith_mult_expr3912 = new BitSet(new long[]{0x0000000000000002L,0x1000000E00000000L});
    public static final BitSet FOLLOW_NL_in_arith_mult_expr3915 = new BitSet(new long[]{0x0000000000000000L,0x0000000E00000000L});
    public static final BitSet FOLLOW_set_in_arith_mult_expr3919 = new BitSet(new long[]{0x3190000000000000L,0xF20004810007BE43L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_arith_mult_expr3932 = new BitSet(new long[]{0x3190000000000000L,0xF20004810007BE43L,0x0000000000000156L});
    public static final BitSet FOLLOW_arith_pow_expr_in_arith_mult_expr3936 = new BitSet(new long[]{0x0000000000000002L,0x1000000E00000000L});
    public static final BitSet FOLLOW_p_arith_pow_expr_in_p_arith_mult_expr3948 = new BitSet(new long[]{0x0000000000000002L,0x1000000E00000000L});
    public static final BitSet FOLLOW_NL_in_p_arith_mult_expr3951 = new BitSet(new long[]{0x0000000000000000L,0x0000000E00000000L});
    public static final BitSet FOLLOW_set_in_p_arith_mult_expr3955 = new BitSet(new long[]{0x3190000000000000L,0xF20004810007BE43L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_p_arith_mult_expr3968 = new BitSet(new long[]{0x3190000000000000L,0xF20004810007BE43L,0x0000000000000156L});
    public static final BitSet FOLLOW_p_arith_pow_expr_in_p_arith_mult_expr3972 = new BitSet(new long[]{0x0000000000000002L,0x1000000E00000000L});
    public static final BitSet FOLLOW_apply_expr_in_arith_pow_expr3983 = new BitSet(new long[]{0x0000000000000002L,0x1000001000000000L});
    public static final BitSet FOLLOW_NL_in_arith_pow_expr3986 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_POW_tok_in_arith_pow_expr3989 = new BitSet(new long[]{0x3190000000000000L,0xF20004810007BE43L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_arith_pow_expr3991 = new BitSet(new long[]{0x3190000000000000L,0xF20004810007BE43L,0x0000000000000156L});
    public static final BitSet FOLLOW_apply_expr_in_arith_pow_expr3994 = new BitSet(new long[]{0x0000000000000002L,0x1000001000000000L});
    public static final BitSet FOLLOW_p_apply_expr_in_p_arith_pow_expr4015 = new BitSet(new long[]{0x0000000000000002L,0x1000001000000000L});
    public static final BitSet FOLLOW_NL_in_p_arith_pow_expr4018 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_POW_tok_in_p_arith_pow_expr4021 = new BitSet(new long[]{0x3190000000000000L,0xF20004810007BE43L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_p_arith_pow_expr4023 = new BitSet(new long[]{0x3190000000000000L,0xF20004810007BE43L,0x0000000000000156L});
    public static final BitSet FOLLOW_p_apply_expr_in_p_arith_pow_expr4026 = new BitSet(new long[]{0x0000000000000002L,0x1000001000000000L});
    public static final BitSet FOLLOW_basic_expr_in_apply_expr4047 = new BitSet(new long[]{0x3190000000000002L,0xF20004810007BE43L,0x0000000000000156L});
    public static final BitSet FOLLOW_p_basic_expr_in_p_apply_expr4065 = new BitSet(new long[]{0x3190000000000002L,0xF20004810007BE43L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_p_apply_expr4068 = new BitSet(new long[]{0x3190000000000000L,0xF20004810007BE43L,0x0000000000000156L});
    public static final BitSet FOLLOW_p_basic_expr_in_p_apply_expr4071 = new BitSet(new long[]{0x3190000000000002L,0xF20004810007BE43L,0x0000000000000156L});
    public static final BitSet FOLLOW_message_send_expr_in_basic_expr4091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_message_send_expr_in_p_basic_expr4100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitive_expr_in_message_send_expr4109 = new BitSet(new long[]{0x0000000000000002L,0x1040000000000000L});
    public static final BitSet FOLLOW_NL_in_message_send_expr4112 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_PERIOD_in_message_send_expr4115 = new BitSet(new long[]{0x0000000000000000L,0x5000000000000000L});
    public static final BitSet FOLLOW_NL_in_message_send_expr4117 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_Id_in_message_send_expr4120 = new BitSet(new long[]{0x0000000000000002L,0x1040000000000000L});
    public static final BitSet FOLLOW_SQUARE_BRACKET_OPEN_in_list_expr4144 = new BitSet(new long[]{0x31D0000000000000L,0xF20004810007BE43L,0x0000000000000176L});
    public static final BitSet FOLLOW_NL_in_list_expr4146 = new BitSet(new long[]{0x31D0000000000000L,0xF20004810007BE43L,0x0000000000000176L});
    public static final BitSet FOLLOW_protected_expr_in_list_expr4150 = new BitSet(new long[]{0x0000000000000000L,0x1080000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_list_expr4153 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_COMMA_in_list_expr4156 = new BitSet(new long[]{0x31D0000000000000L,0xF20004810007BE43L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_list_expr4158 = new BitSet(new long[]{0x31D0000000000000L,0xF20004810007BE43L,0x0000000000000156L});
    public static final BitSet FOLLOW_protected_expr_in_list_expr4161 = new BitSet(new long[]{0x0000000000000000L,0x1080000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_list_expr4165 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_SQUARE_BRACKET_CLOSE_in_list_expr4170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROUND_BRACKET_OPEN_in_list_expr4184 = new BitSet(new long[]{0x31D0000000000000L,0xF20004810007BE43L,0x000000000000015EL});
    public static final BitSet FOLLOW_NL_in_list_expr4186 = new BitSet(new long[]{0x31D0000000000000L,0xF20004810007BE43L,0x000000000000015EL});
    public static final BitSet FOLLOW_protected_expr_in_list_expr4190 = new BitSet(new long[]{0x0000000000000000L,0x1080000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_NL_in_list_expr4193 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_COMMA_in_list_expr4196 = new BitSet(new long[]{0x31D0000000000000L,0xF20004810007BE43L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_list_expr4198 = new BitSet(new long[]{0x31D0000000000000L,0xF20004810007BE43L,0x0000000000000156L});
    public static final BitSet FOLLOW_protected_expr_in_list_expr4201 = new BitSet(new long[]{0x0000000000000000L,0x1080000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_NL_in_list_expr4205 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_COMMA_in_list_expr4209 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_NL_in_list_expr4211 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_ROUND_BRACKET_CLOSE_in_list_expr4218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURLY_BRACKET_OPEN_in_map_or_set_expr4247 = new BitSet(new long[]{0x31D0000000000000L,0xF20004810007BE43L,0x00000000000001D6L});
    public static final BitSet FOLLOW_NL_in_map_or_set_expr4249 = new BitSet(new long[]{0x31D0000000000000L,0xF20004810007BE43L,0x00000000000001D6L});
    public static final BitSet FOLLOW_map_or_set_elem_expr_in_map_or_set_expr4253 = new BitSet(new long[]{0x0000000000000000L,0x1080000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_NL_in_map_or_set_expr4255 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_COMMA_in_map_or_set_expr4259 = new BitSet(new long[]{0x31D0000000000000L,0xF20004810007BE43L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_map_or_set_expr4261 = new BitSet(new long[]{0x31D0000000000000L,0xF20004810007BE43L,0x0000000000000156L});
    public static final BitSet FOLLOW_map_or_set_elem_expr_in_map_or_set_expr4264 = new BitSet(new long[]{0x0000000000000000L,0x1080000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_NL_in_map_or_set_expr4266 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_CURLY_BRACKET_CLOSE_in_map_or_set_expr4273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURLY_BRACKET_OPEN_in_map_or_set_expr4293 = new BitSet(new long[]{0x0000000000000000L,0x100C000000000000L});
    public static final BitSet FOLLOW_NL_in_map_or_set_expr4295 = new BitSet(new long[]{0x0000000000000000L,0x000C000000000000L});
    public static final BitSet FOLLOW_token_ARROW_in_map_or_set_expr4298 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_NL_in_map_or_set_expr4300 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_CURLY_BRACKET_CLOSE_in_map_or_set_expr4303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURLY_BRACKET_OPEN_in_map_or_set_expr4314 = new BitSet(new long[]{0x0000000200000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_NL_in_map_or_set_expr4316 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ASSIGN_in_map_or_set_expr4319 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_NL_in_map_or_set_expr4321 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_CURLY_BRACKET_CLOSE_in_map_or_set_expr4324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protected_expr_in_map_or_set_elem_expr4341 = new BitSet(new long[]{0x0000000200000002L,0x100C000000000000L});
    public static final BitSet FOLLOW_NL_in_map_or_set_elem_expr4344 = new BitSet(new long[]{0x0000000200000000L,0x100C000000000000L});
    public static final BitSet FOLLOW_arrow_or_assign_in_map_or_set_elem_expr4347 = new BitSet(new long[]{0x31D0000000000000L,0xF20004810007BE43L,0x0000000000000156L});
    public static final BitSet FOLLOW_NL_in_map_or_set_elem_expr4349 = new BitSet(new long[]{0x31D0000000000000L,0xF20004810007BE43L,0x0000000000000156L});
    public static final BitSet FOLLOW_protected_expr_in_map_or_set_elem_expr4352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Num_in_primitive_expr4379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_String_in_primitive_expr4384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Id_in_primitive_expr4389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Constr_in_primitive_expr4394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_true_in_primitive_expr4399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_false_in_primitive_expr4404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_this_in_primitive_expr4409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_infinity_in_primitive_expr4415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_list_expr_in_primitive_expr4421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_with_control_expr_in_primitive_expr4426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_map_or_set_expr_in_primitive_expr4431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_prog4441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_prog4443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Id_in_synpred1_babel171565 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000004L});
    public static final BitSet FOLLOW_NL_in_synpred1_babel171567 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_L_as_in_synpred1_babel171570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protected_expr_in_synpred2_babel171601 = new BitSet(new long[]{0x0000000000000000L,0x1100000000000000L});
    public static final BitSet FOLLOW_NL_in_synpred2_babel171603 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_QUESTION_MARK_in_synpred2_babel171606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_synpred3_babel172383 = new BitSet(new long[]{0x0000000200000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_objelem_assign_in_synpred3_babel172387 = new BitSet(new long[]{0x0000000200000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_NL_in_synpred3_babel172390 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ASSIGN_in_synpred3_babel172393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_obj_in_synpred4_babel172600 = new BitSet(new long[]{0x0000000000000000L,0x1000000280000000L});
    public static final BitSet FOLLOW_NL_in_synpred4_babel172602 = new BitSet(new long[]{0x0000000000000000L,0x1000000280000000L});
    public static final BitSet FOLLOW_parents_in_synpred4_babel172605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_expr_in_synpred5_babel172674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protected_lambda_expr_in_synpred6_babel172695 = new BitSet(new long[]{0x0000000000000002L});

}