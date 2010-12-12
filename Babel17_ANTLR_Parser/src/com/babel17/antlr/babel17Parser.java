// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g 2010-12-12 16:29:08

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PROG", "NIL_TOKEN", "ANY", "LAMBDA", "SQUARE_LIST", "ROUND_LIST", "LIST_CONS", "COMPARE", "APPLY", "IF", "MAP_OR_SET_OR_OBJ", "EMPTY_MAP", "EXCEPTION", "MATCH", "TRY", "CASES", "OBJ", "FOR_EXPR", "WHILE_DO", "MESSAGE_SEND", "UMINUS", "POW", "PARENTS_PLUS", "PARENTS_MUL", "BLOCK", "BEGIN", "WITH", "VAL", "OBJELEM_ASSIGN", "ASSIGN", "ARROW", "DEF", "YIELD", "MEMOIZE", "MEM_STRONG", "MEM_WEAK", "IF_PATTERN", "Newline", "NotNewline", "COMMENT", "SmallLetter", "BigLetter", "Letter", "Digit", "Hex", "L_begin", "L_end", "L_obj", "L_with", "L_if", "L_then", "L_else", "L_elseif", "L_while", "L_for", "L_do", "L_yield", "L_match", "L_case", "L_as", "L_val", "L_def", "L_in", "L_exception", "L_to", "L_downto", "L_try", "L_catch", "A_infinity", "U_infinity", "L_concurrent", "L_choose", "L_lazy", "L_memoize", "L_true", "L_false", "L_this", "L_random", "L_nil", "L_div", "L_mod", "A_EQUAL", "U_EQUAL", "A_NOT_EQUAL", "U_NOT_EQUAL", "LESS", "A_LESS_EQ", "U_LESS_EQ", "GREATER", "A_GREATER_EQ", "U_GREATER_EQ", "SC", "PLUS", "MINUS", "TIMES", "QUOTIENT", "POW_tok", "A_OR", "A_AND", "A_NOT", "U_OR", "U_AND", "U_NOT", "A_DOUBLE_COLON", "U_DOUBLE_COLON", "TIMESTIMES", "QUOTIENTQUOTIENT", "PLUSPLUS", "MINUSMINUS", "A_DOUBLE_ARROW", "U_DOUBLE_ARROW", "A_ARROW", "U_ARROW", "A_ELLIPSIS", "U_ELLIPSIS", "PERIOD", "COMMA", "QUESTION_MARK", "L_force", "WsChar", "WS", "NL", "Constr", "Id", "Num", "Charcode", "String", "ROUND_BRACKET_OPEN", "ROUND_BRACKET_CLOSE", "SQUARE_BRACKET_OPEN", "SQUARE_BRACKET_CLOSE", "CURLY_BRACKET_OPEN", "CURLY_BRACKET_CLOSE", "UNDERSCORE", "PRAGMA_LOG", "PRAGMA_PRINT", "PRAGMA_ASSERT", "PRAGMA_PROFILE"
    };
    public static final int U_AND=105;
    public static final int L_end=50;
    public static final int U_NOT_EQUAL=88;
    public static final int TIMESTIMES=109;
    public static final int BigLetter=45;
    public static final int L_try=70;
    public static final int ROUND_BRACKET_CLOSE=132;
    public static final int L_mod=84;
    public static final int A_OR=101;
    public static final int MINUSMINUS=112;
    public static final int Newline=41;
    public static final int SQUARE_BRACKET_CLOSE=134;
    public static final int MAP_OR_SET_OR_OBJ=14;
    public static final int EOF=-1;
    public static final int U_DOUBLE_ARROW=114;
    public static final int L_exception=67;
    public static final int Num=128;
    public static final int GREATER=92;
    public static final int EMPTY_MAP=15;
    public static final int POW=25;
    public static final int L_catch=71;
    public static final int L_concurrent=74;
    public static final int L_false=79;
    public static final int QUOTIENTQUOTIENT=110;
    public static final int L_nil=82;
    public static final int BEGIN=29;
    public static final int LIST_CONS=10;
    public static final int L_with=52;
    public static final int QUESTION_MARK=121;
    public static final int LESS=89;
    public static final int ROUND_BRACKET_OPEN=131;
    public static final int SQUARE_LIST=8;
    public static final int VAL=31;
    public static final int L_as=63;
    public static final int NL=125;
    public static final int MESSAGE_SEND=23;
    public static final int A_ARROW=115;
    public static final int A_DOUBLE_COLON=107;
    public static final int COMMENT=43;
    public static final int L_def=65;
    public static final int A_AND=102;
    public static final int EXCEPTION=16;
    public static final int L_this=80;
    public static final int L_force=122;
    public static final int L_choose=75;
    public static final int PERIOD=119;
    public static final int SmallLetter=44;
    public static final int NIL_TOKEN=5;
    public static final int PRAGMA_PRINT=139;
    public static final int CURLY_BRACKET_OPEN=135;
    public static final int UNDERSCORE=137;
    public static final int MATCH=17;
    public static final int U_LESS_EQ=91;
    public static final int MEM_STRONG=38;
    public static final int TRY=18;
    public static final int L_to=68;
    public static final int WS=124;
    public static final int Charcode=129;
    public static final int L_do=59;
    public static final int L_val=64;
    public static final int L_match=61;
    public static final int L_obj=51;
    public static final int WsChar=123;
    public static final int Hex=48;
    public static final int L_for=58;
    public static final int Letter=46;
    public static final int PRAGMA_ASSERT=140;
    public static final int APPLY=12;
    public static final int U_ARROW=116;
    public static final int PRAGMA_LOG=138;
    public static final int L_else=55;
    public static final int A_EQUAL=85;
    public static final int DEF=35;
    public static final int L_begin=49;
    public static final int U_NOT=106;
    public static final int L_yield=60;
    public static final int L_div=83;
    public static final int PLUSPLUS=111;
    public static final int L_while=57;
    public static final int CASES=19;
    public static final int POW_tok=100;
    public static final int IF_PATTERN=40;
    public static final int A_ELLIPSIS=117;
    public static final int PARENTS_PLUS=26;
    public static final int A_DOUBLE_ARROW=113;
    public static final int SQUARE_BRACKET_OPEN=133;
    public static final int IF=13;
    public static final int PROG=4;
    public static final int U_OR=104;
    public static final int COMMA=120;
    public static final int OBJ=20;
    public static final int MEMOIZE=37;
    public static final int U_ELLIPSIS=118;
    public static final int YIELD=36;
    public static final int COMPARE=11;
    public static final int U_GREATER_EQ=94;
    public static final int U_EQUAL=86;
    public static final int PLUS=96;
    public static final int String=130;
    public static final int LAMBDA=7;
    public static final int L_true=78;
    public static final int Id=127;
    public static final int A_infinity=72;
    public static final int WITH=30;
    public static final int L_in=66;
    public static final int A_NOT=103;
    public static final int L_lazy=76;
    public static final int NotNewline=42;
    public static final int L_then=54;
    public static final int QUOTIENT=99;
    public static final int L_if=53;
    public static final int CURLY_BRACKET_CLOSE=136;
    public static final int UMINUS=24;
    public static final int FOR_EXPR=21;
    public static final int Constr=126;
    public static final int WHILE_DO=22;
    public static final int L_elseif=56;
    public static final int MINUS=97;
    public static final int Digit=47;
    public static final int L_memoize=77;
    public static final int MEM_WEAK=39;
    public static final int A_GREATER_EQ=93;
    public static final int ROUND_LIST=9;
    public static final int PRAGMA_PROFILE=141;
    public static final int SC=95;
    public static final int L_downto=69;
    public static final int ANY=6;
    public static final int L_random=81;
    public static final int BLOCK=28;
    public static final int A_NOT_EQUAL=87;
    public static final int ASSIGN=33;
    public static final int U_DOUBLE_COLON=108;
    public static final int OBJELEM_ASSIGN=32;
    public static final int ARROW=34;
    public static final int L_case=62;
    public static final int TIMES=98;
    public static final int U_infinity=73;
    public static final int A_LESS_EQ=90;
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:172:1: token_infinity : ( A_infinity | U_infinity );
    public final babel17Parser.token_infinity_return token_infinity() throws RecognitionException {
        babel17Parser.token_infinity_return retval = new babel17Parser.token_infinity_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set1=null;

        CommonTree set1_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:173:2: ( A_infinity | U_infinity )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:205:1: token_EQUAL : ( A_EQUAL | U_EQUAL );
    public final babel17Parser.token_EQUAL_return token_EQUAL() throws RecognitionException {
        babel17Parser.token_EQUAL_return retval = new babel17Parser.token_EQUAL_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set2=null;

        CommonTree set2_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:206:2: ( A_EQUAL | U_EQUAL )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:213:1: token_NOT_EQUAL : ( A_NOT_EQUAL | U_NOT_EQUAL );
    public final babel17Parser.token_NOT_EQUAL_return token_NOT_EQUAL() throws RecognitionException {
        babel17Parser.token_NOT_EQUAL_return retval = new babel17Parser.token_NOT_EQUAL_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set3=null;

        CommonTree set3_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:214:2: ( A_NOT_EQUAL | U_NOT_EQUAL )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:222:1: token_LESS_EQ : ( A_LESS_EQ | U_LESS_EQ );
    public final babel17Parser.token_LESS_EQ_return token_LESS_EQ() throws RecognitionException {
        babel17Parser.token_LESS_EQ_return retval = new babel17Parser.token_LESS_EQ_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set4=null;

        CommonTree set4_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:223:2: ( A_LESS_EQ | U_LESS_EQ )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:232:1: token_GREATER_EQ : ( A_GREATER_EQ | U_GREATER_EQ );
    public final babel17Parser.token_GREATER_EQ_return token_GREATER_EQ() throws RecognitionException {
        babel17Parser.token_GREATER_EQ_return retval = new babel17Parser.token_GREATER_EQ_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set5=null;

        CommonTree set5_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:233:2: ( A_GREATER_EQ | U_GREATER_EQ )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:250:1: token_OR : ( A_OR | U_OR );
    public final babel17Parser.token_OR_return token_OR() throws RecognitionException {
        babel17Parser.token_OR_return retval = new babel17Parser.token_OR_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set6=null;

        CommonTree set6_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:250:9: ( A_OR | U_OR )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:251:1: token_AND : ( A_AND | U_AND );
    public final babel17Parser.token_AND_return token_AND() throws RecognitionException {
        babel17Parser.token_AND_return retval = new babel17Parser.token_AND_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set7=null;

        CommonTree set7_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:252:2: ( A_AND | U_AND )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:253:1: token_NOT : ( A_NOT | U_NOT );
    public final babel17Parser.token_NOT_return token_NOT() throws RecognitionException {
        babel17Parser.token_NOT_return retval = new babel17Parser.token_NOT_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set8=null;

        CommonTree set8_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:254:2: ( A_NOT | U_NOT )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:260:1: token_DOUBLE_COLON : ( A_DOUBLE_COLON | U_DOUBLE_COLON );
    public final babel17Parser.token_DOUBLE_COLON_return token_DOUBLE_COLON() throws RecognitionException {
        babel17Parser.token_DOUBLE_COLON_return retval = new babel17Parser.token_DOUBLE_COLON_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set9=null;

        CommonTree set9_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:261:2: ( A_DOUBLE_COLON | U_DOUBLE_COLON )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:358:1: pattern : ( Constr ( ( NL )? pattern )? -> ^( Constr ( pattern )? ) | primitive_pattern ( ( NL )? token_DOUBLE_COLON ( NL )? primitive_pattern )* -> ^( LIST_CONS ( primitive_pattern )* ) | L_exception pattern -> ^( L_exception pattern ) | token_ELLIPSIS );
    public final babel17Parser.pattern_return pattern() throws RecognitionException {
        babel17Parser.pattern_return retval = new babel17Parser.pattern_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Constr13=null;
        Token NL14=null;
        Token NL17=null;
        Token NL19=null;
        Token L_exception21=null;
        babel17Parser.pattern_return pattern15 = null;

        babel17Parser.primitive_pattern_return primitive_pattern16 = null;

        babel17Parser.token_DOUBLE_COLON_return token_DOUBLE_COLON18 = null;

        babel17Parser.primitive_pattern_return primitive_pattern20 = null;

        babel17Parser.pattern_return pattern22 = null;

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
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:358:9: ( Constr ( ( NL )? pattern )? -> ^( Constr ( pattern )? ) | primitive_pattern ( ( NL )? token_DOUBLE_COLON ( NL )? primitive_pattern )* -> ^( LIST_CONS ( primitive_pattern )* ) | L_exception pattern -> ^( L_exception pattern ) | token_ELLIPSIS )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:358:11: Constr ( ( NL )? pattern )?
                    {
                    Constr13=(Token)match(input,Constr,FOLLOW_Constr_in_pattern1544); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Constr.add(Constr13);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:358:18: ( ( NL )? pattern )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==NL) ) {
                        int LA2_1 = input.LA(2);

                        if ( (LA2_1==L_exception||(LA2_1>=A_infinity && LA2_1<=U_infinity)||(LA2_1>=L_true && LA2_1<=L_false)||LA2_1==L_nil||LA2_1==MINUS||(LA2_1>=A_ELLIPSIS && LA2_1<=U_ELLIPSIS)||(LA2_1>=Constr && LA2_1<=Num)||(LA2_1>=String && LA2_1<=ROUND_BRACKET_OPEN)||LA2_1==SQUARE_BRACKET_OPEN||LA2_1==CURLY_BRACKET_OPEN||LA2_1==UNDERSCORE) ) {
                            alt2=1;
                        }
                    }
                    else if ( (LA2_0==L_exception||(LA2_0>=A_infinity && LA2_0<=U_infinity)||(LA2_0>=L_true && LA2_0<=L_false)||LA2_0==L_nil||LA2_0==MINUS||(LA2_0>=A_ELLIPSIS && LA2_0<=U_ELLIPSIS)||(LA2_0>=Constr && LA2_0<=Num)||(LA2_0>=String && LA2_0<=ROUND_BRACKET_OPEN)||LA2_0==SQUARE_BRACKET_OPEN||LA2_0==CURLY_BRACKET_OPEN||LA2_0==UNDERSCORE) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:358:19: ( NL )? pattern
                            {
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:358:19: ( NL )?
                            int alt1=2;
                            int LA1_0 = input.LA(1);

                            if ( (LA1_0==NL) ) {
                                alt1=1;
                            }
                            switch (alt1) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:358:19: NL
                                    {
                                    NL14=(Token)match(input,NL,FOLLOW_NL_in_pattern1547); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL14);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_pattern_in_pattern1550);
                            pattern15=pattern();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_pattern.add(pattern15.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: pattern, Constr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 358:33: -> ^( Constr ( pattern )? )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:358:36: ^( Constr ( pattern )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_Constr.nextNode(), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:358:45: ( pattern )?
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
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:359:4: primitive_pattern ( ( NL )? token_DOUBLE_COLON ( NL )? primitive_pattern )*
                    {
                    pushFollow(FOLLOW_primitive_pattern_in_pattern1566);
                    primitive_pattern16=primitive_pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primitive_pattern.add(primitive_pattern16.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:359:22: ( ( NL )? token_DOUBLE_COLON ( NL )? primitive_pattern )*
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
                    	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:359:23: ( NL )? token_DOUBLE_COLON ( NL )? primitive_pattern
                    	    {
                    	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:359:23: ( NL )?
                    	    int alt3=2;
                    	    int LA3_0 = input.LA(1);

                    	    if ( (LA3_0==NL) ) {
                    	        alt3=1;
                    	    }
                    	    switch (alt3) {
                    	        case 1 :
                    	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:359:23: NL
                    	            {
                    	            NL17=(Token)match(input,NL,FOLLOW_NL_in_pattern1569); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_NL.add(NL17);


                    	            }
                    	            break;

                    	    }

                    	    pushFollow(FOLLOW_token_DOUBLE_COLON_in_pattern1572);
                    	    token_DOUBLE_COLON18=token_DOUBLE_COLON();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_token_DOUBLE_COLON.add(token_DOUBLE_COLON18.getTree());
                    	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:359:46: ( NL )?
                    	    int alt4=2;
                    	    int LA4_0 = input.LA(1);

                    	    if ( (LA4_0==NL) ) {
                    	        alt4=1;
                    	    }
                    	    switch (alt4) {
                    	        case 1 :
                    	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:359:46: NL
                    	            {
                    	            NL19=(Token)match(input,NL,FOLLOW_NL_in_pattern1574); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_NL.add(NL19);


                    	            }
                    	            break;

                    	    }

                    	    pushFollow(FOLLOW_primitive_pattern_in_pattern1577);
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
                    // 360:3: -> ^( LIST_CONS ( primitive_pattern )* )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:360:6: ^( LIST_CONS ( primitive_pattern )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LIST_CONS, "LIST_CONS"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:360:18: ( primitive_pattern )*
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:361:4: L_exception pattern
                    {
                    L_exception21=(Token)match(input,L_exception,FOLLOW_L_exception_in_pattern1596); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_exception.add(L_exception21);

                    pushFollow(FOLLOW_pattern_in_pattern1598);
                    pattern22=pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pattern.add(pattern22.getTree());


                    // AST REWRITE
                    // elements: pattern, L_exception
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 361:24: -> ^( L_exception pattern )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:361:27: ^( L_exception pattern )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_L_exception.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_pattern.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:362:4: token_ELLIPSIS
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_ELLIPSIS_in_pattern1611);
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:364:1: bracket_pattern : ( ( Id ( NL )? L_as )=> Id ( NL )? L_as ( NL )? pattern -> ^( L_as Id pattern ) | ( protected_expr ( NL )? QUESTION_MARK )=> protected_expr ( NL )? QUESTION_MARK ( ( NL )? pattern )? -> ^( QUESTION_MARK protected_expr ( pattern )? ) | pattern ( ( NL )? L_if ( NL )? protected_expr )? -> ^( IF_PATTERN pattern ( protected_expr )? ) | L_val ( NL )? protected_expr -> ^( L_val protected_expr ) | L_for ( NL )? ( bracket_pattern ( ( NL )? COMMA ( NL )? bracket_pattern )* ( NL )? )? L_end -> ^( L_for ( bracket_pattern )* ) );
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:365:2: ( ( Id ( NL )? L_as )=> Id ( NL )? L_as ( NL )? pattern -> ^( L_as Id pattern ) | ( protected_expr ( NL )? QUESTION_MARK )=> protected_expr ( NL )? QUESTION_MARK ( ( NL )? pattern )? -> ^( QUESTION_MARK protected_expr ( pattern )? ) | pattern ( ( NL )? L_if ( NL )? protected_expr )? -> ^( IF_PATTERN pattern ( protected_expr )? ) | L_val ( NL )? protected_expr -> ^( L_val protected_expr ) | L_for ( NL )? ( bracket_pattern ( ( NL )? COMMA ( NL )? bracket_pattern )* ( NL )? )? L_end -> ^( L_for ( bracket_pattern )* ) )
            int alt22=5;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:365:10: ( Id ( NL )? L_as )=> Id ( NL )? L_as ( NL )? pattern
                    {
                    Id24=(Token)match(input,Id,FOLLOW_Id_in_bracket_pattern1638); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Id.add(Id24);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:365:30: ( NL )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==NL) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:365:30: NL
                            {
                            NL25=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1640); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL25);


                            }
                            break;

                    }

                    L_as26=(Token)match(input,L_as,FOLLOW_L_as_in_bracket_pattern1643); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_as.add(L_as26);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:365:39: ( NL )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==NL) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:365:39: NL
                            {
                            NL27=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1645); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL27);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_pattern_in_bracket_pattern1648);
                    pattern28=pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pattern.add(pattern28.getTree());


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
                    // 365:51: -> ^( L_as Id pattern )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:365:54: ^( L_as Id pattern )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:366:4: ( protected_expr ( NL )? QUESTION_MARK )=> protected_expr ( NL )? QUESTION_MARK ( ( NL )? pattern )?
                    {
                    pushFollow(FOLLOW_protected_expr_in_bracket_pattern1677);
                    protected_expr29=protected_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr29.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:367:18: ( NL )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==NL) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:367:18: NL
                            {
                            NL30=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1679); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL30);


                            }
                            break;

                    }

                    QUESTION_MARK31=(Token)match(input,QUESTION_MARK,FOLLOW_QUESTION_MARK_in_bracket_pattern1682); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QUESTION_MARK.add(QUESTION_MARK31);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:367:36: ( ( NL )? pattern )?
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
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:367:37: ( NL )? pattern
                            {
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:367:37: ( NL )?
                            int alt10=2;
                            int LA10_0 = input.LA(1);

                            if ( (LA10_0==NL) ) {
                                alt10=1;
                            }
                            switch (alt10) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:367:37: NL
                                    {
                                    NL32=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1685); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL32);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_pattern_in_bracket_pattern1688);
                            pattern33=pattern();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_pattern.add(pattern33.getTree());

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
                    // 367:51: -> ^( QUESTION_MARK protected_expr ( pattern )? )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:367:54: ^( QUESTION_MARK protected_expr ( pattern )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_QUESTION_MARK.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_protected_expr.nextTree());
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:367:85: ( pattern )?
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:368:4: pattern ( ( NL )? L_if ( NL )? protected_expr )?
                    {
                    pushFollow(FOLLOW_pattern_in_bracket_pattern1706);
                    pattern34=pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pattern.add(pattern34.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:368:12: ( ( NL )? L_if ( NL )? protected_expr )?
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
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:368:13: ( NL )? L_if ( NL )? protected_expr
                            {
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:368:13: ( NL )?
                            int alt12=2;
                            int LA12_0 = input.LA(1);

                            if ( (LA12_0==NL) ) {
                                alt12=1;
                            }
                            switch (alt12) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:368:13: NL
                                    {
                                    NL35=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1709); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL35);


                                    }
                                    break;

                            }

                            L_if36=(Token)match(input,L_if,FOLLOW_L_if_in_bracket_pattern1712); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_L_if.add(L_if36);

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:368:22: ( NL )?
                            int alt13=2;
                            int LA13_0 = input.LA(1);

                            if ( (LA13_0==NL) ) {
                                alt13=1;
                            }
                            switch (alt13) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:368:22: NL
                                    {
                                    NL37=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1714); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL37);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_protected_expr_in_bracket_pattern1717);
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
                    // 368:43: -> ^( IF_PATTERN pattern ( protected_expr )? )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:368:46: ^( IF_PATTERN pattern ( protected_expr )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IF_PATTERN, "IF_PATTERN"), root_1);

                        adaptor.addChild(root_1, stream_pattern.nextTree());
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:368:67: ( protected_expr )?
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:369:4: L_val ( NL )? protected_expr
                    {
                    L_val39=(Token)match(input,L_val,FOLLOW_L_val_in_bracket_pattern1735); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_val.add(L_val39);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:369:10: ( NL )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==NL) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:369:10: NL
                            {
                            NL40=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1737); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL40);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_protected_expr_in_bracket_pattern1740);
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
                    // 369:29: -> ^( L_val protected_expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:369:32: ^( L_val protected_expr )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:370:10: L_for ( NL )? ( bracket_pattern ( ( NL )? COMMA ( NL )? bracket_pattern )* ( NL )? )? L_end
                    {
                    L_for42=(Token)match(input,L_for,FOLLOW_L_for_in_bracket_pattern1759); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_for.add(L_for42);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:370:16: ( NL )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==NL) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:370:16: NL
                            {
                            NL43=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1761); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL43);


                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:370:20: ( bracket_pattern ( ( NL )? COMMA ( NL )? bracket_pattern )* ( NL )? )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==L_begin||(LA21_0>=L_obj && LA21_0<=L_if)||(LA21_0>=L_while && LA21_0<=L_for)||(LA21_0>=L_match && LA21_0<=L_case)||LA21_0==L_val||LA21_0==L_exception||LA21_0==L_try||(LA21_0>=A_infinity && LA21_0<=L_lazy)||(LA21_0>=L_true && LA21_0<=L_nil)||LA21_0==MINUS||LA21_0==A_NOT||LA21_0==U_NOT||(LA21_0>=A_ELLIPSIS && LA21_0<=U_ELLIPSIS)||LA21_0==L_force||(LA21_0>=Constr && LA21_0<=Num)||(LA21_0>=String && LA21_0<=ROUND_BRACKET_OPEN)||LA21_0==SQUARE_BRACKET_OPEN||LA21_0==CURLY_BRACKET_OPEN||LA21_0==UNDERSCORE) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:370:21: bracket_pattern ( ( NL )? COMMA ( NL )? bracket_pattern )* ( NL )?
                            {
                            pushFollow(FOLLOW_bracket_pattern_in_bracket_pattern1765);
                            bracket_pattern44=bracket_pattern();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_bracket_pattern.add(bracket_pattern44.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:370:37: ( ( NL )? COMMA ( NL )? bracket_pattern )*
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
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:370:39: ( NL )? COMMA ( NL )? bracket_pattern
                            	    {
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:370:39: ( NL )?
                            	    int alt17=2;
                            	    int LA17_0 = input.LA(1);

                            	    if ( (LA17_0==NL) ) {
                            	        alt17=1;
                            	    }
                            	    switch (alt17) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:370:39: NL
                            	            {
                            	            NL45=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1769); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL45);


                            	            }
                            	            break;

                            	    }

                            	    COMMA46=(Token)match(input,COMMA,FOLLOW_COMMA_in_bracket_pattern1772); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA46);

                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:370:49: ( NL )?
                            	    int alt18=2;
                            	    int LA18_0 = input.LA(1);

                            	    if ( (LA18_0==NL) ) {
                            	        alt18=1;
                            	    }
                            	    switch (alt18) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:370:49: NL
                            	            {
                            	            NL47=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1774); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL47);


                            	            }
                            	            break;

                            	    }

                            	    pushFollow(FOLLOW_bracket_pattern_in_bracket_pattern1777);
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

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:370:72: ( NL )?
                            int alt20=2;
                            int LA20_0 = input.LA(1);

                            if ( (LA20_0==NL) ) {
                                alt20=1;
                            }
                            switch (alt20) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:370:72: NL
                                    {
                                    NL49=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1782); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL49);


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    L_end50=(Token)match(input,L_end,FOLLOW_L_end_in_bracket_pattern1787); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_end.add(L_end50);



                    // AST REWRITE
                    // elements: L_for, bracket_pattern
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 370:84: -> ^( L_for ( bracket_pattern )* )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:370:87: ^( L_for ( bracket_pattern )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_L_for.nextNode(), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:370:95: ( bracket_pattern )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:372:1: arrow_or_assign : ( token_ARROW -> ^( ARROW ) | ASSIGN -> ^( ASSIGN ) );
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:373:2: ( token_ARROW -> ^( ARROW ) | ASSIGN -> ^( ASSIGN ) )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:373:4: token_ARROW
                    {
                    pushFollow(FOLLOW_token_ARROW_in_arrow_or_assign1806);
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
                    // 373:16: -> ^( ARROW )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:373:19: ^( ARROW )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:374:4: ASSIGN
                    {
                    ASSIGN52=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_arrow_or_assign1817); if (state.failed) return retval; 
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
                    // 374:11: -> ^( ASSIGN )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:374:14: ^( ASSIGN )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:376:1: mselem_pattern : bracket_pattern ( ( NL )? arrow_or_assign ( NL )? bracket_pattern )? -> ^( NIL_TOKEN ^( NIL_TOKEN ( bracket_pattern )* ) ( arrow_or_assign )* ) ;
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:377:2: ( bracket_pattern ( ( NL )? arrow_or_assign ( NL )? bracket_pattern )? -> ^( NIL_TOKEN ^( NIL_TOKEN ( bracket_pattern )* ) ( arrow_or_assign )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:377:4: bracket_pattern ( ( NL )? arrow_or_assign ( NL )? bracket_pattern )?
            {
            pushFollow(FOLLOW_bracket_pattern_in_mselem_pattern1832);
            bracket_pattern53=bracket_pattern();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bracket_pattern.add(bracket_pattern53.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:377:20: ( ( NL )? arrow_or_assign ( NL )? bracket_pattern )?
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:377:21: ( NL )? arrow_or_assign ( NL )? bracket_pattern
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:377:21: ( NL )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==NL) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:377:21: NL
                            {
                            NL54=(Token)match(input,NL,FOLLOW_NL_in_mselem_pattern1835); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL54);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_arrow_or_assign_in_mselem_pattern1838);
                    arrow_or_assign55=arrow_or_assign();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_arrow_or_assign.add(arrow_or_assign55.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:377:41: ( NL )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==NL) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:377:41: NL
                            {
                            NL56=(Token)match(input,NL,FOLLOW_NL_in_mselem_pattern1840); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL56);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_bracket_pattern_in_mselem_pattern1843);
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
            // 378:3: -> ^( NIL_TOKEN ^( NIL_TOKEN ( bracket_pattern )* ) ( arrow_or_assign )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:378:6: ^( NIL_TOKEN ^( NIL_TOKEN ( bracket_pattern )* ) ( arrow_or_assign )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:378:18: ^( NIL_TOKEN ( bracket_pattern )* )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_2);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:378:30: ( bracket_pattern )*
                while ( stream_bracket_pattern.hasNext() ) {
                    adaptor.addChild(root_2, stream_bracket_pattern.nextTree());

                }
                stream_bracket_pattern.reset();

                adaptor.addChild(root_1, root_2);
                }
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:378:48: ( arrow_or_assign )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:380:1: primitive_pattern : ( Id | '_' -> ANY | String | Num | L_true | L_false | L_nil | token_infinity | '-' ( NL )? token_infinity -> ^( UMINUS token_infinity ) | '-' ( NL )? Num -> ^( UMINUS Num ) | '[' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* )? ']' -> ^( SQUARE_LIST ( bracket_pattern )* ) | '(' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* ( COMMA ( NL )? )? )? ')' -> ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( bracket_pattern )* ) ) | '{' ( NL )? ( mselem_pattern ( NL )? ( COMMA ( NL )? mselem_pattern ( NL )? )* )? '}' -> ^( MAP_OR_SET_OR_OBJ ( mselem_pattern )* ) | '{' ( NL )? token_ARROW ( NL )? '}' -> ^( EMPTY_MAP ) );
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:381:2: ( Id | '_' -> ANY | String | Num | L_true | L_false | L_nil | token_infinity | '-' ( NL )? token_infinity -> ^( UMINUS token_infinity ) | '-' ( NL )? Num -> ^( UMINUS Num ) | '[' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* )? ']' -> ^( SQUARE_LIST ( bracket_pattern )* ) | '(' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* ( COMMA ( NL )? )? )? ')' -> ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( bracket_pattern )* ) ) | '{' ( NL )? ( mselem_pattern ( NL )? ( COMMA ( NL )? mselem_pattern ( NL )? )* )? '}' -> ^( MAP_OR_SET_OR_OBJ ( mselem_pattern )* ) | '{' ( NL )? token_ARROW ( NL )? '}' -> ^( EMPTY_MAP ) )
            int alt51=14;
            alt51 = dfa51.predict(input);
            switch (alt51) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:381:4: Id
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Id58=(Token)match(input,Id,FOLLOW_Id_in_primitive_pattern1872); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Id58_tree = (CommonTree)adaptor.create(Id58);
                    adaptor.addChild(root_0, Id58_tree);
                    }

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:382:4: '_'
                    {
                    char_literal59=(Token)match(input,UNDERSCORE,FOLLOW_UNDERSCORE_in_primitive_pattern1877); if (state.failed) return retval; 
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
                    // 382:8: -> ANY
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(ANY, "ANY"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:383:4: String
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    String60=(Token)match(input,String,FOLLOW_String_in_primitive_pattern1886); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    String60_tree = (CommonTree)adaptor.create(String60);
                    adaptor.addChild(root_0, String60_tree);
                    }

                    }
                    break;
                case 4 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:384:4: Num
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Num61=(Token)match(input,Num,FOLLOW_Num_in_primitive_pattern1891); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Num61_tree = (CommonTree)adaptor.create(Num61);
                    adaptor.addChild(root_0, Num61_tree);
                    }

                    }
                    break;
                case 5 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:385:4: L_true
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    L_true62=(Token)match(input,L_true,FOLLOW_L_true_in_primitive_pattern1896); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    L_true62_tree = (CommonTree)adaptor.create(L_true62);
                    adaptor.addChild(root_0, L_true62_tree);
                    }

                    }
                    break;
                case 6 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:386:4: L_false
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    L_false63=(Token)match(input,L_false,FOLLOW_L_false_in_primitive_pattern1901); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    L_false63_tree = (CommonTree)adaptor.create(L_false63);
                    adaptor.addChild(root_0, L_false63_tree);
                    }

                    }
                    break;
                case 7 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:387:4: L_nil
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    L_nil64=(Token)match(input,L_nil,FOLLOW_L_nil_in_primitive_pattern1906); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    L_nil64_tree = (CommonTree)adaptor.create(L_nil64);
                    adaptor.addChild(root_0, L_nil64_tree);
                    }

                    }
                    break;
                case 8 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:388:4: token_infinity
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_infinity_in_primitive_pattern1911);
                    token_infinity65=token_infinity();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, token_infinity65.getTree());

                    }
                    break;
                case 9 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:389:4: '-' ( NL )? token_infinity
                    {
                    char_literal66=(Token)match(input,MINUS,FOLLOW_MINUS_in_primitive_pattern1916); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(char_literal66);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:389:8: ( NL )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==NL) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:389:8: NL
                            {
                            NL67=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern1918); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL67);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_token_infinity_in_primitive_pattern1921);
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
                case 10 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:390:4: '-' ( NL )? Num
                    {
                    char_literal69=(Token)match(input,MINUS,FOLLOW_MINUS_in_primitive_pattern1934); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(char_literal69);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:390:8: ( NL )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==NL) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:390:8: NL
                            {
                            NL70=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern1936); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL70);


                            }
                            break;

                    }

                    Num71=(Token)match(input,Num,FOLLOW_Num_in_primitive_pattern1939); if (state.failed) return retval; 
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
                case 11 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:391:4: '[' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* )? ']'
                    {
                    char_literal72=(Token)match(input,SQUARE_BRACKET_OPEN,FOLLOW_SQUARE_BRACKET_OPEN_in_primitive_pattern1952); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SQUARE_BRACKET_OPEN.add(char_literal72);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:391:9: ( NL )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==NL) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:391:9: NL
                            {
                            NL73=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern1955); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL73);


                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:391:13: ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==L_begin||(LA34_0>=L_obj && LA34_0<=L_if)||(LA34_0>=L_while && LA34_0<=L_for)||(LA34_0>=L_match && LA34_0<=L_case)||LA34_0==L_val||LA34_0==L_exception||LA34_0==L_try||(LA34_0>=A_infinity && LA34_0<=L_lazy)||(LA34_0>=L_true && LA34_0<=L_nil)||LA34_0==MINUS||LA34_0==A_NOT||LA34_0==U_NOT||(LA34_0>=A_ELLIPSIS && LA34_0<=U_ELLIPSIS)||LA34_0==L_force||(LA34_0>=Constr && LA34_0<=Num)||(LA34_0>=String && LA34_0<=ROUND_BRACKET_OPEN)||LA34_0==SQUARE_BRACKET_OPEN||LA34_0==CURLY_BRACKET_OPEN||LA34_0==UNDERSCORE) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:391:14: bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )*
                            {
                            pushFollow(FOLLOW_bracket_pattern_in_primitive_pattern1959);
                            bracket_pattern74=bracket_pattern();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_bracket_pattern.add(bracket_pattern74.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:391:30: ( NL )?
                            int alt30=2;
                            int LA30_0 = input.LA(1);

                            if ( (LA30_0==NL) ) {
                                alt30=1;
                            }
                            switch (alt30) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:391:30: NL
                                    {
                                    NL75=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern1961); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL75);


                                    }
                                    break;

                            }

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:391:34: ( COMMA ( NL )? bracket_pattern ( NL )? )*
                            loop33:
                            do {
                                int alt33=2;
                                int LA33_0 = input.LA(1);

                                if ( (LA33_0==COMMA) ) {
                                    alt33=1;
                                }


                                switch (alt33) {
                            	case 1 :
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:391:36: COMMA ( NL )? bracket_pattern ( NL )?
                            	    {
                            	    COMMA76=(Token)match(input,COMMA,FOLLOW_COMMA_in_primitive_pattern1966); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA76);

                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:391:42: ( NL )?
                            	    int alt31=2;
                            	    int LA31_0 = input.LA(1);

                            	    if ( (LA31_0==NL) ) {
                            	        alt31=1;
                            	    }
                            	    switch (alt31) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:391:42: NL
                            	            {
                            	            NL77=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern1968); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL77);


                            	            }
                            	            break;

                            	    }

                            	    pushFollow(FOLLOW_bracket_pattern_in_primitive_pattern1971);
                            	    bracket_pattern78=bracket_pattern();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_bracket_pattern.add(bracket_pattern78.getTree());
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:391:62: ( NL )?
                            	    int alt32=2;
                            	    int LA32_0 = input.LA(1);

                            	    if ( (LA32_0==NL) ) {
                            	        alt32=1;
                            	    }
                            	    switch (alt32) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:391:62: NL
                            	            {
                            	            NL79=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern1973); if (state.failed) return retval; 
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

                    char_literal80=(Token)match(input,SQUARE_BRACKET_CLOSE,FOLLOW_SQUARE_BRACKET_CLOSE_in_primitive_pattern1981); if (state.failed) return retval; 
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
                case 12 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:393:4: '(' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* ( COMMA ( NL )? )? )? ')'
                    {
                    char_literal81=(Token)match(input,ROUND_BRACKET_OPEN,FOLLOW_ROUND_BRACKET_OPEN_in_primitive_pattern2001); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ROUND_BRACKET_OPEN.add(char_literal81);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:393:9: ( NL )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==NL) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:393:9: NL
                            {
                            NL82=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2004); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL82);


                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:393:13: ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* ( COMMA ( NL )? )? )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==L_begin||(LA42_0>=L_obj && LA42_0<=L_if)||(LA42_0>=L_while && LA42_0<=L_for)||(LA42_0>=L_match && LA42_0<=L_case)||LA42_0==L_val||LA42_0==L_exception||LA42_0==L_try||(LA42_0>=A_infinity && LA42_0<=L_lazy)||(LA42_0>=L_true && LA42_0<=L_nil)||LA42_0==MINUS||LA42_0==A_NOT||LA42_0==U_NOT||(LA42_0>=A_ELLIPSIS && LA42_0<=U_ELLIPSIS)||LA42_0==L_force||(LA42_0>=Constr && LA42_0<=Num)||(LA42_0>=String && LA42_0<=ROUND_BRACKET_OPEN)||LA42_0==SQUARE_BRACKET_OPEN||LA42_0==CURLY_BRACKET_OPEN||LA42_0==UNDERSCORE) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:393:14: bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* ( COMMA ( NL )? )?
                            {
                            pushFollow(FOLLOW_bracket_pattern_in_primitive_pattern2008);
                            bracket_pattern83=bracket_pattern();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_bracket_pattern.add(bracket_pattern83.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:393:30: ( NL )?
                            int alt36=2;
                            int LA36_0 = input.LA(1);

                            if ( (LA36_0==NL) ) {
                                alt36=1;
                            }
                            switch (alt36) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:393:30: NL
                                    {
                                    NL84=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2010); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL84);


                                    }
                                    break;

                            }

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:393:34: ( COMMA ( NL )? bracket_pattern ( NL )? )*
                            loop39:
                            do {
                                int alt39=2;
                                int LA39_0 = input.LA(1);

                                if ( (LA39_0==COMMA) ) {
                                    int LA39_1 = input.LA(2);

                                    if ( (LA39_1==NL) ) {
                                        int LA39_3 = input.LA(3);

                                        if ( (LA39_3==L_begin||(LA39_3>=L_obj && LA39_3<=L_if)||(LA39_3>=L_while && LA39_3<=L_for)||(LA39_3>=L_match && LA39_3<=L_case)||LA39_3==L_val||LA39_3==L_exception||LA39_3==L_try||(LA39_3>=A_infinity && LA39_3<=L_lazy)||(LA39_3>=L_true && LA39_3<=L_nil)||LA39_3==MINUS||LA39_3==A_NOT||LA39_3==U_NOT||(LA39_3>=A_ELLIPSIS && LA39_3<=U_ELLIPSIS)||LA39_3==L_force||(LA39_3>=Constr && LA39_3<=Num)||(LA39_3>=String && LA39_3<=ROUND_BRACKET_OPEN)||LA39_3==SQUARE_BRACKET_OPEN||LA39_3==CURLY_BRACKET_OPEN||LA39_3==UNDERSCORE) ) {
                                            alt39=1;
                                        }


                                    }
                                    else if ( (LA39_1==L_begin||(LA39_1>=L_obj && LA39_1<=L_if)||(LA39_1>=L_while && LA39_1<=L_for)||(LA39_1>=L_match && LA39_1<=L_case)||LA39_1==L_val||LA39_1==L_exception||LA39_1==L_try||(LA39_1>=A_infinity && LA39_1<=L_lazy)||(LA39_1>=L_true && LA39_1<=L_nil)||LA39_1==MINUS||LA39_1==A_NOT||LA39_1==U_NOT||(LA39_1>=A_ELLIPSIS && LA39_1<=U_ELLIPSIS)||LA39_1==L_force||(LA39_1>=Constr && LA39_1<=Num)||(LA39_1>=String && LA39_1<=ROUND_BRACKET_OPEN)||LA39_1==SQUARE_BRACKET_OPEN||LA39_1==CURLY_BRACKET_OPEN||LA39_1==UNDERSCORE) ) {
                                        alt39=1;
                                    }


                                }


                                switch (alt39) {
                            	case 1 :
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:393:36: COMMA ( NL )? bracket_pattern ( NL )?
                            	    {
                            	    COMMA85=(Token)match(input,COMMA,FOLLOW_COMMA_in_primitive_pattern2015); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA85);

                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:393:43: ( NL )?
                            	    int alt37=2;
                            	    int LA37_0 = input.LA(1);

                            	    if ( (LA37_0==NL) ) {
                            	        alt37=1;
                            	    }
                            	    switch (alt37) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:393:43: NL
                            	            {
                            	            NL86=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2018); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL86);


                            	            }
                            	            break;

                            	    }

                            	    pushFollow(FOLLOW_bracket_pattern_in_primitive_pattern2021);
                            	    bracket_pattern87=bracket_pattern();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_bracket_pattern.add(bracket_pattern87.getTree());
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:393:63: ( NL )?
                            	    int alt38=2;
                            	    int LA38_0 = input.LA(1);

                            	    if ( (LA38_0==NL) ) {
                            	        alt38=1;
                            	    }
                            	    switch (alt38) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:393:63: NL
                            	            {
                            	            NL88=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2023); if (state.failed) return retval; 
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

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:393:69: ( COMMA ( NL )? )?
                            int alt41=2;
                            int LA41_0 = input.LA(1);

                            if ( (LA41_0==COMMA) ) {
                                alt41=1;
                            }
                            switch (alt41) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:393:70: COMMA ( NL )?
                                    {
                                    COMMA89=(Token)match(input,COMMA,FOLLOW_COMMA_in_primitive_pattern2029); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_COMMA.add(COMMA89);

                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:393:76: ( NL )?
                                    int alt40=2;
                                    int LA40_0 = input.LA(1);

                                    if ( (LA40_0==NL) ) {
                                        alt40=1;
                                    }
                                    switch (alt40) {
                                        case 1 :
                                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:393:76: NL
                                            {
                                            NL90=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2031); if (state.failed) return retval; 
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

                    char_literal91=(Token)match(input,ROUND_BRACKET_CLOSE,FOLLOW_ROUND_BRACKET_CLOSE_in_primitive_pattern2038); if (state.failed) return retval; 
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
                    // 394:5: -> ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( bracket_pattern )* ) )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:394:8: ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( bracket_pattern )* ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ROUND_LIST, "ROUND_LIST"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:394:21: ^( NIL_TOKEN ( COMMA )* )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_2);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:394:33: ( COMMA )*
                        while ( stream_COMMA.hasNext() ) {
                            adaptor.addChild(root_2, stream_COMMA.nextNode());

                        }
                        stream_COMMA.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:394:41: ^( NIL_TOKEN ( bracket_pattern )* )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_2);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:394:53: ( bracket_pattern )*
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:395:4: '{' ( NL )? ( mselem_pattern ( NL )? ( COMMA ( NL )? mselem_pattern ( NL )? )* )? '}'
                    {
                    char_literal92=(Token)match(input,CURLY_BRACKET_OPEN,FOLLOW_CURLY_BRACKET_OPEN_in_primitive_pattern2070); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_OPEN.add(char_literal92);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:395:9: ( NL )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==NL) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:395:9: NL
                            {
                            NL93=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2073); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL93);


                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:395:13: ( mselem_pattern ( NL )? ( COMMA ( NL )? mselem_pattern ( NL )? )* )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==L_begin||(LA48_0>=L_obj && LA48_0<=L_if)||(LA48_0>=L_while && LA48_0<=L_for)||(LA48_0>=L_match && LA48_0<=L_case)||LA48_0==L_val||LA48_0==L_exception||LA48_0==L_try||(LA48_0>=A_infinity && LA48_0<=L_lazy)||(LA48_0>=L_true && LA48_0<=L_nil)||LA48_0==MINUS||LA48_0==A_NOT||LA48_0==U_NOT||(LA48_0>=A_ELLIPSIS && LA48_0<=U_ELLIPSIS)||LA48_0==L_force||(LA48_0>=Constr && LA48_0<=Num)||(LA48_0>=String && LA48_0<=ROUND_BRACKET_OPEN)||LA48_0==SQUARE_BRACKET_OPEN||LA48_0==CURLY_BRACKET_OPEN||LA48_0==UNDERSCORE) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:395:14: mselem_pattern ( NL )? ( COMMA ( NL )? mselem_pattern ( NL )? )*
                            {
                            pushFollow(FOLLOW_mselem_pattern_in_primitive_pattern2077);
                            mselem_pattern94=mselem_pattern();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_mselem_pattern.add(mselem_pattern94.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:395:29: ( NL )?
                            int alt44=2;
                            int LA44_0 = input.LA(1);

                            if ( (LA44_0==NL) ) {
                                alt44=1;
                            }
                            switch (alt44) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:395:29: NL
                                    {
                                    NL95=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2079); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL95);


                                    }
                                    break;

                            }

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:395:33: ( COMMA ( NL )? mselem_pattern ( NL )? )*
                            loop47:
                            do {
                                int alt47=2;
                                int LA47_0 = input.LA(1);

                                if ( (LA47_0==COMMA) ) {
                                    alt47=1;
                                }


                                switch (alt47) {
                            	case 1 :
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:395:35: COMMA ( NL )? mselem_pattern ( NL )?
                            	    {
                            	    COMMA96=(Token)match(input,COMMA,FOLLOW_COMMA_in_primitive_pattern2084); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA96);

                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:395:42: ( NL )?
                            	    int alt45=2;
                            	    int LA45_0 = input.LA(1);

                            	    if ( (LA45_0==NL) ) {
                            	        alt45=1;
                            	    }
                            	    switch (alt45) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:395:42: NL
                            	            {
                            	            NL97=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2087); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL97);


                            	            }
                            	            break;

                            	    }

                            	    pushFollow(FOLLOW_mselem_pattern_in_primitive_pattern2090);
                            	    mselem_pattern98=mselem_pattern();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_mselem_pattern.add(mselem_pattern98.getTree());
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:395:61: ( NL )?
                            	    int alt46=2;
                            	    int LA46_0 = input.LA(1);

                            	    if ( (LA46_0==NL) ) {
                            	        alt46=1;
                            	    }
                            	    switch (alt46) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:395:61: NL
                            	            {
                            	            NL99=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2092); if (state.failed) return retval; 
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

                    char_literal100=(Token)match(input,CURLY_BRACKET_CLOSE,FOLLOW_CURLY_BRACKET_CLOSE_in_primitive_pattern2100); if (state.failed) return retval; 
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
                    // 396:5: -> ^( MAP_OR_SET_OR_OBJ ( mselem_pattern )* )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:396:8: ^( MAP_OR_SET_OR_OBJ ( mselem_pattern )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MAP_OR_SET_OR_OBJ, "MAP_OR_SET_OR_OBJ"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:396:28: ( mselem_pattern )*
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:397:4: '{' ( NL )? token_ARROW ( NL )? '}'
                    {
                    char_literal101=(Token)match(input,CURLY_BRACKET_OPEN,FOLLOW_CURLY_BRACKET_OPEN_in_primitive_pattern2118); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_OPEN.add(char_literal101);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:397:8: ( NL )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==NL) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:397:8: NL
                            {
                            NL102=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2120); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL102);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_token_ARROW_in_primitive_pattern2123);
                    token_ARROW103=token_ARROW();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_token_ARROW.add(token_ARROW103.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:397:24: ( NL )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==NL) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:397:24: NL
                            {
                            NL104=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2125); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL104);


                            }
                            break;

                    }

                    char_literal105=(Token)match(input,CURLY_BRACKET_CLOSE,FOLLOW_CURLY_BRACKET_CLOSE_in_primitive_pattern2128); if (state.failed) return retval; 
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:402:1: sep : ( NL | SC )+ ;
    public final babel17Parser.sep_return sep() throws RecognitionException {
        babel17Parser.sep_return retval = new babel17Parser.sep_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set106=null;

        CommonTree set106_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:402:5: ( ( NL | SC )+ )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:402:7: ( NL | SC )+
            {
            root_0 = (CommonTree)adaptor.nil();

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:402:7: ( NL | SC )+
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:404:1: block : ( ( sep )? statement ( sep statement )* ( sep )? -> ^( BLOCK ( statement )* ) | ( sep )? -> ^( BLOCK ) );
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:404:8: ( ( sep )? statement ( sep statement )* ( sep )? -> ^( BLOCK ( statement )* ) | ( sep )? -> ^( BLOCK ) )
            int alt57=2;
            alt57 = dfa57.predict(input);
            switch (alt57) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:404:10: ( sep )? statement ( sep statement )* ( sep )?
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:404:10: ( sep )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==SC||LA53_0==NL) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:404:10: sep
                            {
                            pushFollow(FOLLOW_sep_in_block2166);
                            sep107=sep();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_sep.add(sep107.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_statement_in_block2169);
                    statement108=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement108.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:404:25: ( sep statement )*
                    loop54:
                    do {
                        int alt54=2;
                        alt54 = dfa54.predict(input);
                        switch (alt54) {
                    	case 1 :
                    	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:404:26: sep statement
                    	    {
                    	    pushFollow(FOLLOW_sep_in_block2172);
                    	    sep109=sep();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_sep.add(sep109.getTree());
                    	    pushFollow(FOLLOW_statement_in_block2174);
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

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:404:42: ( sep )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==SC||LA55_0==NL) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:404:42: sep
                            {
                            pushFollow(FOLLOW_sep_in_block2178);
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
                    // 404:47: -> ^( BLOCK ( statement )* )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:404:50: ^( BLOCK ( statement )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:404:58: ( statement )*
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:405:4: ( sep )?
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:405:4: ( sep )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==SC||LA56_0==NL) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:405:4: sep
                            {
                            pushFollow(FOLLOW_sep_in_block2194);
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
                    // 405:9: -> ^( BLOCK )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:405:12: ^( BLOCK )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:407:1: pure_block : statement ( sep statement )* -> ^( BLOCK ( statement )* ) ;
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:408:2: ( statement ( sep statement )* -> ^( BLOCK ( statement )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:408:4: statement ( sep statement )*
            {
            pushFollow(FOLLOW_statement_in_pure_block2211);
            statement113=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statement.add(statement113.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:408:14: ( sep statement )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==NL) ) {
                    int LA58_1 = input.LA(2);

                    if ( (LA58_1==L_begin||(LA58_1>=L_obj && LA58_1<=L_if)||(LA58_1>=L_while && LA58_1<=L_for)||(LA58_1>=L_yield && LA58_1<=L_match)||(LA58_1>=L_val && LA58_1<=L_def)||LA58_1==L_exception||LA58_1==L_try||(LA58_1>=A_infinity && LA58_1<=L_nil)||LA58_1==SC||LA58_1==MINUS||LA58_1==A_NOT||LA58_1==U_NOT||(LA58_1>=A_ELLIPSIS && LA58_1<=U_ELLIPSIS)||LA58_1==L_force||(LA58_1>=NL && LA58_1<=Num)||(LA58_1>=String && LA58_1<=ROUND_BRACKET_OPEN)||LA58_1==SQUARE_BRACKET_OPEN||LA58_1==CURLY_BRACKET_OPEN||(LA58_1>=UNDERSCORE && LA58_1<=PRAGMA_PROFILE)) ) {
                        alt58=1;
                    }


                }
                else if ( (LA58_0==SC) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:408:15: sep statement
            	    {
            	    pushFollow(FOLLOW_sep_in_pure_block2214);
            	    sep114=sep();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_sep.add(sep114.getTree());
            	    pushFollow(FOLLOW_statement_in_pure_block2216);
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
            // 408:31: -> ^( BLOCK ( statement )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:408:34: ^( BLOCK ( statement )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:408:42: ( statement )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:410:1: statement : ( st_val | st_def | st_memoize | st_yield | expr_or_assign | PRAGMA_PRINT expr -> ^( PRAGMA_PRINT expr ) | PRAGMA_LOG expr -> ^( PRAGMA_LOG expr ) | PRAGMA_PROFILE expr -> ^( PRAGMA_PROFILE expr ) | PRAGMA_ASSERT expr -> ^( PRAGMA_ASSERT expr ) );
    public final babel17Parser.statement_return statement() throws RecognitionException {
        babel17Parser.statement_return retval = new babel17Parser.statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PRAGMA_PRINT121=null;
        Token PRAGMA_LOG123=null;
        Token PRAGMA_PROFILE125=null;
        Token PRAGMA_ASSERT127=null;
        babel17Parser.st_val_return st_val116 = null;

        babel17Parser.st_def_return st_def117 = null;

        babel17Parser.st_memoize_return st_memoize118 = null;

        babel17Parser.st_yield_return st_yield119 = null;

        babel17Parser.expr_or_assign_return expr_or_assign120 = null;

        babel17Parser.expr_return expr122 = null;

        babel17Parser.expr_return expr124 = null;

        babel17Parser.expr_return expr126 = null;

        babel17Parser.expr_return expr128 = null;


        CommonTree PRAGMA_PRINT121_tree=null;
        CommonTree PRAGMA_LOG123_tree=null;
        CommonTree PRAGMA_PROFILE125_tree=null;
        CommonTree PRAGMA_ASSERT127_tree=null;
        RewriteRuleTokenStream stream_PRAGMA_PROFILE=new RewriteRuleTokenStream(adaptor,"token PRAGMA_PROFILE");
        RewriteRuleTokenStream stream_PRAGMA_ASSERT=new RewriteRuleTokenStream(adaptor,"token PRAGMA_ASSERT");
        RewriteRuleTokenStream stream_PRAGMA_LOG=new RewriteRuleTokenStream(adaptor,"token PRAGMA_LOG");
        RewriteRuleTokenStream stream_PRAGMA_PRINT=new RewriteRuleTokenStream(adaptor,"token PRAGMA_PRINT");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:411:2: ( st_val | st_def | st_memoize | st_yield | expr_or_assign | PRAGMA_PRINT expr -> ^( PRAGMA_PRINT expr ) | PRAGMA_LOG expr -> ^( PRAGMA_LOG expr ) | PRAGMA_PROFILE expr -> ^( PRAGMA_PROFILE expr ) | PRAGMA_ASSERT expr -> ^( PRAGMA_ASSERT expr ) )
            int alt59=9;
            alt59 = dfa59.predict(input);
            switch (alt59) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:411:4: st_val
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_st_val_in_statement2237);
                    st_val116=st_val();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, st_val116.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:412:4: st_def
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_st_def_in_statement2242);
                    st_def117=st_def();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, st_def117.getTree());

                    }
                    break;
                case 3 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:413:4: st_memoize
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_st_memoize_in_statement2247);
                    st_memoize118=st_memoize();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, st_memoize118.getTree());

                    }
                    break;
                case 4 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:414:4: st_yield
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_st_yield_in_statement2252);
                    st_yield119=st_yield();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, st_yield119.getTree());

                    }
                    break;
                case 5 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:415:4: expr_or_assign
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_expr_or_assign_in_statement2257);
                    expr_or_assign120=expr_or_assign();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_or_assign120.getTree());

                    }
                    break;
                case 6 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:416:5: PRAGMA_PRINT expr
                    {
                    PRAGMA_PRINT121=(Token)match(input,PRAGMA_PRINT,FOLLOW_PRAGMA_PRINT_in_statement2263); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PRAGMA_PRINT.add(PRAGMA_PRINT121);

                    pushFollow(FOLLOW_expr_in_statement2265);
                    expr122=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr122.getTree());


                    // AST REWRITE
                    // elements: PRAGMA_PRINT, expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 416:23: -> ^( PRAGMA_PRINT expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:416:26: ^( PRAGMA_PRINT expr )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_PRAGMA_PRINT.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:417:5: PRAGMA_LOG expr
                    {
                    PRAGMA_LOG123=(Token)match(input,PRAGMA_LOG,FOLLOW_PRAGMA_LOG_in_statement2279); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PRAGMA_LOG.add(PRAGMA_LOG123);

                    pushFollow(FOLLOW_expr_in_statement2281);
                    expr124=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr124.getTree());


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
                    // 417:21: -> ^( PRAGMA_LOG expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:417:24: ^( PRAGMA_LOG expr )
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
                case 8 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:418:5: PRAGMA_PROFILE expr
                    {
                    PRAGMA_PROFILE125=(Token)match(input,PRAGMA_PROFILE,FOLLOW_PRAGMA_PROFILE_in_statement2295); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PRAGMA_PROFILE.add(PRAGMA_PROFILE125);

                    pushFollow(FOLLOW_expr_in_statement2297);
                    expr126=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr126.getTree());


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
                    // 418:25: -> ^( PRAGMA_PROFILE expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:418:28: ^( PRAGMA_PROFILE expr )
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
                case 9 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:419:5: PRAGMA_ASSERT expr
                    {
                    PRAGMA_ASSERT127=(Token)match(input,PRAGMA_ASSERT,FOLLOW_PRAGMA_ASSERT_in_statement2311); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PRAGMA_ASSERT.add(PRAGMA_ASSERT127);

                    pushFollow(FOLLOW_expr_in_statement2313);
                    expr128=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr128.getTree());


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
                    // 419:24: -> ^( PRAGMA_ASSERT expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:419:27: ^( PRAGMA_ASSERT expr )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:421:1: objelem_assign : Id PERIOD Id -> ^( OBJELEM_ASSIGN Id Id ) ;
    public final babel17Parser.objelem_assign_return objelem_assign() throws RecognitionException {
        babel17Parser.objelem_assign_return retval = new babel17Parser.objelem_assign_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Id129=null;
        Token PERIOD130=null;
        Token Id131=null;

        CommonTree Id129_tree=null;
        CommonTree PERIOD130_tree=null;
        CommonTree Id131_tree=null;
        RewriteRuleTokenStream stream_Id=new RewriteRuleTokenStream(adaptor,"token Id");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:422:2: ( Id PERIOD Id -> ^( OBJELEM_ASSIGN Id Id ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:422:4: Id PERIOD Id
            {
            Id129=(Token)match(input,Id,FOLLOW_Id_in_objelem_assign2331); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Id.add(Id129);

            PERIOD130=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_objelem_assign2333); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD130);

            Id131=(Token)match(input,Id,FOLLOW_Id_in_objelem_assign2335); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Id.add(Id131);



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
            // 422:17: -> ^( OBJELEM_ASSIGN Id Id )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:422:20: ^( OBJELEM_ASSIGN Id Id )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:424:1: st_val : L_val ( NL )? ( pattern | objelem_assign ) ( NL )? '=' ( NL )? expr -> ^( VAL ( pattern )* ( objelem_assign )* expr ) ;
    public final babel17Parser.st_val_return st_val() throws RecognitionException {
        babel17Parser.st_val_return retval = new babel17Parser.st_val_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_val132=null;
        Token NL133=null;
        Token NL136=null;
        Token char_literal137=null;
        Token NL138=null;
        babel17Parser.pattern_return pattern134 = null;

        babel17Parser.objelem_assign_return objelem_assign135 = null;

        babel17Parser.expr_return expr139 = null;


        CommonTree L_val132_tree=null;
        CommonTree NL133_tree=null;
        CommonTree NL136_tree=null;
        CommonTree char_literal137_tree=null;
        CommonTree NL138_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_val=new RewriteRuleTokenStream(adaptor,"token L_val");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_objelem_assign=new RewriteRuleSubtreeStream(adaptor,"rule objelem_assign");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:424:8: ( L_val ( NL )? ( pattern | objelem_assign ) ( NL )? '=' ( NL )? expr -> ^( VAL ( pattern )* ( objelem_assign )* expr ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:424:10: L_val ( NL )? ( pattern | objelem_assign ) ( NL )? '=' ( NL )? expr
            {
            L_val132=(Token)match(input,L_val,FOLLOW_L_val_in_st_val2354); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_val.add(L_val132);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:424:16: ( NL )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==NL) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:424:16: NL
                    {
                    NL133=(Token)match(input,NL,FOLLOW_NL_in_st_val2356); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL133);


                    }
                    break;

            }

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:424:20: ( pattern | objelem_assign )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:424:21: pattern
                    {
                    pushFollow(FOLLOW_pattern_in_st_val2360);
                    pattern134=pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pattern.add(pattern134.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:424:31: objelem_assign
                    {
                    pushFollow(FOLLOW_objelem_assign_in_st_val2364);
                    objelem_assign135=objelem_assign();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_objelem_assign.add(objelem_assign135.getTree());

                    }
                    break;

            }

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:424:47: ( NL )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==NL) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:424:47: NL
                    {
                    NL136=(Token)match(input,NL,FOLLOW_NL_in_st_val2367); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL136);


                    }
                    break;

            }

            char_literal137=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_st_val2370); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal137);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:424:55: ( NL )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==NL) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:424:55: NL
                    {
                    NL138=(Token)match(input,NL,FOLLOW_NL_in_st_val2372); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL138);


                    }
                    break;

            }

            pushFollow(FOLLOW_expr_in_st_val2375);
            expr139=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr139.getTree());


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
            // 424:64: -> ^( VAL ( pattern )* ( objelem_assign )* expr )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:424:67: ^( VAL ( pattern )* ( objelem_assign )* expr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VAL, "VAL"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:424:73: ( pattern )*
                while ( stream_pattern.hasNext() ) {
                    adaptor.addChild(root_1, stream_pattern.nextTree());

                }
                stream_pattern.reset();
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:424:82: ( objelem_assign )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:426:1: st_def : L_def ( NL )? Id ( NL )? ( primitive_pattern ( NL )? )? '=' ( NL )? expr -> ^( DEF Id ( primitive_pattern )? expr ) ;
    public final babel17Parser.st_def_return st_def() throws RecognitionException {
        babel17Parser.st_def_return retval = new babel17Parser.st_def_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_def140=null;
        Token NL141=null;
        Token Id142=null;
        Token NL143=null;
        Token NL145=null;
        Token char_literal146=null;
        Token NL147=null;
        babel17Parser.primitive_pattern_return primitive_pattern144 = null;

        babel17Parser.expr_return expr148 = null;


        CommonTree L_def140_tree=null;
        CommonTree NL141_tree=null;
        CommonTree Id142_tree=null;
        CommonTree NL143_tree=null;
        CommonTree NL145_tree=null;
        CommonTree char_literal146_tree=null;
        CommonTree NL147_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_Id=new RewriteRuleTokenStream(adaptor,"token Id");
        RewriteRuleTokenStream stream_L_def=new RewriteRuleTokenStream(adaptor,"token L_def");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_primitive_pattern=new RewriteRuleSubtreeStream(adaptor,"rule primitive_pattern");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:426:8: ( L_def ( NL )? Id ( NL )? ( primitive_pattern ( NL )? )? '=' ( NL )? expr -> ^( DEF Id ( primitive_pattern )? expr ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:426:10: L_def ( NL )? Id ( NL )? ( primitive_pattern ( NL )? )? '=' ( NL )? expr
            {
            L_def140=(Token)match(input,L_def,FOLLOW_L_def_in_st_def2399); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_def.add(L_def140);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:426:16: ( NL )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==NL) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:426:16: NL
                    {
                    NL141=(Token)match(input,NL,FOLLOW_NL_in_st_def2401); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL141);


                    }
                    break;

            }

            Id142=(Token)match(input,Id,FOLLOW_Id_in_st_def2404); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Id.add(Id142);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:426:23: ( NL )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==NL) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:426:23: NL
                    {
                    NL143=(Token)match(input,NL,FOLLOW_NL_in_st_def2406); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL143);


                    }
                    break;

            }

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:426:27: ( primitive_pattern ( NL )? )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( ((LA67_0>=A_infinity && LA67_0<=U_infinity)||(LA67_0>=L_true && LA67_0<=L_false)||LA67_0==L_nil||LA67_0==MINUS||(LA67_0>=Id && LA67_0<=Num)||(LA67_0>=String && LA67_0<=ROUND_BRACKET_OPEN)||LA67_0==SQUARE_BRACKET_OPEN||LA67_0==CURLY_BRACKET_OPEN||LA67_0==UNDERSCORE) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:426:28: primitive_pattern ( NL )?
                    {
                    pushFollow(FOLLOW_primitive_pattern_in_st_def2410);
                    primitive_pattern144=primitive_pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primitive_pattern.add(primitive_pattern144.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:426:46: ( NL )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==NL) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:426:46: NL
                            {
                            NL145=(Token)match(input,NL,FOLLOW_NL_in_st_def2412); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL145);


                            }
                            break;

                    }


                    }
                    break;

            }

            char_literal146=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_st_def2417); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal146);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:426:56: ( NL )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==NL) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:426:56: NL
                    {
                    NL147=(Token)match(input,NL,FOLLOW_NL_in_st_def2419); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL147);


                    }
                    break;

            }

            pushFollow(FOLLOW_expr_in_st_def2422);
            expr148=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr148.getTree());


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
            // 427:5: -> ^( DEF Id ( primitive_pattern )? expr )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:427:8: ^( DEF Id ( primitive_pattern )? expr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DEF, "DEF"), root_1);

                adaptor.addChild(root_1, stream_Id.nextNode());
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:427:17: ( primitive_pattern )?
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:429:1: st_yield : L_yield expr -> ^( YIELD expr ) ;
    public final babel17Parser.st_yield_return st_yield() throws RecognitionException {
        babel17Parser.st_yield_return retval = new babel17Parser.st_yield_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_yield149=null;
        babel17Parser.expr_return expr150 = null;


        CommonTree L_yield149_tree=null;
        RewriteRuleTokenStream stream_L_yield=new RewriteRuleTokenStream(adaptor,"token L_yield");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:429:9: ( L_yield expr -> ^( YIELD expr ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:429:11: L_yield expr
            {
            L_yield149=(Token)match(input,L_yield,FOLLOW_L_yield_in_st_yield2451); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_yield.add(L_yield149);

            pushFollow(FOLLOW_expr_in_st_yield2453);
            expr150=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr150.getTree());


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
            // 429:24: -> ^( YIELD expr )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:429:27: ^( YIELD expr )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:431:1: st_memoize : L_memoize ( memid )+ -> ^( MEMOIZE ( memid )* ) ;
    public final babel17Parser.st_memoize_return st_memoize() throws RecognitionException {
        babel17Parser.st_memoize_return retval = new babel17Parser.st_memoize_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_memoize151=null;
        babel17Parser.memid_return memid152 = null;


        CommonTree L_memoize151_tree=null;
        RewriteRuleTokenStream stream_L_memoize=new RewriteRuleTokenStream(adaptor,"token L_memoize");
        RewriteRuleSubtreeStream stream_memid=new RewriteRuleSubtreeStream(adaptor,"rule memid");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:432:2: ( L_memoize ( memid )+ -> ^( MEMOIZE ( memid )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:432:4: L_memoize ( memid )+
            {
            L_memoize151=(Token)match(input,L_memoize,FOLLOW_L_memoize_in_st_memoize2471); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_memoize.add(L_memoize151);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:432:14: ( memid )+
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
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:432:14: memid
            	    {
            	    pushFollow(FOLLOW_memid_in_st_memoize2473);
            	    memid152=memid();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_memid.add(memid152.getTree());

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
            // 433:5: -> ^( MEMOIZE ( memid )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:433:8: ^( MEMOIZE ( memid )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MEMOIZE, "MEMOIZE"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:433:18: ( memid )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:435:1: memid : ( Id -> ^( MEM_STRONG Id ) | '(' Id ')' -> ^( MEM_WEAK Id ) );
    public final babel17Parser.memid_return memid() throws RecognitionException {
        babel17Parser.memid_return retval = new babel17Parser.memid_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Id153=null;
        Token char_literal154=null;
        Token Id155=null;
        Token char_literal156=null;

        CommonTree Id153_tree=null;
        CommonTree char_literal154_tree=null;
        CommonTree Id155_tree=null;
        CommonTree char_literal156_tree=null;
        RewriteRuleTokenStream stream_ROUND_BRACKET_OPEN=new RewriteRuleTokenStream(adaptor,"token ROUND_BRACKET_OPEN");
        RewriteRuleTokenStream stream_ROUND_BRACKET_CLOSE=new RewriteRuleTokenStream(adaptor,"token ROUND_BRACKET_CLOSE");
        RewriteRuleTokenStream stream_Id=new RewriteRuleTokenStream(adaptor,"token Id");

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:435:7: ( Id -> ^( MEM_STRONG Id ) | '(' Id ')' -> ^( MEM_WEAK Id ) )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:435:9: Id
                    {
                    Id153=(Token)match(input,Id,FOLLOW_Id_in_memid2497); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Id.add(Id153);



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
                    // 435:12: -> ^( MEM_STRONG Id )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:435:15: ^( MEM_STRONG Id )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:436:4: '(' Id ')'
                    {
                    char_literal154=(Token)match(input,ROUND_BRACKET_OPEN,FOLLOW_ROUND_BRACKET_OPEN_in_memid2510); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ROUND_BRACKET_OPEN.add(char_literal154);

                    Id155=(Token)match(input,Id,FOLLOW_Id_in_memid2512); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Id.add(Id155);

                    char_literal156=(Token)match(input,ROUND_BRACKET_CLOSE,FOLLOW_ROUND_BRACKET_CLOSE_in_memid2514); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ROUND_BRACKET_CLOSE.add(char_literal156);



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
                    // 436:15: -> ^( MEM_WEAK Id )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:436:18: ^( MEM_WEAK Id )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:439:1: expr_or_assign : ( ( ( pattern | objelem_assign ) ( NL )? '=' )=> ( pattern | objelem_assign ) ( NL )? '=' ( NL )? expr -> ^( ASSIGN ( pattern )* ( objelem_assign )* expr ) | expr );
    public final babel17Parser.expr_or_assign_return expr_or_assign() throws RecognitionException {
        babel17Parser.expr_or_assign_return retval = new babel17Parser.expr_or_assign_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL159=null;
        Token char_literal160=null;
        Token NL161=null;
        babel17Parser.pattern_return pattern157 = null;

        babel17Parser.objelem_assign_return objelem_assign158 = null;

        babel17Parser.expr_return expr162 = null;

        babel17Parser.expr_return expr163 = null;


        CommonTree NL159_tree=null;
        CommonTree char_literal160_tree=null;
        CommonTree NL161_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_objelem_assign=new RewriteRuleSubtreeStream(adaptor,"rule objelem_assign");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:440:2: ( ( ( pattern | objelem_assign ) ( NL )? '=' )=> ( pattern | objelem_assign ) ( NL )? '=' ( NL )? expr -> ^( ASSIGN ( pattern )* ( objelem_assign )* expr ) | expr )
            int alt74=2;
            alt74 = dfa74.predict(input);
            switch (alt74) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:440:4: ( ( pattern | objelem_assign ) ( NL )? '=' )=> ( pattern | objelem_assign ) ( NL )? '=' ( NL )? expr
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:440:44: ( pattern | objelem_assign )
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
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:440:45: pattern
                            {
                            pushFollow(FOLLOW_pattern_in_expr_or_assign2554);
                            pattern157=pattern();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_pattern.add(pattern157.getTree());

                            }
                            break;
                        case 2 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:440:55: objelem_assign
                            {
                            pushFollow(FOLLOW_objelem_assign_in_expr_or_assign2558);
                            objelem_assign158=objelem_assign();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_objelem_assign.add(objelem_assign158.getTree());

                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:440:71: ( NL )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==NL) ) {
                        alt72=1;
                    }
                    switch (alt72) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:440:71: NL
                            {
                            NL159=(Token)match(input,NL,FOLLOW_NL_in_expr_or_assign2561); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL159);


                            }
                            break;

                    }

                    char_literal160=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_expr_or_assign2564); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal160);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:440:79: ( NL )?
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==NL) ) {
                        alt73=1;
                    }
                    switch (alt73) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:440:79: NL
                            {
                            NL161=(Token)match(input,NL,FOLLOW_NL_in_expr_or_assign2566); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL161);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_expr_in_expr_or_assign2569);
                    expr162=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr162.getTree());


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
                    // 440:88: -> ^( ASSIGN ( pattern )* ( objelem_assign )* expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:440:91: ^( ASSIGN ( pattern )* ( objelem_assign )* expr )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASSIGN, "ASSIGN"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:440:100: ( pattern )*
                        while ( stream_pattern.hasNext() ) {
                            adaptor.addChild(root_1, stream_pattern.nextTree());

                        }
                        stream_pattern.reset();
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:440:109: ( objelem_assign )*
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:441:4: expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_expr_in_expr_or_assign2588);
                    expr163=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr163.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:443:1: expr : ( lop_expr | obj_expr );
    public final babel17Parser.expr_return expr() throws RecognitionException {
        babel17Parser.expr_return retval = new babel17Parser.expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.lop_expr_return lop_expr164 = null;

        babel17Parser.obj_expr_return obj_expr165 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:444:2: ( lop_expr | obj_expr )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==L_begin||(LA75_0>=L_with && LA75_0<=L_if)||(LA75_0>=L_while && LA75_0<=L_for)||LA75_0==L_match||LA75_0==L_exception||LA75_0==L_try||(LA75_0>=A_infinity && LA75_0<=L_lazy)||(LA75_0>=L_true && LA75_0<=L_nil)||LA75_0==MINUS||LA75_0==A_NOT||LA75_0==U_NOT||(LA75_0>=A_ELLIPSIS && LA75_0<=U_ELLIPSIS)||LA75_0==L_force||(LA75_0>=Constr && LA75_0<=Num)||(LA75_0>=String && LA75_0<=ROUND_BRACKET_OPEN)||LA75_0==SQUARE_BRACKET_OPEN||LA75_0==CURLY_BRACKET_OPEN||LA75_0==UNDERSCORE) ) {
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:444:4: lop_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_lop_expr_in_expr2599);
                    lop_expr164=lop_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lop_expr164.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:445:4: obj_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_obj_expr_in_expr2604);
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
    // $ANTLR end "expr"

    public static class control_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "control_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:447:1: control_expr : ( if_expr | while_do_expr | match_expr | for_expr | try_expr | begin_end );
    public final babel17Parser.control_expr_return control_expr() throws RecognitionException {
        babel17Parser.control_expr_return retval = new babel17Parser.control_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.if_expr_return if_expr166 = null;

        babel17Parser.while_do_expr_return while_do_expr167 = null;

        babel17Parser.match_expr_return match_expr168 = null;

        babel17Parser.for_expr_return for_expr169 = null;

        babel17Parser.try_expr_return try_expr170 = null;

        babel17Parser.begin_end_return begin_end171 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:448:2: ( if_expr | while_do_expr | match_expr | for_expr | try_expr | begin_end )
            int alt76=6;
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
            case L_try:
                {
                alt76=5;
                }
                break;
            case L_begin:
                {
                alt76=6;
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:448:4: if_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_if_expr_in_control_expr2614);
                    if_expr166=if_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, if_expr166.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:449:4: while_do_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_while_do_expr_in_control_expr2619);
                    while_do_expr167=while_do_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, while_do_expr167.getTree());

                    }
                    break;
                case 3 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:450:4: match_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_match_expr_in_control_expr2624);
                    match_expr168=match_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, match_expr168.getTree());

                    }
                    break;
                case 4 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:451:4: for_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_for_expr_in_control_expr2629);
                    for_expr169=for_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, for_expr169.getTree());

                    }
                    break;
                case 5 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:452:5: try_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_try_expr_in_control_expr2635);
                    try_expr170=try_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, try_expr170.getTree());

                    }
                    break;
                case 6 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:453:4: begin_end
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_begin_end_in_control_expr2640);
                    begin_end171=begin_end();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, begin_end171.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:455:1: with_control_expr : ( control_expr | L_with ( NL )? protected_expr ( NL )? L_do block L_end -> ^( WITH protected_expr ^( BEGIN block ) ) );
    public final babel17Parser.with_control_expr_return with_control_expr() throws RecognitionException {
        babel17Parser.with_control_expr_return retval = new babel17Parser.with_control_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_with173=null;
        Token NL174=null;
        Token NL176=null;
        Token L_do177=null;
        Token L_end179=null;
        babel17Parser.control_expr_return control_expr172 = null;

        babel17Parser.protected_expr_return protected_expr175 = null;

        babel17Parser.block_return block178 = null;


        CommonTree L_with173_tree=null;
        CommonTree NL174_tree=null;
        CommonTree NL176_tree=null;
        CommonTree L_do177_tree=null;
        CommonTree L_end179_tree=null;
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_do=new RewriteRuleTokenStream(adaptor,"token L_do");
        RewriteRuleTokenStream stream_L_with=new RewriteRuleTokenStream(adaptor,"token L_with");
        RewriteRuleSubtreeStream stream_protected_expr=new RewriteRuleSubtreeStream(adaptor,"rule protected_expr");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:456:2: ( control_expr | L_with ( NL )? protected_expr ( NL )? L_do block L_end -> ^( WITH protected_expr ^( BEGIN block ) ) )
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==L_begin||LA79_0==L_if||(LA79_0>=L_while && LA79_0<=L_for)||LA79_0==L_match||LA79_0==L_try) ) {
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:456:4: control_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_control_expr_in_with_control_expr2650);
                    control_expr172=control_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, control_expr172.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:457:4: L_with ( NL )? protected_expr ( NL )? L_do block L_end
                    {
                    L_with173=(Token)match(input,L_with,FOLLOW_L_with_in_with_control_expr2655); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_with.add(L_with173);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:457:11: ( NL )?
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==NL) ) {
                        alt77=1;
                    }
                    switch (alt77) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:457:11: NL
                            {
                            NL174=(Token)match(input,NL,FOLLOW_NL_in_with_control_expr2657); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL174);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_protected_expr_in_with_control_expr2660);
                    protected_expr175=protected_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr175.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:457:30: ( NL )?
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==NL) ) {
                        alt78=1;
                    }
                    switch (alt78) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:457:30: NL
                            {
                            NL176=(Token)match(input,NL,FOLLOW_NL_in_with_control_expr2662); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL176);


                            }
                            break;

                    }

                    L_do177=(Token)match(input,L_do,FOLLOW_L_do_in_with_control_expr2665); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_do.add(L_do177);

                    pushFollow(FOLLOW_block_in_with_control_expr2667);
                    block178=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block178.getTree());
                    L_end179=(Token)match(input,L_end,FOLLOW_L_end_in_with_control_expr2669); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_end.add(L_end179);



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
                    // 457:51: -> ^( WITH protected_expr ^( BEGIN block ) )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:457:54: ^( WITH protected_expr ^( BEGIN block ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(WITH, "WITH"), root_1);

                        adaptor.addChild(root_1, stream_protected_expr.nextTree());
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:457:76: ^( BEGIN block )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:460:1: protected_expr : ( p_lop_expr | obj_expr );
    public final babel17Parser.protected_expr_return protected_expr() throws RecognitionException {
        babel17Parser.protected_expr_return retval = new babel17Parser.protected_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.p_lop_expr_return p_lop_expr180 = null;

        babel17Parser.obj_expr_return obj_expr181 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:461:2: ( p_lop_expr | obj_expr )
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==L_begin||(LA80_0>=L_with && LA80_0<=L_if)||(LA80_0>=L_while && LA80_0<=L_for)||(LA80_0>=L_match && LA80_0<=L_case)||LA80_0==L_exception||LA80_0==L_try||(LA80_0>=A_infinity && LA80_0<=L_lazy)||(LA80_0>=L_true && LA80_0<=L_nil)||LA80_0==MINUS||LA80_0==A_NOT||LA80_0==U_NOT||(LA80_0>=A_ELLIPSIS && LA80_0<=U_ELLIPSIS)||LA80_0==L_force||(LA80_0>=Constr && LA80_0<=Num)||(LA80_0>=String && LA80_0<=ROUND_BRACKET_OPEN)||LA80_0==SQUARE_BRACKET_OPEN||LA80_0==CURLY_BRACKET_OPEN||LA80_0==UNDERSCORE) ) {
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:461:4: p_lop_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_p_lop_expr_in_protected_expr2694);
                    p_lop_expr180=p_lop_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_lop_expr180.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:462:4: obj_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_obj_expr_in_protected_expr2699);
                    obj_expr181=obj_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, obj_expr181.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:465:1: begin_end : L_begin block L_end -> ^( BEGIN block ) ;
    public final babel17Parser.begin_end_return begin_end() throws RecognitionException {
        babel17Parser.begin_end_return retval = new babel17Parser.begin_end_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_begin182=null;
        Token L_end184=null;
        babel17Parser.block_return block183 = null;


        CommonTree L_begin182_tree=null;
        CommonTree L_end184_tree=null;
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleTokenStream stream_L_begin=new RewriteRuleTokenStream(adaptor,"token L_begin");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:466:2: ( L_begin block L_end -> ^( BEGIN block ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:466:4: L_begin block L_end
            {
            L_begin182=(Token)match(input,L_begin,FOLLOW_L_begin_in_begin_end2711); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_begin.add(L_begin182);

            pushFollow(FOLLOW_block_in_begin_end2713);
            block183=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block183.getTree());
            L_end184=(Token)match(input,L_end,FOLLOW_L_end_in_begin_end2715); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_end.add(L_end184);



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
            // 466:24: -> ^( BEGIN block )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:466:27: ^( BEGIN block )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:469:1: parents : ( '+' primitive_expr -> ^( PARENTS_PLUS primitive_expr ) | '*' primitive_expr -> ^( PARENTS_MUL primitive_expr ) );
    public final babel17Parser.parents_return parents() throws RecognitionException {
        babel17Parser.parents_return retval = new babel17Parser.parents_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal185=null;
        Token char_literal187=null;
        babel17Parser.primitive_expr_return primitive_expr186 = null;

        babel17Parser.primitive_expr_return primitive_expr188 = null;


        CommonTree char_literal185_tree=null;
        CommonTree char_literal187_tree=null;
        RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
        RewriteRuleTokenStream stream_TIMES=new RewriteRuleTokenStream(adaptor,"token TIMES");
        RewriteRuleSubtreeStream stream_primitive_expr=new RewriteRuleSubtreeStream(adaptor,"rule primitive_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:469:9: ( '+' primitive_expr -> ^( PARENTS_PLUS primitive_expr ) | '*' primitive_expr -> ^( PARENTS_MUL primitive_expr ) )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:469:11: '+' primitive_expr
                    {
                    char_literal185=(Token)match(input,PLUS,FOLLOW_PLUS_in_parents2733); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PLUS.add(char_literal185);

                    pushFollow(FOLLOW_primitive_expr_in_parents2735);
                    primitive_expr186=primitive_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primitive_expr.add(primitive_expr186.getTree());


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
                    // 469:30: -> ^( PARENTS_PLUS primitive_expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:469:33: ^( PARENTS_PLUS primitive_expr )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:470:4: '*' primitive_expr
                    {
                    char_literal187=(Token)match(input,TIMES,FOLLOW_TIMES_in_parents2748); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TIMES.add(char_literal187);

                    pushFollow(FOLLOW_primitive_expr_in_parents2750);
                    primitive_expr188=primitive_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primitive_expr.add(primitive_expr188.getTree());


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
                    // 470:23: -> ^( PARENTS_MUL primitive_expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:470:26: ^( PARENTS_MUL primitive_expr )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:473:1: obj_expr : ( ( L_obj ( NL )? parents )=> L_obj ( NL )? parents block L_end -> ^( OBJ block parents ) | L_obj block L_end -> ^( OBJ block ) );
    public final babel17Parser.obj_expr_return obj_expr() throws RecognitionException {
        babel17Parser.obj_expr_return retval = new babel17Parser.obj_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_obj189=null;
        Token NL190=null;
        Token L_end193=null;
        Token L_obj194=null;
        Token L_end196=null;
        babel17Parser.parents_return parents191 = null;

        babel17Parser.block_return block192 = null;

        babel17Parser.block_return block195 = null;


        CommonTree L_obj189_tree=null;
        CommonTree NL190_tree=null;
        CommonTree L_end193_tree=null;
        CommonTree L_obj194_tree=null;
        CommonTree L_end196_tree=null;
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_obj=new RewriteRuleTokenStream(adaptor,"token L_obj");
        RewriteRuleSubtreeStream stream_parents=new RewriteRuleSubtreeStream(adaptor,"rule parents");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:473:9: ( ( L_obj ( NL )? parents )=> L_obj ( NL )? parents block L_end -> ^( OBJ block parents ) | L_obj block L_end -> ^( OBJ block ) )
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==L_obj) ) {
                int LA83_1 = input.LA(2);

                if ( (LA83_1==NL) ) {
                    int LA83_2 = input.LA(3);

                    if ( ((LA83_2>=L_begin && LA83_2<=L_if)||(LA83_2>=L_while && LA83_2<=L_for)||(LA83_2>=L_yield && LA83_2<=L_match)||(LA83_2>=L_val && LA83_2<=L_def)||LA83_2==L_exception||LA83_2==L_try||(LA83_2>=A_infinity && LA83_2<=L_nil)||LA83_2==SC||LA83_2==MINUS||LA83_2==A_NOT||LA83_2==U_NOT||(LA83_2>=A_ELLIPSIS && LA83_2<=U_ELLIPSIS)||LA83_2==L_force||(LA83_2>=NL && LA83_2<=Num)||(LA83_2>=String && LA83_2<=ROUND_BRACKET_OPEN)||LA83_2==SQUARE_BRACKET_OPEN||LA83_2==CURLY_BRACKET_OPEN||(LA83_2>=UNDERSCORE && LA83_2<=PRAGMA_PROFILE)) ) {
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
                else if ( ((LA83_1>=L_begin && LA83_1<=L_if)||(LA83_1>=L_while && LA83_1<=L_for)||(LA83_1>=L_yield && LA83_1<=L_match)||(LA83_1>=L_val && LA83_1<=L_def)||LA83_1==L_exception||LA83_1==L_try||(LA83_1>=A_infinity && LA83_1<=L_nil)||LA83_1==SC||LA83_1==MINUS||LA83_1==A_NOT||LA83_1==U_NOT||(LA83_1>=A_ELLIPSIS && LA83_1<=U_ELLIPSIS)||LA83_1==L_force||(LA83_1>=Constr && LA83_1<=Num)||(LA83_1>=String && LA83_1<=ROUND_BRACKET_OPEN)||LA83_1==SQUARE_BRACKET_OPEN||LA83_1==CURLY_BRACKET_OPEN||(LA83_1>=UNDERSCORE && LA83_1<=PRAGMA_PROFILE)) ) {
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:473:11: ( L_obj ( NL )? parents )=> L_obj ( NL )? parents block L_end
                    {
                    L_obj189=(Token)match(input,L_obj,FOLLOW_L_obj_in_obj_expr2778); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_obj.add(L_obj189);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:473:40: ( NL )?
                    int alt82=2;
                    int LA82_0 = input.LA(1);

                    if ( (LA82_0==NL) ) {
                        alt82=1;
                    }
                    switch (alt82) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:473:40: NL
                            {
                            NL190=(Token)match(input,NL,FOLLOW_NL_in_obj_expr2780); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL190);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_parents_in_obj_expr2783);
                    parents191=parents();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parents.add(parents191.getTree());
                    pushFollow(FOLLOW_block_in_obj_expr2785);
                    block192=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block192.getTree());
                    L_end193=(Token)match(input,L_end,FOLLOW_L_end_in_obj_expr2787); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_end.add(L_end193);



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
                    // 473:64: -> ^( OBJ block parents )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:473:67: ^( OBJ block parents )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:474:17: L_obj block L_end
                    {
                    L_obj194=(Token)match(input,L_obj,FOLLOW_L_obj_in_obj_expr2815); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_obj.add(L_obj194);

                    pushFollow(FOLLOW_block_in_obj_expr2817);
                    block195=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block195.getTree());
                    L_end196=(Token)match(input,L_end,FOLLOW_L_end_in_obj_expr2819); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_end.add(L_end196);



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
                    // 474:35: -> ^( OBJ block )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:474:38: ^( OBJ block )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:476:1: lop_expr : ( ( lambda_expr )=> lambda_expr | op_expr );
    public final babel17Parser.lop_expr_return lop_expr() throws RecognitionException {
        babel17Parser.lop_expr_return retval = new babel17Parser.lop_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.lambda_expr_return lambda_expr197 = null;

        babel17Parser.op_expr_return op_expr198 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:477:2: ( ( lambda_expr )=> lambda_expr | op_expr )
            int alt84=2;
            alt84 = dfa84.predict(input);
            switch (alt84) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:477:4: ( lambda_expr )=> lambda_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_lambda_expr_in_lop_expr2847);
                    lambda_expr197=lambda_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lambda_expr197.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:478:4: op_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_op_expr_in_lop_expr2852);
                    op_expr198=op_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, op_expr198.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:480:1: p_lop_expr : ( ( protected_lambda_expr )=> protected_lambda_expr | p_op_expr );
    public final babel17Parser.p_lop_expr_return p_lop_expr() throws RecognitionException {
        babel17Parser.p_lop_expr_return retval = new babel17Parser.p_lop_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.protected_lambda_expr_return protected_lambda_expr199 = null;

        babel17Parser.p_op_expr_return p_op_expr200 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:481:2: ( ( protected_lambda_expr )=> protected_lambda_expr | p_op_expr )
            int alt85=2;
            alt85 = dfa85.predict(input);
            switch (alt85) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:481:4: ( protected_lambda_expr )=> protected_lambda_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_protected_lambda_expr_in_p_lop_expr2868);
                    protected_lambda_expr199=protected_lambda_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, protected_lambda_expr199.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:482:4: p_op_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_p_op_expr_in_p_lop_expr2873);
                    p_op_expr200=p_op_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_op_expr200.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:484:1: if_expr : L_if ( NL )? protected_expr ( NL )? L_then block ( L_elseif ( NL )? protected_expr ( NL )? L_then block )* ( L_else block )? L_end -> ^( IF ( protected_expr )* ( block )* ) ;
    public final babel17Parser.if_expr_return if_expr() throws RecognitionException {
        babel17Parser.if_expr_return retval = new babel17Parser.if_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_if201=null;
        Token NL202=null;
        Token NL204=null;
        Token L_then205=null;
        Token L_elseif207=null;
        Token NL208=null;
        Token NL210=null;
        Token L_then211=null;
        Token L_else213=null;
        Token L_end215=null;
        babel17Parser.protected_expr_return protected_expr203 = null;

        babel17Parser.block_return block206 = null;

        babel17Parser.protected_expr_return protected_expr209 = null;

        babel17Parser.block_return block212 = null;

        babel17Parser.block_return block214 = null;


        CommonTree L_if201_tree=null;
        CommonTree NL202_tree=null;
        CommonTree NL204_tree=null;
        CommonTree L_then205_tree=null;
        CommonTree L_elseif207_tree=null;
        CommonTree NL208_tree=null;
        CommonTree NL210_tree=null;
        CommonTree L_then211_tree=null;
        CommonTree L_else213_tree=null;
        CommonTree L_end215_tree=null;
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleTokenStream stream_L_else=new RewriteRuleTokenStream(adaptor,"token L_else");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_elseif=new RewriteRuleTokenStream(adaptor,"token L_elseif");
        RewriteRuleTokenStream stream_L_then=new RewriteRuleTokenStream(adaptor,"token L_then");
        RewriteRuleTokenStream stream_L_if=new RewriteRuleTokenStream(adaptor,"token L_if");
        RewriteRuleSubtreeStream stream_protected_expr=new RewriteRuleSubtreeStream(adaptor,"rule protected_expr");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:484:9: ( L_if ( NL )? protected_expr ( NL )? L_then block ( L_elseif ( NL )? protected_expr ( NL )? L_then block )* ( L_else block )? L_end -> ^( IF ( protected_expr )* ( block )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:484:11: L_if ( NL )? protected_expr ( NL )? L_then block ( L_elseif ( NL )? protected_expr ( NL )? L_then block )* ( L_else block )? L_end
            {
            L_if201=(Token)match(input,L_if,FOLLOW_L_if_in_if_expr2884); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_if.add(L_if201);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:484:16: ( NL )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==NL) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:484:16: NL
                    {
                    NL202=(Token)match(input,NL,FOLLOW_NL_in_if_expr2886); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL202);


                    }
                    break;

            }

            pushFollow(FOLLOW_protected_expr_in_if_expr2889);
            protected_expr203=protected_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr203.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:484:35: ( NL )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==NL) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:484:35: NL
                    {
                    NL204=(Token)match(input,NL,FOLLOW_NL_in_if_expr2891); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL204);


                    }
                    break;

            }

            L_then205=(Token)match(input,L_then,FOLLOW_L_then_in_if_expr2894); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_then.add(L_then205);

            pushFollow(FOLLOW_block_in_if_expr2896);
            block206=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block206.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:485:3: ( L_elseif ( NL )? protected_expr ( NL )? L_then block )*
            loop90:
            do {
                int alt90=2;
                int LA90_0 = input.LA(1);

                if ( (LA90_0==L_elseif) ) {
                    alt90=1;
                }


                switch (alt90) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:485:4: L_elseif ( NL )? protected_expr ( NL )? L_then block
            	    {
            	    L_elseif207=(Token)match(input,L_elseif,FOLLOW_L_elseif_in_if_expr2902); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_L_elseif.add(L_elseif207);

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:485:13: ( NL )?
            	    int alt88=2;
            	    int LA88_0 = input.LA(1);

            	    if ( (LA88_0==NL) ) {
            	        alt88=1;
            	    }
            	    switch (alt88) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:485:13: NL
            	            {
            	            NL208=(Token)match(input,NL,FOLLOW_NL_in_if_expr2904); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL208);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_protected_expr_in_if_expr2907);
            	    protected_expr209=protected_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr209.getTree());
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:485:32: ( NL )?
            	    int alt89=2;
            	    int LA89_0 = input.LA(1);

            	    if ( (LA89_0==NL) ) {
            	        alt89=1;
            	    }
            	    switch (alt89) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:485:32: NL
            	            {
            	            NL210=(Token)match(input,NL,FOLLOW_NL_in_if_expr2909); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL210);


            	            }
            	            break;

            	    }

            	    L_then211=(Token)match(input,L_then,FOLLOW_L_then_in_if_expr2912); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_L_then.add(L_then211);

            	    pushFollow(FOLLOW_block_in_if_expr2914);
            	    block212=block();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_block.add(block212.getTree());

            	    }
            	    break;

            	default :
            	    break loop90;
                }
            } while (true);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:486:3: ( L_else block )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==L_else) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:486:4: L_else block
                    {
                    L_else213=(Token)match(input,L_else,FOLLOW_L_else_in_if_expr2922); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_else.add(L_else213);

                    pushFollow(FOLLOW_block_in_if_expr2924);
                    block214=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block214.getTree());

                    }
                    break;

            }

            L_end215=(Token)match(input,L_end,FOLLOW_L_end_in_if_expr2928); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_end.add(L_end215);



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
            // 486:26: -> ^( IF ( protected_expr )* ( block )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:486:29: ^( IF ( protected_expr )* ( block )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IF, "IF"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:486:34: ( protected_expr )*
                while ( stream_protected_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_protected_expr.nextTree());

                }
                stream_protected_expr.reset();
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:486:50: ( block )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:488:1: while_do_expr : L_while ( NL )? protected_expr ( NL )? L_do block L_end -> ^( WHILE_DO protected_expr block ) ;
    public final babel17Parser.while_do_expr_return while_do_expr() throws RecognitionException {
        babel17Parser.while_do_expr_return retval = new babel17Parser.while_do_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_while216=null;
        Token NL217=null;
        Token NL219=null;
        Token L_do220=null;
        Token L_end222=null;
        babel17Parser.protected_expr_return protected_expr218 = null;

        babel17Parser.block_return block221 = null;


        CommonTree L_while216_tree=null;
        CommonTree NL217_tree=null;
        CommonTree NL219_tree=null;
        CommonTree L_do220_tree=null;
        CommonTree L_end222_tree=null;
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_do=new RewriteRuleTokenStream(adaptor,"token L_do");
        RewriteRuleTokenStream stream_L_while=new RewriteRuleTokenStream(adaptor,"token L_while");
        RewriteRuleSubtreeStream stream_protected_expr=new RewriteRuleSubtreeStream(adaptor,"rule protected_expr");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:489:2: ( L_while ( NL )? protected_expr ( NL )? L_do block L_end -> ^( WHILE_DO protected_expr block ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:489:4: L_while ( NL )? protected_expr ( NL )? L_do block L_end
            {
            L_while216=(Token)match(input,L_while,FOLLOW_L_while_in_while_do_expr2952); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_while.add(L_while216);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:489:12: ( NL )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==NL) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:489:12: NL
                    {
                    NL217=(Token)match(input,NL,FOLLOW_NL_in_while_do_expr2954); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL217);


                    }
                    break;

            }

            pushFollow(FOLLOW_protected_expr_in_while_do_expr2957);
            protected_expr218=protected_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr218.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:489:31: ( NL )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==NL) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:489:31: NL
                    {
                    NL219=(Token)match(input,NL,FOLLOW_NL_in_while_do_expr2959); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL219);


                    }
                    break;

            }

            L_do220=(Token)match(input,L_do,FOLLOW_L_do_in_while_do_expr2962); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_do.add(L_do220);

            pushFollow(FOLLOW_block_in_while_do_expr2964);
            block221=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block221.getTree());
            L_end222=(Token)match(input,L_end,FOLLOW_L_end_in_while_do_expr2966); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_end.add(L_end222);



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
            // 490:5: -> ^( WHILE_DO protected_expr block )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:490:8: ^( WHILE_DO protected_expr block )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:492:1: cases : ( full_cases | pattern ( NL )? token_DOUBLE_ARROW block -> ^( CASES ^( NIL_TOKEN pattern block ) ) );
    public final babel17Parser.cases_return cases() throws RecognitionException {
        babel17Parser.cases_return retval = new babel17Parser.cases_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL225=null;
        babel17Parser.full_cases_return full_cases223 = null;

        babel17Parser.pattern_return pattern224 = null;

        babel17Parser.token_DOUBLE_ARROW_return token_DOUBLE_ARROW226 = null;

        babel17Parser.block_return block227 = null;


        CommonTree NL225_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_token_DOUBLE_ARROW=new RewriteRuleSubtreeStream(adaptor,"rule token_DOUBLE_ARROW");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:493:2: ( full_cases | pattern ( NL )? token_DOUBLE_ARROW block -> ^( CASES ^( NIL_TOKEN pattern block ) ) )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:493:4: full_cases
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_full_cases_in_cases2996);
                    full_cases223=full_cases();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, full_cases223.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:494:4: pattern ( NL )? token_DOUBLE_ARROW block
                    {
                    pushFollow(FOLLOW_pattern_in_cases3001);
                    pattern224=pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pattern.add(pattern224.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:494:12: ( NL )?
                    int alt94=2;
                    int LA94_0 = input.LA(1);

                    if ( (LA94_0==NL) ) {
                        alt94=1;
                    }
                    switch (alt94) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:494:12: NL
                            {
                            NL225=(Token)match(input,NL,FOLLOW_NL_in_cases3003); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL225);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_token_DOUBLE_ARROW_in_cases3006);
                    token_DOUBLE_ARROW226=token_DOUBLE_ARROW();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_token_DOUBLE_ARROW.add(token_DOUBLE_ARROW226.getTree());
                    pushFollow(FOLLOW_block_in_cases3008);
                    block227=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block227.getTree());


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
                    // 494:41: -> ^( CASES ^( NIL_TOKEN pattern block ) )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:494:44: ^( CASES ^( NIL_TOKEN pattern block ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CASES, "CASES"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:494:52: ^( NIL_TOKEN pattern block )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:496:1: full_cases : ( case_expr )+ -> ^( CASES ( case_expr )+ ) ;
    public final babel17Parser.full_cases_return full_cases() throws RecognitionException {
        babel17Parser.full_cases_return retval = new babel17Parser.full_cases_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.case_expr_return case_expr228 = null;


        RewriteRuleSubtreeStream stream_case_expr=new RewriteRuleSubtreeStream(adaptor,"rule case_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:497:2: ( ( case_expr )+ -> ^( CASES ( case_expr )+ ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:497:4: ( case_expr )+
            {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:497:4: ( case_expr )+
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
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:497:4: case_expr
            	    {
            	    pushFollow(FOLLOW_case_expr_in_full_cases3031);
            	    case_expr228=case_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_case_expr.add(case_expr228.getTree());

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
            // 497:15: -> ^( CASES ( case_expr )+ )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:497:18: ^( CASES ( case_expr )+ )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:499:1: case_expr : ( L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW block ) -> ^( NIL_TOKEN pattern block ) ;
    public final babel17Parser.case_expr_return case_expr() throws RecognitionException {
        babel17Parser.case_expr_return retval = new babel17Parser.case_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_case229=null;
        Token NL230=null;
        Token NL232=null;
        babel17Parser.pattern_return pattern231 = null;

        babel17Parser.token_DOUBLE_ARROW_return token_DOUBLE_ARROW233 = null;

        babel17Parser.block_return block234 = null;


        CommonTree L_case229_tree=null;
        CommonTree NL230_tree=null;
        CommonTree NL232_tree=null;
        RewriteRuleTokenStream stream_L_case=new RewriteRuleTokenStream(adaptor,"token L_case");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_token_DOUBLE_ARROW=new RewriteRuleSubtreeStream(adaptor,"rule token_DOUBLE_ARROW");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:500:2: ( ( L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW block ) -> ^( NIL_TOKEN pattern block ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:500:4: ( L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW block )
            {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:500:4: ( L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW block )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:500:5: L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW block
            {
            L_case229=(Token)match(input,L_case,FOLLOW_L_case_in_case_expr3052); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_case.add(L_case229);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:500:12: ( NL )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==NL) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:500:12: NL
                    {
                    NL230=(Token)match(input,NL,FOLLOW_NL_in_case_expr3054); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL230);


                    }
                    break;

            }

            pushFollow(FOLLOW_pattern_in_case_expr3057);
            pattern231=pattern();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pattern.add(pattern231.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:500:24: ( NL )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==NL) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:500:24: NL
                    {
                    NL232=(Token)match(input,NL,FOLLOW_NL_in_case_expr3059); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL232);


                    }
                    break;

            }

            pushFollow(FOLLOW_token_DOUBLE_ARROW_in_case_expr3062);
            token_DOUBLE_ARROW233=token_DOUBLE_ARROW();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_token_DOUBLE_ARROW.add(token_DOUBLE_ARROW233.getTree());
            pushFollow(FOLLOW_block_in_case_expr3064);
            block234=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block234.getTree());

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
            // 500:54: -> ^( NIL_TOKEN pattern block )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:500:57: ^( NIL_TOKEN pattern block )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:502:1: match_expr : L_match ( NL )? p_op_expr ( NL )? full_cases L_end -> ^( MATCH p_op_expr full_cases ) ;
    public final babel17Parser.match_expr_return match_expr() throws RecognitionException {
        babel17Parser.match_expr_return retval = new babel17Parser.match_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_match235=null;
        Token NL236=null;
        Token NL238=null;
        Token L_end240=null;
        babel17Parser.p_op_expr_return p_op_expr237 = null;

        babel17Parser.full_cases_return full_cases239 = null;


        CommonTree L_match235_tree=null;
        CommonTree NL236_tree=null;
        CommonTree NL238_tree=null;
        CommonTree L_end240_tree=null;
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_match=new RewriteRuleTokenStream(adaptor,"token L_match");
        RewriteRuleSubtreeStream stream_full_cases=new RewriteRuleSubtreeStream(adaptor,"rule full_cases");
        RewriteRuleSubtreeStream stream_p_op_expr=new RewriteRuleSubtreeStream(adaptor,"rule p_op_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:503:2: ( L_match ( NL )? p_op_expr ( NL )? full_cases L_end -> ^( MATCH p_op_expr full_cases ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:503:4: L_match ( NL )? p_op_expr ( NL )? full_cases L_end
            {
            L_match235=(Token)match(input,L_match,FOLLOW_L_match_in_match_expr3085); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_match.add(L_match235);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:503:12: ( NL )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==NL) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:503:12: NL
                    {
                    NL236=(Token)match(input,NL,FOLLOW_NL_in_match_expr3087); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL236);


                    }
                    break;

            }

            pushFollow(FOLLOW_p_op_expr_in_match_expr3090);
            p_op_expr237=p_op_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_p_op_expr.add(p_op_expr237.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:503:26: ( NL )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==NL) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:503:26: NL
                    {
                    NL238=(Token)match(input,NL,FOLLOW_NL_in_match_expr3092); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL238);


                    }
                    break;

            }

            pushFollow(FOLLOW_full_cases_in_match_expr3095);
            full_cases239=full_cases();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_full_cases.add(full_cases239.getTree());
            L_end240=(Token)match(input,L_end,FOLLOW_L_end_in_match_expr3097); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_end.add(L_end240);



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
            // 504:5: -> ^( MATCH p_op_expr full_cases )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:504:8: ^( MATCH p_op_expr full_cases )
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

    public static class try_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "try_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:506:1: try_expr : L_try ( NL )? pure_block ( NL )? L_catch ( NL )? full_cases L_end -> ^( TRY pure_block full_cases ) ;
    public final babel17Parser.try_expr_return try_expr() throws RecognitionException {
        babel17Parser.try_expr_return retval = new babel17Parser.try_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_try241=null;
        Token NL242=null;
        Token NL244=null;
        Token L_catch245=null;
        Token NL246=null;
        Token L_end248=null;
        babel17Parser.pure_block_return pure_block243 = null;

        babel17Parser.full_cases_return full_cases247 = null;


        CommonTree L_try241_tree=null;
        CommonTree NL242_tree=null;
        CommonTree NL244_tree=null;
        CommonTree L_catch245_tree=null;
        CommonTree NL246_tree=null;
        CommonTree L_end248_tree=null;
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleTokenStream stream_L_try=new RewriteRuleTokenStream(adaptor,"token L_try");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_catch=new RewriteRuleTokenStream(adaptor,"token L_catch");
        RewriteRuleSubtreeStream stream_full_cases=new RewriteRuleSubtreeStream(adaptor,"rule full_cases");
        RewriteRuleSubtreeStream stream_pure_block=new RewriteRuleSubtreeStream(adaptor,"rule pure_block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:506:9: ( L_try ( NL )? pure_block ( NL )? L_catch ( NL )? full_cases L_end -> ^( TRY pure_block full_cases ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:506:11: L_try ( NL )? pure_block ( NL )? L_catch ( NL )? full_cases L_end
            {
            L_try241=(Token)match(input,L_try,FOLLOW_L_try_in_try_expr3123); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_try.add(L_try241);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:506:17: ( NL )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==NL) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:506:17: NL
                    {
                    NL242=(Token)match(input,NL,FOLLOW_NL_in_try_expr3125); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL242);


                    }
                    break;

            }

            pushFollow(FOLLOW_pure_block_in_try_expr3128);
            pure_block243=pure_block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pure_block.add(pure_block243.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:506:32: ( NL )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==NL) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:506:32: NL
                    {
                    NL244=(Token)match(input,NL,FOLLOW_NL_in_try_expr3130); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL244);


                    }
                    break;

            }

            L_catch245=(Token)match(input,L_catch,FOLLOW_L_catch_in_try_expr3133); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_catch.add(L_catch245);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:506:44: ( NL )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==NL) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:506:44: NL
                    {
                    NL246=(Token)match(input,NL,FOLLOW_NL_in_try_expr3135); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL246);


                    }
                    break;

            }

            pushFollow(FOLLOW_full_cases_in_try_expr3138);
            full_cases247=full_cases();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_full_cases.add(full_cases247.getTree());
            L_end248=(Token)match(input,L_end,FOLLOW_L_end_in_try_expr3140); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_end.add(L_end248);



            // AST REWRITE
            // elements: pure_block, full_cases
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 507:5: -> ^( TRY pure_block full_cases )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:507:8: ^( TRY pure_block full_cases )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TRY, "TRY"), root_1);

                adaptor.addChild(root_1, stream_pure_block.nextTree());
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
    // $ANTLR end "try_expr"

    public static class lambda_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "lambda_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:509:1: lambda_expr : lambda_cases -> ^( LAMBDA lambda_cases ) ;
    public final babel17Parser.lambda_expr_return lambda_expr() throws RecognitionException {
        babel17Parser.lambda_expr_return retval = new babel17Parser.lambda_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.lambda_cases_return lambda_cases249 = null;


        RewriteRuleSubtreeStream stream_lambda_cases=new RewriteRuleSubtreeStream(adaptor,"rule lambda_cases");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:510:2: ( lambda_cases -> ^( LAMBDA lambda_cases ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:510:4: lambda_cases
            {
            pushFollow(FOLLOW_lambda_cases_in_lambda_expr3165);
            lambda_cases249=lambda_cases();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_lambda_cases.add(lambda_cases249.getTree());


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
            // 510:17: -> ^( LAMBDA lambda_cases )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:510:20: ^( LAMBDA lambda_cases )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:512:1: lambda_cases : pattern ( NL )? token_DOUBLE_ARROW ( NL )? lop_expr -> ^( CASES ^( NIL_TOKEN pattern ^( BLOCK lop_expr ) ) ) ;
    public final babel17Parser.lambda_cases_return lambda_cases() throws RecognitionException {
        babel17Parser.lambda_cases_return retval = new babel17Parser.lambda_cases_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL251=null;
        Token NL253=null;
        babel17Parser.pattern_return pattern250 = null;

        babel17Parser.token_DOUBLE_ARROW_return token_DOUBLE_ARROW252 = null;

        babel17Parser.lop_expr_return lop_expr254 = null;


        CommonTree NL251_tree=null;
        CommonTree NL253_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_token_DOUBLE_ARROW=new RewriteRuleSubtreeStream(adaptor,"rule token_DOUBLE_ARROW");
        RewriteRuleSubtreeStream stream_lop_expr=new RewriteRuleSubtreeStream(adaptor,"rule lop_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:513:2: ( pattern ( NL )? token_DOUBLE_ARROW ( NL )? lop_expr -> ^( CASES ^( NIL_TOKEN pattern ^( BLOCK lop_expr ) ) ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:513:4: pattern ( NL )? token_DOUBLE_ARROW ( NL )? lop_expr
            {
            pushFollow(FOLLOW_pattern_in_lambda_cases3183);
            pattern250=pattern();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pattern.add(pattern250.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:513:12: ( NL )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==NL) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:513:12: NL
                    {
                    NL251=(Token)match(input,NL,FOLLOW_NL_in_lambda_cases3185); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL251);


                    }
                    break;

            }

            pushFollow(FOLLOW_token_DOUBLE_ARROW_in_lambda_cases3188);
            token_DOUBLE_ARROW252=token_DOUBLE_ARROW();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_token_DOUBLE_ARROW.add(token_DOUBLE_ARROW252.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:513:35: ( NL )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==NL) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:513:35: NL
                    {
                    NL253=(Token)match(input,NL,FOLLOW_NL_in_lambda_cases3190); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL253);


                    }
                    break;

            }

            pushFollow(FOLLOW_lop_expr_in_lambda_cases3193);
            lop_expr254=lop_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_lop_expr.add(lop_expr254.getTree());


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
            // 513:48: -> ^( CASES ^( NIL_TOKEN pattern ^( BLOCK lop_expr ) ) )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:513:51: ^( CASES ^( NIL_TOKEN pattern ^( BLOCK lop_expr ) ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CASES, "CASES"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:513:59: ^( NIL_TOKEN pattern ^( BLOCK lop_expr ) )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_2);

                adaptor.addChild(root_2, stream_pattern.nextTree());
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:513:79: ^( BLOCK lop_expr )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:515:1: protected_lambda_expr : protected_lambda_cases -> ^( LAMBDA protected_lambda_cases ) ;
    public final babel17Parser.protected_lambda_expr_return protected_lambda_expr() throws RecognitionException {
        babel17Parser.protected_lambda_expr_return retval = new babel17Parser.protected_lambda_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.protected_lambda_cases_return protected_lambda_cases255 = null;


        RewriteRuleSubtreeStream stream_protected_lambda_cases=new RewriteRuleSubtreeStream(adaptor,"rule protected_lambda_cases");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:516:2: ( protected_lambda_cases -> ^( LAMBDA protected_lambda_cases ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:516:4: protected_lambda_cases
            {
            pushFollow(FOLLOW_protected_lambda_cases_in_protected_lambda_expr3221);
            protected_lambda_cases255=protected_lambda_cases();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_protected_lambda_cases.add(protected_lambda_cases255.getTree());


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
            // 516:27: -> ^( LAMBDA protected_lambda_cases )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:516:30: ^( LAMBDA protected_lambda_cases )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:518:1: p_lambda_case_expr : ( L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block ) -> ^( NIL_TOKEN pattern pure_block ) ;
    public final babel17Parser.p_lambda_case_expr_return p_lambda_case_expr() throws RecognitionException {
        babel17Parser.p_lambda_case_expr_return retval = new babel17Parser.p_lambda_case_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_case256=null;
        Token NL257=null;
        Token NL259=null;
        Token NL261=null;
        babel17Parser.pattern_return pattern258 = null;

        babel17Parser.token_DOUBLE_ARROW_return token_DOUBLE_ARROW260 = null;

        babel17Parser.pure_block_return pure_block262 = null;


        CommonTree L_case256_tree=null;
        CommonTree NL257_tree=null;
        CommonTree NL259_tree=null;
        CommonTree NL261_tree=null;
        RewriteRuleTokenStream stream_L_case=new RewriteRuleTokenStream(adaptor,"token L_case");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_token_DOUBLE_ARROW=new RewriteRuleSubtreeStream(adaptor,"rule token_DOUBLE_ARROW");
        RewriteRuleSubtreeStream stream_pure_block=new RewriteRuleSubtreeStream(adaptor,"rule pure_block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:519:2: ( ( L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block ) -> ^( NIL_TOKEN pattern pure_block ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:519:4: ( L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block )
            {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:519:4: ( L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:519:5: L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block
            {
            L_case256=(Token)match(input,L_case,FOLLOW_L_case_in_p_lambda_case_expr3239); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_case.add(L_case256);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:519:12: ( NL )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==NL) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:519:12: NL
                    {
                    NL257=(Token)match(input,NL,FOLLOW_NL_in_p_lambda_case_expr3241); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL257);


                    }
                    break;

            }

            pushFollow(FOLLOW_pattern_in_p_lambda_case_expr3244);
            pattern258=pattern();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pattern.add(pattern258.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:519:24: ( NL )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==NL) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:519:24: NL
                    {
                    NL259=(Token)match(input,NL,FOLLOW_NL_in_p_lambda_case_expr3246); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL259);


                    }
                    break;

            }

            pushFollow(FOLLOW_token_DOUBLE_ARROW_in_p_lambda_case_expr3249);
            token_DOUBLE_ARROW260=token_DOUBLE_ARROW();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_token_DOUBLE_ARROW.add(token_DOUBLE_ARROW260.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:519:47: ( NL )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==NL) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:519:47: NL
                    {
                    NL261=(Token)match(input,NL,FOLLOW_NL_in_p_lambda_case_expr3251); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL261);


                    }
                    break;

            }

            pushFollow(FOLLOW_pure_block_in_p_lambda_case_expr3254);
            pure_block262=pure_block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pure_block.add(pure_block262.getTree());

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
            // 519:63: -> ^( NIL_TOKEN pattern pure_block )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:519:66: ^( NIL_TOKEN pattern pure_block )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:521:1: protected_lambda_cases : ( pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block -> ^( CASES ^( NIL_TOKEN pattern pure_block ) ) | p_lambda_case_expr ( ( NL )? p_lambda_case_expr )* -> ^( CASES ( p_lambda_case_expr )+ ) );
    public final babel17Parser.protected_lambda_cases_return protected_lambda_cases() throws RecognitionException {
        babel17Parser.protected_lambda_cases_return retval = new babel17Parser.protected_lambda_cases_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL264=null;
        Token NL266=null;
        Token NL269=null;
        babel17Parser.pattern_return pattern263 = null;

        babel17Parser.token_DOUBLE_ARROW_return token_DOUBLE_ARROW265 = null;

        babel17Parser.pure_block_return pure_block267 = null;

        babel17Parser.p_lambda_case_expr_return p_lambda_case_expr268 = null;

        babel17Parser.p_lambda_case_expr_return p_lambda_case_expr270 = null;


        CommonTree NL264_tree=null;
        CommonTree NL266_tree=null;
        CommonTree NL269_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_token_DOUBLE_ARROW=new RewriteRuleSubtreeStream(adaptor,"rule token_DOUBLE_ARROW");
        RewriteRuleSubtreeStream stream_p_lambda_case_expr=new RewriteRuleSubtreeStream(adaptor,"rule p_lambda_case_expr");
        RewriteRuleSubtreeStream stream_pure_block=new RewriteRuleSubtreeStream(adaptor,"rule pure_block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:522:2: ( pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block -> ^( CASES ^( NIL_TOKEN pattern pure_block ) ) | p_lambda_case_expr ( ( NL )? p_lambda_case_expr )* -> ^( CASES ( p_lambda_case_expr )+ ) )
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==L_exception||(LA113_0>=A_infinity && LA113_0<=U_infinity)||(LA113_0>=L_true && LA113_0<=L_false)||LA113_0==L_nil||LA113_0==MINUS||(LA113_0>=A_ELLIPSIS && LA113_0<=U_ELLIPSIS)||(LA113_0>=Constr && LA113_0<=Num)||(LA113_0>=String && LA113_0<=ROUND_BRACKET_OPEN)||LA113_0==SQUARE_BRACKET_OPEN||LA113_0==CURLY_BRACKET_OPEN||LA113_0==UNDERSCORE) ) {
                alt113=1;
            }
            else if ( (LA113_0==L_case) ) {
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:522:4: pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block
                    {
                    pushFollow(FOLLOW_pattern_in_protected_lambda_cases3275);
                    pattern263=pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pattern.add(pattern263.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:522:12: ( NL )?
                    int alt109=2;
                    int LA109_0 = input.LA(1);

                    if ( (LA109_0==NL) ) {
                        alt109=1;
                    }
                    switch (alt109) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:522:12: NL
                            {
                            NL264=(Token)match(input,NL,FOLLOW_NL_in_protected_lambda_cases3277); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL264);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_token_DOUBLE_ARROW_in_protected_lambda_cases3280);
                    token_DOUBLE_ARROW265=token_DOUBLE_ARROW();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_token_DOUBLE_ARROW.add(token_DOUBLE_ARROW265.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:522:35: ( NL )?
                    int alt110=2;
                    int LA110_0 = input.LA(1);

                    if ( (LA110_0==NL) ) {
                        alt110=1;
                    }
                    switch (alt110) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:522:35: NL
                            {
                            NL266=(Token)match(input,NL,FOLLOW_NL_in_protected_lambda_cases3282); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL266);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_pure_block_in_protected_lambda_cases3285);
                    pure_block267=pure_block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pure_block.add(pure_block267.getTree());


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
                    // 522:50: -> ^( CASES ^( NIL_TOKEN pattern pure_block ) )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:522:53: ^( CASES ^( NIL_TOKEN pattern pure_block ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CASES, "CASES"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:522:61: ^( NIL_TOKEN pattern pure_block )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:523:4: p_lambda_case_expr ( ( NL )? p_lambda_case_expr )*
                    {
                    pushFollow(FOLLOW_p_lambda_case_expr_in_protected_lambda_cases3304);
                    p_lambda_case_expr268=p_lambda_case_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_p_lambda_case_expr.add(p_lambda_case_expr268.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:523:23: ( ( NL )? p_lambda_case_expr )*
                    loop112:
                    do {
                        int alt112=2;
                        int LA112_0 = input.LA(1);

                        if ( (LA112_0==NL) ) {
                            int LA112_1 = input.LA(2);

                            if ( (LA112_1==L_case) ) {
                                alt112=1;
                            }


                        }
                        else if ( (LA112_0==L_case) ) {
                            alt112=1;
                        }


                        switch (alt112) {
                    	case 1 :
                    	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:523:24: ( NL )? p_lambda_case_expr
                    	    {
                    	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:523:24: ( NL )?
                    	    int alt111=2;
                    	    int LA111_0 = input.LA(1);

                    	    if ( (LA111_0==NL) ) {
                    	        alt111=1;
                    	    }
                    	    switch (alt111) {
                    	        case 1 :
                    	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:523:24: NL
                    	            {
                    	            NL269=(Token)match(input,NL,FOLLOW_NL_in_protected_lambda_cases3307); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_NL.add(NL269);


                    	            }
                    	            break;

                    	    }

                    	    pushFollow(FOLLOW_p_lambda_case_expr_in_protected_lambda_cases3310);
                    	    p_lambda_case_expr270=p_lambda_case_expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_p_lambda_case_expr.add(p_lambda_case_expr270.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop112;
                        }
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
                    // 523:49: -> ^( CASES ( p_lambda_case_expr )+ )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:523:52: ^( CASES ( p_lambda_case_expr )+ )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:525:1: for_expr : L_for ( NL )? pattern ( NL )? L_in ( NL )? protected_expr ( NL )? L_do block L_end -> ^( FOR_EXPR pattern protected_expr block ) ;
    public final babel17Parser.for_expr_return for_expr() throws RecognitionException {
        babel17Parser.for_expr_return retval = new babel17Parser.for_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_for271=null;
        Token NL272=null;
        Token NL274=null;
        Token L_in275=null;
        Token NL276=null;
        Token NL278=null;
        Token L_do279=null;
        Token L_end281=null;
        babel17Parser.pattern_return pattern273 = null;

        babel17Parser.protected_expr_return protected_expr277 = null;

        babel17Parser.block_return block280 = null;


        CommonTree L_for271_tree=null;
        CommonTree NL272_tree=null;
        CommonTree NL274_tree=null;
        CommonTree L_in275_tree=null;
        CommonTree NL276_tree=null;
        CommonTree NL278_tree=null;
        CommonTree L_do279_tree=null;
        CommonTree L_end281_tree=null;
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleTokenStream stream_L_for=new RewriteRuleTokenStream(adaptor,"token L_for");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_in=new RewriteRuleTokenStream(adaptor,"token L_in");
        RewriteRuleTokenStream stream_L_do=new RewriteRuleTokenStream(adaptor,"token L_do");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_protected_expr=new RewriteRuleSubtreeStream(adaptor,"rule protected_expr");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:525:9: ( L_for ( NL )? pattern ( NL )? L_in ( NL )? protected_expr ( NL )? L_do block L_end -> ^( FOR_EXPR pattern protected_expr block ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:525:11: L_for ( NL )? pattern ( NL )? L_in ( NL )? protected_expr ( NL )? L_do block L_end
            {
            L_for271=(Token)match(input,L_for,FOLLOW_L_for_in_for_expr3328); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_for.add(L_for271);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:525:17: ( NL )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==NL) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:525:17: NL
                    {
                    NL272=(Token)match(input,NL,FOLLOW_NL_in_for_expr3330); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL272);


                    }
                    break;

            }

            pushFollow(FOLLOW_pattern_in_for_expr3333);
            pattern273=pattern();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pattern.add(pattern273.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:525:29: ( NL )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==NL) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:525:29: NL
                    {
                    NL274=(Token)match(input,NL,FOLLOW_NL_in_for_expr3335); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL274);


                    }
                    break;

            }

            L_in275=(Token)match(input,L_in,FOLLOW_L_in_in_for_expr3338); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_in.add(L_in275);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:525:38: ( NL )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==NL) ) {
                alt116=1;
            }
            switch (alt116) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:525:38: NL
                    {
                    NL276=(Token)match(input,NL,FOLLOW_NL_in_for_expr3340); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL276);


                    }
                    break;

            }

            pushFollow(FOLLOW_protected_expr_in_for_expr3343);
            protected_expr277=protected_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr277.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:525:57: ( NL )?
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==NL) ) {
                alt117=1;
            }
            switch (alt117) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:525:57: NL
                    {
                    NL278=(Token)match(input,NL,FOLLOW_NL_in_for_expr3345); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL278);


                    }
                    break;

            }

            L_do279=(Token)match(input,L_do,FOLLOW_L_do_in_for_expr3348); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_do.add(L_do279);

            pushFollow(FOLLOW_block_in_for_expr3350);
            block280=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block280.getTree());
            L_end281=(Token)match(input,L_end,FOLLOW_L_end_in_for_expr3352); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_end.add(L_end281);



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
            // 526:5: -> ^( FOR_EXPR pattern protected_expr block )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:526:8: ^( FOR_EXPR pattern protected_expr block )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:528:1: op_expr : ( builtin_primitive op_expr | bool_expr );
    public final babel17Parser.op_expr_return op_expr() throws RecognitionException {
        babel17Parser.op_expr_return retval = new babel17Parser.op_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.builtin_primitive_return builtin_primitive282 = null;

        babel17Parser.op_expr_return op_expr283 = null;

        babel17Parser.bool_expr_return bool_expr284 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:528:9: ( builtin_primitive op_expr | bool_expr )
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==L_exception||(LA118_0>=L_concurrent && LA118_0<=L_lazy)||LA118_0==L_random||LA118_0==L_force) ) {
                alt118=1;
            }
            else if ( (LA118_0==L_begin||(LA118_0>=L_with && LA118_0<=L_if)||(LA118_0>=L_while && LA118_0<=L_for)||LA118_0==L_match||LA118_0==L_try||(LA118_0>=A_infinity && LA118_0<=U_infinity)||(LA118_0>=L_true && LA118_0<=L_this)||LA118_0==L_nil||LA118_0==MINUS||LA118_0==A_NOT||LA118_0==U_NOT||(LA118_0>=Constr && LA118_0<=Num)||(LA118_0>=String && LA118_0<=ROUND_BRACKET_OPEN)||LA118_0==SQUARE_BRACKET_OPEN||LA118_0==CURLY_BRACKET_OPEN) ) {
                alt118=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 118, 0, input);

                throw nvae;
            }
            switch (alt118) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:528:11: builtin_primitive op_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_builtin_primitive_in_op_expr3377);
                    builtin_primitive282=builtin_primitive();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(builtin_primitive282.getTree(), root_0);
                    pushFollow(FOLLOW_op_expr_in_op_expr3380);
                    op_expr283=op_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, op_expr283.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:529:4: bool_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_bool_expr_in_op_expr3385);
                    bool_expr284=bool_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_expr284.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:531:1: p_op_expr : ( builtin_primitive ( NL )? p_op_expr | p_bool_expr );
    public final babel17Parser.p_op_expr_return p_op_expr() throws RecognitionException {
        babel17Parser.p_op_expr_return retval = new babel17Parser.p_op_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL286=null;
        babel17Parser.builtin_primitive_return builtin_primitive285 = null;

        babel17Parser.p_op_expr_return p_op_expr287 = null;

        babel17Parser.p_bool_expr_return p_bool_expr288 = null;


        CommonTree NL286_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:532:2: ( builtin_primitive ( NL )? p_op_expr | p_bool_expr )
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==L_exception||(LA120_0>=L_concurrent && LA120_0<=L_lazy)||LA120_0==L_random||LA120_0==L_force) ) {
                alt120=1;
            }
            else if ( (LA120_0==L_begin||(LA120_0>=L_with && LA120_0<=L_if)||(LA120_0>=L_while && LA120_0<=L_for)||LA120_0==L_match||LA120_0==L_try||(LA120_0>=A_infinity && LA120_0<=U_infinity)||(LA120_0>=L_true && LA120_0<=L_this)||LA120_0==L_nil||LA120_0==MINUS||LA120_0==A_NOT||LA120_0==U_NOT||(LA120_0>=Constr && LA120_0<=Num)||(LA120_0>=String && LA120_0<=ROUND_BRACKET_OPEN)||LA120_0==SQUARE_BRACKET_OPEN||LA120_0==CURLY_BRACKET_OPEN) ) {
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:532:4: builtin_primitive ( NL )? p_op_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_builtin_primitive_in_p_op_expr3395);
                    builtin_primitive285=builtin_primitive();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(builtin_primitive285.getTree(), root_0);
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:532:25: ( NL )?
                    int alt119=2;
                    int LA119_0 = input.LA(1);

                    if ( (LA119_0==NL) ) {
                        alt119=1;
                    }
                    switch (alt119) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:532:25: NL
                            {
                            NL286=(Token)match(input,NL,FOLLOW_NL_in_p_op_expr3398); if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_p_op_expr_in_p_op_expr3402);
                    p_op_expr287=p_op_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_op_expr287.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:533:4: p_bool_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_p_bool_expr_in_p_op_expr3407);
                    p_bool_expr288=p_bool_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_bool_expr288.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:536:1: builtin_primitive : ( L_random | L_exception | L_lazy | L_choose | L_concurrent | L_force );
    public final babel17Parser.builtin_primitive_return builtin_primitive() throws RecognitionException {
        babel17Parser.builtin_primitive_return retval = new babel17Parser.builtin_primitive_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set289=null;

        CommonTree set289_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:537:2: ( L_random | L_exception | L_lazy | L_choose | L_concurrent | L_force )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set289=(Token)input.LT(1);
            if ( input.LA(1)==L_exception||(input.LA(1)>=L_concurrent && input.LA(1)<=L_lazy)||input.LA(1)==L_random||input.LA(1)==L_force ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set289));
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:539:1: bool_expr : bool_or_expr ;
    public final babel17Parser.bool_expr_return bool_expr() throws RecognitionException {
        babel17Parser.bool_expr_return retval = new babel17Parser.bool_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.bool_or_expr_return bool_or_expr290 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:540:2: ( bool_or_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:540:4: bool_or_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bool_or_expr_in_bool_expr3447);
            bool_or_expr290=bool_or_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_or_expr290.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:542:1: p_bool_expr : p_bool_or_expr ;
    public final babel17Parser.p_bool_expr_return p_bool_expr() throws RecognitionException {
        babel17Parser.p_bool_expr_return retval = new babel17Parser.p_bool_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.p_bool_or_expr_return p_bool_or_expr291 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:543:2: ( p_bool_or_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:543:4: p_bool_or_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_bool_or_expr_in_p_bool_expr3457);
            p_bool_or_expr291=p_bool_or_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_bool_or_expr291.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:545:1: bool_or_expr : bool_and_expr ( ( NL )? token_OR ( NL )? bool_and_expr )* ;
    public final babel17Parser.bool_or_expr_return bool_or_expr() throws RecognitionException {
        babel17Parser.bool_or_expr_return retval = new babel17Parser.bool_or_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL293=null;
        Token NL295=null;
        babel17Parser.bool_and_expr_return bool_and_expr292 = null;

        babel17Parser.token_OR_return token_OR294 = null;

        babel17Parser.bool_and_expr_return bool_and_expr296 = null;


        CommonTree NL293_tree=null;
        CommonTree NL295_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:546:2: ( bool_and_expr ( ( NL )? token_OR ( NL )? bool_and_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:546:4: bool_and_expr ( ( NL )? token_OR ( NL )? bool_and_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bool_and_expr_in_bool_or_expr3466);
            bool_and_expr292=bool_and_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_and_expr292.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:546:18: ( ( NL )? token_OR ( NL )? bool_and_expr )*
            loop123:
            do {
                int alt123=2;
                int LA123_0 = input.LA(1);

                if ( (LA123_0==NL) ) {
                    int LA123_1 = input.LA(2);

                    if ( (LA123_1==A_OR||LA123_1==U_OR) ) {
                        alt123=1;
                    }


                }
                else if ( (LA123_0==A_OR||LA123_0==U_OR) ) {
                    alt123=1;
                }


                switch (alt123) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:546:19: ( NL )? token_OR ( NL )? bool_and_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:546:21: ( NL )?
            	    int alt121=2;
            	    int LA121_0 = input.LA(1);

            	    if ( (LA121_0==NL) ) {
            	        alt121=1;
            	    }
            	    switch (alt121) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:546:21: NL
            	            {
            	            NL293=(Token)match(input,NL,FOLLOW_NL_in_bool_or_expr3469); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_token_OR_in_bool_or_expr3473);
            	    token_OR294=token_OR();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(token_OR294.getTree(), root_0);
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:546:36: ( NL )?
            	    int alt122=2;
            	    int LA122_0 = input.LA(1);

            	    if ( (LA122_0==NL) ) {
            	        alt122=1;
            	    }
            	    switch (alt122) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:546:36: NL
            	            {
            	            NL295=(Token)match(input,NL,FOLLOW_NL_in_bool_or_expr3476); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_bool_and_expr_in_bool_or_expr3480);
            	    bool_and_expr296=bool_and_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_and_expr296.getTree());

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
    // $ANTLR end "bool_or_expr"

    public static class p_bool_or_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "p_bool_or_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:548:1: p_bool_or_expr : p_bool_and_expr ( ( NL )? token_OR ( NL )? p_bool_and_expr )* ;
    public final babel17Parser.p_bool_or_expr_return p_bool_or_expr() throws RecognitionException {
        babel17Parser.p_bool_or_expr_return retval = new babel17Parser.p_bool_or_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL298=null;
        Token NL300=null;
        babel17Parser.p_bool_and_expr_return p_bool_and_expr297 = null;

        babel17Parser.token_OR_return token_OR299 = null;

        babel17Parser.p_bool_and_expr_return p_bool_and_expr301 = null;


        CommonTree NL298_tree=null;
        CommonTree NL300_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:549:2: ( p_bool_and_expr ( ( NL )? token_OR ( NL )? p_bool_and_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:549:4: p_bool_and_expr ( ( NL )? token_OR ( NL )? p_bool_and_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_bool_and_expr_in_p_bool_or_expr3492);
            p_bool_and_expr297=p_bool_and_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_bool_and_expr297.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:549:20: ( ( NL )? token_OR ( NL )? p_bool_and_expr )*
            loop126:
            do {
                int alt126=2;
                int LA126_0 = input.LA(1);

                if ( (LA126_0==NL) ) {
                    int LA126_1 = input.LA(2);

                    if ( (LA126_1==A_OR||LA126_1==U_OR) ) {
                        alt126=1;
                    }


                }
                else if ( (LA126_0==A_OR||LA126_0==U_OR) ) {
                    alt126=1;
                }


                switch (alt126) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:549:21: ( NL )? token_OR ( NL )? p_bool_and_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:549:23: ( NL )?
            	    int alt124=2;
            	    int LA124_0 = input.LA(1);

            	    if ( (LA124_0==NL) ) {
            	        alt124=1;
            	    }
            	    switch (alt124) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:549:23: NL
            	            {
            	            NL298=(Token)match(input,NL,FOLLOW_NL_in_p_bool_or_expr3495); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_token_OR_in_p_bool_or_expr3499);
            	    token_OR299=token_OR();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(token_OR299.getTree(), root_0);
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:549:38: ( NL )?
            	    int alt125=2;
            	    int LA125_0 = input.LA(1);

            	    if ( (LA125_0==NL) ) {
            	        alt125=1;
            	    }
            	    switch (alt125) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:549:38: NL
            	            {
            	            NL300=(Token)match(input,NL,FOLLOW_NL_in_p_bool_or_expr3502); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_bool_and_expr_in_p_bool_or_expr3506);
            	    p_bool_and_expr301=p_bool_and_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_bool_and_expr301.getTree());

            	    }
            	    break;

            	default :
            	    break loop126;
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:551:1: bool_and_expr : bool_not_expr ( ( NL )? token_AND ( NL )? bool_not_expr )* ;
    public final babel17Parser.bool_and_expr_return bool_and_expr() throws RecognitionException {
        babel17Parser.bool_and_expr_return retval = new babel17Parser.bool_and_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL303=null;
        Token NL305=null;
        babel17Parser.bool_not_expr_return bool_not_expr302 = null;

        babel17Parser.token_AND_return token_AND304 = null;

        babel17Parser.bool_not_expr_return bool_not_expr306 = null;


        CommonTree NL303_tree=null;
        CommonTree NL305_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:552:2: ( bool_not_expr ( ( NL )? token_AND ( NL )? bool_not_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:552:4: bool_not_expr ( ( NL )? token_AND ( NL )? bool_not_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bool_not_expr_in_bool_and_expr3518);
            bool_not_expr302=bool_not_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_not_expr302.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:552:18: ( ( NL )? token_AND ( NL )? bool_not_expr )*
            loop129:
            do {
                int alt129=2;
                int LA129_0 = input.LA(1);

                if ( (LA129_0==NL) ) {
                    int LA129_1 = input.LA(2);

                    if ( (LA129_1==A_AND||LA129_1==U_AND) ) {
                        alt129=1;
                    }


                }
                else if ( (LA129_0==A_AND||LA129_0==U_AND) ) {
                    alt129=1;
                }


                switch (alt129) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:552:19: ( NL )? token_AND ( NL )? bool_not_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:552:21: ( NL )?
            	    int alt127=2;
            	    int LA127_0 = input.LA(1);

            	    if ( (LA127_0==NL) ) {
            	        alt127=1;
            	    }
            	    switch (alt127) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:552:21: NL
            	            {
            	            NL303=(Token)match(input,NL,FOLLOW_NL_in_bool_and_expr3521); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_token_AND_in_bool_and_expr3525);
            	    token_AND304=token_AND();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(token_AND304.getTree(), root_0);
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:552:37: ( NL )?
            	    int alt128=2;
            	    int LA128_0 = input.LA(1);

            	    if ( (LA128_0==NL) ) {
            	        alt128=1;
            	    }
            	    switch (alt128) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:552:37: NL
            	            {
            	            NL305=(Token)match(input,NL,FOLLOW_NL_in_bool_and_expr3528); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_bool_not_expr_in_bool_and_expr3532);
            	    bool_not_expr306=bool_not_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_not_expr306.getTree());

            	    }
            	    break;

            	default :
            	    break loop129;
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:554:1: p_bool_and_expr : p_bool_not_expr ( ( NL )? token_AND ( NL )? p_bool_not_expr )* ;
    public final babel17Parser.p_bool_and_expr_return p_bool_and_expr() throws RecognitionException {
        babel17Parser.p_bool_and_expr_return retval = new babel17Parser.p_bool_and_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL308=null;
        Token NL310=null;
        babel17Parser.p_bool_not_expr_return p_bool_not_expr307 = null;

        babel17Parser.token_AND_return token_AND309 = null;

        babel17Parser.p_bool_not_expr_return p_bool_not_expr311 = null;


        CommonTree NL308_tree=null;
        CommonTree NL310_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:555:2: ( p_bool_not_expr ( ( NL )? token_AND ( NL )? p_bool_not_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:555:4: p_bool_not_expr ( ( NL )? token_AND ( NL )? p_bool_not_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_bool_not_expr_in_p_bool_and_expr3544);
            p_bool_not_expr307=p_bool_not_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_bool_not_expr307.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:555:20: ( ( NL )? token_AND ( NL )? p_bool_not_expr )*
            loop132:
            do {
                int alt132=2;
                int LA132_0 = input.LA(1);

                if ( (LA132_0==NL) ) {
                    int LA132_1 = input.LA(2);

                    if ( (LA132_1==A_AND||LA132_1==U_AND) ) {
                        alt132=1;
                    }


                }
                else if ( (LA132_0==A_AND||LA132_0==U_AND) ) {
                    alt132=1;
                }


                switch (alt132) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:555:21: ( NL )? token_AND ( NL )? p_bool_not_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:555:23: ( NL )?
            	    int alt130=2;
            	    int LA130_0 = input.LA(1);

            	    if ( (LA130_0==NL) ) {
            	        alt130=1;
            	    }
            	    switch (alt130) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:555:23: NL
            	            {
            	            NL308=(Token)match(input,NL,FOLLOW_NL_in_p_bool_and_expr3547); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_token_AND_in_p_bool_and_expr3551);
            	    token_AND309=token_AND();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(token_AND309.getTree(), root_0);
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:555:39: ( NL )?
            	    int alt131=2;
            	    int LA131_0 = input.LA(1);

            	    if ( (LA131_0==NL) ) {
            	        alt131=1;
            	    }
            	    switch (alt131) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:555:39: NL
            	            {
            	            NL310=(Token)match(input,NL,FOLLOW_NL_in_p_bool_and_expr3554); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_bool_not_expr_in_p_bool_and_expr3558);
            	    p_bool_not_expr311=p_bool_not_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_bool_not_expr311.getTree());

            	    }
            	    break;

            	default :
            	    break loop132;
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:558:1: bool_not_expr : ( token_NOT ( NL )? bool_not_expr | rel_expr );
    public final babel17Parser.bool_not_expr_return bool_not_expr() throws RecognitionException {
        babel17Parser.bool_not_expr_return retval = new babel17Parser.bool_not_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL313=null;
        babel17Parser.token_NOT_return token_NOT312 = null;

        babel17Parser.bool_not_expr_return bool_not_expr314 = null;

        babel17Parser.rel_expr_return rel_expr315 = null;


        CommonTree NL313_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:559:2: ( token_NOT ( NL )? bool_not_expr | rel_expr )
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==A_NOT||LA134_0==U_NOT) ) {
                alt134=1;
            }
            else if ( (LA134_0==L_begin||(LA134_0>=L_with && LA134_0<=L_if)||(LA134_0>=L_while && LA134_0<=L_for)||LA134_0==L_match||LA134_0==L_try||(LA134_0>=A_infinity && LA134_0<=U_infinity)||(LA134_0>=L_true && LA134_0<=L_this)||LA134_0==L_nil||LA134_0==MINUS||(LA134_0>=Constr && LA134_0<=Num)||(LA134_0>=String && LA134_0<=ROUND_BRACKET_OPEN)||LA134_0==SQUARE_BRACKET_OPEN||LA134_0==CURLY_BRACKET_OPEN) ) {
                alt134=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 134, 0, input);

                throw nvae;
            }
            switch (alt134) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:559:4: token_NOT ( NL )? bool_not_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_NOT_in_bool_not_expr3570);
                    token_NOT312=token_NOT();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(token_NOT312.getTree(), root_0);
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:559:17: ( NL )?
                    int alt133=2;
                    int LA133_0 = input.LA(1);

                    if ( (LA133_0==NL) ) {
                        alt133=1;
                    }
                    switch (alt133) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:559:17: NL
                            {
                            NL313=(Token)match(input,NL,FOLLOW_NL_in_bool_not_expr3573); if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_bool_not_expr_in_bool_not_expr3577);
                    bool_not_expr314=bool_not_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_not_expr314.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:560:4: rel_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_rel_expr_in_bool_not_expr3582);
                    rel_expr315=rel_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rel_expr315.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:562:1: p_bool_not_expr : ( token_NOT ( NL )? p_bool_not_expr | p_rel_expr );
    public final babel17Parser.p_bool_not_expr_return p_bool_not_expr() throws RecognitionException {
        babel17Parser.p_bool_not_expr_return retval = new babel17Parser.p_bool_not_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL317=null;
        babel17Parser.token_NOT_return token_NOT316 = null;

        babel17Parser.p_bool_not_expr_return p_bool_not_expr318 = null;

        babel17Parser.p_rel_expr_return p_rel_expr319 = null;


        CommonTree NL317_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:563:2: ( token_NOT ( NL )? p_bool_not_expr | p_rel_expr )
            int alt136=2;
            int LA136_0 = input.LA(1);

            if ( (LA136_0==A_NOT||LA136_0==U_NOT) ) {
                alt136=1;
            }
            else if ( (LA136_0==L_begin||(LA136_0>=L_with && LA136_0<=L_if)||(LA136_0>=L_while && LA136_0<=L_for)||LA136_0==L_match||LA136_0==L_try||(LA136_0>=A_infinity && LA136_0<=U_infinity)||(LA136_0>=L_true && LA136_0<=L_this)||LA136_0==L_nil||LA136_0==MINUS||(LA136_0>=Constr && LA136_0<=Num)||(LA136_0>=String && LA136_0<=ROUND_BRACKET_OPEN)||LA136_0==SQUARE_BRACKET_OPEN||LA136_0==CURLY_BRACKET_OPEN) ) {
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:563:4: token_NOT ( NL )? p_bool_not_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_NOT_in_p_bool_not_expr3593);
                    token_NOT316=token_NOT();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(token_NOT316.getTree(), root_0);
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:563:17: ( NL )?
                    int alt135=2;
                    int LA135_0 = input.LA(1);

                    if ( (LA135_0==NL) ) {
                        alt135=1;
                    }
                    switch (alt135) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:563:17: NL
                            {
                            NL317=(Token)match(input,NL,FOLLOW_NL_in_p_bool_not_expr3596); if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_p_bool_not_expr_in_p_bool_not_expr3600);
                    p_bool_not_expr318=p_bool_not_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_bool_not_expr318.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:564:4: p_rel_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_p_rel_expr_in_p_bool_not_expr3605);
                    p_rel_expr319=p_rel_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_rel_expr319.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:566:1: rel_expr : arith_expr ( ( NL )? rel_op ( NL )? arith_expr )* -> ^( COMPARE arith_expr ( rel_op arith_expr )* ) ;
    public final babel17Parser.rel_expr_return rel_expr() throws RecognitionException {
        babel17Parser.rel_expr_return retval = new babel17Parser.rel_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL321=null;
        Token NL323=null;
        babel17Parser.arith_expr_return arith_expr320 = null;

        babel17Parser.rel_op_return rel_op322 = null;

        babel17Parser.arith_expr_return arith_expr324 = null;


        CommonTree NL321_tree=null;
        CommonTree NL323_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_arith_expr=new RewriteRuleSubtreeStream(adaptor,"rule arith_expr");
        RewriteRuleSubtreeStream stream_rel_op=new RewriteRuleSubtreeStream(adaptor,"rule rel_op");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:567:2: ( arith_expr ( ( NL )? rel_op ( NL )? arith_expr )* -> ^( COMPARE arith_expr ( rel_op arith_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:567:4: arith_expr ( ( NL )? rel_op ( NL )? arith_expr )*
            {
            pushFollow(FOLLOW_arith_expr_in_rel_expr3614);
            arith_expr320=arith_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_arith_expr.add(arith_expr320.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:567:15: ( ( NL )? rel_op ( NL )? arith_expr )*
            loop139:
            do {
                int alt139=2;
                int LA139_0 = input.LA(1);

                if ( (LA139_0==NL) ) {
                    int LA139_1 = input.LA(2);

                    if ( ((LA139_1>=A_EQUAL && LA139_1<=U_GREATER_EQ)) ) {
                        alt139=1;
                    }


                }
                else if ( ((LA139_0>=A_EQUAL && LA139_0<=U_GREATER_EQ)) ) {
                    alt139=1;
                }


                switch (alt139) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:567:16: ( NL )? rel_op ( NL )? arith_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:567:16: ( NL )?
            	    int alt137=2;
            	    int LA137_0 = input.LA(1);

            	    if ( (LA137_0==NL) ) {
            	        alt137=1;
            	    }
            	    switch (alt137) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:567:16: NL
            	            {
            	            NL321=(Token)match(input,NL,FOLLOW_NL_in_rel_expr3617); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL321);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_rel_op_in_rel_expr3620);
            	    rel_op322=rel_op();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_rel_op.add(rel_op322.getTree());
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:567:27: ( NL )?
            	    int alt138=2;
            	    int LA138_0 = input.LA(1);

            	    if ( (LA138_0==NL) ) {
            	        alt138=1;
            	    }
            	    switch (alt138) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:567:27: NL
            	            {
            	            NL323=(Token)match(input,NL,FOLLOW_NL_in_rel_expr3622); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL323);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_arith_expr_in_rel_expr3625);
            	    arith_expr324=arith_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_arith_expr.add(arith_expr324.getTree());

            	    }
            	    break;

            	default :
            	    break loop139;
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
            // 567:44: -> ^( COMPARE arith_expr ( rel_op arith_expr )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:567:47: ^( COMPARE arith_expr ( rel_op arith_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COMPARE, "COMPARE"), root_1);

                adaptor.addChild(root_1, stream_arith_expr.nextTree());
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:567:68: ( rel_op arith_expr )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:569:1: p_rel_expr : p_arith_expr ( ( NL )? rel_op ( NL )? p_arith_expr )* -> ^( COMPARE p_arith_expr ( rel_op p_arith_expr )* ) ;
    public final babel17Parser.p_rel_expr_return p_rel_expr() throws RecognitionException {
        babel17Parser.p_rel_expr_return retval = new babel17Parser.p_rel_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL326=null;
        Token NL328=null;
        babel17Parser.p_arith_expr_return p_arith_expr325 = null;

        babel17Parser.rel_op_return rel_op327 = null;

        babel17Parser.p_arith_expr_return p_arith_expr329 = null;


        CommonTree NL326_tree=null;
        CommonTree NL328_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_p_arith_expr=new RewriteRuleSubtreeStream(adaptor,"rule p_arith_expr");
        RewriteRuleSubtreeStream stream_rel_op=new RewriteRuleSubtreeStream(adaptor,"rule rel_op");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:570:2: ( p_arith_expr ( ( NL )? rel_op ( NL )? p_arith_expr )* -> ^( COMPARE p_arith_expr ( rel_op p_arith_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:570:4: p_arith_expr ( ( NL )? rel_op ( NL )? p_arith_expr )*
            {
            pushFollow(FOLLOW_p_arith_expr_in_p_rel_expr3652);
            p_arith_expr325=p_arith_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_p_arith_expr.add(p_arith_expr325.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:570:17: ( ( NL )? rel_op ( NL )? p_arith_expr )*
            loop142:
            do {
                int alt142=2;
                int LA142_0 = input.LA(1);

                if ( (LA142_0==NL) ) {
                    int LA142_1 = input.LA(2);

                    if ( ((LA142_1>=A_EQUAL && LA142_1<=U_GREATER_EQ)) ) {
                        alt142=1;
                    }


                }
                else if ( ((LA142_0>=A_EQUAL && LA142_0<=U_GREATER_EQ)) ) {
                    alt142=1;
                }


                switch (alt142) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:570:18: ( NL )? rel_op ( NL )? p_arith_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:570:18: ( NL )?
            	    int alt140=2;
            	    int LA140_0 = input.LA(1);

            	    if ( (LA140_0==NL) ) {
            	        alt140=1;
            	    }
            	    switch (alt140) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:570:18: NL
            	            {
            	            NL326=(Token)match(input,NL,FOLLOW_NL_in_p_rel_expr3655); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL326);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_rel_op_in_p_rel_expr3658);
            	    rel_op327=rel_op();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_rel_op.add(rel_op327.getTree());
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:570:29: ( NL )?
            	    int alt141=2;
            	    int LA141_0 = input.LA(1);

            	    if ( (LA141_0==NL) ) {
            	        alt141=1;
            	    }
            	    switch (alt141) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:570:29: NL
            	            {
            	            NL328=(Token)match(input,NL,FOLLOW_NL_in_p_rel_expr3660); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL328);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_arith_expr_in_p_rel_expr3663);
            	    p_arith_expr329=p_arith_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_p_arith_expr.add(p_arith_expr329.getTree());

            	    }
            	    break;

            	default :
            	    break loop142;
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
            // 570:48: -> ^( COMPARE p_arith_expr ( rel_op p_arith_expr )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:570:51: ^( COMPARE p_arith_expr ( rel_op p_arith_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COMPARE, "COMPARE"), root_1);

                adaptor.addChild(root_1, stream_p_arith_expr.nextTree());
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:570:74: ( rel_op p_arith_expr )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:573:1: rel_op : ( token_EQUAL | token_NOT_EQUAL | GREATER | token_GREATER_EQ | LESS | token_LESS_EQ );
    public final babel17Parser.rel_op_return rel_op() throws RecognitionException {
        babel17Parser.rel_op_return retval = new babel17Parser.rel_op_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token GREATER332=null;
        Token LESS334=null;
        babel17Parser.token_EQUAL_return token_EQUAL330 = null;

        babel17Parser.token_NOT_EQUAL_return token_NOT_EQUAL331 = null;

        babel17Parser.token_GREATER_EQ_return token_GREATER_EQ333 = null;

        babel17Parser.token_LESS_EQ_return token_LESS_EQ335 = null;


        CommonTree GREATER332_tree=null;
        CommonTree LESS334_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:573:8: ( token_EQUAL | token_NOT_EQUAL | GREATER | token_GREATER_EQ | LESS | token_LESS_EQ )
            int alt143=6;
            switch ( input.LA(1) ) {
            case A_EQUAL:
            case U_EQUAL:
                {
                alt143=1;
                }
                break;
            case A_NOT_EQUAL:
            case U_NOT_EQUAL:
                {
                alt143=2;
                }
                break;
            case GREATER:
                {
                alt143=3;
                }
                break;
            case A_GREATER_EQ:
            case U_GREATER_EQ:
                {
                alt143=4;
                }
                break;
            case LESS:
                {
                alt143=5;
                }
                break;
            case A_LESS_EQ:
            case U_LESS_EQ:
                {
                alt143=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 143, 0, input);

                throw nvae;
            }

            switch (alt143) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:573:10: token_EQUAL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_EQUAL_in_rel_op3689);
                    token_EQUAL330=token_EQUAL();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, token_EQUAL330.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:573:24: token_NOT_EQUAL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_NOT_EQUAL_in_rel_op3693);
                    token_NOT_EQUAL331=token_NOT_EQUAL();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, token_NOT_EQUAL331.getTree());

                    }
                    break;
                case 3 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:573:42: GREATER
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    GREATER332=(Token)match(input,GREATER,FOLLOW_GREATER_in_rel_op3697); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    GREATER332_tree = (CommonTree)adaptor.create(GREATER332);
                    adaptor.addChild(root_0, GREATER332_tree);
                    }

                    }
                    break;
                case 4 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:573:52: token_GREATER_EQ
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_GREATER_EQ_in_rel_op3701);
                    token_GREATER_EQ333=token_GREATER_EQ();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, token_GREATER_EQ333.getTree());

                    }
                    break;
                case 5 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:573:71: LESS
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    LESS334=(Token)match(input,LESS,FOLLOW_LESS_in_rel_op3705); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LESS334_tree = (CommonTree)adaptor.create(LESS334);
                    adaptor.addChild(root_0, LESS334_tree);
                    }

                    }
                    break;
                case 6 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:573:78: token_LESS_EQ
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_LESS_EQ_in_rel_op3709);
                    token_LESS_EQ335=token_LESS_EQ();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, token_LESS_EQ335.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:576:1: arith_expr : plusplus_expr ;
    public final babel17Parser.arith_expr_return arith_expr() throws RecognitionException {
        babel17Parser.arith_expr_return retval = new babel17Parser.arith_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.plusplus_expr_return plusplus_expr336 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:577:2: ( plusplus_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:577:4: plusplus_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_plusplus_expr_in_arith_expr3721);
            plusplus_expr336=plusplus_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, plusplus_expr336.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:580:1: p_arith_expr : p_plusplus_expr ;
    public final babel17Parser.p_arith_expr_return p_arith_expr() throws RecognitionException {
        babel17Parser.p_arith_expr_return retval = new babel17Parser.p_arith_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.p_plusplus_expr_return p_plusplus_expr337 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:581:2: ( p_plusplus_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:581:4: p_plusplus_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_plusplus_expr_in_p_arith_expr3731);
            p_plusplus_expr337=p_plusplus_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_plusplus_expr337.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:583:1: plusplus_expr : timestimes_expr ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? timestimes_expr )* ;
    public final babel17Parser.plusplus_expr_return plusplus_expr() throws RecognitionException {
        babel17Parser.plusplus_expr_return retval = new babel17Parser.plusplus_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL339=null;
        Token PLUSPLUS340=null;
        Token MINUSMINUS341=null;
        Token NL342=null;
        babel17Parser.timestimes_expr_return timestimes_expr338 = null;

        babel17Parser.timestimes_expr_return timestimes_expr343 = null;


        CommonTree NL339_tree=null;
        CommonTree PLUSPLUS340_tree=null;
        CommonTree MINUSMINUS341_tree=null;
        CommonTree NL342_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:584:2: ( timestimes_expr ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? timestimes_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:584:4: timestimes_expr ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? timestimes_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_timestimes_expr_in_plusplus_expr3741);
            timestimes_expr338=timestimes_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, timestimes_expr338.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:584:20: ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? timestimes_expr )*
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
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:584:21: ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? timestimes_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:584:23: ( NL )?
            	    int alt144=2;
            	    int LA144_0 = input.LA(1);

            	    if ( (LA144_0==NL) ) {
            	        alt144=1;
            	    }
            	    switch (alt144) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:584:23: NL
            	            {
            	            NL339=(Token)match(input,NL,FOLLOW_NL_in_plusplus_expr3744); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:584:26: ( PLUSPLUS | MINUSMINUS )
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
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:584:27: PLUSPLUS
            	            {
            	            PLUSPLUS340=(Token)match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_plusplus_expr3749); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PLUSPLUS340_tree = (CommonTree)adaptor.create(PLUSPLUS340);
            	            root_0 = (CommonTree)adaptor.becomeRoot(PLUSPLUS340_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:584:37: MINUSMINUS
            	            {
            	            MINUSMINUS341=(Token)match(input,MINUSMINUS,FOLLOW_MINUSMINUS_in_plusplus_expr3752); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            MINUSMINUS341_tree = (CommonTree)adaptor.create(MINUSMINUS341);
            	            root_0 = (CommonTree)adaptor.becomeRoot(MINUSMINUS341_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:584:52: ( NL )?
            	    int alt146=2;
            	    int LA146_0 = input.LA(1);

            	    if ( (LA146_0==NL) ) {
            	        alt146=1;
            	    }
            	    switch (alt146) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:584:52: NL
            	            {
            	            NL342=(Token)match(input,NL,FOLLOW_NL_in_plusplus_expr3756); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_timestimes_expr_in_plusplus_expr3760);
            	    timestimes_expr343=timestimes_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, timestimes_expr343.getTree());

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
    // $ANTLR end "plusplus_expr"

    public static class p_plusplus_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "p_plusplus_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:586:1: p_plusplus_expr : p_timestimes_expr ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? p_timestimes_expr )* ;
    public final babel17Parser.p_plusplus_expr_return p_plusplus_expr() throws RecognitionException {
        babel17Parser.p_plusplus_expr_return retval = new babel17Parser.p_plusplus_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL345=null;
        Token PLUSPLUS346=null;
        Token MINUSMINUS347=null;
        Token NL348=null;
        babel17Parser.p_timestimes_expr_return p_timestimes_expr344 = null;

        babel17Parser.p_timestimes_expr_return p_timestimes_expr349 = null;


        CommonTree NL345_tree=null;
        CommonTree PLUSPLUS346_tree=null;
        CommonTree MINUSMINUS347_tree=null;
        CommonTree NL348_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:587:2: ( p_timestimes_expr ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? p_timestimes_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:587:4: p_timestimes_expr ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? p_timestimes_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_timestimes_expr_in_p_plusplus_expr3772);
            p_timestimes_expr344=p_timestimes_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_timestimes_expr344.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:587:22: ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? p_timestimes_expr )*
            loop151:
            do {
                int alt151=2;
                int LA151_0 = input.LA(1);

                if ( (LA151_0==NL) ) {
                    int LA151_1 = input.LA(2);

                    if ( ((LA151_1>=PLUSPLUS && LA151_1<=MINUSMINUS)) ) {
                        alt151=1;
                    }


                }
                else if ( ((LA151_0>=PLUSPLUS && LA151_0<=MINUSMINUS)) ) {
                    alt151=1;
                }


                switch (alt151) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:587:23: ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? p_timestimes_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:587:25: ( NL )?
            	    int alt148=2;
            	    int LA148_0 = input.LA(1);

            	    if ( (LA148_0==NL) ) {
            	        alt148=1;
            	    }
            	    switch (alt148) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:587:25: NL
            	            {
            	            NL345=(Token)match(input,NL,FOLLOW_NL_in_p_plusplus_expr3775); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:587:28: ( PLUSPLUS | MINUSMINUS )
            	    int alt149=2;
            	    int LA149_0 = input.LA(1);

            	    if ( (LA149_0==PLUSPLUS) ) {
            	        alt149=1;
            	    }
            	    else if ( (LA149_0==MINUSMINUS) ) {
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
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:587:29: PLUSPLUS
            	            {
            	            PLUSPLUS346=(Token)match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_p_plusplus_expr3780); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PLUSPLUS346_tree = (CommonTree)adaptor.create(PLUSPLUS346);
            	            root_0 = (CommonTree)adaptor.becomeRoot(PLUSPLUS346_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:587:39: MINUSMINUS
            	            {
            	            MINUSMINUS347=(Token)match(input,MINUSMINUS,FOLLOW_MINUSMINUS_in_p_plusplus_expr3783); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            MINUSMINUS347_tree = (CommonTree)adaptor.create(MINUSMINUS347);
            	            root_0 = (CommonTree)adaptor.becomeRoot(MINUSMINUS347_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:587:54: ( NL )?
            	    int alt150=2;
            	    int LA150_0 = input.LA(1);

            	    if ( (LA150_0==NL) ) {
            	        alt150=1;
            	    }
            	    switch (alt150) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:587:54: NL
            	            {
            	            NL348=(Token)match(input,NL,FOLLOW_NL_in_p_plusplus_expr3787); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_timestimes_expr_in_p_plusplus_expr3791);
            	    p_timestimes_expr349=p_timestimes_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_timestimes_expr349.getTree());

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
    // $ANTLR end "p_plusplus_expr"

    public static class timestimes_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "timestimes_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:590:1: timestimes_expr : simple_expr ( ( NL )? ( TIMESTIMES | QUOTIENTQUOTIENT ) ( NL )? simple_expr )* ;
    public final babel17Parser.timestimes_expr_return timestimes_expr() throws RecognitionException {
        babel17Parser.timestimes_expr_return retval = new babel17Parser.timestimes_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL351=null;
        Token TIMESTIMES352=null;
        Token QUOTIENTQUOTIENT353=null;
        Token NL354=null;
        babel17Parser.simple_expr_return simple_expr350 = null;

        babel17Parser.simple_expr_return simple_expr355 = null;


        CommonTree NL351_tree=null;
        CommonTree TIMESTIMES352_tree=null;
        CommonTree QUOTIENTQUOTIENT353_tree=null;
        CommonTree NL354_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:591:2: ( simple_expr ( ( NL )? ( TIMESTIMES | QUOTIENTQUOTIENT ) ( NL )? simple_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:591:4: simple_expr ( ( NL )? ( TIMESTIMES | QUOTIENTQUOTIENT ) ( NL )? simple_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_simple_expr_in_timestimes_expr3803);
            simple_expr350=simple_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, simple_expr350.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:591:16: ( ( NL )? ( TIMESTIMES | QUOTIENTQUOTIENT ) ( NL )? simple_expr )*
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
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:591:17: ( NL )? ( TIMESTIMES | QUOTIENTQUOTIENT ) ( NL )? simple_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:591:19: ( NL )?
            	    int alt152=2;
            	    int LA152_0 = input.LA(1);

            	    if ( (LA152_0==NL) ) {
            	        alt152=1;
            	    }
            	    switch (alt152) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:591:19: NL
            	            {
            	            NL351=(Token)match(input,NL,FOLLOW_NL_in_timestimes_expr3806); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:591:22: ( TIMESTIMES | QUOTIENTQUOTIENT )
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
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:591:23: TIMESTIMES
            	            {
            	            TIMESTIMES352=(Token)match(input,TIMESTIMES,FOLLOW_TIMESTIMES_in_timestimes_expr3811); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            TIMESTIMES352_tree = (CommonTree)adaptor.create(TIMESTIMES352);
            	            root_0 = (CommonTree)adaptor.becomeRoot(TIMESTIMES352_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:591:35: QUOTIENTQUOTIENT
            	            {
            	            QUOTIENTQUOTIENT353=(Token)match(input,QUOTIENTQUOTIENT,FOLLOW_QUOTIENTQUOTIENT_in_timestimes_expr3814); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            QUOTIENTQUOTIENT353_tree = (CommonTree)adaptor.create(QUOTIENTQUOTIENT353);
            	            root_0 = (CommonTree)adaptor.becomeRoot(QUOTIENTQUOTIENT353_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:591:56: ( NL )?
            	    int alt154=2;
            	    int LA154_0 = input.LA(1);

            	    if ( (LA154_0==NL) ) {
            	        alt154=1;
            	    }
            	    switch (alt154) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:591:56: NL
            	            {
            	            NL354=(Token)match(input,NL,FOLLOW_NL_in_timestimes_expr3818); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_simple_expr_in_timestimes_expr3822);
            	    simple_expr355=simple_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, simple_expr355.getTree());

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
    // $ANTLR end "timestimes_expr"

    public static class p_timestimes_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "p_timestimes_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:593:1: p_timestimes_expr : p_simple_expr ( ( NL )? ( TIMESTIMES | QUOTIENTQUOTIENT ) ( NL )? p_simple_expr )* ;
    public final babel17Parser.p_timestimes_expr_return p_timestimes_expr() throws RecognitionException {
        babel17Parser.p_timestimes_expr_return retval = new babel17Parser.p_timestimes_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL357=null;
        Token TIMESTIMES358=null;
        Token QUOTIENTQUOTIENT359=null;
        Token NL360=null;
        babel17Parser.p_simple_expr_return p_simple_expr356 = null;

        babel17Parser.p_simple_expr_return p_simple_expr361 = null;


        CommonTree NL357_tree=null;
        CommonTree TIMESTIMES358_tree=null;
        CommonTree QUOTIENTQUOTIENT359_tree=null;
        CommonTree NL360_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:594:2: ( p_simple_expr ( ( NL )? ( TIMESTIMES | QUOTIENTQUOTIENT ) ( NL )? p_simple_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:594:4: p_simple_expr ( ( NL )? ( TIMESTIMES | QUOTIENTQUOTIENT ) ( NL )? p_simple_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_simple_expr_in_p_timestimes_expr3835);
            p_simple_expr356=p_simple_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_simple_expr356.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:594:18: ( ( NL )? ( TIMESTIMES | QUOTIENTQUOTIENT ) ( NL )? p_simple_expr )*
            loop159:
            do {
                int alt159=2;
                int LA159_0 = input.LA(1);

                if ( (LA159_0==NL) ) {
                    int LA159_1 = input.LA(2);

                    if ( ((LA159_1>=TIMESTIMES && LA159_1<=QUOTIENTQUOTIENT)) ) {
                        alt159=1;
                    }


                }
                else if ( ((LA159_0>=TIMESTIMES && LA159_0<=QUOTIENTQUOTIENT)) ) {
                    alt159=1;
                }


                switch (alt159) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:594:19: ( NL )? ( TIMESTIMES | QUOTIENTQUOTIENT ) ( NL )? p_simple_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:594:21: ( NL )?
            	    int alt156=2;
            	    int LA156_0 = input.LA(1);

            	    if ( (LA156_0==NL) ) {
            	        alt156=1;
            	    }
            	    switch (alt156) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:594:21: NL
            	            {
            	            NL357=(Token)match(input,NL,FOLLOW_NL_in_p_timestimes_expr3838); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:594:24: ( TIMESTIMES | QUOTIENTQUOTIENT )
            	    int alt157=2;
            	    int LA157_0 = input.LA(1);

            	    if ( (LA157_0==TIMESTIMES) ) {
            	        alt157=1;
            	    }
            	    else if ( (LA157_0==QUOTIENTQUOTIENT) ) {
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
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:594:25: TIMESTIMES
            	            {
            	            TIMESTIMES358=(Token)match(input,TIMESTIMES,FOLLOW_TIMESTIMES_in_p_timestimes_expr3843); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            TIMESTIMES358_tree = (CommonTree)adaptor.create(TIMESTIMES358);
            	            root_0 = (CommonTree)adaptor.becomeRoot(TIMESTIMES358_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:594:37: QUOTIENTQUOTIENT
            	            {
            	            QUOTIENTQUOTIENT359=(Token)match(input,QUOTIENTQUOTIENT,FOLLOW_QUOTIENTQUOTIENT_in_p_timestimes_expr3846); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            QUOTIENTQUOTIENT359_tree = (CommonTree)adaptor.create(QUOTIENTQUOTIENT359);
            	            root_0 = (CommonTree)adaptor.becomeRoot(QUOTIENTQUOTIENT359_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:594:58: ( NL )?
            	    int alt158=2;
            	    int LA158_0 = input.LA(1);

            	    if ( (LA158_0==NL) ) {
            	        alt158=1;
            	    }
            	    switch (alt158) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:594:58: NL
            	            {
            	            NL360=(Token)match(input,NL,FOLLOW_NL_in_p_timestimes_expr3850); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_simple_expr_in_p_timestimes_expr3854);
            	    p_simple_expr361=p_simple_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_simple_expr361.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:596:1: simple_expr : cons_expr ;
    public final babel17Parser.simple_expr_return simple_expr() throws RecognitionException {
        babel17Parser.simple_expr_return retval = new babel17Parser.simple_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.cons_expr_return cons_expr362 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:597:2: ( cons_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:597:4: cons_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_cons_expr_in_simple_expr3865);
            cons_expr362=cons_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, cons_expr362.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:599:1: p_simple_expr : p_cons_expr ;
    public final babel17Parser.p_simple_expr_return p_simple_expr() throws RecognitionException {
        babel17Parser.p_simple_expr_return retval = new babel17Parser.p_simple_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.p_cons_expr_return p_cons_expr363 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:600:2: ( p_cons_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:600:4: p_cons_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_cons_expr_in_p_simple_expr3874);
            p_cons_expr363=p_cons_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_cons_expr363.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:602:1: cons_expr : to_expr ( ( NL )? token_DOUBLE_COLON ( NL )? to_expr )* -> ^( LIST_CONS ( to_expr )* ) ;
    public final babel17Parser.cons_expr_return cons_expr() throws RecognitionException {
        babel17Parser.cons_expr_return retval = new babel17Parser.cons_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL365=null;
        Token NL367=null;
        babel17Parser.to_expr_return to_expr364 = null;

        babel17Parser.token_DOUBLE_COLON_return token_DOUBLE_COLON366 = null;

        babel17Parser.to_expr_return to_expr368 = null;


        CommonTree NL365_tree=null;
        CommonTree NL367_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_token_DOUBLE_COLON=new RewriteRuleSubtreeStream(adaptor,"rule token_DOUBLE_COLON");
        RewriteRuleSubtreeStream stream_to_expr=new RewriteRuleSubtreeStream(adaptor,"rule to_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:603:2: ( to_expr ( ( NL )? token_DOUBLE_COLON ( NL )? to_expr )* -> ^( LIST_CONS ( to_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:603:4: to_expr ( ( NL )? token_DOUBLE_COLON ( NL )? to_expr )*
            {
            pushFollow(FOLLOW_to_expr_in_cons_expr3883);
            to_expr364=to_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_to_expr.add(to_expr364.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:603:12: ( ( NL )? token_DOUBLE_COLON ( NL )? to_expr )*
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
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:603:13: ( NL )? token_DOUBLE_COLON ( NL )? to_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:603:13: ( NL )?
            	    int alt160=2;
            	    int LA160_0 = input.LA(1);

            	    if ( (LA160_0==NL) ) {
            	        alt160=1;
            	    }
            	    switch (alt160) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:603:13: NL
            	            {
            	            NL365=(Token)match(input,NL,FOLLOW_NL_in_cons_expr3886); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL365);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_token_DOUBLE_COLON_in_cons_expr3889);
            	    token_DOUBLE_COLON366=token_DOUBLE_COLON();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_token_DOUBLE_COLON.add(token_DOUBLE_COLON366.getTree());
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:603:36: ( NL )?
            	    int alt161=2;
            	    int LA161_0 = input.LA(1);

            	    if ( (LA161_0==NL) ) {
            	        alt161=1;
            	    }
            	    switch (alt161) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:603:36: NL
            	            {
            	            NL367=(Token)match(input,NL,FOLLOW_NL_in_cons_expr3891); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL367);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_to_expr_in_cons_expr3894);
            	    to_expr368=to_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_to_expr.add(to_expr368.getTree());

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
            // 603:50: -> ^( LIST_CONS ( to_expr )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:603:53: ^( LIST_CONS ( to_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LIST_CONS, "LIST_CONS"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:603:65: ( to_expr )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:605:1: p_cons_expr : p_to_expr ( ( NL )? token_DOUBLE_COLON ( NL )? p_to_expr )* -> ^( LIST_CONS ( p_to_expr )* ) ;
    public final babel17Parser.p_cons_expr_return p_cons_expr() throws RecognitionException {
        babel17Parser.p_cons_expr_return retval = new babel17Parser.p_cons_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL370=null;
        Token NL372=null;
        babel17Parser.p_to_expr_return p_to_expr369 = null;

        babel17Parser.token_DOUBLE_COLON_return token_DOUBLE_COLON371 = null;

        babel17Parser.p_to_expr_return p_to_expr373 = null;


        CommonTree NL370_tree=null;
        CommonTree NL372_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_p_to_expr=new RewriteRuleSubtreeStream(adaptor,"rule p_to_expr");
        RewriteRuleSubtreeStream stream_token_DOUBLE_COLON=new RewriteRuleSubtreeStream(adaptor,"rule token_DOUBLE_COLON");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:606:2: ( p_to_expr ( ( NL )? token_DOUBLE_COLON ( NL )? p_to_expr )* -> ^( LIST_CONS ( p_to_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:606:4: p_to_expr ( ( NL )? token_DOUBLE_COLON ( NL )? p_to_expr )*
            {
            pushFollow(FOLLOW_p_to_expr_in_p_cons_expr3914);
            p_to_expr369=p_to_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_p_to_expr.add(p_to_expr369.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:606:14: ( ( NL )? token_DOUBLE_COLON ( NL )? p_to_expr )*
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
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:606:15: ( NL )? token_DOUBLE_COLON ( NL )? p_to_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:606:15: ( NL )?
            	    int alt163=2;
            	    int LA163_0 = input.LA(1);

            	    if ( (LA163_0==NL) ) {
            	        alt163=1;
            	    }
            	    switch (alt163) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:606:15: NL
            	            {
            	            NL370=(Token)match(input,NL,FOLLOW_NL_in_p_cons_expr3917); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL370);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_token_DOUBLE_COLON_in_p_cons_expr3920);
            	    token_DOUBLE_COLON371=token_DOUBLE_COLON();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_token_DOUBLE_COLON.add(token_DOUBLE_COLON371.getTree());
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:606:38: ( NL )?
            	    int alt164=2;
            	    int LA164_0 = input.LA(1);

            	    if ( (LA164_0==NL) ) {
            	        alt164=1;
            	    }
            	    switch (alt164) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:606:38: NL
            	            {
            	            NL372=(Token)match(input,NL,FOLLOW_NL_in_p_cons_expr3922); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL372);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_to_expr_in_p_cons_expr3925);
            	    p_to_expr373=p_to_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_p_to_expr.add(p_to_expr373.getTree());

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
            // 606:54: -> ^( LIST_CONS ( p_to_expr )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:606:57: ^( LIST_CONS ( p_to_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LIST_CONS, "LIST_CONS"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:606:69: ( p_to_expr )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:609:1: to_expr : arith_plus_expr ( ( NL )? ( L_to | L_downto ) ( NL )? arith_plus_expr )? ;
    public final babel17Parser.to_expr_return to_expr() throws RecognitionException {
        babel17Parser.to_expr_return retval = new babel17Parser.to_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL375=null;
        Token L_to376=null;
        Token L_downto377=null;
        Token NL378=null;
        babel17Parser.arith_plus_expr_return arith_plus_expr374 = null;

        babel17Parser.arith_plus_expr_return arith_plus_expr379 = null;


        CommonTree NL375_tree=null;
        CommonTree L_to376_tree=null;
        CommonTree L_downto377_tree=null;
        CommonTree NL378_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:609:9: ( arith_plus_expr ( ( NL )? ( L_to | L_downto ) ( NL )? arith_plus_expr )? )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:609:11: arith_plus_expr ( ( NL )? ( L_to | L_downto ) ( NL )? arith_plus_expr )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_arith_plus_expr_in_to_expr3945);
            arith_plus_expr374=arith_plus_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, arith_plus_expr374.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:609:27: ( ( NL )? ( L_to | L_downto ) ( NL )? arith_plus_expr )?
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:609:28: ( NL )? ( L_to | L_downto ) ( NL )? arith_plus_expr
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:609:30: ( NL )?
                    int alt166=2;
                    int LA166_0 = input.LA(1);

                    if ( (LA166_0==NL) ) {
                        alt166=1;
                    }
                    switch (alt166) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:609:30: NL
                            {
                            NL375=(Token)match(input,NL,FOLLOW_NL_in_to_expr3948); if (state.failed) return retval;

                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:609:33: ( L_to | L_downto )
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
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:609:34: L_to
                            {
                            L_to376=(Token)match(input,L_to,FOLLOW_L_to_in_to_expr3953); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            L_to376_tree = (CommonTree)adaptor.create(L_to376);
                            root_0 = (CommonTree)adaptor.becomeRoot(L_to376_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:609:41: L_downto
                            {
                            L_downto377=(Token)match(input,L_downto,FOLLOW_L_downto_in_to_expr3957); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            L_downto377_tree = (CommonTree)adaptor.create(L_downto377);
                            root_0 = (CommonTree)adaptor.becomeRoot(L_downto377_tree, root_0);
                            }

                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:609:54: ( NL )?
                    int alt168=2;
                    int LA168_0 = input.LA(1);

                    if ( (LA168_0==NL) ) {
                        alt168=1;
                    }
                    switch (alt168) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:609:54: NL
                            {
                            NL378=(Token)match(input,NL,FOLLOW_NL_in_to_expr3961); if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_arith_plus_expr_in_to_expr3965);
                    arith_plus_expr379=arith_plus_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arith_plus_expr379.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:611:1: p_to_expr : p_arith_plus_expr ( ( NL )? ( L_to | L_downto ) ( NL )? p_arith_plus_expr )? ;
    public final babel17Parser.p_to_expr_return p_to_expr() throws RecognitionException {
        babel17Parser.p_to_expr_return retval = new babel17Parser.p_to_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL381=null;
        Token L_to382=null;
        Token L_downto383=null;
        Token NL384=null;
        babel17Parser.p_arith_plus_expr_return p_arith_plus_expr380 = null;

        babel17Parser.p_arith_plus_expr_return p_arith_plus_expr385 = null;


        CommonTree NL381_tree=null;
        CommonTree L_to382_tree=null;
        CommonTree L_downto383_tree=null;
        CommonTree NL384_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:612:2: ( p_arith_plus_expr ( ( NL )? ( L_to | L_downto ) ( NL )? p_arith_plus_expr )? )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:612:4: p_arith_plus_expr ( ( NL )? ( L_to | L_downto ) ( NL )? p_arith_plus_expr )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_arith_plus_expr_in_p_to_expr3978);
            p_arith_plus_expr380=p_arith_plus_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_arith_plus_expr380.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:612:22: ( ( NL )? ( L_to | L_downto ) ( NL )? p_arith_plus_expr )?
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:612:23: ( NL )? ( L_to | L_downto ) ( NL )? p_arith_plus_expr
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:612:25: ( NL )?
                    int alt170=2;
                    int LA170_0 = input.LA(1);

                    if ( (LA170_0==NL) ) {
                        alt170=1;
                    }
                    switch (alt170) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:612:25: NL
                            {
                            NL381=(Token)match(input,NL,FOLLOW_NL_in_p_to_expr3981); if (state.failed) return retval;

                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:612:28: ( L_to | L_downto )
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
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:612:29: L_to
                            {
                            L_to382=(Token)match(input,L_to,FOLLOW_L_to_in_p_to_expr3986); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            L_to382_tree = (CommonTree)adaptor.create(L_to382);
                            root_0 = (CommonTree)adaptor.becomeRoot(L_to382_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:612:36: L_downto
                            {
                            L_downto383=(Token)match(input,L_downto,FOLLOW_L_downto_in_p_to_expr3990); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            L_downto383_tree = (CommonTree)adaptor.create(L_downto383);
                            root_0 = (CommonTree)adaptor.becomeRoot(L_downto383_tree, root_0);
                            }

                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:612:49: ( NL )?
                    int alt172=2;
                    int LA172_0 = input.LA(1);

                    if ( (LA172_0==NL) ) {
                        alt172=1;
                    }
                    switch (alt172) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:612:49: NL
                            {
                            NL384=(Token)match(input,NL,FOLLOW_NL_in_p_to_expr3994); if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_p_arith_plus_expr_in_p_to_expr3998);
                    p_arith_plus_expr385=p_arith_plus_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_arith_plus_expr385.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:614:1: arith_plus_expr : arith_uminus_expr ( ( ( NL )? PLUS | MINUS ) ( NL )? arith_uminus_expr )* ;
    public final babel17Parser.arith_plus_expr_return arith_plus_expr() throws RecognitionException {
        babel17Parser.arith_plus_expr_return retval = new babel17Parser.arith_plus_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL387=null;
        Token PLUS388=null;
        Token MINUS389=null;
        Token NL390=null;
        babel17Parser.arith_uminus_expr_return arith_uminus_expr386 = null;

        babel17Parser.arith_uminus_expr_return arith_uminus_expr391 = null;


        CommonTree NL387_tree=null;
        CommonTree PLUS388_tree=null;
        CommonTree MINUS389_tree=null;
        CommonTree NL390_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:615:2: ( arith_uminus_expr ( ( ( NL )? PLUS | MINUS ) ( NL )? arith_uminus_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:615:4: arith_uminus_expr ( ( ( NL )? PLUS | MINUS ) ( NL )? arith_uminus_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_arith_uminus_expr_in_arith_plus_expr4010);
            arith_uminus_expr386=arith_uminus_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, arith_uminus_expr386.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:615:22: ( ( ( NL )? PLUS | MINUS ) ( NL )? arith_uminus_expr )*
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
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:615:23: ( ( NL )? PLUS | MINUS ) ( NL )? arith_uminus_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:615:23: ( ( NL )? PLUS | MINUS )
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
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:615:24: ( NL )? PLUS
            	            {
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:615:26: ( NL )?
            	            int alt174=2;
            	            int LA174_0 = input.LA(1);

            	            if ( (LA174_0==NL) ) {
            	                alt174=1;
            	            }
            	            switch (alt174) {
            	                case 1 :
            	                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:615:26: NL
            	                    {
            	                    NL387=(Token)match(input,NL,FOLLOW_NL_in_arith_plus_expr4014); if (state.failed) return retval;

            	                    }
            	                    break;

            	            }

            	            PLUS388=(Token)match(input,PLUS,FOLLOW_PLUS_in_arith_plus_expr4018); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PLUS388_tree = (CommonTree)adaptor.create(PLUS388);
            	            root_0 = (CommonTree)adaptor.becomeRoot(PLUS388_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:615:37: MINUS
            	            {
            	            MINUS389=(Token)match(input,MINUS,FOLLOW_MINUS_in_arith_plus_expr4023); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            MINUS389_tree = (CommonTree)adaptor.create(MINUS389);
            	            root_0 = (CommonTree)adaptor.becomeRoot(MINUS389_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:615:47: ( NL )?
            	    int alt176=2;
            	    int LA176_0 = input.LA(1);

            	    if ( (LA176_0==NL) ) {
            	        alt176=1;
            	    }
            	    switch (alt176) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:615:47: NL
            	            {
            	            NL390=(Token)match(input,NL,FOLLOW_NL_in_arith_plus_expr4027); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_arith_uminus_expr_in_arith_plus_expr4031);
            	    arith_uminus_expr391=arith_uminus_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, arith_uminus_expr391.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:617:1: p_arith_plus_expr : p_arith_uminus_expr ( ( NL )? ( PLUS | MINUS ) ( NL )? p_arith_uminus_expr )* ;
    public final babel17Parser.p_arith_plus_expr_return p_arith_plus_expr() throws RecognitionException {
        babel17Parser.p_arith_plus_expr_return retval = new babel17Parser.p_arith_plus_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL393=null;
        Token set394=null;
        Token NL395=null;
        babel17Parser.p_arith_uminus_expr_return p_arith_uminus_expr392 = null;

        babel17Parser.p_arith_uminus_expr_return p_arith_uminus_expr396 = null;


        CommonTree NL393_tree=null;
        CommonTree set394_tree=null;
        CommonTree NL395_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:618:2: ( p_arith_uminus_expr ( ( NL )? ( PLUS | MINUS ) ( NL )? p_arith_uminus_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:618:4: p_arith_uminus_expr ( ( NL )? ( PLUS | MINUS ) ( NL )? p_arith_uminus_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_arith_uminus_expr_in_p_arith_plus_expr4042);
            p_arith_uminus_expr392=p_arith_uminus_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_arith_uminus_expr392.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:618:24: ( ( NL )? ( PLUS | MINUS ) ( NL )? p_arith_uminus_expr )*
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
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:618:25: ( NL )? ( PLUS | MINUS ) ( NL )? p_arith_uminus_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:618:27: ( NL )?
            	    int alt178=2;
            	    int LA178_0 = input.LA(1);

            	    if ( (LA178_0==NL) ) {
            	        alt178=1;
            	    }
            	    switch (alt178) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:618:27: NL
            	            {
            	            NL393=(Token)match(input,NL,FOLLOW_NL_in_p_arith_plus_expr4045); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    set394=(Token)input.LT(1);
            	    set394=(Token)input.LT(1);
            	    if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set394), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:618:48: ( NL )?
            	    int alt179=2;
            	    int LA179_0 = input.LA(1);

            	    if ( (LA179_0==NL) ) {
            	        alt179=1;
            	    }
            	    switch (alt179) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:618:48: NL
            	            {
            	            NL395=(Token)match(input,NL,FOLLOW_NL_in_p_arith_plus_expr4058); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_arith_uminus_expr_in_p_arith_plus_expr4062);
            	    p_arith_uminus_expr396=p_arith_uminus_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_arith_uminus_expr396.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:620:1: arith_uminus_expr : ( MINUS ( NL )? arith_mult_expr -> ^( UMINUS arith_mult_expr ) | arith_mult_expr );
    public final babel17Parser.arith_uminus_expr_return arith_uminus_expr() throws RecognitionException {
        babel17Parser.arith_uminus_expr_return retval = new babel17Parser.arith_uminus_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token MINUS397=null;
        Token NL398=null;
        babel17Parser.arith_mult_expr_return arith_mult_expr399 = null;

        babel17Parser.arith_mult_expr_return arith_mult_expr400 = null;


        CommonTree MINUS397_tree=null;
        CommonTree NL398_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleSubtreeStream stream_arith_mult_expr=new RewriteRuleSubtreeStream(adaptor,"rule arith_mult_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:621:2: ( MINUS ( NL )? arith_mult_expr -> ^( UMINUS arith_mult_expr ) | arith_mult_expr )
            int alt182=2;
            int LA182_0 = input.LA(1);

            if ( (LA182_0==MINUS) ) {
                alt182=1;
            }
            else if ( (LA182_0==L_begin||(LA182_0>=L_with && LA182_0<=L_if)||(LA182_0>=L_while && LA182_0<=L_for)||LA182_0==L_match||LA182_0==L_try||(LA182_0>=A_infinity && LA182_0<=U_infinity)||(LA182_0>=L_true && LA182_0<=L_this)||LA182_0==L_nil||(LA182_0>=Constr && LA182_0<=Num)||(LA182_0>=String && LA182_0<=ROUND_BRACKET_OPEN)||LA182_0==SQUARE_BRACKET_OPEN||LA182_0==CURLY_BRACKET_OPEN) ) {
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:621:4: MINUS ( NL )? arith_mult_expr
                    {
                    MINUS397=(Token)match(input,MINUS,FOLLOW_MINUS_in_arith_uminus_expr4075); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(MINUS397);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:621:10: ( NL )?
                    int alt181=2;
                    int LA181_0 = input.LA(1);

                    if ( (LA181_0==NL) ) {
                        alt181=1;
                    }
                    switch (alt181) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:621:10: NL
                            {
                            NL398=(Token)match(input,NL,FOLLOW_NL_in_arith_uminus_expr4077); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL398);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_arith_mult_expr_in_arith_uminus_expr4080);
                    arith_mult_expr399=arith_mult_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_arith_mult_expr.add(arith_mult_expr399.getTree());


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
                    // 621:30: -> ^( UMINUS arith_mult_expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:621:33: ^( UMINUS arith_mult_expr )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:622:4: arith_mult_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_arith_mult_expr_in_arith_uminus_expr4093);
                    arith_mult_expr400=arith_mult_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arith_mult_expr400.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:624:1: p_arith_uminus_expr : ( MINUS ( NL )? p_arith_mult_expr -> ^( UMINUS p_arith_mult_expr ) | p_arith_mult_expr );
    public final babel17Parser.p_arith_uminus_expr_return p_arith_uminus_expr() throws RecognitionException {
        babel17Parser.p_arith_uminus_expr_return retval = new babel17Parser.p_arith_uminus_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token MINUS401=null;
        Token NL402=null;
        babel17Parser.p_arith_mult_expr_return p_arith_mult_expr403 = null;

        babel17Parser.p_arith_mult_expr_return p_arith_mult_expr404 = null;


        CommonTree MINUS401_tree=null;
        CommonTree NL402_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleSubtreeStream stream_p_arith_mult_expr=new RewriteRuleSubtreeStream(adaptor,"rule p_arith_mult_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:625:2: ( MINUS ( NL )? p_arith_mult_expr -> ^( UMINUS p_arith_mult_expr ) | p_arith_mult_expr )
            int alt184=2;
            int LA184_0 = input.LA(1);

            if ( (LA184_0==MINUS) ) {
                alt184=1;
            }
            else if ( (LA184_0==L_begin||(LA184_0>=L_with && LA184_0<=L_if)||(LA184_0>=L_while && LA184_0<=L_for)||LA184_0==L_match||LA184_0==L_try||(LA184_0>=A_infinity && LA184_0<=U_infinity)||(LA184_0>=L_true && LA184_0<=L_this)||LA184_0==L_nil||(LA184_0>=Constr && LA184_0<=Num)||(LA184_0>=String && LA184_0<=ROUND_BRACKET_OPEN)||LA184_0==SQUARE_BRACKET_OPEN||LA184_0==CURLY_BRACKET_OPEN) ) {
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:625:4: MINUS ( NL )? p_arith_mult_expr
                    {
                    MINUS401=(Token)match(input,MINUS,FOLLOW_MINUS_in_p_arith_uminus_expr4104); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(MINUS401);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:625:10: ( NL )?
                    int alt183=2;
                    int LA183_0 = input.LA(1);

                    if ( (LA183_0==NL) ) {
                        alt183=1;
                    }
                    switch (alt183) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:625:10: NL
                            {
                            NL402=(Token)match(input,NL,FOLLOW_NL_in_p_arith_uminus_expr4106); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL402);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_p_arith_mult_expr_in_p_arith_uminus_expr4109);
                    p_arith_mult_expr403=p_arith_mult_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_p_arith_mult_expr.add(p_arith_mult_expr403.getTree());


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
                    // 625:32: -> ^( UMINUS p_arith_mult_expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:625:35: ^( UMINUS p_arith_mult_expr )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:626:4: p_arith_mult_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_p_arith_mult_expr_in_p_arith_uminus_expr4122);
                    p_arith_mult_expr404=p_arith_mult_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_arith_mult_expr404.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:628:1: arith_mult_expr : arith_pow_expr ( ( NL )? ( TIMES | QUOTIENT | L_div | L_mod ) ( NL )? arith_pow_expr )* ;
    public final babel17Parser.arith_mult_expr_return arith_mult_expr() throws RecognitionException {
        babel17Parser.arith_mult_expr_return retval = new babel17Parser.arith_mult_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL406=null;
        Token set407=null;
        Token NL408=null;
        babel17Parser.arith_pow_expr_return arith_pow_expr405 = null;

        babel17Parser.arith_pow_expr_return arith_pow_expr409 = null;


        CommonTree NL406_tree=null;
        CommonTree set407_tree=null;
        CommonTree NL408_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:629:2: ( arith_pow_expr ( ( NL )? ( TIMES | QUOTIENT | L_div | L_mod ) ( NL )? arith_pow_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:629:4: arith_pow_expr ( ( NL )? ( TIMES | QUOTIENT | L_div | L_mod ) ( NL )? arith_pow_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_arith_pow_expr_in_arith_mult_expr4131);
            arith_pow_expr405=arith_pow_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, arith_pow_expr405.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:629:19: ( ( NL )? ( TIMES | QUOTIENT | L_div | L_mod ) ( NL )? arith_pow_expr )*
            loop187:
            do {
                int alt187=2;
                int LA187_0 = input.LA(1);

                if ( (LA187_0==NL) ) {
                    int LA187_1 = input.LA(2);

                    if ( ((LA187_1>=L_div && LA187_1<=L_mod)||(LA187_1>=TIMES && LA187_1<=QUOTIENT)) ) {
                        alt187=1;
                    }


                }
                else if ( ((LA187_0>=L_div && LA187_0<=L_mod)||(LA187_0>=TIMES && LA187_0<=QUOTIENT)) ) {
                    alt187=1;
                }


                switch (alt187) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:629:20: ( NL )? ( TIMES | QUOTIENT | L_div | L_mod ) ( NL )? arith_pow_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:629:22: ( NL )?
            	    int alt185=2;
            	    int LA185_0 = input.LA(1);

            	    if ( (LA185_0==NL) ) {
            	        alt185=1;
            	    }
            	    switch (alt185) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:629:22: NL
            	            {
            	            NL406=(Token)match(input,NL,FOLLOW_NL_in_arith_mult_expr4134); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    set407=(Token)input.LT(1);
            	    set407=(Token)input.LT(1);
            	    if ( (input.LA(1)>=L_div && input.LA(1)<=L_mod)||(input.LA(1)>=TIMES && input.LA(1)<=QUOTIENT) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set407), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:629:63: ( NL )?
            	    int alt186=2;
            	    int LA186_0 = input.LA(1);

            	    if ( (LA186_0==NL) ) {
            	        alt186=1;
            	    }
            	    switch (alt186) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:629:63: NL
            	            {
            	            NL408=(Token)match(input,NL,FOLLOW_NL_in_arith_mult_expr4155); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_arith_pow_expr_in_arith_mult_expr4159);
            	    arith_pow_expr409=arith_pow_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, arith_pow_expr409.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:631:1: p_arith_mult_expr : p_arith_pow_expr ( ( NL )? ( TIMES | QUOTIENT | L_div | L_mod ) ( NL )? p_arith_pow_expr )* ;
    public final babel17Parser.p_arith_mult_expr_return p_arith_mult_expr() throws RecognitionException {
        babel17Parser.p_arith_mult_expr_return retval = new babel17Parser.p_arith_mult_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL411=null;
        Token set412=null;
        Token NL413=null;
        babel17Parser.p_arith_pow_expr_return p_arith_pow_expr410 = null;

        babel17Parser.p_arith_pow_expr_return p_arith_pow_expr414 = null;


        CommonTree NL411_tree=null;
        CommonTree set412_tree=null;
        CommonTree NL413_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:632:2: ( p_arith_pow_expr ( ( NL )? ( TIMES | QUOTIENT | L_div | L_mod ) ( NL )? p_arith_pow_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:632:4: p_arith_pow_expr ( ( NL )? ( TIMES | QUOTIENT | L_div | L_mod ) ( NL )? p_arith_pow_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_arith_pow_expr_in_p_arith_mult_expr4171);
            p_arith_pow_expr410=p_arith_pow_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_arith_pow_expr410.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:632:21: ( ( NL )? ( TIMES | QUOTIENT | L_div | L_mod ) ( NL )? p_arith_pow_expr )*
            loop190:
            do {
                int alt190=2;
                int LA190_0 = input.LA(1);

                if ( (LA190_0==NL) ) {
                    int LA190_1 = input.LA(2);

                    if ( ((LA190_1>=L_div && LA190_1<=L_mod)||(LA190_1>=TIMES && LA190_1<=QUOTIENT)) ) {
                        alt190=1;
                    }


                }
                else if ( ((LA190_0>=L_div && LA190_0<=L_mod)||(LA190_0>=TIMES && LA190_0<=QUOTIENT)) ) {
                    alt190=1;
                }


                switch (alt190) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:632:22: ( NL )? ( TIMES | QUOTIENT | L_div | L_mod ) ( NL )? p_arith_pow_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:632:24: ( NL )?
            	    int alt188=2;
            	    int LA188_0 = input.LA(1);

            	    if ( (LA188_0==NL) ) {
            	        alt188=1;
            	    }
            	    switch (alt188) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:632:24: NL
            	            {
            	            NL411=(Token)match(input,NL,FOLLOW_NL_in_p_arith_mult_expr4174); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    set412=(Token)input.LT(1);
            	    set412=(Token)input.LT(1);
            	    if ( (input.LA(1)>=L_div && input.LA(1)<=L_mod)||(input.LA(1)>=TIMES && input.LA(1)<=QUOTIENT) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set412), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:632:65: ( NL )?
            	    int alt189=2;
            	    int LA189_0 = input.LA(1);

            	    if ( (LA189_0==NL) ) {
            	        alt189=1;
            	    }
            	    switch (alt189) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:632:65: NL
            	            {
            	            NL413=(Token)match(input,NL,FOLLOW_NL_in_p_arith_mult_expr4195); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_arith_pow_expr_in_p_arith_mult_expr4199);
            	    p_arith_pow_expr414=p_arith_pow_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_arith_pow_expr414.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:634:1: arith_pow_expr : apply_expr ( ( NL )? POW_tok ( NL )? apply_expr )* -> ^( POW ( apply_expr )* ) ;
    public final babel17Parser.arith_pow_expr_return arith_pow_expr() throws RecognitionException {
        babel17Parser.arith_pow_expr_return retval = new babel17Parser.arith_pow_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL416=null;
        Token POW_tok417=null;
        Token NL418=null;
        babel17Parser.apply_expr_return apply_expr415 = null;

        babel17Parser.apply_expr_return apply_expr419 = null;


        CommonTree NL416_tree=null;
        CommonTree POW_tok417_tree=null;
        CommonTree NL418_tree=null;
        RewriteRuleTokenStream stream_POW_tok=new RewriteRuleTokenStream(adaptor,"token POW_tok");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_apply_expr=new RewriteRuleSubtreeStream(adaptor,"rule apply_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:635:2: ( apply_expr ( ( NL )? POW_tok ( NL )? apply_expr )* -> ^( POW ( apply_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:635:4: apply_expr ( ( NL )? POW_tok ( NL )? apply_expr )*
            {
            pushFollow(FOLLOW_apply_expr_in_arith_pow_expr4210);
            apply_expr415=apply_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_apply_expr.add(apply_expr415.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:635:15: ( ( NL )? POW_tok ( NL )? apply_expr )*
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
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:635:16: ( NL )? POW_tok ( NL )? apply_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:635:16: ( NL )?
            	    int alt191=2;
            	    int LA191_0 = input.LA(1);

            	    if ( (LA191_0==NL) ) {
            	        alt191=1;
            	    }
            	    switch (alt191) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:635:16: NL
            	            {
            	            NL416=(Token)match(input,NL,FOLLOW_NL_in_arith_pow_expr4213); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL416);


            	            }
            	            break;

            	    }

            	    POW_tok417=(Token)match(input,POW_tok,FOLLOW_POW_tok_in_arith_pow_expr4216); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_POW_tok.add(POW_tok417);

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:635:28: ( NL )?
            	    int alt192=2;
            	    int LA192_0 = input.LA(1);

            	    if ( (LA192_0==NL) ) {
            	        alt192=1;
            	    }
            	    switch (alt192) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:635:28: NL
            	            {
            	            NL418=(Token)match(input,NL,FOLLOW_NL_in_arith_pow_expr4218); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL418);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_apply_expr_in_arith_pow_expr4221);
            	    apply_expr419=apply_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_apply_expr.add(apply_expr419.getTree());

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
            // 635:45: -> ^( POW ( apply_expr )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:635:48: ^( POW ( apply_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(POW, "POW"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:635:54: ( apply_expr )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:637:1: p_arith_pow_expr : p_apply_expr ( ( NL )? POW_tok ( NL )? p_apply_expr )* -> ^( POW ( p_apply_expr )* ) ;
    public final babel17Parser.p_arith_pow_expr_return p_arith_pow_expr() throws RecognitionException {
        babel17Parser.p_arith_pow_expr_return retval = new babel17Parser.p_arith_pow_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL421=null;
        Token POW_tok422=null;
        Token NL423=null;
        babel17Parser.p_apply_expr_return p_apply_expr420 = null;

        babel17Parser.p_apply_expr_return p_apply_expr424 = null;


        CommonTree NL421_tree=null;
        CommonTree POW_tok422_tree=null;
        CommonTree NL423_tree=null;
        RewriteRuleTokenStream stream_POW_tok=new RewriteRuleTokenStream(adaptor,"token POW_tok");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_p_apply_expr=new RewriteRuleSubtreeStream(adaptor,"rule p_apply_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:638:2: ( p_apply_expr ( ( NL )? POW_tok ( NL )? p_apply_expr )* -> ^( POW ( p_apply_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:638:4: p_apply_expr ( ( NL )? POW_tok ( NL )? p_apply_expr )*
            {
            pushFollow(FOLLOW_p_apply_expr_in_p_arith_pow_expr4242);
            p_apply_expr420=p_apply_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_p_apply_expr.add(p_apply_expr420.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:638:17: ( ( NL )? POW_tok ( NL )? p_apply_expr )*
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
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:638:18: ( NL )? POW_tok ( NL )? p_apply_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:638:18: ( NL )?
            	    int alt194=2;
            	    int LA194_0 = input.LA(1);

            	    if ( (LA194_0==NL) ) {
            	        alt194=1;
            	    }
            	    switch (alt194) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:638:18: NL
            	            {
            	            NL421=(Token)match(input,NL,FOLLOW_NL_in_p_arith_pow_expr4245); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL421);


            	            }
            	            break;

            	    }

            	    POW_tok422=(Token)match(input,POW_tok,FOLLOW_POW_tok_in_p_arith_pow_expr4248); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_POW_tok.add(POW_tok422);

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:638:30: ( NL )?
            	    int alt195=2;
            	    int LA195_0 = input.LA(1);

            	    if ( (LA195_0==NL) ) {
            	        alt195=1;
            	    }
            	    switch (alt195) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:638:30: NL
            	            {
            	            NL423=(Token)match(input,NL,FOLLOW_NL_in_p_arith_pow_expr4250); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL423);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_apply_expr_in_p_arith_pow_expr4253);
            	    p_apply_expr424=p_apply_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_p_apply_expr.add(p_apply_expr424.getTree());

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
            // 638:49: -> ^( POW ( p_apply_expr )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:638:52: ^( POW ( p_apply_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(POW, "POW"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:638:58: ( p_apply_expr )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:640:1: apply_expr : ( basic_expr )+ -> ^( APPLY ( basic_expr )* ) ;
    public final babel17Parser.apply_expr_return apply_expr() throws RecognitionException {
        babel17Parser.apply_expr_return retval = new babel17Parser.apply_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.basic_expr_return basic_expr425 = null;


        RewriteRuleSubtreeStream stream_basic_expr=new RewriteRuleSubtreeStream(adaptor,"rule basic_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:641:2: ( ( basic_expr )+ -> ^( APPLY ( basic_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:641:4: ( basic_expr )+
            {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:641:4: ( basic_expr )+
            int cnt197=0;
            loop197:
            do {
                int alt197=2;
                int LA197_0 = input.LA(1);

                if ( (LA197_0==L_begin||(LA197_0>=L_with && LA197_0<=L_if)||(LA197_0>=L_while && LA197_0<=L_for)||LA197_0==L_match||LA197_0==L_try||(LA197_0>=A_infinity && LA197_0<=U_infinity)||(LA197_0>=L_true && LA197_0<=L_this)||LA197_0==L_nil||(LA197_0>=Constr && LA197_0<=Num)||(LA197_0>=String && LA197_0<=ROUND_BRACKET_OPEN)||LA197_0==SQUARE_BRACKET_OPEN||LA197_0==CURLY_BRACKET_OPEN) ) {
                    alt197=1;
                }


                switch (alt197) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:641:4: basic_expr
            	    {
            	    pushFollow(FOLLOW_basic_expr_in_apply_expr4274);
            	    basic_expr425=basic_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_basic_expr.add(basic_expr425.getTree());

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
            // 641:16: -> ^( APPLY ( basic_expr )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:641:19: ^( APPLY ( basic_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(APPLY, "APPLY"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:641:27: ( basic_expr )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:642:1: p_apply_expr : p_basic_expr ( ( NL )? p_basic_expr )* -> ^( APPLY ( p_basic_expr )* ) ;
    public final babel17Parser.p_apply_expr_return p_apply_expr() throws RecognitionException {
        babel17Parser.p_apply_expr_return retval = new babel17Parser.p_apply_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL427=null;
        babel17Parser.p_basic_expr_return p_basic_expr426 = null;

        babel17Parser.p_basic_expr_return p_basic_expr428 = null;


        CommonTree NL427_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_p_basic_expr=new RewriteRuleSubtreeStream(adaptor,"rule p_basic_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:643:2: ( p_basic_expr ( ( NL )? p_basic_expr )* -> ^( APPLY ( p_basic_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:643:4: p_basic_expr ( ( NL )? p_basic_expr )*
            {
            pushFollow(FOLLOW_p_basic_expr_in_p_apply_expr4292);
            p_basic_expr426=p_basic_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_p_basic_expr.add(p_basic_expr426.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:643:17: ( ( NL )? p_basic_expr )*
            loop199:
            do {
                int alt199=2;
                int LA199_0 = input.LA(1);

                if ( (LA199_0==NL) ) {
                    int LA199_1 = input.LA(2);

                    if ( (LA199_1==L_begin||(LA199_1>=L_with && LA199_1<=L_if)||(LA199_1>=L_while && LA199_1<=L_for)||LA199_1==L_match||LA199_1==L_try||(LA199_1>=A_infinity && LA199_1<=U_infinity)||(LA199_1>=L_true && LA199_1<=L_this)||LA199_1==L_nil||(LA199_1>=Constr && LA199_1<=Num)||(LA199_1>=String && LA199_1<=ROUND_BRACKET_OPEN)||LA199_1==SQUARE_BRACKET_OPEN||LA199_1==CURLY_BRACKET_OPEN) ) {
                        alt199=1;
                    }


                }
                else if ( (LA199_0==L_begin||(LA199_0>=L_with && LA199_0<=L_if)||(LA199_0>=L_while && LA199_0<=L_for)||LA199_0==L_match||LA199_0==L_try||(LA199_0>=A_infinity && LA199_0<=U_infinity)||(LA199_0>=L_true && LA199_0<=L_this)||LA199_0==L_nil||(LA199_0>=Constr && LA199_0<=Num)||(LA199_0>=String && LA199_0<=ROUND_BRACKET_OPEN)||LA199_0==SQUARE_BRACKET_OPEN||LA199_0==CURLY_BRACKET_OPEN) ) {
                    alt199=1;
                }


                switch (alt199) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:643:18: ( NL )? p_basic_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:643:18: ( NL )?
            	    int alt198=2;
            	    int LA198_0 = input.LA(1);

            	    if ( (LA198_0==NL) ) {
            	        alt198=1;
            	    }
            	    switch (alt198) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:643:18: NL
            	            {
            	            NL427=(Token)match(input,NL,FOLLOW_NL_in_p_apply_expr4295); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL427);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_basic_expr_in_p_apply_expr4298);
            	    p_basic_expr428=p_basic_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_p_basic_expr.add(p_basic_expr428.getTree());

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
            // 643:37: -> ^( APPLY ( p_basic_expr )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:643:40: ^( APPLY ( p_basic_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(APPLY, "APPLY"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:643:48: ( p_basic_expr )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:645:1: basic_expr : message_send_expr ;
    public final babel17Parser.basic_expr_return basic_expr() throws RecognitionException {
        babel17Parser.basic_expr_return retval = new babel17Parser.basic_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.message_send_expr_return message_send_expr429 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:646:2: ( message_send_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:646:4: message_send_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_message_send_expr_in_basic_expr4318);
            message_send_expr429=message_send_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, message_send_expr429.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:648:1: p_basic_expr : message_send_expr ;
    public final babel17Parser.p_basic_expr_return p_basic_expr() throws RecognitionException {
        babel17Parser.p_basic_expr_return retval = new babel17Parser.p_basic_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.message_send_expr_return message_send_expr430 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:649:2: ( message_send_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:649:4: message_send_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_message_send_expr_in_p_basic_expr4327);
            message_send_expr430=message_send_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, message_send_expr430.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:651:1: message_send_expr : primitive_expr ( ( NL )? PERIOD ( NL )? Id )* -> ^( MESSAGE_SEND primitive_expr ( Id )* ) ;
    public final babel17Parser.message_send_expr_return message_send_expr() throws RecognitionException {
        babel17Parser.message_send_expr_return retval = new babel17Parser.message_send_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL432=null;
        Token PERIOD433=null;
        Token NL434=null;
        Token Id435=null;
        babel17Parser.primitive_expr_return primitive_expr431 = null;


        CommonTree NL432_tree=null;
        CommonTree PERIOD433_tree=null;
        CommonTree NL434_tree=null;
        CommonTree Id435_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
        RewriteRuleTokenStream stream_Id=new RewriteRuleTokenStream(adaptor,"token Id");
        RewriteRuleSubtreeStream stream_primitive_expr=new RewriteRuleSubtreeStream(adaptor,"rule primitive_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:652:2: ( primitive_expr ( ( NL )? PERIOD ( NL )? Id )* -> ^( MESSAGE_SEND primitive_expr ( Id )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:652:4: primitive_expr ( ( NL )? PERIOD ( NL )? Id )*
            {
            pushFollow(FOLLOW_primitive_expr_in_message_send_expr4336);
            primitive_expr431=primitive_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_primitive_expr.add(primitive_expr431.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:652:19: ( ( NL )? PERIOD ( NL )? Id )*
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
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:652:20: ( NL )? PERIOD ( NL )? Id
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:652:20: ( NL )?
            	    int alt200=2;
            	    int LA200_0 = input.LA(1);

            	    if ( (LA200_0==NL) ) {
            	        alt200=1;
            	    }
            	    switch (alt200) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:652:20: NL
            	            {
            	            NL432=(Token)match(input,NL,FOLLOW_NL_in_message_send_expr4339); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL432);


            	            }
            	            break;

            	    }

            	    PERIOD433=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_message_send_expr4342); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD433);

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:652:31: ( NL )?
            	    int alt201=2;
            	    int LA201_0 = input.LA(1);

            	    if ( (LA201_0==NL) ) {
            	        alt201=1;
            	    }
            	    switch (alt201) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:652:31: NL
            	            {
            	            NL434=(Token)match(input,NL,FOLLOW_NL_in_message_send_expr4344); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL434);


            	            }
            	            break;

            	    }

            	    Id435=(Token)match(input,Id,FOLLOW_Id_in_message_send_expr4347); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_Id.add(Id435);


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
            // 652:40: -> ^( MESSAGE_SEND primitive_expr ( Id )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:652:43: ^( MESSAGE_SEND primitive_expr ( Id )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MESSAGE_SEND, "MESSAGE_SEND"), root_1);

                adaptor.addChild(root_1, stream_primitive_expr.nextTree());
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:652:73: ( Id )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:654:1: list_expr : ( '[' ( NL )? ( protected_expr ( ( NL )? COMMA ( NL )? protected_expr )* ( NL )? )? ']' -> ^( SQUARE_LIST ( protected_expr )* ) | '(' ( NL )? ( protected_expr ( ( NL )? COMMA ( NL )? protected_expr )* ( NL )? ( COMMA ( NL )? )? )? ')' -> ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( protected_expr )* ) ) );
    public final babel17Parser.list_expr_return list_expr() throws RecognitionException {
        babel17Parser.list_expr_return retval = new babel17Parser.list_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal436=null;
        Token NL437=null;
        Token NL439=null;
        Token COMMA440=null;
        Token NL441=null;
        Token NL443=null;
        Token char_literal444=null;
        Token char_literal445=null;
        Token NL446=null;
        Token NL448=null;
        Token COMMA449=null;
        Token NL450=null;
        Token NL452=null;
        Token COMMA453=null;
        Token NL454=null;
        Token char_literal455=null;
        babel17Parser.protected_expr_return protected_expr438 = null;

        babel17Parser.protected_expr_return protected_expr442 = null;

        babel17Parser.protected_expr_return protected_expr447 = null;

        babel17Parser.protected_expr_return protected_expr451 = null;


        CommonTree char_literal436_tree=null;
        CommonTree NL437_tree=null;
        CommonTree NL439_tree=null;
        CommonTree COMMA440_tree=null;
        CommonTree NL441_tree=null;
        CommonTree NL443_tree=null;
        CommonTree char_literal444_tree=null;
        CommonTree char_literal445_tree=null;
        CommonTree NL446_tree=null;
        CommonTree NL448_tree=null;
        CommonTree COMMA449_tree=null;
        CommonTree NL450_tree=null;
        CommonTree NL452_tree=null;
        CommonTree COMMA453_tree=null;
        CommonTree NL454_tree=null;
        CommonTree char_literal455_tree=null;
        RewriteRuleTokenStream stream_ROUND_BRACKET_OPEN=new RewriteRuleTokenStream(adaptor,"token ROUND_BRACKET_OPEN");
        RewriteRuleTokenStream stream_SQUARE_BRACKET_CLOSE=new RewriteRuleTokenStream(adaptor,"token SQUARE_BRACKET_CLOSE");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_ROUND_BRACKET_CLOSE=new RewriteRuleTokenStream(adaptor,"token ROUND_BRACKET_CLOSE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_SQUARE_BRACKET_OPEN=new RewriteRuleTokenStream(adaptor,"token SQUARE_BRACKET_OPEN");
        RewriteRuleSubtreeStream stream_protected_expr=new RewriteRuleSubtreeStream(adaptor,"rule protected_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:655:2: ( '[' ( NL )? ( protected_expr ( ( NL )? COMMA ( NL )? protected_expr )* ( NL )? )? ']' -> ^( SQUARE_LIST ( protected_expr )* ) | '(' ( NL )? ( protected_expr ( ( NL )? COMMA ( NL )? protected_expr )* ( NL )? ( COMMA ( NL )? )? )? ')' -> ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( protected_expr )* ) ) )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:655:4: '[' ( NL )? ( protected_expr ( ( NL )? COMMA ( NL )? protected_expr )* ( NL )? )? ']'
                    {
                    char_literal436=(Token)match(input,SQUARE_BRACKET_OPEN,FOLLOW_SQUARE_BRACKET_OPEN_in_list_expr4371); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SQUARE_BRACKET_OPEN.add(char_literal436);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:655:8: ( NL )?
                    int alt203=2;
                    int LA203_0 = input.LA(1);

                    if ( (LA203_0==NL) ) {
                        alt203=1;
                    }
                    switch (alt203) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:655:8: NL
                            {
                            NL437=(Token)match(input,NL,FOLLOW_NL_in_list_expr4373); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL437);


                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:655:12: ( protected_expr ( ( NL )? COMMA ( NL )? protected_expr )* ( NL )? )?
                    int alt208=2;
                    int LA208_0 = input.LA(1);

                    if ( (LA208_0==L_begin||(LA208_0>=L_obj && LA208_0<=L_if)||(LA208_0>=L_while && LA208_0<=L_for)||(LA208_0>=L_match && LA208_0<=L_case)||LA208_0==L_exception||LA208_0==L_try||(LA208_0>=A_infinity && LA208_0<=L_lazy)||(LA208_0>=L_true && LA208_0<=L_nil)||LA208_0==MINUS||LA208_0==A_NOT||LA208_0==U_NOT||(LA208_0>=A_ELLIPSIS && LA208_0<=U_ELLIPSIS)||LA208_0==L_force||(LA208_0>=Constr && LA208_0<=Num)||(LA208_0>=String && LA208_0<=ROUND_BRACKET_OPEN)||LA208_0==SQUARE_BRACKET_OPEN||LA208_0==CURLY_BRACKET_OPEN||LA208_0==UNDERSCORE) ) {
                        alt208=1;
                    }
                    switch (alt208) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:655:13: protected_expr ( ( NL )? COMMA ( NL )? protected_expr )* ( NL )?
                            {
                            pushFollow(FOLLOW_protected_expr_in_list_expr4377);
                            protected_expr438=protected_expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr438.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:655:28: ( ( NL )? COMMA ( NL )? protected_expr )*
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
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:655:29: ( NL )? COMMA ( NL )? protected_expr
                            	    {
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:655:29: ( NL )?
                            	    int alt204=2;
                            	    int LA204_0 = input.LA(1);

                            	    if ( (LA204_0==NL) ) {
                            	        alt204=1;
                            	    }
                            	    switch (alt204) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:655:29: NL
                            	            {
                            	            NL439=(Token)match(input,NL,FOLLOW_NL_in_list_expr4380); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL439);


                            	            }
                            	            break;

                            	    }

                            	    COMMA440=(Token)match(input,COMMA,FOLLOW_COMMA_in_list_expr4383); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA440);

                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:655:39: ( NL )?
                            	    int alt205=2;
                            	    int LA205_0 = input.LA(1);

                            	    if ( (LA205_0==NL) ) {
                            	        alt205=1;
                            	    }
                            	    switch (alt205) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:655:39: NL
                            	            {
                            	            NL441=(Token)match(input,NL,FOLLOW_NL_in_list_expr4385); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL441);


                            	            }
                            	            break;

                            	    }

                            	    pushFollow(FOLLOW_protected_expr_in_list_expr4388);
                            	    protected_expr442=protected_expr();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr442.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop206;
                                }
                            } while (true);

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:655:60: ( NL )?
                            int alt207=2;
                            int LA207_0 = input.LA(1);

                            if ( (LA207_0==NL) ) {
                                alt207=1;
                            }
                            switch (alt207) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:655:60: NL
                                    {
                                    NL443=(Token)match(input,NL,FOLLOW_NL_in_list_expr4392); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL443);


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    char_literal444=(Token)match(input,SQUARE_BRACKET_CLOSE,FOLLOW_SQUARE_BRACKET_CLOSE_in_list_expr4397); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SQUARE_BRACKET_CLOSE.add(char_literal444);



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
                    // 655:70: -> ^( SQUARE_LIST ( protected_expr )* )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:655:73: ^( SQUARE_LIST ( protected_expr )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SQUARE_LIST, "SQUARE_LIST"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:655:87: ( protected_expr )*
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:656:4: '(' ( NL )? ( protected_expr ( ( NL )? COMMA ( NL )? protected_expr )* ( NL )? ( COMMA ( NL )? )? )? ')'
                    {
                    char_literal445=(Token)match(input,ROUND_BRACKET_OPEN,FOLLOW_ROUND_BRACKET_OPEN_in_list_expr4411); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ROUND_BRACKET_OPEN.add(char_literal445);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:656:8: ( NL )?
                    int alt209=2;
                    int LA209_0 = input.LA(1);

                    if ( (LA209_0==NL) ) {
                        alt209=1;
                    }
                    switch (alt209) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:656:8: NL
                            {
                            NL446=(Token)match(input,NL,FOLLOW_NL_in_list_expr4413); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL446);


                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:656:12: ( protected_expr ( ( NL )? COMMA ( NL )? protected_expr )* ( NL )? ( COMMA ( NL )? )? )?
                    int alt216=2;
                    int LA216_0 = input.LA(1);

                    if ( (LA216_0==L_begin||(LA216_0>=L_obj && LA216_0<=L_if)||(LA216_0>=L_while && LA216_0<=L_for)||(LA216_0>=L_match && LA216_0<=L_case)||LA216_0==L_exception||LA216_0==L_try||(LA216_0>=A_infinity && LA216_0<=L_lazy)||(LA216_0>=L_true && LA216_0<=L_nil)||LA216_0==MINUS||LA216_0==A_NOT||LA216_0==U_NOT||(LA216_0>=A_ELLIPSIS && LA216_0<=U_ELLIPSIS)||LA216_0==L_force||(LA216_0>=Constr && LA216_0<=Num)||(LA216_0>=String && LA216_0<=ROUND_BRACKET_OPEN)||LA216_0==SQUARE_BRACKET_OPEN||LA216_0==CURLY_BRACKET_OPEN||LA216_0==UNDERSCORE) ) {
                        alt216=1;
                    }
                    switch (alt216) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:656:13: protected_expr ( ( NL )? COMMA ( NL )? protected_expr )* ( NL )? ( COMMA ( NL )? )?
                            {
                            pushFollow(FOLLOW_protected_expr_in_list_expr4417);
                            protected_expr447=protected_expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr447.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:656:28: ( ( NL )? COMMA ( NL )? protected_expr )*
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

                                            if ( (LA212_4==L_begin||(LA212_4>=L_obj && LA212_4<=L_if)||(LA212_4>=L_while && LA212_4<=L_for)||(LA212_4>=L_match && LA212_4<=L_case)||LA212_4==L_exception||LA212_4==L_try||(LA212_4>=A_infinity && LA212_4<=L_lazy)||(LA212_4>=L_true && LA212_4<=L_nil)||LA212_4==MINUS||LA212_4==A_NOT||LA212_4==U_NOT||(LA212_4>=A_ELLIPSIS && LA212_4<=U_ELLIPSIS)||LA212_4==L_force||(LA212_4>=Constr && LA212_4<=Num)||(LA212_4>=String && LA212_4<=ROUND_BRACKET_OPEN)||LA212_4==SQUARE_BRACKET_OPEN||LA212_4==CURLY_BRACKET_OPEN||LA212_4==UNDERSCORE) ) {
                                                alt212=1;
                                            }


                                        }
                                        else if ( (LA212_2==L_begin||(LA212_2>=L_obj && LA212_2<=L_if)||(LA212_2>=L_while && LA212_2<=L_for)||(LA212_2>=L_match && LA212_2<=L_case)||LA212_2==L_exception||LA212_2==L_try||(LA212_2>=A_infinity && LA212_2<=L_lazy)||(LA212_2>=L_true && LA212_2<=L_nil)||LA212_2==MINUS||LA212_2==A_NOT||LA212_2==U_NOT||(LA212_2>=A_ELLIPSIS && LA212_2<=U_ELLIPSIS)||LA212_2==L_force||(LA212_2>=Constr && LA212_2<=Num)||(LA212_2>=String && LA212_2<=ROUND_BRACKET_OPEN)||LA212_2==SQUARE_BRACKET_OPEN||LA212_2==CURLY_BRACKET_OPEN||LA212_2==UNDERSCORE) ) {
                                            alt212=1;
                                        }


                                    }


                                }
                                else if ( (LA212_0==COMMA) ) {
                                    int LA212_2 = input.LA(2);

                                    if ( (LA212_2==NL) ) {
                                        int LA212_4 = input.LA(3);

                                        if ( (LA212_4==L_begin||(LA212_4>=L_obj && LA212_4<=L_if)||(LA212_4>=L_while && LA212_4<=L_for)||(LA212_4>=L_match && LA212_4<=L_case)||LA212_4==L_exception||LA212_4==L_try||(LA212_4>=A_infinity && LA212_4<=L_lazy)||(LA212_4>=L_true && LA212_4<=L_nil)||LA212_4==MINUS||LA212_4==A_NOT||LA212_4==U_NOT||(LA212_4>=A_ELLIPSIS && LA212_4<=U_ELLIPSIS)||LA212_4==L_force||(LA212_4>=Constr && LA212_4<=Num)||(LA212_4>=String && LA212_4<=ROUND_BRACKET_OPEN)||LA212_4==SQUARE_BRACKET_OPEN||LA212_4==CURLY_BRACKET_OPEN||LA212_4==UNDERSCORE) ) {
                                            alt212=1;
                                        }


                                    }
                                    else if ( (LA212_2==L_begin||(LA212_2>=L_obj && LA212_2<=L_if)||(LA212_2>=L_while && LA212_2<=L_for)||(LA212_2>=L_match && LA212_2<=L_case)||LA212_2==L_exception||LA212_2==L_try||(LA212_2>=A_infinity && LA212_2<=L_lazy)||(LA212_2>=L_true && LA212_2<=L_nil)||LA212_2==MINUS||LA212_2==A_NOT||LA212_2==U_NOT||(LA212_2>=A_ELLIPSIS && LA212_2<=U_ELLIPSIS)||LA212_2==L_force||(LA212_2>=Constr && LA212_2<=Num)||(LA212_2>=String && LA212_2<=ROUND_BRACKET_OPEN)||LA212_2==SQUARE_BRACKET_OPEN||LA212_2==CURLY_BRACKET_OPEN||LA212_2==UNDERSCORE) ) {
                                        alt212=1;
                                    }


                                }


                                switch (alt212) {
                            	case 1 :
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:656:29: ( NL )? COMMA ( NL )? protected_expr
                            	    {
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:656:29: ( NL )?
                            	    int alt210=2;
                            	    int LA210_0 = input.LA(1);

                            	    if ( (LA210_0==NL) ) {
                            	        alt210=1;
                            	    }
                            	    switch (alt210) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:656:29: NL
                            	            {
                            	            NL448=(Token)match(input,NL,FOLLOW_NL_in_list_expr4420); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL448);


                            	            }
                            	            break;

                            	    }

                            	    COMMA449=(Token)match(input,COMMA,FOLLOW_COMMA_in_list_expr4423); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA449);

                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:656:39: ( NL )?
                            	    int alt211=2;
                            	    int LA211_0 = input.LA(1);

                            	    if ( (LA211_0==NL) ) {
                            	        alt211=1;
                            	    }
                            	    switch (alt211) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:656:39: NL
                            	            {
                            	            NL450=(Token)match(input,NL,FOLLOW_NL_in_list_expr4425); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL450);


                            	            }
                            	            break;

                            	    }

                            	    pushFollow(FOLLOW_protected_expr_in_list_expr4428);
                            	    protected_expr451=protected_expr();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr451.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop212;
                                }
                            } while (true);

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:656:60: ( NL )?
                            int alt213=2;
                            int LA213_0 = input.LA(1);

                            if ( (LA213_0==NL) ) {
                                alt213=1;
                            }
                            switch (alt213) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:656:60: NL
                                    {
                                    NL452=(Token)match(input,NL,FOLLOW_NL_in_list_expr4432); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL452);


                                    }
                                    break;

                            }

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:656:64: ( COMMA ( NL )? )?
                            int alt215=2;
                            int LA215_0 = input.LA(1);

                            if ( (LA215_0==COMMA) ) {
                                alt215=1;
                            }
                            switch (alt215) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:656:65: COMMA ( NL )?
                                    {
                                    COMMA453=(Token)match(input,COMMA,FOLLOW_COMMA_in_list_expr4436); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_COMMA.add(COMMA453);

                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:656:71: ( NL )?
                                    int alt214=2;
                                    int LA214_0 = input.LA(1);

                                    if ( (LA214_0==NL) ) {
                                        alt214=1;
                                    }
                                    switch (alt214) {
                                        case 1 :
                                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:656:71: NL
                                            {
                                            NL454=(Token)match(input,NL,FOLLOW_NL_in_list_expr4438); if (state.failed) return retval; 
                                            if ( state.backtracking==0 ) stream_NL.add(NL454);


                                            }
                                            break;

                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    char_literal455=(Token)match(input,ROUND_BRACKET_CLOSE,FOLLOW_ROUND_BRACKET_CLOSE_in_list_expr4445); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ROUND_BRACKET_CLOSE.add(char_literal455);



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
                    // 656:83: -> ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( protected_expr )* ) )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:656:86: ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( protected_expr )* ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ROUND_LIST, "ROUND_LIST"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:656:99: ^( NIL_TOKEN ( COMMA )* )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_2);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:656:111: ( COMMA )*
                        while ( stream_COMMA.hasNext() ) {
                            adaptor.addChild(root_2, stream_COMMA.nextNode());

                        }
                        stream_COMMA.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:656:119: ^( NIL_TOKEN ( protected_expr )* )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_2);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:656:131: ( protected_expr )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:658:1: map_or_set_expr : ( '{' ( NL )? ( map_or_set_elem_expr ( NL )? ( COMMA ( NL )? map_or_set_elem_expr ( NL )? )* )? '}' -> ^( MAP_OR_SET_OR_OBJ ( map_or_set_elem_expr )* ) | '{' ( NL )? token_ARROW ( NL )? '}' -> ^( EMPTY_MAP ) );
    public final babel17Parser.map_or_set_expr_return map_or_set_expr() throws RecognitionException {
        babel17Parser.map_or_set_expr_return retval = new babel17Parser.map_or_set_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal456=null;
        Token NL457=null;
        Token NL459=null;
        Token COMMA460=null;
        Token NL461=null;
        Token NL463=null;
        Token char_literal464=null;
        Token char_literal465=null;
        Token NL466=null;
        Token NL468=null;
        Token char_literal469=null;
        babel17Parser.map_or_set_elem_expr_return map_or_set_elem_expr458 = null;

        babel17Parser.map_or_set_elem_expr_return map_or_set_elem_expr462 = null;

        babel17Parser.token_ARROW_return token_ARROW467 = null;


        CommonTree char_literal456_tree=null;
        CommonTree NL457_tree=null;
        CommonTree NL459_tree=null;
        CommonTree COMMA460_tree=null;
        CommonTree NL461_tree=null;
        CommonTree NL463_tree=null;
        CommonTree char_literal464_tree=null;
        CommonTree char_literal465_tree=null;
        CommonTree NL466_tree=null;
        CommonTree NL468_tree=null;
        CommonTree char_literal469_tree=null;
        RewriteRuleTokenStream stream_CURLY_BRACKET_OPEN=new RewriteRuleTokenStream(adaptor,"token CURLY_BRACKET_OPEN");
        RewriteRuleTokenStream stream_CURLY_BRACKET_CLOSE=new RewriteRuleTokenStream(adaptor,"token CURLY_BRACKET_CLOSE");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_map_or_set_elem_expr=new RewriteRuleSubtreeStream(adaptor,"rule map_or_set_elem_expr");
        RewriteRuleSubtreeStream stream_token_ARROW=new RewriteRuleSubtreeStream(adaptor,"rule token_ARROW");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:659:2: ( '{' ( NL )? ( map_or_set_elem_expr ( NL )? ( COMMA ( NL )? map_or_set_elem_expr ( NL )? )* )? '}' -> ^( MAP_OR_SET_OR_OBJ ( map_or_set_elem_expr )* ) | '{' ( NL )? token_ARROW ( NL )? '}' -> ^( EMPTY_MAP ) )
            int alt226=2;
            int LA226_0 = input.LA(1);

            if ( (LA226_0==CURLY_BRACKET_OPEN) ) {
                switch ( input.LA(2) ) {
                case NL:
                    {
                    int LA226_2 = input.LA(3);

                    if ( (LA226_2==L_begin||(LA226_2>=L_obj && LA226_2<=L_if)||(LA226_2>=L_while && LA226_2<=L_for)||(LA226_2>=L_match && LA226_2<=L_case)||LA226_2==L_exception||LA226_2==L_try||(LA226_2>=A_infinity && LA226_2<=L_lazy)||(LA226_2>=L_true && LA226_2<=L_nil)||LA226_2==MINUS||LA226_2==A_NOT||LA226_2==U_NOT||(LA226_2>=A_ELLIPSIS && LA226_2<=U_ELLIPSIS)||LA226_2==L_force||(LA226_2>=Constr && LA226_2<=Num)||(LA226_2>=String && LA226_2<=ROUND_BRACKET_OPEN)||LA226_2==SQUARE_BRACKET_OPEN||(LA226_2>=CURLY_BRACKET_OPEN && LA226_2<=UNDERSCORE)) ) {
                        alt226=1;
                    }
                    else if ( ((LA226_2>=A_ARROW && LA226_2<=U_ARROW)) ) {
                        alt226=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 226, 2, input);

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
                case L_try:
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
                    alt226=1;
                    }
                    break;
                case A_ARROW:
                case U_ARROW:
                    {
                    alt226=2;
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:659:4: '{' ( NL )? ( map_or_set_elem_expr ( NL )? ( COMMA ( NL )? map_or_set_elem_expr ( NL )? )* )? '}'
                    {
                    char_literal456=(Token)match(input,CURLY_BRACKET_OPEN,FOLLOW_CURLY_BRACKET_OPEN_in_map_or_set_expr4474); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_OPEN.add(char_literal456);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:659:8: ( NL )?
                    int alt218=2;
                    int LA218_0 = input.LA(1);

                    if ( (LA218_0==NL) ) {
                        alt218=1;
                    }
                    switch (alt218) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:659:8: NL
                            {
                            NL457=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_expr4476); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL457);


                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:659:12: ( map_or_set_elem_expr ( NL )? ( COMMA ( NL )? map_or_set_elem_expr ( NL )? )* )?
                    int alt223=2;
                    int LA223_0 = input.LA(1);

                    if ( (LA223_0==L_begin||(LA223_0>=L_obj && LA223_0<=L_if)||(LA223_0>=L_while && LA223_0<=L_for)||(LA223_0>=L_match && LA223_0<=L_case)||LA223_0==L_exception||LA223_0==L_try||(LA223_0>=A_infinity && LA223_0<=L_lazy)||(LA223_0>=L_true && LA223_0<=L_nil)||LA223_0==MINUS||LA223_0==A_NOT||LA223_0==U_NOT||(LA223_0>=A_ELLIPSIS && LA223_0<=U_ELLIPSIS)||LA223_0==L_force||(LA223_0>=Constr && LA223_0<=Num)||(LA223_0>=String && LA223_0<=ROUND_BRACKET_OPEN)||LA223_0==SQUARE_BRACKET_OPEN||LA223_0==CURLY_BRACKET_OPEN||LA223_0==UNDERSCORE) ) {
                        alt223=1;
                    }
                    switch (alt223) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:659:13: map_or_set_elem_expr ( NL )? ( COMMA ( NL )? map_or_set_elem_expr ( NL )? )*
                            {
                            pushFollow(FOLLOW_map_or_set_elem_expr_in_map_or_set_expr4480);
                            map_or_set_elem_expr458=map_or_set_elem_expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_map_or_set_elem_expr.add(map_or_set_elem_expr458.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:659:34: ( NL )?
                            int alt219=2;
                            int LA219_0 = input.LA(1);

                            if ( (LA219_0==NL) ) {
                                alt219=1;
                            }
                            switch (alt219) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:659:34: NL
                                    {
                                    NL459=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_expr4482); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL459);


                                    }
                                    break;

                            }

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:659:38: ( COMMA ( NL )? map_or_set_elem_expr ( NL )? )*
                            loop222:
                            do {
                                int alt222=2;
                                int LA222_0 = input.LA(1);

                                if ( (LA222_0==COMMA) ) {
                                    alt222=1;
                                }


                                switch (alt222) {
                            	case 1 :
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:659:39: COMMA ( NL )? map_or_set_elem_expr ( NL )?
                            	    {
                            	    COMMA460=(Token)match(input,COMMA,FOLLOW_COMMA_in_map_or_set_expr4486); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA460);

                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:659:45: ( NL )?
                            	    int alt220=2;
                            	    int LA220_0 = input.LA(1);

                            	    if ( (LA220_0==NL) ) {
                            	        alt220=1;
                            	    }
                            	    switch (alt220) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:659:45: NL
                            	            {
                            	            NL461=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_expr4488); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL461);


                            	            }
                            	            break;

                            	    }

                            	    pushFollow(FOLLOW_map_or_set_elem_expr_in_map_or_set_expr4491);
                            	    map_or_set_elem_expr462=map_or_set_elem_expr();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_map_or_set_elem_expr.add(map_or_set_elem_expr462.getTree());
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:659:70: ( NL )?
                            	    int alt221=2;
                            	    int LA221_0 = input.LA(1);

                            	    if ( (LA221_0==NL) ) {
                            	        alt221=1;
                            	    }
                            	    switch (alt221) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:659:70: NL
                            	            {
                            	            NL463=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_expr4493); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL463);


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

                    char_literal464=(Token)match(input,CURLY_BRACKET_CLOSE,FOLLOW_CURLY_BRACKET_CLOSE_in_map_or_set_expr4500); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_CLOSE.add(char_literal464);



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
                    // 659:82: -> ^( MAP_OR_SET_OR_OBJ ( map_or_set_elem_expr )* )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:659:85: ^( MAP_OR_SET_OR_OBJ ( map_or_set_elem_expr )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MAP_OR_SET_OR_OBJ, "MAP_OR_SET_OR_OBJ"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:659:105: ( map_or_set_elem_expr )*
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:660:10: '{' ( NL )? token_ARROW ( NL )? '}'
                    {
                    char_literal465=(Token)match(input,CURLY_BRACKET_OPEN,FOLLOW_CURLY_BRACKET_OPEN_in_map_or_set_expr4520); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_OPEN.add(char_literal465);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:660:14: ( NL )?
                    int alt224=2;
                    int LA224_0 = input.LA(1);

                    if ( (LA224_0==NL) ) {
                        alt224=1;
                    }
                    switch (alt224) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:660:14: NL
                            {
                            NL466=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_expr4522); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL466);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_token_ARROW_in_map_or_set_expr4525);
                    token_ARROW467=token_ARROW();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_token_ARROW.add(token_ARROW467.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:660:30: ( NL )?
                    int alt225=2;
                    int LA225_0 = input.LA(1);

                    if ( (LA225_0==NL) ) {
                        alt225=1;
                    }
                    switch (alt225) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:660:30: NL
                            {
                            NL468=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_expr4527); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL468);


                            }
                            break;

                    }

                    char_literal469=(Token)match(input,CURLY_BRACKET_CLOSE,FOLLOW_CURLY_BRACKET_CLOSE_in_map_or_set_expr4530); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_CLOSE.add(char_literal469);



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
                    // 660:38: -> ^( EMPTY_MAP )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:660:41: ^( EMPTY_MAP )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:662:1: map_or_set_elem_expr : protected_expr ( ( NL )? arrow_or_assign ( NL )? protected_expr )? -> ^( NIL_TOKEN ^( NIL_TOKEN ( protected_expr )* ) ( arrow_or_assign )* ) ;
    public final babel17Parser.map_or_set_elem_expr_return map_or_set_elem_expr() throws RecognitionException {
        babel17Parser.map_or_set_elem_expr_return retval = new babel17Parser.map_or_set_elem_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL471=null;
        Token NL473=null;
        babel17Parser.protected_expr_return protected_expr470 = null;

        babel17Parser.arrow_or_assign_return arrow_or_assign472 = null;

        babel17Parser.protected_expr_return protected_expr474 = null;


        CommonTree NL471_tree=null;
        CommonTree NL473_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_protected_expr=new RewriteRuleSubtreeStream(adaptor,"rule protected_expr");
        RewriteRuleSubtreeStream stream_arrow_or_assign=new RewriteRuleSubtreeStream(adaptor,"rule arrow_or_assign");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:663:2: ( protected_expr ( ( NL )? arrow_or_assign ( NL )? protected_expr )? -> ^( NIL_TOKEN ^( NIL_TOKEN ( protected_expr )* ) ( arrow_or_assign )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:663:4: protected_expr ( ( NL )? arrow_or_assign ( NL )? protected_expr )?
            {
            pushFollow(FOLLOW_protected_expr_in_map_or_set_elem_expr4547);
            protected_expr470=protected_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr470.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:663:19: ( ( NL )? arrow_or_assign ( NL )? protected_expr )?
            int alt229=2;
            int LA229_0 = input.LA(1);

            if ( (LA229_0==NL) ) {
                int LA229_1 = input.LA(2);

                if ( (LA229_1==ASSIGN||(LA229_1>=A_ARROW && LA229_1<=U_ARROW)) ) {
                    alt229=1;
                }
            }
            else if ( (LA229_0==ASSIGN||(LA229_0>=A_ARROW && LA229_0<=U_ARROW)) ) {
                alt229=1;
            }
            switch (alt229) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:663:20: ( NL )? arrow_or_assign ( NL )? protected_expr
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:663:20: ( NL )?
                    int alt227=2;
                    int LA227_0 = input.LA(1);

                    if ( (LA227_0==NL) ) {
                        alt227=1;
                    }
                    switch (alt227) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:663:20: NL
                            {
                            NL471=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_elem_expr4550); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL471);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_arrow_or_assign_in_map_or_set_elem_expr4553);
                    arrow_or_assign472=arrow_or_assign();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_arrow_or_assign.add(arrow_or_assign472.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:663:40: ( NL )?
                    int alt228=2;
                    int LA228_0 = input.LA(1);

                    if ( (LA228_0==NL) ) {
                        alt228=1;
                    }
                    switch (alt228) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:663:40: NL
                            {
                            NL473=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_elem_expr4555); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL473);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_protected_expr_in_map_or_set_elem_expr4558);
                    protected_expr474=protected_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr474.getTree());

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
            // 663:61: -> ^( NIL_TOKEN ^( NIL_TOKEN ( protected_expr )* ) ( arrow_or_assign )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:663:64: ^( NIL_TOKEN ^( NIL_TOKEN ( protected_expr )* ) ( arrow_or_assign )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:663:76: ^( NIL_TOKEN ( protected_expr )* )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_2);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:663:88: ( protected_expr )*
                while ( stream_protected_expr.hasNext() ) {
                    adaptor.addChild(root_2, stream_protected_expr.nextTree());

                }
                stream_protected_expr.reset();

                adaptor.addChild(root_1, root_2);
                }
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:663:105: ( arrow_or_assign )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:665:1: primitive_expr : ( Num | String | Id | Constr | L_true | L_false | L_this | L_nil | token_infinity | list_expr | with_control_expr | map_or_set_expr );
    public final babel17Parser.primitive_expr_return primitive_expr() throws RecognitionException {
        babel17Parser.primitive_expr_return retval = new babel17Parser.primitive_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Num475=null;
        Token String476=null;
        Token Id477=null;
        Token Constr478=null;
        Token L_true479=null;
        Token L_false480=null;
        Token L_this481=null;
        Token L_nil482=null;
        babel17Parser.token_infinity_return token_infinity483 = null;

        babel17Parser.list_expr_return list_expr484 = null;

        babel17Parser.with_control_expr_return with_control_expr485 = null;

        babel17Parser.map_or_set_expr_return map_or_set_expr486 = null;


        CommonTree Num475_tree=null;
        CommonTree String476_tree=null;
        CommonTree Id477_tree=null;
        CommonTree Constr478_tree=null;
        CommonTree L_true479_tree=null;
        CommonTree L_false480_tree=null;
        CommonTree L_this481_tree=null;
        CommonTree L_nil482_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:666:2: ( Num | String | Id | Constr | L_true | L_false | L_this | L_nil | token_infinity | list_expr | with_control_expr | map_or_set_expr )
            int alt230=12;
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
            case L_nil:
                {
                alt230=8;
                }
                break;
            case A_infinity:
            case U_infinity:
                {
                alt230=9;
                }
                break;
            case ROUND_BRACKET_OPEN:
            case SQUARE_BRACKET_OPEN:
                {
                alt230=10;
                }
                break;
            case L_begin:
            case L_with:
            case L_if:
            case L_while:
            case L_for:
            case L_match:
            case L_try:
                {
                alt230=11;
                }
                break;
            case CURLY_BRACKET_OPEN:
                {
                alt230=12;
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:666:4: Num
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Num475=(Token)match(input,Num,FOLLOW_Num_in_primitive_expr4585); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Num475_tree = (CommonTree)adaptor.create(Num475);
                    adaptor.addChild(root_0, Num475_tree);
                    }

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:667:4: String
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    String476=(Token)match(input,String,FOLLOW_String_in_primitive_expr4590); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    String476_tree = (CommonTree)adaptor.create(String476);
                    adaptor.addChild(root_0, String476_tree);
                    }

                    }
                    break;
                case 3 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:668:4: Id
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Id477=(Token)match(input,Id,FOLLOW_Id_in_primitive_expr4595); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Id477_tree = (CommonTree)adaptor.create(Id477);
                    adaptor.addChild(root_0, Id477_tree);
                    }

                    }
                    break;
                case 4 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:669:4: Constr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Constr478=(Token)match(input,Constr,FOLLOW_Constr_in_primitive_expr4600); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Constr478_tree = (CommonTree)adaptor.create(Constr478);
                    adaptor.addChild(root_0, Constr478_tree);
                    }

                    }
                    break;
                case 5 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:670:4: L_true
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    L_true479=(Token)match(input,L_true,FOLLOW_L_true_in_primitive_expr4605); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    L_true479_tree = (CommonTree)adaptor.create(L_true479);
                    adaptor.addChild(root_0, L_true479_tree);
                    }

                    }
                    break;
                case 6 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:671:4: L_false
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    L_false480=(Token)match(input,L_false,FOLLOW_L_false_in_primitive_expr4610); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    L_false480_tree = (CommonTree)adaptor.create(L_false480);
                    adaptor.addChild(root_0, L_false480_tree);
                    }

                    }
                    break;
                case 7 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:672:4: L_this
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    L_this481=(Token)match(input,L_this,FOLLOW_L_this_in_primitive_expr4615); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    L_this481_tree = (CommonTree)adaptor.create(L_this481);
                    adaptor.addChild(root_0, L_this481_tree);
                    }

                    }
                    break;
                case 8 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:673:4: L_nil
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    L_nil482=(Token)match(input,L_nil,FOLLOW_L_nil_in_primitive_expr4621); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    L_nil482_tree = (CommonTree)adaptor.create(L_nil482);
                    adaptor.addChild(root_0, L_nil482_tree);
                    }

                    }
                    break;
                case 9 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:674:4: token_infinity
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_infinity_in_primitive_expr4626);
                    token_infinity483=token_infinity();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, token_infinity483.getTree());

                    }
                    break;
                case 10 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:675:5: list_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_list_expr_in_primitive_expr4632);
                    list_expr484=list_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, list_expr484.getTree());

                    }
                    break;
                case 11 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:676:4: with_control_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_with_control_expr_in_primitive_expr4637);
                    with_control_expr485=with_control_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, with_control_expr485.getTree());

                    }
                    break;
                case 12 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:677:4: map_or_set_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_map_or_set_expr_in_primitive_expr4642);
                    map_or_set_expr486=map_or_set_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, map_or_set_expr486.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:679:1: prog : block EOF -> ^( PROG block ) ;
    public final babel17Parser.prog_return prog() throws RecognitionException {
        babel17Parser.prog_return retval = new babel17Parser.prog_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EOF488=null;
        babel17Parser.block_return block487 = null;


        CommonTree EOF488_tree=null;
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:679:7: ( block EOF -> ^( PROG block ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:679:9: block EOF
            {
            pushFollow(FOLLOW_block_in_prog4652);
            block487=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block487.getTree());
            EOF488=(Token)match(input,EOF,FOLLOW_EOF_in_prog4654); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EOF.add(EOF488);



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
            // 679:19: -> ^( PROG block )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:679:22: ^( PROG block )
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
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:365:10: ( Id ( NL )? L_as )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:365:11: Id ( NL )? L_as
        {
        match(input,Id,FOLLOW_Id_in_synpred1_babel171628); if (state.failed) return ;
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:365:14: ( NL )?
        int alt231=2;
        int LA231_0 = input.LA(1);

        if ( (LA231_0==NL) ) {
            alt231=1;
        }
        switch (alt231) {
            case 1 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:365:14: NL
                {
                match(input,NL,FOLLOW_NL_in_synpred1_babel171630); if (state.failed) return ;

                }
                break;

        }

        match(input,L_as,FOLLOW_L_as_in_synpred1_babel171633); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_babel17

    // $ANTLR start synpred2_babel17
    public final void synpred2_babel17_fragment() throws RecognitionException {   
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:366:4: ( protected_expr ( NL )? QUESTION_MARK )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:366:5: protected_expr ( NL )? QUESTION_MARK
        {
        pushFollow(FOLLOW_protected_expr_in_synpred2_babel171664);
        protected_expr();

        state._fsp--;
        if (state.failed) return ;
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:366:20: ( NL )?
        int alt232=2;
        int LA232_0 = input.LA(1);

        if ( (LA232_0==NL) ) {
            alt232=1;
        }
        switch (alt232) {
            case 1 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:366:20: NL
                {
                match(input,NL,FOLLOW_NL_in_synpred2_babel171666); if (state.failed) return ;

                }
                break;

        }

        match(input,QUESTION_MARK,FOLLOW_QUESTION_MARK_in_synpred2_babel171669); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_babel17

    // $ANTLR start synpred3_babel17
    public final void synpred3_babel17_fragment() throws RecognitionException {   
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:440:4: ( ( pattern | objelem_assign ) ( NL )? '=' )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:440:5: ( pattern | objelem_assign ) ( NL )? '='
        {
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:440:5: ( pattern | objelem_assign )
        int alt233=2;
        int LA233_0 = input.LA(1);

        if ( (LA233_0==L_exception||(LA233_0>=A_infinity && LA233_0<=U_infinity)||(LA233_0>=L_true && LA233_0<=L_false)||LA233_0==L_nil||LA233_0==MINUS||(LA233_0>=A_ELLIPSIS && LA233_0<=U_ELLIPSIS)||LA233_0==Constr||LA233_0==Num||(LA233_0>=String && LA233_0<=ROUND_BRACKET_OPEN)||LA233_0==SQUARE_BRACKET_OPEN||LA233_0==CURLY_BRACKET_OPEN||LA233_0==UNDERSCORE) ) {
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
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:440:6: pattern
                {
                pushFollow(FOLLOW_pattern_in_synpred3_babel172538);
                pattern();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:440:16: objelem_assign
                {
                pushFollow(FOLLOW_objelem_assign_in_synpred3_babel172542);
                objelem_assign();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:440:32: ( NL )?
        int alt234=2;
        int LA234_0 = input.LA(1);

        if ( (LA234_0==NL) ) {
            alt234=1;
        }
        switch (alt234) {
            case 1 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:440:32: NL
                {
                match(input,NL,FOLLOW_NL_in_synpred3_babel172545); if (state.failed) return ;

                }
                break;

        }

        match(input,ASSIGN,FOLLOW_ASSIGN_in_synpred3_babel172548); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_babel17

    // $ANTLR start synpred4_babel17
    public final void synpred4_babel17_fragment() throws RecognitionException {   
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:473:11: ( L_obj ( NL )? parents )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:473:12: L_obj ( NL )? parents
        {
        match(input,L_obj,FOLLOW_L_obj_in_synpred4_babel172768); if (state.failed) return ;
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:473:18: ( NL )?
        int alt235=2;
        int LA235_0 = input.LA(1);

        if ( (LA235_0==NL) ) {
            alt235=1;
        }
        switch (alt235) {
            case 1 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:473:18: NL
                {
                match(input,NL,FOLLOW_NL_in_synpred4_babel172770); if (state.failed) return ;

                }
                break;

        }

        pushFollow(FOLLOW_parents_in_synpred4_babel172773);
        parents();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_babel17

    // $ANTLR start synpred5_babel17
    public final void synpred5_babel17_fragment() throws RecognitionException {   
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:477:4: ( lambda_expr )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:477:5: lambda_expr
        {
        pushFollow(FOLLOW_lambda_expr_in_synpred5_babel172842);
        lambda_expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_babel17

    // $ANTLR start synpred6_babel17
    public final void synpred6_babel17_fragment() throws RecognitionException {   
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:481:4: ( protected_lambda_expr )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:481:5: protected_lambda_expr
        {
        pushFollow(FOLLOW_protected_lambda_expr_in_synpred6_babel172863);
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
    protected DFA59 dfa59 = new DFA59(this);
    protected DFA74 dfa74 = new DFA74(this);
    protected DFA84 dfa84 = new DFA84(this);
    protected DFA85 dfa85 = new DFA85(this);
    static final String DFA22_eotS =
        "\40\uffff";
    static final String DFA22_eofS =
        "\40\uffff";
    static final String DFA22_minS =
        "\1\61\17\0\7\uffff\1\0\10\uffff";
    static final String DFA22_maxS =
        "\1\u0089\17\0\7\uffff\1\0\10\uffff";
    static final String DFA22_acceptS =
        "\20\uffff\7\2\1\uffff\4\2\1\4\1\1\1\3\1\5";
    static final String DFA22_specialS =
        "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1"+
        "\16\1\17\7\uffff\1\20\10\uffff}>";
    static final String[] DFA22_transitionS = {
            "\1\31\1\uffff\1\33\1\32\1\24\3\uffff\1\25\1\27\2\uffff\1\26"+
            "\1\20\1\uffff\1\34\2\uffff\1\16\2\uffff\1\30\1\uffff\2\11\3"+
            "\21\1\uffff\1\6\1\7\1\23\1\21\1\10\16\uffff\1\12\5\uffff\1\22"+
            "\2\uffff\1\22\12\uffff\2\17\3\uffff\1\21\3\uffff\1\2\1\1\1\5"+
            "\1\uffff\1\4\1\14\1\uffff\1\13\1\uffff\1\15\1\uffff\1\3",
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
            return "364:1: bracket_pattern : ( ( Id ( NL )? L_as )=> Id ( NL )? L_as ( NL )? pattern -> ^( L_as Id pattern ) | ( protected_expr ( NL )? QUESTION_MARK )=> protected_expr ( NL )? QUESTION_MARK ( ( NL )? pattern )? -> ^( QUESTION_MARK protected_expr ( pattern )? ) | pattern ( ( NL )? L_if ( NL )? protected_expr )? -> ^( IF_PATTERN pattern ( protected_expr )? ) | L_val ( NL )? protected_expr -> ^( L_val protected_expr ) | L_for ( NL )? ( bracket_pattern ( ( NL )? COMMA ( NL )? bracket_pattern )* ( NL )? )? L_end -> ^( L_for ( bracket_pattern )* ) );";
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

                        else if ( (LA22_0==L_try) && (synpred2_babel17())) {s = 24;}

                        else if ( (LA22_0==L_begin) && (synpred2_babel17())) {s = 25;}

                        else if ( (LA22_0==L_with) && (synpred2_babel17())) {s = 26;}

                        else if ( (LA22_0==L_obj) && (synpred2_babel17())) {s = 27;}

                        else if ( (LA22_0==L_val) ) {s = 28;}

                         
                        input.seek(index22_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA22_1 = input.LA(1);

                         
                        int index22_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_babel17()) ) {s = 29;}

                        else if ( (synpred2_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index22_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA22_2 = input.LA(1);

                         
                        int index22_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index22_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA22_3 = input.LA(1);

                         
                        int index22_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index22_3);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA22_4 = input.LA(1);

                         
                        int index22_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index22_4);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA22_5 = input.LA(1);

                         
                        int index22_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index22_5);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA22_6 = input.LA(1);

                         
                        int index22_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index22_6);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA22_7 = input.LA(1);

                         
                        int index22_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index22_7);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA22_8 = input.LA(1);

                         
                        int index22_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index22_8);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA22_9 = input.LA(1);

                         
                        int index22_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index22_9);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA22_10 = input.LA(1);

                         
                        int index22_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index22_10);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA22_11 = input.LA(1);

                         
                        int index22_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index22_11);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA22_12 = input.LA(1);

                         
                        int index22_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index22_12);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA22_13 = input.LA(1);

                         
                        int index22_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index22_13);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA22_14 = input.LA(1);

                         
                        int index22_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index22_14);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA22_15 = input.LA(1);

                         
                        int index22_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index22_15);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA22_23 = input.LA(1);

                         
                        int index22_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 31;}

                         
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
        "\1\110\10\uffff\1\110\2\uffff\1\61\1\110\2\uffff\1\61\2\uffff";
    static final String DFA51_maxS =
        "\1\u0089\10\uffff\1\u0080\2\uffff\1\u0089\1\u0080\2\uffff\1\u0089"+
        "\2\uffff";
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
            "\uffff\1\21\2\uffff\1\21\1\uffff\5\21\1\uffff\5\21\16\uffff"+
            "\1\21\5\uffff\1\21\2\uffff\1\21\10\uffff\2\22\2\21\3\uffff\1"+
            "\21\2\uffff\1\20\3\21\1\uffff\2\21\1\uffff\1\21\1\uffff\3\21",
            "\2\17\66\uffff\1\16",
            "",
            "",
            "\1\21\1\uffff\3\21\3\uffff\2\21\2\uffff\2\21\1\uffff\1\21\2"+
            "\uffff\1\21\2\uffff\1\21\1\uffff\5\21\1\uffff\5\21\16\uffff"+
            "\1\21\5\uffff\1\21\2\uffff\1\21\10\uffff\2\22\2\21\3\uffff\1"+
            "\21\3\uffff\3\21\1\uffff\2\21\1\uffff\1\21\1\uffff\3\21",
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
            return "380:1: primitive_pattern : ( Id | '_' -> ANY | String | Num | L_true | L_false | L_nil | token_infinity | '-' ( NL )? token_infinity -> ^( UMINUS token_infinity ) | '-' ( NL )? Num -> ^( UMINUS Num ) | '[' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* )? ']' -> ^( SQUARE_LIST ( bracket_pattern )* ) | '(' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* ( COMMA ( NL )? )? )? ')' -> ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( bracket_pattern )* ) ) | '{' ( NL )? ( mselem_pattern ( NL )? ( COMMA ( NL )? mselem_pattern ( NL )? )* )? '}' -> ^( MAP_OR_SET_OR_OBJ ( mselem_pattern )* ) | '{' ( NL )? token_ARROW ( NL )? '}' -> ^( EMPTY_MAP ) );";
        }
    }
    static final String DFA57_eotS =
        "\4\uffff";
    static final String DFA57_eofS =
        "\2\3\2\uffff";
    static final String DFA57_minS =
        "\2\61\2\uffff";
    static final String DFA57_maxS =
        "\2\u008d\2\uffff";
    static final String DFA57_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA57_specialS =
        "\4\uffff}>";
    static final String[] DFA57_transitionS = {
            "\1\2\1\3\3\2\1\uffff\2\3\2\2\1\uffff\2\2\1\3\1\uffff\2\2\1\uffff"+
            "\1\2\2\uffff\1\2\1\uffff\13\2\14\uffff\1\1\1\uffff\1\2\5\uffff"+
            "\1\2\2\uffff\1\2\12\uffff\2\2\3\uffff\1\2\2\uffff\1\1\3\2\1"+
            "\uffff\2\2\1\uffff\1\2\1\uffff\1\2\1\uffff\5\2",
            "\1\2\1\3\3\2\1\uffff\2\3\2\2\1\uffff\2\2\1\3\1\uffff\2\2\1"+
            "\uffff\1\2\2\uffff\1\2\1\uffff\13\2\14\uffff\1\1\1\uffff\1\2"+
            "\5\uffff\1\2\2\uffff\1\2\12\uffff\2\2\3\uffff\1\2\2\uffff\1"+
            "\1\3\2\1\uffff\2\2\1\uffff\1\2\1\uffff\1\2\1\uffff\5\2",
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
            return "404:1: block : ( ( sep )? statement ( sep statement )* ( sep )? -> ^( BLOCK ( statement )* ) | ( sep )? -> ^( BLOCK ) );";
        }
    }
    static final String DFA54_eotS =
        "\4\uffff";
    static final String DFA54_eofS =
        "\2\2\2\uffff";
    static final String DFA54_minS =
        "\1\62\1\61\2\uffff";
    static final String DFA54_maxS =
        "\1\175\1\u008d\2\uffff";
    static final String DFA54_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA54_specialS =
        "\4\uffff}>";
    static final String[] DFA54_transitionS = {
            "\1\2\4\uffff\2\2\5\uffff\1\2\40\uffff\1\1\35\uffff\1\1",
            "\1\3\1\2\3\3\1\uffff\2\2\2\3\1\uffff\2\3\1\2\1\uffff\2\3\1"+
            "\uffff\1\3\2\uffff\1\3\1\uffff\13\3\14\uffff\1\1\1\uffff\1\3"+
            "\5\uffff\1\3\2\uffff\1\3\12\uffff\2\3\3\uffff\1\3\2\uffff\1"+
            "\1\3\3\1\uffff\2\3\1\uffff\1\3\1\uffff\1\3\1\uffff\5\3",
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
            return "()* loopback of 404:25: ( sep statement )*";
        }
    }
    static final String DFA59_eotS =
        "\12\uffff";
    static final String DFA59_eofS =
        "\12\uffff";
    static final String DFA59_minS =
        "\1\61\11\uffff";
    static final String DFA59_maxS =
        "\1\u008d\11\uffff";
    static final String DFA59_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11";
    static final String DFA59_specialS =
        "\12\uffff}>";
    static final String[] DFA59_transitionS = {
            "\1\5\1\uffff\3\5\3\uffff\2\5\1\uffff\1\4\1\5\2\uffff\1\1\1\2"+
            "\1\uffff\1\5\2\uffff\1\5\1\uffff\5\5\1\3\5\5\16\uffff\1\5\5"+
            "\uffff\1\5\2\uffff\1\5\12\uffff\2\5\3\uffff\1\5\3\uffff\3\5"+
            "\1\uffff\2\5\1\uffff\1\5\1\uffff\1\5\1\uffff\1\5\1\7\1\6\1\11"+
            "\1\10",
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

    static final short[] DFA59_eot = DFA.unpackEncodedString(DFA59_eotS);
    static final short[] DFA59_eof = DFA.unpackEncodedString(DFA59_eofS);
    static final char[] DFA59_min = DFA.unpackEncodedStringToUnsignedChars(DFA59_minS);
    static final char[] DFA59_max = DFA.unpackEncodedStringToUnsignedChars(DFA59_maxS);
    static final short[] DFA59_accept = DFA.unpackEncodedString(DFA59_acceptS);
    static final short[] DFA59_special = DFA.unpackEncodedString(DFA59_specialS);
    static final short[][] DFA59_transition;

    static {
        int numStates = DFA59_transitionS.length;
        DFA59_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA59_transition[i] = DFA.unpackEncodedString(DFA59_transitionS[i]);
        }
    }

    class DFA59 extends DFA {

        public DFA59(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 59;
            this.eot = DFA59_eot;
            this.eof = DFA59_eof;
            this.min = DFA59_min;
            this.max = DFA59_max;
            this.accept = DFA59_accept;
            this.special = DFA59_special;
            this.transition = DFA59_transition;
        }
        public String getDescription() {
            return "410:1: statement : ( st_val | st_def | st_memoize | st_yield | expr_or_assign | PRAGMA_PRINT expr -> ^( PRAGMA_PRINT expr ) | PRAGMA_LOG expr -> ^( PRAGMA_LOG expr ) | PRAGMA_PROFILE expr -> ^( PRAGMA_PROFILE expr ) | PRAGMA_ASSERT expr -> ^( PRAGMA_ASSERT expr ) );";
        }
    }
    static final String DFA74_eotS =
        "\34\uffff";
    static final String DFA74_eofS =
        "\34\uffff";
    static final String DFA74_minS =
        "\1\61\17\0\14\uffff";
    static final String DFA74_maxS =
        "\1\u0089\17\0\14\uffff";
    static final String DFA74_acceptS =
        "\20\uffff\1\2\12\uffff\1\1";
    static final String DFA74_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\14\uffff}>";
    static final String[] DFA74_transitionS = {
            "\1\20\1\uffff\3\20\3\uffff\2\20\2\uffff\1\20\5\uffff\1\16\2"+
            "\uffff\1\20\1\uffff\2\11\3\20\1\uffff\1\6\1\7\2\20\1\10\16\uffff"+
            "\1\12\5\uffff\1\20\2\uffff\1\20\12\uffff\2\17\3\uffff\1\20\3"+
            "\uffff\1\1\1\2\1\5\1\uffff\1\4\1\14\1\uffff\1\13\1\uffff\1\15"+
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
            return "439:1: expr_or_assign : ( ( ( pattern | objelem_assign ) ( NL )? '=' )=> ( pattern | objelem_assign ) ( NL )? '=' ( NL )? expr -> ^( ASSIGN ( pattern )* ( objelem_assign )* expr ) | expr );";
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
                        if ( (synpred3_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index74_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA74_2 = input.LA(1);

                         
                        int index74_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index74_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA74_3 = input.LA(1);

                         
                        int index74_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index74_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA74_4 = input.LA(1);

                         
                        int index74_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index74_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA74_5 = input.LA(1);

                         
                        int index74_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index74_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA74_6 = input.LA(1);

                         
                        int index74_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index74_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA74_7 = input.LA(1);

                         
                        int index74_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index74_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA74_8 = input.LA(1);

                         
                        int index74_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index74_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA74_9 = input.LA(1);

                         
                        int index74_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index74_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA74_10 = input.LA(1);

                         
                        int index74_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index74_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA74_11 = input.LA(1);

                         
                        int index74_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index74_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA74_12 = input.LA(1);

                         
                        int index74_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index74_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA74_13 = input.LA(1);

                         
                        int index74_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index74_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA74_14 = input.LA(1);

                         
                        int index74_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index74_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA74_15 = input.LA(1);

                         
                        int index74_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 27;}

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
        "\32\uffff";
    static final String DFA84_eofS =
        "\32\uffff";
    static final String DFA84_minS =
        "\1\61\2\0\1\uffff\13\0\13\uffff";
    static final String DFA84_maxS =
        "\1\u0089\2\0\1\uffff\13\0\13\uffff";
    static final String DFA84_acceptS =
        "\3\uffff\1\1\13\uffff\1\1\1\2\11\uffff";
    static final String DFA84_specialS =
        "\1\0\1\1\1\2\1\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\13\uffff}>";
    static final String[] DFA84_transitionS = {
            "\1\20\2\uffff\2\20\3\uffff\2\20\2\uffff\1\20\5\uffff\1\16\2"+
            "\uffff\1\20\1\uffff\2\11\3\20\1\uffff\1\6\1\7\2\20\1\10\16\uffff"+
            "\1\12\5\uffff\1\20\2\uffff\1\20\12\uffff\2\17\3\uffff\1\20\3"+
            "\uffff\1\1\1\2\1\5\1\uffff\1\4\1\14\1\uffff\1\13\1\uffff\1\15"+
            "\1\uffff\1\3",
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
            return "476:1: lop_expr : ( ( lambda_expr )=> lambda_expr | op_expr );";
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

                        else if ( (LA84_0==L_begin||(LA84_0>=L_with && LA84_0<=L_if)||(LA84_0>=L_while && LA84_0<=L_for)||LA84_0==L_match||LA84_0==L_try||(LA84_0>=L_concurrent && LA84_0<=L_lazy)||(LA84_0>=L_this && LA84_0<=L_random)||LA84_0==A_NOT||LA84_0==U_NOT||LA84_0==L_force) ) {s = 16;}

                         
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
        "\33\uffff";
    static final String DFA85_eofS =
        "\33\uffff";
    static final String DFA85_minS =
        "\1\61\2\0\1\uffff\13\0\14\uffff";
    static final String DFA85_maxS =
        "\1\u0089\2\0\1\uffff\13\0\14\uffff";
    static final String DFA85_acceptS =
        "\3\uffff\1\1\13\uffff\2\1\1\2\11\uffff";
    static final String DFA85_specialS =
        "\1\0\1\1\1\2\1\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\14\uffff}>";
    static final String[] DFA85_transitionS = {
            "\1\21\2\uffff\2\21\3\uffff\2\21\2\uffff\1\21\1\20\4\uffff\1"+
            "\16\2\uffff\1\21\1\uffff\2\11\3\21\1\uffff\1\6\1\7\2\21\1\10"+
            "\16\uffff\1\12\5\uffff\1\21\2\uffff\1\21\12\uffff\2\17\3\uffff"+
            "\1\21\3\uffff\1\1\1\2\1\5\1\uffff\1\4\1\14\1\uffff\1\13\1\uffff"+
            "\1\15\1\uffff\1\3",
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
            return "480:1: p_lop_expr : ( ( protected_lambda_expr )=> protected_lambda_expr | p_op_expr );";
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

                        else if ( (LA85_0==L_begin||(LA85_0>=L_with && LA85_0<=L_if)||(LA85_0>=L_while && LA85_0<=L_for)||LA85_0==L_match||LA85_0==L_try||(LA85_0>=L_concurrent && LA85_0<=L_lazy)||(LA85_0>=L_this && LA85_0<=L_random)||LA85_0==A_NOT||LA85_0==U_NOT||LA85_0==L_force) ) {s = 17;}

                         
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
    public static final BitSet FOLLOW_Constr_in_pattern1544 = new BitSet(new long[]{0x0000000000000002L,0xE06000020004C308L,0x00000000000002ADL});
    public static final BitSet FOLLOW_NL_in_pattern1547 = new BitSet(new long[]{0x0000000000000000L,0xE06000020004C308L,0x00000000000002ADL});
    public static final BitSet FOLLOW_pattern_in_pattern1550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitive_pattern_in_pattern1566 = new BitSet(new long[]{0x0000000000000002L,0x2000180000000000L});
    public static final BitSet FOLLOW_NL_in_pattern1569 = new BitSet(new long[]{0x0000000000000000L,0x2000180000000000L});
    public static final BitSet FOLLOW_token_DOUBLE_COLON_in_pattern1572 = new BitSet(new long[]{0x0000000000000000L,0xA00000020004C300L,0x00000000000002ADL});
    public static final BitSet FOLLOW_NL_in_pattern1574 = new BitSet(new long[]{0x0000000000000000L,0x800000020004C300L,0x00000000000002ADL});
    public static final BitSet FOLLOW_primitive_pattern_in_pattern1577 = new BitSet(new long[]{0x0000000000000002L,0x2000180000000000L});
    public static final BitSet FOLLOW_L_exception_in_pattern1596 = new BitSet(new long[]{0x0000000000000000L,0xE06000020004C308L,0x00000000000002ADL});
    public static final BitSet FOLLOW_pattern_in_pattern1598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_ELLIPSIS_in_pattern1611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Id_in_bracket_pattern1638 = new BitSet(new long[]{0x8000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1640 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_L_as_in_bracket_pattern1643 = new BitSet(new long[]{0x0000000000000000L,0xE06000020004C308L,0x00000000000002ADL});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1645 = new BitSet(new long[]{0x0000000000000000L,0xE06000020004C308L,0x00000000000002ADL});
    public static final BitSet FOLLOW_pattern_in_bracket_pattern1648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protected_expr_in_bracket_pattern1677 = new BitSet(new long[]{0x0000000000000000L,0x2200000000000000L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1679 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_QUESTION_MARK_in_bracket_pattern1682 = new BitSet(new long[]{0x0000000000000002L,0xE06000020004C308L,0x00000000000002ADL});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1685 = new BitSet(new long[]{0x0000000000000000L,0xE06000020004C308L,0x00000000000002ADL});
    public static final BitSet FOLLOW_pattern_in_bracket_pattern1688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_bracket_pattern1706 = new BitSet(new long[]{0x0020000000000002L,0x2000000000000000L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1709 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_L_if_in_bracket_pattern1712 = new BitSet(new long[]{0x663A000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1714 = new BitSet(new long[]{0x663A000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_protected_expr_in_bracket_pattern1717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_val_in_bracket_pattern1735 = new BitSet(new long[]{0x663A000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1737 = new BitSet(new long[]{0x663A000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_protected_expr_in_bracket_pattern1740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_for_in_bracket_pattern1759 = new BitSet(new long[]{0x663E000000000000L,0xE46004820007DF49L,0x00000000000002ADL});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1761 = new BitSet(new long[]{0x663E000000000000L,0xE46004820007DF49L,0x00000000000002ADL});
    public static final BitSet FOLLOW_bracket_pattern_in_bracket_pattern1765 = new BitSet(new long[]{0x0004000000000000L,0x2100000000000000L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1769 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_COMMA_in_bracket_pattern1772 = new BitSet(new long[]{0x663A000000000000L,0xE46004820007DF49L,0x00000000000002ADL});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1774 = new BitSet(new long[]{0x663A000000000000L,0xE46004820007DF49L,0x00000000000002ADL});
    public static final BitSet FOLLOW_bracket_pattern_in_bracket_pattern1777 = new BitSet(new long[]{0x0004000000000000L,0x2100000000000000L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1782 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_L_end_in_bracket_pattern1787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_ARROW_in_arrow_or_assign1806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGN_in_arrow_or_assign1817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracket_pattern_in_mselem_pattern1832 = new BitSet(new long[]{0x0000000200000002L,0x2018000000000000L});
    public static final BitSet FOLLOW_NL_in_mselem_pattern1835 = new BitSet(new long[]{0x0000000200000000L,0x2018000000000000L});
    public static final BitSet FOLLOW_arrow_or_assign_in_mselem_pattern1838 = new BitSet(new long[]{0x663A000000000000L,0xE46004820007DF49L,0x00000000000002ADL});
    public static final BitSet FOLLOW_NL_in_mselem_pattern1840 = new BitSet(new long[]{0x663A000000000000L,0xE46004820007DF49L,0x00000000000002ADL});
    public static final BitSet FOLLOW_bracket_pattern_in_mselem_pattern1843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Id_in_primitive_pattern1872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNDERSCORE_in_primitive_pattern1877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_String_in_primitive_pattern1886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Num_in_primitive_pattern1891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_true_in_primitive_pattern1896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_false_in_primitive_pattern1901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_nil_in_primitive_pattern1906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_infinity_in_primitive_pattern1911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_primitive_pattern1916 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000300L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern1918 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000300L});
    public static final BitSet FOLLOW_token_infinity_in_primitive_pattern1921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_primitive_pattern1934 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern1936 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_Num_in_primitive_pattern1939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SQUARE_BRACKET_OPEN_in_primitive_pattern1952 = new BitSet(new long[]{0x663A000000000000L,0xE46004820007DF49L,0x00000000000002EDL});
    public static final BitSet FOLLOW_NL_in_primitive_pattern1955 = new BitSet(new long[]{0x663A000000000000L,0xE46004820007DF49L,0x00000000000002EDL});
    public static final BitSet FOLLOW_bracket_pattern_in_primitive_pattern1959 = new BitSet(new long[]{0x0000000000000000L,0x2100000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern1961 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_COMMA_in_primitive_pattern1966 = new BitSet(new long[]{0x663A000000000000L,0xE46004820007DF49L,0x00000000000002ADL});
    public static final BitSet FOLLOW_NL_in_primitive_pattern1968 = new BitSet(new long[]{0x663A000000000000L,0xE46004820007DF49L,0x00000000000002ADL});
    public static final BitSet FOLLOW_bracket_pattern_in_primitive_pattern1971 = new BitSet(new long[]{0x0000000000000000L,0x2100000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern1973 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_SQUARE_BRACKET_CLOSE_in_primitive_pattern1981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROUND_BRACKET_OPEN_in_primitive_pattern2001 = new BitSet(new long[]{0x663A000000000000L,0xE46004820007DF49L,0x00000000000002BDL});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2004 = new BitSet(new long[]{0x663A000000000000L,0xE46004820007DF49L,0x00000000000002BDL});
    public static final BitSet FOLLOW_bracket_pattern_in_primitive_pattern2008 = new BitSet(new long[]{0x0000000000000000L,0x2100000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2010 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_COMMA_in_primitive_pattern2015 = new BitSet(new long[]{0x663A000000000000L,0xE46004820007DF49L,0x00000000000002ADL});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2018 = new BitSet(new long[]{0x663A000000000000L,0xE46004820007DF49L,0x00000000000002ADL});
    public static final BitSet FOLLOW_bracket_pattern_in_primitive_pattern2021 = new BitSet(new long[]{0x0000000000000000L,0x2100000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2023 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_COMMA_in_primitive_pattern2029 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2031 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ROUND_BRACKET_CLOSE_in_primitive_pattern2038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURLY_BRACKET_OPEN_in_primitive_pattern2070 = new BitSet(new long[]{0x663A000000000000L,0xE46004820007DF49L,0x00000000000003ADL});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2073 = new BitSet(new long[]{0x663A000000000000L,0xE46004820007DF49L,0x00000000000003ADL});
    public static final BitSet FOLLOW_mselem_pattern_in_primitive_pattern2077 = new BitSet(new long[]{0x0000000000000000L,0x2100000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2079 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_COMMA_in_primitive_pattern2084 = new BitSet(new long[]{0x663A000000000000L,0xE46004820007DF49L,0x00000000000002ADL});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2087 = new BitSet(new long[]{0x663A000000000000L,0xE46004820007DF49L,0x00000000000002ADL});
    public static final BitSet FOLLOW_mselem_pattern_in_primitive_pattern2090 = new BitSet(new long[]{0x0000000000000000L,0x2100000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2092 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_CURLY_BRACKET_CLOSE_in_primitive_pattern2100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURLY_BRACKET_OPEN_in_primitive_pattern2118 = new BitSet(new long[]{0x0000000000000000L,0x2018000000000000L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2120 = new BitSet(new long[]{0x0000000000000000L,0x0018000000000000L});
    public static final BitSet FOLLOW_token_ARROW_in_primitive_pattern2123 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2125 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_CURLY_BRACKET_CLOSE_in_primitive_pattern2128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_sep2150 = new BitSet(new long[]{0x0000000000000002L,0x2000000080000000L});
    public static final BitSet FOLLOW_sep_in_block2166 = new BitSet(new long[]{0x763A000000000000L,0xE46004820007FF4BL,0x0000000000003EADL});
    public static final BitSet FOLLOW_statement_in_block2169 = new BitSet(new long[]{0x0000000000000002L,0x2000000080000000L});
    public static final BitSet FOLLOW_sep_in_block2172 = new BitSet(new long[]{0x763A000000000000L,0xE46004820007FF4BL,0x0000000000003EADL});
    public static final BitSet FOLLOW_statement_in_block2174 = new BitSet(new long[]{0x0000000000000002L,0x2000000080000000L});
    public static final BitSet FOLLOW_sep_in_block2178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sep_in_block2194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_pure_block2211 = new BitSet(new long[]{0x0000000000000002L,0x2000000080000000L});
    public static final BitSet FOLLOW_sep_in_pure_block2214 = new BitSet(new long[]{0x763A000000000000L,0xE46004820007FF4BL,0x0000000000003EADL});
    public static final BitSet FOLLOW_statement_in_pure_block2216 = new BitSet(new long[]{0x0000000000000002L,0x2000000080000000L});
    public static final BitSet FOLLOW_st_val_in_statement2237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_def_in_statement2242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_memoize_in_statement2247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_yield_in_statement2252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_or_assign_in_statement2257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRAGMA_PRINT_in_statement2263 = new BitSet(new long[]{0x663A000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_expr_in_statement2265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRAGMA_LOG_in_statement2279 = new BitSet(new long[]{0x663A000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_expr_in_statement2281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRAGMA_PROFILE_in_statement2295 = new BitSet(new long[]{0x663A000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_expr_in_statement2297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRAGMA_ASSERT_in_statement2311 = new BitSet(new long[]{0x663A000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_expr_in_statement2313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Id_in_objelem_assign2331 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_PERIOD_in_objelem_assign2333 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_Id_in_objelem_assign2335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_val_in_st_val2354 = new BitSet(new long[]{0x0000000000000000L,0xE06000020004C308L,0x00000000000002ADL});
    public static final BitSet FOLLOW_NL_in_st_val2356 = new BitSet(new long[]{0x0000000000000000L,0xE06000020004C308L,0x00000000000002ADL});
    public static final BitSet FOLLOW_pattern_in_st_val2360 = new BitSet(new long[]{0x0000000200000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_objelem_assign_in_st_val2364 = new BitSet(new long[]{0x0000000200000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_NL_in_st_val2367 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ASSIGN_in_st_val2370 = new BitSet(new long[]{0x663A000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_NL_in_st_val2372 = new BitSet(new long[]{0x663A000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_expr_in_st_val2375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_def_in_st_def2399 = new BitSet(new long[]{0x0000000000000000L,0xA000000000000000L});
    public static final BitSet FOLLOW_NL_in_st_def2401 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_Id_in_st_def2404 = new BitSet(new long[]{0x0000000200000000L,0xA00000020004C300L,0x00000000000002ADL});
    public static final BitSet FOLLOW_NL_in_st_def2406 = new BitSet(new long[]{0x0000000200000000L,0x800000020004C300L,0x00000000000002ADL});
    public static final BitSet FOLLOW_primitive_pattern_in_st_def2410 = new BitSet(new long[]{0x0000000200000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_NL_in_st_def2412 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ASSIGN_in_st_def2417 = new BitSet(new long[]{0x663A000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_NL_in_st_def2419 = new BitSet(new long[]{0x663A000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_expr_in_st_def2422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_yield_in_st_yield2451 = new BitSet(new long[]{0x663A000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_expr_in_st_yield2453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_memoize_in_st_memoize2471 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_memid_in_st_memoize2473 = new BitSet(new long[]{0x0000000000000002L,0x8000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_Id_in_memid2497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROUND_BRACKET_OPEN_in_memid2510 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_Id_in_memid2512 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ROUND_BRACKET_CLOSE_in_memid2514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_expr_or_assign2554 = new BitSet(new long[]{0x0000000200000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_objelem_assign_in_expr_or_assign2558 = new BitSet(new long[]{0x0000000200000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_NL_in_expr_or_assign2561 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ASSIGN_in_expr_or_assign2564 = new BitSet(new long[]{0x663A000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_NL_in_expr_or_assign2566 = new BitSet(new long[]{0x663A000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_expr_in_expr_or_assign2569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_or_assign2588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lop_expr_in_expr2599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_obj_expr_in_expr2604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_expr_in_control_expr2614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_do_expr_in_control_expr2619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_match_expr_in_control_expr2624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_expr_in_control_expr2629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_try_expr_in_control_expr2635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_begin_end_in_control_expr2640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_control_expr_in_with_control_expr2650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_with_in_with_control_expr2655 = new BitSet(new long[]{0x663A000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_NL_in_with_control_expr2657 = new BitSet(new long[]{0x663A000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_protected_expr_in_with_control_expr2660 = new BitSet(new long[]{0x0800000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_NL_in_with_control_expr2662 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_L_do_in_with_control_expr2665 = new BitSet(new long[]{0x763E000000000000L,0xE46004828007FF4BL,0x0000000000003EADL});
    public static final BitSet FOLLOW_block_in_with_control_expr2667 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_L_end_in_with_control_expr2669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_lop_expr_in_protected_expr2694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_obj_expr_in_protected_expr2699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_begin_in_begin_end2711 = new BitSet(new long[]{0x763E000000000000L,0xE46004828007FF4BL,0x0000000000003EADL});
    public static final BitSet FOLLOW_block_in_begin_end2713 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_L_end_in_begin_end2715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_parents2733 = new BitSet(new long[]{0x6632000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_primitive_expr_in_parents2735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIMES_in_parents2748 = new BitSet(new long[]{0x6632000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_primitive_expr_in_parents2750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_obj_in_obj_expr2778 = new BitSet(new long[]{0x0000000000000000L,0x2000000500000000L});
    public static final BitSet FOLLOW_NL_in_obj_expr2780 = new BitSet(new long[]{0x0000000000000000L,0x2000000500000000L});
    public static final BitSet FOLLOW_parents_in_obj_expr2783 = new BitSet(new long[]{0x763E000000000000L,0xE46004828007FF4BL,0x0000000000003EADL});
    public static final BitSet FOLLOW_block_in_obj_expr2785 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_L_end_in_obj_expr2787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_obj_in_obj_expr2815 = new BitSet(new long[]{0x763E000000000000L,0xE46004828007FF4BL,0x0000000000003EADL});
    public static final BitSet FOLLOW_block_in_obj_expr2817 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_L_end_in_obj_expr2819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_expr_in_lop_expr2847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_op_expr_in_lop_expr2852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protected_lambda_expr_in_p_lop_expr2868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_op_expr_in_p_lop_expr2873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_if_in_if_expr2884 = new BitSet(new long[]{0x663A000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_NL_in_if_expr2886 = new BitSet(new long[]{0x663A000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_protected_expr_in_if_expr2889 = new BitSet(new long[]{0x0040000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_NL_in_if_expr2891 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_L_then_in_if_expr2894 = new BitSet(new long[]{0x77BE000000000000L,0xE46004828007FF4BL,0x0000000000003EADL});
    public static final BitSet FOLLOW_block_in_if_expr2896 = new BitSet(new long[]{0x0184000000000000L});
    public static final BitSet FOLLOW_L_elseif_in_if_expr2902 = new BitSet(new long[]{0x663A000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_NL_in_if_expr2904 = new BitSet(new long[]{0x663A000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_protected_expr_in_if_expr2907 = new BitSet(new long[]{0x0040000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_NL_in_if_expr2909 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_L_then_in_if_expr2912 = new BitSet(new long[]{0x77BE000000000000L,0xE46004828007FF4BL,0x0000000000003EADL});
    public static final BitSet FOLLOW_block_in_if_expr2914 = new BitSet(new long[]{0x0184000000000000L});
    public static final BitSet FOLLOW_L_else_in_if_expr2922 = new BitSet(new long[]{0x763E000000000000L,0xE46004828007FF4BL,0x0000000000003EADL});
    public static final BitSet FOLLOW_block_in_if_expr2924 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_L_end_in_if_expr2928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_while_in_while_do_expr2952 = new BitSet(new long[]{0x663A000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_NL_in_while_do_expr2954 = new BitSet(new long[]{0x663A000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_protected_expr_in_while_do_expr2957 = new BitSet(new long[]{0x0800000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_NL_in_while_do_expr2959 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_L_do_in_while_do_expr2962 = new BitSet(new long[]{0x763E000000000000L,0xE46004828007FF4BL,0x0000000000003EADL});
    public static final BitSet FOLLOW_block_in_while_do_expr2964 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_L_end_in_while_do_expr2966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_full_cases_in_cases2996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_cases3001 = new BitSet(new long[]{0x0000000000000000L,0x2006000000000000L});
    public static final BitSet FOLLOW_NL_in_cases3003 = new BitSet(new long[]{0x0000000000000000L,0x2006000000000000L});
    public static final BitSet FOLLOW_token_DOUBLE_ARROW_in_cases3006 = new BitSet(new long[]{0x763A000000000000L,0xE46004828007FF4BL,0x0000000000003EADL});
    public static final BitSet FOLLOW_block_in_cases3008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_case_expr_in_full_cases3031 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_L_case_in_case_expr3052 = new BitSet(new long[]{0x0000000000000000L,0xE06000020004C308L,0x00000000000002ADL});
    public static final BitSet FOLLOW_NL_in_case_expr3054 = new BitSet(new long[]{0x0000000000000000L,0xE06000020004C308L,0x00000000000002ADL});
    public static final BitSet FOLLOW_pattern_in_case_expr3057 = new BitSet(new long[]{0x0000000000000000L,0x2006000000000000L});
    public static final BitSet FOLLOW_NL_in_case_expr3059 = new BitSet(new long[]{0x0000000000000000L,0x2006000000000000L});
    public static final BitSet FOLLOW_token_DOUBLE_ARROW_in_case_expr3062 = new BitSet(new long[]{0x763A000000000000L,0xE46004828007FF4BL,0x0000000000003EADL});
    public static final BitSet FOLLOW_block_in_case_expr3064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_match_in_match_expr3085 = new BitSet(new long[]{0x6632000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_NL_in_match_expr3087 = new BitSet(new long[]{0x6632000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_p_op_expr_in_match_expr3090 = new BitSet(new long[]{0x4000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_NL_in_match_expr3092 = new BitSet(new long[]{0x4000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_full_cases_in_match_expr3095 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_L_end_in_match_expr3097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_try_in_try_expr3123 = new BitSet(new long[]{0x763A000000000000L,0xE46004820007FF4BL,0x0000000000003EADL});
    public static final BitSet FOLLOW_NL_in_try_expr3125 = new BitSet(new long[]{0x763A000000000000L,0xE46004820007FF4BL,0x0000000000003EADL});
    public static final BitSet FOLLOW_pure_block_in_try_expr3128 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000080L});
    public static final BitSet FOLLOW_NL_in_try_expr3130 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_L_catch_in_try_expr3133 = new BitSet(new long[]{0x4000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_NL_in_try_expr3135 = new BitSet(new long[]{0x4000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_full_cases_in_try_expr3138 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_L_end_in_try_expr3140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_cases_in_lambda_expr3165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_lambda_cases3183 = new BitSet(new long[]{0x0000000000000000L,0x2006000000000000L});
    public static final BitSet FOLLOW_NL_in_lambda_cases3185 = new BitSet(new long[]{0x0000000000000000L,0x2006000000000000L});
    public static final BitSet FOLLOW_token_DOUBLE_ARROW_in_lambda_cases3188 = new BitSet(new long[]{0x6632000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_NL_in_lambda_cases3190 = new BitSet(new long[]{0x6632000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_lop_expr_in_lambda_cases3193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protected_lambda_cases_in_protected_lambda_expr3221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_case_in_p_lambda_case_expr3239 = new BitSet(new long[]{0x0000000000000000L,0xE06000020004C308L,0x00000000000002ADL});
    public static final BitSet FOLLOW_NL_in_p_lambda_case_expr3241 = new BitSet(new long[]{0x0000000000000000L,0xE06000020004C308L,0x00000000000002ADL});
    public static final BitSet FOLLOW_pattern_in_p_lambda_case_expr3244 = new BitSet(new long[]{0x0000000000000000L,0x2006000000000000L});
    public static final BitSet FOLLOW_NL_in_p_lambda_case_expr3246 = new BitSet(new long[]{0x0000000000000000L,0x2006000000000000L});
    public static final BitSet FOLLOW_token_DOUBLE_ARROW_in_p_lambda_case_expr3249 = new BitSet(new long[]{0x763A000000000000L,0xE46004820007FF4BL,0x0000000000003EADL});
    public static final BitSet FOLLOW_NL_in_p_lambda_case_expr3251 = new BitSet(new long[]{0x763A000000000000L,0xE46004820007FF4BL,0x0000000000003EADL});
    public static final BitSet FOLLOW_pure_block_in_p_lambda_case_expr3254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_protected_lambda_cases3275 = new BitSet(new long[]{0x0000000000000000L,0x2006000000000000L});
    public static final BitSet FOLLOW_NL_in_protected_lambda_cases3277 = new BitSet(new long[]{0x0000000000000000L,0x2006000000000000L});
    public static final BitSet FOLLOW_token_DOUBLE_ARROW_in_protected_lambda_cases3280 = new BitSet(new long[]{0x763A000000000000L,0xE46004820007FF4BL,0x0000000000003EADL});
    public static final BitSet FOLLOW_NL_in_protected_lambda_cases3282 = new BitSet(new long[]{0x763A000000000000L,0xE46004820007FF4BL,0x0000000000003EADL});
    public static final BitSet FOLLOW_pure_block_in_protected_lambda_cases3285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_lambda_case_expr_in_protected_lambda_cases3304 = new BitSet(new long[]{0x4000000000000002L,0xE06000020004C308L,0x00000000000002ADL});
    public static final BitSet FOLLOW_NL_in_protected_lambda_cases3307 = new BitSet(new long[]{0x4000000000000000L,0xE06000020004C308L,0x00000000000002ADL});
    public static final BitSet FOLLOW_p_lambda_case_expr_in_protected_lambda_cases3310 = new BitSet(new long[]{0x4000000000000002L,0xE06000020004C308L,0x00000000000002ADL});
    public static final BitSet FOLLOW_L_for_in_for_expr3328 = new BitSet(new long[]{0x0000000000000000L,0xE06000020004C308L,0x00000000000002ADL});
    public static final BitSet FOLLOW_NL_in_for_expr3330 = new BitSet(new long[]{0x0000000000000000L,0xE06000020004C308L,0x00000000000002ADL});
    public static final BitSet FOLLOW_pattern_in_for_expr3333 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000004L});
    public static final BitSet FOLLOW_NL_in_for_expr3335 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_L_in_in_for_expr3338 = new BitSet(new long[]{0x663A000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_NL_in_for_expr3340 = new BitSet(new long[]{0x663A000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_protected_expr_in_for_expr3343 = new BitSet(new long[]{0x0800000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_NL_in_for_expr3345 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_L_do_in_for_expr3348 = new BitSet(new long[]{0x763E000000000000L,0xE46004828007FF4BL,0x0000000000003EADL});
    public static final BitSet FOLLOW_block_in_for_expr3350 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_L_end_in_for_expr3352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_builtin_primitive_in_op_expr3377 = new BitSet(new long[]{0x6632000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_op_expr_in_op_expr3380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bool_expr_in_op_expr3385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_builtin_primitive_in_p_op_expr3395 = new BitSet(new long[]{0x6632000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_NL_in_p_op_expr3398 = new BitSet(new long[]{0x6632000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_p_op_expr_in_p_op_expr3402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_bool_expr_in_p_op_expr3407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_builtin_primitive0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bool_or_expr_in_bool_expr3447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_bool_or_expr_in_p_bool_expr3457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bool_and_expr_in_bool_or_expr3466 = new BitSet(new long[]{0x0000000000000002L,0x2000012000000000L});
    public static final BitSet FOLLOW_NL_in_bool_or_expr3469 = new BitSet(new long[]{0x0000000000000000L,0x2000012000000000L});
    public static final BitSet FOLLOW_token_OR_in_bool_or_expr3473 = new BitSet(new long[]{0x6632000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_NL_in_bool_or_expr3476 = new BitSet(new long[]{0x6632000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_bool_and_expr_in_bool_or_expr3480 = new BitSet(new long[]{0x0000000000000002L,0x2000012000000000L});
    public static final BitSet FOLLOW_p_bool_and_expr_in_p_bool_or_expr3492 = new BitSet(new long[]{0x0000000000000002L,0x2000012000000000L});
    public static final BitSet FOLLOW_NL_in_p_bool_or_expr3495 = new BitSet(new long[]{0x0000000000000000L,0x2000012000000000L});
    public static final BitSet FOLLOW_token_OR_in_p_bool_or_expr3499 = new BitSet(new long[]{0x6632000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_NL_in_p_bool_or_expr3502 = new BitSet(new long[]{0x6632000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_p_bool_and_expr_in_p_bool_or_expr3506 = new BitSet(new long[]{0x0000000000000002L,0x2000012000000000L});
    public static final BitSet FOLLOW_bool_not_expr_in_bool_and_expr3518 = new BitSet(new long[]{0x0000000000000002L,0x2000024000000000L});
    public static final BitSet FOLLOW_NL_in_bool_and_expr3521 = new BitSet(new long[]{0x0000000000000000L,0x2000024000000000L});
    public static final BitSet FOLLOW_token_AND_in_bool_and_expr3525 = new BitSet(new long[]{0x6632000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_NL_in_bool_and_expr3528 = new BitSet(new long[]{0x6632000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_bool_not_expr_in_bool_and_expr3532 = new BitSet(new long[]{0x0000000000000002L,0x2000024000000000L});
    public static final BitSet FOLLOW_p_bool_not_expr_in_p_bool_and_expr3544 = new BitSet(new long[]{0x0000000000000002L,0x2000024000000000L});
    public static final BitSet FOLLOW_NL_in_p_bool_and_expr3547 = new BitSet(new long[]{0x0000000000000000L,0x2000024000000000L});
    public static final BitSet FOLLOW_token_AND_in_p_bool_and_expr3551 = new BitSet(new long[]{0x6632000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_NL_in_p_bool_and_expr3554 = new BitSet(new long[]{0x6632000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_p_bool_not_expr_in_p_bool_and_expr3558 = new BitSet(new long[]{0x0000000000000002L,0x2000024000000000L});
    public static final BitSet FOLLOW_token_NOT_in_bool_not_expr3570 = new BitSet(new long[]{0x6632000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_NL_in_bool_not_expr3573 = new BitSet(new long[]{0x6632000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_bool_not_expr_in_bool_not_expr3577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rel_expr_in_bool_not_expr3582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_NOT_in_p_bool_not_expr3593 = new BitSet(new long[]{0x6632000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_NL_in_p_bool_not_expr3596 = new BitSet(new long[]{0x6632000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_p_bool_not_expr_in_p_bool_not_expr3600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_rel_expr_in_p_bool_not_expr3605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arith_expr_in_rel_expr3614 = new BitSet(new long[]{0x0000000000000002L,0x200000007FE00000L});
    public static final BitSet FOLLOW_NL_in_rel_expr3617 = new BitSet(new long[]{0x0000000000000000L,0x200000007FE00000L});
    public static final BitSet FOLLOW_rel_op_in_rel_expr3620 = new BitSet(new long[]{0x6632000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_NL_in_rel_expr3622 = new BitSet(new long[]{0x6632000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_arith_expr_in_rel_expr3625 = new BitSet(new long[]{0x0000000000000002L,0x200000007FE00000L});
    public static final BitSet FOLLOW_p_arith_expr_in_p_rel_expr3652 = new BitSet(new long[]{0x0000000000000002L,0x200000007FE00000L});
    public static final BitSet FOLLOW_NL_in_p_rel_expr3655 = new BitSet(new long[]{0x0000000000000000L,0x200000007FE00000L});
    public static final BitSet FOLLOW_rel_op_in_p_rel_expr3658 = new BitSet(new long[]{0x6632000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_NL_in_p_rel_expr3660 = new BitSet(new long[]{0x6632000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_p_arith_expr_in_p_rel_expr3663 = new BitSet(new long[]{0x0000000000000002L,0x200000007FE00000L});
    public static final BitSet FOLLOW_token_EQUAL_in_rel_op3689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_NOT_EQUAL_in_rel_op3693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATER_in_rel_op3697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_GREATER_EQ_in_rel_op3701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_in_rel_op3705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_LESS_EQ_in_rel_op3709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_plusplus_expr_in_arith_expr3721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_plusplus_expr_in_p_arith_expr3731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timestimes_expr_in_plusplus_expr3741 = new BitSet(new long[]{0x0000000000000002L,0x2001800000000000L});
    public static final BitSet FOLLOW_NL_in_plusplus_expr3744 = new BitSet(new long[]{0x0000000000000000L,0x0001800000000000L});
    public static final BitSet FOLLOW_PLUSPLUS_in_plusplus_expr3749 = new BitSet(new long[]{0x6632000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_MINUSMINUS_in_plusplus_expr3752 = new BitSet(new long[]{0x6632000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_NL_in_plusplus_expr3756 = new BitSet(new long[]{0x6632000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_timestimes_expr_in_plusplus_expr3760 = new BitSet(new long[]{0x0000000000000002L,0x2001800000000000L});
    public static final BitSet FOLLOW_p_timestimes_expr_in_p_plusplus_expr3772 = new BitSet(new long[]{0x0000000000000002L,0x2001800000000000L});
    public static final BitSet FOLLOW_NL_in_p_plusplus_expr3775 = new BitSet(new long[]{0x0000000000000000L,0x0001800000000000L});
    public static final BitSet FOLLOW_PLUSPLUS_in_p_plusplus_expr3780 = new BitSet(new long[]{0x6632000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_MINUSMINUS_in_p_plusplus_expr3783 = new BitSet(new long[]{0x6632000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_NL_in_p_plusplus_expr3787 = new BitSet(new long[]{0x6632000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_p_timestimes_expr_in_p_plusplus_expr3791 = new BitSet(new long[]{0x0000000000000002L,0x2001800000000000L});
    public static final BitSet FOLLOW_simple_expr_in_timestimes_expr3803 = new BitSet(new long[]{0x0000000000000002L,0x2000600000000000L});
    public static final BitSet FOLLOW_NL_in_timestimes_expr3806 = new BitSet(new long[]{0x0000000000000000L,0x0000600000000000L});
    public static final BitSet FOLLOW_TIMESTIMES_in_timestimes_expr3811 = new BitSet(new long[]{0x6632000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_QUOTIENTQUOTIENT_in_timestimes_expr3814 = new BitSet(new long[]{0x6632000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_NL_in_timestimes_expr3818 = new BitSet(new long[]{0x6632000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_simple_expr_in_timestimes_expr3822 = new BitSet(new long[]{0x0000000000000002L,0x2000600000000000L});
    public static final BitSet FOLLOW_p_simple_expr_in_p_timestimes_expr3835 = new BitSet(new long[]{0x0000000000000002L,0x2000600000000000L});
    public static final BitSet FOLLOW_NL_in_p_timestimes_expr3838 = new BitSet(new long[]{0x0000000000000000L,0x0000600000000000L});
    public static final BitSet FOLLOW_TIMESTIMES_in_p_timestimes_expr3843 = new BitSet(new long[]{0x6632000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_QUOTIENTQUOTIENT_in_p_timestimes_expr3846 = new BitSet(new long[]{0x6632000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_NL_in_p_timestimes_expr3850 = new BitSet(new long[]{0x6632000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_p_simple_expr_in_p_timestimes_expr3854 = new BitSet(new long[]{0x0000000000000002L,0x2000600000000000L});
    public static final BitSet FOLLOW_cons_expr_in_simple_expr3865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_cons_expr_in_p_simple_expr3874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_to_expr_in_cons_expr3883 = new BitSet(new long[]{0x0000000000000002L,0x2000180000000000L});
    public static final BitSet FOLLOW_NL_in_cons_expr3886 = new BitSet(new long[]{0x0000000000000000L,0x2000180000000000L});
    public static final BitSet FOLLOW_token_DOUBLE_COLON_in_cons_expr3889 = new BitSet(new long[]{0x6632000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_NL_in_cons_expr3891 = new BitSet(new long[]{0x6632000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_to_expr_in_cons_expr3894 = new BitSet(new long[]{0x0000000000000002L,0x2000180000000000L});
    public static final BitSet FOLLOW_p_to_expr_in_p_cons_expr3914 = new BitSet(new long[]{0x0000000000000002L,0x2000180000000000L});
    public static final BitSet FOLLOW_NL_in_p_cons_expr3917 = new BitSet(new long[]{0x0000000000000000L,0x2000180000000000L});
    public static final BitSet FOLLOW_token_DOUBLE_COLON_in_p_cons_expr3920 = new BitSet(new long[]{0x6632000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_NL_in_p_cons_expr3922 = new BitSet(new long[]{0x6632000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_p_to_expr_in_p_cons_expr3925 = new BitSet(new long[]{0x0000000000000002L,0x2000180000000000L});
    public static final BitSet FOLLOW_arith_plus_expr_in_to_expr3945 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000030L});
    public static final BitSet FOLLOW_NL_in_to_expr3948 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_L_to_in_to_expr3953 = new BitSet(new long[]{0x6632000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_L_downto_in_to_expr3957 = new BitSet(new long[]{0x6632000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_NL_in_to_expr3961 = new BitSet(new long[]{0x6632000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_arith_plus_expr_in_to_expr3965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_arith_plus_expr_in_p_to_expr3978 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000030L});
    public static final BitSet FOLLOW_NL_in_p_to_expr3981 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_L_to_in_p_to_expr3986 = new BitSet(new long[]{0x6632000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_L_downto_in_p_to_expr3990 = new BitSet(new long[]{0x6632000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_NL_in_p_to_expr3994 = new BitSet(new long[]{0x6632000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_p_arith_plus_expr_in_p_to_expr3998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arith_uminus_expr_in_arith_plus_expr4010 = new BitSet(new long[]{0x0000000000000002L,0x2000000300000000L});
    public static final BitSet FOLLOW_NL_in_arith_plus_expr4014 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_PLUS_in_arith_plus_expr4018 = new BitSet(new long[]{0x6632000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_MINUS_in_arith_plus_expr4023 = new BitSet(new long[]{0x6632000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_NL_in_arith_plus_expr4027 = new BitSet(new long[]{0x6632000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_arith_uminus_expr_in_arith_plus_expr4031 = new BitSet(new long[]{0x0000000000000002L,0x2000000300000000L});
    public static final BitSet FOLLOW_p_arith_uminus_expr_in_p_arith_plus_expr4042 = new BitSet(new long[]{0x0000000000000002L,0x2000000300000000L});
    public static final BitSet FOLLOW_NL_in_p_arith_plus_expr4045 = new BitSet(new long[]{0x0000000000000000L,0x0000000300000000L});
    public static final BitSet FOLLOW_set_in_p_arith_plus_expr4049 = new BitSet(new long[]{0x6632000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_NL_in_p_arith_plus_expr4058 = new BitSet(new long[]{0x6632000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_p_arith_uminus_expr_in_p_arith_plus_expr4062 = new BitSet(new long[]{0x0000000000000002L,0x2000000300000000L});
    public static final BitSet FOLLOW_MINUS_in_arith_uminus_expr4075 = new BitSet(new long[]{0x6632000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_NL_in_arith_uminus_expr4077 = new BitSet(new long[]{0x6632000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_arith_mult_expr_in_arith_uminus_expr4080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arith_mult_expr_in_arith_uminus_expr4093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_p_arith_uminus_expr4104 = new BitSet(new long[]{0x6632000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_NL_in_p_arith_uminus_expr4106 = new BitSet(new long[]{0x6632000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_p_arith_mult_expr_in_p_arith_uminus_expr4109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_arith_mult_expr_in_p_arith_uminus_expr4122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arith_pow_expr_in_arith_mult_expr4131 = new BitSet(new long[]{0x0000000000000002L,0x2000000C00180000L});
    public static final BitSet FOLLOW_NL_in_arith_mult_expr4134 = new BitSet(new long[]{0x0000000000000000L,0x0000000C00180000L});
    public static final BitSet FOLLOW_set_in_arith_mult_expr4138 = new BitSet(new long[]{0x6632000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_NL_in_arith_mult_expr4155 = new BitSet(new long[]{0x6632000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_arith_pow_expr_in_arith_mult_expr4159 = new BitSet(new long[]{0x0000000000000002L,0x2000000C00180000L});
    public static final BitSet FOLLOW_p_arith_pow_expr_in_p_arith_mult_expr4171 = new BitSet(new long[]{0x0000000000000002L,0x2000000C00180000L});
    public static final BitSet FOLLOW_NL_in_p_arith_mult_expr4174 = new BitSet(new long[]{0x0000000000000000L,0x0000000C00180000L});
    public static final BitSet FOLLOW_set_in_p_arith_mult_expr4178 = new BitSet(new long[]{0x6632000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_NL_in_p_arith_mult_expr4195 = new BitSet(new long[]{0x6632000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_p_arith_pow_expr_in_p_arith_mult_expr4199 = new BitSet(new long[]{0x0000000000000002L,0x2000000C00180000L});
    public static final BitSet FOLLOW_apply_expr_in_arith_pow_expr4210 = new BitSet(new long[]{0x0000000000000002L,0x2000001000000000L});
    public static final BitSet FOLLOW_NL_in_arith_pow_expr4213 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_POW_tok_in_arith_pow_expr4216 = new BitSet(new long[]{0x6632000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_NL_in_arith_pow_expr4218 = new BitSet(new long[]{0x6632000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_apply_expr_in_arith_pow_expr4221 = new BitSet(new long[]{0x0000000000000002L,0x2000001000000000L});
    public static final BitSet FOLLOW_p_apply_expr_in_p_arith_pow_expr4242 = new BitSet(new long[]{0x0000000000000002L,0x2000001000000000L});
    public static final BitSet FOLLOW_NL_in_p_arith_pow_expr4245 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_POW_tok_in_p_arith_pow_expr4248 = new BitSet(new long[]{0x6632000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_NL_in_p_arith_pow_expr4250 = new BitSet(new long[]{0x6632000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_p_apply_expr_in_p_arith_pow_expr4253 = new BitSet(new long[]{0x0000000000000002L,0x2000001000000000L});
    public static final BitSet FOLLOW_basic_expr_in_apply_expr4274 = new BitSet(new long[]{0x6632000000000002L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_p_basic_expr_in_p_apply_expr4292 = new BitSet(new long[]{0x6632000000000002L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_NL_in_p_apply_expr4295 = new BitSet(new long[]{0x6632000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_p_basic_expr_in_p_apply_expr4298 = new BitSet(new long[]{0x6632000000000002L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_message_send_expr_in_basic_expr4318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_message_send_expr_in_p_basic_expr4327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitive_expr_in_message_send_expr4336 = new BitSet(new long[]{0x0000000000000002L,0x2080000000000000L});
    public static final BitSet FOLLOW_NL_in_message_send_expr4339 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_PERIOD_in_message_send_expr4342 = new BitSet(new long[]{0x0000000000000000L,0xA000000000000000L});
    public static final BitSet FOLLOW_NL_in_message_send_expr4344 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_Id_in_message_send_expr4347 = new BitSet(new long[]{0x0000000000000002L,0x2080000000000000L});
    public static final BitSet FOLLOW_SQUARE_BRACKET_OPEN_in_list_expr4371 = new BitSet(new long[]{0x663A000000000000L,0xE46004820007DF48L,0x00000000000002EDL});
    public static final BitSet FOLLOW_NL_in_list_expr4373 = new BitSet(new long[]{0x663A000000000000L,0xE46004820007DF48L,0x00000000000002EDL});
    public static final BitSet FOLLOW_protected_expr_in_list_expr4377 = new BitSet(new long[]{0x0000000000000000L,0x2100000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_NL_in_list_expr4380 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_COMMA_in_list_expr4383 = new BitSet(new long[]{0x663A000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_NL_in_list_expr4385 = new BitSet(new long[]{0x663A000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_protected_expr_in_list_expr4388 = new BitSet(new long[]{0x0000000000000000L,0x2100000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_NL_in_list_expr4392 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_SQUARE_BRACKET_CLOSE_in_list_expr4397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROUND_BRACKET_OPEN_in_list_expr4411 = new BitSet(new long[]{0x663A000000000000L,0xE46004820007DF48L,0x00000000000002BDL});
    public static final BitSet FOLLOW_NL_in_list_expr4413 = new BitSet(new long[]{0x663A000000000000L,0xE46004820007DF48L,0x00000000000002BDL});
    public static final BitSet FOLLOW_protected_expr_in_list_expr4417 = new BitSet(new long[]{0x0000000000000000L,0x2100000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_NL_in_list_expr4420 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_COMMA_in_list_expr4423 = new BitSet(new long[]{0x663A000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_NL_in_list_expr4425 = new BitSet(new long[]{0x663A000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_protected_expr_in_list_expr4428 = new BitSet(new long[]{0x0000000000000000L,0x2100000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_NL_in_list_expr4432 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_COMMA_in_list_expr4436 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_NL_in_list_expr4438 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ROUND_BRACKET_CLOSE_in_list_expr4445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURLY_BRACKET_OPEN_in_map_or_set_expr4474 = new BitSet(new long[]{0x663A000000000000L,0xE46004820007DF48L,0x00000000000003ADL});
    public static final BitSet FOLLOW_NL_in_map_or_set_expr4476 = new BitSet(new long[]{0x663A000000000000L,0xE46004820007DF48L,0x00000000000003ADL});
    public static final BitSet FOLLOW_map_or_set_elem_expr_in_map_or_set_expr4480 = new BitSet(new long[]{0x0000000000000000L,0x2100000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_NL_in_map_or_set_expr4482 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_COMMA_in_map_or_set_expr4486 = new BitSet(new long[]{0x663A000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_NL_in_map_or_set_expr4488 = new BitSet(new long[]{0x663A000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_map_or_set_elem_expr_in_map_or_set_expr4491 = new BitSet(new long[]{0x0000000000000000L,0x2100000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_NL_in_map_or_set_expr4493 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_CURLY_BRACKET_CLOSE_in_map_or_set_expr4500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURLY_BRACKET_OPEN_in_map_or_set_expr4520 = new BitSet(new long[]{0x0000000000000000L,0x2018000000000000L});
    public static final BitSet FOLLOW_NL_in_map_or_set_expr4522 = new BitSet(new long[]{0x0000000000000000L,0x0018000000000000L});
    public static final BitSet FOLLOW_token_ARROW_in_map_or_set_expr4525 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_NL_in_map_or_set_expr4527 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_CURLY_BRACKET_CLOSE_in_map_or_set_expr4530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protected_expr_in_map_or_set_elem_expr4547 = new BitSet(new long[]{0x0000000200000002L,0x2018000000000000L});
    public static final BitSet FOLLOW_NL_in_map_or_set_elem_expr4550 = new BitSet(new long[]{0x0000000200000000L,0x2018000000000000L});
    public static final BitSet FOLLOW_arrow_or_assign_in_map_or_set_elem_expr4553 = new BitSet(new long[]{0x663A000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_NL_in_map_or_set_elem_expr4555 = new BitSet(new long[]{0x663A000000000000L,0xE46004820007DF48L,0x00000000000002ADL});
    public static final BitSet FOLLOW_protected_expr_in_map_or_set_elem_expr4558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Num_in_primitive_expr4585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_String_in_primitive_expr4590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Id_in_primitive_expr4595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Constr_in_primitive_expr4600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_true_in_primitive_expr4605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_false_in_primitive_expr4610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_this_in_primitive_expr4615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_nil_in_primitive_expr4621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_infinity_in_primitive_expr4626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_list_expr_in_primitive_expr4632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_with_control_expr_in_primitive_expr4637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_map_or_set_expr_in_primitive_expr4642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_prog4652 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_prog4654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Id_in_synpred1_babel171628 = new BitSet(new long[]{0x8000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_NL_in_synpred1_babel171630 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_L_as_in_synpred1_babel171633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protected_expr_in_synpred2_babel171664 = new BitSet(new long[]{0x0000000000000000L,0x2200000000000000L});
    public static final BitSet FOLLOW_NL_in_synpred2_babel171666 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_QUESTION_MARK_in_synpred2_babel171669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_synpred3_babel172538 = new BitSet(new long[]{0x0000000200000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_objelem_assign_in_synpred3_babel172542 = new BitSet(new long[]{0x0000000200000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_NL_in_synpred3_babel172545 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ASSIGN_in_synpred3_babel172548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_obj_in_synpred4_babel172768 = new BitSet(new long[]{0x0000000000000000L,0x2000000500000000L});
    public static final BitSet FOLLOW_NL_in_synpred4_babel172770 = new BitSet(new long[]{0x0000000000000000L,0x2000000500000000L});
    public static final BitSet FOLLOW_parents_in_synpred4_babel172773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_expr_in_synpred5_babel172842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protected_lambda_expr_in_synpred6_babel172863 = new BitSet(new long[]{0x0000000000000002L});

}