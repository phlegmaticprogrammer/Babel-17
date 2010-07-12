// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g 2010-07-12 11:05:43

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PROG", "NIL_TOKEN", "ANY", "LAMBDA", "SQUARE_LIST", "ROUND_LIST", "LIST_CONS", "COMPARE", "APPLY", "IF", "MAP_OR_SET", "EMPTY_MAP", "EXCEPTION", "MATCH", "CASES", "OBJ", "FOR_EXPR", "WHILE_DO", "MESSAGE_SEND", "UMINUS", "POW", "PARENTS_PLUS", "PARENTS_MUL", "BLOCK", "BEGIN", "WITH", "VAL", "OBJELEM_ASSIGN", "ASSIGN", "DEF", "YIELD", "LAZY", "CONCURRENT", "MEMOIZE", "MEM_STRONG", "MEM_WEAK", "IF_PATTERN", "COMMENT1", "Newline", "NotNewline", "COMMENT2", "SmallLetter", "BigLetter", "Letter", "Digit", "Hex", "L_begin", "L_end", "L_obj", "L_with", "L_if", "L_then", "L_else", "L_elseif", "L_while", "L_for", "L_do", "L_yield", "L_match", "L_case", "L_as", "L_val", "L_def", "L_in", "L_exception", "L_to", "L_downto", "A_infinity", "U_infinity", "L_private", "L_protected", "L_public", "L_concurrent", "L_await", "L_lazy", "L_memoize", "L_true", "L_false", "L_this", "L_random", "L_nil", "A_EQUAL", "U_EQUAL", "A_NOT_EQUAL", "U_NOT_EQUAL", "LESS", "A_LESS_EQ", "U_LESS_EQ", "GREATER", "A_GREATER_EQ", "U_GREATER_EQ", "UNRELATED", "SC", "PLUS", "MINUS", "TIMES", "DIV", "MOD", "POW_tok", "A_OR", "A_AND", "A_NOT", "U_OR", "U_AND", "U_NOT", "A_DOUBLE_COLON", "U_DOUBLE_COLON", "TIMESTIMES", "PLUSPLUS", "MINUSMINUS", "A_DOUBLE_ARROW", "U_DOUBLE_ARROW", "A_ARROW", "U_ARROW", "A_ELLIPSIS", "U_ELLIPSIS", "PERIOD", "COMMA", "QUESTION_MARK", "TILDE", "WsChar", "WS", "NL", "Constr", "Id", "Num", "Charcode", "String", "ROUND_BRACKET_OPEN", "ROUND_BRACKET_CLOSE", "SQUARE_BRACKET_OPEN", "SQUARE_BRACKET_CLOSE", "CURLY_BRACKET_OPEN", "CURLY_BRACKET_CLOSE", "UNDERSCORE", "COLON"
    };
    public static final int U_AND=107;
    public static final int L_end=51;
    public static final int COMMENT1=41;
    public static final int COMMENT2=44;
    public static final int U_NOT_EQUAL=88;
    public static final int TIMESTIMES=111;
    public static final int BigLetter=46;
    public static final int ROUND_BRACKET_CLOSE=133;
    public static final int MOD=101;
    public static final int A_OR=103;
    public static final int MINUSMINUS=113;
    public static final int Newline=42;
    public static final int SQUARE_BRACKET_CLOSE=135;
    public static final int L_protected=74;
    public static final int EOF=-1;
    public static final int U_DOUBLE_ARROW=115;
    public static final int L_exception=68;
    public static final int Num=129;
    public static final int GREATER=92;
    public static final int EMPTY_MAP=15;
    public static final int POW=24;
    public static final int L_concurrent=76;
    public static final int UNRELATED=95;
    public static final int L_await=77;
    public static final int L_false=81;
    public static final int L_nil=84;
    public static final int BEGIN=28;
    public static final int LIST_CONS=10;
    public static final int L_with=53;
    public static final int QUESTION_MARK=122;
    public static final int LESS=89;
    public static final int ROUND_BRACKET_OPEN=132;
    public static final int SQUARE_LIST=8;
    public static final int VAL=30;
    public static final int L_as=64;
    public static final int NL=126;
    public static final int MESSAGE_SEND=22;
    public static final int A_ARROW=116;
    public static final int A_DOUBLE_COLON=109;
    public static final int L_def=66;
    public static final int A_AND=104;
    public static final int EXCEPTION=16;
    public static final int L_this=82;
    public static final int PERIOD=120;
    public static final int SmallLetter=45;
    public static final int NIL_TOKEN=5;
    public static final int CURLY_BRACKET_OPEN=136;
    public static final int UNDERSCORE=138;
    public static final int MATCH=17;
    public static final int U_LESS_EQ=91;
    public static final int MEM_STRONG=38;
    public static final int L_to=69;
    public static final int WS=125;
    public static final int Charcode=130;
    public static final int L_do=60;
    public static final int L_val=65;
    public static final int L_match=62;
    public static final int L_obj=52;
    public static final int WsChar=124;
    public static final int Hex=49;
    public static final int L_private=73;
    public static final int CONCURRENT=36;
    public static final int L_for=59;
    public static final int Letter=47;
    public static final int APPLY=12;
    public static final int U_ARROW=117;
    public static final int L_else=56;
    public static final int A_EQUAL=85;
    public static final int DEF=33;
    public static final int L_begin=50;
    public static final int U_NOT=108;
    public static final int L_yield=61;
    public static final int PLUSPLUS=112;
    public static final int L_while=58;
    public static final int CASES=18;
    public static final int POW_tok=102;
    public static final int IF_PATTERN=40;
    public static final int A_ELLIPSIS=118;
    public static final int PARENTS_PLUS=25;
    public static final int A_DOUBLE_ARROW=114;
    public static final int SQUARE_BRACKET_OPEN=134;
    public static final int IF=13;
    public static final int PROG=4;
    public static final int U_OR=106;
    public static final int COMMA=121;
    public static final int OBJ=19;
    public static final int MEMOIZE=37;
    public static final int U_ELLIPSIS=119;
    public static final int TILDE=123;
    public static final int YIELD=34;
    public static final int COMPARE=11;
    public static final int U_GREATER_EQ=94;
    public static final int U_EQUAL=86;
    public static final int PLUS=97;
    public static final int String=131;
    public static final int LAMBDA=7;
    public static final int L_true=80;
    public static final int Id=128;
    public static final int A_infinity=71;
    public static final int WITH=29;
    public static final int L_in=67;
    public static final int A_NOT=105;
    public static final int LAZY=35;
    public static final int L_lazy=78;
    public static final int NotNewline=43;
    public static final int L_then=55;
    public static final int L_public=75;
    public static final int L_if=54;
    public static final int CURLY_BRACKET_CLOSE=137;
    public static final int UMINUS=23;
    public static final int FOR_EXPR=20;
    public static final int Constr=127;
    public static final int WHILE_DO=21;
    public static final int L_elseif=57;
    public static final int MINUS=98;
    public static final int Digit=48;
    public static final int L_memoize=79;
    public static final int MEM_WEAK=39;
    public static final int A_GREATER_EQ=93;
    public static final int ROUND_LIST=9;
    public static final int COLON=139;
    public static final int SC=96;
    public static final int L_downto=70;
    public static final int ANY=6;
    public static final int L_random=83;
    public static final int BLOCK=27;
    public static final int A_NOT_EQUAL=87;
    public static final int ASSIGN=32;
    public static final int U_DOUBLE_COLON=110;
    public static final int OBJELEM_ASSIGN=31;
    public static final int L_case=63;
    public static final int DIV=100;
    public static final int MAP_OR_SET=14;
    public static final int TIMES=99;
    public static final int U_infinity=72;
    public static final int A_LESS_EQ=90;
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:174:1: token_infinity : ( A_infinity | U_infinity );
    public final babel17Parser.token_infinity_return token_infinity() throws RecognitionException {
        babel17Parser.token_infinity_return retval = new babel17Parser.token_infinity_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set1=null;

        CommonTree set1_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:175:2: ( A_infinity | U_infinity )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:208:1: token_EQUAL : ( A_EQUAL | U_EQUAL );
    public final babel17Parser.token_EQUAL_return token_EQUAL() throws RecognitionException {
        babel17Parser.token_EQUAL_return retval = new babel17Parser.token_EQUAL_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set2=null;

        CommonTree set2_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:209:2: ( A_EQUAL | U_EQUAL )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:216:1: token_NOT_EQUAL : ( A_NOT_EQUAL | U_NOT_EQUAL );
    public final babel17Parser.token_NOT_EQUAL_return token_NOT_EQUAL() throws RecognitionException {
        babel17Parser.token_NOT_EQUAL_return retval = new babel17Parser.token_NOT_EQUAL_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set3=null;

        CommonTree set3_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:217:2: ( A_NOT_EQUAL | U_NOT_EQUAL )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:225:1: token_LESS_EQ : ( A_LESS_EQ | U_LESS_EQ );
    public final babel17Parser.token_LESS_EQ_return token_LESS_EQ() throws RecognitionException {
        babel17Parser.token_LESS_EQ_return retval = new babel17Parser.token_LESS_EQ_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set4=null;

        CommonTree set4_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:226:2: ( A_LESS_EQ | U_LESS_EQ )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:235:1: token_GREATER_EQ : ( A_GREATER_EQ | U_GREATER_EQ );
    public final babel17Parser.token_GREATER_EQ_return token_GREATER_EQ() throws RecognitionException {
        babel17Parser.token_GREATER_EQ_return retval = new babel17Parser.token_GREATER_EQ_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set5=null;

        CommonTree set5_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:236:2: ( A_GREATER_EQ | U_GREATER_EQ )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:257:1: token_OR : ( A_OR | U_OR );
    public final babel17Parser.token_OR_return token_OR() throws RecognitionException {
        babel17Parser.token_OR_return retval = new babel17Parser.token_OR_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set6=null;

        CommonTree set6_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:257:9: ( A_OR | U_OR )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:258:1: token_AND : ( A_AND | U_AND );
    public final babel17Parser.token_AND_return token_AND() throws RecognitionException {
        babel17Parser.token_AND_return retval = new babel17Parser.token_AND_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set7=null;

        CommonTree set7_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:259:2: ( A_AND | U_AND )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:260:1: token_NOT : ( A_NOT | U_NOT );
    public final babel17Parser.token_NOT_return token_NOT() throws RecognitionException {
        babel17Parser.token_NOT_return retval = new babel17Parser.token_NOT_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set8=null;

        CommonTree set8_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:261:2: ( A_NOT | U_NOT )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:267:1: token_DOUBLE_COLON : ( A_DOUBLE_COLON | U_DOUBLE_COLON );
    public final babel17Parser.token_DOUBLE_COLON_return token_DOUBLE_COLON() throws RecognitionException {
        babel17Parser.token_DOUBLE_COLON_return retval = new babel17Parser.token_DOUBLE_COLON_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set9=null;

        CommonTree set9_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:268:2: ( A_DOUBLE_COLON | U_DOUBLE_COLON )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:283:1: token_DOUBLE_ARROW : ( A_DOUBLE_ARROW | U_DOUBLE_ARROW );
    public final babel17Parser.token_DOUBLE_ARROW_return token_DOUBLE_ARROW() throws RecognitionException {
        babel17Parser.token_DOUBLE_ARROW_return retval = new babel17Parser.token_DOUBLE_ARROW_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set10=null;

        CommonTree set10_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:284:2: ( A_DOUBLE_ARROW | U_DOUBLE_ARROW )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:288:1: token_ARROW : ( A_ARROW | U_ARROW );
    public final babel17Parser.token_ARROW_return token_ARROW() throws RecognitionException {
        babel17Parser.token_ARROW_return retval = new babel17Parser.token_ARROW_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set11=null;

        CommonTree set11_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:289:2: ( A_ARROW | U_ARROW )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:294:1: token_ELLIPSIS : ( A_ELLIPSIS | U_ELLIPSIS );
    public final babel17Parser.token_ELLIPSIS_return token_ELLIPSIS() throws RecognitionException {
        babel17Parser.token_ELLIPSIS_return retval = new babel17Parser.token_ELLIPSIS_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set12=null;

        CommonTree set12_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:295:2: ( A_ELLIPSIS | U_ELLIPSIS )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:354:1: pattern : ( Constr ( ( NL )? primitive_pattern )? -> ^( Constr ( primitive_pattern )? ) | primitive_pattern ( ( NL )? token_DOUBLE_COLON ( NL )? primitive_pattern )* -> ^( LIST_CONS ( primitive_pattern )* ) );
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:354:9: ( Constr ( ( NL )? primitive_pattern )? -> ^( Constr ( primitive_pattern )? ) | primitive_pattern ( ( NL )? token_DOUBLE_COLON ( NL )? primitive_pattern )* -> ^( LIST_CONS ( primitive_pattern )* ) )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:354:11: Constr ( ( NL )? primitive_pattern )?
                    {
                    Constr13=(Token)match(input,Constr,FOLLOW_Constr_in_pattern1527); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Constr.add(Constr13);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:354:18: ( ( NL )? primitive_pattern )?
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
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:354:19: ( NL )? primitive_pattern
                            {
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:354:19: ( NL )?
                            int alt1=2;
                            int LA1_0 = input.LA(1);

                            if ( (LA1_0==NL) ) {
                                alt1=1;
                            }
                            switch (alt1) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:354:19: NL
                                    {
                                    NL14=(Token)match(input,NL,FOLLOW_NL_in_pattern1530); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL14);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_primitive_pattern_in_pattern1533);
                            primitive_pattern15=primitive_pattern();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_primitive_pattern.add(primitive_pattern15.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: Constr, primitive_pattern
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 354:43: -> ^( Constr ( primitive_pattern )? )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:354:46: ^( Constr ( primitive_pattern )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_Constr.nextNode(), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:354:55: ( primitive_pattern )?
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:355:4: primitive_pattern ( ( NL )? token_DOUBLE_COLON ( NL )? primitive_pattern )*
                    {
                    pushFollow(FOLLOW_primitive_pattern_in_pattern1549);
                    primitive_pattern16=primitive_pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primitive_pattern.add(primitive_pattern16.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:355:22: ( ( NL )? token_DOUBLE_COLON ( NL )? primitive_pattern )*
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
                    	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:355:23: ( NL )? token_DOUBLE_COLON ( NL )? primitive_pattern
                    	    {
                    	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:355:23: ( NL )?
                    	    int alt3=2;
                    	    int LA3_0 = input.LA(1);

                    	    if ( (LA3_0==NL) ) {
                    	        alt3=1;
                    	    }
                    	    switch (alt3) {
                    	        case 1 :
                    	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:355:23: NL
                    	            {
                    	            NL17=(Token)match(input,NL,FOLLOW_NL_in_pattern1552); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_NL.add(NL17);


                    	            }
                    	            break;

                    	    }

                    	    pushFollow(FOLLOW_token_DOUBLE_COLON_in_pattern1555);
                    	    token_DOUBLE_COLON18=token_DOUBLE_COLON();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_token_DOUBLE_COLON.add(token_DOUBLE_COLON18.getTree());
                    	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:355:46: ( NL )?
                    	    int alt4=2;
                    	    int LA4_0 = input.LA(1);

                    	    if ( (LA4_0==NL) ) {
                    	        alt4=1;
                    	    }
                    	    switch (alt4) {
                    	        case 1 :
                    	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:355:46: NL
                    	            {
                    	            NL19=(Token)match(input,NL,FOLLOW_NL_in_pattern1557); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_NL.add(NL19);


                    	            }
                    	            break;

                    	    }

                    	    pushFollow(FOLLOW_primitive_pattern_in_pattern1560);
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
                    // 356:3: -> ^( LIST_CONS ( primitive_pattern )* )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:356:6: ^( LIST_CONS ( primitive_pattern )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LIST_CONS, "LIST_CONS"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:356:18: ( primitive_pattern )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:358:1: bracket_pattern : ( ( Id ( NL )? L_as )=> Id ( NL )? L_as ( NL )? pattern -> ^( L_as Id pattern ) | ( protected_expr ( NL )? QUESTION_MARK )=> protected_expr ( NL )? QUESTION_MARK ( ( NL )? pattern )? -> ^( QUESTION_MARK protected_expr ( pattern )? ) | pattern ( ( NL )? L_if ( NL )? protected_expr )? -> ^( IF_PATTERN pattern ( protected_expr )? ) | L_val ( NL )? protected_expr -> ^( L_val protected_expr ) | token_ELLIPSIS );
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:359:2: ( ( Id ( NL )? L_as )=> Id ( NL )? L_as ( NL )? pattern -> ^( L_as Id pattern ) | ( protected_expr ( NL )? QUESTION_MARK )=> protected_expr ( NL )? QUESTION_MARK ( ( NL )? pattern )? -> ^( QUESTION_MARK protected_expr ( pattern )? ) | pattern ( ( NL )? L_if ( NL )? protected_expr )? -> ^( IF_PATTERN pattern ( protected_expr )? ) | L_val ( NL )? protected_expr -> ^( L_val protected_expr ) | token_ELLIPSIS )
            int alt16=5;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:359:10: ( Id ( NL )? L_as )=> Id ( NL )? L_as ( NL )? pattern
                    {
                    Id21=(Token)match(input,Id,FOLLOW_Id_in_bracket_pattern1601); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Id.add(Id21);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:359:30: ( NL )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==NL) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:359:30: NL
                            {
                            NL22=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1603); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL22);


                            }
                            break;

                    }

                    L_as23=(Token)match(input,L_as,FOLLOW_L_as_in_bracket_pattern1606); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_as.add(L_as23);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:359:39: ( NL )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==NL) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:359:39: NL
                            {
                            NL24=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1608); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL24);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_pattern_in_bracket_pattern1611);
                    pattern25=pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pattern.add(pattern25.getTree());


                    // AST REWRITE
                    // elements: Id, L_as, pattern
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 359:51: -> ^( L_as Id pattern )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:359:54: ^( L_as Id pattern )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:360:4: ( protected_expr ( NL )? QUESTION_MARK )=> protected_expr ( NL )? QUESTION_MARK ( ( NL )? pattern )?
                    {
                    pushFollow(FOLLOW_protected_expr_in_bracket_pattern1640);
                    protected_expr26=protected_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr26.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:361:18: ( NL )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==NL) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:361:18: NL
                            {
                            NL27=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1642); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL27);


                            }
                            break;

                    }

                    QUESTION_MARK28=(Token)match(input,QUESTION_MARK,FOLLOW_QUESTION_MARK_in_bracket_pattern1645); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QUESTION_MARK.add(QUESTION_MARK28);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:361:36: ( ( NL )? pattern )?
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
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:361:37: ( NL )? pattern
                            {
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:361:37: ( NL )?
                            int alt10=2;
                            int LA10_0 = input.LA(1);

                            if ( (LA10_0==NL) ) {
                                alt10=1;
                            }
                            switch (alt10) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:361:37: NL
                                    {
                                    NL29=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1648); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL29);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_pattern_in_bracket_pattern1651);
                            pattern30=pattern();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_pattern.add(pattern30.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: pattern, QUESTION_MARK, protected_expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 361:51: -> ^( QUESTION_MARK protected_expr ( pattern )? )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:361:54: ^( QUESTION_MARK protected_expr ( pattern )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_QUESTION_MARK.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_protected_expr.nextTree());
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:361:85: ( pattern )?
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:362:4: pattern ( ( NL )? L_if ( NL )? protected_expr )?
                    {
                    pushFollow(FOLLOW_pattern_in_bracket_pattern1669);
                    pattern31=pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pattern.add(pattern31.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:362:12: ( ( NL )? L_if ( NL )? protected_expr )?
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
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:362:13: ( NL )? L_if ( NL )? protected_expr
                            {
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:362:13: ( NL )?
                            int alt12=2;
                            int LA12_0 = input.LA(1);

                            if ( (LA12_0==NL) ) {
                                alt12=1;
                            }
                            switch (alt12) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:362:13: NL
                                    {
                                    NL32=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1672); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL32);


                                    }
                                    break;

                            }

                            L_if33=(Token)match(input,L_if,FOLLOW_L_if_in_bracket_pattern1675); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_L_if.add(L_if33);

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:362:22: ( NL )?
                            int alt13=2;
                            int LA13_0 = input.LA(1);

                            if ( (LA13_0==NL) ) {
                                alt13=1;
                            }
                            switch (alt13) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:362:22: NL
                                    {
                                    NL34=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1677); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL34);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_protected_expr_in_bracket_pattern1680);
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
                    // 362:43: -> ^( IF_PATTERN pattern ( protected_expr )? )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:362:46: ^( IF_PATTERN pattern ( protected_expr )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IF_PATTERN, "IF_PATTERN"), root_1);

                        adaptor.addChild(root_1, stream_pattern.nextTree());
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:362:67: ( protected_expr )?
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:363:4: L_val ( NL )? protected_expr
                    {
                    L_val36=(Token)match(input,L_val,FOLLOW_L_val_in_bracket_pattern1698); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_val.add(L_val36);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:363:10: ( NL )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==NL) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:363:10: NL
                            {
                            NL37=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1700); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL37);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_protected_expr_in_bracket_pattern1703);
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
                    // 363:29: -> ^( L_val protected_expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:363:32: ^( L_val protected_expr )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:364:4: token_ELLIPSIS
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_ELLIPSIS_in_bracket_pattern1716);
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:366:1: mselem_pattern : bracket_pattern ( ( NL )? token_ARROW ( NL )? bracket_pattern )? -> ^( NIL_TOKEN ( bracket_pattern )* ) ;
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:367:2: ( bracket_pattern ( ( NL )? token_ARROW ( NL )? bracket_pattern )? -> ^( NIL_TOKEN ( bracket_pattern )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:367:4: bracket_pattern ( ( NL )? token_ARROW ( NL )? bracket_pattern )?
            {
            pushFollow(FOLLOW_bracket_pattern_in_mselem_pattern1726);
            bracket_pattern40=bracket_pattern();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bracket_pattern.add(bracket_pattern40.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:367:20: ( ( NL )? token_ARROW ( NL )? bracket_pattern )?
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:367:21: ( NL )? token_ARROW ( NL )? bracket_pattern
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:367:21: ( NL )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==NL) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:367:21: NL
                            {
                            NL41=(Token)match(input,NL,FOLLOW_NL_in_mselem_pattern1729); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL41);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_token_ARROW_in_mselem_pattern1732);
                    token_ARROW42=token_ARROW();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_token_ARROW.add(token_ARROW42.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:367:37: ( NL )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==NL) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:367:37: NL
                            {
                            NL43=(Token)match(input,NL,FOLLOW_NL_in_mselem_pattern1734); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL43);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_bracket_pattern_in_mselem_pattern1737);
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
            // 368:3: -> ^( NIL_TOKEN ( bracket_pattern )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:368:6: ^( NIL_TOKEN ( bracket_pattern )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:368:18: ( bracket_pattern )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:370:1: primitive_pattern : ( Id | '_' -> ANY | String | Num | L_true | L_false | token_infinity | '-' ( NL )? token_infinity -> ^( UMINUS token_infinity ) | '-' ( NL )? Num -> ^( UMINUS Num ) | '[' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* )? ']' -> ^( SQUARE_LIST ( bracket_pattern )* ) | '(' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* ( COMMA ( NL )? )? )? ')' -> ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( bracket_pattern )* ) ) | '{' ( NL )? ( mselem_pattern ( NL )? ( COMMA ( NL )? mselem_pattern ( NL )? )* )? '}' -> ^( MAP_OR_SET ( mselem_pattern )* ) | '{' ( NL )? token_ARROW ( NL )? '}' -> ^( EMPTY_MAP ) );
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:371:2: ( Id | '_' -> ANY | String | Num | L_true | L_false | token_infinity | '-' ( NL )? token_infinity -> ^( UMINUS token_infinity ) | '-' ( NL )? Num -> ^( UMINUS Num ) | '[' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* )? ']' -> ^( SQUARE_LIST ( bracket_pattern )* ) | '(' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* ( COMMA ( NL )? )? )? ')' -> ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( bracket_pattern )* ) ) | '{' ( NL )? ( mselem_pattern ( NL )? ( COMMA ( NL )? mselem_pattern ( NL )? )* )? '}' -> ^( MAP_OR_SET ( mselem_pattern )* ) | '{' ( NL )? token_ARROW ( NL )? '}' -> ^( EMPTY_MAP ) )
            int alt44=13;
            alt44 = dfa44.predict(input);
            switch (alt44) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:371:4: Id
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Id45=(Token)match(input,Id,FOLLOW_Id_in_primitive_pattern1759); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Id45_tree = (CommonTree)adaptor.create(Id45);
                    adaptor.addChild(root_0, Id45_tree);
                    }

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:372:4: '_'
                    {
                    char_literal46=(Token)match(input,UNDERSCORE,FOLLOW_UNDERSCORE_in_primitive_pattern1764); if (state.failed) return retval; 
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

                    String47=(Token)match(input,String,FOLLOW_String_in_primitive_pattern1773); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    String47_tree = (CommonTree)adaptor.create(String47);
                    adaptor.addChild(root_0, String47_tree);
                    }

                    }
                    break;
                case 4 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:374:4: Num
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Num48=(Token)match(input,Num,FOLLOW_Num_in_primitive_pattern1778); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Num48_tree = (CommonTree)adaptor.create(Num48);
                    adaptor.addChild(root_0, Num48_tree);
                    }

                    }
                    break;
                case 5 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:375:4: L_true
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    L_true49=(Token)match(input,L_true,FOLLOW_L_true_in_primitive_pattern1783); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    L_true49_tree = (CommonTree)adaptor.create(L_true49);
                    adaptor.addChild(root_0, L_true49_tree);
                    }

                    }
                    break;
                case 6 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:376:4: L_false
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    L_false50=(Token)match(input,L_false,FOLLOW_L_false_in_primitive_pattern1788); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    L_false50_tree = (CommonTree)adaptor.create(L_false50);
                    adaptor.addChild(root_0, L_false50_tree);
                    }

                    }
                    break;
                case 7 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:377:4: token_infinity
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_infinity_in_primitive_pattern1793);
                    token_infinity51=token_infinity();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, token_infinity51.getTree());

                    }
                    break;
                case 8 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:378:4: '-' ( NL )? token_infinity
                    {
                    char_literal52=(Token)match(input,MINUS,FOLLOW_MINUS_in_primitive_pattern1798); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(char_literal52);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:378:8: ( NL )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==NL) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:378:8: NL
                            {
                            NL53=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern1800); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL53);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_token_infinity_in_primitive_pattern1803);
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
                    // 378:27: -> ^( UMINUS token_infinity )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:378:30: ^( UMINUS token_infinity )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:379:4: '-' ( NL )? Num
                    {
                    char_literal55=(Token)match(input,MINUS,FOLLOW_MINUS_in_primitive_pattern1816); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(char_literal55);

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
                            NL56=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern1818); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL56);


                            }
                            break;

                    }

                    Num57=(Token)match(input,Num,FOLLOW_Num_in_primitive_pattern1821); if (state.failed) return retval; 
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
                    // 379:16: -> ^( UMINUS Num )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:379:19: ^( UMINUS Num )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:380:4: '[' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* )? ']'
                    {
                    char_literal58=(Token)match(input,SQUARE_BRACKET_OPEN,FOLLOW_SQUARE_BRACKET_OPEN_in_primitive_pattern1834); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SQUARE_BRACKET_OPEN.add(char_literal58);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:380:9: ( NL )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==NL) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:380:9: NL
                            {
                            NL59=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern1837); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL59);


                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:380:13: ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==L_begin||(LA27_0>=L_obj && LA27_0<=L_if)||(LA27_0>=L_while && LA27_0<=L_for)||(LA27_0>=L_match && LA27_0<=L_case)||LA27_0==L_val||LA27_0==L_exception||(LA27_0>=A_infinity && LA27_0<=U_infinity)||(LA27_0>=L_concurrent && LA27_0<=L_lazy)||(LA27_0>=L_true && LA27_0<=L_nil)||LA27_0==MINUS||LA27_0==A_NOT||LA27_0==U_NOT||(LA27_0>=A_ELLIPSIS && LA27_0<=U_ELLIPSIS)||LA27_0==TILDE||(LA27_0>=Constr && LA27_0<=Num)||(LA27_0>=String && LA27_0<=ROUND_BRACKET_OPEN)||LA27_0==SQUARE_BRACKET_OPEN||LA27_0==CURLY_BRACKET_OPEN||LA27_0==UNDERSCORE) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:380:14: bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )*
                            {
                            pushFollow(FOLLOW_bracket_pattern_in_primitive_pattern1841);
                            bracket_pattern60=bracket_pattern();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_bracket_pattern.add(bracket_pattern60.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:380:30: ( NL )?
                            int alt23=2;
                            int LA23_0 = input.LA(1);

                            if ( (LA23_0==NL) ) {
                                alt23=1;
                            }
                            switch (alt23) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:380:30: NL
                                    {
                                    NL61=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern1843); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL61);


                                    }
                                    break;

                            }

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:380:34: ( COMMA ( NL )? bracket_pattern ( NL )? )*
                            loop26:
                            do {
                                int alt26=2;
                                int LA26_0 = input.LA(1);

                                if ( (LA26_0==COMMA) ) {
                                    alt26=1;
                                }


                                switch (alt26) {
                            	case 1 :
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:380:36: COMMA ( NL )? bracket_pattern ( NL )?
                            	    {
                            	    COMMA62=(Token)match(input,COMMA,FOLLOW_COMMA_in_primitive_pattern1848); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA62);

                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:380:42: ( NL )?
                            	    int alt24=2;
                            	    int LA24_0 = input.LA(1);

                            	    if ( (LA24_0==NL) ) {
                            	        alt24=1;
                            	    }
                            	    switch (alt24) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:380:42: NL
                            	            {
                            	            NL63=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern1850); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL63);


                            	            }
                            	            break;

                            	    }

                            	    pushFollow(FOLLOW_bracket_pattern_in_primitive_pattern1853);
                            	    bracket_pattern64=bracket_pattern();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_bracket_pattern.add(bracket_pattern64.getTree());
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:380:62: ( NL )?
                            	    int alt25=2;
                            	    int LA25_0 = input.LA(1);

                            	    if ( (LA25_0==NL) ) {
                            	        alt25=1;
                            	    }
                            	    switch (alt25) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:380:62: NL
                            	            {
                            	            NL65=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern1855); if (state.failed) return retval; 
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

                    char_literal66=(Token)match(input,SQUARE_BRACKET_CLOSE,FOLLOW_SQUARE_BRACKET_CLOSE_in_primitive_pattern1863); if (state.failed) return retval; 
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
                    // 381:6: -> ^( SQUARE_LIST ( bracket_pattern )* )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:381:9: ^( SQUARE_LIST ( bracket_pattern )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SQUARE_LIST, "SQUARE_LIST"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:381:23: ( bracket_pattern )*
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:382:4: '(' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* ( COMMA ( NL )? )? )? ')'
                    {
                    char_literal67=(Token)match(input,ROUND_BRACKET_OPEN,FOLLOW_ROUND_BRACKET_OPEN_in_primitive_pattern1883); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ROUND_BRACKET_OPEN.add(char_literal67);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:382:9: ( NL )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==NL) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:382:9: NL
                            {
                            NL68=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern1886); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL68);


                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:382:13: ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* ( COMMA ( NL )? )? )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==L_begin||(LA35_0>=L_obj && LA35_0<=L_if)||(LA35_0>=L_while && LA35_0<=L_for)||(LA35_0>=L_match && LA35_0<=L_case)||LA35_0==L_val||LA35_0==L_exception||(LA35_0>=A_infinity && LA35_0<=U_infinity)||(LA35_0>=L_concurrent && LA35_0<=L_lazy)||(LA35_0>=L_true && LA35_0<=L_nil)||LA35_0==MINUS||LA35_0==A_NOT||LA35_0==U_NOT||(LA35_0>=A_ELLIPSIS && LA35_0<=U_ELLIPSIS)||LA35_0==TILDE||(LA35_0>=Constr && LA35_0<=Num)||(LA35_0>=String && LA35_0<=ROUND_BRACKET_OPEN)||LA35_0==SQUARE_BRACKET_OPEN||LA35_0==CURLY_BRACKET_OPEN||LA35_0==UNDERSCORE) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:382:14: bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* ( COMMA ( NL )? )?
                            {
                            pushFollow(FOLLOW_bracket_pattern_in_primitive_pattern1890);
                            bracket_pattern69=bracket_pattern();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_bracket_pattern.add(bracket_pattern69.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:382:30: ( NL )?
                            int alt29=2;
                            int LA29_0 = input.LA(1);

                            if ( (LA29_0==NL) ) {
                                alt29=1;
                            }
                            switch (alt29) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:382:30: NL
                                    {
                                    NL70=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern1892); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL70);


                                    }
                                    break;

                            }

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:382:34: ( COMMA ( NL )? bracket_pattern ( NL )? )*
                            loop32:
                            do {
                                int alt32=2;
                                int LA32_0 = input.LA(1);

                                if ( (LA32_0==COMMA) ) {
                                    int LA32_1 = input.LA(2);

                                    if ( (LA32_1==NL) ) {
                                        int LA32_3 = input.LA(3);

                                        if ( (LA32_3==L_begin||(LA32_3>=L_obj && LA32_3<=L_if)||(LA32_3>=L_while && LA32_3<=L_for)||(LA32_3>=L_match && LA32_3<=L_case)||LA32_3==L_val||LA32_3==L_exception||(LA32_3>=A_infinity && LA32_3<=U_infinity)||(LA32_3>=L_concurrent && LA32_3<=L_lazy)||(LA32_3>=L_true && LA32_3<=L_nil)||LA32_3==MINUS||LA32_3==A_NOT||LA32_3==U_NOT||(LA32_3>=A_ELLIPSIS && LA32_3<=U_ELLIPSIS)||LA32_3==TILDE||(LA32_3>=Constr && LA32_3<=Num)||(LA32_3>=String && LA32_3<=ROUND_BRACKET_OPEN)||LA32_3==SQUARE_BRACKET_OPEN||LA32_3==CURLY_BRACKET_OPEN||LA32_3==UNDERSCORE) ) {
                                            alt32=1;
                                        }


                                    }
                                    else if ( (LA32_1==L_begin||(LA32_1>=L_obj && LA32_1<=L_if)||(LA32_1>=L_while && LA32_1<=L_for)||(LA32_1>=L_match && LA32_1<=L_case)||LA32_1==L_val||LA32_1==L_exception||(LA32_1>=A_infinity && LA32_1<=U_infinity)||(LA32_1>=L_concurrent && LA32_1<=L_lazy)||(LA32_1>=L_true && LA32_1<=L_nil)||LA32_1==MINUS||LA32_1==A_NOT||LA32_1==U_NOT||(LA32_1>=A_ELLIPSIS && LA32_1<=U_ELLIPSIS)||LA32_1==TILDE||(LA32_1>=Constr && LA32_1<=Num)||(LA32_1>=String && LA32_1<=ROUND_BRACKET_OPEN)||LA32_1==SQUARE_BRACKET_OPEN||LA32_1==CURLY_BRACKET_OPEN||LA32_1==UNDERSCORE) ) {
                                        alt32=1;
                                    }


                                }


                                switch (alt32) {
                            	case 1 :
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:382:36: COMMA ( NL )? bracket_pattern ( NL )?
                            	    {
                            	    COMMA71=(Token)match(input,COMMA,FOLLOW_COMMA_in_primitive_pattern1897); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA71);

                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:382:43: ( NL )?
                            	    int alt30=2;
                            	    int LA30_0 = input.LA(1);

                            	    if ( (LA30_0==NL) ) {
                            	        alt30=1;
                            	    }
                            	    switch (alt30) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:382:43: NL
                            	            {
                            	            NL72=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern1900); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL72);


                            	            }
                            	            break;

                            	    }

                            	    pushFollow(FOLLOW_bracket_pattern_in_primitive_pattern1903);
                            	    bracket_pattern73=bracket_pattern();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_bracket_pattern.add(bracket_pattern73.getTree());
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:382:63: ( NL )?
                            	    int alt31=2;
                            	    int LA31_0 = input.LA(1);

                            	    if ( (LA31_0==NL) ) {
                            	        alt31=1;
                            	    }
                            	    switch (alt31) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:382:63: NL
                            	            {
                            	            NL74=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern1905); if (state.failed) return retval; 
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

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:382:69: ( COMMA ( NL )? )?
                            int alt34=2;
                            int LA34_0 = input.LA(1);

                            if ( (LA34_0==COMMA) ) {
                                alt34=1;
                            }
                            switch (alt34) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:382:70: COMMA ( NL )?
                                    {
                                    COMMA75=(Token)match(input,COMMA,FOLLOW_COMMA_in_primitive_pattern1911); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_COMMA.add(COMMA75);

                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:382:76: ( NL )?
                                    int alt33=2;
                                    int LA33_0 = input.LA(1);

                                    if ( (LA33_0==NL) ) {
                                        alt33=1;
                                    }
                                    switch (alt33) {
                                        case 1 :
                                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:382:76: NL
                                            {
                                            NL76=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern1913); if (state.failed) return retval; 
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

                    char_literal77=(Token)match(input,ROUND_BRACKET_CLOSE,FOLLOW_ROUND_BRACKET_CLOSE_in_primitive_pattern1920); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ROUND_BRACKET_CLOSE.add(char_literal77);



                    // AST REWRITE
                    // elements: COMMA, bracket_pattern
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 383:5: -> ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( bracket_pattern )* ) )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:383:8: ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( bracket_pattern )* ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ROUND_LIST, "ROUND_LIST"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:383:21: ^( NIL_TOKEN ( COMMA )* )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_2);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:383:33: ( COMMA )*
                        while ( stream_COMMA.hasNext() ) {
                            adaptor.addChild(root_2, stream_COMMA.nextNode());

                        }
                        stream_COMMA.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:383:41: ^( NIL_TOKEN ( bracket_pattern )* )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_2);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:383:53: ( bracket_pattern )*
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:384:4: '{' ( NL )? ( mselem_pattern ( NL )? ( COMMA ( NL )? mselem_pattern ( NL )? )* )? '}'
                    {
                    char_literal78=(Token)match(input,CURLY_BRACKET_OPEN,FOLLOW_CURLY_BRACKET_OPEN_in_primitive_pattern1952); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_OPEN.add(char_literal78);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:384:9: ( NL )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==NL) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:384:9: NL
                            {
                            NL79=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern1955); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL79);


                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:384:13: ( mselem_pattern ( NL )? ( COMMA ( NL )? mselem_pattern ( NL )? )* )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==L_begin||(LA41_0>=L_obj && LA41_0<=L_if)||(LA41_0>=L_while && LA41_0<=L_for)||(LA41_0>=L_match && LA41_0<=L_case)||LA41_0==L_val||LA41_0==L_exception||(LA41_0>=A_infinity && LA41_0<=U_infinity)||(LA41_0>=L_concurrent && LA41_0<=L_lazy)||(LA41_0>=L_true && LA41_0<=L_nil)||LA41_0==MINUS||LA41_0==A_NOT||LA41_0==U_NOT||(LA41_0>=A_ELLIPSIS && LA41_0<=U_ELLIPSIS)||LA41_0==TILDE||(LA41_0>=Constr && LA41_0<=Num)||(LA41_0>=String && LA41_0<=ROUND_BRACKET_OPEN)||LA41_0==SQUARE_BRACKET_OPEN||LA41_0==CURLY_BRACKET_OPEN||LA41_0==UNDERSCORE) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:384:14: mselem_pattern ( NL )? ( COMMA ( NL )? mselem_pattern ( NL )? )*
                            {
                            pushFollow(FOLLOW_mselem_pattern_in_primitive_pattern1959);
                            mselem_pattern80=mselem_pattern();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_mselem_pattern.add(mselem_pattern80.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:384:29: ( NL )?
                            int alt37=2;
                            int LA37_0 = input.LA(1);

                            if ( (LA37_0==NL) ) {
                                alt37=1;
                            }
                            switch (alt37) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:384:29: NL
                                    {
                                    NL81=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern1961); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL81);


                                    }
                                    break;

                            }

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:384:33: ( COMMA ( NL )? mselem_pattern ( NL )? )*
                            loop40:
                            do {
                                int alt40=2;
                                int LA40_0 = input.LA(1);

                                if ( (LA40_0==COMMA) ) {
                                    alt40=1;
                                }


                                switch (alt40) {
                            	case 1 :
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:384:35: COMMA ( NL )? mselem_pattern ( NL )?
                            	    {
                            	    COMMA82=(Token)match(input,COMMA,FOLLOW_COMMA_in_primitive_pattern1966); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA82);

                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:384:42: ( NL )?
                            	    int alt38=2;
                            	    int LA38_0 = input.LA(1);

                            	    if ( (LA38_0==NL) ) {
                            	        alt38=1;
                            	    }
                            	    switch (alt38) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:384:42: NL
                            	            {
                            	            NL83=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern1969); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL83);


                            	            }
                            	            break;

                            	    }

                            	    pushFollow(FOLLOW_mselem_pattern_in_primitive_pattern1972);
                            	    mselem_pattern84=mselem_pattern();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_mselem_pattern.add(mselem_pattern84.getTree());
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:384:61: ( NL )?
                            	    int alt39=2;
                            	    int LA39_0 = input.LA(1);

                            	    if ( (LA39_0==NL) ) {
                            	        alt39=1;
                            	    }
                            	    switch (alt39) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:384:61: NL
                            	            {
                            	            NL85=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern1974); if (state.failed) return retval; 
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

                    char_literal86=(Token)match(input,CURLY_BRACKET_CLOSE,FOLLOW_CURLY_BRACKET_CLOSE_in_primitive_pattern1982); if (state.failed) return retval; 
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
                    // 385:5: -> ^( MAP_OR_SET ( mselem_pattern )* )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:385:8: ^( MAP_OR_SET ( mselem_pattern )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MAP_OR_SET, "MAP_OR_SET"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:385:21: ( mselem_pattern )*
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:386:4: '{' ( NL )? token_ARROW ( NL )? '}'
                    {
                    char_literal87=(Token)match(input,CURLY_BRACKET_OPEN,FOLLOW_CURLY_BRACKET_OPEN_in_primitive_pattern2000); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_OPEN.add(char_literal87);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:386:8: ( NL )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==NL) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:386:8: NL
                            {
                            NL88=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2002); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL88);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_token_ARROW_in_primitive_pattern2005);
                    token_ARROW89=token_ARROW();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_token_ARROW.add(token_ARROW89.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:386:24: ( NL )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==NL) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:386:24: NL
                            {
                            NL90=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2007); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL90);


                            }
                            break;

                    }

                    char_literal91=(Token)match(input,CURLY_BRACKET_CLOSE,FOLLOW_CURLY_BRACKET_CLOSE_in_primitive_pattern2010); if (state.failed) return retval; 
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
                    // 386:32: -> ^( EMPTY_MAP )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:386:35: ^( EMPTY_MAP )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:390:1: sep : ( NL | SC )+ ;
    public final babel17Parser.sep_return sep() throws RecognitionException {
        babel17Parser.sep_return retval = new babel17Parser.sep_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set92=null;

        CommonTree set92_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:390:5: ( ( NL | SC )+ )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:390:7: ( NL | SC )+
            {
            root_0 = (CommonTree)adaptor.nil();

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:390:7: ( NL | SC )+
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:392:1: block : ( ( sep )? statement ( sep statement )* ( sep )? -> ^( BLOCK ( statement )* ) | ( sep )? -> ^( BLOCK ) );
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:392:8: ( ( sep )? statement ( sep statement )* ( sep )? -> ^( BLOCK ( statement )* ) | ( sep )? -> ^( BLOCK ) )
            int alt50=2;
            alt50 = dfa50.predict(input);
            switch (alt50) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:392:10: ( sep )? statement ( sep statement )* ( sep )?
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:392:10: ( sep )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==SC||LA46_0==NL) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:392:10: sep
                            {
                            pushFollow(FOLLOW_sep_in_block2046);
                            sep93=sep();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_sep.add(sep93.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_statement_in_block2049);
                    statement94=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement94.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:392:25: ( sep statement )*
                    loop47:
                    do {
                        int alt47=2;
                        alt47 = dfa47.predict(input);
                        switch (alt47) {
                    	case 1 :
                    	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:392:26: sep statement
                    	    {
                    	    pushFollow(FOLLOW_sep_in_block2052);
                    	    sep95=sep();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_sep.add(sep95.getTree());
                    	    pushFollow(FOLLOW_statement_in_block2054);
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

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:392:42: ( sep )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==SC||LA48_0==NL) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:392:42: sep
                            {
                            pushFollow(FOLLOW_sep_in_block2058);
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
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==SC||LA49_0==NL) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:393:4: sep
                            {
                            pushFollow(FOLLOW_sep_in_block2074);
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

        babel17Parser.statement_return statement99 = null;

        babel17Parser.sep_return sep100 = null;

        babel17Parser.statement_return statement101 = null;


        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_sep=new RewriteRuleSubtreeStream(adaptor,"rule sep");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:396:2: ( statement ( sep statement )* -> ^( BLOCK ( statement )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:396:4: statement ( sep statement )*
            {
            pushFollow(FOLLOW_statement_in_pure_block2091);
            statement99=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statement.add(statement99.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:396:14: ( sep statement )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==NL) ) {
                    int LA51_1 = input.LA(2);

                    if ( (LA51_1==L_begin||(LA51_1>=L_obj && LA51_1<=L_if)||(LA51_1>=L_while && LA51_1<=L_for)||(LA51_1>=L_yield && LA51_1<=L_match)||(LA51_1>=L_val && LA51_1<=L_def)||LA51_1==L_exception||(LA51_1>=A_infinity && LA51_1<=U_infinity)||(LA51_1>=L_concurrent && LA51_1<=L_nil)||LA51_1==SC||LA51_1==MINUS||LA51_1==A_NOT||LA51_1==U_NOT||LA51_1==TILDE||(LA51_1>=NL && LA51_1<=Num)||(LA51_1>=String && LA51_1<=ROUND_BRACKET_OPEN)||LA51_1==SQUARE_BRACKET_OPEN||LA51_1==CURLY_BRACKET_OPEN||LA51_1==UNDERSCORE) ) {
                        alt51=1;
                    }


                }
                else if ( (LA51_0==SC) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:396:15: sep statement
            	    {
            	    pushFollow(FOLLOW_sep_in_pure_block2094);
            	    sep100=sep();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_sep.add(sep100.getTree());
            	    pushFollow(FOLLOW_statement_in_pure_block2096);
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

        babel17Parser.st_val_return st_val102 = null;

        babel17Parser.st_def_return st_def103 = null;

        babel17Parser.st_memoize_return st_memoize104 = null;

        babel17Parser.st_yield_return st_yield105 = null;

        babel17Parser.expr_or_assign_return expr_or_assign106 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:399:2: ( st_val | st_def | st_memoize | st_yield | expr_or_assign )
            int alt52=5;
            switch ( input.LA(1) ) {
            case L_val:
                {
                alt52=1;
                }
                break;
            case L_def:
                {
                alt52=2;
                }
                break;
            case L_memoize:
                {
                alt52=3;
                }
                break;
            case L_yield:
                {
                alt52=4;
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
                alt52=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:399:4: st_val
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_st_val_in_statement2117);
                    st_val102=st_val();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, st_val102.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:400:4: st_def
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_st_def_in_statement2122);
                    st_def103=st_def();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, st_def103.getTree());

                    }
                    break;
                case 3 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:401:4: st_memoize
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_st_memoize_in_statement2127);
                    st_memoize104=st_memoize();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, st_memoize104.getTree());

                    }
                    break;
                case 4 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:402:4: st_yield
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_st_yield_in_statement2132);
                    st_yield105=st_yield();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, st_yield105.getTree());

                    }
                    break;
                case 5 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:403:4: expr_or_assign
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_expr_or_assign_in_statement2137);
                    expr_or_assign106=expr_or_assign();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_or_assign106.getTree());

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

        Token Id107=null;
        Token PERIOD108=null;
        Token Id109=null;

        CommonTree Id107_tree=null;
        CommonTree PERIOD108_tree=null;
        CommonTree Id109_tree=null;
        RewriteRuleTokenStream stream_Id=new RewriteRuleTokenStream(adaptor,"token Id");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:406:2: ( Id PERIOD Id -> ^( OBJELEM_ASSIGN Id Id ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:406:4: Id PERIOD Id
            {
            Id107=(Token)match(input,Id,FOLLOW_Id_in_objelem_assign2146); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Id.add(Id107);

            PERIOD108=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_objelem_assign2148); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD108);

            Id109=(Token)match(input,Id,FOLLOW_Id_in_objelem_assign2150); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Id.add(Id109);



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

        Token L_val110=null;
        Token NL111=null;
        Token NL114=null;
        Token char_literal115=null;
        Token NL116=null;
        babel17Parser.pattern_return pattern112 = null;

        babel17Parser.objelem_assign_return objelem_assign113 = null;

        babel17Parser.expr_return expr117 = null;


        CommonTree L_val110_tree=null;
        CommonTree NL111_tree=null;
        CommonTree NL114_tree=null;
        CommonTree char_literal115_tree=null;
        CommonTree NL116_tree=null;
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
            L_val110=(Token)match(input,L_val,FOLLOW_L_val_in_st_val2169); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_val.add(L_val110);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:408:16: ( NL )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==NL) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:408:16: NL
                    {
                    NL111=(Token)match(input,NL,FOLLOW_NL_in_st_val2171); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL111);


                    }
                    break;

            }

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:408:20: ( pattern | objelem_assign )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:408:21: pattern
                    {
                    pushFollow(FOLLOW_pattern_in_st_val2175);
                    pattern112=pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pattern.add(pattern112.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:408:31: objelem_assign
                    {
                    pushFollow(FOLLOW_objelem_assign_in_st_val2179);
                    objelem_assign113=objelem_assign();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_objelem_assign.add(objelem_assign113.getTree());

                    }
                    break;

            }

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:408:47: ( NL )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==NL) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:408:47: NL
                    {
                    NL114=(Token)match(input,NL,FOLLOW_NL_in_st_val2182); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL114);


                    }
                    break;

            }

            char_literal115=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_st_val2185); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal115);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:408:55: ( NL )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==NL) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:408:55: NL
                    {
                    NL116=(Token)match(input,NL,FOLLOW_NL_in_st_val2187); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL116);


                    }
                    break;

            }

            pushFollow(FOLLOW_expr_in_st_val2190);
            expr117=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr117.getTree());


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

        Token L_def118=null;
        Token NL119=null;
        Token Id120=null;
        Token NL121=null;
        Token NL123=null;
        Token char_literal124=null;
        Token NL125=null;
        babel17Parser.primitive_pattern_return primitive_pattern122 = null;

        babel17Parser.expr_return expr126 = null;


        CommonTree L_def118_tree=null;
        CommonTree NL119_tree=null;
        CommonTree Id120_tree=null;
        CommonTree NL121_tree=null;
        CommonTree NL123_tree=null;
        CommonTree char_literal124_tree=null;
        CommonTree NL125_tree=null;
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
            L_def118=(Token)match(input,L_def,FOLLOW_L_def_in_st_def2214); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_def.add(L_def118);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:410:16: ( NL )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==NL) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:410:16: NL
                    {
                    NL119=(Token)match(input,NL,FOLLOW_NL_in_st_def2216); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL119);


                    }
                    break;

            }

            Id120=(Token)match(input,Id,FOLLOW_Id_in_st_def2219); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Id.add(Id120);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:410:23: ( NL )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==NL) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:410:23: NL
                    {
                    NL121=(Token)match(input,NL,FOLLOW_NL_in_st_def2221); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL121);


                    }
                    break;

            }

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:410:27: ( primitive_pattern ( NL )? )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( ((LA60_0>=A_infinity && LA60_0<=U_infinity)||(LA60_0>=L_true && LA60_0<=L_false)||LA60_0==MINUS||(LA60_0>=Id && LA60_0<=Num)||(LA60_0>=String && LA60_0<=ROUND_BRACKET_OPEN)||LA60_0==SQUARE_BRACKET_OPEN||LA60_0==CURLY_BRACKET_OPEN||LA60_0==UNDERSCORE) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:410:28: primitive_pattern ( NL )?
                    {
                    pushFollow(FOLLOW_primitive_pattern_in_st_def2225);
                    primitive_pattern122=primitive_pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primitive_pattern.add(primitive_pattern122.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:410:46: ( NL )?
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==NL) ) {
                        alt59=1;
                    }
                    switch (alt59) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:410:46: NL
                            {
                            NL123=(Token)match(input,NL,FOLLOW_NL_in_st_def2227); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL123);


                            }
                            break;

                    }


                    }
                    break;

            }

            char_literal124=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_st_def2232); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal124);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:410:56: ( NL )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==NL) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:410:56: NL
                    {
                    NL125=(Token)match(input,NL,FOLLOW_NL_in_st_def2234); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL125);


                    }
                    break;

            }

            pushFollow(FOLLOW_expr_in_st_def2237);
            expr126=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr126.getTree());


            // AST REWRITE
            // elements: primitive_pattern, expr, Id
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

        Token L_yield127=null;
        babel17Parser.expr_return expr128 = null;


        CommonTree L_yield127_tree=null;
        RewriteRuleTokenStream stream_L_yield=new RewriteRuleTokenStream(adaptor,"token L_yield");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:413:9: ( L_yield expr -> ^( YIELD expr ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:413:11: L_yield expr
            {
            L_yield127=(Token)match(input,L_yield,FOLLOW_L_yield_in_st_yield2266); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_yield.add(L_yield127);

            pushFollow(FOLLOW_expr_in_st_yield2268);
            expr128=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr128.getTree());


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

        Token L_memoize129=null;
        babel17Parser.memid_return memid130 = null;


        CommonTree L_memoize129_tree=null;
        RewriteRuleTokenStream stream_L_memoize=new RewriteRuleTokenStream(adaptor,"token L_memoize");
        RewriteRuleSubtreeStream stream_memid=new RewriteRuleSubtreeStream(adaptor,"rule memid");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:416:2: ( L_memoize ( memid )+ -> ^( MEMOIZE ( memid )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:416:4: L_memoize ( memid )+
            {
            L_memoize129=(Token)match(input,L_memoize,FOLLOW_L_memoize_in_st_memoize2286); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_memoize.add(L_memoize129);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:416:14: ( memid )+
            int cnt62=0;
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==Id||LA62_0==ROUND_BRACKET_OPEN) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:416:14: memid
            	    {
            	    pushFollow(FOLLOW_memid_in_st_memoize2288);
            	    memid130=memid();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_memid.add(memid130.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt62 >= 1 ) break loop62;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(62, input);
                        throw eee;
                }
                cnt62++;
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

        Token Id131=null;
        Token char_literal132=null;
        Token Id133=null;
        Token char_literal134=null;

        CommonTree Id131_tree=null;
        CommonTree char_literal132_tree=null;
        CommonTree Id133_tree=null;
        CommonTree char_literal134_tree=null;
        RewriteRuleTokenStream stream_ROUND_BRACKET_OPEN=new RewriteRuleTokenStream(adaptor,"token ROUND_BRACKET_OPEN");
        RewriteRuleTokenStream stream_ROUND_BRACKET_CLOSE=new RewriteRuleTokenStream(adaptor,"token ROUND_BRACKET_CLOSE");
        RewriteRuleTokenStream stream_Id=new RewriteRuleTokenStream(adaptor,"token Id");

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:419:7: ( Id -> ^( MEM_STRONG Id ) | '(' Id ')' -> ^( MEM_WEAK Id ) )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==Id) ) {
                alt63=1;
            }
            else if ( (LA63_0==ROUND_BRACKET_OPEN) ) {
                alt63=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:419:9: Id
                    {
                    Id131=(Token)match(input,Id,FOLLOW_Id_in_memid2312); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Id.add(Id131);



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
                    char_literal132=(Token)match(input,ROUND_BRACKET_OPEN,FOLLOW_ROUND_BRACKET_OPEN_in_memid2325); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ROUND_BRACKET_OPEN.add(char_literal132);

                    Id133=(Token)match(input,Id,FOLLOW_Id_in_memid2327); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Id.add(Id133);

                    char_literal134=(Token)match(input,ROUND_BRACKET_CLOSE,FOLLOW_ROUND_BRACKET_CLOSE_in_memid2329); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ROUND_BRACKET_CLOSE.add(char_literal134);



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

        Token NL137=null;
        Token char_literal138=null;
        Token NL139=null;
        babel17Parser.pattern_return pattern135 = null;

        babel17Parser.objelem_assign_return objelem_assign136 = null;

        babel17Parser.expr_return expr140 = null;

        babel17Parser.expr_return expr141 = null;


        CommonTree NL137_tree=null;
        CommonTree char_literal138_tree=null;
        CommonTree NL139_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_objelem_assign=new RewriteRuleSubtreeStream(adaptor,"rule objelem_assign");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:424:2: ( ( ( pattern | objelem_assign ) ( NL )? '=' )=> ( pattern | objelem_assign ) ( NL )? '=' ( NL )? expr -> ^( ASSIGN pattern expr ) | expr )
            int alt67=2;
            alt67 = dfa67.predict(input);
            switch (alt67) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:424:4: ( ( pattern | objelem_assign ) ( NL )? '=' )=> ( pattern | objelem_assign ) ( NL )? '=' ( NL )? expr
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:424:44: ( pattern | objelem_assign )
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( ((LA64_0>=A_infinity && LA64_0<=U_infinity)||(LA64_0>=L_true && LA64_0<=L_false)||LA64_0==MINUS||LA64_0==Constr||LA64_0==Num||(LA64_0>=String && LA64_0<=ROUND_BRACKET_OPEN)||LA64_0==SQUARE_BRACKET_OPEN||LA64_0==CURLY_BRACKET_OPEN||LA64_0==UNDERSCORE) ) {
                        alt64=1;
                    }
                    else if ( (LA64_0==Id) ) {
                        int LA64_2 = input.LA(2);

                        if ( (LA64_2==PERIOD) ) {
                            alt64=2;
                        }
                        else if ( (LA64_2==ASSIGN||(LA64_2>=A_DOUBLE_COLON && LA64_2<=U_DOUBLE_COLON)||LA64_2==NL) ) {
                            alt64=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 64, 2, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 64, 0, input);

                        throw nvae;
                    }
                    switch (alt64) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:424:45: pattern
                            {
                            pushFollow(FOLLOW_pattern_in_expr_or_assign2369);
                            pattern135=pattern();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_pattern.add(pattern135.getTree());

                            }
                            break;
                        case 2 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:424:55: objelem_assign
                            {
                            pushFollow(FOLLOW_objelem_assign_in_expr_or_assign2373);
                            objelem_assign136=objelem_assign();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_objelem_assign.add(objelem_assign136.getTree());

                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:424:71: ( NL )?
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==NL) ) {
                        alt65=1;
                    }
                    switch (alt65) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:424:71: NL
                            {
                            NL137=(Token)match(input,NL,FOLLOW_NL_in_expr_or_assign2376); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL137);


                            }
                            break;

                    }

                    char_literal138=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_expr_or_assign2379); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal138);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:424:79: ( NL )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==NL) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:424:79: NL
                            {
                            NL139=(Token)match(input,NL,FOLLOW_NL_in_expr_or_assign2381); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL139);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_expr_in_expr_or_assign2384);
                    expr140=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr140.getTree());


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

                    pushFollow(FOLLOW_expr_in_expr_or_assign2399);
                    expr141=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr141.getTree());

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

        babel17Parser.lop_expr_return lop_expr142 = null;

        babel17Parser.obj_expr_return obj_expr143 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:428:2: ( lop_expr | obj_expr )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==L_begin||(LA68_0>=L_with && LA68_0<=L_if)||(LA68_0>=L_while && LA68_0<=L_for)||LA68_0==L_match||LA68_0==L_exception||(LA68_0>=A_infinity && LA68_0<=U_infinity)||(LA68_0>=L_concurrent && LA68_0<=L_lazy)||(LA68_0>=L_true && LA68_0<=L_nil)||LA68_0==MINUS||LA68_0==A_NOT||LA68_0==U_NOT||LA68_0==TILDE||(LA68_0>=Constr && LA68_0<=Num)||(LA68_0>=String && LA68_0<=ROUND_BRACKET_OPEN)||LA68_0==SQUARE_BRACKET_OPEN||LA68_0==CURLY_BRACKET_OPEN||LA68_0==UNDERSCORE) ) {
                alt68=1;
            }
            else if ( (LA68_0==L_obj) ) {
                alt68=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:428:4: lop_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_lop_expr_in_expr2410);
                    lop_expr142=lop_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lop_expr142.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:429:4: obj_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_obj_expr_in_expr2415);
                    obj_expr143=obj_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, obj_expr143.getTree());

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

        babel17Parser.if_expr_return if_expr144 = null;

        babel17Parser.while_do_expr_return while_do_expr145 = null;

        babel17Parser.match_expr_return match_expr146 = null;

        babel17Parser.for_expr_return for_expr147 = null;

        babel17Parser.begin_end_return begin_end148 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:432:2: ( if_expr | while_do_expr | match_expr | for_expr | begin_end )
            int alt69=5;
            switch ( input.LA(1) ) {
            case L_if:
                {
                alt69=1;
                }
                break;
            case L_while:
                {
                alt69=2;
                }
                break;
            case L_match:
                {
                alt69=3;
                }
                break;
            case L_for:
                {
                alt69=4;
                }
                break;
            case L_begin:
                {
                alt69=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }

            switch (alt69) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:432:4: if_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_if_expr_in_control_expr2425);
                    if_expr144=if_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, if_expr144.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:433:4: while_do_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_while_do_expr_in_control_expr2430);
                    while_do_expr145=while_do_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, while_do_expr145.getTree());

                    }
                    break;
                case 3 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:434:4: match_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_match_expr_in_control_expr2435);
                    match_expr146=match_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, match_expr146.getTree());

                    }
                    break;
                case 4 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:435:4: for_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_for_expr_in_control_expr2440);
                    for_expr147=for_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, for_expr147.getTree());

                    }
                    break;
                case 5 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:436:4: begin_end
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_begin_end_in_control_expr2445);
                    begin_end148=begin_end();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, begin_end148.getTree());

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

        Token L_with150=null;
        Token NL151=null;
        Token NL153=null;
        Token COLON154=null;
        Token NL155=null;
        babel17Parser.control_expr_return control_expr149 = null;

        babel17Parser.protected_expr_return protected_expr152 = null;

        babel17Parser.control_expr_return control_expr156 = null;


        CommonTree L_with150_tree=null;
        CommonTree NL151_tree=null;
        CommonTree NL153_tree=null;
        CommonTree COLON154_tree=null;
        CommonTree NL155_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_with=new RewriteRuleTokenStream(adaptor,"token L_with");
        RewriteRuleSubtreeStream stream_control_expr=new RewriteRuleSubtreeStream(adaptor,"rule control_expr");
        RewriteRuleSubtreeStream stream_protected_expr=new RewriteRuleSubtreeStream(adaptor,"rule protected_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:439:2: ( control_expr | L_with ( NL )? protected_expr ( NL )? COLON ( NL )? control_expr -> ^( WITH protected_expr control_expr ) )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==L_begin||LA73_0==L_if||(LA73_0>=L_while && LA73_0<=L_for)||LA73_0==L_match) ) {
                alt73=1;
            }
            else if ( (LA73_0==L_with) ) {
                alt73=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:439:4: control_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_control_expr_in_with_control_expr2455);
                    control_expr149=control_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, control_expr149.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:440:4: L_with ( NL )? protected_expr ( NL )? COLON ( NL )? control_expr
                    {
                    L_with150=(Token)match(input,L_with,FOLLOW_L_with_in_with_control_expr2460); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_with.add(L_with150);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:440:11: ( NL )?
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==NL) ) {
                        alt70=1;
                    }
                    switch (alt70) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:440:11: NL
                            {
                            NL151=(Token)match(input,NL,FOLLOW_NL_in_with_control_expr2462); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL151);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_protected_expr_in_with_control_expr2465);
                    protected_expr152=protected_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr152.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:440:30: ( NL )?
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==NL) ) {
                        alt71=1;
                    }
                    switch (alt71) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:440:30: NL
                            {
                            NL153=(Token)match(input,NL,FOLLOW_NL_in_with_control_expr2467); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL153);


                            }
                            break;

                    }

                    COLON154=(Token)match(input,COLON,FOLLOW_COLON_in_with_control_expr2470); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON154);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:440:40: ( NL )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==NL) ) {
                        alt72=1;
                    }
                    switch (alt72) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:440:40: NL
                            {
                            NL155=(Token)match(input,NL,FOLLOW_NL_in_with_control_expr2472); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL155);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_control_expr_in_with_control_expr2475);
                    control_expr156=control_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_control_expr.add(control_expr156.getTree());


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

        babel17Parser.p_lop_expr_return p_lop_expr157 = null;

        babel17Parser.obj_expr_return obj_expr158 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:444:2: ( p_lop_expr | obj_expr )
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==L_begin||(LA74_0>=L_with && LA74_0<=L_if)||(LA74_0>=L_while && LA74_0<=L_for)||(LA74_0>=L_match && LA74_0<=L_case)||LA74_0==L_exception||(LA74_0>=A_infinity && LA74_0<=U_infinity)||(LA74_0>=L_concurrent && LA74_0<=L_lazy)||(LA74_0>=L_true && LA74_0<=L_nil)||LA74_0==MINUS||LA74_0==A_NOT||LA74_0==U_NOT||LA74_0==TILDE||(LA74_0>=Constr && LA74_0<=Num)||(LA74_0>=String && LA74_0<=ROUND_BRACKET_OPEN)||LA74_0==SQUARE_BRACKET_OPEN||LA74_0==CURLY_BRACKET_OPEN||LA74_0==UNDERSCORE) ) {
                alt74=1;
            }
            else if ( (LA74_0==L_obj) ) {
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:444:4: p_lop_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_p_lop_expr_in_protected_expr2496);
                    p_lop_expr157=p_lop_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_lop_expr157.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:445:4: obj_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_obj_expr_in_protected_expr2501);
                    obj_expr158=obj_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, obj_expr158.getTree());

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

        Token L_begin159=null;
        Token L_end161=null;
        babel17Parser.block_return block160 = null;


        CommonTree L_begin159_tree=null;
        CommonTree L_end161_tree=null;
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleTokenStream stream_L_begin=new RewriteRuleTokenStream(adaptor,"token L_begin");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:449:2: ( L_begin block L_end -> ^( BEGIN block ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:449:4: L_begin block L_end
            {
            L_begin159=(Token)match(input,L_begin,FOLLOW_L_begin_in_begin_end2513); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_begin.add(L_begin159);

            pushFollow(FOLLOW_block_in_begin_end2515);
            block160=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block160.getTree());
            L_end161=(Token)match(input,L_end,FOLLOW_L_end_in_begin_end2517); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_end.add(L_end161);



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

        Token char_literal162=null;
        Token char_literal164=null;
        babel17Parser.primitive_expr_return primitive_expr163 = null;

        babel17Parser.primitive_expr_return primitive_expr165 = null;


        CommonTree char_literal162_tree=null;
        CommonTree char_literal164_tree=null;
        RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
        RewriteRuleTokenStream stream_TIMES=new RewriteRuleTokenStream(adaptor,"token TIMES");
        RewriteRuleSubtreeStream stream_primitive_expr=new RewriteRuleSubtreeStream(adaptor,"rule primitive_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:452:9: ( '+' primitive_expr -> ^( PARENTS_PLUS primitive_expr ) | '*' primitive_expr -> ^( PARENTS_MUL primitive_expr ) )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==PLUS) ) {
                alt75=1;
            }
            else if ( (LA75_0==TIMES) ) {
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:452:11: '+' primitive_expr
                    {
                    char_literal162=(Token)match(input,PLUS,FOLLOW_PLUS_in_parents2535); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PLUS.add(char_literal162);

                    pushFollow(FOLLOW_primitive_expr_in_parents2537);
                    primitive_expr163=primitive_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primitive_expr.add(primitive_expr163.getTree());


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
                    char_literal164=(Token)match(input,TIMES,FOLLOW_TIMES_in_parents2550); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TIMES.add(char_literal164);

                    pushFollow(FOLLOW_primitive_expr_in_parents2552);
                    primitive_expr165=primitive_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primitive_expr.add(primitive_expr165.getTree());


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

        Token L_obj166=null;
        Token NL167=null;
        Token L_end170=null;
        Token L_obj171=null;
        Token L_end173=null;
        babel17Parser.parents_return parents168 = null;

        babel17Parser.block_return block169 = null;

        babel17Parser.block_return block172 = null;


        CommonTree L_obj166_tree=null;
        CommonTree NL167_tree=null;
        CommonTree L_end170_tree=null;
        CommonTree L_obj171_tree=null;
        CommonTree L_end173_tree=null;
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_obj=new RewriteRuleTokenStream(adaptor,"token L_obj");
        RewriteRuleSubtreeStream stream_parents=new RewriteRuleSubtreeStream(adaptor,"rule parents");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:456:9: ( ( L_obj ( NL )? parents )=> L_obj ( NL )? parents block L_end -> ^( OBJ block parents ) | L_obj block L_end -> ^( OBJ block ) )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==L_obj) ) {
                int LA77_1 = input.LA(2);

                if ( (LA77_1==NL) ) {
                    int LA77_2 = input.LA(3);

                    if ( ((LA77_2>=L_begin && LA77_2<=L_if)||(LA77_2>=L_while && LA77_2<=L_for)||(LA77_2>=L_yield && LA77_2<=L_match)||(LA77_2>=L_val && LA77_2<=L_def)||LA77_2==L_exception||(LA77_2>=A_infinity && LA77_2<=U_infinity)||(LA77_2>=L_concurrent && LA77_2<=L_nil)||LA77_2==SC||LA77_2==MINUS||LA77_2==A_NOT||LA77_2==U_NOT||LA77_2==TILDE||(LA77_2>=NL && LA77_2<=Num)||(LA77_2>=String && LA77_2<=ROUND_BRACKET_OPEN)||LA77_2==SQUARE_BRACKET_OPEN||LA77_2==CURLY_BRACKET_OPEN||LA77_2==UNDERSCORE) ) {
                        alt77=2;
                    }
                    else if ( (LA77_2==PLUS) && (synpred4_babel17())) {
                        alt77=1;
                    }
                    else if ( (LA77_2==TIMES) && (synpred4_babel17())) {
                        alt77=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 77, 2, input);

                        throw nvae;
                    }
                }
                else if ( ((LA77_1>=L_begin && LA77_1<=L_if)||(LA77_1>=L_while && LA77_1<=L_for)||(LA77_1>=L_yield && LA77_1<=L_match)||(LA77_1>=L_val && LA77_1<=L_def)||LA77_1==L_exception||(LA77_1>=A_infinity && LA77_1<=U_infinity)||(LA77_1>=L_concurrent && LA77_1<=L_nil)||LA77_1==SC||LA77_1==MINUS||LA77_1==A_NOT||LA77_1==U_NOT||LA77_1==TILDE||(LA77_1>=Constr && LA77_1<=Num)||(LA77_1>=String && LA77_1<=ROUND_BRACKET_OPEN)||LA77_1==SQUARE_BRACKET_OPEN||LA77_1==CURLY_BRACKET_OPEN||LA77_1==UNDERSCORE) ) {
                    alt77=2;
                }
                else if ( (LA77_1==PLUS) && (synpred4_babel17())) {
                    alt77=1;
                }
                else if ( (LA77_1==TIMES) && (synpred4_babel17())) {
                    alt77=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 77, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }
            switch (alt77) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:456:11: ( L_obj ( NL )? parents )=> L_obj ( NL )? parents block L_end
                    {
                    L_obj166=(Token)match(input,L_obj,FOLLOW_L_obj_in_obj_expr2580); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_obj.add(L_obj166);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:456:40: ( NL )?
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==NL) ) {
                        alt76=1;
                    }
                    switch (alt76) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:456:40: NL
                            {
                            NL167=(Token)match(input,NL,FOLLOW_NL_in_obj_expr2582); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL167);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_parents_in_obj_expr2585);
                    parents168=parents();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parents.add(parents168.getTree());
                    pushFollow(FOLLOW_block_in_obj_expr2587);
                    block169=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block169.getTree());
                    L_end170=(Token)match(input,L_end,FOLLOW_L_end_in_obj_expr2589); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_end.add(L_end170);



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
                    L_obj171=(Token)match(input,L_obj,FOLLOW_L_obj_in_obj_expr2617); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_obj.add(L_obj171);

                    pushFollow(FOLLOW_block_in_obj_expr2619);
                    block172=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block172.getTree());
                    L_end173=(Token)match(input,L_end,FOLLOW_L_end_in_obj_expr2621); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_end.add(L_end173);



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

        babel17Parser.lambda_expr_return lambda_expr174 = null;

        babel17Parser.op_expr_return op_expr175 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:460:2: ( ( lambda_expr )=> lambda_expr | op_expr )
            int alt78=2;
            alt78 = dfa78.predict(input);
            switch (alt78) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:460:4: ( lambda_expr )=> lambda_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_lambda_expr_in_lop_expr2649);
                    lambda_expr174=lambda_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lambda_expr174.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:461:4: op_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_op_expr_in_lop_expr2654);
                    op_expr175=op_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, op_expr175.getTree());

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

        babel17Parser.protected_lambda_expr_return protected_lambda_expr176 = null;

        babel17Parser.p_op_expr_return p_op_expr177 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:464:2: ( ( protected_lambda_expr )=> protected_lambda_expr | p_op_expr )
            int alt79=2;
            alt79 = dfa79.predict(input);
            switch (alt79) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:464:4: ( protected_lambda_expr )=> protected_lambda_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_protected_lambda_expr_in_p_lop_expr2670);
                    protected_lambda_expr176=protected_lambda_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, protected_lambda_expr176.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:465:4: p_op_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_p_op_expr_in_p_lop_expr2675);
                    p_op_expr177=p_op_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_op_expr177.getTree());

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

        Token L_if178=null;
        Token NL179=null;
        Token NL181=null;
        Token L_then182=null;
        Token L_elseif184=null;
        Token NL185=null;
        Token NL187=null;
        Token L_then188=null;
        Token L_else190=null;
        Token L_end192=null;
        babel17Parser.protected_expr_return protected_expr180 = null;

        babel17Parser.block_return block183 = null;

        babel17Parser.protected_expr_return protected_expr186 = null;

        babel17Parser.block_return block189 = null;

        babel17Parser.block_return block191 = null;


        CommonTree L_if178_tree=null;
        CommonTree NL179_tree=null;
        CommonTree NL181_tree=null;
        CommonTree L_then182_tree=null;
        CommonTree L_elseif184_tree=null;
        CommonTree NL185_tree=null;
        CommonTree NL187_tree=null;
        CommonTree L_then188_tree=null;
        CommonTree L_else190_tree=null;
        CommonTree L_end192_tree=null;
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
            L_if178=(Token)match(input,L_if,FOLLOW_L_if_in_if_expr2686); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_if.add(L_if178);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:467:16: ( NL )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==NL) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:467:16: NL
                    {
                    NL179=(Token)match(input,NL,FOLLOW_NL_in_if_expr2688); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL179);


                    }
                    break;

            }

            pushFollow(FOLLOW_protected_expr_in_if_expr2691);
            protected_expr180=protected_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr180.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:467:35: ( NL )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==NL) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:467:35: NL
                    {
                    NL181=(Token)match(input,NL,FOLLOW_NL_in_if_expr2693); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL181);


                    }
                    break;

            }

            L_then182=(Token)match(input,L_then,FOLLOW_L_then_in_if_expr2696); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_then.add(L_then182);

            pushFollow(FOLLOW_block_in_if_expr2698);
            block183=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block183.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:468:3: ( L_elseif ( NL )? protected_expr ( NL )? L_then block )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==L_elseif) ) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:468:4: L_elseif ( NL )? protected_expr ( NL )? L_then block
            	    {
            	    L_elseif184=(Token)match(input,L_elseif,FOLLOW_L_elseif_in_if_expr2704); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_L_elseif.add(L_elseif184);

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:468:13: ( NL )?
            	    int alt82=2;
            	    int LA82_0 = input.LA(1);

            	    if ( (LA82_0==NL) ) {
            	        alt82=1;
            	    }
            	    switch (alt82) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:468:13: NL
            	            {
            	            NL185=(Token)match(input,NL,FOLLOW_NL_in_if_expr2706); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL185);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_protected_expr_in_if_expr2709);
            	    protected_expr186=protected_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr186.getTree());
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:468:32: ( NL )?
            	    int alt83=2;
            	    int LA83_0 = input.LA(1);

            	    if ( (LA83_0==NL) ) {
            	        alt83=1;
            	    }
            	    switch (alt83) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:468:32: NL
            	            {
            	            NL187=(Token)match(input,NL,FOLLOW_NL_in_if_expr2711); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL187);


            	            }
            	            break;

            	    }

            	    L_then188=(Token)match(input,L_then,FOLLOW_L_then_in_if_expr2714); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_L_then.add(L_then188);

            	    pushFollow(FOLLOW_block_in_if_expr2716);
            	    block189=block();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_block.add(block189.getTree());

            	    }
            	    break;

            	default :
            	    break loop84;
                }
            } while (true);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:469:3: ( L_else block )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==L_else) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:469:4: L_else block
                    {
                    L_else190=(Token)match(input,L_else,FOLLOW_L_else_in_if_expr2724); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_else.add(L_else190);

                    pushFollow(FOLLOW_block_in_if_expr2726);
                    block191=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block191.getTree());

                    }
                    break;

            }

            L_end192=(Token)match(input,L_end,FOLLOW_L_end_in_if_expr2730); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_end.add(L_end192);



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

        Token L_while193=null;
        Token NL194=null;
        Token NL196=null;
        Token L_do197=null;
        Token L_end199=null;
        babel17Parser.protected_expr_return protected_expr195 = null;

        babel17Parser.block_return block198 = null;


        CommonTree L_while193_tree=null;
        CommonTree NL194_tree=null;
        CommonTree NL196_tree=null;
        CommonTree L_do197_tree=null;
        CommonTree L_end199_tree=null;
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
            L_while193=(Token)match(input,L_while,FOLLOW_L_while_in_while_do_expr2754); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_while.add(L_while193);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:472:12: ( NL )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==NL) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:472:12: NL
                    {
                    NL194=(Token)match(input,NL,FOLLOW_NL_in_while_do_expr2756); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL194);


                    }
                    break;

            }

            pushFollow(FOLLOW_protected_expr_in_while_do_expr2759);
            protected_expr195=protected_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr195.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:472:31: ( NL )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==NL) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:472:31: NL
                    {
                    NL196=(Token)match(input,NL,FOLLOW_NL_in_while_do_expr2761); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL196);


                    }
                    break;

            }

            L_do197=(Token)match(input,L_do,FOLLOW_L_do_in_while_do_expr2764); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_do.add(L_do197);

            pushFollow(FOLLOW_block_in_while_do_expr2766);
            block198=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block198.getTree());
            L_end199=(Token)match(input,L_end,FOLLOW_L_end_in_while_do_expr2768); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_end.add(L_end199);



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

        Token NL202=null;
        babel17Parser.full_cases_return full_cases200 = null;

        babel17Parser.pattern_return pattern201 = null;

        babel17Parser.token_DOUBLE_ARROW_return token_DOUBLE_ARROW203 = null;

        babel17Parser.block_return block204 = null;


        CommonTree NL202_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_token_DOUBLE_ARROW=new RewriteRuleSubtreeStream(adaptor,"rule token_DOUBLE_ARROW");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:476:2: ( full_cases | pattern ( NL )? token_DOUBLE_ARROW block -> ^( CASES ^( NIL_TOKEN pattern block ) ) )
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==L_case) ) {
                alt89=1;
            }
            else if ( ((LA89_0>=A_infinity && LA89_0<=U_infinity)||(LA89_0>=L_true && LA89_0<=L_false)||LA89_0==MINUS||(LA89_0>=Constr && LA89_0<=Num)||(LA89_0>=String && LA89_0<=ROUND_BRACKET_OPEN)||LA89_0==SQUARE_BRACKET_OPEN||LA89_0==CURLY_BRACKET_OPEN||LA89_0==UNDERSCORE) ) {
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:476:4: full_cases
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_full_cases_in_cases2798);
                    full_cases200=full_cases();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, full_cases200.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:477:4: pattern ( NL )? token_DOUBLE_ARROW block
                    {
                    pushFollow(FOLLOW_pattern_in_cases2803);
                    pattern201=pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pattern.add(pattern201.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:477:12: ( NL )?
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==NL) ) {
                        alt88=1;
                    }
                    switch (alt88) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:477:12: NL
                            {
                            NL202=(Token)match(input,NL,FOLLOW_NL_in_cases2805); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL202);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_token_DOUBLE_ARROW_in_cases2808);
                    token_DOUBLE_ARROW203=token_DOUBLE_ARROW();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_token_DOUBLE_ARROW.add(token_DOUBLE_ARROW203.getTree());
                    pushFollow(FOLLOW_block_in_cases2810);
                    block204=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block204.getTree());


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

        babel17Parser.case_expr_return case_expr205 = null;


        RewriteRuleSubtreeStream stream_case_expr=new RewriteRuleSubtreeStream(adaptor,"rule case_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:480:2: ( ( case_expr )+ -> ^( CASES ( case_expr )+ ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:480:4: ( case_expr )+
            {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:480:4: ( case_expr )+
            int cnt90=0;
            loop90:
            do {
                int alt90=2;
                int LA90_0 = input.LA(1);

                if ( (LA90_0==L_case) ) {
                    alt90=1;
                }


                switch (alt90) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:480:4: case_expr
            	    {
            	    pushFollow(FOLLOW_case_expr_in_full_cases2833);
            	    case_expr205=case_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_case_expr.add(case_expr205.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt90 >= 1 ) break loop90;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(90, input);
                        throw eee;
                }
                cnt90++;
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

        Token L_case206=null;
        Token NL207=null;
        Token NL209=null;
        babel17Parser.pattern_return pattern208 = null;

        babel17Parser.token_DOUBLE_ARROW_return token_DOUBLE_ARROW210 = null;

        babel17Parser.block_return block211 = null;


        CommonTree L_case206_tree=null;
        CommonTree NL207_tree=null;
        CommonTree NL209_tree=null;
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
            L_case206=(Token)match(input,L_case,FOLLOW_L_case_in_case_expr2854); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_case.add(L_case206);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:483:12: ( NL )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==NL) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:483:12: NL
                    {
                    NL207=(Token)match(input,NL,FOLLOW_NL_in_case_expr2856); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL207);


                    }
                    break;

            }

            pushFollow(FOLLOW_pattern_in_case_expr2859);
            pattern208=pattern();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pattern.add(pattern208.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:483:24: ( NL )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==NL) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:483:24: NL
                    {
                    NL209=(Token)match(input,NL,FOLLOW_NL_in_case_expr2861); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL209);


                    }
                    break;

            }

            pushFollow(FOLLOW_token_DOUBLE_ARROW_in_case_expr2864);
            token_DOUBLE_ARROW210=token_DOUBLE_ARROW();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_token_DOUBLE_ARROW.add(token_DOUBLE_ARROW210.getTree());
            pushFollow(FOLLOW_block_in_case_expr2866);
            block211=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block211.getTree());

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

        Token L_match212=null;
        Token NL213=null;
        Token NL215=null;
        Token L_end217=null;
        babel17Parser.p_op_expr_return p_op_expr214 = null;

        babel17Parser.full_cases_return full_cases216 = null;


        CommonTree L_match212_tree=null;
        CommonTree NL213_tree=null;
        CommonTree NL215_tree=null;
        CommonTree L_end217_tree=null;
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_match=new RewriteRuleTokenStream(adaptor,"token L_match");
        RewriteRuleSubtreeStream stream_full_cases=new RewriteRuleSubtreeStream(adaptor,"rule full_cases");
        RewriteRuleSubtreeStream stream_p_op_expr=new RewriteRuleSubtreeStream(adaptor,"rule p_op_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:486:2: ( L_match ( NL )? p_op_expr ( NL )? full_cases L_end -> ^( MATCH p_op_expr full_cases ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:486:4: L_match ( NL )? p_op_expr ( NL )? full_cases L_end
            {
            L_match212=(Token)match(input,L_match,FOLLOW_L_match_in_match_expr2887); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_match.add(L_match212);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:486:12: ( NL )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==NL) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:486:12: NL
                    {
                    NL213=(Token)match(input,NL,FOLLOW_NL_in_match_expr2889); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL213);


                    }
                    break;

            }

            pushFollow(FOLLOW_p_op_expr_in_match_expr2892);
            p_op_expr214=p_op_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_p_op_expr.add(p_op_expr214.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:486:26: ( NL )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==NL) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:486:26: NL
                    {
                    NL215=(Token)match(input,NL,FOLLOW_NL_in_match_expr2894); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL215);


                    }
                    break;

            }

            pushFollow(FOLLOW_full_cases_in_match_expr2897);
            full_cases216=full_cases();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_full_cases.add(full_cases216.getTree());
            L_end217=(Token)match(input,L_end,FOLLOW_L_end_in_match_expr2899); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_end.add(L_end217);



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

        babel17Parser.lambda_cases_return lambda_cases218 = null;


        RewriteRuleSubtreeStream stream_lambda_cases=new RewriteRuleSubtreeStream(adaptor,"rule lambda_cases");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:490:2: ( lambda_cases -> ^( LAMBDA lambda_cases ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:490:4: lambda_cases
            {
            pushFollow(FOLLOW_lambda_cases_in_lambda_expr2925);
            lambda_cases218=lambda_cases();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_lambda_cases.add(lambda_cases218.getTree());


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

        Token NL220=null;
        Token NL222=null;
        babel17Parser.pattern_return pattern219 = null;

        babel17Parser.token_DOUBLE_ARROW_return token_DOUBLE_ARROW221 = null;

        babel17Parser.lop_expr_return lop_expr223 = null;


        CommonTree NL220_tree=null;
        CommonTree NL222_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_token_DOUBLE_ARROW=new RewriteRuleSubtreeStream(adaptor,"rule token_DOUBLE_ARROW");
        RewriteRuleSubtreeStream stream_lop_expr=new RewriteRuleSubtreeStream(adaptor,"rule lop_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:493:2: ( pattern ( NL )? token_DOUBLE_ARROW ( NL )? lop_expr -> ^( CASES ^( NIL_TOKEN pattern ^( BLOCK lop_expr ) ) ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:493:4: pattern ( NL )? token_DOUBLE_ARROW ( NL )? lop_expr
            {
            pushFollow(FOLLOW_pattern_in_lambda_cases2943);
            pattern219=pattern();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pattern.add(pattern219.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:493:12: ( NL )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==NL) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:493:12: NL
                    {
                    NL220=(Token)match(input,NL,FOLLOW_NL_in_lambda_cases2945); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL220);


                    }
                    break;

            }

            pushFollow(FOLLOW_token_DOUBLE_ARROW_in_lambda_cases2948);
            token_DOUBLE_ARROW221=token_DOUBLE_ARROW();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_token_DOUBLE_ARROW.add(token_DOUBLE_ARROW221.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:493:35: ( NL )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==NL) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:493:35: NL
                    {
                    NL222=(Token)match(input,NL,FOLLOW_NL_in_lambda_cases2950); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL222);


                    }
                    break;

            }

            pushFollow(FOLLOW_lop_expr_in_lambda_cases2953);
            lop_expr223=lop_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_lop_expr.add(lop_expr223.getTree());


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

        babel17Parser.protected_lambda_cases_return protected_lambda_cases224 = null;


        RewriteRuleSubtreeStream stream_protected_lambda_cases=new RewriteRuleSubtreeStream(adaptor,"rule protected_lambda_cases");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:496:2: ( protected_lambda_cases -> ^( LAMBDA protected_lambda_cases ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:496:4: protected_lambda_cases
            {
            pushFollow(FOLLOW_protected_lambda_cases_in_protected_lambda_expr2981);
            protected_lambda_cases224=protected_lambda_cases();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_protected_lambda_cases.add(protected_lambda_cases224.getTree());


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

        Token L_case225=null;
        Token NL226=null;
        Token NL228=null;
        Token NL230=null;
        babel17Parser.pattern_return pattern227 = null;

        babel17Parser.token_DOUBLE_ARROW_return token_DOUBLE_ARROW229 = null;

        babel17Parser.pure_block_return pure_block231 = null;


        CommonTree L_case225_tree=null;
        CommonTree NL226_tree=null;
        CommonTree NL228_tree=null;
        CommonTree NL230_tree=null;
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
            L_case225=(Token)match(input,L_case,FOLLOW_L_case_in_p_lambda_case_expr2999); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_case.add(L_case225);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:499:12: ( NL )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==NL) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:499:12: NL
                    {
                    NL226=(Token)match(input,NL,FOLLOW_NL_in_p_lambda_case_expr3001); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL226);


                    }
                    break;

            }

            pushFollow(FOLLOW_pattern_in_p_lambda_case_expr3004);
            pattern227=pattern();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pattern.add(pattern227.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:499:24: ( NL )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==NL) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:499:24: NL
                    {
                    NL228=(Token)match(input,NL,FOLLOW_NL_in_p_lambda_case_expr3006); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL228);


                    }
                    break;

            }

            pushFollow(FOLLOW_token_DOUBLE_ARROW_in_p_lambda_case_expr3009);
            token_DOUBLE_ARROW229=token_DOUBLE_ARROW();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_token_DOUBLE_ARROW.add(token_DOUBLE_ARROW229.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:499:47: ( NL )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==NL) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:499:47: NL
                    {
                    NL230=(Token)match(input,NL,FOLLOW_NL_in_p_lambda_case_expr3011); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL230);


                    }
                    break;

            }

            pushFollow(FOLLOW_pure_block_in_p_lambda_case_expr3014);
            pure_block231=pure_block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pure_block.add(pure_block231.getTree());

            }



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

        Token NL233=null;
        Token NL235=null;
        babel17Parser.pattern_return pattern232 = null;

        babel17Parser.token_DOUBLE_ARROW_return token_DOUBLE_ARROW234 = null;

        babel17Parser.pure_block_return pure_block236 = null;

        babel17Parser.p_lambda_case_expr_return p_lambda_case_expr237 = null;


        CommonTree NL233_tree=null;
        CommonTree NL235_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_token_DOUBLE_ARROW=new RewriteRuleSubtreeStream(adaptor,"rule token_DOUBLE_ARROW");
        RewriteRuleSubtreeStream stream_p_lambda_case_expr=new RewriteRuleSubtreeStream(adaptor,"rule p_lambda_case_expr");
        RewriteRuleSubtreeStream stream_pure_block=new RewriteRuleSubtreeStream(adaptor,"rule pure_block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:502:2: ( pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block -> ^( CASES ^( NIL_TOKEN pattern pure_block ) ) | ( p_lambda_case_expr )+ -> ^( CASES ( p_lambda_case_expr )+ ) )
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( ((LA103_0>=A_infinity && LA103_0<=U_infinity)||(LA103_0>=L_true && LA103_0<=L_false)||LA103_0==MINUS||(LA103_0>=Constr && LA103_0<=Num)||(LA103_0>=String && LA103_0<=ROUND_BRACKET_OPEN)||LA103_0==SQUARE_BRACKET_OPEN||LA103_0==CURLY_BRACKET_OPEN||LA103_0==UNDERSCORE) ) {
                alt103=1;
            }
            else if ( (LA103_0==L_case) ) {
                alt103=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 103, 0, input);

                throw nvae;
            }
            switch (alt103) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:502:4: pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block
                    {
                    pushFollow(FOLLOW_pattern_in_protected_lambda_cases3035);
                    pattern232=pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pattern.add(pattern232.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:502:12: ( NL )?
                    int alt100=2;
                    int LA100_0 = input.LA(1);

                    if ( (LA100_0==NL) ) {
                        alt100=1;
                    }
                    switch (alt100) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:502:12: NL
                            {
                            NL233=(Token)match(input,NL,FOLLOW_NL_in_protected_lambda_cases3037); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL233);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_token_DOUBLE_ARROW_in_protected_lambda_cases3040);
                    token_DOUBLE_ARROW234=token_DOUBLE_ARROW();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_token_DOUBLE_ARROW.add(token_DOUBLE_ARROW234.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:502:35: ( NL )?
                    int alt101=2;
                    int LA101_0 = input.LA(1);

                    if ( (LA101_0==NL) ) {
                        alt101=1;
                    }
                    switch (alt101) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:502:35: NL
                            {
                            NL235=(Token)match(input,NL,FOLLOW_NL_in_protected_lambda_cases3042); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL235);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_pure_block_in_protected_lambda_cases3045);
                    pure_block236=pure_block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pure_block.add(pure_block236.getTree());


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
                    	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:503:4: p_lambda_case_expr
                    	    {
                    	    pushFollow(FOLLOW_p_lambda_case_expr_in_protected_lambda_cases3064);
                    	    p_lambda_case_expr237=p_lambda_case_expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_p_lambda_case_expr.add(p_lambda_case_expr237.getTree());

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

        Token L_for238=null;
        Token NL239=null;
        Token NL241=null;
        Token L_in242=null;
        Token NL243=null;
        Token NL245=null;
        Token L_do246=null;
        Token L_end248=null;
        babel17Parser.pattern_return pattern240 = null;

        babel17Parser.protected_expr_return protected_expr244 = null;

        babel17Parser.block_return block247 = null;


        CommonTree L_for238_tree=null;
        CommonTree NL239_tree=null;
        CommonTree NL241_tree=null;
        CommonTree L_in242_tree=null;
        CommonTree NL243_tree=null;
        CommonTree NL245_tree=null;
        CommonTree L_do246_tree=null;
        CommonTree L_end248_tree=null;
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
            L_for238=(Token)match(input,L_for,FOLLOW_L_for_in_for_expr3081); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_for.add(L_for238);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:505:17: ( NL )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==NL) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:505:17: NL
                    {
                    NL239=(Token)match(input,NL,FOLLOW_NL_in_for_expr3083); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL239);


                    }
                    break;

            }

            pushFollow(FOLLOW_pattern_in_for_expr3086);
            pattern240=pattern();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pattern.add(pattern240.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:505:29: ( NL )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==NL) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:505:29: NL
                    {
                    NL241=(Token)match(input,NL,FOLLOW_NL_in_for_expr3088); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL241);


                    }
                    break;

            }

            L_in242=(Token)match(input,L_in,FOLLOW_L_in_in_for_expr3091); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_in.add(L_in242);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:505:38: ( NL )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==NL) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:505:38: NL
                    {
                    NL243=(Token)match(input,NL,FOLLOW_NL_in_for_expr3093); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL243);


                    }
                    break;

            }

            pushFollow(FOLLOW_protected_expr_in_for_expr3096);
            protected_expr244=protected_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr244.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:505:57: ( NL )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==NL) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:505:57: NL
                    {
                    NL245=(Token)match(input,NL,FOLLOW_NL_in_for_expr3098); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL245);


                    }
                    break;

            }

            L_do246=(Token)match(input,L_do,FOLLOW_L_do_in_for_expr3101); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_do.add(L_do246);

            pushFollow(FOLLOW_block_in_for_expr3103);
            block247=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block247.getTree());
            L_end248=(Token)match(input,L_end,FOLLOW_L_end_in_for_expr3105); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_end.add(L_end248);



            // AST REWRITE
            // elements: block, pattern, protected_expr
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

        babel17Parser.builtin_primitive_return builtin_primitive249 = null;

        babel17Parser.op_expr_return op_expr250 = null;

        babel17Parser.bool_expr_return bool_expr251 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:508:9: ( builtin_primitive op_expr | bool_expr )
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==L_exception||(LA108_0>=L_concurrent && LA108_0<=L_lazy)||LA108_0==L_random||LA108_0==TILDE) ) {
                alt108=1;
            }
            else if ( (LA108_0==L_begin||(LA108_0>=L_with && LA108_0<=L_if)||(LA108_0>=L_while && LA108_0<=L_for)||LA108_0==L_match||(LA108_0>=A_infinity && LA108_0<=U_infinity)||(LA108_0>=L_true && LA108_0<=L_this)||LA108_0==L_nil||LA108_0==MINUS||LA108_0==A_NOT||LA108_0==U_NOT||(LA108_0>=Constr && LA108_0<=Num)||(LA108_0>=String && LA108_0<=ROUND_BRACKET_OPEN)||LA108_0==SQUARE_BRACKET_OPEN||LA108_0==CURLY_BRACKET_OPEN) ) {
                alt108=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 108, 0, input);

                throw nvae;
            }
            switch (alt108) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:508:11: builtin_primitive op_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_builtin_primitive_in_op_expr3130);
                    builtin_primitive249=builtin_primitive();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(builtin_primitive249.getTree(), root_0);
                    pushFollow(FOLLOW_op_expr_in_op_expr3133);
                    op_expr250=op_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, op_expr250.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:509:4: bool_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_bool_expr_in_op_expr3138);
                    bool_expr251=bool_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_expr251.getTree());

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

        Token NL253=null;
        babel17Parser.builtin_primitive_return builtin_primitive252 = null;

        babel17Parser.p_op_expr_return p_op_expr254 = null;

        babel17Parser.p_bool_expr_return p_bool_expr255 = null;


        CommonTree NL253_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:512:2: ( builtin_primitive ( NL )? p_op_expr | p_bool_expr )
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==L_exception||(LA110_0>=L_concurrent && LA110_0<=L_lazy)||LA110_0==L_random||LA110_0==TILDE) ) {
                alt110=1;
            }
            else if ( (LA110_0==L_begin||(LA110_0>=L_with && LA110_0<=L_if)||(LA110_0>=L_while && LA110_0<=L_for)||LA110_0==L_match||(LA110_0>=A_infinity && LA110_0<=U_infinity)||(LA110_0>=L_true && LA110_0<=L_this)||LA110_0==L_nil||LA110_0==MINUS||LA110_0==A_NOT||LA110_0==U_NOT||(LA110_0>=Constr && LA110_0<=Num)||(LA110_0>=String && LA110_0<=ROUND_BRACKET_OPEN)||LA110_0==SQUARE_BRACKET_OPEN||LA110_0==CURLY_BRACKET_OPEN) ) {
                alt110=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 110, 0, input);

                throw nvae;
            }
            switch (alt110) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:512:4: builtin_primitive ( NL )? p_op_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_builtin_primitive_in_p_op_expr3148);
                    builtin_primitive252=builtin_primitive();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(builtin_primitive252.getTree(), root_0);
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:512:25: ( NL )?
                    int alt109=2;
                    int LA109_0 = input.LA(1);

                    if ( (LA109_0==NL) ) {
                        alt109=1;
                    }
                    switch (alt109) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:512:25: NL
                            {
                            NL253=(Token)match(input,NL,FOLLOW_NL_in_p_op_expr3151); if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_p_op_expr_in_p_op_expr3155);
                    p_op_expr254=p_op_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_op_expr254.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:513:4: p_bool_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_p_bool_expr_in_p_op_expr3160);
                    p_bool_expr255=p_bool_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_bool_expr255.getTree());

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

        Token set256=null;

        CommonTree set256_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:517:2: ( L_random | L_await | L_exception | L_lazy | TILDE | L_concurrent )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set256=(Token)input.LT(1);
            if ( input.LA(1)==L_exception||(input.LA(1)>=L_concurrent && input.LA(1)<=L_lazy)||input.LA(1)==L_random||input.LA(1)==TILDE ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set256));
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

        babel17Parser.bool_or_expr_return bool_or_expr257 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:520:2: ( bool_or_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:520:4: bool_or_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bool_or_expr_in_bool_expr3200);
            bool_or_expr257=bool_or_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_or_expr257.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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

        babel17Parser.p_bool_or_expr_return p_bool_or_expr258 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:523:2: ( p_bool_or_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:523:4: p_bool_or_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_bool_or_expr_in_p_bool_expr3210);
            p_bool_or_expr258=p_bool_or_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_bool_or_expr258.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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

        Token NL260=null;
        Token NL262=null;
        babel17Parser.bool_and_expr_return bool_and_expr259 = null;

        babel17Parser.token_OR_return token_OR261 = null;

        babel17Parser.bool_and_expr_return bool_and_expr263 = null;


        CommonTree NL260_tree=null;
        CommonTree NL262_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:526:2: ( bool_and_expr ( ( NL )? token_OR ( NL )? bool_and_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:526:4: bool_and_expr ( ( NL )? token_OR ( NL )? bool_and_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bool_and_expr_in_bool_or_expr3219);
            bool_and_expr259=bool_and_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_and_expr259.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:526:18: ( ( NL )? token_OR ( NL )? bool_and_expr )*
            loop113:
            do {
                int alt113=2;
                int LA113_0 = input.LA(1);

                if ( (LA113_0==NL) ) {
                    int LA113_1 = input.LA(2);

                    if ( (LA113_1==A_OR||LA113_1==U_OR) ) {
                        alt113=1;
                    }


                }
                else if ( (LA113_0==A_OR||LA113_0==U_OR) ) {
                    alt113=1;
                }


                switch (alt113) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:526:19: ( NL )? token_OR ( NL )? bool_and_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:526:21: ( NL )?
            	    int alt111=2;
            	    int LA111_0 = input.LA(1);

            	    if ( (LA111_0==NL) ) {
            	        alt111=1;
            	    }
            	    switch (alt111) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:526:21: NL
            	            {
            	            NL260=(Token)match(input,NL,FOLLOW_NL_in_bool_or_expr3222); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_token_OR_in_bool_or_expr3226);
            	    token_OR261=token_OR();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(token_OR261.getTree(), root_0);
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:526:36: ( NL )?
            	    int alt112=2;
            	    int LA112_0 = input.LA(1);

            	    if ( (LA112_0==NL) ) {
            	        alt112=1;
            	    }
            	    switch (alt112) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:526:36: NL
            	            {
            	            NL262=(Token)match(input,NL,FOLLOW_NL_in_bool_or_expr3229); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_bool_and_expr_in_bool_or_expr3233);
            	    bool_and_expr263=bool_and_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_and_expr263.getTree());

            	    }
            	    break;

            	default :
            	    break loop113;
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

        Token NL265=null;
        Token NL267=null;
        babel17Parser.p_bool_and_expr_return p_bool_and_expr264 = null;

        babel17Parser.token_OR_return token_OR266 = null;

        babel17Parser.p_bool_and_expr_return p_bool_and_expr268 = null;


        CommonTree NL265_tree=null;
        CommonTree NL267_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:529:2: ( p_bool_and_expr ( ( NL )? token_OR ( NL )? p_bool_and_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:529:4: p_bool_and_expr ( ( NL )? token_OR ( NL )? p_bool_and_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_bool_and_expr_in_p_bool_or_expr3245);
            p_bool_and_expr264=p_bool_and_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_bool_and_expr264.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:529:20: ( ( NL )? token_OR ( NL )? p_bool_and_expr )*
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
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:529:21: ( NL )? token_OR ( NL )? p_bool_and_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:529:23: ( NL )?
            	    int alt114=2;
            	    int LA114_0 = input.LA(1);

            	    if ( (LA114_0==NL) ) {
            	        alt114=1;
            	    }
            	    switch (alt114) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:529:23: NL
            	            {
            	            NL265=(Token)match(input,NL,FOLLOW_NL_in_p_bool_or_expr3248); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_token_OR_in_p_bool_or_expr3252);
            	    token_OR266=token_OR();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(token_OR266.getTree(), root_0);
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:529:38: ( NL )?
            	    int alt115=2;
            	    int LA115_0 = input.LA(1);

            	    if ( (LA115_0==NL) ) {
            	        alt115=1;
            	    }
            	    switch (alt115) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:529:38: NL
            	            {
            	            NL267=(Token)match(input,NL,FOLLOW_NL_in_p_bool_or_expr3255); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_bool_and_expr_in_p_bool_or_expr3259);
            	    p_bool_and_expr268=p_bool_and_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_bool_and_expr268.getTree());

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

        Token NL270=null;
        Token NL272=null;
        babel17Parser.bool_not_expr_return bool_not_expr269 = null;

        babel17Parser.token_AND_return token_AND271 = null;

        babel17Parser.bool_not_expr_return bool_not_expr273 = null;


        CommonTree NL270_tree=null;
        CommonTree NL272_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:532:2: ( bool_not_expr ( ( NL )? token_AND ( NL )? bool_not_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:532:4: bool_not_expr ( ( NL )? token_AND ( NL )? bool_not_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bool_not_expr_in_bool_and_expr3271);
            bool_not_expr269=bool_not_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_not_expr269.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:532:18: ( ( NL )? token_AND ( NL )? bool_not_expr )*
            loop119:
            do {
                int alt119=2;
                int LA119_0 = input.LA(1);

                if ( (LA119_0==NL) ) {
                    int LA119_1 = input.LA(2);

                    if ( (LA119_1==A_AND||LA119_1==U_AND) ) {
                        alt119=1;
                    }


                }
                else if ( (LA119_0==A_AND||LA119_0==U_AND) ) {
                    alt119=1;
                }


                switch (alt119) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:532:19: ( NL )? token_AND ( NL )? bool_not_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:532:21: ( NL )?
            	    int alt117=2;
            	    int LA117_0 = input.LA(1);

            	    if ( (LA117_0==NL) ) {
            	        alt117=1;
            	    }
            	    switch (alt117) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:532:21: NL
            	            {
            	            NL270=(Token)match(input,NL,FOLLOW_NL_in_bool_and_expr3274); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_token_AND_in_bool_and_expr3278);
            	    token_AND271=token_AND();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(token_AND271.getTree(), root_0);
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:532:37: ( NL )?
            	    int alt118=2;
            	    int LA118_0 = input.LA(1);

            	    if ( (LA118_0==NL) ) {
            	        alt118=1;
            	    }
            	    switch (alt118) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:532:37: NL
            	            {
            	            NL272=(Token)match(input,NL,FOLLOW_NL_in_bool_and_expr3281); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_bool_not_expr_in_bool_and_expr3285);
            	    bool_not_expr273=bool_not_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_not_expr273.getTree());

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

        Token NL275=null;
        Token NL277=null;
        babel17Parser.p_bool_not_expr_return p_bool_not_expr274 = null;

        babel17Parser.token_AND_return token_AND276 = null;

        babel17Parser.p_bool_not_expr_return p_bool_not_expr278 = null;


        CommonTree NL275_tree=null;
        CommonTree NL277_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:535:2: ( p_bool_not_expr ( ( NL )? token_AND ( NL )? p_bool_not_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:535:4: p_bool_not_expr ( ( NL )? token_AND ( NL )? p_bool_not_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_bool_not_expr_in_p_bool_and_expr3297);
            p_bool_not_expr274=p_bool_not_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_bool_not_expr274.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:535:20: ( ( NL )? token_AND ( NL )? p_bool_not_expr )*
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
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:535:21: ( NL )? token_AND ( NL )? p_bool_not_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:535:23: ( NL )?
            	    int alt120=2;
            	    int LA120_0 = input.LA(1);

            	    if ( (LA120_0==NL) ) {
            	        alt120=1;
            	    }
            	    switch (alt120) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:535:23: NL
            	            {
            	            NL275=(Token)match(input,NL,FOLLOW_NL_in_p_bool_and_expr3300); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_token_AND_in_p_bool_and_expr3304);
            	    token_AND276=token_AND();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(token_AND276.getTree(), root_0);
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:535:39: ( NL )?
            	    int alt121=2;
            	    int LA121_0 = input.LA(1);

            	    if ( (LA121_0==NL) ) {
            	        alt121=1;
            	    }
            	    switch (alt121) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:535:39: NL
            	            {
            	            NL277=(Token)match(input,NL,FOLLOW_NL_in_p_bool_and_expr3307); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_bool_not_expr_in_p_bool_and_expr3311);
            	    p_bool_not_expr278=p_bool_not_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_bool_not_expr278.getTree());

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

        Token NL280=null;
        babel17Parser.token_NOT_return token_NOT279 = null;

        babel17Parser.bool_not_expr_return bool_not_expr281 = null;

        babel17Parser.rel_expr_return rel_expr282 = null;


        CommonTree NL280_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:539:2: ( token_NOT ( NL )? bool_not_expr | rel_expr )
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==A_NOT||LA124_0==U_NOT) ) {
                alt124=1;
            }
            else if ( (LA124_0==L_begin||(LA124_0>=L_with && LA124_0<=L_if)||(LA124_0>=L_while && LA124_0<=L_for)||LA124_0==L_match||(LA124_0>=A_infinity && LA124_0<=U_infinity)||(LA124_0>=L_true && LA124_0<=L_this)||LA124_0==L_nil||LA124_0==MINUS||(LA124_0>=Constr && LA124_0<=Num)||(LA124_0>=String && LA124_0<=ROUND_BRACKET_OPEN)||LA124_0==SQUARE_BRACKET_OPEN||LA124_0==CURLY_BRACKET_OPEN) ) {
                alt124=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 124, 0, input);

                throw nvae;
            }
            switch (alt124) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:539:4: token_NOT ( NL )? bool_not_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_NOT_in_bool_not_expr3323);
                    token_NOT279=token_NOT();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(token_NOT279.getTree(), root_0);
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:539:17: ( NL )?
                    int alt123=2;
                    int LA123_0 = input.LA(1);

                    if ( (LA123_0==NL) ) {
                        alt123=1;
                    }
                    switch (alt123) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:539:17: NL
                            {
                            NL280=(Token)match(input,NL,FOLLOW_NL_in_bool_not_expr3326); if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_bool_not_expr_in_bool_not_expr3330);
                    bool_not_expr281=bool_not_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_not_expr281.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:540:4: rel_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_rel_expr_in_bool_not_expr3335);
                    rel_expr282=rel_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rel_expr282.getTree());

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

        Token NL284=null;
        babel17Parser.token_NOT_return token_NOT283 = null;

        babel17Parser.p_bool_not_expr_return p_bool_not_expr285 = null;

        babel17Parser.p_rel_expr_return p_rel_expr286 = null;


        CommonTree NL284_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:543:2: ( token_NOT ( NL )? p_bool_not_expr | p_rel_expr )
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==A_NOT||LA126_0==U_NOT) ) {
                alt126=1;
            }
            else if ( (LA126_0==L_begin||(LA126_0>=L_with && LA126_0<=L_if)||(LA126_0>=L_while && LA126_0<=L_for)||LA126_0==L_match||(LA126_0>=A_infinity && LA126_0<=U_infinity)||(LA126_0>=L_true && LA126_0<=L_this)||LA126_0==L_nil||LA126_0==MINUS||(LA126_0>=Constr && LA126_0<=Num)||(LA126_0>=String && LA126_0<=ROUND_BRACKET_OPEN)||LA126_0==SQUARE_BRACKET_OPEN||LA126_0==CURLY_BRACKET_OPEN) ) {
                alt126=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 126, 0, input);

                throw nvae;
            }
            switch (alt126) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:543:4: token_NOT ( NL )? p_bool_not_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_NOT_in_p_bool_not_expr3346);
                    token_NOT283=token_NOT();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(token_NOT283.getTree(), root_0);
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:543:17: ( NL )?
                    int alt125=2;
                    int LA125_0 = input.LA(1);

                    if ( (LA125_0==NL) ) {
                        alt125=1;
                    }
                    switch (alt125) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:543:17: NL
                            {
                            NL284=(Token)match(input,NL,FOLLOW_NL_in_p_bool_not_expr3349); if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_p_bool_not_expr_in_p_bool_not_expr3353);
                    p_bool_not_expr285=p_bool_not_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_bool_not_expr285.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:544:4: p_rel_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_p_rel_expr_in_p_bool_not_expr3358);
                    p_rel_expr286=p_rel_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_rel_expr286.getTree());

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

        Token NL288=null;
        Token NL290=null;
        babel17Parser.arith_expr_return arith_expr287 = null;

        babel17Parser.rel_op_return rel_op289 = null;

        babel17Parser.arith_expr_return arith_expr291 = null;


        CommonTree NL288_tree=null;
        CommonTree NL290_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_arith_expr=new RewriteRuleSubtreeStream(adaptor,"rule arith_expr");
        RewriteRuleSubtreeStream stream_rel_op=new RewriteRuleSubtreeStream(adaptor,"rule rel_op");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:547:2: ( arith_expr ( ( NL )? rel_op ( NL )? arith_expr )* -> ^( COMPARE arith_expr ( rel_op arith_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:547:4: arith_expr ( ( NL )? rel_op ( NL )? arith_expr )*
            {
            pushFollow(FOLLOW_arith_expr_in_rel_expr3367);
            arith_expr287=arith_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_arith_expr.add(arith_expr287.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:547:15: ( ( NL )? rel_op ( NL )? arith_expr )*
            loop129:
            do {
                int alt129=2;
                int LA129_0 = input.LA(1);

                if ( (LA129_0==NL) ) {
                    int LA129_1 = input.LA(2);

                    if ( ((LA129_1>=A_EQUAL && LA129_1<=UNRELATED)) ) {
                        alt129=1;
                    }


                }
                else if ( ((LA129_0>=A_EQUAL && LA129_0<=UNRELATED)) ) {
                    alt129=1;
                }


                switch (alt129) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:547:16: ( NL )? rel_op ( NL )? arith_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:547:16: ( NL )?
            	    int alt127=2;
            	    int LA127_0 = input.LA(1);

            	    if ( (LA127_0==NL) ) {
            	        alt127=1;
            	    }
            	    switch (alt127) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:547:16: NL
            	            {
            	            NL288=(Token)match(input,NL,FOLLOW_NL_in_rel_expr3370); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL288);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_rel_op_in_rel_expr3373);
            	    rel_op289=rel_op();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_rel_op.add(rel_op289.getTree());
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:547:27: ( NL )?
            	    int alt128=2;
            	    int LA128_0 = input.LA(1);

            	    if ( (LA128_0==NL) ) {
            	        alt128=1;
            	    }
            	    switch (alt128) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:547:27: NL
            	            {
            	            NL290=(Token)match(input,NL,FOLLOW_NL_in_rel_expr3375); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL290);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_arith_expr_in_rel_expr3378);
            	    arith_expr291=arith_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_arith_expr.add(arith_expr291.getTree());

            	    }
            	    break;

            	default :
            	    break loop129;
                }
            } while (true);



            // AST REWRITE
            // elements: rel_op, arith_expr, arith_expr
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:549:1: p_rel_expr : p_arith_expr ( ( NL )? rel_op ( NL )? p_arith_expr )* -> ^( COMPARE p_arith_expr ( rel_op p_arith_expr )* ) ;
    public final babel17Parser.p_rel_expr_return p_rel_expr() throws RecognitionException {
        babel17Parser.p_rel_expr_return retval = new babel17Parser.p_rel_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL293=null;
        Token NL295=null;
        babel17Parser.p_arith_expr_return p_arith_expr292 = null;

        babel17Parser.rel_op_return rel_op294 = null;

        babel17Parser.p_arith_expr_return p_arith_expr296 = null;


        CommonTree NL293_tree=null;
        CommonTree NL295_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_p_arith_expr=new RewriteRuleSubtreeStream(adaptor,"rule p_arith_expr");
        RewriteRuleSubtreeStream stream_rel_op=new RewriteRuleSubtreeStream(adaptor,"rule rel_op");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:550:2: ( p_arith_expr ( ( NL )? rel_op ( NL )? p_arith_expr )* -> ^( COMPARE p_arith_expr ( rel_op p_arith_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:550:4: p_arith_expr ( ( NL )? rel_op ( NL )? p_arith_expr )*
            {
            pushFollow(FOLLOW_p_arith_expr_in_p_rel_expr3405);
            p_arith_expr292=p_arith_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_p_arith_expr.add(p_arith_expr292.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:550:17: ( ( NL )? rel_op ( NL )? p_arith_expr )*
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
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:550:18: ( NL )? rel_op ( NL )? p_arith_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:550:18: ( NL )?
            	    int alt130=2;
            	    int LA130_0 = input.LA(1);

            	    if ( (LA130_0==NL) ) {
            	        alt130=1;
            	    }
            	    switch (alt130) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:550:18: NL
            	            {
            	            NL293=(Token)match(input,NL,FOLLOW_NL_in_p_rel_expr3408); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL293);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_rel_op_in_p_rel_expr3411);
            	    rel_op294=rel_op();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_rel_op.add(rel_op294.getTree());
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:550:29: ( NL )?
            	    int alt131=2;
            	    int LA131_0 = input.LA(1);

            	    if ( (LA131_0==NL) ) {
            	        alt131=1;
            	    }
            	    switch (alt131) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:550:29: NL
            	            {
            	            NL295=(Token)match(input,NL,FOLLOW_NL_in_p_rel_expr3413); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL295);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_arith_expr_in_p_rel_expr3416);
            	    p_arith_expr296=p_arith_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_p_arith_expr.add(p_arith_expr296.getTree());

            	    }
            	    break;

            	default :
            	    break loop132;
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

        Token UNRELATED299=null;
        Token GREATER300=null;
        Token LESS302=null;
        babel17Parser.token_EQUAL_return token_EQUAL297 = null;

        babel17Parser.token_NOT_EQUAL_return token_NOT_EQUAL298 = null;

        babel17Parser.token_GREATER_EQ_return token_GREATER_EQ301 = null;

        babel17Parser.token_LESS_EQ_return token_LESS_EQ303 = null;


        CommonTree UNRELATED299_tree=null;
        CommonTree GREATER300_tree=null;
        CommonTree LESS302_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:553:8: ( token_EQUAL | token_NOT_EQUAL | UNRELATED | GREATER | token_GREATER_EQ | LESS | token_LESS_EQ )
            int alt133=7;
            switch ( input.LA(1) ) {
            case A_EQUAL:
            case U_EQUAL:
                {
                alt133=1;
                }
                break;
            case A_NOT_EQUAL:
            case U_NOT_EQUAL:
                {
                alt133=2;
                }
                break;
            case UNRELATED:
                {
                alt133=3;
                }
                break;
            case GREATER:
                {
                alt133=4;
                }
                break;
            case A_GREATER_EQ:
            case U_GREATER_EQ:
                {
                alt133=5;
                }
                break;
            case LESS:
                {
                alt133=6;
                }
                break;
            case A_LESS_EQ:
            case U_LESS_EQ:
                {
                alt133=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 133, 0, input);

                throw nvae;
            }

            switch (alt133) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:553:10: token_EQUAL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_EQUAL_in_rel_op3442);
                    token_EQUAL297=token_EQUAL();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, token_EQUAL297.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:553:24: token_NOT_EQUAL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_NOT_EQUAL_in_rel_op3446);
                    token_NOT_EQUAL298=token_NOT_EQUAL();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, token_NOT_EQUAL298.getTree());

                    }
                    break;
                case 3 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:553:42: UNRELATED
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    UNRELATED299=(Token)match(input,UNRELATED,FOLLOW_UNRELATED_in_rel_op3450); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UNRELATED299_tree = (CommonTree)adaptor.create(UNRELATED299);
                    adaptor.addChild(root_0, UNRELATED299_tree);
                    }

                    }
                    break;
                case 4 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:553:54: GREATER
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    GREATER300=(Token)match(input,GREATER,FOLLOW_GREATER_in_rel_op3454); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    GREATER300_tree = (CommonTree)adaptor.create(GREATER300);
                    adaptor.addChild(root_0, GREATER300_tree);
                    }

                    }
                    break;
                case 5 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:553:64: token_GREATER_EQ
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_GREATER_EQ_in_rel_op3458);
                    token_GREATER_EQ301=token_GREATER_EQ();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, token_GREATER_EQ301.getTree());

                    }
                    break;
                case 6 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:553:83: LESS
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    LESS302=(Token)match(input,LESS,FOLLOW_LESS_in_rel_op3462); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LESS302_tree = (CommonTree)adaptor.create(LESS302);
                    adaptor.addChild(root_0, LESS302_tree);
                    }

                    }
                    break;
                case 7 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:553:90: token_LESS_EQ
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_LESS_EQ_in_rel_op3466);
                    token_LESS_EQ303=token_LESS_EQ();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, token_LESS_EQ303.getTree());

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

        babel17Parser.plusplus_expr_return plusplus_expr304 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:557:2: ( plusplus_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:557:4: plusplus_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_plusplus_expr_in_arith_expr3478);
            plusplus_expr304=plusplus_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, plusplus_expr304.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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

        babel17Parser.p_plusplus_expr_return p_plusplus_expr305 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:561:2: ( p_plusplus_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:561:4: p_plusplus_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_plusplus_expr_in_p_arith_expr3488);
            p_plusplus_expr305=p_plusplus_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_plusplus_expr305.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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

        Token NL307=null;
        Token PLUSPLUS308=null;
        Token MINUSMINUS309=null;
        Token NL310=null;
        babel17Parser.timestimes_expr_return timestimes_expr306 = null;

        babel17Parser.timestimes_expr_return timestimes_expr311 = null;


        CommonTree NL307_tree=null;
        CommonTree PLUSPLUS308_tree=null;
        CommonTree MINUSMINUS309_tree=null;
        CommonTree NL310_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:564:2: ( timestimes_expr ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? timestimes_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:564:4: timestimes_expr ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? timestimes_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_timestimes_expr_in_plusplus_expr3498);
            timestimes_expr306=timestimes_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, timestimes_expr306.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:564:20: ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? timestimes_expr )*
            loop137:
            do {
                int alt137=2;
                int LA137_0 = input.LA(1);

                if ( (LA137_0==NL) ) {
                    int LA137_1 = input.LA(2);

                    if ( ((LA137_1>=PLUSPLUS && LA137_1<=MINUSMINUS)) ) {
                        alt137=1;
                    }


                }
                else if ( ((LA137_0>=PLUSPLUS && LA137_0<=MINUSMINUS)) ) {
                    alt137=1;
                }


                switch (alt137) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:564:21: ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? timestimes_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:564:23: ( NL )?
            	    int alt134=2;
            	    int LA134_0 = input.LA(1);

            	    if ( (LA134_0==NL) ) {
            	        alt134=1;
            	    }
            	    switch (alt134) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:564:23: NL
            	            {
            	            NL307=(Token)match(input,NL,FOLLOW_NL_in_plusplus_expr3501); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:564:26: ( PLUSPLUS | MINUSMINUS )
            	    int alt135=2;
            	    int LA135_0 = input.LA(1);

            	    if ( (LA135_0==PLUSPLUS) ) {
            	        alt135=1;
            	    }
            	    else if ( (LA135_0==MINUSMINUS) ) {
            	        alt135=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 135, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt135) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:564:27: PLUSPLUS
            	            {
            	            PLUSPLUS308=(Token)match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_plusplus_expr3506); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PLUSPLUS308_tree = (CommonTree)adaptor.create(PLUSPLUS308);
            	            root_0 = (CommonTree)adaptor.becomeRoot(PLUSPLUS308_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:564:37: MINUSMINUS
            	            {
            	            MINUSMINUS309=(Token)match(input,MINUSMINUS,FOLLOW_MINUSMINUS_in_plusplus_expr3509); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            MINUSMINUS309_tree = (CommonTree)adaptor.create(MINUSMINUS309);
            	            root_0 = (CommonTree)adaptor.becomeRoot(MINUSMINUS309_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:564:52: ( NL )?
            	    int alt136=2;
            	    int LA136_0 = input.LA(1);

            	    if ( (LA136_0==NL) ) {
            	        alt136=1;
            	    }
            	    switch (alt136) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:564:52: NL
            	            {
            	            NL310=(Token)match(input,NL,FOLLOW_NL_in_plusplus_expr3513); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_timestimes_expr_in_plusplus_expr3517);
            	    timestimes_expr311=timestimes_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, timestimes_expr311.getTree());

            	    }
            	    break;

            	default :
            	    break loop137;
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

        Token NL313=null;
        Token PLUSPLUS314=null;
        Token MINUSMINUS315=null;
        Token NL316=null;
        babel17Parser.p_timestimes_expr_return p_timestimes_expr312 = null;

        babel17Parser.p_timestimes_expr_return p_timestimes_expr317 = null;


        CommonTree NL313_tree=null;
        CommonTree PLUSPLUS314_tree=null;
        CommonTree MINUSMINUS315_tree=null;
        CommonTree NL316_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:567:2: ( p_timestimes_expr ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? p_timestimes_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:567:4: p_timestimes_expr ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? p_timestimes_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_timestimes_expr_in_p_plusplus_expr3529);
            p_timestimes_expr312=p_timestimes_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_timestimes_expr312.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:567:22: ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? p_timestimes_expr )*
            loop141:
            do {
                int alt141=2;
                int LA141_0 = input.LA(1);

                if ( (LA141_0==NL) ) {
                    int LA141_1 = input.LA(2);

                    if ( ((LA141_1>=PLUSPLUS && LA141_1<=MINUSMINUS)) ) {
                        alt141=1;
                    }


                }
                else if ( ((LA141_0>=PLUSPLUS && LA141_0<=MINUSMINUS)) ) {
                    alt141=1;
                }


                switch (alt141) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:567:23: ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? p_timestimes_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:567:25: ( NL )?
            	    int alt138=2;
            	    int LA138_0 = input.LA(1);

            	    if ( (LA138_0==NL) ) {
            	        alt138=1;
            	    }
            	    switch (alt138) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:567:25: NL
            	            {
            	            NL313=(Token)match(input,NL,FOLLOW_NL_in_p_plusplus_expr3532); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:567:28: ( PLUSPLUS | MINUSMINUS )
            	    int alt139=2;
            	    int LA139_0 = input.LA(1);

            	    if ( (LA139_0==PLUSPLUS) ) {
            	        alt139=1;
            	    }
            	    else if ( (LA139_0==MINUSMINUS) ) {
            	        alt139=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 139, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt139) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:567:29: PLUSPLUS
            	            {
            	            PLUSPLUS314=(Token)match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_p_plusplus_expr3537); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PLUSPLUS314_tree = (CommonTree)adaptor.create(PLUSPLUS314);
            	            root_0 = (CommonTree)adaptor.becomeRoot(PLUSPLUS314_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:567:39: MINUSMINUS
            	            {
            	            MINUSMINUS315=(Token)match(input,MINUSMINUS,FOLLOW_MINUSMINUS_in_p_plusplus_expr3540); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            MINUSMINUS315_tree = (CommonTree)adaptor.create(MINUSMINUS315);
            	            root_0 = (CommonTree)adaptor.becomeRoot(MINUSMINUS315_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:567:54: ( NL )?
            	    int alt140=2;
            	    int LA140_0 = input.LA(1);

            	    if ( (LA140_0==NL) ) {
            	        alt140=1;
            	    }
            	    switch (alt140) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:567:54: NL
            	            {
            	            NL316=(Token)match(input,NL,FOLLOW_NL_in_p_plusplus_expr3544); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_timestimes_expr_in_p_plusplus_expr3548);
            	    p_timestimes_expr317=p_timestimes_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_timestimes_expr317.getTree());

            	    }
            	    break;

            	default :
            	    break loop141;
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

        Token NL319=null;
        Token TIMESTIMES320=null;
        Token NL321=null;
        babel17Parser.simple_expr_return simple_expr318 = null;

        babel17Parser.simple_expr_return simple_expr322 = null;


        CommonTree NL319_tree=null;
        CommonTree TIMESTIMES320_tree=null;
        CommonTree NL321_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:571:2: ( simple_expr ( ( NL )? ( TIMESTIMES ) ( NL )? simple_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:571:4: simple_expr ( ( NL )? ( TIMESTIMES ) ( NL )? simple_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_simple_expr_in_timestimes_expr3560);
            simple_expr318=simple_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, simple_expr318.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:571:16: ( ( NL )? ( TIMESTIMES ) ( NL )? simple_expr )*
            loop144:
            do {
                int alt144=2;
                int LA144_0 = input.LA(1);

                if ( (LA144_0==NL) ) {
                    int LA144_1 = input.LA(2);

                    if ( (LA144_1==TIMESTIMES) ) {
                        alt144=1;
                    }


                }
                else if ( (LA144_0==TIMESTIMES) ) {
                    alt144=1;
                }


                switch (alt144) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:571:17: ( NL )? ( TIMESTIMES ) ( NL )? simple_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:571:19: ( NL )?
            	    int alt142=2;
            	    int LA142_0 = input.LA(1);

            	    if ( (LA142_0==NL) ) {
            	        alt142=1;
            	    }
            	    switch (alt142) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:571:19: NL
            	            {
            	            NL319=(Token)match(input,NL,FOLLOW_NL_in_timestimes_expr3563); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:571:22: ( TIMESTIMES )
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:571:23: TIMESTIMES
            	    {
            	    TIMESTIMES320=(Token)match(input,TIMESTIMES,FOLLOW_TIMESTIMES_in_timestimes_expr3568); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    TIMESTIMES320_tree = (CommonTree)adaptor.create(TIMESTIMES320);
            	    root_0 = (CommonTree)adaptor.becomeRoot(TIMESTIMES320_tree, root_0);
            	    }

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:571:38: ( NL )?
            	    int alt143=2;
            	    int LA143_0 = input.LA(1);

            	    if ( (LA143_0==NL) ) {
            	        alt143=1;
            	    }
            	    switch (alt143) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:571:38: NL
            	            {
            	            NL321=(Token)match(input,NL,FOLLOW_NL_in_timestimes_expr3572); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_simple_expr_in_timestimes_expr3576);
            	    simple_expr322=simple_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, simple_expr322.getTree());

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

        Token NL324=null;
        Token TIMESTIMES325=null;
        Token NL326=null;
        babel17Parser.p_simple_expr_return p_simple_expr323 = null;

        babel17Parser.p_simple_expr_return p_simple_expr327 = null;


        CommonTree NL324_tree=null;
        CommonTree TIMESTIMES325_tree=null;
        CommonTree NL326_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:574:2: ( p_simple_expr ( ( NL )? ( TIMESTIMES ) ( NL )? p_simple_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:574:4: p_simple_expr ( ( NL )? ( TIMESTIMES ) ( NL )? p_simple_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_simple_expr_in_p_timestimes_expr3589);
            p_simple_expr323=p_simple_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_simple_expr323.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:574:18: ( ( NL )? ( TIMESTIMES ) ( NL )? p_simple_expr )*
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
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:574:19: ( NL )? ( TIMESTIMES ) ( NL )? p_simple_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:574:21: ( NL )?
            	    int alt145=2;
            	    int LA145_0 = input.LA(1);

            	    if ( (LA145_0==NL) ) {
            	        alt145=1;
            	    }
            	    switch (alt145) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:574:21: NL
            	            {
            	            NL324=(Token)match(input,NL,FOLLOW_NL_in_p_timestimes_expr3592); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:574:24: ( TIMESTIMES )
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:574:25: TIMESTIMES
            	    {
            	    TIMESTIMES325=(Token)match(input,TIMESTIMES,FOLLOW_TIMESTIMES_in_p_timestimes_expr3597); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    TIMESTIMES325_tree = (CommonTree)adaptor.create(TIMESTIMES325);
            	    root_0 = (CommonTree)adaptor.becomeRoot(TIMESTIMES325_tree, root_0);
            	    }

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:574:40: ( NL )?
            	    int alt146=2;
            	    int LA146_0 = input.LA(1);

            	    if ( (LA146_0==NL) ) {
            	        alt146=1;
            	    }
            	    switch (alt146) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:574:40: NL
            	            {
            	            NL326=(Token)match(input,NL,FOLLOW_NL_in_p_timestimes_expr3601); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_simple_expr_in_p_timestimes_expr3605);
            	    p_simple_expr327=p_simple_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_simple_expr327.getTree());

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

        babel17Parser.cons_expr_return cons_expr328 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:577:2: ( cons_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:577:4: cons_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_cons_expr_in_simple_expr3616);
            cons_expr328=cons_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, cons_expr328.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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

        babel17Parser.p_cons_expr_return p_cons_expr329 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:580:2: ( p_cons_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:580:4: p_cons_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_cons_expr_in_p_simple_expr3625);
            p_cons_expr329=p_cons_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_cons_expr329.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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

        Token NL331=null;
        Token NL333=null;
        babel17Parser.to_expr_return to_expr330 = null;

        babel17Parser.token_DOUBLE_COLON_return token_DOUBLE_COLON332 = null;

        babel17Parser.to_expr_return to_expr334 = null;


        CommonTree NL331_tree=null;
        CommonTree NL333_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_token_DOUBLE_COLON=new RewriteRuleSubtreeStream(adaptor,"rule token_DOUBLE_COLON");
        RewriteRuleSubtreeStream stream_to_expr=new RewriteRuleSubtreeStream(adaptor,"rule to_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:583:2: ( to_expr ( ( NL )? token_DOUBLE_COLON ( NL )? to_expr )* -> ^( LIST_CONS ( to_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:583:4: to_expr ( ( NL )? token_DOUBLE_COLON ( NL )? to_expr )*
            {
            pushFollow(FOLLOW_to_expr_in_cons_expr3634);
            to_expr330=to_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_to_expr.add(to_expr330.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:583:12: ( ( NL )? token_DOUBLE_COLON ( NL )? to_expr )*
            loop150:
            do {
                int alt150=2;
                int LA150_0 = input.LA(1);

                if ( (LA150_0==NL) ) {
                    int LA150_1 = input.LA(2);

                    if ( ((LA150_1>=A_DOUBLE_COLON && LA150_1<=U_DOUBLE_COLON)) ) {
                        alt150=1;
                    }


                }
                else if ( ((LA150_0>=A_DOUBLE_COLON && LA150_0<=U_DOUBLE_COLON)) ) {
                    alt150=1;
                }


                switch (alt150) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:583:13: ( NL )? token_DOUBLE_COLON ( NL )? to_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:583:13: ( NL )?
            	    int alt148=2;
            	    int LA148_0 = input.LA(1);

            	    if ( (LA148_0==NL) ) {
            	        alt148=1;
            	    }
            	    switch (alt148) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:583:13: NL
            	            {
            	            NL331=(Token)match(input,NL,FOLLOW_NL_in_cons_expr3637); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL331);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_token_DOUBLE_COLON_in_cons_expr3640);
            	    token_DOUBLE_COLON332=token_DOUBLE_COLON();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_token_DOUBLE_COLON.add(token_DOUBLE_COLON332.getTree());
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:583:36: ( NL )?
            	    int alt149=2;
            	    int LA149_0 = input.LA(1);

            	    if ( (LA149_0==NL) ) {
            	        alt149=1;
            	    }
            	    switch (alt149) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:583:36: NL
            	            {
            	            NL333=(Token)match(input,NL,FOLLOW_NL_in_cons_expr3642); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL333);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_to_expr_in_cons_expr3645);
            	    to_expr334=to_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_to_expr.add(to_expr334.getTree());

            	    }
            	    break;

            	default :
            	    break loop150;
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

        Token NL336=null;
        Token NL338=null;
        babel17Parser.p_to_expr_return p_to_expr335 = null;

        babel17Parser.token_DOUBLE_COLON_return token_DOUBLE_COLON337 = null;

        babel17Parser.p_to_expr_return p_to_expr339 = null;


        CommonTree NL336_tree=null;
        CommonTree NL338_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_p_to_expr=new RewriteRuleSubtreeStream(adaptor,"rule p_to_expr");
        RewriteRuleSubtreeStream stream_token_DOUBLE_COLON=new RewriteRuleSubtreeStream(adaptor,"rule token_DOUBLE_COLON");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:586:2: ( p_to_expr ( ( NL )? token_DOUBLE_COLON ( NL )? p_to_expr )* -> ^( LIST_CONS ( p_to_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:586:4: p_to_expr ( ( NL )? token_DOUBLE_COLON ( NL )? p_to_expr )*
            {
            pushFollow(FOLLOW_p_to_expr_in_p_cons_expr3665);
            p_to_expr335=p_to_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_p_to_expr.add(p_to_expr335.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:586:14: ( ( NL )? token_DOUBLE_COLON ( NL )? p_to_expr )*
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
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:586:15: ( NL )? token_DOUBLE_COLON ( NL )? p_to_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:586:15: ( NL )?
            	    int alt151=2;
            	    int LA151_0 = input.LA(1);

            	    if ( (LA151_0==NL) ) {
            	        alt151=1;
            	    }
            	    switch (alt151) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:586:15: NL
            	            {
            	            NL336=(Token)match(input,NL,FOLLOW_NL_in_p_cons_expr3668); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL336);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_token_DOUBLE_COLON_in_p_cons_expr3671);
            	    token_DOUBLE_COLON337=token_DOUBLE_COLON();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_token_DOUBLE_COLON.add(token_DOUBLE_COLON337.getTree());
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:586:38: ( NL )?
            	    int alt152=2;
            	    int LA152_0 = input.LA(1);

            	    if ( (LA152_0==NL) ) {
            	        alt152=1;
            	    }
            	    switch (alt152) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:586:38: NL
            	            {
            	            NL338=(Token)match(input,NL,FOLLOW_NL_in_p_cons_expr3673); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL338);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_to_expr_in_p_cons_expr3676);
            	    p_to_expr339=p_to_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_p_to_expr.add(p_to_expr339.getTree());

            	    }
            	    break;

            	default :
            	    break loop153;
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

        Token NL341=null;
        Token L_to342=null;
        Token L_downto343=null;
        Token NL344=null;
        babel17Parser.arith_plus_expr_return arith_plus_expr340 = null;

        babel17Parser.arith_plus_expr_return arith_plus_expr345 = null;


        CommonTree NL341_tree=null;
        CommonTree L_to342_tree=null;
        CommonTree L_downto343_tree=null;
        CommonTree NL344_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:589:9: ( arith_plus_expr ( ( NL )? ( L_to | L_downto ) ( NL )? arith_plus_expr )? )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:589:11: arith_plus_expr ( ( NL )? ( L_to | L_downto ) ( NL )? arith_plus_expr )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_arith_plus_expr_in_to_expr3696);
            arith_plus_expr340=arith_plus_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, arith_plus_expr340.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:589:27: ( ( NL )? ( L_to | L_downto ) ( NL )? arith_plus_expr )?
            int alt157=2;
            int LA157_0 = input.LA(1);

            if ( (LA157_0==NL) ) {
                int LA157_1 = input.LA(2);

                if ( ((LA157_1>=L_to && LA157_1<=L_downto)) ) {
                    alt157=1;
                }
            }
            else if ( ((LA157_0>=L_to && LA157_0<=L_downto)) ) {
                alt157=1;
            }
            switch (alt157) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:589:28: ( NL )? ( L_to | L_downto ) ( NL )? arith_plus_expr
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:589:30: ( NL )?
                    int alt154=2;
                    int LA154_0 = input.LA(1);

                    if ( (LA154_0==NL) ) {
                        alt154=1;
                    }
                    switch (alt154) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:589:30: NL
                            {
                            NL341=(Token)match(input,NL,FOLLOW_NL_in_to_expr3699); if (state.failed) return retval;

                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:589:33: ( L_to | L_downto )
                    int alt155=2;
                    int LA155_0 = input.LA(1);

                    if ( (LA155_0==L_to) ) {
                        alt155=1;
                    }
                    else if ( (LA155_0==L_downto) ) {
                        alt155=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 155, 0, input);

                        throw nvae;
                    }
                    switch (alt155) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:589:34: L_to
                            {
                            L_to342=(Token)match(input,L_to,FOLLOW_L_to_in_to_expr3704); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            L_to342_tree = (CommonTree)adaptor.create(L_to342);
                            root_0 = (CommonTree)adaptor.becomeRoot(L_to342_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:589:41: L_downto
                            {
                            L_downto343=(Token)match(input,L_downto,FOLLOW_L_downto_in_to_expr3708); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            L_downto343_tree = (CommonTree)adaptor.create(L_downto343);
                            root_0 = (CommonTree)adaptor.becomeRoot(L_downto343_tree, root_0);
                            }

                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:589:54: ( NL )?
                    int alt156=2;
                    int LA156_0 = input.LA(1);

                    if ( (LA156_0==NL) ) {
                        alt156=1;
                    }
                    switch (alt156) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:589:54: NL
                            {
                            NL344=(Token)match(input,NL,FOLLOW_NL_in_to_expr3712); if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_arith_plus_expr_in_to_expr3716);
                    arith_plus_expr345=arith_plus_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arith_plus_expr345.getTree());

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

        Token NL347=null;
        Token L_to348=null;
        Token L_downto349=null;
        Token NL350=null;
        babel17Parser.p_arith_plus_expr_return p_arith_plus_expr346 = null;

        babel17Parser.p_arith_plus_expr_return p_arith_plus_expr351 = null;


        CommonTree NL347_tree=null;
        CommonTree L_to348_tree=null;
        CommonTree L_downto349_tree=null;
        CommonTree NL350_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:592:2: ( p_arith_plus_expr ( ( NL )? ( L_to | L_downto ) ( NL )? p_arith_plus_expr )? )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:592:4: p_arith_plus_expr ( ( NL )? ( L_to | L_downto ) ( NL )? p_arith_plus_expr )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_arith_plus_expr_in_p_to_expr3729);
            p_arith_plus_expr346=p_arith_plus_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_arith_plus_expr346.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:592:22: ( ( NL )? ( L_to | L_downto ) ( NL )? p_arith_plus_expr )?
            int alt161=2;
            int LA161_0 = input.LA(1);

            if ( (LA161_0==NL) ) {
                int LA161_1 = input.LA(2);

                if ( ((LA161_1>=L_to && LA161_1<=L_downto)) ) {
                    alt161=1;
                }
            }
            else if ( ((LA161_0>=L_to && LA161_0<=L_downto)) ) {
                alt161=1;
            }
            switch (alt161) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:592:23: ( NL )? ( L_to | L_downto ) ( NL )? p_arith_plus_expr
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:592:25: ( NL )?
                    int alt158=2;
                    int LA158_0 = input.LA(1);

                    if ( (LA158_0==NL) ) {
                        alt158=1;
                    }
                    switch (alt158) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:592:25: NL
                            {
                            NL347=(Token)match(input,NL,FOLLOW_NL_in_p_to_expr3732); if (state.failed) return retval;

                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:592:28: ( L_to | L_downto )
                    int alt159=2;
                    int LA159_0 = input.LA(1);

                    if ( (LA159_0==L_to) ) {
                        alt159=1;
                    }
                    else if ( (LA159_0==L_downto) ) {
                        alt159=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 159, 0, input);

                        throw nvae;
                    }
                    switch (alt159) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:592:29: L_to
                            {
                            L_to348=(Token)match(input,L_to,FOLLOW_L_to_in_p_to_expr3737); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            L_to348_tree = (CommonTree)adaptor.create(L_to348);
                            root_0 = (CommonTree)adaptor.becomeRoot(L_to348_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:592:36: L_downto
                            {
                            L_downto349=(Token)match(input,L_downto,FOLLOW_L_downto_in_p_to_expr3741); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            L_downto349_tree = (CommonTree)adaptor.create(L_downto349);
                            root_0 = (CommonTree)adaptor.becomeRoot(L_downto349_tree, root_0);
                            }

                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:592:49: ( NL )?
                    int alt160=2;
                    int LA160_0 = input.LA(1);

                    if ( (LA160_0==NL) ) {
                        alt160=1;
                    }
                    switch (alt160) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:592:49: NL
                            {
                            NL350=(Token)match(input,NL,FOLLOW_NL_in_p_to_expr3745); if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_p_arith_plus_expr_in_p_to_expr3749);
                    p_arith_plus_expr351=p_arith_plus_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_arith_plus_expr351.getTree());

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

        Token NL353=null;
        Token PLUS354=null;
        Token MINUS355=null;
        Token NL356=null;
        babel17Parser.arith_uminus_expr_return arith_uminus_expr352 = null;

        babel17Parser.arith_uminus_expr_return arith_uminus_expr357 = null;


        CommonTree NL353_tree=null;
        CommonTree PLUS354_tree=null;
        CommonTree MINUS355_tree=null;
        CommonTree NL356_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:595:2: ( arith_uminus_expr ( ( ( NL )? PLUS | MINUS ) ( NL )? arith_uminus_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:595:4: arith_uminus_expr ( ( ( NL )? PLUS | MINUS ) ( NL )? arith_uminus_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_arith_uminus_expr_in_arith_plus_expr3761);
            arith_uminus_expr352=arith_uminus_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, arith_uminus_expr352.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:595:22: ( ( ( NL )? PLUS | MINUS ) ( NL )? arith_uminus_expr )*
            loop165:
            do {
                int alt165=2;
                int LA165_0 = input.LA(1);

                if ( (LA165_0==NL) ) {
                    int LA165_1 = input.LA(2);

                    if ( (LA165_1==PLUS) ) {
                        alt165=1;
                    }


                }
                else if ( ((LA165_0>=PLUS && LA165_0<=MINUS)) ) {
                    alt165=1;
                }


                switch (alt165) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:595:23: ( ( NL )? PLUS | MINUS ) ( NL )? arith_uminus_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:595:23: ( ( NL )? PLUS | MINUS )
            	    int alt163=2;
            	    int LA163_0 = input.LA(1);

            	    if ( (LA163_0==PLUS||LA163_0==NL) ) {
            	        alt163=1;
            	    }
            	    else if ( (LA163_0==MINUS) ) {
            	        alt163=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 163, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt163) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:595:24: ( NL )? PLUS
            	            {
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:595:26: ( NL )?
            	            int alt162=2;
            	            int LA162_0 = input.LA(1);

            	            if ( (LA162_0==NL) ) {
            	                alt162=1;
            	            }
            	            switch (alt162) {
            	                case 1 :
            	                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:595:26: NL
            	                    {
            	                    NL353=(Token)match(input,NL,FOLLOW_NL_in_arith_plus_expr3765); if (state.failed) return retval;

            	                    }
            	                    break;

            	            }

            	            PLUS354=(Token)match(input,PLUS,FOLLOW_PLUS_in_arith_plus_expr3769); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PLUS354_tree = (CommonTree)adaptor.create(PLUS354);
            	            root_0 = (CommonTree)adaptor.becomeRoot(PLUS354_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:595:37: MINUS
            	            {
            	            MINUS355=(Token)match(input,MINUS,FOLLOW_MINUS_in_arith_plus_expr3774); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            MINUS355_tree = (CommonTree)adaptor.create(MINUS355);
            	            root_0 = (CommonTree)adaptor.becomeRoot(MINUS355_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:595:47: ( NL )?
            	    int alt164=2;
            	    int LA164_0 = input.LA(1);

            	    if ( (LA164_0==NL) ) {
            	        alt164=1;
            	    }
            	    switch (alt164) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:595:47: NL
            	            {
            	            NL356=(Token)match(input,NL,FOLLOW_NL_in_arith_plus_expr3778); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_arith_uminus_expr_in_arith_plus_expr3782);
            	    arith_uminus_expr357=arith_uminus_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, arith_uminus_expr357.getTree());

            	    }
            	    break;

            	default :
            	    break loop165;
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

        Token NL359=null;
        Token set360=null;
        Token NL361=null;
        babel17Parser.p_arith_uminus_expr_return p_arith_uminus_expr358 = null;

        babel17Parser.p_arith_uminus_expr_return p_arith_uminus_expr362 = null;


        CommonTree NL359_tree=null;
        CommonTree set360_tree=null;
        CommonTree NL361_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:598:2: ( p_arith_uminus_expr ( ( NL )? ( PLUS | MINUS ) ( NL )? p_arith_uminus_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:598:4: p_arith_uminus_expr ( ( NL )? ( PLUS | MINUS ) ( NL )? p_arith_uminus_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_arith_uminus_expr_in_p_arith_plus_expr3793);
            p_arith_uminus_expr358=p_arith_uminus_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_arith_uminus_expr358.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:598:24: ( ( NL )? ( PLUS | MINUS ) ( NL )? p_arith_uminus_expr )*
            loop168:
            do {
                int alt168=2;
                int LA168_0 = input.LA(1);

                if ( (LA168_0==NL) ) {
                    int LA168_1 = input.LA(2);

                    if ( ((LA168_1>=PLUS && LA168_1<=MINUS)) ) {
                        alt168=1;
                    }


                }
                else if ( ((LA168_0>=PLUS && LA168_0<=MINUS)) ) {
                    alt168=1;
                }


                switch (alt168) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:598:25: ( NL )? ( PLUS | MINUS ) ( NL )? p_arith_uminus_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:598:27: ( NL )?
            	    int alt166=2;
            	    int LA166_0 = input.LA(1);

            	    if ( (LA166_0==NL) ) {
            	        alt166=1;
            	    }
            	    switch (alt166) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:598:27: NL
            	            {
            	            NL359=(Token)match(input,NL,FOLLOW_NL_in_p_arith_plus_expr3796); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    set360=(Token)input.LT(1);
            	    set360=(Token)input.LT(1);
            	    if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set360), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:598:48: ( NL )?
            	    int alt167=2;
            	    int LA167_0 = input.LA(1);

            	    if ( (LA167_0==NL) ) {
            	        alt167=1;
            	    }
            	    switch (alt167) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:598:48: NL
            	            {
            	            NL361=(Token)match(input,NL,FOLLOW_NL_in_p_arith_plus_expr3809); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_arith_uminus_expr_in_p_arith_plus_expr3813);
            	    p_arith_uminus_expr362=p_arith_uminus_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_arith_uminus_expr362.getTree());

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

        Token MINUS363=null;
        Token NL364=null;
        babel17Parser.arith_mult_expr_return arith_mult_expr365 = null;

        babel17Parser.arith_mult_expr_return arith_mult_expr366 = null;


        CommonTree MINUS363_tree=null;
        CommonTree NL364_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleSubtreeStream stream_arith_mult_expr=new RewriteRuleSubtreeStream(adaptor,"rule arith_mult_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:601:2: ( MINUS ( NL )? arith_mult_expr -> ^( UMINUS arith_mult_expr ) | arith_mult_expr )
            int alt170=2;
            int LA170_0 = input.LA(1);

            if ( (LA170_0==MINUS) ) {
                alt170=1;
            }
            else if ( (LA170_0==L_begin||(LA170_0>=L_with && LA170_0<=L_if)||(LA170_0>=L_while && LA170_0<=L_for)||LA170_0==L_match||(LA170_0>=A_infinity && LA170_0<=U_infinity)||(LA170_0>=L_true && LA170_0<=L_this)||LA170_0==L_nil||(LA170_0>=Constr && LA170_0<=Num)||(LA170_0>=String && LA170_0<=ROUND_BRACKET_OPEN)||LA170_0==SQUARE_BRACKET_OPEN||LA170_0==CURLY_BRACKET_OPEN) ) {
                alt170=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 170, 0, input);

                throw nvae;
            }
            switch (alt170) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:601:4: MINUS ( NL )? arith_mult_expr
                    {
                    MINUS363=(Token)match(input,MINUS,FOLLOW_MINUS_in_arith_uminus_expr3826); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(MINUS363);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:601:10: ( NL )?
                    int alt169=2;
                    int LA169_0 = input.LA(1);

                    if ( (LA169_0==NL) ) {
                        alt169=1;
                    }
                    switch (alt169) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:601:10: NL
                            {
                            NL364=(Token)match(input,NL,FOLLOW_NL_in_arith_uminus_expr3828); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL364);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_arith_mult_expr_in_arith_uminus_expr3831);
                    arith_mult_expr365=arith_mult_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_arith_mult_expr.add(arith_mult_expr365.getTree());


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

                    pushFollow(FOLLOW_arith_mult_expr_in_arith_uminus_expr3844);
                    arith_mult_expr366=arith_mult_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arith_mult_expr366.getTree());

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

        Token MINUS367=null;
        Token NL368=null;
        babel17Parser.p_arith_mult_expr_return p_arith_mult_expr369 = null;

        babel17Parser.p_arith_mult_expr_return p_arith_mult_expr370 = null;


        CommonTree MINUS367_tree=null;
        CommonTree NL368_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleSubtreeStream stream_p_arith_mult_expr=new RewriteRuleSubtreeStream(adaptor,"rule p_arith_mult_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:605:2: ( MINUS ( NL )? p_arith_mult_expr -> ^( UMINUS p_arith_mult_expr ) | p_arith_mult_expr )
            int alt172=2;
            int LA172_0 = input.LA(1);

            if ( (LA172_0==MINUS) ) {
                alt172=1;
            }
            else if ( (LA172_0==L_begin||(LA172_0>=L_with && LA172_0<=L_if)||(LA172_0>=L_while && LA172_0<=L_for)||LA172_0==L_match||(LA172_0>=A_infinity && LA172_0<=U_infinity)||(LA172_0>=L_true && LA172_0<=L_this)||LA172_0==L_nil||(LA172_0>=Constr && LA172_0<=Num)||(LA172_0>=String && LA172_0<=ROUND_BRACKET_OPEN)||LA172_0==SQUARE_BRACKET_OPEN||LA172_0==CURLY_BRACKET_OPEN) ) {
                alt172=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 172, 0, input);

                throw nvae;
            }
            switch (alt172) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:605:4: MINUS ( NL )? p_arith_mult_expr
                    {
                    MINUS367=(Token)match(input,MINUS,FOLLOW_MINUS_in_p_arith_uminus_expr3855); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(MINUS367);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:605:10: ( NL )?
                    int alt171=2;
                    int LA171_0 = input.LA(1);

                    if ( (LA171_0==NL) ) {
                        alt171=1;
                    }
                    switch (alt171) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:605:10: NL
                            {
                            NL368=(Token)match(input,NL,FOLLOW_NL_in_p_arith_uminus_expr3857); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL368);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_p_arith_mult_expr_in_p_arith_uminus_expr3860);
                    p_arith_mult_expr369=p_arith_mult_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_p_arith_mult_expr.add(p_arith_mult_expr369.getTree());


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

                    pushFollow(FOLLOW_p_arith_mult_expr_in_p_arith_uminus_expr3873);
                    p_arith_mult_expr370=p_arith_mult_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_arith_mult_expr370.getTree());

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

        Token NL372=null;
        Token set373=null;
        Token NL374=null;
        babel17Parser.arith_pow_expr_return arith_pow_expr371 = null;

        babel17Parser.arith_pow_expr_return arith_pow_expr375 = null;


        CommonTree NL372_tree=null;
        CommonTree set373_tree=null;
        CommonTree NL374_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:609:2: ( arith_pow_expr ( ( NL )? ( TIMES | DIV | MOD ) ( NL )? arith_pow_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:609:4: arith_pow_expr ( ( NL )? ( TIMES | DIV | MOD ) ( NL )? arith_pow_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_arith_pow_expr_in_arith_mult_expr3882);
            arith_pow_expr371=arith_pow_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, arith_pow_expr371.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:609:19: ( ( NL )? ( TIMES | DIV | MOD ) ( NL )? arith_pow_expr )*
            loop175:
            do {
                int alt175=2;
                int LA175_0 = input.LA(1);

                if ( (LA175_0==NL) ) {
                    int LA175_1 = input.LA(2);

                    if ( ((LA175_1>=TIMES && LA175_1<=MOD)) ) {
                        alt175=1;
                    }


                }
                else if ( ((LA175_0>=TIMES && LA175_0<=MOD)) ) {
                    alt175=1;
                }


                switch (alt175) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:609:20: ( NL )? ( TIMES | DIV | MOD ) ( NL )? arith_pow_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:609:22: ( NL )?
            	    int alt173=2;
            	    int LA173_0 = input.LA(1);

            	    if ( (LA173_0==NL) ) {
            	        alt173=1;
            	    }
            	    switch (alt173) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:609:22: NL
            	            {
            	            NL372=(Token)match(input,NL,FOLLOW_NL_in_arith_mult_expr3885); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    set373=(Token)input.LT(1);
            	    set373=(Token)input.LT(1);
            	    if ( (input.LA(1)>=TIMES && input.LA(1)<=MOD) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set373), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:609:48: ( NL )?
            	    int alt174=2;
            	    int LA174_0 = input.LA(1);

            	    if ( (LA174_0==NL) ) {
            	        alt174=1;
            	    }
            	    switch (alt174) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:609:48: NL
            	            {
            	            NL374=(Token)match(input,NL,FOLLOW_NL_in_arith_mult_expr3902); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_arith_pow_expr_in_arith_mult_expr3906);
            	    arith_pow_expr375=arith_pow_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, arith_pow_expr375.getTree());

            	    }
            	    break;

            	default :
            	    break loop175;
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

        Token NL377=null;
        Token set378=null;
        Token NL379=null;
        babel17Parser.p_arith_pow_expr_return p_arith_pow_expr376 = null;

        babel17Parser.p_arith_pow_expr_return p_arith_pow_expr380 = null;


        CommonTree NL377_tree=null;
        CommonTree set378_tree=null;
        CommonTree NL379_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:612:2: ( p_arith_pow_expr ( ( NL )? ( TIMES | DIV | MOD ) ( NL )? p_arith_pow_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:612:4: p_arith_pow_expr ( ( NL )? ( TIMES | DIV | MOD ) ( NL )? p_arith_pow_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_arith_pow_expr_in_p_arith_mult_expr3918);
            p_arith_pow_expr376=p_arith_pow_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_arith_pow_expr376.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:612:21: ( ( NL )? ( TIMES | DIV | MOD ) ( NL )? p_arith_pow_expr )*
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
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:612:22: ( NL )? ( TIMES | DIV | MOD ) ( NL )? p_arith_pow_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:612:24: ( NL )?
            	    int alt176=2;
            	    int LA176_0 = input.LA(1);

            	    if ( (LA176_0==NL) ) {
            	        alt176=1;
            	    }
            	    switch (alt176) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:612:24: NL
            	            {
            	            NL377=(Token)match(input,NL,FOLLOW_NL_in_p_arith_mult_expr3921); if (state.failed) return retval;

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

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:612:50: ( NL )?
            	    int alt177=2;
            	    int LA177_0 = input.LA(1);

            	    if ( (LA177_0==NL) ) {
            	        alt177=1;
            	    }
            	    switch (alt177) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:612:50: NL
            	            {
            	            NL379=(Token)match(input,NL,FOLLOW_NL_in_p_arith_mult_expr3938); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_arith_pow_expr_in_p_arith_mult_expr3942);
            	    p_arith_pow_expr380=p_arith_pow_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_arith_pow_expr380.getTree());

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

        Token NL382=null;
        Token POW_tok383=null;
        Token NL384=null;
        babel17Parser.apply_expr_return apply_expr381 = null;

        babel17Parser.apply_expr_return apply_expr385 = null;


        CommonTree NL382_tree=null;
        CommonTree POW_tok383_tree=null;
        CommonTree NL384_tree=null;
        RewriteRuleTokenStream stream_POW_tok=new RewriteRuleTokenStream(adaptor,"token POW_tok");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_apply_expr=new RewriteRuleSubtreeStream(adaptor,"rule apply_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:615:2: ( apply_expr ( ( NL )? POW_tok ( NL )? apply_expr )* -> ^( POW ( apply_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:615:4: apply_expr ( ( NL )? POW_tok ( NL )? apply_expr )*
            {
            pushFollow(FOLLOW_apply_expr_in_arith_pow_expr3953);
            apply_expr381=apply_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_apply_expr.add(apply_expr381.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:615:15: ( ( NL )? POW_tok ( NL )? apply_expr )*
            loop181:
            do {
                int alt181=2;
                int LA181_0 = input.LA(1);

                if ( (LA181_0==NL) ) {
                    int LA181_1 = input.LA(2);

                    if ( (LA181_1==POW_tok) ) {
                        alt181=1;
                    }


                }
                else if ( (LA181_0==POW_tok) ) {
                    alt181=1;
                }


                switch (alt181) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:615:16: ( NL )? POW_tok ( NL )? apply_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:615:16: ( NL )?
            	    int alt179=2;
            	    int LA179_0 = input.LA(1);

            	    if ( (LA179_0==NL) ) {
            	        alt179=1;
            	    }
            	    switch (alt179) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:615:16: NL
            	            {
            	            NL382=(Token)match(input,NL,FOLLOW_NL_in_arith_pow_expr3956); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL382);


            	            }
            	            break;

            	    }

            	    POW_tok383=(Token)match(input,POW_tok,FOLLOW_POW_tok_in_arith_pow_expr3959); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_POW_tok.add(POW_tok383);

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:615:28: ( NL )?
            	    int alt180=2;
            	    int LA180_0 = input.LA(1);

            	    if ( (LA180_0==NL) ) {
            	        alt180=1;
            	    }
            	    switch (alt180) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:615:28: NL
            	            {
            	            NL384=(Token)match(input,NL,FOLLOW_NL_in_arith_pow_expr3961); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL384);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_apply_expr_in_arith_pow_expr3964);
            	    apply_expr385=apply_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_apply_expr.add(apply_expr385.getTree());

            	    }
            	    break;

            	default :
            	    break loop181;
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

        Token NL387=null;
        Token POW_tok388=null;
        Token NL389=null;
        babel17Parser.p_apply_expr_return p_apply_expr386 = null;

        babel17Parser.p_apply_expr_return p_apply_expr390 = null;


        CommonTree NL387_tree=null;
        CommonTree POW_tok388_tree=null;
        CommonTree NL389_tree=null;
        RewriteRuleTokenStream stream_POW_tok=new RewriteRuleTokenStream(adaptor,"token POW_tok");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_p_apply_expr=new RewriteRuleSubtreeStream(adaptor,"rule p_apply_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:618:2: ( p_apply_expr ( ( NL )? POW_tok ( NL )? p_apply_expr )* -> ^( POW ( p_apply_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:618:4: p_apply_expr ( ( NL )? POW_tok ( NL )? p_apply_expr )*
            {
            pushFollow(FOLLOW_p_apply_expr_in_p_arith_pow_expr3985);
            p_apply_expr386=p_apply_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_p_apply_expr.add(p_apply_expr386.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:618:17: ( ( NL )? POW_tok ( NL )? p_apply_expr )*
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
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:618:18: ( NL )? POW_tok ( NL )? p_apply_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:618:18: ( NL )?
            	    int alt182=2;
            	    int LA182_0 = input.LA(1);

            	    if ( (LA182_0==NL) ) {
            	        alt182=1;
            	    }
            	    switch (alt182) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:618:18: NL
            	            {
            	            NL387=(Token)match(input,NL,FOLLOW_NL_in_p_arith_pow_expr3988); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL387);


            	            }
            	            break;

            	    }

            	    POW_tok388=(Token)match(input,POW_tok,FOLLOW_POW_tok_in_p_arith_pow_expr3991); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_POW_tok.add(POW_tok388);

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:618:30: ( NL )?
            	    int alt183=2;
            	    int LA183_0 = input.LA(1);

            	    if ( (LA183_0==NL) ) {
            	        alt183=1;
            	    }
            	    switch (alt183) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:618:30: NL
            	            {
            	            NL389=(Token)match(input,NL,FOLLOW_NL_in_p_arith_pow_expr3993); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL389);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_apply_expr_in_p_arith_pow_expr3996);
            	    p_apply_expr390=p_apply_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_p_apply_expr.add(p_apply_expr390.getTree());

            	    }
            	    break;

            	default :
            	    break loop184;
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

        babel17Parser.basic_expr_return basic_expr391 = null;


        RewriteRuleSubtreeStream stream_basic_expr=new RewriteRuleSubtreeStream(adaptor,"rule basic_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:621:2: ( ( basic_expr )+ -> ^( APPLY ( basic_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:621:4: ( basic_expr )+
            {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:621:4: ( basic_expr )+
            int cnt185=0;
            loop185:
            do {
                int alt185=2;
                int LA185_0 = input.LA(1);

                if ( (LA185_0==L_begin||(LA185_0>=L_with && LA185_0<=L_if)||(LA185_0>=L_while && LA185_0<=L_for)||LA185_0==L_match||(LA185_0>=A_infinity && LA185_0<=U_infinity)||(LA185_0>=L_true && LA185_0<=L_this)||LA185_0==L_nil||(LA185_0>=Constr && LA185_0<=Num)||(LA185_0>=String && LA185_0<=ROUND_BRACKET_OPEN)||LA185_0==SQUARE_BRACKET_OPEN||LA185_0==CURLY_BRACKET_OPEN) ) {
                    alt185=1;
                }


                switch (alt185) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:621:4: basic_expr
            	    {
            	    pushFollow(FOLLOW_basic_expr_in_apply_expr4017);
            	    basic_expr391=basic_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_basic_expr.add(basic_expr391.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt185 >= 1 ) break loop185;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(185, input);
                        throw eee;
                }
                cnt185++;
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

        Token NL393=null;
        babel17Parser.p_basic_expr_return p_basic_expr392 = null;

        babel17Parser.p_basic_expr_return p_basic_expr394 = null;


        CommonTree NL393_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_p_basic_expr=new RewriteRuleSubtreeStream(adaptor,"rule p_basic_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:623:2: ( p_basic_expr ( ( NL )? p_basic_expr )* -> ^( APPLY ( p_basic_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:623:4: p_basic_expr ( ( NL )? p_basic_expr )*
            {
            pushFollow(FOLLOW_p_basic_expr_in_p_apply_expr4035);
            p_basic_expr392=p_basic_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_p_basic_expr.add(p_basic_expr392.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:623:17: ( ( NL )? p_basic_expr )*
            loop187:
            do {
                int alt187=2;
                int LA187_0 = input.LA(1);

                if ( (LA187_0==NL) ) {
                    int LA187_1 = input.LA(2);

                    if ( (LA187_1==L_begin||(LA187_1>=L_with && LA187_1<=L_if)||(LA187_1>=L_while && LA187_1<=L_for)||LA187_1==L_match||(LA187_1>=A_infinity && LA187_1<=U_infinity)||(LA187_1>=L_true && LA187_1<=L_this)||LA187_1==L_nil||(LA187_1>=Constr && LA187_1<=Num)||(LA187_1>=String && LA187_1<=ROUND_BRACKET_OPEN)||LA187_1==SQUARE_BRACKET_OPEN||LA187_1==CURLY_BRACKET_OPEN) ) {
                        alt187=1;
                    }


                }
                else if ( (LA187_0==L_begin||(LA187_0>=L_with && LA187_0<=L_if)||(LA187_0>=L_while && LA187_0<=L_for)||LA187_0==L_match||(LA187_0>=A_infinity && LA187_0<=U_infinity)||(LA187_0>=L_true && LA187_0<=L_this)||LA187_0==L_nil||(LA187_0>=Constr && LA187_0<=Num)||(LA187_0>=String && LA187_0<=ROUND_BRACKET_OPEN)||LA187_0==SQUARE_BRACKET_OPEN||LA187_0==CURLY_BRACKET_OPEN) ) {
                    alt187=1;
                }


                switch (alt187) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:623:18: ( NL )? p_basic_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:623:18: ( NL )?
            	    int alt186=2;
            	    int LA186_0 = input.LA(1);

            	    if ( (LA186_0==NL) ) {
            	        alt186=1;
            	    }
            	    switch (alt186) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:623:18: NL
            	            {
            	            NL393=(Token)match(input,NL,FOLLOW_NL_in_p_apply_expr4038); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL393);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_basic_expr_in_p_apply_expr4041);
            	    p_basic_expr394=p_basic_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_p_basic_expr.add(p_basic_expr394.getTree());

            	    }
            	    break;

            	default :
            	    break loop187;
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

        babel17Parser.message_send_expr_return message_send_expr395 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:626:2: ( message_send_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:626:4: message_send_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_message_send_expr_in_basic_expr4061);
            message_send_expr395=message_send_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, message_send_expr395.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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

        babel17Parser.message_send_expr_return message_send_expr396 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:629:2: ( message_send_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:629:4: message_send_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_message_send_expr_in_p_basic_expr4070);
            message_send_expr396=message_send_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, message_send_expr396.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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

        Token NL398=null;
        Token PERIOD399=null;
        Token NL400=null;
        Token Id401=null;
        babel17Parser.primitive_expr_return primitive_expr397 = null;


        CommonTree NL398_tree=null;
        CommonTree PERIOD399_tree=null;
        CommonTree NL400_tree=null;
        CommonTree Id401_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
        RewriteRuleTokenStream stream_Id=new RewriteRuleTokenStream(adaptor,"token Id");
        RewriteRuleSubtreeStream stream_primitive_expr=new RewriteRuleSubtreeStream(adaptor,"rule primitive_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:632:2: ( primitive_expr ( ( NL )? PERIOD ( NL )? Id )* -> ^( MESSAGE_SEND primitive_expr ( Id )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:632:4: primitive_expr ( ( NL )? PERIOD ( NL )? Id )*
            {
            pushFollow(FOLLOW_primitive_expr_in_message_send_expr4079);
            primitive_expr397=primitive_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_primitive_expr.add(primitive_expr397.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:632:19: ( ( NL )? PERIOD ( NL )? Id )*
            loop190:
            do {
                int alt190=2;
                int LA190_0 = input.LA(1);

                if ( (LA190_0==NL) ) {
                    int LA190_1 = input.LA(2);

                    if ( (LA190_1==PERIOD) ) {
                        alt190=1;
                    }


                }
                else if ( (LA190_0==PERIOD) ) {
                    alt190=1;
                }


                switch (alt190) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:632:20: ( NL )? PERIOD ( NL )? Id
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:632:20: ( NL )?
            	    int alt188=2;
            	    int LA188_0 = input.LA(1);

            	    if ( (LA188_0==NL) ) {
            	        alt188=1;
            	    }
            	    switch (alt188) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:632:20: NL
            	            {
            	            NL398=(Token)match(input,NL,FOLLOW_NL_in_message_send_expr4082); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL398);


            	            }
            	            break;

            	    }

            	    PERIOD399=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_message_send_expr4085); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD399);

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:632:31: ( NL )?
            	    int alt189=2;
            	    int LA189_0 = input.LA(1);

            	    if ( (LA189_0==NL) ) {
            	        alt189=1;
            	    }
            	    switch (alt189) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:632:31: NL
            	            {
            	            NL400=(Token)match(input,NL,FOLLOW_NL_in_message_send_expr4087); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL400);


            	            }
            	            break;

            	    }

            	    Id401=(Token)match(input,Id,FOLLOW_Id_in_message_send_expr4090); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_Id.add(Id401);


            	    }
            	    break;

            	default :
            	    break loop190;
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

        Token char_literal402=null;
        Token NL403=null;
        Token NL405=null;
        Token COMMA406=null;
        Token NL407=null;
        Token NL409=null;
        Token char_literal410=null;
        Token char_literal411=null;
        Token NL412=null;
        Token NL414=null;
        Token COMMA415=null;
        Token NL416=null;
        Token NL418=null;
        Token COMMA419=null;
        Token NL420=null;
        Token char_literal421=null;
        babel17Parser.protected_expr_return protected_expr404 = null;

        babel17Parser.protected_expr_return protected_expr408 = null;

        babel17Parser.protected_expr_return protected_expr413 = null;

        babel17Parser.protected_expr_return protected_expr417 = null;


        CommonTree char_literal402_tree=null;
        CommonTree NL403_tree=null;
        CommonTree NL405_tree=null;
        CommonTree COMMA406_tree=null;
        CommonTree NL407_tree=null;
        CommonTree NL409_tree=null;
        CommonTree char_literal410_tree=null;
        CommonTree char_literal411_tree=null;
        CommonTree NL412_tree=null;
        CommonTree NL414_tree=null;
        CommonTree COMMA415_tree=null;
        CommonTree NL416_tree=null;
        CommonTree NL418_tree=null;
        CommonTree COMMA419_tree=null;
        CommonTree NL420_tree=null;
        CommonTree char_literal421_tree=null;
        RewriteRuleTokenStream stream_ROUND_BRACKET_OPEN=new RewriteRuleTokenStream(adaptor,"token ROUND_BRACKET_OPEN");
        RewriteRuleTokenStream stream_SQUARE_BRACKET_CLOSE=new RewriteRuleTokenStream(adaptor,"token SQUARE_BRACKET_CLOSE");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_ROUND_BRACKET_CLOSE=new RewriteRuleTokenStream(adaptor,"token ROUND_BRACKET_CLOSE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_SQUARE_BRACKET_OPEN=new RewriteRuleTokenStream(adaptor,"token SQUARE_BRACKET_OPEN");
        RewriteRuleSubtreeStream stream_protected_expr=new RewriteRuleSubtreeStream(adaptor,"rule protected_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:635:2: ( '[' ( NL )? ( protected_expr ( ( NL )? COMMA ( NL )? protected_expr )* ( NL )? )? ']' -> ^( SQUARE_LIST ( protected_expr )* ) | '(' ( NL )? ( protected_expr ( ( NL )? COMMA ( NL )? protected_expr )* ( NL )? ( COMMA ( NL )? )? )? ')' -> ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( protected_expr )* ) ) )
            int alt205=2;
            int LA205_0 = input.LA(1);

            if ( (LA205_0==SQUARE_BRACKET_OPEN) ) {
                alt205=1;
            }
            else if ( (LA205_0==ROUND_BRACKET_OPEN) ) {
                alt205=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 205, 0, input);

                throw nvae;
            }
            switch (alt205) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:635:4: '[' ( NL )? ( protected_expr ( ( NL )? COMMA ( NL )? protected_expr )* ( NL )? )? ']'
                    {
                    char_literal402=(Token)match(input,SQUARE_BRACKET_OPEN,FOLLOW_SQUARE_BRACKET_OPEN_in_list_expr4114); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SQUARE_BRACKET_OPEN.add(char_literal402);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:635:8: ( NL )?
                    int alt191=2;
                    int LA191_0 = input.LA(1);

                    if ( (LA191_0==NL) ) {
                        alt191=1;
                    }
                    switch (alt191) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:635:8: NL
                            {
                            NL403=(Token)match(input,NL,FOLLOW_NL_in_list_expr4116); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL403);


                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:635:12: ( protected_expr ( ( NL )? COMMA ( NL )? protected_expr )* ( NL )? )?
                    int alt196=2;
                    int LA196_0 = input.LA(1);

                    if ( (LA196_0==L_begin||(LA196_0>=L_obj && LA196_0<=L_if)||(LA196_0>=L_while && LA196_0<=L_for)||(LA196_0>=L_match && LA196_0<=L_case)||LA196_0==L_exception||(LA196_0>=A_infinity && LA196_0<=U_infinity)||(LA196_0>=L_concurrent && LA196_0<=L_lazy)||(LA196_0>=L_true && LA196_0<=L_nil)||LA196_0==MINUS||LA196_0==A_NOT||LA196_0==U_NOT||LA196_0==TILDE||(LA196_0>=Constr && LA196_0<=Num)||(LA196_0>=String && LA196_0<=ROUND_BRACKET_OPEN)||LA196_0==SQUARE_BRACKET_OPEN||LA196_0==CURLY_BRACKET_OPEN||LA196_0==UNDERSCORE) ) {
                        alt196=1;
                    }
                    switch (alt196) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:635:13: protected_expr ( ( NL )? COMMA ( NL )? protected_expr )* ( NL )?
                            {
                            pushFollow(FOLLOW_protected_expr_in_list_expr4120);
                            protected_expr404=protected_expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr404.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:635:28: ( ( NL )? COMMA ( NL )? protected_expr )*
                            loop194:
                            do {
                                int alt194=2;
                                int LA194_0 = input.LA(1);

                                if ( (LA194_0==NL) ) {
                                    int LA194_1 = input.LA(2);

                                    if ( (LA194_1==COMMA) ) {
                                        alt194=1;
                                    }


                                }
                                else if ( (LA194_0==COMMA) ) {
                                    alt194=1;
                                }


                                switch (alt194) {
                            	case 1 :
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:635:29: ( NL )? COMMA ( NL )? protected_expr
                            	    {
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:635:29: ( NL )?
                            	    int alt192=2;
                            	    int LA192_0 = input.LA(1);

                            	    if ( (LA192_0==NL) ) {
                            	        alt192=1;
                            	    }
                            	    switch (alt192) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:635:29: NL
                            	            {
                            	            NL405=(Token)match(input,NL,FOLLOW_NL_in_list_expr4123); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL405);


                            	            }
                            	            break;

                            	    }

                            	    COMMA406=(Token)match(input,COMMA,FOLLOW_COMMA_in_list_expr4126); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA406);

                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:635:39: ( NL )?
                            	    int alt193=2;
                            	    int LA193_0 = input.LA(1);

                            	    if ( (LA193_0==NL) ) {
                            	        alt193=1;
                            	    }
                            	    switch (alt193) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:635:39: NL
                            	            {
                            	            NL407=(Token)match(input,NL,FOLLOW_NL_in_list_expr4128); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL407);


                            	            }
                            	            break;

                            	    }

                            	    pushFollow(FOLLOW_protected_expr_in_list_expr4131);
                            	    protected_expr408=protected_expr();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr408.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop194;
                                }
                            } while (true);

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:635:60: ( NL )?
                            int alt195=2;
                            int LA195_0 = input.LA(1);

                            if ( (LA195_0==NL) ) {
                                alt195=1;
                            }
                            switch (alt195) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:635:60: NL
                                    {
                                    NL409=(Token)match(input,NL,FOLLOW_NL_in_list_expr4135); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL409);


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    char_literal410=(Token)match(input,SQUARE_BRACKET_CLOSE,FOLLOW_SQUARE_BRACKET_CLOSE_in_list_expr4140); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SQUARE_BRACKET_CLOSE.add(char_literal410);



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
                    char_literal411=(Token)match(input,ROUND_BRACKET_OPEN,FOLLOW_ROUND_BRACKET_OPEN_in_list_expr4154); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ROUND_BRACKET_OPEN.add(char_literal411);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:636:8: ( NL )?
                    int alt197=2;
                    int LA197_0 = input.LA(1);

                    if ( (LA197_0==NL) ) {
                        alt197=1;
                    }
                    switch (alt197) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:636:8: NL
                            {
                            NL412=(Token)match(input,NL,FOLLOW_NL_in_list_expr4156); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL412);


                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:636:12: ( protected_expr ( ( NL )? COMMA ( NL )? protected_expr )* ( NL )? ( COMMA ( NL )? )? )?
                    int alt204=2;
                    int LA204_0 = input.LA(1);

                    if ( (LA204_0==L_begin||(LA204_0>=L_obj && LA204_0<=L_if)||(LA204_0>=L_while && LA204_0<=L_for)||(LA204_0>=L_match && LA204_0<=L_case)||LA204_0==L_exception||(LA204_0>=A_infinity && LA204_0<=U_infinity)||(LA204_0>=L_concurrent && LA204_0<=L_lazy)||(LA204_0>=L_true && LA204_0<=L_nil)||LA204_0==MINUS||LA204_0==A_NOT||LA204_0==U_NOT||LA204_0==TILDE||(LA204_0>=Constr && LA204_0<=Num)||(LA204_0>=String && LA204_0<=ROUND_BRACKET_OPEN)||LA204_0==SQUARE_BRACKET_OPEN||LA204_0==CURLY_BRACKET_OPEN||LA204_0==UNDERSCORE) ) {
                        alt204=1;
                    }
                    switch (alt204) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:636:13: protected_expr ( ( NL )? COMMA ( NL )? protected_expr )* ( NL )? ( COMMA ( NL )? )?
                            {
                            pushFollow(FOLLOW_protected_expr_in_list_expr4160);
                            protected_expr413=protected_expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr413.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:636:28: ( ( NL )? COMMA ( NL )? protected_expr )*
                            loop200:
                            do {
                                int alt200=2;
                                int LA200_0 = input.LA(1);

                                if ( (LA200_0==NL) ) {
                                    int LA200_1 = input.LA(2);

                                    if ( (LA200_1==COMMA) ) {
                                        int LA200_2 = input.LA(3);

                                        if ( (LA200_2==NL) ) {
                                            int LA200_4 = input.LA(4);

                                            if ( (LA200_4==L_begin||(LA200_4>=L_obj && LA200_4<=L_if)||(LA200_4>=L_while && LA200_4<=L_for)||(LA200_4>=L_match && LA200_4<=L_case)||LA200_4==L_exception||(LA200_4>=A_infinity && LA200_4<=U_infinity)||(LA200_4>=L_concurrent && LA200_4<=L_lazy)||(LA200_4>=L_true && LA200_4<=L_nil)||LA200_4==MINUS||LA200_4==A_NOT||LA200_4==U_NOT||LA200_4==TILDE||(LA200_4>=Constr && LA200_4<=Num)||(LA200_4>=String && LA200_4<=ROUND_BRACKET_OPEN)||LA200_4==SQUARE_BRACKET_OPEN||LA200_4==CURLY_BRACKET_OPEN||LA200_4==UNDERSCORE) ) {
                                                alt200=1;
                                            }


                                        }
                                        else if ( (LA200_2==L_begin||(LA200_2>=L_obj && LA200_2<=L_if)||(LA200_2>=L_while && LA200_2<=L_for)||(LA200_2>=L_match && LA200_2<=L_case)||LA200_2==L_exception||(LA200_2>=A_infinity && LA200_2<=U_infinity)||(LA200_2>=L_concurrent && LA200_2<=L_lazy)||(LA200_2>=L_true && LA200_2<=L_nil)||LA200_2==MINUS||LA200_2==A_NOT||LA200_2==U_NOT||LA200_2==TILDE||(LA200_2>=Constr && LA200_2<=Num)||(LA200_2>=String && LA200_2<=ROUND_BRACKET_OPEN)||LA200_2==SQUARE_BRACKET_OPEN||LA200_2==CURLY_BRACKET_OPEN||LA200_2==UNDERSCORE) ) {
                                            alt200=1;
                                        }


                                    }


                                }
                                else if ( (LA200_0==COMMA) ) {
                                    int LA200_2 = input.LA(2);

                                    if ( (LA200_2==NL) ) {
                                        int LA200_4 = input.LA(3);

                                        if ( (LA200_4==L_begin||(LA200_4>=L_obj && LA200_4<=L_if)||(LA200_4>=L_while && LA200_4<=L_for)||(LA200_4>=L_match && LA200_4<=L_case)||LA200_4==L_exception||(LA200_4>=A_infinity && LA200_4<=U_infinity)||(LA200_4>=L_concurrent && LA200_4<=L_lazy)||(LA200_4>=L_true && LA200_4<=L_nil)||LA200_4==MINUS||LA200_4==A_NOT||LA200_4==U_NOT||LA200_4==TILDE||(LA200_4>=Constr && LA200_4<=Num)||(LA200_4>=String && LA200_4<=ROUND_BRACKET_OPEN)||LA200_4==SQUARE_BRACKET_OPEN||LA200_4==CURLY_BRACKET_OPEN||LA200_4==UNDERSCORE) ) {
                                            alt200=1;
                                        }


                                    }
                                    else if ( (LA200_2==L_begin||(LA200_2>=L_obj && LA200_2<=L_if)||(LA200_2>=L_while && LA200_2<=L_for)||(LA200_2>=L_match && LA200_2<=L_case)||LA200_2==L_exception||(LA200_2>=A_infinity && LA200_2<=U_infinity)||(LA200_2>=L_concurrent && LA200_2<=L_lazy)||(LA200_2>=L_true && LA200_2<=L_nil)||LA200_2==MINUS||LA200_2==A_NOT||LA200_2==U_NOT||LA200_2==TILDE||(LA200_2>=Constr && LA200_2<=Num)||(LA200_2>=String && LA200_2<=ROUND_BRACKET_OPEN)||LA200_2==SQUARE_BRACKET_OPEN||LA200_2==CURLY_BRACKET_OPEN||LA200_2==UNDERSCORE) ) {
                                        alt200=1;
                                    }


                                }


                                switch (alt200) {
                            	case 1 :
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:636:29: ( NL )? COMMA ( NL )? protected_expr
                            	    {
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:636:29: ( NL )?
                            	    int alt198=2;
                            	    int LA198_0 = input.LA(1);

                            	    if ( (LA198_0==NL) ) {
                            	        alt198=1;
                            	    }
                            	    switch (alt198) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:636:29: NL
                            	            {
                            	            NL414=(Token)match(input,NL,FOLLOW_NL_in_list_expr4163); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL414);


                            	            }
                            	            break;

                            	    }

                            	    COMMA415=(Token)match(input,COMMA,FOLLOW_COMMA_in_list_expr4166); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA415);

                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:636:39: ( NL )?
                            	    int alt199=2;
                            	    int LA199_0 = input.LA(1);

                            	    if ( (LA199_0==NL) ) {
                            	        alt199=1;
                            	    }
                            	    switch (alt199) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:636:39: NL
                            	            {
                            	            NL416=(Token)match(input,NL,FOLLOW_NL_in_list_expr4168); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL416);


                            	            }
                            	            break;

                            	    }

                            	    pushFollow(FOLLOW_protected_expr_in_list_expr4171);
                            	    protected_expr417=protected_expr();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr417.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop200;
                                }
                            } while (true);

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:636:60: ( NL )?
                            int alt201=2;
                            int LA201_0 = input.LA(1);

                            if ( (LA201_0==NL) ) {
                                alt201=1;
                            }
                            switch (alt201) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:636:60: NL
                                    {
                                    NL418=(Token)match(input,NL,FOLLOW_NL_in_list_expr4175); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL418);


                                    }
                                    break;

                            }

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:636:64: ( COMMA ( NL )? )?
                            int alt203=2;
                            int LA203_0 = input.LA(1);

                            if ( (LA203_0==COMMA) ) {
                                alt203=1;
                            }
                            switch (alt203) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:636:65: COMMA ( NL )?
                                    {
                                    COMMA419=(Token)match(input,COMMA,FOLLOW_COMMA_in_list_expr4179); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_COMMA.add(COMMA419);

                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:636:71: ( NL )?
                                    int alt202=2;
                                    int LA202_0 = input.LA(1);

                                    if ( (LA202_0==NL) ) {
                                        alt202=1;
                                    }
                                    switch (alt202) {
                                        case 1 :
                                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:636:71: NL
                                            {
                                            NL420=(Token)match(input,NL,FOLLOW_NL_in_list_expr4181); if (state.failed) return retval; 
                                            if ( state.backtracking==0 ) stream_NL.add(NL420);


                                            }
                                            break;

                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    char_literal421=(Token)match(input,ROUND_BRACKET_CLOSE,FOLLOW_ROUND_BRACKET_CLOSE_in_list_expr4188); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ROUND_BRACKET_CLOSE.add(char_literal421);



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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:638:1: map_or_set_expr : ( '{' ( NL )? ( map_or_set_elem_expr ( NL )? ( COMMA ( NL )? map_or_set_elem_expr ( NL )? )* )? '}' -> ^( MAP_OR_SET ( map_or_set_elem_expr )* ) | '{' ( NL )? token_ARROW ( NL )? '}' -> ^( EMPTY_MAP ) );
    public final babel17Parser.map_or_set_expr_return map_or_set_expr() throws RecognitionException {
        babel17Parser.map_or_set_expr_return retval = new babel17Parser.map_or_set_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal422=null;
        Token NL423=null;
        Token NL425=null;
        Token COMMA426=null;
        Token NL427=null;
        Token NL429=null;
        Token char_literal430=null;
        Token char_literal431=null;
        Token NL432=null;
        Token NL434=null;
        Token char_literal435=null;
        babel17Parser.map_or_set_elem_expr_return map_or_set_elem_expr424 = null;

        babel17Parser.map_or_set_elem_expr_return map_or_set_elem_expr428 = null;

        babel17Parser.token_ARROW_return token_ARROW433 = null;


        CommonTree char_literal422_tree=null;
        CommonTree NL423_tree=null;
        CommonTree NL425_tree=null;
        CommonTree COMMA426_tree=null;
        CommonTree NL427_tree=null;
        CommonTree NL429_tree=null;
        CommonTree char_literal430_tree=null;
        CommonTree char_literal431_tree=null;
        CommonTree NL432_tree=null;
        CommonTree NL434_tree=null;
        CommonTree char_literal435_tree=null;
        RewriteRuleTokenStream stream_CURLY_BRACKET_OPEN=new RewriteRuleTokenStream(adaptor,"token CURLY_BRACKET_OPEN");
        RewriteRuleTokenStream stream_CURLY_BRACKET_CLOSE=new RewriteRuleTokenStream(adaptor,"token CURLY_BRACKET_CLOSE");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_map_or_set_elem_expr=new RewriteRuleSubtreeStream(adaptor,"rule map_or_set_elem_expr");
        RewriteRuleSubtreeStream stream_token_ARROW=new RewriteRuleSubtreeStream(adaptor,"rule token_ARROW");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:639:2: ( '{' ( NL )? ( map_or_set_elem_expr ( NL )? ( COMMA ( NL )? map_or_set_elem_expr ( NL )? )* )? '}' -> ^( MAP_OR_SET ( map_or_set_elem_expr )* ) | '{' ( NL )? token_ARROW ( NL )? '}' -> ^( EMPTY_MAP ) )
            int alt214=2;
            int LA214_0 = input.LA(1);

            if ( (LA214_0==CURLY_BRACKET_OPEN) ) {
                switch ( input.LA(2) ) {
                case NL:
                    {
                    int LA214_2 = input.LA(3);

                    if ( ((LA214_2>=A_ARROW && LA214_2<=U_ARROW)) ) {
                        alt214=2;
                    }
                    else if ( (LA214_2==L_begin||(LA214_2>=L_obj && LA214_2<=L_if)||(LA214_2>=L_while && LA214_2<=L_for)||(LA214_2>=L_match && LA214_2<=L_case)||LA214_2==L_exception||(LA214_2>=A_infinity && LA214_2<=U_infinity)||(LA214_2>=L_concurrent && LA214_2<=L_lazy)||(LA214_2>=L_true && LA214_2<=L_nil)||LA214_2==MINUS||LA214_2==A_NOT||LA214_2==U_NOT||LA214_2==TILDE||(LA214_2>=Constr && LA214_2<=Num)||(LA214_2>=String && LA214_2<=ROUND_BRACKET_OPEN)||LA214_2==SQUARE_BRACKET_OPEN||(LA214_2>=CURLY_BRACKET_OPEN && LA214_2<=UNDERSCORE)) ) {
                        alt214=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 214, 2, input);

                        throw nvae;
                    }
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
                    alt214=1;
                    }
                    break;
                case A_ARROW:
                case U_ARROW:
                    {
                    alt214=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 214, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 214, 0, input);

                throw nvae;
            }
            switch (alt214) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:639:4: '{' ( NL )? ( map_or_set_elem_expr ( NL )? ( COMMA ( NL )? map_or_set_elem_expr ( NL )? )* )? '}'
                    {
                    char_literal422=(Token)match(input,CURLY_BRACKET_OPEN,FOLLOW_CURLY_BRACKET_OPEN_in_map_or_set_expr4217); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_OPEN.add(char_literal422);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:639:8: ( NL )?
                    int alt206=2;
                    int LA206_0 = input.LA(1);

                    if ( (LA206_0==NL) ) {
                        alt206=1;
                    }
                    switch (alt206) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:639:8: NL
                            {
                            NL423=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_expr4219); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL423);


                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:639:12: ( map_or_set_elem_expr ( NL )? ( COMMA ( NL )? map_or_set_elem_expr ( NL )? )* )?
                    int alt211=2;
                    int LA211_0 = input.LA(1);

                    if ( (LA211_0==L_begin||(LA211_0>=L_obj && LA211_0<=L_if)||(LA211_0>=L_while && LA211_0<=L_for)||(LA211_0>=L_match && LA211_0<=L_case)||LA211_0==L_exception||(LA211_0>=A_infinity && LA211_0<=U_infinity)||(LA211_0>=L_concurrent && LA211_0<=L_lazy)||(LA211_0>=L_true && LA211_0<=L_nil)||LA211_0==MINUS||LA211_0==A_NOT||LA211_0==U_NOT||LA211_0==TILDE||(LA211_0>=Constr && LA211_0<=Num)||(LA211_0>=String && LA211_0<=ROUND_BRACKET_OPEN)||LA211_0==SQUARE_BRACKET_OPEN||LA211_0==CURLY_BRACKET_OPEN||LA211_0==UNDERSCORE) ) {
                        alt211=1;
                    }
                    switch (alt211) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:639:13: map_or_set_elem_expr ( NL )? ( COMMA ( NL )? map_or_set_elem_expr ( NL )? )*
                            {
                            pushFollow(FOLLOW_map_or_set_elem_expr_in_map_or_set_expr4223);
                            map_or_set_elem_expr424=map_or_set_elem_expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_map_or_set_elem_expr.add(map_or_set_elem_expr424.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:639:34: ( NL )?
                            int alt207=2;
                            int LA207_0 = input.LA(1);

                            if ( (LA207_0==NL) ) {
                                alt207=1;
                            }
                            switch (alt207) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:639:34: NL
                                    {
                                    NL425=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_expr4225); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL425);


                                    }
                                    break;

                            }

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:639:38: ( COMMA ( NL )? map_or_set_elem_expr ( NL )? )*
                            loop210:
                            do {
                                int alt210=2;
                                int LA210_0 = input.LA(1);

                                if ( (LA210_0==COMMA) ) {
                                    alt210=1;
                                }


                                switch (alt210) {
                            	case 1 :
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:639:39: COMMA ( NL )? map_or_set_elem_expr ( NL )?
                            	    {
                            	    COMMA426=(Token)match(input,COMMA,FOLLOW_COMMA_in_map_or_set_expr4229); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA426);

                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:639:45: ( NL )?
                            	    int alt208=2;
                            	    int LA208_0 = input.LA(1);

                            	    if ( (LA208_0==NL) ) {
                            	        alt208=1;
                            	    }
                            	    switch (alt208) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:639:45: NL
                            	            {
                            	            NL427=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_expr4231); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL427);


                            	            }
                            	            break;

                            	    }

                            	    pushFollow(FOLLOW_map_or_set_elem_expr_in_map_or_set_expr4234);
                            	    map_or_set_elem_expr428=map_or_set_elem_expr();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_map_or_set_elem_expr.add(map_or_set_elem_expr428.getTree());
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:639:70: ( NL )?
                            	    int alt209=2;
                            	    int LA209_0 = input.LA(1);

                            	    if ( (LA209_0==NL) ) {
                            	        alt209=1;
                            	    }
                            	    switch (alt209) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:639:70: NL
                            	            {
                            	            NL429=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_expr4236); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL429);


                            	            }
                            	            break;

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop210;
                                }
                            } while (true);


                            }
                            break;

                    }

                    char_literal430=(Token)match(input,CURLY_BRACKET_CLOSE,FOLLOW_CURLY_BRACKET_CLOSE_in_map_or_set_expr4243); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_CLOSE.add(char_literal430);



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
                    // 639:82: -> ^( MAP_OR_SET ( map_or_set_elem_expr )* )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:639:85: ^( MAP_OR_SET ( map_or_set_elem_expr )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MAP_OR_SET, "MAP_OR_SET"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:639:98: ( map_or_set_elem_expr )*
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
                    char_literal431=(Token)match(input,CURLY_BRACKET_OPEN,FOLLOW_CURLY_BRACKET_OPEN_in_map_or_set_expr4263); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_OPEN.add(char_literal431);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:640:14: ( NL )?
                    int alt212=2;
                    int LA212_0 = input.LA(1);

                    if ( (LA212_0==NL) ) {
                        alt212=1;
                    }
                    switch (alt212) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:640:14: NL
                            {
                            NL432=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_expr4265); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL432);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_token_ARROW_in_map_or_set_expr4268);
                    token_ARROW433=token_ARROW();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_token_ARROW.add(token_ARROW433.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:640:30: ( NL )?
                    int alt213=2;
                    int LA213_0 = input.LA(1);

                    if ( (LA213_0==NL) ) {
                        alt213=1;
                    }
                    switch (alt213) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:640:30: NL
                            {
                            NL434=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_expr4270); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL434);


                            }
                            break;

                    }

                    char_literal435=(Token)match(input,CURLY_BRACKET_CLOSE,FOLLOW_CURLY_BRACKET_CLOSE_in_map_or_set_expr4273); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_CLOSE.add(char_literal435);



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

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:642:1: map_or_set_elem_expr : protected_expr ( ( NL )? token_ARROW ( NL )? protected_expr )? -> ^( NIL_TOKEN ( protected_expr )* ) ;
    public final babel17Parser.map_or_set_elem_expr_return map_or_set_elem_expr() throws RecognitionException {
        babel17Parser.map_or_set_elem_expr_return retval = new babel17Parser.map_or_set_elem_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL437=null;
        Token NL439=null;
        babel17Parser.protected_expr_return protected_expr436 = null;

        babel17Parser.token_ARROW_return token_ARROW438 = null;

        babel17Parser.protected_expr_return protected_expr440 = null;


        CommonTree NL437_tree=null;
        CommonTree NL439_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_protected_expr=new RewriteRuleSubtreeStream(adaptor,"rule protected_expr");
        RewriteRuleSubtreeStream stream_token_ARROW=new RewriteRuleSubtreeStream(adaptor,"rule token_ARROW");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:643:2: ( protected_expr ( ( NL )? token_ARROW ( NL )? protected_expr )? -> ^( NIL_TOKEN ( protected_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:643:4: protected_expr ( ( NL )? token_ARROW ( NL )? protected_expr )?
            {
            pushFollow(FOLLOW_protected_expr_in_map_or_set_elem_expr4290);
            protected_expr436=protected_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr436.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:643:20: ( ( NL )? token_ARROW ( NL )? protected_expr )?
            int alt217=2;
            int LA217_0 = input.LA(1);

            if ( (LA217_0==NL) ) {
                int LA217_1 = input.LA(2);

                if ( ((LA217_1>=A_ARROW && LA217_1<=U_ARROW)) ) {
                    alt217=1;
                }
            }
            else if ( ((LA217_0>=A_ARROW && LA217_0<=U_ARROW)) ) {
                alt217=1;
            }
            switch (alt217) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:643:21: ( NL )? token_ARROW ( NL )? protected_expr
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:643:21: ( NL )?
                    int alt215=2;
                    int LA215_0 = input.LA(1);

                    if ( (LA215_0==NL) ) {
                        alt215=1;
                    }
                    switch (alt215) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:643:21: NL
                            {
                            NL437=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_elem_expr4294); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL437);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_token_ARROW_in_map_or_set_elem_expr4297);
                    token_ARROW438=token_ARROW();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_token_ARROW.add(token_ARROW438.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:643:37: ( NL )?
                    int alt216=2;
                    int LA216_0 = input.LA(1);

                    if ( (LA216_0==NL) ) {
                        alt216=1;
                    }
                    switch (alt216) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:643:37: NL
                            {
                            NL439=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_elem_expr4299); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL439);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_protected_expr_in_map_or_set_elem_expr4302);
                    protected_expr440=protected_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr440.getTree());

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
            // 643:58: -> ^( NIL_TOKEN ( protected_expr )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:643:61: ^( NIL_TOKEN ( protected_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:643:73: ( protected_expr )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:645:1: primitive_expr : ( Num | String | Id | Constr | L_true | L_false | L_this | L_nil | token_infinity | list_expr | with_control_expr | map_or_set_expr );
    public final babel17Parser.primitive_expr_return primitive_expr() throws RecognitionException {
        babel17Parser.primitive_expr_return retval = new babel17Parser.primitive_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Num441=null;
        Token String442=null;
        Token Id443=null;
        Token Constr444=null;
        Token L_true445=null;
        Token L_false446=null;
        Token L_this447=null;
        Token L_nil448=null;
        babel17Parser.token_infinity_return token_infinity449 = null;

        babel17Parser.list_expr_return list_expr450 = null;

        babel17Parser.with_control_expr_return with_control_expr451 = null;

        babel17Parser.map_or_set_expr_return map_or_set_expr452 = null;


        CommonTree Num441_tree=null;
        CommonTree String442_tree=null;
        CommonTree Id443_tree=null;
        CommonTree Constr444_tree=null;
        CommonTree L_true445_tree=null;
        CommonTree L_false446_tree=null;
        CommonTree L_this447_tree=null;
        CommonTree L_nil448_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:646:2: ( Num | String | Id | Constr | L_true | L_false | L_this | L_nil | token_infinity | list_expr | with_control_expr | map_or_set_expr )
            int alt218=12;
            switch ( input.LA(1) ) {
            case Num:
                {
                alt218=1;
                }
                break;
            case String:
                {
                alt218=2;
                }
                break;
            case Id:
                {
                alt218=3;
                }
                break;
            case Constr:
                {
                alt218=4;
                }
                break;
            case L_true:
                {
                alt218=5;
                }
                break;
            case L_false:
                {
                alt218=6;
                }
                break;
            case L_this:
                {
                alt218=7;
                }
                break;
            case L_nil:
                {
                alt218=8;
                }
                break;
            case A_infinity:
            case U_infinity:
                {
                alt218=9;
                }
                break;
            case ROUND_BRACKET_OPEN:
            case SQUARE_BRACKET_OPEN:
                {
                alt218=10;
                }
                break;
            case L_begin:
            case L_with:
            case L_if:
            case L_while:
            case L_for:
            case L_match:
                {
                alt218=11;
                }
                break;
            case CURLY_BRACKET_OPEN:
                {
                alt218=12;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 218, 0, input);

                throw nvae;
            }

            switch (alt218) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:646:4: Num
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Num441=(Token)match(input,Num,FOLLOW_Num_in_primitive_expr4322); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Num441_tree = (CommonTree)adaptor.create(Num441);
                    adaptor.addChild(root_0, Num441_tree);
                    }

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:647:4: String
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    String442=(Token)match(input,String,FOLLOW_String_in_primitive_expr4327); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    String442_tree = (CommonTree)adaptor.create(String442);
                    adaptor.addChild(root_0, String442_tree);
                    }

                    }
                    break;
                case 3 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:648:4: Id
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Id443=(Token)match(input,Id,FOLLOW_Id_in_primitive_expr4332); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Id443_tree = (CommonTree)adaptor.create(Id443);
                    adaptor.addChild(root_0, Id443_tree);
                    }

                    }
                    break;
                case 4 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:649:4: Constr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Constr444=(Token)match(input,Constr,FOLLOW_Constr_in_primitive_expr4337); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Constr444_tree = (CommonTree)adaptor.create(Constr444);
                    adaptor.addChild(root_0, Constr444_tree);
                    }

                    }
                    break;
                case 5 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:650:4: L_true
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    L_true445=(Token)match(input,L_true,FOLLOW_L_true_in_primitive_expr4342); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    L_true445_tree = (CommonTree)adaptor.create(L_true445);
                    adaptor.addChild(root_0, L_true445_tree);
                    }

                    }
                    break;
                case 6 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:651:4: L_false
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    L_false446=(Token)match(input,L_false,FOLLOW_L_false_in_primitive_expr4347); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    L_false446_tree = (CommonTree)adaptor.create(L_false446);
                    adaptor.addChild(root_0, L_false446_tree);
                    }

                    }
                    break;
                case 7 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:652:4: L_this
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    L_this447=(Token)match(input,L_this,FOLLOW_L_this_in_primitive_expr4352); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    L_this447_tree = (CommonTree)adaptor.create(L_this447);
                    adaptor.addChild(root_0, L_this447_tree);
                    }

                    }
                    break;
                case 8 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:653:5: L_nil
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    L_nil448=(Token)match(input,L_nil,FOLLOW_L_nil_in_primitive_expr4359); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    L_nil448_tree = (CommonTree)adaptor.create(L_nil448);
                    adaptor.addChild(root_0, L_nil448_tree);
                    }

                    }
                    break;
                case 9 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:654:4: token_infinity
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_infinity_in_primitive_expr4364);
                    token_infinity449=token_infinity();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, token_infinity449.getTree());

                    }
                    break;
                case 10 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:655:5: list_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_list_expr_in_primitive_expr4370);
                    list_expr450=list_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, list_expr450.getTree());

                    }
                    break;
                case 11 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:656:4: with_control_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_with_control_expr_in_primitive_expr4375);
                    with_control_expr451=with_control_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, with_control_expr451.getTree());

                    }
                    break;
                case 12 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:657:4: map_or_set_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_map_or_set_expr_in_primitive_expr4380);
                    map_or_set_expr452=map_or_set_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, map_or_set_expr452.getTree());

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

        Token EOF454=null;
        babel17Parser.block_return block453 = null;


        CommonTree EOF454_tree=null;
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:659:7: ( block EOF -> ^( PROG block ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:659:9: block EOF
            {
            pushFollow(FOLLOW_block_in_prog4390);
            block453=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block453.getTree());
            EOF454=(Token)match(input,EOF,FOLLOW_EOF_in_prog4392); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EOF.add(EOF454);



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
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:359:10: ( Id ( NL )? L_as )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:359:11: Id ( NL )? L_as
        {
        match(input,Id,FOLLOW_Id_in_synpred1_babel171591); if (state.failed) return ;
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:359:14: ( NL )?
        int alt219=2;
        int LA219_0 = input.LA(1);

        if ( (LA219_0==NL) ) {
            alt219=1;
        }
        switch (alt219) {
            case 1 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:359:14: NL
                {
                match(input,NL,FOLLOW_NL_in_synpred1_babel171593); if (state.failed) return ;

                }
                break;

        }

        match(input,L_as,FOLLOW_L_as_in_synpred1_babel171596); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_babel17

    // $ANTLR start synpred2_babel17
    public final void synpred2_babel17_fragment() throws RecognitionException {   
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:360:4: ( protected_expr ( NL )? QUESTION_MARK )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:360:5: protected_expr ( NL )? QUESTION_MARK
        {
        pushFollow(FOLLOW_protected_expr_in_synpred2_babel171627);
        protected_expr();

        state._fsp--;
        if (state.failed) return ;
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:360:20: ( NL )?
        int alt220=2;
        int LA220_0 = input.LA(1);

        if ( (LA220_0==NL) ) {
            alt220=1;
        }
        switch (alt220) {
            case 1 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:360:20: NL
                {
                match(input,NL,FOLLOW_NL_in_synpred2_babel171629); if (state.failed) return ;

                }
                break;

        }

        match(input,QUESTION_MARK,FOLLOW_QUESTION_MARK_in_synpred2_babel171632); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_babel17

    // $ANTLR start synpred3_babel17
    public final void synpred3_babel17_fragment() throws RecognitionException {   
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:424:4: ( ( pattern | objelem_assign ) ( NL )? '=' )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:424:5: ( pattern | objelem_assign ) ( NL )? '='
        {
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:424:5: ( pattern | objelem_assign )
        int alt221=2;
        int LA221_0 = input.LA(1);

        if ( ((LA221_0>=A_infinity && LA221_0<=U_infinity)||(LA221_0>=L_true && LA221_0<=L_false)||LA221_0==MINUS||LA221_0==Constr||LA221_0==Num||(LA221_0>=String && LA221_0<=ROUND_BRACKET_OPEN)||LA221_0==SQUARE_BRACKET_OPEN||LA221_0==CURLY_BRACKET_OPEN||LA221_0==UNDERSCORE) ) {
            alt221=1;
        }
        else if ( (LA221_0==Id) ) {
            int LA221_2 = input.LA(2);

            if ( (LA221_2==PERIOD) ) {
                alt221=2;
            }
            else if ( (LA221_2==ASSIGN||(LA221_2>=A_DOUBLE_COLON && LA221_2<=U_DOUBLE_COLON)||LA221_2==NL) ) {
                alt221=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 221, 2, input);

                throw nvae;
            }
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 221, 0, input);

            throw nvae;
        }
        switch (alt221) {
            case 1 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:424:6: pattern
                {
                pushFollow(FOLLOW_pattern_in_synpred3_babel172353);
                pattern();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:424:16: objelem_assign
                {
                pushFollow(FOLLOW_objelem_assign_in_synpred3_babel172357);
                objelem_assign();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:424:32: ( NL )?
        int alt222=2;
        int LA222_0 = input.LA(1);

        if ( (LA222_0==NL) ) {
            alt222=1;
        }
        switch (alt222) {
            case 1 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:424:32: NL
                {
                match(input,NL,FOLLOW_NL_in_synpred3_babel172360); if (state.failed) return ;

                }
                break;

        }

        match(input,ASSIGN,FOLLOW_ASSIGN_in_synpred3_babel172363); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_babel17

    // $ANTLR start synpred4_babel17
    public final void synpred4_babel17_fragment() throws RecognitionException {   
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:456:11: ( L_obj ( NL )? parents )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:456:12: L_obj ( NL )? parents
        {
        match(input,L_obj,FOLLOW_L_obj_in_synpred4_babel172570); if (state.failed) return ;
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:456:18: ( NL )?
        int alt223=2;
        int LA223_0 = input.LA(1);

        if ( (LA223_0==NL) ) {
            alt223=1;
        }
        switch (alt223) {
            case 1 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:456:18: NL
                {
                match(input,NL,FOLLOW_NL_in_synpred4_babel172572); if (state.failed) return ;

                }
                break;

        }

        pushFollow(FOLLOW_parents_in_synpred4_babel172575);
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
        pushFollow(FOLLOW_lambda_expr_in_synpred5_babel172644);
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
        pushFollow(FOLLOW_protected_lambda_expr_in_synpred6_babel172665);
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
    protected DFA44 dfa44 = new DFA44(this);
    protected DFA50 dfa50 = new DFA50(this);
    protected DFA47 dfa47 = new DFA47(this);
    protected DFA67 dfa67 = new DFA67(this);
    protected DFA78 dfa78 = new DFA78(this);
    protected DFA79 dfa79 = new DFA79(this);
    static final String DFA16_eotS =
        "\35\uffff";
    static final String DFA16_eofS =
        "\35\uffff";
    static final String DFA16_minS =
        "\1\62\14\0\20\uffff";
    static final String DFA16_maxS =
        "\1\u008a\14\0\20\uffff";
    static final String DFA16_acceptS =
        "\15\uffff\14\2\1\4\1\5\1\1\1\3";
    static final String DFA16_specialS =
        "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\20\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\26\1\uffff\1\30\1\27\1\22\3\uffff\1\23\1\25\2\uffff\1\24"+
            "\1\15\1\uffff\1\31\2\uffff\1\16\2\uffff\2\10\3\uffff\3\16\1"+
            "\uffff\1\6\1\7\1\20\1\16\1\21\15\uffff\1\11\6\uffff\1\17\2\uffff"+
            "\1\17\11\uffff\2\32\3\uffff\1\16\3\uffff\1\2\1\1\1\5\1\uffff"+
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
            return "358:1: bracket_pattern : ( ( Id ( NL )? L_as )=> Id ( NL )? L_as ( NL )? pattern -> ^( L_as Id pattern ) | ( protected_expr ( NL )? QUESTION_MARK )=> protected_expr ( NL )? QUESTION_MARK ( ( NL )? pattern )? -> ^( QUESTION_MARK protected_expr ( pattern )? ) | pattern ( ( NL )? L_if ( NL )? protected_expr )? -> ^( IF_PATTERN pattern ( protected_expr )? ) | L_val ( NL )? protected_expr -> ^( L_val protected_expr ) | token_ELLIPSIS );";
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

                        else if ( (LA16_0==L_nil) && (synpred2_babel17())) {s = 17;}

                        else if ( (LA16_0==L_if) && (synpred2_babel17())) {s = 18;}

                        else if ( (LA16_0==L_while) && (synpred2_babel17())) {s = 19;}

                        else if ( (LA16_0==L_match) && (synpred2_babel17())) {s = 20;}

                        else if ( (LA16_0==L_for) && (synpred2_babel17())) {s = 21;}

                        else if ( (LA16_0==L_begin) && (synpred2_babel17())) {s = 22;}

                        else if ( (LA16_0==L_with) && (synpred2_babel17())) {s = 23;}

                        else if ( (LA16_0==L_obj) && (synpred2_babel17())) {s = 24;}

                        else if ( (LA16_0==L_val) ) {s = 25;}

                        else if ( ((LA16_0>=A_ELLIPSIS && LA16_0<=U_ELLIPSIS)) ) {s = 26;}

                         
                        input.seek(index16_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA16_1 = input.LA(1);

                         
                        int index16_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_babel17()) ) {s = 27;}

                        else if ( (synpred2_babel17()) ) {s = 24;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index16_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA16_2 = input.LA(1);

                         
                        int index16_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 24;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index16_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA16_3 = input.LA(1);

                         
                        int index16_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 24;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index16_3);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA16_4 = input.LA(1);

                         
                        int index16_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 24;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index16_4);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA16_5 = input.LA(1);

                         
                        int index16_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 24;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index16_5);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA16_6 = input.LA(1);

                         
                        int index16_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 24;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index16_6);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA16_7 = input.LA(1);

                         
                        int index16_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 24;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index16_7);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA16_8 = input.LA(1);

                         
                        int index16_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 24;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index16_8);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA16_9 = input.LA(1);

                         
                        int index16_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 24;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index16_9);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA16_10 = input.LA(1);

                         
                        int index16_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 24;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index16_10);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA16_11 = input.LA(1);

                         
                        int index16_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 24;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index16_11);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA16_12 = input.LA(1);

                         
                        int index16_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 24;}

                        else if ( (true) ) {s = 28;}

                         
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
        "\1\107\7\uffff\1\107\2\uffff\1\62\1\107\2\uffff\1\62\2\uffff";
    static final String DFA44_maxS =
        "\1\u008a\7\uffff\1\u0081\2\uffff\1\u008a\1\u0081\2\uffff\1\u008a"+
        "\2\uffff";
    static final String DFA44_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff\1\12\1\13\2\uffff\1"+
        "\10\1\11\1\uffff\1\14\1\15";
    static final String DFA44_specialS =
        "\22\uffff}>";
    static final String[] DFA44_transitionS = {
            "\2\7\7\uffff\1\5\1\6\20\uffff\1\10\35\uffff\1\1\1\4\1\uffff"+
            "\1\3\1\12\1\uffff\1\11\1\uffff\1\13\1\uffff\1\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\15\65\uffff\1\14\2\uffff\1\16",
            "",
            "",
            "\1\20\1\uffff\3\20\3\uffff\2\20\2\uffff\2\20\1\uffff\1\20\2"+
            "\uffff\1\20\2\uffff\2\20\3\uffff\3\20\1\uffff\5\20\15\uffff"+
            "\1\20\6\uffff\1\20\2\uffff\1\20\7\uffff\2\21\2\20\3\uffff\1"+
            "\20\2\uffff\1\17\3\20\1\uffff\2\20\1\uffff\1\20\1\uffff\3\20",
            "\2\15\70\uffff\1\16",
            "",
            "",
            "\1\20\1\uffff\3\20\3\uffff\2\20\2\uffff\2\20\1\uffff\1\20\2"+
            "\uffff\1\20\2\uffff\2\20\3\uffff\3\20\1\uffff\5\20\15\uffff"+
            "\1\20\6\uffff\1\20\2\uffff\1\20\7\uffff\2\21\2\20\3\uffff\1"+
            "\20\3\uffff\3\20\1\uffff\2\20\1\uffff\1\20\1\uffff\3\20",
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
            return "370:1: primitive_pattern : ( Id | '_' -> ANY | String | Num | L_true | L_false | token_infinity | '-' ( NL )? token_infinity -> ^( UMINUS token_infinity ) | '-' ( NL )? Num -> ^( UMINUS Num ) | '[' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* )? ']' -> ^( SQUARE_LIST ( bracket_pattern )* ) | '(' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* ( COMMA ( NL )? )? )? ')' -> ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( bracket_pattern )* ) ) | '{' ( NL )? ( mselem_pattern ( NL )? ( COMMA ( NL )? mselem_pattern ( NL )? )* )? '}' -> ^( MAP_OR_SET ( mselem_pattern )* ) | '{' ( NL )? token_ARROW ( NL )? '}' -> ^( EMPTY_MAP ) );";
        }
    }
    static final String DFA50_eotS =
        "\4\uffff";
    static final String DFA50_eofS =
        "\2\3\2\uffff";
    static final String DFA50_minS =
        "\2\62\2\uffff";
    static final String DFA50_maxS =
        "\2\u008a\2\uffff";
    static final String DFA50_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA50_specialS =
        "\4\uffff}>";
    static final String[] DFA50_transitionS = {
            "\1\2\1\3\3\2\1\uffff\2\3\2\2\1\uffff\2\2\1\3\1\uffff\2\2\1\uffff"+
            "\1\2\2\uffff\2\2\3\uffff\11\2\13\uffff\1\1\1\uffff\1\2\6\uffff"+
            "\1\2\2\uffff\1\2\16\uffff\1\2\2\uffff\1\1\3\2\1\uffff\2\2\1"+
            "\uffff\1\2\1\uffff\1\2\1\uffff\1\2",
            "\1\2\1\3\3\2\1\uffff\2\3\2\2\1\uffff\2\2\1\3\1\uffff\2\2\1"+
            "\uffff\1\2\2\uffff\2\2\3\uffff\11\2\13\uffff\1\1\1\uffff\1\2"+
            "\6\uffff\1\2\2\uffff\1\2\16\uffff\1\2\2\uffff\1\1\3\2\1\uffff"+
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
            return "392:1: block : ( ( sep )? statement ( sep statement )* ( sep )? -> ^( BLOCK ( statement )* ) | ( sep )? -> ^( BLOCK ) );";
        }
    }
    static final String DFA47_eotS =
        "\4\uffff";
    static final String DFA47_eofS =
        "\2\2\2\uffff";
    static final String DFA47_minS =
        "\1\63\1\62\2\uffff";
    static final String DFA47_maxS =
        "\1\176\1\u008a\2\uffff";
    static final String DFA47_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA47_specialS =
        "\4\uffff}>";
    static final String[] DFA47_transitionS = {
            "\1\2\4\uffff\2\2\5\uffff\1\2\40\uffff\1\1\35\uffff\1\1",
            "\1\3\1\2\3\3\1\uffff\2\2\2\3\1\uffff\2\3\1\2\1\uffff\2\3\1"+
            "\uffff\1\3\2\uffff\2\3\3\uffff\11\3\13\uffff\1\1\1\uffff\1\3"+
            "\6\uffff\1\3\2\uffff\1\3\16\uffff\1\3\2\uffff\1\1\3\3\1\uffff"+
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
            return "()* loopback of 392:25: ( sep statement )*";
        }
    }
    static final String DFA67_eotS =
        "\31\uffff";
    static final String DFA67_eofS =
        "\31\uffff";
    static final String DFA67_minS =
        "\1\62\14\0\14\uffff";
    static final String DFA67_maxS =
        "\1\u008a\14\0\14\uffff";
    static final String DFA67_acceptS =
        "\15\uffff\1\2\12\uffff\1\1";
    static final String DFA67_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\14"+
        "\uffff}>";
    static final String[] DFA67_transitionS = {
            "\1\15\1\uffff\3\15\3\uffff\2\15\2\uffff\1\15\5\uffff\1\15\2"+
            "\uffff\2\10\3\uffff\3\15\1\uffff\1\6\1\7\3\15\15\uffff\1\11"+
            "\6\uffff\1\15\2\uffff\1\15\16\uffff\1\15\3\uffff\1\1\1\2\1\5"+
            "\1\uffff\1\4\1\13\1\uffff\1\12\1\uffff\1\14\1\uffff\1\3",
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
            ""
    };

    static final short[] DFA67_eot = DFA.unpackEncodedString(DFA67_eotS);
    static final short[] DFA67_eof = DFA.unpackEncodedString(DFA67_eofS);
    static final char[] DFA67_min = DFA.unpackEncodedStringToUnsignedChars(DFA67_minS);
    static final char[] DFA67_max = DFA.unpackEncodedStringToUnsignedChars(DFA67_maxS);
    static final short[] DFA67_accept = DFA.unpackEncodedString(DFA67_acceptS);
    static final short[] DFA67_special = DFA.unpackEncodedString(DFA67_specialS);
    static final short[][] DFA67_transition;

    static {
        int numStates = DFA67_transitionS.length;
        DFA67_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA67_transition[i] = DFA.unpackEncodedString(DFA67_transitionS[i]);
        }
    }

    class DFA67 extends DFA {

        public DFA67(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 67;
            this.eot = DFA67_eot;
            this.eof = DFA67_eof;
            this.min = DFA67_min;
            this.max = DFA67_max;
            this.accept = DFA67_accept;
            this.special = DFA67_special;
            this.transition = DFA67_transition;
        }
        public String getDescription() {
            return "423:1: expr_or_assign : ( ( ( pattern | objelem_assign ) ( NL )? '=' )=> ( pattern | objelem_assign ) ( NL )? '=' ( NL )? expr -> ^( ASSIGN pattern expr ) | expr );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA67_1 = input.LA(1);

                         
                        int index67_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 24;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index67_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA67_2 = input.LA(1);

                         
                        int index67_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 24;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index67_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA67_3 = input.LA(1);

                         
                        int index67_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 24;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index67_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA67_4 = input.LA(1);

                         
                        int index67_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 24;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index67_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA67_5 = input.LA(1);

                         
                        int index67_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 24;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index67_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA67_6 = input.LA(1);

                         
                        int index67_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 24;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index67_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA67_7 = input.LA(1);

                         
                        int index67_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 24;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index67_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA67_8 = input.LA(1);

                         
                        int index67_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 24;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index67_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA67_9 = input.LA(1);

                         
                        int index67_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 24;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index67_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA67_10 = input.LA(1);

                         
                        int index67_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 24;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index67_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA67_11 = input.LA(1);

                         
                        int index67_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 24;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index67_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA67_12 = input.LA(1);

                         
                        int index67_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 24;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index67_12);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 67, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA78_eotS =
        "\27\uffff";
    static final String DFA78_eofS =
        "\27\uffff";
    static final String DFA78_minS =
        "\1\62\2\0\1\uffff\11\0\12\uffff";
    static final String DFA78_maxS =
        "\1\u008a\2\0\1\uffff\11\0\12\uffff";
    static final String DFA78_acceptS =
        "\3\uffff\1\1\11\uffff\1\2\11\uffff";
    static final String DFA78_specialS =
        "\1\0\1\1\1\2\1\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\12"+
        "\uffff}>";
    static final String[] DFA78_transitionS = {
            "\1\15\2\uffff\2\15\3\uffff\2\15\2\uffff\1\15\5\uffff\1\15\2"+
            "\uffff\2\10\3\uffff\3\15\1\uffff\1\6\1\7\3\15\15\uffff\1\11"+
            "\6\uffff\1\15\2\uffff\1\15\16\uffff\1\15\3\uffff\1\1\1\2\1\5"+
            "\1\uffff\1\4\1\13\1\uffff\1\12\1\uffff\1\14\1\uffff\1\3",
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

    static final short[] DFA78_eot = DFA.unpackEncodedString(DFA78_eotS);
    static final short[] DFA78_eof = DFA.unpackEncodedString(DFA78_eofS);
    static final char[] DFA78_min = DFA.unpackEncodedStringToUnsignedChars(DFA78_minS);
    static final char[] DFA78_max = DFA.unpackEncodedStringToUnsignedChars(DFA78_maxS);
    static final short[] DFA78_accept = DFA.unpackEncodedString(DFA78_acceptS);
    static final short[] DFA78_special = DFA.unpackEncodedString(DFA78_specialS);
    static final short[][] DFA78_transition;

    static {
        int numStates = DFA78_transitionS.length;
        DFA78_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA78_transition[i] = DFA.unpackEncodedString(DFA78_transitionS[i]);
        }
    }

    class DFA78 extends DFA {

        public DFA78(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 78;
            this.eot = DFA78_eot;
            this.eof = DFA78_eof;
            this.min = DFA78_min;
            this.max = DFA78_max;
            this.accept = DFA78_accept;
            this.special = DFA78_special;
            this.transition = DFA78_transition;
        }
        public String getDescription() {
            return "459:1: lop_expr : ( ( lambda_expr )=> lambda_expr | op_expr );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA78_0 = input.LA(1);

                         
                        int index78_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA78_0==Constr) ) {s = 1;}

                        else if ( (LA78_0==Id) ) {s = 2;}

                        else if ( (LA78_0==UNDERSCORE) && (synpred5_babel17())) {s = 3;}

                        else if ( (LA78_0==String) ) {s = 4;}

                        else if ( (LA78_0==Num) ) {s = 5;}

                        else if ( (LA78_0==L_true) ) {s = 6;}

                        else if ( (LA78_0==L_false) ) {s = 7;}

                        else if ( ((LA78_0>=A_infinity && LA78_0<=U_infinity)) ) {s = 8;}

                        else if ( (LA78_0==MINUS) ) {s = 9;}

                        else if ( (LA78_0==SQUARE_BRACKET_OPEN) ) {s = 10;}

                        else if ( (LA78_0==ROUND_BRACKET_OPEN) ) {s = 11;}

                        else if ( (LA78_0==CURLY_BRACKET_OPEN) ) {s = 12;}

                        else if ( (LA78_0==L_begin||(LA78_0>=L_with && LA78_0<=L_if)||(LA78_0>=L_while && LA78_0<=L_for)||LA78_0==L_match||LA78_0==L_exception||(LA78_0>=L_concurrent && LA78_0<=L_lazy)||(LA78_0>=L_this && LA78_0<=L_nil)||LA78_0==A_NOT||LA78_0==U_NOT||LA78_0==TILDE) ) {s = 13;}

                         
                        input.seek(index78_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA78_1 = input.LA(1);

                         
                        int index78_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_babel17()) ) {s = 3;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index78_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA78_2 = input.LA(1);

                         
                        int index78_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_babel17()) ) {s = 3;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index78_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA78_4 = input.LA(1);

                         
                        int index78_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_babel17()) ) {s = 3;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index78_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA78_5 = input.LA(1);

                         
                        int index78_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_babel17()) ) {s = 3;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index78_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA78_6 = input.LA(1);

                         
                        int index78_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_babel17()) ) {s = 3;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index78_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA78_7 = input.LA(1);

                         
                        int index78_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_babel17()) ) {s = 3;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index78_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA78_8 = input.LA(1);

                         
                        int index78_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_babel17()) ) {s = 3;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index78_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA78_9 = input.LA(1);

                         
                        int index78_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_babel17()) ) {s = 3;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index78_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA78_10 = input.LA(1);

                         
                        int index78_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_babel17()) ) {s = 3;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index78_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA78_11 = input.LA(1);

                         
                        int index78_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_babel17()) ) {s = 3;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index78_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA78_12 = input.LA(1);

                         
                        int index78_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_babel17()) ) {s = 3;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index78_12);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 78, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA79_eotS =
        "\30\uffff";
    static final String DFA79_eofS =
        "\30\uffff";
    static final String DFA79_minS =
        "\1\62\2\0\1\uffff\11\0\13\uffff";
    static final String DFA79_maxS =
        "\1\u008a\2\0\1\uffff\11\0\13\uffff";
    static final String DFA79_acceptS =
        "\3\uffff\1\1\11\uffff\1\1\1\2\11\uffff";
    static final String DFA79_specialS =
        "\1\0\1\1\1\2\1\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\13"+
        "\uffff}>";
    static final String[] DFA79_transitionS = {
            "\1\16\2\uffff\2\16\3\uffff\2\16\2\uffff\1\16\1\15\4\uffff\1"+
            "\16\2\uffff\2\10\3\uffff\3\16\1\uffff\1\6\1\7\3\16\15\uffff"+
            "\1\11\6\uffff\1\16\2\uffff\1\16\16\uffff\1\16\3\uffff\1\1\1"+
            "\2\1\5\1\uffff\1\4\1\13\1\uffff\1\12\1\uffff\1\14\1\uffff\1"+
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
            return "463:1: p_lop_expr : ( ( protected_lambda_expr )=> protected_lambda_expr | p_op_expr );";
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

                        else if ( (LA79_0==UNDERSCORE) && (synpred6_babel17())) {s = 3;}

                        else if ( (LA79_0==String) ) {s = 4;}

                        else if ( (LA79_0==Num) ) {s = 5;}

                        else if ( (LA79_0==L_true) ) {s = 6;}

                        else if ( (LA79_0==L_false) ) {s = 7;}

                        else if ( ((LA79_0>=A_infinity && LA79_0<=U_infinity)) ) {s = 8;}

                        else if ( (LA79_0==MINUS) ) {s = 9;}

                        else if ( (LA79_0==SQUARE_BRACKET_OPEN) ) {s = 10;}

                        else if ( (LA79_0==ROUND_BRACKET_OPEN) ) {s = 11;}

                        else if ( (LA79_0==CURLY_BRACKET_OPEN) ) {s = 12;}

                        else if ( (LA79_0==L_case) && (synpred6_babel17())) {s = 13;}

                        else if ( (LA79_0==L_begin||(LA79_0>=L_with && LA79_0<=L_if)||(LA79_0>=L_while && LA79_0<=L_for)||LA79_0==L_match||LA79_0==L_exception||(LA79_0>=L_concurrent && LA79_0<=L_lazy)||(LA79_0>=L_this && LA79_0<=L_nil)||LA79_0==A_NOT||LA79_0==U_NOT||LA79_0==TILDE) ) {s = 14;}

                         
                        input.seek(index79_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA79_1 = input.LA(1);

                         
                        int index79_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_babel17()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index79_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA79_2 = input.LA(1);

                         
                        int index79_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_babel17()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index79_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA79_4 = input.LA(1);

                         
                        int index79_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_babel17()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index79_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA79_5 = input.LA(1);

                         
                        int index79_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_babel17()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index79_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA79_6 = input.LA(1);

                         
                        int index79_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_babel17()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index79_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA79_7 = input.LA(1);

                         
                        int index79_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_babel17()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index79_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA79_8 = input.LA(1);

                         
                        int index79_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_babel17()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index79_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA79_9 = input.LA(1);

                         
                        int index79_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_babel17()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index79_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA79_10 = input.LA(1);

                         
                        int index79_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_babel17()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index79_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA79_11 = input.LA(1);

                         
                        int index79_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_babel17()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index79_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA79_12 = input.LA(1);

                         
                        int index79_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_babel17()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index79_12);
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
    public static final BitSet FOLLOW_Constr_in_pattern1527 = new BitSet(new long[]{0x0000000000000002L,0x4000000400030180L,0x000000000000055BL});
    public static final BitSet FOLLOW_NL_in_pattern1530 = new BitSet(new long[]{0x0000000000000000L,0x4000000400030180L,0x000000000000055BL});
    public static final BitSet FOLLOW_primitive_pattern_in_pattern1533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitive_pattern_in_pattern1549 = new BitSet(new long[]{0x0000000000000002L,0x4000600000000000L});
    public static final BitSet FOLLOW_NL_in_pattern1552 = new BitSet(new long[]{0x0000000000000000L,0x4000600000000000L});
    public static final BitSet FOLLOW_token_DOUBLE_COLON_in_pattern1555 = new BitSet(new long[]{0x0000000000000000L,0x4000000400030180L,0x000000000000055BL});
    public static final BitSet FOLLOW_NL_in_pattern1557 = new BitSet(new long[]{0x0000000000000000L,0x4000000400030180L,0x000000000000055BL});
    public static final BitSet FOLLOW_primitive_pattern_in_pattern1560 = new BitSet(new long[]{0x0000000000000002L,0x4000600000000000L});
    public static final BitSet FOLLOW_Id_in_bracket_pattern1601 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000001L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1603 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_L_as_in_bracket_pattern1606 = new BitSet(new long[]{0x0000000000000000L,0xC000000400030180L,0x000000000000055BL});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1608 = new BitSet(new long[]{0x0000000000000000L,0xC000000400030180L,0x000000000000055BL});
    public static final BitSet FOLLOW_pattern_in_bracket_pattern1611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protected_expr_in_bracket_pattern1640 = new BitSet(new long[]{0x0000000000000000L,0x4400000000000000L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1642 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_QUESTION_MARK_in_bracket_pattern1645 = new BitSet(new long[]{0x0000000000000002L,0xC000000400030180L,0x000000000000055BL});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1648 = new BitSet(new long[]{0x0000000000000000L,0xC000000400030180L,0x000000000000055BL});
    public static final BitSet FOLLOW_pattern_in_bracket_pattern1651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_bracket_pattern1669 = new BitSet(new long[]{0x0040000000000002L,0x4000000000000000L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1672 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_L_if_in_bracket_pattern1675 = new BitSet(new long[]{0xCC74000000000000L,0xC8001204001F7190L,0x000000000000055BL});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1677 = new BitSet(new long[]{0xCC74000000000000L,0xC8001204001F7190L,0x000000000000055BL});
    public static final BitSet FOLLOW_protected_expr_in_bracket_pattern1680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_val_in_bracket_pattern1698 = new BitSet(new long[]{0xCC74000000000000L,0xC8001204001F7190L,0x000000000000055BL});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1700 = new BitSet(new long[]{0xCC74000000000000L,0xC8001204001F7190L,0x000000000000055BL});
    public static final BitSet FOLLOW_protected_expr_in_bracket_pattern1703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_ELLIPSIS_in_bracket_pattern1716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracket_pattern_in_mselem_pattern1726 = new BitSet(new long[]{0x0000000000000002L,0x4030000000000000L});
    public static final BitSet FOLLOW_NL_in_mselem_pattern1729 = new BitSet(new long[]{0x0000000000000000L,0x4030000000000000L});
    public static final BitSet FOLLOW_token_ARROW_in_mselem_pattern1732 = new BitSet(new long[]{0xCC74000000000000L,0xC8C01204001F7192L,0x000000000000055BL});
    public static final BitSet FOLLOW_NL_in_mselem_pattern1734 = new BitSet(new long[]{0xCC74000000000000L,0xC8C01204001F7192L,0x000000000000055BL});
    public static final BitSet FOLLOW_bracket_pattern_in_mselem_pattern1737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Id_in_primitive_pattern1759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNDERSCORE_in_primitive_pattern1764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_String_in_primitive_pattern1773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Num_in_primitive_pattern1778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_true_in_primitive_pattern1783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_false_in_primitive_pattern1788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_infinity_in_primitive_pattern1793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_primitive_pattern1798 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000180L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern1800 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000180L});
    public static final BitSet FOLLOW_token_infinity_in_primitive_pattern1803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_primitive_pattern1816 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern1818 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_Num_in_primitive_pattern1821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SQUARE_BRACKET_OPEN_in_primitive_pattern1834 = new BitSet(new long[]{0xCC74000000000000L,0xC8C01204001F7192L,0x00000000000005DBL});
    public static final BitSet FOLLOW_NL_in_primitive_pattern1837 = new BitSet(new long[]{0xCC74000000000000L,0xC8C01204001F7192L,0x00000000000005DBL});
    public static final BitSet FOLLOW_bracket_pattern_in_primitive_pattern1841 = new BitSet(new long[]{0x0000000000000000L,0x4200000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern1843 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_COMMA_in_primitive_pattern1848 = new BitSet(new long[]{0xCC74000000000000L,0xC8C01204001F7192L,0x000000000000055BL});
    public static final BitSet FOLLOW_NL_in_primitive_pattern1850 = new BitSet(new long[]{0xCC74000000000000L,0xC8C01204001F7192L,0x000000000000055BL});
    public static final BitSet FOLLOW_bracket_pattern_in_primitive_pattern1853 = new BitSet(new long[]{0x0000000000000000L,0x4200000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern1855 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_SQUARE_BRACKET_CLOSE_in_primitive_pattern1863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROUND_BRACKET_OPEN_in_primitive_pattern1883 = new BitSet(new long[]{0xCC74000000000000L,0xC8C01204001F7192L,0x000000000000057BL});
    public static final BitSet FOLLOW_NL_in_primitive_pattern1886 = new BitSet(new long[]{0xCC74000000000000L,0xC8C01204001F7192L,0x000000000000057BL});
    public static final BitSet FOLLOW_bracket_pattern_in_primitive_pattern1890 = new BitSet(new long[]{0x0000000000000000L,0x4200000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern1892 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_COMMA_in_primitive_pattern1897 = new BitSet(new long[]{0xCC74000000000000L,0xC8C01204001F7192L,0x000000000000055BL});
    public static final BitSet FOLLOW_NL_in_primitive_pattern1900 = new BitSet(new long[]{0xCC74000000000000L,0xC8C01204001F7192L,0x000000000000055BL});
    public static final BitSet FOLLOW_bracket_pattern_in_primitive_pattern1903 = new BitSet(new long[]{0x0000000000000000L,0x4200000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern1905 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_COMMA_in_primitive_pattern1911 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern1913 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ROUND_BRACKET_CLOSE_in_primitive_pattern1920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURLY_BRACKET_OPEN_in_primitive_pattern1952 = new BitSet(new long[]{0xCC74000000000000L,0xC8C01204001F7192L,0x000000000000075BL});
    public static final BitSet FOLLOW_NL_in_primitive_pattern1955 = new BitSet(new long[]{0xCC74000000000000L,0xC8C01204001F7192L,0x000000000000075BL});
    public static final BitSet FOLLOW_mselem_pattern_in_primitive_pattern1959 = new BitSet(new long[]{0x0000000000000000L,0x4200000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern1961 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_primitive_pattern1966 = new BitSet(new long[]{0xCC74000000000000L,0xC8C01204001F7192L,0x000000000000055BL});
    public static final BitSet FOLLOW_NL_in_primitive_pattern1969 = new BitSet(new long[]{0xCC74000000000000L,0xC8C01204001F7192L,0x000000000000055BL});
    public static final BitSet FOLLOW_mselem_pattern_in_primitive_pattern1972 = new BitSet(new long[]{0x0000000000000000L,0x4200000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern1974 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_CURLY_BRACKET_CLOSE_in_primitive_pattern1982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURLY_BRACKET_OPEN_in_primitive_pattern2000 = new BitSet(new long[]{0x0000000000000000L,0x4030000000000000L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2002 = new BitSet(new long[]{0x0000000000000000L,0x4030000000000000L});
    public static final BitSet FOLLOW_token_ARROW_in_primitive_pattern2005 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2007 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_CURLY_BRACKET_CLOSE_in_primitive_pattern2010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_sep2030 = new BitSet(new long[]{0x0000000000000002L,0x4000000100000000L});
    public static final BitSet FOLLOW_sep_in_block2046 = new BitSet(new long[]{0xEC74000000000000L,0xC8001204001FF196L,0x000000000000055BL});
    public static final BitSet FOLLOW_statement_in_block2049 = new BitSet(new long[]{0x0000000000000002L,0x4000000100000000L});
    public static final BitSet FOLLOW_sep_in_block2052 = new BitSet(new long[]{0xEC74000000000000L,0xC8001204001FF196L,0x000000000000055BL});
    public static final BitSet FOLLOW_statement_in_block2054 = new BitSet(new long[]{0x0000000000000002L,0x4000000100000000L});
    public static final BitSet FOLLOW_sep_in_block2058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sep_in_block2074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_pure_block2091 = new BitSet(new long[]{0x0000000000000002L,0x4000000100000000L});
    public static final BitSet FOLLOW_sep_in_pure_block2094 = new BitSet(new long[]{0xEC74000000000000L,0xC8001204001FF196L,0x000000000000055BL});
    public static final BitSet FOLLOW_statement_in_pure_block2096 = new BitSet(new long[]{0x0000000000000002L,0x4000000100000000L});
    public static final BitSet FOLLOW_st_val_in_statement2117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_def_in_statement2122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_memoize_in_statement2127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_yield_in_statement2132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_or_assign_in_statement2137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Id_in_objelem_assign2146 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_PERIOD_in_objelem_assign2148 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_Id_in_objelem_assign2150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_val_in_st_val2169 = new BitSet(new long[]{0x0000000000000000L,0xC000000400030180L,0x000000000000055BL});
    public static final BitSet FOLLOW_NL_in_st_val2171 = new BitSet(new long[]{0x0000000000000000L,0xC000000400030180L,0x000000000000055BL});
    public static final BitSet FOLLOW_pattern_in_st_val2175 = new BitSet(new long[]{0x0000000100000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_objelem_assign_in_st_val2179 = new BitSet(new long[]{0x0000000100000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_NL_in_st_val2182 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ASSIGN_in_st_val2185 = new BitSet(new long[]{0xEC74000000000000L,0xC8001204001FF196L,0x000000000000055BL});
    public static final BitSet FOLLOW_NL_in_st_val2187 = new BitSet(new long[]{0xEC74000000000000L,0xC8001204001FF196L,0x000000000000055BL});
    public static final BitSet FOLLOW_expr_in_st_val2190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_def_in_st_def2214 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_NL_in_st_def2216 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_Id_in_st_def2219 = new BitSet(new long[]{0x0000000100000000L,0x4000000400030180L,0x000000000000055BL});
    public static final BitSet FOLLOW_NL_in_st_def2221 = new BitSet(new long[]{0x0000000100000000L,0x4000000400030180L,0x000000000000055BL});
    public static final BitSet FOLLOW_primitive_pattern_in_st_def2225 = new BitSet(new long[]{0x0000000100000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_NL_in_st_def2227 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ASSIGN_in_st_def2232 = new BitSet(new long[]{0xEC74000000000000L,0xC8001204001FF196L,0x000000000000055BL});
    public static final BitSet FOLLOW_NL_in_st_def2234 = new BitSet(new long[]{0xEC74000000000000L,0xC8001204001FF196L,0x000000000000055BL});
    public static final BitSet FOLLOW_expr_in_st_def2237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_yield_in_st_yield2266 = new BitSet(new long[]{0xEC74000000000000L,0xC8001204001FF196L,0x000000000000055BL});
    public static final BitSet FOLLOW_expr_in_st_yield2268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_memoize_in_st_memoize2286 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000011L});
    public static final BitSet FOLLOW_memid_in_st_memoize2288 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000011L});
    public static final BitSet FOLLOW_Id_in_memid2312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROUND_BRACKET_OPEN_in_memid2325 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_Id_in_memid2327 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ROUND_BRACKET_CLOSE_in_memid2329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_expr_or_assign2369 = new BitSet(new long[]{0x0000000100000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_objelem_assign_in_expr_or_assign2373 = new BitSet(new long[]{0x0000000100000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_NL_in_expr_or_assign2376 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ASSIGN_in_expr_or_assign2379 = new BitSet(new long[]{0xEC74000000000000L,0xC8001204001FF196L,0x000000000000055BL});
    public static final BitSet FOLLOW_NL_in_expr_or_assign2381 = new BitSet(new long[]{0xEC74000000000000L,0xC8001204001FF196L,0x000000000000055BL});
    public static final BitSet FOLLOW_expr_in_expr_or_assign2384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_or_assign2399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lop_expr_in_expr2410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_obj_expr_in_expr2415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_expr_in_control_expr2425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_do_expr_in_control_expr2430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_match_expr_in_control_expr2435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_expr_in_control_expr2440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_begin_end_in_control_expr2445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_control_expr_in_with_control_expr2455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_with_in_with_control_expr2460 = new BitSet(new long[]{0xCC74000000000000L,0xC8001204001F7190L,0x000000000000055BL});
    public static final BitSet FOLLOW_NL_in_with_control_expr2462 = new BitSet(new long[]{0xCC74000000000000L,0xC8001204001F7190L,0x000000000000055BL});
    public static final BitSet FOLLOW_protected_expr_in_with_control_expr2465 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_NL_in_with_control_expr2467 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_COLON_in_with_control_expr2470 = new BitSet(new long[]{0x4C44000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_NL_in_with_control_expr2472 = new BitSet(new long[]{0x4C44000000000000L});
    public static final BitSet FOLLOW_control_expr_in_with_control_expr2475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_lop_expr_in_protected_expr2496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_obj_expr_in_protected_expr2501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_begin_in_begin_end2513 = new BitSet(new long[]{0xEC7C000000000000L,0xC8001205001FF196L,0x000000000000055BL});
    public static final BitSet FOLLOW_block_in_begin_end2515 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_L_end_in_begin_end2517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_parents2535 = new BitSet(new long[]{0xCC64000000000000L,0xC8001204001F7190L,0x000000000000055BL});
    public static final BitSet FOLLOW_primitive_expr_in_parents2537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIMES_in_parents2550 = new BitSet(new long[]{0xCC64000000000000L,0xC8001204001F7190L,0x000000000000055BL});
    public static final BitSet FOLLOW_primitive_expr_in_parents2552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_obj_in_obj_expr2580 = new BitSet(new long[]{0x0000000000000000L,0x4000000A00000000L});
    public static final BitSet FOLLOW_NL_in_obj_expr2582 = new BitSet(new long[]{0x0000000000000000L,0x4000000A00000000L});
    public static final BitSet FOLLOW_parents_in_obj_expr2585 = new BitSet(new long[]{0xEC7C000000000000L,0xC8001205001FF196L,0x000000000000055BL});
    public static final BitSet FOLLOW_block_in_obj_expr2587 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_L_end_in_obj_expr2589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_obj_in_obj_expr2617 = new BitSet(new long[]{0xEC7C000000000000L,0xC8001205001FF196L,0x000000000000055BL});
    public static final BitSet FOLLOW_block_in_obj_expr2619 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_L_end_in_obj_expr2621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_expr_in_lop_expr2649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_op_expr_in_lop_expr2654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protected_lambda_expr_in_p_lop_expr2670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_op_expr_in_p_lop_expr2675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_if_in_if_expr2686 = new BitSet(new long[]{0xCC74000000000000L,0xC8001204001F7190L,0x000000000000055BL});
    public static final BitSet FOLLOW_NL_in_if_expr2688 = new BitSet(new long[]{0xCC74000000000000L,0xC8001204001F7190L,0x000000000000055BL});
    public static final BitSet FOLLOW_protected_expr_in_if_expr2691 = new BitSet(new long[]{0x0080000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_NL_in_if_expr2693 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_L_then_in_if_expr2696 = new BitSet(new long[]{0xEF7C000000000000L,0xC8001205001FF196L,0x000000000000055BL});
    public static final BitSet FOLLOW_block_in_if_expr2698 = new BitSet(new long[]{0x0308000000000000L});
    public static final BitSet FOLLOW_L_elseif_in_if_expr2704 = new BitSet(new long[]{0xCC74000000000000L,0xC8001204001F7190L,0x000000000000055BL});
    public static final BitSet FOLLOW_NL_in_if_expr2706 = new BitSet(new long[]{0xCC74000000000000L,0xC8001204001F7190L,0x000000000000055BL});
    public static final BitSet FOLLOW_protected_expr_in_if_expr2709 = new BitSet(new long[]{0x0080000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_NL_in_if_expr2711 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_L_then_in_if_expr2714 = new BitSet(new long[]{0xEF7C000000000000L,0xC8001205001FF196L,0x000000000000055BL});
    public static final BitSet FOLLOW_block_in_if_expr2716 = new BitSet(new long[]{0x0308000000000000L});
    public static final BitSet FOLLOW_L_else_in_if_expr2724 = new BitSet(new long[]{0xEC7C000000000000L,0xC8001205001FF196L,0x000000000000055BL});
    public static final BitSet FOLLOW_block_in_if_expr2726 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_L_end_in_if_expr2730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_while_in_while_do_expr2754 = new BitSet(new long[]{0xCC74000000000000L,0xC8001204001F7190L,0x000000000000055BL});
    public static final BitSet FOLLOW_NL_in_while_do_expr2756 = new BitSet(new long[]{0xCC74000000000000L,0xC8001204001F7190L,0x000000000000055BL});
    public static final BitSet FOLLOW_protected_expr_in_while_do_expr2759 = new BitSet(new long[]{0x1000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_NL_in_while_do_expr2761 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_L_do_in_while_do_expr2764 = new BitSet(new long[]{0xEC7C000000000000L,0xC8001205001FF196L,0x000000000000055BL});
    public static final BitSet FOLLOW_block_in_while_do_expr2766 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_L_end_in_while_do_expr2768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_full_cases_in_cases2798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_cases2803 = new BitSet(new long[]{0x0000000000000000L,0x400C000000000000L});
    public static final BitSet FOLLOW_NL_in_cases2805 = new BitSet(new long[]{0x0000000000000000L,0x400C000000000000L});
    public static final BitSet FOLLOW_token_DOUBLE_ARROW_in_cases2808 = new BitSet(new long[]{0xEC74000000000000L,0xC8001205001FF196L,0x000000000000055BL});
    public static final BitSet FOLLOW_block_in_cases2810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_case_expr_in_full_cases2833 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_L_case_in_case_expr2854 = new BitSet(new long[]{0x0000000000000000L,0xC000000400030180L,0x000000000000055BL});
    public static final BitSet FOLLOW_NL_in_case_expr2856 = new BitSet(new long[]{0x0000000000000000L,0xC000000400030180L,0x000000000000055BL});
    public static final BitSet FOLLOW_pattern_in_case_expr2859 = new BitSet(new long[]{0x0000000000000000L,0x400C000000000000L});
    public static final BitSet FOLLOW_NL_in_case_expr2861 = new BitSet(new long[]{0x0000000000000000L,0x400C000000000000L});
    public static final BitSet FOLLOW_token_DOUBLE_ARROW_in_case_expr2864 = new BitSet(new long[]{0xEC74000000000000L,0xC8001205001FF196L,0x000000000000055BL});
    public static final BitSet FOLLOW_block_in_case_expr2866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_match_in_match_expr2887 = new BitSet(new long[]{0xCC64000000000000L,0xC8001204001F7190L,0x000000000000055BL});
    public static final BitSet FOLLOW_NL_in_match_expr2889 = new BitSet(new long[]{0xCC64000000000000L,0xC8001204001F7190L,0x000000000000055BL});
    public static final BitSet FOLLOW_p_op_expr_in_match_expr2892 = new BitSet(new long[]{0x8000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_NL_in_match_expr2894 = new BitSet(new long[]{0x8000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_full_cases_in_match_expr2897 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_L_end_in_match_expr2899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_cases_in_lambda_expr2925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_lambda_cases2943 = new BitSet(new long[]{0x0000000000000000L,0x400C000000000000L});
    public static final BitSet FOLLOW_NL_in_lambda_cases2945 = new BitSet(new long[]{0x0000000000000000L,0x400C000000000000L});
    public static final BitSet FOLLOW_token_DOUBLE_ARROW_in_lambda_cases2948 = new BitSet(new long[]{0xCC64000000000000L,0xC8001204001F7190L,0x000000000000055BL});
    public static final BitSet FOLLOW_NL_in_lambda_cases2950 = new BitSet(new long[]{0xCC64000000000000L,0xC8001204001F7190L,0x000000000000055BL});
    public static final BitSet FOLLOW_lop_expr_in_lambda_cases2953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protected_lambda_cases_in_protected_lambda_expr2981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_case_in_p_lambda_case_expr2999 = new BitSet(new long[]{0x0000000000000000L,0xC000000400030180L,0x000000000000055BL});
    public static final BitSet FOLLOW_NL_in_p_lambda_case_expr3001 = new BitSet(new long[]{0x0000000000000000L,0xC000000400030180L,0x000000000000055BL});
    public static final BitSet FOLLOW_pattern_in_p_lambda_case_expr3004 = new BitSet(new long[]{0x0000000000000000L,0x400C000000000000L});
    public static final BitSet FOLLOW_NL_in_p_lambda_case_expr3006 = new BitSet(new long[]{0x0000000000000000L,0x400C000000000000L});
    public static final BitSet FOLLOW_token_DOUBLE_ARROW_in_p_lambda_case_expr3009 = new BitSet(new long[]{0xEC74000000000000L,0xC8001204001FF196L,0x000000000000055BL});
    public static final BitSet FOLLOW_NL_in_p_lambda_case_expr3011 = new BitSet(new long[]{0xEC74000000000000L,0xC8001204001FF196L,0x000000000000055BL});
    public static final BitSet FOLLOW_pure_block_in_p_lambda_case_expr3014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_protected_lambda_cases3035 = new BitSet(new long[]{0x0000000000000000L,0x400C000000000000L});
    public static final BitSet FOLLOW_NL_in_protected_lambda_cases3037 = new BitSet(new long[]{0x0000000000000000L,0x400C000000000000L});
    public static final BitSet FOLLOW_token_DOUBLE_ARROW_in_protected_lambda_cases3040 = new BitSet(new long[]{0xEC74000000000000L,0xC8001204001FF196L,0x000000000000055BL});
    public static final BitSet FOLLOW_NL_in_protected_lambda_cases3042 = new BitSet(new long[]{0xEC74000000000000L,0xC8001204001FF196L,0x000000000000055BL});
    public static final BitSet FOLLOW_pure_block_in_protected_lambda_cases3045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_lambda_case_expr_in_protected_lambda_cases3064 = new BitSet(new long[]{0x8000000000000002L,0xC000000400030180L,0x000000000000055BL});
    public static final BitSet FOLLOW_L_for_in_for_expr3081 = new BitSet(new long[]{0x0000000000000000L,0xC000000400030180L,0x000000000000055BL});
    public static final BitSet FOLLOW_NL_in_for_expr3083 = new BitSet(new long[]{0x0000000000000000L,0xC000000400030180L,0x000000000000055BL});
    public static final BitSet FOLLOW_pattern_in_for_expr3086 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000008L});
    public static final BitSet FOLLOW_NL_in_for_expr3088 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_L_in_in_for_expr3091 = new BitSet(new long[]{0xCC74000000000000L,0xC8001204001F7190L,0x000000000000055BL});
    public static final BitSet FOLLOW_NL_in_for_expr3093 = new BitSet(new long[]{0xCC74000000000000L,0xC8001204001F7190L,0x000000000000055BL});
    public static final BitSet FOLLOW_protected_expr_in_for_expr3096 = new BitSet(new long[]{0x1000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_NL_in_for_expr3098 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_L_do_in_for_expr3101 = new BitSet(new long[]{0xEC7C000000000000L,0xC8001205001FF196L,0x000000000000055BL});
    public static final BitSet FOLLOW_block_in_for_expr3103 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_L_end_in_for_expr3105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_builtin_primitive_in_op_expr3130 = new BitSet(new long[]{0xCC64000000000000L,0xC8001204001F7190L,0x000000000000055BL});
    public static final BitSet FOLLOW_op_expr_in_op_expr3133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bool_expr_in_op_expr3138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_builtin_primitive_in_p_op_expr3148 = new BitSet(new long[]{0xCC64000000000000L,0xC8001204001F7190L,0x000000000000055BL});
    public static final BitSet FOLLOW_NL_in_p_op_expr3151 = new BitSet(new long[]{0xCC64000000000000L,0xC8001204001F7190L,0x000000000000055BL});
    public static final BitSet FOLLOW_p_op_expr_in_p_op_expr3155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_bool_expr_in_p_op_expr3160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_builtin_primitive0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bool_or_expr_in_bool_expr3200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_bool_or_expr_in_p_bool_expr3210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bool_and_expr_in_bool_or_expr3219 = new BitSet(new long[]{0x0000000000000002L,0x4000048000000000L});
    public static final BitSet FOLLOW_NL_in_bool_or_expr3222 = new BitSet(new long[]{0x0000000000000000L,0x4000048000000000L});
    public static final BitSet FOLLOW_token_OR_in_bool_or_expr3226 = new BitSet(new long[]{0xCC64000000000000L,0xC8001204001F7190L,0x000000000000055BL});
    public static final BitSet FOLLOW_NL_in_bool_or_expr3229 = new BitSet(new long[]{0xCC64000000000000L,0xC8001204001F7190L,0x000000000000055BL});
    public static final BitSet FOLLOW_bool_and_expr_in_bool_or_expr3233 = new BitSet(new long[]{0x0000000000000002L,0x4000048000000000L});
    public static final BitSet FOLLOW_p_bool_and_expr_in_p_bool_or_expr3245 = new BitSet(new long[]{0x0000000000000002L,0x4000048000000000L});
    public static final BitSet FOLLOW_NL_in_p_bool_or_expr3248 = new BitSet(new long[]{0x0000000000000000L,0x4000048000000000L});
    public static final BitSet FOLLOW_token_OR_in_p_bool_or_expr3252 = new BitSet(new long[]{0xCC64000000000000L,0xC8001204001F7190L,0x000000000000055BL});
    public static final BitSet FOLLOW_NL_in_p_bool_or_expr3255 = new BitSet(new long[]{0xCC64000000000000L,0xC8001204001F7190L,0x000000000000055BL});
    public static final BitSet FOLLOW_p_bool_and_expr_in_p_bool_or_expr3259 = new BitSet(new long[]{0x0000000000000002L,0x4000048000000000L});
    public static final BitSet FOLLOW_bool_not_expr_in_bool_and_expr3271 = new BitSet(new long[]{0x0000000000000002L,0x4000090000000000L});
    public static final BitSet FOLLOW_NL_in_bool_and_expr3274 = new BitSet(new long[]{0x0000000000000000L,0x4000090000000000L});
    public static final BitSet FOLLOW_token_AND_in_bool_and_expr3278 = new BitSet(new long[]{0xCC64000000000000L,0xC8001204001F7190L,0x000000000000055BL});
    public static final BitSet FOLLOW_NL_in_bool_and_expr3281 = new BitSet(new long[]{0xCC64000000000000L,0xC8001204001F7190L,0x000000000000055BL});
    public static final BitSet FOLLOW_bool_not_expr_in_bool_and_expr3285 = new BitSet(new long[]{0x0000000000000002L,0x4000090000000000L});
    public static final BitSet FOLLOW_p_bool_not_expr_in_p_bool_and_expr3297 = new BitSet(new long[]{0x0000000000000002L,0x4000090000000000L});
    public static final BitSet FOLLOW_NL_in_p_bool_and_expr3300 = new BitSet(new long[]{0x0000000000000000L,0x4000090000000000L});
    public static final BitSet FOLLOW_token_AND_in_p_bool_and_expr3304 = new BitSet(new long[]{0xCC64000000000000L,0xC8001204001F7190L,0x000000000000055BL});
    public static final BitSet FOLLOW_NL_in_p_bool_and_expr3307 = new BitSet(new long[]{0xCC64000000000000L,0xC8001204001F7190L,0x000000000000055BL});
    public static final BitSet FOLLOW_p_bool_not_expr_in_p_bool_and_expr3311 = new BitSet(new long[]{0x0000000000000002L,0x4000090000000000L});
    public static final BitSet FOLLOW_token_NOT_in_bool_not_expr3323 = new BitSet(new long[]{0xCC64000000000000L,0xC8001204001F7190L,0x000000000000055BL});
    public static final BitSet FOLLOW_NL_in_bool_not_expr3326 = new BitSet(new long[]{0xCC64000000000000L,0xC8001204001F7190L,0x000000000000055BL});
    public static final BitSet FOLLOW_bool_not_expr_in_bool_not_expr3330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rel_expr_in_bool_not_expr3335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_NOT_in_p_bool_not_expr3346 = new BitSet(new long[]{0xCC64000000000000L,0xC8001204001F7190L,0x000000000000055BL});
    public static final BitSet FOLLOW_NL_in_p_bool_not_expr3349 = new BitSet(new long[]{0xCC64000000000000L,0xC8001204001F7190L,0x000000000000055BL});
    public static final BitSet FOLLOW_p_bool_not_expr_in_p_bool_not_expr3353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_rel_expr_in_p_bool_not_expr3358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arith_expr_in_rel_expr3367 = new BitSet(new long[]{0x0000000000000002L,0x40000000FFE00000L});
    public static final BitSet FOLLOW_NL_in_rel_expr3370 = new BitSet(new long[]{0x0000000000000000L,0x40000000FFE00000L});
    public static final BitSet FOLLOW_rel_op_in_rel_expr3373 = new BitSet(new long[]{0xCC64000000000000L,0xC8001204001F7190L,0x000000000000055BL});
    public static final BitSet FOLLOW_NL_in_rel_expr3375 = new BitSet(new long[]{0xCC64000000000000L,0xC8001204001F7190L,0x000000000000055BL});
    public static final BitSet FOLLOW_arith_expr_in_rel_expr3378 = new BitSet(new long[]{0x0000000000000002L,0x40000000FFE00000L});
    public static final BitSet FOLLOW_p_arith_expr_in_p_rel_expr3405 = new BitSet(new long[]{0x0000000000000002L,0x40000000FFE00000L});
    public static final BitSet FOLLOW_NL_in_p_rel_expr3408 = new BitSet(new long[]{0x0000000000000000L,0x40000000FFE00000L});
    public static final BitSet FOLLOW_rel_op_in_p_rel_expr3411 = new BitSet(new long[]{0xCC64000000000000L,0xC8001204001F7190L,0x000000000000055BL});
    public static final BitSet FOLLOW_NL_in_p_rel_expr3413 = new BitSet(new long[]{0xCC64000000000000L,0xC8001204001F7190L,0x000000000000055BL});
    public static final BitSet FOLLOW_p_arith_expr_in_p_rel_expr3416 = new BitSet(new long[]{0x0000000000000002L,0x40000000FFE00000L});
    public static final BitSet FOLLOW_token_EQUAL_in_rel_op3442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_NOT_EQUAL_in_rel_op3446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNRELATED_in_rel_op3450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATER_in_rel_op3454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_GREATER_EQ_in_rel_op3458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_in_rel_op3462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_LESS_EQ_in_rel_op3466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_plusplus_expr_in_arith_expr3478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_plusplus_expr_in_p_arith_expr3488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timestimes_expr_in_plusplus_expr3498 = new BitSet(new long[]{0x0000000000000002L,0x4003000000000000L});
    public static final BitSet FOLLOW_NL_in_plusplus_expr3501 = new BitSet(new long[]{0x0000000000000000L,0x0003000000000000L});
    public static final BitSet FOLLOW_PLUSPLUS_in_plusplus_expr3506 = new BitSet(new long[]{0xCC64000000000000L,0xC8001204001F7190L,0x000000000000055BL});
    public static final BitSet FOLLOW_MINUSMINUS_in_plusplus_expr3509 = new BitSet(new long[]{0xCC64000000000000L,0xC8001204001F7190L,0x000000000000055BL});
    public static final BitSet FOLLOW_NL_in_plusplus_expr3513 = new BitSet(new long[]{0xCC64000000000000L,0xC8001204001F7190L,0x000000000000055BL});
    public static final BitSet FOLLOW_timestimes_expr_in_plusplus_expr3517 = new BitSet(new long[]{0x0000000000000002L,0x4003000000000000L});
    public static final BitSet FOLLOW_p_timestimes_expr_in_p_plusplus_expr3529 = new BitSet(new long[]{0x0000000000000002L,0x4003000000000000L});
    public static final BitSet FOLLOW_NL_in_p_plusplus_expr3532 = new BitSet(new long[]{0x0000000000000000L,0x0003000000000000L});
    public static final BitSet FOLLOW_PLUSPLUS_in_p_plusplus_expr3537 = new BitSet(new long[]{0xCC64000000000000L,0xC8001204001F7190L,0x000000000000055BL});
    public static final BitSet FOLLOW_MINUSMINUS_in_p_plusplus_expr3540 = new BitSet(new long[]{0xCC64000000000000L,0xC8001204001F7190L,0x000000000000055BL});
    public static final BitSet FOLLOW_NL_in_p_plusplus_expr3544 = new BitSet(new long[]{0xCC64000000000000L,0xC8001204001F7190L,0x000000000000055BL});
    public static final BitSet FOLLOW_p_timestimes_expr_in_p_plusplus_expr3548 = new BitSet(new long[]{0x0000000000000002L,0x4003000000000000L});
    public static final BitSet FOLLOW_simple_expr_in_timestimes_expr3560 = new BitSet(new long[]{0x0000000000000002L,0x4000800000000000L});
    public static final BitSet FOLLOW_NL_in_timestimes_expr3563 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_TIMESTIMES_in_timestimes_expr3568 = new BitSet(new long[]{0xCC64000000000000L,0xC8001204001F7190L,0x000000000000055BL});
    public static final BitSet FOLLOW_NL_in_timestimes_expr3572 = new BitSet(new long[]{0xCC64000000000000L,0xC8001204001F7190L,0x000000000000055BL});
    public static final BitSet FOLLOW_simple_expr_in_timestimes_expr3576 = new BitSet(new long[]{0x0000000000000002L,0x4000800000000000L});
    public static final BitSet FOLLOW_p_simple_expr_in_p_timestimes_expr3589 = new BitSet(new long[]{0x0000000000000002L,0x4000800000000000L});
    public static final BitSet FOLLOW_NL_in_p_timestimes_expr3592 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_TIMESTIMES_in_p_timestimes_expr3597 = new BitSet(new long[]{0xCC64000000000000L,0xC8001204001F7190L,0x000000000000055BL});
    public static final BitSet FOLLOW_NL_in_p_timestimes_expr3601 = new BitSet(new long[]{0xCC64000000000000L,0xC8001204001F7190L,0x000000000000055BL});
    public static final BitSet FOLLOW_p_simple_expr_in_p_timestimes_expr3605 = new BitSet(new long[]{0x0000000000000002L,0x4000800000000000L});
    public static final BitSet FOLLOW_cons_expr_in_simple_expr3616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_cons_expr_in_p_simple_expr3625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_to_expr_in_cons_expr3634 = new BitSet(new long[]{0x0000000000000002L,0x4000600000000000L});
    public static final BitSet FOLLOW_NL_in_cons_expr3637 = new BitSet(new long[]{0x0000000000000000L,0x4000600000000000L});
    public static final BitSet FOLLOW_token_DOUBLE_COLON_in_cons_expr3640 = new BitSet(new long[]{0xCC64000000000000L,0xC8001204001F7190L,0x000000000000055BL});
    public static final BitSet FOLLOW_NL_in_cons_expr3642 = new BitSet(new long[]{0xCC64000000000000L,0xC8001204001F7190L,0x000000000000055BL});
    public static final BitSet FOLLOW_to_expr_in_cons_expr3645 = new BitSet(new long[]{0x0000000000000002L,0x4000600000000000L});
    public static final BitSet FOLLOW_p_to_expr_in_p_cons_expr3665 = new BitSet(new long[]{0x0000000000000002L,0x4000600000000000L});
    public static final BitSet FOLLOW_NL_in_p_cons_expr3668 = new BitSet(new long[]{0x0000000000000000L,0x4000600000000000L});
    public static final BitSet FOLLOW_token_DOUBLE_COLON_in_p_cons_expr3671 = new BitSet(new long[]{0xCC64000000000000L,0xC8001204001F7190L,0x000000000000055BL});
    public static final BitSet FOLLOW_NL_in_p_cons_expr3673 = new BitSet(new long[]{0xCC64000000000000L,0xC8001204001F7190L,0x000000000000055BL});
    public static final BitSet FOLLOW_p_to_expr_in_p_cons_expr3676 = new BitSet(new long[]{0x0000000000000002L,0x4000600000000000L});
    public static final BitSet FOLLOW_arith_plus_expr_in_to_expr3696 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000060L});
    public static final BitSet FOLLOW_NL_in_to_expr3699 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_L_to_in_to_expr3704 = new BitSet(new long[]{0xCC64000000000000L,0xC8001204001F7190L,0x000000000000055BL});
    public static final BitSet FOLLOW_L_downto_in_to_expr3708 = new BitSet(new long[]{0xCC64000000000000L,0xC8001204001F7190L,0x000000000000055BL});
    public static final BitSet FOLLOW_NL_in_to_expr3712 = new BitSet(new long[]{0xCC64000000000000L,0xC8001204001F7190L,0x000000000000055BL});
    public static final BitSet FOLLOW_arith_plus_expr_in_to_expr3716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_arith_plus_expr_in_p_to_expr3729 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000060L});
    public static final BitSet FOLLOW_NL_in_p_to_expr3732 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_L_to_in_p_to_expr3737 = new BitSet(new long[]{0xCC64000000000000L,0xC8001204001F7190L,0x000000000000055BL});
    public static final BitSet FOLLOW_L_downto_in_p_to_expr3741 = new BitSet(new long[]{0xCC64000000000000L,0xC8001204001F7190L,0x000000000000055BL});
    public static final BitSet FOLLOW_NL_in_p_to_expr3745 = new BitSet(new long[]{0xCC64000000000000L,0xC8001204001F7190L,0x000000000000055BL});
    public static final BitSet FOLLOW_p_arith_plus_expr_in_p_to_expr3749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arith_uminus_expr_in_arith_plus_expr3761 = new BitSet(new long[]{0x0000000000000002L,0x4000000600000000L});
    public static final BitSet FOLLOW_NL_in_arith_plus_expr3765 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_PLUS_in_arith_plus_expr3769 = new BitSet(new long[]{0xCC64000000000000L,0xC8001204001F7190L,0x000000000000055BL});
    public static final BitSet FOLLOW_MINUS_in_arith_plus_expr3774 = new BitSet(new long[]{0xCC64000000000000L,0xC8001204001F7190L,0x000000000000055BL});
    public static final BitSet FOLLOW_NL_in_arith_plus_expr3778 = new BitSet(new long[]{0xCC64000000000000L,0xC8001204001F7190L,0x000000000000055BL});
    public static final BitSet FOLLOW_arith_uminus_expr_in_arith_plus_expr3782 = new BitSet(new long[]{0x0000000000000002L,0x4000000600000000L});
    public static final BitSet FOLLOW_p_arith_uminus_expr_in_p_arith_plus_expr3793 = new BitSet(new long[]{0x0000000000000002L,0x4000000600000000L});
    public static final BitSet FOLLOW_NL_in_p_arith_plus_expr3796 = new BitSet(new long[]{0x0000000000000000L,0x0000000600000000L});
    public static final BitSet FOLLOW_set_in_p_arith_plus_expr3800 = new BitSet(new long[]{0xCC64000000000000L,0xC8001204001F7190L,0x000000000000055BL});
    public static final BitSet FOLLOW_NL_in_p_arith_plus_expr3809 = new BitSet(new long[]{0xCC64000000000000L,0xC8001204001F7190L,0x000000000000055BL});
    public static final BitSet FOLLOW_p_arith_uminus_expr_in_p_arith_plus_expr3813 = new BitSet(new long[]{0x0000000000000002L,0x4000000600000000L});
    public static final BitSet FOLLOW_MINUS_in_arith_uminus_expr3826 = new BitSet(new long[]{0xCC64000000000000L,0xC8001204001F7190L,0x000000000000055BL});
    public static final BitSet FOLLOW_NL_in_arith_uminus_expr3828 = new BitSet(new long[]{0xCC64000000000000L,0xC8001204001F7190L,0x000000000000055BL});
    public static final BitSet FOLLOW_arith_mult_expr_in_arith_uminus_expr3831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arith_mult_expr_in_arith_uminus_expr3844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_p_arith_uminus_expr3855 = new BitSet(new long[]{0xCC64000000000000L,0xC8001204001F7190L,0x000000000000055BL});
    public static final BitSet FOLLOW_NL_in_p_arith_uminus_expr3857 = new BitSet(new long[]{0xCC64000000000000L,0xC8001204001F7190L,0x000000000000055BL});
    public static final BitSet FOLLOW_p_arith_mult_expr_in_p_arith_uminus_expr3860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_arith_mult_expr_in_p_arith_uminus_expr3873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arith_pow_expr_in_arith_mult_expr3882 = new BitSet(new long[]{0x0000000000000002L,0x4000003800000000L});
    public static final BitSet FOLLOW_NL_in_arith_mult_expr3885 = new BitSet(new long[]{0x0000000000000000L,0x0000003800000000L});
    public static final BitSet FOLLOW_set_in_arith_mult_expr3889 = new BitSet(new long[]{0xCC64000000000000L,0xC8001204001F7190L,0x000000000000055BL});
    public static final BitSet FOLLOW_NL_in_arith_mult_expr3902 = new BitSet(new long[]{0xCC64000000000000L,0xC8001204001F7190L,0x000000000000055BL});
    public static final BitSet FOLLOW_arith_pow_expr_in_arith_mult_expr3906 = new BitSet(new long[]{0x0000000000000002L,0x4000003800000000L});
    public static final BitSet FOLLOW_p_arith_pow_expr_in_p_arith_mult_expr3918 = new BitSet(new long[]{0x0000000000000002L,0x4000003800000000L});
    public static final BitSet FOLLOW_NL_in_p_arith_mult_expr3921 = new BitSet(new long[]{0x0000000000000000L,0x0000003800000000L});
    public static final BitSet FOLLOW_set_in_p_arith_mult_expr3925 = new BitSet(new long[]{0xCC64000000000000L,0xC8001204001F7190L,0x000000000000055BL});
    public static final BitSet FOLLOW_NL_in_p_arith_mult_expr3938 = new BitSet(new long[]{0xCC64000000000000L,0xC8001204001F7190L,0x000000000000055BL});
    public static final BitSet FOLLOW_p_arith_pow_expr_in_p_arith_mult_expr3942 = new BitSet(new long[]{0x0000000000000002L,0x4000003800000000L});
    public static final BitSet FOLLOW_apply_expr_in_arith_pow_expr3953 = new BitSet(new long[]{0x0000000000000002L,0x4000004000000000L});
    public static final BitSet FOLLOW_NL_in_arith_pow_expr3956 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_POW_tok_in_arith_pow_expr3959 = new BitSet(new long[]{0xCC64000000000000L,0xC8001204001F7190L,0x000000000000055BL});
    public static final BitSet FOLLOW_NL_in_arith_pow_expr3961 = new BitSet(new long[]{0xCC64000000000000L,0xC8001204001F7190L,0x000000000000055BL});
    public static final BitSet FOLLOW_apply_expr_in_arith_pow_expr3964 = new BitSet(new long[]{0x0000000000000002L,0x4000004000000000L});
    public static final BitSet FOLLOW_p_apply_expr_in_p_arith_pow_expr3985 = new BitSet(new long[]{0x0000000000000002L,0x4000004000000000L});
    public static final BitSet FOLLOW_NL_in_p_arith_pow_expr3988 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_POW_tok_in_p_arith_pow_expr3991 = new BitSet(new long[]{0xCC64000000000000L,0xC8001204001F7190L,0x000000000000055BL});
    public static final BitSet FOLLOW_NL_in_p_arith_pow_expr3993 = new BitSet(new long[]{0xCC64000000000000L,0xC8001204001F7190L,0x000000000000055BL});
    public static final BitSet FOLLOW_p_apply_expr_in_p_arith_pow_expr3996 = new BitSet(new long[]{0x0000000000000002L,0x4000004000000000L});
    public static final BitSet FOLLOW_basic_expr_in_apply_expr4017 = new BitSet(new long[]{0xCC64000000000002L,0xC8001204001F7190L,0x000000000000055BL});
    public static final BitSet FOLLOW_p_basic_expr_in_p_apply_expr4035 = new BitSet(new long[]{0xCC64000000000002L,0xC8001204001F7190L,0x000000000000055BL});
    public static final BitSet FOLLOW_NL_in_p_apply_expr4038 = new BitSet(new long[]{0xCC64000000000000L,0xC8001204001F7190L,0x000000000000055BL});
    public static final BitSet FOLLOW_p_basic_expr_in_p_apply_expr4041 = new BitSet(new long[]{0xCC64000000000002L,0xC8001204001F7190L,0x000000000000055BL});
    public static final BitSet FOLLOW_message_send_expr_in_basic_expr4061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_message_send_expr_in_p_basic_expr4070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitive_expr_in_message_send_expr4079 = new BitSet(new long[]{0x0000000000000002L,0x4100000000000000L});
    public static final BitSet FOLLOW_NL_in_message_send_expr4082 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_PERIOD_in_message_send_expr4085 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_NL_in_message_send_expr4087 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_Id_in_message_send_expr4090 = new BitSet(new long[]{0x0000000000000002L,0x4100000000000000L});
    public static final BitSet FOLLOW_SQUARE_BRACKET_OPEN_in_list_expr4114 = new BitSet(new long[]{0xCC74000000000000L,0xC8001204001F7190L,0x00000000000005DBL});
    public static final BitSet FOLLOW_NL_in_list_expr4116 = new BitSet(new long[]{0xCC74000000000000L,0xC8001204001F7190L,0x00000000000005DBL});
    public static final BitSet FOLLOW_protected_expr_in_list_expr4120 = new BitSet(new long[]{0x0000000000000000L,0x4200000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_NL_in_list_expr4123 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_COMMA_in_list_expr4126 = new BitSet(new long[]{0xCC74000000000000L,0xC8001204001F7190L,0x000000000000055BL});
    public static final BitSet FOLLOW_NL_in_list_expr4128 = new BitSet(new long[]{0xCC74000000000000L,0xC8001204001F7190L,0x000000000000055BL});
    public static final BitSet FOLLOW_protected_expr_in_list_expr4131 = new BitSet(new long[]{0x0000000000000000L,0x4200000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_NL_in_list_expr4135 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_SQUARE_BRACKET_CLOSE_in_list_expr4140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROUND_BRACKET_OPEN_in_list_expr4154 = new BitSet(new long[]{0xCC74000000000000L,0xC8001204001F7190L,0x000000000000057BL});
    public static final BitSet FOLLOW_NL_in_list_expr4156 = new BitSet(new long[]{0xCC74000000000000L,0xC8001204001F7190L,0x000000000000057BL});
    public static final BitSet FOLLOW_protected_expr_in_list_expr4160 = new BitSet(new long[]{0x0000000000000000L,0x4200000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_list_expr4163 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_COMMA_in_list_expr4166 = new BitSet(new long[]{0xCC74000000000000L,0xC8001204001F7190L,0x000000000000055BL});
    public static final BitSet FOLLOW_NL_in_list_expr4168 = new BitSet(new long[]{0xCC74000000000000L,0xC8001204001F7190L,0x000000000000055BL});
    public static final BitSet FOLLOW_protected_expr_in_list_expr4171 = new BitSet(new long[]{0x0000000000000000L,0x4200000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_list_expr4175 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_COMMA_in_list_expr4179 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_list_expr4181 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ROUND_BRACKET_CLOSE_in_list_expr4188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURLY_BRACKET_OPEN_in_map_or_set_expr4217 = new BitSet(new long[]{0xCC74000000000000L,0xC8001204001F7190L,0x000000000000075BL});
    public static final BitSet FOLLOW_NL_in_map_or_set_expr4219 = new BitSet(new long[]{0xCC74000000000000L,0xC8001204001F7190L,0x000000000000075BL});
    public static final BitSet FOLLOW_map_or_set_elem_expr_in_map_or_set_expr4223 = new BitSet(new long[]{0x0000000000000000L,0x4200000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_NL_in_map_or_set_expr4225 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_map_or_set_expr4229 = new BitSet(new long[]{0xCC74000000000000L,0xC8001204001F7190L,0x000000000000055BL});
    public static final BitSet FOLLOW_NL_in_map_or_set_expr4231 = new BitSet(new long[]{0xCC74000000000000L,0xC8001204001F7190L,0x000000000000055BL});
    public static final BitSet FOLLOW_map_or_set_elem_expr_in_map_or_set_expr4234 = new BitSet(new long[]{0x0000000000000000L,0x4200000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_NL_in_map_or_set_expr4236 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_CURLY_BRACKET_CLOSE_in_map_or_set_expr4243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURLY_BRACKET_OPEN_in_map_or_set_expr4263 = new BitSet(new long[]{0x0000000000000000L,0x4030000000000000L});
    public static final BitSet FOLLOW_NL_in_map_or_set_expr4265 = new BitSet(new long[]{0x0000000000000000L,0x4030000000000000L});
    public static final BitSet FOLLOW_token_ARROW_in_map_or_set_expr4268 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_NL_in_map_or_set_expr4270 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_CURLY_BRACKET_CLOSE_in_map_or_set_expr4273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protected_expr_in_map_or_set_elem_expr4290 = new BitSet(new long[]{0x0000000000000002L,0x4030000000000000L});
    public static final BitSet FOLLOW_NL_in_map_or_set_elem_expr4294 = new BitSet(new long[]{0x0000000000000000L,0x4030000000000000L});
    public static final BitSet FOLLOW_token_ARROW_in_map_or_set_elem_expr4297 = new BitSet(new long[]{0xCC74000000000000L,0xC8001204001F7190L,0x000000000000055BL});
    public static final BitSet FOLLOW_NL_in_map_or_set_elem_expr4299 = new BitSet(new long[]{0xCC74000000000000L,0xC8001204001F7190L,0x000000000000055BL});
    public static final BitSet FOLLOW_protected_expr_in_map_or_set_elem_expr4302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Num_in_primitive_expr4322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_String_in_primitive_expr4327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Id_in_primitive_expr4332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Constr_in_primitive_expr4337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_true_in_primitive_expr4342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_false_in_primitive_expr4347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_this_in_primitive_expr4352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_nil_in_primitive_expr4359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_infinity_in_primitive_expr4364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_list_expr_in_primitive_expr4370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_with_control_expr_in_primitive_expr4375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_map_or_set_expr_in_primitive_expr4380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_prog4390 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_prog4392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Id_in_synpred1_babel171591 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000001L});
    public static final BitSet FOLLOW_NL_in_synpred1_babel171593 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_L_as_in_synpred1_babel171596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protected_expr_in_synpred2_babel171627 = new BitSet(new long[]{0x0000000000000000L,0x4400000000000000L});
    public static final BitSet FOLLOW_NL_in_synpred2_babel171629 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_QUESTION_MARK_in_synpred2_babel171632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_synpred3_babel172353 = new BitSet(new long[]{0x0000000100000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_objelem_assign_in_synpred3_babel172357 = new BitSet(new long[]{0x0000000100000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_NL_in_synpred3_babel172360 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ASSIGN_in_synpred3_babel172363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_obj_in_synpred4_babel172570 = new BitSet(new long[]{0x0000000000000000L,0x4000000A00000000L});
    public static final BitSet FOLLOW_NL_in_synpred4_babel172572 = new BitSet(new long[]{0x0000000000000000L,0x4000000A00000000L});
    public static final BitSet FOLLOW_parents_in_synpred4_babel172575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_expr_in_synpred5_babel172644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protected_lambda_expr_in_synpred6_babel172665 = new BitSet(new long[]{0x0000000000000002L});

}