// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g 2011-05-06 01:20:00

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PROG", "NIL_TOKEN", "ANY", "LAMBDA", "SQUARE_LIST", "ROUND_LIST", "LIST_CONS", "COMPARE", "APPLY", "IF", "MAP_OR_SET_OR_OBJ", "EMPTY_MAP", "EXCEPTION", "MATCH", "TRY", "CASES", "OBJ", "FOR_EXPR", "WHILE_DO", "MESSAGE_SEND", "UMINUS", "POW", "PARENTS_PLUS", "PARENTS_MUL", "BLOCK", "BEGIN", "WITH", "VAL", "OBJELEM_ASSIGN", "ASSIGN", "ARROW", "DEF", "YIELD", "PRIVATE", "TYPEDEF", "TYPEDEF_CLAUSE", "GETTYPE", "MEMOIZE", "MEMOID_STRONG", "MEMOID_WEAK", "PRIVATEID_STRONG", "PRIVATEID_WEAK", "IF_PATTERN", "TYPE_PATTERN", "INNERVALUE_PATTERN", "TYPEID", "MODULEID", "TYPE_EXPR", "TYPEOF", "CONVERSION", "IMPORT_PREFIX", "IMPORT_ALL", "IMPORT_SET", "IMPORT_PLUS", "IMPORT_MINUS", "Newline", "NotNewline", "COMMENT", "LINECOMMENT", "SmallLetter", "BigLetter", "Letter", "Digit", "Hex", "L_begin", "L_end", "L_obj", "L_with", "L_if", "L_then", "L_else", "L_elseif", "L_while", "L_for", "L_do", "L_yield", "L_match", "L_case", "L_as", "L_val", "L_def", "L_in", "L_exception", "L_to", "L_downto", "L_try", "L_catch", "A_infinity", "U_infinity", "L_concurrent", "L_choose", "L_lazy", "L_memoize", "L_true", "L_false", "L_this", "L_random", "L_nil", "L_div", "L_mod", "L_module", "L_typedef", "L_typeof", "L_private", "L_import", "A_EQUAL", "U_EQUAL", "A_NOT_EQUAL", "U_NOT_EQUAL", "LESS", "A_LESS_EQ", "U_LESS_EQ", "GREATER", "A_GREATER_EQ", "U_GREATER_EQ", "SC", "PLUS", "MINUS", "TIMES", "QUOTIENT", "POW_tok", "A_OR", "A_AND", "A_NOT", "U_OR", "U_AND", "U_NOT", "A_DOUBLE_COLON", "U_DOUBLE_COLON", "TIMESTIMES", "QUOTIENTQUOTIENT", "PLUSPLUS", "MINUSMINUS", "A_DOUBLE_ARROW", "U_DOUBLE_ARROW", "A_ARROW", "U_ARROW", "A_ELLIPSIS", "U_ELLIPSIS", "COMMA", "PERIOD", "QUESTION_MARK", "L_force", "WsChar", "WS", "NL", "Constr", "Id", "Num", "Charcode", "String", "ROUND_BRACKET_OPEN", "ROUND_BRACKET_CLOSE", "SQUARE_BRACKET_OPEN", "SQUARE_BRACKET_CLOSE", "CURLY_BRACKET_OPEN", "CURLY_BRACKET_CLOSE", "UNDERSCORE", "COLON", "PRAGMA_LOG", "PRAGMA_PRINT", "PRAGMA_ASSERT", "PRAGMA_PROFILE"
    };
    public static final int U_AND=129;
    public static final int L_end=69;
    public static final int U_NOT_EQUAL=112;
    public static final int TIMESTIMES=133;
    public static final int BigLetter=64;
    public static final int L_try=89;
    public static final int ROUND_BRACKET_CLOSE=156;
    public static final int L_mod=103;
    public static final int A_OR=125;
    public static final int MINUSMINUS=136;
    public static final int IMPORT_PREFIX=54;
    public static final int Newline=59;
    public static final int SQUARE_BRACKET_CLOSE=158;
    public static final int LINECOMMENT=62;
    public static final int MAP_OR_SET_OR_OBJ=14;
    public static final int EOF=-1;
    public static final int PRIVATEID_STRONG=44;
    public static final int U_DOUBLE_ARROW=138;
    public static final int TYPEID=49;
    public static final int L_exception=86;
    public static final int Num=152;
    public static final int GREATER=116;
    public static final int EMPTY_MAP=15;
    public static final int POW=25;
    public static final int L_concurrent=93;
    public static final int L_catch=90;
    public static final int L_false=98;
    public static final int QUOTIENTQUOTIENT=134;
    public static final int L_nil=101;
    public static final int BEGIN=29;
    public static final int LIST_CONS=10;
    public static final int L_with=71;
    public static final int QUESTION_MARK=145;
    public static final int LESS=113;
    public static final int ROUND_BRACKET_OPEN=155;
    public static final int SQUARE_LIST=8;
    public static final int MODULEID=50;
    public static final int VAL=31;
    public static final int L_as=82;
    public static final int NL=149;
    public static final int MESSAGE_SEND=23;
    public static final int A_ARROW=139;
    public static final int A_DOUBLE_COLON=131;
    public static final int COMMENT=61;
    public static final int L_def=84;
    public static final int A_AND=126;
    public static final int EXCEPTION=16;
    public static final int TYPE_EXPR=51;
    public static final int L_this=99;
    public static final int IMPORT_ALL=55;
    public static final int L_force=146;
    public static final int L_choose=94;
    public static final int PERIOD=144;
    public static final int PRIVATE=37;
    public static final int L_import=108;
    public static final int SmallLetter=63;
    public static final int NIL_TOKEN=5;
    public static final int PRAGMA_PRINT=164;
    public static final int CURLY_BRACKET_OPEN=159;
    public static final int L_typedef=105;
    public static final int UNDERSCORE=161;
    public static final int MATCH=17;
    public static final int U_LESS_EQ=115;
    public static final int TRY=18;
    public static final int L_to=87;
    public static final int WS=148;
    public static final int IMPORT_MINUS=58;
    public static final int Charcode=153;
    public static final int TYPEOF=52;
    public static final int L_do=78;
    public static final int L_val=83;
    public static final int L_match=80;
    public static final int L_obj=70;
    public static final int WsChar=147;
    public static final int L_module=104;
    public static final int GETTYPE=40;
    public static final int Hex=67;
    public static final int L_private=107;
    public static final int TYPE_PATTERN=47;
    public static final int L_for=77;
    public static final int MEMOID_WEAK=43;
    public static final int Letter=65;
    public static final int PRAGMA_ASSERT=165;
    public static final int APPLY=12;
    public static final int U_ARROW=140;
    public static final int PRAGMA_LOG=163;
    public static final int A_EQUAL=109;
    public static final int L_else=74;
    public static final int DEF=35;
    public static final int L_typeof=106;
    public static final int L_begin=68;
    public static final int U_NOT=130;
    public static final int L_div=102;
    public static final int L_yield=79;
    public static final int PLUSPLUS=135;
    public static final int MEMOID_STRONG=42;
    public static final int L_while=76;
    public static final int CASES=19;
    public static final int POW_tok=124;
    public static final int IF_PATTERN=46;
    public static final int A_ELLIPSIS=141;
    public static final int PARENTS_PLUS=26;
    public static final int A_DOUBLE_ARROW=137;
    public static final int SQUARE_BRACKET_OPEN=157;
    public static final int IF=13;
    public static final int PROG=4;
    public static final int U_OR=128;
    public static final int COMMA=143;
    public static final int OBJ=20;
    public static final int MEMOIZE=41;
    public static final int U_ELLIPSIS=142;
    public static final int TYPEDEF_CLAUSE=39;
    public static final int INNERVALUE_PATTERN=48;
    public static final int YIELD=36;
    public static final int COMPARE=11;
    public static final int U_GREATER_EQ=118;
    public static final int U_EQUAL=110;
    public static final int PLUS=120;
    public static final int String=154;
    public static final int LAMBDA=7;
    public static final int L_true=97;
    public static final int Id=151;
    public static final int A_infinity=91;
    public static final int WITH=30;
    public static final int L_in=85;
    public static final int A_NOT=127;
    public static final int L_lazy=95;
    public static final int NotNewline=60;
    public static final int L_then=73;
    public static final int QUOTIENT=123;
    public static final int TYPEDEF=38;
    public static final int L_if=72;
    public static final int IMPORT_SET=56;
    public static final int CURLY_BRACKET_CLOSE=160;
    public static final int UMINUS=24;
    public static final int FOR_EXPR=21;
    public static final int Constr=150;
    public static final int WHILE_DO=22;
    public static final int PRIVATEID_WEAK=45;
    public static final int L_elseif=75;
    public static final int MINUS=121;
    public static final int Digit=66;
    public static final int L_memoize=96;
    public static final int CONVERSION=53;
    public static final int A_GREATER_EQ=117;
    public static final int ROUND_LIST=9;
    public static final int COLON=162;
    public static final int PRAGMA_PROFILE=166;
    public static final int SC=119;
    public static final int L_downto=88;
    public static final int ANY=6;
    public static final int L_random=100;
    public static final int A_NOT_EQUAL=111;
    public static final int BLOCK=28;
    public static final int ASSIGN=33;
    public static final int U_DOUBLE_COLON=132;
    public static final int OBJELEM_ASSIGN=32;
    public static final int ARROW=34;
    public static final int IMPORT_PLUS=57;
    public static final int L_case=81;
    public static final int TIMES=122;
    public static final int U_infinity=92;
    public static final int A_LESS_EQ=114;
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:130:1: prog : block EOF -> ^( PROG block ) ;
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:130:7: ( block EOF -> ^( PROG block ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:130:9: block EOF
            {
            pushFollow(FOLLOW_block_in_prog251);
            block1=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block1.getTree());
            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_prog253); if (state.failed) return retval; 
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
            // 130:19: -> ^( PROG block )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:130:22: ^( PROG block )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:198:1: token_infinity : ( A_infinity | U_infinity );
    public final babel17Parser.token_infinity_return token_infinity() throws RecognitionException {
        babel17Parser.token_infinity_return retval = new babel17Parser.token_infinity_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set3=null;

        CommonTree set3_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:199:2: ( A_infinity | U_infinity )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:241:1: token_EQUAL : ( A_EQUAL | U_EQUAL );
    public final babel17Parser.token_EQUAL_return token_EQUAL() throws RecognitionException {
        babel17Parser.token_EQUAL_return retval = new babel17Parser.token_EQUAL_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set4=null;

        CommonTree set4_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:242:2: ( A_EQUAL | U_EQUAL )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:249:1: token_NOT_EQUAL : ( A_NOT_EQUAL | U_NOT_EQUAL );
    public final babel17Parser.token_NOT_EQUAL_return token_NOT_EQUAL() throws RecognitionException {
        babel17Parser.token_NOT_EQUAL_return retval = new babel17Parser.token_NOT_EQUAL_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set5=null;

        CommonTree set5_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:250:2: ( A_NOT_EQUAL | U_NOT_EQUAL )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:258:1: token_LESS_EQ : ( A_LESS_EQ | U_LESS_EQ );
    public final babel17Parser.token_LESS_EQ_return token_LESS_EQ() throws RecognitionException {
        babel17Parser.token_LESS_EQ_return retval = new babel17Parser.token_LESS_EQ_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set6=null;

        CommonTree set6_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:259:2: ( A_LESS_EQ | U_LESS_EQ )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:268:1: token_GREATER_EQ : ( A_GREATER_EQ | U_GREATER_EQ );
    public final babel17Parser.token_GREATER_EQ_return token_GREATER_EQ() throws RecognitionException {
        babel17Parser.token_GREATER_EQ_return retval = new babel17Parser.token_GREATER_EQ_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set7=null;

        CommonTree set7_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:269:2: ( A_GREATER_EQ | U_GREATER_EQ )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:286:1: token_OR : ( A_OR | U_OR );
    public final babel17Parser.token_OR_return token_OR() throws RecognitionException {
        babel17Parser.token_OR_return retval = new babel17Parser.token_OR_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set8=null;

        CommonTree set8_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:286:9: ( A_OR | U_OR )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:287:1: token_AND : ( A_AND | U_AND );
    public final babel17Parser.token_AND_return token_AND() throws RecognitionException {
        babel17Parser.token_AND_return retval = new babel17Parser.token_AND_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set9=null;

        CommonTree set9_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:288:2: ( A_AND | U_AND )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:289:1: token_NOT : ( A_NOT | U_NOT );
    public final babel17Parser.token_NOT_return token_NOT() throws RecognitionException {
        babel17Parser.token_NOT_return retval = new babel17Parser.token_NOT_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set10=null;

        CommonTree set10_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:290:2: ( A_NOT | U_NOT )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:296:1: token_DOUBLE_COLON : ( A_DOUBLE_COLON | U_DOUBLE_COLON );
    public final babel17Parser.token_DOUBLE_COLON_return token_DOUBLE_COLON() throws RecognitionException {
        babel17Parser.token_DOUBLE_COLON_return retval = new babel17Parser.token_DOUBLE_COLON_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set11=null;

        CommonTree set11_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:297:2: ( A_DOUBLE_COLON | U_DOUBLE_COLON )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:313:1: token_DOUBLE_ARROW : ( A_DOUBLE_ARROW | U_DOUBLE_ARROW );
    public final babel17Parser.token_DOUBLE_ARROW_return token_DOUBLE_ARROW() throws RecognitionException {
        babel17Parser.token_DOUBLE_ARROW_return retval = new babel17Parser.token_DOUBLE_ARROW_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set12=null;

        CommonTree set12_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:314:2: ( A_DOUBLE_ARROW | U_DOUBLE_ARROW )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:318:1: token_ARROW : ( A_ARROW | U_ARROW );
    public final babel17Parser.token_ARROW_return token_ARROW() throws RecognitionException {
        babel17Parser.token_ARROW_return retval = new babel17Parser.token_ARROW_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set13=null;

        CommonTree set13_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:319:2: ( A_ARROW | U_ARROW )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:324:1: token_ELLIPSIS : ( A_ELLIPSIS | U_ELLIPSIS );
    public final babel17Parser.token_ELLIPSIS_return token_ELLIPSIS() throws RecognitionException {
        babel17Parser.token_ELLIPSIS_return retval = new babel17Parser.token_ELLIPSIS_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set14=null;

        CommonTree set14_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:325:2: ( A_ELLIPSIS | U_ELLIPSIS )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:395:1: typeid : Id ( ( NL )? PERIOD ( NL )? Id )* -> ^( TYPEID ( Id )* ) ;
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:395:9: ( Id ( ( NL )? PERIOD ( NL )? Id )* -> ^( TYPEID ( Id )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:395:11: Id ( ( NL )? PERIOD ( NL )? Id )*
            {
            Id15=(Token)match(input,Id,FOLLOW_Id_in_typeid1684); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Id.add(Id15);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:395:14: ( ( NL )? PERIOD ( NL )? Id )*
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
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:395:15: ( NL )? PERIOD ( NL )? Id
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:395:15: ( NL )?
            	    int alt1=2;
            	    int LA1_0 = input.LA(1);

            	    if ( (LA1_0==NL) ) {
            	        alt1=1;
            	    }
            	    switch (alt1) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:395:15: NL
            	            {
            	            NL16=(Token)match(input,NL,FOLLOW_NL_in_typeid1687); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL16);


            	            }
            	            break;

            	    }

            	    PERIOD17=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_typeid1690); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD17);

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:395:26: ( NL )?
            	    int alt2=2;
            	    int LA2_0 = input.LA(1);

            	    if ( (LA2_0==NL) ) {
            	        alt2=1;
            	    }
            	    switch (alt2) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:395:26: NL
            	            {
            	            NL18=(Token)match(input,NL,FOLLOW_NL_in_typeid1692); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL18);


            	            }
            	            break;

            	    }

            	    Id19=(Token)match(input,Id,FOLLOW_Id_in_typeid1695); if (state.failed) return retval; 
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
            // 395:35: -> ^( TYPEID ( Id )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:395:38: ^( TYPEID ( Id )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TYPEID, "TYPEID"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:395:47: ( Id )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:397:1: typeannotation : ( typeid | L_val ( NL )? protected_expr_nc -> ^( L_val protected_expr_nc ) );
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:398:2: ( typeid | L_val ( NL )? protected_expr_nc -> ^( L_val protected_expr_nc ) )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:398:4: typeid
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_typeid_in_typeannotation1715);
                    typeid20=typeid();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeid20.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:399:4: L_val ( NL )? protected_expr_nc
                    {
                    L_val21=(Token)match(input,L_val,FOLLOW_L_val_in_typeannotation1720); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_val.add(L_val21);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:399:10: ( NL )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==NL) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:399:10: NL
                            {
                            NL22=(Token)match(input,NL,FOLLOW_NL_in_typeannotation1722); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL22);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_protected_expr_nc_in_typeannotation1725);
                    protected_expr_nc23=protected_expr_nc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_protected_expr_nc.add(protected_expr_nc23.getTree());


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
                    // 399:32: -> ^( L_val protected_expr_nc )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:399:35: ^( L_val protected_expr_nc )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:402:1: pattern : ( Constr ( ( NL )? pattern )? -> ^( Constr ( pattern )? ) | primitive_pattern ( ( NL )? token_DOUBLE_COLON ( NL )? primitive_pattern )* -> ^( LIST_CONS ( primitive_pattern )* ) | L_exception ( NL )? pattern -> ^( L_exception pattern ) | token_ELLIPSIS );
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:402:9: ( Constr ( ( NL )? pattern )? -> ^( Constr ( pattern )? ) | primitive_pattern ( ( NL )? token_DOUBLE_COLON ( NL )? primitive_pattern )* -> ^( LIST_CONS ( primitive_pattern )* ) | L_exception ( NL )? pattern -> ^( L_exception pattern ) | token_ELLIPSIS )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:402:11: Constr ( ( NL )? pattern )?
                    {
                    Constr24=(Token)match(input,Constr,FOLLOW_Constr_in_pattern1742); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Constr.add(Constr24);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:402:18: ( ( NL )? pattern )?
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
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:402:19: ( NL )? pattern
                            {
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:402:19: ( NL )?
                            int alt6=2;
                            int LA6_0 = input.LA(1);

                            if ( (LA6_0==NL) ) {
                                alt6=1;
                            }
                            switch (alt6) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:402:19: NL
                                    {
                                    NL25=(Token)match(input,NL,FOLLOW_NL_in_pattern1745); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL25);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_pattern_in_pattern1748);
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
                    // 402:33: -> ^( Constr ( pattern )? )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:402:36: ^( Constr ( pattern )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_Constr.nextNode(), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:402:45: ( pattern )?
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:403:4: primitive_pattern ( ( NL )? token_DOUBLE_COLON ( NL )? primitive_pattern )*
                    {
                    pushFollow(FOLLOW_primitive_pattern_in_pattern1764);
                    primitive_pattern27=primitive_pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primitive_pattern.add(primitive_pattern27.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:403:22: ( ( NL )? token_DOUBLE_COLON ( NL )? primitive_pattern )*
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
                    	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:403:23: ( NL )? token_DOUBLE_COLON ( NL )? primitive_pattern
                    	    {
                    	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:403:23: ( NL )?
                    	    int alt8=2;
                    	    int LA8_0 = input.LA(1);

                    	    if ( (LA8_0==NL) ) {
                    	        alt8=1;
                    	    }
                    	    switch (alt8) {
                    	        case 1 :
                    	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:403:23: NL
                    	            {
                    	            NL28=(Token)match(input,NL,FOLLOW_NL_in_pattern1767); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_NL.add(NL28);


                    	            }
                    	            break;

                    	    }

                    	    pushFollow(FOLLOW_token_DOUBLE_COLON_in_pattern1770);
                    	    token_DOUBLE_COLON29=token_DOUBLE_COLON();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_token_DOUBLE_COLON.add(token_DOUBLE_COLON29.getTree());
                    	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:403:46: ( NL )?
                    	    int alt9=2;
                    	    int LA9_0 = input.LA(1);

                    	    if ( (LA9_0==NL) ) {
                    	        alt9=1;
                    	    }
                    	    switch (alt9) {
                    	        case 1 :
                    	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:403:46: NL
                    	            {
                    	            NL30=(Token)match(input,NL,FOLLOW_NL_in_pattern1772); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_NL.add(NL30);


                    	            }
                    	            break;

                    	    }

                    	    pushFollow(FOLLOW_primitive_pattern_in_pattern1775);
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
                    // 404:3: -> ^( LIST_CONS ( primitive_pattern )* )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:404:6: ^( LIST_CONS ( primitive_pattern )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LIST_CONS, "LIST_CONS"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:404:18: ( primitive_pattern )*
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:405:4: L_exception ( NL )? pattern
                    {
                    L_exception32=(Token)match(input,L_exception,FOLLOW_L_exception_in_pattern1794); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_exception.add(L_exception32);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:405:16: ( NL )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==NL) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:405:16: NL
                            {
                            NL33=(Token)match(input,NL,FOLLOW_NL_in_pattern1796); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL33);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_pattern_in_pattern1799);
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
                    // 405:28: -> ^( L_exception pattern )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:405:31: ^( L_exception pattern )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:406:4: token_ELLIPSIS
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_ELLIPSIS_in_pattern1812);
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:408:1: defpattern : ( primitive_pattern ( ( NL )? token_DOUBLE_COLON ( NL )? primitive_pattern )* -> ^( LIST_CONS ( primitive_pattern )* ) | Constr ( defpattern )? -> ^( Constr ( defpattern )? ) );
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:409:2: ( primitive_pattern ( ( NL )? token_DOUBLE_COLON ( NL )? primitive_pattern )* -> ^( LIST_CONS ( primitive_pattern )* ) | Constr ( defpattern )? -> ^( Constr ( defpattern )? ) )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:409:4: primitive_pattern ( ( NL )? token_DOUBLE_COLON ( NL )? primitive_pattern )*
                    {
                    pushFollow(FOLLOW_primitive_pattern_in_defpattern1822);
                    primitive_pattern36=primitive_pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primitive_pattern.add(primitive_pattern36.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:409:22: ( ( NL )? token_DOUBLE_COLON ( NL )? primitive_pattern )*
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
                    	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:409:23: ( NL )? token_DOUBLE_COLON ( NL )? primitive_pattern
                    	    {
                    	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:409:23: ( NL )?
                    	    int alt13=2;
                    	    int LA13_0 = input.LA(1);

                    	    if ( (LA13_0==NL) ) {
                    	        alt13=1;
                    	    }
                    	    switch (alt13) {
                    	        case 1 :
                    	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:409:23: NL
                    	            {
                    	            NL37=(Token)match(input,NL,FOLLOW_NL_in_defpattern1825); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_NL.add(NL37);


                    	            }
                    	            break;

                    	    }

                    	    pushFollow(FOLLOW_token_DOUBLE_COLON_in_defpattern1828);
                    	    token_DOUBLE_COLON38=token_DOUBLE_COLON();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_token_DOUBLE_COLON.add(token_DOUBLE_COLON38.getTree());
                    	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:409:46: ( NL )?
                    	    int alt14=2;
                    	    int LA14_0 = input.LA(1);

                    	    if ( (LA14_0==NL) ) {
                    	        alt14=1;
                    	    }
                    	    switch (alt14) {
                    	        case 1 :
                    	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:409:46: NL
                    	            {
                    	            NL39=(Token)match(input,NL,FOLLOW_NL_in_defpattern1830); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_NL.add(NL39);


                    	            }
                    	            break;

                    	    }

                    	    pushFollow(FOLLOW_primitive_pattern_in_defpattern1833);
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
                    // 410:3: -> ^( LIST_CONS ( primitive_pattern )* )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:410:6: ^( LIST_CONS ( primitive_pattern )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LIST_CONS, "LIST_CONS"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:410:18: ( primitive_pattern )*
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:411:4: Constr ( defpattern )?
                    {
                    Constr41=(Token)match(input,Constr,FOLLOW_Constr_in_defpattern1851); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Constr.add(Constr41);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:411:11: ( defpattern )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( ((LA16_0>=A_infinity && LA16_0<=U_infinity)||(LA16_0>=L_true && LA16_0<=L_false)||LA16_0==L_nil||LA16_0==MINUS||(LA16_0>=Constr && LA16_0<=Num)||(LA16_0>=String && LA16_0<=ROUND_BRACKET_OPEN)||LA16_0==SQUARE_BRACKET_OPEN||LA16_0==CURLY_BRACKET_OPEN||LA16_0==UNDERSCORE) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:411:11: defpattern
                            {
                            pushFollow(FOLLOW_defpattern_in_defpattern1853);
                            defpattern42=defpattern();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_defpattern.add(defpattern42.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: defpattern, Constr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 411:23: -> ^( Constr ( defpattern )? )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:411:26: ^( Constr ( defpattern )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_Constr.nextNode(), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:411:35: ( defpattern )?
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:413:1: bracket_pattern : ( ( Id ( NL )? L_as )=> Id ( NL )? L_as ( NL )? pattern -> ^( L_as Id pattern ) | ( protected_expr ( NL )? QUESTION_MARK )=> protected_expr ( NL )? QUESTION_MARK ( ( NL )? pattern )? -> ^( QUESTION_MARK protected_expr ( pattern )? ) | ( Id pattern )=> Id pattern -> ^( INNERVALUE_PATTERN Id pattern ) | L_val ( NL )? protected_expr_nc -> ^( L_val protected_expr_nc ) | L_for ( NL )? ( bracket_pattern ( ( NL )? COMMA ( NL )? bracket_pattern )* ( NL )? )? L_end -> ^( L_for ( bracket_pattern )* ) | ( pattern ( NL )? L_if )=> pattern ( NL )? L_if ( NL )? protected_expr_nc -> ^( IF_PATTERN pattern protected_expr_nc ) | ( pattern ( NL )? ':' )=> pattern ( NL )? ':' ( NL )? typeannotation -> ^( TYPE_PATTERN typeannotation pattern ) | pattern );
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:414:2: ( ( Id ( NL )? L_as )=> Id ( NL )? L_as ( NL )? pattern -> ^( L_as Id pattern ) | ( protected_expr ( NL )? QUESTION_MARK )=> protected_expr ( NL )? QUESTION_MARK ( ( NL )? pattern )? -> ^( QUESTION_MARK protected_expr ( pattern )? ) | ( Id pattern )=> Id pattern -> ^( INNERVALUE_PATTERN Id pattern ) | L_val ( NL )? protected_expr_nc -> ^( L_val protected_expr_nc ) | L_for ( NL )? ( bracket_pattern ( ( NL )? COMMA ( NL )? bracket_pattern )* ( NL )? )? L_end -> ^( L_for ( bracket_pattern )* ) | ( pattern ( NL )? L_if )=> pattern ( NL )? L_if ( NL )? protected_expr_nc -> ^( IF_PATTERN pattern protected_expr_nc ) | ( pattern ( NL )? ':' )=> pattern ( NL )? ':' ( NL )? typeannotation -> ^( TYPE_PATTERN typeannotation pattern ) | pattern )
            int alt34=8;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:414:10: ( Id ( NL )? L_as )=> Id ( NL )? L_as ( NL )? pattern
                    {
                    Id43=(Token)match(input,Id,FOLLOW_Id_in_bracket_pattern1890); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Id.add(Id43);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:414:30: ( NL )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==NL) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:414:30: NL
                            {
                            NL44=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1892); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL44);


                            }
                            break;

                    }

                    L_as45=(Token)match(input,L_as,FOLLOW_L_as_in_bracket_pattern1895); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_as.add(L_as45);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:414:39: ( NL )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==NL) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:414:39: NL
                            {
                            NL46=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1897); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL46);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_pattern_in_bracket_pattern1900);
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
                    // 414:51: -> ^( L_as Id pattern )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:414:54: ^( L_as Id pattern )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:415:4: ( protected_expr ( NL )? QUESTION_MARK )=> protected_expr ( NL )? QUESTION_MARK ( ( NL )? pattern )?
                    {
                    pushFollow(FOLLOW_protected_expr_in_bracket_pattern1929);
                    protected_expr48=protected_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr48.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:416:18: ( NL )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==NL) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:416:18: NL
                            {
                            NL49=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1931); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL49);


                            }
                            break;

                    }

                    QUESTION_MARK50=(Token)match(input,QUESTION_MARK,FOLLOW_QUESTION_MARK_in_bracket_pattern1934); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QUESTION_MARK.add(QUESTION_MARK50);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:416:36: ( ( NL )? pattern )?
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
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:416:37: ( NL )? pattern
                            {
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:416:37: ( NL )?
                            int alt21=2;
                            int LA21_0 = input.LA(1);

                            if ( (LA21_0==NL) ) {
                                alt21=1;
                            }
                            switch (alt21) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:416:37: NL
                                    {
                                    NL51=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1937); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL51);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_pattern_in_bracket_pattern1940);
                            pattern52=pattern();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_pattern.add(pattern52.getTree());

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
                    // 416:51: -> ^( QUESTION_MARK protected_expr ( pattern )? )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:416:54: ^( QUESTION_MARK protected_expr ( pattern )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_QUESTION_MARK.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_protected_expr.nextTree());
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:416:85: ( pattern )?
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:417:4: ( Id pattern )=> Id pattern
                    {
                    Id53=(Token)match(input,Id,FOLLOW_Id_in_bracket_pattern1966); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Id.add(Id53);

                    pushFollow(FOLLOW_pattern_in_bracket_pattern1968);
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
                    // 417:31: -> ^( INNERVALUE_PATTERN Id pattern )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:417:34: ^( INNERVALUE_PATTERN Id pattern )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:418:4: L_val ( NL )? protected_expr_nc
                    {
                    L_val55=(Token)match(input,L_val,FOLLOW_L_val_in_bracket_pattern1983); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_val.add(L_val55);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:418:10: ( NL )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==NL) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:418:10: NL
                            {
                            NL56=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1985); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL56);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_protected_expr_nc_in_bracket_pattern1988);
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
                    // 418:32: -> ^( L_val protected_expr_nc )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:418:35: ^( L_val protected_expr_nc )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:419:10: L_for ( NL )? ( bracket_pattern ( ( NL )? COMMA ( NL )? bracket_pattern )* ( NL )? )? L_end
                    {
                    L_for58=(Token)match(input,L_for,FOLLOW_L_for_in_bracket_pattern2007); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_for.add(L_for58);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:419:16: ( NL )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==NL) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:419:16: NL
                            {
                            NL59=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern2009); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL59);


                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:419:20: ( bracket_pattern ( ( NL )? COMMA ( NL )? bracket_pattern )* ( NL )? )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==L_begin||(LA29_0>=L_obj && LA29_0<=L_if)||(LA29_0>=L_while && LA29_0<=L_for)||LA29_0==L_match||LA29_0==L_val||LA29_0==L_exception||LA29_0==L_try||(LA29_0>=A_infinity && LA29_0<=L_lazy)||(LA29_0>=L_true && LA29_0<=L_nil)||LA29_0==L_typeof||LA29_0==MINUS||LA29_0==A_NOT||LA29_0==U_NOT||(LA29_0>=A_ELLIPSIS && LA29_0<=U_ELLIPSIS)||LA29_0==L_force||(LA29_0>=Constr && LA29_0<=Num)||(LA29_0>=String && LA29_0<=ROUND_BRACKET_OPEN)||LA29_0==SQUARE_BRACKET_OPEN||LA29_0==CURLY_BRACKET_OPEN||LA29_0==UNDERSCORE) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:419:21: bracket_pattern ( ( NL )? COMMA ( NL )? bracket_pattern )* ( NL )?
                            {
                            pushFollow(FOLLOW_bracket_pattern_in_bracket_pattern2013);
                            bracket_pattern60=bracket_pattern();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_bracket_pattern.add(bracket_pattern60.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:419:37: ( ( NL )? COMMA ( NL )? bracket_pattern )*
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
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:419:39: ( NL )? COMMA ( NL )? bracket_pattern
                            	    {
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:419:39: ( NL )?
                            	    int alt25=2;
                            	    int LA25_0 = input.LA(1);

                            	    if ( (LA25_0==NL) ) {
                            	        alt25=1;
                            	    }
                            	    switch (alt25) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:419:39: NL
                            	            {
                            	            NL61=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern2017); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL61);


                            	            }
                            	            break;

                            	    }

                            	    COMMA62=(Token)match(input,COMMA,FOLLOW_COMMA_in_bracket_pattern2020); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA62);

                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:419:49: ( NL )?
                            	    int alt26=2;
                            	    int LA26_0 = input.LA(1);

                            	    if ( (LA26_0==NL) ) {
                            	        alt26=1;
                            	    }
                            	    switch (alt26) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:419:49: NL
                            	            {
                            	            NL63=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern2022); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL63);


                            	            }
                            	            break;

                            	    }

                            	    pushFollow(FOLLOW_bracket_pattern_in_bracket_pattern2025);
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

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:419:72: ( NL )?
                            int alt28=2;
                            int LA28_0 = input.LA(1);

                            if ( (LA28_0==NL) ) {
                                alt28=1;
                            }
                            switch (alt28) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:419:72: NL
                                    {
                                    NL65=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern2030); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL65);


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    L_end66=(Token)match(input,L_end,FOLLOW_L_end_in_bracket_pattern2035); if (state.failed) return retval; 
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
                    // 419:84: -> ^( L_for ( bracket_pattern )* )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:419:87: ^( L_for ( bracket_pattern )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_L_for.nextNode(), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:419:95: ( bracket_pattern )*
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:420:4: ( pattern ( NL )? L_if )=> pattern ( NL )? L_if ( NL )? protected_expr_nc
                    {
                    pushFollow(FOLLOW_pattern_in_bracket_pattern2060);
                    pattern67=pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pattern.add(pattern67.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:420:34: ( NL )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==NL) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:420:34: NL
                            {
                            NL68=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern2062); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL68);


                            }
                            break;

                    }

                    L_if69=(Token)match(input,L_if,FOLLOW_L_if_in_bracket_pattern2065); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_if.add(L_if69);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:420:43: ( NL )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==NL) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:420:43: NL
                            {
                            NL70=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern2067); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL70);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_protected_expr_nc_in_bracket_pattern2070);
                    protected_expr_nc71=protected_expr_nc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_protected_expr_nc.add(protected_expr_nc71.getTree());


                    // AST REWRITE
                    // elements: protected_expr_nc, pattern
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 420:65: -> ^( IF_PATTERN pattern protected_expr_nc )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:420:68: ^( IF_PATTERN pattern protected_expr_nc )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:421:4: ( pattern ( NL )? ':' )=> pattern ( NL )? ':' ( NL )? typeannotation
                    {
                    pushFollow(FOLLOW_pattern_in_bracket_pattern2096);
                    pattern72=pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pattern.add(pattern72.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:421:33: ( NL )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==NL) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:421:33: NL
                            {
                            NL73=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern2098); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL73);


                            }
                            break;

                    }

                    char_literal74=(Token)match(input,COLON,FOLLOW_COLON_in_bracket_pattern2101); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(char_literal74);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:421:41: ( NL )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==NL) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:421:41: NL
                            {
                            NL75=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern2103); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL75);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_typeannotation_in_bracket_pattern2106);
                    typeannotation76=typeannotation();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeannotation.add(typeannotation76.getTree());


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
                    // 421:60: -> ^( TYPE_PATTERN typeannotation pattern )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:421:63: ^( TYPE_PATTERN typeannotation pattern )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:422:4: pattern
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_pattern_in_bracket_pattern2121);
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:424:1: arrow_or_assign : ( token_ARROW -> ^( ARROW ) | ASSIGN -> ^( ASSIGN ) );
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:425:2: ( token_ARROW -> ^( ARROW ) | ASSIGN -> ^( ASSIGN ) )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:425:4: token_ARROW
                    {
                    pushFollow(FOLLOW_token_ARROW_in_arrow_or_assign2131);
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
                    // 425:16: -> ^( ARROW )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:425:19: ^( ARROW )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:426:4: ASSIGN
                    {
                    ASSIGN79=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_arrow_or_assign2142); if (state.failed) return retval; 
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
                    // 426:11: -> ^( ASSIGN )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:426:14: ^( ASSIGN )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:428:1: mselem_pattern : bracket_pattern ( ( NL )? arrow_or_assign ( NL )? bracket_pattern )? -> ^( NIL_TOKEN ^( NIL_TOKEN ( bracket_pattern )* ) ( arrow_or_assign )* ) ;
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:429:2: ( bracket_pattern ( ( NL )? arrow_or_assign ( NL )? bracket_pattern )? -> ^( NIL_TOKEN ^( NIL_TOKEN ( bracket_pattern )* ) ( arrow_or_assign )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:429:4: bracket_pattern ( ( NL )? arrow_or_assign ( NL )? bracket_pattern )?
            {
            pushFollow(FOLLOW_bracket_pattern_in_mselem_pattern2157);
            bracket_pattern80=bracket_pattern();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bracket_pattern.add(bracket_pattern80.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:429:20: ( ( NL )? arrow_or_assign ( NL )? bracket_pattern )?
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:429:21: ( NL )? arrow_or_assign ( NL )? bracket_pattern
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:429:21: ( NL )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==NL) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:429:21: NL
                            {
                            NL81=(Token)match(input,NL,FOLLOW_NL_in_mselem_pattern2160); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL81);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_arrow_or_assign_in_mselem_pattern2163);
                    arrow_or_assign82=arrow_or_assign();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_arrow_or_assign.add(arrow_or_assign82.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:429:41: ( NL )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==NL) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:429:41: NL
                            {
                            NL83=(Token)match(input,NL,FOLLOW_NL_in_mselem_pattern2165); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL83);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_bracket_pattern_in_mselem_pattern2168);
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
            // 430:3: -> ^( NIL_TOKEN ^( NIL_TOKEN ( bracket_pattern )* ) ( arrow_or_assign )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:430:6: ^( NIL_TOKEN ^( NIL_TOKEN ( bracket_pattern )* ) ( arrow_or_assign )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:430:18: ^( NIL_TOKEN ( bracket_pattern )* )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_2);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:430:30: ( bracket_pattern )*
                while ( stream_bracket_pattern.hasNext() ) {
                    adaptor.addChild(root_2, stream_bracket_pattern.nextTree());

                }
                stream_bracket_pattern.reset();

                adaptor.addChild(root_1, root_2);
                }
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:430:48: ( arrow_or_assign )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:432:1: primitive_pattern : ( Id | '_' -> ANY | String | Num | L_true | L_false | L_nil | token_infinity | '-' ( NL )? token_infinity -> ^( UMINUS token_infinity ) | '-' ( NL )? Num -> ^( UMINUS Num ) | '[' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* )? ']' -> ^( SQUARE_LIST ( bracket_pattern )* ) | '(' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* ( COMMA ( NL )? )? )? ')' -> ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( bracket_pattern )* ) ) | '{' ( NL )? ( mselem_pattern ( NL )? ( COMMA ( NL )? mselem_pattern ( NL )? )* )? '}' -> ^( MAP_OR_SET_OR_OBJ ( mselem_pattern )* ) | '{' ( NL )? token_ARROW ( NL )? '}' -> ^( EMPTY_MAP ) );
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:433:2: ( Id | '_' -> ANY | String | Num | L_true | L_false | L_nil | token_infinity | '-' ( NL )? token_infinity -> ^( UMINUS token_infinity ) | '-' ( NL )? Num -> ^( UMINUS Num ) | '[' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* )? ']' -> ^( SQUARE_LIST ( bracket_pattern )* ) | '(' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* ( COMMA ( NL )? )? )? ')' -> ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( bracket_pattern )* ) ) | '{' ( NL )? ( mselem_pattern ( NL )? ( COMMA ( NL )? mselem_pattern ( NL )? )* )? '}' -> ^( MAP_OR_SET_OR_OBJ ( mselem_pattern )* ) | '{' ( NL )? token_ARROW ( NL )? '}' -> ^( EMPTY_MAP ) )
            int alt63=14;
            alt63 = dfa63.predict(input);
            switch (alt63) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:433:4: Id
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Id85=(Token)match(input,Id,FOLLOW_Id_in_primitive_pattern2197); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Id85_tree = (CommonTree)adaptor.create(Id85);
                    adaptor.addChild(root_0, Id85_tree);
                    }

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:434:4: '_'
                    {
                    char_literal86=(Token)match(input,UNDERSCORE,FOLLOW_UNDERSCORE_in_primitive_pattern2202); if (state.failed) return retval; 
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
                    // 434:8: -> ANY
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(ANY, "ANY"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:435:4: String
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    String87=(Token)match(input,String,FOLLOW_String_in_primitive_pattern2211); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    String87_tree = (CommonTree)adaptor.create(String87);
                    adaptor.addChild(root_0, String87_tree);
                    }

                    }
                    break;
                case 4 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:436:4: Num
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Num88=(Token)match(input,Num,FOLLOW_Num_in_primitive_pattern2216); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Num88_tree = (CommonTree)adaptor.create(Num88);
                    adaptor.addChild(root_0, Num88_tree);
                    }

                    }
                    break;
                case 5 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:437:4: L_true
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    L_true89=(Token)match(input,L_true,FOLLOW_L_true_in_primitive_pattern2221); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    L_true89_tree = (CommonTree)adaptor.create(L_true89);
                    adaptor.addChild(root_0, L_true89_tree);
                    }

                    }
                    break;
                case 6 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:438:4: L_false
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    L_false90=(Token)match(input,L_false,FOLLOW_L_false_in_primitive_pattern2226); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    L_false90_tree = (CommonTree)adaptor.create(L_false90);
                    adaptor.addChild(root_0, L_false90_tree);
                    }

                    }
                    break;
                case 7 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:439:4: L_nil
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    L_nil91=(Token)match(input,L_nil,FOLLOW_L_nil_in_primitive_pattern2231); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    L_nil91_tree = (CommonTree)adaptor.create(L_nil91);
                    adaptor.addChild(root_0, L_nil91_tree);
                    }

                    }
                    break;
                case 8 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:440:4: token_infinity
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_infinity_in_primitive_pattern2236);
                    token_infinity92=token_infinity();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, token_infinity92.getTree());

                    }
                    break;
                case 9 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:441:4: '-' ( NL )? token_infinity
                    {
                    char_literal93=(Token)match(input,MINUS,FOLLOW_MINUS_in_primitive_pattern2241); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(char_literal93);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:441:8: ( NL )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==NL) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:441:8: NL
                            {
                            NL94=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2243); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL94);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_token_infinity_in_primitive_pattern2246);
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
                    // 441:27: -> ^( UMINUS token_infinity )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:441:30: ^( UMINUS token_infinity )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:442:4: '-' ( NL )? Num
                    {
                    char_literal96=(Token)match(input,MINUS,FOLLOW_MINUS_in_primitive_pattern2259); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(char_literal96);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:442:8: ( NL )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==NL) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:442:8: NL
                            {
                            NL97=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2261); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL97);


                            }
                            break;

                    }

                    Num98=(Token)match(input,Num,FOLLOW_Num_in_primitive_pattern2264); if (state.failed) return retval; 
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
                    // 442:16: -> ^( UMINUS Num )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:442:19: ^( UMINUS Num )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:443:4: '[' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* )? ']'
                    {
                    char_literal99=(Token)match(input,SQUARE_BRACKET_OPEN,FOLLOW_SQUARE_BRACKET_OPEN_in_primitive_pattern2277); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SQUARE_BRACKET_OPEN.add(char_literal99);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:443:9: ( NL )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==NL) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:443:9: NL
                            {
                            NL100=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2280); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL100);


                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:443:13: ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==L_begin||(LA46_0>=L_obj && LA46_0<=L_if)||(LA46_0>=L_while && LA46_0<=L_for)||LA46_0==L_match||LA46_0==L_val||LA46_0==L_exception||LA46_0==L_try||(LA46_0>=A_infinity && LA46_0<=L_lazy)||(LA46_0>=L_true && LA46_0<=L_nil)||LA46_0==L_typeof||LA46_0==MINUS||LA46_0==A_NOT||LA46_0==U_NOT||(LA46_0>=A_ELLIPSIS && LA46_0<=U_ELLIPSIS)||LA46_0==L_force||(LA46_0>=Constr && LA46_0<=Num)||(LA46_0>=String && LA46_0<=ROUND_BRACKET_OPEN)||LA46_0==SQUARE_BRACKET_OPEN||LA46_0==CURLY_BRACKET_OPEN||LA46_0==UNDERSCORE) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:443:14: bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )*
                            {
                            pushFollow(FOLLOW_bracket_pattern_in_primitive_pattern2284);
                            bracket_pattern101=bracket_pattern();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_bracket_pattern.add(bracket_pattern101.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:443:30: ( NL )?
                            int alt42=2;
                            int LA42_0 = input.LA(1);

                            if ( (LA42_0==NL) ) {
                                alt42=1;
                            }
                            switch (alt42) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:443:30: NL
                                    {
                                    NL102=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2286); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL102);


                                    }
                                    break;

                            }

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:443:34: ( COMMA ( NL )? bracket_pattern ( NL )? )*
                            loop45:
                            do {
                                int alt45=2;
                                int LA45_0 = input.LA(1);

                                if ( (LA45_0==COMMA) ) {
                                    alt45=1;
                                }


                                switch (alt45) {
                            	case 1 :
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:443:36: COMMA ( NL )? bracket_pattern ( NL )?
                            	    {
                            	    COMMA103=(Token)match(input,COMMA,FOLLOW_COMMA_in_primitive_pattern2291); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA103);

                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:443:42: ( NL )?
                            	    int alt43=2;
                            	    int LA43_0 = input.LA(1);

                            	    if ( (LA43_0==NL) ) {
                            	        alt43=1;
                            	    }
                            	    switch (alt43) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:443:42: NL
                            	            {
                            	            NL104=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2293); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL104);


                            	            }
                            	            break;

                            	    }

                            	    pushFollow(FOLLOW_bracket_pattern_in_primitive_pattern2296);
                            	    bracket_pattern105=bracket_pattern();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_bracket_pattern.add(bracket_pattern105.getTree());
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:443:62: ( NL )?
                            	    int alt44=2;
                            	    int LA44_0 = input.LA(1);

                            	    if ( (LA44_0==NL) ) {
                            	        alt44=1;
                            	    }
                            	    switch (alt44) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:443:62: NL
                            	            {
                            	            NL106=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2298); if (state.failed) return retval; 
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

                    char_literal107=(Token)match(input,SQUARE_BRACKET_CLOSE,FOLLOW_SQUARE_BRACKET_CLOSE_in_primitive_pattern2306); if (state.failed) return retval; 
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
                    // 444:6: -> ^( SQUARE_LIST ( bracket_pattern )* )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:444:9: ^( SQUARE_LIST ( bracket_pattern )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SQUARE_LIST, "SQUARE_LIST"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:444:23: ( bracket_pattern )*
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:445:4: '(' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* ( COMMA ( NL )? )? )? ')'
                    {
                    char_literal108=(Token)match(input,ROUND_BRACKET_OPEN,FOLLOW_ROUND_BRACKET_OPEN_in_primitive_pattern2326); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ROUND_BRACKET_OPEN.add(char_literal108);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:445:9: ( NL )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==NL) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:445:9: NL
                            {
                            NL109=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2329); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL109);


                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:445:13: ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* ( COMMA ( NL )? )? )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==L_begin||(LA54_0>=L_obj && LA54_0<=L_if)||(LA54_0>=L_while && LA54_0<=L_for)||LA54_0==L_match||LA54_0==L_val||LA54_0==L_exception||LA54_0==L_try||(LA54_0>=A_infinity && LA54_0<=L_lazy)||(LA54_0>=L_true && LA54_0<=L_nil)||LA54_0==L_typeof||LA54_0==MINUS||LA54_0==A_NOT||LA54_0==U_NOT||(LA54_0>=A_ELLIPSIS && LA54_0<=U_ELLIPSIS)||LA54_0==L_force||(LA54_0>=Constr && LA54_0<=Num)||(LA54_0>=String && LA54_0<=ROUND_BRACKET_OPEN)||LA54_0==SQUARE_BRACKET_OPEN||LA54_0==CURLY_BRACKET_OPEN||LA54_0==UNDERSCORE) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:445:14: bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* ( COMMA ( NL )? )?
                            {
                            pushFollow(FOLLOW_bracket_pattern_in_primitive_pattern2333);
                            bracket_pattern110=bracket_pattern();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_bracket_pattern.add(bracket_pattern110.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:445:30: ( NL )?
                            int alt48=2;
                            int LA48_0 = input.LA(1);

                            if ( (LA48_0==NL) ) {
                                alt48=1;
                            }
                            switch (alt48) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:445:30: NL
                                    {
                                    NL111=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2335); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL111);


                                    }
                                    break;

                            }

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:445:34: ( COMMA ( NL )? bracket_pattern ( NL )? )*
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
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:445:36: COMMA ( NL )? bracket_pattern ( NL )?
                            	    {
                            	    COMMA112=(Token)match(input,COMMA,FOLLOW_COMMA_in_primitive_pattern2340); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA112);

                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:445:43: ( NL )?
                            	    int alt49=2;
                            	    int LA49_0 = input.LA(1);

                            	    if ( (LA49_0==NL) ) {
                            	        alt49=1;
                            	    }
                            	    switch (alt49) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:445:43: NL
                            	            {
                            	            NL113=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2343); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL113);


                            	            }
                            	            break;

                            	    }

                            	    pushFollow(FOLLOW_bracket_pattern_in_primitive_pattern2346);
                            	    bracket_pattern114=bracket_pattern();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_bracket_pattern.add(bracket_pattern114.getTree());
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:445:63: ( NL )?
                            	    int alt50=2;
                            	    int LA50_0 = input.LA(1);

                            	    if ( (LA50_0==NL) ) {
                            	        alt50=1;
                            	    }
                            	    switch (alt50) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:445:63: NL
                            	            {
                            	            NL115=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2348); if (state.failed) return retval; 
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

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:445:69: ( COMMA ( NL )? )?
                            int alt53=2;
                            int LA53_0 = input.LA(1);

                            if ( (LA53_0==COMMA) ) {
                                alt53=1;
                            }
                            switch (alt53) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:445:70: COMMA ( NL )?
                                    {
                                    COMMA116=(Token)match(input,COMMA,FOLLOW_COMMA_in_primitive_pattern2354); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_COMMA.add(COMMA116);

                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:445:76: ( NL )?
                                    int alt52=2;
                                    int LA52_0 = input.LA(1);

                                    if ( (LA52_0==NL) ) {
                                        alt52=1;
                                    }
                                    switch (alt52) {
                                        case 1 :
                                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:445:76: NL
                                            {
                                            NL117=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2356); if (state.failed) return retval; 
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

                    char_literal118=(Token)match(input,ROUND_BRACKET_CLOSE,FOLLOW_ROUND_BRACKET_CLOSE_in_primitive_pattern2363); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ROUND_BRACKET_CLOSE.add(char_literal118);



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
                    // 446:5: -> ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( bracket_pattern )* ) )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:446:8: ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( bracket_pattern )* ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ROUND_LIST, "ROUND_LIST"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:446:21: ^( NIL_TOKEN ( COMMA )* )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_2);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:446:33: ( COMMA )*
                        while ( stream_COMMA.hasNext() ) {
                            adaptor.addChild(root_2, stream_COMMA.nextNode());

                        }
                        stream_COMMA.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:446:41: ^( NIL_TOKEN ( bracket_pattern )* )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_2);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:446:53: ( bracket_pattern )*
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:447:4: '{' ( NL )? ( mselem_pattern ( NL )? ( COMMA ( NL )? mselem_pattern ( NL )? )* )? '}'
                    {
                    char_literal119=(Token)match(input,CURLY_BRACKET_OPEN,FOLLOW_CURLY_BRACKET_OPEN_in_primitive_pattern2395); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_OPEN.add(char_literal119);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:447:9: ( NL )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==NL) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:447:9: NL
                            {
                            NL120=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2398); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL120);


                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:447:13: ( mselem_pattern ( NL )? ( COMMA ( NL )? mselem_pattern ( NL )? )* )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==L_begin||(LA60_0>=L_obj && LA60_0<=L_if)||(LA60_0>=L_while && LA60_0<=L_for)||LA60_0==L_match||LA60_0==L_val||LA60_0==L_exception||LA60_0==L_try||(LA60_0>=A_infinity && LA60_0<=L_lazy)||(LA60_0>=L_true && LA60_0<=L_nil)||LA60_0==L_typeof||LA60_0==MINUS||LA60_0==A_NOT||LA60_0==U_NOT||(LA60_0>=A_ELLIPSIS && LA60_0<=U_ELLIPSIS)||LA60_0==L_force||(LA60_0>=Constr && LA60_0<=Num)||(LA60_0>=String && LA60_0<=ROUND_BRACKET_OPEN)||LA60_0==SQUARE_BRACKET_OPEN||LA60_0==CURLY_BRACKET_OPEN||LA60_0==UNDERSCORE) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:447:14: mselem_pattern ( NL )? ( COMMA ( NL )? mselem_pattern ( NL )? )*
                            {
                            pushFollow(FOLLOW_mselem_pattern_in_primitive_pattern2402);
                            mselem_pattern121=mselem_pattern();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_mselem_pattern.add(mselem_pattern121.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:447:29: ( NL )?
                            int alt56=2;
                            int LA56_0 = input.LA(1);

                            if ( (LA56_0==NL) ) {
                                alt56=1;
                            }
                            switch (alt56) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:447:29: NL
                                    {
                                    NL122=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2404); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL122);


                                    }
                                    break;

                            }

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:447:33: ( COMMA ( NL )? mselem_pattern ( NL )? )*
                            loop59:
                            do {
                                int alt59=2;
                                int LA59_0 = input.LA(1);

                                if ( (LA59_0==COMMA) ) {
                                    alt59=1;
                                }


                                switch (alt59) {
                            	case 1 :
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:447:35: COMMA ( NL )? mselem_pattern ( NL )?
                            	    {
                            	    COMMA123=(Token)match(input,COMMA,FOLLOW_COMMA_in_primitive_pattern2409); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA123);

                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:447:42: ( NL )?
                            	    int alt57=2;
                            	    int LA57_0 = input.LA(1);

                            	    if ( (LA57_0==NL) ) {
                            	        alt57=1;
                            	    }
                            	    switch (alt57) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:447:42: NL
                            	            {
                            	            NL124=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2412); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL124);


                            	            }
                            	            break;

                            	    }

                            	    pushFollow(FOLLOW_mselem_pattern_in_primitive_pattern2415);
                            	    mselem_pattern125=mselem_pattern();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_mselem_pattern.add(mselem_pattern125.getTree());
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:447:61: ( NL )?
                            	    int alt58=2;
                            	    int LA58_0 = input.LA(1);

                            	    if ( (LA58_0==NL) ) {
                            	        alt58=1;
                            	    }
                            	    switch (alt58) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:447:61: NL
                            	            {
                            	            NL126=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2417); if (state.failed) return retval; 
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

                    char_literal127=(Token)match(input,CURLY_BRACKET_CLOSE,FOLLOW_CURLY_BRACKET_CLOSE_in_primitive_pattern2425); if (state.failed) return retval; 
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
                    // 448:5: -> ^( MAP_OR_SET_OR_OBJ ( mselem_pattern )* )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:448:8: ^( MAP_OR_SET_OR_OBJ ( mselem_pattern )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MAP_OR_SET_OR_OBJ, "MAP_OR_SET_OR_OBJ"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:448:28: ( mselem_pattern )*
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:449:4: '{' ( NL )? token_ARROW ( NL )? '}'
                    {
                    char_literal128=(Token)match(input,CURLY_BRACKET_OPEN,FOLLOW_CURLY_BRACKET_OPEN_in_primitive_pattern2443); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_OPEN.add(char_literal128);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:449:8: ( NL )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==NL) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:449:8: NL
                            {
                            NL129=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2445); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL129);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_token_ARROW_in_primitive_pattern2448);
                    token_ARROW130=token_ARROW();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_token_ARROW.add(token_ARROW130.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:449:24: ( NL )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==NL) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:449:24: NL
                            {
                            NL131=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2450); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL131);


                            }
                            break;

                    }

                    char_literal132=(Token)match(input,CURLY_BRACKET_CLOSE,FOLLOW_CURLY_BRACKET_CLOSE_in_primitive_pattern2453); if (state.failed) return retval; 
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
                    // 449:32: -> ^( EMPTY_MAP )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:449:35: ^( EMPTY_MAP )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:452:1: sep : ( NL | SC )+ ;
    public final babel17Parser.sep_return sep() throws RecognitionException {
        babel17Parser.sep_return retval = new babel17Parser.sep_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set133=null;

        CommonTree set133_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:452:5: ( ( NL | SC )+ )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:452:7: ( NL | SC )+
            {
            root_0 = (CommonTree)adaptor.nil();

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:452:7: ( NL | SC )+
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:454:1: block : ( ( sep )? statement ( sep statement )* ( sep )? -> ^( BLOCK ( statement )* ) | ( sep )? -> ^( BLOCK ) );
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:454:8: ( ( sep )? statement ( sep statement )* ( sep )? -> ^( BLOCK ( statement )* ) | ( sep )? -> ^( BLOCK ) )
            int alt69=2;
            alt69 = dfa69.predict(input);
            switch (alt69) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:454:10: ( sep )? statement ( sep statement )* ( sep )?
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:454:10: ( sep )?
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==SC||LA65_0==NL) ) {
                        alt65=1;
                    }
                    switch (alt65) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:454:10: sep
                            {
                            pushFollow(FOLLOW_sep_in_block2485);
                            sep134=sep();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_sep.add(sep134.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_statement_in_block2488);
                    statement135=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement135.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:454:25: ( sep statement )*
                    loop66:
                    do {
                        int alt66=2;
                        alt66 = dfa66.predict(input);
                        switch (alt66) {
                    	case 1 :
                    	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:454:26: sep statement
                    	    {
                    	    pushFollow(FOLLOW_sep_in_block2491);
                    	    sep136=sep();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_sep.add(sep136.getTree());
                    	    pushFollow(FOLLOW_statement_in_block2493);
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

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:454:42: ( sep )?
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==SC||LA67_0==NL) ) {
                        alt67=1;
                    }
                    switch (alt67) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:454:42: sep
                            {
                            pushFollow(FOLLOW_sep_in_block2497);
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
                    // 454:47: -> ^( BLOCK ( statement )* )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:454:50: ^( BLOCK ( statement )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:454:58: ( statement )*
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:455:4: ( sep )?
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:455:4: ( sep )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==SC||LA68_0==NL) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:455:4: sep
                            {
                            pushFollow(FOLLOW_sep_in_block2513);
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
                    // 455:9: -> ^( BLOCK )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:455:12: ^( BLOCK )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:457:1: pure_block : statement ( sep statement )* -> ^( BLOCK ( statement )* ) ;
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:458:2: ( statement ( sep statement )* -> ^( BLOCK ( statement )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:458:4: statement ( sep statement )*
            {
            pushFollow(FOLLOW_statement_in_pure_block2530);
            statement140=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statement.add(statement140.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:458:14: ( sep statement )*
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
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:458:15: sep statement
            	    {
            	    pushFollow(FOLLOW_sep_in_pure_block2533);
            	    sep141=sep();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_sep.add(sep141.getTree());
            	    pushFollow(FOLLOW_statement_in_pure_block2535);
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
            // 458:31: -> ^( BLOCK ( statement )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:458:34: ^( BLOCK ( statement )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:458:42: ( statement )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:460:1: statement : ( st_typedef | st_val | st_def | st_yield | st_memoize | st_private | st_module | st_import | expr_or_assign | PRAGMA_PRINT expr -> ^( PRAGMA_PRINT expr ) | PRAGMA_LOG expr -> ^( PRAGMA_LOG expr ) | PRAGMA_PROFILE expr -> ^( PRAGMA_PROFILE expr ) | PRAGMA_ASSERT expr -> ^( PRAGMA_ASSERT expr ) );
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:461:2: ( st_typedef | st_val | st_def | st_yield | st_memoize | st_private | st_module | st_import | expr_or_assign | PRAGMA_PRINT expr -> ^( PRAGMA_PRINT expr ) | PRAGMA_LOG expr -> ^( PRAGMA_LOG expr ) | PRAGMA_PROFILE expr -> ^( PRAGMA_PROFILE expr ) | PRAGMA_ASSERT expr -> ^( PRAGMA_ASSERT expr ) )
            int alt71=13;
            alt71 = dfa71.predict(input);
            switch (alt71) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:461:4: st_typedef
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_st_typedef_in_statement2556);
                    st_typedef143=st_typedef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, st_typedef143.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:462:10: st_val
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_st_val_in_statement2567);
                    st_val144=st_val();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, st_val144.getTree());

                    }
                    break;
                case 3 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:463:4: st_def
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_st_def_in_statement2572);
                    st_def145=st_def();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, st_def145.getTree());

                    }
                    break;
                case 4 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:464:4: st_yield
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_st_yield_in_statement2577);
                    st_yield146=st_yield();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, st_yield146.getTree());

                    }
                    break;
                case 5 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:465:4: st_memoize
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_st_memoize_in_statement2582);
                    st_memoize147=st_memoize();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, st_memoize147.getTree());

                    }
                    break;
                case 6 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:466:4: st_private
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_st_private_in_statement2587);
                    st_private148=st_private();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, st_private148.getTree());

                    }
                    break;
                case 7 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:467:4: st_module
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_st_module_in_statement2592);
                    st_module149=st_module();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, st_module149.getTree());

                    }
                    break;
                case 8 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:468:4: st_import
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_st_import_in_statement2597);
                    st_import150=st_import();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, st_import150.getTree());

                    }
                    break;
                case 9 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:469:4: expr_or_assign
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_expr_or_assign_in_statement2602);
                    expr_or_assign151=expr_or_assign();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_or_assign151.getTree());

                    }
                    break;
                case 10 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:470:5: PRAGMA_PRINT expr
                    {
                    PRAGMA_PRINT152=(Token)match(input,PRAGMA_PRINT,FOLLOW_PRAGMA_PRINT_in_statement2608); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PRAGMA_PRINT.add(PRAGMA_PRINT152);

                    pushFollow(FOLLOW_expr_in_statement2610);
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
                    // 470:23: -> ^( PRAGMA_PRINT expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:470:26: ^( PRAGMA_PRINT expr )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:471:5: PRAGMA_LOG expr
                    {
                    PRAGMA_LOG154=(Token)match(input,PRAGMA_LOG,FOLLOW_PRAGMA_LOG_in_statement2624); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PRAGMA_LOG.add(PRAGMA_LOG154);

                    pushFollow(FOLLOW_expr_in_statement2626);
                    expr155=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr155.getTree());


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
                    // 471:21: -> ^( PRAGMA_LOG expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:471:24: ^( PRAGMA_LOG expr )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:472:5: PRAGMA_PROFILE expr
                    {
                    PRAGMA_PROFILE156=(Token)match(input,PRAGMA_PROFILE,FOLLOW_PRAGMA_PROFILE_in_statement2640); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PRAGMA_PROFILE.add(PRAGMA_PROFILE156);

                    pushFollow(FOLLOW_expr_in_statement2642);
                    expr157=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr157.getTree());


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
                    // 472:25: -> ^( PRAGMA_PROFILE expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:472:28: ^( PRAGMA_PROFILE expr )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:473:5: PRAGMA_ASSERT expr
                    {
                    PRAGMA_ASSERT158=(Token)match(input,PRAGMA_ASSERT,FOLLOW_PRAGMA_ASSERT_in_statement2656); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PRAGMA_ASSERT.add(PRAGMA_ASSERT158);

                    pushFollow(FOLLOW_expr_in_statement2658);
                    expr159=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr159.getTree());


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
                    // 473:24: -> ^( PRAGMA_ASSERT expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:473:27: ^( PRAGMA_ASSERT expr )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:475:1: objelem_assign : Id PERIOD Id -> ^( OBJELEM_ASSIGN Id Id ) ;
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:476:2: ( Id PERIOD Id -> ^( OBJELEM_ASSIGN Id Id ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:476:4: Id PERIOD Id
            {
            Id160=(Token)match(input,Id,FOLLOW_Id_in_objelem_assign2676); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Id.add(Id160);

            PERIOD161=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_objelem_assign2678); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD161);

            Id162=(Token)match(input,Id,FOLLOW_Id_in_objelem_assign2680); if (state.failed) return retval; 
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
            // 476:17: -> ^( OBJELEM_ASSIGN Id Id )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:476:20: ^( OBJELEM_ASSIGN Id Id )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:478:1: st_val : L_val ( NL )? ( pattern | objelem_assign ) ( NL )? '=' ( NL )? expr -> ^( VAL ( pattern )* ( objelem_assign )* expr ) ;
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:478:8: ( L_val ( NL )? ( pattern | objelem_assign ) ( NL )? '=' ( NL )? expr -> ^( VAL ( pattern )* ( objelem_assign )* expr ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:478:10: L_val ( NL )? ( pattern | objelem_assign ) ( NL )? '=' ( NL )? expr
            {
            L_val163=(Token)match(input,L_val,FOLLOW_L_val_in_st_val2699); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_val.add(L_val163);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:478:16: ( NL )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==NL) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:478:16: NL
                    {
                    NL164=(Token)match(input,NL,FOLLOW_NL_in_st_val2701); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL164);


                    }
                    break;

            }

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:478:20: ( pattern | objelem_assign )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:478:21: pattern
                    {
                    pushFollow(FOLLOW_pattern_in_st_val2705);
                    pattern165=pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pattern.add(pattern165.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:478:31: objelem_assign
                    {
                    pushFollow(FOLLOW_objelem_assign_in_st_val2709);
                    objelem_assign166=objelem_assign();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_objelem_assign.add(objelem_assign166.getTree());

                    }
                    break;

            }

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:478:47: ( NL )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==NL) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:478:47: NL
                    {
                    NL167=(Token)match(input,NL,FOLLOW_NL_in_st_val2712); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL167);


                    }
                    break;

            }

            char_literal168=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_st_val2715); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal168);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:478:55: ( NL )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==NL) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:478:55: NL
                    {
                    NL169=(Token)match(input,NL,FOLLOW_NL_in_st_val2717); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL169);


                    }
                    break;

            }

            pushFollow(FOLLOW_expr_in_st_val2720);
            expr170=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr170.getTree());


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
            // 478:64: -> ^( VAL ( pattern )* ( objelem_assign )* expr )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:478:67: ^( VAL ( pattern )* ( objelem_assign )* expr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VAL, "VAL"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:478:73: ( pattern )*
                while ( stream_pattern.hasNext() ) {
                    adaptor.addChild(root_1, stream_pattern.nextTree());

                }
                stream_pattern.reset();
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:478:82: ( objelem_assign )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:480:1: st_def : ( L_def ( NL )? Id ( NL )? ( defpattern ( NL )? )? ( ':' ( NL )? typeid ( NL )? )? '=' ( NL )? expr -> ^( DEF Id ( typeid )? ( defpattern )? expr ) | L_def ( NL )? L_this ( NL )? ':' ( NL )? typeid ( NL )? '=' ( NL )? expr -> ^( CONVERSION typeid expr ) );
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:480:8: ( L_def ( NL )? Id ( NL )? ( defpattern ( NL )? )? ( ':' ( NL )? typeid ( NL )? )? '=' ( NL )? expr -> ^( DEF Id ( typeid )? ( defpattern )? expr ) | L_def ( NL )? L_this ( NL )? ':' ( NL )? typeid ( NL )? '=' ( NL )? expr -> ^( CONVERSION typeid expr ) )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:480:10: L_def ( NL )? Id ( NL )? ( defpattern ( NL )? )? ( ':' ( NL )? typeid ( NL )? )? '=' ( NL )? expr
                    {
                    L_def171=(Token)match(input,L_def,FOLLOW_L_def_in_st_def2744); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_def.add(L_def171);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:480:16: ( NL )?
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==NL) ) {
                        alt76=1;
                    }
                    switch (alt76) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:480:16: NL
                            {
                            NL172=(Token)match(input,NL,FOLLOW_NL_in_st_def2746); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL172);


                            }
                            break;

                    }

                    Id173=(Token)match(input,Id,FOLLOW_Id_in_st_def2749); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Id.add(Id173);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:480:23: ( NL )?
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==NL) ) {
                        alt77=1;
                    }
                    switch (alt77) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:480:23: NL
                            {
                            NL174=(Token)match(input,NL,FOLLOW_NL_in_st_def2751); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL174);


                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:480:27: ( defpattern ( NL )? )?
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( ((LA79_0>=A_infinity && LA79_0<=U_infinity)||(LA79_0>=L_true && LA79_0<=L_false)||LA79_0==L_nil||LA79_0==MINUS||(LA79_0>=Constr && LA79_0<=Num)||(LA79_0>=String && LA79_0<=ROUND_BRACKET_OPEN)||LA79_0==SQUARE_BRACKET_OPEN||LA79_0==CURLY_BRACKET_OPEN||LA79_0==UNDERSCORE) ) {
                        alt79=1;
                    }
                    switch (alt79) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:480:28: defpattern ( NL )?
                            {
                            pushFollow(FOLLOW_defpattern_in_st_def2755);
                            defpattern175=defpattern();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_defpattern.add(defpattern175.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:480:39: ( NL )?
                            int alt78=2;
                            int LA78_0 = input.LA(1);

                            if ( (LA78_0==NL) ) {
                                alt78=1;
                            }
                            switch (alt78) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:480:39: NL
                                    {
                                    NL176=(Token)match(input,NL,FOLLOW_NL_in_st_def2757); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL176);


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:480:45: ( ':' ( NL )? typeid ( NL )? )?
                    int alt82=2;
                    int LA82_0 = input.LA(1);

                    if ( (LA82_0==COLON) ) {
                        alt82=1;
                    }
                    switch (alt82) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:480:46: ':' ( NL )? typeid ( NL )?
                            {
                            char_literal177=(Token)match(input,COLON,FOLLOW_COLON_in_st_def2763); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COLON.add(char_literal177);

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:480:50: ( NL )?
                            int alt80=2;
                            int LA80_0 = input.LA(1);

                            if ( (LA80_0==NL) ) {
                                alt80=1;
                            }
                            switch (alt80) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:480:50: NL
                                    {
                                    NL178=(Token)match(input,NL,FOLLOW_NL_in_st_def2765); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL178);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_typeid_in_st_def2768);
                            typeid179=typeid();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeid.add(typeid179.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:480:61: ( NL )?
                            int alt81=2;
                            int LA81_0 = input.LA(1);

                            if ( (LA81_0==NL) ) {
                                alt81=1;
                            }
                            switch (alt81) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:480:61: NL
                                    {
                                    NL180=(Token)match(input,NL,FOLLOW_NL_in_st_def2770); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL180);


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    char_literal181=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_st_def2775); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal181);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:480:71: ( NL )?
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==NL) ) {
                        alt83=1;
                    }
                    switch (alt83) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:480:71: NL
                            {
                            NL182=(Token)match(input,NL,FOLLOW_NL_in_st_def2777); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL182);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_expr_in_st_def2780);
                    expr183=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr183.getTree());


                    // AST REWRITE
                    // elements: defpattern, Id, expr, typeid
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 481:5: -> ^( DEF Id ( typeid )? ( defpattern )? expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:481:8: ^( DEF Id ( typeid )? ( defpattern )? expr )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DEF, "DEF"), root_1);

                        adaptor.addChild(root_1, stream_Id.nextNode());
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:481:17: ( typeid )?
                        if ( stream_typeid.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeid.nextTree());

                        }
                        stream_typeid.reset();
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:481:25: ( defpattern )?
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:482:4: L_def ( NL )? L_this ( NL )? ':' ( NL )? typeid ( NL )? '=' ( NL )? expr
                    {
                    L_def184=(Token)match(input,L_def,FOLLOW_L_def_in_st_def2806); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_def.add(L_def184);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:482:10: ( NL )?
                    int alt84=2;
                    int LA84_0 = input.LA(1);

                    if ( (LA84_0==NL) ) {
                        alt84=1;
                    }
                    switch (alt84) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:482:10: NL
                            {
                            NL185=(Token)match(input,NL,FOLLOW_NL_in_st_def2808); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL185);


                            }
                            break;

                    }

                    L_this186=(Token)match(input,L_this,FOLLOW_L_this_in_st_def2811); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_this.add(L_this186);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:482:21: ( NL )?
                    int alt85=2;
                    int LA85_0 = input.LA(1);

                    if ( (LA85_0==NL) ) {
                        alt85=1;
                    }
                    switch (alt85) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:482:21: NL
                            {
                            NL187=(Token)match(input,NL,FOLLOW_NL_in_st_def2813); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL187);


                            }
                            break;

                    }

                    char_literal188=(Token)match(input,COLON,FOLLOW_COLON_in_st_def2816); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(char_literal188);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:482:29: ( NL )?
                    int alt86=2;
                    int LA86_0 = input.LA(1);

                    if ( (LA86_0==NL) ) {
                        alt86=1;
                    }
                    switch (alt86) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:482:29: NL
                            {
                            NL189=(Token)match(input,NL,FOLLOW_NL_in_st_def2818); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL189);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_typeid_in_st_def2821);
                    typeid190=typeid();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeid.add(typeid190.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:482:40: ( NL )?
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==NL) ) {
                        alt87=1;
                    }
                    switch (alt87) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:482:40: NL
                            {
                            NL191=(Token)match(input,NL,FOLLOW_NL_in_st_def2823); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL191);


                            }
                            break;

                    }

                    char_literal192=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_st_def2826); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal192);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:482:48: ( NL )?
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==NL) ) {
                        alt88=1;
                    }
                    switch (alt88) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:482:48: NL
                            {
                            NL193=(Token)match(input,NL,FOLLOW_NL_in_st_def2828); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL193);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_expr_in_st_def2831);
                    expr194=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr194.getTree());


                    // AST REWRITE
                    // elements: typeid, expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 482:57: -> ^( CONVERSION typeid expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:482:60: ^( CONVERSION typeid expr )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:484:1: st_typedef : L_typedef ( NL )? Id ( NL )? typedef_clause ( ( NL )? COMMA ( NL )? typedef_clause )* -> ^( TYPEDEF Id ^( NIL_TOKEN ( typedef_clause )* ) ) ;
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:485:2: ( L_typedef ( NL )? Id ( NL )? typedef_clause ( ( NL )? COMMA ( NL )? typedef_clause )* -> ^( TYPEDEF Id ^( NIL_TOKEN ( typedef_clause )* ) ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:485:4: L_typedef ( NL )? Id ( NL )? typedef_clause ( ( NL )? COMMA ( NL )? typedef_clause )*
            {
            L_typedef195=(Token)match(input,L_typedef,FOLLOW_L_typedef_in_st_typedef2854); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_typedef.add(L_typedef195);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:485:14: ( NL )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==NL) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:485:14: NL
                    {
                    NL196=(Token)match(input,NL,FOLLOW_NL_in_st_typedef2856); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL196);


                    }
                    break;

            }

            Id197=(Token)match(input,Id,FOLLOW_Id_in_st_typedef2859); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Id.add(Id197);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:485:21: ( NL )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==NL) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:485:21: NL
                    {
                    NL198=(Token)match(input,NL,FOLLOW_NL_in_st_typedef2861); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL198);


                    }
                    break;

            }

            pushFollow(FOLLOW_typedef_clause_in_st_typedef2864);
            typedef_clause199=typedef_clause();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typedef_clause.add(typedef_clause199.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:485:40: ( ( NL )? COMMA ( NL )? typedef_clause )*
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
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:485:41: ( NL )? COMMA ( NL )? typedef_clause
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:485:41: ( NL )?
            	    int alt92=2;
            	    int LA92_0 = input.LA(1);

            	    if ( (LA92_0==NL) ) {
            	        alt92=1;
            	    }
            	    switch (alt92) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:485:41: NL
            	            {
            	            NL200=(Token)match(input,NL,FOLLOW_NL_in_st_typedef2867); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL200);


            	            }
            	            break;

            	    }

            	    COMMA201=(Token)match(input,COMMA,FOLLOW_COMMA_in_st_typedef2870); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA201);

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:485:51: ( NL )?
            	    int alt93=2;
            	    int LA93_0 = input.LA(1);

            	    if ( (LA93_0==NL) ) {
            	        alt93=1;
            	    }
            	    switch (alt93) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:485:51: NL
            	            {
            	            NL202=(Token)match(input,NL,FOLLOW_NL_in_st_typedef2872); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL202);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_typedef_clause_in_st_typedef2875);
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
            // 485:72: -> ^( TYPEDEF Id ^( NIL_TOKEN ( typedef_clause )* ) )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:485:75: ^( TYPEDEF Id ^( NIL_TOKEN ( typedef_clause )* ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TYPEDEF, "TYPEDEF"), root_1);

                adaptor.addChild(root_1, stream_Id.nextNode());
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:485:88: ^( NIL_TOKEN ( typedef_clause )* )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_2);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:485:100: ( typedef_clause )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:487:1: typedef_clause : ( ( defpattern ( NL )? '=' )=> defpattern ( NL )? '=' ( NL )? expr -> ^( TYPEDEF_CLAUSE defpattern expr ) | defpattern -> ^( TYPEDEF_CLAUSE defpattern ) );
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:488:2: ( ( defpattern ( NL )? '=' )=> defpattern ( NL )? '=' ( NL )? expr -> ^( TYPEDEF_CLAUSE defpattern expr ) | defpattern -> ^( TYPEDEF_CLAUSE defpattern ) )
            int alt97=2;
            alt97 = dfa97.predict(input);
            switch (alt97) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:488:4: ( defpattern ( NL )? '=' )=> defpattern ( NL )? '=' ( NL )? expr
                    {
                    pushFollow(FOLLOW_defpattern_in_typedef_clause2913);
                    defpattern204=defpattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_defpattern.add(defpattern204.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:488:39: ( NL )?
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( (LA95_0==NL) ) {
                        alt95=1;
                    }
                    switch (alt95) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:488:39: NL
                            {
                            NL205=(Token)match(input,NL,FOLLOW_NL_in_typedef_clause2915); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL205);


                            }
                            break;

                    }

                    char_literal206=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_typedef_clause2918); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal206);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:488:47: ( NL )?
                    int alt96=2;
                    int LA96_0 = input.LA(1);

                    if ( (LA96_0==NL) ) {
                        alt96=1;
                    }
                    switch (alt96) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:488:47: NL
                            {
                            NL207=(Token)match(input,NL,FOLLOW_NL_in_typedef_clause2920); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL207);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_expr_in_typedef_clause2923);
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
                    // 488:56: -> ^( TYPEDEF_CLAUSE defpattern expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:488:59: ^( TYPEDEF_CLAUSE defpattern expr )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:489:4: defpattern
                    {
                    pushFollow(FOLLOW_defpattern_in_typedef_clause2938);
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
                    // 489:15: -> ^( TYPEDEF_CLAUSE defpattern )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:489:18: ^( TYPEDEF_CLAUSE defpattern )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:491:1: st_yield : L_yield expr -> ^( YIELD expr ) ;
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:491:9: ( L_yield expr -> ^( YIELD expr ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:491:11: L_yield expr
            {
            L_yield210=(Token)match(input,L_yield,FOLLOW_L_yield_in_st_yield2957); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_yield.add(L_yield210);

            pushFollow(FOLLOW_expr_in_st_yield2959);
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
            // 491:24: -> ^( YIELD expr )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:491:27: ^( YIELD expr )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:493:1: st_memoize : L_memoize memo_id ( ( NL )? COMMA ( NL )? memo_id )* -> ^( MEMOIZE ( memo_id )* ) ;
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:494:2: ( L_memoize memo_id ( ( NL )? COMMA ( NL )? memo_id )* -> ^( MEMOIZE ( memo_id )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:494:4: L_memoize memo_id ( ( NL )? COMMA ( NL )? memo_id )*
            {
            L_memoize212=(Token)match(input,L_memoize,FOLLOW_L_memoize_in_st_memoize2980); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_memoize.add(L_memoize212);

            pushFollow(FOLLOW_memo_id_in_st_memoize2982);
            memo_id213=memo_id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_memo_id.add(memo_id213.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:494:22: ( ( NL )? COMMA ( NL )? memo_id )*
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
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:494:23: ( NL )? COMMA ( NL )? memo_id
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:494:23: ( NL )?
            	    int alt98=2;
            	    int LA98_0 = input.LA(1);

            	    if ( (LA98_0==NL) ) {
            	        alt98=1;
            	    }
            	    switch (alt98) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:494:23: NL
            	            {
            	            NL214=(Token)match(input,NL,FOLLOW_NL_in_st_memoize2985); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL214);


            	            }
            	            break;

            	    }

            	    COMMA215=(Token)match(input,COMMA,FOLLOW_COMMA_in_st_memoize2988); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA215);

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:494:33: ( NL )?
            	    int alt99=2;
            	    int LA99_0 = input.LA(1);

            	    if ( (LA99_0==NL) ) {
            	        alt99=1;
            	    }
            	    switch (alt99) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:494:33: NL
            	            {
            	            NL216=(Token)match(input,NL,FOLLOW_NL_in_st_memoize2990); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL216);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_memo_id_in_st_memoize2993);
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
            // 495:5: -> ^( MEMOIZE ( memo_id )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:495:8: ^( MEMOIZE ( memo_id )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MEMOIZE, "MEMOIZE"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:495:18: ( memo_id )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:497:1: memo_id : ( Id -> ^( MEMOID_STRONG Id ) | '(' Id ')' -> ^( MEMOID_WEAK Id ) );
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:497:9: ( Id -> ^( MEMOID_STRONG Id ) | '(' Id ')' -> ^( MEMOID_WEAK Id ) )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:497:11: Id
                    {
                    Id218=(Token)match(input,Id,FOLLOW_Id_in_memo_id3022); if (state.failed) return retval; 
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
                    // 497:14: -> ^( MEMOID_STRONG Id )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:497:17: ^( MEMOID_STRONG Id )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:498:4: '(' Id ')'
                    {
                    char_literal219=(Token)match(input,ROUND_BRACKET_OPEN,FOLLOW_ROUND_BRACKET_OPEN_in_memo_id3035); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ROUND_BRACKET_OPEN.add(char_literal219);

                    Id220=(Token)match(input,Id,FOLLOW_Id_in_memo_id3037); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Id.add(Id220);

                    char_literal221=(Token)match(input,ROUND_BRACKET_CLOSE,FOLLOW_ROUND_BRACKET_CLOSE_in_memo_id3039); if (state.failed) return retval; 
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
                    // 498:15: -> ^( MEMOID_WEAK Id )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:498:18: ^( MEMOID_WEAK Id )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:500:1: st_private : L_private private_id ( ( NL )? COMMA ( NL )? private_id )* -> ^( PRIVATE ( private_id )* ) ;
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:501:2: ( L_private private_id ( ( NL )? COMMA ( NL )? private_id )* -> ^( PRIVATE ( private_id )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:501:4: L_private private_id ( ( NL )? COMMA ( NL )? private_id )*
            {
            L_private222=(Token)match(input,L_private,FOLLOW_L_private_in_st_private3056); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_private.add(L_private222);

            pushFollow(FOLLOW_private_id_in_st_private3058);
            private_id223=private_id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_private_id.add(private_id223.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:501:25: ( ( NL )? COMMA ( NL )? private_id )*
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
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:501:26: ( NL )? COMMA ( NL )? private_id
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:501:26: ( NL )?
            	    int alt102=2;
            	    int LA102_0 = input.LA(1);

            	    if ( (LA102_0==NL) ) {
            	        alt102=1;
            	    }
            	    switch (alt102) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:501:26: NL
            	            {
            	            NL224=(Token)match(input,NL,FOLLOW_NL_in_st_private3061); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL224);


            	            }
            	            break;

            	    }

            	    COMMA225=(Token)match(input,COMMA,FOLLOW_COMMA_in_st_private3064); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA225);

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:501:36: ( NL )?
            	    int alt103=2;
            	    int LA103_0 = input.LA(1);

            	    if ( (LA103_0==NL) ) {
            	        alt103=1;
            	    }
            	    switch (alt103) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:501:36: NL
            	            {
            	            NL226=(Token)match(input,NL,FOLLOW_NL_in_st_private3066); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL226);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_private_id_in_st_private3069);
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
            // 502:5: -> ^( PRIVATE ( private_id )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:502:8: ^( PRIVATE ( private_id )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PRIVATE, "PRIVATE"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:502:18: ( private_id )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:504:1: private_id : ( Id -> ^( PRIVATEID_STRONG Id ) | '(' Id ')' -> ^( PRIVATEID_WEAK Id ) );
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:505:2: ( Id -> ^( PRIVATEID_STRONG Id ) | '(' Id ')' -> ^( PRIVATEID_WEAK Id ) )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:505:4: Id
                    {
                    Id228=(Token)match(input,Id,FOLLOW_Id_in_private_id3095); if (state.failed) return retval; 
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
                    // 505:7: -> ^( PRIVATEID_STRONG Id )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:505:10: ^( PRIVATEID_STRONG Id )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:506:4: '(' Id ')'
                    {
                    char_literal229=(Token)match(input,ROUND_BRACKET_OPEN,FOLLOW_ROUND_BRACKET_OPEN_in_private_id3108); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ROUND_BRACKET_OPEN.add(char_literal229);

                    Id230=(Token)match(input,Id,FOLLOW_Id_in_private_id3110); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Id.add(Id230);

                    char_literal231=(Token)match(input,ROUND_BRACKET_CLOSE,FOLLOW_ROUND_BRACKET_CLOSE_in_private_id3112); if (state.failed) return retval; 
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
                    // 506:15: -> ^( PRIVATEID_WEAK Id )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:506:18: ^( PRIVATEID_WEAK Id )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:510:1: moduleid : Id ( ( NL )? PERIOD ( NL )? Id )* -> ^( MODULEID ( Id )* ) ;
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:510:11: ( Id ( ( NL )? PERIOD ( NL )? Id )* -> ^( MODULEID ( Id )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:510:13: Id ( ( NL )? PERIOD ( NL )? Id )*
            {
            Id232=(Token)match(input,Id,FOLLOW_Id_in_moduleid3131); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Id.add(Id232);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:510:16: ( ( NL )? PERIOD ( NL )? Id )*
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
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:510:17: ( NL )? PERIOD ( NL )? Id
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:510:17: ( NL )?
            	    int alt106=2;
            	    int LA106_0 = input.LA(1);

            	    if ( (LA106_0==NL) ) {
            	        alt106=1;
            	    }
            	    switch (alt106) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:510:17: NL
            	            {
            	            NL233=(Token)match(input,NL,FOLLOW_NL_in_moduleid3134); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL233);


            	            }
            	            break;

            	    }

            	    PERIOD234=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_moduleid3137); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD234);

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:510:28: ( NL )?
            	    int alt107=2;
            	    int LA107_0 = input.LA(1);

            	    if ( (LA107_0==NL) ) {
            	        alt107=1;
            	    }
            	    switch (alt107) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:510:28: NL
            	            {
            	            NL235=(Token)match(input,NL,FOLLOW_NL_in_moduleid3139); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL235);


            	            }
            	            break;

            	    }

            	    Id236=(Token)match(input,Id,FOLLOW_Id_in_moduleid3142); if (state.failed) return retval; 
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
            // 510:37: -> ^( MODULEID ( Id )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:510:40: ^( MODULEID ( Id )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MODULEID, "MODULEID"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:510:51: ( Id )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:512:1: st_module : L_module ( NL )? moduleid block L_end -> ^( L_module moduleid block ) ;
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:513:2: ( L_module ( NL )? moduleid block L_end -> ^( L_module moduleid block ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:513:4: L_module ( NL )? moduleid block L_end
            {
            L_module237=(Token)match(input,L_module,FOLLOW_L_module_in_st_module3162); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_module.add(L_module237);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:513:13: ( NL )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==NL) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:513:13: NL
                    {
                    NL238=(Token)match(input,NL,FOLLOW_NL_in_st_module3164); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL238);


                    }
                    break;

            }

            pushFollow(FOLLOW_moduleid_in_st_module3167);
            moduleid239=moduleid();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_moduleid.add(moduleid239.getTree());
            pushFollow(FOLLOW_block_in_st_module3169);
            block240=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block240.getTree());
            L_end241=(Token)match(input,L_end,FOLLOW_L_end_in_st_module3171); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_end.add(L_end241);



            // AST REWRITE
            // elements: block, moduleid, L_module
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 513:38: -> ^( L_module moduleid block )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:513:41: ^( L_module moduleid block )
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

    public static class importprefix_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "importprefix"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:515:1: importprefix : Id ( ( NL )? PERIOD ( NL )? Id )* -> ^( IMPORT_PREFIX ( Id )* ) ;
    public final babel17Parser.importprefix_return importprefix() throws RecognitionException {
        babel17Parser.importprefix_return retval = new babel17Parser.importprefix_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Id242=null;
        Token NL243=null;
        Token PERIOD244=null;
        Token NL245=null;
        Token Id246=null;

        CommonTree Id242_tree=null;
        CommonTree NL243_tree=null;
        CommonTree PERIOD244_tree=null;
        CommonTree NL245_tree=null;
        CommonTree Id246_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_Id=new RewriteRuleTokenStream(adaptor,"token Id");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:516:2: ( Id ( ( NL )? PERIOD ( NL )? Id )* -> ^( IMPORT_PREFIX ( Id )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:516:4: Id ( ( NL )? PERIOD ( NL )? Id )*
            {
            Id242=(Token)match(input,Id,FOLLOW_Id_in_importprefix3191); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Id.add(Id242);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:516:7: ( ( NL )? PERIOD ( NL )? Id )*
            loop112:
            do {
                int alt112=2;
                int LA112_0 = input.LA(1);

                if ( (LA112_0==NL) ) {
                    int LA112_1 = input.LA(2);

                    if ( (LA112_1==PERIOD) ) {
                        int LA112_2 = input.LA(3);

                        if ( (LA112_2==NL) ) {
                            int LA112_4 = input.LA(4);

                            if ( (LA112_4==Id) ) {
                                alt112=1;
                            }


                        }
                        else if ( (LA112_2==Id) ) {
                            alt112=1;
                        }


                    }


                }
                else if ( (LA112_0==PERIOD) ) {
                    int LA112_2 = input.LA(2);

                    if ( (LA112_2==NL) ) {
                        int LA112_4 = input.LA(3);

                        if ( (LA112_4==Id) ) {
                            alt112=1;
                        }


                    }
                    else if ( (LA112_2==Id) ) {
                        alt112=1;
                    }


                }


                switch (alt112) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:516:8: ( NL )? PERIOD ( NL )? Id
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:516:8: ( NL )?
            	    int alt110=2;
            	    int LA110_0 = input.LA(1);

            	    if ( (LA110_0==NL) ) {
            	        alt110=1;
            	    }
            	    switch (alt110) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:516:8: NL
            	            {
            	            NL243=(Token)match(input,NL,FOLLOW_NL_in_importprefix3194); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL243);


            	            }
            	            break;

            	    }

            	    PERIOD244=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_importprefix3197); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD244);

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:516:19: ( NL )?
            	    int alt111=2;
            	    int LA111_0 = input.LA(1);

            	    if ( (LA111_0==NL) ) {
            	        alt111=1;
            	    }
            	    switch (alt111) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:516:19: NL
            	            {
            	            NL245=(Token)match(input,NL,FOLLOW_NL_in_importprefix3199); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL245);


            	            }
            	            break;

            	    }

            	    Id246=(Token)match(input,Id,FOLLOW_Id_in_importprefix3202); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_Id.add(Id246);


            	    }
            	    break;

            	default :
            	    break loop112;
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
            // 516:28: -> ^( IMPORT_PREFIX ( Id )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:516:31: ^( IMPORT_PREFIX ( Id )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IMPORT_PREFIX, "IMPORT_PREFIX"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:516:47: ( Id )*
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
    // $ANTLR end "importprefix"

    public static class importall_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "importall"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:518:1: importall : UNDERSCORE -> ^( IMPORT_ALL ) ;
    public final babel17Parser.importall_return importall() throws RecognitionException {
        babel17Parser.importall_return retval = new babel17Parser.importall_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token UNDERSCORE247=null;

        CommonTree UNDERSCORE247_tree=null;
        RewriteRuleTokenStream stream_UNDERSCORE=new RewriteRuleTokenStream(adaptor,"token UNDERSCORE");

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:519:2: ( UNDERSCORE -> ^( IMPORT_ALL ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:519:4: UNDERSCORE
            {
            UNDERSCORE247=(Token)match(input,UNDERSCORE,FOLLOW_UNDERSCORE_in_importall3224); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_UNDERSCORE.add(UNDERSCORE247);



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
            // 519:15: -> ^( IMPORT_ALL )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:519:18: ^( IMPORT_ALL )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IMPORT_ALL, "IMPORT_ALL"), root_1);

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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

    public static class importsetclause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "importsetclause"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:521:1: importsetclause : ( Id ( ( NL )? token_DOUBLE_ARROW ( ( NL )? Id )? )? -> ^( IMPORT_PLUS ( Id )* ) | '-' ( NL )? Id -> ^( IMPORT_MINUS ( Id )* ) );
    public final babel17Parser.importsetclause_return importsetclause() throws RecognitionException {
        babel17Parser.importsetclause_return retval = new babel17Parser.importsetclause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Id248=null;
        Token NL249=null;
        Token NL251=null;
        Token Id252=null;
        Token char_literal253=null;
        Token NL254=null;
        Token Id255=null;
        babel17Parser.token_DOUBLE_ARROW_return token_DOUBLE_ARROW250 = null;


        CommonTree Id248_tree=null;
        CommonTree NL249_tree=null;
        CommonTree NL251_tree=null;
        CommonTree Id252_tree=null;
        CommonTree char_literal253_tree=null;
        CommonTree NL254_tree=null;
        CommonTree Id255_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleTokenStream stream_Id=new RewriteRuleTokenStream(adaptor,"token Id");
        RewriteRuleSubtreeStream stream_token_DOUBLE_ARROW=new RewriteRuleSubtreeStream(adaptor,"rule token_DOUBLE_ARROW");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:522:2: ( Id ( ( NL )? token_DOUBLE_ARROW ( ( NL )? Id )? )? -> ^( IMPORT_PLUS ( Id )* ) | '-' ( NL )? Id -> ^( IMPORT_MINUS ( Id )* ) )
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==Id) ) {
                alt118=1;
            }
            else if ( (LA118_0==MINUS) ) {
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:522:4: Id ( ( NL )? token_DOUBLE_ARROW ( ( NL )? Id )? )?
                    {
                    Id248=(Token)match(input,Id,FOLLOW_Id_in_importsetclause3240); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Id.add(Id248);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:522:7: ( ( NL )? token_DOUBLE_ARROW ( ( NL )? Id )? )?
                    int alt116=2;
                    int LA116_0 = input.LA(1);

                    if ( (LA116_0==NL) ) {
                        int LA116_1 = input.LA(2);

                        if ( ((LA116_1>=A_DOUBLE_ARROW && LA116_1<=U_DOUBLE_ARROW)) ) {
                            alt116=1;
                        }
                    }
                    else if ( ((LA116_0>=A_DOUBLE_ARROW && LA116_0<=U_DOUBLE_ARROW)) ) {
                        alt116=1;
                    }
                    switch (alt116) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:522:8: ( NL )? token_DOUBLE_ARROW ( ( NL )? Id )?
                            {
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:522:8: ( NL )?
                            int alt113=2;
                            int LA113_0 = input.LA(1);

                            if ( (LA113_0==NL) ) {
                                alt113=1;
                            }
                            switch (alt113) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:522:8: NL
                                    {
                                    NL249=(Token)match(input,NL,FOLLOW_NL_in_importsetclause3243); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL249);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_token_DOUBLE_ARROW_in_importsetclause3246);
                            token_DOUBLE_ARROW250=token_DOUBLE_ARROW();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_token_DOUBLE_ARROW.add(token_DOUBLE_ARROW250.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:522:31: ( ( NL )? Id )?
                            int alt115=2;
                            int LA115_0 = input.LA(1);

                            if ( (LA115_0==NL) ) {
                                int LA115_1 = input.LA(2);

                                if ( (LA115_1==Id) ) {
                                    alt115=1;
                                }
                            }
                            else if ( (LA115_0==Id) ) {
                                alt115=1;
                            }
                            switch (alt115) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:522:32: ( NL )? Id
                                    {
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:522:32: ( NL )?
                                    int alt114=2;
                                    int LA114_0 = input.LA(1);

                                    if ( (LA114_0==NL) ) {
                                        alt114=1;
                                    }
                                    switch (alt114) {
                                        case 1 :
                                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:522:32: NL
                                            {
                                            NL251=(Token)match(input,NL,FOLLOW_NL_in_importsetclause3249); if (state.failed) return retval; 
                                            if ( state.backtracking==0 ) stream_NL.add(NL251);


                                            }
                                            break;

                                    }

                                    Id252=(Token)match(input,Id,FOLLOW_Id_in_importsetclause3252); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_Id.add(Id252);


                                    }
                                    break;

                            }


                            }
                            break;

                    }



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
                    // 522:43: -> ^( IMPORT_PLUS ( Id )* )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:522:46: ^( IMPORT_PLUS ( Id )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IMPORT_PLUS, "IMPORT_PLUS"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:522:60: ( Id )*
                        while ( stream_Id.hasNext() ) {
                            adaptor.addChild(root_1, stream_Id.nextNode());

                        }
                        stream_Id.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:523:4: '-' ( NL )? Id
                    {
                    char_literal253=(Token)match(input,MINUS,FOLLOW_MINUS_in_importsetclause3270); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(char_literal253);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:523:8: ( NL )?
                    int alt117=2;
                    int LA117_0 = input.LA(1);

                    if ( (LA117_0==NL) ) {
                        alt117=1;
                    }
                    switch (alt117) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:523:8: NL
                            {
                            NL254=(Token)match(input,NL,FOLLOW_NL_in_importsetclause3272); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL254);


                            }
                            break;

                    }

                    Id255=(Token)match(input,Id,FOLLOW_Id_in_importsetclause3275); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Id.add(Id255);



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
                    // 523:15: -> ^( IMPORT_MINUS ( Id )* )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:523:18: ^( IMPORT_MINUS ( Id )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IMPORT_MINUS, "IMPORT_MINUS"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:523:33: ( Id )*
                        while ( stream_Id.hasNext() ) {
                            adaptor.addChild(root_1, stream_Id.nextNode());

                        }
                        stream_Id.reset();

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
    // $ANTLR end "importsetclause"

    public static class importset_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "importset"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:525:1: importset : '{' ( NL )? importsetclause ( ( NL )? ',' ( NL )? importsetclause )* ( NL )? '}' -> ^( IMPORT_SET ( importsetclause )* ) ;
    public final babel17Parser.importset_return importset() throws RecognitionException {
        babel17Parser.importset_return retval = new babel17Parser.importset_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal256=null;
        Token NL257=null;
        Token NL259=null;
        Token char_literal260=null;
        Token NL261=null;
        Token NL263=null;
        Token char_literal264=null;
        babel17Parser.importsetclause_return importsetclause258 = null;

        babel17Parser.importsetclause_return importsetclause262 = null;


        CommonTree char_literal256_tree=null;
        CommonTree NL257_tree=null;
        CommonTree NL259_tree=null;
        CommonTree char_literal260_tree=null;
        CommonTree NL261_tree=null;
        CommonTree NL263_tree=null;
        CommonTree char_literal264_tree=null;
        RewriteRuleTokenStream stream_CURLY_BRACKET_OPEN=new RewriteRuleTokenStream(adaptor,"token CURLY_BRACKET_OPEN");
        RewriteRuleTokenStream stream_CURLY_BRACKET_CLOSE=new RewriteRuleTokenStream(adaptor,"token CURLY_BRACKET_CLOSE");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_importsetclause=new RewriteRuleSubtreeStream(adaptor,"rule importsetclause");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:526:2: ( '{' ( NL )? importsetclause ( ( NL )? ',' ( NL )? importsetclause )* ( NL )? '}' -> ^( IMPORT_SET ( importsetclause )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:526:4: '{' ( NL )? importsetclause ( ( NL )? ',' ( NL )? importsetclause )* ( NL )? '}'
            {
            char_literal256=(Token)match(input,CURLY_BRACKET_OPEN,FOLLOW_CURLY_BRACKET_OPEN_in_importset3294); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CURLY_BRACKET_OPEN.add(char_literal256);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:526:8: ( NL )?
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==NL) ) {
                alt119=1;
            }
            switch (alt119) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:526:8: NL
                    {
                    NL257=(Token)match(input,NL,FOLLOW_NL_in_importset3296); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL257);


                    }
                    break;

            }

            pushFollow(FOLLOW_importsetclause_in_importset3299);
            importsetclause258=importsetclause();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_importsetclause.add(importsetclause258.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:526:28: ( ( NL )? ',' ( NL )? importsetclause )*
            loop122:
            do {
                int alt122=2;
                int LA122_0 = input.LA(1);

                if ( (LA122_0==NL) ) {
                    int LA122_1 = input.LA(2);

                    if ( (LA122_1==COMMA) ) {
                        alt122=1;
                    }


                }
                else if ( (LA122_0==COMMA) ) {
                    alt122=1;
                }


                switch (alt122) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:526:29: ( NL )? ',' ( NL )? importsetclause
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:526:29: ( NL )?
            	    int alt120=2;
            	    int LA120_0 = input.LA(1);

            	    if ( (LA120_0==NL) ) {
            	        alt120=1;
            	    }
            	    switch (alt120) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:526:29: NL
            	            {
            	            NL259=(Token)match(input,NL,FOLLOW_NL_in_importset3302); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL259);


            	            }
            	            break;

            	    }

            	    char_literal260=(Token)match(input,COMMA,FOLLOW_COMMA_in_importset3305); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(char_literal260);

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:526:37: ( NL )?
            	    int alt121=2;
            	    int LA121_0 = input.LA(1);

            	    if ( (LA121_0==NL) ) {
            	        alt121=1;
            	    }
            	    switch (alt121) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:526:37: NL
            	            {
            	            NL261=(Token)match(input,NL,FOLLOW_NL_in_importset3307); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL261);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_importsetclause_in_importset3310);
            	    importsetclause262=importsetclause();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_importsetclause.add(importsetclause262.getTree());

            	    }
            	    break;

            	default :
            	    break loop122;
                }
            } while (true);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:526:59: ( NL )?
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==NL) ) {
                alt123=1;
            }
            switch (alt123) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:526:59: NL
                    {
                    NL263=(Token)match(input,NL,FOLLOW_NL_in_importset3314); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL263);


                    }
                    break;

            }

            char_literal264=(Token)match(input,CURLY_BRACKET_CLOSE,FOLLOW_CURLY_BRACKET_CLOSE_in_importset3317); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CURLY_BRACKET_CLOSE.add(char_literal264);



            // AST REWRITE
            // elements: importsetclause
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 526:67: -> ^( IMPORT_SET ( importsetclause )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:526:70: ^( IMPORT_SET ( importsetclause )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IMPORT_SET, "IMPORT_SET"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:526:83: ( importsetclause )*
                while ( stream_importsetclause.hasNext() ) {
                    adaptor.addChild(root_1, stream_importsetclause.nextTree());

                }
                stream_importsetclause.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "importset"

    public static class st_import_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "st_import"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:528:1: st_import : L_import ( NL )? importprefix ( ( NL )? ( PERIOD ( NL )? importall | PERIOD ( NL )? importset | token_DOUBLE_ARROW ( NL )? Id ) )? -> ^( L_import importprefix ( importall )? ( importset )? ( Id )? ) ;
    public final babel17Parser.st_import_return st_import() throws RecognitionException {
        babel17Parser.st_import_return retval = new babel17Parser.st_import_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_import265=null;
        Token NL266=null;
        Token NL268=null;
        Token PERIOD269=null;
        Token NL270=null;
        Token PERIOD272=null;
        Token NL273=null;
        Token NL276=null;
        Token Id277=null;
        babel17Parser.importprefix_return importprefix267 = null;

        babel17Parser.importall_return importall271 = null;

        babel17Parser.importset_return importset274 = null;

        babel17Parser.token_DOUBLE_ARROW_return token_DOUBLE_ARROW275 = null;


        CommonTree L_import265_tree=null;
        CommonTree NL266_tree=null;
        CommonTree NL268_tree=null;
        CommonTree PERIOD269_tree=null;
        CommonTree NL270_tree=null;
        CommonTree PERIOD272_tree=null;
        CommonTree NL273_tree=null;
        CommonTree NL276_tree=null;
        CommonTree Id277_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
        RewriteRuleTokenStream stream_Id=new RewriteRuleTokenStream(adaptor,"token Id");
        RewriteRuleTokenStream stream_L_import=new RewriteRuleTokenStream(adaptor,"token L_import");
        RewriteRuleSubtreeStream stream_importprefix=new RewriteRuleSubtreeStream(adaptor,"rule importprefix");
        RewriteRuleSubtreeStream stream_importset=new RewriteRuleSubtreeStream(adaptor,"rule importset");
        RewriteRuleSubtreeStream stream_token_DOUBLE_ARROW=new RewriteRuleSubtreeStream(adaptor,"rule token_DOUBLE_ARROW");
        RewriteRuleSubtreeStream stream_importall=new RewriteRuleSubtreeStream(adaptor,"rule importall");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:529:2: ( L_import ( NL )? importprefix ( ( NL )? ( PERIOD ( NL )? importall | PERIOD ( NL )? importset | token_DOUBLE_ARROW ( NL )? Id ) )? -> ^( L_import importprefix ( importall )? ( importset )? ( Id )? ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:529:4: L_import ( NL )? importprefix ( ( NL )? ( PERIOD ( NL )? importall | PERIOD ( NL )? importset | token_DOUBLE_ARROW ( NL )? Id ) )?
            {
            L_import265=(Token)match(input,L_import,FOLLOW_L_import_in_st_import3335); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_import.add(L_import265);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:529:13: ( NL )?
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==NL) ) {
                alt124=1;
            }
            switch (alt124) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:529:13: NL
                    {
                    NL266=(Token)match(input,NL,FOLLOW_NL_in_st_import3337); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL266);


                    }
                    break;

            }

            pushFollow(FOLLOW_importprefix_in_st_import3340);
            importprefix267=importprefix();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_importprefix.add(importprefix267.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:529:30: ( ( NL )? ( PERIOD ( NL )? importall | PERIOD ( NL )? importset | token_DOUBLE_ARROW ( NL )? Id ) )?
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==NL) ) {
                int LA130_1 = input.LA(2);

                if ( ((LA130_1>=A_DOUBLE_ARROW && LA130_1<=U_DOUBLE_ARROW)||LA130_1==PERIOD) ) {
                    alt130=1;
                }
            }
            else if ( ((LA130_0>=A_DOUBLE_ARROW && LA130_0<=U_DOUBLE_ARROW)||LA130_0==PERIOD) ) {
                alt130=1;
            }
            switch (alt130) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:529:31: ( NL )? ( PERIOD ( NL )? importall | PERIOD ( NL )? importset | token_DOUBLE_ARROW ( NL )? Id )
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:529:31: ( NL )?
                    int alt125=2;
                    int LA125_0 = input.LA(1);

                    if ( (LA125_0==NL) ) {
                        alt125=1;
                    }
                    switch (alt125) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:529:31: NL
                            {
                            NL268=(Token)match(input,NL,FOLLOW_NL_in_st_import3343); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL268);


                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:529:35: ( PERIOD ( NL )? importall | PERIOD ( NL )? importset | token_DOUBLE_ARROW ( NL )? Id )
                    int alt129=3;
                    int LA129_0 = input.LA(1);

                    if ( (LA129_0==PERIOD) ) {
                        switch ( input.LA(2) ) {
                        case NL:
                            {
                            int LA129_3 = input.LA(3);

                            if ( (LA129_3==CURLY_BRACKET_OPEN) ) {
                                alt129=2;
                            }
                            else if ( (LA129_3==UNDERSCORE) ) {
                                alt129=1;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 129, 3, input);

                                throw nvae;
                            }
                            }
                            break;
                        case CURLY_BRACKET_OPEN:
                            {
                            alt129=2;
                            }
                            break;
                        case UNDERSCORE:
                            {
                            alt129=1;
                            }
                            break;
                        default:
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 129, 1, input);

                            throw nvae;
                        }

                    }
                    else if ( ((LA129_0>=A_DOUBLE_ARROW && LA129_0<=U_DOUBLE_ARROW)) ) {
                        alt129=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 129, 0, input);

                        throw nvae;
                    }
                    switch (alt129) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:529:36: PERIOD ( NL )? importall
                            {
                            PERIOD269=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_st_import3347); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD269);

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:529:43: ( NL )?
                            int alt126=2;
                            int LA126_0 = input.LA(1);

                            if ( (LA126_0==NL) ) {
                                alt126=1;
                            }
                            switch (alt126) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:529:43: NL
                                    {
                                    NL270=(Token)match(input,NL,FOLLOW_NL_in_st_import3349); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL270);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_importall_in_st_import3352);
                            importall271=importall();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_importall.add(importall271.getTree());

                            }
                            break;
                        case 2 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:529:59: PERIOD ( NL )? importset
                            {
                            PERIOD272=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_st_import3356); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD272);

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:529:66: ( NL )?
                            int alt127=2;
                            int LA127_0 = input.LA(1);

                            if ( (LA127_0==NL) ) {
                                alt127=1;
                            }
                            switch (alt127) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:529:66: NL
                                    {
                                    NL273=(Token)match(input,NL,FOLLOW_NL_in_st_import3358); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL273);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_importset_in_st_import3361);
                            importset274=importset();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_importset.add(importset274.getTree());

                            }
                            break;
                        case 3 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:529:82: token_DOUBLE_ARROW ( NL )? Id
                            {
                            pushFollow(FOLLOW_token_DOUBLE_ARROW_in_st_import3365);
                            token_DOUBLE_ARROW275=token_DOUBLE_ARROW();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_token_DOUBLE_ARROW.add(token_DOUBLE_ARROW275.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:529:101: ( NL )?
                            int alt128=2;
                            int LA128_0 = input.LA(1);

                            if ( (LA128_0==NL) ) {
                                alt128=1;
                            }
                            switch (alt128) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:529:101: NL
                                    {
                                    NL276=(Token)match(input,NL,FOLLOW_NL_in_st_import3367); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL276);


                                    }
                                    break;

                            }

                            Id277=(Token)match(input,Id,FOLLOW_Id_in_st_import3370); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_Id.add(Id277);


                            }
                            break;

                    }


                    }
                    break;

            }



            // AST REWRITE
            // elements: importall, Id, L_import, importset, importprefix
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 529:111: -> ^( L_import importprefix ( importall )? ( importset )? ( Id )? )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:529:114: ^( L_import importprefix ( importall )? ( importset )? ( Id )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_L_import.nextNode(), root_1);

                adaptor.addChild(root_1, stream_importprefix.nextTree());
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:529:138: ( importall )?
                if ( stream_importall.hasNext() ) {
                    adaptor.addChild(root_1, stream_importall.nextTree());

                }
                stream_importall.reset();
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:529:149: ( importset )?
                if ( stream_importset.hasNext() ) {
                    adaptor.addChild(root_1, stream_importset.nextTree());

                }
                stream_importset.reset();
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:529:160: ( Id )?
                if ( stream_Id.hasNext() ) {
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
    // $ANTLR end "st_import"

    public static class expr_or_assign_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr_or_assign"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:531:1: expr_or_assign : ( ( ( pattern | objelem_assign ) ( NL )? '=' )=> ( pattern | objelem_assign ) ( NL )? '=' ( NL )? expr -> ^( ASSIGN ( pattern )* ( objelem_assign )* expr ) | expr );
    public final babel17Parser.expr_or_assign_return expr_or_assign() throws RecognitionException {
        babel17Parser.expr_or_assign_return retval = new babel17Parser.expr_or_assign_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL280=null;
        Token char_literal281=null;
        Token NL282=null;
        babel17Parser.pattern_return pattern278 = null;

        babel17Parser.objelem_assign_return objelem_assign279 = null;

        babel17Parser.expr_return expr283 = null;

        babel17Parser.expr_return expr284 = null;


        CommonTree NL280_tree=null;
        CommonTree char_literal281_tree=null;
        CommonTree NL282_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_objelem_assign=new RewriteRuleSubtreeStream(adaptor,"rule objelem_assign");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:532:2: ( ( ( pattern | objelem_assign ) ( NL )? '=' )=> ( pattern | objelem_assign ) ( NL )? '=' ( NL )? expr -> ^( ASSIGN ( pattern )* ( objelem_assign )* expr ) | expr )
            int alt134=2;
            alt134 = dfa134.predict(input);
            switch (alt134) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:532:4: ( ( pattern | objelem_assign ) ( NL )? '=' )=> ( pattern | objelem_assign ) ( NL )? '=' ( NL )? expr
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:532:44: ( pattern | objelem_assign )
                    int alt131=2;
                    int LA131_0 = input.LA(1);

                    if ( (LA131_0==L_exception||(LA131_0>=A_infinity && LA131_0<=U_infinity)||(LA131_0>=L_true && LA131_0<=L_false)||LA131_0==L_nil||LA131_0==MINUS||(LA131_0>=A_ELLIPSIS && LA131_0<=U_ELLIPSIS)||LA131_0==Constr||LA131_0==Num||(LA131_0>=String && LA131_0<=ROUND_BRACKET_OPEN)||LA131_0==SQUARE_BRACKET_OPEN||LA131_0==CURLY_BRACKET_OPEN||LA131_0==UNDERSCORE) ) {
                        alt131=1;
                    }
                    else if ( (LA131_0==Id) ) {
                        int LA131_2 = input.LA(2);

                        if ( (LA131_2==PERIOD) ) {
                            alt131=2;
                        }
                        else if ( (LA131_2==ASSIGN||(LA131_2>=A_DOUBLE_COLON && LA131_2<=U_DOUBLE_COLON)||LA131_2==NL) ) {
                            alt131=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 131, 2, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 131, 0, input);

                        throw nvae;
                    }
                    switch (alt131) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:532:45: pattern
                            {
                            pushFollow(FOLLOW_pattern_in_expr_or_assign3418);
                            pattern278=pattern();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_pattern.add(pattern278.getTree());

                            }
                            break;
                        case 2 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:532:55: objelem_assign
                            {
                            pushFollow(FOLLOW_objelem_assign_in_expr_or_assign3422);
                            objelem_assign279=objelem_assign();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_objelem_assign.add(objelem_assign279.getTree());

                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:532:71: ( NL )?
                    int alt132=2;
                    int LA132_0 = input.LA(1);

                    if ( (LA132_0==NL) ) {
                        alt132=1;
                    }
                    switch (alt132) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:532:71: NL
                            {
                            NL280=(Token)match(input,NL,FOLLOW_NL_in_expr_or_assign3425); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL280);


                            }
                            break;

                    }

                    char_literal281=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_expr_or_assign3428); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal281);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:532:79: ( NL )?
                    int alt133=2;
                    int LA133_0 = input.LA(1);

                    if ( (LA133_0==NL) ) {
                        alt133=1;
                    }
                    switch (alt133) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:532:79: NL
                            {
                            NL282=(Token)match(input,NL,FOLLOW_NL_in_expr_or_assign3430); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL282);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_expr_in_expr_or_assign3433);
                    expr283=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr283.getTree());


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
                    // 532:88: -> ^( ASSIGN ( pattern )* ( objelem_assign )* expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:532:91: ^( ASSIGN ( pattern )* ( objelem_assign )* expr )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASSIGN, "ASSIGN"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:532:100: ( pattern )*
                        while ( stream_pattern.hasNext() ) {
                            adaptor.addChild(root_1, stream_pattern.nextTree());

                        }
                        stream_pattern.reset();
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:532:109: ( objelem_assign )*
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:533:4: expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_expr_in_expr_or_assign3452);
                    expr284=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr284.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:535:1: expr : ( lop_expr | obj_expr );
    public final babel17Parser.expr_return expr() throws RecognitionException {
        babel17Parser.expr_return retval = new babel17Parser.expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.lop_expr_return lop_expr285 = null;

        babel17Parser.obj_expr_return obj_expr286 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:536:2: ( lop_expr | obj_expr )
            int alt135=2;
            int LA135_0 = input.LA(1);

            if ( (LA135_0==L_begin||(LA135_0>=L_with && LA135_0<=L_if)||(LA135_0>=L_while && LA135_0<=L_for)||LA135_0==L_match||LA135_0==L_exception||LA135_0==L_try||(LA135_0>=A_infinity && LA135_0<=L_lazy)||(LA135_0>=L_true && LA135_0<=L_nil)||LA135_0==L_typeof||LA135_0==MINUS||LA135_0==A_NOT||LA135_0==U_NOT||(LA135_0>=A_ELLIPSIS && LA135_0<=U_ELLIPSIS)||LA135_0==L_force||(LA135_0>=Constr && LA135_0<=Num)||(LA135_0>=String && LA135_0<=ROUND_BRACKET_OPEN)||LA135_0==SQUARE_BRACKET_OPEN||LA135_0==CURLY_BRACKET_OPEN||LA135_0==UNDERSCORE) ) {
                alt135=1;
            }
            else if ( (LA135_0==L_obj) ) {
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:536:4: lop_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_lop_expr_in_expr3463);
                    lop_expr285=lop_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lop_expr285.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:537:4: obj_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_obj_expr_in_expr3468);
                    obj_expr286=obj_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, obj_expr286.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:539:1: control_expr : ( if_expr | while_do_expr | match_expr | for_expr | try_expr | begin_end );
    public final babel17Parser.control_expr_return control_expr() throws RecognitionException {
        babel17Parser.control_expr_return retval = new babel17Parser.control_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.if_expr_return if_expr287 = null;

        babel17Parser.while_do_expr_return while_do_expr288 = null;

        babel17Parser.match_expr_return match_expr289 = null;

        babel17Parser.for_expr_return for_expr290 = null;

        babel17Parser.try_expr_return try_expr291 = null;

        babel17Parser.begin_end_return begin_end292 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:540:2: ( if_expr | while_do_expr | match_expr | for_expr | try_expr | begin_end )
            int alt136=6;
            switch ( input.LA(1) ) {
            case L_if:
                {
                alt136=1;
                }
                break;
            case L_while:
                {
                alt136=2;
                }
                break;
            case L_match:
                {
                alt136=3;
                }
                break;
            case L_for:
                {
                alt136=4;
                }
                break;
            case L_try:
                {
                alt136=5;
                }
                break;
            case L_begin:
                {
                alt136=6;
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:540:4: if_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_if_expr_in_control_expr3478);
                    if_expr287=if_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, if_expr287.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:541:4: while_do_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_while_do_expr_in_control_expr3483);
                    while_do_expr288=while_do_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, while_do_expr288.getTree());

                    }
                    break;
                case 3 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:542:4: match_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_match_expr_in_control_expr3488);
                    match_expr289=match_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, match_expr289.getTree());

                    }
                    break;
                case 4 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:543:4: for_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_for_expr_in_control_expr3493);
                    for_expr290=for_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, for_expr290.getTree());

                    }
                    break;
                case 5 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:544:5: try_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_try_expr_in_control_expr3499);
                    try_expr291=try_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, try_expr291.getTree());

                    }
                    break;
                case 6 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:545:4: begin_end
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_begin_end_in_control_expr3504);
                    begin_end292=begin_end();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, begin_end292.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:547:1: with_control_expr : ( control_expr | L_with ( NL )? protected_expr ( NL )? L_do block L_end -> ^( WITH protected_expr ^( BEGIN block ) ) );
    public final babel17Parser.with_control_expr_return with_control_expr() throws RecognitionException {
        babel17Parser.with_control_expr_return retval = new babel17Parser.with_control_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_with294=null;
        Token NL295=null;
        Token NL297=null;
        Token L_do298=null;
        Token L_end300=null;
        babel17Parser.control_expr_return control_expr293 = null;

        babel17Parser.protected_expr_return protected_expr296 = null;

        babel17Parser.block_return block299 = null;


        CommonTree L_with294_tree=null;
        CommonTree NL295_tree=null;
        CommonTree NL297_tree=null;
        CommonTree L_do298_tree=null;
        CommonTree L_end300_tree=null;
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_do=new RewriteRuleTokenStream(adaptor,"token L_do");
        RewriteRuleTokenStream stream_L_with=new RewriteRuleTokenStream(adaptor,"token L_with");
        RewriteRuleSubtreeStream stream_protected_expr=new RewriteRuleSubtreeStream(adaptor,"rule protected_expr");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:548:2: ( control_expr | L_with ( NL )? protected_expr ( NL )? L_do block L_end -> ^( WITH protected_expr ^( BEGIN block ) ) )
            int alt139=2;
            int LA139_0 = input.LA(1);

            if ( (LA139_0==L_begin||LA139_0==L_if||(LA139_0>=L_while && LA139_0<=L_for)||LA139_0==L_match||LA139_0==L_try) ) {
                alt139=1;
            }
            else if ( (LA139_0==L_with) ) {
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:548:4: control_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_control_expr_in_with_control_expr3514);
                    control_expr293=control_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, control_expr293.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:549:4: L_with ( NL )? protected_expr ( NL )? L_do block L_end
                    {
                    L_with294=(Token)match(input,L_with,FOLLOW_L_with_in_with_control_expr3519); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_with.add(L_with294);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:549:11: ( NL )?
                    int alt137=2;
                    int LA137_0 = input.LA(1);

                    if ( (LA137_0==NL) ) {
                        alt137=1;
                    }
                    switch (alt137) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:549:11: NL
                            {
                            NL295=(Token)match(input,NL,FOLLOW_NL_in_with_control_expr3521); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL295);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_protected_expr_in_with_control_expr3524);
                    protected_expr296=protected_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr296.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:549:30: ( NL )?
                    int alt138=2;
                    int LA138_0 = input.LA(1);

                    if ( (LA138_0==NL) ) {
                        alt138=1;
                    }
                    switch (alt138) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:549:30: NL
                            {
                            NL297=(Token)match(input,NL,FOLLOW_NL_in_with_control_expr3526); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL297);


                            }
                            break;

                    }

                    L_do298=(Token)match(input,L_do,FOLLOW_L_do_in_with_control_expr3529); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_do.add(L_do298);

                    pushFollow(FOLLOW_block_in_with_control_expr3531);
                    block299=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block299.getTree());
                    L_end300=(Token)match(input,L_end,FOLLOW_L_end_in_with_control_expr3533); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_end.add(L_end300);



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
                    // 549:51: -> ^( WITH protected_expr ^( BEGIN block ) )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:549:54: ^( WITH protected_expr ^( BEGIN block ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(WITH, "WITH"), root_1);

                        adaptor.addChild(root_1, stream_protected_expr.nextTree());
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:549:76: ^( BEGIN block )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:552:1: protected_expr : ( p_lop_expr | obj_expr );
    public final babel17Parser.protected_expr_return protected_expr() throws RecognitionException {
        babel17Parser.protected_expr_return retval = new babel17Parser.protected_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.p_lop_expr_return p_lop_expr301 = null;

        babel17Parser.obj_expr_return obj_expr302 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:553:2: ( p_lop_expr | obj_expr )
            int alt140=2;
            int LA140_0 = input.LA(1);

            if ( (LA140_0==L_begin||(LA140_0>=L_with && LA140_0<=L_if)||(LA140_0>=L_while && LA140_0<=L_for)||LA140_0==L_match||LA140_0==L_exception||LA140_0==L_try||(LA140_0>=A_infinity && LA140_0<=L_lazy)||(LA140_0>=L_true && LA140_0<=L_nil)||LA140_0==L_typeof||LA140_0==MINUS||LA140_0==A_NOT||LA140_0==U_NOT||(LA140_0>=A_ELLIPSIS && LA140_0<=U_ELLIPSIS)||LA140_0==L_force||(LA140_0>=Constr && LA140_0<=Num)||(LA140_0>=String && LA140_0<=ROUND_BRACKET_OPEN)||LA140_0==SQUARE_BRACKET_OPEN||LA140_0==CURLY_BRACKET_OPEN||LA140_0==UNDERSCORE) ) {
                alt140=1;
            }
            else if ( (LA140_0==L_obj) ) {
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:553:4: p_lop_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_p_lop_expr_in_protected_expr3558);
                    p_lop_expr301=p_lop_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_lop_expr301.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:554:4: obj_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_obj_expr_in_protected_expr3563);
                    obj_expr302=obj_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, obj_expr302.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:556:1: protected_expr_nc : protected_expr ;
    public final babel17Parser.protected_expr_nc_return protected_expr_nc() throws RecognitionException {
        babel17Parser.protected_expr_nc_return retval = new babel17Parser.protected_expr_nc_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.protected_expr_return protected_expr303 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:557:2: ( protected_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:557:4: protected_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_protected_expr_in_protected_expr_nc3574);
            protected_expr303=protected_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, protected_expr303.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:559:1: begin_end : L_begin block L_end -> ^( BEGIN block ) ;
    public final babel17Parser.begin_end_return begin_end() throws RecognitionException {
        babel17Parser.begin_end_return retval = new babel17Parser.begin_end_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_begin304=null;
        Token L_end306=null;
        babel17Parser.block_return block305 = null;


        CommonTree L_begin304_tree=null;
        CommonTree L_end306_tree=null;
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleTokenStream stream_L_begin=new RewriteRuleTokenStream(adaptor,"token L_begin");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:560:2: ( L_begin block L_end -> ^( BEGIN block ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:560:4: L_begin block L_end
            {
            L_begin304=(Token)match(input,L_begin,FOLLOW_L_begin_in_begin_end3584); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_begin.add(L_begin304);

            pushFollow(FOLLOW_block_in_begin_end3586);
            block305=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block305.getTree());
            L_end306=(Token)match(input,L_end,FOLLOW_L_end_in_begin_end3588); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_end.add(L_end306);



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
            // 560:24: -> ^( BEGIN block )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:560:27: ^( BEGIN block )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:563:1: parents : ( '+' primitive_expr -> ^( PARENTS_PLUS primitive_expr ) | '*' primitive_expr -> ^( PARENTS_MUL primitive_expr ) );
    public final babel17Parser.parents_return parents() throws RecognitionException {
        babel17Parser.parents_return retval = new babel17Parser.parents_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal307=null;
        Token char_literal309=null;
        babel17Parser.primitive_expr_return primitive_expr308 = null;

        babel17Parser.primitive_expr_return primitive_expr310 = null;


        CommonTree char_literal307_tree=null;
        CommonTree char_literal309_tree=null;
        RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
        RewriteRuleTokenStream stream_TIMES=new RewriteRuleTokenStream(adaptor,"token TIMES");
        RewriteRuleSubtreeStream stream_primitive_expr=new RewriteRuleSubtreeStream(adaptor,"rule primitive_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:563:9: ( '+' primitive_expr -> ^( PARENTS_PLUS primitive_expr ) | '*' primitive_expr -> ^( PARENTS_MUL primitive_expr ) )
            int alt141=2;
            int LA141_0 = input.LA(1);

            if ( (LA141_0==PLUS) ) {
                alt141=1;
            }
            else if ( (LA141_0==TIMES) ) {
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:563:11: '+' primitive_expr
                    {
                    char_literal307=(Token)match(input,PLUS,FOLLOW_PLUS_in_parents3606); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PLUS.add(char_literal307);

                    pushFollow(FOLLOW_primitive_expr_in_parents3608);
                    primitive_expr308=primitive_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primitive_expr.add(primitive_expr308.getTree());


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
                    // 563:30: -> ^( PARENTS_PLUS primitive_expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:563:33: ^( PARENTS_PLUS primitive_expr )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:564:4: '*' primitive_expr
                    {
                    char_literal309=(Token)match(input,TIMES,FOLLOW_TIMES_in_parents3621); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TIMES.add(char_literal309);

                    pushFollow(FOLLOW_primitive_expr_in_parents3623);
                    primitive_expr310=primitive_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primitive_expr.add(primitive_expr310.getTree());


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
                    // 564:23: -> ^( PARENTS_MUL primitive_expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:564:26: ^( PARENTS_MUL primitive_expr )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:567:1: obj_expr : ( ( L_obj ( NL )? parents )=> L_obj ( NL )? parents block L_end -> ^( OBJ block parents ) | L_obj block L_end -> ^( OBJ block ) );
    public final babel17Parser.obj_expr_return obj_expr() throws RecognitionException {
        babel17Parser.obj_expr_return retval = new babel17Parser.obj_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_obj311=null;
        Token NL312=null;
        Token L_end315=null;
        Token L_obj316=null;
        Token L_end318=null;
        babel17Parser.parents_return parents313 = null;

        babel17Parser.block_return block314 = null;

        babel17Parser.block_return block317 = null;


        CommonTree L_obj311_tree=null;
        CommonTree NL312_tree=null;
        CommonTree L_end315_tree=null;
        CommonTree L_obj316_tree=null;
        CommonTree L_end318_tree=null;
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_obj=new RewriteRuleTokenStream(adaptor,"token L_obj");
        RewriteRuleSubtreeStream stream_parents=new RewriteRuleSubtreeStream(adaptor,"rule parents");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:567:9: ( ( L_obj ( NL )? parents )=> L_obj ( NL )? parents block L_end -> ^( OBJ block parents ) | L_obj block L_end -> ^( OBJ block ) )
            int alt143=2;
            int LA143_0 = input.LA(1);

            if ( (LA143_0==L_obj) ) {
                int LA143_1 = input.LA(2);

                if ( (LA143_1==NL) ) {
                    int LA143_2 = input.LA(3);

                    if ( ((LA143_2>=L_begin && LA143_2<=L_if)||(LA143_2>=L_while && LA143_2<=L_for)||(LA143_2>=L_yield && LA143_2<=L_match)||(LA143_2>=L_val && LA143_2<=L_def)||LA143_2==L_exception||LA143_2==L_try||(LA143_2>=A_infinity && LA143_2<=L_nil)||(LA143_2>=L_module && LA143_2<=L_import)||LA143_2==SC||LA143_2==MINUS||LA143_2==A_NOT||LA143_2==U_NOT||(LA143_2>=A_ELLIPSIS && LA143_2<=U_ELLIPSIS)||LA143_2==L_force||(LA143_2>=NL && LA143_2<=Num)||(LA143_2>=String && LA143_2<=ROUND_BRACKET_OPEN)||LA143_2==SQUARE_BRACKET_OPEN||LA143_2==CURLY_BRACKET_OPEN||LA143_2==UNDERSCORE||(LA143_2>=PRAGMA_LOG && LA143_2<=PRAGMA_PROFILE)) ) {
                        alt143=2;
                    }
                    else if ( (LA143_2==PLUS) && (synpred8_babel17())) {
                        alt143=1;
                    }
                    else if ( (LA143_2==TIMES) && (synpred8_babel17())) {
                        alt143=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 143, 2, input);

                        throw nvae;
                    }
                }
                else if ( ((LA143_1>=L_begin && LA143_1<=L_if)||(LA143_1>=L_while && LA143_1<=L_for)||(LA143_1>=L_yield && LA143_1<=L_match)||(LA143_1>=L_val && LA143_1<=L_def)||LA143_1==L_exception||LA143_1==L_try||(LA143_1>=A_infinity && LA143_1<=L_nil)||(LA143_1>=L_module && LA143_1<=L_import)||LA143_1==SC||LA143_1==MINUS||LA143_1==A_NOT||LA143_1==U_NOT||(LA143_1>=A_ELLIPSIS && LA143_1<=U_ELLIPSIS)||LA143_1==L_force||(LA143_1>=Constr && LA143_1<=Num)||(LA143_1>=String && LA143_1<=ROUND_BRACKET_OPEN)||LA143_1==SQUARE_BRACKET_OPEN||LA143_1==CURLY_BRACKET_OPEN||LA143_1==UNDERSCORE||(LA143_1>=PRAGMA_LOG && LA143_1<=PRAGMA_PROFILE)) ) {
                    alt143=2;
                }
                else if ( (LA143_1==PLUS) && (synpred8_babel17())) {
                    alt143=1;
                }
                else if ( (LA143_1==TIMES) && (synpred8_babel17())) {
                    alt143=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 143, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 143, 0, input);

                throw nvae;
            }
            switch (alt143) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:567:11: ( L_obj ( NL )? parents )=> L_obj ( NL )? parents block L_end
                    {
                    L_obj311=(Token)match(input,L_obj,FOLLOW_L_obj_in_obj_expr3651); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_obj.add(L_obj311);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:567:40: ( NL )?
                    int alt142=2;
                    int LA142_0 = input.LA(1);

                    if ( (LA142_0==NL) ) {
                        alt142=1;
                    }
                    switch (alt142) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:567:40: NL
                            {
                            NL312=(Token)match(input,NL,FOLLOW_NL_in_obj_expr3653); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL312);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_parents_in_obj_expr3656);
                    parents313=parents();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parents.add(parents313.getTree());
                    pushFollow(FOLLOW_block_in_obj_expr3658);
                    block314=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block314.getTree());
                    L_end315=(Token)match(input,L_end,FOLLOW_L_end_in_obj_expr3660); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_end.add(L_end315);



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
                    // 567:64: -> ^( OBJ block parents )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:567:67: ^( OBJ block parents )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:568:17: L_obj block L_end
                    {
                    L_obj316=(Token)match(input,L_obj,FOLLOW_L_obj_in_obj_expr3688); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_obj.add(L_obj316);

                    pushFollow(FOLLOW_block_in_obj_expr3690);
                    block317=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block317.getTree());
                    L_end318=(Token)match(input,L_end,FOLLOW_L_end_in_obj_expr3692); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_end.add(L_end318);



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
                    // 568:35: -> ^( OBJ block )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:568:38: ^( OBJ block )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:570:1: lop_expr : ( ( lambda_expr )=> lambda_expr | ( lambda_expr_nobrackets )=> lambda_expr_nobrackets | op_expr );
    public final babel17Parser.lop_expr_return lop_expr() throws RecognitionException {
        babel17Parser.lop_expr_return retval = new babel17Parser.lop_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.lambda_expr_return lambda_expr319 = null;

        babel17Parser.lambda_expr_nobrackets_return lambda_expr_nobrackets320 = null;

        babel17Parser.op_expr_return op_expr321 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:571:2: ( ( lambda_expr )=> lambda_expr | ( lambda_expr_nobrackets )=> lambda_expr_nobrackets | op_expr )
            int alt144=3;
            alt144 = dfa144.predict(input);
            switch (alt144) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:571:4: ( lambda_expr )=> lambda_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_lambda_expr_in_lop_expr3720);
                    lambda_expr319=lambda_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lambda_expr319.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:572:4: ( lambda_expr_nobrackets )=> lambda_expr_nobrackets
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_lambda_expr_nobrackets_in_lop_expr3731);
                    lambda_expr_nobrackets320=lambda_expr_nobrackets();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lambda_expr_nobrackets320.getTree());

                    }
                    break;
                case 3 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:573:4: op_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_op_expr_in_lop_expr3736);
                    op_expr321=op_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, op_expr321.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:575:1: p_lop_expr : ( ( lambda_expr )=> lambda_expr | ( lambda_expr_nobrackets )=> lambda_expr_nobrackets | p_op_expr );
    public final babel17Parser.p_lop_expr_return p_lop_expr() throws RecognitionException {
        babel17Parser.p_lop_expr_return retval = new babel17Parser.p_lop_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.lambda_expr_return lambda_expr322 = null;

        babel17Parser.lambda_expr_nobrackets_return lambda_expr_nobrackets323 = null;

        babel17Parser.p_op_expr_return p_op_expr324 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:576:2: ( ( lambda_expr )=> lambda_expr | ( lambda_expr_nobrackets )=> lambda_expr_nobrackets | p_op_expr )
            int alt145=3;
            alt145 = dfa145.predict(input);
            switch (alt145) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:576:4: ( lambda_expr )=> lambda_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_lambda_expr_in_p_lop_expr3752);
                    lambda_expr322=lambda_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lambda_expr322.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:577:4: ( lambda_expr_nobrackets )=> lambda_expr_nobrackets
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_lambda_expr_nobrackets_in_p_lop_expr3763);
                    lambda_expr_nobrackets323=lambda_expr_nobrackets();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lambda_expr_nobrackets323.getTree());

                    }
                    break;
                case 3 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:578:4: p_op_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_p_op_expr_in_p_lop_expr3768);
                    p_op_expr324=p_op_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_op_expr324.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:580:1: if_expr : L_if ( NL )? protected_expr ( NL )? L_then block ( L_elseif ( NL )? protected_expr ( NL )? L_then block )* ( L_else block )? L_end -> ^( IF ( protected_expr )* ( block )* ) ;
    public final babel17Parser.if_expr_return if_expr() throws RecognitionException {
        babel17Parser.if_expr_return retval = new babel17Parser.if_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_if325=null;
        Token NL326=null;
        Token NL328=null;
        Token L_then329=null;
        Token L_elseif331=null;
        Token NL332=null;
        Token NL334=null;
        Token L_then335=null;
        Token L_else337=null;
        Token L_end339=null;
        babel17Parser.protected_expr_return protected_expr327 = null;

        babel17Parser.block_return block330 = null;

        babel17Parser.protected_expr_return protected_expr333 = null;

        babel17Parser.block_return block336 = null;

        babel17Parser.block_return block338 = null;


        CommonTree L_if325_tree=null;
        CommonTree NL326_tree=null;
        CommonTree NL328_tree=null;
        CommonTree L_then329_tree=null;
        CommonTree L_elseif331_tree=null;
        CommonTree NL332_tree=null;
        CommonTree NL334_tree=null;
        CommonTree L_then335_tree=null;
        CommonTree L_else337_tree=null;
        CommonTree L_end339_tree=null;
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleTokenStream stream_L_else=new RewriteRuleTokenStream(adaptor,"token L_else");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_elseif=new RewriteRuleTokenStream(adaptor,"token L_elseif");
        RewriteRuleTokenStream stream_L_then=new RewriteRuleTokenStream(adaptor,"token L_then");
        RewriteRuleTokenStream stream_L_if=new RewriteRuleTokenStream(adaptor,"token L_if");
        RewriteRuleSubtreeStream stream_protected_expr=new RewriteRuleSubtreeStream(adaptor,"rule protected_expr");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:580:9: ( L_if ( NL )? protected_expr ( NL )? L_then block ( L_elseif ( NL )? protected_expr ( NL )? L_then block )* ( L_else block )? L_end -> ^( IF ( protected_expr )* ( block )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:580:11: L_if ( NL )? protected_expr ( NL )? L_then block ( L_elseif ( NL )? protected_expr ( NL )? L_then block )* ( L_else block )? L_end
            {
            L_if325=(Token)match(input,L_if,FOLLOW_L_if_in_if_expr3778); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_if.add(L_if325);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:580:16: ( NL )?
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==NL) ) {
                alt146=1;
            }
            switch (alt146) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:580:16: NL
                    {
                    NL326=(Token)match(input,NL,FOLLOW_NL_in_if_expr3780); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL326);


                    }
                    break;

            }

            pushFollow(FOLLOW_protected_expr_in_if_expr3783);
            protected_expr327=protected_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr327.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:580:35: ( NL )?
            int alt147=2;
            int LA147_0 = input.LA(1);

            if ( (LA147_0==NL) ) {
                alt147=1;
            }
            switch (alt147) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:580:35: NL
                    {
                    NL328=(Token)match(input,NL,FOLLOW_NL_in_if_expr3785); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL328);


                    }
                    break;

            }

            L_then329=(Token)match(input,L_then,FOLLOW_L_then_in_if_expr3788); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_then.add(L_then329);

            pushFollow(FOLLOW_block_in_if_expr3790);
            block330=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block330.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:581:3: ( L_elseif ( NL )? protected_expr ( NL )? L_then block )*
            loop150:
            do {
                int alt150=2;
                int LA150_0 = input.LA(1);

                if ( (LA150_0==L_elseif) ) {
                    alt150=1;
                }


                switch (alt150) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:581:4: L_elseif ( NL )? protected_expr ( NL )? L_then block
            	    {
            	    L_elseif331=(Token)match(input,L_elseif,FOLLOW_L_elseif_in_if_expr3796); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_L_elseif.add(L_elseif331);

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:581:13: ( NL )?
            	    int alt148=2;
            	    int LA148_0 = input.LA(1);

            	    if ( (LA148_0==NL) ) {
            	        alt148=1;
            	    }
            	    switch (alt148) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:581:13: NL
            	            {
            	            NL332=(Token)match(input,NL,FOLLOW_NL_in_if_expr3798); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL332);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_protected_expr_in_if_expr3801);
            	    protected_expr333=protected_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr333.getTree());
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:581:32: ( NL )?
            	    int alt149=2;
            	    int LA149_0 = input.LA(1);

            	    if ( (LA149_0==NL) ) {
            	        alt149=1;
            	    }
            	    switch (alt149) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:581:32: NL
            	            {
            	            NL334=(Token)match(input,NL,FOLLOW_NL_in_if_expr3803); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL334);


            	            }
            	            break;

            	    }

            	    L_then335=(Token)match(input,L_then,FOLLOW_L_then_in_if_expr3806); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_L_then.add(L_then335);

            	    pushFollow(FOLLOW_block_in_if_expr3808);
            	    block336=block();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_block.add(block336.getTree());

            	    }
            	    break;

            	default :
            	    break loop150;
                }
            } while (true);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:582:3: ( L_else block )?
            int alt151=2;
            int LA151_0 = input.LA(1);

            if ( (LA151_0==L_else) ) {
                alt151=1;
            }
            switch (alt151) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:582:4: L_else block
                    {
                    L_else337=(Token)match(input,L_else,FOLLOW_L_else_in_if_expr3816); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_else.add(L_else337);

                    pushFollow(FOLLOW_block_in_if_expr3818);
                    block338=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block338.getTree());

                    }
                    break;

            }

            L_end339=(Token)match(input,L_end,FOLLOW_L_end_in_if_expr3822); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_end.add(L_end339);



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
            // 582:26: -> ^( IF ( protected_expr )* ( block )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:582:29: ^( IF ( protected_expr )* ( block )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IF, "IF"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:582:34: ( protected_expr )*
                while ( stream_protected_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_protected_expr.nextTree());

                }
                stream_protected_expr.reset();
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:582:50: ( block )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:584:1: while_do_expr : L_while ( NL )? protected_expr ( NL )? L_do block L_end -> ^( WHILE_DO protected_expr block ) ;
    public final babel17Parser.while_do_expr_return while_do_expr() throws RecognitionException {
        babel17Parser.while_do_expr_return retval = new babel17Parser.while_do_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_while340=null;
        Token NL341=null;
        Token NL343=null;
        Token L_do344=null;
        Token L_end346=null;
        babel17Parser.protected_expr_return protected_expr342 = null;

        babel17Parser.block_return block345 = null;


        CommonTree L_while340_tree=null;
        CommonTree NL341_tree=null;
        CommonTree NL343_tree=null;
        CommonTree L_do344_tree=null;
        CommonTree L_end346_tree=null;
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_do=new RewriteRuleTokenStream(adaptor,"token L_do");
        RewriteRuleTokenStream stream_L_while=new RewriteRuleTokenStream(adaptor,"token L_while");
        RewriteRuleSubtreeStream stream_protected_expr=new RewriteRuleSubtreeStream(adaptor,"rule protected_expr");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:585:2: ( L_while ( NL )? protected_expr ( NL )? L_do block L_end -> ^( WHILE_DO protected_expr block ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:585:4: L_while ( NL )? protected_expr ( NL )? L_do block L_end
            {
            L_while340=(Token)match(input,L_while,FOLLOW_L_while_in_while_do_expr3846); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_while.add(L_while340);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:585:12: ( NL )?
            int alt152=2;
            int LA152_0 = input.LA(1);

            if ( (LA152_0==NL) ) {
                alt152=1;
            }
            switch (alt152) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:585:12: NL
                    {
                    NL341=(Token)match(input,NL,FOLLOW_NL_in_while_do_expr3848); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL341);


                    }
                    break;

            }

            pushFollow(FOLLOW_protected_expr_in_while_do_expr3851);
            protected_expr342=protected_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr342.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:585:31: ( NL )?
            int alt153=2;
            int LA153_0 = input.LA(1);

            if ( (LA153_0==NL) ) {
                alt153=1;
            }
            switch (alt153) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:585:31: NL
                    {
                    NL343=(Token)match(input,NL,FOLLOW_NL_in_while_do_expr3853); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL343);


                    }
                    break;

            }

            L_do344=(Token)match(input,L_do,FOLLOW_L_do_in_while_do_expr3856); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_do.add(L_do344);

            pushFollow(FOLLOW_block_in_while_do_expr3858);
            block345=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block345.getTree());
            L_end346=(Token)match(input,L_end,FOLLOW_L_end_in_while_do_expr3860); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_end.add(L_end346);



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
            // 586:5: -> ^( WHILE_DO protected_expr block )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:586:8: ^( WHILE_DO protected_expr block )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:588:1: cases : ( full_cases | pattern ( NL )? token_DOUBLE_ARROW block -> ^( CASES ^( NIL_TOKEN pattern block ) ) );
    public final babel17Parser.cases_return cases() throws RecognitionException {
        babel17Parser.cases_return retval = new babel17Parser.cases_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL349=null;
        babel17Parser.full_cases_return full_cases347 = null;

        babel17Parser.pattern_return pattern348 = null;

        babel17Parser.token_DOUBLE_ARROW_return token_DOUBLE_ARROW350 = null;

        babel17Parser.block_return block351 = null;


        CommonTree NL349_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_token_DOUBLE_ARROW=new RewriteRuleSubtreeStream(adaptor,"rule token_DOUBLE_ARROW");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:589:2: ( full_cases | pattern ( NL )? token_DOUBLE_ARROW block -> ^( CASES ^( NIL_TOKEN pattern block ) ) )
            int alt155=2;
            int LA155_0 = input.LA(1);

            if ( (LA155_0==L_case) ) {
                alt155=1;
            }
            else if ( (LA155_0==L_exception||(LA155_0>=A_infinity && LA155_0<=U_infinity)||(LA155_0>=L_true && LA155_0<=L_false)||LA155_0==L_nil||LA155_0==MINUS||(LA155_0>=A_ELLIPSIS && LA155_0<=U_ELLIPSIS)||(LA155_0>=Constr && LA155_0<=Num)||(LA155_0>=String && LA155_0<=ROUND_BRACKET_OPEN)||LA155_0==SQUARE_BRACKET_OPEN||LA155_0==CURLY_BRACKET_OPEN||LA155_0==UNDERSCORE) ) {
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:589:4: full_cases
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_full_cases_in_cases3890);
                    full_cases347=full_cases();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, full_cases347.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:590:4: pattern ( NL )? token_DOUBLE_ARROW block
                    {
                    pushFollow(FOLLOW_pattern_in_cases3895);
                    pattern348=pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pattern.add(pattern348.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:590:12: ( NL )?
                    int alt154=2;
                    int LA154_0 = input.LA(1);

                    if ( (LA154_0==NL) ) {
                        alt154=1;
                    }
                    switch (alt154) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:590:12: NL
                            {
                            NL349=(Token)match(input,NL,FOLLOW_NL_in_cases3897); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL349);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_token_DOUBLE_ARROW_in_cases3900);
                    token_DOUBLE_ARROW350=token_DOUBLE_ARROW();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_token_DOUBLE_ARROW.add(token_DOUBLE_ARROW350.getTree());
                    pushFollow(FOLLOW_block_in_cases3902);
                    block351=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block351.getTree());


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
                    // 590:41: -> ^( CASES ^( NIL_TOKEN pattern block ) )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:590:44: ^( CASES ^( NIL_TOKEN pattern block ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CASES, "CASES"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:590:52: ^( NIL_TOKEN pattern block )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:592:1: full_cases : ( case_expr )+ -> ^( CASES ( case_expr )+ ) ;
    public final babel17Parser.full_cases_return full_cases() throws RecognitionException {
        babel17Parser.full_cases_return retval = new babel17Parser.full_cases_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.case_expr_return case_expr352 = null;


        RewriteRuleSubtreeStream stream_case_expr=new RewriteRuleSubtreeStream(adaptor,"rule case_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:593:2: ( ( case_expr )+ -> ^( CASES ( case_expr )+ ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:593:4: ( case_expr )+
            {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:593:4: ( case_expr )+
            int cnt156=0;
            loop156:
            do {
                int alt156=2;
                int LA156_0 = input.LA(1);

                if ( (LA156_0==L_case) ) {
                    alt156=1;
                }


                switch (alt156) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:593:4: case_expr
            	    {
            	    pushFollow(FOLLOW_case_expr_in_full_cases3925);
            	    case_expr352=case_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_case_expr.add(case_expr352.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt156 >= 1 ) break loop156;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(156, input);
                        throw eee;
                }
                cnt156++;
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
            // 593:15: -> ^( CASES ( case_expr )+ )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:593:18: ^( CASES ( case_expr )+ )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:595:1: case_expr : ( L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW block ) -> ^( NIL_TOKEN pattern block ) ;
    public final babel17Parser.case_expr_return case_expr() throws RecognitionException {
        babel17Parser.case_expr_return retval = new babel17Parser.case_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_case353=null;
        Token NL354=null;
        Token NL356=null;
        babel17Parser.pattern_return pattern355 = null;

        babel17Parser.token_DOUBLE_ARROW_return token_DOUBLE_ARROW357 = null;

        babel17Parser.block_return block358 = null;


        CommonTree L_case353_tree=null;
        CommonTree NL354_tree=null;
        CommonTree NL356_tree=null;
        RewriteRuleTokenStream stream_L_case=new RewriteRuleTokenStream(adaptor,"token L_case");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_token_DOUBLE_ARROW=new RewriteRuleSubtreeStream(adaptor,"rule token_DOUBLE_ARROW");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:596:2: ( ( L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW block ) -> ^( NIL_TOKEN pattern block ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:596:4: ( L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW block )
            {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:596:4: ( L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW block )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:596:5: L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW block
            {
            L_case353=(Token)match(input,L_case,FOLLOW_L_case_in_case_expr3946); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_case.add(L_case353);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:596:12: ( NL )?
            int alt157=2;
            int LA157_0 = input.LA(1);

            if ( (LA157_0==NL) ) {
                alt157=1;
            }
            switch (alt157) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:596:12: NL
                    {
                    NL354=(Token)match(input,NL,FOLLOW_NL_in_case_expr3948); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL354);


                    }
                    break;

            }

            pushFollow(FOLLOW_pattern_in_case_expr3951);
            pattern355=pattern();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pattern.add(pattern355.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:596:24: ( NL )?
            int alt158=2;
            int LA158_0 = input.LA(1);

            if ( (LA158_0==NL) ) {
                alt158=1;
            }
            switch (alt158) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:596:24: NL
                    {
                    NL356=(Token)match(input,NL,FOLLOW_NL_in_case_expr3953); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL356);


                    }
                    break;

            }

            pushFollow(FOLLOW_token_DOUBLE_ARROW_in_case_expr3956);
            token_DOUBLE_ARROW357=token_DOUBLE_ARROW();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_token_DOUBLE_ARROW.add(token_DOUBLE_ARROW357.getTree());
            pushFollow(FOLLOW_block_in_case_expr3958);
            block358=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block358.getTree());

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
            // 596:54: -> ^( NIL_TOKEN pattern block )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:596:57: ^( NIL_TOKEN pattern block )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:598:1: match_expr : L_match ( NL )? p_op_expr ( NL )? full_cases L_end -> ^( MATCH p_op_expr full_cases ) ;
    public final babel17Parser.match_expr_return match_expr() throws RecognitionException {
        babel17Parser.match_expr_return retval = new babel17Parser.match_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_match359=null;
        Token NL360=null;
        Token NL362=null;
        Token L_end364=null;
        babel17Parser.p_op_expr_return p_op_expr361 = null;

        babel17Parser.full_cases_return full_cases363 = null;


        CommonTree L_match359_tree=null;
        CommonTree NL360_tree=null;
        CommonTree NL362_tree=null;
        CommonTree L_end364_tree=null;
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_match=new RewriteRuleTokenStream(adaptor,"token L_match");
        RewriteRuleSubtreeStream stream_full_cases=new RewriteRuleSubtreeStream(adaptor,"rule full_cases");
        RewriteRuleSubtreeStream stream_p_op_expr=new RewriteRuleSubtreeStream(adaptor,"rule p_op_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:599:2: ( L_match ( NL )? p_op_expr ( NL )? full_cases L_end -> ^( MATCH p_op_expr full_cases ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:599:4: L_match ( NL )? p_op_expr ( NL )? full_cases L_end
            {
            L_match359=(Token)match(input,L_match,FOLLOW_L_match_in_match_expr3979); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_match.add(L_match359);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:599:12: ( NL )?
            int alt159=2;
            int LA159_0 = input.LA(1);

            if ( (LA159_0==NL) ) {
                alt159=1;
            }
            switch (alt159) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:599:12: NL
                    {
                    NL360=(Token)match(input,NL,FOLLOW_NL_in_match_expr3981); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL360);


                    }
                    break;

            }

            pushFollow(FOLLOW_p_op_expr_in_match_expr3984);
            p_op_expr361=p_op_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_p_op_expr.add(p_op_expr361.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:599:26: ( NL )?
            int alt160=2;
            int LA160_0 = input.LA(1);

            if ( (LA160_0==NL) ) {
                alt160=1;
            }
            switch (alt160) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:599:26: NL
                    {
                    NL362=(Token)match(input,NL,FOLLOW_NL_in_match_expr3986); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL362);


                    }
                    break;

            }

            pushFollow(FOLLOW_full_cases_in_match_expr3989);
            full_cases363=full_cases();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_full_cases.add(full_cases363.getTree());
            L_end364=(Token)match(input,L_end,FOLLOW_L_end_in_match_expr3991); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_end.add(L_end364);



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
            // 600:5: -> ^( MATCH p_op_expr full_cases )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:600:8: ^( MATCH p_op_expr full_cases )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:602:1: try_expr : L_try ( NL )? pure_block ( NL )? L_catch ( NL )? full_cases L_end -> ^( TRY pure_block full_cases ) ;
    public final babel17Parser.try_expr_return try_expr() throws RecognitionException {
        babel17Parser.try_expr_return retval = new babel17Parser.try_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_try365=null;
        Token NL366=null;
        Token NL368=null;
        Token L_catch369=null;
        Token NL370=null;
        Token L_end372=null;
        babel17Parser.pure_block_return pure_block367 = null;

        babel17Parser.full_cases_return full_cases371 = null;


        CommonTree L_try365_tree=null;
        CommonTree NL366_tree=null;
        CommonTree NL368_tree=null;
        CommonTree L_catch369_tree=null;
        CommonTree NL370_tree=null;
        CommonTree L_end372_tree=null;
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleTokenStream stream_L_try=new RewriteRuleTokenStream(adaptor,"token L_try");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_catch=new RewriteRuleTokenStream(adaptor,"token L_catch");
        RewriteRuleSubtreeStream stream_full_cases=new RewriteRuleSubtreeStream(adaptor,"rule full_cases");
        RewriteRuleSubtreeStream stream_pure_block=new RewriteRuleSubtreeStream(adaptor,"rule pure_block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:602:9: ( L_try ( NL )? pure_block ( NL )? L_catch ( NL )? full_cases L_end -> ^( TRY pure_block full_cases ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:602:11: L_try ( NL )? pure_block ( NL )? L_catch ( NL )? full_cases L_end
            {
            L_try365=(Token)match(input,L_try,FOLLOW_L_try_in_try_expr4017); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_try.add(L_try365);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:602:17: ( NL )?
            int alt161=2;
            int LA161_0 = input.LA(1);

            if ( (LA161_0==NL) ) {
                alt161=1;
            }
            switch (alt161) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:602:17: NL
                    {
                    NL366=(Token)match(input,NL,FOLLOW_NL_in_try_expr4019); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL366);


                    }
                    break;

            }

            pushFollow(FOLLOW_pure_block_in_try_expr4022);
            pure_block367=pure_block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pure_block.add(pure_block367.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:602:32: ( NL )?
            int alt162=2;
            int LA162_0 = input.LA(1);

            if ( (LA162_0==NL) ) {
                alt162=1;
            }
            switch (alt162) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:602:32: NL
                    {
                    NL368=(Token)match(input,NL,FOLLOW_NL_in_try_expr4024); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL368);


                    }
                    break;

            }

            L_catch369=(Token)match(input,L_catch,FOLLOW_L_catch_in_try_expr4027); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_catch.add(L_catch369);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:602:44: ( NL )?
            int alt163=2;
            int LA163_0 = input.LA(1);

            if ( (LA163_0==NL) ) {
                alt163=1;
            }
            switch (alt163) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:602:44: NL
                    {
                    NL370=(Token)match(input,NL,FOLLOW_NL_in_try_expr4029); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL370);


                    }
                    break;

            }

            pushFollow(FOLLOW_full_cases_in_try_expr4032);
            full_cases371=full_cases();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_full_cases.add(full_cases371.getTree());
            L_end372=(Token)match(input,L_end,FOLLOW_L_end_in_try_expr4034); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_end.add(L_end372);



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
            // 603:5: -> ^( TRY pure_block full_cases )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:603:8: ^( TRY pure_block full_cases )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:605:1: lambda_expr : '(' ( NL )? lambda_cases ( NL )? ')' -> ^( LAMBDA lambda_cases ) ;
    public final babel17Parser.lambda_expr_return lambda_expr() throws RecognitionException {
        babel17Parser.lambda_expr_return retval = new babel17Parser.lambda_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal373=null;
        Token NL374=null;
        Token NL376=null;
        Token char_literal377=null;
        babel17Parser.lambda_cases_return lambda_cases375 = null;


        CommonTree char_literal373_tree=null;
        CommonTree NL374_tree=null;
        CommonTree NL376_tree=null;
        CommonTree char_literal377_tree=null;
        RewriteRuleTokenStream stream_ROUND_BRACKET_OPEN=new RewriteRuleTokenStream(adaptor,"token ROUND_BRACKET_OPEN");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_ROUND_BRACKET_CLOSE=new RewriteRuleTokenStream(adaptor,"token ROUND_BRACKET_CLOSE");
        RewriteRuleSubtreeStream stream_lambda_cases=new RewriteRuleSubtreeStream(adaptor,"rule lambda_cases");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:606:2: ( '(' ( NL )? lambda_cases ( NL )? ')' -> ^( LAMBDA lambda_cases ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:606:4: '(' ( NL )? lambda_cases ( NL )? ')'
            {
            char_literal373=(Token)match(input,ROUND_BRACKET_OPEN,FOLLOW_ROUND_BRACKET_OPEN_in_lambda_expr4058); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ROUND_BRACKET_OPEN.add(char_literal373);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:606:8: ( NL )?
            int alt164=2;
            int LA164_0 = input.LA(1);

            if ( (LA164_0==NL) ) {
                alt164=1;
            }
            switch (alt164) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:606:8: NL
                    {
                    NL374=(Token)match(input,NL,FOLLOW_NL_in_lambda_expr4060); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL374);


                    }
                    break;

            }

            pushFollow(FOLLOW_lambda_cases_in_lambda_expr4063);
            lambda_cases375=lambda_cases();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_lambda_cases.add(lambda_cases375.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:606:25: ( NL )?
            int alt165=2;
            int LA165_0 = input.LA(1);

            if ( (LA165_0==NL) ) {
                alt165=1;
            }
            switch (alt165) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:606:25: NL
                    {
                    NL376=(Token)match(input,NL,FOLLOW_NL_in_lambda_expr4065); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL376);


                    }
                    break;

            }

            char_literal377=(Token)match(input,ROUND_BRACKET_CLOSE,FOLLOW_ROUND_BRACKET_CLOSE_in_lambda_expr4068); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ROUND_BRACKET_CLOSE.add(char_literal377);



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
            // 606:33: -> ^( LAMBDA lambda_cases )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:606:36: ^( LAMBDA lambda_cases )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:608:1: lambda_expr_nobrackets : lambda_cases_nobrackets -> ^( LAMBDA lambda_cases_nobrackets ) ;
    public final babel17Parser.lambda_expr_nobrackets_return lambda_expr_nobrackets() throws RecognitionException {
        babel17Parser.lambda_expr_nobrackets_return retval = new babel17Parser.lambda_expr_nobrackets_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.lambda_cases_nobrackets_return lambda_cases_nobrackets378 = null;


        RewriteRuleSubtreeStream stream_lambda_cases_nobrackets=new RewriteRuleSubtreeStream(adaptor,"rule lambda_cases_nobrackets");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:609:2: ( lambda_cases_nobrackets -> ^( LAMBDA lambda_cases_nobrackets ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:609:4: lambda_cases_nobrackets
            {
            pushFollow(FOLLOW_lambda_cases_nobrackets_in_lambda_expr_nobrackets4087);
            lambda_cases_nobrackets378=lambda_cases_nobrackets();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_lambda_cases_nobrackets.add(lambda_cases_nobrackets378.getTree());


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
            // 609:28: -> ^( LAMBDA lambda_cases_nobrackets )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:609:31: ^( LAMBDA lambda_cases_nobrackets )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:611:1: lambda_cases_nobrackets : pattern ( NL )? token_DOUBLE_ARROW ( NL )? lop_expr -> ^( CASES ^( NIL_TOKEN pattern ^( BLOCK lop_expr ) ) ) ;
    public final babel17Parser.lambda_cases_nobrackets_return lambda_cases_nobrackets() throws RecognitionException {
        babel17Parser.lambda_cases_nobrackets_return retval = new babel17Parser.lambda_cases_nobrackets_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL380=null;
        Token NL382=null;
        babel17Parser.pattern_return pattern379 = null;

        babel17Parser.token_DOUBLE_ARROW_return token_DOUBLE_ARROW381 = null;

        babel17Parser.lop_expr_return lop_expr383 = null;


        CommonTree NL380_tree=null;
        CommonTree NL382_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_token_DOUBLE_ARROW=new RewriteRuleSubtreeStream(adaptor,"rule token_DOUBLE_ARROW");
        RewriteRuleSubtreeStream stream_lop_expr=new RewriteRuleSubtreeStream(adaptor,"rule lop_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:612:2: ( pattern ( NL )? token_DOUBLE_ARROW ( NL )? lop_expr -> ^( CASES ^( NIL_TOKEN pattern ^( BLOCK lop_expr ) ) ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:612:4: pattern ( NL )? token_DOUBLE_ARROW ( NL )? lop_expr
            {
            pushFollow(FOLLOW_pattern_in_lambda_cases_nobrackets4105);
            pattern379=pattern();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pattern.add(pattern379.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:612:12: ( NL )?
            int alt166=2;
            int LA166_0 = input.LA(1);

            if ( (LA166_0==NL) ) {
                alt166=1;
            }
            switch (alt166) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:612:12: NL
                    {
                    NL380=(Token)match(input,NL,FOLLOW_NL_in_lambda_cases_nobrackets4107); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL380);


                    }
                    break;

            }

            pushFollow(FOLLOW_token_DOUBLE_ARROW_in_lambda_cases_nobrackets4110);
            token_DOUBLE_ARROW381=token_DOUBLE_ARROW();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_token_DOUBLE_ARROW.add(token_DOUBLE_ARROW381.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:612:35: ( NL )?
            int alt167=2;
            int LA167_0 = input.LA(1);

            if ( (LA167_0==NL) ) {
                alt167=1;
            }
            switch (alt167) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:612:35: NL
                    {
                    NL382=(Token)match(input,NL,FOLLOW_NL_in_lambda_cases_nobrackets4112); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL382);


                    }
                    break;

            }

            pushFollow(FOLLOW_lop_expr_in_lambda_cases_nobrackets4115);
            lop_expr383=lop_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_lop_expr.add(lop_expr383.getTree());


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
            // 612:48: -> ^( CASES ^( NIL_TOKEN pattern ^( BLOCK lop_expr ) ) )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:612:51: ^( CASES ^( NIL_TOKEN pattern ^( BLOCK lop_expr ) ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CASES, "CASES"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:612:59: ^( NIL_TOKEN pattern ^( BLOCK lop_expr ) )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_2);

                adaptor.addChild(root_2, stream_pattern.nextTree());
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:612:79: ^( BLOCK lop_expr )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:614:1: lambda_case_expr : ( L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block ) -> ^( NIL_TOKEN pattern pure_block ) ;
    public final babel17Parser.lambda_case_expr_return lambda_case_expr() throws RecognitionException {
        babel17Parser.lambda_case_expr_return retval = new babel17Parser.lambda_case_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_case384=null;
        Token NL385=null;
        Token NL387=null;
        Token NL389=null;
        babel17Parser.pattern_return pattern386 = null;

        babel17Parser.token_DOUBLE_ARROW_return token_DOUBLE_ARROW388 = null;

        babel17Parser.pure_block_return pure_block390 = null;


        CommonTree L_case384_tree=null;
        CommonTree NL385_tree=null;
        CommonTree NL387_tree=null;
        CommonTree NL389_tree=null;
        RewriteRuleTokenStream stream_L_case=new RewriteRuleTokenStream(adaptor,"token L_case");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_token_DOUBLE_ARROW=new RewriteRuleSubtreeStream(adaptor,"rule token_DOUBLE_ARROW");
        RewriteRuleSubtreeStream stream_pure_block=new RewriteRuleSubtreeStream(adaptor,"rule pure_block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:615:2: ( ( L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block ) -> ^( NIL_TOKEN pattern pure_block ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:615:4: ( L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block )
            {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:615:4: ( L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:615:5: L_case ( NL )? pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block
            {
            L_case384=(Token)match(input,L_case,FOLLOW_L_case_in_lambda_case_expr4143); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_case.add(L_case384);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:615:12: ( NL )?
            int alt168=2;
            int LA168_0 = input.LA(1);

            if ( (LA168_0==NL) ) {
                alt168=1;
            }
            switch (alt168) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:615:12: NL
                    {
                    NL385=(Token)match(input,NL,FOLLOW_NL_in_lambda_case_expr4145); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL385);


                    }
                    break;

            }

            pushFollow(FOLLOW_pattern_in_lambda_case_expr4148);
            pattern386=pattern();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pattern.add(pattern386.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:615:24: ( NL )?
            int alt169=2;
            int LA169_0 = input.LA(1);

            if ( (LA169_0==NL) ) {
                alt169=1;
            }
            switch (alt169) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:615:24: NL
                    {
                    NL387=(Token)match(input,NL,FOLLOW_NL_in_lambda_case_expr4150); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL387);


                    }
                    break;

            }

            pushFollow(FOLLOW_token_DOUBLE_ARROW_in_lambda_case_expr4153);
            token_DOUBLE_ARROW388=token_DOUBLE_ARROW();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_token_DOUBLE_ARROW.add(token_DOUBLE_ARROW388.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:615:47: ( NL )?
            int alt170=2;
            int LA170_0 = input.LA(1);

            if ( (LA170_0==NL) ) {
                alt170=1;
            }
            switch (alt170) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:615:47: NL
                    {
                    NL389=(Token)match(input,NL,FOLLOW_NL_in_lambda_case_expr4155); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL389);


                    }
                    break;

            }

            pushFollow(FOLLOW_pure_block_in_lambda_case_expr4158);
            pure_block390=pure_block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pure_block.add(pure_block390.getTree());

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
            // 615:63: -> ^( NIL_TOKEN pattern pure_block )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:615:66: ^( NIL_TOKEN pattern pure_block )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:617:1: lambda_cases : ( pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block -> ^( CASES ^( NIL_TOKEN pattern pure_block ) ) | lambda_case_expr ( ( NL )? lambda_case_expr )* -> ^( CASES ( lambda_case_expr )+ ) );
    public final babel17Parser.lambda_cases_return lambda_cases() throws RecognitionException {
        babel17Parser.lambda_cases_return retval = new babel17Parser.lambda_cases_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL392=null;
        Token NL394=null;
        Token NL397=null;
        babel17Parser.pattern_return pattern391 = null;

        babel17Parser.token_DOUBLE_ARROW_return token_DOUBLE_ARROW393 = null;

        babel17Parser.pure_block_return pure_block395 = null;

        babel17Parser.lambda_case_expr_return lambda_case_expr396 = null;

        babel17Parser.lambda_case_expr_return lambda_case_expr398 = null;


        CommonTree NL392_tree=null;
        CommonTree NL394_tree=null;
        CommonTree NL397_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_token_DOUBLE_ARROW=new RewriteRuleSubtreeStream(adaptor,"rule token_DOUBLE_ARROW");
        RewriteRuleSubtreeStream stream_lambda_case_expr=new RewriteRuleSubtreeStream(adaptor,"rule lambda_case_expr");
        RewriteRuleSubtreeStream stream_pure_block=new RewriteRuleSubtreeStream(adaptor,"rule pure_block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:618:2: ( pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block -> ^( CASES ^( NIL_TOKEN pattern pure_block ) ) | lambda_case_expr ( ( NL )? lambda_case_expr )* -> ^( CASES ( lambda_case_expr )+ ) )
            int alt175=2;
            int LA175_0 = input.LA(1);

            if ( (LA175_0==L_exception||(LA175_0>=A_infinity && LA175_0<=U_infinity)||(LA175_0>=L_true && LA175_0<=L_false)||LA175_0==L_nil||LA175_0==MINUS||(LA175_0>=A_ELLIPSIS && LA175_0<=U_ELLIPSIS)||(LA175_0>=Constr && LA175_0<=Num)||(LA175_0>=String && LA175_0<=ROUND_BRACKET_OPEN)||LA175_0==SQUARE_BRACKET_OPEN||LA175_0==CURLY_BRACKET_OPEN||LA175_0==UNDERSCORE) ) {
                alt175=1;
            }
            else if ( (LA175_0==L_case) ) {
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:618:4: pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block
                    {
                    pushFollow(FOLLOW_pattern_in_lambda_cases4179);
                    pattern391=pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pattern.add(pattern391.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:618:12: ( NL )?
                    int alt171=2;
                    int LA171_0 = input.LA(1);

                    if ( (LA171_0==NL) ) {
                        alt171=1;
                    }
                    switch (alt171) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:618:12: NL
                            {
                            NL392=(Token)match(input,NL,FOLLOW_NL_in_lambda_cases4181); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL392);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_token_DOUBLE_ARROW_in_lambda_cases4184);
                    token_DOUBLE_ARROW393=token_DOUBLE_ARROW();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_token_DOUBLE_ARROW.add(token_DOUBLE_ARROW393.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:618:35: ( NL )?
                    int alt172=2;
                    int LA172_0 = input.LA(1);

                    if ( (LA172_0==NL) ) {
                        alt172=1;
                    }
                    switch (alt172) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:618:35: NL
                            {
                            NL394=(Token)match(input,NL,FOLLOW_NL_in_lambda_cases4186); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL394);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_pure_block_in_lambda_cases4189);
                    pure_block395=pure_block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pure_block.add(pure_block395.getTree());


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
                    // 618:50: -> ^( CASES ^( NIL_TOKEN pattern pure_block ) )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:618:53: ^( CASES ^( NIL_TOKEN pattern pure_block ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CASES, "CASES"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:618:61: ^( NIL_TOKEN pattern pure_block )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:619:4: lambda_case_expr ( ( NL )? lambda_case_expr )*
                    {
                    pushFollow(FOLLOW_lambda_case_expr_in_lambda_cases4208);
                    lambda_case_expr396=lambda_case_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_lambda_case_expr.add(lambda_case_expr396.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:619:21: ( ( NL )? lambda_case_expr )*
                    loop174:
                    do {
                        int alt174=2;
                        int LA174_0 = input.LA(1);

                        if ( (LA174_0==NL) ) {
                            int LA174_1 = input.LA(2);

                            if ( (LA174_1==L_case) ) {
                                alt174=1;
                            }


                        }
                        else if ( (LA174_0==L_case) ) {
                            alt174=1;
                        }


                        switch (alt174) {
                    	case 1 :
                    	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:619:22: ( NL )? lambda_case_expr
                    	    {
                    	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:619:22: ( NL )?
                    	    int alt173=2;
                    	    int LA173_0 = input.LA(1);

                    	    if ( (LA173_0==NL) ) {
                    	        alt173=1;
                    	    }
                    	    switch (alt173) {
                    	        case 1 :
                    	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:619:22: NL
                    	            {
                    	            NL397=(Token)match(input,NL,FOLLOW_NL_in_lambda_cases4211); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_NL.add(NL397);


                    	            }
                    	            break;

                    	    }

                    	    pushFollow(FOLLOW_lambda_case_expr_in_lambda_cases4214);
                    	    lambda_case_expr398=lambda_case_expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_lambda_case_expr.add(lambda_case_expr398.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop174;
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
                    // 619:45: -> ^( CASES ( lambda_case_expr )+ )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:619:48: ^( CASES ( lambda_case_expr )+ )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:621:1: for_expr : L_for ( NL )? pattern ( NL )? L_in ( NL )? protected_expr ( NL )? L_do block L_end -> ^( FOR_EXPR pattern protected_expr block ) ;
    public final babel17Parser.for_expr_return for_expr() throws RecognitionException {
        babel17Parser.for_expr_return retval = new babel17Parser.for_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_for399=null;
        Token NL400=null;
        Token NL402=null;
        Token L_in403=null;
        Token NL404=null;
        Token NL406=null;
        Token L_do407=null;
        Token L_end409=null;
        babel17Parser.pattern_return pattern401 = null;

        babel17Parser.protected_expr_return protected_expr405 = null;

        babel17Parser.block_return block408 = null;


        CommonTree L_for399_tree=null;
        CommonTree NL400_tree=null;
        CommonTree NL402_tree=null;
        CommonTree L_in403_tree=null;
        CommonTree NL404_tree=null;
        CommonTree NL406_tree=null;
        CommonTree L_do407_tree=null;
        CommonTree L_end409_tree=null;
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleTokenStream stream_L_for=new RewriteRuleTokenStream(adaptor,"token L_for");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_in=new RewriteRuleTokenStream(adaptor,"token L_in");
        RewriteRuleTokenStream stream_L_do=new RewriteRuleTokenStream(adaptor,"token L_do");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_protected_expr=new RewriteRuleSubtreeStream(adaptor,"rule protected_expr");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:621:9: ( L_for ( NL )? pattern ( NL )? L_in ( NL )? protected_expr ( NL )? L_do block L_end -> ^( FOR_EXPR pattern protected_expr block ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:621:11: L_for ( NL )? pattern ( NL )? L_in ( NL )? protected_expr ( NL )? L_do block L_end
            {
            L_for399=(Token)match(input,L_for,FOLLOW_L_for_in_for_expr4232); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_for.add(L_for399);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:621:17: ( NL )?
            int alt176=2;
            int LA176_0 = input.LA(1);

            if ( (LA176_0==NL) ) {
                alt176=1;
            }
            switch (alt176) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:621:17: NL
                    {
                    NL400=(Token)match(input,NL,FOLLOW_NL_in_for_expr4234); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL400);


                    }
                    break;

            }

            pushFollow(FOLLOW_pattern_in_for_expr4237);
            pattern401=pattern();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pattern.add(pattern401.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:621:29: ( NL )?
            int alt177=2;
            int LA177_0 = input.LA(1);

            if ( (LA177_0==NL) ) {
                alt177=1;
            }
            switch (alt177) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:621:29: NL
                    {
                    NL402=(Token)match(input,NL,FOLLOW_NL_in_for_expr4239); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL402);


                    }
                    break;

            }

            L_in403=(Token)match(input,L_in,FOLLOW_L_in_in_for_expr4242); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_in.add(L_in403);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:621:38: ( NL )?
            int alt178=2;
            int LA178_0 = input.LA(1);

            if ( (LA178_0==NL) ) {
                alt178=1;
            }
            switch (alt178) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:621:38: NL
                    {
                    NL404=(Token)match(input,NL,FOLLOW_NL_in_for_expr4244); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL404);


                    }
                    break;

            }

            pushFollow(FOLLOW_protected_expr_in_for_expr4247);
            protected_expr405=protected_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr405.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:621:57: ( NL )?
            int alt179=2;
            int LA179_0 = input.LA(1);

            if ( (LA179_0==NL) ) {
                alt179=1;
            }
            switch (alt179) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:621:57: NL
                    {
                    NL406=(Token)match(input,NL,FOLLOW_NL_in_for_expr4249); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL406);


                    }
                    break;

            }

            L_do407=(Token)match(input,L_do,FOLLOW_L_do_in_for_expr4252); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_do.add(L_do407);

            pushFollow(FOLLOW_block_in_for_expr4254);
            block408=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block408.getTree());
            L_end409=(Token)match(input,L_end,FOLLOW_L_end_in_for_expr4256); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_end.add(L_end409);



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
            // 622:5: -> ^( FOR_EXPR pattern protected_expr block )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:622:8: ^( FOR_EXPR pattern protected_expr block )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:624:1: op_expr : ( builtin_primitive op_expr | bool_expr );
    public final babel17Parser.op_expr_return op_expr() throws RecognitionException {
        babel17Parser.op_expr_return retval = new babel17Parser.op_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.builtin_primitive_return builtin_primitive410 = null;

        babel17Parser.op_expr_return op_expr411 = null;

        babel17Parser.bool_expr_return bool_expr412 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:624:9: ( builtin_primitive op_expr | bool_expr )
            int alt180=2;
            int LA180_0 = input.LA(1);

            if ( (LA180_0==L_exception||(LA180_0>=L_concurrent && LA180_0<=L_lazy)||LA180_0==L_random||LA180_0==L_typeof||LA180_0==L_force) ) {
                alt180=1;
            }
            else if ( (LA180_0==L_begin||(LA180_0>=L_with && LA180_0<=L_if)||(LA180_0>=L_while && LA180_0<=L_for)||LA180_0==L_match||LA180_0==L_try||(LA180_0>=A_infinity && LA180_0<=U_infinity)||(LA180_0>=L_true && LA180_0<=L_this)||LA180_0==L_nil||LA180_0==MINUS||LA180_0==A_NOT||LA180_0==U_NOT||(LA180_0>=Constr && LA180_0<=Num)||(LA180_0>=String && LA180_0<=ROUND_BRACKET_OPEN)||LA180_0==SQUARE_BRACKET_OPEN||LA180_0==CURLY_BRACKET_OPEN) ) {
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:624:11: builtin_primitive op_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_builtin_primitive_in_op_expr4281);
                    builtin_primitive410=builtin_primitive();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(builtin_primitive410.getTree(), root_0);
                    pushFollow(FOLLOW_op_expr_in_op_expr4284);
                    op_expr411=op_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, op_expr411.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:625:4: bool_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_bool_expr_in_op_expr4289);
                    bool_expr412=bool_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_expr412.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:627:1: p_op_expr : ( builtin_primitive ( NL )? p_op_expr | p_bool_expr );
    public final babel17Parser.p_op_expr_return p_op_expr() throws RecognitionException {
        babel17Parser.p_op_expr_return retval = new babel17Parser.p_op_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL414=null;
        babel17Parser.builtin_primitive_return builtin_primitive413 = null;

        babel17Parser.p_op_expr_return p_op_expr415 = null;

        babel17Parser.p_bool_expr_return p_bool_expr416 = null;


        CommonTree NL414_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:628:2: ( builtin_primitive ( NL )? p_op_expr | p_bool_expr )
            int alt182=2;
            int LA182_0 = input.LA(1);

            if ( (LA182_0==L_exception||(LA182_0>=L_concurrent && LA182_0<=L_lazy)||LA182_0==L_random||LA182_0==L_typeof||LA182_0==L_force) ) {
                alt182=1;
            }
            else if ( (LA182_0==L_begin||(LA182_0>=L_with && LA182_0<=L_if)||(LA182_0>=L_while && LA182_0<=L_for)||LA182_0==L_match||LA182_0==L_try||(LA182_0>=A_infinity && LA182_0<=U_infinity)||(LA182_0>=L_true && LA182_0<=L_this)||LA182_0==L_nil||LA182_0==MINUS||LA182_0==A_NOT||LA182_0==U_NOT||(LA182_0>=Constr && LA182_0<=Num)||(LA182_0>=String && LA182_0<=ROUND_BRACKET_OPEN)||LA182_0==SQUARE_BRACKET_OPEN||LA182_0==CURLY_BRACKET_OPEN) ) {
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:628:4: builtin_primitive ( NL )? p_op_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_builtin_primitive_in_p_op_expr4299);
                    builtin_primitive413=builtin_primitive();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(builtin_primitive413.getTree(), root_0);
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:628:25: ( NL )?
                    int alt181=2;
                    int LA181_0 = input.LA(1);

                    if ( (LA181_0==NL) ) {
                        alt181=1;
                    }
                    switch (alt181) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:628:25: NL
                            {
                            NL414=(Token)match(input,NL,FOLLOW_NL_in_p_op_expr4302); if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_p_op_expr_in_p_op_expr4306);
                    p_op_expr415=p_op_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_op_expr415.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:629:4: p_bool_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_p_bool_expr_in_p_op_expr4311);
                    p_bool_expr416=p_bool_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_bool_expr416.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:632:1: builtin_primitive : ( L_random | L_exception | L_lazy | L_choose | L_concurrent | L_force | L_typeof );
    public final babel17Parser.builtin_primitive_return builtin_primitive() throws RecognitionException {
        babel17Parser.builtin_primitive_return retval = new babel17Parser.builtin_primitive_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set417=null;

        CommonTree set417_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:633:2: ( L_random | L_exception | L_lazy | L_choose | L_concurrent | L_force | L_typeof )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set417=(Token)input.LT(1);
            if ( input.LA(1)==L_exception||(input.LA(1)>=L_concurrent && input.LA(1)<=L_lazy)||input.LA(1)==L_random||input.LA(1)==L_typeof||input.LA(1)==L_force ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set417));
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:635:1: bool_expr : bool_or_expr ;
    public final babel17Parser.bool_expr_return bool_expr() throws RecognitionException {
        babel17Parser.bool_expr_return retval = new babel17Parser.bool_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.bool_or_expr_return bool_or_expr418 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:636:2: ( bool_or_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:636:4: bool_or_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bool_or_expr_in_bool_expr4355);
            bool_or_expr418=bool_or_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_or_expr418.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:638:1: p_bool_expr : p_bool_or_expr ;
    public final babel17Parser.p_bool_expr_return p_bool_expr() throws RecognitionException {
        babel17Parser.p_bool_expr_return retval = new babel17Parser.p_bool_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.p_bool_or_expr_return p_bool_or_expr419 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:639:2: ( p_bool_or_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:639:4: p_bool_or_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_bool_or_expr_in_p_bool_expr4365);
            p_bool_or_expr419=p_bool_or_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_bool_or_expr419.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:641:1: bool_or_expr : bool_and_expr ( ( NL )? token_OR ( NL )? bool_and_expr )* ;
    public final babel17Parser.bool_or_expr_return bool_or_expr() throws RecognitionException {
        babel17Parser.bool_or_expr_return retval = new babel17Parser.bool_or_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL421=null;
        Token NL423=null;
        babel17Parser.bool_and_expr_return bool_and_expr420 = null;

        babel17Parser.token_OR_return token_OR422 = null;

        babel17Parser.bool_and_expr_return bool_and_expr424 = null;


        CommonTree NL421_tree=null;
        CommonTree NL423_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:642:2: ( bool_and_expr ( ( NL )? token_OR ( NL )? bool_and_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:642:4: bool_and_expr ( ( NL )? token_OR ( NL )? bool_and_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bool_and_expr_in_bool_or_expr4374);
            bool_and_expr420=bool_and_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_and_expr420.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:642:18: ( ( NL )? token_OR ( NL )? bool_and_expr )*
            loop185:
            do {
                int alt185=2;
                int LA185_0 = input.LA(1);

                if ( (LA185_0==NL) ) {
                    int LA185_1 = input.LA(2);

                    if ( (LA185_1==A_OR||LA185_1==U_OR) ) {
                        alt185=1;
                    }


                }
                else if ( (LA185_0==A_OR||LA185_0==U_OR) ) {
                    alt185=1;
                }


                switch (alt185) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:642:19: ( NL )? token_OR ( NL )? bool_and_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:642:21: ( NL )?
            	    int alt183=2;
            	    int LA183_0 = input.LA(1);

            	    if ( (LA183_0==NL) ) {
            	        alt183=1;
            	    }
            	    switch (alt183) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:642:21: NL
            	            {
            	            NL421=(Token)match(input,NL,FOLLOW_NL_in_bool_or_expr4377); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_token_OR_in_bool_or_expr4381);
            	    token_OR422=token_OR();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(token_OR422.getTree(), root_0);
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:642:36: ( NL )?
            	    int alt184=2;
            	    int LA184_0 = input.LA(1);

            	    if ( (LA184_0==NL) ) {
            	        alt184=1;
            	    }
            	    switch (alt184) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:642:36: NL
            	            {
            	            NL423=(Token)match(input,NL,FOLLOW_NL_in_bool_or_expr4384); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_bool_and_expr_in_bool_or_expr4388);
            	    bool_and_expr424=bool_and_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_and_expr424.getTree());

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
    // $ANTLR end "bool_or_expr"

    public static class p_bool_or_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "p_bool_or_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:644:1: p_bool_or_expr : p_bool_and_expr ( ( NL )? token_OR ( NL )? p_bool_and_expr )* ;
    public final babel17Parser.p_bool_or_expr_return p_bool_or_expr() throws RecognitionException {
        babel17Parser.p_bool_or_expr_return retval = new babel17Parser.p_bool_or_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL426=null;
        Token NL428=null;
        babel17Parser.p_bool_and_expr_return p_bool_and_expr425 = null;

        babel17Parser.token_OR_return token_OR427 = null;

        babel17Parser.p_bool_and_expr_return p_bool_and_expr429 = null;


        CommonTree NL426_tree=null;
        CommonTree NL428_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:645:2: ( p_bool_and_expr ( ( NL )? token_OR ( NL )? p_bool_and_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:645:4: p_bool_and_expr ( ( NL )? token_OR ( NL )? p_bool_and_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_bool_and_expr_in_p_bool_or_expr4400);
            p_bool_and_expr425=p_bool_and_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_bool_and_expr425.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:645:20: ( ( NL )? token_OR ( NL )? p_bool_and_expr )*
            loop188:
            do {
                int alt188=2;
                int LA188_0 = input.LA(1);

                if ( (LA188_0==NL) ) {
                    int LA188_1 = input.LA(2);

                    if ( (LA188_1==A_OR||LA188_1==U_OR) ) {
                        alt188=1;
                    }


                }
                else if ( (LA188_0==A_OR||LA188_0==U_OR) ) {
                    alt188=1;
                }


                switch (alt188) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:645:21: ( NL )? token_OR ( NL )? p_bool_and_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:645:23: ( NL )?
            	    int alt186=2;
            	    int LA186_0 = input.LA(1);

            	    if ( (LA186_0==NL) ) {
            	        alt186=1;
            	    }
            	    switch (alt186) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:645:23: NL
            	            {
            	            NL426=(Token)match(input,NL,FOLLOW_NL_in_p_bool_or_expr4403); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_token_OR_in_p_bool_or_expr4407);
            	    token_OR427=token_OR();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(token_OR427.getTree(), root_0);
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:645:38: ( NL )?
            	    int alt187=2;
            	    int LA187_0 = input.LA(1);

            	    if ( (LA187_0==NL) ) {
            	        alt187=1;
            	    }
            	    switch (alt187) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:645:38: NL
            	            {
            	            NL428=(Token)match(input,NL,FOLLOW_NL_in_p_bool_or_expr4410); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_bool_and_expr_in_p_bool_or_expr4414);
            	    p_bool_and_expr429=p_bool_and_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_bool_and_expr429.getTree());

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
    // $ANTLR end "p_bool_or_expr"

    public static class bool_and_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bool_and_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:647:1: bool_and_expr : bool_not_expr ( ( NL )? token_AND ( NL )? bool_not_expr )* ;
    public final babel17Parser.bool_and_expr_return bool_and_expr() throws RecognitionException {
        babel17Parser.bool_and_expr_return retval = new babel17Parser.bool_and_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL431=null;
        Token NL433=null;
        babel17Parser.bool_not_expr_return bool_not_expr430 = null;

        babel17Parser.token_AND_return token_AND432 = null;

        babel17Parser.bool_not_expr_return bool_not_expr434 = null;


        CommonTree NL431_tree=null;
        CommonTree NL433_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:648:2: ( bool_not_expr ( ( NL )? token_AND ( NL )? bool_not_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:648:4: bool_not_expr ( ( NL )? token_AND ( NL )? bool_not_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bool_not_expr_in_bool_and_expr4426);
            bool_not_expr430=bool_not_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_not_expr430.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:648:18: ( ( NL )? token_AND ( NL )? bool_not_expr )*
            loop191:
            do {
                int alt191=2;
                int LA191_0 = input.LA(1);

                if ( (LA191_0==NL) ) {
                    int LA191_1 = input.LA(2);

                    if ( (LA191_1==A_AND||LA191_1==U_AND) ) {
                        alt191=1;
                    }


                }
                else if ( (LA191_0==A_AND||LA191_0==U_AND) ) {
                    alt191=1;
                }


                switch (alt191) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:648:19: ( NL )? token_AND ( NL )? bool_not_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:648:21: ( NL )?
            	    int alt189=2;
            	    int LA189_0 = input.LA(1);

            	    if ( (LA189_0==NL) ) {
            	        alt189=1;
            	    }
            	    switch (alt189) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:648:21: NL
            	            {
            	            NL431=(Token)match(input,NL,FOLLOW_NL_in_bool_and_expr4429); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_token_AND_in_bool_and_expr4433);
            	    token_AND432=token_AND();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(token_AND432.getTree(), root_0);
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:648:37: ( NL )?
            	    int alt190=2;
            	    int LA190_0 = input.LA(1);

            	    if ( (LA190_0==NL) ) {
            	        alt190=1;
            	    }
            	    switch (alt190) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:648:37: NL
            	            {
            	            NL433=(Token)match(input,NL,FOLLOW_NL_in_bool_and_expr4436); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_bool_not_expr_in_bool_and_expr4440);
            	    bool_not_expr434=bool_not_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_not_expr434.getTree());

            	    }
            	    break;

            	default :
            	    break loop191;
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:650:1: p_bool_and_expr : p_bool_not_expr ( ( NL )? token_AND ( NL )? p_bool_not_expr )* ;
    public final babel17Parser.p_bool_and_expr_return p_bool_and_expr() throws RecognitionException {
        babel17Parser.p_bool_and_expr_return retval = new babel17Parser.p_bool_and_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL436=null;
        Token NL438=null;
        babel17Parser.p_bool_not_expr_return p_bool_not_expr435 = null;

        babel17Parser.token_AND_return token_AND437 = null;

        babel17Parser.p_bool_not_expr_return p_bool_not_expr439 = null;


        CommonTree NL436_tree=null;
        CommonTree NL438_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:651:2: ( p_bool_not_expr ( ( NL )? token_AND ( NL )? p_bool_not_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:651:4: p_bool_not_expr ( ( NL )? token_AND ( NL )? p_bool_not_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_bool_not_expr_in_p_bool_and_expr4452);
            p_bool_not_expr435=p_bool_not_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_bool_not_expr435.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:651:20: ( ( NL )? token_AND ( NL )? p_bool_not_expr )*
            loop194:
            do {
                int alt194=2;
                int LA194_0 = input.LA(1);

                if ( (LA194_0==NL) ) {
                    int LA194_1 = input.LA(2);

                    if ( (LA194_1==A_AND||LA194_1==U_AND) ) {
                        alt194=1;
                    }


                }
                else if ( (LA194_0==A_AND||LA194_0==U_AND) ) {
                    alt194=1;
                }


                switch (alt194) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:651:21: ( NL )? token_AND ( NL )? p_bool_not_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:651:23: ( NL )?
            	    int alt192=2;
            	    int LA192_0 = input.LA(1);

            	    if ( (LA192_0==NL) ) {
            	        alt192=1;
            	    }
            	    switch (alt192) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:651:23: NL
            	            {
            	            NL436=(Token)match(input,NL,FOLLOW_NL_in_p_bool_and_expr4455); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_token_AND_in_p_bool_and_expr4459);
            	    token_AND437=token_AND();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(token_AND437.getTree(), root_0);
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:651:39: ( NL )?
            	    int alt193=2;
            	    int LA193_0 = input.LA(1);

            	    if ( (LA193_0==NL) ) {
            	        alt193=1;
            	    }
            	    switch (alt193) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:651:39: NL
            	            {
            	            NL438=(Token)match(input,NL,FOLLOW_NL_in_p_bool_and_expr4462); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_bool_not_expr_in_p_bool_and_expr4466);
            	    p_bool_not_expr439=p_bool_not_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_bool_not_expr439.getTree());

            	    }
            	    break;

            	default :
            	    break loop194;
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:654:1: bool_not_expr : ( token_NOT ( NL )? bool_not_expr | rel_expr );
    public final babel17Parser.bool_not_expr_return bool_not_expr() throws RecognitionException {
        babel17Parser.bool_not_expr_return retval = new babel17Parser.bool_not_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL441=null;
        babel17Parser.token_NOT_return token_NOT440 = null;

        babel17Parser.bool_not_expr_return bool_not_expr442 = null;

        babel17Parser.rel_expr_return rel_expr443 = null;


        CommonTree NL441_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:655:2: ( token_NOT ( NL )? bool_not_expr | rel_expr )
            int alt196=2;
            int LA196_0 = input.LA(1);

            if ( (LA196_0==A_NOT||LA196_0==U_NOT) ) {
                alt196=1;
            }
            else if ( (LA196_0==L_begin||(LA196_0>=L_with && LA196_0<=L_if)||(LA196_0>=L_while && LA196_0<=L_for)||LA196_0==L_match||LA196_0==L_try||(LA196_0>=A_infinity && LA196_0<=U_infinity)||(LA196_0>=L_true && LA196_0<=L_this)||LA196_0==L_nil||LA196_0==MINUS||(LA196_0>=Constr && LA196_0<=Num)||(LA196_0>=String && LA196_0<=ROUND_BRACKET_OPEN)||LA196_0==SQUARE_BRACKET_OPEN||LA196_0==CURLY_BRACKET_OPEN) ) {
                alt196=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 196, 0, input);

                throw nvae;
            }
            switch (alt196) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:655:4: token_NOT ( NL )? bool_not_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_NOT_in_bool_not_expr4478);
                    token_NOT440=token_NOT();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(token_NOT440.getTree(), root_0);
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:655:17: ( NL )?
                    int alt195=2;
                    int LA195_0 = input.LA(1);

                    if ( (LA195_0==NL) ) {
                        alt195=1;
                    }
                    switch (alt195) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:655:17: NL
                            {
                            NL441=(Token)match(input,NL,FOLLOW_NL_in_bool_not_expr4481); if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_bool_not_expr_in_bool_not_expr4485);
                    bool_not_expr442=bool_not_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_not_expr442.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:656:4: rel_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_rel_expr_in_bool_not_expr4490);
                    rel_expr443=rel_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rel_expr443.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:658:1: p_bool_not_expr : ( token_NOT ( NL )? p_bool_not_expr | p_rel_expr );
    public final babel17Parser.p_bool_not_expr_return p_bool_not_expr() throws RecognitionException {
        babel17Parser.p_bool_not_expr_return retval = new babel17Parser.p_bool_not_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL445=null;
        babel17Parser.token_NOT_return token_NOT444 = null;

        babel17Parser.p_bool_not_expr_return p_bool_not_expr446 = null;

        babel17Parser.p_rel_expr_return p_rel_expr447 = null;


        CommonTree NL445_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:659:2: ( token_NOT ( NL )? p_bool_not_expr | p_rel_expr )
            int alt198=2;
            int LA198_0 = input.LA(1);

            if ( (LA198_0==A_NOT||LA198_0==U_NOT) ) {
                alt198=1;
            }
            else if ( (LA198_0==L_begin||(LA198_0>=L_with && LA198_0<=L_if)||(LA198_0>=L_while && LA198_0<=L_for)||LA198_0==L_match||LA198_0==L_try||(LA198_0>=A_infinity && LA198_0<=U_infinity)||(LA198_0>=L_true && LA198_0<=L_this)||LA198_0==L_nil||LA198_0==MINUS||(LA198_0>=Constr && LA198_0<=Num)||(LA198_0>=String && LA198_0<=ROUND_BRACKET_OPEN)||LA198_0==SQUARE_BRACKET_OPEN||LA198_0==CURLY_BRACKET_OPEN) ) {
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:659:4: token_NOT ( NL )? p_bool_not_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_NOT_in_p_bool_not_expr4501);
                    token_NOT444=token_NOT();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(token_NOT444.getTree(), root_0);
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:659:17: ( NL )?
                    int alt197=2;
                    int LA197_0 = input.LA(1);

                    if ( (LA197_0==NL) ) {
                        alt197=1;
                    }
                    switch (alt197) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:659:17: NL
                            {
                            NL445=(Token)match(input,NL,FOLLOW_NL_in_p_bool_not_expr4504); if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_p_bool_not_expr_in_p_bool_not_expr4508);
                    p_bool_not_expr446=p_bool_not_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_bool_not_expr446.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:660:4: p_rel_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_p_rel_expr_in_p_bool_not_expr4513);
                    p_rel_expr447=p_rel_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_rel_expr447.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:662:1: rel_expr : arith_expr ( ( NL )? rel_op ( NL )? arith_expr )* -> ^( COMPARE arith_expr ( rel_op arith_expr )* ) ;
    public final babel17Parser.rel_expr_return rel_expr() throws RecognitionException {
        babel17Parser.rel_expr_return retval = new babel17Parser.rel_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL449=null;
        Token NL451=null;
        babel17Parser.arith_expr_return arith_expr448 = null;

        babel17Parser.rel_op_return rel_op450 = null;

        babel17Parser.arith_expr_return arith_expr452 = null;


        CommonTree NL449_tree=null;
        CommonTree NL451_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_arith_expr=new RewriteRuleSubtreeStream(adaptor,"rule arith_expr");
        RewriteRuleSubtreeStream stream_rel_op=new RewriteRuleSubtreeStream(adaptor,"rule rel_op");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:663:2: ( arith_expr ( ( NL )? rel_op ( NL )? arith_expr )* -> ^( COMPARE arith_expr ( rel_op arith_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:663:4: arith_expr ( ( NL )? rel_op ( NL )? arith_expr )*
            {
            pushFollow(FOLLOW_arith_expr_in_rel_expr4522);
            arith_expr448=arith_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_arith_expr.add(arith_expr448.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:663:15: ( ( NL )? rel_op ( NL )? arith_expr )*
            loop201:
            do {
                int alt201=2;
                int LA201_0 = input.LA(1);

                if ( (LA201_0==NL) ) {
                    int LA201_1 = input.LA(2);

                    if ( ((LA201_1>=A_EQUAL && LA201_1<=U_GREATER_EQ)) ) {
                        alt201=1;
                    }


                }
                else if ( ((LA201_0>=A_EQUAL && LA201_0<=U_GREATER_EQ)) ) {
                    alt201=1;
                }


                switch (alt201) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:663:16: ( NL )? rel_op ( NL )? arith_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:663:16: ( NL )?
            	    int alt199=2;
            	    int LA199_0 = input.LA(1);

            	    if ( (LA199_0==NL) ) {
            	        alt199=1;
            	    }
            	    switch (alt199) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:663:16: NL
            	            {
            	            NL449=(Token)match(input,NL,FOLLOW_NL_in_rel_expr4525); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL449);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_rel_op_in_rel_expr4528);
            	    rel_op450=rel_op();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_rel_op.add(rel_op450.getTree());
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:663:27: ( NL )?
            	    int alt200=2;
            	    int LA200_0 = input.LA(1);

            	    if ( (LA200_0==NL) ) {
            	        alt200=1;
            	    }
            	    switch (alt200) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:663:27: NL
            	            {
            	            NL451=(Token)match(input,NL,FOLLOW_NL_in_rel_expr4530); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL451);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_arith_expr_in_rel_expr4533);
            	    arith_expr452=arith_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_arith_expr.add(arith_expr452.getTree());

            	    }
            	    break;

            	default :
            	    break loop201;
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
            // 663:44: -> ^( COMPARE arith_expr ( rel_op arith_expr )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:663:47: ^( COMPARE arith_expr ( rel_op arith_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COMPARE, "COMPARE"), root_1);

                adaptor.addChild(root_1, stream_arith_expr.nextTree());
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:663:68: ( rel_op arith_expr )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:665:1: p_rel_expr : p_arith_expr ( ( NL )? rel_op ( NL )? p_arith_expr )* -> ^( COMPARE p_arith_expr ( rel_op p_arith_expr )* ) ;
    public final babel17Parser.p_rel_expr_return p_rel_expr() throws RecognitionException {
        babel17Parser.p_rel_expr_return retval = new babel17Parser.p_rel_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL454=null;
        Token NL456=null;
        babel17Parser.p_arith_expr_return p_arith_expr453 = null;

        babel17Parser.rel_op_return rel_op455 = null;

        babel17Parser.p_arith_expr_return p_arith_expr457 = null;


        CommonTree NL454_tree=null;
        CommonTree NL456_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_p_arith_expr=new RewriteRuleSubtreeStream(adaptor,"rule p_arith_expr");
        RewriteRuleSubtreeStream stream_rel_op=new RewriteRuleSubtreeStream(adaptor,"rule rel_op");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:666:2: ( p_arith_expr ( ( NL )? rel_op ( NL )? p_arith_expr )* -> ^( COMPARE p_arith_expr ( rel_op p_arith_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:666:4: p_arith_expr ( ( NL )? rel_op ( NL )? p_arith_expr )*
            {
            pushFollow(FOLLOW_p_arith_expr_in_p_rel_expr4560);
            p_arith_expr453=p_arith_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_p_arith_expr.add(p_arith_expr453.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:666:17: ( ( NL )? rel_op ( NL )? p_arith_expr )*
            loop204:
            do {
                int alt204=2;
                int LA204_0 = input.LA(1);

                if ( (LA204_0==NL) ) {
                    int LA204_1 = input.LA(2);

                    if ( ((LA204_1>=A_EQUAL && LA204_1<=U_GREATER_EQ)) ) {
                        alt204=1;
                    }


                }
                else if ( ((LA204_0>=A_EQUAL && LA204_0<=U_GREATER_EQ)) ) {
                    alt204=1;
                }


                switch (alt204) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:666:18: ( NL )? rel_op ( NL )? p_arith_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:666:18: ( NL )?
            	    int alt202=2;
            	    int LA202_0 = input.LA(1);

            	    if ( (LA202_0==NL) ) {
            	        alt202=1;
            	    }
            	    switch (alt202) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:666:18: NL
            	            {
            	            NL454=(Token)match(input,NL,FOLLOW_NL_in_p_rel_expr4563); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL454);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_rel_op_in_p_rel_expr4566);
            	    rel_op455=rel_op();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_rel_op.add(rel_op455.getTree());
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:666:29: ( NL )?
            	    int alt203=2;
            	    int LA203_0 = input.LA(1);

            	    if ( (LA203_0==NL) ) {
            	        alt203=1;
            	    }
            	    switch (alt203) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:666:29: NL
            	            {
            	            NL456=(Token)match(input,NL,FOLLOW_NL_in_p_rel_expr4568); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL456);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_arith_expr_in_p_rel_expr4571);
            	    p_arith_expr457=p_arith_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_p_arith_expr.add(p_arith_expr457.getTree());

            	    }
            	    break;

            	default :
            	    break loop204;
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
            // 666:48: -> ^( COMPARE p_arith_expr ( rel_op p_arith_expr )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:666:51: ^( COMPARE p_arith_expr ( rel_op p_arith_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COMPARE, "COMPARE"), root_1);

                adaptor.addChild(root_1, stream_p_arith_expr.nextTree());
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:666:74: ( rel_op p_arith_expr )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:669:1: rel_op : ( token_EQUAL | token_NOT_EQUAL | GREATER | token_GREATER_EQ | LESS | token_LESS_EQ );
    public final babel17Parser.rel_op_return rel_op() throws RecognitionException {
        babel17Parser.rel_op_return retval = new babel17Parser.rel_op_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token GREATER460=null;
        Token LESS462=null;
        babel17Parser.token_EQUAL_return token_EQUAL458 = null;

        babel17Parser.token_NOT_EQUAL_return token_NOT_EQUAL459 = null;

        babel17Parser.token_GREATER_EQ_return token_GREATER_EQ461 = null;

        babel17Parser.token_LESS_EQ_return token_LESS_EQ463 = null;


        CommonTree GREATER460_tree=null;
        CommonTree LESS462_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:669:8: ( token_EQUAL | token_NOT_EQUAL | GREATER | token_GREATER_EQ | LESS | token_LESS_EQ )
            int alt205=6;
            switch ( input.LA(1) ) {
            case A_EQUAL:
            case U_EQUAL:
                {
                alt205=1;
                }
                break;
            case A_NOT_EQUAL:
            case U_NOT_EQUAL:
                {
                alt205=2;
                }
                break;
            case GREATER:
                {
                alt205=3;
                }
                break;
            case A_GREATER_EQ:
            case U_GREATER_EQ:
                {
                alt205=4;
                }
                break;
            case LESS:
                {
                alt205=5;
                }
                break;
            case A_LESS_EQ:
            case U_LESS_EQ:
                {
                alt205=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 205, 0, input);

                throw nvae;
            }

            switch (alt205) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:669:10: token_EQUAL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_EQUAL_in_rel_op4597);
                    token_EQUAL458=token_EQUAL();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, token_EQUAL458.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:669:24: token_NOT_EQUAL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_NOT_EQUAL_in_rel_op4601);
                    token_NOT_EQUAL459=token_NOT_EQUAL();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, token_NOT_EQUAL459.getTree());

                    }
                    break;
                case 3 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:669:42: GREATER
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    GREATER460=(Token)match(input,GREATER,FOLLOW_GREATER_in_rel_op4605); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    GREATER460_tree = (CommonTree)adaptor.create(GREATER460);
                    adaptor.addChild(root_0, GREATER460_tree);
                    }

                    }
                    break;
                case 4 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:669:52: token_GREATER_EQ
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_GREATER_EQ_in_rel_op4609);
                    token_GREATER_EQ461=token_GREATER_EQ();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, token_GREATER_EQ461.getTree());

                    }
                    break;
                case 5 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:669:71: LESS
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    LESS462=(Token)match(input,LESS,FOLLOW_LESS_in_rel_op4613); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LESS462_tree = (CommonTree)adaptor.create(LESS462);
                    adaptor.addChild(root_0, LESS462_tree);
                    }

                    }
                    break;
                case 6 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:669:78: token_LESS_EQ
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_LESS_EQ_in_rel_op4617);
                    token_LESS_EQ463=token_LESS_EQ();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, token_LESS_EQ463.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:672:1: arith_expr : plusplus_expr ;
    public final babel17Parser.arith_expr_return arith_expr() throws RecognitionException {
        babel17Parser.arith_expr_return retval = new babel17Parser.arith_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.plusplus_expr_return plusplus_expr464 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:673:2: ( plusplus_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:673:4: plusplus_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_plusplus_expr_in_arith_expr4629);
            plusplus_expr464=plusplus_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, plusplus_expr464.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:676:1: p_arith_expr : p_plusplus_expr ;
    public final babel17Parser.p_arith_expr_return p_arith_expr() throws RecognitionException {
        babel17Parser.p_arith_expr_return retval = new babel17Parser.p_arith_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.p_plusplus_expr_return p_plusplus_expr465 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:677:2: ( p_plusplus_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:677:4: p_plusplus_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_plusplus_expr_in_p_arith_expr4639);
            p_plusplus_expr465=p_plusplus_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_plusplus_expr465.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:679:1: plusplus_expr : timestimes_expr ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? timestimes_expr )* ;
    public final babel17Parser.plusplus_expr_return plusplus_expr() throws RecognitionException {
        babel17Parser.plusplus_expr_return retval = new babel17Parser.plusplus_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL467=null;
        Token PLUSPLUS468=null;
        Token MINUSMINUS469=null;
        Token NL470=null;
        babel17Parser.timestimes_expr_return timestimes_expr466 = null;

        babel17Parser.timestimes_expr_return timestimes_expr471 = null;


        CommonTree NL467_tree=null;
        CommonTree PLUSPLUS468_tree=null;
        CommonTree MINUSMINUS469_tree=null;
        CommonTree NL470_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:680:2: ( timestimes_expr ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? timestimes_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:680:4: timestimes_expr ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? timestimes_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_timestimes_expr_in_plusplus_expr4649);
            timestimes_expr466=timestimes_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, timestimes_expr466.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:680:20: ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? timestimes_expr )*
            loop209:
            do {
                int alt209=2;
                int LA209_0 = input.LA(1);

                if ( (LA209_0==NL) ) {
                    int LA209_1 = input.LA(2);

                    if ( ((LA209_1>=PLUSPLUS && LA209_1<=MINUSMINUS)) ) {
                        alt209=1;
                    }


                }
                else if ( ((LA209_0>=PLUSPLUS && LA209_0<=MINUSMINUS)) ) {
                    alt209=1;
                }


                switch (alt209) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:680:21: ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? timestimes_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:680:23: ( NL )?
            	    int alt206=2;
            	    int LA206_0 = input.LA(1);

            	    if ( (LA206_0==NL) ) {
            	        alt206=1;
            	    }
            	    switch (alt206) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:680:23: NL
            	            {
            	            NL467=(Token)match(input,NL,FOLLOW_NL_in_plusplus_expr4652); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:680:26: ( PLUSPLUS | MINUSMINUS )
            	    int alt207=2;
            	    int LA207_0 = input.LA(1);

            	    if ( (LA207_0==PLUSPLUS) ) {
            	        alt207=1;
            	    }
            	    else if ( (LA207_0==MINUSMINUS) ) {
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
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:680:27: PLUSPLUS
            	            {
            	            PLUSPLUS468=(Token)match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_plusplus_expr4657); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PLUSPLUS468_tree = (CommonTree)adaptor.create(PLUSPLUS468);
            	            root_0 = (CommonTree)adaptor.becomeRoot(PLUSPLUS468_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:680:37: MINUSMINUS
            	            {
            	            MINUSMINUS469=(Token)match(input,MINUSMINUS,FOLLOW_MINUSMINUS_in_plusplus_expr4660); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            MINUSMINUS469_tree = (CommonTree)adaptor.create(MINUSMINUS469);
            	            root_0 = (CommonTree)adaptor.becomeRoot(MINUSMINUS469_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:680:52: ( NL )?
            	    int alt208=2;
            	    int LA208_0 = input.LA(1);

            	    if ( (LA208_0==NL) ) {
            	        alt208=1;
            	    }
            	    switch (alt208) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:680:52: NL
            	            {
            	            NL470=(Token)match(input,NL,FOLLOW_NL_in_plusplus_expr4664); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_timestimes_expr_in_plusplus_expr4668);
            	    timestimes_expr471=timestimes_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, timestimes_expr471.getTree());

            	    }
            	    break;

            	default :
            	    break loop209;
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:682:1: p_plusplus_expr : p_timestimes_expr ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? p_timestimes_expr )* ;
    public final babel17Parser.p_plusplus_expr_return p_plusplus_expr() throws RecognitionException {
        babel17Parser.p_plusplus_expr_return retval = new babel17Parser.p_plusplus_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL473=null;
        Token PLUSPLUS474=null;
        Token MINUSMINUS475=null;
        Token NL476=null;
        babel17Parser.p_timestimes_expr_return p_timestimes_expr472 = null;

        babel17Parser.p_timestimes_expr_return p_timestimes_expr477 = null;


        CommonTree NL473_tree=null;
        CommonTree PLUSPLUS474_tree=null;
        CommonTree MINUSMINUS475_tree=null;
        CommonTree NL476_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:683:2: ( p_timestimes_expr ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? p_timestimes_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:683:4: p_timestimes_expr ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? p_timestimes_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_timestimes_expr_in_p_plusplus_expr4680);
            p_timestimes_expr472=p_timestimes_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_timestimes_expr472.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:683:22: ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? p_timestimes_expr )*
            loop213:
            do {
                int alt213=2;
                int LA213_0 = input.LA(1);

                if ( (LA213_0==NL) ) {
                    int LA213_1 = input.LA(2);

                    if ( ((LA213_1>=PLUSPLUS && LA213_1<=MINUSMINUS)) ) {
                        alt213=1;
                    }


                }
                else if ( ((LA213_0>=PLUSPLUS && LA213_0<=MINUSMINUS)) ) {
                    alt213=1;
                }


                switch (alt213) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:683:23: ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? p_timestimes_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:683:25: ( NL )?
            	    int alt210=2;
            	    int LA210_0 = input.LA(1);

            	    if ( (LA210_0==NL) ) {
            	        alt210=1;
            	    }
            	    switch (alt210) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:683:25: NL
            	            {
            	            NL473=(Token)match(input,NL,FOLLOW_NL_in_p_plusplus_expr4683); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:683:28: ( PLUSPLUS | MINUSMINUS )
            	    int alt211=2;
            	    int LA211_0 = input.LA(1);

            	    if ( (LA211_0==PLUSPLUS) ) {
            	        alt211=1;
            	    }
            	    else if ( (LA211_0==MINUSMINUS) ) {
            	        alt211=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 211, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt211) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:683:29: PLUSPLUS
            	            {
            	            PLUSPLUS474=(Token)match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_p_plusplus_expr4688); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PLUSPLUS474_tree = (CommonTree)adaptor.create(PLUSPLUS474);
            	            root_0 = (CommonTree)adaptor.becomeRoot(PLUSPLUS474_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:683:39: MINUSMINUS
            	            {
            	            MINUSMINUS475=(Token)match(input,MINUSMINUS,FOLLOW_MINUSMINUS_in_p_plusplus_expr4691); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            MINUSMINUS475_tree = (CommonTree)adaptor.create(MINUSMINUS475);
            	            root_0 = (CommonTree)adaptor.becomeRoot(MINUSMINUS475_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:683:54: ( NL )?
            	    int alt212=2;
            	    int LA212_0 = input.LA(1);

            	    if ( (LA212_0==NL) ) {
            	        alt212=1;
            	    }
            	    switch (alt212) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:683:54: NL
            	            {
            	            NL476=(Token)match(input,NL,FOLLOW_NL_in_p_plusplus_expr4695); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_timestimes_expr_in_p_plusplus_expr4699);
            	    p_timestimes_expr477=p_timestimes_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_timestimes_expr477.getTree());

            	    }
            	    break;

            	default :
            	    break loop213;
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:686:1: timestimes_expr : simple_expr ( ( NL )? ( TIMESTIMES | QUOTIENTQUOTIENT ) ( NL )? simple_expr )* ;
    public final babel17Parser.timestimes_expr_return timestimes_expr() throws RecognitionException {
        babel17Parser.timestimes_expr_return retval = new babel17Parser.timestimes_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL479=null;
        Token TIMESTIMES480=null;
        Token QUOTIENTQUOTIENT481=null;
        Token NL482=null;
        babel17Parser.simple_expr_return simple_expr478 = null;

        babel17Parser.simple_expr_return simple_expr483 = null;


        CommonTree NL479_tree=null;
        CommonTree TIMESTIMES480_tree=null;
        CommonTree QUOTIENTQUOTIENT481_tree=null;
        CommonTree NL482_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:687:2: ( simple_expr ( ( NL )? ( TIMESTIMES | QUOTIENTQUOTIENT ) ( NL )? simple_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:687:4: simple_expr ( ( NL )? ( TIMESTIMES | QUOTIENTQUOTIENT ) ( NL )? simple_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_simple_expr_in_timestimes_expr4711);
            simple_expr478=simple_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, simple_expr478.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:687:16: ( ( NL )? ( TIMESTIMES | QUOTIENTQUOTIENT ) ( NL )? simple_expr )*
            loop217:
            do {
                int alt217=2;
                int LA217_0 = input.LA(1);

                if ( (LA217_0==NL) ) {
                    int LA217_1 = input.LA(2);

                    if ( ((LA217_1>=TIMESTIMES && LA217_1<=QUOTIENTQUOTIENT)) ) {
                        alt217=1;
                    }


                }
                else if ( ((LA217_0>=TIMESTIMES && LA217_0<=QUOTIENTQUOTIENT)) ) {
                    alt217=1;
                }


                switch (alt217) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:687:17: ( NL )? ( TIMESTIMES | QUOTIENTQUOTIENT ) ( NL )? simple_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:687:19: ( NL )?
            	    int alt214=2;
            	    int LA214_0 = input.LA(1);

            	    if ( (LA214_0==NL) ) {
            	        alt214=1;
            	    }
            	    switch (alt214) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:687:19: NL
            	            {
            	            NL479=(Token)match(input,NL,FOLLOW_NL_in_timestimes_expr4714); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:687:22: ( TIMESTIMES | QUOTIENTQUOTIENT )
            	    int alt215=2;
            	    int LA215_0 = input.LA(1);

            	    if ( (LA215_0==TIMESTIMES) ) {
            	        alt215=1;
            	    }
            	    else if ( (LA215_0==QUOTIENTQUOTIENT) ) {
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
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:687:23: TIMESTIMES
            	            {
            	            TIMESTIMES480=(Token)match(input,TIMESTIMES,FOLLOW_TIMESTIMES_in_timestimes_expr4719); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            TIMESTIMES480_tree = (CommonTree)adaptor.create(TIMESTIMES480);
            	            root_0 = (CommonTree)adaptor.becomeRoot(TIMESTIMES480_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:687:35: QUOTIENTQUOTIENT
            	            {
            	            QUOTIENTQUOTIENT481=(Token)match(input,QUOTIENTQUOTIENT,FOLLOW_QUOTIENTQUOTIENT_in_timestimes_expr4722); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            QUOTIENTQUOTIENT481_tree = (CommonTree)adaptor.create(QUOTIENTQUOTIENT481);
            	            root_0 = (CommonTree)adaptor.becomeRoot(QUOTIENTQUOTIENT481_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:687:56: ( NL )?
            	    int alt216=2;
            	    int LA216_0 = input.LA(1);

            	    if ( (LA216_0==NL) ) {
            	        alt216=1;
            	    }
            	    switch (alt216) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:687:56: NL
            	            {
            	            NL482=(Token)match(input,NL,FOLLOW_NL_in_timestimes_expr4726); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_simple_expr_in_timestimes_expr4730);
            	    simple_expr483=simple_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, simple_expr483.getTree());

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
    // $ANTLR end "timestimes_expr"

    public static class p_timestimes_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "p_timestimes_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:689:1: p_timestimes_expr : p_simple_expr ( ( NL )? ( TIMESTIMES | QUOTIENTQUOTIENT ) ( NL )? p_simple_expr )* ;
    public final babel17Parser.p_timestimes_expr_return p_timestimes_expr() throws RecognitionException {
        babel17Parser.p_timestimes_expr_return retval = new babel17Parser.p_timestimes_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL485=null;
        Token TIMESTIMES486=null;
        Token QUOTIENTQUOTIENT487=null;
        Token NL488=null;
        babel17Parser.p_simple_expr_return p_simple_expr484 = null;

        babel17Parser.p_simple_expr_return p_simple_expr489 = null;


        CommonTree NL485_tree=null;
        CommonTree TIMESTIMES486_tree=null;
        CommonTree QUOTIENTQUOTIENT487_tree=null;
        CommonTree NL488_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:690:2: ( p_simple_expr ( ( NL )? ( TIMESTIMES | QUOTIENTQUOTIENT ) ( NL )? p_simple_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:690:4: p_simple_expr ( ( NL )? ( TIMESTIMES | QUOTIENTQUOTIENT ) ( NL )? p_simple_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_simple_expr_in_p_timestimes_expr4743);
            p_simple_expr484=p_simple_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_simple_expr484.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:690:18: ( ( NL )? ( TIMESTIMES | QUOTIENTQUOTIENT ) ( NL )? p_simple_expr )*
            loop221:
            do {
                int alt221=2;
                int LA221_0 = input.LA(1);

                if ( (LA221_0==NL) ) {
                    int LA221_1 = input.LA(2);

                    if ( ((LA221_1>=TIMESTIMES && LA221_1<=QUOTIENTQUOTIENT)) ) {
                        alt221=1;
                    }


                }
                else if ( ((LA221_0>=TIMESTIMES && LA221_0<=QUOTIENTQUOTIENT)) ) {
                    alt221=1;
                }


                switch (alt221) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:690:19: ( NL )? ( TIMESTIMES | QUOTIENTQUOTIENT ) ( NL )? p_simple_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:690:21: ( NL )?
            	    int alt218=2;
            	    int LA218_0 = input.LA(1);

            	    if ( (LA218_0==NL) ) {
            	        alt218=1;
            	    }
            	    switch (alt218) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:690:21: NL
            	            {
            	            NL485=(Token)match(input,NL,FOLLOW_NL_in_p_timestimes_expr4746); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:690:24: ( TIMESTIMES | QUOTIENTQUOTIENT )
            	    int alt219=2;
            	    int LA219_0 = input.LA(1);

            	    if ( (LA219_0==TIMESTIMES) ) {
            	        alt219=1;
            	    }
            	    else if ( (LA219_0==QUOTIENTQUOTIENT) ) {
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
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:690:25: TIMESTIMES
            	            {
            	            TIMESTIMES486=(Token)match(input,TIMESTIMES,FOLLOW_TIMESTIMES_in_p_timestimes_expr4751); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            TIMESTIMES486_tree = (CommonTree)adaptor.create(TIMESTIMES486);
            	            root_0 = (CommonTree)adaptor.becomeRoot(TIMESTIMES486_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:690:37: QUOTIENTQUOTIENT
            	            {
            	            QUOTIENTQUOTIENT487=(Token)match(input,QUOTIENTQUOTIENT,FOLLOW_QUOTIENTQUOTIENT_in_p_timestimes_expr4754); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            QUOTIENTQUOTIENT487_tree = (CommonTree)adaptor.create(QUOTIENTQUOTIENT487);
            	            root_0 = (CommonTree)adaptor.becomeRoot(QUOTIENTQUOTIENT487_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:690:58: ( NL )?
            	    int alt220=2;
            	    int LA220_0 = input.LA(1);

            	    if ( (LA220_0==NL) ) {
            	        alt220=1;
            	    }
            	    switch (alt220) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:690:58: NL
            	            {
            	            NL488=(Token)match(input,NL,FOLLOW_NL_in_p_timestimes_expr4758); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_simple_expr_in_p_timestimes_expr4762);
            	    p_simple_expr489=p_simple_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_simple_expr489.getTree());

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
    // $ANTLR end "p_timestimes_expr"

    public static class simple_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "simple_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:692:1: simple_expr : cons_expr ;
    public final babel17Parser.simple_expr_return simple_expr() throws RecognitionException {
        babel17Parser.simple_expr_return retval = new babel17Parser.simple_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.cons_expr_return cons_expr490 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:693:2: ( cons_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:693:4: cons_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_cons_expr_in_simple_expr4773);
            cons_expr490=cons_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, cons_expr490.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:695:1: p_simple_expr : p_cons_expr ;
    public final babel17Parser.p_simple_expr_return p_simple_expr() throws RecognitionException {
        babel17Parser.p_simple_expr_return retval = new babel17Parser.p_simple_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.p_cons_expr_return p_cons_expr491 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:696:2: ( p_cons_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:696:4: p_cons_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_cons_expr_in_p_simple_expr4782);
            p_cons_expr491=p_cons_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_cons_expr491.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:698:1: cons_expr : to_expr ( ( NL )? token_DOUBLE_COLON ( NL )? to_expr )* -> ^( LIST_CONS ( to_expr )* ) ;
    public final babel17Parser.cons_expr_return cons_expr() throws RecognitionException {
        babel17Parser.cons_expr_return retval = new babel17Parser.cons_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL493=null;
        Token NL495=null;
        babel17Parser.to_expr_return to_expr492 = null;

        babel17Parser.token_DOUBLE_COLON_return token_DOUBLE_COLON494 = null;

        babel17Parser.to_expr_return to_expr496 = null;


        CommonTree NL493_tree=null;
        CommonTree NL495_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_token_DOUBLE_COLON=new RewriteRuleSubtreeStream(adaptor,"rule token_DOUBLE_COLON");
        RewriteRuleSubtreeStream stream_to_expr=new RewriteRuleSubtreeStream(adaptor,"rule to_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:699:2: ( to_expr ( ( NL )? token_DOUBLE_COLON ( NL )? to_expr )* -> ^( LIST_CONS ( to_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:699:4: to_expr ( ( NL )? token_DOUBLE_COLON ( NL )? to_expr )*
            {
            pushFollow(FOLLOW_to_expr_in_cons_expr4791);
            to_expr492=to_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_to_expr.add(to_expr492.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:699:12: ( ( NL )? token_DOUBLE_COLON ( NL )? to_expr )*
            loop224:
            do {
                int alt224=2;
                int LA224_0 = input.LA(1);

                if ( (LA224_0==NL) ) {
                    int LA224_1 = input.LA(2);

                    if ( ((LA224_1>=A_DOUBLE_COLON && LA224_1<=U_DOUBLE_COLON)) ) {
                        alt224=1;
                    }


                }
                else if ( ((LA224_0>=A_DOUBLE_COLON && LA224_0<=U_DOUBLE_COLON)) ) {
                    alt224=1;
                }


                switch (alt224) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:699:13: ( NL )? token_DOUBLE_COLON ( NL )? to_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:699:13: ( NL )?
            	    int alt222=2;
            	    int LA222_0 = input.LA(1);

            	    if ( (LA222_0==NL) ) {
            	        alt222=1;
            	    }
            	    switch (alt222) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:699:13: NL
            	            {
            	            NL493=(Token)match(input,NL,FOLLOW_NL_in_cons_expr4794); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL493);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_token_DOUBLE_COLON_in_cons_expr4797);
            	    token_DOUBLE_COLON494=token_DOUBLE_COLON();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_token_DOUBLE_COLON.add(token_DOUBLE_COLON494.getTree());
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:699:36: ( NL )?
            	    int alt223=2;
            	    int LA223_0 = input.LA(1);

            	    if ( (LA223_0==NL) ) {
            	        alt223=1;
            	    }
            	    switch (alt223) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:699:36: NL
            	            {
            	            NL495=(Token)match(input,NL,FOLLOW_NL_in_cons_expr4799); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL495);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_to_expr_in_cons_expr4802);
            	    to_expr496=to_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_to_expr.add(to_expr496.getTree());

            	    }
            	    break;

            	default :
            	    break loop224;
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
            // 699:50: -> ^( LIST_CONS ( to_expr )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:699:53: ^( LIST_CONS ( to_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LIST_CONS, "LIST_CONS"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:699:65: ( to_expr )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:701:1: p_cons_expr : p_to_expr ( ( NL )? token_DOUBLE_COLON ( NL )? p_to_expr )* -> ^( LIST_CONS ( p_to_expr )* ) ;
    public final babel17Parser.p_cons_expr_return p_cons_expr() throws RecognitionException {
        babel17Parser.p_cons_expr_return retval = new babel17Parser.p_cons_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL498=null;
        Token NL500=null;
        babel17Parser.p_to_expr_return p_to_expr497 = null;

        babel17Parser.token_DOUBLE_COLON_return token_DOUBLE_COLON499 = null;

        babel17Parser.p_to_expr_return p_to_expr501 = null;


        CommonTree NL498_tree=null;
        CommonTree NL500_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_p_to_expr=new RewriteRuleSubtreeStream(adaptor,"rule p_to_expr");
        RewriteRuleSubtreeStream stream_token_DOUBLE_COLON=new RewriteRuleSubtreeStream(adaptor,"rule token_DOUBLE_COLON");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:702:2: ( p_to_expr ( ( NL )? token_DOUBLE_COLON ( NL )? p_to_expr )* -> ^( LIST_CONS ( p_to_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:702:4: p_to_expr ( ( NL )? token_DOUBLE_COLON ( NL )? p_to_expr )*
            {
            pushFollow(FOLLOW_p_to_expr_in_p_cons_expr4822);
            p_to_expr497=p_to_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_p_to_expr.add(p_to_expr497.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:702:14: ( ( NL )? token_DOUBLE_COLON ( NL )? p_to_expr )*
            loop227:
            do {
                int alt227=2;
                int LA227_0 = input.LA(1);

                if ( (LA227_0==NL) ) {
                    int LA227_1 = input.LA(2);

                    if ( ((LA227_1>=A_DOUBLE_COLON && LA227_1<=U_DOUBLE_COLON)) ) {
                        alt227=1;
                    }


                }
                else if ( ((LA227_0>=A_DOUBLE_COLON && LA227_0<=U_DOUBLE_COLON)) ) {
                    alt227=1;
                }


                switch (alt227) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:702:15: ( NL )? token_DOUBLE_COLON ( NL )? p_to_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:702:15: ( NL )?
            	    int alt225=2;
            	    int LA225_0 = input.LA(1);

            	    if ( (LA225_0==NL) ) {
            	        alt225=1;
            	    }
            	    switch (alt225) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:702:15: NL
            	            {
            	            NL498=(Token)match(input,NL,FOLLOW_NL_in_p_cons_expr4825); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL498);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_token_DOUBLE_COLON_in_p_cons_expr4828);
            	    token_DOUBLE_COLON499=token_DOUBLE_COLON();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_token_DOUBLE_COLON.add(token_DOUBLE_COLON499.getTree());
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:702:38: ( NL )?
            	    int alt226=2;
            	    int LA226_0 = input.LA(1);

            	    if ( (LA226_0==NL) ) {
            	        alt226=1;
            	    }
            	    switch (alt226) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:702:38: NL
            	            {
            	            NL500=(Token)match(input,NL,FOLLOW_NL_in_p_cons_expr4830); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL500);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_to_expr_in_p_cons_expr4833);
            	    p_to_expr501=p_to_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_p_to_expr.add(p_to_expr501.getTree());

            	    }
            	    break;

            	default :
            	    break loop227;
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
            // 702:54: -> ^( LIST_CONS ( p_to_expr )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:702:57: ^( LIST_CONS ( p_to_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LIST_CONS, "LIST_CONS"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:702:69: ( p_to_expr )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:705:1: to_expr : arith_plus_expr ( ( NL )? ( L_to | L_downto ) ( NL )? arith_plus_expr )? ;
    public final babel17Parser.to_expr_return to_expr() throws RecognitionException {
        babel17Parser.to_expr_return retval = new babel17Parser.to_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL503=null;
        Token L_to504=null;
        Token L_downto505=null;
        Token NL506=null;
        babel17Parser.arith_plus_expr_return arith_plus_expr502 = null;

        babel17Parser.arith_plus_expr_return arith_plus_expr507 = null;


        CommonTree NL503_tree=null;
        CommonTree L_to504_tree=null;
        CommonTree L_downto505_tree=null;
        CommonTree NL506_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:705:9: ( arith_plus_expr ( ( NL )? ( L_to | L_downto ) ( NL )? arith_plus_expr )? )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:705:11: arith_plus_expr ( ( NL )? ( L_to | L_downto ) ( NL )? arith_plus_expr )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_arith_plus_expr_in_to_expr4853);
            arith_plus_expr502=arith_plus_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, arith_plus_expr502.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:705:27: ( ( NL )? ( L_to | L_downto ) ( NL )? arith_plus_expr )?
            int alt231=2;
            int LA231_0 = input.LA(1);

            if ( (LA231_0==NL) ) {
                int LA231_1 = input.LA(2);

                if ( ((LA231_1>=L_to && LA231_1<=L_downto)) ) {
                    alt231=1;
                }
            }
            else if ( ((LA231_0>=L_to && LA231_0<=L_downto)) ) {
                alt231=1;
            }
            switch (alt231) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:705:28: ( NL )? ( L_to | L_downto ) ( NL )? arith_plus_expr
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:705:30: ( NL )?
                    int alt228=2;
                    int LA228_0 = input.LA(1);

                    if ( (LA228_0==NL) ) {
                        alt228=1;
                    }
                    switch (alt228) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:705:30: NL
                            {
                            NL503=(Token)match(input,NL,FOLLOW_NL_in_to_expr4856); if (state.failed) return retval;

                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:705:33: ( L_to | L_downto )
                    int alt229=2;
                    int LA229_0 = input.LA(1);

                    if ( (LA229_0==L_to) ) {
                        alt229=1;
                    }
                    else if ( (LA229_0==L_downto) ) {
                        alt229=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 229, 0, input);

                        throw nvae;
                    }
                    switch (alt229) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:705:34: L_to
                            {
                            L_to504=(Token)match(input,L_to,FOLLOW_L_to_in_to_expr4861); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            L_to504_tree = (CommonTree)adaptor.create(L_to504);
                            root_0 = (CommonTree)adaptor.becomeRoot(L_to504_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:705:41: L_downto
                            {
                            L_downto505=(Token)match(input,L_downto,FOLLOW_L_downto_in_to_expr4865); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            L_downto505_tree = (CommonTree)adaptor.create(L_downto505);
                            root_0 = (CommonTree)adaptor.becomeRoot(L_downto505_tree, root_0);
                            }

                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:705:54: ( NL )?
                    int alt230=2;
                    int LA230_0 = input.LA(1);

                    if ( (LA230_0==NL) ) {
                        alt230=1;
                    }
                    switch (alt230) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:705:54: NL
                            {
                            NL506=(Token)match(input,NL,FOLLOW_NL_in_to_expr4869); if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_arith_plus_expr_in_to_expr4873);
                    arith_plus_expr507=arith_plus_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arith_plus_expr507.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:707:1: p_to_expr : p_arith_plus_expr ( ( NL )? ( L_to | L_downto ) ( NL )? p_arith_plus_expr )? ;
    public final babel17Parser.p_to_expr_return p_to_expr() throws RecognitionException {
        babel17Parser.p_to_expr_return retval = new babel17Parser.p_to_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL509=null;
        Token L_to510=null;
        Token L_downto511=null;
        Token NL512=null;
        babel17Parser.p_arith_plus_expr_return p_arith_plus_expr508 = null;

        babel17Parser.p_arith_plus_expr_return p_arith_plus_expr513 = null;


        CommonTree NL509_tree=null;
        CommonTree L_to510_tree=null;
        CommonTree L_downto511_tree=null;
        CommonTree NL512_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:708:2: ( p_arith_plus_expr ( ( NL )? ( L_to | L_downto ) ( NL )? p_arith_plus_expr )? )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:708:4: p_arith_plus_expr ( ( NL )? ( L_to | L_downto ) ( NL )? p_arith_plus_expr )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_arith_plus_expr_in_p_to_expr4886);
            p_arith_plus_expr508=p_arith_plus_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_arith_plus_expr508.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:708:22: ( ( NL )? ( L_to | L_downto ) ( NL )? p_arith_plus_expr )?
            int alt235=2;
            int LA235_0 = input.LA(1);

            if ( (LA235_0==NL) ) {
                int LA235_1 = input.LA(2);

                if ( ((LA235_1>=L_to && LA235_1<=L_downto)) ) {
                    alt235=1;
                }
            }
            else if ( ((LA235_0>=L_to && LA235_0<=L_downto)) ) {
                alt235=1;
            }
            switch (alt235) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:708:23: ( NL )? ( L_to | L_downto ) ( NL )? p_arith_plus_expr
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:708:25: ( NL )?
                    int alt232=2;
                    int LA232_0 = input.LA(1);

                    if ( (LA232_0==NL) ) {
                        alt232=1;
                    }
                    switch (alt232) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:708:25: NL
                            {
                            NL509=(Token)match(input,NL,FOLLOW_NL_in_p_to_expr4889); if (state.failed) return retval;

                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:708:28: ( L_to | L_downto )
                    int alt233=2;
                    int LA233_0 = input.LA(1);

                    if ( (LA233_0==L_to) ) {
                        alt233=1;
                    }
                    else if ( (LA233_0==L_downto) ) {
                        alt233=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 233, 0, input);

                        throw nvae;
                    }
                    switch (alt233) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:708:29: L_to
                            {
                            L_to510=(Token)match(input,L_to,FOLLOW_L_to_in_p_to_expr4894); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            L_to510_tree = (CommonTree)adaptor.create(L_to510);
                            root_0 = (CommonTree)adaptor.becomeRoot(L_to510_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:708:36: L_downto
                            {
                            L_downto511=(Token)match(input,L_downto,FOLLOW_L_downto_in_p_to_expr4898); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            L_downto511_tree = (CommonTree)adaptor.create(L_downto511);
                            root_0 = (CommonTree)adaptor.becomeRoot(L_downto511_tree, root_0);
                            }

                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:708:49: ( NL )?
                    int alt234=2;
                    int LA234_0 = input.LA(1);

                    if ( (LA234_0==NL) ) {
                        alt234=1;
                    }
                    switch (alt234) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:708:49: NL
                            {
                            NL512=(Token)match(input,NL,FOLLOW_NL_in_p_to_expr4902); if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_p_arith_plus_expr_in_p_to_expr4906);
                    p_arith_plus_expr513=p_arith_plus_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_arith_plus_expr513.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:710:1: arith_plus_expr : arith_uminus_expr ( ( ( NL )? PLUS | MINUS ) ( NL )? arith_uminus_expr )* ;
    public final babel17Parser.arith_plus_expr_return arith_plus_expr() throws RecognitionException {
        babel17Parser.arith_plus_expr_return retval = new babel17Parser.arith_plus_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL515=null;
        Token PLUS516=null;
        Token MINUS517=null;
        Token NL518=null;
        babel17Parser.arith_uminus_expr_return arith_uminus_expr514 = null;

        babel17Parser.arith_uminus_expr_return arith_uminus_expr519 = null;


        CommonTree NL515_tree=null;
        CommonTree PLUS516_tree=null;
        CommonTree MINUS517_tree=null;
        CommonTree NL518_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:711:2: ( arith_uminus_expr ( ( ( NL )? PLUS | MINUS ) ( NL )? arith_uminus_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:711:4: arith_uminus_expr ( ( ( NL )? PLUS | MINUS ) ( NL )? arith_uminus_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_arith_uminus_expr_in_arith_plus_expr4918);
            arith_uminus_expr514=arith_uminus_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, arith_uminus_expr514.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:711:22: ( ( ( NL )? PLUS | MINUS ) ( NL )? arith_uminus_expr )*
            loop239:
            do {
                int alt239=2;
                int LA239_0 = input.LA(1);

                if ( (LA239_0==NL) ) {
                    int LA239_1 = input.LA(2);

                    if ( (LA239_1==PLUS) ) {
                        alt239=1;
                    }


                }
                else if ( ((LA239_0>=PLUS && LA239_0<=MINUS)) ) {
                    alt239=1;
                }


                switch (alt239) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:711:23: ( ( NL )? PLUS | MINUS ) ( NL )? arith_uminus_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:711:23: ( ( NL )? PLUS | MINUS )
            	    int alt237=2;
            	    int LA237_0 = input.LA(1);

            	    if ( (LA237_0==PLUS||LA237_0==NL) ) {
            	        alt237=1;
            	    }
            	    else if ( (LA237_0==MINUS) ) {
            	        alt237=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 237, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt237) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:711:24: ( NL )? PLUS
            	            {
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:711:26: ( NL )?
            	            int alt236=2;
            	            int LA236_0 = input.LA(1);

            	            if ( (LA236_0==NL) ) {
            	                alt236=1;
            	            }
            	            switch (alt236) {
            	                case 1 :
            	                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:711:26: NL
            	                    {
            	                    NL515=(Token)match(input,NL,FOLLOW_NL_in_arith_plus_expr4922); if (state.failed) return retval;

            	                    }
            	                    break;

            	            }

            	            PLUS516=(Token)match(input,PLUS,FOLLOW_PLUS_in_arith_plus_expr4926); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PLUS516_tree = (CommonTree)adaptor.create(PLUS516);
            	            root_0 = (CommonTree)adaptor.becomeRoot(PLUS516_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:711:37: MINUS
            	            {
            	            MINUS517=(Token)match(input,MINUS,FOLLOW_MINUS_in_arith_plus_expr4931); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            MINUS517_tree = (CommonTree)adaptor.create(MINUS517);
            	            root_0 = (CommonTree)adaptor.becomeRoot(MINUS517_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:711:47: ( NL )?
            	    int alt238=2;
            	    int LA238_0 = input.LA(1);

            	    if ( (LA238_0==NL) ) {
            	        alt238=1;
            	    }
            	    switch (alt238) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:711:47: NL
            	            {
            	            NL518=(Token)match(input,NL,FOLLOW_NL_in_arith_plus_expr4935); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_arith_uminus_expr_in_arith_plus_expr4939);
            	    arith_uminus_expr519=arith_uminus_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, arith_uminus_expr519.getTree());

            	    }
            	    break;

            	default :
            	    break loop239;
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:713:1: p_arith_plus_expr : p_arith_uminus_expr ( ( NL )? ( PLUS | MINUS ) ( NL )? p_arith_uminus_expr )* ;
    public final babel17Parser.p_arith_plus_expr_return p_arith_plus_expr() throws RecognitionException {
        babel17Parser.p_arith_plus_expr_return retval = new babel17Parser.p_arith_plus_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL521=null;
        Token set522=null;
        Token NL523=null;
        babel17Parser.p_arith_uminus_expr_return p_arith_uminus_expr520 = null;

        babel17Parser.p_arith_uminus_expr_return p_arith_uminus_expr524 = null;


        CommonTree NL521_tree=null;
        CommonTree set522_tree=null;
        CommonTree NL523_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:714:2: ( p_arith_uminus_expr ( ( NL )? ( PLUS | MINUS ) ( NL )? p_arith_uminus_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:714:4: p_arith_uminus_expr ( ( NL )? ( PLUS | MINUS ) ( NL )? p_arith_uminus_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_arith_uminus_expr_in_p_arith_plus_expr4950);
            p_arith_uminus_expr520=p_arith_uminus_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_arith_uminus_expr520.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:714:24: ( ( NL )? ( PLUS | MINUS ) ( NL )? p_arith_uminus_expr )*
            loop242:
            do {
                int alt242=2;
                int LA242_0 = input.LA(1);

                if ( (LA242_0==NL) ) {
                    int LA242_1 = input.LA(2);

                    if ( ((LA242_1>=PLUS && LA242_1<=MINUS)) ) {
                        alt242=1;
                    }


                }
                else if ( ((LA242_0>=PLUS && LA242_0<=MINUS)) ) {
                    alt242=1;
                }


                switch (alt242) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:714:25: ( NL )? ( PLUS | MINUS ) ( NL )? p_arith_uminus_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:714:27: ( NL )?
            	    int alt240=2;
            	    int LA240_0 = input.LA(1);

            	    if ( (LA240_0==NL) ) {
            	        alt240=1;
            	    }
            	    switch (alt240) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:714:27: NL
            	            {
            	            NL521=(Token)match(input,NL,FOLLOW_NL_in_p_arith_plus_expr4953); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    set522=(Token)input.LT(1);
            	    set522=(Token)input.LT(1);
            	    if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set522), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:714:48: ( NL )?
            	    int alt241=2;
            	    int LA241_0 = input.LA(1);

            	    if ( (LA241_0==NL) ) {
            	        alt241=1;
            	    }
            	    switch (alt241) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:714:48: NL
            	            {
            	            NL523=(Token)match(input,NL,FOLLOW_NL_in_p_arith_plus_expr4966); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_arith_uminus_expr_in_p_arith_plus_expr4970);
            	    p_arith_uminus_expr524=p_arith_uminus_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_arith_uminus_expr524.getTree());

            	    }
            	    break;

            	default :
            	    break loop242;
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:716:1: arith_uminus_expr : ( MINUS ( NL )? arith_mult_expr -> ^( UMINUS arith_mult_expr ) | arith_mult_expr );
    public final babel17Parser.arith_uminus_expr_return arith_uminus_expr() throws RecognitionException {
        babel17Parser.arith_uminus_expr_return retval = new babel17Parser.arith_uminus_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token MINUS525=null;
        Token NL526=null;
        babel17Parser.arith_mult_expr_return arith_mult_expr527 = null;

        babel17Parser.arith_mult_expr_return arith_mult_expr528 = null;


        CommonTree MINUS525_tree=null;
        CommonTree NL526_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleSubtreeStream stream_arith_mult_expr=new RewriteRuleSubtreeStream(adaptor,"rule arith_mult_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:717:2: ( MINUS ( NL )? arith_mult_expr -> ^( UMINUS arith_mult_expr ) | arith_mult_expr )
            int alt244=2;
            int LA244_0 = input.LA(1);

            if ( (LA244_0==MINUS) ) {
                alt244=1;
            }
            else if ( (LA244_0==L_begin||(LA244_0>=L_with && LA244_0<=L_if)||(LA244_0>=L_while && LA244_0<=L_for)||LA244_0==L_match||LA244_0==L_try||(LA244_0>=A_infinity && LA244_0<=U_infinity)||(LA244_0>=L_true && LA244_0<=L_this)||LA244_0==L_nil||(LA244_0>=Constr && LA244_0<=Num)||(LA244_0>=String && LA244_0<=ROUND_BRACKET_OPEN)||LA244_0==SQUARE_BRACKET_OPEN||LA244_0==CURLY_BRACKET_OPEN) ) {
                alt244=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 244, 0, input);

                throw nvae;
            }
            switch (alt244) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:717:4: MINUS ( NL )? arith_mult_expr
                    {
                    MINUS525=(Token)match(input,MINUS,FOLLOW_MINUS_in_arith_uminus_expr4983); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(MINUS525);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:717:10: ( NL )?
                    int alt243=2;
                    int LA243_0 = input.LA(1);

                    if ( (LA243_0==NL) ) {
                        alt243=1;
                    }
                    switch (alt243) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:717:10: NL
                            {
                            NL526=(Token)match(input,NL,FOLLOW_NL_in_arith_uminus_expr4985); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL526);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_arith_mult_expr_in_arith_uminus_expr4988);
                    arith_mult_expr527=arith_mult_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_arith_mult_expr.add(arith_mult_expr527.getTree());


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
                    // 717:30: -> ^( UMINUS arith_mult_expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:717:33: ^( UMINUS arith_mult_expr )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:718:4: arith_mult_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_arith_mult_expr_in_arith_uminus_expr5001);
                    arith_mult_expr528=arith_mult_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arith_mult_expr528.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:720:1: p_arith_uminus_expr : ( MINUS ( NL )? p_arith_mult_expr -> ^( UMINUS p_arith_mult_expr ) | p_arith_mult_expr );
    public final babel17Parser.p_arith_uminus_expr_return p_arith_uminus_expr() throws RecognitionException {
        babel17Parser.p_arith_uminus_expr_return retval = new babel17Parser.p_arith_uminus_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token MINUS529=null;
        Token NL530=null;
        babel17Parser.p_arith_mult_expr_return p_arith_mult_expr531 = null;

        babel17Parser.p_arith_mult_expr_return p_arith_mult_expr532 = null;


        CommonTree MINUS529_tree=null;
        CommonTree NL530_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleSubtreeStream stream_p_arith_mult_expr=new RewriteRuleSubtreeStream(adaptor,"rule p_arith_mult_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:721:2: ( MINUS ( NL )? p_arith_mult_expr -> ^( UMINUS p_arith_mult_expr ) | p_arith_mult_expr )
            int alt246=2;
            int LA246_0 = input.LA(1);

            if ( (LA246_0==MINUS) ) {
                alt246=1;
            }
            else if ( (LA246_0==L_begin||(LA246_0>=L_with && LA246_0<=L_if)||(LA246_0>=L_while && LA246_0<=L_for)||LA246_0==L_match||LA246_0==L_try||(LA246_0>=A_infinity && LA246_0<=U_infinity)||(LA246_0>=L_true && LA246_0<=L_this)||LA246_0==L_nil||(LA246_0>=Constr && LA246_0<=Num)||(LA246_0>=String && LA246_0<=ROUND_BRACKET_OPEN)||LA246_0==SQUARE_BRACKET_OPEN||LA246_0==CURLY_BRACKET_OPEN) ) {
                alt246=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 246, 0, input);

                throw nvae;
            }
            switch (alt246) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:721:4: MINUS ( NL )? p_arith_mult_expr
                    {
                    MINUS529=(Token)match(input,MINUS,FOLLOW_MINUS_in_p_arith_uminus_expr5012); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(MINUS529);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:721:10: ( NL )?
                    int alt245=2;
                    int LA245_0 = input.LA(1);

                    if ( (LA245_0==NL) ) {
                        alt245=1;
                    }
                    switch (alt245) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:721:10: NL
                            {
                            NL530=(Token)match(input,NL,FOLLOW_NL_in_p_arith_uminus_expr5014); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL530);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_p_arith_mult_expr_in_p_arith_uminus_expr5017);
                    p_arith_mult_expr531=p_arith_mult_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_p_arith_mult_expr.add(p_arith_mult_expr531.getTree());


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
                    // 721:32: -> ^( UMINUS p_arith_mult_expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:721:35: ^( UMINUS p_arith_mult_expr )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:722:4: p_arith_mult_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_p_arith_mult_expr_in_p_arith_uminus_expr5030);
                    p_arith_mult_expr532=p_arith_mult_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_arith_mult_expr532.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:724:1: arith_mult_expr : arith_pow_expr ( ( NL )? ( TIMES | QUOTIENT | L_div | L_mod ) ( NL )? arith_pow_expr )* ;
    public final babel17Parser.arith_mult_expr_return arith_mult_expr() throws RecognitionException {
        babel17Parser.arith_mult_expr_return retval = new babel17Parser.arith_mult_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL534=null;
        Token set535=null;
        Token NL536=null;
        babel17Parser.arith_pow_expr_return arith_pow_expr533 = null;

        babel17Parser.arith_pow_expr_return arith_pow_expr537 = null;


        CommonTree NL534_tree=null;
        CommonTree set535_tree=null;
        CommonTree NL536_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:725:2: ( arith_pow_expr ( ( NL )? ( TIMES | QUOTIENT | L_div | L_mod ) ( NL )? arith_pow_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:725:4: arith_pow_expr ( ( NL )? ( TIMES | QUOTIENT | L_div | L_mod ) ( NL )? arith_pow_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_arith_pow_expr_in_arith_mult_expr5039);
            arith_pow_expr533=arith_pow_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, arith_pow_expr533.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:725:19: ( ( NL )? ( TIMES | QUOTIENT | L_div | L_mod ) ( NL )? arith_pow_expr )*
            loop249:
            do {
                int alt249=2;
                int LA249_0 = input.LA(1);

                if ( (LA249_0==NL) ) {
                    int LA249_1 = input.LA(2);

                    if ( ((LA249_1>=L_div && LA249_1<=L_mod)||(LA249_1>=TIMES && LA249_1<=QUOTIENT)) ) {
                        alt249=1;
                    }


                }
                else if ( ((LA249_0>=L_div && LA249_0<=L_mod)||(LA249_0>=TIMES && LA249_0<=QUOTIENT)) ) {
                    alt249=1;
                }


                switch (alt249) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:725:20: ( NL )? ( TIMES | QUOTIENT | L_div | L_mod ) ( NL )? arith_pow_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:725:22: ( NL )?
            	    int alt247=2;
            	    int LA247_0 = input.LA(1);

            	    if ( (LA247_0==NL) ) {
            	        alt247=1;
            	    }
            	    switch (alt247) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:725:22: NL
            	            {
            	            NL534=(Token)match(input,NL,FOLLOW_NL_in_arith_mult_expr5042); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    set535=(Token)input.LT(1);
            	    set535=(Token)input.LT(1);
            	    if ( (input.LA(1)>=L_div && input.LA(1)<=L_mod)||(input.LA(1)>=TIMES && input.LA(1)<=QUOTIENT) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set535), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:725:63: ( NL )?
            	    int alt248=2;
            	    int LA248_0 = input.LA(1);

            	    if ( (LA248_0==NL) ) {
            	        alt248=1;
            	    }
            	    switch (alt248) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:725:63: NL
            	            {
            	            NL536=(Token)match(input,NL,FOLLOW_NL_in_arith_mult_expr5063); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_arith_pow_expr_in_arith_mult_expr5067);
            	    arith_pow_expr537=arith_pow_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, arith_pow_expr537.getTree());

            	    }
            	    break;

            	default :
            	    break loop249;
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:727:1: p_arith_mult_expr : p_arith_pow_expr ( ( NL )? ( TIMES | QUOTIENT | L_div | L_mod ) ( NL )? p_arith_pow_expr )* ;
    public final babel17Parser.p_arith_mult_expr_return p_arith_mult_expr() throws RecognitionException {
        babel17Parser.p_arith_mult_expr_return retval = new babel17Parser.p_arith_mult_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL539=null;
        Token set540=null;
        Token NL541=null;
        babel17Parser.p_arith_pow_expr_return p_arith_pow_expr538 = null;

        babel17Parser.p_arith_pow_expr_return p_arith_pow_expr542 = null;


        CommonTree NL539_tree=null;
        CommonTree set540_tree=null;
        CommonTree NL541_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:728:2: ( p_arith_pow_expr ( ( NL )? ( TIMES | QUOTIENT | L_div | L_mod ) ( NL )? p_arith_pow_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:728:4: p_arith_pow_expr ( ( NL )? ( TIMES | QUOTIENT | L_div | L_mod ) ( NL )? p_arith_pow_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_arith_pow_expr_in_p_arith_mult_expr5079);
            p_arith_pow_expr538=p_arith_pow_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_arith_pow_expr538.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:728:21: ( ( NL )? ( TIMES | QUOTIENT | L_div | L_mod ) ( NL )? p_arith_pow_expr )*
            loop252:
            do {
                int alt252=2;
                int LA252_0 = input.LA(1);

                if ( (LA252_0==NL) ) {
                    int LA252_1 = input.LA(2);

                    if ( ((LA252_1>=L_div && LA252_1<=L_mod)||(LA252_1>=TIMES && LA252_1<=QUOTIENT)) ) {
                        alt252=1;
                    }


                }
                else if ( ((LA252_0>=L_div && LA252_0<=L_mod)||(LA252_0>=TIMES && LA252_0<=QUOTIENT)) ) {
                    alt252=1;
                }


                switch (alt252) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:728:22: ( NL )? ( TIMES | QUOTIENT | L_div | L_mod ) ( NL )? p_arith_pow_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:728:24: ( NL )?
            	    int alt250=2;
            	    int LA250_0 = input.LA(1);

            	    if ( (LA250_0==NL) ) {
            	        alt250=1;
            	    }
            	    switch (alt250) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:728:24: NL
            	            {
            	            NL539=(Token)match(input,NL,FOLLOW_NL_in_p_arith_mult_expr5082); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    set540=(Token)input.LT(1);
            	    set540=(Token)input.LT(1);
            	    if ( (input.LA(1)>=L_div && input.LA(1)<=L_mod)||(input.LA(1)>=TIMES && input.LA(1)<=QUOTIENT) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set540), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:728:65: ( NL )?
            	    int alt251=2;
            	    int LA251_0 = input.LA(1);

            	    if ( (LA251_0==NL) ) {
            	        alt251=1;
            	    }
            	    switch (alt251) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:728:65: NL
            	            {
            	            NL541=(Token)match(input,NL,FOLLOW_NL_in_p_arith_mult_expr5103); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_arith_pow_expr_in_p_arith_mult_expr5107);
            	    p_arith_pow_expr542=p_arith_pow_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_arith_pow_expr542.getTree());

            	    }
            	    break;

            	default :
            	    break loop252;
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:730:1: arith_pow_expr : apply_expr ( ( NL )? POW_tok ( NL )? apply_expr )* -> ^( POW ( apply_expr )* ) ;
    public final babel17Parser.arith_pow_expr_return arith_pow_expr() throws RecognitionException {
        babel17Parser.arith_pow_expr_return retval = new babel17Parser.arith_pow_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL544=null;
        Token POW_tok545=null;
        Token NL546=null;
        babel17Parser.apply_expr_return apply_expr543 = null;

        babel17Parser.apply_expr_return apply_expr547 = null;


        CommonTree NL544_tree=null;
        CommonTree POW_tok545_tree=null;
        CommonTree NL546_tree=null;
        RewriteRuleTokenStream stream_POW_tok=new RewriteRuleTokenStream(adaptor,"token POW_tok");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_apply_expr=new RewriteRuleSubtreeStream(adaptor,"rule apply_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:731:2: ( apply_expr ( ( NL )? POW_tok ( NL )? apply_expr )* -> ^( POW ( apply_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:731:4: apply_expr ( ( NL )? POW_tok ( NL )? apply_expr )*
            {
            pushFollow(FOLLOW_apply_expr_in_arith_pow_expr5118);
            apply_expr543=apply_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_apply_expr.add(apply_expr543.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:731:15: ( ( NL )? POW_tok ( NL )? apply_expr )*
            loop255:
            do {
                int alt255=2;
                int LA255_0 = input.LA(1);

                if ( (LA255_0==NL) ) {
                    int LA255_1 = input.LA(2);

                    if ( (LA255_1==POW_tok) ) {
                        alt255=1;
                    }


                }
                else if ( (LA255_0==POW_tok) ) {
                    alt255=1;
                }


                switch (alt255) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:731:16: ( NL )? POW_tok ( NL )? apply_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:731:16: ( NL )?
            	    int alt253=2;
            	    int LA253_0 = input.LA(1);

            	    if ( (LA253_0==NL) ) {
            	        alt253=1;
            	    }
            	    switch (alt253) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:731:16: NL
            	            {
            	            NL544=(Token)match(input,NL,FOLLOW_NL_in_arith_pow_expr5121); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL544);


            	            }
            	            break;

            	    }

            	    POW_tok545=(Token)match(input,POW_tok,FOLLOW_POW_tok_in_arith_pow_expr5124); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_POW_tok.add(POW_tok545);

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:731:28: ( NL )?
            	    int alt254=2;
            	    int LA254_0 = input.LA(1);

            	    if ( (LA254_0==NL) ) {
            	        alt254=1;
            	    }
            	    switch (alt254) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:731:28: NL
            	            {
            	            NL546=(Token)match(input,NL,FOLLOW_NL_in_arith_pow_expr5126); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL546);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_apply_expr_in_arith_pow_expr5129);
            	    apply_expr547=apply_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_apply_expr.add(apply_expr547.getTree());

            	    }
            	    break;

            	default :
            	    break loop255;
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
            // 731:45: -> ^( POW ( apply_expr )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:731:48: ^( POW ( apply_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(POW, "POW"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:731:54: ( apply_expr )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:733:1: p_arith_pow_expr : p_apply_expr ( ( NL )? POW_tok ( NL )? p_apply_expr )* -> ^( POW ( p_apply_expr )* ) ;
    public final babel17Parser.p_arith_pow_expr_return p_arith_pow_expr() throws RecognitionException {
        babel17Parser.p_arith_pow_expr_return retval = new babel17Parser.p_arith_pow_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL549=null;
        Token POW_tok550=null;
        Token NL551=null;
        babel17Parser.p_apply_expr_return p_apply_expr548 = null;

        babel17Parser.p_apply_expr_return p_apply_expr552 = null;


        CommonTree NL549_tree=null;
        CommonTree POW_tok550_tree=null;
        CommonTree NL551_tree=null;
        RewriteRuleTokenStream stream_POW_tok=new RewriteRuleTokenStream(adaptor,"token POW_tok");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_p_apply_expr=new RewriteRuleSubtreeStream(adaptor,"rule p_apply_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:734:2: ( p_apply_expr ( ( NL )? POW_tok ( NL )? p_apply_expr )* -> ^( POW ( p_apply_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:734:4: p_apply_expr ( ( NL )? POW_tok ( NL )? p_apply_expr )*
            {
            pushFollow(FOLLOW_p_apply_expr_in_p_arith_pow_expr5150);
            p_apply_expr548=p_apply_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_p_apply_expr.add(p_apply_expr548.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:734:17: ( ( NL )? POW_tok ( NL )? p_apply_expr )*
            loop258:
            do {
                int alt258=2;
                int LA258_0 = input.LA(1);

                if ( (LA258_0==NL) ) {
                    int LA258_1 = input.LA(2);

                    if ( (LA258_1==POW_tok) ) {
                        alt258=1;
                    }


                }
                else if ( (LA258_0==POW_tok) ) {
                    alt258=1;
                }


                switch (alt258) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:734:18: ( NL )? POW_tok ( NL )? p_apply_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:734:18: ( NL )?
            	    int alt256=2;
            	    int LA256_0 = input.LA(1);

            	    if ( (LA256_0==NL) ) {
            	        alt256=1;
            	    }
            	    switch (alt256) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:734:18: NL
            	            {
            	            NL549=(Token)match(input,NL,FOLLOW_NL_in_p_arith_pow_expr5153); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL549);


            	            }
            	            break;

            	    }

            	    POW_tok550=(Token)match(input,POW_tok,FOLLOW_POW_tok_in_p_arith_pow_expr5156); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_POW_tok.add(POW_tok550);

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:734:30: ( NL )?
            	    int alt257=2;
            	    int LA257_0 = input.LA(1);

            	    if ( (LA257_0==NL) ) {
            	        alt257=1;
            	    }
            	    switch (alt257) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:734:30: NL
            	            {
            	            NL551=(Token)match(input,NL,FOLLOW_NL_in_p_arith_pow_expr5158); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL551);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_apply_expr_in_p_arith_pow_expr5161);
            	    p_apply_expr552=p_apply_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_p_apply_expr.add(p_apply_expr552.getTree());

            	    }
            	    break;

            	default :
            	    break loop258;
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
            // 734:49: -> ^( POW ( p_apply_expr )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:734:52: ^( POW ( p_apply_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(POW, "POW"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:734:58: ( p_apply_expr )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:736:1: apply_expr : ( basic_expr )+ -> ^( APPLY ( basic_expr )* ) ;
    public final babel17Parser.apply_expr_return apply_expr() throws RecognitionException {
        babel17Parser.apply_expr_return retval = new babel17Parser.apply_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.basic_expr_return basic_expr553 = null;


        RewriteRuleSubtreeStream stream_basic_expr=new RewriteRuleSubtreeStream(adaptor,"rule basic_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:737:2: ( ( basic_expr )+ -> ^( APPLY ( basic_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:737:4: ( basic_expr )+
            {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:737:4: ( basic_expr )+
            int cnt259=0;
            loop259:
            do {
                int alt259=2;
                int LA259_0 = input.LA(1);

                if ( (LA259_0==L_begin||(LA259_0>=L_with && LA259_0<=L_if)||(LA259_0>=L_while && LA259_0<=L_for)||LA259_0==L_match||LA259_0==L_try||(LA259_0>=A_infinity && LA259_0<=U_infinity)||(LA259_0>=L_true && LA259_0<=L_this)||LA259_0==L_nil||(LA259_0>=Constr && LA259_0<=Num)||(LA259_0>=String && LA259_0<=ROUND_BRACKET_OPEN)||LA259_0==SQUARE_BRACKET_OPEN||LA259_0==CURLY_BRACKET_OPEN) ) {
                    alt259=1;
                }


                switch (alt259) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:737:4: basic_expr
            	    {
            	    pushFollow(FOLLOW_basic_expr_in_apply_expr5182);
            	    basic_expr553=basic_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_basic_expr.add(basic_expr553.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt259 >= 1 ) break loop259;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(259, input);
                        throw eee;
                }
                cnt259++;
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
            // 737:16: -> ^( APPLY ( basic_expr )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:737:19: ^( APPLY ( basic_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(APPLY, "APPLY"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:737:27: ( basic_expr )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:738:1: p_apply_expr : p_basic_expr ( ( NL )? p_basic_expr )* -> ^( APPLY ( p_basic_expr )* ) ;
    public final babel17Parser.p_apply_expr_return p_apply_expr() throws RecognitionException {
        babel17Parser.p_apply_expr_return retval = new babel17Parser.p_apply_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL555=null;
        babel17Parser.p_basic_expr_return p_basic_expr554 = null;

        babel17Parser.p_basic_expr_return p_basic_expr556 = null;


        CommonTree NL555_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_p_basic_expr=new RewriteRuleSubtreeStream(adaptor,"rule p_basic_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:739:2: ( p_basic_expr ( ( NL )? p_basic_expr )* -> ^( APPLY ( p_basic_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:739:4: p_basic_expr ( ( NL )? p_basic_expr )*
            {
            pushFollow(FOLLOW_p_basic_expr_in_p_apply_expr5200);
            p_basic_expr554=p_basic_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_p_basic_expr.add(p_basic_expr554.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:739:17: ( ( NL )? p_basic_expr )*
            loop261:
            do {
                int alt261=2;
                int LA261_0 = input.LA(1);

                if ( (LA261_0==NL) ) {
                    int LA261_1 = input.LA(2);

                    if ( (LA261_1==L_begin||(LA261_1>=L_with && LA261_1<=L_if)||(LA261_1>=L_while && LA261_1<=L_for)||LA261_1==L_match||LA261_1==L_try||(LA261_1>=A_infinity && LA261_1<=U_infinity)||(LA261_1>=L_true && LA261_1<=L_this)||LA261_1==L_nil||(LA261_1>=Constr && LA261_1<=Num)||(LA261_1>=String && LA261_1<=ROUND_BRACKET_OPEN)||LA261_1==SQUARE_BRACKET_OPEN||LA261_1==CURLY_BRACKET_OPEN) ) {
                        alt261=1;
                    }


                }
                else if ( (LA261_0==L_begin||(LA261_0>=L_with && LA261_0<=L_if)||(LA261_0>=L_while && LA261_0<=L_for)||LA261_0==L_match||LA261_0==L_try||(LA261_0>=A_infinity && LA261_0<=U_infinity)||(LA261_0>=L_true && LA261_0<=L_this)||LA261_0==L_nil||(LA261_0>=Constr && LA261_0<=Num)||(LA261_0>=String && LA261_0<=ROUND_BRACKET_OPEN)||LA261_0==SQUARE_BRACKET_OPEN||LA261_0==CURLY_BRACKET_OPEN) ) {
                    alt261=1;
                }


                switch (alt261) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:739:18: ( NL )? p_basic_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:739:18: ( NL )?
            	    int alt260=2;
            	    int LA260_0 = input.LA(1);

            	    if ( (LA260_0==NL) ) {
            	        alt260=1;
            	    }
            	    switch (alt260) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:739:18: NL
            	            {
            	            NL555=(Token)match(input,NL,FOLLOW_NL_in_p_apply_expr5203); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL555);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_basic_expr_in_p_apply_expr5206);
            	    p_basic_expr556=p_basic_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_p_basic_expr.add(p_basic_expr556.getTree());

            	    }
            	    break;

            	default :
            	    break loop261;
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
            // 739:37: -> ^( APPLY ( p_basic_expr )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:739:40: ^( APPLY ( p_basic_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(APPLY, "APPLY"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:739:48: ( p_basic_expr )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:741:1: basic_expr : message_send_expr ;
    public final babel17Parser.basic_expr_return basic_expr() throws RecognitionException {
        babel17Parser.basic_expr_return retval = new babel17Parser.basic_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.message_send_expr_return message_send_expr557 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:742:2: ( message_send_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:742:4: message_send_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_message_send_expr_in_basic_expr5226);
            message_send_expr557=message_send_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, message_send_expr557.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:744:1: p_basic_expr : message_send_expr ;
    public final babel17Parser.p_basic_expr_return p_basic_expr() throws RecognitionException {
        babel17Parser.p_basic_expr_return retval = new babel17Parser.p_basic_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.message_send_expr_return message_send_expr558 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:745:2: ( message_send_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:745:4: message_send_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_message_send_expr_in_p_basic_expr5235);
            message_send_expr558=message_send_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, message_send_expr558.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:747:1: message_send_expr : primitive_expr ( ( NL )? PERIOD ( NL )? Id )* -> ^( MESSAGE_SEND primitive_expr ( Id )* ) ;
    public final babel17Parser.message_send_expr_return message_send_expr() throws RecognitionException {
        babel17Parser.message_send_expr_return retval = new babel17Parser.message_send_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL560=null;
        Token PERIOD561=null;
        Token NL562=null;
        Token Id563=null;
        babel17Parser.primitive_expr_return primitive_expr559 = null;


        CommonTree NL560_tree=null;
        CommonTree PERIOD561_tree=null;
        CommonTree NL562_tree=null;
        CommonTree Id563_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
        RewriteRuleTokenStream stream_Id=new RewriteRuleTokenStream(adaptor,"token Id");
        RewriteRuleSubtreeStream stream_primitive_expr=new RewriteRuleSubtreeStream(adaptor,"rule primitive_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:748:2: ( primitive_expr ( ( NL )? PERIOD ( NL )? Id )* -> ^( MESSAGE_SEND primitive_expr ( Id )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:748:4: primitive_expr ( ( NL )? PERIOD ( NL )? Id )*
            {
            pushFollow(FOLLOW_primitive_expr_in_message_send_expr5244);
            primitive_expr559=primitive_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_primitive_expr.add(primitive_expr559.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:748:19: ( ( NL )? PERIOD ( NL )? Id )*
            loop264:
            do {
                int alt264=2;
                int LA264_0 = input.LA(1);

                if ( (LA264_0==NL) ) {
                    int LA264_1 = input.LA(2);

                    if ( (LA264_1==PERIOD) ) {
                        alt264=1;
                    }


                }
                else if ( (LA264_0==PERIOD) ) {
                    alt264=1;
                }


                switch (alt264) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:748:20: ( NL )? PERIOD ( NL )? Id
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:748:20: ( NL )?
            	    int alt262=2;
            	    int LA262_0 = input.LA(1);

            	    if ( (LA262_0==NL) ) {
            	        alt262=1;
            	    }
            	    switch (alt262) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:748:20: NL
            	            {
            	            NL560=(Token)match(input,NL,FOLLOW_NL_in_message_send_expr5247); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL560);


            	            }
            	            break;

            	    }

            	    PERIOD561=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_message_send_expr5250); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD561);

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:748:31: ( NL )?
            	    int alt263=2;
            	    int LA263_0 = input.LA(1);

            	    if ( (LA263_0==NL) ) {
            	        alt263=1;
            	    }
            	    switch (alt263) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:748:31: NL
            	            {
            	            NL562=(Token)match(input,NL,FOLLOW_NL_in_message_send_expr5252); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL562);


            	            }
            	            break;

            	    }

            	    Id563=(Token)match(input,Id,FOLLOW_Id_in_message_send_expr5255); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_Id.add(Id563);


            	    }
            	    break;

            	default :
            	    break loop264;
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
            // 748:40: -> ^( MESSAGE_SEND primitive_expr ( Id )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:748:43: ^( MESSAGE_SEND primitive_expr ( Id )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MESSAGE_SEND, "MESSAGE_SEND"), root_1);

                adaptor.addChild(root_1, stream_primitive_expr.nextTree());
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:748:73: ( Id )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:750:1: list_expr : ( '[' ( NL )? ( protected_expr_nc ( ( NL )? COMMA ( NL )? protected_expr_nc )* ( NL )? )? ']' -> ^( SQUARE_LIST ( protected_expr_nc )* ) | '(' ( NL )? ( protected_expr_nc ( ( NL )? COMMA ( NL )? protected_expr_nc )* ( NL )? ( COMMA ( NL )? )? )? ')' -> ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( protected_expr_nc )* ) ) );
    public final babel17Parser.list_expr_return list_expr() throws RecognitionException {
        babel17Parser.list_expr_return retval = new babel17Parser.list_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal564=null;
        Token NL565=null;
        Token NL567=null;
        Token COMMA568=null;
        Token NL569=null;
        Token NL571=null;
        Token char_literal572=null;
        Token char_literal573=null;
        Token NL574=null;
        Token NL576=null;
        Token COMMA577=null;
        Token NL578=null;
        Token NL580=null;
        Token COMMA581=null;
        Token NL582=null;
        Token char_literal583=null;
        babel17Parser.protected_expr_nc_return protected_expr_nc566 = null;

        babel17Parser.protected_expr_nc_return protected_expr_nc570 = null;

        babel17Parser.protected_expr_nc_return protected_expr_nc575 = null;

        babel17Parser.protected_expr_nc_return protected_expr_nc579 = null;


        CommonTree char_literal564_tree=null;
        CommonTree NL565_tree=null;
        CommonTree NL567_tree=null;
        CommonTree COMMA568_tree=null;
        CommonTree NL569_tree=null;
        CommonTree NL571_tree=null;
        CommonTree char_literal572_tree=null;
        CommonTree char_literal573_tree=null;
        CommonTree NL574_tree=null;
        CommonTree NL576_tree=null;
        CommonTree COMMA577_tree=null;
        CommonTree NL578_tree=null;
        CommonTree NL580_tree=null;
        CommonTree COMMA581_tree=null;
        CommonTree NL582_tree=null;
        CommonTree char_literal583_tree=null;
        RewriteRuleTokenStream stream_ROUND_BRACKET_OPEN=new RewriteRuleTokenStream(adaptor,"token ROUND_BRACKET_OPEN");
        RewriteRuleTokenStream stream_SQUARE_BRACKET_CLOSE=new RewriteRuleTokenStream(adaptor,"token SQUARE_BRACKET_CLOSE");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_ROUND_BRACKET_CLOSE=new RewriteRuleTokenStream(adaptor,"token ROUND_BRACKET_CLOSE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_SQUARE_BRACKET_OPEN=new RewriteRuleTokenStream(adaptor,"token SQUARE_BRACKET_OPEN");
        RewriteRuleSubtreeStream stream_protected_expr_nc=new RewriteRuleSubtreeStream(adaptor,"rule protected_expr_nc");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:751:2: ( '[' ( NL )? ( protected_expr_nc ( ( NL )? COMMA ( NL )? protected_expr_nc )* ( NL )? )? ']' -> ^( SQUARE_LIST ( protected_expr_nc )* ) | '(' ( NL )? ( protected_expr_nc ( ( NL )? COMMA ( NL )? protected_expr_nc )* ( NL )? ( COMMA ( NL )? )? )? ')' -> ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( protected_expr_nc )* ) ) )
            int alt279=2;
            int LA279_0 = input.LA(1);

            if ( (LA279_0==SQUARE_BRACKET_OPEN) ) {
                alt279=1;
            }
            else if ( (LA279_0==ROUND_BRACKET_OPEN) ) {
                alt279=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 279, 0, input);

                throw nvae;
            }
            switch (alt279) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:751:4: '[' ( NL )? ( protected_expr_nc ( ( NL )? COMMA ( NL )? protected_expr_nc )* ( NL )? )? ']'
                    {
                    char_literal564=(Token)match(input,SQUARE_BRACKET_OPEN,FOLLOW_SQUARE_BRACKET_OPEN_in_list_expr5279); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SQUARE_BRACKET_OPEN.add(char_literal564);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:751:8: ( NL )?
                    int alt265=2;
                    int LA265_0 = input.LA(1);

                    if ( (LA265_0==NL) ) {
                        alt265=1;
                    }
                    switch (alt265) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:751:8: NL
                            {
                            NL565=(Token)match(input,NL,FOLLOW_NL_in_list_expr5281); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL565);


                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:751:12: ( protected_expr_nc ( ( NL )? COMMA ( NL )? protected_expr_nc )* ( NL )? )?
                    int alt270=2;
                    int LA270_0 = input.LA(1);

                    if ( (LA270_0==L_begin||(LA270_0>=L_obj && LA270_0<=L_if)||(LA270_0>=L_while && LA270_0<=L_for)||LA270_0==L_match||LA270_0==L_exception||LA270_0==L_try||(LA270_0>=A_infinity && LA270_0<=L_lazy)||(LA270_0>=L_true && LA270_0<=L_nil)||LA270_0==L_typeof||LA270_0==MINUS||LA270_0==A_NOT||LA270_0==U_NOT||(LA270_0>=A_ELLIPSIS && LA270_0<=U_ELLIPSIS)||LA270_0==L_force||(LA270_0>=Constr && LA270_0<=Num)||(LA270_0>=String && LA270_0<=ROUND_BRACKET_OPEN)||LA270_0==SQUARE_BRACKET_OPEN||LA270_0==CURLY_BRACKET_OPEN||LA270_0==UNDERSCORE) ) {
                        alt270=1;
                    }
                    switch (alt270) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:751:13: protected_expr_nc ( ( NL )? COMMA ( NL )? protected_expr_nc )* ( NL )?
                            {
                            pushFollow(FOLLOW_protected_expr_nc_in_list_expr5285);
                            protected_expr_nc566=protected_expr_nc();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_protected_expr_nc.add(protected_expr_nc566.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:751:31: ( ( NL )? COMMA ( NL )? protected_expr_nc )*
                            loop268:
                            do {
                                int alt268=2;
                                int LA268_0 = input.LA(1);

                                if ( (LA268_0==NL) ) {
                                    int LA268_1 = input.LA(2);

                                    if ( (LA268_1==COMMA) ) {
                                        alt268=1;
                                    }


                                }
                                else if ( (LA268_0==COMMA) ) {
                                    alt268=1;
                                }


                                switch (alt268) {
                            	case 1 :
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:751:32: ( NL )? COMMA ( NL )? protected_expr_nc
                            	    {
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:751:32: ( NL )?
                            	    int alt266=2;
                            	    int LA266_0 = input.LA(1);

                            	    if ( (LA266_0==NL) ) {
                            	        alt266=1;
                            	    }
                            	    switch (alt266) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:751:32: NL
                            	            {
                            	            NL567=(Token)match(input,NL,FOLLOW_NL_in_list_expr5288); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL567);


                            	            }
                            	            break;

                            	    }

                            	    COMMA568=(Token)match(input,COMMA,FOLLOW_COMMA_in_list_expr5291); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA568);

                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:751:42: ( NL )?
                            	    int alt267=2;
                            	    int LA267_0 = input.LA(1);

                            	    if ( (LA267_0==NL) ) {
                            	        alt267=1;
                            	    }
                            	    switch (alt267) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:751:42: NL
                            	            {
                            	            NL569=(Token)match(input,NL,FOLLOW_NL_in_list_expr5293); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL569);


                            	            }
                            	            break;

                            	    }

                            	    pushFollow(FOLLOW_protected_expr_nc_in_list_expr5296);
                            	    protected_expr_nc570=protected_expr_nc();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_protected_expr_nc.add(protected_expr_nc570.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop268;
                                }
                            } while (true);

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:751:66: ( NL )?
                            int alt269=2;
                            int LA269_0 = input.LA(1);

                            if ( (LA269_0==NL) ) {
                                alt269=1;
                            }
                            switch (alt269) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:751:66: NL
                                    {
                                    NL571=(Token)match(input,NL,FOLLOW_NL_in_list_expr5300); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL571);


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    char_literal572=(Token)match(input,SQUARE_BRACKET_CLOSE,FOLLOW_SQUARE_BRACKET_CLOSE_in_list_expr5305); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SQUARE_BRACKET_CLOSE.add(char_literal572);



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
                    // 751:76: -> ^( SQUARE_LIST ( protected_expr_nc )* )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:751:79: ^( SQUARE_LIST ( protected_expr_nc )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SQUARE_LIST, "SQUARE_LIST"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:751:93: ( protected_expr_nc )*
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:752:4: '(' ( NL )? ( protected_expr_nc ( ( NL )? COMMA ( NL )? protected_expr_nc )* ( NL )? ( COMMA ( NL )? )? )? ')'
                    {
                    char_literal573=(Token)match(input,ROUND_BRACKET_OPEN,FOLLOW_ROUND_BRACKET_OPEN_in_list_expr5319); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ROUND_BRACKET_OPEN.add(char_literal573);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:752:8: ( NL )?
                    int alt271=2;
                    int LA271_0 = input.LA(1);

                    if ( (LA271_0==NL) ) {
                        alt271=1;
                    }
                    switch (alt271) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:752:8: NL
                            {
                            NL574=(Token)match(input,NL,FOLLOW_NL_in_list_expr5321); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL574);


                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:752:12: ( protected_expr_nc ( ( NL )? COMMA ( NL )? protected_expr_nc )* ( NL )? ( COMMA ( NL )? )? )?
                    int alt278=2;
                    int LA278_0 = input.LA(1);

                    if ( (LA278_0==L_begin||(LA278_0>=L_obj && LA278_0<=L_if)||(LA278_0>=L_while && LA278_0<=L_for)||LA278_0==L_match||LA278_0==L_exception||LA278_0==L_try||(LA278_0>=A_infinity && LA278_0<=L_lazy)||(LA278_0>=L_true && LA278_0<=L_nil)||LA278_0==L_typeof||LA278_0==MINUS||LA278_0==A_NOT||LA278_0==U_NOT||(LA278_0>=A_ELLIPSIS && LA278_0<=U_ELLIPSIS)||LA278_0==L_force||(LA278_0>=Constr && LA278_0<=Num)||(LA278_0>=String && LA278_0<=ROUND_BRACKET_OPEN)||LA278_0==SQUARE_BRACKET_OPEN||LA278_0==CURLY_BRACKET_OPEN||LA278_0==UNDERSCORE) ) {
                        alt278=1;
                    }
                    switch (alt278) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:752:13: protected_expr_nc ( ( NL )? COMMA ( NL )? protected_expr_nc )* ( NL )? ( COMMA ( NL )? )?
                            {
                            pushFollow(FOLLOW_protected_expr_nc_in_list_expr5325);
                            protected_expr_nc575=protected_expr_nc();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_protected_expr_nc.add(protected_expr_nc575.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:752:31: ( ( NL )? COMMA ( NL )? protected_expr_nc )*
                            loop274:
                            do {
                                int alt274=2;
                                int LA274_0 = input.LA(1);

                                if ( (LA274_0==NL) ) {
                                    int LA274_1 = input.LA(2);

                                    if ( (LA274_1==COMMA) ) {
                                        int LA274_2 = input.LA(3);

                                        if ( (LA274_2==NL) ) {
                                            int LA274_4 = input.LA(4);

                                            if ( (LA274_4==L_begin||(LA274_4>=L_obj && LA274_4<=L_if)||(LA274_4>=L_while && LA274_4<=L_for)||LA274_4==L_match||LA274_4==L_exception||LA274_4==L_try||(LA274_4>=A_infinity && LA274_4<=L_lazy)||(LA274_4>=L_true && LA274_4<=L_nil)||LA274_4==L_typeof||LA274_4==MINUS||LA274_4==A_NOT||LA274_4==U_NOT||(LA274_4>=A_ELLIPSIS && LA274_4<=U_ELLIPSIS)||LA274_4==L_force||(LA274_4>=Constr && LA274_4<=Num)||(LA274_4>=String && LA274_4<=ROUND_BRACKET_OPEN)||LA274_4==SQUARE_BRACKET_OPEN||LA274_4==CURLY_BRACKET_OPEN||LA274_4==UNDERSCORE) ) {
                                                alt274=1;
                                            }


                                        }
                                        else if ( (LA274_2==L_begin||(LA274_2>=L_obj && LA274_2<=L_if)||(LA274_2>=L_while && LA274_2<=L_for)||LA274_2==L_match||LA274_2==L_exception||LA274_2==L_try||(LA274_2>=A_infinity && LA274_2<=L_lazy)||(LA274_2>=L_true && LA274_2<=L_nil)||LA274_2==L_typeof||LA274_2==MINUS||LA274_2==A_NOT||LA274_2==U_NOT||(LA274_2>=A_ELLIPSIS && LA274_2<=U_ELLIPSIS)||LA274_2==L_force||(LA274_2>=Constr && LA274_2<=Num)||(LA274_2>=String && LA274_2<=ROUND_BRACKET_OPEN)||LA274_2==SQUARE_BRACKET_OPEN||LA274_2==CURLY_BRACKET_OPEN||LA274_2==UNDERSCORE) ) {
                                            alt274=1;
                                        }


                                    }


                                }
                                else if ( (LA274_0==COMMA) ) {
                                    int LA274_2 = input.LA(2);

                                    if ( (LA274_2==NL) ) {
                                        int LA274_4 = input.LA(3);

                                        if ( (LA274_4==L_begin||(LA274_4>=L_obj && LA274_4<=L_if)||(LA274_4>=L_while && LA274_4<=L_for)||LA274_4==L_match||LA274_4==L_exception||LA274_4==L_try||(LA274_4>=A_infinity && LA274_4<=L_lazy)||(LA274_4>=L_true && LA274_4<=L_nil)||LA274_4==L_typeof||LA274_4==MINUS||LA274_4==A_NOT||LA274_4==U_NOT||(LA274_4>=A_ELLIPSIS && LA274_4<=U_ELLIPSIS)||LA274_4==L_force||(LA274_4>=Constr && LA274_4<=Num)||(LA274_4>=String && LA274_4<=ROUND_BRACKET_OPEN)||LA274_4==SQUARE_BRACKET_OPEN||LA274_4==CURLY_BRACKET_OPEN||LA274_4==UNDERSCORE) ) {
                                            alt274=1;
                                        }


                                    }
                                    else if ( (LA274_2==L_begin||(LA274_2>=L_obj && LA274_2<=L_if)||(LA274_2>=L_while && LA274_2<=L_for)||LA274_2==L_match||LA274_2==L_exception||LA274_2==L_try||(LA274_2>=A_infinity && LA274_2<=L_lazy)||(LA274_2>=L_true && LA274_2<=L_nil)||LA274_2==L_typeof||LA274_2==MINUS||LA274_2==A_NOT||LA274_2==U_NOT||(LA274_2>=A_ELLIPSIS && LA274_2<=U_ELLIPSIS)||LA274_2==L_force||(LA274_2>=Constr && LA274_2<=Num)||(LA274_2>=String && LA274_2<=ROUND_BRACKET_OPEN)||LA274_2==SQUARE_BRACKET_OPEN||LA274_2==CURLY_BRACKET_OPEN||LA274_2==UNDERSCORE) ) {
                                        alt274=1;
                                    }


                                }


                                switch (alt274) {
                            	case 1 :
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:752:32: ( NL )? COMMA ( NL )? protected_expr_nc
                            	    {
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:752:32: ( NL )?
                            	    int alt272=2;
                            	    int LA272_0 = input.LA(1);

                            	    if ( (LA272_0==NL) ) {
                            	        alt272=1;
                            	    }
                            	    switch (alt272) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:752:32: NL
                            	            {
                            	            NL576=(Token)match(input,NL,FOLLOW_NL_in_list_expr5328); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL576);


                            	            }
                            	            break;

                            	    }

                            	    COMMA577=(Token)match(input,COMMA,FOLLOW_COMMA_in_list_expr5331); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA577);

                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:752:42: ( NL )?
                            	    int alt273=2;
                            	    int LA273_0 = input.LA(1);

                            	    if ( (LA273_0==NL) ) {
                            	        alt273=1;
                            	    }
                            	    switch (alt273) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:752:42: NL
                            	            {
                            	            NL578=(Token)match(input,NL,FOLLOW_NL_in_list_expr5333); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL578);


                            	            }
                            	            break;

                            	    }

                            	    pushFollow(FOLLOW_protected_expr_nc_in_list_expr5336);
                            	    protected_expr_nc579=protected_expr_nc();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_protected_expr_nc.add(protected_expr_nc579.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop274;
                                }
                            } while (true);

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:752:66: ( NL )?
                            int alt275=2;
                            int LA275_0 = input.LA(1);

                            if ( (LA275_0==NL) ) {
                                alt275=1;
                            }
                            switch (alt275) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:752:66: NL
                                    {
                                    NL580=(Token)match(input,NL,FOLLOW_NL_in_list_expr5340); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL580);


                                    }
                                    break;

                            }

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:752:70: ( COMMA ( NL )? )?
                            int alt277=2;
                            int LA277_0 = input.LA(1);

                            if ( (LA277_0==COMMA) ) {
                                alt277=1;
                            }
                            switch (alt277) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:752:71: COMMA ( NL )?
                                    {
                                    COMMA581=(Token)match(input,COMMA,FOLLOW_COMMA_in_list_expr5344); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_COMMA.add(COMMA581);

                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:752:77: ( NL )?
                                    int alt276=2;
                                    int LA276_0 = input.LA(1);

                                    if ( (LA276_0==NL) ) {
                                        alt276=1;
                                    }
                                    switch (alt276) {
                                        case 1 :
                                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:752:77: NL
                                            {
                                            NL582=(Token)match(input,NL,FOLLOW_NL_in_list_expr5346); if (state.failed) return retval; 
                                            if ( state.backtracking==0 ) stream_NL.add(NL582);


                                            }
                                            break;

                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    char_literal583=(Token)match(input,ROUND_BRACKET_CLOSE,FOLLOW_ROUND_BRACKET_CLOSE_in_list_expr5353); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ROUND_BRACKET_CLOSE.add(char_literal583);



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
                    // 752:89: -> ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( protected_expr_nc )* ) )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:752:92: ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( protected_expr_nc )* ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ROUND_LIST, "ROUND_LIST"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:752:105: ^( NIL_TOKEN ( COMMA )* )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_2);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:752:117: ( COMMA )*
                        while ( stream_COMMA.hasNext() ) {
                            adaptor.addChild(root_2, stream_COMMA.nextNode());

                        }
                        stream_COMMA.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:752:125: ^( NIL_TOKEN ( protected_expr_nc )* )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_2);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:752:137: ( protected_expr_nc )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:754:1: map_or_set_expr : ( '{' ( NL )? ( map_or_set_elem_expr ( NL )? ( COMMA ( NL )? map_or_set_elem_expr ( NL )? )* )? '}' -> ^( MAP_OR_SET_OR_OBJ ( map_or_set_elem_expr )* ) | '{' ( NL )? token_ARROW ( NL )? '}' -> ^( EMPTY_MAP ) );
    public final babel17Parser.map_or_set_expr_return map_or_set_expr() throws RecognitionException {
        babel17Parser.map_or_set_expr_return retval = new babel17Parser.map_or_set_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal584=null;
        Token NL585=null;
        Token NL587=null;
        Token COMMA588=null;
        Token NL589=null;
        Token NL591=null;
        Token char_literal592=null;
        Token char_literal593=null;
        Token NL594=null;
        Token NL596=null;
        Token char_literal597=null;
        babel17Parser.map_or_set_elem_expr_return map_or_set_elem_expr586 = null;

        babel17Parser.map_or_set_elem_expr_return map_or_set_elem_expr590 = null;

        babel17Parser.token_ARROW_return token_ARROW595 = null;


        CommonTree char_literal584_tree=null;
        CommonTree NL585_tree=null;
        CommonTree NL587_tree=null;
        CommonTree COMMA588_tree=null;
        CommonTree NL589_tree=null;
        CommonTree NL591_tree=null;
        CommonTree char_literal592_tree=null;
        CommonTree char_literal593_tree=null;
        CommonTree NL594_tree=null;
        CommonTree NL596_tree=null;
        CommonTree char_literal597_tree=null;
        RewriteRuleTokenStream stream_CURLY_BRACKET_OPEN=new RewriteRuleTokenStream(adaptor,"token CURLY_BRACKET_OPEN");
        RewriteRuleTokenStream stream_CURLY_BRACKET_CLOSE=new RewriteRuleTokenStream(adaptor,"token CURLY_BRACKET_CLOSE");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_map_or_set_elem_expr=new RewriteRuleSubtreeStream(adaptor,"rule map_or_set_elem_expr");
        RewriteRuleSubtreeStream stream_token_ARROW=new RewriteRuleSubtreeStream(adaptor,"rule token_ARROW");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:755:2: ( '{' ( NL )? ( map_or_set_elem_expr ( NL )? ( COMMA ( NL )? map_or_set_elem_expr ( NL )? )* )? '}' -> ^( MAP_OR_SET_OR_OBJ ( map_or_set_elem_expr )* ) | '{' ( NL )? token_ARROW ( NL )? '}' -> ^( EMPTY_MAP ) )
            int alt288=2;
            int LA288_0 = input.LA(1);

            if ( (LA288_0==CURLY_BRACKET_OPEN) ) {
                switch ( input.LA(2) ) {
                case NL:
                    {
                    int LA288_2 = input.LA(3);

                    if ( ((LA288_2>=A_ARROW && LA288_2<=U_ARROW)) ) {
                        alt288=2;
                    }
                    else if ( (LA288_2==L_begin||(LA288_2>=L_obj && LA288_2<=L_if)||(LA288_2>=L_while && LA288_2<=L_for)||LA288_2==L_match||LA288_2==L_exception||LA288_2==L_try||(LA288_2>=A_infinity && LA288_2<=L_lazy)||(LA288_2>=L_true && LA288_2<=L_nil)||LA288_2==L_typeof||LA288_2==MINUS||LA288_2==A_NOT||LA288_2==U_NOT||(LA288_2>=A_ELLIPSIS && LA288_2<=U_ELLIPSIS)||LA288_2==L_force||(LA288_2>=Constr && LA288_2<=Num)||(LA288_2>=String && LA288_2<=ROUND_BRACKET_OPEN)||LA288_2==SQUARE_BRACKET_OPEN||(LA288_2>=CURLY_BRACKET_OPEN && LA288_2<=UNDERSCORE)) ) {
                        alt288=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 288, 2, input);

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
                    alt288=1;
                    }
                    break;
                case A_ARROW:
                case U_ARROW:
                    {
                    alt288=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 288, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 288, 0, input);

                throw nvae;
            }
            switch (alt288) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:755:4: '{' ( NL )? ( map_or_set_elem_expr ( NL )? ( COMMA ( NL )? map_or_set_elem_expr ( NL )? )* )? '}'
                    {
                    char_literal584=(Token)match(input,CURLY_BRACKET_OPEN,FOLLOW_CURLY_BRACKET_OPEN_in_map_or_set_expr5382); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_OPEN.add(char_literal584);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:755:8: ( NL )?
                    int alt280=2;
                    int LA280_0 = input.LA(1);

                    if ( (LA280_0==NL) ) {
                        alt280=1;
                    }
                    switch (alt280) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:755:8: NL
                            {
                            NL585=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_expr5384); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL585);


                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:755:12: ( map_or_set_elem_expr ( NL )? ( COMMA ( NL )? map_or_set_elem_expr ( NL )? )* )?
                    int alt285=2;
                    int LA285_0 = input.LA(1);

                    if ( (LA285_0==L_begin||(LA285_0>=L_obj && LA285_0<=L_if)||(LA285_0>=L_while && LA285_0<=L_for)||LA285_0==L_match||LA285_0==L_exception||LA285_0==L_try||(LA285_0>=A_infinity && LA285_0<=L_lazy)||(LA285_0>=L_true && LA285_0<=L_nil)||LA285_0==L_typeof||LA285_0==MINUS||LA285_0==A_NOT||LA285_0==U_NOT||(LA285_0>=A_ELLIPSIS && LA285_0<=U_ELLIPSIS)||LA285_0==L_force||(LA285_0>=Constr && LA285_0<=Num)||(LA285_0>=String && LA285_0<=ROUND_BRACKET_OPEN)||LA285_0==SQUARE_BRACKET_OPEN||LA285_0==CURLY_BRACKET_OPEN||LA285_0==UNDERSCORE) ) {
                        alt285=1;
                    }
                    switch (alt285) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:755:13: map_or_set_elem_expr ( NL )? ( COMMA ( NL )? map_or_set_elem_expr ( NL )? )*
                            {
                            pushFollow(FOLLOW_map_or_set_elem_expr_in_map_or_set_expr5388);
                            map_or_set_elem_expr586=map_or_set_elem_expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_map_or_set_elem_expr.add(map_or_set_elem_expr586.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:755:34: ( NL )?
                            int alt281=2;
                            int LA281_0 = input.LA(1);

                            if ( (LA281_0==NL) ) {
                                alt281=1;
                            }
                            switch (alt281) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:755:34: NL
                                    {
                                    NL587=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_expr5390); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL587);


                                    }
                                    break;

                            }

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:755:38: ( COMMA ( NL )? map_or_set_elem_expr ( NL )? )*
                            loop284:
                            do {
                                int alt284=2;
                                int LA284_0 = input.LA(1);

                                if ( (LA284_0==COMMA) ) {
                                    alt284=1;
                                }


                                switch (alt284) {
                            	case 1 :
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:755:39: COMMA ( NL )? map_or_set_elem_expr ( NL )?
                            	    {
                            	    COMMA588=(Token)match(input,COMMA,FOLLOW_COMMA_in_map_or_set_expr5394); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA588);

                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:755:45: ( NL )?
                            	    int alt282=2;
                            	    int LA282_0 = input.LA(1);

                            	    if ( (LA282_0==NL) ) {
                            	        alt282=1;
                            	    }
                            	    switch (alt282) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:755:45: NL
                            	            {
                            	            NL589=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_expr5396); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL589);


                            	            }
                            	            break;

                            	    }

                            	    pushFollow(FOLLOW_map_or_set_elem_expr_in_map_or_set_expr5399);
                            	    map_or_set_elem_expr590=map_or_set_elem_expr();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_map_or_set_elem_expr.add(map_or_set_elem_expr590.getTree());
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:755:70: ( NL )?
                            	    int alt283=2;
                            	    int LA283_0 = input.LA(1);

                            	    if ( (LA283_0==NL) ) {
                            	        alt283=1;
                            	    }
                            	    switch (alt283) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:755:70: NL
                            	            {
                            	            NL591=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_expr5401); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL591);


                            	            }
                            	            break;

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop284;
                                }
                            } while (true);


                            }
                            break;

                    }

                    char_literal592=(Token)match(input,CURLY_BRACKET_CLOSE,FOLLOW_CURLY_BRACKET_CLOSE_in_map_or_set_expr5408); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_CLOSE.add(char_literal592);



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
                    // 755:82: -> ^( MAP_OR_SET_OR_OBJ ( map_or_set_elem_expr )* )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:755:85: ^( MAP_OR_SET_OR_OBJ ( map_or_set_elem_expr )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MAP_OR_SET_OR_OBJ, "MAP_OR_SET_OR_OBJ"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:755:105: ( map_or_set_elem_expr )*
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:756:10: '{' ( NL )? token_ARROW ( NL )? '}'
                    {
                    char_literal593=(Token)match(input,CURLY_BRACKET_OPEN,FOLLOW_CURLY_BRACKET_OPEN_in_map_or_set_expr5428); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_OPEN.add(char_literal593);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:756:14: ( NL )?
                    int alt286=2;
                    int LA286_0 = input.LA(1);

                    if ( (LA286_0==NL) ) {
                        alt286=1;
                    }
                    switch (alt286) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:756:14: NL
                            {
                            NL594=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_expr5430); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL594);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_token_ARROW_in_map_or_set_expr5433);
                    token_ARROW595=token_ARROW();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_token_ARROW.add(token_ARROW595.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:756:30: ( NL )?
                    int alt287=2;
                    int LA287_0 = input.LA(1);

                    if ( (LA287_0==NL) ) {
                        alt287=1;
                    }
                    switch (alt287) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:756:30: NL
                            {
                            NL596=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_expr5435); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL596);


                            }
                            break;

                    }

                    char_literal597=(Token)match(input,CURLY_BRACKET_CLOSE,FOLLOW_CURLY_BRACKET_CLOSE_in_map_or_set_expr5438); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_CLOSE.add(char_literal597);



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
                    // 756:38: -> ^( EMPTY_MAP )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:756:41: ^( EMPTY_MAP )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:758:1: map_or_set_elem_expr : protected_expr_nc ( ( NL )? arrow_or_assign ( NL )? protected_expr_nc )? -> ^( NIL_TOKEN ^( NIL_TOKEN ( protected_expr_nc )* ) ( arrow_or_assign )* ) ;
    public final babel17Parser.map_or_set_elem_expr_return map_or_set_elem_expr() throws RecognitionException {
        babel17Parser.map_or_set_elem_expr_return retval = new babel17Parser.map_or_set_elem_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL599=null;
        Token NL601=null;
        babel17Parser.protected_expr_nc_return protected_expr_nc598 = null;

        babel17Parser.arrow_or_assign_return arrow_or_assign600 = null;

        babel17Parser.protected_expr_nc_return protected_expr_nc602 = null;


        CommonTree NL599_tree=null;
        CommonTree NL601_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_arrow_or_assign=new RewriteRuleSubtreeStream(adaptor,"rule arrow_or_assign");
        RewriteRuleSubtreeStream stream_protected_expr_nc=new RewriteRuleSubtreeStream(adaptor,"rule protected_expr_nc");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:759:2: ( protected_expr_nc ( ( NL )? arrow_or_assign ( NL )? protected_expr_nc )? -> ^( NIL_TOKEN ^( NIL_TOKEN ( protected_expr_nc )* ) ( arrow_or_assign )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:759:4: protected_expr_nc ( ( NL )? arrow_or_assign ( NL )? protected_expr_nc )?
            {
            pushFollow(FOLLOW_protected_expr_nc_in_map_or_set_elem_expr5455);
            protected_expr_nc598=protected_expr_nc();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_protected_expr_nc.add(protected_expr_nc598.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:759:22: ( ( NL )? arrow_or_assign ( NL )? protected_expr_nc )?
            int alt291=2;
            int LA291_0 = input.LA(1);

            if ( (LA291_0==NL) ) {
                int LA291_1 = input.LA(2);

                if ( (LA291_1==ASSIGN||(LA291_1>=A_ARROW && LA291_1<=U_ARROW)) ) {
                    alt291=1;
                }
            }
            else if ( (LA291_0==ASSIGN||(LA291_0>=A_ARROW && LA291_0<=U_ARROW)) ) {
                alt291=1;
            }
            switch (alt291) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:759:23: ( NL )? arrow_or_assign ( NL )? protected_expr_nc
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:759:23: ( NL )?
                    int alt289=2;
                    int LA289_0 = input.LA(1);

                    if ( (LA289_0==NL) ) {
                        alt289=1;
                    }
                    switch (alt289) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:759:23: NL
                            {
                            NL599=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_elem_expr5458); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL599);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_arrow_or_assign_in_map_or_set_elem_expr5461);
                    arrow_or_assign600=arrow_or_assign();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_arrow_or_assign.add(arrow_or_assign600.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:759:43: ( NL )?
                    int alt290=2;
                    int LA290_0 = input.LA(1);

                    if ( (LA290_0==NL) ) {
                        alt290=1;
                    }
                    switch (alt290) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:759:43: NL
                            {
                            NL601=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_elem_expr5463); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL601);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_protected_expr_nc_in_map_or_set_elem_expr5466);
                    protected_expr_nc602=protected_expr_nc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_protected_expr_nc.add(protected_expr_nc602.getTree());

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
            // 759:67: -> ^( NIL_TOKEN ^( NIL_TOKEN ( protected_expr_nc )* ) ( arrow_or_assign )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:759:70: ^( NIL_TOKEN ^( NIL_TOKEN ( protected_expr_nc )* ) ( arrow_or_assign )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:759:82: ^( NIL_TOKEN ( protected_expr_nc )* )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_2);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:759:94: ( protected_expr_nc )*
                while ( stream_protected_expr_nc.hasNext() ) {
                    adaptor.addChild(root_2, stream_protected_expr_nc.nextTree());

                }
                stream_protected_expr_nc.reset();

                adaptor.addChild(root_1, root_2);
                }
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:759:114: ( arrow_or_assign )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:761:1: type_expr : '(' ( NL )? ':' ( NL )? typeid ( NL )? ')' -> ^( TYPE_EXPR typeid ) ;
    public final babel17Parser.type_expr_return type_expr() throws RecognitionException {
        babel17Parser.type_expr_return retval = new babel17Parser.type_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal603=null;
        Token NL604=null;
        Token char_literal605=null;
        Token NL606=null;
        Token NL608=null;
        Token char_literal609=null;
        babel17Parser.typeid_return typeid607 = null;


        CommonTree char_literal603_tree=null;
        CommonTree NL604_tree=null;
        CommonTree char_literal605_tree=null;
        CommonTree NL606_tree=null;
        CommonTree NL608_tree=null;
        CommonTree char_literal609_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_ROUND_BRACKET_OPEN=new RewriteRuleTokenStream(adaptor,"token ROUND_BRACKET_OPEN");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_ROUND_BRACKET_CLOSE=new RewriteRuleTokenStream(adaptor,"token ROUND_BRACKET_CLOSE");
        RewriteRuleSubtreeStream stream_typeid=new RewriteRuleSubtreeStream(adaptor,"rule typeid");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:762:2: ( '(' ( NL )? ':' ( NL )? typeid ( NL )? ')' -> ^( TYPE_EXPR typeid ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:762:4: '(' ( NL )? ':' ( NL )? typeid ( NL )? ')'
            {
            char_literal603=(Token)match(input,ROUND_BRACKET_OPEN,FOLLOW_ROUND_BRACKET_OPEN_in_type_expr5493); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ROUND_BRACKET_OPEN.add(char_literal603);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:762:8: ( NL )?
            int alt292=2;
            int LA292_0 = input.LA(1);

            if ( (LA292_0==NL) ) {
                alt292=1;
            }
            switch (alt292) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:762:8: NL
                    {
                    NL604=(Token)match(input,NL,FOLLOW_NL_in_type_expr5495); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL604);


                    }
                    break;

            }

            char_literal605=(Token)match(input,COLON,FOLLOW_COLON_in_type_expr5498); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(char_literal605);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:762:16: ( NL )?
            int alt293=2;
            int LA293_0 = input.LA(1);

            if ( (LA293_0==NL) ) {
                alt293=1;
            }
            switch (alt293) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:762:16: NL
                    {
                    NL606=(Token)match(input,NL,FOLLOW_NL_in_type_expr5500); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL606);


                    }
                    break;

            }

            pushFollow(FOLLOW_typeid_in_type_expr5503);
            typeid607=typeid();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeid.add(typeid607.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:762:27: ( NL )?
            int alt294=2;
            int LA294_0 = input.LA(1);

            if ( (LA294_0==NL) ) {
                alt294=1;
            }
            switch (alt294) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:762:27: NL
                    {
                    NL608=(Token)match(input,NL,FOLLOW_NL_in_type_expr5505); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL608);


                    }
                    break;

            }

            char_literal609=(Token)match(input,ROUND_BRACKET_CLOSE,FOLLOW_ROUND_BRACKET_CLOSE_in_type_expr5508); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ROUND_BRACKET_CLOSE.add(char_literal609);



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
            // 762:35: -> ^( TYPE_EXPR typeid )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:762:38: ^( TYPE_EXPR typeid )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:764:1: primitive_expr : ( Num | String | Id | Constr | L_true | L_false | L_this | L_nil | type_expr | token_infinity | list_expr | with_control_expr | map_or_set_expr );
    public final babel17Parser.primitive_expr_return primitive_expr() throws RecognitionException {
        babel17Parser.primitive_expr_return retval = new babel17Parser.primitive_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Num610=null;
        Token String611=null;
        Token Id612=null;
        Token Constr613=null;
        Token L_true614=null;
        Token L_false615=null;
        Token L_this616=null;
        Token L_nil617=null;
        babel17Parser.type_expr_return type_expr618 = null;

        babel17Parser.token_infinity_return token_infinity619 = null;

        babel17Parser.list_expr_return list_expr620 = null;

        babel17Parser.with_control_expr_return with_control_expr621 = null;

        babel17Parser.map_or_set_expr_return map_or_set_expr622 = null;


        CommonTree Num610_tree=null;
        CommonTree String611_tree=null;
        CommonTree Id612_tree=null;
        CommonTree Constr613_tree=null;
        CommonTree L_true614_tree=null;
        CommonTree L_false615_tree=null;
        CommonTree L_this616_tree=null;
        CommonTree L_nil617_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:765:2: ( Num | String | Id | Constr | L_true | L_false | L_this | L_nil | type_expr | token_infinity | list_expr | with_control_expr | map_or_set_expr )
            int alt295=13;
            alt295 = dfa295.predict(input);
            switch (alt295) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:765:4: Num
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Num610=(Token)match(input,Num,FOLLOW_Num_in_primitive_expr5525); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Num610_tree = (CommonTree)adaptor.create(Num610);
                    adaptor.addChild(root_0, Num610_tree);
                    }

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:766:4: String
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    String611=(Token)match(input,String,FOLLOW_String_in_primitive_expr5530); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    String611_tree = (CommonTree)adaptor.create(String611);
                    adaptor.addChild(root_0, String611_tree);
                    }

                    }
                    break;
                case 3 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:767:4: Id
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Id612=(Token)match(input,Id,FOLLOW_Id_in_primitive_expr5535); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Id612_tree = (CommonTree)adaptor.create(Id612);
                    adaptor.addChild(root_0, Id612_tree);
                    }

                    }
                    break;
                case 4 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:768:4: Constr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Constr613=(Token)match(input,Constr,FOLLOW_Constr_in_primitive_expr5540); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Constr613_tree = (CommonTree)adaptor.create(Constr613);
                    adaptor.addChild(root_0, Constr613_tree);
                    }

                    }
                    break;
                case 5 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:769:4: L_true
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    L_true614=(Token)match(input,L_true,FOLLOW_L_true_in_primitive_expr5545); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    L_true614_tree = (CommonTree)adaptor.create(L_true614);
                    adaptor.addChild(root_0, L_true614_tree);
                    }

                    }
                    break;
                case 6 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:770:4: L_false
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    L_false615=(Token)match(input,L_false,FOLLOW_L_false_in_primitive_expr5550); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    L_false615_tree = (CommonTree)adaptor.create(L_false615);
                    adaptor.addChild(root_0, L_false615_tree);
                    }

                    }
                    break;
                case 7 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:771:4: L_this
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    L_this616=(Token)match(input,L_this,FOLLOW_L_this_in_primitive_expr5555); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    L_this616_tree = (CommonTree)adaptor.create(L_this616);
                    adaptor.addChild(root_0, L_this616_tree);
                    }

                    }
                    break;
                case 8 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:772:4: L_nil
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    L_nil617=(Token)match(input,L_nil,FOLLOW_L_nil_in_primitive_expr5561); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    L_nil617_tree = (CommonTree)adaptor.create(L_nil617);
                    adaptor.addChild(root_0, L_nil617_tree);
                    }

                    }
                    break;
                case 9 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:773:4: type_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_type_expr_in_primitive_expr5566);
                    type_expr618=type_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type_expr618.getTree());

                    }
                    break;
                case 10 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:774:4: token_infinity
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_infinity_in_primitive_expr5571);
                    token_infinity619=token_infinity();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, token_infinity619.getTree());

                    }
                    break;
                case 11 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:775:5: list_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_list_expr_in_primitive_expr5577);
                    list_expr620=list_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, list_expr620.getTree());

                    }
                    break;
                case 12 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:776:4: with_control_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_with_control_expr_in_primitive_expr5582);
                    with_control_expr621=with_control_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, with_control_expr621.getTree());

                    }
                    break;
                case 13 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:777:4: map_or_set_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_map_or_set_expr_in_primitive_expr5587);
                    map_or_set_expr622=map_or_set_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, map_or_set_expr622.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:414:10: ( Id ( NL )? L_as )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:414:11: Id ( NL )? L_as
        {
        match(input,Id,FOLLOW_Id_in_synpred1_babel171880); if (state.failed) return ;
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:414:14: ( NL )?
        int alt296=2;
        int LA296_0 = input.LA(1);

        if ( (LA296_0==NL) ) {
            alt296=1;
        }
        switch (alt296) {
            case 1 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:414:14: NL
                {
                match(input,NL,FOLLOW_NL_in_synpred1_babel171882); if (state.failed) return ;

                }
                break;

        }

        match(input,L_as,FOLLOW_L_as_in_synpred1_babel171885); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_babel17

    // $ANTLR start synpred2_babel17
    public final void synpred2_babel17_fragment() throws RecognitionException {   
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:415:4: ( protected_expr ( NL )? QUESTION_MARK )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:415:5: protected_expr ( NL )? QUESTION_MARK
        {
        pushFollow(FOLLOW_protected_expr_in_synpred2_babel171916);
        protected_expr();

        state._fsp--;
        if (state.failed) return ;
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:415:20: ( NL )?
        int alt297=2;
        int LA297_0 = input.LA(1);

        if ( (LA297_0==NL) ) {
            alt297=1;
        }
        switch (alt297) {
            case 1 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:415:20: NL
                {
                match(input,NL,FOLLOW_NL_in_synpred2_babel171918); if (state.failed) return ;

                }
                break;

        }

        match(input,QUESTION_MARK,FOLLOW_QUESTION_MARK_in_synpred2_babel171921); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_babel17

    // $ANTLR start synpred3_babel17
    public final void synpred3_babel17_fragment() throws RecognitionException {   
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:417:4: ( Id pattern )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:417:5: Id pattern
        {
        match(input,Id,FOLLOW_Id_in_synpred3_babel171959); if (state.failed) return ;
        pushFollow(FOLLOW_pattern_in_synpred3_babel171961);
        pattern();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_babel17

    // $ANTLR start synpred4_babel17
    public final void synpred4_babel17_fragment() throws RecognitionException {   
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:420:4: ( pattern ( NL )? L_if )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:420:5: pattern ( NL )? L_if
        {
        pushFollow(FOLLOW_pattern_in_synpred4_babel172050);
        pattern();

        state._fsp--;
        if (state.failed) return ;
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:420:13: ( NL )?
        int alt298=2;
        int LA298_0 = input.LA(1);

        if ( (LA298_0==NL) ) {
            alt298=1;
        }
        switch (alt298) {
            case 1 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:420:13: NL
                {
                match(input,NL,FOLLOW_NL_in_synpred4_babel172052); if (state.failed) return ;

                }
                break;

        }

        match(input,L_if,FOLLOW_L_if_in_synpred4_babel172055); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_babel17

    // $ANTLR start synpred5_babel17
    public final void synpred5_babel17_fragment() throws RecognitionException {   
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:421:4: ( pattern ( NL )? ':' )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:421:5: pattern ( NL )? ':'
        {
        pushFollow(FOLLOW_pattern_in_synpred5_babel172086);
        pattern();

        state._fsp--;
        if (state.failed) return ;
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:421:13: ( NL )?
        int alt299=2;
        int LA299_0 = input.LA(1);

        if ( (LA299_0==NL) ) {
            alt299=1;
        }
        switch (alt299) {
            case 1 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:421:13: NL
                {
                match(input,NL,FOLLOW_NL_in_synpred5_babel172088); if (state.failed) return ;

                }
                break;

        }

        match(input,COLON,FOLLOW_COLON_in_synpred5_babel172091); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_babel17

    // $ANTLR start synpred6_babel17
    public final void synpred6_babel17_fragment() throws RecognitionException {   
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:488:4: ( defpattern ( NL )? '=' )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:488:5: defpattern ( NL )? '='
        {
        pushFollow(FOLLOW_defpattern_in_synpred6_babel172903);
        defpattern();

        state._fsp--;
        if (state.failed) return ;
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:488:16: ( NL )?
        int alt300=2;
        int LA300_0 = input.LA(1);

        if ( (LA300_0==NL) ) {
            alt300=1;
        }
        switch (alt300) {
            case 1 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:488:16: NL
                {
                match(input,NL,FOLLOW_NL_in_synpred6_babel172905); if (state.failed) return ;

                }
                break;

        }

        match(input,ASSIGN,FOLLOW_ASSIGN_in_synpred6_babel172908); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred6_babel17

    // $ANTLR start synpred7_babel17
    public final void synpred7_babel17_fragment() throws RecognitionException {   
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:532:4: ( ( pattern | objelem_assign ) ( NL )? '=' )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:532:5: ( pattern | objelem_assign ) ( NL )? '='
        {
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:532:5: ( pattern | objelem_assign )
        int alt301=2;
        int LA301_0 = input.LA(1);

        if ( (LA301_0==L_exception||(LA301_0>=A_infinity && LA301_0<=U_infinity)||(LA301_0>=L_true && LA301_0<=L_false)||LA301_0==L_nil||LA301_0==MINUS||(LA301_0>=A_ELLIPSIS && LA301_0<=U_ELLIPSIS)||LA301_0==Constr||LA301_0==Num||(LA301_0>=String && LA301_0<=ROUND_BRACKET_OPEN)||LA301_0==SQUARE_BRACKET_OPEN||LA301_0==CURLY_BRACKET_OPEN||LA301_0==UNDERSCORE) ) {
            alt301=1;
        }
        else if ( (LA301_0==Id) ) {
            int LA301_2 = input.LA(2);

            if ( (LA301_2==PERIOD) ) {
                alt301=2;
            }
            else if ( (LA301_2==ASSIGN||(LA301_2>=A_DOUBLE_COLON && LA301_2<=U_DOUBLE_COLON)||LA301_2==NL) ) {
                alt301=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 301, 2, input);

                throw nvae;
            }
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 301, 0, input);

            throw nvae;
        }
        switch (alt301) {
            case 1 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:532:6: pattern
                {
                pushFollow(FOLLOW_pattern_in_synpred7_babel173402);
                pattern();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:532:16: objelem_assign
                {
                pushFollow(FOLLOW_objelem_assign_in_synpred7_babel173406);
                objelem_assign();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:532:32: ( NL )?
        int alt302=2;
        int LA302_0 = input.LA(1);

        if ( (LA302_0==NL) ) {
            alt302=1;
        }
        switch (alt302) {
            case 1 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:532:32: NL
                {
                match(input,NL,FOLLOW_NL_in_synpred7_babel173409); if (state.failed) return ;

                }
                break;

        }

        match(input,ASSIGN,FOLLOW_ASSIGN_in_synpred7_babel173412); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred7_babel17

    // $ANTLR start synpred8_babel17
    public final void synpred8_babel17_fragment() throws RecognitionException {   
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:567:11: ( L_obj ( NL )? parents )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:567:12: L_obj ( NL )? parents
        {
        match(input,L_obj,FOLLOW_L_obj_in_synpred8_babel173641); if (state.failed) return ;
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:567:18: ( NL )?
        int alt303=2;
        int LA303_0 = input.LA(1);

        if ( (LA303_0==NL) ) {
            alt303=1;
        }
        switch (alt303) {
            case 1 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:567:18: NL
                {
                match(input,NL,FOLLOW_NL_in_synpred8_babel173643); if (state.failed) return ;

                }
                break;

        }

        pushFollow(FOLLOW_parents_in_synpred8_babel173646);
        parents();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred8_babel17

    // $ANTLR start synpred9_babel17
    public final void synpred9_babel17_fragment() throws RecognitionException {   
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:571:4: ( lambda_expr )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:571:5: lambda_expr
        {
        pushFollow(FOLLOW_lambda_expr_in_synpred9_babel173715);
        lambda_expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred9_babel17

    // $ANTLR start synpred10_babel17
    public final void synpred10_babel17_fragment() throws RecognitionException {   
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:572:4: ( lambda_expr_nobrackets )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:572:5: lambda_expr_nobrackets
        {
        pushFollow(FOLLOW_lambda_expr_nobrackets_in_synpred10_babel173726);
        lambda_expr_nobrackets();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred10_babel17

    // $ANTLR start synpred11_babel17
    public final void synpred11_babel17_fragment() throws RecognitionException {   
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:576:4: ( lambda_expr )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:576:5: lambda_expr
        {
        pushFollow(FOLLOW_lambda_expr_in_synpred11_babel173747);
        lambda_expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred11_babel17

    // $ANTLR start synpred12_babel17
    public final void synpred12_babel17_fragment() throws RecognitionException {   
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:577:4: ( lambda_expr_nobrackets )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:577:5: lambda_expr_nobrackets
        {
        pushFollow(FOLLOW_lambda_expr_nobrackets_in_synpred12_babel173758);
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
    protected DFA134 dfa134 = new DFA134(this);
    protected DFA144 dfa144 = new DFA144(this);
    protected DFA145 dfa145 = new DFA145(this);
    protected DFA295 dfa295 = new DFA295(this);
    static final String DFA34_eotS =
        "\42\uffff";
    static final String DFA34_eofS =
        "\42\uffff";
    static final String DFA34_minS =
        "\1\104\17\0\6\uffff\1\0\13\uffff";
    static final String DFA34_maxS =
        "\1\u00a1\17\0\6\uffff\1\0\13\uffff";
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
            return "413:1: bracket_pattern : ( ( Id ( NL )? L_as )=> Id ( NL )? L_as ( NL )? pattern -> ^( L_as Id pattern ) | ( protected_expr ( NL )? QUESTION_MARK )=> protected_expr ( NL )? QUESTION_MARK ( ( NL )? pattern )? -> ^( QUESTION_MARK protected_expr ( pattern )? ) | ( Id pattern )=> Id pattern -> ^( INNERVALUE_PATTERN Id pattern ) | L_val ( NL )? protected_expr_nc -> ^( L_val protected_expr_nc ) | L_for ( NL )? ( bracket_pattern ( ( NL )? COMMA ( NL )? bracket_pattern )* ( NL )? )? L_end -> ^( L_for ( bracket_pattern )* ) | ( pattern ( NL )? L_if )=> pattern ( NL )? L_if ( NL )? protected_expr_nc -> ^( IF_PATTERN pattern protected_expr_nc ) | ( pattern ( NL )? ':' )=> pattern ( NL )? ':' ( NL )? typeannotation -> ^( TYPE_PATTERN typeannotation pattern ) | pattern );";
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
        "\1\133\10\uffff\1\133\2\uffff\1\104\1\133\2\uffff\1\104\2\uffff";
    static final String DFA63_maxS =
        "\1\u00a1\10\uffff\1\u0098\2\uffff\1\u00a1\1\u0098\2\uffff\1\u00a1"+
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
            return "432:1: primitive_pattern : ( Id | '_' -> ANY | String | Num | L_true | L_false | L_nil | token_infinity | '-' ( NL )? token_infinity -> ^( UMINUS token_infinity ) | '-' ( NL )? Num -> ^( UMINUS Num ) | '[' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* )? ']' -> ^( SQUARE_LIST ( bracket_pattern )* ) | '(' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* ( COMMA ( NL )? )? )? ')' -> ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( bracket_pattern )* ) ) | '{' ( NL )? ( mselem_pattern ( NL )? ( COMMA ( NL )? mselem_pattern ( NL )? )* )? '}' -> ^( MAP_OR_SET_OR_OBJ ( mselem_pattern )* ) | '{' ( NL )? token_ARROW ( NL )? '}' -> ^( EMPTY_MAP ) );";
        }
    }
    static final String DFA69_eotS =
        "\4\uffff";
    static final String DFA69_eofS =
        "\2\3\2\uffff";
    static final String DFA69_minS =
        "\2\104\2\uffff";
    static final String DFA69_maxS =
        "\2\u00a6\2\uffff";
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
            return "454:1: block : ( ( sep )? statement ( sep statement )* ( sep )? -> ^( BLOCK ( statement )* ) | ( sep )? -> ^( BLOCK ) );";
        }
    }
    static final String DFA66_eotS =
        "\4\uffff";
    static final String DFA66_eofS =
        "\2\2\2\uffff";
    static final String DFA66_minS =
        "\1\105\1\104\2\uffff";
    static final String DFA66_maxS =
        "\1\u0095\1\u00a6\2\uffff";
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
            return "()* loopback of 454:25: ( sep statement )*";
        }
    }
    static final String DFA71_eotS =
        "\16\uffff";
    static final String DFA71_eofS =
        "\16\uffff";
    static final String DFA71_minS =
        "\1\104\15\uffff";
    static final String DFA71_maxS =
        "\1\u00a6\15\uffff";
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
            return "460:1: statement : ( st_typedef | st_val | st_def | st_yield | st_memoize | st_private | st_module | st_import | expr_or_assign | PRAGMA_PRINT expr -> ^( PRAGMA_PRINT expr ) | PRAGMA_LOG expr -> ^( PRAGMA_LOG expr ) | PRAGMA_PROFILE expr -> ^( PRAGMA_PROFILE expr ) | PRAGMA_ASSERT expr -> ^( PRAGMA_ASSERT expr ) );";
        }
    }
    static final String DFA97_eotS =
        "\20\uffff";
    static final String DFA97_eofS =
        "\20\uffff";
    static final String DFA97_minS =
        "\1\133\15\0\2\uffff";
    static final String DFA97_maxS =
        "\1\u00a1\15\0\2\uffff";
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
            return "487:1: typedef_clause : ( ( defpattern ( NL )? '=' )=> defpattern ( NL )? '=' ( NL )? expr -> ^( TYPEDEF_CLAUSE defpattern expr ) | defpattern -> ^( TYPEDEF_CLAUSE defpattern ) );";
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
    static final String DFA134_eotS =
        "\34\uffff";
    static final String DFA134_eofS =
        "\34\uffff";
    static final String DFA134_minS =
        "\1\104\17\0\14\uffff";
    static final String DFA134_maxS =
        "\1\u00a1\17\0\14\uffff";
    static final String DFA134_acceptS =
        "\20\uffff\1\2\12\uffff\1\1";
    static final String DFA134_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\14\uffff}>";
    static final String[] DFA134_transitionS = {
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

    static final short[] DFA134_eot = DFA.unpackEncodedString(DFA134_eotS);
    static final short[] DFA134_eof = DFA.unpackEncodedString(DFA134_eofS);
    static final char[] DFA134_min = DFA.unpackEncodedStringToUnsignedChars(DFA134_minS);
    static final char[] DFA134_max = DFA.unpackEncodedStringToUnsignedChars(DFA134_maxS);
    static final short[] DFA134_accept = DFA.unpackEncodedString(DFA134_acceptS);
    static final short[] DFA134_special = DFA.unpackEncodedString(DFA134_specialS);
    static final short[][] DFA134_transition;

    static {
        int numStates = DFA134_transitionS.length;
        DFA134_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA134_transition[i] = DFA.unpackEncodedString(DFA134_transitionS[i]);
        }
    }

    class DFA134 extends DFA {

        public DFA134(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 134;
            this.eot = DFA134_eot;
            this.eof = DFA134_eof;
            this.min = DFA134_min;
            this.max = DFA134_max;
            this.accept = DFA134_accept;
            this.special = DFA134_special;
            this.transition = DFA134_transition;
        }
        public String getDescription() {
            return "531:1: expr_or_assign : ( ( ( pattern | objelem_assign ) ( NL )? '=' )=> ( pattern | objelem_assign ) ( NL )? '=' ( NL )? expr -> ^( ASSIGN ( pattern )* ( objelem_assign )* expr ) | expr );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA134_1 = input.LA(1);

                         
                        int index134_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index134_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA134_2 = input.LA(1);

                         
                        int index134_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index134_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA134_3 = input.LA(1);

                         
                        int index134_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index134_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA134_4 = input.LA(1);

                         
                        int index134_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index134_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA134_5 = input.LA(1);

                         
                        int index134_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index134_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA134_6 = input.LA(1);

                         
                        int index134_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index134_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA134_7 = input.LA(1);

                         
                        int index134_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index134_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA134_8 = input.LA(1);

                         
                        int index134_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index134_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA134_9 = input.LA(1);

                         
                        int index134_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index134_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA134_10 = input.LA(1);

                         
                        int index134_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index134_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA134_11 = input.LA(1);

                         
                        int index134_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index134_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA134_12 = input.LA(1);

                         
                        int index134_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index134_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA134_13 = input.LA(1);

                         
                        int index134_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index134_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA134_14 = input.LA(1);

                         
                        int index134_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index134_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA134_15 = input.LA(1);

                         
                        int index134_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index134_15);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 134, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA144_eotS =
        "\33\uffff";
    static final String DFA144_eofS =
        "\33\uffff";
    static final String DFA144_minS =
        "\1\104\3\0\1\uffff\12\0\14\uffff";
    static final String DFA144_maxS =
        "\1\u00a1\3\0\1\uffff\12\0\14\uffff";
    static final String DFA144_acceptS =
        "\4\uffff\1\2\12\uffff\1\2\1\3\11\uffff\1\1";
    static final String DFA144_specialS =
        "\1\0\1\1\1\2\1\3\1\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\14\uffff}>";
    static final String[] DFA144_transitionS = {
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

    static final short[] DFA144_eot = DFA.unpackEncodedString(DFA144_eotS);
    static final short[] DFA144_eof = DFA.unpackEncodedString(DFA144_eofS);
    static final char[] DFA144_min = DFA.unpackEncodedStringToUnsignedChars(DFA144_minS);
    static final char[] DFA144_max = DFA.unpackEncodedStringToUnsignedChars(DFA144_maxS);
    static final short[] DFA144_accept = DFA.unpackEncodedString(DFA144_acceptS);
    static final short[] DFA144_special = DFA.unpackEncodedString(DFA144_specialS);
    static final short[][] DFA144_transition;

    static {
        int numStates = DFA144_transitionS.length;
        DFA144_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA144_transition[i] = DFA.unpackEncodedString(DFA144_transitionS[i]);
        }
    }

    class DFA144 extends DFA {

        public DFA144(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 144;
            this.eot = DFA144_eot;
            this.eof = DFA144_eof;
            this.min = DFA144_min;
            this.max = DFA144_max;
            this.accept = DFA144_accept;
            this.special = DFA144_special;
            this.transition = DFA144_transition;
        }
        public String getDescription() {
            return "570:1: lop_expr : ( ( lambda_expr )=> lambda_expr | ( lambda_expr_nobrackets )=> lambda_expr_nobrackets | op_expr );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA144_0 = input.LA(1);

                         
                        int index144_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA144_0==ROUND_BRACKET_OPEN) ) {s = 1;}

                        else if ( (LA144_0==Constr) ) {s = 2;}

                        else if ( (LA144_0==Id) ) {s = 3;}

                        else if ( (LA144_0==UNDERSCORE) && (synpred10_babel17())) {s = 4;}

                        else if ( (LA144_0==String) ) {s = 5;}

                        else if ( (LA144_0==Num) ) {s = 6;}

                        else if ( (LA144_0==L_true) ) {s = 7;}

                        else if ( (LA144_0==L_false) ) {s = 8;}

                        else if ( (LA144_0==L_nil) ) {s = 9;}

                        else if ( ((LA144_0>=A_infinity && LA144_0<=U_infinity)) ) {s = 10;}

                        else if ( (LA144_0==MINUS) ) {s = 11;}

                        else if ( (LA144_0==SQUARE_BRACKET_OPEN) ) {s = 12;}

                        else if ( (LA144_0==CURLY_BRACKET_OPEN) ) {s = 13;}

                        else if ( (LA144_0==L_exception) ) {s = 14;}

                        else if ( ((LA144_0>=A_ELLIPSIS && LA144_0<=U_ELLIPSIS)) && (synpred10_babel17())) {s = 15;}

                        else if ( (LA144_0==L_begin||(LA144_0>=L_with && LA144_0<=L_if)||(LA144_0>=L_while && LA144_0<=L_for)||LA144_0==L_match||LA144_0==L_try||(LA144_0>=L_concurrent && LA144_0<=L_lazy)||(LA144_0>=L_this && LA144_0<=L_random)||LA144_0==L_typeof||LA144_0==A_NOT||LA144_0==U_NOT||LA144_0==L_force) ) {s = 16;}

                         
                        input.seek(index144_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA144_1 = input.LA(1);

                         
                        int index144_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_babel17()) ) {s = 26;}

                        else if ( (synpred10_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index144_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA144_2 = input.LA(1);

                         
                        int index144_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index144_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA144_3 = input.LA(1);

                         
                        int index144_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index144_3);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA144_5 = input.LA(1);

                         
                        int index144_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index144_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA144_6 = input.LA(1);

                         
                        int index144_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index144_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA144_7 = input.LA(1);

                         
                        int index144_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index144_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA144_8 = input.LA(1);

                         
                        int index144_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index144_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA144_9 = input.LA(1);

                         
                        int index144_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index144_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA144_10 = input.LA(1);

                         
                        int index144_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index144_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA144_11 = input.LA(1);

                         
                        int index144_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index144_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA144_12 = input.LA(1);

                         
                        int index144_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index144_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA144_13 = input.LA(1);

                         
                        int index144_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index144_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA144_14 = input.LA(1);

                         
                        int index144_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index144_14);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 144, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA145_eotS =
        "\33\uffff";
    static final String DFA145_eofS =
        "\33\uffff";
    static final String DFA145_minS =
        "\1\104\3\0\1\uffff\12\0\14\uffff";
    static final String DFA145_maxS =
        "\1\u00a1\3\0\1\uffff\12\0\14\uffff";
    static final String DFA145_acceptS =
        "\4\uffff\1\2\12\uffff\1\2\1\3\11\uffff\1\1";
    static final String DFA145_specialS =
        "\1\0\1\1\1\2\1\3\1\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\14\uffff}>";
    static final String[] DFA145_transitionS = {
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

    static final short[] DFA145_eot = DFA.unpackEncodedString(DFA145_eotS);
    static final short[] DFA145_eof = DFA.unpackEncodedString(DFA145_eofS);
    static final char[] DFA145_min = DFA.unpackEncodedStringToUnsignedChars(DFA145_minS);
    static final char[] DFA145_max = DFA.unpackEncodedStringToUnsignedChars(DFA145_maxS);
    static final short[] DFA145_accept = DFA.unpackEncodedString(DFA145_acceptS);
    static final short[] DFA145_special = DFA.unpackEncodedString(DFA145_specialS);
    static final short[][] DFA145_transition;

    static {
        int numStates = DFA145_transitionS.length;
        DFA145_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA145_transition[i] = DFA.unpackEncodedString(DFA145_transitionS[i]);
        }
    }

    class DFA145 extends DFA {

        public DFA145(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 145;
            this.eot = DFA145_eot;
            this.eof = DFA145_eof;
            this.min = DFA145_min;
            this.max = DFA145_max;
            this.accept = DFA145_accept;
            this.special = DFA145_special;
            this.transition = DFA145_transition;
        }
        public String getDescription() {
            return "575:1: p_lop_expr : ( ( lambda_expr )=> lambda_expr | ( lambda_expr_nobrackets )=> lambda_expr_nobrackets | p_op_expr );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA145_0 = input.LA(1);

                         
                        int index145_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA145_0==ROUND_BRACKET_OPEN) ) {s = 1;}

                        else if ( (LA145_0==Constr) ) {s = 2;}

                        else if ( (LA145_0==Id) ) {s = 3;}

                        else if ( (LA145_0==UNDERSCORE) && (synpred12_babel17())) {s = 4;}

                        else if ( (LA145_0==String) ) {s = 5;}

                        else if ( (LA145_0==Num) ) {s = 6;}

                        else if ( (LA145_0==L_true) ) {s = 7;}

                        else if ( (LA145_0==L_false) ) {s = 8;}

                        else if ( (LA145_0==L_nil) ) {s = 9;}

                        else if ( ((LA145_0>=A_infinity && LA145_0<=U_infinity)) ) {s = 10;}

                        else if ( (LA145_0==MINUS) ) {s = 11;}

                        else if ( (LA145_0==SQUARE_BRACKET_OPEN) ) {s = 12;}

                        else if ( (LA145_0==CURLY_BRACKET_OPEN) ) {s = 13;}

                        else if ( (LA145_0==L_exception) ) {s = 14;}

                        else if ( ((LA145_0>=A_ELLIPSIS && LA145_0<=U_ELLIPSIS)) && (synpred12_babel17())) {s = 15;}

                        else if ( (LA145_0==L_begin||(LA145_0>=L_with && LA145_0<=L_if)||(LA145_0>=L_while && LA145_0<=L_for)||LA145_0==L_match||LA145_0==L_try||(LA145_0>=L_concurrent && LA145_0<=L_lazy)||(LA145_0>=L_this && LA145_0<=L_random)||LA145_0==L_typeof||LA145_0==A_NOT||LA145_0==U_NOT||LA145_0==L_force) ) {s = 16;}

                         
                        input.seek(index145_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA145_1 = input.LA(1);

                         
                        int index145_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_babel17()) ) {s = 26;}

                        else if ( (synpred12_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index145_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA145_2 = input.LA(1);

                         
                        int index145_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index145_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA145_3 = input.LA(1);

                         
                        int index145_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index145_3);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA145_5 = input.LA(1);

                         
                        int index145_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index145_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA145_6 = input.LA(1);

                         
                        int index145_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index145_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA145_7 = input.LA(1);

                         
                        int index145_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index145_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA145_8 = input.LA(1);

                         
                        int index145_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index145_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA145_9 = input.LA(1);

                         
                        int index145_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index145_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA145_10 = input.LA(1);

                         
                        int index145_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index145_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA145_11 = input.LA(1);

                         
                        int index145_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index145_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA145_12 = input.LA(1);

                         
                        int index145_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index145_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA145_13 = input.LA(1);

                         
                        int index145_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index145_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA145_14 = input.LA(1);

                         
                        int index145_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index145_14);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 145, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA295_eotS =
        "\20\uffff";
    static final String DFA295_eofS =
        "\20\uffff";
    static final String DFA295_minS =
        "\1\104\10\uffff\1\104\4\uffff\1\104\1\uffff";
    static final String DFA295_maxS =
        "\1\u009f\10\uffff\1\u00a2\4\uffff\1\u00a2\1\uffff";
    static final String DFA295_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\uffff\1\12\1\13\1\14"+
        "\1\15\1\uffff\1\11";
    static final String DFA295_specialS =
        "\20\uffff}>";
    static final String[] DFA295_transitionS = {
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

    static final short[] DFA295_eot = DFA.unpackEncodedString(DFA295_eotS);
    static final short[] DFA295_eof = DFA.unpackEncodedString(DFA295_eofS);
    static final char[] DFA295_min = DFA.unpackEncodedStringToUnsignedChars(DFA295_minS);
    static final char[] DFA295_max = DFA.unpackEncodedStringToUnsignedChars(DFA295_maxS);
    static final short[] DFA295_accept = DFA.unpackEncodedString(DFA295_acceptS);
    static final short[] DFA295_special = DFA.unpackEncodedString(DFA295_specialS);
    static final short[][] DFA295_transition;

    static {
        int numStates = DFA295_transitionS.length;
        DFA295_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA295_transition[i] = DFA.unpackEncodedString(DFA295_transitionS[i]);
        }
    }

    class DFA295 extends DFA {

        public DFA295(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 295;
            this.eot = DFA295_eot;
            this.eof = DFA295_eof;
            this.min = DFA295_min;
            this.max = DFA295_max;
            this.accept = DFA295_accept;
            this.special = DFA295_special;
            this.transition = DFA295_transition;
        }
        public String getDescription() {
            return "764:1: primitive_expr : ( Num | String | Id | Constr | L_true | L_false | L_this | L_nil | type_expr | token_infinity | list_expr | with_control_expr | map_or_set_expr );";
        }
    }
 

    public static final BitSet FOLLOW_block_in_prog251 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_prog253 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_Id_in_typeid1684 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000210000L});
    public static final BitSet FOLLOW_NL_in_typeid1687 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_PERIOD_in_typeid1690 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000A00000L});
    public static final BitSet FOLLOW_NL_in_typeid1692 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_Id_in_typeid1695 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000210000L});
    public static final BitSet FOLLOW_typeid_in_typeannotation1715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_val_in_typeannotation1720 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA4131D0L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_typeannotation1722 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA4131D0L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_protected_expr_nc_in_typeannotation1725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Constr_in_pattern1742 = new BitSet(new long[]{0x0000000000000002L,0x0200002618400000L,0x00000002ADE06000L});
    public static final BitSet FOLLOW_NL_in_pattern1745 = new BitSet(new long[]{0x0000000000000000L,0x0200002618400000L,0x00000002ADC06000L});
    public static final BitSet FOLLOW_pattern_in_pattern1748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitive_pattern_in_pattern1764 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000200018L});
    public static final BitSet FOLLOW_NL_in_pattern1767 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200018L});
    public static final BitSet FOLLOW_token_DOUBLE_COLON_in_pattern1770 = new BitSet(new long[]{0x0000000000000000L,0x0200002618000000L,0x00000002ADA00000L});
    public static final BitSet FOLLOW_NL_in_pattern1772 = new BitSet(new long[]{0x0000000000000000L,0x0200002618000000L,0x00000002AD800000L});
    public static final BitSet FOLLOW_primitive_pattern_in_pattern1775 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000200018L});
    public static final BitSet FOLLOW_L_exception_in_pattern1794 = new BitSet(new long[]{0x0000000000000000L,0x0200002618400000L,0x00000002ADE06000L});
    public static final BitSet FOLLOW_NL_in_pattern1796 = new BitSet(new long[]{0x0000000000000000L,0x0200002618400000L,0x00000002ADC06000L});
    public static final BitSet FOLLOW_pattern_in_pattern1799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_ELLIPSIS_in_pattern1812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitive_pattern_in_defpattern1822 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000200018L});
    public static final BitSet FOLLOW_NL_in_defpattern1825 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200018L});
    public static final BitSet FOLLOW_token_DOUBLE_COLON_in_defpattern1828 = new BitSet(new long[]{0x0000000000000000L,0x0200002618000000L,0x00000002ADA00000L});
    public static final BitSet FOLLOW_NL_in_defpattern1830 = new BitSet(new long[]{0x0000000000000000L,0x0200002618000000L,0x00000002AD800000L});
    public static final BitSet FOLLOW_primitive_pattern_in_defpattern1833 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000200018L});
    public static final BitSet FOLLOW_Constr_in_defpattern1851 = new BitSet(new long[]{0x0000000000000002L,0x0200002618000000L,0x00000002ADC00000L});
    public static final BitSet FOLLOW_defpattern_in_defpattern1853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Id_in_bracket_pattern1890 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L,0x0000000000200000L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1892 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_L_as_in_bracket_pattern1895 = new BitSet(new long[]{0x0000000000000000L,0x0200002618400000L,0x00000002ADE06000L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1897 = new BitSet(new long[]{0x0000000000000000L,0x0200002618400000L,0x00000002ADC06000L});
    public static final BitSet FOLLOW_pattern_in_bracket_pattern1900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protected_expr_in_bracket_pattern1929 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000220000L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1931 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_QUESTION_MARK_in_bracket_pattern1934 = new BitSet(new long[]{0x0000000000000002L,0x0200002618400000L,0x00000002ADE06000L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1937 = new BitSet(new long[]{0x0000000000000000L,0x0200002618400000L,0x00000002ADC06000L});
    public static final BitSet FOLLOW_pattern_in_bracket_pattern1940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Id_in_bracket_pattern1966 = new BitSet(new long[]{0x0000000000000000L,0x0200002618400000L,0x00000002ADC06000L});
    public static final BitSet FOLLOW_pattern_in_bracket_pattern1968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_val_in_bracket_pattern1983 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA4131D0L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1985 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA4131D0L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_protected_expr_nc_in_bracket_pattern1988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_for_in_bracket_pattern2007 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA4931F0L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern2009 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA4931F0L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_bracket_pattern_in_bracket_pattern2013 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L,0x0000000000208000L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern2017 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_COMMA_in_bracket_pattern2020 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA4931D0L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern2022 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA4931D0L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_bracket_pattern_in_bracket_pattern2025 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L,0x0000000000208000L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern2030 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_L_end_in_bracket_pattern2035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_bracket_pattern2060 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L,0x0000000000200000L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern2062 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_L_if_in_bracket_pattern2065 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA4131D0L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern2067 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA4131D0L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_protected_expr_nc_in_bracket_pattern2070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_bracket_pattern2096 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400200000L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern2098 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_COLON_in_bracket_pattern2101 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000000A00000L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern2103 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000000A00000L});
    public static final BitSet FOLLOW_typeannotation_in_bracket_pattern2106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_bracket_pattern2121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_ARROW_in_arrow_or_assign2131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGN_in_arrow_or_assign2142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracket_pattern_in_mselem_pattern2157 = new BitSet(new long[]{0x0000000200000002L,0x0000000000000000L,0x0000000000201800L});
    public static final BitSet FOLLOW_NL_in_mselem_pattern2160 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000000L,0x0000000000201800L});
    public static final BitSet FOLLOW_arrow_or_assign_in_mselem_pattern2163 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA4931D0L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_mselem_pattern2165 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA4931D0L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_bracket_pattern_in_mselem_pattern2168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Id_in_primitive_pattern2197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNDERSCORE_in_primitive_pattern2202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_String_in_primitive_pattern2211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Num_in_primitive_pattern2216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_true_in_primitive_pattern2221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_false_in_primitive_pattern2226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_nil_in_primitive_pattern2231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_infinity_in_primitive_pattern2236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_primitive_pattern2241 = new BitSet(new long[]{0x0000000000000000L,0x0000000018000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2243 = new BitSet(new long[]{0x0000000000000000L,0x0000000018000000L});
    public static final BitSet FOLLOW_token_infinity_in_primitive_pattern2246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_primitive_pattern2259 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001200000L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2261 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_Num_in_primitive_pattern2264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SQUARE_BRACKET_OPEN_in_primitive_pattern2277 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA4931D0L,0x00000002EDE46004L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2280 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA4931D0L,0x00000002EDE46004L});
    public static final BitSet FOLLOW_bracket_pattern_in_primitive_pattern2284 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040208000L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2286 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040008000L});
    public static final BitSet FOLLOW_COMMA_in_primitive_pattern2291 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA4931D0L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2293 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA4931D0L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_bracket_pattern_in_primitive_pattern2296 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040208000L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2298 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040008000L});
    public static final BitSet FOLLOW_SQUARE_BRACKET_CLOSE_in_primitive_pattern2306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROUND_BRACKET_OPEN_in_primitive_pattern2326 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA4931D0L,0x00000002BDE46004L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2329 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA4931D0L,0x00000002BDE46004L});
    public static final BitSet FOLLOW_bracket_pattern_in_primitive_pattern2333 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010208000L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2335 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010008000L});
    public static final BitSet FOLLOW_COMMA_in_primitive_pattern2340 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA4931D0L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2343 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA4931D0L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_bracket_pattern_in_primitive_pattern2346 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010208000L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2348 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010008000L});
    public static final BitSet FOLLOW_COMMA_in_primitive_pattern2354 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010200000L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2356 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_ROUND_BRACKET_CLOSE_in_primitive_pattern2363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURLY_BRACKET_OPEN_in_primitive_pattern2395 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA4931D0L,0x00000003ADE46004L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2398 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA4931D0L,0x00000003ADE46004L});
    public static final BitSet FOLLOW_mselem_pattern_in_primitive_pattern2402 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100208000L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2404 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100008000L});
    public static final BitSet FOLLOW_COMMA_in_primitive_pattern2409 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA4931D0L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2412 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA4931D0L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_mselem_pattern_in_primitive_pattern2415 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100208000L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2417 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100008000L});
    public static final BitSet FOLLOW_CURLY_BRACKET_CLOSE_in_primitive_pattern2425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURLY_BRACKET_OPEN_in_primitive_pattern2443 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000201800L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2445 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_token_ARROW_in_primitive_pattern2448 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100200000L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2450 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_CURLY_BRACKET_CLOSE_in_primitive_pattern2453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_sep2469 = new BitSet(new long[]{0x0000000000000002L,0x0080000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_sep_in_block2485 = new BitSet(new long[]{0x0000000000000000L,0x82001F3FFA59B1D0L,0x0000007AADE46004L});
    public static final BitSet FOLLOW_statement_in_block2488 = new BitSet(new long[]{0x0000000000000002L,0x0080000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_sep_in_block2491 = new BitSet(new long[]{0x0000000000000000L,0x82001F3FFA59B1D0L,0x0000007AADE46004L});
    public static final BitSet FOLLOW_statement_in_block2493 = new BitSet(new long[]{0x0000000000000002L,0x0080000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_sep_in_block2497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sep_in_block2513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_pure_block2530 = new BitSet(new long[]{0x0000000000000002L,0x0080000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_sep_in_pure_block2533 = new BitSet(new long[]{0x0000000000000000L,0x82001F3FFA59B1D0L,0x0000007AADE46004L});
    public static final BitSet FOLLOW_statement_in_pure_block2535 = new BitSet(new long[]{0x0000000000000002L,0x0080000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_st_typedef_in_statement2556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_val_in_statement2567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_def_in_statement2572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_yield_in_statement2577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_memoize_in_statement2582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_private_in_statement2587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_module_in_statement2592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_import_in_statement2597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_or_assign_in_statement2602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRAGMA_PRINT_in_statement2608 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA4131D0L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_expr_in_statement2610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRAGMA_LOG_in_statement2624 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA4131D0L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_expr_in_statement2626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRAGMA_PROFILE_in_statement2640 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA4131D0L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_expr_in_statement2642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRAGMA_ASSERT_in_statement2656 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA4131D0L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_expr_in_statement2658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Id_in_objelem_assign2676 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_PERIOD_in_objelem_assign2678 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_Id_in_objelem_assign2680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_val_in_st_val2699 = new BitSet(new long[]{0x0000000000000000L,0x0200002618400000L,0x00000002ADE06000L});
    public static final BitSet FOLLOW_NL_in_st_val2701 = new BitSet(new long[]{0x0000000000000000L,0x0200002618400000L,0x00000002ADC06000L});
    public static final BitSet FOLLOW_pattern_in_st_val2705 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_objelem_assign_in_st_val2709 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_NL_in_st_val2712 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ASSIGN_in_st_val2715 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA4131D0L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_st_val2717 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA4131D0L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_expr_in_st_val2720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_def_in_st_def2744 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000A00000L});
    public static final BitSet FOLLOW_NL_in_st_def2746 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_Id_in_st_def2749 = new BitSet(new long[]{0x0000000200000000L,0x0200002618000000L,0x00000006ADE00000L});
    public static final BitSet FOLLOW_NL_in_st_def2751 = new BitSet(new long[]{0x0000000200000000L,0x0200002618000000L,0x00000006ADC00000L});
    public static final BitSet FOLLOW_defpattern_in_st_def2755 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000000L,0x0000000400200000L});
    public static final BitSet FOLLOW_NL_in_st_def2757 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_COLON_in_st_def2763 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000A00000L});
    public static final BitSet FOLLOW_NL_in_st_def2765 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_typeid_in_st_def2768 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_NL_in_st_def2770 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ASSIGN_in_st_def2775 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA4131D0L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_st_def2777 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA4131D0L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_expr_in_st_def2780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_def_in_st_def2806 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_NL_in_st_def2808 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_L_this_in_st_def2811 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400200000L});
    public static final BitSet FOLLOW_NL_in_st_def2813 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_COLON_in_st_def2816 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000A00000L});
    public static final BitSet FOLLOW_NL_in_st_def2818 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_typeid_in_st_def2821 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_NL_in_st_def2823 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ASSIGN_in_st_def2826 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA4131D0L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_st_def2828 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA4131D0L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_expr_in_st_def2831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_typedef_in_st_typedef2854 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000A00000L});
    public static final BitSet FOLLOW_NL_in_st_typedef2856 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_Id_in_st_typedef2859 = new BitSet(new long[]{0x0000000000000000L,0x0200002618000000L,0x00000002ADE00000L});
    public static final BitSet FOLLOW_NL_in_st_typedef2861 = new BitSet(new long[]{0x0000000000000000L,0x0200002618000000L,0x00000002ADE00000L});
    public static final BitSet FOLLOW_typedef_clause_in_st_typedef2864 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000208000L});
    public static final BitSet FOLLOW_NL_in_st_typedef2867 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_COMMA_in_st_typedef2870 = new BitSet(new long[]{0x0000000000000000L,0x0200002618000000L,0x00000002ADE00000L});
    public static final BitSet FOLLOW_NL_in_st_typedef2872 = new BitSet(new long[]{0x0000000000000000L,0x0200002618000000L,0x00000002ADE00000L});
    public static final BitSet FOLLOW_typedef_clause_in_st_typedef2875 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000208000L});
    public static final BitSet FOLLOW_defpattern_in_typedef_clause2913 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_NL_in_typedef_clause2915 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ASSIGN_in_typedef_clause2918 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA4131D0L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_typedef_clause2920 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA4131D0L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_expr_in_typedef_clause2923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_defpattern_in_typedef_clause2938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_yield_in_st_yield2957 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA4131D0L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_expr_in_st_yield2959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_memoize_in_st_memoize2980 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008800000L});
    public static final BitSet FOLLOW_memo_id_in_st_memoize2982 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000208000L});
    public static final BitSet FOLLOW_NL_in_st_memoize2985 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_COMMA_in_st_memoize2988 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008A00000L});
    public static final BitSet FOLLOW_NL_in_st_memoize2990 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008800000L});
    public static final BitSet FOLLOW_memo_id_in_st_memoize2993 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000208000L});
    public static final BitSet FOLLOW_Id_in_memo_id3022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROUND_BRACKET_OPEN_in_memo_id3035 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_Id_in_memo_id3037 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_ROUND_BRACKET_CLOSE_in_memo_id3039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_private_in_st_private3056 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008800000L});
    public static final BitSet FOLLOW_private_id_in_st_private3058 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000208000L});
    public static final BitSet FOLLOW_NL_in_st_private3061 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_COMMA_in_st_private3064 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008A00000L});
    public static final BitSet FOLLOW_NL_in_st_private3066 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008800000L});
    public static final BitSet FOLLOW_private_id_in_st_private3069 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000208000L});
    public static final BitSet FOLLOW_Id_in_private_id3095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROUND_BRACKET_OPEN_in_private_id3108 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_Id_in_private_id3110 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_ROUND_BRACKET_CLOSE_in_private_id3112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Id_in_moduleid3131 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000210000L});
    public static final BitSet FOLLOW_NL_in_moduleid3134 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_PERIOD_in_moduleid3137 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000A00000L});
    public static final BitSet FOLLOW_NL_in_moduleid3139 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_Id_in_moduleid3142 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000210000L});
    public static final BitSet FOLLOW_L_module_in_st_module3162 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000A00000L});
    public static final BitSet FOLLOW_NL_in_st_module3164 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000A00000L});
    public static final BitSet FOLLOW_moduleid_in_st_module3167 = new BitSet(new long[]{0x0000000000000000L,0x82801F3FFA59B1F0L,0x0000007AADE46004L});
    public static final BitSet FOLLOW_block_in_st_module3169 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_L_end_in_st_module3171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Id_in_importprefix3191 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000210000L});
    public static final BitSet FOLLOW_NL_in_importprefix3194 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_PERIOD_in_importprefix3197 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000A00000L});
    public static final BitSet FOLLOW_NL_in_importprefix3199 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_Id_in_importprefix3202 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000210000L});
    public static final BitSet FOLLOW_UNDERSCORE_in_importall3224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Id_in_importsetclause3240 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000200600L});
    public static final BitSet FOLLOW_NL_in_importsetclause3243 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200600L});
    public static final BitSet FOLLOW_token_DOUBLE_ARROW_in_importsetclause3246 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000A00000L});
    public static final BitSet FOLLOW_NL_in_importsetclause3249 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_Id_in_importsetclause3252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_importsetclause3270 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000A00000L});
    public static final BitSet FOLLOW_NL_in_importsetclause3272 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_Id_in_importsetclause3275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURLY_BRACKET_OPEN_in_importset3294 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L,0x0000000000A00000L});
    public static final BitSet FOLLOW_NL_in_importset3296 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L,0x0000000000A00000L});
    public static final BitSet FOLLOW_importsetclause_in_importset3299 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100208000L});
    public static final BitSet FOLLOW_NL_in_importset3302 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_COMMA_in_importset3305 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L,0x0000000000A00000L});
    public static final BitSet FOLLOW_NL_in_importset3307 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L,0x0000000000A00000L});
    public static final BitSet FOLLOW_importsetclause_in_importset3310 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100208000L});
    public static final BitSet FOLLOW_NL_in_importset3314 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_CURLY_BRACKET_CLOSE_in_importset3317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_import_in_st_import3335 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000A00000L});
    public static final BitSet FOLLOW_NL_in_st_import3337 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000A00000L});
    public static final BitSet FOLLOW_importprefix_in_st_import3340 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000210600L});
    public static final BitSet FOLLOW_NL_in_st_import3343 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000210600L});
    public static final BitSet FOLLOW_PERIOD_in_st_import3347 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000200200000L});
    public static final BitSet FOLLOW_NL_in_st_import3349 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000200200000L});
    public static final BitSet FOLLOW_importall_in_st_import3352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERIOD_in_st_import3356 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000080200000L});
    public static final BitSet FOLLOW_NL_in_st_import3358 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000080200000L});
    public static final BitSet FOLLOW_importset_in_st_import3361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_DOUBLE_ARROW_in_st_import3365 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000A00000L});
    public static final BitSet FOLLOW_NL_in_st_import3367 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_Id_in_st_import3370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_expr_or_assign3418 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_objelem_assign_in_expr_or_assign3422 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_NL_in_expr_or_assign3425 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ASSIGN_in_expr_or_assign3428 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA4131D0L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_expr_or_assign3430 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA4131D0L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_expr_in_expr_or_assign3433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_or_assign3452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lop_expr_in_expr3463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_obj_expr_in_expr3468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_expr_in_control_expr3478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_do_expr_in_control_expr3483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_match_expr_in_control_expr3488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_expr_in_control_expr3493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_try_expr_in_control_expr3499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_begin_end_in_control_expr3504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_control_expr_in_with_control_expr3514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_with_in_with_control_expr3519 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA4131D0L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_with_control_expr3521 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA4131D0L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_protected_expr_in_with_control_expr3524 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L,0x0000000000200000L});
    public static final BitSet FOLLOW_NL_in_with_control_expr3526 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_L_do_in_with_control_expr3529 = new BitSet(new long[]{0x0000000000000000L,0x82801F3FFA59B1F0L,0x0000007AADE46004L});
    public static final BitSet FOLLOW_block_in_with_control_expr3531 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_L_end_in_with_control_expr3533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_lop_expr_in_protected_expr3558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_obj_expr_in_protected_expr3563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protected_expr_in_protected_expr_nc3574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_begin_in_begin_end3584 = new BitSet(new long[]{0x0000000000000000L,0x82801F3FFA59B1F0L,0x0000007AADE46004L});
    public static final BitSet FOLLOW_block_in_begin_end3586 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_L_end_in_begin_end3588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_parents3606 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA413190L,0x00000002ADC46004L});
    public static final BitSet FOLLOW_primitive_expr_in_parents3608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIMES_in_parents3621 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA413190L,0x00000002ADC46004L});
    public static final BitSet FOLLOW_primitive_expr_in_parents3623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_obj_in_obj_expr3651 = new BitSet(new long[]{0x0000000000000000L,0x0500000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_NL_in_obj_expr3653 = new BitSet(new long[]{0x0000000000000000L,0x0500000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_parents_in_obj_expr3656 = new BitSet(new long[]{0x0000000000000000L,0x82801F3FFA59B1F0L,0x0000007AADE46004L});
    public static final BitSet FOLLOW_block_in_obj_expr3658 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_L_end_in_obj_expr3660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_obj_in_obj_expr3688 = new BitSet(new long[]{0x0000000000000000L,0x82801F3FFA59B1F0L,0x0000007AADE46004L});
    public static final BitSet FOLLOW_block_in_obj_expr3690 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_L_end_in_obj_expr3692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_expr_in_lop_expr3720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_expr_nobrackets_in_lop_expr3731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_op_expr_in_lop_expr3736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_expr_in_p_lop_expr3752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_expr_nobrackets_in_p_lop_expr3763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_op_expr_in_p_lop_expr3768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_if_in_if_expr3778 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA4131D0L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_if_expr3780 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA4131D0L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_protected_expr_in_if_expr3783 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L,0x0000000000200000L});
    public static final BitSet FOLLOW_NL_in_if_expr3785 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_L_then_in_if_expr3788 = new BitSet(new long[]{0x0000000000000000L,0x82801F3FFA59BDF0L,0x0000007AADE46004L});
    public static final BitSet FOLLOW_block_in_if_expr3790 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000C20L});
    public static final BitSet FOLLOW_L_elseif_in_if_expr3796 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA4131D0L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_if_expr3798 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA4131D0L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_protected_expr_in_if_expr3801 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L,0x0000000000200000L});
    public static final BitSet FOLLOW_NL_in_if_expr3803 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_L_then_in_if_expr3806 = new BitSet(new long[]{0x0000000000000000L,0x82801F3FFA59BDF0L,0x0000007AADE46004L});
    public static final BitSet FOLLOW_block_in_if_expr3808 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000C20L});
    public static final BitSet FOLLOW_L_else_in_if_expr3816 = new BitSet(new long[]{0x0000000000000000L,0x82801F3FFA59B1F0L,0x0000007AADE46004L});
    public static final BitSet FOLLOW_block_in_if_expr3818 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_L_end_in_if_expr3822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_while_in_while_do_expr3846 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA4131D0L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_while_do_expr3848 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA4131D0L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_protected_expr_in_while_do_expr3851 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L,0x0000000000200000L});
    public static final BitSet FOLLOW_NL_in_while_do_expr3853 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_L_do_in_while_do_expr3856 = new BitSet(new long[]{0x0000000000000000L,0x82801F3FFA59B1F0L,0x0000007AADE46004L});
    public static final BitSet FOLLOW_block_in_while_do_expr3858 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_L_end_in_while_do_expr3860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_full_cases_in_cases3890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_cases3895 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200600L});
    public static final BitSet FOLLOW_NL_in_cases3897 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200600L});
    public static final BitSet FOLLOW_token_DOUBLE_ARROW_in_cases3900 = new BitSet(new long[]{0x0000000000000000L,0x82801F3FFA59B1D0L,0x0000007AADE46004L});
    public static final BitSet FOLLOW_block_in_cases3902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_case_expr_in_full_cases3925 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_L_case_in_case_expr3946 = new BitSet(new long[]{0x0000000000000000L,0x0200002618400000L,0x00000002ADE06000L});
    public static final BitSet FOLLOW_NL_in_case_expr3948 = new BitSet(new long[]{0x0000000000000000L,0x0200002618400000L,0x00000002ADC06000L});
    public static final BitSet FOLLOW_pattern_in_case_expr3951 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200600L});
    public static final BitSet FOLLOW_NL_in_case_expr3953 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200600L});
    public static final BitSet FOLLOW_token_DOUBLE_ARROW_in_case_expr3956 = new BitSet(new long[]{0x0000000000000000L,0x82801F3FFA59B1D0L,0x0000007AADE46004L});
    public static final BitSet FOLLOW_block_in_case_expr3958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_match_in_match_expr3979 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA413190L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_match_expr3981 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA413190L,0x00000002ADC46004L});
    public static final BitSet FOLLOW_p_op_expr_in_match_expr3984 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L,0x0000000000200000L});
    public static final BitSet FOLLOW_NL_in_match_expr3986 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L,0x0000000000200000L});
    public static final BitSet FOLLOW_full_cases_in_match_expr3989 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_L_end_in_match_expr3991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_try_in_try_expr4017 = new BitSet(new long[]{0x0000000000000000L,0x82001F3FFA59B1D0L,0x0000007AADE46004L});
    public static final BitSet FOLLOW_NL_in_try_expr4019 = new BitSet(new long[]{0x0000000000000000L,0x82001F3FFA59B1D0L,0x0000007AADE46004L});
    public static final BitSet FOLLOW_pure_block_in_try_expr4022 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_NL_in_try_expr4024 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_L_catch_in_try_expr4027 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L,0x0000000000200000L});
    public static final BitSet FOLLOW_NL_in_try_expr4029 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L,0x0000000000200000L});
    public static final BitSet FOLLOW_full_cases_in_try_expr4032 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_L_end_in_try_expr4034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROUND_BRACKET_OPEN_in_lambda_expr4058 = new BitSet(new long[]{0x0000000000000000L,0x0200002618420000L,0x00000002ADE06000L});
    public static final BitSet FOLLOW_NL_in_lambda_expr4060 = new BitSet(new long[]{0x0000000000000000L,0x0200002618420000L,0x00000002ADE06000L});
    public static final BitSet FOLLOW_lambda_cases_in_lambda_expr4063 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010200000L});
    public static final BitSet FOLLOW_NL_in_lambda_expr4065 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_ROUND_BRACKET_CLOSE_in_lambda_expr4068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_cases_nobrackets_in_lambda_expr_nobrackets4087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_lambda_cases_nobrackets4105 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200600L});
    public static final BitSet FOLLOW_NL_in_lambda_cases_nobrackets4107 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200600L});
    public static final BitSet FOLLOW_token_DOUBLE_ARROW_in_lambda_cases_nobrackets4110 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA413190L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_lambda_cases_nobrackets4112 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA413190L,0x00000002ADC46004L});
    public static final BitSet FOLLOW_lop_expr_in_lambda_cases_nobrackets4115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_case_in_lambda_case_expr4143 = new BitSet(new long[]{0x0000000000000000L,0x0200002618400000L,0x00000002ADE06000L});
    public static final BitSet FOLLOW_NL_in_lambda_case_expr4145 = new BitSet(new long[]{0x0000000000000000L,0x0200002618400000L,0x00000002ADC06000L});
    public static final BitSet FOLLOW_pattern_in_lambda_case_expr4148 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200600L});
    public static final BitSet FOLLOW_NL_in_lambda_case_expr4150 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200600L});
    public static final BitSet FOLLOW_token_DOUBLE_ARROW_in_lambda_case_expr4153 = new BitSet(new long[]{0x0000000000000000L,0x82001F3FFA59B1D0L,0x0000007AADE46004L});
    public static final BitSet FOLLOW_NL_in_lambda_case_expr4155 = new BitSet(new long[]{0x0000000000000000L,0x82001F3FFA59B1D0L,0x0000007AADE46004L});
    public static final BitSet FOLLOW_pure_block_in_lambda_case_expr4158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_lambda_cases4179 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200600L});
    public static final BitSet FOLLOW_NL_in_lambda_cases4181 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200600L});
    public static final BitSet FOLLOW_token_DOUBLE_ARROW_in_lambda_cases4184 = new BitSet(new long[]{0x0000000000000000L,0x82001F3FFA59B1D0L,0x0000007AADE46004L});
    public static final BitSet FOLLOW_NL_in_lambda_cases4186 = new BitSet(new long[]{0x0000000000000000L,0x82001F3FFA59B1D0L,0x0000007AADE46004L});
    public static final BitSet FOLLOW_pure_block_in_lambda_cases4189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_case_expr_in_lambda_cases4208 = new BitSet(new long[]{0x0000000000000002L,0x0200002618420000L,0x00000002ADE06000L});
    public static final BitSet FOLLOW_NL_in_lambda_cases4211 = new BitSet(new long[]{0x0000000000000000L,0x0200002618420000L,0x00000002ADE06000L});
    public static final BitSet FOLLOW_lambda_case_expr_in_lambda_cases4214 = new BitSet(new long[]{0x0000000000000002L,0x0200002618420000L,0x00000002ADE06000L});
    public static final BitSet FOLLOW_L_for_in_for_expr4232 = new BitSet(new long[]{0x0000000000000000L,0x0200002618400000L,0x00000002ADE06000L});
    public static final BitSet FOLLOW_NL_in_for_expr4234 = new BitSet(new long[]{0x0000000000000000L,0x0200002618400000L,0x00000002ADC06000L});
    public static final BitSet FOLLOW_pattern_in_for_expr4237 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L,0x0000000000200000L});
    public static final BitSet FOLLOW_NL_in_for_expr4239 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_L_in_in_for_expr4242 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA4131D0L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_for_expr4244 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA4131D0L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_protected_expr_in_for_expr4247 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L,0x0000000000200000L});
    public static final BitSet FOLLOW_NL_in_for_expr4249 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_L_do_in_for_expr4252 = new BitSet(new long[]{0x0000000000000000L,0x82801F3FFA59B1F0L,0x0000007AADE46004L});
    public static final BitSet FOLLOW_block_in_for_expr4254 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_L_end_in_for_expr4256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_builtin_primitive_in_op_expr4281 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA413190L,0x00000002ADC46004L});
    public static final BitSet FOLLOW_op_expr_in_op_expr4284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bool_expr_in_op_expr4289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_builtin_primitive_in_p_op_expr4299 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA413190L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_p_op_expr4302 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA413190L,0x00000002ADC46004L});
    public static final BitSet FOLLOW_p_op_expr_in_p_op_expr4306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_bool_expr_in_p_op_expr4311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_builtin_primitive0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bool_or_expr_in_bool_expr4355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_bool_or_expr_in_p_bool_expr4365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bool_and_expr_in_bool_or_expr4374 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L,0x0000000000200001L});
    public static final BitSet FOLLOW_NL_in_bool_or_expr4377 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L,0x0000000000200001L});
    public static final BitSet FOLLOW_token_OR_in_bool_or_expr4381 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA413190L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_bool_or_expr4384 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA413190L,0x00000002ADC46004L});
    public static final BitSet FOLLOW_bool_and_expr_in_bool_or_expr4388 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L,0x0000000000200001L});
    public static final BitSet FOLLOW_p_bool_and_expr_in_p_bool_or_expr4400 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L,0x0000000000200001L});
    public static final BitSet FOLLOW_NL_in_p_bool_or_expr4403 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L,0x0000000000200001L});
    public static final BitSet FOLLOW_token_OR_in_p_bool_or_expr4407 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA413190L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_p_bool_or_expr4410 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA413190L,0x00000002ADC46004L});
    public static final BitSet FOLLOW_p_bool_and_expr_in_p_bool_or_expr4414 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L,0x0000000000200001L});
    public static final BitSet FOLLOW_bool_not_expr_in_bool_and_expr4426 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L,0x0000000000200002L});
    public static final BitSet FOLLOW_NL_in_bool_and_expr4429 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000000000200002L});
    public static final BitSet FOLLOW_token_AND_in_bool_and_expr4433 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA413190L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_bool_and_expr4436 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA413190L,0x00000002ADC46004L});
    public static final BitSet FOLLOW_bool_not_expr_in_bool_and_expr4440 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L,0x0000000000200002L});
    public static final BitSet FOLLOW_p_bool_not_expr_in_p_bool_and_expr4452 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L,0x0000000000200002L});
    public static final BitSet FOLLOW_NL_in_p_bool_and_expr4455 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000000000200002L});
    public static final BitSet FOLLOW_token_AND_in_p_bool_and_expr4459 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA413190L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_p_bool_and_expr4462 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA413190L,0x00000002ADC46004L});
    public static final BitSet FOLLOW_p_bool_not_expr_in_p_bool_and_expr4466 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L,0x0000000000200002L});
    public static final BitSet FOLLOW_token_NOT_in_bool_not_expr4478 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA413190L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_bool_not_expr4481 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA413190L,0x00000002ADC46004L});
    public static final BitSet FOLLOW_bool_not_expr_in_bool_not_expr4485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rel_expr_in_bool_not_expr4490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_NOT_in_p_bool_not_expr4501 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA413190L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_p_bool_not_expr4504 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA413190L,0x00000002ADC46004L});
    public static final BitSet FOLLOW_p_bool_not_expr_in_p_bool_not_expr4508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_rel_expr_in_p_bool_not_expr4513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arith_expr_in_rel_expr4522 = new BitSet(new long[]{0x0000000000000002L,0x007FE00000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_NL_in_rel_expr4525 = new BitSet(new long[]{0x0000000000000000L,0x007FE00000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_rel_op_in_rel_expr4528 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA413190L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_rel_expr4530 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA413190L,0x00000002ADC46004L});
    public static final BitSet FOLLOW_arith_expr_in_rel_expr4533 = new BitSet(new long[]{0x0000000000000002L,0x007FE00000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_p_arith_expr_in_p_rel_expr4560 = new BitSet(new long[]{0x0000000000000002L,0x007FE00000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_NL_in_p_rel_expr4563 = new BitSet(new long[]{0x0000000000000000L,0x007FE00000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_rel_op_in_p_rel_expr4566 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA413190L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_p_rel_expr4568 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA413190L,0x00000002ADC46004L});
    public static final BitSet FOLLOW_p_arith_expr_in_p_rel_expr4571 = new BitSet(new long[]{0x0000000000000002L,0x007FE00000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_token_EQUAL_in_rel_op4597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_NOT_EQUAL_in_rel_op4601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATER_in_rel_op4605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_GREATER_EQ_in_rel_op4609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_in_rel_op4613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_LESS_EQ_in_rel_op4617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_plusplus_expr_in_arith_expr4629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_plusplus_expr_in_p_arith_expr4639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timestimes_expr_in_plusplus_expr4649 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000200180L});
    public static final BitSet FOLLOW_NL_in_plusplus_expr4652 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000180L});
    public static final BitSet FOLLOW_PLUSPLUS_in_plusplus_expr4657 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA413190L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_MINUSMINUS_in_plusplus_expr4660 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA413190L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_plusplus_expr4664 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA413190L,0x00000002ADC46004L});
    public static final BitSet FOLLOW_timestimes_expr_in_plusplus_expr4668 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000200180L});
    public static final BitSet FOLLOW_p_timestimes_expr_in_p_plusplus_expr4680 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000200180L});
    public static final BitSet FOLLOW_NL_in_p_plusplus_expr4683 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000180L});
    public static final BitSet FOLLOW_PLUSPLUS_in_p_plusplus_expr4688 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA413190L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_MINUSMINUS_in_p_plusplus_expr4691 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA413190L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_p_plusplus_expr4695 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA413190L,0x00000002ADC46004L});
    public static final BitSet FOLLOW_p_timestimes_expr_in_p_plusplus_expr4699 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000200180L});
    public static final BitSet FOLLOW_simple_expr_in_timestimes_expr4711 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000200060L});
    public static final BitSet FOLLOW_NL_in_timestimes_expr4714 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_TIMESTIMES_in_timestimes_expr4719 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA413190L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_QUOTIENTQUOTIENT_in_timestimes_expr4722 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA413190L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_timestimes_expr4726 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA413190L,0x00000002ADC46004L});
    public static final BitSet FOLLOW_simple_expr_in_timestimes_expr4730 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000200060L});
    public static final BitSet FOLLOW_p_simple_expr_in_p_timestimes_expr4743 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000200060L});
    public static final BitSet FOLLOW_NL_in_p_timestimes_expr4746 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_TIMESTIMES_in_p_timestimes_expr4751 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA413190L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_QUOTIENTQUOTIENT_in_p_timestimes_expr4754 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA413190L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_p_timestimes_expr4758 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA413190L,0x00000002ADC46004L});
    public static final BitSet FOLLOW_p_simple_expr_in_p_timestimes_expr4762 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000200060L});
    public static final BitSet FOLLOW_cons_expr_in_simple_expr4773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_cons_expr_in_p_simple_expr4782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_to_expr_in_cons_expr4791 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000200018L});
    public static final BitSet FOLLOW_NL_in_cons_expr4794 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200018L});
    public static final BitSet FOLLOW_token_DOUBLE_COLON_in_cons_expr4797 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA413190L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_cons_expr4799 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA413190L,0x00000002ADC46004L});
    public static final BitSet FOLLOW_to_expr_in_cons_expr4802 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000200018L});
    public static final BitSet FOLLOW_p_to_expr_in_p_cons_expr4822 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000200018L});
    public static final BitSet FOLLOW_NL_in_p_cons_expr4825 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200018L});
    public static final BitSet FOLLOW_token_DOUBLE_COLON_in_p_cons_expr4828 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA413190L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_p_cons_expr4830 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA413190L,0x00000002ADC46004L});
    public static final BitSet FOLLOW_p_to_expr_in_p_cons_expr4833 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000200018L});
    public static final BitSet FOLLOW_arith_plus_expr_in_to_expr4853 = new BitSet(new long[]{0x0000000000000002L,0x0000000001800000L,0x0000000000200000L});
    public static final BitSet FOLLOW_NL_in_to_expr4856 = new BitSet(new long[]{0x0000000000000000L,0x0000000001800000L});
    public static final BitSet FOLLOW_L_to_in_to_expr4861 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA413190L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_L_downto_in_to_expr4865 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA413190L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_to_expr4869 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA413190L,0x00000002ADC46004L});
    public static final BitSet FOLLOW_arith_plus_expr_in_to_expr4873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_arith_plus_expr_in_p_to_expr4886 = new BitSet(new long[]{0x0000000000000002L,0x0000000001800000L,0x0000000000200000L});
    public static final BitSet FOLLOW_NL_in_p_to_expr4889 = new BitSet(new long[]{0x0000000000000000L,0x0000000001800000L});
    public static final BitSet FOLLOW_L_to_in_p_to_expr4894 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA413190L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_L_downto_in_p_to_expr4898 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA413190L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_p_to_expr4902 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA413190L,0x00000002ADC46004L});
    public static final BitSet FOLLOW_p_arith_plus_expr_in_p_to_expr4906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arith_uminus_expr_in_arith_plus_expr4918 = new BitSet(new long[]{0x0000000000000002L,0x0300000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_NL_in_arith_plus_expr4922 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_PLUS_in_arith_plus_expr4926 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA413190L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_MINUS_in_arith_plus_expr4931 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA413190L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_arith_plus_expr4935 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA413190L,0x00000002ADC46004L});
    public static final BitSet FOLLOW_arith_uminus_expr_in_arith_plus_expr4939 = new BitSet(new long[]{0x0000000000000002L,0x0300000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_p_arith_uminus_expr_in_p_arith_plus_expr4950 = new BitSet(new long[]{0x0000000000000002L,0x0300000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_NL_in_p_arith_plus_expr4953 = new BitSet(new long[]{0x0000000000000000L,0x0300000000000000L});
    public static final BitSet FOLLOW_set_in_p_arith_plus_expr4957 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA413190L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_p_arith_plus_expr4966 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA413190L,0x00000002ADC46004L});
    public static final BitSet FOLLOW_p_arith_uminus_expr_in_p_arith_plus_expr4970 = new BitSet(new long[]{0x0000000000000002L,0x0300000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_MINUS_in_arith_uminus_expr4983 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA413190L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_arith_uminus_expr4985 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA413190L,0x00000002ADC46004L});
    public static final BitSet FOLLOW_arith_mult_expr_in_arith_uminus_expr4988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arith_mult_expr_in_arith_uminus_expr5001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_p_arith_uminus_expr5012 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA413190L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_p_arith_uminus_expr5014 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA413190L,0x00000002ADC46004L});
    public static final BitSet FOLLOW_p_arith_mult_expr_in_p_arith_uminus_expr5017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_arith_mult_expr_in_p_arith_uminus_expr5030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arith_pow_expr_in_arith_mult_expr5039 = new BitSet(new long[]{0x0000000000000002L,0x0C0000C000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_NL_in_arith_mult_expr5042 = new BitSet(new long[]{0x0000000000000000L,0x0C0000C000000000L});
    public static final BitSet FOLLOW_set_in_arith_mult_expr5046 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA413190L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_arith_mult_expr5063 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA413190L,0x00000002ADC46004L});
    public static final BitSet FOLLOW_arith_pow_expr_in_arith_mult_expr5067 = new BitSet(new long[]{0x0000000000000002L,0x0C0000C000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_p_arith_pow_expr_in_p_arith_mult_expr5079 = new BitSet(new long[]{0x0000000000000002L,0x0C0000C000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_NL_in_p_arith_mult_expr5082 = new BitSet(new long[]{0x0000000000000000L,0x0C0000C000000000L});
    public static final BitSet FOLLOW_set_in_p_arith_mult_expr5086 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA413190L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_p_arith_mult_expr5103 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA413190L,0x00000002ADC46004L});
    public static final BitSet FOLLOW_p_arith_pow_expr_in_p_arith_mult_expr5107 = new BitSet(new long[]{0x0000000000000002L,0x0C0000C000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_apply_expr_in_arith_pow_expr5118 = new BitSet(new long[]{0x0000000000000002L,0x1000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_NL_in_arith_pow_expr5121 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_POW_tok_in_arith_pow_expr5124 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA413190L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_arith_pow_expr5126 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA413190L,0x00000002ADC46004L});
    public static final BitSet FOLLOW_apply_expr_in_arith_pow_expr5129 = new BitSet(new long[]{0x0000000000000002L,0x1000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_p_apply_expr_in_p_arith_pow_expr5150 = new BitSet(new long[]{0x0000000000000002L,0x1000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_NL_in_p_arith_pow_expr5153 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_POW_tok_in_p_arith_pow_expr5156 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA413190L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_p_arith_pow_expr5158 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA413190L,0x00000002ADC46004L});
    public static final BitSet FOLLOW_p_apply_expr_in_p_arith_pow_expr5161 = new BitSet(new long[]{0x0000000000000002L,0x1000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_basic_expr_in_apply_expr5182 = new BitSet(new long[]{0x0000000000000002L,0x8200043EFA413190L,0x00000002ADC46004L});
    public static final BitSet FOLLOW_p_basic_expr_in_p_apply_expr5200 = new BitSet(new long[]{0x0000000000000002L,0x8200043EFA413190L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_p_apply_expr5203 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA413190L,0x00000002ADC46004L});
    public static final BitSet FOLLOW_p_basic_expr_in_p_apply_expr5206 = new BitSet(new long[]{0x0000000000000002L,0x8200043EFA413190L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_message_send_expr_in_basic_expr5226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_message_send_expr_in_p_basic_expr5235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitive_expr_in_message_send_expr5244 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000210000L});
    public static final BitSet FOLLOW_NL_in_message_send_expr5247 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_PERIOD_in_message_send_expr5250 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000A00000L});
    public static final BitSet FOLLOW_NL_in_message_send_expr5252 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_Id_in_message_send_expr5255 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000210000L});
    public static final BitSet FOLLOW_SQUARE_BRACKET_OPEN_in_list_expr5279 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA4131D0L,0x00000002EDE46004L});
    public static final BitSet FOLLOW_NL_in_list_expr5281 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA4131D0L,0x00000002EDE46004L});
    public static final BitSet FOLLOW_protected_expr_nc_in_list_expr5285 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040208000L});
    public static final BitSet FOLLOW_NL_in_list_expr5288 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_COMMA_in_list_expr5291 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA4131D0L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_list_expr5293 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA4131D0L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_protected_expr_nc_in_list_expr5296 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040208000L});
    public static final BitSet FOLLOW_NL_in_list_expr5300 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_SQUARE_BRACKET_CLOSE_in_list_expr5305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROUND_BRACKET_OPEN_in_list_expr5319 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA4131D0L,0x00000002BDE46004L});
    public static final BitSet FOLLOW_NL_in_list_expr5321 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA4131D0L,0x00000002BDE46004L});
    public static final BitSet FOLLOW_protected_expr_nc_in_list_expr5325 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010208000L});
    public static final BitSet FOLLOW_NL_in_list_expr5328 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_COMMA_in_list_expr5331 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA4131D0L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_list_expr5333 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA4131D0L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_protected_expr_nc_in_list_expr5336 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010208000L});
    public static final BitSet FOLLOW_NL_in_list_expr5340 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010008000L});
    public static final BitSet FOLLOW_COMMA_in_list_expr5344 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010200000L});
    public static final BitSet FOLLOW_NL_in_list_expr5346 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_ROUND_BRACKET_CLOSE_in_list_expr5353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURLY_BRACKET_OPEN_in_map_or_set_expr5382 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA4131D0L,0x00000003ADE46004L});
    public static final BitSet FOLLOW_NL_in_map_or_set_expr5384 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA4131D0L,0x00000003ADE46004L});
    public static final BitSet FOLLOW_map_or_set_elem_expr_in_map_or_set_expr5388 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100208000L});
    public static final BitSet FOLLOW_NL_in_map_or_set_expr5390 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100008000L});
    public static final BitSet FOLLOW_COMMA_in_map_or_set_expr5394 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA4131D0L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_map_or_set_expr5396 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA4131D0L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_map_or_set_elem_expr_in_map_or_set_expr5399 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100208000L});
    public static final BitSet FOLLOW_NL_in_map_or_set_expr5401 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100008000L});
    public static final BitSet FOLLOW_CURLY_BRACKET_CLOSE_in_map_or_set_expr5408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURLY_BRACKET_OPEN_in_map_or_set_expr5428 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000201800L});
    public static final BitSet FOLLOW_NL_in_map_or_set_expr5430 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_token_ARROW_in_map_or_set_expr5433 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100200000L});
    public static final BitSet FOLLOW_NL_in_map_or_set_expr5435 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_CURLY_BRACKET_CLOSE_in_map_or_set_expr5438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protected_expr_nc_in_map_or_set_elem_expr5455 = new BitSet(new long[]{0x0000000200000002L,0x0000000000000000L,0x0000000000201800L});
    public static final BitSet FOLLOW_NL_in_map_or_set_elem_expr5458 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000000L,0x0000000000201800L});
    public static final BitSet FOLLOW_arrow_or_assign_in_map_or_set_elem_expr5461 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA4131D0L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_map_or_set_elem_expr5463 = new BitSet(new long[]{0x0000000000000000L,0x8200043EFA4131D0L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_protected_expr_nc_in_map_or_set_elem_expr5466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROUND_BRACKET_OPEN_in_type_expr5493 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400200000L});
    public static final BitSet FOLLOW_NL_in_type_expr5495 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_COLON_in_type_expr5498 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000A00000L});
    public static final BitSet FOLLOW_NL_in_type_expr5500 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_typeid_in_type_expr5503 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010200000L});
    public static final BitSet FOLLOW_NL_in_type_expr5505 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_ROUND_BRACKET_CLOSE_in_type_expr5508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Num_in_primitive_expr5525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_String_in_primitive_expr5530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Id_in_primitive_expr5535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Constr_in_primitive_expr5540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_true_in_primitive_expr5545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_false_in_primitive_expr5550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_this_in_primitive_expr5555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_nil_in_primitive_expr5561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_expr_in_primitive_expr5566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_infinity_in_primitive_expr5571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_list_expr_in_primitive_expr5577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_with_control_expr_in_primitive_expr5582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_map_or_set_expr_in_primitive_expr5587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Id_in_synpred1_babel171880 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L,0x0000000000200000L});
    public static final BitSet FOLLOW_NL_in_synpred1_babel171882 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_L_as_in_synpred1_babel171885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protected_expr_in_synpred2_babel171916 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000220000L});
    public static final BitSet FOLLOW_NL_in_synpred2_babel171918 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_QUESTION_MARK_in_synpred2_babel171921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Id_in_synpred3_babel171959 = new BitSet(new long[]{0x0000000000000000L,0x0200002618400000L,0x00000002ADC06000L});
    public static final BitSet FOLLOW_pattern_in_synpred3_babel171961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_synpred4_babel172050 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L,0x0000000000200000L});
    public static final BitSet FOLLOW_NL_in_synpred4_babel172052 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_L_if_in_synpred4_babel172055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_synpred5_babel172086 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400200000L});
    public static final BitSet FOLLOW_NL_in_synpred5_babel172088 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_COLON_in_synpred5_babel172091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_defpattern_in_synpred6_babel172903 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_NL_in_synpred6_babel172905 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ASSIGN_in_synpred6_babel172908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_synpred7_babel173402 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_objelem_assign_in_synpred7_babel173406 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_NL_in_synpred7_babel173409 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ASSIGN_in_synpred7_babel173412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_obj_in_synpred8_babel173641 = new BitSet(new long[]{0x0000000000000000L,0x0500000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_NL_in_synpred8_babel173643 = new BitSet(new long[]{0x0000000000000000L,0x0500000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_parents_in_synpred8_babel173646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_expr_in_synpred9_babel173715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_expr_nobrackets_in_synpred10_babel173726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_expr_in_synpred11_babel173747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_expr_nobrackets_in_synpred12_babel173758 = new BitSet(new long[]{0x0000000000000002L});

}