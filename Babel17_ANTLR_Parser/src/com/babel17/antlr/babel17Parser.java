// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g 2010-03-15 13:12:07

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
    public static final int COMMA=128;
    public static final int LAZY=37;
    public static final int MINUS=104;
    public static final int L_public=78;
    public static final int U_AND=114;
    public static final int DEF=30;
    public static final int L_while=60;
    public static final int L_external=80;
    public static final int BigLetter=48;
    public static final int L_downto=72;
    public static final int L_random=89;
    public static final int Charcode=137;
    public static final int PLUSPLUS=119;
    public static final int L_private=76;
    public static final int TILDE=130;
    public static final int UNRELATED=101;
    public static final int PACKAGE=36;
    public static final int IF_PATTERN=42;
    public static final int PROG=4;
    public static final int CURLY_BRACKET_CLOSE=144;
    public static final int QUESTION_MARK=129;
    public static final int Letter=49;
    public static final int MODULE_DECL=34;
    public static final int L_with=55;
    public static final int A_DOUBLE_ARROW=121;
    public static final int CURLY_BRACKET_OPEN=143;
    public static final int MEM_WEAK=41;
    public static final int SQUARE_LIST=8;
    public static final int MODULE_KEY=109;
    public static final int MEM_STRONG=40;
    public static final int UMINUS=23;
    public static final int Constr=134;
    public static final int L_true=85;
    public static final int U_infinity=74;
    public static final int PLUS=103;
    public static final int L_val=67;
    public static final int OBJ=19;
    public static final int APPLY=12;
    public static final int L_elseif=59;
    public static final int L_as=66;
    public static final int POW_tok=108;
    public static final int MODULE_PATH=35;
    public static final int CASES=18;
    public static final int L_package=90;
    public static final int L_in=69;
    public static final int U_DOUBLE_ARROW=122;
    public static final int A_NOT_EQUAL=93;
    public static final int L_false=86;
    public static final int WS=132;
    public static final int COMMENT1=43;
    public static final int Hex=51;
    public static final int A_AND=111;
    public static final int L_yield=63;
    public static final int L_concurrent=81;
    public static final int L_else=58;
    public static final int L_lazy=83;
    public static final int L_await=82;
    public static final int L_to=71;
    public static final int L_exception=70;
    public static final int L_def=68;
    public static final int L_then=57;
    public static final int NotNewline=45;
    public static final int LAMBDA=7;
    public static final int ANY=6;
    public static final int String=138;
    public static final int CONCURRENT=38;
    public static final int MESSAGE_SEND=22;
    public static final int SQUARE_BRACKET_OPEN=141;
    public static final int FOR_EXPR=20;
    public static final int MEMOIZE=39;
    public static final int Newline=44;
    public static final int TIMESTIMES=118;
    public static final int ROUND_BRACKET_OPEN=139;
    public static final int ROUND_LIST=9;
    public static final int U_ELLIPSIS=126;
    public static final int COMMENT2=46;
    public static final int COLON=146;
    public static final int MAP_OR_SET=14;
    public static final int L_protected=77;
    public static final int DIV=106;
    public static final int L_if=56;
    public static final int U_NOT=115;
    public static final int L_memoize=84;
    public static final int A_DOUBLE_COLON=116;
    public static final int UNDERSCORE=145;
    public static final int SC=102;
    public static final int Digit=50;
    public static final int MINUSMINUS=120;
    public static final int U_GREATER_EQ=100;
    public static final int A_LESS_EQ=96;
    public static final int PERIOD=127;
    public static final int A_GREATER_EQ=99;
    public static final int MOD=107;
    public static final int L_match=64;
    public static final int Num=136;
    public static final int BLOCK=25;
    public static final int SmallLetter=47;
    public static final int VAL=28;
    public static final int NL=133;
    public static final int LESS=95;
    public static final int ROUND_BRACKET_CLOSE=140;
    public static final int U_LESS_EQ=97;
    public static final int LIST_CONS=10;
    public static final int U_NOT_EQUAL=94;
    public static final int L_obj=54;
    public static final int L_root=79;
    public static final int ASSIGN=29;
    public static final int WHILE_DO=21;
    public static final int GREATER=98;
    public static final int L_module=75;
    public static final int L_end=53;
    public static final int A_ARROW=123;
    public static final int EMPTY_MAP=15;
    public static final int A_ELLIPSIS=125;
    public static final int TIMES=105;
    public static final int SQUARE_BRACKET_CLOSE=142;
    public static final int U_DOUBLE_COLON=117;
    public static final int A_infinity=73;
    public static final int MODULE_DEF=33;
    public static final int POW=24;
    public static final int YIELD=32;
    public static final int BEGIN=26;
    public static final int MATCH=17;
    public static final int WITH=27;
    public static final int L_this=87;
    public static final int U_OR=113;
    public static final int COMPARE=11;
    public static final int U_ARROW=124;
    public static final int IF=13;
    public static final int EOF=-1;
    public static final int NIL=5;
    public static final int L_for=61;
    public static final int A_NOT=112;
    public static final int A_EQUAL=91;
    public static final int A_OR=110;
    public static final int WsChar=131;
    public static final int L_do=62;
    public static final int ATTRIBUTE=31;
    public static final int L_begin=52;
    public static final int L_here=88;
    public static final int L_case=65;
    public static final int U_EQUAL=92;
    public static final int Id=135;
    public static final int EXCEPTION=16;

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
    public String getGrammarFileName() { return "/Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g"; }

     

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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:177:1: token_infinity : ( A_infinity | U_infinity );
    public final babel17Parser.token_infinity_return token_infinity() throws RecognitionException {
        babel17Parser.token_infinity_return retval = new babel17Parser.token_infinity_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set1=null;

        CommonTree set1_tree=null;

        try {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:178:2: ( A_infinity | U_infinity )
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:
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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:217:1: token_EQUAL : ( A_EQUAL | U_EQUAL );
    public final babel17Parser.token_EQUAL_return token_EQUAL() throws RecognitionException {
        babel17Parser.token_EQUAL_return retval = new babel17Parser.token_EQUAL_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set2=null;

        CommonTree set2_tree=null;

        try {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:218:2: ( A_EQUAL | U_EQUAL )
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:
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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:225:1: token_NOT_EQUAL : ( A_NOT_EQUAL | U_NOT_EQUAL );
    public final babel17Parser.token_NOT_EQUAL_return token_NOT_EQUAL() throws RecognitionException {
        babel17Parser.token_NOT_EQUAL_return retval = new babel17Parser.token_NOT_EQUAL_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set3=null;

        CommonTree set3_tree=null;

        try {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:226:2: ( A_NOT_EQUAL | U_NOT_EQUAL )
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:
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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:234:1: token_LESS_EQ : ( A_LESS_EQ | U_LESS_EQ );
    public final babel17Parser.token_LESS_EQ_return token_LESS_EQ() throws RecognitionException {
        babel17Parser.token_LESS_EQ_return retval = new babel17Parser.token_LESS_EQ_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set4=null;

        CommonTree set4_tree=null;

        try {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:235:2: ( A_LESS_EQ | U_LESS_EQ )
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:
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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:244:1: token_GREATER_EQ : ( A_GREATER_EQ | U_GREATER_EQ );
    public final babel17Parser.token_GREATER_EQ_return token_GREATER_EQ() throws RecognitionException {
        babel17Parser.token_GREATER_EQ_return retval = new babel17Parser.token_GREATER_EQ_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set5=null;

        CommonTree set5_tree=null;

        try {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:245:2: ( A_GREATER_EQ | U_GREATER_EQ )
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:
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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:268:1: token_OR : ( A_OR | U_OR );
    public final babel17Parser.token_OR_return token_OR() throws RecognitionException {
        babel17Parser.token_OR_return retval = new babel17Parser.token_OR_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set6=null;

        CommonTree set6_tree=null;

        try {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:268:9: ( A_OR | U_OR )
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:
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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:269:1: token_AND : ( A_AND | U_AND );
    public final babel17Parser.token_AND_return token_AND() throws RecognitionException {
        babel17Parser.token_AND_return retval = new babel17Parser.token_AND_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set7=null;

        CommonTree set7_tree=null;

        try {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:270:2: ( A_AND | U_AND )
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:
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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:271:1: token_NOT : ( A_NOT | U_NOT );
    public final babel17Parser.token_NOT_return token_NOT() throws RecognitionException {
        babel17Parser.token_NOT_return retval = new babel17Parser.token_NOT_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set8=null;

        CommonTree set8_tree=null;

        try {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:272:2: ( A_NOT | U_NOT )
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:
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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:278:1: token_DOUBLE_COLON : ( A_DOUBLE_COLON | U_DOUBLE_COLON );
    public final babel17Parser.token_DOUBLE_COLON_return token_DOUBLE_COLON() throws RecognitionException {
        babel17Parser.token_DOUBLE_COLON_return retval = new babel17Parser.token_DOUBLE_COLON_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set9=null;

        CommonTree set9_tree=null;

        try {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:279:2: ( A_DOUBLE_COLON | U_DOUBLE_COLON )
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:
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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:294:1: token_DOUBLE_ARROW : ( A_DOUBLE_ARROW | U_DOUBLE_ARROW );
    public final babel17Parser.token_DOUBLE_ARROW_return token_DOUBLE_ARROW() throws RecognitionException {
        babel17Parser.token_DOUBLE_ARROW_return retval = new babel17Parser.token_DOUBLE_ARROW_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set10=null;

        CommonTree set10_tree=null;

        try {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:295:2: ( A_DOUBLE_ARROW | U_DOUBLE_ARROW )
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:
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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:299:1: token_ARROW : ( A_ARROW | U_ARROW );
    public final babel17Parser.token_ARROW_return token_ARROW() throws RecognitionException {
        babel17Parser.token_ARROW_return retval = new babel17Parser.token_ARROW_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set11=null;

        CommonTree set11_tree=null;

        try {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:300:2: ( A_ARROW | U_ARROW )
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:
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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:305:1: token_ELLIPSIS : ( A_ELLIPSIS | U_ELLIPSIS );
    public final babel17Parser.token_ELLIPSIS_return token_ELLIPSIS() throws RecognitionException {
        babel17Parser.token_ELLIPSIS_return retval = new babel17Parser.token_ELLIPSIS_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set12=null;

        CommonTree set12_tree=null;

        try {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:306:2: ( A_ELLIPSIS | U_ELLIPSIS )
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:
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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:365:1: pattern : ( Constr ( ( NL )? primitive_pattern )? -> ^( Constr ( primitive_pattern )? ) | primitive_pattern ( ( NL )? token_DOUBLE_COLON ( NL )? primitive_pattern )* -> ^( LIST_CONS ( primitive_pattern )* ) );
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
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:365:9: ( Constr ( ( NL )? primitive_pattern )? -> ^( Constr ( primitive_pattern )? ) | primitive_pattern ( ( NL )? token_DOUBLE_COLON ( NL )? primitive_pattern )* -> ^( LIST_CONS ( primitive_pattern )* ) )
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
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:365:11: Constr ( ( NL )? primitive_pattern )?
                    {
                    Constr13=(Token)match(input,Constr,FOLLOW_Constr_in_pattern1572); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Constr.add(Constr13);

                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:365:18: ( ( NL )? primitive_pattern )?
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
                            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:365:19: ( NL )? primitive_pattern
                            {
                            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:365:19: ( NL )?
                            int alt1=2;
                            int LA1_0 = input.LA(1);

                            if ( (LA1_0==NL) ) {
                                alt1=1;
                            }
                            switch (alt1) {
                                case 1 :
                                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:365:19: NL
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
                    // 365:43: -> ^( Constr ( primitive_pattern )? )
                    {
                        // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:365:46: ^( Constr ( primitive_pattern )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_Constr.nextNode(), root_1);

                        // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:365:55: ( primitive_pattern )?
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
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:366:4: primitive_pattern ( ( NL )? token_DOUBLE_COLON ( NL )? primitive_pattern )*
                    {
                    pushFollow(FOLLOW_primitive_pattern_in_pattern1594);
                    primitive_pattern16=primitive_pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primitive_pattern.add(primitive_pattern16.getTree());
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:366:22: ( ( NL )? token_DOUBLE_COLON ( NL )? primitive_pattern )*
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
                    	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:366:23: ( NL )? token_DOUBLE_COLON ( NL )? primitive_pattern
                    	    {
                    	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:366:23: ( NL )?
                    	    int alt3=2;
                    	    int LA3_0 = input.LA(1);

                    	    if ( (LA3_0==NL) ) {
                    	        alt3=1;
                    	    }
                    	    switch (alt3) {
                    	        case 1 :
                    	            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:366:23: NL
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
                    	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:366:46: ( NL )?
                    	    int alt4=2;
                    	    int LA4_0 = input.LA(1);

                    	    if ( (LA4_0==NL) ) {
                    	        alt4=1;
                    	    }
                    	    switch (alt4) {
                    	        case 1 :
                    	            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:366:46: NL
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
                        // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:367:6: ^( LIST_CONS ( primitive_pattern )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LIST_CONS, "LIST_CONS"), root_1);

                        // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:367:18: ( primitive_pattern )*
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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:369:1: bracket_pattern : ( ( Id ( NL )? L_as )=> Id ( NL )? L_as ( NL )? pattern -> ^( L_as Id pattern ) | ( protected_expr ( NL )? QUESTION_MARK )=> protected_expr ( NL )? QUESTION_MARK ( ( NL )? pattern )? -> ^( QUESTION_MARK protected_expr ( pattern )? ) | pattern ( ( NL )? L_if ( NL )? protected_expr )? -> ^( IF_PATTERN pattern ( protected_expr )? ) | L_val ( NL )? protected_expr -> ^( L_val protected_expr ) | token_ELLIPSIS );
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
        RewriteRuleTokenStream stream_QUESTION_MARK=new RewriteRuleTokenStream(adaptor,"token QUESTION_MARK");
        RewriteRuleTokenStream stream_L_if=new RewriteRuleTokenStream(adaptor,"token L_if");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_val=new RewriteRuleTokenStream(adaptor,"token L_val");
        RewriteRuleTokenStream stream_Id=new RewriteRuleTokenStream(adaptor,"token Id");
        RewriteRuleTokenStream stream_L_as=new RewriteRuleTokenStream(adaptor,"token L_as");
        RewriteRuleSubtreeStream stream_protected_expr=new RewriteRuleSubtreeStream(adaptor,"rule protected_expr");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        try {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:370:2: ( ( Id ( NL )? L_as )=> Id ( NL )? L_as ( NL )? pattern -> ^( L_as Id pattern ) | ( protected_expr ( NL )? QUESTION_MARK )=> protected_expr ( NL )? QUESTION_MARK ( ( NL )? pattern )? -> ^( QUESTION_MARK protected_expr ( pattern )? ) | pattern ( ( NL )? L_if ( NL )? protected_expr )? -> ^( IF_PATTERN pattern ( protected_expr )? ) | L_val ( NL )? protected_expr -> ^( L_val protected_expr ) | token_ELLIPSIS )
            int alt16=5;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:370:10: ( Id ( NL )? L_as )=> Id ( NL )? L_as ( NL )? pattern
                    {
                    Id21=(Token)match(input,Id,FOLLOW_Id_in_bracket_pattern1646); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Id.add(Id21);

                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:370:30: ( NL )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==NL) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:370:30: NL
                            {
                            NL22=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1648); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL22);


                            }
                            break;

                    }

                    L_as23=(Token)match(input,L_as,FOLLOW_L_as_in_bracket_pattern1651); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_as.add(L_as23);

                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:370:39: ( NL )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==NL) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:370:39: NL
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
                    // 370:51: -> ^( L_as Id pattern )
                    {
                        // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:370:54: ^( L_as Id pattern )
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
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:371:4: ( protected_expr ( NL )? QUESTION_MARK )=> protected_expr ( NL )? QUESTION_MARK ( ( NL )? pattern )?
                    {
                    pushFollow(FOLLOW_protected_expr_in_bracket_pattern1685);
                    protected_expr26=protected_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr26.getTree());
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:372:18: ( NL )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==NL) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:372:18: NL
                            {
                            NL27=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1687); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL27);


                            }
                            break;

                    }

                    QUESTION_MARK28=(Token)match(input,QUESTION_MARK,FOLLOW_QUESTION_MARK_in_bracket_pattern1690); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QUESTION_MARK.add(QUESTION_MARK28);

                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:372:36: ( ( NL )? pattern )?
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
                            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:372:37: ( NL )? pattern
                            {
                            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:372:37: ( NL )?
                            int alt10=2;
                            int LA10_0 = input.LA(1);

                            if ( (LA10_0==NL) ) {
                                alt10=1;
                            }
                            switch (alt10) {
                                case 1 :
                                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:372:37: NL
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
                    // elements: protected_expr, pattern, QUESTION_MARK
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
                        // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:372:54: ^( QUESTION_MARK protected_expr ( pattern )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_QUESTION_MARK.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_protected_expr.nextTree());
                        // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:372:85: ( pattern )?
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
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:373:4: pattern ( ( NL )? L_if ( NL )? protected_expr )?
                    {
                    pushFollow(FOLLOW_pattern_in_bracket_pattern1714);
                    pattern31=pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pattern.add(pattern31.getTree());
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:373:12: ( ( NL )? L_if ( NL )? protected_expr )?
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
                            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:373:13: ( NL )? L_if ( NL )? protected_expr
                            {
                            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:373:13: ( NL )?
                            int alt12=2;
                            int LA12_0 = input.LA(1);

                            if ( (LA12_0==NL) ) {
                                alt12=1;
                            }
                            switch (alt12) {
                                case 1 :
                                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:373:13: NL
                                    {
                                    NL32=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1717); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL32);


                                    }
                                    break;

                            }

                            L_if33=(Token)match(input,L_if,FOLLOW_L_if_in_bracket_pattern1720); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_L_if.add(L_if33);

                            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:373:22: ( NL )?
                            int alt13=2;
                            int LA13_0 = input.LA(1);

                            if ( (LA13_0==NL) ) {
                                alt13=1;
                            }
                            switch (alt13) {
                                case 1 :
                                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:373:22: NL
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
                        // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:373:46: ^( IF_PATTERN pattern ( protected_expr )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IF_PATTERN, "IF_PATTERN"), root_1);

                        adaptor.addChild(root_1, stream_pattern.nextTree());
                        // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:373:67: ( protected_expr )?
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
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:374:4: L_val ( NL )? protected_expr
                    {
                    L_val36=(Token)match(input,L_val,FOLLOW_L_val_in_bracket_pattern1743); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_val.add(L_val36);

                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:374:10: ( NL )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==NL) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:374:10: NL
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
                        // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:374:32: ^( L_val protected_expr )
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
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:375:4: token_ELLIPSIS
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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:377:1: mselem_pattern : bracket_pattern ( ( NL )? token_ARROW ( NL )? bracket_pattern )? -> ^( NIL ( bracket_pattern )* ) ;
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
        RewriteRuleSubtreeStream stream_bracket_pattern=new RewriteRuleSubtreeStream(adaptor,"rule bracket_pattern");
        RewriteRuleSubtreeStream stream_token_ARROW=new RewriteRuleSubtreeStream(adaptor,"rule token_ARROW");
        try {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:378:2: ( bracket_pattern ( ( NL )? token_ARROW ( NL )? bracket_pattern )? -> ^( NIL ( bracket_pattern )* ) )
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:378:4: bracket_pattern ( ( NL )? token_ARROW ( NL )? bracket_pattern )?
            {
            pushFollow(FOLLOW_bracket_pattern_in_mselem_pattern1771);
            bracket_pattern40=bracket_pattern();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bracket_pattern.add(bracket_pattern40.getTree());
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:378:20: ( ( NL )? token_ARROW ( NL )? bracket_pattern )?
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
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:378:21: ( NL )? token_ARROW ( NL )? bracket_pattern
                    {
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:378:21: ( NL )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==NL) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:378:21: NL
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
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:378:37: ( NL )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==NL) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:378:37: NL
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
                // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:379:6: ^( NIL ( bracket_pattern )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL, "NIL"), root_1);

                // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:379:12: ( bracket_pattern )*
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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:381:1: primitive_pattern : ( Id | '_' -> ANY | String | Num | L_true | L_false | token_infinity | '-' ( NL )? token_infinity -> ^( UMINUS token_infinity ) | '-' ( NL )? Num -> ^( UMINUS Num ) | '[' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* )? ']' -> ^( SQUARE_LIST ( bracket_pattern )* ) | '(' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* ( COMMA ( NL )? )? )? ')' -> ^( ROUND_LIST ^( NIL ( COMMA )* ) ^( NIL ( bracket_pattern )* ) ) | '{' ( NL )? ( mselem_pattern ( NL )? ( COMMA ( NL )? mselem_pattern ( NL )? )* )? '}' -> ^( MAP_OR_SET ( mselem_pattern )* ) | '{' ( NL )? token_ARROW ( NL )? '}' -> ^( EMPTY_MAP ) );
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
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_ROUND_BRACKET_CLOSE=new RewriteRuleTokenStream(adaptor,"token ROUND_BRACKET_CLOSE");
        RewriteRuleTokenStream stream_SQUARE_BRACKET_OPEN=new RewriteRuleTokenStream(adaptor,"token SQUARE_BRACKET_OPEN");
        RewriteRuleTokenStream stream_CURLY_BRACKET_OPEN=new RewriteRuleTokenStream(adaptor,"token CURLY_BRACKET_OPEN");
        RewriteRuleTokenStream stream_Num=new RewriteRuleTokenStream(adaptor,"token Num");
        RewriteRuleTokenStream stream_ROUND_BRACKET_OPEN=new RewriteRuleTokenStream(adaptor,"token ROUND_BRACKET_OPEN");
        RewriteRuleTokenStream stream_SQUARE_BRACKET_CLOSE=new RewriteRuleTokenStream(adaptor,"token SQUARE_BRACKET_CLOSE");
        RewriteRuleTokenStream stream_UNDERSCORE=new RewriteRuleTokenStream(adaptor,"token UNDERSCORE");
        RewriteRuleTokenStream stream_CURLY_BRACKET_CLOSE=new RewriteRuleTokenStream(adaptor,"token CURLY_BRACKET_CLOSE");
        RewriteRuleSubtreeStream stream_bracket_pattern=new RewriteRuleSubtreeStream(adaptor,"rule bracket_pattern");
        RewriteRuleSubtreeStream stream_token_ARROW=new RewriteRuleSubtreeStream(adaptor,"rule token_ARROW");
        RewriteRuleSubtreeStream stream_mselem_pattern=new RewriteRuleSubtreeStream(adaptor,"rule mselem_pattern");
        RewriteRuleSubtreeStream stream_token_infinity=new RewriteRuleSubtreeStream(adaptor,"rule token_infinity");
        try {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:382:2: ( Id | '_' -> ANY | String | Num | L_true | L_false | token_infinity | '-' ( NL )? token_infinity -> ^( UMINUS token_infinity ) | '-' ( NL )? Num -> ^( UMINUS Num ) | '[' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* )? ']' -> ^( SQUARE_LIST ( bracket_pattern )* ) | '(' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* ( COMMA ( NL )? )? )? ')' -> ^( ROUND_LIST ^( NIL ( COMMA )* ) ^( NIL ( bracket_pattern )* ) ) | '{' ( NL )? ( mselem_pattern ( NL )? ( COMMA ( NL )? mselem_pattern ( NL )? )* )? '}' -> ^( MAP_OR_SET ( mselem_pattern )* ) | '{' ( NL )? token_ARROW ( NL )? '}' -> ^( EMPTY_MAP ) )
            int alt44=13;
            alt44 = dfa44.predict(input);
            switch (alt44) {
                case 1 :
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:382:4: Id
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
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:383:4: '_'
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
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:384:4: String
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
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:385:4: Num
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
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:386:4: L_true
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
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:387:4: L_false
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
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:388:4: token_infinity
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
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:389:4: '-' ( NL )? token_infinity
                    {
                    char_literal52=(Token)match(input,MINUS,FOLLOW_MINUS_in_primitive_pattern1843); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(char_literal52);

                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:389:8: ( NL )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==NL) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:389:8: NL
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
                        // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:389:30: ^( UMINUS token_infinity )
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
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:390:4: '-' ( NL )? Num
                    {
                    char_literal55=(Token)match(input,MINUS,FOLLOW_MINUS_in_primitive_pattern1861); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(char_literal55);

                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:390:8: ( NL )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==NL) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:390:8: NL
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
                        // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:390:19: ^( UMINUS Num )
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
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:391:4: '[' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* )? ']'
                    {
                    char_literal58=(Token)match(input,SQUARE_BRACKET_OPEN,FOLLOW_SQUARE_BRACKET_OPEN_in_primitive_pattern1879); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SQUARE_BRACKET_OPEN.add(char_literal58);

                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:391:9: ( NL )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==NL) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:391:9: NL
                            {
                            NL59=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern1882); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL59);


                            }
                            break;

                    }

                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:391:13: ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==L_begin||(LA27_0>=L_obj && LA27_0<=L_if)||(LA27_0>=L_while && LA27_0<=L_for)||(LA27_0>=L_match && LA27_0<=L_case)||LA27_0==L_val||LA27_0==L_exception||(LA27_0>=A_infinity && LA27_0<=U_infinity)||LA27_0==L_root||(LA27_0>=L_concurrent && LA27_0<=L_lazy)||(LA27_0>=L_true && LA27_0<=L_random)||LA27_0==MINUS||LA27_0==MODULE_KEY||LA27_0==A_NOT||LA27_0==U_NOT||(LA27_0>=A_ELLIPSIS && LA27_0<=U_ELLIPSIS)||LA27_0==TILDE||(LA27_0>=Constr && LA27_0<=Num)||(LA27_0>=String && LA27_0<=ROUND_BRACKET_OPEN)||LA27_0==SQUARE_BRACKET_OPEN||LA27_0==CURLY_BRACKET_OPEN||LA27_0==UNDERSCORE) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:391:14: bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )*
                            {
                            pushFollow(FOLLOW_bracket_pattern_in_primitive_pattern1886);
                            bracket_pattern60=bracket_pattern();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_bracket_pattern.add(bracket_pattern60.getTree());
                            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:391:30: ( NL )?
                            int alt23=2;
                            int LA23_0 = input.LA(1);

                            if ( (LA23_0==NL) ) {
                                alt23=1;
                            }
                            switch (alt23) {
                                case 1 :
                                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:391:30: NL
                                    {
                                    NL61=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern1888); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL61);


                                    }
                                    break;

                            }

                            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:391:34: ( COMMA ( NL )? bracket_pattern ( NL )? )*
                            loop26:
                            do {
                                int alt26=2;
                                int LA26_0 = input.LA(1);

                                if ( (LA26_0==COMMA) ) {
                                    alt26=1;
                                }


                                switch (alt26) {
                            	case 1 :
                            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:391:36: COMMA ( NL )? bracket_pattern ( NL )?
                            	    {
                            	    COMMA62=(Token)match(input,COMMA,FOLLOW_COMMA_in_primitive_pattern1893); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA62);

                            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:391:42: ( NL )?
                            	    int alt24=2;
                            	    int LA24_0 = input.LA(1);

                            	    if ( (LA24_0==NL) ) {
                            	        alt24=1;
                            	    }
                            	    switch (alt24) {
                            	        case 1 :
                            	            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:391:42: NL
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
                            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:391:62: ( NL )?
                            	    int alt25=2;
                            	    int LA25_0 = input.LA(1);

                            	    if ( (LA25_0==NL) ) {
                            	        alt25=1;
                            	    }
                            	    switch (alt25) {
                            	        case 1 :
                            	            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:391:62: NL
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
                        // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:392:9: ^( SQUARE_LIST ( bracket_pattern )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SQUARE_LIST, "SQUARE_LIST"), root_1);

                        // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:392:23: ( bracket_pattern )*
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
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:393:4: '(' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* ( COMMA ( NL )? )? )? ')'
                    {
                    char_literal67=(Token)match(input,ROUND_BRACKET_OPEN,FOLLOW_ROUND_BRACKET_OPEN_in_primitive_pattern1928); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ROUND_BRACKET_OPEN.add(char_literal67);

                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:393:9: ( NL )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==NL) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:393:9: NL
                            {
                            NL68=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern1931); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL68);


                            }
                            break;

                    }

                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:393:13: ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* ( COMMA ( NL )? )? )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==L_begin||(LA35_0>=L_obj && LA35_0<=L_if)||(LA35_0>=L_while && LA35_0<=L_for)||(LA35_0>=L_match && LA35_0<=L_case)||LA35_0==L_val||LA35_0==L_exception||(LA35_0>=A_infinity && LA35_0<=U_infinity)||LA35_0==L_root||(LA35_0>=L_concurrent && LA35_0<=L_lazy)||(LA35_0>=L_true && LA35_0<=L_random)||LA35_0==MINUS||LA35_0==MODULE_KEY||LA35_0==A_NOT||LA35_0==U_NOT||(LA35_0>=A_ELLIPSIS && LA35_0<=U_ELLIPSIS)||LA35_0==TILDE||(LA35_0>=Constr && LA35_0<=Num)||(LA35_0>=String && LA35_0<=ROUND_BRACKET_OPEN)||LA35_0==SQUARE_BRACKET_OPEN||LA35_0==CURLY_BRACKET_OPEN||LA35_0==UNDERSCORE) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:393:14: bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* ( COMMA ( NL )? )?
                            {
                            pushFollow(FOLLOW_bracket_pattern_in_primitive_pattern1935);
                            bracket_pattern69=bracket_pattern();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_bracket_pattern.add(bracket_pattern69.getTree());
                            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:393:30: ( NL )?
                            int alt29=2;
                            int LA29_0 = input.LA(1);

                            if ( (LA29_0==NL) ) {
                                alt29=1;
                            }
                            switch (alt29) {
                                case 1 :
                                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:393:30: NL
                                    {
                                    NL70=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern1937); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL70);


                                    }
                                    break;

                            }

                            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:393:34: ( COMMA ( NL )? bracket_pattern ( NL )? )*
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
                            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:393:36: COMMA ( NL )? bracket_pattern ( NL )?
                            	    {
                            	    COMMA71=(Token)match(input,COMMA,FOLLOW_COMMA_in_primitive_pattern1942); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA71);

                            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:393:43: ( NL )?
                            	    int alt30=2;
                            	    int LA30_0 = input.LA(1);

                            	    if ( (LA30_0==NL) ) {
                            	        alt30=1;
                            	    }
                            	    switch (alt30) {
                            	        case 1 :
                            	            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:393:43: NL
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
                            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:393:63: ( NL )?
                            	    int alt31=2;
                            	    int LA31_0 = input.LA(1);

                            	    if ( (LA31_0==NL) ) {
                            	        alt31=1;
                            	    }
                            	    switch (alt31) {
                            	        case 1 :
                            	            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:393:63: NL
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

                            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:393:69: ( COMMA ( NL )? )?
                            int alt34=2;
                            int LA34_0 = input.LA(1);

                            if ( (LA34_0==COMMA) ) {
                                alt34=1;
                            }
                            switch (alt34) {
                                case 1 :
                                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:393:70: COMMA ( NL )?
                                    {
                                    COMMA75=(Token)match(input,COMMA,FOLLOW_COMMA_in_primitive_pattern1956); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_COMMA.add(COMMA75);

                                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:393:76: ( NL )?
                                    int alt33=2;
                                    int LA33_0 = input.LA(1);

                                    if ( (LA33_0==NL) ) {
                                        alt33=1;
                                    }
                                    switch (alt33) {
                                        case 1 :
                                            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:393:76: NL
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
                    // 394:5: -> ^( ROUND_LIST ^( NIL ( COMMA )* ) ^( NIL ( bracket_pattern )* ) )
                    {
                        // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:394:8: ^( ROUND_LIST ^( NIL ( COMMA )* ) ^( NIL ( bracket_pattern )* ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ROUND_LIST, "ROUND_LIST"), root_1);

                        // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:394:21: ^( NIL ( COMMA )* )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL, "NIL"), root_2);

                        // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:394:27: ( COMMA )*
                        while ( stream_COMMA.hasNext() ) {
                            adaptor.addChild(root_2, stream_COMMA.nextNode());

                        }
                        stream_COMMA.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:394:35: ^( NIL ( bracket_pattern )* )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL, "NIL"), root_2);

                        // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:394:41: ( bracket_pattern )*
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
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:395:4: '{' ( NL )? ( mselem_pattern ( NL )? ( COMMA ( NL )? mselem_pattern ( NL )? )* )? '}'
                    {
                    char_literal78=(Token)match(input,CURLY_BRACKET_OPEN,FOLLOW_CURLY_BRACKET_OPEN_in_primitive_pattern1997); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_OPEN.add(char_literal78);

                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:395:9: ( NL )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==NL) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:395:9: NL
                            {
                            NL79=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2000); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL79);


                            }
                            break;

                    }

                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:395:13: ( mselem_pattern ( NL )? ( COMMA ( NL )? mselem_pattern ( NL )? )* )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==L_begin||(LA41_0>=L_obj && LA41_0<=L_if)||(LA41_0>=L_while && LA41_0<=L_for)||(LA41_0>=L_match && LA41_0<=L_case)||LA41_0==L_val||LA41_0==L_exception||(LA41_0>=A_infinity && LA41_0<=U_infinity)||LA41_0==L_root||(LA41_0>=L_concurrent && LA41_0<=L_lazy)||(LA41_0>=L_true && LA41_0<=L_random)||LA41_0==MINUS||LA41_0==MODULE_KEY||LA41_0==A_NOT||LA41_0==U_NOT||(LA41_0>=A_ELLIPSIS && LA41_0<=U_ELLIPSIS)||LA41_0==TILDE||(LA41_0>=Constr && LA41_0<=Num)||(LA41_0>=String && LA41_0<=ROUND_BRACKET_OPEN)||LA41_0==SQUARE_BRACKET_OPEN||LA41_0==CURLY_BRACKET_OPEN||LA41_0==UNDERSCORE) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:395:14: mselem_pattern ( NL )? ( COMMA ( NL )? mselem_pattern ( NL )? )*
                            {
                            pushFollow(FOLLOW_mselem_pattern_in_primitive_pattern2004);
                            mselem_pattern80=mselem_pattern();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_mselem_pattern.add(mselem_pattern80.getTree());
                            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:395:29: ( NL )?
                            int alt37=2;
                            int LA37_0 = input.LA(1);

                            if ( (LA37_0==NL) ) {
                                alt37=1;
                            }
                            switch (alt37) {
                                case 1 :
                                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:395:29: NL
                                    {
                                    NL81=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2006); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL81);


                                    }
                                    break;

                            }

                            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:395:33: ( COMMA ( NL )? mselem_pattern ( NL )? )*
                            loop40:
                            do {
                                int alt40=2;
                                int LA40_0 = input.LA(1);

                                if ( (LA40_0==COMMA) ) {
                                    alt40=1;
                                }


                                switch (alt40) {
                            	case 1 :
                            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:395:35: COMMA ( NL )? mselem_pattern ( NL )?
                            	    {
                            	    COMMA82=(Token)match(input,COMMA,FOLLOW_COMMA_in_primitive_pattern2011); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA82);

                            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:395:42: ( NL )?
                            	    int alt38=2;
                            	    int LA38_0 = input.LA(1);

                            	    if ( (LA38_0==NL) ) {
                            	        alt38=1;
                            	    }
                            	    switch (alt38) {
                            	        case 1 :
                            	            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:395:42: NL
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
                            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:395:61: ( NL )?
                            	    int alt39=2;
                            	    int LA39_0 = input.LA(1);

                            	    if ( (LA39_0==NL) ) {
                            	        alt39=1;
                            	    }
                            	    switch (alt39) {
                            	        case 1 :
                            	            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:395:61: NL
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
                        // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:396:8: ^( MAP_OR_SET ( mselem_pattern )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MAP_OR_SET, "MAP_OR_SET"), root_1);

                        // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:396:21: ( mselem_pattern )*
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
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:397:4: '{' ( NL )? token_ARROW ( NL )? '}'
                    {
                    char_literal87=(Token)match(input,CURLY_BRACKET_OPEN,FOLLOW_CURLY_BRACKET_OPEN_in_primitive_pattern2045); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_OPEN.add(char_literal87);

                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:397:8: ( NL )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==NL) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:397:8: NL
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
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:397:24: ( NL )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==NL) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:397:24: NL
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
                        // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:397:35: ^( EMPTY_MAP )
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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:401:1: sep : ( NL | SC )+ ;
    public final babel17Parser.sep_return sep() throws RecognitionException {
        babel17Parser.sep_return retval = new babel17Parser.sep_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set92=null;

        CommonTree set92_tree=null;

        try {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:401:5: ( ( NL | SC )+ )
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:401:7: ( NL | SC )+
            {
            root_0 = (CommonTree)adaptor.nil();

            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:401:7: ( NL | SC )+
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
            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:
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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:403:1: block : ( ( sep )? statement ( sep statement )* ( sep )? -> ^( BLOCK ( statement )* ) | ( sep )? -> ^( BLOCK ) );
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


        RewriteRuleSubtreeStream stream_sep=new RewriteRuleSubtreeStream(adaptor,"rule sep");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:403:8: ( ( sep )? statement ( sep statement )* ( sep )? -> ^( BLOCK ( statement )* ) | ( sep )? -> ^( BLOCK ) )
            int alt50=2;
            alt50 = dfa50.predict(input);
            switch (alt50) {
                case 1 :
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:403:10: ( sep )? statement ( sep statement )* ( sep )?
                    {
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:403:10: ( sep )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==SC||LA46_0==NL) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:403:10: sep
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
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:403:25: ( sep statement )*
                    loop47:
                    do {
                        int alt47=2;
                        alt47 = dfa47.predict(input);
                        switch (alt47) {
                    	case 1 :
                    	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:403:26: sep statement
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

                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:403:42: ( sep )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==SC||LA48_0==NL) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:403:42: sep
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
                        // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:403:50: ^( BLOCK ( statement )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_1);

                        // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:403:58: ( statement )*
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
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:404:4: ( sep )?
                    {
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:404:4: ( sep )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==SC||LA49_0==NL) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:404:4: sep
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
                        // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:404:12: ^( BLOCK )
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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:406:1: pure_block : statement ( sep statement )* -> ^( BLOCK ( statement )* ) ;
    public final babel17Parser.pure_block_return pure_block() throws RecognitionException {
        babel17Parser.pure_block_return retval = new babel17Parser.pure_block_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.statement_return statement99 = null;

        babel17Parser.sep_return sep100 = null;

        babel17Parser.statement_return statement101 = null;


        RewriteRuleSubtreeStream stream_sep=new RewriteRuleSubtreeStream(adaptor,"rule sep");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:407:2: ( statement ( sep statement )* -> ^( BLOCK ( statement )* ) )
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:407:4: statement ( sep statement )*
            {
            pushFollow(FOLLOW_statement_in_pure_block2136);
            statement99=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statement.add(statement99.getTree());
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:407:14: ( sep statement )*
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
            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:407:15: sep statement
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
                // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:407:34: ^( BLOCK ( statement )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_1);

                // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:407:42: ( statement )*
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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:409:1: statement : ( st_val | st_def | st_memoize | st_module | st_package | st_yield | expr_or_assign );
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
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:410:2: ( st_val | st_def | st_memoize | st_module | st_package | st_yield | expr_or_assign )
            int alt52=7;
            alt52 = dfa52.predict(input);
            switch (alt52) {
                case 1 :
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:410:4: st_val
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
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:411:4: st_def
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
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:412:4: st_memoize
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
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:413:4: st_module
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
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:414:4: st_package
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
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:415:4: st_yield
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
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:416:4: expr_or_assign
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

    public static class st_val_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "st_val"
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:418:1: st_val : L_val ( NL )? pattern ( NL )? '=' ( NL )? expr -> ^( VAL pattern expr ) ;
    public final babel17Parser.st_val_return st_val() throws RecognitionException {
        babel17Parser.st_val_return retval = new babel17Parser.st_val_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_val109=null;
        Token NL110=null;
        Token NL112=null;
        Token char_literal113=null;
        Token NL114=null;
        babel17Parser.pattern_return pattern111 = null;

        babel17Parser.expr_return expr115 = null;


        CommonTree L_val109_tree=null;
        CommonTree NL110_tree=null;
        CommonTree NL112_tree=null;
        CommonTree char_literal113_tree=null;
        CommonTree NL114_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_val=new RewriteRuleTokenStream(adaptor,"token L_val");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        try {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:418:8: ( L_val ( NL )? pattern ( NL )? '=' ( NL )? expr -> ^( VAL pattern expr ) )
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:418:10: L_val ( NL )? pattern ( NL )? '=' ( NL )? expr
            {
            L_val109=(Token)match(input,L_val,FOLLOW_L_val_in_st_val2201); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_val.add(L_val109);

            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:418:16: ( NL )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==NL) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:418:16: NL
                    {
                    NL110=(Token)match(input,NL,FOLLOW_NL_in_st_val2203); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL110);


                    }
                    break;

            }

            pushFollow(FOLLOW_pattern_in_st_val2206);
            pattern111=pattern();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pattern.add(pattern111.getTree());
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:418:28: ( NL )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==NL) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:418:28: NL
                    {
                    NL112=(Token)match(input,NL,FOLLOW_NL_in_st_val2208); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL112);


                    }
                    break;

            }

            char_literal113=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_st_val2211); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal113);

            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:418:36: ( NL )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==NL) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:418:36: NL
                    {
                    NL114=(Token)match(input,NL,FOLLOW_NL_in_st_val2213); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL114);


                    }
                    break;

            }

            pushFollow(FOLLOW_expr_in_st_val2216);
            expr115=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr115.getTree());


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
            // 418:45: -> ^( VAL pattern expr )
            {
                // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:418:48: ^( VAL pattern expr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VAL, "VAL"), root_1);

                adaptor.addChild(root_1, stream_pattern.nextTree());
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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:419:1: st_def : ( attribute ( NL )? )? L_def ( NL )? Id ( NL )? ( primitive_pattern ( NL )? )? '=' ( NL )? expr -> ^( DEF ( attribute )? Id ( primitive_pattern )? expr ) ;
    public final babel17Parser.st_def_return st_def() throws RecognitionException {
        babel17Parser.st_def_return retval = new babel17Parser.st_def_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL117=null;
        Token L_def118=null;
        Token NL119=null;
        Token Id120=null;
        Token NL121=null;
        Token NL123=null;
        Token char_literal124=null;
        Token NL125=null;
        babel17Parser.attribute_return attribute116 = null;

        babel17Parser.primitive_pattern_return primitive_pattern122 = null;

        babel17Parser.expr_return expr126 = null;


        CommonTree NL117_tree=null;
        CommonTree L_def118_tree=null;
        CommonTree NL119_tree=null;
        CommonTree Id120_tree=null;
        CommonTree NL121_tree=null;
        CommonTree NL123_tree=null;
        CommonTree char_literal124_tree=null;
        CommonTree NL125_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_def=new RewriteRuleTokenStream(adaptor,"token L_def");
        RewriteRuleTokenStream stream_Id=new RewriteRuleTokenStream(adaptor,"token Id");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_primitive_pattern=new RewriteRuleSubtreeStream(adaptor,"rule primitive_pattern");
        RewriteRuleSubtreeStream stream_attribute=new RewriteRuleSubtreeStream(adaptor,"rule attribute");
        try {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:419:8: ( ( attribute ( NL )? )? L_def ( NL )? Id ( NL )? ( primitive_pattern ( NL )? )? '=' ( NL )? expr -> ^( DEF ( attribute )? Id ( primitive_pattern )? expr ) )
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:419:10: ( attribute ( NL )? )? L_def ( NL )? Id ( NL )? ( primitive_pattern ( NL )? )? '=' ( NL )? expr
            {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:419:10: ( attribute ( NL )? )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( ((LA57_0>=L_private && LA57_0<=L_public)) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:419:11: attribute ( NL )?
                    {
                    pushFollow(FOLLOW_attribute_in_st_def2234);
                    attribute116=attribute();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_attribute.add(attribute116.getTree());
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:419:21: ( NL )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==NL) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:419:21: NL
                            {
                            NL117=(Token)match(input,NL,FOLLOW_NL_in_st_def2236); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL117);


                            }
                            break;

                    }


                    }
                    break;

            }

            L_def118=(Token)match(input,L_def,FOLLOW_L_def_in_st_def2241); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_def.add(L_def118);

            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:419:33: ( NL )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==NL) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:419:33: NL
                    {
                    NL119=(Token)match(input,NL,FOLLOW_NL_in_st_def2243); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL119);


                    }
                    break;

            }

            Id120=(Token)match(input,Id,FOLLOW_Id_in_st_def2246); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Id.add(Id120);

            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:419:40: ( NL )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==NL) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:419:40: NL
                    {
                    NL121=(Token)match(input,NL,FOLLOW_NL_in_st_def2248); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL121);


                    }
                    break;

            }

            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:419:44: ( primitive_pattern ( NL )? )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( ((LA61_0>=A_infinity && LA61_0<=U_infinity)||(LA61_0>=L_true && LA61_0<=L_false)||LA61_0==MINUS||(LA61_0>=Id && LA61_0<=Num)||(LA61_0>=String && LA61_0<=ROUND_BRACKET_OPEN)||LA61_0==SQUARE_BRACKET_OPEN||LA61_0==CURLY_BRACKET_OPEN||LA61_0==UNDERSCORE) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:419:45: primitive_pattern ( NL )?
                    {
                    pushFollow(FOLLOW_primitive_pattern_in_st_def2252);
                    primitive_pattern122=primitive_pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primitive_pattern.add(primitive_pattern122.getTree());
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:419:63: ( NL )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==NL) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:419:63: NL
                            {
                            NL123=(Token)match(input,NL,FOLLOW_NL_in_st_def2254); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL123);


                            }
                            break;

                    }


                    }
                    break;

            }

            char_literal124=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_st_def2259); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal124);

            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:419:73: ( NL )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==NL) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:419:73: NL
                    {
                    NL125=(Token)match(input,NL,FOLLOW_NL_in_st_def2261); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL125);


                    }
                    break;

            }

            pushFollow(FOLLOW_expr_in_st_def2264);
            expr126=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr126.getTree());


            // AST REWRITE
            // elements: expr, attribute, Id, primitive_pattern
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 420:5: -> ^( DEF ( attribute )? Id ( primitive_pattern )? expr )
            {
                // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:420:8: ^( DEF ( attribute )? Id ( primitive_pattern )? expr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DEF, "DEF"), root_1);

                // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:420:14: ( attribute )?
                if ( stream_attribute.hasNext() ) {
                    adaptor.addChild(root_1, stream_attribute.nextTree());

                }
                stream_attribute.reset();
                adaptor.addChild(root_1, stream_Id.nextNode());
                // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:420:28: ( primitive_pattern )?
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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:422:1: st_yield : L_yield expr -> ^( YIELD expr ) ;
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
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:422:9: ( L_yield expr -> ^( YIELD expr ) )
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:422:11: L_yield expr
            {
            L_yield127=(Token)match(input,L_yield,FOLLOW_L_yield_in_st_yield2296); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_yield.add(L_yield127);

            pushFollow(FOLLOW_expr_in_st_yield2298);
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
            // 422:24: -> ^( YIELD expr )
            {
                // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:422:27: ^( YIELD expr )
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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:424:1: attribute : ( L_private -> ^( ATTRIBUTE L_private ) | L_public -> ^( ATTRIBUTE L_public ) | L_protected -> ^( ATTRIBUTE L_protected ) );
    public final babel17Parser.attribute_return attribute() throws RecognitionException {
        babel17Parser.attribute_return retval = new babel17Parser.attribute_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_private129=null;
        Token L_public130=null;
        Token L_protected131=null;

        CommonTree L_private129_tree=null;
        CommonTree L_public130_tree=null;
        CommonTree L_protected131_tree=null;
        RewriteRuleTokenStream stream_L_protected=new RewriteRuleTokenStream(adaptor,"token L_protected");
        RewriteRuleTokenStream stream_L_public=new RewriteRuleTokenStream(adaptor,"token L_public");
        RewriteRuleTokenStream stream_L_private=new RewriteRuleTokenStream(adaptor,"token L_private");

        try {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:425:2: ( L_private -> ^( ATTRIBUTE L_private ) | L_public -> ^( ATTRIBUTE L_public ) | L_protected -> ^( ATTRIBUTE L_protected ) )
            int alt63=3;
            switch ( input.LA(1) ) {
            case L_private:
                {
                alt63=1;
                }
                break;
            case L_public:
                {
                alt63=2;
                }
                break;
            case L_protected:
                {
                alt63=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }

            switch (alt63) {
                case 1 :
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:425:4: L_private
                    {
                    L_private129=(Token)match(input,L_private,FOLLOW_L_private_in_attribute2319); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_private.add(L_private129);



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
                    // 425:14: -> ^( ATTRIBUTE L_private )
                    {
                        // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:425:17: ^( ATTRIBUTE L_private )
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
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:426:4: L_public
                    {
                    L_public130=(Token)match(input,L_public,FOLLOW_L_public_in_attribute2332); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_public.add(L_public130);



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
                    // 426:13: -> ^( ATTRIBUTE L_public )
                    {
                        // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:426:16: ^( ATTRIBUTE L_public )
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
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:427:4: L_protected
                    {
                    L_protected131=(Token)match(input,L_protected,FOLLOW_L_protected_in_attribute2345); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_protected.add(L_protected131);



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
                    // 427:16: -> ^( ATTRIBUTE L_protected )
                    {
                        // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:427:19: ^( ATTRIBUTE L_protected )
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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:429:1: st_module : ( st_module_decl | st_module_def );
    public final babel17Parser.st_module_return st_module() throws RecognitionException {
        babel17Parser.st_module_return retval = new babel17Parser.st_module_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.st_module_decl_return st_module_decl132 = null;

        babel17Parser.st_module_def_return st_module_def133 = null;



        try {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:430:2: ( st_module_decl | st_module_def )
            int alt64=2;
            switch ( input.LA(1) ) {
            case L_private:
                {
                switch ( input.LA(2) ) {
                case NL:
                    {
                    int LA64_6 = input.LA(3);

                    if ( (LA64_6==L_external) ) {
                        alt64=1;
                    }
                    else if ( (LA64_6==L_module) ) {
                        alt64=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 64, 6, input);

                        throw nvae;
                    }
                    }
                    break;
                case L_external:
                    {
                    alt64=1;
                    }
                    break;
                case L_module:
                    {
                    alt64=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 64, 1, input);

                    throw nvae;
                }

                }
                break;
            case L_public:
                {
                switch ( input.LA(2) ) {
                case NL:
                    {
                    int LA64_6 = input.LA(3);

                    if ( (LA64_6==L_external) ) {
                        alt64=1;
                    }
                    else if ( (LA64_6==L_module) ) {
                        alt64=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 64, 6, input);

                        throw nvae;
                    }
                    }
                    break;
                case L_module:
                    {
                    alt64=2;
                    }
                    break;
                case L_external:
                    {
                    alt64=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 64, 2, input);

                    throw nvae;
                }

                }
                break;
            case L_protected:
                {
                switch ( input.LA(2) ) {
                case NL:
                    {
                    int LA64_6 = input.LA(3);

                    if ( (LA64_6==L_external) ) {
                        alt64=1;
                    }
                    else if ( (LA64_6==L_module) ) {
                        alt64=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 64, 6, input);

                        throw nvae;
                    }
                    }
                    break;
                case L_module:
                    {
                    alt64=2;
                    }
                    break;
                case L_external:
                    {
                    alt64=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 64, 3, input);

                    throw nvae;
                }

                }
                break;
            case L_external:
                {
                alt64=1;
                }
                break;
            case L_module:
                {
                alt64=2;
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
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:430:4: st_module_decl
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_st_module_decl_in_st_module2363);
                    st_module_decl132=st_module_decl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, st_module_decl132.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:431:4: st_module_def
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_st_module_def_in_st_module2368);
                    st_module_def133=st_module_def();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, st_module_def133.getTree());

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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:433:1: st_module_decl : ( attribute ( NL )? )? L_external ( NL )? L_module ( NL )? module_path -> ^( MODULE_DECL ( attribute )? module_path ) ;
    public final babel17Parser.st_module_decl_return st_module_decl() throws RecognitionException {
        babel17Parser.st_module_decl_return retval = new babel17Parser.st_module_decl_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL135=null;
        Token L_external136=null;
        Token NL137=null;
        Token L_module138=null;
        Token NL139=null;
        babel17Parser.attribute_return attribute134 = null;

        babel17Parser.module_path_return module_path140 = null;


        CommonTree NL135_tree=null;
        CommonTree L_external136_tree=null;
        CommonTree NL137_tree=null;
        CommonTree L_module138_tree=null;
        CommonTree NL139_tree=null;
        RewriteRuleTokenStream stream_L_module=new RewriteRuleTokenStream(adaptor,"token L_module");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_external=new RewriteRuleTokenStream(adaptor,"token L_external");
        RewriteRuleSubtreeStream stream_module_path=new RewriteRuleSubtreeStream(adaptor,"rule module_path");
        RewriteRuleSubtreeStream stream_attribute=new RewriteRuleSubtreeStream(adaptor,"rule attribute");
        try {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:434:2: ( ( attribute ( NL )? )? L_external ( NL )? L_module ( NL )? module_path -> ^( MODULE_DECL ( attribute )? module_path ) )
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:434:4: ( attribute ( NL )? )? L_external ( NL )? L_module ( NL )? module_path
            {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:434:4: ( attribute ( NL )? )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( ((LA66_0>=L_private && LA66_0<=L_public)) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:434:5: attribute ( NL )?
                    {
                    pushFollow(FOLLOW_attribute_in_st_module_decl2379);
                    attribute134=attribute();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_attribute.add(attribute134.getTree());
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:434:15: ( NL )?
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==NL) ) {
                        alt65=1;
                    }
                    switch (alt65) {
                        case 1 :
                            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:434:15: NL
                            {
                            NL135=(Token)match(input,NL,FOLLOW_NL_in_st_module_decl2381); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL135);


                            }
                            break;

                    }


                    }
                    break;

            }

            L_external136=(Token)match(input,L_external,FOLLOW_L_external_in_st_module_decl2386); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_external.add(L_external136);

            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:434:32: ( NL )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==NL) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:434:32: NL
                    {
                    NL137=(Token)match(input,NL,FOLLOW_NL_in_st_module_decl2388); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL137);


                    }
                    break;

            }

            L_module138=(Token)match(input,L_module,FOLLOW_L_module_in_st_module_decl2391); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_module.add(L_module138);

            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:434:45: ( NL )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==NL) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:434:45: NL
                    {
                    NL139=(Token)match(input,NL,FOLLOW_NL_in_st_module_decl2393); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL139);


                    }
                    break;

            }

            pushFollow(FOLLOW_module_path_in_st_module_decl2396);
            module_path140=module_path();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_module_path.add(module_path140.getTree());


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
            // 435:5: -> ^( MODULE_DECL ( attribute )? module_path )
            {
                // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:435:8: ^( MODULE_DECL ( attribute )? module_path )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MODULE_DECL, "MODULE_DECL"), root_1);

                // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:435:22: ( attribute )?
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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:437:1: st_module_def : ( attribute ( NL )? )? L_module ( NL )? module_path block L_end -> ^( MODULE_DEF ( attribute )? module_path block ) ;
    public final babel17Parser.st_module_def_return st_module_def() throws RecognitionException {
        babel17Parser.st_module_def_return retval = new babel17Parser.st_module_def_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL142=null;
        Token L_module143=null;
        Token NL144=null;
        Token L_end147=null;
        babel17Parser.attribute_return attribute141 = null;

        babel17Parser.module_path_return module_path145 = null;

        babel17Parser.block_return block146 = null;


        CommonTree NL142_tree=null;
        CommonTree L_module143_tree=null;
        CommonTree NL144_tree=null;
        CommonTree L_end147_tree=null;
        RewriteRuleTokenStream stream_L_module=new RewriteRuleTokenStream(adaptor,"token L_module");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleSubtreeStream stream_module_path=new RewriteRuleSubtreeStream(adaptor,"rule module_path");
        RewriteRuleSubtreeStream stream_attribute=new RewriteRuleSubtreeStream(adaptor,"rule attribute");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:438:2: ( ( attribute ( NL )? )? L_module ( NL )? module_path block L_end -> ^( MODULE_DEF ( attribute )? module_path block ) )
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:438:4: ( attribute ( NL )? )? L_module ( NL )? module_path block L_end
            {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:438:4: ( attribute ( NL )? )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( ((LA70_0>=L_private && LA70_0<=L_public)) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:438:5: attribute ( NL )?
                    {
                    pushFollow(FOLLOW_attribute_in_st_module_def2426);
                    attribute141=attribute();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_attribute.add(attribute141.getTree());
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:438:15: ( NL )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==NL) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:438:15: NL
                            {
                            NL142=(Token)match(input,NL,FOLLOW_NL_in_st_module_def2428); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL142);


                            }
                            break;

                    }


                    }
                    break;

            }

            L_module143=(Token)match(input,L_module,FOLLOW_L_module_in_st_module_def2433); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_module.add(L_module143);

            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:438:30: ( NL )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==NL) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:438:30: NL
                    {
                    NL144=(Token)match(input,NL,FOLLOW_NL_in_st_module_def2435); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL144);


                    }
                    break;

            }

            pushFollow(FOLLOW_module_path_in_st_module_def2438);
            module_path145=module_path();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_module_path.add(module_path145.getTree());
            pushFollow(FOLLOW_block_in_st_module_def2440);
            block146=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block146.getTree());
            L_end147=(Token)match(input,L_end,FOLLOW_L_end_in_st_module_def2442); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_end.add(L_end147);



            // AST REWRITE
            // elements: module_path, attribute, block
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 439:5: -> ^( MODULE_DEF ( attribute )? module_path block )
            {
                // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:439:8: ^( MODULE_DEF ( attribute )? module_path block )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MODULE_DEF, "MODULE_DEF"), root_1);

                // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:439:21: ( attribute )?
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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:441:1: st_package : L_package ( NL )? module_path block L_end -> ^( PACKAGE module_path block ) ;
    public final babel17Parser.st_package_return st_package() throws RecognitionException {
        babel17Parser.st_package_return retval = new babel17Parser.st_package_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_package148=null;
        Token NL149=null;
        Token L_end152=null;
        babel17Parser.module_path_return module_path150 = null;

        babel17Parser.block_return block151 = null;


        CommonTree L_package148_tree=null;
        CommonTree NL149_tree=null;
        CommonTree L_end152_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_package=new RewriteRuleTokenStream(adaptor,"token L_package");
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleSubtreeStream stream_module_path=new RewriteRuleSubtreeStream(adaptor,"rule module_path");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:442:2: ( L_package ( NL )? module_path block L_end -> ^( PACKAGE module_path block ) )
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:442:10: L_package ( NL )? module_path block L_end
            {
            L_package148=(Token)match(input,L_package,FOLLOW_L_package_in_st_package2478); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_package.add(L_package148);

            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:442:20: ( NL )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==NL) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:442:20: NL
                    {
                    NL149=(Token)match(input,NL,FOLLOW_NL_in_st_package2480); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL149);


                    }
                    break;

            }

            pushFollow(FOLLOW_module_path_in_st_package2483);
            module_path150=module_path();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_module_path.add(module_path150.getTree());
            pushFollow(FOLLOW_block_in_st_package2485);
            block151=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block151.getTree());
            L_end152=(Token)match(input,L_end,FOLLOW_L_end_in_st_package2487); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_end.add(L_end152);



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
            // 443:5: -> ^( PACKAGE module_path block )
            {
                // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:443:8: ^( PACKAGE module_path block )
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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:445:1: module_path : Id ( ( NL )? PERIOD ( NL )? Id )* -> ^( MODULE_PATH ( Id )* ) ;
    public final babel17Parser.module_path_return module_path() throws RecognitionException {
        babel17Parser.module_path_return retval = new babel17Parser.module_path_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Id153=null;
        Token NL154=null;
        Token PERIOD155=null;
        Token NL156=null;
        Token Id157=null;

        CommonTree Id153_tree=null;
        CommonTree NL154_tree=null;
        CommonTree PERIOD155_tree=null;
        CommonTree NL156_tree=null;
        CommonTree Id157_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_Id=new RewriteRuleTokenStream(adaptor,"token Id");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");

        try {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:446:2: ( Id ( ( NL )? PERIOD ( NL )? Id )* -> ^( MODULE_PATH ( Id )* ) )
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:446:4: Id ( ( NL )? PERIOD ( NL )? Id )*
            {
            Id153=(Token)match(input,Id,FOLLOW_Id_in_module_path2517); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Id.add(Id153);

            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:446:7: ( ( NL )? PERIOD ( NL )? Id )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==NL) ) {
                    int LA75_1 = input.LA(2);

                    if ( (LA75_1==PERIOD) ) {
                        alt75=1;
                    }


                }
                else if ( (LA75_0==PERIOD) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:446:8: ( NL )? PERIOD ( NL )? Id
            	    {
            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:446:8: ( NL )?
            	    int alt73=2;
            	    int LA73_0 = input.LA(1);

            	    if ( (LA73_0==NL) ) {
            	        alt73=1;
            	    }
            	    switch (alt73) {
            	        case 1 :
            	            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:446:8: NL
            	            {
            	            NL154=(Token)match(input,NL,FOLLOW_NL_in_module_path2520); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL154);


            	            }
            	            break;

            	    }

            	    PERIOD155=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_module_path2523); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD155);

            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:446:19: ( NL )?
            	    int alt74=2;
            	    int LA74_0 = input.LA(1);

            	    if ( (LA74_0==NL) ) {
            	        alt74=1;
            	    }
            	    switch (alt74) {
            	        case 1 :
            	            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:446:19: NL
            	            {
            	            NL156=(Token)match(input,NL,FOLLOW_NL_in_module_path2525); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL156);


            	            }
            	            break;

            	    }

            	    Id157=(Token)match(input,Id,FOLLOW_Id_in_module_path2528); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_Id.add(Id157);


            	    }
            	    break;

            	default :
            	    break loop75;
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
            // 446:28: -> ^( MODULE_PATH ( Id )* )
            {
                // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:446:31: ^( MODULE_PATH ( Id )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MODULE_PATH, "MODULE_PATH"), root_1);

                // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:446:45: ( Id )*
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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:448:1: st_memoize : L_memoize ( memid )+ -> ^( MEMOIZE ( memid )* ) ;
    public final babel17Parser.st_memoize_return st_memoize() throws RecognitionException {
        babel17Parser.st_memoize_return retval = new babel17Parser.st_memoize_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_memoize158=null;
        babel17Parser.memid_return memid159 = null;


        CommonTree L_memoize158_tree=null;
        RewriteRuleTokenStream stream_L_memoize=new RewriteRuleTokenStream(adaptor,"token L_memoize");
        RewriteRuleSubtreeStream stream_memid=new RewriteRuleSubtreeStream(adaptor,"rule memid");
        try {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:449:2: ( L_memoize ( memid )+ -> ^( MEMOIZE ( memid )* ) )
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:449:4: L_memoize ( memid )+
            {
            L_memoize158=(Token)match(input,L_memoize,FOLLOW_L_memoize_in_st_memoize2549); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_memoize.add(L_memoize158);

            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:449:14: ( memid )+
            int cnt76=0;
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==Id||LA76_0==ROUND_BRACKET_OPEN) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:449:14: memid
            	    {
            	    pushFollow(FOLLOW_memid_in_st_memoize2551);
            	    memid159=memid();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_memid.add(memid159.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt76 >= 1 ) break loop76;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(76, input);
                        throw eee;
                }
                cnt76++;
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
            // 450:5: -> ^( MEMOIZE ( memid )* )
            {
                // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:450:8: ^( MEMOIZE ( memid )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MEMOIZE, "MEMOIZE"), root_1);

                // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:450:18: ( memid )*
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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:452:1: memid : ( Id -> ^( MEM_STRONG Id ) | '(' Id ')' -> ^( MEM_WEAK Id ) );
    public final babel17Parser.memid_return memid() throws RecognitionException {
        babel17Parser.memid_return retval = new babel17Parser.memid_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Id160=null;
        Token char_literal161=null;
        Token Id162=null;
        Token char_literal163=null;

        CommonTree Id160_tree=null;
        CommonTree char_literal161_tree=null;
        CommonTree Id162_tree=null;
        CommonTree char_literal163_tree=null;
        RewriteRuleTokenStream stream_ROUND_BRACKET_CLOSE=new RewriteRuleTokenStream(adaptor,"token ROUND_BRACKET_CLOSE");
        RewriteRuleTokenStream stream_ROUND_BRACKET_OPEN=new RewriteRuleTokenStream(adaptor,"token ROUND_BRACKET_OPEN");
        RewriteRuleTokenStream stream_Id=new RewriteRuleTokenStream(adaptor,"token Id");

        try {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:452:7: ( Id -> ^( MEM_STRONG Id ) | '(' Id ')' -> ^( MEM_WEAK Id ) )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==Id) ) {
                alt77=1;
            }
            else if ( (LA77_0==ROUND_BRACKET_OPEN) ) {
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
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:452:9: Id
                    {
                    Id160=(Token)match(input,Id,FOLLOW_Id_in_memid2575); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Id.add(Id160);



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
                    // 452:12: -> ^( MEM_STRONG Id )
                    {
                        // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:452:15: ^( MEM_STRONG Id )
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
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:453:4: '(' Id ')'
                    {
                    char_literal161=(Token)match(input,ROUND_BRACKET_OPEN,FOLLOW_ROUND_BRACKET_OPEN_in_memid2588); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ROUND_BRACKET_OPEN.add(char_literal161);

                    Id162=(Token)match(input,Id,FOLLOW_Id_in_memid2590); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Id.add(Id162);

                    char_literal163=(Token)match(input,ROUND_BRACKET_CLOSE,FOLLOW_ROUND_BRACKET_CLOSE_in_memid2592); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ROUND_BRACKET_CLOSE.add(char_literal163);



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
                    // 453:15: -> ^( MEM_WEAK Id )
                    {
                        // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:453:18: ^( MEM_WEAK Id )
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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:456:1: expr_or_assign : ( ( pattern ( NL )? '=' )=> pattern ( NL )? '=' ( NL )? expr -> ^( ASSIGN pattern expr ) | expr );
    public final babel17Parser.expr_or_assign_return expr_or_assign() throws RecognitionException {
        babel17Parser.expr_or_assign_return retval = new babel17Parser.expr_or_assign_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL165=null;
        Token char_literal166=null;
        Token NL167=null;
        babel17Parser.pattern_return pattern164 = null;

        babel17Parser.expr_return expr168 = null;

        babel17Parser.expr_return expr169 = null;


        CommonTree NL165_tree=null;
        CommonTree char_literal166_tree=null;
        CommonTree NL167_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        try {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:457:2: ( ( pattern ( NL )? '=' )=> pattern ( NL )? '=' ( NL )? expr -> ^( ASSIGN pattern expr ) | expr )
            int alt80=2;
            alt80 = dfa80.predict(input);
            switch (alt80) {
                case 1 :
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:457:4: ( pattern ( NL )? '=' )=> pattern ( NL )? '=' ( NL )? expr
                    {
                    pushFollow(FOLLOW_pattern_in_expr_or_assign2625);
                    pattern164=pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pattern.add(pattern164.getTree());
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:457:33: ( NL )?
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==NL) ) {
                        alt78=1;
                    }
                    switch (alt78) {
                        case 1 :
                            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:457:33: NL
                            {
                            NL165=(Token)match(input,NL,FOLLOW_NL_in_expr_or_assign2627); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL165);


                            }
                            break;

                    }

                    char_literal166=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_expr_or_assign2630); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal166);

                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:457:41: ( NL )?
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==NL) ) {
                        alt79=1;
                    }
                    switch (alt79) {
                        case 1 :
                            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:457:41: NL
                            {
                            NL167=(Token)match(input,NL,FOLLOW_NL_in_expr_or_assign2632); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL167);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_expr_in_expr_or_assign2635);
                    expr168=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr168.getTree());


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
                    // 457:50: -> ^( ASSIGN pattern expr )
                    {
                        // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:457:53: ^( ASSIGN pattern expr )
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
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:458:4: expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_expr_in_expr_or_assign2650);
                    expr169=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr169.getTree());

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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:460:1: expr : ( lop_expr | obj_expr );
    public final babel17Parser.expr_return expr() throws RecognitionException {
        babel17Parser.expr_return retval = new babel17Parser.expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.lop_expr_return lop_expr170 = null;

        babel17Parser.obj_expr_return obj_expr171 = null;



        try {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:461:2: ( lop_expr | obj_expr )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==L_begin||(LA81_0>=L_with && LA81_0<=L_if)||(LA81_0>=L_while && LA81_0<=L_for)||LA81_0==L_match||LA81_0==L_exception||(LA81_0>=A_infinity && LA81_0<=U_infinity)||LA81_0==L_root||(LA81_0>=L_concurrent && LA81_0<=L_lazy)||(LA81_0>=L_true && LA81_0<=L_random)||LA81_0==MINUS||LA81_0==MODULE_KEY||LA81_0==A_NOT||LA81_0==U_NOT||LA81_0==TILDE||(LA81_0>=Constr && LA81_0<=Num)||(LA81_0>=String && LA81_0<=ROUND_BRACKET_OPEN)||LA81_0==SQUARE_BRACKET_OPEN||LA81_0==CURLY_BRACKET_OPEN||LA81_0==UNDERSCORE) ) {
                alt81=1;
            }
            else if ( (LA81_0==L_obj) ) {
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
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:461:4: lop_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_lop_expr_in_expr2661);
                    lop_expr170=lop_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lop_expr170.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:462:4: obj_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_obj_expr_in_expr2666);
                    obj_expr171=obj_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, obj_expr171.getTree());

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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:464:1: control_expr : ( if_expr | while_do_expr | match_expr | for_expr | begin_end );
    public final babel17Parser.control_expr_return control_expr() throws RecognitionException {
        babel17Parser.control_expr_return retval = new babel17Parser.control_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.if_expr_return if_expr172 = null;

        babel17Parser.while_do_expr_return while_do_expr173 = null;

        babel17Parser.match_expr_return match_expr174 = null;

        babel17Parser.for_expr_return for_expr175 = null;

        babel17Parser.begin_end_return begin_end176 = null;



        try {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:465:2: ( if_expr | while_do_expr | match_expr | for_expr | begin_end )
            int alt82=5;
            switch ( input.LA(1) ) {
            case L_if:
                {
                alt82=1;
                }
                break;
            case L_while:
                {
                alt82=2;
                }
                break;
            case L_match:
                {
                alt82=3;
                }
                break;
            case L_for:
                {
                alt82=4;
                }
                break;
            case L_begin:
                {
                alt82=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }

            switch (alt82) {
                case 1 :
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:465:4: if_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_if_expr_in_control_expr2676);
                    if_expr172=if_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, if_expr172.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:466:4: while_do_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_while_do_expr_in_control_expr2681);
                    while_do_expr173=while_do_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, while_do_expr173.getTree());

                    }
                    break;
                case 3 :
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:467:4: match_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_match_expr_in_control_expr2686);
                    match_expr174=match_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, match_expr174.getTree());

                    }
                    break;
                case 4 :
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:468:4: for_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_for_expr_in_control_expr2691);
                    for_expr175=for_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, for_expr175.getTree());

                    }
                    break;
                case 5 :
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:469:4: begin_end
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_begin_end_in_control_expr2696);
                    begin_end176=begin_end();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, begin_end176.getTree());

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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:471:1: with_control_expr : ( control_expr | L_with ( NL )? protected_expr ( NL )? COLON ( NL )? control_expr -> ^( WITH protected_expr control_expr ) );
    public final babel17Parser.with_control_expr_return with_control_expr() throws RecognitionException {
        babel17Parser.with_control_expr_return retval = new babel17Parser.with_control_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_with178=null;
        Token NL179=null;
        Token NL181=null;
        Token COLON182=null;
        Token NL183=null;
        babel17Parser.control_expr_return control_expr177 = null;

        babel17Parser.protected_expr_return protected_expr180 = null;

        babel17Parser.control_expr_return control_expr184 = null;


        CommonTree L_with178_tree=null;
        CommonTree NL179_tree=null;
        CommonTree NL181_tree=null;
        CommonTree COLON182_tree=null;
        CommonTree NL183_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_L_with=new RewriteRuleTokenStream(adaptor,"token L_with");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_protected_expr=new RewriteRuleSubtreeStream(adaptor,"rule protected_expr");
        RewriteRuleSubtreeStream stream_control_expr=new RewriteRuleSubtreeStream(adaptor,"rule control_expr");
        try {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:472:2: ( control_expr | L_with ( NL )? protected_expr ( NL )? COLON ( NL )? control_expr -> ^( WITH protected_expr control_expr ) )
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==L_begin||LA86_0==L_if||(LA86_0>=L_while && LA86_0<=L_for)||LA86_0==L_match) ) {
                alt86=1;
            }
            else if ( (LA86_0==L_with) ) {
                alt86=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }
            switch (alt86) {
                case 1 :
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:472:4: control_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_control_expr_in_with_control_expr2706);
                    control_expr177=control_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, control_expr177.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:473:4: L_with ( NL )? protected_expr ( NL )? COLON ( NL )? control_expr
                    {
                    L_with178=(Token)match(input,L_with,FOLLOW_L_with_in_with_control_expr2711); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_with.add(L_with178);

                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:473:11: ( NL )?
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==NL) ) {
                        alt83=1;
                    }
                    switch (alt83) {
                        case 1 :
                            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:473:11: NL
                            {
                            NL179=(Token)match(input,NL,FOLLOW_NL_in_with_control_expr2713); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL179);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_protected_expr_in_with_control_expr2716);
                    protected_expr180=protected_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr180.getTree());
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:473:30: ( NL )?
                    int alt84=2;
                    int LA84_0 = input.LA(1);

                    if ( (LA84_0==NL) ) {
                        alt84=1;
                    }
                    switch (alt84) {
                        case 1 :
                            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:473:30: NL
                            {
                            NL181=(Token)match(input,NL,FOLLOW_NL_in_with_control_expr2718); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL181);


                            }
                            break;

                    }

                    COLON182=(Token)match(input,COLON,FOLLOW_COLON_in_with_control_expr2721); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON182);

                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:473:40: ( NL )?
                    int alt85=2;
                    int LA85_0 = input.LA(1);

                    if ( (LA85_0==NL) ) {
                        alt85=1;
                    }
                    switch (alt85) {
                        case 1 :
                            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:473:40: NL
                            {
                            NL183=(Token)match(input,NL,FOLLOW_NL_in_with_control_expr2723); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL183);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_control_expr_in_with_control_expr2726);
                    control_expr184=control_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_control_expr.add(control_expr184.getTree());


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
                    // 473:57: -> ^( WITH protected_expr control_expr )
                    {
                        // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:473:60: ^( WITH protected_expr control_expr )
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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:476:1: protected_expr : ( p_lop_expr | obj_expr );
    public final babel17Parser.protected_expr_return protected_expr() throws RecognitionException {
        babel17Parser.protected_expr_return retval = new babel17Parser.protected_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.p_lop_expr_return p_lop_expr185 = null;

        babel17Parser.obj_expr_return obj_expr186 = null;



        try {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:477:2: ( p_lop_expr | obj_expr )
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==L_begin||(LA87_0>=L_with && LA87_0<=L_if)||(LA87_0>=L_while && LA87_0<=L_for)||(LA87_0>=L_match && LA87_0<=L_case)||LA87_0==L_exception||(LA87_0>=A_infinity && LA87_0<=U_infinity)||LA87_0==L_root||(LA87_0>=L_concurrent && LA87_0<=L_lazy)||(LA87_0>=L_true && LA87_0<=L_random)||LA87_0==MINUS||LA87_0==MODULE_KEY||LA87_0==A_NOT||LA87_0==U_NOT||LA87_0==TILDE||(LA87_0>=Constr && LA87_0<=Num)||(LA87_0>=String && LA87_0<=ROUND_BRACKET_OPEN)||LA87_0==SQUARE_BRACKET_OPEN||LA87_0==CURLY_BRACKET_OPEN||LA87_0==UNDERSCORE) ) {
                alt87=1;
            }
            else if ( (LA87_0==L_obj) ) {
                alt87=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }
            switch (alt87) {
                case 1 :
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:477:4: p_lop_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_p_lop_expr_in_protected_expr2747);
                    p_lop_expr185=p_lop_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_lop_expr185.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:478:4: obj_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_obj_expr_in_protected_expr2752);
                    obj_expr186=obj_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, obj_expr186.getTree());

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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:481:1: begin_end : L_begin block L_end -> ^( BEGIN block ) ;
    public final babel17Parser.begin_end_return begin_end() throws RecognitionException {
        babel17Parser.begin_end_return retval = new babel17Parser.begin_end_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_begin187=null;
        Token L_end189=null;
        babel17Parser.block_return block188 = null;


        CommonTree L_begin187_tree=null;
        CommonTree L_end189_tree=null;
        RewriteRuleTokenStream stream_L_begin=new RewriteRuleTokenStream(adaptor,"token L_begin");
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:482:2: ( L_begin block L_end -> ^( BEGIN block ) )
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:482:4: L_begin block L_end
            {
            L_begin187=(Token)match(input,L_begin,FOLLOW_L_begin_in_begin_end2764); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_begin.add(L_begin187);

            pushFollow(FOLLOW_block_in_begin_end2766);
            block188=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block188.getTree());
            L_end189=(Token)match(input,L_end,FOLLOW_L_end_in_begin_end2768); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_end.add(L_end189);



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
            // 482:24: -> ^( BEGIN block )
            {
                // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:482:27: ^( BEGIN block )
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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:484:1: obj_expr : L_obj block L_end -> ^( OBJ block ) ;
    public final babel17Parser.obj_expr_return obj_expr() throws RecognitionException {
        babel17Parser.obj_expr_return retval = new babel17Parser.obj_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_obj190=null;
        Token L_end192=null;
        babel17Parser.block_return block191 = null;


        CommonTree L_obj190_tree=null;
        CommonTree L_end192_tree=null;
        RewriteRuleTokenStream stream_L_obj=new RewriteRuleTokenStream(adaptor,"token L_obj");
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:484:9: ( L_obj block L_end -> ^( OBJ block ) )
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:484:11: L_obj block L_end
            {
            L_obj190=(Token)match(input,L_obj,FOLLOW_L_obj_in_obj_expr2784); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_obj.add(L_obj190);

            pushFollow(FOLLOW_block_in_obj_expr2786);
            block191=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block191.getTree());
            L_end192=(Token)match(input,L_end,FOLLOW_L_end_in_obj_expr2788); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_end.add(L_end192);



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
            // 485:3: -> ^( OBJ block )
            {
                // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:485:6: ^( OBJ block )
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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:487:1: lop_expr : ( ( lambda_expr )=> lambda_expr | op_expr );
    public final babel17Parser.lop_expr_return lop_expr() throws RecognitionException {
        babel17Parser.lop_expr_return retval = new babel17Parser.lop_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.lambda_expr_return lambda_expr193 = null;

        babel17Parser.op_expr_return op_expr194 = null;



        try {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:488:2: ( ( lambda_expr )=> lambda_expr | op_expr )
            int alt88=2;
            alt88 = dfa88.predict(input);
            switch (alt88) {
                case 1 :
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:488:4: ( lambda_expr )=> lambda_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_lambda_expr_in_lop_expr2819);
                    lambda_expr193=lambda_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lambda_expr193.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:489:4: op_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_op_expr_in_lop_expr2824);
                    op_expr194=op_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, op_expr194.getTree());

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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:491:1: p_lop_expr : ( ( protected_lambda_expr )=> protected_lambda_expr | p_op_expr );
    public final babel17Parser.p_lop_expr_return p_lop_expr() throws RecognitionException {
        babel17Parser.p_lop_expr_return retval = new babel17Parser.p_lop_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.protected_lambda_expr_return protected_lambda_expr195 = null;

        babel17Parser.p_op_expr_return p_op_expr196 = null;



        try {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:492:2: ( ( protected_lambda_expr )=> protected_lambda_expr | p_op_expr )
            int alt89=2;
            alt89 = dfa89.predict(input);
            switch (alt89) {
                case 1 :
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:492:4: ( protected_lambda_expr )=> protected_lambda_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_protected_lambda_expr_in_p_lop_expr2840);
                    protected_lambda_expr195=protected_lambda_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, protected_lambda_expr195.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:493:4: p_op_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_p_op_expr_in_p_lop_expr2845);
                    p_op_expr196=p_op_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_op_expr196.getTree());

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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:495:1: if_expr : L_if ( NL )? protected_expr ( NL )? L_then block ( L_elseif ( NL )? protected_expr ( NL )? L_then block )* ( L_else block )? L_end -> ^( IF ( protected_expr )* ( block )* ) ;
    public final babel17Parser.if_expr_return if_expr() throws RecognitionException {
        babel17Parser.if_expr_return retval = new babel17Parser.if_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_if197=null;
        Token NL198=null;
        Token NL200=null;
        Token L_then201=null;
        Token L_elseif203=null;
        Token NL204=null;
        Token NL206=null;
        Token L_then207=null;
        Token L_else209=null;
        Token L_end211=null;
        babel17Parser.protected_expr_return protected_expr199 = null;

        babel17Parser.block_return block202 = null;

        babel17Parser.protected_expr_return protected_expr205 = null;

        babel17Parser.block_return block208 = null;

        babel17Parser.block_return block210 = null;


        CommonTree L_if197_tree=null;
        CommonTree NL198_tree=null;
        CommonTree NL200_tree=null;
        CommonTree L_then201_tree=null;
        CommonTree L_elseif203_tree=null;
        CommonTree NL204_tree=null;
        CommonTree NL206_tree=null;
        CommonTree L_then207_tree=null;
        CommonTree L_else209_tree=null;
        CommonTree L_end211_tree=null;
        RewriteRuleTokenStream stream_L_else=new RewriteRuleTokenStream(adaptor,"token L_else");
        RewriteRuleTokenStream stream_L_if=new RewriteRuleTokenStream(adaptor,"token L_if");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleTokenStream stream_L_then=new RewriteRuleTokenStream(adaptor,"token L_then");
        RewriteRuleTokenStream stream_L_elseif=new RewriteRuleTokenStream(adaptor,"token L_elseif");
        RewriteRuleSubtreeStream stream_protected_expr=new RewriteRuleSubtreeStream(adaptor,"rule protected_expr");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:495:9: ( L_if ( NL )? protected_expr ( NL )? L_then block ( L_elseif ( NL )? protected_expr ( NL )? L_then block )* ( L_else block )? L_end -> ^( IF ( protected_expr )* ( block )* ) )
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:495:11: L_if ( NL )? protected_expr ( NL )? L_then block ( L_elseif ( NL )? protected_expr ( NL )? L_then block )* ( L_else block )? L_end
            {
            L_if197=(Token)match(input,L_if,FOLLOW_L_if_in_if_expr2856); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_if.add(L_if197);

            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:495:16: ( NL )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==NL) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:495:16: NL
                    {
                    NL198=(Token)match(input,NL,FOLLOW_NL_in_if_expr2858); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL198);


                    }
                    break;

            }

            pushFollow(FOLLOW_protected_expr_in_if_expr2861);
            protected_expr199=protected_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr199.getTree());
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:495:35: ( NL )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==NL) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:495:35: NL
                    {
                    NL200=(Token)match(input,NL,FOLLOW_NL_in_if_expr2863); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL200);


                    }
                    break;

            }

            L_then201=(Token)match(input,L_then,FOLLOW_L_then_in_if_expr2866); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_then.add(L_then201);

            pushFollow(FOLLOW_block_in_if_expr2868);
            block202=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block202.getTree());
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:496:3: ( L_elseif ( NL )? protected_expr ( NL )? L_then block )*
            loop94:
            do {
                int alt94=2;
                int LA94_0 = input.LA(1);

                if ( (LA94_0==L_elseif) ) {
                    alt94=1;
                }


                switch (alt94) {
            	case 1 :
            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:496:4: L_elseif ( NL )? protected_expr ( NL )? L_then block
            	    {
            	    L_elseif203=(Token)match(input,L_elseif,FOLLOW_L_elseif_in_if_expr2874); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_L_elseif.add(L_elseif203);

            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:496:13: ( NL )?
            	    int alt92=2;
            	    int LA92_0 = input.LA(1);

            	    if ( (LA92_0==NL) ) {
            	        alt92=1;
            	    }
            	    switch (alt92) {
            	        case 1 :
            	            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:496:13: NL
            	            {
            	            NL204=(Token)match(input,NL,FOLLOW_NL_in_if_expr2876); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL204);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_protected_expr_in_if_expr2879);
            	    protected_expr205=protected_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr205.getTree());
            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:496:32: ( NL )?
            	    int alt93=2;
            	    int LA93_0 = input.LA(1);

            	    if ( (LA93_0==NL) ) {
            	        alt93=1;
            	    }
            	    switch (alt93) {
            	        case 1 :
            	            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:496:32: NL
            	            {
            	            NL206=(Token)match(input,NL,FOLLOW_NL_in_if_expr2881); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL206);


            	            }
            	            break;

            	    }

            	    L_then207=(Token)match(input,L_then,FOLLOW_L_then_in_if_expr2884); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_L_then.add(L_then207);

            	    pushFollow(FOLLOW_block_in_if_expr2886);
            	    block208=block();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_block.add(block208.getTree());

            	    }
            	    break;

            	default :
            	    break loop94;
                }
            } while (true);

            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:497:3: ( L_else block )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==L_else) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:497:4: L_else block
                    {
                    L_else209=(Token)match(input,L_else,FOLLOW_L_else_in_if_expr2894); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_else.add(L_else209);

                    pushFollow(FOLLOW_block_in_if_expr2896);
                    block210=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block210.getTree());

                    }
                    break;

            }

            L_end211=(Token)match(input,L_end,FOLLOW_L_end_in_if_expr2900); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_end.add(L_end211);



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
            // 497:26: -> ^( IF ( protected_expr )* ( block )* )
            {
                // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:497:29: ^( IF ( protected_expr )* ( block )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IF, "IF"), root_1);

                // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:497:34: ( protected_expr )*
                while ( stream_protected_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_protected_expr.nextTree());

                }
                stream_protected_expr.reset();
                // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:497:50: ( block )*
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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:499:1: while_do_expr : L_while ( NL )? protected_expr ( NL )? L_do block L_end -> ^( WHILE_DO protected_expr block ) ;
    public final babel17Parser.while_do_expr_return while_do_expr() throws RecognitionException {
        babel17Parser.while_do_expr_return retval = new babel17Parser.while_do_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_while212=null;
        Token NL213=null;
        Token NL215=null;
        Token L_do216=null;
        Token L_end218=null;
        babel17Parser.protected_expr_return protected_expr214 = null;

        babel17Parser.block_return block217 = null;


        CommonTree L_while212_tree=null;
        CommonTree NL213_tree=null;
        CommonTree NL215_tree=null;
        CommonTree L_do216_tree=null;
        CommonTree L_end218_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_while=new RewriteRuleTokenStream(adaptor,"token L_while");
        RewriteRuleTokenStream stream_L_do=new RewriteRuleTokenStream(adaptor,"token L_do");
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleSubtreeStream stream_protected_expr=new RewriteRuleSubtreeStream(adaptor,"rule protected_expr");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:500:2: ( L_while ( NL )? protected_expr ( NL )? L_do block L_end -> ^( WHILE_DO protected_expr block ) )
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:500:4: L_while ( NL )? protected_expr ( NL )? L_do block L_end
            {
            L_while212=(Token)match(input,L_while,FOLLOW_L_while_in_while_do_expr2924); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_while.add(L_while212);

            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:500:12: ( NL )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==NL) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:500:12: NL
                    {
                    NL213=(Token)match(input,NL,FOLLOW_NL_in_while_do_expr2926); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL213);


                    }
                    break;

            }

            pushFollow(FOLLOW_protected_expr_in_while_do_expr2929);
            protected_expr214=protected_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr214.getTree());
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:500:31: ( NL )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==NL) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:500:31: NL
                    {
                    NL215=(Token)match(input,NL,FOLLOW_NL_in_while_do_expr2931); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL215);


                    }
                    break;

            }

            L_do216=(Token)match(input,L_do,FOLLOW_L_do_in_while_do_expr2934); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_do.add(L_do216);

            pushFollow(FOLLOW_block_in_while_do_expr2936);
            block217=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block217.getTree());
            L_end218=(Token)match(input,L_end,FOLLOW_L_end_in_while_do_expr2938); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_end.add(L_end218);



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
            // 501:5: -> ^( WHILE_DO protected_expr block )
            {
                // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:501:8: ^( WHILE_DO protected_expr block )
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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:503:1: cases : ( full_cases | pattern ( NL )? token_DOUBLE_ARROW block -> ^( CASES ^( NIL pattern block ) ) );
    public final babel17Parser.cases_return cases() throws RecognitionException {
        babel17Parser.cases_return retval = new babel17Parser.cases_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL221=null;
        babel17Parser.full_cases_return full_cases219 = null;

        babel17Parser.pattern_return pattern220 = null;

        babel17Parser.token_DOUBLE_ARROW_return token_DOUBLE_ARROW222 = null;

        babel17Parser.block_return block223 = null;


        CommonTree NL221_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_token_DOUBLE_ARROW=new RewriteRuleSubtreeStream(adaptor,"rule token_DOUBLE_ARROW");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:504:2: ( full_cases | pattern ( NL )? token_DOUBLE_ARROW block -> ^( CASES ^( NIL pattern block ) ) )
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==L_case) ) {
                alt99=1;
            }
            else if ( ((LA99_0>=A_infinity && LA99_0<=U_infinity)||(LA99_0>=L_true && LA99_0<=L_false)||LA99_0==MINUS||(LA99_0>=Constr && LA99_0<=Num)||(LA99_0>=String && LA99_0<=ROUND_BRACKET_OPEN)||LA99_0==SQUARE_BRACKET_OPEN||LA99_0==CURLY_BRACKET_OPEN||LA99_0==UNDERSCORE) ) {
                alt99=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 99, 0, input);

                throw nvae;
            }
            switch (alt99) {
                case 1 :
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:504:4: full_cases
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_full_cases_in_cases2968);
                    full_cases219=full_cases();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, full_cases219.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:505:4: pattern ( NL )? token_DOUBLE_ARROW block
                    {
                    pushFollow(FOLLOW_pattern_in_cases2973);
                    pattern220=pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pattern.add(pattern220.getTree());
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:505:12: ( NL )?
                    int alt98=2;
                    int LA98_0 = input.LA(1);

                    if ( (LA98_0==NL) ) {
                        alt98=1;
                    }
                    switch (alt98) {
                        case 1 :
                            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:505:12: NL
                            {
                            NL221=(Token)match(input,NL,FOLLOW_NL_in_cases2975); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL221);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_token_DOUBLE_ARROW_in_cases2978);
                    token_DOUBLE_ARROW222=token_DOUBLE_ARROW();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_token_DOUBLE_ARROW.add(token_DOUBLE_ARROW222.getTree());
                    pushFollow(FOLLOW_block_in_cases2980);
                    block223=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block223.getTree());


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
                    // 505:41: -> ^( CASES ^( NIL pattern block ) )
                    {
                        // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:505:44: ^( CASES ^( NIL pattern block ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CASES, "CASES"), root_1);

                        // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:505:52: ^( NIL pattern block )
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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:507:1: full_cases : ( case_expr )+ -> ^( CASES ( case_expr )+ ) ;
    public final babel17Parser.full_cases_return full_cases() throws RecognitionException {
        babel17Parser.full_cases_return retval = new babel17Parser.full_cases_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.case_expr_return case_expr224 = null;


        RewriteRuleSubtreeStream stream_case_expr=new RewriteRuleSubtreeStream(adaptor,"rule case_expr");
        try {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:508:2: ( ( case_expr )+ -> ^( CASES ( case_expr )+ ) )
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:508:4: ( case_expr )+
            {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:508:4: ( case_expr )+
            int cnt100=0;
            loop100:
            do {
                int alt100=2;
                int LA100_0 = input.LA(1);

                if ( (LA100_0==L_case) ) {
                    alt100=1;
                }


                switch (alt100) {
            	case 1 :
            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:508:4: case_expr
            	    {
            	    pushFollow(FOLLOW_case_expr_in_full_cases3003);
            	    case_expr224=case_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_case_expr.add(case_expr224.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt100 >= 1 ) break loop100;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(100, input);
                        throw eee;
                }
                cnt100++;
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
            // 508:15: -> ^( CASES ( case_expr )+ )
            {
                // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:508:18: ^( CASES ( case_expr )+ )
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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:510:1: case_expr : ( L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW block ) -> ^( NIL pattern block ) ;
    public final babel17Parser.case_expr_return case_expr() throws RecognitionException {
        babel17Parser.case_expr_return retval = new babel17Parser.case_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_case225=null;
        Token NL226=null;
        Token NL228=null;
        babel17Parser.pattern_return pattern227 = null;

        babel17Parser.token_DOUBLE_ARROW_return token_DOUBLE_ARROW229 = null;

        babel17Parser.block_return block230 = null;


        CommonTree L_case225_tree=null;
        CommonTree NL226_tree=null;
        CommonTree NL228_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_case=new RewriteRuleTokenStream(adaptor,"token L_case");
        RewriteRuleSubtreeStream stream_token_DOUBLE_ARROW=new RewriteRuleSubtreeStream(adaptor,"rule token_DOUBLE_ARROW");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:511:2: ( ( L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW block ) -> ^( NIL pattern block ) )
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:511:4: ( L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW block )
            {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:511:4: ( L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW block )
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:511:5: L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW block
            {
            L_case225=(Token)match(input,L_case,FOLLOW_L_case_in_case_expr3024); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_case.add(L_case225);

            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:511:12: ( NL )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==NL) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:511:12: NL
                    {
                    NL226=(Token)match(input,NL,FOLLOW_NL_in_case_expr3026); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL226);


                    }
                    break;

            }

            pushFollow(FOLLOW_pattern_in_case_expr3029);
            pattern227=pattern();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pattern.add(pattern227.getTree());
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:511:24: ( NL )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==NL) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:511:24: NL
                    {
                    NL228=(Token)match(input,NL,FOLLOW_NL_in_case_expr3031); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL228);


                    }
                    break;

            }

            pushFollow(FOLLOW_token_DOUBLE_ARROW_in_case_expr3034);
            token_DOUBLE_ARROW229=token_DOUBLE_ARROW();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_token_DOUBLE_ARROW.add(token_DOUBLE_ARROW229.getTree());
            pushFollow(FOLLOW_block_in_case_expr3036);
            block230=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block230.getTree());

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
            // 511:54: -> ^( NIL pattern block )
            {
                // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:511:57: ^( NIL pattern block )
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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:513:1: match_expr : L_match ( NL )? p_op_expr ( NL )? full_cases L_end -> ^( MATCH p_op_expr full_cases ) ;
    public final babel17Parser.match_expr_return match_expr() throws RecognitionException {
        babel17Parser.match_expr_return retval = new babel17Parser.match_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_match231=null;
        Token NL232=null;
        Token NL234=null;
        Token L_end236=null;
        babel17Parser.p_op_expr_return p_op_expr233 = null;

        babel17Parser.full_cases_return full_cases235 = null;


        CommonTree L_match231_tree=null;
        CommonTree NL232_tree=null;
        CommonTree NL234_tree=null;
        CommonTree L_end236_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_match=new RewriteRuleTokenStream(adaptor,"token L_match");
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleSubtreeStream stream_full_cases=new RewriteRuleSubtreeStream(adaptor,"rule full_cases");
        RewriteRuleSubtreeStream stream_p_op_expr=new RewriteRuleSubtreeStream(adaptor,"rule p_op_expr");
        try {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:514:2: ( L_match ( NL )? p_op_expr ( NL )? full_cases L_end -> ^( MATCH p_op_expr full_cases ) )
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:514:4: L_match ( NL )? p_op_expr ( NL )? full_cases L_end
            {
            L_match231=(Token)match(input,L_match,FOLLOW_L_match_in_match_expr3057); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_match.add(L_match231);

            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:514:12: ( NL )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==NL) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:514:12: NL
                    {
                    NL232=(Token)match(input,NL,FOLLOW_NL_in_match_expr3059); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL232);


                    }
                    break;

            }

            pushFollow(FOLLOW_p_op_expr_in_match_expr3062);
            p_op_expr233=p_op_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_p_op_expr.add(p_op_expr233.getTree());
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:514:26: ( NL )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==NL) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:514:26: NL
                    {
                    NL234=(Token)match(input,NL,FOLLOW_NL_in_match_expr3064); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL234);


                    }
                    break;

            }

            pushFollow(FOLLOW_full_cases_in_match_expr3067);
            full_cases235=full_cases();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_full_cases.add(full_cases235.getTree());
            L_end236=(Token)match(input,L_end,FOLLOW_L_end_in_match_expr3069); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_end.add(L_end236);



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
            // 515:5: -> ^( MATCH p_op_expr full_cases )
            {
                // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:515:8: ^( MATCH p_op_expr full_cases )
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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:517:1: lambda_expr : lambda_cases -> ^( LAMBDA lambda_cases ) ;
    public final babel17Parser.lambda_expr_return lambda_expr() throws RecognitionException {
        babel17Parser.lambda_expr_return retval = new babel17Parser.lambda_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.lambda_cases_return lambda_cases237 = null;


        RewriteRuleSubtreeStream stream_lambda_cases=new RewriteRuleSubtreeStream(adaptor,"rule lambda_cases");
        try {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:518:2: ( lambda_cases -> ^( LAMBDA lambda_cases ) )
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:518:4: lambda_cases
            {
            pushFollow(FOLLOW_lambda_cases_in_lambda_expr3095);
            lambda_cases237=lambda_cases();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_lambda_cases.add(lambda_cases237.getTree());


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
            // 518:17: -> ^( LAMBDA lambda_cases )
            {
                // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:518:20: ^( LAMBDA lambda_cases )
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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:520:1: lambda_cases : pattern ( NL )? token_DOUBLE_ARROW ( NL )? lop_expr -> ^( CASES ^( NIL pattern ^( BLOCK lop_expr ) ) ) ;
    public final babel17Parser.lambda_cases_return lambda_cases() throws RecognitionException {
        babel17Parser.lambda_cases_return retval = new babel17Parser.lambda_cases_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL239=null;
        Token NL241=null;
        babel17Parser.pattern_return pattern238 = null;

        babel17Parser.token_DOUBLE_ARROW_return token_DOUBLE_ARROW240 = null;

        babel17Parser.lop_expr_return lop_expr242 = null;


        CommonTree NL239_tree=null;
        CommonTree NL241_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_lop_expr=new RewriteRuleSubtreeStream(adaptor,"rule lop_expr");
        RewriteRuleSubtreeStream stream_token_DOUBLE_ARROW=new RewriteRuleSubtreeStream(adaptor,"rule token_DOUBLE_ARROW");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        try {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:521:2: ( pattern ( NL )? token_DOUBLE_ARROW ( NL )? lop_expr -> ^( CASES ^( NIL pattern ^( BLOCK lop_expr ) ) ) )
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:521:4: pattern ( NL )? token_DOUBLE_ARROW ( NL )? lop_expr
            {
            pushFollow(FOLLOW_pattern_in_lambda_cases3113);
            pattern238=pattern();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pattern.add(pattern238.getTree());
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:521:12: ( NL )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==NL) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:521:12: NL
                    {
                    NL239=(Token)match(input,NL,FOLLOW_NL_in_lambda_cases3115); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL239);


                    }
                    break;

            }

            pushFollow(FOLLOW_token_DOUBLE_ARROW_in_lambda_cases3118);
            token_DOUBLE_ARROW240=token_DOUBLE_ARROW();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_token_DOUBLE_ARROW.add(token_DOUBLE_ARROW240.getTree());
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:521:35: ( NL )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==NL) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:521:35: NL
                    {
                    NL241=(Token)match(input,NL,FOLLOW_NL_in_lambda_cases3120); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL241);


                    }
                    break;

            }

            pushFollow(FOLLOW_lop_expr_in_lambda_cases3123);
            lop_expr242=lop_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_lop_expr.add(lop_expr242.getTree());


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
            // 521:48: -> ^( CASES ^( NIL pattern ^( BLOCK lop_expr ) ) )
            {
                // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:521:51: ^( CASES ^( NIL pattern ^( BLOCK lop_expr ) ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CASES, "CASES"), root_1);

                // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:521:59: ^( NIL pattern ^( BLOCK lop_expr ) )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL, "NIL"), root_2);

                adaptor.addChild(root_2, stream_pattern.nextTree());
                // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:521:73: ^( BLOCK lop_expr )
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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:523:1: protected_lambda_expr : protected_lambda_cases -> ^( LAMBDA protected_lambda_cases ) ;
    public final babel17Parser.protected_lambda_expr_return protected_lambda_expr() throws RecognitionException {
        babel17Parser.protected_lambda_expr_return retval = new babel17Parser.protected_lambda_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.protected_lambda_cases_return protected_lambda_cases243 = null;


        RewriteRuleSubtreeStream stream_protected_lambda_cases=new RewriteRuleSubtreeStream(adaptor,"rule protected_lambda_cases");
        try {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:524:2: ( protected_lambda_cases -> ^( LAMBDA protected_lambda_cases ) )
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:524:4: protected_lambda_cases
            {
            pushFollow(FOLLOW_protected_lambda_cases_in_protected_lambda_expr3151);
            protected_lambda_cases243=protected_lambda_cases();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_protected_lambda_cases.add(protected_lambda_cases243.getTree());


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
            // 524:27: -> ^( LAMBDA protected_lambda_cases )
            {
                // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:524:30: ^( LAMBDA protected_lambda_cases )
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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:526:1: p_lambda_case_expr : ( L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block ) -> ^( NIL pattern pure_block ) ;
    public final babel17Parser.p_lambda_case_expr_return p_lambda_case_expr() throws RecognitionException {
        babel17Parser.p_lambda_case_expr_return retval = new babel17Parser.p_lambda_case_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_case244=null;
        Token NL245=null;
        Token NL247=null;
        Token NL249=null;
        babel17Parser.pattern_return pattern246 = null;

        babel17Parser.token_DOUBLE_ARROW_return token_DOUBLE_ARROW248 = null;

        babel17Parser.pure_block_return pure_block250 = null;


        CommonTree L_case244_tree=null;
        CommonTree NL245_tree=null;
        CommonTree NL247_tree=null;
        CommonTree NL249_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_case=new RewriteRuleTokenStream(adaptor,"token L_case");
        RewriteRuleSubtreeStream stream_token_DOUBLE_ARROW=new RewriteRuleSubtreeStream(adaptor,"rule token_DOUBLE_ARROW");
        RewriteRuleSubtreeStream stream_pure_block=new RewriteRuleSubtreeStream(adaptor,"rule pure_block");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        try {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:527:2: ( ( L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block ) -> ^( NIL pattern pure_block ) )
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:527:4: ( L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block )
            {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:527:4: ( L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block )
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:527:5: L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block
            {
            L_case244=(Token)match(input,L_case,FOLLOW_L_case_in_p_lambda_case_expr3169); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_case.add(L_case244);

            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:527:12: ( NL )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==NL) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:527:12: NL
                    {
                    NL245=(Token)match(input,NL,FOLLOW_NL_in_p_lambda_case_expr3171); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL245);


                    }
                    break;

            }

            pushFollow(FOLLOW_pattern_in_p_lambda_case_expr3174);
            pattern246=pattern();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pattern.add(pattern246.getTree());
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:527:24: ( NL )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==NL) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:527:24: NL
                    {
                    NL247=(Token)match(input,NL,FOLLOW_NL_in_p_lambda_case_expr3176); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL247);


                    }
                    break;

            }

            pushFollow(FOLLOW_token_DOUBLE_ARROW_in_p_lambda_case_expr3179);
            token_DOUBLE_ARROW248=token_DOUBLE_ARROW();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_token_DOUBLE_ARROW.add(token_DOUBLE_ARROW248.getTree());
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:527:47: ( NL )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==NL) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:527:47: NL
                    {
                    NL249=(Token)match(input,NL,FOLLOW_NL_in_p_lambda_case_expr3181); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL249);


                    }
                    break;

            }

            pushFollow(FOLLOW_pure_block_in_p_lambda_case_expr3184);
            pure_block250=pure_block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pure_block.add(pure_block250.getTree());

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
            // 527:63: -> ^( NIL pattern pure_block )
            {
                // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:527:66: ^( NIL pattern pure_block )
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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:529:1: protected_lambda_cases : ( pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block -> ^( CASES ^( NIL pattern pure_block ) ) | ( p_lambda_case_expr )+ -> ^( CASES ( p_lambda_case_expr )+ ) );
    public final babel17Parser.protected_lambda_cases_return protected_lambda_cases() throws RecognitionException {
        babel17Parser.protected_lambda_cases_return retval = new babel17Parser.protected_lambda_cases_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL252=null;
        Token NL254=null;
        babel17Parser.pattern_return pattern251 = null;

        babel17Parser.token_DOUBLE_ARROW_return token_DOUBLE_ARROW253 = null;

        babel17Parser.pure_block_return pure_block255 = null;

        babel17Parser.p_lambda_case_expr_return p_lambda_case_expr256 = null;


        CommonTree NL252_tree=null;
        CommonTree NL254_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_token_DOUBLE_ARROW=new RewriteRuleSubtreeStream(adaptor,"rule token_DOUBLE_ARROW");
        RewriteRuleSubtreeStream stream_p_lambda_case_expr=new RewriteRuleSubtreeStream(adaptor,"rule p_lambda_case_expr");
        RewriteRuleSubtreeStream stream_pure_block=new RewriteRuleSubtreeStream(adaptor,"rule pure_block");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        try {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:530:2: ( pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block -> ^( CASES ^( NIL pattern pure_block ) ) | ( p_lambda_case_expr )+ -> ^( CASES ( p_lambda_case_expr )+ ) )
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( ((LA113_0>=A_infinity && LA113_0<=U_infinity)||(LA113_0>=L_true && LA113_0<=L_false)||LA113_0==MINUS||(LA113_0>=Constr && LA113_0<=Num)||(LA113_0>=String && LA113_0<=ROUND_BRACKET_OPEN)||LA113_0==SQUARE_BRACKET_OPEN||LA113_0==CURLY_BRACKET_OPEN||LA113_0==UNDERSCORE) ) {
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
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:530:4: pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block
                    {
                    pushFollow(FOLLOW_pattern_in_protected_lambda_cases3205);
                    pattern251=pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pattern.add(pattern251.getTree());
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:530:12: ( NL )?
                    int alt110=2;
                    int LA110_0 = input.LA(1);

                    if ( (LA110_0==NL) ) {
                        alt110=1;
                    }
                    switch (alt110) {
                        case 1 :
                            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:530:12: NL
                            {
                            NL252=(Token)match(input,NL,FOLLOW_NL_in_protected_lambda_cases3207); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL252);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_token_DOUBLE_ARROW_in_protected_lambda_cases3210);
                    token_DOUBLE_ARROW253=token_DOUBLE_ARROW();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_token_DOUBLE_ARROW.add(token_DOUBLE_ARROW253.getTree());
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:530:35: ( NL )?
                    int alt111=2;
                    int LA111_0 = input.LA(1);

                    if ( (LA111_0==NL) ) {
                        alt111=1;
                    }
                    switch (alt111) {
                        case 1 :
                            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:530:35: NL
                            {
                            NL254=(Token)match(input,NL,FOLLOW_NL_in_protected_lambda_cases3212); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL254);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_pure_block_in_protected_lambda_cases3215);
                    pure_block255=pure_block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pure_block.add(pure_block255.getTree());


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
                    // 530:50: -> ^( CASES ^( NIL pattern pure_block ) )
                    {
                        // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:530:53: ^( CASES ^( NIL pattern pure_block ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CASES, "CASES"), root_1);

                        // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:530:61: ^( NIL pattern pure_block )
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
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:531:4: ( p_lambda_case_expr )+
                    {
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:531:4: ( p_lambda_case_expr )+
                    int cnt112=0;
                    loop112:
                    do {
                        int alt112=2;
                        int LA112_0 = input.LA(1);

                        if ( (LA112_0==L_case) ) {
                            alt112=1;
                        }


                        switch (alt112) {
                    	case 1 :
                    	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:531:4: p_lambda_case_expr
                    	    {
                    	    pushFollow(FOLLOW_p_lambda_case_expr_in_protected_lambda_cases3234);
                    	    p_lambda_case_expr256=p_lambda_case_expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_p_lambda_case_expr.add(p_lambda_case_expr256.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt112 >= 1 ) break loop112;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(112, input);
                                throw eee;
                        }
                        cnt112++;
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
                    // 531:24: -> ^( CASES ( p_lambda_case_expr )+ )
                    {
                        // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:531:27: ^( CASES ( p_lambda_case_expr )+ )
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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:533:1: for_expr : L_for ( NL )? pattern ( NL )? L_in ( NL )? protected_expr ( NL )? L_do block L_end -> ^( FOR_EXPR pattern protected_expr block ) ;
    public final babel17Parser.for_expr_return for_expr() throws RecognitionException {
        babel17Parser.for_expr_return retval = new babel17Parser.for_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_for257=null;
        Token NL258=null;
        Token NL260=null;
        Token L_in261=null;
        Token NL262=null;
        Token NL264=null;
        Token L_do265=null;
        Token L_end267=null;
        babel17Parser.pattern_return pattern259 = null;

        babel17Parser.protected_expr_return protected_expr263 = null;

        babel17Parser.block_return block266 = null;


        CommonTree L_for257_tree=null;
        CommonTree NL258_tree=null;
        CommonTree NL260_tree=null;
        CommonTree L_in261_tree=null;
        CommonTree NL262_tree=null;
        CommonTree NL264_tree=null;
        CommonTree L_do265_tree=null;
        CommonTree L_end267_tree=null;
        RewriteRuleTokenStream stream_L_for=new RewriteRuleTokenStream(adaptor,"token L_for");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_do=new RewriteRuleTokenStream(adaptor,"token L_do");
        RewriteRuleTokenStream stream_L_in=new RewriteRuleTokenStream(adaptor,"token L_in");
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleSubtreeStream stream_protected_expr=new RewriteRuleSubtreeStream(adaptor,"rule protected_expr");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:533:9: ( L_for ( NL )? pattern ( NL )? L_in ( NL )? protected_expr ( NL )? L_do block L_end -> ^( FOR_EXPR pattern protected_expr block ) )
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:533:11: L_for ( NL )? pattern ( NL )? L_in ( NL )? protected_expr ( NL )? L_do block L_end
            {
            L_for257=(Token)match(input,L_for,FOLLOW_L_for_in_for_expr3251); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_for.add(L_for257);

            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:533:17: ( NL )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==NL) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:533:17: NL
                    {
                    NL258=(Token)match(input,NL,FOLLOW_NL_in_for_expr3253); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL258);


                    }
                    break;

            }

            pushFollow(FOLLOW_pattern_in_for_expr3256);
            pattern259=pattern();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pattern.add(pattern259.getTree());
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:533:29: ( NL )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==NL) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:533:29: NL
                    {
                    NL260=(Token)match(input,NL,FOLLOW_NL_in_for_expr3258); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL260);


                    }
                    break;

            }

            L_in261=(Token)match(input,L_in,FOLLOW_L_in_in_for_expr3261); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_in.add(L_in261);

            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:533:38: ( NL )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==NL) ) {
                alt116=1;
            }
            switch (alt116) {
                case 1 :
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:533:38: NL
                    {
                    NL262=(Token)match(input,NL,FOLLOW_NL_in_for_expr3263); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL262);


                    }
                    break;

            }

            pushFollow(FOLLOW_protected_expr_in_for_expr3266);
            protected_expr263=protected_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr263.getTree());
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:533:57: ( NL )?
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==NL) ) {
                alt117=1;
            }
            switch (alt117) {
                case 1 :
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:533:57: NL
                    {
                    NL264=(Token)match(input,NL,FOLLOW_NL_in_for_expr3268); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL264);


                    }
                    break;

            }

            L_do265=(Token)match(input,L_do,FOLLOW_L_do_in_for_expr3271); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_do.add(L_do265);

            pushFollow(FOLLOW_block_in_for_expr3273);
            block266=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block266.getTree());
            L_end267=(Token)match(input,L_end,FOLLOW_L_end_in_for_expr3275); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_end.add(L_end267);



            // AST REWRITE
            // elements: protected_expr, pattern, block
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 534:5: -> ^( FOR_EXPR pattern protected_expr block )
            {
                // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:534:8: ^( FOR_EXPR pattern protected_expr block )
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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:536:1: op_expr : ( builtin_primitive op_expr | bool_expr );
    public final babel17Parser.op_expr_return op_expr() throws RecognitionException {
        babel17Parser.op_expr_return retval = new babel17Parser.op_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.builtin_primitive_return builtin_primitive268 = null;

        babel17Parser.op_expr_return op_expr269 = null;

        babel17Parser.bool_expr_return bool_expr270 = null;



        try {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:536:9: ( builtin_primitive op_expr | bool_expr )
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==L_exception||(LA118_0>=L_concurrent && LA118_0<=L_lazy)||LA118_0==L_random||LA118_0==TILDE) ) {
                alt118=1;
            }
            else if ( (LA118_0==L_begin||(LA118_0>=L_with && LA118_0<=L_if)||(LA118_0>=L_while && LA118_0<=L_for)||LA118_0==L_match||(LA118_0>=A_infinity && LA118_0<=U_infinity)||LA118_0==L_root||(LA118_0>=L_true && LA118_0<=L_here)||LA118_0==MINUS||LA118_0==MODULE_KEY||LA118_0==A_NOT||LA118_0==U_NOT||(LA118_0>=Constr && LA118_0<=Num)||(LA118_0>=String && LA118_0<=ROUND_BRACKET_OPEN)||LA118_0==SQUARE_BRACKET_OPEN||LA118_0==CURLY_BRACKET_OPEN) ) {
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
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:536:11: builtin_primitive op_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_builtin_primitive_in_op_expr3300);
                    builtin_primitive268=builtin_primitive();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(builtin_primitive268.getTree(), root_0);
                    pushFollow(FOLLOW_op_expr_in_op_expr3303);
                    op_expr269=op_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, op_expr269.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:537:4: bool_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_bool_expr_in_op_expr3308);
                    bool_expr270=bool_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_expr270.getTree());

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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:539:1: p_op_expr : ( builtin_primitive ( NL )? p_op_expr | p_bool_expr );
    public final babel17Parser.p_op_expr_return p_op_expr() throws RecognitionException {
        babel17Parser.p_op_expr_return retval = new babel17Parser.p_op_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL272=null;
        babel17Parser.builtin_primitive_return builtin_primitive271 = null;

        babel17Parser.p_op_expr_return p_op_expr273 = null;

        babel17Parser.p_bool_expr_return p_bool_expr274 = null;


        CommonTree NL272_tree=null;

        try {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:540:2: ( builtin_primitive ( NL )? p_op_expr | p_bool_expr )
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
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:540:4: builtin_primitive ( NL )? p_op_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_builtin_primitive_in_p_op_expr3318);
                    builtin_primitive271=builtin_primitive();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(builtin_primitive271.getTree(), root_0);
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:540:25: ( NL )?
                    int alt119=2;
                    int LA119_0 = input.LA(1);

                    if ( (LA119_0==NL) ) {
                        alt119=1;
                    }
                    switch (alt119) {
                        case 1 :
                            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:540:25: NL
                            {
                            NL272=(Token)match(input,NL,FOLLOW_NL_in_p_op_expr3321); if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_p_op_expr_in_p_op_expr3325);
                    p_op_expr273=p_op_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_op_expr273.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:541:4: p_bool_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_p_bool_expr_in_p_op_expr3330);
                    p_bool_expr274=p_bool_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_bool_expr274.getTree());

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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:544:1: builtin_primitive : ( L_random | L_await | L_exception | L_lazy | TILDE | L_concurrent );
    public final babel17Parser.builtin_primitive_return builtin_primitive() throws RecognitionException {
        babel17Parser.builtin_primitive_return retval = new babel17Parser.builtin_primitive_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set275=null;

        CommonTree set275_tree=null;

        try {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:545:2: ( L_random | L_await | L_exception | L_lazy | TILDE | L_concurrent )
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set275=(Token)input.LT(1);
            if ( input.LA(1)==L_exception||(input.LA(1)>=L_concurrent && input.LA(1)<=L_lazy)||input.LA(1)==L_random||input.LA(1)==TILDE ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set275));
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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:547:1: bool_expr : bool_or_expr ;
    public final babel17Parser.bool_expr_return bool_expr() throws RecognitionException {
        babel17Parser.bool_expr_return retval = new babel17Parser.bool_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.bool_or_expr_return bool_or_expr276 = null;



        try {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:548:2: ( bool_or_expr )
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:548:4: bool_or_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bool_or_expr_in_bool_expr3370);
            bool_or_expr276=bool_or_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_or_expr276.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:550:1: p_bool_expr : p_bool_or_expr ;
    public final babel17Parser.p_bool_expr_return p_bool_expr() throws RecognitionException {
        babel17Parser.p_bool_expr_return retval = new babel17Parser.p_bool_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.p_bool_or_expr_return p_bool_or_expr277 = null;



        try {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:551:2: ( p_bool_or_expr )
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:551:4: p_bool_or_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_bool_or_expr_in_p_bool_expr3380);
            p_bool_or_expr277=p_bool_or_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_bool_or_expr277.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:553:1: bool_or_expr : bool_and_expr ( ( NL )? token_OR ( NL )? bool_and_expr )* ;
    public final babel17Parser.bool_or_expr_return bool_or_expr() throws RecognitionException {
        babel17Parser.bool_or_expr_return retval = new babel17Parser.bool_or_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL279=null;
        Token NL281=null;
        babel17Parser.bool_and_expr_return bool_and_expr278 = null;

        babel17Parser.token_OR_return token_OR280 = null;

        babel17Parser.bool_and_expr_return bool_and_expr282 = null;


        CommonTree NL279_tree=null;
        CommonTree NL281_tree=null;

        try {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:554:2: ( bool_and_expr ( ( NL )? token_OR ( NL )? bool_and_expr )* )
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:554:4: bool_and_expr ( ( NL )? token_OR ( NL )? bool_and_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bool_and_expr_in_bool_or_expr3389);
            bool_and_expr278=bool_and_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_and_expr278.getTree());
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:554:18: ( ( NL )? token_OR ( NL )? bool_and_expr )*
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
            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:554:19: ( NL )? token_OR ( NL )? bool_and_expr
            	    {
            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:554:21: ( NL )?
            	    int alt121=2;
            	    int LA121_0 = input.LA(1);

            	    if ( (LA121_0==NL) ) {
            	        alt121=1;
            	    }
            	    switch (alt121) {
            	        case 1 :
            	            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:554:21: NL
            	            {
            	            NL279=(Token)match(input,NL,FOLLOW_NL_in_bool_or_expr3392); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_token_OR_in_bool_or_expr3396);
            	    token_OR280=token_OR();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(token_OR280.getTree(), root_0);
            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:554:36: ( NL )?
            	    int alt122=2;
            	    int LA122_0 = input.LA(1);

            	    if ( (LA122_0==NL) ) {
            	        alt122=1;
            	    }
            	    switch (alt122) {
            	        case 1 :
            	            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:554:36: NL
            	            {
            	            NL281=(Token)match(input,NL,FOLLOW_NL_in_bool_or_expr3399); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_bool_and_expr_in_bool_or_expr3403);
            	    bool_and_expr282=bool_and_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_and_expr282.getTree());

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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:556:1: p_bool_or_expr : p_bool_and_expr ( ( NL )? token_OR ( NL )? p_bool_and_expr )* ;
    public final babel17Parser.p_bool_or_expr_return p_bool_or_expr() throws RecognitionException {
        babel17Parser.p_bool_or_expr_return retval = new babel17Parser.p_bool_or_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL284=null;
        Token NL286=null;
        babel17Parser.p_bool_and_expr_return p_bool_and_expr283 = null;

        babel17Parser.token_OR_return token_OR285 = null;

        babel17Parser.p_bool_and_expr_return p_bool_and_expr287 = null;


        CommonTree NL284_tree=null;
        CommonTree NL286_tree=null;

        try {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:557:2: ( p_bool_and_expr ( ( NL )? token_OR ( NL )? p_bool_and_expr )* )
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:557:4: p_bool_and_expr ( ( NL )? token_OR ( NL )? p_bool_and_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_bool_and_expr_in_p_bool_or_expr3415);
            p_bool_and_expr283=p_bool_and_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_bool_and_expr283.getTree());
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:557:20: ( ( NL )? token_OR ( NL )? p_bool_and_expr )*
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
            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:557:21: ( NL )? token_OR ( NL )? p_bool_and_expr
            	    {
            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:557:23: ( NL )?
            	    int alt124=2;
            	    int LA124_0 = input.LA(1);

            	    if ( (LA124_0==NL) ) {
            	        alt124=1;
            	    }
            	    switch (alt124) {
            	        case 1 :
            	            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:557:23: NL
            	            {
            	            NL284=(Token)match(input,NL,FOLLOW_NL_in_p_bool_or_expr3418); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_token_OR_in_p_bool_or_expr3422);
            	    token_OR285=token_OR();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(token_OR285.getTree(), root_0);
            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:557:38: ( NL )?
            	    int alt125=2;
            	    int LA125_0 = input.LA(1);

            	    if ( (LA125_0==NL) ) {
            	        alt125=1;
            	    }
            	    switch (alt125) {
            	        case 1 :
            	            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:557:38: NL
            	            {
            	            NL286=(Token)match(input,NL,FOLLOW_NL_in_p_bool_or_expr3425); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_bool_and_expr_in_p_bool_or_expr3429);
            	    p_bool_and_expr287=p_bool_and_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_bool_and_expr287.getTree());

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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:559:1: bool_and_expr : bool_not_expr ( ( NL )? token_AND ( NL )? bool_not_expr )* ;
    public final babel17Parser.bool_and_expr_return bool_and_expr() throws RecognitionException {
        babel17Parser.bool_and_expr_return retval = new babel17Parser.bool_and_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL289=null;
        Token NL291=null;
        babel17Parser.bool_not_expr_return bool_not_expr288 = null;

        babel17Parser.token_AND_return token_AND290 = null;

        babel17Parser.bool_not_expr_return bool_not_expr292 = null;


        CommonTree NL289_tree=null;
        CommonTree NL291_tree=null;

        try {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:560:2: ( bool_not_expr ( ( NL )? token_AND ( NL )? bool_not_expr )* )
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:560:4: bool_not_expr ( ( NL )? token_AND ( NL )? bool_not_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bool_not_expr_in_bool_and_expr3441);
            bool_not_expr288=bool_not_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_not_expr288.getTree());
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:560:18: ( ( NL )? token_AND ( NL )? bool_not_expr )*
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
            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:560:19: ( NL )? token_AND ( NL )? bool_not_expr
            	    {
            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:560:21: ( NL )?
            	    int alt127=2;
            	    int LA127_0 = input.LA(1);

            	    if ( (LA127_0==NL) ) {
            	        alt127=1;
            	    }
            	    switch (alt127) {
            	        case 1 :
            	            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:560:21: NL
            	            {
            	            NL289=(Token)match(input,NL,FOLLOW_NL_in_bool_and_expr3444); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_token_AND_in_bool_and_expr3448);
            	    token_AND290=token_AND();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(token_AND290.getTree(), root_0);
            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:560:37: ( NL )?
            	    int alt128=2;
            	    int LA128_0 = input.LA(1);

            	    if ( (LA128_0==NL) ) {
            	        alt128=1;
            	    }
            	    switch (alt128) {
            	        case 1 :
            	            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:560:37: NL
            	            {
            	            NL291=(Token)match(input,NL,FOLLOW_NL_in_bool_and_expr3451); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_bool_not_expr_in_bool_and_expr3455);
            	    bool_not_expr292=bool_not_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_not_expr292.getTree());

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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:562:1: p_bool_and_expr : p_bool_not_expr ( ( NL )? token_AND ( NL )? p_bool_not_expr )* ;
    public final babel17Parser.p_bool_and_expr_return p_bool_and_expr() throws RecognitionException {
        babel17Parser.p_bool_and_expr_return retval = new babel17Parser.p_bool_and_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL294=null;
        Token NL296=null;
        babel17Parser.p_bool_not_expr_return p_bool_not_expr293 = null;

        babel17Parser.token_AND_return token_AND295 = null;

        babel17Parser.p_bool_not_expr_return p_bool_not_expr297 = null;


        CommonTree NL294_tree=null;
        CommonTree NL296_tree=null;

        try {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:563:2: ( p_bool_not_expr ( ( NL )? token_AND ( NL )? p_bool_not_expr )* )
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:563:4: p_bool_not_expr ( ( NL )? token_AND ( NL )? p_bool_not_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_bool_not_expr_in_p_bool_and_expr3467);
            p_bool_not_expr293=p_bool_not_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_bool_not_expr293.getTree());
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:563:20: ( ( NL )? token_AND ( NL )? p_bool_not_expr )*
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
            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:563:21: ( NL )? token_AND ( NL )? p_bool_not_expr
            	    {
            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:563:23: ( NL )?
            	    int alt130=2;
            	    int LA130_0 = input.LA(1);

            	    if ( (LA130_0==NL) ) {
            	        alt130=1;
            	    }
            	    switch (alt130) {
            	        case 1 :
            	            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:563:23: NL
            	            {
            	            NL294=(Token)match(input,NL,FOLLOW_NL_in_p_bool_and_expr3470); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_token_AND_in_p_bool_and_expr3474);
            	    token_AND295=token_AND();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(token_AND295.getTree(), root_0);
            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:563:39: ( NL )?
            	    int alt131=2;
            	    int LA131_0 = input.LA(1);

            	    if ( (LA131_0==NL) ) {
            	        alt131=1;
            	    }
            	    switch (alt131) {
            	        case 1 :
            	            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:563:39: NL
            	            {
            	            NL296=(Token)match(input,NL,FOLLOW_NL_in_p_bool_and_expr3477); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_bool_not_expr_in_p_bool_and_expr3481);
            	    p_bool_not_expr297=p_bool_not_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_bool_not_expr297.getTree());

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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:566:1: bool_not_expr : ( token_NOT ( NL )? bool_not_expr | rel_expr );
    public final babel17Parser.bool_not_expr_return bool_not_expr() throws RecognitionException {
        babel17Parser.bool_not_expr_return retval = new babel17Parser.bool_not_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL299=null;
        babel17Parser.token_NOT_return token_NOT298 = null;

        babel17Parser.bool_not_expr_return bool_not_expr300 = null;

        babel17Parser.rel_expr_return rel_expr301 = null;


        CommonTree NL299_tree=null;

        try {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:567:2: ( token_NOT ( NL )? bool_not_expr | rel_expr )
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==A_NOT||LA134_0==U_NOT) ) {
                alt134=1;
            }
            else if ( (LA134_0==L_begin||(LA134_0>=L_with && LA134_0<=L_if)||(LA134_0>=L_while && LA134_0<=L_for)||LA134_0==L_match||(LA134_0>=A_infinity && LA134_0<=U_infinity)||LA134_0==L_root||(LA134_0>=L_true && LA134_0<=L_here)||LA134_0==MINUS||LA134_0==MODULE_KEY||(LA134_0>=Constr && LA134_0<=Num)||(LA134_0>=String && LA134_0<=ROUND_BRACKET_OPEN)||LA134_0==SQUARE_BRACKET_OPEN||LA134_0==CURLY_BRACKET_OPEN) ) {
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
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:567:4: token_NOT ( NL )? bool_not_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_NOT_in_bool_not_expr3493);
                    token_NOT298=token_NOT();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(token_NOT298.getTree(), root_0);
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:567:17: ( NL )?
                    int alt133=2;
                    int LA133_0 = input.LA(1);

                    if ( (LA133_0==NL) ) {
                        alt133=1;
                    }
                    switch (alt133) {
                        case 1 :
                            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:567:17: NL
                            {
                            NL299=(Token)match(input,NL,FOLLOW_NL_in_bool_not_expr3496); if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_bool_not_expr_in_bool_not_expr3500);
                    bool_not_expr300=bool_not_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_not_expr300.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:568:4: rel_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_rel_expr_in_bool_not_expr3505);
                    rel_expr301=rel_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rel_expr301.getTree());

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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:570:1: p_bool_not_expr : ( token_NOT ( NL )? p_bool_not_expr | p_rel_expr );
    public final babel17Parser.p_bool_not_expr_return p_bool_not_expr() throws RecognitionException {
        babel17Parser.p_bool_not_expr_return retval = new babel17Parser.p_bool_not_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL303=null;
        babel17Parser.token_NOT_return token_NOT302 = null;

        babel17Parser.p_bool_not_expr_return p_bool_not_expr304 = null;

        babel17Parser.p_rel_expr_return p_rel_expr305 = null;


        CommonTree NL303_tree=null;

        try {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:571:2: ( token_NOT ( NL )? p_bool_not_expr | p_rel_expr )
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
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:571:4: token_NOT ( NL )? p_bool_not_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_NOT_in_p_bool_not_expr3516);
                    token_NOT302=token_NOT();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(token_NOT302.getTree(), root_0);
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:571:17: ( NL )?
                    int alt135=2;
                    int LA135_0 = input.LA(1);

                    if ( (LA135_0==NL) ) {
                        alt135=1;
                    }
                    switch (alt135) {
                        case 1 :
                            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:571:17: NL
                            {
                            NL303=(Token)match(input,NL,FOLLOW_NL_in_p_bool_not_expr3519); if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_p_bool_not_expr_in_p_bool_not_expr3523);
                    p_bool_not_expr304=p_bool_not_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_bool_not_expr304.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:572:4: p_rel_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_p_rel_expr_in_p_bool_not_expr3528);
                    p_rel_expr305=p_rel_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_rel_expr305.getTree());

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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:574:1: rel_expr : arith_expr ( ( NL )? rel_op ( NL )? arith_expr )* -> ^( COMPARE arith_expr ( rel_op arith_expr )* ) ;
    public final babel17Parser.rel_expr_return rel_expr() throws RecognitionException {
        babel17Parser.rel_expr_return retval = new babel17Parser.rel_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL307=null;
        Token NL309=null;
        babel17Parser.arith_expr_return arith_expr306 = null;

        babel17Parser.rel_op_return rel_op308 = null;

        babel17Parser.arith_expr_return arith_expr310 = null;


        CommonTree NL307_tree=null;
        CommonTree NL309_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_arith_expr=new RewriteRuleSubtreeStream(adaptor,"rule arith_expr");
        RewriteRuleSubtreeStream stream_rel_op=new RewriteRuleSubtreeStream(adaptor,"rule rel_op");
        try {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:575:2: ( arith_expr ( ( NL )? rel_op ( NL )? arith_expr )* -> ^( COMPARE arith_expr ( rel_op arith_expr )* ) )
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:575:4: arith_expr ( ( NL )? rel_op ( NL )? arith_expr )*
            {
            pushFollow(FOLLOW_arith_expr_in_rel_expr3537);
            arith_expr306=arith_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_arith_expr.add(arith_expr306.getTree());
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:575:15: ( ( NL )? rel_op ( NL )? arith_expr )*
            loop139:
            do {
                int alt139=2;
                int LA139_0 = input.LA(1);

                if ( (LA139_0==NL) ) {
                    int LA139_1 = input.LA(2);

                    if ( ((LA139_1>=A_EQUAL && LA139_1<=UNRELATED)) ) {
                        alt139=1;
                    }


                }
                else if ( ((LA139_0>=A_EQUAL && LA139_0<=UNRELATED)) ) {
                    alt139=1;
                }


                switch (alt139) {
            	case 1 :
            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:575:16: ( NL )? rel_op ( NL )? arith_expr
            	    {
            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:575:16: ( NL )?
            	    int alt137=2;
            	    int LA137_0 = input.LA(1);

            	    if ( (LA137_0==NL) ) {
            	        alt137=1;
            	    }
            	    switch (alt137) {
            	        case 1 :
            	            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:575:16: NL
            	            {
            	            NL307=(Token)match(input,NL,FOLLOW_NL_in_rel_expr3540); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL307);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_rel_op_in_rel_expr3543);
            	    rel_op308=rel_op();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_rel_op.add(rel_op308.getTree());
            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:575:27: ( NL )?
            	    int alt138=2;
            	    int LA138_0 = input.LA(1);

            	    if ( (LA138_0==NL) ) {
            	        alt138=1;
            	    }
            	    switch (alt138) {
            	        case 1 :
            	            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:575:27: NL
            	            {
            	            NL309=(Token)match(input,NL,FOLLOW_NL_in_rel_expr3545); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL309);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_arith_expr_in_rel_expr3548);
            	    arith_expr310=arith_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_arith_expr.add(arith_expr310.getTree());

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
            // 575:44: -> ^( COMPARE arith_expr ( rel_op arith_expr )* )
            {
                // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:575:47: ^( COMPARE arith_expr ( rel_op arith_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COMPARE, "COMPARE"), root_1);

                adaptor.addChild(root_1, stream_arith_expr.nextTree());
                // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:575:68: ( rel_op arith_expr )*
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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:577:1: p_rel_expr : p_arith_expr ( ( NL )? rel_op ( NL )? p_arith_expr )* -> ^( COMPARE p_arith_expr ( rel_op p_arith_expr )* ) ;
    public final babel17Parser.p_rel_expr_return p_rel_expr() throws RecognitionException {
        babel17Parser.p_rel_expr_return retval = new babel17Parser.p_rel_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL312=null;
        Token NL314=null;
        babel17Parser.p_arith_expr_return p_arith_expr311 = null;

        babel17Parser.rel_op_return rel_op313 = null;

        babel17Parser.p_arith_expr_return p_arith_expr315 = null;


        CommonTree NL312_tree=null;
        CommonTree NL314_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_rel_op=new RewriteRuleSubtreeStream(adaptor,"rule rel_op");
        RewriteRuleSubtreeStream stream_p_arith_expr=new RewriteRuleSubtreeStream(adaptor,"rule p_arith_expr");
        try {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:578:2: ( p_arith_expr ( ( NL )? rel_op ( NL )? p_arith_expr )* -> ^( COMPARE p_arith_expr ( rel_op p_arith_expr )* ) )
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:578:4: p_arith_expr ( ( NL )? rel_op ( NL )? p_arith_expr )*
            {
            pushFollow(FOLLOW_p_arith_expr_in_p_rel_expr3575);
            p_arith_expr311=p_arith_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_p_arith_expr.add(p_arith_expr311.getTree());
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:578:17: ( ( NL )? rel_op ( NL )? p_arith_expr )*
            loop142:
            do {
                int alt142=2;
                int LA142_0 = input.LA(1);

                if ( (LA142_0==NL) ) {
                    int LA142_1 = input.LA(2);

                    if ( ((LA142_1>=A_EQUAL && LA142_1<=UNRELATED)) ) {
                        alt142=1;
                    }


                }
                else if ( ((LA142_0>=A_EQUAL && LA142_0<=UNRELATED)) ) {
                    alt142=1;
                }


                switch (alt142) {
            	case 1 :
            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:578:18: ( NL )? rel_op ( NL )? p_arith_expr
            	    {
            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:578:18: ( NL )?
            	    int alt140=2;
            	    int LA140_0 = input.LA(1);

            	    if ( (LA140_0==NL) ) {
            	        alt140=1;
            	    }
            	    switch (alt140) {
            	        case 1 :
            	            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:578:18: NL
            	            {
            	            NL312=(Token)match(input,NL,FOLLOW_NL_in_p_rel_expr3578); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL312);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_rel_op_in_p_rel_expr3581);
            	    rel_op313=rel_op();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_rel_op.add(rel_op313.getTree());
            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:578:29: ( NL )?
            	    int alt141=2;
            	    int LA141_0 = input.LA(1);

            	    if ( (LA141_0==NL) ) {
            	        alt141=1;
            	    }
            	    switch (alt141) {
            	        case 1 :
            	            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:578:29: NL
            	            {
            	            NL314=(Token)match(input,NL,FOLLOW_NL_in_p_rel_expr3583); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL314);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_arith_expr_in_p_rel_expr3586);
            	    p_arith_expr315=p_arith_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_p_arith_expr.add(p_arith_expr315.getTree());

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
            // 578:48: -> ^( COMPARE p_arith_expr ( rel_op p_arith_expr )* )
            {
                // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:578:51: ^( COMPARE p_arith_expr ( rel_op p_arith_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COMPARE, "COMPARE"), root_1);

                adaptor.addChild(root_1, stream_p_arith_expr.nextTree());
                // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:578:74: ( rel_op p_arith_expr )*
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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:581:1: rel_op : ( token_EQUAL | token_NOT_EQUAL | UNRELATED | GREATER | token_GREATER_EQ | LESS | token_LESS_EQ );
    public final babel17Parser.rel_op_return rel_op() throws RecognitionException {
        babel17Parser.rel_op_return retval = new babel17Parser.rel_op_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token UNRELATED318=null;
        Token GREATER319=null;
        Token LESS321=null;
        babel17Parser.token_EQUAL_return token_EQUAL316 = null;

        babel17Parser.token_NOT_EQUAL_return token_NOT_EQUAL317 = null;

        babel17Parser.token_GREATER_EQ_return token_GREATER_EQ320 = null;

        babel17Parser.token_LESS_EQ_return token_LESS_EQ322 = null;


        CommonTree UNRELATED318_tree=null;
        CommonTree GREATER319_tree=null;
        CommonTree LESS321_tree=null;

        try {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:581:8: ( token_EQUAL | token_NOT_EQUAL | UNRELATED | GREATER | token_GREATER_EQ | LESS | token_LESS_EQ )
            int alt143=7;
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
            case UNRELATED:
                {
                alt143=3;
                }
                break;
            case GREATER:
                {
                alt143=4;
                }
                break;
            case A_GREATER_EQ:
            case U_GREATER_EQ:
                {
                alt143=5;
                }
                break;
            case LESS:
                {
                alt143=6;
                }
                break;
            case A_LESS_EQ:
            case U_LESS_EQ:
                {
                alt143=7;
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
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:581:10: token_EQUAL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_EQUAL_in_rel_op3612);
                    token_EQUAL316=token_EQUAL();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, token_EQUAL316.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:581:24: token_NOT_EQUAL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_NOT_EQUAL_in_rel_op3616);
                    token_NOT_EQUAL317=token_NOT_EQUAL();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, token_NOT_EQUAL317.getTree());

                    }
                    break;
                case 3 :
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:581:42: UNRELATED
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    UNRELATED318=(Token)match(input,UNRELATED,FOLLOW_UNRELATED_in_rel_op3620); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UNRELATED318_tree = (CommonTree)adaptor.create(UNRELATED318);
                    adaptor.addChild(root_0, UNRELATED318_tree);
                    }

                    }
                    break;
                case 4 :
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:581:54: GREATER
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    GREATER319=(Token)match(input,GREATER,FOLLOW_GREATER_in_rel_op3624); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    GREATER319_tree = (CommonTree)adaptor.create(GREATER319);
                    adaptor.addChild(root_0, GREATER319_tree);
                    }

                    }
                    break;
                case 5 :
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:581:64: token_GREATER_EQ
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_GREATER_EQ_in_rel_op3628);
                    token_GREATER_EQ320=token_GREATER_EQ();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, token_GREATER_EQ320.getTree());

                    }
                    break;
                case 6 :
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:581:83: LESS
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    LESS321=(Token)match(input,LESS,FOLLOW_LESS_in_rel_op3632); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LESS321_tree = (CommonTree)adaptor.create(LESS321);
                    adaptor.addChild(root_0, LESS321_tree);
                    }

                    }
                    break;
                case 7 :
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:581:90: token_LESS_EQ
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_LESS_EQ_in_rel_op3636);
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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:584:1: arith_expr : plusplus_expr ;
    public final babel17Parser.arith_expr_return arith_expr() throws RecognitionException {
        babel17Parser.arith_expr_return retval = new babel17Parser.arith_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.plusplus_expr_return plusplus_expr323 = null;



        try {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:585:2: ( plusplus_expr )
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:585:4: plusplus_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_plusplus_expr_in_arith_expr3648);
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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:588:1: p_arith_expr : p_plusplus_expr ;
    public final babel17Parser.p_arith_expr_return p_arith_expr() throws RecognitionException {
        babel17Parser.p_arith_expr_return retval = new babel17Parser.p_arith_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.p_plusplus_expr_return p_plusplus_expr324 = null;



        try {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:589:2: ( p_plusplus_expr )
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:589:4: p_plusplus_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_plusplus_expr_in_p_arith_expr3658);
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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:591:1: plusplus_expr : timestimes_expr ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? timestimes_expr )* ;
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
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:592:2: ( timestimes_expr ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? timestimes_expr )* )
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:592:4: timestimes_expr ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? timestimes_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_timestimes_expr_in_plusplus_expr3668);
            timestimes_expr325=timestimes_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, timestimes_expr325.getTree());
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:592:20: ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? timestimes_expr )*
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
            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:592:21: ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? timestimes_expr
            	    {
            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:592:23: ( NL )?
            	    int alt144=2;
            	    int LA144_0 = input.LA(1);

            	    if ( (LA144_0==NL) ) {
            	        alt144=1;
            	    }
            	    switch (alt144) {
            	        case 1 :
            	            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:592:23: NL
            	            {
            	            NL326=(Token)match(input,NL,FOLLOW_NL_in_plusplus_expr3671); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:592:26: ( PLUSPLUS | MINUSMINUS )
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
            	            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:592:27: PLUSPLUS
            	            {
            	            PLUSPLUS327=(Token)match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_plusplus_expr3676); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PLUSPLUS327_tree = (CommonTree)adaptor.create(PLUSPLUS327);
            	            root_0 = (CommonTree)adaptor.becomeRoot(PLUSPLUS327_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:592:37: MINUSMINUS
            	            {
            	            MINUSMINUS328=(Token)match(input,MINUSMINUS,FOLLOW_MINUSMINUS_in_plusplus_expr3679); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            MINUSMINUS328_tree = (CommonTree)adaptor.create(MINUSMINUS328);
            	            root_0 = (CommonTree)adaptor.becomeRoot(MINUSMINUS328_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:592:52: ( NL )?
            	    int alt146=2;
            	    int LA146_0 = input.LA(1);

            	    if ( (LA146_0==NL) ) {
            	        alt146=1;
            	    }
            	    switch (alt146) {
            	        case 1 :
            	            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:592:52: NL
            	            {
            	            NL329=(Token)match(input,NL,FOLLOW_NL_in_plusplus_expr3683); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_timestimes_expr_in_plusplus_expr3687);
            	    timestimes_expr330=timestimes_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, timestimes_expr330.getTree());

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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:594:1: p_plusplus_expr : p_timestimes_expr ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? p_timestimes_expr )* ;
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
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:595:2: ( p_timestimes_expr ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? p_timestimes_expr )* )
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:595:4: p_timestimes_expr ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? p_timestimes_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_timestimes_expr_in_p_plusplus_expr3699);
            p_timestimes_expr331=p_timestimes_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_timestimes_expr331.getTree());
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:595:22: ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? p_timestimes_expr )*
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
            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:595:23: ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? p_timestimes_expr
            	    {
            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:595:25: ( NL )?
            	    int alt148=2;
            	    int LA148_0 = input.LA(1);

            	    if ( (LA148_0==NL) ) {
            	        alt148=1;
            	    }
            	    switch (alt148) {
            	        case 1 :
            	            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:595:25: NL
            	            {
            	            NL332=(Token)match(input,NL,FOLLOW_NL_in_p_plusplus_expr3702); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:595:28: ( PLUSPLUS | MINUSMINUS )
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
            	            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:595:29: PLUSPLUS
            	            {
            	            PLUSPLUS333=(Token)match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_p_plusplus_expr3707); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PLUSPLUS333_tree = (CommonTree)adaptor.create(PLUSPLUS333);
            	            root_0 = (CommonTree)adaptor.becomeRoot(PLUSPLUS333_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:595:39: MINUSMINUS
            	            {
            	            MINUSMINUS334=(Token)match(input,MINUSMINUS,FOLLOW_MINUSMINUS_in_p_plusplus_expr3710); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            MINUSMINUS334_tree = (CommonTree)adaptor.create(MINUSMINUS334);
            	            root_0 = (CommonTree)adaptor.becomeRoot(MINUSMINUS334_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:595:54: ( NL )?
            	    int alt150=2;
            	    int LA150_0 = input.LA(1);

            	    if ( (LA150_0==NL) ) {
            	        alt150=1;
            	    }
            	    switch (alt150) {
            	        case 1 :
            	            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:595:54: NL
            	            {
            	            NL335=(Token)match(input,NL,FOLLOW_NL_in_p_plusplus_expr3714); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_timestimes_expr_in_p_plusplus_expr3718);
            	    p_timestimes_expr336=p_timestimes_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_timestimes_expr336.getTree());

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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:598:1: timestimes_expr : simple_expr ( ( NL )? ( TIMESTIMES ) ( NL )? simple_expr )* ;
    public final babel17Parser.timestimes_expr_return timestimes_expr() throws RecognitionException {
        babel17Parser.timestimes_expr_return retval = new babel17Parser.timestimes_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL338=null;
        Token TIMESTIMES339=null;
        Token NL340=null;
        babel17Parser.simple_expr_return simple_expr337 = null;

        babel17Parser.simple_expr_return simple_expr341 = null;


        CommonTree NL338_tree=null;
        CommonTree TIMESTIMES339_tree=null;
        CommonTree NL340_tree=null;

        try {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:599:2: ( simple_expr ( ( NL )? ( TIMESTIMES ) ( NL )? simple_expr )* )
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:599:4: simple_expr ( ( NL )? ( TIMESTIMES ) ( NL )? simple_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_simple_expr_in_timestimes_expr3730);
            simple_expr337=simple_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, simple_expr337.getTree());
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:599:16: ( ( NL )? ( TIMESTIMES ) ( NL )? simple_expr )*
            loop154:
            do {
                int alt154=2;
                int LA154_0 = input.LA(1);

                if ( (LA154_0==NL) ) {
                    int LA154_1 = input.LA(2);

                    if ( (LA154_1==TIMESTIMES) ) {
                        alt154=1;
                    }


                }
                else if ( (LA154_0==TIMESTIMES) ) {
                    alt154=1;
                }


                switch (alt154) {
            	case 1 :
            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:599:17: ( NL )? ( TIMESTIMES ) ( NL )? simple_expr
            	    {
            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:599:19: ( NL )?
            	    int alt152=2;
            	    int LA152_0 = input.LA(1);

            	    if ( (LA152_0==NL) ) {
            	        alt152=1;
            	    }
            	    switch (alt152) {
            	        case 1 :
            	            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:599:19: NL
            	            {
            	            NL338=(Token)match(input,NL,FOLLOW_NL_in_timestimes_expr3733); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:599:22: ( TIMESTIMES )
            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:599:23: TIMESTIMES
            	    {
            	    TIMESTIMES339=(Token)match(input,TIMESTIMES,FOLLOW_TIMESTIMES_in_timestimes_expr3738); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    TIMESTIMES339_tree = (CommonTree)adaptor.create(TIMESTIMES339);
            	    root_0 = (CommonTree)adaptor.becomeRoot(TIMESTIMES339_tree, root_0);
            	    }

            	    }

            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:599:38: ( NL )?
            	    int alt153=2;
            	    int LA153_0 = input.LA(1);

            	    if ( (LA153_0==NL) ) {
            	        alt153=1;
            	    }
            	    switch (alt153) {
            	        case 1 :
            	            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:599:38: NL
            	            {
            	            NL340=(Token)match(input,NL,FOLLOW_NL_in_timestimes_expr3742); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_simple_expr_in_timestimes_expr3746);
            	    simple_expr341=simple_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, simple_expr341.getTree());

            	    }
            	    break;

            	default :
            	    break loop154;
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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:601:1: p_timestimes_expr : p_simple_expr ( ( NL )? ( TIMESTIMES ) ( NL )? p_simple_expr )* ;
    public final babel17Parser.p_timestimes_expr_return p_timestimes_expr() throws RecognitionException {
        babel17Parser.p_timestimes_expr_return retval = new babel17Parser.p_timestimes_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL343=null;
        Token TIMESTIMES344=null;
        Token NL345=null;
        babel17Parser.p_simple_expr_return p_simple_expr342 = null;

        babel17Parser.p_simple_expr_return p_simple_expr346 = null;


        CommonTree NL343_tree=null;
        CommonTree TIMESTIMES344_tree=null;
        CommonTree NL345_tree=null;

        try {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:602:2: ( p_simple_expr ( ( NL )? ( TIMESTIMES ) ( NL )? p_simple_expr )* )
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:602:4: p_simple_expr ( ( NL )? ( TIMESTIMES ) ( NL )? p_simple_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_simple_expr_in_p_timestimes_expr3759);
            p_simple_expr342=p_simple_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_simple_expr342.getTree());
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:602:18: ( ( NL )? ( TIMESTIMES ) ( NL )? p_simple_expr )*
            loop157:
            do {
                int alt157=2;
                int LA157_0 = input.LA(1);

                if ( (LA157_0==NL) ) {
                    int LA157_1 = input.LA(2);

                    if ( (LA157_1==TIMESTIMES) ) {
                        alt157=1;
                    }


                }
                else if ( (LA157_0==TIMESTIMES) ) {
                    alt157=1;
                }


                switch (alt157) {
            	case 1 :
            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:602:19: ( NL )? ( TIMESTIMES ) ( NL )? p_simple_expr
            	    {
            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:602:21: ( NL )?
            	    int alt155=2;
            	    int LA155_0 = input.LA(1);

            	    if ( (LA155_0==NL) ) {
            	        alt155=1;
            	    }
            	    switch (alt155) {
            	        case 1 :
            	            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:602:21: NL
            	            {
            	            NL343=(Token)match(input,NL,FOLLOW_NL_in_p_timestimes_expr3762); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:602:24: ( TIMESTIMES )
            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:602:25: TIMESTIMES
            	    {
            	    TIMESTIMES344=(Token)match(input,TIMESTIMES,FOLLOW_TIMESTIMES_in_p_timestimes_expr3767); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    TIMESTIMES344_tree = (CommonTree)adaptor.create(TIMESTIMES344);
            	    root_0 = (CommonTree)adaptor.becomeRoot(TIMESTIMES344_tree, root_0);
            	    }

            	    }

            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:602:40: ( NL )?
            	    int alt156=2;
            	    int LA156_0 = input.LA(1);

            	    if ( (LA156_0==NL) ) {
            	        alt156=1;
            	    }
            	    switch (alt156) {
            	        case 1 :
            	            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:602:40: NL
            	            {
            	            NL345=(Token)match(input,NL,FOLLOW_NL_in_p_timestimes_expr3771); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_simple_expr_in_p_timestimes_expr3775);
            	    p_simple_expr346=p_simple_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_simple_expr346.getTree());

            	    }
            	    break;

            	default :
            	    break loop157;
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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:604:1: simple_expr : cons_expr ;
    public final babel17Parser.simple_expr_return simple_expr() throws RecognitionException {
        babel17Parser.simple_expr_return retval = new babel17Parser.simple_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.cons_expr_return cons_expr347 = null;



        try {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:605:2: ( cons_expr )
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:605:4: cons_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_cons_expr_in_simple_expr3786);
            cons_expr347=cons_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, cons_expr347.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:607:1: p_simple_expr : p_cons_expr ;
    public final babel17Parser.p_simple_expr_return p_simple_expr() throws RecognitionException {
        babel17Parser.p_simple_expr_return retval = new babel17Parser.p_simple_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.p_cons_expr_return p_cons_expr348 = null;



        try {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:608:2: ( p_cons_expr )
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:608:4: p_cons_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_cons_expr_in_p_simple_expr3795);
            p_cons_expr348=p_cons_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_cons_expr348.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:610:1: cons_expr : to_expr ( ( NL )? token_DOUBLE_COLON ( NL )? to_expr )* -> ^( LIST_CONS ( to_expr )* ) ;
    public final babel17Parser.cons_expr_return cons_expr() throws RecognitionException {
        babel17Parser.cons_expr_return retval = new babel17Parser.cons_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL350=null;
        Token NL352=null;
        babel17Parser.to_expr_return to_expr349 = null;

        babel17Parser.token_DOUBLE_COLON_return token_DOUBLE_COLON351 = null;

        babel17Parser.to_expr_return to_expr353 = null;


        CommonTree NL350_tree=null;
        CommonTree NL352_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_to_expr=new RewriteRuleSubtreeStream(adaptor,"rule to_expr");
        RewriteRuleSubtreeStream stream_token_DOUBLE_COLON=new RewriteRuleSubtreeStream(adaptor,"rule token_DOUBLE_COLON");
        try {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:611:2: ( to_expr ( ( NL )? token_DOUBLE_COLON ( NL )? to_expr )* -> ^( LIST_CONS ( to_expr )* ) )
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:611:4: to_expr ( ( NL )? token_DOUBLE_COLON ( NL )? to_expr )*
            {
            pushFollow(FOLLOW_to_expr_in_cons_expr3804);
            to_expr349=to_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_to_expr.add(to_expr349.getTree());
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:611:12: ( ( NL )? token_DOUBLE_COLON ( NL )? to_expr )*
            loop160:
            do {
                int alt160=2;
                int LA160_0 = input.LA(1);

                if ( (LA160_0==NL) ) {
                    int LA160_1 = input.LA(2);

                    if ( ((LA160_1>=A_DOUBLE_COLON && LA160_1<=U_DOUBLE_COLON)) ) {
                        alt160=1;
                    }


                }
                else if ( ((LA160_0>=A_DOUBLE_COLON && LA160_0<=U_DOUBLE_COLON)) ) {
                    alt160=1;
                }


                switch (alt160) {
            	case 1 :
            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:611:13: ( NL )? token_DOUBLE_COLON ( NL )? to_expr
            	    {
            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:611:13: ( NL )?
            	    int alt158=2;
            	    int LA158_0 = input.LA(1);

            	    if ( (LA158_0==NL) ) {
            	        alt158=1;
            	    }
            	    switch (alt158) {
            	        case 1 :
            	            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:611:13: NL
            	            {
            	            NL350=(Token)match(input,NL,FOLLOW_NL_in_cons_expr3807); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL350);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_token_DOUBLE_COLON_in_cons_expr3810);
            	    token_DOUBLE_COLON351=token_DOUBLE_COLON();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_token_DOUBLE_COLON.add(token_DOUBLE_COLON351.getTree());
            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:611:36: ( NL )?
            	    int alt159=2;
            	    int LA159_0 = input.LA(1);

            	    if ( (LA159_0==NL) ) {
            	        alt159=1;
            	    }
            	    switch (alt159) {
            	        case 1 :
            	            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:611:36: NL
            	            {
            	            NL352=(Token)match(input,NL,FOLLOW_NL_in_cons_expr3812); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL352);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_to_expr_in_cons_expr3815);
            	    to_expr353=to_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_to_expr.add(to_expr353.getTree());

            	    }
            	    break;

            	default :
            	    break loop160;
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
            // 611:50: -> ^( LIST_CONS ( to_expr )* )
            {
                // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:611:53: ^( LIST_CONS ( to_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LIST_CONS, "LIST_CONS"), root_1);

                // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:611:65: ( to_expr )*
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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:613:1: p_cons_expr : p_to_expr ( ( NL )? token_DOUBLE_COLON ( NL )? p_to_expr )* -> ^( LIST_CONS ( p_to_expr )* ) ;
    public final babel17Parser.p_cons_expr_return p_cons_expr() throws RecognitionException {
        babel17Parser.p_cons_expr_return retval = new babel17Parser.p_cons_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL355=null;
        Token NL357=null;
        babel17Parser.p_to_expr_return p_to_expr354 = null;

        babel17Parser.token_DOUBLE_COLON_return token_DOUBLE_COLON356 = null;

        babel17Parser.p_to_expr_return p_to_expr358 = null;


        CommonTree NL355_tree=null;
        CommonTree NL357_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_p_to_expr=new RewriteRuleSubtreeStream(adaptor,"rule p_to_expr");
        RewriteRuleSubtreeStream stream_token_DOUBLE_COLON=new RewriteRuleSubtreeStream(adaptor,"rule token_DOUBLE_COLON");
        try {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:614:2: ( p_to_expr ( ( NL )? token_DOUBLE_COLON ( NL )? p_to_expr )* -> ^( LIST_CONS ( p_to_expr )* ) )
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:614:4: p_to_expr ( ( NL )? token_DOUBLE_COLON ( NL )? p_to_expr )*
            {
            pushFollow(FOLLOW_p_to_expr_in_p_cons_expr3835);
            p_to_expr354=p_to_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_p_to_expr.add(p_to_expr354.getTree());
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:614:14: ( ( NL )? token_DOUBLE_COLON ( NL )? p_to_expr )*
            loop163:
            do {
                int alt163=2;
                int LA163_0 = input.LA(1);

                if ( (LA163_0==NL) ) {
                    int LA163_1 = input.LA(2);

                    if ( ((LA163_1>=A_DOUBLE_COLON && LA163_1<=U_DOUBLE_COLON)) ) {
                        alt163=1;
                    }


                }
                else if ( ((LA163_0>=A_DOUBLE_COLON && LA163_0<=U_DOUBLE_COLON)) ) {
                    alt163=1;
                }


                switch (alt163) {
            	case 1 :
            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:614:15: ( NL )? token_DOUBLE_COLON ( NL )? p_to_expr
            	    {
            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:614:15: ( NL )?
            	    int alt161=2;
            	    int LA161_0 = input.LA(1);

            	    if ( (LA161_0==NL) ) {
            	        alt161=1;
            	    }
            	    switch (alt161) {
            	        case 1 :
            	            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:614:15: NL
            	            {
            	            NL355=(Token)match(input,NL,FOLLOW_NL_in_p_cons_expr3838); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL355);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_token_DOUBLE_COLON_in_p_cons_expr3841);
            	    token_DOUBLE_COLON356=token_DOUBLE_COLON();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_token_DOUBLE_COLON.add(token_DOUBLE_COLON356.getTree());
            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:614:38: ( NL )?
            	    int alt162=2;
            	    int LA162_0 = input.LA(1);

            	    if ( (LA162_0==NL) ) {
            	        alt162=1;
            	    }
            	    switch (alt162) {
            	        case 1 :
            	            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:614:38: NL
            	            {
            	            NL357=(Token)match(input,NL,FOLLOW_NL_in_p_cons_expr3843); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL357);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_to_expr_in_p_cons_expr3846);
            	    p_to_expr358=p_to_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_p_to_expr.add(p_to_expr358.getTree());

            	    }
            	    break;

            	default :
            	    break loop163;
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
            // 614:54: -> ^( LIST_CONS ( p_to_expr )* )
            {
                // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:614:57: ^( LIST_CONS ( p_to_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LIST_CONS, "LIST_CONS"), root_1);

                // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:614:69: ( p_to_expr )*
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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:617:1: to_expr : arith_plus_expr ( ( NL )? ( L_to | L_downto ) ( NL )? arith_plus_expr )? ;
    public final babel17Parser.to_expr_return to_expr() throws RecognitionException {
        babel17Parser.to_expr_return retval = new babel17Parser.to_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL360=null;
        Token L_to361=null;
        Token L_downto362=null;
        Token NL363=null;
        babel17Parser.arith_plus_expr_return arith_plus_expr359 = null;

        babel17Parser.arith_plus_expr_return arith_plus_expr364 = null;


        CommonTree NL360_tree=null;
        CommonTree L_to361_tree=null;
        CommonTree L_downto362_tree=null;
        CommonTree NL363_tree=null;

        try {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:617:9: ( arith_plus_expr ( ( NL )? ( L_to | L_downto ) ( NL )? arith_plus_expr )? )
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:617:11: arith_plus_expr ( ( NL )? ( L_to | L_downto ) ( NL )? arith_plus_expr )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_arith_plus_expr_in_to_expr3866);
            arith_plus_expr359=arith_plus_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, arith_plus_expr359.getTree());
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:617:27: ( ( NL )? ( L_to | L_downto ) ( NL )? arith_plus_expr )?
            int alt167=2;
            int LA167_0 = input.LA(1);

            if ( (LA167_0==NL) ) {
                int LA167_1 = input.LA(2);

                if ( ((LA167_1>=L_to && LA167_1<=L_downto)) ) {
                    alt167=1;
                }
            }
            else if ( ((LA167_0>=L_to && LA167_0<=L_downto)) ) {
                alt167=1;
            }
            switch (alt167) {
                case 1 :
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:617:28: ( NL )? ( L_to | L_downto ) ( NL )? arith_plus_expr
                    {
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:617:30: ( NL )?
                    int alt164=2;
                    int LA164_0 = input.LA(1);

                    if ( (LA164_0==NL) ) {
                        alt164=1;
                    }
                    switch (alt164) {
                        case 1 :
                            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:617:30: NL
                            {
                            NL360=(Token)match(input,NL,FOLLOW_NL_in_to_expr3869); if (state.failed) return retval;

                            }
                            break;

                    }

                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:617:33: ( L_to | L_downto )
                    int alt165=2;
                    int LA165_0 = input.LA(1);

                    if ( (LA165_0==L_to) ) {
                        alt165=1;
                    }
                    else if ( (LA165_0==L_downto) ) {
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
                            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:617:34: L_to
                            {
                            L_to361=(Token)match(input,L_to,FOLLOW_L_to_in_to_expr3874); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            L_to361_tree = (CommonTree)adaptor.create(L_to361);
                            root_0 = (CommonTree)adaptor.becomeRoot(L_to361_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:617:41: L_downto
                            {
                            L_downto362=(Token)match(input,L_downto,FOLLOW_L_downto_in_to_expr3878); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            L_downto362_tree = (CommonTree)adaptor.create(L_downto362);
                            root_0 = (CommonTree)adaptor.becomeRoot(L_downto362_tree, root_0);
                            }

                            }
                            break;

                    }

                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:617:54: ( NL )?
                    int alt166=2;
                    int LA166_0 = input.LA(1);

                    if ( (LA166_0==NL) ) {
                        alt166=1;
                    }
                    switch (alt166) {
                        case 1 :
                            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:617:54: NL
                            {
                            NL363=(Token)match(input,NL,FOLLOW_NL_in_to_expr3882); if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_arith_plus_expr_in_to_expr3886);
                    arith_plus_expr364=arith_plus_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arith_plus_expr364.getTree());

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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:619:1: p_to_expr : p_arith_plus_expr ( ( NL )? ( L_to | L_downto ) ( NL )? p_arith_plus_expr )? ;
    public final babel17Parser.p_to_expr_return p_to_expr() throws RecognitionException {
        babel17Parser.p_to_expr_return retval = new babel17Parser.p_to_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL366=null;
        Token L_to367=null;
        Token L_downto368=null;
        Token NL369=null;
        babel17Parser.p_arith_plus_expr_return p_arith_plus_expr365 = null;

        babel17Parser.p_arith_plus_expr_return p_arith_plus_expr370 = null;


        CommonTree NL366_tree=null;
        CommonTree L_to367_tree=null;
        CommonTree L_downto368_tree=null;
        CommonTree NL369_tree=null;

        try {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:620:2: ( p_arith_plus_expr ( ( NL )? ( L_to | L_downto ) ( NL )? p_arith_plus_expr )? )
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:620:4: p_arith_plus_expr ( ( NL )? ( L_to | L_downto ) ( NL )? p_arith_plus_expr )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_arith_plus_expr_in_p_to_expr3899);
            p_arith_plus_expr365=p_arith_plus_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_arith_plus_expr365.getTree());
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:620:22: ( ( NL )? ( L_to | L_downto ) ( NL )? p_arith_plus_expr )?
            int alt171=2;
            int LA171_0 = input.LA(1);

            if ( (LA171_0==NL) ) {
                int LA171_1 = input.LA(2);

                if ( ((LA171_1>=L_to && LA171_1<=L_downto)) ) {
                    alt171=1;
                }
            }
            else if ( ((LA171_0>=L_to && LA171_0<=L_downto)) ) {
                alt171=1;
            }
            switch (alt171) {
                case 1 :
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:620:23: ( NL )? ( L_to | L_downto ) ( NL )? p_arith_plus_expr
                    {
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:620:25: ( NL )?
                    int alt168=2;
                    int LA168_0 = input.LA(1);

                    if ( (LA168_0==NL) ) {
                        alt168=1;
                    }
                    switch (alt168) {
                        case 1 :
                            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:620:25: NL
                            {
                            NL366=(Token)match(input,NL,FOLLOW_NL_in_p_to_expr3902); if (state.failed) return retval;

                            }
                            break;

                    }

                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:620:28: ( L_to | L_downto )
                    int alt169=2;
                    int LA169_0 = input.LA(1);

                    if ( (LA169_0==L_to) ) {
                        alt169=1;
                    }
                    else if ( (LA169_0==L_downto) ) {
                        alt169=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 169, 0, input);

                        throw nvae;
                    }
                    switch (alt169) {
                        case 1 :
                            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:620:29: L_to
                            {
                            L_to367=(Token)match(input,L_to,FOLLOW_L_to_in_p_to_expr3907); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            L_to367_tree = (CommonTree)adaptor.create(L_to367);
                            root_0 = (CommonTree)adaptor.becomeRoot(L_to367_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:620:36: L_downto
                            {
                            L_downto368=(Token)match(input,L_downto,FOLLOW_L_downto_in_p_to_expr3911); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            L_downto368_tree = (CommonTree)adaptor.create(L_downto368);
                            root_0 = (CommonTree)adaptor.becomeRoot(L_downto368_tree, root_0);
                            }

                            }
                            break;

                    }

                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:620:49: ( NL )?
                    int alt170=2;
                    int LA170_0 = input.LA(1);

                    if ( (LA170_0==NL) ) {
                        alt170=1;
                    }
                    switch (alt170) {
                        case 1 :
                            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:620:49: NL
                            {
                            NL369=(Token)match(input,NL,FOLLOW_NL_in_p_to_expr3915); if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_p_arith_plus_expr_in_p_to_expr3919);
                    p_arith_plus_expr370=p_arith_plus_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_arith_plus_expr370.getTree());

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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:622:1: arith_plus_expr : arith_uminus_expr ( ( ( NL )? PLUS | MINUS ) ( NL )? arith_uminus_expr )* ;
    public final babel17Parser.arith_plus_expr_return arith_plus_expr() throws RecognitionException {
        babel17Parser.arith_plus_expr_return retval = new babel17Parser.arith_plus_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL372=null;
        Token PLUS373=null;
        Token MINUS374=null;
        Token NL375=null;
        babel17Parser.arith_uminus_expr_return arith_uminus_expr371 = null;

        babel17Parser.arith_uminus_expr_return arith_uminus_expr376 = null;


        CommonTree NL372_tree=null;
        CommonTree PLUS373_tree=null;
        CommonTree MINUS374_tree=null;
        CommonTree NL375_tree=null;

        try {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:623:2: ( arith_uminus_expr ( ( ( NL )? PLUS | MINUS ) ( NL )? arith_uminus_expr )* )
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:623:4: arith_uminus_expr ( ( ( NL )? PLUS | MINUS ) ( NL )? arith_uminus_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_arith_uminus_expr_in_arith_plus_expr3931);
            arith_uminus_expr371=arith_uminus_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, arith_uminus_expr371.getTree());
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:623:22: ( ( ( NL )? PLUS | MINUS ) ( NL )? arith_uminus_expr )*
            loop175:
            do {
                int alt175=2;
                int LA175_0 = input.LA(1);

                if ( (LA175_0==NL) ) {
                    int LA175_1 = input.LA(2);

                    if ( (LA175_1==PLUS) ) {
                        alt175=1;
                    }


                }
                else if ( ((LA175_0>=PLUS && LA175_0<=MINUS)) ) {
                    alt175=1;
                }


                switch (alt175) {
            	case 1 :
            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:623:23: ( ( NL )? PLUS | MINUS ) ( NL )? arith_uminus_expr
            	    {
            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:623:23: ( ( NL )? PLUS | MINUS )
            	    int alt173=2;
            	    int LA173_0 = input.LA(1);

            	    if ( (LA173_0==PLUS||LA173_0==NL) ) {
            	        alt173=1;
            	    }
            	    else if ( (LA173_0==MINUS) ) {
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
            	            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:623:24: ( NL )? PLUS
            	            {
            	            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:623:26: ( NL )?
            	            int alt172=2;
            	            int LA172_0 = input.LA(1);

            	            if ( (LA172_0==NL) ) {
            	                alt172=1;
            	            }
            	            switch (alt172) {
            	                case 1 :
            	                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:623:26: NL
            	                    {
            	                    NL372=(Token)match(input,NL,FOLLOW_NL_in_arith_plus_expr3935); if (state.failed) return retval;

            	                    }
            	                    break;

            	            }

            	            PLUS373=(Token)match(input,PLUS,FOLLOW_PLUS_in_arith_plus_expr3939); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PLUS373_tree = (CommonTree)adaptor.create(PLUS373);
            	            root_0 = (CommonTree)adaptor.becomeRoot(PLUS373_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:623:37: MINUS
            	            {
            	            MINUS374=(Token)match(input,MINUS,FOLLOW_MINUS_in_arith_plus_expr3944); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            MINUS374_tree = (CommonTree)adaptor.create(MINUS374);
            	            root_0 = (CommonTree)adaptor.becomeRoot(MINUS374_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:623:47: ( NL )?
            	    int alt174=2;
            	    int LA174_0 = input.LA(1);

            	    if ( (LA174_0==NL) ) {
            	        alt174=1;
            	    }
            	    switch (alt174) {
            	        case 1 :
            	            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:623:47: NL
            	            {
            	            NL375=(Token)match(input,NL,FOLLOW_NL_in_arith_plus_expr3948); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_arith_uminus_expr_in_arith_plus_expr3952);
            	    arith_uminus_expr376=arith_uminus_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, arith_uminus_expr376.getTree());

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
    // $ANTLR end "arith_plus_expr"

    public static class p_arith_plus_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "p_arith_plus_expr"
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:625:1: p_arith_plus_expr : p_arith_uminus_expr ( ( NL )? ( PLUS | MINUS ) ( NL )? p_arith_uminus_expr )* ;
    public final babel17Parser.p_arith_plus_expr_return p_arith_plus_expr() throws RecognitionException {
        babel17Parser.p_arith_plus_expr_return retval = new babel17Parser.p_arith_plus_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL378=null;
        Token set379=null;
        Token NL380=null;
        babel17Parser.p_arith_uminus_expr_return p_arith_uminus_expr377 = null;

        babel17Parser.p_arith_uminus_expr_return p_arith_uminus_expr381 = null;


        CommonTree NL378_tree=null;
        CommonTree set379_tree=null;
        CommonTree NL380_tree=null;

        try {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:626:2: ( p_arith_uminus_expr ( ( NL )? ( PLUS | MINUS ) ( NL )? p_arith_uminus_expr )* )
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:626:4: p_arith_uminus_expr ( ( NL )? ( PLUS | MINUS ) ( NL )? p_arith_uminus_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_arith_uminus_expr_in_p_arith_plus_expr3963);
            p_arith_uminus_expr377=p_arith_uminus_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_arith_uminus_expr377.getTree());
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:626:24: ( ( NL )? ( PLUS | MINUS ) ( NL )? p_arith_uminus_expr )*
            loop178:
            do {
                int alt178=2;
                int LA178_0 = input.LA(1);

                if ( (LA178_0==NL) ) {
                    int LA178_1 = input.LA(2);

                    if ( ((LA178_1>=PLUS && LA178_1<=MINUS)) ) {
                        alt178=1;
                    }


                }
                else if ( ((LA178_0>=PLUS && LA178_0<=MINUS)) ) {
                    alt178=1;
                }


                switch (alt178) {
            	case 1 :
            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:626:25: ( NL )? ( PLUS | MINUS ) ( NL )? p_arith_uminus_expr
            	    {
            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:626:27: ( NL )?
            	    int alt176=2;
            	    int LA176_0 = input.LA(1);

            	    if ( (LA176_0==NL) ) {
            	        alt176=1;
            	    }
            	    switch (alt176) {
            	        case 1 :
            	            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:626:27: NL
            	            {
            	            NL378=(Token)match(input,NL,FOLLOW_NL_in_p_arith_plus_expr3966); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    set379=(Token)input.LT(1);
            	    set379=(Token)input.LT(1);
            	    if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set379), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:626:48: ( NL )?
            	    int alt177=2;
            	    int LA177_0 = input.LA(1);

            	    if ( (LA177_0==NL) ) {
            	        alt177=1;
            	    }
            	    switch (alt177) {
            	        case 1 :
            	            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:626:48: NL
            	            {
            	            NL380=(Token)match(input,NL,FOLLOW_NL_in_p_arith_plus_expr3979); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_arith_uminus_expr_in_p_arith_plus_expr3983);
            	    p_arith_uminus_expr381=p_arith_uminus_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_arith_uminus_expr381.getTree());

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
    // $ANTLR end "p_arith_plus_expr"

    public static class arith_uminus_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arith_uminus_expr"
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:628:1: arith_uminus_expr : ( MINUS ( NL )? arith_mult_expr -> ^( UMINUS arith_mult_expr ) | arith_mult_expr );
    public final babel17Parser.arith_uminus_expr_return arith_uminus_expr() throws RecognitionException {
        babel17Parser.arith_uminus_expr_return retval = new babel17Parser.arith_uminus_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token MINUS382=null;
        Token NL383=null;
        babel17Parser.arith_mult_expr_return arith_mult_expr384 = null;

        babel17Parser.arith_mult_expr_return arith_mult_expr385 = null;


        CommonTree MINUS382_tree=null;
        CommonTree NL383_tree=null;
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_arith_mult_expr=new RewriteRuleSubtreeStream(adaptor,"rule arith_mult_expr");
        try {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:629:2: ( MINUS ( NL )? arith_mult_expr -> ^( UMINUS arith_mult_expr ) | arith_mult_expr )
            int alt180=2;
            int LA180_0 = input.LA(1);

            if ( (LA180_0==MINUS) ) {
                alt180=1;
            }
            else if ( (LA180_0==L_begin||(LA180_0>=L_with && LA180_0<=L_if)||(LA180_0>=L_while && LA180_0<=L_for)||LA180_0==L_match||(LA180_0>=A_infinity && LA180_0<=U_infinity)||LA180_0==L_root||(LA180_0>=L_true && LA180_0<=L_here)||LA180_0==MODULE_KEY||(LA180_0>=Constr && LA180_0<=Num)||(LA180_0>=String && LA180_0<=ROUND_BRACKET_OPEN)||LA180_0==SQUARE_BRACKET_OPEN||LA180_0==CURLY_BRACKET_OPEN) ) {
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
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:629:4: MINUS ( NL )? arith_mult_expr
                    {
                    MINUS382=(Token)match(input,MINUS,FOLLOW_MINUS_in_arith_uminus_expr3996); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(MINUS382);

                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:629:10: ( NL )?
                    int alt179=2;
                    int LA179_0 = input.LA(1);

                    if ( (LA179_0==NL) ) {
                        alt179=1;
                    }
                    switch (alt179) {
                        case 1 :
                            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:629:10: NL
                            {
                            NL383=(Token)match(input,NL,FOLLOW_NL_in_arith_uminus_expr3998); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL383);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_arith_mult_expr_in_arith_uminus_expr4001);
                    arith_mult_expr384=arith_mult_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_arith_mult_expr.add(arith_mult_expr384.getTree());


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
                    // 629:30: -> ^( UMINUS arith_mult_expr )
                    {
                        // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:629:33: ^( UMINUS arith_mult_expr )
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
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:630:4: arith_mult_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_arith_mult_expr_in_arith_uminus_expr4014);
                    arith_mult_expr385=arith_mult_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arith_mult_expr385.getTree());

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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:632:1: p_arith_uminus_expr : ( MINUS ( NL )? p_arith_mult_expr -> ^( UMINUS p_arith_mult_expr ) | p_arith_mult_expr );
    public final babel17Parser.p_arith_uminus_expr_return p_arith_uminus_expr() throws RecognitionException {
        babel17Parser.p_arith_uminus_expr_return retval = new babel17Parser.p_arith_uminus_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token MINUS386=null;
        Token NL387=null;
        babel17Parser.p_arith_mult_expr_return p_arith_mult_expr388 = null;

        babel17Parser.p_arith_mult_expr_return p_arith_mult_expr389 = null;


        CommonTree MINUS386_tree=null;
        CommonTree NL387_tree=null;
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_p_arith_mult_expr=new RewriteRuleSubtreeStream(adaptor,"rule p_arith_mult_expr");
        try {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:633:2: ( MINUS ( NL )? p_arith_mult_expr -> ^( UMINUS p_arith_mult_expr ) | p_arith_mult_expr )
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
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:633:4: MINUS ( NL )? p_arith_mult_expr
                    {
                    MINUS386=(Token)match(input,MINUS,FOLLOW_MINUS_in_p_arith_uminus_expr4025); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(MINUS386);

                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:633:10: ( NL )?
                    int alt181=2;
                    int LA181_0 = input.LA(1);

                    if ( (LA181_0==NL) ) {
                        alt181=1;
                    }
                    switch (alt181) {
                        case 1 :
                            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:633:10: NL
                            {
                            NL387=(Token)match(input,NL,FOLLOW_NL_in_p_arith_uminus_expr4027); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL387);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_p_arith_mult_expr_in_p_arith_uminus_expr4030);
                    p_arith_mult_expr388=p_arith_mult_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_p_arith_mult_expr.add(p_arith_mult_expr388.getTree());


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
                    // 633:32: -> ^( UMINUS p_arith_mult_expr )
                    {
                        // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:633:35: ^( UMINUS p_arith_mult_expr )
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
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:634:4: p_arith_mult_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_p_arith_mult_expr_in_p_arith_uminus_expr4043);
                    p_arith_mult_expr389=p_arith_mult_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_arith_mult_expr389.getTree());

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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:636:1: arith_mult_expr : arith_pow_expr ( ( NL )? ( TIMES | DIV | MOD ) ( NL )? arith_pow_expr )* ;
    public final babel17Parser.arith_mult_expr_return arith_mult_expr() throws RecognitionException {
        babel17Parser.arith_mult_expr_return retval = new babel17Parser.arith_mult_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL391=null;
        Token set392=null;
        Token NL393=null;
        babel17Parser.arith_pow_expr_return arith_pow_expr390 = null;

        babel17Parser.arith_pow_expr_return arith_pow_expr394 = null;


        CommonTree NL391_tree=null;
        CommonTree set392_tree=null;
        CommonTree NL393_tree=null;

        try {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:637:2: ( arith_pow_expr ( ( NL )? ( TIMES | DIV | MOD ) ( NL )? arith_pow_expr )* )
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:637:4: arith_pow_expr ( ( NL )? ( TIMES | DIV | MOD ) ( NL )? arith_pow_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_arith_pow_expr_in_arith_mult_expr4052);
            arith_pow_expr390=arith_pow_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, arith_pow_expr390.getTree());
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:637:19: ( ( NL )? ( TIMES | DIV | MOD ) ( NL )? arith_pow_expr )*
            loop185:
            do {
                int alt185=2;
                int LA185_0 = input.LA(1);

                if ( (LA185_0==NL) ) {
                    int LA185_1 = input.LA(2);

                    if ( ((LA185_1>=TIMES && LA185_1<=MOD)) ) {
                        alt185=1;
                    }


                }
                else if ( ((LA185_0>=TIMES && LA185_0<=MOD)) ) {
                    alt185=1;
                }


                switch (alt185) {
            	case 1 :
            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:637:20: ( NL )? ( TIMES | DIV | MOD ) ( NL )? arith_pow_expr
            	    {
            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:637:22: ( NL )?
            	    int alt183=2;
            	    int LA183_0 = input.LA(1);

            	    if ( (LA183_0==NL) ) {
            	        alt183=1;
            	    }
            	    switch (alt183) {
            	        case 1 :
            	            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:637:22: NL
            	            {
            	            NL391=(Token)match(input,NL,FOLLOW_NL_in_arith_mult_expr4055); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    set392=(Token)input.LT(1);
            	    set392=(Token)input.LT(1);
            	    if ( (input.LA(1)>=TIMES && input.LA(1)<=MOD) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set392), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:637:48: ( NL )?
            	    int alt184=2;
            	    int LA184_0 = input.LA(1);

            	    if ( (LA184_0==NL) ) {
            	        alt184=1;
            	    }
            	    switch (alt184) {
            	        case 1 :
            	            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:637:48: NL
            	            {
            	            NL393=(Token)match(input,NL,FOLLOW_NL_in_arith_mult_expr4072); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_arith_pow_expr_in_arith_mult_expr4076);
            	    arith_pow_expr394=arith_pow_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, arith_pow_expr394.getTree());

            	    }
            	    break;

            	default :
            	    break loop185;
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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:639:1: p_arith_mult_expr : p_arith_pow_expr ( ( NL )? ( TIMES | DIV | MOD ) ( NL )? p_arith_pow_expr )* ;
    public final babel17Parser.p_arith_mult_expr_return p_arith_mult_expr() throws RecognitionException {
        babel17Parser.p_arith_mult_expr_return retval = new babel17Parser.p_arith_mult_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL396=null;
        Token set397=null;
        Token NL398=null;
        babel17Parser.p_arith_pow_expr_return p_arith_pow_expr395 = null;

        babel17Parser.p_arith_pow_expr_return p_arith_pow_expr399 = null;


        CommonTree NL396_tree=null;
        CommonTree set397_tree=null;
        CommonTree NL398_tree=null;

        try {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:640:2: ( p_arith_pow_expr ( ( NL )? ( TIMES | DIV | MOD ) ( NL )? p_arith_pow_expr )* )
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:640:4: p_arith_pow_expr ( ( NL )? ( TIMES | DIV | MOD ) ( NL )? p_arith_pow_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_arith_pow_expr_in_p_arith_mult_expr4088);
            p_arith_pow_expr395=p_arith_pow_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_arith_pow_expr395.getTree());
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:640:21: ( ( NL )? ( TIMES | DIV | MOD ) ( NL )? p_arith_pow_expr )*
            loop188:
            do {
                int alt188=2;
                int LA188_0 = input.LA(1);

                if ( (LA188_0==NL) ) {
                    int LA188_1 = input.LA(2);

                    if ( ((LA188_1>=TIMES && LA188_1<=MOD)) ) {
                        alt188=1;
                    }


                }
                else if ( ((LA188_0>=TIMES && LA188_0<=MOD)) ) {
                    alt188=1;
                }


                switch (alt188) {
            	case 1 :
            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:640:22: ( NL )? ( TIMES | DIV | MOD ) ( NL )? p_arith_pow_expr
            	    {
            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:640:24: ( NL )?
            	    int alt186=2;
            	    int LA186_0 = input.LA(1);

            	    if ( (LA186_0==NL) ) {
            	        alt186=1;
            	    }
            	    switch (alt186) {
            	        case 1 :
            	            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:640:24: NL
            	            {
            	            NL396=(Token)match(input,NL,FOLLOW_NL_in_p_arith_mult_expr4091); if (state.failed) return retval;

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

            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:640:50: ( NL )?
            	    int alt187=2;
            	    int LA187_0 = input.LA(1);

            	    if ( (LA187_0==NL) ) {
            	        alt187=1;
            	    }
            	    switch (alt187) {
            	        case 1 :
            	            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:640:50: NL
            	            {
            	            NL398=(Token)match(input,NL,FOLLOW_NL_in_p_arith_mult_expr4108); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_arith_pow_expr_in_p_arith_mult_expr4112);
            	    p_arith_pow_expr399=p_arith_pow_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_arith_pow_expr399.getTree());

            	    }
            	    break;

            	default :
            	    break loop188;
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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:642:1: arith_pow_expr : apply_expr ( ( NL )? POW_tok ( NL )? apply_expr )* -> ^( POW ( apply_expr )* ) ;
    public final babel17Parser.arith_pow_expr_return arith_pow_expr() throws RecognitionException {
        babel17Parser.arith_pow_expr_return retval = new babel17Parser.arith_pow_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL401=null;
        Token POW_tok402=null;
        Token NL403=null;
        babel17Parser.apply_expr_return apply_expr400 = null;

        babel17Parser.apply_expr_return apply_expr404 = null;


        CommonTree NL401_tree=null;
        CommonTree POW_tok402_tree=null;
        CommonTree NL403_tree=null;
        RewriteRuleTokenStream stream_POW_tok=new RewriteRuleTokenStream(adaptor,"token POW_tok");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_apply_expr=new RewriteRuleSubtreeStream(adaptor,"rule apply_expr");
        try {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:643:2: ( apply_expr ( ( NL )? POW_tok ( NL )? apply_expr )* -> ^( POW ( apply_expr )* ) )
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:643:4: apply_expr ( ( NL )? POW_tok ( NL )? apply_expr )*
            {
            pushFollow(FOLLOW_apply_expr_in_arith_pow_expr4123);
            apply_expr400=apply_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_apply_expr.add(apply_expr400.getTree());
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:643:15: ( ( NL )? POW_tok ( NL )? apply_expr )*
            loop191:
            do {
                int alt191=2;
                int LA191_0 = input.LA(1);

                if ( (LA191_0==NL) ) {
                    int LA191_1 = input.LA(2);

                    if ( (LA191_1==POW_tok) ) {
                        alt191=1;
                    }


                }
                else if ( (LA191_0==POW_tok) ) {
                    alt191=1;
                }


                switch (alt191) {
            	case 1 :
            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:643:16: ( NL )? POW_tok ( NL )? apply_expr
            	    {
            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:643:16: ( NL )?
            	    int alt189=2;
            	    int LA189_0 = input.LA(1);

            	    if ( (LA189_0==NL) ) {
            	        alt189=1;
            	    }
            	    switch (alt189) {
            	        case 1 :
            	            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:643:16: NL
            	            {
            	            NL401=(Token)match(input,NL,FOLLOW_NL_in_arith_pow_expr4126); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL401);


            	            }
            	            break;

            	    }

            	    POW_tok402=(Token)match(input,POW_tok,FOLLOW_POW_tok_in_arith_pow_expr4129); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_POW_tok.add(POW_tok402);

            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:643:28: ( NL )?
            	    int alt190=2;
            	    int LA190_0 = input.LA(1);

            	    if ( (LA190_0==NL) ) {
            	        alt190=1;
            	    }
            	    switch (alt190) {
            	        case 1 :
            	            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:643:28: NL
            	            {
            	            NL403=(Token)match(input,NL,FOLLOW_NL_in_arith_pow_expr4131); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL403);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_apply_expr_in_arith_pow_expr4134);
            	    apply_expr404=apply_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_apply_expr.add(apply_expr404.getTree());

            	    }
            	    break;

            	default :
            	    break loop191;
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
            // 643:45: -> ^( POW ( apply_expr )* )
            {
                // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:643:48: ^( POW ( apply_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(POW, "POW"), root_1);

                // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:643:54: ( apply_expr )*
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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:645:1: p_arith_pow_expr : p_apply_expr ( ( NL )? POW_tok ( NL )? p_apply_expr )* -> ^( POW ( p_apply_expr )* ) ;
    public final babel17Parser.p_arith_pow_expr_return p_arith_pow_expr() throws RecognitionException {
        babel17Parser.p_arith_pow_expr_return retval = new babel17Parser.p_arith_pow_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL406=null;
        Token POW_tok407=null;
        Token NL408=null;
        babel17Parser.p_apply_expr_return p_apply_expr405 = null;

        babel17Parser.p_apply_expr_return p_apply_expr409 = null;


        CommonTree NL406_tree=null;
        CommonTree POW_tok407_tree=null;
        CommonTree NL408_tree=null;
        RewriteRuleTokenStream stream_POW_tok=new RewriteRuleTokenStream(adaptor,"token POW_tok");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_p_apply_expr=new RewriteRuleSubtreeStream(adaptor,"rule p_apply_expr");
        try {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:646:2: ( p_apply_expr ( ( NL )? POW_tok ( NL )? p_apply_expr )* -> ^( POW ( p_apply_expr )* ) )
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:646:4: p_apply_expr ( ( NL )? POW_tok ( NL )? p_apply_expr )*
            {
            pushFollow(FOLLOW_p_apply_expr_in_p_arith_pow_expr4155);
            p_apply_expr405=p_apply_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_p_apply_expr.add(p_apply_expr405.getTree());
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:646:17: ( ( NL )? POW_tok ( NL )? p_apply_expr )*
            loop194:
            do {
                int alt194=2;
                int LA194_0 = input.LA(1);

                if ( (LA194_0==NL) ) {
                    int LA194_1 = input.LA(2);

                    if ( (LA194_1==POW_tok) ) {
                        alt194=1;
                    }


                }
                else if ( (LA194_0==POW_tok) ) {
                    alt194=1;
                }


                switch (alt194) {
            	case 1 :
            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:646:18: ( NL )? POW_tok ( NL )? p_apply_expr
            	    {
            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:646:18: ( NL )?
            	    int alt192=2;
            	    int LA192_0 = input.LA(1);

            	    if ( (LA192_0==NL) ) {
            	        alt192=1;
            	    }
            	    switch (alt192) {
            	        case 1 :
            	            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:646:18: NL
            	            {
            	            NL406=(Token)match(input,NL,FOLLOW_NL_in_p_arith_pow_expr4158); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL406);


            	            }
            	            break;

            	    }

            	    POW_tok407=(Token)match(input,POW_tok,FOLLOW_POW_tok_in_p_arith_pow_expr4161); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_POW_tok.add(POW_tok407);

            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:646:30: ( NL )?
            	    int alt193=2;
            	    int LA193_0 = input.LA(1);

            	    if ( (LA193_0==NL) ) {
            	        alt193=1;
            	    }
            	    switch (alt193) {
            	        case 1 :
            	            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:646:30: NL
            	            {
            	            NL408=(Token)match(input,NL,FOLLOW_NL_in_p_arith_pow_expr4163); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL408);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_apply_expr_in_p_arith_pow_expr4166);
            	    p_apply_expr409=p_apply_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_p_apply_expr.add(p_apply_expr409.getTree());

            	    }
            	    break;

            	default :
            	    break loop194;
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
            // 646:49: -> ^( POW ( p_apply_expr )* )
            {
                // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:646:52: ^( POW ( p_apply_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(POW, "POW"), root_1);

                // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:646:58: ( p_apply_expr )*
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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:648:1: apply_expr : ( basic_expr )+ -> ^( APPLY ( basic_expr )* ) ;
    public final babel17Parser.apply_expr_return apply_expr() throws RecognitionException {
        babel17Parser.apply_expr_return retval = new babel17Parser.apply_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.basic_expr_return basic_expr410 = null;


        RewriteRuleSubtreeStream stream_basic_expr=new RewriteRuleSubtreeStream(adaptor,"rule basic_expr");
        try {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:649:2: ( ( basic_expr )+ -> ^( APPLY ( basic_expr )* ) )
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:649:4: ( basic_expr )+
            {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:649:4: ( basic_expr )+
            int cnt195=0;
            loop195:
            do {
                int alt195=2;
                int LA195_0 = input.LA(1);

                if ( (LA195_0==L_begin||(LA195_0>=L_with && LA195_0<=L_if)||(LA195_0>=L_while && LA195_0<=L_for)||LA195_0==L_match||(LA195_0>=A_infinity && LA195_0<=U_infinity)||LA195_0==L_root||(LA195_0>=L_true && LA195_0<=L_here)||LA195_0==MODULE_KEY||(LA195_0>=Constr && LA195_0<=Num)||(LA195_0>=String && LA195_0<=ROUND_BRACKET_OPEN)||LA195_0==SQUARE_BRACKET_OPEN||LA195_0==CURLY_BRACKET_OPEN) ) {
                    alt195=1;
                }


                switch (alt195) {
            	case 1 :
            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:649:4: basic_expr
            	    {
            	    pushFollow(FOLLOW_basic_expr_in_apply_expr4187);
            	    basic_expr410=basic_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_basic_expr.add(basic_expr410.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt195 >= 1 ) break loop195;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(195, input);
                        throw eee;
                }
                cnt195++;
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
            // 649:16: -> ^( APPLY ( basic_expr )* )
            {
                // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:649:19: ^( APPLY ( basic_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(APPLY, "APPLY"), root_1);

                // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:649:27: ( basic_expr )*
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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:650:1: p_apply_expr : p_basic_expr ( ( NL )? p_basic_expr )* -> ^( APPLY ( p_basic_expr )* ) ;
    public final babel17Parser.p_apply_expr_return p_apply_expr() throws RecognitionException {
        babel17Parser.p_apply_expr_return retval = new babel17Parser.p_apply_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL412=null;
        babel17Parser.p_basic_expr_return p_basic_expr411 = null;

        babel17Parser.p_basic_expr_return p_basic_expr413 = null;


        CommonTree NL412_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_p_basic_expr=new RewriteRuleSubtreeStream(adaptor,"rule p_basic_expr");
        try {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:651:2: ( p_basic_expr ( ( NL )? p_basic_expr )* -> ^( APPLY ( p_basic_expr )* ) )
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:651:4: p_basic_expr ( ( NL )? p_basic_expr )*
            {
            pushFollow(FOLLOW_p_basic_expr_in_p_apply_expr4205);
            p_basic_expr411=p_basic_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_p_basic_expr.add(p_basic_expr411.getTree());
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:651:17: ( ( NL )? p_basic_expr )*
            loop197:
            do {
                int alt197=2;
                int LA197_0 = input.LA(1);

                if ( (LA197_0==NL) ) {
                    int LA197_1 = input.LA(2);

                    if ( (LA197_1==L_begin||(LA197_1>=L_with && LA197_1<=L_if)||(LA197_1>=L_while && LA197_1<=L_for)||LA197_1==L_match||(LA197_1>=A_infinity && LA197_1<=U_infinity)||LA197_1==L_root||(LA197_1>=L_true && LA197_1<=L_here)||LA197_1==MODULE_KEY||(LA197_1>=Constr && LA197_1<=Num)||(LA197_1>=String && LA197_1<=ROUND_BRACKET_OPEN)||LA197_1==SQUARE_BRACKET_OPEN||LA197_1==CURLY_BRACKET_OPEN) ) {
                        alt197=1;
                    }


                }
                else if ( (LA197_0==L_begin||(LA197_0>=L_with && LA197_0<=L_if)||(LA197_0>=L_while && LA197_0<=L_for)||LA197_0==L_match||(LA197_0>=A_infinity && LA197_0<=U_infinity)||LA197_0==L_root||(LA197_0>=L_true && LA197_0<=L_here)||LA197_0==MODULE_KEY||(LA197_0>=Constr && LA197_0<=Num)||(LA197_0>=String && LA197_0<=ROUND_BRACKET_OPEN)||LA197_0==SQUARE_BRACKET_OPEN||LA197_0==CURLY_BRACKET_OPEN) ) {
                    alt197=1;
                }


                switch (alt197) {
            	case 1 :
            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:651:18: ( NL )? p_basic_expr
            	    {
            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:651:18: ( NL )?
            	    int alt196=2;
            	    int LA196_0 = input.LA(1);

            	    if ( (LA196_0==NL) ) {
            	        alt196=1;
            	    }
            	    switch (alt196) {
            	        case 1 :
            	            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:651:18: NL
            	            {
            	            NL412=(Token)match(input,NL,FOLLOW_NL_in_p_apply_expr4208); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL412);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_basic_expr_in_p_apply_expr4211);
            	    p_basic_expr413=p_basic_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_p_basic_expr.add(p_basic_expr413.getTree());

            	    }
            	    break;

            	default :
            	    break loop197;
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
            // 651:37: -> ^( APPLY ( p_basic_expr )* )
            {
                // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:651:40: ^( APPLY ( p_basic_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(APPLY, "APPLY"), root_1);

                // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:651:48: ( p_basic_expr )*
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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:653:1: basic_expr : message_send_expr ;
    public final babel17Parser.basic_expr_return basic_expr() throws RecognitionException {
        babel17Parser.basic_expr_return retval = new babel17Parser.basic_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.message_send_expr_return message_send_expr414 = null;



        try {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:654:2: ( message_send_expr )
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:654:4: message_send_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_message_send_expr_in_basic_expr4231);
            message_send_expr414=message_send_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, message_send_expr414.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:656:1: p_basic_expr : message_send_expr ;
    public final babel17Parser.p_basic_expr_return p_basic_expr() throws RecognitionException {
        babel17Parser.p_basic_expr_return retval = new babel17Parser.p_basic_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.message_send_expr_return message_send_expr415 = null;



        try {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:657:2: ( message_send_expr )
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:657:4: message_send_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_message_send_expr_in_p_basic_expr4240);
            message_send_expr415=message_send_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, message_send_expr415.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:659:1: message_send_expr : primitive_expr ( ( NL )? PERIOD ( NL )? Id )* -> ^( MESSAGE_SEND primitive_expr ( Id )* ) ;
    public final babel17Parser.message_send_expr_return message_send_expr() throws RecognitionException {
        babel17Parser.message_send_expr_return retval = new babel17Parser.message_send_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL417=null;
        Token PERIOD418=null;
        Token NL419=null;
        Token Id420=null;
        babel17Parser.primitive_expr_return primitive_expr416 = null;


        CommonTree NL417_tree=null;
        CommonTree PERIOD418_tree=null;
        CommonTree NL419_tree=null;
        CommonTree Id420_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_Id=new RewriteRuleTokenStream(adaptor,"token Id");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
        RewriteRuleSubtreeStream stream_primitive_expr=new RewriteRuleSubtreeStream(adaptor,"rule primitive_expr");
        try {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:660:2: ( primitive_expr ( ( NL )? PERIOD ( NL )? Id )* -> ^( MESSAGE_SEND primitive_expr ( Id )* ) )
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:660:4: primitive_expr ( ( NL )? PERIOD ( NL )? Id )*
            {
            pushFollow(FOLLOW_primitive_expr_in_message_send_expr4249);
            primitive_expr416=primitive_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_primitive_expr.add(primitive_expr416.getTree());
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:660:19: ( ( NL )? PERIOD ( NL )? Id )*
            loop200:
            do {
                int alt200=2;
                int LA200_0 = input.LA(1);

                if ( (LA200_0==NL) ) {
                    int LA200_1 = input.LA(2);

                    if ( (LA200_1==PERIOD) ) {
                        alt200=1;
                    }


                }
                else if ( (LA200_0==PERIOD) ) {
                    alt200=1;
                }


                switch (alt200) {
            	case 1 :
            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:660:20: ( NL )? PERIOD ( NL )? Id
            	    {
            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:660:20: ( NL )?
            	    int alt198=2;
            	    int LA198_0 = input.LA(1);

            	    if ( (LA198_0==NL) ) {
            	        alt198=1;
            	    }
            	    switch (alt198) {
            	        case 1 :
            	            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:660:20: NL
            	            {
            	            NL417=(Token)match(input,NL,FOLLOW_NL_in_message_send_expr4252); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL417);


            	            }
            	            break;

            	    }

            	    PERIOD418=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_message_send_expr4255); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD418);

            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:660:31: ( NL )?
            	    int alt199=2;
            	    int LA199_0 = input.LA(1);

            	    if ( (LA199_0==NL) ) {
            	        alt199=1;
            	    }
            	    switch (alt199) {
            	        case 1 :
            	            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:660:31: NL
            	            {
            	            NL419=(Token)match(input,NL,FOLLOW_NL_in_message_send_expr4257); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL419);


            	            }
            	            break;

            	    }

            	    Id420=(Token)match(input,Id,FOLLOW_Id_in_message_send_expr4260); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_Id.add(Id420);


            	    }
            	    break;

            	default :
            	    break loop200;
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
            // 660:40: -> ^( MESSAGE_SEND primitive_expr ( Id )* )
            {
                // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:660:43: ^( MESSAGE_SEND primitive_expr ( Id )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MESSAGE_SEND, "MESSAGE_SEND"), root_1);

                adaptor.addChild(root_1, stream_primitive_expr.nextTree());
                // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:660:73: ( Id )*
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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:662:1: list_expr : ( '[' ( NL )? ( protected_expr ( ( NL )? COMMA ( NL )? protected_expr )* ( NL )? )? ']' -> ^( SQUARE_LIST ( protected_expr )* ) | '(' ( NL )? ( protected_expr ( ( NL )? COMMA ( NL )? protected_expr )* ( NL )? ( COMMA ( NL )? )? )? ')' -> ^( ROUND_LIST ^( NIL ( COMMA )* ) ^( NIL ( protected_expr )* ) ) );
    public final babel17Parser.list_expr_return list_expr() throws RecognitionException {
        babel17Parser.list_expr_return retval = new babel17Parser.list_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal421=null;
        Token NL422=null;
        Token NL424=null;
        Token COMMA425=null;
        Token NL426=null;
        Token NL428=null;
        Token char_literal429=null;
        Token char_literal430=null;
        Token NL431=null;
        Token NL433=null;
        Token COMMA434=null;
        Token NL435=null;
        Token NL437=null;
        Token COMMA438=null;
        Token NL439=null;
        Token char_literal440=null;
        babel17Parser.protected_expr_return protected_expr423 = null;

        babel17Parser.protected_expr_return protected_expr427 = null;

        babel17Parser.protected_expr_return protected_expr432 = null;

        babel17Parser.protected_expr_return protected_expr436 = null;


        CommonTree char_literal421_tree=null;
        CommonTree NL422_tree=null;
        CommonTree NL424_tree=null;
        CommonTree COMMA425_tree=null;
        CommonTree NL426_tree=null;
        CommonTree NL428_tree=null;
        CommonTree char_literal429_tree=null;
        CommonTree char_literal430_tree=null;
        CommonTree NL431_tree=null;
        CommonTree NL433_tree=null;
        CommonTree COMMA434_tree=null;
        CommonTree NL435_tree=null;
        CommonTree NL437_tree=null;
        CommonTree COMMA438_tree=null;
        CommonTree NL439_tree=null;
        CommonTree char_literal440_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_ROUND_BRACKET_CLOSE=new RewriteRuleTokenStream(adaptor,"token ROUND_BRACKET_CLOSE");
        RewriteRuleTokenStream stream_SQUARE_BRACKET_OPEN=new RewriteRuleTokenStream(adaptor,"token SQUARE_BRACKET_OPEN");
        RewriteRuleTokenStream stream_ROUND_BRACKET_OPEN=new RewriteRuleTokenStream(adaptor,"token ROUND_BRACKET_OPEN");
        RewriteRuleTokenStream stream_SQUARE_BRACKET_CLOSE=new RewriteRuleTokenStream(adaptor,"token SQUARE_BRACKET_CLOSE");
        RewriteRuleSubtreeStream stream_protected_expr=new RewriteRuleSubtreeStream(adaptor,"rule protected_expr");
        try {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:663:2: ( '[' ( NL )? ( protected_expr ( ( NL )? COMMA ( NL )? protected_expr )* ( NL )? )? ']' -> ^( SQUARE_LIST ( protected_expr )* ) | '(' ( NL )? ( protected_expr ( ( NL )? COMMA ( NL )? protected_expr )* ( NL )? ( COMMA ( NL )? )? )? ')' -> ^( ROUND_LIST ^( NIL ( COMMA )* ) ^( NIL ( protected_expr )* ) ) )
            int alt215=2;
            int LA215_0 = input.LA(1);

            if ( (LA215_0==SQUARE_BRACKET_OPEN) ) {
                alt215=1;
            }
            else if ( (LA215_0==ROUND_BRACKET_OPEN) ) {
                alt215=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 215, 0, input);

                throw nvae;
            }
            switch (alt215) {
                case 1 :
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:663:4: '[' ( NL )? ( protected_expr ( ( NL )? COMMA ( NL )? protected_expr )* ( NL )? )? ']'
                    {
                    char_literal421=(Token)match(input,SQUARE_BRACKET_OPEN,FOLLOW_SQUARE_BRACKET_OPEN_in_list_expr4284); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SQUARE_BRACKET_OPEN.add(char_literal421);

                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:663:8: ( NL )?
                    int alt201=2;
                    int LA201_0 = input.LA(1);

                    if ( (LA201_0==NL) ) {
                        alt201=1;
                    }
                    switch (alt201) {
                        case 1 :
                            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:663:8: NL
                            {
                            NL422=(Token)match(input,NL,FOLLOW_NL_in_list_expr4286); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL422);


                            }
                            break;

                    }

                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:663:12: ( protected_expr ( ( NL )? COMMA ( NL )? protected_expr )* ( NL )? )?
                    int alt206=2;
                    int LA206_0 = input.LA(1);

                    if ( (LA206_0==L_begin||(LA206_0>=L_obj && LA206_0<=L_if)||(LA206_0>=L_while && LA206_0<=L_for)||(LA206_0>=L_match && LA206_0<=L_case)||LA206_0==L_exception||(LA206_0>=A_infinity && LA206_0<=U_infinity)||LA206_0==L_root||(LA206_0>=L_concurrent && LA206_0<=L_lazy)||(LA206_0>=L_true && LA206_0<=L_random)||LA206_0==MINUS||LA206_0==MODULE_KEY||LA206_0==A_NOT||LA206_0==U_NOT||LA206_0==TILDE||(LA206_0>=Constr && LA206_0<=Num)||(LA206_0>=String && LA206_0<=ROUND_BRACKET_OPEN)||LA206_0==SQUARE_BRACKET_OPEN||LA206_0==CURLY_BRACKET_OPEN||LA206_0==UNDERSCORE) ) {
                        alt206=1;
                    }
                    switch (alt206) {
                        case 1 :
                            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:663:13: protected_expr ( ( NL )? COMMA ( NL )? protected_expr )* ( NL )?
                            {
                            pushFollow(FOLLOW_protected_expr_in_list_expr4290);
                            protected_expr423=protected_expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr423.getTree());
                            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:663:28: ( ( NL )? COMMA ( NL )? protected_expr )*
                            loop204:
                            do {
                                int alt204=2;
                                int LA204_0 = input.LA(1);

                                if ( (LA204_0==NL) ) {
                                    int LA204_1 = input.LA(2);

                                    if ( (LA204_1==COMMA) ) {
                                        alt204=1;
                                    }


                                }
                                else if ( (LA204_0==COMMA) ) {
                                    alt204=1;
                                }


                                switch (alt204) {
                            	case 1 :
                            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:663:29: ( NL )? COMMA ( NL )? protected_expr
                            	    {
                            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:663:29: ( NL )?
                            	    int alt202=2;
                            	    int LA202_0 = input.LA(1);

                            	    if ( (LA202_0==NL) ) {
                            	        alt202=1;
                            	    }
                            	    switch (alt202) {
                            	        case 1 :
                            	            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:663:29: NL
                            	            {
                            	            NL424=(Token)match(input,NL,FOLLOW_NL_in_list_expr4293); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL424);


                            	            }
                            	            break;

                            	    }

                            	    COMMA425=(Token)match(input,COMMA,FOLLOW_COMMA_in_list_expr4296); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA425);

                            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:663:39: ( NL )?
                            	    int alt203=2;
                            	    int LA203_0 = input.LA(1);

                            	    if ( (LA203_0==NL) ) {
                            	        alt203=1;
                            	    }
                            	    switch (alt203) {
                            	        case 1 :
                            	            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:663:39: NL
                            	            {
                            	            NL426=(Token)match(input,NL,FOLLOW_NL_in_list_expr4298); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL426);


                            	            }
                            	            break;

                            	    }

                            	    pushFollow(FOLLOW_protected_expr_in_list_expr4301);
                            	    protected_expr427=protected_expr();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr427.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop204;
                                }
                            } while (true);

                            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:663:60: ( NL )?
                            int alt205=2;
                            int LA205_0 = input.LA(1);

                            if ( (LA205_0==NL) ) {
                                alt205=1;
                            }
                            switch (alt205) {
                                case 1 :
                                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:663:60: NL
                                    {
                                    NL428=(Token)match(input,NL,FOLLOW_NL_in_list_expr4305); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL428);


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    char_literal429=(Token)match(input,SQUARE_BRACKET_CLOSE,FOLLOW_SQUARE_BRACKET_CLOSE_in_list_expr4310); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SQUARE_BRACKET_CLOSE.add(char_literal429);



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
                    // 663:70: -> ^( SQUARE_LIST ( protected_expr )* )
                    {
                        // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:663:73: ^( SQUARE_LIST ( protected_expr )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SQUARE_LIST, "SQUARE_LIST"), root_1);

                        // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:663:87: ( protected_expr )*
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
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:664:4: '(' ( NL )? ( protected_expr ( ( NL )? COMMA ( NL )? protected_expr )* ( NL )? ( COMMA ( NL )? )? )? ')'
                    {
                    char_literal430=(Token)match(input,ROUND_BRACKET_OPEN,FOLLOW_ROUND_BRACKET_OPEN_in_list_expr4324); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ROUND_BRACKET_OPEN.add(char_literal430);

                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:664:8: ( NL )?
                    int alt207=2;
                    int LA207_0 = input.LA(1);

                    if ( (LA207_0==NL) ) {
                        alt207=1;
                    }
                    switch (alt207) {
                        case 1 :
                            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:664:8: NL
                            {
                            NL431=(Token)match(input,NL,FOLLOW_NL_in_list_expr4326); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL431);


                            }
                            break;

                    }

                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:664:12: ( protected_expr ( ( NL )? COMMA ( NL )? protected_expr )* ( NL )? ( COMMA ( NL )? )? )?
                    int alt214=2;
                    int LA214_0 = input.LA(1);

                    if ( (LA214_0==L_begin||(LA214_0>=L_obj && LA214_0<=L_if)||(LA214_0>=L_while && LA214_0<=L_for)||(LA214_0>=L_match && LA214_0<=L_case)||LA214_0==L_exception||(LA214_0>=A_infinity && LA214_0<=U_infinity)||LA214_0==L_root||(LA214_0>=L_concurrent && LA214_0<=L_lazy)||(LA214_0>=L_true && LA214_0<=L_random)||LA214_0==MINUS||LA214_0==MODULE_KEY||LA214_0==A_NOT||LA214_0==U_NOT||LA214_0==TILDE||(LA214_0>=Constr && LA214_0<=Num)||(LA214_0>=String && LA214_0<=ROUND_BRACKET_OPEN)||LA214_0==SQUARE_BRACKET_OPEN||LA214_0==CURLY_BRACKET_OPEN||LA214_0==UNDERSCORE) ) {
                        alt214=1;
                    }
                    switch (alt214) {
                        case 1 :
                            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:664:13: protected_expr ( ( NL )? COMMA ( NL )? protected_expr )* ( NL )? ( COMMA ( NL )? )?
                            {
                            pushFollow(FOLLOW_protected_expr_in_list_expr4330);
                            protected_expr432=protected_expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr432.getTree());
                            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:664:28: ( ( NL )? COMMA ( NL )? protected_expr )*
                            loop210:
                            do {
                                int alt210=2;
                                int LA210_0 = input.LA(1);

                                if ( (LA210_0==NL) ) {
                                    int LA210_1 = input.LA(2);

                                    if ( (LA210_1==COMMA) ) {
                                        int LA210_2 = input.LA(3);

                                        if ( (LA210_2==NL) ) {
                                            int LA210_4 = input.LA(4);

                                            if ( (LA210_4==L_begin||(LA210_4>=L_obj && LA210_4<=L_if)||(LA210_4>=L_while && LA210_4<=L_for)||(LA210_4>=L_match && LA210_4<=L_case)||LA210_4==L_exception||(LA210_4>=A_infinity && LA210_4<=U_infinity)||LA210_4==L_root||(LA210_4>=L_concurrent && LA210_4<=L_lazy)||(LA210_4>=L_true && LA210_4<=L_random)||LA210_4==MINUS||LA210_4==MODULE_KEY||LA210_4==A_NOT||LA210_4==U_NOT||LA210_4==TILDE||(LA210_4>=Constr && LA210_4<=Num)||(LA210_4>=String && LA210_4<=ROUND_BRACKET_OPEN)||LA210_4==SQUARE_BRACKET_OPEN||LA210_4==CURLY_BRACKET_OPEN||LA210_4==UNDERSCORE) ) {
                                                alt210=1;
                                            }


                                        }
                                        else if ( (LA210_2==L_begin||(LA210_2>=L_obj && LA210_2<=L_if)||(LA210_2>=L_while && LA210_2<=L_for)||(LA210_2>=L_match && LA210_2<=L_case)||LA210_2==L_exception||(LA210_2>=A_infinity && LA210_2<=U_infinity)||LA210_2==L_root||(LA210_2>=L_concurrent && LA210_2<=L_lazy)||(LA210_2>=L_true && LA210_2<=L_random)||LA210_2==MINUS||LA210_2==MODULE_KEY||LA210_2==A_NOT||LA210_2==U_NOT||LA210_2==TILDE||(LA210_2>=Constr && LA210_2<=Num)||(LA210_2>=String && LA210_2<=ROUND_BRACKET_OPEN)||LA210_2==SQUARE_BRACKET_OPEN||LA210_2==CURLY_BRACKET_OPEN||LA210_2==UNDERSCORE) ) {
                                            alt210=1;
                                        }


                                    }


                                }
                                else if ( (LA210_0==COMMA) ) {
                                    int LA210_2 = input.LA(2);

                                    if ( (LA210_2==NL) ) {
                                        int LA210_4 = input.LA(3);

                                        if ( (LA210_4==L_begin||(LA210_4>=L_obj && LA210_4<=L_if)||(LA210_4>=L_while && LA210_4<=L_for)||(LA210_4>=L_match && LA210_4<=L_case)||LA210_4==L_exception||(LA210_4>=A_infinity && LA210_4<=U_infinity)||LA210_4==L_root||(LA210_4>=L_concurrent && LA210_4<=L_lazy)||(LA210_4>=L_true && LA210_4<=L_random)||LA210_4==MINUS||LA210_4==MODULE_KEY||LA210_4==A_NOT||LA210_4==U_NOT||LA210_4==TILDE||(LA210_4>=Constr && LA210_4<=Num)||(LA210_4>=String && LA210_4<=ROUND_BRACKET_OPEN)||LA210_4==SQUARE_BRACKET_OPEN||LA210_4==CURLY_BRACKET_OPEN||LA210_4==UNDERSCORE) ) {
                                            alt210=1;
                                        }


                                    }
                                    else if ( (LA210_2==L_begin||(LA210_2>=L_obj && LA210_2<=L_if)||(LA210_2>=L_while && LA210_2<=L_for)||(LA210_2>=L_match && LA210_2<=L_case)||LA210_2==L_exception||(LA210_2>=A_infinity && LA210_2<=U_infinity)||LA210_2==L_root||(LA210_2>=L_concurrent && LA210_2<=L_lazy)||(LA210_2>=L_true && LA210_2<=L_random)||LA210_2==MINUS||LA210_2==MODULE_KEY||LA210_2==A_NOT||LA210_2==U_NOT||LA210_2==TILDE||(LA210_2>=Constr && LA210_2<=Num)||(LA210_2>=String && LA210_2<=ROUND_BRACKET_OPEN)||LA210_2==SQUARE_BRACKET_OPEN||LA210_2==CURLY_BRACKET_OPEN||LA210_2==UNDERSCORE) ) {
                                        alt210=1;
                                    }


                                }


                                switch (alt210) {
                            	case 1 :
                            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:664:29: ( NL )? COMMA ( NL )? protected_expr
                            	    {
                            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:664:29: ( NL )?
                            	    int alt208=2;
                            	    int LA208_0 = input.LA(1);

                            	    if ( (LA208_0==NL) ) {
                            	        alt208=1;
                            	    }
                            	    switch (alt208) {
                            	        case 1 :
                            	            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:664:29: NL
                            	            {
                            	            NL433=(Token)match(input,NL,FOLLOW_NL_in_list_expr4333); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL433);


                            	            }
                            	            break;

                            	    }

                            	    COMMA434=(Token)match(input,COMMA,FOLLOW_COMMA_in_list_expr4336); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA434);

                            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:664:39: ( NL )?
                            	    int alt209=2;
                            	    int LA209_0 = input.LA(1);

                            	    if ( (LA209_0==NL) ) {
                            	        alt209=1;
                            	    }
                            	    switch (alt209) {
                            	        case 1 :
                            	            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:664:39: NL
                            	            {
                            	            NL435=(Token)match(input,NL,FOLLOW_NL_in_list_expr4338); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL435);


                            	            }
                            	            break;

                            	    }

                            	    pushFollow(FOLLOW_protected_expr_in_list_expr4341);
                            	    protected_expr436=protected_expr();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr436.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop210;
                                }
                            } while (true);

                            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:664:60: ( NL )?
                            int alt211=2;
                            int LA211_0 = input.LA(1);

                            if ( (LA211_0==NL) ) {
                                alt211=1;
                            }
                            switch (alt211) {
                                case 1 :
                                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:664:60: NL
                                    {
                                    NL437=(Token)match(input,NL,FOLLOW_NL_in_list_expr4345); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL437);


                                    }
                                    break;

                            }

                            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:664:64: ( COMMA ( NL )? )?
                            int alt213=2;
                            int LA213_0 = input.LA(1);

                            if ( (LA213_0==COMMA) ) {
                                alt213=1;
                            }
                            switch (alt213) {
                                case 1 :
                                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:664:65: COMMA ( NL )?
                                    {
                                    COMMA438=(Token)match(input,COMMA,FOLLOW_COMMA_in_list_expr4349); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_COMMA.add(COMMA438);

                                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:664:71: ( NL )?
                                    int alt212=2;
                                    int LA212_0 = input.LA(1);

                                    if ( (LA212_0==NL) ) {
                                        alt212=1;
                                    }
                                    switch (alt212) {
                                        case 1 :
                                            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:664:71: NL
                                            {
                                            NL439=(Token)match(input,NL,FOLLOW_NL_in_list_expr4351); if (state.failed) return retval; 
                                            if ( state.backtracking==0 ) stream_NL.add(NL439);


                                            }
                                            break;

                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    char_literal440=(Token)match(input,ROUND_BRACKET_CLOSE,FOLLOW_ROUND_BRACKET_CLOSE_in_list_expr4358); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ROUND_BRACKET_CLOSE.add(char_literal440);



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
                    // 664:83: -> ^( ROUND_LIST ^( NIL ( COMMA )* ) ^( NIL ( protected_expr )* ) )
                    {
                        // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:664:86: ^( ROUND_LIST ^( NIL ( COMMA )* ) ^( NIL ( protected_expr )* ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ROUND_LIST, "ROUND_LIST"), root_1);

                        // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:664:99: ^( NIL ( COMMA )* )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL, "NIL"), root_2);

                        // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:664:105: ( COMMA )*
                        while ( stream_COMMA.hasNext() ) {
                            adaptor.addChild(root_2, stream_COMMA.nextNode());

                        }
                        stream_COMMA.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:664:113: ^( NIL ( protected_expr )* )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL, "NIL"), root_2);

                        // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:664:119: ( protected_expr )*
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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:666:1: map_or_set_expr : ( '{' ( NL )? ( map_or_set_elem_expr ( NL )? ( COMMA ( NL )? map_or_set_elem_expr ( NL )? )* )? '}' -> ^( MAP_OR_SET ( map_or_set_elem_expr )* ) | '{' ( NL )? token_ARROW ( NL )? '}' -> ^( EMPTY_MAP ) );
    public final babel17Parser.map_or_set_expr_return map_or_set_expr() throws RecognitionException {
        babel17Parser.map_or_set_expr_return retval = new babel17Parser.map_or_set_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal441=null;
        Token NL442=null;
        Token NL444=null;
        Token COMMA445=null;
        Token NL446=null;
        Token NL448=null;
        Token char_literal449=null;
        Token char_literal450=null;
        Token NL451=null;
        Token NL453=null;
        Token char_literal454=null;
        babel17Parser.map_or_set_elem_expr_return map_or_set_elem_expr443 = null;

        babel17Parser.map_or_set_elem_expr_return map_or_set_elem_expr447 = null;

        babel17Parser.token_ARROW_return token_ARROW452 = null;


        CommonTree char_literal441_tree=null;
        CommonTree NL442_tree=null;
        CommonTree NL444_tree=null;
        CommonTree COMMA445_tree=null;
        CommonTree NL446_tree=null;
        CommonTree NL448_tree=null;
        CommonTree char_literal449_tree=null;
        CommonTree char_literal450_tree=null;
        CommonTree NL451_tree=null;
        CommonTree NL453_tree=null;
        CommonTree char_literal454_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_CURLY_BRACKET_OPEN=new RewriteRuleTokenStream(adaptor,"token CURLY_BRACKET_OPEN");
        RewriteRuleTokenStream stream_CURLY_BRACKET_CLOSE=new RewriteRuleTokenStream(adaptor,"token CURLY_BRACKET_CLOSE");
        RewriteRuleSubtreeStream stream_map_or_set_elem_expr=new RewriteRuleSubtreeStream(adaptor,"rule map_or_set_elem_expr");
        RewriteRuleSubtreeStream stream_token_ARROW=new RewriteRuleSubtreeStream(adaptor,"rule token_ARROW");
        try {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:667:2: ( '{' ( NL )? ( map_or_set_elem_expr ( NL )? ( COMMA ( NL )? map_or_set_elem_expr ( NL )? )* )? '}' -> ^( MAP_OR_SET ( map_or_set_elem_expr )* ) | '{' ( NL )? token_ARROW ( NL )? '}' -> ^( EMPTY_MAP ) )
            int alt224=2;
            int LA224_0 = input.LA(1);

            if ( (LA224_0==CURLY_BRACKET_OPEN) ) {
                switch ( input.LA(2) ) {
                case NL:
                    {
                    int LA224_2 = input.LA(3);

                    if ( ((LA224_2>=A_ARROW && LA224_2<=U_ARROW)) ) {
                        alt224=2;
                    }
                    else if ( (LA224_2==L_begin||(LA224_2>=L_obj && LA224_2<=L_if)||(LA224_2>=L_while && LA224_2<=L_for)||(LA224_2>=L_match && LA224_2<=L_case)||LA224_2==L_exception||(LA224_2>=A_infinity && LA224_2<=U_infinity)||LA224_2==L_root||(LA224_2>=L_concurrent && LA224_2<=L_lazy)||(LA224_2>=L_true && LA224_2<=L_random)||LA224_2==MINUS||LA224_2==MODULE_KEY||LA224_2==A_NOT||LA224_2==U_NOT||LA224_2==TILDE||(LA224_2>=Constr && LA224_2<=Num)||(LA224_2>=String && LA224_2<=ROUND_BRACKET_OPEN)||LA224_2==SQUARE_BRACKET_OPEN||(LA224_2>=CURLY_BRACKET_OPEN && LA224_2<=UNDERSCORE)) ) {
                        alt224=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 224, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case A_ARROW:
                case U_ARROW:
                    {
                    alt224=2;
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
                    alt224=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 224, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 224, 0, input);

                throw nvae;
            }
            switch (alt224) {
                case 1 :
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:667:4: '{' ( NL )? ( map_or_set_elem_expr ( NL )? ( COMMA ( NL )? map_or_set_elem_expr ( NL )? )* )? '}'
                    {
                    char_literal441=(Token)match(input,CURLY_BRACKET_OPEN,FOLLOW_CURLY_BRACKET_OPEN_in_map_or_set_expr4387); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_OPEN.add(char_literal441);

                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:667:8: ( NL )?
                    int alt216=2;
                    int LA216_0 = input.LA(1);

                    if ( (LA216_0==NL) ) {
                        alt216=1;
                    }
                    switch (alt216) {
                        case 1 :
                            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:667:8: NL
                            {
                            NL442=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_expr4389); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL442);


                            }
                            break;

                    }

                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:667:12: ( map_or_set_elem_expr ( NL )? ( COMMA ( NL )? map_or_set_elem_expr ( NL )? )* )?
                    int alt221=2;
                    int LA221_0 = input.LA(1);

                    if ( (LA221_0==L_begin||(LA221_0>=L_obj && LA221_0<=L_if)||(LA221_0>=L_while && LA221_0<=L_for)||(LA221_0>=L_match && LA221_0<=L_case)||LA221_0==L_exception||(LA221_0>=A_infinity && LA221_0<=U_infinity)||LA221_0==L_root||(LA221_0>=L_concurrent && LA221_0<=L_lazy)||(LA221_0>=L_true && LA221_0<=L_random)||LA221_0==MINUS||LA221_0==MODULE_KEY||LA221_0==A_NOT||LA221_0==U_NOT||LA221_0==TILDE||(LA221_0>=Constr && LA221_0<=Num)||(LA221_0>=String && LA221_0<=ROUND_BRACKET_OPEN)||LA221_0==SQUARE_BRACKET_OPEN||LA221_0==CURLY_BRACKET_OPEN||LA221_0==UNDERSCORE) ) {
                        alt221=1;
                    }
                    switch (alt221) {
                        case 1 :
                            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:667:13: map_or_set_elem_expr ( NL )? ( COMMA ( NL )? map_or_set_elem_expr ( NL )? )*
                            {
                            pushFollow(FOLLOW_map_or_set_elem_expr_in_map_or_set_expr4393);
                            map_or_set_elem_expr443=map_or_set_elem_expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_map_or_set_elem_expr.add(map_or_set_elem_expr443.getTree());
                            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:667:34: ( NL )?
                            int alt217=2;
                            int LA217_0 = input.LA(1);

                            if ( (LA217_0==NL) ) {
                                alt217=1;
                            }
                            switch (alt217) {
                                case 1 :
                                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:667:34: NL
                                    {
                                    NL444=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_expr4395); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL444);


                                    }
                                    break;

                            }

                            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:667:38: ( COMMA ( NL )? map_or_set_elem_expr ( NL )? )*
                            loop220:
                            do {
                                int alt220=2;
                                int LA220_0 = input.LA(1);

                                if ( (LA220_0==COMMA) ) {
                                    alt220=1;
                                }


                                switch (alt220) {
                            	case 1 :
                            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:667:39: COMMA ( NL )? map_or_set_elem_expr ( NL )?
                            	    {
                            	    COMMA445=(Token)match(input,COMMA,FOLLOW_COMMA_in_map_or_set_expr4399); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA445);

                            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:667:45: ( NL )?
                            	    int alt218=2;
                            	    int LA218_0 = input.LA(1);

                            	    if ( (LA218_0==NL) ) {
                            	        alt218=1;
                            	    }
                            	    switch (alt218) {
                            	        case 1 :
                            	            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:667:45: NL
                            	            {
                            	            NL446=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_expr4401); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL446);


                            	            }
                            	            break;

                            	    }

                            	    pushFollow(FOLLOW_map_or_set_elem_expr_in_map_or_set_expr4404);
                            	    map_or_set_elem_expr447=map_or_set_elem_expr();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_map_or_set_elem_expr.add(map_or_set_elem_expr447.getTree());
                            	    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:667:70: ( NL )?
                            	    int alt219=2;
                            	    int LA219_0 = input.LA(1);

                            	    if ( (LA219_0==NL) ) {
                            	        alt219=1;
                            	    }
                            	    switch (alt219) {
                            	        case 1 :
                            	            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:667:70: NL
                            	            {
                            	            NL448=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_expr4406); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL448);


                            	            }
                            	            break;

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop220;
                                }
                            } while (true);


                            }
                            break;

                    }

                    char_literal449=(Token)match(input,CURLY_BRACKET_CLOSE,FOLLOW_CURLY_BRACKET_CLOSE_in_map_or_set_expr4413); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_CLOSE.add(char_literal449);



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
                    // 667:82: -> ^( MAP_OR_SET ( map_or_set_elem_expr )* )
                    {
                        // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:667:85: ^( MAP_OR_SET ( map_or_set_elem_expr )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MAP_OR_SET, "MAP_OR_SET"), root_1);

                        // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:667:98: ( map_or_set_elem_expr )*
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
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:668:10: '{' ( NL )? token_ARROW ( NL )? '}'
                    {
                    char_literal450=(Token)match(input,CURLY_BRACKET_OPEN,FOLLOW_CURLY_BRACKET_OPEN_in_map_or_set_expr4433); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_OPEN.add(char_literal450);

                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:668:14: ( NL )?
                    int alt222=2;
                    int LA222_0 = input.LA(1);

                    if ( (LA222_0==NL) ) {
                        alt222=1;
                    }
                    switch (alt222) {
                        case 1 :
                            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:668:14: NL
                            {
                            NL451=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_expr4435); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL451);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_token_ARROW_in_map_or_set_expr4438);
                    token_ARROW452=token_ARROW();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_token_ARROW.add(token_ARROW452.getTree());
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:668:30: ( NL )?
                    int alt223=2;
                    int LA223_0 = input.LA(1);

                    if ( (LA223_0==NL) ) {
                        alt223=1;
                    }
                    switch (alt223) {
                        case 1 :
                            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:668:30: NL
                            {
                            NL453=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_expr4440); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL453);


                            }
                            break;

                    }

                    char_literal454=(Token)match(input,CURLY_BRACKET_CLOSE,FOLLOW_CURLY_BRACKET_CLOSE_in_map_or_set_expr4443); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_CLOSE.add(char_literal454);



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
                    // 668:38: -> ^( EMPTY_MAP )
                    {
                        // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:668:41: ^( EMPTY_MAP )
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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:670:1: map_or_set_elem_expr : protected_expr ( ( NL )? token_ARROW ( NL )? protected_expr )? -> ^( NIL ( protected_expr )* ) ;
    public final babel17Parser.map_or_set_elem_expr_return map_or_set_elem_expr() throws RecognitionException {
        babel17Parser.map_or_set_elem_expr_return retval = new babel17Parser.map_or_set_elem_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL456=null;
        Token NL458=null;
        babel17Parser.protected_expr_return protected_expr455 = null;

        babel17Parser.token_ARROW_return token_ARROW457 = null;

        babel17Parser.protected_expr_return protected_expr459 = null;


        CommonTree NL456_tree=null;
        CommonTree NL458_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_protected_expr=new RewriteRuleSubtreeStream(adaptor,"rule protected_expr");
        RewriteRuleSubtreeStream stream_token_ARROW=new RewriteRuleSubtreeStream(adaptor,"rule token_ARROW");
        try {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:671:2: ( protected_expr ( ( NL )? token_ARROW ( NL )? protected_expr )? -> ^( NIL ( protected_expr )* ) )
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:671:4: protected_expr ( ( NL )? token_ARROW ( NL )? protected_expr )?
            {
            pushFollow(FOLLOW_protected_expr_in_map_or_set_elem_expr4460);
            protected_expr455=protected_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr455.getTree());
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:671:20: ( ( NL )? token_ARROW ( NL )? protected_expr )?
            int alt227=2;
            int LA227_0 = input.LA(1);

            if ( (LA227_0==NL) ) {
                int LA227_1 = input.LA(2);

                if ( ((LA227_1>=A_ARROW && LA227_1<=U_ARROW)) ) {
                    alt227=1;
                }
            }
            else if ( ((LA227_0>=A_ARROW && LA227_0<=U_ARROW)) ) {
                alt227=1;
            }
            switch (alt227) {
                case 1 :
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:671:21: ( NL )? token_ARROW ( NL )? protected_expr
                    {
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:671:21: ( NL )?
                    int alt225=2;
                    int LA225_0 = input.LA(1);

                    if ( (LA225_0==NL) ) {
                        alt225=1;
                    }
                    switch (alt225) {
                        case 1 :
                            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:671:21: NL
                            {
                            NL456=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_elem_expr4464); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL456);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_token_ARROW_in_map_or_set_elem_expr4467);
                    token_ARROW457=token_ARROW();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_token_ARROW.add(token_ARROW457.getTree());
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:671:37: ( NL )?
                    int alt226=2;
                    int LA226_0 = input.LA(1);

                    if ( (LA226_0==NL) ) {
                        alt226=1;
                    }
                    switch (alt226) {
                        case 1 :
                            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:671:37: NL
                            {
                            NL458=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_elem_expr4469); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL458);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_protected_expr_in_map_or_set_elem_expr4472);
                    protected_expr459=protected_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr459.getTree());

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
            // 671:58: -> ^( NIL ( protected_expr )* )
            {
                // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:671:61: ^( NIL ( protected_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL, "NIL"), root_1);

                // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:671:67: ( protected_expr )*
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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:673:1: primitive_expr : ( Num | String | Id | Constr | L_true | L_false | L_this | L_root | L_here | MODULE_KEY | token_infinity | list_expr | with_control_expr | map_or_set_expr );
    public final babel17Parser.primitive_expr_return primitive_expr() throws RecognitionException {
        babel17Parser.primitive_expr_return retval = new babel17Parser.primitive_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Num460=null;
        Token String461=null;
        Token Id462=null;
        Token Constr463=null;
        Token L_true464=null;
        Token L_false465=null;
        Token L_this466=null;
        Token L_root467=null;
        Token L_here468=null;
        Token MODULE_KEY469=null;
        babel17Parser.token_infinity_return token_infinity470 = null;

        babel17Parser.list_expr_return list_expr471 = null;

        babel17Parser.with_control_expr_return with_control_expr472 = null;

        babel17Parser.map_or_set_expr_return map_or_set_expr473 = null;


        CommonTree Num460_tree=null;
        CommonTree String461_tree=null;
        CommonTree Id462_tree=null;
        CommonTree Constr463_tree=null;
        CommonTree L_true464_tree=null;
        CommonTree L_false465_tree=null;
        CommonTree L_this466_tree=null;
        CommonTree L_root467_tree=null;
        CommonTree L_here468_tree=null;
        CommonTree MODULE_KEY469_tree=null;

        try {
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:674:2: ( Num | String | Id | Constr | L_true | L_false | L_this | L_root | L_here | MODULE_KEY | token_infinity | list_expr | with_control_expr | map_or_set_expr )
            int alt228=14;
            switch ( input.LA(1) ) {
            case Num:
                {
                alt228=1;
                }
                break;
            case String:
                {
                alt228=2;
                }
                break;
            case Id:
                {
                alt228=3;
                }
                break;
            case Constr:
                {
                alt228=4;
                }
                break;
            case L_true:
                {
                alt228=5;
                }
                break;
            case L_false:
                {
                alt228=6;
                }
                break;
            case L_this:
                {
                alt228=7;
                }
                break;
            case L_root:
                {
                alt228=8;
                }
                break;
            case L_here:
                {
                alt228=9;
                }
                break;
            case MODULE_KEY:
                {
                alt228=10;
                }
                break;
            case A_infinity:
            case U_infinity:
                {
                alt228=11;
                }
                break;
            case ROUND_BRACKET_OPEN:
            case SQUARE_BRACKET_OPEN:
                {
                alt228=12;
                }
                break;
            case L_begin:
            case L_with:
            case L_if:
            case L_while:
            case L_for:
            case L_match:
                {
                alt228=13;
                }
                break;
            case CURLY_BRACKET_OPEN:
                {
                alt228=14;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 228, 0, input);

                throw nvae;
            }

            switch (alt228) {
                case 1 :
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:674:4: Num
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Num460=(Token)match(input,Num,FOLLOW_Num_in_primitive_expr4492); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Num460_tree = (CommonTree)adaptor.create(Num460);
                    adaptor.addChild(root_0, Num460_tree);
                    }

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:675:4: String
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    String461=(Token)match(input,String,FOLLOW_String_in_primitive_expr4497); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    String461_tree = (CommonTree)adaptor.create(String461);
                    adaptor.addChild(root_0, String461_tree);
                    }

                    }
                    break;
                case 3 :
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:676:4: Id
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Id462=(Token)match(input,Id,FOLLOW_Id_in_primitive_expr4502); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Id462_tree = (CommonTree)adaptor.create(Id462);
                    adaptor.addChild(root_0, Id462_tree);
                    }

                    }
                    break;
                case 4 :
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:677:4: Constr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Constr463=(Token)match(input,Constr,FOLLOW_Constr_in_primitive_expr4507); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Constr463_tree = (CommonTree)adaptor.create(Constr463);
                    adaptor.addChild(root_0, Constr463_tree);
                    }

                    }
                    break;
                case 5 :
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:678:4: L_true
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    L_true464=(Token)match(input,L_true,FOLLOW_L_true_in_primitive_expr4512); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    L_true464_tree = (CommonTree)adaptor.create(L_true464);
                    adaptor.addChild(root_0, L_true464_tree);
                    }

                    }
                    break;
                case 6 :
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:679:4: L_false
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    L_false465=(Token)match(input,L_false,FOLLOW_L_false_in_primitive_expr4517); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    L_false465_tree = (CommonTree)adaptor.create(L_false465);
                    adaptor.addChild(root_0, L_false465_tree);
                    }

                    }
                    break;
                case 7 :
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:680:4: L_this
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    L_this466=(Token)match(input,L_this,FOLLOW_L_this_in_primitive_expr4522); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    L_this466_tree = (CommonTree)adaptor.create(L_this466);
                    adaptor.addChild(root_0, L_this466_tree);
                    }

                    }
                    break;
                case 8 :
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:681:4: L_root
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    L_root467=(Token)match(input,L_root,FOLLOW_L_root_in_primitive_expr4528); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    L_root467_tree = (CommonTree)adaptor.create(L_root467);
                    adaptor.addChild(root_0, L_root467_tree);
                    }

                    }
                    break;
                case 9 :
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:682:4: L_here
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    L_here468=(Token)match(input,L_here,FOLLOW_L_here_in_primitive_expr4533); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    L_here468_tree = (CommonTree)adaptor.create(L_here468);
                    adaptor.addChild(root_0, L_here468_tree);
                    }

                    }
                    break;
                case 10 :
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:683:5: MODULE_KEY
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    MODULE_KEY469=(Token)match(input,MODULE_KEY,FOLLOW_MODULE_KEY_in_primitive_expr4539); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    MODULE_KEY469_tree = (CommonTree)adaptor.create(MODULE_KEY469);
                    adaptor.addChild(root_0, MODULE_KEY469_tree);
                    }

                    }
                    break;
                case 11 :
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:684:4: token_infinity
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_infinity_in_primitive_expr4544);
                    token_infinity470=token_infinity();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, token_infinity470.getTree());

                    }
                    break;
                case 12 :
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:685:5: list_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_list_expr_in_primitive_expr4550);
                    list_expr471=list_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, list_expr471.getTree());

                    }
                    break;
                case 13 :
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:686:4: with_control_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_with_control_expr_in_primitive_expr4555);
                    with_control_expr472=with_control_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, with_control_expr472.getTree());

                    }
                    break;
                case 14 :
                    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:687:4: map_or_set_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_map_or_set_expr_in_primitive_expr4560);
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
    // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:689:1: prog : block EOF -> ^( PROG block ) ;
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
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:689:7: ( block EOF -> ^( PROG block ) )
            // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:689:9: block EOF
            {
            pushFollow(FOLLOW_block_in_prog4570);
            block474=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block474.getTree());
            EOF475=(Token)match(input,EOF,FOLLOW_EOF_in_prog4572); if (state.failed) return retval; 
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
            // 689:19: -> ^( PROG block )
            {
                // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:689:22: ^( PROG block )
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
        // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:370:10: ( Id ( NL )? L_as )
        // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:370:11: Id ( NL )? L_as
        {
        match(input,Id,FOLLOW_Id_in_synpred1_babel171636); if (state.failed) return ;
        // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:370:14: ( NL )?
        int alt229=2;
        int LA229_0 = input.LA(1);

        if ( (LA229_0==NL) ) {
            alt229=1;
        }
        switch (alt229) {
            case 1 :
                // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:370:14: NL
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
        // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:371:4: ( protected_expr ( NL )? QUESTION_MARK )
        // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:371:5: protected_expr ( NL )? QUESTION_MARK
        {
        pushFollow(FOLLOW_protected_expr_in_synpred2_babel171672);
        protected_expr();

        state._fsp--;
        if (state.failed) return ;
        // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:371:20: ( NL )?
        int alt230=2;
        int LA230_0 = input.LA(1);

        if ( (LA230_0==NL) ) {
            alt230=1;
        }
        switch (alt230) {
            case 1 :
                // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:371:20: NL
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
        // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:457:4: ( pattern ( NL )? '=' )
        // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:457:5: pattern ( NL )? '='
        {
        pushFollow(FOLLOW_pattern_in_synpred3_babel172615);
        pattern();

        state._fsp--;
        if (state.failed) return ;
        // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:457:13: ( NL )?
        int alt231=2;
        int LA231_0 = input.LA(1);

        if ( (LA231_0==NL) ) {
            alt231=1;
        }
        switch (alt231) {
            case 1 :
                // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:457:13: NL
                {
                match(input,NL,FOLLOW_NL_in_synpred3_babel172617); if (state.failed) return ;

                }
                break;

        }

        match(input,ASSIGN,FOLLOW_ASSIGN_in_synpred3_babel172620); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_babel17

    // $ANTLR start synpred4_babel17
    public final void synpred4_babel17_fragment() throws RecognitionException {   
        // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:488:4: ( lambda_expr )
        // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:488:5: lambda_expr
        {
        pushFollow(FOLLOW_lambda_expr_in_synpred4_babel172814);
        lambda_expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_babel17

    // $ANTLR start synpred5_babel17
    public final void synpred5_babel17_fragment() throws RecognitionException {   
        // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:492:4: ( protected_lambda_expr )
        // /Users/stevenobua/babel-17.clone/Babel17_ANTLR_Parser/babel17.g:492:5: protected_lambda_expr
        {
        pushFollow(FOLLOW_protected_lambda_expr_in_synpred5_babel172835);
        protected_lambda_expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_babel17

    // Delegated rules

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


    protected DFA16 dfa16 = new DFA16(this);
    protected DFA44 dfa44 = new DFA44(this);
    protected DFA50 dfa50 = new DFA50(this);
    protected DFA47 dfa47 = new DFA47(this);
    protected DFA52 dfa52 = new DFA52(this);
    protected DFA80 dfa80 = new DFA80(this);
    protected DFA88 dfa88 = new DFA88(this);
    protected DFA89 dfa89 = new DFA89(this);
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
        "\10\1\11\1\uffff\1\15\1\14";
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
            "\2\15\72\uffff\1\14\2\uffff\1\16",
            "",
            "",
            "\1\21\1\uffff\3\21\3\uffff\2\21\2\uffff\2\21\1\uffff\1\21\2"+
            "\uffff\1\21\2\uffff\2\21\4\uffff\1\21\1\uffff\3\21\1\uffff\5"+
            "\21\16\uffff\1\21\4\uffff\1\21\2\uffff\1\21\2\uffff\1\21\7\uffff"+
            "\2\20\2\21\3\uffff\1\21\2\uffff\1\17\3\21\1\uffff\2\21\1\uffff"+
            "\1\21\1\uffff\3\21",
            "\2\15\75\uffff\1\16",
            "",
            "",
            "\1\21\1\uffff\3\21\3\uffff\2\21\2\uffff\2\21\1\uffff\1\21\2"+
            "\uffff\1\21\2\uffff\2\21\4\uffff\1\21\1\uffff\3\21\1\uffff\5"+
            "\21\16\uffff\1\21\4\uffff\1\21\2\uffff\1\21\2\uffff\1\21\7\uffff"+
            "\2\20\2\21\3\uffff\1\21\3\uffff\3\21\1\uffff\2\21\1\uffff\1"+
            "\21\1\uffff\3\21",
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
    static final String DFA80_eotS =
        "\33\uffff";
    static final String DFA80_eofS =
        "\33\uffff";
    static final String DFA80_minS =
        "\1\64\14\0\16\uffff";
    static final String DFA80_maxS =
        "\1\u0091\14\0\16\uffff";
    static final String DFA80_acceptS =
        "\15\uffff\1\2\14\uffff\1\1";
    static final String DFA80_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\16"+
        "\uffff}>";
    static final String[] DFA80_transitionS = {
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
            return "456:1: expr_or_assign : ( ( pattern ( NL )? '=' )=> pattern ( NL )? '=' ( NL )? expr -> ^( ASSIGN pattern expr ) | expr );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA80_1 = input.LA(1);

                         
                        int index80_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index80_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA80_2 = input.LA(1);

                         
                        int index80_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index80_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA80_3 = input.LA(1);

                         
                        int index80_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index80_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA80_4 = input.LA(1);

                         
                        int index80_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index80_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA80_5 = input.LA(1);

                         
                        int index80_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index80_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA80_6 = input.LA(1);

                         
                        int index80_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index80_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA80_7 = input.LA(1);

                         
                        int index80_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index80_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA80_8 = input.LA(1);

                         
                        int index80_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index80_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA80_9 = input.LA(1);

                         
                        int index80_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index80_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA80_10 = input.LA(1);

                         
                        int index80_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index80_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA80_11 = input.LA(1);

                         
                        int index80_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index80_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA80_12 = input.LA(1);

                         
                        int index80_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index80_12);
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
    static final String DFA88_eotS =
        "\31\uffff";
    static final String DFA88_eofS =
        "\31\uffff";
    static final String DFA88_minS =
        "\1\64\2\0\1\uffff\11\0\14\uffff";
    static final String DFA88_maxS =
        "\1\u0091\2\0\1\uffff\11\0\14\uffff";
    static final String DFA88_acceptS =
        "\3\uffff\1\1\11\uffff\1\2\13\uffff";
    static final String DFA88_specialS =
        "\1\0\1\1\1\2\1\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\14"+
        "\uffff}>";
    static final String[] DFA88_transitionS = {
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

    static final short[] DFA88_eot = DFA.unpackEncodedString(DFA88_eotS);
    static final short[] DFA88_eof = DFA.unpackEncodedString(DFA88_eofS);
    static final char[] DFA88_min = DFA.unpackEncodedStringToUnsignedChars(DFA88_minS);
    static final char[] DFA88_max = DFA.unpackEncodedStringToUnsignedChars(DFA88_maxS);
    static final short[] DFA88_accept = DFA.unpackEncodedString(DFA88_acceptS);
    static final short[] DFA88_special = DFA.unpackEncodedString(DFA88_specialS);
    static final short[][] DFA88_transition;

    static {
        int numStates = DFA88_transitionS.length;
        DFA88_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA88_transition[i] = DFA.unpackEncodedString(DFA88_transitionS[i]);
        }
    }

    class DFA88 extends DFA {

        public DFA88(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 88;
            this.eot = DFA88_eot;
            this.eof = DFA88_eof;
            this.min = DFA88_min;
            this.max = DFA88_max;
            this.accept = DFA88_accept;
            this.special = DFA88_special;
            this.transition = DFA88_transition;
        }
        public String getDescription() {
            return "487:1: lop_expr : ( ( lambda_expr )=> lambda_expr | op_expr );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA88_0 = input.LA(1);

                         
                        int index88_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA88_0==Constr) ) {s = 1;}

                        else if ( (LA88_0==Id) ) {s = 2;}

                        else if ( (LA88_0==UNDERSCORE) && (synpred4_babel17())) {s = 3;}

                        else if ( (LA88_0==String) ) {s = 4;}

                        else if ( (LA88_0==Num) ) {s = 5;}

                        else if ( (LA88_0==L_true) ) {s = 6;}

                        else if ( (LA88_0==L_false) ) {s = 7;}

                        else if ( ((LA88_0>=A_infinity && LA88_0<=U_infinity)) ) {s = 8;}

                        else if ( (LA88_0==MINUS) ) {s = 9;}

                        else if ( (LA88_0==SQUARE_BRACKET_OPEN) ) {s = 10;}

                        else if ( (LA88_0==ROUND_BRACKET_OPEN) ) {s = 11;}

                        else if ( (LA88_0==CURLY_BRACKET_OPEN) ) {s = 12;}

                        else if ( (LA88_0==L_begin||(LA88_0>=L_with && LA88_0<=L_if)||(LA88_0>=L_while && LA88_0<=L_for)||LA88_0==L_match||LA88_0==L_exception||LA88_0==L_root||(LA88_0>=L_concurrent && LA88_0<=L_lazy)||(LA88_0>=L_this && LA88_0<=L_random)||LA88_0==MODULE_KEY||LA88_0==A_NOT||LA88_0==U_NOT||LA88_0==TILDE) ) {s = 13;}

                         
                        input.seek(index88_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA88_1 = input.LA(1);

                         
                        int index88_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_babel17()) ) {s = 3;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index88_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA88_2 = input.LA(1);

                         
                        int index88_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_babel17()) ) {s = 3;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index88_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA88_4 = input.LA(1);

                         
                        int index88_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_babel17()) ) {s = 3;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index88_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA88_5 = input.LA(1);

                         
                        int index88_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_babel17()) ) {s = 3;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index88_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA88_6 = input.LA(1);

                         
                        int index88_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_babel17()) ) {s = 3;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index88_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA88_7 = input.LA(1);

                         
                        int index88_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_babel17()) ) {s = 3;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index88_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA88_8 = input.LA(1);

                         
                        int index88_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_babel17()) ) {s = 3;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index88_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA88_9 = input.LA(1);

                         
                        int index88_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_babel17()) ) {s = 3;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index88_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA88_10 = input.LA(1);

                         
                        int index88_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_babel17()) ) {s = 3;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index88_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA88_11 = input.LA(1);

                         
                        int index88_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_babel17()) ) {s = 3;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index88_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA88_12 = input.LA(1);

                         
                        int index88_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_babel17()) ) {s = 3;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index88_12);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 88, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA89_eotS =
        "\32\uffff";
    static final String DFA89_eofS =
        "\32\uffff";
    static final String DFA89_minS =
        "\1\64\2\0\1\uffff\11\0\15\uffff";
    static final String DFA89_maxS =
        "\1\u0091\2\0\1\uffff\11\0\15\uffff";
    static final String DFA89_acceptS =
        "\3\uffff\1\1\11\uffff\1\1\1\2\13\uffff";
    static final String DFA89_specialS =
        "\1\0\1\1\1\2\1\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\15"+
        "\uffff}>";
    static final String[] DFA89_transitionS = {
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

    static final short[] DFA89_eot = DFA.unpackEncodedString(DFA89_eotS);
    static final short[] DFA89_eof = DFA.unpackEncodedString(DFA89_eofS);
    static final char[] DFA89_min = DFA.unpackEncodedStringToUnsignedChars(DFA89_minS);
    static final char[] DFA89_max = DFA.unpackEncodedStringToUnsignedChars(DFA89_maxS);
    static final short[] DFA89_accept = DFA.unpackEncodedString(DFA89_acceptS);
    static final short[] DFA89_special = DFA.unpackEncodedString(DFA89_specialS);
    static final short[][] DFA89_transition;

    static {
        int numStates = DFA89_transitionS.length;
        DFA89_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA89_transition[i] = DFA.unpackEncodedString(DFA89_transitionS[i]);
        }
    }

    class DFA89 extends DFA {

        public DFA89(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 89;
            this.eot = DFA89_eot;
            this.eof = DFA89_eof;
            this.min = DFA89_min;
            this.max = DFA89_max;
            this.accept = DFA89_accept;
            this.special = DFA89_special;
            this.transition = DFA89_transition;
        }
        public String getDescription() {
            return "491:1: p_lop_expr : ( ( protected_lambda_expr )=> protected_lambda_expr | p_op_expr );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA89_0 = input.LA(1);

                         
                        int index89_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA89_0==Constr) ) {s = 1;}

                        else if ( (LA89_0==Id) ) {s = 2;}

                        else if ( (LA89_0==UNDERSCORE) && (synpred5_babel17())) {s = 3;}

                        else if ( (LA89_0==String) ) {s = 4;}

                        else if ( (LA89_0==Num) ) {s = 5;}

                        else if ( (LA89_0==L_true) ) {s = 6;}

                        else if ( (LA89_0==L_false) ) {s = 7;}

                        else if ( ((LA89_0>=A_infinity && LA89_0<=U_infinity)) ) {s = 8;}

                        else if ( (LA89_0==MINUS) ) {s = 9;}

                        else if ( (LA89_0==SQUARE_BRACKET_OPEN) ) {s = 10;}

                        else if ( (LA89_0==ROUND_BRACKET_OPEN) ) {s = 11;}

                        else if ( (LA89_0==CURLY_BRACKET_OPEN) ) {s = 12;}

                        else if ( (LA89_0==L_case) && (synpred5_babel17())) {s = 13;}

                        else if ( (LA89_0==L_begin||(LA89_0>=L_with && LA89_0<=L_if)||(LA89_0>=L_while && LA89_0<=L_for)||LA89_0==L_match||LA89_0==L_exception||LA89_0==L_root||(LA89_0>=L_concurrent && LA89_0<=L_lazy)||(LA89_0>=L_this && LA89_0<=L_random)||LA89_0==MODULE_KEY||LA89_0==A_NOT||LA89_0==U_NOT||LA89_0==TILDE) ) {s = 14;}

                         
                        input.seek(index89_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA89_1 = input.LA(1);

                         
                        int index89_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_babel17()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index89_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA89_2 = input.LA(1);

                         
                        int index89_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_babel17()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index89_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA89_4 = input.LA(1);

                         
                        int index89_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_babel17()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index89_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA89_5 = input.LA(1);

                         
                        int index89_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_babel17()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index89_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA89_6 = input.LA(1);

                         
                        int index89_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_babel17()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index89_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA89_7 = input.LA(1);

                         
                        int index89_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_babel17()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index89_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA89_8 = input.LA(1);

                         
                        int index89_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_babel17()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index89_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA89_9 = input.LA(1);

                         
                        int index89_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_babel17()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index89_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA89_10 = input.LA(1);

                         
                        int index89_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_babel17()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index89_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA89_11 = input.LA(1);

                         
                        int index89_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_babel17()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index89_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA89_12 = input.LA(1);

                         
                        int index89_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_babel17()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index89_12);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 89, _s, input);
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
    public static final BitSet FOLLOW_L_val_in_st_val2201 = new BitSet(new long[]{0x0000000000000000L,0x0000010000600600L,0x000000000002ADE0L});
    public static final BitSet FOLLOW_NL_in_st_val2203 = new BitSet(new long[]{0x0000000000000000L,0x0000010000600600L,0x000000000002ADE0L});
    public static final BitSet FOLLOW_pattern_in_st_val2206 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_st_val2208 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ASSIGN_in_st_val2211 = new BitSet(new long[]{0xB1D0000000000000L,0x0009210007FFFE5BL,0x000000000002ADE4L});
    public static final BitSet FOLLOW_NL_in_st_val2213 = new BitSet(new long[]{0xB1D0000000000000L,0x0009210007FFFE5BL,0x000000000002ADE4L});
    public static final BitSet FOLLOW_expr_in_st_val2216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attribute_in_st_def2234 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_st_def2236 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_L_def_in_st_def2241 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000A0L});
    public static final BitSet FOLLOW_NL_in_st_def2243 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_Id_in_st_def2246 = new BitSet(new long[]{0x0000000020000000L,0x0000010000600600L,0x000000000002ADA0L});
    public static final BitSet FOLLOW_NL_in_st_def2248 = new BitSet(new long[]{0x0000000020000000L,0x0000010000600600L,0x000000000002ADA0L});
    public static final BitSet FOLLOW_primitive_pattern_in_st_def2252 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_st_def2254 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ASSIGN_in_st_def2259 = new BitSet(new long[]{0xB1D0000000000000L,0x0009210007FFFE5BL,0x000000000002ADE4L});
    public static final BitSet FOLLOW_NL_in_st_def2261 = new BitSet(new long[]{0xB1D0000000000000L,0x0009210007FFFE5BL,0x000000000002ADE4L});
    public static final BitSet FOLLOW_expr_in_st_def2264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_yield_in_st_yield2296 = new BitSet(new long[]{0xB1D0000000000000L,0x0009210007FFFE5BL,0x000000000002ADE4L});
    public static final BitSet FOLLOW_expr_in_st_yield2298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_private_in_attribute2319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_public_in_attribute2332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_protected_in_attribute2345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_module_decl_in_st_module2363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_module_def_in_st_module2368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attribute_in_st_module_decl2379 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_st_module_decl2381 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_L_external_in_st_module_decl2386 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_st_module_decl2388 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_L_module_in_st_module_decl2391 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000A0L});
    public static final BitSet FOLLOW_NL_in_st_module_decl2393 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000A0L});
    public static final BitSet FOLLOW_module_path_in_st_module_decl2396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attribute_in_st_module_def2426 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_st_module_def2428 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_L_module_in_st_module_def2433 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000A0L});
    public static final BitSet FOLLOW_NL_in_st_module_def2435 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000A0L});
    public static final BitSet FOLLOW_module_path_in_st_module_def2438 = new BitSet(new long[]{0xB1F0000000000000L,0x0009214007FFFE5BL,0x000000000002ADE4L});
    public static final BitSet FOLLOW_block_in_st_module_def2440 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_L_end_in_st_module_def2442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_package_in_st_package2478 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000A0L});
    public static final BitSet FOLLOW_NL_in_st_package2480 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000A0L});
    public static final BitSet FOLLOW_module_path_in_st_package2483 = new BitSet(new long[]{0xB1F0000000000000L,0x0009214007FFFE5BL,0x000000000002ADE4L});
    public static final BitSet FOLLOW_block_in_st_package2485 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_L_end_in_st_package2487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Id_in_module_path2517 = new BitSet(new long[]{0x0000000000000002L,0x8000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_module_path2520 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_PERIOD_in_module_path2523 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000A0L});
    public static final BitSet FOLLOW_NL_in_module_path2525 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_Id_in_module_path2528 = new BitSet(new long[]{0x0000000000000002L,0x8000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_L_memoize_in_st_memoize2549 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000880L});
    public static final BitSet FOLLOW_memid_in_st_memoize2551 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000880L});
    public static final BitSet FOLLOW_Id_in_memid2575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROUND_BRACKET_OPEN_in_memid2588 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_Id_in_memid2590 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ROUND_BRACKET_CLOSE_in_memid2592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_expr_or_assign2625 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_expr_or_assign2627 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ASSIGN_in_expr_or_assign2630 = new BitSet(new long[]{0xB1D0000000000000L,0x0009210007FFFE5BL,0x000000000002ADE4L});
    public static final BitSet FOLLOW_NL_in_expr_or_assign2632 = new BitSet(new long[]{0xB1D0000000000000L,0x0009210007FFFE5BL,0x000000000002ADE4L});
    public static final BitSet FOLLOW_expr_in_expr_or_assign2635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_or_assign2650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lop_expr_in_expr2661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_obj_expr_in_expr2666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_expr_in_control_expr2676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_do_expr_in_control_expr2681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_match_expr_in_control_expr2686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_expr_in_control_expr2691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_begin_end_in_control_expr2696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_control_expr_in_with_control_expr2706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_with_in_with_control_expr2711 = new BitSet(new long[]{0x31D0000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_NL_in_with_control_expr2713 = new BitSet(new long[]{0x31D0000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_protected_expr_in_with_control_expr2716 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040020L});
    public static final BitSet FOLLOW_NL_in_with_control_expr2718 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_COLON_in_with_control_expr2721 = new BitSet(new long[]{0x3110000000000000L,0x0000000000000001L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_with_control_expr2723 = new BitSet(new long[]{0x3110000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_control_expr_in_with_control_expr2726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_lop_expr_in_protected_expr2747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_obj_expr_in_protected_expr2752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_begin_in_begin_end2764 = new BitSet(new long[]{0xB1F0000000000000L,0x0009214007FFFE5BL,0x000000000002ADE4L});
    public static final BitSet FOLLOW_block_in_begin_end2766 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_L_end_in_begin_end2768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_obj_in_obj_expr2784 = new BitSet(new long[]{0xB1F0000000000000L,0x0009214007FFFE5BL,0x000000000002ADE4L});
    public static final BitSet FOLLOW_block_in_obj_expr2786 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_L_end_in_obj_expr2788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_expr_in_lop_expr2819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_op_expr_in_lop_expr2824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protected_lambda_expr_in_p_lop_expr2840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_op_expr_in_p_lop_expr2845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_if_in_if_expr2856 = new BitSet(new long[]{0x31D0000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_NL_in_if_expr2858 = new BitSet(new long[]{0x31D0000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_protected_expr_in_if_expr2861 = new BitSet(new long[]{0x0200000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_if_expr2863 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_L_then_in_if_expr2866 = new BitSet(new long[]{0xBDF0000000000000L,0x0009214007FFFE5BL,0x000000000002ADE4L});
    public static final BitSet FOLLOW_block_in_if_expr2868 = new BitSet(new long[]{0x0C20000000000000L});
    public static final BitSet FOLLOW_L_elseif_in_if_expr2874 = new BitSet(new long[]{0x31D0000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_NL_in_if_expr2876 = new BitSet(new long[]{0x31D0000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_protected_expr_in_if_expr2879 = new BitSet(new long[]{0x0200000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_if_expr2881 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_L_then_in_if_expr2884 = new BitSet(new long[]{0xBDF0000000000000L,0x0009214007FFFE5BL,0x000000000002ADE4L});
    public static final BitSet FOLLOW_block_in_if_expr2886 = new BitSet(new long[]{0x0C20000000000000L});
    public static final BitSet FOLLOW_L_else_in_if_expr2894 = new BitSet(new long[]{0xB1F0000000000000L,0x0009214007FFFE5BL,0x000000000002ADE4L});
    public static final BitSet FOLLOW_block_in_if_expr2896 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_L_end_in_if_expr2900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_while_in_while_do_expr2924 = new BitSet(new long[]{0x31D0000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_NL_in_while_do_expr2926 = new BitSet(new long[]{0x31D0000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_protected_expr_in_while_do_expr2929 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_while_do_expr2931 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_L_do_in_while_do_expr2934 = new BitSet(new long[]{0xB1F0000000000000L,0x0009214007FFFE5BL,0x000000000002ADE4L});
    public static final BitSet FOLLOW_block_in_while_do_expr2936 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_L_end_in_while_do_expr2938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_full_cases_in_cases2968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_cases2973 = new BitSet(new long[]{0x0000000000000000L,0x0600000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_cases2975 = new BitSet(new long[]{0x0000000000000000L,0x0600000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_token_DOUBLE_ARROW_in_cases2978 = new BitSet(new long[]{0xB1D0000000000000L,0x0009214007FFFE5BL,0x000000000002ADE4L});
    public static final BitSet FOLLOW_block_in_cases2980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_case_expr_in_full_cases3003 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_L_case_in_case_expr3024 = new BitSet(new long[]{0x0000000000000000L,0x0000010000600600L,0x000000000002ADE0L});
    public static final BitSet FOLLOW_NL_in_case_expr3026 = new BitSet(new long[]{0x0000000000000000L,0x0000010000600600L,0x000000000002ADE0L});
    public static final BitSet FOLLOW_pattern_in_case_expr3029 = new BitSet(new long[]{0x0000000000000000L,0x0600000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_case_expr3031 = new BitSet(new long[]{0x0000000000000000L,0x0600000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_token_DOUBLE_ARROW_in_case_expr3034 = new BitSet(new long[]{0xB1D0000000000000L,0x0009214007FFFE5BL,0x000000000002ADE4L});
    public static final BitSet FOLLOW_block_in_case_expr3036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_match_in_match_expr3057 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_NL_in_match_expr3059 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_p_op_expr_in_match_expr3062 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_match_expr3064 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_full_cases_in_match_expr3067 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_L_end_in_match_expr3069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_cases_in_lambda_expr3095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_lambda_cases3113 = new BitSet(new long[]{0x0000000000000000L,0x0600000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_lambda_cases3115 = new BitSet(new long[]{0x0000000000000000L,0x0600000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_token_DOUBLE_ARROW_in_lambda_cases3118 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_NL_in_lambda_cases3120 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_lop_expr_in_lambda_cases3123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protected_lambda_cases_in_protected_lambda_expr3151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_case_in_p_lambda_case_expr3169 = new BitSet(new long[]{0x0000000000000000L,0x0000010000600600L,0x000000000002ADE0L});
    public static final BitSet FOLLOW_NL_in_p_lambda_case_expr3171 = new BitSet(new long[]{0x0000000000000000L,0x0000010000600600L,0x000000000002ADE0L});
    public static final BitSet FOLLOW_pattern_in_p_lambda_case_expr3174 = new BitSet(new long[]{0x0000000000000000L,0x0600000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_p_lambda_case_expr3176 = new BitSet(new long[]{0x0000000000000000L,0x0600000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_token_DOUBLE_ARROW_in_p_lambda_case_expr3179 = new BitSet(new long[]{0xB1D0000000000000L,0x0009210007FFFE5BL,0x000000000002ADE4L});
    public static final BitSet FOLLOW_NL_in_p_lambda_case_expr3181 = new BitSet(new long[]{0xB1D0000000000000L,0x0009210007FFFE5BL,0x000000000002ADE4L});
    public static final BitSet FOLLOW_pure_block_in_p_lambda_case_expr3184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_protected_lambda_cases3205 = new BitSet(new long[]{0x0000000000000000L,0x0600000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_protected_lambda_cases3207 = new BitSet(new long[]{0x0000000000000000L,0x0600000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_token_DOUBLE_ARROW_in_protected_lambda_cases3210 = new BitSet(new long[]{0xB1D0000000000000L,0x0009210007FFFE5BL,0x000000000002ADE4L});
    public static final BitSet FOLLOW_NL_in_protected_lambda_cases3212 = new BitSet(new long[]{0xB1D0000000000000L,0x0009210007FFFE5BL,0x000000000002ADE4L});
    public static final BitSet FOLLOW_pure_block_in_protected_lambda_cases3215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_lambda_case_expr_in_protected_lambda_cases3234 = new BitSet(new long[]{0x0000000000000002L,0x0000010000600602L,0x000000000002ADE0L});
    public static final BitSet FOLLOW_L_for_in_for_expr3251 = new BitSet(new long[]{0x0000000000000000L,0x0000010000600600L,0x000000000002ADE0L});
    public static final BitSet FOLLOW_NL_in_for_expr3253 = new BitSet(new long[]{0x0000000000000000L,0x0000010000600600L,0x000000000002ADE0L});
    public static final BitSet FOLLOW_pattern_in_for_expr3256 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_for_expr3258 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_L_in_in_for_expr3261 = new BitSet(new long[]{0x31D0000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_NL_in_for_expr3263 = new BitSet(new long[]{0x31D0000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_protected_expr_in_for_expr3266 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_for_expr3268 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_L_do_in_for_expr3271 = new BitSet(new long[]{0xB1F0000000000000L,0x0009214007FFFE5BL,0x000000000002ADE4L});
    public static final BitSet FOLLOW_block_in_for_expr3273 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_L_end_in_for_expr3275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_builtin_primitive_in_op_expr3300 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_op_expr_in_op_expr3303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bool_expr_in_op_expr3308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_builtin_primitive_in_p_op_expr3318 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_NL_in_p_op_expr3321 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_p_op_expr_in_p_op_expr3325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_bool_expr_in_p_op_expr3330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_builtin_primitive0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bool_or_expr_in_bool_expr3370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_bool_or_expr_in_p_bool_expr3380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bool_and_expr_in_bool_or_expr3389 = new BitSet(new long[]{0x0000000000000002L,0x0002400000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_bool_or_expr3392 = new BitSet(new long[]{0x0000000000000000L,0x0002400000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_token_OR_in_bool_or_expr3396 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_NL_in_bool_or_expr3399 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_bool_and_expr_in_bool_or_expr3403 = new BitSet(new long[]{0x0000000000000002L,0x0002400000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_p_bool_and_expr_in_p_bool_or_expr3415 = new BitSet(new long[]{0x0000000000000002L,0x0002400000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_p_bool_or_expr3418 = new BitSet(new long[]{0x0000000000000000L,0x0002400000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_token_OR_in_p_bool_or_expr3422 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_NL_in_p_bool_or_expr3425 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_p_bool_and_expr_in_p_bool_or_expr3429 = new BitSet(new long[]{0x0000000000000002L,0x0002400000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_bool_not_expr_in_bool_and_expr3441 = new BitSet(new long[]{0x0000000000000002L,0x0004800000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_bool_and_expr3444 = new BitSet(new long[]{0x0000000000000000L,0x0004800000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_token_AND_in_bool_and_expr3448 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_NL_in_bool_and_expr3451 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_bool_not_expr_in_bool_and_expr3455 = new BitSet(new long[]{0x0000000000000002L,0x0004800000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_p_bool_not_expr_in_p_bool_and_expr3467 = new BitSet(new long[]{0x0000000000000002L,0x0004800000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_p_bool_and_expr3470 = new BitSet(new long[]{0x0000000000000000L,0x0004800000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_token_AND_in_p_bool_and_expr3474 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_NL_in_p_bool_and_expr3477 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_p_bool_not_expr_in_p_bool_and_expr3481 = new BitSet(new long[]{0x0000000000000002L,0x0004800000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_token_NOT_in_bool_not_expr3493 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_NL_in_bool_not_expr3496 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_bool_not_expr_in_bool_not_expr3500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rel_expr_in_bool_not_expr3505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_NOT_in_p_bool_not_expr3516 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_NL_in_p_bool_not_expr3519 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_p_bool_not_expr_in_p_bool_not_expr3523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_rel_expr_in_p_bool_not_expr3528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arith_expr_in_rel_expr3537 = new BitSet(new long[]{0x0000000000000002L,0x0000003FF8000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_rel_expr3540 = new BitSet(new long[]{0x0000000000000000L,0x0000003FF8000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_rel_op_in_rel_expr3543 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_NL_in_rel_expr3545 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_arith_expr_in_rel_expr3548 = new BitSet(new long[]{0x0000000000000002L,0x0000003FF8000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_p_arith_expr_in_p_rel_expr3575 = new BitSet(new long[]{0x0000000000000002L,0x0000003FF8000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_p_rel_expr3578 = new BitSet(new long[]{0x0000000000000000L,0x0000003FF8000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_rel_op_in_p_rel_expr3581 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_NL_in_p_rel_expr3583 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_p_arith_expr_in_p_rel_expr3586 = new BitSet(new long[]{0x0000000000000002L,0x0000003FF8000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_token_EQUAL_in_rel_op3612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_NOT_EQUAL_in_rel_op3616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNRELATED_in_rel_op3620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATER_in_rel_op3624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_GREATER_EQ_in_rel_op3628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_in_rel_op3632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_LESS_EQ_in_rel_op3636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_plusplus_expr_in_arith_expr3648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_plusplus_expr_in_p_arith_expr3658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timestimes_expr_in_plusplus_expr3668 = new BitSet(new long[]{0x0000000000000002L,0x0180000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_plusplus_expr3671 = new BitSet(new long[]{0x0000000000000000L,0x0180000000000000L});
    public static final BitSet FOLLOW_PLUSPLUS_in_plusplus_expr3676 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_MINUSMINUS_in_plusplus_expr3679 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_NL_in_plusplus_expr3683 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_timestimes_expr_in_plusplus_expr3687 = new BitSet(new long[]{0x0000000000000002L,0x0180000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_p_timestimes_expr_in_p_plusplus_expr3699 = new BitSet(new long[]{0x0000000000000002L,0x0180000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_p_plusplus_expr3702 = new BitSet(new long[]{0x0000000000000000L,0x0180000000000000L});
    public static final BitSet FOLLOW_PLUSPLUS_in_p_plusplus_expr3707 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_MINUSMINUS_in_p_plusplus_expr3710 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_NL_in_p_plusplus_expr3714 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_p_timestimes_expr_in_p_plusplus_expr3718 = new BitSet(new long[]{0x0000000000000002L,0x0180000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_simple_expr_in_timestimes_expr3730 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_timestimes_expr3733 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_TIMESTIMES_in_timestimes_expr3738 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_NL_in_timestimes_expr3742 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_simple_expr_in_timestimes_expr3746 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_p_simple_expr_in_p_timestimes_expr3759 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_p_timestimes_expr3762 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_TIMESTIMES_in_p_timestimes_expr3767 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_NL_in_p_timestimes_expr3771 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_p_simple_expr_in_p_timestimes_expr3775 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_cons_expr_in_simple_expr3786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_cons_expr_in_p_simple_expr3795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_to_expr_in_cons_expr3804 = new BitSet(new long[]{0x0000000000000002L,0x0030000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_cons_expr3807 = new BitSet(new long[]{0x0000000000000000L,0x0030000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_token_DOUBLE_COLON_in_cons_expr3810 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_NL_in_cons_expr3812 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_to_expr_in_cons_expr3815 = new BitSet(new long[]{0x0000000000000002L,0x0030000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_p_to_expr_in_p_cons_expr3835 = new BitSet(new long[]{0x0000000000000002L,0x0030000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_p_cons_expr3838 = new BitSet(new long[]{0x0000000000000000L,0x0030000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_token_DOUBLE_COLON_in_p_cons_expr3841 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_NL_in_p_cons_expr3843 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_p_to_expr_in_p_cons_expr3846 = new BitSet(new long[]{0x0000000000000002L,0x0030000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_arith_plus_expr_in_to_expr3866 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000180L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_to_expr3869 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000180L});
    public static final BitSet FOLLOW_L_to_in_to_expr3874 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_L_downto_in_to_expr3878 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_NL_in_to_expr3882 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_arith_plus_expr_in_to_expr3886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_arith_plus_expr_in_p_to_expr3899 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000180L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_p_to_expr3902 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000180L});
    public static final BitSet FOLLOW_L_to_in_p_to_expr3907 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_L_downto_in_p_to_expr3911 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_NL_in_p_to_expr3915 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_p_arith_plus_expr_in_p_to_expr3919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arith_uminus_expr_in_arith_plus_expr3931 = new BitSet(new long[]{0x0000000000000002L,0x0000018000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_arith_plus_expr3935 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_PLUS_in_arith_plus_expr3939 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_MINUS_in_arith_plus_expr3944 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_NL_in_arith_plus_expr3948 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_arith_uminus_expr_in_arith_plus_expr3952 = new BitSet(new long[]{0x0000000000000002L,0x0000018000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_p_arith_uminus_expr_in_p_arith_plus_expr3963 = new BitSet(new long[]{0x0000000000000002L,0x0000018000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_p_arith_plus_expr3966 = new BitSet(new long[]{0x0000000000000000L,0x0000018000000000L});
    public static final BitSet FOLLOW_set_in_p_arith_plus_expr3970 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_NL_in_p_arith_plus_expr3979 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_p_arith_uminus_expr_in_p_arith_plus_expr3983 = new BitSet(new long[]{0x0000000000000002L,0x0000018000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_MINUS_in_arith_uminus_expr3996 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_NL_in_arith_uminus_expr3998 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_arith_mult_expr_in_arith_uminus_expr4001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arith_mult_expr_in_arith_uminus_expr4014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_p_arith_uminus_expr4025 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_NL_in_p_arith_uminus_expr4027 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_p_arith_mult_expr_in_p_arith_uminus_expr4030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_arith_mult_expr_in_p_arith_uminus_expr4043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arith_pow_expr_in_arith_mult_expr4052 = new BitSet(new long[]{0x0000000000000002L,0x00000E0000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_arith_mult_expr4055 = new BitSet(new long[]{0x0000000000000000L,0x00000E0000000000L});
    public static final BitSet FOLLOW_set_in_arith_mult_expr4059 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_NL_in_arith_mult_expr4072 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_arith_pow_expr_in_arith_mult_expr4076 = new BitSet(new long[]{0x0000000000000002L,0x00000E0000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_p_arith_pow_expr_in_p_arith_mult_expr4088 = new BitSet(new long[]{0x0000000000000002L,0x00000E0000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_p_arith_mult_expr4091 = new BitSet(new long[]{0x0000000000000000L,0x00000E0000000000L});
    public static final BitSet FOLLOW_set_in_p_arith_mult_expr4095 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_NL_in_p_arith_mult_expr4108 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_p_arith_pow_expr_in_p_arith_mult_expr4112 = new BitSet(new long[]{0x0000000000000002L,0x00000E0000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_apply_expr_in_arith_pow_expr4123 = new BitSet(new long[]{0x0000000000000002L,0x0000100000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_arith_pow_expr4126 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_POW_tok_in_arith_pow_expr4129 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_NL_in_arith_pow_expr4131 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_apply_expr_in_arith_pow_expr4134 = new BitSet(new long[]{0x0000000000000002L,0x0000100000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_p_apply_expr_in_p_arith_pow_expr4155 = new BitSet(new long[]{0x0000000000000002L,0x0000100000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_p_arith_pow_expr4158 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_POW_tok_in_p_arith_pow_expr4161 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_NL_in_p_arith_pow_expr4163 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_p_apply_expr_in_p_arith_pow_expr4166 = new BitSet(new long[]{0x0000000000000002L,0x0000100000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_basic_expr_in_apply_expr4187 = new BitSet(new long[]{0x3190000000000002L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_p_basic_expr_in_p_apply_expr4205 = new BitSet(new long[]{0x3190000000000002L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_NL_in_p_apply_expr4208 = new BitSet(new long[]{0x3190000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_p_basic_expr_in_p_apply_expr4211 = new BitSet(new long[]{0x3190000000000002L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_message_send_expr_in_basic_expr4231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_message_send_expr_in_p_basic_expr4240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitive_expr_in_message_send_expr4249 = new BitSet(new long[]{0x0000000000000002L,0x8000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_message_send_expr4252 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_PERIOD_in_message_send_expr4255 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000A0L});
    public static final BitSet FOLLOW_NL_in_message_send_expr4257 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_Id_in_message_send_expr4260 = new BitSet(new long[]{0x0000000000000002L,0x8000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_SQUARE_BRACKET_OPEN_in_list_expr4284 = new BitSet(new long[]{0x31D0000000000000L,0x0009210003EE8643L,0x000000000002EDE4L});
    public static final BitSet FOLLOW_NL_in_list_expr4286 = new BitSet(new long[]{0x31D0000000000000L,0x0009210003EE8643L,0x000000000002EDE4L});
    public static final BitSet FOLLOW_protected_expr_in_list_expr4290 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004021L});
    public static final BitSet FOLLOW_NL_in_list_expr4293 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_COMMA_in_list_expr4296 = new BitSet(new long[]{0x31D0000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_NL_in_list_expr4298 = new BitSet(new long[]{0x31D0000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_protected_expr_in_list_expr4301 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004021L});
    public static final BitSet FOLLOW_NL_in_list_expr4305 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_SQUARE_BRACKET_CLOSE_in_list_expr4310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROUND_BRACKET_OPEN_in_list_expr4324 = new BitSet(new long[]{0x31D0000000000000L,0x0009210003EE8643L,0x000000000002BDE4L});
    public static final BitSet FOLLOW_NL_in_list_expr4326 = new BitSet(new long[]{0x31D0000000000000L,0x0009210003EE8643L,0x000000000002BDE4L});
    public static final BitSet FOLLOW_protected_expr_in_list_expr4330 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001021L});
    public static final BitSet FOLLOW_NL_in_list_expr4333 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_COMMA_in_list_expr4336 = new BitSet(new long[]{0x31D0000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_NL_in_list_expr4338 = new BitSet(new long[]{0x31D0000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_protected_expr_in_list_expr4341 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001021L});
    public static final BitSet FOLLOW_NL_in_list_expr4345 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001001L});
    public static final BitSet FOLLOW_COMMA_in_list_expr4349 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001020L});
    public static final BitSet FOLLOW_NL_in_list_expr4351 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ROUND_BRACKET_CLOSE_in_list_expr4358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURLY_BRACKET_OPEN_in_map_or_set_expr4387 = new BitSet(new long[]{0x31D0000000000000L,0x0009210003EE8643L,0x000000000003ADE4L});
    public static final BitSet FOLLOW_NL_in_map_or_set_expr4389 = new BitSet(new long[]{0x31D0000000000000L,0x0009210003EE8643L,0x000000000003ADE4L});
    public static final BitSet FOLLOW_map_or_set_elem_expr_in_map_or_set_expr4393 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010021L});
    public static final BitSet FOLLOW_NL_in_map_or_set_expr4395 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010001L});
    public static final BitSet FOLLOW_COMMA_in_map_or_set_expr4399 = new BitSet(new long[]{0x31D0000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_NL_in_map_or_set_expr4401 = new BitSet(new long[]{0x31D0000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_map_or_set_elem_expr_in_map_or_set_expr4404 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010021L});
    public static final BitSet FOLLOW_NL_in_map_or_set_expr4406 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010001L});
    public static final BitSet FOLLOW_CURLY_BRACKET_CLOSE_in_map_or_set_expr4413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURLY_BRACKET_OPEN_in_map_or_set_expr4433 = new BitSet(new long[]{0x0000000000000000L,0x1800000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_map_or_set_expr4435 = new BitSet(new long[]{0x0000000000000000L,0x1800000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_token_ARROW_in_map_or_set_expr4438 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010020L});
    public static final BitSet FOLLOW_NL_in_map_or_set_expr4440 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_CURLY_BRACKET_CLOSE_in_map_or_set_expr4443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protected_expr_in_map_or_set_elem_expr4460 = new BitSet(new long[]{0x0000000000000002L,0x1800000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_map_or_set_elem_expr4464 = new BitSet(new long[]{0x0000000000000000L,0x1800000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_token_ARROW_in_map_or_set_elem_expr4467 = new BitSet(new long[]{0x31D0000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_NL_in_map_or_set_elem_expr4469 = new BitSet(new long[]{0x31D0000000000000L,0x0009210003EE8643L,0x000000000002ADE4L});
    public static final BitSet FOLLOW_protected_expr_in_map_or_set_elem_expr4472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Num_in_primitive_expr4492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_String_in_primitive_expr4497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Id_in_primitive_expr4502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Constr_in_primitive_expr4507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_true_in_primitive_expr4512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_false_in_primitive_expr4517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_this_in_primitive_expr4522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_root_in_primitive_expr4528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_here_in_primitive_expr4533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MODULE_KEY_in_primitive_expr4539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_infinity_in_primitive_expr4544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_list_expr_in_primitive_expr4550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_with_control_expr_in_primitive_expr4555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_map_or_set_expr_in_primitive_expr4560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_prog4570 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_prog4572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Id_in_synpred1_babel171636 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_synpred1_babel171638 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_L_as_in_synpred1_babel171641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protected_expr_in_synpred2_babel171672 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000022L});
    public static final BitSet FOLLOW_NL_in_synpred2_babel171674 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_QUESTION_MARK_in_synpred2_babel171677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_synpred3_babel172615 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NL_in_synpred3_babel172617 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ASSIGN_in_synpred3_babel172620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_expr_in_synpred4_babel172814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protected_lambda_expr_in_synpred5_babel172835 = new BitSet(new long[]{0x0000000000000002L});

}