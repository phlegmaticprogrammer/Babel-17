// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g 2011-04-26 13:20:00

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

    public static class bracket_pattern_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bracket_pattern"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:400:1: bracket_pattern : ( ( Id ( NL )? L_as )=> Id ( NL )? L_as ( NL )? pattern -> ^( L_as Id pattern ) | ( protected_expr ( NL )? QUESTION_MARK )=> protected_expr ( NL )? QUESTION_MARK ( ( NL )? pattern )? -> ^( QUESTION_MARK protected_expr ( pattern )? ) | ( Id pattern )=> Id pattern -> ^( INNERVALUE_PATTERN Id pattern ) | L_val ( NL )? protected_expr_nc -> ^( L_val protected_expr_nc ) | L_for ( NL )? ( bracket_pattern ( ( NL )? COMMA ( NL )? bracket_pattern )* ( NL )? )? L_end -> ^( L_for ( bracket_pattern )* ) | ( pattern ( NL )? L_if )=> pattern ( NL )? L_if ( NL )? protected_expr_nc -> ^( IF_PATTERN pattern protected_expr_nc ) | ( pattern ( NL )? ':' )=> pattern ( NL )? ':' ( NL )? typeannotation -> ^( TYPE_PATTERN typeannotation pattern ) | pattern );
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:401:2: ( ( Id ( NL )? L_as )=> Id ( NL )? L_as ( NL )? pattern -> ^( L_as Id pattern ) | ( protected_expr ( NL )? QUESTION_MARK )=> protected_expr ( NL )? QUESTION_MARK ( ( NL )? pattern )? -> ^( QUESTION_MARK protected_expr ( pattern )? ) | ( Id pattern )=> Id pattern -> ^( INNERVALUE_PATTERN Id pattern ) | L_val ( NL )? protected_expr_nc -> ^( L_val protected_expr_nc ) | L_for ( NL )? ( bracket_pattern ( ( NL )? COMMA ( NL )? bracket_pattern )* ( NL )? )? L_end -> ^( L_for ( bracket_pattern )* ) | ( pattern ( NL )? L_if )=> pattern ( NL )? L_if ( NL )? protected_expr_nc -> ^( IF_PATTERN pattern protected_expr_nc ) | ( pattern ( NL )? ':' )=> pattern ( NL )? ':' ( NL )? typeannotation -> ^( TYPE_PATTERN typeannotation pattern ) | pattern )
            int alt29=8;
            alt29 = dfa29.predict(input);
            switch (alt29) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:401:10: ( Id ( NL )? L_as )=> Id ( NL )? L_as ( NL )? pattern
                    {
                    Id36=(Token)match(input,Id,FOLLOW_Id_in_bracket_pattern1812); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Id.add(Id36);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:401:30: ( NL )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==NL) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:401:30: NL
                            {
                            NL37=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1814); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL37);


                            }
                            break;

                    }

                    L_as38=(Token)match(input,L_as,FOLLOW_L_as_in_bracket_pattern1817); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_as.add(L_as38);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:401:39: ( NL )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==NL) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:401:39: NL
                            {
                            NL39=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1819); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL39);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_pattern_in_bracket_pattern1822);
                    pattern40=pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pattern.add(pattern40.getTree());


                    // AST REWRITE
                    // elements: pattern, Id, L_as
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 401:51: -> ^( L_as Id pattern )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:401:54: ^( L_as Id pattern )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:402:4: ( protected_expr ( NL )? QUESTION_MARK )=> protected_expr ( NL )? QUESTION_MARK ( ( NL )? pattern )?
                    {
                    pushFollow(FOLLOW_protected_expr_in_bracket_pattern1851);
                    protected_expr41=protected_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr41.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:403:18: ( NL )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==NL) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:403:18: NL
                            {
                            NL42=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1853); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL42);


                            }
                            break;

                    }

                    QUESTION_MARK43=(Token)match(input,QUESTION_MARK,FOLLOW_QUESTION_MARK_in_bracket_pattern1856); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QUESTION_MARK.add(QUESTION_MARK43);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:403:36: ( ( NL )? pattern )?
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
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:403:37: ( NL )? pattern
                            {
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:403:37: ( NL )?
                            int alt16=2;
                            int LA16_0 = input.LA(1);

                            if ( (LA16_0==NL) ) {
                                alt16=1;
                            }
                            switch (alt16) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:403:37: NL
                                    {
                                    NL44=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1859); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL44);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_pattern_in_bracket_pattern1862);
                            pattern45=pattern();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_pattern.add(pattern45.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: protected_expr, QUESTION_MARK, pattern
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 403:51: -> ^( QUESTION_MARK protected_expr ( pattern )? )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:403:54: ^( QUESTION_MARK protected_expr ( pattern )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_QUESTION_MARK.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_protected_expr.nextTree());
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:403:85: ( pattern )?
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:404:4: ( Id pattern )=> Id pattern
                    {
                    Id46=(Token)match(input,Id,FOLLOW_Id_in_bracket_pattern1888); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Id.add(Id46);

                    pushFollow(FOLLOW_pattern_in_bracket_pattern1890);
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
                    // 404:31: -> ^( INNERVALUE_PATTERN Id pattern )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:404:34: ^( INNERVALUE_PATTERN Id pattern )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:405:4: L_val ( NL )? protected_expr_nc
                    {
                    L_val48=(Token)match(input,L_val,FOLLOW_L_val_in_bracket_pattern1905); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_val.add(L_val48);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:405:10: ( NL )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==NL) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:405:10: NL
                            {
                            NL49=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1907); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL49);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_protected_expr_nc_in_bracket_pattern1910);
                    protected_expr_nc50=protected_expr_nc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_protected_expr_nc.add(protected_expr_nc50.getTree());


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
                    // 405:32: -> ^( L_val protected_expr_nc )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:405:35: ^( L_val protected_expr_nc )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:406:10: L_for ( NL )? ( bracket_pattern ( ( NL )? COMMA ( NL )? bracket_pattern )* ( NL )? )? L_end
                    {
                    L_for51=(Token)match(input,L_for,FOLLOW_L_for_in_bracket_pattern1929); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_for.add(L_for51);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:406:16: ( NL )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==NL) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:406:16: NL
                            {
                            NL52=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1931); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL52);


                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:406:20: ( bracket_pattern ( ( NL )? COMMA ( NL )? bracket_pattern )* ( NL )? )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==L_begin||(LA24_0>=L_obj && LA24_0<=L_if)||(LA24_0>=L_while && LA24_0<=L_for)||LA24_0==L_match||LA24_0==L_val||LA24_0==L_exception||LA24_0==L_try||(LA24_0>=A_infinity && LA24_0<=L_lazy)||(LA24_0>=L_true && LA24_0<=L_nil)||LA24_0==L_typeof||LA24_0==MINUS||LA24_0==A_NOT||LA24_0==U_NOT||(LA24_0>=A_ELLIPSIS && LA24_0<=U_ELLIPSIS)||LA24_0==L_force||(LA24_0>=Constr && LA24_0<=Num)||(LA24_0>=String && LA24_0<=ROUND_BRACKET_OPEN)||LA24_0==SQUARE_BRACKET_OPEN||LA24_0==CURLY_BRACKET_OPEN||LA24_0==UNDERSCORE) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:406:21: bracket_pattern ( ( NL )? COMMA ( NL )? bracket_pattern )* ( NL )?
                            {
                            pushFollow(FOLLOW_bracket_pattern_in_bracket_pattern1935);
                            bracket_pattern53=bracket_pattern();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_bracket_pattern.add(bracket_pattern53.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:406:37: ( ( NL )? COMMA ( NL )? bracket_pattern )*
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
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:406:39: ( NL )? COMMA ( NL )? bracket_pattern
                            	    {
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:406:39: ( NL )?
                            	    int alt20=2;
                            	    int LA20_0 = input.LA(1);

                            	    if ( (LA20_0==NL) ) {
                            	        alt20=1;
                            	    }
                            	    switch (alt20) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:406:39: NL
                            	            {
                            	            NL54=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1939); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL54);


                            	            }
                            	            break;

                            	    }

                            	    COMMA55=(Token)match(input,COMMA,FOLLOW_COMMA_in_bracket_pattern1942); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA55);

                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:406:49: ( NL )?
                            	    int alt21=2;
                            	    int LA21_0 = input.LA(1);

                            	    if ( (LA21_0==NL) ) {
                            	        alt21=1;
                            	    }
                            	    switch (alt21) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:406:49: NL
                            	            {
                            	            NL56=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1944); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL56);


                            	            }
                            	            break;

                            	    }

                            	    pushFollow(FOLLOW_bracket_pattern_in_bracket_pattern1947);
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

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:406:72: ( NL )?
                            int alt23=2;
                            int LA23_0 = input.LA(1);

                            if ( (LA23_0==NL) ) {
                                alt23=1;
                            }
                            switch (alt23) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:406:72: NL
                                    {
                                    NL58=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1952); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL58);


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    L_end59=(Token)match(input,L_end,FOLLOW_L_end_in_bracket_pattern1957); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_end.add(L_end59);



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
                    // 406:84: -> ^( L_for ( bracket_pattern )* )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:406:87: ^( L_for ( bracket_pattern )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_L_for.nextNode(), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:406:95: ( bracket_pattern )*
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:407:4: ( pattern ( NL )? L_if )=> pattern ( NL )? L_if ( NL )? protected_expr_nc
                    {
                    pushFollow(FOLLOW_pattern_in_bracket_pattern1982);
                    pattern60=pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pattern.add(pattern60.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:407:34: ( NL )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==NL) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:407:34: NL
                            {
                            NL61=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1984); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL61);


                            }
                            break;

                    }

                    L_if62=(Token)match(input,L_if,FOLLOW_L_if_in_bracket_pattern1987); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_if.add(L_if62);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:407:43: ( NL )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==NL) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:407:43: NL
                            {
                            NL63=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1989); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL63);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_protected_expr_nc_in_bracket_pattern1992);
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
                    // 407:65: -> ^( IF_PATTERN pattern protected_expr_nc )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:407:68: ^( IF_PATTERN pattern protected_expr_nc )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:408:4: ( pattern ( NL )? ':' )=> pattern ( NL )? ':' ( NL )? typeannotation
                    {
                    pushFollow(FOLLOW_pattern_in_bracket_pattern2018);
                    pattern65=pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pattern.add(pattern65.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:408:33: ( NL )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==NL) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:408:33: NL
                            {
                            NL66=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern2020); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL66);


                            }
                            break;

                    }

                    char_literal67=(Token)match(input,COLON,FOLLOW_COLON_in_bracket_pattern2023); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(char_literal67);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:408:41: ( NL )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==NL) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:408:41: NL
                            {
                            NL68=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern2025); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL68);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_typeannotation_in_bracket_pattern2028);
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
                    // 408:60: -> ^( TYPE_PATTERN typeannotation pattern )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:408:63: ^( TYPE_PATTERN typeannotation pattern )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:409:4: pattern
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_pattern_in_bracket_pattern2043);
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:411:1: arrow_or_assign : ( token_ARROW -> ^( ARROW ) | ASSIGN -> ^( ASSIGN ) );
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:412:2: ( token_ARROW -> ^( ARROW ) | ASSIGN -> ^( ASSIGN ) )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:412:4: token_ARROW
                    {
                    pushFollow(FOLLOW_token_ARROW_in_arrow_or_assign2053);
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
                    // 412:16: -> ^( ARROW )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:412:19: ^( ARROW )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:413:4: ASSIGN
                    {
                    ASSIGN72=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_arrow_or_assign2064); if (state.failed) return retval; 
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
                    // 413:11: -> ^( ASSIGN )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:413:14: ^( ASSIGN )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:415:1: mselem_pattern : bracket_pattern ( ( NL )? arrow_or_assign ( NL )? bracket_pattern )? -> ^( NIL_TOKEN ^( NIL_TOKEN ( bracket_pattern )* ) ( arrow_or_assign )* ) ;
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:416:2: ( bracket_pattern ( ( NL )? arrow_or_assign ( NL )? bracket_pattern )? -> ^( NIL_TOKEN ^( NIL_TOKEN ( bracket_pattern )* ) ( arrow_or_assign )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:416:4: bracket_pattern ( ( NL )? arrow_or_assign ( NL )? bracket_pattern )?
            {
            pushFollow(FOLLOW_bracket_pattern_in_mselem_pattern2079);
            bracket_pattern73=bracket_pattern();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bracket_pattern.add(bracket_pattern73.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:416:20: ( ( NL )? arrow_or_assign ( NL )? bracket_pattern )?
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:416:21: ( NL )? arrow_or_assign ( NL )? bracket_pattern
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:416:21: ( NL )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==NL) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:416:21: NL
                            {
                            NL74=(Token)match(input,NL,FOLLOW_NL_in_mselem_pattern2082); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL74);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_arrow_or_assign_in_mselem_pattern2085);
                    arrow_or_assign75=arrow_or_assign();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_arrow_or_assign.add(arrow_or_assign75.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:416:41: ( NL )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==NL) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:416:41: NL
                            {
                            NL76=(Token)match(input,NL,FOLLOW_NL_in_mselem_pattern2087); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL76);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_bracket_pattern_in_mselem_pattern2090);
                    bracket_pattern77=bracket_pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_bracket_pattern.add(bracket_pattern77.getTree());

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
            // 417:3: -> ^( NIL_TOKEN ^( NIL_TOKEN ( bracket_pattern )* ) ( arrow_or_assign )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:417:6: ^( NIL_TOKEN ^( NIL_TOKEN ( bracket_pattern )* ) ( arrow_or_assign )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:417:18: ^( NIL_TOKEN ( bracket_pattern )* )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_2);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:417:30: ( bracket_pattern )*
                while ( stream_bracket_pattern.hasNext() ) {
                    adaptor.addChild(root_2, stream_bracket_pattern.nextTree());

                }
                stream_bracket_pattern.reset();

                adaptor.addChild(root_1, root_2);
                }
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:417:48: ( arrow_or_assign )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:419:1: primitive_pattern : ( Id | '_' -> ANY | String | Num | L_true | L_false | L_nil | token_infinity | '-' ( NL )? token_infinity -> ^( UMINUS token_infinity ) | '-' ( NL )? Num -> ^( UMINUS Num ) | '[' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* )? ']' -> ^( SQUARE_LIST ( bracket_pattern )* ) | '(' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* ( COMMA ( NL )? )? )? ')' -> ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( bracket_pattern )* ) ) | '{' ( NL )? ( mselem_pattern ( NL )? ( COMMA ( NL )? mselem_pattern ( NL )? )* )? '}' -> ^( MAP_OR_SET_OR_OBJ ( mselem_pattern )* ) | '{' ( NL )? token_ARROW ( NL )? '}' -> ^( EMPTY_MAP ) );
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:420:2: ( Id | '_' -> ANY | String | Num | L_true | L_false | L_nil | token_infinity | '-' ( NL )? token_infinity -> ^( UMINUS token_infinity ) | '-' ( NL )? Num -> ^( UMINUS Num ) | '[' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* )? ']' -> ^( SQUARE_LIST ( bracket_pattern )* ) | '(' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* ( COMMA ( NL )? )? )? ')' -> ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( bracket_pattern )* ) ) | '{' ( NL )? ( mselem_pattern ( NL )? ( COMMA ( NL )? mselem_pattern ( NL )? )* )? '}' -> ^( MAP_OR_SET_OR_OBJ ( mselem_pattern )* ) | '{' ( NL )? token_ARROW ( NL )? '}' -> ^( EMPTY_MAP ) )
            int alt58=14;
            alt58 = dfa58.predict(input);
            switch (alt58) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:420:4: Id
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Id78=(Token)match(input,Id,FOLLOW_Id_in_primitive_pattern2119); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Id78_tree = (CommonTree)adaptor.create(Id78);
                    adaptor.addChild(root_0, Id78_tree);
                    }

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:421:4: '_'
                    {
                    char_literal79=(Token)match(input,UNDERSCORE,FOLLOW_UNDERSCORE_in_primitive_pattern2124); if (state.failed) return retval; 
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
                    // 421:8: -> ANY
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(ANY, "ANY"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:422:4: String
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    String80=(Token)match(input,String,FOLLOW_String_in_primitive_pattern2133); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    String80_tree = (CommonTree)adaptor.create(String80);
                    adaptor.addChild(root_0, String80_tree);
                    }

                    }
                    break;
                case 4 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:423:4: Num
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Num81=(Token)match(input,Num,FOLLOW_Num_in_primitive_pattern2138); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Num81_tree = (CommonTree)adaptor.create(Num81);
                    adaptor.addChild(root_0, Num81_tree);
                    }

                    }
                    break;
                case 5 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:424:4: L_true
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    L_true82=(Token)match(input,L_true,FOLLOW_L_true_in_primitive_pattern2143); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    L_true82_tree = (CommonTree)adaptor.create(L_true82);
                    adaptor.addChild(root_0, L_true82_tree);
                    }

                    }
                    break;
                case 6 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:425:4: L_false
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    L_false83=(Token)match(input,L_false,FOLLOW_L_false_in_primitive_pattern2148); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    L_false83_tree = (CommonTree)adaptor.create(L_false83);
                    adaptor.addChild(root_0, L_false83_tree);
                    }

                    }
                    break;
                case 7 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:426:4: L_nil
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    L_nil84=(Token)match(input,L_nil,FOLLOW_L_nil_in_primitive_pattern2153); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    L_nil84_tree = (CommonTree)adaptor.create(L_nil84);
                    adaptor.addChild(root_0, L_nil84_tree);
                    }

                    }
                    break;
                case 8 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:427:4: token_infinity
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_infinity_in_primitive_pattern2158);
                    token_infinity85=token_infinity();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, token_infinity85.getTree());

                    }
                    break;
                case 9 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:428:4: '-' ( NL )? token_infinity
                    {
                    char_literal86=(Token)match(input,MINUS,FOLLOW_MINUS_in_primitive_pattern2163); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(char_literal86);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:428:8: ( NL )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==NL) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:428:8: NL
                            {
                            NL87=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2165); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL87);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_token_infinity_in_primitive_pattern2168);
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
                    // 428:27: -> ^( UMINUS token_infinity )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:428:30: ^( UMINUS token_infinity )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:429:4: '-' ( NL )? Num
                    {
                    char_literal89=(Token)match(input,MINUS,FOLLOW_MINUS_in_primitive_pattern2181); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(char_literal89);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:429:8: ( NL )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==NL) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:429:8: NL
                            {
                            NL90=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2183); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL90);


                            }
                            break;

                    }

                    Num91=(Token)match(input,Num,FOLLOW_Num_in_primitive_pattern2186); if (state.failed) return retval; 
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
                    // 429:16: -> ^( UMINUS Num )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:429:19: ^( UMINUS Num )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:430:4: '[' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* )? ']'
                    {
                    char_literal92=(Token)match(input,SQUARE_BRACKET_OPEN,FOLLOW_SQUARE_BRACKET_OPEN_in_primitive_pattern2199); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SQUARE_BRACKET_OPEN.add(char_literal92);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:430:9: ( NL )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==NL) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:430:9: NL
                            {
                            NL93=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2202); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL93);


                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:430:13: ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==L_begin||(LA41_0>=L_obj && LA41_0<=L_if)||(LA41_0>=L_while && LA41_0<=L_for)||LA41_0==L_match||LA41_0==L_val||LA41_0==L_exception||LA41_0==L_try||(LA41_0>=A_infinity && LA41_0<=L_lazy)||(LA41_0>=L_true && LA41_0<=L_nil)||LA41_0==L_typeof||LA41_0==MINUS||LA41_0==A_NOT||LA41_0==U_NOT||(LA41_0>=A_ELLIPSIS && LA41_0<=U_ELLIPSIS)||LA41_0==L_force||(LA41_0>=Constr && LA41_0<=Num)||(LA41_0>=String && LA41_0<=ROUND_BRACKET_OPEN)||LA41_0==SQUARE_BRACKET_OPEN||LA41_0==CURLY_BRACKET_OPEN||LA41_0==UNDERSCORE) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:430:14: bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )*
                            {
                            pushFollow(FOLLOW_bracket_pattern_in_primitive_pattern2206);
                            bracket_pattern94=bracket_pattern();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_bracket_pattern.add(bracket_pattern94.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:430:30: ( NL )?
                            int alt37=2;
                            int LA37_0 = input.LA(1);

                            if ( (LA37_0==NL) ) {
                                alt37=1;
                            }
                            switch (alt37) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:430:30: NL
                                    {
                                    NL95=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2208); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL95);


                                    }
                                    break;

                            }

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:430:34: ( COMMA ( NL )? bracket_pattern ( NL )? )*
                            loop40:
                            do {
                                int alt40=2;
                                int LA40_0 = input.LA(1);

                                if ( (LA40_0==COMMA) ) {
                                    alt40=1;
                                }


                                switch (alt40) {
                            	case 1 :
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:430:36: COMMA ( NL )? bracket_pattern ( NL )?
                            	    {
                            	    COMMA96=(Token)match(input,COMMA,FOLLOW_COMMA_in_primitive_pattern2213); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA96);

                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:430:42: ( NL )?
                            	    int alt38=2;
                            	    int LA38_0 = input.LA(1);

                            	    if ( (LA38_0==NL) ) {
                            	        alt38=1;
                            	    }
                            	    switch (alt38) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:430:42: NL
                            	            {
                            	            NL97=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2215); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL97);


                            	            }
                            	            break;

                            	    }

                            	    pushFollow(FOLLOW_bracket_pattern_in_primitive_pattern2218);
                            	    bracket_pattern98=bracket_pattern();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_bracket_pattern.add(bracket_pattern98.getTree());
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:430:62: ( NL )?
                            	    int alt39=2;
                            	    int LA39_0 = input.LA(1);

                            	    if ( (LA39_0==NL) ) {
                            	        alt39=1;
                            	    }
                            	    switch (alt39) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:430:62: NL
                            	            {
                            	            NL99=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2220); if (state.failed) return retval; 
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

                    char_literal100=(Token)match(input,SQUARE_BRACKET_CLOSE,FOLLOW_SQUARE_BRACKET_CLOSE_in_primitive_pattern2228); if (state.failed) return retval; 
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
                    // 431:6: -> ^( SQUARE_LIST ( bracket_pattern )* )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:431:9: ^( SQUARE_LIST ( bracket_pattern )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SQUARE_LIST, "SQUARE_LIST"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:431:23: ( bracket_pattern )*
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:432:4: '(' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* ( COMMA ( NL )? )? )? ')'
                    {
                    char_literal101=(Token)match(input,ROUND_BRACKET_OPEN,FOLLOW_ROUND_BRACKET_OPEN_in_primitive_pattern2248); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ROUND_BRACKET_OPEN.add(char_literal101);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:432:9: ( NL )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==NL) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:432:9: NL
                            {
                            NL102=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2251); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL102);


                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:432:13: ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* ( COMMA ( NL )? )? )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==L_begin||(LA49_0>=L_obj && LA49_0<=L_if)||(LA49_0>=L_while && LA49_0<=L_for)||LA49_0==L_match||LA49_0==L_val||LA49_0==L_exception||LA49_0==L_try||(LA49_0>=A_infinity && LA49_0<=L_lazy)||(LA49_0>=L_true && LA49_0<=L_nil)||LA49_0==L_typeof||LA49_0==MINUS||LA49_0==A_NOT||LA49_0==U_NOT||(LA49_0>=A_ELLIPSIS && LA49_0<=U_ELLIPSIS)||LA49_0==L_force||(LA49_0>=Constr && LA49_0<=Num)||(LA49_0>=String && LA49_0<=ROUND_BRACKET_OPEN)||LA49_0==SQUARE_BRACKET_OPEN||LA49_0==CURLY_BRACKET_OPEN||LA49_0==UNDERSCORE) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:432:14: bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* ( COMMA ( NL )? )?
                            {
                            pushFollow(FOLLOW_bracket_pattern_in_primitive_pattern2255);
                            bracket_pattern103=bracket_pattern();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_bracket_pattern.add(bracket_pattern103.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:432:30: ( NL )?
                            int alt43=2;
                            int LA43_0 = input.LA(1);

                            if ( (LA43_0==NL) ) {
                                alt43=1;
                            }
                            switch (alt43) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:432:30: NL
                                    {
                                    NL104=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2257); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL104);


                                    }
                                    break;

                            }

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:432:34: ( COMMA ( NL )? bracket_pattern ( NL )? )*
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
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:432:36: COMMA ( NL )? bracket_pattern ( NL )?
                            	    {
                            	    COMMA105=(Token)match(input,COMMA,FOLLOW_COMMA_in_primitive_pattern2262); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA105);

                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:432:43: ( NL )?
                            	    int alt44=2;
                            	    int LA44_0 = input.LA(1);

                            	    if ( (LA44_0==NL) ) {
                            	        alt44=1;
                            	    }
                            	    switch (alt44) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:432:43: NL
                            	            {
                            	            NL106=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2265); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL106);


                            	            }
                            	            break;

                            	    }

                            	    pushFollow(FOLLOW_bracket_pattern_in_primitive_pattern2268);
                            	    bracket_pattern107=bracket_pattern();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_bracket_pattern.add(bracket_pattern107.getTree());
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:432:63: ( NL )?
                            	    int alt45=2;
                            	    int LA45_0 = input.LA(1);

                            	    if ( (LA45_0==NL) ) {
                            	        alt45=1;
                            	    }
                            	    switch (alt45) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:432:63: NL
                            	            {
                            	            NL108=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2270); if (state.failed) return retval; 
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

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:432:69: ( COMMA ( NL )? )?
                            int alt48=2;
                            int LA48_0 = input.LA(1);

                            if ( (LA48_0==COMMA) ) {
                                alt48=1;
                            }
                            switch (alt48) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:432:70: COMMA ( NL )?
                                    {
                                    COMMA109=(Token)match(input,COMMA,FOLLOW_COMMA_in_primitive_pattern2276); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_COMMA.add(COMMA109);

                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:432:76: ( NL )?
                                    int alt47=2;
                                    int LA47_0 = input.LA(1);

                                    if ( (LA47_0==NL) ) {
                                        alt47=1;
                                    }
                                    switch (alt47) {
                                        case 1 :
                                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:432:76: NL
                                            {
                                            NL110=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2278); if (state.failed) return retval; 
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

                    char_literal111=(Token)match(input,ROUND_BRACKET_CLOSE,FOLLOW_ROUND_BRACKET_CLOSE_in_primitive_pattern2285); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ROUND_BRACKET_CLOSE.add(char_literal111);



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
                    // 433:5: -> ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( bracket_pattern )* ) )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:433:8: ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( bracket_pattern )* ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ROUND_LIST, "ROUND_LIST"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:433:21: ^( NIL_TOKEN ( COMMA )* )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_2);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:433:33: ( COMMA )*
                        while ( stream_COMMA.hasNext() ) {
                            adaptor.addChild(root_2, stream_COMMA.nextNode());

                        }
                        stream_COMMA.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:433:41: ^( NIL_TOKEN ( bracket_pattern )* )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_2);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:433:53: ( bracket_pattern )*
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:434:4: '{' ( NL )? ( mselem_pattern ( NL )? ( COMMA ( NL )? mselem_pattern ( NL )? )* )? '}'
                    {
                    char_literal112=(Token)match(input,CURLY_BRACKET_OPEN,FOLLOW_CURLY_BRACKET_OPEN_in_primitive_pattern2317); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_OPEN.add(char_literal112);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:434:9: ( NL )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==NL) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:434:9: NL
                            {
                            NL113=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2320); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL113);


                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:434:13: ( mselem_pattern ( NL )? ( COMMA ( NL )? mselem_pattern ( NL )? )* )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==L_begin||(LA55_0>=L_obj && LA55_0<=L_if)||(LA55_0>=L_while && LA55_0<=L_for)||LA55_0==L_match||LA55_0==L_val||LA55_0==L_exception||LA55_0==L_try||(LA55_0>=A_infinity && LA55_0<=L_lazy)||(LA55_0>=L_true && LA55_0<=L_nil)||LA55_0==L_typeof||LA55_0==MINUS||LA55_0==A_NOT||LA55_0==U_NOT||(LA55_0>=A_ELLIPSIS && LA55_0<=U_ELLIPSIS)||LA55_0==L_force||(LA55_0>=Constr && LA55_0<=Num)||(LA55_0>=String && LA55_0<=ROUND_BRACKET_OPEN)||LA55_0==SQUARE_BRACKET_OPEN||LA55_0==CURLY_BRACKET_OPEN||LA55_0==UNDERSCORE) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:434:14: mselem_pattern ( NL )? ( COMMA ( NL )? mselem_pattern ( NL )? )*
                            {
                            pushFollow(FOLLOW_mselem_pattern_in_primitive_pattern2324);
                            mselem_pattern114=mselem_pattern();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_mselem_pattern.add(mselem_pattern114.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:434:29: ( NL )?
                            int alt51=2;
                            int LA51_0 = input.LA(1);

                            if ( (LA51_0==NL) ) {
                                alt51=1;
                            }
                            switch (alt51) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:434:29: NL
                                    {
                                    NL115=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2326); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL115);


                                    }
                                    break;

                            }

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:434:33: ( COMMA ( NL )? mselem_pattern ( NL )? )*
                            loop54:
                            do {
                                int alt54=2;
                                int LA54_0 = input.LA(1);

                                if ( (LA54_0==COMMA) ) {
                                    alt54=1;
                                }


                                switch (alt54) {
                            	case 1 :
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:434:35: COMMA ( NL )? mselem_pattern ( NL )?
                            	    {
                            	    COMMA116=(Token)match(input,COMMA,FOLLOW_COMMA_in_primitive_pattern2331); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA116);

                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:434:42: ( NL )?
                            	    int alt52=2;
                            	    int LA52_0 = input.LA(1);

                            	    if ( (LA52_0==NL) ) {
                            	        alt52=1;
                            	    }
                            	    switch (alt52) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:434:42: NL
                            	            {
                            	            NL117=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2334); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL117);


                            	            }
                            	            break;

                            	    }

                            	    pushFollow(FOLLOW_mselem_pattern_in_primitive_pattern2337);
                            	    mselem_pattern118=mselem_pattern();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_mselem_pattern.add(mselem_pattern118.getTree());
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:434:61: ( NL )?
                            	    int alt53=2;
                            	    int LA53_0 = input.LA(1);

                            	    if ( (LA53_0==NL) ) {
                            	        alt53=1;
                            	    }
                            	    switch (alt53) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:434:61: NL
                            	            {
                            	            NL119=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2339); if (state.failed) return retval; 
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

                    char_literal120=(Token)match(input,CURLY_BRACKET_CLOSE,FOLLOW_CURLY_BRACKET_CLOSE_in_primitive_pattern2347); if (state.failed) return retval; 
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
                    // 435:5: -> ^( MAP_OR_SET_OR_OBJ ( mselem_pattern )* )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:435:8: ^( MAP_OR_SET_OR_OBJ ( mselem_pattern )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MAP_OR_SET_OR_OBJ, "MAP_OR_SET_OR_OBJ"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:435:28: ( mselem_pattern )*
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:436:4: '{' ( NL )? token_ARROW ( NL )? '}'
                    {
                    char_literal121=(Token)match(input,CURLY_BRACKET_OPEN,FOLLOW_CURLY_BRACKET_OPEN_in_primitive_pattern2365); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_OPEN.add(char_literal121);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:436:8: ( NL )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==NL) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:436:8: NL
                            {
                            NL122=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2367); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL122);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_token_ARROW_in_primitive_pattern2370);
                    token_ARROW123=token_ARROW();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_token_ARROW.add(token_ARROW123.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:436:24: ( NL )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==NL) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:436:24: NL
                            {
                            NL124=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2372); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL124);


                            }
                            break;

                    }

                    char_literal125=(Token)match(input,CURLY_BRACKET_CLOSE,FOLLOW_CURLY_BRACKET_CLOSE_in_primitive_pattern2375); if (state.failed) return retval; 
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
                    // 436:32: -> ^( EMPTY_MAP )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:436:35: ^( EMPTY_MAP )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:439:1: sep : ( NL | SC )+ ;
    public final babel17Parser.sep_return sep() throws RecognitionException {
        babel17Parser.sep_return retval = new babel17Parser.sep_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set126=null;

        CommonTree set126_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:439:5: ( ( NL | SC )+ )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:439:7: ( NL | SC )+
            {
            root_0 = (CommonTree)adaptor.nil();

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:439:7: ( NL | SC )+
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:441:1: block : ( ( sep )? statement ( sep statement )* ( sep )? -> ^( BLOCK ( statement )* ) | ( sep )? -> ^( BLOCK ) );
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:441:8: ( ( sep )? statement ( sep statement )* ( sep )? -> ^( BLOCK ( statement )* ) | ( sep )? -> ^( BLOCK ) )
            int alt64=2;
            alt64 = dfa64.predict(input);
            switch (alt64) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:441:10: ( sep )? statement ( sep statement )* ( sep )?
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:441:10: ( sep )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==SC||LA60_0==NL) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:441:10: sep
                            {
                            pushFollow(FOLLOW_sep_in_block2407);
                            sep127=sep();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_sep.add(sep127.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_statement_in_block2410);
                    statement128=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement128.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:441:25: ( sep statement )*
                    loop61:
                    do {
                        int alt61=2;
                        alt61 = dfa61.predict(input);
                        switch (alt61) {
                    	case 1 :
                    	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:441:26: sep statement
                    	    {
                    	    pushFollow(FOLLOW_sep_in_block2413);
                    	    sep129=sep();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_sep.add(sep129.getTree());
                    	    pushFollow(FOLLOW_statement_in_block2415);
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

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:441:42: ( sep )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==SC||LA62_0==NL) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:441:42: sep
                            {
                            pushFollow(FOLLOW_sep_in_block2419);
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
                    // 441:47: -> ^( BLOCK ( statement )* )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:441:50: ^( BLOCK ( statement )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:441:58: ( statement )*
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:442:4: ( sep )?
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:442:4: ( sep )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==SC||LA63_0==NL) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:442:4: sep
                            {
                            pushFollow(FOLLOW_sep_in_block2435);
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
                    // 442:9: -> ^( BLOCK )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:442:12: ^( BLOCK )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:444:1: pure_block : statement ( sep statement )* -> ^( BLOCK ( statement )* ) ;
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:445:2: ( statement ( sep statement )* -> ^( BLOCK ( statement )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:445:4: statement ( sep statement )*
            {
            pushFollow(FOLLOW_statement_in_pure_block2452);
            statement133=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statement.add(statement133.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:445:14: ( sep statement )*
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
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:445:15: sep statement
            	    {
            	    pushFollow(FOLLOW_sep_in_pure_block2455);
            	    sep134=sep();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_sep.add(sep134.getTree());
            	    pushFollow(FOLLOW_statement_in_pure_block2457);
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
            // 445:31: -> ^( BLOCK ( statement )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:445:34: ^( BLOCK ( statement )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:445:42: ( statement )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:447:1: statement : ( st_typedef | st_val | st_def | st_yield | st_memoize | st_private | st_module | st_import | expr_or_assign | PRAGMA_PRINT expr -> ^( PRAGMA_PRINT expr ) | PRAGMA_LOG expr -> ^( PRAGMA_LOG expr ) | PRAGMA_PROFILE expr -> ^( PRAGMA_PROFILE expr ) | PRAGMA_ASSERT expr -> ^( PRAGMA_ASSERT expr ) );
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:448:2: ( st_typedef | st_val | st_def | st_yield | st_memoize | st_private | st_module | st_import | expr_or_assign | PRAGMA_PRINT expr -> ^( PRAGMA_PRINT expr ) | PRAGMA_LOG expr -> ^( PRAGMA_LOG expr ) | PRAGMA_PROFILE expr -> ^( PRAGMA_PROFILE expr ) | PRAGMA_ASSERT expr -> ^( PRAGMA_ASSERT expr ) )
            int alt66=13;
            alt66 = dfa66.predict(input);
            switch (alt66) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:448:4: st_typedef
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_st_typedef_in_statement2478);
                    st_typedef136=st_typedef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, st_typedef136.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:449:10: st_val
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_st_val_in_statement2489);
                    st_val137=st_val();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, st_val137.getTree());

                    }
                    break;
                case 3 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:450:4: st_def
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_st_def_in_statement2494);
                    st_def138=st_def();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, st_def138.getTree());

                    }
                    break;
                case 4 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:451:4: st_yield
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_st_yield_in_statement2499);
                    st_yield139=st_yield();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, st_yield139.getTree());

                    }
                    break;
                case 5 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:452:4: st_memoize
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_st_memoize_in_statement2504);
                    st_memoize140=st_memoize();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, st_memoize140.getTree());

                    }
                    break;
                case 6 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:453:4: st_private
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_st_private_in_statement2509);
                    st_private141=st_private();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, st_private141.getTree());

                    }
                    break;
                case 7 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:454:4: st_module
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_st_module_in_statement2514);
                    st_module142=st_module();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, st_module142.getTree());

                    }
                    break;
                case 8 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:455:4: st_import
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_st_import_in_statement2519);
                    st_import143=st_import();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, st_import143.getTree());

                    }
                    break;
                case 9 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:456:4: expr_or_assign
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_expr_or_assign_in_statement2524);
                    expr_or_assign144=expr_or_assign();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_or_assign144.getTree());

                    }
                    break;
                case 10 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:457:5: PRAGMA_PRINT expr
                    {
                    PRAGMA_PRINT145=(Token)match(input,PRAGMA_PRINT,FOLLOW_PRAGMA_PRINT_in_statement2530); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PRAGMA_PRINT.add(PRAGMA_PRINT145);

                    pushFollow(FOLLOW_expr_in_statement2532);
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
                    // 457:23: -> ^( PRAGMA_PRINT expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:457:26: ^( PRAGMA_PRINT expr )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:458:5: PRAGMA_LOG expr
                    {
                    PRAGMA_LOG147=(Token)match(input,PRAGMA_LOG,FOLLOW_PRAGMA_LOG_in_statement2546); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PRAGMA_LOG.add(PRAGMA_LOG147);

                    pushFollow(FOLLOW_expr_in_statement2548);
                    expr148=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr148.getTree());


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
                    // 458:21: -> ^( PRAGMA_LOG expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:458:24: ^( PRAGMA_LOG expr )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:459:5: PRAGMA_PROFILE expr
                    {
                    PRAGMA_PROFILE149=(Token)match(input,PRAGMA_PROFILE,FOLLOW_PRAGMA_PROFILE_in_statement2562); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PRAGMA_PROFILE.add(PRAGMA_PROFILE149);

                    pushFollow(FOLLOW_expr_in_statement2564);
                    expr150=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr150.getTree());


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
                    // 459:25: -> ^( PRAGMA_PROFILE expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:459:28: ^( PRAGMA_PROFILE expr )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:460:5: PRAGMA_ASSERT expr
                    {
                    PRAGMA_ASSERT151=(Token)match(input,PRAGMA_ASSERT,FOLLOW_PRAGMA_ASSERT_in_statement2578); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PRAGMA_ASSERT.add(PRAGMA_ASSERT151);

                    pushFollow(FOLLOW_expr_in_statement2580);
                    expr152=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr152.getTree());


                    // AST REWRITE
                    // elements: expr, PRAGMA_ASSERT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 460:24: -> ^( PRAGMA_ASSERT expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:460:27: ^( PRAGMA_ASSERT expr )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:462:1: objelem_assign : Id PERIOD Id -> ^( OBJELEM_ASSIGN Id Id ) ;
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:463:2: ( Id PERIOD Id -> ^( OBJELEM_ASSIGN Id Id ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:463:4: Id PERIOD Id
            {
            Id153=(Token)match(input,Id,FOLLOW_Id_in_objelem_assign2598); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Id.add(Id153);

            PERIOD154=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_objelem_assign2600); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD154);

            Id155=(Token)match(input,Id,FOLLOW_Id_in_objelem_assign2602); if (state.failed) return retval; 
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
            // 463:17: -> ^( OBJELEM_ASSIGN Id Id )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:463:20: ^( OBJELEM_ASSIGN Id Id )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:465:1: st_val : L_val ( NL )? ( pattern | objelem_assign ) ( NL )? '=' ( NL )? expr -> ^( VAL ( pattern )* ( objelem_assign )* expr ) ;
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:465:8: ( L_val ( NL )? ( pattern | objelem_assign ) ( NL )? '=' ( NL )? expr -> ^( VAL ( pattern )* ( objelem_assign )* expr ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:465:10: L_val ( NL )? ( pattern | objelem_assign ) ( NL )? '=' ( NL )? expr
            {
            L_val156=(Token)match(input,L_val,FOLLOW_L_val_in_st_val2621); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_val.add(L_val156);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:465:16: ( NL )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==NL) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:465:16: NL
                    {
                    NL157=(Token)match(input,NL,FOLLOW_NL_in_st_val2623); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL157);


                    }
                    break;

            }

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:465:20: ( pattern | objelem_assign )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:465:21: pattern
                    {
                    pushFollow(FOLLOW_pattern_in_st_val2627);
                    pattern158=pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pattern.add(pattern158.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:465:31: objelem_assign
                    {
                    pushFollow(FOLLOW_objelem_assign_in_st_val2631);
                    objelem_assign159=objelem_assign();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_objelem_assign.add(objelem_assign159.getTree());

                    }
                    break;

            }

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:465:47: ( NL )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==NL) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:465:47: NL
                    {
                    NL160=(Token)match(input,NL,FOLLOW_NL_in_st_val2634); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL160);


                    }
                    break;

            }

            char_literal161=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_st_val2637); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal161);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:465:55: ( NL )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==NL) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:465:55: NL
                    {
                    NL162=(Token)match(input,NL,FOLLOW_NL_in_st_val2639); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL162);


                    }
                    break;

            }

            pushFollow(FOLLOW_expr_in_st_val2642);
            expr163=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr163.getTree());


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
            // 465:64: -> ^( VAL ( pattern )* ( objelem_assign )* expr )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:465:67: ^( VAL ( pattern )* ( objelem_assign )* expr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VAL, "VAL"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:465:73: ( pattern )*
                while ( stream_pattern.hasNext() ) {
                    adaptor.addChild(root_1, stream_pattern.nextTree());

                }
                stream_pattern.reset();
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:465:82: ( objelem_assign )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:467:1: st_def : ( L_def ( NL )? Id ( NL )? ( primitive_pattern ( NL )? )? ( ':' ( NL )? typeid ( NL )? )? '=' ( NL )? expr -> ^( DEF Id ( typeid )? ( primitive_pattern )? expr ) | L_def ( NL )? L_this ( NL )? ':' ( NL )? typeid ( NL )? '=' ( NL )? expr -> ^( CONVERSION typeid expr ) );
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:467:8: ( L_def ( NL )? Id ( NL )? ( primitive_pattern ( NL )? )? ( ':' ( NL )? typeid ( NL )? )? '=' ( NL )? expr -> ^( DEF Id ( typeid )? ( primitive_pattern )? expr ) | L_def ( NL )? L_this ( NL )? ':' ( NL )? typeid ( NL )? '=' ( NL )? expr -> ^( CONVERSION typeid expr ) )
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
                case L_this:
                    {
                    alt84=2;
                    }
                    break;
                case Id:
                    {
                    alt84=1;
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:467:10: L_def ( NL )? Id ( NL )? ( primitive_pattern ( NL )? )? ( ':' ( NL )? typeid ( NL )? )? '=' ( NL )? expr
                    {
                    L_def164=(Token)match(input,L_def,FOLLOW_L_def_in_st_def2666); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_def.add(L_def164);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:467:16: ( NL )?
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==NL) ) {
                        alt71=1;
                    }
                    switch (alt71) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:467:16: NL
                            {
                            NL165=(Token)match(input,NL,FOLLOW_NL_in_st_def2668); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL165);


                            }
                            break;

                    }

                    Id166=(Token)match(input,Id,FOLLOW_Id_in_st_def2671); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Id.add(Id166);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:467:23: ( NL )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==NL) ) {
                        alt72=1;
                    }
                    switch (alt72) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:467:23: NL
                            {
                            NL167=(Token)match(input,NL,FOLLOW_NL_in_st_def2673); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL167);


                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:467:27: ( primitive_pattern ( NL )? )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( ((LA74_0>=A_infinity && LA74_0<=U_infinity)||(LA74_0>=L_true && LA74_0<=L_false)||LA74_0==L_nil||LA74_0==MINUS||(LA74_0>=Id && LA74_0<=Num)||(LA74_0>=String && LA74_0<=ROUND_BRACKET_OPEN)||LA74_0==SQUARE_BRACKET_OPEN||LA74_0==CURLY_BRACKET_OPEN||LA74_0==UNDERSCORE) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:467:28: primitive_pattern ( NL )?
                            {
                            pushFollow(FOLLOW_primitive_pattern_in_st_def2677);
                            primitive_pattern168=primitive_pattern();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_primitive_pattern.add(primitive_pattern168.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:467:46: ( NL )?
                            int alt73=2;
                            int LA73_0 = input.LA(1);

                            if ( (LA73_0==NL) ) {
                                alt73=1;
                            }
                            switch (alt73) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:467:46: NL
                                    {
                                    NL169=(Token)match(input,NL,FOLLOW_NL_in_st_def2679); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL169);


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:467:52: ( ':' ( NL )? typeid ( NL )? )?
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==COLON) ) {
                        alt77=1;
                    }
                    switch (alt77) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:467:53: ':' ( NL )? typeid ( NL )?
                            {
                            char_literal170=(Token)match(input,COLON,FOLLOW_COLON_in_st_def2685); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COLON.add(char_literal170);

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:467:57: ( NL )?
                            int alt75=2;
                            int LA75_0 = input.LA(1);

                            if ( (LA75_0==NL) ) {
                                alt75=1;
                            }
                            switch (alt75) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:467:57: NL
                                    {
                                    NL171=(Token)match(input,NL,FOLLOW_NL_in_st_def2687); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL171);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_typeid_in_st_def2690);
                            typeid172=typeid();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeid.add(typeid172.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:467:68: ( NL )?
                            int alt76=2;
                            int LA76_0 = input.LA(1);

                            if ( (LA76_0==NL) ) {
                                alt76=1;
                            }
                            switch (alt76) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:467:68: NL
                                    {
                                    NL173=(Token)match(input,NL,FOLLOW_NL_in_st_def2692); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL173);


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    char_literal174=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_st_def2697); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal174);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:467:78: ( NL )?
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==NL) ) {
                        alt78=1;
                    }
                    switch (alt78) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:467:78: NL
                            {
                            NL175=(Token)match(input,NL,FOLLOW_NL_in_st_def2699); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL175);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_expr_in_st_def2702);
                    expr176=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr176.getTree());


                    // AST REWRITE
                    // elements: Id, expr, primitive_pattern, typeid
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 468:5: -> ^( DEF Id ( typeid )? ( primitive_pattern )? expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:468:8: ^( DEF Id ( typeid )? ( primitive_pattern )? expr )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DEF, "DEF"), root_1);

                        adaptor.addChild(root_1, stream_Id.nextNode());
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:468:17: ( typeid )?
                        if ( stream_typeid.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeid.nextTree());

                        }
                        stream_typeid.reset();
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:468:25: ( primitive_pattern )?
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:469:4: L_def ( NL )? L_this ( NL )? ':' ( NL )? typeid ( NL )? '=' ( NL )? expr
                    {
                    L_def177=(Token)match(input,L_def,FOLLOW_L_def_in_st_def2728); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_def.add(L_def177);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:469:10: ( NL )?
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==NL) ) {
                        alt79=1;
                    }
                    switch (alt79) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:469:10: NL
                            {
                            NL178=(Token)match(input,NL,FOLLOW_NL_in_st_def2730); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL178);


                            }
                            break;

                    }

                    L_this179=(Token)match(input,L_this,FOLLOW_L_this_in_st_def2733); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_this.add(L_this179);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:469:21: ( NL )?
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==NL) ) {
                        alt80=1;
                    }
                    switch (alt80) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:469:21: NL
                            {
                            NL180=(Token)match(input,NL,FOLLOW_NL_in_st_def2735); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL180);


                            }
                            break;

                    }

                    char_literal181=(Token)match(input,COLON,FOLLOW_COLON_in_st_def2738); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(char_literal181);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:469:29: ( NL )?
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==NL) ) {
                        alt81=1;
                    }
                    switch (alt81) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:469:29: NL
                            {
                            NL182=(Token)match(input,NL,FOLLOW_NL_in_st_def2740); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL182);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_typeid_in_st_def2743);
                    typeid183=typeid();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeid.add(typeid183.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:469:40: ( NL )?
                    int alt82=2;
                    int LA82_0 = input.LA(1);

                    if ( (LA82_0==NL) ) {
                        alt82=1;
                    }
                    switch (alt82) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:469:40: NL
                            {
                            NL184=(Token)match(input,NL,FOLLOW_NL_in_st_def2745); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL184);


                            }
                            break;

                    }

                    char_literal185=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_st_def2748); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal185);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:469:48: ( NL )?
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==NL) ) {
                        alt83=1;
                    }
                    switch (alt83) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:469:48: NL
                            {
                            NL186=(Token)match(input,NL,FOLLOW_NL_in_st_def2750); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL186);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_expr_in_st_def2753);
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
                    // 469:57: -> ^( CONVERSION typeid expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:469:60: ^( CONVERSION typeid expr )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:471:1: st_typedef : L_typedef ( NL )? Id ( NL )? typedef_clause ( ( NL )? COMMA ( NL )? typedef_clause )* -> ^( TYPEDEF Id ^( NIL_TOKEN ( typedef_clause )* ) ) ;
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:472:2: ( L_typedef ( NL )? Id ( NL )? typedef_clause ( ( NL )? COMMA ( NL )? typedef_clause )* -> ^( TYPEDEF Id ^( NIL_TOKEN ( typedef_clause )* ) ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:472:4: L_typedef ( NL )? Id ( NL )? typedef_clause ( ( NL )? COMMA ( NL )? typedef_clause )*
            {
            L_typedef188=(Token)match(input,L_typedef,FOLLOW_L_typedef_in_st_typedef2776); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_typedef.add(L_typedef188);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:472:14: ( NL )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==NL) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:472:14: NL
                    {
                    NL189=(Token)match(input,NL,FOLLOW_NL_in_st_typedef2778); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL189);


                    }
                    break;

            }

            Id190=(Token)match(input,Id,FOLLOW_Id_in_st_typedef2781); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Id.add(Id190);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:472:21: ( NL )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==NL) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:472:21: NL
                    {
                    NL191=(Token)match(input,NL,FOLLOW_NL_in_st_typedef2783); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL191);


                    }
                    break;

            }

            pushFollow(FOLLOW_typedef_clause_in_st_typedef2786);
            typedef_clause192=typedef_clause();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typedef_clause.add(typedef_clause192.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:472:40: ( ( NL )? COMMA ( NL )? typedef_clause )*
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
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:472:41: ( NL )? COMMA ( NL )? typedef_clause
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:472:41: ( NL )?
            	    int alt87=2;
            	    int LA87_0 = input.LA(1);

            	    if ( (LA87_0==NL) ) {
            	        alt87=1;
            	    }
            	    switch (alt87) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:472:41: NL
            	            {
            	            NL193=(Token)match(input,NL,FOLLOW_NL_in_st_typedef2789); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL193);


            	            }
            	            break;

            	    }

            	    COMMA194=(Token)match(input,COMMA,FOLLOW_COMMA_in_st_typedef2792); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA194);

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:472:51: ( NL )?
            	    int alt88=2;
            	    int LA88_0 = input.LA(1);

            	    if ( (LA88_0==NL) ) {
            	        alt88=1;
            	    }
            	    switch (alt88) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:472:51: NL
            	            {
            	            NL195=(Token)match(input,NL,FOLLOW_NL_in_st_typedef2794); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL195);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_typedef_clause_in_st_typedef2797);
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
            // 472:72: -> ^( TYPEDEF Id ^( NIL_TOKEN ( typedef_clause )* ) )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:472:75: ^( TYPEDEF Id ^( NIL_TOKEN ( typedef_clause )* ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TYPEDEF, "TYPEDEF"), root_1);

                adaptor.addChild(root_1, stream_Id.nextNode());
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:472:88: ^( NIL_TOKEN ( typedef_clause )* )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_2);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:472:100: ( typedef_clause )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:474:1: typedef_clause : ( ( primitive_pattern ( NL )? '=' )=> primitive_pattern ( NL )? '=' ( NL )? expr -> ^( TYPEDEF_CLAUSE primitive_pattern expr ) | primitive_pattern -> ^( TYPEDEF_CLAUSE primitive_pattern ) );
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:475:2: ( ( primitive_pattern ( NL )? '=' )=> primitive_pattern ( NL )? '=' ( NL )? expr -> ^( TYPEDEF_CLAUSE primitive_pattern expr ) | primitive_pattern -> ^( TYPEDEF_CLAUSE primitive_pattern ) )
            int alt92=2;
            alt92 = dfa92.predict(input);
            switch (alt92) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:475:4: ( primitive_pattern ( NL )? '=' )=> primitive_pattern ( NL )? '=' ( NL )? expr
                    {
                    pushFollow(FOLLOW_primitive_pattern_in_typedef_clause2835);
                    primitive_pattern197=primitive_pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primitive_pattern.add(primitive_pattern197.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:475:53: ( NL )?
                    int alt90=2;
                    int LA90_0 = input.LA(1);

                    if ( (LA90_0==NL) ) {
                        alt90=1;
                    }
                    switch (alt90) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:475:53: NL
                            {
                            NL198=(Token)match(input,NL,FOLLOW_NL_in_typedef_clause2837); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL198);


                            }
                            break;

                    }

                    char_literal199=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_typedef_clause2840); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal199);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:475:61: ( NL )?
                    int alt91=2;
                    int LA91_0 = input.LA(1);

                    if ( (LA91_0==NL) ) {
                        alt91=1;
                    }
                    switch (alt91) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:475:61: NL
                            {
                            NL200=(Token)match(input,NL,FOLLOW_NL_in_typedef_clause2842); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL200);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_expr_in_typedef_clause2845);
                    expr201=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr201.getTree());


                    // AST REWRITE
                    // elements: expr, primitive_pattern
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 475:70: -> ^( TYPEDEF_CLAUSE primitive_pattern expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:475:73: ^( TYPEDEF_CLAUSE primitive_pattern expr )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:476:4: primitive_pattern
                    {
                    pushFollow(FOLLOW_primitive_pattern_in_typedef_clause2860);
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
                    // 476:22: -> ^( TYPEDEF_CLAUSE primitive_pattern )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:476:25: ^( TYPEDEF_CLAUSE primitive_pattern )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:478:1: st_yield : L_yield expr -> ^( YIELD expr ) ;
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:478:9: ( L_yield expr -> ^( YIELD expr ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:478:11: L_yield expr
            {
            L_yield203=(Token)match(input,L_yield,FOLLOW_L_yield_in_st_yield2879); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_yield.add(L_yield203);

            pushFollow(FOLLOW_expr_in_st_yield2881);
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
            // 478:24: -> ^( YIELD expr )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:478:27: ^( YIELD expr )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:480:1: st_memoize : L_memoize memo_id ( ( NL )? COMMA ( NL )? memo_id )* -> ^( MEMOIZE ( memo_id )* ) ;
    public final babel17Parser.st_memoize_return st_memoize() throws RecognitionException {
        babel17Parser.st_memoize_return retval = new babel17Parser.st_memoize_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_memoize205=null;
        Token NL207=null;
        Token COMMA208=null;
        Token NL209=null;
        babel17Parser.memo_id_return memo_id206 = null;

        babel17Parser.memo_id_return memo_id210 = null;


        CommonTree L_memoize205_tree=null;
        CommonTree NL207_tree=null;
        CommonTree COMMA208_tree=null;
        CommonTree NL209_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_memoize=new RewriteRuleTokenStream(adaptor,"token L_memoize");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_memo_id=new RewriteRuleSubtreeStream(adaptor,"rule memo_id");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:481:2: ( L_memoize memo_id ( ( NL )? COMMA ( NL )? memo_id )* -> ^( MEMOIZE ( memo_id )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:481:4: L_memoize memo_id ( ( NL )? COMMA ( NL )? memo_id )*
            {
            L_memoize205=(Token)match(input,L_memoize,FOLLOW_L_memoize_in_st_memoize2902); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_memoize.add(L_memoize205);

            pushFollow(FOLLOW_memo_id_in_st_memoize2904);
            memo_id206=memo_id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_memo_id.add(memo_id206.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:481:22: ( ( NL )? COMMA ( NL )? memo_id )*
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
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:481:23: ( NL )? COMMA ( NL )? memo_id
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:481:23: ( NL )?
            	    int alt93=2;
            	    int LA93_0 = input.LA(1);

            	    if ( (LA93_0==NL) ) {
            	        alt93=1;
            	    }
            	    switch (alt93) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:481:23: NL
            	            {
            	            NL207=(Token)match(input,NL,FOLLOW_NL_in_st_memoize2907); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL207);


            	            }
            	            break;

            	    }

            	    COMMA208=(Token)match(input,COMMA,FOLLOW_COMMA_in_st_memoize2910); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA208);

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:481:33: ( NL )?
            	    int alt94=2;
            	    int LA94_0 = input.LA(1);

            	    if ( (LA94_0==NL) ) {
            	        alt94=1;
            	    }
            	    switch (alt94) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:481:33: NL
            	            {
            	            NL209=(Token)match(input,NL,FOLLOW_NL_in_st_memoize2912); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL209);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_memo_id_in_st_memoize2915);
            	    memo_id210=memo_id();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_memo_id.add(memo_id210.getTree());

            	    }
            	    break;

            	default :
            	    break loop95;
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
            // 482:5: -> ^( MEMOIZE ( memo_id )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:482:8: ^( MEMOIZE ( memo_id )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MEMOIZE, "MEMOIZE"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:482:18: ( memo_id )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:484:1: memo_id : ( Id -> ^( MEMOID_STRONG Id ) | '(' Id ')' -> ^( MEMOID_WEAK Id ) );
    public final babel17Parser.memo_id_return memo_id() throws RecognitionException {
        babel17Parser.memo_id_return retval = new babel17Parser.memo_id_return();
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:484:9: ( Id -> ^( MEMOID_STRONG Id ) | '(' Id ')' -> ^( MEMOID_WEAK Id ) )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:484:11: Id
                    {
                    Id211=(Token)match(input,Id,FOLLOW_Id_in_memo_id2944); if (state.failed) return retval; 
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
                    // 484:14: -> ^( MEMOID_STRONG Id )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:484:17: ^( MEMOID_STRONG Id )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:485:4: '(' Id ')'
                    {
                    char_literal212=(Token)match(input,ROUND_BRACKET_OPEN,FOLLOW_ROUND_BRACKET_OPEN_in_memo_id2957); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ROUND_BRACKET_OPEN.add(char_literal212);

                    Id213=(Token)match(input,Id,FOLLOW_Id_in_memo_id2959); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Id.add(Id213);

                    char_literal214=(Token)match(input,ROUND_BRACKET_CLOSE,FOLLOW_ROUND_BRACKET_CLOSE_in_memo_id2961); if (state.failed) return retval; 
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
                    // 485:15: -> ^( MEMOID_WEAK Id )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:485:18: ^( MEMOID_WEAK Id )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:487:1: st_private : L_private private_id ( ( NL )? COMMA ( NL )? private_id )* -> ^( PRIVATE ( private_id )* ) ;
    public final babel17Parser.st_private_return st_private() throws RecognitionException {
        babel17Parser.st_private_return retval = new babel17Parser.st_private_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_private215=null;
        Token NL217=null;
        Token COMMA218=null;
        Token NL219=null;
        babel17Parser.private_id_return private_id216 = null;

        babel17Parser.private_id_return private_id220 = null;


        CommonTree L_private215_tree=null;
        CommonTree NL217_tree=null;
        CommonTree COMMA218_tree=null;
        CommonTree NL219_tree=null;
        RewriteRuleTokenStream stream_L_private=new RewriteRuleTokenStream(adaptor,"token L_private");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_private_id=new RewriteRuleSubtreeStream(adaptor,"rule private_id");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:488:2: ( L_private private_id ( ( NL )? COMMA ( NL )? private_id )* -> ^( PRIVATE ( private_id )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:488:4: L_private private_id ( ( NL )? COMMA ( NL )? private_id )*
            {
            L_private215=(Token)match(input,L_private,FOLLOW_L_private_in_st_private2978); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_private.add(L_private215);

            pushFollow(FOLLOW_private_id_in_st_private2980);
            private_id216=private_id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_private_id.add(private_id216.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:488:25: ( ( NL )? COMMA ( NL )? private_id )*
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
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:488:26: ( NL )? COMMA ( NL )? private_id
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:488:26: ( NL )?
            	    int alt97=2;
            	    int LA97_0 = input.LA(1);

            	    if ( (LA97_0==NL) ) {
            	        alt97=1;
            	    }
            	    switch (alt97) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:488:26: NL
            	            {
            	            NL217=(Token)match(input,NL,FOLLOW_NL_in_st_private2983); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL217);


            	            }
            	            break;

            	    }

            	    COMMA218=(Token)match(input,COMMA,FOLLOW_COMMA_in_st_private2986); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA218);

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:488:36: ( NL )?
            	    int alt98=2;
            	    int LA98_0 = input.LA(1);

            	    if ( (LA98_0==NL) ) {
            	        alt98=1;
            	    }
            	    switch (alt98) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:488:36: NL
            	            {
            	            NL219=(Token)match(input,NL,FOLLOW_NL_in_st_private2988); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL219);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_private_id_in_st_private2991);
            	    private_id220=private_id();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_private_id.add(private_id220.getTree());

            	    }
            	    break;

            	default :
            	    break loop99;
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
            // 489:5: -> ^( PRIVATE ( private_id )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:489:8: ^( PRIVATE ( private_id )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PRIVATE, "PRIVATE"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:489:18: ( private_id )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:491:1: private_id : ( Id -> ^( PRIVATEID_STRONG Id ) | '(' Id ')' -> ^( PRIVATEID_WEAK Id ) );
    public final babel17Parser.private_id_return private_id() throws RecognitionException {
        babel17Parser.private_id_return retval = new babel17Parser.private_id_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Id221=null;
        Token char_literal222=null;
        Token Id223=null;
        Token char_literal224=null;

        CommonTree Id221_tree=null;
        CommonTree char_literal222_tree=null;
        CommonTree Id223_tree=null;
        CommonTree char_literal224_tree=null;
        RewriteRuleTokenStream stream_ROUND_BRACKET_OPEN=new RewriteRuleTokenStream(adaptor,"token ROUND_BRACKET_OPEN");
        RewriteRuleTokenStream stream_ROUND_BRACKET_CLOSE=new RewriteRuleTokenStream(adaptor,"token ROUND_BRACKET_CLOSE");
        RewriteRuleTokenStream stream_Id=new RewriteRuleTokenStream(adaptor,"token Id");

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:492:2: ( Id -> ^( PRIVATEID_STRONG Id ) | '(' Id ')' -> ^( PRIVATEID_WEAK Id ) )
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==Id) ) {
                alt100=1;
            }
            else if ( (LA100_0==ROUND_BRACKET_OPEN) ) {
                alt100=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 100, 0, input);

                throw nvae;
            }
            switch (alt100) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:492:4: Id
                    {
                    Id221=(Token)match(input,Id,FOLLOW_Id_in_private_id3017); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Id.add(Id221);



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
                    // 492:7: -> ^( PRIVATEID_STRONG Id )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:492:10: ^( PRIVATEID_STRONG Id )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:493:4: '(' Id ')'
                    {
                    char_literal222=(Token)match(input,ROUND_BRACKET_OPEN,FOLLOW_ROUND_BRACKET_OPEN_in_private_id3030); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ROUND_BRACKET_OPEN.add(char_literal222);

                    Id223=(Token)match(input,Id,FOLLOW_Id_in_private_id3032); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Id.add(Id223);

                    char_literal224=(Token)match(input,ROUND_BRACKET_CLOSE,FOLLOW_ROUND_BRACKET_CLOSE_in_private_id3034); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ROUND_BRACKET_CLOSE.add(char_literal224);



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
                    // 493:15: -> ^( PRIVATEID_WEAK Id )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:493:18: ^( PRIVATEID_WEAK Id )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:497:1: moduleid : Id ( ( NL )? PERIOD ( NL )? Id )* -> ^( MODULEID ( Id )* ) ;
    public final babel17Parser.moduleid_return moduleid() throws RecognitionException {
        babel17Parser.moduleid_return retval = new babel17Parser.moduleid_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Id225=null;
        Token NL226=null;
        Token PERIOD227=null;
        Token NL228=null;
        Token Id229=null;

        CommonTree Id225_tree=null;
        CommonTree NL226_tree=null;
        CommonTree PERIOD227_tree=null;
        CommonTree NL228_tree=null;
        CommonTree Id229_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_Id=new RewriteRuleTokenStream(adaptor,"token Id");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:497:11: ( Id ( ( NL )? PERIOD ( NL )? Id )* -> ^( MODULEID ( Id )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:497:13: Id ( ( NL )? PERIOD ( NL )? Id )*
            {
            Id225=(Token)match(input,Id,FOLLOW_Id_in_moduleid3053); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Id.add(Id225);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:497:16: ( ( NL )? PERIOD ( NL )? Id )*
            loop103:
            do {
                int alt103=2;
                int LA103_0 = input.LA(1);

                if ( (LA103_0==NL) ) {
                    int LA103_1 = input.LA(2);

                    if ( (LA103_1==PERIOD) ) {
                        alt103=1;
                    }


                }
                else if ( (LA103_0==PERIOD) ) {
                    alt103=1;
                }


                switch (alt103) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:497:17: ( NL )? PERIOD ( NL )? Id
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:497:17: ( NL )?
            	    int alt101=2;
            	    int LA101_0 = input.LA(1);

            	    if ( (LA101_0==NL) ) {
            	        alt101=1;
            	    }
            	    switch (alt101) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:497:17: NL
            	            {
            	            NL226=(Token)match(input,NL,FOLLOW_NL_in_moduleid3056); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL226);


            	            }
            	            break;

            	    }

            	    PERIOD227=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_moduleid3059); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD227);

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:497:28: ( NL )?
            	    int alt102=2;
            	    int LA102_0 = input.LA(1);

            	    if ( (LA102_0==NL) ) {
            	        alt102=1;
            	    }
            	    switch (alt102) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:497:28: NL
            	            {
            	            NL228=(Token)match(input,NL,FOLLOW_NL_in_moduleid3061); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL228);


            	            }
            	            break;

            	    }

            	    Id229=(Token)match(input,Id,FOLLOW_Id_in_moduleid3064); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_Id.add(Id229);


            	    }
            	    break;

            	default :
            	    break loop103;
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
            // 497:37: -> ^( MODULEID ( Id )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:497:40: ^( MODULEID ( Id )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MODULEID, "MODULEID"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:497:51: ( Id )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:499:1: st_module : L_module ( NL )? moduleid block L_end -> ^( L_module moduleid block ) ;
    public final babel17Parser.st_module_return st_module() throws RecognitionException {
        babel17Parser.st_module_return retval = new babel17Parser.st_module_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_module230=null;
        Token NL231=null;
        Token L_end234=null;
        babel17Parser.moduleid_return moduleid232 = null;

        babel17Parser.block_return block233 = null;


        CommonTree L_module230_tree=null;
        CommonTree NL231_tree=null;
        CommonTree L_end234_tree=null;
        RewriteRuleTokenStream stream_L_module=new RewriteRuleTokenStream(adaptor,"token L_module");
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_moduleid=new RewriteRuleSubtreeStream(adaptor,"rule moduleid");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:500:2: ( L_module ( NL )? moduleid block L_end -> ^( L_module moduleid block ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:500:4: L_module ( NL )? moduleid block L_end
            {
            L_module230=(Token)match(input,L_module,FOLLOW_L_module_in_st_module3084); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_module.add(L_module230);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:500:13: ( NL )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==NL) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:500:13: NL
                    {
                    NL231=(Token)match(input,NL,FOLLOW_NL_in_st_module3086); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL231);


                    }
                    break;

            }

            pushFollow(FOLLOW_moduleid_in_st_module3089);
            moduleid232=moduleid();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_moduleid.add(moduleid232.getTree());
            pushFollow(FOLLOW_block_in_st_module3091);
            block233=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block233.getTree());
            L_end234=(Token)match(input,L_end,FOLLOW_L_end_in_st_module3093); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_end.add(L_end234);



            // AST REWRITE
            // elements: block, L_module, moduleid
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 500:38: -> ^( L_module moduleid block )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:500:41: ^( L_module moduleid block )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:502:1: importid : Id ( ( NL )? PERIOD ( NL )? Id )* ( importall )? -> ^( IMPORTID ( importall )? ^( NIL_TOKEN ( Id )* ) ) ;
    public final babel17Parser.importid_return importid() throws RecognitionException {
        babel17Parser.importid_return retval = new babel17Parser.importid_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Id235=null;
        Token NL236=null;
        Token PERIOD237=null;
        Token NL238=null;
        Token Id239=null;
        babel17Parser.importall_return importall240 = null;


        CommonTree Id235_tree=null;
        CommonTree NL236_tree=null;
        CommonTree PERIOD237_tree=null;
        CommonTree NL238_tree=null;
        CommonTree Id239_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_Id=new RewriteRuleTokenStream(adaptor,"token Id");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
        RewriteRuleSubtreeStream stream_importall=new RewriteRuleSubtreeStream(adaptor,"rule importall");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:503:2: ( Id ( ( NL )? PERIOD ( NL )? Id )* ( importall )? -> ^( IMPORTID ( importall )? ^( NIL_TOKEN ( Id )* ) ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:503:4: Id ( ( NL )? PERIOD ( NL )? Id )* ( importall )?
            {
            Id235=(Token)match(input,Id,FOLLOW_Id_in_importid3113); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Id.add(Id235);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:503:7: ( ( NL )? PERIOD ( NL )? Id )*
            loop107:
            do {
                int alt107=2;
                int LA107_0 = input.LA(1);

                if ( (LA107_0==PERIOD) ) {
                    int LA107_1 = input.LA(2);

                    if ( (LA107_1==NL||LA107_1==Id) ) {
                        alt107=1;
                    }


                }
                else if ( (LA107_0==NL) ) {
                    int LA107_2 = input.LA(2);

                    if ( (LA107_2==PERIOD) ) {
                        alt107=1;
                    }


                }


                switch (alt107) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:503:8: ( NL )? PERIOD ( NL )? Id
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:503:8: ( NL )?
            	    int alt105=2;
            	    int LA105_0 = input.LA(1);

            	    if ( (LA105_0==NL) ) {
            	        alt105=1;
            	    }
            	    switch (alt105) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:503:8: NL
            	            {
            	            NL236=(Token)match(input,NL,FOLLOW_NL_in_importid3116); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL236);


            	            }
            	            break;

            	    }

            	    PERIOD237=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_importid3119); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD237);

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:503:19: ( NL )?
            	    int alt106=2;
            	    int LA106_0 = input.LA(1);

            	    if ( (LA106_0==NL) ) {
            	        alt106=1;
            	    }
            	    switch (alt106) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:503:19: NL
            	            {
            	            NL238=(Token)match(input,NL,FOLLOW_NL_in_importid3121); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL238);


            	            }
            	            break;

            	    }

            	    Id239=(Token)match(input,Id,FOLLOW_Id_in_importid3124); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_Id.add(Id239);


            	    }
            	    break;

            	default :
            	    break loop107;
                }
            } while (true);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:503:28: ( importall )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==PERIOD) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:503:28: importall
                    {
                    pushFollow(FOLLOW_importall_in_importid3128);
                    importall240=importall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_importall.add(importall240.getTree());

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
            // 503:39: -> ^( IMPORTID ( importall )? ^( NIL_TOKEN ( Id )* ) )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:503:42: ^( IMPORTID ( importall )? ^( NIL_TOKEN ( Id )* ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IMPORTID, "IMPORTID"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:503:53: ( importall )?
                if ( stream_importall.hasNext() ) {
                    adaptor.addChild(root_1, stream_importall.nextTree());

                }
                stream_importall.reset();
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:503:64: ^( NIL_TOKEN ( Id )* )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_2);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:503:76: ( Id )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:505:1: importall : PERIOD UNDERSCORE -> ^( UNDERSCORE ) ;
    public final babel17Parser.importall_return importall() throws RecognitionException {
        babel17Parser.importall_return retval = new babel17Parser.importall_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PERIOD241=null;
        Token UNDERSCORE242=null;

        CommonTree PERIOD241_tree=null;
        CommonTree UNDERSCORE242_tree=null;
        RewriteRuleTokenStream stream_UNDERSCORE=new RewriteRuleTokenStream(adaptor,"token UNDERSCORE");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:506:2: ( PERIOD UNDERSCORE -> ^( UNDERSCORE ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:506:4: PERIOD UNDERSCORE
            {
            PERIOD241=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_importall3155); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD241);

            UNDERSCORE242=(Token)match(input,UNDERSCORE,FOLLOW_UNDERSCORE_in_importall3157); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_UNDERSCORE.add(UNDERSCORE242);



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
            // 506:22: -> ^( UNDERSCORE )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:506:25: ^( UNDERSCORE )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:508:1: st_import : L_import ( NL )? importid -> ^( L_import importid ) ;
    public final babel17Parser.st_import_return st_import() throws RecognitionException {
        babel17Parser.st_import_return retval = new babel17Parser.st_import_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_import243=null;
        Token NL244=null;
        babel17Parser.importid_return importid245 = null;


        CommonTree L_import243_tree=null;
        CommonTree NL244_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_import=new RewriteRuleTokenStream(adaptor,"token L_import");
        RewriteRuleSubtreeStream stream_importid=new RewriteRuleSubtreeStream(adaptor,"rule importid");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:509:2: ( L_import ( NL )? importid -> ^( L_import importid ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:509:4: L_import ( NL )? importid
            {
            L_import243=(Token)match(input,L_import,FOLLOW_L_import_in_st_import3172); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_import.add(L_import243);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:509:13: ( NL )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==NL) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:509:13: NL
                    {
                    NL244=(Token)match(input,NL,FOLLOW_NL_in_st_import3174); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL244);


                    }
                    break;

            }

            pushFollow(FOLLOW_importid_in_st_import3178);
            importid245=importid();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_importid.add(importid245.getTree());


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
            // 509:27: -> ^( L_import importid )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:509:30: ^( L_import importid )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:511:1: expr_or_assign : ( ( ( pattern | objelem_assign ) ( NL )? '=' )=> ( pattern | objelem_assign ) ( NL )? '=' ( NL )? expr -> ^( ASSIGN ( pattern )* ( objelem_assign )* expr ) | expr );
    public final babel17Parser.expr_or_assign_return expr_or_assign() throws RecognitionException {
        babel17Parser.expr_or_assign_return retval = new babel17Parser.expr_or_assign_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL248=null;
        Token char_literal249=null;
        Token NL250=null;
        babel17Parser.pattern_return pattern246 = null;

        babel17Parser.objelem_assign_return objelem_assign247 = null;

        babel17Parser.expr_return expr251 = null;

        babel17Parser.expr_return expr252 = null;


        CommonTree NL248_tree=null;
        CommonTree char_literal249_tree=null;
        CommonTree NL250_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_objelem_assign=new RewriteRuleSubtreeStream(adaptor,"rule objelem_assign");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:512:2: ( ( ( pattern | objelem_assign ) ( NL )? '=' )=> ( pattern | objelem_assign ) ( NL )? '=' ( NL )? expr -> ^( ASSIGN ( pattern )* ( objelem_assign )* expr ) | expr )
            int alt113=2;
            alt113 = dfa113.predict(input);
            switch (alt113) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:512:4: ( ( pattern | objelem_assign ) ( NL )? '=' )=> ( pattern | objelem_assign ) ( NL )? '=' ( NL )? expr
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:512:44: ( pattern | objelem_assign )
                    int alt110=2;
                    int LA110_0 = input.LA(1);

                    if ( (LA110_0==L_exception||(LA110_0>=A_infinity && LA110_0<=U_infinity)||(LA110_0>=L_true && LA110_0<=L_false)||LA110_0==L_nil||LA110_0==MINUS||(LA110_0>=A_ELLIPSIS && LA110_0<=U_ELLIPSIS)||LA110_0==Constr||LA110_0==Num||(LA110_0>=String && LA110_0<=ROUND_BRACKET_OPEN)||LA110_0==SQUARE_BRACKET_OPEN||LA110_0==CURLY_BRACKET_OPEN||LA110_0==UNDERSCORE) ) {
                        alt110=1;
                    }
                    else if ( (LA110_0==Id) ) {
                        int LA110_2 = input.LA(2);

                        if ( (LA110_2==PERIOD) ) {
                            alt110=2;
                        }
                        else if ( (LA110_2==ASSIGN||(LA110_2>=A_DOUBLE_COLON && LA110_2<=U_DOUBLE_COLON)||LA110_2==NL) ) {
                            alt110=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 110, 2, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 110, 0, input);

                        throw nvae;
                    }
                    switch (alt110) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:512:45: pattern
                            {
                            pushFollow(FOLLOW_pattern_in_expr_or_assign3214);
                            pattern246=pattern();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_pattern.add(pattern246.getTree());

                            }
                            break;
                        case 2 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:512:55: objelem_assign
                            {
                            pushFollow(FOLLOW_objelem_assign_in_expr_or_assign3218);
                            objelem_assign247=objelem_assign();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_objelem_assign.add(objelem_assign247.getTree());

                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:512:71: ( NL )?
                    int alt111=2;
                    int LA111_0 = input.LA(1);

                    if ( (LA111_0==NL) ) {
                        alt111=1;
                    }
                    switch (alt111) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:512:71: NL
                            {
                            NL248=(Token)match(input,NL,FOLLOW_NL_in_expr_or_assign3221); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL248);


                            }
                            break;

                    }

                    char_literal249=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_expr_or_assign3224); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal249);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:512:79: ( NL )?
                    int alt112=2;
                    int LA112_0 = input.LA(1);

                    if ( (LA112_0==NL) ) {
                        alt112=1;
                    }
                    switch (alt112) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:512:79: NL
                            {
                            NL250=(Token)match(input,NL,FOLLOW_NL_in_expr_or_assign3226); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL250);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_expr_in_expr_or_assign3229);
                    expr251=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr251.getTree());


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
                    // 512:88: -> ^( ASSIGN ( pattern )* ( objelem_assign )* expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:512:91: ^( ASSIGN ( pattern )* ( objelem_assign )* expr )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASSIGN, "ASSIGN"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:512:100: ( pattern )*
                        while ( stream_pattern.hasNext() ) {
                            adaptor.addChild(root_1, stream_pattern.nextTree());

                        }
                        stream_pattern.reset();
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:512:109: ( objelem_assign )*
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:513:4: expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_expr_in_expr_or_assign3248);
                    expr252=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr252.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:515:1: expr : ( lop_expr | obj_expr );
    public final babel17Parser.expr_return expr() throws RecognitionException {
        babel17Parser.expr_return retval = new babel17Parser.expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.lop_expr_return lop_expr253 = null;

        babel17Parser.obj_expr_return obj_expr254 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:516:2: ( lop_expr | obj_expr )
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==L_begin||(LA114_0>=L_with && LA114_0<=L_if)||(LA114_0>=L_while && LA114_0<=L_for)||LA114_0==L_match||LA114_0==L_exception||LA114_0==L_try||(LA114_0>=A_infinity && LA114_0<=L_lazy)||(LA114_0>=L_true && LA114_0<=L_nil)||LA114_0==L_typeof||LA114_0==MINUS||LA114_0==A_NOT||LA114_0==U_NOT||(LA114_0>=A_ELLIPSIS && LA114_0<=U_ELLIPSIS)||LA114_0==L_force||(LA114_0>=Constr && LA114_0<=Num)||(LA114_0>=String && LA114_0<=ROUND_BRACKET_OPEN)||LA114_0==SQUARE_BRACKET_OPEN||LA114_0==CURLY_BRACKET_OPEN||LA114_0==UNDERSCORE) ) {
                alt114=1;
            }
            else if ( (LA114_0==L_obj) ) {
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:516:4: lop_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_lop_expr_in_expr3259);
                    lop_expr253=lop_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lop_expr253.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:517:4: obj_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_obj_expr_in_expr3264);
                    obj_expr254=obj_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, obj_expr254.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:519:1: control_expr : ( if_expr | while_do_expr | match_expr | for_expr | try_expr | begin_end );
    public final babel17Parser.control_expr_return control_expr() throws RecognitionException {
        babel17Parser.control_expr_return retval = new babel17Parser.control_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.if_expr_return if_expr255 = null;

        babel17Parser.while_do_expr_return while_do_expr256 = null;

        babel17Parser.match_expr_return match_expr257 = null;

        babel17Parser.for_expr_return for_expr258 = null;

        babel17Parser.try_expr_return try_expr259 = null;

        babel17Parser.begin_end_return begin_end260 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:520:2: ( if_expr | while_do_expr | match_expr | for_expr | try_expr | begin_end )
            int alt115=6;
            switch ( input.LA(1) ) {
            case L_if:
                {
                alt115=1;
                }
                break;
            case L_while:
                {
                alt115=2;
                }
                break;
            case L_match:
                {
                alt115=3;
                }
                break;
            case L_for:
                {
                alt115=4;
                }
                break;
            case L_try:
                {
                alt115=5;
                }
                break;
            case L_begin:
                {
                alt115=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 115, 0, input);

                throw nvae;
            }

            switch (alt115) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:520:4: if_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_if_expr_in_control_expr3274);
                    if_expr255=if_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, if_expr255.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:521:4: while_do_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_while_do_expr_in_control_expr3279);
                    while_do_expr256=while_do_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, while_do_expr256.getTree());

                    }
                    break;
                case 3 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:522:4: match_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_match_expr_in_control_expr3284);
                    match_expr257=match_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, match_expr257.getTree());

                    }
                    break;
                case 4 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:523:4: for_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_for_expr_in_control_expr3289);
                    for_expr258=for_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, for_expr258.getTree());

                    }
                    break;
                case 5 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:524:5: try_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_try_expr_in_control_expr3295);
                    try_expr259=try_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, try_expr259.getTree());

                    }
                    break;
                case 6 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:525:4: begin_end
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_begin_end_in_control_expr3300);
                    begin_end260=begin_end();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, begin_end260.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:527:1: with_control_expr : ( control_expr | L_with ( NL )? protected_expr ( NL )? L_do block L_end -> ^( WITH protected_expr ^( BEGIN block ) ) );
    public final babel17Parser.with_control_expr_return with_control_expr() throws RecognitionException {
        babel17Parser.with_control_expr_return retval = new babel17Parser.with_control_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_with262=null;
        Token NL263=null;
        Token NL265=null;
        Token L_do266=null;
        Token L_end268=null;
        babel17Parser.control_expr_return control_expr261 = null;

        babel17Parser.protected_expr_return protected_expr264 = null;

        babel17Parser.block_return block267 = null;


        CommonTree L_with262_tree=null;
        CommonTree NL263_tree=null;
        CommonTree NL265_tree=null;
        CommonTree L_do266_tree=null;
        CommonTree L_end268_tree=null;
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_do=new RewriteRuleTokenStream(adaptor,"token L_do");
        RewriteRuleTokenStream stream_L_with=new RewriteRuleTokenStream(adaptor,"token L_with");
        RewriteRuleSubtreeStream stream_protected_expr=new RewriteRuleSubtreeStream(adaptor,"rule protected_expr");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:528:2: ( control_expr | L_with ( NL )? protected_expr ( NL )? L_do block L_end -> ^( WITH protected_expr ^( BEGIN block ) ) )
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==L_begin||LA118_0==L_if||(LA118_0>=L_while && LA118_0<=L_for)||LA118_0==L_match||LA118_0==L_try) ) {
                alt118=1;
            }
            else if ( (LA118_0==L_with) ) {
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:528:4: control_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_control_expr_in_with_control_expr3310);
                    control_expr261=control_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, control_expr261.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:529:4: L_with ( NL )? protected_expr ( NL )? L_do block L_end
                    {
                    L_with262=(Token)match(input,L_with,FOLLOW_L_with_in_with_control_expr3315); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_with.add(L_with262);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:529:11: ( NL )?
                    int alt116=2;
                    int LA116_0 = input.LA(1);

                    if ( (LA116_0==NL) ) {
                        alt116=1;
                    }
                    switch (alt116) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:529:11: NL
                            {
                            NL263=(Token)match(input,NL,FOLLOW_NL_in_with_control_expr3317); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL263);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_protected_expr_in_with_control_expr3320);
                    protected_expr264=protected_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr264.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:529:30: ( NL )?
                    int alt117=2;
                    int LA117_0 = input.LA(1);

                    if ( (LA117_0==NL) ) {
                        alt117=1;
                    }
                    switch (alt117) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:529:30: NL
                            {
                            NL265=(Token)match(input,NL,FOLLOW_NL_in_with_control_expr3322); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL265);


                            }
                            break;

                    }

                    L_do266=(Token)match(input,L_do,FOLLOW_L_do_in_with_control_expr3325); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_do.add(L_do266);

                    pushFollow(FOLLOW_block_in_with_control_expr3327);
                    block267=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block267.getTree());
                    L_end268=(Token)match(input,L_end,FOLLOW_L_end_in_with_control_expr3329); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_end.add(L_end268);



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
                    // 529:51: -> ^( WITH protected_expr ^( BEGIN block ) )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:529:54: ^( WITH protected_expr ^( BEGIN block ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(WITH, "WITH"), root_1);

                        adaptor.addChild(root_1, stream_protected_expr.nextTree());
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:529:76: ^( BEGIN block )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:532:1: protected_expr : ( p_lop_expr | obj_expr );
    public final babel17Parser.protected_expr_return protected_expr() throws RecognitionException {
        babel17Parser.protected_expr_return retval = new babel17Parser.protected_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.p_lop_expr_return p_lop_expr269 = null;

        babel17Parser.obj_expr_return obj_expr270 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:533:2: ( p_lop_expr | obj_expr )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:533:4: p_lop_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_p_lop_expr_in_protected_expr3354);
                    p_lop_expr269=p_lop_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_lop_expr269.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:534:4: obj_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_obj_expr_in_protected_expr3359);
                    obj_expr270=obj_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, obj_expr270.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:536:1: protected_expr_nc : protected_expr ;
    public final babel17Parser.protected_expr_nc_return protected_expr_nc() throws RecognitionException {
        babel17Parser.protected_expr_nc_return retval = new babel17Parser.protected_expr_nc_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.protected_expr_return protected_expr271 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:537:2: ( protected_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:537:4: protected_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_protected_expr_in_protected_expr_nc3370);
            protected_expr271=protected_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, protected_expr271.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:539:1: begin_end : L_begin block L_end -> ^( BEGIN block ) ;
    public final babel17Parser.begin_end_return begin_end() throws RecognitionException {
        babel17Parser.begin_end_return retval = new babel17Parser.begin_end_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_begin272=null;
        Token L_end274=null;
        babel17Parser.block_return block273 = null;


        CommonTree L_begin272_tree=null;
        CommonTree L_end274_tree=null;
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleTokenStream stream_L_begin=new RewriteRuleTokenStream(adaptor,"token L_begin");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:540:2: ( L_begin block L_end -> ^( BEGIN block ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:540:4: L_begin block L_end
            {
            L_begin272=(Token)match(input,L_begin,FOLLOW_L_begin_in_begin_end3380); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_begin.add(L_begin272);

            pushFollow(FOLLOW_block_in_begin_end3382);
            block273=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block273.getTree());
            L_end274=(Token)match(input,L_end,FOLLOW_L_end_in_begin_end3384); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_end.add(L_end274);



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
            // 540:24: -> ^( BEGIN block )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:540:27: ^( BEGIN block )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:543:1: parents : ( '+' primitive_expr -> ^( PARENTS_PLUS primitive_expr ) | '*' primitive_expr -> ^( PARENTS_MUL primitive_expr ) );
    public final babel17Parser.parents_return parents() throws RecognitionException {
        babel17Parser.parents_return retval = new babel17Parser.parents_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal275=null;
        Token char_literal277=null;
        babel17Parser.primitive_expr_return primitive_expr276 = null;

        babel17Parser.primitive_expr_return primitive_expr278 = null;


        CommonTree char_literal275_tree=null;
        CommonTree char_literal277_tree=null;
        RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
        RewriteRuleTokenStream stream_TIMES=new RewriteRuleTokenStream(adaptor,"token TIMES");
        RewriteRuleSubtreeStream stream_primitive_expr=new RewriteRuleSubtreeStream(adaptor,"rule primitive_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:543:9: ( '+' primitive_expr -> ^( PARENTS_PLUS primitive_expr ) | '*' primitive_expr -> ^( PARENTS_MUL primitive_expr ) )
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==PLUS) ) {
                alt120=1;
            }
            else if ( (LA120_0==TIMES) ) {
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:543:11: '+' primitive_expr
                    {
                    char_literal275=(Token)match(input,PLUS,FOLLOW_PLUS_in_parents3402); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PLUS.add(char_literal275);

                    pushFollow(FOLLOW_primitive_expr_in_parents3404);
                    primitive_expr276=primitive_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primitive_expr.add(primitive_expr276.getTree());


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
                    // 543:30: -> ^( PARENTS_PLUS primitive_expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:543:33: ^( PARENTS_PLUS primitive_expr )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:544:4: '*' primitive_expr
                    {
                    char_literal277=(Token)match(input,TIMES,FOLLOW_TIMES_in_parents3417); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TIMES.add(char_literal277);

                    pushFollow(FOLLOW_primitive_expr_in_parents3419);
                    primitive_expr278=primitive_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primitive_expr.add(primitive_expr278.getTree());


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
                    // 544:23: -> ^( PARENTS_MUL primitive_expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:544:26: ^( PARENTS_MUL primitive_expr )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:547:1: obj_expr : ( ( L_obj ( NL )? parents )=> L_obj ( NL )? parents block L_end -> ^( OBJ block parents ) | L_obj block L_end -> ^( OBJ block ) );
    public final babel17Parser.obj_expr_return obj_expr() throws RecognitionException {
        babel17Parser.obj_expr_return retval = new babel17Parser.obj_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_obj279=null;
        Token NL280=null;
        Token L_end283=null;
        Token L_obj284=null;
        Token L_end286=null;
        babel17Parser.parents_return parents281 = null;

        babel17Parser.block_return block282 = null;

        babel17Parser.block_return block285 = null;


        CommonTree L_obj279_tree=null;
        CommonTree NL280_tree=null;
        CommonTree L_end283_tree=null;
        CommonTree L_obj284_tree=null;
        CommonTree L_end286_tree=null;
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_obj=new RewriteRuleTokenStream(adaptor,"token L_obj");
        RewriteRuleSubtreeStream stream_parents=new RewriteRuleSubtreeStream(adaptor,"rule parents");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:547:9: ( ( L_obj ( NL )? parents )=> L_obj ( NL )? parents block L_end -> ^( OBJ block parents ) | L_obj block L_end -> ^( OBJ block ) )
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==L_obj) ) {
                int LA122_1 = input.LA(2);

                if ( (LA122_1==NL) ) {
                    int LA122_2 = input.LA(3);

                    if ( (LA122_2==PLUS) && (synpred8_babel17())) {
                        alt122=1;
                    }
                    else if ( (LA122_2==TIMES) && (synpred8_babel17())) {
                        alt122=1;
                    }
                    else if ( ((LA122_2>=L_begin && LA122_2<=L_if)||(LA122_2>=L_while && LA122_2<=L_for)||(LA122_2>=L_yield && LA122_2<=L_match)||(LA122_2>=L_val && LA122_2<=L_def)||LA122_2==L_exception||LA122_2==L_try||(LA122_2>=A_infinity && LA122_2<=L_nil)||(LA122_2>=L_module && LA122_2<=L_import)||LA122_2==SC||LA122_2==MINUS||LA122_2==A_NOT||LA122_2==U_NOT||(LA122_2>=A_ELLIPSIS && LA122_2<=U_ELLIPSIS)||LA122_2==L_force||(LA122_2>=NL && LA122_2<=Num)||(LA122_2>=String && LA122_2<=ROUND_BRACKET_OPEN)||LA122_2==SQUARE_BRACKET_OPEN||LA122_2==CURLY_BRACKET_OPEN||LA122_2==UNDERSCORE||(LA122_2>=PRAGMA_LOG && LA122_2<=PRAGMA_PROFILE)) ) {
                        alt122=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 122, 2, input);

                        throw nvae;
                    }
                }
                else if ( ((LA122_1>=L_begin && LA122_1<=L_if)||(LA122_1>=L_while && LA122_1<=L_for)||(LA122_1>=L_yield && LA122_1<=L_match)||(LA122_1>=L_val && LA122_1<=L_def)||LA122_1==L_exception||LA122_1==L_try||(LA122_1>=A_infinity && LA122_1<=L_nil)||(LA122_1>=L_module && LA122_1<=L_import)||LA122_1==SC||LA122_1==MINUS||LA122_1==A_NOT||LA122_1==U_NOT||(LA122_1>=A_ELLIPSIS && LA122_1<=U_ELLIPSIS)||LA122_1==L_force||(LA122_1>=Constr && LA122_1<=Num)||(LA122_1>=String && LA122_1<=ROUND_BRACKET_OPEN)||LA122_1==SQUARE_BRACKET_OPEN||LA122_1==CURLY_BRACKET_OPEN||LA122_1==UNDERSCORE||(LA122_1>=PRAGMA_LOG && LA122_1<=PRAGMA_PROFILE)) ) {
                    alt122=2;
                }
                else if ( (LA122_1==PLUS) && (synpred8_babel17())) {
                    alt122=1;
                }
                else if ( (LA122_1==TIMES) && (synpred8_babel17())) {
                    alt122=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 122, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 122, 0, input);

                throw nvae;
            }
            switch (alt122) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:547:11: ( L_obj ( NL )? parents )=> L_obj ( NL )? parents block L_end
                    {
                    L_obj279=(Token)match(input,L_obj,FOLLOW_L_obj_in_obj_expr3447); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_obj.add(L_obj279);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:547:40: ( NL )?
                    int alt121=2;
                    int LA121_0 = input.LA(1);

                    if ( (LA121_0==NL) ) {
                        alt121=1;
                    }
                    switch (alt121) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:547:40: NL
                            {
                            NL280=(Token)match(input,NL,FOLLOW_NL_in_obj_expr3449); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL280);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_parents_in_obj_expr3452);
                    parents281=parents();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parents.add(parents281.getTree());
                    pushFollow(FOLLOW_block_in_obj_expr3454);
                    block282=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block282.getTree());
                    L_end283=(Token)match(input,L_end,FOLLOW_L_end_in_obj_expr3456); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_end.add(L_end283);



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
                    // 547:64: -> ^( OBJ block parents )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:547:67: ^( OBJ block parents )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:548:17: L_obj block L_end
                    {
                    L_obj284=(Token)match(input,L_obj,FOLLOW_L_obj_in_obj_expr3484); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_obj.add(L_obj284);

                    pushFollow(FOLLOW_block_in_obj_expr3486);
                    block285=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block285.getTree());
                    L_end286=(Token)match(input,L_end,FOLLOW_L_end_in_obj_expr3488); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_end.add(L_end286);



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
                    // 548:35: -> ^( OBJ block )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:548:38: ^( OBJ block )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:550:1: lop_expr : ( ( lambda_expr )=> lambda_expr | ( lambda_expr_nobrackets )=> lambda_expr_nobrackets | op_expr );
    public final babel17Parser.lop_expr_return lop_expr() throws RecognitionException {
        babel17Parser.lop_expr_return retval = new babel17Parser.lop_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.lambda_expr_return lambda_expr287 = null;

        babel17Parser.lambda_expr_nobrackets_return lambda_expr_nobrackets288 = null;

        babel17Parser.op_expr_return op_expr289 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:551:2: ( ( lambda_expr )=> lambda_expr | ( lambda_expr_nobrackets )=> lambda_expr_nobrackets | op_expr )
            int alt123=3;
            alt123 = dfa123.predict(input);
            switch (alt123) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:551:4: ( lambda_expr )=> lambda_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_lambda_expr_in_lop_expr3516);
                    lambda_expr287=lambda_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lambda_expr287.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:552:4: ( lambda_expr_nobrackets )=> lambda_expr_nobrackets
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_lambda_expr_nobrackets_in_lop_expr3527);
                    lambda_expr_nobrackets288=lambda_expr_nobrackets();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lambda_expr_nobrackets288.getTree());

                    }
                    break;
                case 3 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:553:4: op_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_op_expr_in_lop_expr3532);
                    op_expr289=op_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, op_expr289.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:555:1: p_lop_expr : ( ( lambda_expr )=> lambda_expr | ( lambda_expr_nobrackets )=> lambda_expr_nobrackets | p_op_expr );
    public final babel17Parser.p_lop_expr_return p_lop_expr() throws RecognitionException {
        babel17Parser.p_lop_expr_return retval = new babel17Parser.p_lop_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.lambda_expr_return lambda_expr290 = null;

        babel17Parser.lambda_expr_nobrackets_return lambda_expr_nobrackets291 = null;

        babel17Parser.p_op_expr_return p_op_expr292 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:556:2: ( ( lambda_expr )=> lambda_expr | ( lambda_expr_nobrackets )=> lambda_expr_nobrackets | p_op_expr )
            int alt124=3;
            alt124 = dfa124.predict(input);
            switch (alt124) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:556:4: ( lambda_expr )=> lambda_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_lambda_expr_in_p_lop_expr3548);
                    lambda_expr290=lambda_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lambda_expr290.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:557:4: ( lambda_expr_nobrackets )=> lambda_expr_nobrackets
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_lambda_expr_nobrackets_in_p_lop_expr3559);
                    lambda_expr_nobrackets291=lambda_expr_nobrackets();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lambda_expr_nobrackets291.getTree());

                    }
                    break;
                case 3 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:558:4: p_op_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_p_op_expr_in_p_lop_expr3564);
                    p_op_expr292=p_op_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_op_expr292.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:560:1: if_expr : L_if ( NL )? protected_expr ( NL )? L_then block ( L_elseif ( NL )? protected_expr ( NL )? L_then block )* ( L_else block )? L_end -> ^( IF ( protected_expr )* ( block )* ) ;
    public final babel17Parser.if_expr_return if_expr() throws RecognitionException {
        babel17Parser.if_expr_return retval = new babel17Parser.if_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_if293=null;
        Token NL294=null;
        Token NL296=null;
        Token L_then297=null;
        Token L_elseif299=null;
        Token NL300=null;
        Token NL302=null;
        Token L_then303=null;
        Token L_else305=null;
        Token L_end307=null;
        babel17Parser.protected_expr_return protected_expr295 = null;

        babel17Parser.block_return block298 = null;

        babel17Parser.protected_expr_return protected_expr301 = null;

        babel17Parser.block_return block304 = null;

        babel17Parser.block_return block306 = null;


        CommonTree L_if293_tree=null;
        CommonTree NL294_tree=null;
        CommonTree NL296_tree=null;
        CommonTree L_then297_tree=null;
        CommonTree L_elseif299_tree=null;
        CommonTree NL300_tree=null;
        CommonTree NL302_tree=null;
        CommonTree L_then303_tree=null;
        CommonTree L_else305_tree=null;
        CommonTree L_end307_tree=null;
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleTokenStream stream_L_else=new RewriteRuleTokenStream(adaptor,"token L_else");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_elseif=new RewriteRuleTokenStream(adaptor,"token L_elseif");
        RewriteRuleTokenStream stream_L_then=new RewriteRuleTokenStream(adaptor,"token L_then");
        RewriteRuleTokenStream stream_L_if=new RewriteRuleTokenStream(adaptor,"token L_if");
        RewriteRuleSubtreeStream stream_protected_expr=new RewriteRuleSubtreeStream(adaptor,"rule protected_expr");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:560:9: ( L_if ( NL )? protected_expr ( NL )? L_then block ( L_elseif ( NL )? protected_expr ( NL )? L_then block )* ( L_else block )? L_end -> ^( IF ( protected_expr )* ( block )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:560:11: L_if ( NL )? protected_expr ( NL )? L_then block ( L_elseif ( NL )? protected_expr ( NL )? L_then block )* ( L_else block )? L_end
            {
            L_if293=(Token)match(input,L_if,FOLLOW_L_if_in_if_expr3574); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_if.add(L_if293);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:560:16: ( NL )?
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==NL) ) {
                alt125=1;
            }
            switch (alt125) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:560:16: NL
                    {
                    NL294=(Token)match(input,NL,FOLLOW_NL_in_if_expr3576); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL294);


                    }
                    break;

            }

            pushFollow(FOLLOW_protected_expr_in_if_expr3579);
            protected_expr295=protected_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr295.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:560:35: ( NL )?
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==NL) ) {
                alt126=1;
            }
            switch (alt126) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:560:35: NL
                    {
                    NL296=(Token)match(input,NL,FOLLOW_NL_in_if_expr3581); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL296);


                    }
                    break;

            }

            L_then297=(Token)match(input,L_then,FOLLOW_L_then_in_if_expr3584); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_then.add(L_then297);

            pushFollow(FOLLOW_block_in_if_expr3586);
            block298=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block298.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:561:3: ( L_elseif ( NL )? protected_expr ( NL )? L_then block )*
            loop129:
            do {
                int alt129=2;
                int LA129_0 = input.LA(1);

                if ( (LA129_0==L_elseif) ) {
                    alt129=1;
                }


                switch (alt129) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:561:4: L_elseif ( NL )? protected_expr ( NL )? L_then block
            	    {
            	    L_elseif299=(Token)match(input,L_elseif,FOLLOW_L_elseif_in_if_expr3592); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_L_elseif.add(L_elseif299);

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:561:13: ( NL )?
            	    int alt127=2;
            	    int LA127_0 = input.LA(1);

            	    if ( (LA127_0==NL) ) {
            	        alt127=1;
            	    }
            	    switch (alt127) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:561:13: NL
            	            {
            	            NL300=(Token)match(input,NL,FOLLOW_NL_in_if_expr3594); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL300);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_protected_expr_in_if_expr3597);
            	    protected_expr301=protected_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr301.getTree());
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:561:32: ( NL )?
            	    int alt128=2;
            	    int LA128_0 = input.LA(1);

            	    if ( (LA128_0==NL) ) {
            	        alt128=1;
            	    }
            	    switch (alt128) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:561:32: NL
            	            {
            	            NL302=(Token)match(input,NL,FOLLOW_NL_in_if_expr3599); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL302);


            	            }
            	            break;

            	    }

            	    L_then303=(Token)match(input,L_then,FOLLOW_L_then_in_if_expr3602); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_L_then.add(L_then303);

            	    pushFollow(FOLLOW_block_in_if_expr3604);
            	    block304=block();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_block.add(block304.getTree());

            	    }
            	    break;

            	default :
            	    break loop129;
                }
            } while (true);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:562:3: ( L_else block )?
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==L_else) ) {
                alt130=1;
            }
            switch (alt130) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:562:4: L_else block
                    {
                    L_else305=(Token)match(input,L_else,FOLLOW_L_else_in_if_expr3612); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_else.add(L_else305);

                    pushFollow(FOLLOW_block_in_if_expr3614);
                    block306=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block306.getTree());

                    }
                    break;

            }

            L_end307=(Token)match(input,L_end,FOLLOW_L_end_in_if_expr3618); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_end.add(L_end307);



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
            // 562:26: -> ^( IF ( protected_expr )* ( block )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:562:29: ^( IF ( protected_expr )* ( block )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IF, "IF"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:562:34: ( protected_expr )*
                while ( stream_protected_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_protected_expr.nextTree());

                }
                stream_protected_expr.reset();
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:562:50: ( block )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:564:1: while_do_expr : L_while ( NL )? protected_expr ( NL )? L_do block L_end -> ^( WHILE_DO protected_expr block ) ;
    public final babel17Parser.while_do_expr_return while_do_expr() throws RecognitionException {
        babel17Parser.while_do_expr_return retval = new babel17Parser.while_do_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_while308=null;
        Token NL309=null;
        Token NL311=null;
        Token L_do312=null;
        Token L_end314=null;
        babel17Parser.protected_expr_return protected_expr310 = null;

        babel17Parser.block_return block313 = null;


        CommonTree L_while308_tree=null;
        CommonTree NL309_tree=null;
        CommonTree NL311_tree=null;
        CommonTree L_do312_tree=null;
        CommonTree L_end314_tree=null;
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_do=new RewriteRuleTokenStream(adaptor,"token L_do");
        RewriteRuleTokenStream stream_L_while=new RewriteRuleTokenStream(adaptor,"token L_while");
        RewriteRuleSubtreeStream stream_protected_expr=new RewriteRuleSubtreeStream(adaptor,"rule protected_expr");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:565:2: ( L_while ( NL )? protected_expr ( NL )? L_do block L_end -> ^( WHILE_DO protected_expr block ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:565:4: L_while ( NL )? protected_expr ( NL )? L_do block L_end
            {
            L_while308=(Token)match(input,L_while,FOLLOW_L_while_in_while_do_expr3642); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_while.add(L_while308);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:565:12: ( NL )?
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==NL) ) {
                alt131=1;
            }
            switch (alt131) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:565:12: NL
                    {
                    NL309=(Token)match(input,NL,FOLLOW_NL_in_while_do_expr3644); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL309);


                    }
                    break;

            }

            pushFollow(FOLLOW_protected_expr_in_while_do_expr3647);
            protected_expr310=protected_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr310.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:565:31: ( NL )?
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==NL) ) {
                alt132=1;
            }
            switch (alt132) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:565:31: NL
                    {
                    NL311=(Token)match(input,NL,FOLLOW_NL_in_while_do_expr3649); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL311);


                    }
                    break;

            }

            L_do312=(Token)match(input,L_do,FOLLOW_L_do_in_while_do_expr3652); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_do.add(L_do312);

            pushFollow(FOLLOW_block_in_while_do_expr3654);
            block313=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block313.getTree());
            L_end314=(Token)match(input,L_end,FOLLOW_L_end_in_while_do_expr3656); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_end.add(L_end314);



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
            // 566:5: -> ^( WHILE_DO protected_expr block )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:566:8: ^( WHILE_DO protected_expr block )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:568:1: cases : ( full_cases | pattern ( NL )? token_DOUBLE_ARROW block -> ^( CASES ^( NIL_TOKEN pattern block ) ) );
    public final babel17Parser.cases_return cases() throws RecognitionException {
        babel17Parser.cases_return retval = new babel17Parser.cases_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL317=null;
        babel17Parser.full_cases_return full_cases315 = null;

        babel17Parser.pattern_return pattern316 = null;

        babel17Parser.token_DOUBLE_ARROW_return token_DOUBLE_ARROW318 = null;

        babel17Parser.block_return block319 = null;


        CommonTree NL317_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_token_DOUBLE_ARROW=new RewriteRuleSubtreeStream(adaptor,"rule token_DOUBLE_ARROW");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:569:2: ( full_cases | pattern ( NL )? token_DOUBLE_ARROW block -> ^( CASES ^( NIL_TOKEN pattern block ) ) )
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==L_case) ) {
                alt134=1;
            }
            else if ( (LA134_0==L_exception||(LA134_0>=A_infinity && LA134_0<=U_infinity)||(LA134_0>=L_true && LA134_0<=L_false)||LA134_0==L_nil||LA134_0==MINUS||(LA134_0>=A_ELLIPSIS && LA134_0<=U_ELLIPSIS)||(LA134_0>=Constr && LA134_0<=Num)||(LA134_0>=String && LA134_0<=ROUND_BRACKET_OPEN)||LA134_0==SQUARE_BRACKET_OPEN||LA134_0==CURLY_BRACKET_OPEN||LA134_0==UNDERSCORE) ) {
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:569:4: full_cases
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_full_cases_in_cases3686);
                    full_cases315=full_cases();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, full_cases315.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:570:4: pattern ( NL )? token_DOUBLE_ARROW block
                    {
                    pushFollow(FOLLOW_pattern_in_cases3691);
                    pattern316=pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pattern.add(pattern316.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:570:12: ( NL )?
                    int alt133=2;
                    int LA133_0 = input.LA(1);

                    if ( (LA133_0==NL) ) {
                        alt133=1;
                    }
                    switch (alt133) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:570:12: NL
                            {
                            NL317=(Token)match(input,NL,FOLLOW_NL_in_cases3693); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL317);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_token_DOUBLE_ARROW_in_cases3696);
                    token_DOUBLE_ARROW318=token_DOUBLE_ARROW();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_token_DOUBLE_ARROW.add(token_DOUBLE_ARROW318.getTree());
                    pushFollow(FOLLOW_block_in_cases3698);
                    block319=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block319.getTree());


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
                    // 570:41: -> ^( CASES ^( NIL_TOKEN pattern block ) )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:570:44: ^( CASES ^( NIL_TOKEN pattern block ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CASES, "CASES"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:570:52: ^( NIL_TOKEN pattern block )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:572:1: full_cases : ( case_expr )+ -> ^( CASES ( case_expr )+ ) ;
    public final babel17Parser.full_cases_return full_cases() throws RecognitionException {
        babel17Parser.full_cases_return retval = new babel17Parser.full_cases_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.case_expr_return case_expr320 = null;


        RewriteRuleSubtreeStream stream_case_expr=new RewriteRuleSubtreeStream(adaptor,"rule case_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:573:2: ( ( case_expr )+ -> ^( CASES ( case_expr )+ ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:573:4: ( case_expr )+
            {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:573:4: ( case_expr )+
            int cnt135=0;
            loop135:
            do {
                int alt135=2;
                int LA135_0 = input.LA(1);

                if ( (LA135_0==L_case) ) {
                    alt135=1;
                }


                switch (alt135) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:573:4: case_expr
            	    {
            	    pushFollow(FOLLOW_case_expr_in_full_cases3721);
            	    case_expr320=case_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_case_expr.add(case_expr320.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt135 >= 1 ) break loop135;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(135, input);
                        throw eee;
                }
                cnt135++;
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
            // 573:15: -> ^( CASES ( case_expr )+ )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:573:18: ^( CASES ( case_expr )+ )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:575:1: case_expr : ( L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW block ) -> ^( NIL_TOKEN pattern block ) ;
    public final babel17Parser.case_expr_return case_expr() throws RecognitionException {
        babel17Parser.case_expr_return retval = new babel17Parser.case_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_case321=null;
        Token NL322=null;
        Token NL324=null;
        babel17Parser.pattern_return pattern323 = null;

        babel17Parser.token_DOUBLE_ARROW_return token_DOUBLE_ARROW325 = null;

        babel17Parser.block_return block326 = null;


        CommonTree L_case321_tree=null;
        CommonTree NL322_tree=null;
        CommonTree NL324_tree=null;
        RewriteRuleTokenStream stream_L_case=new RewriteRuleTokenStream(adaptor,"token L_case");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_token_DOUBLE_ARROW=new RewriteRuleSubtreeStream(adaptor,"rule token_DOUBLE_ARROW");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:576:2: ( ( L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW block ) -> ^( NIL_TOKEN pattern block ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:576:4: ( L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW block )
            {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:576:4: ( L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW block )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:576:5: L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW block
            {
            L_case321=(Token)match(input,L_case,FOLLOW_L_case_in_case_expr3742); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_case.add(L_case321);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:576:12: ( NL )?
            int alt136=2;
            int LA136_0 = input.LA(1);

            if ( (LA136_0==NL) ) {
                alt136=1;
            }
            switch (alt136) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:576:12: NL
                    {
                    NL322=(Token)match(input,NL,FOLLOW_NL_in_case_expr3744); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL322);


                    }
                    break;

            }

            pushFollow(FOLLOW_pattern_in_case_expr3747);
            pattern323=pattern();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pattern.add(pattern323.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:576:24: ( NL )?
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( (LA137_0==NL) ) {
                alt137=1;
            }
            switch (alt137) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:576:24: NL
                    {
                    NL324=(Token)match(input,NL,FOLLOW_NL_in_case_expr3749); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL324);


                    }
                    break;

            }

            pushFollow(FOLLOW_token_DOUBLE_ARROW_in_case_expr3752);
            token_DOUBLE_ARROW325=token_DOUBLE_ARROW();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_token_DOUBLE_ARROW.add(token_DOUBLE_ARROW325.getTree());
            pushFollow(FOLLOW_block_in_case_expr3754);
            block326=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block326.getTree());

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
            // 576:54: -> ^( NIL_TOKEN pattern block )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:576:57: ^( NIL_TOKEN pattern block )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:578:1: match_expr : L_match ( NL )? p_op_expr ( NL )? full_cases L_end -> ^( MATCH p_op_expr full_cases ) ;
    public final babel17Parser.match_expr_return match_expr() throws RecognitionException {
        babel17Parser.match_expr_return retval = new babel17Parser.match_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_match327=null;
        Token NL328=null;
        Token NL330=null;
        Token L_end332=null;
        babel17Parser.p_op_expr_return p_op_expr329 = null;

        babel17Parser.full_cases_return full_cases331 = null;


        CommonTree L_match327_tree=null;
        CommonTree NL328_tree=null;
        CommonTree NL330_tree=null;
        CommonTree L_end332_tree=null;
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_match=new RewriteRuleTokenStream(adaptor,"token L_match");
        RewriteRuleSubtreeStream stream_full_cases=new RewriteRuleSubtreeStream(adaptor,"rule full_cases");
        RewriteRuleSubtreeStream stream_p_op_expr=new RewriteRuleSubtreeStream(adaptor,"rule p_op_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:579:2: ( L_match ( NL )? p_op_expr ( NL )? full_cases L_end -> ^( MATCH p_op_expr full_cases ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:579:4: L_match ( NL )? p_op_expr ( NL )? full_cases L_end
            {
            L_match327=(Token)match(input,L_match,FOLLOW_L_match_in_match_expr3775); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_match.add(L_match327);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:579:12: ( NL )?
            int alt138=2;
            int LA138_0 = input.LA(1);

            if ( (LA138_0==NL) ) {
                alt138=1;
            }
            switch (alt138) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:579:12: NL
                    {
                    NL328=(Token)match(input,NL,FOLLOW_NL_in_match_expr3777); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL328);


                    }
                    break;

            }

            pushFollow(FOLLOW_p_op_expr_in_match_expr3780);
            p_op_expr329=p_op_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_p_op_expr.add(p_op_expr329.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:579:26: ( NL )?
            int alt139=2;
            int LA139_0 = input.LA(1);

            if ( (LA139_0==NL) ) {
                alt139=1;
            }
            switch (alt139) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:579:26: NL
                    {
                    NL330=(Token)match(input,NL,FOLLOW_NL_in_match_expr3782); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL330);


                    }
                    break;

            }

            pushFollow(FOLLOW_full_cases_in_match_expr3785);
            full_cases331=full_cases();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_full_cases.add(full_cases331.getTree());
            L_end332=(Token)match(input,L_end,FOLLOW_L_end_in_match_expr3787); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_end.add(L_end332);



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
            // 580:5: -> ^( MATCH p_op_expr full_cases )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:580:8: ^( MATCH p_op_expr full_cases )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:582:1: try_expr : L_try ( NL )? pure_block ( NL )? L_catch ( NL )? full_cases L_end -> ^( TRY pure_block full_cases ) ;
    public final babel17Parser.try_expr_return try_expr() throws RecognitionException {
        babel17Parser.try_expr_return retval = new babel17Parser.try_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_try333=null;
        Token NL334=null;
        Token NL336=null;
        Token L_catch337=null;
        Token NL338=null;
        Token L_end340=null;
        babel17Parser.pure_block_return pure_block335 = null;

        babel17Parser.full_cases_return full_cases339 = null;


        CommonTree L_try333_tree=null;
        CommonTree NL334_tree=null;
        CommonTree NL336_tree=null;
        CommonTree L_catch337_tree=null;
        CommonTree NL338_tree=null;
        CommonTree L_end340_tree=null;
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleTokenStream stream_L_try=new RewriteRuleTokenStream(adaptor,"token L_try");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_catch=new RewriteRuleTokenStream(adaptor,"token L_catch");
        RewriteRuleSubtreeStream stream_full_cases=new RewriteRuleSubtreeStream(adaptor,"rule full_cases");
        RewriteRuleSubtreeStream stream_pure_block=new RewriteRuleSubtreeStream(adaptor,"rule pure_block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:582:9: ( L_try ( NL )? pure_block ( NL )? L_catch ( NL )? full_cases L_end -> ^( TRY pure_block full_cases ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:582:11: L_try ( NL )? pure_block ( NL )? L_catch ( NL )? full_cases L_end
            {
            L_try333=(Token)match(input,L_try,FOLLOW_L_try_in_try_expr3813); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_try.add(L_try333);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:582:17: ( NL )?
            int alt140=2;
            int LA140_0 = input.LA(1);

            if ( (LA140_0==NL) ) {
                alt140=1;
            }
            switch (alt140) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:582:17: NL
                    {
                    NL334=(Token)match(input,NL,FOLLOW_NL_in_try_expr3815); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL334);


                    }
                    break;

            }

            pushFollow(FOLLOW_pure_block_in_try_expr3818);
            pure_block335=pure_block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pure_block.add(pure_block335.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:582:32: ( NL )?
            int alt141=2;
            int LA141_0 = input.LA(1);

            if ( (LA141_0==NL) ) {
                alt141=1;
            }
            switch (alt141) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:582:32: NL
                    {
                    NL336=(Token)match(input,NL,FOLLOW_NL_in_try_expr3820); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL336);


                    }
                    break;

            }

            L_catch337=(Token)match(input,L_catch,FOLLOW_L_catch_in_try_expr3823); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_catch.add(L_catch337);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:582:44: ( NL )?
            int alt142=2;
            int LA142_0 = input.LA(1);

            if ( (LA142_0==NL) ) {
                alt142=1;
            }
            switch (alt142) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:582:44: NL
                    {
                    NL338=(Token)match(input,NL,FOLLOW_NL_in_try_expr3825); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL338);


                    }
                    break;

            }

            pushFollow(FOLLOW_full_cases_in_try_expr3828);
            full_cases339=full_cases();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_full_cases.add(full_cases339.getTree());
            L_end340=(Token)match(input,L_end,FOLLOW_L_end_in_try_expr3830); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_end.add(L_end340);



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
            // 583:5: -> ^( TRY pure_block full_cases )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:583:8: ^( TRY pure_block full_cases )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:585:1: lambda_expr : '(' ( NL )? lambda_cases ( NL )? ')' -> ^( LAMBDA lambda_cases ) ;
    public final babel17Parser.lambda_expr_return lambda_expr() throws RecognitionException {
        babel17Parser.lambda_expr_return retval = new babel17Parser.lambda_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal341=null;
        Token NL342=null;
        Token NL344=null;
        Token char_literal345=null;
        babel17Parser.lambda_cases_return lambda_cases343 = null;


        CommonTree char_literal341_tree=null;
        CommonTree NL342_tree=null;
        CommonTree NL344_tree=null;
        CommonTree char_literal345_tree=null;
        RewriteRuleTokenStream stream_ROUND_BRACKET_OPEN=new RewriteRuleTokenStream(adaptor,"token ROUND_BRACKET_OPEN");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_ROUND_BRACKET_CLOSE=new RewriteRuleTokenStream(adaptor,"token ROUND_BRACKET_CLOSE");
        RewriteRuleSubtreeStream stream_lambda_cases=new RewriteRuleSubtreeStream(adaptor,"rule lambda_cases");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:586:2: ( '(' ( NL )? lambda_cases ( NL )? ')' -> ^( LAMBDA lambda_cases ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:586:4: '(' ( NL )? lambda_cases ( NL )? ')'
            {
            char_literal341=(Token)match(input,ROUND_BRACKET_OPEN,FOLLOW_ROUND_BRACKET_OPEN_in_lambda_expr3854); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ROUND_BRACKET_OPEN.add(char_literal341);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:586:8: ( NL )?
            int alt143=2;
            int LA143_0 = input.LA(1);

            if ( (LA143_0==NL) ) {
                alt143=1;
            }
            switch (alt143) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:586:8: NL
                    {
                    NL342=(Token)match(input,NL,FOLLOW_NL_in_lambda_expr3856); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL342);


                    }
                    break;

            }

            pushFollow(FOLLOW_lambda_cases_in_lambda_expr3859);
            lambda_cases343=lambda_cases();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_lambda_cases.add(lambda_cases343.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:586:25: ( NL )?
            int alt144=2;
            int LA144_0 = input.LA(1);

            if ( (LA144_0==NL) ) {
                alt144=1;
            }
            switch (alt144) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:586:25: NL
                    {
                    NL344=(Token)match(input,NL,FOLLOW_NL_in_lambda_expr3861); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL344);


                    }
                    break;

            }

            char_literal345=(Token)match(input,ROUND_BRACKET_CLOSE,FOLLOW_ROUND_BRACKET_CLOSE_in_lambda_expr3864); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ROUND_BRACKET_CLOSE.add(char_literal345);



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
            // 586:33: -> ^( LAMBDA lambda_cases )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:586:36: ^( LAMBDA lambda_cases )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:588:1: lambda_expr_nobrackets : lambda_cases_nobrackets -> ^( LAMBDA lambda_cases_nobrackets ) ;
    public final babel17Parser.lambda_expr_nobrackets_return lambda_expr_nobrackets() throws RecognitionException {
        babel17Parser.lambda_expr_nobrackets_return retval = new babel17Parser.lambda_expr_nobrackets_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.lambda_cases_nobrackets_return lambda_cases_nobrackets346 = null;


        RewriteRuleSubtreeStream stream_lambda_cases_nobrackets=new RewriteRuleSubtreeStream(adaptor,"rule lambda_cases_nobrackets");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:589:2: ( lambda_cases_nobrackets -> ^( LAMBDA lambda_cases_nobrackets ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:589:4: lambda_cases_nobrackets
            {
            pushFollow(FOLLOW_lambda_cases_nobrackets_in_lambda_expr_nobrackets3883);
            lambda_cases_nobrackets346=lambda_cases_nobrackets();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_lambda_cases_nobrackets.add(lambda_cases_nobrackets346.getTree());


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
            // 589:28: -> ^( LAMBDA lambda_cases_nobrackets )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:589:31: ^( LAMBDA lambda_cases_nobrackets )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:591:1: lambda_cases_nobrackets : pattern ( NL )? token_DOUBLE_ARROW ( NL )? lop_expr -> ^( CASES ^( NIL_TOKEN pattern ^( BLOCK lop_expr ) ) ) ;
    public final babel17Parser.lambda_cases_nobrackets_return lambda_cases_nobrackets() throws RecognitionException {
        babel17Parser.lambda_cases_nobrackets_return retval = new babel17Parser.lambda_cases_nobrackets_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL348=null;
        Token NL350=null;
        babel17Parser.pattern_return pattern347 = null;

        babel17Parser.token_DOUBLE_ARROW_return token_DOUBLE_ARROW349 = null;

        babel17Parser.lop_expr_return lop_expr351 = null;


        CommonTree NL348_tree=null;
        CommonTree NL350_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_token_DOUBLE_ARROW=new RewriteRuleSubtreeStream(adaptor,"rule token_DOUBLE_ARROW");
        RewriteRuleSubtreeStream stream_lop_expr=new RewriteRuleSubtreeStream(adaptor,"rule lop_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:592:2: ( pattern ( NL )? token_DOUBLE_ARROW ( NL )? lop_expr -> ^( CASES ^( NIL_TOKEN pattern ^( BLOCK lop_expr ) ) ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:592:4: pattern ( NL )? token_DOUBLE_ARROW ( NL )? lop_expr
            {
            pushFollow(FOLLOW_pattern_in_lambda_cases_nobrackets3901);
            pattern347=pattern();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pattern.add(pattern347.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:592:12: ( NL )?
            int alt145=2;
            int LA145_0 = input.LA(1);

            if ( (LA145_0==NL) ) {
                alt145=1;
            }
            switch (alt145) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:592:12: NL
                    {
                    NL348=(Token)match(input,NL,FOLLOW_NL_in_lambda_cases_nobrackets3903); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL348);


                    }
                    break;

            }

            pushFollow(FOLLOW_token_DOUBLE_ARROW_in_lambda_cases_nobrackets3906);
            token_DOUBLE_ARROW349=token_DOUBLE_ARROW();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_token_DOUBLE_ARROW.add(token_DOUBLE_ARROW349.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:592:35: ( NL )?
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==NL) ) {
                alt146=1;
            }
            switch (alt146) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:592:35: NL
                    {
                    NL350=(Token)match(input,NL,FOLLOW_NL_in_lambda_cases_nobrackets3908); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL350);


                    }
                    break;

            }

            pushFollow(FOLLOW_lop_expr_in_lambda_cases_nobrackets3911);
            lop_expr351=lop_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_lop_expr.add(lop_expr351.getTree());


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
            // 592:48: -> ^( CASES ^( NIL_TOKEN pattern ^( BLOCK lop_expr ) ) )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:592:51: ^( CASES ^( NIL_TOKEN pattern ^( BLOCK lop_expr ) ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CASES, "CASES"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:592:59: ^( NIL_TOKEN pattern ^( BLOCK lop_expr ) )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_2);

                adaptor.addChild(root_2, stream_pattern.nextTree());
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:592:79: ^( BLOCK lop_expr )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:594:1: lambda_case_expr : ( L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block ) -> ^( NIL_TOKEN pattern pure_block ) ;
    public final babel17Parser.lambda_case_expr_return lambda_case_expr() throws RecognitionException {
        babel17Parser.lambda_case_expr_return retval = new babel17Parser.lambda_case_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_case352=null;
        Token NL353=null;
        Token NL355=null;
        Token NL357=null;
        babel17Parser.pattern_return pattern354 = null;

        babel17Parser.token_DOUBLE_ARROW_return token_DOUBLE_ARROW356 = null;

        babel17Parser.pure_block_return pure_block358 = null;


        CommonTree L_case352_tree=null;
        CommonTree NL353_tree=null;
        CommonTree NL355_tree=null;
        CommonTree NL357_tree=null;
        RewriteRuleTokenStream stream_L_case=new RewriteRuleTokenStream(adaptor,"token L_case");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_token_DOUBLE_ARROW=new RewriteRuleSubtreeStream(adaptor,"rule token_DOUBLE_ARROW");
        RewriteRuleSubtreeStream stream_pure_block=new RewriteRuleSubtreeStream(adaptor,"rule pure_block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:595:2: ( ( L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block ) -> ^( NIL_TOKEN pattern pure_block ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:595:4: ( L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block )
            {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:595:4: ( L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:595:5: L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block
            {
            L_case352=(Token)match(input,L_case,FOLLOW_L_case_in_lambda_case_expr3939); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_case.add(L_case352);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:595:12: ( NL )?
            int alt147=2;
            int LA147_0 = input.LA(1);

            if ( (LA147_0==NL) ) {
                alt147=1;
            }
            switch (alt147) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:595:12: NL
                    {
                    NL353=(Token)match(input,NL,FOLLOW_NL_in_lambda_case_expr3941); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL353);


                    }
                    break;

            }

            pushFollow(FOLLOW_pattern_in_lambda_case_expr3944);
            pattern354=pattern();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pattern.add(pattern354.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:595:24: ( NL )?
            int alt148=2;
            int LA148_0 = input.LA(1);

            if ( (LA148_0==NL) ) {
                alt148=1;
            }
            switch (alt148) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:595:24: NL
                    {
                    NL355=(Token)match(input,NL,FOLLOW_NL_in_lambda_case_expr3946); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL355);


                    }
                    break;

            }

            pushFollow(FOLLOW_token_DOUBLE_ARROW_in_lambda_case_expr3949);
            token_DOUBLE_ARROW356=token_DOUBLE_ARROW();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_token_DOUBLE_ARROW.add(token_DOUBLE_ARROW356.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:595:47: ( NL )?
            int alt149=2;
            int LA149_0 = input.LA(1);

            if ( (LA149_0==NL) ) {
                alt149=1;
            }
            switch (alt149) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:595:47: NL
                    {
                    NL357=(Token)match(input,NL,FOLLOW_NL_in_lambda_case_expr3951); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL357);


                    }
                    break;

            }

            pushFollow(FOLLOW_pure_block_in_lambda_case_expr3954);
            pure_block358=pure_block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pure_block.add(pure_block358.getTree());

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
            // 595:63: -> ^( NIL_TOKEN pattern pure_block )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:595:66: ^( NIL_TOKEN pattern pure_block )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:597:1: lambda_cases : ( pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block -> ^( CASES ^( NIL_TOKEN pattern pure_block ) ) | lambda_case_expr ( ( NL )? lambda_case_expr )* -> ^( CASES ( lambda_case_expr )+ ) );
    public final babel17Parser.lambda_cases_return lambda_cases() throws RecognitionException {
        babel17Parser.lambda_cases_return retval = new babel17Parser.lambda_cases_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL360=null;
        Token NL362=null;
        Token NL365=null;
        babel17Parser.pattern_return pattern359 = null;

        babel17Parser.token_DOUBLE_ARROW_return token_DOUBLE_ARROW361 = null;

        babel17Parser.pure_block_return pure_block363 = null;

        babel17Parser.lambda_case_expr_return lambda_case_expr364 = null;

        babel17Parser.lambda_case_expr_return lambda_case_expr366 = null;


        CommonTree NL360_tree=null;
        CommonTree NL362_tree=null;
        CommonTree NL365_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_token_DOUBLE_ARROW=new RewriteRuleSubtreeStream(adaptor,"rule token_DOUBLE_ARROW");
        RewriteRuleSubtreeStream stream_lambda_case_expr=new RewriteRuleSubtreeStream(adaptor,"rule lambda_case_expr");
        RewriteRuleSubtreeStream stream_pure_block=new RewriteRuleSubtreeStream(adaptor,"rule pure_block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:598:2: ( pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block -> ^( CASES ^( NIL_TOKEN pattern pure_block ) ) | lambda_case_expr ( ( NL )? lambda_case_expr )* -> ^( CASES ( lambda_case_expr )+ ) )
            int alt154=2;
            int LA154_0 = input.LA(1);

            if ( (LA154_0==L_exception||(LA154_0>=A_infinity && LA154_0<=U_infinity)||(LA154_0>=L_true && LA154_0<=L_false)||LA154_0==L_nil||LA154_0==MINUS||(LA154_0>=A_ELLIPSIS && LA154_0<=U_ELLIPSIS)||(LA154_0>=Constr && LA154_0<=Num)||(LA154_0>=String && LA154_0<=ROUND_BRACKET_OPEN)||LA154_0==SQUARE_BRACKET_OPEN||LA154_0==CURLY_BRACKET_OPEN||LA154_0==UNDERSCORE) ) {
                alt154=1;
            }
            else if ( (LA154_0==L_case) ) {
                alt154=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 154, 0, input);

                throw nvae;
            }
            switch (alt154) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:598:4: pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block
                    {
                    pushFollow(FOLLOW_pattern_in_lambda_cases3975);
                    pattern359=pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pattern.add(pattern359.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:598:12: ( NL )?
                    int alt150=2;
                    int LA150_0 = input.LA(1);

                    if ( (LA150_0==NL) ) {
                        alt150=1;
                    }
                    switch (alt150) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:598:12: NL
                            {
                            NL360=(Token)match(input,NL,FOLLOW_NL_in_lambda_cases3977); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL360);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_token_DOUBLE_ARROW_in_lambda_cases3980);
                    token_DOUBLE_ARROW361=token_DOUBLE_ARROW();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_token_DOUBLE_ARROW.add(token_DOUBLE_ARROW361.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:598:35: ( NL )?
                    int alt151=2;
                    int LA151_0 = input.LA(1);

                    if ( (LA151_0==NL) ) {
                        alt151=1;
                    }
                    switch (alt151) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:598:35: NL
                            {
                            NL362=(Token)match(input,NL,FOLLOW_NL_in_lambda_cases3982); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL362);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_pure_block_in_lambda_cases3985);
                    pure_block363=pure_block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pure_block.add(pure_block363.getTree());


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
                    // 598:50: -> ^( CASES ^( NIL_TOKEN pattern pure_block ) )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:598:53: ^( CASES ^( NIL_TOKEN pattern pure_block ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CASES, "CASES"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:598:61: ^( NIL_TOKEN pattern pure_block )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:599:4: lambda_case_expr ( ( NL )? lambda_case_expr )*
                    {
                    pushFollow(FOLLOW_lambda_case_expr_in_lambda_cases4004);
                    lambda_case_expr364=lambda_case_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_lambda_case_expr.add(lambda_case_expr364.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:599:21: ( ( NL )? lambda_case_expr )*
                    loop153:
                    do {
                        int alt153=2;
                        int LA153_0 = input.LA(1);

                        if ( (LA153_0==NL) ) {
                            int LA153_1 = input.LA(2);

                            if ( (LA153_1==L_case) ) {
                                alt153=1;
                            }


                        }
                        else if ( (LA153_0==L_case) ) {
                            alt153=1;
                        }


                        switch (alt153) {
                    	case 1 :
                    	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:599:22: ( NL )? lambda_case_expr
                    	    {
                    	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:599:22: ( NL )?
                    	    int alt152=2;
                    	    int LA152_0 = input.LA(1);

                    	    if ( (LA152_0==NL) ) {
                    	        alt152=1;
                    	    }
                    	    switch (alt152) {
                    	        case 1 :
                    	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:599:22: NL
                    	            {
                    	            NL365=(Token)match(input,NL,FOLLOW_NL_in_lambda_cases4007); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_NL.add(NL365);


                    	            }
                    	            break;

                    	    }

                    	    pushFollow(FOLLOW_lambda_case_expr_in_lambda_cases4010);
                    	    lambda_case_expr366=lambda_case_expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_lambda_case_expr.add(lambda_case_expr366.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop153;
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
                    // 599:45: -> ^( CASES ( lambda_case_expr )+ )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:599:48: ^( CASES ( lambda_case_expr )+ )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:601:1: for_expr : L_for ( NL )? pattern ( NL )? L_in ( NL )? protected_expr ( NL )? L_do block L_end -> ^( FOR_EXPR pattern protected_expr block ) ;
    public final babel17Parser.for_expr_return for_expr() throws RecognitionException {
        babel17Parser.for_expr_return retval = new babel17Parser.for_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_for367=null;
        Token NL368=null;
        Token NL370=null;
        Token L_in371=null;
        Token NL372=null;
        Token NL374=null;
        Token L_do375=null;
        Token L_end377=null;
        babel17Parser.pattern_return pattern369 = null;

        babel17Parser.protected_expr_return protected_expr373 = null;

        babel17Parser.block_return block376 = null;


        CommonTree L_for367_tree=null;
        CommonTree NL368_tree=null;
        CommonTree NL370_tree=null;
        CommonTree L_in371_tree=null;
        CommonTree NL372_tree=null;
        CommonTree NL374_tree=null;
        CommonTree L_do375_tree=null;
        CommonTree L_end377_tree=null;
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleTokenStream stream_L_for=new RewriteRuleTokenStream(adaptor,"token L_for");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_in=new RewriteRuleTokenStream(adaptor,"token L_in");
        RewriteRuleTokenStream stream_L_do=new RewriteRuleTokenStream(adaptor,"token L_do");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_protected_expr=new RewriteRuleSubtreeStream(adaptor,"rule protected_expr");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:601:9: ( L_for ( NL )? pattern ( NL )? L_in ( NL )? protected_expr ( NL )? L_do block L_end -> ^( FOR_EXPR pattern protected_expr block ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:601:11: L_for ( NL )? pattern ( NL )? L_in ( NL )? protected_expr ( NL )? L_do block L_end
            {
            L_for367=(Token)match(input,L_for,FOLLOW_L_for_in_for_expr4028); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_for.add(L_for367);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:601:17: ( NL )?
            int alt155=2;
            int LA155_0 = input.LA(1);

            if ( (LA155_0==NL) ) {
                alt155=1;
            }
            switch (alt155) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:601:17: NL
                    {
                    NL368=(Token)match(input,NL,FOLLOW_NL_in_for_expr4030); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL368);


                    }
                    break;

            }

            pushFollow(FOLLOW_pattern_in_for_expr4033);
            pattern369=pattern();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pattern.add(pattern369.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:601:29: ( NL )?
            int alt156=2;
            int LA156_0 = input.LA(1);

            if ( (LA156_0==NL) ) {
                alt156=1;
            }
            switch (alt156) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:601:29: NL
                    {
                    NL370=(Token)match(input,NL,FOLLOW_NL_in_for_expr4035); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL370);


                    }
                    break;

            }

            L_in371=(Token)match(input,L_in,FOLLOW_L_in_in_for_expr4038); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_in.add(L_in371);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:601:38: ( NL )?
            int alt157=2;
            int LA157_0 = input.LA(1);

            if ( (LA157_0==NL) ) {
                alt157=1;
            }
            switch (alt157) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:601:38: NL
                    {
                    NL372=(Token)match(input,NL,FOLLOW_NL_in_for_expr4040); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL372);


                    }
                    break;

            }

            pushFollow(FOLLOW_protected_expr_in_for_expr4043);
            protected_expr373=protected_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr373.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:601:57: ( NL )?
            int alt158=2;
            int LA158_0 = input.LA(1);

            if ( (LA158_0==NL) ) {
                alt158=1;
            }
            switch (alt158) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:601:57: NL
                    {
                    NL374=(Token)match(input,NL,FOLLOW_NL_in_for_expr4045); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL374);


                    }
                    break;

            }

            L_do375=(Token)match(input,L_do,FOLLOW_L_do_in_for_expr4048); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_do.add(L_do375);

            pushFollow(FOLLOW_block_in_for_expr4050);
            block376=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block376.getTree());
            L_end377=(Token)match(input,L_end,FOLLOW_L_end_in_for_expr4052); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_end.add(L_end377);



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
            // 602:5: -> ^( FOR_EXPR pattern protected_expr block )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:602:8: ^( FOR_EXPR pattern protected_expr block )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:604:1: op_expr : ( builtin_primitive op_expr | bool_expr );
    public final babel17Parser.op_expr_return op_expr() throws RecognitionException {
        babel17Parser.op_expr_return retval = new babel17Parser.op_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.builtin_primitive_return builtin_primitive378 = null;

        babel17Parser.op_expr_return op_expr379 = null;

        babel17Parser.bool_expr_return bool_expr380 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:604:9: ( builtin_primitive op_expr | bool_expr )
            int alt159=2;
            int LA159_0 = input.LA(1);

            if ( (LA159_0==L_exception||(LA159_0>=L_concurrent && LA159_0<=L_lazy)||LA159_0==L_random||LA159_0==L_typeof||LA159_0==L_force) ) {
                alt159=1;
            }
            else if ( (LA159_0==L_begin||(LA159_0>=L_with && LA159_0<=L_if)||(LA159_0>=L_while && LA159_0<=L_for)||LA159_0==L_match||LA159_0==L_try||(LA159_0>=A_infinity && LA159_0<=U_infinity)||(LA159_0>=L_true && LA159_0<=L_this)||LA159_0==L_nil||LA159_0==MINUS||LA159_0==A_NOT||LA159_0==U_NOT||(LA159_0>=Constr && LA159_0<=Num)||(LA159_0>=String && LA159_0<=ROUND_BRACKET_OPEN)||LA159_0==SQUARE_BRACKET_OPEN||LA159_0==CURLY_BRACKET_OPEN) ) {
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:604:11: builtin_primitive op_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_builtin_primitive_in_op_expr4077);
                    builtin_primitive378=builtin_primitive();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(builtin_primitive378.getTree(), root_0);
                    pushFollow(FOLLOW_op_expr_in_op_expr4080);
                    op_expr379=op_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, op_expr379.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:605:4: bool_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_bool_expr_in_op_expr4085);
                    bool_expr380=bool_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_expr380.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:607:1: p_op_expr : ( builtin_primitive ( NL )? p_op_expr | p_bool_expr );
    public final babel17Parser.p_op_expr_return p_op_expr() throws RecognitionException {
        babel17Parser.p_op_expr_return retval = new babel17Parser.p_op_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL382=null;
        babel17Parser.builtin_primitive_return builtin_primitive381 = null;

        babel17Parser.p_op_expr_return p_op_expr383 = null;

        babel17Parser.p_bool_expr_return p_bool_expr384 = null;


        CommonTree NL382_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:608:2: ( builtin_primitive ( NL )? p_op_expr | p_bool_expr )
            int alt161=2;
            int LA161_0 = input.LA(1);

            if ( (LA161_0==L_exception||(LA161_0>=L_concurrent && LA161_0<=L_lazy)||LA161_0==L_random||LA161_0==L_typeof||LA161_0==L_force) ) {
                alt161=1;
            }
            else if ( (LA161_0==L_begin||(LA161_0>=L_with && LA161_0<=L_if)||(LA161_0>=L_while && LA161_0<=L_for)||LA161_0==L_match||LA161_0==L_try||(LA161_0>=A_infinity && LA161_0<=U_infinity)||(LA161_0>=L_true && LA161_0<=L_this)||LA161_0==L_nil||LA161_0==MINUS||LA161_0==A_NOT||LA161_0==U_NOT||(LA161_0>=Constr && LA161_0<=Num)||(LA161_0>=String && LA161_0<=ROUND_BRACKET_OPEN)||LA161_0==SQUARE_BRACKET_OPEN||LA161_0==CURLY_BRACKET_OPEN) ) {
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:608:4: builtin_primitive ( NL )? p_op_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_builtin_primitive_in_p_op_expr4095);
                    builtin_primitive381=builtin_primitive();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(builtin_primitive381.getTree(), root_0);
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:608:25: ( NL )?
                    int alt160=2;
                    int LA160_0 = input.LA(1);

                    if ( (LA160_0==NL) ) {
                        alt160=1;
                    }
                    switch (alt160) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:608:25: NL
                            {
                            NL382=(Token)match(input,NL,FOLLOW_NL_in_p_op_expr4098); if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_p_op_expr_in_p_op_expr4102);
                    p_op_expr383=p_op_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_op_expr383.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:609:4: p_bool_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_p_bool_expr_in_p_op_expr4107);
                    p_bool_expr384=p_bool_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_bool_expr384.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:612:1: builtin_primitive : ( L_random | L_exception | L_lazy | L_choose | L_concurrent | L_force | L_typeof );
    public final babel17Parser.builtin_primitive_return builtin_primitive() throws RecognitionException {
        babel17Parser.builtin_primitive_return retval = new babel17Parser.builtin_primitive_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set385=null;

        CommonTree set385_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:613:2: ( L_random | L_exception | L_lazy | L_choose | L_concurrent | L_force | L_typeof )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set385=(Token)input.LT(1);
            if ( input.LA(1)==L_exception||(input.LA(1)>=L_concurrent && input.LA(1)<=L_lazy)||input.LA(1)==L_random||input.LA(1)==L_typeof||input.LA(1)==L_force ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set385));
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:615:1: bool_expr : bool_or_expr ;
    public final babel17Parser.bool_expr_return bool_expr() throws RecognitionException {
        babel17Parser.bool_expr_return retval = new babel17Parser.bool_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.bool_or_expr_return bool_or_expr386 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:616:2: ( bool_or_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:616:4: bool_or_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bool_or_expr_in_bool_expr4151);
            bool_or_expr386=bool_or_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_or_expr386.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:618:1: p_bool_expr : p_bool_or_expr ;
    public final babel17Parser.p_bool_expr_return p_bool_expr() throws RecognitionException {
        babel17Parser.p_bool_expr_return retval = new babel17Parser.p_bool_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.p_bool_or_expr_return p_bool_or_expr387 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:619:2: ( p_bool_or_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:619:4: p_bool_or_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_bool_or_expr_in_p_bool_expr4161);
            p_bool_or_expr387=p_bool_or_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_bool_or_expr387.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:621:1: bool_or_expr : bool_and_expr ( ( NL )? token_OR ( NL )? bool_and_expr )* ;
    public final babel17Parser.bool_or_expr_return bool_or_expr() throws RecognitionException {
        babel17Parser.bool_or_expr_return retval = new babel17Parser.bool_or_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL389=null;
        Token NL391=null;
        babel17Parser.bool_and_expr_return bool_and_expr388 = null;

        babel17Parser.token_OR_return token_OR390 = null;

        babel17Parser.bool_and_expr_return bool_and_expr392 = null;


        CommonTree NL389_tree=null;
        CommonTree NL391_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:622:2: ( bool_and_expr ( ( NL )? token_OR ( NL )? bool_and_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:622:4: bool_and_expr ( ( NL )? token_OR ( NL )? bool_and_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bool_and_expr_in_bool_or_expr4170);
            bool_and_expr388=bool_and_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_and_expr388.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:622:18: ( ( NL )? token_OR ( NL )? bool_and_expr )*
            loop164:
            do {
                int alt164=2;
                int LA164_0 = input.LA(1);

                if ( (LA164_0==NL) ) {
                    int LA164_1 = input.LA(2);

                    if ( (LA164_1==A_OR||LA164_1==U_OR) ) {
                        alt164=1;
                    }


                }
                else if ( (LA164_0==A_OR||LA164_0==U_OR) ) {
                    alt164=1;
                }


                switch (alt164) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:622:19: ( NL )? token_OR ( NL )? bool_and_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:622:21: ( NL )?
            	    int alt162=2;
            	    int LA162_0 = input.LA(1);

            	    if ( (LA162_0==NL) ) {
            	        alt162=1;
            	    }
            	    switch (alt162) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:622:21: NL
            	            {
            	            NL389=(Token)match(input,NL,FOLLOW_NL_in_bool_or_expr4173); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_token_OR_in_bool_or_expr4177);
            	    token_OR390=token_OR();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(token_OR390.getTree(), root_0);
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:622:36: ( NL )?
            	    int alt163=2;
            	    int LA163_0 = input.LA(1);

            	    if ( (LA163_0==NL) ) {
            	        alt163=1;
            	    }
            	    switch (alt163) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:622:36: NL
            	            {
            	            NL391=(Token)match(input,NL,FOLLOW_NL_in_bool_or_expr4180); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_bool_and_expr_in_bool_or_expr4184);
            	    bool_and_expr392=bool_and_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_and_expr392.getTree());

            	    }
            	    break;

            	default :
            	    break loop164;
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:624:1: p_bool_or_expr : p_bool_and_expr ( ( NL )? token_OR ( NL )? p_bool_and_expr )* ;
    public final babel17Parser.p_bool_or_expr_return p_bool_or_expr() throws RecognitionException {
        babel17Parser.p_bool_or_expr_return retval = new babel17Parser.p_bool_or_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL394=null;
        Token NL396=null;
        babel17Parser.p_bool_and_expr_return p_bool_and_expr393 = null;

        babel17Parser.token_OR_return token_OR395 = null;

        babel17Parser.p_bool_and_expr_return p_bool_and_expr397 = null;


        CommonTree NL394_tree=null;
        CommonTree NL396_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:625:2: ( p_bool_and_expr ( ( NL )? token_OR ( NL )? p_bool_and_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:625:4: p_bool_and_expr ( ( NL )? token_OR ( NL )? p_bool_and_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_bool_and_expr_in_p_bool_or_expr4196);
            p_bool_and_expr393=p_bool_and_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_bool_and_expr393.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:625:20: ( ( NL )? token_OR ( NL )? p_bool_and_expr )*
            loop167:
            do {
                int alt167=2;
                int LA167_0 = input.LA(1);

                if ( (LA167_0==NL) ) {
                    int LA167_1 = input.LA(2);

                    if ( (LA167_1==A_OR||LA167_1==U_OR) ) {
                        alt167=1;
                    }


                }
                else if ( (LA167_0==A_OR||LA167_0==U_OR) ) {
                    alt167=1;
                }


                switch (alt167) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:625:21: ( NL )? token_OR ( NL )? p_bool_and_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:625:23: ( NL )?
            	    int alt165=2;
            	    int LA165_0 = input.LA(1);

            	    if ( (LA165_0==NL) ) {
            	        alt165=1;
            	    }
            	    switch (alt165) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:625:23: NL
            	            {
            	            NL394=(Token)match(input,NL,FOLLOW_NL_in_p_bool_or_expr4199); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_token_OR_in_p_bool_or_expr4203);
            	    token_OR395=token_OR();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(token_OR395.getTree(), root_0);
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:625:38: ( NL )?
            	    int alt166=2;
            	    int LA166_0 = input.LA(1);

            	    if ( (LA166_0==NL) ) {
            	        alt166=1;
            	    }
            	    switch (alt166) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:625:38: NL
            	            {
            	            NL396=(Token)match(input,NL,FOLLOW_NL_in_p_bool_or_expr4206); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_bool_and_expr_in_p_bool_or_expr4210);
            	    p_bool_and_expr397=p_bool_and_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_bool_and_expr397.getTree());

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
    // $ANTLR end "p_bool_or_expr"

    public static class bool_and_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bool_and_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:627:1: bool_and_expr : bool_not_expr ( ( NL )? token_AND ( NL )? bool_not_expr )* ;
    public final babel17Parser.bool_and_expr_return bool_and_expr() throws RecognitionException {
        babel17Parser.bool_and_expr_return retval = new babel17Parser.bool_and_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL399=null;
        Token NL401=null;
        babel17Parser.bool_not_expr_return bool_not_expr398 = null;

        babel17Parser.token_AND_return token_AND400 = null;

        babel17Parser.bool_not_expr_return bool_not_expr402 = null;


        CommonTree NL399_tree=null;
        CommonTree NL401_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:628:2: ( bool_not_expr ( ( NL )? token_AND ( NL )? bool_not_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:628:4: bool_not_expr ( ( NL )? token_AND ( NL )? bool_not_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bool_not_expr_in_bool_and_expr4222);
            bool_not_expr398=bool_not_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_not_expr398.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:628:18: ( ( NL )? token_AND ( NL )? bool_not_expr )*
            loop170:
            do {
                int alt170=2;
                int LA170_0 = input.LA(1);

                if ( (LA170_0==NL) ) {
                    int LA170_1 = input.LA(2);

                    if ( (LA170_1==A_AND||LA170_1==U_AND) ) {
                        alt170=1;
                    }


                }
                else if ( (LA170_0==A_AND||LA170_0==U_AND) ) {
                    alt170=1;
                }


                switch (alt170) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:628:19: ( NL )? token_AND ( NL )? bool_not_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:628:21: ( NL )?
            	    int alt168=2;
            	    int LA168_0 = input.LA(1);

            	    if ( (LA168_0==NL) ) {
            	        alt168=1;
            	    }
            	    switch (alt168) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:628:21: NL
            	            {
            	            NL399=(Token)match(input,NL,FOLLOW_NL_in_bool_and_expr4225); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_token_AND_in_bool_and_expr4229);
            	    token_AND400=token_AND();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(token_AND400.getTree(), root_0);
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:628:37: ( NL )?
            	    int alt169=2;
            	    int LA169_0 = input.LA(1);

            	    if ( (LA169_0==NL) ) {
            	        alt169=1;
            	    }
            	    switch (alt169) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:628:37: NL
            	            {
            	            NL401=(Token)match(input,NL,FOLLOW_NL_in_bool_and_expr4232); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_bool_not_expr_in_bool_and_expr4236);
            	    bool_not_expr402=bool_not_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_not_expr402.getTree());

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
    // $ANTLR end "bool_and_expr"

    public static class p_bool_and_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "p_bool_and_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:630:1: p_bool_and_expr : p_bool_not_expr ( ( NL )? token_AND ( NL )? p_bool_not_expr )* ;
    public final babel17Parser.p_bool_and_expr_return p_bool_and_expr() throws RecognitionException {
        babel17Parser.p_bool_and_expr_return retval = new babel17Parser.p_bool_and_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL404=null;
        Token NL406=null;
        babel17Parser.p_bool_not_expr_return p_bool_not_expr403 = null;

        babel17Parser.token_AND_return token_AND405 = null;

        babel17Parser.p_bool_not_expr_return p_bool_not_expr407 = null;


        CommonTree NL404_tree=null;
        CommonTree NL406_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:631:2: ( p_bool_not_expr ( ( NL )? token_AND ( NL )? p_bool_not_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:631:4: p_bool_not_expr ( ( NL )? token_AND ( NL )? p_bool_not_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_bool_not_expr_in_p_bool_and_expr4248);
            p_bool_not_expr403=p_bool_not_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_bool_not_expr403.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:631:20: ( ( NL )? token_AND ( NL )? p_bool_not_expr )*
            loop173:
            do {
                int alt173=2;
                int LA173_0 = input.LA(1);

                if ( (LA173_0==NL) ) {
                    int LA173_1 = input.LA(2);

                    if ( (LA173_1==A_AND||LA173_1==U_AND) ) {
                        alt173=1;
                    }


                }
                else if ( (LA173_0==A_AND||LA173_0==U_AND) ) {
                    alt173=1;
                }


                switch (alt173) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:631:21: ( NL )? token_AND ( NL )? p_bool_not_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:631:23: ( NL )?
            	    int alt171=2;
            	    int LA171_0 = input.LA(1);

            	    if ( (LA171_0==NL) ) {
            	        alt171=1;
            	    }
            	    switch (alt171) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:631:23: NL
            	            {
            	            NL404=(Token)match(input,NL,FOLLOW_NL_in_p_bool_and_expr4251); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_token_AND_in_p_bool_and_expr4255);
            	    token_AND405=token_AND();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(token_AND405.getTree(), root_0);
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:631:39: ( NL )?
            	    int alt172=2;
            	    int LA172_0 = input.LA(1);

            	    if ( (LA172_0==NL) ) {
            	        alt172=1;
            	    }
            	    switch (alt172) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:631:39: NL
            	            {
            	            NL406=(Token)match(input,NL,FOLLOW_NL_in_p_bool_and_expr4258); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_bool_not_expr_in_p_bool_and_expr4262);
            	    p_bool_not_expr407=p_bool_not_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_bool_not_expr407.getTree());

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
    // $ANTLR end "p_bool_and_expr"

    public static class bool_not_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bool_not_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:634:1: bool_not_expr : ( token_NOT ( NL )? bool_not_expr | rel_expr );
    public final babel17Parser.bool_not_expr_return bool_not_expr() throws RecognitionException {
        babel17Parser.bool_not_expr_return retval = new babel17Parser.bool_not_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL409=null;
        babel17Parser.token_NOT_return token_NOT408 = null;

        babel17Parser.bool_not_expr_return bool_not_expr410 = null;

        babel17Parser.rel_expr_return rel_expr411 = null;


        CommonTree NL409_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:635:2: ( token_NOT ( NL )? bool_not_expr | rel_expr )
            int alt175=2;
            int LA175_0 = input.LA(1);

            if ( (LA175_0==A_NOT||LA175_0==U_NOT) ) {
                alt175=1;
            }
            else if ( (LA175_0==L_begin||(LA175_0>=L_with && LA175_0<=L_if)||(LA175_0>=L_while && LA175_0<=L_for)||LA175_0==L_match||LA175_0==L_try||(LA175_0>=A_infinity && LA175_0<=U_infinity)||(LA175_0>=L_true && LA175_0<=L_this)||LA175_0==L_nil||LA175_0==MINUS||(LA175_0>=Constr && LA175_0<=Num)||(LA175_0>=String && LA175_0<=ROUND_BRACKET_OPEN)||LA175_0==SQUARE_BRACKET_OPEN||LA175_0==CURLY_BRACKET_OPEN) ) {
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:635:4: token_NOT ( NL )? bool_not_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_NOT_in_bool_not_expr4274);
                    token_NOT408=token_NOT();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(token_NOT408.getTree(), root_0);
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:635:17: ( NL )?
                    int alt174=2;
                    int LA174_0 = input.LA(1);

                    if ( (LA174_0==NL) ) {
                        alt174=1;
                    }
                    switch (alt174) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:635:17: NL
                            {
                            NL409=(Token)match(input,NL,FOLLOW_NL_in_bool_not_expr4277); if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_bool_not_expr_in_bool_not_expr4281);
                    bool_not_expr410=bool_not_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_not_expr410.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:636:4: rel_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_rel_expr_in_bool_not_expr4286);
                    rel_expr411=rel_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rel_expr411.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:638:1: p_bool_not_expr : ( token_NOT ( NL )? p_bool_not_expr | p_rel_expr );
    public final babel17Parser.p_bool_not_expr_return p_bool_not_expr() throws RecognitionException {
        babel17Parser.p_bool_not_expr_return retval = new babel17Parser.p_bool_not_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL413=null;
        babel17Parser.token_NOT_return token_NOT412 = null;

        babel17Parser.p_bool_not_expr_return p_bool_not_expr414 = null;

        babel17Parser.p_rel_expr_return p_rel_expr415 = null;


        CommonTree NL413_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:639:2: ( token_NOT ( NL )? p_bool_not_expr | p_rel_expr )
            int alt177=2;
            int LA177_0 = input.LA(1);

            if ( (LA177_0==A_NOT||LA177_0==U_NOT) ) {
                alt177=1;
            }
            else if ( (LA177_0==L_begin||(LA177_0>=L_with && LA177_0<=L_if)||(LA177_0>=L_while && LA177_0<=L_for)||LA177_0==L_match||LA177_0==L_try||(LA177_0>=A_infinity && LA177_0<=U_infinity)||(LA177_0>=L_true && LA177_0<=L_this)||LA177_0==L_nil||LA177_0==MINUS||(LA177_0>=Constr && LA177_0<=Num)||(LA177_0>=String && LA177_0<=ROUND_BRACKET_OPEN)||LA177_0==SQUARE_BRACKET_OPEN||LA177_0==CURLY_BRACKET_OPEN) ) {
                alt177=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 177, 0, input);

                throw nvae;
            }
            switch (alt177) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:639:4: token_NOT ( NL )? p_bool_not_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_NOT_in_p_bool_not_expr4297);
                    token_NOT412=token_NOT();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(token_NOT412.getTree(), root_0);
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:639:17: ( NL )?
                    int alt176=2;
                    int LA176_0 = input.LA(1);

                    if ( (LA176_0==NL) ) {
                        alt176=1;
                    }
                    switch (alt176) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:639:17: NL
                            {
                            NL413=(Token)match(input,NL,FOLLOW_NL_in_p_bool_not_expr4300); if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_p_bool_not_expr_in_p_bool_not_expr4304);
                    p_bool_not_expr414=p_bool_not_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_bool_not_expr414.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:640:4: p_rel_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_p_rel_expr_in_p_bool_not_expr4309);
                    p_rel_expr415=p_rel_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_rel_expr415.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:642:1: rel_expr : arith_expr ( ( NL )? rel_op ( NL )? arith_expr )* -> ^( COMPARE arith_expr ( rel_op arith_expr )* ) ;
    public final babel17Parser.rel_expr_return rel_expr() throws RecognitionException {
        babel17Parser.rel_expr_return retval = new babel17Parser.rel_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL417=null;
        Token NL419=null;
        babel17Parser.arith_expr_return arith_expr416 = null;

        babel17Parser.rel_op_return rel_op418 = null;

        babel17Parser.arith_expr_return arith_expr420 = null;


        CommonTree NL417_tree=null;
        CommonTree NL419_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_arith_expr=new RewriteRuleSubtreeStream(adaptor,"rule arith_expr");
        RewriteRuleSubtreeStream stream_rel_op=new RewriteRuleSubtreeStream(adaptor,"rule rel_op");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:643:2: ( arith_expr ( ( NL )? rel_op ( NL )? arith_expr )* -> ^( COMPARE arith_expr ( rel_op arith_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:643:4: arith_expr ( ( NL )? rel_op ( NL )? arith_expr )*
            {
            pushFollow(FOLLOW_arith_expr_in_rel_expr4318);
            arith_expr416=arith_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_arith_expr.add(arith_expr416.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:643:15: ( ( NL )? rel_op ( NL )? arith_expr )*
            loop180:
            do {
                int alt180=2;
                int LA180_0 = input.LA(1);

                if ( (LA180_0==NL) ) {
                    int LA180_1 = input.LA(2);

                    if ( ((LA180_1>=A_EQUAL && LA180_1<=U_GREATER_EQ)) ) {
                        alt180=1;
                    }


                }
                else if ( ((LA180_0>=A_EQUAL && LA180_0<=U_GREATER_EQ)) ) {
                    alt180=1;
                }


                switch (alt180) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:643:16: ( NL )? rel_op ( NL )? arith_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:643:16: ( NL )?
            	    int alt178=2;
            	    int LA178_0 = input.LA(1);

            	    if ( (LA178_0==NL) ) {
            	        alt178=1;
            	    }
            	    switch (alt178) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:643:16: NL
            	            {
            	            NL417=(Token)match(input,NL,FOLLOW_NL_in_rel_expr4321); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL417);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_rel_op_in_rel_expr4324);
            	    rel_op418=rel_op();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_rel_op.add(rel_op418.getTree());
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:643:27: ( NL )?
            	    int alt179=2;
            	    int LA179_0 = input.LA(1);

            	    if ( (LA179_0==NL) ) {
            	        alt179=1;
            	    }
            	    switch (alt179) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:643:27: NL
            	            {
            	            NL419=(Token)match(input,NL,FOLLOW_NL_in_rel_expr4326); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL419);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_arith_expr_in_rel_expr4329);
            	    arith_expr420=arith_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_arith_expr.add(arith_expr420.getTree());

            	    }
            	    break;

            	default :
            	    break loop180;
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
            // 643:44: -> ^( COMPARE arith_expr ( rel_op arith_expr )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:643:47: ^( COMPARE arith_expr ( rel_op arith_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COMPARE, "COMPARE"), root_1);

                adaptor.addChild(root_1, stream_arith_expr.nextTree());
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:643:68: ( rel_op arith_expr )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:645:1: p_rel_expr : p_arith_expr ( ( NL )? rel_op ( NL )? p_arith_expr )* -> ^( COMPARE p_arith_expr ( rel_op p_arith_expr )* ) ;
    public final babel17Parser.p_rel_expr_return p_rel_expr() throws RecognitionException {
        babel17Parser.p_rel_expr_return retval = new babel17Parser.p_rel_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL422=null;
        Token NL424=null;
        babel17Parser.p_arith_expr_return p_arith_expr421 = null;

        babel17Parser.rel_op_return rel_op423 = null;

        babel17Parser.p_arith_expr_return p_arith_expr425 = null;


        CommonTree NL422_tree=null;
        CommonTree NL424_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_p_arith_expr=new RewriteRuleSubtreeStream(adaptor,"rule p_arith_expr");
        RewriteRuleSubtreeStream stream_rel_op=new RewriteRuleSubtreeStream(adaptor,"rule rel_op");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:646:2: ( p_arith_expr ( ( NL )? rel_op ( NL )? p_arith_expr )* -> ^( COMPARE p_arith_expr ( rel_op p_arith_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:646:4: p_arith_expr ( ( NL )? rel_op ( NL )? p_arith_expr )*
            {
            pushFollow(FOLLOW_p_arith_expr_in_p_rel_expr4356);
            p_arith_expr421=p_arith_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_p_arith_expr.add(p_arith_expr421.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:646:17: ( ( NL )? rel_op ( NL )? p_arith_expr )*
            loop183:
            do {
                int alt183=2;
                int LA183_0 = input.LA(1);

                if ( (LA183_0==NL) ) {
                    int LA183_1 = input.LA(2);

                    if ( ((LA183_1>=A_EQUAL && LA183_1<=U_GREATER_EQ)) ) {
                        alt183=1;
                    }


                }
                else if ( ((LA183_0>=A_EQUAL && LA183_0<=U_GREATER_EQ)) ) {
                    alt183=1;
                }


                switch (alt183) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:646:18: ( NL )? rel_op ( NL )? p_arith_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:646:18: ( NL )?
            	    int alt181=2;
            	    int LA181_0 = input.LA(1);

            	    if ( (LA181_0==NL) ) {
            	        alt181=1;
            	    }
            	    switch (alt181) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:646:18: NL
            	            {
            	            NL422=(Token)match(input,NL,FOLLOW_NL_in_p_rel_expr4359); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL422);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_rel_op_in_p_rel_expr4362);
            	    rel_op423=rel_op();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_rel_op.add(rel_op423.getTree());
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:646:29: ( NL )?
            	    int alt182=2;
            	    int LA182_0 = input.LA(1);

            	    if ( (LA182_0==NL) ) {
            	        alt182=1;
            	    }
            	    switch (alt182) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:646:29: NL
            	            {
            	            NL424=(Token)match(input,NL,FOLLOW_NL_in_p_rel_expr4364); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL424);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_arith_expr_in_p_rel_expr4367);
            	    p_arith_expr425=p_arith_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_p_arith_expr.add(p_arith_expr425.getTree());

            	    }
            	    break;

            	default :
            	    break loop183;
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
            // 646:48: -> ^( COMPARE p_arith_expr ( rel_op p_arith_expr )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:646:51: ^( COMPARE p_arith_expr ( rel_op p_arith_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COMPARE, "COMPARE"), root_1);

                adaptor.addChild(root_1, stream_p_arith_expr.nextTree());
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:646:74: ( rel_op p_arith_expr )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:649:1: rel_op : ( token_EQUAL | token_NOT_EQUAL | GREATER | token_GREATER_EQ | LESS | token_LESS_EQ );
    public final babel17Parser.rel_op_return rel_op() throws RecognitionException {
        babel17Parser.rel_op_return retval = new babel17Parser.rel_op_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token GREATER428=null;
        Token LESS430=null;
        babel17Parser.token_EQUAL_return token_EQUAL426 = null;

        babel17Parser.token_NOT_EQUAL_return token_NOT_EQUAL427 = null;

        babel17Parser.token_GREATER_EQ_return token_GREATER_EQ429 = null;

        babel17Parser.token_LESS_EQ_return token_LESS_EQ431 = null;


        CommonTree GREATER428_tree=null;
        CommonTree LESS430_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:649:8: ( token_EQUAL | token_NOT_EQUAL | GREATER | token_GREATER_EQ | LESS | token_LESS_EQ )
            int alt184=6;
            switch ( input.LA(1) ) {
            case A_EQUAL:
            case U_EQUAL:
                {
                alt184=1;
                }
                break;
            case A_NOT_EQUAL:
            case U_NOT_EQUAL:
                {
                alt184=2;
                }
                break;
            case GREATER:
                {
                alt184=3;
                }
                break;
            case A_GREATER_EQ:
            case U_GREATER_EQ:
                {
                alt184=4;
                }
                break;
            case LESS:
                {
                alt184=5;
                }
                break;
            case A_LESS_EQ:
            case U_LESS_EQ:
                {
                alt184=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 184, 0, input);

                throw nvae;
            }

            switch (alt184) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:649:10: token_EQUAL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_EQUAL_in_rel_op4393);
                    token_EQUAL426=token_EQUAL();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, token_EQUAL426.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:649:24: token_NOT_EQUAL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_NOT_EQUAL_in_rel_op4397);
                    token_NOT_EQUAL427=token_NOT_EQUAL();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, token_NOT_EQUAL427.getTree());

                    }
                    break;
                case 3 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:649:42: GREATER
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    GREATER428=(Token)match(input,GREATER,FOLLOW_GREATER_in_rel_op4401); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    GREATER428_tree = (CommonTree)adaptor.create(GREATER428);
                    adaptor.addChild(root_0, GREATER428_tree);
                    }

                    }
                    break;
                case 4 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:649:52: token_GREATER_EQ
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_GREATER_EQ_in_rel_op4405);
                    token_GREATER_EQ429=token_GREATER_EQ();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, token_GREATER_EQ429.getTree());

                    }
                    break;
                case 5 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:649:71: LESS
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    LESS430=(Token)match(input,LESS,FOLLOW_LESS_in_rel_op4409); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LESS430_tree = (CommonTree)adaptor.create(LESS430);
                    adaptor.addChild(root_0, LESS430_tree);
                    }

                    }
                    break;
                case 6 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:649:78: token_LESS_EQ
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_LESS_EQ_in_rel_op4413);
                    token_LESS_EQ431=token_LESS_EQ();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, token_LESS_EQ431.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:652:1: arith_expr : plusplus_expr ;
    public final babel17Parser.arith_expr_return arith_expr() throws RecognitionException {
        babel17Parser.arith_expr_return retval = new babel17Parser.arith_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.plusplus_expr_return plusplus_expr432 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:653:2: ( plusplus_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:653:4: plusplus_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_plusplus_expr_in_arith_expr4425);
            plusplus_expr432=plusplus_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, plusplus_expr432.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:656:1: p_arith_expr : p_plusplus_expr ;
    public final babel17Parser.p_arith_expr_return p_arith_expr() throws RecognitionException {
        babel17Parser.p_arith_expr_return retval = new babel17Parser.p_arith_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.p_plusplus_expr_return p_plusplus_expr433 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:657:2: ( p_plusplus_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:657:4: p_plusplus_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_plusplus_expr_in_p_arith_expr4435);
            p_plusplus_expr433=p_plusplus_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_plusplus_expr433.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:659:1: plusplus_expr : timestimes_expr ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? timestimes_expr )* ;
    public final babel17Parser.plusplus_expr_return plusplus_expr() throws RecognitionException {
        babel17Parser.plusplus_expr_return retval = new babel17Parser.plusplus_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL435=null;
        Token PLUSPLUS436=null;
        Token MINUSMINUS437=null;
        Token NL438=null;
        babel17Parser.timestimes_expr_return timestimes_expr434 = null;

        babel17Parser.timestimes_expr_return timestimes_expr439 = null;


        CommonTree NL435_tree=null;
        CommonTree PLUSPLUS436_tree=null;
        CommonTree MINUSMINUS437_tree=null;
        CommonTree NL438_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:660:2: ( timestimes_expr ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? timestimes_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:660:4: timestimes_expr ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? timestimes_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_timestimes_expr_in_plusplus_expr4445);
            timestimes_expr434=timestimes_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, timestimes_expr434.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:660:20: ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? timestimes_expr )*
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
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:660:21: ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? timestimes_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:660:23: ( NL )?
            	    int alt185=2;
            	    int LA185_0 = input.LA(1);

            	    if ( (LA185_0==NL) ) {
            	        alt185=1;
            	    }
            	    switch (alt185) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:660:23: NL
            	            {
            	            NL435=(Token)match(input,NL,FOLLOW_NL_in_plusplus_expr4448); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:660:26: ( PLUSPLUS | MINUSMINUS )
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
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:660:27: PLUSPLUS
            	            {
            	            PLUSPLUS436=(Token)match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_plusplus_expr4453); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PLUSPLUS436_tree = (CommonTree)adaptor.create(PLUSPLUS436);
            	            root_0 = (CommonTree)adaptor.becomeRoot(PLUSPLUS436_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:660:37: MINUSMINUS
            	            {
            	            MINUSMINUS437=(Token)match(input,MINUSMINUS,FOLLOW_MINUSMINUS_in_plusplus_expr4456); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            MINUSMINUS437_tree = (CommonTree)adaptor.create(MINUSMINUS437);
            	            root_0 = (CommonTree)adaptor.becomeRoot(MINUSMINUS437_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:660:52: ( NL )?
            	    int alt187=2;
            	    int LA187_0 = input.LA(1);

            	    if ( (LA187_0==NL) ) {
            	        alt187=1;
            	    }
            	    switch (alt187) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:660:52: NL
            	            {
            	            NL438=(Token)match(input,NL,FOLLOW_NL_in_plusplus_expr4460); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_timestimes_expr_in_plusplus_expr4464);
            	    timestimes_expr439=timestimes_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, timestimes_expr439.getTree());

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
    // $ANTLR end "plusplus_expr"

    public static class p_plusplus_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "p_plusplus_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:662:1: p_plusplus_expr : p_timestimes_expr ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? p_timestimes_expr )* ;
    public final babel17Parser.p_plusplus_expr_return p_plusplus_expr() throws RecognitionException {
        babel17Parser.p_plusplus_expr_return retval = new babel17Parser.p_plusplus_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL441=null;
        Token PLUSPLUS442=null;
        Token MINUSMINUS443=null;
        Token NL444=null;
        babel17Parser.p_timestimes_expr_return p_timestimes_expr440 = null;

        babel17Parser.p_timestimes_expr_return p_timestimes_expr445 = null;


        CommonTree NL441_tree=null;
        CommonTree PLUSPLUS442_tree=null;
        CommonTree MINUSMINUS443_tree=null;
        CommonTree NL444_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:663:2: ( p_timestimes_expr ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? p_timestimes_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:663:4: p_timestimes_expr ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? p_timestimes_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_timestimes_expr_in_p_plusplus_expr4476);
            p_timestimes_expr440=p_timestimes_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_timestimes_expr440.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:663:22: ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? p_timestimes_expr )*
            loop192:
            do {
                int alt192=2;
                int LA192_0 = input.LA(1);

                if ( (LA192_0==NL) ) {
                    int LA192_1 = input.LA(2);

                    if ( ((LA192_1>=PLUSPLUS && LA192_1<=MINUSMINUS)) ) {
                        alt192=1;
                    }


                }
                else if ( ((LA192_0>=PLUSPLUS && LA192_0<=MINUSMINUS)) ) {
                    alt192=1;
                }


                switch (alt192) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:663:23: ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? p_timestimes_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:663:25: ( NL )?
            	    int alt189=2;
            	    int LA189_0 = input.LA(1);

            	    if ( (LA189_0==NL) ) {
            	        alt189=1;
            	    }
            	    switch (alt189) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:663:25: NL
            	            {
            	            NL441=(Token)match(input,NL,FOLLOW_NL_in_p_plusplus_expr4479); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:663:28: ( PLUSPLUS | MINUSMINUS )
            	    int alt190=2;
            	    int LA190_0 = input.LA(1);

            	    if ( (LA190_0==PLUSPLUS) ) {
            	        alt190=1;
            	    }
            	    else if ( (LA190_0==MINUSMINUS) ) {
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
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:663:29: PLUSPLUS
            	            {
            	            PLUSPLUS442=(Token)match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_p_plusplus_expr4484); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PLUSPLUS442_tree = (CommonTree)adaptor.create(PLUSPLUS442);
            	            root_0 = (CommonTree)adaptor.becomeRoot(PLUSPLUS442_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:663:39: MINUSMINUS
            	            {
            	            MINUSMINUS443=(Token)match(input,MINUSMINUS,FOLLOW_MINUSMINUS_in_p_plusplus_expr4487); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            MINUSMINUS443_tree = (CommonTree)adaptor.create(MINUSMINUS443);
            	            root_0 = (CommonTree)adaptor.becomeRoot(MINUSMINUS443_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:663:54: ( NL )?
            	    int alt191=2;
            	    int LA191_0 = input.LA(1);

            	    if ( (LA191_0==NL) ) {
            	        alt191=1;
            	    }
            	    switch (alt191) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:663:54: NL
            	            {
            	            NL444=(Token)match(input,NL,FOLLOW_NL_in_p_plusplus_expr4491); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_timestimes_expr_in_p_plusplus_expr4495);
            	    p_timestimes_expr445=p_timestimes_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_timestimes_expr445.getTree());

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
    // $ANTLR end "p_plusplus_expr"

    public static class timestimes_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "timestimes_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:666:1: timestimes_expr : simple_expr ( ( NL )? ( TIMESTIMES | QUOTIENTQUOTIENT ) ( NL )? simple_expr )* ;
    public final babel17Parser.timestimes_expr_return timestimes_expr() throws RecognitionException {
        babel17Parser.timestimes_expr_return retval = new babel17Parser.timestimes_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL447=null;
        Token TIMESTIMES448=null;
        Token QUOTIENTQUOTIENT449=null;
        Token NL450=null;
        babel17Parser.simple_expr_return simple_expr446 = null;

        babel17Parser.simple_expr_return simple_expr451 = null;


        CommonTree NL447_tree=null;
        CommonTree TIMESTIMES448_tree=null;
        CommonTree QUOTIENTQUOTIENT449_tree=null;
        CommonTree NL450_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:667:2: ( simple_expr ( ( NL )? ( TIMESTIMES | QUOTIENTQUOTIENT ) ( NL )? simple_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:667:4: simple_expr ( ( NL )? ( TIMESTIMES | QUOTIENTQUOTIENT ) ( NL )? simple_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_simple_expr_in_timestimes_expr4507);
            simple_expr446=simple_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, simple_expr446.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:667:16: ( ( NL )? ( TIMESTIMES | QUOTIENTQUOTIENT ) ( NL )? simple_expr )*
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
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:667:17: ( NL )? ( TIMESTIMES | QUOTIENTQUOTIENT ) ( NL )? simple_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:667:19: ( NL )?
            	    int alt193=2;
            	    int LA193_0 = input.LA(1);

            	    if ( (LA193_0==NL) ) {
            	        alt193=1;
            	    }
            	    switch (alt193) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:667:19: NL
            	            {
            	            NL447=(Token)match(input,NL,FOLLOW_NL_in_timestimes_expr4510); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:667:22: ( TIMESTIMES | QUOTIENTQUOTIENT )
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
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:667:23: TIMESTIMES
            	            {
            	            TIMESTIMES448=(Token)match(input,TIMESTIMES,FOLLOW_TIMESTIMES_in_timestimes_expr4515); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            TIMESTIMES448_tree = (CommonTree)adaptor.create(TIMESTIMES448);
            	            root_0 = (CommonTree)adaptor.becomeRoot(TIMESTIMES448_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:667:35: QUOTIENTQUOTIENT
            	            {
            	            QUOTIENTQUOTIENT449=(Token)match(input,QUOTIENTQUOTIENT,FOLLOW_QUOTIENTQUOTIENT_in_timestimes_expr4518); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            QUOTIENTQUOTIENT449_tree = (CommonTree)adaptor.create(QUOTIENTQUOTIENT449);
            	            root_0 = (CommonTree)adaptor.becomeRoot(QUOTIENTQUOTIENT449_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:667:56: ( NL )?
            	    int alt195=2;
            	    int LA195_0 = input.LA(1);

            	    if ( (LA195_0==NL) ) {
            	        alt195=1;
            	    }
            	    switch (alt195) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:667:56: NL
            	            {
            	            NL450=(Token)match(input,NL,FOLLOW_NL_in_timestimes_expr4522); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_simple_expr_in_timestimes_expr4526);
            	    simple_expr451=simple_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, simple_expr451.getTree());

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
    // $ANTLR end "timestimes_expr"

    public static class p_timestimes_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "p_timestimes_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:669:1: p_timestimes_expr : p_simple_expr ( ( NL )? ( TIMESTIMES | QUOTIENTQUOTIENT ) ( NL )? p_simple_expr )* ;
    public final babel17Parser.p_timestimes_expr_return p_timestimes_expr() throws RecognitionException {
        babel17Parser.p_timestimes_expr_return retval = new babel17Parser.p_timestimes_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL453=null;
        Token TIMESTIMES454=null;
        Token QUOTIENTQUOTIENT455=null;
        Token NL456=null;
        babel17Parser.p_simple_expr_return p_simple_expr452 = null;

        babel17Parser.p_simple_expr_return p_simple_expr457 = null;


        CommonTree NL453_tree=null;
        CommonTree TIMESTIMES454_tree=null;
        CommonTree QUOTIENTQUOTIENT455_tree=null;
        CommonTree NL456_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:670:2: ( p_simple_expr ( ( NL )? ( TIMESTIMES | QUOTIENTQUOTIENT ) ( NL )? p_simple_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:670:4: p_simple_expr ( ( NL )? ( TIMESTIMES | QUOTIENTQUOTIENT ) ( NL )? p_simple_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_simple_expr_in_p_timestimes_expr4539);
            p_simple_expr452=p_simple_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_simple_expr452.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:670:18: ( ( NL )? ( TIMESTIMES | QUOTIENTQUOTIENT ) ( NL )? p_simple_expr )*
            loop200:
            do {
                int alt200=2;
                int LA200_0 = input.LA(1);

                if ( (LA200_0==NL) ) {
                    int LA200_1 = input.LA(2);

                    if ( ((LA200_1>=TIMESTIMES && LA200_1<=QUOTIENTQUOTIENT)) ) {
                        alt200=1;
                    }


                }
                else if ( ((LA200_0>=TIMESTIMES && LA200_0<=QUOTIENTQUOTIENT)) ) {
                    alt200=1;
                }


                switch (alt200) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:670:19: ( NL )? ( TIMESTIMES | QUOTIENTQUOTIENT ) ( NL )? p_simple_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:670:21: ( NL )?
            	    int alt197=2;
            	    int LA197_0 = input.LA(1);

            	    if ( (LA197_0==NL) ) {
            	        alt197=1;
            	    }
            	    switch (alt197) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:670:21: NL
            	            {
            	            NL453=(Token)match(input,NL,FOLLOW_NL_in_p_timestimes_expr4542); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:670:24: ( TIMESTIMES | QUOTIENTQUOTIENT )
            	    int alt198=2;
            	    int LA198_0 = input.LA(1);

            	    if ( (LA198_0==TIMESTIMES) ) {
            	        alt198=1;
            	    }
            	    else if ( (LA198_0==QUOTIENTQUOTIENT) ) {
            	        alt198=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 198, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt198) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:670:25: TIMESTIMES
            	            {
            	            TIMESTIMES454=(Token)match(input,TIMESTIMES,FOLLOW_TIMESTIMES_in_p_timestimes_expr4547); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            TIMESTIMES454_tree = (CommonTree)adaptor.create(TIMESTIMES454);
            	            root_0 = (CommonTree)adaptor.becomeRoot(TIMESTIMES454_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:670:37: QUOTIENTQUOTIENT
            	            {
            	            QUOTIENTQUOTIENT455=(Token)match(input,QUOTIENTQUOTIENT,FOLLOW_QUOTIENTQUOTIENT_in_p_timestimes_expr4550); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            QUOTIENTQUOTIENT455_tree = (CommonTree)adaptor.create(QUOTIENTQUOTIENT455);
            	            root_0 = (CommonTree)adaptor.becomeRoot(QUOTIENTQUOTIENT455_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:670:58: ( NL )?
            	    int alt199=2;
            	    int LA199_0 = input.LA(1);

            	    if ( (LA199_0==NL) ) {
            	        alt199=1;
            	    }
            	    switch (alt199) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:670:58: NL
            	            {
            	            NL456=(Token)match(input,NL,FOLLOW_NL_in_p_timestimes_expr4554); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_simple_expr_in_p_timestimes_expr4558);
            	    p_simple_expr457=p_simple_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_simple_expr457.getTree());

            	    }
            	    break;

            	default :
            	    break loop200;
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:672:1: simple_expr : cons_expr ;
    public final babel17Parser.simple_expr_return simple_expr() throws RecognitionException {
        babel17Parser.simple_expr_return retval = new babel17Parser.simple_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.cons_expr_return cons_expr458 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:673:2: ( cons_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:673:4: cons_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_cons_expr_in_simple_expr4569);
            cons_expr458=cons_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, cons_expr458.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:675:1: p_simple_expr : p_cons_expr ;
    public final babel17Parser.p_simple_expr_return p_simple_expr() throws RecognitionException {
        babel17Parser.p_simple_expr_return retval = new babel17Parser.p_simple_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.p_cons_expr_return p_cons_expr459 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:676:2: ( p_cons_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:676:4: p_cons_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_cons_expr_in_p_simple_expr4578);
            p_cons_expr459=p_cons_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_cons_expr459.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:678:1: cons_expr : to_expr ( ( NL )? token_DOUBLE_COLON ( NL )? to_expr )* -> ^( LIST_CONS ( to_expr )* ) ;
    public final babel17Parser.cons_expr_return cons_expr() throws RecognitionException {
        babel17Parser.cons_expr_return retval = new babel17Parser.cons_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL461=null;
        Token NL463=null;
        babel17Parser.to_expr_return to_expr460 = null;

        babel17Parser.token_DOUBLE_COLON_return token_DOUBLE_COLON462 = null;

        babel17Parser.to_expr_return to_expr464 = null;


        CommonTree NL461_tree=null;
        CommonTree NL463_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_token_DOUBLE_COLON=new RewriteRuleSubtreeStream(adaptor,"rule token_DOUBLE_COLON");
        RewriteRuleSubtreeStream stream_to_expr=new RewriteRuleSubtreeStream(adaptor,"rule to_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:679:2: ( to_expr ( ( NL )? token_DOUBLE_COLON ( NL )? to_expr )* -> ^( LIST_CONS ( to_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:679:4: to_expr ( ( NL )? token_DOUBLE_COLON ( NL )? to_expr )*
            {
            pushFollow(FOLLOW_to_expr_in_cons_expr4587);
            to_expr460=to_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_to_expr.add(to_expr460.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:679:12: ( ( NL )? token_DOUBLE_COLON ( NL )? to_expr )*
            loop203:
            do {
                int alt203=2;
                int LA203_0 = input.LA(1);

                if ( (LA203_0==NL) ) {
                    int LA203_1 = input.LA(2);

                    if ( ((LA203_1>=A_DOUBLE_COLON && LA203_1<=U_DOUBLE_COLON)) ) {
                        alt203=1;
                    }


                }
                else if ( ((LA203_0>=A_DOUBLE_COLON && LA203_0<=U_DOUBLE_COLON)) ) {
                    alt203=1;
                }


                switch (alt203) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:679:13: ( NL )? token_DOUBLE_COLON ( NL )? to_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:679:13: ( NL )?
            	    int alt201=2;
            	    int LA201_0 = input.LA(1);

            	    if ( (LA201_0==NL) ) {
            	        alt201=1;
            	    }
            	    switch (alt201) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:679:13: NL
            	            {
            	            NL461=(Token)match(input,NL,FOLLOW_NL_in_cons_expr4590); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL461);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_token_DOUBLE_COLON_in_cons_expr4593);
            	    token_DOUBLE_COLON462=token_DOUBLE_COLON();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_token_DOUBLE_COLON.add(token_DOUBLE_COLON462.getTree());
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:679:36: ( NL )?
            	    int alt202=2;
            	    int LA202_0 = input.LA(1);

            	    if ( (LA202_0==NL) ) {
            	        alt202=1;
            	    }
            	    switch (alt202) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:679:36: NL
            	            {
            	            NL463=(Token)match(input,NL,FOLLOW_NL_in_cons_expr4595); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL463);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_to_expr_in_cons_expr4598);
            	    to_expr464=to_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_to_expr.add(to_expr464.getTree());

            	    }
            	    break;

            	default :
            	    break loop203;
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
            // 679:50: -> ^( LIST_CONS ( to_expr )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:679:53: ^( LIST_CONS ( to_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LIST_CONS, "LIST_CONS"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:679:65: ( to_expr )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:681:1: p_cons_expr : p_to_expr ( ( NL )? token_DOUBLE_COLON ( NL )? p_to_expr )* -> ^( LIST_CONS ( p_to_expr )* ) ;
    public final babel17Parser.p_cons_expr_return p_cons_expr() throws RecognitionException {
        babel17Parser.p_cons_expr_return retval = new babel17Parser.p_cons_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL466=null;
        Token NL468=null;
        babel17Parser.p_to_expr_return p_to_expr465 = null;

        babel17Parser.token_DOUBLE_COLON_return token_DOUBLE_COLON467 = null;

        babel17Parser.p_to_expr_return p_to_expr469 = null;


        CommonTree NL466_tree=null;
        CommonTree NL468_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_p_to_expr=new RewriteRuleSubtreeStream(adaptor,"rule p_to_expr");
        RewriteRuleSubtreeStream stream_token_DOUBLE_COLON=new RewriteRuleSubtreeStream(adaptor,"rule token_DOUBLE_COLON");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:682:2: ( p_to_expr ( ( NL )? token_DOUBLE_COLON ( NL )? p_to_expr )* -> ^( LIST_CONS ( p_to_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:682:4: p_to_expr ( ( NL )? token_DOUBLE_COLON ( NL )? p_to_expr )*
            {
            pushFollow(FOLLOW_p_to_expr_in_p_cons_expr4618);
            p_to_expr465=p_to_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_p_to_expr.add(p_to_expr465.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:682:14: ( ( NL )? token_DOUBLE_COLON ( NL )? p_to_expr )*
            loop206:
            do {
                int alt206=2;
                int LA206_0 = input.LA(1);

                if ( (LA206_0==NL) ) {
                    int LA206_1 = input.LA(2);

                    if ( ((LA206_1>=A_DOUBLE_COLON && LA206_1<=U_DOUBLE_COLON)) ) {
                        alt206=1;
                    }


                }
                else if ( ((LA206_0>=A_DOUBLE_COLON && LA206_0<=U_DOUBLE_COLON)) ) {
                    alt206=1;
                }


                switch (alt206) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:682:15: ( NL )? token_DOUBLE_COLON ( NL )? p_to_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:682:15: ( NL )?
            	    int alt204=2;
            	    int LA204_0 = input.LA(1);

            	    if ( (LA204_0==NL) ) {
            	        alt204=1;
            	    }
            	    switch (alt204) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:682:15: NL
            	            {
            	            NL466=(Token)match(input,NL,FOLLOW_NL_in_p_cons_expr4621); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL466);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_token_DOUBLE_COLON_in_p_cons_expr4624);
            	    token_DOUBLE_COLON467=token_DOUBLE_COLON();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_token_DOUBLE_COLON.add(token_DOUBLE_COLON467.getTree());
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:682:38: ( NL )?
            	    int alt205=2;
            	    int LA205_0 = input.LA(1);

            	    if ( (LA205_0==NL) ) {
            	        alt205=1;
            	    }
            	    switch (alt205) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:682:38: NL
            	            {
            	            NL468=(Token)match(input,NL,FOLLOW_NL_in_p_cons_expr4626); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL468);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_to_expr_in_p_cons_expr4629);
            	    p_to_expr469=p_to_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_p_to_expr.add(p_to_expr469.getTree());

            	    }
            	    break;

            	default :
            	    break loop206;
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
            // 682:54: -> ^( LIST_CONS ( p_to_expr )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:682:57: ^( LIST_CONS ( p_to_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LIST_CONS, "LIST_CONS"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:682:69: ( p_to_expr )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:685:1: to_expr : arith_plus_expr ( ( NL )? ( L_to | L_downto ) ( NL )? arith_plus_expr )? ;
    public final babel17Parser.to_expr_return to_expr() throws RecognitionException {
        babel17Parser.to_expr_return retval = new babel17Parser.to_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL471=null;
        Token L_to472=null;
        Token L_downto473=null;
        Token NL474=null;
        babel17Parser.arith_plus_expr_return arith_plus_expr470 = null;

        babel17Parser.arith_plus_expr_return arith_plus_expr475 = null;


        CommonTree NL471_tree=null;
        CommonTree L_to472_tree=null;
        CommonTree L_downto473_tree=null;
        CommonTree NL474_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:685:9: ( arith_plus_expr ( ( NL )? ( L_to | L_downto ) ( NL )? arith_plus_expr )? )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:685:11: arith_plus_expr ( ( NL )? ( L_to | L_downto ) ( NL )? arith_plus_expr )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_arith_plus_expr_in_to_expr4649);
            arith_plus_expr470=arith_plus_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, arith_plus_expr470.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:685:27: ( ( NL )? ( L_to | L_downto ) ( NL )? arith_plus_expr )?
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:685:28: ( NL )? ( L_to | L_downto ) ( NL )? arith_plus_expr
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:685:30: ( NL )?
                    int alt207=2;
                    int LA207_0 = input.LA(1);

                    if ( (LA207_0==NL) ) {
                        alt207=1;
                    }
                    switch (alt207) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:685:30: NL
                            {
                            NL471=(Token)match(input,NL,FOLLOW_NL_in_to_expr4652); if (state.failed) return retval;

                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:685:33: ( L_to | L_downto )
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
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:685:34: L_to
                            {
                            L_to472=(Token)match(input,L_to,FOLLOW_L_to_in_to_expr4657); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            L_to472_tree = (CommonTree)adaptor.create(L_to472);
                            root_0 = (CommonTree)adaptor.becomeRoot(L_to472_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:685:41: L_downto
                            {
                            L_downto473=(Token)match(input,L_downto,FOLLOW_L_downto_in_to_expr4661); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            L_downto473_tree = (CommonTree)adaptor.create(L_downto473);
                            root_0 = (CommonTree)adaptor.becomeRoot(L_downto473_tree, root_0);
                            }

                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:685:54: ( NL )?
                    int alt209=2;
                    int LA209_0 = input.LA(1);

                    if ( (LA209_0==NL) ) {
                        alt209=1;
                    }
                    switch (alt209) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:685:54: NL
                            {
                            NL474=(Token)match(input,NL,FOLLOW_NL_in_to_expr4665); if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_arith_plus_expr_in_to_expr4669);
                    arith_plus_expr475=arith_plus_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arith_plus_expr475.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:687:1: p_to_expr : p_arith_plus_expr ( ( NL )? ( L_to | L_downto ) ( NL )? p_arith_plus_expr )? ;
    public final babel17Parser.p_to_expr_return p_to_expr() throws RecognitionException {
        babel17Parser.p_to_expr_return retval = new babel17Parser.p_to_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL477=null;
        Token L_to478=null;
        Token L_downto479=null;
        Token NL480=null;
        babel17Parser.p_arith_plus_expr_return p_arith_plus_expr476 = null;

        babel17Parser.p_arith_plus_expr_return p_arith_plus_expr481 = null;


        CommonTree NL477_tree=null;
        CommonTree L_to478_tree=null;
        CommonTree L_downto479_tree=null;
        CommonTree NL480_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:688:2: ( p_arith_plus_expr ( ( NL )? ( L_to | L_downto ) ( NL )? p_arith_plus_expr )? )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:688:4: p_arith_plus_expr ( ( NL )? ( L_to | L_downto ) ( NL )? p_arith_plus_expr )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_arith_plus_expr_in_p_to_expr4682);
            p_arith_plus_expr476=p_arith_plus_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_arith_plus_expr476.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:688:22: ( ( NL )? ( L_to | L_downto ) ( NL )? p_arith_plus_expr )?
            int alt214=2;
            int LA214_0 = input.LA(1);

            if ( (LA214_0==NL) ) {
                int LA214_1 = input.LA(2);

                if ( ((LA214_1>=L_to && LA214_1<=L_downto)) ) {
                    alt214=1;
                }
            }
            else if ( ((LA214_0>=L_to && LA214_0<=L_downto)) ) {
                alt214=1;
            }
            switch (alt214) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:688:23: ( NL )? ( L_to | L_downto ) ( NL )? p_arith_plus_expr
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:688:25: ( NL )?
                    int alt211=2;
                    int LA211_0 = input.LA(1);

                    if ( (LA211_0==NL) ) {
                        alt211=1;
                    }
                    switch (alt211) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:688:25: NL
                            {
                            NL477=(Token)match(input,NL,FOLLOW_NL_in_p_to_expr4685); if (state.failed) return retval;

                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:688:28: ( L_to | L_downto )
                    int alt212=2;
                    int LA212_0 = input.LA(1);

                    if ( (LA212_0==L_to) ) {
                        alt212=1;
                    }
                    else if ( (LA212_0==L_downto) ) {
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
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:688:29: L_to
                            {
                            L_to478=(Token)match(input,L_to,FOLLOW_L_to_in_p_to_expr4690); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            L_to478_tree = (CommonTree)adaptor.create(L_to478);
                            root_0 = (CommonTree)adaptor.becomeRoot(L_to478_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:688:36: L_downto
                            {
                            L_downto479=(Token)match(input,L_downto,FOLLOW_L_downto_in_p_to_expr4694); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            L_downto479_tree = (CommonTree)adaptor.create(L_downto479);
                            root_0 = (CommonTree)adaptor.becomeRoot(L_downto479_tree, root_0);
                            }

                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:688:49: ( NL )?
                    int alt213=2;
                    int LA213_0 = input.LA(1);

                    if ( (LA213_0==NL) ) {
                        alt213=1;
                    }
                    switch (alt213) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:688:49: NL
                            {
                            NL480=(Token)match(input,NL,FOLLOW_NL_in_p_to_expr4698); if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_p_arith_plus_expr_in_p_to_expr4702);
                    p_arith_plus_expr481=p_arith_plus_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_arith_plus_expr481.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:690:1: arith_plus_expr : arith_uminus_expr ( ( ( NL )? PLUS | MINUS ) ( NL )? arith_uminus_expr )* ;
    public final babel17Parser.arith_plus_expr_return arith_plus_expr() throws RecognitionException {
        babel17Parser.arith_plus_expr_return retval = new babel17Parser.arith_plus_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL483=null;
        Token PLUS484=null;
        Token MINUS485=null;
        Token NL486=null;
        babel17Parser.arith_uminus_expr_return arith_uminus_expr482 = null;

        babel17Parser.arith_uminus_expr_return arith_uminus_expr487 = null;


        CommonTree NL483_tree=null;
        CommonTree PLUS484_tree=null;
        CommonTree MINUS485_tree=null;
        CommonTree NL486_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:691:2: ( arith_uminus_expr ( ( ( NL )? PLUS | MINUS ) ( NL )? arith_uminus_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:691:4: arith_uminus_expr ( ( ( NL )? PLUS | MINUS ) ( NL )? arith_uminus_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_arith_uminus_expr_in_arith_plus_expr4714);
            arith_uminus_expr482=arith_uminus_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, arith_uminus_expr482.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:691:22: ( ( ( NL )? PLUS | MINUS ) ( NL )? arith_uminus_expr )*
            loop218:
            do {
                int alt218=2;
                int LA218_0 = input.LA(1);

                if ( (LA218_0==NL) ) {
                    int LA218_1 = input.LA(2);

                    if ( (LA218_1==PLUS) ) {
                        alt218=1;
                    }


                }
                else if ( ((LA218_0>=PLUS && LA218_0<=MINUS)) ) {
                    alt218=1;
                }


                switch (alt218) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:691:23: ( ( NL )? PLUS | MINUS ) ( NL )? arith_uminus_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:691:23: ( ( NL )? PLUS | MINUS )
            	    int alt216=2;
            	    int LA216_0 = input.LA(1);

            	    if ( (LA216_0==PLUS||LA216_0==NL) ) {
            	        alt216=1;
            	    }
            	    else if ( (LA216_0==MINUS) ) {
            	        alt216=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 216, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt216) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:691:24: ( NL )? PLUS
            	            {
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:691:26: ( NL )?
            	            int alt215=2;
            	            int LA215_0 = input.LA(1);

            	            if ( (LA215_0==NL) ) {
            	                alt215=1;
            	            }
            	            switch (alt215) {
            	                case 1 :
            	                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:691:26: NL
            	                    {
            	                    NL483=(Token)match(input,NL,FOLLOW_NL_in_arith_plus_expr4718); if (state.failed) return retval;

            	                    }
            	                    break;

            	            }

            	            PLUS484=(Token)match(input,PLUS,FOLLOW_PLUS_in_arith_plus_expr4722); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PLUS484_tree = (CommonTree)adaptor.create(PLUS484);
            	            root_0 = (CommonTree)adaptor.becomeRoot(PLUS484_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:691:37: MINUS
            	            {
            	            MINUS485=(Token)match(input,MINUS,FOLLOW_MINUS_in_arith_plus_expr4727); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            MINUS485_tree = (CommonTree)adaptor.create(MINUS485);
            	            root_0 = (CommonTree)adaptor.becomeRoot(MINUS485_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:691:47: ( NL )?
            	    int alt217=2;
            	    int LA217_0 = input.LA(1);

            	    if ( (LA217_0==NL) ) {
            	        alt217=1;
            	    }
            	    switch (alt217) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:691:47: NL
            	            {
            	            NL486=(Token)match(input,NL,FOLLOW_NL_in_arith_plus_expr4731); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_arith_uminus_expr_in_arith_plus_expr4735);
            	    arith_uminus_expr487=arith_uminus_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, arith_uminus_expr487.getTree());

            	    }
            	    break;

            	default :
            	    break loop218;
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:693:1: p_arith_plus_expr : p_arith_uminus_expr ( ( NL )? ( PLUS | MINUS ) ( NL )? p_arith_uminus_expr )* ;
    public final babel17Parser.p_arith_plus_expr_return p_arith_plus_expr() throws RecognitionException {
        babel17Parser.p_arith_plus_expr_return retval = new babel17Parser.p_arith_plus_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL489=null;
        Token set490=null;
        Token NL491=null;
        babel17Parser.p_arith_uminus_expr_return p_arith_uminus_expr488 = null;

        babel17Parser.p_arith_uminus_expr_return p_arith_uminus_expr492 = null;


        CommonTree NL489_tree=null;
        CommonTree set490_tree=null;
        CommonTree NL491_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:694:2: ( p_arith_uminus_expr ( ( NL )? ( PLUS | MINUS ) ( NL )? p_arith_uminus_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:694:4: p_arith_uminus_expr ( ( NL )? ( PLUS | MINUS ) ( NL )? p_arith_uminus_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_arith_uminus_expr_in_p_arith_plus_expr4746);
            p_arith_uminus_expr488=p_arith_uminus_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_arith_uminus_expr488.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:694:24: ( ( NL )? ( PLUS | MINUS ) ( NL )? p_arith_uminus_expr )*
            loop221:
            do {
                int alt221=2;
                int LA221_0 = input.LA(1);

                if ( (LA221_0==NL) ) {
                    int LA221_1 = input.LA(2);

                    if ( ((LA221_1>=PLUS && LA221_1<=MINUS)) ) {
                        alt221=1;
                    }


                }
                else if ( ((LA221_0>=PLUS && LA221_0<=MINUS)) ) {
                    alt221=1;
                }


                switch (alt221) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:694:25: ( NL )? ( PLUS | MINUS ) ( NL )? p_arith_uminus_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:694:27: ( NL )?
            	    int alt219=2;
            	    int LA219_0 = input.LA(1);

            	    if ( (LA219_0==NL) ) {
            	        alt219=1;
            	    }
            	    switch (alt219) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:694:27: NL
            	            {
            	            NL489=(Token)match(input,NL,FOLLOW_NL_in_p_arith_plus_expr4749); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    set490=(Token)input.LT(1);
            	    set490=(Token)input.LT(1);
            	    if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set490), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:694:48: ( NL )?
            	    int alt220=2;
            	    int LA220_0 = input.LA(1);

            	    if ( (LA220_0==NL) ) {
            	        alt220=1;
            	    }
            	    switch (alt220) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:694:48: NL
            	            {
            	            NL491=(Token)match(input,NL,FOLLOW_NL_in_p_arith_plus_expr4762); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_arith_uminus_expr_in_p_arith_plus_expr4766);
            	    p_arith_uminus_expr492=p_arith_uminus_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_arith_uminus_expr492.getTree());

            	    }
            	    break;

            	default :
            	    break loop221;
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:696:1: arith_uminus_expr : ( MINUS ( NL )? arith_mult_expr -> ^( UMINUS arith_mult_expr ) | arith_mult_expr );
    public final babel17Parser.arith_uminus_expr_return arith_uminus_expr() throws RecognitionException {
        babel17Parser.arith_uminus_expr_return retval = new babel17Parser.arith_uminus_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token MINUS493=null;
        Token NL494=null;
        babel17Parser.arith_mult_expr_return arith_mult_expr495 = null;

        babel17Parser.arith_mult_expr_return arith_mult_expr496 = null;


        CommonTree MINUS493_tree=null;
        CommonTree NL494_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleSubtreeStream stream_arith_mult_expr=new RewriteRuleSubtreeStream(adaptor,"rule arith_mult_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:697:2: ( MINUS ( NL )? arith_mult_expr -> ^( UMINUS arith_mult_expr ) | arith_mult_expr )
            int alt223=2;
            int LA223_0 = input.LA(1);

            if ( (LA223_0==MINUS) ) {
                alt223=1;
            }
            else if ( (LA223_0==L_begin||(LA223_0>=L_with && LA223_0<=L_if)||(LA223_0>=L_while && LA223_0<=L_for)||LA223_0==L_match||LA223_0==L_try||(LA223_0>=A_infinity && LA223_0<=U_infinity)||(LA223_0>=L_true && LA223_0<=L_this)||LA223_0==L_nil||(LA223_0>=Constr && LA223_0<=Num)||(LA223_0>=String && LA223_0<=ROUND_BRACKET_OPEN)||LA223_0==SQUARE_BRACKET_OPEN||LA223_0==CURLY_BRACKET_OPEN) ) {
                alt223=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 223, 0, input);

                throw nvae;
            }
            switch (alt223) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:697:4: MINUS ( NL )? arith_mult_expr
                    {
                    MINUS493=(Token)match(input,MINUS,FOLLOW_MINUS_in_arith_uminus_expr4779); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(MINUS493);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:697:10: ( NL )?
                    int alt222=2;
                    int LA222_0 = input.LA(1);

                    if ( (LA222_0==NL) ) {
                        alt222=1;
                    }
                    switch (alt222) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:697:10: NL
                            {
                            NL494=(Token)match(input,NL,FOLLOW_NL_in_arith_uminus_expr4781); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL494);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_arith_mult_expr_in_arith_uminus_expr4784);
                    arith_mult_expr495=arith_mult_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_arith_mult_expr.add(arith_mult_expr495.getTree());


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
                    // 697:30: -> ^( UMINUS arith_mult_expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:697:33: ^( UMINUS arith_mult_expr )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:698:4: arith_mult_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_arith_mult_expr_in_arith_uminus_expr4797);
                    arith_mult_expr496=arith_mult_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arith_mult_expr496.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:700:1: p_arith_uminus_expr : ( MINUS ( NL )? p_arith_mult_expr -> ^( UMINUS p_arith_mult_expr ) | p_arith_mult_expr );
    public final babel17Parser.p_arith_uminus_expr_return p_arith_uminus_expr() throws RecognitionException {
        babel17Parser.p_arith_uminus_expr_return retval = new babel17Parser.p_arith_uminus_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token MINUS497=null;
        Token NL498=null;
        babel17Parser.p_arith_mult_expr_return p_arith_mult_expr499 = null;

        babel17Parser.p_arith_mult_expr_return p_arith_mult_expr500 = null;


        CommonTree MINUS497_tree=null;
        CommonTree NL498_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleSubtreeStream stream_p_arith_mult_expr=new RewriteRuleSubtreeStream(adaptor,"rule p_arith_mult_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:701:2: ( MINUS ( NL )? p_arith_mult_expr -> ^( UMINUS p_arith_mult_expr ) | p_arith_mult_expr )
            int alt225=2;
            int LA225_0 = input.LA(1);

            if ( (LA225_0==MINUS) ) {
                alt225=1;
            }
            else if ( (LA225_0==L_begin||(LA225_0>=L_with && LA225_0<=L_if)||(LA225_0>=L_while && LA225_0<=L_for)||LA225_0==L_match||LA225_0==L_try||(LA225_0>=A_infinity && LA225_0<=U_infinity)||(LA225_0>=L_true && LA225_0<=L_this)||LA225_0==L_nil||(LA225_0>=Constr && LA225_0<=Num)||(LA225_0>=String && LA225_0<=ROUND_BRACKET_OPEN)||LA225_0==SQUARE_BRACKET_OPEN||LA225_0==CURLY_BRACKET_OPEN) ) {
                alt225=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 225, 0, input);

                throw nvae;
            }
            switch (alt225) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:701:4: MINUS ( NL )? p_arith_mult_expr
                    {
                    MINUS497=(Token)match(input,MINUS,FOLLOW_MINUS_in_p_arith_uminus_expr4808); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(MINUS497);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:701:10: ( NL )?
                    int alt224=2;
                    int LA224_0 = input.LA(1);

                    if ( (LA224_0==NL) ) {
                        alt224=1;
                    }
                    switch (alt224) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:701:10: NL
                            {
                            NL498=(Token)match(input,NL,FOLLOW_NL_in_p_arith_uminus_expr4810); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL498);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_p_arith_mult_expr_in_p_arith_uminus_expr4813);
                    p_arith_mult_expr499=p_arith_mult_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_p_arith_mult_expr.add(p_arith_mult_expr499.getTree());


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
                    // 701:32: -> ^( UMINUS p_arith_mult_expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:701:35: ^( UMINUS p_arith_mult_expr )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:702:4: p_arith_mult_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_p_arith_mult_expr_in_p_arith_uminus_expr4826);
                    p_arith_mult_expr500=p_arith_mult_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_arith_mult_expr500.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:704:1: arith_mult_expr : arith_pow_expr ( ( NL )? ( TIMES | QUOTIENT | L_div | L_mod ) ( NL )? arith_pow_expr )* ;
    public final babel17Parser.arith_mult_expr_return arith_mult_expr() throws RecognitionException {
        babel17Parser.arith_mult_expr_return retval = new babel17Parser.arith_mult_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL502=null;
        Token set503=null;
        Token NL504=null;
        babel17Parser.arith_pow_expr_return arith_pow_expr501 = null;

        babel17Parser.arith_pow_expr_return arith_pow_expr505 = null;


        CommonTree NL502_tree=null;
        CommonTree set503_tree=null;
        CommonTree NL504_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:705:2: ( arith_pow_expr ( ( NL )? ( TIMES | QUOTIENT | L_div | L_mod ) ( NL )? arith_pow_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:705:4: arith_pow_expr ( ( NL )? ( TIMES | QUOTIENT | L_div | L_mod ) ( NL )? arith_pow_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_arith_pow_expr_in_arith_mult_expr4835);
            arith_pow_expr501=arith_pow_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, arith_pow_expr501.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:705:19: ( ( NL )? ( TIMES | QUOTIENT | L_div | L_mod ) ( NL )? arith_pow_expr )*
            loop228:
            do {
                int alt228=2;
                int LA228_0 = input.LA(1);

                if ( (LA228_0==NL) ) {
                    int LA228_1 = input.LA(2);

                    if ( ((LA228_1>=L_div && LA228_1<=L_mod)||(LA228_1>=TIMES && LA228_1<=QUOTIENT)) ) {
                        alt228=1;
                    }


                }
                else if ( ((LA228_0>=L_div && LA228_0<=L_mod)||(LA228_0>=TIMES && LA228_0<=QUOTIENT)) ) {
                    alt228=1;
                }


                switch (alt228) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:705:20: ( NL )? ( TIMES | QUOTIENT | L_div | L_mod ) ( NL )? arith_pow_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:705:22: ( NL )?
            	    int alt226=2;
            	    int LA226_0 = input.LA(1);

            	    if ( (LA226_0==NL) ) {
            	        alt226=1;
            	    }
            	    switch (alt226) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:705:22: NL
            	            {
            	            NL502=(Token)match(input,NL,FOLLOW_NL_in_arith_mult_expr4838); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    set503=(Token)input.LT(1);
            	    set503=(Token)input.LT(1);
            	    if ( (input.LA(1)>=L_div && input.LA(1)<=L_mod)||(input.LA(1)>=TIMES && input.LA(1)<=QUOTIENT) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set503), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:705:63: ( NL )?
            	    int alt227=2;
            	    int LA227_0 = input.LA(1);

            	    if ( (LA227_0==NL) ) {
            	        alt227=1;
            	    }
            	    switch (alt227) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:705:63: NL
            	            {
            	            NL504=(Token)match(input,NL,FOLLOW_NL_in_arith_mult_expr4859); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_arith_pow_expr_in_arith_mult_expr4863);
            	    arith_pow_expr505=arith_pow_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, arith_pow_expr505.getTree());

            	    }
            	    break;

            	default :
            	    break loop228;
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:707:1: p_arith_mult_expr : p_arith_pow_expr ( ( NL )? ( TIMES | QUOTIENT | L_div | L_mod ) ( NL )? p_arith_pow_expr )* ;
    public final babel17Parser.p_arith_mult_expr_return p_arith_mult_expr() throws RecognitionException {
        babel17Parser.p_arith_mult_expr_return retval = new babel17Parser.p_arith_mult_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL507=null;
        Token set508=null;
        Token NL509=null;
        babel17Parser.p_arith_pow_expr_return p_arith_pow_expr506 = null;

        babel17Parser.p_arith_pow_expr_return p_arith_pow_expr510 = null;


        CommonTree NL507_tree=null;
        CommonTree set508_tree=null;
        CommonTree NL509_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:708:2: ( p_arith_pow_expr ( ( NL )? ( TIMES | QUOTIENT | L_div | L_mod ) ( NL )? p_arith_pow_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:708:4: p_arith_pow_expr ( ( NL )? ( TIMES | QUOTIENT | L_div | L_mod ) ( NL )? p_arith_pow_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_arith_pow_expr_in_p_arith_mult_expr4875);
            p_arith_pow_expr506=p_arith_pow_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_arith_pow_expr506.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:708:21: ( ( NL )? ( TIMES | QUOTIENT | L_div | L_mod ) ( NL )? p_arith_pow_expr )*
            loop231:
            do {
                int alt231=2;
                int LA231_0 = input.LA(1);

                if ( (LA231_0==NL) ) {
                    int LA231_1 = input.LA(2);

                    if ( ((LA231_1>=L_div && LA231_1<=L_mod)||(LA231_1>=TIMES && LA231_1<=QUOTIENT)) ) {
                        alt231=1;
                    }


                }
                else if ( ((LA231_0>=L_div && LA231_0<=L_mod)||(LA231_0>=TIMES && LA231_0<=QUOTIENT)) ) {
                    alt231=1;
                }


                switch (alt231) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:708:22: ( NL )? ( TIMES | QUOTIENT | L_div | L_mod ) ( NL )? p_arith_pow_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:708:24: ( NL )?
            	    int alt229=2;
            	    int LA229_0 = input.LA(1);

            	    if ( (LA229_0==NL) ) {
            	        alt229=1;
            	    }
            	    switch (alt229) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:708:24: NL
            	            {
            	            NL507=(Token)match(input,NL,FOLLOW_NL_in_p_arith_mult_expr4878); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    set508=(Token)input.LT(1);
            	    set508=(Token)input.LT(1);
            	    if ( (input.LA(1)>=L_div && input.LA(1)<=L_mod)||(input.LA(1)>=TIMES && input.LA(1)<=QUOTIENT) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set508), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:708:65: ( NL )?
            	    int alt230=2;
            	    int LA230_0 = input.LA(1);

            	    if ( (LA230_0==NL) ) {
            	        alt230=1;
            	    }
            	    switch (alt230) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:708:65: NL
            	            {
            	            NL509=(Token)match(input,NL,FOLLOW_NL_in_p_arith_mult_expr4899); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_arith_pow_expr_in_p_arith_mult_expr4903);
            	    p_arith_pow_expr510=p_arith_pow_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_arith_pow_expr510.getTree());

            	    }
            	    break;

            	default :
            	    break loop231;
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:710:1: arith_pow_expr : apply_expr ( ( NL )? POW_tok ( NL )? apply_expr )* -> ^( POW ( apply_expr )* ) ;
    public final babel17Parser.arith_pow_expr_return arith_pow_expr() throws RecognitionException {
        babel17Parser.arith_pow_expr_return retval = new babel17Parser.arith_pow_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL512=null;
        Token POW_tok513=null;
        Token NL514=null;
        babel17Parser.apply_expr_return apply_expr511 = null;

        babel17Parser.apply_expr_return apply_expr515 = null;


        CommonTree NL512_tree=null;
        CommonTree POW_tok513_tree=null;
        CommonTree NL514_tree=null;
        RewriteRuleTokenStream stream_POW_tok=new RewriteRuleTokenStream(adaptor,"token POW_tok");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_apply_expr=new RewriteRuleSubtreeStream(adaptor,"rule apply_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:711:2: ( apply_expr ( ( NL )? POW_tok ( NL )? apply_expr )* -> ^( POW ( apply_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:711:4: apply_expr ( ( NL )? POW_tok ( NL )? apply_expr )*
            {
            pushFollow(FOLLOW_apply_expr_in_arith_pow_expr4914);
            apply_expr511=apply_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_apply_expr.add(apply_expr511.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:711:15: ( ( NL )? POW_tok ( NL )? apply_expr )*
            loop234:
            do {
                int alt234=2;
                int LA234_0 = input.LA(1);

                if ( (LA234_0==NL) ) {
                    int LA234_1 = input.LA(2);

                    if ( (LA234_1==POW_tok) ) {
                        alt234=1;
                    }


                }
                else if ( (LA234_0==POW_tok) ) {
                    alt234=1;
                }


                switch (alt234) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:711:16: ( NL )? POW_tok ( NL )? apply_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:711:16: ( NL )?
            	    int alt232=2;
            	    int LA232_0 = input.LA(1);

            	    if ( (LA232_0==NL) ) {
            	        alt232=1;
            	    }
            	    switch (alt232) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:711:16: NL
            	            {
            	            NL512=(Token)match(input,NL,FOLLOW_NL_in_arith_pow_expr4917); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL512);


            	            }
            	            break;

            	    }

            	    POW_tok513=(Token)match(input,POW_tok,FOLLOW_POW_tok_in_arith_pow_expr4920); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_POW_tok.add(POW_tok513);

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:711:28: ( NL )?
            	    int alt233=2;
            	    int LA233_0 = input.LA(1);

            	    if ( (LA233_0==NL) ) {
            	        alt233=1;
            	    }
            	    switch (alt233) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:711:28: NL
            	            {
            	            NL514=(Token)match(input,NL,FOLLOW_NL_in_arith_pow_expr4922); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL514);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_apply_expr_in_arith_pow_expr4925);
            	    apply_expr515=apply_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_apply_expr.add(apply_expr515.getTree());

            	    }
            	    break;

            	default :
            	    break loop234;
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
            // 711:45: -> ^( POW ( apply_expr )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:711:48: ^( POW ( apply_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(POW, "POW"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:711:54: ( apply_expr )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:713:1: p_arith_pow_expr : p_apply_expr ( ( NL )? POW_tok ( NL )? p_apply_expr )* -> ^( POW ( p_apply_expr )* ) ;
    public final babel17Parser.p_arith_pow_expr_return p_arith_pow_expr() throws RecognitionException {
        babel17Parser.p_arith_pow_expr_return retval = new babel17Parser.p_arith_pow_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL517=null;
        Token POW_tok518=null;
        Token NL519=null;
        babel17Parser.p_apply_expr_return p_apply_expr516 = null;

        babel17Parser.p_apply_expr_return p_apply_expr520 = null;


        CommonTree NL517_tree=null;
        CommonTree POW_tok518_tree=null;
        CommonTree NL519_tree=null;
        RewriteRuleTokenStream stream_POW_tok=new RewriteRuleTokenStream(adaptor,"token POW_tok");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_p_apply_expr=new RewriteRuleSubtreeStream(adaptor,"rule p_apply_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:714:2: ( p_apply_expr ( ( NL )? POW_tok ( NL )? p_apply_expr )* -> ^( POW ( p_apply_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:714:4: p_apply_expr ( ( NL )? POW_tok ( NL )? p_apply_expr )*
            {
            pushFollow(FOLLOW_p_apply_expr_in_p_arith_pow_expr4946);
            p_apply_expr516=p_apply_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_p_apply_expr.add(p_apply_expr516.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:714:17: ( ( NL )? POW_tok ( NL )? p_apply_expr )*
            loop237:
            do {
                int alt237=2;
                int LA237_0 = input.LA(1);

                if ( (LA237_0==NL) ) {
                    int LA237_1 = input.LA(2);

                    if ( (LA237_1==POW_tok) ) {
                        alt237=1;
                    }


                }
                else if ( (LA237_0==POW_tok) ) {
                    alt237=1;
                }


                switch (alt237) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:714:18: ( NL )? POW_tok ( NL )? p_apply_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:714:18: ( NL )?
            	    int alt235=2;
            	    int LA235_0 = input.LA(1);

            	    if ( (LA235_0==NL) ) {
            	        alt235=1;
            	    }
            	    switch (alt235) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:714:18: NL
            	            {
            	            NL517=(Token)match(input,NL,FOLLOW_NL_in_p_arith_pow_expr4949); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL517);


            	            }
            	            break;

            	    }

            	    POW_tok518=(Token)match(input,POW_tok,FOLLOW_POW_tok_in_p_arith_pow_expr4952); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_POW_tok.add(POW_tok518);

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:714:30: ( NL )?
            	    int alt236=2;
            	    int LA236_0 = input.LA(1);

            	    if ( (LA236_0==NL) ) {
            	        alt236=1;
            	    }
            	    switch (alt236) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:714:30: NL
            	            {
            	            NL519=(Token)match(input,NL,FOLLOW_NL_in_p_arith_pow_expr4954); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL519);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_apply_expr_in_p_arith_pow_expr4957);
            	    p_apply_expr520=p_apply_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_p_apply_expr.add(p_apply_expr520.getTree());

            	    }
            	    break;

            	default :
            	    break loop237;
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
            // 714:49: -> ^( POW ( p_apply_expr )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:714:52: ^( POW ( p_apply_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(POW, "POW"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:714:58: ( p_apply_expr )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:716:1: apply_expr : ( basic_expr )+ -> ^( APPLY ( basic_expr )* ) ;
    public final babel17Parser.apply_expr_return apply_expr() throws RecognitionException {
        babel17Parser.apply_expr_return retval = new babel17Parser.apply_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.basic_expr_return basic_expr521 = null;


        RewriteRuleSubtreeStream stream_basic_expr=new RewriteRuleSubtreeStream(adaptor,"rule basic_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:717:2: ( ( basic_expr )+ -> ^( APPLY ( basic_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:717:4: ( basic_expr )+
            {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:717:4: ( basic_expr )+
            int cnt238=0;
            loop238:
            do {
                int alt238=2;
                int LA238_0 = input.LA(1);

                if ( (LA238_0==L_begin||(LA238_0>=L_with && LA238_0<=L_if)||(LA238_0>=L_while && LA238_0<=L_for)||LA238_0==L_match||LA238_0==L_try||(LA238_0>=A_infinity && LA238_0<=U_infinity)||(LA238_0>=L_true && LA238_0<=L_this)||LA238_0==L_nil||(LA238_0>=Constr && LA238_0<=Num)||(LA238_0>=String && LA238_0<=ROUND_BRACKET_OPEN)||LA238_0==SQUARE_BRACKET_OPEN||LA238_0==CURLY_BRACKET_OPEN) ) {
                    alt238=1;
                }


                switch (alt238) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:717:4: basic_expr
            	    {
            	    pushFollow(FOLLOW_basic_expr_in_apply_expr4978);
            	    basic_expr521=basic_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_basic_expr.add(basic_expr521.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt238 >= 1 ) break loop238;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(238, input);
                        throw eee;
                }
                cnt238++;
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
            // 717:16: -> ^( APPLY ( basic_expr )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:717:19: ^( APPLY ( basic_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(APPLY, "APPLY"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:717:27: ( basic_expr )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:718:1: p_apply_expr : p_basic_expr ( ( NL )? p_basic_expr )* -> ^( APPLY ( p_basic_expr )* ) ;
    public final babel17Parser.p_apply_expr_return p_apply_expr() throws RecognitionException {
        babel17Parser.p_apply_expr_return retval = new babel17Parser.p_apply_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL523=null;
        babel17Parser.p_basic_expr_return p_basic_expr522 = null;

        babel17Parser.p_basic_expr_return p_basic_expr524 = null;


        CommonTree NL523_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_p_basic_expr=new RewriteRuleSubtreeStream(adaptor,"rule p_basic_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:719:2: ( p_basic_expr ( ( NL )? p_basic_expr )* -> ^( APPLY ( p_basic_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:719:4: p_basic_expr ( ( NL )? p_basic_expr )*
            {
            pushFollow(FOLLOW_p_basic_expr_in_p_apply_expr4996);
            p_basic_expr522=p_basic_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_p_basic_expr.add(p_basic_expr522.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:719:17: ( ( NL )? p_basic_expr )*
            loop240:
            do {
                int alt240=2;
                int LA240_0 = input.LA(1);

                if ( (LA240_0==NL) ) {
                    int LA240_1 = input.LA(2);

                    if ( (LA240_1==L_begin||(LA240_1>=L_with && LA240_1<=L_if)||(LA240_1>=L_while && LA240_1<=L_for)||LA240_1==L_match||LA240_1==L_try||(LA240_1>=A_infinity && LA240_1<=U_infinity)||(LA240_1>=L_true && LA240_1<=L_this)||LA240_1==L_nil||(LA240_1>=Constr && LA240_1<=Num)||(LA240_1>=String && LA240_1<=ROUND_BRACKET_OPEN)||LA240_1==SQUARE_BRACKET_OPEN||LA240_1==CURLY_BRACKET_OPEN) ) {
                        alt240=1;
                    }


                }
                else if ( (LA240_0==L_begin||(LA240_0>=L_with && LA240_0<=L_if)||(LA240_0>=L_while && LA240_0<=L_for)||LA240_0==L_match||LA240_0==L_try||(LA240_0>=A_infinity && LA240_0<=U_infinity)||(LA240_0>=L_true && LA240_0<=L_this)||LA240_0==L_nil||(LA240_0>=Constr && LA240_0<=Num)||(LA240_0>=String && LA240_0<=ROUND_BRACKET_OPEN)||LA240_0==SQUARE_BRACKET_OPEN||LA240_0==CURLY_BRACKET_OPEN) ) {
                    alt240=1;
                }


                switch (alt240) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:719:18: ( NL )? p_basic_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:719:18: ( NL )?
            	    int alt239=2;
            	    int LA239_0 = input.LA(1);

            	    if ( (LA239_0==NL) ) {
            	        alt239=1;
            	    }
            	    switch (alt239) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:719:18: NL
            	            {
            	            NL523=(Token)match(input,NL,FOLLOW_NL_in_p_apply_expr4999); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL523);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_basic_expr_in_p_apply_expr5002);
            	    p_basic_expr524=p_basic_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_p_basic_expr.add(p_basic_expr524.getTree());

            	    }
            	    break;

            	default :
            	    break loop240;
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
            // 719:37: -> ^( APPLY ( p_basic_expr )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:719:40: ^( APPLY ( p_basic_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(APPLY, "APPLY"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:719:48: ( p_basic_expr )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:721:1: basic_expr : message_send_expr ;
    public final babel17Parser.basic_expr_return basic_expr() throws RecognitionException {
        babel17Parser.basic_expr_return retval = new babel17Parser.basic_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.message_send_expr_return message_send_expr525 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:722:2: ( message_send_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:722:4: message_send_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_message_send_expr_in_basic_expr5022);
            message_send_expr525=message_send_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, message_send_expr525.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:724:1: p_basic_expr : message_send_expr ;
    public final babel17Parser.p_basic_expr_return p_basic_expr() throws RecognitionException {
        babel17Parser.p_basic_expr_return retval = new babel17Parser.p_basic_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.message_send_expr_return message_send_expr526 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:725:2: ( message_send_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:725:4: message_send_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_message_send_expr_in_p_basic_expr5031);
            message_send_expr526=message_send_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, message_send_expr526.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:727:1: message_send_expr : primitive_expr ( ( NL )? PERIOD ( NL )? Id )* -> ^( MESSAGE_SEND primitive_expr ( Id )* ) ;
    public final babel17Parser.message_send_expr_return message_send_expr() throws RecognitionException {
        babel17Parser.message_send_expr_return retval = new babel17Parser.message_send_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL528=null;
        Token PERIOD529=null;
        Token NL530=null;
        Token Id531=null;
        babel17Parser.primitive_expr_return primitive_expr527 = null;


        CommonTree NL528_tree=null;
        CommonTree PERIOD529_tree=null;
        CommonTree NL530_tree=null;
        CommonTree Id531_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
        RewriteRuleTokenStream stream_Id=new RewriteRuleTokenStream(adaptor,"token Id");
        RewriteRuleSubtreeStream stream_primitive_expr=new RewriteRuleSubtreeStream(adaptor,"rule primitive_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:728:2: ( primitive_expr ( ( NL )? PERIOD ( NL )? Id )* -> ^( MESSAGE_SEND primitive_expr ( Id )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:728:4: primitive_expr ( ( NL )? PERIOD ( NL )? Id )*
            {
            pushFollow(FOLLOW_primitive_expr_in_message_send_expr5040);
            primitive_expr527=primitive_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_primitive_expr.add(primitive_expr527.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:728:19: ( ( NL )? PERIOD ( NL )? Id )*
            loop243:
            do {
                int alt243=2;
                int LA243_0 = input.LA(1);

                if ( (LA243_0==NL) ) {
                    int LA243_1 = input.LA(2);

                    if ( (LA243_1==PERIOD) ) {
                        alt243=1;
                    }


                }
                else if ( (LA243_0==PERIOD) ) {
                    alt243=1;
                }


                switch (alt243) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:728:20: ( NL )? PERIOD ( NL )? Id
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:728:20: ( NL )?
            	    int alt241=2;
            	    int LA241_0 = input.LA(1);

            	    if ( (LA241_0==NL) ) {
            	        alt241=1;
            	    }
            	    switch (alt241) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:728:20: NL
            	            {
            	            NL528=(Token)match(input,NL,FOLLOW_NL_in_message_send_expr5043); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL528);


            	            }
            	            break;

            	    }

            	    PERIOD529=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_message_send_expr5046); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD529);

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:728:31: ( NL )?
            	    int alt242=2;
            	    int LA242_0 = input.LA(1);

            	    if ( (LA242_0==NL) ) {
            	        alt242=1;
            	    }
            	    switch (alt242) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:728:31: NL
            	            {
            	            NL530=(Token)match(input,NL,FOLLOW_NL_in_message_send_expr5048); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL530);


            	            }
            	            break;

            	    }

            	    Id531=(Token)match(input,Id,FOLLOW_Id_in_message_send_expr5051); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_Id.add(Id531);


            	    }
            	    break;

            	default :
            	    break loop243;
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
            // 728:40: -> ^( MESSAGE_SEND primitive_expr ( Id )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:728:43: ^( MESSAGE_SEND primitive_expr ( Id )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MESSAGE_SEND, "MESSAGE_SEND"), root_1);

                adaptor.addChild(root_1, stream_primitive_expr.nextTree());
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:728:73: ( Id )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:730:1: list_expr : ( '[' ( NL )? ( protected_expr_nc ( ( NL )? COMMA ( NL )? protected_expr_nc )* ( NL )? )? ']' -> ^( SQUARE_LIST ( protected_expr_nc )* ) | '(' ( NL )? ( protected_expr_nc ( ( NL )? COMMA ( NL )? protected_expr_nc )* ( NL )? ( COMMA ( NL )? )? )? ')' -> ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( protected_expr_nc )* ) ) );
    public final babel17Parser.list_expr_return list_expr() throws RecognitionException {
        babel17Parser.list_expr_return retval = new babel17Parser.list_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal532=null;
        Token NL533=null;
        Token NL535=null;
        Token COMMA536=null;
        Token NL537=null;
        Token NL539=null;
        Token char_literal540=null;
        Token char_literal541=null;
        Token NL542=null;
        Token NL544=null;
        Token COMMA545=null;
        Token NL546=null;
        Token NL548=null;
        Token COMMA549=null;
        Token NL550=null;
        Token char_literal551=null;
        babel17Parser.protected_expr_nc_return protected_expr_nc534 = null;

        babel17Parser.protected_expr_nc_return protected_expr_nc538 = null;

        babel17Parser.protected_expr_nc_return protected_expr_nc543 = null;

        babel17Parser.protected_expr_nc_return protected_expr_nc547 = null;


        CommonTree char_literal532_tree=null;
        CommonTree NL533_tree=null;
        CommonTree NL535_tree=null;
        CommonTree COMMA536_tree=null;
        CommonTree NL537_tree=null;
        CommonTree NL539_tree=null;
        CommonTree char_literal540_tree=null;
        CommonTree char_literal541_tree=null;
        CommonTree NL542_tree=null;
        CommonTree NL544_tree=null;
        CommonTree COMMA545_tree=null;
        CommonTree NL546_tree=null;
        CommonTree NL548_tree=null;
        CommonTree COMMA549_tree=null;
        CommonTree NL550_tree=null;
        CommonTree char_literal551_tree=null;
        RewriteRuleTokenStream stream_ROUND_BRACKET_OPEN=new RewriteRuleTokenStream(adaptor,"token ROUND_BRACKET_OPEN");
        RewriteRuleTokenStream stream_SQUARE_BRACKET_CLOSE=new RewriteRuleTokenStream(adaptor,"token SQUARE_BRACKET_CLOSE");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_ROUND_BRACKET_CLOSE=new RewriteRuleTokenStream(adaptor,"token ROUND_BRACKET_CLOSE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_SQUARE_BRACKET_OPEN=new RewriteRuleTokenStream(adaptor,"token SQUARE_BRACKET_OPEN");
        RewriteRuleSubtreeStream stream_protected_expr_nc=new RewriteRuleSubtreeStream(adaptor,"rule protected_expr_nc");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:731:2: ( '[' ( NL )? ( protected_expr_nc ( ( NL )? COMMA ( NL )? protected_expr_nc )* ( NL )? )? ']' -> ^( SQUARE_LIST ( protected_expr_nc )* ) | '(' ( NL )? ( protected_expr_nc ( ( NL )? COMMA ( NL )? protected_expr_nc )* ( NL )? ( COMMA ( NL )? )? )? ')' -> ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( protected_expr_nc )* ) ) )
            int alt258=2;
            int LA258_0 = input.LA(1);

            if ( (LA258_0==SQUARE_BRACKET_OPEN) ) {
                alt258=1;
            }
            else if ( (LA258_0==ROUND_BRACKET_OPEN) ) {
                alt258=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 258, 0, input);

                throw nvae;
            }
            switch (alt258) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:731:4: '[' ( NL )? ( protected_expr_nc ( ( NL )? COMMA ( NL )? protected_expr_nc )* ( NL )? )? ']'
                    {
                    char_literal532=(Token)match(input,SQUARE_BRACKET_OPEN,FOLLOW_SQUARE_BRACKET_OPEN_in_list_expr5075); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SQUARE_BRACKET_OPEN.add(char_literal532);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:731:8: ( NL )?
                    int alt244=2;
                    int LA244_0 = input.LA(1);

                    if ( (LA244_0==NL) ) {
                        alt244=1;
                    }
                    switch (alt244) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:731:8: NL
                            {
                            NL533=(Token)match(input,NL,FOLLOW_NL_in_list_expr5077); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL533);


                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:731:12: ( protected_expr_nc ( ( NL )? COMMA ( NL )? protected_expr_nc )* ( NL )? )?
                    int alt249=2;
                    int LA249_0 = input.LA(1);

                    if ( (LA249_0==L_begin||(LA249_0>=L_obj && LA249_0<=L_if)||(LA249_0>=L_while && LA249_0<=L_for)||LA249_0==L_match||LA249_0==L_exception||LA249_0==L_try||(LA249_0>=A_infinity && LA249_0<=L_lazy)||(LA249_0>=L_true && LA249_0<=L_nil)||LA249_0==L_typeof||LA249_0==MINUS||LA249_0==A_NOT||LA249_0==U_NOT||(LA249_0>=A_ELLIPSIS && LA249_0<=U_ELLIPSIS)||LA249_0==L_force||(LA249_0>=Constr && LA249_0<=Num)||(LA249_0>=String && LA249_0<=ROUND_BRACKET_OPEN)||LA249_0==SQUARE_BRACKET_OPEN||LA249_0==CURLY_BRACKET_OPEN||LA249_0==UNDERSCORE) ) {
                        alt249=1;
                    }
                    switch (alt249) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:731:13: protected_expr_nc ( ( NL )? COMMA ( NL )? protected_expr_nc )* ( NL )?
                            {
                            pushFollow(FOLLOW_protected_expr_nc_in_list_expr5081);
                            protected_expr_nc534=protected_expr_nc();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_protected_expr_nc.add(protected_expr_nc534.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:731:31: ( ( NL )? COMMA ( NL )? protected_expr_nc )*
                            loop247:
                            do {
                                int alt247=2;
                                int LA247_0 = input.LA(1);

                                if ( (LA247_0==NL) ) {
                                    int LA247_1 = input.LA(2);

                                    if ( (LA247_1==COMMA) ) {
                                        alt247=1;
                                    }


                                }
                                else if ( (LA247_0==COMMA) ) {
                                    alt247=1;
                                }


                                switch (alt247) {
                            	case 1 :
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:731:32: ( NL )? COMMA ( NL )? protected_expr_nc
                            	    {
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:731:32: ( NL )?
                            	    int alt245=2;
                            	    int LA245_0 = input.LA(1);

                            	    if ( (LA245_0==NL) ) {
                            	        alt245=1;
                            	    }
                            	    switch (alt245) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:731:32: NL
                            	            {
                            	            NL535=(Token)match(input,NL,FOLLOW_NL_in_list_expr5084); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL535);


                            	            }
                            	            break;

                            	    }

                            	    COMMA536=(Token)match(input,COMMA,FOLLOW_COMMA_in_list_expr5087); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA536);

                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:731:42: ( NL )?
                            	    int alt246=2;
                            	    int LA246_0 = input.LA(1);

                            	    if ( (LA246_0==NL) ) {
                            	        alt246=1;
                            	    }
                            	    switch (alt246) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:731:42: NL
                            	            {
                            	            NL537=(Token)match(input,NL,FOLLOW_NL_in_list_expr5089); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL537);


                            	            }
                            	            break;

                            	    }

                            	    pushFollow(FOLLOW_protected_expr_nc_in_list_expr5092);
                            	    protected_expr_nc538=protected_expr_nc();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_protected_expr_nc.add(protected_expr_nc538.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop247;
                                }
                            } while (true);

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:731:66: ( NL )?
                            int alt248=2;
                            int LA248_0 = input.LA(1);

                            if ( (LA248_0==NL) ) {
                                alt248=1;
                            }
                            switch (alt248) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:731:66: NL
                                    {
                                    NL539=(Token)match(input,NL,FOLLOW_NL_in_list_expr5096); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL539);


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    char_literal540=(Token)match(input,SQUARE_BRACKET_CLOSE,FOLLOW_SQUARE_BRACKET_CLOSE_in_list_expr5101); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SQUARE_BRACKET_CLOSE.add(char_literal540);



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
                    // 731:76: -> ^( SQUARE_LIST ( protected_expr_nc )* )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:731:79: ^( SQUARE_LIST ( protected_expr_nc )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SQUARE_LIST, "SQUARE_LIST"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:731:93: ( protected_expr_nc )*
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:732:4: '(' ( NL )? ( protected_expr_nc ( ( NL )? COMMA ( NL )? protected_expr_nc )* ( NL )? ( COMMA ( NL )? )? )? ')'
                    {
                    char_literal541=(Token)match(input,ROUND_BRACKET_OPEN,FOLLOW_ROUND_BRACKET_OPEN_in_list_expr5115); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ROUND_BRACKET_OPEN.add(char_literal541);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:732:8: ( NL )?
                    int alt250=2;
                    int LA250_0 = input.LA(1);

                    if ( (LA250_0==NL) ) {
                        alt250=1;
                    }
                    switch (alt250) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:732:8: NL
                            {
                            NL542=(Token)match(input,NL,FOLLOW_NL_in_list_expr5117); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL542);


                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:732:12: ( protected_expr_nc ( ( NL )? COMMA ( NL )? protected_expr_nc )* ( NL )? ( COMMA ( NL )? )? )?
                    int alt257=2;
                    int LA257_0 = input.LA(1);

                    if ( (LA257_0==L_begin||(LA257_0>=L_obj && LA257_0<=L_if)||(LA257_0>=L_while && LA257_0<=L_for)||LA257_0==L_match||LA257_0==L_exception||LA257_0==L_try||(LA257_0>=A_infinity && LA257_0<=L_lazy)||(LA257_0>=L_true && LA257_0<=L_nil)||LA257_0==L_typeof||LA257_0==MINUS||LA257_0==A_NOT||LA257_0==U_NOT||(LA257_0>=A_ELLIPSIS && LA257_0<=U_ELLIPSIS)||LA257_0==L_force||(LA257_0>=Constr && LA257_0<=Num)||(LA257_0>=String && LA257_0<=ROUND_BRACKET_OPEN)||LA257_0==SQUARE_BRACKET_OPEN||LA257_0==CURLY_BRACKET_OPEN||LA257_0==UNDERSCORE) ) {
                        alt257=1;
                    }
                    switch (alt257) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:732:13: protected_expr_nc ( ( NL )? COMMA ( NL )? protected_expr_nc )* ( NL )? ( COMMA ( NL )? )?
                            {
                            pushFollow(FOLLOW_protected_expr_nc_in_list_expr5121);
                            protected_expr_nc543=protected_expr_nc();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_protected_expr_nc.add(protected_expr_nc543.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:732:31: ( ( NL )? COMMA ( NL )? protected_expr_nc )*
                            loop253:
                            do {
                                int alt253=2;
                                int LA253_0 = input.LA(1);

                                if ( (LA253_0==NL) ) {
                                    int LA253_1 = input.LA(2);

                                    if ( (LA253_1==COMMA) ) {
                                        int LA253_2 = input.LA(3);

                                        if ( (LA253_2==NL) ) {
                                            int LA253_4 = input.LA(4);

                                            if ( (LA253_4==L_begin||(LA253_4>=L_obj && LA253_4<=L_if)||(LA253_4>=L_while && LA253_4<=L_for)||LA253_4==L_match||LA253_4==L_exception||LA253_4==L_try||(LA253_4>=A_infinity && LA253_4<=L_lazy)||(LA253_4>=L_true && LA253_4<=L_nil)||LA253_4==L_typeof||LA253_4==MINUS||LA253_4==A_NOT||LA253_4==U_NOT||(LA253_4>=A_ELLIPSIS && LA253_4<=U_ELLIPSIS)||LA253_4==L_force||(LA253_4>=Constr && LA253_4<=Num)||(LA253_4>=String && LA253_4<=ROUND_BRACKET_OPEN)||LA253_4==SQUARE_BRACKET_OPEN||LA253_4==CURLY_BRACKET_OPEN||LA253_4==UNDERSCORE) ) {
                                                alt253=1;
                                            }


                                        }
                                        else if ( (LA253_2==L_begin||(LA253_2>=L_obj && LA253_2<=L_if)||(LA253_2>=L_while && LA253_2<=L_for)||LA253_2==L_match||LA253_2==L_exception||LA253_2==L_try||(LA253_2>=A_infinity && LA253_2<=L_lazy)||(LA253_2>=L_true && LA253_2<=L_nil)||LA253_2==L_typeof||LA253_2==MINUS||LA253_2==A_NOT||LA253_2==U_NOT||(LA253_2>=A_ELLIPSIS && LA253_2<=U_ELLIPSIS)||LA253_2==L_force||(LA253_2>=Constr && LA253_2<=Num)||(LA253_2>=String && LA253_2<=ROUND_BRACKET_OPEN)||LA253_2==SQUARE_BRACKET_OPEN||LA253_2==CURLY_BRACKET_OPEN||LA253_2==UNDERSCORE) ) {
                                            alt253=1;
                                        }


                                    }


                                }
                                else if ( (LA253_0==COMMA) ) {
                                    int LA253_2 = input.LA(2);

                                    if ( (LA253_2==NL) ) {
                                        int LA253_4 = input.LA(3);

                                        if ( (LA253_4==L_begin||(LA253_4>=L_obj && LA253_4<=L_if)||(LA253_4>=L_while && LA253_4<=L_for)||LA253_4==L_match||LA253_4==L_exception||LA253_4==L_try||(LA253_4>=A_infinity && LA253_4<=L_lazy)||(LA253_4>=L_true && LA253_4<=L_nil)||LA253_4==L_typeof||LA253_4==MINUS||LA253_4==A_NOT||LA253_4==U_NOT||(LA253_4>=A_ELLIPSIS && LA253_4<=U_ELLIPSIS)||LA253_4==L_force||(LA253_4>=Constr && LA253_4<=Num)||(LA253_4>=String && LA253_4<=ROUND_BRACKET_OPEN)||LA253_4==SQUARE_BRACKET_OPEN||LA253_4==CURLY_BRACKET_OPEN||LA253_4==UNDERSCORE) ) {
                                            alt253=1;
                                        }


                                    }
                                    else if ( (LA253_2==L_begin||(LA253_2>=L_obj && LA253_2<=L_if)||(LA253_2>=L_while && LA253_2<=L_for)||LA253_2==L_match||LA253_2==L_exception||LA253_2==L_try||(LA253_2>=A_infinity && LA253_2<=L_lazy)||(LA253_2>=L_true && LA253_2<=L_nil)||LA253_2==L_typeof||LA253_2==MINUS||LA253_2==A_NOT||LA253_2==U_NOT||(LA253_2>=A_ELLIPSIS && LA253_2<=U_ELLIPSIS)||LA253_2==L_force||(LA253_2>=Constr && LA253_2<=Num)||(LA253_2>=String && LA253_2<=ROUND_BRACKET_OPEN)||LA253_2==SQUARE_BRACKET_OPEN||LA253_2==CURLY_BRACKET_OPEN||LA253_2==UNDERSCORE) ) {
                                        alt253=1;
                                    }


                                }


                                switch (alt253) {
                            	case 1 :
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:732:32: ( NL )? COMMA ( NL )? protected_expr_nc
                            	    {
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:732:32: ( NL )?
                            	    int alt251=2;
                            	    int LA251_0 = input.LA(1);

                            	    if ( (LA251_0==NL) ) {
                            	        alt251=1;
                            	    }
                            	    switch (alt251) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:732:32: NL
                            	            {
                            	            NL544=(Token)match(input,NL,FOLLOW_NL_in_list_expr5124); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL544);


                            	            }
                            	            break;

                            	    }

                            	    COMMA545=(Token)match(input,COMMA,FOLLOW_COMMA_in_list_expr5127); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA545);

                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:732:42: ( NL )?
                            	    int alt252=2;
                            	    int LA252_0 = input.LA(1);

                            	    if ( (LA252_0==NL) ) {
                            	        alt252=1;
                            	    }
                            	    switch (alt252) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:732:42: NL
                            	            {
                            	            NL546=(Token)match(input,NL,FOLLOW_NL_in_list_expr5129); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL546);


                            	            }
                            	            break;

                            	    }

                            	    pushFollow(FOLLOW_protected_expr_nc_in_list_expr5132);
                            	    protected_expr_nc547=protected_expr_nc();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_protected_expr_nc.add(protected_expr_nc547.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop253;
                                }
                            } while (true);

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:732:66: ( NL )?
                            int alt254=2;
                            int LA254_0 = input.LA(1);

                            if ( (LA254_0==NL) ) {
                                alt254=1;
                            }
                            switch (alt254) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:732:66: NL
                                    {
                                    NL548=(Token)match(input,NL,FOLLOW_NL_in_list_expr5136); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL548);


                                    }
                                    break;

                            }

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:732:70: ( COMMA ( NL )? )?
                            int alt256=2;
                            int LA256_0 = input.LA(1);

                            if ( (LA256_0==COMMA) ) {
                                alt256=1;
                            }
                            switch (alt256) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:732:71: COMMA ( NL )?
                                    {
                                    COMMA549=(Token)match(input,COMMA,FOLLOW_COMMA_in_list_expr5140); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_COMMA.add(COMMA549);

                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:732:77: ( NL )?
                                    int alt255=2;
                                    int LA255_0 = input.LA(1);

                                    if ( (LA255_0==NL) ) {
                                        alt255=1;
                                    }
                                    switch (alt255) {
                                        case 1 :
                                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:732:77: NL
                                            {
                                            NL550=(Token)match(input,NL,FOLLOW_NL_in_list_expr5142); if (state.failed) return retval; 
                                            if ( state.backtracking==0 ) stream_NL.add(NL550);


                                            }
                                            break;

                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    char_literal551=(Token)match(input,ROUND_BRACKET_CLOSE,FOLLOW_ROUND_BRACKET_CLOSE_in_list_expr5149); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ROUND_BRACKET_CLOSE.add(char_literal551);



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
                    // 732:89: -> ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( protected_expr_nc )* ) )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:732:92: ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( protected_expr_nc )* ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ROUND_LIST, "ROUND_LIST"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:732:105: ^( NIL_TOKEN ( COMMA )* )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_2);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:732:117: ( COMMA )*
                        while ( stream_COMMA.hasNext() ) {
                            adaptor.addChild(root_2, stream_COMMA.nextNode());

                        }
                        stream_COMMA.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:732:125: ^( NIL_TOKEN ( protected_expr_nc )* )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_2);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:732:137: ( protected_expr_nc )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:734:1: map_or_set_expr : ( '{' ( NL )? ( map_or_set_elem_expr ( NL )? ( COMMA ( NL )? map_or_set_elem_expr ( NL )? )* )? '}' -> ^( MAP_OR_SET_OR_OBJ ( map_or_set_elem_expr )* ) | '{' ( NL )? token_ARROW ( NL )? '}' -> ^( EMPTY_MAP ) );
    public final babel17Parser.map_or_set_expr_return map_or_set_expr() throws RecognitionException {
        babel17Parser.map_or_set_expr_return retval = new babel17Parser.map_or_set_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal552=null;
        Token NL553=null;
        Token NL555=null;
        Token COMMA556=null;
        Token NL557=null;
        Token NL559=null;
        Token char_literal560=null;
        Token char_literal561=null;
        Token NL562=null;
        Token NL564=null;
        Token char_literal565=null;
        babel17Parser.map_or_set_elem_expr_return map_or_set_elem_expr554 = null;

        babel17Parser.map_or_set_elem_expr_return map_or_set_elem_expr558 = null;

        babel17Parser.token_ARROW_return token_ARROW563 = null;


        CommonTree char_literal552_tree=null;
        CommonTree NL553_tree=null;
        CommonTree NL555_tree=null;
        CommonTree COMMA556_tree=null;
        CommonTree NL557_tree=null;
        CommonTree NL559_tree=null;
        CommonTree char_literal560_tree=null;
        CommonTree char_literal561_tree=null;
        CommonTree NL562_tree=null;
        CommonTree NL564_tree=null;
        CommonTree char_literal565_tree=null;
        RewriteRuleTokenStream stream_CURLY_BRACKET_OPEN=new RewriteRuleTokenStream(adaptor,"token CURLY_BRACKET_OPEN");
        RewriteRuleTokenStream stream_CURLY_BRACKET_CLOSE=new RewriteRuleTokenStream(adaptor,"token CURLY_BRACKET_CLOSE");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_map_or_set_elem_expr=new RewriteRuleSubtreeStream(adaptor,"rule map_or_set_elem_expr");
        RewriteRuleSubtreeStream stream_token_ARROW=new RewriteRuleSubtreeStream(adaptor,"rule token_ARROW");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:735:2: ( '{' ( NL )? ( map_or_set_elem_expr ( NL )? ( COMMA ( NL )? map_or_set_elem_expr ( NL )? )* )? '}' -> ^( MAP_OR_SET_OR_OBJ ( map_or_set_elem_expr )* ) | '{' ( NL )? token_ARROW ( NL )? '}' -> ^( EMPTY_MAP ) )
            int alt267=2;
            int LA267_0 = input.LA(1);

            if ( (LA267_0==CURLY_BRACKET_OPEN) ) {
                switch ( input.LA(2) ) {
                case NL:
                    {
                    int LA267_2 = input.LA(3);

                    if ( ((LA267_2>=A_ARROW && LA267_2<=U_ARROW)) ) {
                        alt267=2;
                    }
                    else if ( (LA267_2==L_begin||(LA267_2>=L_obj && LA267_2<=L_if)||(LA267_2>=L_while && LA267_2<=L_for)||LA267_2==L_match||LA267_2==L_exception||LA267_2==L_try||(LA267_2>=A_infinity && LA267_2<=L_lazy)||(LA267_2>=L_true && LA267_2<=L_nil)||LA267_2==L_typeof||LA267_2==MINUS||LA267_2==A_NOT||LA267_2==U_NOT||(LA267_2>=A_ELLIPSIS && LA267_2<=U_ELLIPSIS)||LA267_2==L_force||(LA267_2>=Constr && LA267_2<=Num)||(LA267_2>=String && LA267_2<=ROUND_BRACKET_OPEN)||LA267_2==SQUARE_BRACKET_OPEN||(LA267_2>=CURLY_BRACKET_OPEN && LA267_2<=UNDERSCORE)) ) {
                        alt267=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 267, 2, input);

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
                    alt267=1;
                    }
                    break;
                case A_ARROW:
                case U_ARROW:
                    {
                    alt267=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 267, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 267, 0, input);

                throw nvae;
            }
            switch (alt267) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:735:4: '{' ( NL )? ( map_or_set_elem_expr ( NL )? ( COMMA ( NL )? map_or_set_elem_expr ( NL )? )* )? '}'
                    {
                    char_literal552=(Token)match(input,CURLY_BRACKET_OPEN,FOLLOW_CURLY_BRACKET_OPEN_in_map_or_set_expr5178); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_OPEN.add(char_literal552);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:735:8: ( NL )?
                    int alt259=2;
                    int LA259_0 = input.LA(1);

                    if ( (LA259_0==NL) ) {
                        alt259=1;
                    }
                    switch (alt259) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:735:8: NL
                            {
                            NL553=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_expr5180); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL553);


                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:735:12: ( map_or_set_elem_expr ( NL )? ( COMMA ( NL )? map_or_set_elem_expr ( NL )? )* )?
                    int alt264=2;
                    int LA264_0 = input.LA(1);

                    if ( (LA264_0==L_begin||(LA264_0>=L_obj && LA264_0<=L_if)||(LA264_0>=L_while && LA264_0<=L_for)||LA264_0==L_match||LA264_0==L_exception||LA264_0==L_try||(LA264_0>=A_infinity && LA264_0<=L_lazy)||(LA264_0>=L_true && LA264_0<=L_nil)||LA264_0==L_typeof||LA264_0==MINUS||LA264_0==A_NOT||LA264_0==U_NOT||(LA264_0>=A_ELLIPSIS && LA264_0<=U_ELLIPSIS)||LA264_0==L_force||(LA264_0>=Constr && LA264_0<=Num)||(LA264_0>=String && LA264_0<=ROUND_BRACKET_OPEN)||LA264_0==SQUARE_BRACKET_OPEN||LA264_0==CURLY_BRACKET_OPEN||LA264_0==UNDERSCORE) ) {
                        alt264=1;
                    }
                    switch (alt264) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:735:13: map_or_set_elem_expr ( NL )? ( COMMA ( NL )? map_or_set_elem_expr ( NL )? )*
                            {
                            pushFollow(FOLLOW_map_or_set_elem_expr_in_map_or_set_expr5184);
                            map_or_set_elem_expr554=map_or_set_elem_expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_map_or_set_elem_expr.add(map_or_set_elem_expr554.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:735:34: ( NL )?
                            int alt260=2;
                            int LA260_0 = input.LA(1);

                            if ( (LA260_0==NL) ) {
                                alt260=1;
                            }
                            switch (alt260) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:735:34: NL
                                    {
                                    NL555=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_expr5186); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL555);


                                    }
                                    break;

                            }

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:735:38: ( COMMA ( NL )? map_or_set_elem_expr ( NL )? )*
                            loop263:
                            do {
                                int alt263=2;
                                int LA263_0 = input.LA(1);

                                if ( (LA263_0==COMMA) ) {
                                    alt263=1;
                                }


                                switch (alt263) {
                            	case 1 :
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:735:39: COMMA ( NL )? map_or_set_elem_expr ( NL )?
                            	    {
                            	    COMMA556=(Token)match(input,COMMA,FOLLOW_COMMA_in_map_or_set_expr5190); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA556);

                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:735:45: ( NL )?
                            	    int alt261=2;
                            	    int LA261_0 = input.LA(1);

                            	    if ( (LA261_0==NL) ) {
                            	        alt261=1;
                            	    }
                            	    switch (alt261) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:735:45: NL
                            	            {
                            	            NL557=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_expr5192); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL557);


                            	            }
                            	            break;

                            	    }

                            	    pushFollow(FOLLOW_map_or_set_elem_expr_in_map_or_set_expr5195);
                            	    map_or_set_elem_expr558=map_or_set_elem_expr();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_map_or_set_elem_expr.add(map_or_set_elem_expr558.getTree());
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:735:70: ( NL )?
                            	    int alt262=2;
                            	    int LA262_0 = input.LA(1);

                            	    if ( (LA262_0==NL) ) {
                            	        alt262=1;
                            	    }
                            	    switch (alt262) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:735:70: NL
                            	            {
                            	            NL559=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_expr5197); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL559);


                            	            }
                            	            break;

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop263;
                                }
                            } while (true);


                            }
                            break;

                    }

                    char_literal560=(Token)match(input,CURLY_BRACKET_CLOSE,FOLLOW_CURLY_BRACKET_CLOSE_in_map_or_set_expr5204); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_CLOSE.add(char_literal560);



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
                    // 735:82: -> ^( MAP_OR_SET_OR_OBJ ( map_or_set_elem_expr )* )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:735:85: ^( MAP_OR_SET_OR_OBJ ( map_or_set_elem_expr )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MAP_OR_SET_OR_OBJ, "MAP_OR_SET_OR_OBJ"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:735:105: ( map_or_set_elem_expr )*
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:736:10: '{' ( NL )? token_ARROW ( NL )? '}'
                    {
                    char_literal561=(Token)match(input,CURLY_BRACKET_OPEN,FOLLOW_CURLY_BRACKET_OPEN_in_map_or_set_expr5224); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_OPEN.add(char_literal561);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:736:14: ( NL )?
                    int alt265=2;
                    int LA265_0 = input.LA(1);

                    if ( (LA265_0==NL) ) {
                        alt265=1;
                    }
                    switch (alt265) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:736:14: NL
                            {
                            NL562=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_expr5226); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL562);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_token_ARROW_in_map_or_set_expr5229);
                    token_ARROW563=token_ARROW();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_token_ARROW.add(token_ARROW563.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:736:30: ( NL )?
                    int alt266=2;
                    int LA266_0 = input.LA(1);

                    if ( (LA266_0==NL) ) {
                        alt266=1;
                    }
                    switch (alt266) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:736:30: NL
                            {
                            NL564=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_expr5231); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL564);


                            }
                            break;

                    }

                    char_literal565=(Token)match(input,CURLY_BRACKET_CLOSE,FOLLOW_CURLY_BRACKET_CLOSE_in_map_or_set_expr5234); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_CLOSE.add(char_literal565);



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
                    // 736:38: -> ^( EMPTY_MAP )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:736:41: ^( EMPTY_MAP )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:738:1: map_or_set_elem_expr : protected_expr_nc ( ( NL )? arrow_or_assign ( NL )? protected_expr_nc )? -> ^( NIL_TOKEN ^( NIL_TOKEN ( protected_expr_nc )* ) ( arrow_or_assign )* ) ;
    public final babel17Parser.map_or_set_elem_expr_return map_or_set_elem_expr() throws RecognitionException {
        babel17Parser.map_or_set_elem_expr_return retval = new babel17Parser.map_or_set_elem_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL567=null;
        Token NL569=null;
        babel17Parser.protected_expr_nc_return protected_expr_nc566 = null;

        babel17Parser.arrow_or_assign_return arrow_or_assign568 = null;

        babel17Parser.protected_expr_nc_return protected_expr_nc570 = null;


        CommonTree NL567_tree=null;
        CommonTree NL569_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_arrow_or_assign=new RewriteRuleSubtreeStream(adaptor,"rule arrow_or_assign");
        RewriteRuleSubtreeStream stream_protected_expr_nc=new RewriteRuleSubtreeStream(adaptor,"rule protected_expr_nc");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:739:2: ( protected_expr_nc ( ( NL )? arrow_or_assign ( NL )? protected_expr_nc )? -> ^( NIL_TOKEN ^( NIL_TOKEN ( protected_expr_nc )* ) ( arrow_or_assign )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:739:4: protected_expr_nc ( ( NL )? arrow_or_assign ( NL )? protected_expr_nc )?
            {
            pushFollow(FOLLOW_protected_expr_nc_in_map_or_set_elem_expr5251);
            protected_expr_nc566=protected_expr_nc();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_protected_expr_nc.add(protected_expr_nc566.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:739:22: ( ( NL )? arrow_or_assign ( NL )? protected_expr_nc )?
            int alt270=2;
            int LA270_0 = input.LA(1);

            if ( (LA270_0==NL) ) {
                int LA270_1 = input.LA(2);

                if ( (LA270_1==ASSIGN||(LA270_1>=A_ARROW && LA270_1<=U_ARROW)) ) {
                    alt270=1;
                }
            }
            else if ( (LA270_0==ASSIGN||(LA270_0>=A_ARROW && LA270_0<=U_ARROW)) ) {
                alt270=1;
            }
            switch (alt270) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:739:23: ( NL )? arrow_or_assign ( NL )? protected_expr_nc
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:739:23: ( NL )?
                    int alt268=2;
                    int LA268_0 = input.LA(1);

                    if ( (LA268_0==NL) ) {
                        alt268=1;
                    }
                    switch (alt268) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:739:23: NL
                            {
                            NL567=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_elem_expr5254); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL567);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_arrow_or_assign_in_map_or_set_elem_expr5257);
                    arrow_or_assign568=arrow_or_assign();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_arrow_or_assign.add(arrow_or_assign568.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:739:43: ( NL )?
                    int alt269=2;
                    int LA269_0 = input.LA(1);

                    if ( (LA269_0==NL) ) {
                        alt269=1;
                    }
                    switch (alt269) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:739:43: NL
                            {
                            NL569=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_elem_expr5259); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL569);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_protected_expr_nc_in_map_or_set_elem_expr5262);
                    protected_expr_nc570=protected_expr_nc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_protected_expr_nc.add(protected_expr_nc570.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: arrow_or_assign, protected_expr_nc
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 739:67: -> ^( NIL_TOKEN ^( NIL_TOKEN ( protected_expr_nc )* ) ( arrow_or_assign )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:739:70: ^( NIL_TOKEN ^( NIL_TOKEN ( protected_expr_nc )* ) ( arrow_or_assign )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:739:82: ^( NIL_TOKEN ( protected_expr_nc )* )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_2);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:739:94: ( protected_expr_nc )*
                while ( stream_protected_expr_nc.hasNext() ) {
                    adaptor.addChild(root_2, stream_protected_expr_nc.nextTree());

                }
                stream_protected_expr_nc.reset();

                adaptor.addChild(root_1, root_2);
                }
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:739:114: ( arrow_or_assign )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:741:1: type_expr : '(' ( NL )? ':' ( NL )? typeid ( NL )? ')' -> ^( TYPE_EXPR typeid ) ;
    public final babel17Parser.type_expr_return type_expr() throws RecognitionException {
        babel17Parser.type_expr_return retval = new babel17Parser.type_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal571=null;
        Token NL572=null;
        Token char_literal573=null;
        Token NL574=null;
        Token NL576=null;
        Token char_literal577=null;
        babel17Parser.typeid_return typeid575 = null;


        CommonTree char_literal571_tree=null;
        CommonTree NL572_tree=null;
        CommonTree char_literal573_tree=null;
        CommonTree NL574_tree=null;
        CommonTree NL576_tree=null;
        CommonTree char_literal577_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_ROUND_BRACKET_OPEN=new RewriteRuleTokenStream(adaptor,"token ROUND_BRACKET_OPEN");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_ROUND_BRACKET_CLOSE=new RewriteRuleTokenStream(adaptor,"token ROUND_BRACKET_CLOSE");
        RewriteRuleSubtreeStream stream_typeid=new RewriteRuleSubtreeStream(adaptor,"rule typeid");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:742:2: ( '(' ( NL )? ':' ( NL )? typeid ( NL )? ')' -> ^( TYPE_EXPR typeid ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:742:4: '(' ( NL )? ':' ( NL )? typeid ( NL )? ')'
            {
            char_literal571=(Token)match(input,ROUND_BRACKET_OPEN,FOLLOW_ROUND_BRACKET_OPEN_in_type_expr5289); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ROUND_BRACKET_OPEN.add(char_literal571);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:742:8: ( NL )?
            int alt271=2;
            int LA271_0 = input.LA(1);

            if ( (LA271_0==NL) ) {
                alt271=1;
            }
            switch (alt271) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:742:8: NL
                    {
                    NL572=(Token)match(input,NL,FOLLOW_NL_in_type_expr5291); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL572);


                    }
                    break;

            }

            char_literal573=(Token)match(input,COLON,FOLLOW_COLON_in_type_expr5294); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(char_literal573);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:742:16: ( NL )?
            int alt272=2;
            int LA272_0 = input.LA(1);

            if ( (LA272_0==NL) ) {
                alt272=1;
            }
            switch (alt272) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:742:16: NL
                    {
                    NL574=(Token)match(input,NL,FOLLOW_NL_in_type_expr5296); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL574);


                    }
                    break;

            }

            pushFollow(FOLLOW_typeid_in_type_expr5299);
            typeid575=typeid();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeid.add(typeid575.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:742:27: ( NL )?
            int alt273=2;
            int LA273_0 = input.LA(1);

            if ( (LA273_0==NL) ) {
                alt273=1;
            }
            switch (alt273) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:742:27: NL
                    {
                    NL576=(Token)match(input,NL,FOLLOW_NL_in_type_expr5301); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL576);


                    }
                    break;

            }

            char_literal577=(Token)match(input,ROUND_BRACKET_CLOSE,FOLLOW_ROUND_BRACKET_CLOSE_in_type_expr5304); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ROUND_BRACKET_CLOSE.add(char_literal577);



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
            // 742:35: -> ^( TYPE_EXPR typeid )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:742:38: ^( TYPE_EXPR typeid )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:744:1: primitive_expr : ( Num | String | Id | Constr | L_true | L_false | L_this | L_nil | type_expr | token_infinity | list_expr | with_control_expr | map_or_set_expr );
    public final babel17Parser.primitive_expr_return primitive_expr() throws RecognitionException {
        babel17Parser.primitive_expr_return retval = new babel17Parser.primitive_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Num578=null;
        Token String579=null;
        Token Id580=null;
        Token Constr581=null;
        Token L_true582=null;
        Token L_false583=null;
        Token L_this584=null;
        Token L_nil585=null;
        babel17Parser.type_expr_return type_expr586 = null;

        babel17Parser.token_infinity_return token_infinity587 = null;

        babel17Parser.list_expr_return list_expr588 = null;

        babel17Parser.with_control_expr_return with_control_expr589 = null;

        babel17Parser.map_or_set_expr_return map_or_set_expr590 = null;


        CommonTree Num578_tree=null;
        CommonTree String579_tree=null;
        CommonTree Id580_tree=null;
        CommonTree Constr581_tree=null;
        CommonTree L_true582_tree=null;
        CommonTree L_false583_tree=null;
        CommonTree L_this584_tree=null;
        CommonTree L_nil585_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:745:2: ( Num | String | Id | Constr | L_true | L_false | L_this | L_nil | type_expr | token_infinity | list_expr | with_control_expr | map_or_set_expr )
            int alt274=13;
            alt274 = dfa274.predict(input);
            switch (alt274) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:745:4: Num
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Num578=(Token)match(input,Num,FOLLOW_Num_in_primitive_expr5321); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Num578_tree = (CommonTree)adaptor.create(Num578);
                    adaptor.addChild(root_0, Num578_tree);
                    }

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:746:4: String
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    String579=(Token)match(input,String,FOLLOW_String_in_primitive_expr5326); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    String579_tree = (CommonTree)adaptor.create(String579);
                    adaptor.addChild(root_0, String579_tree);
                    }

                    }
                    break;
                case 3 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:747:4: Id
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Id580=(Token)match(input,Id,FOLLOW_Id_in_primitive_expr5331); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Id580_tree = (CommonTree)adaptor.create(Id580);
                    adaptor.addChild(root_0, Id580_tree);
                    }

                    }
                    break;
                case 4 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:748:4: Constr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Constr581=(Token)match(input,Constr,FOLLOW_Constr_in_primitive_expr5336); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Constr581_tree = (CommonTree)adaptor.create(Constr581);
                    adaptor.addChild(root_0, Constr581_tree);
                    }

                    }
                    break;
                case 5 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:749:4: L_true
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    L_true582=(Token)match(input,L_true,FOLLOW_L_true_in_primitive_expr5341); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    L_true582_tree = (CommonTree)adaptor.create(L_true582);
                    adaptor.addChild(root_0, L_true582_tree);
                    }

                    }
                    break;
                case 6 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:750:4: L_false
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    L_false583=(Token)match(input,L_false,FOLLOW_L_false_in_primitive_expr5346); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    L_false583_tree = (CommonTree)adaptor.create(L_false583);
                    adaptor.addChild(root_0, L_false583_tree);
                    }

                    }
                    break;
                case 7 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:751:4: L_this
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    L_this584=(Token)match(input,L_this,FOLLOW_L_this_in_primitive_expr5351); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    L_this584_tree = (CommonTree)adaptor.create(L_this584);
                    adaptor.addChild(root_0, L_this584_tree);
                    }

                    }
                    break;
                case 8 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:752:4: L_nil
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    L_nil585=(Token)match(input,L_nil,FOLLOW_L_nil_in_primitive_expr5357); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    L_nil585_tree = (CommonTree)adaptor.create(L_nil585);
                    adaptor.addChild(root_0, L_nil585_tree);
                    }

                    }
                    break;
                case 9 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:753:4: type_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_type_expr_in_primitive_expr5362);
                    type_expr586=type_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type_expr586.getTree());

                    }
                    break;
                case 10 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:754:4: token_infinity
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_infinity_in_primitive_expr5367);
                    token_infinity587=token_infinity();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, token_infinity587.getTree());

                    }
                    break;
                case 11 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:755:5: list_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_list_expr_in_primitive_expr5373);
                    list_expr588=list_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, list_expr588.getTree());

                    }
                    break;
                case 12 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:756:4: with_control_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_with_control_expr_in_primitive_expr5378);
                    with_control_expr589=with_control_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, with_control_expr589.getTree());

                    }
                    break;
                case 13 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:757:4: map_or_set_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_map_or_set_expr_in_primitive_expr5383);
                    map_or_set_expr590=map_or_set_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, map_or_set_expr590.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:401:10: ( Id ( NL )? L_as )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:401:11: Id ( NL )? L_as
        {
        match(input,Id,FOLLOW_Id_in_synpred1_babel171802); if (state.failed) return ;
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:401:14: ( NL )?
        int alt275=2;
        int LA275_0 = input.LA(1);

        if ( (LA275_0==NL) ) {
            alt275=1;
        }
        switch (alt275) {
            case 1 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:401:14: NL
                {
                match(input,NL,FOLLOW_NL_in_synpred1_babel171804); if (state.failed) return ;

                }
                break;

        }

        match(input,L_as,FOLLOW_L_as_in_synpred1_babel171807); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_babel17

    // $ANTLR start synpred2_babel17
    public final void synpred2_babel17_fragment() throws RecognitionException {   
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:402:4: ( protected_expr ( NL )? QUESTION_MARK )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:402:5: protected_expr ( NL )? QUESTION_MARK
        {
        pushFollow(FOLLOW_protected_expr_in_synpred2_babel171838);
        protected_expr();

        state._fsp--;
        if (state.failed) return ;
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:402:20: ( NL )?
        int alt276=2;
        int LA276_0 = input.LA(1);

        if ( (LA276_0==NL) ) {
            alt276=1;
        }
        switch (alt276) {
            case 1 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:402:20: NL
                {
                match(input,NL,FOLLOW_NL_in_synpred2_babel171840); if (state.failed) return ;

                }
                break;

        }

        match(input,QUESTION_MARK,FOLLOW_QUESTION_MARK_in_synpred2_babel171843); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_babel17

    // $ANTLR start synpred3_babel17
    public final void synpred3_babel17_fragment() throws RecognitionException {   
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:404:4: ( Id pattern )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:404:5: Id pattern
        {
        match(input,Id,FOLLOW_Id_in_synpred3_babel171881); if (state.failed) return ;
        pushFollow(FOLLOW_pattern_in_synpred3_babel171883);
        pattern();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_babel17

    // $ANTLR start synpred4_babel17
    public final void synpred4_babel17_fragment() throws RecognitionException {   
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:407:4: ( pattern ( NL )? L_if )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:407:5: pattern ( NL )? L_if
        {
        pushFollow(FOLLOW_pattern_in_synpred4_babel171972);
        pattern();

        state._fsp--;
        if (state.failed) return ;
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:407:13: ( NL )?
        int alt277=2;
        int LA277_0 = input.LA(1);

        if ( (LA277_0==NL) ) {
            alt277=1;
        }
        switch (alt277) {
            case 1 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:407:13: NL
                {
                match(input,NL,FOLLOW_NL_in_synpred4_babel171974); if (state.failed) return ;

                }
                break;

        }

        match(input,L_if,FOLLOW_L_if_in_synpred4_babel171977); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_babel17

    // $ANTLR start synpred5_babel17
    public final void synpred5_babel17_fragment() throws RecognitionException {   
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:408:4: ( pattern ( NL )? ':' )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:408:5: pattern ( NL )? ':'
        {
        pushFollow(FOLLOW_pattern_in_synpred5_babel172008);
        pattern();

        state._fsp--;
        if (state.failed) return ;
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:408:13: ( NL )?
        int alt278=2;
        int LA278_0 = input.LA(1);

        if ( (LA278_0==NL) ) {
            alt278=1;
        }
        switch (alt278) {
            case 1 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:408:13: NL
                {
                match(input,NL,FOLLOW_NL_in_synpred5_babel172010); if (state.failed) return ;

                }
                break;

        }

        match(input,COLON,FOLLOW_COLON_in_synpred5_babel172013); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_babel17

    // $ANTLR start synpred6_babel17
    public final void synpred6_babel17_fragment() throws RecognitionException {   
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:475:4: ( primitive_pattern ( NL )? '=' )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:475:5: primitive_pattern ( NL )? '='
        {
        pushFollow(FOLLOW_primitive_pattern_in_synpred6_babel172825);
        primitive_pattern();

        state._fsp--;
        if (state.failed) return ;
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:475:23: ( NL )?
        int alt279=2;
        int LA279_0 = input.LA(1);

        if ( (LA279_0==NL) ) {
            alt279=1;
        }
        switch (alt279) {
            case 1 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:475:23: NL
                {
                match(input,NL,FOLLOW_NL_in_synpred6_babel172827); if (state.failed) return ;

                }
                break;

        }

        match(input,ASSIGN,FOLLOW_ASSIGN_in_synpred6_babel172830); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred6_babel17

    // $ANTLR start synpred7_babel17
    public final void synpred7_babel17_fragment() throws RecognitionException {   
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:512:4: ( ( pattern | objelem_assign ) ( NL )? '=' )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:512:5: ( pattern | objelem_assign ) ( NL )? '='
        {
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:512:5: ( pattern | objelem_assign )
        int alt280=2;
        int LA280_0 = input.LA(1);

        if ( (LA280_0==L_exception||(LA280_0>=A_infinity && LA280_0<=U_infinity)||(LA280_0>=L_true && LA280_0<=L_false)||LA280_0==L_nil||LA280_0==MINUS||(LA280_0>=A_ELLIPSIS && LA280_0<=U_ELLIPSIS)||LA280_0==Constr||LA280_0==Num||(LA280_0>=String && LA280_0<=ROUND_BRACKET_OPEN)||LA280_0==SQUARE_BRACKET_OPEN||LA280_0==CURLY_BRACKET_OPEN||LA280_0==UNDERSCORE) ) {
            alt280=1;
        }
        else if ( (LA280_0==Id) ) {
            int LA280_2 = input.LA(2);

            if ( (LA280_2==PERIOD) ) {
                alt280=2;
            }
            else if ( (LA280_2==ASSIGN||(LA280_2>=A_DOUBLE_COLON && LA280_2<=U_DOUBLE_COLON)||LA280_2==NL) ) {
                alt280=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 280, 2, input);

                throw nvae;
            }
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 280, 0, input);

            throw nvae;
        }
        switch (alt280) {
            case 1 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:512:6: pattern
                {
                pushFollow(FOLLOW_pattern_in_synpred7_babel173198);
                pattern();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:512:16: objelem_assign
                {
                pushFollow(FOLLOW_objelem_assign_in_synpred7_babel173202);
                objelem_assign();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:512:32: ( NL )?
        int alt281=2;
        int LA281_0 = input.LA(1);

        if ( (LA281_0==NL) ) {
            alt281=1;
        }
        switch (alt281) {
            case 1 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:512:32: NL
                {
                match(input,NL,FOLLOW_NL_in_synpred7_babel173205); if (state.failed) return ;

                }
                break;

        }

        match(input,ASSIGN,FOLLOW_ASSIGN_in_synpred7_babel173208); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred7_babel17

    // $ANTLR start synpred8_babel17
    public final void synpred8_babel17_fragment() throws RecognitionException {   
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:547:11: ( L_obj ( NL )? parents )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:547:12: L_obj ( NL )? parents
        {
        match(input,L_obj,FOLLOW_L_obj_in_synpred8_babel173437); if (state.failed) return ;
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:547:18: ( NL )?
        int alt282=2;
        int LA282_0 = input.LA(1);

        if ( (LA282_0==NL) ) {
            alt282=1;
        }
        switch (alt282) {
            case 1 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:547:18: NL
                {
                match(input,NL,FOLLOW_NL_in_synpred8_babel173439); if (state.failed) return ;

                }
                break;

        }

        pushFollow(FOLLOW_parents_in_synpred8_babel173442);
        parents();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred8_babel17

    // $ANTLR start synpred9_babel17
    public final void synpred9_babel17_fragment() throws RecognitionException {   
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:551:4: ( lambda_expr )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:551:5: lambda_expr
        {
        pushFollow(FOLLOW_lambda_expr_in_synpred9_babel173511);
        lambda_expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred9_babel17

    // $ANTLR start synpred10_babel17
    public final void synpred10_babel17_fragment() throws RecognitionException {   
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:552:4: ( lambda_expr_nobrackets )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:552:5: lambda_expr_nobrackets
        {
        pushFollow(FOLLOW_lambda_expr_nobrackets_in_synpred10_babel173522);
        lambda_expr_nobrackets();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred10_babel17

    // $ANTLR start synpred11_babel17
    public final void synpred11_babel17_fragment() throws RecognitionException {   
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:556:4: ( lambda_expr )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:556:5: lambda_expr
        {
        pushFollow(FOLLOW_lambda_expr_in_synpred11_babel173543);
        lambda_expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred11_babel17

    // $ANTLR start synpred12_babel17
    public final void synpred12_babel17_fragment() throws RecognitionException {   
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:557:4: ( lambda_expr_nobrackets )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:557:5: lambda_expr_nobrackets
        {
        pushFollow(FOLLOW_lambda_expr_nobrackets_in_synpred12_babel173554);
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
    protected DFA113 dfa113 = new DFA113(this);
    protected DFA123 dfa123 = new DFA123(this);
    protected DFA124 dfa124 = new DFA124(this);
    protected DFA274 dfa274 = new DFA274(this);
    static final String DFA29_eotS =
        "\42\uffff";
    static final String DFA29_eofS =
        "\42\uffff";
    static final String DFA29_minS =
        "\1\77\17\0\6\uffff\1\0\13\uffff";
    static final String DFA29_maxS =
        "\1\u009c\17\0\6\uffff\1\0\13\uffff";
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
            return "400:1: bracket_pattern : ( ( Id ( NL )? L_as )=> Id ( NL )? L_as ( NL )? pattern -> ^( L_as Id pattern ) | ( protected_expr ( NL )? QUESTION_MARK )=> protected_expr ( NL )? QUESTION_MARK ( ( NL )? pattern )? -> ^( QUESTION_MARK protected_expr ( pattern )? ) | ( Id pattern )=> Id pattern -> ^( INNERVALUE_PATTERN Id pattern ) | L_val ( NL )? protected_expr_nc -> ^( L_val protected_expr_nc ) | L_for ( NL )? ( bracket_pattern ( ( NL )? COMMA ( NL )? bracket_pattern )* ( NL )? )? L_end -> ^( L_for ( bracket_pattern )* ) | ( pattern ( NL )? L_if )=> pattern ( NL )? L_if ( NL )? protected_expr_nc -> ^( IF_PATTERN pattern protected_expr_nc ) | ( pattern ( NL )? ':' )=> pattern ( NL )? ':' ( NL )? typeannotation -> ^( TYPE_PATTERN typeannotation pattern ) | pattern );";
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
        "\1\126\10\uffff\1\126\2\uffff\1\77\1\126\2\uffff\1\77\2\uffff";
    static final String DFA58_maxS =
        "\1\u009c\10\uffff\1\u0093\2\uffff\1\u009c\1\u0093\2\uffff\1\u009c"+
        "\2\uffff";
    static final String DFA58_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\uffff\1\13\1\14\2\uffff"+
        "\1\12\1\11\1\uffff\1\16\1\15";
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
            "\2\17\70\uffff\1\15\2\uffff\1\16",
            "",
            "",
            "\1\22\1\uffff\3\22\3\uffff\2\22\2\uffff\1\22\2\uffff\1\22\2"+
            "\uffff\1\22\2\uffff\1\22\1\uffff\5\22\1\uffff\5\22\4\uffff\1"+
            "\22\16\uffff\1\22\5\uffff\1\22\2\uffff\1\22\10\uffff\2\21\2"+
            "\22\3\uffff\1\22\2\uffff\1\20\3\22\1\uffff\2\22\1\uffff\1\22"+
            "\1\uffff\3\22",
            "\2\17\73\uffff\1\16",
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
            return "419:1: primitive_pattern : ( Id | '_' -> ANY | String | Num | L_true | L_false | L_nil | token_infinity | '-' ( NL )? token_infinity -> ^( UMINUS token_infinity ) | '-' ( NL )? Num -> ^( UMINUS Num ) | '[' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* )? ']' -> ^( SQUARE_LIST ( bracket_pattern )* ) | '(' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* ( COMMA ( NL )? )? )? ')' -> ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( bracket_pattern )* ) ) | '{' ( NL )? ( mselem_pattern ( NL )? ( COMMA ( NL )? mselem_pattern ( NL )? )* )? '}' -> ^( MAP_OR_SET_OR_OBJ ( mselem_pattern )* ) | '{' ( NL )? token_ARROW ( NL )? '}' -> ^( EMPTY_MAP ) );";
        }
    }
    static final String DFA64_eotS =
        "\4\uffff";
    static final String DFA64_eofS =
        "\2\3\2\uffff";
    static final String DFA64_minS =
        "\2\77\2\uffff";
    static final String DFA64_maxS =
        "\2\u00a1\2\uffff";
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
            return "441:1: block : ( ( sep )? statement ( sep statement )* ( sep )? -> ^( BLOCK ( statement )* ) | ( sep )? -> ^( BLOCK ) );";
        }
    }
    static final String DFA61_eotS =
        "\4\uffff";
    static final String DFA61_eofS =
        "\2\2\2\uffff";
    static final String DFA61_minS =
        "\1\100\1\77\2\uffff";
    static final String DFA61_maxS =
        "\1\u0090\1\u00a1\2\uffff";
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
            return "()* loopback of 441:25: ( sep statement )*";
        }
    }
    static final String DFA66_eotS =
        "\16\uffff";
    static final String DFA66_eofS =
        "\16\uffff";
    static final String DFA66_minS =
        "\1\77\15\uffff";
    static final String DFA66_maxS =
        "\1\u00a1\15\uffff";
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
            return "447:1: statement : ( st_typedef | st_val | st_def | st_yield | st_memoize | st_private | st_module | st_import | expr_or_assign | PRAGMA_PRINT expr -> ^( PRAGMA_PRINT expr ) | PRAGMA_LOG expr -> ^( PRAGMA_LOG expr ) | PRAGMA_PROFILE expr -> ^( PRAGMA_PROFILE expr ) | PRAGMA_ASSERT expr -> ^( PRAGMA_ASSERT expr ) );";
        }
    }
    static final String DFA92_eotS =
        "\17\uffff";
    static final String DFA92_eofS =
        "\17\uffff";
    static final String DFA92_minS =
        "\1\126\14\0\2\uffff";
    static final String DFA92_maxS =
        "\1\u009c\14\0\2\uffff";
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
            return "474:1: typedef_clause : ( ( primitive_pattern ( NL )? '=' )=> primitive_pattern ( NL )? '=' ( NL )? expr -> ^( TYPEDEF_CLAUSE primitive_pattern expr ) | primitive_pattern -> ^( TYPEDEF_CLAUSE primitive_pattern ) );";
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
    static final String DFA113_eotS =
        "\34\uffff";
    static final String DFA113_eofS =
        "\34\uffff";
    static final String DFA113_minS =
        "\1\77\17\0\14\uffff";
    static final String DFA113_maxS =
        "\1\u009c\17\0\14\uffff";
    static final String DFA113_acceptS =
        "\20\uffff\1\2\12\uffff\1\1";
    static final String DFA113_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\14\uffff}>";
    static final String[] DFA113_transitionS = {
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

    static final short[] DFA113_eot = DFA.unpackEncodedString(DFA113_eotS);
    static final short[] DFA113_eof = DFA.unpackEncodedString(DFA113_eofS);
    static final char[] DFA113_min = DFA.unpackEncodedStringToUnsignedChars(DFA113_minS);
    static final char[] DFA113_max = DFA.unpackEncodedStringToUnsignedChars(DFA113_maxS);
    static final short[] DFA113_accept = DFA.unpackEncodedString(DFA113_acceptS);
    static final short[] DFA113_special = DFA.unpackEncodedString(DFA113_specialS);
    static final short[][] DFA113_transition;

    static {
        int numStates = DFA113_transitionS.length;
        DFA113_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA113_transition[i] = DFA.unpackEncodedString(DFA113_transitionS[i]);
        }
    }

    class DFA113 extends DFA {

        public DFA113(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 113;
            this.eot = DFA113_eot;
            this.eof = DFA113_eof;
            this.min = DFA113_min;
            this.max = DFA113_max;
            this.accept = DFA113_accept;
            this.special = DFA113_special;
            this.transition = DFA113_transition;
        }
        public String getDescription() {
            return "511:1: expr_or_assign : ( ( ( pattern | objelem_assign ) ( NL )? '=' )=> ( pattern | objelem_assign ) ( NL )? '=' ( NL )? expr -> ^( ASSIGN ( pattern )* ( objelem_assign )* expr ) | expr );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA113_1 = input.LA(1);

                         
                        int index113_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index113_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA113_2 = input.LA(1);

                         
                        int index113_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index113_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA113_3 = input.LA(1);

                         
                        int index113_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index113_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA113_4 = input.LA(1);

                         
                        int index113_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index113_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA113_5 = input.LA(1);

                         
                        int index113_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index113_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA113_6 = input.LA(1);

                         
                        int index113_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index113_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA113_7 = input.LA(1);

                         
                        int index113_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index113_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA113_8 = input.LA(1);

                         
                        int index113_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index113_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA113_9 = input.LA(1);

                         
                        int index113_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index113_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA113_10 = input.LA(1);

                         
                        int index113_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index113_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA113_11 = input.LA(1);

                         
                        int index113_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index113_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA113_12 = input.LA(1);

                         
                        int index113_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index113_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA113_13 = input.LA(1);

                         
                        int index113_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index113_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA113_14 = input.LA(1);

                         
                        int index113_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index113_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA113_15 = input.LA(1);

                         
                        int index113_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index113_15);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 113, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA123_eotS =
        "\33\uffff";
    static final String DFA123_eofS =
        "\33\uffff";
    static final String DFA123_minS =
        "\1\77\3\0\1\uffff\12\0\14\uffff";
    static final String DFA123_maxS =
        "\1\u009c\3\0\1\uffff\12\0\14\uffff";
    static final String DFA123_acceptS =
        "\4\uffff\1\2\12\uffff\1\2\1\3\11\uffff\1\1";
    static final String DFA123_specialS =
        "\1\0\1\1\1\2\1\3\1\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\14\uffff}>";
    static final String[] DFA123_transitionS = {
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

    static final short[] DFA123_eot = DFA.unpackEncodedString(DFA123_eotS);
    static final short[] DFA123_eof = DFA.unpackEncodedString(DFA123_eofS);
    static final char[] DFA123_min = DFA.unpackEncodedStringToUnsignedChars(DFA123_minS);
    static final char[] DFA123_max = DFA.unpackEncodedStringToUnsignedChars(DFA123_maxS);
    static final short[] DFA123_accept = DFA.unpackEncodedString(DFA123_acceptS);
    static final short[] DFA123_special = DFA.unpackEncodedString(DFA123_specialS);
    static final short[][] DFA123_transition;

    static {
        int numStates = DFA123_transitionS.length;
        DFA123_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA123_transition[i] = DFA.unpackEncodedString(DFA123_transitionS[i]);
        }
    }

    class DFA123 extends DFA {

        public DFA123(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 123;
            this.eot = DFA123_eot;
            this.eof = DFA123_eof;
            this.min = DFA123_min;
            this.max = DFA123_max;
            this.accept = DFA123_accept;
            this.special = DFA123_special;
            this.transition = DFA123_transition;
        }
        public String getDescription() {
            return "550:1: lop_expr : ( ( lambda_expr )=> lambda_expr | ( lambda_expr_nobrackets )=> lambda_expr_nobrackets | op_expr );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA123_0 = input.LA(1);

                         
                        int index123_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA123_0==ROUND_BRACKET_OPEN) ) {s = 1;}

                        else if ( (LA123_0==Constr) ) {s = 2;}

                        else if ( (LA123_0==Id) ) {s = 3;}

                        else if ( (LA123_0==UNDERSCORE) && (synpred10_babel17())) {s = 4;}

                        else if ( (LA123_0==String) ) {s = 5;}

                        else if ( (LA123_0==Num) ) {s = 6;}

                        else if ( (LA123_0==L_true) ) {s = 7;}

                        else if ( (LA123_0==L_false) ) {s = 8;}

                        else if ( (LA123_0==L_nil) ) {s = 9;}

                        else if ( ((LA123_0>=A_infinity && LA123_0<=U_infinity)) ) {s = 10;}

                        else if ( (LA123_0==MINUS) ) {s = 11;}

                        else if ( (LA123_0==SQUARE_BRACKET_OPEN) ) {s = 12;}

                        else if ( (LA123_0==CURLY_BRACKET_OPEN) ) {s = 13;}

                        else if ( (LA123_0==L_exception) ) {s = 14;}

                        else if ( ((LA123_0>=A_ELLIPSIS && LA123_0<=U_ELLIPSIS)) && (synpred10_babel17())) {s = 15;}

                        else if ( (LA123_0==L_begin||(LA123_0>=L_with && LA123_0<=L_if)||(LA123_0>=L_while && LA123_0<=L_for)||LA123_0==L_match||LA123_0==L_try||(LA123_0>=L_concurrent && LA123_0<=L_lazy)||(LA123_0>=L_this && LA123_0<=L_random)||LA123_0==L_typeof||LA123_0==A_NOT||LA123_0==U_NOT||LA123_0==L_force) ) {s = 16;}

                         
                        input.seek(index123_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA123_1 = input.LA(1);

                         
                        int index123_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_babel17()) ) {s = 26;}

                        else if ( (synpred10_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index123_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA123_2 = input.LA(1);

                         
                        int index123_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index123_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA123_3 = input.LA(1);

                         
                        int index123_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index123_3);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA123_5 = input.LA(1);

                         
                        int index123_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index123_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA123_6 = input.LA(1);

                         
                        int index123_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index123_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA123_7 = input.LA(1);

                         
                        int index123_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index123_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA123_8 = input.LA(1);

                         
                        int index123_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index123_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA123_9 = input.LA(1);

                         
                        int index123_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index123_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA123_10 = input.LA(1);

                         
                        int index123_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index123_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA123_11 = input.LA(1);

                         
                        int index123_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index123_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA123_12 = input.LA(1);

                         
                        int index123_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index123_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA123_13 = input.LA(1);

                         
                        int index123_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index123_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA123_14 = input.LA(1);

                         
                        int index123_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index123_14);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 123, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA124_eotS =
        "\33\uffff";
    static final String DFA124_eofS =
        "\33\uffff";
    static final String DFA124_minS =
        "\1\77\3\0\1\uffff\12\0\14\uffff";
    static final String DFA124_maxS =
        "\1\u009c\3\0\1\uffff\12\0\14\uffff";
    static final String DFA124_acceptS =
        "\4\uffff\1\2\12\uffff\1\2\1\3\11\uffff\1\1";
    static final String DFA124_specialS =
        "\1\0\1\1\1\2\1\3\1\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\14\uffff}>";
    static final String[] DFA124_transitionS = {
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

    static final short[] DFA124_eot = DFA.unpackEncodedString(DFA124_eotS);
    static final short[] DFA124_eof = DFA.unpackEncodedString(DFA124_eofS);
    static final char[] DFA124_min = DFA.unpackEncodedStringToUnsignedChars(DFA124_minS);
    static final char[] DFA124_max = DFA.unpackEncodedStringToUnsignedChars(DFA124_maxS);
    static final short[] DFA124_accept = DFA.unpackEncodedString(DFA124_acceptS);
    static final short[] DFA124_special = DFA.unpackEncodedString(DFA124_specialS);
    static final short[][] DFA124_transition;

    static {
        int numStates = DFA124_transitionS.length;
        DFA124_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA124_transition[i] = DFA.unpackEncodedString(DFA124_transitionS[i]);
        }
    }

    class DFA124 extends DFA {

        public DFA124(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 124;
            this.eot = DFA124_eot;
            this.eof = DFA124_eof;
            this.min = DFA124_min;
            this.max = DFA124_max;
            this.accept = DFA124_accept;
            this.special = DFA124_special;
            this.transition = DFA124_transition;
        }
        public String getDescription() {
            return "555:1: p_lop_expr : ( ( lambda_expr )=> lambda_expr | ( lambda_expr_nobrackets )=> lambda_expr_nobrackets | p_op_expr );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA124_0 = input.LA(1);

                         
                        int index124_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA124_0==ROUND_BRACKET_OPEN) ) {s = 1;}

                        else if ( (LA124_0==Constr) ) {s = 2;}

                        else if ( (LA124_0==Id) ) {s = 3;}

                        else if ( (LA124_0==UNDERSCORE) && (synpred12_babel17())) {s = 4;}

                        else if ( (LA124_0==String) ) {s = 5;}

                        else if ( (LA124_0==Num) ) {s = 6;}

                        else if ( (LA124_0==L_true) ) {s = 7;}

                        else if ( (LA124_0==L_false) ) {s = 8;}

                        else if ( (LA124_0==L_nil) ) {s = 9;}

                        else if ( ((LA124_0>=A_infinity && LA124_0<=U_infinity)) ) {s = 10;}

                        else if ( (LA124_0==MINUS) ) {s = 11;}

                        else if ( (LA124_0==SQUARE_BRACKET_OPEN) ) {s = 12;}

                        else if ( (LA124_0==CURLY_BRACKET_OPEN) ) {s = 13;}

                        else if ( (LA124_0==L_exception) ) {s = 14;}

                        else if ( ((LA124_0>=A_ELLIPSIS && LA124_0<=U_ELLIPSIS)) && (synpred12_babel17())) {s = 15;}

                        else if ( (LA124_0==L_begin||(LA124_0>=L_with && LA124_0<=L_if)||(LA124_0>=L_while && LA124_0<=L_for)||LA124_0==L_match||LA124_0==L_try||(LA124_0>=L_concurrent && LA124_0<=L_lazy)||(LA124_0>=L_this && LA124_0<=L_random)||LA124_0==L_typeof||LA124_0==A_NOT||LA124_0==U_NOT||LA124_0==L_force) ) {s = 16;}

                         
                        input.seek(index124_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA124_1 = input.LA(1);

                         
                        int index124_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_babel17()) ) {s = 26;}

                        else if ( (synpred12_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index124_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA124_2 = input.LA(1);

                         
                        int index124_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index124_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA124_3 = input.LA(1);

                         
                        int index124_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index124_3);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA124_5 = input.LA(1);

                         
                        int index124_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index124_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA124_6 = input.LA(1);

                         
                        int index124_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index124_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA124_7 = input.LA(1);

                         
                        int index124_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index124_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA124_8 = input.LA(1);

                         
                        int index124_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index124_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA124_9 = input.LA(1);

                         
                        int index124_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index124_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA124_10 = input.LA(1);

                         
                        int index124_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index124_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA124_11 = input.LA(1);

                         
                        int index124_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index124_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA124_12 = input.LA(1);

                         
                        int index124_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index124_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA124_13 = input.LA(1);

                         
                        int index124_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index124_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA124_14 = input.LA(1);

                         
                        int index124_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index124_14);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 124, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA274_eotS =
        "\20\uffff";
    static final String DFA274_eofS =
        "\20\uffff";
    static final String DFA274_minS =
        "\1\77\10\uffff\1\77\4\uffff\1\77\1\uffff";
    static final String DFA274_maxS =
        "\1\u009a\10\uffff\1\u009d\4\uffff\1\u009d\1\uffff";
    static final String DFA274_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\uffff\1\12\1\13\1\14"+
        "\1\15\1\uffff\1\11";
    static final String DFA274_specialS =
        "\20\uffff}>";
    static final String[] DFA274_transitionS = {
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

    static final short[] DFA274_eot = DFA.unpackEncodedString(DFA274_eotS);
    static final short[] DFA274_eof = DFA.unpackEncodedString(DFA274_eofS);
    static final char[] DFA274_min = DFA.unpackEncodedStringToUnsignedChars(DFA274_minS);
    static final char[] DFA274_max = DFA.unpackEncodedStringToUnsignedChars(DFA274_maxS);
    static final short[] DFA274_accept = DFA.unpackEncodedString(DFA274_acceptS);
    static final short[] DFA274_special = DFA.unpackEncodedString(DFA274_specialS);
    static final short[][] DFA274_transition;

    static {
        int numStates = DFA274_transitionS.length;
        DFA274_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA274_transition[i] = DFA.unpackEncodedString(DFA274_transitionS[i]);
        }
    }

    class DFA274 extends DFA {

        public DFA274(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 274;
            this.eot = DFA274_eot;
            this.eof = DFA274_eof;
            this.min = DFA274_min;
            this.max = DFA274_max;
            this.accept = DFA274_accept;
            this.special = DFA274_special;
            this.transition = DFA274_transition;
        }
        public String getDescription() {
            return "744:1: primitive_expr : ( Num | String | Id | Constr | L_true | L_false | L_this | L_nil | type_expr | token_infinity | list_expr | with_control_expr | map_or_set_expr );";
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
    public static final BitSet FOLLOW_Id_in_bracket_pattern1812 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L,0x0000000000010000L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1814 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_L_as_in_bracket_pattern1817 = new BitSet(new long[]{0x0000000000000000L,0x0010000130C20000L,0x00000000156F0300L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1819 = new BitSet(new long[]{0x0000000000000000L,0x0010000130C20000L,0x00000000156E0300L});
    public static final BitSet FOLLOW_pattern_in_bracket_pattern1822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protected_expr_in_bracket_pattern1851 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000011000L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1853 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_QUESTION_MARK_in_bracket_pattern1856 = new BitSet(new long[]{0x0000000000000002L,0x0010000130C20000L,0x00000000156F0300L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1859 = new BitSet(new long[]{0x0000000000000000L,0x0010000130C20000L,0x00000000156E0300L});
    public static final BitSet FOLLOW_pattern_in_bracket_pattern1862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Id_in_bracket_pattern1888 = new BitSet(new long[]{0x0000000000000000L,0x0010000130C20000L,0x00000000156E0300L});
    public static final BitSet FOLLOW_pattern_in_bracket_pattern1890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_val_in_bracket_pattern1905 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1907 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_protected_expr_nc_in_bracket_pattern1910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_for_in_bracket_pattern1929 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2498FL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1931 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2498FL,0x00000000156F2300L});
    public static final BitSet FOLLOW_bracket_pattern_in_bracket_pattern1935 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L,0x0000000000010400L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1939 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_COMMA_in_bracket_pattern1942 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2498EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1944 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2498EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_bracket_pattern_in_bracket_pattern1947 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L,0x0000000000010400L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1952 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_L_end_in_bracket_pattern1957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_bracket_pattern1982 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L,0x0000000000010000L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1984 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_L_if_in_bracket_pattern1987 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1989 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_protected_expr_nc_in_bracket_pattern1992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_bracket_pattern2018 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020010000L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern2020 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_COLON_in_bracket_pattern2023 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L,0x0000000000050000L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern2025 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L,0x0000000000050000L});
    public static final BitSet FOLLOW_typeannotation_in_bracket_pattern2028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_bracket_pattern2043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_ARROW_in_arrow_or_assign2053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGN_in_arrow_or_assign2064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracket_pattern_in_mselem_pattern2079 = new BitSet(new long[]{0x0000000200000002L,0x0000000000000000L,0x00000000000100C0L});
    public static final BitSet FOLLOW_NL_in_mselem_pattern2082 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000000L,0x00000000000100C0L});
    public static final BitSet FOLLOW_arrow_or_assign_in_mselem_pattern2085 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2498EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_mselem_pattern2087 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2498EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_bracket_pattern_in_mselem_pattern2090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Id_in_primitive_pattern2119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNDERSCORE_in_primitive_pattern2124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_String_in_primitive_pattern2133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Num_in_primitive_pattern2138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_true_in_primitive_pattern2143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_false_in_primitive_pattern2148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_nil_in_primitive_pattern2153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_infinity_in_primitive_pattern2158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_primitive_pattern2163 = new BitSet(new long[]{0x0000000000000000L,0x0000000000C00000L,0x0000000000010000L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2165 = new BitSet(new long[]{0x0000000000000000L,0x0000000000C00000L});
    public static final BitSet FOLLOW_token_infinity_in_primitive_pattern2168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_primitive_pattern2181 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000090000L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2183 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_Num_in_primitive_pattern2186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SQUARE_BRACKET_OPEN_in_primitive_pattern2199 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2498EL,0x00000000176F2300L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2202 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2498EL,0x00000000176F2300L});
    public static final BitSet FOLLOW_bracket_pattern_in_primitive_pattern2206 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002010400L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2208 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000400L});
    public static final BitSet FOLLOW_COMMA_in_primitive_pattern2213 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2498EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2215 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2498EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_bracket_pattern_in_primitive_pattern2218 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002010400L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2220 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000400L});
    public static final BitSet FOLLOW_SQUARE_BRACKET_CLOSE_in_primitive_pattern2228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROUND_BRACKET_OPEN_in_primitive_pattern2248 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2498EL,0x0000000015EF2300L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2251 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2498EL,0x0000000015EF2300L});
    public static final BitSet FOLLOW_bracket_pattern_in_primitive_pattern2255 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000810400L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2257 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800400L});
    public static final BitSet FOLLOW_COMMA_in_primitive_pattern2262 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2498EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2265 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2498EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_bracket_pattern_in_primitive_pattern2268 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000810400L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2270 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800400L});
    public static final BitSet FOLLOW_COMMA_in_primitive_pattern2276 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000810000L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2278 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_ROUND_BRACKET_CLOSE_in_primitive_pattern2285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURLY_BRACKET_OPEN_in_primitive_pattern2317 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2498EL,0x000000001D6F2300L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2320 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2498EL,0x000000001D6F2300L});
    public static final BitSet FOLLOW_mselem_pattern_in_primitive_pattern2324 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008010400L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2326 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000400L});
    public static final BitSet FOLLOW_COMMA_in_primitive_pattern2331 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2498EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2334 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2498EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_mselem_pattern_in_primitive_pattern2337 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008010400L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2339 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000400L});
    public static final BitSet FOLLOW_CURLY_BRACKET_CLOSE_in_primitive_pattern2347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURLY_BRACKET_OPEN_in_primitive_pattern2365 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000100C0L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2367 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_token_ARROW_in_primitive_pattern2370 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008010000L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2372 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_CURLY_BRACKET_CLOSE_in_primitive_pattern2375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_sep2391 = new BitSet(new long[]{0x0000000000000002L,0x0004000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_sep_in_block2407 = new BitSet(new long[]{0x8000000000000000L,0x241000F9FFD2CD8EL,0x00000003D56F2300L});
    public static final BitSet FOLLOW_statement_in_block2410 = new BitSet(new long[]{0x0000000000000002L,0x0004000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_sep_in_block2413 = new BitSet(new long[]{0x8000000000000000L,0x241000F9FFD2CD8EL,0x00000003D56F2300L});
    public static final BitSet FOLLOW_statement_in_block2415 = new BitSet(new long[]{0x0000000000000002L,0x0004000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_sep_in_block2419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sep_in_block2435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_pure_block2452 = new BitSet(new long[]{0x0000000000000002L,0x0004000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_sep_in_pure_block2455 = new BitSet(new long[]{0x8000000000000000L,0x241000F9FFD2CD8EL,0x00000003D56F2300L});
    public static final BitSet FOLLOW_statement_in_pure_block2457 = new BitSet(new long[]{0x0000000000000002L,0x0004000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_st_typedef_in_statement2478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_val_in_statement2489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_def_in_statement2494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_yield_in_statement2499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_memoize_in_statement2504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_private_in_statement2509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_module_in_statement2514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_import_in_statement2519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_or_assign_in_statement2524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRAGMA_PRINT_in_statement2530 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_expr_in_statement2532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRAGMA_LOG_in_statement2546 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_expr_in_statement2548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRAGMA_PROFILE_in_statement2562 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_expr_in_statement2564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRAGMA_ASSERT_in_statement2578 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_expr_in_statement2580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Id_in_objelem_assign2598 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_PERIOD_in_objelem_assign2600 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_Id_in_objelem_assign2602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_val_in_st_val2621 = new BitSet(new long[]{0x0000000000000000L,0x0010000130C20000L,0x00000000156F0300L});
    public static final BitSet FOLLOW_NL_in_st_val2623 = new BitSet(new long[]{0x0000000000000000L,0x0010000130C20000L,0x00000000156E0300L});
    public static final BitSet FOLLOW_pattern_in_st_val2627 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_objelem_assign_in_st_val2631 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_NL_in_st_val2634 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ASSIGN_in_st_val2637 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_st_val2639 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_expr_in_st_val2642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_def_in_st_def2666 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000050000L});
    public static final BitSet FOLLOW_NL_in_st_def2668 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_Id_in_st_def2671 = new BitSet(new long[]{0x0000000200000000L,0x0010000130C00000L,0x00000000356D0000L});
    public static final BitSet FOLLOW_NL_in_st_def2673 = new BitSet(new long[]{0x0000000200000000L,0x0010000130C00000L,0x00000000356C0000L});
    public static final BitSet FOLLOW_primitive_pattern_in_st_def2677 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000000L,0x0000000020010000L});
    public static final BitSet FOLLOW_NL_in_st_def2679 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_COLON_in_st_def2685 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000050000L});
    public static final BitSet FOLLOW_NL_in_st_def2687 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_typeid_in_st_def2690 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_NL_in_st_def2692 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ASSIGN_in_st_def2697 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_st_def2699 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_expr_in_st_def2702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_def_in_st_def2728 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_NL_in_st_def2730 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_L_this_in_st_def2733 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020010000L});
    public static final BitSet FOLLOW_NL_in_st_def2735 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_COLON_in_st_def2738 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000050000L});
    public static final BitSet FOLLOW_NL_in_st_def2740 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_typeid_in_st_def2743 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_NL_in_st_def2745 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ASSIGN_in_st_def2748 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_st_def2750 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_expr_in_st_def2753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_typedef_in_st_typedef2776 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000050000L});
    public static final BitSet FOLLOW_NL_in_st_typedef2778 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_Id_in_st_typedef2781 = new BitSet(new long[]{0x0000000000000000L,0x0010000130C00000L,0x00000000156D0000L});
    public static final BitSet FOLLOW_NL_in_st_typedef2783 = new BitSet(new long[]{0x0000000000000000L,0x0010000130C00000L,0x00000000156D0000L});
    public static final BitSet FOLLOW_typedef_clause_in_st_typedef2786 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000010400L});
    public static final BitSet FOLLOW_NL_in_st_typedef2789 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_COMMA_in_st_typedef2792 = new BitSet(new long[]{0x0000000000000000L,0x0010000130C00000L,0x00000000156D0000L});
    public static final BitSet FOLLOW_NL_in_st_typedef2794 = new BitSet(new long[]{0x0000000000000000L,0x0010000130C00000L,0x00000000156D0000L});
    public static final BitSet FOLLOW_typedef_clause_in_st_typedef2797 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000010400L});
    public static final BitSet FOLLOW_primitive_pattern_in_typedef_clause2835 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_NL_in_typedef_clause2837 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ASSIGN_in_typedef_clause2840 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_typedef_clause2842 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_expr_in_typedef_clause2845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitive_pattern_in_typedef_clause2860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_yield_in_st_yield2879 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_expr_in_st_yield2881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_memoize_in_st_memoize2902 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000440000L});
    public static final BitSet FOLLOW_memo_id_in_st_memoize2904 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000010400L});
    public static final BitSet FOLLOW_NL_in_st_memoize2907 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_COMMA_in_st_memoize2910 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000450000L});
    public static final BitSet FOLLOW_NL_in_st_memoize2912 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000440000L});
    public static final BitSet FOLLOW_memo_id_in_st_memoize2915 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000010400L});
    public static final BitSet FOLLOW_Id_in_memo_id2944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROUND_BRACKET_OPEN_in_memo_id2957 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_Id_in_memo_id2959 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_ROUND_BRACKET_CLOSE_in_memo_id2961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_private_in_st_private2978 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000440000L});
    public static final BitSet FOLLOW_private_id_in_st_private2980 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000010400L});
    public static final BitSet FOLLOW_NL_in_st_private2983 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_COMMA_in_st_private2986 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000450000L});
    public static final BitSet FOLLOW_NL_in_st_private2988 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000440000L});
    public static final BitSet FOLLOW_private_id_in_st_private2991 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000010400L});
    public static final BitSet FOLLOW_Id_in_private_id3017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROUND_BRACKET_OPEN_in_private_id3030 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_Id_in_private_id3032 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_ROUND_BRACKET_CLOSE_in_private_id3034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Id_in_moduleid3053 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000010800L});
    public static final BitSet FOLLOW_NL_in_moduleid3056 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_PERIOD_in_moduleid3059 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000050000L});
    public static final BitSet FOLLOW_NL_in_moduleid3061 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_Id_in_moduleid3064 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000010800L});
    public static final BitSet FOLLOW_L_module_in_st_module3084 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000050000L});
    public static final BitSet FOLLOW_NL_in_st_module3086 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000050000L});
    public static final BitSet FOLLOW_moduleid_in_st_module3089 = new BitSet(new long[]{0x8000000000000000L,0x241400F9FFD2CD8FL,0x00000003D56F2300L});
    public static final BitSet FOLLOW_block_in_st_module3091 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_L_end_in_st_module3093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Id_in_importid3113 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000010800L});
    public static final BitSet FOLLOW_NL_in_importid3116 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_PERIOD_in_importid3119 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000050000L});
    public static final BitSet FOLLOW_NL_in_importid3121 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_Id_in_importid3124 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000010800L});
    public static final BitSet FOLLOW_importall_in_importid3128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERIOD_in_importall3155 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_UNDERSCORE_in_importall3157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_import_in_st_import3172 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000050000L});
    public static final BitSet FOLLOW_NL_in_st_import3174 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000050000L});
    public static final BitSet FOLLOW_importid_in_st_import3178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_expr_or_assign3214 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_objelem_assign_in_expr_or_assign3218 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_NL_in_expr_or_assign3221 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ASSIGN_in_expr_or_assign3224 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_expr_or_assign3226 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_expr_in_expr_or_assign3229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_or_assign3248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lop_expr_in_expr3259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_obj_expr_in_expr3264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_expr_in_control_expr3274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_do_expr_in_control_expr3279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_match_expr_in_control_expr3284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_expr_in_control_expr3289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_try_expr_in_control_expr3295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_begin_end_in_control_expr3300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_control_expr_in_with_control_expr3310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_with_in_with_control_expr3315 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_with_control_expr3317 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_protected_expr_in_with_control_expr3320 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L,0x0000000000010000L});
    public static final BitSet FOLLOW_NL_in_with_control_expr3322 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_L_do_in_with_control_expr3325 = new BitSet(new long[]{0x8000000000000000L,0x241400F9FFD2CD8FL,0x00000003D56F2300L});
    public static final BitSet FOLLOW_block_in_with_control_expr3327 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_L_end_in_with_control_expr3329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_lop_expr_in_protected_expr3354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_obj_expr_in_protected_expr3359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protected_expr_in_protected_expr_nc3370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_begin_in_begin_end3380 = new BitSet(new long[]{0x8000000000000000L,0x241400F9FFD2CD8FL,0x00000003D56F2300L});
    public static final BitSet FOLLOW_block_in_begin_end3382 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_L_end_in_begin_end3384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_parents3402 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156E2300L});
    public static final BitSet FOLLOW_primitive_expr_in_parents3404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIMES_in_parents3417 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156E2300L});
    public static final BitSet FOLLOW_primitive_expr_in_parents3419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_obj_in_obj_expr3447 = new BitSet(new long[]{0x0000000000000000L,0x0028000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_NL_in_obj_expr3449 = new BitSet(new long[]{0x0000000000000000L,0x0028000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_parents_in_obj_expr3452 = new BitSet(new long[]{0x8000000000000000L,0x241400F9FFD2CD8FL,0x00000003D56F2300L});
    public static final BitSet FOLLOW_block_in_obj_expr3454 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_L_end_in_obj_expr3456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_obj_in_obj_expr3484 = new BitSet(new long[]{0x8000000000000000L,0x241400F9FFD2CD8FL,0x00000003D56F2300L});
    public static final BitSet FOLLOW_block_in_obj_expr3486 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_L_end_in_obj_expr3488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_expr_in_lop_expr3516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_expr_nobrackets_in_lop_expr3527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_op_expr_in_lop_expr3532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_expr_in_p_lop_expr3548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_expr_nobrackets_in_p_lop_expr3559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_op_expr_in_p_lop_expr3564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_if_in_if_expr3574 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_if_expr3576 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_protected_expr_in_if_expr3579 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L,0x0000000000010000L});
    public static final BitSet FOLLOW_NL_in_if_expr3581 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_L_then_in_if_expr3584 = new BitSet(new long[]{0x8000000000000000L,0x241400F9FFD2CDEFL,0x00000003D56F2300L});
    public static final BitSet FOLLOW_block_in_if_expr3586 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000061L});
    public static final BitSet FOLLOW_L_elseif_in_if_expr3592 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_if_expr3594 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_protected_expr_in_if_expr3597 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L,0x0000000000010000L});
    public static final BitSet FOLLOW_NL_in_if_expr3599 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_L_then_in_if_expr3602 = new BitSet(new long[]{0x8000000000000000L,0x241400F9FFD2CDEFL,0x00000003D56F2300L});
    public static final BitSet FOLLOW_block_in_if_expr3604 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000061L});
    public static final BitSet FOLLOW_L_else_in_if_expr3612 = new BitSet(new long[]{0x8000000000000000L,0x241400F9FFD2CD8FL,0x00000003D56F2300L});
    public static final BitSet FOLLOW_block_in_if_expr3614 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_L_end_in_if_expr3618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_while_in_while_do_expr3642 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_while_do_expr3644 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_protected_expr_in_while_do_expr3647 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L,0x0000000000010000L});
    public static final BitSet FOLLOW_NL_in_while_do_expr3649 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_L_do_in_while_do_expr3652 = new BitSet(new long[]{0x8000000000000000L,0x241400F9FFD2CD8FL,0x00000003D56F2300L});
    public static final BitSet FOLLOW_block_in_while_do_expr3654 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_L_end_in_while_do_expr3656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_full_cases_in_cases3686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_cases3691 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010030L});
    public static final BitSet FOLLOW_NL_in_cases3693 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010030L});
    public static final BitSet FOLLOW_token_DOUBLE_ARROW_in_cases3696 = new BitSet(new long[]{0x8000000000000000L,0x241400F9FFD2CD8EL,0x00000003D56F2300L});
    public static final BitSet FOLLOW_block_in_cases3698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_case_expr_in_full_cases3721 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_L_case_in_case_expr3742 = new BitSet(new long[]{0x0000000000000000L,0x0010000130C20000L,0x00000000156F0300L});
    public static final BitSet FOLLOW_NL_in_case_expr3744 = new BitSet(new long[]{0x0000000000000000L,0x0010000130C20000L,0x00000000156E0300L});
    public static final BitSet FOLLOW_pattern_in_case_expr3747 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010030L});
    public static final BitSet FOLLOW_NL_in_case_expr3749 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010030L});
    public static final BitSet FOLLOW_token_DOUBLE_ARROW_in_case_expr3752 = new BitSet(new long[]{0x8000000000000000L,0x241400F9FFD2CD8EL,0x00000003D56F2300L});
    public static final BitSet FOLLOW_block_in_case_expr3754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_match_in_match_expr3775 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_match_expr3777 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156E2300L});
    public static final BitSet FOLLOW_p_op_expr_in_match_expr3780 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L,0x0000000000010000L});
    public static final BitSet FOLLOW_NL_in_match_expr3782 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L,0x0000000000010000L});
    public static final BitSet FOLLOW_full_cases_in_match_expr3785 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_L_end_in_match_expr3787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_try_in_try_expr3813 = new BitSet(new long[]{0x8000000000000000L,0x241000F9FFD2CD8EL,0x00000003D56F2300L});
    public static final BitSet FOLLOW_NL_in_try_expr3815 = new BitSet(new long[]{0x8000000000000000L,0x241000F9FFD2CD8EL,0x00000003D56F2300L});
    public static final BitSet FOLLOW_pure_block_in_try_expr3818 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L,0x0000000000010000L});
    public static final BitSet FOLLOW_NL_in_try_expr3820 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_L_catch_in_try_expr3823 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L,0x0000000000010000L});
    public static final BitSet FOLLOW_NL_in_try_expr3825 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L,0x0000000000010000L});
    public static final BitSet FOLLOW_full_cases_in_try_expr3828 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_L_end_in_try_expr3830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROUND_BRACKET_OPEN_in_lambda_expr3854 = new BitSet(new long[]{0x0000000000000000L,0x0010000130C21000L,0x00000000156F0300L});
    public static final BitSet FOLLOW_NL_in_lambda_expr3856 = new BitSet(new long[]{0x0000000000000000L,0x0010000130C21000L,0x00000000156F0300L});
    public static final BitSet FOLLOW_lambda_cases_in_lambda_expr3859 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000810000L});
    public static final BitSet FOLLOW_NL_in_lambda_expr3861 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_ROUND_BRACKET_CLOSE_in_lambda_expr3864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_cases_nobrackets_in_lambda_expr_nobrackets3883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_lambda_cases_nobrackets3901 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010030L});
    public static final BitSet FOLLOW_NL_in_lambda_cases_nobrackets3903 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010030L});
    public static final BitSet FOLLOW_token_DOUBLE_ARROW_in_lambda_cases_nobrackets3906 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_lambda_cases_nobrackets3908 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156E2300L});
    public static final BitSet FOLLOW_lop_expr_in_lambda_cases_nobrackets3911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_case_in_lambda_case_expr3939 = new BitSet(new long[]{0x0000000000000000L,0x0010000130C20000L,0x00000000156F0300L});
    public static final BitSet FOLLOW_NL_in_lambda_case_expr3941 = new BitSet(new long[]{0x0000000000000000L,0x0010000130C20000L,0x00000000156E0300L});
    public static final BitSet FOLLOW_pattern_in_lambda_case_expr3944 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010030L});
    public static final BitSet FOLLOW_NL_in_lambda_case_expr3946 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010030L});
    public static final BitSet FOLLOW_token_DOUBLE_ARROW_in_lambda_case_expr3949 = new BitSet(new long[]{0x8000000000000000L,0x241000F9FFD2CD8EL,0x00000003D56F2300L});
    public static final BitSet FOLLOW_NL_in_lambda_case_expr3951 = new BitSet(new long[]{0x8000000000000000L,0x241000F9FFD2CD8EL,0x00000003D56F2300L});
    public static final BitSet FOLLOW_pure_block_in_lambda_case_expr3954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_lambda_cases3975 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010030L});
    public static final BitSet FOLLOW_NL_in_lambda_cases3977 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010030L});
    public static final BitSet FOLLOW_token_DOUBLE_ARROW_in_lambda_cases3980 = new BitSet(new long[]{0x8000000000000000L,0x241000F9FFD2CD8EL,0x00000003D56F2300L});
    public static final BitSet FOLLOW_NL_in_lambda_cases3982 = new BitSet(new long[]{0x8000000000000000L,0x241000F9FFD2CD8EL,0x00000003D56F2300L});
    public static final BitSet FOLLOW_pure_block_in_lambda_cases3985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_case_expr_in_lambda_cases4004 = new BitSet(new long[]{0x0000000000000002L,0x0010000130C21000L,0x00000000156F0300L});
    public static final BitSet FOLLOW_NL_in_lambda_cases4007 = new BitSet(new long[]{0x0000000000000000L,0x0010000130C21000L,0x00000000156F0300L});
    public static final BitSet FOLLOW_lambda_case_expr_in_lambda_cases4010 = new BitSet(new long[]{0x0000000000000002L,0x0010000130C21000L,0x00000000156F0300L});
    public static final BitSet FOLLOW_L_for_in_for_expr4028 = new BitSet(new long[]{0x0000000000000000L,0x0010000130C20000L,0x00000000156F0300L});
    public static final BitSet FOLLOW_NL_in_for_expr4030 = new BitSet(new long[]{0x0000000000000000L,0x0010000130C20000L,0x00000000156E0300L});
    public static final BitSet FOLLOW_pattern_in_for_expr4033 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L,0x0000000000010000L});
    public static final BitSet FOLLOW_NL_in_for_expr4035 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_L_in_in_for_expr4038 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_for_expr4040 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_protected_expr_in_for_expr4043 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L,0x0000000000010000L});
    public static final BitSet FOLLOW_NL_in_for_expr4045 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_L_do_in_for_expr4048 = new BitSet(new long[]{0x8000000000000000L,0x241400F9FFD2CD8FL,0x00000003D56F2300L});
    public static final BitSet FOLLOW_block_in_for_expr4050 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_L_end_in_for_expr4052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_builtin_primitive_in_op_expr4077 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156E2300L});
    public static final BitSet FOLLOW_op_expr_in_op_expr4080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bool_expr_in_op_expr4085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_builtin_primitive_in_p_op_expr4095 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_p_op_expr4098 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156E2300L});
    public static final BitSet FOLLOW_p_op_expr_in_p_op_expr4102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_bool_expr_in_p_op_expr4107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_builtin_primitive0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bool_or_expr_in_bool_expr4151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_bool_or_expr_in_p_bool_expr4161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bool_and_expr_in_bool_or_expr4170 = new BitSet(new long[]{0x0000000000000002L,0x0900000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_NL_in_bool_or_expr4173 = new BitSet(new long[]{0x0000000000000000L,0x0900000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_token_OR_in_bool_or_expr4177 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_bool_or_expr4180 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156E2300L});
    public static final BitSet FOLLOW_bool_and_expr_in_bool_or_expr4184 = new BitSet(new long[]{0x0000000000000002L,0x0900000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_p_bool_and_expr_in_p_bool_or_expr4196 = new BitSet(new long[]{0x0000000000000002L,0x0900000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_NL_in_p_bool_or_expr4199 = new BitSet(new long[]{0x0000000000000000L,0x0900000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_token_OR_in_p_bool_or_expr4203 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_p_bool_or_expr4206 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156E2300L});
    public static final BitSet FOLLOW_p_bool_and_expr_in_p_bool_or_expr4210 = new BitSet(new long[]{0x0000000000000002L,0x0900000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_bool_not_expr_in_bool_and_expr4222 = new BitSet(new long[]{0x0000000000000002L,0x1200000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_NL_in_bool_and_expr4225 = new BitSet(new long[]{0x0000000000000000L,0x1200000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_token_AND_in_bool_and_expr4229 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_bool_and_expr4232 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156E2300L});
    public static final BitSet FOLLOW_bool_not_expr_in_bool_and_expr4236 = new BitSet(new long[]{0x0000000000000002L,0x1200000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_p_bool_not_expr_in_p_bool_and_expr4248 = new BitSet(new long[]{0x0000000000000002L,0x1200000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_NL_in_p_bool_and_expr4251 = new BitSet(new long[]{0x0000000000000000L,0x1200000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_token_AND_in_p_bool_and_expr4255 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_p_bool_and_expr4258 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156E2300L});
    public static final BitSet FOLLOW_p_bool_not_expr_in_p_bool_and_expr4262 = new BitSet(new long[]{0x0000000000000002L,0x1200000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_token_NOT_in_bool_not_expr4274 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_bool_not_expr4277 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156E2300L});
    public static final BitSet FOLLOW_bool_not_expr_in_bool_not_expr4281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rel_expr_in_bool_not_expr4286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_NOT_in_p_bool_not_expr4297 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_p_bool_not_expr4300 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156E2300L});
    public static final BitSet FOLLOW_p_bool_not_expr_in_p_bool_not_expr4304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_rel_expr_in_p_bool_not_expr4309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arith_expr_in_rel_expr4318 = new BitSet(new long[]{0x0000000000000002L,0x0003FF0000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_NL_in_rel_expr4321 = new BitSet(new long[]{0x0000000000000000L,0x0003FF0000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_rel_op_in_rel_expr4324 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_rel_expr4326 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156E2300L});
    public static final BitSet FOLLOW_arith_expr_in_rel_expr4329 = new BitSet(new long[]{0x0000000000000002L,0x0003FF0000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_p_arith_expr_in_p_rel_expr4356 = new BitSet(new long[]{0x0000000000000002L,0x0003FF0000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_NL_in_p_rel_expr4359 = new BitSet(new long[]{0x0000000000000000L,0x0003FF0000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_rel_op_in_p_rel_expr4362 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_p_rel_expr4364 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156E2300L});
    public static final BitSet FOLLOW_p_arith_expr_in_p_rel_expr4367 = new BitSet(new long[]{0x0000000000000002L,0x0003FF0000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_token_EQUAL_in_rel_op4393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_NOT_EQUAL_in_rel_op4397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATER_in_rel_op4401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_GREATER_EQ_in_rel_op4405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_in_rel_op4409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_LESS_EQ_in_rel_op4413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_plusplus_expr_in_arith_expr4425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_plusplus_expr_in_p_arith_expr4435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timestimes_expr_in_plusplus_expr4445 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x000000000001000CL});
    public static final BitSet FOLLOW_NL_in_plusplus_expr4448 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_PLUSPLUS_in_plusplus_expr4453 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156F2300L});
    public static final BitSet FOLLOW_MINUSMINUS_in_plusplus_expr4456 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_plusplus_expr4460 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156E2300L});
    public static final BitSet FOLLOW_timestimes_expr_in_plusplus_expr4464 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x000000000001000CL});
    public static final BitSet FOLLOW_p_timestimes_expr_in_p_plusplus_expr4476 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x000000000001000CL});
    public static final BitSet FOLLOW_NL_in_p_plusplus_expr4479 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_PLUSPLUS_in_p_plusplus_expr4484 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156F2300L});
    public static final BitSet FOLLOW_MINUSMINUS_in_p_plusplus_expr4487 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_p_plusplus_expr4491 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156E2300L});
    public static final BitSet FOLLOW_p_timestimes_expr_in_p_plusplus_expr4495 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x000000000001000CL});
    public static final BitSet FOLLOW_simple_expr_in_timestimes_expr4507 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000010003L});
    public static final BitSet FOLLOW_NL_in_timestimes_expr4510 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_TIMESTIMES_in_timestimes_expr4515 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156F2300L});
    public static final BitSet FOLLOW_QUOTIENTQUOTIENT_in_timestimes_expr4518 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_timestimes_expr4522 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156E2300L});
    public static final BitSet FOLLOW_simple_expr_in_timestimes_expr4526 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000010003L});
    public static final BitSet FOLLOW_p_simple_expr_in_p_timestimes_expr4539 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000010003L});
    public static final BitSet FOLLOW_NL_in_p_timestimes_expr4542 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_TIMESTIMES_in_p_timestimes_expr4547 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156F2300L});
    public static final BitSet FOLLOW_QUOTIENTQUOTIENT_in_p_timestimes_expr4550 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_p_timestimes_expr4554 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156E2300L});
    public static final BitSet FOLLOW_p_simple_expr_in_p_timestimes_expr4558 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000010003L});
    public static final BitSet FOLLOW_cons_expr_in_simple_expr4569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_cons_expr_in_p_simple_expr4578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_to_expr_in_cons_expr4587 = new BitSet(new long[]{0x0000000000000002L,0xC000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_NL_in_cons_expr4590 = new BitSet(new long[]{0x0000000000000000L,0xC000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_token_DOUBLE_COLON_in_cons_expr4593 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_cons_expr4595 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156E2300L});
    public static final BitSet FOLLOW_to_expr_in_cons_expr4598 = new BitSet(new long[]{0x0000000000000002L,0xC000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_p_to_expr_in_p_cons_expr4618 = new BitSet(new long[]{0x0000000000000002L,0xC000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_NL_in_p_cons_expr4621 = new BitSet(new long[]{0x0000000000000000L,0xC000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_token_DOUBLE_COLON_in_p_cons_expr4624 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_p_cons_expr4626 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156E2300L});
    public static final BitSet FOLLOW_p_to_expr_in_p_cons_expr4629 = new BitSet(new long[]{0x0000000000000002L,0xC000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_arith_plus_expr_in_to_expr4649 = new BitSet(new long[]{0x0000000000000002L,0x00000000000C0000L,0x0000000000010000L});
    public static final BitSet FOLLOW_NL_in_to_expr4652 = new BitSet(new long[]{0x0000000000000000L,0x00000000000C0000L});
    public static final BitSet FOLLOW_L_to_in_to_expr4657 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156F2300L});
    public static final BitSet FOLLOW_L_downto_in_to_expr4661 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_to_expr4665 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156E2300L});
    public static final BitSet FOLLOW_arith_plus_expr_in_to_expr4669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_arith_plus_expr_in_p_to_expr4682 = new BitSet(new long[]{0x0000000000000002L,0x00000000000C0000L,0x0000000000010000L});
    public static final BitSet FOLLOW_NL_in_p_to_expr4685 = new BitSet(new long[]{0x0000000000000000L,0x00000000000C0000L});
    public static final BitSet FOLLOW_L_to_in_p_to_expr4690 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156F2300L});
    public static final BitSet FOLLOW_L_downto_in_p_to_expr4694 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_p_to_expr4698 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156E2300L});
    public static final BitSet FOLLOW_p_arith_plus_expr_in_p_to_expr4702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arith_uminus_expr_in_arith_plus_expr4714 = new BitSet(new long[]{0x0000000000000002L,0x0018000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_NL_in_arith_plus_expr4718 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_PLUS_in_arith_plus_expr4722 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156F2300L});
    public static final BitSet FOLLOW_MINUS_in_arith_plus_expr4727 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_arith_plus_expr4731 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156E2300L});
    public static final BitSet FOLLOW_arith_uminus_expr_in_arith_plus_expr4735 = new BitSet(new long[]{0x0000000000000002L,0x0018000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_p_arith_uminus_expr_in_p_arith_plus_expr4746 = new BitSet(new long[]{0x0000000000000002L,0x0018000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_NL_in_p_arith_plus_expr4749 = new BitSet(new long[]{0x0000000000000000L,0x0018000000000000L});
    public static final BitSet FOLLOW_set_in_p_arith_plus_expr4753 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_p_arith_plus_expr4762 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156E2300L});
    public static final BitSet FOLLOW_p_arith_uminus_expr_in_p_arith_plus_expr4766 = new BitSet(new long[]{0x0000000000000002L,0x0018000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_MINUS_in_arith_uminus_expr4779 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_arith_uminus_expr4781 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156E2300L});
    public static final BitSet FOLLOW_arith_mult_expr_in_arith_uminus_expr4784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arith_mult_expr_in_arith_uminus_expr4797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_p_arith_uminus_expr4808 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_p_arith_uminus_expr4810 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156E2300L});
    public static final BitSet FOLLOW_p_arith_mult_expr_in_p_arith_uminus_expr4813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_arith_mult_expr_in_p_arith_uminus_expr4826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arith_pow_expr_in_arith_mult_expr4835 = new BitSet(new long[]{0x0000000000000002L,0x0060000600000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_NL_in_arith_mult_expr4838 = new BitSet(new long[]{0x0000000000000000L,0x0060000600000000L});
    public static final BitSet FOLLOW_set_in_arith_mult_expr4842 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_arith_mult_expr4859 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156E2300L});
    public static final BitSet FOLLOW_arith_pow_expr_in_arith_mult_expr4863 = new BitSet(new long[]{0x0000000000000002L,0x0060000600000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_p_arith_pow_expr_in_p_arith_mult_expr4875 = new BitSet(new long[]{0x0000000000000002L,0x0060000600000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_NL_in_p_arith_mult_expr4878 = new BitSet(new long[]{0x0000000000000000L,0x0060000600000000L});
    public static final BitSet FOLLOW_set_in_p_arith_mult_expr4882 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_p_arith_mult_expr4899 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156E2300L});
    public static final BitSet FOLLOW_p_arith_pow_expr_in_p_arith_mult_expr4903 = new BitSet(new long[]{0x0000000000000002L,0x0060000600000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_apply_expr_in_arith_pow_expr4914 = new BitSet(new long[]{0x0000000000000002L,0x0080000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_NL_in_arith_pow_expr4917 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_POW_tok_in_arith_pow_expr4920 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_arith_pow_expr4922 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156E2300L});
    public static final BitSet FOLLOW_apply_expr_in_arith_pow_expr4925 = new BitSet(new long[]{0x0000000000000002L,0x0080000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_p_apply_expr_in_p_arith_pow_expr4946 = new BitSet(new long[]{0x0000000000000002L,0x0080000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_NL_in_p_arith_pow_expr4949 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_POW_tok_in_p_arith_pow_expr4952 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_p_arith_pow_expr4954 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156E2300L});
    public static final BitSet FOLLOW_p_apply_expr_in_p_arith_pow_expr4957 = new BitSet(new long[]{0x0000000000000002L,0x0080000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_basic_expr_in_apply_expr4978 = new BitSet(new long[]{0x8000000000000002L,0x24100021F7D2098CL,0x00000000156E2300L});
    public static final BitSet FOLLOW_p_basic_expr_in_p_apply_expr4996 = new BitSet(new long[]{0x8000000000000002L,0x24100021F7D2098CL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_p_apply_expr4999 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098CL,0x00000000156E2300L});
    public static final BitSet FOLLOW_p_basic_expr_in_p_apply_expr5002 = new BitSet(new long[]{0x8000000000000002L,0x24100021F7D2098CL,0x00000000156F2300L});
    public static final BitSet FOLLOW_message_send_expr_in_basic_expr5022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_message_send_expr_in_p_basic_expr5031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitive_expr_in_message_send_expr5040 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000010800L});
    public static final BitSet FOLLOW_NL_in_message_send_expr5043 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_PERIOD_in_message_send_expr5046 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000050000L});
    public static final BitSet FOLLOW_NL_in_message_send_expr5048 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_Id_in_message_send_expr5051 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000010800L});
    public static final BitSet FOLLOW_SQUARE_BRACKET_OPEN_in_list_expr5075 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098EL,0x00000000176F2300L});
    public static final BitSet FOLLOW_NL_in_list_expr5077 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098EL,0x00000000176F2300L});
    public static final BitSet FOLLOW_protected_expr_nc_in_list_expr5081 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002010400L});
    public static final BitSet FOLLOW_NL_in_list_expr5084 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_COMMA_in_list_expr5087 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_list_expr5089 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_protected_expr_nc_in_list_expr5092 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002010400L});
    public static final BitSet FOLLOW_NL_in_list_expr5096 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_SQUARE_BRACKET_CLOSE_in_list_expr5101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROUND_BRACKET_OPEN_in_list_expr5115 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098EL,0x0000000015EF2300L});
    public static final BitSet FOLLOW_NL_in_list_expr5117 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098EL,0x0000000015EF2300L});
    public static final BitSet FOLLOW_protected_expr_nc_in_list_expr5121 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000810400L});
    public static final BitSet FOLLOW_NL_in_list_expr5124 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_COMMA_in_list_expr5127 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_list_expr5129 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_protected_expr_nc_in_list_expr5132 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000810400L});
    public static final BitSet FOLLOW_NL_in_list_expr5136 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800400L});
    public static final BitSet FOLLOW_COMMA_in_list_expr5140 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000810000L});
    public static final BitSet FOLLOW_NL_in_list_expr5142 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_ROUND_BRACKET_CLOSE_in_list_expr5149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURLY_BRACKET_OPEN_in_map_or_set_expr5178 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098EL,0x000000001D6F2300L});
    public static final BitSet FOLLOW_NL_in_map_or_set_expr5180 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098EL,0x000000001D6F2300L});
    public static final BitSet FOLLOW_map_or_set_elem_expr_in_map_or_set_expr5184 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008010400L});
    public static final BitSet FOLLOW_NL_in_map_or_set_expr5186 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000400L});
    public static final BitSet FOLLOW_COMMA_in_map_or_set_expr5190 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_map_or_set_expr5192 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_map_or_set_elem_expr_in_map_or_set_expr5195 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008010400L});
    public static final BitSet FOLLOW_NL_in_map_or_set_expr5197 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000400L});
    public static final BitSet FOLLOW_CURLY_BRACKET_CLOSE_in_map_or_set_expr5204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURLY_BRACKET_OPEN_in_map_or_set_expr5224 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000100C0L});
    public static final BitSet FOLLOW_NL_in_map_or_set_expr5226 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_token_ARROW_in_map_or_set_expr5229 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008010000L});
    public static final BitSet FOLLOW_NL_in_map_or_set_expr5231 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_CURLY_BRACKET_CLOSE_in_map_or_set_expr5234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protected_expr_nc_in_map_or_set_elem_expr5251 = new BitSet(new long[]{0x0000000200000002L,0x0000000000000000L,0x00000000000100C0L});
    public static final BitSet FOLLOW_NL_in_map_or_set_elem_expr5254 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000000L,0x00000000000100C0L});
    public static final BitSet FOLLOW_arrow_or_assign_in_map_or_set_elem_expr5257 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_NL_in_map_or_set_elem_expr5259 = new BitSet(new long[]{0x8000000000000000L,0x24100021F7D2098EL,0x00000000156F2300L});
    public static final BitSet FOLLOW_protected_expr_nc_in_map_or_set_elem_expr5262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROUND_BRACKET_OPEN_in_type_expr5289 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020010000L});
    public static final BitSet FOLLOW_NL_in_type_expr5291 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_COLON_in_type_expr5294 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000050000L});
    public static final BitSet FOLLOW_NL_in_type_expr5296 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_typeid_in_type_expr5299 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000810000L});
    public static final BitSet FOLLOW_NL_in_type_expr5301 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_ROUND_BRACKET_CLOSE_in_type_expr5304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Num_in_primitive_expr5321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_String_in_primitive_expr5326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Id_in_primitive_expr5331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Constr_in_primitive_expr5336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_true_in_primitive_expr5341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_false_in_primitive_expr5346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_this_in_primitive_expr5351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_nil_in_primitive_expr5357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_expr_in_primitive_expr5362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_infinity_in_primitive_expr5367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_list_expr_in_primitive_expr5373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_with_control_expr_in_primitive_expr5378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_map_or_set_expr_in_primitive_expr5383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Id_in_synpred1_babel171802 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L,0x0000000000010000L});
    public static final BitSet FOLLOW_NL_in_synpred1_babel171804 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_L_as_in_synpred1_babel171807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protected_expr_in_synpred2_babel171838 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000011000L});
    public static final BitSet FOLLOW_NL_in_synpred2_babel171840 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_QUESTION_MARK_in_synpred2_babel171843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Id_in_synpred3_babel171881 = new BitSet(new long[]{0x0000000000000000L,0x0010000130C20000L,0x00000000156E0300L});
    public static final BitSet FOLLOW_pattern_in_synpred3_babel171883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_synpred4_babel171972 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L,0x0000000000010000L});
    public static final BitSet FOLLOW_NL_in_synpred4_babel171974 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_L_if_in_synpred4_babel171977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_synpred5_babel172008 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020010000L});
    public static final BitSet FOLLOW_NL_in_synpred5_babel172010 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_COLON_in_synpred5_babel172013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitive_pattern_in_synpred6_babel172825 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_NL_in_synpred6_babel172827 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ASSIGN_in_synpred6_babel172830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_synpred7_babel173198 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_objelem_assign_in_synpred7_babel173202 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_NL_in_synpred7_babel173205 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ASSIGN_in_synpred7_babel173208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_obj_in_synpred8_babel173437 = new BitSet(new long[]{0x0000000000000000L,0x0028000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_NL_in_synpred8_babel173439 = new BitSet(new long[]{0x0000000000000000L,0x0028000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_parents_in_synpred8_babel173442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_expr_in_synpred9_babel173511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_expr_nobrackets_in_synpred10_babel173522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_expr_in_synpred11_babel173543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_expr_nobrackets_in_synpred12_babel173554 = new BitSet(new long[]{0x0000000000000002L});

}