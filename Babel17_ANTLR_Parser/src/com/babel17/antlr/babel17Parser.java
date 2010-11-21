// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g 2010-11-21 02:08:44

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PROG", "NIL_TOKEN", "ANY", "LAMBDA", "SQUARE_LIST", "ROUND_LIST", "LIST_CONS", "COMPARE", "APPLY", "IF", "MAP_OR_SET_OR_OBJ", "EMPTY_MAP", "EXCEPTION", "MATCH", "CASES", "OBJ", "FOR_EXPR", "WHILE_DO", "MESSAGE_SEND", "UMINUS", "POW", "PARENTS_PLUS", "PARENTS_MUL", "BLOCK", "BEGIN", "WITH", "VAL", "OBJELEM_ASSIGN", "ASSIGN", "ARROW", "DEF", "YIELD", "MEMOIZE", "MEM_STRONG", "MEM_WEAK", "IF_PATTERN", "Newline", "NotNewline", "COMMENT", "SmallLetter", "BigLetter", "Letter", "Digit", "Hex", "L_begin", "L_end", "L_obj", "L_with", "L_if", "L_then", "L_else", "L_elseif", "L_while", "L_for", "L_do", "L_yield", "L_match", "L_case", "L_as", "L_val", "L_def", "L_in", "L_exception", "L_to", "L_downto", "A_infinity", "U_infinity", "L_concurrent", "L_choose", "L_lazy", "L_memoize", "L_true", "L_false", "L_this", "L_random", "L_nil", "L_div", "L_mod", "A_EQUAL", "U_EQUAL", "A_NOT_EQUAL", "U_NOT_EQUAL", "LESS", "A_LESS_EQ", "U_LESS_EQ", "GREATER", "A_GREATER_EQ", "U_GREATER_EQ", "SC", "PLUS", "MINUS", "TIMES", "QUOTIENT", "POW_tok", "A_OR", "A_AND", "A_NOT", "U_OR", "U_AND", "U_NOT", "A_DOUBLE_COLON", "U_DOUBLE_COLON", "TIMESTIMES", "QUOTIENTQUOTIENT", "PLUSPLUS", "MINUSMINUS", "A_DOUBLE_ARROW", "U_DOUBLE_ARROW", "A_ARROW", "U_ARROW", "A_ELLIPSIS", "U_ELLIPSIS", "PERIOD", "COMMA", "QUESTION_MARK", "L_force", "WsChar", "WS", "NL", "Constr", "Id", "Num", "Charcode", "String", "ROUND_BRACKET_OPEN", "ROUND_BRACKET_CLOSE", "SQUARE_BRACKET_OPEN", "SQUARE_BRACKET_CLOSE", "CURLY_BRACKET_OPEN", "CURLY_BRACKET_CLOSE", "UNDERSCORE"
    };
    public static final int U_AND=102;
    public static final int L_end=49;
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
    public static final int Num=125;
    public static final int EMPTY_MAP=15;
    public static final int GREATER=89;
    public static final int POW=24;
    public static final int L_concurrent=71;
    public static final int L_false=76;
    public static final int QUOTIENTQUOTIENT=107;
    public static final int L_nil=79;
    public static final int BEGIN=28;
    public static final int LIST_CONS=10;
    public static final int L_with=51;
    public static final int QUESTION_MARK=118;
    public static final int LESS=86;
    public static final int ROUND_BRACKET_OPEN=128;
    public static final int SQUARE_LIST=8;
    public static final int VAL=30;
    public static final int L_as=62;
    public static final int NL=122;
    public static final int MESSAGE_SEND=22;
    public static final int A_ARROW=112;
    public static final int A_DOUBLE_COLON=104;
    public static final int COMMENT=42;
    public static final int L_def=64;
    public static final int A_AND=99;
    public static final int EXCEPTION=16;
    public static final int L_this=77;
    public static final int L_force=119;
    public static final int L_choose=72;
    public static final int PERIOD=116;
    public static final int SmallLetter=43;
    public static final int NIL_TOKEN=5;
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
    public static final int APPLY=12;
    public static final int U_ARROW=113;
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
    public static final int U_EQUAL=83;
    public static final int U_GREATER_EQ=91;
    public static final int PLUS=93;
    public static final int String=127;
    public static final int LAMBDA=7;
    public static final int L_true=75;
    public static final int Id=124;
    public static final int A_infinity=69;
    public static final int WITH=29;
    public static final int L_in=65;
    public static final int A_NOT=100;
    public static final int L_lazy=73;
    public static final int NotNewline=41;
    public static final int L_then=53;
    public static final int QUOTIENT=96;
    public static final int L_if=52;
    public static final int CURLY_BRACKET_CLOSE=133;
    public static final int UMINUS=23;
    public static final int FOR_EXPR=20;
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
    public static final int L_downto=68;
    public static final int ANY=6;
    public static final int L_random=78;
    public static final int BLOCK=27;
    public static final int A_NOT_EQUAL=84;
    public static final int ASSIGN=32;
    public static final int U_DOUBLE_COLON=105;
    public static final int OBJELEM_ASSIGN=31;
    public static final int ARROW=33;
    public static final int L_case=61;
    public static final int TIMES=95;
    public static final int U_infinity=70;
    public static final int A_LESS_EQ=87;
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:169:1: token_infinity : ( A_infinity | U_infinity );
    public final babel17Parser.token_infinity_return token_infinity() throws RecognitionException {
        babel17Parser.token_infinity_return retval = new babel17Parser.token_infinity_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set1=null;

        CommonTree set1_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:170:2: ( A_infinity | U_infinity )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:247:1: token_OR : ( A_OR | U_OR );
    public final babel17Parser.token_OR_return token_OR() throws RecognitionException {
        babel17Parser.token_OR_return retval = new babel17Parser.token_OR_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set6=null;

        CommonTree set6_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:247:9: ( A_OR | U_OR )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:248:1: token_AND : ( A_AND | U_AND );
    public final babel17Parser.token_AND_return token_AND() throws RecognitionException {
        babel17Parser.token_AND_return retval = new babel17Parser.token_AND_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set7=null;

        CommonTree set7_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:249:2: ( A_AND | U_AND )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:250:1: token_NOT : ( A_NOT | U_NOT );
    public final babel17Parser.token_NOT_return token_NOT() throws RecognitionException {
        babel17Parser.token_NOT_return retval = new babel17Parser.token_NOT_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set8=null;

        CommonTree set8_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:251:2: ( A_NOT | U_NOT )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:257:1: token_DOUBLE_COLON : ( A_DOUBLE_COLON | U_DOUBLE_COLON );
    public final babel17Parser.token_DOUBLE_COLON_return token_DOUBLE_COLON() throws RecognitionException {
        babel17Parser.token_DOUBLE_COLON_return retval = new babel17Parser.token_DOUBLE_COLON_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set9=null;

        CommonTree set9_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:258:2: ( A_DOUBLE_COLON | U_DOUBLE_COLON )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:274:1: token_DOUBLE_ARROW : ( A_DOUBLE_ARROW | U_DOUBLE_ARROW );
    public final babel17Parser.token_DOUBLE_ARROW_return token_DOUBLE_ARROW() throws RecognitionException {
        babel17Parser.token_DOUBLE_ARROW_return retval = new babel17Parser.token_DOUBLE_ARROW_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set10=null;

        CommonTree set10_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:275:2: ( A_DOUBLE_ARROW | U_DOUBLE_ARROW )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:279:1: token_ARROW : ( A_ARROW | U_ARROW );
    public final babel17Parser.token_ARROW_return token_ARROW() throws RecognitionException {
        babel17Parser.token_ARROW_return retval = new babel17Parser.token_ARROW_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set11=null;

        CommonTree set11_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:280:2: ( A_ARROW | U_ARROW )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:285:1: token_ELLIPSIS : ( A_ELLIPSIS | U_ELLIPSIS );
    public final babel17Parser.token_ELLIPSIS_return token_ELLIPSIS() throws RecognitionException {
        babel17Parser.token_ELLIPSIS_return retval = new babel17Parser.token_ELLIPSIS_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set12=null;

        CommonTree set12_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:286:2: ( A_ELLIPSIS | U_ELLIPSIS )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:343:1: pattern : ( Constr ( ( NL )? primitive_pattern )? -> ^( Constr ( primitive_pattern )? ) | primitive_pattern ( ( NL )? token_DOUBLE_COLON ( NL )? primitive_pattern )* -> ^( LIST_CONS ( primitive_pattern )* ) | L_exception primitive_pattern -> ^( L_exception primitive_pattern ) | token_ELLIPSIS );
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:343:9: ( Constr ( ( NL )? primitive_pattern )? -> ^( Constr ( primitive_pattern )? ) | primitive_pattern ( ( NL )? token_DOUBLE_COLON ( NL )? primitive_pattern )* -> ^( LIST_CONS ( primitive_pattern )* ) | L_exception primitive_pattern -> ^( L_exception primitive_pattern ) | token_ELLIPSIS )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:343:11: Constr ( ( NL )? primitive_pattern )?
                    {
                    Constr13=(Token)match(input,Constr,FOLLOW_Constr_in_pattern1487); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Constr.add(Constr13);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:343:18: ( ( NL )? primitive_pattern )?
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
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:343:19: ( NL )? primitive_pattern
                            {
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:343:19: ( NL )?
                            int alt1=2;
                            int LA1_0 = input.LA(1);

                            if ( (LA1_0==NL) ) {
                                alt1=1;
                            }
                            switch (alt1) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:343:19: NL
                                    {
                                    NL14=(Token)match(input,NL,FOLLOW_NL_in_pattern1490); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL14);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_primitive_pattern_in_pattern1493);
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
                    // 343:43: -> ^( Constr ( primitive_pattern )? )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:343:46: ^( Constr ( primitive_pattern )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_Constr.nextNode(), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:343:55: ( primitive_pattern )?
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:344:4: primitive_pattern ( ( NL )? token_DOUBLE_COLON ( NL )? primitive_pattern )*
                    {
                    pushFollow(FOLLOW_primitive_pattern_in_pattern1509);
                    primitive_pattern16=primitive_pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primitive_pattern.add(primitive_pattern16.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:344:22: ( ( NL )? token_DOUBLE_COLON ( NL )? primitive_pattern )*
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
                    	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:344:23: ( NL )? token_DOUBLE_COLON ( NL )? primitive_pattern
                    	    {
                    	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:344:23: ( NL )?
                    	    int alt3=2;
                    	    int LA3_0 = input.LA(1);

                    	    if ( (LA3_0==NL) ) {
                    	        alt3=1;
                    	    }
                    	    switch (alt3) {
                    	        case 1 :
                    	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:344:23: NL
                    	            {
                    	            NL17=(Token)match(input,NL,FOLLOW_NL_in_pattern1512); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_NL.add(NL17);


                    	            }
                    	            break;

                    	    }

                    	    pushFollow(FOLLOW_token_DOUBLE_COLON_in_pattern1515);
                    	    token_DOUBLE_COLON18=token_DOUBLE_COLON();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_token_DOUBLE_COLON.add(token_DOUBLE_COLON18.getTree());
                    	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:344:46: ( NL )?
                    	    int alt4=2;
                    	    int LA4_0 = input.LA(1);

                    	    if ( (LA4_0==NL) ) {
                    	        alt4=1;
                    	    }
                    	    switch (alt4) {
                    	        case 1 :
                    	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:344:46: NL
                    	            {
                    	            NL19=(Token)match(input,NL,FOLLOW_NL_in_pattern1517); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_NL.add(NL19);


                    	            }
                    	            break;

                    	    }

                    	    pushFollow(FOLLOW_primitive_pattern_in_pattern1520);
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
                    // 345:3: -> ^( LIST_CONS ( primitive_pattern )* )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:345:6: ^( LIST_CONS ( primitive_pattern )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LIST_CONS, "LIST_CONS"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:345:18: ( primitive_pattern )*
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:346:4: L_exception primitive_pattern
                    {
                    L_exception21=(Token)match(input,L_exception,FOLLOW_L_exception_in_pattern1539); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_exception.add(L_exception21);

                    pushFollow(FOLLOW_primitive_pattern_in_pattern1541);
                    primitive_pattern22=primitive_pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primitive_pattern.add(primitive_pattern22.getTree());


                    // AST REWRITE
                    // elements: primitive_pattern, L_exception
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 346:34: -> ^( L_exception primitive_pattern )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:346:37: ^( L_exception primitive_pattern )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:347:4: token_ELLIPSIS
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_ELLIPSIS_in_pattern1554);
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:349:1: bracket_pattern : ( ( Id ( NL )? L_as )=> Id ( NL )? L_as ( NL )? pattern -> ^( L_as Id pattern ) | ( protected_expr ( NL )? QUESTION_MARK )=> protected_expr ( NL )? QUESTION_MARK ( ( NL )? pattern )? -> ^( QUESTION_MARK protected_expr ( pattern )? ) | pattern ( ( NL )? L_if ( NL )? protected_expr )? -> ^( IF_PATTERN pattern ( protected_expr )? ) | L_val ( NL )? protected_expr -> ^( L_val protected_expr ) );
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:350:2: ( ( Id ( NL )? L_as )=> Id ( NL )? L_as ( NL )? pattern -> ^( L_as Id pattern ) | ( protected_expr ( NL )? QUESTION_MARK )=> protected_expr ( NL )? QUESTION_MARK ( ( NL )? pattern )? -> ^( QUESTION_MARK protected_expr ( pattern )? ) | pattern ( ( NL )? L_if ( NL )? protected_expr )? -> ^( IF_PATTERN pattern ( protected_expr )? ) | L_val ( NL )? protected_expr -> ^( L_val protected_expr ) )
            int alt16=4;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:350:10: ( Id ( NL )? L_as )=> Id ( NL )? L_as ( NL )? pattern
                    {
                    Id24=(Token)match(input,Id,FOLLOW_Id_in_bracket_pattern1581); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Id.add(Id24);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:350:30: ( NL )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==NL) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:350:30: NL
                            {
                            NL25=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1583); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL25);


                            }
                            break;

                    }

                    L_as26=(Token)match(input,L_as,FOLLOW_L_as_in_bracket_pattern1586); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_as.add(L_as26);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:350:39: ( NL )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==NL) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:350:39: NL
                            {
                            NL27=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1588); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL27);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_pattern_in_bracket_pattern1591);
                    pattern28=pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pattern.add(pattern28.getTree());


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
                    // 350:51: -> ^( L_as Id pattern )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:350:54: ^( L_as Id pattern )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:351:4: ( protected_expr ( NL )? QUESTION_MARK )=> protected_expr ( NL )? QUESTION_MARK ( ( NL )? pattern )?
                    {
                    pushFollow(FOLLOW_protected_expr_in_bracket_pattern1620);
                    protected_expr29=protected_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr29.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:352:18: ( NL )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==NL) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:352:18: NL
                            {
                            NL30=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1622); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL30);


                            }
                            break;

                    }

                    QUESTION_MARK31=(Token)match(input,QUESTION_MARK,FOLLOW_QUESTION_MARK_in_bracket_pattern1625); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QUESTION_MARK.add(QUESTION_MARK31);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:352:36: ( ( NL )? pattern )?
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
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:352:37: ( NL )? pattern
                            {
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:352:37: ( NL )?
                            int alt10=2;
                            int LA10_0 = input.LA(1);

                            if ( (LA10_0==NL) ) {
                                alt10=1;
                            }
                            switch (alt10) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:352:37: NL
                                    {
                                    NL32=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1628); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL32);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_pattern_in_bracket_pattern1631);
                            pattern33=pattern();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_pattern.add(pattern33.getTree());

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
                    // 352:51: -> ^( QUESTION_MARK protected_expr ( pattern )? )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:352:54: ^( QUESTION_MARK protected_expr ( pattern )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_QUESTION_MARK.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_protected_expr.nextTree());
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:352:85: ( pattern )?
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:353:4: pattern ( ( NL )? L_if ( NL )? protected_expr )?
                    {
                    pushFollow(FOLLOW_pattern_in_bracket_pattern1649);
                    pattern34=pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pattern.add(pattern34.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:353:12: ( ( NL )? L_if ( NL )? protected_expr )?
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
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:353:13: ( NL )? L_if ( NL )? protected_expr
                            {
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:353:13: ( NL )?
                            int alt12=2;
                            int LA12_0 = input.LA(1);

                            if ( (LA12_0==NL) ) {
                                alt12=1;
                            }
                            switch (alt12) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:353:13: NL
                                    {
                                    NL35=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1652); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL35);


                                    }
                                    break;

                            }

                            L_if36=(Token)match(input,L_if,FOLLOW_L_if_in_bracket_pattern1655); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_L_if.add(L_if36);

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:353:22: ( NL )?
                            int alt13=2;
                            int LA13_0 = input.LA(1);

                            if ( (LA13_0==NL) ) {
                                alt13=1;
                            }
                            switch (alt13) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:353:22: NL
                                    {
                                    NL37=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1657); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL37);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_protected_expr_in_bracket_pattern1660);
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
                    // 353:43: -> ^( IF_PATTERN pattern ( protected_expr )? )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:353:46: ^( IF_PATTERN pattern ( protected_expr )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IF_PATTERN, "IF_PATTERN"), root_1);

                        adaptor.addChild(root_1, stream_pattern.nextTree());
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:353:67: ( protected_expr )?
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:354:4: L_val ( NL )? protected_expr
                    {
                    L_val39=(Token)match(input,L_val,FOLLOW_L_val_in_bracket_pattern1678); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_val.add(L_val39);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:354:10: ( NL )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==NL) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:354:10: NL
                            {
                            NL40=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1680); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL40);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_protected_expr_in_bracket_pattern1683);
                    protected_expr41=protected_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr41.getTree());


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
                    // 354:29: -> ^( L_val protected_expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:354:32: ^( L_val protected_expr )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:356:1: arrow_or_assign : ( token_ARROW -> ^( ARROW ) | ASSIGN -> ^( ASSIGN ) );
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:357:2: ( token_ARROW -> ^( ARROW ) | ASSIGN -> ^( ASSIGN ) )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:357:4: token_ARROW
                    {
                    pushFollow(FOLLOW_token_ARROW_in_arrow_or_assign1701);
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
                    // 357:16: -> ^( ARROW )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:357:19: ^( ARROW )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:358:4: ASSIGN
                    {
                    ASSIGN43=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_arrow_or_assign1712); if (state.failed) return retval; 
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
                    // 358:11: -> ^( ASSIGN )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:358:14: ^( ASSIGN )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:360:1: mselem_pattern : bracket_pattern ( ( NL )? arrow_or_assign ( NL )? bracket_pattern )? -> ^( NIL_TOKEN ^( NIL_TOKEN ( bracket_pattern )* ) ( arrow_or_assign )* ) ;
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:361:2: ( bracket_pattern ( ( NL )? arrow_or_assign ( NL )? bracket_pattern )? -> ^( NIL_TOKEN ^( NIL_TOKEN ( bracket_pattern )* ) ( arrow_or_assign )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:361:4: bracket_pattern ( ( NL )? arrow_or_assign ( NL )? bracket_pattern )?
            {
            pushFollow(FOLLOW_bracket_pattern_in_mselem_pattern1727);
            bracket_pattern44=bracket_pattern();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bracket_pattern.add(bracket_pattern44.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:361:20: ( ( NL )? arrow_or_assign ( NL )? bracket_pattern )?
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:361:21: ( NL )? arrow_or_assign ( NL )? bracket_pattern
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:361:21: ( NL )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==NL) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:361:21: NL
                            {
                            NL45=(Token)match(input,NL,FOLLOW_NL_in_mselem_pattern1730); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL45);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_arrow_or_assign_in_mselem_pattern1733);
                    arrow_or_assign46=arrow_or_assign();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_arrow_or_assign.add(arrow_or_assign46.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:361:41: ( NL )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==NL) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:361:41: NL
                            {
                            NL47=(Token)match(input,NL,FOLLOW_NL_in_mselem_pattern1735); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL47);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_bracket_pattern_in_mselem_pattern1738);
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
            // 362:3: -> ^( NIL_TOKEN ^( NIL_TOKEN ( bracket_pattern )* ) ( arrow_or_assign )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:362:6: ^( NIL_TOKEN ^( NIL_TOKEN ( bracket_pattern )* ) ( arrow_or_assign )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:362:18: ^( NIL_TOKEN ( bracket_pattern )* )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_2);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:362:30: ( bracket_pattern )*
                while ( stream_bracket_pattern.hasNext() ) {
                    adaptor.addChild(root_2, stream_bracket_pattern.nextTree());

                }
                stream_bracket_pattern.reset();

                adaptor.addChild(root_1, root_2);
                }
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:362:48: ( arrow_or_assign )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:364:1: primitive_pattern : ( Id | '_' -> ANY | String | Num | L_true | L_false | L_nil | token_infinity | '-' ( NL )? token_infinity -> ^( UMINUS token_infinity ) | '-' ( NL )? Num -> ^( UMINUS Num ) | '[' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* )? ']' -> ^( SQUARE_LIST ( bracket_pattern )* ) | '(' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* ( COMMA ( NL )? )? )? ')' -> ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( bracket_pattern )* ) ) | '{' ( NL )? ( mselem_pattern ( NL )? ( COMMA ( NL )? mselem_pattern ( NL )? )* )? '}' -> ^( MAP_OR_SET_OR_OBJ ( mselem_pattern )* ) | '{' ( NL )? token_ARROW ( NL )? '}' -> ^( EMPTY_MAP ) );
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:365:2: ( Id | '_' -> ANY | String | Num | L_true | L_false | L_nil | token_infinity | '-' ( NL )? token_infinity -> ^( UMINUS token_infinity ) | '-' ( NL )? Num -> ^( UMINUS Num ) | '[' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* )? ']' -> ^( SQUARE_LIST ( bracket_pattern )* ) | '(' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* ( COMMA ( NL )? )? )? ')' -> ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( bracket_pattern )* ) ) | '{' ( NL )? ( mselem_pattern ( NL )? ( COMMA ( NL )? mselem_pattern ( NL )? )* )? '}' -> ^( MAP_OR_SET_OR_OBJ ( mselem_pattern )* ) | '{' ( NL )? token_ARROW ( NL )? '}' -> ^( EMPTY_MAP ) )
            int alt45=14;
            alt45 = dfa45.predict(input);
            switch (alt45) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:365:4: Id
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Id49=(Token)match(input,Id,FOLLOW_Id_in_primitive_pattern1767); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Id49_tree = (CommonTree)adaptor.create(Id49);
                    adaptor.addChild(root_0, Id49_tree);
                    }

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:366:4: '_'
                    {
                    char_literal50=(Token)match(input,UNDERSCORE,FOLLOW_UNDERSCORE_in_primitive_pattern1772); if (state.failed) return retval; 
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
                    // 366:8: -> ANY
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(ANY, "ANY"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:367:4: String
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    String51=(Token)match(input,String,FOLLOW_String_in_primitive_pattern1781); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    String51_tree = (CommonTree)adaptor.create(String51);
                    adaptor.addChild(root_0, String51_tree);
                    }

                    }
                    break;
                case 4 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:368:4: Num
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Num52=(Token)match(input,Num,FOLLOW_Num_in_primitive_pattern1786); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Num52_tree = (CommonTree)adaptor.create(Num52);
                    adaptor.addChild(root_0, Num52_tree);
                    }

                    }
                    break;
                case 5 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:369:4: L_true
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    L_true53=(Token)match(input,L_true,FOLLOW_L_true_in_primitive_pattern1791); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    L_true53_tree = (CommonTree)adaptor.create(L_true53);
                    adaptor.addChild(root_0, L_true53_tree);
                    }

                    }
                    break;
                case 6 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:370:4: L_false
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    L_false54=(Token)match(input,L_false,FOLLOW_L_false_in_primitive_pattern1796); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    L_false54_tree = (CommonTree)adaptor.create(L_false54);
                    adaptor.addChild(root_0, L_false54_tree);
                    }

                    }
                    break;
                case 7 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:371:4: L_nil
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    L_nil55=(Token)match(input,L_nil,FOLLOW_L_nil_in_primitive_pattern1801); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    L_nil55_tree = (CommonTree)adaptor.create(L_nil55);
                    adaptor.addChild(root_0, L_nil55_tree);
                    }

                    }
                    break;
                case 8 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:372:4: token_infinity
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_infinity_in_primitive_pattern1806);
                    token_infinity56=token_infinity();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, token_infinity56.getTree());

                    }
                    break;
                case 9 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:373:4: '-' ( NL )? token_infinity
                    {
                    char_literal57=(Token)match(input,MINUS,FOLLOW_MINUS_in_primitive_pattern1811); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(char_literal57);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:373:8: ( NL )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==NL) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:373:8: NL
                            {
                            NL58=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern1813); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL58);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_token_infinity_in_primitive_pattern1816);
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
                    // 373:27: -> ^( UMINUS token_infinity )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:373:30: ^( UMINUS token_infinity )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:374:4: '-' ( NL )? Num
                    {
                    char_literal60=(Token)match(input,MINUS,FOLLOW_MINUS_in_primitive_pattern1829); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(char_literal60);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:374:8: ( NL )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==NL) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:374:8: NL
                            {
                            NL61=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern1831); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL61);


                            }
                            break;

                    }

                    Num62=(Token)match(input,Num,FOLLOW_Num_in_primitive_pattern1834); if (state.failed) return retval; 
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
                    // 374:16: -> ^( UMINUS Num )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:374:19: ^( UMINUS Num )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:375:4: '[' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* )? ']'
                    {
                    char_literal63=(Token)match(input,SQUARE_BRACKET_OPEN,FOLLOW_SQUARE_BRACKET_OPEN_in_primitive_pattern1847); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SQUARE_BRACKET_OPEN.add(char_literal63);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:375:9: ( NL )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==NL) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:375:9: NL
                            {
                            NL64=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern1850); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL64);


                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:375:13: ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==L_begin||(LA28_0>=L_obj && LA28_0<=L_if)||(LA28_0>=L_while && LA28_0<=L_for)||(LA28_0>=L_match && LA28_0<=L_case)||LA28_0==L_val||LA28_0==L_exception||(LA28_0>=A_infinity && LA28_0<=L_lazy)||(LA28_0>=L_true && LA28_0<=L_nil)||LA28_0==MINUS||LA28_0==A_NOT||LA28_0==U_NOT||(LA28_0>=A_ELLIPSIS && LA28_0<=U_ELLIPSIS)||LA28_0==L_force||(LA28_0>=Constr && LA28_0<=Num)||(LA28_0>=String && LA28_0<=ROUND_BRACKET_OPEN)||LA28_0==SQUARE_BRACKET_OPEN||LA28_0==CURLY_BRACKET_OPEN||LA28_0==UNDERSCORE) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:375:14: bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )*
                            {
                            pushFollow(FOLLOW_bracket_pattern_in_primitive_pattern1854);
                            bracket_pattern65=bracket_pattern();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_bracket_pattern.add(bracket_pattern65.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:375:30: ( NL )?
                            int alt24=2;
                            int LA24_0 = input.LA(1);

                            if ( (LA24_0==NL) ) {
                                alt24=1;
                            }
                            switch (alt24) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:375:30: NL
                                    {
                                    NL66=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern1856); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL66);


                                    }
                                    break;

                            }

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:375:34: ( COMMA ( NL )? bracket_pattern ( NL )? )*
                            loop27:
                            do {
                                int alt27=2;
                                int LA27_0 = input.LA(1);

                                if ( (LA27_0==COMMA) ) {
                                    alt27=1;
                                }


                                switch (alt27) {
                            	case 1 :
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:375:36: COMMA ( NL )? bracket_pattern ( NL )?
                            	    {
                            	    COMMA67=(Token)match(input,COMMA,FOLLOW_COMMA_in_primitive_pattern1861); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA67);

                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:375:42: ( NL )?
                            	    int alt25=2;
                            	    int LA25_0 = input.LA(1);

                            	    if ( (LA25_0==NL) ) {
                            	        alt25=1;
                            	    }
                            	    switch (alt25) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:375:42: NL
                            	            {
                            	            NL68=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern1863); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL68);


                            	            }
                            	            break;

                            	    }

                            	    pushFollow(FOLLOW_bracket_pattern_in_primitive_pattern1866);
                            	    bracket_pattern69=bracket_pattern();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_bracket_pattern.add(bracket_pattern69.getTree());
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:375:62: ( NL )?
                            	    int alt26=2;
                            	    int LA26_0 = input.LA(1);

                            	    if ( (LA26_0==NL) ) {
                            	        alt26=1;
                            	    }
                            	    switch (alt26) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:375:62: NL
                            	            {
                            	            NL70=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern1868); if (state.failed) return retval; 
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

                    char_literal71=(Token)match(input,SQUARE_BRACKET_CLOSE,FOLLOW_SQUARE_BRACKET_CLOSE_in_primitive_pattern1876); if (state.failed) return retval; 
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
                    // 376:6: -> ^( SQUARE_LIST ( bracket_pattern )* )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:376:9: ^( SQUARE_LIST ( bracket_pattern )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SQUARE_LIST, "SQUARE_LIST"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:376:23: ( bracket_pattern )*
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:377:4: '(' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* ( COMMA ( NL )? )? )? ')'
                    {
                    char_literal72=(Token)match(input,ROUND_BRACKET_OPEN,FOLLOW_ROUND_BRACKET_OPEN_in_primitive_pattern1896); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ROUND_BRACKET_OPEN.add(char_literal72);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:377:9: ( NL )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==NL) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:377:9: NL
                            {
                            NL73=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern1899); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL73);


                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:377:13: ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* ( COMMA ( NL )? )? )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==L_begin||(LA36_0>=L_obj && LA36_0<=L_if)||(LA36_0>=L_while && LA36_0<=L_for)||(LA36_0>=L_match && LA36_0<=L_case)||LA36_0==L_val||LA36_0==L_exception||(LA36_0>=A_infinity && LA36_0<=L_lazy)||(LA36_0>=L_true && LA36_0<=L_nil)||LA36_0==MINUS||LA36_0==A_NOT||LA36_0==U_NOT||(LA36_0>=A_ELLIPSIS && LA36_0<=U_ELLIPSIS)||LA36_0==L_force||(LA36_0>=Constr && LA36_0<=Num)||(LA36_0>=String && LA36_0<=ROUND_BRACKET_OPEN)||LA36_0==SQUARE_BRACKET_OPEN||LA36_0==CURLY_BRACKET_OPEN||LA36_0==UNDERSCORE) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:377:14: bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* ( COMMA ( NL )? )?
                            {
                            pushFollow(FOLLOW_bracket_pattern_in_primitive_pattern1903);
                            bracket_pattern74=bracket_pattern();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_bracket_pattern.add(bracket_pattern74.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:377:30: ( NL )?
                            int alt30=2;
                            int LA30_0 = input.LA(1);

                            if ( (LA30_0==NL) ) {
                                alt30=1;
                            }
                            switch (alt30) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:377:30: NL
                                    {
                                    NL75=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern1905); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL75);


                                    }
                                    break;

                            }

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:377:34: ( COMMA ( NL )? bracket_pattern ( NL )? )*
                            loop33:
                            do {
                                int alt33=2;
                                int LA33_0 = input.LA(1);

                                if ( (LA33_0==COMMA) ) {
                                    int LA33_1 = input.LA(2);

                                    if ( (LA33_1==NL) ) {
                                        int LA33_3 = input.LA(3);

                                        if ( (LA33_3==L_begin||(LA33_3>=L_obj && LA33_3<=L_if)||(LA33_3>=L_while && LA33_3<=L_for)||(LA33_3>=L_match && LA33_3<=L_case)||LA33_3==L_val||LA33_3==L_exception||(LA33_3>=A_infinity && LA33_3<=L_lazy)||(LA33_3>=L_true && LA33_3<=L_nil)||LA33_3==MINUS||LA33_3==A_NOT||LA33_3==U_NOT||(LA33_3>=A_ELLIPSIS && LA33_3<=U_ELLIPSIS)||LA33_3==L_force||(LA33_3>=Constr && LA33_3<=Num)||(LA33_3>=String && LA33_3<=ROUND_BRACKET_OPEN)||LA33_3==SQUARE_BRACKET_OPEN||LA33_3==CURLY_BRACKET_OPEN||LA33_3==UNDERSCORE) ) {
                                            alt33=1;
                                        }


                                    }
                                    else if ( (LA33_1==L_begin||(LA33_1>=L_obj && LA33_1<=L_if)||(LA33_1>=L_while && LA33_1<=L_for)||(LA33_1>=L_match && LA33_1<=L_case)||LA33_1==L_val||LA33_1==L_exception||(LA33_1>=A_infinity && LA33_1<=L_lazy)||(LA33_1>=L_true && LA33_1<=L_nil)||LA33_1==MINUS||LA33_1==A_NOT||LA33_1==U_NOT||(LA33_1>=A_ELLIPSIS && LA33_1<=U_ELLIPSIS)||LA33_1==L_force||(LA33_1>=Constr && LA33_1<=Num)||(LA33_1>=String && LA33_1<=ROUND_BRACKET_OPEN)||LA33_1==SQUARE_BRACKET_OPEN||LA33_1==CURLY_BRACKET_OPEN||LA33_1==UNDERSCORE) ) {
                                        alt33=1;
                                    }


                                }


                                switch (alt33) {
                            	case 1 :
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:377:36: COMMA ( NL )? bracket_pattern ( NL )?
                            	    {
                            	    COMMA76=(Token)match(input,COMMA,FOLLOW_COMMA_in_primitive_pattern1910); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA76);

                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:377:43: ( NL )?
                            	    int alt31=2;
                            	    int LA31_0 = input.LA(1);

                            	    if ( (LA31_0==NL) ) {
                            	        alt31=1;
                            	    }
                            	    switch (alt31) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:377:43: NL
                            	            {
                            	            NL77=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern1913); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL77);


                            	            }
                            	            break;

                            	    }

                            	    pushFollow(FOLLOW_bracket_pattern_in_primitive_pattern1916);
                            	    bracket_pattern78=bracket_pattern();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_bracket_pattern.add(bracket_pattern78.getTree());
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:377:63: ( NL )?
                            	    int alt32=2;
                            	    int LA32_0 = input.LA(1);

                            	    if ( (LA32_0==NL) ) {
                            	        alt32=1;
                            	    }
                            	    switch (alt32) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:377:63: NL
                            	            {
                            	            NL79=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern1918); if (state.failed) return retval; 
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

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:377:69: ( COMMA ( NL )? )?
                            int alt35=2;
                            int LA35_0 = input.LA(1);

                            if ( (LA35_0==COMMA) ) {
                                alt35=1;
                            }
                            switch (alt35) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:377:70: COMMA ( NL )?
                                    {
                                    COMMA80=(Token)match(input,COMMA,FOLLOW_COMMA_in_primitive_pattern1924); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_COMMA.add(COMMA80);

                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:377:76: ( NL )?
                                    int alt34=2;
                                    int LA34_0 = input.LA(1);

                                    if ( (LA34_0==NL) ) {
                                        alt34=1;
                                    }
                                    switch (alt34) {
                                        case 1 :
                                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:377:76: NL
                                            {
                                            NL81=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern1926); if (state.failed) return retval; 
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

                    char_literal82=(Token)match(input,ROUND_BRACKET_CLOSE,FOLLOW_ROUND_BRACKET_CLOSE_in_primitive_pattern1933); if (state.failed) return retval; 
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
                    // 378:5: -> ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( bracket_pattern )* ) )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:378:8: ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( bracket_pattern )* ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ROUND_LIST, "ROUND_LIST"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:378:21: ^( NIL_TOKEN ( COMMA )* )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_2);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:378:33: ( COMMA )*
                        while ( stream_COMMA.hasNext() ) {
                            adaptor.addChild(root_2, stream_COMMA.nextNode());

                        }
                        stream_COMMA.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:378:41: ^( NIL_TOKEN ( bracket_pattern )* )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_2);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:378:53: ( bracket_pattern )*
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:379:4: '{' ( NL )? ( mselem_pattern ( NL )? ( COMMA ( NL )? mselem_pattern ( NL )? )* )? '}'
                    {
                    char_literal83=(Token)match(input,CURLY_BRACKET_OPEN,FOLLOW_CURLY_BRACKET_OPEN_in_primitive_pattern1965); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_OPEN.add(char_literal83);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:379:9: ( NL )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==NL) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:379:9: NL
                            {
                            NL84=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern1968); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL84);


                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:379:13: ( mselem_pattern ( NL )? ( COMMA ( NL )? mselem_pattern ( NL )? )* )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==L_begin||(LA42_0>=L_obj && LA42_0<=L_if)||(LA42_0>=L_while && LA42_0<=L_for)||(LA42_0>=L_match && LA42_0<=L_case)||LA42_0==L_val||LA42_0==L_exception||(LA42_0>=A_infinity && LA42_0<=L_lazy)||(LA42_0>=L_true && LA42_0<=L_nil)||LA42_0==MINUS||LA42_0==A_NOT||LA42_0==U_NOT||(LA42_0>=A_ELLIPSIS && LA42_0<=U_ELLIPSIS)||LA42_0==L_force||(LA42_0>=Constr && LA42_0<=Num)||(LA42_0>=String && LA42_0<=ROUND_BRACKET_OPEN)||LA42_0==SQUARE_BRACKET_OPEN||LA42_0==CURLY_BRACKET_OPEN||LA42_0==UNDERSCORE) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:379:14: mselem_pattern ( NL )? ( COMMA ( NL )? mselem_pattern ( NL )? )*
                            {
                            pushFollow(FOLLOW_mselem_pattern_in_primitive_pattern1972);
                            mselem_pattern85=mselem_pattern();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_mselem_pattern.add(mselem_pattern85.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:379:29: ( NL )?
                            int alt38=2;
                            int LA38_0 = input.LA(1);

                            if ( (LA38_0==NL) ) {
                                alt38=1;
                            }
                            switch (alt38) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:379:29: NL
                                    {
                                    NL86=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern1974); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL86);


                                    }
                                    break;

                            }

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:379:33: ( COMMA ( NL )? mselem_pattern ( NL )? )*
                            loop41:
                            do {
                                int alt41=2;
                                int LA41_0 = input.LA(1);

                                if ( (LA41_0==COMMA) ) {
                                    alt41=1;
                                }


                                switch (alt41) {
                            	case 1 :
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:379:35: COMMA ( NL )? mselem_pattern ( NL )?
                            	    {
                            	    COMMA87=(Token)match(input,COMMA,FOLLOW_COMMA_in_primitive_pattern1979); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA87);

                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:379:42: ( NL )?
                            	    int alt39=2;
                            	    int LA39_0 = input.LA(1);

                            	    if ( (LA39_0==NL) ) {
                            	        alt39=1;
                            	    }
                            	    switch (alt39) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:379:42: NL
                            	            {
                            	            NL88=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern1982); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL88);


                            	            }
                            	            break;

                            	    }

                            	    pushFollow(FOLLOW_mselem_pattern_in_primitive_pattern1985);
                            	    mselem_pattern89=mselem_pattern();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_mselem_pattern.add(mselem_pattern89.getTree());
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:379:61: ( NL )?
                            	    int alt40=2;
                            	    int LA40_0 = input.LA(1);

                            	    if ( (LA40_0==NL) ) {
                            	        alt40=1;
                            	    }
                            	    switch (alt40) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:379:61: NL
                            	            {
                            	            NL90=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern1987); if (state.failed) return retval; 
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

                    char_literal91=(Token)match(input,CURLY_BRACKET_CLOSE,FOLLOW_CURLY_BRACKET_CLOSE_in_primitive_pattern1995); if (state.failed) return retval; 
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
                    // 380:5: -> ^( MAP_OR_SET_OR_OBJ ( mselem_pattern )* )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:380:8: ^( MAP_OR_SET_OR_OBJ ( mselem_pattern )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MAP_OR_SET_OR_OBJ, "MAP_OR_SET_OR_OBJ"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:380:28: ( mselem_pattern )*
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:381:4: '{' ( NL )? token_ARROW ( NL )? '}'
                    {
                    char_literal92=(Token)match(input,CURLY_BRACKET_OPEN,FOLLOW_CURLY_BRACKET_OPEN_in_primitive_pattern2013); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_OPEN.add(char_literal92);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:381:8: ( NL )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==NL) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:381:8: NL
                            {
                            NL93=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2015); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL93);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_token_ARROW_in_primitive_pattern2018);
                    token_ARROW94=token_ARROW();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_token_ARROW.add(token_ARROW94.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:381:24: ( NL )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==NL) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:381:24: NL
                            {
                            NL95=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2020); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL95);


                            }
                            break;

                    }

                    char_literal96=(Token)match(input,CURLY_BRACKET_CLOSE,FOLLOW_CURLY_BRACKET_CLOSE_in_primitive_pattern2023); if (state.failed) return retval; 
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
                    // 381:32: -> ^( EMPTY_MAP )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:381:35: ^( EMPTY_MAP )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:386:1: sep : ( NL | SC )+ ;
    public final babel17Parser.sep_return sep() throws RecognitionException {
        babel17Parser.sep_return retval = new babel17Parser.sep_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set97=null;

        CommonTree set97_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:386:5: ( ( NL | SC )+ )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:386:7: ( NL | SC )+
            {
            root_0 = (CommonTree)adaptor.nil();

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:386:7: ( NL | SC )+
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:388:1: block : ( ( sep )? statement ( sep statement )* ( sep )? -> ^( BLOCK ( statement )* ) | ( sep )? -> ^( BLOCK ) );
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:388:8: ( ( sep )? statement ( sep statement )* ( sep )? -> ^( BLOCK ( statement )* ) | ( sep )? -> ^( BLOCK ) )
            int alt51=2;
            alt51 = dfa51.predict(input);
            switch (alt51) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:388:10: ( sep )? statement ( sep statement )* ( sep )?
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:388:10: ( sep )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==SC||LA47_0==NL) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:388:10: sep
                            {
                            pushFollow(FOLLOW_sep_in_block2061);
                            sep98=sep();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_sep.add(sep98.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_statement_in_block2064);
                    statement99=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement99.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:388:25: ( sep statement )*
                    loop48:
                    do {
                        int alt48=2;
                        alt48 = dfa48.predict(input);
                        switch (alt48) {
                    	case 1 :
                    	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:388:26: sep statement
                    	    {
                    	    pushFollow(FOLLOW_sep_in_block2067);
                    	    sep100=sep();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_sep.add(sep100.getTree());
                    	    pushFollow(FOLLOW_statement_in_block2069);
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

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:388:42: ( sep )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==SC||LA49_0==NL) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:388:42: sep
                            {
                            pushFollow(FOLLOW_sep_in_block2073);
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
                    // 388:47: -> ^( BLOCK ( statement )* )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:388:50: ^( BLOCK ( statement )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:388:58: ( statement )*
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:389:4: ( sep )?
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:389:4: ( sep )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==SC||LA50_0==NL) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:389:4: sep
                            {
                            pushFollow(FOLLOW_sep_in_block2089);
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
                    // 389:9: -> ^( BLOCK )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:389:12: ^( BLOCK )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:391:1: pure_block : statement ( sep statement )* -> ^( BLOCK ( statement )* ) ;
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:392:2: ( statement ( sep statement )* -> ^( BLOCK ( statement )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:392:4: statement ( sep statement )*
            {
            pushFollow(FOLLOW_statement_in_pure_block2106);
            statement104=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statement.add(statement104.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:392:14: ( sep statement )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==NL) ) {
                    int LA52_1 = input.LA(2);

                    if ( (LA52_1==L_begin||(LA52_1>=L_obj && LA52_1<=L_if)||(LA52_1>=L_while && LA52_1<=L_for)||(LA52_1>=L_yield && LA52_1<=L_match)||(LA52_1>=L_val && LA52_1<=L_def)||LA52_1==L_exception||(LA52_1>=A_infinity && LA52_1<=L_nil)||LA52_1==SC||LA52_1==MINUS||LA52_1==A_NOT||LA52_1==U_NOT||(LA52_1>=A_ELLIPSIS && LA52_1<=U_ELLIPSIS)||LA52_1==L_force||(LA52_1>=NL && LA52_1<=Num)||(LA52_1>=String && LA52_1<=ROUND_BRACKET_OPEN)||LA52_1==SQUARE_BRACKET_OPEN||LA52_1==CURLY_BRACKET_OPEN||LA52_1==UNDERSCORE) ) {
                        alt52=1;
                    }


                }
                else if ( (LA52_0==SC) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:392:15: sep statement
            	    {
            	    pushFollow(FOLLOW_sep_in_pure_block2109);
            	    sep105=sep();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_sep.add(sep105.getTree());
            	    pushFollow(FOLLOW_statement_in_pure_block2111);
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
            // 392:31: -> ^( BLOCK ( statement )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:392:34: ^( BLOCK ( statement )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:392:42: ( statement )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:394:1: statement : ( st_val | st_def | st_memoize | st_yield | expr_or_assign );
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:395:2: ( st_val | st_def | st_memoize | st_yield | expr_or_assign )
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
            case L_choose:
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
            case L_force:
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:395:4: st_val
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_st_val_in_statement2132);
                    st_val107=st_val();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, st_val107.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:396:4: st_def
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_st_def_in_statement2137);
                    st_def108=st_def();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, st_def108.getTree());

                    }
                    break;
                case 3 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:397:4: st_memoize
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_st_memoize_in_statement2142);
                    st_memoize109=st_memoize();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, st_memoize109.getTree());

                    }
                    break;
                case 4 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:398:4: st_yield
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_st_yield_in_statement2147);
                    st_yield110=st_yield();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, st_yield110.getTree());

                    }
                    break;
                case 5 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:399:4: expr_or_assign
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_expr_or_assign_in_statement2152);
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:401:1: objelem_assign : Id PERIOD Id -> ^( OBJELEM_ASSIGN Id Id ) ;
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:402:2: ( Id PERIOD Id -> ^( OBJELEM_ASSIGN Id Id ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:402:4: Id PERIOD Id
            {
            Id112=(Token)match(input,Id,FOLLOW_Id_in_objelem_assign2161); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Id.add(Id112);

            PERIOD113=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_objelem_assign2163); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD113);

            Id114=(Token)match(input,Id,FOLLOW_Id_in_objelem_assign2165); if (state.failed) return retval; 
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
            // 402:17: -> ^( OBJELEM_ASSIGN Id Id )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:402:20: ^( OBJELEM_ASSIGN Id Id )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:404:1: st_val : L_val ( NL )? ( pattern | objelem_assign ) ( NL )? '=' ( NL )? expr -> ^( VAL ( pattern )* ( objelem_assign )* expr ) ;
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:404:8: ( L_val ( NL )? ( pattern | objelem_assign ) ( NL )? '=' ( NL )? expr -> ^( VAL ( pattern )* ( objelem_assign )* expr ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:404:10: L_val ( NL )? ( pattern | objelem_assign ) ( NL )? '=' ( NL )? expr
            {
            L_val115=(Token)match(input,L_val,FOLLOW_L_val_in_st_val2184); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_val.add(L_val115);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:404:16: ( NL )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==NL) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:404:16: NL
                    {
                    NL116=(Token)match(input,NL,FOLLOW_NL_in_st_val2186); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL116);


                    }
                    break;

            }

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:404:20: ( pattern | objelem_assign )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:404:21: pattern
                    {
                    pushFollow(FOLLOW_pattern_in_st_val2190);
                    pattern117=pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pattern.add(pattern117.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:404:31: objelem_assign
                    {
                    pushFollow(FOLLOW_objelem_assign_in_st_val2194);
                    objelem_assign118=objelem_assign();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_objelem_assign.add(objelem_assign118.getTree());

                    }
                    break;

            }

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:404:47: ( NL )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==NL) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:404:47: NL
                    {
                    NL119=(Token)match(input,NL,FOLLOW_NL_in_st_val2197); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL119);


                    }
                    break;

            }

            char_literal120=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_st_val2200); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal120);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:404:55: ( NL )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==NL) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:404:55: NL
                    {
                    NL121=(Token)match(input,NL,FOLLOW_NL_in_st_val2202); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL121);


                    }
                    break;

            }

            pushFollow(FOLLOW_expr_in_st_val2205);
            expr122=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr122.getTree());


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
            // 404:64: -> ^( VAL ( pattern )* ( objelem_assign )* expr )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:404:67: ^( VAL ( pattern )* ( objelem_assign )* expr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VAL, "VAL"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:404:73: ( pattern )*
                while ( stream_pattern.hasNext() ) {
                    adaptor.addChild(root_1, stream_pattern.nextTree());

                }
                stream_pattern.reset();
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:404:82: ( objelem_assign )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:406:1: st_def : L_def ( NL )? Id ( NL )? ( primitive_pattern ( NL )? )? '=' ( NL )? expr -> ^( DEF Id ( primitive_pattern )? expr ) ;
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:406:8: ( L_def ( NL )? Id ( NL )? ( primitive_pattern ( NL )? )? '=' ( NL )? expr -> ^( DEF Id ( primitive_pattern )? expr ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:406:10: L_def ( NL )? Id ( NL )? ( primitive_pattern ( NL )? )? '=' ( NL )? expr
            {
            L_def123=(Token)match(input,L_def,FOLLOW_L_def_in_st_def2229); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_def.add(L_def123);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:406:16: ( NL )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==NL) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:406:16: NL
                    {
                    NL124=(Token)match(input,NL,FOLLOW_NL_in_st_def2231); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL124);


                    }
                    break;

            }

            Id125=(Token)match(input,Id,FOLLOW_Id_in_st_def2234); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Id.add(Id125);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:406:23: ( NL )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==NL) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:406:23: NL
                    {
                    NL126=(Token)match(input,NL,FOLLOW_NL_in_st_def2236); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL126);


                    }
                    break;

            }

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:406:27: ( primitive_pattern ( NL )? )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( ((LA61_0>=A_infinity && LA61_0<=U_infinity)||(LA61_0>=L_true && LA61_0<=L_false)||LA61_0==L_nil||LA61_0==MINUS||(LA61_0>=Id && LA61_0<=Num)||(LA61_0>=String && LA61_0<=ROUND_BRACKET_OPEN)||LA61_0==SQUARE_BRACKET_OPEN||LA61_0==CURLY_BRACKET_OPEN||LA61_0==UNDERSCORE) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:406:28: primitive_pattern ( NL )?
                    {
                    pushFollow(FOLLOW_primitive_pattern_in_st_def2240);
                    primitive_pattern127=primitive_pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primitive_pattern.add(primitive_pattern127.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:406:46: ( NL )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==NL) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:406:46: NL
                            {
                            NL128=(Token)match(input,NL,FOLLOW_NL_in_st_def2242); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL128);


                            }
                            break;

                    }


                    }
                    break;

            }

            char_literal129=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_st_def2247); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal129);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:406:56: ( NL )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==NL) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:406:56: NL
                    {
                    NL130=(Token)match(input,NL,FOLLOW_NL_in_st_def2249); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL130);


                    }
                    break;

            }

            pushFollow(FOLLOW_expr_in_st_def2252);
            expr131=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr131.getTree());


            // AST REWRITE
            // elements: Id, expr, primitive_pattern
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 407:5: -> ^( DEF Id ( primitive_pattern )? expr )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:407:8: ^( DEF Id ( primitive_pattern )? expr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DEF, "DEF"), root_1);

                adaptor.addChild(root_1, stream_Id.nextNode());
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:407:17: ( primitive_pattern )?
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:409:1: st_yield : L_yield expr -> ^( YIELD expr ) ;
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:409:9: ( L_yield expr -> ^( YIELD expr ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:409:11: L_yield expr
            {
            L_yield132=(Token)match(input,L_yield,FOLLOW_L_yield_in_st_yield2281); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_yield.add(L_yield132);

            pushFollow(FOLLOW_expr_in_st_yield2283);
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
            // 409:24: -> ^( YIELD expr )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:409:27: ^( YIELD expr )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:411:1: st_memoize : L_memoize ( memid )+ -> ^( MEMOIZE ( memid )* ) ;
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:412:2: ( L_memoize ( memid )+ -> ^( MEMOIZE ( memid )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:412:4: L_memoize ( memid )+
            {
            L_memoize134=(Token)match(input,L_memoize,FOLLOW_L_memoize_in_st_memoize2301); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_memoize.add(L_memoize134);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:412:14: ( memid )+
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
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:412:14: memid
            	    {
            	    pushFollow(FOLLOW_memid_in_st_memoize2303);
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
            // 413:5: -> ^( MEMOIZE ( memid )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:413:8: ^( MEMOIZE ( memid )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MEMOIZE, "MEMOIZE"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:413:18: ( memid )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:415:1: memid : ( Id -> ^( MEM_STRONG Id ) | '(' Id ')' -> ^( MEM_WEAK Id ) );
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:415:7: ( Id -> ^( MEM_STRONG Id ) | '(' Id ')' -> ^( MEM_WEAK Id ) )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:415:9: Id
                    {
                    Id136=(Token)match(input,Id,FOLLOW_Id_in_memid2327); if (state.failed) return retval; 
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
                    // 415:12: -> ^( MEM_STRONG Id )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:415:15: ^( MEM_STRONG Id )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:416:4: '(' Id ')'
                    {
                    char_literal137=(Token)match(input,ROUND_BRACKET_OPEN,FOLLOW_ROUND_BRACKET_OPEN_in_memid2340); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ROUND_BRACKET_OPEN.add(char_literal137);

                    Id138=(Token)match(input,Id,FOLLOW_Id_in_memid2342); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Id.add(Id138);

                    char_literal139=(Token)match(input,ROUND_BRACKET_CLOSE,FOLLOW_ROUND_BRACKET_CLOSE_in_memid2344); if (state.failed) return retval; 
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
                    // 416:15: -> ^( MEM_WEAK Id )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:416:18: ^( MEM_WEAK Id )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:419:1: expr_or_assign : ( ( ( pattern | objelem_assign ) ( NL )? '=' )=> ( pattern | objelem_assign ) ( NL )? '=' ( NL )? expr -> ^( ASSIGN ( pattern )* ( objelem_assign )* expr ) | expr );
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:420:2: ( ( ( pattern | objelem_assign ) ( NL )? '=' )=> ( pattern | objelem_assign ) ( NL )? '=' ( NL )? expr -> ^( ASSIGN ( pattern )* ( objelem_assign )* expr ) | expr )
            int alt68=2;
            alt68 = dfa68.predict(input);
            switch (alt68) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:420:4: ( ( pattern | objelem_assign ) ( NL )? '=' )=> ( pattern | objelem_assign ) ( NL )? '=' ( NL )? expr
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:420:44: ( pattern | objelem_assign )
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
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:420:45: pattern
                            {
                            pushFollow(FOLLOW_pattern_in_expr_or_assign2384);
                            pattern140=pattern();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_pattern.add(pattern140.getTree());

                            }
                            break;
                        case 2 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:420:55: objelem_assign
                            {
                            pushFollow(FOLLOW_objelem_assign_in_expr_or_assign2388);
                            objelem_assign141=objelem_assign();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_objelem_assign.add(objelem_assign141.getTree());

                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:420:71: ( NL )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==NL) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:420:71: NL
                            {
                            NL142=(Token)match(input,NL,FOLLOW_NL_in_expr_or_assign2391); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL142);


                            }
                            break;

                    }

                    char_literal143=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_expr_or_assign2394); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal143);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:420:79: ( NL )?
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==NL) ) {
                        alt67=1;
                    }
                    switch (alt67) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:420:79: NL
                            {
                            NL144=(Token)match(input,NL,FOLLOW_NL_in_expr_or_assign2396); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL144);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_expr_in_expr_or_assign2399);
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
                    // 420:88: -> ^( ASSIGN ( pattern )* ( objelem_assign )* expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:420:91: ^( ASSIGN ( pattern )* ( objelem_assign )* expr )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASSIGN, "ASSIGN"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:420:100: ( pattern )*
                        while ( stream_pattern.hasNext() ) {
                            adaptor.addChild(root_1, stream_pattern.nextTree());

                        }
                        stream_pattern.reset();
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:420:109: ( objelem_assign )*
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:421:4: expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_expr_in_expr_or_assign2418);
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:423:1: expr : ( lop_expr | obj_expr );
    public final babel17Parser.expr_return expr() throws RecognitionException {
        babel17Parser.expr_return retval = new babel17Parser.expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.lop_expr_return lop_expr147 = null;

        babel17Parser.obj_expr_return obj_expr148 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:424:2: ( lop_expr | obj_expr )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==L_begin||(LA69_0>=L_with && LA69_0<=L_if)||(LA69_0>=L_while && LA69_0<=L_for)||LA69_0==L_match||LA69_0==L_exception||(LA69_0>=A_infinity && LA69_0<=L_lazy)||(LA69_0>=L_true && LA69_0<=L_nil)||LA69_0==MINUS||LA69_0==A_NOT||LA69_0==U_NOT||(LA69_0>=A_ELLIPSIS && LA69_0<=U_ELLIPSIS)||LA69_0==L_force||(LA69_0>=Constr && LA69_0<=Num)||(LA69_0>=String && LA69_0<=ROUND_BRACKET_OPEN)||LA69_0==SQUARE_BRACKET_OPEN||LA69_0==CURLY_BRACKET_OPEN||LA69_0==UNDERSCORE) ) {
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:424:4: lop_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_lop_expr_in_expr2429);
                    lop_expr147=lop_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lop_expr147.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:425:4: obj_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_obj_expr_in_expr2434);
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:427:1: control_expr : ( if_expr | while_do_expr | match_expr | for_expr | begin_end );
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:428:2: ( if_expr | while_do_expr | match_expr | for_expr | begin_end )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:428:4: if_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_if_expr_in_control_expr2444);
                    if_expr149=if_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, if_expr149.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:429:4: while_do_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_while_do_expr_in_control_expr2449);
                    while_do_expr150=while_do_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, while_do_expr150.getTree());

                    }
                    break;
                case 3 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:430:4: match_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_match_expr_in_control_expr2454);
                    match_expr151=match_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, match_expr151.getTree());

                    }
                    break;
                case 4 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:431:4: for_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_for_expr_in_control_expr2459);
                    for_expr152=for_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, for_expr152.getTree());

                    }
                    break;
                case 5 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:432:4: begin_end
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_begin_end_in_control_expr2464);
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:434:1: with_control_expr : ( control_expr | L_with ( NL )? protected_expr ( NL )? L_do block L_end -> ^( WITH protected_expr ^( BEGIN block ) ) );
    public final babel17Parser.with_control_expr_return with_control_expr() throws RecognitionException {
        babel17Parser.with_control_expr_return retval = new babel17Parser.with_control_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_with155=null;
        Token NL156=null;
        Token NL158=null;
        Token L_do159=null;
        Token L_end161=null;
        babel17Parser.control_expr_return control_expr154 = null;

        babel17Parser.protected_expr_return protected_expr157 = null;

        babel17Parser.block_return block160 = null;


        CommonTree L_with155_tree=null;
        CommonTree NL156_tree=null;
        CommonTree NL158_tree=null;
        CommonTree L_do159_tree=null;
        CommonTree L_end161_tree=null;
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_do=new RewriteRuleTokenStream(adaptor,"token L_do");
        RewriteRuleTokenStream stream_L_with=new RewriteRuleTokenStream(adaptor,"token L_with");
        RewriteRuleSubtreeStream stream_protected_expr=new RewriteRuleSubtreeStream(adaptor,"rule protected_expr");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:435:2: ( control_expr | L_with ( NL )? protected_expr ( NL )? L_do block L_end -> ^( WITH protected_expr ^( BEGIN block ) ) )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:435:4: control_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_control_expr_in_with_control_expr2474);
                    control_expr154=control_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, control_expr154.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:436:4: L_with ( NL )? protected_expr ( NL )? L_do block L_end
                    {
                    L_with155=(Token)match(input,L_with,FOLLOW_L_with_in_with_control_expr2479); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_with.add(L_with155);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:436:11: ( NL )?
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==NL) ) {
                        alt71=1;
                    }
                    switch (alt71) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:436:11: NL
                            {
                            NL156=(Token)match(input,NL,FOLLOW_NL_in_with_control_expr2481); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL156);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_protected_expr_in_with_control_expr2484);
                    protected_expr157=protected_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr157.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:436:30: ( NL )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==NL) ) {
                        alt72=1;
                    }
                    switch (alt72) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:436:30: NL
                            {
                            NL158=(Token)match(input,NL,FOLLOW_NL_in_with_control_expr2486); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL158);


                            }
                            break;

                    }

                    L_do159=(Token)match(input,L_do,FOLLOW_L_do_in_with_control_expr2489); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_do.add(L_do159);

                    pushFollow(FOLLOW_block_in_with_control_expr2491);
                    block160=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block160.getTree());
                    L_end161=(Token)match(input,L_end,FOLLOW_L_end_in_with_control_expr2493); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_end.add(L_end161);



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
                    // 436:51: -> ^( WITH protected_expr ^( BEGIN block ) )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:436:54: ^( WITH protected_expr ^( BEGIN block ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(WITH, "WITH"), root_1);

                        adaptor.addChild(root_1, stream_protected_expr.nextTree());
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:436:76: ^( BEGIN block )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BEGIN, "BEGIN"), root_2);

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
    // $ANTLR end "with_control_expr"

    public static class protected_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "protected_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:439:1: protected_expr : ( p_lop_expr | obj_expr );
    public final babel17Parser.protected_expr_return protected_expr() throws RecognitionException {
        babel17Parser.protected_expr_return retval = new babel17Parser.protected_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.p_lop_expr_return p_lop_expr162 = null;

        babel17Parser.obj_expr_return obj_expr163 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:440:2: ( p_lop_expr | obj_expr )
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==L_begin||(LA74_0>=L_with && LA74_0<=L_if)||(LA74_0>=L_while && LA74_0<=L_for)||(LA74_0>=L_match && LA74_0<=L_case)||LA74_0==L_exception||(LA74_0>=A_infinity && LA74_0<=L_lazy)||(LA74_0>=L_true && LA74_0<=L_nil)||LA74_0==MINUS||LA74_0==A_NOT||LA74_0==U_NOT||(LA74_0>=A_ELLIPSIS && LA74_0<=U_ELLIPSIS)||LA74_0==L_force||(LA74_0>=Constr && LA74_0<=Num)||(LA74_0>=String && LA74_0<=ROUND_BRACKET_OPEN)||LA74_0==SQUARE_BRACKET_OPEN||LA74_0==CURLY_BRACKET_OPEN||LA74_0==UNDERSCORE) ) {
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:440:4: p_lop_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_p_lop_expr_in_protected_expr2518);
                    p_lop_expr162=p_lop_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_lop_expr162.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:441:4: obj_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_obj_expr_in_protected_expr2523);
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:444:1: begin_end : L_begin block L_end -> ^( BEGIN block ) ;
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:445:2: ( L_begin block L_end -> ^( BEGIN block ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:445:4: L_begin block L_end
            {
            L_begin164=(Token)match(input,L_begin,FOLLOW_L_begin_in_begin_end2535); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_begin.add(L_begin164);

            pushFollow(FOLLOW_block_in_begin_end2537);
            block165=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block165.getTree());
            L_end166=(Token)match(input,L_end,FOLLOW_L_end_in_begin_end2539); if (state.failed) return retval; 
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
            // 445:24: -> ^( BEGIN block )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:445:27: ^( BEGIN block )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:448:1: parents : ( '+' primitive_expr -> ^( PARENTS_PLUS primitive_expr ) | '*' primitive_expr -> ^( PARENTS_MUL primitive_expr ) );
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:448:9: ( '+' primitive_expr -> ^( PARENTS_PLUS primitive_expr ) | '*' primitive_expr -> ^( PARENTS_MUL primitive_expr ) )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:448:11: '+' primitive_expr
                    {
                    char_literal167=(Token)match(input,PLUS,FOLLOW_PLUS_in_parents2557); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PLUS.add(char_literal167);

                    pushFollow(FOLLOW_primitive_expr_in_parents2559);
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
                    // 448:30: -> ^( PARENTS_PLUS primitive_expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:448:33: ^( PARENTS_PLUS primitive_expr )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:449:4: '*' primitive_expr
                    {
                    char_literal169=(Token)match(input,TIMES,FOLLOW_TIMES_in_parents2572); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TIMES.add(char_literal169);

                    pushFollow(FOLLOW_primitive_expr_in_parents2574);
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
                    // 449:23: -> ^( PARENTS_MUL primitive_expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:449:26: ^( PARENTS_MUL primitive_expr )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:452:1: obj_expr : ( ( L_obj ( NL )? parents )=> L_obj ( NL )? parents block L_end -> ^( OBJ block parents ) | L_obj block L_end -> ^( OBJ block ) );
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:452:9: ( ( L_obj ( NL )? parents )=> L_obj ( NL )? parents block L_end -> ^( OBJ block parents ) | L_obj block L_end -> ^( OBJ block ) )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==L_obj) ) {
                int LA77_1 = input.LA(2);

                if ( (LA77_1==NL) ) {
                    int LA77_2 = input.LA(3);

                    if ( ((LA77_2>=L_begin && LA77_2<=L_if)||(LA77_2>=L_while && LA77_2<=L_for)||(LA77_2>=L_yield && LA77_2<=L_match)||(LA77_2>=L_val && LA77_2<=L_def)||LA77_2==L_exception||(LA77_2>=A_infinity && LA77_2<=L_nil)||LA77_2==SC||LA77_2==MINUS||LA77_2==A_NOT||LA77_2==U_NOT||(LA77_2>=A_ELLIPSIS && LA77_2<=U_ELLIPSIS)||LA77_2==L_force||(LA77_2>=NL && LA77_2<=Num)||(LA77_2>=String && LA77_2<=ROUND_BRACKET_OPEN)||LA77_2==SQUARE_BRACKET_OPEN||LA77_2==CURLY_BRACKET_OPEN||LA77_2==UNDERSCORE) ) {
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
                else if ( (LA77_1==PLUS) && (synpred4_babel17())) {
                    alt77=1;
                }
                else if ( (LA77_1==TIMES) && (synpred4_babel17())) {
                    alt77=1;
                }
                else if ( ((LA77_1>=L_begin && LA77_1<=L_if)||(LA77_1>=L_while && LA77_1<=L_for)||(LA77_1>=L_yield && LA77_1<=L_match)||(LA77_1>=L_val && LA77_1<=L_def)||LA77_1==L_exception||(LA77_1>=A_infinity && LA77_1<=L_nil)||LA77_1==SC||LA77_1==MINUS||LA77_1==A_NOT||LA77_1==U_NOT||(LA77_1>=A_ELLIPSIS && LA77_1<=U_ELLIPSIS)||LA77_1==L_force||(LA77_1>=Constr && LA77_1<=Num)||(LA77_1>=String && LA77_1<=ROUND_BRACKET_OPEN)||LA77_1==SQUARE_BRACKET_OPEN||LA77_1==CURLY_BRACKET_OPEN||LA77_1==UNDERSCORE) ) {
                    alt77=2;
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:452:11: ( L_obj ( NL )? parents )=> L_obj ( NL )? parents block L_end
                    {
                    L_obj171=(Token)match(input,L_obj,FOLLOW_L_obj_in_obj_expr2602); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_obj.add(L_obj171);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:452:40: ( NL )?
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==NL) ) {
                        alt76=1;
                    }
                    switch (alt76) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:452:40: NL
                            {
                            NL172=(Token)match(input,NL,FOLLOW_NL_in_obj_expr2604); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL172);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_parents_in_obj_expr2607);
                    parents173=parents();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parents.add(parents173.getTree());
                    pushFollow(FOLLOW_block_in_obj_expr2609);
                    block174=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block174.getTree());
                    L_end175=(Token)match(input,L_end,FOLLOW_L_end_in_obj_expr2611); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_end.add(L_end175);



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
                    // 452:64: -> ^( OBJ block parents )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:452:67: ^( OBJ block parents )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:453:17: L_obj block L_end
                    {
                    L_obj176=(Token)match(input,L_obj,FOLLOW_L_obj_in_obj_expr2639); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_obj.add(L_obj176);

                    pushFollow(FOLLOW_block_in_obj_expr2641);
                    block177=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block177.getTree());
                    L_end178=(Token)match(input,L_end,FOLLOW_L_end_in_obj_expr2643); if (state.failed) return retval; 
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
                    // 453:35: -> ^( OBJ block )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:453:38: ^( OBJ block )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:455:1: lop_expr : ( ( lambda_expr )=> lambda_expr | op_expr );
    public final babel17Parser.lop_expr_return lop_expr() throws RecognitionException {
        babel17Parser.lop_expr_return retval = new babel17Parser.lop_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.lambda_expr_return lambda_expr179 = null;

        babel17Parser.op_expr_return op_expr180 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:456:2: ( ( lambda_expr )=> lambda_expr | op_expr )
            int alt78=2;
            alt78 = dfa78.predict(input);
            switch (alt78) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:456:4: ( lambda_expr )=> lambda_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_lambda_expr_in_lop_expr2671);
                    lambda_expr179=lambda_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lambda_expr179.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:457:4: op_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_op_expr_in_lop_expr2676);
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:459:1: p_lop_expr : ( ( protected_lambda_expr )=> protected_lambda_expr | p_op_expr );
    public final babel17Parser.p_lop_expr_return p_lop_expr() throws RecognitionException {
        babel17Parser.p_lop_expr_return retval = new babel17Parser.p_lop_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.protected_lambda_expr_return protected_lambda_expr181 = null;

        babel17Parser.p_op_expr_return p_op_expr182 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:460:2: ( ( protected_lambda_expr )=> protected_lambda_expr | p_op_expr )
            int alt79=2;
            alt79 = dfa79.predict(input);
            switch (alt79) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:460:4: ( protected_lambda_expr )=> protected_lambda_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_protected_lambda_expr_in_p_lop_expr2692);
                    protected_lambda_expr181=protected_lambda_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, protected_lambda_expr181.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:461:4: p_op_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_p_op_expr_in_p_lop_expr2697);
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:463:1: if_expr : L_if ( NL )? protected_expr ( NL )? L_then block ( L_elseif ( NL )? protected_expr ( NL )? L_then block )* ( L_else block )? L_end -> ^( IF ( protected_expr )* ( block )* ) ;
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:463:9: ( L_if ( NL )? protected_expr ( NL )? L_then block ( L_elseif ( NL )? protected_expr ( NL )? L_then block )* ( L_else block )? L_end -> ^( IF ( protected_expr )* ( block )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:463:11: L_if ( NL )? protected_expr ( NL )? L_then block ( L_elseif ( NL )? protected_expr ( NL )? L_then block )* ( L_else block )? L_end
            {
            L_if183=(Token)match(input,L_if,FOLLOW_L_if_in_if_expr2708); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_if.add(L_if183);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:463:16: ( NL )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==NL) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:463:16: NL
                    {
                    NL184=(Token)match(input,NL,FOLLOW_NL_in_if_expr2710); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL184);


                    }
                    break;

            }

            pushFollow(FOLLOW_protected_expr_in_if_expr2713);
            protected_expr185=protected_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr185.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:463:35: ( NL )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==NL) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:463:35: NL
                    {
                    NL186=(Token)match(input,NL,FOLLOW_NL_in_if_expr2715); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL186);


                    }
                    break;

            }

            L_then187=(Token)match(input,L_then,FOLLOW_L_then_in_if_expr2718); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_then.add(L_then187);

            pushFollow(FOLLOW_block_in_if_expr2720);
            block188=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block188.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:464:3: ( L_elseif ( NL )? protected_expr ( NL )? L_then block )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==L_elseif) ) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:464:4: L_elseif ( NL )? protected_expr ( NL )? L_then block
            	    {
            	    L_elseif189=(Token)match(input,L_elseif,FOLLOW_L_elseif_in_if_expr2726); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_L_elseif.add(L_elseif189);

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:464:13: ( NL )?
            	    int alt82=2;
            	    int LA82_0 = input.LA(1);

            	    if ( (LA82_0==NL) ) {
            	        alt82=1;
            	    }
            	    switch (alt82) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:464:13: NL
            	            {
            	            NL190=(Token)match(input,NL,FOLLOW_NL_in_if_expr2728); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL190);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_protected_expr_in_if_expr2731);
            	    protected_expr191=protected_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr191.getTree());
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:464:32: ( NL )?
            	    int alt83=2;
            	    int LA83_0 = input.LA(1);

            	    if ( (LA83_0==NL) ) {
            	        alt83=1;
            	    }
            	    switch (alt83) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:464:32: NL
            	            {
            	            NL192=(Token)match(input,NL,FOLLOW_NL_in_if_expr2733); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL192);


            	            }
            	            break;

            	    }

            	    L_then193=(Token)match(input,L_then,FOLLOW_L_then_in_if_expr2736); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_L_then.add(L_then193);

            	    pushFollow(FOLLOW_block_in_if_expr2738);
            	    block194=block();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_block.add(block194.getTree());

            	    }
            	    break;

            	default :
            	    break loop84;
                }
            } while (true);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:465:3: ( L_else block )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==L_else) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:465:4: L_else block
                    {
                    L_else195=(Token)match(input,L_else,FOLLOW_L_else_in_if_expr2746); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_else.add(L_else195);

                    pushFollow(FOLLOW_block_in_if_expr2748);
                    block196=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block196.getTree());

                    }
                    break;

            }

            L_end197=(Token)match(input,L_end,FOLLOW_L_end_in_if_expr2752); if (state.failed) return retval; 
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
            // 465:26: -> ^( IF ( protected_expr )* ( block )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:465:29: ^( IF ( protected_expr )* ( block )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IF, "IF"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:465:34: ( protected_expr )*
                while ( stream_protected_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_protected_expr.nextTree());

                }
                stream_protected_expr.reset();
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:465:50: ( block )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:467:1: while_do_expr : L_while ( NL )? protected_expr ( NL )? L_do block L_end -> ^( WHILE_DO protected_expr block ) ;
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:468:2: ( L_while ( NL )? protected_expr ( NL )? L_do block L_end -> ^( WHILE_DO protected_expr block ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:468:4: L_while ( NL )? protected_expr ( NL )? L_do block L_end
            {
            L_while198=(Token)match(input,L_while,FOLLOW_L_while_in_while_do_expr2776); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_while.add(L_while198);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:468:12: ( NL )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==NL) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:468:12: NL
                    {
                    NL199=(Token)match(input,NL,FOLLOW_NL_in_while_do_expr2778); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL199);


                    }
                    break;

            }

            pushFollow(FOLLOW_protected_expr_in_while_do_expr2781);
            protected_expr200=protected_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr200.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:468:31: ( NL )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==NL) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:468:31: NL
                    {
                    NL201=(Token)match(input,NL,FOLLOW_NL_in_while_do_expr2783); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL201);


                    }
                    break;

            }

            L_do202=(Token)match(input,L_do,FOLLOW_L_do_in_while_do_expr2786); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_do.add(L_do202);

            pushFollow(FOLLOW_block_in_while_do_expr2788);
            block203=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block203.getTree());
            L_end204=(Token)match(input,L_end,FOLLOW_L_end_in_while_do_expr2790); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_end.add(L_end204);



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
            // 469:5: -> ^( WHILE_DO protected_expr block )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:469:8: ^( WHILE_DO protected_expr block )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:471:1: cases : ( full_cases | pattern ( NL )? token_DOUBLE_ARROW block -> ^( CASES ^( NIL_TOKEN pattern block ) ) );
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:472:2: ( full_cases | pattern ( NL )? token_DOUBLE_ARROW block -> ^( CASES ^( NIL_TOKEN pattern block ) ) )
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==L_case) ) {
                alt89=1;
            }
            else if ( (LA89_0==L_exception||(LA89_0>=A_infinity && LA89_0<=U_infinity)||(LA89_0>=L_true && LA89_0<=L_false)||LA89_0==L_nil||LA89_0==MINUS||(LA89_0>=A_ELLIPSIS && LA89_0<=U_ELLIPSIS)||(LA89_0>=Constr && LA89_0<=Num)||(LA89_0>=String && LA89_0<=ROUND_BRACKET_OPEN)||LA89_0==SQUARE_BRACKET_OPEN||LA89_0==CURLY_BRACKET_OPEN||LA89_0==UNDERSCORE) ) {
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:472:4: full_cases
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_full_cases_in_cases2820);
                    full_cases205=full_cases();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, full_cases205.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:473:4: pattern ( NL )? token_DOUBLE_ARROW block
                    {
                    pushFollow(FOLLOW_pattern_in_cases2825);
                    pattern206=pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pattern.add(pattern206.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:473:12: ( NL )?
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==NL) ) {
                        alt88=1;
                    }
                    switch (alt88) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:473:12: NL
                            {
                            NL207=(Token)match(input,NL,FOLLOW_NL_in_cases2827); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL207);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_token_DOUBLE_ARROW_in_cases2830);
                    token_DOUBLE_ARROW208=token_DOUBLE_ARROW();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_token_DOUBLE_ARROW.add(token_DOUBLE_ARROW208.getTree());
                    pushFollow(FOLLOW_block_in_cases2832);
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
                    // 473:41: -> ^( CASES ^( NIL_TOKEN pattern block ) )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:473:44: ^( CASES ^( NIL_TOKEN pattern block ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CASES, "CASES"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:473:52: ^( NIL_TOKEN pattern block )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:475:1: full_cases : ( case_expr )+ -> ^( CASES ( case_expr )+ ) ;
    public final babel17Parser.full_cases_return full_cases() throws RecognitionException {
        babel17Parser.full_cases_return retval = new babel17Parser.full_cases_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.case_expr_return case_expr210 = null;


        RewriteRuleSubtreeStream stream_case_expr=new RewriteRuleSubtreeStream(adaptor,"rule case_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:476:2: ( ( case_expr )+ -> ^( CASES ( case_expr )+ ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:476:4: ( case_expr )+
            {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:476:4: ( case_expr )+
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
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:476:4: case_expr
            	    {
            	    pushFollow(FOLLOW_case_expr_in_full_cases2855);
            	    case_expr210=case_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_case_expr.add(case_expr210.getTree());

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
            // 476:15: -> ^( CASES ( case_expr )+ )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:476:18: ^( CASES ( case_expr )+ )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:478:1: case_expr : ( L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW block ) -> ^( NIL_TOKEN pattern block ) ;
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:479:2: ( ( L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW block ) -> ^( NIL_TOKEN pattern block ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:479:4: ( L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW block )
            {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:479:4: ( L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW block )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:479:5: L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW block
            {
            L_case211=(Token)match(input,L_case,FOLLOW_L_case_in_case_expr2876); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_case.add(L_case211);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:479:12: ( NL )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==NL) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:479:12: NL
                    {
                    NL212=(Token)match(input,NL,FOLLOW_NL_in_case_expr2878); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL212);


                    }
                    break;

            }

            pushFollow(FOLLOW_pattern_in_case_expr2881);
            pattern213=pattern();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pattern.add(pattern213.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:479:24: ( NL )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==NL) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:479:24: NL
                    {
                    NL214=(Token)match(input,NL,FOLLOW_NL_in_case_expr2883); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL214);


                    }
                    break;

            }

            pushFollow(FOLLOW_token_DOUBLE_ARROW_in_case_expr2886);
            token_DOUBLE_ARROW215=token_DOUBLE_ARROW();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_token_DOUBLE_ARROW.add(token_DOUBLE_ARROW215.getTree());
            pushFollow(FOLLOW_block_in_case_expr2888);
            block216=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block216.getTree());

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
            // 479:54: -> ^( NIL_TOKEN pattern block )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:479:57: ^( NIL_TOKEN pattern block )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:481:1: match_expr : L_match ( NL )? p_op_expr ( NL )? full_cases L_end -> ^( MATCH p_op_expr full_cases ) ;
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:482:2: ( L_match ( NL )? p_op_expr ( NL )? full_cases L_end -> ^( MATCH p_op_expr full_cases ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:482:4: L_match ( NL )? p_op_expr ( NL )? full_cases L_end
            {
            L_match217=(Token)match(input,L_match,FOLLOW_L_match_in_match_expr2909); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_match.add(L_match217);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:482:12: ( NL )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==NL) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:482:12: NL
                    {
                    NL218=(Token)match(input,NL,FOLLOW_NL_in_match_expr2911); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL218);


                    }
                    break;

            }

            pushFollow(FOLLOW_p_op_expr_in_match_expr2914);
            p_op_expr219=p_op_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_p_op_expr.add(p_op_expr219.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:482:26: ( NL )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==NL) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:482:26: NL
                    {
                    NL220=(Token)match(input,NL,FOLLOW_NL_in_match_expr2916); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL220);


                    }
                    break;

            }

            pushFollow(FOLLOW_full_cases_in_match_expr2919);
            full_cases221=full_cases();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_full_cases.add(full_cases221.getTree());
            L_end222=(Token)match(input,L_end,FOLLOW_L_end_in_match_expr2921); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_end.add(L_end222);



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
            // 483:5: -> ^( MATCH p_op_expr full_cases )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:483:8: ^( MATCH p_op_expr full_cases )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:485:1: lambda_expr : lambda_cases -> ^( LAMBDA lambda_cases ) ;
    public final babel17Parser.lambda_expr_return lambda_expr() throws RecognitionException {
        babel17Parser.lambda_expr_return retval = new babel17Parser.lambda_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.lambda_cases_return lambda_cases223 = null;


        RewriteRuleSubtreeStream stream_lambda_cases=new RewriteRuleSubtreeStream(adaptor,"rule lambda_cases");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:486:2: ( lambda_cases -> ^( LAMBDA lambda_cases ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:486:4: lambda_cases
            {
            pushFollow(FOLLOW_lambda_cases_in_lambda_expr2947);
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
            // 486:17: -> ^( LAMBDA lambda_cases )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:486:20: ^( LAMBDA lambda_cases )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:488:1: lambda_cases : pattern ( NL )? token_DOUBLE_ARROW ( NL )? lop_expr -> ^( CASES ^( NIL_TOKEN pattern ^( BLOCK lop_expr ) ) ) ;
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:489:2: ( pattern ( NL )? token_DOUBLE_ARROW ( NL )? lop_expr -> ^( CASES ^( NIL_TOKEN pattern ^( BLOCK lop_expr ) ) ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:489:4: pattern ( NL )? token_DOUBLE_ARROW ( NL )? lop_expr
            {
            pushFollow(FOLLOW_pattern_in_lambda_cases2965);
            pattern224=pattern();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pattern.add(pattern224.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:489:12: ( NL )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==NL) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:489:12: NL
                    {
                    NL225=(Token)match(input,NL,FOLLOW_NL_in_lambda_cases2967); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL225);


                    }
                    break;

            }

            pushFollow(FOLLOW_token_DOUBLE_ARROW_in_lambda_cases2970);
            token_DOUBLE_ARROW226=token_DOUBLE_ARROW();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_token_DOUBLE_ARROW.add(token_DOUBLE_ARROW226.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:489:35: ( NL )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==NL) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:489:35: NL
                    {
                    NL227=(Token)match(input,NL,FOLLOW_NL_in_lambda_cases2972); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL227);


                    }
                    break;

            }

            pushFollow(FOLLOW_lop_expr_in_lambda_cases2975);
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
            // 489:48: -> ^( CASES ^( NIL_TOKEN pattern ^( BLOCK lop_expr ) ) )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:489:51: ^( CASES ^( NIL_TOKEN pattern ^( BLOCK lop_expr ) ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CASES, "CASES"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:489:59: ^( NIL_TOKEN pattern ^( BLOCK lop_expr ) )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_2);

                adaptor.addChild(root_2, stream_pattern.nextTree());
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:489:79: ^( BLOCK lop_expr )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:491:1: protected_lambda_expr : protected_lambda_cases -> ^( LAMBDA protected_lambda_cases ) ;
    public final babel17Parser.protected_lambda_expr_return protected_lambda_expr() throws RecognitionException {
        babel17Parser.protected_lambda_expr_return retval = new babel17Parser.protected_lambda_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.protected_lambda_cases_return protected_lambda_cases229 = null;


        RewriteRuleSubtreeStream stream_protected_lambda_cases=new RewriteRuleSubtreeStream(adaptor,"rule protected_lambda_cases");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:492:2: ( protected_lambda_cases -> ^( LAMBDA protected_lambda_cases ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:492:4: protected_lambda_cases
            {
            pushFollow(FOLLOW_protected_lambda_cases_in_protected_lambda_expr3003);
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
            // 492:27: -> ^( LAMBDA protected_lambda_cases )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:492:30: ^( LAMBDA protected_lambda_cases )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:494:1: p_lambda_case_expr : ( L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block ) -> ^( NIL_TOKEN pattern pure_block ) ;
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:495:2: ( ( L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block ) -> ^( NIL_TOKEN pattern pure_block ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:495:4: ( L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block )
            {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:495:4: ( L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:495:5: L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block
            {
            L_case230=(Token)match(input,L_case,FOLLOW_L_case_in_p_lambda_case_expr3021); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_case.add(L_case230);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:495:12: ( NL )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==NL) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:495:12: NL
                    {
                    NL231=(Token)match(input,NL,FOLLOW_NL_in_p_lambda_case_expr3023); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL231);


                    }
                    break;

            }

            pushFollow(FOLLOW_pattern_in_p_lambda_case_expr3026);
            pattern232=pattern();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pattern.add(pattern232.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:495:24: ( NL )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==NL) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:495:24: NL
                    {
                    NL233=(Token)match(input,NL,FOLLOW_NL_in_p_lambda_case_expr3028); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL233);


                    }
                    break;

            }

            pushFollow(FOLLOW_token_DOUBLE_ARROW_in_p_lambda_case_expr3031);
            token_DOUBLE_ARROW234=token_DOUBLE_ARROW();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_token_DOUBLE_ARROW.add(token_DOUBLE_ARROW234.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:495:47: ( NL )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==NL) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:495:47: NL
                    {
                    NL235=(Token)match(input,NL,FOLLOW_NL_in_p_lambda_case_expr3033); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL235);


                    }
                    break;

            }

            pushFollow(FOLLOW_pure_block_in_p_lambda_case_expr3036);
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
            // 495:63: -> ^( NIL_TOKEN pattern pure_block )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:495:66: ^( NIL_TOKEN pattern pure_block )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:497:1: protected_lambda_cases : ( pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block -> ^( CASES ^( NIL_TOKEN pattern pure_block ) ) | ( p_lambda_case_expr )+ -> ^( CASES ( p_lambda_case_expr )+ ) );
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:498:2: ( pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block -> ^( CASES ^( NIL_TOKEN pattern pure_block ) ) | ( p_lambda_case_expr )+ -> ^( CASES ( p_lambda_case_expr )+ ) )
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==L_exception||(LA103_0>=A_infinity && LA103_0<=U_infinity)||(LA103_0>=L_true && LA103_0<=L_false)||LA103_0==L_nil||LA103_0==MINUS||(LA103_0>=A_ELLIPSIS && LA103_0<=U_ELLIPSIS)||(LA103_0>=Constr && LA103_0<=Num)||(LA103_0>=String && LA103_0<=ROUND_BRACKET_OPEN)||LA103_0==SQUARE_BRACKET_OPEN||LA103_0==CURLY_BRACKET_OPEN||LA103_0==UNDERSCORE) ) {
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:498:4: pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block
                    {
                    pushFollow(FOLLOW_pattern_in_protected_lambda_cases3057);
                    pattern237=pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pattern.add(pattern237.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:498:12: ( NL )?
                    int alt100=2;
                    int LA100_0 = input.LA(1);

                    if ( (LA100_0==NL) ) {
                        alt100=1;
                    }
                    switch (alt100) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:498:12: NL
                            {
                            NL238=(Token)match(input,NL,FOLLOW_NL_in_protected_lambda_cases3059); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL238);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_token_DOUBLE_ARROW_in_protected_lambda_cases3062);
                    token_DOUBLE_ARROW239=token_DOUBLE_ARROW();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_token_DOUBLE_ARROW.add(token_DOUBLE_ARROW239.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:498:35: ( NL )?
                    int alt101=2;
                    int LA101_0 = input.LA(1);

                    if ( (LA101_0==NL) ) {
                        alt101=1;
                    }
                    switch (alt101) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:498:35: NL
                            {
                            NL240=(Token)match(input,NL,FOLLOW_NL_in_protected_lambda_cases3064); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL240);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_pure_block_in_protected_lambda_cases3067);
                    pure_block241=pure_block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pure_block.add(pure_block241.getTree());


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
                    // 498:50: -> ^( CASES ^( NIL_TOKEN pattern pure_block ) )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:498:53: ^( CASES ^( NIL_TOKEN pattern pure_block ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CASES, "CASES"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:498:61: ^( NIL_TOKEN pattern pure_block )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:499:4: ( p_lambda_case_expr )+
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:499:4: ( p_lambda_case_expr )+
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
                    	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:499:4: p_lambda_case_expr
                    	    {
                    	    pushFollow(FOLLOW_p_lambda_case_expr_in_protected_lambda_cases3086);
                    	    p_lambda_case_expr242=p_lambda_case_expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_p_lambda_case_expr.add(p_lambda_case_expr242.getTree());

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
                    // 499:24: -> ^( CASES ( p_lambda_case_expr )+ )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:499:27: ^( CASES ( p_lambda_case_expr )+ )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:501:1: for_expr : L_for ( NL )? pattern ( NL )? L_in ( NL )? protected_expr ( NL )? L_do block L_end -> ^( FOR_EXPR pattern protected_expr block ) ;
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:501:9: ( L_for ( NL )? pattern ( NL )? L_in ( NL )? protected_expr ( NL )? L_do block L_end -> ^( FOR_EXPR pattern protected_expr block ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:501:11: L_for ( NL )? pattern ( NL )? L_in ( NL )? protected_expr ( NL )? L_do block L_end
            {
            L_for243=(Token)match(input,L_for,FOLLOW_L_for_in_for_expr3103); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_for.add(L_for243);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:501:17: ( NL )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==NL) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:501:17: NL
                    {
                    NL244=(Token)match(input,NL,FOLLOW_NL_in_for_expr3105); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL244);


                    }
                    break;

            }

            pushFollow(FOLLOW_pattern_in_for_expr3108);
            pattern245=pattern();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pattern.add(pattern245.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:501:29: ( NL )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==NL) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:501:29: NL
                    {
                    NL246=(Token)match(input,NL,FOLLOW_NL_in_for_expr3110); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL246);


                    }
                    break;

            }

            L_in247=(Token)match(input,L_in,FOLLOW_L_in_in_for_expr3113); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_in.add(L_in247);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:501:38: ( NL )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==NL) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:501:38: NL
                    {
                    NL248=(Token)match(input,NL,FOLLOW_NL_in_for_expr3115); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL248);


                    }
                    break;

            }

            pushFollow(FOLLOW_protected_expr_in_for_expr3118);
            protected_expr249=protected_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr249.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:501:57: ( NL )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==NL) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:501:57: NL
                    {
                    NL250=(Token)match(input,NL,FOLLOW_NL_in_for_expr3120); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL250);


                    }
                    break;

            }

            L_do251=(Token)match(input,L_do,FOLLOW_L_do_in_for_expr3123); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_do.add(L_do251);

            pushFollow(FOLLOW_block_in_for_expr3125);
            block252=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block252.getTree());
            L_end253=(Token)match(input,L_end,FOLLOW_L_end_in_for_expr3127); if (state.failed) return retval; 
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
            // 502:5: -> ^( FOR_EXPR pattern protected_expr block )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:502:8: ^( FOR_EXPR pattern protected_expr block )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:504:1: op_expr : ( builtin_primitive op_expr | bool_expr );
    public final babel17Parser.op_expr_return op_expr() throws RecognitionException {
        babel17Parser.op_expr_return retval = new babel17Parser.op_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.builtin_primitive_return builtin_primitive254 = null;

        babel17Parser.op_expr_return op_expr255 = null;

        babel17Parser.bool_expr_return bool_expr256 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:504:9: ( builtin_primitive op_expr | bool_expr )
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==L_exception||(LA108_0>=L_concurrent && LA108_0<=L_lazy)||LA108_0==L_random||LA108_0==L_force) ) {
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:504:11: builtin_primitive op_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_builtin_primitive_in_op_expr3152);
                    builtin_primitive254=builtin_primitive();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(builtin_primitive254.getTree(), root_0);
                    pushFollow(FOLLOW_op_expr_in_op_expr3155);
                    op_expr255=op_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, op_expr255.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:505:4: bool_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_bool_expr_in_op_expr3160);
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:507:1: p_op_expr : ( builtin_primitive ( NL )? p_op_expr | p_bool_expr );
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:508:2: ( builtin_primitive ( NL )? p_op_expr | p_bool_expr )
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==L_exception||(LA110_0>=L_concurrent && LA110_0<=L_lazy)||LA110_0==L_random||LA110_0==L_force) ) {
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:508:4: builtin_primitive ( NL )? p_op_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_builtin_primitive_in_p_op_expr3170);
                    builtin_primitive257=builtin_primitive();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(builtin_primitive257.getTree(), root_0);
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:508:25: ( NL )?
                    int alt109=2;
                    int LA109_0 = input.LA(1);

                    if ( (LA109_0==NL) ) {
                        alt109=1;
                    }
                    switch (alt109) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:508:25: NL
                            {
                            NL258=(Token)match(input,NL,FOLLOW_NL_in_p_op_expr3173); if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_p_op_expr_in_p_op_expr3177);
                    p_op_expr259=p_op_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_op_expr259.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:509:4: p_bool_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_p_bool_expr_in_p_op_expr3182);
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:512:1: builtin_primitive : ( L_random | L_exception | L_lazy | L_choose | L_concurrent | L_force );
    public final babel17Parser.builtin_primitive_return builtin_primitive() throws RecognitionException {
        babel17Parser.builtin_primitive_return retval = new babel17Parser.builtin_primitive_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set261=null;

        CommonTree set261_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:513:2: ( L_random | L_exception | L_lazy | L_choose | L_concurrent | L_force )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set261=(Token)input.LT(1);
            if ( input.LA(1)==L_exception||(input.LA(1)>=L_concurrent && input.LA(1)<=L_lazy)||input.LA(1)==L_random||input.LA(1)==L_force ) {
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:515:1: bool_expr : bool_or_expr ;
    public final babel17Parser.bool_expr_return bool_expr() throws RecognitionException {
        babel17Parser.bool_expr_return retval = new babel17Parser.bool_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.bool_or_expr_return bool_or_expr262 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:516:2: ( bool_or_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:516:4: bool_or_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bool_or_expr_in_bool_expr3222);
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:518:1: p_bool_expr : p_bool_or_expr ;
    public final babel17Parser.p_bool_expr_return p_bool_expr() throws RecognitionException {
        babel17Parser.p_bool_expr_return retval = new babel17Parser.p_bool_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.p_bool_or_expr_return p_bool_or_expr263 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:519:2: ( p_bool_or_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:519:4: p_bool_or_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_bool_or_expr_in_p_bool_expr3232);
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:521:1: bool_or_expr : bool_and_expr ( ( NL )? token_OR ( NL )? bool_and_expr )* ;
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:522:2: ( bool_and_expr ( ( NL )? token_OR ( NL )? bool_and_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:522:4: bool_and_expr ( ( NL )? token_OR ( NL )? bool_and_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bool_and_expr_in_bool_or_expr3241);
            bool_and_expr264=bool_and_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_and_expr264.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:522:18: ( ( NL )? token_OR ( NL )? bool_and_expr )*
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
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:522:19: ( NL )? token_OR ( NL )? bool_and_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:522:21: ( NL )?
            	    int alt111=2;
            	    int LA111_0 = input.LA(1);

            	    if ( (LA111_0==NL) ) {
            	        alt111=1;
            	    }
            	    switch (alt111) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:522:21: NL
            	            {
            	            NL265=(Token)match(input,NL,FOLLOW_NL_in_bool_or_expr3244); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_token_OR_in_bool_or_expr3248);
            	    token_OR266=token_OR();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(token_OR266.getTree(), root_0);
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:522:36: ( NL )?
            	    int alt112=2;
            	    int LA112_0 = input.LA(1);

            	    if ( (LA112_0==NL) ) {
            	        alt112=1;
            	    }
            	    switch (alt112) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:522:36: NL
            	            {
            	            NL267=(Token)match(input,NL,FOLLOW_NL_in_bool_or_expr3251); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_bool_and_expr_in_bool_or_expr3255);
            	    bool_and_expr268=bool_and_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_and_expr268.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:524:1: p_bool_or_expr : p_bool_and_expr ( ( NL )? token_OR ( NL )? p_bool_and_expr )* ;
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:525:2: ( p_bool_and_expr ( ( NL )? token_OR ( NL )? p_bool_and_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:525:4: p_bool_and_expr ( ( NL )? token_OR ( NL )? p_bool_and_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_bool_and_expr_in_p_bool_or_expr3267);
            p_bool_and_expr269=p_bool_and_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_bool_and_expr269.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:525:20: ( ( NL )? token_OR ( NL )? p_bool_and_expr )*
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
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:525:21: ( NL )? token_OR ( NL )? p_bool_and_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:525:23: ( NL )?
            	    int alt114=2;
            	    int LA114_0 = input.LA(1);

            	    if ( (LA114_0==NL) ) {
            	        alt114=1;
            	    }
            	    switch (alt114) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:525:23: NL
            	            {
            	            NL270=(Token)match(input,NL,FOLLOW_NL_in_p_bool_or_expr3270); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_token_OR_in_p_bool_or_expr3274);
            	    token_OR271=token_OR();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(token_OR271.getTree(), root_0);
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:525:38: ( NL )?
            	    int alt115=2;
            	    int LA115_0 = input.LA(1);

            	    if ( (LA115_0==NL) ) {
            	        alt115=1;
            	    }
            	    switch (alt115) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:525:38: NL
            	            {
            	            NL272=(Token)match(input,NL,FOLLOW_NL_in_p_bool_or_expr3277); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_bool_and_expr_in_p_bool_or_expr3281);
            	    p_bool_and_expr273=p_bool_and_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_bool_and_expr273.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:527:1: bool_and_expr : bool_not_expr ( ( NL )? token_AND ( NL )? bool_not_expr )* ;
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:528:2: ( bool_not_expr ( ( NL )? token_AND ( NL )? bool_not_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:528:4: bool_not_expr ( ( NL )? token_AND ( NL )? bool_not_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bool_not_expr_in_bool_and_expr3293);
            bool_not_expr274=bool_not_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_not_expr274.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:528:18: ( ( NL )? token_AND ( NL )? bool_not_expr )*
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
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:528:19: ( NL )? token_AND ( NL )? bool_not_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:528:21: ( NL )?
            	    int alt117=2;
            	    int LA117_0 = input.LA(1);

            	    if ( (LA117_0==NL) ) {
            	        alt117=1;
            	    }
            	    switch (alt117) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:528:21: NL
            	            {
            	            NL275=(Token)match(input,NL,FOLLOW_NL_in_bool_and_expr3296); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_token_AND_in_bool_and_expr3300);
            	    token_AND276=token_AND();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(token_AND276.getTree(), root_0);
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:528:37: ( NL )?
            	    int alt118=2;
            	    int LA118_0 = input.LA(1);

            	    if ( (LA118_0==NL) ) {
            	        alt118=1;
            	    }
            	    switch (alt118) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:528:37: NL
            	            {
            	            NL277=(Token)match(input,NL,FOLLOW_NL_in_bool_and_expr3303); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_bool_not_expr_in_bool_and_expr3307);
            	    bool_not_expr278=bool_not_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_not_expr278.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:530:1: p_bool_and_expr : p_bool_not_expr ( ( NL )? token_AND ( NL )? p_bool_not_expr )* ;
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:531:2: ( p_bool_not_expr ( ( NL )? token_AND ( NL )? p_bool_not_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:531:4: p_bool_not_expr ( ( NL )? token_AND ( NL )? p_bool_not_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_bool_not_expr_in_p_bool_and_expr3319);
            p_bool_not_expr279=p_bool_not_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_bool_not_expr279.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:531:20: ( ( NL )? token_AND ( NL )? p_bool_not_expr )*
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
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:531:21: ( NL )? token_AND ( NL )? p_bool_not_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:531:23: ( NL )?
            	    int alt120=2;
            	    int LA120_0 = input.LA(1);

            	    if ( (LA120_0==NL) ) {
            	        alt120=1;
            	    }
            	    switch (alt120) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:531:23: NL
            	            {
            	            NL280=(Token)match(input,NL,FOLLOW_NL_in_p_bool_and_expr3322); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_token_AND_in_p_bool_and_expr3326);
            	    token_AND281=token_AND();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(token_AND281.getTree(), root_0);
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:531:39: ( NL )?
            	    int alt121=2;
            	    int LA121_0 = input.LA(1);

            	    if ( (LA121_0==NL) ) {
            	        alt121=1;
            	    }
            	    switch (alt121) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:531:39: NL
            	            {
            	            NL282=(Token)match(input,NL,FOLLOW_NL_in_p_bool_and_expr3329); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_bool_not_expr_in_p_bool_and_expr3333);
            	    p_bool_not_expr283=p_bool_not_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_bool_not_expr283.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:534:1: bool_not_expr : ( token_NOT ( NL )? bool_not_expr | rel_expr );
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:535:2: ( token_NOT ( NL )? bool_not_expr | rel_expr )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:535:4: token_NOT ( NL )? bool_not_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_NOT_in_bool_not_expr3345);
                    token_NOT284=token_NOT();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(token_NOT284.getTree(), root_0);
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:535:17: ( NL )?
                    int alt123=2;
                    int LA123_0 = input.LA(1);

                    if ( (LA123_0==NL) ) {
                        alt123=1;
                    }
                    switch (alt123) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:535:17: NL
                            {
                            NL285=(Token)match(input,NL,FOLLOW_NL_in_bool_not_expr3348); if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_bool_not_expr_in_bool_not_expr3352);
                    bool_not_expr286=bool_not_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_not_expr286.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:536:4: rel_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_rel_expr_in_bool_not_expr3357);
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:538:1: p_bool_not_expr : ( token_NOT ( NL )? p_bool_not_expr | p_rel_expr );
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:539:2: ( token_NOT ( NL )? p_bool_not_expr | p_rel_expr )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:539:4: token_NOT ( NL )? p_bool_not_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_NOT_in_p_bool_not_expr3368);
                    token_NOT288=token_NOT();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(token_NOT288.getTree(), root_0);
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:539:17: ( NL )?
                    int alt125=2;
                    int LA125_0 = input.LA(1);

                    if ( (LA125_0==NL) ) {
                        alt125=1;
                    }
                    switch (alt125) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:539:17: NL
                            {
                            NL289=(Token)match(input,NL,FOLLOW_NL_in_p_bool_not_expr3371); if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_p_bool_not_expr_in_p_bool_not_expr3375);
                    p_bool_not_expr290=p_bool_not_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_bool_not_expr290.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:540:4: p_rel_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_p_rel_expr_in_p_bool_not_expr3380);
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:542:1: rel_expr : arith_expr ( ( NL )? rel_op ( NL )? arith_expr )* -> ^( COMPARE arith_expr ( rel_op arith_expr )* ) ;
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:543:2: ( arith_expr ( ( NL )? rel_op ( NL )? arith_expr )* -> ^( COMPARE arith_expr ( rel_op arith_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:543:4: arith_expr ( ( NL )? rel_op ( NL )? arith_expr )*
            {
            pushFollow(FOLLOW_arith_expr_in_rel_expr3389);
            arith_expr292=arith_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_arith_expr.add(arith_expr292.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:543:15: ( ( NL )? rel_op ( NL )? arith_expr )*
            loop129:
            do {
                int alt129=2;
                int LA129_0 = input.LA(1);

                if ( (LA129_0==NL) ) {
                    int LA129_1 = input.LA(2);

                    if ( ((LA129_1>=A_EQUAL && LA129_1<=U_GREATER_EQ)) ) {
                        alt129=1;
                    }


                }
                else if ( ((LA129_0>=A_EQUAL && LA129_0<=U_GREATER_EQ)) ) {
                    alt129=1;
                }


                switch (alt129) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:543:16: ( NL )? rel_op ( NL )? arith_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:543:16: ( NL )?
            	    int alt127=2;
            	    int LA127_0 = input.LA(1);

            	    if ( (LA127_0==NL) ) {
            	        alt127=1;
            	    }
            	    switch (alt127) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:543:16: NL
            	            {
            	            NL293=(Token)match(input,NL,FOLLOW_NL_in_rel_expr3392); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL293);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_rel_op_in_rel_expr3395);
            	    rel_op294=rel_op();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_rel_op.add(rel_op294.getTree());
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:543:27: ( NL )?
            	    int alt128=2;
            	    int LA128_0 = input.LA(1);

            	    if ( (LA128_0==NL) ) {
            	        alt128=1;
            	    }
            	    switch (alt128) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:543:27: NL
            	            {
            	            NL295=(Token)match(input,NL,FOLLOW_NL_in_rel_expr3397); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL295);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_arith_expr_in_rel_expr3400);
            	    arith_expr296=arith_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_arith_expr.add(arith_expr296.getTree());

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
            // 543:44: -> ^( COMPARE arith_expr ( rel_op arith_expr )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:543:47: ^( COMPARE arith_expr ( rel_op arith_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COMPARE, "COMPARE"), root_1);

                adaptor.addChild(root_1, stream_arith_expr.nextTree());
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:543:68: ( rel_op arith_expr )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:545:1: p_rel_expr : p_arith_expr ( ( NL )? rel_op ( NL )? p_arith_expr )* -> ^( COMPARE p_arith_expr ( rel_op p_arith_expr )* ) ;
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:546:2: ( p_arith_expr ( ( NL )? rel_op ( NL )? p_arith_expr )* -> ^( COMPARE p_arith_expr ( rel_op p_arith_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:546:4: p_arith_expr ( ( NL )? rel_op ( NL )? p_arith_expr )*
            {
            pushFollow(FOLLOW_p_arith_expr_in_p_rel_expr3427);
            p_arith_expr297=p_arith_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_p_arith_expr.add(p_arith_expr297.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:546:17: ( ( NL )? rel_op ( NL )? p_arith_expr )*
            loop132:
            do {
                int alt132=2;
                int LA132_0 = input.LA(1);

                if ( (LA132_0==NL) ) {
                    int LA132_1 = input.LA(2);

                    if ( ((LA132_1>=A_EQUAL && LA132_1<=U_GREATER_EQ)) ) {
                        alt132=1;
                    }


                }
                else if ( ((LA132_0>=A_EQUAL && LA132_0<=U_GREATER_EQ)) ) {
                    alt132=1;
                }


                switch (alt132) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:546:18: ( NL )? rel_op ( NL )? p_arith_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:546:18: ( NL )?
            	    int alt130=2;
            	    int LA130_0 = input.LA(1);

            	    if ( (LA130_0==NL) ) {
            	        alt130=1;
            	    }
            	    switch (alt130) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:546:18: NL
            	            {
            	            NL298=(Token)match(input,NL,FOLLOW_NL_in_p_rel_expr3430); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL298);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_rel_op_in_p_rel_expr3433);
            	    rel_op299=rel_op();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_rel_op.add(rel_op299.getTree());
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:546:29: ( NL )?
            	    int alt131=2;
            	    int LA131_0 = input.LA(1);

            	    if ( (LA131_0==NL) ) {
            	        alt131=1;
            	    }
            	    switch (alt131) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:546:29: NL
            	            {
            	            NL300=(Token)match(input,NL,FOLLOW_NL_in_p_rel_expr3435); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL300);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_arith_expr_in_p_rel_expr3438);
            	    p_arith_expr301=p_arith_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_p_arith_expr.add(p_arith_expr301.getTree());

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
            // 546:48: -> ^( COMPARE p_arith_expr ( rel_op p_arith_expr )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:546:51: ^( COMPARE p_arith_expr ( rel_op p_arith_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COMPARE, "COMPARE"), root_1);

                adaptor.addChild(root_1, stream_p_arith_expr.nextTree());
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:546:74: ( rel_op p_arith_expr )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:549:1: rel_op : ( token_EQUAL | token_NOT_EQUAL | GREATER | token_GREATER_EQ | LESS | token_LESS_EQ );
    public final babel17Parser.rel_op_return rel_op() throws RecognitionException {
        babel17Parser.rel_op_return retval = new babel17Parser.rel_op_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token GREATER304=null;
        Token LESS306=null;
        babel17Parser.token_EQUAL_return token_EQUAL302 = null;

        babel17Parser.token_NOT_EQUAL_return token_NOT_EQUAL303 = null;

        babel17Parser.token_GREATER_EQ_return token_GREATER_EQ305 = null;

        babel17Parser.token_LESS_EQ_return token_LESS_EQ307 = null;


        CommonTree GREATER304_tree=null;
        CommonTree LESS306_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:549:8: ( token_EQUAL | token_NOT_EQUAL | GREATER | token_GREATER_EQ | LESS | token_LESS_EQ )
            int alt133=6;
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
            case GREATER:
                {
                alt133=3;
                }
                break;
            case A_GREATER_EQ:
            case U_GREATER_EQ:
                {
                alt133=4;
                }
                break;
            case LESS:
                {
                alt133=5;
                }
                break;
            case A_LESS_EQ:
            case U_LESS_EQ:
                {
                alt133=6;
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:549:10: token_EQUAL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_EQUAL_in_rel_op3464);
                    token_EQUAL302=token_EQUAL();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, token_EQUAL302.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:549:24: token_NOT_EQUAL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_NOT_EQUAL_in_rel_op3468);
                    token_NOT_EQUAL303=token_NOT_EQUAL();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, token_NOT_EQUAL303.getTree());

                    }
                    break;
                case 3 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:549:42: GREATER
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    GREATER304=(Token)match(input,GREATER,FOLLOW_GREATER_in_rel_op3472); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    GREATER304_tree = (CommonTree)adaptor.create(GREATER304);
                    adaptor.addChild(root_0, GREATER304_tree);
                    }

                    }
                    break;
                case 4 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:549:52: token_GREATER_EQ
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_GREATER_EQ_in_rel_op3476);
                    token_GREATER_EQ305=token_GREATER_EQ();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, token_GREATER_EQ305.getTree());

                    }
                    break;
                case 5 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:549:71: LESS
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    LESS306=(Token)match(input,LESS,FOLLOW_LESS_in_rel_op3480); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LESS306_tree = (CommonTree)adaptor.create(LESS306);
                    adaptor.addChild(root_0, LESS306_tree);
                    }

                    }
                    break;
                case 6 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:549:78: token_LESS_EQ
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_LESS_EQ_in_rel_op3484);
                    token_LESS_EQ307=token_LESS_EQ();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, token_LESS_EQ307.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:552:1: arith_expr : plusplus_expr ;
    public final babel17Parser.arith_expr_return arith_expr() throws RecognitionException {
        babel17Parser.arith_expr_return retval = new babel17Parser.arith_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.plusplus_expr_return plusplus_expr308 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:553:2: ( plusplus_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:553:4: plusplus_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_plusplus_expr_in_arith_expr3496);
            plusplus_expr308=plusplus_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, plusplus_expr308.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:556:1: p_arith_expr : p_plusplus_expr ;
    public final babel17Parser.p_arith_expr_return p_arith_expr() throws RecognitionException {
        babel17Parser.p_arith_expr_return retval = new babel17Parser.p_arith_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.p_plusplus_expr_return p_plusplus_expr309 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:557:2: ( p_plusplus_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:557:4: p_plusplus_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_plusplus_expr_in_p_arith_expr3506);
            p_plusplus_expr309=p_plusplus_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_plusplus_expr309.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:559:1: plusplus_expr : timestimes_expr ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? timestimes_expr )* ;
    public final babel17Parser.plusplus_expr_return plusplus_expr() throws RecognitionException {
        babel17Parser.plusplus_expr_return retval = new babel17Parser.plusplus_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL311=null;
        Token PLUSPLUS312=null;
        Token MINUSMINUS313=null;
        Token NL314=null;
        babel17Parser.timestimes_expr_return timestimes_expr310 = null;

        babel17Parser.timestimes_expr_return timestimes_expr315 = null;


        CommonTree NL311_tree=null;
        CommonTree PLUSPLUS312_tree=null;
        CommonTree MINUSMINUS313_tree=null;
        CommonTree NL314_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:560:2: ( timestimes_expr ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? timestimes_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:560:4: timestimes_expr ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? timestimes_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_timestimes_expr_in_plusplus_expr3516);
            timestimes_expr310=timestimes_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, timestimes_expr310.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:560:20: ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? timestimes_expr )*
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
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:560:21: ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? timestimes_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:560:23: ( NL )?
            	    int alt134=2;
            	    int LA134_0 = input.LA(1);

            	    if ( (LA134_0==NL) ) {
            	        alt134=1;
            	    }
            	    switch (alt134) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:560:23: NL
            	            {
            	            NL311=(Token)match(input,NL,FOLLOW_NL_in_plusplus_expr3519); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:560:26: ( PLUSPLUS | MINUSMINUS )
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
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:560:27: PLUSPLUS
            	            {
            	            PLUSPLUS312=(Token)match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_plusplus_expr3524); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PLUSPLUS312_tree = (CommonTree)adaptor.create(PLUSPLUS312);
            	            root_0 = (CommonTree)adaptor.becomeRoot(PLUSPLUS312_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:560:37: MINUSMINUS
            	            {
            	            MINUSMINUS313=(Token)match(input,MINUSMINUS,FOLLOW_MINUSMINUS_in_plusplus_expr3527); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            MINUSMINUS313_tree = (CommonTree)adaptor.create(MINUSMINUS313);
            	            root_0 = (CommonTree)adaptor.becomeRoot(MINUSMINUS313_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:560:52: ( NL )?
            	    int alt136=2;
            	    int LA136_0 = input.LA(1);

            	    if ( (LA136_0==NL) ) {
            	        alt136=1;
            	    }
            	    switch (alt136) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:560:52: NL
            	            {
            	            NL314=(Token)match(input,NL,FOLLOW_NL_in_plusplus_expr3531); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_timestimes_expr_in_plusplus_expr3535);
            	    timestimes_expr315=timestimes_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, timestimes_expr315.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:562:1: p_plusplus_expr : p_timestimes_expr ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? p_timestimes_expr )* ;
    public final babel17Parser.p_plusplus_expr_return p_plusplus_expr() throws RecognitionException {
        babel17Parser.p_plusplus_expr_return retval = new babel17Parser.p_plusplus_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL317=null;
        Token PLUSPLUS318=null;
        Token MINUSMINUS319=null;
        Token NL320=null;
        babel17Parser.p_timestimes_expr_return p_timestimes_expr316 = null;

        babel17Parser.p_timestimes_expr_return p_timestimes_expr321 = null;


        CommonTree NL317_tree=null;
        CommonTree PLUSPLUS318_tree=null;
        CommonTree MINUSMINUS319_tree=null;
        CommonTree NL320_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:563:2: ( p_timestimes_expr ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? p_timestimes_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:563:4: p_timestimes_expr ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? p_timestimes_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_timestimes_expr_in_p_plusplus_expr3547);
            p_timestimes_expr316=p_timestimes_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_timestimes_expr316.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:563:22: ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? p_timestimes_expr )*
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
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:563:23: ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? p_timestimes_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:563:25: ( NL )?
            	    int alt138=2;
            	    int LA138_0 = input.LA(1);

            	    if ( (LA138_0==NL) ) {
            	        alt138=1;
            	    }
            	    switch (alt138) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:563:25: NL
            	            {
            	            NL317=(Token)match(input,NL,FOLLOW_NL_in_p_plusplus_expr3550); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:563:28: ( PLUSPLUS | MINUSMINUS )
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
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:563:29: PLUSPLUS
            	            {
            	            PLUSPLUS318=(Token)match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_p_plusplus_expr3555); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PLUSPLUS318_tree = (CommonTree)adaptor.create(PLUSPLUS318);
            	            root_0 = (CommonTree)adaptor.becomeRoot(PLUSPLUS318_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:563:39: MINUSMINUS
            	            {
            	            MINUSMINUS319=(Token)match(input,MINUSMINUS,FOLLOW_MINUSMINUS_in_p_plusplus_expr3558); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            MINUSMINUS319_tree = (CommonTree)adaptor.create(MINUSMINUS319);
            	            root_0 = (CommonTree)adaptor.becomeRoot(MINUSMINUS319_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:563:54: ( NL )?
            	    int alt140=2;
            	    int LA140_0 = input.LA(1);

            	    if ( (LA140_0==NL) ) {
            	        alt140=1;
            	    }
            	    switch (alt140) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:563:54: NL
            	            {
            	            NL320=(Token)match(input,NL,FOLLOW_NL_in_p_plusplus_expr3562); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_timestimes_expr_in_p_plusplus_expr3566);
            	    p_timestimes_expr321=p_timestimes_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_timestimes_expr321.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:566:1: timestimes_expr : simple_expr ( ( NL )? ( TIMESTIMES | QUOTIENTQUOTIENT ) ( NL )? simple_expr )* ;
    public final babel17Parser.timestimes_expr_return timestimes_expr() throws RecognitionException {
        babel17Parser.timestimes_expr_return retval = new babel17Parser.timestimes_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL323=null;
        Token TIMESTIMES324=null;
        Token QUOTIENTQUOTIENT325=null;
        Token NL326=null;
        babel17Parser.simple_expr_return simple_expr322 = null;

        babel17Parser.simple_expr_return simple_expr327 = null;


        CommonTree NL323_tree=null;
        CommonTree TIMESTIMES324_tree=null;
        CommonTree QUOTIENTQUOTIENT325_tree=null;
        CommonTree NL326_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:567:2: ( simple_expr ( ( NL )? ( TIMESTIMES | QUOTIENTQUOTIENT ) ( NL )? simple_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:567:4: simple_expr ( ( NL )? ( TIMESTIMES | QUOTIENTQUOTIENT ) ( NL )? simple_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_simple_expr_in_timestimes_expr3578);
            simple_expr322=simple_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, simple_expr322.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:567:16: ( ( NL )? ( TIMESTIMES | QUOTIENTQUOTIENT ) ( NL )? simple_expr )*
            loop145:
            do {
                int alt145=2;
                int LA145_0 = input.LA(1);

                if ( (LA145_0==NL) ) {
                    int LA145_1 = input.LA(2);

                    if ( ((LA145_1>=TIMESTIMES && LA145_1<=QUOTIENTQUOTIENT)) ) {
                        alt145=1;
                    }


                }
                else if ( ((LA145_0>=TIMESTIMES && LA145_0<=QUOTIENTQUOTIENT)) ) {
                    alt145=1;
                }


                switch (alt145) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:567:17: ( NL )? ( TIMESTIMES | QUOTIENTQUOTIENT ) ( NL )? simple_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:567:19: ( NL )?
            	    int alt142=2;
            	    int LA142_0 = input.LA(1);

            	    if ( (LA142_0==NL) ) {
            	        alt142=1;
            	    }
            	    switch (alt142) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:567:19: NL
            	            {
            	            NL323=(Token)match(input,NL,FOLLOW_NL_in_timestimes_expr3581); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:567:22: ( TIMESTIMES | QUOTIENTQUOTIENT )
            	    int alt143=2;
            	    int LA143_0 = input.LA(1);

            	    if ( (LA143_0==TIMESTIMES) ) {
            	        alt143=1;
            	    }
            	    else if ( (LA143_0==QUOTIENTQUOTIENT) ) {
            	        alt143=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 143, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt143) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:567:23: TIMESTIMES
            	            {
            	            TIMESTIMES324=(Token)match(input,TIMESTIMES,FOLLOW_TIMESTIMES_in_timestimes_expr3586); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            TIMESTIMES324_tree = (CommonTree)adaptor.create(TIMESTIMES324);
            	            root_0 = (CommonTree)adaptor.becomeRoot(TIMESTIMES324_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:567:35: QUOTIENTQUOTIENT
            	            {
            	            QUOTIENTQUOTIENT325=(Token)match(input,QUOTIENTQUOTIENT,FOLLOW_QUOTIENTQUOTIENT_in_timestimes_expr3589); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            QUOTIENTQUOTIENT325_tree = (CommonTree)adaptor.create(QUOTIENTQUOTIENT325);
            	            root_0 = (CommonTree)adaptor.becomeRoot(QUOTIENTQUOTIENT325_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:567:56: ( NL )?
            	    int alt144=2;
            	    int LA144_0 = input.LA(1);

            	    if ( (LA144_0==NL) ) {
            	        alt144=1;
            	    }
            	    switch (alt144) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:567:56: NL
            	            {
            	            NL326=(Token)match(input,NL,FOLLOW_NL_in_timestimes_expr3593); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_simple_expr_in_timestimes_expr3597);
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:569:1: p_timestimes_expr : p_simple_expr ( ( NL )? ( TIMESTIMES | QUOTIENTQUOTIENT ) ( NL )? p_simple_expr )* ;
    public final babel17Parser.p_timestimes_expr_return p_timestimes_expr() throws RecognitionException {
        babel17Parser.p_timestimes_expr_return retval = new babel17Parser.p_timestimes_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL329=null;
        Token TIMESTIMES330=null;
        Token QUOTIENTQUOTIENT331=null;
        Token NL332=null;
        babel17Parser.p_simple_expr_return p_simple_expr328 = null;

        babel17Parser.p_simple_expr_return p_simple_expr333 = null;


        CommonTree NL329_tree=null;
        CommonTree TIMESTIMES330_tree=null;
        CommonTree QUOTIENTQUOTIENT331_tree=null;
        CommonTree NL332_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:570:2: ( p_simple_expr ( ( NL )? ( TIMESTIMES | QUOTIENTQUOTIENT ) ( NL )? p_simple_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:570:4: p_simple_expr ( ( NL )? ( TIMESTIMES | QUOTIENTQUOTIENT ) ( NL )? p_simple_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_simple_expr_in_p_timestimes_expr3610);
            p_simple_expr328=p_simple_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_simple_expr328.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:570:18: ( ( NL )? ( TIMESTIMES | QUOTIENTQUOTIENT ) ( NL )? p_simple_expr )*
            loop149:
            do {
                int alt149=2;
                int LA149_0 = input.LA(1);

                if ( (LA149_0==NL) ) {
                    int LA149_1 = input.LA(2);

                    if ( ((LA149_1>=TIMESTIMES && LA149_1<=QUOTIENTQUOTIENT)) ) {
                        alt149=1;
                    }


                }
                else if ( ((LA149_0>=TIMESTIMES && LA149_0<=QUOTIENTQUOTIENT)) ) {
                    alt149=1;
                }


                switch (alt149) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:570:19: ( NL )? ( TIMESTIMES | QUOTIENTQUOTIENT ) ( NL )? p_simple_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:570:21: ( NL )?
            	    int alt146=2;
            	    int LA146_0 = input.LA(1);

            	    if ( (LA146_0==NL) ) {
            	        alt146=1;
            	    }
            	    switch (alt146) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:570:21: NL
            	            {
            	            NL329=(Token)match(input,NL,FOLLOW_NL_in_p_timestimes_expr3613); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:570:24: ( TIMESTIMES | QUOTIENTQUOTIENT )
            	    int alt147=2;
            	    int LA147_0 = input.LA(1);

            	    if ( (LA147_0==TIMESTIMES) ) {
            	        alt147=1;
            	    }
            	    else if ( (LA147_0==QUOTIENTQUOTIENT) ) {
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
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:570:25: TIMESTIMES
            	            {
            	            TIMESTIMES330=(Token)match(input,TIMESTIMES,FOLLOW_TIMESTIMES_in_p_timestimes_expr3618); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            TIMESTIMES330_tree = (CommonTree)adaptor.create(TIMESTIMES330);
            	            root_0 = (CommonTree)adaptor.becomeRoot(TIMESTIMES330_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:570:37: QUOTIENTQUOTIENT
            	            {
            	            QUOTIENTQUOTIENT331=(Token)match(input,QUOTIENTQUOTIENT,FOLLOW_QUOTIENTQUOTIENT_in_p_timestimes_expr3621); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            QUOTIENTQUOTIENT331_tree = (CommonTree)adaptor.create(QUOTIENTQUOTIENT331);
            	            root_0 = (CommonTree)adaptor.becomeRoot(QUOTIENTQUOTIENT331_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:570:58: ( NL )?
            	    int alt148=2;
            	    int LA148_0 = input.LA(1);

            	    if ( (LA148_0==NL) ) {
            	        alt148=1;
            	    }
            	    switch (alt148) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:570:58: NL
            	            {
            	            NL332=(Token)match(input,NL,FOLLOW_NL_in_p_timestimes_expr3625); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_simple_expr_in_p_timestimes_expr3629);
            	    p_simple_expr333=p_simple_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_simple_expr333.getTree());

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
    // $ANTLR end "p_timestimes_expr"

    public static class simple_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "simple_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:572:1: simple_expr : cons_expr ;
    public final babel17Parser.simple_expr_return simple_expr() throws RecognitionException {
        babel17Parser.simple_expr_return retval = new babel17Parser.simple_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.cons_expr_return cons_expr334 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:573:2: ( cons_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:573:4: cons_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_cons_expr_in_simple_expr3640);
            cons_expr334=cons_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, cons_expr334.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:575:1: p_simple_expr : p_cons_expr ;
    public final babel17Parser.p_simple_expr_return p_simple_expr() throws RecognitionException {
        babel17Parser.p_simple_expr_return retval = new babel17Parser.p_simple_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.p_cons_expr_return p_cons_expr335 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:576:2: ( p_cons_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:576:4: p_cons_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_cons_expr_in_p_simple_expr3649);
            p_cons_expr335=p_cons_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_cons_expr335.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:578:1: cons_expr : to_expr ( ( NL )? token_DOUBLE_COLON ( NL )? to_expr )* -> ^( LIST_CONS ( to_expr )* ) ;
    public final babel17Parser.cons_expr_return cons_expr() throws RecognitionException {
        babel17Parser.cons_expr_return retval = new babel17Parser.cons_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL337=null;
        Token NL339=null;
        babel17Parser.to_expr_return to_expr336 = null;

        babel17Parser.token_DOUBLE_COLON_return token_DOUBLE_COLON338 = null;

        babel17Parser.to_expr_return to_expr340 = null;


        CommonTree NL337_tree=null;
        CommonTree NL339_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_token_DOUBLE_COLON=new RewriteRuleSubtreeStream(adaptor,"rule token_DOUBLE_COLON");
        RewriteRuleSubtreeStream stream_to_expr=new RewriteRuleSubtreeStream(adaptor,"rule to_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:579:2: ( to_expr ( ( NL )? token_DOUBLE_COLON ( NL )? to_expr )* -> ^( LIST_CONS ( to_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:579:4: to_expr ( ( NL )? token_DOUBLE_COLON ( NL )? to_expr )*
            {
            pushFollow(FOLLOW_to_expr_in_cons_expr3658);
            to_expr336=to_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_to_expr.add(to_expr336.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:579:12: ( ( NL )? token_DOUBLE_COLON ( NL )? to_expr )*
            loop152:
            do {
                int alt152=2;
                int LA152_0 = input.LA(1);

                if ( (LA152_0==NL) ) {
                    int LA152_1 = input.LA(2);

                    if ( ((LA152_1>=A_DOUBLE_COLON && LA152_1<=U_DOUBLE_COLON)) ) {
                        alt152=1;
                    }


                }
                else if ( ((LA152_0>=A_DOUBLE_COLON && LA152_0<=U_DOUBLE_COLON)) ) {
                    alt152=1;
                }


                switch (alt152) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:579:13: ( NL )? token_DOUBLE_COLON ( NL )? to_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:579:13: ( NL )?
            	    int alt150=2;
            	    int LA150_0 = input.LA(1);

            	    if ( (LA150_0==NL) ) {
            	        alt150=1;
            	    }
            	    switch (alt150) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:579:13: NL
            	            {
            	            NL337=(Token)match(input,NL,FOLLOW_NL_in_cons_expr3661); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL337);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_token_DOUBLE_COLON_in_cons_expr3664);
            	    token_DOUBLE_COLON338=token_DOUBLE_COLON();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_token_DOUBLE_COLON.add(token_DOUBLE_COLON338.getTree());
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:579:36: ( NL )?
            	    int alt151=2;
            	    int LA151_0 = input.LA(1);

            	    if ( (LA151_0==NL) ) {
            	        alt151=1;
            	    }
            	    switch (alt151) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:579:36: NL
            	            {
            	            NL339=(Token)match(input,NL,FOLLOW_NL_in_cons_expr3666); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL339);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_to_expr_in_cons_expr3669);
            	    to_expr340=to_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_to_expr.add(to_expr340.getTree());

            	    }
            	    break;

            	default :
            	    break loop152;
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
            // 579:50: -> ^( LIST_CONS ( to_expr )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:579:53: ^( LIST_CONS ( to_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LIST_CONS, "LIST_CONS"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:579:65: ( to_expr )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:581:1: p_cons_expr : p_to_expr ( ( NL )? token_DOUBLE_COLON ( NL )? p_to_expr )* -> ^( LIST_CONS ( p_to_expr )* ) ;
    public final babel17Parser.p_cons_expr_return p_cons_expr() throws RecognitionException {
        babel17Parser.p_cons_expr_return retval = new babel17Parser.p_cons_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL342=null;
        Token NL344=null;
        babel17Parser.p_to_expr_return p_to_expr341 = null;

        babel17Parser.token_DOUBLE_COLON_return token_DOUBLE_COLON343 = null;

        babel17Parser.p_to_expr_return p_to_expr345 = null;


        CommonTree NL342_tree=null;
        CommonTree NL344_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_p_to_expr=new RewriteRuleSubtreeStream(adaptor,"rule p_to_expr");
        RewriteRuleSubtreeStream stream_token_DOUBLE_COLON=new RewriteRuleSubtreeStream(adaptor,"rule token_DOUBLE_COLON");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:582:2: ( p_to_expr ( ( NL )? token_DOUBLE_COLON ( NL )? p_to_expr )* -> ^( LIST_CONS ( p_to_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:582:4: p_to_expr ( ( NL )? token_DOUBLE_COLON ( NL )? p_to_expr )*
            {
            pushFollow(FOLLOW_p_to_expr_in_p_cons_expr3689);
            p_to_expr341=p_to_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_p_to_expr.add(p_to_expr341.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:582:14: ( ( NL )? token_DOUBLE_COLON ( NL )? p_to_expr )*
            loop155:
            do {
                int alt155=2;
                int LA155_0 = input.LA(1);

                if ( (LA155_0==NL) ) {
                    int LA155_1 = input.LA(2);

                    if ( ((LA155_1>=A_DOUBLE_COLON && LA155_1<=U_DOUBLE_COLON)) ) {
                        alt155=1;
                    }


                }
                else if ( ((LA155_0>=A_DOUBLE_COLON && LA155_0<=U_DOUBLE_COLON)) ) {
                    alt155=1;
                }


                switch (alt155) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:582:15: ( NL )? token_DOUBLE_COLON ( NL )? p_to_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:582:15: ( NL )?
            	    int alt153=2;
            	    int LA153_0 = input.LA(1);

            	    if ( (LA153_0==NL) ) {
            	        alt153=1;
            	    }
            	    switch (alt153) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:582:15: NL
            	            {
            	            NL342=(Token)match(input,NL,FOLLOW_NL_in_p_cons_expr3692); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL342);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_token_DOUBLE_COLON_in_p_cons_expr3695);
            	    token_DOUBLE_COLON343=token_DOUBLE_COLON();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_token_DOUBLE_COLON.add(token_DOUBLE_COLON343.getTree());
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:582:38: ( NL )?
            	    int alt154=2;
            	    int LA154_0 = input.LA(1);

            	    if ( (LA154_0==NL) ) {
            	        alt154=1;
            	    }
            	    switch (alt154) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:582:38: NL
            	            {
            	            NL344=(Token)match(input,NL,FOLLOW_NL_in_p_cons_expr3697); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL344);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_to_expr_in_p_cons_expr3700);
            	    p_to_expr345=p_to_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_p_to_expr.add(p_to_expr345.getTree());

            	    }
            	    break;

            	default :
            	    break loop155;
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
            // 582:54: -> ^( LIST_CONS ( p_to_expr )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:582:57: ^( LIST_CONS ( p_to_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LIST_CONS, "LIST_CONS"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:582:69: ( p_to_expr )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:585:1: to_expr : arith_plus_expr ( ( NL )? ( L_to | L_downto ) ( NL )? arith_plus_expr )? ;
    public final babel17Parser.to_expr_return to_expr() throws RecognitionException {
        babel17Parser.to_expr_return retval = new babel17Parser.to_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL347=null;
        Token L_to348=null;
        Token L_downto349=null;
        Token NL350=null;
        babel17Parser.arith_plus_expr_return arith_plus_expr346 = null;

        babel17Parser.arith_plus_expr_return arith_plus_expr351 = null;


        CommonTree NL347_tree=null;
        CommonTree L_to348_tree=null;
        CommonTree L_downto349_tree=null;
        CommonTree NL350_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:585:9: ( arith_plus_expr ( ( NL )? ( L_to | L_downto ) ( NL )? arith_plus_expr )? )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:585:11: arith_plus_expr ( ( NL )? ( L_to | L_downto ) ( NL )? arith_plus_expr )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_arith_plus_expr_in_to_expr3720);
            arith_plus_expr346=arith_plus_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, arith_plus_expr346.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:585:27: ( ( NL )? ( L_to | L_downto ) ( NL )? arith_plus_expr )?
            int alt159=2;
            int LA159_0 = input.LA(1);

            if ( (LA159_0==NL) ) {
                int LA159_1 = input.LA(2);

                if ( ((LA159_1>=L_to && LA159_1<=L_downto)) ) {
                    alt159=1;
                }
            }
            else if ( ((LA159_0>=L_to && LA159_0<=L_downto)) ) {
                alt159=1;
            }
            switch (alt159) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:585:28: ( NL )? ( L_to | L_downto ) ( NL )? arith_plus_expr
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:585:30: ( NL )?
                    int alt156=2;
                    int LA156_0 = input.LA(1);

                    if ( (LA156_0==NL) ) {
                        alt156=1;
                    }
                    switch (alt156) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:585:30: NL
                            {
                            NL347=(Token)match(input,NL,FOLLOW_NL_in_to_expr3723); if (state.failed) return retval;

                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:585:33: ( L_to | L_downto )
                    int alt157=2;
                    int LA157_0 = input.LA(1);

                    if ( (LA157_0==L_to) ) {
                        alt157=1;
                    }
                    else if ( (LA157_0==L_downto) ) {
                        alt157=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 157, 0, input);

                        throw nvae;
                    }
                    switch (alt157) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:585:34: L_to
                            {
                            L_to348=(Token)match(input,L_to,FOLLOW_L_to_in_to_expr3728); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            L_to348_tree = (CommonTree)adaptor.create(L_to348);
                            root_0 = (CommonTree)adaptor.becomeRoot(L_to348_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:585:41: L_downto
                            {
                            L_downto349=(Token)match(input,L_downto,FOLLOW_L_downto_in_to_expr3732); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            L_downto349_tree = (CommonTree)adaptor.create(L_downto349);
                            root_0 = (CommonTree)adaptor.becomeRoot(L_downto349_tree, root_0);
                            }

                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:585:54: ( NL )?
                    int alt158=2;
                    int LA158_0 = input.LA(1);

                    if ( (LA158_0==NL) ) {
                        alt158=1;
                    }
                    switch (alt158) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:585:54: NL
                            {
                            NL350=(Token)match(input,NL,FOLLOW_NL_in_to_expr3736); if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_arith_plus_expr_in_to_expr3740);
                    arith_plus_expr351=arith_plus_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arith_plus_expr351.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:587:1: p_to_expr : p_arith_plus_expr ( ( NL )? ( L_to | L_downto ) ( NL )? p_arith_plus_expr )? ;
    public final babel17Parser.p_to_expr_return p_to_expr() throws RecognitionException {
        babel17Parser.p_to_expr_return retval = new babel17Parser.p_to_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL353=null;
        Token L_to354=null;
        Token L_downto355=null;
        Token NL356=null;
        babel17Parser.p_arith_plus_expr_return p_arith_plus_expr352 = null;

        babel17Parser.p_arith_plus_expr_return p_arith_plus_expr357 = null;


        CommonTree NL353_tree=null;
        CommonTree L_to354_tree=null;
        CommonTree L_downto355_tree=null;
        CommonTree NL356_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:588:2: ( p_arith_plus_expr ( ( NL )? ( L_to | L_downto ) ( NL )? p_arith_plus_expr )? )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:588:4: p_arith_plus_expr ( ( NL )? ( L_to | L_downto ) ( NL )? p_arith_plus_expr )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_arith_plus_expr_in_p_to_expr3753);
            p_arith_plus_expr352=p_arith_plus_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_arith_plus_expr352.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:588:22: ( ( NL )? ( L_to | L_downto ) ( NL )? p_arith_plus_expr )?
            int alt163=2;
            int LA163_0 = input.LA(1);

            if ( (LA163_0==NL) ) {
                int LA163_1 = input.LA(2);

                if ( ((LA163_1>=L_to && LA163_1<=L_downto)) ) {
                    alt163=1;
                }
            }
            else if ( ((LA163_0>=L_to && LA163_0<=L_downto)) ) {
                alt163=1;
            }
            switch (alt163) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:588:23: ( NL )? ( L_to | L_downto ) ( NL )? p_arith_plus_expr
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:588:25: ( NL )?
                    int alt160=2;
                    int LA160_0 = input.LA(1);

                    if ( (LA160_0==NL) ) {
                        alt160=1;
                    }
                    switch (alt160) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:588:25: NL
                            {
                            NL353=(Token)match(input,NL,FOLLOW_NL_in_p_to_expr3756); if (state.failed) return retval;

                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:588:28: ( L_to | L_downto )
                    int alt161=2;
                    int LA161_0 = input.LA(1);

                    if ( (LA161_0==L_to) ) {
                        alt161=1;
                    }
                    else if ( (LA161_0==L_downto) ) {
                        alt161=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 161, 0, input);

                        throw nvae;
                    }
                    switch (alt161) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:588:29: L_to
                            {
                            L_to354=(Token)match(input,L_to,FOLLOW_L_to_in_p_to_expr3761); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            L_to354_tree = (CommonTree)adaptor.create(L_to354);
                            root_0 = (CommonTree)adaptor.becomeRoot(L_to354_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:588:36: L_downto
                            {
                            L_downto355=(Token)match(input,L_downto,FOLLOW_L_downto_in_p_to_expr3765); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            L_downto355_tree = (CommonTree)adaptor.create(L_downto355);
                            root_0 = (CommonTree)adaptor.becomeRoot(L_downto355_tree, root_0);
                            }

                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:588:49: ( NL )?
                    int alt162=2;
                    int LA162_0 = input.LA(1);

                    if ( (LA162_0==NL) ) {
                        alt162=1;
                    }
                    switch (alt162) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:588:49: NL
                            {
                            NL356=(Token)match(input,NL,FOLLOW_NL_in_p_to_expr3769); if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_p_arith_plus_expr_in_p_to_expr3773);
                    p_arith_plus_expr357=p_arith_plus_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_arith_plus_expr357.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:590:1: arith_plus_expr : arith_uminus_expr ( ( ( NL )? PLUS | MINUS ) ( NL )? arith_uminus_expr )* ;
    public final babel17Parser.arith_plus_expr_return arith_plus_expr() throws RecognitionException {
        babel17Parser.arith_plus_expr_return retval = new babel17Parser.arith_plus_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL359=null;
        Token PLUS360=null;
        Token MINUS361=null;
        Token NL362=null;
        babel17Parser.arith_uminus_expr_return arith_uminus_expr358 = null;

        babel17Parser.arith_uminus_expr_return arith_uminus_expr363 = null;


        CommonTree NL359_tree=null;
        CommonTree PLUS360_tree=null;
        CommonTree MINUS361_tree=null;
        CommonTree NL362_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:591:2: ( arith_uminus_expr ( ( ( NL )? PLUS | MINUS ) ( NL )? arith_uminus_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:591:4: arith_uminus_expr ( ( ( NL )? PLUS | MINUS ) ( NL )? arith_uminus_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_arith_uminus_expr_in_arith_plus_expr3785);
            arith_uminus_expr358=arith_uminus_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, arith_uminus_expr358.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:591:22: ( ( ( NL )? PLUS | MINUS ) ( NL )? arith_uminus_expr )*
            loop167:
            do {
                int alt167=2;
                int LA167_0 = input.LA(1);

                if ( (LA167_0==NL) ) {
                    int LA167_1 = input.LA(2);

                    if ( (LA167_1==PLUS) ) {
                        alt167=1;
                    }


                }
                else if ( ((LA167_0>=PLUS && LA167_0<=MINUS)) ) {
                    alt167=1;
                }


                switch (alt167) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:591:23: ( ( NL )? PLUS | MINUS ) ( NL )? arith_uminus_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:591:23: ( ( NL )? PLUS | MINUS )
            	    int alt165=2;
            	    int LA165_0 = input.LA(1);

            	    if ( (LA165_0==PLUS||LA165_0==NL) ) {
            	        alt165=1;
            	    }
            	    else if ( (LA165_0==MINUS) ) {
            	        alt165=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 165, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt165) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:591:24: ( NL )? PLUS
            	            {
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:591:26: ( NL )?
            	            int alt164=2;
            	            int LA164_0 = input.LA(1);

            	            if ( (LA164_0==NL) ) {
            	                alt164=1;
            	            }
            	            switch (alt164) {
            	                case 1 :
            	                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:591:26: NL
            	                    {
            	                    NL359=(Token)match(input,NL,FOLLOW_NL_in_arith_plus_expr3789); if (state.failed) return retval;

            	                    }
            	                    break;

            	            }

            	            PLUS360=(Token)match(input,PLUS,FOLLOW_PLUS_in_arith_plus_expr3793); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PLUS360_tree = (CommonTree)adaptor.create(PLUS360);
            	            root_0 = (CommonTree)adaptor.becomeRoot(PLUS360_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:591:37: MINUS
            	            {
            	            MINUS361=(Token)match(input,MINUS,FOLLOW_MINUS_in_arith_plus_expr3798); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            MINUS361_tree = (CommonTree)adaptor.create(MINUS361);
            	            root_0 = (CommonTree)adaptor.becomeRoot(MINUS361_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:591:47: ( NL )?
            	    int alt166=2;
            	    int LA166_0 = input.LA(1);

            	    if ( (LA166_0==NL) ) {
            	        alt166=1;
            	    }
            	    switch (alt166) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:591:47: NL
            	            {
            	            NL362=(Token)match(input,NL,FOLLOW_NL_in_arith_plus_expr3802); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_arith_uminus_expr_in_arith_plus_expr3806);
            	    arith_uminus_expr363=arith_uminus_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, arith_uminus_expr363.getTree());

            	    }
            	    break;

            	default :
            	    break loop167;
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:593:1: p_arith_plus_expr : p_arith_uminus_expr ( ( NL )? ( PLUS | MINUS ) ( NL )? p_arith_uminus_expr )* ;
    public final babel17Parser.p_arith_plus_expr_return p_arith_plus_expr() throws RecognitionException {
        babel17Parser.p_arith_plus_expr_return retval = new babel17Parser.p_arith_plus_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL365=null;
        Token set366=null;
        Token NL367=null;
        babel17Parser.p_arith_uminus_expr_return p_arith_uminus_expr364 = null;

        babel17Parser.p_arith_uminus_expr_return p_arith_uminus_expr368 = null;


        CommonTree NL365_tree=null;
        CommonTree set366_tree=null;
        CommonTree NL367_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:594:2: ( p_arith_uminus_expr ( ( NL )? ( PLUS | MINUS ) ( NL )? p_arith_uminus_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:594:4: p_arith_uminus_expr ( ( NL )? ( PLUS | MINUS ) ( NL )? p_arith_uminus_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_arith_uminus_expr_in_p_arith_plus_expr3817);
            p_arith_uminus_expr364=p_arith_uminus_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_arith_uminus_expr364.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:594:24: ( ( NL )? ( PLUS | MINUS ) ( NL )? p_arith_uminus_expr )*
            loop170:
            do {
                int alt170=2;
                int LA170_0 = input.LA(1);

                if ( (LA170_0==NL) ) {
                    int LA170_1 = input.LA(2);

                    if ( ((LA170_1>=PLUS && LA170_1<=MINUS)) ) {
                        alt170=1;
                    }


                }
                else if ( ((LA170_0>=PLUS && LA170_0<=MINUS)) ) {
                    alt170=1;
                }


                switch (alt170) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:594:25: ( NL )? ( PLUS | MINUS ) ( NL )? p_arith_uminus_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:594:27: ( NL )?
            	    int alt168=2;
            	    int LA168_0 = input.LA(1);

            	    if ( (LA168_0==NL) ) {
            	        alt168=1;
            	    }
            	    switch (alt168) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:594:27: NL
            	            {
            	            NL365=(Token)match(input,NL,FOLLOW_NL_in_p_arith_plus_expr3820); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    set366=(Token)input.LT(1);
            	    set366=(Token)input.LT(1);
            	    if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set366), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:594:48: ( NL )?
            	    int alt169=2;
            	    int LA169_0 = input.LA(1);

            	    if ( (LA169_0==NL) ) {
            	        alt169=1;
            	    }
            	    switch (alt169) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:594:48: NL
            	            {
            	            NL367=(Token)match(input,NL,FOLLOW_NL_in_p_arith_plus_expr3833); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_arith_uminus_expr_in_p_arith_plus_expr3837);
            	    p_arith_uminus_expr368=p_arith_uminus_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_arith_uminus_expr368.getTree());

            	    }
            	    break;

            	default :
            	    break loop170;
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:596:1: arith_uminus_expr : ( MINUS ( NL )? arith_mult_expr -> ^( UMINUS arith_mult_expr ) | arith_mult_expr );
    public final babel17Parser.arith_uminus_expr_return arith_uminus_expr() throws RecognitionException {
        babel17Parser.arith_uminus_expr_return retval = new babel17Parser.arith_uminus_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token MINUS369=null;
        Token NL370=null;
        babel17Parser.arith_mult_expr_return arith_mult_expr371 = null;

        babel17Parser.arith_mult_expr_return arith_mult_expr372 = null;


        CommonTree MINUS369_tree=null;
        CommonTree NL370_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleSubtreeStream stream_arith_mult_expr=new RewriteRuleSubtreeStream(adaptor,"rule arith_mult_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:597:2: ( MINUS ( NL )? arith_mult_expr -> ^( UMINUS arith_mult_expr ) | arith_mult_expr )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:597:4: MINUS ( NL )? arith_mult_expr
                    {
                    MINUS369=(Token)match(input,MINUS,FOLLOW_MINUS_in_arith_uminus_expr3850); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(MINUS369);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:597:10: ( NL )?
                    int alt171=2;
                    int LA171_0 = input.LA(1);

                    if ( (LA171_0==NL) ) {
                        alt171=1;
                    }
                    switch (alt171) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:597:10: NL
                            {
                            NL370=(Token)match(input,NL,FOLLOW_NL_in_arith_uminus_expr3852); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL370);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_arith_mult_expr_in_arith_uminus_expr3855);
                    arith_mult_expr371=arith_mult_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_arith_mult_expr.add(arith_mult_expr371.getTree());


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
                    // 597:30: -> ^( UMINUS arith_mult_expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:597:33: ^( UMINUS arith_mult_expr )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:598:4: arith_mult_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_arith_mult_expr_in_arith_uminus_expr3868);
                    arith_mult_expr372=arith_mult_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arith_mult_expr372.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:600:1: p_arith_uminus_expr : ( MINUS ( NL )? p_arith_mult_expr -> ^( UMINUS p_arith_mult_expr ) | p_arith_mult_expr );
    public final babel17Parser.p_arith_uminus_expr_return p_arith_uminus_expr() throws RecognitionException {
        babel17Parser.p_arith_uminus_expr_return retval = new babel17Parser.p_arith_uminus_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token MINUS373=null;
        Token NL374=null;
        babel17Parser.p_arith_mult_expr_return p_arith_mult_expr375 = null;

        babel17Parser.p_arith_mult_expr_return p_arith_mult_expr376 = null;


        CommonTree MINUS373_tree=null;
        CommonTree NL374_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleSubtreeStream stream_p_arith_mult_expr=new RewriteRuleSubtreeStream(adaptor,"rule p_arith_mult_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:601:2: ( MINUS ( NL )? p_arith_mult_expr -> ^( UMINUS p_arith_mult_expr ) | p_arith_mult_expr )
            int alt174=2;
            int LA174_0 = input.LA(1);

            if ( (LA174_0==MINUS) ) {
                alt174=1;
            }
            else if ( (LA174_0==L_begin||(LA174_0>=L_with && LA174_0<=L_if)||(LA174_0>=L_while && LA174_0<=L_for)||LA174_0==L_match||(LA174_0>=A_infinity && LA174_0<=U_infinity)||(LA174_0>=L_true && LA174_0<=L_this)||LA174_0==L_nil||(LA174_0>=Constr && LA174_0<=Num)||(LA174_0>=String && LA174_0<=ROUND_BRACKET_OPEN)||LA174_0==SQUARE_BRACKET_OPEN||LA174_0==CURLY_BRACKET_OPEN) ) {
                alt174=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 174, 0, input);

                throw nvae;
            }
            switch (alt174) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:601:4: MINUS ( NL )? p_arith_mult_expr
                    {
                    MINUS373=(Token)match(input,MINUS,FOLLOW_MINUS_in_p_arith_uminus_expr3879); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(MINUS373);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:601:10: ( NL )?
                    int alt173=2;
                    int LA173_0 = input.LA(1);

                    if ( (LA173_0==NL) ) {
                        alt173=1;
                    }
                    switch (alt173) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:601:10: NL
                            {
                            NL374=(Token)match(input,NL,FOLLOW_NL_in_p_arith_uminus_expr3881); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL374);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_p_arith_mult_expr_in_p_arith_uminus_expr3884);
                    p_arith_mult_expr375=p_arith_mult_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_p_arith_mult_expr.add(p_arith_mult_expr375.getTree());


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
                    // 601:32: -> ^( UMINUS p_arith_mult_expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:601:35: ^( UMINUS p_arith_mult_expr )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:602:4: p_arith_mult_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_p_arith_mult_expr_in_p_arith_uminus_expr3897);
                    p_arith_mult_expr376=p_arith_mult_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_arith_mult_expr376.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:604:1: arith_mult_expr : arith_pow_expr ( ( NL )? ( TIMES | QUOTIENT | L_div | L_mod ) ( NL )? arith_pow_expr )* ;
    public final babel17Parser.arith_mult_expr_return arith_mult_expr() throws RecognitionException {
        babel17Parser.arith_mult_expr_return retval = new babel17Parser.arith_mult_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL378=null;
        Token set379=null;
        Token NL380=null;
        babel17Parser.arith_pow_expr_return arith_pow_expr377 = null;

        babel17Parser.arith_pow_expr_return arith_pow_expr381 = null;


        CommonTree NL378_tree=null;
        CommonTree set379_tree=null;
        CommonTree NL380_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:605:2: ( arith_pow_expr ( ( NL )? ( TIMES | QUOTIENT | L_div | L_mod ) ( NL )? arith_pow_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:605:4: arith_pow_expr ( ( NL )? ( TIMES | QUOTIENT | L_div | L_mod ) ( NL )? arith_pow_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_arith_pow_expr_in_arith_mult_expr3906);
            arith_pow_expr377=arith_pow_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, arith_pow_expr377.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:605:19: ( ( NL )? ( TIMES | QUOTIENT | L_div | L_mod ) ( NL )? arith_pow_expr )*
            loop177:
            do {
                int alt177=2;
                int LA177_0 = input.LA(1);

                if ( (LA177_0==NL) ) {
                    int LA177_1 = input.LA(2);

                    if ( ((LA177_1>=L_div && LA177_1<=L_mod)||(LA177_1>=TIMES && LA177_1<=QUOTIENT)) ) {
                        alt177=1;
                    }


                }
                else if ( ((LA177_0>=L_div && LA177_0<=L_mod)||(LA177_0>=TIMES && LA177_0<=QUOTIENT)) ) {
                    alt177=1;
                }


                switch (alt177) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:605:20: ( NL )? ( TIMES | QUOTIENT | L_div | L_mod ) ( NL )? arith_pow_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:605:22: ( NL )?
            	    int alt175=2;
            	    int LA175_0 = input.LA(1);

            	    if ( (LA175_0==NL) ) {
            	        alt175=1;
            	    }
            	    switch (alt175) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:605:22: NL
            	            {
            	            NL378=(Token)match(input,NL,FOLLOW_NL_in_arith_mult_expr3909); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    set379=(Token)input.LT(1);
            	    set379=(Token)input.LT(1);
            	    if ( (input.LA(1)>=L_div && input.LA(1)<=L_mod)||(input.LA(1)>=TIMES && input.LA(1)<=QUOTIENT) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set379), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:605:63: ( NL )?
            	    int alt176=2;
            	    int LA176_0 = input.LA(1);

            	    if ( (LA176_0==NL) ) {
            	        alt176=1;
            	    }
            	    switch (alt176) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:605:63: NL
            	            {
            	            NL380=(Token)match(input,NL,FOLLOW_NL_in_arith_mult_expr3930); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_arith_pow_expr_in_arith_mult_expr3934);
            	    arith_pow_expr381=arith_pow_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, arith_pow_expr381.getTree());

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
    // $ANTLR end "arith_mult_expr"

    public static class p_arith_mult_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "p_arith_mult_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:607:1: p_arith_mult_expr : p_arith_pow_expr ( ( NL )? ( TIMES | QUOTIENT | L_div | L_mod ) ( NL )? p_arith_pow_expr )* ;
    public final babel17Parser.p_arith_mult_expr_return p_arith_mult_expr() throws RecognitionException {
        babel17Parser.p_arith_mult_expr_return retval = new babel17Parser.p_arith_mult_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL383=null;
        Token set384=null;
        Token NL385=null;
        babel17Parser.p_arith_pow_expr_return p_arith_pow_expr382 = null;

        babel17Parser.p_arith_pow_expr_return p_arith_pow_expr386 = null;


        CommonTree NL383_tree=null;
        CommonTree set384_tree=null;
        CommonTree NL385_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:608:2: ( p_arith_pow_expr ( ( NL )? ( TIMES | QUOTIENT | L_div | L_mod ) ( NL )? p_arith_pow_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:608:4: p_arith_pow_expr ( ( NL )? ( TIMES | QUOTIENT | L_div | L_mod ) ( NL )? p_arith_pow_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_arith_pow_expr_in_p_arith_mult_expr3946);
            p_arith_pow_expr382=p_arith_pow_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_arith_pow_expr382.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:608:21: ( ( NL )? ( TIMES | QUOTIENT | L_div | L_mod ) ( NL )? p_arith_pow_expr )*
            loop180:
            do {
                int alt180=2;
                int LA180_0 = input.LA(1);

                if ( (LA180_0==NL) ) {
                    int LA180_1 = input.LA(2);

                    if ( ((LA180_1>=L_div && LA180_1<=L_mod)||(LA180_1>=TIMES && LA180_1<=QUOTIENT)) ) {
                        alt180=1;
                    }


                }
                else if ( ((LA180_0>=L_div && LA180_0<=L_mod)||(LA180_0>=TIMES && LA180_0<=QUOTIENT)) ) {
                    alt180=1;
                }


                switch (alt180) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:608:22: ( NL )? ( TIMES | QUOTIENT | L_div | L_mod ) ( NL )? p_arith_pow_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:608:24: ( NL )?
            	    int alt178=2;
            	    int LA178_0 = input.LA(1);

            	    if ( (LA178_0==NL) ) {
            	        alt178=1;
            	    }
            	    switch (alt178) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:608:24: NL
            	            {
            	            NL383=(Token)match(input,NL,FOLLOW_NL_in_p_arith_mult_expr3949); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    set384=(Token)input.LT(1);
            	    set384=(Token)input.LT(1);
            	    if ( (input.LA(1)>=L_div && input.LA(1)<=L_mod)||(input.LA(1)>=TIMES && input.LA(1)<=QUOTIENT) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set384), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:608:65: ( NL )?
            	    int alt179=2;
            	    int LA179_0 = input.LA(1);

            	    if ( (LA179_0==NL) ) {
            	        alt179=1;
            	    }
            	    switch (alt179) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:608:65: NL
            	            {
            	            NL385=(Token)match(input,NL,FOLLOW_NL_in_p_arith_mult_expr3970); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_arith_pow_expr_in_p_arith_mult_expr3974);
            	    p_arith_pow_expr386=p_arith_pow_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_arith_pow_expr386.getTree());

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
    // $ANTLR end "p_arith_mult_expr"

    public static class arith_pow_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arith_pow_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:610:1: arith_pow_expr : apply_expr ( ( NL )? POW_tok ( NL )? apply_expr )* -> ^( POW ( apply_expr )* ) ;
    public final babel17Parser.arith_pow_expr_return arith_pow_expr() throws RecognitionException {
        babel17Parser.arith_pow_expr_return retval = new babel17Parser.arith_pow_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL388=null;
        Token POW_tok389=null;
        Token NL390=null;
        babel17Parser.apply_expr_return apply_expr387 = null;

        babel17Parser.apply_expr_return apply_expr391 = null;


        CommonTree NL388_tree=null;
        CommonTree POW_tok389_tree=null;
        CommonTree NL390_tree=null;
        RewriteRuleTokenStream stream_POW_tok=new RewriteRuleTokenStream(adaptor,"token POW_tok");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_apply_expr=new RewriteRuleSubtreeStream(adaptor,"rule apply_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:611:2: ( apply_expr ( ( NL )? POW_tok ( NL )? apply_expr )* -> ^( POW ( apply_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:611:4: apply_expr ( ( NL )? POW_tok ( NL )? apply_expr )*
            {
            pushFollow(FOLLOW_apply_expr_in_arith_pow_expr3985);
            apply_expr387=apply_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_apply_expr.add(apply_expr387.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:611:15: ( ( NL )? POW_tok ( NL )? apply_expr )*
            loop183:
            do {
                int alt183=2;
                int LA183_0 = input.LA(1);

                if ( (LA183_0==NL) ) {
                    int LA183_1 = input.LA(2);

                    if ( (LA183_1==POW_tok) ) {
                        alt183=1;
                    }


                }
                else if ( (LA183_0==POW_tok) ) {
                    alt183=1;
                }


                switch (alt183) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:611:16: ( NL )? POW_tok ( NL )? apply_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:611:16: ( NL )?
            	    int alt181=2;
            	    int LA181_0 = input.LA(1);

            	    if ( (LA181_0==NL) ) {
            	        alt181=1;
            	    }
            	    switch (alt181) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:611:16: NL
            	            {
            	            NL388=(Token)match(input,NL,FOLLOW_NL_in_arith_pow_expr3988); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL388);


            	            }
            	            break;

            	    }

            	    POW_tok389=(Token)match(input,POW_tok,FOLLOW_POW_tok_in_arith_pow_expr3991); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_POW_tok.add(POW_tok389);

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:611:28: ( NL )?
            	    int alt182=2;
            	    int LA182_0 = input.LA(1);

            	    if ( (LA182_0==NL) ) {
            	        alt182=1;
            	    }
            	    switch (alt182) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:611:28: NL
            	            {
            	            NL390=(Token)match(input,NL,FOLLOW_NL_in_arith_pow_expr3993); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL390);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_apply_expr_in_arith_pow_expr3996);
            	    apply_expr391=apply_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_apply_expr.add(apply_expr391.getTree());

            	    }
            	    break;

            	default :
            	    break loop183;
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
            // 611:45: -> ^( POW ( apply_expr )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:611:48: ^( POW ( apply_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(POW, "POW"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:611:54: ( apply_expr )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:613:1: p_arith_pow_expr : p_apply_expr ( ( NL )? POW_tok ( NL )? p_apply_expr )* -> ^( POW ( p_apply_expr )* ) ;
    public final babel17Parser.p_arith_pow_expr_return p_arith_pow_expr() throws RecognitionException {
        babel17Parser.p_arith_pow_expr_return retval = new babel17Parser.p_arith_pow_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL393=null;
        Token POW_tok394=null;
        Token NL395=null;
        babel17Parser.p_apply_expr_return p_apply_expr392 = null;

        babel17Parser.p_apply_expr_return p_apply_expr396 = null;


        CommonTree NL393_tree=null;
        CommonTree POW_tok394_tree=null;
        CommonTree NL395_tree=null;
        RewriteRuleTokenStream stream_POW_tok=new RewriteRuleTokenStream(adaptor,"token POW_tok");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_p_apply_expr=new RewriteRuleSubtreeStream(adaptor,"rule p_apply_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:614:2: ( p_apply_expr ( ( NL )? POW_tok ( NL )? p_apply_expr )* -> ^( POW ( p_apply_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:614:4: p_apply_expr ( ( NL )? POW_tok ( NL )? p_apply_expr )*
            {
            pushFollow(FOLLOW_p_apply_expr_in_p_arith_pow_expr4017);
            p_apply_expr392=p_apply_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_p_apply_expr.add(p_apply_expr392.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:614:17: ( ( NL )? POW_tok ( NL )? p_apply_expr )*
            loop186:
            do {
                int alt186=2;
                int LA186_0 = input.LA(1);

                if ( (LA186_0==NL) ) {
                    int LA186_1 = input.LA(2);

                    if ( (LA186_1==POW_tok) ) {
                        alt186=1;
                    }


                }
                else if ( (LA186_0==POW_tok) ) {
                    alt186=1;
                }


                switch (alt186) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:614:18: ( NL )? POW_tok ( NL )? p_apply_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:614:18: ( NL )?
            	    int alt184=2;
            	    int LA184_0 = input.LA(1);

            	    if ( (LA184_0==NL) ) {
            	        alt184=1;
            	    }
            	    switch (alt184) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:614:18: NL
            	            {
            	            NL393=(Token)match(input,NL,FOLLOW_NL_in_p_arith_pow_expr4020); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL393);


            	            }
            	            break;

            	    }

            	    POW_tok394=(Token)match(input,POW_tok,FOLLOW_POW_tok_in_p_arith_pow_expr4023); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_POW_tok.add(POW_tok394);

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:614:30: ( NL )?
            	    int alt185=2;
            	    int LA185_0 = input.LA(1);

            	    if ( (LA185_0==NL) ) {
            	        alt185=1;
            	    }
            	    switch (alt185) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:614:30: NL
            	            {
            	            NL395=(Token)match(input,NL,FOLLOW_NL_in_p_arith_pow_expr4025); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL395);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_apply_expr_in_p_arith_pow_expr4028);
            	    p_apply_expr396=p_apply_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_p_apply_expr.add(p_apply_expr396.getTree());

            	    }
            	    break;

            	default :
            	    break loop186;
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
            // 614:49: -> ^( POW ( p_apply_expr )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:614:52: ^( POW ( p_apply_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(POW, "POW"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:614:58: ( p_apply_expr )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:616:1: apply_expr : ( basic_expr )+ -> ^( APPLY ( basic_expr )* ) ;
    public final babel17Parser.apply_expr_return apply_expr() throws RecognitionException {
        babel17Parser.apply_expr_return retval = new babel17Parser.apply_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.basic_expr_return basic_expr397 = null;


        RewriteRuleSubtreeStream stream_basic_expr=new RewriteRuleSubtreeStream(adaptor,"rule basic_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:617:2: ( ( basic_expr )+ -> ^( APPLY ( basic_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:617:4: ( basic_expr )+
            {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:617:4: ( basic_expr )+
            int cnt187=0;
            loop187:
            do {
                int alt187=2;
                int LA187_0 = input.LA(1);

                if ( (LA187_0==L_begin||(LA187_0>=L_with && LA187_0<=L_if)||(LA187_0>=L_while && LA187_0<=L_for)||LA187_0==L_match||(LA187_0>=A_infinity && LA187_0<=U_infinity)||(LA187_0>=L_true && LA187_0<=L_this)||LA187_0==L_nil||(LA187_0>=Constr && LA187_0<=Num)||(LA187_0>=String && LA187_0<=ROUND_BRACKET_OPEN)||LA187_0==SQUARE_BRACKET_OPEN||LA187_0==CURLY_BRACKET_OPEN) ) {
                    alt187=1;
                }


                switch (alt187) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:617:4: basic_expr
            	    {
            	    pushFollow(FOLLOW_basic_expr_in_apply_expr4049);
            	    basic_expr397=basic_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_basic_expr.add(basic_expr397.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt187 >= 1 ) break loop187;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(187, input);
                        throw eee;
                }
                cnt187++;
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
            // 617:16: -> ^( APPLY ( basic_expr )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:617:19: ^( APPLY ( basic_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(APPLY, "APPLY"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:617:27: ( basic_expr )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:618:1: p_apply_expr : p_basic_expr ( ( NL )? p_basic_expr )* -> ^( APPLY ( p_basic_expr )* ) ;
    public final babel17Parser.p_apply_expr_return p_apply_expr() throws RecognitionException {
        babel17Parser.p_apply_expr_return retval = new babel17Parser.p_apply_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL399=null;
        babel17Parser.p_basic_expr_return p_basic_expr398 = null;

        babel17Parser.p_basic_expr_return p_basic_expr400 = null;


        CommonTree NL399_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_p_basic_expr=new RewriteRuleSubtreeStream(adaptor,"rule p_basic_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:619:2: ( p_basic_expr ( ( NL )? p_basic_expr )* -> ^( APPLY ( p_basic_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:619:4: p_basic_expr ( ( NL )? p_basic_expr )*
            {
            pushFollow(FOLLOW_p_basic_expr_in_p_apply_expr4067);
            p_basic_expr398=p_basic_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_p_basic_expr.add(p_basic_expr398.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:619:17: ( ( NL )? p_basic_expr )*
            loop189:
            do {
                int alt189=2;
                int LA189_0 = input.LA(1);

                if ( (LA189_0==NL) ) {
                    int LA189_1 = input.LA(2);

                    if ( (LA189_1==L_begin||(LA189_1>=L_with && LA189_1<=L_if)||(LA189_1>=L_while && LA189_1<=L_for)||LA189_1==L_match||(LA189_1>=A_infinity && LA189_1<=U_infinity)||(LA189_1>=L_true && LA189_1<=L_this)||LA189_1==L_nil||(LA189_1>=Constr && LA189_1<=Num)||(LA189_1>=String && LA189_1<=ROUND_BRACKET_OPEN)||LA189_1==SQUARE_BRACKET_OPEN||LA189_1==CURLY_BRACKET_OPEN) ) {
                        alt189=1;
                    }


                }
                else if ( (LA189_0==L_begin||(LA189_0>=L_with && LA189_0<=L_if)||(LA189_0>=L_while && LA189_0<=L_for)||LA189_0==L_match||(LA189_0>=A_infinity && LA189_0<=U_infinity)||(LA189_0>=L_true && LA189_0<=L_this)||LA189_0==L_nil||(LA189_0>=Constr && LA189_0<=Num)||(LA189_0>=String && LA189_0<=ROUND_BRACKET_OPEN)||LA189_0==SQUARE_BRACKET_OPEN||LA189_0==CURLY_BRACKET_OPEN) ) {
                    alt189=1;
                }


                switch (alt189) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:619:18: ( NL )? p_basic_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:619:18: ( NL )?
            	    int alt188=2;
            	    int LA188_0 = input.LA(1);

            	    if ( (LA188_0==NL) ) {
            	        alt188=1;
            	    }
            	    switch (alt188) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:619:18: NL
            	            {
            	            NL399=(Token)match(input,NL,FOLLOW_NL_in_p_apply_expr4070); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL399);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_basic_expr_in_p_apply_expr4073);
            	    p_basic_expr400=p_basic_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_p_basic_expr.add(p_basic_expr400.getTree());

            	    }
            	    break;

            	default :
            	    break loop189;
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
            // 619:37: -> ^( APPLY ( p_basic_expr )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:619:40: ^( APPLY ( p_basic_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(APPLY, "APPLY"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:619:48: ( p_basic_expr )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:621:1: basic_expr : message_send_expr ;
    public final babel17Parser.basic_expr_return basic_expr() throws RecognitionException {
        babel17Parser.basic_expr_return retval = new babel17Parser.basic_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.message_send_expr_return message_send_expr401 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:622:2: ( message_send_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:622:4: message_send_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_message_send_expr_in_basic_expr4093);
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
    // $ANTLR end "basic_expr"

    public static class p_basic_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "p_basic_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:624:1: p_basic_expr : message_send_expr ;
    public final babel17Parser.p_basic_expr_return p_basic_expr() throws RecognitionException {
        babel17Parser.p_basic_expr_return retval = new babel17Parser.p_basic_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.message_send_expr_return message_send_expr402 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:625:2: ( message_send_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:625:4: message_send_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_message_send_expr_in_p_basic_expr4102);
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
    // $ANTLR end "p_basic_expr"

    public static class message_send_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "message_send_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:627:1: message_send_expr : primitive_expr ( ( NL )? PERIOD ( NL )? Id )* -> ^( MESSAGE_SEND primitive_expr ( Id )* ) ;
    public final babel17Parser.message_send_expr_return message_send_expr() throws RecognitionException {
        babel17Parser.message_send_expr_return retval = new babel17Parser.message_send_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL404=null;
        Token PERIOD405=null;
        Token NL406=null;
        Token Id407=null;
        babel17Parser.primitive_expr_return primitive_expr403 = null;


        CommonTree NL404_tree=null;
        CommonTree PERIOD405_tree=null;
        CommonTree NL406_tree=null;
        CommonTree Id407_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
        RewriteRuleTokenStream stream_Id=new RewriteRuleTokenStream(adaptor,"token Id");
        RewriteRuleSubtreeStream stream_primitive_expr=new RewriteRuleSubtreeStream(adaptor,"rule primitive_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:628:2: ( primitive_expr ( ( NL )? PERIOD ( NL )? Id )* -> ^( MESSAGE_SEND primitive_expr ( Id )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:628:4: primitive_expr ( ( NL )? PERIOD ( NL )? Id )*
            {
            pushFollow(FOLLOW_primitive_expr_in_message_send_expr4111);
            primitive_expr403=primitive_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_primitive_expr.add(primitive_expr403.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:628:19: ( ( NL )? PERIOD ( NL )? Id )*
            loop192:
            do {
                int alt192=2;
                int LA192_0 = input.LA(1);

                if ( (LA192_0==NL) ) {
                    int LA192_1 = input.LA(2);

                    if ( (LA192_1==PERIOD) ) {
                        alt192=1;
                    }


                }
                else if ( (LA192_0==PERIOD) ) {
                    alt192=1;
                }


                switch (alt192) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:628:20: ( NL )? PERIOD ( NL )? Id
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:628:20: ( NL )?
            	    int alt190=2;
            	    int LA190_0 = input.LA(1);

            	    if ( (LA190_0==NL) ) {
            	        alt190=1;
            	    }
            	    switch (alt190) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:628:20: NL
            	            {
            	            NL404=(Token)match(input,NL,FOLLOW_NL_in_message_send_expr4114); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL404);


            	            }
            	            break;

            	    }

            	    PERIOD405=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_message_send_expr4117); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD405);

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:628:31: ( NL )?
            	    int alt191=2;
            	    int LA191_0 = input.LA(1);

            	    if ( (LA191_0==NL) ) {
            	        alt191=1;
            	    }
            	    switch (alt191) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:628:31: NL
            	            {
            	            NL406=(Token)match(input,NL,FOLLOW_NL_in_message_send_expr4119); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL406);


            	            }
            	            break;

            	    }

            	    Id407=(Token)match(input,Id,FOLLOW_Id_in_message_send_expr4122); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_Id.add(Id407);


            	    }
            	    break;

            	default :
            	    break loop192;
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
            // 628:40: -> ^( MESSAGE_SEND primitive_expr ( Id )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:628:43: ^( MESSAGE_SEND primitive_expr ( Id )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MESSAGE_SEND, "MESSAGE_SEND"), root_1);

                adaptor.addChild(root_1, stream_primitive_expr.nextTree());
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:628:73: ( Id )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:630:1: list_expr : ( '[' ( NL )? ( protected_expr ( ( NL )? COMMA ( NL )? protected_expr )* ( NL )? )? ']' -> ^( SQUARE_LIST ( protected_expr )* ) | '(' ( NL )? ( protected_expr ( ( NL )? COMMA ( NL )? protected_expr )* ( NL )? ( COMMA ( NL )? )? )? ')' -> ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( protected_expr )* ) ) );
    public final babel17Parser.list_expr_return list_expr() throws RecognitionException {
        babel17Parser.list_expr_return retval = new babel17Parser.list_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal408=null;
        Token NL409=null;
        Token NL411=null;
        Token COMMA412=null;
        Token NL413=null;
        Token NL415=null;
        Token char_literal416=null;
        Token char_literal417=null;
        Token NL418=null;
        Token NL420=null;
        Token COMMA421=null;
        Token NL422=null;
        Token NL424=null;
        Token COMMA425=null;
        Token NL426=null;
        Token char_literal427=null;
        babel17Parser.protected_expr_return protected_expr410 = null;

        babel17Parser.protected_expr_return protected_expr414 = null;

        babel17Parser.protected_expr_return protected_expr419 = null;

        babel17Parser.protected_expr_return protected_expr423 = null;


        CommonTree char_literal408_tree=null;
        CommonTree NL409_tree=null;
        CommonTree NL411_tree=null;
        CommonTree COMMA412_tree=null;
        CommonTree NL413_tree=null;
        CommonTree NL415_tree=null;
        CommonTree char_literal416_tree=null;
        CommonTree char_literal417_tree=null;
        CommonTree NL418_tree=null;
        CommonTree NL420_tree=null;
        CommonTree COMMA421_tree=null;
        CommonTree NL422_tree=null;
        CommonTree NL424_tree=null;
        CommonTree COMMA425_tree=null;
        CommonTree NL426_tree=null;
        CommonTree char_literal427_tree=null;
        RewriteRuleTokenStream stream_ROUND_BRACKET_OPEN=new RewriteRuleTokenStream(adaptor,"token ROUND_BRACKET_OPEN");
        RewriteRuleTokenStream stream_SQUARE_BRACKET_CLOSE=new RewriteRuleTokenStream(adaptor,"token SQUARE_BRACKET_CLOSE");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_ROUND_BRACKET_CLOSE=new RewriteRuleTokenStream(adaptor,"token ROUND_BRACKET_CLOSE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_SQUARE_BRACKET_OPEN=new RewriteRuleTokenStream(adaptor,"token SQUARE_BRACKET_OPEN");
        RewriteRuleSubtreeStream stream_protected_expr=new RewriteRuleSubtreeStream(adaptor,"rule protected_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:631:2: ( '[' ( NL )? ( protected_expr ( ( NL )? COMMA ( NL )? protected_expr )* ( NL )? )? ']' -> ^( SQUARE_LIST ( protected_expr )* ) | '(' ( NL )? ( protected_expr ( ( NL )? COMMA ( NL )? protected_expr )* ( NL )? ( COMMA ( NL )? )? )? ')' -> ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( protected_expr )* ) ) )
            int alt207=2;
            int LA207_0 = input.LA(1);

            if ( (LA207_0==SQUARE_BRACKET_OPEN) ) {
                alt207=1;
            }
            else if ( (LA207_0==ROUND_BRACKET_OPEN) ) {
                alt207=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 207, 0, input);

                throw nvae;
            }
            switch (alt207) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:631:4: '[' ( NL )? ( protected_expr ( ( NL )? COMMA ( NL )? protected_expr )* ( NL )? )? ']'
                    {
                    char_literal408=(Token)match(input,SQUARE_BRACKET_OPEN,FOLLOW_SQUARE_BRACKET_OPEN_in_list_expr4146); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SQUARE_BRACKET_OPEN.add(char_literal408);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:631:8: ( NL )?
                    int alt193=2;
                    int LA193_0 = input.LA(1);

                    if ( (LA193_0==NL) ) {
                        alt193=1;
                    }
                    switch (alt193) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:631:8: NL
                            {
                            NL409=(Token)match(input,NL,FOLLOW_NL_in_list_expr4148); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL409);


                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:631:12: ( protected_expr ( ( NL )? COMMA ( NL )? protected_expr )* ( NL )? )?
                    int alt198=2;
                    int LA198_0 = input.LA(1);

                    if ( (LA198_0==L_begin||(LA198_0>=L_obj && LA198_0<=L_if)||(LA198_0>=L_while && LA198_0<=L_for)||(LA198_0>=L_match && LA198_0<=L_case)||LA198_0==L_exception||(LA198_0>=A_infinity && LA198_0<=L_lazy)||(LA198_0>=L_true && LA198_0<=L_nil)||LA198_0==MINUS||LA198_0==A_NOT||LA198_0==U_NOT||(LA198_0>=A_ELLIPSIS && LA198_0<=U_ELLIPSIS)||LA198_0==L_force||(LA198_0>=Constr && LA198_0<=Num)||(LA198_0>=String && LA198_0<=ROUND_BRACKET_OPEN)||LA198_0==SQUARE_BRACKET_OPEN||LA198_0==CURLY_BRACKET_OPEN||LA198_0==UNDERSCORE) ) {
                        alt198=1;
                    }
                    switch (alt198) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:631:13: protected_expr ( ( NL )? COMMA ( NL )? protected_expr )* ( NL )?
                            {
                            pushFollow(FOLLOW_protected_expr_in_list_expr4152);
                            protected_expr410=protected_expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr410.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:631:28: ( ( NL )? COMMA ( NL )? protected_expr )*
                            loop196:
                            do {
                                int alt196=2;
                                int LA196_0 = input.LA(1);

                                if ( (LA196_0==NL) ) {
                                    int LA196_1 = input.LA(2);

                                    if ( (LA196_1==COMMA) ) {
                                        alt196=1;
                                    }


                                }
                                else if ( (LA196_0==COMMA) ) {
                                    alt196=1;
                                }


                                switch (alt196) {
                            	case 1 :
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:631:29: ( NL )? COMMA ( NL )? protected_expr
                            	    {
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:631:29: ( NL )?
                            	    int alt194=2;
                            	    int LA194_0 = input.LA(1);

                            	    if ( (LA194_0==NL) ) {
                            	        alt194=1;
                            	    }
                            	    switch (alt194) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:631:29: NL
                            	            {
                            	            NL411=(Token)match(input,NL,FOLLOW_NL_in_list_expr4155); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL411);


                            	            }
                            	            break;

                            	    }

                            	    COMMA412=(Token)match(input,COMMA,FOLLOW_COMMA_in_list_expr4158); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA412);

                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:631:39: ( NL )?
                            	    int alt195=2;
                            	    int LA195_0 = input.LA(1);

                            	    if ( (LA195_0==NL) ) {
                            	        alt195=1;
                            	    }
                            	    switch (alt195) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:631:39: NL
                            	            {
                            	            NL413=(Token)match(input,NL,FOLLOW_NL_in_list_expr4160); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL413);


                            	            }
                            	            break;

                            	    }

                            	    pushFollow(FOLLOW_protected_expr_in_list_expr4163);
                            	    protected_expr414=protected_expr();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr414.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop196;
                                }
                            } while (true);

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:631:60: ( NL )?
                            int alt197=2;
                            int LA197_0 = input.LA(1);

                            if ( (LA197_0==NL) ) {
                                alt197=1;
                            }
                            switch (alt197) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:631:60: NL
                                    {
                                    NL415=(Token)match(input,NL,FOLLOW_NL_in_list_expr4167); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL415);


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    char_literal416=(Token)match(input,SQUARE_BRACKET_CLOSE,FOLLOW_SQUARE_BRACKET_CLOSE_in_list_expr4172); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SQUARE_BRACKET_CLOSE.add(char_literal416);



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
                    // 631:70: -> ^( SQUARE_LIST ( protected_expr )* )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:631:73: ^( SQUARE_LIST ( protected_expr )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SQUARE_LIST, "SQUARE_LIST"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:631:87: ( protected_expr )*
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:632:4: '(' ( NL )? ( protected_expr ( ( NL )? COMMA ( NL )? protected_expr )* ( NL )? ( COMMA ( NL )? )? )? ')'
                    {
                    char_literal417=(Token)match(input,ROUND_BRACKET_OPEN,FOLLOW_ROUND_BRACKET_OPEN_in_list_expr4186); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ROUND_BRACKET_OPEN.add(char_literal417);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:632:8: ( NL )?
                    int alt199=2;
                    int LA199_0 = input.LA(1);

                    if ( (LA199_0==NL) ) {
                        alt199=1;
                    }
                    switch (alt199) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:632:8: NL
                            {
                            NL418=(Token)match(input,NL,FOLLOW_NL_in_list_expr4188); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL418);


                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:632:12: ( protected_expr ( ( NL )? COMMA ( NL )? protected_expr )* ( NL )? ( COMMA ( NL )? )? )?
                    int alt206=2;
                    int LA206_0 = input.LA(1);

                    if ( (LA206_0==L_begin||(LA206_0>=L_obj && LA206_0<=L_if)||(LA206_0>=L_while && LA206_0<=L_for)||(LA206_0>=L_match && LA206_0<=L_case)||LA206_0==L_exception||(LA206_0>=A_infinity && LA206_0<=L_lazy)||(LA206_0>=L_true && LA206_0<=L_nil)||LA206_0==MINUS||LA206_0==A_NOT||LA206_0==U_NOT||(LA206_0>=A_ELLIPSIS && LA206_0<=U_ELLIPSIS)||LA206_0==L_force||(LA206_0>=Constr && LA206_0<=Num)||(LA206_0>=String && LA206_0<=ROUND_BRACKET_OPEN)||LA206_0==SQUARE_BRACKET_OPEN||LA206_0==CURLY_BRACKET_OPEN||LA206_0==UNDERSCORE) ) {
                        alt206=1;
                    }
                    switch (alt206) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:632:13: protected_expr ( ( NL )? COMMA ( NL )? protected_expr )* ( NL )? ( COMMA ( NL )? )?
                            {
                            pushFollow(FOLLOW_protected_expr_in_list_expr4192);
                            protected_expr419=protected_expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr419.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:632:28: ( ( NL )? COMMA ( NL )? protected_expr )*
                            loop202:
                            do {
                                int alt202=2;
                                int LA202_0 = input.LA(1);

                                if ( (LA202_0==NL) ) {
                                    int LA202_1 = input.LA(2);

                                    if ( (LA202_1==COMMA) ) {
                                        int LA202_2 = input.LA(3);

                                        if ( (LA202_2==NL) ) {
                                            int LA202_4 = input.LA(4);

                                            if ( (LA202_4==L_begin||(LA202_4>=L_obj && LA202_4<=L_if)||(LA202_4>=L_while && LA202_4<=L_for)||(LA202_4>=L_match && LA202_4<=L_case)||LA202_4==L_exception||(LA202_4>=A_infinity && LA202_4<=L_lazy)||(LA202_4>=L_true && LA202_4<=L_nil)||LA202_4==MINUS||LA202_4==A_NOT||LA202_4==U_NOT||(LA202_4>=A_ELLIPSIS && LA202_4<=U_ELLIPSIS)||LA202_4==L_force||(LA202_4>=Constr && LA202_4<=Num)||(LA202_4>=String && LA202_4<=ROUND_BRACKET_OPEN)||LA202_4==SQUARE_BRACKET_OPEN||LA202_4==CURLY_BRACKET_OPEN||LA202_4==UNDERSCORE) ) {
                                                alt202=1;
                                            }


                                        }
                                        else if ( (LA202_2==L_begin||(LA202_2>=L_obj && LA202_2<=L_if)||(LA202_2>=L_while && LA202_2<=L_for)||(LA202_2>=L_match && LA202_2<=L_case)||LA202_2==L_exception||(LA202_2>=A_infinity && LA202_2<=L_lazy)||(LA202_2>=L_true && LA202_2<=L_nil)||LA202_2==MINUS||LA202_2==A_NOT||LA202_2==U_NOT||(LA202_2>=A_ELLIPSIS && LA202_2<=U_ELLIPSIS)||LA202_2==L_force||(LA202_2>=Constr && LA202_2<=Num)||(LA202_2>=String && LA202_2<=ROUND_BRACKET_OPEN)||LA202_2==SQUARE_BRACKET_OPEN||LA202_2==CURLY_BRACKET_OPEN||LA202_2==UNDERSCORE) ) {
                                            alt202=1;
                                        }


                                    }


                                }
                                else if ( (LA202_0==COMMA) ) {
                                    int LA202_2 = input.LA(2);

                                    if ( (LA202_2==NL) ) {
                                        int LA202_4 = input.LA(3);

                                        if ( (LA202_4==L_begin||(LA202_4>=L_obj && LA202_4<=L_if)||(LA202_4>=L_while && LA202_4<=L_for)||(LA202_4>=L_match && LA202_4<=L_case)||LA202_4==L_exception||(LA202_4>=A_infinity && LA202_4<=L_lazy)||(LA202_4>=L_true && LA202_4<=L_nil)||LA202_4==MINUS||LA202_4==A_NOT||LA202_4==U_NOT||(LA202_4>=A_ELLIPSIS && LA202_4<=U_ELLIPSIS)||LA202_4==L_force||(LA202_4>=Constr && LA202_4<=Num)||(LA202_4>=String && LA202_4<=ROUND_BRACKET_OPEN)||LA202_4==SQUARE_BRACKET_OPEN||LA202_4==CURLY_BRACKET_OPEN||LA202_4==UNDERSCORE) ) {
                                            alt202=1;
                                        }


                                    }
                                    else if ( (LA202_2==L_begin||(LA202_2>=L_obj && LA202_2<=L_if)||(LA202_2>=L_while && LA202_2<=L_for)||(LA202_2>=L_match && LA202_2<=L_case)||LA202_2==L_exception||(LA202_2>=A_infinity && LA202_2<=L_lazy)||(LA202_2>=L_true && LA202_2<=L_nil)||LA202_2==MINUS||LA202_2==A_NOT||LA202_2==U_NOT||(LA202_2>=A_ELLIPSIS && LA202_2<=U_ELLIPSIS)||LA202_2==L_force||(LA202_2>=Constr && LA202_2<=Num)||(LA202_2>=String && LA202_2<=ROUND_BRACKET_OPEN)||LA202_2==SQUARE_BRACKET_OPEN||LA202_2==CURLY_BRACKET_OPEN||LA202_2==UNDERSCORE) ) {
                                        alt202=1;
                                    }


                                }


                                switch (alt202) {
                            	case 1 :
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:632:29: ( NL )? COMMA ( NL )? protected_expr
                            	    {
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:632:29: ( NL )?
                            	    int alt200=2;
                            	    int LA200_0 = input.LA(1);

                            	    if ( (LA200_0==NL) ) {
                            	        alt200=1;
                            	    }
                            	    switch (alt200) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:632:29: NL
                            	            {
                            	            NL420=(Token)match(input,NL,FOLLOW_NL_in_list_expr4195); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL420);


                            	            }
                            	            break;

                            	    }

                            	    COMMA421=(Token)match(input,COMMA,FOLLOW_COMMA_in_list_expr4198); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA421);

                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:632:39: ( NL )?
                            	    int alt201=2;
                            	    int LA201_0 = input.LA(1);

                            	    if ( (LA201_0==NL) ) {
                            	        alt201=1;
                            	    }
                            	    switch (alt201) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:632:39: NL
                            	            {
                            	            NL422=(Token)match(input,NL,FOLLOW_NL_in_list_expr4200); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL422);


                            	            }
                            	            break;

                            	    }

                            	    pushFollow(FOLLOW_protected_expr_in_list_expr4203);
                            	    protected_expr423=protected_expr();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr423.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop202;
                                }
                            } while (true);

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:632:60: ( NL )?
                            int alt203=2;
                            int LA203_0 = input.LA(1);

                            if ( (LA203_0==NL) ) {
                                alt203=1;
                            }
                            switch (alt203) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:632:60: NL
                                    {
                                    NL424=(Token)match(input,NL,FOLLOW_NL_in_list_expr4207); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL424);


                                    }
                                    break;

                            }

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:632:64: ( COMMA ( NL )? )?
                            int alt205=2;
                            int LA205_0 = input.LA(1);

                            if ( (LA205_0==COMMA) ) {
                                alt205=1;
                            }
                            switch (alt205) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:632:65: COMMA ( NL )?
                                    {
                                    COMMA425=(Token)match(input,COMMA,FOLLOW_COMMA_in_list_expr4211); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_COMMA.add(COMMA425);

                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:632:71: ( NL )?
                                    int alt204=2;
                                    int LA204_0 = input.LA(1);

                                    if ( (LA204_0==NL) ) {
                                        alt204=1;
                                    }
                                    switch (alt204) {
                                        case 1 :
                                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:632:71: NL
                                            {
                                            NL426=(Token)match(input,NL,FOLLOW_NL_in_list_expr4213); if (state.failed) return retval; 
                                            if ( state.backtracking==0 ) stream_NL.add(NL426);


                                            }
                                            break;

                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    char_literal427=(Token)match(input,ROUND_BRACKET_CLOSE,FOLLOW_ROUND_BRACKET_CLOSE_in_list_expr4220); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ROUND_BRACKET_CLOSE.add(char_literal427);



                    // AST REWRITE
                    // elements: COMMA, protected_expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 632:83: -> ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( protected_expr )* ) )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:632:86: ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( protected_expr )* ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ROUND_LIST, "ROUND_LIST"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:632:99: ^( NIL_TOKEN ( COMMA )* )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_2);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:632:111: ( COMMA )*
                        while ( stream_COMMA.hasNext() ) {
                            adaptor.addChild(root_2, stream_COMMA.nextNode());

                        }
                        stream_COMMA.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:632:119: ^( NIL_TOKEN ( protected_expr )* )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_2);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:632:131: ( protected_expr )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:634:1: map_or_set_expr : ( '{' ( NL )? ( map_or_set_elem_expr ( NL )? ( COMMA ( NL )? map_or_set_elem_expr ( NL )? )* )? '}' -> ^( MAP_OR_SET_OR_OBJ ( map_or_set_elem_expr )* ) | '{' ( NL )? token_ARROW ( NL )? '}' -> ^( EMPTY_MAP ) );
    public final babel17Parser.map_or_set_expr_return map_or_set_expr() throws RecognitionException {
        babel17Parser.map_or_set_expr_return retval = new babel17Parser.map_or_set_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal428=null;
        Token NL429=null;
        Token NL431=null;
        Token COMMA432=null;
        Token NL433=null;
        Token NL435=null;
        Token char_literal436=null;
        Token char_literal437=null;
        Token NL438=null;
        Token NL440=null;
        Token char_literal441=null;
        babel17Parser.map_or_set_elem_expr_return map_or_set_elem_expr430 = null;

        babel17Parser.map_or_set_elem_expr_return map_or_set_elem_expr434 = null;

        babel17Parser.token_ARROW_return token_ARROW439 = null;


        CommonTree char_literal428_tree=null;
        CommonTree NL429_tree=null;
        CommonTree NL431_tree=null;
        CommonTree COMMA432_tree=null;
        CommonTree NL433_tree=null;
        CommonTree NL435_tree=null;
        CommonTree char_literal436_tree=null;
        CommonTree char_literal437_tree=null;
        CommonTree NL438_tree=null;
        CommonTree NL440_tree=null;
        CommonTree char_literal441_tree=null;
        RewriteRuleTokenStream stream_CURLY_BRACKET_OPEN=new RewriteRuleTokenStream(adaptor,"token CURLY_BRACKET_OPEN");
        RewriteRuleTokenStream stream_CURLY_BRACKET_CLOSE=new RewriteRuleTokenStream(adaptor,"token CURLY_BRACKET_CLOSE");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_map_or_set_elem_expr=new RewriteRuleSubtreeStream(adaptor,"rule map_or_set_elem_expr");
        RewriteRuleSubtreeStream stream_token_ARROW=new RewriteRuleSubtreeStream(adaptor,"rule token_ARROW");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:635:2: ( '{' ( NL )? ( map_or_set_elem_expr ( NL )? ( COMMA ( NL )? map_or_set_elem_expr ( NL )? )* )? '}' -> ^( MAP_OR_SET_OR_OBJ ( map_or_set_elem_expr )* ) | '{' ( NL )? token_ARROW ( NL )? '}' -> ^( EMPTY_MAP ) )
            int alt216=2;
            int LA216_0 = input.LA(1);

            if ( (LA216_0==CURLY_BRACKET_OPEN) ) {
                switch ( input.LA(2) ) {
                case NL:
                    {
                    int LA216_2 = input.LA(3);

                    if ( (LA216_2==L_begin||(LA216_2>=L_obj && LA216_2<=L_if)||(LA216_2>=L_while && LA216_2<=L_for)||(LA216_2>=L_match && LA216_2<=L_case)||LA216_2==L_exception||(LA216_2>=A_infinity && LA216_2<=L_lazy)||(LA216_2>=L_true && LA216_2<=L_nil)||LA216_2==MINUS||LA216_2==A_NOT||LA216_2==U_NOT||(LA216_2>=A_ELLIPSIS && LA216_2<=U_ELLIPSIS)||LA216_2==L_force||(LA216_2>=Constr && LA216_2<=Num)||(LA216_2>=String && LA216_2<=ROUND_BRACKET_OPEN)||LA216_2==SQUARE_BRACKET_OPEN||(LA216_2>=CURLY_BRACKET_OPEN && LA216_2<=UNDERSCORE)) ) {
                        alt216=1;
                    }
                    else if ( ((LA216_2>=A_ARROW && LA216_2<=U_ARROW)) ) {
                        alt216=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 216, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case A_ARROW:
                case U_ARROW:
                    {
                    alt216=2;
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
                case L_choose:
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
                case L_force:
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
                    alt216=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 216, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 216, 0, input);

                throw nvae;
            }
            switch (alt216) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:635:4: '{' ( NL )? ( map_or_set_elem_expr ( NL )? ( COMMA ( NL )? map_or_set_elem_expr ( NL )? )* )? '}'
                    {
                    char_literal428=(Token)match(input,CURLY_BRACKET_OPEN,FOLLOW_CURLY_BRACKET_OPEN_in_map_or_set_expr4249); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_OPEN.add(char_literal428);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:635:8: ( NL )?
                    int alt208=2;
                    int LA208_0 = input.LA(1);

                    if ( (LA208_0==NL) ) {
                        alt208=1;
                    }
                    switch (alt208) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:635:8: NL
                            {
                            NL429=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_expr4251); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL429);


                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:635:12: ( map_or_set_elem_expr ( NL )? ( COMMA ( NL )? map_or_set_elem_expr ( NL )? )* )?
                    int alt213=2;
                    int LA213_0 = input.LA(1);

                    if ( (LA213_0==L_begin||(LA213_0>=L_obj && LA213_0<=L_if)||(LA213_0>=L_while && LA213_0<=L_for)||(LA213_0>=L_match && LA213_0<=L_case)||LA213_0==L_exception||(LA213_0>=A_infinity && LA213_0<=L_lazy)||(LA213_0>=L_true && LA213_0<=L_nil)||LA213_0==MINUS||LA213_0==A_NOT||LA213_0==U_NOT||(LA213_0>=A_ELLIPSIS && LA213_0<=U_ELLIPSIS)||LA213_0==L_force||(LA213_0>=Constr && LA213_0<=Num)||(LA213_0>=String && LA213_0<=ROUND_BRACKET_OPEN)||LA213_0==SQUARE_BRACKET_OPEN||LA213_0==CURLY_BRACKET_OPEN||LA213_0==UNDERSCORE) ) {
                        alt213=1;
                    }
                    switch (alt213) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:635:13: map_or_set_elem_expr ( NL )? ( COMMA ( NL )? map_or_set_elem_expr ( NL )? )*
                            {
                            pushFollow(FOLLOW_map_or_set_elem_expr_in_map_or_set_expr4255);
                            map_or_set_elem_expr430=map_or_set_elem_expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_map_or_set_elem_expr.add(map_or_set_elem_expr430.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:635:34: ( NL )?
                            int alt209=2;
                            int LA209_0 = input.LA(1);

                            if ( (LA209_0==NL) ) {
                                alt209=1;
                            }
                            switch (alt209) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:635:34: NL
                                    {
                                    NL431=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_expr4257); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL431);


                                    }
                                    break;

                            }

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:635:38: ( COMMA ( NL )? map_or_set_elem_expr ( NL )? )*
                            loop212:
                            do {
                                int alt212=2;
                                int LA212_0 = input.LA(1);

                                if ( (LA212_0==COMMA) ) {
                                    alt212=1;
                                }


                                switch (alt212) {
                            	case 1 :
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:635:39: COMMA ( NL )? map_or_set_elem_expr ( NL )?
                            	    {
                            	    COMMA432=(Token)match(input,COMMA,FOLLOW_COMMA_in_map_or_set_expr4261); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA432);

                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:635:45: ( NL )?
                            	    int alt210=2;
                            	    int LA210_0 = input.LA(1);

                            	    if ( (LA210_0==NL) ) {
                            	        alt210=1;
                            	    }
                            	    switch (alt210) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:635:45: NL
                            	            {
                            	            NL433=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_expr4263); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL433);


                            	            }
                            	            break;

                            	    }

                            	    pushFollow(FOLLOW_map_or_set_elem_expr_in_map_or_set_expr4266);
                            	    map_or_set_elem_expr434=map_or_set_elem_expr();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_map_or_set_elem_expr.add(map_or_set_elem_expr434.getTree());
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:635:70: ( NL )?
                            	    int alt211=2;
                            	    int LA211_0 = input.LA(1);

                            	    if ( (LA211_0==NL) ) {
                            	        alt211=1;
                            	    }
                            	    switch (alt211) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:635:70: NL
                            	            {
                            	            NL435=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_expr4268); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL435);


                            	            }
                            	            break;

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop212;
                                }
                            } while (true);


                            }
                            break;

                    }

                    char_literal436=(Token)match(input,CURLY_BRACKET_CLOSE,FOLLOW_CURLY_BRACKET_CLOSE_in_map_or_set_expr4275); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_CLOSE.add(char_literal436);



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
                    // 635:82: -> ^( MAP_OR_SET_OR_OBJ ( map_or_set_elem_expr )* )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:635:85: ^( MAP_OR_SET_OR_OBJ ( map_or_set_elem_expr )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MAP_OR_SET_OR_OBJ, "MAP_OR_SET_OR_OBJ"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:635:105: ( map_or_set_elem_expr )*
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:636:10: '{' ( NL )? token_ARROW ( NL )? '}'
                    {
                    char_literal437=(Token)match(input,CURLY_BRACKET_OPEN,FOLLOW_CURLY_BRACKET_OPEN_in_map_or_set_expr4295); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_OPEN.add(char_literal437);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:636:14: ( NL )?
                    int alt214=2;
                    int LA214_0 = input.LA(1);

                    if ( (LA214_0==NL) ) {
                        alt214=1;
                    }
                    switch (alt214) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:636:14: NL
                            {
                            NL438=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_expr4297); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL438);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_token_ARROW_in_map_or_set_expr4300);
                    token_ARROW439=token_ARROW();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_token_ARROW.add(token_ARROW439.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:636:30: ( NL )?
                    int alt215=2;
                    int LA215_0 = input.LA(1);

                    if ( (LA215_0==NL) ) {
                        alt215=1;
                    }
                    switch (alt215) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:636:30: NL
                            {
                            NL440=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_expr4302); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL440);


                            }
                            break;

                    }

                    char_literal441=(Token)match(input,CURLY_BRACKET_CLOSE,FOLLOW_CURLY_BRACKET_CLOSE_in_map_or_set_expr4305); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_CLOSE.add(char_literal441);



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
                    // 636:38: -> ^( EMPTY_MAP )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:636:41: ^( EMPTY_MAP )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:638:1: map_or_set_elem_expr : protected_expr ( ( NL )? arrow_or_assign ( NL )? protected_expr )? -> ^( NIL_TOKEN ^( NIL_TOKEN ( protected_expr )* ) ( arrow_or_assign )* ) ;
    public final babel17Parser.map_or_set_elem_expr_return map_or_set_elem_expr() throws RecognitionException {
        babel17Parser.map_or_set_elem_expr_return retval = new babel17Parser.map_or_set_elem_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL443=null;
        Token NL445=null;
        babel17Parser.protected_expr_return protected_expr442 = null;

        babel17Parser.arrow_or_assign_return arrow_or_assign444 = null;

        babel17Parser.protected_expr_return protected_expr446 = null;


        CommonTree NL443_tree=null;
        CommonTree NL445_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_protected_expr=new RewriteRuleSubtreeStream(adaptor,"rule protected_expr");
        RewriteRuleSubtreeStream stream_arrow_or_assign=new RewriteRuleSubtreeStream(adaptor,"rule arrow_or_assign");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:639:2: ( protected_expr ( ( NL )? arrow_or_assign ( NL )? protected_expr )? -> ^( NIL_TOKEN ^( NIL_TOKEN ( protected_expr )* ) ( arrow_or_assign )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:639:4: protected_expr ( ( NL )? arrow_or_assign ( NL )? protected_expr )?
            {
            pushFollow(FOLLOW_protected_expr_in_map_or_set_elem_expr4322);
            protected_expr442=protected_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr442.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:639:19: ( ( NL )? arrow_or_assign ( NL )? protected_expr )?
            int alt219=2;
            int LA219_0 = input.LA(1);

            if ( (LA219_0==NL) ) {
                int LA219_1 = input.LA(2);

                if ( (LA219_1==ASSIGN||(LA219_1>=A_ARROW && LA219_1<=U_ARROW)) ) {
                    alt219=1;
                }
            }
            else if ( (LA219_0==ASSIGN||(LA219_0>=A_ARROW && LA219_0<=U_ARROW)) ) {
                alt219=1;
            }
            switch (alt219) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:639:20: ( NL )? arrow_or_assign ( NL )? protected_expr
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:639:20: ( NL )?
                    int alt217=2;
                    int LA217_0 = input.LA(1);

                    if ( (LA217_0==NL) ) {
                        alt217=1;
                    }
                    switch (alt217) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:639:20: NL
                            {
                            NL443=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_elem_expr4325); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL443);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_arrow_or_assign_in_map_or_set_elem_expr4328);
                    arrow_or_assign444=arrow_or_assign();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_arrow_or_assign.add(arrow_or_assign444.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:639:40: ( NL )?
                    int alt218=2;
                    int LA218_0 = input.LA(1);

                    if ( (LA218_0==NL) ) {
                        alt218=1;
                    }
                    switch (alt218) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:639:40: NL
                            {
                            NL445=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_elem_expr4330); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL445);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_protected_expr_in_map_or_set_elem_expr4333);
                    protected_expr446=protected_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr446.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: protected_expr, arrow_or_assign
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 639:61: -> ^( NIL_TOKEN ^( NIL_TOKEN ( protected_expr )* ) ( arrow_or_assign )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:639:64: ^( NIL_TOKEN ^( NIL_TOKEN ( protected_expr )* ) ( arrow_or_assign )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:639:76: ^( NIL_TOKEN ( protected_expr )* )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_2);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:639:88: ( protected_expr )*
                while ( stream_protected_expr.hasNext() ) {
                    adaptor.addChild(root_2, stream_protected_expr.nextTree());

                }
                stream_protected_expr.reset();

                adaptor.addChild(root_1, root_2);
                }
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:639:105: ( arrow_or_assign )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:641:1: primitive_expr : ( Num | String | Id | Constr | L_true | L_false | L_this | L_nil | token_infinity | list_expr | with_control_expr | map_or_set_expr );
    public final babel17Parser.primitive_expr_return primitive_expr() throws RecognitionException {
        babel17Parser.primitive_expr_return retval = new babel17Parser.primitive_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Num447=null;
        Token String448=null;
        Token Id449=null;
        Token Constr450=null;
        Token L_true451=null;
        Token L_false452=null;
        Token L_this453=null;
        Token L_nil454=null;
        babel17Parser.token_infinity_return token_infinity455 = null;

        babel17Parser.list_expr_return list_expr456 = null;

        babel17Parser.with_control_expr_return with_control_expr457 = null;

        babel17Parser.map_or_set_expr_return map_or_set_expr458 = null;


        CommonTree Num447_tree=null;
        CommonTree String448_tree=null;
        CommonTree Id449_tree=null;
        CommonTree Constr450_tree=null;
        CommonTree L_true451_tree=null;
        CommonTree L_false452_tree=null;
        CommonTree L_this453_tree=null;
        CommonTree L_nil454_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:642:2: ( Num | String | Id | Constr | L_true | L_false | L_this | L_nil | token_infinity | list_expr | with_control_expr | map_or_set_expr )
            int alt220=12;
            switch ( input.LA(1) ) {
            case Num:
                {
                alt220=1;
                }
                break;
            case String:
                {
                alt220=2;
                }
                break;
            case Id:
                {
                alt220=3;
                }
                break;
            case Constr:
                {
                alt220=4;
                }
                break;
            case L_true:
                {
                alt220=5;
                }
                break;
            case L_false:
                {
                alt220=6;
                }
                break;
            case L_this:
                {
                alt220=7;
                }
                break;
            case L_nil:
                {
                alt220=8;
                }
                break;
            case A_infinity:
            case U_infinity:
                {
                alt220=9;
                }
                break;
            case ROUND_BRACKET_OPEN:
            case SQUARE_BRACKET_OPEN:
                {
                alt220=10;
                }
                break;
            case L_begin:
            case L_with:
            case L_if:
            case L_while:
            case L_for:
            case L_match:
                {
                alt220=11;
                }
                break;
            case CURLY_BRACKET_OPEN:
                {
                alt220=12;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 220, 0, input);

                throw nvae;
            }

            switch (alt220) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:642:4: Num
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Num447=(Token)match(input,Num,FOLLOW_Num_in_primitive_expr4360); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Num447_tree = (CommonTree)adaptor.create(Num447);
                    adaptor.addChild(root_0, Num447_tree);
                    }

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:643:4: String
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    String448=(Token)match(input,String,FOLLOW_String_in_primitive_expr4365); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    String448_tree = (CommonTree)adaptor.create(String448);
                    adaptor.addChild(root_0, String448_tree);
                    }

                    }
                    break;
                case 3 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:644:4: Id
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Id449=(Token)match(input,Id,FOLLOW_Id_in_primitive_expr4370); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Id449_tree = (CommonTree)adaptor.create(Id449);
                    adaptor.addChild(root_0, Id449_tree);
                    }

                    }
                    break;
                case 4 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:645:4: Constr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Constr450=(Token)match(input,Constr,FOLLOW_Constr_in_primitive_expr4375); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Constr450_tree = (CommonTree)adaptor.create(Constr450);
                    adaptor.addChild(root_0, Constr450_tree);
                    }

                    }
                    break;
                case 5 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:646:4: L_true
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    L_true451=(Token)match(input,L_true,FOLLOW_L_true_in_primitive_expr4380); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    L_true451_tree = (CommonTree)adaptor.create(L_true451);
                    adaptor.addChild(root_0, L_true451_tree);
                    }

                    }
                    break;
                case 6 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:647:4: L_false
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    L_false452=(Token)match(input,L_false,FOLLOW_L_false_in_primitive_expr4385); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    L_false452_tree = (CommonTree)adaptor.create(L_false452);
                    adaptor.addChild(root_0, L_false452_tree);
                    }

                    }
                    break;
                case 7 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:648:4: L_this
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    L_this453=(Token)match(input,L_this,FOLLOW_L_this_in_primitive_expr4390); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    L_this453_tree = (CommonTree)adaptor.create(L_this453);
                    adaptor.addChild(root_0, L_this453_tree);
                    }

                    }
                    break;
                case 8 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:649:4: L_nil
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    L_nil454=(Token)match(input,L_nil,FOLLOW_L_nil_in_primitive_expr4396); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    L_nil454_tree = (CommonTree)adaptor.create(L_nil454);
                    adaptor.addChild(root_0, L_nil454_tree);
                    }

                    }
                    break;
                case 9 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:650:4: token_infinity
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_infinity_in_primitive_expr4401);
                    token_infinity455=token_infinity();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, token_infinity455.getTree());

                    }
                    break;
                case 10 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:651:5: list_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_list_expr_in_primitive_expr4407);
                    list_expr456=list_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, list_expr456.getTree());

                    }
                    break;
                case 11 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:652:4: with_control_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_with_control_expr_in_primitive_expr4412);
                    with_control_expr457=with_control_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, with_control_expr457.getTree());

                    }
                    break;
                case 12 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:653:4: map_or_set_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_map_or_set_expr_in_primitive_expr4417);
                    map_or_set_expr458=map_or_set_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, map_or_set_expr458.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:655:1: prog : block EOF -> ^( PROG block ) ;
    public final babel17Parser.prog_return prog() throws RecognitionException {
        babel17Parser.prog_return retval = new babel17Parser.prog_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EOF460=null;
        babel17Parser.block_return block459 = null;


        CommonTree EOF460_tree=null;
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:655:7: ( block EOF -> ^( PROG block ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:655:9: block EOF
            {
            pushFollow(FOLLOW_block_in_prog4427);
            block459=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block459.getTree());
            EOF460=(Token)match(input,EOF,FOLLOW_EOF_in_prog4429); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EOF.add(EOF460);



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
            // 655:19: -> ^( PROG block )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:655:22: ^( PROG block )
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
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:350:10: ( Id ( NL )? L_as )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:350:11: Id ( NL )? L_as
        {
        match(input,Id,FOLLOW_Id_in_synpred1_babel171571); if (state.failed) return ;
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:350:14: ( NL )?
        int alt221=2;
        int LA221_0 = input.LA(1);

        if ( (LA221_0==NL) ) {
            alt221=1;
        }
        switch (alt221) {
            case 1 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:350:14: NL
                {
                match(input,NL,FOLLOW_NL_in_synpred1_babel171573); if (state.failed) return ;

                }
                break;

        }

        match(input,L_as,FOLLOW_L_as_in_synpred1_babel171576); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_babel17

    // $ANTLR start synpred2_babel17
    public final void synpred2_babel17_fragment() throws RecognitionException {   
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:351:4: ( protected_expr ( NL )? QUESTION_MARK )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:351:5: protected_expr ( NL )? QUESTION_MARK
        {
        pushFollow(FOLLOW_protected_expr_in_synpred2_babel171607);
        protected_expr();

        state._fsp--;
        if (state.failed) return ;
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:351:20: ( NL )?
        int alt222=2;
        int LA222_0 = input.LA(1);

        if ( (LA222_0==NL) ) {
            alt222=1;
        }
        switch (alt222) {
            case 1 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:351:20: NL
                {
                match(input,NL,FOLLOW_NL_in_synpred2_babel171609); if (state.failed) return ;

                }
                break;

        }

        match(input,QUESTION_MARK,FOLLOW_QUESTION_MARK_in_synpred2_babel171612); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_babel17

    // $ANTLR start synpred3_babel17
    public final void synpred3_babel17_fragment() throws RecognitionException {   
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:420:4: ( ( pattern | objelem_assign ) ( NL )? '=' )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:420:5: ( pattern | objelem_assign ) ( NL )? '='
        {
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:420:5: ( pattern | objelem_assign )
        int alt223=2;
        int LA223_0 = input.LA(1);

        if ( (LA223_0==L_exception||(LA223_0>=A_infinity && LA223_0<=U_infinity)||(LA223_0>=L_true && LA223_0<=L_false)||LA223_0==L_nil||LA223_0==MINUS||(LA223_0>=A_ELLIPSIS && LA223_0<=U_ELLIPSIS)||LA223_0==Constr||LA223_0==Num||(LA223_0>=String && LA223_0<=ROUND_BRACKET_OPEN)||LA223_0==SQUARE_BRACKET_OPEN||LA223_0==CURLY_BRACKET_OPEN||LA223_0==UNDERSCORE) ) {
            alt223=1;
        }
        else if ( (LA223_0==Id) ) {
            int LA223_2 = input.LA(2);

            if ( (LA223_2==PERIOD) ) {
                alt223=2;
            }
            else if ( (LA223_2==ASSIGN||(LA223_2>=A_DOUBLE_COLON && LA223_2<=U_DOUBLE_COLON)||LA223_2==NL) ) {
                alt223=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 223, 2, input);

                throw nvae;
            }
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 223, 0, input);

            throw nvae;
        }
        switch (alt223) {
            case 1 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:420:6: pattern
                {
                pushFollow(FOLLOW_pattern_in_synpred3_babel172368);
                pattern();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:420:16: objelem_assign
                {
                pushFollow(FOLLOW_objelem_assign_in_synpred3_babel172372);
                objelem_assign();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:420:32: ( NL )?
        int alt224=2;
        int LA224_0 = input.LA(1);

        if ( (LA224_0==NL) ) {
            alt224=1;
        }
        switch (alt224) {
            case 1 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:420:32: NL
                {
                match(input,NL,FOLLOW_NL_in_synpred3_babel172375); if (state.failed) return ;

                }
                break;

        }

        match(input,ASSIGN,FOLLOW_ASSIGN_in_synpred3_babel172378); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_babel17

    // $ANTLR start synpred4_babel17
    public final void synpred4_babel17_fragment() throws RecognitionException {   
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:452:11: ( L_obj ( NL )? parents )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:452:12: L_obj ( NL )? parents
        {
        match(input,L_obj,FOLLOW_L_obj_in_synpred4_babel172592); if (state.failed) return ;
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:452:18: ( NL )?
        int alt225=2;
        int LA225_0 = input.LA(1);

        if ( (LA225_0==NL) ) {
            alt225=1;
        }
        switch (alt225) {
            case 1 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:452:18: NL
                {
                match(input,NL,FOLLOW_NL_in_synpred4_babel172594); if (state.failed) return ;

                }
                break;

        }

        pushFollow(FOLLOW_parents_in_synpred4_babel172597);
        parents();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_babel17

    // $ANTLR start synpred5_babel17
    public final void synpred5_babel17_fragment() throws RecognitionException {   
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:456:4: ( lambda_expr )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:456:5: lambda_expr
        {
        pushFollow(FOLLOW_lambda_expr_in_synpred5_babel172666);
        lambda_expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_babel17

    // $ANTLR start synpred6_babel17
    public final void synpred6_babel17_fragment() throws RecognitionException {   
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:460:4: ( protected_lambda_expr )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:460:5: protected_lambda_expr
        {
        pushFollow(FOLLOW_protected_lambda_expr_in_synpred6_babel172687);
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
    protected DFA78 dfa78 = new DFA78(this);
    protected DFA79 dfa79 = new DFA79(this);
    static final String DFA16_eotS =
        "\36\uffff";
    static final String DFA16_eofS =
        "\36\uffff";
    static final String DFA16_minS =
        "\1\60\17\0\16\uffff";
    static final String DFA16_maxS =
        "\1\u0086\17\0\16\uffff";
    static final String DFA16_acceptS =
        "\20\uffff\13\2\1\4\1\1\1\3";
    static final String DFA16_specialS =
        "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1"+
        "\16\1\17\16\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\30\1\uffff\1\32\1\31\1\24\3\uffff\1\25\1\27\2\uffff\1\26"+
            "\1\20\1\uffff\1\33\2\uffff\1\16\2\uffff\2\11\3\21\1\uffff\1"+
            "\6\1\7\1\23\1\21\1\10\16\uffff\1\12\5\uffff\1\22\2\uffff\1\22"+
            "\12\uffff\2\17\3\uffff\1\21\3\uffff\1\2\1\1\1\5\1\uffff\1\4"+
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
            return "349:1: bracket_pattern : ( ( Id ( NL )? L_as )=> Id ( NL )? L_as ( NL )? pattern -> ^( L_as Id pattern ) | ( protected_expr ( NL )? QUESTION_MARK )=> protected_expr ( NL )? QUESTION_MARK ( ( NL )? pattern )? -> ^( QUESTION_MARK protected_expr ( pattern )? ) | pattern ( ( NL )? L_if ( NL )? protected_expr )? -> ^( IF_PATTERN pattern ( protected_expr )? ) | L_val ( NL )? protected_expr -> ^( L_val protected_expr ) );";
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

                        else if ( ((LA16_0>=L_concurrent && LA16_0<=L_lazy)||LA16_0==L_random||LA16_0==L_force) && (synpred2_babel17())) {s = 17;}

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
        "\1\105\10\uffff\1\105\2\uffff\1\60\1\105\2\uffff\1\60\2\uffff";
    static final String DFA45_maxS =
        "\1\u0086\10\uffff\1\175\2\uffff\1\u0086\1\175\2\uffff\1\u0086\2"+
        "\uffff";
    static final String DFA45_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\uffff\1\13\1\14\2\uffff"+
        "\1\11\1\12\1\uffff\1\16\1\15";
    static final String DFA45_specialS =
        "\23\uffff}>";
    static final String[] DFA45_transitionS = {
            "\2\10\4\uffff\1\5\1\6\2\uffff\1\7\16\uffff\1\11\35\uffff\1\1"+
            "\1\4\1\uffff\1\3\1\13\1\uffff\1\12\1\uffff\1\14\1\uffff\1\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\16\63\uffff\1\15\2\uffff\1\17",
            "",
            "",
            "\1\22\1\uffff\3\22\3\uffff\2\22\2\uffff\2\22\1\uffff\1\22\2"+
            "\uffff\1\22\2\uffff\5\22\1\uffff\5\22\16\uffff\1\22\5\uffff"+
            "\1\22\2\uffff\1\22\10\uffff\2\21\2\22\3\uffff\1\22\2\uffff\1"+
            "\20\3\22\1\uffff\2\22\1\uffff\1\22\1\uffff\3\22",
            "\2\16\66\uffff\1\17",
            "",
            "",
            "\1\22\1\uffff\3\22\3\uffff\2\22\2\uffff\2\22\1\uffff\1\22\2"+
            "\uffff\1\22\2\uffff\5\22\1\uffff\5\22\16\uffff\1\22\5\uffff"+
            "\1\22\2\uffff\1\22\10\uffff\2\21\2\22\3\uffff\1\22\3\uffff\3"+
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
            return "364:1: primitive_pattern : ( Id | '_' -> ANY | String | Num | L_true | L_false | L_nil | token_infinity | '-' ( NL )? token_infinity -> ^( UMINUS token_infinity ) | '-' ( NL )? Num -> ^( UMINUS Num ) | '[' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* )? ']' -> ^( SQUARE_LIST ( bracket_pattern )* ) | '(' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* ( COMMA ( NL )? )? )? ')' -> ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( bracket_pattern )* ) ) | '{' ( NL )? ( mselem_pattern ( NL )? ( COMMA ( NL )? mselem_pattern ( NL )? )* )? '}' -> ^( MAP_OR_SET_OR_OBJ ( mselem_pattern )* ) | '{' ( NL )? token_ARROW ( NL )? '}' -> ^( EMPTY_MAP ) );";
        }
    }
    static final String DFA51_eotS =
        "\4\uffff";
    static final String DFA51_eofS =
        "\2\3\2\uffff";
    static final String DFA51_minS =
        "\2\60\2\uffff";
    static final String DFA51_maxS =
        "\2\u0086\2\uffff";
    static final String DFA51_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA51_specialS =
        "\4\uffff}>";
    static final String[] DFA51_transitionS = {
            "\1\2\1\3\3\2\1\uffff\2\3\2\2\1\uffff\2\2\1\3\1\uffff\2\2\1\uffff"+
            "\1\2\2\uffff\13\2\14\uffff\1\1\1\uffff\1\2\5\uffff\1\2\2\uffff"+
            "\1\2\12\uffff\2\2\3\uffff\1\2\2\uffff\1\1\3\2\1\uffff\2\2\1"+
            "\uffff\1\2\1\uffff\1\2\1\uffff\1\2",
            "\1\2\1\3\3\2\1\uffff\2\3\2\2\1\uffff\2\2\1\3\1\uffff\2\2\1"+
            "\uffff\1\2\2\uffff\13\2\14\uffff\1\1\1\uffff\1\2\5\uffff\1\2"+
            "\2\uffff\1\2\12\uffff\2\2\3\uffff\1\2\2\uffff\1\1\3\2\1\uffff"+
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
            return "388:1: block : ( ( sep )? statement ( sep statement )* ( sep )? -> ^( BLOCK ( statement )* ) | ( sep )? -> ^( BLOCK ) );";
        }
    }
    static final String DFA48_eotS =
        "\4\uffff";
    static final String DFA48_eofS =
        "\2\2\2\uffff";
    static final String DFA48_minS =
        "\1\61\1\60\2\uffff";
    static final String DFA48_maxS =
        "\1\172\1\u0086\2\uffff";
    static final String DFA48_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA48_specialS =
        "\4\uffff}>";
    static final String[] DFA48_transitionS = {
            "\1\2\4\uffff\2\2\5\uffff\1\2\36\uffff\1\1\35\uffff\1\1",
            "\1\3\1\2\3\3\1\uffff\2\2\2\3\1\uffff\2\3\1\2\1\uffff\2\3\1"+
            "\uffff\1\3\2\uffff\13\3\14\uffff\1\1\1\uffff\1\3\5\uffff\1\3"+
            "\2\uffff\1\3\12\uffff\2\3\3\uffff\1\3\2\uffff\1\1\3\3\1\uffff"+
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
            return "()* loopback of 388:25: ( sep statement )*";
        }
    }
    static final String DFA68_eotS =
        "\33\uffff";
    static final String DFA68_eofS =
        "\33\uffff";
    static final String DFA68_minS =
        "\1\60\17\0\13\uffff";
    static final String DFA68_maxS =
        "\1\u0086\17\0\13\uffff";
    static final String DFA68_acceptS =
        "\20\uffff\1\2\11\uffff\1\1";
    static final String DFA68_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\13\uffff}>";
    static final String[] DFA68_transitionS = {
            "\1\20\1\uffff\3\20\3\uffff\2\20\2\uffff\1\20\5\uffff\1\16\2"+
            "\uffff\2\11\3\20\1\uffff\1\6\1\7\2\20\1\10\16\uffff\1\12\5\uffff"+
            "\1\20\2\uffff\1\20\12\uffff\2\17\3\uffff\1\20\3\uffff\1\1\1"+
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
            return "419:1: expr_or_assign : ( ( ( pattern | objelem_assign ) ( NL )? '=' )=> ( pattern | objelem_assign ) ( NL )? '=' ( NL )? expr -> ^( ASSIGN ( pattern )* ( objelem_assign )* expr ) | expr );";
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
    static final String DFA78_eotS =
        "\31\uffff";
    static final String DFA78_eofS =
        "\31\uffff";
    static final String DFA78_minS =
        "\1\60\2\0\1\uffff\13\0\12\uffff";
    static final String DFA78_maxS =
        "\1\u0086\2\0\1\uffff\13\0\12\uffff";
    static final String DFA78_acceptS =
        "\3\uffff\1\1\13\uffff\1\1\1\2\10\uffff";
    static final String DFA78_specialS =
        "\1\0\1\1\1\2\1\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\12\uffff}>";
    static final String[] DFA78_transitionS = {
            "\1\20\2\uffff\2\20\3\uffff\2\20\2\uffff\1\20\5\uffff\1\16\2"+
            "\uffff\2\11\3\20\1\uffff\1\6\1\7\2\20\1\10\16\uffff\1\12\5\uffff"+
            "\1\20\2\uffff\1\20\12\uffff\2\17\3\uffff\1\20\3\uffff\1\1\1"+
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
            return "455:1: lop_expr : ( ( lambda_expr )=> lambda_expr | op_expr );";
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

                        else if ( (LA78_0==L_nil) ) {s = 8;}

                        else if ( ((LA78_0>=A_infinity && LA78_0<=U_infinity)) ) {s = 9;}

                        else if ( (LA78_0==MINUS) ) {s = 10;}

                        else if ( (LA78_0==SQUARE_BRACKET_OPEN) ) {s = 11;}

                        else if ( (LA78_0==ROUND_BRACKET_OPEN) ) {s = 12;}

                        else if ( (LA78_0==CURLY_BRACKET_OPEN) ) {s = 13;}

                        else if ( (LA78_0==L_exception) ) {s = 14;}

                        else if ( ((LA78_0>=A_ELLIPSIS && LA78_0<=U_ELLIPSIS)) && (synpred5_babel17())) {s = 15;}

                        else if ( (LA78_0==L_begin||(LA78_0>=L_with && LA78_0<=L_if)||(LA78_0>=L_while && LA78_0<=L_for)||LA78_0==L_match||(LA78_0>=L_concurrent && LA78_0<=L_lazy)||(LA78_0>=L_this && LA78_0<=L_random)||LA78_0==A_NOT||LA78_0==U_NOT||LA78_0==L_force) ) {s = 16;}

                         
                        input.seek(index78_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA78_1 = input.LA(1);

                         
                        int index78_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index78_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA78_2 = input.LA(1);

                         
                        int index78_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index78_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA78_4 = input.LA(1);

                         
                        int index78_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index78_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA78_5 = input.LA(1);

                         
                        int index78_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index78_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA78_6 = input.LA(1);

                         
                        int index78_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index78_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA78_7 = input.LA(1);

                         
                        int index78_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index78_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA78_8 = input.LA(1);

                         
                        int index78_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index78_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA78_9 = input.LA(1);

                         
                        int index78_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index78_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA78_10 = input.LA(1);

                         
                        int index78_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index78_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA78_11 = input.LA(1);

                         
                        int index78_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index78_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA78_12 = input.LA(1);

                         
                        int index78_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index78_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA78_13 = input.LA(1);

                         
                        int index78_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index78_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA78_14 = input.LA(1);

                         
                        int index78_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index78_14);
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
        "\32\uffff";
    static final String DFA79_eofS =
        "\32\uffff";
    static final String DFA79_minS =
        "\1\60\2\0\1\uffff\13\0\13\uffff";
    static final String DFA79_maxS =
        "\1\u0086\2\0\1\uffff\13\0\13\uffff";
    static final String DFA79_acceptS =
        "\3\uffff\1\1\13\uffff\2\1\1\2\10\uffff";
    static final String DFA79_specialS =
        "\1\0\1\1\1\2\1\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\13\uffff}>";
    static final String[] DFA79_transitionS = {
            "\1\21\2\uffff\2\21\3\uffff\2\21\2\uffff\1\21\1\20\4\uffff\1"+
            "\16\2\uffff\2\11\3\21\1\uffff\1\6\1\7\2\21\1\10\16\uffff\1\12"+
            "\5\uffff\1\21\2\uffff\1\21\12\uffff\2\17\3\uffff\1\21\3\uffff"+
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
            return "459:1: p_lop_expr : ( ( protected_lambda_expr )=> protected_lambda_expr | p_op_expr );";
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

                        else if ( (LA79_0==L_nil) ) {s = 8;}

                        else if ( ((LA79_0>=A_infinity && LA79_0<=U_infinity)) ) {s = 9;}

                        else if ( (LA79_0==MINUS) ) {s = 10;}

                        else if ( (LA79_0==SQUARE_BRACKET_OPEN) ) {s = 11;}

                        else if ( (LA79_0==ROUND_BRACKET_OPEN) ) {s = 12;}

                        else if ( (LA79_0==CURLY_BRACKET_OPEN) ) {s = 13;}

                        else if ( (LA79_0==L_exception) ) {s = 14;}

                        else if ( ((LA79_0>=A_ELLIPSIS && LA79_0<=U_ELLIPSIS)) && (synpred6_babel17())) {s = 15;}

                        else if ( (LA79_0==L_case) && (synpred6_babel17())) {s = 16;}

                        else if ( (LA79_0==L_begin||(LA79_0>=L_with && LA79_0<=L_if)||(LA79_0>=L_while && LA79_0<=L_for)||LA79_0==L_match||(LA79_0>=L_concurrent && LA79_0<=L_lazy)||(LA79_0>=L_this && LA79_0<=L_random)||LA79_0==A_NOT||LA79_0==U_NOT||LA79_0==L_force) ) {s = 17;}

                         
                        input.seek(index79_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA79_1 = input.LA(1);

                         
                        int index79_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_babel17()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index79_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA79_2 = input.LA(1);

                         
                        int index79_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_babel17()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index79_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA79_4 = input.LA(1);

                         
                        int index79_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_babel17()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index79_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA79_5 = input.LA(1);

                         
                        int index79_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_babel17()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index79_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA79_6 = input.LA(1);

                         
                        int index79_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_babel17()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index79_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA79_7 = input.LA(1);

                         
                        int index79_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_babel17()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index79_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA79_8 = input.LA(1);

                         
                        int index79_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_babel17()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index79_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA79_9 = input.LA(1);

                         
                        int index79_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_babel17()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index79_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA79_10 = input.LA(1);

                         
                        int index79_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_babel17()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index79_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA79_11 = input.LA(1);

                         
                        int index79_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_babel17()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index79_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA79_12 = input.LA(1);

                         
                        int index79_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_babel17()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index79_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA79_13 = input.LA(1);

                         
                        int index79_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_babel17()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index79_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA79_14 = input.LA(1);

                         
                        int index79_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_babel17()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
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
    public static final BitSet FOLLOW_Constr_in_pattern1487 = new BitSet(new long[]{0x0000000000000002L,0xB400000040009860L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_pattern1490 = new BitSet(new long[]{0x0000000000000000L,0xB400000040009860L,0x0000000000000055L});
    public static final BitSet FOLLOW_primitive_pattern_in_pattern1493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitive_pattern_in_pattern1509 = new BitSet(new long[]{0x0000000000000002L,0x0400030000000000L});
    public static final BitSet FOLLOW_NL_in_pattern1512 = new BitSet(new long[]{0x0000000000000000L,0x0400030000000000L});
    public static final BitSet FOLLOW_token_DOUBLE_COLON_in_pattern1515 = new BitSet(new long[]{0x0000000000000000L,0xB400000040009860L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_pattern1517 = new BitSet(new long[]{0x0000000000000000L,0xB400000040009860L,0x0000000000000055L});
    public static final BitSet FOLLOW_primitive_pattern_in_pattern1520 = new BitSet(new long[]{0x0000000000000002L,0x0400030000000000L});
    public static final BitSet FOLLOW_L_exception_in_pattern1539 = new BitSet(new long[]{0x0000000000000000L,0xB400000040009860L,0x0000000000000055L});
    public static final BitSet FOLLOW_primitive_pattern_in_pattern1541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_ELLIPSIS_in_pattern1554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Id_in_bracket_pattern1581 = new BitSet(new long[]{0x4000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1583 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_L_as_in_bracket_pattern1586 = new BitSet(new long[]{0x0000000000000000L,0xBC0C000040009864L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1588 = new BitSet(new long[]{0x0000000000000000L,0xBC0C000040009864L,0x0000000000000055L});
    public static final BitSet FOLLOW_pattern_in_bracket_pattern1591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protected_expr_in_bracket_pattern1620 = new BitSet(new long[]{0x0000000000000000L,0x0440000000000000L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1622 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_QUESTION_MARK_in_bracket_pattern1625 = new BitSet(new long[]{0x0000000000000002L,0xBC0C000040009864L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1628 = new BitSet(new long[]{0x0000000000000000L,0xBC0C000040009864L,0x0000000000000055L});
    public static final BitSet FOLLOW_pattern_in_bracket_pattern1631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_bracket_pattern1649 = new BitSet(new long[]{0x0010000000000002L,0x0400000000000000L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1652 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_L_if_in_bracket_pattern1655 = new BitSet(new long[]{0x331D000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1657 = new BitSet(new long[]{0x331D000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_protected_expr_in_bracket_pattern1660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_val_in_bracket_pattern1678 = new BitSet(new long[]{0x331D000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1680 = new BitSet(new long[]{0x331D000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_protected_expr_in_bracket_pattern1683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_ARROW_in_arrow_or_assign1701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGN_in_arrow_or_assign1712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracket_pattern_in_mselem_pattern1727 = new BitSet(new long[]{0x0000000100000002L,0x0403000000000000L});
    public static final BitSet FOLLOW_NL_in_mselem_pattern1730 = new BitSet(new long[]{0x0000000100000000L,0x0403000000000000L});
    public static final BitSet FOLLOW_arrow_or_assign_in_mselem_pattern1733 = new BitSet(new long[]{0xB31D000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_mselem_pattern1735 = new BitSet(new long[]{0xB31D000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_bracket_pattern_in_mselem_pattern1738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Id_in_primitive_pattern1767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNDERSCORE_in_primitive_pattern1772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_String_in_primitive_pattern1781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Num_in_primitive_pattern1786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_true_in_primitive_pattern1791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_false_in_primitive_pattern1796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_nil_in_primitive_pattern1801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_infinity_in_primitive_pattern1806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_primitive_pattern1811 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000060L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern1813 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_token_infinity_in_primitive_pattern1816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_primitive_pattern1829 = new BitSet(new long[]{0x0000000000000000L,0x2400000000000000L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern1831 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_Num_in_primitive_pattern1834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SQUARE_BRACKET_OPEN_in_primitive_pattern1847 = new BitSet(new long[]{0xB31D000000000000L,0xBC8C00904000FBE4L,0x000000000000005DL});
    public static final BitSet FOLLOW_NL_in_primitive_pattern1850 = new BitSet(new long[]{0xB31D000000000000L,0xBC8C00904000FBE4L,0x000000000000005DL});
    public static final BitSet FOLLOW_bracket_pattern_in_primitive_pattern1854 = new BitSet(new long[]{0x0000000000000000L,0x0420000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern1856 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_COMMA_in_primitive_pattern1861 = new BitSet(new long[]{0xB31D000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern1863 = new BitSet(new long[]{0xB31D000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_bracket_pattern_in_primitive_pattern1866 = new BitSet(new long[]{0x0000000000000000L,0x0420000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern1868 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SQUARE_BRACKET_CLOSE_in_primitive_pattern1876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROUND_BRACKET_OPEN_in_primitive_pattern1896 = new BitSet(new long[]{0xB31D000000000000L,0xBC8C00904000FBE4L,0x0000000000000057L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern1899 = new BitSet(new long[]{0xB31D000000000000L,0xBC8C00904000FBE4L,0x0000000000000057L});
    public static final BitSet FOLLOW_bracket_pattern_in_primitive_pattern1903 = new BitSet(new long[]{0x0000000000000000L,0x0420000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern1905 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_primitive_pattern1910 = new BitSet(new long[]{0xB31D000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern1913 = new BitSet(new long[]{0xB31D000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_bracket_pattern_in_primitive_pattern1916 = new BitSet(new long[]{0x0000000000000000L,0x0420000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern1918 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_primitive_pattern1924 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern1926 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_ROUND_BRACKET_CLOSE_in_primitive_pattern1933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURLY_BRACKET_OPEN_in_primitive_pattern1965 = new BitSet(new long[]{0xB31D000000000000L,0xBC8C00904000FBE4L,0x0000000000000075L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern1968 = new BitSet(new long[]{0xB31D000000000000L,0xBC8C00904000FBE4L,0x0000000000000075L});
    public static final BitSet FOLLOW_mselem_pattern_in_primitive_pattern1972 = new BitSet(new long[]{0x0000000000000000L,0x0420000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern1974 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_COMMA_in_primitive_pattern1979 = new BitSet(new long[]{0xB31D000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern1982 = new BitSet(new long[]{0xB31D000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_mselem_pattern_in_primitive_pattern1985 = new BitSet(new long[]{0x0000000000000000L,0x0420000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern1987 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_CURLY_BRACKET_CLOSE_in_primitive_pattern1995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURLY_BRACKET_OPEN_in_primitive_pattern2013 = new BitSet(new long[]{0x0000000000000000L,0x0403000000000000L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2015 = new BitSet(new long[]{0x0000000000000000L,0x0003000000000000L});
    public static final BitSet FOLLOW_token_ARROW_in_primitive_pattern2018 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2020 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_CURLY_BRACKET_CLOSE_in_primitive_pattern2023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_sep2045 = new BitSet(new long[]{0x0000000000000002L,0x0400000010000000L});
    public static final BitSet FOLLOW_sep_in_block2061 = new BitSet(new long[]{0xBB1D000000000000L,0xBC8C00904000FFE5L,0x0000000000000055L});
    public static final BitSet FOLLOW_statement_in_block2064 = new BitSet(new long[]{0x0000000000000002L,0x0400000010000000L});
    public static final BitSet FOLLOW_sep_in_block2067 = new BitSet(new long[]{0xBB1D000000000000L,0xBC8C00904000FFE5L,0x0000000000000055L});
    public static final BitSet FOLLOW_statement_in_block2069 = new BitSet(new long[]{0x0000000000000002L,0x0400000010000000L});
    public static final BitSet FOLLOW_sep_in_block2073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sep_in_block2089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_pure_block2106 = new BitSet(new long[]{0x0000000000000002L,0x0400000010000000L});
    public static final BitSet FOLLOW_sep_in_pure_block2109 = new BitSet(new long[]{0xBB1D000000000000L,0xBC8C00904000FFE5L,0x0000000000000055L});
    public static final BitSet FOLLOW_statement_in_pure_block2111 = new BitSet(new long[]{0x0000000000000002L,0x0400000010000000L});
    public static final BitSet FOLLOW_st_val_in_statement2132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_def_in_statement2137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_memoize_in_statement2142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_yield_in_statement2147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_or_assign_in_statement2152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Id_in_objelem_assign2161 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_PERIOD_in_objelem_assign2163 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_Id_in_objelem_assign2165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_val_in_st_val2184 = new BitSet(new long[]{0x0000000000000000L,0xBC0C000040009864L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_st_val2186 = new BitSet(new long[]{0x0000000000000000L,0xBC0C000040009864L,0x0000000000000055L});
    public static final BitSet FOLLOW_pattern_in_st_val2190 = new BitSet(new long[]{0x0000000100000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_objelem_assign_in_st_val2194 = new BitSet(new long[]{0x0000000100000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_NL_in_st_val2197 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ASSIGN_in_st_val2200 = new BitSet(new long[]{0xBB1D000000000000L,0xBC8C00904000FFE5L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_st_val2202 = new BitSet(new long[]{0xBB1D000000000000L,0xBC8C00904000FFE5L,0x0000000000000055L});
    public static final BitSet FOLLOW_expr_in_st_val2205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_def_in_st_def2229 = new BitSet(new long[]{0x0000000000000000L,0x1400000000000000L});
    public static final BitSet FOLLOW_NL_in_st_def2231 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_Id_in_st_def2234 = new BitSet(new long[]{0x0000000100000000L,0xB400000040009860L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_st_def2236 = new BitSet(new long[]{0x0000000100000000L,0xB400000040009860L,0x0000000000000055L});
    public static final BitSet FOLLOW_primitive_pattern_in_st_def2240 = new BitSet(new long[]{0x0000000100000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_NL_in_st_def2242 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ASSIGN_in_st_def2247 = new BitSet(new long[]{0xBB1D000000000000L,0xBC8C00904000FFE5L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_st_def2249 = new BitSet(new long[]{0xBB1D000000000000L,0xBC8C00904000FFE5L,0x0000000000000055L});
    public static final BitSet FOLLOW_expr_in_st_def2252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_yield_in_st_yield2281 = new BitSet(new long[]{0xBB1D000000000000L,0xBC8C00904000FFE5L,0x0000000000000055L});
    public static final BitSet FOLLOW_expr_in_st_yield2283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_memoize_in_st_memoize2301 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_memid_in_st_memoize2303 = new BitSet(new long[]{0x0000000000000002L,0x1000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_Id_in_memid2327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROUND_BRACKET_OPEN_in_memid2340 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_Id_in_memid2342 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_ROUND_BRACKET_CLOSE_in_memid2344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_expr_or_assign2384 = new BitSet(new long[]{0x0000000100000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_objelem_assign_in_expr_or_assign2388 = new BitSet(new long[]{0x0000000100000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_NL_in_expr_or_assign2391 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ASSIGN_in_expr_or_assign2394 = new BitSet(new long[]{0xBB1D000000000000L,0xBC8C00904000FFE5L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_expr_or_assign2396 = new BitSet(new long[]{0xBB1D000000000000L,0xBC8C00904000FFE5L,0x0000000000000055L});
    public static final BitSet FOLLOW_expr_in_expr_or_assign2399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_or_assign2418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lop_expr_in_expr2429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_obj_expr_in_expr2434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_expr_in_control_expr2444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_do_expr_in_control_expr2449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_match_expr_in_control_expr2454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_expr_in_control_expr2459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_begin_end_in_control_expr2464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_control_expr_in_with_control_expr2474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_with_in_with_control_expr2479 = new BitSet(new long[]{0x331D000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_with_control_expr2481 = new BitSet(new long[]{0x331D000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_protected_expr_in_with_control_expr2484 = new BitSet(new long[]{0x0400000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_NL_in_with_control_expr2486 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_L_do_in_with_control_expr2489 = new BitSet(new long[]{0xBB1F000000000000L,0xBC8C00905000FFE5L,0x0000000000000055L});
    public static final BitSet FOLLOW_block_in_with_control_expr2491 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_L_end_in_with_control_expr2493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_lop_expr_in_protected_expr2518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_obj_expr_in_protected_expr2523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_begin_in_begin_end2535 = new BitSet(new long[]{0xBB1F000000000000L,0xBC8C00905000FFE5L,0x0000000000000055L});
    public static final BitSet FOLLOW_block_in_begin_end2537 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_L_end_in_begin_end2539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_parents2557 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_primitive_expr_in_parents2559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIMES_in_parents2572 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_primitive_expr_in_parents2574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_obj_in_obj_expr2602 = new BitSet(new long[]{0x0000000000000000L,0x04000000A0000000L});
    public static final BitSet FOLLOW_NL_in_obj_expr2604 = new BitSet(new long[]{0x0000000000000000L,0x04000000A0000000L});
    public static final BitSet FOLLOW_parents_in_obj_expr2607 = new BitSet(new long[]{0xBB1F000000000000L,0xBC8C00905000FFE5L,0x0000000000000055L});
    public static final BitSet FOLLOW_block_in_obj_expr2609 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_L_end_in_obj_expr2611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_obj_in_obj_expr2639 = new BitSet(new long[]{0xBB1F000000000000L,0xBC8C00905000FFE5L,0x0000000000000055L});
    public static final BitSet FOLLOW_block_in_obj_expr2641 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_L_end_in_obj_expr2643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_expr_in_lop_expr2671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_op_expr_in_lop_expr2676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protected_lambda_expr_in_p_lop_expr2692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_op_expr_in_p_lop_expr2697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_if_in_if_expr2708 = new BitSet(new long[]{0x331D000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_if_expr2710 = new BitSet(new long[]{0x331D000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_protected_expr_in_if_expr2713 = new BitSet(new long[]{0x0020000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_NL_in_if_expr2715 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_L_then_in_if_expr2718 = new BitSet(new long[]{0xBBDF000000000000L,0xBC8C00905000FFE5L,0x0000000000000055L});
    public static final BitSet FOLLOW_block_in_if_expr2720 = new BitSet(new long[]{0x00C2000000000000L});
    public static final BitSet FOLLOW_L_elseif_in_if_expr2726 = new BitSet(new long[]{0x331D000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_if_expr2728 = new BitSet(new long[]{0x331D000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_protected_expr_in_if_expr2731 = new BitSet(new long[]{0x0020000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_NL_in_if_expr2733 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_L_then_in_if_expr2736 = new BitSet(new long[]{0xBBDF000000000000L,0xBC8C00905000FFE5L,0x0000000000000055L});
    public static final BitSet FOLLOW_block_in_if_expr2738 = new BitSet(new long[]{0x00C2000000000000L});
    public static final BitSet FOLLOW_L_else_in_if_expr2746 = new BitSet(new long[]{0xBB1F000000000000L,0xBC8C00905000FFE5L,0x0000000000000055L});
    public static final BitSet FOLLOW_block_in_if_expr2748 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_L_end_in_if_expr2752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_while_in_while_do_expr2776 = new BitSet(new long[]{0x331D000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_while_do_expr2778 = new BitSet(new long[]{0x331D000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_protected_expr_in_while_do_expr2781 = new BitSet(new long[]{0x0400000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_NL_in_while_do_expr2783 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_L_do_in_while_do_expr2786 = new BitSet(new long[]{0xBB1F000000000000L,0xBC8C00905000FFE5L,0x0000000000000055L});
    public static final BitSet FOLLOW_block_in_while_do_expr2788 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_L_end_in_while_do_expr2790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_full_cases_in_cases2820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_cases2825 = new BitSet(new long[]{0x0000000000000000L,0x0400C00000000000L});
    public static final BitSet FOLLOW_NL_in_cases2827 = new BitSet(new long[]{0x0000000000000000L,0x0400C00000000000L});
    public static final BitSet FOLLOW_token_DOUBLE_ARROW_in_cases2830 = new BitSet(new long[]{0xBB1D000000000000L,0xBC8C00905000FFE5L,0x0000000000000055L});
    public static final BitSet FOLLOW_block_in_cases2832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_case_expr_in_full_cases2855 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_L_case_in_case_expr2876 = new BitSet(new long[]{0x0000000000000000L,0xBC0C000040009864L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_case_expr2878 = new BitSet(new long[]{0x0000000000000000L,0xBC0C000040009864L,0x0000000000000055L});
    public static final BitSet FOLLOW_pattern_in_case_expr2881 = new BitSet(new long[]{0x0000000000000000L,0x0400C00000000000L});
    public static final BitSet FOLLOW_NL_in_case_expr2883 = new BitSet(new long[]{0x0000000000000000L,0x0400C00000000000L});
    public static final BitSet FOLLOW_token_DOUBLE_ARROW_in_case_expr2886 = new BitSet(new long[]{0xBB1D000000000000L,0xBC8C00905000FFE5L,0x0000000000000055L});
    public static final BitSet FOLLOW_block_in_case_expr2888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_match_in_match_expr2909 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_match_expr2911 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_p_op_expr_in_match_expr2914 = new BitSet(new long[]{0x2000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_NL_in_match_expr2916 = new BitSet(new long[]{0x2000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_full_cases_in_match_expr2919 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_L_end_in_match_expr2921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_cases_in_lambda_expr2947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_lambda_cases2965 = new BitSet(new long[]{0x0000000000000000L,0x0400C00000000000L});
    public static final BitSet FOLLOW_NL_in_lambda_cases2967 = new BitSet(new long[]{0x0000000000000000L,0x0400C00000000000L});
    public static final BitSet FOLLOW_token_DOUBLE_ARROW_in_lambda_cases2970 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_lambda_cases2972 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_lop_expr_in_lambda_cases2975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protected_lambda_cases_in_protected_lambda_expr3003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_case_in_p_lambda_case_expr3021 = new BitSet(new long[]{0x0000000000000000L,0xBC0C000040009864L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_p_lambda_case_expr3023 = new BitSet(new long[]{0x0000000000000000L,0xBC0C000040009864L,0x0000000000000055L});
    public static final BitSet FOLLOW_pattern_in_p_lambda_case_expr3026 = new BitSet(new long[]{0x0000000000000000L,0x0400C00000000000L});
    public static final BitSet FOLLOW_NL_in_p_lambda_case_expr3028 = new BitSet(new long[]{0x0000000000000000L,0x0400C00000000000L});
    public static final BitSet FOLLOW_token_DOUBLE_ARROW_in_p_lambda_case_expr3031 = new BitSet(new long[]{0xBB1D000000000000L,0xBC8C00904000FFE5L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_p_lambda_case_expr3033 = new BitSet(new long[]{0xBB1D000000000000L,0xBC8C00904000FFE5L,0x0000000000000055L});
    public static final BitSet FOLLOW_pure_block_in_p_lambda_case_expr3036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_protected_lambda_cases3057 = new BitSet(new long[]{0x0000000000000000L,0x0400C00000000000L});
    public static final BitSet FOLLOW_NL_in_protected_lambda_cases3059 = new BitSet(new long[]{0x0000000000000000L,0x0400C00000000000L});
    public static final BitSet FOLLOW_token_DOUBLE_ARROW_in_protected_lambda_cases3062 = new BitSet(new long[]{0xBB1D000000000000L,0xBC8C00904000FFE5L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_protected_lambda_cases3064 = new BitSet(new long[]{0xBB1D000000000000L,0xBC8C00904000FFE5L,0x0000000000000055L});
    public static final BitSet FOLLOW_pure_block_in_protected_lambda_cases3067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_lambda_case_expr_in_protected_lambda_cases3086 = new BitSet(new long[]{0x2000000000000002L,0xBC0C000040009864L,0x0000000000000055L});
    public static final BitSet FOLLOW_L_for_in_for_expr3103 = new BitSet(new long[]{0x0000000000000000L,0xBC0C000040009864L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_for_expr3105 = new BitSet(new long[]{0x0000000000000000L,0xBC0C000040009864L,0x0000000000000055L});
    public static final BitSet FOLLOW_pattern_in_for_expr3108 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000002L});
    public static final BitSet FOLLOW_NL_in_for_expr3110 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_L_in_in_for_expr3113 = new BitSet(new long[]{0x331D000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_for_expr3115 = new BitSet(new long[]{0x331D000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_protected_expr_in_for_expr3118 = new BitSet(new long[]{0x0400000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_NL_in_for_expr3120 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_L_do_in_for_expr3123 = new BitSet(new long[]{0xBB1F000000000000L,0xBC8C00905000FFE5L,0x0000000000000055L});
    public static final BitSet FOLLOW_block_in_for_expr3125 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_L_end_in_for_expr3127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_builtin_primitive_in_op_expr3152 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_op_expr_in_op_expr3155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bool_expr_in_op_expr3160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_builtin_primitive_in_p_op_expr3170 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_p_op_expr3173 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_p_op_expr_in_p_op_expr3177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_bool_expr_in_p_op_expr3182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_builtin_primitive0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bool_or_expr_in_bool_expr3222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_bool_or_expr_in_p_bool_expr3232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bool_and_expr_in_bool_or_expr3241 = new BitSet(new long[]{0x0000000000000002L,0x0400002400000000L});
    public static final BitSet FOLLOW_NL_in_bool_or_expr3244 = new BitSet(new long[]{0x0000000000000000L,0x0400002400000000L});
    public static final BitSet FOLLOW_token_OR_in_bool_or_expr3248 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_bool_or_expr3251 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_bool_and_expr_in_bool_or_expr3255 = new BitSet(new long[]{0x0000000000000002L,0x0400002400000000L});
    public static final BitSet FOLLOW_p_bool_and_expr_in_p_bool_or_expr3267 = new BitSet(new long[]{0x0000000000000002L,0x0400002400000000L});
    public static final BitSet FOLLOW_NL_in_p_bool_or_expr3270 = new BitSet(new long[]{0x0000000000000000L,0x0400002400000000L});
    public static final BitSet FOLLOW_token_OR_in_p_bool_or_expr3274 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_p_bool_or_expr3277 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_p_bool_and_expr_in_p_bool_or_expr3281 = new BitSet(new long[]{0x0000000000000002L,0x0400002400000000L});
    public static final BitSet FOLLOW_bool_not_expr_in_bool_and_expr3293 = new BitSet(new long[]{0x0000000000000002L,0x0400004800000000L});
    public static final BitSet FOLLOW_NL_in_bool_and_expr3296 = new BitSet(new long[]{0x0000000000000000L,0x0400004800000000L});
    public static final BitSet FOLLOW_token_AND_in_bool_and_expr3300 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_bool_and_expr3303 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_bool_not_expr_in_bool_and_expr3307 = new BitSet(new long[]{0x0000000000000002L,0x0400004800000000L});
    public static final BitSet FOLLOW_p_bool_not_expr_in_p_bool_and_expr3319 = new BitSet(new long[]{0x0000000000000002L,0x0400004800000000L});
    public static final BitSet FOLLOW_NL_in_p_bool_and_expr3322 = new BitSet(new long[]{0x0000000000000000L,0x0400004800000000L});
    public static final BitSet FOLLOW_token_AND_in_p_bool_and_expr3326 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_p_bool_and_expr3329 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_p_bool_not_expr_in_p_bool_and_expr3333 = new BitSet(new long[]{0x0000000000000002L,0x0400004800000000L});
    public static final BitSet FOLLOW_token_NOT_in_bool_not_expr3345 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_bool_not_expr3348 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_bool_not_expr_in_bool_not_expr3352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rel_expr_in_bool_not_expr3357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_NOT_in_p_bool_not_expr3368 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_p_bool_not_expr3371 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_p_bool_not_expr_in_p_bool_not_expr3375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_rel_expr_in_p_bool_not_expr3380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arith_expr_in_rel_expr3389 = new BitSet(new long[]{0x0000000000000002L,0x040000000FFC0000L});
    public static final BitSet FOLLOW_NL_in_rel_expr3392 = new BitSet(new long[]{0x0000000000000000L,0x040000000FFC0000L});
    public static final BitSet FOLLOW_rel_op_in_rel_expr3395 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_rel_expr3397 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_arith_expr_in_rel_expr3400 = new BitSet(new long[]{0x0000000000000002L,0x040000000FFC0000L});
    public static final BitSet FOLLOW_p_arith_expr_in_p_rel_expr3427 = new BitSet(new long[]{0x0000000000000002L,0x040000000FFC0000L});
    public static final BitSet FOLLOW_NL_in_p_rel_expr3430 = new BitSet(new long[]{0x0000000000000000L,0x040000000FFC0000L});
    public static final BitSet FOLLOW_rel_op_in_p_rel_expr3433 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_p_rel_expr3435 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_p_arith_expr_in_p_rel_expr3438 = new BitSet(new long[]{0x0000000000000002L,0x040000000FFC0000L});
    public static final BitSet FOLLOW_token_EQUAL_in_rel_op3464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_NOT_EQUAL_in_rel_op3468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATER_in_rel_op3472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_GREATER_EQ_in_rel_op3476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_in_rel_op3480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_LESS_EQ_in_rel_op3484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_plusplus_expr_in_arith_expr3496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_plusplus_expr_in_p_arith_expr3506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timestimes_expr_in_plusplus_expr3516 = new BitSet(new long[]{0x0000000000000002L,0x0400300000000000L});
    public static final BitSet FOLLOW_NL_in_plusplus_expr3519 = new BitSet(new long[]{0x0000000000000000L,0x0000300000000000L});
    public static final BitSet FOLLOW_PLUSPLUS_in_plusplus_expr3524 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_MINUSMINUS_in_plusplus_expr3527 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_plusplus_expr3531 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_timestimes_expr_in_plusplus_expr3535 = new BitSet(new long[]{0x0000000000000002L,0x0400300000000000L});
    public static final BitSet FOLLOW_p_timestimes_expr_in_p_plusplus_expr3547 = new BitSet(new long[]{0x0000000000000002L,0x0400300000000000L});
    public static final BitSet FOLLOW_NL_in_p_plusplus_expr3550 = new BitSet(new long[]{0x0000000000000000L,0x0000300000000000L});
    public static final BitSet FOLLOW_PLUSPLUS_in_p_plusplus_expr3555 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_MINUSMINUS_in_p_plusplus_expr3558 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_p_plusplus_expr3562 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_p_timestimes_expr_in_p_plusplus_expr3566 = new BitSet(new long[]{0x0000000000000002L,0x0400300000000000L});
    public static final BitSet FOLLOW_simple_expr_in_timestimes_expr3578 = new BitSet(new long[]{0x0000000000000002L,0x04000C0000000000L});
    public static final BitSet FOLLOW_NL_in_timestimes_expr3581 = new BitSet(new long[]{0x0000000000000000L,0x00000C0000000000L});
    public static final BitSet FOLLOW_TIMESTIMES_in_timestimes_expr3586 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_QUOTIENTQUOTIENT_in_timestimes_expr3589 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_timestimes_expr3593 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_simple_expr_in_timestimes_expr3597 = new BitSet(new long[]{0x0000000000000002L,0x04000C0000000000L});
    public static final BitSet FOLLOW_p_simple_expr_in_p_timestimes_expr3610 = new BitSet(new long[]{0x0000000000000002L,0x04000C0000000000L});
    public static final BitSet FOLLOW_NL_in_p_timestimes_expr3613 = new BitSet(new long[]{0x0000000000000000L,0x00000C0000000000L});
    public static final BitSet FOLLOW_TIMESTIMES_in_p_timestimes_expr3618 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_QUOTIENTQUOTIENT_in_p_timestimes_expr3621 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_p_timestimes_expr3625 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_p_simple_expr_in_p_timestimes_expr3629 = new BitSet(new long[]{0x0000000000000002L,0x04000C0000000000L});
    public static final BitSet FOLLOW_cons_expr_in_simple_expr3640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_cons_expr_in_p_simple_expr3649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_to_expr_in_cons_expr3658 = new BitSet(new long[]{0x0000000000000002L,0x0400030000000000L});
    public static final BitSet FOLLOW_NL_in_cons_expr3661 = new BitSet(new long[]{0x0000000000000000L,0x0400030000000000L});
    public static final BitSet FOLLOW_token_DOUBLE_COLON_in_cons_expr3664 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_cons_expr3666 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_to_expr_in_cons_expr3669 = new BitSet(new long[]{0x0000000000000002L,0x0400030000000000L});
    public static final BitSet FOLLOW_p_to_expr_in_p_cons_expr3689 = new BitSet(new long[]{0x0000000000000002L,0x0400030000000000L});
    public static final BitSet FOLLOW_NL_in_p_cons_expr3692 = new BitSet(new long[]{0x0000000000000000L,0x0400030000000000L});
    public static final BitSet FOLLOW_token_DOUBLE_COLON_in_p_cons_expr3695 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_p_cons_expr3697 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_p_to_expr_in_p_cons_expr3700 = new BitSet(new long[]{0x0000000000000002L,0x0400030000000000L});
    public static final BitSet FOLLOW_arith_plus_expr_in_to_expr3720 = new BitSet(new long[]{0x0000000000000002L,0x0400000000000018L});
    public static final BitSet FOLLOW_NL_in_to_expr3723 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_L_to_in_to_expr3728 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_L_downto_in_to_expr3732 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_to_expr3736 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_arith_plus_expr_in_to_expr3740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_arith_plus_expr_in_p_to_expr3753 = new BitSet(new long[]{0x0000000000000002L,0x0400000000000018L});
    public static final BitSet FOLLOW_NL_in_p_to_expr3756 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_L_to_in_p_to_expr3761 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_L_downto_in_p_to_expr3765 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_p_to_expr3769 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_p_arith_plus_expr_in_p_to_expr3773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arith_uminus_expr_in_arith_plus_expr3785 = new BitSet(new long[]{0x0000000000000002L,0x0400000060000000L});
    public static final BitSet FOLLOW_NL_in_arith_plus_expr3789 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_PLUS_in_arith_plus_expr3793 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_MINUS_in_arith_plus_expr3798 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_arith_plus_expr3802 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_arith_uminus_expr_in_arith_plus_expr3806 = new BitSet(new long[]{0x0000000000000002L,0x0400000060000000L});
    public static final BitSet FOLLOW_p_arith_uminus_expr_in_p_arith_plus_expr3817 = new BitSet(new long[]{0x0000000000000002L,0x0400000060000000L});
    public static final BitSet FOLLOW_NL_in_p_arith_plus_expr3820 = new BitSet(new long[]{0x0000000000000000L,0x0000000060000000L});
    public static final BitSet FOLLOW_set_in_p_arith_plus_expr3824 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_p_arith_plus_expr3833 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_p_arith_uminus_expr_in_p_arith_plus_expr3837 = new BitSet(new long[]{0x0000000000000002L,0x0400000060000000L});
    public static final BitSet FOLLOW_MINUS_in_arith_uminus_expr3850 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_arith_uminus_expr3852 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_arith_mult_expr_in_arith_uminus_expr3855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arith_mult_expr_in_arith_uminus_expr3868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_p_arith_uminus_expr3879 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_p_arith_uminus_expr3881 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_p_arith_mult_expr_in_p_arith_uminus_expr3884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_arith_mult_expr_in_p_arith_uminus_expr3897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arith_pow_expr_in_arith_mult_expr3906 = new BitSet(new long[]{0x0000000000000002L,0x0400000180030000L});
    public static final BitSet FOLLOW_NL_in_arith_mult_expr3909 = new BitSet(new long[]{0x0000000000000000L,0x0000000180030000L});
    public static final BitSet FOLLOW_set_in_arith_mult_expr3913 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_arith_mult_expr3930 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_arith_pow_expr_in_arith_mult_expr3934 = new BitSet(new long[]{0x0000000000000002L,0x0400000180030000L});
    public static final BitSet FOLLOW_p_arith_pow_expr_in_p_arith_mult_expr3946 = new BitSet(new long[]{0x0000000000000002L,0x0400000180030000L});
    public static final BitSet FOLLOW_NL_in_p_arith_mult_expr3949 = new BitSet(new long[]{0x0000000000000000L,0x0000000180030000L});
    public static final BitSet FOLLOW_set_in_p_arith_mult_expr3953 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_p_arith_mult_expr3970 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_p_arith_pow_expr_in_p_arith_mult_expr3974 = new BitSet(new long[]{0x0000000000000002L,0x0400000180030000L});
    public static final BitSet FOLLOW_apply_expr_in_arith_pow_expr3985 = new BitSet(new long[]{0x0000000000000002L,0x0400000200000000L});
    public static final BitSet FOLLOW_NL_in_arith_pow_expr3988 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_POW_tok_in_arith_pow_expr3991 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_arith_pow_expr3993 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_apply_expr_in_arith_pow_expr3996 = new BitSet(new long[]{0x0000000000000002L,0x0400000200000000L});
    public static final BitSet FOLLOW_p_apply_expr_in_p_arith_pow_expr4017 = new BitSet(new long[]{0x0000000000000002L,0x0400000200000000L});
    public static final BitSet FOLLOW_NL_in_p_arith_pow_expr4020 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_POW_tok_in_p_arith_pow_expr4023 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_p_arith_pow_expr4025 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_p_apply_expr_in_p_arith_pow_expr4028 = new BitSet(new long[]{0x0000000000000002L,0x0400000200000000L});
    public static final BitSet FOLLOW_basic_expr_in_apply_expr4049 = new BitSet(new long[]{0x3319000000000002L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_p_basic_expr_in_p_apply_expr4067 = new BitSet(new long[]{0x3319000000000002L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_p_apply_expr4070 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_p_basic_expr_in_p_apply_expr4073 = new BitSet(new long[]{0x3319000000000002L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_message_send_expr_in_basic_expr4093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_message_send_expr_in_p_basic_expr4102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitive_expr_in_message_send_expr4111 = new BitSet(new long[]{0x0000000000000002L,0x0410000000000000L});
    public static final BitSet FOLLOW_NL_in_message_send_expr4114 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_PERIOD_in_message_send_expr4117 = new BitSet(new long[]{0x0000000000000000L,0x1400000000000000L});
    public static final BitSet FOLLOW_NL_in_message_send_expr4119 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_Id_in_message_send_expr4122 = new BitSet(new long[]{0x0000000000000002L,0x0410000000000000L});
    public static final BitSet FOLLOW_SQUARE_BRACKET_OPEN_in_list_expr4146 = new BitSet(new long[]{0x331D000000000000L,0xBC8C00904000FBE4L,0x000000000000005DL});
    public static final BitSet FOLLOW_NL_in_list_expr4148 = new BitSet(new long[]{0x331D000000000000L,0xBC8C00904000FBE4L,0x000000000000005DL});
    public static final BitSet FOLLOW_protected_expr_in_list_expr4152 = new BitSet(new long[]{0x0000000000000000L,0x0420000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_NL_in_list_expr4155 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_COMMA_in_list_expr4158 = new BitSet(new long[]{0x331D000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_list_expr4160 = new BitSet(new long[]{0x331D000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_protected_expr_in_list_expr4163 = new BitSet(new long[]{0x0000000000000000L,0x0420000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_NL_in_list_expr4167 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SQUARE_BRACKET_CLOSE_in_list_expr4172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROUND_BRACKET_OPEN_in_list_expr4186 = new BitSet(new long[]{0x331D000000000000L,0xBC8C00904000FBE4L,0x0000000000000057L});
    public static final BitSet FOLLOW_NL_in_list_expr4188 = new BitSet(new long[]{0x331D000000000000L,0xBC8C00904000FBE4L,0x0000000000000057L});
    public static final BitSet FOLLOW_protected_expr_in_list_expr4192 = new BitSet(new long[]{0x0000000000000000L,0x0420000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_NL_in_list_expr4195 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_COMMA_in_list_expr4198 = new BitSet(new long[]{0x331D000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_list_expr4200 = new BitSet(new long[]{0x331D000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_protected_expr_in_list_expr4203 = new BitSet(new long[]{0x0000000000000000L,0x0420000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_NL_in_list_expr4207 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_list_expr4211 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_NL_in_list_expr4213 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_ROUND_BRACKET_CLOSE_in_list_expr4220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURLY_BRACKET_OPEN_in_map_or_set_expr4249 = new BitSet(new long[]{0x331D000000000000L,0xBC8C00904000FBE4L,0x0000000000000075L});
    public static final BitSet FOLLOW_NL_in_map_or_set_expr4251 = new BitSet(new long[]{0x331D000000000000L,0xBC8C00904000FBE4L,0x0000000000000075L});
    public static final BitSet FOLLOW_map_or_set_elem_expr_in_map_or_set_expr4255 = new BitSet(new long[]{0x0000000000000000L,0x0420000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_map_or_set_expr4257 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_COMMA_in_map_or_set_expr4261 = new BitSet(new long[]{0x331D000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_map_or_set_expr4263 = new BitSet(new long[]{0x331D000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_map_or_set_elem_expr_in_map_or_set_expr4266 = new BitSet(new long[]{0x0000000000000000L,0x0420000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_map_or_set_expr4268 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_CURLY_BRACKET_CLOSE_in_map_or_set_expr4275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURLY_BRACKET_OPEN_in_map_or_set_expr4295 = new BitSet(new long[]{0x0000000000000000L,0x0403000000000000L});
    public static final BitSet FOLLOW_NL_in_map_or_set_expr4297 = new BitSet(new long[]{0x0000000000000000L,0x0003000000000000L});
    public static final BitSet FOLLOW_token_ARROW_in_map_or_set_expr4300 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_map_or_set_expr4302 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_CURLY_BRACKET_CLOSE_in_map_or_set_expr4305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protected_expr_in_map_or_set_elem_expr4322 = new BitSet(new long[]{0x0000000100000002L,0x0403000000000000L});
    public static final BitSet FOLLOW_NL_in_map_or_set_elem_expr4325 = new BitSet(new long[]{0x0000000100000000L,0x0403000000000000L});
    public static final BitSet FOLLOW_arrow_or_assign_in_map_or_set_elem_expr4328 = new BitSet(new long[]{0x331D000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_map_or_set_elem_expr4330 = new BitSet(new long[]{0x331D000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_protected_expr_in_map_or_set_elem_expr4333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Num_in_primitive_expr4360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_String_in_primitive_expr4365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Id_in_primitive_expr4370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Constr_in_primitive_expr4375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_true_in_primitive_expr4380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_false_in_primitive_expr4385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_this_in_primitive_expr4390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_nil_in_primitive_expr4396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_infinity_in_primitive_expr4401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_list_expr_in_primitive_expr4407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_with_control_expr_in_primitive_expr4412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_map_or_set_expr_in_primitive_expr4417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_prog4427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_prog4429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Id_in_synpred1_babel171571 = new BitSet(new long[]{0x4000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_NL_in_synpred1_babel171573 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_L_as_in_synpred1_babel171576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protected_expr_in_synpred2_babel171607 = new BitSet(new long[]{0x0000000000000000L,0x0440000000000000L});
    public static final BitSet FOLLOW_NL_in_synpred2_babel171609 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_QUESTION_MARK_in_synpred2_babel171612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_synpred3_babel172368 = new BitSet(new long[]{0x0000000100000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_objelem_assign_in_synpred3_babel172372 = new BitSet(new long[]{0x0000000100000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_NL_in_synpred3_babel172375 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ASSIGN_in_synpred3_babel172378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_obj_in_synpred4_babel172592 = new BitSet(new long[]{0x0000000000000000L,0x04000000A0000000L});
    public static final BitSet FOLLOW_NL_in_synpred4_babel172594 = new BitSet(new long[]{0x0000000000000000L,0x04000000A0000000L});
    public static final BitSet FOLLOW_parents_in_synpred4_babel172597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_expr_in_synpred5_babel172666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protected_lambda_expr_in_synpred6_babel172687 = new BitSet(new long[]{0x0000000000000002L});

}