// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g 2011-04-25 16:53:58

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PROG", "NIL_TOKEN", "ANY", "LAMBDA", "SQUARE_LIST", "ROUND_LIST", "LIST_CONS", "COMPARE", "APPLY", "IF", "MAP_OR_SET_OR_OBJ", "EMPTY_MAP", "EXCEPTION", "MATCH", "TRY", "CASES", "OBJ", "FOR_EXPR", "WHILE_DO", "MESSAGE_SEND", "UMINUS", "POW", "PARENTS_PLUS", "PARENTS_MUL", "BLOCK", "BEGIN", "WITH", "VAL", "OBJELEM_ASSIGN", "ASSIGN", "ARROW", "DEF", "YIELD", "PRIVATE", "TYPEDEF", "TYPEDEF_CLAUSE", "GETTYPE", "MEMOIZE", "ID_STRONG", "ID_WEAK", "IF_PATTERN", "TYPE_PATTERN", "INNERVALUE_PATTERN", "TYPEID", "IMPORTID", "TYPE_EXPR", "TYPEOF", "CONVERSION", "Newline", "NotNewline", "COMMENT", "SmallLetter", "BigLetter", "Letter", "Digit", "Hex", "L_begin", "L_end", "L_obj", "L_with", "L_if", "L_then", "L_else", "L_elseif", "L_while", "L_for", "L_do", "L_yield", "L_match", "L_case", "L_as", "L_val", "L_def", "L_in", "L_exception", "L_to", "L_downto", "L_try", "L_catch", "A_infinity", "U_infinity", "L_concurrent", "L_choose", "L_lazy", "L_memoize", "L_true", "L_false", "L_this", "L_random", "L_nil", "L_div", "L_mod", "L_module", "L_typedef", "L_typeof", "L_private", "L_import", "A_EQUAL", "U_EQUAL", "A_NOT_EQUAL", "U_NOT_EQUAL", "LESS", "A_LESS_EQ", "U_LESS_EQ", "GREATER", "A_GREATER_EQ", "U_GREATER_EQ", "SC", "PLUS", "MINUS", "TIMES", "QUOTIENT", "POW_tok", "A_OR", "A_AND", "A_NOT", "U_OR", "U_AND", "U_NOT", "A_DOUBLE_COLON", "U_DOUBLE_COLON", "TIMESTIMES", "QUOTIENTQUOTIENT", "PLUSPLUS", "MINUSMINUS", "A_DOUBLE_ARROW", "U_DOUBLE_ARROW", "A_ARROW", "U_ARROW", "A_ELLIPSIS", "U_ELLIPSIS", "COMMA", "PERIOD", "QUESTION_MARK", "L_force", "WsChar", "WS", "NL", "Constr", "Id", "Num", "Charcode", "String", "ROUND_BRACKET_OPEN", "ROUND_BRACKET_CLOSE", "SQUARE_BRACKET_OPEN", "SQUARE_BRACKET_CLOSE", "CURLY_BRACKET_OPEN", "CURLY_BRACKET_CLOSE", "UNDERSCORE", "COLON", "PRAGMA_LOG", "PRAGMA_PRINT", "PRAGMA_ASSERT", "PRAGMA_PROFILE"
    };
    public static final int U_AND=121;
    public static final int L_end=61;
    public static final int U_NOT_EQUAL=104;
    public static final int TIMESTIMES=125;
    public static final int BigLetter=56;
    public static final int L_try=81;
    public static final int ROUND_BRACKET_CLOSE=148;
    public static final int IMPORTID=48;
    public static final int L_mod=95;
    public static final int A_OR=117;
    public static final int MINUSMINUS=128;
    public static final int Newline=52;
    public static final int SQUARE_BRACKET_CLOSE=150;
    public static final int MAP_OR_SET_OR_OBJ=14;
    public static final int EOF=-1;
    public static final int U_DOUBLE_ARROW=130;
    public static final int TYPEID=47;
    public static final int L_exception=78;
    public static final int Num=144;
    public static final int GREATER=108;
    public static final int EMPTY_MAP=15;
    public static final int POW=25;
    public static final int L_catch=82;
    public static final int L_concurrent=85;
    public static final int L_false=90;
    public static final int QUOTIENTQUOTIENT=126;
    public static final int L_nil=93;
    public static final int BEGIN=29;
    public static final int LIST_CONS=10;
    public static final int L_with=63;
    public static final int QUESTION_MARK=137;
    public static final int LESS=105;
    public static final int ROUND_BRACKET_OPEN=147;
    public static final int SQUARE_LIST=8;
    public static final int VAL=31;
    public static final int L_as=74;
    public static final int NL=141;
    public static final int MESSAGE_SEND=23;
    public static final int A_ARROW=131;
    public static final int A_DOUBLE_COLON=123;
    public static final int COMMENT=54;
    public static final int L_def=76;
    public static final int A_AND=118;
    public static final int ID_WEAK=43;
    public static final int EXCEPTION=16;
    public static final int TYPE_EXPR=49;
    public static final int L_this=91;
    public static final int L_force=138;
    public static final int L_choose=86;
    public static final int PERIOD=136;
    public static final int PRIVATE=37;
    public static final int L_import=100;
    public static final int SmallLetter=55;
    public static final int NIL_TOKEN=5;
    public static final int PRAGMA_PRINT=156;
    public static final int CURLY_BRACKET_OPEN=151;
    public static final int L_typedef=97;
    public static final int UNDERSCORE=153;
    public static final int MATCH=17;
    public static final int U_LESS_EQ=107;
    public static final int TRY=18;
    public static final int L_to=79;
    public static final int WS=140;
    public static final int Charcode=145;
    public static final int TYPEOF=50;
    public static final int L_do=70;
    public static final int L_val=75;
    public static final int L_match=72;
    public static final int L_obj=62;
    public static final int WsChar=139;
    public static final int L_module=96;
    public static final int GETTYPE=40;
    public static final int Hex=59;
    public static final int L_private=99;
    public static final int TYPE_PATTERN=45;
    public static final int L_for=69;
    public static final int Letter=57;
    public static final int PRAGMA_ASSERT=157;
    public static final int APPLY=12;
    public static final int U_ARROW=132;
    public static final int PRAGMA_LOG=155;
    public static final int A_EQUAL=101;
    public static final int L_else=66;
    public static final int DEF=35;
    public static final int L_typeof=98;
    public static final int L_begin=60;
    public static final int U_NOT=122;
    public static final int L_div=94;
    public static final int L_yield=71;
    public static final int PLUSPLUS=127;
    public static final int L_while=68;
    public static final int CASES=19;
    public static final int POW_tok=116;
    public static final int IF_PATTERN=44;
    public static final int A_ELLIPSIS=133;
    public static final int PARENTS_PLUS=26;
    public static final int A_DOUBLE_ARROW=129;
    public static final int SQUARE_BRACKET_OPEN=149;
    public static final int IF=13;
    public static final int PROG=4;
    public static final int U_OR=120;
    public static final int COMMA=135;
    public static final int OBJ=20;
    public static final int MEMOIZE=41;
    public static final int U_ELLIPSIS=134;
    public static final int TYPEDEF_CLAUSE=39;
    public static final int INNERVALUE_PATTERN=46;
    public static final int YIELD=36;
    public static final int COMPARE=11;
    public static final int U_GREATER_EQ=110;
    public static final int U_EQUAL=102;
    public static final int PLUS=112;
    public static final int String=146;
    public static final int LAMBDA=7;
    public static final int L_true=89;
    public static final int Id=143;
    public static final int A_infinity=83;
    public static final int ID_STRONG=42;
    public static final int WITH=30;
    public static final int L_in=77;
    public static final int A_NOT=119;
    public static final int L_lazy=87;
    public static final int NotNewline=53;
    public static final int L_then=65;
    public static final int QUOTIENT=115;
    public static final int TYPEDEF=38;
    public static final int L_if=64;
    public static final int CURLY_BRACKET_CLOSE=152;
    public static final int UMINUS=24;
    public static final int FOR_EXPR=21;
    public static final int Constr=142;
    public static final int WHILE_DO=22;
    public static final int L_elseif=67;
    public static final int MINUS=113;
    public static final int Digit=58;
    public static final int L_memoize=88;
    public static final int CONVERSION=51;
    public static final int A_GREATER_EQ=109;
    public static final int ROUND_LIST=9;
    public static final int COLON=154;
    public static final int PRAGMA_PROFILE=158;
    public static final int SC=111;
    public static final int L_downto=80;
    public static final int ANY=6;
    public static final int L_random=92;
    public static final int A_NOT_EQUAL=103;
    public static final int BLOCK=28;
    public static final int ASSIGN=33;
    public static final int U_DOUBLE_COLON=124;
    public static final int OBJELEM_ASSIGN=32;
    public static final int ARROW=34;
    public static final int L_case=73;
    public static final int TIMES=114;
    public static final int U_infinity=84;
    public static final int A_LESS_EQ=106;
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



    public static class prog_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prog"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:121:1: prog : block EOF -> ^( PROG block ) ;
    public final babel17Parser.prog_return prog() throws RecognitionException {
        babel17Parser.prog_return retval = new babel17Parser.prog_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EOF2=null;
        babel17Parser.block_return block1 = null;


        CommonTree EOF2_tree=null;
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:121:7: ( block EOF -> ^( PROG block ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:121:9: block EOF
            {
            pushFollow(FOLLOW_block_in_prog228);
            block1=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block1.getTree());
            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_prog230); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EOF.add(EOF2);



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
            // 121:19: -> ^( PROG block )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:121:22: ^( PROG block )
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

    public static class token_infinity_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "token_infinity"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:186:1: token_infinity : ( A_infinity | U_infinity );
    public final babel17Parser.token_infinity_return token_infinity() throws RecognitionException {
        babel17Parser.token_infinity_return retval = new babel17Parser.token_infinity_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set3=null;

        CommonTree set3_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:187:2: ( A_infinity | U_infinity )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set3=(Token)input.LT(1);
            if ( (input.LA(1)>=A_infinity && input.LA(1)<=U_infinity) ) {
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
    // $ANTLR end "token_infinity"

    public static class token_EQUAL_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "token_EQUAL"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:229:1: token_EQUAL : ( A_EQUAL | U_EQUAL );
    public final babel17Parser.token_EQUAL_return token_EQUAL() throws RecognitionException {
        babel17Parser.token_EQUAL_return retval = new babel17Parser.token_EQUAL_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set4=null;

        CommonTree set4_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:230:2: ( A_EQUAL | U_EQUAL )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set4=(Token)input.LT(1);
            if ( (input.LA(1)>=A_EQUAL && input.LA(1)<=U_EQUAL) ) {
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
    // $ANTLR end "token_EQUAL"

    public static class token_NOT_EQUAL_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "token_NOT_EQUAL"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:237:1: token_NOT_EQUAL : ( A_NOT_EQUAL | U_NOT_EQUAL );
    public final babel17Parser.token_NOT_EQUAL_return token_NOT_EQUAL() throws RecognitionException {
        babel17Parser.token_NOT_EQUAL_return retval = new babel17Parser.token_NOT_EQUAL_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set5=null;

        CommonTree set5_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:238:2: ( A_NOT_EQUAL | U_NOT_EQUAL )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set5=(Token)input.LT(1);
            if ( (input.LA(1)>=A_NOT_EQUAL && input.LA(1)<=U_NOT_EQUAL) ) {
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
    // $ANTLR end "token_NOT_EQUAL"

    public static class token_LESS_EQ_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "token_LESS_EQ"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:246:1: token_LESS_EQ : ( A_LESS_EQ | U_LESS_EQ );
    public final babel17Parser.token_LESS_EQ_return token_LESS_EQ() throws RecognitionException {
        babel17Parser.token_LESS_EQ_return retval = new babel17Parser.token_LESS_EQ_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set6=null;

        CommonTree set6_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:247:2: ( A_LESS_EQ | U_LESS_EQ )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set6=(Token)input.LT(1);
            if ( (input.LA(1)>=A_LESS_EQ && input.LA(1)<=U_LESS_EQ) ) {
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
    // $ANTLR end "token_LESS_EQ"

    public static class token_GREATER_EQ_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "token_GREATER_EQ"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:256:1: token_GREATER_EQ : ( A_GREATER_EQ | U_GREATER_EQ );
    public final babel17Parser.token_GREATER_EQ_return token_GREATER_EQ() throws RecognitionException {
        babel17Parser.token_GREATER_EQ_return retval = new babel17Parser.token_GREATER_EQ_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set7=null;

        CommonTree set7_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:257:2: ( A_GREATER_EQ | U_GREATER_EQ )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set7=(Token)input.LT(1);
            if ( (input.LA(1)>=A_GREATER_EQ && input.LA(1)<=U_GREATER_EQ) ) {
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
    // $ANTLR end "token_GREATER_EQ"

    public static class token_OR_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "token_OR"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:274:1: token_OR : ( A_OR | U_OR );
    public final babel17Parser.token_OR_return token_OR() throws RecognitionException {
        babel17Parser.token_OR_return retval = new babel17Parser.token_OR_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set8=null;

        CommonTree set8_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:274:9: ( A_OR | U_OR )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set8=(Token)input.LT(1);
            if ( input.LA(1)==A_OR||input.LA(1)==U_OR ) {
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
    // $ANTLR end "token_OR"

    public static class token_AND_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "token_AND"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:275:1: token_AND : ( A_AND | U_AND );
    public final babel17Parser.token_AND_return token_AND() throws RecognitionException {
        babel17Parser.token_AND_return retval = new babel17Parser.token_AND_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set9=null;

        CommonTree set9_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:276:2: ( A_AND | U_AND )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set9=(Token)input.LT(1);
            if ( input.LA(1)==A_AND||input.LA(1)==U_AND ) {
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
    // $ANTLR end "token_AND"

    public static class token_NOT_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "token_NOT"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:277:1: token_NOT : ( A_NOT | U_NOT );
    public final babel17Parser.token_NOT_return token_NOT() throws RecognitionException {
        babel17Parser.token_NOT_return retval = new babel17Parser.token_NOT_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set10=null;

        CommonTree set10_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:278:2: ( A_NOT | U_NOT )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set10=(Token)input.LT(1);
            if ( input.LA(1)==A_NOT||input.LA(1)==U_NOT ) {
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
    // $ANTLR end "token_NOT"

    public static class token_DOUBLE_COLON_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "token_DOUBLE_COLON"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:284:1: token_DOUBLE_COLON : ( A_DOUBLE_COLON | U_DOUBLE_COLON );
    public final babel17Parser.token_DOUBLE_COLON_return token_DOUBLE_COLON() throws RecognitionException {
        babel17Parser.token_DOUBLE_COLON_return retval = new babel17Parser.token_DOUBLE_COLON_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set11=null;

        CommonTree set11_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:285:2: ( A_DOUBLE_COLON | U_DOUBLE_COLON )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set11=(Token)input.LT(1);
            if ( (input.LA(1)>=A_DOUBLE_COLON && input.LA(1)<=U_DOUBLE_COLON) ) {
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
    // $ANTLR end "token_DOUBLE_COLON"

    public static class token_DOUBLE_ARROW_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "token_DOUBLE_ARROW"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:301:1: token_DOUBLE_ARROW : ( A_DOUBLE_ARROW | U_DOUBLE_ARROW );
    public final babel17Parser.token_DOUBLE_ARROW_return token_DOUBLE_ARROW() throws RecognitionException {
        babel17Parser.token_DOUBLE_ARROW_return retval = new babel17Parser.token_DOUBLE_ARROW_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set12=null;

        CommonTree set12_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:302:2: ( A_DOUBLE_ARROW | U_DOUBLE_ARROW )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set12=(Token)input.LT(1);
            if ( (input.LA(1)>=A_DOUBLE_ARROW && input.LA(1)<=U_DOUBLE_ARROW) ) {
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
    // $ANTLR end "token_DOUBLE_ARROW"

    public static class token_ARROW_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "token_ARROW"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:306:1: token_ARROW : ( A_ARROW | U_ARROW );
    public final babel17Parser.token_ARROW_return token_ARROW() throws RecognitionException {
        babel17Parser.token_ARROW_return retval = new babel17Parser.token_ARROW_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set13=null;

        CommonTree set13_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:307:2: ( A_ARROW | U_ARROW )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set13=(Token)input.LT(1);
            if ( (input.LA(1)>=A_ARROW && input.LA(1)<=U_ARROW) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set13));
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:312:1: token_ELLIPSIS : ( A_ELLIPSIS | U_ELLIPSIS );
    public final babel17Parser.token_ELLIPSIS_return token_ELLIPSIS() throws RecognitionException {
        babel17Parser.token_ELLIPSIS_return retval = new babel17Parser.token_ELLIPSIS_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set14=null;

        CommonTree set14_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:313:2: ( A_ELLIPSIS | U_ELLIPSIS )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set14=(Token)input.LT(1);
            if ( (input.LA(1)>=A_ELLIPSIS && input.LA(1)<=U_ELLIPSIS) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set14));
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

    public static class typeid_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeid"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:383:1: typeid : Id ( ( NL )? PERIOD ( NL )? Id )* -> ^( TYPEID ( Id )* ) ;
    public final babel17Parser.typeid_return typeid() throws RecognitionException {
        babel17Parser.typeid_return retval = new babel17Parser.typeid_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Id15=null;
        Token NL16=null;
        Token PERIOD17=null;
        Token NL18=null;
        Token Id19=null;

        CommonTree Id15_tree=null;
        CommonTree NL16_tree=null;
        CommonTree PERIOD17_tree=null;
        CommonTree NL18_tree=null;
        CommonTree Id19_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_Id=new RewriteRuleTokenStream(adaptor,"token Id");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:383:9: ( Id ( ( NL )? PERIOD ( NL )? Id )* -> ^( TYPEID ( Id )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:383:11: Id ( ( NL )? PERIOD ( NL )? Id )*
            {
            Id15=(Token)match(input,Id,FOLLOW_Id_in_typeid1647); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Id.add(Id15);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:383:14: ( ( NL )? PERIOD ( NL )? Id )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==NL) ) {
                    int LA3_1 = input.LA(2);

                    if ( (LA3_1==PERIOD) ) {
                        alt3=1;
                    }


                }
                else if ( (LA3_0==PERIOD) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:383:15: ( NL )? PERIOD ( NL )? Id
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:383:15: ( NL )?
            	    int alt1=2;
            	    int LA1_0 = input.LA(1);

            	    if ( (LA1_0==NL) ) {
            	        alt1=1;
            	    }
            	    switch (alt1) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:383:15: NL
            	            {
            	            NL16=(Token)match(input,NL,FOLLOW_NL_in_typeid1650); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL16);


            	            }
            	            break;

            	    }

            	    PERIOD17=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_typeid1653); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD17);

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:383:26: ( NL )?
            	    int alt2=2;
            	    int LA2_0 = input.LA(1);

            	    if ( (LA2_0==NL) ) {
            	        alt2=1;
            	    }
            	    switch (alt2) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:383:26: NL
            	            {
            	            NL18=(Token)match(input,NL,FOLLOW_NL_in_typeid1655); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL18);


            	            }
            	            break;

            	    }

            	    Id19=(Token)match(input,Id,FOLLOW_Id_in_typeid1658); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_Id.add(Id19);


            	    }
            	    break;

            	default :
            	    break loop3;
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
            // 383:35: -> ^( TYPEID ( Id )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:383:38: ^( TYPEID ( Id )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TYPEID, "TYPEID"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:383:47: ( Id )*
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
    // $ANTLR end "typeid"

    public static class typeannotation_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeannotation"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:385:1: typeannotation : ( typeid | L_val ( NL )? protected_expr_nc -> ^( L_val protected_expr_nc ) );
    public final babel17Parser.typeannotation_return typeannotation() throws RecognitionException {
        babel17Parser.typeannotation_return retval = new babel17Parser.typeannotation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_val21=null;
        Token NL22=null;
        babel17Parser.typeid_return typeid20 = null;

        babel17Parser.protected_expr_nc_return protected_expr_nc23 = null;


        CommonTree L_val21_tree=null;
        CommonTree NL22_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_val=new RewriteRuleTokenStream(adaptor,"token L_val");
        RewriteRuleSubtreeStream stream_protected_expr_nc=new RewriteRuleSubtreeStream(adaptor,"rule protected_expr_nc");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:386:2: ( typeid | L_val ( NL )? protected_expr_nc -> ^( L_val protected_expr_nc ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==Id) ) {
                alt5=1;
            }
            else if ( (LA5_0==L_val) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:386:4: typeid
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_typeid_in_typeannotation1678);
                    typeid20=typeid();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeid20.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:387:4: L_val ( NL )? protected_expr_nc
                    {
                    L_val21=(Token)match(input,L_val,FOLLOW_L_val_in_typeannotation1683); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_val.add(L_val21);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:387:10: ( NL )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==NL) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:387:10: NL
                            {
                            NL22=(Token)match(input,NL,FOLLOW_NL_in_typeannotation1685); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL22);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_protected_expr_nc_in_typeannotation1688);
                    protected_expr_nc23=protected_expr_nc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_protected_expr_nc.add(protected_expr_nc23.getTree());


                    // AST REWRITE
                    // elements: protected_expr_nc, L_val
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 387:32: -> ^( L_val protected_expr_nc )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:387:35: ^( L_val protected_expr_nc )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_L_val.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_protected_expr_nc.nextTree());

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
    // $ANTLR end "typeannotation"

    public static class pattern_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pattern"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:390:1: pattern : ( Constr ( ( NL )? pattern )? -> ^( Constr ( pattern )? ) | primitive_pattern ( ( NL )? token_DOUBLE_COLON ( NL )? primitive_pattern )* -> ^( LIST_CONS ( primitive_pattern )* ) | L_exception ( NL )? pattern -> ^( L_exception pattern ) | token_ELLIPSIS );
    public final babel17Parser.pattern_return pattern() throws RecognitionException {
        babel17Parser.pattern_return retval = new babel17Parser.pattern_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Constr24=null;
        Token NL25=null;
        Token NL28=null;
        Token NL30=null;
        Token L_exception32=null;
        Token NL33=null;
        babel17Parser.pattern_return pattern26 = null;

        babel17Parser.primitive_pattern_return primitive_pattern27 = null;

        babel17Parser.token_DOUBLE_COLON_return token_DOUBLE_COLON29 = null;

        babel17Parser.primitive_pattern_return primitive_pattern31 = null;

        babel17Parser.pattern_return pattern34 = null;

        babel17Parser.token_ELLIPSIS_return token_ELLIPSIS35 = null;


        CommonTree Constr24_tree=null;
        CommonTree NL25_tree=null;
        CommonTree NL28_tree=null;
        CommonTree NL30_tree=null;
        CommonTree L_exception32_tree=null;
        CommonTree NL33_tree=null;
        RewriteRuleTokenStream stream_L_exception=new RewriteRuleTokenStream(adaptor,"token L_exception");
        RewriteRuleTokenStream stream_Constr=new RewriteRuleTokenStream(adaptor,"token Constr");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_primitive_pattern=new RewriteRuleSubtreeStream(adaptor,"rule primitive_pattern");
        RewriteRuleSubtreeStream stream_token_DOUBLE_COLON=new RewriteRuleSubtreeStream(adaptor,"rule token_DOUBLE_COLON");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:390:9: ( Constr ( ( NL )? pattern )? -> ^( Constr ( pattern )? ) | primitive_pattern ( ( NL )? token_DOUBLE_COLON ( NL )? primitive_pattern )* -> ^( LIST_CONS ( primitive_pattern )* ) | L_exception ( NL )? pattern -> ^( L_exception pattern ) | token_ELLIPSIS )
            int alt12=4;
            switch ( input.LA(1) ) {
            case Constr:
                {
                alt12=1;
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
                alt12=2;
                }
                break;
            case L_exception:
                {
                alt12=3;
                }
                break;
            case A_ELLIPSIS:
            case U_ELLIPSIS:
                {
                alt12=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:390:11: Constr ( ( NL )? pattern )?
                    {
                    Constr24=(Token)match(input,Constr,FOLLOW_Constr_in_pattern1705); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Constr.add(Constr24);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:390:18: ( ( NL )? pattern )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==NL) ) {
                        int LA7_1 = input.LA(2);

                        if ( (LA7_1==L_exception||(LA7_1>=A_infinity && LA7_1<=U_infinity)||(LA7_1>=L_true && LA7_1<=L_false)||LA7_1==L_nil||LA7_1==MINUS||(LA7_1>=A_ELLIPSIS && LA7_1<=U_ELLIPSIS)||(LA7_1>=Constr && LA7_1<=Num)||(LA7_1>=String && LA7_1<=ROUND_BRACKET_OPEN)||LA7_1==SQUARE_BRACKET_OPEN||LA7_1==CURLY_BRACKET_OPEN||LA7_1==UNDERSCORE) ) {
                            alt7=1;
                        }
                    }
                    else if ( (LA7_0==L_exception||(LA7_0>=A_infinity && LA7_0<=U_infinity)||(LA7_0>=L_true && LA7_0<=L_false)||LA7_0==L_nil||LA7_0==MINUS||(LA7_0>=A_ELLIPSIS && LA7_0<=U_ELLIPSIS)||(LA7_0>=Constr && LA7_0<=Num)||(LA7_0>=String && LA7_0<=ROUND_BRACKET_OPEN)||LA7_0==SQUARE_BRACKET_OPEN||LA7_0==CURLY_BRACKET_OPEN||LA7_0==UNDERSCORE) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:390:19: ( NL )? pattern
                            {
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:390:19: ( NL )?
                            int alt6=2;
                            int LA6_0 = input.LA(1);

                            if ( (LA6_0==NL) ) {
                                alt6=1;
                            }
                            switch (alt6) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:390:19: NL
                                    {
                                    NL25=(Token)match(input,NL,FOLLOW_NL_in_pattern1708); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL25);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_pattern_in_pattern1711);
                            pattern26=pattern();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_pattern.add(pattern26.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: Constr, pattern
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 390:33: -> ^( Constr ( pattern )? )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:390:36: ^( Constr ( pattern )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_Constr.nextNode(), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:390:45: ( pattern )?
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:391:4: primitive_pattern ( ( NL )? token_DOUBLE_COLON ( NL )? primitive_pattern )*
                    {
                    pushFollow(FOLLOW_primitive_pattern_in_pattern1727);
                    primitive_pattern27=primitive_pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primitive_pattern.add(primitive_pattern27.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:391:22: ( ( NL )? token_DOUBLE_COLON ( NL )? primitive_pattern )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==NL) ) {
                            int LA10_1 = input.LA(2);

                            if ( ((LA10_1>=A_DOUBLE_COLON && LA10_1<=U_DOUBLE_COLON)) ) {
                                alt10=1;
                            }


                        }
                        else if ( ((LA10_0>=A_DOUBLE_COLON && LA10_0<=U_DOUBLE_COLON)) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:391:23: ( NL )? token_DOUBLE_COLON ( NL )? primitive_pattern
                    	    {
                    	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:391:23: ( NL )?
                    	    int alt8=2;
                    	    int LA8_0 = input.LA(1);

                    	    if ( (LA8_0==NL) ) {
                    	        alt8=1;
                    	    }
                    	    switch (alt8) {
                    	        case 1 :
                    	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:391:23: NL
                    	            {
                    	            NL28=(Token)match(input,NL,FOLLOW_NL_in_pattern1730); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_NL.add(NL28);


                    	            }
                    	            break;

                    	    }

                    	    pushFollow(FOLLOW_token_DOUBLE_COLON_in_pattern1733);
                    	    token_DOUBLE_COLON29=token_DOUBLE_COLON();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_token_DOUBLE_COLON.add(token_DOUBLE_COLON29.getTree());
                    	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:391:46: ( NL )?
                    	    int alt9=2;
                    	    int LA9_0 = input.LA(1);

                    	    if ( (LA9_0==NL) ) {
                    	        alt9=1;
                    	    }
                    	    switch (alt9) {
                    	        case 1 :
                    	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:391:46: NL
                    	            {
                    	            NL30=(Token)match(input,NL,FOLLOW_NL_in_pattern1735); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_NL.add(NL30);


                    	            }
                    	            break;

                    	    }

                    	    pushFollow(FOLLOW_primitive_pattern_in_pattern1738);
                    	    primitive_pattern31=primitive_pattern();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_primitive_pattern.add(primitive_pattern31.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
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
                    // 392:3: -> ^( LIST_CONS ( primitive_pattern )* )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:392:6: ^( LIST_CONS ( primitive_pattern )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LIST_CONS, "LIST_CONS"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:392:18: ( primitive_pattern )*
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:393:4: L_exception ( NL )? pattern
                    {
                    L_exception32=(Token)match(input,L_exception,FOLLOW_L_exception_in_pattern1757); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_exception.add(L_exception32);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:393:16: ( NL )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==NL) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:393:16: NL
                            {
                            NL33=(Token)match(input,NL,FOLLOW_NL_in_pattern1759); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL33);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_pattern_in_pattern1762);
                    pattern34=pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pattern.add(pattern34.getTree());


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
                    // 393:28: -> ^( L_exception pattern )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:393:31: ^( L_exception pattern )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:394:4: token_ELLIPSIS
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_ELLIPSIS_in_pattern1775);
                    token_ELLIPSIS35=token_ELLIPSIS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, token_ELLIPSIS35.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:396:1: bracket_pattern : ( ( Id ( NL )? L_as )=> Id ( NL )? L_as ( NL )? pattern -> ^( L_as Id pattern ) | ( protected_expr ( NL )? QUESTION_MARK )=> protected_expr ( NL )? QUESTION_MARK ( ( NL )? pattern )? -> ^( QUESTION_MARK protected_expr ( pattern )? ) | ( Id pattern )=> Id pattern -> ^( INNERVALUE_PATTERN Id pattern ) | L_val ( NL )? protected_expr_nc -> ^( L_val protected_expr_nc ) | L_for ( NL )? ( bracket_pattern ( ( NL )? COMMA ( NL )? bracket_pattern )* ( NL )? )? L_end -> ^( L_for ( bracket_pattern )* ) | ( pattern ( NL )? L_if )=> pattern ( NL )? L_if ( NL )? protected_expr_nc -> ^( IF_PATTERN pattern protected_expr_nc ) | ( pattern ( NL )? ':' )=> pattern ( NL )? ':' ( NL )? typeannotation -> ^( TYPE_PATTERN typeannotation pattern ) | pattern );
    public final babel17Parser.bracket_pattern_return bracket_pattern() throws RecognitionException {
        babel17Parser.bracket_pattern_return retval = new babel17Parser.bracket_pattern_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Id36=null;
        Token NL37=null;
        Token L_as38=null;
        Token NL39=null;
        Token NL42=null;
        Token QUESTION_MARK43=null;
        Token NL44=null;
        Token Id46=null;
        Token L_val48=null;
        Token NL49=null;
        Token L_for51=null;
        Token NL52=null;
        Token NL54=null;
        Token COMMA55=null;
        Token NL56=null;
        Token NL58=null;
        Token L_end59=null;
        Token NL61=null;
        Token L_if62=null;
        Token NL63=null;
        Token NL66=null;
        Token char_literal67=null;
        Token NL68=null;
        babel17Parser.pattern_return pattern40 = null;

        babel17Parser.protected_expr_return protected_expr41 = null;

        babel17Parser.pattern_return pattern45 = null;

        babel17Parser.pattern_return pattern47 = null;

        babel17Parser.protected_expr_nc_return protected_expr_nc50 = null;

        babel17Parser.bracket_pattern_return bracket_pattern53 = null;

        babel17Parser.bracket_pattern_return bracket_pattern57 = null;

        babel17Parser.pattern_return pattern60 = null;

        babel17Parser.protected_expr_nc_return protected_expr_nc64 = null;

        babel17Parser.pattern_return pattern65 = null;

        babel17Parser.typeannotation_return typeannotation69 = null;

        babel17Parser.pattern_return pattern70 = null;


        CommonTree Id36_tree=null;
        CommonTree NL37_tree=null;
        CommonTree L_as38_tree=null;
        CommonTree NL39_tree=null;
        CommonTree NL42_tree=null;
        CommonTree QUESTION_MARK43_tree=null;
        CommonTree NL44_tree=null;
        CommonTree Id46_tree=null;
        CommonTree L_val48_tree=null;
        CommonTree NL49_tree=null;
        CommonTree L_for51_tree=null;
        CommonTree NL52_tree=null;
        CommonTree NL54_tree=null;
        CommonTree COMMA55_tree=null;
        CommonTree NL56_tree=null;
        CommonTree NL58_tree=null;
        CommonTree L_end59_tree=null;
        CommonTree NL61_tree=null;
        CommonTree L_if62_tree=null;
        CommonTree NL63_tree=null;
        CommonTree NL66_tree=null;
        CommonTree char_literal67_tree=null;
        CommonTree NL68_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleTokenStream stream_L_for=new RewriteRuleTokenStream(adaptor,"token L_for");
        RewriteRuleTokenStream stream_L_as=new RewriteRuleTokenStream(adaptor,"token L_as");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_Id=new RewriteRuleTokenStream(adaptor,"token Id");
        RewriteRuleTokenStream stream_L_val=new RewriteRuleTokenStream(adaptor,"token L_val");
        RewriteRuleTokenStream stream_L_if=new RewriteRuleTokenStream(adaptor,"token L_if");
        RewriteRuleTokenStream stream_QUESTION_MARK=new RewriteRuleTokenStream(adaptor,"token QUESTION_MARK");
        RewriteRuleSubtreeStream stream_typeannotation=new RewriteRuleSubtreeStream(adaptor,"rule typeannotation");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_protected_expr=new RewriteRuleSubtreeStream(adaptor,"rule protected_expr");
        RewriteRuleSubtreeStream stream_protected_expr_nc=new RewriteRuleSubtreeStream(adaptor,"rule protected_expr_nc");
        RewriteRuleSubtreeStream stream_bracket_pattern=new RewriteRuleSubtreeStream(adaptor,"rule bracket_pattern");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:397:2: ( ( Id ( NL )? L_as )=> Id ( NL )? L_as ( NL )? pattern -> ^( L_as Id pattern ) | ( protected_expr ( NL )? QUESTION_MARK )=> protected_expr ( NL )? QUESTION_MARK ( ( NL )? pattern )? -> ^( QUESTION_MARK protected_expr ( pattern )? ) | ( Id pattern )=> Id pattern -> ^( INNERVALUE_PATTERN Id pattern ) | L_val ( NL )? protected_expr_nc -> ^( L_val protected_expr_nc ) | L_for ( NL )? ( bracket_pattern ( ( NL )? COMMA ( NL )? bracket_pattern )* ( NL )? )? L_end -> ^( L_for ( bracket_pattern )* ) | ( pattern ( NL )? L_if )=> pattern ( NL )? L_if ( NL )? protected_expr_nc -> ^( IF_PATTERN pattern protected_expr_nc ) | ( pattern ( NL )? ':' )=> pattern ( NL )? ':' ( NL )? typeannotation -> ^( TYPE_PATTERN typeannotation pattern ) | pattern )
            int alt29=8;
            alt29 = dfa29.predict(input);
            switch (alt29) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:397:10: ( Id ( NL )? L_as )=> Id ( NL )? L_as ( NL )? pattern
                    {
                    Id36=(Token)match(input,Id,FOLLOW_Id_in_bracket_pattern1802); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Id.add(Id36);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:397:30: ( NL )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==NL) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:397:30: NL
                            {
                            NL37=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1804); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL37);


                            }
                            break;

                    }

                    L_as38=(Token)match(input,L_as,FOLLOW_L_as_in_bracket_pattern1807); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_as.add(L_as38);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:397:39: ( NL )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==NL) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:397:39: NL
                            {
                            NL39=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1809); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL39);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_pattern_in_bracket_pattern1812);
                    pattern40=pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pattern.add(pattern40.getTree());


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
                    // 397:51: -> ^( L_as Id pattern )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:397:54: ^( L_as Id pattern )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:398:4: ( protected_expr ( NL )? QUESTION_MARK )=> protected_expr ( NL )? QUESTION_MARK ( ( NL )? pattern )?
                    {
                    pushFollow(FOLLOW_protected_expr_in_bracket_pattern1841);
                    protected_expr41=protected_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr41.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:399:18: ( NL )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==NL) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:399:18: NL
                            {
                            NL42=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1843); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL42);


                            }
                            break;

                    }

                    QUESTION_MARK43=(Token)match(input,QUESTION_MARK,FOLLOW_QUESTION_MARK_in_bracket_pattern1846); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QUESTION_MARK.add(QUESTION_MARK43);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:399:36: ( ( NL )? pattern )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==NL) ) {
                        int LA17_1 = input.LA(2);

                        if ( (LA17_1==L_exception||(LA17_1>=A_infinity && LA17_1<=U_infinity)||(LA17_1>=L_true && LA17_1<=L_false)||LA17_1==L_nil||LA17_1==MINUS||(LA17_1>=A_ELLIPSIS && LA17_1<=U_ELLIPSIS)||(LA17_1>=Constr && LA17_1<=Num)||(LA17_1>=String && LA17_1<=ROUND_BRACKET_OPEN)||LA17_1==SQUARE_BRACKET_OPEN||LA17_1==CURLY_BRACKET_OPEN||LA17_1==UNDERSCORE) ) {
                            alt17=1;
                        }
                    }
                    else if ( (LA17_0==L_exception||(LA17_0>=A_infinity && LA17_0<=U_infinity)||(LA17_0>=L_true && LA17_0<=L_false)||LA17_0==L_nil||LA17_0==MINUS||(LA17_0>=A_ELLIPSIS && LA17_0<=U_ELLIPSIS)||(LA17_0>=Constr && LA17_0<=Num)||(LA17_0>=String && LA17_0<=ROUND_BRACKET_OPEN)||LA17_0==SQUARE_BRACKET_OPEN||LA17_0==CURLY_BRACKET_OPEN||LA17_0==UNDERSCORE) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:399:37: ( NL )? pattern
                            {
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:399:37: ( NL )?
                            int alt16=2;
                            int LA16_0 = input.LA(1);

                            if ( (LA16_0==NL) ) {
                                alt16=1;
                            }
                            switch (alt16) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:399:37: NL
                                    {
                                    NL44=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1849); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL44);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_pattern_in_bracket_pattern1852);
                            pattern45=pattern();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_pattern.add(pattern45.getTree());

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
                    // 399:51: -> ^( QUESTION_MARK protected_expr ( pattern )? )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:399:54: ^( QUESTION_MARK protected_expr ( pattern )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_QUESTION_MARK.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_protected_expr.nextTree());
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:399:85: ( pattern )?
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:400:4: ( Id pattern )=> Id pattern
                    {
                    Id46=(Token)match(input,Id,FOLLOW_Id_in_bracket_pattern1878); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Id.add(Id46);

                    pushFollow(FOLLOW_pattern_in_bracket_pattern1880);
                    pattern47=pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pattern.add(pattern47.getTree());


                    // AST REWRITE
                    // elements: Id, pattern
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 400:31: -> ^( INNERVALUE_PATTERN Id pattern )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:400:34: ^( INNERVALUE_PATTERN Id pattern )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(INNERVALUE_PATTERN, "INNERVALUE_PATTERN"), root_1);

                        adaptor.addChild(root_1, stream_Id.nextNode());
                        adaptor.addChild(root_1, stream_pattern.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:401:4: L_val ( NL )? protected_expr_nc
                    {
                    L_val48=(Token)match(input,L_val,FOLLOW_L_val_in_bracket_pattern1895); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_val.add(L_val48);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:401:10: ( NL )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==NL) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:401:10: NL
                            {
                            NL49=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1897); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL49);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_protected_expr_nc_in_bracket_pattern1900);
                    protected_expr_nc50=protected_expr_nc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_protected_expr_nc.add(protected_expr_nc50.getTree());


                    // AST REWRITE
                    // elements: protected_expr_nc, L_val
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 401:32: -> ^( L_val protected_expr_nc )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:401:35: ^( L_val protected_expr_nc )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_L_val.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_protected_expr_nc.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:402:10: L_for ( NL )? ( bracket_pattern ( ( NL )? COMMA ( NL )? bracket_pattern )* ( NL )? )? L_end
                    {
                    L_for51=(Token)match(input,L_for,FOLLOW_L_for_in_bracket_pattern1919); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_for.add(L_for51);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:402:16: ( NL )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==NL) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:402:16: NL
                            {
                            NL52=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1921); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL52);


                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:402:20: ( bracket_pattern ( ( NL )? COMMA ( NL )? bracket_pattern )* ( NL )? )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==L_begin||(LA24_0>=L_obj && LA24_0<=L_if)||(LA24_0>=L_while && LA24_0<=L_for)||LA24_0==L_match||LA24_0==L_val||LA24_0==L_exception||LA24_0==L_try||(LA24_0>=A_infinity && LA24_0<=L_lazy)||(LA24_0>=L_true && LA24_0<=L_nil)||LA24_0==L_typeof||LA24_0==MINUS||LA24_0==A_NOT||LA24_0==U_NOT||(LA24_0>=A_ELLIPSIS && LA24_0<=U_ELLIPSIS)||LA24_0==L_force||(LA24_0>=Constr && LA24_0<=Num)||(LA24_0>=String && LA24_0<=ROUND_BRACKET_OPEN)||LA24_0==SQUARE_BRACKET_OPEN||LA24_0==CURLY_BRACKET_OPEN||LA24_0==UNDERSCORE) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:402:21: bracket_pattern ( ( NL )? COMMA ( NL )? bracket_pattern )* ( NL )?
                            {
                            pushFollow(FOLLOW_bracket_pattern_in_bracket_pattern1925);
                            bracket_pattern53=bracket_pattern();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_bracket_pattern.add(bracket_pattern53.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:402:37: ( ( NL )? COMMA ( NL )? bracket_pattern )*
                            loop22:
                            do {
                                int alt22=2;
                                int LA22_0 = input.LA(1);

                                if ( (LA22_0==NL) ) {
                                    int LA22_1 = input.LA(2);

                                    if ( (LA22_1==COMMA) ) {
                                        alt22=1;
                                    }


                                }
                                else if ( (LA22_0==COMMA) ) {
                                    alt22=1;
                                }


                                switch (alt22) {
                            	case 1 :
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:402:39: ( NL )? COMMA ( NL )? bracket_pattern
                            	    {
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:402:39: ( NL )?
                            	    int alt20=2;
                            	    int LA20_0 = input.LA(1);

                            	    if ( (LA20_0==NL) ) {
                            	        alt20=1;
                            	    }
                            	    switch (alt20) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:402:39: NL
                            	            {
                            	            NL54=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1929); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL54);


                            	            }
                            	            break;

                            	    }

                            	    COMMA55=(Token)match(input,COMMA,FOLLOW_COMMA_in_bracket_pattern1932); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA55);

                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:402:49: ( NL )?
                            	    int alt21=2;
                            	    int LA21_0 = input.LA(1);

                            	    if ( (LA21_0==NL) ) {
                            	        alt21=1;
                            	    }
                            	    switch (alt21) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:402:49: NL
                            	            {
                            	            NL56=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1934); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL56);


                            	            }
                            	            break;

                            	    }

                            	    pushFollow(FOLLOW_bracket_pattern_in_bracket_pattern1937);
                            	    bracket_pattern57=bracket_pattern();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_bracket_pattern.add(bracket_pattern57.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop22;
                                }
                            } while (true);

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:402:72: ( NL )?
                            int alt23=2;
                            int LA23_0 = input.LA(1);

                            if ( (LA23_0==NL) ) {
                                alt23=1;
                            }
                            switch (alt23) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:402:72: NL
                                    {
                                    NL58=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1942); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL58);


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    L_end59=(Token)match(input,L_end,FOLLOW_L_end_in_bracket_pattern1947); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_end.add(L_end59);



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
                    // 402:84: -> ^( L_for ( bracket_pattern )* )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:402:87: ^( L_for ( bracket_pattern )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_L_for.nextNode(), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:402:95: ( bracket_pattern )*
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
                case 6 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:403:4: ( pattern ( NL )? L_if )=> pattern ( NL )? L_if ( NL )? protected_expr_nc
                    {
                    pushFollow(FOLLOW_pattern_in_bracket_pattern1972);
                    pattern60=pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pattern.add(pattern60.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:403:34: ( NL )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==NL) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:403:34: NL
                            {
                            NL61=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1974); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL61);


                            }
                            break;

                    }

                    L_if62=(Token)match(input,L_if,FOLLOW_L_if_in_bracket_pattern1977); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_if.add(L_if62);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:403:43: ( NL )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==NL) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:403:43: NL
                            {
                            NL63=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1979); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL63);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_protected_expr_nc_in_bracket_pattern1982);
                    protected_expr_nc64=protected_expr_nc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_protected_expr_nc.add(protected_expr_nc64.getTree());


                    // AST REWRITE
                    // elements: pattern, protected_expr_nc
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 403:65: -> ^( IF_PATTERN pattern protected_expr_nc )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:403:68: ^( IF_PATTERN pattern protected_expr_nc )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IF_PATTERN, "IF_PATTERN"), root_1);

                        adaptor.addChild(root_1, stream_pattern.nextTree());
                        adaptor.addChild(root_1, stream_protected_expr_nc.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:404:4: ( pattern ( NL )? ':' )=> pattern ( NL )? ':' ( NL )? typeannotation
                    {
                    pushFollow(FOLLOW_pattern_in_bracket_pattern2008);
                    pattern65=pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pattern.add(pattern65.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:404:33: ( NL )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==NL) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:404:33: NL
                            {
                            NL66=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern2010); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL66);


                            }
                            break;

                    }

                    char_literal67=(Token)match(input,COLON,FOLLOW_COLON_in_bracket_pattern2013); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(char_literal67);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:404:41: ( NL )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==NL) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:404:41: NL
                            {
                            NL68=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern2015); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL68);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_typeannotation_in_bracket_pattern2018);
                    typeannotation69=typeannotation();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeannotation.add(typeannotation69.getTree());


                    // AST REWRITE
                    // elements: pattern, typeannotation
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 404:60: -> ^( TYPE_PATTERN typeannotation pattern )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:404:63: ^( TYPE_PATTERN typeannotation pattern )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TYPE_PATTERN, "TYPE_PATTERN"), root_1);

                        adaptor.addChild(root_1, stream_typeannotation.nextTree());
                        adaptor.addChild(root_1, stream_pattern.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 8 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:405:4: pattern
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_pattern_in_bracket_pattern2033);
                    pattern70=pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, pattern70.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:407:1: arrow_or_assign : ( token_ARROW -> ^( ARROW ) | ASSIGN -> ^( ASSIGN ) );
    public final babel17Parser.arrow_or_assign_return arrow_or_assign() throws RecognitionException {
        babel17Parser.arrow_or_assign_return retval = new babel17Parser.arrow_or_assign_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ASSIGN72=null;
        babel17Parser.token_ARROW_return token_ARROW71 = null;


        CommonTree ASSIGN72_tree=null;
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_token_ARROW=new RewriteRuleSubtreeStream(adaptor,"rule token_ARROW");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:408:2: ( token_ARROW -> ^( ARROW ) | ASSIGN -> ^( ASSIGN ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=A_ARROW && LA30_0<=U_ARROW)) ) {
                alt30=1;
            }
            else if ( (LA30_0==ASSIGN) ) {
                alt30=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:408:4: token_ARROW
                    {
                    pushFollow(FOLLOW_token_ARROW_in_arrow_or_assign2043);
                    token_ARROW71=token_ARROW();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_token_ARROW.add(token_ARROW71.getTree());


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
                    // 408:16: -> ^( ARROW )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:408:19: ^( ARROW )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:409:4: ASSIGN
                    {
                    ASSIGN72=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_arrow_or_assign2054); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN72);



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
                    // 409:11: -> ^( ASSIGN )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:409:14: ^( ASSIGN )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:411:1: mselem_pattern : bracket_pattern ( ( NL )? arrow_or_assign ( NL )? bracket_pattern )? -> ^( NIL_TOKEN ^( NIL_TOKEN ( bracket_pattern )* ) ( arrow_or_assign )* ) ;
    public final babel17Parser.mselem_pattern_return mselem_pattern() throws RecognitionException {
        babel17Parser.mselem_pattern_return retval = new babel17Parser.mselem_pattern_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL74=null;
        Token NL76=null;
        babel17Parser.bracket_pattern_return bracket_pattern73 = null;

        babel17Parser.arrow_or_assign_return arrow_or_assign75 = null;

        babel17Parser.bracket_pattern_return bracket_pattern77 = null;


        CommonTree NL74_tree=null;
        CommonTree NL76_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_arrow_or_assign=new RewriteRuleSubtreeStream(adaptor,"rule arrow_or_assign");
        RewriteRuleSubtreeStream stream_bracket_pattern=new RewriteRuleSubtreeStream(adaptor,"rule bracket_pattern");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:412:2: ( bracket_pattern ( ( NL )? arrow_or_assign ( NL )? bracket_pattern )? -> ^( NIL_TOKEN ^( NIL_TOKEN ( bracket_pattern )* ) ( arrow_or_assign )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:412:4: bracket_pattern ( ( NL )? arrow_or_assign ( NL )? bracket_pattern )?
            {
            pushFollow(FOLLOW_bracket_pattern_in_mselem_pattern2069);
            bracket_pattern73=bracket_pattern();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bracket_pattern.add(bracket_pattern73.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:412:20: ( ( NL )? arrow_or_assign ( NL )? bracket_pattern )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==NL) ) {
                int LA33_1 = input.LA(2);

                if ( (LA33_1==ASSIGN||(LA33_1>=A_ARROW && LA33_1<=U_ARROW)) ) {
                    alt33=1;
                }
            }
            else if ( (LA33_0==ASSIGN||(LA33_0>=A_ARROW && LA33_0<=U_ARROW)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:412:21: ( NL )? arrow_or_assign ( NL )? bracket_pattern
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:412:21: ( NL )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==NL) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:412:21: NL
                            {
                            NL74=(Token)match(input,NL,FOLLOW_NL_in_mselem_pattern2072); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL74);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_arrow_or_assign_in_mselem_pattern2075);
                    arrow_or_assign75=arrow_or_assign();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_arrow_or_assign.add(arrow_or_assign75.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:412:41: ( NL )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==NL) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:412:41: NL
                            {
                            NL76=(Token)match(input,NL,FOLLOW_NL_in_mselem_pattern2077); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL76);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_bracket_pattern_in_mselem_pattern2080);
                    bracket_pattern77=bracket_pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_bracket_pattern.add(bracket_pattern77.getTree());

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
            // 413:3: -> ^( NIL_TOKEN ^( NIL_TOKEN ( bracket_pattern )* ) ( arrow_or_assign )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:413:6: ^( NIL_TOKEN ^( NIL_TOKEN ( bracket_pattern )* ) ( arrow_or_assign )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:413:18: ^( NIL_TOKEN ( bracket_pattern )* )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_2);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:413:30: ( bracket_pattern )*
                while ( stream_bracket_pattern.hasNext() ) {
                    adaptor.addChild(root_2, stream_bracket_pattern.nextTree());

                }
                stream_bracket_pattern.reset();

                adaptor.addChild(root_1, root_2);
                }
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:413:48: ( arrow_or_assign )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:415:1: primitive_pattern : ( Id | '_' -> ANY | String | Num | L_true | L_false | L_nil | token_infinity | '-' ( NL )? token_infinity -> ^( UMINUS token_infinity ) | '-' ( NL )? Num -> ^( UMINUS Num ) | '[' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* )? ']' -> ^( SQUARE_LIST ( bracket_pattern )* ) | '(' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* ( COMMA ( NL )? )? )? ')' -> ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( bracket_pattern )* ) ) | '{' ( NL )? ( mselem_pattern ( NL )? ( COMMA ( NL )? mselem_pattern ( NL )? )* )? '}' -> ^( MAP_OR_SET_OR_OBJ ( mselem_pattern )* ) | '{' ( NL )? token_ARROW ( NL )? '}' -> ^( EMPTY_MAP ) );
    public final babel17Parser.primitive_pattern_return primitive_pattern() throws RecognitionException {
        babel17Parser.primitive_pattern_return retval = new babel17Parser.primitive_pattern_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Id78=null;
        Token char_literal79=null;
        Token String80=null;
        Token Num81=null;
        Token L_true82=null;
        Token L_false83=null;
        Token L_nil84=null;
        Token char_literal86=null;
        Token NL87=null;
        Token char_literal89=null;
        Token NL90=null;
        Token Num91=null;
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
        Token COMMA105=null;
        Token NL106=null;
        Token NL108=null;
        Token COMMA109=null;
        Token NL110=null;
        Token char_literal111=null;
        Token char_literal112=null;
        Token NL113=null;
        Token NL115=null;
        Token COMMA116=null;
        Token NL117=null;
        Token NL119=null;
        Token char_literal120=null;
        Token char_literal121=null;
        Token NL122=null;
        Token NL124=null;
        Token char_literal125=null;
        babel17Parser.token_infinity_return token_infinity85 = null;

        babel17Parser.token_infinity_return token_infinity88 = null;

        babel17Parser.bracket_pattern_return bracket_pattern94 = null;

        babel17Parser.bracket_pattern_return bracket_pattern98 = null;

        babel17Parser.bracket_pattern_return bracket_pattern103 = null;

        babel17Parser.bracket_pattern_return bracket_pattern107 = null;

        babel17Parser.mselem_pattern_return mselem_pattern114 = null;

        babel17Parser.mselem_pattern_return mselem_pattern118 = null;

        babel17Parser.token_ARROW_return token_ARROW123 = null;


        CommonTree Id78_tree=null;
        CommonTree char_literal79_tree=null;
        CommonTree String80_tree=null;
        CommonTree Num81_tree=null;
        CommonTree L_true82_tree=null;
        CommonTree L_false83_tree=null;
        CommonTree L_nil84_tree=null;
        CommonTree char_literal86_tree=null;
        CommonTree NL87_tree=null;
        CommonTree char_literal89_tree=null;
        CommonTree NL90_tree=null;
        CommonTree Num91_tree=null;
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
        CommonTree COMMA105_tree=null;
        CommonTree NL106_tree=null;
        CommonTree NL108_tree=null;
        CommonTree COMMA109_tree=null;
        CommonTree NL110_tree=null;
        CommonTree char_literal111_tree=null;
        CommonTree char_literal112_tree=null;
        CommonTree NL113_tree=null;
        CommonTree NL115_tree=null;
        CommonTree COMMA116_tree=null;
        CommonTree NL117_tree=null;
        CommonTree NL119_tree=null;
        CommonTree char_literal120_tree=null;
        CommonTree char_literal121_tree=null;
        CommonTree NL122_tree=null;
        CommonTree NL124_tree=null;
        CommonTree char_literal125_tree=null;
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:416:2: ( Id | '_' -> ANY | String | Num | L_true | L_false | L_nil | token_infinity | '-' ( NL )? token_infinity -> ^( UMINUS token_infinity ) | '-' ( NL )? Num -> ^( UMINUS Num ) | '[' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* )? ']' -> ^( SQUARE_LIST ( bracket_pattern )* ) | '(' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* ( COMMA ( NL )? )? )? ')' -> ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( bracket_pattern )* ) ) | '{' ( NL )? ( mselem_pattern ( NL )? ( COMMA ( NL )? mselem_pattern ( NL )? )* )? '}' -> ^( MAP_OR_SET_OR_OBJ ( mselem_pattern )* ) | '{' ( NL )? token_ARROW ( NL )? '}' -> ^( EMPTY_MAP ) )
            int alt58=14;
            alt58 = dfa58.predict(input);
            switch (alt58) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:416:4: Id
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Id78=(Token)match(input,Id,FOLLOW_Id_in_primitive_pattern2109); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Id78_tree = (CommonTree)adaptor.create(Id78);
                    adaptor.addChild(root_0, Id78_tree);
                    }

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:417:4: '_'
                    {
                    char_literal79=(Token)match(input,UNDERSCORE,FOLLOW_UNDERSCORE_in_primitive_pattern2114); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_UNDERSCORE.add(char_literal79);



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
                    // 417:8: -> ANY
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(ANY, "ANY"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:418:4: String
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    String80=(Token)match(input,String,FOLLOW_String_in_primitive_pattern2123); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    String80_tree = (CommonTree)adaptor.create(String80);
                    adaptor.addChild(root_0, String80_tree);
                    }

                    }
                    break;
                case 4 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:419:4: Num
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Num81=(Token)match(input,Num,FOLLOW_Num_in_primitive_pattern2128); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Num81_tree = (CommonTree)adaptor.create(Num81);
                    adaptor.addChild(root_0, Num81_tree);
                    }

                    }
                    break;
                case 5 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:420:4: L_true
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    L_true82=(Token)match(input,L_true,FOLLOW_L_true_in_primitive_pattern2133); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    L_true82_tree = (CommonTree)adaptor.create(L_true82);
                    adaptor.addChild(root_0, L_true82_tree);
                    }

                    }
                    break;
                case 6 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:421:4: L_false
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    L_false83=(Token)match(input,L_false,FOLLOW_L_false_in_primitive_pattern2138); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    L_false83_tree = (CommonTree)adaptor.create(L_false83);
                    adaptor.addChild(root_0, L_false83_tree);
                    }

                    }
                    break;
                case 7 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:422:4: L_nil
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    L_nil84=(Token)match(input,L_nil,FOLLOW_L_nil_in_primitive_pattern2143); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    L_nil84_tree = (CommonTree)adaptor.create(L_nil84);
                    adaptor.addChild(root_0, L_nil84_tree);
                    }

                    }
                    break;
                case 8 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:423:4: token_infinity
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_infinity_in_primitive_pattern2148);
                    token_infinity85=token_infinity();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, token_infinity85.getTree());

                    }
                    break;
                case 9 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:424:4: '-' ( NL )? token_infinity
                    {
                    char_literal86=(Token)match(input,MINUS,FOLLOW_MINUS_in_primitive_pattern2153); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(char_literal86);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:424:8: ( NL )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==NL) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:424:8: NL
                            {
                            NL87=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2155); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL87);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_token_infinity_in_primitive_pattern2158);
                    token_infinity88=token_infinity();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_token_infinity.add(token_infinity88.getTree());


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
                    // 424:27: -> ^( UMINUS token_infinity )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:424:30: ^( UMINUS token_infinity )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:425:4: '-' ( NL )? Num
                    {
                    char_literal89=(Token)match(input,MINUS,FOLLOW_MINUS_in_primitive_pattern2171); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(char_literal89);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:425:8: ( NL )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==NL) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:425:8: NL
                            {
                            NL90=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2173); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL90);


                            }
                            break;

                    }

                    Num91=(Token)match(input,Num,FOLLOW_Num_in_primitive_pattern2176); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Num.add(Num91);



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
                    // 425:16: -> ^( UMINUS Num )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:425:19: ^( UMINUS Num )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:426:4: '[' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* )? ']'
                    {
                    char_literal92=(Token)match(input,SQUARE_BRACKET_OPEN,FOLLOW_SQUARE_BRACKET_OPEN_in_primitive_pattern2189); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SQUARE_BRACKET_OPEN.add(char_literal92);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:426:9: ( NL )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==NL) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:426:9: NL
                            {
                            NL93=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2192); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL93);


                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:426:13: ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==L_begin||(LA41_0>=L_obj && LA41_0<=L_if)||(LA41_0>=L_while && LA41_0<=L_for)||LA41_0==L_match||LA41_0==L_val||LA41_0==L_exception||LA41_0==L_try||(LA41_0>=A_infinity && LA41_0<=L_lazy)||(LA41_0>=L_true && LA41_0<=L_nil)||LA41_0==L_typeof||LA41_0==MINUS||LA41_0==A_NOT||LA41_0==U_NOT||(LA41_0>=A_ELLIPSIS && LA41_0<=U_ELLIPSIS)||LA41_0==L_force||(LA41_0>=Constr && LA41_0<=Num)||(LA41_0>=String && LA41_0<=ROUND_BRACKET_OPEN)||LA41_0==SQUARE_BRACKET_OPEN||LA41_0==CURLY_BRACKET_OPEN||LA41_0==UNDERSCORE) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:426:14: bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )*
                            {
                            pushFollow(FOLLOW_bracket_pattern_in_primitive_pattern2196);
                            bracket_pattern94=bracket_pattern();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_bracket_pattern.add(bracket_pattern94.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:426:30: ( NL )?
                            int alt37=2;
                            int LA37_0 = input.LA(1);

                            if ( (LA37_0==NL) ) {
                                alt37=1;
                            }
                            switch (alt37) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:426:30: NL
                                    {
                                    NL95=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2198); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL95);


                                    }
                                    break;

                            }

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:426:34: ( COMMA ( NL )? bracket_pattern ( NL )? )*
                            loop40:
                            do {
                                int alt40=2;
                                int LA40_0 = input.LA(1);

                                if ( (LA40_0==COMMA) ) {
                                    alt40=1;
                                }


                                switch (alt40) {
                            	case 1 :
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:426:36: COMMA ( NL )? bracket_pattern ( NL )?
                            	    {
                            	    COMMA96=(Token)match(input,COMMA,FOLLOW_COMMA_in_primitive_pattern2203); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA96);

                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:426:42: ( NL )?
                            	    int alt38=2;
                            	    int LA38_0 = input.LA(1);

                            	    if ( (LA38_0==NL) ) {
                            	        alt38=1;
                            	    }
                            	    switch (alt38) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:426:42: NL
                            	            {
                            	            NL97=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2205); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL97);


                            	            }
                            	            break;

                            	    }

                            	    pushFollow(FOLLOW_bracket_pattern_in_primitive_pattern2208);
                            	    bracket_pattern98=bracket_pattern();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_bracket_pattern.add(bracket_pattern98.getTree());
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:426:62: ( NL )?
                            	    int alt39=2;
                            	    int LA39_0 = input.LA(1);

                            	    if ( (LA39_0==NL) ) {
                            	        alt39=1;
                            	    }
                            	    switch (alt39) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:426:62: NL
                            	            {
                            	            NL99=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2210); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL99);


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

                    char_literal100=(Token)match(input,SQUARE_BRACKET_CLOSE,FOLLOW_SQUARE_BRACKET_CLOSE_in_primitive_pattern2218); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SQUARE_BRACKET_CLOSE.add(char_literal100);



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
                    // 427:6: -> ^( SQUARE_LIST ( bracket_pattern )* )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:427:9: ^( SQUARE_LIST ( bracket_pattern )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SQUARE_LIST, "SQUARE_LIST"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:427:23: ( bracket_pattern )*
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:428:4: '(' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* ( COMMA ( NL )? )? )? ')'
                    {
                    char_literal101=(Token)match(input,ROUND_BRACKET_OPEN,FOLLOW_ROUND_BRACKET_OPEN_in_primitive_pattern2238); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ROUND_BRACKET_OPEN.add(char_literal101);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:428:9: ( NL )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==NL) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:428:9: NL
                            {
                            NL102=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2241); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL102);


                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:428:13: ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* ( COMMA ( NL )? )? )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==L_begin||(LA49_0>=L_obj && LA49_0<=L_if)||(LA49_0>=L_while && LA49_0<=L_for)||LA49_0==L_match||LA49_0==L_val||LA49_0==L_exception||LA49_0==L_try||(LA49_0>=A_infinity && LA49_0<=L_lazy)||(LA49_0>=L_true && LA49_0<=L_nil)||LA49_0==L_typeof||LA49_0==MINUS||LA49_0==A_NOT||LA49_0==U_NOT||(LA49_0>=A_ELLIPSIS && LA49_0<=U_ELLIPSIS)||LA49_0==L_force||(LA49_0>=Constr && LA49_0<=Num)||(LA49_0>=String && LA49_0<=ROUND_BRACKET_OPEN)||LA49_0==SQUARE_BRACKET_OPEN||LA49_0==CURLY_BRACKET_OPEN||LA49_0==UNDERSCORE) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:428:14: bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* ( COMMA ( NL )? )?
                            {
                            pushFollow(FOLLOW_bracket_pattern_in_primitive_pattern2245);
                            bracket_pattern103=bracket_pattern();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_bracket_pattern.add(bracket_pattern103.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:428:30: ( NL )?
                            int alt43=2;
                            int LA43_0 = input.LA(1);

                            if ( (LA43_0==NL) ) {
                                alt43=1;
                            }
                            switch (alt43) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:428:30: NL
                                    {
                                    NL104=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2247); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL104);


                                    }
                                    break;

                            }

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:428:34: ( COMMA ( NL )? bracket_pattern ( NL )? )*
                            loop46:
                            do {
                                int alt46=2;
                                int LA46_0 = input.LA(1);

                                if ( (LA46_0==COMMA) ) {
                                    int LA46_1 = input.LA(2);

                                    if ( (LA46_1==NL) ) {
                                        int LA46_3 = input.LA(3);

                                        if ( (LA46_3==L_begin||(LA46_3>=L_obj && LA46_3<=L_if)||(LA46_3>=L_while && LA46_3<=L_for)||LA46_3==L_match||LA46_3==L_val||LA46_3==L_exception||LA46_3==L_try||(LA46_3>=A_infinity && LA46_3<=L_lazy)||(LA46_3>=L_true && LA46_3<=L_nil)||LA46_3==L_typeof||LA46_3==MINUS||LA46_3==A_NOT||LA46_3==U_NOT||(LA46_3>=A_ELLIPSIS && LA46_3<=U_ELLIPSIS)||LA46_3==L_force||(LA46_3>=Constr && LA46_3<=Num)||(LA46_3>=String && LA46_3<=ROUND_BRACKET_OPEN)||LA46_3==SQUARE_BRACKET_OPEN||LA46_3==CURLY_BRACKET_OPEN||LA46_3==UNDERSCORE) ) {
                                            alt46=1;
                                        }


                                    }
                                    else if ( (LA46_1==L_begin||(LA46_1>=L_obj && LA46_1<=L_if)||(LA46_1>=L_while && LA46_1<=L_for)||LA46_1==L_match||LA46_1==L_val||LA46_1==L_exception||LA46_1==L_try||(LA46_1>=A_infinity && LA46_1<=L_lazy)||(LA46_1>=L_true && LA46_1<=L_nil)||LA46_1==L_typeof||LA46_1==MINUS||LA46_1==A_NOT||LA46_1==U_NOT||(LA46_1>=A_ELLIPSIS && LA46_1<=U_ELLIPSIS)||LA46_1==L_force||(LA46_1>=Constr && LA46_1<=Num)||(LA46_1>=String && LA46_1<=ROUND_BRACKET_OPEN)||LA46_1==SQUARE_BRACKET_OPEN||LA46_1==CURLY_BRACKET_OPEN||LA46_1==UNDERSCORE) ) {
                                        alt46=1;
                                    }


                                }


                                switch (alt46) {
                            	case 1 :
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:428:36: COMMA ( NL )? bracket_pattern ( NL )?
                            	    {
                            	    COMMA105=(Token)match(input,COMMA,FOLLOW_COMMA_in_primitive_pattern2252); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA105);

                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:428:43: ( NL )?
                            	    int alt44=2;
                            	    int LA44_0 = input.LA(1);

                            	    if ( (LA44_0==NL) ) {
                            	        alt44=1;
                            	    }
                            	    switch (alt44) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:428:43: NL
                            	            {
                            	            NL106=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2255); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL106);


                            	            }
                            	            break;

                            	    }

                            	    pushFollow(FOLLOW_bracket_pattern_in_primitive_pattern2258);
                            	    bracket_pattern107=bracket_pattern();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_bracket_pattern.add(bracket_pattern107.getTree());
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:428:63: ( NL )?
                            	    int alt45=2;
                            	    int LA45_0 = input.LA(1);

                            	    if ( (LA45_0==NL) ) {
                            	        alt45=1;
                            	    }
                            	    switch (alt45) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:428:63: NL
                            	            {
                            	            NL108=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2260); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL108);


                            	            }
                            	            break;

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop46;
                                }
                            } while (true);

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:428:69: ( COMMA ( NL )? )?
                            int alt48=2;
                            int LA48_0 = input.LA(1);

                            if ( (LA48_0==COMMA) ) {
                                alt48=1;
                            }
                            switch (alt48) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:428:70: COMMA ( NL )?
                                    {
                                    COMMA109=(Token)match(input,COMMA,FOLLOW_COMMA_in_primitive_pattern2266); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_COMMA.add(COMMA109);

                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:428:76: ( NL )?
                                    int alt47=2;
                                    int LA47_0 = input.LA(1);

                                    if ( (LA47_0==NL) ) {
                                        alt47=1;
                                    }
                                    switch (alt47) {
                                        case 1 :
                                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:428:76: NL
                                            {
                                            NL110=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2268); if (state.failed) return retval; 
                                            if ( state.backtracking==0 ) stream_NL.add(NL110);


                                            }
                                            break;

                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    char_literal111=(Token)match(input,ROUND_BRACKET_CLOSE,FOLLOW_ROUND_BRACKET_CLOSE_in_primitive_pattern2275); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ROUND_BRACKET_CLOSE.add(char_literal111);



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
                    // 429:5: -> ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( bracket_pattern )* ) )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:429:8: ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( bracket_pattern )* ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ROUND_LIST, "ROUND_LIST"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:429:21: ^( NIL_TOKEN ( COMMA )* )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_2);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:429:33: ( COMMA )*
                        while ( stream_COMMA.hasNext() ) {
                            adaptor.addChild(root_2, stream_COMMA.nextNode());

                        }
                        stream_COMMA.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:429:41: ^( NIL_TOKEN ( bracket_pattern )* )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_2);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:429:53: ( bracket_pattern )*
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:430:4: '{' ( NL )? ( mselem_pattern ( NL )? ( COMMA ( NL )? mselem_pattern ( NL )? )* )? '}'
                    {
                    char_literal112=(Token)match(input,CURLY_BRACKET_OPEN,FOLLOW_CURLY_BRACKET_OPEN_in_primitive_pattern2307); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_OPEN.add(char_literal112);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:430:9: ( NL )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==NL) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:430:9: NL
                            {
                            NL113=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2310); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL113);


                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:430:13: ( mselem_pattern ( NL )? ( COMMA ( NL )? mselem_pattern ( NL )? )* )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==L_begin||(LA55_0>=L_obj && LA55_0<=L_if)||(LA55_0>=L_while && LA55_0<=L_for)||LA55_0==L_match||LA55_0==L_val||LA55_0==L_exception||LA55_0==L_try||(LA55_0>=A_infinity && LA55_0<=L_lazy)||(LA55_0>=L_true && LA55_0<=L_nil)||LA55_0==L_typeof||LA55_0==MINUS||LA55_0==A_NOT||LA55_0==U_NOT||(LA55_0>=A_ELLIPSIS && LA55_0<=U_ELLIPSIS)||LA55_0==L_force||(LA55_0>=Constr && LA55_0<=Num)||(LA55_0>=String && LA55_0<=ROUND_BRACKET_OPEN)||LA55_0==SQUARE_BRACKET_OPEN||LA55_0==CURLY_BRACKET_OPEN||LA55_0==UNDERSCORE) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:430:14: mselem_pattern ( NL )? ( COMMA ( NL )? mselem_pattern ( NL )? )*
                            {
                            pushFollow(FOLLOW_mselem_pattern_in_primitive_pattern2314);
                            mselem_pattern114=mselem_pattern();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_mselem_pattern.add(mselem_pattern114.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:430:29: ( NL )?
                            int alt51=2;
                            int LA51_0 = input.LA(1);

                            if ( (LA51_0==NL) ) {
                                alt51=1;
                            }
                            switch (alt51) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:430:29: NL
                                    {
                                    NL115=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2316); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL115);


                                    }
                                    break;

                            }

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:430:33: ( COMMA ( NL )? mselem_pattern ( NL )? )*
                            loop54:
                            do {
                                int alt54=2;
                                int LA54_0 = input.LA(1);

                                if ( (LA54_0==COMMA) ) {
                                    alt54=1;
                                }


                                switch (alt54) {
                            	case 1 :
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:430:35: COMMA ( NL )? mselem_pattern ( NL )?
                            	    {
                            	    COMMA116=(Token)match(input,COMMA,FOLLOW_COMMA_in_primitive_pattern2321); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA116);

                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:430:42: ( NL )?
                            	    int alt52=2;
                            	    int LA52_0 = input.LA(1);

                            	    if ( (LA52_0==NL) ) {
                            	        alt52=1;
                            	    }
                            	    switch (alt52) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:430:42: NL
                            	            {
                            	            NL117=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2324); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL117);


                            	            }
                            	            break;

                            	    }

                            	    pushFollow(FOLLOW_mselem_pattern_in_primitive_pattern2327);
                            	    mselem_pattern118=mselem_pattern();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_mselem_pattern.add(mselem_pattern118.getTree());
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:430:61: ( NL )?
                            	    int alt53=2;
                            	    int LA53_0 = input.LA(1);

                            	    if ( (LA53_0==NL) ) {
                            	        alt53=1;
                            	    }
                            	    switch (alt53) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:430:61: NL
                            	            {
                            	            NL119=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2329); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL119);


                            	            }
                            	            break;

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop54;
                                }
                            } while (true);


                            }
                            break;

                    }

                    char_literal120=(Token)match(input,CURLY_BRACKET_CLOSE,FOLLOW_CURLY_BRACKET_CLOSE_in_primitive_pattern2337); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_CLOSE.add(char_literal120);



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
                    // 431:5: -> ^( MAP_OR_SET_OR_OBJ ( mselem_pattern )* )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:431:8: ^( MAP_OR_SET_OR_OBJ ( mselem_pattern )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MAP_OR_SET_OR_OBJ, "MAP_OR_SET_OR_OBJ"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:431:28: ( mselem_pattern )*
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:432:4: '{' ( NL )? token_ARROW ( NL )? '}'
                    {
                    char_literal121=(Token)match(input,CURLY_BRACKET_OPEN,FOLLOW_CURLY_BRACKET_OPEN_in_primitive_pattern2355); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_OPEN.add(char_literal121);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:432:8: ( NL )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==NL) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:432:8: NL
                            {
                            NL122=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2357); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL122);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_token_ARROW_in_primitive_pattern2360);
                    token_ARROW123=token_ARROW();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_token_ARROW.add(token_ARROW123.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:432:24: ( NL )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==NL) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:432:24: NL
                            {
                            NL124=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2362); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL124);


                            }
                            break;

                    }

                    char_literal125=(Token)match(input,CURLY_BRACKET_CLOSE,FOLLOW_CURLY_BRACKET_CLOSE_in_primitive_pattern2365); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_CLOSE.add(char_literal125);



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
                    // 432:32: -> ^( EMPTY_MAP )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:432:35: ^( EMPTY_MAP )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:435:1: sep : ( NL | SC )+ ;
    public final babel17Parser.sep_return sep() throws RecognitionException {
        babel17Parser.sep_return retval = new babel17Parser.sep_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set126=null;

        CommonTree set126_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:435:5: ( ( NL | SC )+ )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:435:7: ( NL | SC )+
            {
            root_0 = (CommonTree)adaptor.nil();

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:435:7: ( NL | SC )+
            int cnt59=0;
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==SC||LA59_0==NL) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:
            	    {
            	    set126=(Token)input.LT(1);
            	    if ( input.LA(1)==SC||input.LA(1)==NL ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set126));
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
            	    if ( cnt59 >= 1 ) break loop59;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(59, input);
                        throw eee;
                }
                cnt59++;
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:437:1: block : ( ( sep )? statement ( sep statement )* ( sep )? -> ^( BLOCK ( statement )* ) | ( sep )? -> ^( BLOCK ) );
    public final babel17Parser.block_return block() throws RecognitionException {
        babel17Parser.block_return retval = new babel17Parser.block_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.sep_return sep127 = null;

        babel17Parser.statement_return statement128 = null;

        babel17Parser.sep_return sep129 = null;

        babel17Parser.statement_return statement130 = null;

        babel17Parser.sep_return sep131 = null;

        babel17Parser.sep_return sep132 = null;


        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_sep=new RewriteRuleSubtreeStream(adaptor,"rule sep");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:437:8: ( ( sep )? statement ( sep statement )* ( sep )? -> ^( BLOCK ( statement )* ) | ( sep )? -> ^( BLOCK ) )
            int alt64=2;
            alt64 = dfa64.predict(input);
            switch (alt64) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:437:10: ( sep )? statement ( sep statement )* ( sep )?
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:437:10: ( sep )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==SC||LA60_0==NL) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:437:10: sep
                            {
                            pushFollow(FOLLOW_sep_in_block2397);
                            sep127=sep();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_sep.add(sep127.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_statement_in_block2400);
                    statement128=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement128.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:437:25: ( sep statement )*
                    loop61:
                    do {
                        int alt61=2;
                        alt61 = dfa61.predict(input);
                        switch (alt61) {
                    	case 1 :
                    	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:437:26: sep statement
                    	    {
                    	    pushFollow(FOLLOW_sep_in_block2403);
                    	    sep129=sep();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_sep.add(sep129.getTree());
                    	    pushFollow(FOLLOW_statement_in_block2405);
                    	    statement130=statement();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_statement.add(statement130.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop61;
                        }
                    } while (true);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:437:42: ( sep )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==SC||LA62_0==NL) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:437:42: sep
                            {
                            pushFollow(FOLLOW_sep_in_block2409);
                            sep131=sep();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_sep.add(sep131.getTree());

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
                    // 437:47: -> ^( BLOCK ( statement )* )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:437:50: ^( BLOCK ( statement )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:437:58: ( statement )*
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:438:4: ( sep )?
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:438:4: ( sep )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==SC||LA63_0==NL) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:438:4: sep
                            {
                            pushFollow(FOLLOW_sep_in_block2425);
                            sep132=sep();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_sep.add(sep132.getTree());

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
                    // 438:9: -> ^( BLOCK )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:438:12: ^( BLOCK )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:440:1: pure_block : statement ( sep statement )* -> ^( BLOCK ( statement )* ) ;
    public final babel17Parser.pure_block_return pure_block() throws RecognitionException {
        babel17Parser.pure_block_return retval = new babel17Parser.pure_block_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.statement_return statement133 = null;

        babel17Parser.sep_return sep134 = null;

        babel17Parser.statement_return statement135 = null;


        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_sep=new RewriteRuleSubtreeStream(adaptor,"rule sep");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:441:2: ( statement ( sep statement )* -> ^( BLOCK ( statement )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:441:4: statement ( sep statement )*
            {
            pushFollow(FOLLOW_statement_in_pure_block2442);
            statement133=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statement.add(statement133.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:441:14: ( sep statement )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==NL) ) {
                    int LA65_1 = input.LA(2);

                    if ( (LA65_1==L_begin||(LA65_1>=L_obj && LA65_1<=L_if)||(LA65_1>=L_while && LA65_1<=L_for)||(LA65_1>=L_yield && LA65_1<=L_match)||(LA65_1>=L_val && LA65_1<=L_def)||LA65_1==L_exception||LA65_1==L_try||(LA65_1>=A_infinity && LA65_1<=L_nil)||(LA65_1>=L_module && LA65_1<=L_import)||LA65_1==SC||LA65_1==MINUS||LA65_1==A_NOT||LA65_1==U_NOT||(LA65_1>=A_ELLIPSIS && LA65_1<=U_ELLIPSIS)||LA65_1==L_force||(LA65_1>=NL && LA65_1<=Num)||(LA65_1>=String && LA65_1<=ROUND_BRACKET_OPEN)||LA65_1==SQUARE_BRACKET_OPEN||LA65_1==CURLY_BRACKET_OPEN||LA65_1==UNDERSCORE||(LA65_1>=PRAGMA_LOG && LA65_1<=PRAGMA_PROFILE)) ) {
                        alt65=1;
                    }


                }
                else if ( (LA65_0==SC) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:441:15: sep statement
            	    {
            	    pushFollow(FOLLOW_sep_in_pure_block2445);
            	    sep134=sep();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_sep.add(sep134.getTree());
            	    pushFollow(FOLLOW_statement_in_pure_block2447);
            	    statement135=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement135.getTree());

            	    }
            	    break;

            	default :
            	    break loop65;
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
            // 441:31: -> ^( BLOCK ( statement )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:441:34: ^( BLOCK ( statement )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:441:42: ( statement )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:443:1: statement : ( st_typedef | st_val | st_def | st_yield | st_memoize | st_private | st_module | st_import | expr_or_assign | PRAGMA_PRINT expr -> ^( PRAGMA_PRINT expr ) | PRAGMA_LOG expr -> ^( PRAGMA_LOG expr ) | PRAGMA_PROFILE expr -> ^( PRAGMA_PROFILE expr ) | PRAGMA_ASSERT expr -> ^( PRAGMA_ASSERT expr ) );
    public final babel17Parser.statement_return statement() throws RecognitionException {
        babel17Parser.statement_return retval = new babel17Parser.statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PRAGMA_PRINT145=null;
        Token PRAGMA_LOG147=null;
        Token PRAGMA_PROFILE149=null;
        Token PRAGMA_ASSERT151=null;
        babel17Parser.st_typedef_return st_typedef136 = null;

        babel17Parser.st_val_return st_val137 = null;

        babel17Parser.st_def_return st_def138 = null;

        babel17Parser.st_yield_return st_yield139 = null;

        babel17Parser.st_memoize_return st_memoize140 = null;

        babel17Parser.st_private_return st_private141 = null;

        babel17Parser.st_module_return st_module142 = null;

        babel17Parser.st_import_return st_import143 = null;

        babel17Parser.expr_or_assign_return expr_or_assign144 = null;

        babel17Parser.expr_return expr146 = null;

        babel17Parser.expr_return expr148 = null;

        babel17Parser.expr_return expr150 = null;

        babel17Parser.expr_return expr152 = null;


        CommonTree PRAGMA_PRINT145_tree=null;
        CommonTree PRAGMA_LOG147_tree=null;
        CommonTree PRAGMA_PROFILE149_tree=null;
        CommonTree PRAGMA_ASSERT151_tree=null;
        RewriteRuleTokenStream stream_PRAGMA_PROFILE=new RewriteRuleTokenStream(adaptor,"token PRAGMA_PROFILE");
        RewriteRuleTokenStream stream_PRAGMA_ASSERT=new RewriteRuleTokenStream(adaptor,"token PRAGMA_ASSERT");
        RewriteRuleTokenStream stream_PRAGMA_LOG=new RewriteRuleTokenStream(adaptor,"token PRAGMA_LOG");
        RewriteRuleTokenStream stream_PRAGMA_PRINT=new RewriteRuleTokenStream(adaptor,"token PRAGMA_PRINT");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:444:2: ( st_typedef | st_val | st_def | st_yield | st_memoize | st_private | st_module | st_import | expr_or_assign | PRAGMA_PRINT expr -> ^( PRAGMA_PRINT expr ) | PRAGMA_LOG expr -> ^( PRAGMA_LOG expr ) | PRAGMA_PROFILE expr -> ^( PRAGMA_PROFILE expr ) | PRAGMA_ASSERT expr -> ^( PRAGMA_ASSERT expr ) )
            int alt66=13;
            alt66 = dfa66.predict(input);
            switch (alt66) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:444:4: st_typedef
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_st_typedef_in_statement2468);
                    st_typedef136=st_typedef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, st_typedef136.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:445:10: st_val
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_st_val_in_statement2479);
                    st_val137=st_val();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, st_val137.getTree());

                    }
                    break;
                case 3 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:446:4: st_def
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_st_def_in_statement2484);
                    st_def138=st_def();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, st_def138.getTree());

                    }
                    break;
                case 4 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:447:4: st_yield
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_st_yield_in_statement2489);
                    st_yield139=st_yield();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, st_yield139.getTree());

                    }
                    break;
                case 5 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:448:4: st_memoize
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_st_memoize_in_statement2494);
                    st_memoize140=st_memoize();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, st_memoize140.getTree());

                    }
                    break;
                case 6 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:449:4: st_private
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_st_private_in_statement2499);
                    st_private141=st_private();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, st_private141.getTree());

                    }
                    break;
                case 7 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:450:4: st_module
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_st_module_in_statement2504);
                    st_module142=st_module();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, st_module142.getTree());

                    }
                    break;
                case 8 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:451:4: st_import
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_st_import_in_statement2509);
                    st_import143=st_import();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, st_import143.getTree());

                    }
                    break;
                case 9 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:452:4: expr_or_assign
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_expr_or_assign_in_statement2514);
                    expr_or_assign144=expr_or_assign();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_or_assign144.getTree());

                    }
                    break;
                case 10 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:453:5: PRAGMA_PRINT expr
                    {
                    PRAGMA_PRINT145=(Token)match(input,PRAGMA_PRINT,FOLLOW_PRAGMA_PRINT_in_statement2520); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PRAGMA_PRINT.add(PRAGMA_PRINT145);

                    pushFollow(FOLLOW_expr_in_statement2522);
                    expr146=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr146.getTree());


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
                    // 453:23: -> ^( PRAGMA_PRINT expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:453:26: ^( PRAGMA_PRINT expr )
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
                case 11 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:454:5: PRAGMA_LOG expr
                    {
                    PRAGMA_LOG147=(Token)match(input,PRAGMA_LOG,FOLLOW_PRAGMA_LOG_in_statement2536); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PRAGMA_LOG.add(PRAGMA_LOG147);

                    pushFollow(FOLLOW_expr_in_statement2538);
                    expr148=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr148.getTree());


                    // AST REWRITE
                    // elements: PRAGMA_LOG, expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 454:21: -> ^( PRAGMA_LOG expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:454:24: ^( PRAGMA_LOG expr )
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
                case 12 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:455:5: PRAGMA_PROFILE expr
                    {
                    PRAGMA_PROFILE149=(Token)match(input,PRAGMA_PROFILE,FOLLOW_PRAGMA_PROFILE_in_statement2552); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PRAGMA_PROFILE.add(PRAGMA_PROFILE149);

                    pushFollow(FOLLOW_expr_in_statement2554);
                    expr150=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr150.getTree());


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
                    // 455:25: -> ^( PRAGMA_PROFILE expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:455:28: ^( PRAGMA_PROFILE expr )
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
                case 13 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:456:5: PRAGMA_ASSERT expr
                    {
                    PRAGMA_ASSERT151=(Token)match(input,PRAGMA_ASSERT,FOLLOW_PRAGMA_ASSERT_in_statement2568); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PRAGMA_ASSERT.add(PRAGMA_ASSERT151);

                    pushFollow(FOLLOW_expr_in_statement2570);
                    expr152=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr152.getTree());


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
                    // 456:24: -> ^( PRAGMA_ASSERT expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:456:27: ^( PRAGMA_ASSERT expr )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:458:1: objelem_assign : Id PERIOD Id -> ^( OBJELEM_ASSIGN Id Id ) ;
    public final babel17Parser.objelem_assign_return objelem_assign() throws RecognitionException {
        babel17Parser.objelem_assign_return retval = new babel17Parser.objelem_assign_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Id153=null;
        Token PERIOD154=null;
        Token Id155=null;

        CommonTree Id153_tree=null;
        CommonTree PERIOD154_tree=null;
        CommonTree Id155_tree=null;
        RewriteRuleTokenStream stream_Id=new RewriteRuleTokenStream(adaptor,"token Id");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:459:2: ( Id PERIOD Id -> ^( OBJELEM_ASSIGN Id Id ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:459:4: Id PERIOD Id
            {
            Id153=(Token)match(input,Id,FOLLOW_Id_in_objelem_assign2588); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Id.add(Id153);

            PERIOD154=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_objelem_assign2590); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD154);

            Id155=(Token)match(input,Id,FOLLOW_Id_in_objelem_assign2592); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Id.add(Id155);



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
            // 459:17: -> ^( OBJELEM_ASSIGN Id Id )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:459:20: ^( OBJELEM_ASSIGN Id Id )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:461:1: st_val : L_val ( NL )? ( pattern | objelem_assign ) ( NL )? '=' ( NL )? expr -> ^( VAL ( pattern )* ( objelem_assign )* expr ) ;
    public final babel17Parser.st_val_return st_val() throws RecognitionException {
        babel17Parser.st_val_return retval = new babel17Parser.st_val_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_val156=null;
        Token NL157=null;
        Token NL160=null;
        Token char_literal161=null;
        Token NL162=null;
        babel17Parser.pattern_return pattern158 = null;

        babel17Parser.objelem_assign_return objelem_assign159 = null;

        babel17Parser.expr_return expr163 = null;


        CommonTree L_val156_tree=null;
        CommonTree NL157_tree=null;
        CommonTree NL160_tree=null;
        CommonTree char_literal161_tree=null;
        CommonTree NL162_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_val=new RewriteRuleTokenStream(adaptor,"token L_val");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_objelem_assign=new RewriteRuleSubtreeStream(adaptor,"rule objelem_assign");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:461:8: ( L_val ( NL )? ( pattern | objelem_assign ) ( NL )? '=' ( NL )? expr -> ^( VAL ( pattern )* ( objelem_assign )* expr ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:461:10: L_val ( NL )? ( pattern | objelem_assign ) ( NL )? '=' ( NL )? expr
            {
            L_val156=(Token)match(input,L_val,FOLLOW_L_val_in_st_val2611); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_val.add(L_val156);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:461:16: ( NL )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==NL) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:461:16: NL
                    {
                    NL157=(Token)match(input,NL,FOLLOW_NL_in_st_val2613); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL157);


                    }
                    break;

            }

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:461:20: ( pattern | objelem_assign )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==L_exception||(LA68_0>=A_infinity && LA68_0<=U_infinity)||(LA68_0>=L_true && LA68_0<=L_false)||LA68_0==L_nil||LA68_0==MINUS||(LA68_0>=A_ELLIPSIS && LA68_0<=U_ELLIPSIS)||LA68_0==Constr||LA68_0==Num||(LA68_0>=String && LA68_0<=ROUND_BRACKET_OPEN)||LA68_0==SQUARE_BRACKET_OPEN||LA68_0==CURLY_BRACKET_OPEN||LA68_0==UNDERSCORE) ) {
                alt68=1;
            }
            else if ( (LA68_0==Id) ) {
                int LA68_2 = input.LA(2);

                if ( (LA68_2==PERIOD) ) {
                    alt68=2;
                }
                else if ( (LA68_2==ASSIGN||(LA68_2>=A_DOUBLE_COLON && LA68_2<=U_DOUBLE_COLON)||LA68_2==NL) ) {
                    alt68=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 68, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:461:21: pattern
                    {
                    pushFollow(FOLLOW_pattern_in_st_val2617);
                    pattern158=pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pattern.add(pattern158.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:461:31: objelem_assign
                    {
                    pushFollow(FOLLOW_objelem_assign_in_st_val2621);
                    objelem_assign159=objelem_assign();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_objelem_assign.add(objelem_assign159.getTree());

                    }
                    break;

            }

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:461:47: ( NL )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==NL) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:461:47: NL
                    {
                    NL160=(Token)match(input,NL,FOLLOW_NL_in_st_val2624); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL160);


                    }
                    break;

            }

            char_literal161=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_st_val2627); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal161);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:461:55: ( NL )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==NL) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:461:55: NL
                    {
                    NL162=(Token)match(input,NL,FOLLOW_NL_in_st_val2629); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL162);


                    }
                    break;

            }

            pushFollow(FOLLOW_expr_in_st_val2632);
            expr163=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr163.getTree());


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
            // 461:64: -> ^( VAL ( pattern )* ( objelem_assign )* expr )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:461:67: ^( VAL ( pattern )* ( objelem_assign )* expr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VAL, "VAL"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:461:73: ( pattern )*
                while ( stream_pattern.hasNext() ) {
                    adaptor.addChild(root_1, stream_pattern.nextTree());

                }
                stream_pattern.reset();
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:461:82: ( objelem_assign )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:463:1: st_def : ( L_def ( NL )? Id ( NL )? ( primitive_pattern ( NL )? )? ( ':' ( NL )? typeid ( NL )? )? '=' ( NL )? expr -> ^( DEF Id ( typeid )? ( primitive_pattern )? expr ) | L_def ( NL )? L_this ( NL )? ':' ( NL )? typeid ( NL )? '=' ( NL )? expr -> ^( CONVERSION typeid expr ) );
    public final babel17Parser.st_def_return st_def() throws RecognitionException {
        babel17Parser.st_def_return retval = new babel17Parser.st_def_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_def164=null;
        Token NL165=null;
        Token Id166=null;
        Token NL167=null;
        Token NL169=null;
        Token char_literal170=null;
        Token NL171=null;
        Token NL173=null;
        Token char_literal174=null;
        Token NL175=null;
        Token L_def177=null;
        Token NL178=null;
        Token L_this179=null;
        Token NL180=null;
        Token char_literal181=null;
        Token NL182=null;
        Token NL184=null;
        Token char_literal185=null;
        Token NL186=null;
        babel17Parser.primitive_pattern_return primitive_pattern168 = null;

        babel17Parser.typeid_return typeid172 = null;

        babel17Parser.expr_return expr176 = null;

        babel17Parser.typeid_return typeid183 = null;

        babel17Parser.expr_return expr187 = null;


        CommonTree L_def164_tree=null;
        CommonTree NL165_tree=null;
        CommonTree Id166_tree=null;
        CommonTree NL167_tree=null;
        CommonTree NL169_tree=null;
        CommonTree char_literal170_tree=null;
        CommonTree NL171_tree=null;
        CommonTree NL173_tree=null;
        CommonTree char_literal174_tree=null;
        CommonTree NL175_tree=null;
        CommonTree L_def177_tree=null;
        CommonTree NL178_tree=null;
        CommonTree L_this179_tree=null;
        CommonTree NL180_tree=null;
        CommonTree char_literal181_tree=null;
        CommonTree NL182_tree=null;
        CommonTree NL184_tree=null;
        CommonTree char_literal185_tree=null;
        CommonTree NL186_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_L_this=new RewriteRuleTokenStream(adaptor,"token L_this");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_Id=new RewriteRuleTokenStream(adaptor,"token Id");
        RewriteRuleTokenStream stream_L_def=new RewriteRuleTokenStream(adaptor,"token L_def");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_primitive_pattern=new RewriteRuleSubtreeStream(adaptor,"rule primitive_pattern");
        RewriteRuleSubtreeStream stream_typeid=new RewriteRuleSubtreeStream(adaptor,"rule typeid");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:463:8: ( L_def ( NL )? Id ( NL )? ( primitive_pattern ( NL )? )? ( ':' ( NL )? typeid ( NL )? )? '=' ( NL )? expr -> ^( DEF Id ( typeid )? ( primitive_pattern )? expr ) | L_def ( NL )? L_this ( NL )? ':' ( NL )? typeid ( NL )? '=' ( NL )? expr -> ^( CONVERSION typeid expr ) )
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==L_def) ) {
                switch ( input.LA(2) ) {
                case NL:
                    {
                    int LA84_2 = input.LA(3);

                    if ( (LA84_2==Id) ) {
                        alt84=1;
                    }
                    else if ( (LA84_2==L_this) ) {
                        alt84=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 84, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case Id:
                    {
                    alt84=1;
                    }
                    break;
                case L_this:
                    {
                    alt84=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 84, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }
            switch (alt84) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:463:10: L_def ( NL )? Id ( NL )? ( primitive_pattern ( NL )? )? ( ':' ( NL )? typeid ( NL )? )? '=' ( NL )? expr
                    {
                    L_def164=(Token)match(input,L_def,FOLLOW_L_def_in_st_def2656); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_def.add(L_def164);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:463:16: ( NL )?
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==NL) ) {
                        alt71=1;
                    }
                    switch (alt71) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:463:16: NL
                            {
                            NL165=(Token)match(input,NL,FOLLOW_NL_in_st_def2658); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL165);


                            }
                            break;

                    }

                    Id166=(Token)match(input,Id,FOLLOW_Id_in_st_def2661); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Id.add(Id166);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:463:23: ( NL )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==NL) ) {
                        alt72=1;
                    }
                    switch (alt72) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:463:23: NL
                            {
                            NL167=(Token)match(input,NL,FOLLOW_NL_in_st_def2663); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL167);


                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:463:27: ( primitive_pattern ( NL )? )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( ((LA74_0>=A_infinity && LA74_0<=U_infinity)||(LA74_0>=L_true && LA74_0<=L_false)||LA74_0==L_nil||LA74_0==MINUS||(LA74_0>=Id && LA74_0<=Num)||(LA74_0>=String && LA74_0<=ROUND_BRACKET_OPEN)||LA74_0==SQUARE_BRACKET_OPEN||LA74_0==CURLY_BRACKET_OPEN||LA74_0==UNDERSCORE) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:463:28: primitive_pattern ( NL )?
                            {
                            pushFollow(FOLLOW_primitive_pattern_in_st_def2667);
                            primitive_pattern168=primitive_pattern();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_primitive_pattern.add(primitive_pattern168.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:463:46: ( NL )?
                            int alt73=2;
                            int LA73_0 = input.LA(1);

                            if ( (LA73_0==NL) ) {
                                alt73=1;
                            }
                            switch (alt73) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:463:46: NL
                                    {
                                    NL169=(Token)match(input,NL,FOLLOW_NL_in_st_def2669); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL169);


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:463:52: ( ':' ( NL )? typeid ( NL )? )?
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==COLON) ) {
                        alt77=1;
                    }
                    switch (alt77) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:463:53: ':' ( NL )? typeid ( NL )?
                            {
                            char_literal170=(Token)match(input,COLON,FOLLOW_COLON_in_st_def2675); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COLON.add(char_literal170);

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:463:57: ( NL )?
                            int alt75=2;
                            int LA75_0 = input.LA(1);

                            if ( (LA75_0==NL) ) {
                                alt75=1;
                            }
                            switch (alt75) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:463:57: NL
                                    {
                                    NL171=(Token)match(input,NL,FOLLOW_NL_in_st_def2677); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL171);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_typeid_in_st_def2680);
                            typeid172=typeid();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeid.add(typeid172.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:463:68: ( NL )?
                            int alt76=2;
                            int LA76_0 = input.LA(1);

                            if ( (LA76_0==NL) ) {
                                alt76=1;
                            }
                            switch (alt76) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:463:68: NL
                                    {
                                    NL173=(Token)match(input,NL,FOLLOW_NL_in_st_def2682); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL173);


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    char_literal174=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_st_def2687); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal174);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:463:78: ( NL )?
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==NL) ) {
                        alt78=1;
                    }
                    switch (alt78) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:463:78: NL
                            {
                            NL175=(Token)match(input,NL,FOLLOW_NL_in_st_def2689); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL175);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_expr_in_st_def2692);
                    expr176=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr176.getTree());


                    // AST REWRITE
                    // elements: Id, typeid, expr, primitive_pattern
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 464:5: -> ^( DEF Id ( typeid )? ( primitive_pattern )? expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:464:8: ^( DEF Id ( typeid )? ( primitive_pattern )? expr )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DEF, "DEF"), root_1);

                        adaptor.addChild(root_1, stream_Id.nextNode());
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:464:17: ( typeid )?
                        if ( stream_typeid.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeid.nextTree());

                        }
                        stream_typeid.reset();
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:464:25: ( primitive_pattern )?
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
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:465:4: L_def ( NL )? L_this ( NL )? ':' ( NL )? typeid ( NL )? '=' ( NL )? expr
                    {
                    L_def177=(Token)match(input,L_def,FOLLOW_L_def_in_st_def2718); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_def.add(L_def177);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:465:10: ( NL )?
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==NL) ) {
                        alt79=1;
                    }
                    switch (alt79) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:465:10: NL
                            {
                            NL178=(Token)match(input,NL,FOLLOW_NL_in_st_def2720); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL178);


                            }
                            break;

                    }

                    L_this179=(Token)match(input,L_this,FOLLOW_L_this_in_st_def2723); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_this.add(L_this179);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:465:21: ( NL )?
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==NL) ) {
                        alt80=1;
                    }
                    switch (alt80) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:465:21: NL
                            {
                            NL180=(Token)match(input,NL,FOLLOW_NL_in_st_def2725); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL180);


                            }
                            break;

                    }

                    char_literal181=(Token)match(input,COLON,FOLLOW_COLON_in_st_def2728); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(char_literal181);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:465:29: ( NL )?
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==NL) ) {
                        alt81=1;
                    }
                    switch (alt81) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:465:29: NL
                            {
                            NL182=(Token)match(input,NL,FOLLOW_NL_in_st_def2730); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL182);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_typeid_in_st_def2733);
                    typeid183=typeid();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeid.add(typeid183.getTree());
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
                            NL184=(Token)match(input,NL,FOLLOW_NL_in_st_def2735); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL184);


                            }
                            break;

                    }

                    char_literal185=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_st_def2738); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal185);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:465:48: ( NL )?
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==NL) ) {
                        alt83=1;
                    }
                    switch (alt83) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:465:48: NL
                            {
                            NL186=(Token)match(input,NL,FOLLOW_NL_in_st_def2740); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL186);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_expr_in_st_def2743);
                    expr187=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr187.getTree());


                    // AST REWRITE
                    // elements: expr, typeid
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 465:57: -> ^( CONVERSION typeid expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:465:60: ^( CONVERSION typeid expr )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONVERSION, "CONVERSION"), root_1);

                        adaptor.addChild(root_1, stream_typeid.nextTree());
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
    // $ANTLR end "st_def"

    public static class st_typedef_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "st_typedef"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:467:1: st_typedef : L_typedef ( NL )? Id ( NL )? typedef_clause ( ( NL )? COMMA ( NL )? typedef_clause )* -> ^( TYPEDEF Id ( typedef_clause )* ) ;
    public final babel17Parser.st_typedef_return st_typedef() throws RecognitionException {
        babel17Parser.st_typedef_return retval = new babel17Parser.st_typedef_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_typedef188=null;
        Token NL189=null;
        Token Id190=null;
        Token NL191=null;
        Token NL193=null;
        Token COMMA194=null;
        Token NL195=null;
        babel17Parser.typedef_clause_return typedef_clause192 = null;

        babel17Parser.typedef_clause_return typedef_clause196 = null;


        CommonTree L_typedef188_tree=null;
        CommonTree NL189_tree=null;
        CommonTree Id190_tree=null;
        CommonTree NL191_tree=null;
        CommonTree NL193_tree=null;
        CommonTree COMMA194_tree=null;
        CommonTree NL195_tree=null;
        RewriteRuleTokenStream stream_L_typedef=new RewriteRuleTokenStream(adaptor,"token L_typedef");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_Id=new RewriteRuleTokenStream(adaptor,"token Id");
        RewriteRuleSubtreeStream stream_typedef_clause=new RewriteRuleSubtreeStream(adaptor,"rule typedef_clause");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:468:2: ( L_typedef ( NL )? Id ( NL )? typedef_clause ( ( NL )? COMMA ( NL )? typedef_clause )* -> ^( TYPEDEF Id ( typedef_clause )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:468:4: L_typedef ( NL )? Id ( NL )? typedef_clause ( ( NL )? COMMA ( NL )? typedef_clause )*
            {
            L_typedef188=(Token)match(input,L_typedef,FOLLOW_L_typedef_in_st_typedef2766); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_typedef.add(L_typedef188);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:468:14: ( NL )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==NL) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:468:14: NL
                    {
                    NL189=(Token)match(input,NL,FOLLOW_NL_in_st_typedef2768); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL189);


                    }
                    break;

            }

            Id190=(Token)match(input,Id,FOLLOW_Id_in_st_typedef2771); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Id.add(Id190);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:468:21: ( NL )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==NL) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:468:21: NL
                    {
                    NL191=(Token)match(input,NL,FOLLOW_NL_in_st_typedef2773); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL191);


                    }
                    break;

            }

            pushFollow(FOLLOW_typedef_clause_in_st_typedef2776);
            typedef_clause192=typedef_clause();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typedef_clause.add(typedef_clause192.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:468:40: ( ( NL )? COMMA ( NL )? typedef_clause )*
            loop89:
            do {
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( (LA89_0==NL) ) {
                    int LA89_1 = input.LA(2);

                    if ( (LA89_1==COMMA) ) {
                        alt89=1;
                    }


                }
                else if ( (LA89_0==COMMA) ) {
                    alt89=1;
                }


                switch (alt89) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:468:41: ( NL )? COMMA ( NL )? typedef_clause
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:468:41: ( NL )?
            	    int alt87=2;
            	    int LA87_0 = input.LA(1);

            	    if ( (LA87_0==NL) ) {
            	        alt87=1;
            	    }
            	    switch (alt87) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:468:41: NL
            	            {
            	            NL193=(Token)match(input,NL,FOLLOW_NL_in_st_typedef2779); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL193);


            	            }
            	            break;

            	    }

            	    COMMA194=(Token)match(input,COMMA,FOLLOW_COMMA_in_st_typedef2782); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA194);

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:468:51: ( NL )?
            	    int alt88=2;
            	    int LA88_0 = input.LA(1);

            	    if ( (LA88_0==NL) ) {
            	        alt88=1;
            	    }
            	    switch (alt88) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:468:51: NL
            	            {
            	            NL195=(Token)match(input,NL,FOLLOW_NL_in_st_typedef2784); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL195);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_typedef_clause_in_st_typedef2787);
            	    typedef_clause196=typedef_clause();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_typedef_clause.add(typedef_clause196.getTree());

            	    }
            	    break;

            	default :
            	    break loop89;
                }
            } while (true);



            // AST REWRITE
            // elements: typedef_clause, Id
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 468:72: -> ^( TYPEDEF Id ( typedef_clause )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:468:75: ^( TYPEDEF Id ( typedef_clause )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TYPEDEF, "TYPEDEF"), root_1);

                adaptor.addChild(root_1, stream_Id.nextNode());
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:468:88: ( typedef_clause )*
                while ( stream_typedef_clause.hasNext() ) {
                    adaptor.addChild(root_1, stream_typedef_clause.nextTree());

                }
                stream_typedef_clause.reset();

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
    // $ANTLR end "st_typedef"

    public static class typedef_clause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typedef_clause"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:470:1: typedef_clause : ( ( primitive_pattern ( NL )? '=' )=> primitive_pattern ( NL )? '=' ( NL )? expr -> ^( TYPEDEF_CLAUSE primitive_pattern expr ) | primitive_pattern -> ^( TYPEDEF_CLAUSE primitive_pattern ) );
    public final babel17Parser.typedef_clause_return typedef_clause() throws RecognitionException {
        babel17Parser.typedef_clause_return retval = new babel17Parser.typedef_clause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL198=null;
        Token char_literal199=null;
        Token NL200=null;
        babel17Parser.primitive_pattern_return primitive_pattern197 = null;

        babel17Parser.expr_return expr201 = null;

        babel17Parser.primitive_pattern_return primitive_pattern202 = null;


        CommonTree NL198_tree=null;
        CommonTree char_literal199_tree=null;
        CommonTree NL200_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_primitive_pattern=new RewriteRuleSubtreeStream(adaptor,"rule primitive_pattern");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:471:2: ( ( primitive_pattern ( NL )? '=' )=> primitive_pattern ( NL )? '=' ( NL )? expr -> ^( TYPEDEF_CLAUSE primitive_pattern expr ) | primitive_pattern -> ^( TYPEDEF_CLAUSE primitive_pattern ) )
            int alt92=2;
            alt92 = dfa92.predict(input);
            switch (alt92) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:471:4: ( primitive_pattern ( NL )? '=' )=> primitive_pattern ( NL )? '=' ( NL )? expr
                    {
                    pushFollow(FOLLOW_primitive_pattern_in_typedef_clause2821);
                    primitive_pattern197=primitive_pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primitive_pattern.add(primitive_pattern197.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:471:53: ( NL )?
                    int alt90=2;
                    int LA90_0 = input.LA(1);

                    if ( (LA90_0==NL) ) {
                        alt90=1;
                    }
                    switch (alt90) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:471:53: NL
                            {
                            NL198=(Token)match(input,NL,FOLLOW_NL_in_typedef_clause2823); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL198);


                            }
                            break;

                    }

                    char_literal199=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_typedef_clause2826); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal199);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:471:61: ( NL )?
                    int alt91=2;
                    int LA91_0 = input.LA(1);

                    if ( (LA91_0==NL) ) {
                        alt91=1;
                    }
                    switch (alt91) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:471:61: NL
                            {
                            NL200=(Token)match(input,NL,FOLLOW_NL_in_typedef_clause2828); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL200);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_expr_in_typedef_clause2831);
                    expr201=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr201.getTree());


                    // AST REWRITE
                    // elements: primitive_pattern, expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 471:70: -> ^( TYPEDEF_CLAUSE primitive_pattern expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:471:73: ^( TYPEDEF_CLAUSE primitive_pattern expr )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TYPEDEF_CLAUSE, "TYPEDEF_CLAUSE"), root_1);

                        adaptor.addChild(root_1, stream_primitive_pattern.nextTree());
                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:472:4: primitive_pattern
                    {
                    pushFollow(FOLLOW_primitive_pattern_in_typedef_clause2846);
                    primitive_pattern202=primitive_pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primitive_pattern.add(primitive_pattern202.getTree());


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
                    // 472:22: -> ^( TYPEDEF_CLAUSE primitive_pattern )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:472:25: ^( TYPEDEF_CLAUSE primitive_pattern )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TYPEDEF_CLAUSE, "TYPEDEF_CLAUSE"), root_1);

                        adaptor.addChild(root_1, stream_primitive_pattern.nextTree());

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
    // $ANTLR end "typedef_clause"

    public static class st_yield_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "st_yield"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:474:1: st_yield : L_yield expr -> ^( YIELD expr ) ;
    public final babel17Parser.st_yield_return st_yield() throws RecognitionException {
        babel17Parser.st_yield_return retval = new babel17Parser.st_yield_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_yield203=null;
        babel17Parser.expr_return expr204 = null;


        CommonTree L_yield203_tree=null;
        RewriteRuleTokenStream stream_L_yield=new RewriteRuleTokenStream(adaptor,"token L_yield");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:474:9: ( L_yield expr -> ^( YIELD expr ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:474:11: L_yield expr
            {
            L_yield203=(Token)match(input,L_yield,FOLLOW_L_yield_in_st_yield2865); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_yield.add(L_yield203);

            pushFollow(FOLLOW_expr_in_st_yield2867);
            expr204=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr204.getTree());


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
            // 474:24: -> ^( YIELD expr )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:474:27: ^( YIELD expr )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:476:1: st_memoize : L_memoize sw_id ( ( NL )? COMMA ( NL )? sw_id )* -> ^( MEMOIZE ( sw_id )* ) ;
    public final babel17Parser.st_memoize_return st_memoize() throws RecognitionException {
        babel17Parser.st_memoize_return retval = new babel17Parser.st_memoize_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_memoize205=null;
        Token NL207=null;
        Token COMMA208=null;
        Token NL209=null;
        babel17Parser.sw_id_return sw_id206 = null;

        babel17Parser.sw_id_return sw_id210 = null;


        CommonTree L_memoize205_tree=null;
        CommonTree NL207_tree=null;
        CommonTree COMMA208_tree=null;
        CommonTree NL209_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_memoize=new RewriteRuleTokenStream(adaptor,"token L_memoize");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_sw_id=new RewriteRuleSubtreeStream(adaptor,"rule sw_id");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:477:2: ( L_memoize sw_id ( ( NL )? COMMA ( NL )? sw_id )* -> ^( MEMOIZE ( sw_id )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:477:4: L_memoize sw_id ( ( NL )? COMMA ( NL )? sw_id )*
            {
            L_memoize205=(Token)match(input,L_memoize,FOLLOW_L_memoize_in_st_memoize2888); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_memoize.add(L_memoize205);

            pushFollow(FOLLOW_sw_id_in_st_memoize2890);
            sw_id206=sw_id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_sw_id.add(sw_id206.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:477:20: ( ( NL )? COMMA ( NL )? sw_id )*
            loop95:
            do {
                int alt95=2;
                int LA95_0 = input.LA(1);

                if ( (LA95_0==NL) ) {
                    int LA95_1 = input.LA(2);

                    if ( (LA95_1==COMMA) ) {
                        alt95=1;
                    }


                }
                else if ( (LA95_0==COMMA) ) {
                    alt95=1;
                }


                switch (alt95) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:477:21: ( NL )? COMMA ( NL )? sw_id
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:477:21: ( NL )?
            	    int alt93=2;
            	    int LA93_0 = input.LA(1);

            	    if ( (LA93_0==NL) ) {
            	        alt93=1;
            	    }
            	    switch (alt93) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:477:21: NL
            	            {
            	            NL207=(Token)match(input,NL,FOLLOW_NL_in_st_memoize2893); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL207);


            	            }
            	            break;

            	    }

            	    COMMA208=(Token)match(input,COMMA,FOLLOW_COMMA_in_st_memoize2896); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA208);

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:477:31: ( NL )?
            	    int alt94=2;
            	    int LA94_0 = input.LA(1);

            	    if ( (LA94_0==NL) ) {
            	        alt94=1;
            	    }
            	    switch (alt94) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:477:31: NL
            	            {
            	            NL209=(Token)match(input,NL,FOLLOW_NL_in_st_memoize2898); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL209);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_sw_id_in_st_memoize2901);
            	    sw_id210=sw_id();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_sw_id.add(sw_id210.getTree());

            	    }
            	    break;

            	default :
            	    break loop95;
                }
            } while (true);



            // AST REWRITE
            // elements: sw_id
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 478:5: -> ^( MEMOIZE ( sw_id )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:478:8: ^( MEMOIZE ( sw_id )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MEMOIZE, "MEMOIZE"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:478:18: ( sw_id )*
                while ( stream_sw_id.hasNext() ) {
                    adaptor.addChild(root_1, stream_sw_id.nextTree());

                }
                stream_sw_id.reset();

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

    public static class sw_id_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sw_id"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:480:1: sw_id : ( Id -> ^( ID_STRONG Id ) | '(' Id ')' -> ^( ID_WEAK Id ) );
    public final babel17Parser.sw_id_return sw_id() throws RecognitionException {
        babel17Parser.sw_id_return retval = new babel17Parser.sw_id_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Id211=null;
        Token char_literal212=null;
        Token Id213=null;
        Token char_literal214=null;

        CommonTree Id211_tree=null;
        CommonTree char_literal212_tree=null;
        CommonTree Id213_tree=null;
        CommonTree char_literal214_tree=null;
        RewriteRuleTokenStream stream_ROUND_BRACKET_OPEN=new RewriteRuleTokenStream(adaptor,"token ROUND_BRACKET_OPEN");
        RewriteRuleTokenStream stream_ROUND_BRACKET_CLOSE=new RewriteRuleTokenStream(adaptor,"token ROUND_BRACKET_CLOSE");
        RewriteRuleTokenStream stream_Id=new RewriteRuleTokenStream(adaptor,"token Id");

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:480:7: ( Id -> ^( ID_STRONG Id ) | '(' Id ')' -> ^( ID_WEAK Id ) )
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==Id) ) {
                alt96=1;
            }
            else if ( (LA96_0==ROUND_BRACKET_OPEN) ) {
                alt96=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                throw nvae;
            }
            switch (alt96) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:480:9: Id
                    {
                    Id211=(Token)match(input,Id,FOLLOW_Id_in_sw_id2930); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Id.add(Id211);



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
                    // 480:12: -> ^( ID_STRONG Id )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:480:15: ^( ID_STRONG Id )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ID_STRONG, "ID_STRONG"), root_1);

                        adaptor.addChild(root_1, stream_Id.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:481:4: '(' Id ')'
                    {
                    char_literal212=(Token)match(input,ROUND_BRACKET_OPEN,FOLLOW_ROUND_BRACKET_OPEN_in_sw_id2943); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ROUND_BRACKET_OPEN.add(char_literal212);

                    Id213=(Token)match(input,Id,FOLLOW_Id_in_sw_id2945); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Id.add(Id213);

                    char_literal214=(Token)match(input,ROUND_BRACKET_CLOSE,FOLLOW_ROUND_BRACKET_CLOSE_in_sw_id2947); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ROUND_BRACKET_CLOSE.add(char_literal214);



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
                    // 481:15: -> ^( ID_WEAK Id )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:481:18: ^( ID_WEAK Id )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ID_WEAK, "ID_WEAK"), root_1);

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
    // $ANTLR end "sw_id"

    public static class st_private_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "st_private"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:483:1: st_private : L_private sw_id ( ( NL )? COMMA ( NL )? sw_id )* -> ^( PRIVATE ( sw_id )* ) ;
    public final babel17Parser.st_private_return st_private() throws RecognitionException {
        babel17Parser.st_private_return retval = new babel17Parser.st_private_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_private215=null;
        Token NL217=null;
        Token COMMA218=null;
        Token NL219=null;
        babel17Parser.sw_id_return sw_id216 = null;

        babel17Parser.sw_id_return sw_id220 = null;


        CommonTree L_private215_tree=null;
        CommonTree NL217_tree=null;
        CommonTree COMMA218_tree=null;
        CommonTree NL219_tree=null;
        RewriteRuleTokenStream stream_L_private=new RewriteRuleTokenStream(adaptor,"token L_private");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_sw_id=new RewriteRuleSubtreeStream(adaptor,"rule sw_id");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:484:2: ( L_private sw_id ( ( NL )? COMMA ( NL )? sw_id )* -> ^( PRIVATE ( sw_id )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:484:4: L_private sw_id ( ( NL )? COMMA ( NL )? sw_id )*
            {
            L_private215=(Token)match(input,L_private,FOLLOW_L_private_in_st_private2964); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_private.add(L_private215);

            pushFollow(FOLLOW_sw_id_in_st_private2966);
            sw_id216=sw_id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_sw_id.add(sw_id216.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:484:20: ( ( NL )? COMMA ( NL )? sw_id )*
            loop99:
            do {
                int alt99=2;
                int LA99_0 = input.LA(1);

                if ( (LA99_0==NL) ) {
                    int LA99_1 = input.LA(2);

                    if ( (LA99_1==COMMA) ) {
                        alt99=1;
                    }


                }
                else if ( (LA99_0==COMMA) ) {
                    alt99=1;
                }


                switch (alt99) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:484:21: ( NL )? COMMA ( NL )? sw_id
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:484:21: ( NL )?
            	    int alt97=2;
            	    int LA97_0 = input.LA(1);

            	    if ( (LA97_0==NL) ) {
            	        alt97=1;
            	    }
            	    switch (alt97) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:484:21: NL
            	            {
            	            NL217=(Token)match(input,NL,FOLLOW_NL_in_st_private2969); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL217);


            	            }
            	            break;

            	    }

            	    COMMA218=(Token)match(input,COMMA,FOLLOW_COMMA_in_st_private2972); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA218);

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:484:31: ( NL )?
            	    int alt98=2;
            	    int LA98_0 = input.LA(1);

            	    if ( (LA98_0==NL) ) {
            	        alt98=1;
            	    }
            	    switch (alt98) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:484:31: NL
            	            {
            	            NL219=(Token)match(input,NL,FOLLOW_NL_in_st_private2974); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL219);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_sw_id_in_st_private2977);
            	    sw_id220=sw_id();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_sw_id.add(sw_id220.getTree());

            	    }
            	    break;

            	default :
            	    break loop99;
                }
            } while (true);



            // AST REWRITE
            // elements: sw_id
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 485:5: -> ^( PRIVATE ( sw_id )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:485:8: ^( PRIVATE ( sw_id )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PRIVATE, "PRIVATE"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:485:18: ( sw_id )*
                while ( stream_sw_id.hasNext() ) {
                    adaptor.addChild(root_1, stream_sw_id.nextTree());

                }
                stream_sw_id.reset();

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
    // $ANTLR end "st_private"

    public static class st_module_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "st_module"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:487:1: st_module : L_module ( NL )? typeid block L_end -> ^( L_module typeid block ) ;
    public final babel17Parser.st_module_return st_module() throws RecognitionException {
        babel17Parser.st_module_return retval = new babel17Parser.st_module_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_module221=null;
        Token NL222=null;
        Token L_end225=null;
        babel17Parser.typeid_return typeid223 = null;

        babel17Parser.block_return block224 = null;


        CommonTree L_module221_tree=null;
        CommonTree NL222_tree=null;
        CommonTree L_end225_tree=null;
        RewriteRuleTokenStream stream_L_module=new RewriteRuleTokenStream(adaptor,"token L_module");
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_typeid=new RewriteRuleSubtreeStream(adaptor,"rule typeid");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:488:2: ( L_module ( NL )? typeid block L_end -> ^( L_module typeid block ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:488:4: L_module ( NL )? typeid block L_end
            {
            L_module221=(Token)match(input,L_module,FOLLOW_L_module_in_st_module3002); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_module.add(L_module221);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:488:13: ( NL )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==NL) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:488:13: NL
                    {
                    NL222=(Token)match(input,NL,FOLLOW_NL_in_st_module3004); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL222);


                    }
                    break;

            }

            pushFollow(FOLLOW_typeid_in_st_module3007);
            typeid223=typeid();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeid.add(typeid223.getTree());
            pushFollow(FOLLOW_block_in_st_module3009);
            block224=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block224.getTree());
            L_end225=(Token)match(input,L_end,FOLLOW_L_end_in_st_module3011); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_end.add(L_end225);



            // AST REWRITE
            // elements: L_module, typeid, block
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 488:36: -> ^( L_module typeid block )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:488:39: ^( L_module typeid block )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_L_module.nextNode(), root_1);

                adaptor.addChild(root_1, stream_typeid.nextTree());
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
    // $ANTLR end "st_module"

    public static class importid_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "importid"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:490:1: importid : Id ( ( NL )? PERIOD ( NL )? Id )* ( importall )? -> ^( IMPORTID ( Id )* ( importall )? ) ;
    public final babel17Parser.importid_return importid() throws RecognitionException {
        babel17Parser.importid_return retval = new babel17Parser.importid_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Id226=null;
        Token NL227=null;
        Token PERIOD228=null;
        Token NL229=null;
        Token Id230=null;
        babel17Parser.importall_return importall231 = null;


        CommonTree Id226_tree=null;
        CommonTree NL227_tree=null;
        CommonTree PERIOD228_tree=null;
        CommonTree NL229_tree=null;
        CommonTree Id230_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_Id=new RewriteRuleTokenStream(adaptor,"token Id");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
        RewriteRuleSubtreeStream stream_importall=new RewriteRuleSubtreeStream(adaptor,"rule importall");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:491:2: ( Id ( ( NL )? PERIOD ( NL )? Id )* ( importall )? -> ^( IMPORTID ( Id )* ( importall )? ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:491:4: Id ( ( NL )? PERIOD ( NL )? Id )* ( importall )?
            {
            Id226=(Token)match(input,Id,FOLLOW_Id_in_importid3031); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Id.add(Id226);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:491:7: ( ( NL )? PERIOD ( NL )? Id )*
            loop103:
            do {
                int alt103=2;
                int LA103_0 = input.LA(1);

                if ( (LA103_0==PERIOD) ) {
                    int LA103_1 = input.LA(2);

                    if ( (LA103_1==NL||LA103_1==Id) ) {
                        alt103=1;
                    }


                }
                else if ( (LA103_0==NL) ) {
                    int LA103_2 = input.LA(2);

                    if ( (LA103_2==PERIOD) ) {
                        alt103=1;
                    }


                }


                switch (alt103) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:491:8: ( NL )? PERIOD ( NL )? Id
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:491:8: ( NL )?
            	    int alt101=2;
            	    int LA101_0 = input.LA(1);

            	    if ( (LA101_0==NL) ) {
            	        alt101=1;
            	    }
            	    switch (alt101) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:491:8: NL
            	            {
            	            NL227=(Token)match(input,NL,FOLLOW_NL_in_importid3034); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL227);


            	            }
            	            break;

            	    }

            	    PERIOD228=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_importid3037); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD228);

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:491:19: ( NL )?
            	    int alt102=2;
            	    int LA102_0 = input.LA(1);

            	    if ( (LA102_0==NL) ) {
            	        alt102=1;
            	    }
            	    switch (alt102) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:491:19: NL
            	            {
            	            NL229=(Token)match(input,NL,FOLLOW_NL_in_importid3039); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL229);


            	            }
            	            break;

            	    }

            	    Id230=(Token)match(input,Id,FOLLOW_Id_in_importid3042); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_Id.add(Id230);


            	    }
            	    break;

            	default :
            	    break loop103;
                }
            } while (true);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:491:28: ( importall )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==PERIOD) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:491:28: importall
                    {
                    pushFollow(FOLLOW_importall_in_importid3046);
                    importall231=importall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_importall.add(importall231.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: importall, Id
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 491:39: -> ^( IMPORTID ( Id )* ( importall )? )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:491:42: ^( IMPORTID ( Id )* ( importall )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IMPORTID, "IMPORTID"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:491:53: ( Id )*
                while ( stream_Id.hasNext() ) {
                    adaptor.addChild(root_1, stream_Id.nextNode());

                }
                stream_Id.reset();
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:491:57: ( importall )?
                if ( stream_importall.hasNext() ) {
                    adaptor.addChild(root_1, stream_importall.nextTree());

                }
                stream_importall.reset();

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
    // $ANTLR end "importid"

    public static class importall_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "importall"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:493:1: importall : PERIOD UNDERSCORE -> ^( UNDERSCORE ) ;
    public final babel17Parser.importall_return importall() throws RecognitionException {
        babel17Parser.importall_return retval = new babel17Parser.importall_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PERIOD232=null;
        Token UNDERSCORE233=null;

        CommonTree PERIOD232_tree=null;
        CommonTree UNDERSCORE233_tree=null;
        RewriteRuleTokenStream stream_UNDERSCORE=new RewriteRuleTokenStream(adaptor,"token UNDERSCORE");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:494:2: ( PERIOD UNDERSCORE -> ^( UNDERSCORE ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:494:4: PERIOD UNDERSCORE
            {
            PERIOD232=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_importall3069); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD232);

            UNDERSCORE233=(Token)match(input,UNDERSCORE,FOLLOW_UNDERSCORE_in_importall3071); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_UNDERSCORE.add(UNDERSCORE233);



            // AST REWRITE
            // elements: UNDERSCORE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 494:22: -> ^( UNDERSCORE )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:494:25: ^( UNDERSCORE )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_UNDERSCORE.nextNode(), root_1);

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
    // $ANTLR end "importall"

    public static class st_import_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "st_import"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:496:1: st_import : L_import ( NL )? importid -> ^( L_import importid ) ;
    public final babel17Parser.st_import_return st_import() throws RecognitionException {
        babel17Parser.st_import_return retval = new babel17Parser.st_import_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_import234=null;
        Token NL235=null;
        babel17Parser.importid_return importid236 = null;


        CommonTree L_import234_tree=null;
        CommonTree NL235_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_import=new RewriteRuleTokenStream(adaptor,"token L_import");
        RewriteRuleSubtreeStream stream_importid=new RewriteRuleSubtreeStream(adaptor,"rule importid");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:497:2: ( L_import ( NL )? importid -> ^( L_import importid ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:497:4: L_import ( NL )? importid
            {
            L_import234=(Token)match(input,L_import,FOLLOW_L_import_in_st_import3086); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_import.add(L_import234);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:497:13: ( NL )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==NL) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:497:13: NL
                    {
                    NL235=(Token)match(input,NL,FOLLOW_NL_in_st_import3088); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL235);


                    }
                    break;

            }

            pushFollow(FOLLOW_importid_in_st_import3092);
            importid236=importid();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_importid.add(importid236.getTree());


            // AST REWRITE
            // elements: L_import, importid
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 497:27: -> ^( L_import importid )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:497:30: ^( L_import importid )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_L_import.nextNode(), root_1);

                adaptor.addChild(root_1, stream_importid.nextTree());

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
    // $ANTLR end "st_import"

    public static class expr_or_assign_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr_or_assign"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:499:1: expr_or_assign : ( ( ( pattern | objelem_assign ) ( NL )? '=' )=> ( pattern | objelem_assign ) ( NL )? '=' ( NL )? expr -> ^( ASSIGN ( pattern )* ( objelem_assign )* expr ) | expr );
    public final babel17Parser.expr_or_assign_return expr_or_assign() throws RecognitionException {
        babel17Parser.expr_or_assign_return retval = new babel17Parser.expr_or_assign_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL239=null;
        Token char_literal240=null;
        Token NL241=null;
        babel17Parser.pattern_return pattern237 = null;

        babel17Parser.objelem_assign_return objelem_assign238 = null;

        babel17Parser.expr_return expr242 = null;

        babel17Parser.expr_return expr243 = null;


        CommonTree NL239_tree=null;
        CommonTree char_literal240_tree=null;
        CommonTree NL241_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_objelem_assign=new RewriteRuleSubtreeStream(adaptor,"rule objelem_assign");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:500:2: ( ( ( pattern | objelem_assign ) ( NL )? '=' )=> ( pattern | objelem_assign ) ( NL )? '=' ( NL )? expr -> ^( ASSIGN ( pattern )* ( objelem_assign )* expr ) | expr )
            int alt109=2;
            alt109 = dfa109.predict(input);
            switch (alt109) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:500:4: ( ( pattern | objelem_assign ) ( NL )? '=' )=> ( pattern | objelem_assign ) ( NL )? '=' ( NL )? expr
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:500:44: ( pattern | objelem_assign )
                    int alt106=2;
                    int LA106_0 = input.LA(1);

                    if ( (LA106_0==L_exception||(LA106_0>=A_infinity && LA106_0<=U_infinity)||(LA106_0>=L_true && LA106_0<=L_false)||LA106_0==L_nil||LA106_0==MINUS||(LA106_0>=A_ELLIPSIS && LA106_0<=U_ELLIPSIS)||LA106_0==Constr||LA106_0==Num||(LA106_0>=String && LA106_0<=ROUND_BRACKET_OPEN)||LA106_0==SQUARE_BRACKET_OPEN||LA106_0==CURLY_BRACKET_OPEN||LA106_0==UNDERSCORE) ) {
                        alt106=1;
                    }
                    else if ( (LA106_0==Id) ) {
                        int LA106_2 = input.LA(2);

                        if ( (LA106_2==PERIOD) ) {
                            alt106=2;
                        }
                        else if ( (LA106_2==ASSIGN||(LA106_2>=A_DOUBLE_COLON && LA106_2<=U_DOUBLE_COLON)||LA106_2==NL) ) {
                            alt106=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 106, 2, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 106, 0, input);

                        throw nvae;
                    }
                    switch (alt106) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:500:45: pattern
                            {
                            pushFollow(FOLLOW_pattern_in_expr_or_assign3128);
                            pattern237=pattern();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_pattern.add(pattern237.getTree());

                            }
                            break;
                        case 2 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:500:55: objelem_assign
                            {
                            pushFollow(FOLLOW_objelem_assign_in_expr_or_assign3132);
                            objelem_assign238=objelem_assign();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_objelem_assign.add(objelem_assign238.getTree());

                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:500:71: ( NL )?
                    int alt107=2;
                    int LA107_0 = input.LA(1);

                    if ( (LA107_0==NL) ) {
                        alt107=1;
                    }
                    switch (alt107) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:500:71: NL
                            {
                            NL239=(Token)match(input,NL,FOLLOW_NL_in_expr_or_assign3135); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL239);


                            }
                            break;

                    }

                    char_literal240=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_expr_or_assign3138); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal240);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:500:79: ( NL )?
                    int alt108=2;
                    int LA108_0 = input.LA(1);

                    if ( (LA108_0==NL) ) {
                        alt108=1;
                    }
                    switch (alt108) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:500:79: NL
                            {
                            NL241=(Token)match(input,NL,FOLLOW_NL_in_expr_or_assign3140); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL241);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_expr_in_expr_or_assign3143);
                    expr242=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr242.getTree());


                    // AST REWRITE
                    // elements: objelem_assign, expr, pattern
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 500:88: -> ^( ASSIGN ( pattern )* ( objelem_assign )* expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:500:91: ^( ASSIGN ( pattern )* ( objelem_assign )* expr )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASSIGN, "ASSIGN"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:500:100: ( pattern )*
                        while ( stream_pattern.hasNext() ) {
                            adaptor.addChild(root_1, stream_pattern.nextTree());

                        }
                        stream_pattern.reset();
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:500:109: ( objelem_assign )*
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:501:4: expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_expr_in_expr_or_assign3162);
                    expr243=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr243.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:503:1: expr : ( lop_expr | obj_expr );
    public final babel17Parser.expr_return expr() throws RecognitionException {
        babel17Parser.expr_return retval = new babel17Parser.expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.lop_expr_return lop_expr244 = null;

        babel17Parser.obj_expr_return obj_expr245 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:504:2: ( lop_expr | obj_expr )
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==L_begin||(LA110_0>=L_with && LA110_0<=L_if)||(LA110_0>=L_while && LA110_0<=L_for)||LA110_0==L_match||LA110_0==L_exception||LA110_0==L_try||(LA110_0>=A_infinity && LA110_0<=L_lazy)||(LA110_0>=L_true && LA110_0<=L_nil)||LA110_0==L_typeof||LA110_0==MINUS||LA110_0==A_NOT||LA110_0==U_NOT||(LA110_0>=A_ELLIPSIS && LA110_0<=U_ELLIPSIS)||LA110_0==L_force||(LA110_0>=Constr && LA110_0<=Num)||(LA110_0>=String && LA110_0<=ROUND_BRACKET_OPEN)||LA110_0==SQUARE_BRACKET_OPEN||LA110_0==CURLY_BRACKET_OPEN||LA110_0==UNDERSCORE) ) {
                alt110=1;
            }
            else if ( (LA110_0==L_obj) ) {
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:504:4: lop_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_lop_expr_in_expr3173);
                    lop_expr244=lop_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lop_expr244.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:505:4: obj_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_obj_expr_in_expr3178);
                    obj_expr245=obj_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, obj_expr245.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:507:1: control_expr : ( if_expr | while_do_expr | match_expr | for_expr | try_expr | begin_end );
    public final babel17Parser.control_expr_return control_expr() throws RecognitionException {
        babel17Parser.control_expr_return retval = new babel17Parser.control_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.if_expr_return if_expr246 = null;

        babel17Parser.while_do_expr_return while_do_expr247 = null;

        babel17Parser.match_expr_return match_expr248 = null;

        babel17Parser.for_expr_return for_expr249 = null;

        babel17Parser.try_expr_return try_expr250 = null;

        babel17Parser.begin_end_return begin_end251 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:508:2: ( if_expr | while_do_expr | match_expr | for_expr | try_expr | begin_end )
            int alt111=6;
            switch ( input.LA(1) ) {
            case L_if:
                {
                alt111=1;
                }
                break;
            case L_while:
                {
                alt111=2;
                }
                break;
            case L_match:
                {
                alt111=3;
                }
                break;
            case L_for:
                {
                alt111=4;
                }
                break;
            case L_try:
                {
                alt111=5;
                }
                break;
            case L_begin:
                {
                alt111=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 111, 0, input);

                throw nvae;
            }

            switch (alt111) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:508:4: if_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_if_expr_in_control_expr3188);
                    if_expr246=if_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, if_expr246.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:509:4: while_do_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_while_do_expr_in_control_expr3193);
                    while_do_expr247=while_do_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, while_do_expr247.getTree());

                    }
                    break;
                case 3 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:510:4: match_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_match_expr_in_control_expr3198);
                    match_expr248=match_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, match_expr248.getTree());

                    }
                    break;
                case 4 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:511:4: for_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_for_expr_in_control_expr3203);
                    for_expr249=for_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, for_expr249.getTree());

                    }
                    break;
                case 5 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:512:5: try_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_try_expr_in_control_expr3209);
                    try_expr250=try_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, try_expr250.getTree());

                    }
                    break;
                case 6 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:513:4: begin_end
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_begin_end_in_control_expr3214);
                    begin_end251=begin_end();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, begin_end251.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:515:1: with_control_expr : ( control_expr | L_with ( NL )? protected_expr ( NL )? L_do block L_end -> ^( WITH protected_expr ^( BEGIN block ) ) );
    public final babel17Parser.with_control_expr_return with_control_expr() throws RecognitionException {
        babel17Parser.with_control_expr_return retval = new babel17Parser.with_control_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_with253=null;
        Token NL254=null;
        Token NL256=null;
        Token L_do257=null;
        Token L_end259=null;
        babel17Parser.control_expr_return control_expr252 = null;

        babel17Parser.protected_expr_return protected_expr255 = null;

        babel17Parser.block_return block258 = null;


        CommonTree L_with253_tree=null;
        CommonTree NL254_tree=null;
        CommonTree NL256_tree=null;
        CommonTree L_do257_tree=null;
        CommonTree L_end259_tree=null;
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_do=new RewriteRuleTokenStream(adaptor,"token L_do");
        RewriteRuleTokenStream stream_L_with=new RewriteRuleTokenStream(adaptor,"token L_with");
        RewriteRuleSubtreeStream stream_protected_expr=new RewriteRuleSubtreeStream(adaptor,"rule protected_expr");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:516:2: ( control_expr | L_with ( NL )? protected_expr ( NL )? L_do block L_end -> ^( WITH protected_expr ^( BEGIN block ) ) )
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==L_begin||LA114_0==L_if||(LA114_0>=L_while && LA114_0<=L_for)||LA114_0==L_match||LA114_0==L_try) ) {
                alt114=1;
            }
            else if ( (LA114_0==L_with) ) {
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:516:4: control_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_control_expr_in_with_control_expr3224);
                    control_expr252=control_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, control_expr252.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:517:4: L_with ( NL )? protected_expr ( NL )? L_do block L_end
                    {
                    L_with253=(Token)match(input,L_with,FOLLOW_L_with_in_with_control_expr3229); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_with.add(L_with253);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:517:11: ( NL )?
                    int alt112=2;
                    int LA112_0 = input.LA(1);

                    if ( (LA112_0==NL) ) {
                        alt112=1;
                    }
                    switch (alt112) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:517:11: NL
                            {
                            NL254=(Token)match(input,NL,FOLLOW_NL_in_with_control_expr3231); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL254);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_protected_expr_in_with_control_expr3234);
                    protected_expr255=protected_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr255.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:517:30: ( NL )?
                    int alt113=2;
                    int LA113_0 = input.LA(1);

                    if ( (LA113_0==NL) ) {
                        alt113=1;
                    }
                    switch (alt113) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:517:30: NL
                            {
                            NL256=(Token)match(input,NL,FOLLOW_NL_in_with_control_expr3236); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL256);


                            }
                            break;

                    }

                    L_do257=(Token)match(input,L_do,FOLLOW_L_do_in_with_control_expr3239); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_do.add(L_do257);

                    pushFollow(FOLLOW_block_in_with_control_expr3241);
                    block258=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block258.getTree());
                    L_end259=(Token)match(input,L_end,FOLLOW_L_end_in_with_control_expr3243); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_end.add(L_end259);



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
                    // 517:51: -> ^( WITH protected_expr ^( BEGIN block ) )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:517:54: ^( WITH protected_expr ^( BEGIN block ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(WITH, "WITH"), root_1);

                        adaptor.addChild(root_1, stream_protected_expr.nextTree());
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:517:76: ^( BEGIN block )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:520:1: protected_expr : ( p_lop_expr | obj_expr );
    public final babel17Parser.protected_expr_return protected_expr() throws RecognitionException {
        babel17Parser.protected_expr_return retval = new babel17Parser.protected_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.p_lop_expr_return p_lop_expr260 = null;

        babel17Parser.obj_expr_return obj_expr261 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:521:2: ( p_lop_expr | obj_expr )
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==L_begin||(LA115_0>=L_with && LA115_0<=L_if)||(LA115_0>=L_while && LA115_0<=L_for)||LA115_0==L_match||LA115_0==L_exception||LA115_0==L_try||(LA115_0>=A_infinity && LA115_0<=L_lazy)||(LA115_0>=L_true && LA115_0<=L_nil)||LA115_0==L_typeof||LA115_0==MINUS||LA115_0==A_NOT||LA115_0==U_NOT||(LA115_0>=A_ELLIPSIS && LA115_0<=U_ELLIPSIS)||LA115_0==L_force||(LA115_0>=Constr && LA115_0<=Num)||(LA115_0>=String && LA115_0<=ROUND_BRACKET_OPEN)||LA115_0==SQUARE_BRACKET_OPEN||LA115_0==CURLY_BRACKET_OPEN||LA115_0==UNDERSCORE) ) {
                alt115=1;
            }
            else if ( (LA115_0==L_obj) ) {
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:521:4: p_lop_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_p_lop_expr_in_protected_expr3268);
                    p_lop_expr260=p_lop_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_lop_expr260.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:522:4: obj_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_obj_expr_in_protected_expr3273);
                    obj_expr261=obj_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, obj_expr261.getTree());

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

    public static class protected_expr_nc_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "protected_expr_nc"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:524:1: protected_expr_nc : protected_expr ;
    public final babel17Parser.protected_expr_nc_return protected_expr_nc() throws RecognitionException {
        babel17Parser.protected_expr_nc_return retval = new babel17Parser.protected_expr_nc_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.protected_expr_return protected_expr262 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:525:2: ( protected_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:525:4: protected_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_protected_expr_in_protected_expr_nc3284);
            protected_expr262=protected_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, protected_expr262.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "protected_expr_nc"

    public static class begin_end_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "begin_end"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:527:1: begin_end : L_begin block L_end -> ^( BEGIN block ) ;
    public final babel17Parser.begin_end_return begin_end() throws RecognitionException {
        babel17Parser.begin_end_return retval = new babel17Parser.begin_end_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_begin263=null;
        Token L_end265=null;
        babel17Parser.block_return block264 = null;


        CommonTree L_begin263_tree=null;
        CommonTree L_end265_tree=null;
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleTokenStream stream_L_begin=new RewriteRuleTokenStream(adaptor,"token L_begin");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:528:2: ( L_begin block L_end -> ^( BEGIN block ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:528:4: L_begin block L_end
            {
            L_begin263=(Token)match(input,L_begin,FOLLOW_L_begin_in_begin_end3294); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_begin.add(L_begin263);

            pushFollow(FOLLOW_block_in_begin_end3296);
            block264=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block264.getTree());
            L_end265=(Token)match(input,L_end,FOLLOW_L_end_in_begin_end3298); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_end.add(L_end265);



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
            // 528:24: -> ^( BEGIN block )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:528:27: ^( BEGIN block )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:531:1: parents : ( '+' primitive_expr -> ^( PARENTS_PLUS primitive_expr ) | '*' primitive_expr -> ^( PARENTS_MUL primitive_expr ) );
    public final babel17Parser.parents_return parents() throws RecognitionException {
        babel17Parser.parents_return retval = new babel17Parser.parents_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal266=null;
        Token char_literal268=null;
        babel17Parser.primitive_expr_return primitive_expr267 = null;

        babel17Parser.primitive_expr_return primitive_expr269 = null;


        CommonTree char_literal266_tree=null;
        CommonTree char_literal268_tree=null;
        RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
        RewriteRuleTokenStream stream_TIMES=new RewriteRuleTokenStream(adaptor,"token TIMES");
        RewriteRuleSubtreeStream stream_primitive_expr=new RewriteRuleSubtreeStream(adaptor,"rule primitive_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:531:9: ( '+' primitive_expr -> ^( PARENTS_PLUS primitive_expr ) | '*' primitive_expr -> ^( PARENTS_MUL primitive_expr ) )
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==PLUS) ) {
                alt116=1;
            }
            else if ( (LA116_0==TIMES) ) {
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:531:11: '+' primitive_expr
                    {
                    char_literal266=(Token)match(input,PLUS,FOLLOW_PLUS_in_parents3316); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PLUS.add(char_literal266);

                    pushFollow(FOLLOW_primitive_expr_in_parents3318);
                    primitive_expr267=primitive_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primitive_expr.add(primitive_expr267.getTree());


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
                    // 531:30: -> ^( PARENTS_PLUS primitive_expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:531:33: ^( PARENTS_PLUS primitive_expr )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:532:4: '*' primitive_expr
                    {
                    char_literal268=(Token)match(input,TIMES,FOLLOW_TIMES_in_parents3331); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TIMES.add(char_literal268);

                    pushFollow(FOLLOW_primitive_expr_in_parents3333);
                    primitive_expr269=primitive_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primitive_expr.add(primitive_expr269.getTree());


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
                    // 532:23: -> ^( PARENTS_MUL primitive_expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:532:26: ^( PARENTS_MUL primitive_expr )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:535:1: obj_expr : ( ( L_obj ( NL )? parents )=> L_obj ( NL )? parents block L_end -> ^( OBJ block parents ) | L_obj block L_end -> ^( OBJ block ) );
    public final babel17Parser.obj_expr_return obj_expr() throws RecognitionException {
        babel17Parser.obj_expr_return retval = new babel17Parser.obj_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_obj270=null;
        Token NL271=null;
        Token L_end274=null;
        Token L_obj275=null;
        Token L_end277=null;
        babel17Parser.parents_return parents272 = null;

        babel17Parser.block_return block273 = null;

        babel17Parser.block_return block276 = null;


        CommonTree L_obj270_tree=null;
        CommonTree NL271_tree=null;
        CommonTree L_end274_tree=null;
        CommonTree L_obj275_tree=null;
        CommonTree L_end277_tree=null;
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_obj=new RewriteRuleTokenStream(adaptor,"token L_obj");
        RewriteRuleSubtreeStream stream_parents=new RewriteRuleSubtreeStream(adaptor,"rule parents");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:535:9: ( ( L_obj ( NL )? parents )=> L_obj ( NL )? parents block L_end -> ^( OBJ block parents ) | L_obj block L_end -> ^( OBJ block ) )
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==L_obj) ) {
                int LA118_1 = input.LA(2);

                if ( (LA118_1==NL) ) {
                    int LA118_2 = input.LA(3);

                    if ( ((LA118_2>=L_begin && LA118_2<=L_if)||(LA118_2>=L_while && LA118_2<=L_for)||(LA118_2>=L_yield && LA118_2<=L_match)||(LA118_2>=L_val && LA118_2<=L_def)||LA118_2==L_exception||LA118_2==L_try||(LA118_2>=A_infinity && LA118_2<=L_nil)||(LA118_2>=L_module && LA118_2<=L_import)||LA118_2==SC||LA118_2==MINUS||LA118_2==A_NOT||LA118_2==U_NOT||(LA118_2>=A_ELLIPSIS && LA118_2<=U_ELLIPSIS)||LA118_2==L_force||(LA118_2>=NL && LA118_2<=Num)||(LA118_2>=String && LA118_2<=ROUND_BRACKET_OPEN)||LA118_2==SQUARE_BRACKET_OPEN||LA118_2==CURLY_BRACKET_OPEN||LA118_2==UNDERSCORE||(LA118_2>=PRAGMA_LOG && LA118_2<=PRAGMA_PROFILE)) ) {
                        alt118=2;
                    }
                    else if ( (LA118_2==PLUS) && (synpred8_babel17())) {
                        alt118=1;
                    }
                    else if ( (LA118_2==TIMES) && (synpred8_babel17())) {
                        alt118=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 118, 2, input);

                        throw nvae;
                    }
                }
                else if ( ((LA118_1>=L_begin && LA118_1<=L_if)||(LA118_1>=L_while && LA118_1<=L_for)||(LA118_1>=L_yield && LA118_1<=L_match)||(LA118_1>=L_val && LA118_1<=L_def)||LA118_1==L_exception||LA118_1==L_try||(LA118_1>=A_infinity && LA118_1<=L_nil)||(LA118_1>=L_module && LA118_1<=L_import)||LA118_1==SC||LA118_1==MINUS||LA118_1==A_NOT||LA118_1==U_NOT||(LA118_1>=A_ELLIPSIS && LA118_1<=U_ELLIPSIS)||LA118_1==L_force||(LA118_1>=Constr && LA118_1<=Num)||(LA118_1>=String && LA118_1<=ROUND_BRACKET_OPEN)||LA118_1==SQUARE_BRACKET_OPEN||LA118_1==CURLY_BRACKET_OPEN||LA118_1==UNDERSCORE||(LA118_1>=PRAGMA_LOG && LA118_1<=PRAGMA_PROFILE)) ) {
                    alt118=2;
                }
                else if ( (LA118_1==PLUS) && (synpred8_babel17())) {
                    alt118=1;
                }
                else if ( (LA118_1==TIMES) && (synpred8_babel17())) {
                    alt118=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 118, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 118, 0, input);

                throw nvae;
            }
            switch (alt118) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:535:11: ( L_obj ( NL )? parents )=> L_obj ( NL )? parents block L_end
                    {
                    L_obj270=(Token)match(input,L_obj,FOLLOW_L_obj_in_obj_expr3361); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_obj.add(L_obj270);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:535:40: ( NL )?
                    int alt117=2;
                    int LA117_0 = input.LA(1);

                    if ( (LA117_0==NL) ) {
                        alt117=1;
                    }
                    switch (alt117) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:535:40: NL
                            {
                            NL271=(Token)match(input,NL,FOLLOW_NL_in_obj_expr3363); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL271);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_parents_in_obj_expr3366);
                    parents272=parents();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parents.add(parents272.getTree());
                    pushFollow(FOLLOW_block_in_obj_expr3368);
                    block273=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block273.getTree());
                    L_end274=(Token)match(input,L_end,FOLLOW_L_end_in_obj_expr3370); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_end.add(L_end274);



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
                    // 535:64: -> ^( OBJ block parents )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:535:67: ^( OBJ block parents )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:536:17: L_obj block L_end
                    {
                    L_obj275=(Token)match(input,L_obj,FOLLOW_L_obj_in_obj_expr3398); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_obj.add(L_obj275);

                    pushFollow(FOLLOW_block_in_obj_expr3400);
                    block276=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block276.getTree());
                    L_end277=(Token)match(input,L_end,FOLLOW_L_end_in_obj_expr3402); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_end.add(L_end277);



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
                    // 536:35: -> ^( OBJ block )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:536:38: ^( OBJ block )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:538:1: lop_expr : ( ( lambda_expr )=> lambda_expr | ( lambda_expr_nobrackets )=> lambda_expr_nobrackets | op_expr );
    public final babel17Parser.lop_expr_return lop_expr() throws RecognitionException {
        babel17Parser.lop_expr_return retval = new babel17Parser.lop_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.lambda_expr_return lambda_expr278 = null;

        babel17Parser.lambda_expr_nobrackets_return lambda_expr_nobrackets279 = null;

        babel17Parser.op_expr_return op_expr280 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:539:2: ( ( lambda_expr )=> lambda_expr | ( lambda_expr_nobrackets )=> lambda_expr_nobrackets | op_expr )
            int alt119=3;
            alt119 = dfa119.predict(input);
            switch (alt119) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:539:4: ( lambda_expr )=> lambda_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_lambda_expr_in_lop_expr3430);
                    lambda_expr278=lambda_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lambda_expr278.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:540:4: ( lambda_expr_nobrackets )=> lambda_expr_nobrackets
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_lambda_expr_nobrackets_in_lop_expr3441);
                    lambda_expr_nobrackets279=lambda_expr_nobrackets();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lambda_expr_nobrackets279.getTree());

                    }
                    break;
                case 3 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:541:4: op_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_op_expr_in_lop_expr3446);
                    op_expr280=op_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, op_expr280.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:543:1: p_lop_expr : ( ( lambda_expr )=> lambda_expr | ( lambda_expr_nobrackets )=> lambda_expr_nobrackets | p_op_expr );
    public final babel17Parser.p_lop_expr_return p_lop_expr() throws RecognitionException {
        babel17Parser.p_lop_expr_return retval = new babel17Parser.p_lop_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.lambda_expr_return lambda_expr281 = null;

        babel17Parser.lambda_expr_nobrackets_return lambda_expr_nobrackets282 = null;

        babel17Parser.p_op_expr_return p_op_expr283 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:544:2: ( ( lambda_expr )=> lambda_expr | ( lambda_expr_nobrackets )=> lambda_expr_nobrackets | p_op_expr )
            int alt120=3;
            alt120 = dfa120.predict(input);
            switch (alt120) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:544:4: ( lambda_expr )=> lambda_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_lambda_expr_in_p_lop_expr3462);
                    lambda_expr281=lambda_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lambda_expr281.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:545:4: ( lambda_expr_nobrackets )=> lambda_expr_nobrackets
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_lambda_expr_nobrackets_in_p_lop_expr3473);
                    lambda_expr_nobrackets282=lambda_expr_nobrackets();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lambda_expr_nobrackets282.getTree());

                    }
                    break;
                case 3 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:546:4: p_op_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_p_op_expr_in_p_lop_expr3478);
                    p_op_expr283=p_op_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_op_expr283.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:548:1: if_expr : L_if ( NL )? protected_expr ( NL )? L_then block ( L_elseif ( NL )? protected_expr ( NL )? L_then block )* ( L_else block )? L_end -> ^( IF ( protected_expr )* ( block )* ) ;
    public final babel17Parser.if_expr_return if_expr() throws RecognitionException {
        babel17Parser.if_expr_return retval = new babel17Parser.if_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_if284=null;
        Token NL285=null;
        Token NL287=null;
        Token L_then288=null;
        Token L_elseif290=null;
        Token NL291=null;
        Token NL293=null;
        Token L_then294=null;
        Token L_else296=null;
        Token L_end298=null;
        babel17Parser.protected_expr_return protected_expr286 = null;

        babel17Parser.block_return block289 = null;

        babel17Parser.protected_expr_return protected_expr292 = null;

        babel17Parser.block_return block295 = null;

        babel17Parser.block_return block297 = null;


        CommonTree L_if284_tree=null;
        CommonTree NL285_tree=null;
        CommonTree NL287_tree=null;
        CommonTree L_then288_tree=null;
        CommonTree L_elseif290_tree=null;
        CommonTree NL291_tree=null;
        CommonTree NL293_tree=null;
        CommonTree L_then294_tree=null;
        CommonTree L_else296_tree=null;
        CommonTree L_end298_tree=null;
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleTokenStream stream_L_else=new RewriteRuleTokenStream(adaptor,"token L_else");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_elseif=new RewriteRuleTokenStream(adaptor,"token L_elseif");
        RewriteRuleTokenStream stream_L_then=new RewriteRuleTokenStream(adaptor,"token L_then");
        RewriteRuleTokenStream stream_L_if=new RewriteRuleTokenStream(adaptor,"token L_if");
        RewriteRuleSubtreeStream stream_protected_expr=new RewriteRuleSubtreeStream(adaptor,"rule protected_expr");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:548:9: ( L_if ( NL )? protected_expr ( NL )? L_then block ( L_elseif ( NL )? protected_expr ( NL )? L_then block )* ( L_else block )? L_end -> ^( IF ( protected_expr )* ( block )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:548:11: L_if ( NL )? protected_expr ( NL )? L_then block ( L_elseif ( NL )? protected_expr ( NL )? L_then block )* ( L_else block )? L_end
            {
            L_if284=(Token)match(input,L_if,FOLLOW_L_if_in_if_expr3488); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_if.add(L_if284);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:548:16: ( NL )?
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==NL) ) {
                alt121=1;
            }
            switch (alt121) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:548:16: NL
                    {
                    NL285=(Token)match(input,NL,FOLLOW_NL_in_if_expr3490); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL285);


                    }
                    break;

            }

            pushFollow(FOLLOW_protected_expr_in_if_expr3493);
            protected_expr286=protected_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr286.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:548:35: ( NL )?
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==NL) ) {
                alt122=1;
            }
            switch (alt122) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:548:35: NL
                    {
                    NL287=(Token)match(input,NL,FOLLOW_NL_in_if_expr3495); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL287);


                    }
                    break;

            }

            L_then288=(Token)match(input,L_then,FOLLOW_L_then_in_if_expr3498); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_then.add(L_then288);

            pushFollow(FOLLOW_block_in_if_expr3500);
            block289=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block289.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:549:3: ( L_elseif ( NL )? protected_expr ( NL )? L_then block )*
            loop125:
            do {
                int alt125=2;
                int LA125_0 = input.LA(1);

                if ( (LA125_0==L_elseif) ) {
                    alt125=1;
                }


                switch (alt125) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:549:4: L_elseif ( NL )? protected_expr ( NL )? L_then block
            	    {
            	    L_elseif290=(Token)match(input,L_elseif,FOLLOW_L_elseif_in_if_expr3506); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_L_elseif.add(L_elseif290);

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:549:13: ( NL )?
            	    int alt123=2;
            	    int LA123_0 = input.LA(1);

            	    if ( (LA123_0==NL) ) {
            	        alt123=1;
            	    }
            	    switch (alt123) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:549:13: NL
            	            {
            	            NL291=(Token)match(input,NL,FOLLOW_NL_in_if_expr3508); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL291);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_protected_expr_in_if_expr3511);
            	    protected_expr292=protected_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr292.getTree());
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:549:32: ( NL )?
            	    int alt124=2;
            	    int LA124_0 = input.LA(1);

            	    if ( (LA124_0==NL) ) {
            	        alt124=1;
            	    }
            	    switch (alt124) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:549:32: NL
            	            {
            	            NL293=(Token)match(input,NL,FOLLOW_NL_in_if_expr3513); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL293);


            	            }
            	            break;

            	    }

            	    L_then294=(Token)match(input,L_then,FOLLOW_L_then_in_if_expr3516); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_L_then.add(L_then294);

            	    pushFollow(FOLLOW_block_in_if_expr3518);
            	    block295=block();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_block.add(block295.getTree());

            	    }
            	    break;

            	default :
            	    break loop125;
                }
            } while (true);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:550:3: ( L_else block )?
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==L_else) ) {
                alt126=1;
            }
            switch (alt126) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:550:4: L_else block
                    {
                    L_else296=(Token)match(input,L_else,FOLLOW_L_else_in_if_expr3526); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_else.add(L_else296);

                    pushFollow(FOLLOW_block_in_if_expr3528);
                    block297=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block297.getTree());

                    }
                    break;

            }

            L_end298=(Token)match(input,L_end,FOLLOW_L_end_in_if_expr3532); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_end.add(L_end298);



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
            // 550:26: -> ^( IF ( protected_expr )* ( block )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:550:29: ^( IF ( protected_expr )* ( block )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IF, "IF"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:550:34: ( protected_expr )*
                while ( stream_protected_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_protected_expr.nextTree());

                }
                stream_protected_expr.reset();
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:550:50: ( block )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:552:1: while_do_expr : L_while ( NL )? protected_expr ( NL )? L_do block L_end -> ^( WHILE_DO protected_expr block ) ;
    public final babel17Parser.while_do_expr_return while_do_expr() throws RecognitionException {
        babel17Parser.while_do_expr_return retval = new babel17Parser.while_do_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_while299=null;
        Token NL300=null;
        Token NL302=null;
        Token L_do303=null;
        Token L_end305=null;
        babel17Parser.protected_expr_return protected_expr301 = null;

        babel17Parser.block_return block304 = null;


        CommonTree L_while299_tree=null;
        CommonTree NL300_tree=null;
        CommonTree NL302_tree=null;
        CommonTree L_do303_tree=null;
        CommonTree L_end305_tree=null;
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_do=new RewriteRuleTokenStream(adaptor,"token L_do");
        RewriteRuleTokenStream stream_L_while=new RewriteRuleTokenStream(adaptor,"token L_while");
        RewriteRuleSubtreeStream stream_protected_expr=new RewriteRuleSubtreeStream(adaptor,"rule protected_expr");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:553:2: ( L_while ( NL )? protected_expr ( NL )? L_do block L_end -> ^( WHILE_DO protected_expr block ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:553:4: L_while ( NL )? protected_expr ( NL )? L_do block L_end
            {
            L_while299=(Token)match(input,L_while,FOLLOW_L_while_in_while_do_expr3556); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_while.add(L_while299);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:553:12: ( NL )?
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==NL) ) {
                alt127=1;
            }
            switch (alt127) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:553:12: NL
                    {
                    NL300=(Token)match(input,NL,FOLLOW_NL_in_while_do_expr3558); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL300);


                    }
                    break;

            }

            pushFollow(FOLLOW_protected_expr_in_while_do_expr3561);
            protected_expr301=protected_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr301.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:553:31: ( NL )?
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==NL) ) {
                alt128=1;
            }
            switch (alt128) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:553:31: NL
                    {
                    NL302=(Token)match(input,NL,FOLLOW_NL_in_while_do_expr3563); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL302);


                    }
                    break;

            }

            L_do303=(Token)match(input,L_do,FOLLOW_L_do_in_while_do_expr3566); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_do.add(L_do303);

            pushFollow(FOLLOW_block_in_while_do_expr3568);
            block304=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block304.getTree());
            L_end305=(Token)match(input,L_end,FOLLOW_L_end_in_while_do_expr3570); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_end.add(L_end305);



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
            // 554:5: -> ^( WHILE_DO protected_expr block )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:554:8: ^( WHILE_DO protected_expr block )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:556:1: cases : ( full_cases | pattern ( NL )? token_DOUBLE_ARROW block -> ^( CASES ^( NIL_TOKEN pattern block ) ) );
    public final babel17Parser.cases_return cases() throws RecognitionException {
        babel17Parser.cases_return retval = new babel17Parser.cases_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL308=null;
        babel17Parser.full_cases_return full_cases306 = null;

        babel17Parser.pattern_return pattern307 = null;

        babel17Parser.token_DOUBLE_ARROW_return token_DOUBLE_ARROW309 = null;

        babel17Parser.block_return block310 = null;


        CommonTree NL308_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_token_DOUBLE_ARROW=new RewriteRuleSubtreeStream(adaptor,"rule token_DOUBLE_ARROW");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:557:2: ( full_cases | pattern ( NL )? token_DOUBLE_ARROW block -> ^( CASES ^( NIL_TOKEN pattern block ) ) )
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==L_case) ) {
                alt130=1;
            }
            else if ( (LA130_0==L_exception||(LA130_0>=A_infinity && LA130_0<=U_infinity)||(LA130_0>=L_true && LA130_0<=L_false)||LA130_0==L_nil||LA130_0==MINUS||(LA130_0>=A_ELLIPSIS && LA130_0<=U_ELLIPSIS)||(LA130_0>=Constr && LA130_0<=Num)||(LA130_0>=String && LA130_0<=ROUND_BRACKET_OPEN)||LA130_0==SQUARE_BRACKET_OPEN||LA130_0==CURLY_BRACKET_OPEN||LA130_0==UNDERSCORE) ) {
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:557:4: full_cases
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_full_cases_in_cases3600);
                    full_cases306=full_cases();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, full_cases306.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:558:4: pattern ( NL )? token_DOUBLE_ARROW block
                    {
                    pushFollow(FOLLOW_pattern_in_cases3605);
                    pattern307=pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pattern.add(pattern307.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:558:12: ( NL )?
                    int alt129=2;
                    int LA129_0 = input.LA(1);

                    if ( (LA129_0==NL) ) {
                        alt129=1;
                    }
                    switch (alt129) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:558:12: NL
                            {
                            NL308=(Token)match(input,NL,FOLLOW_NL_in_cases3607); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL308);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_token_DOUBLE_ARROW_in_cases3610);
                    token_DOUBLE_ARROW309=token_DOUBLE_ARROW();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_token_DOUBLE_ARROW.add(token_DOUBLE_ARROW309.getTree());
                    pushFollow(FOLLOW_block_in_cases3612);
                    block310=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block310.getTree());


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
                    // 558:41: -> ^( CASES ^( NIL_TOKEN pattern block ) )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:558:44: ^( CASES ^( NIL_TOKEN pattern block ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CASES, "CASES"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:558:52: ^( NIL_TOKEN pattern block )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:560:1: full_cases : ( case_expr )+ -> ^( CASES ( case_expr )+ ) ;
    public final babel17Parser.full_cases_return full_cases() throws RecognitionException {
        babel17Parser.full_cases_return retval = new babel17Parser.full_cases_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.case_expr_return case_expr311 = null;


        RewriteRuleSubtreeStream stream_case_expr=new RewriteRuleSubtreeStream(adaptor,"rule case_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:561:2: ( ( case_expr )+ -> ^( CASES ( case_expr )+ ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:561:4: ( case_expr )+
            {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:561:4: ( case_expr )+
            int cnt131=0;
            loop131:
            do {
                int alt131=2;
                int LA131_0 = input.LA(1);

                if ( (LA131_0==L_case) ) {
                    alt131=1;
                }


                switch (alt131) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:561:4: case_expr
            	    {
            	    pushFollow(FOLLOW_case_expr_in_full_cases3635);
            	    case_expr311=case_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_case_expr.add(case_expr311.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt131 >= 1 ) break loop131;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(131, input);
                        throw eee;
                }
                cnt131++;
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
            // 561:15: -> ^( CASES ( case_expr )+ )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:561:18: ^( CASES ( case_expr )+ )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:563:1: case_expr : ( L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW block ) -> ^( NIL_TOKEN pattern block ) ;
    public final babel17Parser.case_expr_return case_expr() throws RecognitionException {
        babel17Parser.case_expr_return retval = new babel17Parser.case_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_case312=null;
        Token NL313=null;
        Token NL315=null;
        babel17Parser.pattern_return pattern314 = null;

        babel17Parser.token_DOUBLE_ARROW_return token_DOUBLE_ARROW316 = null;

        babel17Parser.block_return block317 = null;


        CommonTree L_case312_tree=null;
        CommonTree NL313_tree=null;
        CommonTree NL315_tree=null;
        RewriteRuleTokenStream stream_L_case=new RewriteRuleTokenStream(adaptor,"token L_case");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_token_DOUBLE_ARROW=new RewriteRuleSubtreeStream(adaptor,"rule token_DOUBLE_ARROW");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:564:2: ( ( L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW block ) -> ^( NIL_TOKEN pattern block ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:564:4: ( L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW block )
            {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:564:4: ( L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW block )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:564:5: L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW block
            {
            L_case312=(Token)match(input,L_case,FOLLOW_L_case_in_case_expr3656); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_case.add(L_case312);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:564:12: ( NL )?
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==NL) ) {
                alt132=1;
            }
            switch (alt132) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:564:12: NL
                    {
                    NL313=(Token)match(input,NL,FOLLOW_NL_in_case_expr3658); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL313);


                    }
                    break;

            }

            pushFollow(FOLLOW_pattern_in_case_expr3661);
            pattern314=pattern();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pattern.add(pattern314.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:564:24: ( NL )?
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( (LA133_0==NL) ) {
                alt133=1;
            }
            switch (alt133) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:564:24: NL
                    {
                    NL315=(Token)match(input,NL,FOLLOW_NL_in_case_expr3663); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL315);


                    }
                    break;

            }

            pushFollow(FOLLOW_token_DOUBLE_ARROW_in_case_expr3666);
            token_DOUBLE_ARROW316=token_DOUBLE_ARROW();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_token_DOUBLE_ARROW.add(token_DOUBLE_ARROW316.getTree());
            pushFollow(FOLLOW_block_in_case_expr3668);
            block317=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block317.getTree());

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
            // 564:54: -> ^( NIL_TOKEN pattern block )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:564:57: ^( NIL_TOKEN pattern block )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:566:1: match_expr : L_match ( NL )? p_op_expr ( NL )? full_cases L_end -> ^( MATCH p_op_expr full_cases ) ;
    public final babel17Parser.match_expr_return match_expr() throws RecognitionException {
        babel17Parser.match_expr_return retval = new babel17Parser.match_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_match318=null;
        Token NL319=null;
        Token NL321=null;
        Token L_end323=null;
        babel17Parser.p_op_expr_return p_op_expr320 = null;

        babel17Parser.full_cases_return full_cases322 = null;


        CommonTree L_match318_tree=null;
        CommonTree NL319_tree=null;
        CommonTree NL321_tree=null;
        CommonTree L_end323_tree=null;
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_match=new RewriteRuleTokenStream(adaptor,"token L_match");
        RewriteRuleSubtreeStream stream_full_cases=new RewriteRuleSubtreeStream(adaptor,"rule full_cases");
        RewriteRuleSubtreeStream stream_p_op_expr=new RewriteRuleSubtreeStream(adaptor,"rule p_op_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:567:2: ( L_match ( NL )? p_op_expr ( NL )? full_cases L_end -> ^( MATCH p_op_expr full_cases ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:567:4: L_match ( NL )? p_op_expr ( NL )? full_cases L_end
            {
            L_match318=(Token)match(input,L_match,FOLLOW_L_match_in_match_expr3689); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_match.add(L_match318);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:567:12: ( NL )?
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==NL) ) {
                alt134=1;
            }
            switch (alt134) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:567:12: NL
                    {
                    NL319=(Token)match(input,NL,FOLLOW_NL_in_match_expr3691); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL319);


                    }
                    break;

            }

            pushFollow(FOLLOW_p_op_expr_in_match_expr3694);
            p_op_expr320=p_op_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_p_op_expr.add(p_op_expr320.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:567:26: ( NL )?
            int alt135=2;
            int LA135_0 = input.LA(1);

            if ( (LA135_0==NL) ) {
                alt135=1;
            }
            switch (alt135) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:567:26: NL
                    {
                    NL321=(Token)match(input,NL,FOLLOW_NL_in_match_expr3696); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL321);


                    }
                    break;

            }

            pushFollow(FOLLOW_full_cases_in_match_expr3699);
            full_cases322=full_cases();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_full_cases.add(full_cases322.getTree());
            L_end323=(Token)match(input,L_end,FOLLOW_L_end_in_match_expr3701); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_end.add(L_end323);



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
            // 568:5: -> ^( MATCH p_op_expr full_cases )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:568:8: ^( MATCH p_op_expr full_cases )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:570:1: try_expr : L_try ( NL )? pure_block ( NL )? L_catch ( NL )? full_cases L_end -> ^( TRY pure_block full_cases ) ;
    public final babel17Parser.try_expr_return try_expr() throws RecognitionException {
        babel17Parser.try_expr_return retval = new babel17Parser.try_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_try324=null;
        Token NL325=null;
        Token NL327=null;
        Token L_catch328=null;
        Token NL329=null;
        Token L_end331=null;
        babel17Parser.pure_block_return pure_block326 = null;

        babel17Parser.full_cases_return full_cases330 = null;


        CommonTree L_try324_tree=null;
        CommonTree NL325_tree=null;
        CommonTree NL327_tree=null;
        CommonTree L_catch328_tree=null;
        CommonTree NL329_tree=null;
        CommonTree L_end331_tree=null;
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleTokenStream stream_L_try=new RewriteRuleTokenStream(adaptor,"token L_try");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_catch=new RewriteRuleTokenStream(adaptor,"token L_catch");
        RewriteRuleSubtreeStream stream_full_cases=new RewriteRuleSubtreeStream(adaptor,"rule full_cases");
        RewriteRuleSubtreeStream stream_pure_block=new RewriteRuleSubtreeStream(adaptor,"rule pure_block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:570:9: ( L_try ( NL )? pure_block ( NL )? L_catch ( NL )? full_cases L_end -> ^( TRY pure_block full_cases ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:570:11: L_try ( NL )? pure_block ( NL )? L_catch ( NL )? full_cases L_end
            {
            L_try324=(Token)match(input,L_try,FOLLOW_L_try_in_try_expr3727); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_try.add(L_try324);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:570:17: ( NL )?
            int alt136=2;
            int LA136_0 = input.LA(1);

            if ( (LA136_0==NL) ) {
                alt136=1;
            }
            switch (alt136) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:570:17: NL
                    {
                    NL325=(Token)match(input,NL,FOLLOW_NL_in_try_expr3729); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL325);


                    }
                    break;

            }

            pushFollow(FOLLOW_pure_block_in_try_expr3732);
            pure_block326=pure_block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pure_block.add(pure_block326.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:570:32: ( NL )?
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( (LA137_0==NL) ) {
                alt137=1;
            }
            switch (alt137) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:570:32: NL
                    {
                    NL327=(Token)match(input,NL,FOLLOW_NL_in_try_expr3734); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL327);


                    }
                    break;

            }

            L_catch328=(Token)match(input,L_catch,FOLLOW_L_catch_in_try_expr3737); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_catch.add(L_catch328);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:570:44: ( NL )?
            int alt138=2;
            int LA138_0 = input.LA(1);

            if ( (LA138_0==NL) ) {
                alt138=1;
            }
            switch (alt138) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:570:44: NL
                    {
                    NL329=(Token)match(input,NL,FOLLOW_NL_in_try_expr3739); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL329);


                    }
                    break;

            }

            pushFollow(FOLLOW_full_cases_in_try_expr3742);
            full_cases330=full_cases();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_full_cases.add(full_cases330.getTree());
            L_end331=(Token)match(input,L_end,FOLLOW_L_end_in_try_expr3744); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_end.add(L_end331);



            // AST REWRITE
            // elements: full_cases, pure_block
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 571:5: -> ^( TRY pure_block full_cases )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:571:8: ^( TRY pure_block full_cases )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:573:1: lambda_expr : '(' ( NL )? lambda_cases ( NL )? ')' -> ^( LAMBDA lambda_cases ) ;
    public final babel17Parser.lambda_expr_return lambda_expr() throws RecognitionException {
        babel17Parser.lambda_expr_return retval = new babel17Parser.lambda_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal332=null;
        Token NL333=null;
        Token NL335=null;
        Token char_literal336=null;
        babel17Parser.lambda_cases_return lambda_cases334 = null;


        CommonTree char_literal332_tree=null;
        CommonTree NL333_tree=null;
        CommonTree NL335_tree=null;
        CommonTree char_literal336_tree=null;
        RewriteRuleTokenStream stream_ROUND_BRACKET_OPEN=new RewriteRuleTokenStream(adaptor,"token ROUND_BRACKET_OPEN");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_ROUND_BRACKET_CLOSE=new RewriteRuleTokenStream(adaptor,"token ROUND_BRACKET_CLOSE");
        RewriteRuleSubtreeStream stream_lambda_cases=new RewriteRuleSubtreeStream(adaptor,"rule lambda_cases");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:574:2: ( '(' ( NL )? lambda_cases ( NL )? ')' -> ^( LAMBDA lambda_cases ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:574:4: '(' ( NL )? lambda_cases ( NL )? ')'
            {
            char_literal332=(Token)match(input,ROUND_BRACKET_OPEN,FOLLOW_ROUND_BRACKET_OPEN_in_lambda_expr3768); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ROUND_BRACKET_OPEN.add(char_literal332);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:574:8: ( NL )?
            int alt139=2;
            int LA139_0 = input.LA(1);

            if ( (LA139_0==NL) ) {
                alt139=1;
            }
            switch (alt139) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:574:8: NL
                    {
                    NL333=(Token)match(input,NL,FOLLOW_NL_in_lambda_expr3770); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL333);


                    }
                    break;

            }

            pushFollow(FOLLOW_lambda_cases_in_lambda_expr3773);
            lambda_cases334=lambda_cases();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_lambda_cases.add(lambda_cases334.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:574:25: ( NL )?
            int alt140=2;
            int LA140_0 = input.LA(1);

            if ( (LA140_0==NL) ) {
                alt140=1;
            }
            switch (alt140) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:574:25: NL
                    {
                    NL335=(Token)match(input,NL,FOLLOW_NL_in_lambda_expr3775); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL335);


                    }
                    break;

            }

            char_literal336=(Token)match(input,ROUND_BRACKET_CLOSE,FOLLOW_ROUND_BRACKET_CLOSE_in_lambda_expr3778); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ROUND_BRACKET_CLOSE.add(char_literal336);



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
            // 574:33: -> ^( LAMBDA lambda_cases )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:574:36: ^( LAMBDA lambda_cases )
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

    public static class lambda_expr_nobrackets_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "lambda_expr_nobrackets"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:576:1: lambda_expr_nobrackets : lambda_cases_nobrackets -> ^( LAMBDA lambda_cases_nobrackets ) ;
    public final babel17Parser.lambda_expr_nobrackets_return lambda_expr_nobrackets() throws RecognitionException {
        babel17Parser.lambda_expr_nobrackets_return retval = new babel17Parser.lambda_expr_nobrackets_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.lambda_cases_nobrackets_return lambda_cases_nobrackets337 = null;


        RewriteRuleSubtreeStream stream_lambda_cases_nobrackets=new RewriteRuleSubtreeStream(adaptor,"rule lambda_cases_nobrackets");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:577:2: ( lambda_cases_nobrackets -> ^( LAMBDA lambda_cases_nobrackets ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:577:4: lambda_cases_nobrackets
            {
            pushFollow(FOLLOW_lambda_cases_nobrackets_in_lambda_expr_nobrackets3797);
            lambda_cases_nobrackets337=lambda_cases_nobrackets();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_lambda_cases_nobrackets.add(lambda_cases_nobrackets337.getTree());


            // AST REWRITE
            // elements: lambda_cases_nobrackets
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 577:28: -> ^( LAMBDA lambda_cases_nobrackets )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:577:31: ^( LAMBDA lambda_cases_nobrackets )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LAMBDA, "LAMBDA"), root_1);

                adaptor.addChild(root_1, stream_lambda_cases_nobrackets.nextTree());

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
    // $ANTLR end "lambda_expr_nobrackets"

    public static class lambda_cases_nobrackets_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "lambda_cases_nobrackets"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:579:1: lambda_cases_nobrackets : pattern ( NL )? token_DOUBLE_ARROW ( NL )? lop_expr -> ^( CASES ^( NIL_TOKEN pattern ^( BLOCK lop_expr ) ) ) ;
    public final babel17Parser.lambda_cases_nobrackets_return lambda_cases_nobrackets() throws RecognitionException {
        babel17Parser.lambda_cases_nobrackets_return retval = new babel17Parser.lambda_cases_nobrackets_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL339=null;
        Token NL341=null;
        babel17Parser.pattern_return pattern338 = null;

        babel17Parser.token_DOUBLE_ARROW_return token_DOUBLE_ARROW340 = null;

        babel17Parser.lop_expr_return lop_expr342 = null;


        CommonTree NL339_tree=null;
        CommonTree NL341_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_token_DOUBLE_ARROW=new RewriteRuleSubtreeStream(adaptor,"rule token_DOUBLE_ARROW");
        RewriteRuleSubtreeStream stream_lop_expr=new RewriteRuleSubtreeStream(adaptor,"rule lop_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:580:2: ( pattern ( NL )? token_DOUBLE_ARROW ( NL )? lop_expr -> ^( CASES ^( NIL_TOKEN pattern ^( BLOCK lop_expr ) ) ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:580:4: pattern ( NL )? token_DOUBLE_ARROW ( NL )? lop_expr
            {
            pushFollow(FOLLOW_pattern_in_lambda_cases_nobrackets3815);
            pattern338=pattern();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pattern.add(pattern338.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:580:12: ( NL )?
            int alt141=2;
            int LA141_0 = input.LA(1);

            if ( (LA141_0==NL) ) {
                alt141=1;
            }
            switch (alt141) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:580:12: NL
                    {
                    NL339=(Token)match(input,NL,FOLLOW_NL_in_lambda_cases_nobrackets3817); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL339);


                    }
                    break;

            }

            pushFollow(FOLLOW_token_DOUBLE_ARROW_in_lambda_cases_nobrackets3820);
            token_DOUBLE_ARROW340=token_DOUBLE_ARROW();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_token_DOUBLE_ARROW.add(token_DOUBLE_ARROW340.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:580:35: ( NL )?
            int alt142=2;
            int LA142_0 = input.LA(1);

            if ( (LA142_0==NL) ) {
                alt142=1;
            }
            switch (alt142) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:580:35: NL
                    {
                    NL341=(Token)match(input,NL,FOLLOW_NL_in_lambda_cases_nobrackets3822); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL341);


                    }
                    break;

            }

            pushFollow(FOLLOW_lop_expr_in_lambda_cases_nobrackets3825);
            lop_expr342=lop_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_lop_expr.add(lop_expr342.getTree());


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
            // 580:48: -> ^( CASES ^( NIL_TOKEN pattern ^( BLOCK lop_expr ) ) )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:580:51: ^( CASES ^( NIL_TOKEN pattern ^( BLOCK lop_expr ) ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CASES, "CASES"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:580:59: ^( NIL_TOKEN pattern ^( BLOCK lop_expr ) )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_2);

                adaptor.addChild(root_2, stream_pattern.nextTree());
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:580:79: ^( BLOCK lop_expr )
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
    // $ANTLR end "lambda_cases_nobrackets"

    public static class lambda_case_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "lambda_case_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:582:1: lambda_case_expr : ( L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block ) -> ^( NIL_TOKEN pattern pure_block ) ;
    public final babel17Parser.lambda_case_expr_return lambda_case_expr() throws RecognitionException {
        babel17Parser.lambda_case_expr_return retval = new babel17Parser.lambda_case_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_case343=null;
        Token NL344=null;
        Token NL346=null;
        Token NL348=null;
        babel17Parser.pattern_return pattern345 = null;

        babel17Parser.token_DOUBLE_ARROW_return token_DOUBLE_ARROW347 = null;

        babel17Parser.pure_block_return pure_block349 = null;


        CommonTree L_case343_tree=null;
        CommonTree NL344_tree=null;
        CommonTree NL346_tree=null;
        CommonTree NL348_tree=null;
        RewriteRuleTokenStream stream_L_case=new RewriteRuleTokenStream(adaptor,"token L_case");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_token_DOUBLE_ARROW=new RewriteRuleSubtreeStream(adaptor,"rule token_DOUBLE_ARROW");
        RewriteRuleSubtreeStream stream_pure_block=new RewriteRuleSubtreeStream(adaptor,"rule pure_block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:583:2: ( ( L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block ) -> ^( NIL_TOKEN pattern pure_block ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:583:4: ( L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block )
            {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:583:4: ( L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:583:5: L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block
            {
            L_case343=(Token)match(input,L_case,FOLLOW_L_case_in_lambda_case_expr3853); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_case.add(L_case343);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:583:12: ( NL )?
            int alt143=2;
            int LA143_0 = input.LA(1);

            if ( (LA143_0==NL) ) {
                alt143=1;
            }
            switch (alt143) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:583:12: NL
                    {
                    NL344=(Token)match(input,NL,FOLLOW_NL_in_lambda_case_expr3855); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL344);


                    }
                    break;

            }

            pushFollow(FOLLOW_pattern_in_lambda_case_expr3858);
            pattern345=pattern();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pattern.add(pattern345.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:583:24: ( NL )?
            int alt144=2;
            int LA144_0 = input.LA(1);

            if ( (LA144_0==NL) ) {
                alt144=1;
            }
            switch (alt144) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:583:24: NL
                    {
                    NL346=(Token)match(input,NL,FOLLOW_NL_in_lambda_case_expr3860); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL346);


                    }
                    break;

            }

            pushFollow(FOLLOW_token_DOUBLE_ARROW_in_lambda_case_expr3863);
            token_DOUBLE_ARROW347=token_DOUBLE_ARROW();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_token_DOUBLE_ARROW.add(token_DOUBLE_ARROW347.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:583:47: ( NL )?
            int alt145=2;
            int LA145_0 = input.LA(1);

            if ( (LA145_0==NL) ) {
                alt145=1;
            }
            switch (alt145) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:583:47: NL
                    {
                    NL348=(Token)match(input,NL,FOLLOW_NL_in_lambda_case_expr3865); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL348);


                    }
                    break;

            }

            pushFollow(FOLLOW_pure_block_in_lambda_case_expr3868);
            pure_block349=pure_block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pure_block.add(pure_block349.getTree());

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
            // 583:63: -> ^( NIL_TOKEN pattern pure_block )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:583:66: ^( NIL_TOKEN pattern pure_block )
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
    // $ANTLR end "lambda_case_expr"

    public static class lambda_cases_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "lambda_cases"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:585:1: lambda_cases : ( pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block -> ^( CASES ^( NIL_TOKEN pattern pure_block ) ) | lambda_case_expr ( ( NL )? lambda_case_expr )* -> ^( CASES ( lambda_case_expr )+ ) );
    public final babel17Parser.lambda_cases_return lambda_cases() throws RecognitionException {
        babel17Parser.lambda_cases_return retval = new babel17Parser.lambda_cases_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL351=null;
        Token NL353=null;
        Token NL356=null;
        babel17Parser.pattern_return pattern350 = null;

        babel17Parser.token_DOUBLE_ARROW_return token_DOUBLE_ARROW352 = null;

        babel17Parser.pure_block_return pure_block354 = null;

        babel17Parser.lambda_case_expr_return lambda_case_expr355 = null;

        babel17Parser.lambda_case_expr_return lambda_case_expr357 = null;


        CommonTree NL351_tree=null;
        CommonTree NL353_tree=null;
        CommonTree NL356_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_token_DOUBLE_ARROW=new RewriteRuleSubtreeStream(adaptor,"rule token_DOUBLE_ARROW");
        RewriteRuleSubtreeStream stream_lambda_case_expr=new RewriteRuleSubtreeStream(adaptor,"rule lambda_case_expr");
        RewriteRuleSubtreeStream stream_pure_block=new RewriteRuleSubtreeStream(adaptor,"rule pure_block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:586:2: ( pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block -> ^( CASES ^( NIL_TOKEN pattern pure_block ) ) | lambda_case_expr ( ( NL )? lambda_case_expr )* -> ^( CASES ( lambda_case_expr )+ ) )
            int alt150=2;
            int LA150_0 = input.LA(1);

            if ( (LA150_0==L_exception||(LA150_0>=A_infinity && LA150_0<=U_infinity)||(LA150_0>=L_true && LA150_0<=L_false)||LA150_0==L_nil||LA150_0==MINUS||(LA150_0>=A_ELLIPSIS && LA150_0<=U_ELLIPSIS)||(LA150_0>=Constr && LA150_0<=Num)||(LA150_0>=String && LA150_0<=ROUND_BRACKET_OPEN)||LA150_0==SQUARE_BRACKET_OPEN||LA150_0==CURLY_BRACKET_OPEN||LA150_0==UNDERSCORE) ) {
                alt150=1;
            }
            else if ( (LA150_0==L_case) ) {
                alt150=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 150, 0, input);

                throw nvae;
            }
            switch (alt150) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:586:4: pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block
                    {
                    pushFollow(FOLLOW_pattern_in_lambda_cases3889);
                    pattern350=pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pattern.add(pattern350.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:586:12: ( NL )?
                    int alt146=2;
                    int LA146_0 = input.LA(1);

                    if ( (LA146_0==NL) ) {
                        alt146=1;
                    }
                    switch (alt146) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:586:12: NL
                            {
                            NL351=(Token)match(input,NL,FOLLOW_NL_in_lambda_cases3891); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL351);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_token_DOUBLE_ARROW_in_lambda_cases3894);
                    token_DOUBLE_ARROW352=token_DOUBLE_ARROW();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_token_DOUBLE_ARROW.add(token_DOUBLE_ARROW352.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:586:35: ( NL )?
                    int alt147=2;
                    int LA147_0 = input.LA(1);

                    if ( (LA147_0==NL) ) {
                        alt147=1;
                    }
                    switch (alt147) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:586:35: NL
                            {
                            NL353=(Token)match(input,NL,FOLLOW_NL_in_lambda_cases3896); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL353);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_pure_block_in_lambda_cases3899);
                    pure_block354=pure_block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pure_block.add(pure_block354.getTree());


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
                    // 586:50: -> ^( CASES ^( NIL_TOKEN pattern pure_block ) )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:586:53: ^( CASES ^( NIL_TOKEN pattern pure_block ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CASES, "CASES"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:586:61: ^( NIL_TOKEN pattern pure_block )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:587:4: lambda_case_expr ( ( NL )? lambda_case_expr )*
                    {
                    pushFollow(FOLLOW_lambda_case_expr_in_lambda_cases3918);
                    lambda_case_expr355=lambda_case_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_lambda_case_expr.add(lambda_case_expr355.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:587:21: ( ( NL )? lambda_case_expr )*
                    loop149:
                    do {
                        int alt149=2;
                        int LA149_0 = input.LA(1);

                        if ( (LA149_0==NL) ) {
                            int LA149_1 = input.LA(2);

                            if ( (LA149_1==L_case) ) {
                                alt149=1;
                            }


                        }
                        else if ( (LA149_0==L_case) ) {
                            alt149=1;
                        }


                        switch (alt149) {
                    	case 1 :
                    	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:587:22: ( NL )? lambda_case_expr
                    	    {
                    	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:587:22: ( NL )?
                    	    int alt148=2;
                    	    int LA148_0 = input.LA(1);

                    	    if ( (LA148_0==NL) ) {
                    	        alt148=1;
                    	    }
                    	    switch (alt148) {
                    	        case 1 :
                    	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:587:22: NL
                    	            {
                    	            NL356=(Token)match(input,NL,FOLLOW_NL_in_lambda_cases3921); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_NL.add(NL356);


                    	            }
                    	            break;

                    	    }

                    	    pushFollow(FOLLOW_lambda_case_expr_in_lambda_cases3924);
                    	    lambda_case_expr357=lambda_case_expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_lambda_case_expr.add(lambda_case_expr357.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop149;
                        }
                    } while (true);



                    // AST REWRITE
                    // elements: lambda_case_expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 587:45: -> ^( CASES ( lambda_case_expr )+ )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:587:48: ^( CASES ( lambda_case_expr )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CASES, "CASES"), root_1);

                        if ( !(stream_lambda_case_expr.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_lambda_case_expr.hasNext() ) {
                            adaptor.addChild(root_1, stream_lambda_case_expr.nextTree());

                        }
                        stream_lambda_case_expr.reset();

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
    // $ANTLR end "lambda_cases"

    public static class for_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "for_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:589:1: for_expr : L_for ( NL )? pattern ( NL )? L_in ( NL )? protected_expr ( NL )? L_do block L_end -> ^( FOR_EXPR pattern protected_expr block ) ;
    public final babel17Parser.for_expr_return for_expr() throws RecognitionException {
        babel17Parser.for_expr_return retval = new babel17Parser.for_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_for358=null;
        Token NL359=null;
        Token NL361=null;
        Token L_in362=null;
        Token NL363=null;
        Token NL365=null;
        Token L_do366=null;
        Token L_end368=null;
        babel17Parser.pattern_return pattern360 = null;

        babel17Parser.protected_expr_return protected_expr364 = null;

        babel17Parser.block_return block367 = null;


        CommonTree L_for358_tree=null;
        CommonTree NL359_tree=null;
        CommonTree NL361_tree=null;
        CommonTree L_in362_tree=null;
        CommonTree NL363_tree=null;
        CommonTree NL365_tree=null;
        CommonTree L_do366_tree=null;
        CommonTree L_end368_tree=null;
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleTokenStream stream_L_for=new RewriteRuleTokenStream(adaptor,"token L_for");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_in=new RewriteRuleTokenStream(adaptor,"token L_in");
        RewriteRuleTokenStream stream_L_do=new RewriteRuleTokenStream(adaptor,"token L_do");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_protected_expr=new RewriteRuleSubtreeStream(adaptor,"rule protected_expr");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:589:9: ( L_for ( NL )? pattern ( NL )? L_in ( NL )? protected_expr ( NL )? L_do block L_end -> ^( FOR_EXPR pattern protected_expr block ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:589:11: L_for ( NL )? pattern ( NL )? L_in ( NL )? protected_expr ( NL )? L_do block L_end
            {
            L_for358=(Token)match(input,L_for,FOLLOW_L_for_in_for_expr3942); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_for.add(L_for358);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:589:17: ( NL )?
            int alt151=2;
            int LA151_0 = input.LA(1);

            if ( (LA151_0==NL) ) {
                alt151=1;
            }
            switch (alt151) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:589:17: NL
                    {
                    NL359=(Token)match(input,NL,FOLLOW_NL_in_for_expr3944); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL359);


                    }
                    break;

            }

            pushFollow(FOLLOW_pattern_in_for_expr3947);
            pattern360=pattern();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pattern.add(pattern360.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:589:29: ( NL )?
            int alt152=2;
            int LA152_0 = input.LA(1);

            if ( (LA152_0==NL) ) {
                alt152=1;
            }
            switch (alt152) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:589:29: NL
                    {
                    NL361=(Token)match(input,NL,FOLLOW_NL_in_for_expr3949); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL361);


                    }
                    break;

            }

            L_in362=(Token)match(input,L_in,FOLLOW_L_in_in_for_expr3952); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_in.add(L_in362);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:589:38: ( NL )?
            int alt153=2;
            int LA153_0 = input.LA(1);

            if ( (LA153_0==NL) ) {
                alt153=1;
            }
            switch (alt153) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:589:38: NL
                    {
                    NL363=(Token)match(input,NL,FOLLOW_NL_in_for_expr3954); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL363);


                    }
                    break;

            }

            pushFollow(FOLLOW_protected_expr_in_for_expr3957);
            protected_expr364=protected_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr364.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:589:57: ( NL )?
            int alt154=2;
            int LA154_0 = input.LA(1);

            if ( (LA154_0==NL) ) {
                alt154=1;
            }
            switch (alt154) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:589:57: NL
                    {
                    NL365=(Token)match(input,NL,FOLLOW_NL_in_for_expr3959); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL365);


                    }
                    break;

            }

            L_do366=(Token)match(input,L_do,FOLLOW_L_do_in_for_expr3962); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_do.add(L_do366);

            pushFollow(FOLLOW_block_in_for_expr3964);
            block367=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block367.getTree());
            L_end368=(Token)match(input,L_end,FOLLOW_L_end_in_for_expr3966); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_end.add(L_end368);



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
            // 590:5: -> ^( FOR_EXPR pattern protected_expr block )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:590:8: ^( FOR_EXPR pattern protected_expr block )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:592:1: op_expr : ( builtin_primitive op_expr | bool_expr );
    public final babel17Parser.op_expr_return op_expr() throws RecognitionException {
        babel17Parser.op_expr_return retval = new babel17Parser.op_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.builtin_primitive_return builtin_primitive369 = null;

        babel17Parser.op_expr_return op_expr370 = null;

        babel17Parser.bool_expr_return bool_expr371 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:592:9: ( builtin_primitive op_expr | bool_expr )
            int alt155=2;
            int LA155_0 = input.LA(1);

            if ( (LA155_0==L_exception||(LA155_0>=L_concurrent && LA155_0<=L_lazy)||LA155_0==L_random||LA155_0==L_typeof||LA155_0==L_force) ) {
                alt155=1;
            }
            else if ( (LA155_0==L_begin||(LA155_0>=L_with && LA155_0<=L_if)||(LA155_0>=L_while && LA155_0<=L_for)||LA155_0==L_match||LA155_0==L_try||(LA155_0>=A_infinity && LA155_0<=U_infinity)||(LA155_0>=L_true && LA155_0<=L_this)||LA155_0==L_nil||LA155_0==MINUS||LA155_0==A_NOT||LA155_0==U_NOT||(LA155_0>=Constr && LA155_0<=Num)||(LA155_0>=String && LA155_0<=ROUND_BRACKET_OPEN)||LA155_0==SQUARE_BRACKET_OPEN||LA155_0==CURLY_BRACKET_OPEN) ) {
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:592:11: builtin_primitive op_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_builtin_primitive_in_op_expr3991);
                    builtin_primitive369=builtin_primitive();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(builtin_primitive369.getTree(), root_0);
                    pushFollow(FOLLOW_op_expr_in_op_expr3994);
                    op_expr370=op_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, op_expr370.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:593:4: bool_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_bool_expr_in_op_expr3999);
                    bool_expr371=bool_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_expr371.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:595:1: p_op_expr : ( builtin_primitive ( NL )? p_op_expr | p_bool_expr );
    public final babel17Parser.p_op_expr_return p_op_expr() throws RecognitionException {
        babel17Parser.p_op_expr_return retval = new babel17Parser.p_op_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL373=null;
        babel17Parser.builtin_primitive_return builtin_primitive372 = null;

        babel17Parser.p_op_expr_return p_op_expr374 = null;

        babel17Parser.p_bool_expr_return p_bool_expr375 = null;


        CommonTree NL373_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:596:2: ( builtin_primitive ( NL )? p_op_expr | p_bool_expr )
            int alt157=2;
            int LA157_0 = input.LA(1);

            if ( (LA157_0==L_exception||(LA157_0>=L_concurrent && LA157_0<=L_lazy)||LA157_0==L_random||LA157_0==L_typeof||LA157_0==L_force) ) {
                alt157=1;
            }
            else if ( (LA157_0==L_begin||(LA157_0>=L_with && LA157_0<=L_if)||(LA157_0>=L_while && LA157_0<=L_for)||LA157_0==L_match||LA157_0==L_try||(LA157_0>=A_infinity && LA157_0<=U_infinity)||(LA157_0>=L_true && LA157_0<=L_this)||LA157_0==L_nil||LA157_0==MINUS||LA157_0==A_NOT||LA157_0==U_NOT||(LA157_0>=Constr && LA157_0<=Num)||(LA157_0>=String && LA157_0<=ROUND_BRACKET_OPEN)||LA157_0==SQUARE_BRACKET_OPEN||LA157_0==CURLY_BRACKET_OPEN) ) {
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:596:4: builtin_primitive ( NL )? p_op_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_builtin_primitive_in_p_op_expr4009);
                    builtin_primitive372=builtin_primitive();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(builtin_primitive372.getTree(), root_0);
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:596:25: ( NL )?
                    int alt156=2;
                    int LA156_0 = input.LA(1);

                    if ( (LA156_0==NL) ) {
                        alt156=1;
                    }
                    switch (alt156) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:596:25: NL
                            {
                            NL373=(Token)match(input,NL,FOLLOW_NL_in_p_op_expr4012); if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_p_op_expr_in_p_op_expr4016);
                    p_op_expr374=p_op_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_op_expr374.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:597:4: p_bool_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_p_bool_expr_in_p_op_expr4021);
                    p_bool_expr375=p_bool_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_bool_expr375.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:600:1: builtin_primitive : ( L_random | L_exception | L_lazy | L_choose | L_concurrent | L_force | L_typeof );
    public final babel17Parser.builtin_primitive_return builtin_primitive() throws RecognitionException {
        babel17Parser.builtin_primitive_return retval = new babel17Parser.builtin_primitive_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set376=null;

        CommonTree set376_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:601:2: ( L_random | L_exception | L_lazy | L_choose | L_concurrent | L_force | L_typeof )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set376=(Token)input.LT(1);
            if ( input.LA(1)==L_exception||(input.LA(1)>=L_concurrent && input.LA(1)<=L_lazy)||input.LA(1)==L_random||input.LA(1)==L_typeof||input.LA(1)==L_force ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set376));
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:603:1: bool_expr : bool_or_expr ;
    public final babel17Parser.bool_expr_return bool_expr() throws RecognitionException {
        babel17Parser.bool_expr_return retval = new babel17Parser.bool_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.bool_or_expr_return bool_or_expr377 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:604:2: ( bool_or_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:604:4: bool_or_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bool_or_expr_in_bool_expr4065);
            bool_or_expr377=bool_or_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_or_expr377.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:606:1: p_bool_expr : p_bool_or_expr ;
    public final babel17Parser.p_bool_expr_return p_bool_expr() throws RecognitionException {
        babel17Parser.p_bool_expr_return retval = new babel17Parser.p_bool_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.p_bool_or_expr_return p_bool_or_expr378 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:607:2: ( p_bool_or_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:607:4: p_bool_or_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_bool_or_expr_in_p_bool_expr4075);
            p_bool_or_expr378=p_bool_or_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_bool_or_expr378.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:609:1: bool_or_expr : bool_and_expr ( ( NL )? token_OR ( NL )? bool_and_expr )* ;
    public final babel17Parser.bool_or_expr_return bool_or_expr() throws RecognitionException {
        babel17Parser.bool_or_expr_return retval = new babel17Parser.bool_or_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL380=null;
        Token NL382=null;
        babel17Parser.bool_and_expr_return bool_and_expr379 = null;

        babel17Parser.token_OR_return token_OR381 = null;

        babel17Parser.bool_and_expr_return bool_and_expr383 = null;


        CommonTree NL380_tree=null;
        CommonTree NL382_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:610:2: ( bool_and_expr ( ( NL )? token_OR ( NL )? bool_and_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:610:4: bool_and_expr ( ( NL )? token_OR ( NL )? bool_and_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bool_and_expr_in_bool_or_expr4084);
            bool_and_expr379=bool_and_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_and_expr379.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:610:18: ( ( NL )? token_OR ( NL )? bool_and_expr )*
            loop160:
            do {
                int alt160=2;
                int LA160_0 = input.LA(1);

                if ( (LA160_0==NL) ) {
                    int LA160_1 = input.LA(2);

                    if ( (LA160_1==A_OR||LA160_1==U_OR) ) {
                        alt160=1;
                    }


                }
                else if ( (LA160_0==A_OR||LA160_0==U_OR) ) {
                    alt160=1;
                }


                switch (alt160) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:610:19: ( NL )? token_OR ( NL )? bool_and_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:610:21: ( NL )?
            	    int alt158=2;
            	    int LA158_0 = input.LA(1);

            	    if ( (LA158_0==NL) ) {
            	        alt158=1;
            	    }
            	    switch (alt158) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:610:21: NL
            	            {
            	            NL380=(Token)match(input,NL,FOLLOW_NL_in_bool_or_expr4087); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_token_OR_in_bool_or_expr4091);
            	    token_OR381=token_OR();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(token_OR381.getTree(), root_0);
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:610:36: ( NL )?
            	    int alt159=2;
            	    int LA159_0 = input.LA(1);

            	    if ( (LA159_0==NL) ) {
            	        alt159=1;
            	    }
            	    switch (alt159) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:610:36: NL
            	            {
            	            NL382=(Token)match(input,NL,FOLLOW_NL_in_bool_or_expr4094); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_bool_and_expr_in_bool_or_expr4098);
            	    bool_and_expr383=bool_and_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_and_expr383.getTree());

            	    }
            	    break;

            	default :
            	    break loop160;
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:612:1: p_bool_or_expr : p_bool_and_expr ( ( NL )? token_OR ( NL )? p_bool_and_expr )* ;
    public final babel17Parser.p_bool_or_expr_return p_bool_or_expr() throws RecognitionException {
        babel17Parser.p_bool_or_expr_return retval = new babel17Parser.p_bool_or_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL385=null;
        Token NL387=null;
        babel17Parser.p_bool_and_expr_return p_bool_and_expr384 = null;

        babel17Parser.token_OR_return token_OR386 = null;

        babel17Parser.p_bool_and_expr_return p_bool_and_expr388 = null;


        CommonTree NL385_tree=null;
        CommonTree NL387_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:613:2: ( p_bool_and_expr ( ( NL )? token_OR ( NL )? p_bool_and_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:613:4: p_bool_and_expr ( ( NL )? token_OR ( NL )? p_bool_and_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_bool_and_expr_in_p_bool_or_expr4110);
            p_bool_and_expr384=p_bool_and_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_bool_and_expr384.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:613:20: ( ( NL )? token_OR ( NL )? p_bool_and_expr )*
            loop163:
            do {
                int alt163=2;
                int LA163_0 = input.LA(1);

                if ( (LA163_0==NL) ) {
                    int LA163_1 = input.LA(2);

                    if ( (LA163_1==A_OR||LA163_1==U_OR) ) {
                        alt163=1;
                    }


                }
                else if ( (LA163_0==A_OR||LA163_0==U_OR) ) {
                    alt163=1;
                }


                switch (alt163) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:613:21: ( NL )? token_OR ( NL )? p_bool_and_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:613:23: ( NL )?
            	    int alt161=2;
            	    int LA161_0 = input.LA(1);

            	    if ( (LA161_0==NL) ) {
            	        alt161=1;
            	    }
            	    switch (alt161) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:613:23: NL
            	            {
            	            NL385=(Token)match(input,NL,FOLLOW_NL_in_p_bool_or_expr4113); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_token_OR_in_p_bool_or_expr4117);
            	    token_OR386=token_OR();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(token_OR386.getTree(), root_0);
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:613:38: ( NL )?
            	    int alt162=2;
            	    int LA162_0 = input.LA(1);

            	    if ( (LA162_0==NL) ) {
            	        alt162=1;
            	    }
            	    switch (alt162) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:613:38: NL
            	            {
            	            NL387=(Token)match(input,NL,FOLLOW_NL_in_p_bool_or_expr4120); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_bool_and_expr_in_p_bool_or_expr4124);
            	    p_bool_and_expr388=p_bool_and_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_bool_and_expr388.getTree());

            	    }
            	    break;

            	default :
            	    break loop163;
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:615:1: bool_and_expr : bool_not_expr ( ( NL )? token_AND ( NL )? bool_not_expr )* ;
    public final babel17Parser.bool_and_expr_return bool_and_expr() throws RecognitionException {
        babel17Parser.bool_and_expr_return retval = new babel17Parser.bool_and_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL390=null;
        Token NL392=null;
        babel17Parser.bool_not_expr_return bool_not_expr389 = null;

        babel17Parser.token_AND_return token_AND391 = null;

        babel17Parser.bool_not_expr_return bool_not_expr393 = null;


        CommonTree NL390_tree=null;
        CommonTree NL392_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:616:2: ( bool_not_expr ( ( NL )? token_AND ( NL )? bool_not_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:616:4: bool_not_expr ( ( NL )? token_AND ( NL )? bool_not_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bool_not_expr_in_bool_and_expr4136);
            bool_not_expr389=bool_not_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_not_expr389.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:616:18: ( ( NL )? token_AND ( NL )? bool_not_expr )*
            loop166:
            do {
                int alt166=2;
                int LA166_0 = input.LA(1);

                if ( (LA166_0==NL) ) {
                    int LA166_1 = input.LA(2);

                    if ( (LA166_1==A_AND||LA166_1==U_AND) ) {
                        alt166=1;
                    }


                }
                else if ( (LA166_0==A_AND||LA166_0==U_AND) ) {
                    alt166=1;
                }


                switch (alt166) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:616:19: ( NL )? token_AND ( NL )? bool_not_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:616:21: ( NL )?
            	    int alt164=2;
            	    int LA164_0 = input.LA(1);

            	    if ( (LA164_0==NL) ) {
            	        alt164=1;
            	    }
            	    switch (alt164) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:616:21: NL
            	            {
            	            NL390=(Token)match(input,NL,FOLLOW_NL_in_bool_and_expr4139); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_token_AND_in_bool_and_expr4143);
            	    token_AND391=token_AND();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(token_AND391.getTree(), root_0);
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:616:37: ( NL )?
            	    int alt165=2;
            	    int LA165_0 = input.LA(1);

            	    if ( (LA165_0==NL) ) {
            	        alt165=1;
            	    }
            	    switch (alt165) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:616:37: NL
            	            {
            	            NL392=(Token)match(input,NL,FOLLOW_NL_in_bool_and_expr4146); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_bool_not_expr_in_bool_and_expr4150);
            	    bool_not_expr393=bool_not_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_not_expr393.getTree());

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
    // $ANTLR end "bool_and_expr"

    public static class p_bool_and_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "p_bool_and_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:618:1: p_bool_and_expr : p_bool_not_expr ( ( NL )? token_AND ( NL )? p_bool_not_expr )* ;
    public final babel17Parser.p_bool_and_expr_return p_bool_and_expr() throws RecognitionException {
        babel17Parser.p_bool_and_expr_return retval = new babel17Parser.p_bool_and_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL395=null;
        Token NL397=null;
        babel17Parser.p_bool_not_expr_return p_bool_not_expr394 = null;

        babel17Parser.token_AND_return token_AND396 = null;

        babel17Parser.p_bool_not_expr_return p_bool_not_expr398 = null;


        CommonTree NL395_tree=null;
        CommonTree NL397_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:619:2: ( p_bool_not_expr ( ( NL )? token_AND ( NL )? p_bool_not_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:619:4: p_bool_not_expr ( ( NL )? token_AND ( NL )? p_bool_not_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_bool_not_expr_in_p_bool_and_expr4162);
            p_bool_not_expr394=p_bool_not_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_bool_not_expr394.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:619:20: ( ( NL )? token_AND ( NL )? p_bool_not_expr )*
            loop169:
            do {
                int alt169=2;
                int LA169_0 = input.LA(1);

                if ( (LA169_0==NL) ) {
                    int LA169_1 = input.LA(2);

                    if ( (LA169_1==A_AND||LA169_1==U_AND) ) {
                        alt169=1;
                    }


                }
                else if ( (LA169_0==A_AND||LA169_0==U_AND) ) {
                    alt169=1;
                }


                switch (alt169) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:619:21: ( NL )? token_AND ( NL )? p_bool_not_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:619:23: ( NL )?
            	    int alt167=2;
            	    int LA167_0 = input.LA(1);

            	    if ( (LA167_0==NL) ) {
            	        alt167=1;
            	    }
            	    switch (alt167) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:619:23: NL
            	            {
            	            NL395=(Token)match(input,NL,FOLLOW_NL_in_p_bool_and_expr4165); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_token_AND_in_p_bool_and_expr4169);
            	    token_AND396=token_AND();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(token_AND396.getTree(), root_0);
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:619:39: ( NL )?
            	    int alt168=2;
            	    int LA168_0 = input.LA(1);

            	    if ( (LA168_0==NL) ) {
            	        alt168=1;
            	    }
            	    switch (alt168) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:619:39: NL
            	            {
            	            NL397=(Token)match(input,NL,FOLLOW_NL_in_p_bool_and_expr4172); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_bool_not_expr_in_p_bool_and_expr4176);
            	    p_bool_not_expr398=p_bool_not_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_bool_not_expr398.getTree());

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
    // $ANTLR end "p_bool_and_expr"

    public static class bool_not_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bool_not_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:622:1: bool_not_expr : ( token_NOT ( NL )? bool_not_expr | rel_expr );
    public final babel17Parser.bool_not_expr_return bool_not_expr() throws RecognitionException {
        babel17Parser.bool_not_expr_return retval = new babel17Parser.bool_not_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL400=null;
        babel17Parser.token_NOT_return token_NOT399 = null;

        babel17Parser.bool_not_expr_return bool_not_expr401 = null;

        babel17Parser.rel_expr_return rel_expr402 = null;


        CommonTree NL400_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:623:2: ( token_NOT ( NL )? bool_not_expr | rel_expr )
            int alt171=2;
            int LA171_0 = input.LA(1);

            if ( (LA171_0==A_NOT||LA171_0==U_NOT) ) {
                alt171=1;
            }
            else if ( (LA171_0==L_begin||(LA171_0>=L_with && LA171_0<=L_if)||(LA171_0>=L_while && LA171_0<=L_for)||LA171_0==L_match||LA171_0==L_try||(LA171_0>=A_infinity && LA171_0<=U_infinity)||(LA171_0>=L_true && LA171_0<=L_this)||LA171_0==L_nil||LA171_0==MINUS||(LA171_0>=Constr && LA171_0<=Num)||(LA171_0>=String && LA171_0<=ROUND_BRACKET_OPEN)||LA171_0==SQUARE_BRACKET_OPEN||LA171_0==CURLY_BRACKET_OPEN) ) {
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:623:4: token_NOT ( NL )? bool_not_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_NOT_in_bool_not_expr4188);
                    token_NOT399=token_NOT();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(token_NOT399.getTree(), root_0);
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:623:17: ( NL )?
                    int alt170=2;
                    int LA170_0 = input.LA(1);

                    if ( (LA170_0==NL) ) {
                        alt170=1;
                    }
                    switch (alt170) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:623:17: NL
                            {
                            NL400=(Token)match(input,NL,FOLLOW_NL_in_bool_not_expr4191); if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_bool_not_expr_in_bool_not_expr4195);
                    bool_not_expr401=bool_not_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_not_expr401.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:624:4: rel_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_rel_expr_in_bool_not_expr4200);
                    rel_expr402=rel_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rel_expr402.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:626:1: p_bool_not_expr : ( token_NOT ( NL )? p_bool_not_expr | p_rel_expr );
    public final babel17Parser.p_bool_not_expr_return p_bool_not_expr() throws RecognitionException {
        babel17Parser.p_bool_not_expr_return retval = new babel17Parser.p_bool_not_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL404=null;
        babel17Parser.token_NOT_return token_NOT403 = null;

        babel17Parser.p_bool_not_expr_return p_bool_not_expr405 = null;

        babel17Parser.p_rel_expr_return p_rel_expr406 = null;


        CommonTree NL404_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:627:2: ( token_NOT ( NL )? p_bool_not_expr | p_rel_expr )
            int alt173=2;
            int LA173_0 = input.LA(1);

            if ( (LA173_0==A_NOT||LA173_0==U_NOT) ) {
                alt173=1;
            }
            else if ( (LA173_0==L_begin||(LA173_0>=L_with && LA173_0<=L_if)||(LA173_0>=L_while && LA173_0<=L_for)||LA173_0==L_match||LA173_0==L_try||(LA173_0>=A_infinity && LA173_0<=U_infinity)||(LA173_0>=L_true && LA173_0<=L_this)||LA173_0==L_nil||LA173_0==MINUS||(LA173_0>=Constr && LA173_0<=Num)||(LA173_0>=String && LA173_0<=ROUND_BRACKET_OPEN)||LA173_0==SQUARE_BRACKET_OPEN||LA173_0==CURLY_BRACKET_OPEN) ) {
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:627:4: token_NOT ( NL )? p_bool_not_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_NOT_in_p_bool_not_expr4211);
                    token_NOT403=token_NOT();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(token_NOT403.getTree(), root_0);
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:627:17: ( NL )?
                    int alt172=2;
                    int LA172_0 = input.LA(1);

                    if ( (LA172_0==NL) ) {
                        alt172=1;
                    }
                    switch (alt172) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:627:17: NL
                            {
                            NL404=(Token)match(input,NL,FOLLOW_NL_in_p_bool_not_expr4214); if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_p_bool_not_expr_in_p_bool_not_expr4218);
                    p_bool_not_expr405=p_bool_not_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_bool_not_expr405.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:628:4: p_rel_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_p_rel_expr_in_p_bool_not_expr4223);
                    p_rel_expr406=p_rel_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_rel_expr406.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:630:1: rel_expr : arith_expr ( ( NL )? rel_op ( NL )? arith_expr )* -> ^( COMPARE arith_expr ( rel_op arith_expr )* ) ;
    public final babel17Parser.rel_expr_return rel_expr() throws RecognitionException {
        babel17Parser.rel_expr_return retval = new babel17Parser.rel_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL408=null;
        Token NL410=null;
        babel17Parser.arith_expr_return arith_expr407 = null;

        babel17Parser.rel_op_return rel_op409 = null;

        babel17Parser.arith_expr_return arith_expr411 = null;


        CommonTree NL408_tree=null;
        CommonTree NL410_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_arith_expr=new RewriteRuleSubtreeStream(adaptor,"rule arith_expr");
        RewriteRuleSubtreeStream stream_rel_op=new RewriteRuleSubtreeStream(adaptor,"rule rel_op");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:631:2: ( arith_expr ( ( NL )? rel_op ( NL )? arith_expr )* -> ^( COMPARE arith_expr ( rel_op arith_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:631:4: arith_expr ( ( NL )? rel_op ( NL )? arith_expr )*
            {
            pushFollow(FOLLOW_arith_expr_in_rel_expr4232);
            arith_expr407=arith_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_arith_expr.add(arith_expr407.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:631:15: ( ( NL )? rel_op ( NL )? arith_expr )*
            loop176:
            do {
                int alt176=2;
                int LA176_0 = input.LA(1);

                if ( (LA176_0==NL) ) {
                    int LA176_1 = input.LA(2);

                    if ( ((LA176_1>=A_EQUAL && LA176_1<=U_GREATER_EQ)) ) {
                        alt176=1;
                    }


                }
                else if ( ((LA176_0>=A_EQUAL && LA176_0<=U_GREATER_EQ)) ) {
                    alt176=1;
                }


                switch (alt176) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:631:16: ( NL )? rel_op ( NL )? arith_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:631:16: ( NL )?
            	    int alt174=2;
            	    int LA174_0 = input.LA(1);

            	    if ( (LA174_0==NL) ) {
            	        alt174=1;
            	    }
            	    switch (alt174) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:631:16: NL
            	            {
            	            NL408=(Token)match(input,NL,FOLLOW_NL_in_rel_expr4235); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL408);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_rel_op_in_rel_expr4238);
            	    rel_op409=rel_op();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_rel_op.add(rel_op409.getTree());
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:631:27: ( NL )?
            	    int alt175=2;
            	    int LA175_0 = input.LA(1);

            	    if ( (LA175_0==NL) ) {
            	        alt175=1;
            	    }
            	    switch (alt175) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:631:27: NL
            	            {
            	            NL410=(Token)match(input,NL,FOLLOW_NL_in_rel_expr4240); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL410);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_arith_expr_in_rel_expr4243);
            	    arith_expr411=arith_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_arith_expr.add(arith_expr411.getTree());

            	    }
            	    break;

            	default :
            	    break loop176;
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
            // 631:44: -> ^( COMPARE arith_expr ( rel_op arith_expr )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:631:47: ^( COMPARE arith_expr ( rel_op arith_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COMPARE, "COMPARE"), root_1);

                adaptor.addChild(root_1, stream_arith_expr.nextTree());
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:631:68: ( rel_op arith_expr )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:633:1: p_rel_expr : p_arith_expr ( ( NL )? rel_op ( NL )? p_arith_expr )* -> ^( COMPARE p_arith_expr ( rel_op p_arith_expr )* ) ;
    public final babel17Parser.p_rel_expr_return p_rel_expr() throws RecognitionException {
        babel17Parser.p_rel_expr_return retval = new babel17Parser.p_rel_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL413=null;
        Token NL415=null;
        babel17Parser.p_arith_expr_return p_arith_expr412 = null;

        babel17Parser.rel_op_return rel_op414 = null;

        babel17Parser.p_arith_expr_return p_arith_expr416 = null;


        CommonTree NL413_tree=null;
        CommonTree NL415_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_p_arith_expr=new RewriteRuleSubtreeStream(adaptor,"rule p_arith_expr");
        RewriteRuleSubtreeStream stream_rel_op=new RewriteRuleSubtreeStream(adaptor,"rule rel_op");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:634:2: ( p_arith_expr ( ( NL )? rel_op ( NL )? p_arith_expr )* -> ^( COMPARE p_arith_expr ( rel_op p_arith_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:634:4: p_arith_expr ( ( NL )? rel_op ( NL )? p_arith_expr )*
            {
            pushFollow(FOLLOW_p_arith_expr_in_p_rel_expr4270);
            p_arith_expr412=p_arith_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_p_arith_expr.add(p_arith_expr412.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:634:17: ( ( NL )? rel_op ( NL )? p_arith_expr )*
            loop179:
            do {
                int alt179=2;
                int LA179_0 = input.LA(1);

                if ( (LA179_0==NL) ) {
                    int LA179_1 = input.LA(2);

                    if ( ((LA179_1>=A_EQUAL && LA179_1<=U_GREATER_EQ)) ) {
                        alt179=1;
                    }


                }
                else if ( ((LA179_0>=A_EQUAL && LA179_0<=U_GREATER_EQ)) ) {
                    alt179=1;
                }


                switch (alt179) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:634:18: ( NL )? rel_op ( NL )? p_arith_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:634:18: ( NL )?
            	    int alt177=2;
            	    int LA177_0 = input.LA(1);

            	    if ( (LA177_0==NL) ) {
            	        alt177=1;
            	    }
            	    switch (alt177) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:634:18: NL
            	            {
            	            NL413=(Token)match(input,NL,FOLLOW_NL_in_p_rel_expr4273); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL413);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_rel_op_in_p_rel_expr4276);
            	    rel_op414=rel_op();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_rel_op.add(rel_op414.getTree());
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:634:29: ( NL )?
            	    int alt178=2;
            	    int LA178_0 = input.LA(1);

            	    if ( (LA178_0==NL) ) {
            	        alt178=1;
            	    }
            	    switch (alt178) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:634:29: NL
            	            {
            	            NL415=(Token)match(input,NL,FOLLOW_NL_in_p_rel_expr4278); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL415);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_arith_expr_in_p_rel_expr4281);
            	    p_arith_expr416=p_arith_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_p_arith_expr.add(p_arith_expr416.getTree());

            	    }
            	    break;

            	default :
            	    break loop179;
                }
            } while (true);



            // AST REWRITE
            // elements: p_arith_expr, p_arith_expr, rel_op
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 634:48: -> ^( COMPARE p_arith_expr ( rel_op p_arith_expr )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:634:51: ^( COMPARE p_arith_expr ( rel_op p_arith_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COMPARE, "COMPARE"), root_1);

                adaptor.addChild(root_1, stream_p_arith_expr.nextTree());
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:634:74: ( rel_op p_arith_expr )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:637:1: rel_op : ( token_EQUAL | token_NOT_EQUAL | GREATER | token_GREATER_EQ | LESS | token_LESS_EQ );
    public final babel17Parser.rel_op_return rel_op() throws RecognitionException {
        babel17Parser.rel_op_return retval = new babel17Parser.rel_op_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token GREATER419=null;
        Token LESS421=null;
        babel17Parser.token_EQUAL_return token_EQUAL417 = null;

        babel17Parser.token_NOT_EQUAL_return token_NOT_EQUAL418 = null;

        babel17Parser.token_GREATER_EQ_return token_GREATER_EQ420 = null;

        babel17Parser.token_LESS_EQ_return token_LESS_EQ422 = null;


        CommonTree GREATER419_tree=null;
        CommonTree LESS421_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:637:8: ( token_EQUAL | token_NOT_EQUAL | GREATER | token_GREATER_EQ | LESS | token_LESS_EQ )
            int alt180=6;
            switch ( input.LA(1) ) {
            case A_EQUAL:
            case U_EQUAL:
                {
                alt180=1;
                }
                break;
            case A_NOT_EQUAL:
            case U_NOT_EQUAL:
                {
                alt180=2;
                }
                break;
            case GREATER:
                {
                alt180=3;
                }
                break;
            case A_GREATER_EQ:
            case U_GREATER_EQ:
                {
                alt180=4;
                }
                break;
            case LESS:
                {
                alt180=5;
                }
                break;
            case A_LESS_EQ:
            case U_LESS_EQ:
                {
                alt180=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 180, 0, input);

                throw nvae;
            }

            switch (alt180) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:637:10: token_EQUAL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_EQUAL_in_rel_op4307);
                    token_EQUAL417=token_EQUAL();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, token_EQUAL417.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:637:24: token_NOT_EQUAL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_NOT_EQUAL_in_rel_op4311);
                    token_NOT_EQUAL418=token_NOT_EQUAL();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, token_NOT_EQUAL418.getTree());

                    }
                    break;
                case 3 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:637:42: GREATER
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    GREATER419=(Token)match(input,GREATER,FOLLOW_GREATER_in_rel_op4315); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    GREATER419_tree = (CommonTree)adaptor.create(GREATER419);
                    adaptor.addChild(root_0, GREATER419_tree);
                    }

                    }
                    break;
                case 4 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:637:52: token_GREATER_EQ
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_GREATER_EQ_in_rel_op4319);
                    token_GREATER_EQ420=token_GREATER_EQ();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, token_GREATER_EQ420.getTree());

                    }
                    break;
                case 5 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:637:71: LESS
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    LESS421=(Token)match(input,LESS,FOLLOW_LESS_in_rel_op4323); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LESS421_tree = (CommonTree)adaptor.create(LESS421);
                    adaptor.addChild(root_0, LESS421_tree);
                    }

                    }
                    break;
                case 6 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:637:78: token_LESS_EQ
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_LESS_EQ_in_rel_op4327);
                    token_LESS_EQ422=token_LESS_EQ();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, token_LESS_EQ422.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:640:1: arith_expr : plusplus_expr ;
    public final babel17Parser.arith_expr_return arith_expr() throws RecognitionException {
        babel17Parser.arith_expr_return retval = new babel17Parser.arith_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.plusplus_expr_return plusplus_expr423 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:641:2: ( plusplus_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:641:4: plusplus_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_plusplus_expr_in_arith_expr4339);
            plusplus_expr423=plusplus_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, plusplus_expr423.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:644:1: p_arith_expr : p_plusplus_expr ;
    public final babel17Parser.p_arith_expr_return p_arith_expr() throws RecognitionException {
        babel17Parser.p_arith_expr_return retval = new babel17Parser.p_arith_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.p_plusplus_expr_return p_plusplus_expr424 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:645:2: ( p_plusplus_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:645:4: p_plusplus_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_plusplus_expr_in_p_arith_expr4349);
            p_plusplus_expr424=p_plusplus_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_plusplus_expr424.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:647:1: plusplus_expr : timestimes_expr ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? timestimes_expr )* ;
    public final babel17Parser.plusplus_expr_return plusplus_expr() throws RecognitionException {
        babel17Parser.plusplus_expr_return retval = new babel17Parser.plusplus_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL426=null;
        Token PLUSPLUS427=null;
        Token MINUSMINUS428=null;
        Token NL429=null;
        babel17Parser.timestimes_expr_return timestimes_expr425 = null;

        babel17Parser.timestimes_expr_return timestimes_expr430 = null;


        CommonTree NL426_tree=null;
        CommonTree PLUSPLUS427_tree=null;
        CommonTree MINUSMINUS428_tree=null;
        CommonTree NL429_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:648:2: ( timestimes_expr ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? timestimes_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:648:4: timestimes_expr ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? timestimes_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_timestimes_expr_in_plusplus_expr4359);
            timestimes_expr425=timestimes_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, timestimes_expr425.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:648:20: ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? timestimes_expr )*
            loop184:
            do {
                int alt184=2;
                int LA184_0 = input.LA(1);

                if ( (LA184_0==NL) ) {
                    int LA184_1 = input.LA(2);

                    if ( ((LA184_1>=PLUSPLUS && LA184_1<=MINUSMINUS)) ) {
                        alt184=1;
                    }


                }
                else if ( ((LA184_0>=PLUSPLUS && LA184_0<=MINUSMINUS)) ) {
                    alt184=1;
                }


                switch (alt184) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:648:21: ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? timestimes_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:648:23: ( NL )?
            	    int alt181=2;
            	    int LA181_0 = input.LA(1);

            	    if ( (LA181_0==NL) ) {
            	        alt181=1;
            	    }
            	    switch (alt181) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:648:23: NL
            	            {
            	            NL426=(Token)match(input,NL,FOLLOW_NL_in_plusplus_expr4362); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:648:26: ( PLUSPLUS | MINUSMINUS )
            	    int alt182=2;
            	    int LA182_0 = input.LA(1);

            	    if ( (LA182_0==PLUSPLUS) ) {
            	        alt182=1;
            	    }
            	    else if ( (LA182_0==MINUSMINUS) ) {
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
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:648:27: PLUSPLUS
            	            {
            	            PLUSPLUS427=(Token)match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_plusplus_expr4367); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PLUSPLUS427_tree = (CommonTree)adaptor.create(PLUSPLUS427);
            	            root_0 = (CommonTree)adaptor.becomeRoot(PLUSPLUS427_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:648:37: MINUSMINUS
            	            {
            	            MINUSMINUS428=(Token)match(input,MINUSMINUS,FOLLOW_MINUSMINUS_in_plusplus_expr4370); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            MINUSMINUS428_tree = (CommonTree)adaptor.create(MINUSMINUS428);
            	            root_0 = (CommonTree)adaptor.becomeRoot(MINUSMINUS428_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:648:52: ( NL )?
            	    int alt183=2;
            	    int LA183_0 = input.LA(1);

            	    if ( (LA183_0==NL) ) {
            	        alt183=1;
            	    }
            	    switch (alt183) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:648:52: NL
            	            {
            	            NL429=(Token)match(input,NL,FOLLOW_NL_in_plusplus_expr4374); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_timestimes_expr_in_plusplus_expr4378);
            	    timestimes_expr430=timestimes_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, timestimes_expr430.getTree());

            	    }
            	    break;

            	default :
            	    break loop184;
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:650:1: p_plusplus_expr : p_timestimes_expr ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? p_timestimes_expr )* ;
    public final babel17Parser.p_plusplus_expr_return p_plusplus_expr() throws RecognitionException {
        babel17Parser.p_plusplus_expr_return retval = new babel17Parser.p_plusplus_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL432=null;
        Token PLUSPLUS433=null;
        Token MINUSMINUS434=null;
        Token NL435=null;
        babel17Parser.p_timestimes_expr_return p_timestimes_expr431 = null;

        babel17Parser.p_timestimes_expr_return p_timestimes_expr436 = null;


        CommonTree NL432_tree=null;
        CommonTree PLUSPLUS433_tree=null;
        CommonTree MINUSMINUS434_tree=null;
        CommonTree NL435_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:651:2: ( p_timestimes_expr ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? p_timestimes_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:651:4: p_timestimes_expr ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? p_timestimes_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_timestimes_expr_in_p_plusplus_expr4390);
            p_timestimes_expr431=p_timestimes_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_timestimes_expr431.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:651:22: ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? p_timestimes_expr )*
            loop188:
            do {
                int alt188=2;
                int LA188_0 = input.LA(1);

                if ( (LA188_0==NL) ) {
                    int LA188_1 = input.LA(2);

                    if ( ((LA188_1>=PLUSPLUS && LA188_1<=MINUSMINUS)) ) {
                        alt188=1;
                    }


                }
                else if ( ((LA188_0>=PLUSPLUS && LA188_0<=MINUSMINUS)) ) {
                    alt188=1;
                }


                switch (alt188) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:651:23: ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? p_timestimes_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:651:25: ( NL )?
            	    int alt185=2;
            	    int LA185_0 = input.LA(1);

            	    if ( (LA185_0==NL) ) {
            	        alt185=1;
            	    }
            	    switch (alt185) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:651:25: NL
            	            {
            	            NL432=(Token)match(input,NL,FOLLOW_NL_in_p_plusplus_expr4393); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:651:28: ( PLUSPLUS | MINUSMINUS )
            	    int alt186=2;
            	    int LA186_0 = input.LA(1);

            	    if ( (LA186_0==PLUSPLUS) ) {
            	        alt186=1;
            	    }
            	    else if ( (LA186_0==MINUSMINUS) ) {
            	        alt186=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 186, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt186) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:651:29: PLUSPLUS
            	            {
            	            PLUSPLUS433=(Token)match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_p_plusplus_expr4398); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PLUSPLUS433_tree = (CommonTree)adaptor.create(PLUSPLUS433);
            	            root_0 = (CommonTree)adaptor.becomeRoot(PLUSPLUS433_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:651:39: MINUSMINUS
            	            {
            	            MINUSMINUS434=(Token)match(input,MINUSMINUS,FOLLOW_MINUSMINUS_in_p_plusplus_expr4401); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            MINUSMINUS434_tree = (CommonTree)adaptor.create(MINUSMINUS434);
            	            root_0 = (CommonTree)adaptor.becomeRoot(MINUSMINUS434_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:651:54: ( NL )?
            	    int alt187=2;
            	    int LA187_0 = input.LA(1);

            	    if ( (LA187_0==NL) ) {
            	        alt187=1;
            	    }
            	    switch (alt187) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:651:54: NL
            	            {
            	            NL435=(Token)match(input,NL,FOLLOW_NL_in_p_plusplus_expr4405); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_timestimes_expr_in_p_plusplus_expr4409);
            	    p_timestimes_expr436=p_timestimes_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_timestimes_expr436.getTree());

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
    // $ANTLR end "p_plusplus_expr"

    public static class timestimes_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "timestimes_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:654:1: timestimes_expr : simple_expr ( ( NL )? ( TIMESTIMES | QUOTIENTQUOTIENT ) ( NL )? simple_expr )* ;
    public final babel17Parser.timestimes_expr_return timestimes_expr() throws RecognitionException {
        babel17Parser.timestimes_expr_return retval = new babel17Parser.timestimes_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL438=null;
        Token TIMESTIMES439=null;
        Token QUOTIENTQUOTIENT440=null;
        Token NL441=null;
        babel17Parser.simple_expr_return simple_expr437 = null;

        babel17Parser.simple_expr_return simple_expr442 = null;


        CommonTree NL438_tree=null;
        CommonTree TIMESTIMES439_tree=null;
        CommonTree QUOTIENTQUOTIENT440_tree=null;
        CommonTree NL441_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:655:2: ( simple_expr ( ( NL )? ( TIMESTIMES | QUOTIENTQUOTIENT ) ( NL )? simple_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:655:4: simple_expr ( ( NL )? ( TIMESTIMES | QUOTIENTQUOTIENT ) ( NL )? simple_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_simple_expr_in_timestimes_expr4421);
            simple_expr437=simple_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, simple_expr437.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:655:16: ( ( NL )? ( TIMESTIMES | QUOTIENTQUOTIENT ) ( NL )? simple_expr )*
            loop192:
            do {
                int alt192=2;
                int LA192_0 = input.LA(1);

                if ( (LA192_0==NL) ) {
                    int LA192_1 = input.LA(2);

                    if ( ((LA192_1>=TIMESTIMES && LA192_1<=QUOTIENTQUOTIENT)) ) {
                        alt192=1;
                    }


                }
                else if ( ((LA192_0>=TIMESTIMES && LA192_0<=QUOTIENTQUOTIENT)) ) {
                    alt192=1;
                }


                switch (alt192) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:655:17: ( NL )? ( TIMESTIMES | QUOTIENTQUOTIENT ) ( NL )? simple_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:655:19: ( NL )?
            	    int alt189=2;
            	    int LA189_0 = input.LA(1);

            	    if ( (LA189_0==NL) ) {
            	        alt189=1;
            	    }
            	    switch (alt189) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:655:19: NL
            	            {
            	            NL438=(Token)match(input,NL,FOLLOW_NL_in_timestimes_expr4424); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:655:22: ( TIMESTIMES | QUOTIENTQUOTIENT )
            	    int alt190=2;
            	    int LA190_0 = input.LA(1);

            	    if ( (LA190_0==TIMESTIMES) ) {
            	        alt190=1;
            	    }
            	    else if ( (LA190_0==QUOTIENTQUOTIENT) ) {
            	        alt190=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 190, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt190) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:655:23: TIMESTIMES
            	            {
            	            TIMESTIMES439=(Token)match(input,TIMESTIMES,FOLLOW_TIMESTIMES_in_timestimes_expr4429); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            TIMESTIMES439_tree = (CommonTree)adaptor.create(TIMESTIMES439);
            	            root_0 = (CommonTree)adaptor.becomeRoot(TIMESTIMES439_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:655:35: QUOTIENTQUOTIENT
            	            {
            	            QUOTIENTQUOTIENT440=(Token)match(input,QUOTIENTQUOTIENT,FOLLOW_QUOTIENTQUOTIENT_in_timestimes_expr4432); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            QUOTIENTQUOTIENT440_tree = (CommonTree)adaptor.create(QUOTIENTQUOTIENT440);
            	            root_0 = (CommonTree)adaptor.becomeRoot(QUOTIENTQUOTIENT440_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:655:56: ( NL )?
            	    int alt191=2;
            	    int LA191_0 = input.LA(1);

            	    if ( (LA191_0==NL) ) {
            	        alt191=1;
            	    }
            	    switch (alt191) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:655:56: NL
            	            {
            	            NL441=(Token)match(input,NL,FOLLOW_NL_in_timestimes_expr4436); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_simple_expr_in_timestimes_expr4440);
            	    simple_expr442=simple_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, simple_expr442.getTree());

            	    }
            	    break;

            	default :
            	    break loop192;
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:657:1: p_timestimes_expr : p_simple_expr ( ( NL )? ( TIMESTIMES | QUOTIENTQUOTIENT ) ( NL )? p_simple_expr )* ;
    public final babel17Parser.p_timestimes_expr_return p_timestimes_expr() throws RecognitionException {
        babel17Parser.p_timestimes_expr_return retval = new babel17Parser.p_timestimes_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL444=null;
        Token TIMESTIMES445=null;
        Token QUOTIENTQUOTIENT446=null;
        Token NL447=null;
        babel17Parser.p_simple_expr_return p_simple_expr443 = null;

        babel17Parser.p_simple_expr_return p_simple_expr448 = null;


        CommonTree NL444_tree=null;
        CommonTree TIMESTIMES445_tree=null;
        CommonTree QUOTIENTQUOTIENT446_tree=null;
        CommonTree NL447_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:658:2: ( p_simple_expr ( ( NL )? ( TIMESTIMES | QUOTIENTQUOTIENT ) ( NL )? p_simple_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:658:4: p_simple_expr ( ( NL )? ( TIMESTIMES | QUOTIENTQUOTIENT ) ( NL )? p_simple_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_simple_expr_in_p_timestimes_expr4453);
            p_simple_expr443=p_simple_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_simple_expr443.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:658:18: ( ( NL )? ( TIMESTIMES | QUOTIENTQUOTIENT ) ( NL )? p_simple_expr )*
            loop196:
            do {
                int alt196=2;
                int LA196_0 = input.LA(1);

                if ( (LA196_0==NL) ) {
                    int LA196_1 = input.LA(2);

                    if ( ((LA196_1>=TIMESTIMES && LA196_1<=QUOTIENTQUOTIENT)) ) {
                        alt196=1;
                    }


                }
                else if ( ((LA196_0>=TIMESTIMES && LA196_0<=QUOTIENTQUOTIENT)) ) {
                    alt196=1;
                }


                switch (alt196) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:658:19: ( NL )? ( TIMESTIMES | QUOTIENTQUOTIENT ) ( NL )? p_simple_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:658:21: ( NL )?
            	    int alt193=2;
            	    int LA193_0 = input.LA(1);

            	    if ( (LA193_0==NL) ) {
            	        alt193=1;
            	    }
            	    switch (alt193) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:658:21: NL
            	            {
            	            NL444=(Token)match(input,NL,FOLLOW_NL_in_p_timestimes_expr4456); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:658:24: ( TIMESTIMES | QUOTIENTQUOTIENT )
            	    int alt194=2;
            	    int LA194_0 = input.LA(1);

            	    if ( (LA194_0==TIMESTIMES) ) {
            	        alt194=1;
            	    }
            	    else if ( (LA194_0==QUOTIENTQUOTIENT) ) {
            	        alt194=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 194, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt194) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:658:25: TIMESTIMES
            	            {
            	            TIMESTIMES445=(Token)match(input,TIMESTIMES,FOLLOW_TIMESTIMES_in_p_timestimes_expr4461); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            TIMESTIMES445_tree = (CommonTree)adaptor.create(TIMESTIMES445);
            	            root_0 = (CommonTree)adaptor.becomeRoot(TIMESTIMES445_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:658:37: QUOTIENTQUOTIENT
            	            {
            	            QUOTIENTQUOTIENT446=(Token)match(input,QUOTIENTQUOTIENT,FOLLOW_QUOTIENTQUOTIENT_in_p_timestimes_expr4464); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            QUOTIENTQUOTIENT446_tree = (CommonTree)adaptor.create(QUOTIENTQUOTIENT446);
            	            root_0 = (CommonTree)adaptor.becomeRoot(QUOTIENTQUOTIENT446_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:658:58: ( NL )?
            	    int alt195=2;
            	    int LA195_0 = input.LA(1);

            	    if ( (LA195_0==NL) ) {
            	        alt195=1;
            	    }
            	    switch (alt195) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:658:58: NL
            	            {
            	            NL447=(Token)match(input,NL,FOLLOW_NL_in_p_timestimes_expr4468); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_simple_expr_in_p_timestimes_expr4472);
            	    p_simple_expr448=p_simple_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_simple_expr448.getTree());

            	    }
            	    break;

            	default :
            	    break loop196;
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:660:1: simple_expr : cons_expr ;
    public final babel17Parser.simple_expr_return simple_expr() throws RecognitionException {
        babel17Parser.simple_expr_return retval = new babel17Parser.simple_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.cons_expr_return cons_expr449 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:661:2: ( cons_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:661:4: cons_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_cons_expr_in_simple_expr4483);
            cons_expr449=cons_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, cons_expr449.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:663:1: p_simple_expr : p_cons_expr ;
    public final babel17Parser.p_simple_expr_return p_simple_expr() throws RecognitionException {
        babel17Parser.p_simple_expr_return retval = new babel17Parser.p_simple_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.p_cons_expr_return p_cons_expr450 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:664:2: ( p_cons_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:664:4: p_cons_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_cons_expr_in_p_simple_expr4492);
            p_cons_expr450=p_cons_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_cons_expr450.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:666:1: cons_expr : to_expr ( ( NL )? token_DOUBLE_COLON ( NL )? to_expr )* -> ^( LIST_CONS ( to_expr )* ) ;
    public final babel17Parser.cons_expr_return cons_expr() throws RecognitionException {
        babel17Parser.cons_expr_return retval = new babel17Parser.cons_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL452=null;
        Token NL454=null;
        babel17Parser.to_expr_return to_expr451 = null;

        babel17Parser.token_DOUBLE_COLON_return token_DOUBLE_COLON453 = null;

        babel17Parser.to_expr_return to_expr455 = null;


        CommonTree NL452_tree=null;
        CommonTree NL454_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_token_DOUBLE_COLON=new RewriteRuleSubtreeStream(adaptor,"rule token_DOUBLE_COLON");
        RewriteRuleSubtreeStream stream_to_expr=new RewriteRuleSubtreeStream(adaptor,"rule to_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:667:2: ( to_expr ( ( NL )? token_DOUBLE_COLON ( NL )? to_expr )* -> ^( LIST_CONS ( to_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:667:4: to_expr ( ( NL )? token_DOUBLE_COLON ( NL )? to_expr )*
            {
            pushFollow(FOLLOW_to_expr_in_cons_expr4501);
            to_expr451=to_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_to_expr.add(to_expr451.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:667:12: ( ( NL )? token_DOUBLE_COLON ( NL )? to_expr )*
            loop199:
            do {
                int alt199=2;
                int LA199_0 = input.LA(1);

                if ( (LA199_0==NL) ) {
                    int LA199_1 = input.LA(2);

                    if ( ((LA199_1>=A_DOUBLE_COLON && LA199_1<=U_DOUBLE_COLON)) ) {
                        alt199=1;
                    }


                }
                else if ( ((LA199_0>=A_DOUBLE_COLON && LA199_0<=U_DOUBLE_COLON)) ) {
                    alt199=1;
                }


                switch (alt199) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:667:13: ( NL )? token_DOUBLE_COLON ( NL )? to_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:667:13: ( NL )?
            	    int alt197=2;
            	    int LA197_0 = input.LA(1);

            	    if ( (LA197_0==NL) ) {
            	        alt197=1;
            	    }
            	    switch (alt197) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:667:13: NL
            	            {
            	            NL452=(Token)match(input,NL,FOLLOW_NL_in_cons_expr4504); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL452);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_token_DOUBLE_COLON_in_cons_expr4507);
            	    token_DOUBLE_COLON453=token_DOUBLE_COLON();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_token_DOUBLE_COLON.add(token_DOUBLE_COLON453.getTree());
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:667:36: ( NL )?
            	    int alt198=2;
            	    int LA198_0 = input.LA(1);

            	    if ( (LA198_0==NL) ) {
            	        alt198=1;
            	    }
            	    switch (alt198) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:667:36: NL
            	            {
            	            NL454=(Token)match(input,NL,FOLLOW_NL_in_cons_expr4509); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL454);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_to_expr_in_cons_expr4512);
            	    to_expr455=to_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_to_expr.add(to_expr455.getTree());

            	    }
            	    break;

            	default :
            	    break loop199;
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
            // 667:50: -> ^( LIST_CONS ( to_expr )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:667:53: ^( LIST_CONS ( to_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LIST_CONS, "LIST_CONS"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:667:65: ( to_expr )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:669:1: p_cons_expr : p_to_expr ( ( NL )? token_DOUBLE_COLON ( NL )? p_to_expr )* -> ^( LIST_CONS ( p_to_expr )* ) ;
    public final babel17Parser.p_cons_expr_return p_cons_expr() throws RecognitionException {
        babel17Parser.p_cons_expr_return retval = new babel17Parser.p_cons_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL457=null;
        Token NL459=null;
        babel17Parser.p_to_expr_return p_to_expr456 = null;

        babel17Parser.token_DOUBLE_COLON_return token_DOUBLE_COLON458 = null;

        babel17Parser.p_to_expr_return p_to_expr460 = null;


        CommonTree NL457_tree=null;
        CommonTree NL459_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_p_to_expr=new RewriteRuleSubtreeStream(adaptor,"rule p_to_expr");
        RewriteRuleSubtreeStream stream_token_DOUBLE_COLON=new RewriteRuleSubtreeStream(adaptor,"rule token_DOUBLE_COLON");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:670:2: ( p_to_expr ( ( NL )? token_DOUBLE_COLON ( NL )? p_to_expr )* -> ^( LIST_CONS ( p_to_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:670:4: p_to_expr ( ( NL )? token_DOUBLE_COLON ( NL )? p_to_expr )*
            {
            pushFollow(FOLLOW_p_to_expr_in_p_cons_expr4532);
            p_to_expr456=p_to_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_p_to_expr.add(p_to_expr456.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:670:14: ( ( NL )? token_DOUBLE_COLON ( NL )? p_to_expr )*
            loop202:
            do {
                int alt202=2;
                int LA202_0 = input.LA(1);

                if ( (LA202_0==NL) ) {
                    int LA202_1 = input.LA(2);

                    if ( ((LA202_1>=A_DOUBLE_COLON && LA202_1<=U_DOUBLE_COLON)) ) {
                        alt202=1;
                    }


                }
                else if ( ((LA202_0>=A_DOUBLE_COLON && LA202_0<=U_DOUBLE_COLON)) ) {
                    alt202=1;
                }


                switch (alt202) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:670:15: ( NL )? token_DOUBLE_COLON ( NL )? p_to_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:670:15: ( NL )?
            	    int alt200=2;
            	    int LA200_0 = input.LA(1);

            	    if ( (LA200_0==NL) ) {
            	        alt200=1;
            	    }
            	    switch (alt200) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:670:15: NL
            	            {
            	            NL457=(Token)match(input,NL,FOLLOW_NL_in_p_cons_expr4535); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL457);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_token_DOUBLE_COLON_in_p_cons_expr4538);
            	    token_DOUBLE_COLON458=token_DOUBLE_COLON();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_token_DOUBLE_COLON.add(token_DOUBLE_COLON458.getTree());
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:670:38: ( NL )?
            	    int alt201=2;
            	    int LA201_0 = input.LA(1);

            	    if ( (LA201_0==NL) ) {
            	        alt201=1;
            	    }
            	    switch (alt201) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:670:38: NL
            	            {
            	            NL459=(Token)match(input,NL,FOLLOW_NL_in_p_cons_expr4540); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL459);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_to_expr_in_p_cons_expr4543);
            	    p_to_expr460=p_to_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_p_to_expr.add(p_to_expr460.getTree());

            	    }
            	    break;

            	default :
            	    break loop202;
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
            // 670:54: -> ^( LIST_CONS ( p_to_expr )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:670:57: ^( LIST_CONS ( p_to_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LIST_CONS, "LIST_CONS"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:670:69: ( p_to_expr )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:673:1: to_expr : arith_plus_expr ( ( NL )? ( L_to | L_downto ) ( NL )? arith_plus_expr )? ;
    public final babel17Parser.to_expr_return to_expr() throws RecognitionException {
        babel17Parser.to_expr_return retval = new babel17Parser.to_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL462=null;
        Token L_to463=null;
        Token L_downto464=null;
        Token NL465=null;
        babel17Parser.arith_plus_expr_return arith_plus_expr461 = null;

        babel17Parser.arith_plus_expr_return arith_plus_expr466 = null;


        CommonTree NL462_tree=null;
        CommonTree L_to463_tree=null;
        CommonTree L_downto464_tree=null;
        CommonTree NL465_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:673:9: ( arith_plus_expr ( ( NL )? ( L_to | L_downto ) ( NL )? arith_plus_expr )? )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:673:11: arith_plus_expr ( ( NL )? ( L_to | L_downto ) ( NL )? arith_plus_expr )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_arith_plus_expr_in_to_expr4563);
            arith_plus_expr461=arith_plus_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, arith_plus_expr461.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:673:27: ( ( NL )? ( L_to | L_downto ) ( NL )? arith_plus_expr )?
            int alt206=2;
            int LA206_0 = input.LA(1);

            if ( (LA206_0==NL) ) {
                int LA206_1 = input.LA(2);

                if ( ((LA206_1>=L_to && LA206_1<=L_downto)) ) {
                    alt206=1;
                }
            }
            else if ( ((LA206_0>=L_to && LA206_0<=L_downto)) ) {
                alt206=1;
            }
            switch (alt206) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:673:28: ( NL )? ( L_to | L_downto ) ( NL )? arith_plus_expr
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:673:30: ( NL )?
                    int alt203=2;
                    int LA203_0 = input.LA(1);

                    if ( (LA203_0==NL) ) {
                        alt203=1;
                    }
                    switch (alt203) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:673:30: NL
                            {
                            NL462=(Token)match(input,NL,FOLLOW_NL_in_to_expr4566); if (state.failed) return retval;

                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:673:33: ( L_to | L_downto )
                    int alt204=2;
                    int LA204_0 = input.LA(1);

                    if ( (LA204_0==L_to) ) {
                        alt204=1;
                    }
                    else if ( (LA204_0==L_downto) ) {
                        alt204=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 204, 0, input);

                        throw nvae;
                    }
                    switch (alt204) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:673:34: L_to
                            {
                            L_to463=(Token)match(input,L_to,FOLLOW_L_to_in_to_expr4571); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            L_to463_tree = (CommonTree)adaptor.create(L_to463);
                            root_0 = (CommonTree)adaptor.becomeRoot(L_to463_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:673:41: L_downto
                            {
                            L_downto464=(Token)match(input,L_downto,FOLLOW_L_downto_in_to_expr4575); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            L_downto464_tree = (CommonTree)adaptor.create(L_downto464);
                            root_0 = (CommonTree)adaptor.becomeRoot(L_downto464_tree, root_0);
                            }

                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:673:54: ( NL )?
                    int alt205=2;
                    int LA205_0 = input.LA(1);

                    if ( (LA205_0==NL) ) {
                        alt205=1;
                    }
                    switch (alt205) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:673:54: NL
                            {
                            NL465=(Token)match(input,NL,FOLLOW_NL_in_to_expr4579); if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_arith_plus_expr_in_to_expr4583);
                    arith_plus_expr466=arith_plus_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arith_plus_expr466.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:675:1: p_to_expr : p_arith_plus_expr ( ( NL )? ( L_to | L_downto ) ( NL )? p_arith_plus_expr )? ;
    public final babel17Parser.p_to_expr_return p_to_expr() throws RecognitionException {
        babel17Parser.p_to_expr_return retval = new babel17Parser.p_to_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL468=null;
        Token L_to469=null;
        Token L_downto470=null;
        Token NL471=null;
        babel17Parser.p_arith_plus_expr_return p_arith_plus_expr467 = null;

        babel17Parser.p_arith_plus_expr_return p_arith_plus_expr472 = null;


        CommonTree NL468_tree=null;
        CommonTree L_to469_tree=null;
        CommonTree L_downto470_tree=null;
        CommonTree NL471_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:676:2: ( p_arith_plus_expr ( ( NL )? ( L_to | L_downto ) ( NL )? p_arith_plus_expr )? )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:676:4: p_arith_plus_expr ( ( NL )? ( L_to | L_downto ) ( NL )? p_arith_plus_expr )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_arith_plus_expr_in_p_to_expr4596);
            p_arith_plus_expr467=p_arith_plus_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_arith_plus_expr467.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:676:22: ( ( NL )? ( L_to | L_downto ) ( NL )? p_arith_plus_expr )?
            int alt210=2;
            int LA210_0 = input.LA(1);

            if ( (LA210_0==NL) ) {
                int LA210_1 = input.LA(2);

                if ( ((LA210_1>=L_to && LA210_1<=L_downto)) ) {
                    alt210=1;
                }
            }
            else if ( ((LA210_0>=L_to && LA210_0<=L_downto)) ) {
                alt210=1;
            }
            switch (alt210) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:676:23: ( NL )? ( L_to | L_downto ) ( NL )? p_arith_plus_expr
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:676:25: ( NL )?
                    int alt207=2;
                    int LA207_0 = input.LA(1);

                    if ( (LA207_0==NL) ) {
                        alt207=1;
                    }
                    switch (alt207) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:676:25: NL
                            {
                            NL468=(Token)match(input,NL,FOLLOW_NL_in_p_to_expr4599); if (state.failed) return retval;

                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:676:28: ( L_to | L_downto )
                    int alt208=2;
                    int LA208_0 = input.LA(1);

                    if ( (LA208_0==L_to) ) {
                        alt208=1;
                    }
                    else if ( (LA208_0==L_downto) ) {
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
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:676:29: L_to
                            {
                            L_to469=(Token)match(input,L_to,FOLLOW_L_to_in_p_to_expr4604); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            L_to469_tree = (CommonTree)adaptor.create(L_to469);
                            root_0 = (CommonTree)adaptor.becomeRoot(L_to469_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:676:36: L_downto
                            {
                            L_downto470=(Token)match(input,L_downto,FOLLOW_L_downto_in_p_to_expr4608); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            L_downto470_tree = (CommonTree)adaptor.create(L_downto470);
                            root_0 = (CommonTree)adaptor.becomeRoot(L_downto470_tree, root_0);
                            }

                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:676:49: ( NL )?
                    int alt209=2;
                    int LA209_0 = input.LA(1);

                    if ( (LA209_0==NL) ) {
                        alt209=1;
                    }
                    switch (alt209) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:676:49: NL
                            {
                            NL471=(Token)match(input,NL,FOLLOW_NL_in_p_to_expr4612); if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_p_arith_plus_expr_in_p_to_expr4616);
                    p_arith_plus_expr472=p_arith_plus_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_arith_plus_expr472.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:678:1: arith_plus_expr : arith_uminus_expr ( ( ( NL )? PLUS | MINUS ) ( NL )? arith_uminus_expr )* ;
    public final babel17Parser.arith_plus_expr_return arith_plus_expr() throws RecognitionException {
        babel17Parser.arith_plus_expr_return retval = new babel17Parser.arith_plus_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL474=null;
        Token PLUS475=null;
        Token MINUS476=null;
        Token NL477=null;
        babel17Parser.arith_uminus_expr_return arith_uminus_expr473 = null;

        babel17Parser.arith_uminus_expr_return arith_uminus_expr478 = null;


        CommonTree NL474_tree=null;
        CommonTree PLUS475_tree=null;
        CommonTree MINUS476_tree=null;
        CommonTree NL477_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:679:2: ( arith_uminus_expr ( ( ( NL )? PLUS | MINUS ) ( NL )? arith_uminus_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:679:4: arith_uminus_expr ( ( ( NL )? PLUS | MINUS ) ( NL )? arith_uminus_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_arith_uminus_expr_in_arith_plus_expr4628);
            arith_uminus_expr473=arith_uminus_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, arith_uminus_expr473.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:679:22: ( ( ( NL )? PLUS | MINUS ) ( NL )? arith_uminus_expr )*
            loop214:
            do {
                int alt214=2;
                int LA214_0 = input.LA(1);

                if ( (LA214_0==NL) ) {
                    int LA214_1 = input.LA(2);

                    if ( (LA214_1==PLUS) ) {
                        alt214=1;
                    }


                }
                else if ( ((LA214_0>=PLUS && LA214_0<=MINUS)) ) {
                    alt214=1;
                }


                switch (alt214) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:679:23: ( ( NL )? PLUS | MINUS ) ( NL )? arith_uminus_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:679:23: ( ( NL )? PLUS | MINUS )
            	    int alt212=2;
            	    int LA212_0 = input.LA(1);

            	    if ( (LA212_0==PLUS||LA212_0==NL) ) {
            	        alt212=1;
            	    }
            	    else if ( (LA212_0==MINUS) ) {
            	        alt212=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 212, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt212) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:679:24: ( NL )? PLUS
            	            {
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:679:26: ( NL )?
            	            int alt211=2;
            	            int LA211_0 = input.LA(1);

            	            if ( (LA211_0==NL) ) {
            	                alt211=1;
            	            }
            	            switch (alt211) {
            	                case 1 :
            	                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:679:26: NL
            	                    {
            	                    NL474=(Token)match(input,NL,FOLLOW_NL_in_arith_plus_expr4632); if (state.failed) return retval;

            	                    }
            	                    break;

            	            }

            	            PLUS475=(Token)match(input,PLUS,FOLLOW_PLUS_in_arith_plus_expr4636); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PLUS475_tree = (CommonTree)adaptor.create(PLUS475);
            	            root_0 = (CommonTree)adaptor.becomeRoot(PLUS475_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:679:37: MINUS
            	            {
            	            MINUS476=(Token)match(input,MINUS,FOLLOW_MINUS_in_arith_plus_expr4641); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            MINUS476_tree = (CommonTree)adaptor.create(MINUS476);
            	            root_0 = (CommonTree)adaptor.becomeRoot(MINUS476_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:679:47: ( NL )?
            	    int alt213=2;
            	    int LA213_0 = input.LA(1);

            	    if ( (LA213_0==NL) ) {
            	        alt213=1;
            	    }
            	    switch (alt213) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:679:47: NL
            	            {
            	            NL477=(Token)match(input,NL,FOLLOW_NL_in_arith_plus_expr4645); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_arith_uminus_expr_in_arith_plus_expr4649);
            	    arith_uminus_expr478=arith_uminus_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, arith_uminus_expr478.getTree());

            	    }
            	    break;

            	default :
            	    break loop214;
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:681:1: p_arith_plus_expr : p_arith_uminus_expr ( ( NL )? ( PLUS | MINUS ) ( NL )? p_arith_uminus_expr )* ;
    public final babel17Parser.p_arith_plus_expr_return p_arith_plus_expr() throws RecognitionException {
        babel17Parser.p_arith_plus_expr_return retval = new babel17Parser.p_arith_plus_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL480=null;
        Token set481=null;
        Token NL482=null;
        babel17Parser.p_arith_uminus_expr_return p_arith_uminus_expr479 = null;

        babel17Parser.p_arith_uminus_expr_return p_arith_uminus_expr483 = null;


        CommonTree NL480_tree=null;
        CommonTree set481_tree=null;
        CommonTree NL482_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:682:2: ( p_arith_uminus_expr ( ( NL )? ( PLUS | MINUS ) ( NL )? p_arith_uminus_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:682:4: p_arith_uminus_expr ( ( NL )? ( PLUS | MINUS ) ( NL )? p_arith_uminus_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_arith_uminus_expr_in_p_arith_plus_expr4660);
            p_arith_uminus_expr479=p_arith_uminus_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_arith_uminus_expr479.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:682:24: ( ( NL )? ( PLUS | MINUS ) ( NL )? p_arith_uminus_expr )*
            loop217:
            do {
                int alt217=2;
                int LA217_0 = input.LA(1);

                if ( (LA217_0==NL) ) {
                    int LA217_1 = input.LA(2);

                    if ( ((LA217_1>=PLUS && LA217_1<=MINUS)) ) {
                        alt217=1;
                    }


                }
                else if ( ((LA217_0>=PLUS && LA217_0<=MINUS)) ) {
                    alt217=1;
                }


                switch (alt217) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:682:25: ( NL )? ( PLUS | MINUS ) ( NL )? p_arith_uminus_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:682:27: ( NL )?
            	    int alt215=2;
            	    int LA215_0 = input.LA(1);

            	    if ( (LA215_0==NL) ) {
            	        alt215=1;
            	    }
            	    switch (alt215) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:682:27: NL
            	            {
            	            NL480=(Token)match(input,NL,FOLLOW_NL_in_p_arith_plus_expr4663); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    set481=(Token)input.LT(1);
            	    set481=(Token)input.LT(1);
            	    if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set481), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:682:48: ( NL )?
            	    int alt216=2;
            	    int LA216_0 = input.LA(1);

            	    if ( (LA216_0==NL) ) {
            	        alt216=1;
            	    }
            	    switch (alt216) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:682:48: NL
            	            {
            	            NL482=(Token)match(input,NL,FOLLOW_NL_in_p_arith_plus_expr4676); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_arith_uminus_expr_in_p_arith_plus_expr4680);
            	    p_arith_uminus_expr483=p_arith_uminus_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_arith_uminus_expr483.getTree());

            	    }
            	    break;

            	default :
            	    break loop217;
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:684:1: arith_uminus_expr : ( MINUS ( NL )? arith_mult_expr -> ^( UMINUS arith_mult_expr ) | arith_mult_expr );
    public final babel17Parser.arith_uminus_expr_return arith_uminus_expr() throws RecognitionException {
        babel17Parser.arith_uminus_expr_return retval = new babel17Parser.arith_uminus_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token MINUS484=null;
        Token NL485=null;
        babel17Parser.arith_mult_expr_return arith_mult_expr486 = null;

        babel17Parser.arith_mult_expr_return arith_mult_expr487 = null;


        CommonTree MINUS484_tree=null;
        CommonTree NL485_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleSubtreeStream stream_arith_mult_expr=new RewriteRuleSubtreeStream(adaptor,"rule arith_mult_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:685:2: ( MINUS ( NL )? arith_mult_expr -> ^( UMINUS arith_mult_expr ) | arith_mult_expr )
            int alt219=2;
            int LA219_0 = input.LA(1);

            if ( (LA219_0==MINUS) ) {
                alt219=1;
            }
            else if ( (LA219_0==L_begin||(LA219_0>=L_with && LA219_0<=L_if)||(LA219_0>=L_while && LA219_0<=L_for)||LA219_0==L_match||LA219_0==L_try||(LA219_0>=A_infinity && LA219_0<=U_infinity)||(LA219_0>=L_true && LA219_0<=L_this)||LA219_0==L_nil||(LA219_0>=Constr && LA219_0<=Num)||(LA219_0>=String && LA219_0<=ROUND_BRACKET_OPEN)||LA219_0==SQUARE_BRACKET_OPEN||LA219_0==CURLY_BRACKET_OPEN) ) {
                alt219=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 219, 0, input);

                throw nvae;
            }
            switch (alt219) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:685:4: MINUS ( NL )? arith_mult_expr
                    {
                    MINUS484=(Token)match(input,MINUS,FOLLOW_MINUS_in_arith_uminus_expr4693); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(MINUS484);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:685:10: ( NL )?
                    int alt218=2;
                    int LA218_0 = input.LA(1);

                    if ( (LA218_0==NL) ) {
                        alt218=1;
                    }
                    switch (alt218) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:685:10: NL
                            {
                            NL485=(Token)match(input,NL,FOLLOW_NL_in_arith_uminus_expr4695); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL485);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_arith_mult_expr_in_arith_uminus_expr4698);
                    arith_mult_expr486=arith_mult_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_arith_mult_expr.add(arith_mult_expr486.getTree());


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
                    // 685:30: -> ^( UMINUS arith_mult_expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:685:33: ^( UMINUS arith_mult_expr )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:686:4: arith_mult_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_arith_mult_expr_in_arith_uminus_expr4711);
                    arith_mult_expr487=arith_mult_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arith_mult_expr487.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:688:1: p_arith_uminus_expr : ( MINUS ( NL )? p_arith_mult_expr -> ^( UMINUS p_arith_mult_expr ) | p_arith_mult_expr );
    public final babel17Parser.p_arith_uminus_expr_return p_arith_uminus_expr() throws RecognitionException {
        babel17Parser.p_arith_uminus_expr_return retval = new babel17Parser.p_arith_uminus_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token MINUS488=null;
        Token NL489=null;
        babel17Parser.p_arith_mult_expr_return p_arith_mult_expr490 = null;

        babel17Parser.p_arith_mult_expr_return p_arith_mult_expr491 = null;


        CommonTree MINUS488_tree=null;
        CommonTree NL489_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleSubtreeStream stream_p_arith_mult_expr=new RewriteRuleSubtreeStream(adaptor,"rule p_arith_mult_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:689:2: ( MINUS ( NL )? p_arith_mult_expr -> ^( UMINUS p_arith_mult_expr ) | p_arith_mult_expr )
            int alt221=2;
            int LA221_0 = input.LA(1);

            if ( (LA221_0==MINUS) ) {
                alt221=1;
            }
            else if ( (LA221_0==L_begin||(LA221_0>=L_with && LA221_0<=L_if)||(LA221_0>=L_while && LA221_0<=L_for)||LA221_0==L_match||LA221_0==L_try||(LA221_0>=A_infinity && LA221_0<=U_infinity)||(LA221_0>=L_true && LA221_0<=L_this)||LA221_0==L_nil||(LA221_0>=Constr && LA221_0<=Num)||(LA221_0>=String && LA221_0<=ROUND_BRACKET_OPEN)||LA221_0==SQUARE_BRACKET_OPEN||LA221_0==CURLY_BRACKET_OPEN) ) {
                alt221=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 221, 0, input);

                throw nvae;
            }
            switch (alt221) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:689:4: MINUS ( NL )? p_arith_mult_expr
                    {
                    MINUS488=(Token)match(input,MINUS,FOLLOW_MINUS_in_p_arith_uminus_expr4722); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(MINUS488);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:689:10: ( NL )?
                    int alt220=2;
                    int LA220_0 = input.LA(1);

                    if ( (LA220_0==NL) ) {
                        alt220=1;
                    }
                    switch (alt220) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:689:10: NL
                            {
                            NL489=(Token)match(input,NL,FOLLOW_NL_in_p_arith_uminus_expr4724); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL489);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_p_arith_mult_expr_in_p_arith_uminus_expr4727);
                    p_arith_mult_expr490=p_arith_mult_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_p_arith_mult_expr.add(p_arith_mult_expr490.getTree());


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
                    // 689:32: -> ^( UMINUS p_arith_mult_expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:689:35: ^( UMINUS p_arith_mult_expr )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:690:4: p_arith_mult_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_p_arith_mult_expr_in_p_arith_uminus_expr4740);
                    p_arith_mult_expr491=p_arith_mult_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_arith_mult_expr491.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:692:1: arith_mult_expr : arith_pow_expr ( ( NL )? ( TIMES | QUOTIENT | L_div | L_mod ) ( NL )? arith_pow_expr )* ;
    public final babel17Parser.arith_mult_expr_return arith_mult_expr() throws RecognitionException {
        babel17Parser.arith_mult_expr_return retval = new babel17Parser.arith_mult_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL493=null;
        Token set494=null;
        Token NL495=null;
        babel17Parser.arith_pow_expr_return arith_pow_expr492 = null;

        babel17Parser.arith_pow_expr_return arith_pow_expr496 = null;


        CommonTree NL493_tree=null;
        CommonTree set494_tree=null;
        CommonTree NL495_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:693:2: ( arith_pow_expr ( ( NL )? ( TIMES | QUOTIENT | L_div | L_mod ) ( NL )? arith_pow_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:693:4: arith_pow_expr ( ( NL )? ( TIMES | QUOTIENT | L_div | L_mod ) ( NL )? arith_pow_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_arith_pow_expr_in_arith_mult_expr4749);
            arith_pow_expr492=arith_pow_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, arith_pow_expr492.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:693:19: ( ( NL )? ( TIMES | QUOTIENT | L_div | L_mod ) ( NL )? arith_pow_expr )*
            loop224:
            do {
                int alt224=2;
                int LA224_0 = input.LA(1);

                if ( (LA224_0==NL) ) {
                    int LA224_1 = input.LA(2);

                    if ( ((LA224_1>=L_div && LA224_1<=L_mod)||(LA224_1>=TIMES && LA224_1<=QUOTIENT)) ) {
                        alt224=1;
                    }


                }
                else if ( ((LA224_0>=L_div && LA224_0<=L_mod)||(LA224_0>=TIMES && LA224_0<=QUOTIENT)) ) {
                    alt224=1;
                }


                switch (alt224) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:693:20: ( NL )? ( TIMES | QUOTIENT | L_div | L_mod ) ( NL )? arith_pow_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:693:22: ( NL )?
            	    int alt222=2;
            	    int LA222_0 = input.LA(1);

            	    if ( (LA222_0==NL) ) {
            	        alt222=1;
            	    }
            	    switch (alt222) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:693:22: NL
            	            {
            	            NL493=(Token)match(input,NL,FOLLOW_NL_in_arith_mult_expr4752); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    set494=(Token)input.LT(1);
            	    set494=(Token)input.LT(1);
            	    if ( (input.LA(1)>=L_div && input.LA(1)<=L_mod)||(input.LA(1)>=TIMES && input.LA(1)<=QUOTIENT) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set494), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:693:63: ( NL )?
            	    int alt223=2;
            	    int LA223_0 = input.LA(1);

            	    if ( (LA223_0==NL) ) {
            	        alt223=1;
            	    }
            	    switch (alt223) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:693:63: NL
            	            {
            	            NL495=(Token)match(input,NL,FOLLOW_NL_in_arith_mult_expr4773); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_arith_pow_expr_in_arith_mult_expr4777);
            	    arith_pow_expr496=arith_pow_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, arith_pow_expr496.getTree());

            	    }
            	    break;

            	default :
            	    break loop224;
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:695:1: p_arith_mult_expr : p_arith_pow_expr ( ( NL )? ( TIMES | QUOTIENT | L_div | L_mod ) ( NL )? p_arith_pow_expr )* ;
    public final babel17Parser.p_arith_mult_expr_return p_arith_mult_expr() throws RecognitionException {
        babel17Parser.p_arith_mult_expr_return retval = new babel17Parser.p_arith_mult_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL498=null;
        Token set499=null;
        Token NL500=null;
        babel17Parser.p_arith_pow_expr_return p_arith_pow_expr497 = null;

        babel17Parser.p_arith_pow_expr_return p_arith_pow_expr501 = null;


        CommonTree NL498_tree=null;
        CommonTree set499_tree=null;
        CommonTree NL500_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:696:2: ( p_arith_pow_expr ( ( NL )? ( TIMES | QUOTIENT | L_div | L_mod ) ( NL )? p_arith_pow_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:696:4: p_arith_pow_expr ( ( NL )? ( TIMES | QUOTIENT | L_div | L_mod ) ( NL )? p_arith_pow_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_arith_pow_expr_in_p_arith_mult_expr4789);
            p_arith_pow_expr497=p_arith_pow_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_arith_pow_expr497.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:696:21: ( ( NL )? ( TIMES | QUOTIENT | L_div | L_mod ) ( NL )? p_arith_pow_expr )*
            loop227:
            do {
                int alt227=2;
                int LA227_0 = input.LA(1);

                if ( (LA227_0==NL) ) {
                    int LA227_1 = input.LA(2);

                    if ( ((LA227_1>=L_div && LA227_1<=L_mod)||(LA227_1>=TIMES && LA227_1<=QUOTIENT)) ) {
                        alt227=1;
                    }


                }
                else if ( ((LA227_0>=L_div && LA227_0<=L_mod)||(LA227_0>=TIMES && LA227_0<=QUOTIENT)) ) {
                    alt227=1;
                }


                switch (alt227) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:696:22: ( NL )? ( TIMES | QUOTIENT | L_div | L_mod ) ( NL )? p_arith_pow_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:696:24: ( NL )?
            	    int alt225=2;
            	    int LA225_0 = input.LA(1);

            	    if ( (LA225_0==NL) ) {
            	        alt225=1;
            	    }
            	    switch (alt225) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:696:24: NL
            	            {
            	            NL498=(Token)match(input,NL,FOLLOW_NL_in_p_arith_mult_expr4792); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    set499=(Token)input.LT(1);
            	    set499=(Token)input.LT(1);
            	    if ( (input.LA(1)>=L_div && input.LA(1)<=L_mod)||(input.LA(1)>=TIMES && input.LA(1)<=QUOTIENT) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set499), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:696:65: ( NL )?
            	    int alt226=2;
            	    int LA226_0 = input.LA(1);

            	    if ( (LA226_0==NL) ) {
            	        alt226=1;
            	    }
            	    switch (alt226) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:696:65: NL
            	            {
            	            NL500=(Token)match(input,NL,FOLLOW_NL_in_p_arith_mult_expr4813); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_arith_pow_expr_in_p_arith_mult_expr4817);
            	    p_arith_pow_expr501=p_arith_pow_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_arith_pow_expr501.getTree());

            	    }
            	    break;

            	default :
            	    break loop227;
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:698:1: arith_pow_expr : apply_expr ( ( NL )? POW_tok ( NL )? apply_expr )* -> ^( POW ( apply_expr )* ) ;
    public final babel17Parser.arith_pow_expr_return arith_pow_expr() throws RecognitionException {
        babel17Parser.arith_pow_expr_return retval = new babel17Parser.arith_pow_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL503=null;
        Token POW_tok504=null;
        Token NL505=null;
        babel17Parser.apply_expr_return apply_expr502 = null;

        babel17Parser.apply_expr_return apply_expr506 = null;


        CommonTree NL503_tree=null;
        CommonTree POW_tok504_tree=null;
        CommonTree NL505_tree=null;
        RewriteRuleTokenStream stream_POW_tok=new RewriteRuleTokenStream(adaptor,"token POW_tok");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_apply_expr=new RewriteRuleSubtreeStream(adaptor,"rule apply_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:699:2: ( apply_expr ( ( NL )? POW_tok ( NL )? apply_expr )* -> ^( POW ( apply_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:699:4: apply_expr ( ( NL )? POW_tok ( NL )? apply_expr )*
            {
            pushFollow(FOLLOW_apply_expr_in_arith_pow_expr4828);
            apply_expr502=apply_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_apply_expr.add(apply_expr502.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:699:15: ( ( NL )? POW_tok ( NL )? apply_expr )*
            loop230:
            do {
                int alt230=2;
                int LA230_0 = input.LA(1);

                if ( (LA230_0==NL) ) {
                    int LA230_1 = input.LA(2);

                    if ( (LA230_1==POW_tok) ) {
                        alt230=1;
                    }


                }
                else if ( (LA230_0==POW_tok) ) {
                    alt230=1;
                }


                switch (alt230) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:699:16: ( NL )? POW_tok ( NL )? apply_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:699:16: ( NL )?
            	    int alt228=2;
            	    int LA228_0 = input.LA(1);

            	    if ( (LA228_0==NL) ) {
            	        alt228=1;
            	    }
            	    switch (alt228) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:699:16: NL
            	            {
            	            NL503=(Token)match(input,NL,FOLLOW_NL_in_arith_pow_expr4831); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL503);


            	            }
            	            break;

            	    }

            	    POW_tok504=(Token)match(input,POW_tok,FOLLOW_POW_tok_in_arith_pow_expr4834); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_POW_tok.add(POW_tok504);

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:699:28: ( NL )?
            	    int alt229=2;
            	    int LA229_0 = input.LA(1);

            	    if ( (LA229_0==NL) ) {
            	        alt229=1;
            	    }
            	    switch (alt229) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:699:28: NL
            	            {
            	            NL505=(Token)match(input,NL,FOLLOW_NL_in_arith_pow_expr4836); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL505);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_apply_expr_in_arith_pow_expr4839);
            	    apply_expr506=apply_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_apply_expr.add(apply_expr506.getTree());

            	    }
            	    break;

            	default :
            	    break loop230;
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
            // 699:45: -> ^( POW ( apply_expr )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:699:48: ^( POW ( apply_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(POW, "POW"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:699:54: ( apply_expr )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:701:1: p_arith_pow_expr : p_apply_expr ( ( NL )? POW_tok ( NL )? p_apply_expr )* -> ^( POW ( p_apply_expr )* ) ;
    public final babel17Parser.p_arith_pow_expr_return p_arith_pow_expr() throws RecognitionException {
        babel17Parser.p_arith_pow_expr_return retval = new babel17Parser.p_arith_pow_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL508=null;
        Token POW_tok509=null;
        Token NL510=null;
        babel17Parser.p_apply_expr_return p_apply_expr507 = null;

        babel17Parser.p_apply_expr_return p_apply_expr511 = null;


        CommonTree NL508_tree=null;
        CommonTree POW_tok509_tree=null;
        CommonTree NL510_tree=null;
        RewriteRuleTokenStream stream_POW_tok=new RewriteRuleTokenStream(adaptor,"token POW_tok");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_p_apply_expr=new RewriteRuleSubtreeStream(adaptor,"rule p_apply_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:702:2: ( p_apply_expr ( ( NL )? POW_tok ( NL )? p_apply_expr )* -> ^( POW ( p_apply_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:702:4: p_apply_expr ( ( NL )? POW_tok ( NL )? p_apply_expr )*
            {
            pushFollow(FOLLOW_p_apply_expr_in_p_arith_pow_expr4860);
            p_apply_expr507=p_apply_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_p_apply_expr.add(p_apply_expr507.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:702:17: ( ( NL )? POW_tok ( NL )? p_apply_expr )*
            loop233:
            do {
                int alt233=2;
                int LA233_0 = input.LA(1);

                if ( (LA233_0==NL) ) {
                    int LA233_1 = input.LA(2);

                    if ( (LA233_1==POW_tok) ) {
                        alt233=1;
                    }


                }
                else if ( (LA233_0==POW_tok) ) {
                    alt233=1;
                }


                switch (alt233) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:702:18: ( NL )? POW_tok ( NL )? p_apply_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:702:18: ( NL )?
            	    int alt231=2;
            	    int LA231_0 = input.LA(1);

            	    if ( (LA231_0==NL) ) {
            	        alt231=1;
            	    }
            	    switch (alt231) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:702:18: NL
            	            {
            	            NL508=(Token)match(input,NL,FOLLOW_NL_in_p_arith_pow_expr4863); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL508);


            	            }
            	            break;

            	    }

            	    POW_tok509=(Token)match(input,POW_tok,FOLLOW_POW_tok_in_p_arith_pow_expr4866); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_POW_tok.add(POW_tok509);

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:702:30: ( NL )?
            	    int alt232=2;
            	    int LA232_0 = input.LA(1);

            	    if ( (LA232_0==NL) ) {
            	        alt232=1;
            	    }
            	    switch (alt232) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:702:30: NL
            	            {
            	            NL510=(Token)match(input,NL,FOLLOW_NL_in_p_arith_pow_expr4868); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL510);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_apply_expr_in_p_arith_pow_expr4871);
            	    p_apply_expr511=p_apply_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_p_apply_expr.add(p_apply_expr511.getTree());

            	    }
            	    break;

            	default :
            	    break loop233;
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
            // 702:49: -> ^( POW ( p_apply_expr )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:702:52: ^( POW ( p_apply_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(POW, "POW"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:702:58: ( p_apply_expr )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:704:1: apply_expr : ( basic_expr )+ -> ^( APPLY ( basic_expr )* ) ;
    public final babel17Parser.apply_expr_return apply_expr() throws RecognitionException {
        babel17Parser.apply_expr_return retval = new babel17Parser.apply_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.basic_expr_return basic_expr512 = null;


        RewriteRuleSubtreeStream stream_basic_expr=new RewriteRuleSubtreeStream(adaptor,"rule basic_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:705:2: ( ( basic_expr )+ -> ^( APPLY ( basic_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:705:4: ( basic_expr )+
            {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:705:4: ( basic_expr )+
            int cnt234=0;
            loop234:
            do {
                int alt234=2;
                int LA234_0 = input.LA(1);

                if ( (LA234_0==L_begin||(LA234_0>=L_with && LA234_0<=L_if)||(LA234_0>=L_while && LA234_0<=L_for)||LA234_0==L_match||LA234_0==L_try||(LA234_0>=A_infinity && LA234_0<=U_infinity)||(LA234_0>=L_true && LA234_0<=L_this)||LA234_0==L_nil||(LA234_0>=Constr && LA234_0<=Num)||(LA234_0>=String && LA234_0<=ROUND_BRACKET_OPEN)||LA234_0==SQUARE_BRACKET_OPEN||LA234_0==CURLY_BRACKET_OPEN) ) {
                    alt234=1;
                }


                switch (alt234) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:705:4: basic_expr
            	    {
            	    pushFollow(FOLLOW_basic_expr_in_apply_expr4892);
            	    basic_expr512=basic_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_basic_expr.add(basic_expr512.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt234 >= 1 ) break loop234;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(234, input);
                        throw eee;
                }
                cnt234++;
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
            // 705:16: -> ^( APPLY ( basic_expr )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:705:19: ^( APPLY ( basic_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(APPLY, "APPLY"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:705:27: ( basic_expr )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:706:1: p_apply_expr : p_basic_expr ( ( NL )? p_basic_expr )* -> ^( APPLY ( p_basic_expr )* ) ;
    public final babel17Parser.p_apply_expr_return p_apply_expr() throws RecognitionException {
        babel17Parser.p_apply_expr_return retval = new babel17Parser.p_apply_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL514=null;
        babel17Parser.p_basic_expr_return p_basic_expr513 = null;

        babel17Parser.p_basic_expr_return p_basic_expr515 = null;


        CommonTree NL514_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_p_basic_expr=new RewriteRuleSubtreeStream(adaptor,"rule p_basic_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:707:2: ( p_basic_expr ( ( NL )? p_basic_expr )* -> ^( APPLY ( p_basic_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:707:4: p_basic_expr ( ( NL )? p_basic_expr )*
            {
            pushFollow(FOLLOW_p_basic_expr_in_p_apply_expr4910);
            p_basic_expr513=p_basic_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_p_basic_expr.add(p_basic_expr513.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:707:17: ( ( NL )? p_basic_expr )*
            loop236:
            do {
                int alt236=2;
                int LA236_0 = input.LA(1);

                if ( (LA236_0==NL) ) {
                    int LA236_1 = input.LA(2);

                    if ( (LA236_1==L_begin||(LA236_1>=L_with && LA236_1<=L_if)||(LA236_1>=L_while && LA236_1<=L_for)||LA236_1==L_match||LA236_1==L_try||(LA236_1>=A_infinity && LA236_1<=U_infinity)||(LA236_1>=L_true && LA236_1<=L_this)||LA236_1==L_nil||(LA236_1>=Constr && LA236_1<=Num)||(LA236_1>=String && LA236_1<=ROUND_BRACKET_OPEN)||LA236_1==SQUARE_BRACKET_OPEN||LA236_1==CURLY_BRACKET_OPEN) ) {
                        alt236=1;
                    }


                }
                else if ( (LA236_0==L_begin||(LA236_0>=L_with && LA236_0<=L_if)||(LA236_0>=L_while && LA236_0<=L_for)||LA236_0==L_match||LA236_0==L_try||(LA236_0>=A_infinity && LA236_0<=U_infinity)||(LA236_0>=L_true && LA236_0<=L_this)||LA236_0==L_nil||(LA236_0>=Constr && LA236_0<=Num)||(LA236_0>=String && LA236_0<=ROUND_BRACKET_OPEN)||LA236_0==SQUARE_BRACKET_OPEN||LA236_0==CURLY_BRACKET_OPEN) ) {
                    alt236=1;
                }


                switch (alt236) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:707:18: ( NL )? p_basic_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:707:18: ( NL )?
            	    int alt235=2;
            	    int LA235_0 = input.LA(1);

            	    if ( (LA235_0==NL) ) {
            	        alt235=1;
            	    }
            	    switch (alt235) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:707:18: NL
            	            {
            	            NL514=(Token)match(input,NL,FOLLOW_NL_in_p_apply_expr4913); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL514);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_basic_expr_in_p_apply_expr4916);
            	    p_basic_expr515=p_basic_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_p_basic_expr.add(p_basic_expr515.getTree());

            	    }
            	    break;

            	default :
            	    break loop236;
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
            // 707:37: -> ^( APPLY ( p_basic_expr )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:707:40: ^( APPLY ( p_basic_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(APPLY, "APPLY"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:707:48: ( p_basic_expr )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:709:1: basic_expr : message_send_expr ;
    public final babel17Parser.basic_expr_return basic_expr() throws RecognitionException {
        babel17Parser.basic_expr_return retval = new babel17Parser.basic_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.message_send_expr_return message_send_expr516 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:710:2: ( message_send_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:710:4: message_send_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_message_send_expr_in_basic_expr4936);
            message_send_expr516=message_send_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, message_send_expr516.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:712:1: p_basic_expr : message_send_expr ;
    public final babel17Parser.p_basic_expr_return p_basic_expr() throws RecognitionException {
        babel17Parser.p_basic_expr_return retval = new babel17Parser.p_basic_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.message_send_expr_return message_send_expr517 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:713:2: ( message_send_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:713:4: message_send_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_message_send_expr_in_p_basic_expr4945);
            message_send_expr517=message_send_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, message_send_expr517.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:715:1: message_send_expr : primitive_expr ( ( NL )? PERIOD ( NL )? Id )* -> ^( MESSAGE_SEND primitive_expr ( Id )* ) ;
    public final babel17Parser.message_send_expr_return message_send_expr() throws RecognitionException {
        babel17Parser.message_send_expr_return retval = new babel17Parser.message_send_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL519=null;
        Token PERIOD520=null;
        Token NL521=null;
        Token Id522=null;
        babel17Parser.primitive_expr_return primitive_expr518 = null;


        CommonTree NL519_tree=null;
        CommonTree PERIOD520_tree=null;
        CommonTree NL521_tree=null;
        CommonTree Id522_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
        RewriteRuleTokenStream stream_Id=new RewriteRuleTokenStream(adaptor,"token Id");
        RewriteRuleSubtreeStream stream_primitive_expr=new RewriteRuleSubtreeStream(adaptor,"rule primitive_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:716:2: ( primitive_expr ( ( NL )? PERIOD ( NL )? Id )* -> ^( MESSAGE_SEND primitive_expr ( Id )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:716:4: primitive_expr ( ( NL )? PERIOD ( NL )? Id )*
            {
            pushFollow(FOLLOW_primitive_expr_in_message_send_expr4954);
            primitive_expr518=primitive_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_primitive_expr.add(primitive_expr518.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:716:19: ( ( NL )? PERIOD ( NL )? Id )*
            loop239:
            do {
                int alt239=2;
                int LA239_0 = input.LA(1);

                if ( (LA239_0==NL) ) {
                    int LA239_1 = input.LA(2);

                    if ( (LA239_1==PERIOD) ) {
                        alt239=1;
                    }


                }
                else if ( (LA239_0==PERIOD) ) {
                    alt239=1;
                }


                switch (alt239) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:716:20: ( NL )? PERIOD ( NL )? Id
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:716:20: ( NL )?
            	    int alt237=2;
            	    int LA237_0 = input.LA(1);

            	    if ( (LA237_0==NL) ) {
            	        alt237=1;
            	    }
            	    switch (alt237) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:716:20: NL
            	            {
            	            NL519=(Token)match(input,NL,FOLLOW_NL_in_message_send_expr4957); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL519);


            	            }
            	            break;

            	    }

            	    PERIOD520=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_message_send_expr4960); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD520);

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:716:31: ( NL )?
            	    int alt238=2;
            	    int LA238_0 = input.LA(1);

            	    if ( (LA238_0==NL) ) {
            	        alt238=1;
            	    }
            	    switch (alt238) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:716:31: NL
            	            {
            	            NL521=(Token)match(input,NL,FOLLOW_NL_in_message_send_expr4962); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL521);


            	            }
            	            break;

            	    }

            	    Id522=(Token)match(input,Id,FOLLOW_Id_in_message_send_expr4965); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_Id.add(Id522);


            	    }
            	    break;

            	default :
            	    break loop239;
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
            // 716:40: -> ^( MESSAGE_SEND primitive_expr ( Id )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:716:43: ^( MESSAGE_SEND primitive_expr ( Id )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MESSAGE_SEND, "MESSAGE_SEND"), root_1);

                adaptor.addChild(root_1, stream_primitive_expr.nextTree());
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:716:73: ( Id )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:718:1: list_expr : ( '[' ( NL )? ( protected_expr_nc ( ( NL )? COMMA ( NL )? protected_expr_nc )* ( NL )? )? ']' -> ^( SQUARE_LIST ( protected_expr_nc )* ) | '(' ( NL )? ( protected_expr_nc ( ( NL )? COMMA ( NL )? protected_expr_nc )* ( NL )? ( COMMA ( NL )? )? )? ')' -> ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( protected_expr_nc )* ) ) );
    public final babel17Parser.list_expr_return list_expr() throws RecognitionException {
        babel17Parser.list_expr_return retval = new babel17Parser.list_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal523=null;
        Token NL524=null;
        Token NL526=null;
        Token COMMA527=null;
        Token NL528=null;
        Token NL530=null;
        Token char_literal531=null;
        Token char_literal532=null;
        Token NL533=null;
        Token NL535=null;
        Token COMMA536=null;
        Token NL537=null;
        Token NL539=null;
        Token COMMA540=null;
        Token NL541=null;
        Token char_literal542=null;
        babel17Parser.protected_expr_nc_return protected_expr_nc525 = null;

        babel17Parser.protected_expr_nc_return protected_expr_nc529 = null;

        babel17Parser.protected_expr_nc_return protected_expr_nc534 = null;

        babel17Parser.protected_expr_nc_return protected_expr_nc538 = null;


        CommonTree char_literal523_tree=null;
        CommonTree NL524_tree=null;
        CommonTree NL526_tree=null;
        CommonTree COMMA527_tree=null;
        CommonTree NL528_tree=null;
        CommonTree NL530_tree=null;
        CommonTree char_literal531_tree=null;
        CommonTree char_literal532_tree=null;
        CommonTree NL533_tree=null;
        CommonTree NL535_tree=null;
        CommonTree COMMA536_tree=null;
        CommonTree NL537_tree=null;
        CommonTree NL539_tree=null;
        CommonTree COMMA540_tree=null;
        CommonTree NL541_tree=null;
        CommonTree char_literal542_tree=null;
        RewriteRuleTokenStream stream_ROUND_BRACKET_OPEN=new RewriteRuleTokenStream(adaptor,"token ROUND_BRACKET_OPEN");
        RewriteRuleTokenStream stream_SQUARE_BRACKET_CLOSE=new RewriteRuleTokenStream(adaptor,"token SQUARE_BRACKET_CLOSE");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_ROUND_BRACKET_CLOSE=new RewriteRuleTokenStream(adaptor,"token ROUND_BRACKET_CLOSE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_SQUARE_BRACKET_OPEN=new RewriteRuleTokenStream(adaptor,"token SQUARE_BRACKET_OPEN");
        RewriteRuleSubtreeStream stream_protected_expr_nc=new RewriteRuleSubtreeStream(adaptor,"rule protected_expr_nc");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:719:2: ( '[' ( NL )? ( protected_expr_nc ( ( NL )? COMMA ( NL )? protected_expr_nc )* ( NL )? )? ']' -> ^( SQUARE_LIST ( protected_expr_nc )* ) | '(' ( NL )? ( protected_expr_nc ( ( NL )? COMMA ( NL )? protected_expr_nc )* ( NL )? ( COMMA ( NL )? )? )? ')' -> ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( protected_expr_nc )* ) ) )
            int alt254=2;
            int LA254_0 = input.LA(1);

            if ( (LA254_0==SQUARE_BRACKET_OPEN) ) {
                alt254=1;
            }
            else if ( (LA254_0==ROUND_BRACKET_OPEN) ) {
                alt254=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 254, 0, input);

                throw nvae;
            }
            switch (alt254) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:719:4: '[' ( NL )? ( protected_expr_nc ( ( NL )? COMMA ( NL )? protected_expr_nc )* ( NL )? )? ']'
                    {
                    char_literal523=(Token)match(input,SQUARE_BRACKET_OPEN,FOLLOW_SQUARE_BRACKET_OPEN_in_list_expr4989); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SQUARE_BRACKET_OPEN.add(char_literal523);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:719:8: ( NL )?
                    int alt240=2;
                    int LA240_0 = input.LA(1);

                    if ( (LA240_0==NL) ) {
                        alt240=1;
                    }
                    switch (alt240) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:719:8: NL
                            {
                            NL524=(Token)match(input,NL,FOLLOW_NL_in_list_expr4991); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL524);


                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:719:12: ( protected_expr_nc ( ( NL )? COMMA ( NL )? protected_expr_nc )* ( NL )? )?
                    int alt245=2;
                    int LA245_0 = input.LA(1);

                    if ( (LA245_0==L_begin||(LA245_0>=L_obj && LA245_0<=L_if)||(LA245_0>=L_while && LA245_0<=L_for)||LA245_0==L_match||LA245_0==L_exception||LA245_0==L_try||(LA245_0>=A_infinity && LA245_0<=L_lazy)||(LA245_0>=L_true && LA245_0<=L_nil)||LA245_0==L_typeof||LA245_0==MINUS||LA245_0==A_NOT||LA245_0==U_NOT||(LA245_0>=A_ELLIPSIS && LA245_0<=U_ELLIPSIS)||LA245_0==L_force||(LA245_0>=Constr && LA245_0<=Num)||(LA245_0>=String && LA245_0<=ROUND_BRACKET_OPEN)||LA245_0==SQUARE_BRACKET_OPEN||LA245_0==CURLY_BRACKET_OPEN||LA245_0==UNDERSCORE) ) {
                        alt245=1;
                    }
                    switch (alt245) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:719:13: protected_expr_nc ( ( NL )? COMMA ( NL )? protected_expr_nc )* ( NL )?
                            {
                            pushFollow(FOLLOW_protected_expr_nc_in_list_expr4995);
                            protected_expr_nc525=protected_expr_nc();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_protected_expr_nc.add(protected_expr_nc525.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:719:31: ( ( NL )? COMMA ( NL )? protected_expr_nc )*
                            loop243:
                            do {
                                int alt243=2;
                                int LA243_0 = input.LA(1);

                                if ( (LA243_0==NL) ) {
                                    int LA243_1 = input.LA(2);

                                    if ( (LA243_1==COMMA) ) {
                                        alt243=1;
                                    }


                                }
                                else if ( (LA243_0==COMMA) ) {
                                    alt243=1;
                                }


                                switch (alt243) {
                            	case 1 :
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:719:32: ( NL )? COMMA ( NL )? protected_expr_nc
                            	    {
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:719:32: ( NL )?
                            	    int alt241=2;
                            	    int LA241_0 = input.LA(1);

                            	    if ( (LA241_0==NL) ) {
                            	        alt241=1;
                            	    }
                            	    switch (alt241) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:719:32: NL
                            	            {
                            	            NL526=(Token)match(input,NL,FOLLOW_NL_in_list_expr4998); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL526);


                            	            }
                            	            break;

                            	    }

                            	    COMMA527=(Token)match(input,COMMA,FOLLOW_COMMA_in_list_expr5001); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA527);

                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:719:42: ( NL )?
                            	    int alt242=2;
                            	    int LA242_0 = input.LA(1);

                            	    if ( (LA242_0==NL) ) {
                            	        alt242=1;
                            	    }
                            	    switch (alt242) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:719:42: NL
                            	            {
                            	            NL528=(Token)match(input,NL,FOLLOW_NL_in_list_expr5003); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL528);


                            	            }
                            	            break;

                            	    }

                            	    pushFollow(FOLLOW_protected_expr_nc_in_list_expr5006);
                            	    protected_expr_nc529=protected_expr_nc();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_protected_expr_nc.add(protected_expr_nc529.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop243;
                                }
                            } while (true);

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:719:66: ( NL )?
                            int alt244=2;
                            int LA244_0 = input.LA(1);

                            if ( (LA244_0==NL) ) {
                                alt244=1;
                            }
                            switch (alt244) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:719:66: NL
                                    {
                                    NL530=(Token)match(input,NL,FOLLOW_NL_in_list_expr5010); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL530);


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    char_literal531=(Token)match(input,SQUARE_BRACKET_CLOSE,FOLLOW_SQUARE_BRACKET_CLOSE_in_list_expr5015); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SQUARE_BRACKET_CLOSE.add(char_literal531);



                    // AST REWRITE
                    // elements: protected_expr_nc
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 719:76: -> ^( SQUARE_LIST ( protected_expr_nc )* )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:719:79: ^( SQUARE_LIST ( protected_expr_nc )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SQUARE_LIST, "SQUARE_LIST"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:719:93: ( protected_expr_nc )*
                        while ( stream_protected_expr_nc.hasNext() ) {
                            adaptor.addChild(root_1, stream_protected_expr_nc.nextTree());

                        }
                        stream_protected_expr_nc.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:720:4: '(' ( NL )? ( protected_expr_nc ( ( NL )? COMMA ( NL )? protected_expr_nc )* ( NL )? ( COMMA ( NL )? )? )? ')'
                    {
                    char_literal532=(Token)match(input,ROUND_BRACKET_OPEN,FOLLOW_ROUND_BRACKET_OPEN_in_list_expr5029); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ROUND_BRACKET_OPEN.add(char_literal532);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:720:8: ( NL )?
                    int alt246=2;
                    int LA246_0 = input.LA(1);

                    if ( (LA246_0==NL) ) {
                        alt246=1;
                    }
                    switch (alt246) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:720:8: NL
                            {
                            NL533=(Token)match(input,NL,FOLLOW_NL_in_list_expr5031); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL533);


                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:720:12: ( protected_expr_nc ( ( NL )? COMMA ( NL )? protected_expr_nc )* ( NL )? ( COMMA ( NL )? )? )?
                    int alt253=2;
                    int LA253_0 = input.LA(1);

                    if ( (LA253_0==L_begin||(LA253_0>=L_obj && LA253_0<=L_if)||(LA253_0>=L_while && LA253_0<=L_for)||LA253_0==L_match||LA253_0==L_exception||LA253_0==L_try||(LA253_0>=A_infinity && LA253_0<=L_lazy)||(LA253_0>=L_true && LA253_0<=L_nil)||LA253_0==L_typeof||LA253_0==MINUS||LA253_0==A_NOT||LA253_0==U_NOT||(LA253_0>=A_ELLIPSIS && LA253_0<=U_ELLIPSIS)||LA253_0==L_force||(LA253_0>=Constr && LA253_0<=Num)||(LA253_0>=String && LA253_0<=ROUND_BRACKET_OPEN)||LA253_0==SQUARE_BRACKET_OPEN||LA253_0==CURLY_BRACKET_OPEN||LA253_0==UNDERSCORE) ) {
                        alt253=1;
                    }
                    switch (alt253) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:720:13: protected_expr_nc ( ( NL )? COMMA ( NL )? protected_expr_nc )* ( NL )? ( COMMA ( NL )? )?
                            {
                            pushFollow(FOLLOW_protected_expr_nc_in_list_expr5035);
                            protected_expr_nc534=protected_expr_nc();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_protected_expr_nc.add(protected_expr_nc534.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:720:31: ( ( NL )? COMMA ( NL )? protected_expr_nc )*
                            loop249:
                            do {
                                int alt249=2;
                                int LA249_0 = input.LA(1);

                                if ( (LA249_0==NL) ) {
                                    int LA249_1 = input.LA(2);

                                    if ( (LA249_1==COMMA) ) {
                                        int LA249_2 = input.LA(3);

                                        if ( (LA249_2==NL) ) {
                                            int LA249_4 = input.LA(4);

                                            if ( (LA249_4==L_begin||(LA249_4>=L_obj && LA249_4<=L_if)||(LA249_4>=L_while && LA249_4<=L_for)||LA249_4==L_match||LA249_4==L_exception||LA249_4==L_try||(LA249_4>=A_infinity && LA249_4<=L_lazy)||(LA249_4>=L_true && LA249_4<=L_nil)||LA249_4==L_typeof||LA249_4==MINUS||LA249_4==A_NOT||LA249_4==U_NOT||(LA249_4>=A_ELLIPSIS && LA249_4<=U_ELLIPSIS)||LA249_4==L_force||(LA249_4>=Constr && LA249_4<=Num)||(LA249_4>=String && LA249_4<=ROUND_BRACKET_OPEN)||LA249_4==SQUARE_BRACKET_OPEN||LA249_4==CURLY_BRACKET_OPEN||LA249_4==UNDERSCORE) ) {
                                                alt249=1;
                                            }


                                        }
                                        else if ( (LA249_2==L_begin||(LA249_2>=L_obj && LA249_2<=L_if)||(LA249_2>=L_while && LA249_2<=L_for)||LA249_2==L_match||LA249_2==L_exception||LA249_2==L_try||(LA249_2>=A_infinity && LA249_2<=L_lazy)||(LA249_2>=L_true && LA249_2<=L_nil)||LA249_2==L_typeof||LA249_2==MINUS||LA249_2==A_NOT||LA249_2==U_NOT||(LA249_2>=A_ELLIPSIS && LA249_2<=U_ELLIPSIS)||LA249_2==L_force||(LA249_2>=Constr && LA249_2<=Num)||(LA249_2>=String && LA249_2<=ROUND_BRACKET_OPEN)||LA249_2==SQUARE_BRACKET_OPEN||LA249_2==CURLY_BRACKET_OPEN||LA249_2==UNDERSCORE) ) {
                                            alt249=1;
                                        }


                                    }


                                }
                                else if ( (LA249_0==COMMA) ) {
                                    int LA249_2 = input.LA(2);

                                    if ( (LA249_2==NL) ) {
                                        int LA249_4 = input.LA(3);

                                        if ( (LA249_4==L_begin||(LA249_4>=L_obj && LA249_4<=L_if)||(LA249_4>=L_while && LA249_4<=L_for)||LA249_4==L_match||LA249_4==L_exception||LA249_4==L_try||(LA249_4>=A_infinity && LA249_4<=L_lazy)||(LA249_4>=L_true && LA249_4<=L_nil)||LA249_4==L_typeof||LA249_4==MINUS||LA249_4==A_NOT||LA249_4==U_NOT||(LA249_4>=A_ELLIPSIS && LA249_4<=U_ELLIPSIS)||LA249_4==L_force||(LA249_4>=Constr && LA249_4<=Num)||(LA249_4>=String && LA249_4<=ROUND_BRACKET_OPEN)||LA249_4==SQUARE_BRACKET_OPEN||LA249_4==CURLY_BRACKET_OPEN||LA249_4==UNDERSCORE) ) {
                                            alt249=1;
                                        }


                                    }
                                    else if ( (LA249_2==L_begin||(LA249_2>=L_obj && LA249_2<=L_if)||(LA249_2>=L_while && LA249_2<=L_for)||LA249_2==L_match||LA249_2==L_exception||LA249_2==L_try||(LA249_2>=A_infinity && LA249_2<=L_lazy)||(LA249_2>=L_true && LA249_2<=L_nil)||LA249_2==L_typeof||LA249_2==MINUS||LA249_2==A_NOT||LA249_2==U_NOT||(LA249_2>=A_ELLIPSIS && LA249_2<=U_ELLIPSIS)||LA249_2==L_force||(LA249_2>=Constr && LA249_2<=Num)||(LA249_2>=String && LA249_2<=ROUND_BRACKET_OPEN)||LA249_2==SQUARE_BRACKET_OPEN||LA249_2==CURLY_BRACKET_OPEN||LA249_2==UNDERSCORE) ) {
                                        alt249=1;
                                    }


                                }


                                switch (alt249) {
                            	case 1 :
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:720:32: ( NL )? COMMA ( NL )? protected_expr_nc
                            	    {
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:720:32: ( NL )?
                            	    int alt247=2;
                            	    int LA247_0 = input.LA(1);

                            	    if ( (LA247_0==NL) ) {
                            	        alt247=1;
                            	    }
                            	    switch (alt247) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:720:32: NL
                            	            {
                            	            NL535=(Token)match(input,NL,FOLLOW_NL_in_list_expr5038); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL535);


                            	            }
                            	            break;

                            	    }

                            	    COMMA536=(Token)match(input,COMMA,FOLLOW_COMMA_in_list_expr5041); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA536);

                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:720:42: ( NL )?
                            	    int alt248=2;
                            	    int LA248_0 = input.LA(1);

                            	    if ( (LA248_0==NL) ) {
                            	        alt248=1;
                            	    }
                            	    switch (alt248) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:720:42: NL
                            	            {
                            	            NL537=(Token)match(input,NL,FOLLOW_NL_in_list_expr5043); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL537);


                            	            }
                            	            break;

                            	    }

                            	    pushFollow(FOLLOW_protected_expr_nc_in_list_expr5046);
                            	    protected_expr_nc538=protected_expr_nc();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_protected_expr_nc.add(protected_expr_nc538.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop249;
                                }
                            } while (true);

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:720:66: ( NL )?
                            int alt250=2;
                            int LA250_0 = input.LA(1);

                            if ( (LA250_0==NL) ) {
                                alt250=1;
                            }
                            switch (alt250) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:720:66: NL
                                    {
                                    NL539=(Token)match(input,NL,FOLLOW_NL_in_list_expr5050); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL539);


                                    }
                                    break;

                            }

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:720:70: ( COMMA ( NL )? )?
                            int alt252=2;
                            int LA252_0 = input.LA(1);

                            if ( (LA252_0==COMMA) ) {
                                alt252=1;
                            }
                            switch (alt252) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:720:71: COMMA ( NL )?
                                    {
                                    COMMA540=(Token)match(input,COMMA,FOLLOW_COMMA_in_list_expr5054); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_COMMA.add(COMMA540);

                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:720:77: ( NL )?
                                    int alt251=2;
                                    int LA251_0 = input.LA(1);

                                    if ( (LA251_0==NL) ) {
                                        alt251=1;
                                    }
                                    switch (alt251) {
                                        case 1 :
                                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:720:77: NL
                                            {
                                            NL541=(Token)match(input,NL,FOLLOW_NL_in_list_expr5056); if (state.failed) return retval; 
                                            if ( state.backtracking==0 ) stream_NL.add(NL541);


                                            }
                                            break;

                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    char_literal542=(Token)match(input,ROUND_BRACKET_CLOSE,FOLLOW_ROUND_BRACKET_CLOSE_in_list_expr5063); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ROUND_BRACKET_CLOSE.add(char_literal542);



                    // AST REWRITE
                    // elements: protected_expr_nc, COMMA
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 720:89: -> ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( protected_expr_nc )* ) )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:720:92: ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( protected_expr_nc )* ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ROUND_LIST, "ROUND_LIST"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:720:105: ^( NIL_TOKEN ( COMMA )* )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_2);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:720:117: ( COMMA )*
                        while ( stream_COMMA.hasNext() ) {
                            adaptor.addChild(root_2, stream_COMMA.nextNode());

                        }
                        stream_COMMA.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:720:125: ^( NIL_TOKEN ( protected_expr_nc )* )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_2);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:720:137: ( protected_expr_nc )*
                        while ( stream_protected_expr_nc.hasNext() ) {
                            adaptor.addChild(root_2, stream_protected_expr_nc.nextTree());

                        }
                        stream_protected_expr_nc.reset();

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:722:1: map_or_set_expr : ( '{' ( NL )? ( map_or_set_elem_expr ( NL )? ( COMMA ( NL )? map_or_set_elem_expr ( NL )? )* )? '}' -> ^( MAP_OR_SET_OR_OBJ ( map_or_set_elem_expr )* ) | '{' ( NL )? token_ARROW ( NL )? '}' -> ^( EMPTY_MAP ) );
    public final babel17Parser.map_or_set_expr_return map_or_set_expr() throws RecognitionException {
        babel17Parser.map_or_set_expr_return retval = new babel17Parser.map_or_set_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal543=null;
        Token NL544=null;
        Token NL546=null;
        Token COMMA547=null;
        Token NL548=null;
        Token NL550=null;
        Token char_literal551=null;
        Token char_literal552=null;
        Token NL553=null;
        Token NL555=null;
        Token char_literal556=null;
        babel17Parser.map_or_set_elem_expr_return map_or_set_elem_expr545 = null;

        babel17Parser.map_or_set_elem_expr_return map_or_set_elem_expr549 = null;

        babel17Parser.token_ARROW_return token_ARROW554 = null;


        CommonTree char_literal543_tree=null;
        CommonTree NL544_tree=null;
        CommonTree NL546_tree=null;
        CommonTree COMMA547_tree=null;
        CommonTree NL548_tree=null;
        CommonTree NL550_tree=null;
        CommonTree char_literal551_tree=null;
        CommonTree char_literal552_tree=null;
        CommonTree NL553_tree=null;
        CommonTree NL555_tree=null;
        CommonTree char_literal556_tree=null;
        RewriteRuleTokenStream stream_CURLY_BRACKET_OPEN=new RewriteRuleTokenStream(adaptor,"token CURLY_BRACKET_OPEN");
        RewriteRuleTokenStream stream_CURLY_BRACKET_CLOSE=new RewriteRuleTokenStream(adaptor,"token CURLY_BRACKET_CLOSE");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_map_or_set_elem_expr=new RewriteRuleSubtreeStream(adaptor,"rule map_or_set_elem_expr");
        RewriteRuleSubtreeStream stream_token_ARROW=new RewriteRuleSubtreeStream(adaptor,"rule token_ARROW");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:723:2: ( '{' ( NL )? ( map_or_set_elem_expr ( NL )? ( COMMA ( NL )? map_or_set_elem_expr ( NL )? )* )? '}' -> ^( MAP_OR_SET_OR_OBJ ( map_or_set_elem_expr )* ) | '{' ( NL )? token_ARROW ( NL )? '}' -> ^( EMPTY_MAP ) )
            int alt263=2;
            int LA263_0 = input.LA(1);

            if ( (LA263_0==CURLY_BRACKET_OPEN) ) {
                switch ( input.LA(2) ) {
                case NL:
                    {
                    int LA263_2 = input.LA(3);

                    if ( (LA263_2==L_begin||(LA263_2>=L_obj && LA263_2<=L_if)||(LA263_2>=L_while && LA263_2<=L_for)||LA263_2==L_match||LA263_2==L_exception||LA263_2==L_try||(LA263_2>=A_infinity && LA263_2<=L_lazy)||(LA263_2>=L_true && LA263_2<=L_nil)||LA263_2==L_typeof||LA263_2==MINUS||LA263_2==A_NOT||LA263_2==U_NOT||(LA263_2>=A_ELLIPSIS && LA263_2<=U_ELLIPSIS)||LA263_2==L_force||(LA263_2>=Constr && LA263_2<=Num)||(LA263_2>=String && LA263_2<=ROUND_BRACKET_OPEN)||LA263_2==SQUARE_BRACKET_OPEN||(LA263_2>=CURLY_BRACKET_OPEN && LA263_2<=UNDERSCORE)) ) {
                        alt263=1;
                    }
                    else if ( ((LA263_2>=A_ARROW && LA263_2<=U_ARROW)) ) {
                        alt263=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 263, 2, input);

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
                case L_typeof:
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
                    alt263=1;
                    }
                    break;
                case A_ARROW:
                case U_ARROW:
                    {
                    alt263=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 263, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 263, 0, input);

                throw nvae;
            }
            switch (alt263) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:723:4: '{' ( NL )? ( map_or_set_elem_expr ( NL )? ( COMMA ( NL )? map_or_set_elem_expr ( NL )? )* )? '}'
                    {
                    char_literal543=(Token)match(input,CURLY_BRACKET_OPEN,FOLLOW_CURLY_BRACKET_OPEN_in_map_or_set_expr5092); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_OPEN.add(char_literal543);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:723:8: ( NL )?
                    int alt255=2;
                    int LA255_0 = input.LA(1);

                    if ( (LA255_0==NL) ) {
                        alt255=1;
                    }
                    switch (alt255) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:723:8: NL
                            {
                            NL544=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_expr5094); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL544);


                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:723:12: ( map_or_set_elem_expr ( NL )? ( COMMA ( NL )? map_or_set_elem_expr ( NL )? )* )?
                    int alt260=2;
                    int LA260_0 = input.LA(1);

                    if ( (LA260_0==L_begin||(LA260_0>=L_obj && LA260_0<=L_if)||(LA260_0>=L_while && LA260_0<=L_for)||LA260_0==L_match||LA260_0==L_exception||LA260_0==L_try||(LA260_0>=A_infinity && LA260_0<=L_lazy)||(LA260_0>=L_true && LA260_0<=L_nil)||LA260_0==L_typeof||LA260_0==MINUS||LA260_0==A_NOT||LA260_0==U_NOT||(LA260_0>=A_ELLIPSIS && LA260_0<=U_ELLIPSIS)||LA260_0==L_force||(LA260_0>=Constr && LA260_0<=Num)||(LA260_0>=String && LA260_0<=ROUND_BRACKET_OPEN)||LA260_0==SQUARE_BRACKET_OPEN||LA260_0==CURLY_BRACKET_OPEN||LA260_0==UNDERSCORE) ) {
                        alt260=1;
                    }
                    switch (alt260) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:723:13: map_or_set_elem_expr ( NL )? ( COMMA ( NL )? map_or_set_elem_expr ( NL )? )*
                            {
                            pushFollow(FOLLOW_map_or_set_elem_expr_in_map_or_set_expr5098);
                            map_or_set_elem_expr545=map_or_set_elem_expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_map_or_set_elem_expr.add(map_or_set_elem_expr545.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:723:34: ( NL )?
                            int alt256=2;
                            int LA256_0 = input.LA(1);

                            if ( (LA256_0==NL) ) {
                                alt256=1;
                            }
                            switch (alt256) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:723:34: NL
                                    {
                                    NL546=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_expr5100); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL546);


                                    }
                                    break;

                            }

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:723:38: ( COMMA ( NL )? map_or_set_elem_expr ( NL )? )*
                            loop259:
                            do {
                                int alt259=2;
                                int LA259_0 = input.LA(1);

                                if ( (LA259_0==COMMA) ) {
                                    alt259=1;
                                }


                                switch (alt259) {
                            	case 1 :
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:723:39: COMMA ( NL )? map_or_set_elem_expr ( NL )?
                            	    {
                            	    COMMA547=(Token)match(input,COMMA,FOLLOW_COMMA_in_map_or_set_expr5104); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA547);

                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:723:45: ( NL )?
                            	    int alt257=2;
                            	    int LA257_0 = input.LA(1);

                            	    if ( (LA257_0==NL) ) {
                            	        alt257=1;
                            	    }
                            	    switch (alt257) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:723:45: NL
                            	            {
                            	            NL548=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_expr5106); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL548);


                            	            }
                            	            break;

                            	    }

                            	    pushFollow(FOLLOW_map_or_set_elem_expr_in_map_or_set_expr5109);
                            	    map_or_set_elem_expr549=map_or_set_elem_expr();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_map_or_set_elem_expr.add(map_or_set_elem_expr549.getTree());
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:723:70: ( NL )?
                            	    int alt258=2;
                            	    int LA258_0 = input.LA(1);

                            	    if ( (LA258_0==NL) ) {
                            	        alt258=1;
                            	    }
                            	    switch (alt258) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:723:70: NL
                            	            {
                            	            NL550=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_expr5111); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL550);


                            	            }
                            	            break;

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop259;
                                }
                            } while (true);


                            }
                            break;

                    }

                    char_literal551=(Token)match(input,CURLY_BRACKET_CLOSE,FOLLOW_CURLY_BRACKET_CLOSE_in_map_or_set_expr5118); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_CLOSE.add(char_literal551);



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
                    // 723:82: -> ^( MAP_OR_SET_OR_OBJ ( map_or_set_elem_expr )* )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:723:85: ^( MAP_OR_SET_OR_OBJ ( map_or_set_elem_expr )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MAP_OR_SET_OR_OBJ, "MAP_OR_SET_OR_OBJ"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:723:105: ( map_or_set_elem_expr )*
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:724:10: '{' ( NL )? token_ARROW ( NL )? '}'
                    {
                    char_literal552=(Token)match(input,CURLY_BRACKET_OPEN,FOLLOW_CURLY_BRACKET_OPEN_in_map_or_set_expr5138); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_OPEN.add(char_literal552);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:724:14: ( NL )?
                    int alt261=2;
                    int LA261_0 = input.LA(1);

                    if ( (LA261_0==NL) ) {
                        alt261=1;
                    }
                    switch (alt261) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:724:14: NL
                            {
                            NL553=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_expr5140); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL553);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_token_ARROW_in_map_or_set_expr5143);
                    token_ARROW554=token_ARROW();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_token_ARROW.add(token_ARROW554.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:724:30: ( NL )?
                    int alt262=2;
                    int LA262_0 = input.LA(1);

                    if ( (LA262_0==NL) ) {
                        alt262=1;
                    }
                    switch (alt262) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:724:30: NL
                            {
                            NL555=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_expr5145); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL555);


                            }
                            break;

                    }

                    char_literal556=(Token)match(input,CURLY_BRACKET_CLOSE,FOLLOW_CURLY_BRACKET_CLOSE_in_map_or_set_expr5148); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_CLOSE.add(char_literal556);



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
                    // 724:38: -> ^( EMPTY_MAP )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:724:41: ^( EMPTY_MAP )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:726:1: map_or_set_elem_expr : protected_expr_nc ( ( NL )? arrow_or_assign ( NL )? protected_expr_nc )? -> ^( NIL_TOKEN ^( NIL_TOKEN ( protected_expr_nc )* ) ( arrow_or_assign )* ) ;
    public final babel17Parser.map_or_set_elem_expr_return map_or_set_elem_expr() throws RecognitionException {
        babel17Parser.map_or_set_elem_expr_return retval = new babel17Parser.map_or_set_elem_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL558=null;
        Token NL560=null;
        babel17Parser.protected_expr_nc_return protected_expr_nc557 = null;

        babel17Parser.arrow_or_assign_return arrow_or_assign559 = null;

        babel17Parser.protected_expr_nc_return protected_expr_nc561 = null;


        CommonTree NL558_tree=null;
        CommonTree NL560_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_arrow_or_assign=new RewriteRuleSubtreeStream(adaptor,"rule arrow_or_assign");
        RewriteRuleSubtreeStream stream_protected_expr_nc=new RewriteRuleSubtreeStream(adaptor,"rule protected_expr_nc");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:727:2: ( protected_expr_nc ( ( NL )? arrow_or_assign ( NL )? protected_expr_nc )? -> ^( NIL_TOKEN ^( NIL_TOKEN ( protected_expr_nc )* ) ( arrow_or_assign )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:727:4: protected_expr_nc ( ( NL )? arrow_or_assign ( NL )? protected_expr_nc )?
            {
            pushFollow(FOLLOW_protected_expr_nc_in_map_or_set_elem_expr5165);
            protected_expr_nc557=protected_expr_nc();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_protected_expr_nc.add(protected_expr_nc557.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:727:22: ( ( NL )? arrow_or_assign ( NL )? protected_expr_nc )?
            int alt266=2;
            int LA266_0 = input.LA(1);

            if ( (LA266_0==NL) ) {
                int LA266_1 = input.LA(2);

                if ( (LA266_1==ASSIGN||(LA266_1>=A_ARROW && LA266_1<=U_ARROW)) ) {
                    alt266=1;
                }
            }
            else if ( (LA266_0==ASSIGN||(LA266_0>=A_ARROW && LA266_0<=U_ARROW)) ) {
                alt266=1;
            }
            switch (alt266) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:727:23: ( NL )? arrow_or_assign ( NL )? protected_expr_nc
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:727:23: ( NL )?
                    int alt264=2;
                    int LA264_0 = input.LA(1);

                    if ( (LA264_0==NL) ) {
                        alt264=1;
                    }
                    switch (alt264) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:727:23: NL
                            {
                            NL558=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_elem_expr5168); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL558);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_arrow_or_assign_in_map_or_set_elem_expr5171);
                    arrow_or_assign559=arrow_or_assign();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_arrow_or_assign.add(arrow_or_assign559.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:727:43: ( NL )?
                    int alt265=2;
                    int LA265_0 = input.LA(1);

                    if ( (LA265_0==NL) ) {
                        alt265=1;
                    }
                    switch (alt265) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:727:43: NL
                            {
                            NL560=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_elem_expr5173); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL560);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_protected_expr_nc_in_map_or_set_elem_expr5176);
                    protected_expr_nc561=protected_expr_nc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_protected_expr_nc.add(protected_expr_nc561.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: protected_expr_nc, arrow_or_assign
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 727:67: -> ^( NIL_TOKEN ^( NIL_TOKEN ( protected_expr_nc )* ) ( arrow_or_assign )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:727:70: ^( NIL_TOKEN ^( NIL_TOKEN ( protected_expr_nc )* ) ( arrow_or_assign )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:727:82: ^( NIL_TOKEN ( protected_expr_nc )* )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_2);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:727:94: ( protected_expr_nc )*
                while ( stream_protected_expr_nc.hasNext() ) {
                    adaptor.addChild(root_2, stream_protected_expr_nc.nextTree());

                }
                stream_protected_expr_nc.reset();

                adaptor.addChild(root_1, root_2);
                }
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:727:114: ( arrow_or_assign )*
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

    public static class type_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:729:1: type_expr : '(' ( NL )? ':' ( NL )? typeid ( NL )? ')' -> ^( TYPE_EXPR typeid ) ;
    public final babel17Parser.type_expr_return type_expr() throws RecognitionException {
        babel17Parser.type_expr_return retval = new babel17Parser.type_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal562=null;
        Token NL563=null;
        Token char_literal564=null;
        Token NL565=null;
        Token NL567=null;
        Token char_literal568=null;
        babel17Parser.typeid_return typeid566 = null;


        CommonTree char_literal562_tree=null;
        CommonTree NL563_tree=null;
        CommonTree char_literal564_tree=null;
        CommonTree NL565_tree=null;
        CommonTree NL567_tree=null;
        CommonTree char_literal568_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_ROUND_BRACKET_OPEN=new RewriteRuleTokenStream(adaptor,"token ROUND_BRACKET_OPEN");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_ROUND_BRACKET_CLOSE=new RewriteRuleTokenStream(adaptor,"token ROUND_BRACKET_CLOSE");
        RewriteRuleSubtreeStream stream_typeid=new RewriteRuleSubtreeStream(adaptor,"rule typeid");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:730:2: ( '(' ( NL )? ':' ( NL )? typeid ( NL )? ')' -> ^( TYPE_EXPR typeid ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:730:4: '(' ( NL )? ':' ( NL )? typeid ( NL )? ')'
            {
            char_literal562=(Token)match(input,ROUND_BRACKET_OPEN,FOLLOW_ROUND_BRACKET_OPEN_in_type_expr5203); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ROUND_BRACKET_OPEN.add(char_literal562);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:730:8: ( NL )?
            int alt267=2;
            int LA267_0 = input.LA(1);

            if ( (LA267_0==NL) ) {
                alt267=1;
            }
            switch (alt267) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:730:8: NL
                    {
                    NL563=(Token)match(input,NL,FOLLOW_NL_in_type_expr5205); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL563);


                    }
                    break;

            }

            char_literal564=(Token)match(input,COLON,FOLLOW_COLON_in_type_expr5208); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(char_literal564);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:730:16: ( NL )?
            int alt268=2;
            int LA268_0 = input.LA(1);

            if ( (LA268_0==NL) ) {
                alt268=1;
            }
            switch (alt268) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:730:16: NL
                    {
                    NL565=(Token)match(input,NL,FOLLOW_NL_in_type_expr5210); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL565);


                    }
                    break;

            }

            pushFollow(FOLLOW_typeid_in_type_expr5213);
            typeid566=typeid();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeid.add(typeid566.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:730:27: ( NL )?
            int alt269=2;
            int LA269_0 = input.LA(1);

            if ( (LA269_0==NL) ) {
                alt269=1;
            }
            switch (alt269) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:730:27: NL
                    {
                    NL567=(Token)match(input,NL,FOLLOW_NL_in_type_expr5215); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL567);


                    }
                    break;

            }

            char_literal568=(Token)match(input,ROUND_BRACKET_CLOSE,FOLLOW_ROUND_BRACKET_CLOSE_in_type_expr5218); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ROUND_BRACKET_CLOSE.add(char_literal568);



            // AST REWRITE
            // elements: typeid
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 730:35: -> ^( TYPE_EXPR typeid )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:730:38: ^( TYPE_EXPR typeid )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TYPE_EXPR, "TYPE_EXPR"), root_1);

                adaptor.addChild(root_1, stream_typeid.nextTree());

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
    // $ANTLR end "type_expr"

    public static class primitive_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "primitive_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:732:1: primitive_expr : ( Num | String | Id | Constr | L_true | L_false | L_this | L_nil | type_expr | token_infinity | list_expr | with_control_expr | map_or_set_expr );
    public final babel17Parser.primitive_expr_return primitive_expr() throws RecognitionException {
        babel17Parser.primitive_expr_return retval = new babel17Parser.primitive_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Num569=null;
        Token String570=null;
        Token Id571=null;
        Token Constr572=null;
        Token L_true573=null;
        Token L_false574=null;
        Token L_this575=null;
        Token L_nil576=null;
        babel17Parser.type_expr_return type_expr577 = null;

        babel17Parser.token_infinity_return token_infinity578 = null;

        babel17Parser.list_expr_return list_expr579 = null;

        babel17Parser.with_control_expr_return with_control_expr580 = null;

        babel17Parser.map_or_set_expr_return map_or_set_expr581 = null;


        CommonTree Num569_tree=null;
        CommonTree String570_tree=null;
        CommonTree Id571_tree=null;
        CommonTree Constr572_tree=null;
        CommonTree L_true573_tree=null;
        CommonTree L_false574_tree=null;
        CommonTree L_this575_tree=null;
        CommonTree L_nil576_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:733:2: ( Num | String | Id | Constr | L_true | L_false | L_this | L_nil | type_expr | token_infinity | list_expr | with_control_expr | map_or_set_expr )
            int alt270=13;
            alt270 = dfa270.predict(input);
            switch (alt270) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:733:4: Num
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Num569=(Token)match(input,Num,FOLLOW_Num_in_primitive_expr5235); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Num569_tree = (CommonTree)adaptor.create(Num569);
                    adaptor.addChild(root_0, Num569_tree);
                    }

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:734:4: String
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    String570=(Token)match(input,String,FOLLOW_String_in_primitive_expr5240); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    String570_tree = (CommonTree)adaptor.create(String570);
                    adaptor.addChild(root_0, String570_tree);
                    }

                    }
                    break;
                case 3 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:735:4: Id
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Id571=(Token)match(input,Id,FOLLOW_Id_in_primitive_expr5245); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Id571_tree = (CommonTree)adaptor.create(Id571);
                    adaptor.addChild(root_0, Id571_tree);
                    }

                    }
                    break;
                case 4 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:736:4: Constr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Constr572=(Token)match(input,Constr,FOLLOW_Constr_in_primitive_expr5250); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Constr572_tree = (CommonTree)adaptor.create(Constr572);
                    adaptor.addChild(root_0, Constr572_tree);
                    }

                    }
                    break;
                case 5 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:737:4: L_true
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    L_true573=(Token)match(input,L_true,FOLLOW_L_true_in_primitive_expr5255); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    L_true573_tree = (CommonTree)adaptor.create(L_true573);
                    adaptor.addChild(root_0, L_true573_tree);
                    }

                    }
                    break;
                case 6 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:738:4: L_false
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    L_false574=(Token)match(input,L_false,FOLLOW_L_false_in_primitive_expr5260); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    L_false574_tree = (CommonTree)adaptor.create(L_false574);
                    adaptor.addChild(root_0, L_false574_tree);
                    }

                    }
                    break;
                case 7 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:739:4: L_this
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    L_this575=(Token)match(input,L_this,FOLLOW_L_this_in_primitive_expr5265); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    L_this575_tree = (CommonTree)adaptor.create(L_this575);
                    adaptor.addChild(root_0, L_this575_tree);
                    }

                    }
                    break;
                case 8 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:740:4: L_nil
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    L_nil576=(Token)match(input,L_nil,FOLLOW_L_nil_in_primitive_expr5271); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    L_nil576_tree = (CommonTree)adaptor.create(L_nil576);
                    adaptor.addChild(root_0, L_nil576_tree);
                    }

                    }
                    break;
                case 9 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:741:4: type_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_type_expr_in_primitive_expr5276);
                    type_expr577=type_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type_expr577.getTree());

                    }
                    break;
                case 10 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:742:4: token_infinity
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_infinity_in_primitive_expr5281);
                    token_infinity578=token_infinity();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, token_infinity578.getTree());

                    }
                    break;
                case 11 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:743:5: list_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_list_expr_in_primitive_expr5287);
                    list_expr579=list_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, list_expr579.getTree());

                    }
                    break;
                case 12 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:744:4: with_control_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_with_control_expr_in_primitive_expr5292);
                    with_control_expr580=with_control_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, with_control_expr580.getTree());

                    }
                    break;
                case 13 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:745:4: map_or_set_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_map_or_set_expr_in_primitive_expr5297);
                    map_or_set_expr581=map_or_set_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, map_or_set_expr581.getTree());

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

    // $ANTLR start synpred1_babel17
    public final void synpred1_babel17_fragment() throws RecognitionException {   
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:397:10: ( Id ( NL )? L_as )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:397:11: Id ( NL )? L_as
        {
        match(input,Id,FOLLOW_Id_in_synpred1_babel171792); if (state.failed) return ;
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:397:14: ( NL )?
        int alt271=2;
        int LA271_0 = input.LA(1);

        if ( (LA271_0==NL) ) {
            alt271=1;
        }
        switch (alt271) {
            case 1 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:397:14: NL
                {
                match(input,NL,FOLLOW_NL_in_synpred1_babel171794); if (state.failed) return ;

                }
                break;

        }

        match(input,L_as,FOLLOW_L_as_in_synpred1_babel171797); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_babel17

    // $ANTLR start synpred2_babel17
    public final void synpred2_babel17_fragment() throws RecognitionException {   
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:398:4: ( protected_expr ( NL )? QUESTION_MARK )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:398:5: protected_expr ( NL )? QUESTION_MARK
        {
        pushFollow(FOLLOW_protected_expr_in_synpred2_babel171828);
        protected_expr();

        state._fsp--;
        if (state.failed) return ;
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:398:20: ( NL )?
        int alt272=2;
        int LA272_0 = input.LA(1);

        if ( (LA272_0==NL) ) {
            alt272=1;
        }
        switch (alt272) {
            case 1 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:398:20: NL
                {
                match(input,NL,FOLLOW_NL_in_synpred2_babel171830); if (state.failed) return ;

                }
                break;

        }

        match(input,QUESTION_MARK,FOLLOW_QUESTION_MARK_in_synpred2_babel171833); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_babel17

    // $ANTLR start synpred3_babel17
    public final void synpred3_babel17_fragment() throws RecognitionException {   
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:400:4: ( Id pattern )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:400:5: Id pattern
        {
        match(input,Id,FOLLOW_Id_in_synpred3_babel171871); if (state.failed) return ;
        pushFollow(FOLLOW_pattern_in_synpred3_babel171873);
        pattern();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_babel17

    // $ANTLR start synpred4_babel17
    public final void synpred4_babel17_fragment() throws RecognitionException {   
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:403:4: ( pattern ( NL )? L_if )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:403:5: pattern ( NL )? L_if
        {
        pushFollow(FOLLOW_pattern_in_synpred4_babel171962);
        pattern();

        state._fsp--;
        if (state.failed) return ;
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:403:13: ( NL )?
        int alt273=2;
        int LA273_0 = input.LA(1);

        if ( (LA273_0==NL) ) {
            alt273=1;
        }
        switch (alt273) {
            case 1 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:403:13: NL
                {
                match(input,NL,FOLLOW_NL_in_synpred4_babel171964); if (state.failed) return ;

                }
                break;

        }

        match(input,L_if,FOLLOW_L_if_in_synpred4_babel171967); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_babel17

    // $ANTLR start synpred5_babel17
    public final void synpred5_babel17_fragment() throws RecognitionException {   
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:404:4: ( pattern ( NL )? ':' )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:404:5: pattern ( NL )? ':'
        {
        pushFollow(FOLLOW_pattern_in_synpred5_babel171998);
        pattern();

        state._fsp--;
        if (state.failed) return ;
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:404:13: ( NL )?
        int alt274=2;
        int LA274_0 = input.LA(1);

        if ( (LA274_0==NL) ) {
            alt274=1;
        }
        switch (alt274) {
            case 1 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:404:13: NL
                {
                match(input,NL,FOLLOW_NL_in_synpred5_babel172000); if (state.failed) return ;

                }
                break;

        }

        match(input,COLON,FOLLOW_COLON_in_synpred5_babel172003); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_babel17

    // $ANTLR start synpred6_babel17
    public final void synpred6_babel17_fragment() throws RecognitionException {   
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:471:4: ( primitive_pattern ( NL )? '=' )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:471:5: primitive_pattern ( NL )? '='
        {
        pushFollow(FOLLOW_primitive_pattern_in_synpred6_babel172811);
        primitive_pattern();

        state._fsp--;
        if (state.failed) return ;
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:471:23: ( NL )?
        int alt275=2;
        int LA275_0 = input.LA(1);

        if ( (LA275_0==NL) ) {
            alt275=1;
        }
        switch (alt275) {
            case 1 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:471:23: NL
                {
                match(input,NL,FOLLOW_NL_in_synpred6_babel172813); if (state.failed) return ;

                }
                break;

        }

        match(input,ASSIGN,FOLLOW_ASSIGN_in_synpred6_babel172816); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred6_babel17

    // $ANTLR start synpred7_babel17
    public final void synpred7_babel17_fragment() throws RecognitionException {   
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:500:4: ( ( pattern | objelem_assign ) ( NL )? '=' )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:500:5: ( pattern | objelem_assign ) ( NL )? '='
        {
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:500:5: ( pattern | objelem_assign )
        int alt276=2;
        int LA276_0 = input.LA(1);

        if ( (LA276_0==L_exception||(LA276_0>=A_infinity && LA276_0<=U_infinity)||(LA276_0>=L_true && LA276_0<=L_false)||LA276_0==L_nil||LA276_0==MINUS||(LA276_0>=A_ELLIPSIS && LA276_0<=U_ELLIPSIS)||LA276_0==Constr||LA276_0==Num||(LA276_0>=String && LA276_0<=ROUND_BRACKET_OPEN)||LA276_0==SQUARE_BRACKET_OPEN||LA276_0==CURLY_BRACKET_OPEN||LA276_0==UNDERSCORE) ) {
            alt276=1;
        }
        else if ( (LA276_0==Id) ) {
            int LA276_2 = input.LA(2);

            if ( (LA276_2==PERIOD) ) {
                alt276=2;
            }
            else if ( (LA276_2==ASSIGN||(LA276_2>=A_DOUBLE_COLON && LA276_2<=U_DOUBLE_COLON)||LA276_2==NL) ) {
                alt276=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 276, 2, input);

                throw nvae;
            }
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 276, 0, input);

            throw nvae;
        }
        switch (alt276) {
            case 1 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:500:6: pattern
                {
                pushFollow(FOLLOW_pattern_in_synpred7_babel173112);
                pattern();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:500:16: objelem_assign
                {
                pushFollow(FOLLOW_objelem_assign_in_synpred7_babel173116);
                objelem_assign();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:500:32: ( NL )?
        int alt277=2;
        int LA277_0 = input.LA(1);

        if ( (LA277_0==NL) ) {
            alt277=1;
        }
        switch (alt277) {
            case 1 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:500:32: NL
                {
                match(input,NL,FOLLOW_NL_in_synpred7_babel173119); if (state.failed) return ;

                }
                break;

        }

        match(input,ASSIGN,FOLLOW_ASSIGN_in_synpred7_babel173122); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred7_babel17

    // $ANTLR start synpred8_babel17
    public final void synpred8_babel17_fragment() throws RecognitionException {   
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:535:11: ( L_obj ( NL )? parents )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:535:12: L_obj ( NL )? parents
        {
        match(input,L_obj,FOLLOW_L_obj_in_synpred8_babel173351); if (state.failed) return ;
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:535:18: ( NL )?
        int alt278=2;
        int LA278_0 = input.LA(1);

        if ( (LA278_0==NL) ) {
            alt278=1;
        }
        switch (alt278) {
            case 1 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:535:18: NL
                {
                match(input,NL,FOLLOW_NL_in_synpred8_babel173353); if (state.failed) return ;

                }
                break;

        }

        pushFollow(FOLLOW_parents_in_synpred8_babel173356);
        parents();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred8_babel17

    // $ANTLR start synpred9_babel17
    public final void synpred9_babel17_fragment() throws RecognitionException {   
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:539:4: ( lambda_expr )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:539:5: lambda_expr
        {
        pushFollow(FOLLOW_lambda_expr_in_synpred9_babel173425);
        lambda_expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred9_babel17

    // $ANTLR start synpred10_babel17
    public final void synpred10_babel17_fragment() throws RecognitionException {   
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:540:4: ( lambda_expr_nobrackets )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:540:5: lambda_expr_nobrackets
        {
        pushFollow(FOLLOW_lambda_expr_nobrackets_in_synpred10_babel173436);
        lambda_expr_nobrackets();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred10_babel17

    // $ANTLR start synpred11_babel17
    public final void synpred11_babel17_fragment() throws RecognitionException {   
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:544:4: ( lambda_expr )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:544:5: lambda_expr
        {
        pushFollow(FOLLOW_lambda_expr_in_synpred11_babel173457);
        lambda_expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred11_babel17

    // $ANTLR start synpred12_babel17
    public final void synpred12_babel17_fragment() throws RecognitionException {   
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:545:4: ( lambda_expr_nobrackets )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:545:5: lambda_expr_nobrackets
        {
        pushFollow(FOLLOW_lambda_expr_nobrackets_in_synpred12_babel173468);
        lambda_expr_nobrackets();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred12_babel17

    // Delegated rules

    public final boolean synpred12_babel17() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_babel17_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
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
    public final boolean synpred8_babel17() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_babel17_fragment(); // can never throw exception
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
    public final boolean synpred9_babel17() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_babel17_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_babel17() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_babel17_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_babel17() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_babel17_fragment(); // can never throw exception
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
    public final boolean synpred11_babel17() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_babel17_fragment(); // can never throw exception
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


    protected DFA29 dfa29 = new DFA29(this);
    protected DFA58 dfa58 = new DFA58(this);
    protected DFA64 dfa64 = new DFA64(this);
    protected DFA61 dfa61 = new DFA61(this);
    protected DFA66 dfa66 = new DFA66(this);
    protected DFA92 dfa92 = new DFA92(this);
    protected DFA109 dfa109 = new DFA109(this);
    protected DFA119 dfa119 = new DFA119(this);
    protected DFA120 dfa120 = new DFA120(this);
    protected DFA270 dfa270 = new DFA270(this);
    static final String DFA29_eotS =
        "\42\uffff";
    static final String DFA29_eofS =
        "\42\uffff";
    static final String DFA29_minS =
        "\1\74\17\0\6\uffff\1\0\13\uffff";
    static final String DFA29_maxS =
        "\1\u0099\17\0\6\uffff\1\0\13\uffff";
    static final String DFA29_acceptS =
        "\20\uffff\6\2\1\uffff\4\2\1\4\1\1\1\3\1\6\1\7\1\10\1\5";
    static final String DFA29_specialS =
        "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1"+
        "\16\1\17\6\uffff\1\20\13\uffff}>";
    static final String[] DFA29_transitionS = {
            "\1\30\1\uffff\1\32\1\31\1\23\3\uffff\1\24\1\26\2\uffff\1\25"+
            "\2\uffff\1\33\2\uffff\1\16\2\uffff\1\27\1\uffff\2\12\3\20\1"+
            "\uffff\1\7\1\10\1\22\1\20\1\11\4\uffff\1\20\16\uffff\1\13\5"+
            "\uffff\1\21\2\uffff\1\21\12\uffff\2\17\3\uffff\1\20\3\uffff"+
            "\1\3\1\1\1\6\1\uffff\1\5\1\2\1\uffff\1\14\1\uffff\1\15\1\uffff"+
            "\1\4",
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

    static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
    static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
    static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
    static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
    static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
    static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
    static final short[][] DFA29_transition;

    static {
        int numStates = DFA29_transitionS.length;
        DFA29_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
        }
    }

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = DFA29_eot;
            this.eof = DFA29_eof;
            this.min = DFA29_min;
            this.max = DFA29_max;
            this.accept = DFA29_accept;
            this.special = DFA29_special;
            this.transition = DFA29_transition;
        }
        public String getDescription() {
            return "396:1: bracket_pattern : ( ( Id ( NL )? L_as )=> Id ( NL )? L_as ( NL )? pattern -> ^( L_as Id pattern ) | ( protected_expr ( NL )? QUESTION_MARK )=> protected_expr ( NL )? QUESTION_MARK ( ( NL )? pattern )? -> ^( QUESTION_MARK protected_expr ( pattern )? ) | ( Id pattern )=> Id pattern -> ^( INNERVALUE_PATTERN Id pattern ) | L_val ( NL )? protected_expr_nc -> ^( L_val protected_expr_nc ) | L_for ( NL )? ( bracket_pattern ( ( NL )? COMMA ( NL )? bracket_pattern )* ( NL )? )? L_end -> ^( L_for ( bracket_pattern )* ) | ( pattern ( NL )? L_if )=> pattern ( NL )? L_if ( NL )? protected_expr_nc -> ^( IF_PATTERN pattern protected_expr_nc ) | ( pattern ( NL )? ':' )=> pattern ( NL )? ':' ( NL )? typeannotation -> ^( TYPE_PATTERN typeannotation pattern ) | pattern );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA29_0 = input.LA(1);

                         
                        int index29_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA29_0==Id) ) {s = 1;}

                        else if ( (LA29_0==ROUND_BRACKET_OPEN) ) {s = 2;}

                        else if ( (LA29_0==Constr) ) {s = 3;}

                        else if ( (LA29_0==UNDERSCORE) ) {s = 4;}

                        else if ( (LA29_0==String) ) {s = 5;}

                        else if ( (LA29_0==Num) ) {s = 6;}

                        else if ( (LA29_0==L_true) ) {s = 7;}

                        else if ( (LA29_0==L_false) ) {s = 8;}

                        else if ( (LA29_0==L_nil) ) {s = 9;}

                        else if ( ((LA29_0>=A_infinity && LA29_0<=U_infinity)) ) {s = 10;}

                        else if ( (LA29_0==MINUS) ) {s = 11;}

                        else if ( (LA29_0==SQUARE_BRACKET_OPEN) ) {s = 12;}

                        else if ( (LA29_0==CURLY_BRACKET_OPEN) ) {s = 13;}

                        else if ( (LA29_0==L_exception) ) {s = 14;}

                        else if ( ((LA29_0>=A_ELLIPSIS && LA29_0<=U_ELLIPSIS)) ) {s = 15;}

                        else if ( ((LA29_0>=L_concurrent && LA29_0<=L_lazy)||LA29_0==L_random||LA29_0==L_typeof||LA29_0==L_force) && (synpred2_babel17())) {s = 16;}

                        else if ( (LA29_0==A_NOT||LA29_0==U_NOT) && (synpred2_babel17())) {s = 17;}

                        else if ( (LA29_0==L_this) && (synpred2_babel17())) {s = 18;}

                        else if ( (LA29_0==L_if) && (synpred2_babel17())) {s = 19;}

                        else if ( (LA29_0==L_while) && (synpred2_babel17())) {s = 20;}

                        else if ( (LA29_0==L_match) && (synpred2_babel17())) {s = 21;}

                        else if ( (LA29_0==L_for) ) {s = 22;}

                        else if ( (LA29_0==L_try) && (synpred2_babel17())) {s = 23;}

                        else if ( (LA29_0==L_begin) && (synpred2_babel17())) {s = 24;}

                        else if ( (LA29_0==L_with) && (synpred2_babel17())) {s = 25;}

                        else if ( (LA29_0==L_obj) && (synpred2_babel17())) {s = 26;}

                        else if ( (LA29_0==L_val) ) {s = 27;}

                         
                        input.seek(index29_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA29_1 = input.LA(1);

                         
                        int index29_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_babel17()) ) {s = 28;}

                        else if ( (synpred2_babel17()) ) {s = 26;}

                        else if ( (synpred3_babel17()) ) {s = 29;}

                        else if ( (synpred4_babel17()) ) {s = 30;}

                        else if ( (synpred5_babel17()) ) {s = 31;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index29_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA29_2 = input.LA(1);

                         
                        int index29_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 26;}

                        else if ( (synpred4_babel17()) ) {s = 30;}

                        else if ( (synpred5_babel17()) ) {s = 31;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index29_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA29_3 = input.LA(1);

                         
                        int index29_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 26;}

                        else if ( (synpred4_babel17()) ) {s = 30;}

                        else if ( (synpred5_babel17()) ) {s = 31;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index29_3);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA29_4 = input.LA(1);

                         
                        int index29_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 26;}

                        else if ( (synpred4_babel17()) ) {s = 30;}

                        else if ( (synpred5_babel17()) ) {s = 31;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index29_4);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA29_5 = input.LA(1);

                         
                        int index29_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 26;}

                        else if ( (synpred4_babel17()) ) {s = 30;}

                        else if ( (synpred5_babel17()) ) {s = 31;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index29_5);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA29_6 = input.LA(1);

                         
                        int index29_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 26;}

                        else if ( (synpred4_babel17()) ) {s = 30;}

                        else if ( (synpred5_babel17()) ) {s = 31;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index29_6);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA29_7 = input.LA(1);

                         
                        int index29_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 26;}

                        else if ( (synpred4_babel17()) ) {s = 30;}

                        else if ( (synpred5_babel17()) ) {s = 31;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index29_7);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA29_8 = input.LA(1);

                         
                        int index29_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 26;}

                        else if ( (synpred4_babel17()) ) {s = 30;}

                        else if ( (synpred5_babel17()) ) {s = 31;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index29_8);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA29_9 = input.LA(1);

                         
                        int index29_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 26;}

                        else if ( (synpred4_babel17()) ) {s = 30;}

                        else if ( (synpred5_babel17()) ) {s = 31;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index29_9);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA29_10 = input.LA(1);

                         
                        int index29_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 26;}

                        else if ( (synpred4_babel17()) ) {s = 30;}

                        else if ( (synpred5_babel17()) ) {s = 31;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index29_10);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA29_11 = input.LA(1);

                         
                        int index29_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 26;}

                        else if ( (synpred4_babel17()) ) {s = 30;}

                        else if ( (synpred5_babel17()) ) {s = 31;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index29_11);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA29_12 = input.LA(1);

                         
                        int index29_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 26;}

                        else if ( (synpred4_babel17()) ) {s = 30;}

                        else if ( (synpred5_babel17()) ) {s = 31;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index29_12);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA29_13 = input.LA(1);

                         
                        int index29_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 26;}

                        else if ( (synpred4_babel17()) ) {s = 30;}

                        else if ( (synpred5_babel17()) ) {s = 31;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index29_13);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA29_14 = input.LA(1);

                         
                        int index29_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 26;}

                        else if ( (synpred4_babel17()) ) {s = 30;}

                        else if ( (synpred5_babel17()) ) {s = 31;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index29_14);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA29_15 = input.LA(1);

                         
                        int index29_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 26;}

                        else if ( (synpred4_babel17()) ) {s = 30;}

                        else if ( (synpred5_babel17()) ) {s = 31;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index29_15);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA29_22 = input.LA(1);

                         
                        int index29_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index29_22);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 29, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA58_eotS =
        "\23\uffff";
    static final String DFA58_eofS =
        "\23\uffff";
    static final String DFA58_minS =
        "\1\123\10\uffff\1\123\2\uffff\1\74\1\123\2\uffff\1\74\2\uffff";
    static final String DFA58_maxS =
        "\1\u0099\10\uffff\1\u0090\2\uffff\1\u0099\1\u0090\2\uffff\1\u0099"+
        "\2\uffff";
    static final String DFA58_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\uffff\1\13\1\14\2\uffff"+
        "\1\11\1\12\1\uffff\1\16\1\15";
    static final String DFA58_specialS =
        "\23\uffff}>";
    static final String[] DFA58_transitionS = {
            "\2\10\4\uffff\1\5\1\6\2\uffff\1\7\23\uffff\1\11\35\uffff\1\1"+
            "\1\4\1\uffff\1\3\1\13\1\uffff\1\12\1\uffff\1\14\1\uffff\1\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\16\70\uffff\1\15\2\uffff\1\17",
            "",
            "",
            "\1\22\1\uffff\3\22\3\uffff\2\22\2\uffff\1\22\2\uffff\1\22\2"+
            "\uffff\1\22\2\uffff\1\22\1\uffff\5\22\1\uffff\5\22\4\uffff\1"+
            "\22\16\uffff\1\22\5\uffff\1\22\2\uffff\1\22\10\uffff\2\21\2"+
            "\22\3\uffff\1\22\2\uffff\1\20\3\22\1\uffff\2\22\1\uffff\1\22"+
            "\1\uffff\3\22",
            "\2\16\73\uffff\1\17",
            "",
            "",
            "\1\22\1\uffff\3\22\3\uffff\2\22\2\uffff\1\22\2\uffff\1\22\2"+
            "\uffff\1\22\2\uffff\1\22\1\uffff\5\22\1\uffff\5\22\4\uffff\1"+
            "\22\16\uffff\1\22\5\uffff\1\22\2\uffff\1\22\10\uffff\2\21\2"+
            "\22\3\uffff\1\22\3\uffff\3\22\1\uffff\2\22\1\uffff\1\22\1\uffff"+
            "\3\22",
            "",
            ""
    };

    static final short[] DFA58_eot = DFA.unpackEncodedString(DFA58_eotS);
    static final short[] DFA58_eof = DFA.unpackEncodedString(DFA58_eofS);
    static final char[] DFA58_min = DFA.unpackEncodedStringToUnsignedChars(DFA58_minS);
    static final char[] DFA58_max = DFA.unpackEncodedStringToUnsignedChars(DFA58_maxS);
    static final short[] DFA58_accept = DFA.unpackEncodedString(DFA58_acceptS);
    static final short[] DFA58_special = DFA.unpackEncodedString(DFA58_specialS);
    static final short[][] DFA58_transition;

    static {
        int numStates = DFA58_transitionS.length;
        DFA58_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA58_transition[i] = DFA.unpackEncodedString(DFA58_transitionS[i]);
        }
    }

    class DFA58 extends DFA {

        public DFA58(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 58;
            this.eot = DFA58_eot;
            this.eof = DFA58_eof;
            this.min = DFA58_min;
            this.max = DFA58_max;
            this.accept = DFA58_accept;
            this.special = DFA58_special;
            this.transition = DFA58_transition;
        }
        public String getDescription() {
            return "415:1: primitive_pattern : ( Id | '_' -> ANY | String | Num | L_true | L_false | L_nil | token_infinity | '-' ( NL )? token_infinity -> ^( UMINUS token_infinity ) | '-' ( NL )? Num -> ^( UMINUS Num ) | '[' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* )? ']' -> ^( SQUARE_LIST ( bracket_pattern )* ) | '(' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* ( COMMA ( NL )? )? )? ')' -> ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( bracket_pattern )* ) ) | '{' ( NL )? ( mselem_pattern ( NL )? ( COMMA ( NL )? mselem_pattern ( NL )? )* )? '}' -> ^( MAP_OR_SET_OR_OBJ ( mselem_pattern )* ) | '{' ( NL )? token_ARROW ( NL )? '}' -> ^( EMPTY_MAP ) );";
        }
    }
    static final String DFA64_eotS =
        "\4\uffff";
    static final String DFA64_eofS =
        "\2\3\2\uffff";
    static final String DFA64_minS =
        "\2\74\2\uffff";
    static final String DFA64_maxS =
        "\2\u009e\2\uffff";
    static final String DFA64_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA64_specialS =
        "\4\uffff}>";
    static final String[] DFA64_transitionS = {
            "\1\2\1\3\3\2\1\uffff\2\3\2\2\1\uffff\2\2\1\3\1\uffff\2\2\1\uffff"+
            "\1\2\2\uffff\1\2\1\uffff\13\2\2\uffff\5\2\12\uffff\1\1\1\uffff"+
            "\1\2\5\uffff\1\2\2\uffff\1\2\12\uffff\2\2\3\uffff\1\2\2\uffff"+
            "\1\1\3\2\1\uffff\2\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\2\1\uffff"+
            "\4\2",
            "\1\2\1\3\3\2\1\uffff\2\3\2\2\1\uffff\2\2\1\3\1\uffff\2\2\1"+
            "\uffff\1\2\2\uffff\1\2\1\uffff\13\2\2\uffff\5\2\12\uffff\1\1"+
            "\1\uffff\1\2\5\uffff\1\2\2\uffff\1\2\12\uffff\2\2\3\uffff\1"+
            "\2\2\uffff\1\1\3\2\1\uffff\2\2\1\uffff\1\2\1\uffff\1\2\1\uffff"+
            "\1\2\1\uffff\4\2",
            "",
            ""
    };

    static final short[] DFA64_eot = DFA.unpackEncodedString(DFA64_eotS);
    static final short[] DFA64_eof = DFA.unpackEncodedString(DFA64_eofS);
    static final char[] DFA64_min = DFA.unpackEncodedStringToUnsignedChars(DFA64_minS);
    static final char[] DFA64_max = DFA.unpackEncodedStringToUnsignedChars(DFA64_maxS);
    static final short[] DFA64_accept = DFA.unpackEncodedString(DFA64_acceptS);
    static final short[] DFA64_special = DFA.unpackEncodedString(DFA64_specialS);
    static final short[][] DFA64_transition;

    static {
        int numStates = DFA64_transitionS.length;
        DFA64_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA64_transition[i] = DFA.unpackEncodedString(DFA64_transitionS[i]);
        }
    }

    class DFA64 extends DFA {

        public DFA64(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 64;
            this.eot = DFA64_eot;
            this.eof = DFA64_eof;
            this.min = DFA64_min;
            this.max = DFA64_max;
            this.accept = DFA64_accept;
            this.special = DFA64_special;
            this.transition = DFA64_transition;
        }
        public String getDescription() {
            return "437:1: block : ( ( sep )? statement ( sep statement )* ( sep )? -> ^( BLOCK ( statement )* ) | ( sep )? -> ^( BLOCK ) );";
        }
    }
    static final String DFA61_eotS =
        "\4\uffff";
    static final String DFA61_eofS =
        "\2\2\2\uffff";
    static final String DFA61_minS =
        "\1\75\1\74\2\uffff";
    static final String DFA61_maxS =
        "\1\u008d\1\u009e\2\uffff";
    static final String DFA61_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA61_specialS =
        "\4\uffff}>";
    static final String[] DFA61_transitionS = {
            "\1\2\4\uffff\2\2\5\uffff\1\2\45\uffff\1\1\35\uffff\1\1",
            "\1\3\1\2\3\3\1\uffff\2\2\2\3\1\uffff\2\3\1\2\1\uffff\2\3\1"+
            "\uffff\1\3\2\uffff\1\3\1\uffff\13\3\2\uffff\5\3\12\uffff\1\1"+
            "\1\uffff\1\3\5\uffff\1\3\2\uffff\1\3\12\uffff\2\3\3\uffff\1"+
            "\3\2\uffff\1\1\3\3\1\uffff\2\3\1\uffff\1\3\1\uffff\1\3\1\uffff"+
            "\1\3\1\uffff\4\3",
            "",
            ""
    };

    static final short[] DFA61_eot = DFA.unpackEncodedString(DFA61_eotS);
    static final short[] DFA61_eof = DFA.unpackEncodedString(DFA61_eofS);
    static final char[] DFA61_min = DFA.unpackEncodedStringToUnsignedChars(DFA61_minS);
    static final char[] DFA61_max = DFA.unpackEncodedStringToUnsignedChars(DFA61_maxS);
    static final short[] DFA61_accept = DFA.unpackEncodedString(DFA61_acceptS);
    static final short[] DFA61_special = DFA.unpackEncodedString(DFA61_specialS);
    static final short[][] DFA61_transition;

    static {
        int numStates = DFA61_transitionS.length;
        DFA61_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA61_transition[i] = DFA.unpackEncodedString(DFA61_transitionS[i]);
        }
    }

    class DFA61 extends DFA {

        public DFA61(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 61;
            this.eot = DFA61_eot;
            this.eof = DFA61_eof;
            this.min = DFA61_min;
            this.max = DFA61_max;
            this.accept = DFA61_accept;
            this.special = DFA61_special;
            this.transition = DFA61_transition;
        }
        public String getDescription() {
            return "()* loopback of 437:25: ( sep statement )*";
        }
    }
    static final String DFA66_eotS =
        "\16\uffff";
    static final String DFA66_eofS =
        "\16\uffff";
    static final String DFA66_minS =
        "\1\74\15\uffff";
    static final String DFA66_maxS =
        "\1\u009e\15\uffff";
    static final String DFA66_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15";
    static final String DFA66_specialS =
        "\16\uffff}>";
    static final String[] DFA66_transitionS = {
            "\1\11\1\uffff\3\11\3\uffff\2\11\1\uffff\1\4\1\11\2\uffff\1\2"+
            "\1\3\1\uffff\1\11\2\uffff\1\11\1\uffff\5\11\1\5\5\11\2\uffff"+
            "\1\7\1\1\1\11\1\6\1\10\14\uffff\1\11\5\uffff\1\11\2\uffff\1"+
            "\11\12\uffff\2\11\3\uffff\1\11\3\uffff\3\11\1\uffff\2\11\1\uffff"+
            "\1\11\1\uffff\1\11\1\uffff\1\11\1\uffff\1\13\1\12\1\15\1\14",
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

    static final short[] DFA66_eot = DFA.unpackEncodedString(DFA66_eotS);
    static final short[] DFA66_eof = DFA.unpackEncodedString(DFA66_eofS);
    static final char[] DFA66_min = DFA.unpackEncodedStringToUnsignedChars(DFA66_minS);
    static final char[] DFA66_max = DFA.unpackEncodedStringToUnsignedChars(DFA66_maxS);
    static final short[] DFA66_accept = DFA.unpackEncodedString(DFA66_acceptS);
    static final short[] DFA66_special = DFA.unpackEncodedString(DFA66_specialS);
    static final short[][] DFA66_transition;

    static {
        int numStates = DFA66_transitionS.length;
        DFA66_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA66_transition[i] = DFA.unpackEncodedString(DFA66_transitionS[i]);
        }
    }

    class DFA66 extends DFA {

        public DFA66(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 66;
            this.eot = DFA66_eot;
            this.eof = DFA66_eof;
            this.min = DFA66_min;
            this.max = DFA66_max;
            this.accept = DFA66_accept;
            this.special = DFA66_special;
            this.transition = DFA66_transition;
        }
        public String getDescription() {
            return "443:1: statement : ( st_typedef | st_val | st_def | st_yield | st_memoize | st_private | st_module | st_import | expr_or_assign | PRAGMA_PRINT expr -> ^( PRAGMA_PRINT expr ) | PRAGMA_LOG expr -> ^( PRAGMA_LOG expr ) | PRAGMA_PROFILE expr -> ^( PRAGMA_PROFILE expr ) | PRAGMA_ASSERT expr -> ^( PRAGMA_ASSERT expr ) );";
        }
    }
    static final String DFA92_eotS =
        "\17\uffff";
    static final String DFA92_eofS =
        "\17\uffff";
    static final String DFA92_minS =
        "\1\123\14\0\2\uffff";
    static final String DFA92_maxS =
        "\1\u0099\14\0\2\uffff";
    static final String DFA92_acceptS =
        "\15\uffff\1\1\1\2";
    static final String DFA92_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\2\uffff}>";
    static final String[] DFA92_transitionS = {
            "\2\10\4\uffff\1\5\1\6\2\uffff\1\7\23\uffff\1\11\35\uffff\1\1"+
            "\1\4\1\uffff\1\3\1\13\1\uffff\1\12\1\uffff\1\14\1\uffff\1\2",
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
            ""
    };

    static final short[] DFA92_eot = DFA.unpackEncodedString(DFA92_eotS);
    static final short[] DFA92_eof = DFA.unpackEncodedString(DFA92_eofS);
    static final char[] DFA92_min = DFA.unpackEncodedStringToUnsignedChars(DFA92_minS);
    static final char[] DFA92_max = DFA.unpackEncodedStringToUnsignedChars(DFA92_maxS);
    static final short[] DFA92_accept = DFA.unpackEncodedString(DFA92_acceptS);
    static final short[] DFA92_special = DFA.unpackEncodedString(DFA92_specialS);
    static final short[][] DFA92_transition;

    static {
        int numStates = DFA92_transitionS.length;
        DFA92_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA92_transition[i] = DFA.unpackEncodedString(DFA92_transitionS[i]);
        }
    }

    class DFA92 extends DFA {

        public DFA92(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 92;
            this.eot = DFA92_eot;
            this.eof = DFA92_eof;
            this.min = DFA92_min;
            this.max = DFA92_max;
            this.accept = DFA92_accept;
            this.special = DFA92_special;
            this.transition = DFA92_transition;
        }
        public String getDescription() {
            return "470:1: typedef_clause : ( ( primitive_pattern ( NL )? '=' )=> primitive_pattern ( NL )? '=' ( NL )? expr -> ^( TYPEDEF_CLAUSE primitive_pattern expr ) | primitive_pattern -> ^( TYPEDEF_CLAUSE primitive_pattern ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA92_1 = input.LA(1);

                         
                        int index92_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_babel17()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index92_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA92_2 = input.LA(1);

                         
                        int index92_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_babel17()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index92_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA92_3 = input.LA(1);

                         
                        int index92_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_babel17()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index92_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA92_4 = input.LA(1);

                         
                        int index92_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_babel17()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index92_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA92_5 = input.LA(1);

                         
                        int index92_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_babel17()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index92_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA92_6 = input.LA(1);

                         
                        int index92_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_babel17()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index92_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA92_7 = input.LA(1);

                         
                        int index92_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_babel17()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index92_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA92_8 = input.LA(1);

                         
                        int index92_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_babel17()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index92_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA92_9 = input.LA(1);

                         
                        int index92_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_babel17()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index92_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA92_10 = input.LA(1);

                         
                        int index92_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_babel17()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index92_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA92_11 = input.LA(1);

                         
                        int index92_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_babel17()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index92_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA92_12 = input.LA(1);

                         
                        int index92_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_babel17()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index92_12);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 92, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA109_eotS =
        "\34\uffff";
    static final String DFA109_eofS =
        "\34\uffff";
    static final String DFA109_minS =
        "\1\74\17\0\14\uffff";
    static final String DFA109_maxS =
        "\1\u0099\17\0\14\uffff";
    static final String DFA109_acceptS =
        "\20\uffff\1\2\12\uffff\1\1";
    static final String DFA109_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\14\uffff}>";
    static final String[] DFA109_transitionS = {
            "\1\20\1\uffff\3\20\3\uffff\2\20\2\uffff\1\20\5\uffff\1\16\2"+
            "\uffff\1\20\1\uffff\2\11\3\20\1\uffff\1\6\1\7\2\20\1\10\4\uffff"+
            "\1\20\16\uffff\1\12\5\uffff\1\20\2\uffff\1\20\12\uffff\2\17"+
            "\3\uffff\1\20\3\uffff\1\1\1\2\1\5\1\uffff\1\4\1\14\1\uffff\1"+
            "\13\1\uffff\1\15\1\uffff\1\3",
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

    static final short[] DFA109_eot = DFA.unpackEncodedString(DFA109_eotS);
    static final short[] DFA109_eof = DFA.unpackEncodedString(DFA109_eofS);
    static final char[] DFA109_min = DFA.unpackEncodedStringToUnsignedChars(DFA109_minS);
    static final char[] DFA109_max = DFA.unpackEncodedStringToUnsignedChars(DFA109_maxS);
    static final short[] DFA109_accept = DFA.unpackEncodedString(DFA109_acceptS);
    static final short[] DFA109_special = DFA.unpackEncodedString(DFA109_specialS);
    static final short[][] DFA109_transition;

    static {
        int numStates = DFA109_transitionS.length;
        DFA109_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA109_transition[i] = DFA.unpackEncodedString(DFA109_transitionS[i]);
        }
    }

    class DFA109 extends DFA {

        public DFA109(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 109;
            this.eot = DFA109_eot;
            this.eof = DFA109_eof;
            this.min = DFA109_min;
            this.max = DFA109_max;
            this.accept = DFA109_accept;
            this.special = DFA109_special;
            this.transition = DFA109_transition;
        }
        public String getDescription() {
            return "499:1: expr_or_assign : ( ( ( pattern | objelem_assign ) ( NL )? '=' )=> ( pattern | objelem_assign ) ( NL )? '=' ( NL )? expr -> ^( ASSIGN ( pattern )* ( objelem_assign )* expr ) | expr );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA109_1 = input.LA(1);

                         
                        int index109_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index109_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA109_2 = input.LA(1);

                         
                        int index109_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index109_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA109_3 = input.LA(1);

                         
                        int index109_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index109_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA109_4 = input.LA(1);

                         
                        int index109_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index109_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA109_5 = input.LA(1);

                         
                        int index109_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index109_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA109_6 = input.LA(1);

                         
                        int index109_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index109_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA109_7 = input.LA(1);

                         
                        int index109_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index109_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA109_8 = input.LA(1);

                         
                        int index109_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index109_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA109_9 = input.LA(1);

                         
                        int index109_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index109_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA109_10 = input.LA(1);

                         
                        int index109_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index109_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA109_11 = input.LA(1);

                         
                        int index109_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index109_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA109_12 = input.LA(1);

                         
                        int index109_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index109_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA109_13 = input.LA(1);

                         
                        int index109_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index109_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA109_14 = input.LA(1);

                         
                        int index109_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index109_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA109_15 = input.LA(1);

                         
                        int index109_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index109_15);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 109, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA119_eotS =
        "\33\uffff";
    static final String DFA119_eofS =
        "\33\uffff";
    static final String DFA119_minS =
        "\1\74\3\0\1\uffff\12\0\14\uffff";
    static final String DFA119_maxS =
        "\1\u0099\3\0\1\uffff\12\0\14\uffff";
    static final String DFA119_acceptS =
        "\4\uffff\1\2\12\uffff\1\2\1\3\11\uffff\1\1";
    static final String DFA119_specialS =
        "\1\0\1\1\1\2\1\3\1\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\14\uffff}>";
    static final String[] DFA119_transitionS = {
            "\1\20\2\uffff\2\20\3\uffff\2\20\2\uffff\1\20\5\uffff\1\16\2"+
            "\uffff\1\20\1\uffff\2\12\3\20\1\uffff\1\7\1\10\2\20\1\11\4\uffff"+
            "\1\20\16\uffff\1\13\5\uffff\1\20\2\uffff\1\20\12\uffff\2\17"+
            "\3\uffff\1\20\3\uffff\1\2\1\3\1\6\1\uffff\1\5\1\1\1\uffff\1"+
            "\14\1\uffff\1\15\1\uffff\1\4",
            "\1\uffff",
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

    static final short[] DFA119_eot = DFA.unpackEncodedString(DFA119_eotS);
    static final short[] DFA119_eof = DFA.unpackEncodedString(DFA119_eofS);
    static final char[] DFA119_min = DFA.unpackEncodedStringToUnsignedChars(DFA119_minS);
    static final char[] DFA119_max = DFA.unpackEncodedStringToUnsignedChars(DFA119_maxS);
    static final short[] DFA119_accept = DFA.unpackEncodedString(DFA119_acceptS);
    static final short[] DFA119_special = DFA.unpackEncodedString(DFA119_specialS);
    static final short[][] DFA119_transition;

    static {
        int numStates = DFA119_transitionS.length;
        DFA119_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA119_transition[i] = DFA.unpackEncodedString(DFA119_transitionS[i]);
        }
    }

    class DFA119 extends DFA {

        public DFA119(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 119;
            this.eot = DFA119_eot;
            this.eof = DFA119_eof;
            this.min = DFA119_min;
            this.max = DFA119_max;
            this.accept = DFA119_accept;
            this.special = DFA119_special;
            this.transition = DFA119_transition;
        }
        public String getDescription() {
            return "538:1: lop_expr : ( ( lambda_expr )=> lambda_expr | ( lambda_expr_nobrackets )=> lambda_expr_nobrackets | op_expr );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA119_0 = input.LA(1);

                         
                        int index119_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA119_0==ROUND_BRACKET_OPEN) ) {s = 1;}

                        else if ( (LA119_0==Constr) ) {s = 2;}

                        else if ( (LA119_0==Id) ) {s = 3;}

                        else if ( (LA119_0==UNDERSCORE) && (synpred10_babel17())) {s = 4;}

                        else if ( (LA119_0==String) ) {s = 5;}

                        else if ( (LA119_0==Num) ) {s = 6;}

                        else if ( (LA119_0==L_true) ) {s = 7;}

                        else if ( (LA119_0==L_false) ) {s = 8;}

                        else if ( (LA119_0==L_nil) ) {s = 9;}

                        else if ( ((LA119_0>=A_infinity && LA119_0<=U_infinity)) ) {s = 10;}

                        else if ( (LA119_0==MINUS) ) {s = 11;}

                        else if ( (LA119_0==SQUARE_BRACKET_OPEN) ) {s = 12;}

                        else if ( (LA119_0==CURLY_BRACKET_OPEN) ) {s = 13;}

                        else if ( (LA119_0==L_exception) ) {s = 14;}

                        else if ( ((LA119_0>=A_ELLIPSIS && LA119_0<=U_ELLIPSIS)) && (synpred10_babel17())) {s = 15;}

                        else if ( (LA119_0==L_begin||(LA119_0>=L_with && LA119_0<=L_if)||(LA119_0>=L_while && LA119_0<=L_for)||LA119_0==L_match||LA119_0==L_try||(LA119_0>=L_concurrent && LA119_0<=L_lazy)||(LA119_0>=L_this && LA119_0<=L_random)||LA119_0==L_typeof||LA119_0==A_NOT||LA119_0==U_NOT||LA119_0==L_force) ) {s = 16;}

                         
                        input.seek(index119_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA119_1 = input.LA(1);

                         
                        int index119_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_babel17()) ) {s = 26;}

                        else if ( (synpred10_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index119_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA119_2 = input.LA(1);

                         
                        int index119_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index119_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA119_3 = input.LA(1);

                         
                        int index119_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index119_3);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA119_5 = input.LA(1);

                         
                        int index119_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index119_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA119_6 = input.LA(1);

                         
                        int index119_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index119_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA119_7 = input.LA(1);

                         
                        int index119_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index119_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA119_8 = input.LA(1);

                         
                        int index119_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index119_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA119_9 = input.LA(1);

                         
                        int index119_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index119_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA119_10 = input.LA(1);

                         
                        int index119_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index119_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA119_11 = input.LA(1);

                         
                        int index119_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index119_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA119_12 = input.LA(1);

                         
                        int index119_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index119_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA119_13 = input.LA(1);

                         
                        int index119_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index119_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA119_14 = input.LA(1);

                         
                        int index119_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index119_14);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 119, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA120_eotS =
        "\33\uffff";
    static final String DFA120_eofS =
        "\33\uffff";
    static final String DFA120_minS =
        "\1\74\3\0\1\uffff\12\0\14\uffff";
    static final String DFA120_maxS =
        "\1\u0099\3\0\1\uffff\12\0\14\uffff";
    static final String DFA120_acceptS =
        "\4\uffff\1\2\12\uffff\1\2\1\3\11\uffff\1\1";
    static final String DFA120_specialS =
        "\1\0\1\1\1\2\1\3\1\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\14\uffff}>";
    static final String[] DFA120_transitionS = {
            "\1\20\2\uffff\2\20\3\uffff\2\20\2\uffff\1\20\5\uffff\1\16\2"+
            "\uffff\1\20\1\uffff\2\12\3\20\1\uffff\1\7\1\10\2\20\1\11\4\uffff"+
            "\1\20\16\uffff\1\13\5\uffff\1\20\2\uffff\1\20\12\uffff\2\17"+
            "\3\uffff\1\20\3\uffff\1\2\1\3\1\6\1\uffff\1\5\1\1\1\uffff\1"+
            "\14\1\uffff\1\15\1\uffff\1\4",
            "\1\uffff",
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

    static final short[] DFA120_eot = DFA.unpackEncodedString(DFA120_eotS);
    static final short[] DFA120_eof = DFA.unpackEncodedString(DFA120_eofS);
    static final char[] DFA120_min = DFA.unpackEncodedStringToUnsignedChars(DFA120_minS);
    static final char[] DFA120_max = DFA.unpackEncodedStringToUnsignedChars(DFA120_maxS);
    static final short[] DFA120_accept = DFA.unpackEncodedString(DFA120_acceptS);
    static final short[] DFA120_special = DFA.unpackEncodedString(DFA120_specialS);
    static final short[][] DFA120_transition;

    static {
        int numStates = DFA120_transitionS.length;
        DFA120_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA120_transition[i] = DFA.unpackEncodedString(DFA120_transitionS[i]);
        }
    }

    class DFA120 extends DFA {

        public DFA120(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 120;
            this.eot = DFA120_eot;
            this.eof = DFA120_eof;
            this.min = DFA120_min;
            this.max = DFA120_max;
            this.accept = DFA120_accept;
            this.special = DFA120_special;
            this.transition = DFA120_transition;
        }
        public String getDescription() {
            return "543:1: p_lop_expr : ( ( lambda_expr )=> lambda_expr | ( lambda_expr_nobrackets )=> lambda_expr_nobrackets | p_op_expr );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA120_0 = input.LA(1);

                         
                        int index120_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA120_0==ROUND_BRACKET_OPEN) ) {s = 1;}

                        else if ( (LA120_0==Constr) ) {s = 2;}

                        else if ( (LA120_0==Id) ) {s = 3;}

                        else if ( (LA120_0==UNDERSCORE) && (synpred12_babel17())) {s = 4;}

                        else if ( (LA120_0==String) ) {s = 5;}

                        else if ( (LA120_0==Num) ) {s = 6;}

                        else if ( (LA120_0==L_true) ) {s = 7;}

                        else if ( (LA120_0==L_false) ) {s = 8;}

                        else if ( (LA120_0==L_nil) ) {s = 9;}

                        else if ( ((LA120_0>=A_infinity && LA120_0<=U_infinity)) ) {s = 10;}

                        else if ( (LA120_0==MINUS) ) {s = 11;}

                        else if ( (LA120_0==SQUARE_BRACKET_OPEN) ) {s = 12;}

                        else if ( (LA120_0==CURLY_BRACKET_OPEN) ) {s = 13;}

                        else if ( (LA120_0==L_exception) ) {s = 14;}

                        else if ( ((LA120_0>=A_ELLIPSIS && LA120_0<=U_ELLIPSIS)) && (synpred12_babel17())) {s = 15;}

                        else if ( (LA120_0==L_begin||(LA120_0>=L_with && LA120_0<=L_if)||(LA120_0>=L_while && LA120_0<=L_for)||LA120_0==L_match||LA120_0==L_try||(LA120_0>=L_concurrent && LA120_0<=L_lazy)||(LA120_0>=L_this && LA120_0<=L_random)||LA120_0==L_typeof||LA120_0==A_NOT||LA120_0==U_NOT||LA120_0==L_force) ) {s = 16;}

                         
                        input.seek(index120_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA120_1 = input.LA(1);

                         
                        int index120_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_babel17()) ) {s = 26;}

                        else if ( (synpred12_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index120_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA120_2 = input.LA(1);

                         
                        int index120_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index120_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA120_3 = input.LA(1);

                         
                        int index120_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index120_3);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA120_5 = input.LA(1);

                         
                        int index120_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index120_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA120_6 = input.LA(1);

                         
                        int index120_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index120_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA120_7 = input.LA(1);

                         
                        int index120_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index120_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA120_8 = input.LA(1);

                         
                        int index120_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index120_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA120_9 = input.LA(1);

                         
                        int index120_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index120_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA120_10 = input.LA(1);

                         
                        int index120_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index120_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA120_11 = input.LA(1);

                         
                        int index120_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index120_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA120_12 = input.LA(1);

                         
                        int index120_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index120_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA120_13 = input.LA(1);

                         
                        int index120_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index120_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA120_14 = input.LA(1);

                         
                        int index120_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index120_14);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 120, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA270_eotS =
        "\20\uffff";
    static final String DFA270_eofS =
        "\20\uffff";
    static final String DFA270_minS =
        "\1\74\10\uffff\1\74\4\uffff\1\74\1\uffff";
    static final String DFA270_maxS =
        "\1\u0097\10\uffff\1\u009a\4\uffff\1\u009a\1\uffff";
    static final String DFA270_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\uffff\1\12\1\13\1\14"+
        "\1\15\1\uffff\1\11";
    static final String DFA270_specialS =
        "\20\uffff}>";
    static final String[] DFA270_transitionS = {
            "\1\14\2\uffff\2\14\3\uffff\2\14\2\uffff\1\14\10\uffff\1\14\1"+
            "\uffff\2\12\4\uffff\1\5\1\6\1\7\1\uffff\1\10\60\uffff\1\4\1"+
            "\3\1\1\1\uffff\1\2\1\11\1\uffff\1\13\1\uffff\1\15",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\13\1\uffff\3\13\3\uffff\2\13\2\uffff\1\13\5\uffff\1\13\2"+
            "\uffff\1\13\1\uffff\5\13\1\uffff\5\13\4\uffff\1\13\16\uffff"+
            "\1\13\5\uffff\1\13\2\uffff\1\13\12\uffff\2\13\3\uffff\1\13\2"+
            "\uffff\1\16\3\13\1\uffff\4\13\1\uffff\1\13\1\uffff\1\13\1\17",
            "",
            "",
            "",
            "",
            "\1\13\1\uffff\3\13\3\uffff\2\13\2\uffff\1\13\5\uffff\1\13\2"+
            "\uffff\1\13\1\uffff\5\13\1\uffff\5\13\4\uffff\1\13\16\uffff"+
            "\1\13\5\uffff\1\13\2\uffff\1\13\12\uffff\2\13\3\uffff\1\13\3"+
            "\uffff\3\13\1\uffff\4\13\1\uffff\1\13\1\uffff\1\13\1\17",
            ""
    };

    static final short[] DFA270_eot = DFA.unpackEncodedString(DFA270_eotS);
    static final short[] DFA270_eof = DFA.unpackEncodedString(DFA270_eofS);
    static final char[] DFA270_min = DFA.unpackEncodedStringToUnsignedChars(DFA270_minS);
    static final char[] DFA270_max = DFA.unpackEncodedStringToUnsignedChars(DFA270_maxS);
    static final short[] DFA270_accept = DFA.unpackEncodedString(DFA270_acceptS);
    static final short[] DFA270_special = DFA.unpackEncodedString(DFA270_specialS);
    static final short[][] DFA270_transition;

    static {
        int numStates = DFA270_transitionS.length;
        DFA270_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA270_transition[i] = DFA.unpackEncodedString(DFA270_transitionS[i]);
        }
    }

    class DFA270 extends DFA {

        public DFA270(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 270;
            this.eot = DFA270_eot;
            this.eof = DFA270_eof;
            this.min = DFA270_min;
            this.max = DFA270_max;
            this.accept = DFA270_accept;
            this.special = DFA270_special;
            this.transition = DFA270_transition;
        }
        public String getDescription() {
            return "732:1: primitive_expr : ( Num | String | Id | Constr | L_true | L_false | L_this | L_nil | type_expr | token_infinity | list_expr | with_control_expr | map_or_set_expr );";
        }
    }
 

    public static final BitSet FOLLOW_block_in_prog228 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_prog230 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_Id_in_typeid1647 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000002100L});
    public static final BitSet FOLLOW_NL_in_typeid1650 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_PERIOD_in_typeid1653 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000A000L});
    public static final BitSet FOLLOW_NL_in_typeid1655 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_Id_in_typeid1658 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000002100L});
    public static final BitSet FOLLOW_typeid_in_typeannotation1678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_val_in_typeannotation1683 = new BitSet(new long[]{0xD000000000000000L,0x048200043EFA4131L,0x0000000002ADE460L});
    public static final BitSet FOLLOW_NL_in_typeannotation1685 = new BitSet(new long[]{0xD000000000000000L,0x048200043EFA4131L,0x0000000002ADE460L});
    public static final BitSet FOLLOW_protected_expr_nc_in_typeannotation1688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Constr_in_pattern1705 = new BitSet(new long[]{0x0000000000000002L,0x0002000026184000L,0x0000000002ADE060L});
    public static final BitSet FOLLOW_NL_in_pattern1708 = new BitSet(new long[]{0x0000000000000000L,0x0002000026184000L,0x0000000002ADC060L});
    public static final BitSet FOLLOW_pattern_in_pattern1711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitive_pattern_in_pattern1727 = new BitSet(new long[]{0x0000000000000002L,0x1800000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_NL_in_pattern1730 = new BitSet(new long[]{0x0000000000000000L,0x1800000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_token_DOUBLE_COLON_in_pattern1733 = new BitSet(new long[]{0x0000000000000000L,0x0002000026180000L,0x0000000002ADA000L});
    public static final BitSet FOLLOW_NL_in_pattern1735 = new BitSet(new long[]{0x0000000000000000L,0x0002000026180000L,0x0000000002AD8000L});
    public static final BitSet FOLLOW_primitive_pattern_in_pattern1738 = new BitSet(new long[]{0x0000000000000002L,0x1800000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_L_exception_in_pattern1757 = new BitSet(new long[]{0x0000000000000000L,0x0002000026184000L,0x0000000002ADE060L});
    public static final BitSet FOLLOW_NL_in_pattern1759 = new BitSet(new long[]{0x0000000000000000L,0x0002000026184000L,0x0000000002ADC060L});
    public static final BitSet FOLLOW_pattern_in_pattern1762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_ELLIPSIS_in_pattern1775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Id_in_bracket_pattern1802 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L,0x0000000000002000L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1804 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_L_as_in_bracket_pattern1807 = new BitSet(new long[]{0x0000000000000000L,0x0002000026184000L,0x0000000002ADE060L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1809 = new BitSet(new long[]{0x0000000000000000L,0x0002000026184000L,0x0000000002ADC060L});
    public static final BitSet FOLLOW_pattern_in_bracket_pattern1812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protected_expr_in_bracket_pattern1841 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002200L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1843 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_QUESTION_MARK_in_bracket_pattern1846 = new BitSet(new long[]{0x0000000000000002L,0x0002000026184000L,0x0000000002ADE060L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1849 = new BitSet(new long[]{0x0000000000000000L,0x0002000026184000L,0x0000000002ADC060L});
    public static final BitSet FOLLOW_pattern_in_bracket_pattern1852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Id_in_bracket_pattern1878 = new BitSet(new long[]{0x0000000000000000L,0x0002000026184000L,0x0000000002ADC060L});
    public static final BitSet FOLLOW_pattern_in_bracket_pattern1880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_val_in_bracket_pattern1895 = new BitSet(new long[]{0xD000000000000000L,0x048200043EFA4131L,0x0000000002ADE460L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1897 = new BitSet(new long[]{0xD000000000000000L,0x048200043EFA4131L,0x0000000002ADE460L});
    public static final BitSet FOLLOW_protected_expr_nc_in_bracket_pattern1900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_for_in_bracket_pattern1919 = new BitSet(new long[]{0xF000000000000000L,0x048200043EFA4931L,0x0000000002ADE460L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1921 = new BitSet(new long[]{0xF000000000000000L,0x048200043EFA4931L,0x0000000002ADE460L});
    public static final BitSet FOLLOW_bracket_pattern_in_bracket_pattern1925 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000000L,0x0000000000002080L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1929 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_COMMA_in_bracket_pattern1932 = new BitSet(new long[]{0xD000000000000000L,0x048200043EFA4931L,0x0000000002ADE460L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1934 = new BitSet(new long[]{0xD000000000000000L,0x048200043EFA4931L,0x0000000002ADE460L});
    public static final BitSet FOLLOW_bracket_pattern_in_bracket_pattern1937 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000000L,0x0000000000002080L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1942 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_L_end_in_bracket_pattern1947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_bracket_pattern1972 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L,0x0000000000002000L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1974 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_L_if_in_bracket_pattern1977 = new BitSet(new long[]{0xD000000000000000L,0x048200043EFA4131L,0x0000000002ADE460L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1979 = new BitSet(new long[]{0xD000000000000000L,0x048200043EFA4131L,0x0000000002ADE460L});
    public static final BitSet FOLLOW_protected_expr_nc_in_bracket_pattern1982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_bracket_pattern2008 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004002000L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern2010 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_COLON_in_bracket_pattern2013 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L,0x000000000000A000L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern2015 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L,0x000000000000A000L});
    public static final BitSet FOLLOW_typeannotation_in_bracket_pattern2018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_bracket_pattern2033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_ARROW_in_arrow_or_assign2043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGN_in_arrow_or_assign2054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracket_pattern_in_mselem_pattern2069 = new BitSet(new long[]{0x0000000200000002L,0x0000000000000000L,0x0000000000002018L});
    public static final BitSet FOLLOW_NL_in_mselem_pattern2072 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000000L,0x0000000000002018L});
    public static final BitSet FOLLOW_arrow_or_assign_in_mselem_pattern2075 = new BitSet(new long[]{0xD000000000000000L,0x048200043EFA4931L,0x0000000002ADE460L});
    public static final BitSet FOLLOW_NL_in_mselem_pattern2077 = new BitSet(new long[]{0xD000000000000000L,0x048200043EFA4931L,0x0000000002ADE460L});
    public static final BitSet FOLLOW_bracket_pattern_in_mselem_pattern2080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Id_in_primitive_pattern2109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNDERSCORE_in_primitive_pattern2114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_String_in_primitive_pattern2123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Num_in_primitive_pattern2128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_true_in_primitive_pattern2133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_false_in_primitive_pattern2138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_nil_in_primitive_pattern2143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_infinity_in_primitive_pattern2148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_primitive_pattern2153 = new BitSet(new long[]{0x0000000000000000L,0x0000000000180000L,0x0000000000002000L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2155 = new BitSet(new long[]{0x0000000000000000L,0x0000000000180000L});
    public static final BitSet FOLLOW_token_infinity_in_primitive_pattern2158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_primitive_pattern2171 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000012000L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2173 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_Num_in_primitive_pattern2176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SQUARE_BRACKET_OPEN_in_primitive_pattern2189 = new BitSet(new long[]{0xD000000000000000L,0x048200043EFA4931L,0x0000000002EDE460L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2192 = new BitSet(new long[]{0xD000000000000000L,0x048200043EFA4931L,0x0000000002EDE460L});
    public static final BitSet FOLLOW_bracket_pattern_in_primitive_pattern2196 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000402080L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2198 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400080L});
    public static final BitSet FOLLOW_COMMA_in_primitive_pattern2203 = new BitSet(new long[]{0xD000000000000000L,0x048200043EFA4931L,0x0000000002ADE460L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2205 = new BitSet(new long[]{0xD000000000000000L,0x048200043EFA4931L,0x0000000002ADE460L});
    public static final BitSet FOLLOW_bracket_pattern_in_primitive_pattern2208 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000402080L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2210 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400080L});
    public static final BitSet FOLLOW_SQUARE_BRACKET_CLOSE_in_primitive_pattern2218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROUND_BRACKET_OPEN_in_primitive_pattern2238 = new BitSet(new long[]{0xD000000000000000L,0x048200043EFA4931L,0x0000000002BDE460L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2241 = new BitSet(new long[]{0xD000000000000000L,0x048200043EFA4931L,0x0000000002BDE460L});
    public static final BitSet FOLLOW_bracket_pattern_in_primitive_pattern2245 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000102080L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2247 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100080L});
    public static final BitSet FOLLOW_COMMA_in_primitive_pattern2252 = new BitSet(new long[]{0xD000000000000000L,0x048200043EFA4931L,0x0000000002ADE460L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2255 = new BitSet(new long[]{0xD000000000000000L,0x048200043EFA4931L,0x0000000002ADE460L});
    public static final BitSet FOLLOW_bracket_pattern_in_primitive_pattern2258 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000102080L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2260 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100080L});
    public static final BitSet FOLLOW_COMMA_in_primitive_pattern2266 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000102000L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2268 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_ROUND_BRACKET_CLOSE_in_primitive_pattern2275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURLY_BRACKET_OPEN_in_primitive_pattern2307 = new BitSet(new long[]{0xD000000000000000L,0x048200043EFA4931L,0x0000000003ADE460L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2310 = new BitSet(new long[]{0xD000000000000000L,0x048200043EFA4931L,0x0000000003ADE460L});
    public static final BitSet FOLLOW_mselem_pattern_in_primitive_pattern2314 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001002080L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2316 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000080L});
    public static final BitSet FOLLOW_COMMA_in_primitive_pattern2321 = new BitSet(new long[]{0xD000000000000000L,0x048200043EFA4931L,0x0000000002ADE460L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2324 = new BitSet(new long[]{0xD000000000000000L,0x048200043EFA4931L,0x0000000002ADE460L});
    public static final BitSet FOLLOW_mselem_pattern_in_primitive_pattern2327 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001002080L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2329 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000080L});
    public static final BitSet FOLLOW_CURLY_BRACKET_CLOSE_in_primitive_pattern2337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURLY_BRACKET_OPEN_in_primitive_pattern2355 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002018L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2357 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_token_ARROW_in_primitive_pattern2360 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001002000L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2362 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_CURLY_BRACKET_CLOSE_in_primitive_pattern2365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_sep2381 = new BitSet(new long[]{0x0000000000000002L,0x0000800000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_sep_in_block2397 = new BitSet(new long[]{0xD000000000000000L,0x0482001F3FFA59B1L,0x000000007AADE460L});
    public static final BitSet FOLLOW_statement_in_block2400 = new BitSet(new long[]{0x0000000000000002L,0x0000800000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_sep_in_block2403 = new BitSet(new long[]{0xD000000000000000L,0x0482001F3FFA59B1L,0x000000007AADE460L});
    public static final BitSet FOLLOW_statement_in_block2405 = new BitSet(new long[]{0x0000000000000002L,0x0000800000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_sep_in_block2409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sep_in_block2425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_pure_block2442 = new BitSet(new long[]{0x0000000000000002L,0x0000800000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_sep_in_pure_block2445 = new BitSet(new long[]{0xD000000000000000L,0x0482001F3FFA59B1L,0x000000007AADE460L});
    public static final BitSet FOLLOW_statement_in_pure_block2447 = new BitSet(new long[]{0x0000000000000002L,0x0000800000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_st_typedef_in_statement2468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_val_in_statement2479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_def_in_statement2484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_yield_in_statement2489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_memoize_in_statement2494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_private_in_statement2499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_module_in_statement2504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_import_in_statement2509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_or_assign_in_statement2514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRAGMA_PRINT_in_statement2520 = new BitSet(new long[]{0xD000000000000000L,0x048200043EFA4131L,0x0000000002ADE460L});
    public static final BitSet FOLLOW_expr_in_statement2522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRAGMA_LOG_in_statement2536 = new BitSet(new long[]{0xD000000000000000L,0x048200043EFA4131L,0x0000000002ADE460L});
    public static final BitSet FOLLOW_expr_in_statement2538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRAGMA_PROFILE_in_statement2552 = new BitSet(new long[]{0xD000000000000000L,0x048200043EFA4131L,0x0000000002ADE460L});
    public static final BitSet FOLLOW_expr_in_statement2554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRAGMA_ASSERT_in_statement2568 = new BitSet(new long[]{0xD000000000000000L,0x048200043EFA4131L,0x0000000002ADE460L});
    public static final BitSet FOLLOW_expr_in_statement2570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Id_in_objelem_assign2588 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_PERIOD_in_objelem_assign2590 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_Id_in_objelem_assign2592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_val_in_st_val2611 = new BitSet(new long[]{0x0000000000000000L,0x0002000026184000L,0x0000000002ADE060L});
    public static final BitSet FOLLOW_NL_in_st_val2613 = new BitSet(new long[]{0x0000000000000000L,0x0002000026184000L,0x0000000002ADC060L});
    public static final BitSet FOLLOW_pattern_in_st_val2617 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_objelem_assign_in_st_val2621 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_NL_in_st_val2624 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ASSIGN_in_st_val2627 = new BitSet(new long[]{0xD000000000000000L,0x048200043EFA4131L,0x0000000002ADE460L});
    public static final BitSet FOLLOW_NL_in_st_val2629 = new BitSet(new long[]{0xD000000000000000L,0x048200043EFA4131L,0x0000000002ADE460L});
    public static final BitSet FOLLOW_expr_in_st_val2632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_def_in_st_def2656 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000A000L});
    public static final BitSet FOLLOW_NL_in_st_def2658 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_Id_in_st_def2661 = new BitSet(new long[]{0x0000000200000000L,0x0002000026180000L,0x0000000006ADA000L});
    public static final BitSet FOLLOW_NL_in_st_def2663 = new BitSet(new long[]{0x0000000200000000L,0x0002000026180000L,0x0000000006AD8000L});
    public static final BitSet FOLLOW_primitive_pattern_in_st_def2667 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000000L,0x0000000004002000L});
    public static final BitSet FOLLOW_NL_in_st_def2669 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_COLON_in_st_def2675 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000A000L});
    public static final BitSet FOLLOW_NL_in_st_def2677 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_typeid_in_st_def2680 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_NL_in_st_def2682 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ASSIGN_in_st_def2687 = new BitSet(new long[]{0xD000000000000000L,0x048200043EFA4131L,0x0000000002ADE460L});
    public static final BitSet FOLLOW_NL_in_st_def2689 = new BitSet(new long[]{0xD000000000000000L,0x048200043EFA4131L,0x0000000002ADE460L});
    public static final BitSet FOLLOW_expr_in_st_def2692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_def_in_st_def2718 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_NL_in_st_def2720 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_L_this_in_st_def2723 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004002000L});
    public static final BitSet FOLLOW_NL_in_st_def2725 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_COLON_in_st_def2728 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000A000L});
    public static final BitSet FOLLOW_NL_in_st_def2730 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_typeid_in_st_def2733 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_NL_in_st_def2735 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ASSIGN_in_st_def2738 = new BitSet(new long[]{0xD000000000000000L,0x048200043EFA4131L,0x0000000002ADE460L});
    public static final BitSet FOLLOW_NL_in_st_def2740 = new BitSet(new long[]{0xD000000000000000L,0x048200043EFA4131L,0x0000000002ADE460L});
    public static final BitSet FOLLOW_expr_in_st_def2743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_typedef_in_st_typedef2766 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000A000L});
    public static final BitSet FOLLOW_NL_in_st_typedef2768 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_Id_in_st_typedef2771 = new BitSet(new long[]{0x0000000000000000L,0x0002000026180000L,0x0000000002ADA000L});
    public static final BitSet FOLLOW_NL_in_st_typedef2773 = new BitSet(new long[]{0x0000000000000000L,0x0002000026180000L,0x0000000002ADA000L});
    public static final BitSet FOLLOW_typedef_clause_in_st_typedef2776 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000002080L});
    public static final BitSet FOLLOW_NL_in_st_typedef2779 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_COMMA_in_st_typedef2782 = new BitSet(new long[]{0x0000000000000000L,0x0002000026180000L,0x0000000002ADA000L});
    public static final BitSet FOLLOW_NL_in_st_typedef2784 = new BitSet(new long[]{0x0000000000000000L,0x0002000026180000L,0x0000000002ADA000L});
    public static final BitSet FOLLOW_typedef_clause_in_st_typedef2787 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000002080L});
    public static final BitSet FOLLOW_primitive_pattern_in_typedef_clause2821 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_NL_in_typedef_clause2823 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ASSIGN_in_typedef_clause2826 = new BitSet(new long[]{0xD000000000000000L,0x048200043EFA4131L,0x0000000002ADE460L});
    public static final BitSet FOLLOW_NL_in_typedef_clause2828 = new BitSet(new long[]{0xD000000000000000L,0x048200043EFA4131L,0x0000000002ADE460L});
    public static final BitSet FOLLOW_expr_in_typedef_clause2831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitive_pattern_in_typedef_clause2846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_yield_in_st_yield2865 = new BitSet(new long[]{0xD000000000000000L,0x048200043EFA4131L,0x0000000002ADE460L});
    public static final BitSet FOLLOW_expr_in_st_yield2867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_memoize_in_st_memoize2888 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000088000L});
    public static final BitSet FOLLOW_sw_id_in_st_memoize2890 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000002080L});
    public static final BitSet FOLLOW_NL_in_st_memoize2893 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_COMMA_in_st_memoize2896 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000008A000L});
    public static final BitSet FOLLOW_NL_in_st_memoize2898 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000088000L});
    public static final BitSet FOLLOW_sw_id_in_st_memoize2901 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000002080L});
    public static final BitSet FOLLOW_Id_in_sw_id2930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROUND_BRACKET_OPEN_in_sw_id2943 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_Id_in_sw_id2945 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_ROUND_BRACKET_CLOSE_in_sw_id2947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_private_in_st_private2964 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000088000L});
    public static final BitSet FOLLOW_sw_id_in_st_private2966 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000002080L});
    public static final BitSet FOLLOW_NL_in_st_private2969 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_COMMA_in_st_private2972 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000008A000L});
    public static final BitSet FOLLOW_NL_in_st_private2974 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000088000L});
    public static final BitSet FOLLOW_sw_id_in_st_private2977 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000002080L});
    public static final BitSet FOLLOW_L_module_in_st_module3002 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000A000L});
    public static final BitSet FOLLOW_NL_in_st_module3004 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_typeid_in_st_module3007 = new BitSet(new long[]{0xF000000000000000L,0x0482801F3FFA59B1L,0x000000007AADE460L});
    public static final BitSet FOLLOW_block_in_st_module3009 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_L_end_in_st_module3011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Id_in_importid3031 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000002100L});
    public static final BitSet FOLLOW_NL_in_importid3034 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_PERIOD_in_importid3037 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000A000L});
    public static final BitSet FOLLOW_NL_in_importid3039 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_Id_in_importid3042 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000002100L});
    public static final BitSet FOLLOW_importall_in_importid3046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERIOD_in_importall3069 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_UNDERSCORE_in_importall3071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_import_in_st_import3086 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000A000L});
    public static final BitSet FOLLOW_NL_in_st_import3088 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000A000L});
    public static final BitSet FOLLOW_importid_in_st_import3092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_expr_or_assign3128 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_objelem_assign_in_expr_or_assign3132 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_NL_in_expr_or_assign3135 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ASSIGN_in_expr_or_assign3138 = new BitSet(new long[]{0xD000000000000000L,0x048200043EFA4131L,0x0000000002ADE460L});
    public static final BitSet FOLLOW_NL_in_expr_or_assign3140 = new BitSet(new long[]{0xD000000000000000L,0x048200043EFA4131L,0x0000000002ADE460L});
    public static final BitSet FOLLOW_expr_in_expr_or_assign3143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_or_assign3162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lop_expr_in_expr3173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_obj_expr_in_expr3178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_expr_in_control_expr3188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_do_expr_in_control_expr3193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_match_expr_in_control_expr3198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_expr_in_control_expr3203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_try_expr_in_control_expr3209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_begin_end_in_control_expr3214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_control_expr_in_with_control_expr3224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_with_in_with_control_expr3229 = new BitSet(new long[]{0xD000000000000000L,0x048200043EFA4131L,0x0000000002ADE460L});
    public static final BitSet FOLLOW_NL_in_with_control_expr3231 = new BitSet(new long[]{0xD000000000000000L,0x048200043EFA4131L,0x0000000002ADE460L});
    public static final BitSet FOLLOW_protected_expr_in_with_control_expr3234 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L,0x0000000000002000L});
    public static final BitSet FOLLOW_NL_in_with_control_expr3236 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_L_do_in_with_control_expr3239 = new BitSet(new long[]{0xF000000000000000L,0x0482801F3FFA59B1L,0x000000007AADE460L});
    public static final BitSet FOLLOW_block_in_with_control_expr3241 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_L_end_in_with_control_expr3243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_lop_expr_in_protected_expr3268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_obj_expr_in_protected_expr3273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protected_expr_in_protected_expr_nc3284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_begin_in_begin_end3294 = new BitSet(new long[]{0xF000000000000000L,0x0482801F3FFA59B1L,0x000000007AADE460L});
    public static final BitSet FOLLOW_block_in_begin_end3296 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_L_end_in_begin_end3298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_parents3316 = new BitSet(new long[]{0x9000000000000000L,0x048200043EFA4131L,0x0000000002ADC460L});
    public static final BitSet FOLLOW_primitive_expr_in_parents3318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIMES_in_parents3331 = new BitSet(new long[]{0x9000000000000000L,0x048200043EFA4131L,0x0000000002ADC460L});
    public static final BitSet FOLLOW_primitive_expr_in_parents3333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_obj_in_obj_expr3361 = new BitSet(new long[]{0x0000000000000000L,0x0005000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_NL_in_obj_expr3363 = new BitSet(new long[]{0x0000000000000000L,0x0005000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_parents_in_obj_expr3366 = new BitSet(new long[]{0xF000000000000000L,0x0482801F3FFA59B1L,0x000000007AADE460L});
    public static final BitSet FOLLOW_block_in_obj_expr3368 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_L_end_in_obj_expr3370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_obj_in_obj_expr3398 = new BitSet(new long[]{0xF000000000000000L,0x0482801F3FFA59B1L,0x000000007AADE460L});
    public static final BitSet FOLLOW_block_in_obj_expr3400 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_L_end_in_obj_expr3402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_expr_in_lop_expr3430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_expr_nobrackets_in_lop_expr3441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_op_expr_in_lop_expr3446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_expr_in_p_lop_expr3462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_expr_nobrackets_in_p_lop_expr3473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_op_expr_in_p_lop_expr3478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_if_in_if_expr3488 = new BitSet(new long[]{0xD000000000000000L,0x048200043EFA4131L,0x0000000002ADE460L});
    public static final BitSet FOLLOW_NL_in_if_expr3490 = new BitSet(new long[]{0xD000000000000000L,0x048200043EFA4131L,0x0000000002ADE460L});
    public static final BitSet FOLLOW_protected_expr_in_if_expr3493 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_NL_in_if_expr3495 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_L_then_in_if_expr3498 = new BitSet(new long[]{0xF000000000000000L,0x0482801F3FFA59BDL,0x000000007AADE460L});
    public static final BitSet FOLLOW_block_in_if_expr3500 = new BitSet(new long[]{0x2000000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_L_elseif_in_if_expr3506 = new BitSet(new long[]{0xD000000000000000L,0x048200043EFA4131L,0x0000000002ADE460L});
    public static final BitSet FOLLOW_NL_in_if_expr3508 = new BitSet(new long[]{0xD000000000000000L,0x048200043EFA4131L,0x0000000002ADE460L});
    public static final BitSet FOLLOW_protected_expr_in_if_expr3511 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_NL_in_if_expr3513 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_L_then_in_if_expr3516 = new BitSet(new long[]{0xF000000000000000L,0x0482801F3FFA59BDL,0x000000007AADE460L});
    public static final BitSet FOLLOW_block_in_if_expr3518 = new BitSet(new long[]{0x2000000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_L_else_in_if_expr3526 = new BitSet(new long[]{0xF000000000000000L,0x0482801F3FFA59B1L,0x000000007AADE460L});
    public static final BitSet FOLLOW_block_in_if_expr3528 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_L_end_in_if_expr3532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_while_in_while_do_expr3556 = new BitSet(new long[]{0xD000000000000000L,0x048200043EFA4131L,0x0000000002ADE460L});
    public static final BitSet FOLLOW_NL_in_while_do_expr3558 = new BitSet(new long[]{0xD000000000000000L,0x048200043EFA4131L,0x0000000002ADE460L});
    public static final BitSet FOLLOW_protected_expr_in_while_do_expr3561 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L,0x0000000000002000L});
    public static final BitSet FOLLOW_NL_in_while_do_expr3563 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_L_do_in_while_do_expr3566 = new BitSet(new long[]{0xF000000000000000L,0x0482801F3FFA59B1L,0x000000007AADE460L});
    public static final BitSet FOLLOW_block_in_while_do_expr3568 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_L_end_in_while_do_expr3570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_full_cases_in_cases3600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_cases3605 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002006L});
    public static final BitSet FOLLOW_NL_in_cases3607 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002006L});
    public static final BitSet FOLLOW_token_DOUBLE_ARROW_in_cases3610 = new BitSet(new long[]{0xD000000000000000L,0x0482801F3FFA59B1L,0x000000007AADE460L});
    public static final BitSet FOLLOW_block_in_cases3612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_case_expr_in_full_cases3635 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_L_case_in_case_expr3656 = new BitSet(new long[]{0x0000000000000000L,0x0002000026184000L,0x0000000002ADE060L});
    public static final BitSet FOLLOW_NL_in_case_expr3658 = new BitSet(new long[]{0x0000000000000000L,0x0002000026184000L,0x0000000002ADC060L});
    public static final BitSet FOLLOW_pattern_in_case_expr3661 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002006L});
    public static final BitSet FOLLOW_NL_in_case_expr3663 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002006L});
    public static final BitSet FOLLOW_token_DOUBLE_ARROW_in_case_expr3666 = new BitSet(new long[]{0xD000000000000000L,0x0482801F3FFA59B1L,0x000000007AADE460L});
    public static final BitSet FOLLOW_block_in_case_expr3668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_match_in_match_expr3689 = new BitSet(new long[]{0x9000000000000000L,0x048200043EFA4131L,0x0000000002ADE460L});
    public static final BitSet FOLLOW_NL_in_match_expr3691 = new BitSet(new long[]{0x9000000000000000L,0x048200043EFA4131L,0x0000000002ADC460L});
    public static final BitSet FOLLOW_p_op_expr_in_match_expr3694 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L,0x0000000000002000L});
    public static final BitSet FOLLOW_NL_in_match_expr3696 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L,0x0000000000002000L});
    public static final BitSet FOLLOW_full_cases_in_match_expr3699 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_L_end_in_match_expr3701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_try_in_try_expr3727 = new BitSet(new long[]{0xD000000000000000L,0x0482001F3FFA59B1L,0x000000007AADE460L});
    public static final BitSet FOLLOW_NL_in_try_expr3729 = new BitSet(new long[]{0xD000000000000000L,0x0482001F3FFA59B1L,0x000000007AADE460L});
    public static final BitSet FOLLOW_pure_block_in_try_expr3732 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L,0x0000000000002000L});
    public static final BitSet FOLLOW_NL_in_try_expr3734 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_L_catch_in_try_expr3737 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L,0x0000000000002000L});
    public static final BitSet FOLLOW_NL_in_try_expr3739 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L,0x0000000000002000L});
    public static final BitSet FOLLOW_full_cases_in_try_expr3742 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_L_end_in_try_expr3744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROUND_BRACKET_OPEN_in_lambda_expr3768 = new BitSet(new long[]{0x0000000000000000L,0x0002000026184200L,0x0000000002ADE060L});
    public static final BitSet FOLLOW_NL_in_lambda_expr3770 = new BitSet(new long[]{0x0000000000000000L,0x0002000026184200L,0x0000000002ADE060L});
    public static final BitSet FOLLOW_lambda_cases_in_lambda_expr3773 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000102000L});
    public static final BitSet FOLLOW_NL_in_lambda_expr3775 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_ROUND_BRACKET_CLOSE_in_lambda_expr3778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_cases_nobrackets_in_lambda_expr_nobrackets3797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_lambda_cases_nobrackets3815 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002006L});
    public static final BitSet FOLLOW_NL_in_lambda_cases_nobrackets3817 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002006L});
    public static final BitSet FOLLOW_token_DOUBLE_ARROW_in_lambda_cases_nobrackets3820 = new BitSet(new long[]{0x9000000000000000L,0x048200043EFA4131L,0x0000000002ADE460L});
    public static final BitSet FOLLOW_NL_in_lambda_cases_nobrackets3822 = new BitSet(new long[]{0x9000000000000000L,0x048200043EFA4131L,0x0000000002ADC460L});
    public static final BitSet FOLLOW_lop_expr_in_lambda_cases_nobrackets3825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_case_in_lambda_case_expr3853 = new BitSet(new long[]{0x0000000000000000L,0x0002000026184000L,0x0000000002ADE060L});
    public static final BitSet FOLLOW_NL_in_lambda_case_expr3855 = new BitSet(new long[]{0x0000000000000000L,0x0002000026184000L,0x0000000002ADC060L});
    public static final BitSet FOLLOW_pattern_in_lambda_case_expr3858 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002006L});
    public static final BitSet FOLLOW_NL_in_lambda_case_expr3860 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002006L});
    public static final BitSet FOLLOW_token_DOUBLE_ARROW_in_lambda_case_expr3863 = new BitSet(new long[]{0xD000000000000000L,0x0482001F3FFA59B1L,0x000000007AADE460L});
    public static final BitSet FOLLOW_NL_in_lambda_case_expr3865 = new BitSet(new long[]{0xD000000000000000L,0x0482001F3FFA59B1L,0x000000007AADE460L});
    public static final BitSet FOLLOW_pure_block_in_lambda_case_expr3868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_lambda_cases3889 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002006L});
    public static final BitSet FOLLOW_NL_in_lambda_cases3891 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002006L});
    public static final BitSet FOLLOW_token_DOUBLE_ARROW_in_lambda_cases3894 = new BitSet(new long[]{0xD000000000000000L,0x0482001F3FFA59B1L,0x000000007AADE460L});
    public static final BitSet FOLLOW_NL_in_lambda_cases3896 = new BitSet(new long[]{0xD000000000000000L,0x0482001F3FFA59B1L,0x000000007AADE460L});
    public static final BitSet FOLLOW_pure_block_in_lambda_cases3899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_case_expr_in_lambda_cases3918 = new BitSet(new long[]{0x0000000000000002L,0x0002000026184200L,0x0000000002ADE060L});
    public static final BitSet FOLLOW_NL_in_lambda_cases3921 = new BitSet(new long[]{0x0000000000000000L,0x0002000026184200L,0x0000000002ADE060L});
    public static final BitSet FOLLOW_lambda_case_expr_in_lambda_cases3924 = new BitSet(new long[]{0x0000000000000002L,0x0002000026184200L,0x0000000002ADE060L});
    public static final BitSet FOLLOW_L_for_in_for_expr3942 = new BitSet(new long[]{0x0000000000000000L,0x0002000026184000L,0x0000000002ADE060L});
    public static final BitSet FOLLOW_NL_in_for_expr3944 = new BitSet(new long[]{0x0000000000000000L,0x0002000026184000L,0x0000000002ADC060L});
    public static final BitSet FOLLOW_pattern_in_for_expr3947 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L,0x0000000000002000L});
    public static final BitSet FOLLOW_NL_in_for_expr3949 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_L_in_in_for_expr3952 = new BitSet(new long[]{0xD000000000000000L,0x048200043EFA4131L,0x0000000002ADE460L});
    public static final BitSet FOLLOW_NL_in_for_expr3954 = new BitSet(new long[]{0xD000000000000000L,0x048200043EFA4131L,0x0000000002ADE460L});
    public static final BitSet FOLLOW_protected_expr_in_for_expr3957 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L,0x0000000000002000L});
    public static final BitSet FOLLOW_NL_in_for_expr3959 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_L_do_in_for_expr3962 = new BitSet(new long[]{0xF000000000000000L,0x0482801F3FFA59B1L,0x000000007AADE460L});
    public static final BitSet FOLLOW_block_in_for_expr3964 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_L_end_in_for_expr3966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_builtin_primitive_in_op_expr3991 = new BitSet(new long[]{0x9000000000000000L,0x048200043EFA4131L,0x0000000002ADC460L});
    public static final BitSet FOLLOW_op_expr_in_op_expr3994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bool_expr_in_op_expr3999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_builtin_primitive_in_p_op_expr4009 = new BitSet(new long[]{0x9000000000000000L,0x048200043EFA4131L,0x0000000002ADE460L});
    public static final BitSet FOLLOW_NL_in_p_op_expr4012 = new BitSet(new long[]{0x9000000000000000L,0x048200043EFA4131L,0x0000000002ADC460L});
    public static final BitSet FOLLOW_p_op_expr_in_p_op_expr4016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_bool_expr_in_p_op_expr4021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_builtin_primitive0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bool_or_expr_in_bool_expr4065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_bool_or_expr_in_p_bool_expr4075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bool_and_expr_in_bool_or_expr4084 = new BitSet(new long[]{0x0000000000000002L,0x0120000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_NL_in_bool_or_expr4087 = new BitSet(new long[]{0x0000000000000000L,0x0120000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_token_OR_in_bool_or_expr4091 = new BitSet(new long[]{0x9000000000000000L,0x048200043EFA4131L,0x0000000002ADE460L});
    public static final BitSet FOLLOW_NL_in_bool_or_expr4094 = new BitSet(new long[]{0x9000000000000000L,0x048200043EFA4131L,0x0000000002ADC460L});
    public static final BitSet FOLLOW_bool_and_expr_in_bool_or_expr4098 = new BitSet(new long[]{0x0000000000000002L,0x0120000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_p_bool_and_expr_in_p_bool_or_expr4110 = new BitSet(new long[]{0x0000000000000002L,0x0120000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_NL_in_p_bool_or_expr4113 = new BitSet(new long[]{0x0000000000000000L,0x0120000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_token_OR_in_p_bool_or_expr4117 = new BitSet(new long[]{0x9000000000000000L,0x048200043EFA4131L,0x0000000002ADE460L});
    public static final BitSet FOLLOW_NL_in_p_bool_or_expr4120 = new BitSet(new long[]{0x9000000000000000L,0x048200043EFA4131L,0x0000000002ADC460L});
    public static final BitSet FOLLOW_p_bool_and_expr_in_p_bool_or_expr4124 = new BitSet(new long[]{0x0000000000000002L,0x0120000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_bool_not_expr_in_bool_and_expr4136 = new BitSet(new long[]{0x0000000000000002L,0x0240000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_NL_in_bool_and_expr4139 = new BitSet(new long[]{0x0000000000000000L,0x0240000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_token_AND_in_bool_and_expr4143 = new BitSet(new long[]{0x9000000000000000L,0x048200043EFA4131L,0x0000000002ADE460L});
    public static final BitSet FOLLOW_NL_in_bool_and_expr4146 = new BitSet(new long[]{0x9000000000000000L,0x048200043EFA4131L,0x0000000002ADC460L});
    public static final BitSet FOLLOW_bool_not_expr_in_bool_and_expr4150 = new BitSet(new long[]{0x0000000000000002L,0x0240000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_p_bool_not_expr_in_p_bool_and_expr4162 = new BitSet(new long[]{0x0000000000000002L,0x0240000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_NL_in_p_bool_and_expr4165 = new BitSet(new long[]{0x0000000000000000L,0x0240000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_token_AND_in_p_bool_and_expr4169 = new BitSet(new long[]{0x9000000000000000L,0x048200043EFA4131L,0x0000000002ADE460L});
    public static final BitSet FOLLOW_NL_in_p_bool_and_expr4172 = new BitSet(new long[]{0x9000000000000000L,0x048200043EFA4131L,0x0000000002ADC460L});
    public static final BitSet FOLLOW_p_bool_not_expr_in_p_bool_and_expr4176 = new BitSet(new long[]{0x0000000000000002L,0x0240000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_token_NOT_in_bool_not_expr4188 = new BitSet(new long[]{0x9000000000000000L,0x048200043EFA4131L,0x0000000002ADE460L});
    public static final BitSet FOLLOW_NL_in_bool_not_expr4191 = new BitSet(new long[]{0x9000000000000000L,0x048200043EFA4131L,0x0000000002ADC460L});
    public static final BitSet FOLLOW_bool_not_expr_in_bool_not_expr4195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rel_expr_in_bool_not_expr4200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_NOT_in_p_bool_not_expr4211 = new BitSet(new long[]{0x9000000000000000L,0x048200043EFA4131L,0x0000000002ADE460L});
    public static final BitSet FOLLOW_NL_in_p_bool_not_expr4214 = new BitSet(new long[]{0x9000000000000000L,0x048200043EFA4131L,0x0000000002ADC460L});
    public static final BitSet FOLLOW_p_bool_not_expr_in_p_bool_not_expr4218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_rel_expr_in_p_bool_not_expr4223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arith_expr_in_rel_expr4232 = new BitSet(new long[]{0x0000000000000002L,0x00007FE000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_NL_in_rel_expr4235 = new BitSet(new long[]{0x0000000000000000L,0x00007FE000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_rel_op_in_rel_expr4238 = new BitSet(new long[]{0x9000000000000000L,0x048200043EFA4131L,0x0000000002ADE460L});
    public static final BitSet FOLLOW_NL_in_rel_expr4240 = new BitSet(new long[]{0x9000000000000000L,0x048200043EFA4131L,0x0000000002ADC460L});
    public static final BitSet FOLLOW_arith_expr_in_rel_expr4243 = new BitSet(new long[]{0x0000000000000002L,0x00007FE000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_p_arith_expr_in_p_rel_expr4270 = new BitSet(new long[]{0x0000000000000002L,0x00007FE000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_NL_in_p_rel_expr4273 = new BitSet(new long[]{0x0000000000000000L,0x00007FE000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_rel_op_in_p_rel_expr4276 = new BitSet(new long[]{0x9000000000000000L,0x048200043EFA4131L,0x0000000002ADE460L});
    public static final BitSet FOLLOW_NL_in_p_rel_expr4278 = new BitSet(new long[]{0x9000000000000000L,0x048200043EFA4131L,0x0000000002ADC460L});
    public static final BitSet FOLLOW_p_arith_expr_in_p_rel_expr4281 = new BitSet(new long[]{0x0000000000000002L,0x00007FE000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_token_EQUAL_in_rel_op4307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_NOT_EQUAL_in_rel_op4311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATER_in_rel_op4315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_GREATER_EQ_in_rel_op4319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_in_rel_op4323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_LESS_EQ_in_rel_op4327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_plusplus_expr_in_arith_expr4339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_plusplus_expr_in_p_arith_expr4349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timestimes_expr_in_plusplus_expr4359 = new BitSet(new long[]{0x0000000000000002L,0x8000000000000000L,0x0000000000002001L});
    public static final BitSet FOLLOW_NL_in_plusplus_expr4362 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_PLUSPLUS_in_plusplus_expr4367 = new BitSet(new long[]{0x9000000000000000L,0x048200043EFA4131L,0x0000000002ADE460L});
    public static final BitSet FOLLOW_MINUSMINUS_in_plusplus_expr4370 = new BitSet(new long[]{0x9000000000000000L,0x048200043EFA4131L,0x0000000002ADE460L});
    public static final BitSet FOLLOW_NL_in_plusplus_expr4374 = new BitSet(new long[]{0x9000000000000000L,0x048200043EFA4131L,0x0000000002ADC460L});
    public static final BitSet FOLLOW_timestimes_expr_in_plusplus_expr4378 = new BitSet(new long[]{0x0000000000000002L,0x8000000000000000L,0x0000000000002001L});
    public static final BitSet FOLLOW_p_timestimes_expr_in_p_plusplus_expr4390 = new BitSet(new long[]{0x0000000000000002L,0x8000000000000000L,0x0000000000002001L});
    public static final BitSet FOLLOW_NL_in_p_plusplus_expr4393 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_PLUSPLUS_in_p_plusplus_expr4398 = new BitSet(new long[]{0x9000000000000000L,0x048200043EFA4131L,0x0000000002ADE460L});
    public static final BitSet FOLLOW_MINUSMINUS_in_p_plusplus_expr4401 = new BitSet(new long[]{0x9000000000000000L,0x048200043EFA4131L,0x0000000002ADE460L});
    public static final BitSet FOLLOW_NL_in_p_plusplus_expr4405 = new BitSet(new long[]{0x9000000000000000L,0x048200043EFA4131L,0x0000000002ADC460L});
    public static final BitSet FOLLOW_p_timestimes_expr_in_p_plusplus_expr4409 = new BitSet(new long[]{0x0000000000000002L,0x8000000000000000L,0x0000000000002001L});
    public static final BitSet FOLLOW_simple_expr_in_timestimes_expr4421 = new BitSet(new long[]{0x0000000000000002L,0x6000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_NL_in_timestimes_expr4424 = new BitSet(new long[]{0x0000000000000000L,0x6000000000000000L});
    public static final BitSet FOLLOW_TIMESTIMES_in_timestimes_expr4429 = new BitSet(new long[]{0x9000000000000000L,0x048200043EFA4131L,0x0000000002ADE460L});
    public static final BitSet FOLLOW_QUOTIENTQUOTIENT_in_timestimes_expr4432 = new BitSet(new long[]{0x9000000000000000L,0x048200043EFA4131L,0x0000000002ADE460L});
    public static final BitSet FOLLOW_NL_in_timestimes_expr4436 = new BitSet(new long[]{0x9000000000000000L,0x048200043EFA4131L,0x0000000002ADC460L});
    public static final BitSet FOLLOW_simple_expr_in_timestimes_expr4440 = new BitSet(new long[]{0x0000000000000002L,0x6000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_p_simple_expr_in_p_timestimes_expr4453 = new BitSet(new long[]{0x0000000000000002L,0x6000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_NL_in_p_timestimes_expr4456 = new BitSet(new long[]{0x0000000000000000L,0x6000000000000000L});
    public static final BitSet FOLLOW_TIMESTIMES_in_p_timestimes_expr4461 = new BitSet(new long[]{0x9000000000000000L,0x048200043EFA4131L,0x0000000002ADE460L});
    public static final BitSet FOLLOW_QUOTIENTQUOTIENT_in_p_timestimes_expr4464 = new BitSet(new long[]{0x9000000000000000L,0x048200043EFA4131L,0x0000000002ADE460L});
    public static final BitSet FOLLOW_NL_in_p_timestimes_expr4468 = new BitSet(new long[]{0x9000000000000000L,0x048200043EFA4131L,0x0000000002ADC460L});
    public static final BitSet FOLLOW_p_simple_expr_in_p_timestimes_expr4472 = new BitSet(new long[]{0x0000000000000002L,0x6000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_cons_expr_in_simple_expr4483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_cons_expr_in_p_simple_expr4492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_to_expr_in_cons_expr4501 = new BitSet(new long[]{0x0000000000000002L,0x1800000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_NL_in_cons_expr4504 = new BitSet(new long[]{0x0000000000000000L,0x1800000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_token_DOUBLE_COLON_in_cons_expr4507 = new BitSet(new long[]{0x9000000000000000L,0x048200043EFA4131L,0x0000000002ADE460L});
    public static final BitSet FOLLOW_NL_in_cons_expr4509 = new BitSet(new long[]{0x9000000000000000L,0x048200043EFA4131L,0x0000000002ADC460L});
    public static final BitSet FOLLOW_to_expr_in_cons_expr4512 = new BitSet(new long[]{0x0000000000000002L,0x1800000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_p_to_expr_in_p_cons_expr4532 = new BitSet(new long[]{0x0000000000000002L,0x1800000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_NL_in_p_cons_expr4535 = new BitSet(new long[]{0x0000000000000000L,0x1800000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_token_DOUBLE_COLON_in_p_cons_expr4538 = new BitSet(new long[]{0x9000000000000000L,0x048200043EFA4131L,0x0000000002ADE460L});
    public static final BitSet FOLLOW_NL_in_p_cons_expr4540 = new BitSet(new long[]{0x9000000000000000L,0x048200043EFA4131L,0x0000000002ADC460L});
    public static final BitSet FOLLOW_p_to_expr_in_p_cons_expr4543 = new BitSet(new long[]{0x0000000000000002L,0x1800000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_arith_plus_expr_in_to_expr4563 = new BitSet(new long[]{0x0000000000000002L,0x0000000000018000L,0x0000000000002000L});
    public static final BitSet FOLLOW_NL_in_to_expr4566 = new BitSet(new long[]{0x0000000000000000L,0x0000000000018000L});
    public static final BitSet FOLLOW_L_to_in_to_expr4571 = new BitSet(new long[]{0x9000000000000000L,0x048200043EFA4131L,0x0000000002ADE460L});
    public static final BitSet FOLLOW_L_downto_in_to_expr4575 = new BitSet(new long[]{0x9000000000000000L,0x048200043EFA4131L,0x0000000002ADE460L});
    public static final BitSet FOLLOW_NL_in_to_expr4579 = new BitSet(new long[]{0x9000000000000000L,0x048200043EFA4131L,0x0000000002ADC460L});
    public static final BitSet FOLLOW_arith_plus_expr_in_to_expr4583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_arith_plus_expr_in_p_to_expr4596 = new BitSet(new long[]{0x0000000000000002L,0x0000000000018000L,0x0000000000002000L});
    public static final BitSet FOLLOW_NL_in_p_to_expr4599 = new BitSet(new long[]{0x0000000000000000L,0x0000000000018000L});
    public static final BitSet FOLLOW_L_to_in_p_to_expr4604 = new BitSet(new long[]{0x9000000000000000L,0x048200043EFA4131L,0x0000000002ADE460L});
    public static final BitSet FOLLOW_L_downto_in_p_to_expr4608 = new BitSet(new long[]{0x9000000000000000L,0x048200043EFA4131L,0x0000000002ADE460L});
    public static final BitSet FOLLOW_NL_in_p_to_expr4612 = new BitSet(new long[]{0x9000000000000000L,0x048200043EFA4131L,0x0000000002ADC460L});
    public static final BitSet FOLLOW_p_arith_plus_expr_in_p_to_expr4616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arith_uminus_expr_in_arith_plus_expr4628 = new BitSet(new long[]{0x0000000000000002L,0x0003000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_NL_in_arith_plus_expr4632 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_PLUS_in_arith_plus_expr4636 = new BitSet(new long[]{0x9000000000000000L,0x048200043EFA4131L,0x0000000002ADE460L});
    public static final BitSet FOLLOW_MINUS_in_arith_plus_expr4641 = new BitSet(new long[]{0x9000000000000000L,0x048200043EFA4131L,0x0000000002ADE460L});
    public static final BitSet FOLLOW_NL_in_arith_plus_expr4645 = new BitSet(new long[]{0x9000000000000000L,0x048200043EFA4131L,0x0000000002ADC460L});
    public static final BitSet FOLLOW_arith_uminus_expr_in_arith_plus_expr4649 = new BitSet(new long[]{0x0000000000000002L,0x0003000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_p_arith_uminus_expr_in_p_arith_plus_expr4660 = new BitSet(new long[]{0x0000000000000002L,0x0003000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_NL_in_p_arith_plus_expr4663 = new BitSet(new long[]{0x0000000000000000L,0x0003000000000000L});
    public static final BitSet FOLLOW_set_in_p_arith_plus_expr4667 = new BitSet(new long[]{0x9000000000000000L,0x048200043EFA4131L,0x0000000002ADE460L});
    public static final BitSet FOLLOW_NL_in_p_arith_plus_expr4676 = new BitSet(new long[]{0x9000000000000000L,0x048200043EFA4131L,0x0000000002ADC460L});
    public static final BitSet FOLLOW_p_arith_uminus_expr_in_p_arith_plus_expr4680 = new BitSet(new long[]{0x0000000000000002L,0x0003000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_MINUS_in_arith_uminus_expr4693 = new BitSet(new long[]{0x9000000000000000L,0x048200043EFA4131L,0x0000000002ADE460L});
    public static final BitSet FOLLOW_NL_in_arith_uminus_expr4695 = new BitSet(new long[]{0x9000000000000000L,0x048200043EFA4131L,0x0000000002ADC460L});
    public static final BitSet FOLLOW_arith_mult_expr_in_arith_uminus_expr4698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arith_mult_expr_in_arith_uminus_expr4711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_p_arith_uminus_expr4722 = new BitSet(new long[]{0x9000000000000000L,0x048200043EFA4131L,0x0000000002ADE460L});
    public static final BitSet FOLLOW_NL_in_p_arith_uminus_expr4724 = new BitSet(new long[]{0x9000000000000000L,0x048200043EFA4131L,0x0000000002ADC460L});
    public static final BitSet FOLLOW_p_arith_mult_expr_in_p_arith_uminus_expr4727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_arith_mult_expr_in_p_arith_uminus_expr4740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arith_pow_expr_in_arith_mult_expr4749 = new BitSet(new long[]{0x0000000000000002L,0x000C0000C0000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_NL_in_arith_mult_expr4752 = new BitSet(new long[]{0x0000000000000000L,0x000C0000C0000000L});
    public static final BitSet FOLLOW_set_in_arith_mult_expr4756 = new BitSet(new long[]{0x9000000000000000L,0x048200043EFA4131L,0x0000000002ADE460L});
    public static final BitSet FOLLOW_NL_in_arith_mult_expr4773 = new BitSet(new long[]{0x9000000000000000L,0x048200043EFA4131L,0x0000000002ADC460L});
    public static final BitSet FOLLOW_arith_pow_expr_in_arith_mult_expr4777 = new BitSet(new long[]{0x0000000000000002L,0x000C0000C0000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_p_arith_pow_expr_in_p_arith_mult_expr4789 = new BitSet(new long[]{0x0000000000000002L,0x000C0000C0000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_NL_in_p_arith_mult_expr4792 = new BitSet(new long[]{0x0000000000000000L,0x000C0000C0000000L});
    public static final BitSet FOLLOW_set_in_p_arith_mult_expr4796 = new BitSet(new long[]{0x9000000000000000L,0x048200043EFA4131L,0x0000000002ADE460L});
    public static final BitSet FOLLOW_NL_in_p_arith_mult_expr4813 = new BitSet(new long[]{0x9000000000000000L,0x048200043EFA4131L,0x0000000002ADC460L});
    public static final BitSet FOLLOW_p_arith_pow_expr_in_p_arith_mult_expr4817 = new BitSet(new long[]{0x0000000000000002L,0x000C0000C0000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_apply_expr_in_arith_pow_expr4828 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_NL_in_arith_pow_expr4831 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_POW_tok_in_arith_pow_expr4834 = new BitSet(new long[]{0x9000000000000000L,0x048200043EFA4131L,0x0000000002ADE460L});
    public static final BitSet FOLLOW_NL_in_arith_pow_expr4836 = new BitSet(new long[]{0x9000000000000000L,0x048200043EFA4131L,0x0000000002ADC460L});
    public static final BitSet FOLLOW_apply_expr_in_arith_pow_expr4839 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_p_apply_expr_in_p_arith_pow_expr4860 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_NL_in_p_arith_pow_expr4863 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_POW_tok_in_p_arith_pow_expr4866 = new BitSet(new long[]{0x9000000000000000L,0x048200043EFA4131L,0x0000000002ADE460L});
    public static final BitSet FOLLOW_NL_in_p_arith_pow_expr4868 = new BitSet(new long[]{0x9000000000000000L,0x048200043EFA4131L,0x0000000002ADC460L});
    public static final BitSet FOLLOW_p_apply_expr_in_p_arith_pow_expr4871 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_basic_expr_in_apply_expr4892 = new BitSet(new long[]{0x9000000000000002L,0x048200043EFA4131L,0x0000000002ADC460L});
    public static final BitSet FOLLOW_p_basic_expr_in_p_apply_expr4910 = new BitSet(new long[]{0x9000000000000002L,0x048200043EFA4131L,0x0000000002ADE460L});
    public static final BitSet FOLLOW_NL_in_p_apply_expr4913 = new BitSet(new long[]{0x9000000000000000L,0x048200043EFA4131L,0x0000000002ADC460L});
    public static final BitSet FOLLOW_p_basic_expr_in_p_apply_expr4916 = new BitSet(new long[]{0x9000000000000002L,0x048200043EFA4131L,0x0000000002ADE460L});
    public static final BitSet FOLLOW_message_send_expr_in_basic_expr4936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_message_send_expr_in_p_basic_expr4945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitive_expr_in_message_send_expr4954 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000002100L});
    public static final BitSet FOLLOW_NL_in_message_send_expr4957 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_PERIOD_in_message_send_expr4960 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000A000L});
    public static final BitSet FOLLOW_NL_in_message_send_expr4962 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_Id_in_message_send_expr4965 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000002100L});
    public static final BitSet FOLLOW_SQUARE_BRACKET_OPEN_in_list_expr4989 = new BitSet(new long[]{0xD000000000000000L,0x048200043EFA4131L,0x0000000002EDE460L});
    public static final BitSet FOLLOW_NL_in_list_expr4991 = new BitSet(new long[]{0xD000000000000000L,0x048200043EFA4131L,0x0000000002EDE460L});
    public static final BitSet FOLLOW_protected_expr_nc_in_list_expr4995 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000402080L});
    public static final BitSet FOLLOW_NL_in_list_expr4998 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_COMMA_in_list_expr5001 = new BitSet(new long[]{0xD000000000000000L,0x048200043EFA4131L,0x0000000002ADE460L});
    public static final BitSet FOLLOW_NL_in_list_expr5003 = new BitSet(new long[]{0xD000000000000000L,0x048200043EFA4131L,0x0000000002ADE460L});
    public static final BitSet FOLLOW_protected_expr_nc_in_list_expr5006 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000402080L});
    public static final BitSet FOLLOW_NL_in_list_expr5010 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_SQUARE_BRACKET_CLOSE_in_list_expr5015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROUND_BRACKET_OPEN_in_list_expr5029 = new BitSet(new long[]{0xD000000000000000L,0x048200043EFA4131L,0x0000000002BDE460L});
    public static final BitSet FOLLOW_NL_in_list_expr5031 = new BitSet(new long[]{0xD000000000000000L,0x048200043EFA4131L,0x0000000002BDE460L});
    public static final BitSet FOLLOW_protected_expr_nc_in_list_expr5035 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000102080L});
    public static final BitSet FOLLOW_NL_in_list_expr5038 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_COMMA_in_list_expr5041 = new BitSet(new long[]{0xD000000000000000L,0x048200043EFA4131L,0x0000000002ADE460L});
    public static final BitSet FOLLOW_NL_in_list_expr5043 = new BitSet(new long[]{0xD000000000000000L,0x048200043EFA4131L,0x0000000002ADE460L});
    public static final BitSet FOLLOW_protected_expr_nc_in_list_expr5046 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000102080L});
    public static final BitSet FOLLOW_NL_in_list_expr5050 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100080L});
    public static final BitSet FOLLOW_COMMA_in_list_expr5054 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000102000L});
    public static final BitSet FOLLOW_NL_in_list_expr5056 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_ROUND_BRACKET_CLOSE_in_list_expr5063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURLY_BRACKET_OPEN_in_map_or_set_expr5092 = new BitSet(new long[]{0xD000000000000000L,0x048200043EFA4131L,0x0000000003ADE460L});
    public static final BitSet FOLLOW_NL_in_map_or_set_expr5094 = new BitSet(new long[]{0xD000000000000000L,0x048200043EFA4131L,0x0000000003ADE460L});
    public static final BitSet FOLLOW_map_or_set_elem_expr_in_map_or_set_expr5098 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001002080L});
    public static final BitSet FOLLOW_NL_in_map_or_set_expr5100 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000080L});
    public static final BitSet FOLLOW_COMMA_in_map_or_set_expr5104 = new BitSet(new long[]{0xD000000000000000L,0x048200043EFA4131L,0x0000000002ADE460L});
    public static final BitSet FOLLOW_NL_in_map_or_set_expr5106 = new BitSet(new long[]{0xD000000000000000L,0x048200043EFA4131L,0x0000000002ADE460L});
    public static final BitSet FOLLOW_map_or_set_elem_expr_in_map_or_set_expr5109 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001002080L});
    public static final BitSet FOLLOW_NL_in_map_or_set_expr5111 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000080L});
    public static final BitSet FOLLOW_CURLY_BRACKET_CLOSE_in_map_or_set_expr5118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURLY_BRACKET_OPEN_in_map_or_set_expr5138 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002018L});
    public static final BitSet FOLLOW_NL_in_map_or_set_expr5140 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_token_ARROW_in_map_or_set_expr5143 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001002000L});
    public static final BitSet FOLLOW_NL_in_map_or_set_expr5145 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_CURLY_BRACKET_CLOSE_in_map_or_set_expr5148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protected_expr_nc_in_map_or_set_elem_expr5165 = new BitSet(new long[]{0x0000000200000002L,0x0000000000000000L,0x0000000000002018L});
    public static final BitSet FOLLOW_NL_in_map_or_set_elem_expr5168 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000000L,0x0000000000002018L});
    public static final BitSet FOLLOW_arrow_or_assign_in_map_or_set_elem_expr5171 = new BitSet(new long[]{0xD000000000000000L,0x048200043EFA4131L,0x0000000002ADE460L});
    public static final BitSet FOLLOW_NL_in_map_or_set_elem_expr5173 = new BitSet(new long[]{0xD000000000000000L,0x048200043EFA4131L,0x0000000002ADE460L});
    public static final BitSet FOLLOW_protected_expr_nc_in_map_or_set_elem_expr5176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROUND_BRACKET_OPEN_in_type_expr5203 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004002000L});
    public static final BitSet FOLLOW_NL_in_type_expr5205 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_COLON_in_type_expr5208 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000A000L});
    public static final BitSet FOLLOW_NL_in_type_expr5210 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_typeid_in_type_expr5213 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000102000L});
    public static final BitSet FOLLOW_NL_in_type_expr5215 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_ROUND_BRACKET_CLOSE_in_type_expr5218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Num_in_primitive_expr5235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_String_in_primitive_expr5240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Id_in_primitive_expr5245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Constr_in_primitive_expr5250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_true_in_primitive_expr5255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_false_in_primitive_expr5260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_this_in_primitive_expr5265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_nil_in_primitive_expr5271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_expr_in_primitive_expr5276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_infinity_in_primitive_expr5281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_list_expr_in_primitive_expr5287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_with_control_expr_in_primitive_expr5292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_map_or_set_expr_in_primitive_expr5297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Id_in_synpred1_babel171792 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L,0x0000000000002000L});
    public static final BitSet FOLLOW_NL_in_synpred1_babel171794 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_L_as_in_synpred1_babel171797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protected_expr_in_synpred2_babel171828 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002200L});
    public static final BitSet FOLLOW_NL_in_synpred2_babel171830 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_QUESTION_MARK_in_synpred2_babel171833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Id_in_synpred3_babel171871 = new BitSet(new long[]{0x0000000000000000L,0x0002000026184000L,0x0000000002ADC060L});
    public static final BitSet FOLLOW_pattern_in_synpred3_babel171873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_synpred4_babel171962 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L,0x0000000000002000L});
    public static final BitSet FOLLOW_NL_in_synpred4_babel171964 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_L_if_in_synpred4_babel171967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_synpred5_babel171998 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004002000L});
    public static final BitSet FOLLOW_NL_in_synpred5_babel172000 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_COLON_in_synpred5_babel172003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitive_pattern_in_synpred6_babel172811 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_NL_in_synpred6_babel172813 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ASSIGN_in_synpred6_babel172816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_synpred7_babel173112 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_objelem_assign_in_synpred7_babel173116 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_NL_in_synpred7_babel173119 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ASSIGN_in_synpred7_babel173122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_obj_in_synpred8_babel173351 = new BitSet(new long[]{0x0000000000000000L,0x0005000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_NL_in_synpred8_babel173353 = new BitSet(new long[]{0x0000000000000000L,0x0005000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_parents_in_synpred8_babel173356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_expr_in_synpred9_babel173425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_expr_nobrackets_in_synpred10_babel173436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_expr_in_synpred11_babel173457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_expr_nobrackets_in_synpred12_babel173468 = new BitSet(new long[]{0x0000000000000002L});

}