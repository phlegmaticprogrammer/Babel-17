// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g 2011-04-26 16:46:13

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PROG", "NIL_TOKEN", "ANY", "LAMBDA", "SQUARE_LIST", "ROUND_LIST", "LIST_CONS", "COMPARE", "APPLY", "IF", "MAP_OR_SET_OR_OBJ", "EMPTY_MAP", "EXCEPTION", "MATCH", "TRY", "CASES", "OBJ", "FOR_EXPR", "WHILE_DO", "MESSAGE_SEND", "UMINUS", "POW", "PARENTS_PLUS", "PARENTS_MUL", "BLOCK", "BEGIN", "WITH", "VAL", "OBJELEM_ASSIGN", "ASSIGN", "ARROW", "DEF", "YIELD", "PRIVATE", "TYPEDEF", "TYPEDEF_CLAUSE", "GETTYPE", "MEMOIZE", "MEMOID_STRONG", "MEMOID_WEAK", "PRIVATEID_STRONG", "PRIVATEID_WEAK", "IF_PATTERN", "TYPE_PATTERN", "INNERVALUE_PATTERN", "TYPEID", "MODULEID", "IMPORTID", "TYPE_EXPR", "TYPEOF", "CONVERSION", "Newline", "NotNewline", "COMMENT", "SmallLetter", "BigLetter", "Letter", "Digit", "Hex", "L_begin", "L_end", "L_obj", "L_with", "L_if", "L_then", "L_else", "L_elseif", "L_while", "L_for", "L_do", "L_yield", "L_match", "L_case", "L_as", "L_val", "L_def", "L_in", "L_exception", "L_to", "L_downto", "L_try", "L_catch", "A_infinity", "U_infinity", "L_concurrent", "L_choose", "L_lazy", "L_memoize", "L_true", "L_false", "L_this", "L_random", "L_nil", "L_div", "L_mod", "L_module", "L_typedef", "L_typeof", "L_private", "L_import", "A_EQUAL", "U_EQUAL", "A_NOT_EQUAL", "U_NOT_EQUAL", "LESS", "A_LESS_EQ", "U_LESS_EQ", "GREATER", "A_GREATER_EQ", "U_GREATER_EQ", "SC", "PLUS", "MINUS", "TIMES", "QUOTIENT", "POW_tok", "A_OR", "A_AND", "A_NOT", "U_OR", "U_AND", "U_NOT", "A_DOUBLE_COLON", "U_DOUBLE_COLON", "TIMESTIMES", "QUOTIENTQUOTIENT", "PLUSPLUS", "MINUSMINUS", "A_DOUBLE_ARROW", "U_DOUBLE_ARROW", "A_ARROW", "U_ARROW", "A_ELLIPSIS", "U_ELLIPSIS", "COMMA", "PERIOD", "QUESTION_MARK", "L_force", "WsChar", "WS", "NL", "Constr", "Id", "Num", "Charcode", "String", "ROUND_BRACKET_OPEN", "ROUND_BRACKET_CLOSE", "SQUARE_BRACKET_OPEN", "SQUARE_BRACKET_CLOSE", "CURLY_BRACKET_OPEN", "CURLY_BRACKET_CLOSE", "UNDERSCORE", "COLON", "PRAGMA_LOG", "PRAGMA_PRINT", "PRAGMA_ASSERT", "PRAGMA_PROFILE"
    };
    public static final int U_AND=124;
    public static final int L_end=64;
    public static final int U_NOT_EQUAL=107;
    public static final int TIMESTIMES=128;
    public static final int BigLetter=59;
    public static final int L_try=84;
    public static final int ROUND_BRACKET_CLOSE=151;
    public static final int IMPORTID=51;
    public static final int L_mod=98;
    public static final int A_OR=120;
    public static final int MINUSMINUS=131;
    public static final int Newline=55;
    public static final int SQUARE_BRACKET_CLOSE=153;
    public static final int MAP_OR_SET_OR_OBJ=14;
    public static final int EOF=-1;
    public static final int PRIVATEID_STRONG=44;
    public static final int U_DOUBLE_ARROW=133;
    public static final int TYPEID=49;
    public static final int L_exception=81;
    public static final int Num=147;
    public static final int GREATER=111;
    public static final int EMPTY_MAP=15;
    public static final int POW=25;
    public static final int L_catch=85;
    public static final int L_concurrent=88;
    public static final int L_false=93;
    public static final int QUOTIENTQUOTIENT=129;
    public static final int L_nil=96;
    public static final int BEGIN=29;
    public static final int LIST_CONS=10;
    public static final int L_with=66;
    public static final int QUESTION_MARK=140;
    public static final int LESS=108;
    public static final int ROUND_BRACKET_OPEN=150;
    public static final int SQUARE_LIST=8;
    public static final int MODULEID=50;
    public static final int VAL=31;
    public static final int L_as=77;
    public static final int NL=144;
    public static final int MESSAGE_SEND=23;
    public static final int A_ARROW=134;
    public static final int A_DOUBLE_COLON=126;
    public static final int COMMENT=57;
    public static final int L_def=79;
    public static final int A_AND=121;
    public static final int EXCEPTION=16;
    public static final int TYPE_EXPR=52;
    public static final int L_this=94;
    public static final int L_force=141;
    public static final int L_choose=89;
    public static final int PERIOD=139;
    public static final int PRIVATE=37;
    public static final int L_import=103;
    public static final int SmallLetter=58;
    public static final int NIL_TOKEN=5;
    public static final int PRAGMA_PRINT=159;
    public static final int CURLY_BRACKET_OPEN=154;
    public static final int L_typedef=100;
    public static final int UNDERSCORE=156;
    public static final int MATCH=17;
    public static final int U_LESS_EQ=110;
    public static final int TRY=18;
    public static final int L_to=82;
    public static final int WS=143;
    public static final int Charcode=148;
    public static final int TYPEOF=53;
    public static final int L_do=73;
    public static final int L_val=78;
    public static final int L_match=75;
    public static final int L_obj=65;
    public static final int WsChar=142;
    public static final int L_module=99;
    public static final int GETTYPE=40;
    public static final int Hex=62;
    public static final int L_private=102;
    public static final int TYPE_PATTERN=47;
    public static final int L_for=72;
    public static final int MEMOID_WEAK=43;
    public static final int Letter=60;
    public static final int PRAGMA_ASSERT=160;
    public static final int APPLY=12;
    public static final int U_ARROW=135;
    public static final int PRAGMA_LOG=158;
    public static final int A_EQUAL=104;
    public static final int L_else=69;
    public static final int DEF=35;
    public static final int L_typeof=101;
    public static final int L_begin=63;
    public static final int U_NOT=125;
    public static final int L_div=97;
    public static final int L_yield=74;
    public static final int PLUSPLUS=130;
    public static final int MEMOID_STRONG=42;
    public static final int L_while=71;
    public static final int CASES=19;
    public static final int POW_tok=119;
    public static final int IF_PATTERN=46;
    public static final int A_ELLIPSIS=136;
    public static final int PARENTS_PLUS=26;
    public static final int A_DOUBLE_ARROW=132;
    public static final int SQUARE_BRACKET_OPEN=152;
    public static final int IF=13;
    public static final int PROG=4;
    public static final int U_OR=123;
    public static final int COMMA=138;
    public static final int OBJ=20;
    public static final int MEMOIZE=41;
    public static final int U_ELLIPSIS=137;
    public static final int TYPEDEF_CLAUSE=39;
    public static final int INNERVALUE_PATTERN=48;
    public static final int YIELD=36;
    public static final int COMPARE=11;
    public static final int U_GREATER_EQ=113;
    public static final int U_EQUAL=105;
    public static final int PLUS=115;
    public static final int String=149;
    public static final int LAMBDA=7;
    public static final int L_true=92;
    public static final int Id=146;
    public static final int A_infinity=86;
    public static final int WITH=30;
    public static final int L_in=80;
    public static final int A_NOT=122;
    public static final int L_lazy=90;
    public static final int NotNewline=56;
    public static final int L_then=68;
    public static final int QUOTIENT=118;
    public static final int TYPEDEF=38;
    public static final int L_if=67;
    public static final int CURLY_BRACKET_CLOSE=155;
    public static final int UMINUS=24;
    public static final int FOR_EXPR=21;
    public static final int Constr=145;
    public static final int WHILE_DO=22;
    public static final int PRIVATEID_WEAK=45;
    public static final int L_elseif=70;
    public static final int MINUS=116;
    public static final int Digit=61;
    public static final int L_memoize=91;
    public static final int CONVERSION=54;
    public static final int A_GREATER_EQ=112;
    public static final int ROUND_LIST=9;
    public static final int COLON=157;
    public static final int PRAGMA_PROFILE=161;
    public static final int SC=114;
    public static final int L_downto=83;
    public static final int ANY=6;
    public static final int L_random=95;
    public static final int A_NOT_EQUAL=106;
    public static final int BLOCK=28;
    public static final int ASSIGN=33;
    public static final int U_DOUBLE_COLON=127;
    public static final int OBJELEM_ASSIGN=32;
    public static final int ARROW=34;
    public static final int L_case=76;
    public static final int TIMES=117;
    public static final int U_infinity=87;
    public static final int A_LESS_EQ=109;
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:125:1: prog : block EOF -> ^( PROG block ) ;
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:125:7: ( block EOF -> ^( PROG block ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:125:9: block EOF
            {
            pushFollow(FOLLOW_block_in_prog238);
            block1=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block1.getTree());
            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_prog240); if (state.failed) return retval; 
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
            // 125:19: -> ^( PROG block )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:125:22: ^( PROG block )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:190:1: token_infinity : ( A_infinity | U_infinity );
    public final babel17Parser.token_infinity_return token_infinity() throws RecognitionException {
        babel17Parser.token_infinity_return retval = new babel17Parser.token_infinity_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set3=null;

        CommonTree set3_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:191:2: ( A_infinity | U_infinity )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:233:1: token_EQUAL : ( A_EQUAL | U_EQUAL );
    public final babel17Parser.token_EQUAL_return token_EQUAL() throws RecognitionException {
        babel17Parser.token_EQUAL_return retval = new babel17Parser.token_EQUAL_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set4=null;

        CommonTree set4_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:234:2: ( A_EQUAL | U_EQUAL )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:241:1: token_NOT_EQUAL : ( A_NOT_EQUAL | U_NOT_EQUAL );
    public final babel17Parser.token_NOT_EQUAL_return token_NOT_EQUAL() throws RecognitionException {
        babel17Parser.token_NOT_EQUAL_return retval = new babel17Parser.token_NOT_EQUAL_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set5=null;

        CommonTree set5_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:242:2: ( A_NOT_EQUAL | U_NOT_EQUAL )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:250:1: token_LESS_EQ : ( A_LESS_EQ | U_LESS_EQ );
    public final babel17Parser.token_LESS_EQ_return token_LESS_EQ() throws RecognitionException {
        babel17Parser.token_LESS_EQ_return retval = new babel17Parser.token_LESS_EQ_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set6=null;

        CommonTree set6_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:251:2: ( A_LESS_EQ | U_LESS_EQ )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:260:1: token_GREATER_EQ : ( A_GREATER_EQ | U_GREATER_EQ );
    public final babel17Parser.token_GREATER_EQ_return token_GREATER_EQ() throws RecognitionException {
        babel17Parser.token_GREATER_EQ_return retval = new babel17Parser.token_GREATER_EQ_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set7=null;

        CommonTree set7_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:261:2: ( A_GREATER_EQ | U_GREATER_EQ )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:278:1: token_OR : ( A_OR | U_OR );
    public final babel17Parser.token_OR_return token_OR() throws RecognitionException {
        babel17Parser.token_OR_return retval = new babel17Parser.token_OR_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set8=null;

        CommonTree set8_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:278:9: ( A_OR | U_OR )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:279:1: token_AND : ( A_AND | U_AND );
    public final babel17Parser.token_AND_return token_AND() throws RecognitionException {
        babel17Parser.token_AND_return retval = new babel17Parser.token_AND_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set9=null;

        CommonTree set9_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:280:2: ( A_AND | U_AND )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:281:1: token_NOT : ( A_NOT | U_NOT );
    public final babel17Parser.token_NOT_return token_NOT() throws RecognitionException {
        babel17Parser.token_NOT_return retval = new babel17Parser.token_NOT_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set10=null;

        CommonTree set10_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:282:2: ( A_NOT | U_NOT )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:288:1: token_DOUBLE_COLON : ( A_DOUBLE_COLON | U_DOUBLE_COLON );
    public final babel17Parser.token_DOUBLE_COLON_return token_DOUBLE_COLON() throws RecognitionException {
        babel17Parser.token_DOUBLE_COLON_return retval = new babel17Parser.token_DOUBLE_COLON_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set11=null;

        CommonTree set11_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:289:2: ( A_DOUBLE_COLON | U_DOUBLE_COLON )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:305:1: token_DOUBLE_ARROW : ( A_DOUBLE_ARROW | U_DOUBLE_ARROW );
    public final babel17Parser.token_DOUBLE_ARROW_return token_DOUBLE_ARROW() throws RecognitionException {
        babel17Parser.token_DOUBLE_ARROW_return retval = new babel17Parser.token_DOUBLE_ARROW_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set12=null;

        CommonTree set12_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:306:2: ( A_DOUBLE_ARROW | U_DOUBLE_ARROW )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:310:1: token_ARROW : ( A_ARROW | U_ARROW );
    public final babel17Parser.token_ARROW_return token_ARROW() throws RecognitionException {
        babel17Parser.token_ARROW_return retval = new babel17Parser.token_ARROW_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set13=null;

        CommonTree set13_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:311:2: ( A_ARROW | U_ARROW )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:316:1: token_ELLIPSIS : ( A_ELLIPSIS | U_ELLIPSIS );
    public final babel17Parser.token_ELLIPSIS_return token_ELLIPSIS() throws RecognitionException {
        babel17Parser.token_ELLIPSIS_return retval = new babel17Parser.token_ELLIPSIS_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set14=null;

        CommonTree set14_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:317:2: ( A_ELLIPSIS | U_ELLIPSIS )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:387:1: typeid : Id ( ( NL )? PERIOD ( NL )? Id )* -> ^( TYPEID ( Id )* ) ;
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:387:9: ( Id ( ( NL )? PERIOD ( NL )? Id )* -> ^( TYPEID ( Id )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:387:11: Id ( ( NL )? PERIOD ( NL )? Id )*
            {
            Id15=(Token)match(input,Id,FOLLOW_Id_in_typeid1657); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Id.add(Id15);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:387:14: ( ( NL )? PERIOD ( NL )? Id )*
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
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:387:15: ( NL )? PERIOD ( NL )? Id
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:387:15: ( NL )?
            	    int alt1=2;
            	    int LA1_0 = input.LA(1);

            	    if ( (LA1_0==NL) ) {
            	        alt1=1;
            	    }
            	    switch (alt1) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:387:15: NL
            	            {
            	            NL16=(Token)match(input,NL,FOLLOW_NL_in_typeid1660); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL16);


            	            }
            	            break;

            	    }

            	    PERIOD17=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_typeid1663); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD17);

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:387:26: ( NL )?
            	    int alt2=2;
            	    int LA2_0 = input.LA(1);

            	    if ( (LA2_0==NL) ) {
            	        alt2=1;
            	    }
            	    switch (alt2) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:387:26: NL
            	            {
            	            NL18=(Token)match(input,NL,FOLLOW_NL_in_typeid1665); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL18);


            	            }
            	            break;

            	    }

            	    Id19=(Token)match(input,Id,FOLLOW_Id_in_typeid1668); if (state.failed) return retval; 
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
            // 387:35: -> ^( TYPEID ( Id )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:387:38: ^( TYPEID ( Id )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TYPEID, "TYPEID"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:387:47: ( Id )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:389:1: typeannotation : ( typeid | L_val ( NL )? protected_expr_nc -> ^( L_val protected_expr_nc ) );
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:390:2: ( typeid | L_val ( NL )? protected_expr_nc -> ^( L_val protected_expr_nc ) )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:390:4: typeid
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_typeid_in_typeannotation1688);
                    typeid20=typeid();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeid20.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:391:4: L_val ( NL )? protected_expr_nc
                    {
                    L_val21=(Token)match(input,L_val,FOLLOW_L_val_in_typeannotation1693); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_val.add(L_val21);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:391:10: ( NL )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==NL) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:391:10: NL
                            {
                            NL22=(Token)match(input,NL,FOLLOW_NL_in_typeannotation1695); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL22);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_protected_expr_nc_in_typeannotation1698);
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
                    // 391:32: -> ^( L_val protected_expr_nc )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:391:35: ^( L_val protected_expr_nc )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:394:1: pattern : ( Constr ( ( NL )? pattern )? -> ^( Constr ( pattern )? ) | primitive_pattern ( ( NL )? token_DOUBLE_COLON ( NL )? primitive_pattern )* -> ^( LIST_CONS ( primitive_pattern )* ) | L_exception ( NL )? pattern -> ^( L_exception pattern ) | token_ELLIPSIS );
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:394:9: ( Constr ( ( NL )? pattern )? -> ^( Constr ( pattern )? ) | primitive_pattern ( ( NL )? token_DOUBLE_COLON ( NL )? primitive_pattern )* -> ^( LIST_CONS ( primitive_pattern )* ) | L_exception ( NL )? pattern -> ^( L_exception pattern ) | token_ELLIPSIS )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:394:11: Constr ( ( NL )? pattern )?
                    {
                    Constr24=(Token)match(input,Constr,FOLLOW_Constr_in_pattern1715); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Constr.add(Constr24);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:394:18: ( ( NL )? pattern )?
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
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:394:19: ( NL )? pattern
                            {
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:394:19: ( NL )?
                            int alt6=2;
                            int LA6_0 = input.LA(1);

                            if ( (LA6_0==NL) ) {
                                alt6=1;
                            }
                            switch (alt6) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:394:19: NL
                                    {
                                    NL25=(Token)match(input,NL,FOLLOW_NL_in_pattern1718); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL25);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_pattern_in_pattern1721);
                            pattern26=pattern();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_pattern.add(pattern26.getTree());

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
                    // 394:33: -> ^( Constr ( pattern )? )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:394:36: ^( Constr ( pattern )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_Constr.nextNode(), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:394:45: ( pattern )?
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:395:4: primitive_pattern ( ( NL )? token_DOUBLE_COLON ( NL )? primitive_pattern )*
                    {
                    pushFollow(FOLLOW_primitive_pattern_in_pattern1737);
                    primitive_pattern27=primitive_pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primitive_pattern.add(primitive_pattern27.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:395:22: ( ( NL )? token_DOUBLE_COLON ( NL )? primitive_pattern )*
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
                    	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:395:23: ( NL )? token_DOUBLE_COLON ( NL )? primitive_pattern
                    	    {
                    	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:395:23: ( NL )?
                    	    int alt8=2;
                    	    int LA8_0 = input.LA(1);

                    	    if ( (LA8_0==NL) ) {
                    	        alt8=1;
                    	    }
                    	    switch (alt8) {
                    	        case 1 :
                    	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:395:23: NL
                    	            {
                    	            NL28=(Token)match(input,NL,FOLLOW_NL_in_pattern1740); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_NL.add(NL28);


                    	            }
                    	            break;

                    	    }

                    	    pushFollow(FOLLOW_token_DOUBLE_COLON_in_pattern1743);
                    	    token_DOUBLE_COLON29=token_DOUBLE_COLON();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_token_DOUBLE_COLON.add(token_DOUBLE_COLON29.getTree());
                    	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:395:46: ( NL )?
                    	    int alt9=2;
                    	    int LA9_0 = input.LA(1);

                    	    if ( (LA9_0==NL) ) {
                    	        alt9=1;
                    	    }
                    	    switch (alt9) {
                    	        case 1 :
                    	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:395:46: NL
                    	            {
                    	            NL30=(Token)match(input,NL,FOLLOW_NL_in_pattern1745); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_NL.add(NL30);


                    	            }
                    	            break;

                    	    }

                    	    pushFollow(FOLLOW_primitive_pattern_in_pattern1748);
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
                    // 396:3: -> ^( LIST_CONS ( primitive_pattern )* )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:396:6: ^( LIST_CONS ( primitive_pattern )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LIST_CONS, "LIST_CONS"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:396:18: ( primitive_pattern )*
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:397:4: L_exception ( NL )? pattern
                    {
                    L_exception32=(Token)match(input,L_exception,FOLLOW_L_exception_in_pattern1767); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_exception.add(L_exception32);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:397:16: ( NL )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==NL) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:397:16: NL
                            {
                            NL33=(Token)match(input,NL,FOLLOW_NL_in_pattern1769); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL33);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_pattern_in_pattern1772);
                    pattern34=pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pattern.add(pattern34.getTree());


                    // AST REWRITE
                    // elements: L_exception, pattern
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 397:28: -> ^( L_exception pattern )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:397:31: ^( L_exception pattern )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:398:4: token_ELLIPSIS
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_ELLIPSIS_in_pattern1785);
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

    public static class defpattern_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "defpattern"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:400:1: defpattern : ( primitive_pattern ( ( NL )? token_DOUBLE_COLON ( NL )? primitive_pattern )* -> ^( LIST_CONS ( primitive_pattern )* ) | Constr ( defpattern )? -> ^( Constr ( defpattern )? ) );
    public final babel17Parser.defpattern_return defpattern() throws RecognitionException {
        babel17Parser.defpattern_return retval = new babel17Parser.defpattern_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL37=null;
        Token NL39=null;
        Token Constr41=null;
        babel17Parser.primitive_pattern_return primitive_pattern36 = null;

        babel17Parser.token_DOUBLE_COLON_return token_DOUBLE_COLON38 = null;

        babel17Parser.primitive_pattern_return primitive_pattern40 = null;

        babel17Parser.defpattern_return defpattern42 = null;


        CommonTree NL37_tree=null;
        CommonTree NL39_tree=null;
        CommonTree Constr41_tree=null;
        RewriteRuleTokenStream stream_Constr=new RewriteRuleTokenStream(adaptor,"token Constr");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_primitive_pattern=new RewriteRuleSubtreeStream(adaptor,"rule primitive_pattern");
        RewriteRuleSubtreeStream stream_token_DOUBLE_COLON=new RewriteRuleSubtreeStream(adaptor,"rule token_DOUBLE_COLON");
        RewriteRuleSubtreeStream stream_defpattern=new RewriteRuleSubtreeStream(adaptor,"rule defpattern");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:401:2: ( primitive_pattern ( ( NL )? token_DOUBLE_COLON ( NL )? primitive_pattern )* -> ^( LIST_CONS ( primitive_pattern )* ) | Constr ( defpattern )? -> ^( Constr ( defpattern )? ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=A_infinity && LA17_0<=U_infinity)||(LA17_0>=L_true && LA17_0<=L_false)||LA17_0==L_nil||LA17_0==MINUS||(LA17_0>=Id && LA17_0<=Num)||(LA17_0>=String && LA17_0<=ROUND_BRACKET_OPEN)||LA17_0==SQUARE_BRACKET_OPEN||LA17_0==CURLY_BRACKET_OPEN||LA17_0==UNDERSCORE) ) {
                alt17=1;
            }
            else if ( (LA17_0==Constr) ) {
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:401:4: primitive_pattern ( ( NL )? token_DOUBLE_COLON ( NL )? primitive_pattern )*
                    {
                    pushFollow(FOLLOW_primitive_pattern_in_defpattern1795);
                    primitive_pattern36=primitive_pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primitive_pattern.add(primitive_pattern36.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:401:22: ( ( NL )? token_DOUBLE_COLON ( NL )? primitive_pattern )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==NL) ) {
                            int LA15_1 = input.LA(2);

                            if ( ((LA15_1>=A_DOUBLE_COLON && LA15_1<=U_DOUBLE_COLON)) ) {
                                alt15=1;
                            }


                        }
                        else if ( ((LA15_0>=A_DOUBLE_COLON && LA15_0<=U_DOUBLE_COLON)) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:401:23: ( NL )? token_DOUBLE_COLON ( NL )? primitive_pattern
                    	    {
                    	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:401:23: ( NL )?
                    	    int alt13=2;
                    	    int LA13_0 = input.LA(1);

                    	    if ( (LA13_0==NL) ) {
                    	        alt13=1;
                    	    }
                    	    switch (alt13) {
                    	        case 1 :
                    	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:401:23: NL
                    	            {
                    	            NL37=(Token)match(input,NL,FOLLOW_NL_in_defpattern1798); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_NL.add(NL37);


                    	            }
                    	            break;

                    	    }

                    	    pushFollow(FOLLOW_token_DOUBLE_COLON_in_defpattern1801);
                    	    token_DOUBLE_COLON38=token_DOUBLE_COLON();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_token_DOUBLE_COLON.add(token_DOUBLE_COLON38.getTree());
                    	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:401:46: ( NL )?
                    	    int alt14=2;
                    	    int LA14_0 = input.LA(1);

                    	    if ( (LA14_0==NL) ) {
                    	        alt14=1;
                    	    }
                    	    switch (alt14) {
                    	        case 1 :
                    	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:401:46: NL
                    	            {
                    	            NL39=(Token)match(input,NL,FOLLOW_NL_in_defpattern1803); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_NL.add(NL39);


                    	            }
                    	            break;

                    	    }

                    	    pushFollow(FOLLOW_primitive_pattern_in_defpattern1806);
                    	    primitive_pattern40=primitive_pattern();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_primitive_pattern.add(primitive_pattern40.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop15;
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
                    // 402:3: -> ^( LIST_CONS ( primitive_pattern )* )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:402:6: ^( LIST_CONS ( primitive_pattern )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LIST_CONS, "LIST_CONS"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:402:18: ( primitive_pattern )*
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
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:403:4: Constr ( defpattern )?
                    {
                    Constr41=(Token)match(input,Constr,FOLLOW_Constr_in_defpattern1824); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Constr.add(Constr41);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:403:11: ( defpattern )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( ((LA16_0>=A_infinity && LA16_0<=U_infinity)||(LA16_0>=L_true && LA16_0<=L_false)||LA16_0==L_nil||LA16_0==MINUS||(LA16_0>=Constr && LA16_0<=Num)||(LA16_0>=String && LA16_0<=ROUND_BRACKET_OPEN)||LA16_0==SQUARE_BRACKET_OPEN||LA16_0==CURLY_BRACKET_OPEN||LA16_0==UNDERSCORE) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:403:11: defpattern
                            {
                            pushFollow(FOLLOW_defpattern_in_defpattern1826);
                            defpattern42=defpattern();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_defpattern.add(defpattern42.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: Constr, defpattern
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 403:23: -> ^( Constr ( defpattern )? )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:403:26: ^( Constr ( defpattern )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_Constr.nextNode(), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:403:35: ( defpattern )?
                        if ( stream_defpattern.hasNext() ) {
                            adaptor.addChild(root_1, stream_defpattern.nextTree());

                        }
                        stream_defpattern.reset();

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
    // $ANTLR end "defpattern"

    public static class bracket_pattern_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bracket_pattern"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:405:1: bracket_pattern : ( ( Id ( NL )? L_as )=> Id ( NL )? L_as ( NL )? pattern -> ^( L_as Id pattern ) | ( protected_expr ( NL )? QUESTION_MARK )=> protected_expr ( NL )? QUESTION_MARK ( ( NL )? pattern )? -> ^( QUESTION_MARK protected_expr ( pattern )? ) | ( Id pattern )=> Id pattern -> ^( INNERVALUE_PATTERN Id pattern ) | L_val ( NL )? protected_expr_nc -> ^( L_val protected_expr_nc ) | L_for ( NL )? ( bracket_pattern ( ( NL )? COMMA ( NL )? bracket_pattern )* ( NL )? )? L_end -> ^( L_for ( bracket_pattern )* ) | ( pattern ( NL )? L_if )=> pattern ( NL )? L_if ( NL )? protected_expr_nc -> ^( IF_PATTERN pattern protected_expr_nc ) | ( pattern ( NL )? ':' )=> pattern ( NL )? ':' ( NL )? typeannotation -> ^( TYPE_PATTERN typeannotation pattern ) | pattern );
    public final babel17Parser.bracket_pattern_return bracket_pattern() throws RecognitionException {
        babel17Parser.bracket_pattern_return retval = new babel17Parser.bracket_pattern_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Id43=null;
        Token NL44=null;
        Token L_as45=null;
        Token NL46=null;
        Token NL49=null;
        Token QUESTION_MARK50=null;
        Token NL51=null;
        Token Id53=null;
        Token L_val55=null;
        Token NL56=null;
        Token L_for58=null;
        Token NL59=null;
        Token NL61=null;
        Token COMMA62=null;
        Token NL63=null;
        Token NL65=null;
        Token L_end66=null;
        Token NL68=null;
        Token L_if69=null;
        Token NL70=null;
        Token NL73=null;
        Token char_literal74=null;
        Token NL75=null;
        babel17Parser.pattern_return pattern47 = null;

        babel17Parser.protected_expr_return protected_expr48 = null;

        babel17Parser.pattern_return pattern52 = null;

        babel17Parser.pattern_return pattern54 = null;

        babel17Parser.protected_expr_nc_return protected_expr_nc57 = null;

        babel17Parser.bracket_pattern_return bracket_pattern60 = null;

        babel17Parser.bracket_pattern_return bracket_pattern64 = null;

        babel17Parser.pattern_return pattern67 = null;

        babel17Parser.protected_expr_nc_return protected_expr_nc71 = null;

        babel17Parser.pattern_return pattern72 = null;

        babel17Parser.typeannotation_return typeannotation76 = null;

        babel17Parser.pattern_return pattern77 = null;


        CommonTree Id43_tree=null;
        CommonTree NL44_tree=null;
        CommonTree L_as45_tree=null;
        CommonTree NL46_tree=null;
        CommonTree NL49_tree=null;
        CommonTree QUESTION_MARK50_tree=null;
        CommonTree NL51_tree=null;
        CommonTree Id53_tree=null;
        CommonTree L_val55_tree=null;
        CommonTree NL56_tree=null;
        CommonTree L_for58_tree=null;
        CommonTree NL59_tree=null;
        CommonTree NL61_tree=null;
        CommonTree COMMA62_tree=null;
        CommonTree NL63_tree=null;
        CommonTree NL65_tree=null;
        CommonTree L_end66_tree=null;
        CommonTree NL68_tree=null;
        CommonTree L_if69_tree=null;
        CommonTree NL70_tree=null;
        CommonTree NL73_tree=null;
        CommonTree char_literal74_tree=null;
        CommonTree NL75_tree=null;
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:406:2: ( ( Id ( NL )? L_as )=> Id ( NL )? L_as ( NL )? pattern -> ^( L_as Id pattern ) | ( protected_expr ( NL )? QUESTION_MARK )=> protected_expr ( NL )? QUESTION_MARK ( ( NL )? pattern )? -> ^( QUESTION_MARK protected_expr ( pattern )? ) | ( Id pattern )=> Id pattern -> ^( INNERVALUE_PATTERN Id pattern ) | L_val ( NL )? protected_expr_nc -> ^( L_val protected_expr_nc ) | L_for ( NL )? ( bracket_pattern ( ( NL )? COMMA ( NL )? bracket_pattern )* ( NL )? )? L_end -> ^( L_for ( bracket_pattern )* ) | ( pattern ( NL )? L_if )=> pattern ( NL )? L_if ( NL )? protected_expr_nc -> ^( IF_PATTERN pattern protected_expr_nc ) | ( pattern ( NL )? ':' )=> pattern ( NL )? ':' ( NL )? typeannotation -> ^( TYPE_PATTERN typeannotation pattern ) | pattern )
            int alt34=8;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:406:10: ( Id ( NL )? L_as )=> Id ( NL )? L_as ( NL )? pattern
                    {
                    Id43=(Token)match(input,Id,FOLLOW_Id_in_bracket_pattern1863); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Id.add(Id43);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:406:30: ( NL )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==NL) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:406:30: NL
                            {
                            NL44=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1865); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL44);


                            }
                            break;

                    }

                    L_as45=(Token)match(input,L_as,FOLLOW_L_as_in_bracket_pattern1868); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_as.add(L_as45);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:406:39: ( NL )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==NL) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:406:39: NL
                            {
                            NL46=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1870); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL46);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_pattern_in_bracket_pattern1873);
                    pattern47=pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pattern.add(pattern47.getTree());


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
                    // 406:51: -> ^( L_as Id pattern )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:406:54: ^( L_as Id pattern )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:407:4: ( protected_expr ( NL )? QUESTION_MARK )=> protected_expr ( NL )? QUESTION_MARK ( ( NL )? pattern )?
                    {
                    pushFollow(FOLLOW_protected_expr_in_bracket_pattern1902);
                    protected_expr48=protected_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr48.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:408:18: ( NL )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==NL) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:408:18: NL
                            {
                            NL49=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1904); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL49);


                            }
                            break;

                    }

                    QUESTION_MARK50=(Token)match(input,QUESTION_MARK,FOLLOW_QUESTION_MARK_in_bracket_pattern1907); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QUESTION_MARK.add(QUESTION_MARK50);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:408:36: ( ( NL )? pattern )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==NL) ) {
                        int LA22_1 = input.LA(2);

                        if ( (LA22_1==L_exception||(LA22_1>=A_infinity && LA22_1<=U_infinity)||(LA22_1>=L_true && LA22_1<=L_false)||LA22_1==L_nil||LA22_1==MINUS||(LA22_1>=A_ELLIPSIS && LA22_1<=U_ELLIPSIS)||(LA22_1>=Constr && LA22_1<=Num)||(LA22_1>=String && LA22_1<=ROUND_BRACKET_OPEN)||LA22_1==SQUARE_BRACKET_OPEN||LA22_1==CURLY_BRACKET_OPEN||LA22_1==UNDERSCORE) ) {
                            alt22=1;
                        }
                    }
                    else if ( (LA22_0==L_exception||(LA22_0>=A_infinity && LA22_0<=U_infinity)||(LA22_0>=L_true && LA22_0<=L_false)||LA22_0==L_nil||LA22_0==MINUS||(LA22_0>=A_ELLIPSIS && LA22_0<=U_ELLIPSIS)||(LA22_0>=Constr && LA22_0<=Num)||(LA22_0>=String && LA22_0<=ROUND_BRACKET_OPEN)||LA22_0==SQUARE_BRACKET_OPEN||LA22_0==CURLY_BRACKET_OPEN||LA22_0==UNDERSCORE) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:408:37: ( NL )? pattern
                            {
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:408:37: ( NL )?
                            int alt21=2;
                            int LA21_0 = input.LA(1);

                            if ( (LA21_0==NL) ) {
                                alt21=1;
                            }
                            switch (alt21) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:408:37: NL
                                    {
                                    NL51=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1910); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL51);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_pattern_in_bracket_pattern1913);
                            pattern52=pattern();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_pattern.add(pattern52.getTree());

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
                    // 408:51: -> ^( QUESTION_MARK protected_expr ( pattern )? )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:408:54: ^( QUESTION_MARK protected_expr ( pattern )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_QUESTION_MARK.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_protected_expr.nextTree());
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:408:85: ( pattern )?
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:409:4: ( Id pattern )=> Id pattern
                    {
                    Id53=(Token)match(input,Id,FOLLOW_Id_in_bracket_pattern1939); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Id.add(Id53);

                    pushFollow(FOLLOW_pattern_in_bracket_pattern1941);
                    pattern54=pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pattern.add(pattern54.getTree());


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
                    // 409:31: -> ^( INNERVALUE_PATTERN Id pattern )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:409:34: ^( INNERVALUE_PATTERN Id pattern )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:410:4: L_val ( NL )? protected_expr_nc
                    {
                    L_val55=(Token)match(input,L_val,FOLLOW_L_val_in_bracket_pattern1956); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_val.add(L_val55);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:410:10: ( NL )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==NL) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:410:10: NL
                            {
                            NL56=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1958); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL56);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_protected_expr_nc_in_bracket_pattern1961);
                    protected_expr_nc57=protected_expr_nc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_protected_expr_nc.add(protected_expr_nc57.getTree());


                    // AST REWRITE
                    // elements: L_val, protected_expr_nc
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 410:32: -> ^( L_val protected_expr_nc )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:410:35: ^( L_val protected_expr_nc )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:411:10: L_for ( NL )? ( bracket_pattern ( ( NL )? COMMA ( NL )? bracket_pattern )* ( NL )? )? L_end
                    {
                    L_for58=(Token)match(input,L_for,FOLLOW_L_for_in_bracket_pattern1980); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_for.add(L_for58);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:411:16: ( NL )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==NL) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:411:16: NL
                            {
                            NL59=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1982); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL59);


                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:411:20: ( bracket_pattern ( ( NL )? COMMA ( NL )? bracket_pattern )* ( NL )? )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==L_begin||(LA29_0>=L_obj && LA29_0<=L_if)||(LA29_0>=L_while && LA29_0<=L_for)||LA29_0==L_match||LA29_0==L_val||LA29_0==L_exception||LA29_0==L_try||(LA29_0>=A_infinity && LA29_0<=L_lazy)||(LA29_0>=L_true && LA29_0<=L_nil)||LA29_0==L_typeof||LA29_0==MINUS||LA29_0==A_NOT||LA29_0==U_NOT||(LA29_0>=A_ELLIPSIS && LA29_0<=U_ELLIPSIS)||LA29_0==L_force||(LA29_0>=Constr && LA29_0<=Num)||(LA29_0>=String && LA29_0<=ROUND_BRACKET_OPEN)||LA29_0==SQUARE_BRACKET_OPEN||LA29_0==CURLY_BRACKET_OPEN||LA29_0==UNDERSCORE) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:411:21: bracket_pattern ( ( NL )? COMMA ( NL )? bracket_pattern )* ( NL )?
                            {
                            pushFollow(FOLLOW_bracket_pattern_in_bracket_pattern1986);
                            bracket_pattern60=bracket_pattern();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_bracket_pattern.add(bracket_pattern60.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:411:37: ( ( NL )? COMMA ( NL )? bracket_pattern )*
                            loop27:
                            do {
                                int alt27=2;
                                int LA27_0 = input.LA(1);

                                if ( (LA27_0==NL) ) {
                                    int LA27_1 = input.LA(2);

                                    if ( (LA27_1==COMMA) ) {
                                        alt27=1;
                                    }


                                }
                                else if ( (LA27_0==COMMA) ) {
                                    alt27=1;
                                }


                                switch (alt27) {
                            	case 1 :
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:411:39: ( NL )? COMMA ( NL )? bracket_pattern
                            	    {
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:411:39: ( NL )?
                            	    int alt25=2;
                            	    int LA25_0 = input.LA(1);

                            	    if ( (LA25_0==NL) ) {
                            	        alt25=1;
                            	    }
                            	    switch (alt25) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:411:39: NL
                            	            {
                            	            NL61=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1990); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL61);


                            	            }
                            	            break;

                            	    }

                            	    COMMA62=(Token)match(input,COMMA,FOLLOW_COMMA_in_bracket_pattern1993); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA62);

                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:411:49: ( NL )?
                            	    int alt26=2;
                            	    int LA26_0 = input.LA(1);

                            	    if ( (LA26_0==NL) ) {
                            	        alt26=1;
                            	    }
                            	    switch (alt26) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:411:49: NL
                            	            {
                            	            NL63=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1995); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL63);


                            	            }
                            	            break;

                            	    }

                            	    pushFollow(FOLLOW_bracket_pattern_in_bracket_pattern1998);
                            	    bracket_pattern64=bracket_pattern();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_bracket_pattern.add(bracket_pattern64.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop27;
                                }
                            } while (true);

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:411:72: ( NL )?
                            int alt28=2;
                            int LA28_0 = input.LA(1);

                            if ( (LA28_0==NL) ) {
                                alt28=1;
                            }
                            switch (alt28) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:411:72: NL
                                    {
                                    NL65=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern2003); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL65);


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    L_end66=(Token)match(input,L_end,FOLLOW_L_end_in_bracket_pattern2008); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_end.add(L_end66);



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
                    // 411:84: -> ^( L_for ( bracket_pattern )* )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:411:87: ^( L_for ( bracket_pattern )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_L_for.nextNode(), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:411:95: ( bracket_pattern )*
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:412:4: ( pattern ( NL )? L_if )=> pattern ( NL )? L_if ( NL )? protected_expr_nc
                    {
                    pushFollow(FOLLOW_pattern_in_bracket_pattern2033);
                    pattern67=pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pattern.add(pattern67.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:412:34: ( NL )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==NL) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:412:34: NL
                            {
                            NL68=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern2035); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL68);


                            }
                            break;

                    }

                    L_if69=(Token)match(input,L_if,FOLLOW_L_if_in_bracket_pattern2038); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_if.add(L_if69);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:412:43: ( NL )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==NL) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:412:43: NL
                            {
                            NL70=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern2040); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL70);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_protected_expr_nc_in_bracket_pattern2043);
                    protected_expr_nc71=protected_expr_nc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_protected_expr_nc.add(protected_expr_nc71.getTree());


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
                    // 412:65: -> ^( IF_PATTERN pattern protected_expr_nc )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:412:68: ^( IF_PATTERN pattern protected_expr_nc )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:413:4: ( pattern ( NL )? ':' )=> pattern ( NL )? ':' ( NL )? typeannotation
                    {
                    pushFollow(FOLLOW_pattern_in_bracket_pattern2069);
                    pattern72=pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pattern.add(pattern72.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:413:33: ( NL )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==NL) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:413:33: NL
                            {
                            NL73=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern2071); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL73);


                            }
                            break;

                    }

                    char_literal74=(Token)match(input,COLON,FOLLOW_COLON_in_bracket_pattern2074); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(char_literal74);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:413:41: ( NL )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==NL) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:413:41: NL
                            {
                            NL75=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern2076); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL75);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_typeannotation_in_bracket_pattern2079);
                    typeannotation76=typeannotation();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeannotation.add(typeannotation76.getTree());


                    // AST REWRITE
                    // elements: typeannotation, pattern
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 413:60: -> ^( TYPE_PATTERN typeannotation pattern )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:413:63: ^( TYPE_PATTERN typeannotation pattern )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:414:4: pattern
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_pattern_in_bracket_pattern2094);
                    pattern77=pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, pattern77.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:416:1: arrow_or_assign : ( token_ARROW -> ^( ARROW ) | ASSIGN -> ^( ASSIGN ) );
    public final babel17Parser.arrow_or_assign_return arrow_or_assign() throws RecognitionException {
        babel17Parser.arrow_or_assign_return retval = new babel17Parser.arrow_or_assign_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ASSIGN79=null;
        babel17Parser.token_ARROW_return token_ARROW78 = null;


        CommonTree ASSIGN79_tree=null;
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_token_ARROW=new RewriteRuleSubtreeStream(adaptor,"rule token_ARROW");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:417:2: ( token_ARROW -> ^( ARROW ) | ASSIGN -> ^( ASSIGN ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=A_ARROW && LA35_0<=U_ARROW)) ) {
                alt35=1;
            }
            else if ( (LA35_0==ASSIGN) ) {
                alt35=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:417:4: token_ARROW
                    {
                    pushFollow(FOLLOW_token_ARROW_in_arrow_or_assign2104);
                    token_ARROW78=token_ARROW();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_token_ARROW.add(token_ARROW78.getTree());


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
                    // 417:16: -> ^( ARROW )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:417:19: ^( ARROW )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:418:4: ASSIGN
                    {
                    ASSIGN79=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_arrow_or_assign2115); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN79);



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
                    // 418:11: -> ^( ASSIGN )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:418:14: ^( ASSIGN )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:420:1: mselem_pattern : bracket_pattern ( ( NL )? arrow_or_assign ( NL )? bracket_pattern )? -> ^( NIL_TOKEN ^( NIL_TOKEN ( bracket_pattern )* ) ( arrow_or_assign )* ) ;
    public final babel17Parser.mselem_pattern_return mselem_pattern() throws RecognitionException {
        babel17Parser.mselem_pattern_return retval = new babel17Parser.mselem_pattern_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL81=null;
        Token NL83=null;
        babel17Parser.bracket_pattern_return bracket_pattern80 = null;

        babel17Parser.arrow_or_assign_return arrow_or_assign82 = null;

        babel17Parser.bracket_pattern_return bracket_pattern84 = null;


        CommonTree NL81_tree=null;
        CommonTree NL83_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_arrow_or_assign=new RewriteRuleSubtreeStream(adaptor,"rule arrow_or_assign");
        RewriteRuleSubtreeStream stream_bracket_pattern=new RewriteRuleSubtreeStream(adaptor,"rule bracket_pattern");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:421:2: ( bracket_pattern ( ( NL )? arrow_or_assign ( NL )? bracket_pattern )? -> ^( NIL_TOKEN ^( NIL_TOKEN ( bracket_pattern )* ) ( arrow_or_assign )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:421:4: bracket_pattern ( ( NL )? arrow_or_assign ( NL )? bracket_pattern )?
            {
            pushFollow(FOLLOW_bracket_pattern_in_mselem_pattern2130);
            bracket_pattern80=bracket_pattern();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bracket_pattern.add(bracket_pattern80.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:421:20: ( ( NL )? arrow_or_assign ( NL )? bracket_pattern )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==NL) ) {
                int LA38_1 = input.LA(2);

                if ( (LA38_1==ASSIGN||(LA38_1>=A_ARROW && LA38_1<=U_ARROW)) ) {
                    alt38=1;
                }
            }
            else if ( (LA38_0==ASSIGN||(LA38_0>=A_ARROW && LA38_0<=U_ARROW)) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:421:21: ( NL )? arrow_or_assign ( NL )? bracket_pattern
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:421:21: ( NL )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==NL) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:421:21: NL
                            {
                            NL81=(Token)match(input,NL,FOLLOW_NL_in_mselem_pattern2133); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL81);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_arrow_or_assign_in_mselem_pattern2136);
                    arrow_or_assign82=arrow_or_assign();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_arrow_or_assign.add(arrow_or_assign82.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:421:41: ( NL )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==NL) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:421:41: NL
                            {
                            NL83=(Token)match(input,NL,FOLLOW_NL_in_mselem_pattern2138); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL83);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_bracket_pattern_in_mselem_pattern2141);
                    bracket_pattern84=bracket_pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_bracket_pattern.add(bracket_pattern84.getTree());

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
            // 422:3: -> ^( NIL_TOKEN ^( NIL_TOKEN ( bracket_pattern )* ) ( arrow_or_assign )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:422:6: ^( NIL_TOKEN ^( NIL_TOKEN ( bracket_pattern )* ) ( arrow_or_assign )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:422:18: ^( NIL_TOKEN ( bracket_pattern )* )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_2);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:422:30: ( bracket_pattern )*
                while ( stream_bracket_pattern.hasNext() ) {
                    adaptor.addChild(root_2, stream_bracket_pattern.nextTree());

                }
                stream_bracket_pattern.reset();

                adaptor.addChild(root_1, root_2);
                }
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:422:48: ( arrow_or_assign )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:424:1: primitive_pattern : ( Id | '_' -> ANY | String | Num | L_true | L_false | L_nil | token_infinity | '-' ( NL )? token_infinity -> ^( UMINUS token_infinity ) | '-' ( NL )? Num -> ^( UMINUS Num ) | '[' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* )? ']' -> ^( SQUARE_LIST ( bracket_pattern )* ) | '(' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* ( COMMA ( NL )? )? )? ')' -> ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( bracket_pattern )* ) ) | '{' ( NL )? ( mselem_pattern ( NL )? ( COMMA ( NL )? mselem_pattern ( NL )? )* )? '}' -> ^( MAP_OR_SET_OR_OBJ ( mselem_pattern )* ) | '{' ( NL )? token_ARROW ( NL )? '}' -> ^( EMPTY_MAP ) );
    public final babel17Parser.primitive_pattern_return primitive_pattern() throws RecognitionException {
        babel17Parser.primitive_pattern_return retval = new babel17Parser.primitive_pattern_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Id85=null;
        Token char_literal86=null;
        Token String87=null;
        Token Num88=null;
        Token L_true89=null;
        Token L_false90=null;
        Token L_nil91=null;
        Token char_literal93=null;
        Token NL94=null;
        Token char_literal96=null;
        Token NL97=null;
        Token Num98=null;
        Token char_literal99=null;
        Token NL100=null;
        Token NL102=null;
        Token COMMA103=null;
        Token NL104=null;
        Token NL106=null;
        Token char_literal107=null;
        Token char_literal108=null;
        Token NL109=null;
        Token NL111=null;
        Token COMMA112=null;
        Token NL113=null;
        Token NL115=null;
        Token COMMA116=null;
        Token NL117=null;
        Token char_literal118=null;
        Token char_literal119=null;
        Token NL120=null;
        Token NL122=null;
        Token COMMA123=null;
        Token NL124=null;
        Token NL126=null;
        Token char_literal127=null;
        Token char_literal128=null;
        Token NL129=null;
        Token NL131=null;
        Token char_literal132=null;
        babel17Parser.token_infinity_return token_infinity92 = null;

        babel17Parser.token_infinity_return token_infinity95 = null;

        babel17Parser.bracket_pattern_return bracket_pattern101 = null;

        babel17Parser.bracket_pattern_return bracket_pattern105 = null;

        babel17Parser.bracket_pattern_return bracket_pattern110 = null;

        babel17Parser.bracket_pattern_return bracket_pattern114 = null;

        babel17Parser.mselem_pattern_return mselem_pattern121 = null;

        babel17Parser.mselem_pattern_return mselem_pattern125 = null;

        babel17Parser.token_ARROW_return token_ARROW130 = null;


        CommonTree Id85_tree=null;
        CommonTree char_literal86_tree=null;
        CommonTree String87_tree=null;
        CommonTree Num88_tree=null;
        CommonTree L_true89_tree=null;
        CommonTree L_false90_tree=null;
        CommonTree L_nil91_tree=null;
        CommonTree char_literal93_tree=null;
        CommonTree NL94_tree=null;
        CommonTree char_literal96_tree=null;
        CommonTree NL97_tree=null;
        CommonTree Num98_tree=null;
        CommonTree char_literal99_tree=null;
        CommonTree NL100_tree=null;
        CommonTree NL102_tree=null;
        CommonTree COMMA103_tree=null;
        CommonTree NL104_tree=null;
        CommonTree NL106_tree=null;
        CommonTree char_literal107_tree=null;
        CommonTree char_literal108_tree=null;
        CommonTree NL109_tree=null;
        CommonTree NL111_tree=null;
        CommonTree COMMA112_tree=null;
        CommonTree NL113_tree=null;
        CommonTree NL115_tree=null;
        CommonTree COMMA116_tree=null;
        CommonTree NL117_tree=null;
        CommonTree char_literal118_tree=null;
        CommonTree char_literal119_tree=null;
        CommonTree NL120_tree=null;
        CommonTree NL122_tree=null;
        CommonTree COMMA123_tree=null;
        CommonTree NL124_tree=null;
        CommonTree NL126_tree=null;
        CommonTree char_literal127_tree=null;
        CommonTree char_literal128_tree=null;
        CommonTree NL129_tree=null;
        CommonTree NL131_tree=null;
        CommonTree char_literal132_tree=null;
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:425:2: ( Id | '_' -> ANY | String | Num | L_true | L_false | L_nil | token_infinity | '-' ( NL )? token_infinity -> ^( UMINUS token_infinity ) | '-' ( NL )? Num -> ^( UMINUS Num ) | '[' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* )? ']' -> ^( SQUARE_LIST ( bracket_pattern )* ) | '(' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* ( COMMA ( NL )? )? )? ')' -> ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( bracket_pattern )* ) ) | '{' ( NL )? ( mselem_pattern ( NL )? ( COMMA ( NL )? mselem_pattern ( NL )? )* )? '}' -> ^( MAP_OR_SET_OR_OBJ ( mselem_pattern )* ) | '{' ( NL )? token_ARROW ( NL )? '}' -> ^( EMPTY_MAP ) )
            int alt63=14;
            alt63 = dfa63.predict(input);
            switch (alt63) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:425:4: Id
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Id85=(Token)match(input,Id,FOLLOW_Id_in_primitive_pattern2170); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Id85_tree = (CommonTree)adaptor.create(Id85);
                    adaptor.addChild(root_0, Id85_tree);
                    }

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:426:4: '_'
                    {
                    char_literal86=(Token)match(input,UNDERSCORE,FOLLOW_UNDERSCORE_in_primitive_pattern2175); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_UNDERSCORE.add(char_literal86);



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
                    // 426:8: -> ANY
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(ANY, "ANY"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:427:4: String
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    String87=(Token)match(input,String,FOLLOW_String_in_primitive_pattern2184); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    String87_tree = (CommonTree)adaptor.create(String87);
                    adaptor.addChild(root_0, String87_tree);
                    }

                    }
                    break;
                case 4 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:428:4: Num
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Num88=(Token)match(input,Num,FOLLOW_Num_in_primitive_pattern2189); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Num88_tree = (CommonTree)adaptor.create(Num88);
                    adaptor.addChild(root_0, Num88_tree);
                    }

                    }
                    break;
                case 5 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:429:4: L_true
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    L_true89=(Token)match(input,L_true,FOLLOW_L_true_in_primitive_pattern2194); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    L_true89_tree = (CommonTree)adaptor.create(L_true89);
                    adaptor.addChild(root_0, L_true89_tree);
                    }

                    }
                    break;
                case 6 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:430:4: L_false
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    L_false90=(Token)match(input,L_false,FOLLOW_L_false_in_primitive_pattern2199); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    L_false90_tree = (CommonTree)adaptor.create(L_false90);
                    adaptor.addChild(root_0, L_false90_tree);
                    }

                    }
                    break;
                case 7 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:431:4: L_nil
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    L_nil91=(Token)match(input,L_nil,FOLLOW_L_nil_in_primitive_pattern2204); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    L_nil91_tree = (CommonTree)adaptor.create(L_nil91);
                    adaptor.addChild(root_0, L_nil91_tree);
                    }

                    }
                    break;
                case 8 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:432:4: token_infinity
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_infinity_in_primitive_pattern2209);
                    token_infinity92=token_infinity();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, token_infinity92.getTree());

                    }
                    break;
                case 9 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:433:4: '-' ( NL )? token_infinity
                    {
                    char_literal93=(Token)match(input,MINUS,FOLLOW_MINUS_in_primitive_pattern2214); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(char_literal93);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:433:8: ( NL )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==NL) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:433:8: NL
                            {
                            NL94=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2216); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL94);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_token_infinity_in_primitive_pattern2219);
                    token_infinity95=token_infinity();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_token_infinity.add(token_infinity95.getTree());


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
                    // 433:27: -> ^( UMINUS token_infinity )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:433:30: ^( UMINUS token_infinity )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:434:4: '-' ( NL )? Num
                    {
                    char_literal96=(Token)match(input,MINUS,FOLLOW_MINUS_in_primitive_pattern2232); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(char_literal96);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:434:8: ( NL )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==NL) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:434:8: NL
                            {
                            NL97=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2234); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL97);


                            }
                            break;

                    }

                    Num98=(Token)match(input,Num,FOLLOW_Num_in_primitive_pattern2237); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Num.add(Num98);



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
                    // 434:16: -> ^( UMINUS Num )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:434:19: ^( UMINUS Num )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:435:4: '[' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* )? ']'
                    {
                    char_literal99=(Token)match(input,SQUARE_BRACKET_OPEN,FOLLOW_SQUARE_BRACKET_OPEN_in_primitive_pattern2250); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SQUARE_BRACKET_OPEN.add(char_literal99);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:435:9: ( NL )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==NL) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:435:9: NL
                            {
                            NL100=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2253); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL100);


                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:435:13: ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==L_begin||(LA46_0>=L_obj && LA46_0<=L_if)||(LA46_0>=L_while && LA46_0<=L_for)||LA46_0==L_match||LA46_0==L_val||LA46_0==L_exception||LA46_0==L_try||(LA46_0>=A_infinity && LA46_0<=L_lazy)||(LA46_0>=L_true && LA46_0<=L_nil)||LA46_0==L_typeof||LA46_0==MINUS||LA46_0==A_NOT||LA46_0==U_NOT||(LA46_0>=A_ELLIPSIS && LA46_0<=U_ELLIPSIS)||LA46_0==L_force||(LA46_0>=Constr && LA46_0<=Num)||(LA46_0>=String && LA46_0<=ROUND_BRACKET_OPEN)||LA46_0==SQUARE_BRACKET_OPEN||LA46_0==CURLY_BRACKET_OPEN||LA46_0==UNDERSCORE) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:435:14: bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )*
                            {
                            pushFollow(FOLLOW_bracket_pattern_in_primitive_pattern2257);
                            bracket_pattern101=bracket_pattern();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_bracket_pattern.add(bracket_pattern101.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:435:30: ( NL )?
                            int alt42=2;
                            int LA42_0 = input.LA(1);

                            if ( (LA42_0==NL) ) {
                                alt42=1;
                            }
                            switch (alt42) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:435:30: NL
                                    {
                                    NL102=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2259); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL102);


                                    }
                                    break;

                            }

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:435:34: ( COMMA ( NL )? bracket_pattern ( NL )? )*
                            loop45:
                            do {
                                int alt45=2;
                                int LA45_0 = input.LA(1);

                                if ( (LA45_0==COMMA) ) {
                                    alt45=1;
                                }


                                switch (alt45) {
                            	case 1 :
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:435:36: COMMA ( NL )? bracket_pattern ( NL )?
                            	    {
                            	    COMMA103=(Token)match(input,COMMA,FOLLOW_COMMA_in_primitive_pattern2264); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA103);

                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:435:42: ( NL )?
                            	    int alt43=2;
                            	    int LA43_0 = input.LA(1);

                            	    if ( (LA43_0==NL) ) {
                            	        alt43=1;
                            	    }
                            	    switch (alt43) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:435:42: NL
                            	            {
                            	            NL104=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2266); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL104);


                            	            }
                            	            break;

                            	    }

                            	    pushFollow(FOLLOW_bracket_pattern_in_primitive_pattern2269);
                            	    bracket_pattern105=bracket_pattern();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_bracket_pattern.add(bracket_pattern105.getTree());
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:435:62: ( NL )?
                            	    int alt44=2;
                            	    int LA44_0 = input.LA(1);

                            	    if ( (LA44_0==NL) ) {
                            	        alt44=1;
                            	    }
                            	    switch (alt44) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:435:62: NL
                            	            {
                            	            NL106=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2271); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL106);


                            	            }
                            	            break;

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop45;
                                }
                            } while (true);


                            }
                            break;

                    }

                    char_literal107=(Token)match(input,SQUARE_BRACKET_CLOSE,FOLLOW_SQUARE_BRACKET_CLOSE_in_primitive_pattern2279); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SQUARE_BRACKET_CLOSE.add(char_literal107);



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
                    // 436:6: -> ^( SQUARE_LIST ( bracket_pattern )* )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:436:9: ^( SQUARE_LIST ( bracket_pattern )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SQUARE_LIST, "SQUARE_LIST"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:436:23: ( bracket_pattern )*
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:437:4: '(' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* ( COMMA ( NL )? )? )? ')'
                    {
                    char_literal108=(Token)match(input,ROUND_BRACKET_OPEN,FOLLOW_ROUND_BRACKET_OPEN_in_primitive_pattern2299); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ROUND_BRACKET_OPEN.add(char_literal108);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:437:9: ( NL )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==NL) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:437:9: NL
                            {
                            NL109=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2302); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL109);


                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:437:13: ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* ( COMMA ( NL )? )? )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==L_begin||(LA54_0>=L_obj && LA54_0<=L_if)||(LA54_0>=L_while && LA54_0<=L_for)||LA54_0==L_match||LA54_0==L_val||LA54_0==L_exception||LA54_0==L_try||(LA54_0>=A_infinity && LA54_0<=L_lazy)||(LA54_0>=L_true && LA54_0<=L_nil)||LA54_0==L_typeof||LA54_0==MINUS||LA54_0==A_NOT||LA54_0==U_NOT||(LA54_0>=A_ELLIPSIS && LA54_0<=U_ELLIPSIS)||LA54_0==L_force||(LA54_0>=Constr && LA54_0<=Num)||(LA54_0>=String && LA54_0<=ROUND_BRACKET_OPEN)||LA54_0==SQUARE_BRACKET_OPEN||LA54_0==CURLY_BRACKET_OPEN||LA54_0==UNDERSCORE) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:437:14: bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* ( COMMA ( NL )? )?
                            {
                            pushFollow(FOLLOW_bracket_pattern_in_primitive_pattern2306);
                            bracket_pattern110=bracket_pattern();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_bracket_pattern.add(bracket_pattern110.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:437:30: ( NL )?
                            int alt48=2;
                            int LA48_0 = input.LA(1);

                            if ( (LA48_0==NL) ) {
                                alt48=1;
                            }
                            switch (alt48) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:437:30: NL
                                    {
                                    NL111=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2308); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL111);


                                    }
                                    break;

                            }

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:437:34: ( COMMA ( NL )? bracket_pattern ( NL )? )*
                            loop51:
                            do {
                                int alt51=2;
                                int LA51_0 = input.LA(1);

                                if ( (LA51_0==COMMA) ) {
                                    int LA51_1 = input.LA(2);

                                    if ( (LA51_1==NL) ) {
                                        int LA51_3 = input.LA(3);

                                        if ( (LA51_3==L_begin||(LA51_3>=L_obj && LA51_3<=L_if)||(LA51_3>=L_while && LA51_3<=L_for)||LA51_3==L_match||LA51_3==L_val||LA51_3==L_exception||LA51_3==L_try||(LA51_3>=A_infinity && LA51_3<=L_lazy)||(LA51_3>=L_true && LA51_3<=L_nil)||LA51_3==L_typeof||LA51_3==MINUS||LA51_3==A_NOT||LA51_3==U_NOT||(LA51_3>=A_ELLIPSIS && LA51_3<=U_ELLIPSIS)||LA51_3==L_force||(LA51_3>=Constr && LA51_3<=Num)||(LA51_3>=String && LA51_3<=ROUND_BRACKET_OPEN)||LA51_3==SQUARE_BRACKET_OPEN||LA51_3==CURLY_BRACKET_OPEN||LA51_3==UNDERSCORE) ) {
                                            alt51=1;
                                        }


                                    }
                                    else if ( (LA51_1==L_begin||(LA51_1>=L_obj && LA51_1<=L_if)||(LA51_1>=L_while && LA51_1<=L_for)||LA51_1==L_match||LA51_1==L_val||LA51_1==L_exception||LA51_1==L_try||(LA51_1>=A_infinity && LA51_1<=L_lazy)||(LA51_1>=L_true && LA51_1<=L_nil)||LA51_1==L_typeof||LA51_1==MINUS||LA51_1==A_NOT||LA51_1==U_NOT||(LA51_1>=A_ELLIPSIS && LA51_1<=U_ELLIPSIS)||LA51_1==L_force||(LA51_1>=Constr && LA51_1<=Num)||(LA51_1>=String && LA51_1<=ROUND_BRACKET_OPEN)||LA51_1==SQUARE_BRACKET_OPEN||LA51_1==CURLY_BRACKET_OPEN||LA51_1==UNDERSCORE) ) {
                                        alt51=1;
                                    }


                                }


                                switch (alt51) {
                            	case 1 :
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:437:36: COMMA ( NL )? bracket_pattern ( NL )?
                            	    {
                            	    COMMA112=(Token)match(input,COMMA,FOLLOW_COMMA_in_primitive_pattern2313); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA112);

                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:437:43: ( NL )?
                            	    int alt49=2;
                            	    int LA49_0 = input.LA(1);

                            	    if ( (LA49_0==NL) ) {
                            	        alt49=1;
                            	    }
                            	    switch (alt49) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:437:43: NL
                            	            {
                            	            NL113=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2316); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL113);


                            	            }
                            	            break;

                            	    }

                            	    pushFollow(FOLLOW_bracket_pattern_in_primitive_pattern2319);
                            	    bracket_pattern114=bracket_pattern();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_bracket_pattern.add(bracket_pattern114.getTree());
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:437:63: ( NL )?
                            	    int alt50=2;
                            	    int LA50_0 = input.LA(1);

                            	    if ( (LA50_0==NL) ) {
                            	        alt50=1;
                            	    }
                            	    switch (alt50) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:437:63: NL
                            	            {
                            	            NL115=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2321); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL115);


                            	            }
                            	            break;

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop51;
                                }
                            } while (true);

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:437:69: ( COMMA ( NL )? )?
                            int alt53=2;
                            int LA53_0 = input.LA(1);

                            if ( (LA53_0==COMMA) ) {
                                alt53=1;
                            }
                            switch (alt53) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:437:70: COMMA ( NL )?
                                    {
                                    COMMA116=(Token)match(input,COMMA,FOLLOW_COMMA_in_primitive_pattern2327); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_COMMA.add(COMMA116);

                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:437:76: ( NL )?
                                    int alt52=2;
                                    int LA52_0 = input.LA(1);

                                    if ( (LA52_0==NL) ) {
                                        alt52=1;
                                    }
                                    switch (alt52) {
                                        case 1 :
                                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:437:76: NL
                                            {
                                            NL117=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2329); if (state.failed) return retval; 
                                            if ( state.backtracking==0 ) stream_NL.add(NL117);


                                            }
                                            break;

                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    char_literal118=(Token)match(input,ROUND_BRACKET_CLOSE,FOLLOW_ROUND_BRACKET_CLOSE_in_primitive_pattern2336); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ROUND_BRACKET_CLOSE.add(char_literal118);



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
                    // 438:5: -> ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( bracket_pattern )* ) )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:438:8: ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( bracket_pattern )* ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ROUND_LIST, "ROUND_LIST"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:438:21: ^( NIL_TOKEN ( COMMA )* )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_2);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:438:33: ( COMMA )*
                        while ( stream_COMMA.hasNext() ) {
                            adaptor.addChild(root_2, stream_COMMA.nextNode());

                        }
                        stream_COMMA.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:438:41: ^( NIL_TOKEN ( bracket_pattern )* )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_2);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:438:53: ( bracket_pattern )*
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:439:4: '{' ( NL )? ( mselem_pattern ( NL )? ( COMMA ( NL )? mselem_pattern ( NL )? )* )? '}'
                    {
                    char_literal119=(Token)match(input,CURLY_BRACKET_OPEN,FOLLOW_CURLY_BRACKET_OPEN_in_primitive_pattern2368); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_OPEN.add(char_literal119);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:439:9: ( NL )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==NL) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:439:9: NL
                            {
                            NL120=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2371); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL120);


                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:439:13: ( mselem_pattern ( NL )? ( COMMA ( NL )? mselem_pattern ( NL )? )* )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==L_begin||(LA60_0>=L_obj && LA60_0<=L_if)||(LA60_0>=L_while && LA60_0<=L_for)||LA60_0==L_match||LA60_0==L_val||LA60_0==L_exception||LA60_0==L_try||(LA60_0>=A_infinity && LA60_0<=L_lazy)||(LA60_0>=L_true && LA60_0<=L_nil)||LA60_0==L_typeof||LA60_0==MINUS||LA60_0==A_NOT||LA60_0==U_NOT||(LA60_0>=A_ELLIPSIS && LA60_0<=U_ELLIPSIS)||LA60_0==L_force||(LA60_0>=Constr && LA60_0<=Num)||(LA60_0>=String && LA60_0<=ROUND_BRACKET_OPEN)||LA60_0==SQUARE_BRACKET_OPEN||LA60_0==CURLY_BRACKET_OPEN||LA60_0==UNDERSCORE) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:439:14: mselem_pattern ( NL )? ( COMMA ( NL )? mselem_pattern ( NL )? )*
                            {
                            pushFollow(FOLLOW_mselem_pattern_in_primitive_pattern2375);
                            mselem_pattern121=mselem_pattern();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_mselem_pattern.add(mselem_pattern121.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:439:29: ( NL )?
                            int alt56=2;
                            int LA56_0 = input.LA(1);

                            if ( (LA56_0==NL) ) {
                                alt56=1;
                            }
                            switch (alt56) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:439:29: NL
                                    {
                                    NL122=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2377); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL122);


                                    }
                                    break;

                            }

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:439:33: ( COMMA ( NL )? mselem_pattern ( NL )? )*
                            loop59:
                            do {
                                int alt59=2;
                                int LA59_0 = input.LA(1);

                                if ( (LA59_0==COMMA) ) {
                                    alt59=1;
                                }


                                switch (alt59) {
                            	case 1 :
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:439:35: COMMA ( NL )? mselem_pattern ( NL )?
                            	    {
                            	    COMMA123=(Token)match(input,COMMA,FOLLOW_COMMA_in_primitive_pattern2382); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA123);

                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:439:42: ( NL )?
                            	    int alt57=2;
                            	    int LA57_0 = input.LA(1);

                            	    if ( (LA57_0==NL) ) {
                            	        alt57=1;
                            	    }
                            	    switch (alt57) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:439:42: NL
                            	            {
                            	            NL124=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2385); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL124);


                            	            }
                            	            break;

                            	    }

                            	    pushFollow(FOLLOW_mselem_pattern_in_primitive_pattern2388);
                            	    mselem_pattern125=mselem_pattern();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_mselem_pattern.add(mselem_pattern125.getTree());
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:439:61: ( NL )?
                            	    int alt58=2;
                            	    int LA58_0 = input.LA(1);

                            	    if ( (LA58_0==NL) ) {
                            	        alt58=1;
                            	    }
                            	    switch (alt58) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:439:61: NL
                            	            {
                            	            NL126=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2390); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL126);


                            	            }
                            	            break;

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop59;
                                }
                            } while (true);


                            }
                            break;

                    }

                    char_literal127=(Token)match(input,CURLY_BRACKET_CLOSE,FOLLOW_CURLY_BRACKET_CLOSE_in_primitive_pattern2398); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_CLOSE.add(char_literal127);



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
                    // 440:5: -> ^( MAP_OR_SET_OR_OBJ ( mselem_pattern )* )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:440:8: ^( MAP_OR_SET_OR_OBJ ( mselem_pattern )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MAP_OR_SET_OR_OBJ, "MAP_OR_SET_OR_OBJ"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:440:28: ( mselem_pattern )*
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:441:4: '{' ( NL )? token_ARROW ( NL )? '}'
                    {
                    char_literal128=(Token)match(input,CURLY_BRACKET_OPEN,FOLLOW_CURLY_BRACKET_OPEN_in_primitive_pattern2416); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_OPEN.add(char_literal128);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:441:8: ( NL )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==NL) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:441:8: NL
                            {
                            NL129=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2418); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL129);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_token_ARROW_in_primitive_pattern2421);
                    token_ARROW130=token_ARROW();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_token_ARROW.add(token_ARROW130.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:441:24: ( NL )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==NL) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:441:24: NL
                            {
                            NL131=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2423); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL131);


                            }
                            break;

                    }

                    char_literal132=(Token)match(input,CURLY_BRACKET_CLOSE,FOLLOW_CURLY_BRACKET_CLOSE_in_primitive_pattern2426); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_CLOSE.add(char_literal132);



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
                    // 441:32: -> ^( EMPTY_MAP )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:441:35: ^( EMPTY_MAP )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:444:1: sep : ( NL | SC )+ ;
    public final babel17Parser.sep_return sep() throws RecognitionException {
        babel17Parser.sep_return retval = new babel17Parser.sep_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set133=null;

        CommonTree set133_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:444:5: ( ( NL | SC )+ )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:444:7: ( NL | SC )+
            {
            root_0 = (CommonTree)adaptor.nil();

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:444:7: ( NL | SC )+
            int cnt64=0;
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==SC||LA64_0==NL) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:
            	    {
            	    set133=(Token)input.LT(1);
            	    if ( input.LA(1)==SC||input.LA(1)==NL ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set133));
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
            	    if ( cnt64 >= 1 ) break loop64;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(64, input);
                        throw eee;
                }
                cnt64++;
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:446:1: block : ( ( sep )? statement ( sep statement )* ( sep )? -> ^( BLOCK ( statement )* ) | ( sep )? -> ^( BLOCK ) );
    public final babel17Parser.block_return block() throws RecognitionException {
        babel17Parser.block_return retval = new babel17Parser.block_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.sep_return sep134 = null;

        babel17Parser.statement_return statement135 = null;

        babel17Parser.sep_return sep136 = null;

        babel17Parser.statement_return statement137 = null;

        babel17Parser.sep_return sep138 = null;

        babel17Parser.sep_return sep139 = null;


        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_sep=new RewriteRuleSubtreeStream(adaptor,"rule sep");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:446:8: ( ( sep )? statement ( sep statement )* ( sep )? -> ^( BLOCK ( statement )* ) | ( sep )? -> ^( BLOCK ) )
            int alt69=2;
            alt69 = dfa69.predict(input);
            switch (alt69) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:446:10: ( sep )? statement ( sep statement )* ( sep )?
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:446:10: ( sep )?
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==SC||LA65_0==NL) ) {
                        alt65=1;
                    }
                    switch (alt65) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:446:10: sep
                            {
                            pushFollow(FOLLOW_sep_in_block2458);
                            sep134=sep();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_sep.add(sep134.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_statement_in_block2461);
                    statement135=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement135.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:446:25: ( sep statement )*
                    loop66:
                    do {
                        int alt66=2;
                        alt66 = dfa66.predict(input);
                        switch (alt66) {
                    	case 1 :
                    	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:446:26: sep statement
                    	    {
                    	    pushFollow(FOLLOW_sep_in_block2464);
                    	    sep136=sep();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_sep.add(sep136.getTree());
                    	    pushFollow(FOLLOW_statement_in_block2466);
                    	    statement137=statement();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_statement.add(statement137.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop66;
                        }
                    } while (true);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:446:42: ( sep )?
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==SC||LA67_0==NL) ) {
                        alt67=1;
                    }
                    switch (alt67) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:446:42: sep
                            {
                            pushFollow(FOLLOW_sep_in_block2470);
                            sep138=sep();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_sep.add(sep138.getTree());

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
                    // 446:47: -> ^( BLOCK ( statement )* )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:446:50: ^( BLOCK ( statement )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:446:58: ( statement )*
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:447:4: ( sep )?
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:447:4: ( sep )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==SC||LA68_0==NL) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:447:4: sep
                            {
                            pushFollow(FOLLOW_sep_in_block2486);
                            sep139=sep();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_sep.add(sep139.getTree());

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
                    // 447:9: -> ^( BLOCK )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:447:12: ^( BLOCK )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:449:1: pure_block : statement ( sep statement )* -> ^( BLOCK ( statement )* ) ;
    public final babel17Parser.pure_block_return pure_block() throws RecognitionException {
        babel17Parser.pure_block_return retval = new babel17Parser.pure_block_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.statement_return statement140 = null;

        babel17Parser.sep_return sep141 = null;

        babel17Parser.statement_return statement142 = null;


        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_sep=new RewriteRuleSubtreeStream(adaptor,"rule sep");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:450:2: ( statement ( sep statement )* -> ^( BLOCK ( statement )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:450:4: statement ( sep statement )*
            {
            pushFollow(FOLLOW_statement_in_pure_block2503);
            statement140=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statement.add(statement140.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:450:14: ( sep statement )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==NL) ) {
                    int LA70_1 = input.LA(2);

                    if ( (LA70_1==L_begin||(LA70_1>=L_obj && LA70_1<=L_if)||(LA70_1>=L_while && LA70_1<=L_for)||(LA70_1>=L_yield && LA70_1<=L_match)||(LA70_1>=L_val && LA70_1<=L_def)||LA70_1==L_exception||LA70_1==L_try||(LA70_1>=A_infinity && LA70_1<=L_nil)||(LA70_1>=L_module && LA70_1<=L_import)||LA70_1==SC||LA70_1==MINUS||LA70_1==A_NOT||LA70_1==U_NOT||(LA70_1>=A_ELLIPSIS && LA70_1<=U_ELLIPSIS)||LA70_1==L_force||(LA70_1>=NL && LA70_1<=Num)||(LA70_1>=String && LA70_1<=ROUND_BRACKET_OPEN)||LA70_1==SQUARE_BRACKET_OPEN||LA70_1==CURLY_BRACKET_OPEN||LA70_1==UNDERSCORE||(LA70_1>=PRAGMA_LOG && LA70_1<=PRAGMA_PROFILE)) ) {
                        alt70=1;
                    }


                }
                else if ( (LA70_0==SC) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:450:15: sep statement
            	    {
            	    pushFollow(FOLLOW_sep_in_pure_block2506);
            	    sep141=sep();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_sep.add(sep141.getTree());
            	    pushFollow(FOLLOW_statement_in_pure_block2508);
            	    statement142=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement142.getTree());

            	    }
            	    break;

            	default :
            	    break loop70;
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
            // 450:31: -> ^( BLOCK ( statement )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:450:34: ^( BLOCK ( statement )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:450:42: ( statement )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:452:1: statement : ( st_typedef | st_val | st_def | st_yield | st_memoize | st_private | st_module | st_import | expr_or_assign | PRAGMA_PRINT expr -> ^( PRAGMA_PRINT expr ) | PRAGMA_LOG expr -> ^( PRAGMA_LOG expr ) | PRAGMA_PROFILE expr -> ^( PRAGMA_PROFILE expr ) | PRAGMA_ASSERT expr -> ^( PRAGMA_ASSERT expr ) );
    public final babel17Parser.statement_return statement() throws RecognitionException {
        babel17Parser.statement_return retval = new babel17Parser.statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PRAGMA_PRINT152=null;
        Token PRAGMA_LOG154=null;
        Token PRAGMA_PROFILE156=null;
        Token PRAGMA_ASSERT158=null;
        babel17Parser.st_typedef_return st_typedef143 = null;

        babel17Parser.st_val_return st_val144 = null;

        babel17Parser.st_def_return st_def145 = null;

        babel17Parser.st_yield_return st_yield146 = null;

        babel17Parser.st_memoize_return st_memoize147 = null;

        babel17Parser.st_private_return st_private148 = null;

        babel17Parser.st_module_return st_module149 = null;

        babel17Parser.st_import_return st_import150 = null;

        babel17Parser.expr_or_assign_return expr_or_assign151 = null;

        babel17Parser.expr_return expr153 = null;

        babel17Parser.expr_return expr155 = null;

        babel17Parser.expr_return expr157 = null;

        babel17Parser.expr_return expr159 = null;


        CommonTree PRAGMA_PRINT152_tree=null;
        CommonTree PRAGMA_LOG154_tree=null;
        CommonTree PRAGMA_PROFILE156_tree=null;
        CommonTree PRAGMA_ASSERT158_tree=null;
        RewriteRuleTokenStream stream_PRAGMA_PROFILE=new RewriteRuleTokenStream(adaptor,"token PRAGMA_PROFILE");
        RewriteRuleTokenStream stream_PRAGMA_ASSERT=new RewriteRuleTokenStream(adaptor,"token PRAGMA_ASSERT");
        RewriteRuleTokenStream stream_PRAGMA_LOG=new RewriteRuleTokenStream(adaptor,"token PRAGMA_LOG");
        RewriteRuleTokenStream stream_PRAGMA_PRINT=new RewriteRuleTokenStream(adaptor,"token PRAGMA_PRINT");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:453:2: ( st_typedef | st_val | st_def | st_yield | st_memoize | st_private | st_module | st_import | expr_or_assign | PRAGMA_PRINT expr -> ^( PRAGMA_PRINT expr ) | PRAGMA_LOG expr -> ^( PRAGMA_LOG expr ) | PRAGMA_PROFILE expr -> ^( PRAGMA_PROFILE expr ) | PRAGMA_ASSERT expr -> ^( PRAGMA_ASSERT expr ) )
            int alt71=13;
            alt71 = dfa71.predict(input);
            switch (alt71) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:453:4: st_typedef
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_st_typedef_in_statement2529);
                    st_typedef143=st_typedef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, st_typedef143.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:454:10: st_val
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_st_val_in_statement2540);
                    st_val144=st_val();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, st_val144.getTree());

                    }
                    break;
                case 3 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:455:4: st_def
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_st_def_in_statement2545);
                    st_def145=st_def();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, st_def145.getTree());

                    }
                    break;
                case 4 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:456:4: st_yield
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_st_yield_in_statement2550);
                    st_yield146=st_yield();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, st_yield146.getTree());

                    }
                    break;
                case 5 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:457:4: st_memoize
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_st_memoize_in_statement2555);
                    st_memoize147=st_memoize();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, st_memoize147.getTree());

                    }
                    break;
                case 6 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:458:4: st_private
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_st_private_in_statement2560);
                    st_private148=st_private();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, st_private148.getTree());

                    }
                    break;
                case 7 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:459:4: st_module
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_st_module_in_statement2565);
                    st_module149=st_module();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, st_module149.getTree());

                    }
                    break;
                case 8 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:460:4: st_import
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_st_import_in_statement2570);
                    st_import150=st_import();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, st_import150.getTree());

                    }
                    break;
                case 9 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:461:4: expr_or_assign
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_expr_or_assign_in_statement2575);
                    expr_or_assign151=expr_or_assign();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_or_assign151.getTree());

                    }
                    break;
                case 10 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:462:5: PRAGMA_PRINT expr
                    {
                    PRAGMA_PRINT152=(Token)match(input,PRAGMA_PRINT,FOLLOW_PRAGMA_PRINT_in_statement2581); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PRAGMA_PRINT.add(PRAGMA_PRINT152);

                    pushFollow(FOLLOW_expr_in_statement2583);
                    expr153=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr153.getTree());


                    // AST REWRITE
                    // elements: expr, PRAGMA_PRINT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 462:23: -> ^( PRAGMA_PRINT expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:462:26: ^( PRAGMA_PRINT expr )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:463:5: PRAGMA_LOG expr
                    {
                    PRAGMA_LOG154=(Token)match(input,PRAGMA_LOG,FOLLOW_PRAGMA_LOG_in_statement2597); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PRAGMA_LOG.add(PRAGMA_LOG154);

                    pushFollow(FOLLOW_expr_in_statement2599);
                    expr155=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr155.getTree());


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
                    // 463:21: -> ^( PRAGMA_LOG expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:463:24: ^( PRAGMA_LOG expr )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:464:5: PRAGMA_PROFILE expr
                    {
                    PRAGMA_PROFILE156=(Token)match(input,PRAGMA_PROFILE,FOLLOW_PRAGMA_PROFILE_in_statement2613); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PRAGMA_PROFILE.add(PRAGMA_PROFILE156);

                    pushFollow(FOLLOW_expr_in_statement2615);
                    expr157=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr157.getTree());


                    // AST REWRITE
                    // elements: PRAGMA_PROFILE, expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 464:25: -> ^( PRAGMA_PROFILE expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:464:28: ^( PRAGMA_PROFILE expr )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:465:5: PRAGMA_ASSERT expr
                    {
                    PRAGMA_ASSERT158=(Token)match(input,PRAGMA_ASSERT,FOLLOW_PRAGMA_ASSERT_in_statement2629); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PRAGMA_ASSERT.add(PRAGMA_ASSERT158);

                    pushFollow(FOLLOW_expr_in_statement2631);
                    expr159=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr159.getTree());


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
                    // 465:24: -> ^( PRAGMA_ASSERT expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:465:27: ^( PRAGMA_ASSERT expr )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:467:1: objelem_assign : Id PERIOD Id -> ^( OBJELEM_ASSIGN Id Id ) ;
    public final babel17Parser.objelem_assign_return objelem_assign() throws RecognitionException {
        babel17Parser.objelem_assign_return retval = new babel17Parser.objelem_assign_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Id160=null;
        Token PERIOD161=null;
        Token Id162=null;

        CommonTree Id160_tree=null;
        CommonTree PERIOD161_tree=null;
        CommonTree Id162_tree=null;
        RewriteRuleTokenStream stream_Id=new RewriteRuleTokenStream(adaptor,"token Id");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:468:2: ( Id PERIOD Id -> ^( OBJELEM_ASSIGN Id Id ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:468:4: Id PERIOD Id
            {
            Id160=(Token)match(input,Id,FOLLOW_Id_in_objelem_assign2649); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Id.add(Id160);

            PERIOD161=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_objelem_assign2651); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD161);

            Id162=(Token)match(input,Id,FOLLOW_Id_in_objelem_assign2653); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Id.add(Id162);



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
            // 468:17: -> ^( OBJELEM_ASSIGN Id Id )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:468:20: ^( OBJELEM_ASSIGN Id Id )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:470:1: st_val : L_val ( NL )? ( pattern | objelem_assign ) ( NL )? '=' ( NL )? expr -> ^( VAL ( pattern )* ( objelem_assign )* expr ) ;
    public final babel17Parser.st_val_return st_val() throws RecognitionException {
        babel17Parser.st_val_return retval = new babel17Parser.st_val_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_val163=null;
        Token NL164=null;
        Token NL167=null;
        Token char_literal168=null;
        Token NL169=null;
        babel17Parser.pattern_return pattern165 = null;

        babel17Parser.objelem_assign_return objelem_assign166 = null;

        babel17Parser.expr_return expr170 = null;


        CommonTree L_val163_tree=null;
        CommonTree NL164_tree=null;
        CommonTree NL167_tree=null;
        CommonTree char_literal168_tree=null;
        CommonTree NL169_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_val=new RewriteRuleTokenStream(adaptor,"token L_val");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_objelem_assign=new RewriteRuleSubtreeStream(adaptor,"rule objelem_assign");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:470:8: ( L_val ( NL )? ( pattern | objelem_assign ) ( NL )? '=' ( NL )? expr -> ^( VAL ( pattern )* ( objelem_assign )* expr ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:470:10: L_val ( NL )? ( pattern | objelem_assign ) ( NL )? '=' ( NL )? expr
            {
            L_val163=(Token)match(input,L_val,FOLLOW_L_val_in_st_val2672); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_val.add(L_val163);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:470:16: ( NL )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==NL) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:470:16: NL
                    {
                    NL164=(Token)match(input,NL,FOLLOW_NL_in_st_val2674); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL164);


                    }
                    break;

            }

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:470:20: ( pattern | objelem_assign )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==L_exception||(LA73_0>=A_infinity && LA73_0<=U_infinity)||(LA73_0>=L_true && LA73_0<=L_false)||LA73_0==L_nil||LA73_0==MINUS||(LA73_0>=A_ELLIPSIS && LA73_0<=U_ELLIPSIS)||LA73_0==Constr||LA73_0==Num||(LA73_0>=String && LA73_0<=ROUND_BRACKET_OPEN)||LA73_0==SQUARE_BRACKET_OPEN||LA73_0==CURLY_BRACKET_OPEN||LA73_0==UNDERSCORE) ) {
                alt73=1;
            }
            else if ( (LA73_0==Id) ) {
                int LA73_2 = input.LA(2);

                if ( (LA73_2==PERIOD) ) {
                    alt73=2;
                }
                else if ( (LA73_2==ASSIGN||(LA73_2>=A_DOUBLE_COLON && LA73_2<=U_DOUBLE_COLON)||LA73_2==NL) ) {
                    alt73=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 73, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:470:21: pattern
                    {
                    pushFollow(FOLLOW_pattern_in_st_val2678);
                    pattern165=pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pattern.add(pattern165.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:470:31: objelem_assign
                    {
                    pushFollow(FOLLOW_objelem_assign_in_st_val2682);
                    objelem_assign166=objelem_assign();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_objelem_assign.add(objelem_assign166.getTree());

                    }
                    break;

            }

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:470:47: ( NL )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==NL) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:470:47: NL
                    {
                    NL167=(Token)match(input,NL,FOLLOW_NL_in_st_val2685); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL167);


                    }
                    break;

            }

            char_literal168=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_st_val2688); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal168);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:470:55: ( NL )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==NL) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:470:55: NL
                    {
                    NL169=(Token)match(input,NL,FOLLOW_NL_in_st_val2690); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL169);


                    }
                    break;

            }

            pushFollow(FOLLOW_expr_in_st_val2693);
            expr170=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr170.getTree());


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
            // 470:64: -> ^( VAL ( pattern )* ( objelem_assign )* expr )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:470:67: ^( VAL ( pattern )* ( objelem_assign )* expr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VAL, "VAL"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:470:73: ( pattern )*
                while ( stream_pattern.hasNext() ) {
                    adaptor.addChild(root_1, stream_pattern.nextTree());

                }
                stream_pattern.reset();
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:470:82: ( objelem_assign )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:472:1: st_def : ( L_def ( NL )? Id ( NL )? ( defpattern ( NL )? )? ( ':' ( NL )? typeid ( NL )? )? '=' ( NL )? expr -> ^( DEF Id ( typeid )? ( defpattern )? expr ) | L_def ( NL )? L_this ( NL )? ':' ( NL )? typeid ( NL )? '=' ( NL )? expr -> ^( CONVERSION typeid expr ) );
    public final babel17Parser.st_def_return st_def() throws RecognitionException {
        babel17Parser.st_def_return retval = new babel17Parser.st_def_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_def171=null;
        Token NL172=null;
        Token Id173=null;
        Token NL174=null;
        Token NL176=null;
        Token char_literal177=null;
        Token NL178=null;
        Token NL180=null;
        Token char_literal181=null;
        Token NL182=null;
        Token L_def184=null;
        Token NL185=null;
        Token L_this186=null;
        Token NL187=null;
        Token char_literal188=null;
        Token NL189=null;
        Token NL191=null;
        Token char_literal192=null;
        Token NL193=null;
        babel17Parser.defpattern_return defpattern175 = null;

        babel17Parser.typeid_return typeid179 = null;

        babel17Parser.expr_return expr183 = null;

        babel17Parser.typeid_return typeid190 = null;

        babel17Parser.expr_return expr194 = null;


        CommonTree L_def171_tree=null;
        CommonTree NL172_tree=null;
        CommonTree Id173_tree=null;
        CommonTree NL174_tree=null;
        CommonTree NL176_tree=null;
        CommonTree char_literal177_tree=null;
        CommonTree NL178_tree=null;
        CommonTree NL180_tree=null;
        CommonTree char_literal181_tree=null;
        CommonTree NL182_tree=null;
        CommonTree L_def184_tree=null;
        CommonTree NL185_tree=null;
        CommonTree L_this186_tree=null;
        CommonTree NL187_tree=null;
        CommonTree char_literal188_tree=null;
        CommonTree NL189_tree=null;
        CommonTree NL191_tree=null;
        CommonTree char_literal192_tree=null;
        CommonTree NL193_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_L_this=new RewriteRuleTokenStream(adaptor,"token L_this");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_Id=new RewriteRuleTokenStream(adaptor,"token Id");
        RewriteRuleTokenStream stream_L_def=new RewriteRuleTokenStream(adaptor,"token L_def");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_typeid=new RewriteRuleSubtreeStream(adaptor,"rule typeid");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_defpattern=new RewriteRuleSubtreeStream(adaptor,"rule defpattern");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:472:8: ( L_def ( NL )? Id ( NL )? ( defpattern ( NL )? )? ( ':' ( NL )? typeid ( NL )? )? '=' ( NL )? expr -> ^( DEF Id ( typeid )? ( defpattern )? expr ) | L_def ( NL )? L_this ( NL )? ':' ( NL )? typeid ( NL )? '=' ( NL )? expr -> ^( CONVERSION typeid expr ) )
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==L_def) ) {
                switch ( input.LA(2) ) {
                case NL:
                    {
                    int LA89_2 = input.LA(3);

                    if ( (LA89_2==L_this) ) {
                        alt89=2;
                    }
                    else if ( (LA89_2==Id) ) {
                        alt89=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 89, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case L_this:
                    {
                    alt89=2;
                    }
                    break;
                case Id:
                    {
                    alt89=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 89, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }
            switch (alt89) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:472:10: L_def ( NL )? Id ( NL )? ( defpattern ( NL )? )? ( ':' ( NL )? typeid ( NL )? )? '=' ( NL )? expr
                    {
                    L_def171=(Token)match(input,L_def,FOLLOW_L_def_in_st_def2717); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_def.add(L_def171);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:472:16: ( NL )?
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==NL) ) {
                        alt76=1;
                    }
                    switch (alt76) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:472:16: NL
                            {
                            NL172=(Token)match(input,NL,FOLLOW_NL_in_st_def2719); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL172);


                            }
                            break;

                    }

                    Id173=(Token)match(input,Id,FOLLOW_Id_in_st_def2722); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Id.add(Id173);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:472:23: ( NL )?
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==NL) ) {
                        alt77=1;
                    }
                    switch (alt77) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:472:23: NL
                            {
                            NL174=(Token)match(input,NL,FOLLOW_NL_in_st_def2724); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL174);


                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:472:27: ( defpattern ( NL )? )?
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( ((LA79_0>=A_infinity && LA79_0<=U_infinity)||(LA79_0>=L_true && LA79_0<=L_false)||LA79_0==L_nil||LA79_0==MINUS||(LA79_0>=Constr && LA79_0<=Num)||(LA79_0>=String && LA79_0<=ROUND_BRACKET_OPEN)||LA79_0==SQUARE_BRACKET_OPEN||LA79_0==CURLY_BRACKET_OPEN||LA79_0==UNDERSCORE) ) {
                        alt79=1;
                    }
                    switch (alt79) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:472:28: defpattern ( NL )?
                            {
                            pushFollow(FOLLOW_defpattern_in_st_def2728);
                            defpattern175=defpattern();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_defpattern.add(defpattern175.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:472:39: ( NL )?
                            int alt78=2;
                            int LA78_0 = input.LA(1);

                            if ( (LA78_0==NL) ) {
                                alt78=1;
                            }
                            switch (alt78) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:472:39: NL
                                    {
                                    NL176=(Token)match(input,NL,FOLLOW_NL_in_st_def2730); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL176);


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:472:45: ( ':' ( NL )? typeid ( NL )? )?
                    int alt82=2;
                    int LA82_0 = input.LA(1);

                    if ( (LA82_0==COLON) ) {
                        alt82=1;
                    }
                    switch (alt82) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:472:46: ':' ( NL )? typeid ( NL )?
                            {
                            char_literal177=(Token)match(input,COLON,FOLLOW_COLON_in_st_def2736); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COLON.add(char_literal177);

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:472:50: ( NL )?
                            int alt80=2;
                            int LA80_0 = input.LA(1);

                            if ( (LA80_0==NL) ) {
                                alt80=1;
                            }
                            switch (alt80) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:472:50: NL
                                    {
                                    NL178=(Token)match(input,NL,FOLLOW_NL_in_st_def2738); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL178);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_typeid_in_st_def2741);
                            typeid179=typeid();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeid.add(typeid179.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:472:61: ( NL )?
                            int alt81=2;
                            int LA81_0 = input.LA(1);

                            if ( (LA81_0==NL) ) {
                                alt81=1;
                            }
                            switch (alt81) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:472:61: NL
                                    {
                                    NL180=(Token)match(input,NL,FOLLOW_NL_in_st_def2743); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL180);


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    char_literal181=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_st_def2748); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal181);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:472:71: ( NL )?
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==NL) ) {
                        alt83=1;
                    }
                    switch (alt83) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:472:71: NL
                            {
                            NL182=(Token)match(input,NL,FOLLOW_NL_in_st_def2750); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL182);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_expr_in_st_def2753);
                    expr183=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr183.getTree());


                    // AST REWRITE
                    // elements: expr, typeid, defpattern, Id
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 473:5: -> ^( DEF Id ( typeid )? ( defpattern )? expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:473:8: ^( DEF Id ( typeid )? ( defpattern )? expr )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DEF, "DEF"), root_1);

                        adaptor.addChild(root_1, stream_Id.nextNode());
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:473:17: ( typeid )?
                        if ( stream_typeid.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeid.nextTree());

                        }
                        stream_typeid.reset();
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:473:25: ( defpattern )?
                        if ( stream_defpattern.hasNext() ) {
                            adaptor.addChild(root_1, stream_defpattern.nextTree());

                        }
                        stream_defpattern.reset();
                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:474:4: L_def ( NL )? L_this ( NL )? ':' ( NL )? typeid ( NL )? '=' ( NL )? expr
                    {
                    L_def184=(Token)match(input,L_def,FOLLOW_L_def_in_st_def2779); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_def.add(L_def184);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:474:10: ( NL )?
                    int alt84=2;
                    int LA84_0 = input.LA(1);

                    if ( (LA84_0==NL) ) {
                        alt84=1;
                    }
                    switch (alt84) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:474:10: NL
                            {
                            NL185=(Token)match(input,NL,FOLLOW_NL_in_st_def2781); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL185);


                            }
                            break;

                    }

                    L_this186=(Token)match(input,L_this,FOLLOW_L_this_in_st_def2784); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_this.add(L_this186);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:474:21: ( NL )?
                    int alt85=2;
                    int LA85_0 = input.LA(1);

                    if ( (LA85_0==NL) ) {
                        alt85=1;
                    }
                    switch (alt85) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:474:21: NL
                            {
                            NL187=(Token)match(input,NL,FOLLOW_NL_in_st_def2786); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL187);


                            }
                            break;

                    }

                    char_literal188=(Token)match(input,COLON,FOLLOW_COLON_in_st_def2789); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(char_literal188);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:474:29: ( NL )?
                    int alt86=2;
                    int LA86_0 = input.LA(1);

                    if ( (LA86_0==NL) ) {
                        alt86=1;
                    }
                    switch (alt86) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:474:29: NL
                            {
                            NL189=(Token)match(input,NL,FOLLOW_NL_in_st_def2791); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL189);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_typeid_in_st_def2794);
                    typeid190=typeid();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeid.add(typeid190.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:474:40: ( NL )?
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==NL) ) {
                        alt87=1;
                    }
                    switch (alt87) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:474:40: NL
                            {
                            NL191=(Token)match(input,NL,FOLLOW_NL_in_st_def2796); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL191);


                            }
                            break;

                    }

                    char_literal192=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_st_def2799); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal192);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:474:48: ( NL )?
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==NL) ) {
                        alt88=1;
                    }
                    switch (alt88) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:474:48: NL
                            {
                            NL193=(Token)match(input,NL,FOLLOW_NL_in_st_def2801); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL193);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_expr_in_st_def2804);
                    expr194=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr194.getTree());


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
                    // 474:57: -> ^( CONVERSION typeid expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:474:60: ^( CONVERSION typeid expr )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:476:1: st_typedef : L_typedef ( NL )? Id ( NL )? typedef_clause ( ( NL )? COMMA ( NL )? typedef_clause )* -> ^( TYPEDEF Id ^( NIL_TOKEN ( typedef_clause )* ) ) ;
    public final babel17Parser.st_typedef_return st_typedef() throws RecognitionException {
        babel17Parser.st_typedef_return retval = new babel17Parser.st_typedef_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_typedef195=null;
        Token NL196=null;
        Token Id197=null;
        Token NL198=null;
        Token NL200=null;
        Token COMMA201=null;
        Token NL202=null;
        babel17Parser.typedef_clause_return typedef_clause199 = null;

        babel17Parser.typedef_clause_return typedef_clause203 = null;


        CommonTree L_typedef195_tree=null;
        CommonTree NL196_tree=null;
        CommonTree Id197_tree=null;
        CommonTree NL198_tree=null;
        CommonTree NL200_tree=null;
        CommonTree COMMA201_tree=null;
        CommonTree NL202_tree=null;
        RewriteRuleTokenStream stream_L_typedef=new RewriteRuleTokenStream(adaptor,"token L_typedef");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_Id=new RewriteRuleTokenStream(adaptor,"token Id");
        RewriteRuleSubtreeStream stream_typedef_clause=new RewriteRuleSubtreeStream(adaptor,"rule typedef_clause");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:477:2: ( L_typedef ( NL )? Id ( NL )? typedef_clause ( ( NL )? COMMA ( NL )? typedef_clause )* -> ^( TYPEDEF Id ^( NIL_TOKEN ( typedef_clause )* ) ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:477:4: L_typedef ( NL )? Id ( NL )? typedef_clause ( ( NL )? COMMA ( NL )? typedef_clause )*
            {
            L_typedef195=(Token)match(input,L_typedef,FOLLOW_L_typedef_in_st_typedef2827); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_typedef.add(L_typedef195);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:477:14: ( NL )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==NL) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:477:14: NL
                    {
                    NL196=(Token)match(input,NL,FOLLOW_NL_in_st_typedef2829); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL196);


                    }
                    break;

            }

            Id197=(Token)match(input,Id,FOLLOW_Id_in_st_typedef2832); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Id.add(Id197);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:477:21: ( NL )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==NL) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:477:21: NL
                    {
                    NL198=(Token)match(input,NL,FOLLOW_NL_in_st_typedef2834); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL198);


                    }
                    break;

            }

            pushFollow(FOLLOW_typedef_clause_in_st_typedef2837);
            typedef_clause199=typedef_clause();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typedef_clause.add(typedef_clause199.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:477:40: ( ( NL )? COMMA ( NL )? typedef_clause )*
            loop94:
            do {
                int alt94=2;
                int LA94_0 = input.LA(1);

                if ( (LA94_0==NL) ) {
                    int LA94_1 = input.LA(2);

                    if ( (LA94_1==COMMA) ) {
                        alt94=1;
                    }


                }
                else if ( (LA94_0==COMMA) ) {
                    alt94=1;
                }


                switch (alt94) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:477:41: ( NL )? COMMA ( NL )? typedef_clause
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:477:41: ( NL )?
            	    int alt92=2;
            	    int LA92_0 = input.LA(1);

            	    if ( (LA92_0==NL) ) {
            	        alt92=1;
            	    }
            	    switch (alt92) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:477:41: NL
            	            {
            	            NL200=(Token)match(input,NL,FOLLOW_NL_in_st_typedef2840); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL200);


            	            }
            	            break;

            	    }

            	    COMMA201=(Token)match(input,COMMA,FOLLOW_COMMA_in_st_typedef2843); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA201);

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:477:51: ( NL )?
            	    int alt93=2;
            	    int LA93_0 = input.LA(1);

            	    if ( (LA93_0==NL) ) {
            	        alt93=1;
            	    }
            	    switch (alt93) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:477:51: NL
            	            {
            	            NL202=(Token)match(input,NL,FOLLOW_NL_in_st_typedef2845); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL202);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_typedef_clause_in_st_typedef2848);
            	    typedef_clause203=typedef_clause();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_typedef_clause.add(typedef_clause203.getTree());

            	    }
            	    break;

            	default :
            	    break loop94;
                }
            } while (true);



            // AST REWRITE
            // elements: Id, typedef_clause
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 477:72: -> ^( TYPEDEF Id ^( NIL_TOKEN ( typedef_clause )* ) )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:477:75: ^( TYPEDEF Id ^( NIL_TOKEN ( typedef_clause )* ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TYPEDEF, "TYPEDEF"), root_1);

                adaptor.addChild(root_1, stream_Id.nextNode());
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:477:88: ^( NIL_TOKEN ( typedef_clause )* )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_2);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:477:100: ( typedef_clause )*
                while ( stream_typedef_clause.hasNext() ) {
                    adaptor.addChild(root_2, stream_typedef_clause.nextTree());

                }
                stream_typedef_clause.reset();

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
    // $ANTLR end "st_typedef"

    public static class typedef_clause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typedef_clause"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:479:1: typedef_clause : ( ( defpattern ( NL )? '=' )=> defpattern ( NL )? '=' ( NL )? expr -> ^( TYPEDEF_CLAUSE defpattern expr ) | defpattern -> ^( TYPEDEF_CLAUSE defpattern ) );
    public final babel17Parser.typedef_clause_return typedef_clause() throws RecognitionException {
        babel17Parser.typedef_clause_return retval = new babel17Parser.typedef_clause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL205=null;
        Token char_literal206=null;
        Token NL207=null;
        babel17Parser.defpattern_return defpattern204 = null;

        babel17Parser.expr_return expr208 = null;

        babel17Parser.defpattern_return defpattern209 = null;


        CommonTree NL205_tree=null;
        CommonTree char_literal206_tree=null;
        CommonTree NL207_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_defpattern=new RewriteRuleSubtreeStream(adaptor,"rule defpattern");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:480:2: ( ( defpattern ( NL )? '=' )=> defpattern ( NL )? '=' ( NL )? expr -> ^( TYPEDEF_CLAUSE defpattern expr ) | defpattern -> ^( TYPEDEF_CLAUSE defpattern ) )
            int alt97=2;
            alt97 = dfa97.predict(input);
            switch (alt97) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:480:4: ( defpattern ( NL )? '=' )=> defpattern ( NL )? '=' ( NL )? expr
                    {
                    pushFollow(FOLLOW_defpattern_in_typedef_clause2886);
                    defpattern204=defpattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_defpattern.add(defpattern204.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:480:39: ( NL )?
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( (LA95_0==NL) ) {
                        alt95=1;
                    }
                    switch (alt95) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:480:39: NL
                            {
                            NL205=(Token)match(input,NL,FOLLOW_NL_in_typedef_clause2888); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL205);


                            }
                            break;

                    }

                    char_literal206=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_typedef_clause2891); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal206);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:480:47: ( NL )?
                    int alt96=2;
                    int LA96_0 = input.LA(1);

                    if ( (LA96_0==NL) ) {
                        alt96=1;
                    }
                    switch (alt96) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:480:47: NL
                            {
                            NL207=(Token)match(input,NL,FOLLOW_NL_in_typedef_clause2893); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL207);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_expr_in_typedef_clause2896);
                    expr208=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr208.getTree());


                    // AST REWRITE
                    // elements: defpattern, expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 480:56: -> ^( TYPEDEF_CLAUSE defpattern expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:480:59: ^( TYPEDEF_CLAUSE defpattern expr )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TYPEDEF_CLAUSE, "TYPEDEF_CLAUSE"), root_1);

                        adaptor.addChild(root_1, stream_defpattern.nextTree());
                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:481:4: defpattern
                    {
                    pushFollow(FOLLOW_defpattern_in_typedef_clause2911);
                    defpattern209=defpattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_defpattern.add(defpattern209.getTree());


                    // AST REWRITE
                    // elements: defpattern
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 481:15: -> ^( TYPEDEF_CLAUSE defpattern )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:481:18: ^( TYPEDEF_CLAUSE defpattern )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TYPEDEF_CLAUSE, "TYPEDEF_CLAUSE"), root_1);

                        adaptor.addChild(root_1, stream_defpattern.nextTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:483:1: st_yield : L_yield expr -> ^( YIELD expr ) ;
    public final babel17Parser.st_yield_return st_yield() throws RecognitionException {
        babel17Parser.st_yield_return retval = new babel17Parser.st_yield_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_yield210=null;
        babel17Parser.expr_return expr211 = null;


        CommonTree L_yield210_tree=null;
        RewriteRuleTokenStream stream_L_yield=new RewriteRuleTokenStream(adaptor,"token L_yield");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:483:9: ( L_yield expr -> ^( YIELD expr ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:483:11: L_yield expr
            {
            L_yield210=(Token)match(input,L_yield,FOLLOW_L_yield_in_st_yield2930); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_yield.add(L_yield210);

            pushFollow(FOLLOW_expr_in_st_yield2932);
            expr211=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr211.getTree());


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
            // 483:24: -> ^( YIELD expr )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:483:27: ^( YIELD expr )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:485:1: st_memoize : L_memoize memo_id ( ( NL )? COMMA ( NL )? memo_id )* -> ^( MEMOIZE ( memo_id )* ) ;
    public final babel17Parser.st_memoize_return st_memoize() throws RecognitionException {
        babel17Parser.st_memoize_return retval = new babel17Parser.st_memoize_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_memoize212=null;
        Token NL214=null;
        Token COMMA215=null;
        Token NL216=null;
        babel17Parser.memo_id_return memo_id213 = null;

        babel17Parser.memo_id_return memo_id217 = null;


        CommonTree L_memoize212_tree=null;
        CommonTree NL214_tree=null;
        CommonTree COMMA215_tree=null;
        CommonTree NL216_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_memoize=new RewriteRuleTokenStream(adaptor,"token L_memoize");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_memo_id=new RewriteRuleSubtreeStream(adaptor,"rule memo_id");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:486:2: ( L_memoize memo_id ( ( NL )? COMMA ( NL )? memo_id )* -> ^( MEMOIZE ( memo_id )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:486:4: L_memoize memo_id ( ( NL )? COMMA ( NL )? memo_id )*
            {
            L_memoize212=(Token)match(input,L_memoize,FOLLOW_L_memoize_in_st_memoize2953); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_memoize.add(L_memoize212);

            pushFollow(FOLLOW_memo_id_in_st_memoize2955);
            memo_id213=memo_id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_memo_id.add(memo_id213.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:486:22: ( ( NL )? COMMA ( NL )? memo_id )*
            loop100:
            do {
                int alt100=2;
                int LA100_0 = input.LA(1);

                if ( (LA100_0==NL) ) {
                    int LA100_1 = input.LA(2);

                    if ( (LA100_1==COMMA) ) {
                        alt100=1;
                    }


                }
                else if ( (LA100_0==COMMA) ) {
                    alt100=1;
                }


                switch (alt100) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:486:23: ( NL )? COMMA ( NL )? memo_id
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:486:23: ( NL )?
            	    int alt98=2;
            	    int LA98_0 = input.LA(1);

            	    if ( (LA98_0==NL) ) {
            	        alt98=1;
            	    }
            	    switch (alt98) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:486:23: NL
            	            {
            	            NL214=(Token)match(input,NL,FOLLOW_NL_in_st_memoize2958); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL214);


            	            }
            	            break;

            	    }

            	    COMMA215=(Token)match(input,COMMA,FOLLOW_COMMA_in_st_memoize2961); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA215);

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:486:33: ( NL )?
            	    int alt99=2;
            	    int LA99_0 = input.LA(1);

            	    if ( (LA99_0==NL) ) {
            	        alt99=1;
            	    }
            	    switch (alt99) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:486:33: NL
            	            {
            	            NL216=(Token)match(input,NL,FOLLOW_NL_in_st_memoize2963); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL216);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_memo_id_in_st_memoize2966);
            	    memo_id217=memo_id();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_memo_id.add(memo_id217.getTree());

            	    }
            	    break;

            	default :
            	    break loop100;
                }
            } while (true);



            // AST REWRITE
            // elements: memo_id
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 487:5: -> ^( MEMOIZE ( memo_id )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:487:8: ^( MEMOIZE ( memo_id )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MEMOIZE, "MEMOIZE"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:487:18: ( memo_id )*
                while ( stream_memo_id.hasNext() ) {
                    adaptor.addChild(root_1, stream_memo_id.nextTree());

                }
                stream_memo_id.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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

    public static class memo_id_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "memo_id"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:489:1: memo_id : ( Id -> ^( MEMOID_STRONG Id ) | '(' Id ')' -> ^( MEMOID_WEAK Id ) );
    public final babel17Parser.memo_id_return memo_id() throws RecognitionException {
        babel17Parser.memo_id_return retval = new babel17Parser.memo_id_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Id218=null;
        Token char_literal219=null;
        Token Id220=null;
        Token char_literal221=null;

        CommonTree Id218_tree=null;
        CommonTree char_literal219_tree=null;
        CommonTree Id220_tree=null;
        CommonTree char_literal221_tree=null;
        RewriteRuleTokenStream stream_ROUND_BRACKET_OPEN=new RewriteRuleTokenStream(adaptor,"token ROUND_BRACKET_OPEN");
        RewriteRuleTokenStream stream_ROUND_BRACKET_CLOSE=new RewriteRuleTokenStream(adaptor,"token ROUND_BRACKET_CLOSE");
        RewriteRuleTokenStream stream_Id=new RewriteRuleTokenStream(adaptor,"token Id");

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:489:9: ( Id -> ^( MEMOID_STRONG Id ) | '(' Id ')' -> ^( MEMOID_WEAK Id ) )
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==Id) ) {
                alt101=1;
            }
            else if ( (LA101_0==ROUND_BRACKET_OPEN) ) {
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:489:11: Id
                    {
                    Id218=(Token)match(input,Id,FOLLOW_Id_in_memo_id2995); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Id.add(Id218);



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
                    // 489:14: -> ^( MEMOID_STRONG Id )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:489:17: ^( MEMOID_STRONG Id )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MEMOID_STRONG, "MEMOID_STRONG"), root_1);

                        adaptor.addChild(root_1, stream_Id.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:490:4: '(' Id ')'
                    {
                    char_literal219=(Token)match(input,ROUND_BRACKET_OPEN,FOLLOW_ROUND_BRACKET_OPEN_in_memo_id3008); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ROUND_BRACKET_OPEN.add(char_literal219);

                    Id220=(Token)match(input,Id,FOLLOW_Id_in_memo_id3010); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Id.add(Id220);

                    char_literal221=(Token)match(input,ROUND_BRACKET_CLOSE,FOLLOW_ROUND_BRACKET_CLOSE_in_memo_id3012); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ROUND_BRACKET_CLOSE.add(char_literal221);



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
                    // 490:15: -> ^( MEMOID_WEAK Id )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:490:18: ^( MEMOID_WEAK Id )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MEMOID_WEAK, "MEMOID_WEAK"), root_1);

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
    // $ANTLR end "memo_id"

    public static class st_private_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "st_private"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:492:1: st_private : L_private private_id ( ( NL )? COMMA ( NL )? private_id )* -> ^( PRIVATE ( private_id )* ) ;
    public final babel17Parser.st_private_return st_private() throws RecognitionException {
        babel17Parser.st_private_return retval = new babel17Parser.st_private_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_private222=null;
        Token NL224=null;
        Token COMMA225=null;
        Token NL226=null;
        babel17Parser.private_id_return private_id223 = null;

        babel17Parser.private_id_return private_id227 = null;


        CommonTree L_private222_tree=null;
        CommonTree NL224_tree=null;
        CommonTree COMMA225_tree=null;
        CommonTree NL226_tree=null;
        RewriteRuleTokenStream stream_L_private=new RewriteRuleTokenStream(adaptor,"token L_private");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_private_id=new RewriteRuleSubtreeStream(adaptor,"rule private_id");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:493:2: ( L_private private_id ( ( NL )? COMMA ( NL )? private_id )* -> ^( PRIVATE ( private_id )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:493:4: L_private private_id ( ( NL )? COMMA ( NL )? private_id )*
            {
            L_private222=(Token)match(input,L_private,FOLLOW_L_private_in_st_private3029); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_private.add(L_private222);

            pushFollow(FOLLOW_private_id_in_st_private3031);
            private_id223=private_id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_private_id.add(private_id223.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:493:25: ( ( NL )? COMMA ( NL )? private_id )*
            loop104:
            do {
                int alt104=2;
                int LA104_0 = input.LA(1);

                if ( (LA104_0==NL) ) {
                    int LA104_1 = input.LA(2);

                    if ( (LA104_1==COMMA) ) {
                        alt104=1;
                    }


                }
                else if ( (LA104_0==COMMA) ) {
                    alt104=1;
                }


                switch (alt104) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:493:26: ( NL )? COMMA ( NL )? private_id
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:493:26: ( NL )?
            	    int alt102=2;
            	    int LA102_0 = input.LA(1);

            	    if ( (LA102_0==NL) ) {
            	        alt102=1;
            	    }
            	    switch (alt102) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:493:26: NL
            	            {
            	            NL224=(Token)match(input,NL,FOLLOW_NL_in_st_private3034); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL224);


            	            }
            	            break;

            	    }

            	    COMMA225=(Token)match(input,COMMA,FOLLOW_COMMA_in_st_private3037); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA225);

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:493:36: ( NL )?
            	    int alt103=2;
            	    int LA103_0 = input.LA(1);

            	    if ( (LA103_0==NL) ) {
            	        alt103=1;
            	    }
            	    switch (alt103) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:493:36: NL
            	            {
            	            NL226=(Token)match(input,NL,FOLLOW_NL_in_st_private3039); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL226);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_private_id_in_st_private3042);
            	    private_id227=private_id();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_private_id.add(private_id227.getTree());

            	    }
            	    break;

            	default :
            	    break loop104;
                }
            } while (true);



            // AST REWRITE
            // elements: private_id
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 494:5: -> ^( PRIVATE ( private_id )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:494:8: ^( PRIVATE ( private_id )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PRIVATE, "PRIVATE"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:494:18: ( private_id )*
                while ( stream_private_id.hasNext() ) {
                    adaptor.addChild(root_1, stream_private_id.nextTree());

                }
                stream_private_id.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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

    public static class private_id_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "private_id"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:496:1: private_id : ( Id -> ^( PRIVATEID_STRONG Id ) | '(' Id ')' -> ^( PRIVATEID_WEAK Id ) );
    public final babel17Parser.private_id_return private_id() throws RecognitionException {
        babel17Parser.private_id_return retval = new babel17Parser.private_id_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Id228=null;
        Token char_literal229=null;
        Token Id230=null;
        Token char_literal231=null;

        CommonTree Id228_tree=null;
        CommonTree char_literal229_tree=null;
        CommonTree Id230_tree=null;
        CommonTree char_literal231_tree=null;
        RewriteRuleTokenStream stream_ROUND_BRACKET_OPEN=new RewriteRuleTokenStream(adaptor,"token ROUND_BRACKET_OPEN");
        RewriteRuleTokenStream stream_ROUND_BRACKET_CLOSE=new RewriteRuleTokenStream(adaptor,"token ROUND_BRACKET_CLOSE");
        RewriteRuleTokenStream stream_Id=new RewriteRuleTokenStream(adaptor,"token Id");

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:497:2: ( Id -> ^( PRIVATEID_STRONG Id ) | '(' Id ')' -> ^( PRIVATEID_WEAK Id ) )
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==Id) ) {
                alt105=1;
            }
            else if ( (LA105_0==ROUND_BRACKET_OPEN) ) {
                alt105=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 105, 0, input);

                throw nvae;
            }
            switch (alt105) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:497:4: Id
                    {
                    Id228=(Token)match(input,Id,FOLLOW_Id_in_private_id3068); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Id.add(Id228);



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
                    // 497:7: -> ^( PRIVATEID_STRONG Id )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:497:10: ^( PRIVATEID_STRONG Id )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PRIVATEID_STRONG, "PRIVATEID_STRONG"), root_1);

                        adaptor.addChild(root_1, stream_Id.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:498:4: '(' Id ')'
                    {
                    char_literal229=(Token)match(input,ROUND_BRACKET_OPEN,FOLLOW_ROUND_BRACKET_OPEN_in_private_id3081); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ROUND_BRACKET_OPEN.add(char_literal229);

                    Id230=(Token)match(input,Id,FOLLOW_Id_in_private_id3083); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Id.add(Id230);

                    char_literal231=(Token)match(input,ROUND_BRACKET_CLOSE,FOLLOW_ROUND_BRACKET_CLOSE_in_private_id3085); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ROUND_BRACKET_CLOSE.add(char_literal231);



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
                    // 498:15: -> ^( PRIVATEID_WEAK Id )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:498:18: ^( PRIVATEID_WEAK Id )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PRIVATEID_WEAK, "PRIVATEID_WEAK"), root_1);

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
    // $ANTLR end "private_id"

    public static class moduleid_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "moduleid"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:502:1: moduleid : Id ( ( NL )? PERIOD ( NL )? Id )* -> ^( MODULEID ( Id )* ) ;
    public final babel17Parser.moduleid_return moduleid() throws RecognitionException {
        babel17Parser.moduleid_return retval = new babel17Parser.moduleid_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Id232=null;
        Token NL233=null;
        Token PERIOD234=null;
        Token NL235=null;
        Token Id236=null;

        CommonTree Id232_tree=null;
        CommonTree NL233_tree=null;
        CommonTree PERIOD234_tree=null;
        CommonTree NL235_tree=null;
        CommonTree Id236_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_Id=new RewriteRuleTokenStream(adaptor,"token Id");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:502:11: ( Id ( ( NL )? PERIOD ( NL )? Id )* -> ^( MODULEID ( Id )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:502:13: Id ( ( NL )? PERIOD ( NL )? Id )*
            {
            Id232=(Token)match(input,Id,FOLLOW_Id_in_moduleid3104); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Id.add(Id232);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:502:16: ( ( NL )? PERIOD ( NL )? Id )*
            loop108:
            do {
                int alt108=2;
                int LA108_0 = input.LA(1);

                if ( (LA108_0==NL) ) {
                    int LA108_1 = input.LA(2);

                    if ( (LA108_1==PERIOD) ) {
                        alt108=1;
                    }


                }
                else if ( (LA108_0==PERIOD) ) {
                    alt108=1;
                }


                switch (alt108) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:502:17: ( NL )? PERIOD ( NL )? Id
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:502:17: ( NL )?
            	    int alt106=2;
            	    int LA106_0 = input.LA(1);

            	    if ( (LA106_0==NL) ) {
            	        alt106=1;
            	    }
            	    switch (alt106) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:502:17: NL
            	            {
            	            NL233=(Token)match(input,NL,FOLLOW_NL_in_moduleid3107); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL233);


            	            }
            	            break;

            	    }

            	    PERIOD234=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_moduleid3110); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD234);

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:502:28: ( NL )?
            	    int alt107=2;
            	    int LA107_0 = input.LA(1);

            	    if ( (LA107_0==NL) ) {
            	        alt107=1;
            	    }
            	    switch (alt107) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:502:28: NL
            	            {
            	            NL235=(Token)match(input,NL,FOLLOW_NL_in_moduleid3112); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL235);


            	            }
            	            break;

            	    }

            	    Id236=(Token)match(input,Id,FOLLOW_Id_in_moduleid3115); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_Id.add(Id236);


            	    }
            	    break;

            	default :
            	    break loop108;
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
            // 502:37: -> ^( MODULEID ( Id )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:502:40: ^( MODULEID ( Id )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MODULEID, "MODULEID"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:502:51: ( Id )*
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
    // $ANTLR end "moduleid"

    public static class st_module_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "st_module"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:504:1: st_module : L_module ( NL )? moduleid block L_end -> ^( L_module moduleid block ) ;
    public final babel17Parser.st_module_return st_module() throws RecognitionException {
        babel17Parser.st_module_return retval = new babel17Parser.st_module_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_module237=null;
        Token NL238=null;
        Token L_end241=null;
        babel17Parser.moduleid_return moduleid239 = null;

        babel17Parser.block_return block240 = null;


        CommonTree L_module237_tree=null;
        CommonTree NL238_tree=null;
        CommonTree L_end241_tree=null;
        RewriteRuleTokenStream stream_L_module=new RewriteRuleTokenStream(adaptor,"token L_module");
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_moduleid=new RewriteRuleSubtreeStream(adaptor,"rule moduleid");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:505:2: ( L_module ( NL )? moduleid block L_end -> ^( L_module moduleid block ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:505:4: L_module ( NL )? moduleid block L_end
            {
            L_module237=(Token)match(input,L_module,FOLLOW_L_module_in_st_module3135); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_module.add(L_module237);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:505:13: ( NL )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==NL) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:505:13: NL
                    {
                    NL238=(Token)match(input,NL,FOLLOW_NL_in_st_module3137); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL238);


                    }
                    break;

            }

            pushFollow(FOLLOW_moduleid_in_st_module3140);
            moduleid239=moduleid();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_moduleid.add(moduleid239.getTree());
            pushFollow(FOLLOW_block_in_st_module3142);
            block240=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block240.getTree());
            L_end241=(Token)match(input,L_end,FOLLOW_L_end_in_st_module3144); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_end.add(L_end241);



            // AST REWRITE
            // elements: moduleid, L_module, block
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 505:38: -> ^( L_module moduleid block )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:505:41: ^( L_module moduleid block )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_L_module.nextNode(), root_1);

                adaptor.addChild(root_1, stream_moduleid.nextTree());
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:507:1: importid : Id ( ( NL )? PERIOD ( NL )? Id )* ( importall )? -> ^( IMPORTID ( importall )? ^( NIL_TOKEN ( Id )* ) ) ;
    public final babel17Parser.importid_return importid() throws RecognitionException {
        babel17Parser.importid_return retval = new babel17Parser.importid_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Id242=null;
        Token NL243=null;
        Token PERIOD244=null;
        Token NL245=null;
        Token Id246=null;
        babel17Parser.importall_return importall247 = null;


        CommonTree Id242_tree=null;
        CommonTree NL243_tree=null;
        CommonTree PERIOD244_tree=null;
        CommonTree NL245_tree=null;
        CommonTree Id246_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_Id=new RewriteRuleTokenStream(adaptor,"token Id");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
        RewriteRuleSubtreeStream stream_importall=new RewriteRuleSubtreeStream(adaptor,"rule importall");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:508:2: ( Id ( ( NL )? PERIOD ( NL )? Id )* ( importall )? -> ^( IMPORTID ( importall )? ^( NIL_TOKEN ( Id )* ) ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:508:4: Id ( ( NL )? PERIOD ( NL )? Id )* ( importall )?
            {
            Id242=(Token)match(input,Id,FOLLOW_Id_in_importid3164); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Id.add(Id242);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:508:7: ( ( NL )? PERIOD ( NL )? Id )*
            loop112:
            do {
                int alt112=2;
                int LA112_0 = input.LA(1);

                if ( (LA112_0==PERIOD) ) {
                    int LA112_1 = input.LA(2);

                    if ( (LA112_1==NL||LA112_1==Id) ) {
                        alt112=1;
                    }


                }
                else if ( (LA112_0==NL) ) {
                    int LA112_2 = input.LA(2);

                    if ( (LA112_2==PERIOD) ) {
                        alt112=1;
                    }


                }


                switch (alt112) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:508:8: ( NL )? PERIOD ( NL )? Id
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:508:8: ( NL )?
            	    int alt110=2;
            	    int LA110_0 = input.LA(1);

            	    if ( (LA110_0==NL) ) {
            	        alt110=1;
            	    }
            	    switch (alt110) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:508:8: NL
            	            {
            	            NL243=(Token)match(input,NL,FOLLOW_NL_in_importid3167); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL243);


            	            }
            	            break;

            	    }

            	    PERIOD244=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_importid3170); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD244);

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:508:19: ( NL )?
            	    int alt111=2;
            	    int LA111_0 = input.LA(1);

            	    if ( (LA111_0==NL) ) {
            	        alt111=1;
            	    }
            	    switch (alt111) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:508:19: NL
            	            {
            	            NL245=(Token)match(input,NL,FOLLOW_NL_in_importid3172); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL245);


            	            }
            	            break;

            	    }

            	    Id246=(Token)match(input,Id,FOLLOW_Id_in_importid3175); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_Id.add(Id246);


            	    }
            	    break;

            	default :
            	    break loop112;
                }
            } while (true);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:508:28: ( importall )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==PERIOD) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:508:28: importall
                    {
                    pushFollow(FOLLOW_importall_in_importid3179);
                    importall247=importall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_importall.add(importall247.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: Id, importall
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 508:39: -> ^( IMPORTID ( importall )? ^( NIL_TOKEN ( Id )* ) )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:508:42: ^( IMPORTID ( importall )? ^( NIL_TOKEN ( Id )* ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IMPORTID, "IMPORTID"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:508:53: ( importall )?
                if ( stream_importall.hasNext() ) {
                    adaptor.addChild(root_1, stream_importall.nextTree());

                }
                stream_importall.reset();
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:508:64: ^( NIL_TOKEN ( Id )* )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_2);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:508:76: ( Id )*
                while ( stream_Id.hasNext() ) {
                    adaptor.addChild(root_2, stream_Id.nextNode());

                }
                stream_Id.reset();

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
    // $ANTLR end "importid"

    public static class importall_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "importall"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:510:1: importall : PERIOD UNDERSCORE -> ^( UNDERSCORE ) ;
    public final babel17Parser.importall_return importall() throws RecognitionException {
        babel17Parser.importall_return retval = new babel17Parser.importall_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PERIOD248=null;
        Token UNDERSCORE249=null;

        CommonTree PERIOD248_tree=null;
        CommonTree UNDERSCORE249_tree=null;
        RewriteRuleTokenStream stream_UNDERSCORE=new RewriteRuleTokenStream(adaptor,"token UNDERSCORE");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:511:2: ( PERIOD UNDERSCORE -> ^( UNDERSCORE ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:511:4: PERIOD UNDERSCORE
            {
            PERIOD248=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_importall3206); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD248);

            UNDERSCORE249=(Token)match(input,UNDERSCORE,FOLLOW_UNDERSCORE_in_importall3208); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_UNDERSCORE.add(UNDERSCORE249);



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
            // 511:22: -> ^( UNDERSCORE )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:511:25: ^( UNDERSCORE )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:513:1: st_import : L_import ( NL )? importid -> ^( L_import importid ) ;
    public final babel17Parser.st_import_return st_import() throws RecognitionException {
        babel17Parser.st_import_return retval = new babel17Parser.st_import_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_import250=null;
        Token NL251=null;
        babel17Parser.importid_return importid252 = null;


        CommonTree L_import250_tree=null;
        CommonTree NL251_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_import=new RewriteRuleTokenStream(adaptor,"token L_import");
        RewriteRuleSubtreeStream stream_importid=new RewriteRuleSubtreeStream(adaptor,"rule importid");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:514:2: ( L_import ( NL )? importid -> ^( L_import importid ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:514:4: L_import ( NL )? importid
            {
            L_import250=(Token)match(input,L_import,FOLLOW_L_import_in_st_import3223); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_import.add(L_import250);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:514:13: ( NL )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==NL) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:514:13: NL
                    {
                    NL251=(Token)match(input,NL,FOLLOW_NL_in_st_import3225); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL251);


                    }
                    break;

            }

            pushFollow(FOLLOW_importid_in_st_import3229);
            importid252=importid();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_importid.add(importid252.getTree());


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
            // 514:27: -> ^( L_import importid )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:514:30: ^( L_import importid )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:516:1: expr_or_assign : ( ( ( pattern | objelem_assign ) ( NL )? '=' )=> ( pattern | objelem_assign ) ( NL )? '=' ( NL )? expr -> ^( ASSIGN ( pattern )* ( objelem_assign )* expr ) | expr );
    public final babel17Parser.expr_or_assign_return expr_or_assign() throws RecognitionException {
        babel17Parser.expr_or_assign_return retval = new babel17Parser.expr_or_assign_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL255=null;
        Token char_literal256=null;
        Token NL257=null;
        babel17Parser.pattern_return pattern253 = null;

        babel17Parser.objelem_assign_return objelem_assign254 = null;

        babel17Parser.expr_return expr258 = null;

        babel17Parser.expr_return expr259 = null;


        CommonTree NL255_tree=null;
        CommonTree char_literal256_tree=null;
        CommonTree NL257_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_objelem_assign=new RewriteRuleSubtreeStream(adaptor,"rule objelem_assign");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:517:2: ( ( ( pattern | objelem_assign ) ( NL )? '=' )=> ( pattern | objelem_assign ) ( NL )? '=' ( NL )? expr -> ^( ASSIGN ( pattern )* ( objelem_assign )* expr ) | expr )
            int alt118=2;
            alt118 = dfa118.predict(input);
            switch (alt118) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:517:4: ( ( pattern | objelem_assign ) ( NL )? '=' )=> ( pattern | objelem_assign ) ( NL )? '=' ( NL )? expr
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:517:44: ( pattern | objelem_assign )
                    int alt115=2;
                    int LA115_0 = input.LA(1);

                    if ( (LA115_0==L_exception||(LA115_0>=A_infinity && LA115_0<=U_infinity)||(LA115_0>=L_true && LA115_0<=L_false)||LA115_0==L_nil||LA115_0==MINUS||(LA115_0>=A_ELLIPSIS && LA115_0<=U_ELLIPSIS)||LA115_0==Constr||LA115_0==Num||(LA115_0>=String && LA115_0<=ROUND_BRACKET_OPEN)||LA115_0==SQUARE_BRACKET_OPEN||LA115_0==CURLY_BRACKET_OPEN||LA115_0==UNDERSCORE) ) {
                        alt115=1;
                    }
                    else if ( (LA115_0==Id) ) {
                        int LA115_2 = input.LA(2);

                        if ( (LA115_2==PERIOD) ) {
                            alt115=2;
                        }
                        else if ( (LA115_2==ASSIGN||(LA115_2>=A_DOUBLE_COLON && LA115_2<=U_DOUBLE_COLON)||LA115_2==NL) ) {
                            alt115=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 115, 2, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 115, 0, input);

                        throw nvae;
                    }
                    switch (alt115) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:517:45: pattern
                            {
                            pushFollow(FOLLOW_pattern_in_expr_or_assign3265);
                            pattern253=pattern();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_pattern.add(pattern253.getTree());

                            }
                            break;
                        case 2 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:517:55: objelem_assign
                            {
                            pushFollow(FOLLOW_objelem_assign_in_expr_or_assign3269);
                            objelem_assign254=objelem_assign();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_objelem_assign.add(objelem_assign254.getTree());

                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:517:71: ( NL )?
                    int alt116=2;
                    int LA116_0 = input.LA(1);

                    if ( (LA116_0==NL) ) {
                        alt116=1;
                    }
                    switch (alt116) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:517:71: NL
                            {
                            NL255=(Token)match(input,NL,FOLLOW_NL_in_expr_or_assign3272); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL255);


                            }
                            break;

                    }

                    char_literal256=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_expr_or_assign3275); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal256);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:517:79: ( NL )?
                    int alt117=2;
                    int LA117_0 = input.LA(1);

                    if ( (LA117_0==NL) ) {
                        alt117=1;
                    }
                    switch (alt117) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:517:79: NL
                            {
                            NL257=(Token)match(input,NL,FOLLOW_NL_in_expr_or_assign3277); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL257);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_expr_in_expr_or_assign3280);
                    expr258=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr258.getTree());


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
                    // 517:88: -> ^( ASSIGN ( pattern )* ( objelem_assign )* expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:517:91: ^( ASSIGN ( pattern )* ( objelem_assign )* expr )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASSIGN, "ASSIGN"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:517:100: ( pattern )*
                        while ( stream_pattern.hasNext() ) {
                            adaptor.addChild(root_1, stream_pattern.nextTree());

                        }
                        stream_pattern.reset();
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:517:109: ( objelem_assign )*
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:518:4: expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_expr_in_expr_or_assign3299);
                    expr259=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr259.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:520:1: expr : ( lop_expr | obj_expr );
    public final babel17Parser.expr_return expr() throws RecognitionException {
        babel17Parser.expr_return retval = new babel17Parser.expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.lop_expr_return lop_expr260 = null;

        babel17Parser.obj_expr_return obj_expr261 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:521:2: ( lop_expr | obj_expr )
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==L_begin||(LA119_0>=L_with && LA119_0<=L_if)||(LA119_0>=L_while && LA119_0<=L_for)||LA119_0==L_match||LA119_0==L_exception||LA119_0==L_try||(LA119_0>=A_infinity && LA119_0<=L_lazy)||(LA119_0>=L_true && LA119_0<=L_nil)||LA119_0==L_typeof||LA119_0==MINUS||LA119_0==A_NOT||LA119_0==U_NOT||(LA119_0>=A_ELLIPSIS && LA119_0<=U_ELLIPSIS)||LA119_0==L_force||(LA119_0>=Constr && LA119_0<=Num)||(LA119_0>=String && LA119_0<=ROUND_BRACKET_OPEN)||LA119_0==SQUARE_BRACKET_OPEN||LA119_0==CURLY_BRACKET_OPEN||LA119_0==UNDERSCORE) ) {
                alt119=1;
            }
            else if ( (LA119_0==L_obj) ) {
                alt119=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 119, 0, input);

                throw nvae;
            }
            switch (alt119) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:521:4: lop_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_lop_expr_in_expr3310);
                    lop_expr260=lop_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lop_expr260.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:522:4: obj_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_obj_expr_in_expr3315);
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
    // $ANTLR end "expr"

    public static class control_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "control_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:524:1: control_expr : ( if_expr | while_do_expr | match_expr | for_expr | try_expr | begin_end );
    public final babel17Parser.control_expr_return control_expr() throws RecognitionException {
        babel17Parser.control_expr_return retval = new babel17Parser.control_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.if_expr_return if_expr262 = null;

        babel17Parser.while_do_expr_return while_do_expr263 = null;

        babel17Parser.match_expr_return match_expr264 = null;

        babel17Parser.for_expr_return for_expr265 = null;

        babel17Parser.try_expr_return try_expr266 = null;

        babel17Parser.begin_end_return begin_end267 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:525:2: ( if_expr | while_do_expr | match_expr | for_expr | try_expr | begin_end )
            int alt120=6;
            switch ( input.LA(1) ) {
            case L_if:
                {
                alt120=1;
                }
                break;
            case L_while:
                {
                alt120=2;
                }
                break;
            case L_match:
                {
                alt120=3;
                }
                break;
            case L_for:
                {
                alt120=4;
                }
                break;
            case L_try:
                {
                alt120=5;
                }
                break;
            case L_begin:
                {
                alt120=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 120, 0, input);

                throw nvae;
            }

            switch (alt120) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:525:4: if_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_if_expr_in_control_expr3325);
                    if_expr262=if_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, if_expr262.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:526:4: while_do_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_while_do_expr_in_control_expr3330);
                    while_do_expr263=while_do_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, while_do_expr263.getTree());

                    }
                    break;
                case 3 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:527:4: match_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_match_expr_in_control_expr3335);
                    match_expr264=match_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, match_expr264.getTree());

                    }
                    break;
                case 4 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:528:4: for_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_for_expr_in_control_expr3340);
                    for_expr265=for_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, for_expr265.getTree());

                    }
                    break;
                case 5 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:529:5: try_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_try_expr_in_control_expr3346);
                    try_expr266=try_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, try_expr266.getTree());

                    }
                    break;
                case 6 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:530:4: begin_end
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_begin_end_in_control_expr3351);
                    begin_end267=begin_end();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, begin_end267.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:532:1: with_control_expr : ( control_expr | L_with ( NL )? protected_expr ( NL )? L_do block L_end -> ^( WITH protected_expr ^( BEGIN block ) ) );
    public final babel17Parser.with_control_expr_return with_control_expr() throws RecognitionException {
        babel17Parser.with_control_expr_return retval = new babel17Parser.with_control_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_with269=null;
        Token NL270=null;
        Token NL272=null;
        Token L_do273=null;
        Token L_end275=null;
        babel17Parser.control_expr_return control_expr268 = null;

        babel17Parser.protected_expr_return protected_expr271 = null;

        babel17Parser.block_return block274 = null;


        CommonTree L_with269_tree=null;
        CommonTree NL270_tree=null;
        CommonTree NL272_tree=null;
        CommonTree L_do273_tree=null;
        CommonTree L_end275_tree=null;
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_do=new RewriteRuleTokenStream(adaptor,"token L_do");
        RewriteRuleTokenStream stream_L_with=new RewriteRuleTokenStream(adaptor,"token L_with");
        RewriteRuleSubtreeStream stream_protected_expr=new RewriteRuleSubtreeStream(adaptor,"rule protected_expr");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:533:2: ( control_expr | L_with ( NL )? protected_expr ( NL )? L_do block L_end -> ^( WITH protected_expr ^( BEGIN block ) ) )
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==L_begin||LA123_0==L_if||(LA123_0>=L_while && LA123_0<=L_for)||LA123_0==L_match||LA123_0==L_try) ) {
                alt123=1;
            }
            else if ( (LA123_0==L_with) ) {
                alt123=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 123, 0, input);

                throw nvae;
            }
            switch (alt123) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:533:4: control_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_control_expr_in_with_control_expr3361);
                    control_expr268=control_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, control_expr268.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:534:4: L_with ( NL )? protected_expr ( NL )? L_do block L_end
                    {
                    L_with269=(Token)match(input,L_with,FOLLOW_L_with_in_with_control_expr3366); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_with.add(L_with269);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:534:11: ( NL )?
                    int alt121=2;
                    int LA121_0 = input.LA(1);

                    if ( (LA121_0==NL) ) {
                        alt121=1;
                    }
                    switch (alt121) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:534:11: NL
                            {
                            NL270=(Token)match(input,NL,FOLLOW_NL_in_with_control_expr3368); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL270);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_protected_expr_in_with_control_expr3371);
                    protected_expr271=protected_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr271.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:534:30: ( NL )?
                    int alt122=2;
                    int LA122_0 = input.LA(1);

                    if ( (LA122_0==NL) ) {
                        alt122=1;
                    }
                    switch (alt122) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:534:30: NL
                            {
                            NL272=(Token)match(input,NL,FOLLOW_NL_in_with_control_expr3373); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL272);


                            }
                            break;

                    }

                    L_do273=(Token)match(input,L_do,FOLLOW_L_do_in_with_control_expr3376); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_do.add(L_do273);

                    pushFollow(FOLLOW_block_in_with_control_expr3378);
                    block274=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block274.getTree());
                    L_end275=(Token)match(input,L_end,FOLLOW_L_end_in_with_control_expr3380); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_end.add(L_end275);



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
                    // 534:51: -> ^( WITH protected_expr ^( BEGIN block ) )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:534:54: ^( WITH protected_expr ^( BEGIN block ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(WITH, "WITH"), root_1);

                        adaptor.addChild(root_1, stream_protected_expr.nextTree());
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:534:76: ^( BEGIN block )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:537:1: protected_expr : ( p_lop_expr | obj_expr );
    public final babel17Parser.protected_expr_return protected_expr() throws RecognitionException {
        babel17Parser.protected_expr_return retval = new babel17Parser.protected_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.p_lop_expr_return p_lop_expr276 = null;

        babel17Parser.obj_expr_return obj_expr277 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:538:2: ( p_lop_expr | obj_expr )
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==L_begin||(LA124_0>=L_with && LA124_0<=L_if)||(LA124_0>=L_while && LA124_0<=L_for)||LA124_0==L_match||LA124_0==L_exception||LA124_0==L_try||(LA124_0>=A_infinity && LA124_0<=L_lazy)||(LA124_0>=L_true && LA124_0<=L_nil)||LA124_0==L_typeof||LA124_0==MINUS||LA124_0==A_NOT||LA124_0==U_NOT||(LA124_0>=A_ELLIPSIS && LA124_0<=U_ELLIPSIS)||LA124_0==L_force||(LA124_0>=Constr && LA124_0<=Num)||(LA124_0>=String && LA124_0<=ROUND_BRACKET_OPEN)||LA124_0==SQUARE_BRACKET_OPEN||LA124_0==CURLY_BRACKET_OPEN||LA124_0==UNDERSCORE) ) {
                alt124=1;
            }
            else if ( (LA124_0==L_obj) ) {
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:538:4: p_lop_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_p_lop_expr_in_protected_expr3405);
                    p_lop_expr276=p_lop_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_lop_expr276.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:539:4: obj_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_obj_expr_in_protected_expr3410);
                    obj_expr277=obj_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, obj_expr277.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:541:1: protected_expr_nc : protected_expr ;
    public final babel17Parser.protected_expr_nc_return protected_expr_nc() throws RecognitionException {
        babel17Parser.protected_expr_nc_return retval = new babel17Parser.protected_expr_nc_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.protected_expr_return protected_expr278 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:542:2: ( protected_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:542:4: protected_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_protected_expr_in_protected_expr_nc3421);
            protected_expr278=protected_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, protected_expr278.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:544:1: begin_end : L_begin block L_end -> ^( BEGIN block ) ;
    public final babel17Parser.begin_end_return begin_end() throws RecognitionException {
        babel17Parser.begin_end_return retval = new babel17Parser.begin_end_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_begin279=null;
        Token L_end281=null;
        babel17Parser.block_return block280 = null;


        CommonTree L_begin279_tree=null;
        CommonTree L_end281_tree=null;
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleTokenStream stream_L_begin=new RewriteRuleTokenStream(adaptor,"token L_begin");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:545:2: ( L_begin block L_end -> ^( BEGIN block ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:545:4: L_begin block L_end
            {
            L_begin279=(Token)match(input,L_begin,FOLLOW_L_begin_in_begin_end3431); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_begin.add(L_begin279);

            pushFollow(FOLLOW_block_in_begin_end3433);
            block280=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block280.getTree());
            L_end281=(Token)match(input,L_end,FOLLOW_L_end_in_begin_end3435); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_end.add(L_end281);



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
            // 545:24: -> ^( BEGIN block )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:545:27: ^( BEGIN block )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:548:1: parents : ( '+' primitive_expr -> ^( PARENTS_PLUS primitive_expr ) | '*' primitive_expr -> ^( PARENTS_MUL primitive_expr ) );
    public final babel17Parser.parents_return parents() throws RecognitionException {
        babel17Parser.parents_return retval = new babel17Parser.parents_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal282=null;
        Token char_literal284=null;
        babel17Parser.primitive_expr_return primitive_expr283 = null;

        babel17Parser.primitive_expr_return primitive_expr285 = null;


        CommonTree char_literal282_tree=null;
        CommonTree char_literal284_tree=null;
        RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
        RewriteRuleTokenStream stream_TIMES=new RewriteRuleTokenStream(adaptor,"token TIMES");
        RewriteRuleSubtreeStream stream_primitive_expr=new RewriteRuleSubtreeStream(adaptor,"rule primitive_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:548:9: ( '+' primitive_expr -> ^( PARENTS_PLUS primitive_expr ) | '*' primitive_expr -> ^( PARENTS_MUL primitive_expr ) )
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==PLUS) ) {
                alt125=1;
            }
            else if ( (LA125_0==TIMES) ) {
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:548:11: '+' primitive_expr
                    {
                    char_literal282=(Token)match(input,PLUS,FOLLOW_PLUS_in_parents3453); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PLUS.add(char_literal282);

                    pushFollow(FOLLOW_primitive_expr_in_parents3455);
                    primitive_expr283=primitive_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primitive_expr.add(primitive_expr283.getTree());


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
                    // 548:30: -> ^( PARENTS_PLUS primitive_expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:548:33: ^( PARENTS_PLUS primitive_expr )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:549:4: '*' primitive_expr
                    {
                    char_literal284=(Token)match(input,TIMES,FOLLOW_TIMES_in_parents3468); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TIMES.add(char_literal284);

                    pushFollow(FOLLOW_primitive_expr_in_parents3470);
                    primitive_expr285=primitive_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primitive_expr.add(primitive_expr285.getTree());


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
                    // 549:23: -> ^( PARENTS_MUL primitive_expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:549:26: ^( PARENTS_MUL primitive_expr )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:552:1: obj_expr : ( ( L_obj ( NL )? parents )=> L_obj ( NL )? parents block L_end -> ^( OBJ block parents ) | L_obj block L_end -> ^( OBJ block ) );
    public final babel17Parser.obj_expr_return obj_expr() throws RecognitionException {
        babel17Parser.obj_expr_return retval = new babel17Parser.obj_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_obj286=null;
        Token NL287=null;
        Token L_end290=null;
        Token L_obj291=null;
        Token L_end293=null;
        babel17Parser.parents_return parents288 = null;

        babel17Parser.block_return block289 = null;

        babel17Parser.block_return block292 = null;


        CommonTree L_obj286_tree=null;
        CommonTree NL287_tree=null;
        CommonTree L_end290_tree=null;
        CommonTree L_obj291_tree=null;
        CommonTree L_end293_tree=null;
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_obj=new RewriteRuleTokenStream(adaptor,"token L_obj");
        RewriteRuleSubtreeStream stream_parents=new RewriteRuleSubtreeStream(adaptor,"rule parents");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:552:9: ( ( L_obj ( NL )? parents )=> L_obj ( NL )? parents block L_end -> ^( OBJ block parents ) | L_obj block L_end -> ^( OBJ block ) )
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==L_obj) ) {
                int LA127_1 = input.LA(2);

                if ( (LA127_1==NL) ) {
                    int LA127_2 = input.LA(3);

                    if ( ((LA127_2>=L_begin && LA127_2<=L_if)||(LA127_2>=L_while && LA127_2<=L_for)||(LA127_2>=L_yield && LA127_2<=L_match)||(LA127_2>=L_val && LA127_2<=L_def)||LA127_2==L_exception||LA127_2==L_try||(LA127_2>=A_infinity && LA127_2<=L_nil)||(LA127_2>=L_module && LA127_2<=L_import)||LA127_2==SC||LA127_2==MINUS||LA127_2==A_NOT||LA127_2==U_NOT||(LA127_2>=A_ELLIPSIS && LA127_2<=U_ELLIPSIS)||LA127_2==L_force||(LA127_2>=NL && LA127_2<=Num)||(LA127_2>=String && LA127_2<=ROUND_BRACKET_OPEN)||LA127_2==SQUARE_BRACKET_OPEN||LA127_2==CURLY_BRACKET_OPEN||LA127_2==UNDERSCORE||(LA127_2>=PRAGMA_LOG && LA127_2<=PRAGMA_PROFILE)) ) {
                        alt127=2;
                    }
                    else if ( (LA127_2==PLUS) && (synpred8_babel17())) {
                        alt127=1;
                    }
                    else if ( (LA127_2==TIMES) && (synpred8_babel17())) {
                        alt127=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 127, 2, input);

                        throw nvae;
                    }
                }
                else if ( ((LA127_1>=L_begin && LA127_1<=L_if)||(LA127_1>=L_while && LA127_1<=L_for)||(LA127_1>=L_yield && LA127_1<=L_match)||(LA127_1>=L_val && LA127_1<=L_def)||LA127_1==L_exception||LA127_1==L_try||(LA127_1>=A_infinity && LA127_1<=L_nil)||(LA127_1>=L_module && LA127_1<=L_import)||LA127_1==SC||LA127_1==MINUS||LA127_1==A_NOT||LA127_1==U_NOT||(LA127_1>=A_ELLIPSIS && LA127_1<=U_ELLIPSIS)||LA127_1==L_force||(LA127_1>=Constr && LA127_1<=Num)||(LA127_1>=String && LA127_1<=ROUND_BRACKET_OPEN)||LA127_1==SQUARE_BRACKET_OPEN||LA127_1==CURLY_BRACKET_OPEN||LA127_1==UNDERSCORE||(LA127_1>=PRAGMA_LOG && LA127_1<=PRAGMA_PROFILE)) ) {
                    alt127=2;
                }
                else if ( (LA127_1==PLUS) && (synpred8_babel17())) {
                    alt127=1;
                }
                else if ( (LA127_1==TIMES) && (synpred8_babel17())) {
                    alt127=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 127, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 127, 0, input);

                throw nvae;
            }
            switch (alt127) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:552:11: ( L_obj ( NL )? parents )=> L_obj ( NL )? parents block L_end
                    {
                    L_obj286=(Token)match(input,L_obj,FOLLOW_L_obj_in_obj_expr3498); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_obj.add(L_obj286);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:552:40: ( NL )?
                    int alt126=2;
                    int LA126_0 = input.LA(1);

                    if ( (LA126_0==NL) ) {
                        alt126=1;
                    }
                    switch (alt126) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:552:40: NL
                            {
                            NL287=(Token)match(input,NL,FOLLOW_NL_in_obj_expr3500); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL287);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_parents_in_obj_expr3503);
                    parents288=parents();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parents.add(parents288.getTree());
                    pushFollow(FOLLOW_block_in_obj_expr3505);
                    block289=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block289.getTree());
                    L_end290=(Token)match(input,L_end,FOLLOW_L_end_in_obj_expr3507); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_end.add(L_end290);



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
                    // 552:64: -> ^( OBJ block parents )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:552:67: ^( OBJ block parents )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:553:17: L_obj block L_end
                    {
                    L_obj291=(Token)match(input,L_obj,FOLLOW_L_obj_in_obj_expr3535); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_obj.add(L_obj291);

                    pushFollow(FOLLOW_block_in_obj_expr3537);
                    block292=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block292.getTree());
                    L_end293=(Token)match(input,L_end,FOLLOW_L_end_in_obj_expr3539); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_end.add(L_end293);



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
                    // 553:35: -> ^( OBJ block )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:553:38: ^( OBJ block )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:555:1: lop_expr : ( ( lambda_expr )=> lambda_expr | ( lambda_expr_nobrackets )=> lambda_expr_nobrackets | op_expr );
    public final babel17Parser.lop_expr_return lop_expr() throws RecognitionException {
        babel17Parser.lop_expr_return retval = new babel17Parser.lop_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.lambda_expr_return lambda_expr294 = null;

        babel17Parser.lambda_expr_nobrackets_return lambda_expr_nobrackets295 = null;

        babel17Parser.op_expr_return op_expr296 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:556:2: ( ( lambda_expr )=> lambda_expr | ( lambda_expr_nobrackets )=> lambda_expr_nobrackets | op_expr )
            int alt128=3;
            alt128 = dfa128.predict(input);
            switch (alt128) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:556:4: ( lambda_expr )=> lambda_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_lambda_expr_in_lop_expr3567);
                    lambda_expr294=lambda_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lambda_expr294.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:557:4: ( lambda_expr_nobrackets )=> lambda_expr_nobrackets
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_lambda_expr_nobrackets_in_lop_expr3578);
                    lambda_expr_nobrackets295=lambda_expr_nobrackets();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lambda_expr_nobrackets295.getTree());

                    }
                    break;
                case 3 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:558:4: op_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_op_expr_in_lop_expr3583);
                    op_expr296=op_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, op_expr296.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:560:1: p_lop_expr : ( ( lambda_expr )=> lambda_expr | ( lambda_expr_nobrackets )=> lambda_expr_nobrackets | p_op_expr );
    public final babel17Parser.p_lop_expr_return p_lop_expr() throws RecognitionException {
        babel17Parser.p_lop_expr_return retval = new babel17Parser.p_lop_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.lambda_expr_return lambda_expr297 = null;

        babel17Parser.lambda_expr_nobrackets_return lambda_expr_nobrackets298 = null;

        babel17Parser.p_op_expr_return p_op_expr299 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:561:2: ( ( lambda_expr )=> lambda_expr | ( lambda_expr_nobrackets )=> lambda_expr_nobrackets | p_op_expr )
            int alt129=3;
            alt129 = dfa129.predict(input);
            switch (alt129) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:561:4: ( lambda_expr )=> lambda_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_lambda_expr_in_p_lop_expr3599);
                    lambda_expr297=lambda_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lambda_expr297.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:562:4: ( lambda_expr_nobrackets )=> lambda_expr_nobrackets
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_lambda_expr_nobrackets_in_p_lop_expr3610);
                    lambda_expr_nobrackets298=lambda_expr_nobrackets();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lambda_expr_nobrackets298.getTree());

                    }
                    break;
                case 3 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:563:4: p_op_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_p_op_expr_in_p_lop_expr3615);
                    p_op_expr299=p_op_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_op_expr299.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:565:1: if_expr : L_if ( NL )? protected_expr ( NL )? L_then block ( L_elseif ( NL )? protected_expr ( NL )? L_then block )* ( L_else block )? L_end -> ^( IF ( protected_expr )* ( block )* ) ;
    public final babel17Parser.if_expr_return if_expr() throws RecognitionException {
        babel17Parser.if_expr_return retval = new babel17Parser.if_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_if300=null;
        Token NL301=null;
        Token NL303=null;
        Token L_then304=null;
        Token L_elseif306=null;
        Token NL307=null;
        Token NL309=null;
        Token L_then310=null;
        Token L_else312=null;
        Token L_end314=null;
        babel17Parser.protected_expr_return protected_expr302 = null;

        babel17Parser.block_return block305 = null;

        babel17Parser.protected_expr_return protected_expr308 = null;

        babel17Parser.block_return block311 = null;

        babel17Parser.block_return block313 = null;


        CommonTree L_if300_tree=null;
        CommonTree NL301_tree=null;
        CommonTree NL303_tree=null;
        CommonTree L_then304_tree=null;
        CommonTree L_elseif306_tree=null;
        CommonTree NL307_tree=null;
        CommonTree NL309_tree=null;
        CommonTree L_then310_tree=null;
        CommonTree L_else312_tree=null;
        CommonTree L_end314_tree=null;
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleTokenStream stream_L_else=new RewriteRuleTokenStream(adaptor,"token L_else");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_elseif=new RewriteRuleTokenStream(adaptor,"token L_elseif");
        RewriteRuleTokenStream stream_L_then=new RewriteRuleTokenStream(adaptor,"token L_then");
        RewriteRuleTokenStream stream_L_if=new RewriteRuleTokenStream(adaptor,"token L_if");
        RewriteRuleSubtreeStream stream_protected_expr=new RewriteRuleSubtreeStream(adaptor,"rule protected_expr");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:565:9: ( L_if ( NL )? protected_expr ( NL )? L_then block ( L_elseif ( NL )? protected_expr ( NL )? L_then block )* ( L_else block )? L_end -> ^( IF ( protected_expr )* ( block )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:565:11: L_if ( NL )? protected_expr ( NL )? L_then block ( L_elseif ( NL )? protected_expr ( NL )? L_then block )* ( L_else block )? L_end
            {
            L_if300=(Token)match(input,L_if,FOLLOW_L_if_in_if_expr3625); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_if.add(L_if300);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:565:16: ( NL )?
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==NL) ) {
                alt130=1;
            }
            switch (alt130) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:565:16: NL
                    {
                    NL301=(Token)match(input,NL,FOLLOW_NL_in_if_expr3627); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL301);


                    }
                    break;

            }

            pushFollow(FOLLOW_protected_expr_in_if_expr3630);
            protected_expr302=protected_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr302.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:565:35: ( NL )?
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==NL) ) {
                alt131=1;
            }
            switch (alt131) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:565:35: NL
                    {
                    NL303=(Token)match(input,NL,FOLLOW_NL_in_if_expr3632); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL303);


                    }
                    break;

            }

            L_then304=(Token)match(input,L_then,FOLLOW_L_then_in_if_expr3635); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_then.add(L_then304);

            pushFollow(FOLLOW_block_in_if_expr3637);
            block305=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block305.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:566:3: ( L_elseif ( NL )? protected_expr ( NL )? L_then block )*
            loop134:
            do {
                int alt134=2;
                int LA134_0 = input.LA(1);

                if ( (LA134_0==L_elseif) ) {
                    alt134=1;
                }


                switch (alt134) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:566:4: L_elseif ( NL )? protected_expr ( NL )? L_then block
            	    {
            	    L_elseif306=(Token)match(input,L_elseif,FOLLOW_L_elseif_in_if_expr3643); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_L_elseif.add(L_elseif306);

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:566:13: ( NL )?
            	    int alt132=2;
            	    int LA132_0 = input.LA(1);

            	    if ( (LA132_0==NL) ) {
            	        alt132=1;
            	    }
            	    switch (alt132) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:566:13: NL
            	            {
            	            NL307=(Token)match(input,NL,FOLLOW_NL_in_if_expr3645); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL307);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_protected_expr_in_if_expr3648);
            	    protected_expr308=protected_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr308.getTree());
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:566:32: ( NL )?
            	    int alt133=2;
            	    int LA133_0 = input.LA(1);

            	    if ( (LA133_0==NL) ) {
            	        alt133=1;
            	    }
            	    switch (alt133) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:566:32: NL
            	            {
            	            NL309=(Token)match(input,NL,FOLLOW_NL_in_if_expr3650); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL309);


            	            }
            	            break;

            	    }

            	    L_then310=(Token)match(input,L_then,FOLLOW_L_then_in_if_expr3653); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_L_then.add(L_then310);

            	    pushFollow(FOLLOW_block_in_if_expr3655);
            	    block311=block();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_block.add(block311.getTree());

            	    }
            	    break;

            	default :
            	    break loop134;
                }
            } while (true);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:567:3: ( L_else block )?
            int alt135=2;
            int LA135_0 = input.LA(1);

            if ( (LA135_0==L_else) ) {
                alt135=1;
            }
            switch (alt135) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:567:4: L_else block
                    {
                    L_else312=(Token)match(input,L_else,FOLLOW_L_else_in_if_expr3663); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_else.add(L_else312);

                    pushFollow(FOLLOW_block_in_if_expr3665);
                    block313=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block313.getTree());

                    }
                    break;

            }

            L_end314=(Token)match(input,L_end,FOLLOW_L_end_in_if_expr3669); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_end.add(L_end314);



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
            // 567:26: -> ^( IF ( protected_expr )* ( block )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:567:29: ^( IF ( protected_expr )* ( block )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IF, "IF"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:567:34: ( protected_expr )*
                while ( stream_protected_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_protected_expr.nextTree());

                }
                stream_protected_expr.reset();
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:567:50: ( block )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:569:1: while_do_expr : L_while ( NL )? protected_expr ( NL )? L_do block L_end -> ^( WHILE_DO protected_expr block ) ;
    public final babel17Parser.while_do_expr_return while_do_expr() throws RecognitionException {
        babel17Parser.while_do_expr_return retval = new babel17Parser.while_do_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_while315=null;
        Token NL316=null;
        Token NL318=null;
        Token L_do319=null;
        Token L_end321=null;
        babel17Parser.protected_expr_return protected_expr317 = null;

        babel17Parser.block_return block320 = null;


        CommonTree L_while315_tree=null;
        CommonTree NL316_tree=null;
        CommonTree NL318_tree=null;
        CommonTree L_do319_tree=null;
        CommonTree L_end321_tree=null;
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_do=new RewriteRuleTokenStream(adaptor,"token L_do");
        RewriteRuleTokenStream stream_L_while=new RewriteRuleTokenStream(adaptor,"token L_while");
        RewriteRuleSubtreeStream stream_protected_expr=new RewriteRuleSubtreeStream(adaptor,"rule protected_expr");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:570:2: ( L_while ( NL )? protected_expr ( NL )? L_do block L_end -> ^( WHILE_DO protected_expr block ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:570:4: L_while ( NL )? protected_expr ( NL )? L_do block L_end
            {
            L_while315=(Token)match(input,L_while,FOLLOW_L_while_in_while_do_expr3693); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_while.add(L_while315);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:570:12: ( NL )?
            int alt136=2;
            int LA136_0 = input.LA(1);

            if ( (LA136_0==NL) ) {
                alt136=1;
            }
            switch (alt136) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:570:12: NL
                    {
                    NL316=(Token)match(input,NL,FOLLOW_NL_in_while_do_expr3695); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL316);


                    }
                    break;

            }

            pushFollow(FOLLOW_protected_expr_in_while_do_expr3698);
            protected_expr317=protected_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr317.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:570:31: ( NL )?
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( (LA137_0==NL) ) {
                alt137=1;
            }
            switch (alt137) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:570:31: NL
                    {
                    NL318=(Token)match(input,NL,FOLLOW_NL_in_while_do_expr3700); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL318);


                    }
                    break;

            }

            L_do319=(Token)match(input,L_do,FOLLOW_L_do_in_while_do_expr3703); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_do.add(L_do319);

            pushFollow(FOLLOW_block_in_while_do_expr3705);
            block320=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block320.getTree());
            L_end321=(Token)match(input,L_end,FOLLOW_L_end_in_while_do_expr3707); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_end.add(L_end321);



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
            // 571:5: -> ^( WHILE_DO protected_expr block )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:571:8: ^( WHILE_DO protected_expr block )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:573:1: cases : ( full_cases | pattern ( NL )? token_DOUBLE_ARROW block -> ^( CASES ^( NIL_TOKEN pattern block ) ) );
    public final babel17Parser.cases_return cases() throws RecognitionException {
        babel17Parser.cases_return retval = new babel17Parser.cases_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL324=null;
        babel17Parser.full_cases_return full_cases322 = null;

        babel17Parser.pattern_return pattern323 = null;

        babel17Parser.token_DOUBLE_ARROW_return token_DOUBLE_ARROW325 = null;

        babel17Parser.block_return block326 = null;


        CommonTree NL324_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_token_DOUBLE_ARROW=new RewriteRuleSubtreeStream(adaptor,"rule token_DOUBLE_ARROW");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:574:2: ( full_cases | pattern ( NL )? token_DOUBLE_ARROW block -> ^( CASES ^( NIL_TOKEN pattern block ) ) )
            int alt139=2;
            int LA139_0 = input.LA(1);

            if ( (LA139_0==L_case) ) {
                alt139=1;
            }
            else if ( (LA139_0==L_exception||(LA139_0>=A_infinity && LA139_0<=U_infinity)||(LA139_0>=L_true && LA139_0<=L_false)||LA139_0==L_nil||LA139_0==MINUS||(LA139_0>=A_ELLIPSIS && LA139_0<=U_ELLIPSIS)||(LA139_0>=Constr && LA139_0<=Num)||(LA139_0>=String && LA139_0<=ROUND_BRACKET_OPEN)||LA139_0==SQUARE_BRACKET_OPEN||LA139_0==CURLY_BRACKET_OPEN||LA139_0==UNDERSCORE) ) {
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:574:4: full_cases
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_full_cases_in_cases3737);
                    full_cases322=full_cases();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, full_cases322.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:575:4: pattern ( NL )? token_DOUBLE_ARROW block
                    {
                    pushFollow(FOLLOW_pattern_in_cases3742);
                    pattern323=pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pattern.add(pattern323.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:575:12: ( NL )?
                    int alt138=2;
                    int LA138_0 = input.LA(1);

                    if ( (LA138_0==NL) ) {
                        alt138=1;
                    }
                    switch (alt138) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:575:12: NL
                            {
                            NL324=(Token)match(input,NL,FOLLOW_NL_in_cases3744); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL324);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_token_DOUBLE_ARROW_in_cases3747);
                    token_DOUBLE_ARROW325=token_DOUBLE_ARROW();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_token_DOUBLE_ARROW.add(token_DOUBLE_ARROW325.getTree());
                    pushFollow(FOLLOW_block_in_cases3749);
                    block326=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block326.getTree());


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
                    // 575:41: -> ^( CASES ^( NIL_TOKEN pattern block ) )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:575:44: ^( CASES ^( NIL_TOKEN pattern block ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CASES, "CASES"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:575:52: ^( NIL_TOKEN pattern block )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:577:1: full_cases : ( case_expr )+ -> ^( CASES ( case_expr )+ ) ;
    public final babel17Parser.full_cases_return full_cases() throws RecognitionException {
        babel17Parser.full_cases_return retval = new babel17Parser.full_cases_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.case_expr_return case_expr327 = null;


        RewriteRuleSubtreeStream stream_case_expr=new RewriteRuleSubtreeStream(adaptor,"rule case_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:578:2: ( ( case_expr )+ -> ^( CASES ( case_expr )+ ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:578:4: ( case_expr )+
            {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:578:4: ( case_expr )+
            int cnt140=0;
            loop140:
            do {
                int alt140=2;
                int LA140_0 = input.LA(1);

                if ( (LA140_0==L_case) ) {
                    alt140=1;
                }


                switch (alt140) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:578:4: case_expr
            	    {
            	    pushFollow(FOLLOW_case_expr_in_full_cases3772);
            	    case_expr327=case_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_case_expr.add(case_expr327.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt140 >= 1 ) break loop140;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(140, input);
                        throw eee;
                }
                cnt140++;
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
            // 578:15: -> ^( CASES ( case_expr )+ )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:578:18: ^( CASES ( case_expr )+ )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:580:1: case_expr : ( L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW block ) -> ^( NIL_TOKEN pattern block ) ;
    public final babel17Parser.case_expr_return case_expr() throws RecognitionException {
        babel17Parser.case_expr_return retval = new babel17Parser.case_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_case328=null;
        Token NL329=null;
        Token NL331=null;
        babel17Parser.pattern_return pattern330 = null;

        babel17Parser.token_DOUBLE_ARROW_return token_DOUBLE_ARROW332 = null;

        babel17Parser.block_return block333 = null;


        CommonTree L_case328_tree=null;
        CommonTree NL329_tree=null;
        CommonTree NL331_tree=null;
        RewriteRuleTokenStream stream_L_case=new RewriteRuleTokenStream(adaptor,"token L_case");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_token_DOUBLE_ARROW=new RewriteRuleSubtreeStream(adaptor,"rule token_DOUBLE_ARROW");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:581:2: ( ( L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW block ) -> ^( NIL_TOKEN pattern block ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:581:4: ( L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW block )
            {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:581:4: ( L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW block )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:581:5: L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW block
            {
            L_case328=(Token)match(input,L_case,FOLLOW_L_case_in_case_expr3793); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_case.add(L_case328);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:581:12: ( NL )?
            int alt141=2;
            int LA141_0 = input.LA(1);

            if ( (LA141_0==NL) ) {
                alt141=1;
            }
            switch (alt141) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:581:12: NL
                    {
                    NL329=(Token)match(input,NL,FOLLOW_NL_in_case_expr3795); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL329);


                    }
                    break;

            }

            pushFollow(FOLLOW_pattern_in_case_expr3798);
            pattern330=pattern();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pattern.add(pattern330.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:581:24: ( NL )?
            int alt142=2;
            int LA142_0 = input.LA(1);

            if ( (LA142_0==NL) ) {
                alt142=1;
            }
            switch (alt142) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:581:24: NL
                    {
                    NL331=(Token)match(input,NL,FOLLOW_NL_in_case_expr3800); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL331);


                    }
                    break;

            }

            pushFollow(FOLLOW_token_DOUBLE_ARROW_in_case_expr3803);
            token_DOUBLE_ARROW332=token_DOUBLE_ARROW();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_token_DOUBLE_ARROW.add(token_DOUBLE_ARROW332.getTree());
            pushFollow(FOLLOW_block_in_case_expr3805);
            block333=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block333.getTree());

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
            // 581:54: -> ^( NIL_TOKEN pattern block )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:581:57: ^( NIL_TOKEN pattern block )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:583:1: match_expr : L_match ( NL )? p_op_expr ( NL )? full_cases L_end -> ^( MATCH p_op_expr full_cases ) ;
    public final babel17Parser.match_expr_return match_expr() throws RecognitionException {
        babel17Parser.match_expr_return retval = new babel17Parser.match_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_match334=null;
        Token NL335=null;
        Token NL337=null;
        Token L_end339=null;
        babel17Parser.p_op_expr_return p_op_expr336 = null;

        babel17Parser.full_cases_return full_cases338 = null;


        CommonTree L_match334_tree=null;
        CommonTree NL335_tree=null;
        CommonTree NL337_tree=null;
        CommonTree L_end339_tree=null;
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_match=new RewriteRuleTokenStream(adaptor,"token L_match");
        RewriteRuleSubtreeStream stream_full_cases=new RewriteRuleSubtreeStream(adaptor,"rule full_cases");
        RewriteRuleSubtreeStream stream_p_op_expr=new RewriteRuleSubtreeStream(adaptor,"rule p_op_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:584:2: ( L_match ( NL )? p_op_expr ( NL )? full_cases L_end -> ^( MATCH p_op_expr full_cases ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:584:4: L_match ( NL )? p_op_expr ( NL )? full_cases L_end
            {
            L_match334=(Token)match(input,L_match,FOLLOW_L_match_in_match_expr3826); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_match.add(L_match334);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:584:12: ( NL )?
            int alt143=2;
            int LA143_0 = input.LA(1);

            if ( (LA143_0==NL) ) {
                alt143=1;
            }
            switch (alt143) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:584:12: NL
                    {
                    NL335=(Token)match(input,NL,FOLLOW_NL_in_match_expr3828); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL335);


                    }
                    break;

            }

            pushFollow(FOLLOW_p_op_expr_in_match_expr3831);
            p_op_expr336=p_op_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_p_op_expr.add(p_op_expr336.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:584:26: ( NL )?
            int alt144=2;
            int LA144_0 = input.LA(1);

            if ( (LA144_0==NL) ) {
                alt144=1;
            }
            switch (alt144) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:584:26: NL
                    {
                    NL337=(Token)match(input,NL,FOLLOW_NL_in_match_expr3833); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL337);


                    }
                    break;

            }

            pushFollow(FOLLOW_full_cases_in_match_expr3836);
            full_cases338=full_cases();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_full_cases.add(full_cases338.getTree());
            L_end339=(Token)match(input,L_end,FOLLOW_L_end_in_match_expr3838); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_end.add(L_end339);



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
            // 585:5: -> ^( MATCH p_op_expr full_cases )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:585:8: ^( MATCH p_op_expr full_cases )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:587:1: try_expr : L_try ( NL )? pure_block ( NL )? L_catch ( NL )? full_cases L_end -> ^( TRY pure_block full_cases ) ;
    public final babel17Parser.try_expr_return try_expr() throws RecognitionException {
        babel17Parser.try_expr_return retval = new babel17Parser.try_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_try340=null;
        Token NL341=null;
        Token NL343=null;
        Token L_catch344=null;
        Token NL345=null;
        Token L_end347=null;
        babel17Parser.pure_block_return pure_block342 = null;

        babel17Parser.full_cases_return full_cases346 = null;


        CommonTree L_try340_tree=null;
        CommonTree NL341_tree=null;
        CommonTree NL343_tree=null;
        CommonTree L_catch344_tree=null;
        CommonTree NL345_tree=null;
        CommonTree L_end347_tree=null;
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleTokenStream stream_L_try=new RewriteRuleTokenStream(adaptor,"token L_try");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_catch=new RewriteRuleTokenStream(adaptor,"token L_catch");
        RewriteRuleSubtreeStream stream_full_cases=new RewriteRuleSubtreeStream(adaptor,"rule full_cases");
        RewriteRuleSubtreeStream stream_pure_block=new RewriteRuleSubtreeStream(adaptor,"rule pure_block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:587:9: ( L_try ( NL )? pure_block ( NL )? L_catch ( NL )? full_cases L_end -> ^( TRY pure_block full_cases ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:587:11: L_try ( NL )? pure_block ( NL )? L_catch ( NL )? full_cases L_end
            {
            L_try340=(Token)match(input,L_try,FOLLOW_L_try_in_try_expr3864); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_try.add(L_try340);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:587:17: ( NL )?
            int alt145=2;
            int LA145_0 = input.LA(1);

            if ( (LA145_0==NL) ) {
                alt145=1;
            }
            switch (alt145) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:587:17: NL
                    {
                    NL341=(Token)match(input,NL,FOLLOW_NL_in_try_expr3866); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL341);


                    }
                    break;

            }

            pushFollow(FOLLOW_pure_block_in_try_expr3869);
            pure_block342=pure_block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pure_block.add(pure_block342.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:587:32: ( NL )?
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==NL) ) {
                alt146=1;
            }
            switch (alt146) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:587:32: NL
                    {
                    NL343=(Token)match(input,NL,FOLLOW_NL_in_try_expr3871); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL343);


                    }
                    break;

            }

            L_catch344=(Token)match(input,L_catch,FOLLOW_L_catch_in_try_expr3874); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_catch.add(L_catch344);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:587:44: ( NL )?
            int alt147=2;
            int LA147_0 = input.LA(1);

            if ( (LA147_0==NL) ) {
                alt147=1;
            }
            switch (alt147) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:587:44: NL
                    {
                    NL345=(Token)match(input,NL,FOLLOW_NL_in_try_expr3876); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL345);


                    }
                    break;

            }

            pushFollow(FOLLOW_full_cases_in_try_expr3879);
            full_cases346=full_cases();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_full_cases.add(full_cases346.getTree());
            L_end347=(Token)match(input,L_end,FOLLOW_L_end_in_try_expr3881); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_end.add(L_end347);



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
            // 588:5: -> ^( TRY pure_block full_cases )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:588:8: ^( TRY pure_block full_cases )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:590:1: lambda_expr : '(' ( NL )? lambda_cases ( NL )? ')' -> ^( LAMBDA lambda_cases ) ;
    public final babel17Parser.lambda_expr_return lambda_expr() throws RecognitionException {
        babel17Parser.lambda_expr_return retval = new babel17Parser.lambda_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal348=null;
        Token NL349=null;
        Token NL351=null;
        Token char_literal352=null;
        babel17Parser.lambda_cases_return lambda_cases350 = null;


        CommonTree char_literal348_tree=null;
        CommonTree NL349_tree=null;
        CommonTree NL351_tree=null;
        CommonTree char_literal352_tree=null;
        RewriteRuleTokenStream stream_ROUND_BRACKET_OPEN=new RewriteRuleTokenStream(adaptor,"token ROUND_BRACKET_OPEN");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_ROUND_BRACKET_CLOSE=new RewriteRuleTokenStream(adaptor,"token ROUND_BRACKET_CLOSE");
        RewriteRuleSubtreeStream stream_lambda_cases=new RewriteRuleSubtreeStream(adaptor,"rule lambda_cases");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:591:2: ( '(' ( NL )? lambda_cases ( NL )? ')' -> ^( LAMBDA lambda_cases ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:591:4: '(' ( NL )? lambda_cases ( NL )? ')'
            {
            char_literal348=(Token)match(input,ROUND_BRACKET_OPEN,FOLLOW_ROUND_BRACKET_OPEN_in_lambda_expr3905); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ROUND_BRACKET_OPEN.add(char_literal348);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:591:8: ( NL )?
            int alt148=2;
            int LA148_0 = input.LA(1);

            if ( (LA148_0==NL) ) {
                alt148=1;
            }
            switch (alt148) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:591:8: NL
                    {
                    NL349=(Token)match(input,NL,FOLLOW_NL_in_lambda_expr3907); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL349);


                    }
                    break;

            }

            pushFollow(FOLLOW_lambda_cases_in_lambda_expr3910);
            lambda_cases350=lambda_cases();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_lambda_cases.add(lambda_cases350.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:591:25: ( NL )?
            int alt149=2;
            int LA149_0 = input.LA(1);

            if ( (LA149_0==NL) ) {
                alt149=1;
            }
            switch (alt149) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:591:25: NL
                    {
                    NL351=(Token)match(input,NL,FOLLOW_NL_in_lambda_expr3912); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL351);


                    }
                    break;

            }

            char_literal352=(Token)match(input,ROUND_BRACKET_CLOSE,FOLLOW_ROUND_BRACKET_CLOSE_in_lambda_expr3915); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ROUND_BRACKET_CLOSE.add(char_literal352);



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
            // 591:33: -> ^( LAMBDA lambda_cases )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:591:36: ^( LAMBDA lambda_cases )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:593:1: lambda_expr_nobrackets : lambda_cases_nobrackets -> ^( LAMBDA lambda_cases_nobrackets ) ;
    public final babel17Parser.lambda_expr_nobrackets_return lambda_expr_nobrackets() throws RecognitionException {
        babel17Parser.lambda_expr_nobrackets_return retval = new babel17Parser.lambda_expr_nobrackets_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.lambda_cases_nobrackets_return lambda_cases_nobrackets353 = null;


        RewriteRuleSubtreeStream stream_lambda_cases_nobrackets=new RewriteRuleSubtreeStream(adaptor,"rule lambda_cases_nobrackets");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:594:2: ( lambda_cases_nobrackets -> ^( LAMBDA lambda_cases_nobrackets ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:594:4: lambda_cases_nobrackets
            {
            pushFollow(FOLLOW_lambda_cases_nobrackets_in_lambda_expr_nobrackets3934);
            lambda_cases_nobrackets353=lambda_cases_nobrackets();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_lambda_cases_nobrackets.add(lambda_cases_nobrackets353.getTree());


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
            // 594:28: -> ^( LAMBDA lambda_cases_nobrackets )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:594:31: ^( LAMBDA lambda_cases_nobrackets )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:596:1: lambda_cases_nobrackets : pattern ( NL )? token_DOUBLE_ARROW ( NL )? lop_expr -> ^( CASES ^( NIL_TOKEN pattern ^( BLOCK lop_expr ) ) ) ;
    public final babel17Parser.lambda_cases_nobrackets_return lambda_cases_nobrackets() throws RecognitionException {
        babel17Parser.lambda_cases_nobrackets_return retval = new babel17Parser.lambda_cases_nobrackets_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL355=null;
        Token NL357=null;
        babel17Parser.pattern_return pattern354 = null;

        babel17Parser.token_DOUBLE_ARROW_return token_DOUBLE_ARROW356 = null;

        babel17Parser.lop_expr_return lop_expr358 = null;


        CommonTree NL355_tree=null;
        CommonTree NL357_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_token_DOUBLE_ARROW=new RewriteRuleSubtreeStream(adaptor,"rule token_DOUBLE_ARROW");
        RewriteRuleSubtreeStream stream_lop_expr=new RewriteRuleSubtreeStream(adaptor,"rule lop_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:597:2: ( pattern ( NL )? token_DOUBLE_ARROW ( NL )? lop_expr -> ^( CASES ^( NIL_TOKEN pattern ^( BLOCK lop_expr ) ) ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:597:4: pattern ( NL )? token_DOUBLE_ARROW ( NL )? lop_expr
            {
            pushFollow(FOLLOW_pattern_in_lambda_cases_nobrackets3952);
            pattern354=pattern();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pattern.add(pattern354.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:597:12: ( NL )?
            int alt150=2;
            int LA150_0 = input.LA(1);

            if ( (LA150_0==NL) ) {
                alt150=1;
            }
            switch (alt150) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:597:12: NL
                    {
                    NL355=(Token)match(input,NL,FOLLOW_NL_in_lambda_cases_nobrackets3954); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL355);


                    }
                    break;

            }

            pushFollow(FOLLOW_token_DOUBLE_ARROW_in_lambda_cases_nobrackets3957);
            token_DOUBLE_ARROW356=token_DOUBLE_ARROW();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_token_DOUBLE_ARROW.add(token_DOUBLE_ARROW356.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:597:35: ( NL )?
            int alt151=2;
            int LA151_0 = input.LA(1);

            if ( (LA151_0==NL) ) {
                alt151=1;
            }
            switch (alt151) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:597:35: NL
                    {
                    NL357=(Token)match(input,NL,FOLLOW_NL_in_lambda_cases_nobrackets3959); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL357);


                    }
                    break;

            }

            pushFollow(FOLLOW_lop_expr_in_lambda_cases_nobrackets3962);
            lop_expr358=lop_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_lop_expr.add(lop_expr358.getTree());


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
            // 597:48: -> ^( CASES ^( NIL_TOKEN pattern ^( BLOCK lop_expr ) ) )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:597:51: ^( CASES ^( NIL_TOKEN pattern ^( BLOCK lop_expr ) ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CASES, "CASES"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:597:59: ^( NIL_TOKEN pattern ^( BLOCK lop_expr ) )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_2);

                adaptor.addChild(root_2, stream_pattern.nextTree());
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:597:79: ^( BLOCK lop_expr )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:599:1: lambda_case_expr : ( L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block ) -> ^( NIL_TOKEN pattern pure_block ) ;
    public final babel17Parser.lambda_case_expr_return lambda_case_expr() throws RecognitionException {
        babel17Parser.lambda_case_expr_return retval = new babel17Parser.lambda_case_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_case359=null;
        Token NL360=null;
        Token NL362=null;
        Token NL364=null;
        babel17Parser.pattern_return pattern361 = null;

        babel17Parser.token_DOUBLE_ARROW_return token_DOUBLE_ARROW363 = null;

        babel17Parser.pure_block_return pure_block365 = null;


        CommonTree L_case359_tree=null;
        CommonTree NL360_tree=null;
        CommonTree NL362_tree=null;
        CommonTree NL364_tree=null;
        RewriteRuleTokenStream stream_L_case=new RewriteRuleTokenStream(adaptor,"token L_case");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_token_DOUBLE_ARROW=new RewriteRuleSubtreeStream(adaptor,"rule token_DOUBLE_ARROW");
        RewriteRuleSubtreeStream stream_pure_block=new RewriteRuleSubtreeStream(adaptor,"rule pure_block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:600:2: ( ( L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block ) -> ^( NIL_TOKEN pattern pure_block ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:600:4: ( L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block )
            {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:600:4: ( L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:600:5: L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block
            {
            L_case359=(Token)match(input,L_case,FOLLOW_L_case_in_lambda_case_expr3990); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_case.add(L_case359);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:600:12: ( NL )?
            int alt152=2;
            int LA152_0 = input.LA(1);

            if ( (LA152_0==NL) ) {
                alt152=1;
            }
            switch (alt152) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:600:12: NL
                    {
                    NL360=(Token)match(input,NL,FOLLOW_NL_in_lambda_case_expr3992); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL360);


                    }
                    break;

            }

            pushFollow(FOLLOW_pattern_in_lambda_case_expr3995);
            pattern361=pattern();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pattern.add(pattern361.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:600:24: ( NL )?
            int alt153=2;
            int LA153_0 = input.LA(1);

            if ( (LA153_0==NL) ) {
                alt153=1;
            }
            switch (alt153) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:600:24: NL
                    {
                    NL362=(Token)match(input,NL,FOLLOW_NL_in_lambda_case_expr3997); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL362);


                    }
                    break;

            }

            pushFollow(FOLLOW_token_DOUBLE_ARROW_in_lambda_case_expr4000);
            token_DOUBLE_ARROW363=token_DOUBLE_ARROW();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_token_DOUBLE_ARROW.add(token_DOUBLE_ARROW363.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:600:47: ( NL )?
            int alt154=2;
            int LA154_0 = input.LA(1);

            if ( (LA154_0==NL) ) {
                alt154=1;
            }
            switch (alt154) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:600:47: NL
                    {
                    NL364=(Token)match(input,NL,FOLLOW_NL_in_lambda_case_expr4002); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL364);


                    }
                    break;

            }

            pushFollow(FOLLOW_pure_block_in_lambda_case_expr4005);
            pure_block365=pure_block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pure_block.add(pure_block365.getTree());

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
            // 600:63: -> ^( NIL_TOKEN pattern pure_block )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:600:66: ^( NIL_TOKEN pattern pure_block )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:602:1: lambda_cases : ( pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block -> ^( CASES ^( NIL_TOKEN pattern pure_block ) ) | lambda_case_expr ( ( NL )? lambda_case_expr )* -> ^( CASES ( lambda_case_expr )+ ) );
    public final babel17Parser.lambda_cases_return lambda_cases() throws RecognitionException {
        babel17Parser.lambda_cases_return retval = new babel17Parser.lambda_cases_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL367=null;
        Token NL369=null;
        Token NL372=null;
        babel17Parser.pattern_return pattern366 = null;

        babel17Parser.token_DOUBLE_ARROW_return token_DOUBLE_ARROW368 = null;

        babel17Parser.pure_block_return pure_block370 = null;

        babel17Parser.lambda_case_expr_return lambda_case_expr371 = null;

        babel17Parser.lambda_case_expr_return lambda_case_expr373 = null;


        CommonTree NL367_tree=null;
        CommonTree NL369_tree=null;
        CommonTree NL372_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_token_DOUBLE_ARROW=new RewriteRuleSubtreeStream(adaptor,"rule token_DOUBLE_ARROW");
        RewriteRuleSubtreeStream stream_lambda_case_expr=new RewriteRuleSubtreeStream(adaptor,"rule lambda_case_expr");
        RewriteRuleSubtreeStream stream_pure_block=new RewriteRuleSubtreeStream(adaptor,"rule pure_block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:603:2: ( pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block -> ^( CASES ^( NIL_TOKEN pattern pure_block ) ) | lambda_case_expr ( ( NL )? lambda_case_expr )* -> ^( CASES ( lambda_case_expr )+ ) )
            int alt159=2;
            int LA159_0 = input.LA(1);

            if ( (LA159_0==L_exception||(LA159_0>=A_infinity && LA159_0<=U_infinity)||(LA159_0>=L_true && LA159_0<=L_false)||LA159_0==L_nil||LA159_0==MINUS||(LA159_0>=A_ELLIPSIS && LA159_0<=U_ELLIPSIS)||(LA159_0>=Constr && LA159_0<=Num)||(LA159_0>=String && LA159_0<=ROUND_BRACKET_OPEN)||LA159_0==SQUARE_BRACKET_OPEN||LA159_0==CURLY_BRACKET_OPEN||LA159_0==UNDERSCORE) ) {
                alt159=1;
            }
            else if ( (LA159_0==L_case) ) {
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:603:4: pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block
                    {
                    pushFollow(FOLLOW_pattern_in_lambda_cases4026);
                    pattern366=pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pattern.add(pattern366.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:603:12: ( NL )?
                    int alt155=2;
                    int LA155_0 = input.LA(1);

                    if ( (LA155_0==NL) ) {
                        alt155=1;
                    }
                    switch (alt155) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:603:12: NL
                            {
                            NL367=(Token)match(input,NL,FOLLOW_NL_in_lambda_cases4028); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL367);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_token_DOUBLE_ARROW_in_lambda_cases4031);
                    token_DOUBLE_ARROW368=token_DOUBLE_ARROW();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_token_DOUBLE_ARROW.add(token_DOUBLE_ARROW368.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:603:35: ( NL )?
                    int alt156=2;
                    int LA156_0 = input.LA(1);

                    if ( (LA156_0==NL) ) {
                        alt156=1;
                    }
                    switch (alt156) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:603:35: NL
                            {
                            NL369=(Token)match(input,NL,FOLLOW_NL_in_lambda_cases4033); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL369);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_pure_block_in_lambda_cases4036);
                    pure_block370=pure_block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pure_block.add(pure_block370.getTree());


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
                    // 603:50: -> ^( CASES ^( NIL_TOKEN pattern pure_block ) )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:603:53: ^( CASES ^( NIL_TOKEN pattern pure_block ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CASES, "CASES"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:603:61: ^( NIL_TOKEN pattern pure_block )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:604:4: lambda_case_expr ( ( NL )? lambda_case_expr )*
                    {
                    pushFollow(FOLLOW_lambda_case_expr_in_lambda_cases4055);
                    lambda_case_expr371=lambda_case_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_lambda_case_expr.add(lambda_case_expr371.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:604:21: ( ( NL )? lambda_case_expr )*
                    loop158:
                    do {
                        int alt158=2;
                        int LA158_0 = input.LA(1);

                        if ( (LA158_0==NL) ) {
                            int LA158_1 = input.LA(2);

                            if ( (LA158_1==L_case) ) {
                                alt158=1;
                            }


                        }
                        else if ( (LA158_0==L_case) ) {
                            alt158=1;
                        }


                        switch (alt158) {
                    	case 1 :
                    	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:604:22: ( NL )? lambda_case_expr
                    	    {
                    	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:604:22: ( NL )?
                    	    int alt157=2;
                    	    int LA157_0 = input.LA(1);

                    	    if ( (LA157_0==NL) ) {
                    	        alt157=1;
                    	    }
                    	    switch (alt157) {
                    	        case 1 :
                    	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:604:22: NL
                    	            {
                    	            NL372=(Token)match(input,NL,FOLLOW_NL_in_lambda_cases4058); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_NL.add(NL372);


                    	            }
                    	            break;

                    	    }

                    	    pushFollow(FOLLOW_lambda_case_expr_in_lambda_cases4061);
                    	    lambda_case_expr373=lambda_case_expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_lambda_case_expr.add(lambda_case_expr373.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop158;
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
                    // 604:45: -> ^( CASES ( lambda_case_expr )+ )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:604:48: ^( CASES ( lambda_case_expr )+ )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:606:1: for_expr : L_for ( NL )? pattern ( NL )? L_in ( NL )? protected_expr ( NL )? L_do block L_end -> ^( FOR_EXPR pattern protected_expr block ) ;
    public final babel17Parser.for_expr_return for_expr() throws RecognitionException {
        babel17Parser.for_expr_return retval = new babel17Parser.for_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_for374=null;
        Token NL375=null;
        Token NL377=null;
        Token L_in378=null;
        Token NL379=null;
        Token NL381=null;
        Token L_do382=null;
        Token L_end384=null;
        babel17Parser.pattern_return pattern376 = null;

        babel17Parser.protected_expr_return protected_expr380 = null;

        babel17Parser.block_return block383 = null;


        CommonTree L_for374_tree=null;
        CommonTree NL375_tree=null;
        CommonTree NL377_tree=null;
        CommonTree L_in378_tree=null;
        CommonTree NL379_tree=null;
        CommonTree NL381_tree=null;
        CommonTree L_do382_tree=null;
        CommonTree L_end384_tree=null;
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleTokenStream stream_L_for=new RewriteRuleTokenStream(adaptor,"token L_for");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_in=new RewriteRuleTokenStream(adaptor,"token L_in");
        RewriteRuleTokenStream stream_L_do=new RewriteRuleTokenStream(adaptor,"token L_do");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_protected_expr=new RewriteRuleSubtreeStream(adaptor,"rule protected_expr");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:606:9: ( L_for ( NL )? pattern ( NL )? L_in ( NL )? protected_expr ( NL )? L_do block L_end -> ^( FOR_EXPR pattern protected_expr block ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:606:11: L_for ( NL )? pattern ( NL )? L_in ( NL )? protected_expr ( NL )? L_do block L_end
            {
            L_for374=(Token)match(input,L_for,FOLLOW_L_for_in_for_expr4079); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_for.add(L_for374);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:606:17: ( NL )?
            int alt160=2;
            int LA160_0 = input.LA(1);

            if ( (LA160_0==NL) ) {
                alt160=1;
            }
            switch (alt160) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:606:17: NL
                    {
                    NL375=(Token)match(input,NL,FOLLOW_NL_in_for_expr4081); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL375);


                    }
                    break;

            }

            pushFollow(FOLLOW_pattern_in_for_expr4084);
            pattern376=pattern();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pattern.add(pattern376.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:606:29: ( NL )?
            int alt161=2;
            int LA161_0 = input.LA(1);

            if ( (LA161_0==NL) ) {
                alt161=1;
            }
            switch (alt161) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:606:29: NL
                    {
                    NL377=(Token)match(input,NL,FOLLOW_NL_in_for_expr4086); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL377);


                    }
                    break;

            }

            L_in378=(Token)match(input,L_in,FOLLOW_L_in_in_for_expr4089); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_in.add(L_in378);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:606:38: ( NL )?
            int alt162=2;
            int LA162_0 = input.LA(1);

            if ( (LA162_0==NL) ) {
                alt162=1;
            }
            switch (alt162) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:606:38: NL
                    {
                    NL379=(Token)match(input,NL,FOLLOW_NL_in_for_expr4091); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL379);


                    }
                    break;

            }

            pushFollow(FOLLOW_protected_expr_in_for_expr4094);
            protected_expr380=protected_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr380.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:606:57: ( NL )?
            int alt163=2;
            int LA163_0 = input.LA(1);

            if ( (LA163_0==NL) ) {
                alt163=1;
            }
            switch (alt163) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:606:57: NL
                    {
                    NL381=(Token)match(input,NL,FOLLOW_NL_in_for_expr4096); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL381);


                    }
                    break;

            }

            L_do382=(Token)match(input,L_do,FOLLOW_L_do_in_for_expr4099); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_do.add(L_do382);

            pushFollow(FOLLOW_block_in_for_expr4101);
            block383=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block383.getTree());
            L_end384=(Token)match(input,L_end,FOLLOW_L_end_in_for_expr4103); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_end.add(L_end384);



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
            // 607:5: -> ^( FOR_EXPR pattern protected_expr block )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:607:8: ^( FOR_EXPR pattern protected_expr block )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:609:1: op_expr : ( builtin_primitive op_expr | bool_expr );
    public final babel17Parser.op_expr_return op_expr() throws RecognitionException {
        babel17Parser.op_expr_return retval = new babel17Parser.op_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.builtin_primitive_return builtin_primitive385 = null;

        babel17Parser.op_expr_return op_expr386 = null;

        babel17Parser.bool_expr_return bool_expr387 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:609:9: ( builtin_primitive op_expr | bool_expr )
            int alt164=2;
            int LA164_0 = input.LA(1);

            if ( (LA164_0==L_exception||(LA164_0>=L_concurrent && LA164_0<=L_lazy)||LA164_0==L_random||LA164_0==L_typeof||LA164_0==L_force) ) {
                alt164=1;
            }
            else if ( (LA164_0==L_begin||(LA164_0>=L_with && LA164_0<=L_if)||(LA164_0>=L_while && LA164_0<=L_for)||LA164_0==L_match||LA164_0==L_try||(LA164_0>=A_infinity && LA164_0<=U_infinity)||(LA164_0>=L_true && LA164_0<=L_this)||LA164_0==L_nil||LA164_0==MINUS||LA164_0==A_NOT||LA164_0==U_NOT||(LA164_0>=Constr && LA164_0<=Num)||(LA164_0>=String && LA164_0<=ROUND_BRACKET_OPEN)||LA164_0==SQUARE_BRACKET_OPEN||LA164_0==CURLY_BRACKET_OPEN) ) {
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:609:11: builtin_primitive op_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_builtin_primitive_in_op_expr4128);
                    builtin_primitive385=builtin_primitive();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(builtin_primitive385.getTree(), root_0);
                    pushFollow(FOLLOW_op_expr_in_op_expr4131);
                    op_expr386=op_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, op_expr386.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:610:4: bool_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_bool_expr_in_op_expr4136);
                    bool_expr387=bool_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_expr387.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:612:1: p_op_expr : ( builtin_primitive ( NL )? p_op_expr | p_bool_expr );
    public final babel17Parser.p_op_expr_return p_op_expr() throws RecognitionException {
        babel17Parser.p_op_expr_return retval = new babel17Parser.p_op_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL389=null;
        babel17Parser.builtin_primitive_return builtin_primitive388 = null;

        babel17Parser.p_op_expr_return p_op_expr390 = null;

        babel17Parser.p_bool_expr_return p_bool_expr391 = null;


        CommonTree NL389_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:613:2: ( builtin_primitive ( NL )? p_op_expr | p_bool_expr )
            int alt166=2;
            int LA166_0 = input.LA(1);

            if ( (LA166_0==L_exception||(LA166_0>=L_concurrent && LA166_0<=L_lazy)||LA166_0==L_random||LA166_0==L_typeof||LA166_0==L_force) ) {
                alt166=1;
            }
            else if ( (LA166_0==L_begin||(LA166_0>=L_with && LA166_0<=L_if)||(LA166_0>=L_while && LA166_0<=L_for)||LA166_0==L_match||LA166_0==L_try||(LA166_0>=A_infinity && LA166_0<=U_infinity)||(LA166_0>=L_true && LA166_0<=L_this)||LA166_0==L_nil||LA166_0==MINUS||LA166_0==A_NOT||LA166_0==U_NOT||(LA166_0>=Constr && LA166_0<=Num)||(LA166_0>=String && LA166_0<=ROUND_BRACKET_OPEN)||LA166_0==SQUARE_BRACKET_OPEN||LA166_0==CURLY_BRACKET_OPEN) ) {
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:613:4: builtin_primitive ( NL )? p_op_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_builtin_primitive_in_p_op_expr4146);
                    builtin_primitive388=builtin_primitive();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(builtin_primitive388.getTree(), root_0);
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:613:25: ( NL )?
                    int alt165=2;
                    int LA165_0 = input.LA(1);

                    if ( (LA165_0==NL) ) {
                        alt165=1;
                    }
                    switch (alt165) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:613:25: NL
                            {
                            NL389=(Token)match(input,NL,FOLLOW_NL_in_p_op_expr4149); if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_p_op_expr_in_p_op_expr4153);
                    p_op_expr390=p_op_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_op_expr390.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:614:4: p_bool_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_p_bool_expr_in_p_op_expr4158);
                    p_bool_expr391=p_bool_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_bool_expr391.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:617:1: builtin_primitive : ( L_random | L_exception | L_lazy | L_choose | L_concurrent | L_force | L_typeof );
    public final babel17Parser.builtin_primitive_return builtin_primitive() throws RecognitionException {
        babel17Parser.builtin_primitive_return retval = new babel17Parser.builtin_primitive_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set392=null;

        CommonTree set392_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:618:2: ( L_random | L_exception | L_lazy | L_choose | L_concurrent | L_force | L_typeof )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set392=(Token)input.LT(1);
            if ( input.LA(1)==L_exception||(input.LA(1)>=L_concurrent && input.LA(1)<=L_lazy)||input.LA(1)==L_random||input.LA(1)==L_typeof||input.LA(1)==L_force ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set392));
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:620:1: bool_expr : bool_or_expr ;
    public final babel17Parser.bool_expr_return bool_expr() throws RecognitionException {
        babel17Parser.bool_expr_return retval = new babel17Parser.bool_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.bool_or_expr_return bool_or_expr393 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:621:2: ( bool_or_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:621:4: bool_or_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bool_or_expr_in_bool_expr4202);
            bool_or_expr393=bool_or_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_or_expr393.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:623:1: p_bool_expr : p_bool_or_expr ;
    public final babel17Parser.p_bool_expr_return p_bool_expr() throws RecognitionException {
        babel17Parser.p_bool_expr_return retval = new babel17Parser.p_bool_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.p_bool_or_expr_return p_bool_or_expr394 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:624:2: ( p_bool_or_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:624:4: p_bool_or_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_bool_or_expr_in_p_bool_expr4212);
            p_bool_or_expr394=p_bool_or_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_bool_or_expr394.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:626:1: bool_or_expr : bool_and_expr ( ( NL )? token_OR ( NL )? bool_and_expr )* ;
    public final babel17Parser.bool_or_expr_return bool_or_expr() throws RecognitionException {
        babel17Parser.bool_or_expr_return retval = new babel17Parser.bool_or_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL396=null;
        Token NL398=null;
        babel17Parser.bool_and_expr_return bool_and_expr395 = null;

        babel17Parser.token_OR_return token_OR397 = null;

        babel17Parser.bool_and_expr_return bool_and_expr399 = null;


        CommonTree NL396_tree=null;
        CommonTree NL398_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:627:2: ( bool_and_expr ( ( NL )? token_OR ( NL )? bool_and_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:627:4: bool_and_expr ( ( NL )? token_OR ( NL )? bool_and_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bool_and_expr_in_bool_or_expr4221);
            bool_and_expr395=bool_and_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_and_expr395.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:627:18: ( ( NL )? token_OR ( NL )? bool_and_expr )*
            loop169:
            do {
                int alt169=2;
                int LA169_0 = input.LA(1);

                if ( (LA169_0==NL) ) {
                    int LA169_1 = input.LA(2);

                    if ( (LA169_1==A_OR||LA169_1==U_OR) ) {
                        alt169=1;
                    }


                }
                else if ( (LA169_0==A_OR||LA169_0==U_OR) ) {
                    alt169=1;
                }


                switch (alt169) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:627:19: ( NL )? token_OR ( NL )? bool_and_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:627:21: ( NL )?
            	    int alt167=2;
            	    int LA167_0 = input.LA(1);

            	    if ( (LA167_0==NL) ) {
            	        alt167=1;
            	    }
            	    switch (alt167) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:627:21: NL
            	            {
            	            NL396=(Token)match(input,NL,FOLLOW_NL_in_bool_or_expr4224); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_token_OR_in_bool_or_expr4228);
            	    token_OR397=token_OR();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(token_OR397.getTree(), root_0);
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:627:36: ( NL )?
            	    int alt168=2;
            	    int LA168_0 = input.LA(1);

            	    if ( (LA168_0==NL) ) {
            	        alt168=1;
            	    }
            	    switch (alt168) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:627:36: NL
            	            {
            	            NL398=(Token)match(input,NL,FOLLOW_NL_in_bool_or_expr4231); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_bool_and_expr_in_bool_or_expr4235);
            	    bool_and_expr399=bool_and_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_and_expr399.getTree());

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
    // $ANTLR end "bool_or_expr"

    public static class p_bool_or_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "p_bool_or_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:629:1: p_bool_or_expr : p_bool_and_expr ( ( NL )? token_OR ( NL )? p_bool_and_expr )* ;
    public final babel17Parser.p_bool_or_expr_return p_bool_or_expr() throws RecognitionException {
        babel17Parser.p_bool_or_expr_return retval = new babel17Parser.p_bool_or_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL401=null;
        Token NL403=null;
        babel17Parser.p_bool_and_expr_return p_bool_and_expr400 = null;

        babel17Parser.token_OR_return token_OR402 = null;

        babel17Parser.p_bool_and_expr_return p_bool_and_expr404 = null;


        CommonTree NL401_tree=null;
        CommonTree NL403_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:630:2: ( p_bool_and_expr ( ( NL )? token_OR ( NL )? p_bool_and_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:630:4: p_bool_and_expr ( ( NL )? token_OR ( NL )? p_bool_and_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_bool_and_expr_in_p_bool_or_expr4247);
            p_bool_and_expr400=p_bool_and_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_bool_and_expr400.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:630:20: ( ( NL )? token_OR ( NL )? p_bool_and_expr )*
            loop172:
            do {
                int alt172=2;
                int LA172_0 = input.LA(1);

                if ( (LA172_0==NL) ) {
                    int LA172_1 = input.LA(2);

                    if ( (LA172_1==A_OR||LA172_1==U_OR) ) {
                        alt172=1;
                    }


                }
                else if ( (LA172_0==A_OR||LA172_0==U_OR) ) {
                    alt172=1;
                }


                switch (alt172) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:630:21: ( NL )? token_OR ( NL )? p_bool_and_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:630:23: ( NL )?
            	    int alt170=2;
            	    int LA170_0 = input.LA(1);

            	    if ( (LA170_0==NL) ) {
            	        alt170=1;
            	    }
            	    switch (alt170) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:630:23: NL
            	            {
            	            NL401=(Token)match(input,NL,FOLLOW_NL_in_p_bool_or_expr4250); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_token_OR_in_p_bool_or_expr4254);
            	    token_OR402=token_OR();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(token_OR402.getTree(), root_0);
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:630:38: ( NL )?
            	    int alt171=2;
            	    int LA171_0 = input.LA(1);

            	    if ( (LA171_0==NL) ) {
            	        alt171=1;
            	    }
            	    switch (alt171) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:630:38: NL
            	            {
            	            NL403=(Token)match(input,NL,FOLLOW_NL_in_p_bool_or_expr4257); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_bool_and_expr_in_p_bool_or_expr4261);
            	    p_bool_and_expr404=p_bool_and_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_bool_and_expr404.getTree());

            	    }
            	    break;

            	default :
            	    break loop172;
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:632:1: bool_and_expr : bool_not_expr ( ( NL )? token_AND ( NL )? bool_not_expr )* ;
    public final babel17Parser.bool_and_expr_return bool_and_expr() throws RecognitionException {
        babel17Parser.bool_and_expr_return retval = new babel17Parser.bool_and_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL406=null;
        Token NL408=null;
        babel17Parser.bool_not_expr_return bool_not_expr405 = null;

        babel17Parser.token_AND_return token_AND407 = null;

        babel17Parser.bool_not_expr_return bool_not_expr409 = null;


        CommonTree NL406_tree=null;
        CommonTree NL408_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:633:2: ( bool_not_expr ( ( NL )? token_AND ( NL )? bool_not_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:633:4: bool_not_expr ( ( NL )? token_AND ( NL )? bool_not_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bool_not_expr_in_bool_and_expr4273);
            bool_not_expr405=bool_not_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_not_expr405.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:633:18: ( ( NL )? token_AND ( NL )? bool_not_expr )*
            loop175:
            do {
                int alt175=2;
                int LA175_0 = input.LA(1);

                if ( (LA175_0==NL) ) {
                    int LA175_1 = input.LA(2);

                    if ( (LA175_1==A_AND||LA175_1==U_AND) ) {
                        alt175=1;
                    }


                }
                else if ( (LA175_0==A_AND||LA175_0==U_AND) ) {
                    alt175=1;
                }


                switch (alt175) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:633:19: ( NL )? token_AND ( NL )? bool_not_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:633:21: ( NL )?
            	    int alt173=2;
            	    int LA173_0 = input.LA(1);

            	    if ( (LA173_0==NL) ) {
            	        alt173=1;
            	    }
            	    switch (alt173) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:633:21: NL
            	            {
            	            NL406=(Token)match(input,NL,FOLLOW_NL_in_bool_and_expr4276); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_token_AND_in_bool_and_expr4280);
            	    token_AND407=token_AND();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(token_AND407.getTree(), root_0);
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:633:37: ( NL )?
            	    int alt174=2;
            	    int LA174_0 = input.LA(1);

            	    if ( (LA174_0==NL) ) {
            	        alt174=1;
            	    }
            	    switch (alt174) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:633:37: NL
            	            {
            	            NL408=(Token)match(input,NL,FOLLOW_NL_in_bool_and_expr4283); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_bool_not_expr_in_bool_and_expr4287);
            	    bool_not_expr409=bool_not_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_not_expr409.getTree());

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
    // $ANTLR end "bool_and_expr"

    public static class p_bool_and_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "p_bool_and_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:635:1: p_bool_and_expr : p_bool_not_expr ( ( NL )? token_AND ( NL )? p_bool_not_expr )* ;
    public final babel17Parser.p_bool_and_expr_return p_bool_and_expr() throws RecognitionException {
        babel17Parser.p_bool_and_expr_return retval = new babel17Parser.p_bool_and_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL411=null;
        Token NL413=null;
        babel17Parser.p_bool_not_expr_return p_bool_not_expr410 = null;

        babel17Parser.token_AND_return token_AND412 = null;

        babel17Parser.p_bool_not_expr_return p_bool_not_expr414 = null;


        CommonTree NL411_tree=null;
        CommonTree NL413_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:636:2: ( p_bool_not_expr ( ( NL )? token_AND ( NL )? p_bool_not_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:636:4: p_bool_not_expr ( ( NL )? token_AND ( NL )? p_bool_not_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_bool_not_expr_in_p_bool_and_expr4299);
            p_bool_not_expr410=p_bool_not_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_bool_not_expr410.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:636:20: ( ( NL )? token_AND ( NL )? p_bool_not_expr )*
            loop178:
            do {
                int alt178=2;
                int LA178_0 = input.LA(1);

                if ( (LA178_0==NL) ) {
                    int LA178_1 = input.LA(2);

                    if ( (LA178_1==A_AND||LA178_1==U_AND) ) {
                        alt178=1;
                    }


                }
                else if ( (LA178_0==A_AND||LA178_0==U_AND) ) {
                    alt178=1;
                }


                switch (alt178) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:636:21: ( NL )? token_AND ( NL )? p_bool_not_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:636:23: ( NL )?
            	    int alt176=2;
            	    int LA176_0 = input.LA(1);

            	    if ( (LA176_0==NL) ) {
            	        alt176=1;
            	    }
            	    switch (alt176) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:636:23: NL
            	            {
            	            NL411=(Token)match(input,NL,FOLLOW_NL_in_p_bool_and_expr4302); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_token_AND_in_p_bool_and_expr4306);
            	    token_AND412=token_AND();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(token_AND412.getTree(), root_0);
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:636:39: ( NL )?
            	    int alt177=2;
            	    int LA177_0 = input.LA(1);

            	    if ( (LA177_0==NL) ) {
            	        alt177=1;
            	    }
            	    switch (alt177) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:636:39: NL
            	            {
            	            NL413=(Token)match(input,NL,FOLLOW_NL_in_p_bool_and_expr4309); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_bool_not_expr_in_p_bool_and_expr4313);
            	    p_bool_not_expr414=p_bool_not_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_bool_not_expr414.getTree());

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
    // $ANTLR end "p_bool_and_expr"

    public static class bool_not_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bool_not_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:639:1: bool_not_expr : ( token_NOT ( NL )? bool_not_expr | rel_expr );
    public final babel17Parser.bool_not_expr_return bool_not_expr() throws RecognitionException {
        babel17Parser.bool_not_expr_return retval = new babel17Parser.bool_not_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL416=null;
        babel17Parser.token_NOT_return token_NOT415 = null;

        babel17Parser.bool_not_expr_return bool_not_expr417 = null;

        babel17Parser.rel_expr_return rel_expr418 = null;


        CommonTree NL416_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:640:2: ( token_NOT ( NL )? bool_not_expr | rel_expr )
            int alt180=2;
            int LA180_0 = input.LA(1);

            if ( (LA180_0==A_NOT||LA180_0==U_NOT) ) {
                alt180=1;
            }
            else if ( (LA180_0==L_begin||(LA180_0>=L_with && LA180_0<=L_if)||(LA180_0>=L_while && LA180_0<=L_for)||LA180_0==L_match||LA180_0==L_try||(LA180_0>=A_infinity && LA180_0<=U_infinity)||(LA180_0>=L_true && LA180_0<=L_this)||LA180_0==L_nil||LA180_0==MINUS||(LA180_0>=Constr && LA180_0<=Num)||(LA180_0>=String && LA180_0<=ROUND_BRACKET_OPEN)||LA180_0==SQUARE_BRACKET_OPEN||LA180_0==CURLY_BRACKET_OPEN) ) {
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:640:4: token_NOT ( NL )? bool_not_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_NOT_in_bool_not_expr4325);
                    token_NOT415=token_NOT();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(token_NOT415.getTree(), root_0);
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:640:17: ( NL )?
                    int alt179=2;
                    int LA179_0 = input.LA(1);

                    if ( (LA179_0==NL) ) {
                        alt179=1;
                    }
                    switch (alt179) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:640:17: NL
                            {
                            NL416=(Token)match(input,NL,FOLLOW_NL_in_bool_not_expr4328); if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_bool_not_expr_in_bool_not_expr4332);
                    bool_not_expr417=bool_not_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_not_expr417.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:641:4: rel_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_rel_expr_in_bool_not_expr4337);
                    rel_expr418=rel_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rel_expr418.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:643:1: p_bool_not_expr : ( token_NOT ( NL )? p_bool_not_expr | p_rel_expr );
    public final babel17Parser.p_bool_not_expr_return p_bool_not_expr() throws RecognitionException {
        babel17Parser.p_bool_not_expr_return retval = new babel17Parser.p_bool_not_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL420=null;
        babel17Parser.token_NOT_return token_NOT419 = null;

        babel17Parser.p_bool_not_expr_return p_bool_not_expr421 = null;

        babel17Parser.p_rel_expr_return p_rel_expr422 = null;


        CommonTree NL420_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:644:2: ( token_NOT ( NL )? p_bool_not_expr | p_rel_expr )
            int alt182=2;
            int LA182_0 = input.LA(1);

            if ( (LA182_0==A_NOT||LA182_0==U_NOT) ) {
                alt182=1;
            }
            else if ( (LA182_0==L_begin||(LA182_0>=L_with && LA182_0<=L_if)||(LA182_0>=L_while && LA182_0<=L_for)||LA182_0==L_match||LA182_0==L_try||(LA182_0>=A_infinity && LA182_0<=U_infinity)||(LA182_0>=L_true && LA182_0<=L_this)||LA182_0==L_nil||LA182_0==MINUS||(LA182_0>=Constr && LA182_0<=Num)||(LA182_0>=String && LA182_0<=ROUND_BRACKET_OPEN)||LA182_0==SQUARE_BRACKET_OPEN||LA182_0==CURLY_BRACKET_OPEN) ) {
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:644:4: token_NOT ( NL )? p_bool_not_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_NOT_in_p_bool_not_expr4348);
                    token_NOT419=token_NOT();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(token_NOT419.getTree(), root_0);
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:644:17: ( NL )?
                    int alt181=2;
                    int LA181_0 = input.LA(1);

                    if ( (LA181_0==NL) ) {
                        alt181=1;
                    }
                    switch (alt181) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:644:17: NL
                            {
                            NL420=(Token)match(input,NL,FOLLOW_NL_in_p_bool_not_expr4351); if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_p_bool_not_expr_in_p_bool_not_expr4355);
                    p_bool_not_expr421=p_bool_not_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_bool_not_expr421.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:645:4: p_rel_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_p_rel_expr_in_p_bool_not_expr4360);
                    p_rel_expr422=p_rel_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_rel_expr422.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:647:1: rel_expr : arith_expr ( ( NL )? rel_op ( NL )? arith_expr )* -> ^( COMPARE arith_expr ( rel_op arith_expr )* ) ;
    public final babel17Parser.rel_expr_return rel_expr() throws RecognitionException {
        babel17Parser.rel_expr_return retval = new babel17Parser.rel_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL424=null;
        Token NL426=null;
        babel17Parser.arith_expr_return arith_expr423 = null;

        babel17Parser.rel_op_return rel_op425 = null;

        babel17Parser.arith_expr_return arith_expr427 = null;


        CommonTree NL424_tree=null;
        CommonTree NL426_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_arith_expr=new RewriteRuleSubtreeStream(adaptor,"rule arith_expr");
        RewriteRuleSubtreeStream stream_rel_op=new RewriteRuleSubtreeStream(adaptor,"rule rel_op");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:648:2: ( arith_expr ( ( NL )? rel_op ( NL )? arith_expr )* -> ^( COMPARE arith_expr ( rel_op arith_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:648:4: arith_expr ( ( NL )? rel_op ( NL )? arith_expr )*
            {
            pushFollow(FOLLOW_arith_expr_in_rel_expr4369);
            arith_expr423=arith_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_arith_expr.add(arith_expr423.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:648:15: ( ( NL )? rel_op ( NL )? arith_expr )*
            loop185:
            do {
                int alt185=2;
                int LA185_0 = input.LA(1);

                if ( (LA185_0==NL) ) {
                    int LA185_1 = input.LA(2);

                    if ( ((LA185_1>=A_EQUAL && LA185_1<=U_GREATER_EQ)) ) {
                        alt185=1;
                    }


                }
                else if ( ((LA185_0>=A_EQUAL && LA185_0<=U_GREATER_EQ)) ) {
                    alt185=1;
                }


                switch (alt185) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:648:16: ( NL )? rel_op ( NL )? arith_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:648:16: ( NL )?
            	    int alt183=2;
            	    int LA183_0 = input.LA(1);

            	    if ( (LA183_0==NL) ) {
            	        alt183=1;
            	    }
            	    switch (alt183) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:648:16: NL
            	            {
            	            NL424=(Token)match(input,NL,FOLLOW_NL_in_rel_expr4372); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL424);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_rel_op_in_rel_expr4375);
            	    rel_op425=rel_op();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_rel_op.add(rel_op425.getTree());
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:648:27: ( NL )?
            	    int alt184=2;
            	    int LA184_0 = input.LA(1);

            	    if ( (LA184_0==NL) ) {
            	        alt184=1;
            	    }
            	    switch (alt184) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:648:27: NL
            	            {
            	            NL426=(Token)match(input,NL,FOLLOW_NL_in_rel_expr4377); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL426);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_arith_expr_in_rel_expr4380);
            	    arith_expr427=arith_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_arith_expr.add(arith_expr427.getTree());

            	    }
            	    break;

            	default :
            	    break loop185;
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
            // 648:44: -> ^( COMPARE arith_expr ( rel_op arith_expr )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:648:47: ^( COMPARE arith_expr ( rel_op arith_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COMPARE, "COMPARE"), root_1);

                adaptor.addChild(root_1, stream_arith_expr.nextTree());
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:648:68: ( rel_op arith_expr )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:650:1: p_rel_expr : p_arith_expr ( ( NL )? rel_op ( NL )? p_arith_expr )* -> ^( COMPARE p_arith_expr ( rel_op p_arith_expr )* ) ;
    public final babel17Parser.p_rel_expr_return p_rel_expr() throws RecognitionException {
        babel17Parser.p_rel_expr_return retval = new babel17Parser.p_rel_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL429=null;
        Token NL431=null;
        babel17Parser.p_arith_expr_return p_arith_expr428 = null;

        babel17Parser.rel_op_return rel_op430 = null;

        babel17Parser.p_arith_expr_return p_arith_expr432 = null;


        CommonTree NL429_tree=null;
        CommonTree NL431_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_p_arith_expr=new RewriteRuleSubtreeStream(adaptor,"rule p_arith_expr");
        RewriteRuleSubtreeStream stream_rel_op=new RewriteRuleSubtreeStream(adaptor,"rule rel_op");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:651:2: ( p_arith_expr ( ( NL )? rel_op ( NL )? p_arith_expr )* -> ^( COMPARE p_arith_expr ( rel_op p_arith_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:651:4: p_arith_expr ( ( NL )? rel_op ( NL )? p_arith_expr )*
            {
            pushFollow(FOLLOW_p_arith_expr_in_p_rel_expr4407);
            p_arith_expr428=p_arith_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_p_arith_expr.add(p_arith_expr428.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:651:17: ( ( NL )? rel_op ( NL )? p_arith_expr )*
            loop188:
            do {
                int alt188=2;
                int LA188_0 = input.LA(1);

                if ( (LA188_0==NL) ) {
                    int LA188_1 = input.LA(2);

                    if ( ((LA188_1>=A_EQUAL && LA188_1<=U_GREATER_EQ)) ) {
                        alt188=1;
                    }


                }
                else if ( ((LA188_0>=A_EQUAL && LA188_0<=U_GREATER_EQ)) ) {
                    alt188=1;
                }


                switch (alt188) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:651:18: ( NL )? rel_op ( NL )? p_arith_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:651:18: ( NL )?
            	    int alt186=2;
            	    int LA186_0 = input.LA(1);

            	    if ( (LA186_0==NL) ) {
            	        alt186=1;
            	    }
            	    switch (alt186) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:651:18: NL
            	            {
            	            NL429=(Token)match(input,NL,FOLLOW_NL_in_p_rel_expr4410); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL429);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_rel_op_in_p_rel_expr4413);
            	    rel_op430=rel_op();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_rel_op.add(rel_op430.getTree());
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:651:29: ( NL )?
            	    int alt187=2;
            	    int LA187_0 = input.LA(1);

            	    if ( (LA187_0==NL) ) {
            	        alt187=1;
            	    }
            	    switch (alt187) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:651:29: NL
            	            {
            	            NL431=(Token)match(input,NL,FOLLOW_NL_in_p_rel_expr4415); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL431);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_arith_expr_in_p_rel_expr4418);
            	    p_arith_expr432=p_arith_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_p_arith_expr.add(p_arith_expr432.getTree());

            	    }
            	    break;

            	default :
            	    break loop188;
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
            // 651:48: -> ^( COMPARE p_arith_expr ( rel_op p_arith_expr )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:651:51: ^( COMPARE p_arith_expr ( rel_op p_arith_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COMPARE, "COMPARE"), root_1);

                adaptor.addChild(root_1, stream_p_arith_expr.nextTree());
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:651:74: ( rel_op p_arith_expr )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:654:1: rel_op : ( token_EQUAL | token_NOT_EQUAL | GREATER | token_GREATER_EQ | LESS | token_LESS_EQ );
    public final babel17Parser.rel_op_return rel_op() throws RecognitionException {
        babel17Parser.rel_op_return retval = new babel17Parser.rel_op_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token GREATER435=null;
        Token LESS437=null;
        babel17Parser.token_EQUAL_return token_EQUAL433 = null;

        babel17Parser.token_NOT_EQUAL_return token_NOT_EQUAL434 = null;

        babel17Parser.token_GREATER_EQ_return token_GREATER_EQ436 = null;

        babel17Parser.token_LESS_EQ_return token_LESS_EQ438 = null;


        CommonTree GREATER435_tree=null;
        CommonTree LESS437_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:654:8: ( token_EQUAL | token_NOT_EQUAL | GREATER | token_GREATER_EQ | LESS | token_LESS_EQ )
            int alt189=6;
            switch ( input.LA(1) ) {
            case A_EQUAL:
            case U_EQUAL:
                {
                alt189=1;
                }
                break;
            case A_NOT_EQUAL:
            case U_NOT_EQUAL:
                {
                alt189=2;
                }
                break;
            case GREATER:
                {
                alt189=3;
                }
                break;
            case A_GREATER_EQ:
            case U_GREATER_EQ:
                {
                alt189=4;
                }
                break;
            case LESS:
                {
                alt189=5;
                }
                break;
            case A_LESS_EQ:
            case U_LESS_EQ:
                {
                alt189=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 189, 0, input);

                throw nvae;
            }

            switch (alt189) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:654:10: token_EQUAL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_EQUAL_in_rel_op4444);
                    token_EQUAL433=token_EQUAL();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, token_EQUAL433.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:654:24: token_NOT_EQUAL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_NOT_EQUAL_in_rel_op4448);
                    token_NOT_EQUAL434=token_NOT_EQUAL();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, token_NOT_EQUAL434.getTree());

                    }
                    break;
                case 3 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:654:42: GREATER
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    GREATER435=(Token)match(input,GREATER,FOLLOW_GREATER_in_rel_op4452); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    GREATER435_tree = (CommonTree)adaptor.create(GREATER435);
                    adaptor.addChild(root_0, GREATER435_tree);
                    }

                    }
                    break;
                case 4 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:654:52: token_GREATER_EQ
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_GREATER_EQ_in_rel_op4456);
                    token_GREATER_EQ436=token_GREATER_EQ();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, token_GREATER_EQ436.getTree());

                    }
                    break;
                case 5 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:654:71: LESS
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    LESS437=(Token)match(input,LESS,FOLLOW_LESS_in_rel_op4460); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LESS437_tree = (CommonTree)adaptor.create(LESS437);
                    adaptor.addChild(root_0, LESS437_tree);
                    }

                    }
                    break;
                case 6 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:654:78: token_LESS_EQ
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_LESS_EQ_in_rel_op4464);
                    token_LESS_EQ438=token_LESS_EQ();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, token_LESS_EQ438.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:657:1: arith_expr : plusplus_expr ;
    public final babel17Parser.arith_expr_return arith_expr() throws RecognitionException {
        babel17Parser.arith_expr_return retval = new babel17Parser.arith_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.plusplus_expr_return plusplus_expr439 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:658:2: ( plusplus_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:658:4: plusplus_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_plusplus_expr_in_arith_expr4476);
            plusplus_expr439=plusplus_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, plusplus_expr439.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:661:1: p_arith_expr : p_plusplus_expr ;
    public final babel17Parser.p_arith_expr_return p_arith_expr() throws RecognitionException {
        babel17Parser.p_arith_expr_return retval = new babel17Parser.p_arith_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.p_plusplus_expr_return p_plusplus_expr440 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:662:2: ( p_plusplus_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:662:4: p_plusplus_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_plusplus_expr_in_p_arith_expr4486);
            p_plusplus_expr440=p_plusplus_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_plusplus_expr440.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:664:1: plusplus_expr : timestimes_expr ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? timestimes_expr )* ;
    public final babel17Parser.plusplus_expr_return plusplus_expr() throws RecognitionException {
        babel17Parser.plusplus_expr_return retval = new babel17Parser.plusplus_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL442=null;
        Token PLUSPLUS443=null;
        Token MINUSMINUS444=null;
        Token NL445=null;
        babel17Parser.timestimes_expr_return timestimes_expr441 = null;

        babel17Parser.timestimes_expr_return timestimes_expr446 = null;


        CommonTree NL442_tree=null;
        CommonTree PLUSPLUS443_tree=null;
        CommonTree MINUSMINUS444_tree=null;
        CommonTree NL445_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:665:2: ( timestimes_expr ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? timestimes_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:665:4: timestimes_expr ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? timestimes_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_timestimes_expr_in_plusplus_expr4496);
            timestimes_expr441=timestimes_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, timestimes_expr441.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:665:20: ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? timestimes_expr )*
            loop193:
            do {
                int alt193=2;
                int LA193_0 = input.LA(1);

                if ( (LA193_0==NL) ) {
                    int LA193_1 = input.LA(2);

                    if ( ((LA193_1>=PLUSPLUS && LA193_1<=MINUSMINUS)) ) {
                        alt193=1;
                    }


                }
                else if ( ((LA193_0>=PLUSPLUS && LA193_0<=MINUSMINUS)) ) {
                    alt193=1;
                }


                switch (alt193) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:665:21: ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? timestimes_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:665:23: ( NL )?
            	    int alt190=2;
            	    int LA190_0 = input.LA(1);

            	    if ( (LA190_0==NL) ) {
            	        alt190=1;
            	    }
            	    switch (alt190) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:665:23: NL
            	            {
            	            NL442=(Token)match(input,NL,FOLLOW_NL_in_plusplus_expr4499); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:665:26: ( PLUSPLUS | MINUSMINUS )
            	    int alt191=2;
            	    int LA191_0 = input.LA(1);

            	    if ( (LA191_0==PLUSPLUS) ) {
            	        alt191=1;
            	    }
            	    else if ( (LA191_0==MINUSMINUS) ) {
            	        alt191=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 191, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt191) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:665:27: PLUSPLUS
            	            {
            	            PLUSPLUS443=(Token)match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_plusplus_expr4504); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PLUSPLUS443_tree = (CommonTree)adaptor.create(PLUSPLUS443);
            	            root_0 = (CommonTree)adaptor.becomeRoot(PLUSPLUS443_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:665:37: MINUSMINUS
            	            {
            	            MINUSMINUS444=(Token)match(input,MINUSMINUS,FOLLOW_MINUSMINUS_in_plusplus_expr4507); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            MINUSMINUS444_tree = (CommonTree)adaptor.create(MINUSMINUS444);
            	            root_0 = (CommonTree)adaptor.becomeRoot(MINUSMINUS444_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:665:52: ( NL )?
            	    int alt192=2;
            	    int LA192_0 = input.LA(1);

            	    if ( (LA192_0==NL) ) {
            	        alt192=1;
            	    }
            	    switch (alt192) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:665:52: NL
            	            {
            	            NL445=(Token)match(input,NL,FOLLOW_NL_in_plusplus_expr4511); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_timestimes_expr_in_plusplus_expr4515);
            	    timestimes_expr446=timestimes_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, timestimes_expr446.getTree());

            	    }
            	    break;

            	default :
            	    break loop193;
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:667:1: p_plusplus_expr : p_timestimes_expr ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? p_timestimes_expr )* ;
    public final babel17Parser.p_plusplus_expr_return p_plusplus_expr() throws RecognitionException {
        babel17Parser.p_plusplus_expr_return retval = new babel17Parser.p_plusplus_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL448=null;
        Token PLUSPLUS449=null;
        Token MINUSMINUS450=null;
        Token NL451=null;
        babel17Parser.p_timestimes_expr_return p_timestimes_expr447 = null;

        babel17Parser.p_timestimes_expr_return p_timestimes_expr452 = null;


        CommonTree NL448_tree=null;
        CommonTree PLUSPLUS449_tree=null;
        CommonTree MINUSMINUS450_tree=null;
        CommonTree NL451_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:668:2: ( p_timestimes_expr ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? p_timestimes_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:668:4: p_timestimes_expr ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? p_timestimes_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_timestimes_expr_in_p_plusplus_expr4527);
            p_timestimes_expr447=p_timestimes_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_timestimes_expr447.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:668:22: ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? p_timestimes_expr )*
            loop197:
            do {
                int alt197=2;
                int LA197_0 = input.LA(1);

                if ( (LA197_0==NL) ) {
                    int LA197_1 = input.LA(2);

                    if ( ((LA197_1>=PLUSPLUS && LA197_1<=MINUSMINUS)) ) {
                        alt197=1;
                    }


                }
                else if ( ((LA197_0>=PLUSPLUS && LA197_0<=MINUSMINUS)) ) {
                    alt197=1;
                }


                switch (alt197) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:668:23: ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? p_timestimes_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:668:25: ( NL )?
            	    int alt194=2;
            	    int LA194_0 = input.LA(1);

            	    if ( (LA194_0==NL) ) {
            	        alt194=1;
            	    }
            	    switch (alt194) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:668:25: NL
            	            {
            	            NL448=(Token)match(input,NL,FOLLOW_NL_in_p_plusplus_expr4530); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:668:28: ( PLUSPLUS | MINUSMINUS )
            	    int alt195=2;
            	    int LA195_0 = input.LA(1);

            	    if ( (LA195_0==PLUSPLUS) ) {
            	        alt195=1;
            	    }
            	    else if ( (LA195_0==MINUSMINUS) ) {
            	        alt195=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 195, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt195) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:668:29: PLUSPLUS
            	            {
            	            PLUSPLUS449=(Token)match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_p_plusplus_expr4535); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PLUSPLUS449_tree = (CommonTree)adaptor.create(PLUSPLUS449);
            	            root_0 = (CommonTree)adaptor.becomeRoot(PLUSPLUS449_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:668:39: MINUSMINUS
            	            {
            	            MINUSMINUS450=(Token)match(input,MINUSMINUS,FOLLOW_MINUSMINUS_in_p_plusplus_expr4538); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            MINUSMINUS450_tree = (CommonTree)adaptor.create(MINUSMINUS450);
            	            root_0 = (CommonTree)adaptor.becomeRoot(MINUSMINUS450_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:668:54: ( NL )?
            	    int alt196=2;
            	    int LA196_0 = input.LA(1);

            	    if ( (LA196_0==NL) ) {
            	        alt196=1;
            	    }
            	    switch (alt196) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:668:54: NL
            	            {
            	            NL451=(Token)match(input,NL,FOLLOW_NL_in_p_plusplus_expr4542); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_timestimes_expr_in_p_plusplus_expr4546);
            	    p_timestimes_expr452=p_timestimes_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_timestimes_expr452.getTree());

            	    }
            	    break;

            	default :
            	    break loop197;
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:671:1: timestimes_expr : simple_expr ( ( NL )? ( TIMESTIMES | QUOTIENTQUOTIENT ) ( NL )? simple_expr )* ;
    public final babel17Parser.timestimes_expr_return timestimes_expr() throws RecognitionException {
        babel17Parser.timestimes_expr_return retval = new babel17Parser.timestimes_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL454=null;
        Token TIMESTIMES455=null;
        Token QUOTIENTQUOTIENT456=null;
        Token NL457=null;
        babel17Parser.simple_expr_return simple_expr453 = null;

        babel17Parser.simple_expr_return simple_expr458 = null;


        CommonTree NL454_tree=null;
        CommonTree TIMESTIMES455_tree=null;
        CommonTree QUOTIENTQUOTIENT456_tree=null;
        CommonTree NL457_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:672:2: ( simple_expr ( ( NL )? ( TIMESTIMES | QUOTIENTQUOTIENT ) ( NL )? simple_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:672:4: simple_expr ( ( NL )? ( TIMESTIMES | QUOTIENTQUOTIENT ) ( NL )? simple_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_simple_expr_in_timestimes_expr4558);
            simple_expr453=simple_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, simple_expr453.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:672:16: ( ( NL )? ( TIMESTIMES | QUOTIENTQUOTIENT ) ( NL )? simple_expr )*
            loop201:
            do {
                int alt201=2;
                int LA201_0 = input.LA(1);

                if ( (LA201_0==NL) ) {
                    int LA201_1 = input.LA(2);

                    if ( ((LA201_1>=TIMESTIMES && LA201_1<=QUOTIENTQUOTIENT)) ) {
                        alt201=1;
                    }


                }
                else if ( ((LA201_0>=TIMESTIMES && LA201_0<=QUOTIENTQUOTIENT)) ) {
                    alt201=1;
                }


                switch (alt201) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:672:17: ( NL )? ( TIMESTIMES | QUOTIENTQUOTIENT ) ( NL )? simple_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:672:19: ( NL )?
            	    int alt198=2;
            	    int LA198_0 = input.LA(1);

            	    if ( (LA198_0==NL) ) {
            	        alt198=1;
            	    }
            	    switch (alt198) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:672:19: NL
            	            {
            	            NL454=(Token)match(input,NL,FOLLOW_NL_in_timestimes_expr4561); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:672:22: ( TIMESTIMES | QUOTIENTQUOTIENT )
            	    int alt199=2;
            	    int LA199_0 = input.LA(1);

            	    if ( (LA199_0==TIMESTIMES) ) {
            	        alt199=1;
            	    }
            	    else if ( (LA199_0==QUOTIENTQUOTIENT) ) {
            	        alt199=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 199, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt199) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:672:23: TIMESTIMES
            	            {
            	            TIMESTIMES455=(Token)match(input,TIMESTIMES,FOLLOW_TIMESTIMES_in_timestimes_expr4566); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            TIMESTIMES455_tree = (CommonTree)adaptor.create(TIMESTIMES455);
            	            root_0 = (CommonTree)adaptor.becomeRoot(TIMESTIMES455_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:672:35: QUOTIENTQUOTIENT
            	            {
            	            QUOTIENTQUOTIENT456=(Token)match(input,QUOTIENTQUOTIENT,FOLLOW_QUOTIENTQUOTIENT_in_timestimes_expr4569); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            QUOTIENTQUOTIENT456_tree = (CommonTree)adaptor.create(QUOTIENTQUOTIENT456);
            	            root_0 = (CommonTree)adaptor.becomeRoot(QUOTIENTQUOTIENT456_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:672:56: ( NL )?
            	    int alt200=2;
            	    int LA200_0 = input.LA(1);

            	    if ( (LA200_0==NL) ) {
            	        alt200=1;
            	    }
            	    switch (alt200) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:672:56: NL
            	            {
            	            NL457=(Token)match(input,NL,FOLLOW_NL_in_timestimes_expr4573); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_simple_expr_in_timestimes_expr4577);
            	    simple_expr458=simple_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, simple_expr458.getTree());

            	    }
            	    break;

            	default :
            	    break loop201;
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:674:1: p_timestimes_expr : p_simple_expr ( ( NL )? ( TIMESTIMES | QUOTIENTQUOTIENT ) ( NL )? p_simple_expr )* ;
    public final babel17Parser.p_timestimes_expr_return p_timestimes_expr() throws RecognitionException {
        babel17Parser.p_timestimes_expr_return retval = new babel17Parser.p_timestimes_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL460=null;
        Token TIMESTIMES461=null;
        Token QUOTIENTQUOTIENT462=null;
        Token NL463=null;
        babel17Parser.p_simple_expr_return p_simple_expr459 = null;

        babel17Parser.p_simple_expr_return p_simple_expr464 = null;


        CommonTree NL460_tree=null;
        CommonTree TIMESTIMES461_tree=null;
        CommonTree QUOTIENTQUOTIENT462_tree=null;
        CommonTree NL463_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:675:2: ( p_simple_expr ( ( NL )? ( TIMESTIMES | QUOTIENTQUOTIENT ) ( NL )? p_simple_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:675:4: p_simple_expr ( ( NL )? ( TIMESTIMES | QUOTIENTQUOTIENT ) ( NL )? p_simple_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_simple_expr_in_p_timestimes_expr4590);
            p_simple_expr459=p_simple_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_simple_expr459.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:675:18: ( ( NL )? ( TIMESTIMES | QUOTIENTQUOTIENT ) ( NL )? p_simple_expr )*
            loop205:
            do {
                int alt205=2;
                int LA205_0 = input.LA(1);

                if ( (LA205_0==NL) ) {
                    int LA205_1 = input.LA(2);

                    if ( ((LA205_1>=TIMESTIMES && LA205_1<=QUOTIENTQUOTIENT)) ) {
                        alt205=1;
                    }


                }
                else if ( ((LA205_0>=TIMESTIMES && LA205_0<=QUOTIENTQUOTIENT)) ) {
                    alt205=1;
                }


                switch (alt205) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:675:19: ( NL )? ( TIMESTIMES | QUOTIENTQUOTIENT ) ( NL )? p_simple_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:675:21: ( NL )?
            	    int alt202=2;
            	    int LA202_0 = input.LA(1);

            	    if ( (LA202_0==NL) ) {
            	        alt202=1;
            	    }
            	    switch (alt202) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:675:21: NL
            	            {
            	            NL460=(Token)match(input,NL,FOLLOW_NL_in_p_timestimes_expr4593); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:675:24: ( TIMESTIMES | QUOTIENTQUOTIENT )
            	    int alt203=2;
            	    int LA203_0 = input.LA(1);

            	    if ( (LA203_0==TIMESTIMES) ) {
            	        alt203=1;
            	    }
            	    else if ( (LA203_0==QUOTIENTQUOTIENT) ) {
            	        alt203=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 203, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt203) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:675:25: TIMESTIMES
            	            {
            	            TIMESTIMES461=(Token)match(input,TIMESTIMES,FOLLOW_TIMESTIMES_in_p_timestimes_expr4598); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            TIMESTIMES461_tree = (CommonTree)adaptor.create(TIMESTIMES461);
            	            root_0 = (CommonTree)adaptor.becomeRoot(TIMESTIMES461_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:675:37: QUOTIENTQUOTIENT
            	            {
            	            QUOTIENTQUOTIENT462=(Token)match(input,QUOTIENTQUOTIENT,FOLLOW_QUOTIENTQUOTIENT_in_p_timestimes_expr4601); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            QUOTIENTQUOTIENT462_tree = (CommonTree)adaptor.create(QUOTIENTQUOTIENT462);
            	            root_0 = (CommonTree)adaptor.becomeRoot(QUOTIENTQUOTIENT462_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:675:58: ( NL )?
            	    int alt204=2;
            	    int LA204_0 = input.LA(1);

            	    if ( (LA204_0==NL) ) {
            	        alt204=1;
            	    }
            	    switch (alt204) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:675:58: NL
            	            {
            	            NL463=(Token)match(input,NL,FOLLOW_NL_in_p_timestimes_expr4605); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_simple_expr_in_p_timestimes_expr4609);
            	    p_simple_expr464=p_simple_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_simple_expr464.getTree());

            	    }
            	    break;

            	default :
            	    break loop205;
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:677:1: simple_expr : cons_expr ;
    public final babel17Parser.simple_expr_return simple_expr() throws RecognitionException {
        babel17Parser.simple_expr_return retval = new babel17Parser.simple_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.cons_expr_return cons_expr465 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:678:2: ( cons_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:678:4: cons_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_cons_expr_in_simple_expr4620);
            cons_expr465=cons_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, cons_expr465.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:680:1: p_simple_expr : p_cons_expr ;
    public final babel17Parser.p_simple_expr_return p_simple_expr() throws RecognitionException {
        babel17Parser.p_simple_expr_return retval = new babel17Parser.p_simple_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.p_cons_expr_return p_cons_expr466 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:681:2: ( p_cons_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:681:4: p_cons_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_cons_expr_in_p_simple_expr4629);
            p_cons_expr466=p_cons_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_cons_expr466.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:683:1: cons_expr : to_expr ( ( NL )? token_DOUBLE_COLON ( NL )? to_expr )* -> ^( LIST_CONS ( to_expr )* ) ;
    public final babel17Parser.cons_expr_return cons_expr() throws RecognitionException {
        babel17Parser.cons_expr_return retval = new babel17Parser.cons_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL468=null;
        Token NL470=null;
        babel17Parser.to_expr_return to_expr467 = null;

        babel17Parser.token_DOUBLE_COLON_return token_DOUBLE_COLON469 = null;

        babel17Parser.to_expr_return to_expr471 = null;


        CommonTree NL468_tree=null;
        CommonTree NL470_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_token_DOUBLE_COLON=new RewriteRuleSubtreeStream(adaptor,"rule token_DOUBLE_COLON");
        RewriteRuleSubtreeStream stream_to_expr=new RewriteRuleSubtreeStream(adaptor,"rule to_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:684:2: ( to_expr ( ( NL )? token_DOUBLE_COLON ( NL )? to_expr )* -> ^( LIST_CONS ( to_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:684:4: to_expr ( ( NL )? token_DOUBLE_COLON ( NL )? to_expr )*
            {
            pushFollow(FOLLOW_to_expr_in_cons_expr4638);
            to_expr467=to_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_to_expr.add(to_expr467.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:684:12: ( ( NL )? token_DOUBLE_COLON ( NL )? to_expr )*
            loop208:
            do {
                int alt208=2;
                int LA208_0 = input.LA(1);

                if ( (LA208_0==NL) ) {
                    int LA208_1 = input.LA(2);

                    if ( ((LA208_1>=A_DOUBLE_COLON && LA208_1<=U_DOUBLE_COLON)) ) {
                        alt208=1;
                    }


                }
                else if ( ((LA208_0>=A_DOUBLE_COLON && LA208_0<=U_DOUBLE_COLON)) ) {
                    alt208=1;
                }


                switch (alt208) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:684:13: ( NL )? token_DOUBLE_COLON ( NL )? to_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:684:13: ( NL )?
            	    int alt206=2;
            	    int LA206_0 = input.LA(1);

            	    if ( (LA206_0==NL) ) {
            	        alt206=1;
            	    }
            	    switch (alt206) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:684:13: NL
            	            {
            	            NL468=(Token)match(input,NL,FOLLOW_NL_in_cons_expr4641); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL468);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_token_DOUBLE_COLON_in_cons_expr4644);
            	    token_DOUBLE_COLON469=token_DOUBLE_COLON();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_token_DOUBLE_COLON.add(token_DOUBLE_COLON469.getTree());
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:684:36: ( NL )?
            	    int alt207=2;
            	    int LA207_0 = input.LA(1);

            	    if ( (LA207_0==NL) ) {
            	        alt207=1;
            	    }
            	    switch (alt207) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:684:36: NL
            	            {
            	            NL470=(Token)match(input,NL,FOLLOW_NL_in_cons_expr4646); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL470);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_to_expr_in_cons_expr4649);
            	    to_expr471=to_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_to_expr.add(to_expr471.getTree());

            	    }
            	    break;

            	default :
            	    break loop208;
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
            // 684:50: -> ^( LIST_CONS ( to_expr )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:684:53: ^( LIST_CONS ( to_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LIST_CONS, "LIST_CONS"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:684:65: ( to_expr )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:686:1: p_cons_expr : p_to_expr ( ( NL )? token_DOUBLE_COLON ( NL )? p_to_expr )* -> ^( LIST_CONS ( p_to_expr )* ) ;
    public final babel17Parser.p_cons_expr_return p_cons_expr() throws RecognitionException {
        babel17Parser.p_cons_expr_return retval = new babel17Parser.p_cons_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL473=null;
        Token NL475=null;
        babel17Parser.p_to_expr_return p_to_expr472 = null;

        babel17Parser.token_DOUBLE_COLON_return token_DOUBLE_COLON474 = null;

        babel17Parser.p_to_expr_return p_to_expr476 = null;


        CommonTree NL473_tree=null;
        CommonTree NL475_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_p_to_expr=new RewriteRuleSubtreeStream(adaptor,"rule p_to_expr");
        RewriteRuleSubtreeStream stream_token_DOUBLE_COLON=new RewriteRuleSubtreeStream(adaptor,"rule token_DOUBLE_COLON");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:687:2: ( p_to_expr ( ( NL )? token_DOUBLE_COLON ( NL )? p_to_expr )* -> ^( LIST_CONS ( p_to_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:687:4: p_to_expr ( ( NL )? token_DOUBLE_COLON ( NL )? p_to_expr )*
            {
            pushFollow(FOLLOW_p_to_expr_in_p_cons_expr4669);
            p_to_expr472=p_to_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_p_to_expr.add(p_to_expr472.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:687:14: ( ( NL )? token_DOUBLE_COLON ( NL )? p_to_expr )*
            loop211:
            do {
                int alt211=2;
                int LA211_0 = input.LA(1);

                if ( (LA211_0==NL) ) {
                    int LA211_1 = input.LA(2);

                    if ( ((LA211_1>=A_DOUBLE_COLON && LA211_1<=U_DOUBLE_COLON)) ) {
                        alt211=1;
                    }


                }
                else if ( ((LA211_0>=A_DOUBLE_COLON && LA211_0<=U_DOUBLE_COLON)) ) {
                    alt211=1;
                }


                switch (alt211) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:687:15: ( NL )? token_DOUBLE_COLON ( NL )? p_to_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:687:15: ( NL )?
            	    int alt209=2;
            	    int LA209_0 = input.LA(1);

            	    if ( (LA209_0==NL) ) {
            	        alt209=1;
            	    }
            	    switch (alt209) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:687:15: NL
            	            {
            	            NL473=(Token)match(input,NL,FOLLOW_NL_in_p_cons_expr4672); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL473);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_token_DOUBLE_COLON_in_p_cons_expr4675);
            	    token_DOUBLE_COLON474=token_DOUBLE_COLON();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_token_DOUBLE_COLON.add(token_DOUBLE_COLON474.getTree());
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:687:38: ( NL )?
            	    int alt210=2;
            	    int LA210_0 = input.LA(1);

            	    if ( (LA210_0==NL) ) {
            	        alt210=1;
            	    }
            	    switch (alt210) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:687:38: NL
            	            {
            	            NL475=(Token)match(input,NL,FOLLOW_NL_in_p_cons_expr4677); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL475);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_to_expr_in_p_cons_expr4680);
            	    p_to_expr476=p_to_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_p_to_expr.add(p_to_expr476.getTree());

            	    }
            	    break;

            	default :
            	    break loop211;
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
            // 687:54: -> ^( LIST_CONS ( p_to_expr )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:687:57: ^( LIST_CONS ( p_to_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LIST_CONS, "LIST_CONS"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:687:69: ( p_to_expr )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:690:1: to_expr : arith_plus_expr ( ( NL )? ( L_to | L_downto ) ( NL )? arith_plus_expr )? ;
    public final babel17Parser.to_expr_return to_expr() throws RecognitionException {
        babel17Parser.to_expr_return retval = new babel17Parser.to_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL478=null;
        Token L_to479=null;
        Token L_downto480=null;
        Token NL481=null;
        babel17Parser.arith_plus_expr_return arith_plus_expr477 = null;

        babel17Parser.arith_plus_expr_return arith_plus_expr482 = null;


        CommonTree NL478_tree=null;
        CommonTree L_to479_tree=null;
        CommonTree L_downto480_tree=null;
        CommonTree NL481_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:690:9: ( arith_plus_expr ( ( NL )? ( L_to | L_downto ) ( NL )? arith_plus_expr )? )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:690:11: arith_plus_expr ( ( NL )? ( L_to | L_downto ) ( NL )? arith_plus_expr )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_arith_plus_expr_in_to_expr4700);
            arith_plus_expr477=arith_plus_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, arith_plus_expr477.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:690:27: ( ( NL )? ( L_to | L_downto ) ( NL )? arith_plus_expr )?
            int alt215=2;
            int LA215_0 = input.LA(1);

            if ( (LA215_0==NL) ) {
                int LA215_1 = input.LA(2);

                if ( ((LA215_1>=L_to && LA215_1<=L_downto)) ) {
                    alt215=1;
                }
            }
            else if ( ((LA215_0>=L_to && LA215_0<=L_downto)) ) {
                alt215=1;
            }
            switch (alt215) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:690:28: ( NL )? ( L_to | L_downto ) ( NL )? arith_plus_expr
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:690:30: ( NL )?
                    int alt212=2;
                    int LA212_0 = input.LA(1);

                    if ( (LA212_0==NL) ) {
                        alt212=1;
                    }
                    switch (alt212) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:690:30: NL
                            {
                            NL478=(Token)match(input,NL,FOLLOW_NL_in_to_expr4703); if (state.failed) return retval;

                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:690:33: ( L_to | L_downto )
                    int alt213=2;
                    int LA213_0 = input.LA(1);

                    if ( (LA213_0==L_to) ) {
                        alt213=1;
                    }
                    else if ( (LA213_0==L_downto) ) {
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
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:690:34: L_to
                            {
                            L_to479=(Token)match(input,L_to,FOLLOW_L_to_in_to_expr4708); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            L_to479_tree = (CommonTree)adaptor.create(L_to479);
                            root_0 = (CommonTree)adaptor.becomeRoot(L_to479_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:690:41: L_downto
                            {
                            L_downto480=(Token)match(input,L_downto,FOLLOW_L_downto_in_to_expr4712); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            L_downto480_tree = (CommonTree)adaptor.create(L_downto480);
                            root_0 = (CommonTree)adaptor.becomeRoot(L_downto480_tree, root_0);
                            }

                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:690:54: ( NL )?
                    int alt214=2;
                    int LA214_0 = input.LA(1);

                    if ( (LA214_0==NL) ) {
                        alt214=1;
                    }
                    switch (alt214) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:690:54: NL
                            {
                            NL481=(Token)match(input,NL,FOLLOW_NL_in_to_expr4716); if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_arith_plus_expr_in_to_expr4720);
                    arith_plus_expr482=arith_plus_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arith_plus_expr482.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:692:1: p_to_expr : p_arith_plus_expr ( ( NL )? ( L_to | L_downto ) ( NL )? p_arith_plus_expr )? ;
    public final babel17Parser.p_to_expr_return p_to_expr() throws RecognitionException {
        babel17Parser.p_to_expr_return retval = new babel17Parser.p_to_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL484=null;
        Token L_to485=null;
        Token L_downto486=null;
        Token NL487=null;
        babel17Parser.p_arith_plus_expr_return p_arith_plus_expr483 = null;

        babel17Parser.p_arith_plus_expr_return p_arith_plus_expr488 = null;


        CommonTree NL484_tree=null;
        CommonTree L_to485_tree=null;
        CommonTree L_downto486_tree=null;
        CommonTree NL487_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:693:2: ( p_arith_plus_expr ( ( NL )? ( L_to | L_downto ) ( NL )? p_arith_plus_expr )? )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:693:4: p_arith_plus_expr ( ( NL )? ( L_to | L_downto ) ( NL )? p_arith_plus_expr )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_arith_plus_expr_in_p_to_expr4733);
            p_arith_plus_expr483=p_arith_plus_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_arith_plus_expr483.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:693:22: ( ( NL )? ( L_to | L_downto ) ( NL )? p_arith_plus_expr )?
            int alt219=2;
            int LA219_0 = input.LA(1);

            if ( (LA219_0==NL) ) {
                int LA219_1 = input.LA(2);

                if ( ((LA219_1>=L_to && LA219_1<=L_downto)) ) {
                    alt219=1;
                }
            }
            else if ( ((LA219_0>=L_to && LA219_0<=L_downto)) ) {
                alt219=1;
            }
            switch (alt219) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:693:23: ( NL )? ( L_to | L_downto ) ( NL )? p_arith_plus_expr
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:693:25: ( NL )?
                    int alt216=2;
                    int LA216_0 = input.LA(1);

                    if ( (LA216_0==NL) ) {
                        alt216=1;
                    }
                    switch (alt216) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:693:25: NL
                            {
                            NL484=(Token)match(input,NL,FOLLOW_NL_in_p_to_expr4736); if (state.failed) return retval;

                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:693:28: ( L_to | L_downto )
                    int alt217=2;
                    int LA217_0 = input.LA(1);

                    if ( (LA217_0==L_to) ) {
                        alt217=1;
                    }
                    else if ( (LA217_0==L_downto) ) {
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
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:693:29: L_to
                            {
                            L_to485=(Token)match(input,L_to,FOLLOW_L_to_in_p_to_expr4741); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            L_to485_tree = (CommonTree)adaptor.create(L_to485);
                            root_0 = (CommonTree)adaptor.becomeRoot(L_to485_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:693:36: L_downto
                            {
                            L_downto486=(Token)match(input,L_downto,FOLLOW_L_downto_in_p_to_expr4745); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            L_downto486_tree = (CommonTree)adaptor.create(L_downto486);
                            root_0 = (CommonTree)adaptor.becomeRoot(L_downto486_tree, root_0);
                            }

                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:693:49: ( NL )?
                    int alt218=2;
                    int LA218_0 = input.LA(1);

                    if ( (LA218_0==NL) ) {
                        alt218=1;
                    }
                    switch (alt218) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:693:49: NL
                            {
                            NL487=(Token)match(input,NL,FOLLOW_NL_in_p_to_expr4749); if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_p_arith_plus_expr_in_p_to_expr4753);
                    p_arith_plus_expr488=p_arith_plus_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_arith_plus_expr488.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:695:1: arith_plus_expr : arith_uminus_expr ( ( ( NL )? PLUS | MINUS ) ( NL )? arith_uminus_expr )* ;
    public final babel17Parser.arith_plus_expr_return arith_plus_expr() throws RecognitionException {
        babel17Parser.arith_plus_expr_return retval = new babel17Parser.arith_plus_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL490=null;
        Token PLUS491=null;
        Token MINUS492=null;
        Token NL493=null;
        babel17Parser.arith_uminus_expr_return arith_uminus_expr489 = null;

        babel17Parser.arith_uminus_expr_return arith_uminus_expr494 = null;


        CommonTree NL490_tree=null;
        CommonTree PLUS491_tree=null;
        CommonTree MINUS492_tree=null;
        CommonTree NL493_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:696:2: ( arith_uminus_expr ( ( ( NL )? PLUS | MINUS ) ( NL )? arith_uminus_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:696:4: arith_uminus_expr ( ( ( NL )? PLUS | MINUS ) ( NL )? arith_uminus_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_arith_uminus_expr_in_arith_plus_expr4765);
            arith_uminus_expr489=arith_uminus_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, arith_uminus_expr489.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:696:22: ( ( ( NL )? PLUS | MINUS ) ( NL )? arith_uminus_expr )*
            loop223:
            do {
                int alt223=2;
                int LA223_0 = input.LA(1);

                if ( (LA223_0==NL) ) {
                    int LA223_1 = input.LA(2);

                    if ( (LA223_1==PLUS) ) {
                        alt223=1;
                    }


                }
                else if ( ((LA223_0>=PLUS && LA223_0<=MINUS)) ) {
                    alt223=1;
                }


                switch (alt223) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:696:23: ( ( NL )? PLUS | MINUS ) ( NL )? arith_uminus_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:696:23: ( ( NL )? PLUS | MINUS )
            	    int alt221=2;
            	    int LA221_0 = input.LA(1);

            	    if ( (LA221_0==PLUS||LA221_0==NL) ) {
            	        alt221=1;
            	    }
            	    else if ( (LA221_0==MINUS) ) {
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
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:696:24: ( NL )? PLUS
            	            {
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:696:26: ( NL )?
            	            int alt220=2;
            	            int LA220_0 = input.LA(1);

            	            if ( (LA220_0==NL) ) {
            	                alt220=1;
            	            }
            	            switch (alt220) {
            	                case 1 :
            	                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:696:26: NL
            	                    {
            	                    NL490=(Token)match(input,NL,FOLLOW_NL_in_arith_plus_expr4769); if (state.failed) return retval;

            	                    }
            	                    break;

            	            }

            	            PLUS491=(Token)match(input,PLUS,FOLLOW_PLUS_in_arith_plus_expr4773); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PLUS491_tree = (CommonTree)adaptor.create(PLUS491);
            	            root_0 = (CommonTree)adaptor.becomeRoot(PLUS491_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:696:37: MINUS
            	            {
            	            MINUS492=(Token)match(input,MINUS,FOLLOW_MINUS_in_arith_plus_expr4778); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            MINUS492_tree = (CommonTree)adaptor.create(MINUS492);
            	            root_0 = (CommonTree)adaptor.becomeRoot(MINUS492_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:696:47: ( NL )?
            	    int alt222=2;
            	    int LA222_0 = input.LA(1);

            	    if ( (LA222_0==NL) ) {
            	        alt222=1;
            	    }
            	    switch (alt222) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:696:47: NL
            	            {
            	            NL493=(Token)match(input,NL,FOLLOW_NL_in_arith_plus_expr4782); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_arith_uminus_expr_in_arith_plus_expr4786);
            	    arith_uminus_expr494=arith_uminus_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, arith_uminus_expr494.getTree());

            	    }
            	    break;

            	default :
            	    break loop223;
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:698:1: p_arith_plus_expr : p_arith_uminus_expr ( ( NL )? ( PLUS | MINUS ) ( NL )? p_arith_uminus_expr )* ;
    public final babel17Parser.p_arith_plus_expr_return p_arith_plus_expr() throws RecognitionException {
        babel17Parser.p_arith_plus_expr_return retval = new babel17Parser.p_arith_plus_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL496=null;
        Token set497=null;
        Token NL498=null;
        babel17Parser.p_arith_uminus_expr_return p_arith_uminus_expr495 = null;

        babel17Parser.p_arith_uminus_expr_return p_arith_uminus_expr499 = null;


        CommonTree NL496_tree=null;
        CommonTree set497_tree=null;
        CommonTree NL498_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:699:2: ( p_arith_uminus_expr ( ( NL )? ( PLUS | MINUS ) ( NL )? p_arith_uminus_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:699:4: p_arith_uminus_expr ( ( NL )? ( PLUS | MINUS ) ( NL )? p_arith_uminus_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_arith_uminus_expr_in_p_arith_plus_expr4797);
            p_arith_uminus_expr495=p_arith_uminus_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_arith_uminus_expr495.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:699:24: ( ( NL )? ( PLUS | MINUS ) ( NL )? p_arith_uminus_expr )*
            loop226:
            do {
                int alt226=2;
                int LA226_0 = input.LA(1);

                if ( (LA226_0==NL) ) {
                    int LA226_1 = input.LA(2);

                    if ( ((LA226_1>=PLUS && LA226_1<=MINUS)) ) {
                        alt226=1;
                    }


                }
                else if ( ((LA226_0>=PLUS && LA226_0<=MINUS)) ) {
                    alt226=1;
                }


                switch (alt226) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:699:25: ( NL )? ( PLUS | MINUS ) ( NL )? p_arith_uminus_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:699:27: ( NL )?
            	    int alt224=2;
            	    int LA224_0 = input.LA(1);

            	    if ( (LA224_0==NL) ) {
            	        alt224=1;
            	    }
            	    switch (alt224) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:699:27: NL
            	            {
            	            NL496=(Token)match(input,NL,FOLLOW_NL_in_p_arith_plus_expr4800); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    set497=(Token)input.LT(1);
            	    set497=(Token)input.LT(1);
            	    if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set497), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:699:48: ( NL )?
            	    int alt225=2;
            	    int LA225_0 = input.LA(1);

            	    if ( (LA225_0==NL) ) {
            	        alt225=1;
            	    }
            	    switch (alt225) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:699:48: NL
            	            {
            	            NL498=(Token)match(input,NL,FOLLOW_NL_in_p_arith_plus_expr4813); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_arith_uminus_expr_in_p_arith_plus_expr4817);
            	    p_arith_uminus_expr499=p_arith_uminus_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_arith_uminus_expr499.getTree());

            	    }
            	    break;

            	default :
            	    break loop226;
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:701:1: arith_uminus_expr : ( MINUS ( NL )? arith_mult_expr -> ^( UMINUS arith_mult_expr ) | arith_mult_expr );
    public final babel17Parser.arith_uminus_expr_return arith_uminus_expr() throws RecognitionException {
        babel17Parser.arith_uminus_expr_return retval = new babel17Parser.arith_uminus_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token MINUS500=null;
        Token NL501=null;
        babel17Parser.arith_mult_expr_return arith_mult_expr502 = null;

        babel17Parser.arith_mult_expr_return arith_mult_expr503 = null;


        CommonTree MINUS500_tree=null;
        CommonTree NL501_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleSubtreeStream stream_arith_mult_expr=new RewriteRuleSubtreeStream(adaptor,"rule arith_mult_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:702:2: ( MINUS ( NL )? arith_mult_expr -> ^( UMINUS arith_mult_expr ) | arith_mult_expr )
            int alt228=2;
            int LA228_0 = input.LA(1);

            if ( (LA228_0==MINUS) ) {
                alt228=1;
            }
            else if ( (LA228_0==L_begin||(LA228_0>=L_with && LA228_0<=L_if)||(LA228_0>=L_while && LA228_0<=L_for)||LA228_0==L_match||LA228_0==L_try||(LA228_0>=A_infinity && LA228_0<=U_infinity)||(LA228_0>=L_true && LA228_0<=L_this)||LA228_0==L_nil||(LA228_0>=Constr && LA228_0<=Num)||(LA228_0>=String && LA228_0<=ROUND_BRACKET_OPEN)||LA228_0==SQUARE_BRACKET_OPEN||LA228_0==CURLY_BRACKET_OPEN) ) {
                alt228=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 228, 0, input);

                throw nvae;
            }
            switch (alt228) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:702:4: MINUS ( NL )? arith_mult_expr
                    {
                    MINUS500=(Token)match(input,MINUS,FOLLOW_MINUS_in_arith_uminus_expr4830); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(MINUS500);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:702:10: ( NL )?
                    int alt227=2;
                    int LA227_0 = input.LA(1);

                    if ( (LA227_0==NL) ) {
                        alt227=1;
                    }
                    switch (alt227) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:702:10: NL
                            {
                            NL501=(Token)match(input,NL,FOLLOW_NL_in_arith_uminus_expr4832); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL501);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_arith_mult_expr_in_arith_uminus_expr4835);
                    arith_mult_expr502=arith_mult_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_arith_mult_expr.add(arith_mult_expr502.getTree());


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
                    // 702:30: -> ^( UMINUS arith_mult_expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:702:33: ^( UMINUS arith_mult_expr )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:703:4: arith_mult_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_arith_mult_expr_in_arith_uminus_expr4848);
                    arith_mult_expr503=arith_mult_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arith_mult_expr503.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:705:1: p_arith_uminus_expr : ( MINUS ( NL )? p_arith_mult_expr -> ^( UMINUS p_arith_mult_expr ) | p_arith_mult_expr );
    public final babel17Parser.p_arith_uminus_expr_return p_arith_uminus_expr() throws RecognitionException {
        babel17Parser.p_arith_uminus_expr_return retval = new babel17Parser.p_arith_uminus_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token MINUS504=null;
        Token NL505=null;
        babel17Parser.p_arith_mult_expr_return p_arith_mult_expr506 = null;

        babel17Parser.p_arith_mult_expr_return p_arith_mult_expr507 = null;


        CommonTree MINUS504_tree=null;
        CommonTree NL505_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleSubtreeStream stream_p_arith_mult_expr=new RewriteRuleSubtreeStream(adaptor,"rule p_arith_mult_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:706:2: ( MINUS ( NL )? p_arith_mult_expr -> ^( UMINUS p_arith_mult_expr ) | p_arith_mult_expr )
            int alt230=2;
            int LA230_0 = input.LA(1);

            if ( (LA230_0==MINUS) ) {
                alt230=1;
            }
            else if ( (LA230_0==L_begin||(LA230_0>=L_with && LA230_0<=L_if)||(LA230_0>=L_while && LA230_0<=L_for)||LA230_0==L_match||LA230_0==L_try||(LA230_0>=A_infinity && LA230_0<=U_infinity)||(LA230_0>=L_true && LA230_0<=L_this)||LA230_0==L_nil||(LA230_0>=Constr && LA230_0<=Num)||(LA230_0>=String && LA230_0<=ROUND_BRACKET_OPEN)||LA230_0==SQUARE_BRACKET_OPEN||LA230_0==CURLY_BRACKET_OPEN) ) {
                alt230=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 230, 0, input);

                throw nvae;
            }
            switch (alt230) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:706:4: MINUS ( NL )? p_arith_mult_expr
                    {
                    MINUS504=(Token)match(input,MINUS,FOLLOW_MINUS_in_p_arith_uminus_expr4859); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(MINUS504);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:706:10: ( NL )?
                    int alt229=2;
                    int LA229_0 = input.LA(1);

                    if ( (LA229_0==NL) ) {
                        alt229=1;
                    }
                    switch (alt229) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:706:10: NL
                            {
                            NL505=(Token)match(input,NL,FOLLOW_NL_in_p_arith_uminus_expr4861); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL505);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_p_arith_mult_expr_in_p_arith_uminus_expr4864);
                    p_arith_mult_expr506=p_arith_mult_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_p_arith_mult_expr.add(p_arith_mult_expr506.getTree());


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
                    // 706:32: -> ^( UMINUS p_arith_mult_expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:706:35: ^( UMINUS p_arith_mult_expr )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:707:4: p_arith_mult_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_p_arith_mult_expr_in_p_arith_uminus_expr4877);
                    p_arith_mult_expr507=p_arith_mult_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_arith_mult_expr507.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:709:1: arith_mult_expr : arith_pow_expr ( ( NL )? ( TIMES | QUOTIENT | L_div | L_mod ) ( NL )? arith_pow_expr )* ;
    public final babel17Parser.arith_mult_expr_return arith_mult_expr() throws RecognitionException {
        babel17Parser.arith_mult_expr_return retval = new babel17Parser.arith_mult_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL509=null;
        Token set510=null;
        Token NL511=null;
        babel17Parser.arith_pow_expr_return arith_pow_expr508 = null;

        babel17Parser.arith_pow_expr_return arith_pow_expr512 = null;


        CommonTree NL509_tree=null;
        CommonTree set510_tree=null;
        CommonTree NL511_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:710:2: ( arith_pow_expr ( ( NL )? ( TIMES | QUOTIENT | L_div | L_mod ) ( NL )? arith_pow_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:710:4: arith_pow_expr ( ( NL )? ( TIMES | QUOTIENT | L_div | L_mod ) ( NL )? arith_pow_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_arith_pow_expr_in_arith_mult_expr4886);
            arith_pow_expr508=arith_pow_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, arith_pow_expr508.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:710:19: ( ( NL )? ( TIMES | QUOTIENT | L_div | L_mod ) ( NL )? arith_pow_expr )*
            loop233:
            do {
                int alt233=2;
                int LA233_0 = input.LA(1);

                if ( (LA233_0==NL) ) {
                    int LA233_1 = input.LA(2);

                    if ( ((LA233_1>=L_div && LA233_1<=L_mod)||(LA233_1>=TIMES && LA233_1<=QUOTIENT)) ) {
                        alt233=1;
                    }


                }
                else if ( ((LA233_0>=L_div && LA233_0<=L_mod)||(LA233_0>=TIMES && LA233_0<=QUOTIENT)) ) {
                    alt233=1;
                }


                switch (alt233) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:710:20: ( NL )? ( TIMES | QUOTIENT | L_div | L_mod ) ( NL )? arith_pow_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:710:22: ( NL )?
            	    int alt231=2;
            	    int LA231_0 = input.LA(1);

            	    if ( (LA231_0==NL) ) {
            	        alt231=1;
            	    }
            	    switch (alt231) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:710:22: NL
            	            {
            	            NL509=(Token)match(input,NL,FOLLOW_NL_in_arith_mult_expr4889); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    set510=(Token)input.LT(1);
            	    set510=(Token)input.LT(1);
            	    if ( (input.LA(1)>=L_div && input.LA(1)<=L_mod)||(input.LA(1)>=TIMES && input.LA(1)<=QUOTIENT) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set510), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:710:63: ( NL )?
            	    int alt232=2;
            	    int LA232_0 = input.LA(1);

            	    if ( (LA232_0==NL) ) {
            	        alt232=1;
            	    }
            	    switch (alt232) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:710:63: NL
            	            {
            	            NL511=(Token)match(input,NL,FOLLOW_NL_in_arith_mult_expr4910); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_arith_pow_expr_in_arith_mult_expr4914);
            	    arith_pow_expr512=arith_pow_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, arith_pow_expr512.getTree());

            	    }
            	    break;

            	default :
            	    break loop233;
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:712:1: p_arith_mult_expr : p_arith_pow_expr ( ( NL )? ( TIMES | QUOTIENT | L_div | L_mod ) ( NL )? p_arith_pow_expr )* ;
    public final babel17Parser.p_arith_mult_expr_return p_arith_mult_expr() throws RecognitionException {
        babel17Parser.p_arith_mult_expr_return retval = new babel17Parser.p_arith_mult_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL514=null;
        Token set515=null;
        Token NL516=null;
        babel17Parser.p_arith_pow_expr_return p_arith_pow_expr513 = null;

        babel17Parser.p_arith_pow_expr_return p_arith_pow_expr517 = null;


        CommonTree NL514_tree=null;
        CommonTree set515_tree=null;
        CommonTree NL516_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:713:2: ( p_arith_pow_expr ( ( NL )? ( TIMES | QUOTIENT | L_div | L_mod ) ( NL )? p_arith_pow_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:713:4: p_arith_pow_expr ( ( NL )? ( TIMES | QUOTIENT | L_div | L_mod ) ( NL )? p_arith_pow_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_arith_pow_expr_in_p_arith_mult_expr4926);
            p_arith_pow_expr513=p_arith_pow_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_arith_pow_expr513.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:713:21: ( ( NL )? ( TIMES | QUOTIENT | L_div | L_mod ) ( NL )? p_arith_pow_expr )*
            loop236:
            do {
                int alt236=2;
                int LA236_0 = input.LA(1);

                if ( (LA236_0==NL) ) {
                    int LA236_1 = input.LA(2);

                    if ( ((LA236_1>=L_div && LA236_1<=L_mod)||(LA236_1>=TIMES && LA236_1<=QUOTIENT)) ) {
                        alt236=1;
                    }


                }
                else if ( ((LA236_0>=L_div && LA236_0<=L_mod)||(LA236_0>=TIMES && LA236_0<=QUOTIENT)) ) {
                    alt236=1;
                }


                switch (alt236) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:713:22: ( NL )? ( TIMES | QUOTIENT | L_div | L_mod ) ( NL )? p_arith_pow_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:713:24: ( NL )?
            	    int alt234=2;
            	    int LA234_0 = input.LA(1);

            	    if ( (LA234_0==NL) ) {
            	        alt234=1;
            	    }
            	    switch (alt234) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:713:24: NL
            	            {
            	            NL514=(Token)match(input,NL,FOLLOW_NL_in_p_arith_mult_expr4929); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    set515=(Token)input.LT(1);
            	    set515=(Token)input.LT(1);
            	    if ( (input.LA(1)>=L_div && input.LA(1)<=L_mod)||(input.LA(1)>=TIMES && input.LA(1)<=QUOTIENT) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set515), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:713:65: ( NL )?
            	    int alt235=2;
            	    int LA235_0 = input.LA(1);

            	    if ( (LA235_0==NL) ) {
            	        alt235=1;
            	    }
            	    switch (alt235) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:713:65: NL
            	            {
            	            NL516=(Token)match(input,NL,FOLLOW_NL_in_p_arith_mult_expr4950); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_arith_pow_expr_in_p_arith_mult_expr4954);
            	    p_arith_pow_expr517=p_arith_pow_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_arith_pow_expr517.getTree());

            	    }
            	    break;

            	default :
            	    break loop236;
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:715:1: arith_pow_expr : apply_expr ( ( NL )? POW_tok ( NL )? apply_expr )* -> ^( POW ( apply_expr )* ) ;
    public final babel17Parser.arith_pow_expr_return arith_pow_expr() throws RecognitionException {
        babel17Parser.arith_pow_expr_return retval = new babel17Parser.arith_pow_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL519=null;
        Token POW_tok520=null;
        Token NL521=null;
        babel17Parser.apply_expr_return apply_expr518 = null;

        babel17Parser.apply_expr_return apply_expr522 = null;


        CommonTree NL519_tree=null;
        CommonTree POW_tok520_tree=null;
        CommonTree NL521_tree=null;
        RewriteRuleTokenStream stream_POW_tok=new RewriteRuleTokenStream(adaptor,"token POW_tok");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_apply_expr=new RewriteRuleSubtreeStream(adaptor,"rule apply_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:716:2: ( apply_expr ( ( NL )? POW_tok ( NL )? apply_expr )* -> ^( POW ( apply_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:716:4: apply_expr ( ( NL )? POW_tok ( NL )? apply_expr )*
            {
            pushFollow(FOLLOW_apply_expr_in_arith_pow_expr4965);
            apply_expr518=apply_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_apply_expr.add(apply_expr518.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:716:15: ( ( NL )? POW_tok ( NL )? apply_expr )*
            loop239:
            do {
                int alt239=2;
                int LA239_0 = input.LA(1);

                if ( (LA239_0==NL) ) {
                    int LA239_1 = input.LA(2);

                    if ( (LA239_1==POW_tok) ) {
                        alt239=1;
                    }


                }
                else if ( (LA239_0==POW_tok) ) {
                    alt239=1;
                }


                switch (alt239) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:716:16: ( NL )? POW_tok ( NL )? apply_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:716:16: ( NL )?
            	    int alt237=2;
            	    int LA237_0 = input.LA(1);

            	    if ( (LA237_0==NL) ) {
            	        alt237=1;
            	    }
            	    switch (alt237) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:716:16: NL
            	            {
            	            NL519=(Token)match(input,NL,FOLLOW_NL_in_arith_pow_expr4968); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL519);


            	            }
            	            break;

            	    }

            	    POW_tok520=(Token)match(input,POW_tok,FOLLOW_POW_tok_in_arith_pow_expr4971); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_POW_tok.add(POW_tok520);

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:716:28: ( NL )?
            	    int alt238=2;
            	    int LA238_0 = input.LA(1);

            	    if ( (LA238_0==NL) ) {
            	        alt238=1;
            	    }
            	    switch (alt238) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:716:28: NL
            	            {
            	            NL521=(Token)match(input,NL,FOLLOW_NL_in_arith_pow_expr4973); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL521);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_apply_expr_in_arith_pow_expr4976);
            	    apply_expr522=apply_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_apply_expr.add(apply_expr522.getTree());

            	    }
            	    break;

            	default :
            	    break loop239;
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
            // 716:45: -> ^( POW ( apply_expr )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:716:48: ^( POW ( apply_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(POW, "POW"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:716:54: ( apply_expr )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:718:1: p_arith_pow_expr : p_apply_expr ( ( NL )? POW_tok ( NL )? p_apply_expr )* -> ^( POW ( p_apply_expr )* ) ;
    public final babel17Parser.p_arith_pow_expr_return p_arith_pow_expr() throws RecognitionException {
        babel17Parser.p_arith_pow_expr_return retval = new babel17Parser.p_arith_pow_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL524=null;
        Token POW_tok525=null;
        Token NL526=null;
        babel17Parser.p_apply_expr_return p_apply_expr523 = null;

        babel17Parser.p_apply_expr_return p_apply_expr527 = null;


        CommonTree NL524_tree=null;
        CommonTree POW_tok525_tree=null;
        CommonTree NL526_tree=null;
        RewriteRuleTokenStream stream_POW_tok=new RewriteRuleTokenStream(adaptor,"token POW_tok");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_p_apply_expr=new RewriteRuleSubtreeStream(adaptor,"rule p_apply_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:719:2: ( p_apply_expr ( ( NL )? POW_tok ( NL )? p_apply_expr )* -> ^( POW ( p_apply_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:719:4: p_apply_expr ( ( NL )? POW_tok ( NL )? p_apply_expr )*
            {
            pushFollow(FOLLOW_p_apply_expr_in_p_arith_pow_expr4997);
            p_apply_expr523=p_apply_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_p_apply_expr.add(p_apply_expr523.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:719:17: ( ( NL )? POW_tok ( NL )? p_apply_expr )*
            loop242:
            do {
                int alt242=2;
                int LA242_0 = input.LA(1);

                if ( (LA242_0==NL) ) {
                    int LA242_1 = input.LA(2);

                    if ( (LA242_1==POW_tok) ) {
                        alt242=1;
                    }


                }
                else if ( (LA242_0==POW_tok) ) {
                    alt242=1;
                }


                switch (alt242) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:719:18: ( NL )? POW_tok ( NL )? p_apply_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:719:18: ( NL )?
            	    int alt240=2;
            	    int LA240_0 = input.LA(1);

            	    if ( (LA240_0==NL) ) {
            	        alt240=1;
            	    }
            	    switch (alt240) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:719:18: NL
            	            {
            	            NL524=(Token)match(input,NL,FOLLOW_NL_in_p_arith_pow_expr5000); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL524);


            	            }
            	            break;

            	    }

            	    POW_tok525=(Token)match(input,POW_tok,FOLLOW_POW_tok_in_p_arith_pow_expr5003); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_POW_tok.add(POW_tok525);

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:719:30: ( NL )?
            	    int alt241=2;
            	    int LA241_0 = input.LA(1);

            	    if ( (LA241_0==NL) ) {
            	        alt241=1;
            	    }
            	    switch (alt241) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:719:30: NL
            	            {
            	            NL526=(Token)match(input,NL,FOLLOW_NL_in_p_arith_pow_expr5005); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL526);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_apply_expr_in_p_arith_pow_expr5008);
            	    p_apply_expr527=p_apply_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_p_apply_expr.add(p_apply_expr527.getTree());

            	    }
            	    break;

            	default :
            	    break loop242;
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
            // 719:49: -> ^( POW ( p_apply_expr )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:719:52: ^( POW ( p_apply_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(POW, "POW"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:719:58: ( p_apply_expr )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:721:1: apply_expr : ( basic_expr )+ -> ^( APPLY ( basic_expr )* ) ;
    public final babel17Parser.apply_expr_return apply_expr() throws RecognitionException {
        babel17Parser.apply_expr_return retval = new babel17Parser.apply_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.basic_expr_return basic_expr528 = null;


        RewriteRuleSubtreeStream stream_basic_expr=new RewriteRuleSubtreeStream(adaptor,"rule basic_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:722:2: ( ( basic_expr )+ -> ^( APPLY ( basic_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:722:4: ( basic_expr )+
            {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:722:4: ( basic_expr )+
            int cnt243=0;
            loop243:
            do {
                int alt243=2;
                int LA243_0 = input.LA(1);

                if ( (LA243_0==L_begin||(LA243_0>=L_with && LA243_0<=L_if)||(LA243_0>=L_while && LA243_0<=L_for)||LA243_0==L_match||LA243_0==L_try||(LA243_0>=A_infinity && LA243_0<=U_infinity)||(LA243_0>=L_true && LA243_0<=L_this)||LA243_0==L_nil||(LA243_0>=Constr && LA243_0<=Num)||(LA243_0>=String && LA243_0<=ROUND_BRACKET_OPEN)||LA243_0==SQUARE_BRACKET_OPEN||LA243_0==CURLY_BRACKET_OPEN) ) {
                    alt243=1;
                }


                switch (alt243) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:722:4: basic_expr
            	    {
            	    pushFollow(FOLLOW_basic_expr_in_apply_expr5029);
            	    basic_expr528=basic_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_basic_expr.add(basic_expr528.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt243 >= 1 ) break loop243;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(243, input);
                        throw eee;
                }
                cnt243++;
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
            // 722:16: -> ^( APPLY ( basic_expr )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:722:19: ^( APPLY ( basic_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(APPLY, "APPLY"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:722:27: ( basic_expr )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:723:1: p_apply_expr : p_basic_expr ( ( NL )? p_basic_expr )* -> ^( APPLY ( p_basic_expr )* ) ;
    public final babel17Parser.p_apply_expr_return p_apply_expr() throws RecognitionException {
        babel17Parser.p_apply_expr_return retval = new babel17Parser.p_apply_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL530=null;
        babel17Parser.p_basic_expr_return p_basic_expr529 = null;

        babel17Parser.p_basic_expr_return p_basic_expr531 = null;


        CommonTree NL530_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_p_basic_expr=new RewriteRuleSubtreeStream(adaptor,"rule p_basic_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:724:2: ( p_basic_expr ( ( NL )? p_basic_expr )* -> ^( APPLY ( p_basic_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:724:4: p_basic_expr ( ( NL )? p_basic_expr )*
            {
            pushFollow(FOLLOW_p_basic_expr_in_p_apply_expr5047);
            p_basic_expr529=p_basic_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_p_basic_expr.add(p_basic_expr529.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:724:17: ( ( NL )? p_basic_expr )*
            loop245:
            do {
                int alt245=2;
                int LA245_0 = input.LA(1);

                if ( (LA245_0==NL) ) {
                    int LA245_1 = input.LA(2);

                    if ( (LA245_1==L_begin||(LA245_1>=L_with && LA245_1<=L_if)||(LA245_1>=L_while && LA245_1<=L_for)||LA245_1==L_match||LA245_1==L_try||(LA245_1>=A_infinity && LA245_1<=U_infinity)||(LA245_1>=L_true && LA245_1<=L_this)||LA245_1==L_nil||(LA245_1>=Constr && LA245_1<=Num)||(LA245_1>=String && LA245_1<=ROUND_BRACKET_OPEN)||LA245_1==SQUARE_BRACKET_OPEN||LA245_1==CURLY_BRACKET_OPEN) ) {
                        alt245=1;
                    }


                }
                else if ( (LA245_0==L_begin||(LA245_0>=L_with && LA245_0<=L_if)||(LA245_0>=L_while && LA245_0<=L_for)||LA245_0==L_match||LA245_0==L_try||(LA245_0>=A_infinity && LA245_0<=U_infinity)||(LA245_0>=L_true && LA245_0<=L_this)||LA245_0==L_nil||(LA245_0>=Constr && LA245_0<=Num)||(LA245_0>=String && LA245_0<=ROUND_BRACKET_OPEN)||LA245_0==SQUARE_BRACKET_OPEN||LA245_0==CURLY_BRACKET_OPEN) ) {
                    alt245=1;
                }


                switch (alt245) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:724:18: ( NL )? p_basic_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:724:18: ( NL )?
            	    int alt244=2;
            	    int LA244_0 = input.LA(1);

            	    if ( (LA244_0==NL) ) {
            	        alt244=1;
            	    }
            	    switch (alt244) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:724:18: NL
            	            {
            	            NL530=(Token)match(input,NL,FOLLOW_NL_in_p_apply_expr5050); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL530);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_basic_expr_in_p_apply_expr5053);
            	    p_basic_expr531=p_basic_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_p_basic_expr.add(p_basic_expr531.getTree());

            	    }
            	    break;

            	default :
            	    break loop245;
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
            // 724:37: -> ^( APPLY ( p_basic_expr )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:724:40: ^( APPLY ( p_basic_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(APPLY, "APPLY"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:724:48: ( p_basic_expr )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:726:1: basic_expr : message_send_expr ;
    public final babel17Parser.basic_expr_return basic_expr() throws RecognitionException {
        babel17Parser.basic_expr_return retval = new babel17Parser.basic_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.message_send_expr_return message_send_expr532 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:727:2: ( message_send_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:727:4: message_send_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_message_send_expr_in_basic_expr5073);
            message_send_expr532=message_send_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, message_send_expr532.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:729:1: p_basic_expr : message_send_expr ;
    public final babel17Parser.p_basic_expr_return p_basic_expr() throws RecognitionException {
        babel17Parser.p_basic_expr_return retval = new babel17Parser.p_basic_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.message_send_expr_return message_send_expr533 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:730:2: ( message_send_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:730:4: message_send_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_message_send_expr_in_p_basic_expr5082);
            message_send_expr533=message_send_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, message_send_expr533.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:732:1: message_send_expr : primitive_expr ( ( NL )? PERIOD ( NL )? Id )* -> ^( MESSAGE_SEND primitive_expr ( Id )* ) ;
    public final babel17Parser.message_send_expr_return message_send_expr() throws RecognitionException {
        babel17Parser.message_send_expr_return retval = new babel17Parser.message_send_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL535=null;
        Token PERIOD536=null;
        Token NL537=null;
        Token Id538=null;
        babel17Parser.primitive_expr_return primitive_expr534 = null;


        CommonTree NL535_tree=null;
        CommonTree PERIOD536_tree=null;
        CommonTree NL537_tree=null;
        CommonTree Id538_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
        RewriteRuleTokenStream stream_Id=new RewriteRuleTokenStream(adaptor,"token Id");
        RewriteRuleSubtreeStream stream_primitive_expr=new RewriteRuleSubtreeStream(adaptor,"rule primitive_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:733:2: ( primitive_expr ( ( NL )? PERIOD ( NL )? Id )* -> ^( MESSAGE_SEND primitive_expr ( Id )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:733:4: primitive_expr ( ( NL )? PERIOD ( NL )? Id )*
            {
            pushFollow(FOLLOW_primitive_expr_in_message_send_expr5091);
            primitive_expr534=primitive_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_primitive_expr.add(primitive_expr534.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:733:19: ( ( NL )? PERIOD ( NL )? Id )*
            loop248:
            do {
                int alt248=2;
                int LA248_0 = input.LA(1);

                if ( (LA248_0==NL) ) {
                    int LA248_1 = input.LA(2);

                    if ( (LA248_1==PERIOD) ) {
                        alt248=1;
                    }


                }
                else if ( (LA248_0==PERIOD) ) {
                    alt248=1;
                }


                switch (alt248) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:733:20: ( NL )? PERIOD ( NL )? Id
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:733:20: ( NL )?
            	    int alt246=2;
            	    int LA246_0 = input.LA(1);

            	    if ( (LA246_0==NL) ) {
            	        alt246=1;
            	    }
            	    switch (alt246) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:733:20: NL
            	            {
            	            NL535=(Token)match(input,NL,FOLLOW_NL_in_message_send_expr5094); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL535);


            	            }
            	            break;

            	    }

            	    PERIOD536=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_message_send_expr5097); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD536);

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:733:31: ( NL )?
            	    int alt247=2;
            	    int LA247_0 = input.LA(1);

            	    if ( (LA247_0==NL) ) {
            	        alt247=1;
            	    }
            	    switch (alt247) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:733:31: NL
            	            {
            	            NL537=(Token)match(input,NL,FOLLOW_NL_in_message_send_expr5099); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL537);


            	            }
            	            break;

            	    }

            	    Id538=(Token)match(input,Id,FOLLOW_Id_in_message_send_expr5102); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_Id.add(Id538);


            	    }
            	    break;

            	default :
            	    break loop248;
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
            // 733:40: -> ^( MESSAGE_SEND primitive_expr ( Id )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:733:43: ^( MESSAGE_SEND primitive_expr ( Id )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MESSAGE_SEND, "MESSAGE_SEND"), root_1);

                adaptor.addChild(root_1, stream_primitive_expr.nextTree());
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:733:73: ( Id )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:735:1: list_expr : ( '[' ( NL )? ( protected_expr_nc ( ( NL )? COMMA ( NL )? protected_expr_nc )* ( NL )? )? ']' -> ^( SQUARE_LIST ( protected_expr_nc )* ) | '(' ( NL )? ( protected_expr_nc ( ( NL )? COMMA ( NL )? protected_expr_nc )* ( NL )? ( COMMA ( NL )? )? )? ')' -> ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( protected_expr_nc )* ) ) );
    public final babel17Parser.list_expr_return list_expr() throws RecognitionException {
        babel17Parser.list_expr_return retval = new babel17Parser.list_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal539=null;
        Token NL540=null;
        Token NL542=null;
        Token COMMA543=null;
        Token NL544=null;
        Token NL546=null;
        Token char_literal547=null;
        Token char_literal548=null;
        Token NL549=null;
        Token NL551=null;
        Token COMMA552=null;
        Token NL553=null;
        Token NL555=null;
        Token COMMA556=null;
        Token NL557=null;
        Token char_literal558=null;
        babel17Parser.protected_expr_nc_return protected_expr_nc541 = null;

        babel17Parser.protected_expr_nc_return protected_expr_nc545 = null;

        babel17Parser.protected_expr_nc_return protected_expr_nc550 = null;

        babel17Parser.protected_expr_nc_return protected_expr_nc554 = null;


        CommonTree char_literal539_tree=null;
        CommonTree NL540_tree=null;
        CommonTree NL542_tree=null;
        CommonTree COMMA543_tree=null;
        CommonTree NL544_tree=null;
        CommonTree NL546_tree=null;
        CommonTree char_literal547_tree=null;
        CommonTree char_literal548_tree=null;
        CommonTree NL549_tree=null;
        CommonTree NL551_tree=null;
        CommonTree COMMA552_tree=null;
        CommonTree NL553_tree=null;
        CommonTree NL555_tree=null;
        CommonTree COMMA556_tree=null;
        CommonTree NL557_tree=null;
        CommonTree char_literal558_tree=null;
        RewriteRuleTokenStream stream_ROUND_BRACKET_OPEN=new RewriteRuleTokenStream(adaptor,"token ROUND_BRACKET_OPEN");
        RewriteRuleTokenStream stream_SQUARE_BRACKET_CLOSE=new RewriteRuleTokenStream(adaptor,"token SQUARE_BRACKET_CLOSE");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_ROUND_BRACKET_CLOSE=new RewriteRuleTokenStream(adaptor,"token ROUND_BRACKET_CLOSE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_SQUARE_BRACKET_OPEN=new RewriteRuleTokenStream(adaptor,"token SQUARE_BRACKET_OPEN");
        RewriteRuleSubtreeStream stream_protected_expr_nc=new RewriteRuleSubtreeStream(adaptor,"rule protected_expr_nc");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:736:2: ( '[' ( NL )? ( protected_expr_nc ( ( NL )? COMMA ( NL )? protected_expr_nc )* ( NL )? )? ']' -> ^( SQUARE_LIST ( protected_expr_nc )* ) | '(' ( NL )? ( protected_expr_nc ( ( NL )? COMMA ( NL )? protected_expr_nc )* ( NL )? ( COMMA ( NL )? )? )? ')' -> ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( protected_expr_nc )* ) ) )
            int alt263=2;
            int LA263_0 = input.LA(1);

            if ( (LA263_0==SQUARE_BRACKET_OPEN) ) {
                alt263=1;
            }
            else if ( (LA263_0==ROUND_BRACKET_OPEN) ) {
                alt263=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 263, 0, input);

                throw nvae;
            }
            switch (alt263) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:736:4: '[' ( NL )? ( protected_expr_nc ( ( NL )? COMMA ( NL )? protected_expr_nc )* ( NL )? )? ']'
                    {
                    char_literal539=(Token)match(input,SQUARE_BRACKET_OPEN,FOLLOW_SQUARE_BRACKET_OPEN_in_list_expr5126); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SQUARE_BRACKET_OPEN.add(char_literal539);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:736:8: ( NL )?
                    int alt249=2;
                    int LA249_0 = input.LA(1);

                    if ( (LA249_0==NL) ) {
                        alt249=1;
                    }
                    switch (alt249) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:736:8: NL
                            {
                            NL540=(Token)match(input,NL,FOLLOW_NL_in_list_expr5128); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL540);


                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:736:12: ( protected_expr_nc ( ( NL )? COMMA ( NL )? protected_expr_nc )* ( NL )? )?
                    int alt254=2;
                    int LA254_0 = input.LA(1);

                    if ( (LA254_0==L_begin||(LA254_0>=L_obj && LA254_0<=L_if)||(LA254_0>=L_while && LA254_0<=L_for)||LA254_0==L_match||LA254_0==L_exception||LA254_0==L_try||(LA254_0>=A_infinity && LA254_0<=L_lazy)||(LA254_0>=L_true && LA254_0<=L_nil)||LA254_0==L_typeof||LA254_0==MINUS||LA254_0==A_NOT||LA254_0==U_NOT||(LA254_0>=A_ELLIPSIS && LA254_0<=U_ELLIPSIS)||LA254_0==L_force||(LA254_0>=Constr && LA254_0<=Num)||(LA254_0>=String && LA254_0<=ROUND_BRACKET_OPEN)||LA254_0==SQUARE_BRACKET_OPEN||LA254_0==CURLY_BRACKET_OPEN||LA254_0==UNDERSCORE) ) {
                        alt254=1;
                    }
                    switch (alt254) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:736:13: protected_expr_nc ( ( NL )? COMMA ( NL )? protected_expr_nc )* ( NL )?
                            {
                            pushFollow(FOLLOW_protected_expr_nc_in_list_expr5132);
                            protected_expr_nc541=protected_expr_nc();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_protected_expr_nc.add(protected_expr_nc541.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:736:31: ( ( NL )? COMMA ( NL )? protected_expr_nc )*
                            loop252:
                            do {
                                int alt252=2;
                                int LA252_0 = input.LA(1);

                                if ( (LA252_0==NL) ) {
                                    int LA252_1 = input.LA(2);

                                    if ( (LA252_1==COMMA) ) {
                                        alt252=1;
                                    }


                                }
                                else if ( (LA252_0==COMMA) ) {
                                    alt252=1;
                                }


                                switch (alt252) {
                            	case 1 :
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:736:32: ( NL )? COMMA ( NL )? protected_expr_nc
                            	    {
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:736:32: ( NL )?
                            	    int alt250=2;
                            	    int LA250_0 = input.LA(1);

                            	    if ( (LA250_0==NL) ) {
                            	        alt250=1;
                            	    }
                            	    switch (alt250) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:736:32: NL
                            	            {
                            	            NL542=(Token)match(input,NL,FOLLOW_NL_in_list_expr5135); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL542);


                            	            }
                            	            break;

                            	    }

                            	    COMMA543=(Token)match(input,COMMA,FOLLOW_COMMA_in_list_expr5138); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA543);

                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:736:42: ( NL )?
                            	    int alt251=2;
                            	    int LA251_0 = input.LA(1);

                            	    if ( (LA251_0==NL) ) {
                            	        alt251=1;
                            	    }
                            	    switch (alt251) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:736:42: NL
                            	            {
                            	            NL544=(Token)match(input,NL,FOLLOW_NL_in_list_expr5140); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL544);


                            	            }
                            	            break;

                            	    }

                            	    pushFollow(FOLLOW_protected_expr_nc_in_list_expr5143);
                            	    protected_expr_nc545=protected_expr_nc();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_protected_expr_nc.add(protected_expr_nc545.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop252;
                                }
                            } while (true);

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:736:66: ( NL )?
                            int alt253=2;
                            int LA253_0 = input.LA(1);

                            if ( (LA253_0==NL) ) {
                                alt253=1;
                            }
                            switch (alt253) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:736:66: NL
                                    {
                                    NL546=(Token)match(input,NL,FOLLOW_NL_in_list_expr5147); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL546);


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    char_literal547=(Token)match(input,SQUARE_BRACKET_CLOSE,FOLLOW_SQUARE_BRACKET_CLOSE_in_list_expr5152); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SQUARE_BRACKET_CLOSE.add(char_literal547);



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
                    // 736:76: -> ^( SQUARE_LIST ( protected_expr_nc )* )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:736:79: ^( SQUARE_LIST ( protected_expr_nc )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SQUARE_LIST, "SQUARE_LIST"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:736:93: ( protected_expr_nc )*
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:737:4: '(' ( NL )? ( protected_expr_nc ( ( NL )? COMMA ( NL )? protected_expr_nc )* ( NL )? ( COMMA ( NL )? )? )? ')'
                    {
                    char_literal548=(Token)match(input,ROUND_BRACKET_OPEN,FOLLOW_ROUND_BRACKET_OPEN_in_list_expr5166); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ROUND_BRACKET_OPEN.add(char_literal548);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:737:8: ( NL )?
                    int alt255=2;
                    int LA255_0 = input.LA(1);

                    if ( (LA255_0==NL) ) {
                        alt255=1;
                    }
                    switch (alt255) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:737:8: NL
                            {
                            NL549=(Token)match(input,NL,FOLLOW_NL_in_list_expr5168); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL549);


                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:737:12: ( protected_expr_nc ( ( NL )? COMMA ( NL )? protected_expr_nc )* ( NL )? ( COMMA ( NL )? )? )?
                    int alt262=2;
                    int LA262_0 = input.LA(1);

                    if ( (LA262_0==L_begin||(LA262_0>=L_obj && LA262_0<=L_if)||(LA262_0>=L_while && LA262_0<=L_for)||LA262_0==L_match||LA262_0==L_exception||LA262_0==L_try||(LA262_0>=A_infinity && LA262_0<=L_lazy)||(LA262_0>=L_true && LA262_0<=L_nil)||LA262_0==L_typeof||LA262_0==MINUS||LA262_0==A_NOT||LA262_0==U_NOT||(LA262_0>=A_ELLIPSIS && LA262_0<=U_ELLIPSIS)||LA262_0==L_force||(LA262_0>=Constr && LA262_0<=Num)||(LA262_0>=String && LA262_0<=ROUND_BRACKET_OPEN)||LA262_0==SQUARE_BRACKET_OPEN||LA262_0==CURLY_BRACKET_OPEN||LA262_0==UNDERSCORE) ) {
                        alt262=1;
                    }
                    switch (alt262) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:737:13: protected_expr_nc ( ( NL )? COMMA ( NL )? protected_expr_nc )* ( NL )? ( COMMA ( NL )? )?
                            {
                            pushFollow(FOLLOW_protected_expr_nc_in_list_expr5172);
                            protected_expr_nc550=protected_expr_nc();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_protected_expr_nc.add(protected_expr_nc550.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:737:31: ( ( NL )? COMMA ( NL )? protected_expr_nc )*
                            loop258:
                            do {
                                int alt258=2;
                                int LA258_0 = input.LA(1);

                                if ( (LA258_0==NL) ) {
                                    int LA258_1 = input.LA(2);

                                    if ( (LA258_1==COMMA) ) {
                                        int LA258_2 = input.LA(3);

                                        if ( (LA258_2==NL) ) {
                                            int LA258_4 = input.LA(4);

                                            if ( (LA258_4==L_begin||(LA258_4>=L_obj && LA258_4<=L_if)||(LA258_4>=L_while && LA258_4<=L_for)||LA258_4==L_match||LA258_4==L_exception||LA258_4==L_try||(LA258_4>=A_infinity && LA258_4<=L_lazy)||(LA258_4>=L_true && LA258_4<=L_nil)||LA258_4==L_typeof||LA258_4==MINUS||LA258_4==A_NOT||LA258_4==U_NOT||(LA258_4>=A_ELLIPSIS && LA258_4<=U_ELLIPSIS)||LA258_4==L_force||(LA258_4>=Constr && LA258_4<=Num)||(LA258_4>=String && LA258_4<=ROUND_BRACKET_OPEN)||LA258_4==SQUARE_BRACKET_OPEN||LA258_4==CURLY_BRACKET_OPEN||LA258_4==UNDERSCORE) ) {
                                                alt258=1;
                                            }


                                        }
                                        else if ( (LA258_2==L_begin||(LA258_2>=L_obj && LA258_2<=L_if)||(LA258_2>=L_while && LA258_2<=L_for)||LA258_2==L_match||LA258_2==L_exception||LA258_2==L_try||(LA258_2>=A_infinity && LA258_2<=L_lazy)||(LA258_2>=L_true && LA258_2<=L_nil)||LA258_2==L_typeof||LA258_2==MINUS||LA258_2==A_NOT||LA258_2==U_NOT||(LA258_2>=A_ELLIPSIS && LA258_2<=U_ELLIPSIS)||LA258_2==L_force||(LA258_2>=Constr && LA258_2<=Num)||(LA258_2>=String && LA258_2<=ROUND_BRACKET_OPEN)||LA258_2==SQUARE_BRACKET_OPEN||LA258_2==CURLY_BRACKET_OPEN||LA258_2==UNDERSCORE) ) {
                                            alt258=1;
                                        }


                                    }


                                }
                                else if ( (LA258_0==COMMA) ) {
                                    int LA258_2 = input.LA(2);

                                    if ( (LA258_2==NL) ) {
                                        int LA258_4 = input.LA(3);

                                        if ( (LA258_4==L_begin||(LA258_4>=L_obj && LA258_4<=L_if)||(LA258_4>=L_while && LA258_4<=L_for)||LA258_4==L_match||LA258_4==L_exception||LA258_4==L_try||(LA258_4>=A_infinity && LA258_4<=L_lazy)||(LA258_4>=L_true && LA258_4<=L_nil)||LA258_4==L_typeof||LA258_4==MINUS||LA258_4==A_NOT||LA258_4==U_NOT||(LA258_4>=A_ELLIPSIS && LA258_4<=U_ELLIPSIS)||LA258_4==L_force||(LA258_4>=Constr && LA258_4<=Num)||(LA258_4>=String && LA258_4<=ROUND_BRACKET_OPEN)||LA258_4==SQUARE_BRACKET_OPEN||LA258_4==CURLY_BRACKET_OPEN||LA258_4==UNDERSCORE) ) {
                                            alt258=1;
                                        }


                                    }
                                    else if ( (LA258_2==L_begin||(LA258_2>=L_obj && LA258_2<=L_if)||(LA258_2>=L_while && LA258_2<=L_for)||LA258_2==L_match||LA258_2==L_exception||LA258_2==L_try||(LA258_2>=A_infinity && LA258_2<=L_lazy)||(LA258_2>=L_true && LA258_2<=L_nil)||LA258_2==L_typeof||LA258_2==MINUS||LA258_2==A_NOT||LA258_2==U_NOT||(LA258_2>=A_ELLIPSIS && LA258_2<=U_ELLIPSIS)||LA258_2==L_force||(LA258_2>=Constr && LA258_2<=Num)||(LA258_2>=String && LA258_2<=ROUND_BRACKET_OPEN)||LA258_2==SQUARE_BRACKET_OPEN||LA258_2==CURLY_BRACKET_OPEN||LA258_2==UNDERSCORE) ) {
                                        alt258=1;
                                    }


                                }


                                switch (alt258) {
                            	case 1 :
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:737:32: ( NL )? COMMA ( NL )? protected_expr_nc
                            	    {
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:737:32: ( NL )?
                            	    int alt256=2;
                            	    int LA256_0 = input.LA(1);

                            	    if ( (LA256_0==NL) ) {
                            	        alt256=1;
                            	    }
                            	    switch (alt256) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:737:32: NL
                            	            {
                            	            NL551=(Token)match(input,NL,FOLLOW_NL_in_list_expr5175); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL551);


                            	            }
                            	            break;

                            	    }

                            	    COMMA552=(Token)match(input,COMMA,FOLLOW_COMMA_in_list_expr5178); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA552);

                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:737:42: ( NL )?
                            	    int alt257=2;
                            	    int LA257_0 = input.LA(1);

                            	    if ( (LA257_0==NL) ) {
                            	        alt257=1;
                            	    }
                            	    switch (alt257) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:737:42: NL
                            	            {
                            	            NL553=(Token)match(input,NL,FOLLOW_NL_in_list_expr5180); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL553);


                            	            }
                            	            break;

                            	    }

                            	    pushFollow(FOLLOW_protected_expr_nc_in_list_expr5183);
                            	    protected_expr_nc554=protected_expr_nc();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_protected_expr_nc.add(protected_expr_nc554.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop258;
                                }
                            } while (true);

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:737:66: ( NL )?
                            int alt259=2;
                            int LA259_0 = input.LA(1);

                            if ( (LA259_0==NL) ) {
                                alt259=1;
                            }
                            switch (alt259) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:737:66: NL
                                    {
                                    NL555=(Token)match(input,NL,FOLLOW_NL_in_list_expr5187); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL555);


                                    }
                                    break;

                            }

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:737:70: ( COMMA ( NL )? )?
                            int alt261=2;
                            int LA261_0 = input.LA(1);

                            if ( (LA261_0==COMMA) ) {
                                alt261=1;
                            }
                            switch (alt261) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:737:71: COMMA ( NL )?
                                    {
                                    COMMA556=(Token)match(input,COMMA,FOLLOW_COMMA_in_list_expr5191); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_COMMA.add(COMMA556);

                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:737:77: ( NL )?
                                    int alt260=2;
                                    int LA260_0 = input.LA(1);

                                    if ( (LA260_0==NL) ) {
                                        alt260=1;
                                    }
                                    switch (alt260) {
                                        case 1 :
                                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:737:77: NL
                                            {
                                            NL557=(Token)match(input,NL,FOLLOW_NL_in_list_expr5193); if (state.failed) return retval; 
                                            if ( state.backtracking==0 ) stream_NL.add(NL557);


                                            }
                                            break;

                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    char_literal558=(Token)match(input,ROUND_BRACKET_CLOSE,FOLLOW_ROUND_BRACKET_CLOSE_in_list_expr5200); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ROUND_BRACKET_CLOSE.add(char_literal558);



                    // AST REWRITE
                    // elements: COMMA, protected_expr_nc
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 737:89: -> ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( protected_expr_nc )* ) )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:737:92: ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( protected_expr_nc )* ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ROUND_LIST, "ROUND_LIST"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:737:105: ^( NIL_TOKEN ( COMMA )* )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_2);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:737:117: ( COMMA )*
                        while ( stream_COMMA.hasNext() ) {
                            adaptor.addChild(root_2, stream_COMMA.nextNode());

                        }
                        stream_COMMA.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:737:125: ^( NIL_TOKEN ( protected_expr_nc )* )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_2);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:737:137: ( protected_expr_nc )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:739:1: map_or_set_expr : ( '{' ( NL )? ( map_or_set_elem_expr ( NL )? ( COMMA ( NL )? map_or_set_elem_expr ( NL )? )* )? '}' -> ^( MAP_OR_SET_OR_OBJ ( map_or_set_elem_expr )* ) | '{' ( NL )? token_ARROW ( NL )? '}' -> ^( EMPTY_MAP ) );
    public final babel17Parser.map_or_set_expr_return map_or_set_expr() throws RecognitionException {
        babel17Parser.map_or_set_expr_return retval = new babel17Parser.map_or_set_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal559=null;
        Token NL560=null;
        Token NL562=null;
        Token COMMA563=null;
        Token NL564=null;
        Token NL566=null;
        Token char_literal567=null;
        Token char_literal568=null;
        Token NL569=null;
        Token NL571=null;
        Token char_literal572=null;
        babel17Parser.map_or_set_elem_expr_return map_or_set_elem_expr561 = null;

        babel17Parser.map_or_set_elem_expr_return map_or_set_elem_expr565 = null;

        babel17Parser.token_ARROW_return token_ARROW570 = null;


        CommonTree char_literal559_tree=null;
        CommonTree NL560_tree=null;
        CommonTree NL562_tree=null;
        CommonTree COMMA563_tree=null;
        CommonTree NL564_tree=null;
        CommonTree NL566_tree=null;
        CommonTree char_literal567_tree=null;
        CommonTree char_literal568_tree=null;
        CommonTree NL569_tree=null;
        CommonTree NL571_tree=null;
        CommonTree char_literal572_tree=null;
        RewriteRuleTokenStream stream_CURLY_BRACKET_OPEN=new RewriteRuleTokenStream(adaptor,"token CURLY_BRACKET_OPEN");
        RewriteRuleTokenStream stream_CURLY_BRACKET_CLOSE=new RewriteRuleTokenStream(adaptor,"token CURLY_BRACKET_CLOSE");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_map_or_set_elem_expr=new RewriteRuleSubtreeStream(adaptor,"rule map_or_set_elem_expr");
        RewriteRuleSubtreeStream stream_token_ARROW=new RewriteRuleSubtreeStream(adaptor,"rule token_ARROW");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:740:2: ( '{' ( NL )? ( map_or_set_elem_expr ( NL )? ( COMMA ( NL )? map_or_set_elem_expr ( NL )? )* )? '}' -> ^( MAP_OR_SET_OR_OBJ ( map_or_set_elem_expr )* ) | '{' ( NL )? token_ARROW ( NL )? '}' -> ^( EMPTY_MAP ) )
            int alt272=2;
            int LA272_0 = input.LA(1);

            if ( (LA272_0==CURLY_BRACKET_OPEN) ) {
                switch ( input.LA(2) ) {
                case NL:
                    {
                    int LA272_2 = input.LA(3);

                    if ( (LA272_2==L_begin||(LA272_2>=L_obj && LA272_2<=L_if)||(LA272_2>=L_while && LA272_2<=L_for)||LA272_2==L_match||LA272_2==L_exception||LA272_2==L_try||(LA272_2>=A_infinity && LA272_2<=L_lazy)||(LA272_2>=L_true && LA272_2<=L_nil)||LA272_2==L_typeof||LA272_2==MINUS||LA272_2==A_NOT||LA272_2==U_NOT||(LA272_2>=A_ELLIPSIS && LA272_2<=U_ELLIPSIS)||LA272_2==L_force||(LA272_2>=Constr && LA272_2<=Num)||(LA272_2>=String && LA272_2<=ROUND_BRACKET_OPEN)||LA272_2==SQUARE_BRACKET_OPEN||(LA272_2>=CURLY_BRACKET_OPEN && LA272_2<=UNDERSCORE)) ) {
                        alt272=1;
                    }
                    else if ( ((LA272_2>=A_ARROW && LA272_2<=U_ARROW)) ) {
                        alt272=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 272, 2, input);

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
                    alt272=1;
                    }
                    break;
                case A_ARROW:
                case U_ARROW:
                    {
                    alt272=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 272, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 272, 0, input);

                throw nvae;
            }
            switch (alt272) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:740:4: '{' ( NL )? ( map_or_set_elem_expr ( NL )? ( COMMA ( NL )? map_or_set_elem_expr ( NL )? )* )? '}'
                    {
                    char_literal559=(Token)match(input,CURLY_BRACKET_OPEN,FOLLOW_CURLY_BRACKET_OPEN_in_map_or_set_expr5229); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_OPEN.add(char_literal559);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:740:8: ( NL )?
                    int alt264=2;
                    int LA264_0 = input.LA(1);

                    if ( (LA264_0==NL) ) {
                        alt264=1;
                    }
                    switch (alt264) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:740:8: NL
                            {
                            NL560=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_expr5231); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL560);


                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:740:12: ( map_or_set_elem_expr ( NL )? ( COMMA ( NL )? map_or_set_elem_expr ( NL )? )* )?
                    int alt269=2;
                    int LA269_0 = input.LA(1);

                    if ( (LA269_0==L_begin||(LA269_0>=L_obj && LA269_0<=L_if)||(LA269_0>=L_while && LA269_0<=L_for)||LA269_0==L_match||LA269_0==L_exception||LA269_0==L_try||(LA269_0>=A_infinity && LA269_0<=L_lazy)||(LA269_0>=L_true && LA269_0<=L_nil)||LA269_0==L_typeof||LA269_0==MINUS||LA269_0==A_NOT||LA269_0==U_NOT||(LA269_0>=A_ELLIPSIS && LA269_0<=U_ELLIPSIS)||LA269_0==L_force||(LA269_0>=Constr && LA269_0<=Num)||(LA269_0>=String && LA269_0<=ROUND_BRACKET_OPEN)||LA269_0==SQUARE_BRACKET_OPEN||LA269_0==CURLY_BRACKET_OPEN||LA269_0==UNDERSCORE) ) {
                        alt269=1;
                    }
                    switch (alt269) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:740:13: map_or_set_elem_expr ( NL )? ( COMMA ( NL )? map_or_set_elem_expr ( NL )? )*
                            {
                            pushFollow(FOLLOW_map_or_set_elem_expr_in_map_or_set_expr5235);
                            map_or_set_elem_expr561=map_or_set_elem_expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_map_or_set_elem_expr.add(map_or_set_elem_expr561.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:740:34: ( NL )?
                            int alt265=2;
                            int LA265_0 = input.LA(1);

                            if ( (LA265_0==NL) ) {
                                alt265=1;
                            }
                            switch (alt265) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:740:34: NL
                                    {
                                    NL562=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_expr5237); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL562);


                                    }
                                    break;

                            }

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:740:38: ( COMMA ( NL )? map_or_set_elem_expr ( NL )? )*
                            loop268:
                            do {
                                int alt268=2;
                                int LA268_0 = input.LA(1);

                                if ( (LA268_0==COMMA) ) {
                                    alt268=1;
                                }


                                switch (alt268) {
                            	case 1 :
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:740:39: COMMA ( NL )? map_or_set_elem_expr ( NL )?
                            	    {
                            	    COMMA563=(Token)match(input,COMMA,FOLLOW_COMMA_in_map_or_set_expr5241); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA563);

                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:740:45: ( NL )?
                            	    int alt266=2;
                            	    int LA266_0 = input.LA(1);

                            	    if ( (LA266_0==NL) ) {
                            	        alt266=1;
                            	    }
                            	    switch (alt266) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:740:45: NL
                            	            {
                            	            NL564=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_expr5243); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL564);


                            	            }
                            	            break;

                            	    }

                            	    pushFollow(FOLLOW_map_or_set_elem_expr_in_map_or_set_expr5246);
                            	    map_or_set_elem_expr565=map_or_set_elem_expr();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_map_or_set_elem_expr.add(map_or_set_elem_expr565.getTree());
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:740:70: ( NL )?
                            	    int alt267=2;
                            	    int LA267_0 = input.LA(1);

                            	    if ( (LA267_0==NL) ) {
                            	        alt267=1;
                            	    }
                            	    switch (alt267) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:740:70: NL
                            	            {
                            	            NL566=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_expr5248); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL566);


                            	            }
                            	            break;

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop268;
                                }
                            } while (true);


                            }
                            break;

                    }

                    char_literal567=(Token)match(input,CURLY_BRACKET_CLOSE,FOLLOW_CURLY_BRACKET_CLOSE_in_map_or_set_expr5255); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_CLOSE.add(char_literal567);



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
                    // 740:82: -> ^( MAP_OR_SET_OR_OBJ ( map_or_set_elem_expr )* )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:740:85: ^( MAP_OR_SET_OR_OBJ ( map_or_set_elem_expr )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MAP_OR_SET_OR_OBJ, "MAP_OR_SET_OR_OBJ"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:740:105: ( map_or_set_elem_expr )*
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:741:10: '{' ( NL )? token_ARROW ( NL )? '}'
                    {
                    char_literal568=(Token)match(input,CURLY_BRACKET_OPEN,FOLLOW_CURLY_BRACKET_OPEN_in_map_or_set_expr5275); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_OPEN.add(char_literal568);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:741:14: ( NL )?
                    int alt270=2;
                    int LA270_0 = input.LA(1);

                    if ( (LA270_0==NL) ) {
                        alt270=1;
                    }
                    switch (alt270) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:741:14: NL
                            {
                            NL569=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_expr5277); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL569);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_token_ARROW_in_map_or_set_expr5280);
                    token_ARROW570=token_ARROW();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_token_ARROW.add(token_ARROW570.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:741:30: ( NL )?
                    int alt271=2;
                    int LA271_0 = input.LA(1);

                    if ( (LA271_0==NL) ) {
                        alt271=1;
                    }
                    switch (alt271) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:741:30: NL
                            {
                            NL571=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_expr5282); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL571);


                            }
                            break;

                    }

                    char_literal572=(Token)match(input,CURLY_BRACKET_CLOSE,FOLLOW_CURLY_BRACKET_CLOSE_in_map_or_set_expr5285); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_CLOSE.add(char_literal572);



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
                    // 741:38: -> ^( EMPTY_MAP )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:741:41: ^( EMPTY_MAP )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:743:1: map_or_set_elem_expr : protected_expr_nc ( ( NL )? arrow_or_assign ( NL )? protected_expr_nc )? -> ^( NIL_TOKEN ^( NIL_TOKEN ( protected_expr_nc )* ) ( arrow_or_assign )* ) ;
    public final babel17Parser.map_or_set_elem_expr_return map_or_set_elem_expr() throws RecognitionException {
        babel17Parser.map_or_set_elem_expr_return retval = new babel17Parser.map_or_set_elem_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL574=null;
        Token NL576=null;
        babel17Parser.protected_expr_nc_return protected_expr_nc573 = null;

        babel17Parser.arrow_or_assign_return arrow_or_assign575 = null;

        babel17Parser.protected_expr_nc_return protected_expr_nc577 = null;


        CommonTree NL574_tree=null;
        CommonTree NL576_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_arrow_or_assign=new RewriteRuleSubtreeStream(adaptor,"rule arrow_or_assign");
        RewriteRuleSubtreeStream stream_protected_expr_nc=new RewriteRuleSubtreeStream(adaptor,"rule protected_expr_nc");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:744:2: ( protected_expr_nc ( ( NL )? arrow_or_assign ( NL )? protected_expr_nc )? -> ^( NIL_TOKEN ^( NIL_TOKEN ( protected_expr_nc )* ) ( arrow_or_assign )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:744:4: protected_expr_nc ( ( NL )? arrow_or_assign ( NL )? protected_expr_nc )?
            {
            pushFollow(FOLLOW_protected_expr_nc_in_map_or_set_elem_expr5302);
            protected_expr_nc573=protected_expr_nc();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_protected_expr_nc.add(protected_expr_nc573.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:744:22: ( ( NL )? arrow_or_assign ( NL )? protected_expr_nc )?
            int alt275=2;
            int LA275_0 = input.LA(1);

            if ( (LA275_0==NL) ) {
                int LA275_1 = input.LA(2);

                if ( (LA275_1==ASSIGN||(LA275_1>=A_ARROW && LA275_1<=U_ARROW)) ) {
                    alt275=1;
                }
            }
            else if ( (LA275_0==ASSIGN||(LA275_0>=A_ARROW && LA275_0<=U_ARROW)) ) {
                alt275=1;
            }
            switch (alt275) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:744:23: ( NL )? arrow_or_assign ( NL )? protected_expr_nc
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:744:23: ( NL )?
                    int alt273=2;
                    int LA273_0 = input.LA(1);

                    if ( (LA273_0==NL) ) {
                        alt273=1;
                    }
                    switch (alt273) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:744:23: NL
                            {
                            NL574=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_elem_expr5305); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL574);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_arrow_or_assign_in_map_or_set_elem_expr5308);
                    arrow_or_assign575=arrow_or_assign();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_arrow_or_assign.add(arrow_or_assign575.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:744:43: ( NL )?
                    int alt274=2;
                    int LA274_0 = input.LA(1);

                    if ( (LA274_0==NL) ) {
                        alt274=1;
                    }
                    switch (alt274) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:744:43: NL
                            {
                            NL576=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_elem_expr5310); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL576);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_protected_expr_nc_in_map_or_set_elem_expr5313);
                    protected_expr_nc577=protected_expr_nc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_protected_expr_nc.add(protected_expr_nc577.getTree());

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
            // 744:67: -> ^( NIL_TOKEN ^( NIL_TOKEN ( protected_expr_nc )* ) ( arrow_or_assign )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:744:70: ^( NIL_TOKEN ^( NIL_TOKEN ( protected_expr_nc )* ) ( arrow_or_assign )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:744:82: ^( NIL_TOKEN ( protected_expr_nc )* )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_2);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:744:94: ( protected_expr_nc )*
                while ( stream_protected_expr_nc.hasNext() ) {
                    adaptor.addChild(root_2, stream_protected_expr_nc.nextTree());

                }
                stream_protected_expr_nc.reset();

                adaptor.addChild(root_1, root_2);
                }
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:744:114: ( arrow_or_assign )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:746:1: type_expr : '(' ( NL )? ':' ( NL )? typeid ( NL )? ')' -> ^( TYPE_EXPR typeid ) ;
    public final babel17Parser.type_expr_return type_expr() throws RecognitionException {
        babel17Parser.type_expr_return retval = new babel17Parser.type_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal578=null;
        Token NL579=null;
        Token char_literal580=null;
        Token NL581=null;
        Token NL583=null;
        Token char_literal584=null;
        babel17Parser.typeid_return typeid582 = null;


        CommonTree char_literal578_tree=null;
        CommonTree NL579_tree=null;
        CommonTree char_literal580_tree=null;
        CommonTree NL581_tree=null;
        CommonTree NL583_tree=null;
        CommonTree char_literal584_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_ROUND_BRACKET_OPEN=new RewriteRuleTokenStream(adaptor,"token ROUND_BRACKET_OPEN");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_ROUND_BRACKET_CLOSE=new RewriteRuleTokenStream(adaptor,"token ROUND_BRACKET_CLOSE");
        RewriteRuleSubtreeStream stream_typeid=new RewriteRuleSubtreeStream(adaptor,"rule typeid");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:747:2: ( '(' ( NL )? ':' ( NL )? typeid ( NL )? ')' -> ^( TYPE_EXPR typeid ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:747:4: '(' ( NL )? ':' ( NL )? typeid ( NL )? ')'
            {
            char_literal578=(Token)match(input,ROUND_BRACKET_OPEN,FOLLOW_ROUND_BRACKET_OPEN_in_type_expr5340); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ROUND_BRACKET_OPEN.add(char_literal578);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:747:8: ( NL )?
            int alt276=2;
            int LA276_0 = input.LA(1);

            if ( (LA276_0==NL) ) {
                alt276=1;
            }
            switch (alt276) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:747:8: NL
                    {
                    NL579=(Token)match(input,NL,FOLLOW_NL_in_type_expr5342); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL579);


                    }
                    break;

            }

            char_literal580=(Token)match(input,COLON,FOLLOW_COLON_in_type_expr5345); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(char_literal580);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:747:16: ( NL )?
            int alt277=2;
            int LA277_0 = input.LA(1);

            if ( (LA277_0==NL) ) {
                alt277=1;
            }
            switch (alt277) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:747:16: NL
                    {
                    NL581=(Token)match(input,NL,FOLLOW_NL_in_type_expr5347); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL581);


                    }
                    break;

            }

            pushFollow(FOLLOW_typeid_in_type_expr5350);
            typeid582=typeid();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeid.add(typeid582.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:747:27: ( NL )?
            int alt278=2;
            int LA278_0 = input.LA(1);

            if ( (LA278_0==NL) ) {
                alt278=1;
            }
            switch (alt278) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:747:27: NL
                    {
                    NL583=(Token)match(input,NL,FOLLOW_NL_in_type_expr5352); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL583);


                    }
                    break;

            }

            char_literal584=(Token)match(input,ROUND_BRACKET_CLOSE,FOLLOW_ROUND_BRACKET_CLOSE_in_type_expr5355); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ROUND_BRACKET_CLOSE.add(char_literal584);



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
            // 747:35: -> ^( TYPE_EXPR typeid )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:747:38: ^( TYPE_EXPR typeid )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:749:1: primitive_expr : ( Num | String | Id | Constr | L_true | L_false | L_this | L_nil | type_expr | token_infinity | list_expr | with_control_expr | map_or_set_expr );
    public final babel17Parser.primitive_expr_return primitive_expr() throws RecognitionException {
        babel17Parser.primitive_expr_return retval = new babel17Parser.primitive_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Num585=null;
        Token String586=null;
        Token Id587=null;
        Token Constr588=null;
        Token L_true589=null;
        Token L_false590=null;
        Token L_this591=null;
        Token L_nil592=null;
        babel17Parser.type_expr_return type_expr593 = null;

        babel17Parser.token_infinity_return token_infinity594 = null;

        babel17Parser.list_expr_return list_expr595 = null;

        babel17Parser.with_control_expr_return with_control_expr596 = null;

        babel17Parser.map_or_set_expr_return map_or_set_expr597 = null;


        CommonTree Num585_tree=null;
        CommonTree String586_tree=null;
        CommonTree Id587_tree=null;
        CommonTree Constr588_tree=null;
        CommonTree L_true589_tree=null;
        CommonTree L_false590_tree=null;
        CommonTree L_this591_tree=null;
        CommonTree L_nil592_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:750:2: ( Num | String | Id | Constr | L_true | L_false | L_this | L_nil | type_expr | token_infinity | list_expr | with_control_expr | map_or_set_expr )
            int alt279=13;
            alt279 = dfa279.predict(input);
            switch (alt279) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:750:4: Num
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Num585=(Token)match(input,Num,FOLLOW_Num_in_primitive_expr5372); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Num585_tree = (CommonTree)adaptor.create(Num585);
                    adaptor.addChild(root_0, Num585_tree);
                    }

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:751:4: String
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    String586=(Token)match(input,String,FOLLOW_String_in_primitive_expr5377); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    String586_tree = (CommonTree)adaptor.create(String586);
                    adaptor.addChild(root_0, String586_tree);
                    }

                    }
                    break;
                case 3 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:752:4: Id
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Id587=(Token)match(input,Id,FOLLOW_Id_in_primitive_expr5382); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Id587_tree = (CommonTree)adaptor.create(Id587);
                    adaptor.addChild(root_0, Id587_tree);
                    }

                    }
                    break;
                case 4 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:753:4: Constr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Constr588=(Token)match(input,Constr,FOLLOW_Constr_in_primitive_expr5387); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Constr588_tree = (CommonTree)adaptor.create(Constr588);
                    adaptor.addChild(root_0, Constr588_tree);
                    }

                    }
                    break;
                case 5 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:754:4: L_true
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    L_true589=(Token)match(input,L_true,FOLLOW_L_true_in_primitive_expr5392); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    L_true589_tree = (CommonTree)adaptor.create(L_true589);
                    adaptor.addChild(root_0, L_true589_tree);
                    }

                    }
                    break;
                case 6 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:755:4: L_false
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    L_false590=(Token)match(input,L_false,FOLLOW_L_false_in_primitive_expr5397); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    L_false590_tree = (CommonTree)adaptor.create(L_false590);
                    adaptor.addChild(root_0, L_false590_tree);
                    }

                    }
                    break;
                case 7 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:756:4: L_this
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    L_this591=(Token)match(input,L_this,FOLLOW_L_this_in_primitive_expr5402); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    L_this591_tree = (CommonTree)adaptor.create(L_this591);
                    adaptor.addChild(root_0, L_this591_tree);
                    }

                    }
                    break;
                case 8 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:757:4: L_nil
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    L_nil592=(Token)match(input,L_nil,FOLLOW_L_nil_in_primitive_expr5408); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    L_nil592_tree = (CommonTree)adaptor.create(L_nil592);
                    adaptor.addChild(root_0, L_nil592_tree);
                    }

                    }
                    break;
                case 9 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:758:4: type_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_type_expr_in_primitive_expr5413);
                    type_expr593=type_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type_expr593.getTree());

                    }
                    break;
                case 10 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:759:4: token_infinity
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_infinity_in_primitive_expr5418);
                    token_infinity594=token_infinity();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, token_infinity594.getTree());

                    }
                    break;
                case 11 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:760:5: list_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_list_expr_in_primitive_expr5424);
                    list_expr595=list_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, list_expr595.getTree());

                    }
                    break;
                case 12 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:761:4: with_control_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_with_control_expr_in_primitive_expr5429);
                    with_control_expr596=with_control_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, with_control_expr596.getTree());

                    }
                    break;
                case 13 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:762:4: map_or_set_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_map_or_set_expr_in_primitive_expr5434);
                    map_or_set_expr597=map_or_set_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, map_or_set_expr597.getTree());

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
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:406:10: ( Id ( NL )? L_as )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:406:11: Id ( NL )? L_as
        {
        match(input,Id,FOLLOW_Id_in_synpred1_babel171853); if (state.failed) return ;
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:406:14: ( NL )?
        int alt280=2;
        int LA280_0 = input.LA(1);

        if ( (LA280_0==NL) ) {
            alt280=1;
        }
        switch (alt280) {
            case 1 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:406:14: NL
                {
                match(input,NL,FOLLOW_NL_in_synpred1_babel171855); if (state.failed) return ;

                }
                break;

        }

        match(input,L_as,FOLLOW_L_as_in_synpred1_babel171858); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_babel17

    // $ANTLR start synpred2_babel17
    public final void synpred2_babel17_fragment() throws RecognitionException {   
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:407:4: ( protected_expr ( NL )? QUESTION_MARK )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:407:5: protected_expr ( NL )? QUESTION_MARK
        {
        pushFollow(FOLLOW_protected_expr_in_synpred2_babel171889);
        protected_expr();

        state._fsp--;
        if (state.failed) return ;
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:407:20: ( NL )?
        int alt281=2;
        int LA281_0 = input.LA(1);

        if ( (LA281_0==NL) ) {
            alt281=1;
        }
        switch (alt281) {
            case 1 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:407:20: NL
                {
                match(input,NL,FOLLOW_NL_in_synpred2_babel171891); if (state.failed) return ;

                }
                break;

        }

        match(input,QUESTION_MARK,FOLLOW_QUESTION_MARK_in_synpred2_babel171894); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_babel17

    // $ANTLR start synpred3_babel17
    public final void synpred3_babel17_fragment() throws RecognitionException {   
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:409:4: ( Id pattern )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:409:5: Id pattern
        {
        match(input,Id,FOLLOW_Id_in_synpred3_babel171932); if (state.failed) return ;
        pushFollow(FOLLOW_pattern_in_synpred3_babel171934);
        pattern();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_babel17

    // $ANTLR start synpred4_babel17
    public final void synpred4_babel17_fragment() throws RecognitionException {   
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:412:4: ( pattern ( NL )? L_if )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:412:5: pattern ( NL )? L_if
        {
        pushFollow(FOLLOW_pattern_in_synpred4_babel172023);
        pattern();

        state._fsp--;
        if (state.failed) return ;
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:412:13: ( NL )?
        int alt282=2;
        int LA282_0 = input.LA(1);

        if ( (LA282_0==NL) ) {
            alt282=1;
        }
        switch (alt282) {
            case 1 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:412:13: NL
                {
                match(input,NL,FOLLOW_NL_in_synpred4_babel172025); if (state.failed) return ;

                }
                break;

        }

        match(input,L_if,FOLLOW_L_if_in_synpred4_babel172028); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_babel17

    // $ANTLR start synpred5_babel17
    public final void synpred5_babel17_fragment() throws RecognitionException {   
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:413:4: ( pattern ( NL )? ':' )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:413:5: pattern ( NL )? ':'
        {
        pushFollow(FOLLOW_pattern_in_synpred5_babel172059);
        pattern();

        state._fsp--;
        if (state.failed) return ;
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:413:13: ( NL )?
        int alt283=2;
        int LA283_0 = input.LA(1);

        if ( (LA283_0==NL) ) {
            alt283=1;
        }
        switch (alt283) {
            case 1 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:413:13: NL
                {
                match(input,NL,FOLLOW_NL_in_synpred5_babel172061); if (state.failed) return ;

                }
                break;

        }

        match(input,COLON,FOLLOW_COLON_in_synpred5_babel172064); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_babel17

    // $ANTLR start synpred6_babel17
    public final void synpred6_babel17_fragment() throws RecognitionException {   
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:480:4: ( defpattern ( NL )? '=' )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:480:5: defpattern ( NL )? '='
        {
        pushFollow(FOLLOW_defpattern_in_synpred6_babel172876);
        defpattern();

        state._fsp--;
        if (state.failed) return ;
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:480:16: ( NL )?
        int alt284=2;
        int LA284_0 = input.LA(1);

        if ( (LA284_0==NL) ) {
            alt284=1;
        }
        switch (alt284) {
            case 1 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:480:16: NL
                {
                match(input,NL,FOLLOW_NL_in_synpred6_babel172878); if (state.failed) return ;

                }
                break;

        }

        match(input,ASSIGN,FOLLOW_ASSIGN_in_synpred6_babel172881); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred6_babel17

    // $ANTLR start synpred7_babel17
    public final void synpred7_babel17_fragment() throws RecognitionException {   
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:517:4: ( ( pattern | objelem_assign ) ( NL )? '=' )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:517:5: ( pattern | objelem_assign ) ( NL )? '='
        {
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:517:5: ( pattern | objelem_assign )
        int alt285=2;
        int LA285_0 = input.LA(1);

        if ( (LA285_0==L_exception||(LA285_0>=A_infinity && LA285_0<=U_infinity)||(LA285_0>=L_true && LA285_0<=L_false)||LA285_0==L_nil||LA285_0==MINUS||(LA285_0>=A_ELLIPSIS && LA285_0<=U_ELLIPSIS)||LA285_0==Constr||LA285_0==Num||(LA285_0>=String && LA285_0<=ROUND_BRACKET_OPEN)||LA285_0==SQUARE_BRACKET_OPEN||LA285_0==CURLY_BRACKET_OPEN||LA285_0==UNDERSCORE) ) {
            alt285=1;
        }
        else if ( (LA285_0==Id) ) {
            int LA285_2 = input.LA(2);

            if ( (LA285_2==PERIOD) ) {
                alt285=2;
            }
            else if ( (LA285_2==ASSIGN||(LA285_2>=A_DOUBLE_COLON && LA285_2<=U_DOUBLE_COLON)||LA285_2==NL) ) {
                alt285=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 285, 2, input);

                throw nvae;
            }
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 285, 0, input);

            throw nvae;
        }
        switch (alt285) {
            case 1 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:517:6: pattern
                {
                pushFollow(FOLLOW_pattern_in_synpred7_babel173249);
                pattern();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:517:16: objelem_assign
                {
                pushFollow(FOLLOW_objelem_assign_in_synpred7_babel173253);
                objelem_assign();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:517:32: ( NL )?
        int alt286=2;
        int LA286_0 = input.LA(1);

        if ( (LA286_0==NL) ) {
            alt286=1;
        }
        switch (alt286) {
            case 1 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:517:32: NL
                {
                match(input,NL,FOLLOW_NL_in_synpred7_babel173256); if (state.failed) return ;

                }
                break;

        }

        match(input,ASSIGN,FOLLOW_ASSIGN_in_synpred7_babel173259); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred7_babel17

    // $ANTLR start synpred8_babel17
    public final void synpred8_babel17_fragment() throws RecognitionException {   
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:552:11: ( L_obj ( NL )? parents )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:552:12: L_obj ( NL )? parents
        {
        match(input,L_obj,FOLLOW_L_obj_in_synpred8_babel173488); if (state.failed) return ;
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:552:18: ( NL )?
        int alt287=2;
        int LA287_0 = input.LA(1);

        if ( (LA287_0==NL) ) {
            alt287=1;
        }
        switch (alt287) {
            case 1 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:552:18: NL
                {
                match(input,NL,FOLLOW_NL_in_synpred8_babel173490); if (state.failed) return ;

                }
                break;

        }

        pushFollow(FOLLOW_parents_in_synpred8_babel173493);
        parents();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred8_babel17

    // $ANTLR start synpred9_babel17
    public final void synpred9_babel17_fragment() throws RecognitionException {   
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:556:4: ( lambda_expr )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:556:5: lambda_expr
        {
        pushFollow(FOLLOW_lambda_expr_in_synpred9_babel173562);
        lambda_expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred9_babel17

    // $ANTLR start synpred10_babel17
    public final void synpred10_babel17_fragment() throws RecognitionException {   
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:557:4: ( lambda_expr_nobrackets )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:557:5: lambda_expr_nobrackets
        {
        pushFollow(FOLLOW_lambda_expr_nobrackets_in_synpred10_babel173573);
        lambda_expr_nobrackets();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred10_babel17

    // $ANTLR start synpred11_babel17
    public final void synpred11_babel17_fragment() throws RecognitionException {   
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:561:4: ( lambda_expr )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:561:5: lambda_expr
        {
        pushFollow(FOLLOW_lambda_expr_in_synpred11_babel173594);
        lambda_expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred11_babel17

    // $ANTLR start synpred12_babel17
    public final void synpred12_babel17_fragment() throws RecognitionException {   
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:562:4: ( lambda_expr_nobrackets )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:562:5: lambda_expr_nobrackets
        {
        pushFollow(FOLLOW_lambda_expr_nobrackets_in_synpred12_babel173605);
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


    protected DFA34 dfa34 = new DFA34(this);
    protected DFA63 dfa63 = new DFA63(this);
    protected DFA69 dfa69 = new DFA69(this);
    protected DFA66 dfa66 = new DFA66(this);
    protected DFA71 dfa71 = new DFA71(this);
    protected DFA97 dfa97 = new DFA97(this);
    protected DFA118 dfa118 = new DFA118(this);
    protected DFA128 dfa128 = new DFA128(this);
    protected DFA129 dfa129 = new DFA129(this);
    protected DFA279 dfa279 = new DFA279(this);
    static final String DFA34_eotS =
        "\42\uffff";
    static final String DFA34_eofS =
        "\42\uffff";
    static final String DFA34_minS =
        "\1\77\17\0\6\uffff\1\0\13\uffff";
    static final String DFA34_maxS =
        "\1\u009c\17\0\6\uffff\1\0\13\uffff";
    static final String DFA34_acceptS =
        "\20\uffff\6\2\1\uffff\4\2\1\4\1\1\1\3\1\6\1\7\1\10\1\5";
    static final String DFA34_specialS =
        "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1"+
        "\16\1\17\6\uffff\1\20\13\uffff}>";
    static final String[] DFA34_transitionS = {
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

    static final short[] DFA34_eot = DFA.unpackEncodedString(DFA34_eotS);
    static final short[] DFA34_eof = DFA.unpackEncodedString(DFA34_eofS);
    static final char[] DFA34_min = DFA.unpackEncodedStringToUnsignedChars(DFA34_minS);
    static final char[] DFA34_max = DFA.unpackEncodedStringToUnsignedChars(DFA34_maxS);
    static final short[] DFA34_accept = DFA.unpackEncodedString(DFA34_acceptS);
    static final short[] DFA34_special = DFA.unpackEncodedString(DFA34_specialS);
    static final short[][] DFA34_transition;

    static {
        int numStates = DFA34_transitionS.length;
        DFA34_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA34_transition[i] = DFA.unpackEncodedString(DFA34_transitionS[i]);
        }
    }

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = DFA34_eot;
            this.eof = DFA34_eof;
            this.min = DFA34_min;
            this.max = DFA34_max;
            this.accept = DFA34_accept;
            this.special = DFA34_special;
            this.transition = DFA34_transition;
        }
        public String getDescription() {
            return "405:1: bracket_pattern : ( ( Id ( NL )? L_as )=> Id ( NL )? L_as ( NL )? pattern -> ^( L_as Id pattern ) | ( protected_expr ( NL )? QUESTION_MARK )=> protected_expr ( NL )? QUESTION_MARK ( ( NL )? pattern )? -> ^( QUESTION_MARK protected_expr ( pattern )? ) | ( Id pattern )=> Id pattern -> ^( INNERVALUE_PATTERN Id pattern ) | L_val ( NL )? protected_expr_nc -> ^( L_val protected_expr_nc ) | L_for ( NL )? ( bracket_pattern ( ( NL )? COMMA ( NL )? bracket_pattern )* ( NL )? )? L_end -> ^( L_for ( bracket_pattern )* ) | ( pattern ( NL )? L_if )=> pattern ( NL )? L_if ( NL )? protected_expr_nc -> ^( IF_PATTERN pattern protected_expr_nc ) | ( pattern ( NL )? ':' )=> pattern ( NL )? ':' ( NL )? typeannotation -> ^( TYPE_PATTERN typeannotation pattern ) | pattern );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA34_0 = input.LA(1);

                         
                        int index34_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA34_0==Id) ) {s = 1;}

                        else if ( (LA34_0==ROUND_BRACKET_OPEN) ) {s = 2;}

                        else if ( (LA34_0==Constr) ) {s = 3;}

                        else if ( (LA34_0==UNDERSCORE) ) {s = 4;}

                        else if ( (LA34_0==String) ) {s = 5;}

                        else if ( (LA34_0==Num) ) {s = 6;}

                        else if ( (LA34_0==L_true) ) {s = 7;}

                        else if ( (LA34_0==L_false) ) {s = 8;}

                        else if ( (LA34_0==L_nil) ) {s = 9;}

                        else if ( ((LA34_0>=A_infinity && LA34_0<=U_infinity)) ) {s = 10;}

                        else if ( (LA34_0==MINUS) ) {s = 11;}

                        else if ( (LA34_0==SQUARE_BRACKET_OPEN) ) {s = 12;}

                        else if ( (LA34_0==CURLY_BRACKET_OPEN) ) {s = 13;}

                        else if ( (LA34_0==L_exception) ) {s = 14;}

                        else if ( ((LA34_0>=A_ELLIPSIS && LA34_0<=U_ELLIPSIS)) ) {s = 15;}

                        else if ( ((LA34_0>=L_concurrent && LA34_0<=L_lazy)||LA34_0==L_random||LA34_0==L_typeof||LA34_0==L_force) && (synpred2_babel17())) {s = 16;}

                        else if ( (LA34_0==A_NOT||LA34_0==U_NOT) && (synpred2_babel17())) {s = 17;}

                        else if ( (LA34_0==L_this) && (synpred2_babel17())) {s = 18;}

                        else if ( (LA34_0==L_if) && (synpred2_babel17())) {s = 19;}

                        else if ( (LA34_0==L_while) && (synpred2_babel17())) {s = 20;}

                        else if ( (LA34_0==L_match) && (synpred2_babel17())) {s = 21;}

                        else if ( (LA34_0==L_for) ) {s = 22;}

                        else if ( (LA34_0==L_try) && (synpred2_babel17())) {s = 23;}

                        else if ( (LA34_0==L_begin) && (synpred2_babel17())) {s = 24;}

                        else if ( (LA34_0==L_with) && (synpred2_babel17())) {s = 25;}

                        else if ( (LA34_0==L_obj) && (synpred2_babel17())) {s = 26;}

                        else if ( (LA34_0==L_val) ) {s = 27;}

                         
                        input.seek(index34_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA34_1 = input.LA(1);

                         
                        int index34_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_babel17()) ) {s = 28;}

                        else if ( (synpred2_babel17()) ) {s = 26;}

                        else if ( (synpred3_babel17()) ) {s = 29;}

                        else if ( (synpred4_babel17()) ) {s = 30;}

                        else if ( (synpred5_babel17()) ) {s = 31;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index34_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA34_2 = input.LA(1);

                         
                        int index34_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 26;}

                        else if ( (synpred4_babel17()) ) {s = 30;}

                        else if ( (synpred5_babel17()) ) {s = 31;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index34_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA34_3 = input.LA(1);

                         
                        int index34_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 26;}

                        else if ( (synpred4_babel17()) ) {s = 30;}

                        else if ( (synpred5_babel17()) ) {s = 31;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index34_3);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA34_4 = input.LA(1);

                         
                        int index34_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 26;}

                        else if ( (synpred4_babel17()) ) {s = 30;}

                        else if ( (synpred5_babel17()) ) {s = 31;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index34_4);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA34_5 = input.LA(1);

                         
                        int index34_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 26;}

                        else if ( (synpred4_babel17()) ) {s = 30;}

                        else if ( (synpred5_babel17()) ) {s = 31;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index34_5);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA34_6 = input.LA(1);

                         
                        int index34_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 26;}

                        else if ( (synpred4_babel17()) ) {s = 30;}

                        else if ( (synpred5_babel17()) ) {s = 31;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index34_6);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA34_7 = input.LA(1);

                         
                        int index34_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 26;}

                        else if ( (synpred4_babel17()) ) {s = 30;}

                        else if ( (synpred5_babel17()) ) {s = 31;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index34_7);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA34_8 = input.LA(1);

                         
                        int index34_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 26;}

                        else if ( (synpred4_babel17()) ) {s = 30;}

                        else if ( (synpred5_babel17()) ) {s = 31;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index34_8);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA34_9 = input.LA(1);

                         
                        int index34_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 26;}

                        else if ( (synpred4_babel17()) ) {s = 30;}

                        else if ( (synpred5_babel17()) ) {s = 31;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index34_9);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA34_10 = input.LA(1);

                         
                        int index34_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 26;}

                        else if ( (synpred4_babel17()) ) {s = 30;}

                        else if ( (synpred5_babel17()) ) {s = 31;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index34_10);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA34_11 = input.LA(1);

                         
                        int index34_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 26;}

                        else if ( (synpred4_babel17()) ) {s = 30;}

                        else if ( (synpred5_babel17()) ) {s = 31;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index34_11);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA34_12 = input.LA(1);

                         
                        int index34_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 26;}

                        else if ( (synpred4_babel17()) ) {s = 30;}

                        else if ( (synpred5_babel17()) ) {s = 31;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index34_12);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA34_13 = input.LA(1);

                         
                        int index34_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 26;}

                        else if ( (synpred4_babel17()) ) {s = 30;}

                        else if ( (synpred5_babel17()) ) {s = 31;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index34_13);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA34_14 = input.LA(1);

                         
                        int index34_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 26;}

                        else if ( (synpred4_babel17()) ) {s = 30;}

                        else if ( (synpred5_babel17()) ) {s = 31;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index34_14);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA34_15 = input.LA(1);

                         
                        int index34_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 26;}

                        else if ( (synpred4_babel17()) ) {s = 30;}

                        else if ( (synpred5_babel17()) ) {s = 31;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index34_15);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA34_22 = input.LA(1);

                         
                        int index34_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index34_22);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 34, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA63_eotS =
        "\23\uffff";
    static final String DFA63_eofS =
        "\23\uffff";
    static final String DFA63_minS =
        "\1\126\10\uffff\1\126\2\uffff\1\77\1\126\2\uffff\1\77\2\uffff";
    static final String DFA63_maxS =
        "\1\u009c\10\uffff\1\u0093\2\uffff\1\u009c\1\u0093\2\uffff\1\u009c"+
        "\2\uffff";
    static final String DFA63_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\uffff\1\13\1\14\2\uffff"+
        "\1\12\1\11\1\uffff\1\15\1\16";
    static final String DFA63_specialS =
        "\23\uffff}>";
    static final String[] DFA63_transitionS = {
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
            "\2\17\70\uffff\1\15\2\uffff\1\16",
            "",
            "",
            "\1\21\1\uffff\3\21\3\uffff\2\21\2\uffff\1\21\2\uffff\1\21\2"+
            "\uffff\1\21\2\uffff\1\21\1\uffff\5\21\1\uffff\5\21\4\uffff\1"+
            "\21\16\uffff\1\21\5\uffff\1\21\2\uffff\1\21\10\uffff\2\22\2"+
            "\21\3\uffff\1\21\2\uffff\1\20\3\21\1\uffff\2\21\1\uffff\1\21"+
            "\1\uffff\3\21",
            "\2\17\73\uffff\1\16",
            "",
            "",
            "\1\21\1\uffff\3\21\3\uffff\2\21\2\uffff\1\21\2\uffff\1\21\2"+
            "\uffff\1\21\2\uffff\1\21\1\uffff\5\21\1\uffff\5\21\4\uffff\1"+
            "\21\16\uffff\1\21\5\uffff\1\21\2\uffff\1\21\10\uffff\2\22\2"+
            "\21\3\uffff\1\21\3\uffff\3\21\1\uffff\2\21\1\uffff\1\21\1\uffff"+
            "\3\21",
            "",
            ""
    };

    static final short[] DFA63_eot = DFA.unpackEncodedString(DFA63_eotS);
    static final short[] DFA63_eof = DFA.unpackEncodedString(DFA63_eofS);
    static final char[] DFA63_min = DFA.unpackEncodedStringToUnsignedChars(DFA63_minS);
    static final char[] DFA63_max = DFA.unpackEncodedStringToUnsignedChars(DFA63_maxS);
    static final short[] DFA63_accept = DFA.unpackEncodedString(DFA63_acceptS);
    static final short[] DFA63_special = DFA.unpackEncodedString(DFA63_specialS);
    static final short[][] DFA63_transition;

    static {
        int numStates = DFA63_transitionS.length;
        DFA63_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA63_transition[i] = DFA.unpackEncodedString(DFA63_transitionS[i]);
        }
    }

    class DFA63 extends DFA {

        public DFA63(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 63;
            this.eot = DFA63_eot;
            this.eof = DFA63_eof;
            this.min = DFA63_min;
            this.max = DFA63_max;
            this.accept = DFA63_accept;
            this.special = DFA63_special;
            this.transition = DFA63_transition;
        }
        public String getDescription() {
            return "424:1: primitive_pattern : ( Id | '_' -> ANY | String | Num | L_true | L_false | L_nil | token_infinity | '-' ( NL )? token_infinity -> ^( UMINUS token_infinity ) | '-' ( NL )? Num -> ^( UMINUS Num ) | '[' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* )? ']' -> ^( SQUARE_LIST ( bracket_pattern )* ) | '(' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* ( COMMA ( NL )? )? )? ')' -> ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( bracket_pattern )* ) ) | '{' ( NL )? ( mselem_pattern ( NL )? ( COMMA ( NL )? mselem_pattern ( NL )? )* )? '}' -> ^( MAP_OR_SET_OR_OBJ ( mselem_pattern )* ) | '{' ( NL )? token_ARROW ( NL )? '}' -> ^( EMPTY_MAP ) );";
        }
    }
    static final String DFA69_eotS =
        "\4\uffff";
    static final String DFA69_eofS =
        "\2\3\2\uffff";
    static final String DFA69_minS =
        "\2\77\2\uffff";
    static final String DFA69_maxS =
        "\2\u00a1\2\uffff";
    static final String DFA69_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA69_specialS =
        "\4\uffff}>";
    static final String[] DFA69_transitionS = {
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

    static final short[] DFA69_eot = DFA.unpackEncodedString(DFA69_eotS);
    static final short[] DFA69_eof = DFA.unpackEncodedString(DFA69_eofS);
    static final char[] DFA69_min = DFA.unpackEncodedStringToUnsignedChars(DFA69_minS);
    static final char[] DFA69_max = DFA.unpackEncodedStringToUnsignedChars(DFA69_maxS);
    static final short[] DFA69_accept = DFA.unpackEncodedString(DFA69_acceptS);
    static final short[] DFA69_special = DFA.unpackEncodedString(DFA69_specialS);
    static final short[][] DFA69_transition;

    static {
        int numStates = DFA69_transitionS.length;
        DFA69_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA69_transition[i] = DFA.unpackEncodedString(DFA69_transitionS[i]);
        }
    }

    class DFA69 extends DFA {

        public DFA69(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 69;
            this.eot = DFA69_eot;
            this.eof = DFA69_eof;
            this.min = DFA69_min;
            this.max = DFA69_max;
            this.accept = DFA69_accept;
            this.special = DFA69_special;
            this.transition = DFA69_transition;
        }
        public String getDescription() {
            return "446:1: block : ( ( sep )? statement ( sep statement )* ( sep )? -> ^( BLOCK ( statement )* ) | ( sep )? -> ^( BLOCK ) );";
        }
    }
    static final String DFA66_eotS =
        "\4\uffff";
    static final String DFA66_eofS =
        "\2\2\2\uffff";
    static final String DFA66_minS =
        "\1\100\1\77\2\uffff";
    static final String DFA66_maxS =
        "\1\u0090\1\u00a1\2\uffff";
    static final String DFA66_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA66_specialS =
        "\4\uffff}>";
    static final String[] DFA66_transitionS = {
            "\1\2\4\uffff\2\2\5\uffff\1\2\45\uffff\1\1\35\uffff\1\1",
            "\1\3\1\2\3\3\1\uffff\2\2\2\3\1\uffff\2\3\1\2\1\uffff\2\3\1"+
            "\uffff\1\3\2\uffff\1\3\1\uffff\13\3\2\uffff\5\3\12\uffff\1\1"+
            "\1\uffff\1\3\5\uffff\1\3\2\uffff\1\3\12\uffff\2\3\3\uffff\1"+
            "\3\2\uffff\1\1\3\3\1\uffff\2\3\1\uffff\1\3\1\uffff\1\3\1\uffff"+
            "\1\3\1\uffff\4\3",
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
            return "()* loopback of 446:25: ( sep statement )*";
        }
    }
    static final String DFA71_eotS =
        "\16\uffff";
    static final String DFA71_eofS =
        "\16\uffff";
    static final String DFA71_minS =
        "\1\77\15\uffff";
    static final String DFA71_maxS =
        "\1\u00a1\15\uffff";
    static final String DFA71_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15";
    static final String DFA71_specialS =
        "\16\uffff}>";
    static final String[] DFA71_transitionS = {
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

    static final short[] DFA71_eot = DFA.unpackEncodedString(DFA71_eotS);
    static final short[] DFA71_eof = DFA.unpackEncodedString(DFA71_eofS);
    static final char[] DFA71_min = DFA.unpackEncodedStringToUnsignedChars(DFA71_minS);
    static final char[] DFA71_max = DFA.unpackEncodedStringToUnsignedChars(DFA71_maxS);
    static final short[] DFA71_accept = DFA.unpackEncodedString(DFA71_acceptS);
    static final short[] DFA71_special = DFA.unpackEncodedString(DFA71_specialS);
    static final short[][] DFA71_transition;

    static {
        int numStates = DFA71_transitionS.length;
        DFA71_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA71_transition[i] = DFA.unpackEncodedString(DFA71_transitionS[i]);
        }
    }

    class DFA71 extends DFA {

        public DFA71(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 71;
            this.eot = DFA71_eot;
            this.eof = DFA71_eof;
            this.min = DFA71_min;
            this.max = DFA71_max;
            this.accept = DFA71_accept;
            this.special = DFA71_special;
            this.transition = DFA71_transition;
        }
        public String getDescription() {
            return "452:1: statement : ( st_typedef | st_val | st_def | st_yield | st_memoize | st_private | st_module | st_import | expr_or_assign | PRAGMA_PRINT expr -> ^( PRAGMA_PRINT expr ) | PRAGMA_LOG expr -> ^( PRAGMA_LOG expr ) | PRAGMA_PROFILE expr -> ^( PRAGMA_PROFILE expr ) | PRAGMA_ASSERT expr -> ^( PRAGMA_ASSERT expr ) );";
        }
    }
    static final String DFA97_eotS =
        "\20\uffff";
    static final String DFA97_eofS =
        "\20\uffff";
    static final String DFA97_minS =
        "\1\126\15\0\2\uffff";
    static final String DFA97_maxS =
        "\1\u009c\15\0\2\uffff";
    static final String DFA97_acceptS =
        "\16\uffff\1\1\1\2";
    static final String DFA97_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\2\uffff}>";
    static final String[] DFA97_transitionS = {
            "\2\10\4\uffff\1\5\1\6\2\uffff\1\7\23\uffff\1\11\34\uffff\1\15"+
            "\1\1\1\4\1\uffff\1\3\1\13\1\uffff\1\12\1\uffff\1\14\1\uffff"+
            "\1\2",
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
            ""
    };

    static final short[] DFA97_eot = DFA.unpackEncodedString(DFA97_eotS);
    static final short[] DFA97_eof = DFA.unpackEncodedString(DFA97_eofS);
    static final char[] DFA97_min = DFA.unpackEncodedStringToUnsignedChars(DFA97_minS);
    static final char[] DFA97_max = DFA.unpackEncodedStringToUnsignedChars(DFA97_maxS);
    static final short[] DFA97_accept = DFA.unpackEncodedString(DFA97_acceptS);
    static final short[] DFA97_special = DFA.unpackEncodedString(DFA97_specialS);
    static final short[][] DFA97_transition;

    static {
        int numStates = DFA97_transitionS.length;
        DFA97_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA97_transition[i] = DFA.unpackEncodedString(DFA97_transitionS[i]);
        }
    }

    class DFA97 extends DFA {

        public DFA97(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 97;
            this.eot = DFA97_eot;
            this.eof = DFA97_eof;
            this.min = DFA97_min;
            this.max = DFA97_max;
            this.accept = DFA97_accept;
            this.special = DFA97_special;
            this.transition = DFA97_transition;
        }
        public String getDescription() {
            return "479:1: typedef_clause : ( ( defpattern ( NL )? '=' )=> defpattern ( NL )? '=' ( NL )? expr -> ^( TYPEDEF_CLAUSE defpattern expr ) | defpattern -> ^( TYPEDEF_CLAUSE defpattern ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA97_1 = input.LA(1);

                         
                        int index97_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_babel17()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index97_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA97_2 = input.LA(1);

                         
                        int index97_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_babel17()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index97_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA97_3 = input.LA(1);

                         
                        int index97_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_babel17()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index97_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA97_4 = input.LA(1);

                         
                        int index97_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_babel17()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index97_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA97_5 = input.LA(1);

                         
                        int index97_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_babel17()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index97_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA97_6 = input.LA(1);

                         
                        int index97_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_babel17()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index97_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA97_7 = input.LA(1);

                         
                        int index97_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_babel17()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index97_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA97_8 = input.LA(1);

                         
                        int index97_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_babel17()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index97_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA97_9 = input.LA(1);

                         
                        int index97_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_babel17()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index97_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA97_10 = input.LA(1);

                         
                        int index97_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_babel17()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index97_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA97_11 = input.LA(1);

                         
                        int index97_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_babel17()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index97_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA97_12 = input.LA(1);

                         
                        int index97_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_babel17()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index97_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA97_13 = input.LA(1);

                         
                        int index97_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_babel17()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index97_13);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 97, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA118_eotS =
        "\34\uffff";
    static final String DFA118_eofS =
        "\34\uffff";
    static final String DFA118_minS =
        "\1\77\17\0\14\uffff";
    static final String DFA118_maxS =
        "\1\u009c\17\0\14\uffff";
    static final String DFA118_acceptS =
        "\20\uffff\1\2\12\uffff\1\1";
    static final String DFA118_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\14\uffff}>";
    static final String[] DFA118_transitionS = {
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

    static final short[] DFA118_eot = DFA.unpackEncodedString(DFA118_eotS);
    static final short[] DFA118_eof = DFA.unpackEncodedString(DFA118_eofS);
    static final char[] DFA118_min = DFA.unpackEncodedStringToUnsignedChars(DFA118_minS);
    static final char[] DFA118_max = DFA.unpackEncodedStringToUnsignedChars(DFA118_maxS);
    static final short[] DFA118_accept = DFA.unpackEncodedString(DFA118_acceptS);
    static final short[] DFA118_special = DFA.unpackEncodedString(DFA118_specialS);
    static final short[][] DFA118_transition;

    static {
        int numStates = DFA118_transitionS.length;
        DFA118_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA118_transition[i] = DFA.unpackEncodedString(DFA118_transitionS[i]);
        }
    }

    class DFA118 extends DFA {

        public DFA118(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 118;
            this.eot = DFA118_eot;
            this.eof = DFA118_eof;
            this.min = DFA118_min;
            this.max = DFA118_max;
            this.accept = DFA118_accept;
            this.special = DFA118_special;
            this.transition = DFA118_transition;
        }
        public String getDescription() {
            return "516:1: expr_or_assign : ( ( ( pattern | objelem_assign ) ( NL )? '=' )=> ( pattern | objelem_assign ) ( NL )? '=' ( NL )? expr -> ^( ASSIGN ( pattern )* ( objelem_assign )* expr ) | expr );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA118_1 = input.LA(1);

                         
                        int index118_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index118_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA118_2 = input.LA(1);

                         
                        int index118_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index118_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA118_3 = input.LA(1);

                         
                        int index118_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index118_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA118_4 = input.LA(1);

                         
                        int index118_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index118_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA118_5 = input.LA(1);

                         
                        int index118_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index118_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA118_6 = input.LA(1);

                         
                        int index118_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index118_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA118_7 = input.LA(1);

                         
                        int index118_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index118_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA118_8 = input.LA(1);

                         
                        int index118_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index118_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA118_9 = input.LA(1);

                         
                        int index118_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index118_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA118_10 = input.LA(1);

                         
                        int index118_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index118_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA118_11 = input.LA(1);

                         
                        int index118_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index118_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA118_12 = input.LA(1);

                         
                        int index118_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index118_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA118_13 = input.LA(1);

                         
                        int index118_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index118_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA118_14 = input.LA(1);

                         
                        int index118_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index118_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA118_15 = input.LA(1);

                         
                        int index118_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index118_15);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 118, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA128_eotS =
        "\33\uffff";
    static final String DFA128_eofS =
        "\33\uffff";
    static final String DFA128_minS =
        "\1\77\3\0\1\uffff\12\0\14\uffff";
    static final String DFA128_maxS =
        "\1\u009c\3\0\1\uffff\12\0\14\uffff";
    static final String DFA128_acceptS =
        "\4\uffff\1\2\12\uffff\1\2\1\3\11\uffff\1\1";
    static final String DFA128_specialS =
        "\1\0\1\1\1\2\1\3\1\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\14\uffff}>";
    static final String[] DFA128_transitionS = {
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

    static final short[] DFA128_eot = DFA.unpackEncodedString(DFA128_eotS);
    static final short[] DFA128_eof = DFA.unpackEncodedString(DFA128_eofS);
    static final char[] DFA128_min = DFA.unpackEncodedStringToUnsignedChars(DFA128_minS);
    static final char[] DFA128_max = DFA.unpackEncodedStringToUnsignedChars(DFA128_maxS);
    static final short[] DFA128_accept = DFA.unpackEncodedString(DFA128_acceptS);
    static final short[] DFA128_special = DFA.unpackEncodedString(DFA128_specialS);
    static final short[][] DFA128_transition;

    static {
        int numStates = DFA128_transitionS.length;
        DFA128_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA128_transition[i] = DFA.unpackEncodedString(DFA128_transitionS[i]);
        }
    }

    class DFA128 extends DFA {

        public DFA128(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 128;
            this.eot = DFA128_eot;
            this.eof = DFA128_eof;
            this.min = DFA128_min;
            this.max = DFA128_max;
            this.accept = DFA128_accept;
            this.special = DFA128_special;
            this.transition = DFA128_transition;
        }
        public String getDescription() {
            return "555:1: lop_expr : ( ( lambda_expr )=> lambda_expr | ( lambda_expr_nobrackets )=> lambda_expr_nobrackets | op_expr );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA128_0 = input.LA(1);

                         
                        int index128_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA128_0==ROUND_BRACKET_OPEN) ) {s = 1;}

                        else if ( (LA128_0==Constr) ) {s = 2;}

                        else if ( (LA128_0==Id) ) {s = 3;}

                        else if ( (LA128_0==UNDERSCORE) && (synpred10_babel17())) {s = 4;}

                        else if ( (LA128_0==String) ) {s = 5;}

                        else if ( (LA128_0==Num) ) {s = 6;}

                        else if ( (LA128_0==L_true) ) {s = 7;}

                        else if ( (LA128_0==L_false) ) {s = 8;}

                        else if ( (LA128_0==L_nil) ) {s = 9;}

                        else if ( ((LA128_0>=A_infinity && LA128_0<=U_infinity)) ) {s = 10;}

                        else if ( (LA128_0==MINUS) ) {s = 11;}

                        else if ( (LA128_0==SQUARE_BRACKET_OPEN) ) {s = 12;}

                        else if ( (LA128_0==CURLY_BRACKET_OPEN) ) {s = 13;}

                        else if ( (LA128_0==L_exception) ) {s = 14;}

                        else if ( ((LA128_0>=A_ELLIPSIS && LA128_0<=U_ELLIPSIS)) && (synpred10_babel17())) {s = 15;}

                        else if ( (LA128_0==L_begin||(LA128_0>=L_with && LA128_0<=L_if)||(LA128_0>=L_while && LA128_0<=L_for)||LA128_0==L_match||LA128_0==L_try||(LA128_0>=L_concurrent && LA128_0<=L_lazy)||(LA128_0>=L_this && LA128_0<=L_random)||LA128_0==L_typeof||LA128_0==A_NOT||LA128_0==U_NOT||LA128_0==L_force) ) {s = 16;}

                         
                        input.seek(index128_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA128_1 = input.LA(1);

                         
                        int index128_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_babel17()) ) {s = 26;}

                        else if ( (synpred10_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index128_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA128_2 = input.LA(1);

                         
                        int index128_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index128_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA128_3 = input.LA(1);

                         
                        int index128_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index128_3);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA128_5 = input.LA(1);

                         
                        int index128_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index128_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA128_6 = input.LA(1);

                         
                        int index128_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index128_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA128_7 = input.LA(1);

                         
                        int index128_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index128_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA128_8 = input.LA(1);

                         
                        int index128_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index128_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA128_9 = input.LA(1);

                         
                        int index128_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index128_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA128_10 = input.LA(1);

                         
                        int index128_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index128_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA128_11 = input.LA(1);

                         
                        int index128_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index128_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA128_12 = input.LA(1);

                         
                        int index128_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index128_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA128_13 = input.LA(1);

                         
                        int index128_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index128_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA128_14 = input.LA(1);

                         
                        int index128_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index128_14);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 128, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA129_eotS =
        "\33\uffff";
    static final String DFA129_eofS =
        "\33\uffff";
    static final String DFA129_minS =
        "\1\77\3\0\1\uffff\12\0\14\uffff";
    static final String DFA129_maxS =
        "\1\u009c\3\0\1\uffff\12\0\14\uffff";
    static final String DFA129_acceptS =
        "\4\uffff\1\2\12\uffff\1\2\1\3\11\uffff\1\1";
    static final String DFA129_specialS =
        "\1\0\1\1\1\2\1\3\1\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\14\uffff}>";
    static final String[] DFA129_transitionS = {
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

    static final short[] DFA129_eot = DFA.unpackEncodedString(DFA129_eotS);
    static final short[] DFA129_eof = DFA.unpackEncodedString(DFA129_eofS);
    static final char[] DFA129_min = DFA.unpackEncodedStringToUnsignedChars(DFA129_minS);
    static final char[] DFA129_max = DFA.unpackEncodedStringToUnsignedChars(DFA129_maxS);
    static final short[] DFA129_accept = DFA.unpackEncodedString(DFA129_acceptS);
    static final short[] DFA129_special = DFA.unpackEncodedString(DFA129_specialS);
    static final short[][] DFA129_transition;

    static {
        int numStates = DFA129_transitionS.length;
        DFA129_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA129_transition[i] = DFA.unpackEncodedString(DFA129_transitionS[i]);
        }
    }

    class DFA129 extends DFA {

        public DFA129(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 129;
            this.eot = DFA129_eot;
            this.eof = DFA129_eof;
            this.min = DFA129_min;
            this.max = DFA129_max;
            this.accept = DFA129_accept;
            this.special = DFA129_special;
            this.transition = DFA129_transition;
        }
        public String getDescription() {
            return "560:1: p_lop_expr : ( ( lambda_expr )=> lambda_expr | ( lambda_expr_nobrackets )=> lambda_expr_nobrackets | p_op_expr );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA129_0 = input.LA(1);

                         
                        int index129_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA129_0==ROUND_BRACKET_OPEN) ) {s = 1;}

                        else if ( (LA129_0==Constr) ) {s = 2;}

                        else if ( (LA129_0==Id) ) {s = 3;}

                        else if ( (LA129_0==UNDERSCORE) && (synpred12_babel17())) {s = 4;}

                        else if ( (LA129_0==String) ) {s = 5;}

                        else if ( (LA129_0==Num) ) {s = 6;}

                        else if ( (LA129_0==L_true) ) {s = 7;}

                        else if ( (LA129_0==L_false) ) {s = 8;}

                        else if ( (LA129_0==L_nil) ) {s = 9;}

                        else if ( ((LA129_0>=A_infinity && LA129_0<=U_infinity)) ) {s = 10;}

                        else if ( (LA129_0==MINUS) ) {s = 11;}

                        else if ( (LA129_0==SQUARE_BRACKET_OPEN) ) {s = 12;}

                        else if ( (LA129_0==CURLY_BRACKET_OPEN) ) {s = 13;}

                        else if ( (LA129_0==L_exception) ) {s = 14;}

                        else if ( ((LA129_0>=A_ELLIPSIS && LA129_0<=U_ELLIPSIS)) && (synpred12_babel17())) {s = 15;}

                        else if ( (LA129_0==L_begin||(LA129_0>=L_with && LA129_0<=L_if)||(LA129_0>=L_while && LA129_0<=L_for)||LA129_0==L_match||LA129_0==L_try||(LA129_0>=L_concurrent && LA129_0<=L_lazy)||(LA129_0>=L_this && LA129_0<=L_random)||LA129_0==L_typeof||LA129_0==A_NOT||LA129_0==U_NOT||LA129_0==L_force) ) {s = 16;}

                         
                        input.seek(index129_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA129_1 = input.LA(1);

                         
                        int index129_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_babel17()) ) {s = 26;}

                        else if ( (synpred12_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index129_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA129_2 = input.LA(1);

                         
                        int index129_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index129_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA129_3 = input.LA(1);

                         
                        int index129_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index129_3);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA129_5 = input.LA(1);

                         
                        int index129_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index129_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA129_6 = input.LA(1);

                         
                        int index129_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index129_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA129_7 = input.LA(1);

                         
                        int index129_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index129_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA129_8 = input.LA(1);

                         
                        int index129_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index129_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA129_9 = input.LA(1);

                         
                        int index129_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index129_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA129_10 = input.LA(1);

                         
                        int index129_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index129_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA129_11 = input.LA(1);

                         
                        int index129_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index129_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA129_12 = input.LA(1);

                         
                        int index129_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index129_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA129_13 = input.LA(1);

                         
                        int index129_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index129_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA129_14 = input.LA(1);

                         
                        int index129_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index129_14);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 129, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA279_eotS =
        "\20\uffff";
    static final String DFA279_eofS =
        "\20\uffff";
    static final String DFA279_minS =
        "\1\77\10\uffff\1\77\4\uffff\1\77\1\uffff";
    static final String DFA279_maxS =
        "\1\u009a\10\uffff\1\u009d\4\uffff\1\u009d\1\uffff";
    static final String DFA279_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\uffff\1\12\1\13\1\14"+
        "\1\15\1\uffff\1\11";
    static final String DFA279_specialS =
        "\20\uffff}>";
    static final String[] DFA279_transitionS = {
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

    static final short[] DFA279_eot = DFA.unpackEncodedString(DFA279_eotS);
    static final short[] DFA279_eof = DFA.unpackEncodedString(DFA279_eofS);
    static final char[] DFA279_min = DFA.unpackEncodedStringToUnsignedChars(DFA279_minS);
    static final char[] DFA279_max = DFA.unpackEncodedStringToUnsignedChars(DFA279_maxS);
    static final short[] DFA279_accept = DFA.unpackEncodedString(DFA279_acceptS);
    static final short[] DFA279_special = DFA.unpackEncodedString(DFA279_specialS);
    static final short[][] DFA279_transition;

    static {
        int numStates = DFA279_transitionS.length;
        DFA279_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA279_transition[i] = DFA.unpackEncodedString(DFA279_transitionS[i]);
        }
    }

    class DFA279 extends DFA {

        public DFA279(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 279;
            this.eot = DFA279_eot;
            this.eof = DFA279_eof;
            this.min = DFA279_min;
            this.max = DFA279_max;
            this.accept = DFA279_accept;
            this.special = DFA279_special;
            this.transition = DFA279_transition;
        }
        public String getDescription() {
            return "749:1: primitive_expr : ( Num | String | Id | Constr | L_true | L_false | L_this | L_nil | type_expr | token_infinity | list_expr | with_control_expr | map_or_set_expr );";
        }
    }
 

    public static final BitSet FOLLOW_block_in_prog238 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_prog240 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_Id_in_typeid1657 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000010800L});
    public static final BitSet FOLLOW_NL_in_typeid1660 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_PERIOD_in_typeid1663 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000050000L});
    public static final BitSet FOLLOW_NL_in_typeid1665 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_Id_in_typeid1668 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000010800L});
    public static final BitSet FOLLOW_typeid_in_typeannotation1688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_val_in_typeannotation1693 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_typeannotation1695 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_protected_expr_nc_in_typeannotation1698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Constr_in_pattern1715 = new BitSet(new long[]{0x0000000000000002L,0x0010000130C20000L,0x00000000156F0300L});
    public static final BitSet FOLLOW_NL_in_pattern1718 = new BitSet(new long[]{0x0000000000000000L,0x0010000130C20000L,0x00000000156E0300L});
    public static final BitSet FOLLOW_pattern_in_pattern1721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitive_pattern_in_pattern1737 = new BitSet(new long[]{0x0000000000000002L,0xC000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_NL_in_pattern1740 = new BitSet(new long[]{0x0000000000000000L,0xC000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_token_DOUBLE_COLON_in_pattern1743 = new BitSet(new long[]{0x0000000000000000L,0x0010000130C00000L,0x00000000156D0000L});
    public static final BitSet FOLLOW_NL_in_pattern1745 = new BitSet(new long[]{0x0000000000000000L,0x0010000130C00000L,0x00000000156C0000L});
    public static final BitSet FOLLOW_primitive_pattern_in_pattern1748 = new BitSet(new long[]{0x0000000000000002L,0xC000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_L_exception_in_pattern1767 = new BitSet(new long[]{0x0000000000000000L,0x0010000130C20000L,0x00000000156F0300L});
    public static final BitSet FOLLOW_NL_in_pattern1769 = new BitSet(new long[]{0x0000000000000000L,0x0010000130C20000L,0x00000000156E0300L});
    public static final BitSet FOLLOW_pattern_in_pattern1772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_ELLIPSIS_in_pattern1785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitive_pattern_in_defpattern1795 = new BitSet(new long[]{0x0000000000000002L,0xC000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_NL_in_defpattern1798 = new BitSet(new long[]{0x0000000000000000L,0xC000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_token_DOUBLE_COLON_in_defpattern1801 = new BitSet(new long[]{0x0000000000000000L,0x0010000130C00000L,0x00000000156D0000L});
    public static final BitSet FOLLOW_NL_in_defpattern1803 = new BitSet(new long[]{0x0000000000000000L,0x0010000130C00000L,0x00000000156C0000L});
    public static final BitSet FOLLOW_primitive_pattern_in_defpattern1806 = new BitSet(new long[]{0x0000000000000002L,0xC000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_Constr_in_defpattern1824 = new BitSet(new long[]{0x0000000000000002L,0x0010000130C00000L,0x00000000156E0000L});
    public static final BitSet FOLLOW_defpattern_in_defpattern1826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Id_in_bracket_pattern1863 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L,0x0000000000010000L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1865 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_L_as_in_bracket_pattern1868 = new BitSet(new long[]{0x0000000000000000L,0x0010000130C20000L,0x00000000156F0300L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1870 = new BitSet(new long[]{0x0000000000000000L,0x0010000130C20000L,0x00000000156E0300L});
    public static final BitSet FOLLOW_pattern_in_bracket_pattern1873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protected_expr_in_bracket_pattern1902 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000011000L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1904 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_QUESTION_MARK_in_bracket_pattern1907 = new BitSet(new long[]{0x0000000000000002L,0x0010000130C20000L,0x00000000156F0300L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1910 = new BitSet(new long[]{0x0000000000000000L,0x0010000130C20000L,0x00000000156E0300L});
    public static final BitSet FOLLOW_pattern_in_bracket_pattern1913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Id_in_bracket_pattern1939 = new BitSet(new long[]{0x0000000000000000L,0x0010000130C20000L,0x00000000156E0300L});
    public static final BitSet FOLLOW_pattern_in_bracket_pattern1941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_val_in_bracket_pattern1956 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1958 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_protected_expr_nc_in_bracket_pattern1961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_for_in_bracket_pattern1980 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2498FL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1982 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2498FL,0x00000000156F2300L});
    public static final BitSet FOLLOW_bracket_pattern_in_bracket_pattern1986 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L,0x0000000000010400L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1990 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_COMMA_in_bracket_pattern1993 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2498EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1995 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2498EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_bracket_pattern_in_bracket_pattern1998 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L,0x0000000000010400L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern2003 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_L_end_in_bracket_pattern2008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_bracket_pattern2033 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L,0x0000000000010000L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern2035 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_L_if_in_bracket_pattern2038 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern2040 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_protected_expr_nc_in_bracket_pattern2043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_bracket_pattern2069 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020010000L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern2071 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_COLON_in_bracket_pattern2074 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L,0x0000000000050000L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern2076 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L,0x0000000000050000L});
    public static final BitSet FOLLOW_typeannotation_in_bracket_pattern2079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_bracket_pattern2094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_ARROW_in_arrow_or_assign2104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGN_in_arrow_or_assign2115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracket_pattern_in_mselem_pattern2130 = new BitSet(new long[]{0x0000000200000002L,0x0000000000000000L,0x00000000000100C0L});
    public static final BitSet FOLLOW_NL_in_mselem_pattern2133 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000000L,0x00000000000100C0L});
    public static final BitSet FOLLOW_arrow_or_assign_in_mselem_pattern2136 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2498EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_mselem_pattern2138 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2498EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_bracket_pattern_in_mselem_pattern2141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Id_in_primitive_pattern2170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNDERSCORE_in_primitive_pattern2175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_String_in_primitive_pattern2184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Num_in_primitive_pattern2189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_true_in_primitive_pattern2194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_false_in_primitive_pattern2199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_nil_in_primitive_pattern2204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_infinity_in_primitive_pattern2209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_primitive_pattern2214 = new BitSet(new long[]{0x0000000000000000L,0x0000000000C00000L,0x0000000000010000L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2216 = new BitSet(new long[]{0x0000000000000000L,0x0000000000C00000L});
    public static final BitSet FOLLOW_token_infinity_in_primitive_pattern2219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_primitive_pattern2232 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000090000L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2234 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_Num_in_primitive_pattern2237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SQUARE_BRACKET_OPEN_in_primitive_pattern2250 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2498EL,0x00000000176F2300L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2253 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2498EL,0x00000000176F2300L});
    public static final BitSet FOLLOW_bracket_pattern_in_primitive_pattern2257 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002010400L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2259 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000400L});
    public static final BitSet FOLLOW_COMMA_in_primitive_pattern2264 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2498EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2266 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2498EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_bracket_pattern_in_primitive_pattern2269 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002010400L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2271 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000400L});
    public static final BitSet FOLLOW_SQUARE_BRACKET_CLOSE_in_primitive_pattern2279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROUND_BRACKET_OPEN_in_primitive_pattern2299 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2498EL,0x0000000015EF2300L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2302 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2498EL,0x0000000015EF2300L});
    public static final BitSet FOLLOW_bracket_pattern_in_primitive_pattern2306 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000810400L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2308 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800400L});
    public static final BitSet FOLLOW_COMMA_in_primitive_pattern2313 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2498EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2316 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2498EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_bracket_pattern_in_primitive_pattern2319 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000810400L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2321 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800400L});
    public static final BitSet FOLLOW_COMMA_in_primitive_pattern2327 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000810000L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2329 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_ROUND_BRACKET_CLOSE_in_primitive_pattern2336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURLY_BRACKET_OPEN_in_primitive_pattern2368 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2498EL,0x000000001D6F2300L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2371 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2498EL,0x000000001D6F2300L});
    public static final BitSet FOLLOW_mselem_pattern_in_primitive_pattern2375 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008010400L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2377 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000400L});
    public static final BitSet FOLLOW_COMMA_in_primitive_pattern2382 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2498EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2385 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2498EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_mselem_pattern_in_primitive_pattern2388 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008010400L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2390 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000400L});
    public static final BitSet FOLLOW_CURLY_BRACKET_CLOSE_in_primitive_pattern2398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURLY_BRACKET_OPEN_in_primitive_pattern2416 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000100C0L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2418 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_token_ARROW_in_primitive_pattern2421 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008010000L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2423 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_CURLY_BRACKET_CLOSE_in_primitive_pattern2426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_sep2442 = new BitSet(new long[]{0x0000000000000002L,0x0004000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_sep_in_block2458 = new BitSet(new long[]{0x8000000000000000L,0x241000F9FFD2CD8EL,0x00000003D56F2300L});
    public static final BitSet FOLLOW_statement_in_block2461 = new BitSet(new long[]{0x0000000000000002L,0x0004000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_sep_in_block2464 = new BitSet(new long[]{0x8000000000000000L,0x241000F9FFD2CD8EL,0x00000003D56F2300L});
    public static final BitSet FOLLOW_statement_in_block2466 = new BitSet(new long[]{0x0000000000000002L,0x0004000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_sep_in_block2470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sep_in_block2486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_pure_block2503 = new BitSet(new long[]{0x0000000000000002L,0x0004000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_sep_in_pure_block2506 = new BitSet(new long[]{0x8000000000000000L,0x241000F9FFD2CD8EL,0x00000003D56F2300L});
    public static final BitSet FOLLOW_statement_in_pure_block2508 = new BitSet(new long[]{0x0000000000000002L,0x0004000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_st_typedef_in_statement2529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_val_in_statement2540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_def_in_statement2545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_yield_in_statement2550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_memoize_in_statement2555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_private_in_statement2560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_module_in_statement2565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_import_in_statement2570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_or_assign_in_statement2575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRAGMA_PRINT_in_statement2581 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_expr_in_statement2583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRAGMA_LOG_in_statement2597 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_expr_in_statement2599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRAGMA_PROFILE_in_statement2613 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_expr_in_statement2615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRAGMA_ASSERT_in_statement2629 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_expr_in_statement2631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Id_in_objelem_assign2649 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_PERIOD_in_objelem_assign2651 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_Id_in_objelem_assign2653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_val_in_st_val2672 = new BitSet(new long[]{0x0000000000000000L,0x0010000130C20000L,0x00000000156F0300L});
    public static final BitSet FOLLOW_NL_in_st_val2674 = new BitSet(new long[]{0x0000000000000000L,0x0010000130C20000L,0x00000000156E0300L});
    public static final BitSet FOLLOW_pattern_in_st_val2678 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_objelem_assign_in_st_val2682 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_NL_in_st_val2685 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ASSIGN_in_st_val2688 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_st_val2690 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_expr_in_st_val2693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_def_in_st_def2717 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000050000L});
    public static final BitSet FOLLOW_NL_in_st_def2719 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_Id_in_st_def2722 = new BitSet(new long[]{0x0000000200000000L,0x0010000130C00000L,0x00000000356F0000L});
    public static final BitSet FOLLOW_NL_in_st_def2724 = new BitSet(new long[]{0x0000000200000000L,0x0010000130C00000L,0x00000000356E0000L});
    public static final BitSet FOLLOW_defpattern_in_st_def2728 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000000L,0x0000000020010000L});
    public static final BitSet FOLLOW_NL_in_st_def2730 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_COLON_in_st_def2736 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000050000L});
    public static final BitSet FOLLOW_NL_in_st_def2738 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_typeid_in_st_def2741 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_NL_in_st_def2743 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ASSIGN_in_st_def2748 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_st_def2750 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_expr_in_st_def2753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_def_in_st_def2779 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_NL_in_st_def2781 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_L_this_in_st_def2784 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020010000L});
    public static final BitSet FOLLOW_NL_in_st_def2786 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_COLON_in_st_def2789 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000050000L});
    public static final BitSet FOLLOW_NL_in_st_def2791 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_typeid_in_st_def2794 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_NL_in_st_def2796 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ASSIGN_in_st_def2799 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_st_def2801 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_expr_in_st_def2804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_typedef_in_st_typedef2827 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000050000L});
    public static final BitSet FOLLOW_NL_in_st_typedef2829 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_Id_in_st_typedef2832 = new BitSet(new long[]{0x0000000000000000L,0x0010000130C00000L,0x00000000156F0000L});
    public static final BitSet FOLLOW_NL_in_st_typedef2834 = new BitSet(new long[]{0x0000000000000000L,0x0010000130C00000L,0x00000000156F0000L});
    public static final BitSet FOLLOW_typedef_clause_in_st_typedef2837 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000010400L});
    public static final BitSet FOLLOW_NL_in_st_typedef2840 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_COMMA_in_st_typedef2843 = new BitSet(new long[]{0x0000000000000000L,0x0010000130C00000L,0x00000000156F0000L});
    public static final BitSet FOLLOW_NL_in_st_typedef2845 = new BitSet(new long[]{0x0000000000000000L,0x0010000130C00000L,0x00000000156F0000L});
    public static final BitSet FOLLOW_typedef_clause_in_st_typedef2848 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000010400L});
    public static final BitSet FOLLOW_defpattern_in_typedef_clause2886 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_NL_in_typedef_clause2888 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ASSIGN_in_typedef_clause2891 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_typedef_clause2893 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_expr_in_typedef_clause2896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_defpattern_in_typedef_clause2911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_yield_in_st_yield2930 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_expr_in_st_yield2932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_memoize_in_st_memoize2953 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000440000L});
    public static final BitSet FOLLOW_memo_id_in_st_memoize2955 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000010400L});
    public static final BitSet FOLLOW_NL_in_st_memoize2958 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_COMMA_in_st_memoize2961 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000450000L});
    public static final BitSet FOLLOW_NL_in_st_memoize2963 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000440000L});
    public static final BitSet FOLLOW_memo_id_in_st_memoize2966 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000010400L});
    public static final BitSet FOLLOW_Id_in_memo_id2995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROUND_BRACKET_OPEN_in_memo_id3008 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_Id_in_memo_id3010 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_ROUND_BRACKET_CLOSE_in_memo_id3012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_private_in_st_private3029 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000440000L});
    public static final BitSet FOLLOW_private_id_in_st_private3031 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000010400L});
    public static final BitSet FOLLOW_NL_in_st_private3034 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_COMMA_in_st_private3037 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000450000L});
    public static final BitSet FOLLOW_NL_in_st_private3039 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000440000L});
    public static final BitSet FOLLOW_private_id_in_st_private3042 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000010400L});
    public static final BitSet FOLLOW_Id_in_private_id3068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROUND_BRACKET_OPEN_in_private_id3081 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_Id_in_private_id3083 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_ROUND_BRACKET_CLOSE_in_private_id3085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Id_in_moduleid3104 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000010800L});
    public static final BitSet FOLLOW_NL_in_moduleid3107 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_PERIOD_in_moduleid3110 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000050000L});
    public static final BitSet FOLLOW_NL_in_moduleid3112 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_Id_in_moduleid3115 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000010800L});
    public static final BitSet FOLLOW_L_module_in_st_module3135 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000050000L});
    public static final BitSet FOLLOW_NL_in_st_module3137 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000050000L});
    public static final BitSet FOLLOW_moduleid_in_st_module3140 = new BitSet(new long[]{0x8000000000000000L,0x241400F9FFD2CD8FL,0x00000003D56F2300L});
    public static final BitSet FOLLOW_block_in_st_module3142 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_L_end_in_st_module3144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Id_in_importid3164 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000010800L});
    public static final BitSet FOLLOW_NL_in_importid3167 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_PERIOD_in_importid3170 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000050000L});
    public static final BitSet FOLLOW_NL_in_importid3172 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_Id_in_importid3175 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000010800L});
    public static final BitSet FOLLOW_importall_in_importid3179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERIOD_in_importall3206 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_UNDERSCORE_in_importall3208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_import_in_st_import3223 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000050000L});
    public static final BitSet FOLLOW_NL_in_st_import3225 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000050000L});
    public static final BitSet FOLLOW_importid_in_st_import3229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_expr_or_assign3265 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_objelem_assign_in_expr_or_assign3269 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_NL_in_expr_or_assign3272 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ASSIGN_in_expr_or_assign3275 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_expr_or_assign3277 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_expr_in_expr_or_assign3280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_or_assign3299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lop_expr_in_expr3310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_obj_expr_in_expr3315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_expr_in_control_expr3325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_do_expr_in_control_expr3330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_match_expr_in_control_expr3335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_expr_in_control_expr3340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_try_expr_in_control_expr3346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_begin_end_in_control_expr3351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_control_expr_in_with_control_expr3361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_with_in_with_control_expr3366 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_with_control_expr3368 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_protected_expr_in_with_control_expr3371 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L,0x0000000000010000L});
    public static final BitSet FOLLOW_NL_in_with_control_expr3373 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_L_do_in_with_control_expr3376 = new BitSet(new long[]{0x8000000000000000L,0x241400F9FFD2CD8FL,0x00000003D56F2300L});
    public static final BitSet FOLLOW_block_in_with_control_expr3378 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_L_end_in_with_control_expr3380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_lop_expr_in_protected_expr3405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_obj_expr_in_protected_expr3410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protected_expr_in_protected_expr_nc3421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_begin_in_begin_end3431 = new BitSet(new long[]{0x8000000000000000L,0x241400F9FFD2CD8FL,0x00000003D56F2300L});
    public static final BitSet FOLLOW_block_in_begin_end3433 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_L_end_in_begin_end3435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_parents3453 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156E2300L});
    public static final BitSet FOLLOW_primitive_expr_in_parents3455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIMES_in_parents3468 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156E2300L});
    public static final BitSet FOLLOW_primitive_expr_in_parents3470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_obj_in_obj_expr3498 = new BitSet(new long[]{0x0000000000000000L,0x0028000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_NL_in_obj_expr3500 = new BitSet(new long[]{0x0000000000000000L,0x0028000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_parents_in_obj_expr3503 = new BitSet(new long[]{0x8000000000000000L,0x241400F9FFD2CD8FL,0x00000003D56F2300L});
    public static final BitSet FOLLOW_block_in_obj_expr3505 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_L_end_in_obj_expr3507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_obj_in_obj_expr3535 = new BitSet(new long[]{0x8000000000000000L,0x241400F9FFD2CD8FL,0x00000003D56F2300L});
    public static final BitSet FOLLOW_block_in_obj_expr3537 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_L_end_in_obj_expr3539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_expr_in_lop_expr3567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_expr_nobrackets_in_lop_expr3578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_op_expr_in_lop_expr3583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_expr_in_p_lop_expr3599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_expr_nobrackets_in_p_lop_expr3610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_op_expr_in_p_lop_expr3615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_if_in_if_expr3625 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_if_expr3627 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_protected_expr_in_if_expr3630 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L,0x0000000000010000L});
    public static final BitSet FOLLOW_NL_in_if_expr3632 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_L_then_in_if_expr3635 = new BitSet(new long[]{0x8000000000000000L,0x241400F9FFD2CDEFL,0x00000003D56F2300L});
    public static final BitSet FOLLOW_block_in_if_expr3637 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000061L});
    public static final BitSet FOLLOW_L_elseif_in_if_expr3643 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_if_expr3645 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_protected_expr_in_if_expr3648 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L,0x0000000000010000L});
    public static final BitSet FOLLOW_NL_in_if_expr3650 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_L_then_in_if_expr3653 = new BitSet(new long[]{0x8000000000000000L,0x241400F9FFD2CDEFL,0x00000003D56F2300L});
    public static final BitSet FOLLOW_block_in_if_expr3655 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000061L});
    public static final BitSet FOLLOW_L_else_in_if_expr3663 = new BitSet(new long[]{0x8000000000000000L,0x241400F9FFD2CD8FL,0x00000003D56F2300L});
    public static final BitSet FOLLOW_block_in_if_expr3665 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_L_end_in_if_expr3669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_while_in_while_do_expr3693 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_while_do_expr3695 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_protected_expr_in_while_do_expr3698 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L,0x0000000000010000L});
    public static final BitSet FOLLOW_NL_in_while_do_expr3700 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_L_do_in_while_do_expr3703 = new BitSet(new long[]{0x8000000000000000L,0x241400F9FFD2CD8FL,0x00000003D56F2300L});
    public static final BitSet FOLLOW_block_in_while_do_expr3705 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_L_end_in_while_do_expr3707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_full_cases_in_cases3737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_cases3742 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010030L});
    public static final BitSet FOLLOW_NL_in_cases3744 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010030L});
    public static final BitSet FOLLOW_token_DOUBLE_ARROW_in_cases3747 = new BitSet(new long[]{0x8000000000000000L,0x241400F9FFD2CD8EL,0x00000003D56F2300L});
    public static final BitSet FOLLOW_block_in_cases3749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_case_expr_in_full_cases3772 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_L_case_in_case_expr3793 = new BitSet(new long[]{0x0000000000000000L,0x0010000130C20000L,0x00000000156F0300L});
    public static final BitSet FOLLOW_NL_in_case_expr3795 = new BitSet(new long[]{0x0000000000000000L,0x0010000130C20000L,0x00000000156E0300L});
    public static final BitSet FOLLOW_pattern_in_case_expr3798 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010030L});
    public static final BitSet FOLLOW_NL_in_case_expr3800 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010030L});
    public static final BitSet FOLLOW_token_DOUBLE_ARROW_in_case_expr3803 = new BitSet(new long[]{0x8000000000000000L,0x241400F9FFD2CD8EL,0x00000003D56F2300L});
    public static final BitSet FOLLOW_block_in_case_expr3805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_match_in_match_expr3826 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_match_expr3828 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156E2300L});
    public static final BitSet FOLLOW_p_op_expr_in_match_expr3831 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L,0x0000000000010000L});
    public static final BitSet FOLLOW_NL_in_match_expr3833 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L,0x0000000000010000L});
    public static final BitSet FOLLOW_full_cases_in_match_expr3836 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_L_end_in_match_expr3838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_try_in_try_expr3864 = new BitSet(new long[]{0x8000000000000000L,0x241000F9FFD2CD8EL,0x00000003D56F2300L});
    public static final BitSet FOLLOW_NL_in_try_expr3866 = new BitSet(new long[]{0x8000000000000000L,0x241000F9FFD2CD8EL,0x00000003D56F2300L});
    public static final BitSet FOLLOW_pure_block_in_try_expr3869 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L,0x0000000000010000L});
    public static final BitSet FOLLOW_NL_in_try_expr3871 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_L_catch_in_try_expr3874 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L,0x0000000000010000L});
    public static final BitSet FOLLOW_NL_in_try_expr3876 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L,0x0000000000010000L});
    public static final BitSet FOLLOW_full_cases_in_try_expr3879 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_L_end_in_try_expr3881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROUND_BRACKET_OPEN_in_lambda_expr3905 = new BitSet(new long[]{0x0000000000000000L,0x0010000130C21000L,0x00000000156F0300L});
    public static final BitSet FOLLOW_NL_in_lambda_expr3907 = new BitSet(new long[]{0x0000000000000000L,0x0010000130C21000L,0x00000000156F0300L});
    public static final BitSet FOLLOW_lambda_cases_in_lambda_expr3910 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000810000L});
    public static final BitSet FOLLOW_NL_in_lambda_expr3912 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_ROUND_BRACKET_CLOSE_in_lambda_expr3915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_cases_nobrackets_in_lambda_expr_nobrackets3934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_lambda_cases_nobrackets3952 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010030L});
    public static final BitSet FOLLOW_NL_in_lambda_cases_nobrackets3954 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010030L});
    public static final BitSet FOLLOW_token_DOUBLE_ARROW_in_lambda_cases_nobrackets3957 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_lambda_cases_nobrackets3959 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156E2300L});
    public static final BitSet FOLLOW_lop_expr_in_lambda_cases_nobrackets3962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_case_in_lambda_case_expr3990 = new BitSet(new long[]{0x0000000000000000L,0x0010000130C20000L,0x00000000156F0300L});
    public static final BitSet FOLLOW_NL_in_lambda_case_expr3992 = new BitSet(new long[]{0x0000000000000000L,0x0010000130C20000L,0x00000000156E0300L});
    public static final BitSet FOLLOW_pattern_in_lambda_case_expr3995 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010030L});
    public static final BitSet FOLLOW_NL_in_lambda_case_expr3997 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010030L});
    public static final BitSet FOLLOW_token_DOUBLE_ARROW_in_lambda_case_expr4000 = new BitSet(new long[]{0x8000000000000000L,0x241000F9FFD2CD8EL,0x00000003D56F2300L});
    public static final BitSet FOLLOW_NL_in_lambda_case_expr4002 = new BitSet(new long[]{0x8000000000000000L,0x241000F9FFD2CD8EL,0x00000003D56F2300L});
    public static final BitSet FOLLOW_pure_block_in_lambda_case_expr4005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_lambda_cases4026 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010030L});
    public static final BitSet FOLLOW_NL_in_lambda_cases4028 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010030L});
    public static final BitSet FOLLOW_token_DOUBLE_ARROW_in_lambda_cases4031 = new BitSet(new long[]{0x8000000000000000L,0x241000F9FFD2CD8EL,0x00000003D56F2300L});
    public static final BitSet FOLLOW_NL_in_lambda_cases4033 = new BitSet(new long[]{0x8000000000000000L,0x241000F9FFD2CD8EL,0x00000003D56F2300L});
    public static final BitSet FOLLOW_pure_block_in_lambda_cases4036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_case_expr_in_lambda_cases4055 = new BitSet(new long[]{0x0000000000000002L,0x0010000130C21000L,0x00000000156F0300L});
    public static final BitSet FOLLOW_NL_in_lambda_cases4058 = new BitSet(new long[]{0x0000000000000000L,0x0010000130C21000L,0x00000000156F0300L});
    public static final BitSet FOLLOW_lambda_case_expr_in_lambda_cases4061 = new BitSet(new long[]{0x0000000000000002L,0x0010000130C21000L,0x00000000156F0300L});
    public static final BitSet FOLLOW_L_for_in_for_expr4079 = new BitSet(new long[]{0x0000000000000000L,0x0010000130C20000L,0x00000000156F0300L});
    public static final BitSet FOLLOW_NL_in_for_expr4081 = new BitSet(new long[]{0x0000000000000000L,0x0010000130C20000L,0x00000000156E0300L});
    public static final BitSet FOLLOW_pattern_in_for_expr4084 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L,0x0000000000010000L});
    public static final BitSet FOLLOW_NL_in_for_expr4086 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_L_in_in_for_expr4089 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_for_expr4091 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_protected_expr_in_for_expr4094 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L,0x0000000000010000L});
    public static final BitSet FOLLOW_NL_in_for_expr4096 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_L_do_in_for_expr4099 = new BitSet(new long[]{0x8000000000000000L,0x241400F9FFD2CD8FL,0x00000003D56F2300L});
    public static final BitSet FOLLOW_block_in_for_expr4101 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_L_end_in_for_expr4103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_builtin_primitive_in_op_expr4128 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156E2300L});
    public static final BitSet FOLLOW_op_expr_in_op_expr4131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bool_expr_in_op_expr4136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_builtin_primitive_in_p_op_expr4146 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_p_op_expr4149 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156E2300L});
    public static final BitSet FOLLOW_p_op_expr_in_p_op_expr4153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_bool_expr_in_p_op_expr4158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_builtin_primitive0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bool_or_expr_in_bool_expr4202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_bool_or_expr_in_p_bool_expr4212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bool_and_expr_in_bool_or_expr4221 = new BitSet(new long[]{0x0000000000000002L,0x0900000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_NL_in_bool_or_expr4224 = new BitSet(new long[]{0x0000000000000000L,0x0900000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_token_OR_in_bool_or_expr4228 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_bool_or_expr4231 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156E2300L});
    public static final BitSet FOLLOW_bool_and_expr_in_bool_or_expr4235 = new BitSet(new long[]{0x0000000000000002L,0x0900000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_p_bool_and_expr_in_p_bool_or_expr4247 = new BitSet(new long[]{0x0000000000000002L,0x0900000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_NL_in_p_bool_or_expr4250 = new BitSet(new long[]{0x0000000000000000L,0x0900000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_token_OR_in_p_bool_or_expr4254 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_p_bool_or_expr4257 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156E2300L});
    public static final BitSet FOLLOW_p_bool_and_expr_in_p_bool_or_expr4261 = new BitSet(new long[]{0x0000000000000002L,0x0900000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_bool_not_expr_in_bool_and_expr4273 = new BitSet(new long[]{0x0000000000000002L,0x1200000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_NL_in_bool_and_expr4276 = new BitSet(new long[]{0x0000000000000000L,0x1200000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_token_AND_in_bool_and_expr4280 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_bool_and_expr4283 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156E2300L});
    public static final BitSet FOLLOW_bool_not_expr_in_bool_and_expr4287 = new BitSet(new long[]{0x0000000000000002L,0x1200000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_p_bool_not_expr_in_p_bool_and_expr4299 = new BitSet(new long[]{0x0000000000000002L,0x1200000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_NL_in_p_bool_and_expr4302 = new BitSet(new long[]{0x0000000000000000L,0x1200000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_token_AND_in_p_bool_and_expr4306 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_p_bool_and_expr4309 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156E2300L});
    public static final BitSet FOLLOW_p_bool_not_expr_in_p_bool_and_expr4313 = new BitSet(new long[]{0x0000000000000002L,0x1200000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_token_NOT_in_bool_not_expr4325 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_bool_not_expr4328 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156E2300L});
    public static final BitSet FOLLOW_bool_not_expr_in_bool_not_expr4332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rel_expr_in_bool_not_expr4337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_NOT_in_p_bool_not_expr4348 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_p_bool_not_expr4351 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156E2300L});
    public static final BitSet FOLLOW_p_bool_not_expr_in_p_bool_not_expr4355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_rel_expr_in_p_bool_not_expr4360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arith_expr_in_rel_expr4369 = new BitSet(new long[]{0x0000000000000002L,0x0003FF0000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_NL_in_rel_expr4372 = new BitSet(new long[]{0x0000000000000000L,0x0003FF0000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_rel_op_in_rel_expr4375 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_rel_expr4377 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156E2300L});
    public static final BitSet FOLLOW_arith_expr_in_rel_expr4380 = new BitSet(new long[]{0x0000000000000002L,0x0003FF0000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_p_arith_expr_in_p_rel_expr4407 = new BitSet(new long[]{0x0000000000000002L,0x0003FF0000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_NL_in_p_rel_expr4410 = new BitSet(new long[]{0x0000000000000000L,0x0003FF0000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_rel_op_in_p_rel_expr4413 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_p_rel_expr4415 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156E2300L});
    public static final BitSet FOLLOW_p_arith_expr_in_p_rel_expr4418 = new BitSet(new long[]{0x0000000000000002L,0x0003FF0000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_token_EQUAL_in_rel_op4444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_NOT_EQUAL_in_rel_op4448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATER_in_rel_op4452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_GREATER_EQ_in_rel_op4456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_in_rel_op4460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_LESS_EQ_in_rel_op4464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_plusplus_expr_in_arith_expr4476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_plusplus_expr_in_p_arith_expr4486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timestimes_expr_in_plusplus_expr4496 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x000000000001000CL});
    public static final BitSet FOLLOW_NL_in_plusplus_expr4499 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_PLUSPLUS_in_plusplus_expr4504 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156F2300L});
    public static final BitSet FOLLOW_MINUSMINUS_in_plusplus_expr4507 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_plusplus_expr4511 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156E2300L});
    public static final BitSet FOLLOW_timestimes_expr_in_plusplus_expr4515 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x000000000001000CL});
    public static final BitSet FOLLOW_p_timestimes_expr_in_p_plusplus_expr4527 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x000000000001000CL});
    public static final BitSet FOLLOW_NL_in_p_plusplus_expr4530 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_PLUSPLUS_in_p_plusplus_expr4535 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156F2300L});
    public static final BitSet FOLLOW_MINUSMINUS_in_p_plusplus_expr4538 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_p_plusplus_expr4542 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156E2300L});
    public static final BitSet FOLLOW_p_timestimes_expr_in_p_plusplus_expr4546 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x000000000001000CL});
    public static final BitSet FOLLOW_simple_expr_in_timestimes_expr4558 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000010003L});
    public static final BitSet FOLLOW_NL_in_timestimes_expr4561 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_TIMESTIMES_in_timestimes_expr4566 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156F2300L});
    public static final BitSet FOLLOW_QUOTIENTQUOTIENT_in_timestimes_expr4569 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_timestimes_expr4573 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156E2300L});
    public static final BitSet FOLLOW_simple_expr_in_timestimes_expr4577 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000010003L});
    public static final BitSet FOLLOW_p_simple_expr_in_p_timestimes_expr4590 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000010003L});
    public static final BitSet FOLLOW_NL_in_p_timestimes_expr4593 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_TIMESTIMES_in_p_timestimes_expr4598 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156F2300L});
    public static final BitSet FOLLOW_QUOTIENTQUOTIENT_in_p_timestimes_expr4601 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_p_timestimes_expr4605 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156E2300L});
    public static final BitSet FOLLOW_p_simple_expr_in_p_timestimes_expr4609 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000010003L});
    public static final BitSet FOLLOW_cons_expr_in_simple_expr4620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_cons_expr_in_p_simple_expr4629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_to_expr_in_cons_expr4638 = new BitSet(new long[]{0x0000000000000002L,0xC000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_NL_in_cons_expr4641 = new BitSet(new long[]{0x0000000000000000L,0xC000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_token_DOUBLE_COLON_in_cons_expr4644 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_cons_expr4646 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156E2300L});
    public static final BitSet FOLLOW_to_expr_in_cons_expr4649 = new BitSet(new long[]{0x0000000000000002L,0xC000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_p_to_expr_in_p_cons_expr4669 = new BitSet(new long[]{0x0000000000000002L,0xC000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_NL_in_p_cons_expr4672 = new BitSet(new long[]{0x0000000000000000L,0xC000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_token_DOUBLE_COLON_in_p_cons_expr4675 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_p_cons_expr4677 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156E2300L});
    public static final BitSet FOLLOW_p_to_expr_in_p_cons_expr4680 = new BitSet(new long[]{0x0000000000000002L,0xC000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_arith_plus_expr_in_to_expr4700 = new BitSet(new long[]{0x0000000000000002L,0x00000000000C0000L,0x0000000000010000L});
    public static final BitSet FOLLOW_NL_in_to_expr4703 = new BitSet(new long[]{0x0000000000000000L,0x00000000000C0000L});
    public static final BitSet FOLLOW_L_to_in_to_expr4708 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156F2300L});
    public static final BitSet FOLLOW_L_downto_in_to_expr4712 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_to_expr4716 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156E2300L});
    public static final BitSet FOLLOW_arith_plus_expr_in_to_expr4720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_arith_plus_expr_in_p_to_expr4733 = new BitSet(new long[]{0x0000000000000002L,0x00000000000C0000L,0x0000000000010000L});
    public static final BitSet FOLLOW_NL_in_p_to_expr4736 = new BitSet(new long[]{0x0000000000000000L,0x00000000000C0000L});
    public static final BitSet FOLLOW_L_to_in_p_to_expr4741 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156F2300L});
    public static final BitSet FOLLOW_L_downto_in_p_to_expr4745 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_p_to_expr4749 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156E2300L});
    public static final BitSet FOLLOW_p_arith_plus_expr_in_p_to_expr4753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arith_uminus_expr_in_arith_plus_expr4765 = new BitSet(new long[]{0x0000000000000002L,0x0018000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_NL_in_arith_plus_expr4769 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_PLUS_in_arith_plus_expr4773 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156F2300L});
    public static final BitSet FOLLOW_MINUS_in_arith_plus_expr4778 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_arith_plus_expr4782 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156E2300L});
    public static final BitSet FOLLOW_arith_uminus_expr_in_arith_plus_expr4786 = new BitSet(new long[]{0x0000000000000002L,0x0018000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_p_arith_uminus_expr_in_p_arith_plus_expr4797 = new BitSet(new long[]{0x0000000000000002L,0x0018000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_NL_in_p_arith_plus_expr4800 = new BitSet(new long[]{0x0000000000000000L,0x0018000000000000L});
    public static final BitSet FOLLOW_set_in_p_arith_plus_expr4804 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_p_arith_plus_expr4813 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156E2300L});
    public static final BitSet FOLLOW_p_arith_uminus_expr_in_p_arith_plus_expr4817 = new BitSet(new long[]{0x0000000000000002L,0x0018000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_MINUS_in_arith_uminus_expr4830 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_arith_uminus_expr4832 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156E2300L});
    public static final BitSet FOLLOW_arith_mult_expr_in_arith_uminus_expr4835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arith_mult_expr_in_arith_uminus_expr4848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_p_arith_uminus_expr4859 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_p_arith_uminus_expr4861 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156E2300L});
    public static final BitSet FOLLOW_p_arith_mult_expr_in_p_arith_uminus_expr4864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_arith_mult_expr_in_p_arith_uminus_expr4877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arith_pow_expr_in_arith_mult_expr4886 = new BitSet(new long[]{0x0000000000000002L,0x0060000600000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_NL_in_arith_mult_expr4889 = new BitSet(new long[]{0x0000000000000000L,0x0060000600000000L});
    public static final BitSet FOLLOW_set_in_arith_mult_expr4893 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_arith_mult_expr4910 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156E2300L});
    public static final BitSet FOLLOW_arith_pow_expr_in_arith_mult_expr4914 = new BitSet(new long[]{0x0000000000000002L,0x0060000600000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_p_arith_pow_expr_in_p_arith_mult_expr4926 = new BitSet(new long[]{0x0000000000000002L,0x0060000600000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_NL_in_p_arith_mult_expr4929 = new BitSet(new long[]{0x0000000000000000L,0x0060000600000000L});
    public static final BitSet FOLLOW_set_in_p_arith_mult_expr4933 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_p_arith_mult_expr4950 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156E2300L});
    public static final BitSet FOLLOW_p_arith_pow_expr_in_p_arith_mult_expr4954 = new BitSet(new long[]{0x0000000000000002L,0x0060000600000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_apply_expr_in_arith_pow_expr4965 = new BitSet(new long[]{0x0000000000000002L,0x0080000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_NL_in_arith_pow_expr4968 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_POW_tok_in_arith_pow_expr4971 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_arith_pow_expr4973 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156E2300L});
    public static final BitSet FOLLOW_apply_expr_in_arith_pow_expr4976 = new BitSet(new long[]{0x0000000000000002L,0x0080000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_p_apply_expr_in_p_arith_pow_expr4997 = new BitSet(new long[]{0x0000000000000002L,0x0080000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_NL_in_p_arith_pow_expr5000 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_POW_tok_in_p_arith_pow_expr5003 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_p_arith_pow_expr5005 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156E2300L});
    public static final BitSet FOLLOW_p_apply_expr_in_p_arith_pow_expr5008 = new BitSet(new long[]{0x0000000000000002L,0x0080000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_basic_expr_in_apply_expr5029 = new BitSet(new long[]{0x8000000000000002L,0x24100021F7D2098CL,0x00000000156E2300L});
    public static final BitSet FOLLOW_p_basic_expr_in_p_apply_expr5047 = new BitSet(new long[]{0x8000000000000002L,0x24100021F7D2098CL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_p_apply_expr5050 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156E2300L});
    public static final BitSet FOLLOW_p_basic_expr_in_p_apply_expr5053 = new BitSet(new long[]{0x8000000000000002L,0x24100021F7D2098CL,0x00000000156F2300L});
    public static final BitSet FOLLOW_message_send_expr_in_basic_expr5073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_message_send_expr_in_p_basic_expr5082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitive_expr_in_message_send_expr5091 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000010800L});
    public static final BitSet FOLLOW_NL_in_message_send_expr5094 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_PERIOD_in_message_send_expr5097 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000050000L});
    public static final BitSet FOLLOW_NL_in_message_send_expr5099 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_Id_in_message_send_expr5102 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000010800L});
    public static final BitSet FOLLOW_SQUARE_BRACKET_OPEN_in_list_expr5126 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098EL,0x00000000176F2300L});
    public static final BitSet FOLLOW_NL_in_list_expr5128 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098EL,0x00000000176F2300L});
    public static final BitSet FOLLOW_protected_expr_nc_in_list_expr5132 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002010400L});
    public static final BitSet FOLLOW_NL_in_list_expr5135 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_COMMA_in_list_expr5138 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_list_expr5140 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_protected_expr_nc_in_list_expr5143 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002010400L});
    public static final BitSet FOLLOW_NL_in_list_expr5147 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_SQUARE_BRACKET_CLOSE_in_list_expr5152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROUND_BRACKET_OPEN_in_list_expr5166 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098EL,0x0000000015EF2300L});
    public static final BitSet FOLLOW_NL_in_list_expr5168 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098EL,0x0000000015EF2300L});
    public static final BitSet FOLLOW_protected_expr_nc_in_list_expr5172 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000810400L});
    public static final BitSet FOLLOW_NL_in_list_expr5175 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_COMMA_in_list_expr5178 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_list_expr5180 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_protected_expr_nc_in_list_expr5183 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000810400L});
    public static final BitSet FOLLOW_NL_in_list_expr5187 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800400L});
    public static final BitSet FOLLOW_COMMA_in_list_expr5191 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000810000L});
    public static final BitSet FOLLOW_NL_in_list_expr5193 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_ROUND_BRACKET_CLOSE_in_list_expr5200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURLY_BRACKET_OPEN_in_map_or_set_expr5229 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098EL,0x000000001D6F2300L});
    public static final BitSet FOLLOW_NL_in_map_or_set_expr5231 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098EL,0x000000001D6F2300L});
    public static final BitSet FOLLOW_map_or_set_elem_expr_in_map_or_set_expr5235 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008010400L});
    public static final BitSet FOLLOW_NL_in_map_or_set_expr5237 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000400L});
    public static final BitSet FOLLOW_COMMA_in_map_or_set_expr5241 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_map_or_set_expr5243 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_map_or_set_elem_expr_in_map_or_set_expr5246 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008010400L});
    public static final BitSet FOLLOW_NL_in_map_or_set_expr5248 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000400L});
    public static final BitSet FOLLOW_CURLY_BRACKET_CLOSE_in_map_or_set_expr5255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURLY_BRACKET_OPEN_in_map_or_set_expr5275 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000100C0L});
    public static final BitSet FOLLOW_NL_in_map_or_set_expr5277 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_token_ARROW_in_map_or_set_expr5280 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008010000L});
    public static final BitSet FOLLOW_NL_in_map_or_set_expr5282 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_CURLY_BRACKET_CLOSE_in_map_or_set_expr5285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protected_expr_nc_in_map_or_set_elem_expr5302 = new BitSet(new long[]{0x0000000200000002L,0x0000000000000000L,0x00000000000100C0L});
    public static final BitSet FOLLOW_NL_in_map_or_set_elem_expr5305 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000000L,0x00000000000100C0L});
    public static final BitSet FOLLOW_arrow_or_assign_in_map_or_set_elem_expr5308 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_map_or_set_elem_expr5310 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_protected_expr_nc_in_map_or_set_elem_expr5313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROUND_BRACKET_OPEN_in_type_expr5340 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020010000L});
    public static final BitSet FOLLOW_NL_in_type_expr5342 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_COLON_in_type_expr5345 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000050000L});
    public static final BitSet FOLLOW_NL_in_type_expr5347 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_typeid_in_type_expr5350 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000810000L});
    public static final BitSet FOLLOW_NL_in_type_expr5352 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_ROUND_BRACKET_CLOSE_in_type_expr5355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Num_in_primitive_expr5372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_String_in_primitive_expr5377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Id_in_primitive_expr5382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Constr_in_primitive_expr5387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_true_in_primitive_expr5392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_false_in_primitive_expr5397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_this_in_primitive_expr5402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_nil_in_primitive_expr5408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_expr_in_primitive_expr5413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_infinity_in_primitive_expr5418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_list_expr_in_primitive_expr5424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_with_control_expr_in_primitive_expr5429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_map_or_set_expr_in_primitive_expr5434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Id_in_synpred1_babel171853 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L,0x0000000000010000L});
    public static final BitSet FOLLOW_NL_in_synpred1_babel171855 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_L_as_in_synpred1_babel171858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protected_expr_in_synpred2_babel171889 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000011000L});
    public static final BitSet FOLLOW_NL_in_synpred2_babel171891 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_QUESTION_MARK_in_synpred2_babel171894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Id_in_synpred3_babel171932 = new BitSet(new long[]{0x0000000000000000L,0x0010000130C20000L,0x00000000156E0300L});
    public static final BitSet FOLLOW_pattern_in_synpred3_babel171934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_synpred4_babel172023 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L,0x0000000000010000L});
    public static final BitSet FOLLOW_NL_in_synpred4_babel172025 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_L_if_in_synpred4_babel172028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_synpred5_babel172059 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020010000L});
    public static final BitSet FOLLOW_NL_in_synpred5_babel172061 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_COLON_in_synpred5_babel172064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_defpattern_in_synpred6_babel172876 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_NL_in_synpred6_babel172878 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ASSIGN_in_synpred6_babel172881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_synpred7_babel173249 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_objelem_assign_in_synpred7_babel173253 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_NL_in_synpred7_babel173256 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ASSIGN_in_synpred7_babel173259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_obj_in_synpred8_babel173488 = new BitSet(new long[]{0x0000000000000000L,0x0028000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_NL_in_synpred8_babel173490 = new BitSet(new long[]{0x0000000000000000L,0x0028000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_parents_in_synpred8_babel173493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_expr_in_synpred9_babel173562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_expr_nobrackets_in_synpred10_babel173573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_expr_in_synpred11_babel173594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_expr_nobrackets_in_synpred12_babel173605 = new BitSet(new long[]{0x0000000000000002L});

}