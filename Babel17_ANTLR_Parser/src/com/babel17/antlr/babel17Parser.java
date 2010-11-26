// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g 2010-11-26 01:08:28

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PROG", "NIL_TOKEN", "ANY", "LAMBDA", "SQUARE_LIST", "ROUND_LIST", "LIST_CONS", "COMPARE", "APPLY", "IF", "MAP_OR_SET_OR_OBJ", "EMPTY_MAP", "EXCEPTION", "MATCH", "CASES", "OBJ", "FOR_EXPR", "WHILE_DO", "MESSAGE_SEND", "UMINUS", "POW", "PARENTS_PLUS", "PARENTS_MUL", "BLOCK", "BEGIN", "WITH", "VAL", "OBJELEM_ASSIGN", "ASSIGN", "ARROW", "DEF", "YIELD", "MEMOIZE", "MEM_STRONG", "MEM_WEAK", "IF_PATTERN", "Newline", "NotNewline", "COMMENT", "SmallLetter", "BigLetter", "Letter", "Digit", "Hex", "L_begin", "L_end", "L_obj", "L_with", "L_if", "L_then", "L_else", "L_elseif", "L_while", "L_for", "L_do", "L_yield", "L_match", "L_case", "L_as", "L_val", "L_def", "L_in", "L_exception", "L_to", "L_downto", "A_infinity", "U_infinity", "L_concurrent", "L_choose", "L_lazy", "L_memoize", "L_true", "L_false", "L_this", "L_random", "L_nil", "L_div", "L_mod", "A_EQUAL", "U_EQUAL", "A_NOT_EQUAL", "U_NOT_EQUAL", "LESS", "A_LESS_EQ", "U_LESS_EQ", "GREATER", "A_GREATER_EQ", "U_GREATER_EQ", "SC", "PLUS", "MINUS", "TIMES", "QUOTIENT", "POW_tok", "A_OR", "A_AND", "A_NOT", "U_OR", "U_AND", "U_NOT", "A_DOUBLE_COLON", "U_DOUBLE_COLON", "TIMESTIMES", "QUOTIENTQUOTIENT", "PLUSPLUS", "MINUSMINUS", "A_DOUBLE_ARROW", "U_DOUBLE_ARROW", "A_ARROW", "U_ARROW", "A_ELLIPSIS", "U_ELLIPSIS", "PERIOD", "COMMA", "QUESTION_MARK", "L_force", "WsChar", "WS", "NL", "Constr", "Id", "Num", "Charcode", "String", "ROUND_BRACKET_OPEN", "ROUND_BRACKET_CLOSE", "SQUARE_BRACKET_OPEN", "SQUARE_BRACKET_CLOSE", "CURLY_BRACKET_OPEN", "CURLY_BRACKET_CLOSE", "UNDERSCORE", "PRAGMA_LOG", "PRAGMA_ASSERT", "PRAGMA_PROFILE"
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
    public static final int PRAGMA_ASSERT=136;
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
    public static final int PRAGMA_PROFILE=137;
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:352:1: pattern : ( Constr ( ( NL )? primitive_pattern )? -> ^( Constr ( primitive_pattern )? ) | primitive_pattern ( ( NL )? token_DOUBLE_COLON ( NL )? primitive_pattern )* -> ^( LIST_CONS ( primitive_pattern )* ) | L_exception primitive_pattern -> ^( L_exception primitive_pattern ) | token_ELLIPSIS );
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:352:9: ( Constr ( ( NL )? primitive_pattern )? -> ^( Constr ( primitive_pattern )? ) | primitive_pattern ( ( NL )? token_DOUBLE_COLON ( NL )? primitive_pattern )* -> ^( LIST_CONS ( primitive_pattern )* ) | L_exception primitive_pattern -> ^( L_exception primitive_pattern ) | token_ELLIPSIS )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:352:11: Constr ( ( NL )? primitive_pattern )?
                    {
                    Constr13=(Token)match(input,Constr,FOLLOW_Constr_in_pattern1517); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Constr.add(Constr13);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:352:18: ( ( NL )? primitive_pattern )?
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
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:352:19: ( NL )? primitive_pattern
                            {
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:352:19: ( NL )?
                            int alt1=2;
                            int LA1_0 = input.LA(1);

                            if ( (LA1_0==NL) ) {
                                alt1=1;
                            }
                            switch (alt1) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:352:19: NL
                                    {
                                    NL14=(Token)match(input,NL,FOLLOW_NL_in_pattern1520); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL14);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_primitive_pattern_in_pattern1523);
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
                    // 352:43: -> ^( Constr ( primitive_pattern )? )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:352:46: ^( Constr ( primitive_pattern )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_Constr.nextNode(), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:352:55: ( primitive_pattern )?
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:353:4: primitive_pattern ( ( NL )? token_DOUBLE_COLON ( NL )? primitive_pattern )*
                    {
                    pushFollow(FOLLOW_primitive_pattern_in_pattern1539);
                    primitive_pattern16=primitive_pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primitive_pattern.add(primitive_pattern16.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:353:22: ( ( NL )? token_DOUBLE_COLON ( NL )? primitive_pattern )*
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
                    	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:353:23: ( NL )? token_DOUBLE_COLON ( NL )? primitive_pattern
                    	    {
                    	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:353:23: ( NL )?
                    	    int alt3=2;
                    	    int LA3_0 = input.LA(1);

                    	    if ( (LA3_0==NL) ) {
                    	        alt3=1;
                    	    }
                    	    switch (alt3) {
                    	        case 1 :
                    	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:353:23: NL
                    	            {
                    	            NL17=(Token)match(input,NL,FOLLOW_NL_in_pattern1542); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_NL.add(NL17);


                    	            }
                    	            break;

                    	    }

                    	    pushFollow(FOLLOW_token_DOUBLE_COLON_in_pattern1545);
                    	    token_DOUBLE_COLON18=token_DOUBLE_COLON();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_token_DOUBLE_COLON.add(token_DOUBLE_COLON18.getTree());
                    	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:353:46: ( NL )?
                    	    int alt4=2;
                    	    int LA4_0 = input.LA(1);

                    	    if ( (LA4_0==NL) ) {
                    	        alt4=1;
                    	    }
                    	    switch (alt4) {
                    	        case 1 :
                    	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:353:46: NL
                    	            {
                    	            NL19=(Token)match(input,NL,FOLLOW_NL_in_pattern1547); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_NL.add(NL19);


                    	            }
                    	            break;

                    	    }

                    	    pushFollow(FOLLOW_primitive_pattern_in_pattern1550);
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
                    // 354:3: -> ^( LIST_CONS ( primitive_pattern )* )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:354:6: ^( LIST_CONS ( primitive_pattern )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LIST_CONS, "LIST_CONS"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:354:18: ( primitive_pattern )*
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:355:4: L_exception primitive_pattern
                    {
                    L_exception21=(Token)match(input,L_exception,FOLLOW_L_exception_in_pattern1569); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_exception.add(L_exception21);

                    pushFollow(FOLLOW_primitive_pattern_in_pattern1571);
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
                    // 355:34: -> ^( L_exception primitive_pattern )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:355:37: ^( L_exception primitive_pattern )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:356:4: token_ELLIPSIS
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_ELLIPSIS_in_pattern1584);
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:358:1: bracket_pattern : ( ( Id ( NL )? L_as )=> Id ( NL )? L_as ( NL )? pattern -> ^( L_as Id pattern ) | ( protected_expr ( NL )? QUESTION_MARK )=> protected_expr ( NL )? QUESTION_MARK ( ( NL )? pattern )? -> ^( QUESTION_MARK protected_expr ( pattern )? ) | pattern ( ( NL )? L_if ( NL )? protected_expr )? -> ^( IF_PATTERN pattern ( protected_expr )? ) | L_val ( NL )? protected_expr -> ^( L_val protected_expr ) | L_for ( NL )? ( bracket_pattern ( ( NL )? COMMA ( NL )? bracket_pattern )* ( NL )? )? L_end -> ^( L_for ( bracket_pattern )* ) );
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
        Token L_for42=null;
        Token NL43=null;
        Token NL45=null;
        Token COMMA46=null;
        Token NL47=null;
        Token NL49=null;
        Token L_end50=null;
        babel17Parser.pattern_return pattern28 = null;

        babel17Parser.protected_expr_return protected_expr29 = null;

        babel17Parser.pattern_return pattern33 = null;

        babel17Parser.pattern_return pattern34 = null;

        babel17Parser.protected_expr_return protected_expr38 = null;

        babel17Parser.protected_expr_return protected_expr41 = null;

        babel17Parser.bracket_pattern_return bracket_pattern44 = null;

        babel17Parser.bracket_pattern_return bracket_pattern48 = null;


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
        CommonTree L_for42_tree=null;
        CommonTree NL43_tree=null;
        CommonTree NL45_tree=null;
        CommonTree COMMA46_tree=null;
        CommonTree NL47_tree=null;
        CommonTree NL49_tree=null;
        CommonTree L_end50_tree=null;
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleTokenStream stream_L_for=new RewriteRuleTokenStream(adaptor,"token L_for");
        RewriteRuleTokenStream stream_L_as=new RewriteRuleTokenStream(adaptor,"token L_as");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_Id=new RewriteRuleTokenStream(adaptor,"token Id");
        RewriteRuleTokenStream stream_L_val=new RewriteRuleTokenStream(adaptor,"token L_val");
        RewriteRuleTokenStream stream_L_if=new RewriteRuleTokenStream(adaptor,"token L_if");
        RewriteRuleTokenStream stream_QUESTION_MARK=new RewriteRuleTokenStream(adaptor,"token QUESTION_MARK");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_protected_expr=new RewriteRuleSubtreeStream(adaptor,"rule protected_expr");
        RewriteRuleSubtreeStream stream_bracket_pattern=new RewriteRuleSubtreeStream(adaptor,"rule bracket_pattern");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:359:2: ( ( Id ( NL )? L_as )=> Id ( NL )? L_as ( NL )? pattern -> ^( L_as Id pattern ) | ( protected_expr ( NL )? QUESTION_MARK )=> protected_expr ( NL )? QUESTION_MARK ( ( NL )? pattern )? -> ^( QUESTION_MARK protected_expr ( pattern )? ) | pattern ( ( NL )? L_if ( NL )? protected_expr )? -> ^( IF_PATTERN pattern ( protected_expr )? ) | L_val ( NL )? protected_expr -> ^( L_val protected_expr ) | L_for ( NL )? ( bracket_pattern ( ( NL )? COMMA ( NL )? bracket_pattern )* ( NL )? )? L_end -> ^( L_for ( bracket_pattern )* ) )
            int alt22=5;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:359:10: ( Id ( NL )? L_as )=> Id ( NL )? L_as ( NL )? pattern
                    {
                    Id24=(Token)match(input,Id,FOLLOW_Id_in_bracket_pattern1611); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Id.add(Id24);

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
                            NL25=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1613); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL25);


                            }
                            break;

                    }

                    L_as26=(Token)match(input,L_as,FOLLOW_L_as_in_bracket_pattern1616); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_as.add(L_as26);

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
                            NL27=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1618); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL27);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_pattern_in_bracket_pattern1621);
                    pattern28=pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pattern.add(pattern28.getTree());


                    // AST REWRITE
                    // elements: Id, pattern, L_as
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
                    pushFollow(FOLLOW_protected_expr_in_bracket_pattern1650);
                    protected_expr29=protected_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr29.getTree());
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
                            NL30=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1652); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL30);


                            }
                            break;

                    }

                    QUESTION_MARK31=(Token)match(input,QUESTION_MARK,FOLLOW_QUESTION_MARK_in_bracket_pattern1655); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QUESTION_MARK.add(QUESTION_MARK31);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:361:36: ( ( NL )? pattern )?
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
                                    NL32=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1658); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL32);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_pattern_in_bracket_pattern1661);
                            pattern33=pattern();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_pattern.add(pattern33.getTree());

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
                    pushFollow(FOLLOW_pattern_in_bracket_pattern1679);
                    pattern34=pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pattern.add(pattern34.getTree());
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
                                    NL35=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1682); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL35);


                                    }
                                    break;

                            }

                            L_if36=(Token)match(input,L_if,FOLLOW_L_if_in_bracket_pattern1685); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_L_if.add(L_if36);

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
                                    NL37=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1687); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL37);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_protected_expr_in_bracket_pattern1690);
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
                    L_val39=(Token)match(input,L_val,FOLLOW_L_val_in_bracket_pattern1708); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_val.add(L_val39);

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
                            NL40=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1710); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL40);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_protected_expr_in_bracket_pattern1713);
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:364:10: L_for ( NL )? ( bracket_pattern ( ( NL )? COMMA ( NL )? bracket_pattern )* ( NL )? )? L_end
                    {
                    L_for42=(Token)match(input,L_for,FOLLOW_L_for_in_bracket_pattern1732); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_for.add(L_for42);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:364:16: ( NL )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==NL) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:364:16: NL
                            {
                            NL43=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1734); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL43);


                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:364:20: ( bracket_pattern ( ( NL )? COMMA ( NL )? bracket_pattern )* ( NL )? )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==L_begin||(LA21_0>=L_obj && LA21_0<=L_if)||(LA21_0>=L_while && LA21_0<=L_for)||(LA21_0>=L_match && LA21_0<=L_case)||LA21_0==L_val||LA21_0==L_exception||(LA21_0>=A_infinity && LA21_0<=L_lazy)||(LA21_0>=L_true && LA21_0<=L_nil)||LA21_0==MINUS||LA21_0==A_NOT||LA21_0==U_NOT||(LA21_0>=A_ELLIPSIS && LA21_0<=U_ELLIPSIS)||LA21_0==L_force||(LA21_0>=Constr && LA21_0<=Num)||(LA21_0>=String && LA21_0<=ROUND_BRACKET_OPEN)||LA21_0==SQUARE_BRACKET_OPEN||LA21_0==CURLY_BRACKET_OPEN||LA21_0==UNDERSCORE) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:364:21: bracket_pattern ( ( NL )? COMMA ( NL )? bracket_pattern )* ( NL )?
                            {
                            pushFollow(FOLLOW_bracket_pattern_in_bracket_pattern1738);
                            bracket_pattern44=bracket_pattern();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_bracket_pattern.add(bracket_pattern44.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:364:37: ( ( NL )? COMMA ( NL )? bracket_pattern )*
                            loop19:
                            do {
                                int alt19=2;
                                int LA19_0 = input.LA(1);

                                if ( (LA19_0==NL) ) {
                                    int LA19_1 = input.LA(2);

                                    if ( (LA19_1==COMMA) ) {
                                        alt19=1;
                                    }


                                }
                                else if ( (LA19_0==COMMA) ) {
                                    alt19=1;
                                }


                                switch (alt19) {
                            	case 1 :
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:364:39: ( NL )? COMMA ( NL )? bracket_pattern
                            	    {
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:364:39: ( NL )?
                            	    int alt17=2;
                            	    int LA17_0 = input.LA(1);

                            	    if ( (LA17_0==NL) ) {
                            	        alt17=1;
                            	    }
                            	    switch (alt17) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:364:39: NL
                            	            {
                            	            NL45=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1742); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL45);


                            	            }
                            	            break;

                            	    }

                            	    COMMA46=(Token)match(input,COMMA,FOLLOW_COMMA_in_bracket_pattern1745); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA46);

                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:364:49: ( NL )?
                            	    int alt18=2;
                            	    int LA18_0 = input.LA(1);

                            	    if ( (LA18_0==NL) ) {
                            	        alt18=1;
                            	    }
                            	    switch (alt18) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:364:49: NL
                            	            {
                            	            NL47=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1747); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL47);


                            	            }
                            	            break;

                            	    }

                            	    pushFollow(FOLLOW_bracket_pattern_in_bracket_pattern1750);
                            	    bracket_pattern48=bracket_pattern();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_bracket_pattern.add(bracket_pattern48.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop19;
                                }
                            } while (true);

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:364:72: ( NL )?
                            int alt20=2;
                            int LA20_0 = input.LA(1);

                            if ( (LA20_0==NL) ) {
                                alt20=1;
                            }
                            switch (alt20) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:364:72: NL
                                    {
                                    NL49=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1755); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL49);


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    L_end50=(Token)match(input,L_end,FOLLOW_L_end_in_bracket_pattern1760); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_end.add(L_end50);



                    // AST REWRITE
                    // elements: bracket_pattern, L_for
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 364:84: -> ^( L_for ( bracket_pattern )* )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:364:87: ^( L_for ( bracket_pattern )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_L_for.nextNode(), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:364:95: ( bracket_pattern )*
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

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:366:1: arrow_or_assign : ( token_ARROW -> ^( ARROW ) | ASSIGN -> ^( ASSIGN ) );
    public final babel17Parser.arrow_or_assign_return arrow_or_assign() throws RecognitionException {
        babel17Parser.arrow_or_assign_return retval = new babel17Parser.arrow_or_assign_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ASSIGN52=null;
        babel17Parser.token_ARROW_return token_ARROW51 = null;


        CommonTree ASSIGN52_tree=null;
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_token_ARROW=new RewriteRuleSubtreeStream(adaptor,"rule token_ARROW");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:367:2: ( token_ARROW -> ^( ARROW ) | ASSIGN -> ^( ASSIGN ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=A_ARROW && LA23_0<=U_ARROW)) ) {
                alt23=1;
            }
            else if ( (LA23_0==ASSIGN) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:367:4: token_ARROW
                    {
                    pushFollow(FOLLOW_token_ARROW_in_arrow_or_assign1779);
                    token_ARROW51=token_ARROW();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_token_ARROW.add(token_ARROW51.getTree());


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
                    // 367:16: -> ^( ARROW )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:367:19: ^( ARROW )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:368:4: ASSIGN
                    {
                    ASSIGN52=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_arrow_or_assign1790); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN52);



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
                    // 368:11: -> ^( ASSIGN )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:368:14: ^( ASSIGN )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:370:1: mselem_pattern : bracket_pattern ( ( NL )? arrow_or_assign ( NL )? bracket_pattern )? -> ^( NIL_TOKEN ^( NIL_TOKEN ( bracket_pattern )* ) ( arrow_or_assign )* ) ;
    public final babel17Parser.mselem_pattern_return mselem_pattern() throws RecognitionException {
        babel17Parser.mselem_pattern_return retval = new babel17Parser.mselem_pattern_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL54=null;
        Token NL56=null;
        babel17Parser.bracket_pattern_return bracket_pattern53 = null;

        babel17Parser.arrow_or_assign_return arrow_or_assign55 = null;

        babel17Parser.bracket_pattern_return bracket_pattern57 = null;


        CommonTree NL54_tree=null;
        CommonTree NL56_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_arrow_or_assign=new RewriteRuleSubtreeStream(adaptor,"rule arrow_or_assign");
        RewriteRuleSubtreeStream stream_bracket_pattern=new RewriteRuleSubtreeStream(adaptor,"rule bracket_pattern");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:371:2: ( bracket_pattern ( ( NL )? arrow_or_assign ( NL )? bracket_pattern )? -> ^( NIL_TOKEN ^( NIL_TOKEN ( bracket_pattern )* ) ( arrow_or_assign )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:371:4: bracket_pattern ( ( NL )? arrow_or_assign ( NL )? bracket_pattern )?
            {
            pushFollow(FOLLOW_bracket_pattern_in_mselem_pattern1805);
            bracket_pattern53=bracket_pattern();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bracket_pattern.add(bracket_pattern53.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:371:20: ( ( NL )? arrow_or_assign ( NL )? bracket_pattern )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==NL) ) {
                int LA26_1 = input.LA(2);

                if ( (LA26_1==ASSIGN||(LA26_1>=A_ARROW && LA26_1<=U_ARROW)) ) {
                    alt26=1;
                }
            }
            else if ( (LA26_0==ASSIGN||(LA26_0>=A_ARROW && LA26_0<=U_ARROW)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:371:21: ( NL )? arrow_or_assign ( NL )? bracket_pattern
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:371:21: ( NL )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==NL) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:371:21: NL
                            {
                            NL54=(Token)match(input,NL,FOLLOW_NL_in_mselem_pattern1808); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL54);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_arrow_or_assign_in_mselem_pattern1811);
                    arrow_or_assign55=arrow_or_assign();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_arrow_or_assign.add(arrow_or_assign55.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:371:41: ( NL )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==NL) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:371:41: NL
                            {
                            NL56=(Token)match(input,NL,FOLLOW_NL_in_mselem_pattern1813); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL56);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_bracket_pattern_in_mselem_pattern1816);
                    bracket_pattern57=bracket_pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_bracket_pattern.add(bracket_pattern57.getTree());

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
            // 372:3: -> ^( NIL_TOKEN ^( NIL_TOKEN ( bracket_pattern )* ) ( arrow_or_assign )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:372:6: ^( NIL_TOKEN ^( NIL_TOKEN ( bracket_pattern )* ) ( arrow_or_assign )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:372:18: ^( NIL_TOKEN ( bracket_pattern )* )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_2);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:372:30: ( bracket_pattern )*
                while ( stream_bracket_pattern.hasNext() ) {
                    adaptor.addChild(root_2, stream_bracket_pattern.nextTree());

                }
                stream_bracket_pattern.reset();

                adaptor.addChild(root_1, root_2);
                }
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:372:48: ( arrow_or_assign )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:374:1: primitive_pattern : ( Id | '_' -> ANY | String | Num | L_true | L_false | L_nil | token_infinity | '-' ( NL )? token_infinity -> ^( UMINUS token_infinity ) | '-' ( NL )? Num -> ^( UMINUS Num ) | '[' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* )? ']' -> ^( SQUARE_LIST ( bracket_pattern )* ) | '(' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* ( COMMA ( NL )? )? )? ')' -> ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( bracket_pattern )* ) ) | '{' ( NL )? ( mselem_pattern ( NL )? ( COMMA ( NL )? mselem_pattern ( NL )? )* )? '}' -> ^( MAP_OR_SET_OR_OBJ ( mselem_pattern )* ) | '{' ( NL )? token_ARROW ( NL )? '}' -> ^( EMPTY_MAP ) );
    public final babel17Parser.primitive_pattern_return primitive_pattern() throws RecognitionException {
        babel17Parser.primitive_pattern_return retval = new babel17Parser.primitive_pattern_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Id58=null;
        Token char_literal59=null;
        Token String60=null;
        Token Num61=null;
        Token L_true62=null;
        Token L_false63=null;
        Token L_nil64=null;
        Token char_literal66=null;
        Token NL67=null;
        Token char_literal69=null;
        Token NL70=null;
        Token Num71=null;
        Token char_literal72=null;
        Token NL73=null;
        Token NL75=null;
        Token COMMA76=null;
        Token NL77=null;
        Token NL79=null;
        Token char_literal80=null;
        Token char_literal81=null;
        Token NL82=null;
        Token NL84=null;
        Token COMMA85=null;
        Token NL86=null;
        Token NL88=null;
        Token COMMA89=null;
        Token NL90=null;
        Token char_literal91=null;
        Token char_literal92=null;
        Token NL93=null;
        Token NL95=null;
        Token COMMA96=null;
        Token NL97=null;
        Token NL99=null;
        Token char_literal100=null;
        Token char_literal101=null;
        Token NL102=null;
        Token NL104=null;
        Token char_literal105=null;
        babel17Parser.token_infinity_return token_infinity65 = null;

        babel17Parser.token_infinity_return token_infinity68 = null;

        babel17Parser.bracket_pattern_return bracket_pattern74 = null;

        babel17Parser.bracket_pattern_return bracket_pattern78 = null;

        babel17Parser.bracket_pattern_return bracket_pattern83 = null;

        babel17Parser.bracket_pattern_return bracket_pattern87 = null;

        babel17Parser.mselem_pattern_return mselem_pattern94 = null;

        babel17Parser.mselem_pattern_return mselem_pattern98 = null;

        babel17Parser.token_ARROW_return token_ARROW103 = null;


        CommonTree Id58_tree=null;
        CommonTree char_literal59_tree=null;
        CommonTree String60_tree=null;
        CommonTree Num61_tree=null;
        CommonTree L_true62_tree=null;
        CommonTree L_false63_tree=null;
        CommonTree L_nil64_tree=null;
        CommonTree char_literal66_tree=null;
        CommonTree NL67_tree=null;
        CommonTree char_literal69_tree=null;
        CommonTree NL70_tree=null;
        CommonTree Num71_tree=null;
        CommonTree char_literal72_tree=null;
        CommonTree NL73_tree=null;
        CommonTree NL75_tree=null;
        CommonTree COMMA76_tree=null;
        CommonTree NL77_tree=null;
        CommonTree NL79_tree=null;
        CommonTree char_literal80_tree=null;
        CommonTree char_literal81_tree=null;
        CommonTree NL82_tree=null;
        CommonTree NL84_tree=null;
        CommonTree COMMA85_tree=null;
        CommonTree NL86_tree=null;
        CommonTree NL88_tree=null;
        CommonTree COMMA89_tree=null;
        CommonTree NL90_tree=null;
        CommonTree char_literal91_tree=null;
        CommonTree char_literal92_tree=null;
        CommonTree NL93_tree=null;
        CommonTree NL95_tree=null;
        CommonTree COMMA96_tree=null;
        CommonTree NL97_tree=null;
        CommonTree NL99_tree=null;
        CommonTree char_literal100_tree=null;
        CommonTree char_literal101_tree=null;
        CommonTree NL102_tree=null;
        CommonTree NL104_tree=null;
        CommonTree char_literal105_tree=null;
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:375:2: ( Id | '_' -> ANY | String | Num | L_true | L_false | L_nil | token_infinity | '-' ( NL )? token_infinity -> ^( UMINUS token_infinity ) | '-' ( NL )? Num -> ^( UMINUS Num ) | '[' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* )? ']' -> ^( SQUARE_LIST ( bracket_pattern )* ) | '(' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* ( COMMA ( NL )? )? )? ')' -> ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( bracket_pattern )* ) ) | '{' ( NL )? ( mselem_pattern ( NL )? ( COMMA ( NL )? mselem_pattern ( NL )? )* )? '}' -> ^( MAP_OR_SET_OR_OBJ ( mselem_pattern )* ) | '{' ( NL )? token_ARROW ( NL )? '}' -> ^( EMPTY_MAP ) )
            int alt51=14;
            alt51 = dfa51.predict(input);
            switch (alt51) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:375:4: Id
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Id58=(Token)match(input,Id,FOLLOW_Id_in_primitive_pattern1845); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Id58_tree = (CommonTree)adaptor.create(Id58);
                    adaptor.addChild(root_0, Id58_tree);
                    }

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:376:4: '_'
                    {
                    char_literal59=(Token)match(input,UNDERSCORE,FOLLOW_UNDERSCORE_in_primitive_pattern1850); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_UNDERSCORE.add(char_literal59);



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
                    // 376:8: -> ANY
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(ANY, "ANY"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:377:4: String
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    String60=(Token)match(input,String,FOLLOW_String_in_primitive_pattern1859); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    String60_tree = (CommonTree)adaptor.create(String60);
                    adaptor.addChild(root_0, String60_tree);
                    }

                    }
                    break;
                case 4 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:378:4: Num
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Num61=(Token)match(input,Num,FOLLOW_Num_in_primitive_pattern1864); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Num61_tree = (CommonTree)adaptor.create(Num61);
                    adaptor.addChild(root_0, Num61_tree);
                    }

                    }
                    break;
                case 5 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:379:4: L_true
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    L_true62=(Token)match(input,L_true,FOLLOW_L_true_in_primitive_pattern1869); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    L_true62_tree = (CommonTree)adaptor.create(L_true62);
                    adaptor.addChild(root_0, L_true62_tree);
                    }

                    }
                    break;
                case 6 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:380:4: L_false
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    L_false63=(Token)match(input,L_false,FOLLOW_L_false_in_primitive_pattern1874); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    L_false63_tree = (CommonTree)adaptor.create(L_false63);
                    adaptor.addChild(root_0, L_false63_tree);
                    }

                    }
                    break;
                case 7 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:381:4: L_nil
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    L_nil64=(Token)match(input,L_nil,FOLLOW_L_nil_in_primitive_pattern1879); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    L_nil64_tree = (CommonTree)adaptor.create(L_nil64);
                    adaptor.addChild(root_0, L_nil64_tree);
                    }

                    }
                    break;
                case 8 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:382:4: token_infinity
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_infinity_in_primitive_pattern1884);
                    token_infinity65=token_infinity();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, token_infinity65.getTree());

                    }
                    break;
                case 9 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:383:4: '-' ( NL )? token_infinity
                    {
                    char_literal66=(Token)match(input,MINUS,FOLLOW_MINUS_in_primitive_pattern1889); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(char_literal66);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:383:8: ( NL )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==NL) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:383:8: NL
                            {
                            NL67=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern1891); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL67);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_token_infinity_in_primitive_pattern1894);
                    token_infinity68=token_infinity();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_token_infinity.add(token_infinity68.getTree());


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
                    // 383:27: -> ^( UMINUS token_infinity )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:383:30: ^( UMINUS token_infinity )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:384:4: '-' ( NL )? Num
                    {
                    char_literal69=(Token)match(input,MINUS,FOLLOW_MINUS_in_primitive_pattern1907); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(char_literal69);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:384:8: ( NL )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==NL) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:384:8: NL
                            {
                            NL70=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern1909); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL70);


                            }
                            break;

                    }

                    Num71=(Token)match(input,Num,FOLLOW_Num_in_primitive_pattern1912); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Num.add(Num71);



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
                    // 384:16: -> ^( UMINUS Num )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:384:19: ^( UMINUS Num )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:385:4: '[' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* )? ']'
                    {
                    char_literal72=(Token)match(input,SQUARE_BRACKET_OPEN,FOLLOW_SQUARE_BRACKET_OPEN_in_primitive_pattern1925); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SQUARE_BRACKET_OPEN.add(char_literal72);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:385:9: ( NL )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==NL) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:385:9: NL
                            {
                            NL73=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern1928); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL73);


                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:385:13: ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==L_begin||(LA34_0>=L_obj && LA34_0<=L_if)||(LA34_0>=L_while && LA34_0<=L_for)||(LA34_0>=L_match && LA34_0<=L_case)||LA34_0==L_val||LA34_0==L_exception||(LA34_0>=A_infinity && LA34_0<=L_lazy)||(LA34_0>=L_true && LA34_0<=L_nil)||LA34_0==MINUS||LA34_0==A_NOT||LA34_0==U_NOT||(LA34_0>=A_ELLIPSIS && LA34_0<=U_ELLIPSIS)||LA34_0==L_force||(LA34_0>=Constr && LA34_0<=Num)||(LA34_0>=String && LA34_0<=ROUND_BRACKET_OPEN)||LA34_0==SQUARE_BRACKET_OPEN||LA34_0==CURLY_BRACKET_OPEN||LA34_0==UNDERSCORE) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:385:14: bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )*
                            {
                            pushFollow(FOLLOW_bracket_pattern_in_primitive_pattern1932);
                            bracket_pattern74=bracket_pattern();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_bracket_pattern.add(bracket_pattern74.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:385:30: ( NL )?
                            int alt30=2;
                            int LA30_0 = input.LA(1);

                            if ( (LA30_0==NL) ) {
                                alt30=1;
                            }
                            switch (alt30) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:385:30: NL
                                    {
                                    NL75=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern1934); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL75);


                                    }
                                    break;

                            }

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:385:34: ( COMMA ( NL )? bracket_pattern ( NL )? )*
                            loop33:
                            do {
                                int alt33=2;
                                int LA33_0 = input.LA(1);

                                if ( (LA33_0==COMMA) ) {
                                    alt33=1;
                                }


                                switch (alt33) {
                            	case 1 :
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:385:36: COMMA ( NL )? bracket_pattern ( NL )?
                            	    {
                            	    COMMA76=(Token)match(input,COMMA,FOLLOW_COMMA_in_primitive_pattern1939); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA76);

                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:385:42: ( NL )?
                            	    int alt31=2;
                            	    int LA31_0 = input.LA(1);

                            	    if ( (LA31_0==NL) ) {
                            	        alt31=1;
                            	    }
                            	    switch (alt31) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:385:42: NL
                            	            {
                            	            NL77=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern1941); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL77);


                            	            }
                            	            break;

                            	    }

                            	    pushFollow(FOLLOW_bracket_pattern_in_primitive_pattern1944);
                            	    bracket_pattern78=bracket_pattern();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_bracket_pattern.add(bracket_pattern78.getTree());
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:385:62: ( NL )?
                            	    int alt32=2;
                            	    int LA32_0 = input.LA(1);

                            	    if ( (LA32_0==NL) ) {
                            	        alt32=1;
                            	    }
                            	    switch (alt32) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:385:62: NL
                            	            {
                            	            NL79=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern1946); if (state.failed) return retval; 
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


                            }
                            break;

                    }

                    char_literal80=(Token)match(input,SQUARE_BRACKET_CLOSE,FOLLOW_SQUARE_BRACKET_CLOSE_in_primitive_pattern1954); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SQUARE_BRACKET_CLOSE.add(char_literal80);



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
                    // 386:6: -> ^( SQUARE_LIST ( bracket_pattern )* )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:386:9: ^( SQUARE_LIST ( bracket_pattern )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SQUARE_LIST, "SQUARE_LIST"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:386:23: ( bracket_pattern )*
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:387:4: '(' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* ( COMMA ( NL )? )? )? ')'
                    {
                    char_literal81=(Token)match(input,ROUND_BRACKET_OPEN,FOLLOW_ROUND_BRACKET_OPEN_in_primitive_pattern1974); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ROUND_BRACKET_OPEN.add(char_literal81);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:387:9: ( NL )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==NL) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:387:9: NL
                            {
                            NL82=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern1977); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL82);


                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:387:13: ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* ( COMMA ( NL )? )? )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==L_begin||(LA42_0>=L_obj && LA42_0<=L_if)||(LA42_0>=L_while && LA42_0<=L_for)||(LA42_0>=L_match && LA42_0<=L_case)||LA42_0==L_val||LA42_0==L_exception||(LA42_0>=A_infinity && LA42_0<=L_lazy)||(LA42_0>=L_true && LA42_0<=L_nil)||LA42_0==MINUS||LA42_0==A_NOT||LA42_0==U_NOT||(LA42_0>=A_ELLIPSIS && LA42_0<=U_ELLIPSIS)||LA42_0==L_force||(LA42_0>=Constr && LA42_0<=Num)||(LA42_0>=String && LA42_0<=ROUND_BRACKET_OPEN)||LA42_0==SQUARE_BRACKET_OPEN||LA42_0==CURLY_BRACKET_OPEN||LA42_0==UNDERSCORE) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:387:14: bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* ( COMMA ( NL )? )?
                            {
                            pushFollow(FOLLOW_bracket_pattern_in_primitive_pattern1981);
                            bracket_pattern83=bracket_pattern();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_bracket_pattern.add(bracket_pattern83.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:387:30: ( NL )?
                            int alt36=2;
                            int LA36_0 = input.LA(1);

                            if ( (LA36_0==NL) ) {
                                alt36=1;
                            }
                            switch (alt36) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:387:30: NL
                                    {
                                    NL84=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern1983); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL84);


                                    }
                                    break;

                            }

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:387:34: ( COMMA ( NL )? bracket_pattern ( NL )? )*
                            loop39:
                            do {
                                int alt39=2;
                                int LA39_0 = input.LA(1);

                                if ( (LA39_0==COMMA) ) {
                                    int LA39_1 = input.LA(2);

                                    if ( (LA39_1==NL) ) {
                                        int LA39_3 = input.LA(3);

                                        if ( (LA39_3==L_begin||(LA39_3>=L_obj && LA39_3<=L_if)||(LA39_3>=L_while && LA39_3<=L_for)||(LA39_3>=L_match && LA39_3<=L_case)||LA39_3==L_val||LA39_3==L_exception||(LA39_3>=A_infinity && LA39_3<=L_lazy)||(LA39_3>=L_true && LA39_3<=L_nil)||LA39_3==MINUS||LA39_3==A_NOT||LA39_3==U_NOT||(LA39_3>=A_ELLIPSIS && LA39_3<=U_ELLIPSIS)||LA39_3==L_force||(LA39_3>=Constr && LA39_3<=Num)||(LA39_3>=String && LA39_3<=ROUND_BRACKET_OPEN)||LA39_3==SQUARE_BRACKET_OPEN||LA39_3==CURLY_BRACKET_OPEN||LA39_3==UNDERSCORE) ) {
                                            alt39=1;
                                        }


                                    }
                                    else if ( (LA39_1==L_begin||(LA39_1>=L_obj && LA39_1<=L_if)||(LA39_1>=L_while && LA39_1<=L_for)||(LA39_1>=L_match && LA39_1<=L_case)||LA39_1==L_val||LA39_1==L_exception||(LA39_1>=A_infinity && LA39_1<=L_lazy)||(LA39_1>=L_true && LA39_1<=L_nil)||LA39_1==MINUS||LA39_1==A_NOT||LA39_1==U_NOT||(LA39_1>=A_ELLIPSIS && LA39_1<=U_ELLIPSIS)||LA39_1==L_force||(LA39_1>=Constr && LA39_1<=Num)||(LA39_1>=String && LA39_1<=ROUND_BRACKET_OPEN)||LA39_1==SQUARE_BRACKET_OPEN||LA39_1==CURLY_BRACKET_OPEN||LA39_1==UNDERSCORE) ) {
                                        alt39=1;
                                    }


                                }


                                switch (alt39) {
                            	case 1 :
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:387:36: COMMA ( NL )? bracket_pattern ( NL )?
                            	    {
                            	    COMMA85=(Token)match(input,COMMA,FOLLOW_COMMA_in_primitive_pattern1988); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA85);

                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:387:43: ( NL )?
                            	    int alt37=2;
                            	    int LA37_0 = input.LA(1);

                            	    if ( (LA37_0==NL) ) {
                            	        alt37=1;
                            	    }
                            	    switch (alt37) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:387:43: NL
                            	            {
                            	            NL86=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern1991); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL86);


                            	            }
                            	            break;

                            	    }

                            	    pushFollow(FOLLOW_bracket_pattern_in_primitive_pattern1994);
                            	    bracket_pattern87=bracket_pattern();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_bracket_pattern.add(bracket_pattern87.getTree());
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:387:63: ( NL )?
                            	    int alt38=2;
                            	    int LA38_0 = input.LA(1);

                            	    if ( (LA38_0==NL) ) {
                            	        alt38=1;
                            	    }
                            	    switch (alt38) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:387:63: NL
                            	            {
                            	            NL88=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern1996); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL88);


                            	            }
                            	            break;

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop39;
                                }
                            } while (true);

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:387:69: ( COMMA ( NL )? )?
                            int alt41=2;
                            int LA41_0 = input.LA(1);

                            if ( (LA41_0==COMMA) ) {
                                alt41=1;
                            }
                            switch (alt41) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:387:70: COMMA ( NL )?
                                    {
                                    COMMA89=(Token)match(input,COMMA,FOLLOW_COMMA_in_primitive_pattern2002); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_COMMA.add(COMMA89);

                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:387:76: ( NL )?
                                    int alt40=2;
                                    int LA40_0 = input.LA(1);

                                    if ( (LA40_0==NL) ) {
                                        alt40=1;
                                    }
                                    switch (alt40) {
                                        case 1 :
                                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:387:76: NL
                                            {
                                            NL90=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2004); if (state.failed) return retval; 
                                            if ( state.backtracking==0 ) stream_NL.add(NL90);


                                            }
                                            break;

                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    char_literal91=(Token)match(input,ROUND_BRACKET_CLOSE,FOLLOW_ROUND_BRACKET_CLOSE_in_primitive_pattern2011); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ROUND_BRACKET_CLOSE.add(char_literal91);



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
                    // 388:5: -> ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( bracket_pattern )* ) )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:388:8: ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( bracket_pattern )* ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ROUND_LIST, "ROUND_LIST"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:388:21: ^( NIL_TOKEN ( COMMA )* )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_2);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:388:33: ( COMMA )*
                        while ( stream_COMMA.hasNext() ) {
                            adaptor.addChild(root_2, stream_COMMA.nextNode());

                        }
                        stream_COMMA.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:388:41: ^( NIL_TOKEN ( bracket_pattern )* )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_2);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:388:53: ( bracket_pattern )*
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:389:4: '{' ( NL )? ( mselem_pattern ( NL )? ( COMMA ( NL )? mselem_pattern ( NL )? )* )? '}'
                    {
                    char_literal92=(Token)match(input,CURLY_BRACKET_OPEN,FOLLOW_CURLY_BRACKET_OPEN_in_primitive_pattern2043); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_OPEN.add(char_literal92);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:389:9: ( NL )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==NL) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:389:9: NL
                            {
                            NL93=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2046); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL93);


                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:389:13: ( mselem_pattern ( NL )? ( COMMA ( NL )? mselem_pattern ( NL )? )* )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==L_begin||(LA48_0>=L_obj && LA48_0<=L_if)||(LA48_0>=L_while && LA48_0<=L_for)||(LA48_0>=L_match && LA48_0<=L_case)||LA48_0==L_val||LA48_0==L_exception||(LA48_0>=A_infinity && LA48_0<=L_lazy)||(LA48_0>=L_true && LA48_0<=L_nil)||LA48_0==MINUS||LA48_0==A_NOT||LA48_0==U_NOT||(LA48_0>=A_ELLIPSIS && LA48_0<=U_ELLIPSIS)||LA48_0==L_force||(LA48_0>=Constr && LA48_0<=Num)||(LA48_0>=String && LA48_0<=ROUND_BRACKET_OPEN)||LA48_0==SQUARE_BRACKET_OPEN||LA48_0==CURLY_BRACKET_OPEN||LA48_0==UNDERSCORE) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:389:14: mselem_pattern ( NL )? ( COMMA ( NL )? mselem_pattern ( NL )? )*
                            {
                            pushFollow(FOLLOW_mselem_pattern_in_primitive_pattern2050);
                            mselem_pattern94=mselem_pattern();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_mselem_pattern.add(mselem_pattern94.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:389:29: ( NL )?
                            int alt44=2;
                            int LA44_0 = input.LA(1);

                            if ( (LA44_0==NL) ) {
                                alt44=1;
                            }
                            switch (alt44) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:389:29: NL
                                    {
                                    NL95=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2052); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL95);


                                    }
                                    break;

                            }

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:389:33: ( COMMA ( NL )? mselem_pattern ( NL )? )*
                            loop47:
                            do {
                                int alt47=2;
                                int LA47_0 = input.LA(1);

                                if ( (LA47_0==COMMA) ) {
                                    alt47=1;
                                }


                                switch (alt47) {
                            	case 1 :
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:389:35: COMMA ( NL )? mselem_pattern ( NL )?
                            	    {
                            	    COMMA96=(Token)match(input,COMMA,FOLLOW_COMMA_in_primitive_pattern2057); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA96);

                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:389:42: ( NL )?
                            	    int alt45=2;
                            	    int LA45_0 = input.LA(1);

                            	    if ( (LA45_0==NL) ) {
                            	        alt45=1;
                            	    }
                            	    switch (alt45) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:389:42: NL
                            	            {
                            	            NL97=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2060); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL97);


                            	            }
                            	            break;

                            	    }

                            	    pushFollow(FOLLOW_mselem_pattern_in_primitive_pattern2063);
                            	    mselem_pattern98=mselem_pattern();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_mselem_pattern.add(mselem_pattern98.getTree());
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:389:61: ( NL )?
                            	    int alt46=2;
                            	    int LA46_0 = input.LA(1);

                            	    if ( (LA46_0==NL) ) {
                            	        alt46=1;
                            	    }
                            	    switch (alt46) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:389:61: NL
                            	            {
                            	            NL99=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2065); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL99);


                            	            }
                            	            break;

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop47;
                                }
                            } while (true);


                            }
                            break;

                    }

                    char_literal100=(Token)match(input,CURLY_BRACKET_CLOSE,FOLLOW_CURLY_BRACKET_CLOSE_in_primitive_pattern2073); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_CLOSE.add(char_literal100);



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
                    // 390:5: -> ^( MAP_OR_SET_OR_OBJ ( mselem_pattern )* )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:390:8: ^( MAP_OR_SET_OR_OBJ ( mselem_pattern )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MAP_OR_SET_OR_OBJ, "MAP_OR_SET_OR_OBJ"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:390:28: ( mselem_pattern )*
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:391:4: '{' ( NL )? token_ARROW ( NL )? '}'
                    {
                    char_literal101=(Token)match(input,CURLY_BRACKET_OPEN,FOLLOW_CURLY_BRACKET_OPEN_in_primitive_pattern2091); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_OPEN.add(char_literal101);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:391:8: ( NL )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==NL) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:391:8: NL
                            {
                            NL102=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2093); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL102);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_token_ARROW_in_primitive_pattern2096);
                    token_ARROW103=token_ARROW();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_token_ARROW.add(token_ARROW103.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:391:24: ( NL )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==NL) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:391:24: NL
                            {
                            NL104=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2098); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL104);


                            }
                            break;

                    }

                    char_literal105=(Token)match(input,CURLY_BRACKET_CLOSE,FOLLOW_CURLY_BRACKET_CLOSE_in_primitive_pattern2101); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_CLOSE.add(char_literal105);



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
                    // 391:32: -> ^( EMPTY_MAP )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:391:35: ^( EMPTY_MAP )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:396:1: sep : ( NL | SC )+ ;
    public final babel17Parser.sep_return sep() throws RecognitionException {
        babel17Parser.sep_return retval = new babel17Parser.sep_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set106=null;

        CommonTree set106_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:396:5: ( ( NL | SC )+ )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:396:7: ( NL | SC )+
            {
            root_0 = (CommonTree)adaptor.nil();

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:396:7: ( NL | SC )+
            int cnt52=0;
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==SC||LA52_0==NL) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:
            	    {
            	    set106=(Token)input.LT(1);
            	    if ( input.LA(1)==SC||input.LA(1)==NL ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set106));
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
            	    if ( cnt52 >= 1 ) break loop52;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(52, input);
                        throw eee;
                }
                cnt52++;
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:398:1: block : ( ( sep )? statement ( sep statement )* ( sep )? -> ^( BLOCK ( statement )* ) | ( sep )? -> ^( BLOCK ) );
    public final babel17Parser.block_return block() throws RecognitionException {
        babel17Parser.block_return retval = new babel17Parser.block_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.sep_return sep107 = null;

        babel17Parser.statement_return statement108 = null;

        babel17Parser.sep_return sep109 = null;

        babel17Parser.statement_return statement110 = null;

        babel17Parser.sep_return sep111 = null;

        babel17Parser.sep_return sep112 = null;


        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_sep=new RewriteRuleSubtreeStream(adaptor,"rule sep");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:398:8: ( ( sep )? statement ( sep statement )* ( sep )? -> ^( BLOCK ( statement )* ) | ( sep )? -> ^( BLOCK ) )
            int alt57=2;
            alt57 = dfa57.predict(input);
            switch (alt57) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:398:10: ( sep )? statement ( sep statement )* ( sep )?
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:398:10: ( sep )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==SC||LA53_0==NL) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:398:10: sep
                            {
                            pushFollow(FOLLOW_sep_in_block2139);
                            sep107=sep();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_sep.add(sep107.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_statement_in_block2142);
                    statement108=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement108.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:398:25: ( sep statement )*
                    loop54:
                    do {
                        int alt54=2;
                        alt54 = dfa54.predict(input);
                        switch (alt54) {
                    	case 1 :
                    	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:398:26: sep statement
                    	    {
                    	    pushFollow(FOLLOW_sep_in_block2145);
                    	    sep109=sep();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_sep.add(sep109.getTree());
                    	    pushFollow(FOLLOW_statement_in_block2147);
                    	    statement110=statement();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_statement.add(statement110.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop54;
                        }
                    } while (true);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:398:42: ( sep )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==SC||LA55_0==NL) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:398:42: sep
                            {
                            pushFollow(FOLLOW_sep_in_block2151);
                            sep111=sep();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_sep.add(sep111.getTree());

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
                    // 398:47: -> ^( BLOCK ( statement )* )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:398:50: ^( BLOCK ( statement )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:398:58: ( statement )*
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:399:4: ( sep )?
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:399:4: ( sep )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==SC||LA56_0==NL) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:399:4: sep
                            {
                            pushFollow(FOLLOW_sep_in_block2167);
                            sep112=sep();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_sep.add(sep112.getTree());

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
                    // 399:9: -> ^( BLOCK )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:399:12: ^( BLOCK )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:401:1: pure_block : statement ( sep statement )* -> ^( BLOCK ( statement )* ) ;
    public final babel17Parser.pure_block_return pure_block() throws RecognitionException {
        babel17Parser.pure_block_return retval = new babel17Parser.pure_block_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.statement_return statement113 = null;

        babel17Parser.sep_return sep114 = null;

        babel17Parser.statement_return statement115 = null;


        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_sep=new RewriteRuleSubtreeStream(adaptor,"rule sep");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:402:2: ( statement ( sep statement )* -> ^( BLOCK ( statement )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:402:4: statement ( sep statement )*
            {
            pushFollow(FOLLOW_statement_in_pure_block2184);
            statement113=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statement.add(statement113.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:402:14: ( sep statement )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==NL) ) {
                    int LA58_1 = input.LA(2);

                    if ( (LA58_1==L_begin||(LA58_1>=L_obj && LA58_1<=L_if)||(LA58_1>=L_while && LA58_1<=L_for)||(LA58_1>=L_yield && LA58_1<=L_match)||(LA58_1>=L_val && LA58_1<=L_def)||LA58_1==L_exception||(LA58_1>=A_infinity && LA58_1<=L_nil)||LA58_1==SC||LA58_1==MINUS||LA58_1==A_NOT||LA58_1==U_NOT||(LA58_1>=A_ELLIPSIS && LA58_1<=U_ELLIPSIS)||LA58_1==L_force||(LA58_1>=NL && LA58_1<=Num)||(LA58_1>=String && LA58_1<=ROUND_BRACKET_OPEN)||LA58_1==SQUARE_BRACKET_OPEN||LA58_1==CURLY_BRACKET_OPEN||(LA58_1>=UNDERSCORE && LA58_1<=PRAGMA_PROFILE)) ) {
                        alt58=1;
                    }


                }
                else if ( (LA58_0==SC) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:402:15: sep statement
            	    {
            	    pushFollow(FOLLOW_sep_in_pure_block2187);
            	    sep114=sep();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_sep.add(sep114.getTree());
            	    pushFollow(FOLLOW_statement_in_pure_block2189);
            	    statement115=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement115.getTree());

            	    }
            	    break;

            	default :
            	    break loop58;
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
            // 402:31: -> ^( BLOCK ( statement )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:402:34: ^( BLOCK ( statement )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:402:42: ( statement )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:404:1: statement : ( st_val | st_def | st_memoize | st_yield | expr_or_assign | PRAGMA_LOG expr -> ^( PRAGMA_LOG expr ) | PRAGMA_PROFILE expr -> ^( PRAGMA_PROFILE expr ) | PRAGMA_ASSERT expr -> ^( PRAGMA_ASSERT expr ) );
    public final babel17Parser.statement_return statement() throws RecognitionException {
        babel17Parser.statement_return retval = new babel17Parser.statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PRAGMA_LOG121=null;
        Token PRAGMA_PROFILE123=null;
        Token PRAGMA_ASSERT125=null;
        babel17Parser.st_val_return st_val116 = null;

        babel17Parser.st_def_return st_def117 = null;

        babel17Parser.st_memoize_return st_memoize118 = null;

        babel17Parser.st_yield_return st_yield119 = null;

        babel17Parser.expr_or_assign_return expr_or_assign120 = null;

        babel17Parser.expr_return expr122 = null;

        babel17Parser.expr_return expr124 = null;

        babel17Parser.expr_return expr126 = null;


        CommonTree PRAGMA_LOG121_tree=null;
        CommonTree PRAGMA_PROFILE123_tree=null;
        CommonTree PRAGMA_ASSERT125_tree=null;
        RewriteRuleTokenStream stream_PRAGMA_PROFILE=new RewriteRuleTokenStream(adaptor,"token PRAGMA_PROFILE");
        RewriteRuleTokenStream stream_PRAGMA_ASSERT=new RewriteRuleTokenStream(adaptor,"token PRAGMA_ASSERT");
        RewriteRuleTokenStream stream_PRAGMA_LOG=new RewriteRuleTokenStream(adaptor,"token PRAGMA_LOG");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:405:2: ( st_val | st_def | st_memoize | st_yield | expr_or_assign | PRAGMA_LOG expr -> ^( PRAGMA_LOG expr ) | PRAGMA_PROFILE expr -> ^( PRAGMA_PROFILE expr ) | PRAGMA_ASSERT expr -> ^( PRAGMA_ASSERT expr ) )
            int alt59=8;
            switch ( input.LA(1) ) {
            case L_val:
                {
                alt59=1;
                }
                break;
            case L_def:
                {
                alt59=2;
                }
                break;
            case L_memoize:
                {
                alt59=3;
                }
                break;
            case L_yield:
                {
                alt59=4;
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
                alt59=5;
                }
                break;
            case PRAGMA_LOG:
                {
                alt59=6;
                }
                break;
            case PRAGMA_PROFILE:
                {
                alt59=7;
                }
                break;
            case PRAGMA_ASSERT:
                {
                alt59=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }

            switch (alt59) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:405:4: st_val
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_st_val_in_statement2210);
                    st_val116=st_val();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, st_val116.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:406:4: st_def
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_st_def_in_statement2215);
                    st_def117=st_def();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, st_def117.getTree());

                    }
                    break;
                case 3 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:407:4: st_memoize
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_st_memoize_in_statement2220);
                    st_memoize118=st_memoize();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, st_memoize118.getTree());

                    }
                    break;
                case 4 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:408:4: st_yield
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_st_yield_in_statement2225);
                    st_yield119=st_yield();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, st_yield119.getTree());

                    }
                    break;
                case 5 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:409:4: expr_or_assign
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_expr_or_assign_in_statement2230);
                    expr_or_assign120=expr_or_assign();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_or_assign120.getTree());

                    }
                    break;
                case 6 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:410:5: PRAGMA_LOG expr
                    {
                    PRAGMA_LOG121=(Token)match(input,PRAGMA_LOG,FOLLOW_PRAGMA_LOG_in_statement2236); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PRAGMA_LOG.add(PRAGMA_LOG121);

                    pushFollow(FOLLOW_expr_in_statement2238);
                    expr122=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr122.getTree());


                    // AST REWRITE
                    // elements: expr, PRAGMA_LOG
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 410:21: -> ^( PRAGMA_LOG expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:410:24: ^( PRAGMA_LOG expr )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_PRAGMA_LOG.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:411:5: PRAGMA_PROFILE expr
                    {
                    PRAGMA_PROFILE123=(Token)match(input,PRAGMA_PROFILE,FOLLOW_PRAGMA_PROFILE_in_statement2252); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PRAGMA_PROFILE.add(PRAGMA_PROFILE123);

                    pushFollow(FOLLOW_expr_in_statement2254);
                    expr124=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr124.getTree());


                    // AST REWRITE
                    // elements: expr, PRAGMA_PROFILE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 411:25: -> ^( PRAGMA_PROFILE expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:411:28: ^( PRAGMA_PROFILE expr )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_PRAGMA_PROFILE.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 8 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:412:5: PRAGMA_ASSERT expr
                    {
                    PRAGMA_ASSERT125=(Token)match(input,PRAGMA_ASSERT,FOLLOW_PRAGMA_ASSERT_in_statement2268); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PRAGMA_ASSERT.add(PRAGMA_ASSERT125);

                    pushFollow(FOLLOW_expr_in_statement2270);
                    expr126=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr126.getTree());


                    // AST REWRITE
                    // elements: PRAGMA_ASSERT, expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 412:24: -> ^( PRAGMA_ASSERT expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:412:27: ^( PRAGMA_ASSERT expr )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_PRAGMA_ASSERT.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());

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
    // $ANTLR end "statement"

    public static class objelem_assign_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "objelem_assign"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:414:1: objelem_assign : Id PERIOD Id -> ^( OBJELEM_ASSIGN Id Id ) ;
    public final babel17Parser.objelem_assign_return objelem_assign() throws RecognitionException {
        babel17Parser.objelem_assign_return retval = new babel17Parser.objelem_assign_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Id127=null;
        Token PERIOD128=null;
        Token Id129=null;

        CommonTree Id127_tree=null;
        CommonTree PERIOD128_tree=null;
        CommonTree Id129_tree=null;
        RewriteRuleTokenStream stream_Id=new RewriteRuleTokenStream(adaptor,"token Id");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:415:2: ( Id PERIOD Id -> ^( OBJELEM_ASSIGN Id Id ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:415:4: Id PERIOD Id
            {
            Id127=(Token)match(input,Id,FOLLOW_Id_in_objelem_assign2288); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Id.add(Id127);

            PERIOD128=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_objelem_assign2290); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD128);

            Id129=(Token)match(input,Id,FOLLOW_Id_in_objelem_assign2292); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Id.add(Id129);



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
            // 415:17: -> ^( OBJELEM_ASSIGN Id Id )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:415:20: ^( OBJELEM_ASSIGN Id Id )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:417:1: st_val : L_val ( NL )? ( pattern | objelem_assign ) ( NL )? '=' ( NL )? expr -> ^( VAL ( pattern )* ( objelem_assign )* expr ) ;
    public final babel17Parser.st_val_return st_val() throws RecognitionException {
        babel17Parser.st_val_return retval = new babel17Parser.st_val_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_val130=null;
        Token NL131=null;
        Token NL134=null;
        Token char_literal135=null;
        Token NL136=null;
        babel17Parser.pattern_return pattern132 = null;

        babel17Parser.objelem_assign_return objelem_assign133 = null;

        babel17Parser.expr_return expr137 = null;


        CommonTree L_val130_tree=null;
        CommonTree NL131_tree=null;
        CommonTree NL134_tree=null;
        CommonTree char_literal135_tree=null;
        CommonTree NL136_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_val=new RewriteRuleTokenStream(adaptor,"token L_val");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_objelem_assign=new RewriteRuleSubtreeStream(adaptor,"rule objelem_assign");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:417:8: ( L_val ( NL )? ( pattern | objelem_assign ) ( NL )? '=' ( NL )? expr -> ^( VAL ( pattern )* ( objelem_assign )* expr ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:417:10: L_val ( NL )? ( pattern | objelem_assign ) ( NL )? '=' ( NL )? expr
            {
            L_val130=(Token)match(input,L_val,FOLLOW_L_val_in_st_val2311); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_val.add(L_val130);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:417:16: ( NL )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==NL) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:417:16: NL
                    {
                    NL131=(Token)match(input,NL,FOLLOW_NL_in_st_val2313); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL131);


                    }
                    break;

            }

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:417:20: ( pattern | objelem_assign )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==L_exception||(LA61_0>=A_infinity && LA61_0<=U_infinity)||(LA61_0>=L_true && LA61_0<=L_false)||LA61_0==L_nil||LA61_0==MINUS||(LA61_0>=A_ELLIPSIS && LA61_0<=U_ELLIPSIS)||LA61_0==Constr||LA61_0==Num||(LA61_0>=String && LA61_0<=ROUND_BRACKET_OPEN)||LA61_0==SQUARE_BRACKET_OPEN||LA61_0==CURLY_BRACKET_OPEN||LA61_0==UNDERSCORE) ) {
                alt61=1;
            }
            else if ( (LA61_0==Id) ) {
                int LA61_2 = input.LA(2);

                if ( (LA61_2==PERIOD) ) {
                    alt61=2;
                }
                else if ( (LA61_2==ASSIGN||(LA61_2>=A_DOUBLE_COLON && LA61_2<=U_DOUBLE_COLON)||LA61_2==NL) ) {
                    alt61=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 61, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:417:21: pattern
                    {
                    pushFollow(FOLLOW_pattern_in_st_val2317);
                    pattern132=pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pattern.add(pattern132.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:417:31: objelem_assign
                    {
                    pushFollow(FOLLOW_objelem_assign_in_st_val2321);
                    objelem_assign133=objelem_assign();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_objelem_assign.add(objelem_assign133.getTree());

                    }
                    break;

            }

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:417:47: ( NL )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==NL) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:417:47: NL
                    {
                    NL134=(Token)match(input,NL,FOLLOW_NL_in_st_val2324); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL134);


                    }
                    break;

            }

            char_literal135=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_st_val2327); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal135);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:417:55: ( NL )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==NL) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:417:55: NL
                    {
                    NL136=(Token)match(input,NL,FOLLOW_NL_in_st_val2329); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL136);


                    }
                    break;

            }

            pushFollow(FOLLOW_expr_in_st_val2332);
            expr137=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr137.getTree());


            // AST REWRITE
            // elements: pattern, expr, objelem_assign
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 417:64: -> ^( VAL ( pattern )* ( objelem_assign )* expr )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:417:67: ^( VAL ( pattern )* ( objelem_assign )* expr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VAL, "VAL"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:417:73: ( pattern )*
                while ( stream_pattern.hasNext() ) {
                    adaptor.addChild(root_1, stream_pattern.nextTree());

                }
                stream_pattern.reset();
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:417:82: ( objelem_assign )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:419:1: st_def : L_def ( NL )? Id ( NL )? ( primitive_pattern ( NL )? )? '=' ( NL )? expr -> ^( DEF Id ( primitive_pattern )? expr ) ;
    public final babel17Parser.st_def_return st_def() throws RecognitionException {
        babel17Parser.st_def_return retval = new babel17Parser.st_def_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_def138=null;
        Token NL139=null;
        Token Id140=null;
        Token NL141=null;
        Token NL143=null;
        Token char_literal144=null;
        Token NL145=null;
        babel17Parser.primitive_pattern_return primitive_pattern142 = null;

        babel17Parser.expr_return expr146 = null;


        CommonTree L_def138_tree=null;
        CommonTree NL139_tree=null;
        CommonTree Id140_tree=null;
        CommonTree NL141_tree=null;
        CommonTree NL143_tree=null;
        CommonTree char_literal144_tree=null;
        CommonTree NL145_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_Id=new RewriteRuleTokenStream(adaptor,"token Id");
        RewriteRuleTokenStream stream_L_def=new RewriteRuleTokenStream(adaptor,"token L_def");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_primitive_pattern=new RewriteRuleSubtreeStream(adaptor,"rule primitive_pattern");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:419:8: ( L_def ( NL )? Id ( NL )? ( primitive_pattern ( NL )? )? '=' ( NL )? expr -> ^( DEF Id ( primitive_pattern )? expr ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:419:10: L_def ( NL )? Id ( NL )? ( primitive_pattern ( NL )? )? '=' ( NL )? expr
            {
            L_def138=(Token)match(input,L_def,FOLLOW_L_def_in_st_def2356); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_def.add(L_def138);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:419:16: ( NL )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==NL) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:419:16: NL
                    {
                    NL139=(Token)match(input,NL,FOLLOW_NL_in_st_def2358); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL139);


                    }
                    break;

            }

            Id140=(Token)match(input,Id,FOLLOW_Id_in_st_def2361); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Id.add(Id140);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:419:23: ( NL )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==NL) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:419:23: NL
                    {
                    NL141=(Token)match(input,NL,FOLLOW_NL_in_st_def2363); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL141);


                    }
                    break;

            }

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:419:27: ( primitive_pattern ( NL )? )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( ((LA67_0>=A_infinity && LA67_0<=U_infinity)||(LA67_0>=L_true && LA67_0<=L_false)||LA67_0==L_nil||LA67_0==MINUS||(LA67_0>=Id && LA67_0<=Num)||(LA67_0>=String && LA67_0<=ROUND_BRACKET_OPEN)||LA67_0==SQUARE_BRACKET_OPEN||LA67_0==CURLY_BRACKET_OPEN||LA67_0==UNDERSCORE) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:419:28: primitive_pattern ( NL )?
                    {
                    pushFollow(FOLLOW_primitive_pattern_in_st_def2367);
                    primitive_pattern142=primitive_pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primitive_pattern.add(primitive_pattern142.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:419:46: ( NL )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==NL) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:419:46: NL
                            {
                            NL143=(Token)match(input,NL,FOLLOW_NL_in_st_def2369); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL143);


                            }
                            break;

                    }


                    }
                    break;

            }

            char_literal144=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_st_def2374); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal144);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:419:56: ( NL )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==NL) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:419:56: NL
                    {
                    NL145=(Token)match(input,NL,FOLLOW_NL_in_st_def2376); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL145);


                    }
                    break;

            }

            pushFollow(FOLLOW_expr_in_st_def2379);
            expr146=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr146.getTree());


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
            // 420:5: -> ^( DEF Id ( primitive_pattern )? expr )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:420:8: ^( DEF Id ( primitive_pattern )? expr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DEF, "DEF"), root_1);

                adaptor.addChild(root_1, stream_Id.nextNode());
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:420:17: ( primitive_pattern )?
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:422:1: st_yield : L_yield expr -> ^( YIELD expr ) ;
    public final babel17Parser.st_yield_return st_yield() throws RecognitionException {
        babel17Parser.st_yield_return retval = new babel17Parser.st_yield_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_yield147=null;
        babel17Parser.expr_return expr148 = null;


        CommonTree L_yield147_tree=null;
        RewriteRuleTokenStream stream_L_yield=new RewriteRuleTokenStream(adaptor,"token L_yield");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:422:9: ( L_yield expr -> ^( YIELD expr ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:422:11: L_yield expr
            {
            L_yield147=(Token)match(input,L_yield,FOLLOW_L_yield_in_st_yield2408); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_yield.add(L_yield147);

            pushFollow(FOLLOW_expr_in_st_yield2410);
            expr148=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr148.getTree());


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
            // 422:24: -> ^( YIELD expr )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:422:27: ^( YIELD expr )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:424:1: st_memoize : L_memoize ( memid )+ -> ^( MEMOIZE ( memid )* ) ;
    public final babel17Parser.st_memoize_return st_memoize() throws RecognitionException {
        babel17Parser.st_memoize_return retval = new babel17Parser.st_memoize_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_memoize149=null;
        babel17Parser.memid_return memid150 = null;


        CommonTree L_memoize149_tree=null;
        RewriteRuleTokenStream stream_L_memoize=new RewriteRuleTokenStream(adaptor,"token L_memoize");
        RewriteRuleSubtreeStream stream_memid=new RewriteRuleSubtreeStream(adaptor,"rule memid");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:425:2: ( L_memoize ( memid )+ -> ^( MEMOIZE ( memid )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:425:4: L_memoize ( memid )+
            {
            L_memoize149=(Token)match(input,L_memoize,FOLLOW_L_memoize_in_st_memoize2428); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_memoize.add(L_memoize149);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:425:14: ( memid )+
            int cnt69=0;
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==Id||LA69_0==ROUND_BRACKET_OPEN) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:425:14: memid
            	    {
            	    pushFollow(FOLLOW_memid_in_st_memoize2430);
            	    memid150=memid();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_memid.add(memid150.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt69 >= 1 ) break loop69;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(69, input);
                        throw eee;
                }
                cnt69++;
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
            // 426:5: -> ^( MEMOIZE ( memid )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:426:8: ^( MEMOIZE ( memid )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MEMOIZE, "MEMOIZE"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:426:18: ( memid )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:428:1: memid : ( Id -> ^( MEM_STRONG Id ) | '(' Id ')' -> ^( MEM_WEAK Id ) );
    public final babel17Parser.memid_return memid() throws RecognitionException {
        babel17Parser.memid_return retval = new babel17Parser.memid_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Id151=null;
        Token char_literal152=null;
        Token Id153=null;
        Token char_literal154=null;

        CommonTree Id151_tree=null;
        CommonTree char_literal152_tree=null;
        CommonTree Id153_tree=null;
        CommonTree char_literal154_tree=null;
        RewriteRuleTokenStream stream_ROUND_BRACKET_OPEN=new RewriteRuleTokenStream(adaptor,"token ROUND_BRACKET_OPEN");
        RewriteRuleTokenStream stream_ROUND_BRACKET_CLOSE=new RewriteRuleTokenStream(adaptor,"token ROUND_BRACKET_CLOSE");
        RewriteRuleTokenStream stream_Id=new RewriteRuleTokenStream(adaptor,"token Id");

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:428:7: ( Id -> ^( MEM_STRONG Id ) | '(' Id ')' -> ^( MEM_WEAK Id ) )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==Id) ) {
                alt70=1;
            }
            else if ( (LA70_0==ROUND_BRACKET_OPEN) ) {
                alt70=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:428:9: Id
                    {
                    Id151=(Token)match(input,Id,FOLLOW_Id_in_memid2454); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Id.add(Id151);



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
                    // 428:12: -> ^( MEM_STRONG Id )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:428:15: ^( MEM_STRONG Id )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:429:4: '(' Id ')'
                    {
                    char_literal152=(Token)match(input,ROUND_BRACKET_OPEN,FOLLOW_ROUND_BRACKET_OPEN_in_memid2467); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ROUND_BRACKET_OPEN.add(char_literal152);

                    Id153=(Token)match(input,Id,FOLLOW_Id_in_memid2469); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Id.add(Id153);

                    char_literal154=(Token)match(input,ROUND_BRACKET_CLOSE,FOLLOW_ROUND_BRACKET_CLOSE_in_memid2471); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ROUND_BRACKET_CLOSE.add(char_literal154);



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
                    // 429:15: -> ^( MEM_WEAK Id )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:429:18: ^( MEM_WEAK Id )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:432:1: expr_or_assign : ( ( ( pattern | objelem_assign ) ( NL )? '=' )=> ( pattern | objelem_assign ) ( NL )? '=' ( NL )? expr -> ^( ASSIGN ( pattern )* ( objelem_assign )* expr ) | expr );
    public final babel17Parser.expr_or_assign_return expr_or_assign() throws RecognitionException {
        babel17Parser.expr_or_assign_return retval = new babel17Parser.expr_or_assign_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL157=null;
        Token char_literal158=null;
        Token NL159=null;
        babel17Parser.pattern_return pattern155 = null;

        babel17Parser.objelem_assign_return objelem_assign156 = null;

        babel17Parser.expr_return expr160 = null;

        babel17Parser.expr_return expr161 = null;


        CommonTree NL157_tree=null;
        CommonTree char_literal158_tree=null;
        CommonTree NL159_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_objelem_assign=new RewriteRuleSubtreeStream(adaptor,"rule objelem_assign");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:433:2: ( ( ( pattern | objelem_assign ) ( NL )? '=' )=> ( pattern | objelem_assign ) ( NL )? '=' ( NL )? expr -> ^( ASSIGN ( pattern )* ( objelem_assign )* expr ) | expr )
            int alt74=2;
            alt74 = dfa74.predict(input);
            switch (alt74) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:433:4: ( ( pattern | objelem_assign ) ( NL )? '=' )=> ( pattern | objelem_assign ) ( NL )? '=' ( NL )? expr
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:433:44: ( pattern | objelem_assign )
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==L_exception||(LA71_0>=A_infinity && LA71_0<=U_infinity)||(LA71_0>=L_true && LA71_0<=L_false)||LA71_0==L_nil||LA71_0==MINUS||(LA71_0>=A_ELLIPSIS && LA71_0<=U_ELLIPSIS)||LA71_0==Constr||LA71_0==Num||(LA71_0>=String && LA71_0<=ROUND_BRACKET_OPEN)||LA71_0==SQUARE_BRACKET_OPEN||LA71_0==CURLY_BRACKET_OPEN||LA71_0==UNDERSCORE) ) {
                        alt71=1;
                    }
                    else if ( (LA71_0==Id) ) {
                        int LA71_2 = input.LA(2);

                        if ( (LA71_2==PERIOD) ) {
                            alt71=2;
                        }
                        else if ( (LA71_2==ASSIGN||(LA71_2>=A_DOUBLE_COLON && LA71_2<=U_DOUBLE_COLON)||LA71_2==NL) ) {
                            alt71=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 71, 2, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 71, 0, input);

                        throw nvae;
                    }
                    switch (alt71) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:433:45: pattern
                            {
                            pushFollow(FOLLOW_pattern_in_expr_or_assign2511);
                            pattern155=pattern();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_pattern.add(pattern155.getTree());

                            }
                            break;
                        case 2 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:433:55: objelem_assign
                            {
                            pushFollow(FOLLOW_objelem_assign_in_expr_or_assign2515);
                            objelem_assign156=objelem_assign();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_objelem_assign.add(objelem_assign156.getTree());

                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:433:71: ( NL )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==NL) ) {
                        alt72=1;
                    }
                    switch (alt72) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:433:71: NL
                            {
                            NL157=(Token)match(input,NL,FOLLOW_NL_in_expr_or_assign2518); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL157);


                            }
                            break;

                    }

                    char_literal158=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_expr_or_assign2521); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal158);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:433:79: ( NL )?
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==NL) ) {
                        alt73=1;
                    }
                    switch (alt73) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:433:79: NL
                            {
                            NL159=(Token)match(input,NL,FOLLOW_NL_in_expr_or_assign2523); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL159);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_expr_in_expr_or_assign2526);
                    expr160=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr160.getTree());


                    // AST REWRITE
                    // elements: objelem_assign, pattern, expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 433:88: -> ^( ASSIGN ( pattern )* ( objelem_assign )* expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:433:91: ^( ASSIGN ( pattern )* ( objelem_assign )* expr )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASSIGN, "ASSIGN"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:433:100: ( pattern )*
                        while ( stream_pattern.hasNext() ) {
                            adaptor.addChild(root_1, stream_pattern.nextTree());

                        }
                        stream_pattern.reset();
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:433:109: ( objelem_assign )*
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:434:4: expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_expr_in_expr_or_assign2545);
                    expr161=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr161.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:436:1: expr : ( lop_expr | obj_expr );
    public final babel17Parser.expr_return expr() throws RecognitionException {
        babel17Parser.expr_return retval = new babel17Parser.expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.lop_expr_return lop_expr162 = null;

        babel17Parser.obj_expr_return obj_expr163 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:437:2: ( lop_expr | obj_expr )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==L_begin||(LA75_0>=L_with && LA75_0<=L_if)||(LA75_0>=L_while && LA75_0<=L_for)||LA75_0==L_match||LA75_0==L_exception||(LA75_0>=A_infinity && LA75_0<=L_lazy)||(LA75_0>=L_true && LA75_0<=L_nil)||LA75_0==MINUS||LA75_0==A_NOT||LA75_0==U_NOT||(LA75_0>=A_ELLIPSIS && LA75_0<=U_ELLIPSIS)||LA75_0==L_force||(LA75_0>=Constr && LA75_0<=Num)||(LA75_0>=String && LA75_0<=ROUND_BRACKET_OPEN)||LA75_0==SQUARE_BRACKET_OPEN||LA75_0==CURLY_BRACKET_OPEN||LA75_0==UNDERSCORE) ) {
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:437:4: lop_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_lop_expr_in_expr2556);
                    lop_expr162=lop_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lop_expr162.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:438:4: obj_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_obj_expr_in_expr2561);
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
    // $ANTLR end "expr"

    public static class control_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "control_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:440:1: control_expr : ( if_expr | while_do_expr | match_expr | for_expr | begin_end );
    public final babel17Parser.control_expr_return control_expr() throws RecognitionException {
        babel17Parser.control_expr_return retval = new babel17Parser.control_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.if_expr_return if_expr164 = null;

        babel17Parser.while_do_expr_return while_do_expr165 = null;

        babel17Parser.match_expr_return match_expr166 = null;

        babel17Parser.for_expr_return for_expr167 = null;

        babel17Parser.begin_end_return begin_end168 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:441:2: ( if_expr | while_do_expr | match_expr | for_expr | begin_end )
            int alt76=5;
            switch ( input.LA(1) ) {
            case L_if:
                {
                alt76=1;
                }
                break;
            case L_while:
                {
                alt76=2;
                }
                break;
            case L_match:
                {
                alt76=3;
                }
                break;
            case L_for:
                {
                alt76=4;
                }
                break;
            case L_begin:
                {
                alt76=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }

            switch (alt76) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:441:4: if_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_if_expr_in_control_expr2571);
                    if_expr164=if_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, if_expr164.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:442:4: while_do_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_while_do_expr_in_control_expr2576);
                    while_do_expr165=while_do_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, while_do_expr165.getTree());

                    }
                    break;
                case 3 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:443:4: match_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_match_expr_in_control_expr2581);
                    match_expr166=match_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, match_expr166.getTree());

                    }
                    break;
                case 4 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:444:4: for_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_for_expr_in_control_expr2586);
                    for_expr167=for_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, for_expr167.getTree());

                    }
                    break;
                case 5 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:445:4: begin_end
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_begin_end_in_control_expr2591);
                    begin_end168=begin_end();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, begin_end168.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:447:1: with_control_expr : ( control_expr | L_with ( NL )? protected_expr ( NL )? L_do block L_end -> ^( WITH protected_expr ^( BEGIN block ) ) );
    public final babel17Parser.with_control_expr_return with_control_expr() throws RecognitionException {
        babel17Parser.with_control_expr_return retval = new babel17Parser.with_control_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_with170=null;
        Token NL171=null;
        Token NL173=null;
        Token L_do174=null;
        Token L_end176=null;
        babel17Parser.control_expr_return control_expr169 = null;

        babel17Parser.protected_expr_return protected_expr172 = null;

        babel17Parser.block_return block175 = null;


        CommonTree L_with170_tree=null;
        CommonTree NL171_tree=null;
        CommonTree NL173_tree=null;
        CommonTree L_do174_tree=null;
        CommonTree L_end176_tree=null;
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_do=new RewriteRuleTokenStream(adaptor,"token L_do");
        RewriteRuleTokenStream stream_L_with=new RewriteRuleTokenStream(adaptor,"token L_with");
        RewriteRuleSubtreeStream stream_protected_expr=new RewriteRuleSubtreeStream(adaptor,"rule protected_expr");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:448:2: ( control_expr | L_with ( NL )? protected_expr ( NL )? L_do block L_end -> ^( WITH protected_expr ^( BEGIN block ) ) )
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==L_begin||LA79_0==L_if||(LA79_0>=L_while && LA79_0<=L_for)||LA79_0==L_match) ) {
                alt79=1;
            }
            else if ( (LA79_0==L_with) ) {
                alt79=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }
            switch (alt79) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:448:4: control_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_control_expr_in_with_control_expr2601);
                    control_expr169=control_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, control_expr169.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:449:4: L_with ( NL )? protected_expr ( NL )? L_do block L_end
                    {
                    L_with170=(Token)match(input,L_with,FOLLOW_L_with_in_with_control_expr2606); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_with.add(L_with170);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:449:11: ( NL )?
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==NL) ) {
                        alt77=1;
                    }
                    switch (alt77) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:449:11: NL
                            {
                            NL171=(Token)match(input,NL,FOLLOW_NL_in_with_control_expr2608); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL171);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_protected_expr_in_with_control_expr2611);
                    protected_expr172=protected_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr172.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:449:30: ( NL )?
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==NL) ) {
                        alt78=1;
                    }
                    switch (alt78) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:449:30: NL
                            {
                            NL173=(Token)match(input,NL,FOLLOW_NL_in_with_control_expr2613); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL173);


                            }
                            break;

                    }

                    L_do174=(Token)match(input,L_do,FOLLOW_L_do_in_with_control_expr2616); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_do.add(L_do174);

                    pushFollow(FOLLOW_block_in_with_control_expr2618);
                    block175=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block175.getTree());
                    L_end176=(Token)match(input,L_end,FOLLOW_L_end_in_with_control_expr2620); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_end.add(L_end176);



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
                    // 449:51: -> ^( WITH protected_expr ^( BEGIN block ) )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:449:54: ^( WITH protected_expr ^( BEGIN block ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(WITH, "WITH"), root_1);

                        adaptor.addChild(root_1, stream_protected_expr.nextTree());
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:449:76: ^( BEGIN block )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:452:1: protected_expr : ( p_lop_expr | obj_expr );
    public final babel17Parser.protected_expr_return protected_expr() throws RecognitionException {
        babel17Parser.protected_expr_return retval = new babel17Parser.protected_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.p_lop_expr_return p_lop_expr177 = null;

        babel17Parser.obj_expr_return obj_expr178 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:453:2: ( p_lop_expr | obj_expr )
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==L_begin||(LA80_0>=L_with && LA80_0<=L_if)||(LA80_0>=L_while && LA80_0<=L_for)||(LA80_0>=L_match && LA80_0<=L_case)||LA80_0==L_exception||(LA80_0>=A_infinity && LA80_0<=L_lazy)||(LA80_0>=L_true && LA80_0<=L_nil)||LA80_0==MINUS||LA80_0==A_NOT||LA80_0==U_NOT||(LA80_0>=A_ELLIPSIS && LA80_0<=U_ELLIPSIS)||LA80_0==L_force||(LA80_0>=Constr && LA80_0<=Num)||(LA80_0>=String && LA80_0<=ROUND_BRACKET_OPEN)||LA80_0==SQUARE_BRACKET_OPEN||LA80_0==CURLY_BRACKET_OPEN||LA80_0==UNDERSCORE) ) {
                alt80=1;
            }
            else if ( (LA80_0==L_obj) ) {
                alt80=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }
            switch (alt80) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:453:4: p_lop_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_p_lop_expr_in_protected_expr2645);
                    p_lop_expr177=p_lop_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_lop_expr177.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:454:4: obj_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_obj_expr_in_protected_expr2650);
                    obj_expr178=obj_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, obj_expr178.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:457:1: begin_end : L_begin block L_end -> ^( BEGIN block ) ;
    public final babel17Parser.begin_end_return begin_end() throws RecognitionException {
        babel17Parser.begin_end_return retval = new babel17Parser.begin_end_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_begin179=null;
        Token L_end181=null;
        babel17Parser.block_return block180 = null;


        CommonTree L_begin179_tree=null;
        CommonTree L_end181_tree=null;
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleTokenStream stream_L_begin=new RewriteRuleTokenStream(adaptor,"token L_begin");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:458:2: ( L_begin block L_end -> ^( BEGIN block ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:458:4: L_begin block L_end
            {
            L_begin179=(Token)match(input,L_begin,FOLLOW_L_begin_in_begin_end2662); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_begin.add(L_begin179);

            pushFollow(FOLLOW_block_in_begin_end2664);
            block180=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block180.getTree());
            L_end181=(Token)match(input,L_end,FOLLOW_L_end_in_begin_end2666); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_end.add(L_end181);



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
            // 458:24: -> ^( BEGIN block )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:458:27: ^( BEGIN block )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:461:1: parents : ( '+' primitive_expr -> ^( PARENTS_PLUS primitive_expr ) | '*' primitive_expr -> ^( PARENTS_MUL primitive_expr ) );
    public final babel17Parser.parents_return parents() throws RecognitionException {
        babel17Parser.parents_return retval = new babel17Parser.parents_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal182=null;
        Token char_literal184=null;
        babel17Parser.primitive_expr_return primitive_expr183 = null;

        babel17Parser.primitive_expr_return primitive_expr185 = null;


        CommonTree char_literal182_tree=null;
        CommonTree char_literal184_tree=null;
        RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
        RewriteRuleTokenStream stream_TIMES=new RewriteRuleTokenStream(adaptor,"token TIMES");
        RewriteRuleSubtreeStream stream_primitive_expr=new RewriteRuleSubtreeStream(adaptor,"rule primitive_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:461:9: ( '+' primitive_expr -> ^( PARENTS_PLUS primitive_expr ) | '*' primitive_expr -> ^( PARENTS_MUL primitive_expr ) )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==PLUS) ) {
                alt81=1;
            }
            else if ( (LA81_0==TIMES) ) {
                alt81=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }
            switch (alt81) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:461:11: '+' primitive_expr
                    {
                    char_literal182=(Token)match(input,PLUS,FOLLOW_PLUS_in_parents2684); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PLUS.add(char_literal182);

                    pushFollow(FOLLOW_primitive_expr_in_parents2686);
                    primitive_expr183=primitive_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primitive_expr.add(primitive_expr183.getTree());


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
                    // 461:30: -> ^( PARENTS_PLUS primitive_expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:461:33: ^( PARENTS_PLUS primitive_expr )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:462:4: '*' primitive_expr
                    {
                    char_literal184=(Token)match(input,TIMES,FOLLOW_TIMES_in_parents2699); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TIMES.add(char_literal184);

                    pushFollow(FOLLOW_primitive_expr_in_parents2701);
                    primitive_expr185=primitive_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primitive_expr.add(primitive_expr185.getTree());


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
                    // 462:23: -> ^( PARENTS_MUL primitive_expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:462:26: ^( PARENTS_MUL primitive_expr )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:465:1: obj_expr : ( ( L_obj ( NL )? parents )=> L_obj ( NL )? parents block L_end -> ^( OBJ block parents ) | L_obj block L_end -> ^( OBJ block ) );
    public final babel17Parser.obj_expr_return obj_expr() throws RecognitionException {
        babel17Parser.obj_expr_return retval = new babel17Parser.obj_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_obj186=null;
        Token NL187=null;
        Token L_end190=null;
        Token L_obj191=null;
        Token L_end193=null;
        babel17Parser.parents_return parents188 = null;

        babel17Parser.block_return block189 = null;

        babel17Parser.block_return block192 = null;


        CommonTree L_obj186_tree=null;
        CommonTree NL187_tree=null;
        CommonTree L_end190_tree=null;
        CommonTree L_obj191_tree=null;
        CommonTree L_end193_tree=null;
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_obj=new RewriteRuleTokenStream(adaptor,"token L_obj");
        RewriteRuleSubtreeStream stream_parents=new RewriteRuleSubtreeStream(adaptor,"rule parents");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:465:9: ( ( L_obj ( NL )? parents )=> L_obj ( NL )? parents block L_end -> ^( OBJ block parents ) | L_obj block L_end -> ^( OBJ block ) )
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==L_obj) ) {
                int LA83_1 = input.LA(2);

                if ( (LA83_1==NL) ) {
                    int LA83_2 = input.LA(3);

                    if ( ((LA83_2>=L_begin && LA83_2<=L_if)||(LA83_2>=L_while && LA83_2<=L_for)||(LA83_2>=L_yield && LA83_2<=L_match)||(LA83_2>=L_val && LA83_2<=L_def)||LA83_2==L_exception||(LA83_2>=A_infinity && LA83_2<=L_nil)||LA83_2==SC||LA83_2==MINUS||LA83_2==A_NOT||LA83_2==U_NOT||(LA83_2>=A_ELLIPSIS && LA83_2<=U_ELLIPSIS)||LA83_2==L_force||(LA83_2>=NL && LA83_2<=Num)||(LA83_2>=String && LA83_2<=ROUND_BRACKET_OPEN)||LA83_2==SQUARE_BRACKET_OPEN||LA83_2==CURLY_BRACKET_OPEN||(LA83_2>=UNDERSCORE && LA83_2<=PRAGMA_PROFILE)) ) {
                        alt83=2;
                    }
                    else if ( (LA83_2==PLUS) && (synpred4_babel17())) {
                        alt83=1;
                    }
                    else if ( (LA83_2==TIMES) && (synpred4_babel17())) {
                        alt83=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 83, 2, input);

                        throw nvae;
                    }
                }
                else if ( ((LA83_1>=L_begin && LA83_1<=L_if)||(LA83_1>=L_while && LA83_1<=L_for)||(LA83_1>=L_yield && LA83_1<=L_match)||(LA83_1>=L_val && LA83_1<=L_def)||LA83_1==L_exception||(LA83_1>=A_infinity && LA83_1<=L_nil)||LA83_1==SC||LA83_1==MINUS||LA83_1==A_NOT||LA83_1==U_NOT||(LA83_1>=A_ELLIPSIS && LA83_1<=U_ELLIPSIS)||LA83_1==L_force||(LA83_1>=Constr && LA83_1<=Num)||(LA83_1>=String && LA83_1<=ROUND_BRACKET_OPEN)||LA83_1==SQUARE_BRACKET_OPEN||LA83_1==CURLY_BRACKET_OPEN||(LA83_1>=UNDERSCORE && LA83_1<=PRAGMA_PROFILE)) ) {
                    alt83=2;
                }
                else if ( (LA83_1==PLUS) && (synpred4_babel17())) {
                    alt83=1;
                }
                else if ( (LA83_1==TIMES) && (synpred4_babel17())) {
                    alt83=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 83, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }
            switch (alt83) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:465:11: ( L_obj ( NL )? parents )=> L_obj ( NL )? parents block L_end
                    {
                    L_obj186=(Token)match(input,L_obj,FOLLOW_L_obj_in_obj_expr2729); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_obj.add(L_obj186);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:465:40: ( NL )?
                    int alt82=2;
                    int LA82_0 = input.LA(1);

                    if ( (LA82_0==NL) ) {
                        alt82=1;
                    }
                    switch (alt82) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:465:40: NL
                            {
                            NL187=(Token)match(input,NL,FOLLOW_NL_in_obj_expr2731); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL187);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_parents_in_obj_expr2734);
                    parents188=parents();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parents.add(parents188.getTree());
                    pushFollow(FOLLOW_block_in_obj_expr2736);
                    block189=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block189.getTree());
                    L_end190=(Token)match(input,L_end,FOLLOW_L_end_in_obj_expr2738); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_end.add(L_end190);



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
                    // 465:64: -> ^( OBJ block parents )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:465:67: ^( OBJ block parents )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:466:17: L_obj block L_end
                    {
                    L_obj191=(Token)match(input,L_obj,FOLLOW_L_obj_in_obj_expr2766); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_obj.add(L_obj191);

                    pushFollow(FOLLOW_block_in_obj_expr2768);
                    block192=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block192.getTree());
                    L_end193=(Token)match(input,L_end,FOLLOW_L_end_in_obj_expr2770); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_end.add(L_end193);



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
                    // 466:35: -> ^( OBJ block )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:466:38: ^( OBJ block )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:468:1: lop_expr : ( ( lambda_expr )=> lambda_expr | op_expr );
    public final babel17Parser.lop_expr_return lop_expr() throws RecognitionException {
        babel17Parser.lop_expr_return retval = new babel17Parser.lop_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.lambda_expr_return lambda_expr194 = null;

        babel17Parser.op_expr_return op_expr195 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:469:2: ( ( lambda_expr )=> lambda_expr | op_expr )
            int alt84=2;
            alt84 = dfa84.predict(input);
            switch (alt84) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:469:4: ( lambda_expr )=> lambda_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_lambda_expr_in_lop_expr2798);
                    lambda_expr194=lambda_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lambda_expr194.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:470:4: op_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_op_expr_in_lop_expr2803);
                    op_expr195=op_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, op_expr195.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:472:1: p_lop_expr : ( ( protected_lambda_expr )=> protected_lambda_expr | p_op_expr );
    public final babel17Parser.p_lop_expr_return p_lop_expr() throws RecognitionException {
        babel17Parser.p_lop_expr_return retval = new babel17Parser.p_lop_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.protected_lambda_expr_return protected_lambda_expr196 = null;

        babel17Parser.p_op_expr_return p_op_expr197 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:473:2: ( ( protected_lambda_expr )=> protected_lambda_expr | p_op_expr )
            int alt85=2;
            alt85 = dfa85.predict(input);
            switch (alt85) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:473:4: ( protected_lambda_expr )=> protected_lambda_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_protected_lambda_expr_in_p_lop_expr2819);
                    protected_lambda_expr196=protected_lambda_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, protected_lambda_expr196.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:474:4: p_op_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_p_op_expr_in_p_lop_expr2824);
                    p_op_expr197=p_op_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_op_expr197.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:476:1: if_expr : L_if ( NL )? protected_expr ( NL )? L_then block ( L_elseif ( NL )? protected_expr ( NL )? L_then block )* ( L_else block )? L_end -> ^( IF ( protected_expr )* ( block )* ) ;
    public final babel17Parser.if_expr_return if_expr() throws RecognitionException {
        babel17Parser.if_expr_return retval = new babel17Parser.if_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_if198=null;
        Token NL199=null;
        Token NL201=null;
        Token L_then202=null;
        Token L_elseif204=null;
        Token NL205=null;
        Token NL207=null;
        Token L_then208=null;
        Token L_else210=null;
        Token L_end212=null;
        babel17Parser.protected_expr_return protected_expr200 = null;

        babel17Parser.block_return block203 = null;

        babel17Parser.protected_expr_return protected_expr206 = null;

        babel17Parser.block_return block209 = null;

        babel17Parser.block_return block211 = null;


        CommonTree L_if198_tree=null;
        CommonTree NL199_tree=null;
        CommonTree NL201_tree=null;
        CommonTree L_then202_tree=null;
        CommonTree L_elseif204_tree=null;
        CommonTree NL205_tree=null;
        CommonTree NL207_tree=null;
        CommonTree L_then208_tree=null;
        CommonTree L_else210_tree=null;
        CommonTree L_end212_tree=null;
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleTokenStream stream_L_else=new RewriteRuleTokenStream(adaptor,"token L_else");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_elseif=new RewriteRuleTokenStream(adaptor,"token L_elseif");
        RewriteRuleTokenStream stream_L_then=new RewriteRuleTokenStream(adaptor,"token L_then");
        RewriteRuleTokenStream stream_L_if=new RewriteRuleTokenStream(adaptor,"token L_if");
        RewriteRuleSubtreeStream stream_protected_expr=new RewriteRuleSubtreeStream(adaptor,"rule protected_expr");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:476:9: ( L_if ( NL )? protected_expr ( NL )? L_then block ( L_elseif ( NL )? protected_expr ( NL )? L_then block )* ( L_else block )? L_end -> ^( IF ( protected_expr )* ( block )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:476:11: L_if ( NL )? protected_expr ( NL )? L_then block ( L_elseif ( NL )? protected_expr ( NL )? L_then block )* ( L_else block )? L_end
            {
            L_if198=(Token)match(input,L_if,FOLLOW_L_if_in_if_expr2835); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_if.add(L_if198);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:476:16: ( NL )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==NL) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:476:16: NL
                    {
                    NL199=(Token)match(input,NL,FOLLOW_NL_in_if_expr2837); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL199);


                    }
                    break;

            }

            pushFollow(FOLLOW_protected_expr_in_if_expr2840);
            protected_expr200=protected_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr200.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:476:35: ( NL )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==NL) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:476:35: NL
                    {
                    NL201=(Token)match(input,NL,FOLLOW_NL_in_if_expr2842); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL201);


                    }
                    break;

            }

            L_then202=(Token)match(input,L_then,FOLLOW_L_then_in_if_expr2845); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_then.add(L_then202);

            pushFollow(FOLLOW_block_in_if_expr2847);
            block203=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block203.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:477:3: ( L_elseif ( NL )? protected_expr ( NL )? L_then block )*
            loop90:
            do {
                int alt90=2;
                int LA90_0 = input.LA(1);

                if ( (LA90_0==L_elseif) ) {
                    alt90=1;
                }


                switch (alt90) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:477:4: L_elseif ( NL )? protected_expr ( NL )? L_then block
            	    {
            	    L_elseif204=(Token)match(input,L_elseif,FOLLOW_L_elseif_in_if_expr2853); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_L_elseif.add(L_elseif204);

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:477:13: ( NL )?
            	    int alt88=2;
            	    int LA88_0 = input.LA(1);

            	    if ( (LA88_0==NL) ) {
            	        alt88=1;
            	    }
            	    switch (alt88) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:477:13: NL
            	            {
            	            NL205=(Token)match(input,NL,FOLLOW_NL_in_if_expr2855); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL205);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_protected_expr_in_if_expr2858);
            	    protected_expr206=protected_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr206.getTree());
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:477:32: ( NL )?
            	    int alt89=2;
            	    int LA89_0 = input.LA(1);

            	    if ( (LA89_0==NL) ) {
            	        alt89=1;
            	    }
            	    switch (alt89) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:477:32: NL
            	            {
            	            NL207=(Token)match(input,NL,FOLLOW_NL_in_if_expr2860); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL207);


            	            }
            	            break;

            	    }

            	    L_then208=(Token)match(input,L_then,FOLLOW_L_then_in_if_expr2863); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_L_then.add(L_then208);

            	    pushFollow(FOLLOW_block_in_if_expr2865);
            	    block209=block();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_block.add(block209.getTree());

            	    }
            	    break;

            	default :
            	    break loop90;
                }
            } while (true);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:478:3: ( L_else block )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==L_else) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:478:4: L_else block
                    {
                    L_else210=(Token)match(input,L_else,FOLLOW_L_else_in_if_expr2873); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_else.add(L_else210);

                    pushFollow(FOLLOW_block_in_if_expr2875);
                    block211=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block211.getTree());

                    }
                    break;

            }

            L_end212=(Token)match(input,L_end,FOLLOW_L_end_in_if_expr2879); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_end.add(L_end212);



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
            // 478:26: -> ^( IF ( protected_expr )* ( block )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:478:29: ^( IF ( protected_expr )* ( block )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IF, "IF"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:478:34: ( protected_expr )*
                while ( stream_protected_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_protected_expr.nextTree());

                }
                stream_protected_expr.reset();
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:478:50: ( block )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:480:1: while_do_expr : L_while ( NL )? protected_expr ( NL )? L_do block L_end -> ^( WHILE_DO protected_expr block ) ;
    public final babel17Parser.while_do_expr_return while_do_expr() throws RecognitionException {
        babel17Parser.while_do_expr_return retval = new babel17Parser.while_do_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_while213=null;
        Token NL214=null;
        Token NL216=null;
        Token L_do217=null;
        Token L_end219=null;
        babel17Parser.protected_expr_return protected_expr215 = null;

        babel17Parser.block_return block218 = null;


        CommonTree L_while213_tree=null;
        CommonTree NL214_tree=null;
        CommonTree NL216_tree=null;
        CommonTree L_do217_tree=null;
        CommonTree L_end219_tree=null;
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_do=new RewriteRuleTokenStream(adaptor,"token L_do");
        RewriteRuleTokenStream stream_L_while=new RewriteRuleTokenStream(adaptor,"token L_while");
        RewriteRuleSubtreeStream stream_protected_expr=new RewriteRuleSubtreeStream(adaptor,"rule protected_expr");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:481:2: ( L_while ( NL )? protected_expr ( NL )? L_do block L_end -> ^( WHILE_DO protected_expr block ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:481:4: L_while ( NL )? protected_expr ( NL )? L_do block L_end
            {
            L_while213=(Token)match(input,L_while,FOLLOW_L_while_in_while_do_expr2903); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_while.add(L_while213);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:481:12: ( NL )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==NL) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:481:12: NL
                    {
                    NL214=(Token)match(input,NL,FOLLOW_NL_in_while_do_expr2905); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL214);


                    }
                    break;

            }

            pushFollow(FOLLOW_protected_expr_in_while_do_expr2908);
            protected_expr215=protected_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr215.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:481:31: ( NL )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==NL) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:481:31: NL
                    {
                    NL216=(Token)match(input,NL,FOLLOW_NL_in_while_do_expr2910); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL216);


                    }
                    break;

            }

            L_do217=(Token)match(input,L_do,FOLLOW_L_do_in_while_do_expr2913); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_do.add(L_do217);

            pushFollow(FOLLOW_block_in_while_do_expr2915);
            block218=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block218.getTree());
            L_end219=(Token)match(input,L_end,FOLLOW_L_end_in_while_do_expr2917); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_end.add(L_end219);



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
            // 482:5: -> ^( WHILE_DO protected_expr block )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:482:8: ^( WHILE_DO protected_expr block )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:484:1: cases : ( full_cases | pattern ( NL )? token_DOUBLE_ARROW block -> ^( CASES ^( NIL_TOKEN pattern block ) ) );
    public final babel17Parser.cases_return cases() throws RecognitionException {
        babel17Parser.cases_return retval = new babel17Parser.cases_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL222=null;
        babel17Parser.full_cases_return full_cases220 = null;

        babel17Parser.pattern_return pattern221 = null;

        babel17Parser.token_DOUBLE_ARROW_return token_DOUBLE_ARROW223 = null;

        babel17Parser.block_return block224 = null;


        CommonTree NL222_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_token_DOUBLE_ARROW=new RewriteRuleSubtreeStream(adaptor,"rule token_DOUBLE_ARROW");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:485:2: ( full_cases | pattern ( NL )? token_DOUBLE_ARROW block -> ^( CASES ^( NIL_TOKEN pattern block ) ) )
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==L_case) ) {
                alt95=1;
            }
            else if ( (LA95_0==L_exception||(LA95_0>=A_infinity && LA95_0<=U_infinity)||(LA95_0>=L_true && LA95_0<=L_false)||LA95_0==L_nil||LA95_0==MINUS||(LA95_0>=A_ELLIPSIS && LA95_0<=U_ELLIPSIS)||(LA95_0>=Constr && LA95_0<=Num)||(LA95_0>=String && LA95_0<=ROUND_BRACKET_OPEN)||LA95_0==SQUARE_BRACKET_OPEN||LA95_0==CURLY_BRACKET_OPEN||LA95_0==UNDERSCORE) ) {
                alt95=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }
            switch (alt95) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:485:4: full_cases
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_full_cases_in_cases2947);
                    full_cases220=full_cases();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, full_cases220.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:486:4: pattern ( NL )? token_DOUBLE_ARROW block
                    {
                    pushFollow(FOLLOW_pattern_in_cases2952);
                    pattern221=pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pattern.add(pattern221.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:486:12: ( NL )?
                    int alt94=2;
                    int LA94_0 = input.LA(1);

                    if ( (LA94_0==NL) ) {
                        alt94=1;
                    }
                    switch (alt94) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:486:12: NL
                            {
                            NL222=(Token)match(input,NL,FOLLOW_NL_in_cases2954); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL222);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_token_DOUBLE_ARROW_in_cases2957);
                    token_DOUBLE_ARROW223=token_DOUBLE_ARROW();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_token_DOUBLE_ARROW.add(token_DOUBLE_ARROW223.getTree());
                    pushFollow(FOLLOW_block_in_cases2959);
                    block224=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block224.getTree());


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
                    // 486:41: -> ^( CASES ^( NIL_TOKEN pattern block ) )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:486:44: ^( CASES ^( NIL_TOKEN pattern block ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CASES, "CASES"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:486:52: ^( NIL_TOKEN pattern block )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:488:1: full_cases : ( case_expr )+ -> ^( CASES ( case_expr )+ ) ;
    public final babel17Parser.full_cases_return full_cases() throws RecognitionException {
        babel17Parser.full_cases_return retval = new babel17Parser.full_cases_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.case_expr_return case_expr225 = null;


        RewriteRuleSubtreeStream stream_case_expr=new RewriteRuleSubtreeStream(adaptor,"rule case_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:489:2: ( ( case_expr )+ -> ^( CASES ( case_expr )+ ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:489:4: ( case_expr )+
            {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:489:4: ( case_expr )+
            int cnt96=0;
            loop96:
            do {
                int alt96=2;
                int LA96_0 = input.LA(1);

                if ( (LA96_0==L_case) ) {
                    alt96=1;
                }


                switch (alt96) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:489:4: case_expr
            	    {
            	    pushFollow(FOLLOW_case_expr_in_full_cases2982);
            	    case_expr225=case_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_case_expr.add(case_expr225.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt96 >= 1 ) break loop96;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(96, input);
                        throw eee;
                }
                cnt96++;
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
            // 489:15: -> ^( CASES ( case_expr )+ )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:489:18: ^( CASES ( case_expr )+ )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:491:1: case_expr : ( L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW block ) -> ^( NIL_TOKEN pattern block ) ;
    public final babel17Parser.case_expr_return case_expr() throws RecognitionException {
        babel17Parser.case_expr_return retval = new babel17Parser.case_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_case226=null;
        Token NL227=null;
        Token NL229=null;
        babel17Parser.pattern_return pattern228 = null;

        babel17Parser.token_DOUBLE_ARROW_return token_DOUBLE_ARROW230 = null;

        babel17Parser.block_return block231 = null;


        CommonTree L_case226_tree=null;
        CommonTree NL227_tree=null;
        CommonTree NL229_tree=null;
        RewriteRuleTokenStream stream_L_case=new RewriteRuleTokenStream(adaptor,"token L_case");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_token_DOUBLE_ARROW=new RewriteRuleSubtreeStream(adaptor,"rule token_DOUBLE_ARROW");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:492:2: ( ( L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW block ) -> ^( NIL_TOKEN pattern block ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:492:4: ( L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW block )
            {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:492:4: ( L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW block )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:492:5: L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW block
            {
            L_case226=(Token)match(input,L_case,FOLLOW_L_case_in_case_expr3003); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_case.add(L_case226);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:492:12: ( NL )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==NL) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:492:12: NL
                    {
                    NL227=(Token)match(input,NL,FOLLOW_NL_in_case_expr3005); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL227);


                    }
                    break;

            }

            pushFollow(FOLLOW_pattern_in_case_expr3008);
            pattern228=pattern();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pattern.add(pattern228.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:492:24: ( NL )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==NL) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:492:24: NL
                    {
                    NL229=(Token)match(input,NL,FOLLOW_NL_in_case_expr3010); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL229);


                    }
                    break;

            }

            pushFollow(FOLLOW_token_DOUBLE_ARROW_in_case_expr3013);
            token_DOUBLE_ARROW230=token_DOUBLE_ARROW();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_token_DOUBLE_ARROW.add(token_DOUBLE_ARROW230.getTree());
            pushFollow(FOLLOW_block_in_case_expr3015);
            block231=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block231.getTree());

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
            // 492:54: -> ^( NIL_TOKEN pattern block )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:492:57: ^( NIL_TOKEN pattern block )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:494:1: match_expr : L_match ( NL )? p_op_expr ( NL )? full_cases L_end -> ^( MATCH p_op_expr full_cases ) ;
    public final babel17Parser.match_expr_return match_expr() throws RecognitionException {
        babel17Parser.match_expr_return retval = new babel17Parser.match_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_match232=null;
        Token NL233=null;
        Token NL235=null;
        Token L_end237=null;
        babel17Parser.p_op_expr_return p_op_expr234 = null;

        babel17Parser.full_cases_return full_cases236 = null;


        CommonTree L_match232_tree=null;
        CommonTree NL233_tree=null;
        CommonTree NL235_tree=null;
        CommonTree L_end237_tree=null;
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_match=new RewriteRuleTokenStream(adaptor,"token L_match");
        RewriteRuleSubtreeStream stream_full_cases=new RewriteRuleSubtreeStream(adaptor,"rule full_cases");
        RewriteRuleSubtreeStream stream_p_op_expr=new RewriteRuleSubtreeStream(adaptor,"rule p_op_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:495:2: ( L_match ( NL )? p_op_expr ( NL )? full_cases L_end -> ^( MATCH p_op_expr full_cases ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:495:4: L_match ( NL )? p_op_expr ( NL )? full_cases L_end
            {
            L_match232=(Token)match(input,L_match,FOLLOW_L_match_in_match_expr3036); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_match.add(L_match232);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:495:12: ( NL )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==NL) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:495:12: NL
                    {
                    NL233=(Token)match(input,NL,FOLLOW_NL_in_match_expr3038); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL233);


                    }
                    break;

            }

            pushFollow(FOLLOW_p_op_expr_in_match_expr3041);
            p_op_expr234=p_op_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_p_op_expr.add(p_op_expr234.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:495:26: ( NL )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==NL) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:495:26: NL
                    {
                    NL235=(Token)match(input,NL,FOLLOW_NL_in_match_expr3043); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL235);


                    }
                    break;

            }

            pushFollow(FOLLOW_full_cases_in_match_expr3046);
            full_cases236=full_cases();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_full_cases.add(full_cases236.getTree());
            L_end237=(Token)match(input,L_end,FOLLOW_L_end_in_match_expr3048); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_end.add(L_end237);



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
            // 496:5: -> ^( MATCH p_op_expr full_cases )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:496:8: ^( MATCH p_op_expr full_cases )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:498:1: lambda_expr : lambda_cases -> ^( LAMBDA lambda_cases ) ;
    public final babel17Parser.lambda_expr_return lambda_expr() throws RecognitionException {
        babel17Parser.lambda_expr_return retval = new babel17Parser.lambda_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.lambda_cases_return lambda_cases238 = null;


        RewriteRuleSubtreeStream stream_lambda_cases=new RewriteRuleSubtreeStream(adaptor,"rule lambda_cases");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:499:2: ( lambda_cases -> ^( LAMBDA lambda_cases ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:499:4: lambda_cases
            {
            pushFollow(FOLLOW_lambda_cases_in_lambda_expr3074);
            lambda_cases238=lambda_cases();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_lambda_cases.add(lambda_cases238.getTree());


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
            // 499:17: -> ^( LAMBDA lambda_cases )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:499:20: ^( LAMBDA lambda_cases )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:501:1: lambda_cases : pattern ( NL )? token_DOUBLE_ARROW ( NL )? lop_expr -> ^( CASES ^( NIL_TOKEN pattern ^( BLOCK lop_expr ) ) ) ;
    public final babel17Parser.lambda_cases_return lambda_cases() throws RecognitionException {
        babel17Parser.lambda_cases_return retval = new babel17Parser.lambda_cases_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL240=null;
        Token NL242=null;
        babel17Parser.pattern_return pattern239 = null;

        babel17Parser.token_DOUBLE_ARROW_return token_DOUBLE_ARROW241 = null;

        babel17Parser.lop_expr_return lop_expr243 = null;


        CommonTree NL240_tree=null;
        CommonTree NL242_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_token_DOUBLE_ARROW=new RewriteRuleSubtreeStream(adaptor,"rule token_DOUBLE_ARROW");
        RewriteRuleSubtreeStream stream_lop_expr=new RewriteRuleSubtreeStream(adaptor,"rule lop_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:502:2: ( pattern ( NL )? token_DOUBLE_ARROW ( NL )? lop_expr -> ^( CASES ^( NIL_TOKEN pattern ^( BLOCK lop_expr ) ) ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:502:4: pattern ( NL )? token_DOUBLE_ARROW ( NL )? lop_expr
            {
            pushFollow(FOLLOW_pattern_in_lambda_cases3092);
            pattern239=pattern();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pattern.add(pattern239.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:502:12: ( NL )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==NL) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:502:12: NL
                    {
                    NL240=(Token)match(input,NL,FOLLOW_NL_in_lambda_cases3094); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL240);


                    }
                    break;

            }

            pushFollow(FOLLOW_token_DOUBLE_ARROW_in_lambda_cases3097);
            token_DOUBLE_ARROW241=token_DOUBLE_ARROW();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_token_DOUBLE_ARROW.add(token_DOUBLE_ARROW241.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:502:35: ( NL )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==NL) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:502:35: NL
                    {
                    NL242=(Token)match(input,NL,FOLLOW_NL_in_lambda_cases3099); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL242);


                    }
                    break;

            }

            pushFollow(FOLLOW_lop_expr_in_lambda_cases3102);
            lop_expr243=lop_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_lop_expr.add(lop_expr243.getTree());


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
            // 502:48: -> ^( CASES ^( NIL_TOKEN pattern ^( BLOCK lop_expr ) ) )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:502:51: ^( CASES ^( NIL_TOKEN pattern ^( BLOCK lop_expr ) ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CASES, "CASES"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:502:59: ^( NIL_TOKEN pattern ^( BLOCK lop_expr ) )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_2);

                adaptor.addChild(root_2, stream_pattern.nextTree());
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:502:79: ^( BLOCK lop_expr )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:504:1: protected_lambda_expr : protected_lambda_cases -> ^( LAMBDA protected_lambda_cases ) ;
    public final babel17Parser.protected_lambda_expr_return protected_lambda_expr() throws RecognitionException {
        babel17Parser.protected_lambda_expr_return retval = new babel17Parser.protected_lambda_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.protected_lambda_cases_return protected_lambda_cases244 = null;


        RewriteRuleSubtreeStream stream_protected_lambda_cases=new RewriteRuleSubtreeStream(adaptor,"rule protected_lambda_cases");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:505:2: ( protected_lambda_cases -> ^( LAMBDA protected_lambda_cases ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:505:4: protected_lambda_cases
            {
            pushFollow(FOLLOW_protected_lambda_cases_in_protected_lambda_expr3130);
            protected_lambda_cases244=protected_lambda_cases();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_protected_lambda_cases.add(protected_lambda_cases244.getTree());


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
            // 505:27: -> ^( LAMBDA protected_lambda_cases )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:505:30: ^( LAMBDA protected_lambda_cases )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:507:1: p_lambda_case_expr : ( L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block ) -> ^( NIL_TOKEN pattern pure_block ) ;
    public final babel17Parser.p_lambda_case_expr_return p_lambda_case_expr() throws RecognitionException {
        babel17Parser.p_lambda_case_expr_return retval = new babel17Parser.p_lambda_case_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_case245=null;
        Token NL246=null;
        Token NL248=null;
        Token NL250=null;
        babel17Parser.pattern_return pattern247 = null;

        babel17Parser.token_DOUBLE_ARROW_return token_DOUBLE_ARROW249 = null;

        babel17Parser.pure_block_return pure_block251 = null;


        CommonTree L_case245_tree=null;
        CommonTree NL246_tree=null;
        CommonTree NL248_tree=null;
        CommonTree NL250_tree=null;
        RewriteRuleTokenStream stream_L_case=new RewriteRuleTokenStream(adaptor,"token L_case");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_token_DOUBLE_ARROW=new RewriteRuleSubtreeStream(adaptor,"rule token_DOUBLE_ARROW");
        RewriteRuleSubtreeStream stream_pure_block=new RewriteRuleSubtreeStream(adaptor,"rule pure_block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:508:2: ( ( L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block ) -> ^( NIL_TOKEN pattern pure_block ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:508:4: ( L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block )
            {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:508:4: ( L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:508:5: L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block
            {
            L_case245=(Token)match(input,L_case,FOLLOW_L_case_in_p_lambda_case_expr3148); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_case.add(L_case245);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:508:12: ( NL )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==NL) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:508:12: NL
                    {
                    NL246=(Token)match(input,NL,FOLLOW_NL_in_p_lambda_case_expr3150); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL246);


                    }
                    break;

            }

            pushFollow(FOLLOW_pattern_in_p_lambda_case_expr3153);
            pattern247=pattern();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pattern.add(pattern247.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:508:24: ( NL )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==NL) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:508:24: NL
                    {
                    NL248=(Token)match(input,NL,FOLLOW_NL_in_p_lambda_case_expr3155); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL248);


                    }
                    break;

            }

            pushFollow(FOLLOW_token_DOUBLE_ARROW_in_p_lambda_case_expr3158);
            token_DOUBLE_ARROW249=token_DOUBLE_ARROW();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_token_DOUBLE_ARROW.add(token_DOUBLE_ARROW249.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:508:47: ( NL )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==NL) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:508:47: NL
                    {
                    NL250=(Token)match(input,NL,FOLLOW_NL_in_p_lambda_case_expr3160); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL250);


                    }
                    break;

            }

            pushFollow(FOLLOW_pure_block_in_p_lambda_case_expr3163);
            pure_block251=pure_block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pure_block.add(pure_block251.getTree());

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
            // 508:63: -> ^( NIL_TOKEN pattern pure_block )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:508:66: ^( NIL_TOKEN pattern pure_block )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:510:1: protected_lambda_cases : ( pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block -> ^( CASES ^( NIL_TOKEN pattern pure_block ) ) | ( p_lambda_case_expr )+ -> ^( CASES ( p_lambda_case_expr )+ ) );
    public final babel17Parser.protected_lambda_cases_return protected_lambda_cases() throws RecognitionException {
        babel17Parser.protected_lambda_cases_return retval = new babel17Parser.protected_lambda_cases_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL253=null;
        Token NL255=null;
        babel17Parser.pattern_return pattern252 = null;

        babel17Parser.token_DOUBLE_ARROW_return token_DOUBLE_ARROW254 = null;

        babel17Parser.pure_block_return pure_block256 = null;

        babel17Parser.p_lambda_case_expr_return p_lambda_case_expr257 = null;


        CommonTree NL253_tree=null;
        CommonTree NL255_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_token_DOUBLE_ARROW=new RewriteRuleSubtreeStream(adaptor,"rule token_DOUBLE_ARROW");
        RewriteRuleSubtreeStream stream_p_lambda_case_expr=new RewriteRuleSubtreeStream(adaptor,"rule p_lambda_case_expr");
        RewriteRuleSubtreeStream stream_pure_block=new RewriteRuleSubtreeStream(adaptor,"rule pure_block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:511:2: ( pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block -> ^( CASES ^( NIL_TOKEN pattern pure_block ) ) | ( p_lambda_case_expr )+ -> ^( CASES ( p_lambda_case_expr )+ ) )
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==L_exception||(LA109_0>=A_infinity && LA109_0<=U_infinity)||(LA109_0>=L_true && LA109_0<=L_false)||LA109_0==L_nil||LA109_0==MINUS||(LA109_0>=A_ELLIPSIS && LA109_0<=U_ELLIPSIS)||(LA109_0>=Constr && LA109_0<=Num)||(LA109_0>=String && LA109_0<=ROUND_BRACKET_OPEN)||LA109_0==SQUARE_BRACKET_OPEN||LA109_0==CURLY_BRACKET_OPEN||LA109_0==UNDERSCORE) ) {
                alt109=1;
            }
            else if ( (LA109_0==L_case) ) {
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:511:4: pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block
                    {
                    pushFollow(FOLLOW_pattern_in_protected_lambda_cases3184);
                    pattern252=pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pattern.add(pattern252.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:511:12: ( NL )?
                    int alt106=2;
                    int LA106_0 = input.LA(1);

                    if ( (LA106_0==NL) ) {
                        alt106=1;
                    }
                    switch (alt106) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:511:12: NL
                            {
                            NL253=(Token)match(input,NL,FOLLOW_NL_in_protected_lambda_cases3186); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL253);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_token_DOUBLE_ARROW_in_protected_lambda_cases3189);
                    token_DOUBLE_ARROW254=token_DOUBLE_ARROW();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_token_DOUBLE_ARROW.add(token_DOUBLE_ARROW254.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:511:35: ( NL )?
                    int alt107=2;
                    int LA107_0 = input.LA(1);

                    if ( (LA107_0==NL) ) {
                        alt107=1;
                    }
                    switch (alt107) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:511:35: NL
                            {
                            NL255=(Token)match(input,NL,FOLLOW_NL_in_protected_lambda_cases3191); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL255);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_pure_block_in_protected_lambda_cases3194);
                    pure_block256=pure_block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pure_block.add(pure_block256.getTree());


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
                    // 511:50: -> ^( CASES ^( NIL_TOKEN pattern pure_block ) )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:511:53: ^( CASES ^( NIL_TOKEN pattern pure_block ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CASES, "CASES"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:511:61: ^( NIL_TOKEN pattern pure_block )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:512:4: ( p_lambda_case_expr )+
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:512:4: ( p_lambda_case_expr )+
                    int cnt108=0;
                    loop108:
                    do {
                        int alt108=2;
                        int LA108_0 = input.LA(1);

                        if ( (LA108_0==L_case) ) {
                            alt108=1;
                        }


                        switch (alt108) {
                    	case 1 :
                    	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:512:4: p_lambda_case_expr
                    	    {
                    	    pushFollow(FOLLOW_p_lambda_case_expr_in_protected_lambda_cases3213);
                    	    p_lambda_case_expr257=p_lambda_case_expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_p_lambda_case_expr.add(p_lambda_case_expr257.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt108 >= 1 ) break loop108;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(108, input);
                                throw eee;
                        }
                        cnt108++;
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
                    // 512:24: -> ^( CASES ( p_lambda_case_expr )+ )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:512:27: ^( CASES ( p_lambda_case_expr )+ )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:514:1: for_expr : L_for ( NL )? pattern ( NL )? L_in ( NL )? protected_expr ( NL )? L_do block L_end -> ^( FOR_EXPR pattern protected_expr block ) ;
    public final babel17Parser.for_expr_return for_expr() throws RecognitionException {
        babel17Parser.for_expr_return retval = new babel17Parser.for_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_for258=null;
        Token NL259=null;
        Token NL261=null;
        Token L_in262=null;
        Token NL263=null;
        Token NL265=null;
        Token L_do266=null;
        Token L_end268=null;
        babel17Parser.pattern_return pattern260 = null;

        babel17Parser.protected_expr_return protected_expr264 = null;

        babel17Parser.block_return block267 = null;


        CommonTree L_for258_tree=null;
        CommonTree NL259_tree=null;
        CommonTree NL261_tree=null;
        CommonTree L_in262_tree=null;
        CommonTree NL263_tree=null;
        CommonTree NL265_tree=null;
        CommonTree L_do266_tree=null;
        CommonTree L_end268_tree=null;
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleTokenStream stream_L_for=new RewriteRuleTokenStream(adaptor,"token L_for");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_in=new RewriteRuleTokenStream(adaptor,"token L_in");
        RewriteRuleTokenStream stream_L_do=new RewriteRuleTokenStream(adaptor,"token L_do");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_protected_expr=new RewriteRuleSubtreeStream(adaptor,"rule protected_expr");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:514:9: ( L_for ( NL )? pattern ( NL )? L_in ( NL )? protected_expr ( NL )? L_do block L_end -> ^( FOR_EXPR pattern protected_expr block ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:514:11: L_for ( NL )? pattern ( NL )? L_in ( NL )? protected_expr ( NL )? L_do block L_end
            {
            L_for258=(Token)match(input,L_for,FOLLOW_L_for_in_for_expr3230); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_for.add(L_for258);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:514:17: ( NL )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==NL) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:514:17: NL
                    {
                    NL259=(Token)match(input,NL,FOLLOW_NL_in_for_expr3232); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL259);


                    }
                    break;

            }

            pushFollow(FOLLOW_pattern_in_for_expr3235);
            pattern260=pattern();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pattern.add(pattern260.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:514:29: ( NL )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==NL) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:514:29: NL
                    {
                    NL261=(Token)match(input,NL,FOLLOW_NL_in_for_expr3237); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL261);


                    }
                    break;

            }

            L_in262=(Token)match(input,L_in,FOLLOW_L_in_in_for_expr3240); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_in.add(L_in262);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:514:38: ( NL )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==NL) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:514:38: NL
                    {
                    NL263=(Token)match(input,NL,FOLLOW_NL_in_for_expr3242); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL263);


                    }
                    break;

            }

            pushFollow(FOLLOW_protected_expr_in_for_expr3245);
            protected_expr264=protected_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr264.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:514:57: ( NL )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==NL) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:514:57: NL
                    {
                    NL265=(Token)match(input,NL,FOLLOW_NL_in_for_expr3247); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL265);


                    }
                    break;

            }

            L_do266=(Token)match(input,L_do,FOLLOW_L_do_in_for_expr3250); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_do.add(L_do266);

            pushFollow(FOLLOW_block_in_for_expr3252);
            block267=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block267.getTree());
            L_end268=(Token)match(input,L_end,FOLLOW_L_end_in_for_expr3254); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_end.add(L_end268);



            // AST REWRITE
            // elements: protected_expr, block, pattern
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 515:5: -> ^( FOR_EXPR pattern protected_expr block )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:515:8: ^( FOR_EXPR pattern protected_expr block )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:517:1: op_expr : ( builtin_primitive op_expr | bool_expr );
    public final babel17Parser.op_expr_return op_expr() throws RecognitionException {
        babel17Parser.op_expr_return retval = new babel17Parser.op_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.builtin_primitive_return builtin_primitive269 = null;

        babel17Parser.op_expr_return op_expr270 = null;

        babel17Parser.bool_expr_return bool_expr271 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:517:9: ( builtin_primitive op_expr | bool_expr )
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==L_exception||(LA114_0>=L_concurrent && LA114_0<=L_lazy)||LA114_0==L_random||LA114_0==L_force) ) {
                alt114=1;
            }
            else if ( (LA114_0==L_begin||(LA114_0>=L_with && LA114_0<=L_if)||(LA114_0>=L_while && LA114_0<=L_for)||LA114_0==L_match||(LA114_0>=A_infinity && LA114_0<=U_infinity)||(LA114_0>=L_true && LA114_0<=L_this)||LA114_0==L_nil||LA114_0==MINUS||LA114_0==A_NOT||LA114_0==U_NOT||(LA114_0>=Constr && LA114_0<=Num)||(LA114_0>=String && LA114_0<=ROUND_BRACKET_OPEN)||LA114_0==SQUARE_BRACKET_OPEN||LA114_0==CURLY_BRACKET_OPEN) ) {
                alt114=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 114, 0, input);

                throw nvae;
            }
            switch (alt114) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:517:11: builtin_primitive op_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_builtin_primitive_in_op_expr3279);
                    builtin_primitive269=builtin_primitive();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(builtin_primitive269.getTree(), root_0);
                    pushFollow(FOLLOW_op_expr_in_op_expr3282);
                    op_expr270=op_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, op_expr270.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:518:4: bool_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_bool_expr_in_op_expr3287);
                    bool_expr271=bool_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_expr271.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:520:1: p_op_expr : ( builtin_primitive ( NL )? p_op_expr | p_bool_expr );
    public final babel17Parser.p_op_expr_return p_op_expr() throws RecognitionException {
        babel17Parser.p_op_expr_return retval = new babel17Parser.p_op_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL273=null;
        babel17Parser.builtin_primitive_return builtin_primitive272 = null;

        babel17Parser.p_op_expr_return p_op_expr274 = null;

        babel17Parser.p_bool_expr_return p_bool_expr275 = null;


        CommonTree NL273_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:521:2: ( builtin_primitive ( NL )? p_op_expr | p_bool_expr )
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==L_exception||(LA116_0>=L_concurrent && LA116_0<=L_lazy)||LA116_0==L_random||LA116_0==L_force) ) {
                alt116=1;
            }
            else if ( (LA116_0==L_begin||(LA116_0>=L_with && LA116_0<=L_if)||(LA116_0>=L_while && LA116_0<=L_for)||LA116_0==L_match||(LA116_0>=A_infinity && LA116_0<=U_infinity)||(LA116_0>=L_true && LA116_0<=L_this)||LA116_0==L_nil||LA116_0==MINUS||LA116_0==A_NOT||LA116_0==U_NOT||(LA116_0>=Constr && LA116_0<=Num)||(LA116_0>=String && LA116_0<=ROUND_BRACKET_OPEN)||LA116_0==SQUARE_BRACKET_OPEN||LA116_0==CURLY_BRACKET_OPEN) ) {
                alt116=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 116, 0, input);

                throw nvae;
            }
            switch (alt116) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:521:4: builtin_primitive ( NL )? p_op_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_builtin_primitive_in_p_op_expr3297);
                    builtin_primitive272=builtin_primitive();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(builtin_primitive272.getTree(), root_0);
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:521:25: ( NL )?
                    int alt115=2;
                    int LA115_0 = input.LA(1);

                    if ( (LA115_0==NL) ) {
                        alt115=1;
                    }
                    switch (alt115) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:521:25: NL
                            {
                            NL273=(Token)match(input,NL,FOLLOW_NL_in_p_op_expr3300); if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_p_op_expr_in_p_op_expr3304);
                    p_op_expr274=p_op_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_op_expr274.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:522:4: p_bool_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_p_bool_expr_in_p_op_expr3309);
                    p_bool_expr275=p_bool_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_bool_expr275.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:525:1: builtin_primitive : ( L_random | L_exception | L_lazy | L_choose | L_concurrent | L_force );
    public final babel17Parser.builtin_primitive_return builtin_primitive() throws RecognitionException {
        babel17Parser.builtin_primitive_return retval = new babel17Parser.builtin_primitive_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set276=null;

        CommonTree set276_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:526:2: ( L_random | L_exception | L_lazy | L_choose | L_concurrent | L_force )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set276=(Token)input.LT(1);
            if ( input.LA(1)==L_exception||(input.LA(1)>=L_concurrent && input.LA(1)<=L_lazy)||input.LA(1)==L_random||input.LA(1)==L_force ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set276));
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:528:1: bool_expr : bool_or_expr ;
    public final babel17Parser.bool_expr_return bool_expr() throws RecognitionException {
        babel17Parser.bool_expr_return retval = new babel17Parser.bool_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.bool_or_expr_return bool_or_expr277 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:529:2: ( bool_or_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:529:4: bool_or_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bool_or_expr_in_bool_expr3349);
            bool_or_expr277=bool_or_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_or_expr277.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:531:1: p_bool_expr : p_bool_or_expr ;
    public final babel17Parser.p_bool_expr_return p_bool_expr() throws RecognitionException {
        babel17Parser.p_bool_expr_return retval = new babel17Parser.p_bool_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.p_bool_or_expr_return p_bool_or_expr278 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:532:2: ( p_bool_or_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:532:4: p_bool_or_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_bool_or_expr_in_p_bool_expr3359);
            p_bool_or_expr278=p_bool_or_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_bool_or_expr278.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:534:1: bool_or_expr : bool_and_expr ( ( NL )? token_OR ( NL )? bool_and_expr )* ;
    public final babel17Parser.bool_or_expr_return bool_or_expr() throws RecognitionException {
        babel17Parser.bool_or_expr_return retval = new babel17Parser.bool_or_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL280=null;
        Token NL282=null;
        babel17Parser.bool_and_expr_return bool_and_expr279 = null;

        babel17Parser.token_OR_return token_OR281 = null;

        babel17Parser.bool_and_expr_return bool_and_expr283 = null;


        CommonTree NL280_tree=null;
        CommonTree NL282_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:535:2: ( bool_and_expr ( ( NL )? token_OR ( NL )? bool_and_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:535:4: bool_and_expr ( ( NL )? token_OR ( NL )? bool_and_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bool_and_expr_in_bool_or_expr3368);
            bool_and_expr279=bool_and_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_and_expr279.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:535:18: ( ( NL )? token_OR ( NL )? bool_and_expr )*
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
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:535:19: ( NL )? token_OR ( NL )? bool_and_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:535:21: ( NL )?
            	    int alt117=2;
            	    int LA117_0 = input.LA(1);

            	    if ( (LA117_0==NL) ) {
            	        alt117=1;
            	    }
            	    switch (alt117) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:535:21: NL
            	            {
            	            NL280=(Token)match(input,NL,FOLLOW_NL_in_bool_or_expr3371); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_token_OR_in_bool_or_expr3375);
            	    token_OR281=token_OR();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(token_OR281.getTree(), root_0);
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:535:36: ( NL )?
            	    int alt118=2;
            	    int LA118_0 = input.LA(1);

            	    if ( (LA118_0==NL) ) {
            	        alt118=1;
            	    }
            	    switch (alt118) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:535:36: NL
            	            {
            	            NL282=(Token)match(input,NL,FOLLOW_NL_in_bool_or_expr3378); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_bool_and_expr_in_bool_or_expr3382);
            	    bool_and_expr283=bool_and_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_and_expr283.getTree());

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
    // $ANTLR end "bool_or_expr"

    public static class p_bool_or_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "p_bool_or_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:537:1: p_bool_or_expr : p_bool_and_expr ( ( NL )? token_OR ( NL )? p_bool_and_expr )* ;
    public final babel17Parser.p_bool_or_expr_return p_bool_or_expr() throws RecognitionException {
        babel17Parser.p_bool_or_expr_return retval = new babel17Parser.p_bool_or_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL285=null;
        Token NL287=null;
        babel17Parser.p_bool_and_expr_return p_bool_and_expr284 = null;

        babel17Parser.token_OR_return token_OR286 = null;

        babel17Parser.p_bool_and_expr_return p_bool_and_expr288 = null;


        CommonTree NL285_tree=null;
        CommonTree NL287_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:538:2: ( p_bool_and_expr ( ( NL )? token_OR ( NL )? p_bool_and_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:538:4: p_bool_and_expr ( ( NL )? token_OR ( NL )? p_bool_and_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_bool_and_expr_in_p_bool_or_expr3394);
            p_bool_and_expr284=p_bool_and_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_bool_and_expr284.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:538:20: ( ( NL )? token_OR ( NL )? p_bool_and_expr )*
            loop122:
            do {
                int alt122=2;
                int LA122_0 = input.LA(1);

                if ( (LA122_0==NL) ) {
                    int LA122_1 = input.LA(2);

                    if ( (LA122_1==A_OR||LA122_1==U_OR) ) {
                        alt122=1;
                    }


                }
                else if ( (LA122_0==A_OR||LA122_0==U_OR) ) {
                    alt122=1;
                }


                switch (alt122) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:538:21: ( NL )? token_OR ( NL )? p_bool_and_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:538:23: ( NL )?
            	    int alt120=2;
            	    int LA120_0 = input.LA(1);

            	    if ( (LA120_0==NL) ) {
            	        alt120=1;
            	    }
            	    switch (alt120) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:538:23: NL
            	            {
            	            NL285=(Token)match(input,NL,FOLLOW_NL_in_p_bool_or_expr3397); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_token_OR_in_p_bool_or_expr3401);
            	    token_OR286=token_OR();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(token_OR286.getTree(), root_0);
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:538:38: ( NL )?
            	    int alt121=2;
            	    int LA121_0 = input.LA(1);

            	    if ( (LA121_0==NL) ) {
            	        alt121=1;
            	    }
            	    switch (alt121) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:538:38: NL
            	            {
            	            NL287=(Token)match(input,NL,FOLLOW_NL_in_p_bool_or_expr3404); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_bool_and_expr_in_p_bool_or_expr3408);
            	    p_bool_and_expr288=p_bool_and_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_bool_and_expr288.getTree());

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
    // $ANTLR end "p_bool_or_expr"

    public static class bool_and_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bool_and_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:540:1: bool_and_expr : bool_not_expr ( ( NL )? token_AND ( NL )? bool_not_expr )* ;
    public final babel17Parser.bool_and_expr_return bool_and_expr() throws RecognitionException {
        babel17Parser.bool_and_expr_return retval = new babel17Parser.bool_and_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL290=null;
        Token NL292=null;
        babel17Parser.bool_not_expr_return bool_not_expr289 = null;

        babel17Parser.token_AND_return token_AND291 = null;

        babel17Parser.bool_not_expr_return bool_not_expr293 = null;


        CommonTree NL290_tree=null;
        CommonTree NL292_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:541:2: ( bool_not_expr ( ( NL )? token_AND ( NL )? bool_not_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:541:4: bool_not_expr ( ( NL )? token_AND ( NL )? bool_not_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bool_not_expr_in_bool_and_expr3420);
            bool_not_expr289=bool_not_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_not_expr289.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:541:18: ( ( NL )? token_AND ( NL )? bool_not_expr )*
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
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:541:19: ( NL )? token_AND ( NL )? bool_not_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:541:21: ( NL )?
            	    int alt123=2;
            	    int LA123_0 = input.LA(1);

            	    if ( (LA123_0==NL) ) {
            	        alt123=1;
            	    }
            	    switch (alt123) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:541:21: NL
            	            {
            	            NL290=(Token)match(input,NL,FOLLOW_NL_in_bool_and_expr3423); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_token_AND_in_bool_and_expr3427);
            	    token_AND291=token_AND();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(token_AND291.getTree(), root_0);
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:541:37: ( NL )?
            	    int alt124=2;
            	    int LA124_0 = input.LA(1);

            	    if ( (LA124_0==NL) ) {
            	        alt124=1;
            	    }
            	    switch (alt124) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:541:37: NL
            	            {
            	            NL292=(Token)match(input,NL,FOLLOW_NL_in_bool_and_expr3430); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_bool_not_expr_in_bool_and_expr3434);
            	    bool_not_expr293=bool_not_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_not_expr293.getTree());

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
    // $ANTLR end "bool_and_expr"

    public static class p_bool_and_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "p_bool_and_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:543:1: p_bool_and_expr : p_bool_not_expr ( ( NL )? token_AND ( NL )? p_bool_not_expr )* ;
    public final babel17Parser.p_bool_and_expr_return p_bool_and_expr() throws RecognitionException {
        babel17Parser.p_bool_and_expr_return retval = new babel17Parser.p_bool_and_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL295=null;
        Token NL297=null;
        babel17Parser.p_bool_not_expr_return p_bool_not_expr294 = null;

        babel17Parser.token_AND_return token_AND296 = null;

        babel17Parser.p_bool_not_expr_return p_bool_not_expr298 = null;


        CommonTree NL295_tree=null;
        CommonTree NL297_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:544:2: ( p_bool_not_expr ( ( NL )? token_AND ( NL )? p_bool_not_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:544:4: p_bool_not_expr ( ( NL )? token_AND ( NL )? p_bool_not_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_bool_not_expr_in_p_bool_and_expr3446);
            p_bool_not_expr294=p_bool_not_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_bool_not_expr294.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:544:20: ( ( NL )? token_AND ( NL )? p_bool_not_expr )*
            loop128:
            do {
                int alt128=2;
                int LA128_0 = input.LA(1);

                if ( (LA128_0==NL) ) {
                    int LA128_1 = input.LA(2);

                    if ( (LA128_1==A_AND||LA128_1==U_AND) ) {
                        alt128=1;
                    }


                }
                else if ( (LA128_0==A_AND||LA128_0==U_AND) ) {
                    alt128=1;
                }


                switch (alt128) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:544:21: ( NL )? token_AND ( NL )? p_bool_not_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:544:23: ( NL )?
            	    int alt126=2;
            	    int LA126_0 = input.LA(1);

            	    if ( (LA126_0==NL) ) {
            	        alt126=1;
            	    }
            	    switch (alt126) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:544:23: NL
            	            {
            	            NL295=(Token)match(input,NL,FOLLOW_NL_in_p_bool_and_expr3449); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_token_AND_in_p_bool_and_expr3453);
            	    token_AND296=token_AND();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(token_AND296.getTree(), root_0);
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:544:39: ( NL )?
            	    int alt127=2;
            	    int LA127_0 = input.LA(1);

            	    if ( (LA127_0==NL) ) {
            	        alt127=1;
            	    }
            	    switch (alt127) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:544:39: NL
            	            {
            	            NL297=(Token)match(input,NL,FOLLOW_NL_in_p_bool_and_expr3456); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_bool_not_expr_in_p_bool_and_expr3460);
            	    p_bool_not_expr298=p_bool_not_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_bool_not_expr298.getTree());

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
    // $ANTLR end "p_bool_and_expr"

    public static class bool_not_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bool_not_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:547:1: bool_not_expr : ( token_NOT ( NL )? bool_not_expr | rel_expr );
    public final babel17Parser.bool_not_expr_return bool_not_expr() throws RecognitionException {
        babel17Parser.bool_not_expr_return retval = new babel17Parser.bool_not_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL300=null;
        babel17Parser.token_NOT_return token_NOT299 = null;

        babel17Parser.bool_not_expr_return bool_not_expr301 = null;

        babel17Parser.rel_expr_return rel_expr302 = null;


        CommonTree NL300_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:548:2: ( token_NOT ( NL )? bool_not_expr | rel_expr )
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==A_NOT||LA130_0==U_NOT) ) {
                alt130=1;
            }
            else if ( (LA130_0==L_begin||(LA130_0>=L_with && LA130_0<=L_if)||(LA130_0>=L_while && LA130_0<=L_for)||LA130_0==L_match||(LA130_0>=A_infinity && LA130_0<=U_infinity)||(LA130_0>=L_true && LA130_0<=L_this)||LA130_0==L_nil||LA130_0==MINUS||(LA130_0>=Constr && LA130_0<=Num)||(LA130_0>=String && LA130_0<=ROUND_BRACKET_OPEN)||LA130_0==SQUARE_BRACKET_OPEN||LA130_0==CURLY_BRACKET_OPEN) ) {
                alt130=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 130, 0, input);

                throw nvae;
            }
            switch (alt130) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:548:4: token_NOT ( NL )? bool_not_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_NOT_in_bool_not_expr3472);
                    token_NOT299=token_NOT();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(token_NOT299.getTree(), root_0);
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:548:17: ( NL )?
                    int alt129=2;
                    int LA129_0 = input.LA(1);

                    if ( (LA129_0==NL) ) {
                        alt129=1;
                    }
                    switch (alt129) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:548:17: NL
                            {
                            NL300=(Token)match(input,NL,FOLLOW_NL_in_bool_not_expr3475); if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_bool_not_expr_in_bool_not_expr3479);
                    bool_not_expr301=bool_not_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_not_expr301.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:549:4: rel_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_rel_expr_in_bool_not_expr3484);
                    rel_expr302=rel_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rel_expr302.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:551:1: p_bool_not_expr : ( token_NOT ( NL )? p_bool_not_expr | p_rel_expr );
    public final babel17Parser.p_bool_not_expr_return p_bool_not_expr() throws RecognitionException {
        babel17Parser.p_bool_not_expr_return retval = new babel17Parser.p_bool_not_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL304=null;
        babel17Parser.token_NOT_return token_NOT303 = null;

        babel17Parser.p_bool_not_expr_return p_bool_not_expr305 = null;

        babel17Parser.p_rel_expr_return p_rel_expr306 = null;


        CommonTree NL304_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:552:2: ( token_NOT ( NL )? p_bool_not_expr | p_rel_expr )
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==A_NOT||LA132_0==U_NOT) ) {
                alt132=1;
            }
            else if ( (LA132_0==L_begin||(LA132_0>=L_with && LA132_0<=L_if)||(LA132_0>=L_while && LA132_0<=L_for)||LA132_0==L_match||(LA132_0>=A_infinity && LA132_0<=U_infinity)||(LA132_0>=L_true && LA132_0<=L_this)||LA132_0==L_nil||LA132_0==MINUS||(LA132_0>=Constr && LA132_0<=Num)||(LA132_0>=String && LA132_0<=ROUND_BRACKET_OPEN)||LA132_0==SQUARE_BRACKET_OPEN||LA132_0==CURLY_BRACKET_OPEN) ) {
                alt132=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 132, 0, input);

                throw nvae;
            }
            switch (alt132) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:552:4: token_NOT ( NL )? p_bool_not_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_NOT_in_p_bool_not_expr3495);
                    token_NOT303=token_NOT();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(token_NOT303.getTree(), root_0);
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:552:17: ( NL )?
                    int alt131=2;
                    int LA131_0 = input.LA(1);

                    if ( (LA131_0==NL) ) {
                        alt131=1;
                    }
                    switch (alt131) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:552:17: NL
                            {
                            NL304=(Token)match(input,NL,FOLLOW_NL_in_p_bool_not_expr3498); if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_p_bool_not_expr_in_p_bool_not_expr3502);
                    p_bool_not_expr305=p_bool_not_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_bool_not_expr305.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:553:4: p_rel_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_p_rel_expr_in_p_bool_not_expr3507);
                    p_rel_expr306=p_rel_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_rel_expr306.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:555:1: rel_expr : arith_expr ( ( NL )? rel_op ( NL )? arith_expr )* -> ^( COMPARE arith_expr ( rel_op arith_expr )* ) ;
    public final babel17Parser.rel_expr_return rel_expr() throws RecognitionException {
        babel17Parser.rel_expr_return retval = new babel17Parser.rel_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL308=null;
        Token NL310=null;
        babel17Parser.arith_expr_return arith_expr307 = null;

        babel17Parser.rel_op_return rel_op309 = null;

        babel17Parser.arith_expr_return arith_expr311 = null;


        CommonTree NL308_tree=null;
        CommonTree NL310_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_arith_expr=new RewriteRuleSubtreeStream(adaptor,"rule arith_expr");
        RewriteRuleSubtreeStream stream_rel_op=new RewriteRuleSubtreeStream(adaptor,"rule rel_op");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:556:2: ( arith_expr ( ( NL )? rel_op ( NL )? arith_expr )* -> ^( COMPARE arith_expr ( rel_op arith_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:556:4: arith_expr ( ( NL )? rel_op ( NL )? arith_expr )*
            {
            pushFollow(FOLLOW_arith_expr_in_rel_expr3516);
            arith_expr307=arith_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_arith_expr.add(arith_expr307.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:556:15: ( ( NL )? rel_op ( NL )? arith_expr )*
            loop135:
            do {
                int alt135=2;
                int LA135_0 = input.LA(1);

                if ( (LA135_0==NL) ) {
                    int LA135_1 = input.LA(2);

                    if ( ((LA135_1>=A_EQUAL && LA135_1<=U_GREATER_EQ)) ) {
                        alt135=1;
                    }


                }
                else if ( ((LA135_0>=A_EQUAL && LA135_0<=U_GREATER_EQ)) ) {
                    alt135=1;
                }


                switch (alt135) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:556:16: ( NL )? rel_op ( NL )? arith_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:556:16: ( NL )?
            	    int alt133=2;
            	    int LA133_0 = input.LA(1);

            	    if ( (LA133_0==NL) ) {
            	        alt133=1;
            	    }
            	    switch (alt133) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:556:16: NL
            	            {
            	            NL308=(Token)match(input,NL,FOLLOW_NL_in_rel_expr3519); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL308);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_rel_op_in_rel_expr3522);
            	    rel_op309=rel_op();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_rel_op.add(rel_op309.getTree());
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:556:27: ( NL )?
            	    int alt134=2;
            	    int LA134_0 = input.LA(1);

            	    if ( (LA134_0==NL) ) {
            	        alt134=1;
            	    }
            	    switch (alt134) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:556:27: NL
            	            {
            	            NL310=(Token)match(input,NL,FOLLOW_NL_in_rel_expr3524); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL310);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_arith_expr_in_rel_expr3527);
            	    arith_expr311=arith_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_arith_expr.add(arith_expr311.getTree());

            	    }
            	    break;

            	default :
            	    break loop135;
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
            // 556:44: -> ^( COMPARE arith_expr ( rel_op arith_expr )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:556:47: ^( COMPARE arith_expr ( rel_op arith_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COMPARE, "COMPARE"), root_1);

                adaptor.addChild(root_1, stream_arith_expr.nextTree());
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:556:68: ( rel_op arith_expr )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:558:1: p_rel_expr : p_arith_expr ( ( NL )? rel_op ( NL )? p_arith_expr )* -> ^( COMPARE p_arith_expr ( rel_op p_arith_expr )* ) ;
    public final babel17Parser.p_rel_expr_return p_rel_expr() throws RecognitionException {
        babel17Parser.p_rel_expr_return retval = new babel17Parser.p_rel_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL313=null;
        Token NL315=null;
        babel17Parser.p_arith_expr_return p_arith_expr312 = null;

        babel17Parser.rel_op_return rel_op314 = null;

        babel17Parser.p_arith_expr_return p_arith_expr316 = null;


        CommonTree NL313_tree=null;
        CommonTree NL315_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_p_arith_expr=new RewriteRuleSubtreeStream(adaptor,"rule p_arith_expr");
        RewriteRuleSubtreeStream stream_rel_op=new RewriteRuleSubtreeStream(adaptor,"rule rel_op");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:559:2: ( p_arith_expr ( ( NL )? rel_op ( NL )? p_arith_expr )* -> ^( COMPARE p_arith_expr ( rel_op p_arith_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:559:4: p_arith_expr ( ( NL )? rel_op ( NL )? p_arith_expr )*
            {
            pushFollow(FOLLOW_p_arith_expr_in_p_rel_expr3554);
            p_arith_expr312=p_arith_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_p_arith_expr.add(p_arith_expr312.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:559:17: ( ( NL )? rel_op ( NL )? p_arith_expr )*
            loop138:
            do {
                int alt138=2;
                int LA138_0 = input.LA(1);

                if ( (LA138_0==NL) ) {
                    int LA138_1 = input.LA(2);

                    if ( ((LA138_1>=A_EQUAL && LA138_1<=U_GREATER_EQ)) ) {
                        alt138=1;
                    }


                }
                else if ( ((LA138_0>=A_EQUAL && LA138_0<=U_GREATER_EQ)) ) {
                    alt138=1;
                }


                switch (alt138) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:559:18: ( NL )? rel_op ( NL )? p_arith_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:559:18: ( NL )?
            	    int alt136=2;
            	    int LA136_0 = input.LA(1);

            	    if ( (LA136_0==NL) ) {
            	        alt136=1;
            	    }
            	    switch (alt136) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:559:18: NL
            	            {
            	            NL313=(Token)match(input,NL,FOLLOW_NL_in_p_rel_expr3557); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL313);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_rel_op_in_p_rel_expr3560);
            	    rel_op314=rel_op();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_rel_op.add(rel_op314.getTree());
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:559:29: ( NL )?
            	    int alt137=2;
            	    int LA137_0 = input.LA(1);

            	    if ( (LA137_0==NL) ) {
            	        alt137=1;
            	    }
            	    switch (alt137) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:559:29: NL
            	            {
            	            NL315=(Token)match(input,NL,FOLLOW_NL_in_p_rel_expr3562); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL315);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_arith_expr_in_p_rel_expr3565);
            	    p_arith_expr316=p_arith_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_p_arith_expr.add(p_arith_expr316.getTree());

            	    }
            	    break;

            	default :
            	    break loop138;
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
            // 559:48: -> ^( COMPARE p_arith_expr ( rel_op p_arith_expr )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:559:51: ^( COMPARE p_arith_expr ( rel_op p_arith_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COMPARE, "COMPARE"), root_1);

                adaptor.addChild(root_1, stream_p_arith_expr.nextTree());
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:559:74: ( rel_op p_arith_expr )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:562:1: rel_op : ( token_EQUAL | token_NOT_EQUAL | GREATER | token_GREATER_EQ | LESS | token_LESS_EQ );
    public final babel17Parser.rel_op_return rel_op() throws RecognitionException {
        babel17Parser.rel_op_return retval = new babel17Parser.rel_op_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token GREATER319=null;
        Token LESS321=null;
        babel17Parser.token_EQUAL_return token_EQUAL317 = null;

        babel17Parser.token_NOT_EQUAL_return token_NOT_EQUAL318 = null;

        babel17Parser.token_GREATER_EQ_return token_GREATER_EQ320 = null;

        babel17Parser.token_LESS_EQ_return token_LESS_EQ322 = null;


        CommonTree GREATER319_tree=null;
        CommonTree LESS321_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:562:8: ( token_EQUAL | token_NOT_EQUAL | GREATER | token_GREATER_EQ | LESS | token_LESS_EQ )
            int alt139=6;
            switch ( input.LA(1) ) {
            case A_EQUAL:
            case U_EQUAL:
                {
                alt139=1;
                }
                break;
            case A_NOT_EQUAL:
            case U_NOT_EQUAL:
                {
                alt139=2;
                }
                break;
            case GREATER:
                {
                alt139=3;
                }
                break;
            case A_GREATER_EQ:
            case U_GREATER_EQ:
                {
                alt139=4;
                }
                break;
            case LESS:
                {
                alt139=5;
                }
                break;
            case A_LESS_EQ:
            case U_LESS_EQ:
                {
                alt139=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 139, 0, input);

                throw nvae;
            }

            switch (alt139) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:562:10: token_EQUAL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_EQUAL_in_rel_op3591);
                    token_EQUAL317=token_EQUAL();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, token_EQUAL317.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:562:24: token_NOT_EQUAL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_NOT_EQUAL_in_rel_op3595);
                    token_NOT_EQUAL318=token_NOT_EQUAL();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, token_NOT_EQUAL318.getTree());

                    }
                    break;
                case 3 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:562:42: GREATER
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    GREATER319=(Token)match(input,GREATER,FOLLOW_GREATER_in_rel_op3599); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    GREATER319_tree = (CommonTree)adaptor.create(GREATER319);
                    adaptor.addChild(root_0, GREATER319_tree);
                    }

                    }
                    break;
                case 4 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:562:52: token_GREATER_EQ
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_GREATER_EQ_in_rel_op3603);
                    token_GREATER_EQ320=token_GREATER_EQ();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, token_GREATER_EQ320.getTree());

                    }
                    break;
                case 5 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:562:71: LESS
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    LESS321=(Token)match(input,LESS,FOLLOW_LESS_in_rel_op3607); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LESS321_tree = (CommonTree)adaptor.create(LESS321);
                    adaptor.addChild(root_0, LESS321_tree);
                    }

                    }
                    break;
                case 6 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:562:78: token_LESS_EQ
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_LESS_EQ_in_rel_op3611);
                    token_LESS_EQ322=token_LESS_EQ();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, token_LESS_EQ322.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:565:1: arith_expr : plusplus_expr ;
    public final babel17Parser.arith_expr_return arith_expr() throws RecognitionException {
        babel17Parser.arith_expr_return retval = new babel17Parser.arith_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.plusplus_expr_return plusplus_expr323 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:566:2: ( plusplus_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:566:4: plusplus_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_plusplus_expr_in_arith_expr3623);
            plusplus_expr323=plusplus_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, plusplus_expr323.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:569:1: p_arith_expr : p_plusplus_expr ;
    public final babel17Parser.p_arith_expr_return p_arith_expr() throws RecognitionException {
        babel17Parser.p_arith_expr_return retval = new babel17Parser.p_arith_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.p_plusplus_expr_return p_plusplus_expr324 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:570:2: ( p_plusplus_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:570:4: p_plusplus_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_plusplus_expr_in_p_arith_expr3633);
            p_plusplus_expr324=p_plusplus_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_plusplus_expr324.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:572:1: plusplus_expr : timestimes_expr ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? timestimes_expr )* ;
    public final babel17Parser.plusplus_expr_return plusplus_expr() throws RecognitionException {
        babel17Parser.plusplus_expr_return retval = new babel17Parser.plusplus_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL326=null;
        Token PLUSPLUS327=null;
        Token MINUSMINUS328=null;
        Token NL329=null;
        babel17Parser.timestimes_expr_return timestimes_expr325 = null;

        babel17Parser.timestimes_expr_return timestimes_expr330 = null;


        CommonTree NL326_tree=null;
        CommonTree PLUSPLUS327_tree=null;
        CommonTree MINUSMINUS328_tree=null;
        CommonTree NL329_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:573:2: ( timestimes_expr ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? timestimes_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:573:4: timestimes_expr ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? timestimes_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_timestimes_expr_in_plusplus_expr3643);
            timestimes_expr325=timestimes_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, timestimes_expr325.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:573:20: ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? timestimes_expr )*
            loop143:
            do {
                int alt143=2;
                int LA143_0 = input.LA(1);

                if ( (LA143_0==NL) ) {
                    int LA143_1 = input.LA(2);

                    if ( ((LA143_1>=PLUSPLUS && LA143_1<=MINUSMINUS)) ) {
                        alt143=1;
                    }


                }
                else if ( ((LA143_0>=PLUSPLUS && LA143_0<=MINUSMINUS)) ) {
                    alt143=1;
                }


                switch (alt143) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:573:21: ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? timestimes_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:573:23: ( NL )?
            	    int alt140=2;
            	    int LA140_0 = input.LA(1);

            	    if ( (LA140_0==NL) ) {
            	        alt140=1;
            	    }
            	    switch (alt140) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:573:23: NL
            	            {
            	            NL326=(Token)match(input,NL,FOLLOW_NL_in_plusplus_expr3646); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:573:26: ( PLUSPLUS | MINUSMINUS )
            	    int alt141=2;
            	    int LA141_0 = input.LA(1);

            	    if ( (LA141_0==PLUSPLUS) ) {
            	        alt141=1;
            	    }
            	    else if ( (LA141_0==MINUSMINUS) ) {
            	        alt141=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 141, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt141) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:573:27: PLUSPLUS
            	            {
            	            PLUSPLUS327=(Token)match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_plusplus_expr3651); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PLUSPLUS327_tree = (CommonTree)adaptor.create(PLUSPLUS327);
            	            root_0 = (CommonTree)adaptor.becomeRoot(PLUSPLUS327_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:573:37: MINUSMINUS
            	            {
            	            MINUSMINUS328=(Token)match(input,MINUSMINUS,FOLLOW_MINUSMINUS_in_plusplus_expr3654); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            MINUSMINUS328_tree = (CommonTree)adaptor.create(MINUSMINUS328);
            	            root_0 = (CommonTree)adaptor.becomeRoot(MINUSMINUS328_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:573:52: ( NL )?
            	    int alt142=2;
            	    int LA142_0 = input.LA(1);

            	    if ( (LA142_0==NL) ) {
            	        alt142=1;
            	    }
            	    switch (alt142) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:573:52: NL
            	            {
            	            NL329=(Token)match(input,NL,FOLLOW_NL_in_plusplus_expr3658); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_timestimes_expr_in_plusplus_expr3662);
            	    timestimes_expr330=timestimes_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, timestimes_expr330.getTree());

            	    }
            	    break;

            	default :
            	    break loop143;
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:575:1: p_plusplus_expr : p_timestimes_expr ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? p_timestimes_expr )* ;
    public final babel17Parser.p_plusplus_expr_return p_plusplus_expr() throws RecognitionException {
        babel17Parser.p_plusplus_expr_return retval = new babel17Parser.p_plusplus_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL332=null;
        Token PLUSPLUS333=null;
        Token MINUSMINUS334=null;
        Token NL335=null;
        babel17Parser.p_timestimes_expr_return p_timestimes_expr331 = null;

        babel17Parser.p_timestimes_expr_return p_timestimes_expr336 = null;


        CommonTree NL332_tree=null;
        CommonTree PLUSPLUS333_tree=null;
        CommonTree MINUSMINUS334_tree=null;
        CommonTree NL335_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:576:2: ( p_timestimes_expr ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? p_timestimes_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:576:4: p_timestimes_expr ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? p_timestimes_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_timestimes_expr_in_p_plusplus_expr3674);
            p_timestimes_expr331=p_timestimes_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_timestimes_expr331.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:576:22: ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? p_timestimes_expr )*
            loop147:
            do {
                int alt147=2;
                int LA147_0 = input.LA(1);

                if ( (LA147_0==NL) ) {
                    int LA147_1 = input.LA(2);

                    if ( ((LA147_1>=PLUSPLUS && LA147_1<=MINUSMINUS)) ) {
                        alt147=1;
                    }


                }
                else if ( ((LA147_0>=PLUSPLUS && LA147_0<=MINUSMINUS)) ) {
                    alt147=1;
                }


                switch (alt147) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:576:23: ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? p_timestimes_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:576:25: ( NL )?
            	    int alt144=2;
            	    int LA144_0 = input.LA(1);

            	    if ( (LA144_0==NL) ) {
            	        alt144=1;
            	    }
            	    switch (alt144) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:576:25: NL
            	            {
            	            NL332=(Token)match(input,NL,FOLLOW_NL_in_p_plusplus_expr3677); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:576:28: ( PLUSPLUS | MINUSMINUS )
            	    int alt145=2;
            	    int LA145_0 = input.LA(1);

            	    if ( (LA145_0==PLUSPLUS) ) {
            	        alt145=1;
            	    }
            	    else if ( (LA145_0==MINUSMINUS) ) {
            	        alt145=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 145, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt145) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:576:29: PLUSPLUS
            	            {
            	            PLUSPLUS333=(Token)match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_p_plusplus_expr3682); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PLUSPLUS333_tree = (CommonTree)adaptor.create(PLUSPLUS333);
            	            root_0 = (CommonTree)adaptor.becomeRoot(PLUSPLUS333_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:576:39: MINUSMINUS
            	            {
            	            MINUSMINUS334=(Token)match(input,MINUSMINUS,FOLLOW_MINUSMINUS_in_p_plusplus_expr3685); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            MINUSMINUS334_tree = (CommonTree)adaptor.create(MINUSMINUS334);
            	            root_0 = (CommonTree)adaptor.becomeRoot(MINUSMINUS334_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:576:54: ( NL )?
            	    int alt146=2;
            	    int LA146_0 = input.LA(1);

            	    if ( (LA146_0==NL) ) {
            	        alt146=1;
            	    }
            	    switch (alt146) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:576:54: NL
            	            {
            	            NL335=(Token)match(input,NL,FOLLOW_NL_in_p_plusplus_expr3689); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_timestimes_expr_in_p_plusplus_expr3693);
            	    p_timestimes_expr336=p_timestimes_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_timestimes_expr336.getTree());

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
    // $ANTLR end "p_plusplus_expr"

    public static class timestimes_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "timestimes_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:579:1: timestimes_expr : simple_expr ( ( NL )? ( TIMESTIMES | QUOTIENTQUOTIENT ) ( NL )? simple_expr )* ;
    public final babel17Parser.timestimes_expr_return timestimes_expr() throws RecognitionException {
        babel17Parser.timestimes_expr_return retval = new babel17Parser.timestimes_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL338=null;
        Token TIMESTIMES339=null;
        Token QUOTIENTQUOTIENT340=null;
        Token NL341=null;
        babel17Parser.simple_expr_return simple_expr337 = null;

        babel17Parser.simple_expr_return simple_expr342 = null;


        CommonTree NL338_tree=null;
        CommonTree TIMESTIMES339_tree=null;
        CommonTree QUOTIENTQUOTIENT340_tree=null;
        CommonTree NL341_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:580:2: ( simple_expr ( ( NL )? ( TIMESTIMES | QUOTIENTQUOTIENT ) ( NL )? simple_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:580:4: simple_expr ( ( NL )? ( TIMESTIMES | QUOTIENTQUOTIENT ) ( NL )? simple_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_simple_expr_in_timestimes_expr3705);
            simple_expr337=simple_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, simple_expr337.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:580:16: ( ( NL )? ( TIMESTIMES | QUOTIENTQUOTIENT ) ( NL )? simple_expr )*
            loop151:
            do {
                int alt151=2;
                int LA151_0 = input.LA(1);

                if ( (LA151_0==NL) ) {
                    int LA151_1 = input.LA(2);

                    if ( ((LA151_1>=TIMESTIMES && LA151_1<=QUOTIENTQUOTIENT)) ) {
                        alt151=1;
                    }


                }
                else if ( ((LA151_0>=TIMESTIMES && LA151_0<=QUOTIENTQUOTIENT)) ) {
                    alt151=1;
                }


                switch (alt151) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:580:17: ( NL )? ( TIMESTIMES | QUOTIENTQUOTIENT ) ( NL )? simple_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:580:19: ( NL )?
            	    int alt148=2;
            	    int LA148_0 = input.LA(1);

            	    if ( (LA148_0==NL) ) {
            	        alt148=1;
            	    }
            	    switch (alt148) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:580:19: NL
            	            {
            	            NL338=(Token)match(input,NL,FOLLOW_NL_in_timestimes_expr3708); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:580:22: ( TIMESTIMES | QUOTIENTQUOTIENT )
            	    int alt149=2;
            	    int LA149_0 = input.LA(1);

            	    if ( (LA149_0==TIMESTIMES) ) {
            	        alt149=1;
            	    }
            	    else if ( (LA149_0==QUOTIENTQUOTIENT) ) {
            	        alt149=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 149, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt149) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:580:23: TIMESTIMES
            	            {
            	            TIMESTIMES339=(Token)match(input,TIMESTIMES,FOLLOW_TIMESTIMES_in_timestimes_expr3713); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            TIMESTIMES339_tree = (CommonTree)adaptor.create(TIMESTIMES339);
            	            root_0 = (CommonTree)adaptor.becomeRoot(TIMESTIMES339_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:580:35: QUOTIENTQUOTIENT
            	            {
            	            QUOTIENTQUOTIENT340=(Token)match(input,QUOTIENTQUOTIENT,FOLLOW_QUOTIENTQUOTIENT_in_timestimes_expr3716); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            QUOTIENTQUOTIENT340_tree = (CommonTree)adaptor.create(QUOTIENTQUOTIENT340);
            	            root_0 = (CommonTree)adaptor.becomeRoot(QUOTIENTQUOTIENT340_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:580:56: ( NL )?
            	    int alt150=2;
            	    int LA150_0 = input.LA(1);

            	    if ( (LA150_0==NL) ) {
            	        alt150=1;
            	    }
            	    switch (alt150) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:580:56: NL
            	            {
            	            NL341=(Token)match(input,NL,FOLLOW_NL_in_timestimes_expr3720); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_simple_expr_in_timestimes_expr3724);
            	    simple_expr342=simple_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, simple_expr342.getTree());

            	    }
            	    break;

            	default :
            	    break loop151;
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:582:1: p_timestimes_expr : p_simple_expr ( ( NL )? ( TIMESTIMES | QUOTIENTQUOTIENT ) ( NL )? p_simple_expr )* ;
    public final babel17Parser.p_timestimes_expr_return p_timestimes_expr() throws RecognitionException {
        babel17Parser.p_timestimes_expr_return retval = new babel17Parser.p_timestimes_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL344=null;
        Token TIMESTIMES345=null;
        Token QUOTIENTQUOTIENT346=null;
        Token NL347=null;
        babel17Parser.p_simple_expr_return p_simple_expr343 = null;

        babel17Parser.p_simple_expr_return p_simple_expr348 = null;


        CommonTree NL344_tree=null;
        CommonTree TIMESTIMES345_tree=null;
        CommonTree QUOTIENTQUOTIENT346_tree=null;
        CommonTree NL347_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:583:2: ( p_simple_expr ( ( NL )? ( TIMESTIMES | QUOTIENTQUOTIENT ) ( NL )? p_simple_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:583:4: p_simple_expr ( ( NL )? ( TIMESTIMES | QUOTIENTQUOTIENT ) ( NL )? p_simple_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_simple_expr_in_p_timestimes_expr3737);
            p_simple_expr343=p_simple_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_simple_expr343.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:583:18: ( ( NL )? ( TIMESTIMES | QUOTIENTQUOTIENT ) ( NL )? p_simple_expr )*
            loop155:
            do {
                int alt155=2;
                int LA155_0 = input.LA(1);

                if ( (LA155_0==NL) ) {
                    int LA155_1 = input.LA(2);

                    if ( ((LA155_1>=TIMESTIMES && LA155_1<=QUOTIENTQUOTIENT)) ) {
                        alt155=1;
                    }


                }
                else if ( ((LA155_0>=TIMESTIMES && LA155_0<=QUOTIENTQUOTIENT)) ) {
                    alt155=1;
                }


                switch (alt155) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:583:19: ( NL )? ( TIMESTIMES | QUOTIENTQUOTIENT ) ( NL )? p_simple_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:583:21: ( NL )?
            	    int alt152=2;
            	    int LA152_0 = input.LA(1);

            	    if ( (LA152_0==NL) ) {
            	        alt152=1;
            	    }
            	    switch (alt152) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:583:21: NL
            	            {
            	            NL344=(Token)match(input,NL,FOLLOW_NL_in_p_timestimes_expr3740); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:583:24: ( TIMESTIMES | QUOTIENTQUOTIENT )
            	    int alt153=2;
            	    int LA153_0 = input.LA(1);

            	    if ( (LA153_0==TIMESTIMES) ) {
            	        alt153=1;
            	    }
            	    else if ( (LA153_0==QUOTIENTQUOTIENT) ) {
            	        alt153=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 153, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt153) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:583:25: TIMESTIMES
            	            {
            	            TIMESTIMES345=(Token)match(input,TIMESTIMES,FOLLOW_TIMESTIMES_in_p_timestimes_expr3745); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            TIMESTIMES345_tree = (CommonTree)adaptor.create(TIMESTIMES345);
            	            root_0 = (CommonTree)adaptor.becomeRoot(TIMESTIMES345_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:583:37: QUOTIENTQUOTIENT
            	            {
            	            QUOTIENTQUOTIENT346=(Token)match(input,QUOTIENTQUOTIENT,FOLLOW_QUOTIENTQUOTIENT_in_p_timestimes_expr3748); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            QUOTIENTQUOTIENT346_tree = (CommonTree)adaptor.create(QUOTIENTQUOTIENT346);
            	            root_0 = (CommonTree)adaptor.becomeRoot(QUOTIENTQUOTIENT346_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:583:58: ( NL )?
            	    int alt154=2;
            	    int LA154_0 = input.LA(1);

            	    if ( (LA154_0==NL) ) {
            	        alt154=1;
            	    }
            	    switch (alt154) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:583:58: NL
            	            {
            	            NL347=(Token)match(input,NL,FOLLOW_NL_in_p_timestimes_expr3752); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_simple_expr_in_p_timestimes_expr3756);
            	    p_simple_expr348=p_simple_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_simple_expr348.getTree());

            	    }
            	    break;

            	default :
            	    break loop155;
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:585:1: simple_expr : cons_expr ;
    public final babel17Parser.simple_expr_return simple_expr() throws RecognitionException {
        babel17Parser.simple_expr_return retval = new babel17Parser.simple_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.cons_expr_return cons_expr349 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:586:2: ( cons_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:586:4: cons_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_cons_expr_in_simple_expr3767);
            cons_expr349=cons_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, cons_expr349.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:588:1: p_simple_expr : p_cons_expr ;
    public final babel17Parser.p_simple_expr_return p_simple_expr() throws RecognitionException {
        babel17Parser.p_simple_expr_return retval = new babel17Parser.p_simple_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.p_cons_expr_return p_cons_expr350 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:589:2: ( p_cons_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:589:4: p_cons_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_cons_expr_in_p_simple_expr3776);
            p_cons_expr350=p_cons_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_cons_expr350.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:591:1: cons_expr : to_expr ( ( NL )? token_DOUBLE_COLON ( NL )? to_expr )* -> ^( LIST_CONS ( to_expr )* ) ;
    public final babel17Parser.cons_expr_return cons_expr() throws RecognitionException {
        babel17Parser.cons_expr_return retval = new babel17Parser.cons_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL352=null;
        Token NL354=null;
        babel17Parser.to_expr_return to_expr351 = null;

        babel17Parser.token_DOUBLE_COLON_return token_DOUBLE_COLON353 = null;

        babel17Parser.to_expr_return to_expr355 = null;


        CommonTree NL352_tree=null;
        CommonTree NL354_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_token_DOUBLE_COLON=new RewriteRuleSubtreeStream(adaptor,"rule token_DOUBLE_COLON");
        RewriteRuleSubtreeStream stream_to_expr=new RewriteRuleSubtreeStream(adaptor,"rule to_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:592:2: ( to_expr ( ( NL )? token_DOUBLE_COLON ( NL )? to_expr )* -> ^( LIST_CONS ( to_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:592:4: to_expr ( ( NL )? token_DOUBLE_COLON ( NL )? to_expr )*
            {
            pushFollow(FOLLOW_to_expr_in_cons_expr3785);
            to_expr351=to_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_to_expr.add(to_expr351.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:592:12: ( ( NL )? token_DOUBLE_COLON ( NL )? to_expr )*
            loop158:
            do {
                int alt158=2;
                int LA158_0 = input.LA(1);

                if ( (LA158_0==NL) ) {
                    int LA158_1 = input.LA(2);

                    if ( ((LA158_1>=A_DOUBLE_COLON && LA158_1<=U_DOUBLE_COLON)) ) {
                        alt158=1;
                    }


                }
                else if ( ((LA158_0>=A_DOUBLE_COLON && LA158_0<=U_DOUBLE_COLON)) ) {
                    alt158=1;
                }


                switch (alt158) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:592:13: ( NL )? token_DOUBLE_COLON ( NL )? to_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:592:13: ( NL )?
            	    int alt156=2;
            	    int LA156_0 = input.LA(1);

            	    if ( (LA156_0==NL) ) {
            	        alt156=1;
            	    }
            	    switch (alt156) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:592:13: NL
            	            {
            	            NL352=(Token)match(input,NL,FOLLOW_NL_in_cons_expr3788); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL352);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_token_DOUBLE_COLON_in_cons_expr3791);
            	    token_DOUBLE_COLON353=token_DOUBLE_COLON();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_token_DOUBLE_COLON.add(token_DOUBLE_COLON353.getTree());
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:592:36: ( NL )?
            	    int alt157=2;
            	    int LA157_0 = input.LA(1);

            	    if ( (LA157_0==NL) ) {
            	        alt157=1;
            	    }
            	    switch (alt157) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:592:36: NL
            	            {
            	            NL354=(Token)match(input,NL,FOLLOW_NL_in_cons_expr3793); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL354);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_to_expr_in_cons_expr3796);
            	    to_expr355=to_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_to_expr.add(to_expr355.getTree());

            	    }
            	    break;

            	default :
            	    break loop158;
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
            // 592:50: -> ^( LIST_CONS ( to_expr )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:592:53: ^( LIST_CONS ( to_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LIST_CONS, "LIST_CONS"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:592:65: ( to_expr )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:594:1: p_cons_expr : p_to_expr ( ( NL )? token_DOUBLE_COLON ( NL )? p_to_expr )* -> ^( LIST_CONS ( p_to_expr )* ) ;
    public final babel17Parser.p_cons_expr_return p_cons_expr() throws RecognitionException {
        babel17Parser.p_cons_expr_return retval = new babel17Parser.p_cons_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL357=null;
        Token NL359=null;
        babel17Parser.p_to_expr_return p_to_expr356 = null;

        babel17Parser.token_DOUBLE_COLON_return token_DOUBLE_COLON358 = null;

        babel17Parser.p_to_expr_return p_to_expr360 = null;


        CommonTree NL357_tree=null;
        CommonTree NL359_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_p_to_expr=new RewriteRuleSubtreeStream(adaptor,"rule p_to_expr");
        RewriteRuleSubtreeStream stream_token_DOUBLE_COLON=new RewriteRuleSubtreeStream(adaptor,"rule token_DOUBLE_COLON");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:595:2: ( p_to_expr ( ( NL )? token_DOUBLE_COLON ( NL )? p_to_expr )* -> ^( LIST_CONS ( p_to_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:595:4: p_to_expr ( ( NL )? token_DOUBLE_COLON ( NL )? p_to_expr )*
            {
            pushFollow(FOLLOW_p_to_expr_in_p_cons_expr3816);
            p_to_expr356=p_to_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_p_to_expr.add(p_to_expr356.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:595:14: ( ( NL )? token_DOUBLE_COLON ( NL )? p_to_expr )*
            loop161:
            do {
                int alt161=2;
                int LA161_0 = input.LA(1);

                if ( (LA161_0==NL) ) {
                    int LA161_1 = input.LA(2);

                    if ( ((LA161_1>=A_DOUBLE_COLON && LA161_1<=U_DOUBLE_COLON)) ) {
                        alt161=1;
                    }


                }
                else if ( ((LA161_0>=A_DOUBLE_COLON && LA161_0<=U_DOUBLE_COLON)) ) {
                    alt161=1;
                }


                switch (alt161) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:595:15: ( NL )? token_DOUBLE_COLON ( NL )? p_to_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:595:15: ( NL )?
            	    int alt159=2;
            	    int LA159_0 = input.LA(1);

            	    if ( (LA159_0==NL) ) {
            	        alt159=1;
            	    }
            	    switch (alt159) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:595:15: NL
            	            {
            	            NL357=(Token)match(input,NL,FOLLOW_NL_in_p_cons_expr3819); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL357);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_token_DOUBLE_COLON_in_p_cons_expr3822);
            	    token_DOUBLE_COLON358=token_DOUBLE_COLON();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_token_DOUBLE_COLON.add(token_DOUBLE_COLON358.getTree());
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:595:38: ( NL )?
            	    int alt160=2;
            	    int LA160_0 = input.LA(1);

            	    if ( (LA160_0==NL) ) {
            	        alt160=1;
            	    }
            	    switch (alt160) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:595:38: NL
            	            {
            	            NL359=(Token)match(input,NL,FOLLOW_NL_in_p_cons_expr3824); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL359);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_to_expr_in_p_cons_expr3827);
            	    p_to_expr360=p_to_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_p_to_expr.add(p_to_expr360.getTree());

            	    }
            	    break;

            	default :
            	    break loop161;
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
            // 595:54: -> ^( LIST_CONS ( p_to_expr )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:595:57: ^( LIST_CONS ( p_to_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LIST_CONS, "LIST_CONS"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:595:69: ( p_to_expr )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:598:1: to_expr : arith_plus_expr ( ( NL )? ( L_to | L_downto ) ( NL )? arith_plus_expr )? ;
    public final babel17Parser.to_expr_return to_expr() throws RecognitionException {
        babel17Parser.to_expr_return retval = new babel17Parser.to_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL362=null;
        Token L_to363=null;
        Token L_downto364=null;
        Token NL365=null;
        babel17Parser.arith_plus_expr_return arith_plus_expr361 = null;

        babel17Parser.arith_plus_expr_return arith_plus_expr366 = null;


        CommonTree NL362_tree=null;
        CommonTree L_to363_tree=null;
        CommonTree L_downto364_tree=null;
        CommonTree NL365_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:598:9: ( arith_plus_expr ( ( NL )? ( L_to | L_downto ) ( NL )? arith_plus_expr )? )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:598:11: arith_plus_expr ( ( NL )? ( L_to | L_downto ) ( NL )? arith_plus_expr )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_arith_plus_expr_in_to_expr3847);
            arith_plus_expr361=arith_plus_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, arith_plus_expr361.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:598:27: ( ( NL )? ( L_to | L_downto ) ( NL )? arith_plus_expr )?
            int alt165=2;
            int LA165_0 = input.LA(1);

            if ( (LA165_0==NL) ) {
                int LA165_1 = input.LA(2);

                if ( ((LA165_1>=L_to && LA165_1<=L_downto)) ) {
                    alt165=1;
                }
            }
            else if ( ((LA165_0>=L_to && LA165_0<=L_downto)) ) {
                alt165=1;
            }
            switch (alt165) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:598:28: ( NL )? ( L_to | L_downto ) ( NL )? arith_plus_expr
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:598:30: ( NL )?
                    int alt162=2;
                    int LA162_0 = input.LA(1);

                    if ( (LA162_0==NL) ) {
                        alt162=1;
                    }
                    switch (alt162) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:598:30: NL
                            {
                            NL362=(Token)match(input,NL,FOLLOW_NL_in_to_expr3850); if (state.failed) return retval;

                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:598:33: ( L_to | L_downto )
                    int alt163=2;
                    int LA163_0 = input.LA(1);

                    if ( (LA163_0==L_to) ) {
                        alt163=1;
                    }
                    else if ( (LA163_0==L_downto) ) {
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
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:598:34: L_to
                            {
                            L_to363=(Token)match(input,L_to,FOLLOW_L_to_in_to_expr3855); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            L_to363_tree = (CommonTree)adaptor.create(L_to363);
                            root_0 = (CommonTree)adaptor.becomeRoot(L_to363_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:598:41: L_downto
                            {
                            L_downto364=(Token)match(input,L_downto,FOLLOW_L_downto_in_to_expr3859); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            L_downto364_tree = (CommonTree)adaptor.create(L_downto364);
                            root_0 = (CommonTree)adaptor.becomeRoot(L_downto364_tree, root_0);
                            }

                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:598:54: ( NL )?
                    int alt164=2;
                    int LA164_0 = input.LA(1);

                    if ( (LA164_0==NL) ) {
                        alt164=1;
                    }
                    switch (alt164) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:598:54: NL
                            {
                            NL365=(Token)match(input,NL,FOLLOW_NL_in_to_expr3863); if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_arith_plus_expr_in_to_expr3867);
                    arith_plus_expr366=arith_plus_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arith_plus_expr366.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:600:1: p_to_expr : p_arith_plus_expr ( ( NL )? ( L_to | L_downto ) ( NL )? p_arith_plus_expr )? ;
    public final babel17Parser.p_to_expr_return p_to_expr() throws RecognitionException {
        babel17Parser.p_to_expr_return retval = new babel17Parser.p_to_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL368=null;
        Token L_to369=null;
        Token L_downto370=null;
        Token NL371=null;
        babel17Parser.p_arith_plus_expr_return p_arith_plus_expr367 = null;

        babel17Parser.p_arith_plus_expr_return p_arith_plus_expr372 = null;


        CommonTree NL368_tree=null;
        CommonTree L_to369_tree=null;
        CommonTree L_downto370_tree=null;
        CommonTree NL371_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:601:2: ( p_arith_plus_expr ( ( NL )? ( L_to | L_downto ) ( NL )? p_arith_plus_expr )? )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:601:4: p_arith_plus_expr ( ( NL )? ( L_to | L_downto ) ( NL )? p_arith_plus_expr )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_arith_plus_expr_in_p_to_expr3880);
            p_arith_plus_expr367=p_arith_plus_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_arith_plus_expr367.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:601:22: ( ( NL )? ( L_to | L_downto ) ( NL )? p_arith_plus_expr )?
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:601:23: ( NL )? ( L_to | L_downto ) ( NL )? p_arith_plus_expr
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:601:25: ( NL )?
                    int alt166=2;
                    int LA166_0 = input.LA(1);

                    if ( (LA166_0==NL) ) {
                        alt166=1;
                    }
                    switch (alt166) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:601:25: NL
                            {
                            NL368=(Token)match(input,NL,FOLLOW_NL_in_p_to_expr3883); if (state.failed) return retval;

                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:601:28: ( L_to | L_downto )
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
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:601:29: L_to
                            {
                            L_to369=(Token)match(input,L_to,FOLLOW_L_to_in_p_to_expr3888); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            L_to369_tree = (CommonTree)adaptor.create(L_to369);
                            root_0 = (CommonTree)adaptor.becomeRoot(L_to369_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:601:36: L_downto
                            {
                            L_downto370=(Token)match(input,L_downto,FOLLOW_L_downto_in_p_to_expr3892); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            L_downto370_tree = (CommonTree)adaptor.create(L_downto370);
                            root_0 = (CommonTree)adaptor.becomeRoot(L_downto370_tree, root_0);
                            }

                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:601:49: ( NL )?
                    int alt168=2;
                    int LA168_0 = input.LA(1);

                    if ( (LA168_0==NL) ) {
                        alt168=1;
                    }
                    switch (alt168) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:601:49: NL
                            {
                            NL371=(Token)match(input,NL,FOLLOW_NL_in_p_to_expr3896); if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_p_arith_plus_expr_in_p_to_expr3900);
                    p_arith_plus_expr372=p_arith_plus_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_arith_plus_expr372.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:603:1: arith_plus_expr : arith_uminus_expr ( ( ( NL )? PLUS | MINUS ) ( NL )? arith_uminus_expr )* ;
    public final babel17Parser.arith_plus_expr_return arith_plus_expr() throws RecognitionException {
        babel17Parser.arith_plus_expr_return retval = new babel17Parser.arith_plus_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL374=null;
        Token PLUS375=null;
        Token MINUS376=null;
        Token NL377=null;
        babel17Parser.arith_uminus_expr_return arith_uminus_expr373 = null;

        babel17Parser.arith_uminus_expr_return arith_uminus_expr378 = null;


        CommonTree NL374_tree=null;
        CommonTree PLUS375_tree=null;
        CommonTree MINUS376_tree=null;
        CommonTree NL377_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:604:2: ( arith_uminus_expr ( ( ( NL )? PLUS | MINUS ) ( NL )? arith_uminus_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:604:4: arith_uminus_expr ( ( ( NL )? PLUS | MINUS ) ( NL )? arith_uminus_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_arith_uminus_expr_in_arith_plus_expr3912);
            arith_uminus_expr373=arith_uminus_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, arith_uminus_expr373.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:604:22: ( ( ( NL )? PLUS | MINUS ) ( NL )? arith_uminus_expr )*
            loop173:
            do {
                int alt173=2;
                int LA173_0 = input.LA(1);

                if ( (LA173_0==NL) ) {
                    int LA173_1 = input.LA(2);

                    if ( (LA173_1==PLUS) ) {
                        alt173=1;
                    }


                }
                else if ( ((LA173_0>=PLUS && LA173_0<=MINUS)) ) {
                    alt173=1;
                }


                switch (alt173) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:604:23: ( ( NL )? PLUS | MINUS ) ( NL )? arith_uminus_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:604:23: ( ( NL )? PLUS | MINUS )
            	    int alt171=2;
            	    int LA171_0 = input.LA(1);

            	    if ( (LA171_0==PLUS||LA171_0==NL) ) {
            	        alt171=1;
            	    }
            	    else if ( (LA171_0==MINUS) ) {
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
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:604:24: ( NL )? PLUS
            	            {
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:604:26: ( NL )?
            	            int alt170=2;
            	            int LA170_0 = input.LA(1);

            	            if ( (LA170_0==NL) ) {
            	                alt170=1;
            	            }
            	            switch (alt170) {
            	                case 1 :
            	                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:604:26: NL
            	                    {
            	                    NL374=(Token)match(input,NL,FOLLOW_NL_in_arith_plus_expr3916); if (state.failed) return retval;

            	                    }
            	                    break;

            	            }

            	            PLUS375=(Token)match(input,PLUS,FOLLOW_PLUS_in_arith_plus_expr3920); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PLUS375_tree = (CommonTree)adaptor.create(PLUS375);
            	            root_0 = (CommonTree)adaptor.becomeRoot(PLUS375_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:604:37: MINUS
            	            {
            	            MINUS376=(Token)match(input,MINUS,FOLLOW_MINUS_in_arith_plus_expr3925); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            MINUS376_tree = (CommonTree)adaptor.create(MINUS376);
            	            root_0 = (CommonTree)adaptor.becomeRoot(MINUS376_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:604:47: ( NL )?
            	    int alt172=2;
            	    int LA172_0 = input.LA(1);

            	    if ( (LA172_0==NL) ) {
            	        alt172=1;
            	    }
            	    switch (alt172) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:604:47: NL
            	            {
            	            NL377=(Token)match(input,NL,FOLLOW_NL_in_arith_plus_expr3929); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_arith_uminus_expr_in_arith_plus_expr3933);
            	    arith_uminus_expr378=arith_uminus_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, arith_uminus_expr378.getTree());

            	    }
            	    break;

            	default :
            	    break loop173;
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:606:1: p_arith_plus_expr : p_arith_uminus_expr ( ( NL )? ( PLUS | MINUS ) ( NL )? p_arith_uminus_expr )* ;
    public final babel17Parser.p_arith_plus_expr_return p_arith_plus_expr() throws RecognitionException {
        babel17Parser.p_arith_plus_expr_return retval = new babel17Parser.p_arith_plus_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL380=null;
        Token set381=null;
        Token NL382=null;
        babel17Parser.p_arith_uminus_expr_return p_arith_uminus_expr379 = null;

        babel17Parser.p_arith_uminus_expr_return p_arith_uminus_expr383 = null;


        CommonTree NL380_tree=null;
        CommonTree set381_tree=null;
        CommonTree NL382_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:607:2: ( p_arith_uminus_expr ( ( NL )? ( PLUS | MINUS ) ( NL )? p_arith_uminus_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:607:4: p_arith_uminus_expr ( ( NL )? ( PLUS | MINUS ) ( NL )? p_arith_uminus_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_arith_uminus_expr_in_p_arith_plus_expr3944);
            p_arith_uminus_expr379=p_arith_uminus_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_arith_uminus_expr379.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:607:24: ( ( NL )? ( PLUS | MINUS ) ( NL )? p_arith_uminus_expr )*
            loop176:
            do {
                int alt176=2;
                int LA176_0 = input.LA(1);

                if ( (LA176_0==NL) ) {
                    int LA176_1 = input.LA(2);

                    if ( ((LA176_1>=PLUS && LA176_1<=MINUS)) ) {
                        alt176=1;
                    }


                }
                else if ( ((LA176_0>=PLUS && LA176_0<=MINUS)) ) {
                    alt176=1;
                }


                switch (alt176) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:607:25: ( NL )? ( PLUS | MINUS ) ( NL )? p_arith_uminus_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:607:27: ( NL )?
            	    int alt174=2;
            	    int LA174_0 = input.LA(1);

            	    if ( (LA174_0==NL) ) {
            	        alt174=1;
            	    }
            	    switch (alt174) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:607:27: NL
            	            {
            	            NL380=(Token)match(input,NL,FOLLOW_NL_in_p_arith_plus_expr3947); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    set381=(Token)input.LT(1);
            	    set381=(Token)input.LT(1);
            	    if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set381), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:607:48: ( NL )?
            	    int alt175=2;
            	    int LA175_0 = input.LA(1);

            	    if ( (LA175_0==NL) ) {
            	        alt175=1;
            	    }
            	    switch (alt175) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:607:48: NL
            	            {
            	            NL382=(Token)match(input,NL,FOLLOW_NL_in_p_arith_plus_expr3960); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_arith_uminus_expr_in_p_arith_plus_expr3964);
            	    p_arith_uminus_expr383=p_arith_uminus_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_arith_uminus_expr383.getTree());

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
    // $ANTLR end "p_arith_plus_expr"

    public static class arith_uminus_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arith_uminus_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:609:1: arith_uminus_expr : ( MINUS ( NL )? arith_mult_expr -> ^( UMINUS arith_mult_expr ) | arith_mult_expr );
    public final babel17Parser.arith_uminus_expr_return arith_uminus_expr() throws RecognitionException {
        babel17Parser.arith_uminus_expr_return retval = new babel17Parser.arith_uminus_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token MINUS384=null;
        Token NL385=null;
        babel17Parser.arith_mult_expr_return arith_mult_expr386 = null;

        babel17Parser.arith_mult_expr_return arith_mult_expr387 = null;


        CommonTree MINUS384_tree=null;
        CommonTree NL385_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleSubtreeStream stream_arith_mult_expr=new RewriteRuleSubtreeStream(adaptor,"rule arith_mult_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:610:2: ( MINUS ( NL )? arith_mult_expr -> ^( UMINUS arith_mult_expr ) | arith_mult_expr )
            int alt178=2;
            int LA178_0 = input.LA(1);

            if ( (LA178_0==MINUS) ) {
                alt178=1;
            }
            else if ( (LA178_0==L_begin||(LA178_0>=L_with && LA178_0<=L_if)||(LA178_0>=L_while && LA178_0<=L_for)||LA178_0==L_match||(LA178_0>=A_infinity && LA178_0<=U_infinity)||(LA178_0>=L_true && LA178_0<=L_this)||LA178_0==L_nil||(LA178_0>=Constr && LA178_0<=Num)||(LA178_0>=String && LA178_0<=ROUND_BRACKET_OPEN)||LA178_0==SQUARE_BRACKET_OPEN||LA178_0==CURLY_BRACKET_OPEN) ) {
                alt178=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 178, 0, input);

                throw nvae;
            }
            switch (alt178) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:610:4: MINUS ( NL )? arith_mult_expr
                    {
                    MINUS384=(Token)match(input,MINUS,FOLLOW_MINUS_in_arith_uminus_expr3977); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(MINUS384);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:610:10: ( NL )?
                    int alt177=2;
                    int LA177_0 = input.LA(1);

                    if ( (LA177_0==NL) ) {
                        alt177=1;
                    }
                    switch (alt177) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:610:10: NL
                            {
                            NL385=(Token)match(input,NL,FOLLOW_NL_in_arith_uminus_expr3979); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL385);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_arith_mult_expr_in_arith_uminus_expr3982);
                    arith_mult_expr386=arith_mult_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_arith_mult_expr.add(arith_mult_expr386.getTree());


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
                    // 610:30: -> ^( UMINUS arith_mult_expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:610:33: ^( UMINUS arith_mult_expr )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:611:4: arith_mult_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_arith_mult_expr_in_arith_uminus_expr3995);
                    arith_mult_expr387=arith_mult_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arith_mult_expr387.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:613:1: p_arith_uminus_expr : ( MINUS ( NL )? p_arith_mult_expr -> ^( UMINUS p_arith_mult_expr ) | p_arith_mult_expr );
    public final babel17Parser.p_arith_uminus_expr_return p_arith_uminus_expr() throws RecognitionException {
        babel17Parser.p_arith_uminus_expr_return retval = new babel17Parser.p_arith_uminus_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token MINUS388=null;
        Token NL389=null;
        babel17Parser.p_arith_mult_expr_return p_arith_mult_expr390 = null;

        babel17Parser.p_arith_mult_expr_return p_arith_mult_expr391 = null;


        CommonTree MINUS388_tree=null;
        CommonTree NL389_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleSubtreeStream stream_p_arith_mult_expr=new RewriteRuleSubtreeStream(adaptor,"rule p_arith_mult_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:614:2: ( MINUS ( NL )? p_arith_mult_expr -> ^( UMINUS p_arith_mult_expr ) | p_arith_mult_expr )
            int alt180=2;
            int LA180_0 = input.LA(1);

            if ( (LA180_0==MINUS) ) {
                alt180=1;
            }
            else if ( (LA180_0==L_begin||(LA180_0>=L_with && LA180_0<=L_if)||(LA180_0>=L_while && LA180_0<=L_for)||LA180_0==L_match||(LA180_0>=A_infinity && LA180_0<=U_infinity)||(LA180_0>=L_true && LA180_0<=L_this)||LA180_0==L_nil||(LA180_0>=Constr && LA180_0<=Num)||(LA180_0>=String && LA180_0<=ROUND_BRACKET_OPEN)||LA180_0==SQUARE_BRACKET_OPEN||LA180_0==CURLY_BRACKET_OPEN) ) {
                alt180=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 180, 0, input);

                throw nvae;
            }
            switch (alt180) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:614:4: MINUS ( NL )? p_arith_mult_expr
                    {
                    MINUS388=(Token)match(input,MINUS,FOLLOW_MINUS_in_p_arith_uminus_expr4006); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(MINUS388);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:614:10: ( NL )?
                    int alt179=2;
                    int LA179_0 = input.LA(1);

                    if ( (LA179_0==NL) ) {
                        alt179=1;
                    }
                    switch (alt179) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:614:10: NL
                            {
                            NL389=(Token)match(input,NL,FOLLOW_NL_in_p_arith_uminus_expr4008); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL389);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_p_arith_mult_expr_in_p_arith_uminus_expr4011);
                    p_arith_mult_expr390=p_arith_mult_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_p_arith_mult_expr.add(p_arith_mult_expr390.getTree());


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
                    // 614:32: -> ^( UMINUS p_arith_mult_expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:614:35: ^( UMINUS p_arith_mult_expr )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:615:4: p_arith_mult_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_p_arith_mult_expr_in_p_arith_uminus_expr4024);
                    p_arith_mult_expr391=p_arith_mult_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_arith_mult_expr391.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:617:1: arith_mult_expr : arith_pow_expr ( ( NL )? ( TIMES | QUOTIENT | L_div | L_mod ) ( NL )? arith_pow_expr )* ;
    public final babel17Parser.arith_mult_expr_return arith_mult_expr() throws RecognitionException {
        babel17Parser.arith_mult_expr_return retval = new babel17Parser.arith_mult_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL393=null;
        Token set394=null;
        Token NL395=null;
        babel17Parser.arith_pow_expr_return arith_pow_expr392 = null;

        babel17Parser.arith_pow_expr_return arith_pow_expr396 = null;


        CommonTree NL393_tree=null;
        CommonTree set394_tree=null;
        CommonTree NL395_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:618:2: ( arith_pow_expr ( ( NL )? ( TIMES | QUOTIENT | L_div | L_mod ) ( NL )? arith_pow_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:618:4: arith_pow_expr ( ( NL )? ( TIMES | QUOTIENT | L_div | L_mod ) ( NL )? arith_pow_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_arith_pow_expr_in_arith_mult_expr4033);
            arith_pow_expr392=arith_pow_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, arith_pow_expr392.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:618:19: ( ( NL )? ( TIMES | QUOTIENT | L_div | L_mod ) ( NL )? arith_pow_expr )*
            loop183:
            do {
                int alt183=2;
                int LA183_0 = input.LA(1);

                if ( (LA183_0==NL) ) {
                    int LA183_1 = input.LA(2);

                    if ( ((LA183_1>=L_div && LA183_1<=L_mod)||(LA183_1>=TIMES && LA183_1<=QUOTIENT)) ) {
                        alt183=1;
                    }


                }
                else if ( ((LA183_0>=L_div && LA183_0<=L_mod)||(LA183_0>=TIMES && LA183_0<=QUOTIENT)) ) {
                    alt183=1;
                }


                switch (alt183) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:618:20: ( NL )? ( TIMES | QUOTIENT | L_div | L_mod ) ( NL )? arith_pow_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:618:22: ( NL )?
            	    int alt181=2;
            	    int LA181_0 = input.LA(1);

            	    if ( (LA181_0==NL) ) {
            	        alt181=1;
            	    }
            	    switch (alt181) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:618:22: NL
            	            {
            	            NL393=(Token)match(input,NL,FOLLOW_NL_in_arith_mult_expr4036); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    set394=(Token)input.LT(1);
            	    set394=(Token)input.LT(1);
            	    if ( (input.LA(1)>=L_div && input.LA(1)<=L_mod)||(input.LA(1)>=TIMES && input.LA(1)<=QUOTIENT) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set394), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:618:63: ( NL )?
            	    int alt182=2;
            	    int LA182_0 = input.LA(1);

            	    if ( (LA182_0==NL) ) {
            	        alt182=1;
            	    }
            	    switch (alt182) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:618:63: NL
            	            {
            	            NL395=(Token)match(input,NL,FOLLOW_NL_in_arith_mult_expr4057); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_arith_pow_expr_in_arith_mult_expr4061);
            	    arith_pow_expr396=arith_pow_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, arith_pow_expr396.getTree());

            	    }
            	    break;

            	default :
            	    break loop183;
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:620:1: p_arith_mult_expr : p_arith_pow_expr ( ( NL )? ( TIMES | QUOTIENT | L_div | L_mod ) ( NL )? p_arith_pow_expr )* ;
    public final babel17Parser.p_arith_mult_expr_return p_arith_mult_expr() throws RecognitionException {
        babel17Parser.p_arith_mult_expr_return retval = new babel17Parser.p_arith_mult_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL398=null;
        Token set399=null;
        Token NL400=null;
        babel17Parser.p_arith_pow_expr_return p_arith_pow_expr397 = null;

        babel17Parser.p_arith_pow_expr_return p_arith_pow_expr401 = null;


        CommonTree NL398_tree=null;
        CommonTree set399_tree=null;
        CommonTree NL400_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:621:2: ( p_arith_pow_expr ( ( NL )? ( TIMES | QUOTIENT | L_div | L_mod ) ( NL )? p_arith_pow_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:621:4: p_arith_pow_expr ( ( NL )? ( TIMES | QUOTIENT | L_div | L_mod ) ( NL )? p_arith_pow_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_arith_pow_expr_in_p_arith_mult_expr4073);
            p_arith_pow_expr397=p_arith_pow_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_arith_pow_expr397.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:621:21: ( ( NL )? ( TIMES | QUOTIENT | L_div | L_mod ) ( NL )? p_arith_pow_expr )*
            loop186:
            do {
                int alt186=2;
                int LA186_0 = input.LA(1);

                if ( (LA186_0==NL) ) {
                    int LA186_1 = input.LA(2);

                    if ( ((LA186_1>=L_div && LA186_1<=L_mod)||(LA186_1>=TIMES && LA186_1<=QUOTIENT)) ) {
                        alt186=1;
                    }


                }
                else if ( ((LA186_0>=L_div && LA186_0<=L_mod)||(LA186_0>=TIMES && LA186_0<=QUOTIENT)) ) {
                    alt186=1;
                }


                switch (alt186) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:621:22: ( NL )? ( TIMES | QUOTIENT | L_div | L_mod ) ( NL )? p_arith_pow_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:621:24: ( NL )?
            	    int alt184=2;
            	    int LA184_0 = input.LA(1);

            	    if ( (LA184_0==NL) ) {
            	        alt184=1;
            	    }
            	    switch (alt184) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:621:24: NL
            	            {
            	            NL398=(Token)match(input,NL,FOLLOW_NL_in_p_arith_mult_expr4076); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    set399=(Token)input.LT(1);
            	    set399=(Token)input.LT(1);
            	    if ( (input.LA(1)>=L_div && input.LA(1)<=L_mod)||(input.LA(1)>=TIMES && input.LA(1)<=QUOTIENT) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set399), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:621:65: ( NL )?
            	    int alt185=2;
            	    int LA185_0 = input.LA(1);

            	    if ( (LA185_0==NL) ) {
            	        alt185=1;
            	    }
            	    switch (alt185) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:621:65: NL
            	            {
            	            NL400=(Token)match(input,NL,FOLLOW_NL_in_p_arith_mult_expr4097); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_arith_pow_expr_in_p_arith_mult_expr4101);
            	    p_arith_pow_expr401=p_arith_pow_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_arith_pow_expr401.getTree());

            	    }
            	    break;

            	default :
            	    break loop186;
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:623:1: arith_pow_expr : apply_expr ( ( NL )? POW_tok ( NL )? apply_expr )* -> ^( POW ( apply_expr )* ) ;
    public final babel17Parser.arith_pow_expr_return arith_pow_expr() throws RecognitionException {
        babel17Parser.arith_pow_expr_return retval = new babel17Parser.arith_pow_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL403=null;
        Token POW_tok404=null;
        Token NL405=null;
        babel17Parser.apply_expr_return apply_expr402 = null;

        babel17Parser.apply_expr_return apply_expr406 = null;


        CommonTree NL403_tree=null;
        CommonTree POW_tok404_tree=null;
        CommonTree NL405_tree=null;
        RewriteRuleTokenStream stream_POW_tok=new RewriteRuleTokenStream(adaptor,"token POW_tok");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_apply_expr=new RewriteRuleSubtreeStream(adaptor,"rule apply_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:624:2: ( apply_expr ( ( NL )? POW_tok ( NL )? apply_expr )* -> ^( POW ( apply_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:624:4: apply_expr ( ( NL )? POW_tok ( NL )? apply_expr )*
            {
            pushFollow(FOLLOW_apply_expr_in_arith_pow_expr4112);
            apply_expr402=apply_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_apply_expr.add(apply_expr402.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:624:15: ( ( NL )? POW_tok ( NL )? apply_expr )*
            loop189:
            do {
                int alt189=2;
                int LA189_0 = input.LA(1);

                if ( (LA189_0==NL) ) {
                    int LA189_1 = input.LA(2);

                    if ( (LA189_1==POW_tok) ) {
                        alt189=1;
                    }


                }
                else if ( (LA189_0==POW_tok) ) {
                    alt189=1;
                }


                switch (alt189) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:624:16: ( NL )? POW_tok ( NL )? apply_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:624:16: ( NL )?
            	    int alt187=2;
            	    int LA187_0 = input.LA(1);

            	    if ( (LA187_0==NL) ) {
            	        alt187=1;
            	    }
            	    switch (alt187) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:624:16: NL
            	            {
            	            NL403=(Token)match(input,NL,FOLLOW_NL_in_arith_pow_expr4115); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL403);


            	            }
            	            break;

            	    }

            	    POW_tok404=(Token)match(input,POW_tok,FOLLOW_POW_tok_in_arith_pow_expr4118); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_POW_tok.add(POW_tok404);

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:624:28: ( NL )?
            	    int alt188=2;
            	    int LA188_0 = input.LA(1);

            	    if ( (LA188_0==NL) ) {
            	        alt188=1;
            	    }
            	    switch (alt188) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:624:28: NL
            	            {
            	            NL405=(Token)match(input,NL,FOLLOW_NL_in_arith_pow_expr4120); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL405);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_apply_expr_in_arith_pow_expr4123);
            	    apply_expr406=apply_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_apply_expr.add(apply_expr406.getTree());

            	    }
            	    break;

            	default :
            	    break loop189;
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
            // 624:45: -> ^( POW ( apply_expr )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:624:48: ^( POW ( apply_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(POW, "POW"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:624:54: ( apply_expr )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:626:1: p_arith_pow_expr : p_apply_expr ( ( NL )? POW_tok ( NL )? p_apply_expr )* -> ^( POW ( p_apply_expr )* ) ;
    public final babel17Parser.p_arith_pow_expr_return p_arith_pow_expr() throws RecognitionException {
        babel17Parser.p_arith_pow_expr_return retval = new babel17Parser.p_arith_pow_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL408=null;
        Token POW_tok409=null;
        Token NL410=null;
        babel17Parser.p_apply_expr_return p_apply_expr407 = null;

        babel17Parser.p_apply_expr_return p_apply_expr411 = null;


        CommonTree NL408_tree=null;
        CommonTree POW_tok409_tree=null;
        CommonTree NL410_tree=null;
        RewriteRuleTokenStream stream_POW_tok=new RewriteRuleTokenStream(adaptor,"token POW_tok");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_p_apply_expr=new RewriteRuleSubtreeStream(adaptor,"rule p_apply_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:627:2: ( p_apply_expr ( ( NL )? POW_tok ( NL )? p_apply_expr )* -> ^( POW ( p_apply_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:627:4: p_apply_expr ( ( NL )? POW_tok ( NL )? p_apply_expr )*
            {
            pushFollow(FOLLOW_p_apply_expr_in_p_arith_pow_expr4144);
            p_apply_expr407=p_apply_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_p_apply_expr.add(p_apply_expr407.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:627:17: ( ( NL )? POW_tok ( NL )? p_apply_expr )*
            loop192:
            do {
                int alt192=2;
                int LA192_0 = input.LA(1);

                if ( (LA192_0==NL) ) {
                    int LA192_1 = input.LA(2);

                    if ( (LA192_1==POW_tok) ) {
                        alt192=1;
                    }


                }
                else if ( (LA192_0==POW_tok) ) {
                    alt192=1;
                }


                switch (alt192) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:627:18: ( NL )? POW_tok ( NL )? p_apply_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:627:18: ( NL )?
            	    int alt190=2;
            	    int LA190_0 = input.LA(1);

            	    if ( (LA190_0==NL) ) {
            	        alt190=1;
            	    }
            	    switch (alt190) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:627:18: NL
            	            {
            	            NL408=(Token)match(input,NL,FOLLOW_NL_in_p_arith_pow_expr4147); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL408);


            	            }
            	            break;

            	    }

            	    POW_tok409=(Token)match(input,POW_tok,FOLLOW_POW_tok_in_p_arith_pow_expr4150); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_POW_tok.add(POW_tok409);

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:627:30: ( NL )?
            	    int alt191=2;
            	    int LA191_0 = input.LA(1);

            	    if ( (LA191_0==NL) ) {
            	        alt191=1;
            	    }
            	    switch (alt191) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:627:30: NL
            	            {
            	            NL410=(Token)match(input,NL,FOLLOW_NL_in_p_arith_pow_expr4152); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL410);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_apply_expr_in_p_arith_pow_expr4155);
            	    p_apply_expr411=p_apply_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_p_apply_expr.add(p_apply_expr411.getTree());

            	    }
            	    break;

            	default :
            	    break loop192;
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
            // 627:49: -> ^( POW ( p_apply_expr )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:627:52: ^( POW ( p_apply_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(POW, "POW"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:627:58: ( p_apply_expr )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:629:1: apply_expr : ( basic_expr )+ -> ^( APPLY ( basic_expr )* ) ;
    public final babel17Parser.apply_expr_return apply_expr() throws RecognitionException {
        babel17Parser.apply_expr_return retval = new babel17Parser.apply_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.basic_expr_return basic_expr412 = null;


        RewriteRuleSubtreeStream stream_basic_expr=new RewriteRuleSubtreeStream(adaptor,"rule basic_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:630:2: ( ( basic_expr )+ -> ^( APPLY ( basic_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:630:4: ( basic_expr )+
            {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:630:4: ( basic_expr )+
            int cnt193=0;
            loop193:
            do {
                int alt193=2;
                int LA193_0 = input.LA(1);

                if ( (LA193_0==L_begin||(LA193_0>=L_with && LA193_0<=L_if)||(LA193_0>=L_while && LA193_0<=L_for)||LA193_0==L_match||(LA193_0>=A_infinity && LA193_0<=U_infinity)||(LA193_0>=L_true && LA193_0<=L_this)||LA193_0==L_nil||(LA193_0>=Constr && LA193_0<=Num)||(LA193_0>=String && LA193_0<=ROUND_BRACKET_OPEN)||LA193_0==SQUARE_BRACKET_OPEN||LA193_0==CURLY_BRACKET_OPEN) ) {
                    alt193=1;
                }


                switch (alt193) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:630:4: basic_expr
            	    {
            	    pushFollow(FOLLOW_basic_expr_in_apply_expr4176);
            	    basic_expr412=basic_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_basic_expr.add(basic_expr412.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt193 >= 1 ) break loop193;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(193, input);
                        throw eee;
                }
                cnt193++;
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
            // 630:16: -> ^( APPLY ( basic_expr )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:630:19: ^( APPLY ( basic_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(APPLY, "APPLY"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:630:27: ( basic_expr )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:631:1: p_apply_expr : p_basic_expr ( ( NL )? p_basic_expr )* -> ^( APPLY ( p_basic_expr )* ) ;
    public final babel17Parser.p_apply_expr_return p_apply_expr() throws RecognitionException {
        babel17Parser.p_apply_expr_return retval = new babel17Parser.p_apply_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL414=null;
        babel17Parser.p_basic_expr_return p_basic_expr413 = null;

        babel17Parser.p_basic_expr_return p_basic_expr415 = null;


        CommonTree NL414_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_p_basic_expr=new RewriteRuleSubtreeStream(adaptor,"rule p_basic_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:632:2: ( p_basic_expr ( ( NL )? p_basic_expr )* -> ^( APPLY ( p_basic_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:632:4: p_basic_expr ( ( NL )? p_basic_expr )*
            {
            pushFollow(FOLLOW_p_basic_expr_in_p_apply_expr4194);
            p_basic_expr413=p_basic_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_p_basic_expr.add(p_basic_expr413.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:632:17: ( ( NL )? p_basic_expr )*
            loop195:
            do {
                int alt195=2;
                int LA195_0 = input.LA(1);

                if ( (LA195_0==NL) ) {
                    int LA195_1 = input.LA(2);

                    if ( (LA195_1==L_begin||(LA195_1>=L_with && LA195_1<=L_if)||(LA195_1>=L_while && LA195_1<=L_for)||LA195_1==L_match||(LA195_1>=A_infinity && LA195_1<=U_infinity)||(LA195_1>=L_true && LA195_1<=L_this)||LA195_1==L_nil||(LA195_1>=Constr && LA195_1<=Num)||(LA195_1>=String && LA195_1<=ROUND_BRACKET_OPEN)||LA195_1==SQUARE_BRACKET_OPEN||LA195_1==CURLY_BRACKET_OPEN) ) {
                        alt195=1;
                    }


                }
                else if ( (LA195_0==L_begin||(LA195_0>=L_with && LA195_0<=L_if)||(LA195_0>=L_while && LA195_0<=L_for)||LA195_0==L_match||(LA195_0>=A_infinity && LA195_0<=U_infinity)||(LA195_0>=L_true && LA195_0<=L_this)||LA195_0==L_nil||(LA195_0>=Constr && LA195_0<=Num)||(LA195_0>=String && LA195_0<=ROUND_BRACKET_OPEN)||LA195_0==SQUARE_BRACKET_OPEN||LA195_0==CURLY_BRACKET_OPEN) ) {
                    alt195=1;
                }


                switch (alt195) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:632:18: ( NL )? p_basic_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:632:18: ( NL )?
            	    int alt194=2;
            	    int LA194_0 = input.LA(1);

            	    if ( (LA194_0==NL) ) {
            	        alt194=1;
            	    }
            	    switch (alt194) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:632:18: NL
            	            {
            	            NL414=(Token)match(input,NL,FOLLOW_NL_in_p_apply_expr4197); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL414);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_basic_expr_in_p_apply_expr4200);
            	    p_basic_expr415=p_basic_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_p_basic_expr.add(p_basic_expr415.getTree());

            	    }
            	    break;

            	default :
            	    break loop195;
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
            // 632:37: -> ^( APPLY ( p_basic_expr )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:632:40: ^( APPLY ( p_basic_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(APPLY, "APPLY"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:632:48: ( p_basic_expr )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:634:1: basic_expr : message_send_expr ;
    public final babel17Parser.basic_expr_return basic_expr() throws RecognitionException {
        babel17Parser.basic_expr_return retval = new babel17Parser.basic_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.message_send_expr_return message_send_expr416 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:635:2: ( message_send_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:635:4: message_send_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_message_send_expr_in_basic_expr4220);
            message_send_expr416=message_send_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, message_send_expr416.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:637:1: p_basic_expr : message_send_expr ;
    public final babel17Parser.p_basic_expr_return p_basic_expr() throws RecognitionException {
        babel17Parser.p_basic_expr_return retval = new babel17Parser.p_basic_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.message_send_expr_return message_send_expr417 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:638:2: ( message_send_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:638:4: message_send_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_message_send_expr_in_p_basic_expr4229);
            message_send_expr417=message_send_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, message_send_expr417.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:640:1: message_send_expr : primitive_expr ( ( NL )? PERIOD ( NL )? Id )* -> ^( MESSAGE_SEND primitive_expr ( Id )* ) ;
    public final babel17Parser.message_send_expr_return message_send_expr() throws RecognitionException {
        babel17Parser.message_send_expr_return retval = new babel17Parser.message_send_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL419=null;
        Token PERIOD420=null;
        Token NL421=null;
        Token Id422=null;
        babel17Parser.primitive_expr_return primitive_expr418 = null;


        CommonTree NL419_tree=null;
        CommonTree PERIOD420_tree=null;
        CommonTree NL421_tree=null;
        CommonTree Id422_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
        RewriteRuleTokenStream stream_Id=new RewriteRuleTokenStream(adaptor,"token Id");
        RewriteRuleSubtreeStream stream_primitive_expr=new RewriteRuleSubtreeStream(adaptor,"rule primitive_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:641:2: ( primitive_expr ( ( NL )? PERIOD ( NL )? Id )* -> ^( MESSAGE_SEND primitive_expr ( Id )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:641:4: primitive_expr ( ( NL )? PERIOD ( NL )? Id )*
            {
            pushFollow(FOLLOW_primitive_expr_in_message_send_expr4238);
            primitive_expr418=primitive_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_primitive_expr.add(primitive_expr418.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:641:19: ( ( NL )? PERIOD ( NL )? Id )*
            loop198:
            do {
                int alt198=2;
                int LA198_0 = input.LA(1);

                if ( (LA198_0==NL) ) {
                    int LA198_1 = input.LA(2);

                    if ( (LA198_1==PERIOD) ) {
                        alt198=1;
                    }


                }
                else if ( (LA198_0==PERIOD) ) {
                    alt198=1;
                }


                switch (alt198) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:641:20: ( NL )? PERIOD ( NL )? Id
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:641:20: ( NL )?
            	    int alt196=2;
            	    int LA196_0 = input.LA(1);

            	    if ( (LA196_0==NL) ) {
            	        alt196=1;
            	    }
            	    switch (alt196) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:641:20: NL
            	            {
            	            NL419=(Token)match(input,NL,FOLLOW_NL_in_message_send_expr4241); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL419);


            	            }
            	            break;

            	    }

            	    PERIOD420=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_message_send_expr4244); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD420);

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:641:31: ( NL )?
            	    int alt197=2;
            	    int LA197_0 = input.LA(1);

            	    if ( (LA197_0==NL) ) {
            	        alt197=1;
            	    }
            	    switch (alt197) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:641:31: NL
            	            {
            	            NL421=(Token)match(input,NL,FOLLOW_NL_in_message_send_expr4246); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL421);


            	            }
            	            break;

            	    }

            	    Id422=(Token)match(input,Id,FOLLOW_Id_in_message_send_expr4249); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_Id.add(Id422);


            	    }
            	    break;

            	default :
            	    break loop198;
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
            // 641:40: -> ^( MESSAGE_SEND primitive_expr ( Id )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:641:43: ^( MESSAGE_SEND primitive_expr ( Id )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MESSAGE_SEND, "MESSAGE_SEND"), root_1);

                adaptor.addChild(root_1, stream_primitive_expr.nextTree());
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:641:73: ( Id )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:643:1: list_expr : ( '[' ( NL )? ( protected_expr ( ( NL )? COMMA ( NL )? protected_expr )* ( NL )? )? ']' -> ^( SQUARE_LIST ( protected_expr )* ) | '(' ( NL )? ( protected_expr ( ( NL )? COMMA ( NL )? protected_expr )* ( NL )? ( COMMA ( NL )? )? )? ')' -> ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( protected_expr )* ) ) );
    public final babel17Parser.list_expr_return list_expr() throws RecognitionException {
        babel17Parser.list_expr_return retval = new babel17Parser.list_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal423=null;
        Token NL424=null;
        Token NL426=null;
        Token COMMA427=null;
        Token NL428=null;
        Token NL430=null;
        Token char_literal431=null;
        Token char_literal432=null;
        Token NL433=null;
        Token NL435=null;
        Token COMMA436=null;
        Token NL437=null;
        Token NL439=null;
        Token COMMA440=null;
        Token NL441=null;
        Token char_literal442=null;
        babel17Parser.protected_expr_return protected_expr425 = null;

        babel17Parser.protected_expr_return protected_expr429 = null;

        babel17Parser.protected_expr_return protected_expr434 = null;

        babel17Parser.protected_expr_return protected_expr438 = null;


        CommonTree char_literal423_tree=null;
        CommonTree NL424_tree=null;
        CommonTree NL426_tree=null;
        CommonTree COMMA427_tree=null;
        CommonTree NL428_tree=null;
        CommonTree NL430_tree=null;
        CommonTree char_literal431_tree=null;
        CommonTree char_literal432_tree=null;
        CommonTree NL433_tree=null;
        CommonTree NL435_tree=null;
        CommonTree COMMA436_tree=null;
        CommonTree NL437_tree=null;
        CommonTree NL439_tree=null;
        CommonTree COMMA440_tree=null;
        CommonTree NL441_tree=null;
        CommonTree char_literal442_tree=null;
        RewriteRuleTokenStream stream_ROUND_BRACKET_OPEN=new RewriteRuleTokenStream(adaptor,"token ROUND_BRACKET_OPEN");
        RewriteRuleTokenStream stream_SQUARE_BRACKET_CLOSE=new RewriteRuleTokenStream(adaptor,"token SQUARE_BRACKET_CLOSE");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_ROUND_BRACKET_CLOSE=new RewriteRuleTokenStream(adaptor,"token ROUND_BRACKET_CLOSE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_SQUARE_BRACKET_OPEN=new RewriteRuleTokenStream(adaptor,"token SQUARE_BRACKET_OPEN");
        RewriteRuleSubtreeStream stream_protected_expr=new RewriteRuleSubtreeStream(adaptor,"rule protected_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:644:2: ( '[' ( NL )? ( protected_expr ( ( NL )? COMMA ( NL )? protected_expr )* ( NL )? )? ']' -> ^( SQUARE_LIST ( protected_expr )* ) | '(' ( NL )? ( protected_expr ( ( NL )? COMMA ( NL )? protected_expr )* ( NL )? ( COMMA ( NL )? )? )? ')' -> ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( protected_expr )* ) ) )
            int alt213=2;
            int LA213_0 = input.LA(1);

            if ( (LA213_0==SQUARE_BRACKET_OPEN) ) {
                alt213=1;
            }
            else if ( (LA213_0==ROUND_BRACKET_OPEN) ) {
                alt213=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 213, 0, input);

                throw nvae;
            }
            switch (alt213) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:644:4: '[' ( NL )? ( protected_expr ( ( NL )? COMMA ( NL )? protected_expr )* ( NL )? )? ']'
                    {
                    char_literal423=(Token)match(input,SQUARE_BRACKET_OPEN,FOLLOW_SQUARE_BRACKET_OPEN_in_list_expr4273); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SQUARE_BRACKET_OPEN.add(char_literal423);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:644:8: ( NL )?
                    int alt199=2;
                    int LA199_0 = input.LA(1);

                    if ( (LA199_0==NL) ) {
                        alt199=1;
                    }
                    switch (alt199) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:644:8: NL
                            {
                            NL424=(Token)match(input,NL,FOLLOW_NL_in_list_expr4275); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL424);


                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:644:12: ( protected_expr ( ( NL )? COMMA ( NL )? protected_expr )* ( NL )? )?
                    int alt204=2;
                    int LA204_0 = input.LA(1);

                    if ( (LA204_0==L_begin||(LA204_0>=L_obj && LA204_0<=L_if)||(LA204_0>=L_while && LA204_0<=L_for)||(LA204_0>=L_match && LA204_0<=L_case)||LA204_0==L_exception||(LA204_0>=A_infinity && LA204_0<=L_lazy)||(LA204_0>=L_true && LA204_0<=L_nil)||LA204_0==MINUS||LA204_0==A_NOT||LA204_0==U_NOT||(LA204_0>=A_ELLIPSIS && LA204_0<=U_ELLIPSIS)||LA204_0==L_force||(LA204_0>=Constr && LA204_0<=Num)||(LA204_0>=String && LA204_0<=ROUND_BRACKET_OPEN)||LA204_0==SQUARE_BRACKET_OPEN||LA204_0==CURLY_BRACKET_OPEN||LA204_0==UNDERSCORE) ) {
                        alt204=1;
                    }
                    switch (alt204) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:644:13: protected_expr ( ( NL )? COMMA ( NL )? protected_expr )* ( NL )?
                            {
                            pushFollow(FOLLOW_protected_expr_in_list_expr4279);
                            protected_expr425=protected_expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr425.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:644:28: ( ( NL )? COMMA ( NL )? protected_expr )*
                            loop202:
                            do {
                                int alt202=2;
                                int LA202_0 = input.LA(1);

                                if ( (LA202_0==NL) ) {
                                    int LA202_1 = input.LA(2);

                                    if ( (LA202_1==COMMA) ) {
                                        alt202=1;
                                    }


                                }
                                else if ( (LA202_0==COMMA) ) {
                                    alt202=1;
                                }


                                switch (alt202) {
                            	case 1 :
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:644:29: ( NL )? COMMA ( NL )? protected_expr
                            	    {
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:644:29: ( NL )?
                            	    int alt200=2;
                            	    int LA200_0 = input.LA(1);

                            	    if ( (LA200_0==NL) ) {
                            	        alt200=1;
                            	    }
                            	    switch (alt200) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:644:29: NL
                            	            {
                            	            NL426=(Token)match(input,NL,FOLLOW_NL_in_list_expr4282); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL426);


                            	            }
                            	            break;

                            	    }

                            	    COMMA427=(Token)match(input,COMMA,FOLLOW_COMMA_in_list_expr4285); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA427);

                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:644:39: ( NL )?
                            	    int alt201=2;
                            	    int LA201_0 = input.LA(1);

                            	    if ( (LA201_0==NL) ) {
                            	        alt201=1;
                            	    }
                            	    switch (alt201) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:644:39: NL
                            	            {
                            	            NL428=(Token)match(input,NL,FOLLOW_NL_in_list_expr4287); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL428);


                            	            }
                            	            break;

                            	    }

                            	    pushFollow(FOLLOW_protected_expr_in_list_expr4290);
                            	    protected_expr429=protected_expr();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr429.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop202;
                                }
                            } while (true);

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:644:60: ( NL )?
                            int alt203=2;
                            int LA203_0 = input.LA(1);

                            if ( (LA203_0==NL) ) {
                                alt203=1;
                            }
                            switch (alt203) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:644:60: NL
                                    {
                                    NL430=(Token)match(input,NL,FOLLOW_NL_in_list_expr4294); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL430);


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    char_literal431=(Token)match(input,SQUARE_BRACKET_CLOSE,FOLLOW_SQUARE_BRACKET_CLOSE_in_list_expr4299); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SQUARE_BRACKET_CLOSE.add(char_literal431);



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
                    // 644:70: -> ^( SQUARE_LIST ( protected_expr )* )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:644:73: ^( SQUARE_LIST ( protected_expr )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SQUARE_LIST, "SQUARE_LIST"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:644:87: ( protected_expr )*
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:645:4: '(' ( NL )? ( protected_expr ( ( NL )? COMMA ( NL )? protected_expr )* ( NL )? ( COMMA ( NL )? )? )? ')'
                    {
                    char_literal432=(Token)match(input,ROUND_BRACKET_OPEN,FOLLOW_ROUND_BRACKET_OPEN_in_list_expr4313); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ROUND_BRACKET_OPEN.add(char_literal432);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:645:8: ( NL )?
                    int alt205=2;
                    int LA205_0 = input.LA(1);

                    if ( (LA205_0==NL) ) {
                        alt205=1;
                    }
                    switch (alt205) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:645:8: NL
                            {
                            NL433=(Token)match(input,NL,FOLLOW_NL_in_list_expr4315); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL433);


                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:645:12: ( protected_expr ( ( NL )? COMMA ( NL )? protected_expr )* ( NL )? ( COMMA ( NL )? )? )?
                    int alt212=2;
                    int LA212_0 = input.LA(1);

                    if ( (LA212_0==L_begin||(LA212_0>=L_obj && LA212_0<=L_if)||(LA212_0>=L_while && LA212_0<=L_for)||(LA212_0>=L_match && LA212_0<=L_case)||LA212_0==L_exception||(LA212_0>=A_infinity && LA212_0<=L_lazy)||(LA212_0>=L_true && LA212_0<=L_nil)||LA212_0==MINUS||LA212_0==A_NOT||LA212_0==U_NOT||(LA212_0>=A_ELLIPSIS && LA212_0<=U_ELLIPSIS)||LA212_0==L_force||(LA212_0>=Constr && LA212_0<=Num)||(LA212_0>=String && LA212_0<=ROUND_BRACKET_OPEN)||LA212_0==SQUARE_BRACKET_OPEN||LA212_0==CURLY_BRACKET_OPEN||LA212_0==UNDERSCORE) ) {
                        alt212=1;
                    }
                    switch (alt212) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:645:13: protected_expr ( ( NL )? COMMA ( NL )? protected_expr )* ( NL )? ( COMMA ( NL )? )?
                            {
                            pushFollow(FOLLOW_protected_expr_in_list_expr4319);
                            protected_expr434=protected_expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr434.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:645:28: ( ( NL )? COMMA ( NL )? protected_expr )*
                            loop208:
                            do {
                                int alt208=2;
                                int LA208_0 = input.LA(1);

                                if ( (LA208_0==NL) ) {
                                    int LA208_1 = input.LA(2);

                                    if ( (LA208_1==COMMA) ) {
                                        int LA208_2 = input.LA(3);

                                        if ( (LA208_2==NL) ) {
                                            int LA208_4 = input.LA(4);

                                            if ( (LA208_4==L_begin||(LA208_4>=L_obj && LA208_4<=L_if)||(LA208_4>=L_while && LA208_4<=L_for)||(LA208_4>=L_match && LA208_4<=L_case)||LA208_4==L_exception||(LA208_4>=A_infinity && LA208_4<=L_lazy)||(LA208_4>=L_true && LA208_4<=L_nil)||LA208_4==MINUS||LA208_4==A_NOT||LA208_4==U_NOT||(LA208_4>=A_ELLIPSIS && LA208_4<=U_ELLIPSIS)||LA208_4==L_force||(LA208_4>=Constr && LA208_4<=Num)||(LA208_4>=String && LA208_4<=ROUND_BRACKET_OPEN)||LA208_4==SQUARE_BRACKET_OPEN||LA208_4==CURLY_BRACKET_OPEN||LA208_4==UNDERSCORE) ) {
                                                alt208=1;
                                            }


                                        }
                                        else if ( (LA208_2==L_begin||(LA208_2>=L_obj && LA208_2<=L_if)||(LA208_2>=L_while && LA208_2<=L_for)||(LA208_2>=L_match && LA208_2<=L_case)||LA208_2==L_exception||(LA208_2>=A_infinity && LA208_2<=L_lazy)||(LA208_2>=L_true && LA208_2<=L_nil)||LA208_2==MINUS||LA208_2==A_NOT||LA208_2==U_NOT||(LA208_2>=A_ELLIPSIS && LA208_2<=U_ELLIPSIS)||LA208_2==L_force||(LA208_2>=Constr && LA208_2<=Num)||(LA208_2>=String && LA208_2<=ROUND_BRACKET_OPEN)||LA208_2==SQUARE_BRACKET_OPEN||LA208_2==CURLY_BRACKET_OPEN||LA208_2==UNDERSCORE) ) {
                                            alt208=1;
                                        }


                                    }


                                }
                                else if ( (LA208_0==COMMA) ) {
                                    int LA208_2 = input.LA(2);

                                    if ( (LA208_2==NL) ) {
                                        int LA208_4 = input.LA(3);

                                        if ( (LA208_4==L_begin||(LA208_4>=L_obj && LA208_4<=L_if)||(LA208_4>=L_while && LA208_4<=L_for)||(LA208_4>=L_match && LA208_4<=L_case)||LA208_4==L_exception||(LA208_4>=A_infinity && LA208_4<=L_lazy)||(LA208_4>=L_true && LA208_4<=L_nil)||LA208_4==MINUS||LA208_4==A_NOT||LA208_4==U_NOT||(LA208_4>=A_ELLIPSIS && LA208_4<=U_ELLIPSIS)||LA208_4==L_force||(LA208_4>=Constr && LA208_4<=Num)||(LA208_4>=String && LA208_4<=ROUND_BRACKET_OPEN)||LA208_4==SQUARE_BRACKET_OPEN||LA208_4==CURLY_BRACKET_OPEN||LA208_4==UNDERSCORE) ) {
                                            alt208=1;
                                        }


                                    }
                                    else if ( (LA208_2==L_begin||(LA208_2>=L_obj && LA208_2<=L_if)||(LA208_2>=L_while && LA208_2<=L_for)||(LA208_2>=L_match && LA208_2<=L_case)||LA208_2==L_exception||(LA208_2>=A_infinity && LA208_2<=L_lazy)||(LA208_2>=L_true && LA208_2<=L_nil)||LA208_2==MINUS||LA208_2==A_NOT||LA208_2==U_NOT||(LA208_2>=A_ELLIPSIS && LA208_2<=U_ELLIPSIS)||LA208_2==L_force||(LA208_2>=Constr && LA208_2<=Num)||(LA208_2>=String && LA208_2<=ROUND_BRACKET_OPEN)||LA208_2==SQUARE_BRACKET_OPEN||LA208_2==CURLY_BRACKET_OPEN||LA208_2==UNDERSCORE) ) {
                                        alt208=1;
                                    }


                                }


                                switch (alt208) {
                            	case 1 :
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:645:29: ( NL )? COMMA ( NL )? protected_expr
                            	    {
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:645:29: ( NL )?
                            	    int alt206=2;
                            	    int LA206_0 = input.LA(1);

                            	    if ( (LA206_0==NL) ) {
                            	        alt206=1;
                            	    }
                            	    switch (alt206) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:645:29: NL
                            	            {
                            	            NL435=(Token)match(input,NL,FOLLOW_NL_in_list_expr4322); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL435);


                            	            }
                            	            break;

                            	    }

                            	    COMMA436=(Token)match(input,COMMA,FOLLOW_COMMA_in_list_expr4325); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA436);

                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:645:39: ( NL )?
                            	    int alt207=2;
                            	    int LA207_0 = input.LA(1);

                            	    if ( (LA207_0==NL) ) {
                            	        alt207=1;
                            	    }
                            	    switch (alt207) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:645:39: NL
                            	            {
                            	            NL437=(Token)match(input,NL,FOLLOW_NL_in_list_expr4327); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL437);


                            	            }
                            	            break;

                            	    }

                            	    pushFollow(FOLLOW_protected_expr_in_list_expr4330);
                            	    protected_expr438=protected_expr();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr438.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop208;
                                }
                            } while (true);

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:645:60: ( NL )?
                            int alt209=2;
                            int LA209_0 = input.LA(1);

                            if ( (LA209_0==NL) ) {
                                alt209=1;
                            }
                            switch (alt209) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:645:60: NL
                                    {
                                    NL439=(Token)match(input,NL,FOLLOW_NL_in_list_expr4334); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL439);


                                    }
                                    break;

                            }

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:645:64: ( COMMA ( NL )? )?
                            int alt211=2;
                            int LA211_0 = input.LA(1);

                            if ( (LA211_0==COMMA) ) {
                                alt211=1;
                            }
                            switch (alt211) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:645:65: COMMA ( NL )?
                                    {
                                    COMMA440=(Token)match(input,COMMA,FOLLOW_COMMA_in_list_expr4338); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_COMMA.add(COMMA440);

                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:645:71: ( NL )?
                                    int alt210=2;
                                    int LA210_0 = input.LA(1);

                                    if ( (LA210_0==NL) ) {
                                        alt210=1;
                                    }
                                    switch (alt210) {
                                        case 1 :
                                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:645:71: NL
                                            {
                                            NL441=(Token)match(input,NL,FOLLOW_NL_in_list_expr4340); if (state.failed) return retval; 
                                            if ( state.backtracking==0 ) stream_NL.add(NL441);


                                            }
                                            break;

                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    char_literal442=(Token)match(input,ROUND_BRACKET_CLOSE,FOLLOW_ROUND_BRACKET_CLOSE_in_list_expr4347); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ROUND_BRACKET_CLOSE.add(char_literal442);



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
                    // 645:83: -> ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( protected_expr )* ) )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:645:86: ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( protected_expr )* ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ROUND_LIST, "ROUND_LIST"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:645:99: ^( NIL_TOKEN ( COMMA )* )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_2);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:645:111: ( COMMA )*
                        while ( stream_COMMA.hasNext() ) {
                            adaptor.addChild(root_2, stream_COMMA.nextNode());

                        }
                        stream_COMMA.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:645:119: ^( NIL_TOKEN ( protected_expr )* )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_2);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:645:131: ( protected_expr )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:647:1: map_or_set_expr : ( '{' ( NL )? ( map_or_set_elem_expr ( NL )? ( COMMA ( NL )? map_or_set_elem_expr ( NL )? )* )? '}' -> ^( MAP_OR_SET_OR_OBJ ( map_or_set_elem_expr )* ) | '{' ( NL )? token_ARROW ( NL )? '}' -> ^( EMPTY_MAP ) );
    public final babel17Parser.map_or_set_expr_return map_or_set_expr() throws RecognitionException {
        babel17Parser.map_or_set_expr_return retval = new babel17Parser.map_or_set_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal443=null;
        Token NL444=null;
        Token NL446=null;
        Token COMMA447=null;
        Token NL448=null;
        Token NL450=null;
        Token char_literal451=null;
        Token char_literal452=null;
        Token NL453=null;
        Token NL455=null;
        Token char_literal456=null;
        babel17Parser.map_or_set_elem_expr_return map_or_set_elem_expr445 = null;

        babel17Parser.map_or_set_elem_expr_return map_or_set_elem_expr449 = null;

        babel17Parser.token_ARROW_return token_ARROW454 = null;


        CommonTree char_literal443_tree=null;
        CommonTree NL444_tree=null;
        CommonTree NL446_tree=null;
        CommonTree COMMA447_tree=null;
        CommonTree NL448_tree=null;
        CommonTree NL450_tree=null;
        CommonTree char_literal451_tree=null;
        CommonTree char_literal452_tree=null;
        CommonTree NL453_tree=null;
        CommonTree NL455_tree=null;
        CommonTree char_literal456_tree=null;
        RewriteRuleTokenStream stream_CURLY_BRACKET_OPEN=new RewriteRuleTokenStream(adaptor,"token CURLY_BRACKET_OPEN");
        RewriteRuleTokenStream stream_CURLY_BRACKET_CLOSE=new RewriteRuleTokenStream(adaptor,"token CURLY_BRACKET_CLOSE");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_map_or_set_elem_expr=new RewriteRuleSubtreeStream(adaptor,"rule map_or_set_elem_expr");
        RewriteRuleSubtreeStream stream_token_ARROW=new RewriteRuleSubtreeStream(adaptor,"rule token_ARROW");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:648:2: ( '{' ( NL )? ( map_or_set_elem_expr ( NL )? ( COMMA ( NL )? map_or_set_elem_expr ( NL )? )* )? '}' -> ^( MAP_OR_SET_OR_OBJ ( map_or_set_elem_expr )* ) | '{' ( NL )? token_ARROW ( NL )? '}' -> ^( EMPTY_MAP ) )
            int alt222=2;
            int LA222_0 = input.LA(1);

            if ( (LA222_0==CURLY_BRACKET_OPEN) ) {
                switch ( input.LA(2) ) {
                case NL:
                    {
                    int LA222_2 = input.LA(3);

                    if ( (LA222_2==L_begin||(LA222_2>=L_obj && LA222_2<=L_if)||(LA222_2>=L_while && LA222_2<=L_for)||(LA222_2>=L_match && LA222_2<=L_case)||LA222_2==L_exception||(LA222_2>=A_infinity && LA222_2<=L_lazy)||(LA222_2>=L_true && LA222_2<=L_nil)||LA222_2==MINUS||LA222_2==A_NOT||LA222_2==U_NOT||(LA222_2>=A_ELLIPSIS && LA222_2<=U_ELLIPSIS)||LA222_2==L_force||(LA222_2>=Constr && LA222_2<=Num)||(LA222_2>=String && LA222_2<=ROUND_BRACKET_OPEN)||LA222_2==SQUARE_BRACKET_OPEN||(LA222_2>=CURLY_BRACKET_OPEN && LA222_2<=UNDERSCORE)) ) {
                        alt222=1;
                    }
                    else if ( ((LA222_2>=A_ARROW && LA222_2<=U_ARROW)) ) {
                        alt222=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 222, 2, input);

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
                    alt222=1;
                    }
                    break;
                case A_ARROW:
                case U_ARROW:
                    {
                    alt222=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 222, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 222, 0, input);

                throw nvae;
            }
            switch (alt222) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:648:4: '{' ( NL )? ( map_or_set_elem_expr ( NL )? ( COMMA ( NL )? map_or_set_elem_expr ( NL )? )* )? '}'
                    {
                    char_literal443=(Token)match(input,CURLY_BRACKET_OPEN,FOLLOW_CURLY_BRACKET_OPEN_in_map_or_set_expr4376); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_OPEN.add(char_literal443);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:648:8: ( NL )?
                    int alt214=2;
                    int LA214_0 = input.LA(1);

                    if ( (LA214_0==NL) ) {
                        alt214=1;
                    }
                    switch (alt214) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:648:8: NL
                            {
                            NL444=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_expr4378); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL444);


                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:648:12: ( map_or_set_elem_expr ( NL )? ( COMMA ( NL )? map_or_set_elem_expr ( NL )? )* )?
                    int alt219=2;
                    int LA219_0 = input.LA(1);

                    if ( (LA219_0==L_begin||(LA219_0>=L_obj && LA219_0<=L_if)||(LA219_0>=L_while && LA219_0<=L_for)||(LA219_0>=L_match && LA219_0<=L_case)||LA219_0==L_exception||(LA219_0>=A_infinity && LA219_0<=L_lazy)||(LA219_0>=L_true && LA219_0<=L_nil)||LA219_0==MINUS||LA219_0==A_NOT||LA219_0==U_NOT||(LA219_0>=A_ELLIPSIS && LA219_0<=U_ELLIPSIS)||LA219_0==L_force||(LA219_0>=Constr && LA219_0<=Num)||(LA219_0>=String && LA219_0<=ROUND_BRACKET_OPEN)||LA219_0==SQUARE_BRACKET_OPEN||LA219_0==CURLY_BRACKET_OPEN||LA219_0==UNDERSCORE) ) {
                        alt219=1;
                    }
                    switch (alt219) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:648:13: map_or_set_elem_expr ( NL )? ( COMMA ( NL )? map_or_set_elem_expr ( NL )? )*
                            {
                            pushFollow(FOLLOW_map_or_set_elem_expr_in_map_or_set_expr4382);
                            map_or_set_elem_expr445=map_or_set_elem_expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_map_or_set_elem_expr.add(map_or_set_elem_expr445.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:648:34: ( NL )?
                            int alt215=2;
                            int LA215_0 = input.LA(1);

                            if ( (LA215_0==NL) ) {
                                alt215=1;
                            }
                            switch (alt215) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:648:34: NL
                                    {
                                    NL446=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_expr4384); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL446);


                                    }
                                    break;

                            }

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:648:38: ( COMMA ( NL )? map_or_set_elem_expr ( NL )? )*
                            loop218:
                            do {
                                int alt218=2;
                                int LA218_0 = input.LA(1);

                                if ( (LA218_0==COMMA) ) {
                                    alt218=1;
                                }


                                switch (alt218) {
                            	case 1 :
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:648:39: COMMA ( NL )? map_or_set_elem_expr ( NL )?
                            	    {
                            	    COMMA447=(Token)match(input,COMMA,FOLLOW_COMMA_in_map_or_set_expr4388); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA447);

                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:648:45: ( NL )?
                            	    int alt216=2;
                            	    int LA216_0 = input.LA(1);

                            	    if ( (LA216_0==NL) ) {
                            	        alt216=1;
                            	    }
                            	    switch (alt216) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:648:45: NL
                            	            {
                            	            NL448=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_expr4390); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL448);


                            	            }
                            	            break;

                            	    }

                            	    pushFollow(FOLLOW_map_or_set_elem_expr_in_map_or_set_expr4393);
                            	    map_or_set_elem_expr449=map_or_set_elem_expr();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_map_or_set_elem_expr.add(map_or_set_elem_expr449.getTree());
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:648:70: ( NL )?
                            	    int alt217=2;
                            	    int LA217_0 = input.LA(1);

                            	    if ( (LA217_0==NL) ) {
                            	        alt217=1;
                            	    }
                            	    switch (alt217) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:648:70: NL
                            	            {
                            	            NL450=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_expr4395); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL450);


                            	            }
                            	            break;

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop218;
                                }
                            } while (true);


                            }
                            break;

                    }

                    char_literal451=(Token)match(input,CURLY_BRACKET_CLOSE,FOLLOW_CURLY_BRACKET_CLOSE_in_map_or_set_expr4402); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_CLOSE.add(char_literal451);



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
                    // 648:82: -> ^( MAP_OR_SET_OR_OBJ ( map_or_set_elem_expr )* )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:648:85: ^( MAP_OR_SET_OR_OBJ ( map_or_set_elem_expr )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MAP_OR_SET_OR_OBJ, "MAP_OR_SET_OR_OBJ"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:648:105: ( map_or_set_elem_expr )*
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:649:10: '{' ( NL )? token_ARROW ( NL )? '}'
                    {
                    char_literal452=(Token)match(input,CURLY_BRACKET_OPEN,FOLLOW_CURLY_BRACKET_OPEN_in_map_or_set_expr4422); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_OPEN.add(char_literal452);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:649:14: ( NL )?
                    int alt220=2;
                    int LA220_0 = input.LA(1);

                    if ( (LA220_0==NL) ) {
                        alt220=1;
                    }
                    switch (alt220) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:649:14: NL
                            {
                            NL453=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_expr4424); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL453);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_token_ARROW_in_map_or_set_expr4427);
                    token_ARROW454=token_ARROW();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_token_ARROW.add(token_ARROW454.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:649:30: ( NL )?
                    int alt221=2;
                    int LA221_0 = input.LA(1);

                    if ( (LA221_0==NL) ) {
                        alt221=1;
                    }
                    switch (alt221) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:649:30: NL
                            {
                            NL455=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_expr4429); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL455);


                            }
                            break;

                    }

                    char_literal456=(Token)match(input,CURLY_BRACKET_CLOSE,FOLLOW_CURLY_BRACKET_CLOSE_in_map_or_set_expr4432); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_CLOSE.add(char_literal456);



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
                    // 649:38: -> ^( EMPTY_MAP )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:649:41: ^( EMPTY_MAP )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:651:1: map_or_set_elem_expr : protected_expr ( ( NL )? arrow_or_assign ( NL )? protected_expr )? -> ^( NIL_TOKEN ^( NIL_TOKEN ( protected_expr )* ) ( arrow_or_assign )* ) ;
    public final babel17Parser.map_or_set_elem_expr_return map_or_set_elem_expr() throws RecognitionException {
        babel17Parser.map_or_set_elem_expr_return retval = new babel17Parser.map_or_set_elem_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL458=null;
        Token NL460=null;
        babel17Parser.protected_expr_return protected_expr457 = null;

        babel17Parser.arrow_or_assign_return arrow_or_assign459 = null;

        babel17Parser.protected_expr_return protected_expr461 = null;


        CommonTree NL458_tree=null;
        CommonTree NL460_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_protected_expr=new RewriteRuleSubtreeStream(adaptor,"rule protected_expr");
        RewriteRuleSubtreeStream stream_arrow_or_assign=new RewriteRuleSubtreeStream(adaptor,"rule arrow_or_assign");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:652:2: ( protected_expr ( ( NL )? arrow_or_assign ( NL )? protected_expr )? -> ^( NIL_TOKEN ^( NIL_TOKEN ( protected_expr )* ) ( arrow_or_assign )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:652:4: protected_expr ( ( NL )? arrow_or_assign ( NL )? protected_expr )?
            {
            pushFollow(FOLLOW_protected_expr_in_map_or_set_elem_expr4449);
            protected_expr457=protected_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr457.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:652:19: ( ( NL )? arrow_or_assign ( NL )? protected_expr )?
            int alt225=2;
            int LA225_0 = input.LA(1);

            if ( (LA225_0==NL) ) {
                int LA225_1 = input.LA(2);

                if ( (LA225_1==ASSIGN||(LA225_1>=A_ARROW && LA225_1<=U_ARROW)) ) {
                    alt225=1;
                }
            }
            else if ( (LA225_0==ASSIGN||(LA225_0>=A_ARROW && LA225_0<=U_ARROW)) ) {
                alt225=1;
            }
            switch (alt225) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:652:20: ( NL )? arrow_or_assign ( NL )? protected_expr
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:652:20: ( NL )?
                    int alt223=2;
                    int LA223_0 = input.LA(1);

                    if ( (LA223_0==NL) ) {
                        alt223=1;
                    }
                    switch (alt223) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:652:20: NL
                            {
                            NL458=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_elem_expr4452); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL458);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_arrow_or_assign_in_map_or_set_elem_expr4455);
                    arrow_or_assign459=arrow_or_assign();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_arrow_or_assign.add(arrow_or_assign459.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:652:40: ( NL )?
                    int alt224=2;
                    int LA224_0 = input.LA(1);

                    if ( (LA224_0==NL) ) {
                        alt224=1;
                    }
                    switch (alt224) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:652:40: NL
                            {
                            NL460=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_elem_expr4457); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL460);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_protected_expr_in_map_or_set_elem_expr4460);
                    protected_expr461=protected_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr461.getTree());

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
            // 652:61: -> ^( NIL_TOKEN ^( NIL_TOKEN ( protected_expr )* ) ( arrow_or_assign )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:652:64: ^( NIL_TOKEN ^( NIL_TOKEN ( protected_expr )* ) ( arrow_or_assign )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:652:76: ^( NIL_TOKEN ( protected_expr )* )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_2);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:652:88: ( protected_expr )*
                while ( stream_protected_expr.hasNext() ) {
                    adaptor.addChild(root_2, stream_protected_expr.nextTree());

                }
                stream_protected_expr.reset();

                adaptor.addChild(root_1, root_2);
                }
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:652:105: ( arrow_or_assign )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:654:1: primitive_expr : ( Num | String | Id | Constr | L_true | L_false | L_this | L_nil | token_infinity | list_expr | with_control_expr | map_or_set_expr );
    public final babel17Parser.primitive_expr_return primitive_expr() throws RecognitionException {
        babel17Parser.primitive_expr_return retval = new babel17Parser.primitive_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Num462=null;
        Token String463=null;
        Token Id464=null;
        Token Constr465=null;
        Token L_true466=null;
        Token L_false467=null;
        Token L_this468=null;
        Token L_nil469=null;
        babel17Parser.token_infinity_return token_infinity470 = null;

        babel17Parser.list_expr_return list_expr471 = null;

        babel17Parser.with_control_expr_return with_control_expr472 = null;

        babel17Parser.map_or_set_expr_return map_or_set_expr473 = null;


        CommonTree Num462_tree=null;
        CommonTree String463_tree=null;
        CommonTree Id464_tree=null;
        CommonTree Constr465_tree=null;
        CommonTree L_true466_tree=null;
        CommonTree L_false467_tree=null;
        CommonTree L_this468_tree=null;
        CommonTree L_nil469_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:655:2: ( Num | String | Id | Constr | L_true | L_false | L_this | L_nil | token_infinity | list_expr | with_control_expr | map_or_set_expr )
            int alt226=12;
            switch ( input.LA(1) ) {
            case Num:
                {
                alt226=1;
                }
                break;
            case String:
                {
                alt226=2;
                }
                break;
            case Id:
                {
                alt226=3;
                }
                break;
            case Constr:
                {
                alt226=4;
                }
                break;
            case L_true:
                {
                alt226=5;
                }
                break;
            case L_false:
                {
                alt226=6;
                }
                break;
            case L_this:
                {
                alt226=7;
                }
                break;
            case L_nil:
                {
                alt226=8;
                }
                break;
            case A_infinity:
            case U_infinity:
                {
                alt226=9;
                }
                break;
            case ROUND_BRACKET_OPEN:
            case SQUARE_BRACKET_OPEN:
                {
                alt226=10;
                }
                break;
            case L_begin:
            case L_with:
            case L_if:
            case L_while:
            case L_for:
            case L_match:
                {
                alt226=11;
                }
                break;
            case CURLY_BRACKET_OPEN:
                {
                alt226=12;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 226, 0, input);

                throw nvae;
            }

            switch (alt226) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:655:4: Num
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Num462=(Token)match(input,Num,FOLLOW_Num_in_primitive_expr4487); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Num462_tree = (CommonTree)adaptor.create(Num462);
                    adaptor.addChild(root_0, Num462_tree);
                    }

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:656:4: String
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    String463=(Token)match(input,String,FOLLOW_String_in_primitive_expr4492); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    String463_tree = (CommonTree)adaptor.create(String463);
                    adaptor.addChild(root_0, String463_tree);
                    }

                    }
                    break;
                case 3 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:657:4: Id
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Id464=(Token)match(input,Id,FOLLOW_Id_in_primitive_expr4497); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Id464_tree = (CommonTree)adaptor.create(Id464);
                    adaptor.addChild(root_0, Id464_tree);
                    }

                    }
                    break;
                case 4 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:658:4: Constr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Constr465=(Token)match(input,Constr,FOLLOW_Constr_in_primitive_expr4502); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Constr465_tree = (CommonTree)adaptor.create(Constr465);
                    adaptor.addChild(root_0, Constr465_tree);
                    }

                    }
                    break;
                case 5 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:659:4: L_true
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    L_true466=(Token)match(input,L_true,FOLLOW_L_true_in_primitive_expr4507); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    L_true466_tree = (CommonTree)adaptor.create(L_true466);
                    adaptor.addChild(root_0, L_true466_tree);
                    }

                    }
                    break;
                case 6 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:660:4: L_false
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    L_false467=(Token)match(input,L_false,FOLLOW_L_false_in_primitive_expr4512); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    L_false467_tree = (CommonTree)adaptor.create(L_false467);
                    adaptor.addChild(root_0, L_false467_tree);
                    }

                    }
                    break;
                case 7 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:661:4: L_this
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    L_this468=(Token)match(input,L_this,FOLLOW_L_this_in_primitive_expr4517); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    L_this468_tree = (CommonTree)adaptor.create(L_this468);
                    adaptor.addChild(root_0, L_this468_tree);
                    }

                    }
                    break;
                case 8 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:662:4: L_nil
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    L_nil469=(Token)match(input,L_nil,FOLLOW_L_nil_in_primitive_expr4523); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    L_nil469_tree = (CommonTree)adaptor.create(L_nil469);
                    adaptor.addChild(root_0, L_nil469_tree);
                    }

                    }
                    break;
                case 9 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:663:4: token_infinity
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_infinity_in_primitive_expr4528);
                    token_infinity470=token_infinity();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, token_infinity470.getTree());

                    }
                    break;
                case 10 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:664:5: list_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_list_expr_in_primitive_expr4534);
                    list_expr471=list_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, list_expr471.getTree());

                    }
                    break;
                case 11 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:665:4: with_control_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_with_control_expr_in_primitive_expr4539);
                    with_control_expr472=with_control_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, with_control_expr472.getTree());

                    }
                    break;
                case 12 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:666:4: map_or_set_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_map_or_set_expr_in_primitive_expr4544);
                    map_or_set_expr473=map_or_set_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, map_or_set_expr473.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:668:1: prog : block EOF -> ^( PROG block ) ;
    public final babel17Parser.prog_return prog() throws RecognitionException {
        babel17Parser.prog_return retval = new babel17Parser.prog_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EOF475=null;
        babel17Parser.block_return block474 = null;


        CommonTree EOF475_tree=null;
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:668:7: ( block EOF -> ^( PROG block ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:668:9: block EOF
            {
            pushFollow(FOLLOW_block_in_prog4554);
            block474=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block474.getTree());
            EOF475=(Token)match(input,EOF,FOLLOW_EOF_in_prog4556); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EOF.add(EOF475);



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
            // 668:19: -> ^( PROG block )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:668:22: ^( PROG block )
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
        match(input,Id,FOLLOW_Id_in_synpred1_babel171601); if (state.failed) return ;
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:359:14: ( NL )?
        int alt227=2;
        int LA227_0 = input.LA(1);

        if ( (LA227_0==NL) ) {
            alt227=1;
        }
        switch (alt227) {
            case 1 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:359:14: NL
                {
                match(input,NL,FOLLOW_NL_in_synpred1_babel171603); if (state.failed) return ;

                }
                break;

        }

        match(input,L_as,FOLLOW_L_as_in_synpred1_babel171606); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_babel17

    // $ANTLR start synpred2_babel17
    public final void synpred2_babel17_fragment() throws RecognitionException {   
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:360:4: ( protected_expr ( NL )? QUESTION_MARK )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:360:5: protected_expr ( NL )? QUESTION_MARK
        {
        pushFollow(FOLLOW_protected_expr_in_synpred2_babel171637);
        protected_expr();

        state._fsp--;
        if (state.failed) return ;
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:360:20: ( NL )?
        int alt228=2;
        int LA228_0 = input.LA(1);

        if ( (LA228_0==NL) ) {
            alt228=1;
        }
        switch (alt228) {
            case 1 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:360:20: NL
                {
                match(input,NL,FOLLOW_NL_in_synpred2_babel171639); if (state.failed) return ;

                }
                break;

        }

        match(input,QUESTION_MARK,FOLLOW_QUESTION_MARK_in_synpred2_babel171642); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_babel17

    // $ANTLR start synpred3_babel17
    public final void synpred3_babel17_fragment() throws RecognitionException {   
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:433:4: ( ( pattern | objelem_assign ) ( NL )? '=' )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:433:5: ( pattern | objelem_assign ) ( NL )? '='
        {
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:433:5: ( pattern | objelem_assign )
        int alt229=2;
        int LA229_0 = input.LA(1);

        if ( (LA229_0==L_exception||(LA229_0>=A_infinity && LA229_0<=U_infinity)||(LA229_0>=L_true && LA229_0<=L_false)||LA229_0==L_nil||LA229_0==MINUS||(LA229_0>=A_ELLIPSIS && LA229_0<=U_ELLIPSIS)||LA229_0==Constr||LA229_0==Num||(LA229_0>=String && LA229_0<=ROUND_BRACKET_OPEN)||LA229_0==SQUARE_BRACKET_OPEN||LA229_0==CURLY_BRACKET_OPEN||LA229_0==UNDERSCORE) ) {
            alt229=1;
        }
        else if ( (LA229_0==Id) ) {
            int LA229_2 = input.LA(2);

            if ( (LA229_2==PERIOD) ) {
                alt229=2;
            }
            else if ( (LA229_2==ASSIGN||(LA229_2>=A_DOUBLE_COLON && LA229_2<=U_DOUBLE_COLON)||LA229_2==NL) ) {
                alt229=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 229, 2, input);

                throw nvae;
            }
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 229, 0, input);

            throw nvae;
        }
        switch (alt229) {
            case 1 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:433:6: pattern
                {
                pushFollow(FOLLOW_pattern_in_synpred3_babel172495);
                pattern();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:433:16: objelem_assign
                {
                pushFollow(FOLLOW_objelem_assign_in_synpred3_babel172499);
                objelem_assign();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:433:32: ( NL )?
        int alt230=2;
        int LA230_0 = input.LA(1);

        if ( (LA230_0==NL) ) {
            alt230=1;
        }
        switch (alt230) {
            case 1 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:433:32: NL
                {
                match(input,NL,FOLLOW_NL_in_synpred3_babel172502); if (state.failed) return ;

                }
                break;

        }

        match(input,ASSIGN,FOLLOW_ASSIGN_in_synpred3_babel172505); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_babel17

    // $ANTLR start synpred4_babel17
    public final void synpred4_babel17_fragment() throws RecognitionException {   
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:465:11: ( L_obj ( NL )? parents )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:465:12: L_obj ( NL )? parents
        {
        match(input,L_obj,FOLLOW_L_obj_in_synpred4_babel172719); if (state.failed) return ;
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:465:18: ( NL )?
        int alt231=2;
        int LA231_0 = input.LA(1);

        if ( (LA231_0==NL) ) {
            alt231=1;
        }
        switch (alt231) {
            case 1 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:465:18: NL
                {
                match(input,NL,FOLLOW_NL_in_synpred4_babel172721); if (state.failed) return ;

                }
                break;

        }

        pushFollow(FOLLOW_parents_in_synpred4_babel172724);
        parents();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_babel17

    // $ANTLR start synpred5_babel17
    public final void synpred5_babel17_fragment() throws RecognitionException {   
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:469:4: ( lambda_expr )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:469:5: lambda_expr
        {
        pushFollow(FOLLOW_lambda_expr_in_synpred5_babel172793);
        lambda_expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_babel17

    // $ANTLR start synpred6_babel17
    public final void synpred6_babel17_fragment() throws RecognitionException {   
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:473:4: ( protected_lambda_expr )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:473:5: protected_lambda_expr
        {
        pushFollow(FOLLOW_protected_lambda_expr_in_synpred6_babel172814);
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


    protected DFA22 dfa22 = new DFA22(this);
    protected DFA51 dfa51 = new DFA51(this);
    protected DFA57 dfa57 = new DFA57(this);
    protected DFA54 dfa54 = new DFA54(this);
    protected DFA74 dfa74 = new DFA74(this);
    protected DFA84 dfa84 = new DFA84(this);
    protected DFA85 dfa85 = new DFA85(this);
    static final String DFA22_eotS =
        "\37\uffff";
    static final String DFA22_eofS =
        "\37\uffff";
    static final String DFA22_minS =
        "\1\60\17\0\7\uffff\1\0\7\uffff";
    static final String DFA22_maxS =
        "\1\u0086\17\0\7\uffff\1\0\7\uffff";
    static final String DFA22_acceptS =
        "\20\uffff\7\2\1\uffff\3\2\1\4\1\1\1\3\1\5";
    static final String DFA22_specialS =
        "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1"+
        "\16\1\17\7\uffff\1\20\7\uffff}>";
    static final String[] DFA22_transitionS = {
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
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "358:1: bracket_pattern : ( ( Id ( NL )? L_as )=> Id ( NL )? L_as ( NL )? pattern -> ^( L_as Id pattern ) | ( protected_expr ( NL )? QUESTION_MARK )=> protected_expr ( NL )? QUESTION_MARK ( ( NL )? pattern )? -> ^( QUESTION_MARK protected_expr ( pattern )? ) | pattern ( ( NL )? L_if ( NL )? protected_expr )? -> ^( IF_PATTERN pattern ( protected_expr )? ) | L_val ( NL )? protected_expr -> ^( L_val protected_expr ) | L_for ( NL )? ( bracket_pattern ( ( NL )? COMMA ( NL )? bracket_pattern )* ( NL )? )? L_end -> ^( L_for ( bracket_pattern )* ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA22_0 = input.LA(1);

                         
                        int index22_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA22_0==Id) ) {s = 1;}

                        else if ( (LA22_0==Constr) ) {s = 2;}

                        else if ( (LA22_0==UNDERSCORE) ) {s = 3;}

                        else if ( (LA22_0==String) ) {s = 4;}

                        else if ( (LA22_0==Num) ) {s = 5;}

                        else if ( (LA22_0==L_true) ) {s = 6;}

                        else if ( (LA22_0==L_false) ) {s = 7;}

                        else if ( (LA22_0==L_nil) ) {s = 8;}

                        else if ( ((LA22_0>=A_infinity && LA22_0<=U_infinity)) ) {s = 9;}

                        else if ( (LA22_0==MINUS) ) {s = 10;}

                        else if ( (LA22_0==SQUARE_BRACKET_OPEN) ) {s = 11;}

                        else if ( (LA22_0==ROUND_BRACKET_OPEN) ) {s = 12;}

                        else if ( (LA22_0==CURLY_BRACKET_OPEN) ) {s = 13;}

                        else if ( (LA22_0==L_exception) ) {s = 14;}

                        else if ( ((LA22_0>=A_ELLIPSIS && LA22_0<=U_ELLIPSIS)) ) {s = 15;}

                        else if ( (LA22_0==L_case) && (synpred2_babel17())) {s = 16;}

                        else if ( ((LA22_0>=L_concurrent && LA22_0<=L_lazy)||LA22_0==L_random||LA22_0==L_force) && (synpred2_babel17())) {s = 17;}

                        else if ( (LA22_0==A_NOT||LA22_0==U_NOT) && (synpred2_babel17())) {s = 18;}

                        else if ( (LA22_0==L_this) && (synpred2_babel17())) {s = 19;}

                        else if ( (LA22_0==L_if) && (synpred2_babel17())) {s = 20;}

                        else if ( (LA22_0==L_while) && (synpred2_babel17())) {s = 21;}

                        else if ( (LA22_0==L_match) && (synpred2_babel17())) {s = 22;}

                        else if ( (LA22_0==L_for) ) {s = 23;}

                        else if ( (LA22_0==L_begin) && (synpred2_babel17())) {s = 24;}

                        else if ( (LA22_0==L_with) && (synpred2_babel17())) {s = 25;}

                        else if ( (LA22_0==L_obj) && (synpred2_babel17())) {s = 26;}

                        else if ( (LA22_0==L_val) ) {s = 27;}

                         
                        input.seek(index22_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA22_1 = input.LA(1);

                         
                        int index22_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_babel17()) ) {s = 28;}

                        else if ( (synpred2_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index22_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA22_2 = input.LA(1);

                         
                        int index22_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index22_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA22_3 = input.LA(1);

                         
                        int index22_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index22_3);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA22_4 = input.LA(1);

                         
                        int index22_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index22_4);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA22_5 = input.LA(1);

                         
                        int index22_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index22_5);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA22_6 = input.LA(1);

                         
                        int index22_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index22_6);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA22_7 = input.LA(1);

                         
                        int index22_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index22_7);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA22_8 = input.LA(1);

                         
                        int index22_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index22_8);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA22_9 = input.LA(1);

                         
                        int index22_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index22_9);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA22_10 = input.LA(1);

                         
                        int index22_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index22_10);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA22_11 = input.LA(1);

                         
                        int index22_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index22_11);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA22_12 = input.LA(1);

                         
                        int index22_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index22_12);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA22_13 = input.LA(1);

                         
                        int index22_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index22_13);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA22_14 = input.LA(1);

                         
                        int index22_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index22_14);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA22_15 = input.LA(1);

                         
                        int index22_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index22_15);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA22_23 = input.LA(1);

                         
                        int index22_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index22_23);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 22, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA51_eotS =
        "\23\uffff";
    static final String DFA51_eofS =
        "\23\uffff";
    static final String DFA51_minS =
        "\1\105\10\uffff\1\105\2\uffff\1\60\1\105\2\uffff\1\60\2\uffff";
    static final String DFA51_maxS =
        "\1\u0086\10\uffff\1\175\2\uffff\1\u0086\1\175\2\uffff\1\u0086\2"+
        "\uffff";
    static final String DFA51_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\uffff\1\13\1\14\2\uffff"+
        "\1\12\1\11\1\uffff\1\15\1\16";
    static final String DFA51_specialS =
        "\23\uffff}>";
    static final String[] DFA51_transitionS = {
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
            "\2\17\63\uffff\1\15\2\uffff\1\16",
            "",
            "",
            "\1\21\1\uffff\3\21\3\uffff\2\21\2\uffff\2\21\1\uffff\1\21\2"+
            "\uffff\1\21\2\uffff\5\21\1\uffff\5\21\16\uffff\1\21\5\uffff"+
            "\1\21\2\uffff\1\21\10\uffff\2\22\2\21\3\uffff\1\21\2\uffff\1"+
            "\20\3\21\1\uffff\2\21\1\uffff\1\21\1\uffff\3\21",
            "\2\17\66\uffff\1\16",
            "",
            "",
            "\1\21\1\uffff\3\21\3\uffff\2\21\2\uffff\2\21\1\uffff\1\21\2"+
            "\uffff\1\21\2\uffff\5\21\1\uffff\5\21\16\uffff\1\21\5\uffff"+
            "\1\21\2\uffff\1\21\10\uffff\2\22\2\21\3\uffff\1\21\3\uffff\3"+
            "\21\1\uffff\2\21\1\uffff\1\21\1\uffff\3\21",
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
            return "374:1: primitive_pattern : ( Id | '_' -> ANY | String | Num | L_true | L_false | L_nil | token_infinity | '-' ( NL )? token_infinity -> ^( UMINUS token_infinity ) | '-' ( NL )? Num -> ^( UMINUS Num ) | '[' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* )? ']' -> ^( SQUARE_LIST ( bracket_pattern )* ) | '(' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* ( COMMA ( NL )? )? )? ')' -> ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( bracket_pattern )* ) ) | '{' ( NL )? ( mselem_pattern ( NL )? ( COMMA ( NL )? mselem_pattern ( NL )? )* )? '}' -> ^( MAP_OR_SET_OR_OBJ ( mselem_pattern )* ) | '{' ( NL )? token_ARROW ( NL )? '}' -> ^( EMPTY_MAP ) );";
        }
    }
    static final String DFA57_eotS =
        "\4\uffff";
    static final String DFA57_eofS =
        "\2\3\2\uffff";
    static final String DFA57_minS =
        "\2\60\2\uffff";
    static final String DFA57_maxS =
        "\2\u0089\2\uffff";
    static final String DFA57_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA57_specialS =
        "\4\uffff}>";
    static final String[] DFA57_transitionS = {
            "\1\2\1\3\3\2\1\uffff\2\3\2\2\1\uffff\2\2\1\3\1\uffff\2\2\1\uffff"+
            "\1\2\2\uffff\13\2\14\uffff\1\1\1\uffff\1\2\5\uffff\1\2\2\uffff"+
            "\1\2\12\uffff\2\2\3\uffff\1\2\2\uffff\1\1\3\2\1\uffff\2\2\1"+
            "\uffff\1\2\1\uffff\1\2\1\uffff\4\2",
            "\1\2\1\3\3\2\1\uffff\2\3\2\2\1\uffff\2\2\1\3\1\uffff\2\2\1"+
            "\uffff\1\2\2\uffff\13\2\14\uffff\1\1\1\uffff\1\2\5\uffff\1\2"+
            "\2\uffff\1\2\12\uffff\2\2\3\uffff\1\2\2\uffff\1\1\3\2\1\uffff"+
            "\2\2\1\uffff\1\2\1\uffff\1\2\1\uffff\4\2",
            "",
            ""
    };

    static final short[] DFA57_eot = DFA.unpackEncodedString(DFA57_eotS);
    static final short[] DFA57_eof = DFA.unpackEncodedString(DFA57_eofS);
    static final char[] DFA57_min = DFA.unpackEncodedStringToUnsignedChars(DFA57_minS);
    static final char[] DFA57_max = DFA.unpackEncodedStringToUnsignedChars(DFA57_maxS);
    static final short[] DFA57_accept = DFA.unpackEncodedString(DFA57_acceptS);
    static final short[] DFA57_special = DFA.unpackEncodedString(DFA57_specialS);
    static final short[][] DFA57_transition;

    static {
        int numStates = DFA57_transitionS.length;
        DFA57_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA57_transition[i] = DFA.unpackEncodedString(DFA57_transitionS[i]);
        }
    }

    class DFA57 extends DFA {

        public DFA57(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 57;
            this.eot = DFA57_eot;
            this.eof = DFA57_eof;
            this.min = DFA57_min;
            this.max = DFA57_max;
            this.accept = DFA57_accept;
            this.special = DFA57_special;
            this.transition = DFA57_transition;
        }
        public String getDescription() {
            return "398:1: block : ( ( sep )? statement ( sep statement )* ( sep )? -> ^( BLOCK ( statement )* ) | ( sep )? -> ^( BLOCK ) );";
        }
    }
    static final String DFA54_eotS =
        "\4\uffff";
    static final String DFA54_eofS =
        "\2\2\2\uffff";
    static final String DFA54_minS =
        "\1\61\1\60\2\uffff";
    static final String DFA54_maxS =
        "\1\172\1\u0089\2\uffff";
    static final String DFA54_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA54_specialS =
        "\4\uffff}>";
    static final String[] DFA54_transitionS = {
            "\1\2\4\uffff\2\2\5\uffff\1\2\36\uffff\1\1\35\uffff\1\1",
            "\1\3\1\2\3\3\1\uffff\2\2\2\3\1\uffff\2\3\1\2\1\uffff\2\3\1"+
            "\uffff\1\3\2\uffff\13\3\14\uffff\1\1\1\uffff\1\3\5\uffff\1\3"+
            "\2\uffff\1\3\12\uffff\2\3\3\uffff\1\3\2\uffff\1\1\3\3\1\uffff"+
            "\2\3\1\uffff\1\3\1\uffff\1\3\1\uffff\4\3",
            "",
            ""
    };

    static final short[] DFA54_eot = DFA.unpackEncodedString(DFA54_eotS);
    static final short[] DFA54_eof = DFA.unpackEncodedString(DFA54_eofS);
    static final char[] DFA54_min = DFA.unpackEncodedStringToUnsignedChars(DFA54_minS);
    static final char[] DFA54_max = DFA.unpackEncodedStringToUnsignedChars(DFA54_maxS);
    static final short[] DFA54_accept = DFA.unpackEncodedString(DFA54_acceptS);
    static final short[] DFA54_special = DFA.unpackEncodedString(DFA54_specialS);
    static final short[][] DFA54_transition;

    static {
        int numStates = DFA54_transitionS.length;
        DFA54_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA54_transition[i] = DFA.unpackEncodedString(DFA54_transitionS[i]);
        }
    }

    class DFA54 extends DFA {

        public DFA54(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 54;
            this.eot = DFA54_eot;
            this.eof = DFA54_eof;
            this.min = DFA54_min;
            this.max = DFA54_max;
            this.accept = DFA54_accept;
            this.special = DFA54_special;
            this.transition = DFA54_transition;
        }
        public String getDescription() {
            return "()* loopback of 398:25: ( sep statement )*";
        }
    }
    static final String DFA74_eotS =
        "\33\uffff";
    static final String DFA74_eofS =
        "\33\uffff";
    static final String DFA74_minS =
        "\1\60\17\0\13\uffff";
    static final String DFA74_maxS =
        "\1\u0086\17\0\13\uffff";
    static final String DFA74_acceptS =
        "\20\uffff\1\2\11\uffff\1\1";
    static final String DFA74_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\13\uffff}>";
    static final String[] DFA74_transitionS = {
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

    static final short[] DFA74_eot = DFA.unpackEncodedString(DFA74_eotS);
    static final short[] DFA74_eof = DFA.unpackEncodedString(DFA74_eofS);
    static final char[] DFA74_min = DFA.unpackEncodedStringToUnsignedChars(DFA74_minS);
    static final char[] DFA74_max = DFA.unpackEncodedStringToUnsignedChars(DFA74_maxS);
    static final short[] DFA74_accept = DFA.unpackEncodedString(DFA74_acceptS);
    static final short[] DFA74_special = DFA.unpackEncodedString(DFA74_specialS);
    static final short[][] DFA74_transition;

    static {
        int numStates = DFA74_transitionS.length;
        DFA74_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA74_transition[i] = DFA.unpackEncodedString(DFA74_transitionS[i]);
        }
    }

    class DFA74 extends DFA {

        public DFA74(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 74;
            this.eot = DFA74_eot;
            this.eof = DFA74_eof;
            this.min = DFA74_min;
            this.max = DFA74_max;
            this.accept = DFA74_accept;
            this.special = DFA74_special;
            this.transition = DFA74_transition;
        }
        public String getDescription() {
            return "432:1: expr_or_assign : ( ( ( pattern | objelem_assign ) ( NL )? '=' )=> ( pattern | objelem_assign ) ( NL )? '=' ( NL )? expr -> ^( ASSIGN ( pattern )* ( objelem_assign )* expr ) | expr );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA74_1 = input.LA(1);

                         
                        int index74_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index74_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA74_2 = input.LA(1);

                         
                        int index74_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index74_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA74_3 = input.LA(1);

                         
                        int index74_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index74_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA74_4 = input.LA(1);

                         
                        int index74_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index74_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA74_5 = input.LA(1);

                         
                        int index74_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index74_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA74_6 = input.LA(1);

                         
                        int index74_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index74_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA74_7 = input.LA(1);

                         
                        int index74_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index74_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA74_8 = input.LA(1);

                         
                        int index74_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index74_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA74_9 = input.LA(1);

                         
                        int index74_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index74_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA74_10 = input.LA(1);

                         
                        int index74_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index74_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA74_11 = input.LA(1);

                         
                        int index74_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index74_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA74_12 = input.LA(1);

                         
                        int index74_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index74_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA74_13 = input.LA(1);

                         
                        int index74_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index74_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA74_14 = input.LA(1);

                         
                        int index74_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index74_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA74_15 = input.LA(1);

                         
                        int index74_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index74_15);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 74, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA84_eotS =
        "\31\uffff";
    static final String DFA84_eofS =
        "\31\uffff";
    static final String DFA84_minS =
        "\1\60\2\0\1\uffff\13\0\12\uffff";
    static final String DFA84_maxS =
        "\1\u0086\2\0\1\uffff\13\0\12\uffff";
    static final String DFA84_acceptS =
        "\3\uffff\1\1\13\uffff\1\1\1\2\10\uffff";
    static final String DFA84_specialS =
        "\1\0\1\1\1\2\1\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\12\uffff}>";
    static final String[] DFA84_transitionS = {
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

    static final short[] DFA84_eot = DFA.unpackEncodedString(DFA84_eotS);
    static final short[] DFA84_eof = DFA.unpackEncodedString(DFA84_eofS);
    static final char[] DFA84_min = DFA.unpackEncodedStringToUnsignedChars(DFA84_minS);
    static final char[] DFA84_max = DFA.unpackEncodedStringToUnsignedChars(DFA84_maxS);
    static final short[] DFA84_accept = DFA.unpackEncodedString(DFA84_acceptS);
    static final short[] DFA84_special = DFA.unpackEncodedString(DFA84_specialS);
    static final short[][] DFA84_transition;

    static {
        int numStates = DFA84_transitionS.length;
        DFA84_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA84_transition[i] = DFA.unpackEncodedString(DFA84_transitionS[i]);
        }
    }

    class DFA84 extends DFA {

        public DFA84(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 84;
            this.eot = DFA84_eot;
            this.eof = DFA84_eof;
            this.min = DFA84_min;
            this.max = DFA84_max;
            this.accept = DFA84_accept;
            this.special = DFA84_special;
            this.transition = DFA84_transition;
        }
        public String getDescription() {
            return "468:1: lop_expr : ( ( lambda_expr )=> lambda_expr | op_expr );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA84_0 = input.LA(1);

                         
                        int index84_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA84_0==Constr) ) {s = 1;}

                        else if ( (LA84_0==Id) ) {s = 2;}

                        else if ( (LA84_0==UNDERSCORE) && (synpred5_babel17())) {s = 3;}

                        else if ( (LA84_0==String) ) {s = 4;}

                        else if ( (LA84_0==Num) ) {s = 5;}

                        else if ( (LA84_0==L_true) ) {s = 6;}

                        else if ( (LA84_0==L_false) ) {s = 7;}

                        else if ( (LA84_0==L_nil) ) {s = 8;}

                        else if ( ((LA84_0>=A_infinity && LA84_0<=U_infinity)) ) {s = 9;}

                        else if ( (LA84_0==MINUS) ) {s = 10;}

                        else if ( (LA84_0==SQUARE_BRACKET_OPEN) ) {s = 11;}

                        else if ( (LA84_0==ROUND_BRACKET_OPEN) ) {s = 12;}

                        else if ( (LA84_0==CURLY_BRACKET_OPEN) ) {s = 13;}

                        else if ( (LA84_0==L_exception) ) {s = 14;}

                        else if ( ((LA84_0>=A_ELLIPSIS && LA84_0<=U_ELLIPSIS)) && (synpred5_babel17())) {s = 15;}

                        else if ( (LA84_0==L_begin||(LA84_0>=L_with && LA84_0<=L_if)||(LA84_0>=L_while && LA84_0<=L_for)||LA84_0==L_match||(LA84_0>=L_concurrent && LA84_0<=L_lazy)||(LA84_0>=L_this && LA84_0<=L_random)||LA84_0==A_NOT||LA84_0==U_NOT||LA84_0==L_force) ) {s = 16;}

                         
                        input.seek(index84_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA84_1 = input.LA(1);

                         
                        int index84_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index84_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA84_2 = input.LA(1);

                         
                        int index84_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index84_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA84_4 = input.LA(1);

                         
                        int index84_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index84_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA84_5 = input.LA(1);

                         
                        int index84_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index84_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA84_6 = input.LA(1);

                         
                        int index84_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index84_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA84_7 = input.LA(1);

                         
                        int index84_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index84_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA84_8 = input.LA(1);

                         
                        int index84_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index84_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA84_9 = input.LA(1);

                         
                        int index84_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index84_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA84_10 = input.LA(1);

                         
                        int index84_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index84_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA84_11 = input.LA(1);

                         
                        int index84_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index84_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA84_12 = input.LA(1);

                         
                        int index84_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index84_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA84_13 = input.LA(1);

                         
                        int index84_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index84_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA84_14 = input.LA(1);

                         
                        int index84_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index84_14);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 84, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA85_eotS =
        "\32\uffff";
    static final String DFA85_eofS =
        "\32\uffff";
    static final String DFA85_minS =
        "\1\60\2\0\1\uffff\13\0\13\uffff";
    static final String DFA85_maxS =
        "\1\u0086\2\0\1\uffff\13\0\13\uffff";
    static final String DFA85_acceptS =
        "\3\uffff\1\1\13\uffff\2\1\1\2\10\uffff";
    static final String DFA85_specialS =
        "\1\0\1\1\1\2\1\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\13\uffff}>";
    static final String[] DFA85_transitionS = {
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

    static final short[] DFA85_eot = DFA.unpackEncodedString(DFA85_eotS);
    static final short[] DFA85_eof = DFA.unpackEncodedString(DFA85_eofS);
    static final char[] DFA85_min = DFA.unpackEncodedStringToUnsignedChars(DFA85_minS);
    static final char[] DFA85_max = DFA.unpackEncodedStringToUnsignedChars(DFA85_maxS);
    static final short[] DFA85_accept = DFA.unpackEncodedString(DFA85_acceptS);
    static final short[] DFA85_special = DFA.unpackEncodedString(DFA85_specialS);
    static final short[][] DFA85_transition;

    static {
        int numStates = DFA85_transitionS.length;
        DFA85_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA85_transition[i] = DFA.unpackEncodedString(DFA85_transitionS[i]);
        }
    }

    class DFA85 extends DFA {

        public DFA85(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 85;
            this.eot = DFA85_eot;
            this.eof = DFA85_eof;
            this.min = DFA85_min;
            this.max = DFA85_max;
            this.accept = DFA85_accept;
            this.special = DFA85_special;
            this.transition = DFA85_transition;
        }
        public String getDescription() {
            return "472:1: p_lop_expr : ( ( protected_lambda_expr )=> protected_lambda_expr | p_op_expr );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA85_0 = input.LA(1);

                         
                        int index85_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA85_0==Constr) ) {s = 1;}

                        else if ( (LA85_0==Id) ) {s = 2;}

                        else if ( (LA85_0==UNDERSCORE) && (synpred6_babel17())) {s = 3;}

                        else if ( (LA85_0==String) ) {s = 4;}

                        else if ( (LA85_0==Num) ) {s = 5;}

                        else if ( (LA85_0==L_true) ) {s = 6;}

                        else if ( (LA85_0==L_false) ) {s = 7;}

                        else if ( (LA85_0==L_nil) ) {s = 8;}

                        else if ( ((LA85_0>=A_infinity && LA85_0<=U_infinity)) ) {s = 9;}

                        else if ( (LA85_0==MINUS) ) {s = 10;}

                        else if ( (LA85_0==SQUARE_BRACKET_OPEN) ) {s = 11;}

                        else if ( (LA85_0==ROUND_BRACKET_OPEN) ) {s = 12;}

                        else if ( (LA85_0==CURLY_BRACKET_OPEN) ) {s = 13;}

                        else if ( (LA85_0==L_exception) ) {s = 14;}

                        else if ( ((LA85_0>=A_ELLIPSIS && LA85_0<=U_ELLIPSIS)) && (synpred6_babel17())) {s = 15;}

                        else if ( (LA85_0==L_case) && (synpred6_babel17())) {s = 16;}

                        else if ( (LA85_0==L_begin||(LA85_0>=L_with && LA85_0<=L_if)||(LA85_0>=L_while && LA85_0<=L_for)||LA85_0==L_match||(LA85_0>=L_concurrent && LA85_0<=L_lazy)||(LA85_0>=L_this && LA85_0<=L_random)||LA85_0==A_NOT||LA85_0==U_NOT||LA85_0==L_force) ) {s = 17;}

                         
                        input.seek(index85_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA85_1 = input.LA(1);

                         
                        int index85_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_babel17()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index85_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA85_2 = input.LA(1);

                         
                        int index85_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_babel17()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index85_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA85_4 = input.LA(1);

                         
                        int index85_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_babel17()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index85_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA85_5 = input.LA(1);

                         
                        int index85_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_babel17()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index85_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA85_6 = input.LA(1);

                         
                        int index85_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_babel17()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index85_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA85_7 = input.LA(1);

                         
                        int index85_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_babel17()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index85_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA85_8 = input.LA(1);

                         
                        int index85_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_babel17()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index85_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA85_9 = input.LA(1);

                         
                        int index85_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_babel17()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index85_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA85_10 = input.LA(1);

                         
                        int index85_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_babel17()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index85_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA85_11 = input.LA(1);

                         
                        int index85_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_babel17()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index85_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA85_12 = input.LA(1);

                         
                        int index85_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_babel17()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index85_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA85_13 = input.LA(1);

                         
                        int index85_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_babel17()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index85_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA85_14 = input.LA(1);

                         
                        int index85_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_babel17()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index85_14);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 85, _s, input);
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
    public static final BitSet FOLLOW_Constr_in_pattern1517 = new BitSet(new long[]{0x0000000000000002L,0xB400000040009860L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_pattern1520 = new BitSet(new long[]{0x0000000000000000L,0xB400000040009860L,0x0000000000000055L});
    public static final BitSet FOLLOW_primitive_pattern_in_pattern1523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitive_pattern_in_pattern1539 = new BitSet(new long[]{0x0000000000000002L,0x0400030000000000L});
    public static final BitSet FOLLOW_NL_in_pattern1542 = new BitSet(new long[]{0x0000000000000000L,0x0400030000000000L});
    public static final BitSet FOLLOW_token_DOUBLE_COLON_in_pattern1545 = new BitSet(new long[]{0x0000000000000000L,0xB400000040009860L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_pattern1547 = new BitSet(new long[]{0x0000000000000000L,0xB400000040009860L,0x0000000000000055L});
    public static final BitSet FOLLOW_primitive_pattern_in_pattern1550 = new BitSet(new long[]{0x0000000000000002L,0x0400030000000000L});
    public static final BitSet FOLLOW_L_exception_in_pattern1569 = new BitSet(new long[]{0x0000000000000000L,0xB400000040009860L,0x0000000000000055L});
    public static final BitSet FOLLOW_primitive_pattern_in_pattern1571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_ELLIPSIS_in_pattern1584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Id_in_bracket_pattern1611 = new BitSet(new long[]{0x4000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1613 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_L_as_in_bracket_pattern1616 = new BitSet(new long[]{0x0000000000000000L,0xBC0C000040009864L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1618 = new BitSet(new long[]{0x0000000000000000L,0xBC0C000040009864L,0x0000000000000055L});
    public static final BitSet FOLLOW_pattern_in_bracket_pattern1621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protected_expr_in_bracket_pattern1650 = new BitSet(new long[]{0x0000000000000000L,0x0440000000000000L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1652 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_QUESTION_MARK_in_bracket_pattern1655 = new BitSet(new long[]{0x0000000000000002L,0xBC0C000040009864L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1658 = new BitSet(new long[]{0x0000000000000000L,0xBC0C000040009864L,0x0000000000000055L});
    public static final BitSet FOLLOW_pattern_in_bracket_pattern1661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_bracket_pattern1679 = new BitSet(new long[]{0x0010000000000002L,0x0400000000000000L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1682 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_L_if_in_bracket_pattern1685 = new BitSet(new long[]{0x331D000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1687 = new BitSet(new long[]{0x331D000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_protected_expr_in_bracket_pattern1690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_val_in_bracket_pattern1708 = new BitSet(new long[]{0x331D000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1710 = new BitSet(new long[]{0x331D000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_protected_expr_in_bracket_pattern1713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_for_in_bracket_pattern1732 = new BitSet(new long[]{0xB31F000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1734 = new BitSet(new long[]{0xB31F000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_bracket_pattern_in_bracket_pattern1738 = new BitSet(new long[]{0x0002000000000000L,0x0420000000000000L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1742 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_COMMA_in_bracket_pattern1745 = new BitSet(new long[]{0xB31D000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1747 = new BitSet(new long[]{0xB31D000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_bracket_pattern_in_bracket_pattern1750 = new BitSet(new long[]{0x0002000000000000L,0x0420000000000000L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1755 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_L_end_in_bracket_pattern1760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_ARROW_in_arrow_or_assign1779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGN_in_arrow_or_assign1790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracket_pattern_in_mselem_pattern1805 = new BitSet(new long[]{0x0000000100000002L,0x0403000000000000L});
    public static final BitSet FOLLOW_NL_in_mselem_pattern1808 = new BitSet(new long[]{0x0000000100000000L,0x0403000000000000L});
    public static final BitSet FOLLOW_arrow_or_assign_in_mselem_pattern1811 = new BitSet(new long[]{0xB31D000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_mselem_pattern1813 = new BitSet(new long[]{0xB31D000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_bracket_pattern_in_mselem_pattern1816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Id_in_primitive_pattern1845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNDERSCORE_in_primitive_pattern1850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_String_in_primitive_pattern1859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Num_in_primitive_pattern1864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_true_in_primitive_pattern1869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_false_in_primitive_pattern1874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_nil_in_primitive_pattern1879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_infinity_in_primitive_pattern1884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_primitive_pattern1889 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000060L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern1891 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_token_infinity_in_primitive_pattern1894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_primitive_pattern1907 = new BitSet(new long[]{0x0000000000000000L,0x2400000000000000L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern1909 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_Num_in_primitive_pattern1912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SQUARE_BRACKET_OPEN_in_primitive_pattern1925 = new BitSet(new long[]{0xB31D000000000000L,0xBC8C00904000FBE4L,0x000000000000005DL});
    public static final BitSet FOLLOW_NL_in_primitive_pattern1928 = new BitSet(new long[]{0xB31D000000000000L,0xBC8C00904000FBE4L,0x000000000000005DL});
    public static final BitSet FOLLOW_bracket_pattern_in_primitive_pattern1932 = new BitSet(new long[]{0x0000000000000000L,0x0420000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern1934 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_COMMA_in_primitive_pattern1939 = new BitSet(new long[]{0xB31D000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern1941 = new BitSet(new long[]{0xB31D000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_bracket_pattern_in_primitive_pattern1944 = new BitSet(new long[]{0x0000000000000000L,0x0420000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern1946 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SQUARE_BRACKET_CLOSE_in_primitive_pattern1954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROUND_BRACKET_OPEN_in_primitive_pattern1974 = new BitSet(new long[]{0xB31D000000000000L,0xBC8C00904000FBE4L,0x0000000000000057L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern1977 = new BitSet(new long[]{0xB31D000000000000L,0xBC8C00904000FBE4L,0x0000000000000057L});
    public static final BitSet FOLLOW_bracket_pattern_in_primitive_pattern1981 = new BitSet(new long[]{0x0000000000000000L,0x0420000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern1983 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_primitive_pattern1988 = new BitSet(new long[]{0xB31D000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern1991 = new BitSet(new long[]{0xB31D000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_bracket_pattern_in_primitive_pattern1994 = new BitSet(new long[]{0x0000000000000000L,0x0420000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern1996 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_primitive_pattern2002 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2004 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_ROUND_BRACKET_CLOSE_in_primitive_pattern2011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURLY_BRACKET_OPEN_in_primitive_pattern2043 = new BitSet(new long[]{0xB31D000000000000L,0xBC8C00904000FBE4L,0x0000000000000075L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2046 = new BitSet(new long[]{0xB31D000000000000L,0xBC8C00904000FBE4L,0x0000000000000075L});
    public static final BitSet FOLLOW_mselem_pattern_in_primitive_pattern2050 = new BitSet(new long[]{0x0000000000000000L,0x0420000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2052 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_COMMA_in_primitive_pattern2057 = new BitSet(new long[]{0xB31D000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2060 = new BitSet(new long[]{0xB31D000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_mselem_pattern_in_primitive_pattern2063 = new BitSet(new long[]{0x0000000000000000L,0x0420000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2065 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_CURLY_BRACKET_CLOSE_in_primitive_pattern2073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURLY_BRACKET_OPEN_in_primitive_pattern2091 = new BitSet(new long[]{0x0000000000000000L,0x0403000000000000L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2093 = new BitSet(new long[]{0x0000000000000000L,0x0003000000000000L});
    public static final BitSet FOLLOW_token_ARROW_in_primitive_pattern2096 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2098 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_CURLY_BRACKET_CLOSE_in_primitive_pattern2101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_sep2123 = new BitSet(new long[]{0x0000000000000002L,0x0400000010000000L});
    public static final BitSet FOLLOW_sep_in_block2139 = new BitSet(new long[]{0xBB1D000000000000L,0xBC8C00904000FFE5L,0x00000000000003D5L});
    public static final BitSet FOLLOW_statement_in_block2142 = new BitSet(new long[]{0x0000000000000002L,0x0400000010000000L});
    public static final BitSet FOLLOW_sep_in_block2145 = new BitSet(new long[]{0xBB1D000000000000L,0xBC8C00904000FFE5L,0x00000000000003D5L});
    public static final BitSet FOLLOW_statement_in_block2147 = new BitSet(new long[]{0x0000000000000002L,0x0400000010000000L});
    public static final BitSet FOLLOW_sep_in_block2151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sep_in_block2167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_pure_block2184 = new BitSet(new long[]{0x0000000000000002L,0x0400000010000000L});
    public static final BitSet FOLLOW_sep_in_pure_block2187 = new BitSet(new long[]{0xBB1D000000000000L,0xBC8C00904000FFE5L,0x00000000000003D5L});
    public static final BitSet FOLLOW_statement_in_pure_block2189 = new BitSet(new long[]{0x0000000000000002L,0x0400000010000000L});
    public static final BitSet FOLLOW_st_val_in_statement2210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_def_in_statement2215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_memoize_in_statement2220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_yield_in_statement2225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_or_assign_in_statement2230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRAGMA_LOG_in_statement2236 = new BitSet(new long[]{0x331D000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_expr_in_statement2238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRAGMA_PROFILE_in_statement2252 = new BitSet(new long[]{0x331D000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_expr_in_statement2254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRAGMA_ASSERT_in_statement2268 = new BitSet(new long[]{0x331D000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_expr_in_statement2270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Id_in_objelem_assign2288 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_PERIOD_in_objelem_assign2290 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_Id_in_objelem_assign2292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_val_in_st_val2311 = new BitSet(new long[]{0x0000000000000000L,0xBC0C000040009864L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_st_val2313 = new BitSet(new long[]{0x0000000000000000L,0xBC0C000040009864L,0x0000000000000055L});
    public static final BitSet FOLLOW_pattern_in_st_val2317 = new BitSet(new long[]{0x0000000100000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_objelem_assign_in_st_val2321 = new BitSet(new long[]{0x0000000100000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_NL_in_st_val2324 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ASSIGN_in_st_val2327 = new BitSet(new long[]{0x331D000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_st_val2329 = new BitSet(new long[]{0x331D000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_expr_in_st_val2332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_def_in_st_def2356 = new BitSet(new long[]{0x0000000000000000L,0x1400000000000000L});
    public static final BitSet FOLLOW_NL_in_st_def2358 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_Id_in_st_def2361 = new BitSet(new long[]{0x0000000100000000L,0xB400000040009860L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_st_def2363 = new BitSet(new long[]{0x0000000100000000L,0xB400000040009860L,0x0000000000000055L});
    public static final BitSet FOLLOW_primitive_pattern_in_st_def2367 = new BitSet(new long[]{0x0000000100000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_NL_in_st_def2369 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ASSIGN_in_st_def2374 = new BitSet(new long[]{0x331D000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_st_def2376 = new BitSet(new long[]{0x331D000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_expr_in_st_def2379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_yield_in_st_yield2408 = new BitSet(new long[]{0x331D000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_expr_in_st_yield2410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_memoize_in_st_memoize2428 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_memid_in_st_memoize2430 = new BitSet(new long[]{0x0000000000000002L,0x1000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_Id_in_memid2454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROUND_BRACKET_OPEN_in_memid2467 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_Id_in_memid2469 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_ROUND_BRACKET_CLOSE_in_memid2471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_expr_or_assign2511 = new BitSet(new long[]{0x0000000100000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_objelem_assign_in_expr_or_assign2515 = new BitSet(new long[]{0x0000000100000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_NL_in_expr_or_assign2518 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ASSIGN_in_expr_or_assign2521 = new BitSet(new long[]{0x331D000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_expr_or_assign2523 = new BitSet(new long[]{0x331D000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_expr_in_expr_or_assign2526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_or_assign2545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lop_expr_in_expr2556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_obj_expr_in_expr2561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_expr_in_control_expr2571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_do_expr_in_control_expr2576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_match_expr_in_control_expr2581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_expr_in_control_expr2586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_begin_end_in_control_expr2591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_control_expr_in_with_control_expr2601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_with_in_with_control_expr2606 = new BitSet(new long[]{0x331D000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_with_control_expr2608 = new BitSet(new long[]{0x331D000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_protected_expr_in_with_control_expr2611 = new BitSet(new long[]{0x0400000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_NL_in_with_control_expr2613 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_L_do_in_with_control_expr2616 = new BitSet(new long[]{0xBB1F000000000000L,0xBC8C00905000FFE5L,0x00000000000003D5L});
    public static final BitSet FOLLOW_block_in_with_control_expr2618 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_L_end_in_with_control_expr2620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_lop_expr_in_protected_expr2645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_obj_expr_in_protected_expr2650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_begin_in_begin_end2662 = new BitSet(new long[]{0xBB1F000000000000L,0xBC8C00905000FFE5L,0x00000000000003D5L});
    public static final BitSet FOLLOW_block_in_begin_end2664 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_L_end_in_begin_end2666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_parents2684 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_primitive_expr_in_parents2686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIMES_in_parents2699 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_primitive_expr_in_parents2701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_obj_in_obj_expr2729 = new BitSet(new long[]{0x0000000000000000L,0x04000000A0000000L});
    public static final BitSet FOLLOW_NL_in_obj_expr2731 = new BitSet(new long[]{0x0000000000000000L,0x04000000A0000000L});
    public static final BitSet FOLLOW_parents_in_obj_expr2734 = new BitSet(new long[]{0xBB1F000000000000L,0xBC8C00905000FFE5L,0x00000000000003D5L});
    public static final BitSet FOLLOW_block_in_obj_expr2736 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_L_end_in_obj_expr2738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_obj_in_obj_expr2766 = new BitSet(new long[]{0xBB1F000000000000L,0xBC8C00905000FFE5L,0x00000000000003D5L});
    public static final BitSet FOLLOW_block_in_obj_expr2768 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_L_end_in_obj_expr2770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_expr_in_lop_expr2798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_op_expr_in_lop_expr2803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protected_lambda_expr_in_p_lop_expr2819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_op_expr_in_p_lop_expr2824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_if_in_if_expr2835 = new BitSet(new long[]{0x331D000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_if_expr2837 = new BitSet(new long[]{0x331D000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_protected_expr_in_if_expr2840 = new BitSet(new long[]{0x0020000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_NL_in_if_expr2842 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_L_then_in_if_expr2845 = new BitSet(new long[]{0xBBDF000000000000L,0xBC8C00905000FFE5L,0x00000000000003D5L});
    public static final BitSet FOLLOW_block_in_if_expr2847 = new BitSet(new long[]{0x00C2000000000000L});
    public static final BitSet FOLLOW_L_elseif_in_if_expr2853 = new BitSet(new long[]{0x331D000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_if_expr2855 = new BitSet(new long[]{0x331D000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_protected_expr_in_if_expr2858 = new BitSet(new long[]{0x0020000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_NL_in_if_expr2860 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_L_then_in_if_expr2863 = new BitSet(new long[]{0xBBDF000000000000L,0xBC8C00905000FFE5L,0x00000000000003D5L});
    public static final BitSet FOLLOW_block_in_if_expr2865 = new BitSet(new long[]{0x00C2000000000000L});
    public static final BitSet FOLLOW_L_else_in_if_expr2873 = new BitSet(new long[]{0xBB1F000000000000L,0xBC8C00905000FFE5L,0x00000000000003D5L});
    public static final BitSet FOLLOW_block_in_if_expr2875 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_L_end_in_if_expr2879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_while_in_while_do_expr2903 = new BitSet(new long[]{0x331D000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_while_do_expr2905 = new BitSet(new long[]{0x331D000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_protected_expr_in_while_do_expr2908 = new BitSet(new long[]{0x0400000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_NL_in_while_do_expr2910 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_L_do_in_while_do_expr2913 = new BitSet(new long[]{0xBB1F000000000000L,0xBC8C00905000FFE5L,0x00000000000003D5L});
    public static final BitSet FOLLOW_block_in_while_do_expr2915 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_L_end_in_while_do_expr2917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_full_cases_in_cases2947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_cases2952 = new BitSet(new long[]{0x0000000000000000L,0x0400C00000000000L});
    public static final BitSet FOLLOW_NL_in_cases2954 = new BitSet(new long[]{0x0000000000000000L,0x0400C00000000000L});
    public static final BitSet FOLLOW_token_DOUBLE_ARROW_in_cases2957 = new BitSet(new long[]{0xBB1D000000000000L,0xBC8C00905000FFE5L,0x00000000000003D5L});
    public static final BitSet FOLLOW_block_in_cases2959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_case_expr_in_full_cases2982 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_L_case_in_case_expr3003 = new BitSet(new long[]{0x0000000000000000L,0xBC0C000040009864L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_case_expr3005 = new BitSet(new long[]{0x0000000000000000L,0xBC0C000040009864L,0x0000000000000055L});
    public static final BitSet FOLLOW_pattern_in_case_expr3008 = new BitSet(new long[]{0x0000000000000000L,0x0400C00000000000L});
    public static final BitSet FOLLOW_NL_in_case_expr3010 = new BitSet(new long[]{0x0000000000000000L,0x0400C00000000000L});
    public static final BitSet FOLLOW_token_DOUBLE_ARROW_in_case_expr3013 = new BitSet(new long[]{0xBB1D000000000000L,0xBC8C00905000FFE5L,0x00000000000003D5L});
    public static final BitSet FOLLOW_block_in_case_expr3015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_match_in_match_expr3036 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_match_expr3038 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_p_op_expr_in_match_expr3041 = new BitSet(new long[]{0x2000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_NL_in_match_expr3043 = new BitSet(new long[]{0x2000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_full_cases_in_match_expr3046 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_L_end_in_match_expr3048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_cases_in_lambda_expr3074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_lambda_cases3092 = new BitSet(new long[]{0x0000000000000000L,0x0400C00000000000L});
    public static final BitSet FOLLOW_NL_in_lambda_cases3094 = new BitSet(new long[]{0x0000000000000000L,0x0400C00000000000L});
    public static final BitSet FOLLOW_token_DOUBLE_ARROW_in_lambda_cases3097 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_lambda_cases3099 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_lop_expr_in_lambda_cases3102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protected_lambda_cases_in_protected_lambda_expr3130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_case_in_p_lambda_case_expr3148 = new BitSet(new long[]{0x0000000000000000L,0xBC0C000040009864L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_p_lambda_case_expr3150 = new BitSet(new long[]{0x0000000000000000L,0xBC0C000040009864L,0x0000000000000055L});
    public static final BitSet FOLLOW_pattern_in_p_lambda_case_expr3153 = new BitSet(new long[]{0x0000000000000000L,0x0400C00000000000L});
    public static final BitSet FOLLOW_NL_in_p_lambda_case_expr3155 = new BitSet(new long[]{0x0000000000000000L,0x0400C00000000000L});
    public static final BitSet FOLLOW_token_DOUBLE_ARROW_in_p_lambda_case_expr3158 = new BitSet(new long[]{0xBB1D000000000000L,0xBC8C00904000FFE5L,0x00000000000003D5L});
    public static final BitSet FOLLOW_NL_in_p_lambda_case_expr3160 = new BitSet(new long[]{0xBB1D000000000000L,0xBC8C00904000FFE5L,0x00000000000003D5L});
    public static final BitSet FOLLOW_pure_block_in_p_lambda_case_expr3163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_protected_lambda_cases3184 = new BitSet(new long[]{0x0000000000000000L,0x0400C00000000000L});
    public static final BitSet FOLLOW_NL_in_protected_lambda_cases3186 = new BitSet(new long[]{0x0000000000000000L,0x0400C00000000000L});
    public static final BitSet FOLLOW_token_DOUBLE_ARROW_in_protected_lambda_cases3189 = new BitSet(new long[]{0xBB1D000000000000L,0xBC8C00904000FFE5L,0x00000000000003D5L});
    public static final BitSet FOLLOW_NL_in_protected_lambda_cases3191 = new BitSet(new long[]{0xBB1D000000000000L,0xBC8C00904000FFE5L,0x00000000000003D5L});
    public static final BitSet FOLLOW_pure_block_in_protected_lambda_cases3194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_lambda_case_expr_in_protected_lambda_cases3213 = new BitSet(new long[]{0x2000000000000002L,0xBC0C000040009864L,0x0000000000000055L});
    public static final BitSet FOLLOW_L_for_in_for_expr3230 = new BitSet(new long[]{0x0000000000000000L,0xBC0C000040009864L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_for_expr3232 = new BitSet(new long[]{0x0000000000000000L,0xBC0C000040009864L,0x0000000000000055L});
    public static final BitSet FOLLOW_pattern_in_for_expr3235 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000002L});
    public static final BitSet FOLLOW_NL_in_for_expr3237 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_L_in_in_for_expr3240 = new BitSet(new long[]{0x331D000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_for_expr3242 = new BitSet(new long[]{0x331D000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_protected_expr_in_for_expr3245 = new BitSet(new long[]{0x0400000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_NL_in_for_expr3247 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_L_do_in_for_expr3250 = new BitSet(new long[]{0xBB1F000000000000L,0xBC8C00905000FFE5L,0x00000000000003D5L});
    public static final BitSet FOLLOW_block_in_for_expr3252 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_L_end_in_for_expr3254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_builtin_primitive_in_op_expr3279 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_op_expr_in_op_expr3282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bool_expr_in_op_expr3287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_builtin_primitive_in_p_op_expr3297 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_p_op_expr3300 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_p_op_expr_in_p_op_expr3304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_bool_expr_in_p_op_expr3309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_builtin_primitive0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bool_or_expr_in_bool_expr3349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_bool_or_expr_in_p_bool_expr3359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bool_and_expr_in_bool_or_expr3368 = new BitSet(new long[]{0x0000000000000002L,0x0400002400000000L});
    public static final BitSet FOLLOW_NL_in_bool_or_expr3371 = new BitSet(new long[]{0x0000000000000000L,0x0400002400000000L});
    public static final BitSet FOLLOW_token_OR_in_bool_or_expr3375 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_bool_or_expr3378 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_bool_and_expr_in_bool_or_expr3382 = new BitSet(new long[]{0x0000000000000002L,0x0400002400000000L});
    public static final BitSet FOLLOW_p_bool_and_expr_in_p_bool_or_expr3394 = new BitSet(new long[]{0x0000000000000002L,0x0400002400000000L});
    public static final BitSet FOLLOW_NL_in_p_bool_or_expr3397 = new BitSet(new long[]{0x0000000000000000L,0x0400002400000000L});
    public static final BitSet FOLLOW_token_OR_in_p_bool_or_expr3401 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_p_bool_or_expr3404 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_p_bool_and_expr_in_p_bool_or_expr3408 = new BitSet(new long[]{0x0000000000000002L,0x0400002400000000L});
    public static final BitSet FOLLOW_bool_not_expr_in_bool_and_expr3420 = new BitSet(new long[]{0x0000000000000002L,0x0400004800000000L});
    public static final BitSet FOLLOW_NL_in_bool_and_expr3423 = new BitSet(new long[]{0x0000000000000000L,0x0400004800000000L});
    public static final BitSet FOLLOW_token_AND_in_bool_and_expr3427 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_bool_and_expr3430 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_bool_not_expr_in_bool_and_expr3434 = new BitSet(new long[]{0x0000000000000002L,0x0400004800000000L});
    public static final BitSet FOLLOW_p_bool_not_expr_in_p_bool_and_expr3446 = new BitSet(new long[]{0x0000000000000002L,0x0400004800000000L});
    public static final BitSet FOLLOW_NL_in_p_bool_and_expr3449 = new BitSet(new long[]{0x0000000000000000L,0x0400004800000000L});
    public static final BitSet FOLLOW_token_AND_in_p_bool_and_expr3453 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_p_bool_and_expr3456 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_p_bool_not_expr_in_p_bool_and_expr3460 = new BitSet(new long[]{0x0000000000000002L,0x0400004800000000L});
    public static final BitSet FOLLOW_token_NOT_in_bool_not_expr3472 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_bool_not_expr3475 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_bool_not_expr_in_bool_not_expr3479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rel_expr_in_bool_not_expr3484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_NOT_in_p_bool_not_expr3495 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_p_bool_not_expr3498 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_p_bool_not_expr_in_p_bool_not_expr3502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_rel_expr_in_p_bool_not_expr3507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arith_expr_in_rel_expr3516 = new BitSet(new long[]{0x0000000000000002L,0x040000000FFC0000L});
    public static final BitSet FOLLOW_NL_in_rel_expr3519 = new BitSet(new long[]{0x0000000000000000L,0x040000000FFC0000L});
    public static final BitSet FOLLOW_rel_op_in_rel_expr3522 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_rel_expr3524 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_arith_expr_in_rel_expr3527 = new BitSet(new long[]{0x0000000000000002L,0x040000000FFC0000L});
    public static final BitSet FOLLOW_p_arith_expr_in_p_rel_expr3554 = new BitSet(new long[]{0x0000000000000002L,0x040000000FFC0000L});
    public static final BitSet FOLLOW_NL_in_p_rel_expr3557 = new BitSet(new long[]{0x0000000000000000L,0x040000000FFC0000L});
    public static final BitSet FOLLOW_rel_op_in_p_rel_expr3560 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_p_rel_expr3562 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_p_arith_expr_in_p_rel_expr3565 = new BitSet(new long[]{0x0000000000000002L,0x040000000FFC0000L});
    public static final BitSet FOLLOW_token_EQUAL_in_rel_op3591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_NOT_EQUAL_in_rel_op3595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATER_in_rel_op3599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_GREATER_EQ_in_rel_op3603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_in_rel_op3607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_LESS_EQ_in_rel_op3611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_plusplus_expr_in_arith_expr3623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_plusplus_expr_in_p_arith_expr3633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timestimes_expr_in_plusplus_expr3643 = new BitSet(new long[]{0x0000000000000002L,0x0400300000000000L});
    public static final BitSet FOLLOW_NL_in_plusplus_expr3646 = new BitSet(new long[]{0x0000000000000000L,0x0000300000000000L});
    public static final BitSet FOLLOW_PLUSPLUS_in_plusplus_expr3651 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_MINUSMINUS_in_plusplus_expr3654 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_plusplus_expr3658 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_timestimes_expr_in_plusplus_expr3662 = new BitSet(new long[]{0x0000000000000002L,0x0400300000000000L});
    public static final BitSet FOLLOW_p_timestimes_expr_in_p_plusplus_expr3674 = new BitSet(new long[]{0x0000000000000002L,0x0400300000000000L});
    public static final BitSet FOLLOW_NL_in_p_plusplus_expr3677 = new BitSet(new long[]{0x0000000000000000L,0x0000300000000000L});
    public static final BitSet FOLLOW_PLUSPLUS_in_p_plusplus_expr3682 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_MINUSMINUS_in_p_plusplus_expr3685 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_p_plusplus_expr3689 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_p_timestimes_expr_in_p_plusplus_expr3693 = new BitSet(new long[]{0x0000000000000002L,0x0400300000000000L});
    public static final BitSet FOLLOW_simple_expr_in_timestimes_expr3705 = new BitSet(new long[]{0x0000000000000002L,0x04000C0000000000L});
    public static final BitSet FOLLOW_NL_in_timestimes_expr3708 = new BitSet(new long[]{0x0000000000000000L,0x00000C0000000000L});
    public static final BitSet FOLLOW_TIMESTIMES_in_timestimes_expr3713 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_QUOTIENTQUOTIENT_in_timestimes_expr3716 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_timestimes_expr3720 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_simple_expr_in_timestimes_expr3724 = new BitSet(new long[]{0x0000000000000002L,0x04000C0000000000L});
    public static final BitSet FOLLOW_p_simple_expr_in_p_timestimes_expr3737 = new BitSet(new long[]{0x0000000000000002L,0x04000C0000000000L});
    public static final BitSet FOLLOW_NL_in_p_timestimes_expr3740 = new BitSet(new long[]{0x0000000000000000L,0x00000C0000000000L});
    public static final BitSet FOLLOW_TIMESTIMES_in_p_timestimes_expr3745 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_QUOTIENTQUOTIENT_in_p_timestimes_expr3748 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_p_timestimes_expr3752 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_p_simple_expr_in_p_timestimes_expr3756 = new BitSet(new long[]{0x0000000000000002L,0x04000C0000000000L});
    public static final BitSet FOLLOW_cons_expr_in_simple_expr3767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_cons_expr_in_p_simple_expr3776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_to_expr_in_cons_expr3785 = new BitSet(new long[]{0x0000000000000002L,0x0400030000000000L});
    public static final BitSet FOLLOW_NL_in_cons_expr3788 = new BitSet(new long[]{0x0000000000000000L,0x0400030000000000L});
    public static final BitSet FOLLOW_token_DOUBLE_COLON_in_cons_expr3791 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_cons_expr3793 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_to_expr_in_cons_expr3796 = new BitSet(new long[]{0x0000000000000002L,0x0400030000000000L});
    public static final BitSet FOLLOW_p_to_expr_in_p_cons_expr3816 = new BitSet(new long[]{0x0000000000000002L,0x0400030000000000L});
    public static final BitSet FOLLOW_NL_in_p_cons_expr3819 = new BitSet(new long[]{0x0000000000000000L,0x0400030000000000L});
    public static final BitSet FOLLOW_token_DOUBLE_COLON_in_p_cons_expr3822 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_p_cons_expr3824 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_p_to_expr_in_p_cons_expr3827 = new BitSet(new long[]{0x0000000000000002L,0x0400030000000000L});
    public static final BitSet FOLLOW_arith_plus_expr_in_to_expr3847 = new BitSet(new long[]{0x0000000000000002L,0x0400000000000018L});
    public static final BitSet FOLLOW_NL_in_to_expr3850 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_L_to_in_to_expr3855 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_L_downto_in_to_expr3859 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_to_expr3863 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_arith_plus_expr_in_to_expr3867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_arith_plus_expr_in_p_to_expr3880 = new BitSet(new long[]{0x0000000000000002L,0x0400000000000018L});
    public static final BitSet FOLLOW_NL_in_p_to_expr3883 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_L_to_in_p_to_expr3888 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_L_downto_in_p_to_expr3892 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_p_to_expr3896 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_p_arith_plus_expr_in_p_to_expr3900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arith_uminus_expr_in_arith_plus_expr3912 = new BitSet(new long[]{0x0000000000000002L,0x0400000060000000L});
    public static final BitSet FOLLOW_NL_in_arith_plus_expr3916 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_PLUS_in_arith_plus_expr3920 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_MINUS_in_arith_plus_expr3925 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_arith_plus_expr3929 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_arith_uminus_expr_in_arith_plus_expr3933 = new BitSet(new long[]{0x0000000000000002L,0x0400000060000000L});
    public static final BitSet FOLLOW_p_arith_uminus_expr_in_p_arith_plus_expr3944 = new BitSet(new long[]{0x0000000000000002L,0x0400000060000000L});
    public static final BitSet FOLLOW_NL_in_p_arith_plus_expr3947 = new BitSet(new long[]{0x0000000000000000L,0x0000000060000000L});
    public static final BitSet FOLLOW_set_in_p_arith_plus_expr3951 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_p_arith_plus_expr3960 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_p_arith_uminus_expr_in_p_arith_plus_expr3964 = new BitSet(new long[]{0x0000000000000002L,0x0400000060000000L});
    public static final BitSet FOLLOW_MINUS_in_arith_uminus_expr3977 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_arith_uminus_expr3979 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_arith_mult_expr_in_arith_uminus_expr3982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arith_mult_expr_in_arith_uminus_expr3995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_p_arith_uminus_expr4006 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_p_arith_uminus_expr4008 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_p_arith_mult_expr_in_p_arith_uminus_expr4011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_arith_mult_expr_in_p_arith_uminus_expr4024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arith_pow_expr_in_arith_mult_expr4033 = new BitSet(new long[]{0x0000000000000002L,0x0400000180030000L});
    public static final BitSet FOLLOW_NL_in_arith_mult_expr4036 = new BitSet(new long[]{0x0000000000000000L,0x0000000180030000L});
    public static final BitSet FOLLOW_set_in_arith_mult_expr4040 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_arith_mult_expr4057 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_arith_pow_expr_in_arith_mult_expr4061 = new BitSet(new long[]{0x0000000000000002L,0x0400000180030000L});
    public static final BitSet FOLLOW_p_arith_pow_expr_in_p_arith_mult_expr4073 = new BitSet(new long[]{0x0000000000000002L,0x0400000180030000L});
    public static final BitSet FOLLOW_NL_in_p_arith_mult_expr4076 = new BitSet(new long[]{0x0000000000000000L,0x0000000180030000L});
    public static final BitSet FOLLOW_set_in_p_arith_mult_expr4080 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_p_arith_mult_expr4097 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_p_arith_pow_expr_in_p_arith_mult_expr4101 = new BitSet(new long[]{0x0000000000000002L,0x0400000180030000L});
    public static final BitSet FOLLOW_apply_expr_in_arith_pow_expr4112 = new BitSet(new long[]{0x0000000000000002L,0x0400000200000000L});
    public static final BitSet FOLLOW_NL_in_arith_pow_expr4115 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_POW_tok_in_arith_pow_expr4118 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_arith_pow_expr4120 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_apply_expr_in_arith_pow_expr4123 = new BitSet(new long[]{0x0000000000000002L,0x0400000200000000L});
    public static final BitSet FOLLOW_p_apply_expr_in_p_arith_pow_expr4144 = new BitSet(new long[]{0x0000000000000002L,0x0400000200000000L});
    public static final BitSet FOLLOW_NL_in_p_arith_pow_expr4147 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_POW_tok_in_p_arith_pow_expr4150 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_p_arith_pow_expr4152 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_p_apply_expr_in_p_arith_pow_expr4155 = new BitSet(new long[]{0x0000000000000002L,0x0400000200000000L});
    public static final BitSet FOLLOW_basic_expr_in_apply_expr4176 = new BitSet(new long[]{0x3319000000000002L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_p_basic_expr_in_p_apply_expr4194 = new BitSet(new long[]{0x3319000000000002L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_p_apply_expr4197 = new BitSet(new long[]{0x3319000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_p_basic_expr_in_p_apply_expr4200 = new BitSet(new long[]{0x3319000000000002L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_message_send_expr_in_basic_expr4220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_message_send_expr_in_p_basic_expr4229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitive_expr_in_message_send_expr4238 = new BitSet(new long[]{0x0000000000000002L,0x0410000000000000L});
    public static final BitSet FOLLOW_NL_in_message_send_expr4241 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_PERIOD_in_message_send_expr4244 = new BitSet(new long[]{0x0000000000000000L,0x1400000000000000L});
    public static final BitSet FOLLOW_NL_in_message_send_expr4246 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_Id_in_message_send_expr4249 = new BitSet(new long[]{0x0000000000000002L,0x0410000000000000L});
    public static final BitSet FOLLOW_SQUARE_BRACKET_OPEN_in_list_expr4273 = new BitSet(new long[]{0x331D000000000000L,0xBC8C00904000FBE4L,0x000000000000005DL});
    public static final BitSet FOLLOW_NL_in_list_expr4275 = new BitSet(new long[]{0x331D000000000000L,0xBC8C00904000FBE4L,0x000000000000005DL});
    public static final BitSet FOLLOW_protected_expr_in_list_expr4279 = new BitSet(new long[]{0x0000000000000000L,0x0420000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_NL_in_list_expr4282 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_COMMA_in_list_expr4285 = new BitSet(new long[]{0x331D000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_list_expr4287 = new BitSet(new long[]{0x331D000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_protected_expr_in_list_expr4290 = new BitSet(new long[]{0x0000000000000000L,0x0420000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_NL_in_list_expr4294 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SQUARE_BRACKET_CLOSE_in_list_expr4299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROUND_BRACKET_OPEN_in_list_expr4313 = new BitSet(new long[]{0x331D000000000000L,0xBC8C00904000FBE4L,0x0000000000000057L});
    public static final BitSet FOLLOW_NL_in_list_expr4315 = new BitSet(new long[]{0x331D000000000000L,0xBC8C00904000FBE4L,0x0000000000000057L});
    public static final BitSet FOLLOW_protected_expr_in_list_expr4319 = new BitSet(new long[]{0x0000000000000000L,0x0420000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_NL_in_list_expr4322 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_COMMA_in_list_expr4325 = new BitSet(new long[]{0x331D000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_list_expr4327 = new BitSet(new long[]{0x331D000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_protected_expr_in_list_expr4330 = new BitSet(new long[]{0x0000000000000000L,0x0420000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_NL_in_list_expr4334 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_list_expr4338 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_NL_in_list_expr4340 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_ROUND_BRACKET_CLOSE_in_list_expr4347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURLY_BRACKET_OPEN_in_map_or_set_expr4376 = new BitSet(new long[]{0x331D000000000000L,0xBC8C00904000FBE4L,0x0000000000000075L});
    public static final BitSet FOLLOW_NL_in_map_or_set_expr4378 = new BitSet(new long[]{0x331D000000000000L,0xBC8C00904000FBE4L,0x0000000000000075L});
    public static final BitSet FOLLOW_map_or_set_elem_expr_in_map_or_set_expr4382 = new BitSet(new long[]{0x0000000000000000L,0x0420000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_map_or_set_expr4384 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_COMMA_in_map_or_set_expr4388 = new BitSet(new long[]{0x331D000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_map_or_set_expr4390 = new BitSet(new long[]{0x331D000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_map_or_set_elem_expr_in_map_or_set_expr4393 = new BitSet(new long[]{0x0000000000000000L,0x0420000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_map_or_set_expr4395 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_CURLY_BRACKET_CLOSE_in_map_or_set_expr4402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURLY_BRACKET_OPEN_in_map_or_set_expr4422 = new BitSet(new long[]{0x0000000000000000L,0x0403000000000000L});
    public static final BitSet FOLLOW_NL_in_map_or_set_expr4424 = new BitSet(new long[]{0x0000000000000000L,0x0003000000000000L});
    public static final BitSet FOLLOW_token_ARROW_in_map_or_set_expr4427 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_map_or_set_expr4429 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_CURLY_BRACKET_CLOSE_in_map_or_set_expr4432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protected_expr_in_map_or_set_elem_expr4449 = new BitSet(new long[]{0x0000000100000002L,0x0403000000000000L});
    public static final BitSet FOLLOW_NL_in_map_or_set_elem_expr4452 = new BitSet(new long[]{0x0000000100000000L,0x0403000000000000L});
    public static final BitSet FOLLOW_arrow_or_assign_in_map_or_set_elem_expr4455 = new BitSet(new long[]{0x331D000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_NL_in_map_or_set_elem_expr4457 = new BitSet(new long[]{0x331D000000000000L,0xBC8C00904000FBE4L,0x0000000000000055L});
    public static final BitSet FOLLOW_protected_expr_in_map_or_set_elem_expr4460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Num_in_primitive_expr4487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_String_in_primitive_expr4492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Id_in_primitive_expr4497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Constr_in_primitive_expr4502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_true_in_primitive_expr4507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_false_in_primitive_expr4512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_this_in_primitive_expr4517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_nil_in_primitive_expr4523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_infinity_in_primitive_expr4528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_list_expr_in_primitive_expr4534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_with_control_expr_in_primitive_expr4539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_map_or_set_expr_in_primitive_expr4544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_prog4554 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_prog4556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Id_in_synpred1_babel171601 = new BitSet(new long[]{0x4000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_NL_in_synpred1_babel171603 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_L_as_in_synpred1_babel171606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protected_expr_in_synpred2_babel171637 = new BitSet(new long[]{0x0000000000000000L,0x0440000000000000L});
    public static final BitSet FOLLOW_NL_in_synpred2_babel171639 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_QUESTION_MARK_in_synpred2_babel171642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_synpred3_babel172495 = new BitSet(new long[]{0x0000000100000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_objelem_assign_in_synpred3_babel172499 = new BitSet(new long[]{0x0000000100000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_NL_in_synpred3_babel172502 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ASSIGN_in_synpred3_babel172505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_obj_in_synpred4_babel172719 = new BitSet(new long[]{0x0000000000000000L,0x04000000A0000000L});
    public static final BitSet FOLLOW_NL_in_synpred4_babel172721 = new BitSet(new long[]{0x0000000000000000L,0x04000000A0000000L});
    public static final BitSet FOLLOW_parents_in_synpred4_babel172724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_expr_in_synpred5_babel172793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protected_lambda_expr_in_synpred6_babel172814 = new BitSet(new long[]{0x0000000000000002L});

}